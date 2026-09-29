package in.juspay.hypersdk.analytics;

import android.util.Log;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimerTask;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LogPusher {
    private static final String TAG = "LogPusher";
    private JSONObject channelsFromSdkConfig;
    private final LogConfig logConfig;
    private final Workspace workspace;
    private int logFlushTimerTaskErrorCounter = 0;
    private int setHeaderParametersErrorCounter = 0;
    private boolean isSandboxEnv = false;
    private boolean stopPushingLogs = false;
    private final Map<String, LogChannel> channels = new HashMap();
    private final JSONArray logChannelsConfig = new JSONArray();

    static class IterableJSONArray implements Iterable<JSONObject> {
        JSONArray original;

        IterableJSONArray(JSONArray jSONArray) {
            this.original = jSONArray;
        }

        @Override // java.lang.Iterable
        public Iterator<JSONObject> iterator() {
            return new Iterator<JSONObject>() { // from class: in.juspay.hypersdk.analytics.LogPusher.IterableJSONArray.1
                int curr = 0;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.curr < IterableJSONArray.this.original.length();
                }

                @Override // java.util.Iterator
                public void remove() {
                }

                @Override // java.util.Iterator
                public JSONObject next() {
                    try {
                        JSONArray jSONArray = IterableJSONArray.this.original;
                        int i = this.curr;
                        this.curr = i + 1;
                        return jSONArray.optJSONObject(i);
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return null;
                    }
                }
            };
        }
    }

    class LogPushTimerTask extends TimerTask {
        private static final String TAG = "LogPushTimerTask";
        private final Map<String, LogChannel> channels;
        private int getLogsToPushErrorCounter;
        private boolean isExceptionTracked;
        private final LogConfig logConfig;
        private final AtomicInteger logPushIteration;
        private int logPushTimerTaskErrorCounter;
        private final Workspace workspace;

        private void acknowledgeLogsPushed(int i, LogChannel logChannel) {
            while (i > 0) {
                try {
                    logChannel.pollLogsQueue();
                    i--;
                } catch (Exception e) {
                    this.logPushTimerTaskErrorCounter++;
                    if (this.logPushTimerTaskErrorCounter <= 2) {
                        SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception in removal of logs from persisted Queue file", e);
                        return;
                    } else {
                        JuspayLogger.e(TAG, "Exception in removal of logs from persisted Queue file", e);
                        return;
                    }
                }
            }
        }

        private JSONArray getLogsToPush(LogChannel logChannel) {
            JSONArray jSONArray = new JSONArray();
            Iterator<byte[]> it = logChannel.getLogsQueue().iterator();
            while (true) {
                if ((logChannel.getBatchCount() != -1 && jSONArray.length() >= logChannel.getBatchCount()) || !it.hasNext()) {
                    break;
                }
                try {
                    jSONArray.put(new JSONObject(new String(it.next())));
                } catch (JSONException e) {
                    it.remove();
                    int i = this.getLogsToPushErrorCounter + 1;
                    this.getLogsToPushErrorCounter = i;
                    if (i <= 2) {
                        SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Bad JSON while reading the Persisted Queue for Logs", e);
                    } else {
                        JuspayLogger.e(TAG, "Bad JSON while reading the Persisted Queue for Logs", e);
                    }
                }
            }
            return jSONArray;
        }

        private void pushAllLogsUtil(LogChannel logChannel, String str) {
            int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE.concat(String.valueOf(str)), this.workspace);
            int fromSharedPreference2 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE.concat(String.valueOf(str)), this.workspace);
            if (JuspayCoreLib.getApplicationContext() != null && (fromSharedPreference2 - fromSharedPreference) + 1 > this.logConfig.maxFilesAllowed) {
                while ((fromSharedPreference2 - fromSharedPreference) + 1 > this.logConfig.numFilesToLeaveIfMaxFilesExceeded) {
                    Workspace workspace = this.workspace;
                    StringBuilder sb = new StringBuilder(LogConstants.PERSISTENT_LOGS_FILE);
                    sb.append(str);
                    sb.append(fromSharedPreference);
                    sb.append(".dat");
                    File fileOpenInCache = workspace.openInCache(sb.toString());
                    if (fileOpenInCache != null) {
                        try {
                            fileOpenInCache.delete();
                        } catch (Exception unused) {
                        }
                    }
                    fromSharedPreference++;
                }
                this.workspace.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE.concat(String.valueOf(str)), String.valueOf(fromSharedPreference));
            }
            while (!logChannel.getLogsQueue().isEmpty()) {
                try {
                    JSONArray logsToPush = getLogsToPush(logChannel);
                    if (logsToPush.length() > 0) {
                        int iPushLogsToServer = LogPusher.this.pushLogsToServer(logsToPush, logChannel);
                        if (iPushLogsToServer != 200 && (logChannel.getRetryAttempts() == -1 || logChannel.getCurrentBatchRetryAttempts() < logChannel.getRetryAttempts())) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iPushLogsToServer);
                            SdkTracker.trackBootAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.LOG_PUSHER, "error_response", sb2.toString());
                            logChannel.setCurrentBatchRetryAttempts(logChannel.getCurrentBatchRetryAttempts() + 1);
                            return;
                        }
                        logChannel.setCurrentBatchRetryAttempts(0);
                        acknowledgeLogsPushed(logsToPush.length(), logChannel);
                    }
                } catch (Exception e) {
                    if (!this.isExceptionTracked) {
                        SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Error while creating the payload to post", e);
                    }
                    this.isExceptionTracked = true;
                }
            }
            int fromSharedPreference3 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE.concat(String.valueOf(str)), this.workspace);
            if (JuspayCoreLib.getApplicationContext() != null) {
                for (int fromSharedPreference4 = LogUtils.getFromSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE.concat(String.valueOf(str)), this.workspace); fromSharedPreference4 <= fromSharedPreference3; fromSharedPreference4++) {
                    Workspace workspace2 = this.workspace;
                    StringBuilder sb3 = new StringBuilder(LogConstants.PERSISTENT_LOGS_FILE);
                    sb3.append(str);
                    sb3.append(fromSharedPreference4);
                    sb3.append(".dat");
                    workspace2.openInCache(sb3.toString()).delete();
                }
            }
            this.workspace.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_READING_FILE.concat(String.valueOf(str)), SessionDescription.SUPPORTED_SDP_VERSION);
            this.workspace.writeToSharedPreference(LogConstants.PERSISTENT_LOGS_WRITING_FILE.concat(String.valueOf(str)), SessionDescription.SUPPORTED_SDP_VERSION);
        }

        /* JADX INFO: renamed from: lambda$pushAllLogs$0$in-juspay-hypersdk-analytics-LogPusher$LogPushTimerTask, reason: not valid java name */
        /* synthetic */ void m253lambda$pushAllLogs$0$injuspayhypersdkanalyticsLogPusher$LogPushTimerTask() {
            for (Map.Entry<String, LogChannel> entry : this.channels.entrySet()) {
                pushAllLogsUtil(entry.getValue(), entry.getKey());
            }
        }

        /* JADX INFO: renamed from: lambda$run$1$in-juspay-hypersdk-analytics-LogPusher$LogPushTimerTask, reason: not valid java name */
        /* synthetic */ void m254lambda$run$1$injuspayhypersdkanalyticsLogPusher$LogPushTimerTask() {
            LogConfig logConfig = this.logConfig;
            if (logConfig.shouldPush && LogUtils.isMinMemoryAvailable(logConfig).booleanValue()) {
                int andIncrement = this.logPushIteration.getAndIncrement();
                for (Map.Entry<String, LogChannel> entry : this.channels.entrySet()) {
                    LogChannel value = entry.getValue();
                    String key = entry.getKey();
                    if (andIncrement % value.getPriority() == 0) {
                        pushAllLogsUtil(value, key);
                    }
                }
            }
        }

        void pushAllLogs() {
            ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m253lambda$pushAllLogs$0$injuspayhypersdkanalyticsLogPusher$LogPushTimerTask();
                }
            });
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$LogPushTimerTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m254lambda$run$1$injuspayhypersdkanalyticsLogPusher$LogPushTimerTask();
                }
            });
        }

        private LogPushTimerTask(Workspace workspace, LogConfig logConfig, Map<String, LogChannel> map) {
            this.isExceptionTracked = false;
            this.logPushIteration = new AtomicInteger(1);
            this.getLogsToPushErrorCounter = 0;
            this.logPushTimerTaskErrorCounter = 0;
            this.workspace = workspace;
            this.logConfig = logConfig;
            this.channels = map;
        }
    }

    LogPusher(Workspace workspace, LogConfig logConfig) {
        this.channelsFromSdkConfig = new JSONObject();
        this.workspace = workspace;
        this.logConfig = logConfig;
        this.channelsFromSdkConfig = logConfig.channels;
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.loadSavedChannels();
            }
        });
    }

    private boolean addChannel(String str, int i, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i2, String str4, String str5) {
        boolean zContainsKey = this.channels.containsKey(str);
        LogChannel logChannelMakeChannel = makeChannel(str, i, j, str2, str3, jSONObject, jSONObject2, map, i2, str4, str5);
        this.channels.put(str, logChannelMakeChannel);
        if (!zContainsKey) {
            String fromSharedPreference = this.workspace.getFromSharedPreference(LogConstants.LOG_CHANNEL_NAMES, "");
            StringBuilder sb = new StringBuilder();
            sb.append(fromSharedPreference);
            sb.append(fromSharedPreference.length() != 0 ? "," : "");
            sb.append(str);
            this.workspace.writeToSharedPreference(LogConstants.LOG_CHANNEL_NAMES, sb.toString());
        }
        this.workspace.writeToSharedPreference("LOG_CHANNEL_INFO_".concat(String.valueOf(str)), logChannelMakeChannel.toString());
        return true;
    }

    private String getEndPoint(LogChannel logChannel) {
        return this.isSandboxEnv ? logChannel.getEndpointSBX() : logChannel.getEndPointProd();
    }

    private JSONArray getLogChannels(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        if (jSONObject.has("channels")) {
            jSONArray = jSONObject.optJSONArray("channels");
        }
        if ((jSONArray == null || jSONArray.length() == 0) && jSONObject.has("channel")) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObject.optString("channel", LogConstants.DEFAULT_CHANNEL));
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = this.logConfig.defaultChannels != null ? new JSONArray(this.logConfig.defaultChannels.toString()) : new JSONArray();
        jSONArray2.put(LogConstants.DEFAULT_CHANNEL);
        return jSONArray2;
    }

    private RSAPublicKey getLogEncryptionKey(LogChannel logChannel) {
        try {
            return JOSEUtils.JWKtoRSAPublicKey(this.isSandboxEnv ? logChannel.getKeySBX() : logChannel.getKeyProd());
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getLogEncryptionLevel(LogChannel logChannel) {
        return logChannel.getEncryptionLevel();
    }

    private List<String> getSNRanges(JSONArray jSONArray) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                int i2 = jSONArray.getJSONObject(i).getInt("sn");
                if (treeSet.contains(Integer.valueOf(i2))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Duplicate SN in logs: ");
                    sb.append(i2);
                    JuspayLogger.w(TAG, sb.toString());
                }
                treeSet.add(Integer.valueOf(i2));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!treeSet.isEmpty()) {
            int iIntValue = ((Integer) treeSet.first()).intValue();
            Iterator it = treeSet.tailSet(Integer.valueOf(((Integer) treeSet.first()).intValue() + 1)).iterator();
            int i3 = iIntValue;
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (i3 + 1 != iIntValue2) {
                    arrayList.add(String.format("%s-%s", Integer.valueOf(iIntValue), Integer.valueOf(i3)));
                    iIntValue = iIntValue2;
                }
                i3 = iIntValue2;
            }
            arrayList.add(String.format("%s-%s", Integer.valueOf(iIntValue), Integer.valueOf(i3)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSavedChannels() {
        JSONObject jSONObject;
        String[] strArr;
        int i;
        String str;
        int i2;
        int i3;
        LogChannel logChannelMakeChannel;
        if (this.logConfig.shouldPush) {
            JSONObject jSONObject2 = this.channelsFromSdkConfig;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        addChannelFromJS(this.channelsFromSdkConfig.get(next).toString(), next);
                    } catch (JSONException e) {
                        JuspayLogger.e(TAG, Log.getStackTraceString(e));
                    }
                }
            }
            if (this.logChannelsConfig != null) {
                for (int i4 = 0; i4 < this.logChannelsConfig.length(); i4++) {
                    try {
                        JSONObject jSONObject3 = this.logChannelsConfig.getJSONObject(i4);
                        addChannelFromJS(jSONObject3.toString(), jSONObject3.getString("channel"));
                    } catch (JSONException unused) {
                    }
                }
            }
            String[] strArrSplit = this.workspace.getFromSharedPreference(LogConstants.LOG_CHANNEL_NAMES, "").split(",");
            this.workspace.writeToSharedPreference(LogConstants.LOG_CHANNEL_NAMES, "");
            LogConfig logConfig = this.logConfig;
            int i5 = logConfig.maxRetryPerBatch;
            long j = logConfig.maxLogsPerPush;
            String str2 = logConfig.prodLogUrl;
            String str3 = logConfig.sandboxLogUrl;
            JSONObject jSONObject4 = logConfig.publicKey;
            JSONObject jSONObject5 = logConfig.publicKeySandbox;
            HashMap map = new HashMap();
            LogConfig logConfig2 = this.logConfig;
            addChannel(LogConstants.DEFAULT_CHANNEL, i5, j, str2, str3, jSONObject4, jSONObject5, map, logConfig2.defaultPriority, "all", logConfig2.encryptionLevel);
            LogChannel channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
            int length = strArrSplit.length;
            int i6 = 0;
            while (i6 < length) {
                String str4 = strArrSplit[i6];
                String fromSharedPreference = this.workspace.getFromSharedPreference("LOG_CHANNEL_INFO_".concat(String.valueOf(str4)), "");
                if (!this.channels.containsKey(str4)) {
                    this.workspace.removeFromSharedPreference("LOG_CHANNEL_INFO_".concat(String.valueOf(str4)));
                }
                if (fromSharedPreference.length() != 0) {
                    try {
                        jSONObject = new JSONObject(fromSharedPreference);
                        strArr = strArrSplit;
                    } catch (JSONException unused2) {
                        strArr = strArrSplit;
                    }
                    try {
                        i = i6;
                    } catch (JSONException unused3) {
                        str = str4;
                        i2 = i6;
                    }
                    try {
                        int i7 = length;
                        try {
                            str = str4;
                            i2 = i;
                            i3 = i7;
                        } catch (JSONException unused4) {
                            str = str4;
                            i2 = i;
                            i3 = i7;
                        }
                        try {
                            logChannelMakeChannel = makeChannel(str4, jSONObject.optInt("retryAttempts", this.logConfig.maxRetryPerBatch), jSONObject.optLong("batchCount", this.logConfig.maxLogsPerPush), jSONObject.optString("logsUrlKey", this.logConfig.prodLogUrl), jSONObject.optString("logsUrlKeySandbox", this.logConfig.sandboxLogUrl), jSONObject.getJSONObject("publicKey"), jSONObject.getJSONObject("publicKeySandbox"), LogUtils.toMap(new JSONObject(jSONObject.getString("headers"))), jSONObject.optInt("priority", this.logConfig.defaultPriority), jSONObject.optString("environment", "all"), jSONObject.optString("encryptionLevel", this.logConfig.encryptionLevel));
                        } catch (JSONException unused5) {
                            logChannelMakeChannel = null;
                        }
                    } catch (JSONException unused6) {
                        str = str4;
                        i2 = i;
                        i3 = length;
                    }
                } else {
                    strArr = strArrSplit;
                    str = str4;
                    i2 = i6;
                    i3 = length;
                    logChannelMakeChannel = null;
                }
                if (logChannelMakeChannel == null) {
                    LogConfig logConfig3 = this.logConfig;
                    logChannelMakeChannel = makeChannel(str, logConfig3.maxRetryPerBatch, logConfig3.maxLogsPerPush, logConfig3.prodLogUrl, logConfig3.sandboxLogUrl, channelObject.getKeyProd(), channelObject.getKeySBX(), channelObject.getHeaders(), 1, "all", this.logConfig.encryptionLevel);
                }
                pushOldChannelLogs(logChannelMakeChannel);
                i6 = i2 + 1;
                strArrSplit = strArr;
                length = i3;
            }
            LogConfig logConfig4 = this.logConfig;
            pushOldChannelLogs(makeChannel("", logConfig4.maxRetryPerBatch, logConfig4.maxLogsPerPush, logConfig4.prodLogUrl, logConfig4.sandboxLogUrl, channelObject.getKeyProd(), channelObject.getKeySBX(), channelObject.getHeaders(), 1, "all", this.logConfig.encryptionLevel));
        }
    }

    private LogChannel makeChannel(String str, int i, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i2, String str4, String str5) {
        return new LogChannel(i, j, str, str2, str3, jSONObject, jSONObject2, map, i2, str4, str5);
    }

    private void pushAllFiles(int i, int i2, LogChannel logChannel) {
        while (i <= i2) {
            Workspace workspace = this.workspace;
            StringBuilder sb = new StringBuilder(LogConstants.PERSISTENT_LOGS_FILE);
            sb.append(logChannel.getChannelName());
            sb.append(i);
            sb.append(".dat");
            File fileOpenInCache = workspace.openInCache(sb.toString());
            if (fileOpenInCache != null) {
                if (fileOpenInCache.exists() && LogUtils.isFileEligibleToPush(fileOpenInCache, this.logConfig)) {
                    pushFileContentToServer(fileOpenInCache, logChannel);
                } else {
                    fileOpenInCache.delete();
                }
            }
            i++;
        }
        if (JuspayCoreLib.getApplicationContext() != null) {
            LogChannel channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
            File fileOpenInCache2 = this.workspace.openInCache(LogConstants.CRASH_LOGS_FILE);
            if (fileOpenInCache2.exists() && LogUtils.isFileEligibleToPush(fileOpenInCache2, this.logConfig)) {
                pushFileContentToServer(fileOpenInCache2, channelObject);
            } else {
                fileOpenInCache2.delete();
            }
        }
    }

    private void pushFileContentToServer(File file, LogChannel logChannel) {
        if (file != null) {
            Queue<JSONObject> logsFromFile = LogUtils.getLogsFromFile(file);
            try {
                JSONArray jSONArray = new JSONArray();
                boolean z = true;
                while (logsFromFile.size() > 0) {
                    while (true) {
                        if ((logChannel.getBatchCount() != -1 && jSONArray.length() >= logChannel.getBatchCount()) || logsFromFile.size() <= 0) {
                            break;
                        } else {
                            jSONArray.put(logsFromFile.poll());
                        }
                    }
                    if (pushLogsToServer(jSONArray, logChannel) != 200) {
                        z = false;
                    }
                    jSONArray = new JSONArray();
                }
                if (z) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int pushLogsToServer(JSONArray jSONArray, LogChannel logChannel) throws JSONException, IOException {
        JuspayHttpsResponse juspayHttpsResponse;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", jSONArray);
        byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        String logEncryptionLevel = getLogEncryptionLevel(logChannel);
        RSAPublicKey logEncryptionKey = getLogEncryptionKey(logChannel);
        NetUtils netUtils = new NetUtils(10000, 10000);
        Map<String, String> headers = logChannel.getHeaders();
        if (JuspayCoreLib.isAppDebuggable()) {
            headers.put("x-jp-sn-ranges", String.join(",", getSNRanges(jSONArray)));
        }
        headers.put("x-logscount", String.valueOf(jSONArray.length()));
        headers.put("channel", logChannel.getChannelName());
        if ("encryption".equals(logEncryptionLevel) && logEncryptionKey != null) {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), EncryptionHelper.gzipThenEncrypt(bytes, logEncryptionKey), "application/x-godel-gzip-pubkey-encrypted", headers, new JSONObject(), null));
        } else if ("gzip".equals(logEncryptionLevel)) {
            byte[] bArrGzipContent = Utils.gzipContent(bytes);
            headers.put(RtspHeaders.CONTENT_ENCODING, "gzip");
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), bArrGzipContent, "application/gzip", headers, new JSONObject(), null));
        } else {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(getEndPoint(logChannel)), bytes, "application/json", headers, new JSONObject(), null));
        }
        return juspayHttpsResponse.responseCode;
    }

    public boolean addChannelFromJS(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return addChannel(str2, jSONObject.optInt("retryAttempts", this.logConfig.maxRetryPerBatch), jSONObject.optLong("batchCount", this.logConfig.maxLogsPerPush), jSONObject.optString("logsUrlKey", this.logConfig.prodLogUrl), jSONObject.optString("logsUrlKeySandbox", this.logConfig.sandboxLogUrl), jSONObject.has("publicKey") ? jSONObject.getJSONObject("publicKey") : this.logConfig.publicKey, jSONObject.has("publicKeySandbox") ? jSONObject.getJSONObject("publicKeySandbox") : this.logConfig.publicKeySandbox, jSONObject.has("channelHeaders") ? LogUtils.toMap(jSONObject.getJSONObject("channelHeaders")) : new HashMap<>(), jSONObject.optInt("priority", this.logConfig.defaultPriority), jSONObject.optString("environment", "all"), jSONObject.optString("encryptionLevel", this.logConfig.encryptionLevel));
        } catch (JSONException unused) {
            return false;
        }
    }

    void addLogLines(JSONArray jSONArray) {
        if (this.stopPushingLogs || !this.logConfig.shouldPush) {
            return;
        }
        addLogLines(new IterableJSONArray(jSONArray));
    }

    void addLogsFromSessioniser(final Queue<JSONObject> queue) {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m249lambda$addLogsFromSessioniser$1$injuspayhypersdkanalyticsLogPusher(queue);
            }
        });
    }

    public void addLogsToPersistedQueue(final JSONObject jSONObject) {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m250lambda$addLogsToPersistedQueue$0$injuspayhypersdkanalyticsLogPusher(jSONObject);
            }
        });
    }

    LogPushTimerTask createPusherTask() {
        return new LogPushTimerTask(this.workspace, this.logConfig, this.channels);
    }

    public String[] getChannelNames() {
        return (String[]) this.channels.keySet().toArray(new String[0]);
    }

    LogChannel getChannelObject(String str) {
        return this.channels.containsKey(str) ? this.channels.get(str) : this.channels.get(LogConstants.DEFAULT_CHANNEL);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX INFO: renamed from: lambda$addLogLines$2$in-juspay-hypersdk-analytics-LogPusher, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ void m248lambda$addLogLines$2$injuspayhypersdkanalyticsLogPusher(java.lang.Iterable r29) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusher.m248lambda$addLogLines$2$injuspayhypersdkanalyticsLogPusher(java.lang.Iterable):void");
    }

    /* JADX INFO: renamed from: lambda$addLogsFromSessioniser$1$in-juspay-hypersdk-analytics-LogPusher, reason: not valid java name */
    /* synthetic */ void m249lambda$addLogsFromSessioniser$1$injuspayhypersdkanalyticsLogPusher(Queue queue) {
        try {
            if (this.logConfig.shouldPush) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    if (!shouldDropLog(jSONObject)) {
                        JSONArray logChannels = getLogChannels(jSONObject);
                        for (int i = 0; i < logChannels.length(); i++) {
                            String string = logChannels.getString(i);
                            if (this.channels.containsKey(string)) {
                                LogChannel channelObject = getChannelObject(string);
                                byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
                                if (bytes.length <= this.logConfig.maxLogLineSize) {
                                    channelObject.addToLogsQueue(bytes);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$addLogsToPersistedQueue$0$in-juspay-hypersdk-analytics-LogPusher, reason: not valid java name */
    /* synthetic */ void m250lambda$addLogsToPersistedQueue$0$injuspayhypersdkanalyticsLogPusher(JSONObject jSONObject) {
        if (this.logConfig.shouldPush) {
            try {
                if (JuspayCoreLib.getApplicationContext() != null) {
                    File file = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), LogConstants.CRASH_LOGS_FILE);
                    StringBuilder sb = new StringBuilder();
                    sb.append(jSONObject.toString());
                    sb.append(LogConstants.LOG_DELIMITER);
                    byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
                    if (bytes.length < this.logConfig.maxLogLineSize) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        fileOutputStream.write(bytes);
                        fileOutputStream.close();
                    }
                }
            } catch (Exception e) {
                JuspayLogger.e(TAG, "addLogsToPersistedQueue failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setHeaders$3$in-juspay-hypersdk-analytics-LogPusher, reason: not valid java name */
    /* synthetic */ void m251lambda$setHeaders$3$injuspayhypersdkanalyticsLogPusher(String str, JSONObject jSONObject) {
        LogChannel channelObject = getChannelObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                channelObject.getHeaders().put(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: lambda$setLogHeaderValues$4$in-juspay-hypersdk-analytics-LogPusher, reason: not valid java name */
    /* synthetic */ void m252lambda$setLogHeaderValues$4$injuspayhypersdkanalyticsLogPusher(String str, JSONObject jSONObject) {
        LogChannel channelObject = getChannelObject(str);
        JSONObject jSONObject2 = this.logConfig.logHeaders;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                String strOptString = jSONObject2.optString(next);
                int iIndexOf = strOptString.indexOf(36);
                int iIndexOf2 = strOptString.indexOf(123);
                int iLastIndexOf = strOptString.lastIndexOf(125);
                if (iIndexOf != -1 && iIndexOf2 != -1 && iLastIndexOf != -1 && iIndexOf2 - iIndexOf == 1 && iIndexOf2 < iLastIndexOf) {
                    String strSubstring = strOptString.substring(iIndexOf2 + 1, iLastIndexOf);
                    StringBuilder sb = new StringBuilder();
                    sb.append("${");
                    sb.append(strSubstring);
                    sb.append("}");
                    String string = sb.toString();
                    if (jSONObject.has(strSubstring)) {
                        strOptString = strOptString.replace(string, jSONObject.optString(strSubstring));
                    }
                }
                channelObject.getHeaders().put(next, strOptString);
            } catch (Exception unused) {
                int i = this.setHeaderParametersErrorCounter + 1;
                this.setHeaderParametersErrorCounter = i;
                if (i <= 2) {
                    SdkTracker.trackBootAction(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.WARNING, Labels.System.LOG_PUSHER, "sdk_config", "Unable log header properties in log headers");
                    return;
                }
                return;
            }
        }
    }

    public void pushOldChannelLogs(LogChannel logChannel) {
        StringBuilder sb = new StringBuilder(LogConstants.PERSISTENT_LOGS_READING_FILE);
        sb.append(logChannel.getChannelName());
        int fromSharedPreference = LogUtils.getFromSharedPreference(sb.toString(), this.workspace);
        int i = 0;
        if (fromSharedPreference == -1) {
            Workspace workspace = this.workspace;
            StringBuilder sb2 = new StringBuilder(LogConstants.PERSISTENT_LOGS_READING_FILE);
            sb2.append(logChannel.getChannelName());
            workspace.writeToSharedPreference(sb2.toString(), SessionDescription.SUPPORTED_SDP_VERSION);
            fromSharedPreference = 0;
        }
        StringBuilder sb3 = new StringBuilder(LogConstants.PERSISTENT_LOGS_WRITING_FILE);
        sb3.append(logChannel.getChannelName());
        int fromSharedPreference2 = LogUtils.getFromSharedPreference(sb3.toString(), this.workspace);
        if (fromSharedPreference2 == -1) {
            Workspace workspace2 = this.workspace;
            StringBuilder sb4 = new StringBuilder(LogConstants.PERSISTENT_LOGS_WRITING_FILE);
            sb4.append(logChannel.getChannelName());
            workspace2.writeToSharedPreference(sb4.toString(), SessionDescription.SUPPORTED_SDP_VERSION);
        } else {
            i = fromSharedPreference2;
        }
        pushAllFiles(fromSharedPreference, i, logChannel);
    }

    public void setEndPointSandbox(Boolean bool) {
        this.isSandboxEnv = bool.booleanValue();
    }

    public void setHeaders(final JSONObject jSONObject, final String str) {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m251lambda$setHeaders$3$injuspayhypersdkanalyticsLogPusher(str, jSONObject);
            }
        });
    }

    public void setLogHeaderValues(final JSONObject jSONObject, final String str) {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m252lambda$setLogHeaderValues$4$injuspayhypersdkanalyticsLogPusher(str, jSONObject);
            }
        });
    }

    public void setPushState(boolean z) {
        this.stopPushingLogs = !z;
    }

    boolean shouldDropLog(JSONObject jSONObject) {
        try {
            if (jSONObject.has("channel")) {
                return !this.channels.containsKey(jSONObject.getString("channel"));
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    void addLogLines(final Iterable<JSONObject> iterable) {
        if (this.stopPushingLogs) {
            return;
        }
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusher$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m248lambda$addLogLines$2$injuspayhypersdkanalyticsLogPusher(iterable);
            }
        });
    }
}
