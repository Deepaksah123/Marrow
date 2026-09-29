package in.juspay.hypersdk.ota;

import android.content.Context;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.ota.Mode;
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateResult;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.C0177getRfBanners;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.RenewEligibleCreator;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.downloadMagicModuleDetail;
import kotlin.getFinalData;
import kotlin.getKycMessage;
import kotlin.getOrderDetails;
import kotlin.getShowPopup;
import kotlin.newYearNameItem;
import kotlin.setAction;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000 ]2\u00020\u0001:\u0003]^_B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u001e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002J\u0006\u0010(\u001a\u00020$J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u0005J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020*H\u0002J\u000e\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u0005J\u001c\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020,2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005H\u0002J\u001f\u00106\u001a\u0004\u0018\u00010$2\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u001eH\u0002¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0002J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050=2\u0006\u0010;\u001a\u00020\u0005H\u0002J\u0012\u0010>\u001a\u0004\u0018\u00010\u001c2\u0006\u0010?\u001a\u00020\u0001H\u0002J\u0010\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0002J\u000e\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J\u000e\u0010D\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005J\u0016\u0010E\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002J\u0018\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010M\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00104\u001a\u00020,H\u0002J*\u0010N\u001a\u00020$2\u0006\u00105\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u00052\u0010\b\u0002\u0010P\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`RH\u0002J\u0018\u0010N\u001a\u00020$2\u0006\u00105\u001a\u00020\u00052\u0006\u0010S\u001a\u00020GH\u0002J \u0010T\u001a\u00020$2\u0006\u00105\u001a\u00020\u00052\u0006\u0010S\u001a\u00020G2\u0006\u0010U\u001a\u00020\u0005H\u0002J\u0018\u0010V\u001a\u00020$2\u0006\u00105\u001a\u00020\u00052\u0006\u0010S\u001a\u00020GH\u0002J\u0010\u0010W\u001a\u00020$2\u0006\u0010P\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u00020$2\u0006\u0010K\u001a\u00020LH\u0002J\"\u0010Z\u001a\u0004\u0018\u00010\u001c2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u0001H\u0002R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lin/juspay/hypersdk/ota/ApplicationManager;", "", "ctx", "Landroid/content/Context;", "releaseConfigTemplateUrl", "", "workspace", "Lin/juspay/hypersdk/services/Workspace;", "tracker", "Lin/juspay/hypersdk/core/SdkTracker;", "sessionInfo", "Lin/juspay/hypersdk/data/SessionInfo;", "fileProviderService", "Lin/juspay/hypersdk/services/FileProviderService;", "metricsEndPoint", "(Landroid/content/Context;Ljava/lang/String;Lin/juspay/hypersdk/services/Workspace;Lin/juspay/hypersdk/core/SdkTracker;Lin/juspay/hypersdk/data/SessionInfo;Lin/juspay/hypersdk/services/FileProviderService;Ljava/lang/String;)V", "applicationContent", "loadWaitTask", "Lin/juspay/hypersdk/ota/WaitTask;", FilterParams.KEY_MODE, "Lin/juspay/hypersdk/ota/Mode;", "getMode", "()Lin/juspay/hypersdk/ota/Mode;", "setMode", "(Lin/juspay/hypersdk/ota/Mode;)V", "netUtils", "Lin/juspay/hypersdk/utils/network/NetUtils;", "releaseConfig", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "shouldUpdate", "", "getShouldUpdate", "()Z", "setShouldUpdate", "(Z)V", "cleanUpDir", "", "dir", "requiredFiles", "", "clearContextMap", "generateNewToss", "", "currentTime", "", "getApplicationContent", "getReleaseConfigUrl", "clientId", "getTimedToss", "loadApplication", "unSanitizedClientId", "logTimeTaken", "startTime", "label", "postMetrics", "updateUUID", "didUpdatePkg", "(Ljava/lang/String;Z)Lkotlin/Unit;", "readFile", "filePath", "readFileAsync", "Ljava/util/concurrent/Future;", "readReleaseConfig", "lock", "readResourceByFileName", "fileName", "readResourceByName", "name", "readSplit", "readSplits", "fileNames", "Lorg/json/JSONObject;", "filePaths", "runCleanUp", "persistentState", "updateResult", "Lin/juspay/hypersdk/ota/UpdateResult;", "trackBoot", "trackError", "msg", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "trackGeneric", "level", "trackInfo", "trackReadReleaseConfigError", "", "trackUpdateResult", "tryUpdate", "initialized", "fileLock", "Companion", "LogLabel", "StateKey", "hyper-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ApplicationManager {
    public static final String TAG = "ApplicationManager";
    private String applicationContent;
    private final Context ctx;
    private final FileProviderService fileProviderService;
    private WaitTask loadWaitTask;
    private final String metricsEndPoint;
    private Mode mode;
    private final NetUtils netUtils;
    private ReleaseConfig releaseConfig;
    private final String releaseConfigTemplateUrl;
    private final SessionInfo sessionInfo;
    private boolean shouldUpdate;
    private final SdkTracker tracker;
    private final Workspace workspace;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentMap<String, WeakReference<Context>> CONTEXT_MAP = new ConcurrentHashMap();
    private static final ConcurrentMap<String, UpdateTask> RUNNING_UPDATE_TASKS = new ConcurrentHashMap();

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\n*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lin/juspay/hypersdk/ota/ApplicationManager$Companion;", "", "<init>", "()V", "V", "Ljava/util/concurrent/Callable;", "p0", "Ljava/util/concurrent/Future;", "doAsync", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "", "sanitizeClientId", "(Ljava/lang/String;)Ljava/lang/String;", "", "p1", "setDifference", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "toUnzippedName", "Ljava/io/Closeable;", "", "closeQuietly", "(Ljava/io/Closeable;)V", "Ljava/net/URL;", "fileName", "(Ljava/net/URL;)Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "CONTEXT_MAP", "Ljava/util/concurrent/ConcurrentMap;", "Lin/juspay/hypersdk/ota/UpdateTask;", "RUNNING_UPDATE_TASKS", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <V> Future<V> doAsync(Callable<V> p0) {
            return ExecutorManager.doAsync(p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String sanitizeClientId(String p0) {
            String lowerCase = ((String) TestGroupLSModel.IconCompatParcelizer(p0, new char[]{'_'}, false, 0).get(0)).toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            return lowerCase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <V> List<V> setDifference(List<? extends V> p0, List<? extends V> p1) {
            return IntermediateLoginResponseBody.onPlay(getKycMessage.IconCompatParcelizer(IntermediateLoginResponseBody.onPlayFromUri(p0), (Iterable) IntermediateLoginResponseBody.onPlayFromUri(p1)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toUnzippedName(String p0) {
            return TestGroupLSModel.AudioAttributesImplApi21Parcelizer(p0, ".zip") ? TestGroupLSModel.read(p0, ".zip", ".jsa", false) : p0;
        }

        public final void closeQuietly(Closeable closeable) {
            toMagicModuleMetaRepoModel.write(closeable, "");
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public final String fileName(URL url) {
            toMagicModuleMetaRepoModel.write(url, "");
            String strGuessFileName = URLUtil.guessFileName(url.toString(), null, null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGuessFileName, "");
            return strGuessFileName;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lin/juspay/hypersdk/ota/ApplicationManager$LogLabel;", "", "<init>", "()V", "", "APP_LOAD_EXCEPTION", "Ljava/lang/String;", "CLEAN_UP_ERROR", "TOSS_GENERATION_ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class LogLabel {
        public static final String APP_LOAD_EXCEPTION = "app_load_exception";
        public static final String CLEAN_UP_ERROR = "clean_up_error";
        public static final LogLabel INSTANCE = new LogLabel();
        public static final String TOSS_GENERATION_ERROR = "toss_generation_error";

        private LogLabel() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lin/juspay/hypersdk/ota/ApplicationManager$StateKey;", "", "<init>", "(Ljava/lang/String;I)V", "SAVED_PACKAGE_UPDATE", "SAVED_RESOURCE_UPDATE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum StateKey {
        SAVED_PACKAGE_UPDATE,
        SAVED_RESOURCE_UPDATE
    }

    /* JADX INFO: renamed from: in.juspay.hypersdk.ota.ApplicationManager$tryUpdate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult;", "p0", "Lorg/json/JSONObject;", "p1", "", "invoke", "(Lin/juspay/hypersdk/ota/UpdateResult;Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<UpdateResult, JSONObject, getShowPopup> {
        final /* synthetic */ String $clientId;
        final /* synthetic */ boolean $initialized;
        final /* synthetic */ UpdateTask $newTask;
        final /* synthetic */ long $startTime;
        final /* synthetic */ ApplicationManager this$0;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* bridge */ /* synthetic */ getShowPopup invoke(UpdateResult updateResult, JSONObject jSONObject) throws JSONException {
            invoke2(updateResult, jSONObject);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(in.juspay.hypersdk.ota.UpdateResult r5, org.json.JSONObject r6) throws org.json.JSONException {
            /*
                r4 = this;
                java.lang.String r0 = ""
                kotlin.toMagicModuleMetaRepoModel.write(r5, r0)
                kotlin.toMagicModuleMetaRepoModel.write(r6, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Running onFinish for '"
                r0.<init>(r1)
                java.lang.String r1 = r4.$clientId
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ApplicationManager"
                in.juspay.hyper.core.JuspayLogger.d(r1, r0)
                boolean r0 = r4.$initialized
                if (r0 != 0) goto L2b
                in.juspay.hypersdk.ota.ApplicationManager r0 = r4.this$0
                in.juspay.hypersdk.ota.ApplicationManager.access$runCleanUp(r0, r6, r5)
            L2b:
                boolean r6 = r5 instanceof in.juspay.hypersdk.ota.UpdateResult.Ok
                if (r6 == 0) goto L59
                in.juspay.hypersdk.ota.UpdateResult$Ok r5 = (in.juspay.hypersdk.ota.UpdateResult.Ok) r5
                in.juspay.hypersdk.ota.ReleaseConfig r5 = r5.getReleaseConfig()
                in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest r5 = r5.getPkg()
                java.lang.String r5 = r5.getVersion()
                in.juspay.hypersdk.ota.ApplicationManager r6 = r4.this$0
                in.juspay.hypersdk.ota.ReleaseConfig r6 = in.juspay.hypersdk.ota.ApplicationManager.access$getReleaseConfig$p(r6)
                if (r6 == 0) goto L50
                in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest r6 = r6.getPkg()
                if (r6 == 0) goto L50
                java.lang.String r6 = r6.getVersion()
                goto L51
            L50:
                r6 = 0
            L51:
                boolean r5 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r5, r6)
                if (r5 != 0) goto L59
                r5 = 1
                goto L5a
            L59:
                r5 = 0
            L5a:
                java.util.concurrent.ConcurrentMap r6 = in.juspay.hypersdk.ota.ApplicationManager.access$getRUNNING_UPDATE_TASKS$cp()
                java.lang.String r0 = r4.$clientId
                r6.remove(r0)
                in.juspay.hypersdk.ota.ApplicationManager r6 = r4.this$0
                long r0 = r4.$startTime
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Update task finished for '"
                r2.<init>(r3)
                java.lang.String r3 = r4.$clientId
                r2.append(r3)
                java.lang.String r3 = "'."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                in.juspay.hypersdk.ota.ApplicationManager.access$logTimeTaken(r6, r0, r2)
                in.juspay.hypersdk.ota.ApplicationManager r6 = r4.this$0
                in.juspay.hypersdk.ota.UpdateTask r4 = r4.$newTask
                java.lang.String r4 = r4.getUpdateUUID()
                in.juspay.hypersdk.ota.ApplicationManager.access$postMetrics(r6, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ApplicationManager.AnonymousClass1.invoke2(in.juspay.hypersdk.ota.UpdateResult, org.json.JSONObject):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, boolean z, ApplicationManager applicationManager, long j, UpdateTask updateTask) {
            super(2);
            this.$clientId = str;
            this.$initialized = z;
            this.this$0 = applicationManager;
            this.$startTime = j;
            this.$newTask = updateTask;
        }
    }

    public ApplicationManager(Context context, String str, Workspace workspace, SdkTracker sdkTracker, SessionInfo sessionInfo, FileProviderService fileProviderService, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(workspace, "");
        toMagicModuleMetaRepoModel.write(sdkTracker, "");
        toMagicModuleMetaRepoModel.write(sessionInfo, "");
        toMagicModuleMetaRepoModel.write(fileProviderService, "");
        this.ctx = context;
        this.releaseConfigTemplateUrl = str;
        this.workspace = workspace;
        this.tracker = sdkTracker;
        this.sessionInfo = sessionInfo;
        this.fileProviderService = fileProviderService;
        this.metricsEndPoint = str2;
        this.shouldUpdate = true;
        NetUtils netUtils = new NetUtils(10000, 10000);
        this.netUtils = netUtils;
        this.mode = Mode.Release.INSTANCE;
        this.applicationContent = "";
        this.loadWaitTask = new WaitTask();
        netUtils.setTrackMetrics(str2 != null);
    }

    private final void cleanUpDir(String dir, List<String> requiredFiles) throws JSONException {
        List listRemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("requiredFiles for ");
        sb.append(dir);
        sb.append(' ');
        sb.append(requiredFiles);
        JuspayLogger.d(TAG, sb.toString());
        String[] strArrListFiles = this.fileProviderService.listFiles(dir);
        if (strArrListFiles == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(strArrListFiles)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Companion companion = INSTANCE;
        List<String> difference = companion.setDifference(companion.setDifference(listRemoteActionCompatParcelizer, requiredFiles), requiredFiles);
        if (difference.isEmpty()) {
            JuspayLogger.d(TAG, "No clean-up required for dir: ".concat(String.valueOf(dir)));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (String str : difference) {
            FileProviderService fileProviderService = this.fileProviderService;
            Context context = this.ctx;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dir);
            sb2.append('/');
            sb2.append(str);
            if (fileProviderService.deleteFileFromInternalStorage(context, sb2.toString())) {
                StringBuilder sb3 = new StringBuilder("Deleted file ");
                sb3.append(str);
                sb3.append(" from ");
                sb3.append(dir);
                JuspayLogger.d(TAG, sb3.toString());
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObjectPut = new JSONObject().put("message", "Failed to delete some files during clean up.").put("failures", arrayList);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackError(LogLabel.CLEAN_UP_ERROR, jSONObjectPut);
        }
        logTimeTaken$default(this, jCurrentTimeMillis, null, 2, null);
    }

    private final int generateNewToss(long currentTime) throws JSONException {
        int iWrite = getFinalData.INSTANCE.write(0, 99);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ts", currentTime);
        jSONObject.put("toss", iWrite);
        this.workspace.writeToSharedPreference(Constants.PATCH_TOSS, jSONObject.toString());
        return iWrite;
    }

    private final String getReleaseConfigUrl(String clientId) throws JSONException {
        int timedToss = getTimedToss();
        Mode mode = this.mode;
        if (mode instanceof Mode.Release) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(this.releaseConfigTemplateUrl, Arrays.copyOf(new Object[]{"", clientId, "release", Integer.valueOf(timedToss)}, 4));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }
        if (mode instanceof Mode.CUG) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
            String str2 = String.format(this.releaseConfigTemplateUrl, Arrays.copyOf(new Object[]{"", clientId, "cug", Integer.valueOf(timedToss)}, 4));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            return str2;
        }
        if (mode instanceof Mode.Beta) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            String str3 = String.format(this.releaseConfigTemplateUrl, Arrays.copyOf(new Object[]{"sandbox.", clientId, "beta", Integer.valueOf(timedToss)}, 4));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            return str3;
        }
        if (!(mode instanceof Mode.DevQa)) {
            throw new RenewEligibleCreator();
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        StringBuilder sb = new StringBuilder("devqa-");
        sb.append(((Mode.DevQa) mode).getTicket());
        String str4 = String.format(in.juspay.hypersdk.core.Constants.RELEASE_CONFIG_TEMPLATE_URL, Arrays.copyOf(new Object[]{"sandbox.", clientId, sb.toString(), Integer.valueOf(timedToss)}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        return str4;
    }

    private final int getTimedToss() throws JSONException {
        String fromSharedPreference = this.workspace.getFromSharedPreference(Constants.PATCH_TOSS, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (fromSharedPreference == null) {
            return generateNewToss(jCurrentTimeMillis);
        }
        try {
            JSONObject jSONObject = new JSONObject(fromSharedPreference);
            return jCurrentTimeMillis - jSONObject.optLong("ts") > 604800 ? generateNewToss(jCurrentTimeMillis) : jSONObject.optInt("toss");
        } catch (Exception e) {
            JSONObject jSONObjectPut = new JSONObject().put("message", e.getMessage());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackError(LogLabel.TOSS_GENERATION_ERROR, jSONObjectPut);
            return generateNewToss(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTimeTaken(long startTime, String label) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Time ");
        sb.append(jCurrentTimeMillis - startTime);
        sb.append("ms");
        String string = sb.toString();
        if (label == null) {
            JuspayLogger.d(TAG, string);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(label);
        sb2.append(' ');
        sb2.append(string);
        JuspayLogger.d(TAG, sb2.toString());
    }

    static /* synthetic */ void logTimeTaken$default(ApplicationManager applicationManager, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        applicationManager.logTimeTaken(j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getShowPopup postMetrics(String str, boolean z) {
        String str2 = this.metricsEndPoint;
        if (str2 == null) {
            return null;
        }
        NetUtils netUtils = this.netUtils;
        String sessionId = this.sessionInfo.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        netUtils.postMetrics(str2, sessionId, str, z);
        return getShowPopup.INSTANCE;
    }

    private final String readFile(String filePath) {
        String fromFile = this.fileProviderService.readFromFile(this.ctx, "app/".concat(String.valueOf(filePath)));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fromFile, "");
        return fromFile;
    }

    private final Future<String> readFileAsync(final String filePath) {
        return INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.ApplicationManager$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ApplicationManager.readFileAsync$lambda$12(this.f$0, filePath);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readFileAsync$lambda$12(ApplicationManager applicationManager, String str) {
        toMagicModuleMetaRepoModel.write(applicationManager, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return applicationManager.readFile(str);
    }

    private final ReleaseConfig readReleaseConfig(Object lock) {
        ReleaseConfig releaseConfig;
        synchronized (lock) {
            try {
                Future<String> fileAsync = readFileAsync(Constants.CONFIG_FILE_NAME);
                Future<String> fileAsync2 = readFileAsync(Constants.PACKAGE_MANIFEST_FILE_NAME);
                Future<String> fileAsync3 = readFileAsync(Constants.RESOURCES_FILE_NAME);
                ReleaseConfig.Companion companion = ReleaseConfig.INSTANCE;
                String str = fileAsync.get();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                Object objM356deSerializeConfigIoAF18A = companion.m356deSerializeConfigIoAF18A(str);
                Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(objM356deSerializeConfigIoAF18A);
                if (thIconCompatParcelizer != null) {
                    trackReadReleaseConfigError(thIconCompatParcelizer);
                    objM356deSerializeConfigIoAF18A = Constants.INSTANCE.getDEFAULT_CONFIG();
                }
                ReleaseConfig.Config config = (ReleaseConfig.Config) objM356deSerializeConfigIoAF18A;
                String str2 = fileAsync2.get();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                Object objM357deSerializePackageIoAF18A = companion.m357deSerializePackageIoAF18A(str2);
                SdkPayloadData.IconCompatParcelizer(objM357deSerializePackageIoAF18A);
                ReleaseConfig.PackageManifest packageManifest = (ReleaseConfig.PackageManifest) objM357deSerializePackageIoAF18A;
                String str3 = fileAsync3.get();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                Object objM358deSerializeResourcesIoAF18A = companion.m358deSerializeResourcesIoAF18A(str3);
                Throwable thIconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer(objM358deSerializeResourcesIoAF18A);
                if (thIconCompatParcelizer2 != null) {
                    trackReadReleaseConfigError(thIconCompatParcelizer2);
                    objM358deSerializeResourcesIoAF18A = Constants.INSTANCE.getDEFAULT_RESOURCES();
                }
                JuspayLogger.d(TAG, "Local release config loaded.");
                releaseConfig = new ReleaseConfig(config, packageManifest, (ReleaseConfig.ResourceManifest) objM358deSerializeResourcesIoAF18A);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Failed to read local release config. ");
                sb.append(e);
                JuspayLogger.e(TAG, sb.toString());
                trackReadReleaseConfigError(e);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                return null;
            }
        }
        return releaseConfig;
    }

    private final String readResourceByFileName(String fileName) {
        return readFile("resources/".concat(String.valueOf(fileName)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair readSplits$lambda$15$lambda$14(String str, ApplicationManager applicationManager) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(applicationManager, "");
        return setAction.write(str, applicationManager.readSplit(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runCleanUp(JSONObject persistentState, UpdateResult updateResult) throws JSONException {
        List<String> listRemoteActionCompatParcelizer;
        List<String> listRemoteActionCompatParcelizer2;
        Collection collectionRemoteActionCompatParcelizer;
        Collection collectionRemoteActionCompatParcelizer2;
        Iterable<String> arrayList;
        ReleaseConfig.ResourceManifest resources;
        ReleaseConfig.ResourceManifest resources2;
        ReleaseConfig.PackageManifest pkg;
        ReleaseConfig.PackageManifest pkg2;
        JuspayLogger.d(TAG, "runCleanUp: updateResult: ".concat(String.valueOf(updateResult)));
        ReleaseConfig releaseConfig = updateResult instanceof UpdateResult.Ok ? ((UpdateResult.Ok) updateResult).getReleaseConfig() : null;
        ReleaseConfig releaseConfig2 = this.releaseConfig;
        if (releaseConfig2 == null || (pkg2 = releaseConfig2.getPkg()) == null || (listRemoteActionCompatParcelizer = pkg2.getFileNames()) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        JuspayLogger.d(TAG, "runCleanUp: Current splits: ".concat(String.valueOf(listRemoteActionCompatParcelizer)));
        if (releaseConfig == null || (pkg = releaseConfig.getPkg()) == null || (listRemoteActionCompatParcelizer2 = pkg.getFileNames()) == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        JuspayLogger.d(TAG, "runCleanUp: New splits: ".concat(String.valueOf(listRemoteActionCompatParcelizer2)));
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listRemoteActionCompatParcelizer, (Iterable) listRemoteActionCompatParcelizer2);
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        Iterator it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList2.add(INSTANCE.toUnzippedName((String) it.next()));
        }
        cleanUpDir("app/package", arrayList2);
        ReleaseConfig releaseConfig3 = this.releaseConfig;
        if (releaseConfig3 == null || (resources2 = releaseConfig3.getResources()) == null) {
            collectionRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            collectionRemoteActionCompatParcelizer = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) resources2, 10));
            Iterator<ReleaseConfig.Resource> it2 = resources2.iterator();
            while (it2.hasNext()) {
                collectionRemoteActionCompatParcelizer.add(it2.next().getFileName());
            }
        }
        if (releaseConfig == null || (resources = releaseConfig.getResources()) == null) {
            collectionRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            collectionRemoteActionCompatParcelizer2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) resources, 10));
            Iterator<ReleaseConfig.Resource> it3 = resources.iterator();
            while (it3.hasNext()) {
                collectionRemoteActionCompatParcelizer2.add(it3.next().getFileName());
            }
        }
        cleanUpDir("app/resources", IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(collectionRemoteActionCompatParcelizer, (Iterable) collectionRemoteActionCompatParcelizer2));
        JSONObject jSONObjectOptJSONObject = persistentState.optJSONObject("SAVED_PACKAGE_UPDATE");
        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("dir") : null;
        JSONObject jSONObjectOptJSONObject2 = persistentState.optJSONObject("SAVED_RESOURCE_UPDATE");
        String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("dir") : null;
        String[] list = this.workspace.getCacheRoot().list();
        if (list == null || (arrayList = getOrderDetails.onCommand(list)) == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, 10));
        for (String str : arrayList) {
            Workspace workspace = this.workspace;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            arrayList3.add(workspace.openInCache(str));
        }
        newYearNameItem newyearnameitem = new newYearNameItem("temp-.*-\\d+");
        ArrayList<File> arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            File file = (File) obj;
            if (file.isDirectory() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) file.getName(), (Object) strOptString) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) file.getName(), (Object) strOptString2)) {
                String name = file.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                if (newyearnameitem.write(name)) {
                    arrayList4.add(obj);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (File file2 : arrayList4) {
            StringBuilder sb = new StringBuilder("Deleting temp directory ");
            sb.append(file2.getName());
            JuspayLogger.d(TAG, sb.toString());
            String name2 = !downloadMagicModuleDetail.AudioAttributesCompatParcelizer(file2) ? file2.getName() : null;
            if (name2 != null) {
                arrayList5.add(name2);
            }
        }
        if (arrayList5.isEmpty()) {
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("message", "Failed to delete some temporary directories during clean-up.").put("failures", arrayList5);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackError(LogLabel.CLEAN_UP_ERROR, jSONObjectPut);
    }

    private final void trackBoot(ReleaseConfig releaseConfig, long startTime) throws JSONException {
        ReleaseConfig.Config config = releaseConfig.getConfig();
        ReleaseConfig.PackageManifest pkg = releaseConfig.getPkg();
        ReleaseConfig.ResourceManifest resources = releaseConfig.getResources();
        JSONObject jSONObject = new JSONObject();
        for (ReleaseConfig.Resource resource : resources) {
            jSONObject.put(resource.getName(), resource.getVersion());
        }
        JSONObject jSONObjectPut = new JSONObject().put(CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION, config.getVersion()).put("package_version", pkg.getVersion()).put("resource_versions", jSONObject).put("time_taken", System.currentTimeMillis() - startTime);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo("boot", jSONObjectPut);
    }

    private final void trackError(String label, String msg, Exception e) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("message", msg);
        if (e != null) {
            jSONObjectPut.put("stack_trace", Log.getStackTraceString(e));
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackError(label, jSONObjectPut);
    }

    static /* synthetic */ void trackError$default(ApplicationManager applicationManager, String str, String str2, Exception exc, int i, Object obj) throws JSONException {
        if ((i & 4) != 0) {
            exc = null;
        }
        applicationManager.trackError(str, str2, exc);
    }

    private final void trackGeneric(String label, JSONObject value, String level) {
        this.tracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, level, TAG, label, value);
    }

    private final void trackInfo(String label, JSONObject value) {
        trackGeneric(label, value, "info");
    }

    private final void trackReadReleaseConfigError(Throwable e) throws JSONException {
        if (e instanceof Exception) {
            JSONObject jSONObjectPut = new JSONObject().put("error", e.getMessage()).put("stack_trace", Log.getStackTraceString(e));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackError("read_release_config_error", jSONObjectPut);
        }
    }

    private final void trackUpdateResult(UpdateResult updateResult) throws JSONException {
        String str;
        if (updateResult instanceof UpdateResult.Ok) {
            str = "OK";
        } else if (updateResult instanceof UpdateResult.PackageUpdateTimeout) {
            str = "PACKAGE_TIMEOUT";
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updateResult, UpdateResult.ReleaseConfigFetchTimeout.INSTANCE)) {
            str = "RELEASE_CONFIG_TIMEOUT";
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updateResult, UpdateResult.Error.RCFetchError.INSTANCE) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updateResult, UpdateResult.Error.Unknown.INSTANCE)) {
            str = "ERROR";
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updateResult, UpdateResult.NA.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            str = "NA";
        }
        JSONObject jSONObjectPut = new JSONObject().put("result", str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo("update_result", jSONObjectPut);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final in.juspay.hypersdk.ota.ReleaseConfig tryUpdate(java.lang.String r20, boolean r21, java.lang.Object r22) throws org.json.JSONException {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = r19.getReleaseConfigUrl(r20)
            in.juspay.hypersdk.ota.UpdateTask r6 = new in.juspay.hypersdk.ota.UpdateTask
            in.juspay.hypersdk.services.FileProviderService r13 = r7.fileProviderService
            in.juspay.hypersdk.ota.ReleaseConfig r14 = r7.releaseConfig
            in.juspay.hypersdk.core.SdkTracker r0 = r7.tracker
            in.juspay.hypersdk.utils.network.NetUtils r1 = r7.netUtils
            in.juspay.hypersdk.data.SessionInfo r2 = r7.sessionInfo
            r11 = r6
            r15 = r22
            r16 = r0
            r17 = r1
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.concurrent.ConcurrentMap<java.lang.String, in.juspay.hypersdk.ota.UpdateTask> r0 = in.juspay.hypersdk.ota.ApplicationManager.RUNNING_UPDATE_TASKS
            java.lang.Object r0 = r0.putIfAbsent(r8, r6)
            in.juspay.hypersdk.ota.UpdateTask r0 = (in.juspay.hypersdk.ota.UpdateTask) r0
            if (r0 != 0) goto L30
            r11 = r6
            goto L31
        L30:
            r11 = r0
        L31:
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r11, r6)
            java.lang.String r12 = "ApplicationManager"
            if (r0 == 0) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No running update tasks for '"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = "', starting new task."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            in.juspay.hyper.core.JuspayLogger.d(r12, r0)
            in.juspay.hypersdk.ota.ApplicationManager$tryUpdate$1 r13 = new in.juspay.hypersdk.ota.ApplicationManager$tryUpdate$1
            r0 = r13
            r1 = r20
            r2 = r21
            r3 = r19
            r4 = r9
            r14 = r6
            r0.<init>(r1, r2, r3, r4, r6)
            r14.run(r13)
            goto L77
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Update task already running for '"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = "'."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            in.juspay.hyper.core.JuspayLogger.d(r12, r0)
        L77:
            in.juspay.hypersdk.core.SdkTracker r0 = r7.tracker
            in.juspay.hypersdk.ota.UpdateResult r0 = r11.await(r0)
            r7.trackUpdateResult(r0)
            boolean r1 = r0 instanceof in.juspay.hypersdk.ota.UpdateResult.Ok
            if (r1 == 0) goto L8b
            in.juspay.hypersdk.ota.UpdateResult$Ok r0 = (in.juspay.hypersdk.ota.UpdateResult.Ok) r0
            in.juspay.hypersdk.ota.ReleaseConfig r0 = r0.getReleaseConfig()
            goto Lc1
        L8b:
            boolean r1 = r0 instanceof in.juspay.hypersdk.ota.UpdateResult.PackageUpdateTimeout
            if (r1 == 0) goto L98
            in.juspay.hypersdk.ota.UpdateResult$PackageUpdateTimeout r0 = (in.juspay.hypersdk.ota.UpdateResult.PackageUpdateTimeout) r0
            in.juspay.hypersdk.ota.ReleaseConfig r0 = r0.getReleaseConfig()
            if (r0 != 0) goto Lc1
            goto Lbf
        L98:
            in.juspay.hypersdk.ota.UpdateResult$Error$RCFetchError r1 = in.juspay.hypersdk.ota.UpdateResult.Error.RCFetchError.INSTANCE
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            if (r0 == 0) goto Lbf
            in.juspay.hypersdk.ota.Mode r0 = r7.mode
            in.juspay.hypersdk.ota.Mode$Release r1 = in.juspay.hypersdk.ota.Mode.Release.INSTANCE
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "Failed to fetch release config, re-trying in release mode."
            in.juspay.hyper.core.JuspayLogger.d(r12, r0)
            r11.awaitOnFinish$hyper_sdk_release()
            r7.mode = r1
            r0 = 1
            r1 = r22
            in.juspay.hypersdk.ota.ReleaseConfig r0 = r7.tryUpdate(r8, r0, r1)
            goto Lc1
        Lbc:
            in.juspay.hypersdk.ota.ReleaseConfig r0 = r7.releaseConfig
            goto Lc1
        Lbf:
            in.juspay.hypersdk.ota.ReleaseConfig r0 = r7.releaseConfig
        Lc1:
            java.lang.String r1 = "tryUpdate"
            r7.logTimeTaken(r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.ota.ApplicationManager.tryUpdate(java.lang.String, boolean, java.lang.Object):in.juspay.hypersdk.ota.ReleaseConfig");
    }

    public final void clearContextMap() {
        Iterator<String> it = CONTEXT_MAP.keySet().iterator();
        while (it.hasNext()) {
            CONTEXT_MAP.remove(it.next());
        }
    }

    public final String getApplicationContent() throws ExecutionException, InterruptedException {
        this.loadWaitTask.get();
        return this.applicationContent;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final boolean getShouldUpdate() {
        return this.shouldUpdate;
    }

    public final void loadApplication(String unSanitizedClientId) {
        ReleaseConfig releaseConfig;
        String split;
        boolean z;
        toMagicModuleMetaRepoModel.write(unSanitizedClientId, "");
        String strSanitizeClientId = INSTANCE.sanitizeClientId(unSanitizedClientId);
        JSONObject jSONObjectPut = new JSONObject().put(PaymentConstants.CLIENT_ID, strSanitizeClientId);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo("init", jSONObjectPut);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (this.releaseConfig == null) {
                    WeakReference<Context> weakReference = new WeakReference<>(this.ctx);
                    ConcurrentMap<String, WeakReference<Context>> concurrentMap = CONTEXT_MAP;
                    WeakReference<Context> weakReference2 = concurrentMap.get(strSanitizeClientId);
                    if (weakReference2 == null) {
                        z = concurrentMap.putIfAbsent(strSanitizeClientId, weakReference) != null;
                    } else if (weakReference2.get() != null || !concurrentMap.replace(strSanitizeClientId, weakReference2, weakReference)) {
                    }
                    WeakReference<Context> weakReference3 = concurrentMap.get(strSanitizeClientId);
                    if (weakReference3 != null) {
                        weakReference = weakReference3;
                    }
                    this.releaseConfig = readReleaseConfig(weakReference);
                    if (this.shouldUpdate) {
                        this.releaseConfig = tryUpdate(strSanitizeClientId, z, weakReference);
                    } else {
                        JuspayLogger.d(TAG, "Updates disabled, running w/o updating.");
                    }
                }
                releaseConfig = this.releaseConfig;
                toMagicModuleMetaRepoModel.write(releaseConfig);
                split = readSplit(releaseConfig.getPkg().getIndex().getFileName());
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Critical exception while loading app! ");
                sb.append(e);
                JuspayLogger.e(TAG, sb.toString());
                trackError(LogLabel.APP_LOAD_EXCEPTION, "Exception raised while loading application.", e);
            }
            if (split.length() == 0) {
                throw new IllegalStateException("index split is empty.");
            }
            trackBoot(releaseConfig, jCurrentTimeMillis);
            StringBuilder sb2 = new StringBuilder("Loading package version: ");
            sb2.append(releaseConfig.getPkg().getVersion());
            JuspayLogger.d(TAG, sb2.toString());
            StringBuilder sb3 = new StringBuilder("\n                window.document.title=\"");
            sb3.append(releaseConfig.getPkg().getName());
            sb3.append("\";\n                window.RELEASE_CONFIG=");
            sb3.append(releaseConfig.serialize());
            sb3.append(";\n            ");
            String strWrite = TestGroupLSModel.write(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strWrite);
            sb4.append(split);
            this.applicationContent = sb4.toString();
        } finally {
            this.loadWaitTask.complete();
            logTimeTaken(jCurrentTimeMillis, "loadApplication");
        }
    }

    public final String readResourceByName(String name) {
        String resourceByFileName;
        ReleaseConfig.ResourceManifest resources;
        ReleaseConfig.Resource resource;
        toMagicModuleMetaRepoModel.write(name, "");
        ReleaseConfig releaseConfig = this.releaseConfig;
        String fileName = (releaseConfig == null || (resources = releaseConfig.getResources()) == null || (resource = resources.getResource(name)) == null) ? null : resource.getFileName();
        return (fileName == null || (resourceByFileName = readResourceByFileName(fileName)) == null) ? "" : resourceByFileName;
    }

    public final String readSplit(String fileName) {
        toMagicModuleMetaRepoModel.write(fileName, "");
        return readFile("package/".concat(String.valueOf(INSTANCE.toUnzippedName(fileName))));
    }

    public final String readSplits(String fileNames) {
        toMagicModuleMetaRepoModel.write(fileNames, "");
        String string = readSplits(TestGroupLSModel.write(TestGroupLSModel.read(fileNames, " ", "", false), new String[]{","}, 0, 6)).toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final void setMode(Mode mode) {
        toMagicModuleMetaRepoModel.write(mode, "");
        this.mode = mode;
    }

    public final void setShouldUpdate(boolean z) {
        this.shouldUpdate = z;
    }

    private final JSONObject readSplits(List<String> filePaths) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) filePaths, 10));
        for (final String str : filePaths) {
            arrayList.add(INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.ApplicationManager$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ApplicationManager.readSplits$lambda$15$lambda$14(str, this);
                }
            }));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) ((Future) it.next()).get();
            jSONObject.put((String) pair.RemoteActionCompatParcelizer(), (String) pair.read());
        }
        return jSONObject;
    }

    private final void trackError(String label, JSONObject value) {
        trackGeneric(label, value, "error");
    }
}
