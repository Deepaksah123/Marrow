package com.marrow2.ui.custom_module.introduction.viewmodel;

import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.filterByAuthorizedAccounts;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getColorInfo;
import kotlin.getCreatedOnDateMs;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.parseEac3SupplementalProperties;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setPassingYear;
import kotlin.setPasskeysSignInRequestOptions;
import kotlin.setPasswordRequestOptions;
import kotlin.setPreferImmediatelyAvailableCredentials;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.updatePitchMatrix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 u2\u00020\u0001:\u0001uB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\u000e\u0010C\u001a\u00020AH\u0082@¢\u0006\u0002\u0010DJ\b\u00102\u001a\u00020AH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020AH\u0002J\u0010\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u0010H\u0002J\u000e\u0010\u0019\u001a\u00020A2\u0006\u0010I\u001a\u00020JJ\b\u0010K\u001a\u00020AH\u0002J\b\u0010L\u001a\u00020AH\u0002J \u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020&H\u0002JA\u0010Q\u001a\u00020A2\u0006\u0010R\u001a\u00020\u001c2!\u0010S\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\bU\u0012\b\bV\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020A0T2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020A0YH\u0002J\u0018\u0010Z\u001a\u00020A2\u0006\u0010N\u001a\u00020-2\u0006\u0010[\u001a\u00020\u001cH\u0002J\u0018\u0010\\\u001a\u00020A2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020\u001cH\u0002J \u0010^\u001a\u00020A2\u0006\u0010_\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020-H\u0002J \u0010`\u001a\u00020A2\u0006\u0010[\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020-H\u0002J\b\u0010a\u001a\u00020AH\u0002J\u0016\u0010b\u001a\u00020A2\u0006\u0010c\u001a\u00020!H\u0082@¢\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020AH\u0002J\u0016\u0010f\u001a\u00020A2\u0006\u0010c\u001a\u00020!H\u0082@¢\u0006\u0002\u0010dJ\u0010\u0010g\u001a\u00020A2\u0006\u0010h\u001a\u00020\u0012H\u0002J\b\u0010i\u001a\u00020AH\u0002J\u0016\u0010j\u001a\u00020A2\u0006\u0010c\u001a\u00020!H\u0082@¢\u0006\u0002\u0010dJ\b\u0010k\u001a\u00020AH\u0002J\u001e\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020\u00122\u0006\u0010n\u001a\u00020&H\u0082@¢\u0006\u0002\u0010oJ\b\u0010p\u001a\u00020AH\u0002J\u0016\u0010q\u001a\u00020A2\u0006\u0010r\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010sJ\b\u0010t\u001a\u00020AH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0018\u00010!j\u0004\u0018\u0001`\"0 0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0018\u00010!j\u0004\u0018\u0001`\"0 0\u0014¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0016R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0 0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0 0\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0016R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040 0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040 0\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0016R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0016R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "customModuleUseCase", "Lcom/marrow2/domain/custom_module/CustomModuleUseCase;", "customModuleApiUseCase", "Lcom/marrow2/domain/custom_module/CustomModuleApiUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/custom_module/CustomModuleUseCase;Lcom/marrow2/domain/custom_module/CustomModuleApiUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_args", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationArgs;", "_error", "", "error", "Lkotlinx/coroutines/flow/StateFlow;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "_notifyEvent", "Lcom/marrow2/ui/custom_module/introduction/model/IntroductionActions;", "notifyEvent", "getNotifyEvent", "_cmExamTimerRemainingDuration", "", "cmExamTimerRemainingDuration", "getCmExamTimerRemainingDuration", "_existingModule", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "Lcom/marrow2/ui/custom_module/model/CustomModuleVMModel;", "existingModule", "getExistingModule", "_shouldShowLoaders", "", "shouldShowLoaders", "getShouldShowLoaders", "_shouldShowTicks", "shouldShowTicks", "getShouldShowTicks", "_animationIndex", "", "animationIndex", "getAnimationIndex", "_totalSubjects", "totalSubjects", "getTotalSubjects", "_customModuleHeaderInfo", "Lcom/marrow2/ui/custom_module/introduction/model/CustomModuleType;", "customModuleHeaderInfo", "getCustomModuleHeaderInfo", "_solveButtonState", "Lcom/marrow2/ui/custom_module/introduction/model/SolveButtonState;", "solveButtonState", "getSolveButtonState", "timerJob", "Lkotlinx/coroutines/Job;", "customModuleStatus", "isFromJoin", "deepLinkInviteCode", "setCustomModule", "", "init", "checkForDeepLink", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showLoader", "showTicks", "createCustomModule", "creationModel", "event", "Lcom/marrow2/ui/custom_module/introduction/model/IntroductionEvents;", "handleCMStatus", "handleNormalExam", "testProgress", "status", "isExpired", "isFacultyMode", "startTimer", "timerEndTimestampMs", "onTimerUpdate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "timeLeft", "onTimerExhausted", "Lkotlin/Function0;", "startEndTimer", "expiredOnTimeMs", "handleFutureTest", "startedOnTimeMs", "handleLiveTest", "submittedOnTimeMs", "handleExpiredTest", "handleTestWithStartEndTime", "afterDownloadCompleted", "customModule", "(Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAnimation", "startTest", "showReviewScreen", "cmId", "onSolveReviewButtonClicked", "openAppropriateScreenBasedOnCustomModuleStatus", "checkTestForExpiry", "fetchFromLocalDownloadIfNotExist", "id", "fetchDetail", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardCustomModule", "downloadCustomModuleQuestions", "customModuleId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromLocal", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleIntroductionViewModel extends POJOPropertyBuilderWithMember {
    public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(null);
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> AudioAttributesCompatParcelizer;
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<setPreferImmediatelyAvailableCredentials> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<Long> IconCompatParcelizer;
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<String> MediaBrowserCompatItemReceiver;
    private final isSeekPending MediaBrowserCompatMediaItem;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Integer>> MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getResolutionSize<setPasswordRequestOptions> MediaDescriptionCompat;
    private final setUpdatedStatus<Long> MediaMetadataCompat;
    private final setUpdatedStatus<Integer> RatingCompat;
    private final getResolutionSize<Integer> RemoteActionCompatParcelizer;
    private final getColorInfo handleMediaPlayPauseIfPendingOnHandler;
    private String onAddQueueItem;
    private int onCommand;
    private final getArray onCustomAction;
    private boolean onFastForward;
    private final setUpdatedStatus<String> onMediaButtonEvent;
    private final getPlatform onPause;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> onPlay;
    private final setUpdatedStatus<setPreferImmediatelyAvailableCredentials> onPlayFromMediaId;
    private setPassingYear onPlayFromSearch;
    private final setUpdatedStatus<setPasswordRequestOptions> onPlayFromUri;
    private final setUpdatedStatus<Boolean> onPrepare;
    private final POJOPropertyBuilder5 onPrepareFromMediaId;
    private final setUpdatedStatus<Boolean> onPrepareFromSearch;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Integer>> onPrepareFromUri;
    private final getResolutionSize<WorkAccountClient> read;

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        boolean MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return CustomModuleIntroductionViewModel.IconCompatParcelizer(CustomModuleIntroductionViewModel.this, (String) null, this);
        }
    }

    static final class onCustomAction extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return CustomModuleIntroductionViewModel.this.AudioAttributesCompatParcelizer((CustomModuleUCModel) null, this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return CustomModuleIntroductionViewModel.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public CustomModuleIntroductionViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, getArray getarray, getColorInfo getcolorinfo, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(getcolorinfo, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.onPrepareFromMediaId = pOJOPropertyBuilder5;
        this.onCustomAction = getarray;
        this.handleMediaPlayPauseIfPendingOnHandler = getcolorinfo;
        this.MediaBrowserCompatMediaItem = isseekpending;
        this.onPause = getplatform;
        WorkAccountClient.IconCompatParcelizer iconCompatParcelizer = WorkAccountClient.write;
        this.read = setStartTime.RemoteActionCompatParcelizer(WorkAccountClient.IconCompatParcelizer.read(pOJOPropertyBuilder5));
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.onMediaButtonEvent = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setPreferImmediatelyAvailableCredentials> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(setPreferImmediatelyAvailableCredentials.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Long> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(-1L);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onPlay = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onPrepareFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onPrepare = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Integer>> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPrepareFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer9;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<setPasswordRequestOptions> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer(setPasswordRequestOptions.write.INSTANCE);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer10;
        this.onPlayFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer10);
        onCommand();
    }

    public static final /* synthetic */ Object IconCompatParcelizer(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, String str, SampleVideos sampleVideos) {
        return customModuleIntroductionViewModel.write(str, false, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public final setUpdatedStatus<String> AudioAttributesImplBaseParcelizer() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<setPreferImmediatelyAvailableCredentials> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPlayFromMediaId;
    }

    public final setUpdatedStatus<Long> AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> MediaBrowserCompatItemReceiver() {
        return this.onPlay;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.onPrepareFromSearch;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<Integer> read() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Integer>> MediaBrowserCompatSearchResultReceiver() {
        return this.onPrepareFromUri;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<setPasswordRequestOptions> MediaMetadataCompat() {
        return this.onPlayFromUri;
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$MediaMetadataCompat$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ CustomModuleIntroductionViewModel IconCompatParcelizer;

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
            
                if (r5.IconCompatParcelizer.IconCompatParcelizer(r5) == r0) goto L26;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r5.AudioAttributesCompatParcelizer
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L9a
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L6f
                L1f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    o.getResolutionSize r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesImplApi21Parcelizer(r6)
                    java.lang.Object r6 = r6.IconCompatParcelizer()
                    o.WorkAccountClient r6 = (kotlin.WorkAccountClient) r6
                    com.marrow2.domain.custom_module.model.CustomModuleUCModel r6 = r6.getAudioAttributesImplApi21Parcelizer()
                    if (r6 != 0) goto L44
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    o.getResolutionSize r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesImplApi21Parcelizer(r6)
                    java.lang.Object r1 = r1.IconCompatParcelizer()
                    o.WorkAccountClient r1 = (kotlin.WorkAccountClient) r1
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.read(r6, r1)
                    goto L6f
                L44:
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaDescriptionCompat(r6)
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    o.getResolutionSize r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesImplApi21Parcelizer(r6)
                    java.lang.Object r1 = r1.IconCompatParcelizer()
                    o.WorkAccountClient r1 = (kotlin.WorkAccountClient) r1
                    com.marrow2.domain.custom_module.model.CustomModuleUCModel r1 = r1.getAudioAttributesImplApi21Parcelizer()
                    if (r1 == 0) goto L60
                    java.lang.String r1 = r1.getRead()
                    goto L61
                L60:
                    r1 = 0
                L61:
                    kotlin.toMagicModuleMetaRepoModel.write(r1)
                    r4 = r5
                    o.SampleVideos r4 = (kotlin.SampleVideos) r4
                    r5.AudioAttributesCompatParcelizer = r3
                    java.lang.Object r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.IconCompatParcelizer(r6, r1, r4)
                    if (r6 == r0) goto L9d
                L6f:
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    o.POJOPropertyBuilder5 r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaBrowserCompatItemReceiver(r6)
                    java.lang.String r1 = "deepLinkInviteCode"
                    boolean r6 = r6.IconCompatParcelizer(r1)
                    if (r6 == 0) goto L9a
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    o.POJOPropertyBuilder5 r3 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaBrowserCompatItemReceiver(r6)
                    java.lang.Object r1 = r3.write(r1)
                    java.lang.String r1 = (java.lang.String) r1
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesImplBaseParcelizer(r6, r1)
                    com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = r5.IconCompatParcelizer
                    r1 = r5
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r5.AudioAttributesCompatParcelizer = r2
                    java.lang.Object r5 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.IconCompatParcelizer(r6, r1)
                    if (r5 != r0) goto L9a
                    goto L9d
                L9a:
                    o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                    return r5
                L9d:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaMetadataCompat.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = customModuleIntroductionViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(CustomModuleIntroductionViewModel.this.onPause, new AnonymousClass4(CustomModuleIntroductionViewModel.this, null), this) == objIconCompatParcelizer) {
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

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPause() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.getNonce
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onCommand() {
        this.IconCompatParcelizer.write(-1L);
        setPassingYear setpassingyear = this.onPlayFromSearch;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.onPlayFromSearch = null;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null);
        this.onFastForward = this.read.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver();
        MediaDescriptionCompat();
        onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.write
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$write r0 = (com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$write r0 = new com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L78
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            java.lang.String r5 = r4.onAddQueueItem
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto Lb3
            int r5 = r5.length()
            if (r5 == 0) goto Lb3
            o.setUpdatedStatus<o.DataSourceBitmapLoaderExternalSyntheticLambda0<com.marrow2.domain.custom_module.model.CustomModuleUCModel>> r5 = r4.onPlay
            java.lang.Object r5 = r5.IconCompatParcelizer()
            o.DataSourceBitmapLoaderExternalSyntheticLambda0 r5 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r5
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer()
            if (r5 == 0) goto Lb3
            o.setUpdatedStatus<o.DataSourceBitmapLoaderExternalSyntheticLambda0<com.marrow2.domain.custom_module.model.CustomModuleUCModel>> r5 = r4.onPlay
            java.lang.Object r5 = r5.IconCompatParcelizer()
            o.DataSourceBitmapLoaderExternalSyntheticLambda0 r5 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r5
            java.lang.Object r5 = r5.read()
            com.marrow2.domain.custom_module.model.CustomModuleUCModel r5 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r5
            if (r5 == 0) goto L64
            java.lang.String r5 = r5.getAudioAttributesCompatParcelizer()
            goto L65
        L64:
            r5 = 0
        L65:
            java.lang.String r2 = r4.onAddQueueItem
            boolean r5 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r5, r2)
            if (r5 != 0) goto Lb3
            o.getArray r5 = r4.onCustomAction
            r0.read = r3
            java.lang.Object r5 = r5.AudioAttributesImplBaseParcelizer(r0)
            if (r5 != r1) goto L78
            return r1
        L78:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto La4
            o.getResolutionSize<o.setPreferImmediatelyAvailableCredentials> r5 = r4.AudioAttributesImplBaseParcelizer
            o.setUpdatedStatus<o.DataSourceBitmapLoaderExternalSyntheticLambda0<com.marrow2.domain.custom_module.model.CustomModuleUCModel>> r4 = r4.onPlay
            java.lang.Object r4 = r4.IconCompatParcelizer()
            o.DataSourceBitmapLoaderExternalSyntheticLambda0 r4 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r4
            java.lang.Object r4 = r4.RemoteActionCompatParcelizer()
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            com.marrow2.domain.custom_module.model.CustomModuleUCModel r4 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r4
            int r4 = r4.getMediaBrowserCompatMediaItem()
            r0 = 2
            if (r4 == r0) goto L9b
            r3 = 0
        L9b:
            o.setPreferImmediatelyAvailableCredentials$MediaBrowserCompatSearchResultReceiver r4 = new o.setPreferImmediatelyAvailableCredentials$MediaBrowserCompatSearchResultReceiver
            r4.<init>(r3)
            r5.write(r4)
            goto Lb3
        La4:
            o.getResolutionSize<o.setPreferImmediatelyAvailableCredentials> r5 = r4.AudioAttributesImplBaseParcelizer
            java.lang.String r4 = r4.onAddQueueItem
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            o.setPreferImmediatelyAvailableCredentials$IconCompatParcelizer r0 = new o.setPreferImmediatelyAvailableCredentials$IconCompatParcelizer
            r0.<init>(r4)
            r5.write(r0)
        Lb3:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$MediaBrowserCompatCustomActionResultReceiver$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ CustomModuleIntroductionViewModel AudioAttributesCompatParcelizer;
            private Object IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getResolutionSize getresolutionsize;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getResolutionSize getresolutionsize2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                    this.IconCompatParcelizer = getresolutionsize2;
                    this.RemoteActionCompatParcelizer = 1;
                    Object objAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.onCustomAction.AudioAttributesCompatParcelizer(this);
                    if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    obj = objAudioAttributesCompatParcelizer;
                    getresolutionsize = getresolutionsize2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = customModuleIntroductionViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(CustomModuleIntroductionViewModel.this.onPause, new AnonymousClass1(CustomModuleIntroductionViewModel.this, null), this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.BeginSignInRequestGoogleIdTokenRequestOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.AudioAttributesImplApi26Parcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.TRUE);
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromMediaId() {
        this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.TRUE);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ WorkAccountClient IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (r1.AudioAttributesImplApi26Parcelizer(r6) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L5f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3f
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaBrowserCompatSearchResultReceiver(r6)
                o.setPreferImmediatelyAvailableCredentials$MediaMetadataCompat r1 = o.setPreferImmediatelyAvailableCredentials.MediaMetadataCompat.INSTANCE
                r6.write(r1)
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                o.getColorInfo r6 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.write(r6)
                o.WorkAccountClient r1 = r5.IconCompatParcelizer
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.RemoteActionCompatParcelizer = r3
                java.lang.Object r6 = r6.read(r1, r4)
                if (r6 == r0) goto L62
            L3f:
                com.marrow2.domain.custom_module.model.CustomModuleUCModel r6 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r6
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                int r3 = r6.getMediaBrowserCompatMediaItem()
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesCompatParcelizer(r1, r3)
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                java.lang.String r6 = r6.getRead()
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r3 = 0
                r5.write = r3
                r5.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.read(r1, r6)
                if (r5 != r0) goto L5f
                goto L62
            L5f:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L62:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(WorkAccountClient workAccountClient, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = workAccountClient;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(WorkAccountClient workAccountClient) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(workAccountClient, null), new MagicModuleSubmissionRequestBody() { // from class: o.setSupported
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.read(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 1311) {
            customModuleIntroductionViewModel.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.handleMediaPlayPauseIfPendingOnHandler(str));
        } else if (i == 1312) {
            customModuleIntroductionViewModel.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.MediaBrowserCompatMediaItem(str));
        } else {
            customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        }
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(filterByAuthorizedAccounts filterbyauthorizedaccounts) throws Exception {
        String audioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(filterbyauthorizedaccounts, "");
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.AudioAttributesImplApi21Parcelizer) {
            filterByAuthorizedAccounts.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (filterByAuthorizedAccounts.AudioAttributesImplApi21Parcelizer) filterbyauthorizedaccounts;
            if (audioAttributesImplApi21Parcelizer.read() == 1311) {
                this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.handleMediaPlayPauseIfPendingOnHandler(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()));
                return;
            } else {
                this.MediaBrowserCompatItemReceiver.write(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer());
                return;
            }
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.AudioAttributesImplApi26Parcelizer) {
            String str = this.onAddQueueItem;
            if (str != null) {
                this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.IconCompatParcelizer(str));
                return;
            }
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaBrowserCompatSearchResultReceiver) {
            this.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.AudioAttributesImplBaseParcelizer.INSTANCE);
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaDescriptionCompat) {
            CustomModuleUCModel customModuleUCModel = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().read();
            if (customModuleUCModel == null || (audioAttributesCompatParcelizer = customModuleUCModel.getAudioAttributesCompatParcelizer()) == null) {
                return;
            }
            isSeekPending isseekpending = this.MediaBrowserCompatMediaItem;
            updatePitchMatrix updatepitchmatrix = updatePitchMatrix.INSTANCE;
            isseekpending.write(updatePitchMatrix.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer));
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.IconCompatParcelizer) {
            isSeekPending isseekpending2 = this.MediaBrowserCompatMediaItem;
            updatePitchMatrix updatepitchmatrix2 = updatePitchMatrix.INSTANCE;
            isseekpending2.write(updatePitchMatrix.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.write.INSTANCE);
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.write) {
            RatingCompat();
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaBrowserCompatCustomActionResultReceiver) {
            onPlay();
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.RemoteActionCompatParcelizer) {
            MediaBrowserCompatMediaItem();
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.read) {
            onMediaButtonEvent();
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.requestVerifiedPhoneNumber
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleIntroductionViewModel.MediaBrowserCompatMediaItem((String) obj2);
                }
            });
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.onCommand) {
            filterByAuthorizedAccounts.onCommand oncommand = (filterByAuthorizedAccounts.onCommand) filterbyauthorizedaccounts;
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.onMediaButtonEvent(oncommand.write(), oncommand.AudioAttributesCompatParcelizer()));
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.handleMediaPlayPauseIfPendingOnHandler) {
            this.read.write(((filterByAuthorizedAccounts.handleMediaPlayPauseIfPendingOnHandler) filterbyauthorizedaccounts).RemoteActionCompatParcelizer());
            onCustomAction();
            return;
        }
        if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.RatingCompat) {
            this.onAddQueueItem = ((filterByAuthorizedAccounts.RatingCompat) filterbyauthorizedaccounts).RemoteActionCompatParcelizer();
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(null), new MagicModuleSubmissionRequestBody() { // from class: o.getIdTokenDepositionScopes
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleIntroductionViewModel.MediaMetadataCompat((String) obj2);
                }
            });
        } else if (filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaBrowserCompatMediaItem) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(filterbyauthorizedaccounts, filterByAuthorizedAccounts.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatItemReceiver.write("");
        } else {
            if (!(filterbyauthorizedaccounts instanceof filterByAuthorizedAccounts.MediaMetadataCompat)) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.onCustomAction(((filterByAuthorizedAccounts.MediaMetadataCompat) filterbyauthorizedaccounts).IconCompatParcelizer()));
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(100L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleIntroductionViewModel.this.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (CustomModuleIntroductionViewModel.this.IconCompatParcelizer(this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CustomModuleUCModel customModuleUCModelRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (customModuleUCModelRemoteActionCompatParcelizer != null) {
            if (customModuleUCModelRemoteActionCompatParcelizer.getMediaMetadataCompat() != 0) {
                onAddQueueItem();
            } else {
                handleMediaPlayPauseIfPendingOnHandler();
            }
        }
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        CustomModuleUCModel customModuleUCModelRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (customModuleUCModelRemoteActionCompatParcelizer != null) {
            if (customModuleUCModelRemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer()) {
                Pair<String, String> pairAudioAttributesCompatParcelizer = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getIconCompatParcelizer() != 0 ? customModuleUCModelRemoteActionCompatParcelizer.getIconCompatParcelizer() : System.currentTimeMillis());
                Pair<String, String> pairAudioAttributesCompatParcelizer2 = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getRatingCompat() != 0 ? customModuleUCModelRemoteActionCompatParcelizer.getRatingCompat() : System.currentTimeMillis());
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, new setPasskeysSignInRequestOptions.write(pairAudioAttributesCompatParcelizer.IconCompatParcelizer(), pairAudioAttributesCompatParcelizer.write(), customModuleUCModelRemoteActionCompatParcelizer.getMediaBrowserCompatMediaItem(), pairAudioAttributesCompatParcelizer2.write(), pairAudioAttributesCompatParcelizer2.IconCompatParcelizer()));
            } else {
                Pair<String, String> pairAudioAttributesCompatParcelizer3 = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getWrite() != 0 ? customModuleUCModelRemoteActionCompatParcelizer.getWrite() : System.currentTimeMillis());
                Pair<String, String> pairAudioAttributesCompatParcelizer4 = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getRatingCompat() != 0 ? customModuleUCModelRemoteActionCompatParcelizer.getRatingCompat() : System.currentTimeMillis());
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, new setPasskeysSignInRequestOptions.RemoteActionCompatParcelizer(pairAudioAttributesCompatParcelizer3.write(), pairAudioAttributesCompatParcelizer3.IconCompatParcelizer(), customModuleUCModelRemoteActionCompatParcelizer.getMediaBrowserCompatMediaItem(), pairAudioAttributesCompatParcelizer4.write(), pairAudioAttributesCompatParcelizer4.IconCompatParcelizer()));
            }
            RemoteActionCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getMediaBrowserCompatMediaItem(), customModuleUCModelRemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer(), customModuleUCModelRemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer());
            if (customModuleUCModelRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer() <= 0 || customModuleUCModelRemoteActionCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() <= 0 || customModuleUCModelRemoteActionCompatParcelizer.getMediaBrowserCompatMediaItem() != 1) {
                return;
            }
            RemoteActionCompatParcelizer(customModuleUCModelRemoteActionCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() + (((long) customModuleUCModelRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()) * 1000), new getAnswerMap() { // from class: o.associateLinkedAccounts
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return CustomModuleIntroductionViewModel.write(this.RemoteActionCompatParcelizer, ((Long) obj).longValue());
                }
            }, new getCreatedOnDateMs() { // from class: o.BeginSignInRequestGoogleIdTokenRequestOptionsBuilder
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return CustomModuleIntroductionViewModel.onCustomAction(this.RemoteActionCompatParcelizer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, long j) {
        customModuleIntroductionViewModel.IconCompatParcelizer.write(Long.valueOf(j));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(CustomModuleIntroductionViewModel customModuleIntroductionViewModel) {
        customModuleIntroductionViewModel.IconCompatParcelizer.write(0L);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int i, boolean z, boolean z2) {
        if (i == 0) {
            this.MediaDescriptionCompat.write(new setPasswordRequestOptions.IconCompatParcelizer(z));
            return;
        }
        boolean z3 = true;
        if (i == 1) {
            if (z2 && z) {
                z3 = false;
            }
            this.MediaDescriptionCompat.write(new setPasswordRequestOptions.RemoteActionCompatParcelizer(z3));
            return;
        }
        if (i != 2) {
            return;
        }
        if (!z2) {
            z = true;
        }
        this.MediaDescriptionCompat.write(new setPasswordRequestOptions.read(z));
    }

    private final void RemoteActionCompatParcelizer(long j, getAnswerMap<? super Long, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        setPassingYear setpassingyear = this.onPlayFromSearch;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.onPlayFromSearch = null;
        this.onPlayFromSearch = C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(j, getanswermap, getcreatedondatems, null), 3);
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getAnswerMap<Long, getShowPopup> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        private /* synthetic */ long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            do {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.write;
                if (jCurrentTimeMillis < j) {
                    this.AudioAttributesCompatParcelizer.invoke(QBankStatsResponse.RemoteActionCompatParcelizer(j - System.currentTimeMillis()));
                    this.IconCompatParcelizer = 1;
                } else {
                    this.read.invoke();
                    return getShowPopup.INSTANCE;
                }
            } while (setCountry.IconCompatParcelizer(1000L, this) != objIconCompatParcelizer);
            return objIconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(long j, getAnswerMap<? super Long, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.write = j;
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.read = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write, this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(int i, long j) {
        setPassingYear setpassingyear = this.onPlayFromSearch;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.onPlayFromSearch = null;
        this.onPlayFromSearch = C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new onCommand(i, j, null), 3);
    }

    static final class onCommand extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ long read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                CustomModuleIntroductionViewModel.this.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, false, true);
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            while (this.read - System.currentTimeMillis() > 0) {
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(1000L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            }
            CustomModuleIntroductionViewModel.this.onAddQueueItem();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCommand(int i, long j, SampleVideos<? super onCommand> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.read = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new onCommand(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(long j, long j2) {
        Pair<String, String> pairAudioAttributesCompatParcelizer = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(j);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> getresolutionsize = this.AudioAttributesCompatParcelizer;
        String strIconCompatParcelizer = pairAudioAttributesCompatParcelizer.IconCompatParcelizer();
        String upperCase = pairAudioAttributesCompatParcelizer.write().toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        parseEac3SupplementalProperties parseeac3supplementalproperties = parseEac3SupplementalProperties.INSTANCE;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, new setPasskeysSignInRequestOptions.read(strIconCompatParcelizer, upperCase, parseEac3SupplementalProperties.write(j, j2)));
        this.MediaDescriptionCompat.write(setPasswordRequestOptions.AudioAttributesCompatParcelizer.INSTANCE);
        if (j - System.currentTimeMillis() < 900000) {
            RemoteActionCompatParcelizer(j, new getAnswerMap() { // from class: o.getLinkedServiceId
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return CustomModuleIntroductionViewModel.IconCompatParcelizer(this.write, ((Long) obj).longValue());
                }
            }, new getCreatedOnDateMs() { // from class: o.setFilterByAuthorizedAccounts
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return CustomModuleIntroductionViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, long j) {
        customModuleIntroductionViewModel.MediaDescriptionCompat.write(new setPasswordRequestOptions.AudioAttributesImplBaseParcelizer(parseEac3SupplementalProperties.RemoteActionCompatParcelizer(j)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(CustomModuleIntroductionViewModel customModuleIntroductionViewModel) {
        customModuleIntroductionViewModel.onAddQueueItem();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(long j, long j2, int i) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        Pair<String, String> pairAudioAttributesCompatParcelizer = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(j);
        Pair<String, String> pairAudioAttributesCompatParcelizer2 = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(j2);
        RemoteActionCompatParcelizer(i, false, true);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> getresolutionsize = this.AudioAttributesCompatParcelizer;
        String upperCase = pairAudioAttributesCompatParcelizer2.write().toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, new setPasskeysSignInRequestOptions.IconCompatParcelizer(upperCase, i, pairAudioAttributesCompatParcelizer.write(), pairAudioAttributesCompatParcelizer.IconCompatParcelizer()));
        IconCompatParcelizer(i, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(long j, long j2, int i) {
        Pair<String, String> pairAudioAttributesCompatParcelizer = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(j);
        Pair<String, String> pairAudioAttributesCompatParcelizer2 = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(j2);
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, new setPasskeysSignInRequestOptions.write(pairAudioAttributesCompatParcelizer.IconCompatParcelizer(), pairAudioAttributesCompatParcelizer.write(), i, pairAudioAttributesCompatParcelizer2.IconCompatParcelizer(), pairAudioAttributesCompatParcelizer2.write()));
        RemoteActionCompatParcelizer(i, true, true);
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CustomModuleUCModel customModuleUCModel = (CustomModuleUCModel) ((DataSourceBitmapLoaderExternalSyntheticLambda0) CustomModuleIntroductionViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).RemoteActionCompatParcelizer();
            if (customModuleUCModel != null) {
                CustomModuleIntroductionViewModel customModuleIntroductionViewModel = CustomModuleIntroductionViewModel.this;
                long mediaMetadataCompat = customModuleUCModel.getMediaMetadataCompat();
                long iconCompatParcelizer = customModuleUCModel.getIconCompatParcelizer();
                long ratingCompat = customModuleUCModel.getRatingCompat();
                int mediaBrowserCompatMediaItem = customModuleUCModel.getMediaBrowserCompatMediaItem();
                if (mediaMetadataCompat > System.currentTimeMillis()) {
                    customModuleIntroductionViewModel.write(mediaMetadataCompat, iconCompatParcelizer);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (mediaMetadataCompat <= jCurrentTimeMillis && jCurrentTimeMillis < iconCompatParcelizer) {
                    customModuleIntroductionViewModel.AudioAttributesCompatParcelizer(ratingCompat, iconCompatParcelizer, mediaBrowserCompatMediaItem);
                }
                if (iconCompatParcelizer < System.currentTimeMillis()) {
                    customModuleIntroductionViewModel.IconCompatParcelizer(iconCompatParcelizer, ratingCompat, mediaBrowserCompatMediaItem);
                }
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddQueueItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setServerClientId
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(CustomModuleUCModel customModuleUCModel, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(customModuleUCModel.getRead(), false, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        if (this.RatingCompat.IconCompatParcelizer().intValue() < 5) {
            this.RemoteActionCompatParcelizer.write(Integer.valueOf(this.RatingCompat.IconCompatParcelizer().intValue() + 1));
        } else {
            onPlayFromMediaId();
            this.RemoteActionCompatParcelizer.write(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (read(r7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(com.marrow2.domain.custom_module.model.CustomModuleUCModel r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.onCustomAction
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$onCustomAction r0 = (com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.onCustomAction) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$onCustomAction r0 = new com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel$onCustomAction
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.write
            com.marrow2.domain.custom_module.model.CustomModuleUCModel r6 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L88
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r7 = r0.write
            com.marrow2.domain.custom_module.model.CustomModuleUCModel r7 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L7c
        L44:
            java.lang.Object r7 = r0.write
            com.marrow2.domain.custom_module.model.CustomModuleUCModel r7 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5f
        L4c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getArray r8 = r6.onCustomAction
            java.lang.String r2 = r7.getRead()
            r0.write = r7
            r0.read = r5
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r2, r0)
            if (r8 == r1) goto L8b
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L7c
            o.getResolutionSize<o.setPreferImmediatelyAvailableCredentials> r8 = r6.AudioAttributesImplBaseParcelizer
            o.setPreferImmediatelyAvailableCredentials$read r2 = o.setPreferImmediatelyAvailableCredentials.read.INSTANCE
            r8.write(r2)
            java.lang.String r8 = r7.getRead()
            r0.write = r7
            r0.read = r4
            java.lang.Object r8 = r6.write(r8, r5, r0)
            if (r8 == r1) goto L8b
        L7c:
            r8 = 0
            r0.write = r8
            r0.read = r3
            java.lang.Object r6 = r6.read(r7, r0)
            if (r6 != r1) goto L88
            goto L8b
        L88:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.AudioAttributesCompatParcelizer(com.marrow2.domain.custom_module.model.CustomModuleUCModel, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat(String str) {
        isSeekPending isseekpending = this.MediaBrowserCompatMediaItem;
        updatePitchMatrix updatepitchmatrix = updatePitchMatrix.INSTANCE;
        isseekpending.write(updatePitchMatrix.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.MediaBrowserCompatItemReceiver(str));
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ CustomModuleIntroductionViewModel AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ CustomModuleUCModel write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r8.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(r8.write, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        
            if (r8.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(r8.write, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaDescriptionCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(CustomModuleUCModel customModuleUCModel, CustomModuleIntroductionViewModel customModuleIntroductionViewModel, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(1, sampleVideos);
            this.write = customModuleUCModel;
            this.AudioAttributesCompatParcelizer = customModuleIntroductionViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new MediaDescriptionCompat(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPlay() {
        CustomModuleUCModel customModuleUCModelRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (customModuleUCModelRemoteActionCompatParcelizer != null) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaDescriptionCompat(customModuleUCModelRemoteActionCompatParcelizer, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.setRequestJson
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleIntroductionViewModel.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final Object read(CustomModuleUCModel customModuleUCModel, SampleVideos<? super getShowPopup> sampleVideos) {
        CustomModuleUCModel customModuleUCModelRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        boolean z = customModuleUCModelRemoteActionCompatParcelizer != null && customModuleUCModelRemoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        if (this.onFastForward && !z) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.getRequestJson
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleIntroductionViewModel.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            this.onFastForward = false;
        }
        if (customModuleUCModel.getMediaBrowserCompatMediaItem() == 2) {
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.MediaBrowserCompatItemReceiver(customModuleUCModel.getRead()));
            return getShowPopup.INSTANCE;
        }
        isSeekPending isseekpending = this.MediaBrowserCompatMediaItem;
        updatePitchMatrix updatepitchmatrix = updatePitchMatrix.INSTANCE;
        isseekpending.write(updatePitchMatrix.AudioAttributesImplApi26Parcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, CustomModuleUCModel.IconCompatParcelizer(customModuleUCModel.read, customModuleUCModel.MediaBrowserCompatSearchResultReceiver, customModuleUCModel.MediaDescriptionCompat, 1, customModuleUCModel.onAddQueueItem, customModuleUCModel.write, customModuleUCModel.RatingCompat, customModuleUCModel.AudioAttributesCompatParcelizer, customModuleUCModel.AudioAttributesImplApi21Parcelizer, customModuleUCModel.AudioAttributesImplApi26Parcelizer, customModuleUCModel.handleMediaPlayPauseIfPendingOnHandler, customModuleUCModel.MediaBrowserCompatItemReceiver, customModuleUCModel.MediaBrowserCompatCustomActionResultReceiver, customModuleUCModel.IconCompatParcelizer, customModuleUCModel.MediaMetadataCompat, customModuleUCModel.AudioAttributesImplBaseParcelizer, customModuleUCModel.RemoteActionCompatParcelizer, customModuleUCModel.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() > 0 ? customModuleUCModel.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : System.currentTimeMillis()));
        int mode = customModuleUCModel.getMediaBrowserCompatSearchResultReceiver().getMode();
        if (mode == 0) {
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat(customModuleUCModel.getRead()));
        } else if (mode == 1) {
            this.AudioAttributesImplBaseParcelizer.write(new setPreferImmediatelyAvailableCredentials.AudioAttributesImplApi21Parcelizer(customModuleUCModel.getRead()));
        }
        Object objIconCompatParcelizer = this.onCustomAction.IconCompatParcelizer(customModuleUCModel.getRead(), (SampleVideos<? super Integer>) sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (CustomModuleIntroductionViewModel.this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(this) == objIconCompatParcelizer) {
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatMediaItem() {
        setPreferImmediatelyAvailableCredentials.RatingCompat ratingCompat;
        getResolutionSize<setPreferImmediatelyAvailableCredentials> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
        if (this.onCommand == 2) {
            ratingCompat = setPreferImmediatelyAvailableCredentials.onAddQueueItem.INSTANCE;
        } else {
            ratingCompat = setPreferImmediatelyAvailableCredentials.RatingCompat.INSTANCE;
        }
        getresolutionsize.write(ratingCompat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(java.lang.String r10, boolean r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.write(java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            CustomModuleIntroductionViewModel customModuleIntroductionViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((CustomModuleUCModel) ((DataSourceBitmapLoaderExternalSyntheticLambda0) CustomModuleIntroductionViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).RemoteActionCompatParcelizer()) != null) {
                    CustomModuleIntroductionViewModel customModuleIntroductionViewModel2 = CustomModuleIntroductionViewModel.this;
                    isSeekPending isseekpending = customModuleIntroductionViewModel2.MediaBrowserCompatMediaItem;
                    updatePitchMatrix updatepitchmatrix = updatePitchMatrix.INSTANCE;
                    isseekpending.write(updatePitchMatrix.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    getArray getarray = customModuleIntroductionViewModel2.onCustomAction;
                    this.write = customModuleIntroductionViewModel2;
                    this.RemoteActionCompatParcelizer = null;
                    this.read = 0;
                    this.IconCompatParcelizer = 1;
                    if (getarray.read(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    customModuleIntroductionViewModel = customModuleIntroductionViewModel2;
                } else {
                    CustomModuleIntroductionViewModel.this.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.AudioAttributesCompatParcelizer.INSTANCE);
                    return getShowPopup.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                customModuleIntroductionViewModel = (CustomModuleIntroductionViewModel) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            customModuleIntroductionViewModel.AudioAttributesImplBaseParcelizer.write(setPreferImmediatelyAvailableCredentials.onCommand.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.BeginSignInRequestPasskeyJsonRequestOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(5000, r10) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:26:0x0088). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.read
                r2 = 3
                r3 = 5
                r4 = 0
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2e
                if (r1 == r6) goto L28
                if (r1 == r5) goto L22
                if (r1 != r2) goto L1a
                int r1 = r10.RemoteActionCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L88
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L22:
                int r0 = r10.RemoteActionCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L6d
            L28:
                int r1 = r10.RemoteActionCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L53
            L2e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r11 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaBrowserCompatMediaItem(r11)
                r11 = 0
            L37:
                if (r11 >= r3) goto L8b
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                o.getColorInfo r1 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.write(r1)
                java.lang.String r7 = r10.IconCompatParcelizer
                r8 = r10
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r10.AudioAttributesCompatParcelizer = r4
                r10.RemoteActionCompatParcelizer = r11
                r10.read = r6
                java.lang.Object r1 = r1.RemoteActionCompatParcelizer(r7, r8)
                if (r1 == r0) goto L8a
                r9 = r1
                r1 = r11
                r11 = r9
            L53:
                com.marrow2.domain.custom_module.model.CustomModuleUCModel r11 = (com.marrow2.domain.custom_module.model.CustomModuleUCModel) r11
                int r7 = r11.getOnAddQueueItem()
                if (r7 != r5) goto L74
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r2 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                r6 = r10
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r10.AudioAttributesCompatParcelizer = r4
                r10.RemoteActionCompatParcelizer = r1
                r10.read = r5
                java.lang.Object r11 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.IconCompatParcelizer(r2, r11, r6)
                if (r11 == r0) goto L8a
                r0 = r1
            L6d:
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r11 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.handleMediaPlayPauseIfPendingOnHandler(r11)
                r11 = r0
                goto L8b
            L74:
                int r1 = r1 + 1
                r11 = r10
                o.SampleVideos r11 = (kotlin.SampleVideos) r11
                r10.AudioAttributesCompatParcelizer = r4
                r10.RemoteActionCompatParcelizer = r1
                r10.read = r2
                r7 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r11 = kotlin.setCountry.IconCompatParcelizer(r7, r11)
                if (r11 != r0) goto L88
                goto L8a
            L88:
                r11 = r1
                goto L37
            L8a:
                return r0
            L8b:
                if (r11 < r3) goto L98
                com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel r10 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.this
                o.getResolutionSize r10 = com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.MediaBrowserCompatCustomActionResultReceiver(r10)
                java.lang.String r11 = "Some error occurred while creating Custom Module"
                r10.write(r11)
            L98:
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesImplApi26Parcelizer(String str) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.setRequestVerifiedPhoneNumber
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (CustomModuleIntroductionViewModel.this.onCustomAction.read(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleIntroductionViewModel.this.MediaBrowserCompatItemReceiver.write(this.IconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CustomModuleIntroductionViewModel customModuleIntroductionViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 999) {
            customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write("Some error occurred while creating Custom Module");
        } else if (i == 1314) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(customModuleIntroductionViewModel), customModuleIntroductionViewModel.new AudioAttributesImplBaseParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.BeginSignInRequestPasskeyJsonRequestOptionsBuilder
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleIntroductionViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
                }
            });
        } else {
            customModuleIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        }
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (CustomModuleIntroductionViewModel.IconCompatParcelizer(CustomModuleIntroductionViewModel.this, this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatItemReceiver(String str, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleIntroductionViewModel.this.new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction() {
        String read2;
        CustomModuleUCModel audioAttributesImplApi21Parcelizer = this.read.IconCompatParcelizer().getAudioAttributesImplApi21Parcelizer();
        if (audioAttributesImplApi21Parcelizer == null || (read2 = audioAttributesImplApi21Parcelizer.getRead()) == null || CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(read2, null), new MagicModuleSubmissionRequestBody() { // from class: o.setNonce
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleIntroductionViewModel.MediaDescriptionCompat((String) obj2);
            }
        }) == null) {
            onCommand();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
