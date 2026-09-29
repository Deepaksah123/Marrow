package com.marrow2.ui.test.score;

import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.user.State;
import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import com.marrow2.ui.test.score.TestScoreViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.CmcdHeadersFactoryCmcdStatus;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.LoyaltyPointsBuilder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TileProvider;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.VideoTimelineResponseBody;
import kotlin.checkEglException;
import kotlin.checkGlError;
import kotlin.crc32;
import kotlin.getAnswerMap;
import kotlin.getAudioUsageForStreamType;
import kotlin.getCurrentOrMainLooper;
import kotlin.getDataUriForString;
import kotlin.getDisplaySizeV17;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isAbsolute;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setAction;
import kotlin.setExpandedTitleMargin;
import kotlin.setExpandedTitleMarginBottom;
import kotlin.setExpandedTitleMarginStart;
import kotlin.setExpandedTitleTextAppearance;
import kotlin.setExpandedTitleTextColor;
import kotlin.setExpandedTitleTextSize;
import kotlin.setExpandedTitleTypeface;
import kotlin.setExtraMultilineHeightEnabled;
import kotlin.setLineSpacingAdd;
import kotlin.setLineSpacingMultiplier;
import kotlin.setMaxLines;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.uncaughtException;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0087\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010Y\u001a\u00020Z2\u0006\u0010.\u001a\u00020\u001eH\u0002J\u0010\u0010[\u001a\u00020Z2\u0006\u0010.\u001a\u00020\u001eH\u0002J\u0010\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020=H\u0002J\u0018\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0002J(\u0010b\u001a\u00020Z2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020=H\u0002J\u000e\u0010f\u001a\u00020Z2\u0006\u0010g\u001a\u00020hJ \u0010i\u001a\u00020Z2\u0006\u0010j\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020\u001dH\u0002J\b\u0010l\u001a\u00020ZH\u0002J\b\u0010m\u001a\u00020ZH\u0002J\u0018\u0010n\u001a\u00020Z2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010o\u001a\u00020\u001dH\u0002J<\u0010p\u001a\u00020\u00152\n\u0010q\u001a\u00060rj\u0002`s2\u0006\u0010V\u001a\u00020t2\u0006\u0010u\u001a\u00020=2\u0006\u0010v\u001a\u00020=2\u0006\u0010e\u001a\u00020=2\u0006\u0010w\u001a\u00020=H\u0002J9\u0010x\u001a\u00020y2\u0006\u0010V\u001a\u00020t2\u0006\u0010z\u001a\u00020=2\u0006\u0010e\u001a\u00020=2\b\u0010{\u001a\u0004\u0018\u00010\u001d2\b\u0010|\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0002\u0010}J\u0016\u0010~\u001a\u00020Z2\u0006\u0010V\u001a\u00020tH\u0082@¢\u0006\u0002\u0010\u007fJ6\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010(2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010(2\u0014\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u0084\u0001H\u0002J\u0012\u0010\u0085\u0001\u001a\u00020Z2\u0007\u0010\u0086\u0001\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0017¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020-0\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019R\u0018\u00103\u001a\f\u0012\b\u0012\u000604j\u0002`50(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R,\u00108\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(0\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(0\u001c0\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0017¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0019R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0017¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0019R\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0(0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0(0\u0017¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u0017¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0019R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u0017¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0019R\u0012\u0010V\u001a\u00060Wj\u0002`XX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0088\u0001"}, d2 = {"Lcom/marrow2/ui/test/score/TestScoreViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "stateUseCase", "Lcom/marrow2/domain/state/StateUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/domain/state/StateUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "args", "Lcom/marrow2/ui/test/score/model/TestScoreArgument;", "_testScoreUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/test/score/model/TestScoreUiState;", "testScoreUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getTestScoreUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_errorState", "Lcom/marrow2/core/utils/MarrowFlow;", "Lkotlin/Pair;", "", "", "errorState", "Lkotlinx/coroutines/flow/SharedFlow;", "getErrorState", "()Lkotlinx/coroutines/flow/SharedFlow;", "_navigateEvent", "Lcom/marrow2/ui/test/score/model/TestScoreDialogUiState;", "navigateEvent", "getNavigateEvent", "_testResultList", "", "Lcom/marrow2/ui/test/score/model/TestScoreListAdapterItemTypeModel;", "testResultList", "getTestResultList", "_selectedStateId", "Lcom/marrow2/ui/test/score/model/StateUIModel;", "selectedStateId", "getSelectedStateId", "_tabStateId", "tabStateId", "getTabStateId", "_stateList", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "_testAnalyticsUiState", "Lcom/marrow2/ui/test/score/model/TestAnalyticsUIState;", "_analyticsListUiState", "Lcom/marrow2/ui/test/analytics/adapter/model/TestAnalyticsAdapterUiModel;", "analyticsListUiState", "getAnalyticsListUiState", "_isLoading", "", "isLoading", "_error", "error", "getError", "_guessCardUiState", "Lcom/marrow2/ui/test/score/model/GuessCardUIState;", "guessCardUIState", "getGuessCardUIState", "_timerCardUiState", "Lcom/marrow2/ui/test/score/model/TimerCardUiState;", "timerCardUiState", "getTimerCardUiState", "_rankPairModelUiState", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "rankPairModelUiState", "getRankPairModelUiState", "_answerUiState", "Lcom/marrow2/ui/test/score/model/AnswerCardUiState;", "answerUiState", "getAnswerUiState", "_gtAnalyticsCardUiState", "Lcom/marrow2/ui/test/landing/model/GTAnalyticsCardUiModel;", "gtAnalyticsCardUiState", "getGtAnalyticsCardUiState", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "onStateSelected", "", "getTopUsersByState", "getTestResults", "isInitialLoad", "sendLoadEvent", "testId", "testScore", "", "sendEventBasedOnStateSelected", "stateId", "currentSelectedStId", "isAllIndiaSelected", "notifyEvent", "event", "Lcom/marrow2/ui/test/score/model/TestScoreEvent;", "sendSubjectWisePerformanceCardClickedEvent", "subjectId", "position", "sendFullAnalyticsButtonTappedEvent", "sendStateTabSelectedEvent", "sendReviewScreenOpenedEvent", "filterType", "transformToTestScoreState", "topUsers", "Lcom/marrow2/data/topuser/model/TestTopScoreRepoModel;", "Lcom/marrow2/data/topuser/model/ResultUCModel;", "Lcom/marrow2/domain/test/model/TestScoreUCModel;", "isTestSubscribed", "hasConfigStateRank", "isPredictedRank", "getCurrentUserCard", "Lcom/marrow2/ui/test/score/model/TestScoreListAdapterItemTypeModel$TestScoreCardTypeModel;", "isLocked", "stateRank", "statePercentile", "(Lcom/marrow2/domain/test/model/TestScoreUCModel;ZZLjava/lang/Integer;Ljava/lang/Double;)Lcom/marrow2/ui/test/score/model/TestScoreListAdapterItemTypeModel$TestScoreCardTypeModel;", "loadSubjectWisePerformance", "(Lcom/marrow2/domain/test/model/TestScoreUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortUserRankData", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "myStat", "currentUserSubNames", "", "notifyUi", "testAnalyticsUIState", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestScoreViewModel extends POJOPropertyBuilderWithMember {
    public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private final getResolutionSize<Pair<List<uncaughtException>, List<uncaughtException>>> AudioAttributesCompatParcelizer;
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<setExtraMultilineHeightEnabled> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<LoyaltyPointsBuilder> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<String> IconCompatParcelizer;
    private final getResolutionSize<List<RankPairModel>> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<setExpandedTitleMarginBottom> MediaBrowserCompatItemReceiver;
    private getResolutionSize<setExpandedTitleMarginStart> MediaBrowserCompatMediaItem;
    private final getResolutionSize<List<setExpandedTitleTextSize>> MediaBrowserCompatSearchResultReceiver;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private setExpandedTitleTextColor MediaDescriptionCompat;
    private List<? extends State> MediaMetadataCompat;
    private final getResolutionSize<setExpandedTitleMarginStart> RatingCompat;
    private final setUpdatedStatus<setExpandedTitleMargin> handleMediaPlayPauseIfPendingOnHandler;
    private final getResolutionSize<setLineSpacingMultiplier> onAddQueueItem;
    private final setUpdatedStatus<Pair<List<uncaughtException>, List<uncaughtException>>> onCommand;
    private final isSeekPending onCustomAction;
    private final setExpandedTitleTypeface onFastForward;
    private final isDark<Pair<Integer, String>> onMediaButtonEvent;
    private final LogLogLevel onPause;
    private final setUpdatedStatus<LoyaltyPointsBuilder> onPlay;
    private final setUpdatedStatus<String> onPlayFromMediaId;
    private final setUpdatedStatus<setExtraMultilineHeightEnabled> onPlayFromSearch;
    private final setUpdatedStatus<setExpandedTitleMarginStart> onPlayFromUri;
    private final setUpdatedStatus<setExpandedTitleMarginBottom> onPrepare;
    private final setUpdatedStatus<Boolean> onPrepareFromMediaId;
    private final setUpdatedStatus<List<RankPairModel>> onPrepareFromSearch;
    private final setUpdatedStatus<List<setExpandedTitleTextSize>> onPrepareFromUri;
    private final isAbsolute onRemoveQueueItem;
    private TestIndex onRemoveQueueItemAt;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd>> onRewind;
    private final setUpdatedStatus<setExpandedTitleMarginStart> onSeekTo;
    private final getDisplaySizeV17 onSetRating;
    private final crc32 onSetRepeatMode;
    private final setUpdatedStatus<setLineSpacingMultiplier> onSetShuffleMode;
    private final getResolutionSize<setExpandedTitleMargin> read;
    private final CmcdHeadersFactoryCmcdStatus<Pair<Integer, String>> write;

    @setSdkPayload
    public TestScoreViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, crc32 crc32Var, LogLogLevel logLogLevel, getDisplaySizeV17 getdisplaysizev17, isAbsolute isabsolute, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isabsolute, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.onSetRepeatMode = crc32Var;
        this.onPause = logLogLevel;
        this.onSetRating = getdisplaysizev17;
        this.onRemoveQueueItem = isabsolute;
        this.onCustomAction = isseekpending;
        setExpandedTitleTypeface.Companion companion = setExpandedTitleTypeface.INSTANCE;
        this.onFastForward = setExpandedTitleTypeface.Companion.IconCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.onRewind = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        CmcdHeadersFactoryCmcdStatus<Pair<Integer, String>> cmcdHeadersFactoryCmcdStatus = new CmcdHeadersFactoryCmcdStatus<>(new Pair(-1, ""));
        this.write = cmcdHeadersFactoryCmcdStatus;
        this.onMediaButtonEvent = cmcdHeadersFactoryCmcdStatus.AudioAttributesCompatParcelizer();
        getResolutionSize<setExtraMultilineHeightEnabled> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onPlayFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<setExpandedTitleTextSize>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onPrepareFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<setExpandedTitleMarginStart> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new setExpandedTitleMarginStart(TestIndex.ALL_INDIA_ID, "All India"));
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onPlayFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<setExpandedTitleMarginStart> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(new setExpandedTitleMarginStart(TestIndex.ALL_INDIA_ID, ""));
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onSeekTo = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.MediaMetadataCompat = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = new setExpandedTitleTextColor(null, null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0L, false, false, false, null, 0, 0, 0, 0, 0, 0, 0, 0L, 0, null, false, null, null, null, null, null, null, -1, 31, null);
        getResolutionSize<Pair<List<uncaughtException>, List<uncaughtException>>> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new Pair(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onPrepareFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer("");
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<setExpandedTitleMarginBottom> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(new setExpandedTitleMarginBottom(false, false, 0, null, 0, 31, null));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer9;
        this.onPrepare = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<setLineSpacingMultiplier> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer(new setLineSpacingMultiplier(0L, 0, 0, 0, 15, null));
        this.onAddQueueItem = getresolutionsizeRemoteActionCompatParcelizer10;
        this.onSetShuffleMode = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer10);
        getResolutionSize<List<RankPairModel>> getresolutionsizeRemoteActionCompatParcelizer11 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer11;
        this.onPrepareFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer11);
        getResolutionSize<setExpandedTitleMargin> getresolutionsizeRemoteActionCompatParcelizer12 = setStartTime.RemoteActionCompatParcelizer(new setExpandedTitleMargin(0, 0, 0, 0, false, false, false, false, false, false, false, 2047, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer12;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer12);
        getResolutionSize<LoyaltyPointsBuilder> getresolutionsizeRemoteActionCompatParcelizer13 = setStartTime.RemoteActionCompatParcelizer(new LoyaltyPointsBuilder(false, null, null, null, 15, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer13;
        this.onPlay = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer13);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass2(null), new MagicModuleSubmissionRequestBody() { // from class: o.setStatusBarForegroundResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd>> MediaBrowserCompatMediaItem() {
        return this.onRewind;
    }

    public final isDark<Pair<Integer, String>> AudioAttributesCompatParcelizer() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<setExtraMultilineHeightEnabled> AudioAttributesImplApi21Parcelizer() {
        return this.onPlayFromSearch;
    }

    public final setUpdatedStatus<List<setExpandedTitleTextSize>> MediaDescriptionCompat() {
        return this.onPrepareFromUri;
    }

    public final setUpdatedStatus<setExpandedTitleMarginStart> AudioAttributesImplApi26Parcelizer() {
        return this.onPlayFromUri;
    }

    public final setUpdatedStatus<setExpandedTitleMarginStart> RatingCompat() {
        return this.onSeekTo;
    }

    public final setUpdatedStatus<Pair<List<uncaughtException>, List<uncaughtException>>> IconCompatParcelizer() {
        return this.onCommand;
    }

    public final setUpdatedStatus<setExpandedTitleMarginBottom> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<setLineSpacingMultiplier> MediaBrowserCompatSearchResultReceiver() {
        return this.onSetShuffleMode;
    }

    public final setUpdatedStatus<List<RankPairModel>> MediaBrowserCompatItemReceiver() {
        return this.onPrepareFromSearch;
    }

    public final setUpdatedStatus<setExpandedTitleMargin> read() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<LoyaltyPointsBuilder> AudioAttributesImplBaseParcelizer() {
        return this.onPlay;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/test/score/TestScoreViewModel$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.test.score.TestScoreViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TestScoreViewModel testScoreViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TestScoreViewModel testScoreViewModel2 = TestScoreViewModel.this;
                this.IconCompatParcelizer = testScoreViewModel2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objRemoteActionCompatParcelizer = testScoreViewModel2.onRemoveQueueItem.RemoteActionCompatParcelizer(this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                testScoreViewModel = testScoreViewModel2;
                obj = objRemoteActionCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                testScoreViewModel = (TestScoreViewModel) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            testScoreViewModel.MediaMetadataCompat = (List) obj;
            TestScoreViewModel.this.RemoteActionCompatParcelizer(true);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2(SampleVideos<? super AnonymousClass2> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new AnonymousClass2(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass2) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaMetadataCompat(String str) {
        MediaBrowserCompatSearchResultReceiver(str);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:30:0x0127 A[PHI: r2 r4 r5
          0x0127: PHI (r2v8 o.getCurrentOrMainLooper) = (r2v7 o.getCurrentOrMainLooper), (r2v14 o.getCurrentOrMainLooper) binds: [B:29:0x0125, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v8 java.lang.Object) binds: [B:29:0x0125, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r5v4 o.checkGlError) = (r5v3 o.checkGlError), (r5v6 o.checkGlError) binds: [B:29:0x0125, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.score.TestScoreViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver(final String str) {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.AppBarLayoutBaseBehaviorSavedState
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private int RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ int write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.score.TestScoreViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, int i, String str2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
            this.write = i;
            this.AudioAttributesCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new IconCompatParcelizer(this.read, this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(TestScoreViewModel testScoreViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(testScoreViewModel), testScoreViewModel.new IconCompatParcelizer(str, i, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.CollapsingToolbarLayout
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.MediaDescriptionCompat((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private int MediaMetadataCompat;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ boolean write;

        /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[PHI: r1 r15
          0x00ab: PHI (r1v6 o.getCurrentOrMainLooper) = (r1v5 o.getCurrentOrMainLooper), (r1v8 o.getCurrentOrMainLooper) binds: [B:15:0x00a9, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]
          0x00ab: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v0 java.lang.Object) binds: [B:15:0x00a9, B:10:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fd A[PHI: r1
          0x00fd: PHI (r1v9 o.getCurrentOrMainLooper) = (r1v6 o.getCurrentOrMainLooper), (r1v11 o.getCurrentOrMainLooper) binds: [B:33:0x00fb, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011d A[PHI: r1 r15
          0x011d: PHI (r1v12 o.getCurrentOrMainLooper) = (r1v9 o.getCurrentOrMainLooper), (r1v14 o.getCurrentOrMainLooper) binds: [B:35:0x011b, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x011d: PHI (r15v19 java.lang.Object) = (r15v18 java.lang.Object), (r15v0 java.lang.Object) binds: [B:35:0x011b, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0237  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 598
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.score.TestScoreViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(boolean z, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.setTargetElevation
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(TestScoreViewModel testScoreViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(testScoreViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i, str, null);
        testScoreViewModel.write.IconCompatParcelizer(new Pair<>(Integer.valueOf(i), str));
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatItemReceiver;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ double read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
        
            if (r5 != r1) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.score.TestScoreViewModel.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(String str, double d, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.read = d;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String str, double d) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(str, d, null), new MagicModuleSubmissionRequestBody() { // from class: o.setStatusBarForeground
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String str, boolean z) {
        if (z) {
            return;
        }
        String str2 = this.MediaBrowserCompatMediaItem.IconCompatParcelizer().read();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) str)) {
            return;
        }
        getLatestBitrateEstimate.MediaMetadataCompat.RemoteActionCompatParcelizer(str, str2);
    }

    public final void IconCompatParcelizer(setExpandedTitleTextAppearance setexpandedtitletextappearance) {
        setExtraMultilineHeightEnabled.RemoteActionCompatParcelizer audioAttributesImplApi26Parcelizer;
        Object next;
        toMagicModuleMetaRepoModel.write(setexpandedtitletextappearance, "");
        getResolutionSize<setExtraMultilineHeightEnabled> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.IconCompatParcelizer.INSTANCE)) {
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (setexpandedtitletextappearance instanceof setExpandedTitleTextAppearance.MediaBrowserCompatCustomActionResultReceiver) {
            setExpandedTitleTextAppearance.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (setExpandedTitleTextAppearance.MediaBrowserCompatCustomActionResultReceiver) setexpandedtitletextappearance;
            if (!mediaBrowserCompatCustomActionResultReceiver.write() && mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) mediaBrowserCompatCustomActionResultReceiver.read(), (Object) ((setExpandedTitleMarginStart) IntermediateLoginResponseBody.RatingCompat((List) this.RatingCompat.bm_())).read())) {
                audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesImplBaseParcelizer.INSTANCE;
            } else {
                audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.IconCompatParcelizer.INSTANCE;
            }
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesImplApi21Parcelizer.INSTANCE;
        } else if (setexpandedtitletextappearance instanceof setExpandedTitleTextAppearance.AudioAttributesImplApi26Parcelizer) {
            setExpandedTitleTextAppearance.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = (setExpandedTitleTextAppearance.AudioAttributesImplApi26Parcelizer) setexpandedtitletextappearance;
            if (audioAttributesImplApi26Parcelizer2.IconCompatParcelizer().getRemoteActionCompatParcelizer()) {
                if (!audioAttributesImplApi26Parcelizer2.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()) {
                    if (audioAttributesImplApi26Parcelizer2.write() == 5) {
                        MediaMetadataCompat();
                        audioAttributesImplApi26Parcelizer = new setExtraMultilineHeightEnabled.read(audioAttributesImplApi26Parcelizer2.IconCompatParcelizer().getRatingCompat(), this.MediaBrowserCompatMediaItem.IconCompatParcelizer());
                    } else {
                        read(this.onFastForward.getIconCompatParcelizer(), audioAttributesImplApi26Parcelizer2.write());
                        audioAttributesImplApi26Parcelizer = new setExtraMultilineHeightEnabled.write(audioAttributesImplApi26Parcelizer2.IconCompatParcelizer().getRatingCompat(), audioAttributesImplApi26Parcelizer2.write());
                    }
                } else {
                    audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesImplApi21Parcelizer.INSTANCE;
                }
            } else {
                audioAttributesImplApi26Parcelizer = new setExtraMultilineHeightEnabled.MediaBrowserCompatItemReceiver(audioAttributesImplApi26Parcelizer2.IconCompatParcelizer().getMediaDescriptionCompat());
            }
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.MediaBrowserCompatItemReceiver.INSTANCE)) {
            audioAttributesImplApi26Parcelizer = new setExtraMultilineHeightEnabled.AudioAttributesImplApi26Parcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem.IconCompatParcelizer().read());
        } else if (setexpandedtitletextappearance instanceof setExpandedTitleTextAppearance.AudioAttributesImplBaseParcelizer) {
            Iterator<T> it = this.MediaMetadataCompat.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((State) next).getId(), (Object) ((setExpandedTitleTextAppearance.AudioAttributesImplBaseParcelizer) setexpandedtitletextappearance).AudioAttributesCompatParcelizer())) {
                        break;
                    }
                }
            }
            State state = (State) next;
            if (state != null) {
                getResolutionSize<setExpandedTitleMarginStart> getresolutionsize2 = this.RatingCompat;
                String id = state.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                String name = state.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                getresolutionsize2.write(new setExpandedTitleMarginStart(id, name));
            }
            MediaMetadataCompat(((setExpandedTitleTextAppearance.AudioAttributesImplBaseParcelizer) setexpandedtitletextappearance).AudioAttributesCompatParcelizer());
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            RemoteActionCompatParcelizer(false);
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.MediaBrowserCompatMediaItem.INSTANCE)) {
            MediaMetadataCompat(((setExpandedTitleMarginStart) IntermediateLoginResponseBody.RatingCompat((List) this.RatingCompat.bm_())).read());
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (setexpandedtitletextappearance instanceof setExpandedTitleTextAppearance.read) {
            read(this.onFastForward.getIconCompatParcelizer(), ((setExpandedTitleTextAppearance.read) setexpandedtitletextappearance).IconCompatParcelizer());
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else if (setexpandedtitletextappearance instanceof setExpandedTitleTextAppearance.write) {
            setExpandedTitleTextAppearance.write writeVar = (setExpandedTitleTextAppearance.write) setexpandedtitletextappearance;
            read(writeVar.RemoteActionCompatParcelizer(), writeVar.IconCompatParcelizer(), writeVar.write());
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE;
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setexpandedtitletextappearance, setExpandedTitleTextAppearance.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.onCustomAction;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.RemoteActionCompatParcelizer("test_result"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            audioAttributesImplApi26Parcelizer = setExtraMultilineHeightEnabled.RemoteActionCompatParcelizer.INSTANCE;
        }
        getresolutionsize.write(audioAttributesImplApi26Parcelizer);
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            String str;
            String str2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending2 = TestScoreViewModel.this.onCustomAction;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                String str3 = this.AudioAttributesCompatParcelizer;
                TestIndex testIndex = TestScoreViewModel.this.onRemoveQueueItemAt;
                TestIndex testIndex2 = null;
                if (testIndex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex = null;
                }
                String testType = testIndex.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = TestScoreViewModel.this.onSetRepeatMode;
                TestIndex testIndex3 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    testIndex2 = testIndex3;
                }
                this.IconCompatParcelizer = isseekpending2;
                this.read = interceptevent;
                this.AudioAttributesImplApi26Parcelizer = str3;
                this.AudioAttributesImplBaseParcelizer = testType;
                this.MediaBrowserCompatItemReceiver = 1;
                Object objRemoteActionCompatParcelizer = crc32Var.RemoteActionCompatParcelizer(testIndex2.getStartTimestamp(), this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                isseekpending = isseekpending2;
                obj = objRemoteActionCompatParcelizer;
                str = str3;
                str2 = testType;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.AudioAttributesImplBaseParcelizer;
                str = (String) this.AudioAttributesImplApi26Parcelizer;
                isseekpending = (isSeekPending) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(str, str2, (String) obj, this.write, this.RemoteActionCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str, String str2, int i, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.write = str2;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String str, String str2, int i) {
        if (this.onRemoveQueueItemAt != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(str2, str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.setCollapsedTitleTextColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestScoreViewModel.onAddQueueItem((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            isSeekPending isseekpending;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending2 = TestScoreViewModel.this.onCustomAction;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                TestIndex testIndex = TestScoreViewModel.this.onRemoveQueueItemAt;
                TestIndex testIndex2 = null;
                if (testIndex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex = null;
                }
                String id = testIndex.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                TestIndex testIndex3 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex3 = null;
                }
                String testType = testIndex3.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = TestScoreViewModel.this.onSetRepeatMode;
                TestIndex testIndex4 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    testIndex2 = testIndex4;
                }
                this.write = isseekpending2;
                this.read = interceptevent;
                this.RemoteActionCompatParcelizer = id;
                this.AudioAttributesCompatParcelizer = testType;
                this.IconCompatParcelizer = 1;
                Object objRemoteActionCompatParcelizer = crc32Var.RemoteActionCompatParcelizer(testIndex2.getStartTimestamp(), this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                str = id;
                str2 = testType;
                obj = objRemoteActionCompatParcelizer;
                isseekpending = isseekpending2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.AudioAttributesCompatParcelizer;
                str = (String) this.RemoteActionCompatParcelizer;
                isseekpending = (isSeekPending) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            isseekpending.write(interceptEvent.IconCompatParcelizer(str, str2, (String) obj), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        if (this.onRemoveQueueItemAt != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.AppBarLayoutLayoutParams
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestScoreViewModel.RatingCompat((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            interceptEvent interceptevent;
            String id;
            String testType;
            Object obj2;
            Object objRemoteActionCompatParcelizer;
            int i;
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            TestIndex testIndex = null;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isseekpending = TestScoreViewModel.this.onCustomAction;
                interceptevent = interceptEvent.INSTANCE;
                TestIndex testIndex2 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex2 = null;
                }
                id = testIndex2.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                TestIndex testIndex3 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex3 = null;
                }
                testType = testIndex3.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = TestScoreViewModel.this.onSetRepeatMode;
                TestIndex testIndex4 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex4 = null;
                }
                long startTimestamp = testIndex4.getStartTimestamp();
                TestIndex testIndex5 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex5 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex5 = null;
                }
                long endTimestamp = testIndex5.getEndTimestamp();
                this.IconCompatParcelizer = isseekpending;
                this.read = interceptevent;
                this.AudioAttributesCompatParcelizer = id;
                this.RemoteActionCompatParcelizer = testType;
                this.AudioAttributesImplApi21Parcelizer = 1;
                obj2 = crc32Var.read(startTimestamp, endTimestamp);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.write;
                    String str2 = (String) this.RemoteActionCompatParcelizer;
                    str = (String) this.AudioAttributesCompatParcelizer;
                    isSeekPending isseekpending2 = (isSeekPending) this.IconCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    testType = str2;
                    isseekpending = isseekpending2;
                    objRemoteActionCompatParcelizer = obj;
                    isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(str, testType, i, (String) objRemoteActionCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    return getShowPopup.INSTANCE;
                }
                String str3 = (String) this.RemoteActionCompatParcelizer;
                String str4 = (String) this.AudioAttributesCompatParcelizer;
                interceptevent = (interceptEvent) this.read;
                isSeekPending isseekpending3 = (isSeekPending) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                testType = str3;
                isseekpending = isseekpending3;
                id = str4;
                obj2 = obj;
            }
            int iIntValue = ((Number) obj2).intValue();
            crc32 crc32Var2 = TestScoreViewModel.this.onSetRepeatMode;
            TestIndex testIndex6 = TestScoreViewModel.this.onRemoveQueueItemAt;
            if (testIndex6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                testIndex = testIndex6;
            }
            this.IconCompatParcelizer = isseekpending;
            this.read = interceptevent;
            this.AudioAttributesCompatParcelizer = id;
            this.RemoteActionCompatParcelizer = testType;
            this.write = iIntValue;
            this.AudioAttributesImplApi21Parcelizer = 2;
            objRemoteActionCompatParcelizer = crc32Var2.RemoteActionCompatParcelizer(testIndex.getStartTimestamp(), this);
            if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                return objIconCompatParcelizer;
            }
            i = iIntValue;
            str = id;
            isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(str, testType, i, (String) objRemoteActionCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.onRemoveQueueItemAt != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCollapsedTitleTypeface
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestScoreViewModel.onCustomAction((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            String str;
            String str2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending2 = TestScoreViewModel.this.onCustomAction;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                String str3 = this.AudioAttributesCompatParcelizer;
                TestIndex testIndex = TestScoreViewModel.this.onRemoveQueueItemAt;
                TestIndex testIndex2 = null;
                if (testIndex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex = null;
                }
                String testType = testIndex.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = TestScoreViewModel.this.onSetRepeatMode;
                TestIndex testIndex3 = TestScoreViewModel.this.onRemoveQueueItemAt;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    testIndex2 = testIndex3;
                }
                this.RemoteActionCompatParcelizer = isseekpending2;
                this.write = interceptevent;
                this.IconCompatParcelizer = str3;
                this.AudioAttributesImplApi26Parcelizer = testType;
                this.MediaBrowserCompatItemReceiver = 1;
                Object objRemoteActionCompatParcelizer = crc32Var.RemoteActionCompatParcelizer(testIndex2.getStartTimestamp(), this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                isseekpending = isseekpending2;
                obj = objRemoteActionCompatParcelizer;
                str = str3;
                str2 = testType;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.AudioAttributesImplApi26Parcelizer;
                str = (String) this.IconCompatParcelizer;
                isseekpending = (isSeekPending) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            isseekpending.write(interceptEvent.IconCompatParcelizer(str, str2, (String) obj, this.read), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(String str, int i, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String str, int i) {
        if (this.onRemoveQueueItemAt != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.AppBarLayoutBehavior
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestScoreViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setLineSpacingAdd write(checkGlError checkglerror, getCurrentOrMainLooper getcurrentormainlooper, boolean z, boolean z2, boolean z3, boolean z4) {
        getCurrentOrMainLooper getcurrentormainlooper2;
        boolean z5;
        Double dValueOf;
        boolean z6 = getcurrentormainlooper.onCommand() && !z;
        checkEglException remoteActionCompatParcelizer = checkglerror.getRemoteActionCompatParcelizer();
        int iMediaBrowserCompatItemReceiver = remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.read() : getcurrentormainlooper.MediaBrowserCompatItemReceiver();
        checkEglException remoteActionCompatParcelizer2 = checkglerror.getRemoteActionCompatParcelizer();
        int iIconCompatParcelizer = remoteActionCompatParcelizer2 != null ? remoteActionCompatParcelizer2.IconCompatParcelizer() : getcurrentormainlooper.MediaDescriptionCompat();
        checkEglException remoteActionCompatParcelizer3 = checkglerror.getRemoteActionCompatParcelizer();
        int iWrite = !z4 ? remoteActionCompatParcelizer3 != null ? remoteActionCompatParcelizer3.write() : getcurrentormainlooper.AudioAttributesImplApi26Parcelizer() : iIconCompatParcelizer;
        checkEglException remoteActionCompatParcelizer4 = checkglerror.getRemoteActionCompatParcelizer();
        Integer numValueOf = remoteActionCompatParcelizer4 != null ? Integer.valueOf(remoteActionCompatParcelizer4.read()) : null;
        checkEglException remoteActionCompatParcelizer5 = checkglerror.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer5 != null) {
            dValueOf = Double.valueOf(remoteActionCompatParcelizer5.RemoteActionCompatParcelizer());
            getcurrentormainlooper2 = getcurrentormainlooper;
            z5 = z3;
        } else {
            getcurrentormainlooper2 = getcurrentormainlooper;
            z5 = z3;
            dValueOf = null;
        }
        List<setExpandedTitleTextSize> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(getcurrentormainlooper2, z6, z5, numValueOf, dValueOf));
        this.MediaBrowserCompatSearchResultReceiver.write(listRemoteActionCompatParcelizer);
        Object objMediaBrowserCompatSearchResultReceiver = IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List<? extends Object>) listRemoteActionCompatParcelizer);
        setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer = objMediaBrowserCompatSearchResultReceiver instanceof setExpandedTitleTextSize.IconCompatParcelizer ? (setExpandedTitleTextSize.IconCompatParcelizer) objMediaBrowserCompatSearchResultReceiver : null;
        return new setLineSpacingAdd(z4, getcurrentormainlooper.onPause(), getcurrentormainlooper.onPlay(), iMediaBrowserCompatItemReceiver, iWrite, getcurrentormainlooper.IconCompatParcelizer(), getcurrentormainlooper.MediaMetadataCompat(), getcurrentormainlooper.onCustomAction(), getcurrentormainlooper.RemoteActionCompatParcelizer(), z6, z2, z3, getcurrentormainlooper.RatingCompat(), (iconCompatParcelizer != null ? iconCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null) == TileProvider.IconCompatParcelizer);
    }

    private static setExpandedTitleTextSize.IconCompatParcelizer AudioAttributesCompatParcelizer(getCurrentOrMainLooper getcurrentormainlooper, boolean z, boolean z2, Integer num, Double d) {
        double dDoubleValue;
        int iAudioAttributesImplBaseParcelizer = getcurrentormainlooper.AudioAttributesImplBaseParcelizer();
        if (z2) {
            dDoubleValue = getcurrentormainlooper.read();
        } else {
            dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        }
        setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer = new setExpandedTitleTextSize.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer, dDoubleValue, getcurrentormainlooper.onPause(), getcurrentormainlooper.onPlay(), z, TileProvider.IconCompatParcelizer, getcurrentormainlooper.write(), getcurrentormainlooper.onAddQueueItem(), getcurrentormainlooper.AudioAttributesImplApi21Parcelizer(), getAudioUsageForStreamType.IconCompatParcelizer(getDataUriForString.read(getcurrentormainlooper), getcurrentormainlooper.MediaBrowserCompatCustomActionResultReceiver()), getcurrentormainlooper.RemoteActionCompatParcelizer(), getcurrentormainlooper.IconCompatParcelizer());
        if (num != null && num.intValue() == -2) {
            iconCompatParcelizer.MediaBrowserCompatMediaItem();
        }
        return iconCompatParcelizer;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getCurrentOrMainLooper AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.RemoteActionCompatParcelizer
                o.getCodecCountOfType r0 = (kotlin.getCodecCountOfType) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L67
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L40
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.test.score.TestScoreViewModel r6 = com.marrow2.ui.test.score.TestScoreViewModel.this
                o.crc32 r6 = com.marrow2.ui.test.score.TestScoreViewModel.MediaBrowserCompatItemReceiver(r6)
                com.marrow2.ui.test.score.TestScoreViewModel r1 = com.marrow2.ui.test.score.TestScoreViewModel.this
                o.setExpandedTitleTypeface r1 = com.marrow2.ui.test.score.TestScoreViewModel.IconCompatParcelizer(r1)
                java.lang.String r1 = r1.getIconCompatParcelizer()
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.IconCompatParcelizer = r3
                java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r1, r3, r4)
                if (r6 == r0) goto L8c
            L40:
                o.getCodecCountOfType r6 = (kotlin.getCodecCountOfType) r6
                java.util.List r1 = r6.RatingCompat()
                java.util.Map r3 = r6.read()
                java.util.List r1 = com.marrow2.ui.test.score.TestScoreViewModel.write(r1, r3)
                r6.RemoteActionCompatParcelizer(r1)
                com.marrow2.ui.test.score.TestScoreViewModel r1 = com.marrow2.ui.test.score.TestScoreViewModel.this
                o.getDisplaySizeV17 r1 = com.marrow2.ui.test.score.TestScoreViewModel.AudioAttributesImplApi21Parcelizer(r1)
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.RemoteActionCompatParcelizer = r6
                r5.IconCompatParcelizer = r2
                java.lang.Object r1 = r1.onSeekTo(r3)
                if (r1 != r0) goto L65
                goto L8c
            L65:
                r0 = r6
                r6 = r1
            L67:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                com.marrow2.ui.test.score.TestScoreViewModel r1 = com.marrow2.ui.test.score.TestScoreViewModel.this
                o.getCurrentOrMainLooper r2 = r5.AudioAttributesCompatParcelizer
                o.setExpandedTitleTextColor r6 = kotlin.setMaxLines.IconCompatParcelizer(r2, r0, r6)
                com.marrow2.ui.test.score.TestScoreViewModel.IconCompatParcelizer(r1, r6)
                o.getCurrentOrMainLooper r6 = r5.AudioAttributesCompatParcelizer
                boolean r6 = r6.onPause()
                if (r6 != 0) goto L89
                com.marrow2.ui.test.score.TestScoreViewModel r5 = com.marrow2.ui.test.score.TestScoreViewModel.this
                o.setExpandedTitleTextColor r6 = com.marrow2.ui.test.score.TestScoreViewModel.MediaDescriptionCompat(r5)
                com.marrow2.ui.test.score.TestScoreViewModel.read(r5, r6)
            L89:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L8c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.score.TestScoreViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getCurrentOrMainLooper getcurrentormainlooper, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = getcurrentormainlooper;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestScoreViewModel.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(getCurrentOrMainLooper getcurrentormainlooper) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(getcurrentormainlooper, null), new MagicModuleSubmissionRequestBody() { // from class: o.AppBarLayoutScrollingViewBehavior
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestScoreViewModel.MediaBrowserCompatMediaItem((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<TestSubjectStatModel> read(List<TestSubjectStatModel> list, Map<String, String> map) {
        Set<String> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setKeySet, 10));
        int i = 0;
        for (Object obj : setKeySet) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            arrayList.add(setAction.write((String) obj, Integer.valueOf(i)));
            i++;
        }
        final Map map2 = VideoTimelineResponseBody.read(arrayList);
        final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.AppBarLayoutBaseBehavior
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(TestScoreViewModel.IconCompatParcelizer(map2, (TestSubjectStatModel) obj2, (TestSubjectStatModel) obj3));
            }
        };
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, new Comparator() { // from class: o.setStatusBarForegroundColor
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return TestScoreViewModel.read(magicModuleSubmissionRequestBody, obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        return ((Number) magicModuleSubmissionRequestBody.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(Map map, TestSubjectStatModel testSubjectStatModel, TestSubjectStatModel testSubjectStatModel2) {
        int iCompare = Double.compare(testSubjectStatModel2.getPercentile(), testSubjectStatModel.getPercentile());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Double.compare(testSubjectStatModel2.getPossibleScore() > 0 ? testSubjectStatModel2.getScore() / ((double) testSubjectStatModel2.getPossibleScore()) : 0.0d, testSubjectStatModel.getPossibleScore() > 0 ? testSubjectStatModel.getScore() / ((double) testSubjectStatModel.getPossibleScore()) : 0.0d);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        Integer num = (Integer) map.get(testSubjectStatModel.getSubjectId());
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer num2 = (Integer) map.get(testSubjectStatModel2.getSubjectId());
        return toMagicModuleMetaRepoModel.read(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setExpandedTitleTextColor setexpandedtitletextcolor) {
        this.MediaBrowserCompatItemReceiver.write(setMaxLines.write(setexpandedtitletextcolor));
        this.onAddQueueItem.write(setMaxLines.read(setexpandedtitletextcolor));
        if (!setexpandedtitletextcolor.RatingCompat().isEmpty()) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(setexpandedtitletextcolor.RatingCompat());
        }
        this.AudioAttributesCompatParcelizer.write(new Pair<>(setexpandedtitletextcolor.MediaBrowserCompatCustomActionResultReceiver(), setexpandedtitletextcolor.AudioAttributesCompatParcelizer()));
        if (setexpandedtitletextcolor.getOnFastForward() > 0 || setexpandedtitletextcolor.getOnPlay() > 0 || setexpandedtitletextcolor.getOnPause() > 0) {
            this.read.write(setMaxLines.AudioAttributesCompatParcelizer(setexpandedtitletextcolor));
        }
    }
}
