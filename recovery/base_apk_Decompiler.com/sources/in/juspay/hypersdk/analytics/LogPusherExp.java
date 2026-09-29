package in.juspay.hypersdk.analytics;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.marrow2.data.test.remote.model.GTAnalyticsV2ResponseModel;
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
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C0156TypeKt;
import kotlin.StringArrayDeserializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LogPusherExp {
    private static final String TAG = "LogPusher";
    private final File crashLogFile;
    private final LogConfig logConfig;
    private TimerTask logPushTimerTask;
    private final LogWorkspace logWorkspace;
    private final ConcurrentHashMap<String, LogChannelExp> channels = new ConcurrentHashMap<>();
    private int logFlushTimerTaskErrorCounter = 0;
    private int setHeaderParametersErrorCounter = 0;
    private boolean isSandboxEnv = false;
    private Timer logPushTimer = new Timer();
    private final ConcurrentHashMap<String, Integer> fileCountMap = new ConcurrentHashMap<>();
    private boolean isExceptionTracked = false;

    protected class LogPushTimerTask extends TimerTask {
        private static final String TAG = "LogPushTimerTask";

        protected LogPushTimerTask() {
        }

        /* JADX INFO: renamed from: lambda$run$0$in-juspay-hypersdk-analytics-LogPusherExp$LogPushTimerTask, reason: not valid java name */
        /* synthetic */ void m261lambda$run$0$injuspayhypersdkanalyticsLogPusherExp$LogPushTimerTask() {
            if (LogPusherExp.this.logConfig.shouldPush && LogUtils.isMinMemoryAvailable(LogPusherExp.this.logConfig).booleanValue()) {
                LogPusherExp.this.checkFolderLimit();
                LogPusherExp.this.pushAllLogs();
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogPusherThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$LogPushTimerTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m261lambda$run$0$injuspayhypersdkanalyticsLogPusherExp$LogPushTimerTask();
                }
            });
        }
    }

    LogPusherExp(Workspace workspace, LogConfig logConfig) {
        LogWorkspace logWorkspace = new LogWorkspace(workspace);
        this.logWorkspace = logWorkspace;
        this.logConfig = logConfig;
        this.crashLogFile = logWorkspace.open(LogConstants.CRASH_LOGS_FILE);
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.clearBacklog();
            }
        });
    }

    private static void acknowledgeLogsPushed(ArrayList<String> arrayList, LogChannelExp logChannelExp) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            logChannelExp.pollLogsQueue(it.next());
        }
    }

    private boolean addChannel(String str, int i, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i2, String str4, String str5, JSONArray jSONArray, JSONArray jSONArray2, String str6) {
        boolean zContainsKey = this.channels.containsKey(str);
        LogChannelExp logChannelExpMakeChannel = makeChannel(str, i, j, str2, str3, jSONObject, jSONObject2, map, i2, str4, str5, jSONArray, jSONArray2, str6);
        this.channels.put(str, logChannelExpMakeChannel);
        if (!zContainsKey) {
            String fromSharedPreference = this.logWorkspace.getFromSharedPreference(LogConstants.LOG_CHANNEL_NAMES, "");
            StringBuilder sb = new StringBuilder();
            sb.append(fromSharedPreference);
            sb.append(fromSharedPreference.isEmpty() ? "" : ",");
            sb.append(str);
            this.logWorkspace.writeToSharedPreference(LogConstants.LOG_CHANNEL_NAMES, sb.toString());
        }
        this.logWorkspace.writeToSharedPreference("LOG_CHANNEL_INFO_".concat(String.valueOf(str)), logChannelExpMakeChannel.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkFolderLimit() {
        File[] fileArrListFiles;
        File fileOpen = this.logWorkspace.open("");
        if (fileOpen == null || !fileOpen.exists() || (fileArrListFiles = fileOpen.listFiles()) == null) {
            return;
        }
        long length = 0;
        for (File file : fileArrListFiles) {
            if (file != null && file.exists() && file.isFile()) {
                length += file.length();
            }
        }
        if (length >= this.logConfig.folderSizeLimit) {
            Arrays.sort(fileArrListFiles, new Comparator() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
            long j = (long) (this.logConfig.folderSizeLimit * 0.8d);
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.exists() && file2.isFile()) {
                    file2.delete();
                    length -= file2.length();
                }
                if (length <= j) {
                    return;
                }
            }
        }
    }

    static int getBatchNum(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        int i = iLastIndexOf - 5;
        return Integer.parseInt(str.charAt(i) == '-' ? str.substring(iLastIndexOf - 8, i) : str.substring(iLastIndexOf - 3, iLastIndexOf));
    }

    private static JSONArray getBatchNumArray(ArrayList<String> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(getBatchNum(it.next()));
        }
        return jSONArray;
    }

    private LogChannelExp getChannelObject(String str) {
        return this.channels.containsKey(str) ? this.channels.get(str) : this.channels.get(LogConstants.DEFAULT_CHANNEL);
    }

    private String getEndPoint(LogChannelExp logChannelExp) {
        return this.isSandboxEnv ? logChannelExp.getEndpointSBX() : logChannelExp.getEndPointProd();
    }

    private int getFileCount(String str, File file) {
        Integer num;
        if (this.fileCountMap.containsKey(str) && (num = this.fileCountMap.get(str)) != null) {
            return num.intValue();
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int i = str.charAt(iLastIndexOf + (-5)) == '-' ? Integer.parseInt(str.substring(iLastIndexOf - 4, iLastIndexOf)) : traverseTheFile(str, file);
        this.fileCountMap.put(str, Integer.valueOf(i));
        return i;
    }

    private StringArrayDeserializer<byte[], Integer> getFilesContent(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int length = 0;
        int fileCount = 0;
        for (String str : arrayList) {
            File fileOpen = this.logWorkspace.open(str);
            if (fileOpen != null && fileOpen.exists() && fileOpen.length() > 0) {
                byte[] logsFromFileExp = LogUtils.getLogsFromFileExp(fileOpen);
                length += logsFromFileExp.length;
                arrayList2.add(logsFromFileExp);
                fileCount += getFileCount(str, fileOpen);
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put((byte[]) it.next());
        }
        return StringArrayDeserializer.RemoteActionCompatParcelizer(byteBufferAllocate.array(), Integer.valueOf(fileCount));
    }

    private JSONObject getFirstLog(String str) {
        JSONObject jSONObject = new JSONObject();
        if (str.contains(".ndjson")) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.logWorkspace.open(str)));
            try {
                JSONObject jSONObject2 = new JSONObject(bufferedReader.readLine());
                bufferedReader.close();
                return jSONObject2;
            } finally {
            }
        }
        if (str.contains(".dat")) {
            byte[] bArr = new byte[4];
            File fileOpen = this.logWorkspace.open(str);
            if (fileOpen != null && fileOpen.exists()) {
                FileInputStream fileInputStream = new FileInputStream(fileOpen);
                try {
                    fileInputStream.read(bArr);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    byteBufferAllocate.put(bArr);
                    byteBufferAllocate.rewind();
                    int i = byteBufferAllocate.getInt();
                    if (i >= 102400) {
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byte[] bArr2 = new byte[i];
                    fileInputStream.read(bArr2);
                    JSONObject jSONObject3 = new JSONObject(new String(bArr2, StandardCharsets.UTF_8));
                    fileInputStream.close();
                    return jSONObject3;
                } finally {
                }
            }
        }
        return jSONObject;
        return jSONObject;
    }

    private RSAPublicKey getLogEncryptionKey(LogChannelExp logChannelExp, int i) {
        JSONObject keySBX;
        if (logChannelExp.getFallBackPublicKeys().length() == 0 || i < 0) {
            keySBX = null;
        } else {
            try {
                keySBX = (JSONObject) logChannelExp.getFallBackPublicKeys().get(i);
            } catch (Exception unused) {
                keySBX = null;
            }
        }
        if (keySBX == null) {
            keySBX = this.isSandboxEnv ? logChannelExp.getKeySBX() : logChannelExp.getKeyProd();
        }
        try {
            return JOSEUtils.JWKtoRSAPublicKey(keySBX);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static String getLogEncryptionLevel(LogChannelExp logChannelExp) {
        return logChannelExp.getEncryptionLevel();
    }

    private void hitErrorUrl(String str, LogChannelExp logChannelExp, int i) {
        try {
            if (Objects.equals(logChannelExp.getErrorUrl(), "")) {
                return;
            }
            JSONObject firstLog = getFirstLog(str);
            HashMap map = new HashMap();
            try {
                map.put("session_id", firstLog.optString("session_id", ""));
                map.put("start_with", String.valueOf(firstLog.optInt("sn", 0)));
                map.put(GTAnalyticsV2ResponseModel.KEY_TOTAL_COUNT, this.fileCountMap.containsKey(str) ? String.valueOf(this.fileCountMap.get(str)) : "unknown");
                map.put("channel_name", logChannelExp.getChannelName());
                map.put("response_code", String.valueOf(i));
            } catch (Exception unused) {
            }
            C0156TypeKt c0156TypeKtDoGet = new NetUtils(30000, 30000).doGet(logChannelExp.getErrorUrl(), new HashMap(), map, new JSONObject(), null);
            if (c0156TypeKtDoGet != null) {
                c0156TypeKtDoGet.close();
            }
        } catch (Exception unused2) {
        }
    }

    private void loadSavedChannels() {
        JSONObject jSONObject = this.logConfig.channels;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    addChannelFromJS(jSONObject.get(next).toString(), next);
                } catch (JSONException e) {
                    SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while creating channel", e);
                }
            }
        }
        JSONArray jSONArray = this.logConfig.logChannelsConfig;
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    addChannelFromJS(jSONObject2.toString(), jSONObject2.getString("channel"));
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    private LogChannelExp makeChannel(String str, int i, long j, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, Map<String, String> map, int i2, String str4, String str5, JSONArray jSONArray, JSONArray jSONArray2, String str6) {
        return new LogChannelExp(i, j, str, str2, str3, jSONObject, jSONObject2, map, i2, str4, str5, jSONArray, jSONArray2, str6);
    }

    private void pushChannelFiles(final String str, LogChannelExp logChannelExp) {
        try {
            File file = this.logWorkspace.logsDir;
            if (file != null && file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda0
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str2) {
                        return str2.contains(str);
                    }
                });
                ArrayList<File> arrayList = new ArrayList<>();
                ArrayList<File> arrayList2 = new ArrayList<>();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null && file2.exists() && file2.isFile()) {
                            if (file2.length() <= 0 || !LogUtils.isFileEligibleToPush(file2, this.logConfig)) {
                                file2.delete();
                            } else if (file2.getName().contains(".ndjson")) {
                                arrayList.add(file2);
                            } else {
                                arrayList2.add(file2);
                            }
                        }
                    }
                }
                pushNdJsonFiles(arrayList, logChannelExp, false);
                pushDatFiles(arrayList2, logChannelExp, false);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushCrashLogFile() {
        if (JuspayCoreLib.getApplicationContext() != null) {
            LogChannelExp channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
            File file = this.crashLogFile;
            if (file == null || !file.exists()) {
                return;
            }
            if (this.crashLogFile.length() <= 0 || !LogUtils.isFileEligibleToPush(this.crashLogFile, this.logConfig)) {
                this.crashLogFile.delete();
            } else {
                pushFileContentToServer(this.crashLogFile, channelObject);
            }
        }
    }

    private void pushFileContentToServer(File file, LogChannelExp logChannelExp) {
        try {
            if (pushLogsToServer(LogUtils.getLogsFromFileExp(file), getFileCount(file.getName(), file), new JSONArray().put(1), logChannelExp, false) == 200) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    private int pushLogsToServer(byte[] bArr, int i, JSONArray jSONArray, LogChannelExp logChannelExp, boolean z) throws JSONException, IOException {
        JuspayHttpsResponse juspayHttpsResponse;
        int currentBatchRetryAttempts;
        String logEncryptionLevel = getLogEncryptionLevel(logChannelExp);
        RSAPublicKey logEncryptionKey = getLogEncryptionKey(logChannelExp, logChannelExp.getRetryAttempts() - 1);
        NetUtils netUtils = new NetUtils(10000, 10000);
        Map<String, String> headers = logChannelExp.getHeaders();
        headers.put("x-logscount", String.valueOf(i));
        headers.put("channel", logChannelExp.getChannelName());
        headers.put("x-log-format", z ? "ndjson" : "byte-d-json");
        headers.put("x-batch-no", jSONArray.toString());
        String endPoint = getEndPoint(logChannelExp);
        JSONArray fallBackUrls = logChannelExp.getFallBackUrls();
        if (fallBackUrls.length() != 0 && (currentBatchRetryAttempts = logChannelExp.getCurrentBatchRetryAttempts()) > 0) {
            endPoint = fallBackUrls.getString((currentBatchRetryAttempts - 1) % fallBackUrls.length());
        }
        if ("encryption".equals(logEncryptionLevel) && logEncryptionKey != null) {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), EncryptionHelper.gzipThenEncryptExp(bArr, logEncryptionKey, headers), "application/x-godel-gzip-pubkey-encrypted", headers, new JSONObject(), null));
        } else if ("gzip".equals(logEncryptionLevel)) {
            byte[] bArrGzipContent = Utils.gzipContent(bArr);
            headers.put(RtspHeaders.CONTENT_ENCODING, "gzip");
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), bArrGzipContent, "application/gzip", headers, new JSONObject(), null));
        } else {
            juspayHttpsResponse = new JuspayHttpsResponse(netUtils.doPost(new URL(endPoint), bArr, "application/json", headers, new JSONObject(), null));
        }
        return juspayHttpsResponse.responseCode;
    }

    public boolean addChannelFromJS(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return addChannel(str2, jSONObject.optInt("retryAttempts", this.logConfig.maxRetryPerBatch), jSONObject.optLong("batchCount", this.logConfig.maxLogsPerPush), jSONObject.optString("logsUrlKey", this.logConfig.prodLogUrl), jSONObject.optString("logsUrlKeySandbox", this.logConfig.sandboxLogUrl), jSONObject.has("publicKey") ? jSONObject.getJSONObject("publicKey") : this.logConfig.publicKey, jSONObject.has("publicKeySandbox") ? jSONObject.getJSONObject("publicKeySandbox") : this.logConfig.publicKeySandbox, jSONObject.has("channelHeaders") ? LogUtils.toMap(jSONObject.getJSONObject("channelHeaders")) : new HashMap<>(), jSONObject.optInt("priority", this.logConfig.defaultPriority), jSONObject.optString("environment", "all"), jSONObject.optString("encryptionLevelKey", this.logConfig.encryptionLevel), jSONObject.has("fallBackUrls") ? jSONObject.optJSONArray("fallBackUrls") : this.logConfig.fallBackUrl, jSONObject.has("fallBackPublicKeys") ? jSONObject.optJSONArray("fallBackPublicKeys") : this.logConfig.fallBackPublicKeys, jSONObject.optString("errorUrl", this.logConfig.errorUrl));
        } catch (JSONException unused) {
            return false;
        }
    }

    void addLogLines(final String str, final String str2) {
        ExecutorManager.runOnLogPusherThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m256lambda$addLogLines$3$injuspayhypersdkanalyticsLogPusherExp(str, str2);
            }
        });
    }

    public void addLogsToPersistedQueue(final JSONObject jSONObject) {
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m257lambda$addLogsToPersistedQueue$2$injuspayhypersdkanalyticsLogPusherExp(jSONObject);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0302 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void clearBacklog() {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.analytics.LogPusherExp.clearBacklog():void");
    }

    public Set<String> getChannelNames() {
        return this.channels.keySet();
    }

    /* JADX INFO: renamed from: lambda$addLogLines$3$in-juspay-hypersdk-analytics-LogPusherExp, reason: not valid java name */
    /* synthetic */ void m256lambda$addLogLines$3$injuspayhypersdkanalyticsLogPusherExp(String str, String str2) {
        if (this.logConfig.shouldPush) {
            try {
                LogChannelExp channelObject = getChannelObject(str);
                if (channelObject == null) {
                    channelObject = getChannelObject(LogConstants.DEFAULT_CHANNEL);
                }
                File fileOpen = this.logWorkspace.open(str2);
                if (fileOpen == null || !fileOpen.exists() || fileOpen.length() <= 0) {
                    return;
                }
                channelObject.addToLogsQueue(str2);
            } catch (Exception e) {
                int i = this.logFlushTimerTaskErrorCounter + 1;
                this.logFlushTimerTaskErrorCounter = i;
                if (i <= 2) {
                    SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while flushing the logs to persisted queue file", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$addLogsToPersistedQueue$2$in-juspay-hypersdk-analytics-LogPusherExp, reason: not valid java name */
    /* synthetic */ void m257lambda$addLogsToPersistedQueue$2$injuspayhypersdkanalyticsLogPusherExp(JSONObject jSONObject) {
        if (this.logConfig.shouldPush) {
            try {
                LogUtils.writeLogToFileExp(jSONObject, this.crashLogFile);
            } catch (Exception e) {
                JuspayLogger.e(TAG, "addLogsToPersistedQueue failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$clearBacklog$0$in-juspay-hypersdk-analytics-LogPusherExp, reason: not valid java name */
    /* synthetic */ void m258lambda$clearBacklog$0$injuspayhypersdkanalyticsLogPusherExp(String str, LogChannelExp logChannelExp) {
        pushChannelFiles(str, logChannelExp);
        this.logWorkspace.removeFromSharedPreference("LOG_CHANNEL_INFO_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: lambda$clearBacklog$1$in-juspay-hypersdk-analytics-LogPusherExp, reason: not valid java name */
    /* synthetic */ void m259lambda$clearBacklog$1$injuspayhypersdkanalyticsLogPusherExp() {
        pushChannelFiles(LogConstants.DEFAULT_CHANNEL, this.channels.get(LogConstants.DEFAULT_CHANNEL));
    }

    /* JADX INFO: renamed from: lambda$pushAllLogs$6$in-juspay-hypersdk-analytics-LogPusherExp, reason: not valid java name */
    /* synthetic */ void m260lambda$pushAllLogs$6$injuspayhypersdkanalyticsLogPusherExp() {
        File fileOpen;
        File fileOpen2;
        Iterator<Map.Entry<String, LogChannelExp>> it = this.channels.entrySet().iterator();
        while (it.hasNext()) {
            LogChannelExp value = it.next().getValue();
            try {
                ArrayList<File> arrayList = new ArrayList<>();
                for (String str : value.getLogsQueueExp()) {
                    if (str.contains(".ndjson") && (fileOpen2 = this.logWorkspace.open(str)) != null && fileOpen2.exists()) {
                        arrayList.add(fileOpen2);
                    }
                }
                pushNdJsonFiles(arrayList, value, true);
                arrayList.clear();
                for (String str2 : value.getLogsQueueExp()) {
                    if (str2.contains(".dat") && (fileOpen = this.logWorkspace.open(str2)) != null && fileOpen.exists()) {
                        arrayList.add(fileOpen);
                    }
                }
                pushDatFiles(arrayList, value, true);
            } catch (Exception e) {
                if (!this.isExceptionTracked) {
                    SdkTracker.trackAndLogBootException(TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Error while creating the payload to post", e);
                }
                this.isExceptionTracked = true;
            }
        }
        for (Map.Entry<String, LogChannelExp> entry : this.channels.entrySet()) {
            pushChannelFiles(entry.getKey(), entry.getValue());
        }
    }

    void pushAllLogs() {
        ExecutorManager.runOnLogPusherThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogPusherExp$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m260lambda$pushAllLogs$6$injuspayhypersdkanalyticsLogPusherExp();
            }
        });
    }

    void pushDatFiles(ArrayList<File> arrayList, LogChannelExp logChannelExp, boolean z) {
        try {
            ArrayList arrayList2 = new ArrayList();
            for (File file : arrayList) {
                if (file != null && file.exists() && file.length() > 0) {
                    String name = file.getName();
                    if (file.length() > 0) {
                        int iPushLogsToServer = pushLogsToServer(LogUtils.getLogsFromFileExp(file), getFileCount(name, file), new JSONArray().put(getBatchNum(name)), logChannelExp, false);
                        if (iPushLogsToServer != 200 && (logChannelExp.getRetryAttempts() == -1 || logChannelExp.getCurrentBatchRetryAttempts() < logChannelExp.getRetryAttempts())) {
                            SdkTracker.trackBootAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.LOG_PUSHER, "error_response", Integer.valueOf(iPushLogsToServer));
                            logChannelExp.setCurrentBatchRetryAttempts(logChannelExp.getCurrentBatchRetryAttempts() + 1);
                        }
                        if (logChannelExp.getRetryAttempts() != -1 && logChannelExp.getCurrentBatchRetryAttempts() >= logChannelExp.getRetryAttempts()) {
                            hitErrorUrl(name, logChannelExp, iPushLogsToServer);
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                            if (z) {
                                arrayList2.add(name);
                            }
                        }
                        if (iPushLogsToServer == 200) {
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                            if (z) {
                                arrayList2.add(name);
                            }
                            file.delete();
                        }
                    } else {
                        if (z) {
                            arrayList2.add(name);
                        }
                        file.delete();
                    }
                } else if (file != null && z) {
                    arrayList2.add(file.getName());
                }
            }
            acknowledgeLogsPushed(arrayList2, logChannelExp);
        } catch (Exception unused) {
        }
    }

    void pushNdJsonFiles(ArrayList<File> arrayList, LogChannelExp logChannelExp, boolean z) {
        try {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < arrayList.size()) {
                long j = 0;
                int i2 = i;
                while (i2 < arrayList.size()) {
                    File file = arrayList.get(i2);
                    if (file != null && file.exists()) {
                        int fileCount = getFileCount(file.getName(), file);
                        if (j != 0 && ((long) fileCount) + j > logChannelExp.getBatchCount()) {
                            break;
                        } else {
                            j += (long) fileCount;
                        }
                    }
                    i2++;
                }
                if (j != 0) {
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (int i3 = i; i3 < i2; i3++) {
                        arrayList3.add(arrayList.get(i3).getName());
                    }
                    StringArrayDeserializer<byte[], Integer> filesContent = getFilesContent(arrayList3);
                    JSONArray batchNumArray = getBatchNumArray(arrayList3);
                    byte[] bArr = filesContent.RemoteActionCompatParcelizer;
                    if (bArr == null || bArr.length <= 0) {
                        while (i < i2) {
                            if (z) {
                                arrayList2.add(arrayList.get(i).getName());
                            }
                            arrayList.get(i).delete();
                            i++;
                        }
                    } else {
                        byte[] bArr2 = bArr;
                        Integer num = filesContent.IconCompatParcelizer;
                        int iPushLogsToServer = pushLogsToServer(bArr2, num == null ? 1 : num.intValue(), batchNumArray, logChannelExp, true);
                        if (iPushLogsToServer != 200 && (logChannelExp.getRetryAttempts() == -1 || logChannelExp.getCurrentBatchRetryAttempts() < logChannelExp.getRetryAttempts())) {
                            SdkTracker.trackBootAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.LOG_PUSHER, "error_response", Integer.valueOf(iPushLogsToServer));
                            logChannelExp.setCurrentBatchRetryAttempts(logChannelExp.getCurrentBatchRetryAttempts() + 1);
                        }
                        if (logChannelExp.getRetryAttempts() != -1 && logChannelExp.getCurrentBatchRetryAttempts() >= logChannelExp.getRetryAttempts()) {
                            for (int i4 = i; i4 < i2; i4++) {
                                String name = arrayList.get(i4).getName();
                                hitErrorUrl(name, logChannelExp, iPushLogsToServer);
                                if (z) {
                                    arrayList2.add(name);
                                }
                            }
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                        }
                        if (iPushLogsToServer == 200) {
                            logChannelExp.setCurrentBatchRetryAttempts(0);
                            while (i < i2) {
                                if (z) {
                                    arrayList2.add(arrayList.get(i).getName());
                                }
                                arrayList.get(i).delete();
                                i++;
                            }
                        }
                    }
                } else {
                    while (i < i2) {
                        if (z) {
                            arrayList2.add(arrayList.get(i).getName());
                        }
                        arrayList.get(i).delete();
                        i++;
                    }
                }
                i = i2;
            }
            acknowledgeLogsPushed(arrayList2, logChannelExp);
        } catch (Exception unused) {
        }
    }

    public void setEndPointSandbox(Boolean bool) {
        this.isSandboxEnv = bool.booleanValue();
    }

    public void setHeaders(JSONObject jSONObject, String str) {
        LogChannelExp channelObject = getChannelObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                channelObject.getHeaders().put(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
    }

    public void setLogHeaderValues(JSONObject jSONObject, String str) {
        LogChannelExp channelObject = getChannelObject(str);
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

    void startLogPusher() {
        if (this.logConfig.shouldPush) {
            try {
                this.logPushTimer = new Timer();
                LogPushTimerTask logPushTimerTask = new LogPushTimerTask();
                this.logPushTimerTask = logPushTimerTask;
                this.logPushTimer.scheduleAtFixedRate(logPushTimerTask, 0L, this.logConfig.logPostInterval);
            } catch (Exception unused) {
            }
        }
    }

    void stopLogPusherOnTerminate() {
        if (this.logConfig.shouldPush) {
            try {
                this.logPushTimer.cancel();
                this.logPushTimer = new Timer();
                LogPushTimerTask logPushTimerTask = new LogPushTimerTask();
                this.logPushTimerTask = logPushTimerTask;
                logPushTimerTask.run();
            } catch (Exception unused) {
            }
        }
    }

    int traverseTheFile(String str, File file) {
        int i = 0;
        if (!str.contains(".dat")) {
            if (!str.contains(".ndjson")) {
                return 1;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.logWorkspace.open(str)));
                try {
                    byte[] bArr = new byte[1024];
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        int i3 = bufferedInputStream.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (bArr[i4] == 10) {
                                i2++;
                            }
                        }
                        z = bArr[i3 + (-1)] != 10;
                    }
                    if (z) {
                        i2++;
                    }
                    int i5 = i2;
                    bufferedInputStream.close();
                    return i5;
                } finally {
                }
            } catch (Exception unused) {
                return 0;
            }
        }
        long length = file.length();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i6 = 0;
            while (i < length) {
                try {
                    try {
                        byte[] bArr2 = new byte[4];
                        fileInputStream.read(bArr2);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                        byteBufferAllocate.put(bArr2);
                        byteBufferAllocate.rewind();
                        int i7 = byteBufferAllocate.getInt();
                        if (i7 > 102400) {
                            fileInputStream.close();
                            return i6;
                        }
                        long j = i7;
                        if (fileInputStream.skip(j) < j) {
                            fileInputStream.close();
                            return i6;
                        }
                        i += i7 + 4;
                        i6++;
                    } finally {
                    }
                } catch (Exception unused2) {
                    return i6;
                }
            }
            fileInputStream.close();
            return i6;
        } catch (Exception unused3) {
            return 0;
        }
    }
}
