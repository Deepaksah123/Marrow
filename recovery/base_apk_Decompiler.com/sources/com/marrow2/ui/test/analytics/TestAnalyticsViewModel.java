package com.marrow2.ui.test.analytics;

import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TopUser;
import com.marrow.data.models.user.State;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import com.marrow2.ui.test.analytics.TestAnalyticsViewModel;
import java.util.Comparator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ProviderInstaller;
import kotlin.ProviderInstallerProviderInstallListener;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TileProvider;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.crc32;
import kotlin.getAnswerMap;
import kotlin.getAudioUsageForStreamType;
import kotlin.getCustomMimeTypeForCodec;
import kotlin.getDisplaySizeV17;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleStats;
import kotlin.getMediaMimeType;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.installIfNeededAsync;
import kotlin.interceptEvent;
import kotlin.isAbsolute;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.onOpen;
import kotlin.onPostExecute;
import kotlin.onProviderInstallFailed;
import kotlin.setExpandedTitleMarginStart;
import kotlin.setExpandedTitleTextSize;
import kotlin.setExpandedTitleTypeface;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020@0,2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0,H\u0002J$\u0010B\u001a\u00020C2\n\u0010<\u001a\u00060=j\u0002`>2\b\u0010D\u001a\u0004\u0018\u00010EH\u0082@¢\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020IJ\u0010\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020\u0015H\u0002J\u0014\u0010L\u001a\u00020C2\n\u0010<\u001a\u00060=j\u0002`>H\u0002J(\u0010M\u001a\u00020C2\u0006\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u0010H\u0002J@\u0010R\u001a\u00020C2\n\u0010S\u001a\u00060Tj\u0002`U2\n\u0010<\u001a\u00060=j\u0002`>2\u0006\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u0010H\u0002J\u0018\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\u0015H\u0002J,\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\n\u0010<\u001a\u00060=j\u0002`>2\u0006\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\u0015H\u0002J\u0018\u0010`\u001a\u00020C2\u0006\u0010N\u001a\u00020\u00152\u0006\u0010a\u001a\u00020bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\f\u0012\b\u0012\u00060-j\u0002`.0,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0013R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040,0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040,0\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0013R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0013R\u0012\u0010<\u001a\u00060=j\u0002`>X\u0082.¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/marrow2/ui/test/analytics/TestAnalyticsViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "stateUseCase", "Lcom/marrow2/domain/state/StateUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/domain/state/StateUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_error", "", "error", "getError", "_previousRankUiState", "Lcom/marrow2/ui/test/analytics/model/PreviousRankUiState;", "previousRankUiState", "getPreviousRankUiState", "_graphDataUiState", "Lcom/marrow2/ui/test/analytics/model/GraphDataModel;", "graphDataUiState", "getGraphDataUiState", "_navigateEvent", "Lcom/marrow2/ui/test/analytics/model/AnalyticUiState;", "navigateEvent", "getNavigateEvent", "_toolBarUiState", "toolBarUiState", "getToolBarUiState", "testAnalyticsArgs", "Lcom/marrow2/ui/test/analytics/model/TestAnalyticsArgument;", "args", "Lcom/marrow2/ui/test/score/model/TestScoreArgument;", "_stateList", "", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "_selectedState", "Lcom/marrow2/ui/test/score/model/StateUIModel;", "selectedState", "getSelectedState", "_testResultList", "Lcom/marrow2/ui/test/score/model/TestScoreListAdapterItemTypeModel;", "testResultList", "getTestResultList", "_currentUserPositionUiState", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/test/analytics/model/CurrentUserPositionUIState;", "currentUserPositionUiState", "getCurrentUserPositionUiState", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "sortUserRankData", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "myStat", "populateUserScoreCardAndGraphUI", "", "statePercentile", "", "(Lcom/marrow/data/models/test/TestIndex;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyEvent", "event", "Lcom/marrow2/ui/test/analytics/model/TestAnalyticsEvent;", "getTopUsersByState", "selectedStateId", "getAllIndiaTopUsers", "sendEventBasedOnStateSelected", "testId", "stateId", "currentSelectedStId", "isAllIndiaSelected", "transformToTestScoreState", "topUsers", "Lcom/marrow2/data/topuser/model/TestTopScoreRepoModel;", "Lcom/marrow2/data/topuser/model/ResultUCModel;", "userId", "profilePic", "isPredictedRank", "getDisplayName", "firstName", "lastName", "getMyUserRankCard", "Lcom/marrow2/ui/test/score/model/TestScoreListAdapterItemTypeModel$TestRankCardTypeModel;", TopUser.KEY_RANK, "", "sendReviewScreenOpenedEvent", "filterType", "Lcom/marrow2/domain/filter/model/CommonFilterType;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestAnalyticsViewModel extends POJOPropertyBuilderWithMember {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller>> AudioAttributesCompatParcelizer;
    private getResolutionSize<setExpandedTitleMarginStart> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<ProviderInstallerProviderInstallListener> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<List<setExpandedTitleTextSize>> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<String> IconCompatParcelizer;
    private List<? extends State> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<onOpen> MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<String> MediaBrowserCompatMediaItem;
    private final getResolutionSize<String> MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<Boolean> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller>> MediaDescriptionCompat;
    private final isSeekPending MediaMetadataCompat;
    private final setExpandedTitleTypeface RatingCompat;
    private final setUpdatedStatus<ProviderInstallerProviderInstallListener> handleMediaPlayPauseIfPendingOnHandler;
    private final setUpdatedStatus<onOpen> onAddQueueItem;
    private final setUpdatedStatus<installIfNeededAsync> onCommand;
    private final setUpdatedStatus<setExpandedTitleMarginStart> onCustomAction;
    private final isAbsolute onFastForward;
    private final crc32 onMediaButtonEvent;
    private TestIndex onPause;
    private final setUpdatedStatus<List<setExpandedTitleTextSize>> onPlay;
    private final onProviderInstallFailed onPlayFromMediaId;
    private final setUpdatedStatus<String> onPlayFromUri;
    private final getDisplaySizeV17 onPrepare;
    private final getResolutionSize<Boolean> read;
    private final getResolutionSize<installIfNeededAsync> write;

    static final class read extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return TestAnalyticsViewModel.this.read((TestIndex) null, (Double) null, this);
        }
    }

    @setSdkPayload
    public TestAnalyticsViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, crc32 crc32Var, getDisplaySizeV17 getdisplaysizev17, isAbsolute isabsolute, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isabsolute, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.onMediaButtonEvent = crc32Var;
        this.onPrepare = getdisplaysizev17;
        this.onFastForward = isabsolute;
        this.MediaMetadataCompat = isseekpending;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<ProviderInstallerProviderInstallListener> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new ProviderInstallerProviderInstallListener(0, 0L, 0, 0, 0, 0, 0, false, false, false, false, false, 0.0d, 0.0d, 0, null, false, 131071, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<installIfNeededAsync> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new installIfNeededAsync(0, null, null, null, 15, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<onOpen> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(onOpen.write.INSTANCE);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onPlayFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        onProviderInstallFailed.Companion companion = onProviderInstallFailed.INSTANCE;
        this.onPlayFromMediaId = onProviderInstallFailed.Companion.read(pOJOPropertyBuilder5);
        setExpandedTitleTypeface.Companion companion2 = setExpandedTitleTypeface.INSTANCE;
        this.RatingCompat = setExpandedTitleTypeface.Companion.IconCompatParcelizer(pOJOPropertyBuilder5);
        this.MediaBrowserCompatCustomActionResultReceiver = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getResolutionSize<setExpandedTitleMarginStart> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(new setExpandedTitleMarginStart(TestIndex.ALL_INDIA_ID, "All India"));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<List<setExpandedTitleTextSize>> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPlay = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller>> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer9;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new MagicModuleSubmissionRequestBody() { // from class: o.getAppIdOrigin
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestAnalyticsViewModel.read(this.write, (String) obj2);
            }
        });
    }

    public final setUpdatedStatus<Boolean> MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<String> read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<ProviderInstallerProviderInstallListener> MediaBrowserCompatCustomActionResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<installIfNeededAsync> AudioAttributesCompatParcelizer() {
        return this.onCommand;
    }

    public final setUpdatedStatus<onOpen> MediaBrowserCompatItemReceiver() {
        return this.onAddQueueItem;
    }

    public final setUpdatedStatus<String> AudioAttributesImplApi21Parcelizer() {
        return this.onPlayFromUri;
    }

    public final setUpdatedStatus<setExpandedTitleMarginStart> AudioAttributesImplBaseParcelizer() {
        return this.onCustomAction;
    }

    public final setUpdatedStatus<List<setExpandedTitleTextSize>> AudioAttributesImplApi26Parcelizer() {
        return this.onPlay;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller>> IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/test/analytics/TestAnalyticsViewModel$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.test.analytics.TestAnalyticsViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object read;

        /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
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
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.read
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r0 = (com.marrow2.ui.test.analytics.TestAnalyticsViewModel) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L6e
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1e:
                java.lang.Object r1 = r5.read
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r1 = (com.marrow2.ui.test.analytics.TestAnalyticsViewModel) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L49
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesImplApi21Parcelizer(r6)
                java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
                r6.write(r1)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.isAbsolute r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.RemoteActionCompatParcelizer(r1)
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.read = r1
                r5.IconCompatParcelizer = r3
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r4)
                if (r6 == r0) goto Lb5
            L49:
                java.util.List r6 = (java.util.List) r6
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel.read(r1, r6)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.crc32 r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.MediaBrowserCompatCustomActionResultReceiver(r6)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r3 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.onProviderInstallFailed r3 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesCompatParcelizer(r3)
                java.lang.String r3 = r3.getWrite()
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.read = r6
                r5.IconCompatParcelizer = r2
                java.lang.Object r1 = r1.read(r3, r4)
                if (r1 != r0) goto L6c
                goto Lb5
            L6c:
                r0 = r6
                r6 = r1
            L6e:
                com.marrow.data.models.test.TestIndex r6 = (com.marrow.data.models.test.TestIndex) r6
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel.write(r0, r6)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.onProviderInstallFailed r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesCompatParcelizer(r6)
                java.lang.String r6 = r6.getAudioAttributesCompatParcelizer()
                java.lang.String r0 = "-1"
                boolean r6 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r6, r0)
                if (r6 == 0) goto L97
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                com.marrow.data.models.test.TestIndex r0 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.read(r6)
                if (r0 != 0) goto L93
                java.lang.String r0 = ""
                kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r0)
                r0 = 0
            L93:
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel.read(r6, r0)
                goto La4
            L97:
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.onProviderInstallFailed r0 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesCompatParcelizer(r6)
                java.lang.String r0 = r0.getAudioAttributesCompatParcelizer()
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel.write(r6, r0)
            La4:
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r5 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesImplApi21Parcelizer(r5)
                r6 = 0
                java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r6)
                r5.write(r6)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            Lb5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestAnalyticsViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(TestAnalyticsViewModel testAnalyticsViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testAnalyticsViewModel.read.write(Boolean.FALSE);
        testAnalyticsViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        return ((Number) magicModuleSubmissionRequestBody.invoke(obj, obj2)).intValue();
    }

    private static List<TestSubjectStatModel> read(List<TestSubjectStatModel> list) {
        final MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = new MagicModuleSubmissionRequestBody() { // from class: o.AppMeasurementService
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(TestAnalyticsViewModel.AudioAttributesCompatParcelizer((TestSubjectStatModel) obj, (TestSubjectStatModel) obj2));
            }
        };
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, new Comparator() { // from class: o.AppMeasurementSdkOnEventListener
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TestAnalyticsViewModel.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(TestSubjectStatModel testSubjectStatModel, TestSubjectStatModel testSubjectStatModel2) {
        int iCompare = Double.compare(testSubjectStatModel2.getPercentile(), testSubjectStatModel.getPercentile());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(testSubjectStatModel2.getPossibleScore() > 0 ? testSubjectStatModel2.getScore() / ((double) testSubjectStatModel2.getPossibleScore()) : 0.0d, testSubjectStatModel.getPossibleScore() > 0 ? testSubjectStatModel.getScore() / ((double) testSubjectStatModel.getPossibleScore()) : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(com.marrow.data.models.test.TestIndex r9, java.lang.Double r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.read(com.marrow.data.models.test.TestIndex, java.lang.Double, o.SampleVideos):java.lang.Object");
    }

    public final void write(onPostExecute onpostexecute) {
        onOpen.read readVar;
        toMagicModuleMetaRepoModel.write(onpostexecute, "");
        getResolutionSize<onOpen> getresolutionsize = this.MediaBrowserCompatItemReceiver;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onpostexecute, onPostExecute.RemoteActionCompatParcelizer.INSTANCE)) {
            readVar = onOpen.write.INSTANCE;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onpostexecute, onPostExecute.write.INSTANCE)) {
            readVar = onOpen.AudioAttributesCompatParcelizer.INSTANCE;
        } else {
            if (!(onpostexecute instanceof onPostExecute.IconCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            onPostExecute.IconCompatParcelizer iconCompatParcelizer = (onPostExecute.IconCompatParcelizer) onpostexecute;
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer()) {
                if (!iconCompatParcelizer.AudioAttributesCompatParcelizer().write()) {
                    RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(), iconCompatParcelizer.write());
                    readVar = new onOpen.RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(), iconCompatParcelizer.write());
                } else {
                    readVar = onOpen.AudioAttributesCompatParcelizer.INSTANCE;
                }
            } else {
                readVar = new onOpen.read(iconCompatParcelizer.AudioAttributesCompatParcelizer().read());
            }
        }
        getresolutionsize.write(readVar);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestAnalyticsViewModel.this.new AudioAttributesCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(final String str) {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.logEventNoInterceptor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestAnalyticsViewModel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str, (String) obj2);
            }
        });
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r14.MediaBrowserCompatItemReceiver
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L38
                if (r1 == r3) goto L34
                if (r1 == r4) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r0 = r14.AudioAttributesCompatParcelizer
                o.checkGlError r0 = (kotlin.checkGlError) r0
                java.lang.Object r1 = r14.write
                o.getLocaleLanguageTagV21 r1 = (kotlin.getLocaleLanguageTagV21) r1
                java.lang.Object r2 = r14.IconCompatParcelizer
                com.marrow.data.models.test.TestIndex r2 = (com.marrow.data.models.test.TestIndex) r2
                kotlin.SdkPayloadData.IconCompatParcelizer(r15)
                r7 = r0
                r8 = r2
                goto Lac
            L24:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L2c:
                java.lang.Object r1 = r14.IconCompatParcelizer
                com.marrow.data.models.test.TestIndex r1 = (com.marrow.data.models.test.TestIndex) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r15)
                goto L6e
            L34:
                kotlin.SdkPayloadData.IconCompatParcelizer(r15)
                goto L56
            L38:
                kotlin.SdkPayloadData.IconCompatParcelizer(r15)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r15 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.crc32 r15 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.MediaBrowserCompatCustomActionResultReceiver(r15)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.onProviderInstallFailed r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.AudioAttributesCompatParcelizer(r1)
                java.lang.String r1 = r1.getWrite()
                r5 = r14
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r14.MediaBrowserCompatItemReceiver = r3
                java.lang.Object r15 = r15.read(r1, r5)
                if (r15 == r0) goto Lbe
            L56:
                com.marrow.data.models.test.TestIndex r15 = (com.marrow.data.models.test.TestIndex) r15
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.getDisplaySizeV17 r1 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.MediaBrowserCompatItemReceiver(r1)
                r3 = r14
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r14.IconCompatParcelizer = r15
                r14.MediaBrowserCompatItemReceiver = r4
                java.lang.Object r1 = r1.onPlay(r3)
                if (r1 == r0) goto Lbe
                r13 = r1
                r1 = r15
                r15 = r13
            L6e:
                o.getLocaleLanguageTagV21 r15 = (kotlin.getLocaleLanguageTagV21) r15
                java.lang.String r7 = r14.RemoteActionCompatParcelizer
                o.checkEglException r3 = new o.checkEglException
                r6 = -2
                r8 = 0
                r10 = 0
                r11 = 0
                r5 = r3
                r5.<init>(r6, r7, r8, r10, r11)
                o.checkGlError r5 = new o.checkGlError
                r6 = 0
                r5.<init>(r3, r6, r4, r6)
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r3 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                o.checkEglException r4 = r5.getRemoteActionCompatParcelizer()
                if (r4 == 0) goto L94
                double r7 = r4.RemoteActionCompatParcelizer()
                java.lang.Double r4 = kotlin.QBankStatsResponse.write(r7)
                goto L95
            L94:
                r4 = r6
            L95:
                r7 = r14
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r14.IconCompatParcelizer = r1
                r14.write = r15
                r14.read = r6
                r14.AudioAttributesCompatParcelizer = r5
                r14.MediaBrowserCompatItemReceiver = r2
                java.lang.Object r2 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.IconCompatParcelizer(r3, r1, r4, r7)
                if (r2 != r0) goto La9
                goto Lbe
            La9:
                r8 = r1
                r7 = r5
                r1 = r15
            Lac:
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel r6 = com.marrow2.ui.test.analytics.TestAnalyticsViewModel.this
                java.lang.String r9 = r1.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
                java.lang.String r10 = r1.onCommand()
                r11 = 0
                r12 = 1
                com.marrow2.ui.test.analytics.TestAnalyticsViewModel.read(r6, r7, r8, r9, r10, r11, r12)
                o.getShowPopup r14 = kotlin.getShowPopup.INSTANCE
                return r14
            Lbe:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestAnalyticsViewModel.this.new write(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(TestAnalyticsViewModel testAnalyticsViewModel, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(testAnalyticsViewModel), testAnalyticsViewModel.new write(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.doStartService
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestAnalyticsViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ TestIndex write;

        /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(TestIndex testIndex, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = testIndex;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestAnalyticsViewModel.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(TestIndex testIndex) {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(testIndex, null), new MagicModuleSubmissionRequestBody() { // from class: o.AppMeasurementSdk
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestAnalyticsViewModel.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(TestAnalyticsViewModel testAnalyticsViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(testAnalyticsViewModel.AudioAttributesCompatParcelizer, i, str, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String str, boolean z) {
        if (z) {
            return;
        }
        String str2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) str)) {
            return;
        }
        getLatestBitrateEstimate.MediaMetadataCompat.RemoteActionCompatParcelizer(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8 A[EDGE_INSN: B:74:0x00e8->B:39:0x00e8 BREAK  A[LOOP:0: B:13:0x0034->B:38:0x00bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(kotlin.checkGlError r27, com.marrow.data.models.test.TestIndex r28, java.lang.String r29, java.lang.String r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.analytics.TestAnalyticsViewModel.IconCompatParcelizer(o.checkGlError, com.marrow.data.models.test.TestIndex, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private static String RemoteActionCompatParcelizer(String str, String str2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ".", (Object) str2)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String string = sb.toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = toMagicModuleMetaRepoModel.read((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return string.subSequence(i, length + 1).toString();
    }

    private static setExpandedTitleTextSize.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i, TestIndex testIndex, String str, String str2) {
        return new setExpandedTitleTextSize.RemoteActionCompatParcelizer(str, true, i, "You", str2, true, testIndex.isAnonymous(), TileProvider.write, testIndex.getCorrect(), testIndex.getWrong(), testIndex.getSkipped(), getAudioUsageForStreamType.IconCompatParcelizer(getAudioUsageForStreamType.IconCompatParcelizer(testIndex), testIndex.getScore()), true);
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ getMediaMimeType IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            String str;
            String str2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending2 = TestAnalyticsViewModel.this.MediaMetadataCompat;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                String str3 = this.AudioAttributesCompatParcelizer;
                TestIndex testIndex = TestAnalyticsViewModel.this.onPause;
                TestIndex testIndex2 = null;
                if (testIndex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex = null;
                }
                String testType = testIndex.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = TestAnalyticsViewModel.this.onMediaButtonEvent;
                TestIndex testIndex3 = TestAnalyticsViewModel.this.onPause;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    testIndex2 = testIndex3;
                }
                this.RemoteActionCompatParcelizer = isseekpending2;
                this.write = interceptevent;
                this.read = str3;
                this.AudioAttributesImplBaseParcelizer = testType;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
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
                str = (String) this.read;
                isseekpending = (isSeekPending) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            isseekpending.write(interceptEvent.IconCompatParcelizer(str, str2, (String) obj, getCustomMimeTypeForCodec.read(this.IconCompatParcelizer)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(String str, getMediaMimeType getmediamimetype, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = getmediamimetype;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestAnalyticsViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String str, getMediaMimeType getmediamimetype) {
        if (this.onPause != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(str, getmediamimetype, null), new MagicModuleSubmissionRequestBody() { // from class: o.onRebind
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestAnalyticsViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
