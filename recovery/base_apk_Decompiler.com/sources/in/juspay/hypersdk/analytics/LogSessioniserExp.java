package in.juspay.hypersdk.analytics;

import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.StringArrayDeserializer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LogSessioniserExp {
    private final LogConfig logConfig;
    private final LogPusherExp logPusherExp;
    private final LogWorkspace logWorkspace;
    private TimerTask moveToPusher;
    private String rawLogsrequestId = LogUtils.generateUUID().replace("-", "");
    private Timer moveToPusherTimer = new Timer();
    private final AtomicInteger batchNumber = new AtomicInteger(0);
    private boolean tempFlipDone = false;
    private final AtomicBoolean pushFileCreated = new AtomicBoolean(false);
    private LoggerState loggerState = LoggerState.IDLE;
    private ConcurrentHashMap<String, FileOutputStream> fosMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, ArrayList<String>> currentFilesObj = new ConcurrentHashMap<>();
    private final ConcurrentLinkedQueue<String> filesObj = new ConcurrentLinkedQueue<>();
    private final ConcurrentHashMap<String, StringArrayDeserializer<Integer, Integer>> logsCount = new ConcurrentHashMap<>();

    class LogSessioniserTimerTask extends TimerTask {
        private LogSessioniserTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (LogSessioniserExp.this.logConfig.shouldPush && LogUtils.isMinMemoryAvailable(LogSessioniserExp.this.logConfig).booleanValue()) {
                final LogSessioniserExp logSessioniserExp = LogSessioniserExp.this;
                ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$LogSessioniserTimerTask$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        logSessioniserExp.pushToPusher();
                    }
                });
            }
        }
    }

    LogSessioniserExp(Workspace workspace, LogConfig logConfig, LogPusherExp logPusherExp) {
        this.logWorkspace = new LogWorkspace(workspace);
        this.logConfig = logConfig;
        this.logPusherExp = logPusherExp;
    }

    private void addToLogs(String str, String str2, JSONObject jSONObject) {
        int i;
        String string;
        int batchNum;
        int iIntValue;
        StringBuilder sb;
        String string2;
        StringArrayDeserializer<Integer, Integer> stringArrayDeserializer;
        Integer num;
        try {
            String str3 = this.logConfig.fileFormat.equals("ndJson") ? ".ndjson" : ".dat";
            if (this.currentFilesObj.containsKey(str)) {
                ArrayList<String> arrayList = this.currentFilesObj.get(str);
                if (arrayList != null) {
                    string = arrayList.get(arrayList.size() - 1);
                    if (this.logsCount.get(string) != null && (stringArrayDeserializer = this.logsCount.get(string)) != null && (num = stringArrayDeserializer.RemoteActionCompatParcelizer) != null && num.intValue() >= this.logConfig.maxLogsPerPush) {
                        StringBuilder sb2 = new StringBuilder("logs-");
                        sb2.append(str);
                        sb2.append('-');
                        sb2.append(str2);
                        sb2.append('-');
                        sb2.append(String.format(Locale.US, "%03d", Integer.valueOf(this.batchNumber.incrementAndGet())));
                        sb2.append(str3);
                        string2 = sb2.toString();
                    }
                    i = 0;
                } else {
                    StringBuilder sb3 = new StringBuilder("logs-");
                    sb3.append(str);
                    sb3.append('-');
                    sb3.append(str2);
                    sb3.append('-');
                    sb3.append(String.format(Locale.US, "%03d", Integer.valueOf(this.batchNumber.incrementAndGet())));
                    sb3.append(str3);
                    string2 = sb3.toString();
                }
                string = string2;
                i = 0;
            } else {
                StringBuilder sb4 = new StringBuilder("logs-");
                sb4.append(str);
                sb4.append('-');
                sb4.append(str2);
                sb4.append('-');
                i = 0;
                sb4.append(String.format(Locale.US, "%03d", Integer.valueOf(this.batchNumber.incrementAndGet())));
                sb4.append(str3);
                string = sb4.toString();
            }
            FileOutputStream fileOutputStream = this.fosMap.containsKey(string) ? this.fosMap.get(string) : null;
            if (fileOutputStream == null) {
                LogWorkspace logWorkspace = this.logWorkspace;
                if (this.tempFlipDone) {
                    sb = new StringBuilder();
                    sb.append("original/");
                    sb.append(string);
                } else {
                    sb = new StringBuilder();
                    sb.append("temp/");
                    sb.append(string);
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(logWorkspace.open(sb.toString()), true);
                this.fosMap.put(string, fileOutputStream2);
                if (this.currentFilesObj.containsKey(str)) {
                    ArrayList<String> arrayList2 = this.currentFilesObj.get(str);
                    if (arrayList2 != null) {
                        arrayList2.add(string);
                    }
                } else {
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    arrayList3.add(string);
                    this.currentFilesObj.put(str, arrayList3);
                }
                if (this.pushFileCreated.get() && !this.tempFlipDone) {
                    ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.updatePushFile();
                        }
                    });
                }
                fileOutputStream = fileOutputStream2;
            }
            if (this.logsCount.containsKey(string)) {
                StringArrayDeserializer<Integer, Integer> stringArrayDeserializer2 = this.logsCount.get(string);
                if (stringArrayDeserializer2 != null) {
                    Integer num2 = stringArrayDeserializer2.RemoteActionCompatParcelizer;
                    iIntValue = num2 != null ? num2.intValue() : i;
                    Integer num3 = stringArrayDeserializer2.IconCompatParcelizer;
                    batchNum = num3 == null ? LogPusherExp.getBatchNum(string) : num3.intValue();
                } else {
                    batchNum = LogPusherExp.getBatchNum(string);
                    iIntValue = i;
                }
                this.logsCount.put(string, StringArrayDeserializer.RemoteActionCompatParcelizer(Integer.valueOf(iIntValue + 1), Integer.valueOf(batchNum)));
                jSONObject.put("batch_number", batchNum);
            } else {
                int batchNum2 = LogPusherExp.getBatchNum(string);
                this.logsCount.put(string, StringArrayDeserializer.RemoteActionCompatParcelizer(1, Integer.valueOf(batchNum2)));
                jSONObject.put("batch_number", batchNum2);
            }
            String string3 = jSONObject.toString();
            if (string.contains(".ndjson")) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string3);
                sb5.append('\n');
                string3 = sb5.toString();
            }
            byte[] bytes = string3.getBytes(StandardCharsets.UTF_8);
            if (string.contains(".dat")) {
                fileOutputStream.write(ByteBuffer.allocate(4).putInt(bytes.length).array());
            }
            fileOutputStream.write(bytes);
        } catch (Exception unused) {
        }
    }

    private void getAllTempFiles(JSONObject jSONObject) {
        Iterator<String> it = this.filesObj.iterator();
        while (it.hasNext()) {
            try {
                jSONObject.put(it.next(), "");
            } catch (Exception unused) {
            }
        }
        Iterator<Map.Entry<String, ArrayList<String>>> it2 = this.currentFilesObj.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                Iterator<String> it3 = it2.next().getValue().iterator();
                while (it3.hasNext()) {
                    jSONObject.put(it3.next(), "");
                }
            } catch (Exception unused2) {
            }
        }
    }

    private JSONArray getLogChannels(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("channels");
        if ((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) && jSONObject.has("channel")) {
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            jSONArrayOptJSONArray.put(jSONObject.optString("channel", LogConstants.DEFAULT_CHANNEL));
        }
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            return jSONArrayOptJSONArray;
        }
        try {
            jSONArray = this.logConfig.defaultChannels != null ? new JSONArray(this.logConfig.defaultChannels.toString()) : new JSONArray();
        } catch (Exception unused) {
            jSONArray = new JSONArray();
        }
        jSONArray.put(LogConstants.DEFAULT_CHANNEL);
        return jSONArray;
    }

    private int getLogCount(String str) {
        Integer num;
        if (this.logsCount.get(str) == null) {
            File fileOpen = this.logWorkspace.open(str);
            if (fileOpen != null) {
                return this.logPusherExp.traverseTheFile(str, fileOpen);
            }
            return 0;
        }
        StringArrayDeserializer<Integer, Integer> stringArrayDeserializer = this.logsCount.get(str);
        if (stringArrayDeserializer != null && (num = stringArrayDeserializer.RemoteActionCompatParcelizer) != null) {
            return num.intValue();
        }
        File fileOpen2 = this.logWorkspace.open(str);
        if (fileOpen2 != null) {
            return this.logPusherExp.traverseTheFile(str, fileOpen2);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushToPusher() {
        final boolean z;
        this.rawLogsrequestId = LogUtils.generateUUID().replace("-", "");
        Iterator<Map.Entry<String, FileOutputStream>> it = this.fosMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().close();
            } catch (Exception unused) {
            }
        }
        this.fosMap = new ConcurrentHashMap<>();
        final ConcurrentHashMap<String, ArrayList<String>> concurrentHashMap = this.currentFilesObj;
        this.currentFilesObj = new ConcurrentHashMap<>();
        synchronized (this.loggerState) {
            if (!LoggerState.PUSHING.equals(this.loggerState) || this.tempFlipDone) {
                z = false;
            } else {
                z = true;
                this.tempFlipDone = true;
            }
            ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m270lambda$pushToPusher$3$injuspayhypersdkanalyticsLogSessioniserExp(concurrentHashMap, z);
                }
            });
        }
    }

    private boolean shouldAllowLog(JSONObject jSONObject) {
        int i;
        JSONArray jSONArray = this.logConfig.allowWhileBuffering;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (jSONObject.has(next)) {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray(next);
                            for (0; i < jSONArray2.length(); i + 1) {
                                i = Objects.equals(jSONArray2.get(i), jSONObject.get(next)) ? 0 : i + 1;
                            }
                        }
                    }
                    return true;
                }
                continue;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePushFile() {
        File fileOpen = this.logWorkspace.open("temp/push.json");
        if (fileOpen != null) {
            JSONObject jSONObject = new JSONObject();
            if (fileOpen.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileOpen);
                    try {
                        byte[] bArr = new byte[(int) fileOpen.length()];
                        fileInputStream.read(bArr);
                        JSONObject jSONObject2 = new JSONObject(new String(bArr));
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        jSONObject = jSONObject2;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            }
            getAllTempFiles(jSONObject);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileOpen);
                try {
                    fileOutputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception unused3) {
            }
        }
    }

    public void addLogLine(final JSONObject jSONObject) {
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m269lambda$addLogLine$1$injuspayhypersdkanalyticsLogSessioniserExp(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addLogLine$1$in-juspay-hypersdk-analytics-LogSessioniserExp, reason: not valid java name */
    /* synthetic */ void m269lambda$addLogLine$1$injuspayhypersdkanalyticsLogSessioniserExp(JSONObject jSONObject) {
        int i;
        boolean z;
        if (this.logConfig.shouldPush) {
            JSONArray logChannels = getLogChannels(jSONObject);
            Set<String> channelNames = this.logPusherExp.getChannelNames();
            if (LoggerState.BUFFERING.equals(this.loggerState) && shouldAllowLog(jSONObject)) {
                z = true;
                i = 0;
            } else {
                i = 0;
                z = false;
            }
            while (i < logChannels.length()) {
                if (z) {
                    try {
                        String string = logChannels.getString(i);
                        if (channelNames.contains(string)) {
                            String str = this.logConfig.fileFormat.equals("ndJson") ? ".ndjson" : ".dat";
                            StringBuilder sb = new StringBuilder();
                            sb.append("logs-");
                            sb.append(string);
                            sb.append("-");
                            sb.append(this.rawLogsrequestId);
                            sb.append(String.format(Locale.US, "-%03d", Integer.valueOf(this.batchNumber.incrementAndGet())));
                            sb.append("-0001");
                            sb.append(str);
                            String string2 = sb.toString();
                            try {
                                jSONObject.put("batch_number", this.batchNumber.get());
                            } catch (Exception unused) {
                            }
                            LogWorkspace logWorkspace = this.logWorkspace;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("original/");
                            sb2.append(string2);
                            File fileOpen = logWorkspace.open(sb2.toString());
                            LogUtils.writeLogToFileExp(jSONObject, fileOpen);
                            File fileOpen2 = this.logWorkspace.open(string2);
                            if (fileOpen != null && fileOpen2 != null) {
                                fileOpen.renameTo(fileOpen2);
                            }
                            this.logPusherExp.addLogLines(string, string2);
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    String string3 = logChannels.getString(i);
                    if (channelNames.contains(string3)) {
                        addToLogs(string3, this.rawLogsrequestId, jSONObject);
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$pushToPusher$3$in-juspay-hypersdk-analytics-LogSessioniserExp, reason: not valid java name */
    /* synthetic */ void m270lambda$pushToPusher$3$injuspayhypersdkanalyticsLogSessioniserExp(ConcurrentHashMap concurrentHashMap, boolean z) {
        StringBuilder sb;
        File fileOpen;
        if (LoggerState.BUFFERING.equals(this.loggerState)) {
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ArrayList<String> arrayList = (ArrayList) ((Map.Entry) it.next()).getValue();
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    int iLastIndexOf = str.lastIndexOf(46);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.substring(0, iLastIndexOf));
                    sb2.append(String.format(Locale.US, "-%04d", Integer.valueOf(getLogCount(str))));
                    sb2.append(str.substring(iLastIndexOf));
                    String string = sb2.toString();
                    File fileOpen2 = this.logWorkspace.open("temp/".concat(String.valueOf(str)));
                    File fileOpen3 = this.logWorkspace.open("temp/".concat(String.valueOf(string)));
                    if (fileOpen2 != null && fileOpen2.exists()) {
                        if (fileOpen3 != null) {
                            fileOpen2.renameTo(fileOpen3);
                        }
                        arrayList2.add(string);
                    }
                }
                this.filesObj.addAll(arrayList2);
            }
        }
        if (LoggerState.PUSHING.equals(this.loggerState)) {
            try {
                for (String str2 : this.filesObj) {
                    LogWorkspace logWorkspace = this.logWorkspace;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("temp/");
                    sb3.append(str2);
                    File fileOpen4 = logWorkspace.open(sb3.toString());
                    if (fileOpen4 != null && fileOpen4.exists() && (fileOpen = this.logWorkspace.open(str2)) != null) {
                        fileOpen4.renameTo(fileOpen);
                    }
                }
            } catch (Exception unused) {
            }
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                try {
                    for (String str3 : (ArrayList) ((Map.Entry) it2.next()).getValue()) {
                        LogWorkspace logWorkspace2 = this.logWorkspace;
                        if (z) {
                            sb = new StringBuilder();
                            sb.append("temp/");
                            sb.append(str3);
                        } else {
                            sb = new StringBuilder();
                            sb.append("original/");
                            sb.append(str3);
                        }
                        File fileOpen5 = logWorkspace2.open(sb.toString());
                        if (fileOpen5 != null && fileOpen5.exists()) {
                            int iLastIndexOf2 = str3.lastIndexOf(46);
                            LogWorkspace logWorkspace3 = this.logWorkspace;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3.substring(0, iLastIndexOf2));
                            sb4.append(String.format(Locale.US, "-%04d", Integer.valueOf(getLogCount(str3))));
                            sb4.append(str3.substring(iLastIndexOf2));
                            File fileOpen6 = logWorkspace3.open(sb4.toString());
                            if (fileOpen6 != null) {
                                fileOpen5.renameTo(fileOpen6);
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: lambda$startPushing$2$in-juspay-hypersdk-analytics-LogSessioniserExp, reason: not valid java name */
    /* synthetic */ void m271lambda$startPushing$2$injuspayhypersdkanalyticsLogSessioniserExp() {
        LoggerState loggerState = LoggerState.PUSHING;
        if (loggerState.equals(this.loggerState)) {
            return;
        }
        this.pushFileCreated.set(true);
        updatePushFile();
        synchronized (this.loggerState) {
            this.loggerState = loggerState;
        }
    }

    /* JADX INFO: renamed from: lambda$stopLogSessioniserOnTerminate$0$in-juspay-hypersdk-analytics-LogSessioniserExp, reason: not valid java name */
    /* synthetic */ void m272lambda$stopLogSessioniserOnTerminate$0$injuspayhypersdkanalyticsLogSessioniserExp() {
        try {
            TimerTask timerTask = this.moveToPusher;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.moveToPusherTimer.cancel();
            if (this.logConfig.shouldPush) {
                pushToPusher();
            }
            this.loggerState = LoggerState.TERMINATED;
        } catch (Exception unused) {
        }
        final LogPusherExp logPusherExp = this.logPusherExp;
        Objects.requireNonNull(logPusherExp);
        ExecutorManager.runOnLogPusherThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                logPusherExp.stopLogPusherOnTerminate();
            }
        });
    }

    void startLogSessioniser() {
        if (LoggerState.PUSHING.equals(this.loggerState)) {
            return;
        }
        this.loggerState = LoggerState.BUFFERING;
        try {
            this.logPusherExp.startLogPusher();
            this.logWorkspace.open("temp/").mkdirs();
            this.logWorkspace.open("original/").mkdirs();
            this.moveToPusherTimer = new Timer();
            LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
            this.moveToPusher = logSessioniserTimerTask;
            this.moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, this.logConfig.logSessioniseInterval);
        } catch (Exception unused) {
        }
    }

    public void startPushing() {
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m271lambda$startPushing$2$injuspayhypersdkanalyticsLogSessioniserExp();
            }
        });
    }

    void stopLogSessioniserOnTerminate() {
        ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniserExp$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m272lambda$stopLogSessioniserOnTerminate$0$injuspayhypersdkanalyticsLogSessioniserExp();
            }
        });
    }
}
