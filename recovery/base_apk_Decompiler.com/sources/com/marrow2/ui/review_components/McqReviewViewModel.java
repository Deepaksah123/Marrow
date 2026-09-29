package com.marrow2.ui.review_components;

import com.marrow2.ui.review_components.McqReviewViewModel;
import dagger.Lazy;
import java.util.List;
import kotlin.BaseGmsClient;
import kotlin.C0201setMcqCount;
import kotlin.CachedContent;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SubtitleViewOutput;
import kotlin.SurfaceInfo;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.binarySearchCeil;
import kotlin.buildCacheKey;
import kotlin.checkAvailabilityAndConnect;
import kotlin.decodeBitmap;
import kotlin.getAnswerMap;
import kotlin.getApiFeatures;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.onDisplayInfoChanged;
import kotlin.revokeAccess;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzbV;
import kotlin.zzhq;
import kotlin.zzhr;
import kotlin.zzhs;
import kotlin.zzkx;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u00107\u001a\u0002082\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208JJ\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020,2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\"2\u0006\u0010B\u001a\u0002012\u0006\u0010C\u001a\u0002012\u0006\u0010D\u001a\u0002012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\"J\u0006\u0010G\u001a\u000208J0\u0010H\u001a\u0002082\u0006\u00103\u001a\u00020,2\u0006\u0010I\u001a\u00020-2\b\b\u0002\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u000201J\u0006\u0010M\u001a\u000208J\b\u0010N\u001a\u000208H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\"\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+0\u001e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002010\u001e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u000e\u00103\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/marrow2/ui/review_components/McqReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "schemaUseCase", "Lcom/marrow2/domain/schema/SchemaUseCase;", "subjectUseCase", "Ldagger/Lazy;", "Lcom/marrow2/domain/subject/SubjectUseCase;", "deeplinkManager", "Lcom/marrow2/core/deepLink/DeeplinkManager;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "videoController", "Lcom/marrow2/ui/mcq/component/McqVideoPlaybackController;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/domain/schema/SchemaUseCase;Ldagger/Lazy;Ldagger/Lazy;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/ui/mcq/component/McqVideoPlaybackController;Lkotlinx/coroutines/CoroutineDispatcher;)V", "videoPlayback", "Lcom/marrow2/ui/mcq/component/McqVideoPlayback;", "getVideoPlayback", "()Lcom/marrow2/ui/mcq/component/McqVideoPlayback;", "_mcqUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/review_components/model/McqReviewUIState;", "mcqUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getMcqUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_mcqDescriptionContents", "", "Lcom/marrow2/data/mcq/local/model/McqContent$AnswerDesc;", "mcqDescriptionContents", "getMcqDescriptionContents", "_navigateState", "Lcom/marrow2/ui/review_components/model/McqNavigateUiState;", "navigateState", "getNavigateState", "_bookmarkBroadcastDispatcher", "Lkotlin/Pair;", "", "Lcom/marrow2/domain/mcq/model/BookmarkType;", "bookmarkBroadcastDispatcher", "getBookmarkBroadcastDispatcher", "_isLoading", "", "isLoading", "mcqId", "parentId", "mcqUCModel", "Lcom/marrow2/data/mcq/local/model/McqUCModel;", "init", "", "reviewParentType", "Lcom/marrow2/ui/review_components/model/ReviewParentType;", "onShared", "clearNavigation", "onReportSubmit", "title", "description", "errorType", "", "factualError", "confusingQuestion", "inAdequateExp", "faqs", "Lcom/marrow2/ui/dialogs/feedbackReport/FaqModel;", "onReportClicked", "onBookmarked", "bookmarkType", "uiOnly", "parentType", "isSolveMode", "clearBookmarkBroadCast", "onCleared", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McqReviewViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<Pair<String, onDisplayInfoChanged>> AudioAttributesCompatParcelizer;
    private final getPlatform AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<Pair<String, onDisplayInfoChanged>> AudioAttributesImplApi26Parcelizer;
    private final isSeekPending AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr>> IconCompatParcelizer;
    private final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver;
    private final Lazy<SubtitleViewOutput> MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr>> MediaBrowserCompatMediaItem;
    private final setUpdatedStatus<List<buildCacheKey.IconCompatParcelizer>> MediaBrowserCompatSearchResultReceiver;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private String MediaDescriptionCompat;
    private final NetworkTypeObserverApi31DisplayInfoCallback MediaMetadataCompat;
    private CachedContent RatingCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final SurfaceInfo handleMediaPlayPauseIfPendingOnHandler;
    private final getDisplaySizeV17 onAddQueueItem;
    private final setUpdatedStatus<zzhq> onCommand;
    private final Lazy<binarySearchCeil> onCustomAction;
    private final checkAvailabilityAndConnect onMediaButtonEvent;
    private final getResolutionSize<zzhq> read;
    private final getResolutionSize<List<buildCacheKey.IconCompatParcelizer>> write;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[zzhs.values().length];
            try {
                iArr[zzhs.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzhs.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzhs.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    @setSdkPayload
    public McqReviewViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getDisplaySizeV17 getdisplaysizev17, SurfaceInfo surfaceInfo, Lazy<binarySearchCeil> lazy, Lazy<SubtitleViewOutput> lazy2, isSeekPending isseekpending, checkAvailabilityAndConnect checkavailabilityandconnect, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(lazy2, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(checkavailabilityandconnect, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.MediaMetadataCompat = networkTypeObserverApi31DisplayInfoCallback;
        this.onAddQueueItem = getdisplaysizev17;
        this.handleMediaPlayPauseIfPendingOnHandler = surfaceInfo;
        this.onCustomAction = lazy;
        this.MediaBrowserCompatItemReceiver = lazy2;
        this.AudioAttributesImplBaseParcelizer = isseekpending;
        this.onMediaButtonEvent = checkavailabilityandconnect;
        this.AudioAttributesImplApi21Parcelizer = getplatform;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<List<buildCacheKey.IconCompatParcelizer>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zzhq> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(zzhq.AudioAttributesCompatParcelizer.INSTANCE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Pair<String, onDisplayInfoChanged>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(null);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
    }

    public final getApiFeatures AudioAttributesImplApi26Parcelizer() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr>> AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<List<buildCacheKey.IconCompatParcelizer>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<zzhq> AudioAttributesImplBaseParcelizer() {
        return this.onCommand;
    }

    public final setUpdatedStatus<Pair<String, onDisplayInfoChanged>> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(String str, String str2, zzhs zzhsVar) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        String str3 = this.MediaDescriptionCompat;
        if (str3 != null) {
            if (str3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                str3 = null;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str3, (Object) str) && (this.IconCompatParcelizer.IconCompatParcelizer() instanceof decodeBitmap)) {
                return;
            }
        }
        this.MediaDescriptionCompat = str;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str2;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(str, str2, zzhsVar, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzhf
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return McqReviewViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ zzhs RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(McqReviewViewModel.this.AudioAttributesImplApi21Parcelizer, new AnonymousClass4(McqReviewViewModel.this, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.review_components.McqReviewViewModel$write$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ zzhs AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private int AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private int IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private Object MediaBrowserCompatMediaItem;
            private Object MediaBrowserCompatSearchResultReceiver;
            private Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            private Object MediaDescriptionCompat;
            private Object MediaMetadataCompat;
            private Object RatingCompat;
            private /* synthetic */ String RemoteActionCompatParcelizer;
            private Object handleMediaPlayPauseIfPendingOnHandler;
            private Object onAddQueueItem;
            private Object onCommand;
            private Object onCustomAction;
            private Object onFastForward;
            private Object onMediaButtonEvent;
            private boolean onPause;
            private Object onPlay;
            private Object onPlayFromMediaId;
            private int onPlayFromUri;
            private /* synthetic */ McqReviewViewModel onPrepareFromSearch;
            private /* synthetic */ String read;
            private int write;

            /* JADX WARN: Removed duplicated region for block: B:106:0x031d  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x032d  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x033d  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x034d  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x035d  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0371  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0395  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x03a7  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x03b9  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x03cb  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x03dd  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x03ef  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x0401  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x046b  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x04a3  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x04b3  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x04b8  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x04c4  */
            /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01f0  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r48) {
                /*
                    Method dump skipped, instruction units count: 1250
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.review_components.McqReviewViewModel.write.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(McqReviewViewModel mcqReviewViewModel, String str, String str2, zzhs zzhsVar, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.onPrepareFromSearch = mcqReviewViewModel;
                this.read = str;
                this.RemoteActionCompatParcelizer = str2;
                this.AudioAttributesCompatParcelizer = zzhsVar;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.onPrepareFromSearch, this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, String str2, zzhs zzhsVar, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = zzhsVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new write(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            if (r9 != r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.review_components.McqReviewViewModel.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(McqReviewViewModel mcqReviewViewModel, zzhr zzhrVar, String str) {
            if (str.length() != 0) {
                getResolutionSize getresolutionsize = mcqReviewViewModel.read;
                CachedContent cachedContent = mcqReviewViewModel.RatingCompat;
                if (cachedContent == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    cachedContent = null;
                }
                String iconCompatParcelizer = cachedContent.getIconCompatParcelizer();
                String strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = zzhrVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                List<String> listMediaBrowserCompatSearchResultReceiver = zzhrVar.MediaBrowserCompatSearchResultReceiver();
                String str2 = listMediaBrowserCompatSearchResultReceiver.size() > 0 ? listMediaBrowserCompatSearchResultReceiver.get(0) : "";
                List<String> listMediaBrowserCompatSearchResultReceiver2 = zzhrVar.MediaBrowserCompatSearchResultReceiver();
                String str3 = 1 < listMediaBrowserCompatSearchResultReceiver2.size() ? listMediaBrowserCompatSearchResultReceiver2.get(1) : "";
                List<String> listMediaBrowserCompatSearchResultReceiver3 = zzhrVar.MediaBrowserCompatSearchResultReceiver();
                getresolutionsize.write(new zzhq.AudioAttributesImplBaseParcelizer(iconCompatParcelizer, strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, str2, str3, 2 < listMediaBrowserCompatSearchResultReceiver3.size() ? listMediaBrowserCompatSearchResultReceiver3.get(2) : "", str));
            } else {
                mcqReviewViewModel.read.write(new zzhq.MediaBrowserCompatCustomActionResultReceiver("There was a problem creating a share link. Please try again later"));
            }
            mcqReviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzhk
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return McqReviewViewModel.AudioAttributesImplApi21Parcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(McqReviewViewModel mcqReviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        new zzhq.MediaBrowserCompatCustomActionResultReceiver("There was a problem creating a share link. Please try again later");
        mcqReviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read.write(zzhq.AudioAttributesCompatParcelizer.INSTANCE);
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ List<Integer> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                McqReviewViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                McqReviewViewModel.this.read.write(zzhq.AudioAttributesCompatParcelizer.INSTANCE);
                NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback = McqReviewViewModel.this.MediaMetadataCompat;
                String str = McqReviewViewModel.this.MediaDescriptionCompat;
                if (str == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    str = null;
                }
                this.AudioAttributesCompatParcelizer = 1;
                if (networkTypeObserverApi31DisplayInfoCallback.RemoteActionCompatParcelizer(str, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            McqReviewViewModel.this.read.write(zzhq.IconCompatParcelizer.INSTANCE);
            McqReviewViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, String str2, List<Integer> list, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.read = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void write(String str, final String str2, List<Integer> list, final boolean z, final boolean z2, final boolean z3, final List<revokeAccess> list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(str, str2, list, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzhg
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return McqReviewViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, list2, str2, z, z2, z3, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(McqReviewViewModel mcqReviewViewModel, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        mcqReviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        mcqReviewViewModel.read.write(new zzhq.MediaBrowserCompatCustomActionResultReceiver(str2));
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(mcqReviewViewModel), null, null, mcqReviewViewModel.new AudioAttributesImplApi26Parcelizer(list, str, z, z2, z3, null), 3);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ List<revokeAccess> IconCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplApi26Parcelizer = 1;
                if (setCountry.IconCompatParcelizer(150L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            McqReviewViewModel.this.read.write(new zzhq.read(this.IconCompatParcelizer, this.read, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(List<revokeAccess> list, String str, boolean z, boolean z2, boolean z3, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = list;
            this.read = str;
            this.write = z;
            this.RemoteActionCompatParcelizer = z2;
            this.AudioAttributesCompatParcelizer = z3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, this.read, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[LOOP:0: B:24:0x00b4->B:26:0x00ba, LOOP_END] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.review_components.McqReviewViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzhn
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return McqReviewViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(McqReviewViewModel mcqReviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        mcqReviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        mcqReviewViewModel.read.write(new zzhq.MediaBrowserCompatCustomActionResultReceiver(str));
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, boolean z, zzhs zzhsVar, boolean z2) throws Exception {
        zzkx zzkxVar;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        if (this.IconCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) this.IconCompatParcelizer.IconCompatParcelizer().read().MediaMetadataCompat())) {
            return;
        }
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr>> getresolutionsize = this.IconCompatParcelizer;
        zzhr zzhrVar = getresolutionsize.IconCompatParcelizer().read();
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, zzhr.AudioAttributesCompatParcelizer(zzhrVar.MediaDescriptionCompat, zzhrVar.MediaBrowserCompatCustomActionResultReceiver, zzhrVar.onPlayFromSearch, zzhrVar.AudioAttributesImplApi21Parcelizer, zzhrVar.onAddQueueItem, zzhrVar.MediaMetadataCompat, zzhrVar.onPlayFromMediaId, zzhrVar.onCommand, zzhrVar.onCustomAction, zzhrVar.RemoteActionCompatParcelizer, zzhrVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, zzhrVar.AudioAttributesImplBaseParcelizer, zzhrVar.MediaBrowserCompatSearchResultReceiver, zzhrVar.onMediaButtonEvent, zzhrVar.MediaBrowserCompatMediaItem, zzhrVar.IconCompatParcelizer, zzhrVar.onPause, zzhrVar.onPlay, zzhrVar.onFastForward, zzhrVar.handleMediaPlayPauseIfPendingOnHandler, zzhrVar.read, zzhrVar.RatingCompat, zzhrVar.AudioAttributesCompatParcelizer, ondisplayinfochanged, zzhrVar.AudioAttributesImplApi26Parcelizer, zzhrVar.MediaBrowserCompatItemReceiver));
        if (z) {
            return;
        }
        int i = AudioAttributesCompatParcelizer.read[zzhsVar.ordinal()];
        if (i == 1) {
            zzkxVar = z2 ? zzkx.MediaBrowserCompatItemReceiver : zzkx.AudioAttributesImplApi26Parcelizer;
        } else if (i == 2) {
            zzkxVar = z2 ? zzkx.write : zzkx.read;
        } else if (i == 3) {
            zzkxVar = z2 ? zzkx.MediaBrowserCompatCustomActionResultReceiver : zzkx.AudioAttributesCompatParcelizer;
        } else {
            zzkxVar = zzkx.AudioAttributesImplApi21Parcelizer;
        }
        this.AudioAttributesImplBaseParcelizer.write(zzbV.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal(), zzkxVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(str, ondisplayinfochanged, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzhh
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return McqReviewViewModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ onDisplayInfoChanged read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        
            if (kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(kotlin.setRefreshToken.write, new com.marrow2.ui.review_components.McqReviewViewModel.RemoteActionCompatParcelizer.AnonymousClass1(r9.RemoteActionCompatParcelizer, r9.AudioAttributesCompatParcelizer, r9.read, r7, null), r9) != r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.write
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r9 = r9.IconCompatParcelizer
                o.onDisplayInfoChanged r9 = (kotlin.onDisplayInfoChanged) r9
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L94
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L22:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.onDisplayInfoChanged r1 = (kotlin.onDisplayInfoChanged) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L5f
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L44
            L2e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                com.marrow2.ui.review_components.McqReviewViewModel r10 = com.marrow2.ui.review_components.McqReviewViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r10 = com.marrow2.ui.review_components.McqReviewViewModel.MediaBrowserCompatItemReceiver(r10)
                java.lang.String r1 = r9.AudioAttributesCompatParcelizer
                r5 = r9
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r9.write = r4
                java.lang.Object r10 = r10.write(r1, r5)
                if (r10 == r0) goto L97
            L44:
                r1 = r10
                o.onDisplayInfoChanged r1 = (kotlin.onDisplayInfoChanged) r1
                com.marrow2.ui.review_components.McqReviewViewModel r10 = com.marrow2.ui.review_components.McqReviewViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r10 = com.marrow2.ui.review_components.McqReviewViewModel.MediaBrowserCompatItemReceiver(r10)
                java.lang.String r4 = r9.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r5 = r9.read
                r6 = r9
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r9.IconCompatParcelizer = r1
                r9.write = r3
                java.lang.Object r10 = r10.AudioAttributesCompatParcelizer(r4, r5, r6)
                if (r10 != r0) goto L5f
                goto L97
            L5f:
                r7 = r1
                com.marrow2.ui.review_components.McqReviewViewModel r10 = com.marrow2.ui.review_components.McqReviewViewModel.this
                o.getResolutionSize r10 = com.marrow2.ui.review_components.McqReviewViewModel.AudioAttributesImplApi26Parcelizer(r10)
                o.getSubscriptionExpiresOn r1 = new o.getSubscriptionExpiresOn
                java.lang.String r3 = r9.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r4 = r9.read
                r1.<init>(r3, r4)
                r10.write(r1)
                o.setRefreshToken r10 = kotlin.setRefreshToken.write
                o.CurrentQuery r10 = (kotlin.CurrentQuery) r10
                com.marrow2.ui.review_components.McqReviewViewModel$RemoteActionCompatParcelizer$1 r1 = new com.marrow2.ui.review_components.McqReviewViewModel$RemoteActionCompatParcelizer$1
                com.marrow2.ui.review_components.McqReviewViewModel r4 = com.marrow2.ui.review_components.McqReviewViewModel.this
                java.lang.String r5 = r9.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r6 = r9.read
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r3 = r9
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r9.IconCompatParcelizer = r4
                r9.write = r2
                java.lang.Object r9 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r10, r1, r3)
                if (r9 != r0) goto L94
                goto L97
            L94:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            L97:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.review_components.McqReviewViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.marrow2.ui.review_components.McqReviewViewModel$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ McqReviewViewModel MediaBrowserCompatCustomActionResultReceiver;
            private /* synthetic */ onDisplayInfoChanged RemoteActionCompatParcelizer;
            private Object read;
            private /* synthetic */ onDisplayInfoChanged write;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            
                if (r6 == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
            
                if (r7 != r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v9 */
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
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L74
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1a:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Exception -> L38
                    goto La7
                L1f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    com.marrow2.ui.review_components.McqReviewViewModel r7 = r6.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.lang.Exception -> L38
                    o.NetworkTypeObserverApi31DisplayInfoCallback r7 = com.marrow2.ui.review_components.McqReviewViewModel.MediaBrowserCompatItemReceiver(r7)     // Catch: java.lang.Exception -> L38
                    java.lang.String r1 = r6.IconCompatParcelizer     // Catch: java.lang.Exception -> L38
                    o.onDisplayInfoChanged r4 = r6.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L38
                    r5 = r6
                    o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Exception -> L38
                    r6.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Exception -> L38
                    java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r1, r4, r5)     // Catch: java.lang.Exception -> L38
                    if (r6 != r0) goto La7
                    goto L73
                L38:
                    r7 = move-exception
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    boolean r1 = kotlin.parseDescriptor.read(r7)
                    if (r1 == 0) goto L5b
                    com.marrow2.ui.review_components.McqReviewViewModel r1 = r6.MediaBrowserCompatCustomActionResultReceiver
                    o.getResolutionSize r1 = com.marrow2.ui.review_components.McqReviewViewModel.RatingCompat(r1)
                    o.zzhq$MediaBrowserCompatCustomActionResultReceiver r3 = new o.zzhq$MediaBrowserCompatCustomActionResultReceiver
                    com.marrow.data.utils.product.exceptions.ResponseErrorException r7 = kotlin.parseDescriptor.AudioAttributesCompatParcelizer(r7)
                    com.marrow.data.models.ResponseError r7 = r7.getError()
                    java.lang.String r7 = r7.getErrorMessage()
                    r3.<init>(r7)
                    r1.write(r3)
                L5b:
                    com.marrow2.ui.review_components.McqReviewViewModel r7 = r6.MediaBrowserCompatCustomActionResultReceiver
                    o.NetworkTypeObserverApi31DisplayInfoCallback r7 = com.marrow2.ui.review_components.McqReviewViewModel.MediaBrowserCompatItemReceiver(r7)
                    java.lang.String r1 = r6.IconCompatParcelizer
                    o.onDisplayInfoChanged r3 = r6.write
                    r4 = r6
                    o.SampleVideos r4 = (kotlin.SampleVideos) r4
                    r5 = 0
                    r6.read = r5
                    r6.AudioAttributesCompatParcelizer = r2
                    java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r1, r3, r4)
                    if (r7 != r0) goto L74
                L73:
                    return r0
                L74:
                    com.marrow2.ui.review_components.McqReviewViewModel r7 = r6.MediaBrowserCompatCustomActionResultReceiver
                    o.getResolutionSize r7 = com.marrow2.ui.review_components.McqReviewViewModel.MediaMetadataCompat(r7)
                    com.marrow2.ui.review_components.McqReviewViewModel r0 = r6.MediaBrowserCompatCustomActionResultReceiver
                    o.getResolutionSize r0 = com.marrow2.ui.review_components.McqReviewViewModel.MediaMetadataCompat(r0)
                    java.lang.Object r0 = r0.IconCompatParcelizer()
                    o.DataSourceBitmapLoaderExternalSyntheticLambda0 r0 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r0
                    java.lang.Object r0 = r0.read()
                    o.zzhr r0 = (kotlin.zzhr) r0
                    o.onDisplayInfoChanged r1 = r6.write
                    o.zzhr r0 = kotlin.zzhr.IconCompatParcelizer(r0, r1)
                    kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(r7, r0)
                    com.marrow2.ui.review_components.McqReviewViewModel r7 = r6.MediaBrowserCompatCustomActionResultReceiver
                    o.getResolutionSize r7 = com.marrow2.ui.review_components.McqReviewViewModel.AudioAttributesImplApi26Parcelizer(r7)
                    o.getSubscriptionExpiresOn r0 = new o.getSubscriptionExpiresOn
                    java.lang.String r1 = r6.IconCompatParcelizer
                    o.onDisplayInfoChanged r6 = r6.write
                    r0.<init>(r1, r6)
                    r7.write(r0)
                La7:
                    o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.review_components.McqReviewViewModel.RemoteActionCompatParcelizer.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(McqReviewViewModel mcqReviewViewModel, String str, onDisplayInfoChanged ondisplayinfochanged, onDisplayInfoChanged ondisplayinfochanged2, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.MediaBrowserCompatCustomActionResultReceiver = mcqReviewViewModel;
                this.IconCompatParcelizer = str;
                this.RemoteActionCompatParcelizer = ondisplayinfochanged;
                this.write = ondisplayinfochanged2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return McqReviewViewModel.this.new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(McqReviewViewModel mcqReviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        mcqReviewViewModel.read.write(new zzhq.MediaBrowserCompatCustomActionResultReceiver(str));
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.write(null);
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        this.onMediaButtonEvent.onEvent(BaseGmsClient.read.INSTANCE);
        super.write();
    }
}
