package com.marrow2.ui.video.revision_video;

import android.os.Process;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.ui.video.revision_video.VideoRevisionListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AttestationRequestBodyKt;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.VideoSessionResponseBody;
import kotlin.binarySearchCeil;
import kotlin.component3;
import kotlin.component4;
import kotlin.component5;
import kotlin.createEGLSurface;
import kotlin.getAnswerMap;
import kotlin.getCollegeName;
import kotlin.getDisplaySizeV17;
import kotlin.getFirstInstallDbVersion;
import kotlin.getFirstInstallTimeMs;
import kotlin.getLastDbVersion;
import kotlin.getLastUpdatedTimeMs;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getRetryPredicate;
import kotlin.getShowPopup;
import kotlin.getThemeState;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.getYearOfAdmission;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.setEndTimestamp;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toAttestationRequestBody;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002J\u000e\u0010.\u001a\u00020)H\u0082@¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0002J\u0012\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020:H\u0002J\u001f\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010A\u001a\u00020)H\u0002J\b\u0010B\u001a\u00020)H\u0002J\b\u0010C\u001a\u00020)H\u0002J\b\u0010D\u001a\u00020)H\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020GH\u0002J$\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I2\u0006\u0010F\u001a\u00020GH\u0002J\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020OH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006P"}, d2 = {"Lcom/marrow2/ui/video/revision_video/VideoRevisionListViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "videoListUseCase", "Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;", "subjectUseCase", "Lcom/marrow2/domain/subject/SubjectUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "subscriptionRepository", "Lcom/marrow2/data/subscription/repo/SubscriptionRepository;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;Lcom/marrow2/domain/subject/SubjectUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/data/subscription/repo/SubscriptionRepository;Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "args", "Lcom/marrow2/ui/video/revision_video/model/VideoRevisionListArgs;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/video/revision_video/model/RevisionScreenUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_zenAreaUiState", "Lcom/marrow2/ui/video/revision_video/model/RevisionProgressInfo;", "zenAreaUiState", "getZenAreaUiState", "_navigationEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/marrow2/ui/video/revision_video/model/VideoRevisionUiNavigationEvent;", "navigationEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "notifyEvent", "", "event", "Lcom/marrow2/ui/video/revision_video/model/RevisionScreenUiEvent;", "onInteractiveMcqNudgeClicked", "onMcqDiscussionCardDiscovered", "initInteractiveMcqNudgeVisibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewPlanClick", "onScrolledToIndex", "onIndexFilterClicked", "index", "Lcom/marrow2/ui/video/revision_video/model/IndexItemModel;", "hideIndexUi", "loadRevisionData", "loadLinkedSubjectData", "refetchRevisionData", "preserveExpandedState", "", "updateSubjectExpansion", "subjectId", "", "expand", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toggleSubjectExpansion", "showProDialog", "hideProDialog", "navigateBack", "navigateToIndex", "onTabSelected", "tab", "Lcom/marrow2/ui/video/revision_video/model/RevisionTab;", "filterSubjectsByTab", "", "Lcom/marrow2/ui/video/revision_video/model/RevisionSubject;", FilterParams.KEY_SUBJECTS, "handleLessonVideoClick", "subjectTitle", "revisionVideoLesson", "Lcom/marrow2/ui/video/revision_video/model/RevisionVideoLesson;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoRevisionListViewModel extends POJOPropertyBuilderWithMember {
    private final toAttestationRequestBody AudioAttributesCompatParcelizer;
    private final createEGLSurface AudioAttributesImplApi21Parcelizer;
    private final getPlatform AudioAttributesImplApi26Parcelizer;
    private final LogLogLevel AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<getFirstInstallTimeMs> IconCompatParcelizer;
    private final binarySearchCeil MediaBrowserCompatCustomActionResultReceiver;
    private final isDark<AttestationRequestBodyKt> MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<component3> MediaBrowserCompatSearchResultReceiver;
    private final getDisplaySizeV17 MediaDescriptionCompat;
    private final lambdanewSingleThreadScheduledExecutor4 MediaMetadataCompat;
    private final setUpdatedStatus<getFirstInstallTimeMs> RatingCompat;
    private final isSeekPending RemoteActionCompatParcelizer;
    private final getResolutionSize<component3> read;
    private final ThemeState<AttestationRequestBodyKt> write;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getLastUpdatedTimeMs.values().length];
            try {
                iArr[getLastUpdatedTimeMs.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getLastUpdatedTimeMs.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getLastUpdatedTimeMs.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getLastUpdatedTimeMs.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getLastUpdatedTimeMs.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int read;
        /* synthetic */ Object write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return VideoRevisionListViewModel.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public VideoRevisionListViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, binarySearchCeil binarysearchceil, getDisplaySizeV17 getdisplaysizev17, createEGLSurface createeglsurface, LogLogLevel logLogLevel, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(createeglsurface, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.MediaMetadataCompat = lambdanewsinglethreadscheduledexecutor4;
        this.MediaBrowserCompatCustomActionResultReceiver = binarysearchceil;
        this.MediaDescriptionCompat = getdisplaysizev17;
        this.AudioAttributesImplApi21Parcelizer = createeglsurface;
        this.AudioAttributesImplBaseParcelizer = logLogLevel;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.AudioAttributesImplApi26Parcelizer = getplatform;
        toAttestationRequestBody.Companion companion = toAttestationRequestBody.INSTANCE;
        this.AudioAttributesCompatParcelizer = toAttestationRequestBody.Companion.IconCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<getFirstInstallTimeMs> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getFirstInstallTimeMs(true, null, null, null, null, false, false, null, null, false, false, false, false, 8190, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<component3> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(null);
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        ThemeState<AttestationRequestBodyKt> themeStateAudioAttributesCompatParcelizer = getThemeState.AudioAttributesCompatParcelizer(0, 0, null, 7);
        this.write = themeStateAudioAttributesCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) themeStateAudioAttributesCompatParcelizer);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new MagicModuleSubmissionRequestBody() { // from class: o.getHideDialog
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onAddQueueItem((String) obj2);
            }
        });
    }

    public final setUpdatedStatus<getFirstInstallTimeMs> read() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<component3> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final isDark<AttestationRequestBodyKt> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoRevisionListViewModel AudioAttributesImplApi21Parcelizer;
            private Object IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private /* synthetic */ Object read;
            private Object write;

            /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$5$3$write */
            static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ VideoRevisionListViewModel AudioAttributesCompatParcelizer;
                private int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.write = 1;
                        if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this) == objIconCompatParcelizer) {
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
                write(VideoRevisionListViewModel videoRevisionListViewModel, SampleVideos<? super write> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = videoRevisionListViewModel;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new write(this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.read;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read = null;
                    this.write = null;
                    this.IconCompatParcelizer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.AudioAttributesCompatParcelizer = 1;
                    if (setEndTimestamp.IconCompatParcelizer(new getYearOfAdmission[]{setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new write(this.AudioAttributesImplApi21Parcelizer, null)), setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null)), setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null))}, this) == objIconCompatParcelizer) {
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

            /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$5$3$AudioAttributesCompatParcelizer */
            static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private int read;
                private /* synthetic */ VideoRevisionListViewModel write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.write.AudioAttributesImplApi26Parcelizer();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AudioAttributesCompatParcelizer(VideoRevisionListViewModel videoRevisionListViewModel, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.write = videoRevisionListViewModel;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new AudioAttributesCompatParcelizer(this.write, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$5$3$RemoteActionCompatParcelizer */
            static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                private /* synthetic */ VideoRevisionListViewModel IconCompatParcelizer;
                private int RemoteActionCompatParcelizer;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    getYear.IconCompatParcelizer();
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                RemoteActionCompatParcelizer(VideoRevisionListViewModel videoRevisionListViewModel, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = videoRevisionListViewModel;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(VideoRevisionListViewModel videoRevisionListViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi21Parcelizer = videoRevisionListViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.AudioAttributesImplApi21Parcelizer, sampleVideos);
                anonymousClass3.read = obj;
                return anonymousClass3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoRevisionListViewModel.this.AudioAttributesImplApi26Parcelizer, new AnonymousClass3(VideoRevisionListViewModel.this, null), this) == objIconCompatParcelizer) {
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

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void read(component5 component5Var) {
        toMagicModuleMetaRepoModel.write(component5Var, "");
        if (component5Var instanceof component5.MediaMetadataCompat) {
            onSetRepeatMode(((component5.MediaMetadataCompat) component5Var).AudioAttributesCompatParcelizer());
            return;
        }
        if (component5Var instanceof component5.RemoteActionCompatParcelizer) {
            MediaBrowserCompatSearchResultReceiver();
            return;
        }
        if (component5Var instanceof component5.IconCompatParcelizer) {
            MediaBrowserCompatMediaItem();
            return;
        }
        if (component5Var instanceof component5.onCustomAction) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (component5Var instanceof component5.handleMediaPlayPauseIfPendingOnHandler) {
            RemoteActionCompatParcelizer(((component5.handleMediaPlayPauseIfPendingOnHandler) component5Var).IconCompatParcelizer());
            return;
        }
        if (component5Var instanceof component5.AudioAttributesImplApi21Parcelizer) {
            component5.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (component5.AudioAttributesImplApi21Parcelizer) component5Var;
            write(audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), audioAttributesImplApi21Parcelizer.read());
            return;
        }
        if (component5Var instanceof component5.MediaBrowserCompatItemReceiver) {
            RemoteActionCompatParcelizer(((component5.MediaBrowserCompatItemReceiver) component5Var).write());
            return;
        }
        if (component5Var instanceof component5.write) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (!(component5Var instanceof component5.AudioAttributesImplBaseParcelizer)) {
            if (!(component5Var instanceof component5.MediaBrowserCompatMediaItem)) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.onCommand.INSTANCE)) {
                    onCustomAction();
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.read.INSTANCE)) {
                    AudioAttributesImplBaseParcelizer();
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.onAddQueueItem.INSTANCE)) {
                    AudioAttributesImplApi21Parcelizer();
                    return;
                }
                if (component5Var instanceof component5.MediaDescriptionCompat) {
                    RatingCompat();
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.AudioAttributesCompatParcelizer.INSTANCE)) {
                    getResolutionSize<component3> getresolutionsize = this.read;
                    component3 component3VarIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                    getresolutionsize.write(component3VarIconCompatParcelizer != null ? component3.write(component3VarIconCompatParcelizer.read, component3VarIconCompatParcelizer.write, component3VarIconCompatParcelizer.AudioAttributesCompatParcelizer, component3VarIconCompatParcelizer.IconCompatParcelizer, false) : null);
                    return;
                } else {
                    if (component5Var instanceof component5.MediaBrowserCompatCustomActionResultReceiver) {
                        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaDescriptionCompat(component5Var, null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultretryPredicate
                            @Override // kotlin.MagicModuleSubmissionRequestBody
                            public final Object invoke(Object obj, Object obj2) {
                                return VideoRevisionListViewModel.onPrepare((String) obj2);
                            }
                        });
                        return;
                    }
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.RatingCompat.INSTANCE)) {
                        MediaBrowserCompatCustomActionResultReceiver();
                        return;
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                        MediaMetadataCompat();
                        return;
                    } else {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(component5Var, component5.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        MediaDescriptionCompat();
                        return;
                    }
                }
            }
            IconCompatParcelizer(true);
            return;
        }
        IconCompatParcelizer(true);
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ component5 read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = VideoRevisionListViewModel.this.RemoteActionCompatParcelizer;
                getRetryPredicate getretrypredicate = getRetryPredicate.INSTANCE;
                isseekpending.write(getRetryPredicate.AudioAttributesCompatParcelizer(((component5.MediaBrowserCompatCustomActionResultReceiver) this.read).IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.IconCompatParcelizer = 1;
                if (VideoRevisionListViewModel.this.write.IconCompatParcelizer(new AttestationRequestBodyKt.IconCompatParcelizer(((component5.MediaBrowserCompatCustomActionResultReceiver) this.read).IconCompatParcelizer(), ((component5.MediaBrowserCompatCustomActionResultReceiver) this.read).AudioAttributesCompatParcelizer()), this) == objIconCompatParcelizer) {
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
        MediaDescriptionCompat(component5 component5Var, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(1, sampleVideos);
            this.read = component5Var;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new MediaDescriptionCompat(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        
            if (r21.write.write.IconCompatParcelizer(o.AttestationRequestBodyKt.read.INSTANCE, r21) == r1) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.AudioAttributesCompatParcelizer
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                kotlin.SdkPayloadData.IconCompatParcelizer(r22)
                goto L72
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r22)
                goto L5e
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r22)
                com.marrow2.ui.video.revision_video.VideoRevisionListViewModel r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.this
                o.getResolutionSize r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatCustomActionResultReceiver(r2)
            L29:
                java.lang.Object r5 = r2.IconCompatParcelizer()
                r6 = r5
                o.getFirstInstallTimeMs r6 = (kotlin.getFirstInstallTimeMs) r6
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
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 4095(0xfff, float:5.738E-42)
                o.getFirstInstallTimeMs r6 = kotlin.getFirstInstallTimeMs.IconCompatParcelizer(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r5 = r2.AudioAttributesCompatParcelizer(r5, r6)
                if (r5 == 0) goto L29
                com.marrow2.ui.video.revision_video.VideoRevisionListViewModel r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.this
                o.getDisplaySizeV17 r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.AudioAttributesImplBaseParcelizer(r2)
                r5 = r0
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r0.AudioAttributesCompatParcelizer = r4
                java.lang.Object r2 = r2.onSetShuffleMode(r5)
                if (r2 == r1) goto L75
            L5e:
                com.marrow2.ui.video.revision_video.VideoRevisionListViewModel r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.this
                o.ThemeState r2 = com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatItemReceiver(r2)
                o.AttestationRequestBodyKt$read r4 = o.AttestationRequestBodyKt.read.INSTANCE
                r5 = r0
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r0.AudioAttributesCompatParcelizer = r3
                java.lang.Object r0 = r2.IconCompatParcelizer(r4, r5)
                if (r0 != r1) goto L72
                goto L75
            L72:
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            L75:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatMediaItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultloading
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onSeekTo((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSeekTo(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems;
            Object objIconCompatParcelizer2 = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer()).getRead()) {
                    getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
                    do {
                        objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                        getfirstinstalltimems = (getFirstInstallTimeMs) objIconCompatParcelizer;
                    } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false)));
                    this.IconCompatParcelizer = 1;
                    if (VideoRevisionListViewModel.this.MediaDescriptionCompat.onSetShuffleMode(this) == objIconCompatParcelizer2) {
                        return objIconCompatParcelizer2;
                    }
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
            return VideoRevisionListViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultsentry
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onRewind((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRewind(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatItemReceiver
            if (r2 == 0) goto L18
            r2 = r1
            com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$MediaBrowserCompatItemReceiver r2 = (com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatItemReceiver) r2
            int r3 = r2.read
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.read
            int r1 = r1 + r4
            r2.read = r1
            goto L1d
        L18:
            com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$MediaBrowserCompatItemReceiver r2 = new com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$MediaBrowserCompatItemReceiver
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.write
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.read
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L5d
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L4a
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.lambdanewSingleThreadScheduledExecutor4 r1 = r0.MediaMetadataCompat
            r2.read = r6
            java.lang.Object r1 = r1.write(r2)
            if (r1 == r3) goto L90
        L4a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L65
            o.getDisplaySizeV17 r1 = r0.MediaDescriptionCompat
            r2.read = r5
            java.lang.Object r1 = r1.onPrepareFromSearch(r2)
            if (r1 != r3) goto L5d
            goto L90
        L5d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L66
        L65:
            r6 = 0
        L66:
            o.getResolutionSize<o.getFirstInstallTimeMs> r0 = r0.IconCompatParcelizer
        L68:
            java.lang.Object r1 = r0.IconCompatParcelizer()
            r7 = r1
            o.getFirstInstallTimeMs r7 = (kotlin.getFirstInstallTimeMs) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 4095(0xfff, float:5.738E-42)
            r20 = r6
            o.getFirstInstallTimeMs r2 = kotlin.getFirstInstallTimeMs.IconCompatParcelizer(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0.AudioAttributesCompatParcelizer(r1, r2)
            if (r1 == 0) goto L68
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
                getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer();
                getresolutionsize.write(getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false));
                this.IconCompatParcelizer = 1;
                if (VideoRevisionListViewModel.this.write.IconCompatParcelizer(AttestationRequestBodyKt.MediaBrowserCompatCustomActionResultReceiver.INSTANCE, this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getLoading
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onMediaButtonEvent((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VideoRevisionListViewModel.this.write.IconCompatParcelizer(AttestationRequestBodyKt.AudioAttributesCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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
            return VideoRevisionListViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.lambdadefaultretryPredicate41a513e91
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onRemoveQueueItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRemoveQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ component4 RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems;
            ArrayList arrayList;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
            component4 component4Var = this.RemoteActionCompatParcelizer;
            do {
                objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                getfirstinstalltimems = (getFirstInstallTimeMs) objIconCompatParcelizer;
                List<component4> listRemoteActionCompatParcelizer = getfirstinstalltimems.RemoteActionCompatParcelizer();
                arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
                for (component4 component4Var2 : listRemoteActionCompatParcelizer) {
                    arrayList.add(component4.IconCompatParcelizer(component4Var2.read, component4Var2.RemoteActionCompatParcelizer, component4Var2.AudioAttributesCompatParcelizer, toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) component4Var2.getRead(), (Object) component4Var.getRead())));
                }
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : arrayList, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false)));
            VideoRevisionListViewModel.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.getRead(), QBankStatsResponse.AudioAttributesCompatParcelizer(true));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(component4 component4Var, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = component4Var;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(component4 component4Var) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(component4Var, null), new MagicModuleSubmissionRequestBody() { // from class: o.getRqdata
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPlayFromSearch((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
            do {
                objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                getfirstinstalltimems = (getFirstInstallTimeMs) objIconCompatParcelizer;
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false)));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultresetOnTimeout
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPlay((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlay(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaMetadataCompat;
        private int RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0148 A[Catch: Exception -> 0x021a, LOOP:0: B:33:0x0142->B:35:0x0148, LOOP_END, TryCatch #0 {Exception -> 0x021a, blocks: (B:10:0x003e, B:44:0x01e1, B:40:0x01ac, B:46:0x020f, B:15:0x0060, B:39:0x019b, B:18:0x0071, B:32:0x012c, B:33:0x0142, B:35:0x0148, B:36:0x0170, B:21:0x007d, B:29:0x0102, B:22:0x0084, B:27:0x00d9, B:25:0x00be), top: B:54:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x020f A[Catch: Exception -> 0x021a, TRY_LEAVE, TryCatch #0 {Exception -> 0x021a, blocks: (B:10:0x003e, B:44:0x01e1, B:40:0x01ac, B:46:0x020f, B:15:0x0060, B:39:0x019b, B:18:0x0071, B:32:0x012c, B:33:0x0142, B:35:0x0148, B:36:0x0170, B:21:0x007d, B:29:0x0102, B:22:0x0084, B:27:0x00d9, B:25:0x00be), top: B:54:0x000e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01df -> B:44:0x01e1). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instruction units count: 579
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultsize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPrepareFromSearch((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromSearch(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        public static int AudioAttributesCompatParcelizer;
        public static int RemoteActionCompatParcelizer;
        private int read;

        /* JADX INFO: renamed from: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel$MediaBrowserCompatCustomActionResultReceiver$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoRevisionListViewModel IconCompatParcelizer;
            private Object write;

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
            
                if (r2 == r1) goto L45;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 243
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.MediaBrowserCompatCustomActionResultReceiver.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(VideoRevisionListViewModel videoRevisionListViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = videoRevisionListViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoRevisionListViewModel.this.AudioAttributesImplApi26Parcelizer, new AnonymousClass3(VideoRevisionListViewModel.this, null), this) == objIconCompatParcelizer) {
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
            return VideoRevisionListViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        public static int write() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 8288698;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iMyTid = Process.myTid();
            AudioAttributesCompatParcelizer = iMyTid;
            return iMyTid;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.getJsSrc
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPause((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPause(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onAddQueueItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:46:0x014e A[Catch: Exception -> 0x0239, LOOP:0: B:44:0x0148->B:46:0x014e, LOOP_END, TryCatch #0 {Exception -> 0x0239, blocks: (B:7:0x0022, B:43:0x0131, B:44:0x0148, B:46:0x014e, B:47:0x0174, B:48:0x0194, B:50:0x019a, B:51:0x01c1, B:53:0x01cf, B:58:0x01dd, B:60:0x01e3, B:68:0x0219, B:70:0x0227, B:73:0x022e, B:65:0x01ee, B:66:0x01f4, B:12:0x003e, B:39:0x00fe, B:15:0x0049, B:17:0x005a, B:18:0x0079, B:20:0x007f, B:22:0x0097, B:24:0x009d, B:26:0x00b1, B:27:0x00bb, B:29:0x00c1, B:33:0x00d0, B:35:0x00d4, B:36:0x00d8, B:25:0x00ad), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x019a A[Catch: Exception -> 0x0239, LOOP:1: B:48:0x0194->B:50:0x019a, LOOP_END, TryCatch #0 {Exception -> 0x0239, blocks: (B:7:0x0022, B:43:0x0131, B:44:0x0148, B:46:0x014e, B:47:0x0174, B:48:0x0194, B:50:0x019a, B:51:0x01c1, B:53:0x01cf, B:58:0x01dd, B:60:0x01e3, B:68:0x0219, B:70:0x0227, B:73:0x022e, B:65:0x01ee, B:66:0x01f4, B:12:0x003e, B:39:0x00fe, B:15:0x0049, B:17:0x005a, B:18:0x0079, B:20:0x007f, B:22:0x0097, B:24:0x009d, B:26:0x00b1, B:27:0x00bb, B:29:0x00c1, B:33:0x00d0, B:35:0x00d4, B:36:0x00d8, B:25:0x00ad), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ee A[Catch: Exception -> 0x0239, TryCatch #0 {Exception -> 0x0239, blocks: (B:7:0x0022, B:43:0x0131, B:44:0x0148, B:46:0x014e, B:47:0x0174, B:48:0x0194, B:50:0x019a, B:51:0x01c1, B:53:0x01cf, B:58:0x01dd, B:60:0x01e3, B:68:0x0219, B:70:0x0227, B:73:0x022e, B:65:0x01ee, B:66:0x01f4, B:12:0x003e, B:39:0x00fe, B:15:0x0049, B:17:0x005a, B:18:0x0079, B:20:0x007f, B:22:0x0097, B:24:0x009d, B:26:0x00b1, B:27:0x00bb, B:29:0x00c1, B:33:0x00d0, B:35:0x00d4, B:36:0x00d8, B:25:0x00ad), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x022e A[Catch: Exception -> 0x0239, TRY_LEAVE, TryCatch #0 {Exception -> 0x0239, blocks: (B:7:0x0022, B:43:0x0131, B:44:0x0148, B:46:0x014e, B:47:0x0174, B:48:0x0194, B:50:0x019a, B:51:0x01c1, B:53:0x01cf, B:58:0x01dd, B:60:0x01e3, B:68:0x0219, B:70:0x0227, B:73:0x022e, B:65:0x01ee, B:66:0x01f4, B:12:0x003e, B:39:0x00fe, B:15:0x0049, B:17:0x005a, B:18:0x0079, B:20:0x007f, B:22:0x0097, B:24:0x009d, B:26:0x00b1, B:27:0x00bb, B:29:0x00c1, B:33:0x00d0, B:35:0x00d4, B:36:0x00d8, B:25:0x00ad), top: B:79:0x000c }] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.onAddQueueItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onAddQueueItem(boolean z, SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new onAddQueueItem(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onAddQueueItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(boolean z) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onAddQueueItem(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.defaulttokenExpiration
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPrepareFromUri((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromUri(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Boolean AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
        
            if (r21.MediaBrowserCompatCustomActionResultReceiver.write.IconCompatParcelizer(new o.AttestationRequestBodyKt.AudioAttributesImplApi26Parcelizer(r21.RemoteActionCompatParcelizer), r21) == r1) goto L27;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.handleMediaPlayPauseIfPendingOnHandler.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        handleMediaPlayPauseIfPendingOnHandler(Boolean bool, String str, SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = bool;
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String str, Boolean bool) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new handleMediaPlayPauseIfPendingOnHandler(bool, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.getEndpoint
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onSetPlaybackSpeed((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetPlaybackSpeed(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onSetRepeatMode(String str) {
        Object next;
        Iterator<T> it = this.IconCompatParcelizer.IconCompatParcelizer().MediaMetadataCompat().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((getFirstInstallDbVersion) next).getRead(), (Object) str)) {
                    break;
                }
            }
        }
        getFirstInstallDbVersion getfirstinstalldbversion = (getFirstInstallDbVersion) next;
        AudioAttributesCompatParcelizer(str, toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfirstinstalldbversion != null ? getfirstinstalldbversion.getAudioAttributesCompatParcelizer() : null, Boolean.TRUE) ? null : Boolean.TRUE);
    }

    static final class onCommand extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer();
            getresolutionsize.write(getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : true, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false));
            return getShowPopup.INSTANCE;
        }

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new onCommand(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCommand(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultlocale
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onSetRating((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSetRating(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer();
            getresolutionsize.write(getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getImghost
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPlayFromMediaId((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (VideoRevisionListViewModel.this.write.IconCompatParcelizer(AttestationRequestBodyKt.RemoteActionCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getResetOnTimeout
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPlayFromUri((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromUri(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            isSeekPending isseekpending = VideoRevisionListViewModel.this.RemoteActionCompatParcelizer;
            getRetryPredicate getretrypredicate = getRetryPredicate.INSTANCE;
            isseekpending.write(getRetryPredicate.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            getResolutionSize getresolutionsize = VideoRevisionListViewModel.this.IconCompatParcelizer;
            getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer();
            getresolutionsize.write(getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : null, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : false, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : null, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : true, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultorientation
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onPrepareFromMediaId((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromMediaId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getLastUpdatedTimeMs read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getFirstInstallTimeMs getfirstinstalltimems = (getFirstInstallTimeMs) VideoRevisionListViewModel.this.IconCompatParcelizer.IconCompatParcelizer();
            if (getfirstinstalltimems.getAudioAttributesImplBaseParcelizer() == this.read) {
                return getShowPopup.INSTANCE;
            }
            List<component4> listRemoteActionCompatParcelizer = getfirstinstalltimems.RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
            for (component4 component4Var : listRemoteActionCompatParcelizer) {
                arrayList.add(component4.IconCompatParcelizer(component4Var.read, component4Var.RemoteActionCompatParcelizer, component4Var.AudioAttributesCompatParcelizer, false));
            }
            VideoRevisionListViewModel.this.IconCompatParcelizer.write(getFirstInstallTimeMs.AudioAttributesCompatParcelizer((7167 & 1) != 0 ? getfirstinstalltimems.write : false, (7167 & 2) != 0 ? getfirstinstalltimems.IconCompatParcelizer : null, (7167 & 4) != 0 ? getfirstinstalltimems.AudioAttributesImplBaseParcelizer : this.read, (7167 & 8) != 0 ? getfirstinstalltimems.MediaBrowserCompatSearchResultReceiver : null, (7167 & 16) != 0 ? getfirstinstalltimems.MediaBrowserCompatCustomActionResultReceiver : null, (7167 & 32) != 0 ? getfirstinstalltimems.MediaBrowserCompatItemReceiver : true, (7167 & 64) != 0 ? getfirstinstalltimems.RemoteActionCompatParcelizer : false, (7167 & 128) != 0 ? getfirstinstalltimems.MediaMetadataCompat : null, (7167 & 256) != 0 ? getfirstinstalltimems.AudioAttributesCompatParcelizer : arrayList, (7167 & 512) != 0 ? getfirstinstalltimems.AudioAttributesImplApi26Parcelizer : false, (7167 & 1024) != 0 ? getfirstinstalltimems.MediaDescriptionCompat : false, (7167 & 2048) != 0 ? getfirstinstalltimems.AudioAttributesImplApi21Parcelizer : false, (7167 & 4096) != 0 ? getfirstinstalltimems.read : false));
            VideoRevisionListViewModel.this.IconCompatParcelizer(false);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getLastUpdatedTimeMs getlastupdatedtimems, SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.read = getlastupdatedtimems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(getLastUpdatedTimeMs getlastupdatedtimems) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(getlastupdatedtimems, null), new MagicModuleSubmissionRequestBody() { // from class: o.defaulttheme
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onRemoveQueueItemAt((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRemoveQueueItemAt(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<getFirstInstallDbVersion> read(List<getFirstInstallDbVersion> list, getLastUpdatedTimeMs getlastupdatedtimems) {
        getAnswerMap getanswermap;
        int i = IconCompatParcelizer.write[getlastupdatedtimems.ordinal()];
        if (i == 1) {
            getanswermap = new getAnswerMap() { // from class: o.canEqual
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRevisionListViewModel.AudioAttributesImplApi21Parcelizer((getLastDbVersion) obj));
                }
            };
        } else if (i == 2) {
            getanswermap = new getAnswerMap() { // from class: o.getApiEndpoint
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRevisionListViewModel.AudioAttributesImplBaseParcelizer((getLastDbVersion) obj));
                }
            };
        } else if (i == 3) {
            getanswermap = new getAnswerMap() { // from class: o.getCustomTheme
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRevisionListViewModel.AudioAttributesImplApi26Parcelizer((getLastDbVersion) obj));
                }
            };
        } else if (i == 4) {
            getanswermap = new getAnswerMap() { // from class: o.getAssethost
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRevisionListViewModel.MediaBrowserCompatCustomActionResultReceiver((getLastDbVersion) obj));
                }
            };
        } else {
            if (i != 5) {
                throw new RenewEligibleCreator();
            }
            getanswermap = new getAnswerMap() { // from class: o.getDiagnosticLog
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRevisionListViewModel.MediaBrowserCompatItemReceiver((getLastDbVersion) obj));
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        for (getFirstInstallDbVersion getfirstinstalldbversion : list) {
            List<getLastDbVersion> listAudioAttributesImplApi21Parcelizer = getfirstinstalldbversion.AudioAttributesImplApi21Parcelizer();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listAudioAttributesImplApi21Parcelizer) {
                if (((Boolean) getanswermap.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            getFirstInstallDbVersion getfirstinstalldbversionWrite = arrayList3.isEmpty() ? null : getFirstInstallDbVersion.write(getfirstinstalldbversion, null, null, null, 0, 0, 0, arrayList3, null, 191);
            if (getfirstinstalldbversionWrite != null) {
                arrayList.add(getfirstinstalldbversionWrite);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        return getlastdbversion.getMediaBrowserCompatSearchResultReceiver() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer(getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        return getlastdbversion.getMediaBrowserCompatSearchResultReceiver() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        return getlastdbversion.getMediaBrowserCompatSearchResultReceiver() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatItemReceiver(getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        return !getlastdbversion.getAudioAttributesImplApi21Parcelizer();
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ getLastDbVersion RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        
            if (r13 != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
        
            if (r12.MediaDescriptionCompat.write.IconCompatParcelizer(o.AttestationRequestBodyKt.AudioAttributesImplBaseParcelizer.INSTANCE, r12) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
        
            if (r12.MediaDescriptionCompat.write.IconCompatParcelizer(o.AttestationRequestBodyKt.MediaBrowserCompatItemReceiver.INSTANCE, r12) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x018f, code lost:
        
            if (r12.MediaDescriptionCompat.write.IconCompatParcelizer(new o.AttestationRequestBodyKt.write(r12.RemoteActionCompatParcelizer.getWrite()), r12) != r0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[PHI: r2
          0x0087: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v5 int) binds: [B:13:0x005d, B:17:0x0083, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.VideoRevisionListViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getLastDbVersion getlastdbversion, String str, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = getlastdbversion;
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoRevisionListViewModel.this.new read(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(String str, getLastDbVersion getlastdbversion) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(getlastdbversion, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.getDisableHardwareAcceleration
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoRevisionListViewModel.onFastForward((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onFastForward(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi21Parcelizer(getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        return true;
    }
}
