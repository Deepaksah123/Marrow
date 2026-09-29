package in.juspay.hypersdk.analytics;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.api.models.response.payment.SdkPayloadKt;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LogSessioniser {
    private final LogConfig logConfig;
    private final LogPusher logPusher;
    private TimerTask moveToPusher;
    private final Workspace workspace;
    private JSONObject logs = new JSONObject();
    private JSONObject rawLogs = new JSONObject();
    private final ArrayList<String> activeRequestIDs = new ArrayList<>();
    private int timerModulus = 0;
    private Timer moveToPusherTimer = new Timer();
    private boolean stopPushingLogs = false;
    private boolean timerStopped = false;

    class LogSessioniserTimerTask extends TimerTask {
        private LogSessioniserTimerTask() {
        }

        /* JADX INFO: renamed from: lambda$run$0$in-juspay-hypersdk-analytics-LogSessioniser$LogSessioniserTimerTask, reason: not valid java name */
        /* synthetic */ void m268lambda$run$0$injuspayhypersdkanalyticsLogSessioniser$LogSessioniserTimerTask() {
            if (LogSessioniser.this.logConfig.shouldPush && LogUtils.isMinMemoryAvailable(LogSessioniser.this.logConfig).booleanValue()) {
                boolean z = LogSessioniser.this.timerModulus == 1;
                LogSessioniser.this.deleteOldFileIfNecessary(LogConstants.LOGS_READING_FILE, LogConstants.LOGS_WRITING_FILE, LogConstants.LOGS_FILE, ".dat");
                LogSessioniser.this.deleteOldFileIfNecessary(LogConstants.TEMP_LOGS_READING_FILE, LogConstants.TEMP_LOGS_WRITING_FILE, LogConstants.TEMP_LOGS_FILE, ".dat");
                if (z) {
                    LogSessioniser.this.activeRequestIDs.clear();
                    LogSessioniser logSessioniser = LogSessioniser.this;
                    logSessioniser.pushLogsFromJsonToPusher(logSessioniser.logs);
                    LogSessioniser.this.clearAllLogFiles(LogConstants.TEMP_LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, LogSessioniser.this.workspace), LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, LogSessioniser.this.workspace));
                    LogSessioniser.this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                    LogSessioniser.this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                }
                if (z) {
                    LogSessioniser logSessioniser2 = LogSessioniser.this;
                    logSessioniser2.logs = logSessioniser2.rawLogs;
                    LogSessioniser.this.rawLogs = new JSONObject();
                } else {
                    LogSessioniser.this.clearAllLogFiles(LogConstants.LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE, LogSessioniser.this.workspace), LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE, LogSessioniser.this.workspace));
                    LogSessioniser.this.workspace.writeToSharedPreference(LogConstants.LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                    LogSessioniser.this.workspace.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                    try {
                        LogSessioniser logSessioniser3 = LogSessioniser.this;
                        logSessioniser3.pushJsonToFile(logSessioniser3.rawLogs, LogConstants.LOGS_FILE, ".dat", LogConstants.LOGS_WRITING_FILE, 0);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, LogSessioniser.this.workspace);
                    int i = fromSharedPreference == -1 ? 0 : fromSharedPreference;
                    try {
                        LogSessioniser logSessioniser4 = LogSessioniser.this;
                        logSessioniser4.pushJsonToFile(logSessioniser4.logs, LogConstants.TEMP_LOGS_FILE, ".dat", LogConstants.TEMP_LOGS_WRITING_FILE, i);
                    } catch (Exception unused2) {
                    }
                }
                if (LogSessioniser.this.logs.length() == 0 && LogSessioniser.this.rawLogs.length() == 0) {
                    LogSessioniser.this.moveToPusherTimer.cancel();
                    LogSessioniser.this.timerStopped = true;
                }
                LogSessioniser.access$104(LogSessioniser.this);
                LogSessioniser.access$144(LogSessioniser.this, 5);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$LogSessioniserTimerTask$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m268lambda$run$0$injuspayhypersdkanalyticsLogSessioniser$LogSessioniserTimerTask();
                }
            });
        }
    }

    LogSessioniser(Workspace workspace, LogConfig logConfig, LogPusher logPusher) {
        this.workspace = workspace;
        this.logConfig = logConfig;
        this.logPusher = logPusher;
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.clearBacklog();
            }
        });
    }

    static /* synthetic */ int access$104(LogSessioniser logSessioniser) {
        int i = logSessioniser.timerModulus + 1;
        logSessioniser.timerModulus = i;
        return i;
    }

    static /* synthetic */ int access$144(LogSessioniser logSessioniser, int i) {
        int i2 = logSessioniser.timerModulus % i;
        logSessioniser.timerModulus = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllLogFiles(String str, String str2, int i, int i2) {
        while (i <= i2) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(str2);
                File fileOpenInCache = this.workspace.openInCache(sb.toString());
                if (fileOpenInCache != null) {
                    fileOpenInCache.delete();
                }
            } catch (Exception unused) {
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBacklog() {
        String str;
        String string;
        if (this.logConfig.shouldPush) {
            ExecutorManager.setLogsThreadId(Thread.currentThread().getId());
            int fromSharedPreference = LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE, this.workspace);
            int fromSharedPreference2 = LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE, this.workspace);
            int i = 0;
            if (fromSharedPreference == -1) {
                this.workspace.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                fromSharedPreference = 0;
            }
            if (fromSharedPreference2 == -1) {
                this.workspace.writeToSharedPreference(LogConstants.LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                fromSharedPreference2 = 0;
            }
            int fromSharedPreference3 = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, this.workspace);
            int fromSharedPreference4 = LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, this.workspace);
            if (fromSharedPreference3 == -1) {
                this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                fromSharedPreference3 = 0;
            }
            if (fromSharedPreference4 == -1) {
                this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            } else {
                i = fromSharedPreference4;
            }
            deleteOldFileIfNecessary(LogConstants.LOGS_READING_FILE, LogConstants.LOGS_WRITING_FILE, LogConstants.LOGS_FILE, ".dat");
            String str2 = LogConstants.TEMP_LOGS_FILE;
            deleteOldFileIfNecessary(LogConstants.TEMP_LOGS_READING_FILE, LogConstants.TEMP_LOGS_WRITING_FILE, LogConstants.TEMP_LOGS_FILE, ".dat");
            while (i <= fromSharedPreference3) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(i);
                    sb.append(".dat");
                    string = sb.toString();
                } catch (Exception unused) {
                }
                if (JuspayCoreLib.getApplicationContext() != null) {
                    File file = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), string);
                    str = str2;
                    try {
                        if (file.length() <= this.logConfig.maxLogFileSize && file.exists() && LogUtils.isFileEligibleToPush(file, this.logConfig)) {
                            this.logPusher.addLogsFromSessioniser(LogUtils.getLogsFromFile(file));
                        }
                        file.delete();
                    } catch (Exception unused2) {
                    }
                } else {
                    str = str2;
                }
                i++;
                str2 = str;
            }
            this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            while (fromSharedPreference2 <= fromSharedPreference) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(LogConstants.LOGS_FILE);
                    sb2.append(fromSharedPreference2);
                    sb2.append(".dat");
                    String string2 = sb2.toString();
                    if (JuspayCoreLib.getApplicationContext() != null) {
                        File file2 = new File(JuspayCoreLib.getApplicationContext().getCacheDir(), string2);
                        if (file2.length() <= this.logConfig.maxLogFileSize && file2.exists() && LogUtils.isFileEligibleToPush(file2, this.logConfig)) {
                            this.logPusher.addLogsFromSessioniser(LogUtils.getLogsFromFile(file2));
                        }
                        file2.delete();
                    }
                } catch (Exception unused3) {
                }
                fromSharedPreference2++;
            }
            this.workspace.writeToSharedPreference(LogConstants.LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            this.workspace.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
        }
    }

    private static String constructErrorMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder("{\"requestId\":\"");
        sb.append(str2);
        sb.append("\",\"error\":true,\"logs\":{},\"errorMessage\":\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteOldFileIfNecessary(String str, String str2, String str3, String str4) {
        int fromSharedPreference = LogUtils.getFromSharedPreference(str, this.workspace);
        int fromSharedPreference2 = LogUtils.getFromSharedPreference(str2, this.workspace);
        if (JuspayCoreLib.getApplicationContext() == null || (fromSharedPreference2 - fromSharedPreference) + 1 <= this.logConfig.maxFilesAllowed) {
            return;
        }
        while ((fromSharedPreference2 - fromSharedPreference) + 1 > this.logConfig.numFilesToLeaveIfMaxFilesExceeded) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(fromSharedPreference);
            sb.append(str4);
            File fileOpenInCache = this.workspace.openInCache(sb.toString());
            if (fileOpenInCache != null) {
                try {
                    fileOpenInCache.delete();
                } catch (Exception unused) {
                }
            }
            fromSharedPreference++;
        }
        this.workspace.writeToSharedPreference(str, String.valueOf(fromSharedPreference));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushJsonToFile(JSONObject jSONObject, String str, String str2, String str3, int i) throws JSONException, IOException {
        boolean z;
        Iterator<String> itKeys = jSONObject.keys();
        Workspace workspace = this.workspace;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i2 = i;
        sb.append(i2);
        sb.append(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(workspace.openInCache(sb.toString()), true);
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObject2.toString());
                sb2.append(LogConstants.LOG_DELIMITER);
                byte[] bytes = sb2.toString().getBytes(StandardCharsets.UTF_8);
                long length = bytes.length;
                Workspace workspace2 = this.workspace;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i2);
                sb3.append(str2);
                long length2 = workspace2.openInCache(sb3.toString()).length();
                LogConfig logConfig = this.logConfig;
                if (length2 + length <= logConfig.maxLogFileSize) {
                    fileOutputStream.write(bytes);
                } else {
                    if (length <= logConfig.maxLogLineSize) {
                        i2++;
                        this.workspace.writeToSharedPreference(str3, String.valueOf(i2));
                        Workspace workspace3 = this.workspace;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(i2);
                        sb4.append(str2);
                        z = true;
                        FileOutputStream fileOutputStream2 = new FileOutputStream(workspace3.openInCache(sb4.toString()), true);
                        fileOutputStream2.write(bytes);
                        fileOutputStream = fileOutputStream2;
                    }
                }
                z = true;
            }
        }
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pushLogsFromJsonToPusher(JSONObject jSONObject) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.logPusher.addLogLines(jSONObject.getJSONArray(itKeys.next()));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void startLogSessioniserOnLogCount() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m266lambda$startLogSessioniserOnLogCount$1$injuspayhypersdkanalyticsLogSessioniser();
            }
        });
    }

    public void addLogLine(final String str, final JSONObject jSONObject) {
        if (this.stopPushingLogs || !this.logConfig.shouldPush) {
            return;
        }
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m262lambda$addLogLine$4$injuspayhypersdkanalyticsLogSessioniser(jSONObject, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addLogLine$4$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m262lambda$addLogLine$4$injuspayhypersdkanalyticsLogSessioniser(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE).toString().getBytes().length > this.logConfig.maxLogValueSize) {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "Filtered");
                JuspayLogger.i("LogSessioniser", "Filtering the value of log as the size of value is greater than 32 KB");
            }
            startLogSessioniserOnLogCount();
            if (this.rawLogs.has(str)) {
                this.rawLogs.accumulate(str, jSONObject);
                return;
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            this.rawLogs.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$pushLogsToPusher$2$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m263lambda$pushLogsToPusher$2$injuspayhypersdkanalyticsLogSessioniser() {
        try {
            if (pushLogsFromJsonToPusher(this.logs)) {
                this.logs = new JSONObject();
                clearAllLogFiles(LogConstants.TEMP_LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, this.workspace), LogUtils.getFromSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, this.workspace));
                this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                this.workspace.writeToSharedPreference(LogConstants.TEMP_LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            }
            if (pushLogsFromJsonToPusher(this.rawLogs)) {
                this.rawLogs = new JSONObject();
                clearAllLogFiles(LogConstants.LOGS_FILE, ".dat", LogUtils.getFromSharedPreference(LogConstants.LOGS_READING_FILE, this.workspace), LogUtils.getFromSharedPreference(LogConstants.LOGS_WRITING_FILE, this.workspace));
                this.workspace.writeToSharedPreference(LogConstants.LOGS_READING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
                this.workspace.writeToSharedPreference(LogConstants.LOGS_WRITING_FILE, SessionDescription.SUPPORTED_SDP_VERSION);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$sessioniseLogs$5$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m264lambda$sessioniseLogs$5$injuspayhypersdkanalyticsLogSessioniser(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("sessionId");
            String string2 = jSONObject.getString(SdkPayloadKt.KEY_JP_REQUEST_ID);
            JSONArray jSONArray = jSONObject.getJSONArray("logs");
            if (!this.activeRequestIDs.contains(string2) || jSONArray.toString().getBytes().length > this.logConfig.maxLogLineSize) {
                return;
            }
            startLogSessioniserOnLogCount();
            this.logs.put(string, jSONArray);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$startLogSessioniser$0$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m265lambda$startLogSessioniser$0$injuspayhypersdkanalyticsLogSessioniser() {
        try {
            this.stopPushingLogs = false;
            this.moveToPusherTimer = new Timer();
            LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
            this.moveToPusher = logSessioniserTimerTask;
            this.moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, this.logConfig.logSessioniseInterval);
            this.timerStopped = false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$startLogSessioniserOnLogCount$1$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m266lambda$startLogSessioniserOnLogCount$1$injuspayhypersdkanalyticsLogSessioniser() {
        try {
            if (this.timerStopped) {
                this.moveToPusherTimer = new Timer();
                LogSessioniserTimerTask logSessioniserTimerTask = new LogSessioniserTimerTask();
                this.moveToPusher = logSessioniserTimerTask;
                this.moveToPusherTimer.scheduleAtFixedRate(logSessioniserTimerTask, 0L, this.logConfig.logSessioniseInterval);
                this.timerStopped = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$stopLogSessioniserOnTerminate$3$in-juspay-hypersdk-analytics-LogSessioniser, reason: not valid java name */
    /* synthetic */ void m267lambda$stopLogSessioniserOnTerminate$3$injuspayhypersdkanalyticsLogSessioniser() {
        try {
            this.moveToPusherTimer.cancel();
            pushLogsToPusher();
            this.timerStopped = true;
            this.stopPushingLogs = true;
        } catch (Exception unused) {
        }
    }

    void pushLogsToPusher() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m263lambda$pushLogsToPusher$2$injuspayhypersdkanalyticsLogSessioniser();
            }
        });
    }

    public void sessioniseLogs(final JSONObject jSONObject) {
        if (this.stopPushingLogs || !this.logConfig.shouldPush) {
            return;
        }
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m264lambda$sessioniseLogs$5$injuspayhypersdkanalyticsLogSessioniser(jSONObject);
            }
        });
    }

    void startLogSessioniser() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m265lambda$startLogSessioniser$0$injuspayhypersdkanalyticsLogSessioniser();
            }
        });
    }

    void stopLogSessioniserOnTerminate() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogSessioniser$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m267lambda$stopLogSessioniserOnTerminate$3$injuspayhypersdkanalyticsLogSessioniser();
            }
        });
    }

    public String getLogsFromSessionId(JSONObject jSONObject) {
        String string;
        String string2;
        String str;
        if (jSONObject != null) {
            try {
                string2 = jSONObject.getString(SdkPayloadKt.KEY_JP_REQUEST_ID);
                try {
                    string = jSONObject.getString("sessionId");
                    try {
                        this.activeRequestIDs.add(string2);
                        JSONArray jSONArrayOptJSONArray = this.logs.optJSONArray(string);
                        if (jSONArrayOptJSONArray != null) {
                            return new JSONObject().put(SdkPayloadKt.KEY_JP_REQUEST_ID, string2).put("error", false).put("logs", jSONArrayOptJSONArray).toString();
                        }
                        return constructErrorMessage("No logs saved to file", string2);
                    } catch (JSONException unused) {
                        if (string2.equals("")) {
                            str = "RequestId not sent";
                        } else {
                            str = string.equals("") ? "SessionId not sent" : "Request invalid";
                        }
                        return constructErrorMessage(str, string2);
                    }
                } catch (JSONException unused2) {
                    string = "";
                }
            } catch (JSONException unused3) {
                string = "";
                string2 = string;
            }
        } else {
            return constructErrorMessage("Request Invalid", "");
        }
    }
}
