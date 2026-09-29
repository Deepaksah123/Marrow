package com.marrow2.ui.better_search;

import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.domain.lesson.model.LessonNavigationCategory;
import com.marrow2.ui.better_search.BetterSearchViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AvcConfig;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ColorInfo;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TimedValueQueue;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.XmlPullParserUtil;
import kotlin.adjustTsTimestamp;
import kotlin.allSamplesAreSyncSamples;
import kotlin.getAnswerMap;
import kotlin.getAttributeValue;
import kotlin.getAttributeValueIgnorePrefix;
import kotlin.getFirstSampleTimestampUs;
import kotlin.getLastAdjustedTimestampUs;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isEndTag;
import kotlin.isSeekPending;
import kotlin.isStartTag;
import kotlin.isStartTagIgnorePrefix;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.onEnded;
import kotlin.onOutputFrameAvailableForRendering;
import kotlin.onOutputSizeChanged;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.stripPrefix;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020;H\u0002J\b\u0010=\u001a\u00020;H\u0002J\u000e\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020+H\u0002J\b\u0010C\u001a\u00020;H\u0002J\b\u0010D\u001a\u00020;H\u0002J\b\u0010E\u001a\u00020;H\u0002J\u0010\u0010F\u001a\u00020;2\u0006\u0010B\u001a\u00020+H\u0002J\u001e\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u000201H\u0082@¢\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u00020;2\u0006\u0010B\u001a\u00020+H\u0002J\u0018\u0010L\u001a\u00020;2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020+0\u001aH\u0002J\u0018\u0010N\u001a\u00020;2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020+0\u001aH\u0002J\b\u0010O\u001a\u00020;H\u0002J$\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u0002012\b\b\u0002\u0010R\u001a\u00020\u00112\b\b\u0002\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020;H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a0-0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a0-0\u001f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u000e\u00100\u001a\u000201X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000201X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000201X\u0082D¢\u0006\u0002\n\u0000Rz\u00105\u001an\u0012\u0004\u0012\u00020\u0011\u0012,\u0012*\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a06j\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a`706j6\u0012\u0004\u0012\u00020\u0011\u0012,\u0012*\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a06j\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001a`7`7X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/marrow2/ui/better_search/BetterSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchUseCase", "Lcom/marrow2/domain/search/SearchUseCase;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "fileCacheUseCase", "Lcom/marrow2/domain/fileCache/FileCacheUseCase;", "lessonUseCase", "Lcom/marrow2/domain/lesson/LessonApiUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/marrow2/domain/search/SearchUseCase;Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/domain/fileCache/FileCacheUseCase;Lcom/marrow2/domain/lesson/LessonApiUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "mcqDisplayId", "", "searchText", "selectedTab", "Lcom/marrow2/ui/better_search/model/SearchTabsType;", "getSelectedTab", "()Lcom/marrow2/ui/better_search/model/SearchTabsType;", "setSelectedTab", "(Lcom/marrow2/ui/better_search/model/SearchTabsType;)V", "listOfTabsNotVisible", "", "Lcom/marrow2/ui/better_search/model/SearchItemType;", "_tabs", "Lkotlinx/coroutines/flow/MutableStateFlow;", "tabs", "Lkotlinx/coroutines/flow/StateFlow;", "getTabs", "()Lkotlinx/coroutines/flow/StateFlow;", "_searchUIState", "Lcom/marrow2/ui/better_search/model/SearchUIState;", "searchUIState", "getSearchUIState", "_searchNavState", "Lcom/marrow2/ui/better_search/model/SearchNavEvent;", "searchNavState", "getSearchNavState", "_recentSearch", "Lcom/marrow2/ui/better_search/model/SearchedItemVMModel;", "_results", "Lcom/marrow2/core/utils/VMState;", "results", "getResults", "ID_BASED_ERROR_08", "", "ID_BASED_ERROR_10", "TEXT_BASED_ERROR", "PRO_MCQ_ERROR", "cacheMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isRecentSearch", "", "getRelevantData", "", "getHintAndDescription", "initTabs", "notifyEvent", "event", "Lcom/marrow2/ui/better_search/model/SearchUIEvent;", "logSearchItemCLickEvent", "item", "tabSelected", "clearSearch", "clearAllRecentSearch", "navigate", "getLessonSearchResultNavigationType", "lessonId", "startTime", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToRecentSearch", "updateSearchUIState", "result", "updateCache", "setTabErrorMessage", "handleError", "errorCode", "message", "errorType", "Lcom/marrow2/domain/search/model/SearchResultType;", "search", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetterSearchViewModel extends POJOPropertyBuilderWithMember {
    private final int AudioAttributesCompatParcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>>> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<isEndTag> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<List<getAttributeValueIgnorePrefix>> AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final getResolutionSize<onOutputSizeChanged> MediaBrowserCompatCustomActionResultReceiver;
    private final isSeekPending MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private final skipH265ScalingList MediaBrowserCompatSearchResultReceiver;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final LogLogLevel MediaDescriptionCompat;
    private final allSamplesAreSyncSamples MediaMetadataCompat;
    private HashMap<String, HashMap<getAttributeValueIgnorePrefix, List<isStartTagIgnorePrefix>>> RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private final setUpdatedStatus<onOutputSizeChanged> handleMediaPlayPauseIfPendingOnHandler;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>>> onAddQueueItem;
    private String onCommand;
    private final List<XmlPullParserUtil> onCustomAction;
    private getAttributeValueIgnorePrefix onMediaButtonEvent;
    private final setUpdatedStatus<List<getAttributeValueIgnorePrefix>> onPause;
    private final TimedValueQueue onPlay;
    private final setUpdatedStatus<isEndTag> onPlayFromMediaId;
    private final int read;
    private List<? extends isStartTagIgnorePrefix> write;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[LessonNavigationCategory.values().length];
            try {
                iArr[LessonNavigationCategory.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LessonNavigationCategory.QBANK_INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LessonNavigationCategory.PRO_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    static final class read extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return BetterSearchViewModel.this.RemoteActionCompatParcelizer((String) null, 0, this);
        }
    }

    @setSdkPayload
    public BetterSearchViewModel(TimedValueQueue timedValueQueue, LogLogLevel logLogLevel, isSeekPending isseekpending, allSamplesAreSyncSamples allsamplesaresyncsamples, skipH265ScalingList skiph265scalinglist, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(timedValueQueue, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(allsamplesaresyncsamples, "");
        toMagicModuleMetaRepoModel.write(skiph265scalinglist, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.onPlay = timedValueQueue;
        this.MediaDescriptionCompat = logLogLevel;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        this.MediaMetadataCompat = allsamplesaresyncsamples;
        this.MediaBrowserCompatSearchResultReceiver = skiph265scalinglist;
        this.onCommand = (String) pOJOPropertyBuilder5.write("shared_mcq_id");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = "";
        this.onMediaButtonEvent = getAttributeValueIgnorePrefix.read;
        this.onCustomAction = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new XmlPullParserUtil[]{XmlPullParserUtil.AudioAttributesImplBaseParcelizer, XmlPullParserUtil.RemoteActionCompatParcelizer, XmlPullParserUtil.read});
        getResolutionSize<List<getAttributeValueIgnorePrefix>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.onPause = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<isEndTag> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(isEndTag.read);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<onOutputSizeChanged> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(onOutputSizeChanged.IconCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.RemoteActionCompatParcelizer = 1408;
        this.AudioAttributesCompatParcelizer = 1410;
        this.read = 1404;
        this.IconCompatParcelizer = 1409;
        this.RatingCompat = new HashMap<>();
        MediaMetadataCompat();
        MediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final getAttributeValueIgnorePrefix getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<List<getAttributeValueIgnorePrefix>> AudioAttributesImplBaseParcelizer() {
        return this.onPause;
    }

    public final setUpdatedStatus<isEndTag> IconCompatParcelizer() {
        return this.onPlayFromMediaId;
    }

    public final setUpdatedStatus<onOutputSizeChanged> read() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<isStartTagIgnorePrefix>>> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            BetterSearchViewModel betterSearchViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                BetterSearchViewModel betterSearchViewModel2 = BetterSearchViewModel.this;
                this.RemoteActionCompatParcelizer = betterSearchViewModel2;
                this.IconCompatParcelizer = 1;
                Object objAudioAttributesCompatParcelizer = betterSearchViewModel2.onPlay.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                betterSearchViewModel = betterSearchViewModel2;
                obj = objAudioAttributesCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                betterSearchViewModel = (BetterSearchViewModel) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(stripPrefix.IconCompatParcelizer((getFirstSampleTimestampUs) it.next()));
            }
            betterSearchViewModel.write = arrayList;
            if (!BetterSearchViewModel.this.write.isEmpty()) {
                BetterSearchViewModel.this.MediaBrowserCompatMediaItem = true;
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(BetterSearchViewModel.this.AudioAttributesImplApi21Parcelizer, BetterSearchViewModel.this.write);
            }
            BetterSearchViewModel.handleMediaPlayPauseIfPendingOnHandler(BetterSearchViewModel.this);
            BetterSearchViewModel.this.MediaBrowserCompatCustomActionResultReceiver();
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.UtilExternalSyntheticLambda3
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = BetterSearchViewModel.this.MediaDescriptionCompat.write(this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
                BetterSearchViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.MediaMetadataCompat(new onOutputFrameAvailableForRendering(str, ((CourseConfigV2) obj).getCourseStrings().getSearchDescription())));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            String searchHint = ((CourseConfigV2) obj).getCourseStrings().getSearchHint();
            this.write = searchHint;
            this.IconCompatParcelizer = 2;
            Object objWrite = BetterSearchViewModel.this.MediaDescriptionCompat.write(this);
            if (objWrite != objIconCompatParcelizer) {
                str = searchHint;
                obj = objWrite;
                BetterSearchViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.MediaMetadataCompat(new onOutputFrameAvailableForRendering(str, ((CourseConfigV2) obj).getCourseStrings().getSearchDescription())));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.registerInputStream
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = BetterSearchViewModel.this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = getresolutionsize2;
                this.RemoteActionCompatParcelizer = 1;
                Object objWrite = BetterSearchViewModel.this.MediaDescriptionCompat.write(this);
                if (objWrite == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objWrite;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List<CourseConfigV2.SearchItem> searchItems = ((CourseConfigV2) obj).getSearchItems();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) searchItems, 10));
            Iterator<T> it = searchItems.iterator();
            while (it.hasNext()) {
                arrayList.add(AvcConfig.AudioAttributesCompatParcelizer((CourseConfigV2.SearchItem) it.next()));
            }
            getresolutionsize.write(AvcConfig.read(arrayList));
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.queueInputTexture
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(isStartTag isstarttag) {
        toMagicModuleMetaRepoModel.write(isstarttag, "");
        if (isstarttag instanceof isStartTag.AudioAttributesImplApi21Parcelizer) {
            isStartTag.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (isStartTag.AudioAttributesImplApi21Parcelizer) isstarttag;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) audioAttributesImplApi21Parcelizer.write())) {
                return;
            }
            String strWrite = audioAttributesImplApi21Parcelizer.write();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = strWrite;
            if (strWrite.length() >= 3) {
                this.RatingCompat = new HashMap<>();
                MediaBrowserCompatMediaItem();
                return;
            } else {
                handleMediaPlayPauseIfPendingOnHandler(this);
                return;
            }
        }
        if (isstarttag instanceof isStartTag.MediaBrowserCompatCustomActionResultReceiver) {
            this.onMediaButtonEvent = ((isStartTag.MediaBrowserCompatCustomActionResultReceiver) isstarttag).read();
            MediaDescriptionCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(onOutputSizeChanged.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.write.INSTANCE)) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(onOutputSizeChanged.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.IconCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (isstarttag instanceof isStartTag.MediaBrowserCompatItemReceiver) {
            isStartTag.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (isStartTag.MediaBrowserCompatItemReceiver) isstarttag;
            write(mediaBrowserCompatItemReceiver.read());
            IconCompatParcelizer(mediaBrowserCompatItemReceiver.read());
            AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver.read());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            handleMediaPlayPauseIfPendingOnHandler(this);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.RemoteActionCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (isstarttag instanceof isStartTag.read) {
            isStartTag.read readVar = (isStartTag.read) isstarttag;
            if (readVar.IconCompatParcelizer().length() > 0) {
                this.AudioAttributesImplApi26Parcelizer.write(isEndTag.MediaBrowserCompatItemReceiver);
            } else {
                this.AudioAttributesImplApi26Parcelizer.write(isEndTag.RemoteActionCompatParcelizer);
            }
            if (readVar.IconCompatParcelizer().length() < 3) {
                this.onMediaButtonEvent = getAttributeValueIgnorePrefix.read;
                this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.AudioAttributesImplBaseParcelizer());
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null);
                handleMediaPlayPauseIfPendingOnHandler(this);
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.MediaBrowserCompatMediaItem.INSTANCE)) {
            getResolutionSize<onOutputSizeChanged> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            String lowerCase = "PRO_MCQ_ACCESSED".toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            getresolutionsize.write(new onOutputSizeChanged.write("Pro Subscription Dialog", lowerCase));
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isstarttag, isStartTag.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        getResolutionSize<onOutputSizeChanged> getresolutionsize2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String lowerCase2 = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
        getresolutionsize2.write(new onOutputSizeChanged.write("Pro Subscription Dialog", lowerCase2));
    }

    private final void write(isStartTagIgnorePrefix isstarttagignoreprefix) {
        if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer() == isEndTag.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
        onEnded onended = onEnded.INSTANCE;
        isseekpending.write(onEnded.IconCompatParcelizer(getAttributeValue.AudioAttributesCompatParcelizer(isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer()), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private final void MediaDescriptionCompat() {
        HashMap<getAttributeValueIgnorePrefix, List<isStartTagIgnorePrefix>> map;
        List<isStartTagIgnorePrefix> list;
        RatingCompat();
        if (this.RatingCompat.containsKey(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && (map = this.RatingCompat.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) != null && map.containsKey(this.onMediaButtonEvent)) {
            HashMap<getAttributeValueIgnorePrefix, List<isStartTagIgnorePrefix>> map2 = this.RatingCompat.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (map2 == null || (list = map2.get(this.onMediaButtonEvent)) == null) {
                return;
            }
            this.MediaBrowserCompatMediaItem = false;
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, list);
            return;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.length() >= 3) {
            MediaBrowserCompatMediaItem();
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.RatingCompat = new HashMap<>();
        this.onMediaButtonEvent = getAttributeValueIgnorePrefix.read;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = "";
        MediaBrowserCompatSearchResultReceiver();
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (BetterSearchViewModel.this.onPlay.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            BetterSearchViewModel.this.MediaBrowserCompatSearchResultReceiver();
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getInputSurface
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.MediaBrowserCompatItemReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private /* synthetic */ isStartTagIgnorePrefix RemoteActionCompatParcelizer;
        private int write;

        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] read;

            static {
                int[] iArr = new int[XmlPullParserUtil.values().length];
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[XmlPullParserUtil.write.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[XmlPullParserUtil.read.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                read = iArr;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            getResolutionSize getresolutionsize2;
            onOutputSizeChanged.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            getResolutionSize getresolutionsize3;
            onOutputSizeChanged onoutputsizechanged;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize = BetterSearchViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                switch (write.read[this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        this.IconCompatParcelizer = getresolutionsize;
                        this.write = 1;
                        if (BetterSearchViewModel.this.MediaMetadataCompat.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()), this) != objIconCompatParcelizer) {
                            getresolutionsize2 = getresolutionsize;
                            audioAttributesCompatParcelizer = new onOutputSizeChanged.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                            getresolutionsize = getresolutionsize2;
                            break;
                        }
                        return objIconCompatParcelizer;
                    case 5:
                    case 6:
                        audioAttributesCompatParcelizer = new onOutputSizeChanged.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
                        break;
                    case 7:
                    case 8:
                        audioAttributesCompatParcelizer = new onOutputSizeChanged.read(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
                        break;
                    case 9:
                        audioAttributesCompatParcelizer = new onOutputSizeChanged.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                        break;
                    case 10:
                        this.IconCompatParcelizer = getresolutionsize;
                        this.write = 2;
                        Object objRemoteActionCompatParcelizer = BetterSearchViewModel.this.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), 0, this);
                        if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                            obj = objRemoteActionCompatParcelizer;
                            getresolutionsize3 = getresolutionsize;
                            onoutputsizechanged = (onOutputSizeChanged) obj;
                            onOutputSizeChanged onoutputsizechanged2 = onoutputsizechanged;
                            getresolutionsize = getresolutionsize3;
                            audioAttributesCompatParcelizer = onoutputsizechanged2;
                            break;
                        }
                        return objIconCompatParcelizer;
                    case 11:
                        isStartTagIgnorePrefix isstarttagignoreprefix = this.RemoteActionCompatParcelizer;
                        if (isstarttagignoreprefix instanceof ColorInfo) {
                            this.IconCompatParcelizer = getresolutionsize;
                            this.write = 3;
                            Object objRemoteActionCompatParcelizer2 = BetterSearchViewModel.this.RemoteActionCompatParcelizer(((ColorInfo) isstarttagignoreprefix).getAudioAttributesImplApi21Parcelizer(), ((ColorInfo) this.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), this);
                            if (objRemoteActionCompatParcelizer2 != objIconCompatParcelizer) {
                                obj = objRemoteActionCompatParcelizer2;
                                getresolutionsize3 = getresolutionsize;
                                onoutputsizechanged = (onOutputSizeChanged) obj;
                                onOutputSizeChanged onoutputsizechanged22 = onoutputsizechanged;
                                getresolutionsize = getresolutionsize3;
                                audioAttributesCompatParcelizer = onoutputsizechanged22;
                            }
                            break;
                        } else {
                            this.IconCompatParcelizer = getresolutionsize;
                            this.write = 4;
                            Object objRemoteActionCompatParcelizer3 = BetterSearchViewModel.this.RemoteActionCompatParcelizer(isstarttagignoreprefix.AudioAttributesImplApi26Parcelizer(), 0, this);
                            if (objRemoteActionCompatParcelizer3 != objIconCompatParcelizer) {
                                obj = objRemoteActionCompatParcelizer3;
                                getresolutionsize3 = getresolutionsize;
                                onoutputsizechanged = (onOutputSizeChanged) obj;
                                onOutputSizeChanged onoutputsizechanged222 = onoutputsizechanged;
                                getresolutionsize = getresolutionsize3;
                                audioAttributesCompatParcelizer = onoutputsizechanged222;
                            }
                            break;
                        }
                        return objIconCompatParcelizer;
                    default:
                        throw new RenewEligibleCreator();
                }
            } else if (i == 1) {
                getresolutionsize2 = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                audioAttributesCompatParcelizer = new onOutputSizeChanged.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                getresolutionsize = getresolutionsize2;
            } else if (i == 2) {
                getresolutionsize3 = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                onoutputsizechanged = (onOutputSizeChanged) obj;
                onOutputSizeChanged onoutputsizechanged2222 = onoutputsizechanged;
                getresolutionsize = getresolutionsize3;
                audioAttributesCompatParcelizer = onoutputsizechanged2222;
            } else if (i == 3) {
                getresolutionsize3 = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                onoutputsizechanged = (onOutputSizeChanged) obj;
                onOutputSizeChanged onoutputsizechanged22222 = onoutputsizechanged;
                getresolutionsize = getresolutionsize3;
                audioAttributesCompatParcelizer = onoutputsizechanged22222;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize3 = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                onoutputsizechanged = (onOutputSizeChanged) obj;
                onOutputSizeChanged onoutputsizechanged222222 = onoutputsizechanged;
                getresolutionsize = getresolutionsize3;
                audioAttributesCompatParcelizer = onoutputsizechanged222222;
            }
            getresolutionsize.write(audioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(isStartTagIgnorePrefix isstarttagignoreprefix, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = isstarttagignoreprefix;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(isStartTagIgnorePrefix isstarttagignoreprefix) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(isstarttagignoreprefix, null), new MagicModuleSubmissionRequestBody() { // from class: o.getPendingInputFrameCount
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.RatingCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r5, int r6, kotlin.SampleVideos<? super kotlin.onOutputSizeChanged> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.better_search.BetterSearchViewModel.read
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.better_search.BetterSearchViewModel$read r0 = (com.marrow2.ui.better_search.BetterSearchViewModel.read) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            com.marrow2.ui.better_search.BetterSearchViewModel$read r0 = new com.marrow2.ui.better_search.BetterSearchViewModel$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r6 = r0.write
            java.lang.Object r4 = r0.IconCompatParcelizer
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4b
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.skipH265ScalingList r4 = r4.MediaBrowserCompatSearchResultReceiver
            r0.IconCompatParcelizer = r5
            r0.write = r6
            r0.read = r3
            java.lang.Object r7 = r4.write(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.marrow2.domain.lesson.model.LessonNavigationCategory r7 = (com.marrow2.domain.lesson.model.LessonNavigationCategory) r7
            int[] r4 = com.marrow2.ui.better_search.BetterSearchViewModel.AudioAttributesCompatParcelizer.IconCompatParcelizer
            int r7 = r7.ordinal()
            r4 = r4[r7]
            if (r4 == r3) goto L70
            r6 = 2
            if (r4 == r6) goto L68
            r5 = 3
            if (r4 != r5) goto L62
            o.onOutputSizeChanged$MediaDescriptionCompat r4 = o.onOutputSizeChanged.MediaDescriptionCompat.INSTANCE
            o.onOutputSizeChanged r4 = (kotlin.onOutputSizeChanged) r4
            return r4
        L62:
            o.RenewEligibleCreator r4 = new o.RenewEligibleCreator
            r4.<init>()
            throw r4
        L68:
            o.onOutputSizeChanged$MediaBrowserCompatCustomActionResultReceiver r4 = new o.onOutputSizeChanged$MediaBrowserCompatCustomActionResultReceiver
            r4.<init>(r5)
            o.onOutputSizeChanged r4 = (kotlin.onOutputSizeChanged) r4
            return r4
        L70:
            o.onOutputSizeChanged$MediaBrowserCompatItemReceiver r4 = new o.onOutputSizeChanged$MediaBrowserCompatItemReceiver
            r4.<init>(r5, r6)
            o.onOutputSizeChanged r4 = (kotlin.onOutputSizeChanged) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.better_search.BetterSearchViewModel.RemoteActionCompatParcelizer(java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ isStartTagIgnorePrefix AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (BetterSearchViewModel.this.onPlay.RemoteActionCompatParcelizer(adjustTsTimestamp.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
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
        AudioAttributesImplApi21Parcelizer(isStartTagIgnorePrefix isstarttagignoreprefix, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = isstarttagignoreprefix;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(isStartTagIgnorePrefix isstarttagignoreprefix) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(isstarttagignoreprefix, null), new MagicModuleSubmissionRequestBody() { // from class: o.registerInputFrame
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(BetterSearchViewModel betterSearchViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        betterSearchViewModel.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.MediaBrowserCompatSearchResultReceiver(str));
        return getShowPopup.INSTANCE;
    }

    static /* synthetic */ void handleMediaPlayPauseIfPendingOnHandler(BetterSearchViewModel betterSearchViewModel) {
        betterSearchViewModel.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<? extends isStartTagIgnorePrefix> list) {
        List<isStartTagIgnorePrefix> list2;
        String str = this.onCommand;
        if (str != null && str.length() != 0) {
            getResolutionSize<onOutputSizeChanged> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            String str2 = this.onCommand;
            toMagicModuleMetaRepoModel.write((Object) str2);
            getresolutionsize.write(new onOutputSizeChanged.MediaBrowserCompatMediaItem(str2));
        }
        if (list.size() > 1) {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.MediaMetadataCompat);
        } else if (list.size() == 1 && this.onCustomAction.contains(list.get(0).AudioAttributesImplApi21Parcelizer())) {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesCompatParcelizer);
        } else if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.length() > 0 && this.RatingCompat.containsKey(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.MediaMetadataCompat);
            HashMap<getAttributeValueIgnorePrefix, List<isStartTagIgnorePrefix>> map = this.RatingCompat.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (map != null && (list2 = map.get(this.onMediaButtonEvent)) != null && list2.size() == 1 && this.onCustomAction.contains(((isStartTagIgnorePrefix) IntermediateLoginResponseBody.RatingCompat((List) list2)).AudioAttributesImplApi21Parcelizer())) {
                this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesCompatParcelizer);
            }
        } else if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.length() < 3) {
            if (!this.write.isEmpty()) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.queueInputBitmap
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return BetterSearchViewModel.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
                    }
                });
                this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesImplApi26Parcelizer);
            } else {
                this.AudioAttributesImplApi26Parcelizer.write(isEndTag.read);
            }
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            BetterSearchViewModel betterSearchViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                BetterSearchViewModel betterSearchViewModel2 = BetterSearchViewModel.this;
                this.AudioAttributesCompatParcelizer = betterSearchViewModel2;
                this.write = 1;
                Object objAudioAttributesCompatParcelizer = betterSearchViewModel2.onPlay.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                betterSearchViewModel = betterSearchViewModel2;
                obj = objAudioAttributesCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                betterSearchViewModel = (BetterSearchViewModel) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(stripPrefix.IconCompatParcelizer((getFirstSampleTimestampUs) it.next()));
            }
            betterSearchViewModel.write = arrayList;
            if (!BetterSearchViewModel.this.write.isEmpty()) {
                BetterSearchViewModel.this.MediaBrowserCompatMediaItem = true;
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(BetterSearchViewModel.this.AudioAttributesImplApi21Parcelizer, BetterSearchViewModel.this.write);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(BetterSearchViewModel betterSearchViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        betterSearchViewModel.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.MediaBrowserCompatSearchResultReceiver(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<? extends isStartTagIgnorePrefix> list) {
        HashMap<getAttributeValueIgnorePrefix, List<isStartTagIgnorePrefix>> map = this.RatingCompat.get(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(this.onMediaButtonEvent, list);
        this.RatingCompat.put(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, map);
    }

    private final void RatingCompat() {
        this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.RatingCompat(this.onMediaButtonEvent));
    }

    static /* synthetic */ void write(BetterSearchViewModel betterSearchViewModel, int i, String str, getLastAdjustedTimestampUs getlastadjustedtimestampus, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            getlastadjustedtimestampus = getLastAdjustedTimestampUs.AudioAttributesCompatParcelizer;
        }
        betterSearchViewModel.RemoteActionCompatParcelizer(i, str, getlastadjustedtimestampus);
    }

    private final void RemoteActionCompatParcelizer(int i, String str, getLastAdjustedTimestampUs getlastadjustedtimestampus) {
        this.AudioAttributesImplApi26Parcelizer.write(isEndTag.MediaBrowserCompatCustomActionResultReceiver);
        if (i == this.RemoteActionCompatParcelizer || i == this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesCompatParcelizer);
            if (getlastadjustedtimestampus == getLastAdjustedTimestampUs.read) {
                this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.RatingCompat(getAttributeValueIgnorePrefix.AudioAttributesCompatParcelizer));
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.RatingCompat(getAttributeValueIgnorePrefix.write));
            }
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.write);
            return;
        }
        if (i == this.IconCompatParcelizer) {
            this.onCommand = null;
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.AudioAttributesImplApi21Parcelizer);
        } else if (i == this.read) {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.write);
            RatingCompat();
        } else {
            this.AudioAttributesImplApi26Parcelizer.write(isEndTag.IconCompatParcelizer);
            this.MediaBrowserCompatCustomActionResultReceiver.write(new onOutputSizeChanged.MediaBrowserCompatSearchResultReceiver(str));
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.better_search.BetterSearchViewModel.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BetterSearchViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.VideoFrameProcessor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BetterSearchViewModel.read(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(BetterSearchViewModel betterSearchViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        betterSearchViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = "";
        betterSearchViewModel.onCommand = null;
        write(betterSearchViewModel, i, str, null, 4);
        return getShowPopup.INSTANCE;
    }
}
