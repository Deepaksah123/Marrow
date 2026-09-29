package com.marrow2.ui.feedback.viewmodel;

import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.ui.feedback.viewmodel.LessonFeedbackViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.DefaultBandwidthMeter1;
import kotlin.ErrorDialogFragment;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.MimeTypes;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.binarySearchFloor;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getMagicModuleTimeline;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getService;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.immediateFailedResult;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.parsePpsNalUnit;
import kotlin.readBlockToCache;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setTitleOverrideText;
import kotlin.setUpdatedStatus;
import kotlin.startResolutionForResult;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001?BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u00103\u001a\u000204H\u0002J\b\u0010\"\u001a\u000204H\u0002J\u000e\u0010&\u001a\u0002042\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\u000e\u00109\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010:J\u0018\u0010;\u001a\u0002042\u000e\u0010<\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u001e0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u001e0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0!¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190!¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000!¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#¨\u0006@"}, d2 = {"Lcom/marrow2/ui/feedback/viewmodel/LessonFeedbackViewModel;", "Landroidx/lifecycle/ViewModel;", "feedbackUseCase", "Lcom/marrow2/domain/feedback/FeedbackUseCase;", "tagsUseCase", "Lcom/marrow2/domain/tags/TagsUseCase;", "inAppRatingUseCase", "Lcom/marrow2/domain/inapprating/InAppRatingUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "crashDataRepository", "Lcom/marrow2/data/crash/repo/CrashDataRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/marrow2/domain/feedback/FeedbackUseCase;Lcom/marrow2/domain/tags/TagsUseCase;Lcom/marrow2/domain/inapprating/InAppRatingUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/marrow2/data/crash/repo/CrashDataRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_isMagicModuleParent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "args", "Lcom/marrow2/ui/feedback/models/FeedbackArgs;", "selectedTags", "", "", "selectedRating", "", "fiveStarFeedback", "_tags", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/data/tag/local/model/TagLSModel;", FilterParams.KEY_TAGS, "Lkotlinx/coroutines/flow/StateFlow;", "getTags", "()Lkotlinx/coroutines/flow/StateFlow;", "_notifyEvent", "Lcom/marrow2/ui/feedback/models/FeedbackNavigationStates;", "notifyEvent", "getNotifyEvent", "_feedbackUIState", "Lcom/marrow2/ui/feedback/models/FeedbackUiState;", "feedbackUIState", "getFeedbackUIState", "_error", "error", "getError", "_feedbackTitle", "Lcom/marrow2/ui/feedback/viewmodel/LessonFeedbackViewModel$FeedbackTitleType;", "feedbackTitle", "getFeedbackTitle", "setFeedbackTitle", "", "event", "Lcom/marrow2/ui/feedback/models/FeedbackUIEvent;", "checkIfSubmissionIsAllowed", "submitFeedback", "isEligibleForInAppRating", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInAppRatingException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "FeedbackTitleType", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonFeedbackViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<String> AudioAttributesCompatParcelizer;
    private final setTitleOverrideText AudioAttributesImplApi21Parcelizer;
    private final DefaultBandwidthMeter1 AudioAttributesImplApi26Parcelizer;
    private final isSeekPending AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<startResolutionForResult> IconCompatParcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>>> MediaBrowserCompatCustomActionResultReceiver;
    private final getPlatform MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<startResolutionForResult> MediaBrowserCompatMediaItem;
    private String MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<getService> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final MimeTypes MediaDescriptionCompat;
    private final setUpdatedStatus<String> MediaMetadataCompat;
    private final setUpdatedStatus<RemoteActionCompatParcelizer> RatingCompat;
    private final getResolutionSize<getService> RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private List<String> onAddQueueItem;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>>> onCommand;
    private final parsePpsNalUnit onCustomAction;
    private final binarySearchFloor onFastForward;
    private final getResolutionSize<RemoteActionCompatParcelizer> read;
    private final getResolutionSize<Boolean> write;

    @setSdkPayload
    public LessonFeedbackViewModel(MimeTypes mimeTypes, binarySearchFloor binarysearchfloor, parsePpsNalUnit parseppsnalunit, isSeekPending isseekpending, getPlatform getplatform, DefaultBandwidthMeter1 defaultBandwidthMeter1, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(mimeTypes, "");
        toMagicModuleMetaRepoModel.write(binarysearchfloor, "");
        toMagicModuleMetaRepoModel.write(parseppsnalunit, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(defaultBandwidthMeter1, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.MediaDescriptionCompat = mimeTypes;
        this.onFastForward = binarysearchfloor;
        this.onCustomAction = parseppsnalunit;
        this.AudioAttributesImplBaseParcelizer = isseekpending;
        this.MediaBrowserCompatItemReceiver = getplatform;
        this.AudioAttributesImplApi26Parcelizer = defaultBandwidthMeter1;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        setTitleOverrideText.Companion companion = setTitleOverrideText.INSTANCE;
        setTitleOverrideText settitleoverridetext = setTitleOverrideText.Companion.read(pOJOPropertyBuilder5);
        this.AudioAttributesImplApi21Parcelizer = settitleoverridetext;
        this.onAddQueueItem = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = "";
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<getService> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(getService.write.INSTANCE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<startResolutionForResult> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new startResolutionForResult(false, 0, null, false, 15, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer("");
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<RemoteActionCompatParcelizer> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(null);
        this.read = getresolutionsizeRemoteActionCompatParcelizer6;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getresolutionsizeRemoteActionCompatParcelizer.write(Boolean.valueOf(settitleoverridetext.getRead() == readBlockToCache.AudioAttributesCompatParcelizer));
        getresolutionsizeRemoteActionCompatParcelizer4.write(startResolutionForResult.write(getresolutionsizeRemoteActionCompatParcelizer4.IconCompatParcelizer(), false, settitleoverridetext.getAudioAttributesCompatParcelizer(), null, false, 13));
        if (getresolutionsizeRemoteActionCompatParcelizer4.IconCompatParcelizer().getAudioAttributesCompatParcelizer() > 0) {
            getresolutionsizeRemoteActionCompatParcelizer4.write(startResolutionForResult.write(getresolutionsizeRemoteActionCompatParcelizer4.IconCompatParcelizer(), false, 0, null, true, 7));
        } else {
            getresolutionsizeRemoteActionCompatParcelizer4.write(startResolutionForResult.write(getresolutionsizeRemoteActionCompatParcelizer4.IconCompatParcelizer(), false, 0, null, false, 7));
        }
        this.handleMediaPlayPauseIfPendingOnHandler = settitleoverridetext.getAudioAttributesCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>>> AudioAttributesImplBaseParcelizer() {
        return this.onCommand;
    }

    public final setUpdatedStatus<getService> MediaBrowserCompatItemReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<startResolutionForResult> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<String> read() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<RemoteActionCompatParcelizer> IconCompatParcelizer() {
        return this.RatingCompat;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/marrow2/ui/feedback/viewmodel/LessonFeedbackViewModel$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] write;
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("QBANK_MODULE", 0);
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 1);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrIconCompatParcelizer = IconCompatParcelizer();
            write = remoteActionCompatParcelizerArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrIconCompatParcelizer);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] IconCompatParcelizer() {
            return new RemoteActionCompatParcelizer[]{read, AudioAttributesCompatParcelizer};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) write.clone();
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (LessonFeedbackViewModel.this.AudioAttributesImplApi21Parcelizer.getRead() == readBlockToCache.AudioAttributesImplBaseParcelizer) {
                LessonFeedbackViewModel.this.read.write(RemoteActionCompatParcelizer.read);
            } else {
                LessonFeedbackViewModel.this.read.write(RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            }
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return LessonFeedbackViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new write(null), 3);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            getResolutionSize getresolutionsize2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((Boolean) LessonFeedbackViewModel.this.write.IconCompatParcelizer()).booleanValue()) {
                    getResolutionSize getresolutionsize3 = LessonFeedbackViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                    this.read = getresolutionsize3;
                    this.AudioAttributesCompatParcelizer = 1;
                    Object objRemoteActionCompatParcelizer = LessonFeedbackViewModel.this.onFastForward.RemoteActionCompatParcelizer("smart_recall_tags", this);
                    if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                        obj = objRemoteActionCompatParcelizer;
                        getresolutionsize2 = getresolutionsize3;
                        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize2, obj);
                    }
                } else {
                    getResolutionSize getresolutionsize4 = LessonFeedbackViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                    this.read = getresolutionsize4;
                    this.AudioAttributesCompatParcelizer = 2;
                    Object objRemoteActionCompatParcelizer2 = LessonFeedbackViewModel.this.onFastForward.RemoteActionCompatParcelizer("rating_tags", this);
                    if (objRemoteActionCompatParcelizer2 != objIconCompatParcelizer) {
                        obj = objRemoteActionCompatParcelizer2;
                        getresolutionsize = getresolutionsize4;
                        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
                    }
                }
                return objIconCompatParcelizer;
            }
            if (i == 1) {
                getresolutionsize2 = (getResolutionSize) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize2, obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LessonFeedbackViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.Feature
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LessonFeedbackViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(LessonFeedbackViewModel lessonFeedbackViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lessonFeedbackViewModel.AudioAttributesCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    public final void read(ErrorDialogFragment errorDialogFragment) {
        toMagicModuleMetaRepoModel.write(errorDialogFragment, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(errorDialogFragment, ErrorDialogFragment.write.INSTANCE)) {
            this.RemoteActionCompatParcelizer.write(new getService.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer.getWrite(), this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem, this.AudioAttributesImplApi21Parcelizer.getRead()));
            return;
        }
        if (errorDialogFragment instanceof ErrorDialogFragment.IconCompatParcelizer) {
            ErrorDialogFragment.IconCompatParcelizer iconCompatParcelizer = (ErrorDialogFragment.IconCompatParcelizer) errorDialogFragment;
            if (iconCompatParcelizer.RemoteActionCompatParcelizer() == 5) {
                this.onAddQueueItem = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                getResolutionSize<startResolutionForResult> getresolutionsize = this.IconCompatParcelizer;
                getresolutionsize.write(startResolutionForResult.write(getresolutionsize.IconCompatParcelizer(), true, iconCompatParcelizer.RemoteActionCompatParcelizer(), null, false, 12));
            } else {
                getResolutionSize<startResolutionForResult> getresolutionsize2 = this.IconCompatParcelizer;
                getresolutionsize2.write(startResolutionForResult.write(getresolutionsize2.IconCompatParcelizer(), false, iconCompatParcelizer.RemoteActionCompatParcelizer(), null, false, 12));
            }
            this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer.RemoteActionCompatParcelizer();
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (errorDialogFragment instanceof ErrorDialogFragment.AudioAttributesImplBaseParcelizer) {
            if (this.handleMediaPlayPauseIfPendingOnHandler == 5) {
                ErrorDialogFragment.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (ErrorDialogFragment.AudioAttributesImplBaseParcelizer) errorDialogFragment;
                if (audioAttributesImplBaseParcelizer.write().length() > 0) {
                    this.MediaBrowserCompatSearchResultReceiver = audioAttributesImplBaseParcelizer.write();
                }
            }
            if (this.MediaBrowserCompatSearchResultReceiver.length() == 0 && this.handleMediaPlayPauseIfPendingOnHandler == 0 && this.onAddQueueItem.isEmpty()) {
                this.RemoteActionCompatParcelizer.write(getService.read.INSTANCE);
                return;
            } else {
                MediaBrowserCompatSearchResultReceiver();
                return;
            }
        }
        if (errorDialogFragment instanceof ErrorDialogFragment.AudioAttributesImplApi21Parcelizer) {
            List<String> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.onAddQueueItem);
            ErrorDialogFragment.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (ErrorDialogFragment.AudioAttributesImplApi21Parcelizer) errorDialogFragment;
            if (listMediaBrowserCompatItemReceiver.contains(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().getTitle())) {
                listMediaBrowserCompatItemReceiver.remove(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().getTitle());
            } else {
                listMediaBrowserCompatItemReceiver.add(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().getTitle());
            }
            this.onAddQueueItem = listMediaBrowserCompatItemReceiver;
            getResolutionSize<startResolutionForResult> getresolutionsize3 = this.IconCompatParcelizer;
            getresolutionsize3.write(startResolutionForResult.write(getresolutionsize3.IconCompatParcelizer(), false, 0, this.onAddQueueItem, false, 11));
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(errorDialogFragment, ErrorDialogFragment.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplBaseParcelizer.write(immediateFailedResult.write("qbank"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.RemoteActionCompatParcelizer.write(getService.AudioAttributesCompatParcelizer.INSTANCE);
        } else if (errorDialogFragment instanceof ErrorDialogFragment.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(((ErrorDialogFragment.RemoteActionCompatParcelizer) errorDialogFragment).AudioAttributesCompatParcelizer());
        } else {
            this.RemoteActionCompatParcelizer.write(getService.write.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (this.onAddQueueItem.isEmpty() && this.handleMediaPlayPauseIfPendingOnHandler == 0) {
            getResolutionSize<startResolutionForResult> getresolutionsize = this.IconCompatParcelizer;
            getresolutionsize.write(startResolutionForResult.write(getresolutionsize.IconCompatParcelizer(), false, 0, null, false, 7));
        } else {
            getResolutionSize<startResolutionForResult> getresolutionsize2 = this.IconCompatParcelizer;
            getresolutionsize2.write(startResolutionForResult.write(getresolutionsize2.IconCompatParcelizer(), false, 0, null, true, 7));
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
        
            if (r13 != r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.feedback.viewmodel.LessonFeedbackViewModel.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return LessonFeedbackViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.checkApiAvailability
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LessonFeedbackViewModel.read(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(LessonFeedbackViewModel lessonFeedbackViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lessonFeedbackViewModel.AudioAttributesCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!((Boolean) LessonFeedbackViewModel.this.write.IconCompatParcelizer()).booleanValue()) {
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = LessonFeedbackViewModel.this.onCustomAction.AudioAttributesCompatParcelizer(LessonFeedbackViewModel.this.handleMediaPlayPauseIfPendingOnHandler, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return QBankStatsResponse.AudioAttributesCompatParcelizer(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            boolean z = ((Boolean) obj).booleanValue();
            return QBankStatsResponse.AudioAttributesCompatParcelizer(z);
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return LessonFeedbackViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, new read(null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ LessonFeedbackViewModel IconCompatParcelizer;
        private /* synthetic */ Exception RemoteActionCompatParcelizer;
        private int read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Exception exc = this.RemoteActionCompatParcelizer;
                if (exc != null) {
                    this.AudioAttributesCompatParcelizer = null;
                    this.write = 0;
                    this.read = 1;
                    if (DefaultBandwidthMeter1.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer, exc, "in_app_rating", null, this, 4) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.write(getService.AudioAttributesCompatParcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Exception exc, LessonFeedbackViewModel lessonFeedbackViewModel, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = exc;
            this.IconCompatParcelizer = lessonFeedbackViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(Exception exc) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(exc, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.FirstPartyScopes
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return LessonFeedbackViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
