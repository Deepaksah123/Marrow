package in.juspay.hypersdk.core;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import java.util.Arrays;
import java.util.Objects;
import kotlin.ThemeAlphaConstantsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JsInterface {
    private static final String LOG_TAG = "JsInterface";
    private final Context context;
    private final FileProviderService fileProviderService;
    protected final JuspayServices juspayServices;
    private final LogManager logManager;
    private final LogSessioniser logSessioniser;
    private final RemoteAssetService remoteAssetService;
    private final SdkTracker sdkTracker;
    private final SessionInfo sessionInfo;
    protected final Workspace workspace;

    public JsInterface(JuspayServices juspayServices) {
        this.context = juspayServices.getContext();
        this.juspayServices = juspayServices;
        this.workspace = juspayServices.getWorkspace();
        LogManager logManager = juspayServices.getLogManager();
        this.logManager = logManager;
        this.logSessioniser = logManager.logSessioniser;
        this.sessionInfo = juspayServices.getSessionInfo();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.remoteAssetService = juspayServices.getRemoteAssetService();
        this.fileProviderService = juspayServices.getFileProviderService();
    }

    @JavascriptInterface
    public boolean addChannel(String str, String str2) {
        return this.logManager.addChannel(str, str2);
    }

    @JavascriptInterface
    public boolean addChannelExp(String str, String str2) {
        return this.logManager.addChannelExp(str, str2);
    }

    @JavascriptInterface
    public void addLogProperties(final String str) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.JsInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m324lambda$addLogProperties$0$injuspayhypersdkcoreJsInterface(str);
            }
        });
    }

    @JavascriptInterface
    public void addToLogList(String str) {
        if (this.sessionInfo.getSessionId() == null) {
            SdkTracker.addToBootLogs(str);
            return;
        }
        try {
            this.sdkTracker.track(new JSONObject(str));
        } catch (JSONException e) {
            this.sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while parsing the JSON", e);
        }
    }

    @JavascriptInterface
    public boolean checkIfVPNConnected() {
        return Utils.checkIfVPNConnected(this.context);
    }

    @JavascriptInterface
    public String getChannelNames() {
        return Arrays.toString(this.logManager.getChannelNames());
    }

    @JavascriptInterface
    public String getChannelNamesExp() {
        return Arrays.toString(this.logManager.getChannelNamesExp());
    }

    @JavascriptInterface
    public String getFileDownloadTimes() {
        return this.remoteAssetService.getFileDownloadTimes().toString();
    }

    @JavascriptInterface
    public String getFilePath(String str) {
        return this.fileProviderService.appendSdkNameAndVersion(str);
    }

    @JavascriptInterface
    public String getFromSharedPrefs(String str) {
        return this.workspace.getFromSharedPreference(str, "__failed");
    }

    @JavascriptInterface
    public String getLogList() {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.getLogList() method. It will be removed in future.");
        return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getMd5(String str) {
        return EncryptionHelper.md5(str.getBytes());
    }

    @JavascriptInterface
    public String getResourceById(int i) {
        return this.context.getResources().getString(i);
    }

    @JavascriptInterface
    public String getResourceByName(String str) {
        return getResourceById(this.context.getResources().getIdentifier(str, "string", this.context.getPackageName()));
    }

    @JavascriptInterface
    public String getRootFragmentSize() {
        JSONObject jSONObject = new JSONObject();
        if (this.juspayServices.getContainer() != null) {
            try {
                try {
                    jSONObject.put("height", String.valueOf(this.juspayServices.getContainer().getHeight()));
                    jSONObject.put("width", String.valueOf(this.juspayServices.getContainer().getWidth()));
                } catch (JSONException unused) {
                    jSONObject.put("height", this.sessionInfo.getScreenHeight() != null ? this.sessionInfo.getScreenHeight() : "");
                    jSONObject.put("width", this.sessionInfo.getScreenWidth() != null ? this.sessionInfo.getScreenWidth() : "");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                jSONObject.put("height", this.sessionInfo.getScreenHeight() != null ? this.sessionInfo.getScreenHeight() : "");
                jSONObject.put("width", this.sessionInfo.getScreenWidth() != null ? this.sessionInfo.getScreenWidth() : "");
            } catch (JSONException unused2) {
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getSessionAttribute(String str, String str2) {
        return this.sessionInfo.get(str, str2);
    }

    @JavascriptInterface
    public String getSessionId() {
        return this.sessionInfo.getSessionId();
    }

    @JavascriptInterface
    public String getSessionInfo() {
        this.sessionInfo.createSessionDataMap();
        return this.sessionInfo.toString();
    }

    @JavascriptInterface
    public String getWorkspaceRoot() {
        return this.juspayServices.getWorkspace().getRoot().toString();
    }

    @JavascriptInterface
    public boolean isFilePresent(String str) {
        return this.fileProviderService.isFilePresent(this.context, str);
    }

    @JavascriptInterface
    public boolean isNetworkAvailable() {
        return this.sessionInfo.isNetworkAvailable();
    }

    /* JADX INFO: renamed from: lambda$addLogProperties$0$in-juspay-hypersdk-core-JsInterface, reason: not valid java name */
    /* synthetic */ void m324lambda$addLogProperties$0$injuspayhypersdkcoreJsInterface(String str) {
        try {
            this.sdkTracker.addLogProperties(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$setAnalyticsHeader$1$in-juspay-hypersdk-core-JsInterface, reason: not valid java name */
    /* synthetic */ void m326lambda$setAnalyticsHeader$1$injuspayhypersdkcoreJsInterface(JSONObject jSONObject, String str) {
        this.juspayServices.getLogManager().setHeaders(jSONObject, str);
    }

    @JavascriptInterface
    public String loadFileInDUI(String str, int i) {
        return this.fileProviderService.readFromFile(this.context, str);
    }

    @JavascriptInterface
    public void postLogs(String str, String str2) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.postLogs() method. It will be removed in future.");
    }

    @JavascriptInterface
    public void removeAttribute(String str) {
        this.sessionInfo.removeAttribute(str);
    }

    @JavascriptInterface
    public void removeDataFromSharedPrefs(String str) {
        this.workspace.removeFromSharedPreference(str);
    }

    @JavascriptInterface
    public void removeFromSharedPrefs(String str) {
        this.workspace.removeFromSharedPreference(str);
    }

    @JavascriptInterface
    public void renewFile(String str) {
        renewFile(str, null, null);
    }

    @JavascriptInterface
    public void renewSdkConfig() {
        this.juspayServices.getSdkConfigService().renewConfig(this.context);
    }

    @JavascriptInterface
    public String requestPendingLogs(String str) {
        try {
            return (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) ? this.logSessioniser.getLogsFromSessionId(new JSONObject(str)) : "{}";
        } catch (JSONException unused) {
            return "{}";
        }
    }

    @JavascriptInterface
    public void sessioniseLogs(String str) {
        try {
            if (!Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") && !Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
                return;
            }
            this.logSessioniser.sessioniseLogs(new JSONObject(str));
        } catch (JSONException e) {
            this.sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Logs request has invalid format".concat(String.valueOf(str)), e);
        }
    }

    @JavascriptInterface
    public void setAnalyticsEndPoint(String str) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.setAnalyticsEndPoint() method. It will be removed in future.");
    }

    @JavascriptInterface
    public boolean setAnalyticsHeader(String str) {
        return setAnalyticsHeader(str, LogConstants.DEFAULT_CHANNEL);
    }

    @JavascriptInterface
    public void setInSharedPrefs(String str, String str2) {
        this.workspace.writeToSharedPreference(str, str2);
    }

    @JavascriptInterface
    public void setSessionAttribute(String str, String str2) {
        this.sessionInfo.set(str, str2);
    }

    @JavascriptInterface
    public void setSessionId(String str) {
        JuspayLogger.d(LOG_TAG, "JBridge.setSessionId() is intended for changing the Session ID of the SDK. Not to be called by each micro-app");
        JuspayLogger.d(LOG_TAG, "Attempted Session ID: ".concat(String.valueOf(str)));
    }

    @JavascriptInterface
    public void startPushingLogs() {
        this.logManager.startPushExp();
    }

    @JavascriptInterface
    public void submitAllLogs() {
    }

    @JavascriptInterface
    public void toast(String str) {
        Toast.makeText(this.context, str, 1).show();
    }

    @JavascriptInterface
    public void updateLogList(String str) {
        JuspayLogger.e(LOG_TAG, "No one should call JBridge.updateLogList() method. It will be removed in future.");
    }

    @JavascriptInterface
    public String loadFileInDUI(String str) {
        return this.fileProviderService.readFromFile(this.context, str);
    }

    @JavascriptInterface
    public void renewFile(String str, String str2) {
        renewFile(str, str2, null);
    }

    @JavascriptInterface
    public boolean setAnalyticsHeader(String str, final String str2) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            ExecutorManager.runOnLogPusherThread(new Runnable() { // from class: in.juspay.hypersdk.core.JsInterface$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m326lambda$setAnalyticsHeader$1$injuspayhypersdkcoreJsInterface(jSONObject, str2);
                }
            });
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: lambda$requestPendingLogs$2$in-juspay-hypersdk-core-JsInterface, reason: not valid java name */
    /* synthetic */ void m325lambda$requestPendingLogs$2$injuspayhypersdkcoreJsInterface(String str, String str2) {
        String logsFromSessionId;
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            logsFromSessionId = this.logSessioniser.getLogsFromSessionId(new JSONObject(str));
        } else {
            logsFromSessionId = "{}";
        }
        this.juspayServices.getJBridge().invokeCallbackInDUIWebview(str2, logsFromSessionId);
    }

    @JavascriptInterface
    public void renewFile(String str, String str2, String str3) {
        this.remoteAssetService.renewFile(this.context, str, str3, str2, System.currentTimeMillis());
    }

    @JavascriptInterface
    public void requestPendingLogs(final String str, final String str2) {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.core.JsInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m325lambda$requestPendingLogs$2$injuspayhypersdkcoreJsInterface(str, str2);
            }
        });
    }
}
