package com.marrow2.ui.home;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.ui.home.HomeViewModelV2;
import in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda4;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Allocator;
import kotlin.AllocatorAllocationNode;
import kotlin.ApiClientKey;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DownloadService;
import kotlin.HlsSampleStream;
import kotlin.InstallStatusListener;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.OptionalModuleApi;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.ParsableNalUnitBitArray;
import kotlin.PlanDetailsCreator;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.ThemeState;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.VideoTimelineResponseBody;
import kotlin.addConnectionCallbacks;
import kotlin.allocate;
import kotlin.buildRoleString;
import kotlin.clearDefaultAccountAndReconnect;
import kotlin.crc32;
import kotlin.doWrite;
import kotlin.enableAutoManage;
import kotlin.enqueue;
import kotlin.findNalUnit;
import kotlin.fromAdPlaybackState;
import kotlin.getAllClients;
import kotlin.getAnswerMap;
import kotlin.getApiFallbackAttributionTag;
import kotlin.getCodecsCorrespondingToMimeType;
import kotlin.getContextAttributionTag;
import kotlin.getContextFeatureId;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getQues;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getTrackTypeOfCodec;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.hasApi;
import kotlin.interceptEvent;
import kotlin.isConnectionCallbacksRegistered;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;
import kotlin.maybeSignIn;
import kotlin.onConnectionFailed;
import kotlin.registerConnectionFailedListener;
import kotlin.resetForTests;
import kotlin.sampleCountToDurationUs;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setScheme;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unregisterConnectionCallbacks;
import kotlin.updateLoadingFinished;
import kotlin.zap;
import kotlin.zaq;
import kotlin.zzfx;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001Bc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010Y\u001a\u00020ZH\u0002J\u000e\u00107\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\J\b\u0010]\u001a\u00020ZH\u0002J\u0010\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020MH\u0002J\u000e\u0010c\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020ZH\u0002J\u0018\u0010f\u001a\u00020M2\u0006\u0010g\u001a\u00020`2\u0006\u0010h\u001a\u00020`H\u0002J\u000e\u0010i\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\b\u0010j\u001a\u00020ZH\u0002J\u000e\u0010k\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\b\u0010l\u001a\u00020ZH\u0002J\b\u0010m\u001a\u00020ZH\u0002J\u0018\u0010n\u001a\u00020Z2\b\b\u0002\u0010o\u001a\u00020MH\u0082@¢\u0006\u0002\u0010pJ\u000e\u0010q\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u000e\u0010r\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u000e\u0010s\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u000e\u0010t\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u000e\u0010u\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u000e\u0010K\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u0010\u0010v\u001a\u00020Z2\u0006\u0010w\u001a\u00020xH\u0002J\u000e\u0010y\u001a\u00020ZH\u0082@¢\u0006\u0002\u0010dJ\u0010\u0010z\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u0010\u0010}\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u0010\u0010~\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u0019\u0010\u007f\u001a\u00020Z2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0082@¢\u0006\u0003\u0010\u0082\u0001J#\u0010\u0083\u0001\u001a\u00020Z2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0084\u0001\u001a\u00020|H\u0082@¢\u0006\u0003\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020Z2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0082@¢\u0006\u0003\u0010\u0082\u0001J\u001a\u0010\u0087\u0001\u001a\u00020Z2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0082@¢\u0006\u0003\u0010\u0082\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0<¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010 R\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0\u001e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010 R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010 R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u001e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010 R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u001e¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010 R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020M0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020M0\u001e¢\u0006\b\n\u0000\u001a\u0004\bT\u0010 R\u001c\u0010U\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020V\u0018\u00010D0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020V\u0018\u00010D0\u001e¢\u0006\b\n\u0000\u001a\u0004\bX\u0010 ¨\u0006\u0089\u0001"}, d2 = {"Lcom/marrow2/ui/home/HomeViewModelV2;", "Landroidx/lifecycle/ViewModel;", "homeUseCase", "Lcom/marrow2/domain/home/HomeUseCase;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "magicModuleUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleUseCase;", "qBankUseCase", "Lcom/marrow2/domain/qbank/QBankUseCase;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "magicModuleApiUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "notifyVideoWorkerManager", "Lcom/marrow2/ui/home/worker/NotifyVideoWorkerManager;", "syncEventBus", "Lcom/marrow2/core/sync/MainSyncEventBus;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/marrow2/domain/home/HomeUseCase;Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/magic_module/MagicModuleUseCase;Lcom/marrow2/domain/qbank/QBankUseCase;Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/ui/home/worker/NotifyVideoWorkerManager;Lcom/marrow2/core/sync/MainSyncEventBus;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_zenAreaUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/home/model/ZenAreaUiState;", "zenAreaUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getZenAreaUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_pearlInfoData", "Lcom/marrow2/ui/home/model/PearlInfoVMModel;", "pearlInfoData", "getPearlInfoData", "_recentUpdateInfoData", "Lcom/marrow2/ui/home/model/RecentUpdateVMModel;", "recentUpdateInfoData", "getRecentUpdateInfoData", "_qBankSuggestionInfoData", "Lcom/marrow2/ui/home/model/QbankSuggestionVMModel;", "qBankSuggestionInfoData", "getQBankSuggestionInfoData", "_magicModuleSuggestionInfoData", "Lcom/marrow2/ui/home/model/MagicModuleVMModel;", "magicModuleSuggestionInfoData", "getMagicModuleSuggestionInfoData", "_videoSuggestionInfoData", "Lcom/marrow2/ui/home/model/VideoSuggestionVMModel;", "videoSuggestionInfoData", "getVideoSuggestionInfoData", "_notifyEvent", "Lcom/marrow2/ui/home/model/HomeNavEvent;", "notifyEvent", "getNotifyEvent", "_error", "", "error", "Lkotlinx/coroutines/flow/SharedFlow;", "getError", "()Lkotlinx/coroutines/flow/SharedFlow;", "_testSuggestionInfoData", "Lcom/marrow2/ui/home/model/TestSuggestionHomeCardVMModel;", "testSuggestionInfoData", "getTestSuggestionInfoData", "_featureCardInfoData", "", "Lcom/marrow2/ui/home/model/FeatureCardVMModel;", "featureCardInfoData", "getFeatureCardInfoData", "_planUpgradeData", "Lcom/marrow2/ui/home/model/PlanUpgradeHomeCardVMModel;", "planUpgradeData", "getPlanUpgradeData", "_isLoading", "", "isLoading", "_footerCardsVisibility", "footerCardsVisibility", "getFooterCardsVisibility", "_showHomeScreenMagicModuleNudge", "showHomeScreenMagicModuleNudge", "getShowHomeScreenMagicModuleNudge", "_homeConfigList", "Lcom/marrow/data/models/common/CourseConfigV2$HomePageItems;", "homeConfigList", "getHomeConfigList", "observeSyncEvents", "", "event", "Lcom/marrow2/ui/home/model/HomeUIEvent;", "sendNotificationSnackbarClickAnalytics", "setNotificationPermissionDeniedTimestamp", PaymentConstants.TIMESTAMP, "", "sendNotificationPermissionAnalytics", "isGranted", "checkNotificationPermissionEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkForNotificationPermission", "isOldPermissionTimeMoreThanRequiredDays", "oldPermissionDeniedTime", "triggerDays", "getHomeNudgeVisibilityData", "getAllRelevantData", "getFeatureCards", "getQbankModuleData", "getZenAreaData", "getPearlData", "isSyncOn", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentUpdateData", "getSuggestedQBankData", "getMagicModuleData", "getSuggestedVideoData", "getSuggestedTestData", "markAnswer", "mcqOptionModel", "Lcom/marrow2/ui/home/model/McqOptionModel;", "checkForMagicModule", "onSyncUpdate", "type", "", "onSyncComplete", "onSyncFail", "onTaskStarted", "task", "Lcom/marrow2/core/sync/MainSyncIdentifier;", "(Lcom/marrow2/core/sync/MainSyncIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTaskPageCompleted", "page", "(Lcom/marrow2/core/sync/MainSyncIdentifier;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTaskCompleted", "onTaskFailed", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeViewModelV2 extends POJOPropertyBuilderWithMember {
    public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(null);
    private getResolutionSize<List<CourseConfigV2.HomePageItems>> AudioAttributesCompatParcelizer;
    private final getResolutionSize<doWrite> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<clearDefaultAccountAndReconnect> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<getAllClients> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<List<getApiFallbackAttributionTag>> IconCompatParcelizer;
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<hasApi> MediaBrowserCompatItemReceiver;
    private final getResolutionSize<Boolean> MediaBrowserCompatMediaItem;
    private final getResolutionSize<zap> MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<List<getApiFallbackAttributionTag>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getResolutionSize<maybeSignIn> MediaDescriptionCompat;
    private final getResolutionSize<registerConnectionFailedListener> MediaMetadataCompat;
    private final getResolutionSize<isConnectionCallbacksRegistered> RatingCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final isSeekPending handleMediaPlayPauseIfPendingOnHandler;
    private final LogLogLevel onAddQueueItem;
    private final getResolutionSize<addConnectionCallbacks> onCommand;
    private final isDark<String> onCustomAction;
    private final setUpdatedStatus<Boolean> onFastForward;
    private final setUpdatedStatus<Boolean> onMediaButtonEvent;
    private final setUpdatedStatus<List<CourseConfigV2.HomePageItems>> onPause;
    private final getPlatform onPlay;
    private final getCodecsCorrespondingToMimeType onPlayFromMediaId;
    private final setUpdatedStatus<doWrite> onPlayFromSearch;
    private final lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver onPlayFromUri;
    private final setUpdatedStatus<getAllClients> onPrepare;
    private final resetForTests onPrepareFromMediaId;
    private final NetworkTypeObserverApi31DisplayInfoCallback onPrepareFromSearch;
    private final setUpdatedStatus<hasApi> onPrepareFromUri;
    private final OptionalModuleApi onRemoveQueueItem;
    private final setUpdatedStatus<clearDefaultAccountAndReconnect> onRemoveQueueItemAt;
    private final ParsableNalUnitBitArray onRewind;
    private final setUpdatedStatus<maybeSignIn> onSeekTo;
    private final crc32 onSetCaptioningEnabled;
    private final setUpdatedStatus<registerConnectionFailedListener> onSetPlaybackSpeed;
    private final setUpdatedStatus<Boolean> onSetRating;
    private final Allocator onSetRepeatMode;
    private final setUpdatedStatus<isConnectionCallbacksRegistered> onSetShuffleMode;
    private final setUpdatedStatus<zap> onSkipToPrevious;
    private final setUpdatedStatus<addConnectionCallbacks> onSkipToQueueItem;
    private final getResolutionSize<String> read;

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;
        boolean write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.RemoteActionCompatParcelizer(false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.IconCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.read(this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        Object read;
        int write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.write(this);
        }
    }

    public static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        public static int IconCompatParcelizer;
        public static int write;
        int AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.AudioAttributesImplApi21Parcelizer(this);
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = write;
            int i2 = i % 6192702;
            write = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            IconCompatParcelizer = startElapsedRealtime;
            return startElapsedRealtime;
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int write;

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.MediaBrowserCompatCustomActionResultReceiver(this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object read;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.MediaBrowserCompatItemReceiver(this);
        }
    }

    static final class RatingCompat extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.AudioAttributesImplApi26Parcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        long IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class onCommand extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.AudioAttributesImplBaseParcelizer(this);
        }
    }

    static final class onRemoveQueueItem extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        onRemoveQueueItem(SampleVideos<? super onRemoveQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.AudioAttributesCompatParcelizer((AllocatorAllocationNode) null, this);
        }
    }

    static final class onSeekTo extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        onSeekTo(SampleVideos<? super onSeekTo> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.RemoteActionCompatParcelizer((AllocatorAllocationNode) null, this);
        }
    }

    static final class onSetPlaybackSpeed extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        boolean write;

        onSetPlaybackSpeed(SampleVideos<? super onSetPlaybackSpeed> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.RemoteActionCompatParcelizer(null, 0, this);
        }
    }

    static final class onSetShuffleMode extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        onSetShuffleMode(SampleVideos<? super onSetShuffleMode> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeViewModelV2.this.read((AllocatorAllocationNode) null, this);
        }
    }

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getTrackTypeOfCodec.values().length];
            try {
                iArr[getTrackTypeOfCodec.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getTrackTypeOfCodec.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getTrackTypeOfCodec.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getTrackTypeOfCodec.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getTrackTypeOfCodec.AudioAttributesImplApi21Parcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getTrackTypeOfCodec.MediaBrowserCompatItemReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getTrackTypeOfCodec.AudioAttributesImplBaseParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            write = iArr;
            int[] iArr2 = new int[AllocatorAllocationNode.values().length];
            try {
                iArr2[AllocatorAllocationNode.AudioAttributesImplApi21Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AllocatorAllocationNode.MediaDescriptionCompat.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    @setSdkPayload
    public HomeViewModelV2(getCodecsCorrespondingToMimeType getcodecscorrespondingtomimetype, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, ParsableNalUnitBitArray parsableNalUnitBitArray, LogLogLevel logLogLevel, crc32 crc32Var, resetForTests resetfortests, isSeekPending isseekpending, OptionalModuleApi optionalModuleApi, Allocator allocator, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(getcodecscorrespondingtomimetype, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(resetfortests, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(optionalModuleApi, "");
        toMagicModuleMetaRepoModel.write(allocator, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.onPlayFromMediaId = getcodecscorrespondingtomimetype;
        this.onPrepareFromSearch = networkTypeObserverApi31DisplayInfoCallback;
        this.onPlayFromUri = lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver;
        this.onRewind = parsableNalUnitBitArray;
        this.onAddQueueItem = logLogLevel;
        this.onSetCaptioningEnabled = crc32Var;
        this.onPrepareFromMediaId = resetfortests;
        this.handleMediaPlayPauseIfPendingOnHandler = isseekpending;
        this.onRemoveQueueItem = optionalModuleApi;
        this.onSetRepeatMode = allocator;
        this.onPlay = getplatform;
        getResolutionSize<addConnectionCallbacks> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(null);
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer;
        this.onSkipToQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<hasApi> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new hasApi(0, false, false, false, 15, null));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onPrepareFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<isConnectionCallbacksRegistered> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new isConnectionCallbacksRegistered(0L, false, 3, null));
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onSetShuffleMode = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<maybeSignIn> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new maybeSignIn(null, null, null, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 127, null));
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onSeekTo = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<getAllClients> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(new getAllClients(null, 0, false, false, 15, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onPrepare = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<zap> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new zap(null, null, null, null, null, 0, 0, null, null, false, null, 0, false, 8191, null));
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onSkipToPrevious = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<doWrite> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(doWrite.read.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onPlayFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer("");
        this.read = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onCustomAction = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<registerConnectionFailedListener> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(new registerConnectionFailedListener(null, 1, null));
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer9;
        this.onSetPlaybackSpeed = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<List<getApiFallbackAttributionTag>> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer10;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer10);
        getResolutionSize<clearDefaultAccountAndReconnect> getresolutionsizeRemoteActionCompatParcelizer11 = setStartTime.RemoteActionCompatParcelizer(new clearDefaultAccountAndReconnect(false, null, null, 7, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer11;
        this.onRemoveQueueItemAt = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer11);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer12 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer12;
        this.onFastForward = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer12);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer13 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer13;
        this.onMediaButtonEvent = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer13);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer14 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer14;
        this.onSetRating = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer14);
        getResolutionSize<List<CourseConfigV2.HomePageItems>> getresolutionsizeRemoteActionCompatParcelizer15 = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer15;
        this.onPause = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer15);
        getresolutionsizeRemoteActionCompatParcelizer12.write(Boolean.TRUE);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
        isseekpending.write(ApiClientKey.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        onPause();
    }

    public static final class onRemoveQueueItemAt extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private static long AudioAttributesCompatParcelizer;
        private static long AudioAttributesImplApi21Parcelizer;
        private static char[] AudioAttributesImplApi26Parcelizer;
        private static final int AudioAttributesImplBaseParcelizer;
        private static final byte[] MediaBrowserCompatCustomActionResultReceiver;
        private static int MediaBrowserCompatItemReceiver;
        private static char[] RemoteActionCompatParcelizer;
        private static int write;
        private int IconCompatParcelizer;
        private static final byte[] $$c = {73, 111, 30, 98};
        private static final int $$d = 146;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {116, TarConstants.LF_GNUTYPE_SPARSE, -5, 59, -13, -4, 3, -5, -9, 11, -15, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
        private static final int $$b = 31;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r6, short r7, short r8) {
            /*
                byte[] r0 = com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItemAt.$$c
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r7 = r7 * 4
                int r7 = 101 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r6 = r6 + 1
                if (r4 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r3 = r0[r6]
            L28:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItemAt.$$e(int, short, short):java.lang.String");
        }

        private static void c(int i, int i2, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = 10 - s;
            int i4 = i2 + 82;
            byte[] bArr2 = new byte[i + 4];
            int i5 = i + 3;
            int i6 = -1;
            if (bArr == null) {
                i4 += i3;
                i6 = -1;
            }
            while (true) {
                int i7 = i3;
                int i8 = i4;
                int i9 = i6 + 1;
                bArr2[i9] = (byte) i8;
                if (i9 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i10 = i7 + 1;
                i3 = i10;
                i4 = bArr[i10] + i8;
                i6 = i9;
            }
        }

        private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
            DownloadService downloadService = new DownloadService();
            long[] jArr = new long[i2];
            downloadService.write = 0;
            while (downloadService.write < i2) {
                int i3 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer[i + i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 2340 - (ViewConfiguration.getEdgeSlop() >> 16), 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9701, TextUtils.getOffsetAfter("", 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23784, 33 - Color.red(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            downloadService.write = 0;
            while (downloadService.write < i2) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23784 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        private static void d(char c, int i, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            DownloadService downloadService = new DownloadService();
            long[] jArr = new long[i];
            downloadService.write = 0;
            while (downloadService.write < i) {
                int i4 = $10 + 117;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i2 + i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2340, 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 9700 - TextUtils.lastIndexOf("", '0', 0), 26 - TextUtils.indexOf("", ""), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 23784, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i];
            downloadService.write = 0;
            while (downloadService.write < i) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[downloadService.write] = (char) jArr[downloadService.write];
                    Object[] objArr5 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 23784, 33 - TextUtils.getCapsMode("", 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    throw null;
                }
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr6 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 23784 - View.getDefaultSize(0, 0), (-16777183) - Color.rgb(0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = write + 19;
            MediaBrowserCompatItemReceiver = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                getYear.IconCompatParcelizer();
                throw null;
            }
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            Object objRemoteActionCompatParcelizer = HomeViewModelV2.this.onPlayFromMediaId.RemoteActionCompatParcelizer(this);
            if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            int i4 = write + 9;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                return objRemoteActionCompatParcelizer;
            }
            obj2.hashCode();
            throw null;
        }

        onRemoveQueueItemAt(SampleVideos<? super onRemoveQueueItemAt> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int i = 2 % 2;
            onRemoveQueueItemAt onremovequeueitemat = HomeViewModelV2.this.new onRemoveQueueItemAt(sampleVideos);
            int i2 = MediaBrowserCompatItemReceiver + 123;
            write = i2 % 128;
            int i3 = i2 % 2;
            return onremovequeueitemat;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            Object objWrite;
            int i = 2 % 2;
            int i2 = MediaBrowserCompatItemReceiver + 99;
            write = i2 % 128;
            TopUserCompanion topUserCompanion2 = topUserCompanion;
            SampleVideos<? super Integer> sampleVideos2 = sampleVideos;
            if (i2 % 2 != 0) {
                objWrite = write(topUserCompanion2, sampleVideos2);
                int i3 = 98 / 0;
            } else {
                objWrite = write(topUserCompanion2, sampleVideos2);
            }
            int i4 = MediaBrowserCompatItemReceiver + 123;
            write = i4 % 128;
            int i5 = i4 % 2;
            return objWrite;
        }

        private Object write(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatItemReceiver + 39;
            write = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onRemoveQueueItemAt) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            int i4 = MediaBrowserCompatItemReceiver + 65;
            write = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:334:0x11fc A[Catch: all -> 0x125e, TryCatch #24 {all -> 0x125e, blocks: (B:303:0x112e, B:304:0x1132, B:309:0x113c, B:311:0x1143, B:312:0x1144, B:315:0x114a, B:316:0x116f, B:324:0x11e6, B:332:0x11f5, B:334:0x11fc, B:335:0x11fd, B:336:0x11fe, B:337:0x122d, B:338:0x1240), top: B:543:0x112e }] */
        /* JADX WARN: Removed duplicated region for block: B:335:0x11fd A[Catch: all -> 0x125e, TryCatch #24 {all -> 0x125e, blocks: (B:303:0x112e, B:304:0x1132, B:309:0x113c, B:311:0x1143, B:312:0x1144, B:315:0x114a, B:316:0x116f, B:324:0x11e6, B:332:0x11f5, B:334:0x11fc, B:335:0x11fd, B:336:0x11fe, B:337:0x122d, B:338:0x1240), top: B:543:0x112e }] */
        /* JADX WARN: Removed duplicated region for block: B:402:0x146e A[PHI: r14 r22 r23
          0x146e: PHI (r14v21 short) = (r14v17 short), (r14v22 short) binds: [B:417:0x14e4, B:400:0x1468] A[DONT_GENERATE, DONT_INLINE]
          0x146e: PHI (r22v3 int) = (r22v0 int), (r22v4 int) binds: [B:417:0x14e4, B:400:0x1468] A[DONT_GENERATE, DONT_INLINE]
          0x146e: PHI (r23v13 int[]) = (r23v9 int[]), (r23v14 int[]) binds: [B:417:0x14e4, B:400:0x1468] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:436:0x1563  */
        /* JADX WARN: Removed duplicated region for block: B:439:0x156a  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x15bf  */
        /* JADX WARN: Removed duplicated region for block: B:608:0x15d0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void read(android.content.Context r31, long r32, long r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 5752
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItemAt.read(android.content.Context, long, long):void");
        }

        static {
            byte[] bArr = new byte[925];
            System.arraycopy("-`ê¿î\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõüî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôýì\u001bÝ\u0004÷û\u0003ü\u0013âò\u0002î\u0007\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöî\u0005íþ\u0001\u00001µ\nèÿAèÎ\u0005íþ\u0001\u0000\u001cÖ\u0002ê\fùê\nîýì\"ßòûþøî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì-Ôðü\u001eæî\u001dâì\u000eôî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøñò\u000b\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b\u0004æ\u0010.½\u0006î\u00024Õçñþó\u0011úñ\u0002ýì,Ýçý\t\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAèÙûùíû\u0005\u0002ñ\u0002\u0011èó\u0000ýê\tì.Ùûùíû\u0005\u0002ñ\u0002\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAÜãì\u0007ô\u0006öó\u0002ÿ\u0001\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê\nÝ\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê4î\u0005íþ\u0001\u00001º÷@çÈ\u0002\u0005ó\u0002\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAæÏüöúýø\rê\u0000ø\u0004é)Ööú\u000eî\u0006ù\u0006éú&Ö\u0005úè$äýì)àøöö\u0002\u001dÜøý\u0014âò\u0002î\u0007î\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000î\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óô\u0006ìø\tü\rèÿðó\u0006÷\u0003ö\u0004\u0006ýì\u001cëìþþû#Úú\u0000ç\u0004ó+Úô\u0006ãýì\u001cëìþþû%Üê\u001aåê\u0010\u0000÷\u0006÷\u0003\u0013ßøûþñ\u0004æ\u0010.½\u0006î\u00024ÝØü\u0002î\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\u001cåê\u0010ýì\u001cëìþþû%Üê'àøú\u001cÊþ\fè\u0006õüî\u0005íþ\u0001\u00001³\bÿéDÓèÿé\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\nýì$áç\"èð\u0006ÿè\u001bæ÷\u0003ñõü\büî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì\"çä(áç1Ï\u0006úö\u0005úè$äî\u0005íþ\u0001\u00001º÷@ÝØûú\u0006îýì*Üøý\râøúî\u0005íþ\u0001\u00001º÷@áâî\u0005ó\u0002îî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003î\u0005íþ\u0001\u00001´ü\u0006ø9ÕÖ\u0004\u0006ü\tððò\u000bïýøÿ\u0002è\u001fà$Ï\fùê\u0006õü\u0004æ\u0010.½\u0006î\u00024×Ø\u0002û\búñ\u0002".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 925);
            MediaBrowserCompatCustomActionResultReceiver = bArr;
            AudioAttributesImplBaseParcelizer = 8;
            write();
            write = 0;
            MediaBrowserCompatItemReceiver = 1;
            RemoteActionCompatParcelizer = new char[]{14405, 1586, 17558, 33556, 56444, 57876, 41122, 26370, 9686, 58457, 25488, 56424, 57860, 41134, 26412, 9677, 58444, 43760, 26771, 27750, 21004, 4283, 55074, 38298, 21579, 6885, 55425, 40707, 23992, 7224, 49860, 33142, 56392, 57856, 41150, 26410, 9624, 58464, 43755, 26756, 12055, 60848, 44064, 29380, 43733, 38074, 54812, 4536, 21351, 37626, 56402, 7685, 22965, 39688, 55936, 1144, 18396, 56444, 57870, 41125, 26431, 9724, 58440, 43758, 26774, 12061, 60860, 44074};
            AudioAttributesCompatParcelizer = 8766712936907596385L;
        }

        static void write() {
            char[] cArr = new char[1199];
            ByteBuffer.wrap("Ü!Í°ÿ:è\u009a\u009a\u0014\u008bÿµn¦äPHAÔs¼\u001d/\u000e¤8\t)\u0097Û|ÄðöeçÊ\u0091V\u0083<¬±^?O\u0092y\u0018jä\u0014h\u0005ÿ7Y ÙÒ§ü(í\u0080\u009f\u0010\u0088\u0087ºg«õUZFÎpZb<\u0013µ=\u0003.\u009aØ\u001cÉôûhäÃ\u0096Q\u0087À±¶£7L\u009c~\u0011o\u0083\u0019t\nø4D%Ï×BÁ,ò¤\u009c\u001f\u008d\u0093¿a¨ðZdKÇuUg<\u0010±\u0002;3\u0095Ý\u000fÎâøréç\u009bI\u0084×¶¾ (Q½C\u000bl\u008a\u001e}\u000fñ9c*ÞÔXÆ$÷¯á%\u0092\u008c¼\u0004\u00adø_sHÁzPkÁ\u0015§\u0007*0\u009d\"\u000eÓ\u009aýuîè\u0098B\u0089Ò»B¥)V·@\u001eq\u0084c\u001d\fò>w/ÚÙLÊÞôªæ%\u0097\u0090\u0081\u0012²\u0081\\rMù\u007fGhÍ\u001a¼\u0004-5¤'\u0018Ð\u0094Â\u007fóö\u009d{\u008eÉ¸Kª?[¯E\"v\u0090`\u0016\u0011â\u0003n,ãÞJÏÉù¾ë1\u0094¿\u0086\u0015·\u0087¡eRì|dmÌ\u001fX\t8:«$\u0000Õ\u0093Ç\u000eðçâj\u0093Ô½N®ÚX¶J,{\u0082e\u0010\u0016\u0080\u0000i1÷#]ÌÊþ]è7\u0099¨\u008b\u0004´\u008e¦\u0003WëAgrÛ\u001cR\rÁ?²)9Ú\u0099Ä\fõàçr\u0090â\u0082G³Õ]¼O4x»j\u0016\u001b\u008b\u0005b6î bÑÒÃVí<\u009eª\u0088=¹\u0095«\fTäFnwêaK\u0012Ù<»./ß¿É\rú\u0087är\u0095ó\u0087_°Ø¢ZL&}ªo\u0014\u0018\u008e\n\u0004;ò%uÖÚÀSñÜã·\u008d,¾\u0083¨\u0011Y\u0083Krt÷fZ\u0017Ä\u0001^3*Ü§Î\u0019ÿ\u0092é\u0007\u009aì\u0084gµØ§SQ!B²l'\u001d\u0087\u000f\u000b8ù*nÛãÅHöÈà½\u0092/\u0083½\u00ad\u0016^\u0088Hcyïke\u0014Ê\u0006V09!\u00adÓ>ü\u0093î\u0018\u009fø\u0089mºÿ¤MUÄG»q3b\u0098\f\u0010=\u009a/fØéÊ_ûÎåF\u00975\u0080µ²\u0003£\u0090M\u0003~éhw\u0019Ü\u000bH4Ý&²Ð)Á\u0084ó\t\u009c\u0081\u008ek¿à©]ZÒDBv3g¹\u0011\u0007\u0002\u008c,yÝíÏbøÞêT\u00949\u0085´·; \u0089R\nCømo\u001eã\bS9Ö+»Õ,Æ½ð\u0012á\u008c\u0093d¼ð®`_ÓIX{=d¦\u0016?\u0007\u00921\u0001\"æÌrýÞïT\u0098Ú\u008a¿´!¥\u0081W\u0017@\u0087rhcè\r_>Ï(]Ú6Ë\u00adõ\u0003æ\u0089\u0090\u0003\u0081ê³j\\ÛNQ\u007fÁi´\u001b8\u0004\u009a6\n'\u009fÑsÂçìF\u009dÊ\u008f¿¹-ª¥T\u001fE\u0094w``ñ\u0012o\u0003È-Tß=Èºú<ë\u0097\u0095\u000e\u0086ã°q¡âSV|×n½\u0018)\t¾;\n$\u0087ÖxÇòñ`âÔ\u008cY¾>¯³Y\u001dJ\u0092t\u001aeæ\u0017l\u0000Ý2N#ÂÍ±ÿ5è\u0083\u009a\u0012\u008b\u0086µi¦éP[AÐs\\\u001d7\u000e«8\u0004)\u008fÛ\u0002ÄëöyçØ\u0091O\u0082ß¬µ^#O\u0086y\u0012jý\u0014s\u0005ú7Z ÉÒ¡ü0í¥\u009f\b\u0088\u0094ºz«òU|FÑpNb#\u0013¨=$.\u008aØ\u0016Éüûoäþ\u0096S\u0087Æ±¥£+L¤~\fo\u0080\u0019r\nó4Y%Ø×ZÁ&ò¬\u009c\u001e\u008d\u008e¿\u0005¨òZuKÃuQfÄ\u0010©\u000273\u009bÝ\bÎ\u009døkéï\u009b]\u0084Ñ¶@ 0Q¸C\u001bl\u0088\u001e\u001f\u000fô9a*ÆÔIÆ<÷\u00adá;\u0092\u009f¼\u000e\u00adá_vHåzHkÌ\u0015¹\u0007/0¤\"\u0012Ó\u0096ýyîí\u0098}\u0089Ë»O¥?V±@ q\u0091c\u0018\fä>l/çÙLÊÇô³æ3\u0097\u0081\u0081\u0013²\u0083\\gMë\u007f_hÎ\u001aA\u000465µ'\u0018Ð\u0090Â\u001cóó\u009dn\u008eÃ¸O©Å[ªE6v\u009c`\u0005\u0011\u009e\u0003j,àÞPÏÒùAë9\u0094¹\u0086\u0007·\u008c¡|Rí|cmß\u001fT\t :±$&Õ\u0088Ç\u000fðûâo\u0093á½V®ÖX¢J/{ e\n\u0016\u0088\u0000|1ñ#\u007fÌÖþDè%\u0099¬\u008b#´\u008c¦\u0018WûAnrÀ\u001cW\rÀ?§))Ú\u009fÄ\u000eõ\u0081çr\u0090õ\u0082C³Ò]BO)x«j\u001e\u001b\u0090\u0005\u00006ñ wÑÞÃJìÞ\u009eª\u0088'¹\u009f«\u0012T\u0080Fvwùa\\\u0012Ç< .7ß¯É\u0007ú\u0095äx\u0095ò\u0087{°Ð¢KL\"}´o \u0018\u0089\n\u0017;ý%mÖýÀKñÉã¹\u008d1¾§¨\u001eY\u0098Kdtëfb\u0017Ì\u0001G3<Ü³Î\u0001ÿ\u0093é\u0002\u009aç\u0084jµÔ§NPÚB¶l,\u001d\u0082\u000f\u00148\u0081*iÛíÅ]öÐàF\u00925\u0083·\u00ad\u0005^\u008fH\u0004yëka\u0014Ú\u0006R7À!´Ó9ü\u0087î\u0007\u009fà\u0089lºã¤YUÔG¿q;b»\f\t=\u008a/~ØïÊdûÉåH\u0097=\u0080°²<£\u0095M\t~ähn\u0019æ\u000bK4À&¥Ð/Á ó\f\u009c\u0098\u008ey¿î©@ZÒDBv'gµ\u0011\u001c\u0002\u0092,\u001bÝðÏuøßêP\u009bÜ\u0085¨·+ \u009eR\u0010C\u0085mw\u001e÷\bE9Ì+@Õ+Æ¥ð\u0018á\u0092\u0093\u001e¼õ®f_ÆIH{8d\u00ad\u0016;\u0007\u009e1\f\"áÌuýâïH\u0098Î\u008a¸´/¥½W\u0016@\u008erccè\rc>Ê(OÚ;Ë±õ%æ\u0090\u0090\u0018\u0081û³l\\ÿNM\u007fÇi½\u001b3\u0004\u009b6\u0019'\u009aÑfÂêìY\u009dÎ\u008fF¹6ªµT\u0003E\u0092w\u0000`é\u0012h\u0003ß-PÞÜÈ·ú*ë\u0084\u0095\f\u0086\u0080°k¡åS[|Òn^\u00181\t§;\u0006$\u008eÖ\u007fÇíñ{âÙ\u008cM¾!¯µY.J\u0088t\neý\u0017o\u0000ã2Q#ÖÍ¢ÿ)è¤\u009a\n\u008b\u008aµ{¦ñP\u007fAÔsD\u001d%\u000e«8')\u008cÛ\u0018ÄÿölçÀ\u0091R\u0082Â¬§^5O\u009cy\u0015j\u009b\u0014p\u0005õ7_ ÐÒ\\ü(í«\u009f\u001e\u0088\u0090º\u0007«ðUwFÅpLaÊ\u0013«=9.\u009cØ\bÉ\u009fûqäç\u0096F\u0087Ò±½£6Lº~\u0019o\u0088\u0019a\nï4f%Õ×UÁ?ò±\u009c<\u008d\u0088¿\u000b¨÷ZpKüuSfÌ\u0010¤\u0002/3«Ý\u000bÎ\u0099ø{éë\u009b\u007f\u0084Ø¶E &Q²C\u001fl\u0096\u001e\u001a\u000fý9n*ÁÔQÅÅ÷¨á(\u0092\u009d¼\u000f\u00ad\u0083_tHözXkÍ\u0015]\u000700\u00ad\"\u0004Ó\u0088ý\u0001îë\u0098g\u0089Ý»R¤ÞVµ@ q\u0086c\u0007\fý>m/ûÙ^ÊÀô¡æ1\u0097¡\u0081\b²\u0081\\|Mï\u007fhhÖ\u001aV\u000475¨'=Ð\u008bÂ\u000eóñ\u009dq\u008eê¸P©Ø[±E&v¿`\u0014\u0011\u0082\u0003f,çÞUÏÍùDë9\u0094´\u0086\u0000·\u0096¡\u0006Rè|mmÙ\u001fO\bÝ:·$.Õ\u0083Ç\u000eð\u0088âj\u0093ö½[®ÍX^J2{ e\u0005\u0016\u0093\u0000\u00051ð#yÌÙþKè \u0099³\u008b&´\u0087¦\u0015WùArrû\u001cW\rÍ?¢).Ú¡Ä\u0015õ\u0096ç}\u0090ì\u0082}³Ë]JO9x±j+\u001b\u0097\u0005\u00186ø oÑÿÃMìÄ\u009e¸\u00883¹\u0081«\u0017T\u0087Fgwéa\\\u0012Î<Z.2ß«É\u0002ú\u009aä\u0001\u0095é\u0087k°Þ¢PSÜ}°o(\u0018\u0084\n\u0004;\u0080%kÖùÀ_ñÊã_\u008d-¾£¨\u001fY\u0093Kutòfz\u0017Ò\u0001L3!Ü»Î\"ÿ\u0088é\u0000\u009aø\u0084oµý§SPÌB£l.\u001d¨\u000f\n8\u0082*~ÛñÅ\u007föÑàC\u0092%\u0083³\u00ad%^\u0098H\u0019yçki\u0014Õ\u0006M7Û!½Ó!ü\u0081î\u000f\u009f\u0080\u0089tºõ¤WUÛG\\q<b¯\f\u0003=\u0085/\u0007ØêÊvûßåL\u0096Þ\u0080¾²-£\u0085M\u0013~\u0084hr\u0019ù\u000bG4È&¿Ð-Á»ó\u001c\u009c\u008c\u008ea¿ï©`ZÈD@v<g¯\u0011!\u0002\u0095,\u000bÝãÏmøáêT\u009b×\u0085¹·, ¾R\nC\u0082m}\u001eò\b~9×+@Õ&Æ®ð\u001cá\u0095\u0093\u001a¼æ®o_ÛINzÆd´\u0016,\u0007\u00821\u000e\"\u0087ÌsÜ ".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1199);
            AudioAttributesImplApi26Parcelizer = cArr;
            AudioAttributesImplApi21Parcelizer = 945382972371553665L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver
                int r8 = r8 + 84
                int r1 = r7 + 3
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r7 = r7 + 2
                r2 = 0
                if (r0 != 0) goto L13
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L21:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-5)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItemAt.a(int, int, byte, java.lang.Object[]):void");
        }
    }

    public final setUpdatedStatus<addConnectionCallbacks> MediaDescriptionCompat() {
        return this.onSkipToQueueItem;
    }

    public final setUpdatedStatus<hasApi> AudioAttributesImplApi21Parcelizer() {
        return this.onPrepareFromUri;
    }

    public final setUpdatedStatus<isConnectionCallbacksRegistered> MediaMetadataCompat() {
        return this.onSetShuffleMode;
    }

    public final setUpdatedStatus<maybeSignIn> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onSeekTo;
    }

    public final setUpdatedStatus<getAllClients> MediaBrowserCompatItemReceiver() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<zap> MediaBrowserCompatMediaItem() {
        return this.onSkipToPrevious;
    }

    public final setUpdatedStatus<doWrite> AudioAttributesImplBaseParcelizer() {
        return this.onPlayFromSearch;
    }

    public final setUpdatedStatus<registerConnectionFailedListener> MediaBrowserCompatSearchResultReceiver() {
        return this.onSetPlaybackSpeed;
    }

    public final setUpdatedStatus<List<getApiFallbackAttributionTag>> IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<clearDefaultAccountAndReconnect> AudioAttributesImplApi26Parcelizer() {
        return this.onRemoveQueueItemAt;
    }

    public final setUpdatedStatus<Boolean> onAddQueueItem() {
        return this.onFastForward;
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<Boolean> RatingCompat() {
        return this.onSetRating;
    }

    public final setUpdatedStatus<List<CourseConfigV2.HomePageItems>> AudioAttributesCompatParcelizer() {
        return this.onPause;
    }

    static final class onPrepareFromMediaId extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {HomeViewModelV2.this.onSetRepeatMode};
                isDark isdark = (isDark) Allocator.IconCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 1850090459, setScheme.IconCompatParcelizer(), -1850090458, objArr, setScheme.IconCompatParcelizer());
                final HomeViewModelV2 homeViewModelV2 = HomeViewModelV2.this;
                this.read = 1;
                if (isdark.write(new getValidationToken() { // from class: com.marrow2.ui.home.HomeViewModelV2.onPrepareFromMediaId.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public Object IconCompatParcelizer(allocate allocateVar, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (allocateVar instanceof allocate.MediaBrowserCompatCustomActionResultReceiver) {
                            Object obj2 = homeViewModelV2.read((AllocatorAllocationNode) allocate.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), AuthApiStatusCodes.RemoteActionCompatParcelizer(), AuthApiStatusCodes.RemoteActionCompatParcelizer(), new Object[]{(allocate.MediaBrowserCompatCustomActionResultReceiver) allocateVar}, -766262347, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 766262348), sampleVideos);
                            return obj2 == getYear.IconCompatParcelizer() ? obj2 : getShowPopup.INSTANCE;
                        }
                        if (allocateVar instanceof allocate.AudioAttributesCompatParcelizer) {
                            HomeViewModelV2 homeViewModelV22 = homeViewModelV2;
                            allocate.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (allocate.AudioAttributesCompatParcelizer) allocateVar;
                            int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            AllocatorAllocationNode allocatorAllocationNode = (AllocatorAllocationNode) allocate.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), new Object[]{audioAttributesCompatParcelizer}, -2121217977, 2121217980, iRemoteActionCompatParcelizer2);
                            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer4 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            Object objRemoteActionCompatParcelizer = homeViewModelV22.RemoteActionCompatParcelizer(allocatorAllocationNode, ((Integer) allocate.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer3, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), new Object[]{audioAttributesCompatParcelizer}, -1426211750, 1426211752, iRemoteActionCompatParcelizer4)).intValue(), sampleVideos);
                            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
                        }
                        if (allocateVar instanceof allocate.RemoteActionCompatParcelizer) {
                            Object objRemoteActionCompatParcelizer2 = homeViewModelV2.RemoteActionCompatParcelizer((AllocatorAllocationNode) allocate.RemoteActionCompatParcelizer.read(HlsSampleStream.write(), -92781229, HlsSampleStream.write(), 92781232, HlsSampleStream.write(), HlsSampleStream.write(), new Object[]{(allocate.RemoteActionCompatParcelizer) allocateVar}), sampleVideos);
                            return objRemoteActionCompatParcelizer2 == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer2 : getShowPopup.INSTANCE;
                        }
                        if (allocateVar instanceof allocate.write) {
                            HomeViewModelV2 homeViewModelV23 = homeViewModelV2;
                            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
                            Object objAudioAttributesCompatParcelizer = homeViewModelV23.AudioAttributesCompatParcelizer((AllocatorAllocationNode) allocate.write.RemoteActionCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 918403904, iIconCompatParcelizer, new Object[]{(allocate.write) allocateVar}, setScheme.IconCompatParcelizer(), -918403904), sampleVideos);
                            return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        onPrepareFromMediaId(SampleVideos<? super onPrepareFromMediaId> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPrepareFromMediaId(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromMediaId) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPause() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepareFromMediaId(null), new MagicModuleSubmissionRequestBody() { // from class: o.isGooglePlayServicesUid
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(getContextFeatureId getcontextfeatureid) {
        doWrite.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler;
        doWrite.onFastForward handlemediaplaypauseifpendingonhandler2;
        toMagicModuleMetaRepoModel.write(getcontextfeatureid, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.IconCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.read.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onPrepare.INSTANCE)) {
            isSeekPending isseekpending = this.handleMediaPlayPauseIfPendingOnHandler;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            isseekpending.write(InstallStatusListener.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.MediaBrowserCompatItemReceiver.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onSetShuffleMode.INSTANCE)) {
            getResolutionSize<doWrite> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            String lowerCase = "ZEN_AREA_GO_PRO_BUTTON".toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            getresolutionsize.write(new doWrite.MediaBrowserCompatCustomActionResultReceiver("GoProButton_Homepage", lowerCase));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onPlayFromUri.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write("recent_updates_click", VideoTimelineResponseBody.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending2 = this.handleMediaPlayPauseIfPendingOnHandler;
            zzfx zzfxVar = zzfx.INSTANCE;
            isseekpending2.write(zzfx.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.MediaMetadataCompat.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onSeekTo.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.MediaBrowserCompatMediaItem.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onRemoveQueueItem.INSTANCE)) {
            isSeekPending isseekpending3 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
            isseekpending3.write(ApiClientKey.IconCompatParcelizer("qbank", this.MediaDescriptionCompat.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer(), this.MediaDescriptionCompat.IconCompatParcelizer().getRemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.MediaDescriptionCompat(this.MediaDescriptionCompat.IconCompatParcelizer().getRemoteActionCompatParcelizer(), this.MediaDescriptionCompat.IconCompatParcelizer().getIconCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onSetRepeatMode.INSTANCE)) {
            isSeekPending isseekpending4 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey2 = ApiClientKey.INSTANCE;
            isseekpending4.write(ApiClientKey.IconCompatParcelizer("video", this.MediaDescriptionCompat.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer(), this.MediaDescriptionCompat.IconCompatParcelizer().getRemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending5 = this.handleMediaPlayPauseIfPendingOnHandler;
            StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut = StandardIntegrityVerdictOptOut.INSTANCE;
            String read2 = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getRead();
            String audioAttributesImplBaseParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer();
            String audioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getAudioAttributesCompatParcelizer();
            isseekpending5.write(StandardIntegrityVerdictOptOut.IconCompatParcelizer(read2, audioAttributesImplBaseParcelizer, this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), audioAttributesCompatParcelizer == null ? "" : audioAttributesCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getWrite(), StandardIntegrityVerdictOptOut.read.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            getResolutionSize<doWrite> getresolutionsize2 = this.AudioAttributesImplApi21Parcelizer;
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver()) {
                handlemediaplaypauseifpendingonhandler2 = new doWrite.handleMediaPlayPauseIfPendingOnHandler(this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getRead());
            } else {
                handlemediaplaypauseifpendingonhandler2 = doWrite.onFastForward.INSTANCE;
            }
            getresolutionsize2.write(handlemediaplaypauseifpendingonhandler2);
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onCustomAction) {
            isSeekPending isseekpending6 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey3 = ApiClientKey.INSTANCE;
            getContextFeatureId.onCustomAction oncustomaction = (getContextFeatureId.onCustomAction) getcontextfeatureid;
            isseekpending6.write(ApiClientKey.read(oncustomaction.write(), oncustomaction.RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.write(oncustomaction.write(), oncustomaction.RemoteActionCompatParcelizer()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.handleMediaPlayPauseIfPendingOnHandler) {
            isSeekPending isseekpending7 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey4 = ApiClientKey.INSTANCE;
            getContextFeatureId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler3 = (getContextFeatureId.handleMediaPlayPauseIfPendingOnHandler) getcontextfeatureid;
            isseekpending7.write(ApiClientKey.read(handlemediaplaypauseifpendingonhandler3.RemoteActionCompatParcelizer(), handlemediaplaypauseifpendingonhandler3.IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.AudioAttributesImplBaseParcelizer(handlemediaplaypauseifpendingonhandler3.RemoteActionCompatParcelizer(), handlemediaplaypauseifpendingonhandler3.read()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onPlay) {
            isSeekPending isseekpending8 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey5 = ApiClientKey.INSTANCE;
            getContextFeatureId.onPlay onplay = (getContextFeatureId.onPlay) getcontextfeatureid;
            isseekpending8.write(ApiClientKey.AudioAttributesCompatParcelizer(onplay.read(), CourseConfigKeyConstantsKt.KEY_FEATURED_CARD), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending9 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey6 = ApiClientKey.INSTANCE;
            isseekpending9.write(ApiClientKey.read(onplay.read(), onplay.AudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.onCustomAction(onplay.read()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onAddQueueItem) {
            isSeekPending isseekpending10 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey7 = ApiClientKey.INSTANCE;
            getContextFeatureId.onAddQueueItem onaddqueueitem = (getContextFeatureId.onAddQueueItem) getcontextfeatureid;
            isseekpending10.write(ApiClientKey.AudioAttributesCompatParcelizer(onaddqueueitem.write(), CourseConfigKeyConstantsKt.KEY_FEATURED_CARD), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending11 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey8 = ApiClientKey.INSTANCE;
            isseekpending11.write(ApiClientKey.read(onaddqueueitem.write(), onaddqueueitem.RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.AudioAttributesImplApi21Parcelizer(onaddqueueitem.write()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onPause) {
            isSeekPending isseekpending12 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey9 = ApiClientKey.INSTANCE;
            getContextFeatureId.onPause onpause = (getContextFeatureId.onPause) getcontextfeatureid;
            isseekpending12.write(ApiClientKey.AudioAttributesCompatParcelizer(onpause.write(), CourseConfigKeyConstantsKt.KEY_FEATURED_CARD), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending13 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey10 = ApiClientKey.INSTANCE;
            isseekpending13.write(ApiClientKey.read(onpause.write(), onpause.AudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            getResolutionSize<doWrite> getresolutionsize3 = this.AudioAttributesImplApi21Parcelizer;
            if (onpause.IconCompatParcelizer()) {
                handlemediaplaypauseifpendingonhandler = doWrite.onFastForward.INSTANCE;
            } else {
                handlemediaplaypauseifpendingonhandler = new doWrite.handleMediaPlayPauseIfPendingOnHandler(onpause.write());
            }
            getresolutionsize3.write(handlemediaplaypauseifpendingonhandler);
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onMediaButtonEvent) {
            isSeekPending isseekpending14 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey11 = ApiClientKey.INSTANCE;
            getContextFeatureId.onMediaButtonEvent onmediabuttonevent = (getContextFeatureId.onMediaButtonEvent) getcontextfeatureid;
            isseekpending14.write(ApiClientKey.read(onmediabuttonevent.RemoteActionCompatParcelizer(), onmediabuttonevent.AudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.MediaDescriptionCompat(onmediabuttonevent.RemoteActionCompatParcelizer(), onmediabuttonevent.write()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onPlayFromMediaId) {
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.RatingCompat(((getContextFeatureId.onPlayFromMediaId) getcontextfeatureid).RemoteActionCompatParcelizer()));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            isSeekPending isseekpending15 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey12 = ApiClientKey.INSTANCE;
            getContextFeatureId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (getContextFeatureId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) getcontextfeatureid;
            isseekpending15.write(ApiClientKey.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(), "explanation"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending16 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey13 = ApiClientKey.INSTANCE;
            isseekpending16.write(ApiClientKey.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending17 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey14 = ApiClientKey.INSTANCE;
            isseekpending17.write(ApiClientKey.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new doWrite.AudioAttributesCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.MediaBrowserCompatItemReceiver.INSTANCE)) {
            handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCustomAction(null), new MagicModuleSubmissionRequestBody() { // from class: o.isGooglePublicSignedPackage
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.MediaBrowserCompatCustomActionResultReceiver(this.write, (String) obj2);
                }
            });
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onFastForward) {
            isSeekPending isseekpending18 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey15 = ApiClientKey.INSTANCE;
            getContextFeatureId.onFastForward onfastforward = (getContextFeatureId.onFastForward) getcontextfeatureid;
            isseekpending18.write(ApiClientKey.AudioAttributesCompatParcelizer(onfastforward.IconCompatParcelizer().AudioAttributesCompatParcelizer(), "answer"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending19 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey16 = ApiClientKey.INSTANCE;
            isseekpending19.write(ApiClientKey.AudioAttributesCompatParcelizer(onfastforward.IconCompatParcelizer().read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending20 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey17 = ApiClientKey.INSTANCE;
            isseekpending20.write(ApiClientKey.IconCompatParcelizer(onfastforward.IconCompatParcelizer().read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            RemoteActionCompatParcelizer(onfastforward.IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onRewind.INSTANCE)) {
            isSeekPending isseekpending21 = this.handleMediaPlayPauseIfPendingOnHandler;
            onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
            isseekpending21.write(onConnectionFailed.read(CourseConfigKeyConstantsKt.KEY_HOME), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.AudioAttributesImplApi26Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onPrepareFromSearch.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.onAddQueueItem.INSTANCE);
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.MediaBrowserCompatSearchResultReceiver) {
            RemoteActionCompatParcelizer(((getContextFeatureId.MediaBrowserCompatSearchResultReceiver) getcontextfeatureid).write());
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.MediaMetadataCompat) {
            IconCompatParcelizer(((getContextFeatureId.MediaMetadataCompat) getcontextfeatureid).IconCompatParcelizer());
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onCommand) {
            write(((getContextFeatureId.onCommand) getcontextfeatureid).write());
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onRemoveQueueItemAt) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPause(getcontextfeatureid, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.GooglePlayServicesUtil
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.MediaMetadataCompat(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onPlayFromSearch) {
            String str = buildRoleString.AudioAttributesCompatParcelizer;
            getContextFeatureId.onPlayFromSearch onplayfromsearch = (getContextFeatureId.onPlayFromSearch) getcontextfeatureid;
            String strRemoteActionCompatParcelizer = onplayfromsearch.RemoteActionCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(strRemoteActionCompatParcelizer);
            this.onRemoveQueueItem.RemoteActionCompatParcelizer(onplayfromsearch.write(), sb.toString(), "", getQues.write(onplayfromsearch.AudioAttributesCompatParcelizer() - System.currentTimeMillis(), 0L));
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onPrepareFromUri) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromMediaId(getcontextfeatureid, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.getRemoteContext
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.RatingCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.write.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlay(null), new MagicModuleSubmissionRequestBody() { // from class: o.getErrorPendingIntent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.MediaDescriptionCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepare(null), new MagicModuleSubmissionRequestBody() { // from class: o.ensurePlayServicesAvailable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.onAddQueueItem((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.RemoteActionCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new handleMediaPlayPauseIfPendingOnHandler(null), new MagicModuleSubmissionRequestBody() { // from class: o.GooglePlayServicesUtilLight
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.onCustomAction((String) obj2);
                }
            });
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.MediaBrowserCompatMediaItem) {
            getContextFeatureId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (getContextFeatureId.MediaBrowserCompatMediaItem) getcontextfeatureid;
            AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem.IconCompatParcelizer());
            RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem.IconCompatParcelizer() ? 0L : System.currentTimeMillis());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.RatingCompat.INSTANCE)) {
            onFastForward();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.read.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onMediaButtonEvent(null), new MagicModuleSubmissionRequestBody() { // from class: o.enableUsingApkIndependentContext
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.onPrepareFromMediaId.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.MediaBrowserCompatSearchResultReceiver.INSTANCE);
            isSeekPending isseekpending22 = this.handleMediaPlayPauseIfPendingOnHandler;
            ApiClientKey apiClientKey18 = ApiClientKey.INSTANCE;
            isseekpending22.write(ApiClientKey.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(doWrite.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (getcontextfeatureid instanceof getContextFeatureId.onSetCaptioningEnabled) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onFastForward(getcontextfeatureid, null), new MagicModuleSubmissionRequestBody() { // from class: o.getGooglePlayServicesAvailabilityRecoveryIntent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeViewModelV2.onCommand((String) obj2);
                }
            });
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcontextfeatureid, getContextFeatureId.MediaDescriptionCompat.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<doWrite> getresolutionsize4 = this.AudioAttributesImplApi21Parcelizer;
            String lowerCase2 = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            getresolutionsize4.write(new doWrite.MediaBrowserCompatCustomActionResultReceiver("Pro Subscription Dialog", lowerCase2));
        }
    }

    static final class onCustomAction extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$onCustomAction$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            private /* synthetic */ HomeViewModelV2 MediaBrowserCompatCustomActionResultReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$onCustomAction$2$write */
            static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 read;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read.onCommand();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                write(HomeViewModelV2 homeViewModelV2, SampleVideos<? super write> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new write(this.read, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
            
                if (r0.AudioAttributesCompatParcelizer(r11) == r1) goto L40;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 299
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onCustomAction.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$onCustomAction$2$IconCompatParcelizer */
            static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 read;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read.handleMediaPlayPauseIfPendingOnHandler();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IconCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.read = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new IconCompatParcelizer(this.read, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$onCustomAction$2$AudioAttributesCompatParcelizer */
            static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private int IconCompatParcelizer;
                private /* synthetic */ HomeViewModelV2 RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.IconCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.IconCompatParcelizer = 1;
                        if (this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AudioAttributesCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$onCustomAction$2$RemoteActionCompatParcelizer */
            static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private int IconCompatParcelizer;
                private /* synthetic */ HomeViewModelV2 write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.IconCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.IconCompatParcelizer = 1;
                        if (this.write.AudioAttributesImplBaseParcelizer(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                RemoteActionCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.write = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new RemoteActionCompatParcelizer(this.write, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomeViewModelV2 homeViewModelV2, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.MediaBrowserCompatCustomActionResultReceiver = homeViewModelV2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.MediaBrowserCompatCustomActionResultReceiver, sampleVideos);
                anonymousClass2.IconCompatParcelizer = obj;
                return anonymousClass2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(HomeViewModelV2.this.onPlay, new AnonymousClass2(HomeViewModelV2.this, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onCustomAction(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPause extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ HomeViewModelV2 AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ getContextFeatureId read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            unregisterConnectionCallbacks unregisterconnectioncallbacksIconCompatParcelizer;
            HomeViewModelV2 homeViewModelV2;
            interceptEvent interceptevent;
            int i;
            Pair<String, Map<String, Object>> pairRemoteActionCompatParcelizer;
            interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            interceptEvent interceptevent2;
            unregisterConnectionCallbacks unregisterconnectioncallbacks;
            int i2;
            String str;
            HomeViewModelV2 homeViewModelV22;
            getYear.IconCompatParcelizer();
            int i3 = this.MediaBrowserCompatItemReceiver;
            if (i3 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                unregisterconnectioncallbacksIconCompatParcelizer = ((getContextFeatureId.onRemoveQueueItemAt) this.read).IconCompatParcelizer();
                homeViewModelV2 = this.AudioAttributesImplBaseParcelizer;
                getContextFeatureId getcontextfeatureid = this.read;
                isSeekPending isseekpending = homeViewModelV2.handleMediaPlayPauseIfPendingOnHandler;
                ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
                isseekpending.write(ApiClientKey.write("test", unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                if (((getContextFeatureId.onRemoveQueueItemAt) getcontextfeatureid).AudioAttributesCompatParcelizer()) {
                    ApiClientKey apiClientKey2 = ApiClientKey.INSTANCE;
                    pairRemoteActionCompatParcelizer = ApiClientKey.read(unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer(), unregisterconnectioncallbacksIconCompatParcelizer.getOnMediaButtonEvent().getWrite());
                    homeViewModelV2.handleMediaPlayPauseIfPendingOnHandler.write(pairRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    homeViewModelV2.AudioAttributesImplApi21Parcelizer.write(new doWrite.RatingCompat(unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer()));
                    return getShowPopup.INSTANCE;
                }
                interceptEvent interceptevent3 = interceptEvent.INSTANCE;
                crc32 crc32Var = homeViewModelV2.onSetCaptioningEnabled;
                int onFastForward = unregisterconnectioncallbacksIconCompatParcelizer.getOnFastForward();
                int onAddQueueItem = unregisterconnectioncallbacksIconCompatParcelizer.getOnAddQueueItem();
                this.write = homeViewModelV2;
                this.RemoteActionCompatParcelizer = unregisterconnectioncallbacksIconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = interceptevent3;
                this.IconCompatParcelizer = 0;
                this.MediaBrowserCompatItemReceiver = 1;
                interceptevent = interceptevent3;
                obj = crc32Var.RemoteActionCompatParcelizer(onFastForward, onAddQueueItem);
                i = 0;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = this.AudioAttributesCompatParcelizer;
                        str = (String) this.MediaBrowserCompatCustomActionResultReceiver;
                        remoteActionCompatParcelizer = (interceptEvent.RemoteActionCompatParcelizer) this.AudioAttributesImplApi26Parcelizer;
                        unregisterconnectioncallbacks = (unregisterConnectionCallbacks) this.RemoteActionCompatParcelizer;
                        homeViewModelV22 = (HomeViewModelV2) this.write;
                        SdkPayloadData.IconCompatParcelizer(obj);
                        homeViewModelV2 = homeViewModelV22;
                        pairRemoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, i2, str, (String) obj, "suggested_home");
                        unregisterconnectioncallbacksIconCompatParcelizer = unregisterconnectioncallbacks;
                        homeViewModelV2.handleMediaPlayPauseIfPendingOnHandler.write(pairRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                        homeViewModelV2.AudioAttributesImplApi21Parcelizer.write(new doWrite.RatingCompat(unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer()));
                        return getShowPopup.INSTANCE;
                    }
                    i = this.IconCompatParcelizer;
                    remoteActionCompatParcelizer = (interceptEvent.RemoteActionCompatParcelizer) this.AudioAttributesImplApi26Parcelizer;
                    interceptEvent interceptevent4 = (interceptEvent) this.AudioAttributesImplApi21Parcelizer;
                    unregisterConnectionCallbacks unregisterconnectioncallbacks2 = (unregisterConnectionCallbacks) this.RemoteActionCompatParcelizer;
                    homeViewModelV2 = (HomeViewModelV2) this.write;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    interceptevent2 = interceptevent4;
                    unregisterconnectioncallbacks = unregisterconnectioncallbacks2;
                    int iIntValue = ((Number) obj).intValue();
                    String audioAttributesCompatParcelizer = unregisterconnectioncallbacks.getAudioAttributesCompatParcelizer();
                    crc32 crc32Var2 = homeViewModelV2.onSetCaptioningEnabled;
                    getContextAttributionTag mediaBrowserCompatCustomActionResultReceiver = unregisterconnectioncallbacks.getMediaBrowserCompatCustomActionResultReceiver();
                    this.write = homeViewModelV2;
                    this.RemoteActionCompatParcelizer = unregisterconnectioncallbacks;
                    this.AudioAttributesImplApi21Parcelizer = interceptevent2;
                    this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
                    this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
                    this.IconCompatParcelizer = i;
                    this.AudioAttributesCompatParcelizer = iIntValue;
                    this.MediaBrowserCompatItemReceiver = 3;
                    i2 = iIntValue;
                    str = audioAttributesCompatParcelizer;
                    obj = crc32Var2.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
                    homeViewModelV22 = homeViewModelV2;
                    homeViewModelV2 = homeViewModelV22;
                    pairRemoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, i2, str, (String) obj, "suggested_home");
                    unregisterconnectioncallbacksIconCompatParcelizer = unregisterconnectioncallbacks;
                    homeViewModelV2.handleMediaPlayPauseIfPendingOnHandler.write(pairRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    homeViewModelV2.AudioAttributesImplApi21Parcelizer.write(new doWrite.RatingCompat(unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer()));
                    return getShowPopup.INSTANCE;
                }
                i = this.IconCompatParcelizer;
                interceptevent = (interceptEvent) this.AudioAttributesImplApi21Parcelizer;
                unregisterconnectioncallbacksIconCompatParcelizer = (unregisterConnectionCallbacks) this.RemoteActionCompatParcelizer;
                homeViewModelV2 = (HomeViewModelV2) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (interceptEvent.RemoteActionCompatParcelizer) obj;
            crc32 crc32Var3 = homeViewModelV2.onSetCaptioningEnabled;
            long handleMediaPlayPauseIfPendingOnHandler = unregisterconnectioncallbacksIconCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler();
            long mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = unregisterconnectioncallbacksIconCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            this.write = homeViewModelV2;
            this.RemoteActionCompatParcelizer = unregisterconnectioncallbacksIconCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = interceptevent;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer2;
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompatItemReceiver = 2;
            remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            obj = crc32Var3.read(handleMediaPlayPauseIfPendingOnHandler, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            unregisterConnectionCallbacks unregisterconnectioncallbacks3 = unregisterconnectioncallbacksIconCompatParcelizer;
            interceptevent2 = interceptevent;
            unregisterconnectioncallbacks = unregisterconnectioncallbacks3;
            int iIntValue2 = ((Number) obj).intValue();
            String audioAttributesCompatParcelizer2 = unregisterconnectioncallbacks.getAudioAttributesCompatParcelizer();
            crc32 crc32Var22 = homeViewModelV2.onSetCaptioningEnabled;
            getContextAttributionTag mediaBrowserCompatCustomActionResultReceiver2 = unregisterconnectioncallbacks.getMediaBrowserCompatCustomActionResultReceiver();
            this.write = homeViewModelV2;
            this.RemoteActionCompatParcelizer = unregisterconnectioncallbacks;
            this.AudioAttributesImplApi21Parcelizer = interceptevent2;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer2;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = iIntValue2;
            this.MediaBrowserCompatItemReceiver = 3;
            i2 = iIntValue2;
            str = audioAttributesCompatParcelizer2;
            obj = crc32Var22.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver2);
            homeViewModelV22 = homeViewModelV2;
            homeViewModelV2 = homeViewModelV22;
            pairRemoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, i2, str, (String) obj, "suggested_home");
            unregisterconnectioncallbacksIconCompatParcelizer = unregisterconnectioncallbacks;
            homeViewModelV2.handleMediaPlayPauseIfPendingOnHandler.write(pairRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            homeViewModelV2.AudioAttributesImplApi21Parcelizer.write(new doWrite.RatingCompat(unregisterconnectioncallbacksIconCompatParcelizer.getAudioAttributesCompatParcelizer()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPause(getContextFeatureId getcontextfeatureid, HomeViewModelV2 homeViewModelV2, SampleVideos<? super onPause> sampleVideos) {
            super(1, sampleVideos);
            this.read = getcontextfeatureid;
            this.AudioAttributesImplBaseParcelizer = homeViewModelV2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new onPause(this.read, this.AudioAttributesImplBaseParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPause) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromMediaId extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getContextFeatureId AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ HomeViewModelV2 read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((getContextFeatureId.onPrepareFromUri) this.AudioAttributesCompatParcelizer).getWrite()) {
                    isSeekPending isseekpending = this.read.handleMediaPlayPauseIfPendingOnHandler;
                    ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
                    isseekpending.write(ApiClientKey.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
                this.read.MediaBrowserCompatMediaItem.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                this.IconCompatParcelizer = 1;
                if (this.read.onPlayFromMediaId.AudioAttributesImplApi26Parcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromMediaId(getContextFeatureId getcontextfeatureid, HomeViewModelV2 homeViewModelV2, SampleVideos<? super onPlayFromMediaId> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = getcontextfeatureid;
            this.read = homeViewModelV2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new onPlayFromMediaId(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromMediaId) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onPlay extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (HomeViewModelV2.this.read(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        onPlay(SampleVideos<? super onPlay> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPlay(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlay) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onPrepare extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r4.read.IconCompatParcelizer(r4) == r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L48
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.home.HomeViewModelV2 r5 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r5 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.write = r3
                java.lang.Object r5 = r5.onCustomAction(r1)
                if (r5 == r0) goto L4b
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L48
                com.marrow2.ui.home.HomeViewModelV2 r5 = com.marrow2.ui.home.HomeViewModelV2.this
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.write = r2
                java.lang.Object r4 = com.marrow2.ui.home.HomeViewModelV2.read(r5, r1)
                if (r4 != r0) goto L48
                goto L4b
            L48:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L4b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onPrepare.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onPrepare(SampleVideos<? super onPrepare> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPrepare(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepare) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            int i;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.write;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize = HomeViewModelV2.this.AudioAttributesImplApi21Parcelizer;
                getCodecsCorrespondingToMimeType getcodecscorrespondingtomimetype = HomeViewModelV2.this.onPlayFromMediaId;
                this.IconCompatParcelizer = getresolutionsize;
                this.RemoteActionCompatParcelizer = 1;
                this.write = 1;
                obj = getcodecscorrespondingtomimetype.read();
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                i = 1;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.RemoteActionCompatParcelizer;
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            Iterable iterable = (Iterable) HomeViewModelV2.this.IconCompatParcelizer.IconCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (obj2 instanceof enqueue) {
                    arrayList.add(obj2);
                }
            }
            getresolutionsize.write(new doWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i != 0, iIntValue, !arrayList.isEmpty()));
            return getShowPopup.INSTANCE;
        }

        handleMediaPlayPauseIfPendingOnHandler(SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new handleMediaPlayPauseIfPendingOnHandler(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onMediaButtonEvent extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (HomeViewModelV2.this.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        onMediaButtonEvent(SampleVideos<? super onMediaButtonEvent> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onMediaButtonEvent(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onMediaButtonEvent) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onFastForward extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getContextFeatureId IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (setCountry.IconCompatParcelizer(300L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            HomeViewModelV2.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(((getContextFeatureId.onSetCaptioningEnabled) this.IconCompatParcelizer).RemoteActionCompatParcelizer()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onFastForward(getContextFeatureId getcontextfeatureid, SampleVideos<? super onFastForward> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = getcontextfeatureid;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onFastForward(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onFastForward) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onFastForward() {
        isSeekPending isseekpending = this.handleMediaPlayPauseIfPendingOnHandler;
        sampleCountToDurationUs samplecounttodurationus = sampleCountToDurationUs.write;
        isseekpending.write(sampleCountToDurationUs.IconCompatParcelizer(false, "snackbar", CourseConfigKeyConstantsKt.KEY_HOME), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    static final class onSetRating extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (HomeViewModelV2.this.onPlayFromMediaId.write(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onSetRating(long j, SampleVideos<? super onSetRating> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onSetRating(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onSetRating) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(long j) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onSetRating(j, null), new MagicModuleSubmissionRequestBody() { // from class: o.isUserRecoverableError
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.onMediaButtonEvent((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(boolean z) {
        isSeekPending isseekpending = this.handleMediaPlayPauseIfPendingOnHandler;
        sampleCountToDurationUs samplecounttodurationus = sampleCountToDurationUs.write;
        isseekpending.write(sampleCountToDurationUs.IconCompatParcelizer(z, "google_popup", CourseConfigKeyConstantsKt.KEY_HOME), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.home.HomeViewModelV2$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.home.HomeViewModelV2$RemoteActionCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            long r1 = r0.IconCompatParcelizer
            long r3 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.write
            com.marrow2.ui.home.HomeViewModelV2 r7 = (com.marrow2.ui.home.HomeViewModelV2) r7
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            o.getResolutionSize r7 = (kotlin.getResolutionSize) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L71
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L52
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getCodecsCorrespondingToMimeType r8 = r7.onPlayFromMediaId
            r0.read = r4
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r0)
            if (r8 == r1) goto L86
        L52:
            java.lang.Number r8 = (java.lang.Number) r8
            long r4 = r8.longValue()
            o.getResolutionSize<o.doWrite> r8 = r7.AudioAttributesImplApi21Parcelizer
            o.getCodecsCorrespondingToMimeType r2 = r7.onPlayFromMediaId
            r0.RemoteActionCompatParcelizer = r8
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r4
            r0.IconCompatParcelizer = r4
            r0.read = r3
            java.lang.Object r7 = r2.AudioAttributesCompatParcelizer()
            if (r7 != r1) goto L6d
            goto L86
        L6d:
            r1 = r4
            r6 = r8
            r8 = r7
            r7 = r6
        L71:
            java.lang.Number r8 = (java.lang.Number) r8
            long r3 = r8.longValue()
            boolean r8 = write(r1, r3)
            o.doWrite$onCommand r0 = new o.doWrite$onCommand
            r0.<init>(r8)
            r7.write(r0)
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        this.AudioAttributesImplApi21Parcelizer.write(doWrite.RemoteActionCompatParcelizer.INSTANCE);
    }

    private static boolean write(long j, long j2) {
        if (j == 0) {
            return true;
        }
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        return fromAdPlaybackState.AudioAttributesCompatParcelizer(j, (61 & 1) != 0 ? 0L : j2, (61 & 2) != 0 ? 0L : 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi26Parcelizer r0 = (com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi26Parcelizer r0 = new com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi26Parcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r7 = r0.IconCompatParcelizer
            java.lang.Object r7 = r0.read
            o.getResolutionSize r7 = (kotlin.getResolutionSize) r7
            java.lang.Object r1 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L93
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L6c
        L47:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L58
        L4b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r8 = r7.onPlayFromUri
            r0.write = r6
            java.lang.Object r8 = r8.AudioAttributesImplApi21Parcelizer(r0)
            if (r8 == r1) goto La7
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La4
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r8 = r7.onPlayFromUri
            o.removeClearedReferences r2 = kotlin.removeClearedReferences.write
            r0.write = r4
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer(r2, r0)
            if (r8 == r1) goto La7
        L6c:
            com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData r8 = (com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData) r8
            if (r8 == 0) goto La4
            o.getResolutionSize<java.lang.Boolean> r2 = r7.MediaBrowserCompatMediaItem
            boolean r4 = r8.isFirstModule()
            if (r4 != 0) goto L9d
            int r8 = r8.getStatus()
            if (r8 != 0) goto L9d
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = r7.onPlayFromUri
            r8 = 0
            r0.RemoteActionCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r8
            r0.read = r2
            r0.IconCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r8 = r7.AudioAttributesImplBaseParcelizer(r0)
            if (r8 != r1) goto L92
            goto La7
        L92:
            r7 = r2
        L93:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = r7
            if (r8 == 0) goto L9d
            r5 = r6
        L9d:
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
            r2.write(r7)
        La4:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                HomeViewModelV2.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(HomeViewModelV2.this.onPlay, new AnonymousClass1(HomeViewModelV2.this, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private /* synthetic */ HomeViewModelV2 RatingCompat;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$MediaBrowserCompatCustomActionResultReceiver */
            static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 IconCompatParcelizer;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                MediaBrowserCompatCustomActionResultReceiver(HomeViewModelV2 homeViewModelV2, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x01a8, code lost:
            
                if (r13 != r1) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0366, code lost:
            
                if (r0.AudioAttributesCompatParcelizer(r12) == r1) goto L84;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0286  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x02a8 A[PHI: r0 r2 r3 r5 r6 r7
              0x02a8: PHI (r0v8 o.getYearOfAdmission) = (r0v5 o.getYearOfAdmission), (r0v10 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]
              0x02a8: PHI (r2v26 o.getYearOfAdmission) = (r2v23 o.getYearOfAdmission), (r2v28 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]
              0x02a8: PHI (r3v10 o.getYearOfAdmission) = (r3v7 o.getYearOfAdmission), (r3v12 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]
              0x02a8: PHI (r5v9 o.getYearOfAdmission) = (r5v6 o.getYearOfAdmission), (r5v11 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]
              0x02a8: PHI (r6v11 o.getYearOfAdmission) = (r6v8 o.getYearOfAdmission), (r6v13 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]
              0x02a8: PHI (r7v9 o.getYearOfAdmission) = (r7v6 o.getYearOfAdmission), (r7v11 o.getYearOfAdmission) binds: [B:54:0x02a6, B:12:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02c6 A[PHI: r0 r2 r3 r5 r6
              0x02c6: PHI (r0v11 o.getYearOfAdmission) = (r0v8 o.getYearOfAdmission), (r0v13 o.getYearOfAdmission) binds: [B:56:0x02c4, B:11:0x00d0] A[DONT_GENERATE, DONT_INLINE]
              0x02c6: PHI (r2v29 o.getYearOfAdmission) = (r2v26 o.getYearOfAdmission), (r2v31 o.getYearOfAdmission) binds: [B:56:0x02c4, B:11:0x00d0] A[DONT_GENERATE, DONT_INLINE]
              0x02c6: PHI (r3v13 o.getYearOfAdmission) = (r3v10 o.getYearOfAdmission), (r3v15 o.getYearOfAdmission) binds: [B:56:0x02c4, B:11:0x00d0] A[DONT_GENERATE, DONT_INLINE]
              0x02c6: PHI (r5v12 o.getYearOfAdmission) = (r5v9 o.getYearOfAdmission), (r5v14 o.getYearOfAdmission) binds: [B:56:0x02c4, B:11:0x00d0] A[DONT_GENERATE, DONT_INLINE]
              0x02c6: PHI (r6v14 o.getYearOfAdmission) = (r6v11 o.getYearOfAdmission), (r6v16 o.getYearOfAdmission) binds: [B:56:0x02c4, B:11:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x02c8  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x02e8  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0308  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0328  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0349  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0386  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x039a  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 956
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.write.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$write, reason: collision with other inner class name */
            static final class C0007write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 IconCompatParcelizer;
                private int RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.RemoteActionCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.RemoteActionCompatParcelizer = 1;
                        if (this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0007write(HomeViewModelV2 homeViewModelV2, SampleVideos<? super C0007write> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new C0007write(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C0007write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$RemoteActionCompatParcelizer */
            static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 RemoteActionCompatParcelizer;
                private int read;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer.onCommand();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                RemoteActionCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.RemoteActionCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$AudioAttributesCompatParcelizer */
            static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 IconCompatParcelizer;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.write = 1;
                        if (this.IconCompatParcelizer.write(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AudioAttributesCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$AudioAttributesImplBaseParcelizer */
            static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 IconCompatParcelizer;
                private int read;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.read;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.read = 1;
                        if (this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AudioAttributesImplBaseParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$MediaBrowserCompatItemReceiver */
            static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ HomeViewModelV2 AudioAttributesCompatParcelizer;
                private int IconCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.IconCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.IconCompatParcelizer = 1;
                        if (this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                MediaBrowserCompatItemReceiver(HomeViewModelV2 homeViewModelV2, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$read */
            static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private int read;
                private /* synthetic */ HomeViewModelV2 write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.read;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.read = 1;
                        if (HomeViewModelV2.RatingCompat(this.write, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                read(HomeViewModelV2 homeViewModelV2, SampleVideos<? super read> sampleVideos) {
                    super(2, sampleVideos);
                    this.write = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new read(this.write, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.home.HomeViewModelV2$write$1$IconCompatParcelizer */
            static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private int AudioAttributesCompatParcelizer;
                private /* synthetic */ HomeViewModelV2 IconCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.AudioAttributesCompatParcelizer;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.AudioAttributesCompatParcelizer = 1;
                        if (this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IconCompatParcelizer(HomeViewModelV2 homeViewModelV2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = homeViewModelV2;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HomeViewModelV2 homeViewModelV2, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.RatingCompat = homeViewModelV2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.RatingCompat, sampleVideos);
                anonymousClass1.RemoteActionCompatParcelizer = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.GoogleSourceStampsResult
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.write(o.SampleVideos):java.lang.Object");
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatItemReceiver(r4) == r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.home.HomeViewModelV2 r5 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r5 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.read = r3
                java.lang.Object r5 = r5.write(r1)
                if (r5 == r0) goto L51
            L32:
                com.marrow.data.models.common.CourseConfigV2 r5 = (com.marrow.data.models.common.CourseConfigV2) r5
                java.util.List r5 = r5.getHomePageItems()
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r1 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.SUGGESTED_QBANK
                boolean r5 = r5.contains(r1)
                if (r5 == 0) goto L4e
                com.marrow2.ui.home.HomeViewModelV2 r5 = com.marrow2.ui.home.HomeViewModelV2.this
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.read = r2
                java.lang.Object r4 = com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatCustomActionResultReceiver(r5, r1)
                if (r4 != r0) goto L4e
                goto L51
            L4e:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L51:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.MediaDescriptionCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaDescriptionCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.isRestrictedUserProfile
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = HomeViewModelV2.this.onCommand;
                this.IconCompatParcelizer = getresolutionsize2;
                this.write = 1;
                Object objAudioAttributesImplBaseParcelizer = HomeViewModelV2.this.onPlayFromMediaId.AudioAttributesImplBaseParcelizer(this);
                if (objAudioAttributesImplBaseParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesImplBaseParcelizer;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(enableAutoManage.AudioAttributesCompatParcelizer((findNalUnit) obj));
            return getShowPopup.INSTANCE;
        }

        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.getRemoteResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaMetadataCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objRemoteActionCompatParcelizer = HomeViewModelV2.this.onPlayFromMediaId.RemoteActionCompatParcelizer(this);
            return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static /* synthetic */ Object RatingCompat(HomeViewModelV2 homeViewModelV2, SampleVideos sampleVideos) {
        return homeViewModelV2.RemoteActionCompatParcelizer(false, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(boolean r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi21Parcelizer r0 = (com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi21Parcelizer r0 = new com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplApi21Parcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r6 = r0.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getPlatform r7 = r5.onPlay
            o.CurrentQuery r7 = (kotlin.CurrentQuery) r7
            com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatItemReceiver r2 = new com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatItemReceiver
            r4 = 0
            r2.<init>(r4)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.write = r6
            r0.read = r3
            java.lang.Object r7 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r7, r2, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            o.getResolutionSize<o.hasApi> r5 = r5.MediaBrowserCompatItemReceiver
            java.lang.Object r0 = r5.IconCompatParcelizer()
            o.hasApi r0 = (kotlin.hasApi) r0
            o.hasApi r6 = kotlin.hasApi.IconCompatParcelizer(r0, r7, r6)
            r5.write(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(boolean, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi26Parcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.home.HomeViewModelV2.RatingCompat
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.home.HomeViewModelV2$RatingCompat r0 = (com.marrow2.ui.home.HomeViewModelV2.RatingCompat) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$RatingCompat r0 = new com.marrow2.ui.home.HomeViewModelV2$RatingCompat
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.write
            o.isConnectionCallbacksRegistered r5 = (kotlin.isConnectionCallbacksRegistered) r5
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            o.getResolutionSize r5 = (kotlin.getResolutionSize) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L57
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<o.isConnectionCallbacksRegistered> r6 = r5.RatingCompat
            java.lang.Object r2 = r6.IconCompatParcelizer()
            o.isConnectionCallbacksRegistered r2 = (kotlin.isConnectionCallbacksRegistered) r2
            o.getCodecsCorrespondingToMimeType r5 = r5.onPlayFromMediaId
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r2
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.write(r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            r4 = r6
            r6 = r5
            r5 = r4
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            o.isConnectionCallbacksRegistered r6 = kotlin.isConnectionCallbacksRegistered.write(r0)
            r5.write(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi26Parcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.home.HomeViewModelV2.MediaMetadataCompat
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.home.HomeViewModelV2$MediaMetadataCompat r0 = (com.marrow2.ui.home.HomeViewModelV2.MediaMetadataCompat) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$MediaMetadataCompat r0 = new com.marrow2.ui.home.HomeViewModelV2$MediaMetadataCompat
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.getCodecsCorrespondingToMimeType r5 = r4.onPlayFromMediaId
            o.RepeatModeUtil r2 = kotlin.RepeatModeUtil.IconCompatParcelizer
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            o.normalizeMimeType r5 = (kotlin.normalizeMimeType) r5
            if (r5 == 0) goto L4b
            o.maybeSignIn r5 = kotlin.getApplicationContext.RemoteActionCompatParcelizer(r5)
            goto L4c
        L4b:
            r5 = 0
        L4c:
            if (r5 == 0) goto L5d
            o.getResolutionSize<o.maybeSignIn> r0 = r4.MediaDescriptionCompat
            r0.write(r5)
            o.getResolutionSize<java.lang.Boolean> r4 = r4.MediaBrowserCompatCustomActionResultReceiver
            r5 = 0
            java.lang.Boolean r5 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
            r4.write(r5)
        L5d:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatItemReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplBaseParcelizer r0 = (com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.MediaBrowserCompatCustomActionResultReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.MediaBrowserCompatCustomActionResultReceiver
            int r9 = r9 + r2
            r0.MediaBrowserCompatCustomActionResultReceiver = r9
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplBaseParcelizer r0 = new com.marrow2.ui.home.HomeViewModelV2$AudioAttributesImplBaseParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.MediaBrowserCompatCustomActionResultReceiver
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L4d
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            int r1 = r0.read
            java.lang.Object r1 = r0.IconCompatParcelizer
            o.getResolutionSize r1 = (kotlin.getResolutionSize) r1
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData r2 = (com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData) r2
            java.lang.Object r3 = r0.write
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer
            com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData r0 = (com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L9e
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L72
        L4d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5e
        L51:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r9 = r8.onPlayFromUri
            r0.MediaBrowserCompatCustomActionResultReceiver = r6
            java.lang.Object r9 = r9.AudioAttributesImplApi21Parcelizer(r0)
            if (r9 == r1) goto Lc3
        L5e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc0
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r9 = r8.onPlayFromUri
            o.removeClearedReferences r2 = kotlin.removeClearedReferences.write
            r0.MediaBrowserCompatCustomActionResultReceiver = r4
            java.lang.Object r9 = r9.RemoteActionCompatParcelizer(r2, r0)
            if (r9 == r1) goto Lc3
        L72:
            r2 = r9
            com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData r2 = (com.marrow2.data.magic_module.remote.model.MagicModuleMetaUCData) r2
            if (r2 == 0) goto Lb7
            o.getResolutionSize<o.getAllClients> r9 = r8.AudioAttributesImplBaseParcelizer
            boolean r4 = r2.isFirstModule()
            if (r4 != 0) goto La9
            int r4 = r2.getStatus()
            if (r4 != 0) goto La9
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r4 = r8.onPlayFromUri
            r0.RemoteActionCompatParcelizer = r2
            r7 = 0
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r2
            r0.IconCompatParcelizer = r9
            r0.read = r5
            r0.MediaBrowserCompatCustomActionResultReceiver = r3
            java.lang.Object r0 = r4.AudioAttributesImplBaseParcelizer(r0)
            if (r0 != r1) goto L9b
            goto Lc3
        L9b:
            r1 = r9
            r9 = r0
            r0 = r2
        L9e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La7
            goto Lac
        La7:
            r9 = r1
            goto Laa
        La9:
            r0 = r2
        Laa:
            r1 = r9
            r6 = r5
        Lac:
            boolean r9 = r0.isFirstModule()
            o.getAllClients r9 = com.marrow2.data.magic_module.remote.model.MagicModuleDataKt.transformToVMModel(r2, r6, r9)
            r1.write(r9)
        Lb7:
            o.getResolutionSize<java.lang.Boolean> r8 = r8.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Boolean r9 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
            r8.write(r9)
        Lc0:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.marrow2.ui.home.HomeViewModelV2.onCommand
            if (r2 == 0) goto L18
            r2 = r1
            com.marrow2.ui.home.HomeViewModelV2$onCommand r2 = (com.marrow2.ui.home.HomeViewModelV2.onCommand) r2
            int r3 = r2.read
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.read
            int r1 = r1 + r4
            r2.read = r1
            goto L1d
        L18:
            com.marrow2.ui.home.HomeViewModelV2$onCommand r2 = new com.marrow2.ui.home.HomeViewModelV2$onCommand
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.RemoteActionCompatParcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.read
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L46
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.getCodecsCorrespondingToMimeType r1 = r0.onPlayFromMediaId
            o.RepeatModeUtil r4 = kotlin.RepeatModeUtil.RemoteActionCompatParcelizer
            r2.read = r5
            java.lang.Object r1 = r1.write(r4, r2)
            if (r1 != r3) goto L46
            return r3
        L46:
            o.normalizeMimeType r1 = (kotlin.normalizeMimeType) r1
            if (r1 == 0) goto L4f
            o.zap r1 = kotlin.getApplicationContext.AudioAttributesCompatParcelizer(r1)
            goto L50
        L4f:
            r1 = 0
        L50:
            o.getResolutionSize<o.zap> r2 = r0.MediaBrowserCompatSearchResultReceiver
            if (r1 != 0) goto L6c
            o.zap r1 = new o.zap
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 8191(0x1fff, float:1.1478E-41)
            r18 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L6c:
            r2.write(r1)
            o.getResolutionSize<java.lang.Boolean> r0 = r0.MediaBrowserCompatCustomActionResultReceiver
            r1 = 0
            java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r1)
            r0.write(r1)
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplBaseParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[LOOP:0: B:23:0x0075->B:25:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatCustomActionResultReceiver(kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatSearchResultReceiver
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatSearchResultReceiver r0 = (com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatSearchResultReceiver) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatSearchResultReceiver r0 = new com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatSearchResultReceiver
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            boolean r0 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L5e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L48
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getCodecsCorrespondingToMimeType r7 = r6.onPlayFromMediaId
            r0.write = r4
            java.lang.Object r7 = r7.AudioAttributesImplApi21Parcelizer(r0)
            if (r7 == r1) goto La0
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            o.getCodecsCorrespondingToMimeType r2 = r6.onPlayFromMediaId
            r0.AudioAttributesCompatParcelizer = r7
            r0.write = r3
            java.lang.Object r0 = r2.IconCompatParcelizer(r0)
            if (r0 != r1) goto L5b
            goto La0
        L5b:
            r5 = r0
            r0 = r7
            r7 = r5
        L5e:
            java.util.List r7 = (java.util.List) r7
            o.getResolutionSize<o.registerConnectionFailedListener> r1 = r6.MediaMetadataCompat
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r7, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r7.next()
            com.marrow.data.models.test.TestIndex r3 = (com.marrow.data.models.test.TestIndex) r3
            o.unregisterConnectionCallbacks r3 = kotlin.stopAutoManage.read(r3, r0)
            r2.add(r3)
            goto L75
        L89:
            java.util.List r2 = (java.util.List) r2
            o.registerConnectionFailedListener r7 = new o.registerConnectionFailedListener
            r7.<init>(r2)
            r1.write(r7)
            o.getResolutionSize<java.lang.Boolean> r6 = r6.MediaBrowserCompatCustomActionResultReceiver
            r7 = 0
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r7)
            r6.write(r7)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatCustomActionResultReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi21Parcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatMediaItem r0 = (com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatMediaItem) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatMediaItem r0 = new com.marrow2.ui.home.HomeViewModelV2$MediaBrowserCompatMediaItem
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            o.getResolutionSize r5 = (kotlin.getResolutionSize) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<o.clearDefaultAccountAndReconnect> r6 = r5.AudioAttributesImplApi26Parcelizer
            o.ParsableNalUnitBitArray r5 = r5.onRewind
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.read(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r4 = r6
            r6 = r5
            r5 = r4
        L4b:
            o.proceed r6 = (kotlin.proceed) r6
            o.clearDefaultAccountAndReconnect r6 = kotlin.addApiIfAvailable.write(r6)
            r5.write(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplApi21Parcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class onAddQueueItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ zaq AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(com.google.android.exoplayer2.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, r8) != r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r8.IconCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L66
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L58
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L4b
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                com.marrow2.ui.home.HomeViewModelV2 r9 = com.marrow2.ui.home.HomeViewModelV2.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r9 = com.marrow2.ui.home.HomeViewModelV2.AudioAttributesImplBaseParcelizer(r9)
                o.zaq r1 = r8.AudioAttributesCompatParcelizer
                java.lang.String r1 = r1.RemoteActionCompatParcelizer()
                o.zaq r5 = r8.AudioAttributesCompatParcelizer
                java.lang.String r5 = r5.write()
                o.zaq r6 = r8.AudioAttributesCompatParcelizer
                int r6 = r6.IconCompatParcelizer()
                r7 = r8
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r8.IconCompatParcelizer = r4
                java.lang.Object r9 = r9.RemoteActionCompatParcelizer(r1, r5, r6, r7)
                if (r9 == r0) goto L6e
            L4b:
                com.marrow2.ui.home.HomeViewModelV2 r9 = com.marrow2.ui.home.HomeViewModelV2.this
                r1 = r8
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r8.IconCompatParcelizer = r3
                java.lang.Object r9 = com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(r9, r1)
                if (r9 == r0) goto L6e
            L58:
                r9 = r8
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r8.IconCompatParcelizer = r2
                r1 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r9 = kotlin.setCountry.IconCompatParcelizer(r1, r9)
                if (r9 != r0) goto L66
                goto L6e
            L66:
                com.marrow2.ui.home.HomeViewModelV2 r8 = com.marrow2.ui.home.HomeViewModelV2.this
                com.marrow2.ui.home.HomeViewModelV2.AudioAttributesCompatParcelizer(r8)
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                return r8
            L6e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onAddQueueItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onAddQueueItem(zaq zaqVar, SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = zaqVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onAddQueueItem(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onAddQueueItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(zaq zaqVar) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onAddQueueItem(zaqVar, null), new MagicModuleSubmissionRequestBody() { // from class: o.honorsDebugCertificates
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (IconCompatParcelizer(r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.home.HomeViewModelV2$IconCompatParcelizer r0 = (com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$IconCompatParcelizer r0 = new com.marrow2.ui.home.HomeViewModelV2$IconCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4e
            if (r2 == r7) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L90
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L87
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L7f
        L46:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L6d
        L4a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5b
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.LogLogLevel r9 = r8.onAddQueueItem
            r0.RemoteActionCompatParcelizer = r7
            java.lang.Object r9 = r9.onCustomAction(r0)
            if (r9 == r1) goto L96
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L93
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r9 = r8.onPlayFromUri
            r0.RemoteActionCompatParcelizer = r6
            java.lang.Object r9 = r9.AudioAttributesImplApi21Parcelizer(r0)
            if (r9 == r1) goto L96
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L93
            o.resetForTests r9 = r8.onPrepareFromMediaId
            r0.RemoteActionCompatParcelizer = r5
            java.lang.Object r9 = r9.RemoteActionCompatParcelizer(r0)
            if (r9 == r1) goto L96
        L7f:
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r9 = r8.AudioAttributesCompatParcelizer(r0)
            if (r9 == r1) goto L96
        L87:
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = r8.IconCompatParcelizer(r0)
            if (r8 != r1) goto L90
            goto L96
        L90:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        L93:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.read(o.SampleVideos):java.lang.Object");
    }

    static final class onPlayFromUri extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        
            if (r6.IconCompatParcelizer.RemoteActionCompatParcelizer(true, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r6) == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.AudioAttributesCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r6 = r6.read
                java.util.List r6 = (java.util.List) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L87
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                java.lang.Object r1 = r6.read
                java.util.List r1 = (java.util.List) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L5a
            L29:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L41
            L2d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r7 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r4
                java.lang.Object r7 = r7.write(r1)
                if (r7 == r0) goto L8a
            L41:
                com.marrow.data.models.common.CourseConfigV2 r7 = (com.marrow.data.models.common.CourseConfigV2) r7
                java.util.List r1 = r7.getHomePageItems()
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r7 = com.marrow2.ui.home.HomeViewModelV2.write(r7)
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.read = r1
                r6.AudioAttributesCompatParcelizer = r3
                java.lang.Object r7 = r7.MediaBrowserCompatCustomActionResultReceiver(r5)
                if (r7 == r0) goto L8a
            L5a:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L65
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L65:
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r7 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
                boolean r7 = r1.contains(r7)
                if (r7 != 0) goto L70
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L70:
                int r7 = r6.RemoteActionCompatParcelizer
                r1 = 32
                if (r7 != r1) goto L87
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r3 = 0
                r6.read = r3
                r6.AudioAttributesCompatParcelizer = r2
                java.lang.Object r6 = com.marrow2.ui.home.HomeViewModelV2.AudioAttributesCompatParcelizer(r7, r4, r1)
                if (r6 != r0) goto L87
                goto L8a
            L87:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L8a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onPlayFromUri.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromUri(int i, SampleVideos<? super onPlayFromUri> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPlayFromUri(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromUri) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(int i) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromUri(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.isSidewinderDevice
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPrepareFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        
            if (r6.read.RemoteActionCompatParcelizer(false, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r6) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.IconCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.write
                java.util.List r0 = (java.util.List) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L88
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L21:
                java.lang.Object r1 = r6.write
                java.util.List r1 = (java.util.List) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L5a
            L29:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L41
            L2d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r7 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.IconCompatParcelizer = r4
                java.lang.Object r7 = r7.write(r1)
                if (r7 == r0) goto L98
            L41:
                com.marrow.data.models.common.CourseConfigV2 r7 = (com.marrow.data.models.common.CourseConfigV2) r7
                java.util.List r1 = r7.getHomePageItems()
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r7 = com.marrow2.ui.home.HomeViewModelV2.write(r7)
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.write = r1
                r6.IconCompatParcelizer = r3
                java.lang.Object r7 = r7.MediaBrowserCompatCustomActionResultReceiver(r5)
                if (r7 == r0) goto L98
            L5a:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L65
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L65:
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r7 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
                boolean r7 = r1.contains(r7)
                if (r7 != 0) goto L70
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L70:
                int r7 = r6.AudioAttributesCompatParcelizer
                r1 = 32
                if (r7 != r1) goto L88
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r3 = 0
                r6.write = r3
                r6.IconCompatParcelizer = r2
                r2 = 0
                java.lang.Object r7 = com.marrow2.ui.home.HomeViewModelV2.AudioAttributesCompatParcelizer(r7, r2, r1)
                if (r7 != r0) goto L88
                goto L98
            L88:
                int r7 = r6.AudioAttributesCompatParcelizer
                if (r7 == r4) goto L90
                r0 = 128(0x80, float:1.8E-43)
                if (r7 != r0) goto L95
            L90:
                com.marrow2.ui.home.HomeViewModelV2 r6 = com.marrow2.ui.home.HomeViewModelV2.this
                com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(r6)
            L95:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L98:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onPrepareFromSearch.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPrepareFromSearch(int i, SampleVideos<? super onPrepareFromSearch> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPrepareFromSearch(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(int i) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepareFromSearch(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.GoogleSignatureVerifier
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.MediaBrowserCompatSearchResultReceiver(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;
        private /* synthetic */ int write;

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.read
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r6.AudioAttributesCompatParcelizer
                java.util.List r0 = (java.util.List) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L8c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L22:
                java.lang.Object r1 = r6.AudioAttributesCompatParcelizer
                java.util.List r1 = (java.util.List) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L5b
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L42
            L2e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r7 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r4
                java.lang.Object r7 = r7.write(r1)
                if (r7 == r0) goto Lc3
            L42:
                com.marrow.data.models.common.CourseConfigV2 r7 = (com.marrow.data.models.common.CourseConfigV2) r7
                java.util.List r1 = r7.getHomePageItems()
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r7 = com.marrow2.ui.home.HomeViewModelV2.write(r7)
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.AudioAttributesCompatParcelizer = r1
                r6.read = r3
                java.lang.Object r7 = r7.MediaBrowserCompatCustomActionResultReceiver(r5)
                if (r7 == r0) goto Lc3
            L5b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L66
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L66:
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r7 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
                boolean r7 = r1.contains(r7)
                if (r7 != 0) goto L71
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L71:
                int r7 = r6.write
                r1 = 32
                if (r7 != r1) goto Lc0
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r7 = com.marrow2.ui.home.HomeViewModelV2.write(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r3 = 0
                r6.AudioAttributesCompatParcelizer = r3
                r6.read = r2
                java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r1)
                if (r7 != r0) goto L8c
                goto Lc3
            L8c:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                com.marrow2.ui.home.HomeViewModelV2 r0 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getResolutionSize r0 = com.marrow2.ui.home.HomeViewModelV2.MediaBrowserCompatSearchResultReceiver(r0)
                r1 = 0
                java.lang.Boolean r2 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r1)
                r0.write(r2)
                com.marrow2.ui.home.HomeViewModelV2 r0 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getResolutionSize r0 = com.marrow2.ui.home.HomeViewModelV2.onCustomAction(r0)
                com.marrow2.ui.home.HomeViewModelV2 r6 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getResolutionSize r6 = com.marrow2.ui.home.HomeViewModelV2.onCustomAction(r6)
                java.lang.Object r6 = r6.IconCompatParcelizer()
                o.hasApi r6 = (kotlin.hasApi) r6
                r6 = 1500(0x5dc, float:2.102E-42)
                if (r7 <= r6) goto Lb8
                r6 = r4
                goto Lb9
            Lb8:
                r6 = r1
            Lb9:
                o.hasApi r6 = kotlin.hasApi.AudioAttributesCompatParcelizer(r7, r1, r4, r6)
                r0.write(r6)
            Lc0:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            Lc3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onPlayFromSearch.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromSearch(int i, SampleVideos<? super onPlayFromSearch> sampleVideos) {
            super(1, sampleVideos);
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPlayFromSearch(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(int i) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromSearch(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.uidHasPackageName
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModelV2.RatingCompat(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(HomeViewModelV2 homeViewModelV2, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeViewModelV2.read.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (RemoteActionCompatParcelizer(true, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.AllocatorAllocationNode r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.home.HomeViewModelV2.onSetShuffleMode
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.home.HomeViewModelV2$onSetShuffleMode r0 = (com.marrow2.ui.home.HomeViewModelV2.onSetShuffleMode) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$onSetShuffleMode r0 = new com.marrow2.ui.home.HomeViewModelV2$onSetShuffleMode
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            boolean r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L74
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r7 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5f
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.AllocatorAllocationNode r8 = kotlin.AllocatorAllocationNode.AudioAttributesImplApi21Parcelizer
            if (r7 == r8) goto L4a
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L4a:
            o.getPlatform r7 = r6.onPlay
            o.CurrentQuery r7 = (kotlin.CurrentQuery) r7
            com.marrow2.ui.home.HomeViewModelV2$onSetCaptioningEnabled r8 = new com.marrow2.ui.home.HomeViewModelV2$onSetCaptioningEnabled
            r8.<init>(r4)
            o.MagicModuleSubmissionRequestBody r8 = (kotlin.MagicModuleSubmissionRequestBody) r8
            r0.IconCompatParcelizer = r4
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r8 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r7, r8, r0)
            if (r8 == r1) goto L7a
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L77
            r0.IconCompatParcelizer = r4
            r0.RemoteActionCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r5, r0)
            if (r6 != r1) goto L74
            goto L7a
        L74:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L77:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.read(o.AllocatorAllocationNode, o.SampleVideos):java.lang.Object");
    }

    static final class onSetCaptioningEnabled extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r6 = r6.AudioAttributesCompatParcelizer
                java.util.List r6 = (java.util.List) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L53
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L36
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r7 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r3
                java.lang.Object r7 = r7.write(r1)
                if (r7 == r0) goto L69
            L36:
                com.marrow.data.models.common.CourseConfigV2 r7 = (com.marrow.data.models.common.CourseConfigV2) r7
                java.util.List r7 = r7.getHomePageItems()
                com.marrow2.ui.home.HomeViewModelV2 r1 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r1 = com.marrow2.ui.home.HomeViewModelV2.write(r1)
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r6.AudioAttributesCompatParcelizer = r7
                r6.read = r2
                java.lang.Object r6 = r1.MediaBrowserCompatCustomActionResultReceiver(r4)
                if (r6 != r0) goto L50
                goto L69
            L50:
                r5 = r7
                r7 = r6
                r6 = r5
            L53:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L63
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r7 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
                boolean r6 = r6.contains(r7)
                if (r6 != 0) goto L64
            L63:
                r3 = 0
            L64:
                java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
                return r6
            L69:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onSetCaptioningEnabled.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onSetCaptioningEnabled(SampleVideos<? super onSetCaptioningEnabled> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onSetCaptioningEnabled(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((onSetCaptioningEnabled) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (RemoteActionCompatParcelizer(true, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.AllocatorAllocationNode r7, int r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.home.HomeViewModelV2.onSetPlaybackSpeed
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.home.HomeViewModelV2$onSetPlaybackSpeed r0 = (com.marrow2.ui.home.HomeViewModelV2.onSetPlaybackSpeed) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$onSetPlaybackSpeed r0 = new com.marrow2.ui.home.HomeViewModelV2$onSetPlaybackSpeed
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L34
            boolean r6 = r0.write
            int r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L7c
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            int r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r7 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L65
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.AllocatorAllocationNode r9 = kotlin.AllocatorAllocationNode.AudioAttributesImplApi21Parcelizer
            if (r7 == r9) goto L4e
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L4e:
            o.getPlatform r7 = r6.onPlay
            o.CurrentQuery r7 = (kotlin.CurrentQuery) r7
            com.marrow2.ui.home.HomeViewModelV2$onSetRepeatMode r9 = new com.marrow2.ui.home.HomeViewModelV2$onSetRepeatMode
            r9.<init>(r4)
            o.MagicModuleSubmissionRequestBody r9 = (kotlin.MagicModuleSubmissionRequestBody) r9
            r0.read = r4
            r0.RemoteActionCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r9 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r7, r9, r0)
            if (r9 == r1) goto L82
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7f
            r0.read = r4
            r0.RemoteActionCompatParcelizer = r8
            r0.write = r7
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r5, r0)
            if (r6 != r1) goto L7c
            goto L82
        L7c:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L7f:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(o.AllocatorAllocationNode, int, o.SampleVideos):java.lang.Object");
    }

    static final class onSetRepeatMode extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer
                java.util.List r6 = (java.util.List) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L53
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L36
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.home.HomeViewModelV2 r7 = com.marrow2.ui.home.HomeViewModelV2.this
                o.LogLogLevel r7 = com.marrow2.ui.home.HomeViewModelV2.IconCompatParcelizer(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.write = r3
                java.lang.Object r7 = r7.write(r1)
                if (r7 == r0) goto L69
            L36:
                com.marrow.data.models.common.CourseConfigV2 r7 = (com.marrow.data.models.common.CourseConfigV2) r7
                java.util.List r7 = r7.getHomePageItems()
                com.marrow2.ui.home.HomeViewModelV2 r1 = com.marrow2.ui.home.HomeViewModelV2.this
                o.getCodecsCorrespondingToMimeType r1 = com.marrow2.ui.home.HomeViewModelV2.write(r1)
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r6.RemoteActionCompatParcelizer = r7
                r6.write = r2
                java.lang.Object r6 = r1.MediaBrowserCompatCustomActionResultReceiver(r4)
                if (r6 != r0) goto L50
                goto L69
            L50:
                r5 = r7
                r7 = r6
                r6 = r5
            L53:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L63
                com.marrow.data.models.common.CourseConfigV2$HomePageItems r7 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
                boolean r6 = r6.contains(r7)
                if (r6 != 0) goto L64
            L63:
                r3 = 0
            L64:
                java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
                return r6
            L69:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.onSetRepeatMode.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onSetRepeatMode(SampleVideos<? super onSetRepeatMode> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onSetRepeatMode(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((onSetRepeatMode) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class onPrepareFromUri extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Pair<? extends Boolean, ? extends List<? extends CourseConfigV2.HomePageItems>>>, Object> {
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = HomeViewModelV2.this.onPlayFromMediaId.MediaBrowserCompatCustomActionResultReceiver(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.read;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return new Pair(obj2, ((CourseConfigV2) obj).getHomePageItems());
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.read = obj;
            this.write = 2;
            Object objWrite = HomeViewModelV2.this.onAddQueueItem.write(this);
            if (objWrite == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            Object obj3 = obj;
            obj = objWrite;
            obj2 = obj3;
            return new Pair(obj2, ((CourseConfigV2) obj).getHomePageItems());
        }

        onPrepareFromUri(SampleVideos<? super onPrepareFromUri> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onPrepareFromUri(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Pair<Boolean, ? extends List<? extends CourseConfigV2.HomePageItems>>> sampleVideos) {
            return ((onPrepareFromUri) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (RemoteActionCompatParcelizer(false, (kotlin.SampleVideos<? super kotlin.getShowPopup>) r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.AllocatorAllocationNode r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.home.HomeViewModelV2.onSeekTo
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.home.HomeViewModelV2$onSeekTo r0 = (com.marrow2.ui.home.HomeViewModelV2.onSeekTo) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$onSeekTo r0 = new com.marrow2.ui.home.HomeViewModelV2$onSeekTo
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.read
            java.lang.Object r7 = r0.IconCompatParcelizer
            o.AllocatorAllocationNode r7 = (kotlin.AllocatorAllocationNode) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L9d
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.Object r8 = r0.IconCompatParcelizer
            o.AllocatorAllocationNode r8 = (kotlin.AllocatorAllocationNode) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5e
        L46:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.getPlatform r9 = r7.onPlay
            o.CurrentQuery r9 = (kotlin.CurrentQuery) r9
            com.marrow2.ui.home.HomeViewModelV2$onPrepareFromUri r2 = new com.marrow2.ui.home.HomeViewModelV2$onPrepareFromUri
            r2.<init>(r5)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.IconCompatParcelizer = r8
            r0.write = r4
            java.lang.Object r9 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r9, r2, r0)
            if (r9 == r1) goto La3
        L5e:
            o.getSubscriptionExpiresOn r9 = (kotlin.Pair) r9
            java.lang.Object r2 = r9.RemoteActionCompatParcelizer()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r9 = r9.read()
            java.util.List r9 = (java.util.List) r9
            if (r2 != 0) goto L75
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        L75:
            int[] r6 = com.marrow2.ui.home.HomeViewModelV2.read.RemoteActionCompatParcelizer
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r4) goto L85
            if (r8 != r3) goto La0
            r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            goto La0
        L85:
            com.marrow.data.models.common.CourseConfigV2$HomePageItems r8 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto La0
            r0.IconCompatParcelizer = r5
            r0.read = r5
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r3
            r8 = 0
            java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r8, r0)
            if (r7 != r1) goto L9d
            goto La3
        L9d:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        La0:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.RemoteActionCompatParcelizer(o.AllocatorAllocationNode, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.AllocatorAllocationNode r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItem
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.home.HomeViewModelV2$onRemoveQueueItem r0 = (com.marrow2.ui.home.HomeViewModelV2.onRemoveQueueItem) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            com.marrow2.ui.home.HomeViewModelV2$onRemoveQueueItem r0 = new com.marrow2.ui.home.HomeViewModelV2$onRemoveQueueItem
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r7 = r0.write
            java.lang.Object r7 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L97
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r7 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L61
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.AllocatorAllocationNode r8 = kotlin.AllocatorAllocationNode.AudioAttributesImplApi21Parcelizer
            if (r7 == r8) goto L4c
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L4c:
            o.getPlatform r7 = r6.onPlay
            o.CurrentQuery r7 = (kotlin.CurrentQuery) r7
            com.marrow2.ui.home.HomeViewModelV2$onRewind r8 = new com.marrow2.ui.home.HomeViewModelV2$onRewind
            r8.<init>(r5)
            o.MagicModuleSubmissionRequestBody r8 = (kotlin.MagicModuleSubmissionRequestBody) r8
            r0.IconCompatParcelizer = r5
            r0.read = r4
            java.lang.Object r8 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r7, r8, r0)
            if (r8 == r1) goto Lc3
        L61:
            o.getSubscriptionExpiresOn r8 = (kotlin.Pair) r8
            java.lang.Object r7 = r8.RemoteActionCompatParcelizer()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r8 = r8.read()
            java.util.List r8 = (java.util.List) r8
            if (r7 == 0) goto Lc0
            com.marrow.data.models.common.CourseConfigV2$HomePageItems r2 = com.marrow.data.models.common.CourseConfigV2.HomePageItems.PEARLS
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto Lc0
            o.getPlatform r8 = r6.onPlay
            o.CurrentQuery r8 = (kotlin.CurrentQuery) r8
            com.marrow2.ui.home.HomeViewModelV2$onRemoveQueueItemAt r2 = new com.marrow2.ui.home.HomeViewModelV2$onRemoveQueueItemAt
            r2.<init>(r5)
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2
            r0.IconCompatParcelizer = r5
            r0.write = r5
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r8 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r8, r2, r0)
            if (r8 != r1) goto L97
            goto Lc3
        L97:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            o.getResolutionSize<java.lang.Boolean> r8 = r6.MediaBrowserCompatCustomActionResultReceiver
            r0 = 0
            java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
            r8.write(r1)
            o.getResolutionSize<o.hasApi> r6 = r6.MediaBrowserCompatItemReceiver
            java.lang.Object r8 = r6.IconCompatParcelizer()
            o.hasApi r8 = (kotlin.hasApi) r8
            r8 = 1500(0x5dc, float:2.102E-42)
            if (r7 <= r8) goto Lb5
            r8 = r4
            goto Lb6
        Lb5:
            r8 = r0
        Lb6:
            o.hasApi r7 = kotlin.hasApi.AudioAttributesCompatParcelizer(r7, r0, r4, r8)
            r6.write(r7)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        Lc0:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.home.HomeViewModelV2.AudioAttributesCompatParcelizer(o.AllocatorAllocationNode, o.SampleVideos):java.lang.Object");
    }

    static final class onRewind extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Pair<? extends Boolean, ? extends List<? extends CourseConfigV2.HomePageItems>>>, Object> {
        private Object IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = HomeViewModelV2.this.onPlayFromMediaId.MediaBrowserCompatCustomActionResultReceiver(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.IconCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return new Pair(obj2, ((CourseConfigV2) obj).getHomePageItems());
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.IconCompatParcelizer = obj;
            this.write = 2;
            Object objWrite = HomeViewModelV2.this.onAddQueueItem.write(this);
            if (objWrite == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            Object obj3 = obj;
            obj = objWrite;
            obj2 = obj3;
            return new Pair(obj2, ((CourseConfigV2) obj).getHomePageItems());
        }

        onRewind(SampleVideos<? super onRewind> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeViewModelV2.this.new onRewind(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Pair<Boolean, ? extends List<? extends CourseConfigV2.HomePageItems>>> sampleVideos) {
            return ((onRewind) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/home/HomeViewModelV2$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
