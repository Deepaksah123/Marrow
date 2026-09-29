package in.juspay.hypersdk.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.services.Workspace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.TestGroupLSModel;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u00020\u0001:\u0002DEB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0016J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0016R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0!8G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010*\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00104\u001a\u000e*\u000602R\u00020302R\u0002038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010C"}, d2 = {"Lin/juspay/hypersdk/analytics/LogManager;", "", "Lin/juspay/hypersdk/services/Workspace;", "p0", "Lorg/json/JSONObject;", "p1", "p2", "<init>", "(Lin/juspay/hypersdk/services/Workspace;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "", "", "addChannel", "(Ljava/lang/String;Ljava/lang/String;)Z", "addChannelExp", "", "addLogLine", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "addLogsToPersistedQueue", "(Lorg/json/JSONObject;)V", "experimentalEnabled", "()Z", "flushLogPush", "()V", "setEndPointSandbox", "(Z)V", "setHeaders", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "setLogHeaderValues", "startLogPusherTimer", "startPushExp", "startPushTasks", "stopLogPusherOnTerminate", "stopPushTasks", "", "getChannelNames", "()[Ljava/lang/String;", "channelNames", "getChannelNamesExp", "channelNamesExp", "classicEnabled", "Z", "Lin/juspay/hypersdk/analytics/LogConfig;", "logConfig", "Lin/juspay/hypersdk/analytics/LogConfig;", "Lin/juspay/hypersdk/analytics/LogManager$LogMode;", "logMode", "Lin/juspay/hypersdk/analytics/LogManager$LogMode;", "Ljava/util/Timer;", "logPushTimer", "Ljava/util/Timer;", "Lin/juspay/hypersdk/analytics/LogPusher$LogPushTimerTask;", "Lin/juspay/hypersdk/analytics/LogPusher;", "logPushTimerTask", "Lin/juspay/hypersdk/analytics/LogPusher$LogPushTimerTask;", "logPusher", "Lin/juspay/hypersdk/analytics/LogPusher;", "Lin/juspay/hypersdk/analytics/LogPusherExp;", "logPusherExp", "Lin/juspay/hypersdk/analytics/LogPusherExp;", "Ljava/util/concurrent/atomic/AtomicInteger;", "logPusherNumCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lin/juspay/hypersdk/analytics/LogSessioniser;", "logSessioniser", "Lin/juspay/hypersdk/analytics/LogSessioniser;", "Lin/juspay/hypersdk/analytics/LogSessioniserExp;", "logSessioniserExp", "Lin/juspay/hypersdk/analytics/LogSessioniserExp;", "Companion", "LogMode"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, LogManager> GLOBAL_LOG_MANAGER_MAP = new HashMap();
    private static final AtomicBoolean INIT_STATE = new AtomicBoolean(false);
    private final boolean classicEnabled;
    private final boolean experimentalEnabled;
    public final LogConfig logConfig;
    private final LogMode logMode;
    private Timer logPushTimer;
    private LogPusher.LogPushTimerTask logPushTimerTask;
    public final LogPusher logPusher;
    private final LogPusherExp logPusherExp;
    private final AtomicInteger logPusherNumCounter;
    public final LogSessioniser logSessioniser;
    private final LogSessioniserExp logSessioniserExp;

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lin/juspay/hypersdk/analytics/LogManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/SharedPreferences;", "getAnalyticsSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Lorg/json/JSONObject;", "Lin/juspay/hypersdk/analytics/LogManager$LogMode;", "getLogMode", "(Lorg/json/JSONObject;)Lin/juspay/hypersdk/analytics/LogManager$LogMode;", "", "Lin/juspay/hypersdk/services/Workspace;", "loadSavedWorkspaces", "(Landroid/content/Context;)Ljava/util/List;", "Lin/juspay/hypersdk/services/SdkConfigService;", "p1", "p2", "", "registerSavedWorkspaces", "(Landroid/content/Context;Lin/juspay/hypersdk/services/SdkConfigService;Lorg/json/JSONObject;)V", "", "p3", "p4", "Lin/juspay/hypersdk/analytics/LogManager;", "registerWorkspace", "(Landroid/content/Context;Lin/juspay/hypersdk/services/Workspace;Lorg/json/JSONObject;ZLorg/json/JSONObject;)Lin/juspay/hypersdk/analytics/LogManager;", "(Landroid/content/Context;Lin/juspay/hypersdk/services/Workspace;Lorg/json/JSONObject;Lorg/json/JSONObject;Lin/juspay/hypersdk/services/SdkConfigService;)Lin/juspay/hypersdk/analytics/LogManager;", "", "saveWorkspace", "(Landroid/content/Context;Ljava/lang/String;)V", "", "GLOBAL_LOG_MANAGER_MAP", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "INIT_STATE", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        private final SharedPreferences getAnalyticsSharedPreferences(Context p0) {
            SharedPreferences sharedPreferences = p0.getSharedPreferences(LogConstants.ANALYTICS_SHARED_PREFERENCES, 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedPreferences, "");
            return sharedPreferences;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LogMode getLogMode(JSONObject p0) {
            JSONObject jSONObjectOptJSONObject = p0.optJSONObject("logsConfig");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("workingLogger", "json-array");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString, (Object) "byte-d-json")) {
                    return LogMode.BYTE_D_JSON;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strOptString, (Object) "both")) {
                    return LogMode.BOTH;
                }
            }
            return LogMode.JSON_ARRAY;
        }

        private final List<Workspace> loadSavedWorkspaces(Context p0) {
            List listWrite;
            ArrayList arrayList = null;
            String string = getAnalyticsSharedPreferences(p0).getString(LogConstants.SAVED_WORKSPACES, null);
            if (string != null && (listWrite = TestGroupLSModel.write(string, new String[]{","}, 0, 6)) != null) {
                arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
                Iterator it = listWrite.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Workspace(p0, (String) it.next()));
                }
            }
            return arrayList == null ? new ArrayList() : arrayList;
        }

        private final void registerSavedWorkspaces(final Context p0, final SdkConfigService p1, final JSONObject p2) {
            ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogManager$Companion$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LogManager.Companion.registerSavedWorkspaces$lambda$0(p0, p1, p2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerSavedWorkspaces$lambda$0(Context context, SdkConfigService sdkConfigService, JSONObject jSONObject) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(sdkConfigService, "");
            ExecutorManager.setLogsThreadId(Thread.currentThread().getId());
            for (Workspace workspace : LogManager.INSTANCE.loadSavedWorkspaces(context)) {
                Companion companion = LogManager.INSTANCE;
                JSONObject sdkConfig = sdkConfigService.getSdkConfig();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sdkConfig, "");
                companion.registerWorkspace(context, workspace, sdkConfig, false, jSONObject);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerWorkspace$lambda$2(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            LogManager.INSTANCE.saveWorkspace(context, str);
        }

        private final void saveWorkspace(Context p0, String p1) {
            List listWrite;
            SharedPreferences analyticsSharedPreferences = getAnalyticsSharedPreferences(p0);
            String string = analyticsSharedPreferences.getString(LogConstants.SAVED_WORKSPACES, null);
            Boolean boolValueOf = (string == null || (listWrite = TestGroupLSModel.write(string, new String[]{","}, 0, 6)) == null) ? null : Boolean.valueOf(listWrite.contains(p1));
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(boolValueOf, Boolean.TRUE)) {
                p1 = null;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(boolValueOf, Boolean.FALSE)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(',');
                sb.append(p1);
                p1 = sb.toString();
            } else if (boolValueOf != null) {
                throw new RenewEligibleCreator();
            }
            if (p1 != null) {
                analyticsSharedPreferences.edit().putString(LogConstants.SAVED_WORKSPACES, p1).apply();
            }
        }

        @getMagicModuleMeta
        public final LogManager registerWorkspace(Context p0, Workspace p1, JSONObject p2, JSONObject p3, SdkConfigService p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            LogManager logManagerRegisterWorkspace = registerWorkspace(p0, p1, p2, true, p3);
            if (!LogManager.INIT_STATE.getAndSet(true)) {
                registerSavedWorkspaces(p0, p4, p3);
            }
            return logManagerRegisterWorkspace;
        }

        private Companion() {
        }

        private final LogManager registerWorkspace(final Context p0, Workspace p1, JSONObject p2, boolean p3, JSONObject p4) {
            LogManager logManager;
            synchronized (this) {
                final String path = p1.getPath();
                logManager = (LogManager) LogManager.GLOBAL_LOG_MANAGER_MAP.get(path);
                if (logManager == null) {
                    if (p3) {
                        ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogManager$Companion$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                LogManager.Companion.registerWorkspace$lambda$2(p0, path);
                            }
                        });
                    }
                    logManager = new LogManager(p1, p2, p4, null);
                    LogManager.GLOBAL_LOG_MANAGER_MAP.put(path, logManager);
                }
            }
            return logManager;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lin/juspay/hypersdk/analytics/LogManager$LogMode;", "", "<init>", "(Ljava/lang/String;I)V", "JSON_ARRAY", "BYTE_D_JSON", "BOTH"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogMode {
        JSON_ARRAY,
        BYTE_D_JSON,
        BOTH
    }

    public /* synthetic */ LogManager(Workspace workspace, JSONObject jSONObject, JSONObject jSONObject2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(workspace, jSONObject, jSONObject2);
    }

    private final void startLogPusherTimer() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LogManager.startLogPusherTimer$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLogPusherTimer$lambda$1(LogManager logManager) {
        toMagicModuleMetaRepoModel.write(logManager, "");
        if (logManager.logConfig.shouldPush) {
            try {
                logManager.logPusher.setPushState(true);
                logManager.logSessioniser.startLogSessioniser();
                Timer timer = new Timer();
                logManager.logPushTimer = timer;
                LogPusher.LogPushTimerTask logPushTimerTask = logManager.logPushTimerTask;
                long j = logManager.logConfig.logPostInterval;
                timer.scheduleAtFixedRate(logPushTimerTask, j, j);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startPushTasks$lambda$0(LogManager logManager, boolean z) {
        toMagicModuleMetaRepoModel.write(logManager, "");
        logManager.logSessioniserExp.startLogSessioniser();
        if (z) {
            logManager.logSessioniserExp.startPushing();
        }
    }

    private final void stopLogPusherOnTerminate() {
        ExecutorManager.runOnLogsPool(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LogManager.stopLogPusherOnTerminate$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopLogPusherOnTerminate$lambda$2(LogManager logManager) {
        toMagicModuleMetaRepoModel.write(logManager, "");
        if (logManager.logConfig.shouldPush) {
            try {
                logManager.logSessioniser.stopLogSessioniserOnTerminate();
                Timer timer = logManager.logPushTimer;
                if (timer != null) {
                    timer.cancel();
                }
                LogPusher.LogPushTimerTask logPushTimerTaskCreatePusherTask = logManager.logPusher.createPusherTask();
                logManager.logPushTimerTask = logPushTimerTaskCreatePusherTask;
                logPushTimerTaskCreatePusherTask.run();
                logManager.logPusher.setPushState(false);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean addChannel(String p0, String p1) {
        if (this.classicEnabled) {
            return this.logPusher.addChannelFromJS(p0, p1);
        }
        return false;
    }

    public final boolean addChannelExp(String p0, String p1) {
        if (this.experimentalEnabled) {
            return this.logPusherExp.addChannelFromJS(p0, p1);
        }
        return false;
    }

    public final void addLogLine(String p0, JSONObject p1) {
        if (this.classicEnabled) {
            this.logSessioniser.addLogLine(p0, p1);
        }
        if (this.experimentalEnabled) {
            this.logSessioniserExp.addLogLine(p1);
        }
    }

    public final void addLogsToPersistedQueue(JSONObject p0) {
        if (this.classicEnabled) {
            this.logPusher.addLogsToPersistedQueue(p0);
        }
        if (this.experimentalEnabled) {
            this.logPusherExp.addLogsToPersistedQueue(p0);
        }
    }

    /* JADX INFO: renamed from: experimentalEnabled, reason: from getter */
    public final boolean getExperimentalEnabled() {
        return this.experimentalEnabled;
    }

    public final void flushLogPush() {
        if (this.classicEnabled) {
            this.logSessioniser.pushLogsToPusher();
            LogPusher.LogPushTimerTask logPushTimerTask = this.logPushTimerTask;
            if (logPushTimerTask != null) {
                logPushTimerTask.pushAllLogs();
            }
        }
        if (this.experimentalEnabled) {
            this.logPusherExp.pushAllLogs();
        }
    }

    public final String[] getChannelNames() {
        if (!this.classicEnabled) {
            return new String[0];
        }
        String[] channelNames = this.logPusher.getChannelNames();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(channelNames, "");
        return channelNames;
    }

    public final String[] getChannelNamesExp() {
        if (!this.experimentalEnabled) {
            return new String[0];
        }
        Set<String> channelNames = this.logPusherExp.getChannelNames();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(channelNames, "");
        return (String[]) channelNames.toArray(new String[0]);
    }

    public final void setEndPointSandbox(boolean p0) {
        if (this.classicEnabled) {
            this.logPusher.setEndPointSandbox(Boolean.valueOf(p0));
        }
        if (this.experimentalEnabled) {
            this.logPusherExp.setEndPointSandbox(Boolean.valueOf(p0));
        }
    }

    public final void setHeaders(JSONObject p0, String p1) {
        if (this.classicEnabled) {
            this.logPusher.setHeaders(p0, p1);
        }
        if (this.experimentalEnabled) {
            this.logPusherExp.setHeaders(p0, p1);
        }
    }

    public final void setLogHeaderValues(JSONObject p0, String p1) {
        if (this.classicEnabled) {
            this.logPusher.setLogHeaderValues(p0, p1);
        }
        if (this.experimentalEnabled) {
            this.logPusherExp.setLogHeaderValues(p0, p1);
        }
    }

    public final void startPushExp() {
        if (this.experimentalEnabled) {
            this.logSessioniserExp.startPushing();
        }
    }

    public final void startPushTasks(final boolean p0) {
        if (this.logPusherNumCounter.getAndIncrement() == 0) {
            if (this.classicEnabled) {
                startLogPusherTimer();
            }
            if (this.experimentalEnabled) {
                ExecutorManager.runOnLogSessioniserThread(new Runnable() { // from class: in.juspay.hypersdk.analytics.LogManager$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        LogManager.startPushTasks$lambda$0(this.f$0, p0);
                    }
                });
            }
        }
    }

    public final void stopPushTasks() {
        if (this.logPusherNumCounter.decrementAndGet() <= 0) {
            this.logPusherNumCounter.set(0);
            if (this.classicEnabled) {
                stopLogPusherOnTerminate();
            }
            if (this.experimentalEnabled) {
                this.logSessioniserExp.stopLogSessioniserOnTerminate();
            }
        }
    }

    private LogManager(Workspace workspace, JSONObject jSONObject, JSONObject jSONObject2) {
        LogConfig logConfig = new LogConfig(jSONObject, jSONObject2);
        this.logConfig = logConfig;
        LogPusher logPusher = new LogPusher(workspace, logConfig);
        this.logPusher = logPusher;
        this.logSessioniser = new LogSessioniser(workspace, logConfig, logPusher);
        LogPusherExp logPusherExp = new LogPusherExp(workspace, logConfig);
        this.logPusherExp = logPusherExp;
        this.logSessioniserExp = new LogSessioniserExp(workspace, logConfig, logPusherExp);
        this.logPusherNumCounter = new AtomicInteger(0);
        this.logPushTimerTask = logPusher.createPusherTask();
        LogMode logMode = INSTANCE.getLogMode(jSONObject);
        this.logMode = logMode;
        this.classicEnabled = logMode == LogMode.JSON_ARRAY || logMode == LogMode.BOTH;
        this.experimentalEnabled = logMode == LogMode.BYTE_D_JSON || logMode == LogMode.BOTH;
    }

    @getMagicModuleMeta
    public static final LogManager registerWorkspace(Context context, Workspace workspace, JSONObject jSONObject, JSONObject jSONObject2, SdkConfigService sdkConfigService) {
        return INSTANCE.registerWorkspace(context, workspace, jSONObject, jSONObject2, sdkConfigService);
    }
}
