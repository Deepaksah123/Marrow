package com.marrow2.ui.test.testplay;

import com.google.android.exoplayer2.C;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.ui.test.testplay.TestPlayViewModel;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AppMeasurementConditionalUserProperty;
import kotlin.AppMeasurementDynamiteService;
import kotlin.AppMeasurementEventInterceptor;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.PlanDetailsCreator;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.anyIgnorals;
import kotlin.checkCleartextTrafficPermitted;
import kotlin.crc32;
import kotlin.dropTable;
import kotlin.formatInvariant;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getAttributeArrayLocationAndEnable;
import kotlin.getCStringLength;
import kotlin.getEndTimestamp;
import kotlin.getHeader;
import kotlin.getMagicModuleStats;
import kotlin.getMagicModuleTimeline;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isSeekPending;
import kotlin.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;
import kotlin.onConnectionFailed;
import kotlin.onScrollChange;
import kotlin.parseEac3SupplementalProperties;
import kotlin.readBlockToCache;
import kotlin.resetForTests;
import kotlin.setChipSpacing;
import kotlin.setCountry;
import kotlin.setDouble;
import kotlin.setItemIconTintList;
import kotlin.setMoney;
import kotlin.setSdkPayload;
import kotlin.setSingleLine;
import kotlin.setStartTime;
import kotlin.setTextEndPadding;
import kotlin.setTextEndPaddingResource;
import kotlin.setTextStartPaddingResource;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzbV;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0097\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010>\u001a\u00020?H\u0002J\u0016\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u000208H\u0082@¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u00020?H\u0002J\b\u0010G\u001a\u00020?H\u0002J\u000e\u0010H\u001a\u00020?H\u0082@¢\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020LJ\u0010\u0010M\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0017H\u0002J\u0010\u0010N\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0017H\u0002J\n\u0010O\u001a\u0004\u0018\u00010\u0017H\u0002J\u0016\u0010P\u001a\u00020?2\u0006\u0010Q\u001a\u000208H\u0082@¢\u0006\u0002\u0010EJ,\u0010R\u001a\u00020?2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010S\u001a\u0004\u0018\u00010\u00172\b\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u00020?H\u0002J\u0010\u0010X\u001a\u00020?2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020?2\u0006\u0010\\\u001a\u00020+H\u0002J\u0010\u0010]\u001a\u00020?2\u0006\u0010\\\u001a\u00020+H\u0002J\b\u0010^\u001a\u00020?H\u0002J\b\u0010_\u001a\u00020?H\u0002J\b\u0010`\u001a\u00020?H\u0002J\b\u0010a\u001a\u00020?H\u0002J\b\u0010b\u001a\u00020?H\u0002J\b\u0010c\u001a\u000206H\u0002J\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080eH\u0082@¢\u0006\u0002\u0010IJ\u001a\u0010f\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080eH\u0082@¢\u0006\u0002\u0010IJ$\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u0002082\n\u0010j\u001a\u00060kj\u0002`l2\u0006\u0010m\u001a\u000208H\u0002J\u0018\u0010n\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00172\u0006\u0010o\u001a\u000208H\u0002J\u0018\u0010p\u001a\u00020/2\u0006\u0010i\u001a\u0002082\u0006\u0010m\u001a\u000208H\u0002J\u0010\u0010q\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0017H\u0002J\u001e\u0010r\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010sJ\u0018\u0010t\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00172\u0006\u0010u\u001a\u00020/H\u0002J\u0010\u0010v\u001a\u00020?2\u0006\u0010w\u001a\u00020/H\u0002J\u0010\u0010x\u001a\u00020?2\u0006\u0010y\u001a\u00020hH\u0002J\u0010\u0010z\u001a\u00020?2\u0006\u0010{\u001a\u000208H\u0002J\b\u0010|\u001a\u00020?H\u0002J\b\u0010}\u001a\u00020?H\u0002J\u0010\u0010~\u001a\u00020?2\u0006\u0010\u007f\u001a\u000208H\u0002J\u0012\u0010\u0080\u0001\u001a\u00020?2\u0007\u0010U\u001a\u00030\u0081\u0001H\u0002J\u0012\u0010\u0082\u0001\u001a\u00020?2\u0007\u0010U\u001a\u00030\u0083\u0001H\u0002J\t\u0010\u0084\u0001\u001a\u00020?H\u0002J\t\u0010\u0085\u0001\u001a\u00020?H\u0002J\t\u0010\u0086\u0001\u001a\u00020?H\u0002J\t\u0010\u0087\u0001\u001a\u00020?H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020?2\u0007\u0010\u0089\u0001\u001a\u00020VH\u0002J\t\u0010\u008c\u0001\u001a\u00020?H\u0002J\u001b\u0010\u008d\u0001\u001a\u00020?2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0002J\t\u0010\u008e\u0001\u001a\u00020?H\u0002J\t\u0010\u008f\u0001\u001a\u00020?H\u0002J\u0010\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0082@¢\u0006\u0002\u0010IJ\u0015\u0010\u0092\u0001\u001a\u0002062\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fH\u0002J\u0013\u0010\u0093\u0001\u001a\u00020?2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0002J\t\u0010\u0096\u0001\u001a\u00020?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0'¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u000e\u00101\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0098\u0001"}, d2 = {"Lcom/marrow2/ui/test/testplay/TestPlayViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "testApiUseCase", "Lcom/marrow2/domain/test/TestApiUseCase;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "magicModuleUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleUseCase;", "magicModuleAPIUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;", "testWorkerManager", "Lcom/marrow2/ui/test/testplay/worker/TestWorkerManager;", "analyticsPublisher", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "customModuleUseCase", "Lcom/marrow2/domain/custom_module/CustomModuleUseCase;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/test/TestApiUseCase;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/magic_module/MagicModuleUseCase;Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;Lcom/marrow2/ui/test/testplay/worker/TestWorkerManager;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/domain/custom_module/CustomModuleUseCase;)V", "testId", "", "getTestId", "()Ljava/lang/String;", "parentType", "Lcom/marrow2/data/mcq/local/model/McqParentType;", "customModuleOwner", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "testGroups", "", "Lcom/marrow2/ui/test/testplay/model/TestGroupVMModel;", "_testUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/test/landing/model/TestPlayUiState;", "testUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getTestUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_navigateState", "Lcom/marrow2/ui/test/testplay/model/NavigateUiState;", "navigateState", "getNavigateState", "_isLoading", "", "isLoading", "testTimedOut", "submissionInProcess", "questionTimerEvent", "Lcom/marrow2/ui/test/testplay/model/QuestionTimerEvents;", "mcqTimeStart", "", "previousPagerPosition", "", "endTime", "currentGroup", "currentTimerMcqId", "currentTimerAnalysis", "Lcom/marrow2/ui/test/testplay/model/TimerAnalysis;", "initTestWithTimer", "", "activateMcqTimer", "mcqId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveToNextGroup", "currentGroupIndex", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initCustomModule", "initMagicModule", "startTestTimer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyEvent", "event", "Lcom/marrow2/ui/test/testplay/model/TestPlayEvents;", "snapshotMcqTimer", "persistTimerEntry", "currentMcqId", "initiateMcqTimerAnalysis", "incomingPage", "logOtherPartAccessAttemptedEvent", "currentPartName", "otherPartName", "launchSource", "Lcom/marrow2/ui/test/analytics/OtherPartAccessAttemptSource;", "onIntroTooltipClicked", "handleTimerForLifecycle", LogCategory.LIFECYCLE, "Landroidx/lifecycle/Lifecycle$Event;", "handleDialogPositiveEvent", "type", "handleDialogNegativeEvent", "discardCustomModule", "retryTestSubmission", "forceSubmitTest", "submitTest", "discardTest", "getRemainingTime", "getTestProgressCounts", "Lkotlin/Pair;", "getModuleProgressCounts", "getButtonStatus", "Lcom/marrow2/ui/test/landing/model/NavigationButtonStatus;", "currentPagerPosition", "mcqAnswer", "Lcom/marrow2/data/mcq/local/model/McqAnswerRepoModel;", "Lcom/marrow2/data/mcq/repo/model/McqAnswerUCModel;", "totalMcqCount", "notifyOptionSelected", "position", "isLastQuestion", "notifyOptionUnSelected", "notifySelectionChanged", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyOptionGuessedEvent", "guessed", "onStarIconPressed", "checked", "onNavigationButtonPressed", "status", "jumpToPage", "newPagerPosition", "onBottomMenuPressed", "onSheetCollapsed", "notifyReviewItemClicked", "index", "openReviewTestEvent", "Lcom/marrow2/ui/test/analytics/ReviewSheetLaunchSource;", "confirmSubmission", "Lcom/marrow2/ui/test/analytics/TestSubmitLaunchSource;", "submitMagicModule", "handleDuplicateMagicModuleSubmission", "onTestDiscard", "onUserTryingExitTest", "onCurrentSectionSkipAttempt", "source", "isDiscarded", "forceSubmit", "snapshotCurrentMcqOnExit", "uploadTest", "startMcqTimer", "scheduleTestNotification", "getTestStatusAnalytics", "Lcom/marrow2/ui/test/analytics/TestAnalytics$TestAnalyticsStatus;", "getTestRemainingTime", "sendTestEvent", "testEventType", "Lcom/marrow2/ui/test/testplay/TestPlayViewModel$TestEventType;", "exitMagicModuleScreen", "TestEventType", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestPlayViewModel extends POJOPropertyBuilderWithMember {
    private setSingleLine AudioAttributesCompatParcelizer;
    private final getArray AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private setChipSpacing AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<Boolean> IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private final resetForTests MediaBrowserCompatMediaItem;
    private final lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private final setUpdatedStatus<Boolean> MediaMetadataCompat;
    private boolean RatingCompat;
    private final isSeekPending RemoteActionCompatParcelizer;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private final setUpdatedStatus<setTextEndPaddingResource> onAddQueueItem;
    private final NetworkTypeObserverApi31DisplayInfoCallback onCommand;
    private final readBlockToCache onCustomAction;
    private final getResolutionSize<setTextEndPadding> onFastForward;
    private TestIndex onMediaButtonEvent;
    private final checkCleartextTrafficPermitted onPause;
    private boolean onPlay;
    private List<setSingleLine> onPlayFromMediaId;
    private final setItemIconTintList onPlayFromSearch;
    private boolean onPlayFromUri;
    private final String onPrepare;
    private final setUpdatedStatus<getHeader> onPrepareFromMediaId;
    private final crc32 onPrepareFromSearch;
    private final getResolutionSize<getHeader> read;
    private final getResolutionSize<setTextEndPaddingResource> write;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[readBlockToCache.values().length];
            try {
                iArr[readBlockToCache.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[readBlockToCache.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            RemoteActionCompatParcelizer = iArr;
            int[] iArr2 = new int[anyIgnorals.read.values().length];
            try {
                iArr2[anyIgnorals.read.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[anyIgnorals.read.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr2;
            int[] iArr3 = new int[setDouble.values().length];
            try {
                iArr3[setDouble.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            IconCompatParcelizer = iArr3;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.read(this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.RemoteActionCompatParcelizer((String) null, this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.IconCompatParcelizer(this);
        }
    }

    static final class onAddQueueItem extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        onAddQueueItem(SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.read(0, this);
        }
    }

    static final class onPlayFromMediaId extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        onPlayFromMediaId(SampleVideos<? super onPlayFromMediaId> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return TestPlayViewModel.this.write((String) null, (String) null, this);
        }
    }

    @setSdkPayload
    public TestPlayViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, checkCleartextTrafficPermitted checkcleartexttrafficpermitted, crc32 crc32Var, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, resetForTests resetfortests, setItemIconTintList setitemicontintlist, isSeekPending isseekpending, getArray getarray) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(checkcleartexttrafficpermitted, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, "");
        toMagicModuleMetaRepoModel.write(resetfortests, "");
        toMagicModuleMetaRepoModel.write(setitemicontintlist, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getarray, "");
        this.onPause = checkcleartexttrafficpermitted;
        this.onPrepareFromSearch = crc32Var;
        this.onCommand = networkTypeObserverApi31DisplayInfoCallback;
        this.MediaBrowserCompatSearchResultReceiver = lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver;
        this.MediaBrowserCompatMediaItem = resetfortests;
        this.onPlayFromSearch = setitemicontintlist;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.AudioAttributesImplApi21Parcelizer = getarray;
        Object objWrite = pOJOPropertyBuilder5.write("testId");
        if (objWrite == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.onPrepare = (String) objWrite;
        Object objWrite2 = pOJOPropertyBuilder5.write("parent_type");
        if (objWrite2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        readBlockToCache readblocktocache = (readBlockToCache) objWrite2;
        this.onCustomAction = readblocktocache;
        this.onPlayFromMediaId = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getResolutionSize<getHeader> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getHeader(null, 0, 0, 0L, false, false, null, null, null, false, null, false, null, null, null, null, null, 131071, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.onPrepareFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setTextEndPaddingResource> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.onFastForward = setStartTime.RemoteActionCompatParcelizer(setTextEndPadding.RemoteActionCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatCustomActionResultReceiver = -1L;
        int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[readblocktocache.ordinal()];
        if (i == 1) {
            MediaMetadataCompat();
        } else if (i == 2) {
            RatingCompat();
        } else {
            onCustomAction();
        }
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getOnPrepare() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<getHeader> AudioAttributesCompatParcelizer() {
        return this.onPrepareFromMediaId;
    }

    public final setUpdatedStatus<setTextEndPaddingResource> IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    static final class onPrepareFromMediaId extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        public static final class write implements NewNumberOtpResendRequest<Pair<? extends setTextEndPadding, ? extends Long>> {
            private /* synthetic */ NewNumberOtpResendRequest AudioAttributesCompatParcelizer;
            private /* synthetic */ TestPlayViewModel read;

            public write(NewNumberOtpResendRequest newNumberOtpResendRequest, TestPlayViewModel testPlayViewModel) {
                this.AudioAttributesCompatParcelizer = newNumberOtpResendRequest;
                this.read = testPlayViewModel;
            }

            @Override // kotlin.NewNumberOtpResendRequest
            public final Object write(getValidationToken<? super Pair<? extends setTextEndPadding, ? extends Long>> getvalidationtoken, SampleVideos sampleVideos) {
                Object objWrite = this.AudioAttributesCompatParcelizer.write(new AnonymousClass1(getvalidationtoken, this.read), sampleVideos);
                return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
            }

            /* JADX INFO: renamed from: com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$write$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements getValidationToken {
                private /* synthetic */ getValidationToken AudioAttributesCompatParcelizer;
                private /* synthetic */ TestPlayViewModel read;

                /* JADX INFO: renamed from: com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$write$1$5, reason: invalid class name */
                public static final class AnonymousClass5 extends getTotalMcq {
                    Object AudioAttributesCompatParcelizer;
                    /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
                    Object IconCompatParcelizer;
                    int MediaBrowserCompatItemReceiver;
                    int RemoteActionCompatParcelizer;
                    Object read;
                    Object write;

                    public AnonymousClass5(SampleVideos sampleVideos) {
                        super(sampleVideos);
                    }

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        this.AudioAttributesImplApi21Parcelizer = obj;
                        this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
                        return AnonymousClass1.this.IconCompatParcelizer(null, this);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlin.getValidationToken
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object IconCompatParcelizer(java.lang.Object r11, kotlin.SampleVideos r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.onPrepareFromMediaId.write.AnonymousClass1.AnonymousClass5
                        if (r0 == 0) goto L14
                        r0 = r12
                        com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$write$1$5 r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.onPrepareFromMediaId.write.AnonymousClass1.AnonymousClass5) r0
                        int r1 = r0.MediaBrowserCompatItemReceiver
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r12 = r0.MediaBrowserCompatItemReceiver
                        int r12 = r12 + r2
                        r0.MediaBrowserCompatItemReceiver = r12
                        goto L19
                    L14:
                        com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$write$1$5 r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$write$1$5
                        r0.<init>(r12)
                    L19:
                        java.lang.Object r12 = r0.AudioAttributesImplApi21Parcelizer
                        java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                        int r2 = r0.MediaBrowserCompatItemReceiver
                        r3 = 1
                        if (r2 == 0) goto L3c
                        if (r2 != r3) goto L34
                        int r10 = r0.RemoteActionCompatParcelizer
                        java.lang.Object r10 = r0.write
                        java.lang.Object r10 = r0.IconCompatParcelizer
                        java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
                        java.lang.Object r10 = r0.read
                        kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                        goto L78
                    L34:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3c:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                        o.getValidationToken r12 = r10.AudioAttributesCompatParcelizer
                        r2 = r0
                        o.SampleVideos r2 = (kotlin.SampleVideos) r2
                        o.setTextEndPadding r11 = (kotlin.setTextEndPadding) r11
                        long r4 = java.lang.System.currentTimeMillis()
                        com.marrow2.ui.test.testplay.TestPlayViewModel r2 = r10.read
                        long r6 = com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatItemReceiver(r2)
                        com.marrow2.ui.test.testplay.TestPlayViewModel r10 = r10.read
                        long r8 = java.lang.System.currentTimeMillis()
                        com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesCompatParcelizer(r10, r8)
                        o.getSubscriptionExpiresOn r10 = new o.getSubscriptionExpiresOn
                        long r4 = r4 - r6
                        java.lang.Long r2 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r4)
                        r10.<init>(r11, r2)
                        r11 = 0
                        r0.read = r11
                        r0.AudioAttributesCompatParcelizer = r11
                        r0.IconCompatParcelizer = r11
                        r0.write = r11
                        r11 = 0
                        r0.RemoteActionCompatParcelizer = r11
                        r0.MediaBrowserCompatItemReceiver = r3
                        java.lang.Object r10 = r12.IconCompatParcelizer(r10, r0)
                        if (r10 != r1) goto L78
                        return r1
                    L78:
                        o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onPrepareFromMediaId.write.AnonymousClass1.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
                }

                public AnonymousClass1(getValidationToken getvalidationtoken, TestPlayViewModel testPlayViewModel) {
                    this.AudioAttributesCompatParcelizer = getvalidationtoken;
                    this.read = testPlayViewModel;
                }
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (new write(TestPlayViewModel.this.onFastForward, TestPlayViewModel.this).write(new AnonymousClass5(TestPlayViewModel.this), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$5, reason: invalid class name */
        static final class AnonymousClass5<T> implements getValidationToken {
            private /* synthetic */ TestPlayViewModel write;

            /* JADX INFO: renamed from: com.marrow2.ui.test.testplay.TestPlayViewModel$onPrepareFromMediaId$5$read */
            static final class read extends getTotalMcq {
                int AudioAttributesCompatParcelizer;
                private /* synthetic */ AnonymousClass5<T> AudioAttributesImplApi21Parcelizer;
                int AudioAttributesImplBaseParcelizer;
                long IconCompatParcelizer;
                /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
                Object RemoteActionCompatParcelizer;
                Object read;
                Object write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                read(AnonymousClass5<? super T> anonymousClass5, SampleVideos<? super read> sampleVideos) {
                    super(sampleVideos);
                    this.AudioAttributesImplApi21Parcelizer = anonymousClass5;
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.MediaBrowserCompatCustomActionResultReceiver = obj;
                    this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
                    return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0138, code lost:
            
                if (r1.AudioAttributesCompatParcelizer(r0, r2) == r3) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x01de, code lost:
            
                if (r1.AudioAttributesCompatParcelizer(r0, r2) == r3) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x022a, code lost:
            
                if (r4.AudioAttributesCompatParcelizer(r6, r2) == r3) goto L56;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
            @Override // kotlin.getValidationToken
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(kotlin.Pair<? extends kotlin.setTextEndPadding, java.lang.Long> r19, kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
                /*
                    Method dump skipped, instruction units count: 566
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onPrepareFromMediaId.AnonymousClass5.IconCompatParcelizer(o.getSubscriptionExpiresOn, o.SampleVideos):java.lang.Object");
            }

            AnonymousClass5(TestPlayViewModel testPlayViewModel) {
                this.write = testPlayViewModel;
            }
        }

        onPrepareFromMediaId(SampleVideos<? super onPrepareFromMediaId> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPrepareFromMediaId(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromMediaId) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int MediaDescriptionCompat;
        private boolean RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private long write;

        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

            static {
                int[] iArr = new int[getCStringLength.values().length];
                try {
                    iArr[getCStringLength.RemoteActionCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getCStringLength.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AudioAttributesCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0207, code lost:
        
            if (r12 != r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0400, code lost:
        
            if (r3.onPrepareFromMediaId() == r1) goto L96;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0101 A[PHI: r2
          0x0101: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v10 java.lang.Object) binds: [B:20:0x00ff, B:15:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[PHI: r2 r9 r11 r12
          0x016f: PHI (r2v24 com.marrow2.ui.test.testplay.TestPlayViewModel) = (r2v20 com.marrow2.ui.test.testplay.TestPlayViewModel), (r2v34 com.marrow2.ui.test.testplay.TestPlayViewModel) binds: [B:35:0x016d, B:13:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x016f: PHI (r9v11 long) = (r9v7 long), (r9v12 long) binds: [B:35:0x016d, B:13:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x016f: PHI (r11v5 java.util.List) = (r11v3 java.util.List), (r11v7 java.util.List) binds: [B:35:0x016d, B:13:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x016f: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v10 java.lang.Object) binds: [B:35:0x016d, B:13:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0186 A[LOOP:0: B:37:0x0180->B:39:0x0186, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x020e A[PHI: r9 r11
          0x020e: PHI (r9v15 long) = (r9v11 long), (r9v16 long) binds: [B:44:0x01a9, B:56:0x0209] A[DONT_GENERATE, DONT_INLINE]
          0x020e: PHI (r11v10 java.util.List) = (r11v5 java.util.List), (r11v11 java.util.List) binds: [B:44:0x01a9, B:56:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x030d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0320  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x033a  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x033d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x03b4  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03df A[PHI: r2 r9 r10 r11
          0x03df: PHI (r2v61 int) = (r2v59 int), (r2v64 int) binds: [B:86:0x03b2, B:90:0x03da] A[DONT_GENERATE, DONT_INLINE]
          0x03df: PHI (r9v27 int) = (r9v24 int), (r9v29 int) binds: [B:86:0x03b2, B:90:0x03da] A[DONT_GENERATE, DONT_INLINE]
          0x03df: PHI (r10v12 boolean) = (r10v10 boolean), (r10v13 boolean) binds: [B:86:0x03b2, B:90:0x03da] A[DONT_GENERATE, DONT_INLINE]
          0x03df: PHI (r11v28 long) = (r11v26 long), (r11v29 long) binds: [B:86:0x03b2, B:90:0x03da] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r42) {
            /*
                Method dump skipped, instruction units count: 1116
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.MediaDescriptionCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction() {
        this.IconCompatParcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaDescriptionCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.setHideMotionSpecResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(TestPlayViewModel testPlayViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testPlayViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        if (i == 502) {
            testPlayViewModel.write.write(setTextEndPaddingResource.onFastForward.INSTANCE);
        } else {
            testPlayViewModel.write.write(setTextEndPaddingResource.onPlayFromMediaId.INSTANCE);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.test.testplay.TestPlayViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.IconCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            com.marrow2.ui.test.testplay.TestPlayViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L48
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.crc32 r6 = r4.onPrepareFromSearch
            java.lang.String r2 = r4.onPrepare
            r0.AudioAttributesCompatParcelizer = r5
            r0.write = r3
            java.lang.Object r6 = r6.read(r2, r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            o.formatInvariant r6 = (kotlin.formatInvariant) r6
            o.setChipSpacing r0 = new o.setChipSpacing
            r0.<init>()
            if (r6 == 0) goto L6f
            long r1 = r6.IconCompatParcelizer()
            r0.write(r1)
            long r1 = r6.read()
            r0.RemoteActionCompatParcelizer(r1)
            long r1 = r6.MediaBrowserCompatCustomActionResultReceiver()
            r0.AudioAttributesImplApi21Parcelizer(r1)
            boolean r6 = r6.RemoteActionCompatParcelizer()
            if (r6 == 0) goto L6f
            r0.AudioAttributesImplApi21Parcelizer()
        L6f:
            r4.AudioAttributesImplBaseParcelizer = r0
            r4.MediaBrowserCompatItemReceiver = r5
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.RemoteActionCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        if (RemoteActionCompatParcelizer(r2, r3) != r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(int r33, kotlin.SampleVideos<? super java.lang.Boolean> r34) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.read(int, o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private long AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatSearchResultReceiver;
        private Object MediaDescriptionCompat;
        private boolean RatingCompat;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
        
            if (r13.write(r6, r8, r40) == r1) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x02c5, code lost:
        
            if (r3.onPrepareFromMediaId() == r1) goto L68;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00fe A[PHI: r2
          0x00fe: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v10 java.lang.Object) binds: [B:17:0x00fc, B:12:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0119 A[PHI: r2 r3 r4
          0x0119: PHI (r2v11 java.lang.String) = (r2v9 java.lang.String), (r2v14 java.lang.String) binds: [B:19:0x0117, B:11:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x0119: PHI (r3v6 java.util.List) = (r3v5 java.util.List), (r3v8 java.util.List) binds: [B:19:0x0117, B:11:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x0119: PHI (r4v6 java.lang.Object) = (r4v5 java.lang.Object), (r4v11 java.lang.Object) binds: [B:19:0x0117, B:11:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02c8  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instruction units count: 752
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatSearchResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        this.IconCompatParcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setHideMotionSpec
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.write(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(TestPlayViewModel testPlayViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testPlayViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        if (i == 502) {
            testPlayViewModel.write.write(setTextEndPaddingResource.onFastForward.INSTANCE);
        } else {
            testPlayViewModel.write.write(setTextEndPaddingResource.onPlayFromMediaId.INSTANCE);
        }
        return getShowPopup.INSTANCE;
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:21:0x00cc A[PHI: r2 r10
          0x00cc: PHI (r2v12 java.lang.Object) = (r2v11 java.lang.Object), (r2v24 java.lang.Object) binds: [B:20:0x00ca, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x00cc: PHI (r10v5 java.util.List) = (r10v4 java.util.List), (r10v9 java.util.List) binds: [B:20:0x00ca, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instruction units count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.MediaMetadataCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        this.IconCompatParcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.setMinLines
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(TestPlayViewModel testPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testPlayViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        testPlayViewModel.write.write(setTextEndPaddingResource.onPlayFromMediaId.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class onRemoveQueueItemAt extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private long IconCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
        
            if (r2 != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(1000, r28) == r1) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x012a -> B:12:0x002d). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onRemoveQueueItemAt.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onRemoveQueueItemAt(SampleVideos<? super onRemoveQueueItemAt> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onRemoveQueueItemAt(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onRemoveQueueItemAt) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPrepareFromMediaId() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onRemoveQueueItemAt(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconSizeResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSkipToQueueItem((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSkipToQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(setTextStartPaddingResource settextstartpaddingresource) {
        toMagicModuleMetaRepoModel.write(settextstartpaddingresource, "");
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.read) {
            setTextStartPaddingResource.read readVar = (setTextStartPaddingResource.read) settextstartpaddingresource;
            IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), readVar.RemoteActionCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.write) {
            onPlayFromUri(((setTextStartPaddingResource.write) settextstartpaddingresource).RemoteActionCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.IconCompatParcelizer) {
            setTextStartPaddingResource.IconCompatParcelizer iconCompatParcelizer = (setTextStartPaddingResource.IconCompatParcelizer) settextstartpaddingresource;
            RemoteActionCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.RemoteActionCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.RatingCompat) {
            setTextStartPaddingResource.RatingCompat ratingCompat = (setTextStartPaddingResource.RatingCompat) settextstartpaddingresource;
            int iIconCompatParcelizer = ratingCompat.IconCompatParcelizer();
            if (iIconCompatParcelizer != this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new handleMediaPlayPauseIfPendingOnHandler(iIconCompatParcelizer, null), new MagicModuleSubmissionRequestBody() { // from class: o.setIconStartPadding
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return TestPlayViewModel.onPrepare((String) obj2);
                    }
                });
            }
            AudioAttributesCompatParcelizer(ratingCompat.IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.AudioAttributesCompatParcelizer.INSTANCE)) {
            onAddQueueItem();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.MediaBrowserCompatItemReceiver.INSTANCE)) {
            onCommand();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.MediaDescriptionCompat.INSTANCE)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.handleMediaPlayPauseIfPendingOnHandler) {
            read(((setTextStartPaddingResource.handleMediaPlayPauseIfPendingOnHandler) settextstartpaddingresource).write());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.onCommand) {
            AudioAttributesCompatParcelizer(((setTextStartPaddingResource.onCommand) settextstartpaddingresource).IconCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.onCustomAction) {
            IconCompatParcelizer(((setTextStartPaddingResource.onCustomAction) settextstartpaddingresource).RemoteActionCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            AudioAttributesCompatParcelizer(((setTextStartPaddingResource.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) settextstartpaddingresource).AudioAttributesCompatParcelizer());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.onAddQueueItem) {
            write(((setTextStartPaddingResource.onAddQueueItem) settextstartpaddingresource).IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.onPlayFromMediaId.INSTANCE)) {
            onPlay();
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.AudioAttributesImplApi26Parcelizer) {
            write(((setTextStartPaddingResource.AudioAttributesImplApi26Parcelizer) settextstartpaddingresource).read());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.MediaBrowserCompatCustomActionResultReceiver) {
            AudioAttributesCompatParcelizer(((setTextStartPaddingResource.MediaBrowserCompatCustomActionResultReceiver) settextstartpaddingresource).read());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.AudioAttributesImplApi21Parcelizer) {
            write(((setTextStartPaddingResource.AudioAttributesImplApi21Parcelizer) settextstartpaddingresource).read());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.onPlay.INSTANCE)) {
            handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.MediaMetadataCompat.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextstartpaddingresource, setTextStartPaddingResource.RemoteActionCompatParcelizer.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.MediaBrowserCompatSearchResultReceiver) {
            String str = this.onPrepare;
            setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
            setTextStartPaddingResource.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = (setTextStartPaddingResource.MediaBrowserCompatSearchResultReceiver) settextstartpaddingresource;
            RemoteActionCompatParcelizer(str, setsingleline != null ? setsingleline.getRemoteActionCompatParcelizer() : null, mediaBrowserCompatSearchResultReceiver.read().getRemoteActionCompatParcelizer(), mediaBrowserCompatSearchResultReceiver.write());
            return;
        }
        if (settextstartpaddingresource instanceof setTextStartPaddingResource.MediaMetadataCompat) {
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            String str2 = this.onPrepare;
            setSingleLine setsingleline2 = this.AudioAttributesCompatParcelizer;
            String remoteActionCompatParcelizer = setsingleline2 != null ? setsingleline2.getRemoteActionCompatParcelizer() : null;
            isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(str2, remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer : "", ((setTextStartPaddingResource.MediaMetadataCompat) settextstartpaddingresource).read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (!(settextstartpaddingresource instanceof setTextStartPaddingResource.MediaBrowserCompatMediaItem)) {
            throw new RenewEligibleCreator();
        }
        RemoteActionCompatParcelizer(((setTextStartPaddingResource.MediaBrowserCompatMediaItem) settextstartpaddingresource).write());
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (TestPlayViewModel.this.write(this.read, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestPlayViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.read;
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        handleMediaPlayPauseIfPendingOnHandler(int i, SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(1, sampleVideos);
            this.read = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new handleMediaPlayPauseIfPendingOnHandler(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetShuffleMode(String str) {
        setChipSpacing setchipspacing;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) str) || (setchipspacing = this.AudioAttributesImplBaseParcelizer) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - setchipspacing.getAudioAttributesCompatParcelizer();
        if (!setchipspacing.getWrite()) {
            setchipspacing.read(jCurrentTimeMillis);
        } else {
            setchipspacing.AudioAttributesCompatParcelizer(jCurrentTimeMillis);
        }
        setchipspacing.AudioAttributesImplApi26Parcelizer();
        onRemoveQueueItem(str);
    }

    private final void onRemoveQueueItem(String str) {
        setChipSpacing setchipspacing;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) str) || (setchipspacing = this.AudioAttributesImplBaseParcelizer) == null) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepareFromSearch(setchipspacing, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconVisible
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSetRepeatMode((String) obj2);
            }
        });
    }

    static final class onPrepareFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ setChipSpacing IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                crc32 crc32Var = TestPlayViewModel.this.onPrepareFromSearch;
                String onPrepare = TestPlayViewModel.this.getOnPrepare();
                long remoteActionCompatParcelizer = this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
                long iconCompatParcelizer = this.IconCompatParcelizer.getIconCompatParcelizer();
                long read = this.IconCompatParcelizer.getRead();
                boolean write = this.IconCompatParcelizer.getWrite();
                this.AudioAttributesCompatParcelizer = 1;
                if (crc32Var.AudioAttributesCompatParcelizer(new formatInvariant(onPrepare, this.read, remoteActionCompatParcelizer, read, iconCompatParcelizer, write), this) == objIconCompatParcelizer) {
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
        onPrepareFromSearch(setChipSpacing setchipspacing, String str, SampleVideos<? super onPrepareFromSearch> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = setchipspacing;
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPrepareFromSearch(this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetRepeatMode(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final String AudioAttributesImplApi26Parcelizer() {
        return (String) IntermediateLoginResponseBody.read((List) this.onPrepareFromMediaId.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(), this.onPrepareFromMediaId.IconCompatParcelizer().getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object write(int i, SampleVideos<? super getShowPopup> sampleVideos) {
        List<String> listMediaBrowserCompatCustomActionResultReceiver = this.onPrepareFromMediaId.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
        String str = (String) IntermediateLoginResponseBody.read((List) listMediaBrowserCompatCustomActionResultReceiver, i);
        if (str != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) this.MediaBrowserCompatItemReceiver)) {
            String str2 = (String) IntermediateLoginResponseBody.read((List) listMediaBrowserCompatCustomActionResultReceiver, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (str2 != null) {
                onSetShuffleMode(str2);
            }
            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(String str, String str2, String str3, AppMeasurementConditionalUserProperty appMeasurementConditionalUserProperty) {
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        interceptEvent interceptevent = interceptEvent.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(str, str2, str3, appMeasurementConditionalUserProperty), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    static final class onFastForward extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (TestPlayViewModel.this.onPrepareFromSearch.AudioAttributesImplBaseParcelizer(this) == objIconCompatParcelizer) {
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

        onFastForward(SampleVideos<? super onFastForward> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onFastForward(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onFastForward) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        getResolutionSize<getHeader> getresolutionsize = this.read;
        getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onFastForward(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconStartPadding
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPrepareFromUri((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromUri(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void write(anyIgnorals.read readVar) {
        String strAudioAttributesImplApi26Parcelizer;
        setChipSpacing setchipspacing;
        String strAudioAttributesImplApi26Parcelizer2;
        if (this.onCustomAction == readBlockToCache.IconCompatParcelizer || this.onCustomAction == readBlockToCache.AudioAttributesCompatParcelizer) {
            return;
        }
        int i = AudioAttributesCompatParcelizer.write[readVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                onFastForward();
                if ((this.read.IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver() instanceof getEndTimestamp.IconCompatParcelizer) && (strAudioAttributesImplApi26Parcelizer2 = AudioAttributesImplApi26Parcelizer()) != null) {
                    onSetShuffleMode(strAudioAttributesImplApi26Parcelizer2);
                }
                this.onFastForward.write(setTextEndPadding.write.INSTANCE);
                return;
            }
            return;
        }
        this.onPlayFromSearch.write(this.onPrepare);
        if ((this.read.IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver() instanceof getEndTimestamp.IconCompatParcelizer) && (strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer()) != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) strAudioAttributesImplApi26Parcelizer) && (setchipspacing = this.AudioAttributesImplBaseParcelizer) != null) {
            setchipspacing.AudioAttributesImplApi26Parcelizer();
        }
        this.onFastForward.write(setTextEndPadding.RemoteActionCompatParcelizer.INSTANCE);
    }

    private final void AudioAttributesCompatParcelizer(setTextEndPaddingResource settextendpaddingresource) {
        if (settextendpaddingresource instanceof setTextEndPaddingResource.read) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.onCustomAction) {
            if (this.onCustomAction == readBlockToCache.AudioAttributesCompatParcelizer) {
                onPlayFromSearch();
                return;
            } else {
                onPlayFromUri();
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onCommand.INSTANCE)) {
            this.write.write(new setTextEndPaddingResource.MediaBrowserCompatMediaItem(this.onPrepare, true, null, 4, null));
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            onPlayFromUri();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onMediaButtonEvent.INSTANCE)) {
            onPlayFromUri();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onPlayFromMediaId.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onFastForward.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            onCustomAction();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.handleMediaPlayPauseIfPendingOnHandler.INSTANCE)) {
            MediaBrowserCompatMediaItem();
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.onAddQueueItem) {
            onPlayFromMediaId();
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.MediaBrowserCompatItemReceiver) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.setShowMotionSpecResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestPlayViewModel.onFastForward((String) obj2);
                }
            });
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.AudioAttributesImplBaseParcelizer) {
            this.write.write(new setTextEndPaddingResource.MediaBrowserCompatMediaItem(this.onPrepare, true, ((setTextEndPaddingResource.AudioAttributesImplBaseParcelizer) settextendpaddingresource).AudioAttributesCompatParcelizer()));
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.write) {
            onPlayFromUri();
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.AudioAttributesCompatParcelizer) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            AudioAttributesCompatParcelizer(AppMeasurementEventInterceptor.read);
        } else if (settextendpaddingresource instanceof setTextEndPaddingResource.RemoteActionCompatParcelizer) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TestPlayViewModel.this.write.write(setTextEndPaddingResource.AudioAttributesImplApi26Parcelizer.INSTANCE);
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(100L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestPlayViewModel.this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onFastForward(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void write(setTextEndPaddingResource settextendpaddingresource) {
        if (settextendpaddingresource instanceof setTextEndPaddingResource.read) {
            int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[this.onCustomAction.ordinal()];
            if (i == 1) {
                write(true, true);
                return;
            } else if (i == 2) {
                MediaBrowserCompatCustomActionResultReceiver();
                return;
            } else {
                this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
                AudioAttributesCompatParcelizer(write.read);
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.onCustomAction) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.write.write(setTextEndPaddingResource.onMediaButtonEvent.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onMediaButtonEvent.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.onFastForward.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.handleMediaPlayPauseIfPendingOnHandler.INSTANCE)) {
            if (this.onPlayFromUri) {
                this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
                return;
            } else {
                this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
                this.onPlay = false;
                return;
            }
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.onAddQueueItem) {
            if (this.onPlayFromUri) {
                this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
                return;
            } else {
                this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(settextendpaddingresource, setTextEndPaddingResource.MediaBrowserCompatItemReceiver.INSTANCE)) {
            this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.write) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.AudioAttributesCompatParcelizer) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            long minutes = TimeUnit.MILLISECONDS.toMinutes(MediaDescriptionCompat());
            this.write.write(new setTextEndPaddingResource.RemoteActionCompatParcelizer(minutes));
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            String str = this.onPrepare;
            setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
            String remoteActionCompatParcelizer = setsingleline != null ? setsingleline.getRemoteActionCompatParcelizer() : null;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = "";
            }
            isseekpending.write(interceptEvent.IconCompatParcelizer(str, remoteActionCompatParcelizer, minutes), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (settextendpaddingresource instanceof setTextEndPaddingResource.RemoteActionCompatParcelizer) {
            this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setShowMotionSpec
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestPlayViewModel.onPause((String) obj2);
                }
            });
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0182, code lost:
        
            if (r5.read(r2, r29) != r1) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fe A[LOOP:0: B:34:0x00f8->B:36:0x00fe, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPause(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = TestPlayViewModel.this.RemoteActionCompatParcelizer;
                onScrollChange onscrollchange = onScrollChange.INSTANCE;
                isseekpending.write(onScrollChange.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.IconCompatParcelizer = 1;
                if (TestPlayViewModel.this.AudioAttributesImplApi21Parcelizer.read(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestPlayViewModel.this.write.write(setTextEndPaddingResource.MediaBrowserCompatSearchResultReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEllipsize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onMediaButtonEvent((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onPlayFromMediaId() {
        this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        write(this.RatingCompat, this.MediaDescriptionCompat);
        AudioAttributesCompatParcelizer(write.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        write(false, true);
        AudioAttributesCompatParcelizer(write.AudioAttributesCompatParcelizer);
    }

    private final void onPlayFromUri() {
        this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        write(false, false);
        AudioAttributesCompatParcelizer(write.AudioAttributesCompatParcelizer);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.write.write(setTextEndPaddingResource.MediaDescriptionCompat.INSTANCE);
        write(true, false);
        AudioAttributesCompatParcelizer(write.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long MediaDescriptionCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver - System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.test.testplay.TestPlayViewModel$MediaBrowserCompatItemReceiver r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.RemoteActionCompatParcelizer
            int r8 = r8 + r2
            r0.RemoteActionCompatParcelizer = r8
            goto L19
        L14:
            com.marrow2.ui.test.testplay.TestPlayViewModel$MediaBrowserCompatItemReceiver r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L42
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.crc32 r8 = r7.onPrepareFromSearch
            java.lang.String r2 = r7.onPrepare
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r2, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L4d:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r8.next()
            o.dropTable r4 = (kotlin.dropTable) r4
            boolean r5 = r4.getAudioAttributesImplBaseParcelizer()
            int r4 = r4.getMediaBrowserCompatCustomActionResultReceiver()
            if (r4 == 0) goto L65
            r4 = r3
            goto L66
        L65:
            r4 = r0
        L66:
            com.marrow.data.models.test.TestIndex r6 = r7.onMediaButtonEvent
            if (r6 == 0) goto L77
            if (r6 != 0) goto L72
            java.lang.String r6 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r6 = 0
        L72:
            boolean r6 = kotlin.getAudioUsageForStreamType.IconCompatParcelizer(r6)
            goto L78
        L77:
            r6 = r0
        L78:
            if (r5 == 0) goto L7c
            int r2 = r2 + 1
        L7c:
            if (r4 != 0) goto L81
        L7e:
            int r1 = r1 + 1
            goto L4d
        L81:
            if (r6 == 0) goto L4d
            if (r5 == 0) goto L4d
            goto L7e
        L86:
            o.getSubscriptionExpiresOn r7 = new o.getSubscriptionExpiresOn
            java.lang.Integer r8 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r1)
            java.lang.Integer r0 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r2)
            r7.<init>(r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi26Parcelizer r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi26Parcelizer r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi26Parcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L42
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.crc32 r6 = r5.onPrepareFromSearch
            java.lang.String r5 = r5.onPrepare
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.util.List r6 = (java.util.List) r6
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L4e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r5.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L5f
            kotlin.IntermediateLoginResponseBody.read()
        L5f:
            o.dropTable r3 = (kotlin.dropTable) r3
            int r3 = r3.getMediaBrowserCompatCustomActionResultReceiver()
            if (r3 == 0) goto L71
            int r1 = r6.size()
            if (r4 == r1) goto L6f
            r1 = r4
            goto L73
        L6f:
            r1 = r2
            goto L73
        L71:
            int r0 = r0 + 1
        L73:
            r2 = r4
            goto L4e
        L75:
            o.getSubscriptionExpiresOn r5 = new o.getSubscriptionExpiresOn
            java.lang.Integer r6 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r0)
            java.lang.Integer r0 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r1)
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setDouble RemoteActionCompatParcelizer(int i, dropTable droptable, int i2) {
        if (IconCompatParcelizer(i, i2)) {
            return setDouble.read;
        }
        return droptable.getMediaBrowserCompatCustomActionResultReceiver() != 0 ? setDouble.IconCompatParcelizer : setDouble.RemoteActionCompatParcelizer;
    }

    private final void IconCompatParcelizer(String str, int i) {
        setChipSpacing setchipspacing;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) str) && (setchipspacing = this.AudioAttributesImplBaseParcelizer) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - setchipspacing.getAudioAttributesCompatParcelizer();
            if (!setchipspacing.getWrite()) {
                setchipspacing.read(jCurrentTimeMillis);
            } else {
                setchipspacing.IconCompatParcelizer(jCurrentTimeMillis);
            }
            setchipspacing.AudioAttributesImplApi21Parcelizer();
            setchipspacing.AudioAttributesImplApi26Parcelizer();
        }
        if (IconCompatParcelizer(this.read.IconCompatParcelizer().getRead(), this.read.IconCompatParcelizer().read().size())) {
            getResolutionSize<getHeader> getresolutionsize = this.read;
            getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : setDouble.read, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        } else {
            getResolutionSize<getHeader> getresolutionsize2 = this.read;
            getHeader getheaderIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : setDouble.IconCompatParcelizer, (122879 & 2) != 0 ? getheaderIconCompatParcelizer2.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer2.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer2.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer2.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer2.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer2.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer2.MediaDescriptionCompat : null));
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCustomAction(str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.setInternalOnCheckedChangeListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPrepareFromSearch((String) obj2);
            }
        });
    }

    static final class onCustomAction extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (r6.RemoteActionCompatParcelizer.onCommand.write(r6.RemoteActionCompatParcelizer.getOnPrepare(), r6.read, r6.AudioAttributesCompatParcelizer, r6) == r0) goto L17;
         */
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L50
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L34
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r1 = r6.read
                java.lang.String r4 = r7.getOnPrepare()
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.IconCompatParcelizer = r3
                java.lang.Object r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesCompatParcelizer(r7, r1, r4, r5)
                if (r7 == r0) goto L5a
            L34:
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplBaseParcelizer(r7)
                com.marrow2.ui.test.testplay.TestPlayViewModel r1 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r1 = r1.getOnPrepare()
                java.lang.String r3 = r6.read
                int r4 = r6.AudioAttributesCompatParcelizer
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.IconCompatParcelizer = r2
                java.lang.Object r7 = r7.write(r1, r3, r4, r5)
                if (r7 != r0) goto L50
                goto L5a
            L50:
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r6 = r6.read
                com.marrow2.ui.test.testplay.TestPlayViewModel.write(r7, r6)
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L5a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onCustomAction.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCustomAction(String str, int i, SampleVideos<? super onCustomAction> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onCustomAction(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromSearch(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final boolean IconCompatParcelizer(int i, int i2) {
        boolean z = i + 1 == i2;
        setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
        return setsingleline != null ? (setsingleline.getRead() + i) + 1 == i2 : z;
    }

    private final void onPlayFromUri(String str) {
        setChipSpacing setchipspacing;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) str) && (setchipspacing = this.AudioAttributesImplBaseParcelizer) != null) {
            setchipspacing.IconCompatParcelizer(System.currentTimeMillis() - setchipspacing.getAudioAttributesCompatParcelizer());
            setchipspacing.AudioAttributesImplApi26Parcelizer();
        }
        if (IconCompatParcelizer(this.read.IconCompatParcelizer().getRead(), this.read.IconCompatParcelizer().read().size())) {
            getResolutionSize<getHeader> getresolutionsize = this.read;
            getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : setDouble.read, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        } else {
            getResolutionSize<getHeader> getresolutionsize2 = this.read;
            getHeader getheaderIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : setDouble.RemoteActionCompatParcelizer, (122879 & 2) != 0 ? getheaderIconCompatParcelizer2.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer2.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer2.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer2.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer2.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer2.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer2.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer2.MediaDescriptionCompat : null));
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPause(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.setLines
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onRemoveQueueItemAt((String) obj2);
            }
        });
    }

    static final class onPause extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            if (r6.write.onCommand.write(r6.write.getOnPrepare(), r6.IconCompatParcelizer, 0, r6) == r0) goto L17;
         */
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
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L34
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r1 = r6.IconCompatParcelizer
                java.lang.String r4 = r7.getOnPrepare()
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.read = r3
                java.lang.Object r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesCompatParcelizer(r7, r1, r4, r5)
                if (r7 == r0) goto L59
            L34:
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplBaseParcelizer(r7)
                com.marrow2.ui.test.testplay.TestPlayViewModel r1 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r1 = r1.getOnPrepare()
                java.lang.String r3 = r6.IconCompatParcelizer
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r6.read = r2
                r2 = 0
                java.lang.Object r7 = r7.write(r1, r3, r2, r4)
                if (r7 != r0) goto L4f
                goto L59
            L4f:
                com.marrow2.ui.test.testplay.TestPlayViewModel r7 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                java.lang.String r6 = r6.IconCompatParcelizer
                com.marrow2.ui.test.testplay.TestPlayViewModel.write(r7, r6)
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L59:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onPause.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPause(String str, SampleVideos<? super onPause> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPause(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPause) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRemoveQueueItemAt(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r5, java.lang.String r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.onPlayFromMediaId
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.test.testplay.TestPlayViewModel$onPlayFromMediaId r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.onPlayFromMediaId) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.ui.test.testplay.TestPlayViewModel$onPlayFromMediaId r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$onPlayFromMediaId
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r5 = r0.write
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4b
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.NetworkTypeObserverApi31DisplayInfoCallback r7 = r4.onCommand
            r0.write = r5
            r2 = 0
            r0.IconCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r7.read(r6, r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            o.dropTable r7 = (kotlin.dropTable) r7
            int r6 = r7.getRemoteActionCompatParcelizer()
            if (r6 == 0) goto L54
            r3 = 0
        L54:
            o.getResolutionSize<o.setTextEndPadding> r4 = r4.onFastForward
            o.setTextEndPadding$AudioAttributesCompatParcelizer r6 = new o.setTextEndPadding$AudioAttributesCompatParcelizer
            r6.<init>(r5, r3)
            r4.write(r6)
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.write(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    static final class onCommand extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ boolean read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (TestPlayViewModel.this.onCommand.IconCompatParcelizer(TestPlayViewModel.this.getOnPrepare(), this.IconCompatParcelizer, this.read, this) == objIconCompatParcelizer) {
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
        onCommand(String str, boolean z, SampleVideos<? super onCommand> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.read = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onCommand(this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String str, boolean z) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCommand(str, z, null), new MagicModuleSubmissionRequestBody() { // from class: o.setIconEndPadding
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPrepareFromMediaId((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromMediaId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(boolean z) {
        if (this.onCustomAction == readBlockToCache.IconCompatParcelizer) {
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            zzbV zzbv = zzbV.INSTANCE;
            isseekpending.write(zzbV.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
        getResolutionSize<getHeader> getresolutionsize = this.read;
        getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : z, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onMediaButtonEvent(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconSize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSeekTo((String) obj2);
            }
        });
    }

    static final class onMediaButtonEvent extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                List<String> listMediaBrowserCompatCustomActionResultReceiver = ((getHeader) TestPlayViewModel.this.read.IconCompatParcelizer()).MediaBrowserCompatCustomActionResultReceiver();
                int read = ((getHeader) TestPlayViewModel.this.read.IconCompatParcelizer()).getRead();
                String str = listMediaBrowserCompatCustomActionResultReceiver.get(read);
                this.write = null;
                this.IconCompatParcelizer = null;
                this.RemoteActionCompatParcelizer = read;
                this.read = 1;
                if (TestPlayViewModel.this.onCommand.RemoteActionCompatParcelizer(TestPlayViewModel.this.getOnPrepare(), str, this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        onMediaButtonEvent(boolean z, SampleVideos<? super onMediaButtonEvent> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onMediaButtonEvent(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onMediaButtonEvent) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSeekTo(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void write(setDouble setdouble) {
        if (AudioAttributesCompatParcelizer.IconCompatParcelizer[setdouble.ordinal()] == 1) {
            AudioAttributesCompatParcelizer(AppMeasurementDynamiteService.write);
        } else {
            AudioAttributesCompatParcelizer(this.onPrepareFromMediaId.IconCompatParcelizer().getRead() + 1);
        }
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
        
            if (r2 != r1) goto L24;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i, SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconTintResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPlayFromSearch((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onAddQueueItem() {
        getResolutionSize<getHeader> getresolutionsize = this.read;
        getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : !this.read.IconCompatParcelizer().getWrite(), (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        setChipSpacing setchipspacing;
        getResolutionSize<getHeader> getresolutionsize = this.read;
        getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : getEndTimestamp.IconCompatParcelizer.INSTANCE, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (strAudioAttributesImplApi26Parcelizer == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) strAudioAttributesImplApi26Parcelizer) || (setchipspacing = this.AudioAttributesImplBaseParcelizer) == null) {
            return;
        }
        setchipspacing.AudioAttributesImplApi26Parcelizer();
    }

    private final void read(int i) {
        AudioAttributesCompatParcelizer(i);
    }

    static final class onPlay extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ AppMeasurementEventInterceptor IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objAudioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                objAudioAttributesCompatParcelizer = TestPlayViewModel.this.onPrepareFromSearch.AudioAttributesCompatParcelizer(TestPlayViewModel.this.getOnPrepare(), this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                objAudioAttributesCompatParcelizer = obj;
            }
            List list = (List) objAudioAttributesCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                if (i2 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                dropTable droptable = (dropTable) obj2;
                arrayList.add(new setMoney(i2, droptable.getMediaBrowserCompatCustomActionResultReceiver() != 0, droptable.getAudioAttributesImplBaseParcelizer()));
                i2++;
            }
            ArrayList arrayListSubList = arrayList;
            setSingleLine setsingleline = TestPlayViewModel.this.AudioAttributesCompatParcelizer;
            if (setsingleline != null) {
                arrayListSubList = arrayListSubList.subList(setsingleline.getRead(), setsingleline.getMediaBrowserCompatCustomActionResultReceiver());
            }
            isSeekPending isseekpending = TestPlayViewModel.this.RemoteActionCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            String onPrepare = TestPlayViewModel.this.getOnPrepare();
            setSingleLine setsingleline2 = TestPlayViewModel.this.AudioAttributesCompatParcelizer;
            String remoteActionCompatParcelizer = setsingleline2 != null ? setsingleline2.getRemoteActionCompatParcelizer() : null;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = "";
            }
            isseekpending.write(interceptEvent.write(onPrepare, remoteActionCompatParcelizer, this.IconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            getResolutionSize getresolutionsize = TestPlayViewModel.this.read;
            getHeader getheader = (getHeader) TestPlayViewModel.this.read.IconCompatParcelizer();
            getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheader.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheader.onCommand : 0, (122879 & 4) != 0 ? getheader.read : 0, (122879 & 8) != 0 ? getheader.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheader.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheader.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheader.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheader.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheader.MediaBrowserCompatSearchResultReceiver : new getEndTimestamp.write(arrayListSubList), (122879 & 512) != 0 ? getheader.write : false, (122879 & 1024) != 0 ? getheader.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheader.RatingCompat : false, (122879 & 4096) != 0 ? getheader.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheader.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheader.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheader.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheader.MediaDescriptionCompat : null));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlay(AppMeasurementEventInterceptor appMeasurementEventInterceptor, SampleVideos<? super onPlay> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = appMeasurementEventInterceptor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPlay(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlay) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(AppMeasurementEventInterceptor appMeasurementEventInterceptor) {
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (strAudioAttributesImplApi26Parcelizer != null) {
            onSetShuffleMode(strAudioAttributesImplApi26Parcelizer);
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlay(appMeasurementEventInterceptor, null), new MagicModuleSubmissionRequestBody() { // from class: o.setEnsureMinTouchTargetSize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onRewind((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRewind(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ AppMeasurementDynamiteService AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int read;

        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(AppMeasurementDynamiteService appMeasurementDynamiteService, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = appMeasurementDynamiteService;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(AppMeasurementDynamiteService appMeasurementDynamiteService) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(appMeasurementDynamiteService, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconEndPaddingResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPlayFromMediaId((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onRemoveQueueItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = TestPlayViewModel.this.RemoteActionCompatParcelizer;
                onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
                isseekpending.write(onConnectionFailed.RemoteActionCompatParcelizer(true), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.AudioAttributesCompatParcelizer = 1;
                if (TestPlayViewModel.this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(TestPlayViewModel.this.getOnPrepare(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestPlayViewModel.this.write.write(new setTextEndPaddingResource.MediaBrowserCompatMediaItem(TestPlayViewModel.this.getOnPrepare(), false, null, 4, null));
            return getShowPopup.INSTANCE;
        }

        onRemoveQueueItem(SampleVideos<? super onRemoveQueueItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onRemoveQueueItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onRemoveQueueItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPlayFromSearch() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onRemoveQueueItem(null), new MagicModuleSubmissionRequestBody() { // from class: o.setIconStartPaddingResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.MediaBrowserCompatItemReceiver(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(TestPlayViewModel testPlayViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 405) {
            testPlayViewModel.MediaBrowserCompatSearchResultReceiver();
        } else {
            testPlayViewModel.write.write(new setTextEndPaddingResource.RatingCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            if (r1.IconCompatParcelizer(r6, r5) == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.read
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L6d
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L52
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L39
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.test.testplay.TestPlayViewModel r6 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r6 = com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatCustomActionResultReceiver(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.read = r4
                java.lang.Object r6 = r6.AudioAttributesImplApi21Parcelizer(r1)
                if (r6 == r0) goto L7b
            L39:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L6d
                com.marrow2.ui.test.testplay.TestPlayViewModel r6 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r6 = com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatCustomActionResultReceiver(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.read = r3
                java.lang.Object r6 = r6.read(r1)
                if (r6 == r0) goto L7b
            L52:
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L6d
                com.marrow2.ui.test.testplay.TestPlayViewModel r1 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.resetForTests r1 = com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplApi21Parcelizer(r1)
                r3 = 0
                r5.AudioAttributesCompatParcelizer = r3
                r5.write = r3
                r3 = 0
                r5.RemoteActionCompatParcelizer = r3
                r5.read = r2
                java.lang.Object r6 = r1.IconCompatParcelizer(r6, r5)
                if (r6 != r0) goto L6d
                goto L7b
            L6d:
                com.marrow2.ui.test.testplay.TestPlayViewModel r5 = com.marrow2.ui.test.testplay.TestPlayViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.test.testplay.TestPlayViewModel.onFastForward(r5)
                o.setTextEndPaddingResource$onCommand r6 = o.setTextEndPaddingResource.onCommand.INSTANCE
                r5.write(r6)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L7b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.MediaBrowserCompatMediaItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconContentDescription
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.MediaBrowserCompatItemReceiver(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(TestPlayViewModel testPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testPlayViewModel.write.write(new setTextEndPaddingResource.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    private final void onCommand() {
        getResolutionSize<getHeader> getresolutionsize = this.read;
        getHeader getheaderIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getHeader.AudioAttributesCompatParcelizer((122879 & 1) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (122879 & 2) != 0 ? getheaderIconCompatParcelizer.onCommand : 0, (122879 & 4) != 0 ? getheaderIconCompatParcelizer.read : 0, (122879 & 8) != 0 ? getheaderIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : 0L, (122879 & 16) != 0 ? getheaderIconCompatParcelizer.IconCompatParcelizer : false, (122879 & 32) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatMediaItem : false, (122879 & 64) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (122879 & 128) != 0 ? getheaderIconCompatParcelizer.MediaMetadataCompat : null, (122879 & 256) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (122879 & 512) != 0 ? getheaderIconCompatParcelizer.write : false, (122879 & 1024) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (122879 & 2048) != 0 ? getheaderIconCompatParcelizer.RatingCompat : false, (122879 & 4096) != 0 ? getheaderIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (122879 & 8192) != 0 ? getheaderIconCompatParcelizer.RemoteActionCompatParcelizer : null, (122879 & 16384) != 0 ? getheaderIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (122879 & 32768) != 0 ? getheaderIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (122879 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? getheaderIconCompatParcelizer.MediaDescriptionCompat : null));
        int i = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[this.onCustomAction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                MediaBrowserCompatCustomActionResultReceiver();
                return;
            } else {
                this.write.write(setTextEndPaddingResource.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                return;
            }
        }
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        interceptEvent interceptevent = interceptEvent.INSTANCE;
        isseekpending.write(interceptEvent.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        write(true, true);
    }

    private final void onPlay() {
        this.write.write(new setTextEndPaddingResource.read(this.onCustomAction));
    }

    private final void RemoteActionCompatParcelizer(AppMeasurementConditionalUserProperty appMeasurementConditionalUserProperty) {
        int iRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List<? extends setSingleLine>) this.onPlayFromMediaId, this.AudioAttributesCompatParcelizer);
        String remoteActionCompatParcelizer = iRemoteActionCompatParcelizer < this.onPlayFromMediaId.size() + (-1) ? this.onPlayFromMediaId.get(iRemoteActionCompatParcelizer + 1).getRemoteActionCompatParcelizer() : null;
        String str = this.onPrepare;
        setSingleLine setsingleline = this.AudioAttributesCompatParcelizer;
        RemoteActionCompatParcelizer(str, setsingleline != null ? setsingleline.getRemoteActionCompatParcelizer() : null, remoteActionCompatParcelizer, appMeasurementConditionalUserProperty);
        this.write.write(setTextEndPaddingResource.AudioAttributesCompatParcelizer.INSTANCE);
    }

    private final void onPause() {
        String str = (String) IntermediateLoginResponseBody.read((List) this.onPrepareFromMediaId.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(), this.onPrepareFromMediaId.IconCompatParcelizer().getRead());
        if (str == null) {
            return;
        }
        onSetShuffleMode(str);
    }

    private final void write(boolean z, boolean z2) {
        onPause();
        this.onFastForward.write(setTextEndPadding.write.INSTANCE);
        this.RatingCompat = z;
        this.MediaDescriptionCompat = z2;
        this.IconCompatParcelizer.write(Boolean.TRUE);
        this.onPlay = true;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onSeekTo(this.onCustomAction == readBlockToCache.IconCompatParcelizer, z, this, parseEac3SupplementalProperties.write(new Date().getTime(), "dd-MM-yyyy HH:mm"), z2, null), new MagicModuleSubmissionRequestBody() { // from class: o.setIconEndPaddingResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.AudioAttributesImplApi26Parcelizer(this.write, (String) obj2);
            }
        });
    }

    static final class onSeekTo extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ TestPlayViewModel MediaBrowserCompatItemReceiver;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ boolean write;

        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] read;

            static {
                int[] iArr = new int[getAttributeArrayLocationAndEnable.values().length];
                try {
                    iArr[getAttributeArrayLocationAndEnable.RemoteActionCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getAttributeArrayLocationAndEnable.IconCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getAttributeArrayLocationAndEnable.AudioAttributesCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[getAttributeArrayLocationAndEnable.write.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[getAttributeArrayLocationAndEnable.read.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                read = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
        
            if (r14.MediaBrowserCompatItemReceiver.onPrepareFromSearch.write(r14.MediaBrowserCompatItemReceiver.getOnPrepare(), r14) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
        
            if (r14.MediaBrowserCompatItemReceiver.onPrepareFromSearch.write(r14.MediaBrowserCompatItemReceiver.getOnPrepare(), r14) == r0) goto L61;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.onSeekTo.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onSeekTo(boolean z, boolean z2, TestPlayViewModel testPlayViewModel, String str, boolean z3, SampleVideos<? super onSeekTo> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = z2;
            this.MediaBrowserCompatItemReceiver = testPlayViewModel;
            this.IconCompatParcelizer = str;
            this.write = z3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new onSeekTo(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onSeekTo) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(TestPlayViewModel testPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testPlayViewModel.onFastForward.write(setTextEndPadding.RemoteActionCompatParcelizer.INSTANCE);
        testPlayViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        testPlayViewModel.onPlay = false;
        testPlayViewModel.write.write(new setTextEndPaddingResource.onAddQueueItem(str));
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromUri extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize = TestPlayViewModel.this.read;
                final TestPlayViewModel testPlayViewModel = TestPlayViewModel.this;
                this.RemoteActionCompatParcelizer = 1;
                if (getresolutionsize.write(new getValidationToken() { // from class: com.marrow2.ui.test.testplay.TestPlayViewModel.onPlayFromUri.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((getHeader) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(getHeader getheader) {
                        if (getheader.getRead() != testPlayViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                            testPlayViewModel.onFastForward.write(new setTextEndPadding.IconCompatParcelizer(testPlayViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                            testPlayViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getheader.getRead();
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

        onPlayFromUri(SampleVideos<? super onPlayFromUri> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPlayFromUri(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromUri) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        TestPlayViewModel testPlayViewModel = this;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(testPlayViewModel), new onPlayFromUri(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconTint
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSetPlaybackSpeed((String) obj2);
            }
        });
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(testPlayViewModel), new onPrepareFromMediaId(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconStartPaddingResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSkipToPrevious((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetPlaybackSpeed(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSkipToPrevious(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ long IconCompatParcelizer;
        private /* synthetic */ long read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = TestPlayViewModel.this.onPrepareFromSearch.read(TestPlayViewModel.this.getOnPrepare(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestIndex testIndex = (TestIndex) obj;
            long jWrite = TestPlayViewModel.write(testIndex);
            long jCurrentTimeMillis = System.currentTimeMillis() - testIndex.getUserStartedTimestamp();
            if (jWrite > 0) {
                TestPlayViewModel.this.onPlayFromSearch.read(jWrite, TestPlayViewModel.this.getOnPrepare());
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) testIndex.getTestType(), (Object) "grand")) {
                if (jCurrentTimeMillis > this.IconCompatParcelizer && TestPlayViewModel.this.onPlayFromMediaId.isEmpty()) {
                    TestPlayViewModel.this.onPlayFromSearch.write(this.IconCompatParcelizer - jCurrentTimeMillis, TestPlayViewModel.this.getOnPrepare());
                }
                if (jWrite > this.read) {
                    TestPlayViewModel.this.onPlayFromSearch.write(jWrite - this.read, TestPlayViewModel.this.getOnPrepare());
                }
            } else if ((toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "mini", (Object) testIndex.getTestType()) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "subject", (Object) testIndex.getTestType())) && jWrite > this.AudioAttributesCompatParcelizer) {
                TestPlayViewModel.this.onPlayFromSearch.write(jWrite - this.AudioAttributesCompatParcelizer, TestPlayViewModel.this.getOnPrepare());
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromSearch(long j, long j2, long j3, SampleVideos<? super onPlayFromSearch> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = j;
            this.read = j2;
            this.AudioAttributesCompatParcelizer = j3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPlayFromSearch(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onFastForward() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromSearch(3600000L, 1800000L, 900000L, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconEndPadding
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSetRating((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetRating(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super o.interceptEvent.write> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r14
            com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi21Parcelizer r0 = (com.marrow2.ui.test.testplay.TestPlayViewModel.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.RemoteActionCompatParcelizer
            int r14 = r14 + r2
            r0.RemoteActionCompatParcelizer = r14
            goto L19
        L14:
            com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi21Parcelizer r0 = new com.marrow2.ui.test.testplay.TestPlayViewModel$AudioAttributesImplApi21Parcelizer
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = ""
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r13 = r0.write
            java.lang.Object r1 = r0.AudioAttributesCompatParcelizer
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.read
            java.lang.String r0 = (java.lang.String) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto Lb3
        L3b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L43:
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.read
            java.lang.String r4 = (java.lang.String) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L8a
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            java.lang.String r14 = r13.onPrepare
            com.marrow.data.models.test.TestIndex r2 = r13.onMediaButtonEvent
            if (r2 != 0) goto L5c
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r2 = r5
        L5c:
            java.lang.String r2 = r2.getTestType()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r6)
            o.crc32 r7 = r13.onPrepareFromSearch
            com.marrow.data.models.test.TestIndex r8 = r13.onMediaButtonEvent
            if (r8 != 0) goto L6d
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r8 = r5
        L6d:
            long r8 = r8.getStartTimestamp()
            com.marrow.data.models.test.TestIndex r10 = r13.onMediaButtonEvent
            if (r10 != 0) goto L79
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r10 = r5
        L79:
            long r10 = r10.getEndTimestamp()
            r0.read = r14
            r0.AudioAttributesCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r4 = r7.read(r8, r10)
            r12 = r4
            r4 = r14
            r14 = r12
        L8a:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            o.crc32 r7 = r13.onPrepareFromSearch
            com.marrow.data.models.test.TestIndex r13 = r13.onMediaButtonEvent
            if (r13 != 0) goto L9a
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            goto L9b
        L9a:
            r5 = r13
        L9b:
            long r5 = r5.getStartTimestamp()
            r0.read = r4
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r14
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r13 = r7.RemoteActionCompatParcelizer(r5, r0)
            if (r13 != r1) goto Lae
            return r1
        Lae:
            r1 = r2
            r0 = r4
            r12 = r14
            r14 = r13
            r13 = r12
        Lb3:
            java.lang.String r14 = (java.lang.String) r14
            o.interceptEvent$write r2 = new o.interceptEvent$write
            r2.<init>(r0, r1, r13, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testplay.TestPlayViewModel.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long write(TestIndex testIndex) {
        return testIndex.getTentativeEndTimestampMs() - System.currentTimeMillis();
    }

    static final class onPrepare extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ write IconCompatParcelizer;
        private int read;

        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[write.values().length];
                try {
                    iArr[write.IconCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[write.AudioAttributesCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[write.read.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = TestPlayViewModel.this.read(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            interceptEvent.write writeVar = (interceptEvent.write) obj;
            int i2 = read.RemoteActionCompatParcelizer[this.IconCompatParcelizer.ordinal()];
            if (i2 == 1) {
                isSeekPending isseekpending = TestPlayViewModel.this.RemoteActionCompatParcelizer;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                isseekpending.write(interceptEvent.read(writeVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            } else if (i2 == 2) {
                isSeekPending isseekpending2 = TestPlayViewModel.this.RemoteActionCompatParcelizer;
                interceptEvent interceptevent2 = interceptEvent.INSTANCE;
                isseekpending2.write(interceptEvent.write(writeVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            } else if (i2 == 3) {
                isSeekPending isseekpending3 = TestPlayViewModel.this.RemoteActionCompatParcelizer;
                interceptEvent interceptevent3 = interceptEvent.INSTANCE;
                isseekpending3.write(interceptEvent.AudioAttributesCompatParcelizer(writeVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            } else {
                throw new RenewEligibleCreator();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPrepare(write writeVar, SampleVideos<? super onPrepare> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = writeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new onPrepare(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepare) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(write writeVar) {
        if (this.onMediaButtonEvent == null) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepare(writeVar, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconEnabledResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onSetCaptioningEnabled((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetCaptioningEnabled(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (TestPlayViewModel.this.MediaBrowserCompatSearchResultReceiver.read(System.currentTimeMillis(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestPlayViewModel.this.write.write(setTextEndPaddingResource.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestPlayViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCloseIconResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestPlayViewModel.onPlay((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlay(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/marrow2/ui/test/testplay/TestPlayViewModel$write;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class write {
        private static final /* synthetic */ write[] write;
        public static final write IconCompatParcelizer = new write("DISCARD", 0);
        public static final write AudioAttributesCompatParcelizer = new write("SUBMIT", 1);
        public static final write read = new write("PAUSE", 2);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrIconCompatParcelizer = IconCompatParcelizer();
            write = writeVarArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrIconCompatParcelizer);
        }

        private static final /* synthetic */ write[] IconCompatParcelizer() {
            return new write[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, read};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) write.clone();
        }
    }
}
