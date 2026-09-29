package in.juspay.hypersdk.ota;

import android.util.Log;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.ota.ApplicationManager;
import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateResult;
import in.juspay.hypersdk.ota.UpdateTask;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import kotlin.ActivityAdapterModule;
import kotlin.C0156TypeKt;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleMetaLSModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.RenewEligibleCreator;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.VideoTimelineResponseBody;
import kotlin.getKycMessage;
import kotlin.getMagicModuleDetail;
import kotlin.getShowPopup;
import kotlin.getSubmissionTimestamp;
import kotlin.setAction;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 \u0082\u00012\u00020\u0001:\f\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010,\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0015H\u0002J\r\u00100\u001a\u00020\u001cH\u0000¢\u0006\u0002\b1J*\u00102\u001a\u00020\u001c2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040#2\n\u00105\u001a\u000606R\u00020\u00002\u0006\u0010/\u001a\u00020\u0015H\u0002J\u001c\u00107\u001a\u0002082\n\u00109\u001a\u00060:R\u00020\u00052\u0006\u0010;\u001a\u00020\u0003H\u0002J*\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0=2\n\u00109\u001a\u00060:R\u00020\u00052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003H\u0002J\u0014\u0010A\u001a\u0002042\n\u0010B\u001a\u00060Cj\u0002`DH\u0002JD\u0010E\u001a\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0+0=j\u0002`H2\u0006\u0010>\u001a\u00020\u00032\b\b\u0002\u0010I\u001a\u0002082\b\b\u0002\u0010J\u001a\u0002082\b\b\u0002\u0010K\u001a\u00020LH\u0002J\n\u0010M\u001a\u0004\u0018\u00010\u0007H\u0002J \u0010N\u001a\u0002082\u0006\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u0015H\u0002J\b\u0010R\u001a\u00020\u001bH\u0002J\u001c\u0010S\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u00152\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\u0013H\u0002J\u0012\u0010W\u001a\u0004\u0018\u00010\u001b2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020YH\u0002J$\u0010[\u001a\u00020\u001c2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aj\u0002`\u001dJ\b\u0010\\\u001a\u00020\u001cH\u0002J\u0010\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001bH\u0002J2\u0010_\u001a\u00020\u001c2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010C2\u0010\b\u0002\u0010b\u001a\n\u0018\u00010cj\u0004\u0018\u0001`dH\u0002J\u0018\u0010e\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010f\u001a\u00020\u001bH\u0002J\b\u0010g\u001a\u00020\u001cH\u0002J\u0018\u0010h\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001bH\u0002J&\u0010i\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u00032\n\u0010j\u001a\u00060kj\u0002`l2\b\b\u0002\u0010f\u001a\u00020\u001bH\u0002J\u0010\u0010m\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020FH\u0002J\u0018\u0010o\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010j\u001a\u00020pH\u0002J\u001c\u0010q\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020\u00032\n\u0010j\u001a\u00060kj\u0002`lH\u0002J \u0010s\u001a\u00020\u001c2\u0006\u0010t\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001bH\u0002J\u0018\u0010u\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u001bH\u0002J\b\u0010v\u001a\u00020\u001cH\u0002J\u001e\u0010w\u001a\u00020\u001c2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00030=2\u0006\u0010Q\u001a\u00020\u0015H\u0002J.\u0010y\u001a\u00020\u001c2\u001c\u0010z\u001a\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0+0=j\u0002`H2\u0006\u0010Q\u001a\u00020\u0015H\u0002J\u0010\u0010{\u001a\u00020\u001c2\u0006\u0010|\u001a\u00020\u0007H\u0002J\u0010\u0010}\u001a\u0002082\u0006\u0010`\u001a\u00020aH\u0002J\u0018\u0010~\u001a\u0002082\u0006\u0010r\u001a\u00020\u00032\u0006\u0010\u007f\u001a\u00020\u0003H\u0002J\u0016\u0010\u0080\u0001\u001a\u0002082\u000b\u0010\u0081\u0001\u001a\u00060Cj\u0002`DH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aj\u0004\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R \u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00130+0*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0088\u0001"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask;", "", "releaseConfigUrl", "", "fileProviderService", "Lin/juspay/hypersdk/services/FileProviderService;", "localReleaseConfig", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "fileLock", "tracker", "Lin/juspay/hypersdk/core/SdkTracker;", "netUtils", "Lin/juspay/hypersdk/utils/network/NetUtils;", "sessionInfo", "Lin/juspay/hypersdk/data/SessionInfo;", "(Ljava/lang/String;Lin/juspay/hypersdk/services/FileProviderService;Lin/juspay/hypersdk/ota/ReleaseConfig;Ljava/lang/Object;Lin/juspay/hypersdk/core/SdkTracker;Lin/juspay/hypersdk/utils/network/NetUtils;Lin/juspay/hypersdk/data/SessionInfo;)V", "currentResult", "Lin/juspay/hypersdk/ota/UpdateResult;", "currentStage", "Lin/juspay/hypersdk/ota/UpdateTask$Stage;", "currentStageStartTime", "", "defaultHeaders", "", "initTime", "onFinish", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "", "Lin/juspay/hypersdk/ota/OnFinishCallback;", "onFinishWaitTask", "Lin/juspay/hypersdk/ota/WaitTask;", "packageTimeout", "releaseConfigTimeout", "resourceSaveFuture", "Ljava/util/concurrent/Future;", "trackers", "", "updateUUID", "getUpdateUUID", "()Ljava/lang/String;", "waitQueue", "Ljava/util/Queue;", "Lkotlin/Pair;", "await", "awaitCompletion", "stage", "timeoutMillis", "awaitOnFinish", "awaitOnFinish$hyper_sdk_release", "awaitUpdates", "packageUpdateFuture", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;", "resourceUpdateTask", "Lin/juspay/hypersdk/ota/UpdateTask$ResourceUpdateTask;", "copyFilesAsync", "", "tempWriter", "Lin/juspay/hypersdk/services/FileProviderService$TempWriter;", "dest", "downloadFile", "Lin/juspay/hypersdk/ota/UpdateTask$Result;", "url", "Ljava/net/URL;", "saveAs", "downloadPackageUpdate", "fetched", "Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "Lin/juspay/hypersdk/ota/Package;", "fetch", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "Lin/juspay/hypersdk/ota/FetchResult;", "retryEnabled", "noCache", "tryCnt", "", "fetchReleaseConfig", "installPackageUpdate", "update", "pkg", "startTime", "loadPersistentState", "logTimeTaken", "label", "onComplete", "completedStage", "readPersistentState", "key", "Lin/juspay/hypersdk/ota/ApplicationManager$StateKey;", "removeFromPersistentState", "run", "runInternal", "savePersistentState", NotesDispatchAddressRequestKt.KEY_STATE, "setCurrentResult", PaymentConstants.Category.CONFIG, "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", Constants.RESOURCES_DIR_NAME, "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "Lin/juspay/hypersdk/ota/Resources;", "setInPersistentState", AppMeasurementSdk.ConditionalUserProperty.VALUE, "trackEnd", "trackError", "trackException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "trackFetchHttpError", "response", "trackFetchIOError", "Ljava/io/IOException;", "trackFileWriteError", "fileName", "trackGeneric", "level", "trackInfo", "trackInit", "trackPackageUpdateResult", "updateResult", "trackReleaseConfigFetchResult", "fetchResult", "updateTimeouts", "fetchedReleaseConfig", "writeConfig", "writeManifest", "text", "writePackageManifest", "packageManifest", "Companion", "LogLabel", "ResourceUpdateTask", "Result", "Stage", "Update", "hyper-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdateTask {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RETRY_LIMIT = 1;
    public static final String TAG = "UpdateTask";
    private volatile UpdateResult currentResult;
    private volatile Stage currentStage;
    private long currentStageStartTime;
    private Map<String, String> defaultHeaders;
    private final Object fileLock;
    private final FileProviderService fileProviderService;
    private long initTime;
    private final ReleaseConfig localReleaseConfig;
    private final NetUtils netUtils;
    private MagicModuleSubmissionRequestBody<? super UpdateResult, ? super JSONObject, getShowPopup> onFinish;
    private final WaitTask onFinishWaitTask;
    private volatile long packageTimeout;
    private long releaseConfigTimeout;
    private final String releaseConfigUrl;
    private Future<getShowPopup> resourceSaveFuture;
    private final SdkTracker tracker;
    private final List<SdkTracker> trackers;
    private final String updateUUID;
    private final Queue<Pair<WaitTask, Stage>> waitQueue;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0013*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Companion;", "", "<init>", "()V", "V", "Ljava/util/concurrent/Callable;", "p0", "Ljava/util/concurrent/Future;", "doAsync", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "", "p1", "setDifference", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/io/Closeable;", "", "closeQuietly", "(Ljava/io/Closeable;)V", "Ljava/net/URL;", "", "fileName", "(Ljava/net/URL;)Ljava/lang/String;", "Ljava/io/InputStream;", "utf8", "(Ljava/io/InputStream;)Ljava/lang/String;", "", "RETRY_LIMIT", "I", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <V> Future<V> doAsync(Callable<V> p0) {
            return ExecutorManager.doAsync(p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <V> List<V> setDifference(List<? extends V> p0, List<? extends V> p1) {
            return IntermediateLoginResponseBody.onPlay(getKycMessage.IconCompatParcelizer(IntermediateLoginResponseBody.onPlayFromUri(p0), (Iterable) IntermediateLoginResponseBody.onPlayFromUri(p1)));
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

        public final String utf8(InputStream inputStream) {
            toMagicModuleMetaRepoModel.write(inputStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, getSubmissionTimestamp.IconCompatParcelizer), 8192);
            try {
                String strWrite = getMagicModuleDetail.write(bufferedReader);
                MagicModuleMetaLSModel.IconCompatParcelizer(bufferedReader, null);
                return strWrite;
            } finally {
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$LogLabel;", "", "<init>", "()V", "", "PACKAGE_UPDATE_RESULT", "Ljava/lang/String;", "UPDATE_ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class LogLabel {
        public static final LogLabel INSTANCE = new LogLabel();
        public static final String PACKAGE_UPDATE_RESULT = "package_update_result";
        public static final String UPDATE_ERROR = "update_error";

        private LogLabel() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result;", "V", "", "Error", "Ok", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Ok;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Result<V> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result;", "<init>", "()V", "HttpError", "HttpNoBody", "IOError", "ParseError"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class Error<V> implements Result<V> {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$HttpError;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "Lo/TypeKt;", "p0", "<init>", "(Lo/TypeKt;)V", "component1", "()Lo/TypeKt;", "copy", "(Lo/TypeKt;)Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$HttpError;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "response", "Lo/TypeKt;", "getResponse"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class HttpError<V> extends Error<V> {
                private final C0156TypeKt response;

                public HttpError(C0156TypeKt c0156TypeKt) {
                    toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
                    this.response = c0156TypeKt;
                }

                public final C0156TypeKt getResponse() {
                    return this.response;
                }

                public static /* synthetic */ HttpError copy$default(HttpError httpError, C0156TypeKt c0156TypeKt, int i, Object obj) {
                    if ((i & 1) != 0) {
                        c0156TypeKt = httpError.response;
                    }
                    return httpError.copy(c0156TypeKt);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C0156TypeKt getResponse() {
                    return this.response;
                }

                public final HttpError<V> copy(C0156TypeKt p0) {
                    toMagicModuleMetaRepoModel.write(p0, "");
                    return new HttpError<>(p0);
                }

                public final boolean equals(Object p0) {
                    if (this == p0) {
                        return true;
                    }
                    return (p0 instanceof HttpError) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.response, ((HttpError) p0).response);
                }

                public final int hashCode() {
                    return this.response.hashCode();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("HttpError(response=");
                    sb.append(this.response);
                    sb.append(')');
                    return sb.toString();
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$HttpNoBody;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "Lo/TypeKt;", "p0", "<init>", "(Lo/TypeKt;)V", "component1", "()Lo/TypeKt;", "copy", "(Lo/TypeKt;)Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$HttpNoBody;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "response", "Lo/TypeKt;", "getResponse"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class HttpNoBody<V> extends Error<V> {
                private final C0156TypeKt response;

                public HttpNoBody(C0156TypeKt c0156TypeKt) {
                    toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
                    this.response = c0156TypeKt;
                }

                public final C0156TypeKt getResponse() {
                    return this.response;
                }

                public static /* synthetic */ HttpNoBody copy$default(HttpNoBody httpNoBody, C0156TypeKt c0156TypeKt, int i, Object obj) {
                    if ((i & 1) != 0) {
                        c0156TypeKt = httpNoBody.response;
                    }
                    return httpNoBody.copy(c0156TypeKt);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C0156TypeKt getResponse() {
                    return this.response;
                }

                public final HttpNoBody<V> copy(C0156TypeKt p0) {
                    toMagicModuleMetaRepoModel.write(p0, "");
                    return new HttpNoBody<>(p0);
                }

                public final boolean equals(Object p0) {
                    if (this == p0) {
                        return true;
                    }
                    return (p0 instanceof HttpNoBody) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.response, ((HttpNoBody) p0).response);
                }

                public final int hashCode() {
                    return this.response.hashCode();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("HttpNoBody(response=");
                    sb.append(this.response);
                    sb.append(')');
                    return sb.toString();
                }
            }

            /* JADX INFO: loaded from: classes5.dex */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$IOError;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "Ljava/io/IOException;", "p0", "<init>", "(Ljava/io/IOException;)V", "component1", "()Ljava/io/IOException;", "copy", "(Ljava/io/IOException;)Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$IOError;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/io/IOException;", "getE"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class IOError<V> extends Error<V> {
                private final IOException e;

                public IOError(IOException iOException) {
                    toMagicModuleMetaRepoModel.write(iOException, "");
                    this.e = iOException;
                }

                public final IOException getE() {
                    return this.e;
                }

                public static /* synthetic */ IOError copy$default(IOError iOError, IOException iOException, int i, Object obj) {
                    if ((i & 1) != 0) {
                        iOException = iOError.e;
                    }
                    return iOError.copy(iOException);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final IOException getE() {
                    return this.e;
                }

                public final IOError<V> copy(IOException p0) {
                    toMagicModuleMetaRepoModel.write(p0, "");
                    return new IOError<>(p0);
                }

                public final boolean equals(Object p0) {
                    if (this == p0) {
                        return true;
                    }
                    return (p0 instanceof IOError) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.e, ((IOError) p0).e);
                }

                public final int hashCode() {
                    return this.e.hashCode();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("IOError(e=");
                    sb.append(this.e);
                    sb.append(')');
                    return sb.toString();
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Error$ParseError;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result$Error;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getE", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "hyper-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class ParseError<V> extends Error<V> {
                private final Exception e;

                public ParseError(Exception exc) {
                    toMagicModuleMetaRepoModel.write(exc, "");
                    this.e = exc;
                }

                public final Exception getE() {
                    return this.e;
                }

                public static /* synthetic */ ParseError copy$default(ParseError parseError, Exception exc, int i, Object obj) {
                    if ((i & 1) != 0) {
                        exc = parseError.e;
                    }
                    return parseError.copy(exc);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Exception getE() {
                    return this.e;
                }

                public final ParseError<V> copy(Exception e) {
                    toMagicModuleMetaRepoModel.write(e, "");
                    return new ParseError<>(e);
                }

                public final boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ParseError) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.e, ((ParseError) other).e);
                }

                public final int hashCode() {
                    return this.e.hashCode();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ParseError(e=");
                    sb.append(this.e);
                    sb.append(')');
                    return sb.toString();
                }
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Result$Ok;", "V", "Lin/juspay/hypersdk/ota/UpdateTask$Result;", "p0", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lin/juspay/hypersdk/ota/UpdateTask$Result$Ok;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "v", "Ljava/lang/Object;", "getV"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Ok<V> implements Result<V> {
            private final V v;

            public Ok(V v) {
                this.v = v;
            }

            public final V getV() {
                return this.v;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Ok copy$default(Ok ok, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = ok.v;
                }
                return ok.copy(obj);
            }

            public final V component1() {
                return this.v;
            }

            public final Ok<V> copy(V p0) {
                return new Ok<>(p0);
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                return (p0 instanceof Ok) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.v, ((Ok) p0).v);
            }

            public final int hashCode() {
                V v = this.v;
                if (v == null) {
                    return 0;
                }
                return v.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Ok(v=");
                sb.append(this.v);
                sb.append(')');
                return sb.toString();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Stage;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZING", "FETCHING_RC", "DOWNLOADING_UPDATES", "INSTALLING", "FINISHED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    enum Stage {
        INITIALIZING,
        FETCHING_RC,
        DOWNLOADING_UPDATES,
        INSTALLING,
        FINISHED
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update;", "", "Error", "Package", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Error;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Update {

        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update$Error;", "Lin/juspay/hypersdk/ota/UpdateTask$Update;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Error implements Update {
            public static final Error INSTANCE = new Error();

            private Error() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;", "Lin/juspay/hypersdk/ota/UpdateTask$Update;", "Failed", "Finished", "NA", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$Failed;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$Finished;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$NA;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Package extends Update {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$Failed;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Failed implements Package {
                public static final Failed INSTANCE = new Failed();

                private Failed() {
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00060\u0002R\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$Finished;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;", "Lin/juspay/hypersdk/services/FileProviderService$TempWriter;", "Lin/juspay/hypersdk/services/FileProviderService;", "p0", "", "p1", "<init>", "(Lin/juspay/hypersdk/services/FileProviderService$TempWriter;Z)V", "saved", "Z", "getSaved", "()Z", "tempWriter", "Lin/juspay/hypersdk/services/FileProviderService$TempWriter;", "getTempWriter", "()Lin/juspay/hypersdk/services/FileProviderService$TempWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Finished implements Package {
                private final boolean saved;
                private final FileProviderService.TempWriter tempWriter;

                public Finished(FileProviderService.TempWriter tempWriter, boolean z) {
                    toMagicModuleMetaRepoModel.write(tempWriter, "");
                    this.tempWriter = tempWriter;
                    this.saved = z;
                }

                public final boolean getSaved() {
                    return this.saved;
                }

                public final FileProviderService.TempWriter getTempWriter() {
                    return this.tempWriter;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$Update$Package$NA;", "Lin/juspay/hypersdk/ota/UpdateTask$Update$Package;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class NA implements Package {
                public static final NA INSTANCE = new NA();

                private NA() {
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Stage.values().length];
            try {
                iArr[Stage.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Stage.FETCHING_RC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Stage.DOWNLOADING_UPDATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Stage.INSTALLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Stage.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateTask(String str, FileProviderService fileProviderService, ReleaseConfig releaseConfig, Object obj, SdkTracker sdkTracker, NetUtils netUtils, SessionInfo sessionInfo) {
        ReleaseConfig.Config config;
        ReleaseConfig.PackageManifest pkg;
        ReleaseConfig.Config config2;
        ReleaseConfig.Config config3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(fileProviderService, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(sdkTracker, "");
        toMagicModuleMetaRepoModel.write(netUtils, "");
        toMagicModuleMetaRepoModel.write(sessionInfo, "");
        this.releaseConfigUrl = str;
        this.fileProviderService = fileProviderService;
        this.localReleaseConfig = releaseConfig;
        this.fileLock = obj;
        this.tracker = sdkTracker;
        this.netUtils = netUtils;
        String string = UUID.randomUUID().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.updateUUID = string;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.trackers = copyOnWriteArrayList;
        this.waitQueue = new ArrayBlockingQueue(256);
        this.currentStage = Stage.INITIALIZING;
        this.currentStageStartTime = System.currentTimeMillis();
        this.releaseConfigTimeout = ((releaseConfig == null || (config3 = releaseConfig.getConfig()) == null) ? Constants.INSTANCE.getDEFAULT_CONFIG() : config3).getReleaseConfigTimeout();
        this.initTime = System.currentTimeMillis();
        this.packageTimeout = ((releaseConfig == null || (config2 = releaseConfig.getConfig()) == null) ? Constants.INSTANCE.getDEFAULT_CONFIG() : config2).getPackageTimeout();
        this.currentResult = UpdateResult.NA.INSTANCE;
        this.onFinishWaitTask = new WaitTask();
        Pair pairWrite = setAction.write("x-network-type", sessionInfo.getNetworkName());
        Pair pairWrite2 = setAction.write("x-os-version", sessionInfo.getSessionData().optString("os_version"));
        Pair pairWrite3 = setAction.write("x-hyper-sdk-version", sessionInfo.getBundleParams().optString(PaymentConstants.SDK_VERSION));
        String version = null;
        Pair pairWrite4 = setAction.write("x-package-version", (releaseConfig == null || (pkg = releaseConfig.getPkg()) == null) ? null : pkg.getVersion());
        if (releaseConfig != null && (config = releaseConfig.getConfig()) != null) {
            version = config.getVersion();
        }
        this.defaultHeaders = VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, pairWrite4, setAction.write("x-config-version", version));
        copyOnWriteArrayList.add(sdkTracker);
    }

    private final void awaitCompletion(Stage stage, long timeoutMillis) throws ExecutionException, InterruptedException, TimeoutException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("awaitCompletion: awaiting ");
        sb.append(stage.name());
        sb.append(" for ");
        sb.append(timeoutMillis);
        sb.append("ms");
        JuspayLogger.d(TAG, sb.toString());
        WaitTask waitTask = new WaitTask();
        Pair<WaitTask, Stage> pairWrite = setAction.write(waitTask, stage);
        boolean zOffer = this.waitQueue.offer(pairWrite);
        if (!zOffer) {
            JuspayLogger.e(TAG, "Failed to enqueue!");
        }
        if (this.currentStage.ordinal() > stage.ordinal() || this.currentStage == Stage.FINISHED) {
            if (zOffer) {
                this.waitQueue.remove(pairWrite);
            }
            waitTask.complete();
        }
        waitTask.get(timeoutMillis, TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder("awaitCompletion: ");
        sb2.append(stage.name());
        logTimeTaken(jCurrentTimeMillis, sb2.toString());
    }

    private final void awaitUpdates(Future<Update.Package> packageUpdateFuture, ResourceUpdateTask resourceUpdateTask, long timeoutMillis) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime = System.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(timeoutMillis);
        long nanos2 = TimeUnit.MICROSECONDS.toNanos(1L);
        JuspayLogger.d(TAG, "awaitDownloads: Starting wait.");
        while (true) {
            if (System.nanoTime() >= jNanoTime + nanos) {
                JuspayLogger.d(TAG, "awaitDownloads: Timeout.");
                break;
            } else if (packageUpdateFuture.isDone() && resourceUpdateTask.isDone()) {
                break;
            } else {
                LockSupport.parkNanos(nanos2);
            }
        }
        logTimeTaken(jCurrentTimeMillis, "awaitDownloads: Wait ended.");
    }

    private final boolean copyFilesAsync(final FileProviderService.TempWriter tempWriter, final String dest) {
        String[] list = tempWriter.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.length);
            for (final String str : list) {
                arrayList.add(INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$$ExternalSyntheticLambda3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UpdateTask.copyFilesAsync$lambda$11$lambda$10(tempWriter, str, dest);
                    }
                }));
            }
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((Boolean) ((Future) it.next()).get());
            }
            if (arrayList2.isEmpty()) {
                return true;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Boolean) it2.next(), Boolean.TRUE)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean copyFilesAsync$lambda$11$lambda$10(FileProviderService.TempWriter tempWriter, String str, String str2) {
        toMagicModuleMetaRepoModel.write(tempWriter, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return Boolean.valueOf(tempWriter.moveToMain(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<getShowPopup> downloadFile(FileProviderService.TempWriter tempWriter, URL url, String saveAs) throws JSONException {
        Result<getShowPopup> error;
        byte[] bArrUnZipAndVerify;
        JuspayLogger.d(TAG, "downloadFile ".concat(String.valueOf(url)));
        String strFileName = INSTANCE.fileName(url);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = url.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        Result resultFetch$default = fetch$default(this, string, true, false, 0, 12, null);
        if (resultFetch$default instanceof Result.Ok) {
            try {
                ActivityAdapterModule activityAdapterModule = (ActivityAdapterModule) ((Pair) ((Result.Ok) resultFetch$default).getV()).IconCompatParcelizer();
                if (Thread.interrupted()) {
                    StringBuilder sb = new StringBuilder("Cancelled before writing: ");
                    sb.append(strFileName);
                    JuspayLogger.d(TAG, sb.toString());
                    return new Result.Error();
                }
                byte[] bArrAudioAttributesImplApi26Parcelizer = activityAdapterModule.AudioAttributesImplApi26Parcelizer();
                if (TestGroupLSModel.AudioAttributesImplApi21Parcelizer(strFileName, ".zip")) {
                    StringBuilder sb2 = new StringBuilder("Un-zipping file ");
                    sb2.append(strFileName);
                    JuspayLogger.d(TAG, sb2.toString());
                    bArrUnZipAndVerify = RemoteAssetService.unZipAndVerify(bArrAudioAttributesImplApi26Parcelizer, strFileName, this.fileProviderService.getAssetFileAsByte("remoteAssetPublicKey"), this.tracker);
                } else {
                    bArrUnZipAndVerify = null;
                }
                String str = TestGroupLSModel.read(saveAs, ".zip", ".jsa", false);
                if (bArrUnZipAndVerify != null) {
                    bArrAudioAttributesImplApi26Parcelizer = bArrUnZipAndVerify;
                }
                if (tempWriter.write(str, bArrAudioAttributesImplApi26Parcelizer)) {
                    error = new Result.Ok<>(getShowPopup.INSTANCE);
                } else {
                    StringBuilder sb3 = new StringBuilder("Write to disk failed while downloading: ");
                    sb3.append(strFileName);
                    JuspayLogger.e(TAG, sb3.toString());
                    error = new Result.Error<>();
                }
            } catch (IOException e) {
                INSTANCE.closeQuietly((Closeable) ((Pair) ((Result.Ok) resultFetch$default).getV()).write());
                trackFileWriteError(saveAs, e);
                error = new Result.Error<>();
            }
        } else {
            error = new Result.Error<>();
        }
        logTimeTaken(jCurrentTimeMillis, strFileName);
        return error;
    }

    private final Update.Package downloadPackageUpdate(ReleaseConfig.PackageManifest fetched) throws JSONException {
        List<ReleaseConfig.Split> listRemoteActionCompatParcelizer;
        ReleaseConfig releaseConfig = this.localReleaseConfig;
        ReleaseConfig.PackageManifest pkg = releaseConfig != null ? releaseConfig.getPkg() : null;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (pkg != null ? pkg.getVersion() : null), (Object) fetched.getVersion())) {
            JuspayLogger.d(TAG, "No updates in app.");
            return Update.Package.NA.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("New app version ");
        sb.append(fetched.getVersion());
        sb.append(" available, trying to download update.");
        JuspayLogger.d(TAG, sb.toString());
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Companion companion = INSTANCE;
            List<ReleaseConfig.Split> allSplits = fetched.getAllSplits();
            if (pkg == null || (listRemoteActionCompatParcelizer = pkg.getAllSplits()) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List<ReleaseConfig.Split> difference = companion.setDifference(allSplits, listRemoteActionCompatParcelizer);
            StringBuilder sb2 = new StringBuilder("Downloading splits: ");
            sb2.append(difference);
            JuspayLogger.d(TAG, sb2.toString());
            final FileProviderService.TempWriter tempWriterNewTempWriter = this.fileProviderService.newTempWriter(Constants.PACKAGE_DIR_NAME);
            JuspayLogger.d(TAG, "Starting split downloads.");
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) difference, 10));
            for (final ReleaseConfig.Split split : difference) {
                arrayList.add(INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UpdateTask.downloadPackageUpdate$lambda$7$lambda$6(this.f$0, tempWriterNewTempWriter, split);
                    }
                }));
            }
            JuspayLogger.d(TAG, "Awaiting split downloads.");
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((Result) ((Future) it.next()).get());
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((Result) it2.next()) instanceof Result.Error) {
                        JuspayLogger.d(TAG, "Failed to download some splits.");
                        return Update.Package.Failed.INSTANCE;
                    }
                }
            }
            logTimeTaken(jCurrentTimeMillis, "Downloaded new package");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tempWriterNewTempWriter, "");
            return new Update.Package.Finished(tempWriterNewTempWriter, false);
        } catch (Exception e) {
            JuspayLogger.d(TAG, "An exception occurred during package update.");
            trackException$default(this, "package_update_error", e, null, 4, null);
            return Update.Package.Failed.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Result downloadPackageUpdate$lambda$7$lambda$6(UpdateTask updateTask, FileProviderService.TempWriter tempWriter, ReleaseConfig.Split split) {
        toMagicModuleMetaRepoModel.write(updateTask, "");
        toMagicModuleMetaRepoModel.write(split, "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tempWriter, "");
        return updateTask.downloadFile(tempWriter, split.getUrl(), split.getFileName());
    }

    private final Result<Pair<C0156TypeKt, ActivityAdapterModule>> fetch(String url, boolean retryEnabled, boolean noCache, int tryCnt) throws JSONException {
        Map<String, String> mapIconCompatParcelizer;
        try {
            if (noCache) {
                mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(this.defaultHeaders);
                mapIconCompatParcelizer.put("cache-control", "no-cache");
            } else {
                mapIconCompatParcelizer = this.defaultHeaders;
            }
            C0156TypeKt c0156TypeKtDoGet = this.netUtils.doGet(url, mapIconCompatParcelizer, null, null, null);
            int code = c0156TypeKtDoGet.getCode();
            ActivityAdapterModule body = c0156TypeKtDoGet.getBody();
            if (code != 200) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(c0156TypeKtDoGet, "");
                trackFetchHttpError(c0156TypeKtDoGet);
                c0156TypeKtDoGet.close();
                return new Result.Error.HttpError(c0156TypeKtDoGet);
            }
            if (body != null) {
                return new Result.Ok(new Pair(c0156TypeKtDoGet, body));
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(c0156TypeKtDoGet, "");
            trackFetchHttpError(c0156TypeKtDoGet);
            c0156TypeKtDoGet.close();
            return new Result.Error.HttpNoBody(c0156TypeKtDoGet);
        } catch (IOException e) {
            if (e instanceof InterruptedIOException) {
                return new Result.Error();
            }
            trackFetchIOError(url, e);
            return (tryCnt > 0 || !retryEnabled) ? new Result.Error() : fetch(url, true, noCache, tryCnt + 1);
        }
    }

    static /* synthetic */ Result fetch$default(UpdateTask updateTask, String str, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return updateTask.fetch(str, z, z2, i);
    }

    private final ReleaseConfig fetchReleaseConfig() throws JSONException, IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Result<Pair<C0156TypeKt, ActivityAdapterModule>> resultFetch$default = fetch$default(this, this.releaseConfigUrl, false, true, 0, 10, null);
        if (!(resultFetch$default instanceof Result.Ok)) {
            if (resultFetch$default instanceof Result.Error) {
                return null;
            }
            throw new RenewEligibleCreator();
        }
        byte[] bArrAudioAttributesImplApi26Parcelizer = ((ActivityAdapterModule) ((Pair) ((Result.Ok) resultFetch$default).getV()).IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrAudioAttributesImplApi26Parcelizer, "");
        Charset charset = StandardCharsets.UTF_8;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        try {
            Object objM355deSerializeIoAF18A = ReleaseConfig.INSTANCE.m355deSerializeIoAF18A(new String(bArrAudioAttributesImplApi26Parcelizer, charset));
            SdkPayloadData.IconCompatParcelizer(objM355deSerializeIoAF18A);
            ReleaseConfig releaseConfig = (ReleaseConfig) objM355deSerializeIoAF18A;
            trackReleaseConfigFetchResult(resultFetch$default, jCurrentTimeMillis);
            return releaseConfig;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to parse release config ");
            sb.append(Log.getStackTraceString(e));
            JuspayLogger.e(TAG, sb.toString());
            trackReleaseConfigFetchResult(new Result.Error.ParseError(e), jCurrentTimeMillis);
            return null;
        }
    }

    private final boolean installPackageUpdate(Update.Package update, ReleaseConfig.PackageManifest pkg, long startTime) throws JSONException {
        boolean z = false;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(update, Update.Package.Failed.INSTANCE)) {
            trackPackageUpdateResult(new Result.Error(), startTime);
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(update, Update.Package.NA.INSTANCE)) {
            JuspayLogger.d(TAG, "Application is up to-date!");
            return false;
        }
        if (!(update instanceof Update.Package.Finished)) {
            throw new RenewEligibleCreator();
        }
        Update.Package.Finished finished = (Update.Package.Finished) update;
        boolean zCopyFilesAsync = copyFilesAsync(finished.getTempWriter(), "app/package");
        if (zCopyFilesAsync) {
            JuspayLogger.d(TAG, "Copied splits.");
        }
        boolean zWritePackageManifest = zCopyFilesAsync ? writePackageManifest(pkg) : false;
        if (zWritePackageManifest) {
            JuspayLogger.d(TAG, "Wrote package manifest.");
        }
        if (zCopyFilesAsync && zWritePackageManifest) {
            z = true;
        }
        if (!z) {
            JuspayLogger.e(TAG, "An error occurred while installing the package.");
            trackPackageUpdateResult(new Result.Error(), startTime);
            return z;
        }
        if (finished.getSaved()) {
            removeFromPersistentState(ApplicationManager.StateKey.SAVED_PACKAGE_UPDATE);
        }
        StringBuilder sb = new StringBuilder("Installed new package version: ");
        sb.append(pkg.getVersion());
        JuspayLogger.d(TAG, sb.toString());
        trackPackageUpdateResult(new Result.Ok(pkg.getVersion()), startTime);
        return z;
    }

    private final JSONObject loadPersistentState() throws JSONException {
        try {
            return new JSONObject(this.fileProviderService.readFromFile("app/state.json"));
        } catch (JSONException e) {
            trackException$default(this, "persistent_state_load_failed", e, null, 4, null);
            savePersistentState(new JSONObject());
            return new JSONObject();
        }
    }

    private final void logTimeTaken(long startTime, String label) {
    }

    static /* synthetic */ void logTimeTaken$default(UpdateTask updateTask, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        updateTask.logTimeTaken(j, str);
    }

    private final void onComplete(Stage completedStage) throws ExecutionException, JSONException, InterruptedException {
        if (completedStage.ordinal() >= this.currentStage.ordinal()) {
            Stage stage = this.currentStage;
            Stage stage2 = Stage.FINISHED;
            if (stage != stage2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.currentStageStartTime;
                this.currentStageStartTime = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("Ended stage: ");
                sb.append(completedStage.name());
                sb.append(' ');
                sb.append(jCurrentTimeMillis - j);
                sb.append("ms");
                JuspayLogger.d(TAG, sb.toString());
                int i = WhenMappings.$EnumSwitchMapping$0[completedStage.ordinal()];
                if (i == 1) {
                    stage2 = Stage.FETCHING_RC;
                } else if (i == 2) {
                    stage2 = Stage.DOWNLOADING_UPDATES;
                } else if (i == 3) {
                    stage2 = Stage.INSTALLING;
                } else if (i != 4 && i != 5) {
                    throw new RenewEligibleCreator();
                }
                this.currentStage = stage2;
                StringBuilder sb2 = new StringBuilder("Reached stage: ");
                sb2.append(this.currentStage.name());
                JuspayLogger.d(TAG, sb2.toString());
                for (int size = this.waitQueue.size(); size > 0; size--) {
                    Pair<WaitTask, Stage> pairPoll = this.waitQueue.poll();
                    if (pairPoll != null) {
                        WaitTask waitTaskRemoteActionCompatParcelizer = pairPoll.RemoteActionCompatParcelizer();
                        if (pairPoll.read().ordinal() <= completedStage.ordinal()) {
                            waitTaskRemoteActionCompatParcelizer.complete();
                        } else {
                            this.waitQueue.offer(pairPoll);
                        }
                    }
                }
                if (this.currentStage == Stage.FINISHED) {
                    while (!this.waitQueue.isEmpty()) {
                        Pair<WaitTask, Stage> pairPoll2 = this.waitQueue.poll();
                        if (pairPoll2 != null) {
                            pairPoll2.RemoteActionCompatParcelizer().complete();
                        }
                    }
                    Future<getShowPopup> future = this.resourceSaveFuture;
                    if (future != null) {
                        future.get();
                    }
                    trackEnd();
                    JSONObject jSONObjectLoadPersistentState = loadPersistentState();
                    MagicModuleSubmissionRequestBody<? super UpdateResult, ? super JSONObject, getShowPopup> magicModuleSubmissionRequestBody = this.onFinish;
                    if (magicModuleSubmissionRequestBody != null) {
                        magicModuleSubmissionRequestBody.invoke(this.currentResult, jSONObjectLoadPersistentState);
                    }
                    this.onFinishWaitTask.complete();
                    return;
                }
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder("Received completion of stage ");
        sb3.append(completedStage.name());
        sb3.append(" even though current stage is");
        sb3.append(this.currentStage.name());
        sb3.append('.');
        JuspayLogger.d(TAG, sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject readPersistentState(ApplicationManager.StateKey key) {
        StringBuilder sb = new StringBuilder("readPersistentState: ");
        sb.append(key.name());
        JuspayLogger.d(TAG, sb.toString());
        JSONObject jSONObjectOptJSONObject = loadPersistentState().optJSONObject(key.name());
        JuspayLogger.d(TAG, "readPersistentState exit");
        return jSONObjectOptJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeFromPersistentState(ApplicationManager.StateKey key) throws JSONException {
        JSONObject jSONObjectLoadPersistentState = loadPersistentState();
        jSONObjectLoadPersistentState.remove(key.name());
        savePersistentState(jSONObjectLoadPersistentState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup run$lambda$0(UpdateTask updateTask) throws ExecutionException, JSONException, InterruptedException, IOException {
        toMagicModuleMetaRepoModel.write(updateTask, "");
        updateTask.runInternal();
        return getShowPopup.INSTANCE;
    }

    private final void runInternal() throws ExecutionException, JSONException, InterruptedException, IOException {
        ReleaseConfig.Config config;
        ReleaseConfig.Config config2;
        final ReleaseConfig releaseConfigFetchReleaseConfig = fetchReleaseConfig();
        if (releaseConfigFetchReleaseConfig == null) {
            this.currentResult = UpdateResult.Error.RCFetchError.INSTANCE;
            onComplete(Stage.FINISHED);
            return;
        }
        updateTimeouts(releaseConfigFetchReleaseConfig);
        onComplete(Stage.FETCHING_RC);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Companion companion = INSTANCE;
        Future<Update.Package> futureDoAsync = companion.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UpdateTask.runInternal$lambda$1(this.f$0, releaseConfigFetchReleaseConfig);
            }
        });
        ReleaseConfig releaseConfig = this.localReleaseConfig;
        ResourceUpdateTask resourceUpdateTask = new ResourceUpdateTask(this, releaseConfig != null ? releaseConfig.getResources() : null, releaseConfigFetchReleaseConfig.getResources());
        resourceUpdateTask.start();
        String version = releaseConfigFetchReleaseConfig.getConfig().getVersion();
        ReleaseConfig releaseConfig2 = this.localReleaseConfig;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) version, (Object) ((releaseConfig2 == null || (config2 = releaseConfig2.getConfig()) == null) ? null : config2.getVersion())) || !writeConfig(releaseConfigFetchReleaseConfig.getConfig())) {
            config = null;
        } else {
            config = releaseConfigFetchReleaseConfig.getConfig();
            setCurrentResult$default(this, config, null, null, 6, null);
            JSONObject jSONObjectPut = new JSONObject().put("new_config_version", releaseConfigFetchReleaseConfig.getConfig().getVersion());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackInfo("config_updated", jSONObjectPut);
            JuspayLogger.d(TAG, "Config updated.");
        }
        awaitUpdates(futureDoAsync, resourceUpdateTask, this.packageTimeout);
        final Update.Package r2 = futureDoAsync.get();
        onComplete(Stage.DOWNLOADING_UPDATES);
        Future futureDoAsync2 = companion.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UpdateTask.runInternal$lambda$2(this.f$0, r2, releaseConfigFetchReleaseConfig, jCurrentTimeMillis);
            }
        });
        ReleaseConfig.ResourceManifest resourceManifestStopAndInstall = resourceUpdateTask.stopAndInstall();
        Object obj = futureDoAsync2.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        setCurrentResult(config, ((Boolean) obj).booleanValue() ? releaseConfigFetchReleaseConfig.getPkg() : null, resourceManifestStopAndInstall);
        onComplete(Stage.INSTALLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Update.Package runInternal$lambda$1(UpdateTask updateTask, ReleaseConfig releaseConfig) {
        toMagicModuleMetaRepoModel.write(updateTask, "");
        return updateTask.downloadPackageUpdate(releaseConfig.getPkg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runInternal$lambda$2(UpdateTask updateTask, Update.Package r2, ReleaseConfig releaseConfig, long j) {
        toMagicModuleMetaRepoModel.write(updateTask, "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, "");
        return Boolean.valueOf(updateTask.installPackageUpdate(r2, releaseConfig.getPkg(), j));
    }

    private final void savePersistentState(JSONObject state) throws JSONException {
        try {
            FileProviderService fileProviderService = this.fileProviderService;
            String string = state.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            byte[] bytes = string.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            fileProviderService.updateFile("app/state.json", bytes);
        } catch (Exception e) {
            JSONObject jSONObjectPut = new JSONObject().put(NotesDispatchAddressRequestKt.KEY_STATE, state);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackException("persistent_state_save_failed", e, jSONObjectPut);
        }
    }

    private final void setCurrentResult(ReleaseConfig.Config config, ReleaseConfig.PackageManifest pkg, ReleaseConfig.ResourceManifest resources) {
        ReleaseConfig releaseConfig;
        ReleaseConfig releaseConfig2;
        if (config == null && pkg == null && resources == null) {
            return;
        }
        try {
            if (config == null && ((releaseConfig2 = this.localReleaseConfig) == null || (config = releaseConfig2.getConfig()) == null)) {
                config = Constants.INSTANCE.getDEFAULT_CONFIG();
            }
            if (pkg == null) {
                ReleaseConfig releaseConfig3 = this.localReleaseConfig;
                pkg = releaseConfig3 != null ? releaseConfig3.getPkg() : null;
                toMagicModuleMetaRepoModel.write(pkg);
            }
            if (resources == null && ((releaseConfig = this.localReleaseConfig) == null || (resources = releaseConfig.getResources()) == null)) {
                resources = Constants.INSTANCE.getDEFAULT_RESOURCES();
            }
            this.currentResult = new UpdateResult.Ok(new ReleaseConfig(config, pkg, resources));
        } catch (NullPointerException unused) {
            this.currentResult = UpdateResult.Error.Unknown.INSTANCE;
        }
    }

    static /* synthetic */ void setCurrentResult$default(UpdateTask updateTask, ReleaseConfig.Config config, ReleaseConfig.PackageManifest packageManifest, ReleaseConfig.ResourceManifest resourceManifest, int i, Object obj) {
        if ((i & 1) != 0) {
            config = null;
        }
        if ((i & 2) != 0) {
            packageManifest = null;
        }
        if ((i & 4) != 0) {
            resourceManifest = null;
        }
        updateTask.setCurrentResult(config, packageManifest, resourceManifest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInPersistentState(ApplicationManager.StateKey key, JSONObject value) throws JSONException {
        JSONObject jSONObjectLoadPersistentState = loadPersistentState();
        try {
            jSONObjectLoadPersistentState.put(key.name(), value);
            savePersistentState(jSONObjectLoadPersistentState);
        } catch (JSONException e) {
            JSONObject jSONObjectPut = new JSONObject().put("key", key).put(AppMeasurementSdk.ConditionalUserProperty.VALUE, value);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            trackException("persistent_state_set_failed", e, jSONObjectPut);
        }
    }

    private final void trackEnd() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("time_taken", System.currentTimeMillis() - this.initTime);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo(TtmlNode.END, jSONObjectPut);
    }

    private final void trackError(String label, JSONObject value) {
        trackGeneric("error", label, value);
    }

    private final void trackException(String label, Exception e, JSONObject value) throws JSONException {
        JSONObject jSONObjectPut = value.put("error", e.getMessage()).put("stack_trace", Log.getStackTraceString(e));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackError(label, jSONObjectPut);
    }

    static /* synthetic */ void trackException$default(UpdateTask updateTask, String str, Exception exc, JSONObject jSONObject, int i, Object obj) throws JSONException {
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        updateTask.trackException(str, exc, jSONObject);
    }

    private final void trackFetchHttpError(C0156TypeKt c0156TypeKt) throws JSONException {
        String strUtf8;
        InputStream inputStreamIconCompatParcelizer;
        ActivityAdapterModule body = c0156TypeKt.getBody();
        if (body == null || (inputStreamIconCompatParcelizer = body.IconCompatParcelizer()) == null || (strUtf8 = INSTANCE.utf8(inputStreamIconCompatParcelizer)) == null) {
            strUtf8 = "null";
        }
        JSONObject jSONObjectPut = new JSONObject().put("url", c0156TypeKt.getRequest().getUrl().toString()).put("status", c0156TypeKt.getCode()).put("body", strUtf8);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackError("fetch_failed", jSONObjectPut);
    }

    private final void trackFetchIOError(String url, IOException e) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("url", url);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackException("fetch_failed", e, jSONObjectPut);
    }

    private final void trackFileWriteError(String fileName, Exception e) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("file_name", fileName);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackException("file_write_failed", e, jSONObjectPut);
    }

    private final void trackGeneric(String level, String label, JSONObject value) {
        Iterator<T> it = this.trackers.iterator();
        while (it.hasNext()) {
            ((SdkTracker) it.next()).trackAction(LogSubCategory.Action.SYSTEM, level, TAG, label, value.put("app_update_id", this.updateUUID));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackInfo(String label, JSONObject value) {
        trackGeneric("info", label, value);
    }

    private final void trackInit() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReleaseConfig releaseConfig = this.localReleaseConfig;
        if (releaseConfig != null) {
            jSONObject.put(CourseConfigKeyConstantsKt.KEY_CONFIG_VERSION, releaseConfig.getConfig().getVersion()).put("package_version", this.localReleaseConfig.getPkg().getVersion());
        }
        trackInfo("init", jSONObject);
    }

    private final void trackPackageUpdateResult(Result<String> updateResult, long startTime) throws JSONException {
        String str = updateResult instanceof Result.Ok ? (String) ((Result.Ok) updateResult).getV() : null;
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("result", "SUCCESS").put("package_version", str);
        } else {
            jSONObject.put("result", "FAILED");
        }
        JSONObject jSONObjectPut = jSONObject.put("time_taken", System.currentTimeMillis() - startTime);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo(LogLabel.PACKAGE_UPDATE_RESULT, jSONObjectPut);
    }

    private final void trackReleaseConfigFetchResult(Result<Pair<C0156TypeKt, ActivityAdapterModule>> fetchResult, long startTime) throws JSONException {
        Object objValueOf = fetchResult instanceof Result.Ok ? Integer.valueOf(((C0156TypeKt) ((Pair) ((Result.Ok) fetchResult).getV()).write()).getCode()) : fetchResult instanceof Result.Error.HttpError ? Integer.valueOf(((Result.Error.HttpError) fetchResult).getResponse().getCode()) : fetchResult instanceof Result.Error.HttpNoBody ? Integer.valueOf(((Result.Error.HttpNoBody) fetchResult).getResponse().getCode()) : TestIndex.ALL_INDIA_ID;
        String message = fetchResult instanceof Result.Error.HttpError ? ((Result.Error.HttpError) fetchResult).getResponse().getMessage() : fetchResult instanceof Result.Error.HttpNoBody ? "HTTP_NO_BODY" : fetchResult instanceof Result.Error.ParseError ? ((Result.Error.ParseError) fetchResult).getE().getMessage() : null;
        JSONObject jSONObjectPut = new JSONObject().put("release_config_url", this.releaseConfigUrl).put("status", objValueOf).put("time_taken", System.currentTimeMillis() - startTime);
        if (message != null) {
            jSONObjectPut.put("error", message);
        }
        if (fetchResult instanceof Result.Error.ParseError) {
            jSONObjectPut.put("stack_trace", Log.getStackTraceString(((Result.Error.ParseError) fetchResult).getE()));
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        trackInfo("release_config_fetch", jSONObjectPut);
    }

    private final void updateTimeouts(ReleaseConfig fetchedReleaseConfig) {
        this.releaseConfigTimeout = fetchedReleaseConfig.getConfig().getReleaseConfigTimeout();
        this.packageTimeout = fetchedReleaseConfig.getConfig().getPackageTimeout();
    }

    private final boolean writeConfig(ReleaseConfig.Config config) {
        String string = config.toJSON().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return writeManifest(Constants.CONFIG_FILE_NAME, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeManifest(String fileName, String text) {
        boolean zUpdateFile;
        JuspayLogger.d(TAG, "writing manifest ".concat(String.valueOf(fileName)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.fileLock) {
            FileProviderService fileProviderService = this.fileProviderService;
            StringBuilder sb = new StringBuilder("app/");
            sb.append(fileName);
            String string = sb.toString();
            byte[] bytes = text.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            zUpdateFile = fileProviderService.updateFile(string, bytes);
        }
        logTimeTaken(jCurrentTimeMillis, "writeManifest ".concat(String.valueOf(fileName)));
        return zUpdateFile;
    }

    private final boolean writePackageManifest(ReleaseConfig.PackageManifest packageManifest) {
        String string = packageManifest.toJSON().toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return writeManifest(Constants.PACKAGE_MANIFEST_FILE_NAME, string);
    }

    public final UpdateResult await(SdkTracker tracker) {
        toMagicModuleMetaRepoModel.write(tracker, "");
        if (!this.trackers.contains(tracker)) {
            this.trackers.add(tracker);
        }
        try {
            awaitCompletion(Stage.FETCHING_RC, this.releaseConfigTimeout);
            try {
                awaitCompletion(Stage.DOWNLOADING_UPDATES, this.packageTimeout);
                try {
                    awaitCompletion(Stage.INSTALLING, 10000L);
                    return this.currentResult;
                } catch (TimeoutException unused) {
                    JuspayLogger.e(TAG, "TIMEOUT WAITING for INSTALLING!");
                    return UpdateResult.Error.Unknown.INSTANCE;
                }
            } catch (TimeoutException unused2) {
                JuspayLogger.d(TAG, "Timeout waiting for package update.");
                UpdateResult updateResult = this.currentResult;
                return new UpdateResult.PackageUpdateTimeout(updateResult instanceof UpdateResult.Ok ? ((UpdateResult.Ok) updateResult).getReleaseConfig() : null);
            }
        } catch (TimeoutException unused3) {
            JuspayLogger.d(TAG, "Timeout waiting for release config fetch.");
            return UpdateResult.ReleaseConfigFetchTimeout.INSTANCE;
        }
    }

    public final void awaitOnFinish$hyper_sdk_release() {
        this.onFinishWaitTask.get();
    }

    public final String getUpdateUUID() {
        return this.updateUUID;
    }

    public final void run(MagicModuleSubmissionRequestBody<? super UpdateResult, ? super JSONObject, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        trackInit();
        Stage stage = this.currentStage;
        Stage stage2 = Stage.INITIALIZING;
        if (stage == stage2) {
            this.onFinish = magicModuleSubmissionRequestBody;
            this.initTime = System.currentTimeMillis();
            onComplete(stage2);
            INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$$ExternalSyntheticLambda4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return UpdateTask.run$lambda$0(this.f$0);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\u0004\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\tR\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0018\u0012\b\u0012\u00060\tR\u00020\n\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016RD\u0010$\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tR\u00020\n0\u000e0#0\u000b0\"8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0016R \u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R0\u00100\u001a\u0018\u0012\b\u0012\u00060\tR\u00020\n\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0010R\u001e\u00103\u001a\u00060\tR\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateTask$ResourceUpdateTask;", "", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "Lin/juspay/hypersdk/ota/Resources;", "p0", "p1", "<init>", "(Lin/juspay/hypersdk/ota/UpdateTask;Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;)V", "Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "Lin/juspay/hypersdk/services/FileProviderService$TempWriter;", "Lin/juspay/hypersdk/services/FileProviderService;", "Ljava/util/concurrent/Future;", "copyResource", "(Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;Lin/juspay/hypersdk/services/FileProviderService$TempWriter;)Ljava/util/concurrent/Future;", "Lo/getSubscriptionExpiresOn;", "findSavedResources", "()Lo/getSubscriptionExpiresOn;", "", "saveDownloadedResources", "()V", TtmlNode.START, "stopAndInstall", "()Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "", "writeResourceManifest", "(Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;)Z", "", "commonResources", "Ljava/util/Set;", "getCommonResources", "()Ljava/util/Set;", "currentResourceManifest", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "getCurrentResourceManifest", "", "Lin/juspay/hypersdk/ota/UpdateTask$Result;", "futures", "Ljava/util/List;", "getFutures", "()Ljava/util/List;", "setFutures", "(Ljava/util/List;)V", "isDone", "()Z", "newResourceManifest", "getNewResourceManifest", "newResources", "getNewResources", "savedResourcesInfo", "Lo/getSubscriptionExpiresOn;", "getSavedResourcesInfo", "tempWriter", "Lin/juspay/hypersdk/services/FileProviderService$TempWriter;", "getTempWriter", "()Lin/juspay/hypersdk/services/FileProviderService$TempWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class ResourceUpdateTask {
        private final Set<ReleaseConfig.Resource> commonResources;
        private final ReleaseConfig.ResourceManifest currentResourceManifest;
        public List<? extends Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> futures;
        private final ReleaseConfig.ResourceManifest newResourceManifest;
        private final List<ReleaseConfig.Resource> newResources;
        private final Pair<FileProviderService.TempWriter, ReleaseConfig.ResourceManifest> savedResourcesInfo;
        private final FileProviderService.TempWriter tempWriter;
        final /* synthetic */ UpdateTask this$0;

        public ResourceUpdateTask(UpdateTask updateTask, ReleaseConfig.ResourceManifest resourceManifest, ReleaseConfig.ResourceManifest resourceManifest2) {
            toMagicModuleMetaRepoModel.write(resourceManifest2, "");
            this.this$0 = updateTask;
            this.currentResourceManifest = resourceManifest;
            this.newResourceManifest = resourceManifest2;
            FileProviderService.TempWriter tempWriterNewTempWriter = updateTask.fileProviderService.newTempWriter(Constants.RESOURCES_DIR_NAME);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tempWriterNewTempWriter, "");
            this.tempWriter = tempWriterNewTempWriter;
            Set<ReleaseConfig.Resource> setAudioAttributesCompatParcelizer = (resourceManifest == null || (setAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) resourceManifest, (Iterable) IntermediateLoginResponseBody.onPlayFromUri(resourceManifest2))) == null) ? getKycMessage.read() : setAudioAttributesCompatParcelizer;
            this.commonResources = setAudioAttributesCompatParcelizer;
            this.newResources = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) resourceManifest2, (Iterable) setAudioAttributesCompatParcelizer);
            this.savedResourcesInfo = findSavedResources();
        }

        private final Future<ReleaseConfig.Resource> copyResource(final ReleaseConfig.Resource p0, final FileProviderService.TempWriter p1) {
            return UpdateTask.INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return UpdateTask.ResourceUpdateTask.copyResource$lambda$17(p1, p0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReleaseConfig.Resource copyResource$lambda$17(FileProviderService.TempWriter tempWriter, ReleaseConfig.Resource resource) {
            toMagicModuleMetaRepoModel.write(tempWriter, "");
            toMagicModuleMetaRepoModel.write(resource, "");
            if (tempWriter.moveToMain(resource.getFileName(), "app/resources")) {
                return resource;
            }
            StringBuilder sb = new StringBuilder("Failed to copy resource: ");
            sb.append(resource.getFileName());
            JuspayLogger.e(UpdateTask.TAG, sb.toString());
            return null;
        }

        private final Pair<FileProviderService.TempWriter, ReleaseConfig.ResourceManifest> findSavedResources() throws JSONException {
            JSONObject persistentState = this.this$0.readPersistentState(ApplicationManager.StateKey.SAVED_RESOURCE_UPDATE);
            if (persistentState == null) {
                return null;
            }
            UpdateTask updateTask = this.this$0;
            StringBuilder sb = new StringBuilder("Found saved resources ");
            sb.append(persistentState);
            sb.append('.');
            JuspayLogger.d(UpdateTask.TAG, sb.toString());
            try {
                FileProviderService.TempWriter tempWriterReOpenTempWriter = updateTask.fileProviderService.reOpenTempWriter(persistentState.getString("dir"));
                ReleaseConfig.Companion companion = ReleaseConfig.INSTANCE;
                JSONObject jSONObject = persistentState.getJSONObject("resource_manifest");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject, "");
                ReleaseConfig.ResourceManifest resourceManifestResourcesFromJSON = companion.resourcesFromJSON(jSONObject);
                if (resourceManifestResourcesFromJSON.isEmpty()) {
                    return null;
                }
                return new Pair<>(tempWriterReOpenTempWriter, resourceManifestResourcesFromJSON);
            } catch (Exception e) {
                updateTask.removeFromPersistentState(ApplicationManager.StateKey.SAVED_RESOURCE_UPDATE);
                UpdateTask.trackException$default(updateTask, "saved_resources_corrupted", e, null, 4, null);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Result start$lambda$2$lambda$1(ResourceUpdateTask resourceUpdateTask, ReleaseConfig.Resource resource, UpdateTask updateTask) {
            toMagicModuleMetaRepoModel.write(resourceUpdateTask, "");
            toMagicModuleMetaRepoModel.write(resource, "");
            toMagicModuleMetaRepoModel.write(updateTask, "");
            Pair<FileProviderService.TempWriter, ReleaseConfig.ResourceManifest> pair = resourceUpdateTask.savedResourcesInfo;
            if (pair == null || !pair.IconCompatParcelizer().contains((Object) resource)) {
                StringBuilder sb = new StringBuilder("Downloading resource: ");
                sb.append(resource.getFileName());
                JuspayLogger.d(UpdateTask.TAG, sb.toString());
                return updateTask.downloadFile(resourceUpdateTask.tempWriter, resource.getUrl(), resource.getFileName()) instanceof Result.Ok ? new Result.Ok(new Pair(resource, resourceUpdateTask.tempWriter)) : new Result.Error();
            }
            StringBuilder sb2 = new StringBuilder("Skipping download of saved resource: ");
            sb2.append(resource.getFileName());
            JuspayLogger.d(UpdateTask.TAG, sb2.toString());
            return new Result.Ok(new Pair(resource, resourceUpdateTask.savedResourcesInfo.write()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void stopAndInstall$lambda$10(UpdateTask updateTask) throws JSONException {
            toMagicModuleMetaRepoModel.write(updateTask, "");
            updateTask.removeFromPersistentState(ApplicationManager.StateKey.SAVED_RESOURCE_UPDATE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup stopAndInstall$lambda$9(ResourceUpdateTask resourceUpdateTask) throws JSONException {
            toMagicModuleMetaRepoModel.write(resourceUpdateTask, "");
            resourceUpdateTask.saveDownloadedResources();
            return getShowPopup.INSTANCE;
        }

        private final boolean writeResourceManifest(ReleaseConfig.ResourceManifest p0) throws JSONException {
            JSONObject json = p0.toJSON();
            UpdateTask updateTask = this.this$0;
            String string = json.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return updateTask.writeManifest(Constants.RESOURCES_FILE_NAME, string);
        }

        public final Set<ReleaseConfig.Resource> getCommonResources() {
            return this.commonResources;
        }

        public final ReleaseConfig.ResourceManifest getCurrentResourceManifest() {
            return this.currentResourceManifest;
        }

        public final List<Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> getFutures() {
            List list = this.futures;
            if (list != null) {
                return list;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        public final ReleaseConfig.ResourceManifest getNewResourceManifest() {
            return this.newResourceManifest;
        }

        public final List<ReleaseConfig.Resource> getNewResources() {
            return this.newResources;
        }

        public final Pair<FileProviderService.TempWriter, ReleaseConfig.ResourceManifest> getSavedResourcesInfo() {
            return this.savedResourcesInfo;
        }

        public final FileProviderService.TempWriter getTempWriter() {
            return this.tempWriter;
        }

        public final boolean isDone() {
            List<Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> futures = getFutures();
            if ((futures instanceof Collection) && futures.isEmpty()) {
                return true;
            }
            Iterator<T> it = futures.iterator();
            while (it.hasNext()) {
                if (!((Future) it.next()).isDone()) {
                    return false;
                }
            }
            return true;
        }

        public final void saveDownloadedResources() throws JSONException {
            List<Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> futures = getFutures();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) futures, 10));
            Iterator<T> it = futures.iterator();
            while (it.hasNext()) {
                arrayList.add((Result) ((Future) it.next()).get());
            }
            if (arrayList.isEmpty()) {
                JuspayLogger.d(UpdateTask.TAG, "No resources to save.");
                return;
            }
            JuspayLogger.d(UpdateTask.TAG, "Download results: ".concat(String.valueOf(arrayList)));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof Result.Ok) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((FileProviderService.TempWriter) ((Pair) ((Result.Ok) obj2).getV()).IconCompatParcelizer()).getDirName(), (Object) this.tempWriter.getDirName())) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add((ReleaseConfig.Resource) ((Pair) ((Result.Ok) it2.next()).getV()).write());
            }
            ReleaseConfig.ResourceManifest resourceManifest = this.newResourceManifest;
            ArrayList arrayList5 = new ArrayList();
            for (ReleaseConfig.Resource resource : resourceManifest) {
                if (arrayList4.contains(resource)) {
                    arrayList5.add(resource);
                }
            }
            JSONObject jSONObject = new JSONObject(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("dir", this.tempWriter.getDirName()), setAction.write("resource_manifest", new ReleaseConfig.ResourceManifest(arrayList5).toJSON())));
            JuspayLogger.d(UpdateTask.TAG, "Saved resources ".concat(String.valueOf(arrayList5)));
            this.this$0.setInPersistentState(ApplicationManager.StateKey.SAVED_RESOURCE_UPDATE, jSONObject);
        }

        public final void setFutures(List<? extends Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.futures = list;
        }

        public final void start() {
            JuspayLogger.d(UpdateTask.TAG, "Starting resource update task.");
            List<ReleaseConfig.Resource> list = this.newResources;
            final UpdateTask updateTask = this.this$0;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (final ReleaseConfig.Resource resource : list) {
                arrayList.add(UpdateTask.INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UpdateTask.ResourceUpdateTask.start$lambda$2$lambda$1(this.f$0, resource, updateTask);
                    }
                }));
            }
            setFutures(arrayList);
        }

        public final ReleaseConfig.ResourceManifest stopAndInstall() throws JSONException {
            List<Future<Result<Pair<ReleaseConfig.Resource, FileProviderService.TempWriter>>>> futures = getFutures();
            ArrayList arrayList = new ArrayList();
            for (Object obj : futures) {
                if (((Future) obj).isDone()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((Result) ((Future) it.next()).get());
            }
            ArrayList<Result.Ok> arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof Result.Ok) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, 10));
            for (Result.Ok ok : arrayList3) {
                arrayList4.add(copyResource((ReleaseConfig.Resource) ((Pair) ok.getV()).write(), (FileProviderService.TempWriter) ((Pair) ok.getV()).IconCompatParcelizer()));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ReleaseConfig.Resource resource = (ReleaseConfig.Resource) ((Future) it2.next()).get();
                if (resource != null) {
                    arrayList5.add(resource);
                }
            }
            List<ReleaseConfig.Resource> list = this.newResources;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list) {
                if (!arrayList5.contains((ReleaseConfig.Resource) obj3)) {
                    arrayList6.add(obj3);
                }
            }
            if (arrayList6.isEmpty()) {
                if (this.savedResourcesInfo != null) {
                    final UpdateTask updateTask = this.this$0;
                    ExecutorManager.runOnBackgroundThread(new Runnable() { // from class: in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            UpdateTask.ResourceUpdateTask.stopAndInstall$lambda$10(updateTask);
                        }
                    });
                }
                JuspayLogger.d(UpdateTask.TAG, "No resources skipped!");
            } else {
                JuspayLogger.d(UpdateTask.TAG, "Skipped resources ".concat(String.valueOf(arrayList6)));
                UpdateTask updateTask2 = this.this$0;
                JSONObject jSONObject = new JSONObject();
                ArrayList arrayList7 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((ReleaseConfig.Resource) it3.next()).toJSON());
                }
                JSONObject jSONObjectPut = jSONObject.put(Constants.RESOURCES_DIR_NAME, arrayList7);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
                updateTask2.trackInfo("skipped_resources", jSONObjectPut);
                this.this$0.resourceSaveFuture = UpdateTask.INSTANCE.doAsync(new Callable() { // from class: in.juspay.hypersdk.ota.UpdateTask$ResourceUpdateTask$$ExternalSyntheticLambda2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UpdateTask.ResourceUpdateTask.stopAndInstall$lambda$9(this.f$0);
                    }
                });
            }
            if (arrayList5.isEmpty()) {
                JuspayLogger.d(UpdateTask.TAG, "No new resources to install.");
                return null;
            }
            Iterable iterableRemoteActionCompatParcelizer = this.currentResourceManifest;
            if (iterableRemoteActionCompatParcelizer == null) {
                iterableRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : iterableRemoteActionCompatParcelizer) {
                if (arrayList6.contains((ReleaseConfig.Resource) obj4)) {
                    arrayList8.add(obj4);
                }
            }
            ReleaseConfig.ResourceManifest resourceManifest = this.newResourceManifest;
            ArrayList arrayList9 = new ArrayList();
            for (ReleaseConfig.Resource resource2 : resourceManifest) {
                if (arrayList5.contains(resource2)) {
                    arrayList9.add(resource2);
                }
            }
            JuspayLogger.d(UpdateTask.TAG, "Retaining outdated resources: ".concat(String.valueOf(arrayList8)));
            StringBuilder sb = new StringBuilder("Retaining common resources: ");
            sb.append(this.commonResources);
            JuspayLogger.d(UpdateTask.TAG, sb.toString());
            JuspayLogger.d(UpdateTask.TAG, "Latest resources installed: ".concat(String.valueOf(arrayList9)));
            ReleaseConfig.ResourceManifest resourceManifest2 = new ReleaseConfig.ResourceManifest(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList8, (Iterable) arrayList9), (Iterable) IntermediateLoginResponseBody.onPlay(this.commonResources)));
            writeResourceManifest(resourceManifest2);
            return resourceManifest2;
        }
    }
}
