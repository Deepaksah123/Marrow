package com.marrow2.ui.bookmark.detail;

import com.marrow.data.models.subject.Subject;
import com.marrow2.ui.bookmark.detail.BookmarkMainViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.FixedFrameRateEstimator;
import kotlin.IntermediateLoginResponseBody;
import kotlin.KotlinAnnotationIntrospectorCompanion;
import kotlin.KotlinInstantiators;
import kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.MediaCodecVideoRendererCodecMaxValues;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.NewNumberOtpResendRequest;
import kotlin.NonNullApi;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.RepeatModeUtil;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.accessfilterOutSingleStringCallables;
import kotlin.accessisKotlinConstructorWithParameters;
import kotlin.adjustReleaseTime;
import kotlin.allSamplesAreSyncSamples;
import kotlin.binarySearchCeil;
import kotlin.clearSurfaceFrameRate;
import kotlin.colorRangeToString;
import kotlin.createNotificationChannel;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getDisplaySizeV17;
import kotlin.getIgnoredClassesForImplyingJsonCreator;
import kotlin.getMagicModuleStats;
import kotlin.getModuleData;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.isBufferLate;
import kotlin.isSeekPending;
import kotlin.isoColorPrimariesToColorSpace;
import kotlin.onDisplayInfoChanged;
import kotlin.putInt;
import kotlin.renderOutputBufferV21;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipBytes;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.updateVideoFrameProcessingOffsetCounters;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010=\u001a\u00020>H\u0082@¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020>J\u000e\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020>J\u0006\u0010E\u001a\u00020>J\u0006\u0010F\u001a\u00020>J\u001e\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020(J \u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020-2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010M\u001a\u00020(J\u000e\u0010N\u001a\u00020>2\u0006\u0010O\u001a\u000200J\u0006\u0010P\u001a\u00020>J\u0006\u0010Q\u001a\u00020>J\u0006\u0010R\u001a\u00020>J\u0006\u0010S\u001a\u00020>J\u0006\u0010T\u001a\u00020>J\u0006\u0010U\u001a\u00020>R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 ¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020(0 ¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002030 ¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010807¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006V"}, d2 = {"Lcom/marrow2/ui/bookmark/detail/BookmarkMainViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "subjectUseCase", "Lcom/marrow2/domain/subject/SubjectUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "fileCacheUseCase", "Lcom/marrow2/domain/fileCache/FileCacheUseCase;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/domain/subject/SubjectUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/domain/fileCache/FileCacheUseCase;)V", "getMcqUseCase", "()Lcom/marrow2/domain/mcq/McqUseCase;", "getUserUseCase", "()Lcom/marrow2/domain/user/UserUseCase;", "getSubjectUseCase", "()Lcom/marrow2/domain/subject/SubjectUseCase;", "getAnalytics", "()Lcom/marrow/dranalytics/base/AnalyticPublisher;", "getFileCacheUseCase", "()Lcom/marrow2/domain/fileCache/FileCacheUseCase;", "bookmarkMainArgs", "Lcom/marrow2/ui/bookmark/detail/BookmarkMainArgs;", "_bookmarkFilterUIState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/bookmark/detail/model/BookmarkFilterUIState;", "bookmarkFilterUIState", "Lkotlinx/coroutines/flow/StateFlow;", "getBookmarkFilterUIState", "()Lkotlinx/coroutines/flow/StateFlow;", "_bookmarkUiState", "Lcom/marrow2/ui/bookmark/detail/model/BookmarkDetailUIState;", "bookmarkUiState", "getBookmarkUiState", "_scrollToCurrentMcqRequired", "", "scrollToCurrentMcqRequired", "getScrollToCurrentMcqRequired", "mcqIdsStateForPager", "", "", "pagingSourceFactory", "Landroidx/paging/InvalidatingPagingSourceFactory;", "", "Lcom/marrow2/domain/mcq/model/McqListingUCModel;", "_notifyNavigationEvent", "Lcom/marrow2/ui/bookmark/detail/model/NavigationBookmarkEvent;", "navigationBookmarkEvent", "getNavigationBookmarkEvent", "pagerFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getPagerFlow$annotations", "()V", "getPagerFlow", "()Lkotlinx/coroutines/flow/Flow;", "refreshListContent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBookmarkFilterOpen", "onBookmarkFilterSelected", "bookmarkType", "Lcom/marrow2/domain/mcq/model/BookmarkType;", "onBookmarkFilterDismiss", "onSubjectFilterOpen", "onSubjectSelectionDismiss", "onSubjectSelected", "subjectId", "subjectName", "isFromReviewList", "onBookmarked", "mcqId", "uiOnly", "onItemSelected", "index", "onShowAnswerClicked", "onReviewViewModeChange", "onBookmarkModeSwitched", "onLastPositionScrollHandled", "openMcqinQaMode", "notifyClearEvent", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkMainViewModel extends POJOPropertyBuilderWithMember {
    private final isSeekPending AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<updateVideoFrameProcessingOffsetCounters> AudioAttributesImplApi21Parcelizer;
    private final isoColorPrimariesToColorSpace AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<List<String>> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<MediaCodecVideoRendererCodecMaxValues> IconCompatParcelizer;
    private final allSamplesAreSyncSamples MediaBrowserCompatCustomActionResultReceiver;
    private final setUpdatedStatus<renderOutputBufferV21> MediaBrowserCompatItemReceiver;
    private final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<createNotificationChannel>> MediaBrowserCompatMediaItem;
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;
    private final NetworkTypeObserverApi31DisplayInfoCallback MediaDescriptionCompat;
    private final setUpdatedStatus<MediaCodecVideoRendererCodecMaxValues> MediaMetadataCompat;
    private KotlinInstantiators<Integer, createNotificationChannel> RatingCompat;
    private final getResolutionSize<renderOutputBufferV21> RemoteActionCompatParcelizer;
    private final getDisplaySizeV17 handleMediaPlayPauseIfPendingOnHandler;
    private final binarySearchCeil onCommand;
    private final getResolutionSize<Boolean> read;
    private final getResolutionSize<updateVideoFrameProcessingOffsetCounters> write;

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return BookmarkMainViewModel.this.read(this);
        }
    }

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[isBufferLate.values().length];
            try {
                iArr[isBufferLate.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[isBufferLate.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    @setSdkPayload
    public BookmarkMainViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getDisplaySizeV17 getdisplaysizev17, binarySearchCeil binarysearchceil, isSeekPending isseekpending, allSamplesAreSyncSamples allsamplesaresyncsamples) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(allsamplesaresyncsamples, "");
        this.MediaDescriptionCompat = networkTypeObserverApi31DisplayInfoCallback;
        this.handleMediaPlayPauseIfPendingOnHandler = getdisplaysizev17;
        this.onCommand = binarysearchceil;
        this.AudioAttributesCompatParcelizer = isseekpending;
        this.MediaBrowserCompatCustomActionResultReceiver = allsamplesaresyncsamples;
        isoColorPrimariesToColorSpace.Companion companion = isoColorPrimariesToColorSpace.INSTANCE;
        this.AudioAttributesImplApi26Parcelizer = isoColorPrimariesToColorSpace.Companion.write(pOJOPropertyBuilder5);
        getResolutionSize<renderOutputBufferV21> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new renderOutputBufferV21(false, false, null, null, 15, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<updateVideoFrameProcessingOffsetCounters> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new updateVideoFrameProcessingOffsetCounters(null, 0, null, null, false, false, false, null, null, null, null, null, 0, 8191, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<List<String>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        getResolutionSize<MediaCodecVideoRendererCodecMaxValues> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(MediaCodecVideoRendererCodecMaxValues.AudioAttributesCompatParcelizer.INSTANCE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.IconCompatParcelizer((NewNumberOtpResendRequest) getresolutionsizeRemoteActionCompatParcelizer4, (getModuleData) new MediaDescriptionCompat(null, this));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass1(null), new MagicModuleSubmissionRequestBody() { // from class: o.ColorInfoBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final NetworkTypeObserverApi31DisplayInfoCallback getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final getDisplaySizeV17 getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final binarySearchCeil getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final isSeekPending getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final allSamplesAreSyncSamples getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<renderOutputBufferV21> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<updateVideoFrameProcessingOffsetCounters> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<MediaCodecVideoRendererCodecMaxValues> AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public static final class MediaDescriptionCompat extends getMagicModuleStats implements getModuleData<getValidationToken<? super accessisKotlinConstructorWithParameters<createNotificationChannel>>, List<? extends String>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ BookmarkMainViewModel AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object read;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getValidationToken getvalidationtoken = (getValidationToken) this.read;
                MediaDescriptionCompat mediaDescriptionCompat = this;
                accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables = new accessfilterOutSingleStringCallables(20, 25, false, 0, 200, 60, 12, null);
                this.AudioAttributesCompatParcelizer.RatingCompat = new KotlinInstantiators(this.AudioAttributesCompatParcelizer.new AudioAttributesImplBaseParcelizer(accessfilteroutsinglestringcallables));
                KotlinInstantiators kotlinInstantiators = this.AudioAttributesCompatParcelizer.RatingCompat;
                if (kotlinInstantiators == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                NewNumberOtpResendRequest newNumberOtpResendRequestAudioAttributesCompatParcelizer = KotlinAnnotationIntrospectorCompanion.AudioAttributesCompatParcelizer(new getIgnoredClassesForImplyingJsonCreator(accessfilteroutsinglestringcallables, null, kotlinInstantiators, 2, null).read(), TypeResolutionContextBasic.write(this.AudioAttributesCompatParcelizer));
                this.read = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                if (VerifyNewNumberRequest.write(getvalidationtoken, newNumberOtpResendRequestAudioAttributesCompatParcelizer, mediaDescriptionCompat) == objIconCompatParcelizer) {
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
        public MediaDescriptionCompat(SampleVideos sampleVideos, BookmarkMainViewModel bookmarkMainViewModel) {
            super(3, sampleVideos);
            this.AudioAttributesCompatParcelizer = bookmarkMainViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getModuleData
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object AudioAttributesCompatParcelizer(getValidationToken<? super accessisKotlinConstructorWithParameters<createNotificationChannel>> getvalidationtoken, List<? extends String> list, SampleVideos<? super getShowPopup> sampleVideos) {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(sampleVideos, this.AudioAttributesCompatParcelizer);
            mediaDescriptionCompat.read = getvalidationtoken;
            mediaDescriptionCompat.write = list;
            return mediaDescriptionCompat.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<accessisKotlinConstructorWithParameters<createNotificationChannel>> AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    static final class AudioAttributesImplBaseParcelizer implements getCreatedOnDateMs<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Integer, createNotificationChannel>> {
        private /* synthetic */ accessfilterOutSingleStringCallables write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Integer, createNotificationChannel> invoke() {
            return new FixedFrameRateEstimator(BookmarkMainViewModel.this.IconCompatParcelizer().IconCompatParcelizer().IconCompatParcelizer(), BookmarkMainViewModel.this.getMediaDescriptionCompat(), this.write.write);
        }

        AudioAttributesImplBaseParcelizer(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables) {
            this.write = accessfilteroutsinglestringcallables;
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private boolean read;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        
            if (r2 != r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
        
            if (r20.write.read(r20) != r1) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r2 r4
          0x002d: PHI (r2v21 java.lang.String) = (r2v18 java.lang.String), (r2v25 java.lang.String) binds: [B:27:0x009d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x002d: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v7 java.lang.Object) binds: [B:27:0x009d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass1(SampleVideos<? super AnonymousClass1> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new AnonymousClass1(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r1 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r25) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.read(o.SampleVideos):java.lang.Object");
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[isBufferLate.values().length];
                try {
                    iArr[isBufferLate.IconCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[isBufferLate.RemoteActionCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i;
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String audioAttributesImplApi21Parcelizer = ((updateVideoFrameProcessingOffsetCounters) BookmarkMainViewModel.this.write.IconCompatParcelizer()).getAudioAttributesImplApi21Parcelizer();
                String str = Subject.ROOT_PARENT_ID;
                if (audioAttributesImplApi21Parcelizer != null) {
                    String str2 = audioAttributesImplApi21Parcelizer;
                    if (str2.length() != 0) {
                        str = str2;
                    }
                    str = str;
                }
                MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
                int i3 = write.IconCompatParcelizer[BookmarkMainViewModel.this.IconCompatParcelizer().IconCompatParcelizer().getWrite().ordinal()];
                if (i3 == 1) {
                    i = 0;
                } else {
                    if (i3 != 2) {
                        throw new RenewEligibleCreator();
                    }
                    i = 1;
                }
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesCompatParcelizer = iconCompatParcelizer2;
                this.write = i;
                this.IconCompatParcelizer = 1;
                Object objAudioAttributesCompatParcelizer = BookmarkMainViewModel.this.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(str, i, RepeatModeUtil.RemoteActionCompatParcelizer, this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                iconCompatParcelizer = iconCompatParcelizer2;
                obj = objAudioAttributesCompatParcelizer;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iconCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable<putInt> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (putInt putint : iterable) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer += putint.getRemoteActionCompatParcelizer();
                arrayList.add(new clearSurfaceFrameRate(putint.getRead(), putint.getRemoteActionCompatParcelizer()));
            }
            List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
            listMediaBrowserCompatItemReceiver.add(0, new clearSurfaceFrameRate(onDisplayInfoChanged.read, iconCompatParcelizer.AudioAttributesCompatParcelizer));
            BookmarkMainViewModel.this.RemoteActionCompatParcelizer.write(renderOutputBufferV21.read((renderOutputBufferV21) BookmarkMainViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer(), false, true, null, listMediaBrowserCompatItemReceiver, 5));
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.ColorInfoExternalSyntheticLambda0
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onDisplayInfoChanged AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ BookmarkMainViewModel RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                onDisplayInfoChanged ondisplayinfochanged = this.AudioAttributesCompatParcelizer == onDisplayInfoChanged.read ? null : this.AudioAttributesCompatParcelizer;
                getResolutionSize getresolutionsize = this.RemoteActionCompatParcelizer.write;
                updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) this.RemoteActionCompatParcelizer.write.IconCompatParcelizer();
                getresolutionsize.write(updateVideoFrameProcessingOffsetCounters.IconCompatParcelizer((6267 & 1) != 0 ? updatevideoframeprocessingoffsetcounters.read : null, (6267 & 2) != 0 ? updatevideoframeprocessingoffsetcounters.IconCompatParcelizer : 0, (6267 & 4) != 0 ? updatevideoframeprocessingoffsetcounters.write : null, (6267 & 8) != 0 ? updatevideoframeprocessingoffsetcounters.AudioAttributesCompatParcelizer : null, (6267 & 16) != 0 ? updatevideoframeprocessingoffsetcounters.MediaDescriptionCompat : false, (6267 & 32) != 0 ? updatevideoframeprocessingoffsetcounters.RemoteActionCompatParcelizer : false, (6267 & 64) != 0 ? updatevideoframeprocessingoffsetcounters.MediaBrowserCompatCustomActionResultReceiver : false, (6267 & 128) != 0 ? updatevideoframeprocessingoffsetcounters.AudioAttributesImplBaseParcelizer : ondisplayinfochanged, (6267 & 256) != 0 ? updatevideoframeprocessingoffsetcounters.AudioAttributesImplApi21Parcelizer : null, (6267 & 512) != 0 ? updatevideoframeprocessingoffsetcounters.MediaBrowserCompatItemReceiver : null, (6267 & 1024) != 0 ? updatevideoframeprocessingoffsetcounters.AudioAttributesImplApi26Parcelizer : null, (6267 & 2048) != 0 ? updatevideoframeprocessingoffsetcounters.MediaMetadataCompat : null, (6267 & 4096) != 0 ? updatevideoframeprocessingoffsetcounters.MediaBrowserCompatMediaItem : 0));
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write(renderOutputBufferV21.read((renderOutputBufferV21) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(), false, false, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 5));
                onDisplayInfoChanged audioAttributesImplBaseParcelizer = ((updateVideoFrameProcessingOffsetCounters) this.RemoteActionCompatParcelizer.write.IconCompatParcelizer()).getAudioAttributesImplBaseParcelizer();
                if (audioAttributesImplBaseParcelizer == null) {
                    audioAttributesImplBaseParcelizer = onDisplayInfoChanged.read;
                }
                int iIconCompatParcelizer = NonNullApi.IconCompatParcelizer(audioAttributesImplBaseParcelizer);
                isSeekPending audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
                colorRangeToString colorrangetostring = colorRangeToString.INSTANCE;
                audioAttributesCompatParcelizer.write(colorRangeToString.RemoteActionCompatParcelizer(((updateVideoFrameProcessingOffsetCounters) this.RemoteActionCompatParcelizer.write.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), iIconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.write = null;
                this.IconCompatParcelizer = iIconCompatParcelizer;
                this.read = 1;
                if (this.RemoteActionCompatParcelizer.read(this) == objIconCompatParcelizer) {
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
        read(onDisplayInfoChanged ondisplayinfochanged, BookmarkMainViewModel bookmarkMainViewModel, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = ondisplayinfochanged;
            this.RemoteActionCompatParcelizer = bookmarkMainViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(onDisplayInfoChanged ondisplayinfochanged) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(ondisplayinfochanged, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.setColorRange
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.MediaDescriptionCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void MediaMetadataCompat() {
        getResolutionSize<renderOutputBufferV21> getresolutionsize = this.RemoteActionCompatParcelizer;
        getresolutionsize.write(renderOutputBufferV21.read(getresolutionsize.IconCompatParcelizer(), false, false, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 5));
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = BookmarkMainViewModel.this.getMediaDescriptionCompat().RemoteActionCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable<skipBytes> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (skipBytes skipbytes : iterable) {
                arrayList.add(new adjustReleaseTime(skipbytes.read(), skipbytes.AudioAttributesCompatParcelizer(), skipbytes.IconCompatParcelizer()));
            }
            List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
            listMediaBrowserCompatItemReceiver.add(0, new adjustReleaseTime("", "All Subjects", 0, 4, null));
            BookmarkMainViewModel.this.RemoteActionCompatParcelizer.write(renderOutputBufferV21.read((renderOutputBufferV21) BookmarkMainViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer(), true, false, listMediaBrowserCompatItemReceiver, null, 10));
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setHdrStaticInfo
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.MediaMetadataCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void onPlayFromMediaId() {
        getResolutionSize<renderOutputBufferV21> getresolutionsize = this.RemoteActionCompatParcelizer;
        getresolutionsize.write(renderOutputBufferV21.read(getresolutionsize.IconCompatParcelizer(), false, false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null, 10));
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ BookmarkMainViewModel AudioAttributesImplApi26Parcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ boolean write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r2 != r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
        
            if (r19.AudioAttributesImplApi26Parcelizer.read(r19) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str, BookmarkMainViewModel bookmarkMainViewModel, boolean z, String str2, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.AudioAttributesImplApi26Parcelizer = bookmarkMainViewModel;
            this.write = z;
            this.read = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(str, this, z, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.DecoderVideoRenderer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        if (z) {
            KotlinInstantiators<Integer, createNotificationChannel> kotlinInstantiators = this.RatingCompat;
            if (kotlinInstantiators != null) {
                kotlinInstantiators.RemoteActionCompatParcelizer();
                return;
            }
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(str, ondisplayinfochanged, null), new MagicModuleSubmissionRequestBody() { // from class: o.setColorSpace
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.RatingCompat((String) obj2);
            }
        });
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ onDisplayInfoChanged IconCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(kotlin.setRefreshToken.write, new com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesCompatParcelizer.AnonymousClass3(r9.RemoteActionCompatParcelizer, r9.AudioAttributesCompatParcelizer, r9.IconCompatParcelizer, r7, null), r9) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.read
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r9 = r9.write
                o.onDisplayInfoChanged r9 = (kotlin.onDisplayInfoChanged) r9
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L8d
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L22:
                java.lang.Object r1 = r9.write
                o.onDisplayInfoChanged r1 = (kotlin.onDisplayInfoChanged) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L5f
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L44
            L2e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r10 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r10 = r10.getMediaDescriptionCompat()
                java.lang.String r1 = r9.AudioAttributesCompatParcelizer
                r5 = r9
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r9.read = r4
                java.lang.Object r10 = r10.write(r1, r5)
                if (r10 == r0) goto L90
            L44:
                r1 = r10
                o.onDisplayInfoChanged r1 = (kotlin.onDisplayInfoChanged) r1
                com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r10 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r10 = r10.getMediaDescriptionCompat()
                java.lang.String r4 = r9.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r5 = r9.IconCompatParcelizer
                r6 = r9
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r9.write = r1
                r9.read = r3
                java.lang.Object r10 = r10.AudioAttributesCompatParcelizer(r4, r5, r6)
                if (r10 != r0) goto L5f
                goto L90
            L5f:
                r7 = r1
                com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r10 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.this
                o.KotlinInstantiators r10 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesCompatParcelizer(r10)
                if (r10 == 0) goto L6b
                r10.RemoteActionCompatParcelizer()
            L6b:
                o.setRefreshToken r10 = kotlin.setRefreshToken.write
                o.CurrentQuery r10 = (kotlin.CurrentQuery) r10
                com.marrow2.ui.bookmark.detail.BookmarkMainViewModel$AudioAttributesCompatParcelizer$3 r1 = new com.marrow2.ui.bookmark.detail.BookmarkMainViewModel$AudioAttributesCompatParcelizer$3
                com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r4 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.this
                java.lang.String r5 = r9.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r6 = r9.IconCompatParcelizer
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r3 = r9
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r9.write = r4
                r9.read = r2
                java.lang.Object r9 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r10, r1, r3)
                if (r9 != r0) goto L8d
                goto L90
            L8d:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            L90:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ String AudioAttributesCompatParcelizer;
            private /* synthetic */ BookmarkMainViewModel AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ onDisplayInfoChanged IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ onDisplayInfoChanged write;

            /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
            
                if (r6.AudioAttributesImplApi26Parcelizer.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(r6.AudioAttributesCompatParcelizer, r6.IconCompatParcelizer, r6) != r0) goto L24;
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
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L90
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1b:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Exception -> L54
                    goto L38
                L1f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r7 = r6.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Exception -> L54
                    o.NetworkTypeObserverApi31DisplayInfoCallback r7 = r7.getMediaDescriptionCompat()     // Catch: java.lang.Exception -> L54
                    java.lang.String r1 = r6.AudioAttributesCompatParcelizer     // Catch: java.lang.Exception -> L54
                    o.onDisplayInfoChanged r4 = r6.write     // Catch: java.lang.Exception -> L54
                    r5 = r6
                    o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Exception -> L54
                    r6.read = r3     // Catch: java.lang.Exception -> L54
                    java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r1, r4, r5)     // Catch: java.lang.Exception -> L54
                    if (r7 != r0) goto L38
                    goto L8f
                L38:
                    com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r7 = r6.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Exception -> L54
                    o.isSeekPending r7 = r7.getAudioAttributesCompatParcelizer()     // Catch: java.lang.Exception -> L54
                    o.onDisplayInfoChanged r1 = r6.write     // Catch: java.lang.Exception -> L54
                    int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L54
                    o.zzkx r3 = kotlin.zzkx.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L54
                    o.getSubscriptionExpiresOn r1 = kotlin.zzbV.RemoteActionCompatParcelizer(r1, r3)     // Catch: java.lang.Exception -> L54
                    o.updateLoadingFinished r3 = kotlin.updateLoadingFinished.IconCompatParcelizer     // Catch: java.lang.Exception -> L54
                    java.util.List r3 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r3)     // Catch: java.lang.Exception -> L54
                    r7.write(r1, r3)     // Catch: java.lang.Exception -> L54
                    goto L9b
                L54:
                    r7 = move-exception
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    boolean r1 = kotlin.parseDescriptor.read(r7)
                    if (r1 == 0) goto L77
                    com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r1 = r6.AudioAttributesImplApi26Parcelizer
                    o.getResolutionSize r1 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.read(r1)
                    o.MediaCodecVideoRendererCodecMaxValues$read r3 = new o.MediaCodecVideoRendererCodecMaxValues$read
                    com.marrow.data.utils.product.exceptions.ResponseErrorException r7 = kotlin.parseDescriptor.AudioAttributesCompatParcelizer(r7)
                    com.marrow.data.models.ResponseError r7 = r7.getError()
                    java.lang.String r7 = r7.getErrorMessage()
                    r3.<init>(r7)
                    r1.write(r3)
                L77:
                    com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r7 = r6.AudioAttributesImplApi26Parcelizer
                    o.NetworkTypeObserverApi31DisplayInfoCallback r7 = r7.getMediaDescriptionCompat()
                    java.lang.String r1 = r6.AudioAttributesCompatParcelizer
                    o.onDisplayInfoChanged r3 = r6.IconCompatParcelizer
                    r4 = r6
                    o.SampleVideos r4 = (kotlin.SampleVideos) r4
                    r5 = 0
                    r6.RemoteActionCompatParcelizer = r5
                    r6.read = r2
                    java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r1, r3, r4)
                    if (r7 != r0) goto L90
                L8f:
                    return r0
                L90:
                    com.marrow2.ui.bookmark.detail.BookmarkMainViewModel r6 = r6.AudioAttributesImplApi26Parcelizer
                    o.KotlinInstantiators r6 = com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesCompatParcelizer(r6)
                    if (r6 == 0) goto L9b
                    r6.RemoteActionCompatParcelizer()
                L9b:
                    o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.detail.BookmarkMainViewModel.AudioAttributesCompatParcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BookmarkMainViewModel bookmarkMainViewModel, String str, onDisplayInfoChanged ondisplayinfochanged, onDisplayInfoChanged ondisplayinfochanged2, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = bookmarkMainViewModel;
                this.AudioAttributesCompatParcelizer = str;
                this.write = ondisplayinfochanged;
                this.IconCompatParcelizer = ondisplayinfochanged2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        getResolutionSize<updateVideoFrameProcessingOffsetCounters> getresolutionsize = this.write;
        updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcountersIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(updateVideoFrameProcessingOffsetCounters.IconCompatParcelizer((6267 & 1) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.read : null, (6267 & 2) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.IconCompatParcelizer : i, (6267 & 4) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.write : null, (6267 & 8) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (6267 & 16) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaDescriptionCompat : false, (6267 & 32) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.RemoteActionCompatParcelizer : false, (6267 & 64) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (6267 & 128) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (6267 & 256) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (6267 & 512) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (6267 & 1024) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (6267 & 2048) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaMetadataCompat : null, (6267 & 4096) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatMediaItem : 0));
        this.read.write(Boolean.TRUE);
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getResolutionSize<updateVideoFrameProcessingOffsetCounters> getresolutionsize = this.write;
        updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcountersIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(updateVideoFrameProcessingOffsetCounters.IconCompatParcelizer((6267 & 1) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.read : null, (6267 & 2) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.IconCompatParcelizer : 0, (6267 & 4) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.write : null, (6267 & 8) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (6267 & 16) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaDescriptionCompat : false, (6267 & 32) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.RemoteActionCompatParcelizer : false, (6267 & 64) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : !this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), (6267 & 128) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (6267 & 256) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (6267 & 512) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (6267 & 1024) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (6267 & 2048) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaMetadataCompat : null, (6267 & 4096) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatMediaItem : 0));
    }

    public final void onAddQueueItem() {
        getResolutionSize<updateVideoFrameProcessingOffsetCounters> getresolutionsize = this.write;
        updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcountersIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(updateVideoFrameProcessingOffsetCounters.IconCompatParcelizer((6267 & 1) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.read : null, (6267 & 2) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.IconCompatParcelizer : 0, (6267 & 4) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.write : null, (6267 & 8) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesCompatParcelizer : null, (6267 & 16) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaDescriptionCompat : !this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getMediaDescriptionCompat(), (6267 & 32) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.RemoteActionCompatParcelizer : false, (6267 & 64) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (6267 & 128) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (6267 & 256) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (6267 & 512) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (6267 & 1024) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (6267 & 2048) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaMetadataCompat : null, (6267 & 4096) != 0 ? updatevideoframeprocessingoffsetcountersIconCompatParcelizer.MediaBrowserCompatMediaItem : 0));
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters;
            updateVideoFrameProcessingOffsetCounters.read readVar;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize = BookmarkMainViewModel.this.write;
                updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters2 = (updateVideoFrameProcessingOffsetCounters) BookmarkMainViewModel.this.write.IconCompatParcelizer();
                if (((updateVideoFrameProcessingOffsetCounters) BookmarkMainViewModel.this.write.IconCompatParcelizer()).getAudioAttributesImplApi26Parcelizer() == updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer) {
                    this.AudioAttributesCompatParcelizer = getresolutionsize;
                    this.MediaBrowserCompatCustomActionResultReceiver = updatevideoframeprocessingoffsetcounters2;
                    this.read = 0;
                    this.IconCompatParcelizer = 0;
                    this.write = 0;
                    this.RemoteActionCompatParcelizer = 0;
                    this.MediaBrowserCompatItemReceiver = 1;
                    if (BookmarkMainViewModel.this.getHandleMediaPlayPauseIfPendingOnHandler().RemoteActionCompatParcelizer(true, (SampleVideos<? super getShowPopup>) this) != objIconCompatParcelizer) {
                        updatevideoframeprocessingoffsetcounters = updatevideoframeprocessingoffsetcounters2;
                        readVar = updateVideoFrameProcessingOffsetCounters.read.RemoteActionCompatParcelizer;
                    }
                } else {
                    this.AudioAttributesCompatParcelizer = getresolutionsize;
                    this.MediaBrowserCompatCustomActionResultReceiver = updatevideoframeprocessingoffsetcounters2;
                    this.read = 0;
                    this.IconCompatParcelizer = 0;
                    this.write = 0;
                    this.RemoteActionCompatParcelizer = 0;
                    this.MediaBrowserCompatItemReceiver = 2;
                    if (BookmarkMainViewModel.this.getHandleMediaPlayPauseIfPendingOnHandler().RemoteActionCompatParcelizer(false, (SampleVideos<? super getShowPopup>) this) != objIconCompatParcelizer) {
                        updatevideoframeprocessingoffsetcounters = updatevideoframeprocessingoffsetcounters2;
                        readVar = updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer;
                    }
                }
                return objIconCompatParcelizer;
            }
            if (i == 1) {
                updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) this.MediaBrowserCompatCustomActionResultReceiver;
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                readVar = updateVideoFrameProcessingOffsetCounters.read.RemoteActionCompatParcelizer;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) this.MediaBrowserCompatCustomActionResultReceiver;
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                readVar = updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer;
            }
            updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters3 = updatevideoframeprocessingoffsetcounters;
            getresolutionsize.write(updateVideoFrameProcessingOffsetCounters.IconCompatParcelizer((6267 & 1) != 0 ? updatevideoframeprocessingoffsetcounters3.read : null, (6267 & 2) != 0 ? updatevideoframeprocessingoffsetcounters3.IconCompatParcelizer : 0, (6267 & 4) != 0 ? updatevideoframeprocessingoffsetcounters3.write : null, (6267 & 8) != 0 ? updatevideoframeprocessingoffsetcounters3.AudioAttributesCompatParcelizer : null, (6267 & 16) != 0 ? updatevideoframeprocessingoffsetcounters3.MediaDescriptionCompat : false, (6267 & 32) != 0 ? updatevideoframeprocessingoffsetcounters3.RemoteActionCompatParcelizer : false, (6267 & 64) != 0 ? updatevideoframeprocessingoffsetcounters3.MediaBrowserCompatCustomActionResultReceiver : false, (6267 & 128) != 0 ? updatevideoframeprocessingoffsetcounters3.AudioAttributesImplBaseParcelizer : null, (6267 & 256) != 0 ? updatevideoframeprocessingoffsetcounters3.AudioAttributesImplApi21Parcelizer : null, (6267 & 512) != 0 ? updatevideoframeprocessingoffsetcounters3.MediaBrowserCompatItemReceiver : null, (6267 & 1024) != 0 ? updatevideoframeprocessingoffsetcounters3.AudioAttributesImplApi26Parcelizer : readVar, (6267 & 2048) != 0 ? updatevideoframeprocessingoffsetcounters3.MediaMetadataCompat : null, (6267 & 4096) != 0 ? updatevideoframeprocessingoffsetcounters3.MediaBrowserCompatMediaItem : 0));
            isSeekPending audioAttributesCompatParcelizer = BookmarkMainViewModel.this.getAudioAttributesCompatParcelizer();
            colorRangeToString colorrangetostring = colorRangeToString.INSTANCE;
            audioAttributesCompatParcelizer.write(colorRangeToString.IconCompatParcelizer(((updateVideoFrameProcessingOffsetCounters) BookmarkMainViewModel.this.write.IconCompatParcelizer()).getAudioAttributesImplApi26Parcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void onCommand() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.ColorInfo1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.MediaBrowserCompatMediaItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void onCustomAction() {
        this.read.write(Boolean.FALSE);
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (BookmarkMainViewModel.this.getMediaBrowserCompatCustomActionResultReceiver().write(BookmarkMainViewModel.this.IconCompatParcelizer().IconCompatParcelizer().IconCompatParcelizer(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            BookmarkMainViewModel.this.IconCompatParcelizer.write(new MediaCodecVideoRendererCodecMaxValues.IconCompatParcelizer(BookmarkMainViewModel.this.IconCompatParcelizer().IconCompatParcelizer().getIconCompatParcelizer()));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkMainViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void onFastForward() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setColorTransfer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkMainViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(BookmarkMainViewModel bookmarkMainViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        bookmarkMainViewModel.IconCompatParcelizer.write(new MediaCodecVideoRendererCodecMaxValues.read(str));
        return getShowPopup.INSTANCE;
    }

    public final void RatingCompat() {
        this.IconCompatParcelizer.write(MediaCodecVideoRendererCodecMaxValues.AudioAttributesCompatParcelizer.INSTANCE);
    }
}
