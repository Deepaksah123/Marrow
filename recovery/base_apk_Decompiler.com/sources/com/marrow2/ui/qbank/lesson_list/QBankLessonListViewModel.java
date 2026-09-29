package com.marrow2.ui.qbank.lesson_list;

import com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC0251zzar;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.PriorityTaskManager;
import kotlin.ProtocolVersion;
import kotlin.ProtocolVersionUnsupportedProtocolException;
import kotlin.RegisterRequest;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fromBytes;
import kotlin.getAnswerMap;
import kotlin.getChallengeValue;
import kotlin.getChannelIdValue;
import kotlin.getConfigExpirySeconds;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isCompatible;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.registerEvent;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u000e\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u000e\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u000e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0018\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0016\u0010\u0014\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000205098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b#\u0010<R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00107R \u00106\u001a\b\u0012\u0004\u0012\u00020\f098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b=\u0010<R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020)098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R&\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001a0?048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R,\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001a0?098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\b\"\u0010<R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107R&\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\b0\u0010<R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00107R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\b3\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020)048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00107R \u0010J\u001a\b\u0012\u0004\u0012\u00020)098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\b6\u0010<R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020)048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u00107R \u0010F\u001a\b\u0012\u0004\u0012\u00020)098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\b%\u0010<R \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001a048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001a098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010;\u001a\u0004\b\u0018\u0010<R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020N048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u00107R \u0010K\u001a\b\u0012\u0004\u0012\u00020N098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\b.\u0010<R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00107R \u0010:\u001a\b\u0012\u0004\u0012\u00020)0O8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010P\u001a\u0004\b8\u0010QR\u0016\u0010S\u001a\u00020N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010R"}, d2 = {"Lcom/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/ParsableNalUnitBitArray;", "p1", "Lo/isSeekPending;", "p2", "Lo/getPlatform;", "p3", "<init>", "(Lo/POJOPropertyBuilder5;Lo/ParsableNalUnitBitArray;Lo/isSeekPending;Lo/getPlatform;)V", "Lo/fromBytes;", "", "AudioAttributesCompatParcelizer", "(Lo/fromBytes;)V", "", "()I", "MediaDescriptionCompat", "()V", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "(I)V", "write", "IconCompatParcelizer", "onAddQueueItem", "", "Lo/ProtocolVersion;", "MediaMetadataCompat", "()Ljava/util/List;", "", "([I)[I", "onPlayFromUri", "Lo/ParsableNalUnitBitArray;", "read", "RatingCompat", "Lo/isSeekPending;", "MediaBrowserCompatMediaItem", "Lo/getPlatform;", "Lo/isCompatible;", "Lo/isCompatible;", "", "onPrepareFromMediaId", "Ljava/lang/String;", "onPlayFromSearch", "Ljava/lang/Integer;", "MediaBrowserCompatCustomActionResultReceiver", "onCustomAction", "AudioAttributesImplBaseParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "I", "AudioAttributesImplApi26Parcelizer", "Lo/getResolutionSize;", "Lo/getChallengeValue;", "MediaBrowserCompatSearchResultReceiver", "Lo/getResolutionSize;", "AudioAttributesImplApi21Parcelizer", "Lo/setUpdatedStatus;", "onSeekTo", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "onPlay", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel;", "onCommand", "Lo/PriorityTaskManager;", "onPause", "Ljava/util/List;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlayFromMediaId", "Lo/zzar$MediaBrowserCompatItemReceiver;", "onFastForward", "onRewind", "onMediaButtonEvent", "onPrepareFromSearch", "Lo/registerEvent;", "onPrepare", "", "Lo/isDark;", "Lo/isDark;", "()Lo/isDark;", "Z", "onRemoveQueueItemAt"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QBankLessonListViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> onPrepareFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<fromBytes> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> onPlay;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<ProtocolVersion>> onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<AbstractC0251zzar.MediaBrowserCompatItemReceiver> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<String> onFastForward;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getPlatform AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<getChallengeValue> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private boolean onRemoveQueueItemAt;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> RatingCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final isCompatible IconCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final isSeekPending write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<registerEvent>> onPrepare;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final setUpdatedStatus<List<registerEvent>> onPlayFromSearch;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>>> onCustomAction;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final setUpdatedStatus<AbstractC0251zzar.MediaBrowserCompatItemReceiver> onPause;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onPrepareFromSearch;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private List<PriorityTaskManager> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final setUpdatedStatus<fromBytes> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<List<ProtocolVersion>> onCommand;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private Integer MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray read;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final isDark<String> onSeekTo;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final setUpdatedStatus<String> onPlayFromMediaId;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final setUpdatedStatus<String> onMediaButtonEvent;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final setUpdatedStatus<getChallengeValue> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onPlayFromUri;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>>> MediaBrowserCompatMediaItem;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return QBankLessonListViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return QBankLessonListViewModel.this.IconCompatParcelizer(this);
        }
    }

    static final class read extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return QBankLessonListViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return QBankLessonListViewModel.this.write(this);
        }
    }

    @setSdkPayload
    public QBankLessonListViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, ParsableNalUnitBitArray parsableNalUnitBitArray, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = parsableNalUnitBitArray;
        this.write = isseekpending;
        this.AudioAttributesCompatParcelizer = getplatform;
        isCompatible.Companion companion = isCompatible.INSTANCE;
        isCompatible iscompatibleAudioAttributesCompatParcelizer = isCompatible.Companion.AudioAttributesCompatParcelizer(pOJOPropertyBuilder5);
        this.IconCompatParcelizer = iscompatibleAudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = "";
        this.AudioAttributesImplBaseParcelizer = "";
        this.AudioAttributesImplApi26Parcelizer = 1;
        getResolutionSize<getChallengeValue> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getChallengeValue(null, 0, 3, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<fromBytes> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(fromBytes.AudioAttributesImplApi21Parcelizer.INSTANCE);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getResolutionSize<List<ProtocolVersion>> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.onAddQueueItem = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<AbstractC0251zzar.MediaBrowserCompatItemReceiver> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(null);
        this.handleMediaPlayPauseIfPendingOnHandler = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onPause = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer("");
        this.onPlay = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onMediaButtonEvent = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer("");
        this.onFastForward = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<List<registerEvent>> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.onPrepare = getresolutionsizeRemoteActionCompatParcelizer9;
        this.onPlayFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.onPlayFromUri = getresolutionsizeRemoteActionCompatParcelizer10;
        this.onPrepareFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer10);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer11 = setStartTime.RemoteActionCompatParcelizer("Topics");
        this.onPrepareFromMediaId = getresolutionsizeRemoteActionCompatParcelizer11;
        this.onSeekTo = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer11);
        this.RemoteActionCompatParcelizer = iscompatibleAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = iscompatibleAudioAttributesCompatParcelizer.getIconCompatParcelizer();
        getresolutionsizeRemoteActionCompatParcelizer.write(getChallengeValue.read(getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer(), null, iscompatibleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(), 1));
        if (iscompatibleAudioAttributesCompatParcelizer.getRead().length() > 0) {
            getresolutionsizeRemoteActionCompatParcelizer7.write(iscompatibleAudioAttributesCompatParcelizer.getRead());
        }
        onAddQueueItem();
    }

    public final setUpdatedStatus<getChallengeValue> RatingCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<fromBytes> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>>> read() {
        return this.onCustomAction;
    }

    public final setUpdatedStatus<List<ProtocolVersion>> AudioAttributesImplBaseParcelizer() {
        return this.onCommand;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$MediaBrowserCompatItemReceiver$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ int AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private /* synthetic */ QBankLessonListViewModel RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$MediaBrowserCompatItemReceiver$2$RemoteActionCompatParcelizer */
            public static final class RemoteActionCompatParcelizer<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getConfigExpirySeconds.read(Float.valueOf(((PriorityTaskManager) t2).getHandleMediaPlayPauseIfPendingOnHandler()), Float.valueOf(((PriorityTaskManager) t).getHandleMediaPlayPauseIfPendingOnHandler()));
                }
            }

            /* JADX INFO: renamed from: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$MediaBrowserCompatItemReceiver$2$read */
            public static final class read<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getConfigExpirySeconds.read(Long.valueOf(((PriorityTaskManager) t2).getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), Long.valueOf(((PriorityTaskManager) t).getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()));
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Iterable<PriorityTaskManager> iterable;
                List<PriorityTaskManager> listAudioAttributesCompatParcelizer;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, null);
                    this.IconCompatParcelizer = 1;
                    obj = this.RemoteActionCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                HashMap map = (HashMap) obj;
                ArrayList arrayList = new ArrayList();
                int iAudioAttributesCompatParcelizer = ((getChallengeValue) this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).AudioAttributesCompatParcelizer();
                if (iAudioAttributesCompatParcelizer == 0) {
                    List list = this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((PriorityTaskManager) obj2).getAudioAttributesImplApi26Parcelizer() == 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    iterable = arrayList2;
                } else if (iAudioAttributesCompatParcelizer == 1) {
                    List list2 = this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((PriorityTaskManager) obj3).getAudioAttributesImplApi26Parcelizer() == 1) {
                            arrayList3.add(obj3);
                        }
                    }
                    iterable = arrayList3;
                } else if (iAudioAttributesCompatParcelizer == 2) {
                    List list3 = this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (((PriorityTaskManager) obj4).getAudioAttributesImplApi26Parcelizer() == 2) {
                            arrayList4.add(obj4);
                        }
                    }
                    iterable = arrayList4;
                } else if (iAudioAttributesCompatParcelizer != 3) {
                    iterable = this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                } else {
                    List list4 = this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list4) {
                        if (!((PriorityTaskManager) obj5).getMediaBrowserCompatCustomActionResultReceiver()) {
                            arrayList5.add(obj5);
                        }
                    }
                    iterable = arrayList5;
                }
                int i2 = this.AudioAttributesCompatParcelizer;
                if (i2 == 1) {
                    SealedLessonDetailsModel.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new SealedLessonDetailsModel.AudioAttributesCompatParcelizer(null, null, 0, 7, null);
                    String str = "";
                    int i3 = 1;
                    int i4 = 0;
                    for (PriorityTaskManager priorityTaskManager : iterable) {
                        SealedLessonDetailsModel.Lesson lessonRemoteActionCompatParcelizer = getChannelIdValue.RemoteActionCompatParcelizer(priorityTaskManager, priorityTaskManager.getOnCustomAction());
                        if (!priorityTaskManager.getOnPlayFromMediaId()) {
                            int[] iArrAudioAttributesCompatParcelizer = QBankLessonListViewModel.AudioAttributesCompatParcelizer((int[]) map.get(priorityTaskManager.getAudioAttributesCompatParcelizer()));
                            lessonRemoteActionCompatParcelizer.IconCompatParcelizer(iArrAudioAttributesCompatParcelizer[0]);
                            lessonRemoteActionCompatParcelizer.read(iArrAudioAttributesCompatParcelizer[1]);
                        }
                        lessonRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i4);
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) priorityTaskManager.getRead())) {
                            arrayList.add(lessonRemoteActionCompatParcelizer);
                            i3++;
                            audioAttributesCompatParcelizer.write(i3);
                        } else {
                            String read2 = priorityTaskManager.getRead();
                            SealedLessonDetailsModel.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = getChannelIdValue.AudioAttributesCompatParcelizer(priorityTaskManager, i3, priorityTaskManager.getOnAddQueueItem());
                            arrayList.add(AudioAttributesCompatParcelizer);
                            arrayList.add(lessonRemoteActionCompatParcelizer);
                            AudioAttributesCompatParcelizer.write(1);
                            i3 = 1;
                            str = read2;
                            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer;
                        }
                        i4++;
                    }
                    getResolutionSize getresolutionsize = this.RemoteActionCompatParcelizer.onPrepare;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj6 : arrayList) {
                        if (obj6 instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer) {
                            arrayList6.add(obj6);
                        }
                    }
                    ArrayList arrayList7 = arrayList6;
                    ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList7, 10));
                    Iterator it = arrayList7.iterator();
                    while (it.hasNext()) {
                        arrayList8.add(ProtocolVersionUnsupportedProtocolException.RemoteActionCompatParcelizer((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) it.next()));
                    }
                    getresolutionsize.write(arrayList8);
                } else if (i2 == 2 || i2 == 3) {
                    if (i2 == 2) {
                        listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(iterable, (Comparator) new read());
                    } else {
                        listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(iterable, (Comparator) new RemoteActionCompatParcelizer());
                    }
                    for (PriorityTaskManager priorityTaskManager2 : listAudioAttributesCompatParcelizer) {
                        SealedLessonDetailsModel.Lesson lessonRemoteActionCompatParcelizer2 = getChannelIdValue.RemoteActionCompatParcelizer(priorityTaskManager2, priorityTaskManager2.getOnCustomAction());
                        if (!priorityTaskManager2.getOnPlayFromMediaId()) {
                            int[] iArrAudioAttributesCompatParcelizer2 = QBankLessonListViewModel.AudioAttributesCompatParcelizer((int[]) map.get(priorityTaskManager2.getAudioAttributesCompatParcelizer()));
                            lessonRemoteActionCompatParcelizer2.IconCompatParcelizer(iArrAudioAttributesCompatParcelizer2[0]);
                            lessonRemoteActionCompatParcelizer2.read(iArrAudioAttributesCompatParcelizer2[1]);
                        }
                        arrayList.add(lessonRemoteActionCompatParcelizer2);
                    }
                    this.RemoteActionCompatParcelizer.onPrepare.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                }
                if (arrayList.isEmpty()) {
                    this.RemoteActionCompatParcelizer.onPrepare.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                    lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                } else {
                    if (this.AudioAttributesCompatParcelizer != 1) {
                        arrayList.add(0, new SealedLessonDetailsModel.AudioAttributesCompatParcelizer(null, null, 0, 7, null));
                    }
                    lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, arrayList);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(QBankLessonListViewModel qBankLessonListViewModel, int i, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = qBankLessonListViewModel;
                this.AudioAttributesCompatParcelizer = i;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
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
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(QBankLessonListViewModel.this.AudioAttributesCompatParcelizer, new AnonymousClass2(QBankLessonListViewModel.this, this.write, null), this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatItemReceiver(int i, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLessonListViewModel.this.new MediaBrowserCompatItemReceiver(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final setUpdatedStatus<AbstractC0251zzar.MediaBrowserCompatItemReceiver> AudioAttributesImplApi26Parcelizer() {
        return this.onPause;
    }

    public final setUpdatedStatus<String> MediaBrowserCompatSearchResultReceiver() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<String> MediaBrowserCompatMediaItem() {
        return this.onPlayFromMediaId;
    }

    public final setUpdatedStatus<List<registerEvent>> IconCompatParcelizer() {
        return this.onPlayFromSearch;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPrepareFromSearch;
    }

    public final isDark<String> AudioAttributesImplApi21Parcelizer() {
        return this.onSeekTo;
    }

    public final void AudioAttributesCompatParcelizer(fromBytes p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, fromBytes.IconCompatParcelizer.INSTANCE)) {
            MediaDescriptionCompat();
            return;
        }
        if (p0 instanceof fromBytes.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(((fromBytes.RemoteActionCompatParcelizer) p0).read());
            return;
        }
        if (p0 instanceof fromBytes.AudioAttributesImplBaseParcelizer) {
            fromBytes.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (fromBytes.AudioAttributesImplBaseParcelizer) p0;
            this.AudioAttributesImplApi26Parcelizer = audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
            this.onPrepareFromMediaId.write(audioAttributesImplBaseParcelizer.IconCompatParcelizer());
            AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
            isSeekPending isseekpending = this.write;
            RegisterRequest registerRequest = RegisterRequest.INSTANCE;
            isseekpending.write(RegisterRequest.IconCompatParcelizer(audioAttributesImplBaseParcelizer.IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (p0 instanceof fromBytes.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplBaseParcelizer = ((fromBytes.AudioAttributesImplApi26Parcelizer) p0).RemoteActionCompatParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, fromBytes.read.INSTANCE)) {
            this.onFastForward.write(this.AudioAttributesImplBaseParcelizer);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, fromBytes.write.INSTANCE)) {
            isSeekPending isseekpending2 = this.write;
            RegisterRequest registerRequest2 = RegisterRequest.INSTANCE;
            isseekpending2.write(RegisterRequest.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else {
            if (p0 instanceof fromBytes.MediaBrowserCompatItemReceiver) {
                AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverIconCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
                if (mediaBrowserCompatItemReceiverIconCompatParcelizer != null) {
                    this.MediaDescriptionCompat.write(new fromBytes.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiverIconCompatParcelizer));
                    return;
                }
                return;
            }
            if (p0 instanceof fromBytes.AudioAttributesImplApi21Parcelizer) {
                this.MediaDescriptionCompat.write(fromBytes.AudioAttributesImplApi21Parcelizer.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        
            if (r9 != r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
        
            if (r8.write.write(r8) != r0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLessonListViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getTypeAsInt
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLessonListViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(QBankLessonListViewModel qBankLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankLessonListViewModel.MediaMetadataCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.read
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$read r0 = (com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.read) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$read r0 = new com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            o.getChallengeValue r5 = (kotlin.getChallengeValue) r5
            java.lang.Object r0 = r0.write
            o.getResolutionSize r0 = (kotlin.getResolutionSize) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L59
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<o.getChallengeValue> r6 = r5.AudioAttributesImplApi21Parcelizer
            java.lang.Object r2 = r6.IconCompatParcelizer()
            o.getChallengeValue r2 = (kotlin.getChallengeValue) r2
            o.ParsableNalUnitBitArray r4 = r5.read
            java.lang.String r5 = r5.RemoteActionCompatParcelizer
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r2
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r4.read(r3, r5, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            java.util.List r6 = (java.util.List) r6
            r1 = 0
            r2 = 2
            o.getChallengeValue r5 = kotlin.getChallengeValue.read(r5, r6, r1, r2)
            r0.write(r5)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getWrite() != p0) {
            getResolutionSize<getChallengeValue> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            getresolutionsize.write(getChallengeValue.read(getresolutionsize.IconCompatParcelizer(), null, p0, 1));
            AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.read
            o.getResolutionSize r5 = (kotlin.getResolutionSize) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L51
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<java.lang.Boolean> r6 = r5.onPlayFromUri
            o.ParsableNalUnitBitArray r2 = r5.read
            o.isCompatible r5 = r5.IconCompatParcelizer
            java.lang.String r5 = r5.getAudioAttributesCompatParcelizer()
            r0.read = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r5 = r2.AudioAttributesImplApi26Parcelizer(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r4 = r6
            r6 = r5
            r5 = r4
        L51:
            r5.write(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.write
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$write r0 = (com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$write r0 = new com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L53
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            java.lang.Integer r5 = r4.MediaBrowserCompatCustomActionResultReceiver
            o.RepeatModeUtil r2 = kotlin.RepeatModeUtil.read
            int r2 = r2.getWrite()
            if (r5 == 0) goto L82
            int r5 = r5.intValue()
            if (r5 == r2) goto L46
            goto L82
        L46:
            o.ParsableNalUnitBitArray r5 = r4.read
            o.RepeatModeUtil r2 = kotlin.RepeatModeUtil.read
            r0.read = r3
            java.lang.Object r5 = r5.read(r2, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            o.getNextRepeatMode r5 = (kotlin.getNextRepeatMode) r5
            if (r5 == 0) goto L7f
            o.zzar$MediaBrowserCompatItemReceiver r5 = kotlin.C0253zzat.AudioAttributesCompatParcelizer(r5)
            java.lang.Integer r0 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r3)
            r1 = 2
            java.lang.Integer r1 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r1)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1}
            java.util.List r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r0)
            int r1 = r5.AudioAttributesCompatParcelizer()
            java.lang.Integer r1 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7f
            o.getResolutionSize<o.zzar$MediaBrowserCompatItemReceiver> r4 = r4.handleMediaPlayPauseIfPendingOnHandler
            r4.write(r5)
        L7f:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L82:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel$RemoteActionCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer
            com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel r0 = (com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.ParsableNalUnitBitArray r5 = r4.read
            java.lang.String r2 = r4.RemoteActionCompatParcelizer
            r0.RemoteActionCompatParcelizer = r4
            r0.read = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            java.util.List r5 = (java.util.List) r5
            r0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r5
            int r5 = r4.AudioAttributesImplApi26Parcelizer
            r4.AudioAttributesCompatParcelizer(r5)
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.toJsonString
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLessonListViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void onAddQueueItem() {
        this.onAddQueueItem.write(MediaMetadataCompat());
    }

    private static List<ProtocolVersion> MediaMetadataCompat() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new ProtocolVersion[]{new ProtocolVersion(true, 1), new ProtocolVersion(false, 2, 1, null), new ProtocolVersion(false, 3, 1, null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] AudioAttributesCompatParcelizer(int[] p0) {
        return p0 == null ? new int[2] : p0;
    }
}
