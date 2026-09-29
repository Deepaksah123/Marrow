package com.marrow2.ui.video.landing;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.marrow2.ui.video.landing.VideoLandingViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Allocator;
import kotlin.AllocatorAllocationNode;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ExpandableBehavior;
import kotlin.ExpandableTransformationBehavior;
import kotlin.FabTransformationSheetBehavior;
import kotlin.HlsSampleStream;
import kotlin.IntegrityManager;
import kotlin.IntegrityManagerFactory;
import kotlin.IntegrityServiceException;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.PlanDetailsCreator;
import kotlin.RenewEligibleCreator;
import kotlin.RepeatModeUtil;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.TopUserCompanion;
import kotlin.TransformationChildCard;
import kotlin.TransformationChildLayout;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.allocate;
import kotlin.binarySearchCeil;
import kotlin.getAnswerMap;
import kotlin.getConfigExpirySeconds;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isEncodingHighResolutionPcm;
import kotlin.isLinebreak;
import kotlin.isSeekPending;
import kotlin.proceedNonBlocking;
import kotlin.requestIntegrityToken;
import kotlin.setEndIconDrawable;
import kotlin.setErrorContentDescription;
import kotlin.setErrorIconTintMode;
import kotlin.setErrorTextColor;
import kotlin.setLogStackTraces;
import kotlin.setMinuteHourDelegate;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setPassingYear;
import kotlin.setScheme;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0012H\u0082@¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b(\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020)¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010\u0014J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020,H\u0002¢\u0006\u0004\b%\u0010-J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020&H\u0082@¢\u0006\u0004\b\u001c\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u0010\u0014R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020&0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010>R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020&0?8\u0007¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\b!\u0010AR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020B0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020B0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bC\u0010AR\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010>R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\b7\u0010AR\"\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020I\u0018\u00010H0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010>R(\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020I\u0018\u00010H0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bE\u0010AR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020L0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020L0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\b\u001c\u0010AR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020M0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010>R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020M0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bK\u0010AR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020O0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010>R \u0010P\u001a\b\u0012\u0004\u0012\u00020O0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\b \u0010AR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020Q0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010>R \u0010\"\u001a\b\u0012\u0004\u0012\u00020Q0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010@\u001a\u0004\b%\u0010AR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020&0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010>R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\b'\u0010AR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020R0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010>R \u0010J\u001a\b\u0012\u0004\u0012\u00020R0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\b#\u0010AR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020S0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010>R \u0010T\u001a\b\u0012\u0004\u0012\u00020S0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\b\u0019\u0010AR \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0H0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R&\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0H0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010@\u001a\u0004\b\u001f\u0010AR\u001c\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010>R\"\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\b(\u0010AR\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020U0H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010X"}, d2 = {"Lcom/marrow2/ui/video/landing/VideoLandingViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/isEncodingHighResolutionPcm;", "p0", "Lo/LogLogLevel;", "p1", "Lo/getDisplaySizeV17;", "p2", "Lo/binarySearchCeil;", "p3", "Lo/isSeekPending;", "p4", "Lo/Allocator;", "p5", "Lo/getPlatform;", "p6", "<init>", "(Lo/isEncodingHighResolutionPcm;Lo/LogLogLevel;Lo/getDisplaySizeV17;Lo/binarySearchCeil;Lo/isSeekPending;Lo/Allocator;Lo/getPlatform;)V", "", "onPlay", "()V", "onCustomAction", "Lo/setPassingYear;", "onAddQueueItem", "()Lo/setPassingYear;", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/SampleVideos;)Ljava/lang/Object;", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "onMediaButtonEvent", "AudioAttributesImplApi21Parcelizer", "write", "read", "", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "Lo/TransformationChildCard;", "(Lo/TransformationChildCard;)V", "onPlayFromMediaId", "Lo/TransformationChildCard$MediaMetadataCompat;", "(Lo/TransformationChildCard$MediaMetadataCompat;)V", "(ZLo/SampleVideos;)Ljava/lang/Object;", "onCommand", "onSeekTo", "Lo/isEncodingHighResolutionPcm;", "Lo/LogLogLevel;", "onPlayFromUri", "Lo/getDisplaySizeV17;", "onPlayFromSearch", "Lo/binarySearchCeil;", "MediaMetadataCompat", "Lo/isSeekPending;", "onPrepareFromSearch", "Lo/Allocator;", "onPause", "Lo/getPlatform;", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/TransformationChildLayout;", "MediaDescriptionCompat", "onPrepareFromUri", "MediaBrowserCompatMediaItem", "Lo/IntegrityManagerFactory;", "onRewind", "", "Lo/FabTransformationSheetBehavior;", "onPrepare", "RatingCompat", "Lo/setMinuteHourDelegate;", "Lo/requestIntegrityToken;", "onRemoveQueueItemAt", "Lo/IntegrityManager;", "onFastForward", "", "Lo/ExpandableTransformationBehavior;", "Lo/ExpandableBehavior;", "onPrepareFromMediaId", "Lo/proceedNonBlocking;", "onRemoveQueueItem", "Lo/setErrorIconTintMode;", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoLandingViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<setErrorIconTintMode> onRemoveQueueItemAt;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<FabTransformationSheetBehavior>> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<IntegrityManager> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onPlay;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<ExpandableBehavior> onPlayFromUri;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<List<proceedNonBlocking>> onPlayFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getResolutionSize<IntegrityManagerFactory> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<requestIntegrityToken> onCommand;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<ExpandableTransformationBehavior> onPrepare;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getResolutionSize<TransformationChildLayout> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<setErrorIconTintMode> onRewind;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<setMinuteHourDelegate> onCustomAction;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final setUpdatedStatus<String> onMediaButtonEvent;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private List<proceedNonBlocking> onSeekTo;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<setMinuteHourDelegate> onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final LogLogLevel read;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onPlayFromMediaId;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final setUpdatedStatus<IntegrityManager> onFastForward;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final getPlatform MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<ExpandableBehavior> onPrepareFromMediaId;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final binarySearchCeil AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final getDisplaySizeV17 write;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final setUpdatedStatus<List<FabTransformationSheetBehavior>> RatingCompat;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<List<proceedNonBlocking>> onRemoveQueueItem;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final Allocator MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final setUpdatedStatus<TransformationChildLayout> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final setUpdatedStatus<requestIntegrityToken> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final setUpdatedStatus<IntegrityManagerFactory> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final isEncodingHighResolutionPcm IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<String> onPause;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<ExpandableTransformationBehavior> onPrepareFromSearch;

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.read(this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        boolean read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.write(this);
        }
    }

    static final class onAddQueueItem extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        onAddQueueItem(SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver(this);
        }
    }

    static final class onPrepareFromUri extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        boolean read;
        int write;

        onPrepareFromUri(SampleVideos<? super onPrepareFromUri> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.AudioAttributesCompatParcelizer(false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onRemoveQueueItem extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;

        onRemoveQueueItem(SampleVideos<? super onRemoveQueueItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.MediaBrowserCompatSearchResultReceiver(this);
        }
    }

    static final class onRewind extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int write;

        onRewind(SampleVideos<? super onRewind> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.AudioAttributesImplBaseParcelizer(this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLandingViewModel.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public VideoLandingViewModel(isEncodingHighResolutionPcm isencodinghighresolutionpcm, LogLogLevel logLogLevel, getDisplaySizeV17 getdisplaysizev17, binarySearchCeil binarysearchceil, isSeekPending isseekpending, Allocator allocator, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(isencodinghighresolutionpcm, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(allocator, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = isencodinghighresolutionpcm;
        this.read = logLogLevel;
        this.write = getdisplaysizev17;
        this.AudioAttributesCompatParcelizer = binarysearchceil;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.MediaBrowserCompatItemReceiver = allocator;
        this.MediaBrowserCompatCustomActionResultReceiver = getplatform;
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(bool);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<TransformationChildLayout> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new TransformationChildLayout(null, false, false, false, 0, false, 63, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<IntegrityManagerFactory> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<List<FabTransformationSheetBehavior>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<setMinuteHourDelegate> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(new setMinuteHourDelegate(false, null, false, 0, false, false, 63, null));
        this.onCustomAction = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<requestIntegrityToken> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(requestIntegrityToken.read);
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<IntegrityManager> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(IntegrityManager.AudioAttributesCompatParcelizer.INSTANCE);
        this.handleMediaPlayPauseIfPendingOnHandler = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onFastForward = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer("");
        this.onPause = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onMediaButtonEvent = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onPlay = getresolutionsizeRemoteActionCompatParcelizer9;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<ExpandableTransformationBehavior> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer(new ExpandableTransformationBehavior(false, false, false, 7, null));
        this.onPrepareFromSearch = getresolutionsizeRemoteActionCompatParcelizer10;
        this.onPrepare = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer10);
        getResolutionSize<ExpandableBehavior> getresolutionsizeRemoteActionCompatParcelizer11 = setStartTime.RemoteActionCompatParcelizer(new ExpandableBehavior(false, false, 3, null));
        this.onPlayFromUri = getresolutionsizeRemoteActionCompatParcelizer11;
        this.onPrepareFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer11);
        getResolutionSize<List<proceedNonBlocking>> getresolutionsizeRemoteActionCompatParcelizer12 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.onPlayFromSearch = getresolutionsizeRemoteActionCompatParcelizer12;
        this.onRemoveQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer12);
        getResolutionSize<setErrorIconTintMode> getresolutionsizeRemoteActionCompatParcelizer13 = setStartTime.RemoteActionCompatParcelizer(null);
        this.onRemoveQueueItemAt = getresolutionsizeRemoteActionCompatParcelizer13;
        this.onRewind = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer13);
        this.onSeekTo = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCounterTextAppearance
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.onAddQueueItem(this.read, (String) obj2);
            }
        });
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<TransformationChildLayout> MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<IntegrityManagerFactory> MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<List<FabTransformationSheetBehavior>> MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<setMinuteHourDelegate> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final setUpdatedStatus<requestIntegrityToken> RatingCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<IntegrityManager> AudioAttributesImplBaseParcelizer() {
        return this.onFastForward;
    }

    public final setUpdatedStatus<String> read() {
        return this.onMediaButtonEvent;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver() {
        return this.onPlayFromMediaId;
    }

    public final setUpdatedStatus<ExpandableTransformationBehavior> AudioAttributesImplApi21Parcelizer() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<ExpandableBehavior> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPrepareFromMediaId;
    }

    public final setUpdatedStatus<List<proceedNonBlocking>> MediaBrowserCompatItemReceiver() {
        return this.onRemoveQueueItem;
    }

    public static final class AudioAttributesImplApi21Parcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            proceedNonBlocking proceednonblocking = (proceedNonBlocking) t;
            proceedNonBlocking proceednonblocking2 = (proceedNonBlocking) t2;
            return getConfigExpirySeconds.read(Float.valueOf(proceednonblocking.getAudioAttributesCompatParcelizer() / proceednonblocking.getAudioAttributesImplBaseParcelizer()), Float.valueOf(proceednonblocking2.getAudioAttributesCompatParcelizer() / proceednonblocking2.getAudioAttributesImplBaseParcelizer()));
        }
    }

    public final setUpdatedStatus<setErrorIconTintMode> IconCompatParcelizer() {
        return this.onRewind;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.video.landing.VideoLandingViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
        
            if (r3.read.AudioAttributesCompatParcelizer(r3) != r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            proceedNonBlocking proceednonblocking = (proceedNonBlocking) t2;
            proceedNonBlocking proceednonblocking2 = (proceedNonBlocking) t;
            return getConfigExpirySeconds.read(Float.valueOf(proceednonblocking.getAudioAttributesCompatParcelizer() / proceednonblocking.getAudioAttributesImplBaseParcelizer()), Float.valueOf(proceednonblocking2.getAudioAttributesCompatParcelizer() / proceednonblocking2.getAudioAttributesImplBaseParcelizer()));
        }
    }

    public static final class MediaBrowserCompatItemReceiver<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Long.valueOf(((proceedNonBlocking) t2).getMediaBrowserCompatItemReceiver()), Long.valueOf(((proceedNonBlocking) t).getMediaBrowserCompatItemReceiver()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        videoLandingViewModel.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    static final class onRemoveQueueItemAt extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {VideoLandingViewModel.this.MediaBrowserCompatItemReceiver};
                isDark isdark = (isDark) Allocator.IconCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 1850090459, setScheme.IconCompatParcelizer(), -1850090458, objArr, setScheme.IconCompatParcelizer());
                final VideoLandingViewModel videoLandingViewModel = VideoLandingViewModel.this;
                this.read = 1;
                if (isdark.write(new getValidationToken() { // from class: com.marrow2.ui.video.landing.VideoLandingViewModel.onRemoveQueueItemAt.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((allocate) obj2);
                    }

                    private Object IconCompatParcelizer(allocate allocateVar) {
                        if (allocateVar instanceof allocate.MediaBrowserCompatCustomActionResultReceiver) {
                            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
                            if (((AllocatorAllocationNode) allocate.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{(allocate.MediaBrowserCompatCustomActionResultReceiver) allocateVar}, -766262347, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 766262348)) == AllocatorAllocationNode.MediaBrowserCompatSearchResultReceiver) {
                                videoLandingViewModel.IconCompatParcelizer(new TransformationChildCard.onCustomAction(1024));
                            }
                        } else if (allocateVar instanceof allocate.RemoteActionCompatParcelizer) {
                            int iWrite = HlsSampleStream.write();
                            int iWrite2 = HlsSampleStream.write();
                            int iWrite3 = HlsSampleStream.write();
                            if (((AllocatorAllocationNode) allocate.RemoteActionCompatParcelizer.read(HlsSampleStream.write(), -92781229, iWrite, 92781232, iWrite2, iWrite3, new Object[]{(allocate.RemoteActionCompatParcelizer) allocateVar})) == AllocatorAllocationNode.MediaBrowserCompatSearchResultReceiver) {
                                videoLandingViewModel.IconCompatParcelizer(new TransformationChildCard.onCommand(1024));
                            }
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

        onRemoveQueueItemAt(SampleVideos<? super onRemoveQueueItemAt> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onRemoveQueueItemAt(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onRemoveQueueItemAt) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onRemoveQueueItemAt(null), new MagicModuleSubmissionRequestBody() { // from class: o.setDefaultHintTextColor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List<String> listAudioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = VideoLandingViewModel.this.read.IconCompatParcelizer("content_change_subject_list", this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setLogStackTraces setlogstacktraces = (setLogStackTraces) obj;
            if (setlogstacktraces != null && (listAudioAttributesCompatParcelizer = setlogstacktraces.AudioAttributesCompatParcelizer()) != null) {
                VideoLandingViewModel.this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.MediaBrowserCompatMediaItem(new setErrorTextColor(listAudioAttributesCompatParcelizer)));
            }
            return getShowPopup.INSTANCE;
        }

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaDescriptionCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconContentDescription
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.handleMediaPlayPauseIfPendingOnHandler(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            setErrorIconTintMode seterroricontintmode;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = VideoLandingViewModel.this.onRemoveQueueItemAt;
                this.write = getresolutionsize2;
                this.IconCompatParcelizer = 1;
                Object objIconCompatParcelizer2 = VideoLandingViewModel.this.read.IconCompatParcelizer("content_change_subject_list", this);
                if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objIconCompatParcelizer2;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setLogStackTraces setlogstacktraces = (setLogStackTraces) obj;
            if (setlogstacktraces != null) {
                seterroricontintmode = new setErrorIconTintMode(setlogstacktraces.getAudioAttributesCompatParcelizer(), setlogstacktraces.AudioAttributesCompatParcelizer() != null);
            } else {
                seterroricontintmode = null;
            }
            getresolutionsize.write(seterroricontintmode);
            return getShowPopup.INSTANCE;
        }

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setPassingYear onAddQueueItem() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.setErrorAccessibilityLiveRegion
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatCustomActionResultReceiver(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.onAddQueueItem
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.video.landing.VideoLandingViewModel$onAddQueueItem r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.onAddQueueItem) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$onAddQueueItem r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$onAddQueueItem
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            o.getResolutionSize r5 = (kotlin.getResolutionSize) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<java.util.List<o.FabTransformationSheetBehavior>> r6 = r5.MediaMetadataCompat
            o.LogLogLevel r5 = r5.read
            r0.AudioAttributesCompatParcelizer = r6
            r0.read = r3
            java.lang.Object r5 = r5.MediaMetadataCompat(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r4 = r6
            r6 = r5
            r5 = r4
        L4b:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L79
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r6, r1)
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r6 = r6.iterator()
        L62:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            com.marrow.data.models.common.CourseConfigV2$VideoSubjectPageItem r1 = (com.marrow.data.models.common.CourseConfigV2.VideoSubjectPageItem) r1
            o.FabTransformationSheetBehavior r1 = kotlin.FabTransformationScrimBehavior.write(r1)
            r0.add(r1)
            goto L62
        L76:
            java.util.List r0 = (java.util.List) r0
            goto L7a
        L79:
            r0 = 0
        L7a:
            r5.write(r0)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatCustomActionResultReceiver(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ VideoLandingViewModel AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer;
                Object objIconCompatParcelizer2 = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getDisplaySizeV17 getdisplaysizev17 = this.AudioAttributesCompatParcelizer.write;
                    List list = this.AudioAttributesCompatParcelizer.onSeekTo;
                    ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((proceedNonBlocking) it.next()).getRemoteActionCompatParcelizer());
                    }
                    this.IconCompatParcelizer = 1;
                    obj = getdisplaysizev17.IconCompatParcelizer(arrayList, this);
                    if (obj == objIconCompatParcelizer2) {
                        return objIconCompatParcelizer2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    getResolutionSize getresolutionsize = this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
                    do {
                        objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                    } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, IntegrityManager.RatingCompat.INSTANCE));
                    isSeekPending isseekpending = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                    setErrorContentDescription seterrorcontentdescription = setErrorContentDescription.INSTANCE;
                    isseekpending.write(setErrorContentDescription.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(VideoLandingViewModel videoLandingViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = videoLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver, new AnonymousClass4(VideoLandingViewModel.this, null), this) == objIconCompatParcelizer) {
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCounterTextColor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.MediaBrowserCompatItemReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.read
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.video.landing.VideoLandingViewModel$read r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$read r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$read
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L72
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5f
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L4d
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isEncodingHighResolutionPcm r9 = r8.IconCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r9 = r9.MediaDescriptionCompat(r0)
            if (r9 == r1) goto Lae
        L4d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L93
            o.getDisplaySizeV17 r9 = r8.write
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r9 = r9.onRemoveQueueItem(r0)
            if (r9 == r1) goto Lae
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L93
            o.isEncodingHighResolutionPcm r9 = r8.IconCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r9 = r9.MediaMetadataCompat(r0)
            if (r9 != r1) goto L72
            goto Lae
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L93
            o.getResolutionSize<o.TransformationChildLayout> r8 = r8.AudioAttributesImplApi26Parcelizer
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.TransformationChildLayout r0 = (kotlin.TransformationChildLayout) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 31
            o.TransformationChildLayout r9 = kotlin.TransformationChildLayout.RemoteActionCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
            goto Lab
        L93:
            o.getResolutionSize<o.TransformationChildLayout> r8 = r8.AudioAttributesImplApi26Parcelizer
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.TransformationChildLayout r0 = (kotlin.TransformationChildLayout) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 31
            o.TransformationChildLayout r9 = kotlin.TransformationChildLayout.RemoteActionCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
        Lab:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesImplApi26Parcelizer r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesImplApi26Parcelizer r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesImplApi26Parcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.isEncodingHighResolutionPcm r5 = r4.IconCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.MediaBrowserCompatCustomActionResultReceiver(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.util.List r5 = (java.util.List) r5
            r4.onSeekTo = r5
            r4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        /*
            r3 = this;
            o.getResolutionSize<java.util.List<o.proceedNonBlocking>> r0 = r3.onPlayFromSearch
            o.getResolutionSize<o.TransformationChildLayout> r1 = r3.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = r1.IconCompatParcelizer()
            o.TransformationChildLayout r1 = (kotlin.TransformationChildLayout) r1
            int r1 = r1.getAudioAttributesImplApi26Parcelizer()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L29
            r2 = 3
            if (r1 != r2) goto L49
            java.util.List<o.proceedNonBlocking> r3 = r3.onSeekTo
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesImplApi21Parcelizer r1 = new com.marrow2.ui.video.landing.VideoLandingViewModel$AudioAttributesImplApi21Parcelizer
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r3 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r3, r1)
            goto L4b
        L29:
            java.util.List<o.proceedNonBlocking> r3 = r3.onSeekTo
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.marrow2.ui.video.landing.VideoLandingViewModel$MediaBrowserCompatCustomActionResultReceiver r1 = new com.marrow2.ui.video.landing.VideoLandingViewModel$MediaBrowserCompatCustomActionResultReceiver
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r3 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r3, r1)
            goto L4b
        L39:
            java.util.List<o.proceedNonBlocking> r3 = r3.onSeekTo
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.marrow2.ui.video.landing.VideoLandingViewModel$MediaBrowserCompatItemReceiver r1 = new com.marrow2.ui.video.landing.VideoLandingViewModel$MediaBrowserCompatItemReceiver
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r3 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r3, r1)
            goto L4b
        L49:
            java.util.List<o.proceedNonBlocking> r3 = r3.onSeekTo
        L4b:
            r0.write(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver():void");
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = VideoLandingViewModel.this.IconCompatParcelizer.IconCompatParcelizer(RepeatModeUtil.RemoteActionCompatParcelizer, ((TransformationChildLayout) VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).getIconCompatParcelizer(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            isLinebreak islinebreak = (isLinebreak) obj;
            VideoLandingViewModel.this.MediaDescriptionCompat.write(islinebreak != null ? IntegrityServiceException.IconCompatParcelizer(islinebreak) : null);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object MediaBrowserCompatItemReceiver(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new MediaBrowserCompatMediaItem(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.onRewind
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.video.landing.VideoLandingViewModel$onRewind r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.onRewind) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$onRewind r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$onRewind
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L40
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.isEncodingHighResolutionPcm r9 = r8.IconCompatParcelizer
            r0.write = r3
            java.lang.Object r9 = r9.write(r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            java.lang.Number r9 = (java.lang.Number) r9
            int r5 = r9.intValue()
            o.getResolutionSize<o.TransformationChildLayout> r8 = r8.AudioAttributesImplApi26Parcelizer
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.TransformationChildLayout r0 = (kotlin.TransformationChildLayout) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 47
            o.TransformationChildLayout r9 = kotlin.TransformationChildLayout.RemoteActionCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplBaseParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi26Parcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.video.landing.VideoLandingViewModel$MediaMetadataCompat r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.IconCompatParcelizer
            int r9 = r9 + r2
            r0.IconCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$MediaMetadataCompat r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$MediaMetadataCompat
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L8b
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L5f
        L3c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L4d
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.LogLogLevel r9 = r8.read
            r0.IconCompatParcelizer = r5
            java.lang.Object r9 = r9.onPause(r0)
            if (r9 == r1) goto Lc4
        L4d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La9
            o.isEncodingHighResolutionPcm r9 = r8.IconCompatParcelizer
            r0.IconCompatParcelizer = r4
            java.lang.Object r9 = r9.read(r0)
            if (r9 == r1) goto Lc4
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L80
            o.getResolutionSize<o.setMinuteHourDelegate> r8 = r8.onCustomAction
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.setMinuteHourDelegate r0 = (kotlin.setMinuteHourDelegate) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 59
            o.setMinuteHourDelegate r9 = kotlin.setMinuteHourDelegate.IconCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
            goto Lc1
        L80:
            o.isEncodingHighResolutionPcm r9 = r8.IconCompatParcelizer
            r0.IconCompatParcelizer = r3
            java.lang.Object r9 = r9.AudioAttributesImplApi21Parcelizer(r0)
            if (r9 != r1) goto L8b
            goto Lc4
        L8b:
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            o.getResolutionSize<o.setMinuteHourDelegate> r8 = r8.onCustomAction
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.setMinuteHourDelegate r0 = (kotlin.setMinuteHourDelegate) r0
            r1 = 0
            r2 = 0
            r3 = 1
            r5 = 1
            r6 = 0
            r7 = 35
            o.setMinuteHourDelegate r9 = kotlin.setMinuteHourDelegate.IconCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
            goto Lc1
        La9:
            o.getResolutionSize<o.setMinuteHourDelegate> r8 = r8.onCustomAction
            java.lang.Object r9 = r8.IconCompatParcelizer()
            r0 = r9
            o.setMinuteHourDelegate r0 = (kotlin.setMinuteHourDelegate) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 47
            o.setMinuteHourDelegate r9 = kotlin.setMinuteHourDelegate.IconCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r9)
        Lc1:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplApi26Parcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        getResolutionSize<setMinuteHourDelegate> getresolutionsize = this.onCustomAction;
        getresolutionsize.write(setMinuteHourDelegate.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, null, false, 0, false, true, 31));
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ Object write;

        static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
            private /* synthetic */ VideoLandingViewModel AudioAttributesCompatParcelizer;
            private int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                Object objAudioAttributesImplBaseParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(this);
                return objAudioAttributesImplBaseParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesImplBaseParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(VideoLandingViewModel videoLandingViewModel, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = videoLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new read(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
                return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatSearchResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
            private int read;
            private /* synthetic */ VideoLandingViewModel write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                Object objMediaBrowserCompatItemReceiver = this.write.IconCompatParcelizer.MediaBrowserCompatItemReceiver(this);
                return objMediaBrowserCompatItemReceiver == objIconCompatParcelizer ? objIconCompatParcelizer : objMediaBrowserCompatItemReceiver;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AudioAttributesCompatParcelizer(VideoLandingViewModel videoLandingViewModel, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.write = videoLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AudioAttributesCompatParcelizer(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
                return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = VideoLandingViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
            mediaBrowserCompatSearchResultReceiver.write = obj;
            return mediaBrowserCompatSearchResultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesImplApi21Parcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new MediaBrowserCompatSearchResultReceiver(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (AudioAttributesImplApi26Parcelizer(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r13
            com.marrow2.ui.video.landing.VideoLandingViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.IconCompatParcelizer
            int r13 = r13 + r2
            r0.IconCompatParcelizer = r13
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$IconCompatParcelizer
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L6d
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L44
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            r0.IconCompatParcelizer = r4
            java.lang.Object r13 = r12.MediaBrowserCompatSearchResultReceiver(r0)
            if (r13 == r1) goto L8b
        L44:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L70
            o.getResolutionSize<o.setMinuteHourDelegate> r13 = r12.onCustomAction
            java.lang.Object r2 = r13.IconCompatParcelizer()
            r4 = r2
            o.setMinuteHourDelegate r4 = (kotlin.setMinuteHourDelegate) r4
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            o.setMinuteHourDelegate r2 = kotlin.setMinuteHourDelegate.IconCompatParcelizer(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.write(r2)
            r0.IconCompatParcelizer = r3
            java.lang.Object r12 = r12.AudioAttributesImplApi26Parcelizer(r0)
            if (r12 != r1) goto L6d
            goto L8b
        L6d:
            o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
            return r12
        L70:
            o.getResolutionSize<o.setMinuteHourDelegate> r12 = r12.onCustomAction
            java.lang.Object r13 = r12.IconCompatParcelizer()
            r0 = r13
            o.setMinuteHourDelegate r0 = (kotlin.setMinuteHourDelegate) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            o.setMinuteHourDelegate r13 = kotlin.setMinuteHourDelegate.IconCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.write(r13)
            o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
            return r12
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatSearchResultReceiver(kotlin.SampleVideos<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.onRemoveQueueItem
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.video.landing.VideoLandingViewModel$onRemoveQueueItem r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.onRemoveQueueItem) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$onRemoveQueueItem r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$onRemoveQueueItem
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.LogLogLevel r4 = r4.read
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r4.onPause(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatSearchResultReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.write
            if (r2 == 0) goto L18
            r2 = r1
            com.marrow2.ui.video.landing.VideoLandingViewModel$write r2 = (com.marrow2.ui.video.landing.VideoLandingViewModel.write) r2
            int r3 = r2.AudioAttributesCompatParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.AudioAttributesCompatParcelizer
            int r1 = r1 + r4
            r2.AudioAttributesCompatParcelizer = r1
            goto L1d
        L18:
            com.marrow2.ui.video.landing.VideoLandingViewModel$write r2 = new com.marrow2.ui.video.landing.VideoLandingViewModel$write
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.RemoteActionCompatParcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.AudioAttributesCompatParcelizer
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L4c
            if (r4 == r7) goto L48
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r2 = r2.IconCompatParcelizer
            com.marrow.data.models.common.CourseConfigV2 r2 = (com.marrow.data.models.common.CourseConfigV2) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L82
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.Object r4 = r2.IconCompatParcelizer
            com.marrow.data.models.common.CourseConfigV2 r4 = (com.marrow.data.models.common.CourseConfigV2) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L6c
        L48:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L59
        L4c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.LogLogLevel r1 = r0.read
            r2.AudioAttributesCompatParcelizer = r7
            java.lang.Object r1 = r1.write(r2)
            if (r1 == r3) goto Lb6
        L59:
            com.marrow.data.models.common.CourseConfigV2 r1 = (com.marrow.data.models.common.CourseConfigV2) r1
            o.LogLogLevel r4 = r0.read
            r2.IconCompatParcelizer = r1
            r2.AudioAttributesCompatParcelizer = r6
            java.lang.Object r4 = r4.onAddQueueItem(r2)
            if (r4 == r3) goto Lb6
            r16 = r4
            r4 = r1
            r1 = r16
        L6c:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8c
            o.isEncodingHighResolutionPcm r1 = r0.IconCompatParcelizer
            r2.IconCompatParcelizer = r4
            r2.AudioAttributesCompatParcelizer = r5
            java.lang.Object r1 = r1.AudioAttributesImplApi26Parcelizer(r2)
            if (r1 != r3) goto L81
            goto Lb6
        L81:
            r2 = r4
        L82:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L8b
            goto L8e
        L8b:
            r4 = r2
        L8c:
            r7 = 0
            r2 = r4
        L8e:
            o.getResolutionSize<o.TransformationChildLayout> r0 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = r0.IconCompatParcelizer()
            r8 = r1
            o.TransformationChildLayout r8 = (kotlin.TransformationChildLayout) r8
            r1 = 0
            if (r7 == 0) goto La4
            com.marrow.data.models.common.CourseConfigV2$EditionSwitch r2 = r2.getEditionSwitch()
            if (r2 == 0) goto La4
            java.lang.String r1 = r2.getTitle()
        La4:
            r9 = r1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            o.TransformationChildLayout r1 = kotlin.TransformationChildLayout.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.write(r1)
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class onCustomAction extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (VideoLandingViewModel.this.IconCompatParcelizer.RatingCompat(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer.write(TransformationChildLayout.RemoteActionCompatParcelizer((TransformationChildLayout) VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), null, false, false, false, 0, false, 31));
            return getShowPopup.INSTANCE;
        }

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onCustomAction(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(TransformationChildCard p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCustomAction(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconActivated
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof TransformationChildCard.onCommand) {
            if (((TransformationChildCard.onCommand) p0).write() == 1024) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepare(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconOnLongClickListener
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return VideoLandingViewModel.onCustomAction(this.RemoteActionCompatParcelizer, (String) obj2);
                    }
                });
                return;
            }
            return;
        }
        if (p0 instanceof TransformationChildCard.onCustomAction) {
            if (((TransformationChildCard.onCustomAction) p0).IconCompatParcelizer() == 1024) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepareFromSearch(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCounterOverflowTextAppearance
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return VideoLandingViewModel.onFastForward(this.write, (String) obj2);
                    }
                });
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromUri(null), new setEndIconDrawable(this));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onAddQueueItem.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPrepareFromMediaId(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconTintMode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPlayFromSearch(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof TransformationChildCard.onPrepare) {
            TransformationChildCard.onPrepare onprepare = (TransformationChildCard.onPrepare) p0;
            this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.AudioAttributesImplBaseParcelizer(onprepare.read().getRemoteActionCompatParcelizer(), onprepare.read().getAudioAttributesImplApi26Parcelizer()));
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            setErrorContentDescription seterrorcontentdescription = setErrorContentDescription.INSTANCE;
            isseekpending.write(setErrorContentDescription.write(onprepare.read().getRemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.handleMediaPlayPauseIfPendingOnHandler.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.MediaMetadataCompat("https://medengageclinical.firebaseapp.com/reportpiracy.html"));
            return;
        }
        if (p0 instanceof TransformationChildCard.onFastForward) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconScaleType
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPrepareFromSearch(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPause.INSTANCE)) {
            this.onPlay.write(Boolean.TRUE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPrepareFromSearch.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new handleMediaPlayPauseIfPendingOnHandler(null), new MagicModuleSubmissionRequestBody() { // from class: o.setError
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPlayFromUri(this.IconCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPlayFromSearch.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCommand(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconTintList
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPrepareFromMediaId(this.write, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.IconCompatParcelizer.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof TransformationChildCard.MediaBrowserCompatItemReceiver) {
            TransformationChildCard.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (TransformationChildCard.MediaBrowserCompatItemReceiver) p0;
            if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().getIconCompatParcelizer() != mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) {
                getResolutionSize<TransformationChildLayout> getresolutionsize = this.AudioAttributesImplApi26Parcelizer;
                getresolutionsize.write(TransformationChildLayout.RemoteActionCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, false, mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), false, 0, false, 59));
                if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer() && mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()) {
                    getResolutionSize<TransformationChildLayout> getresolutionsize2 = this.AudioAttributesImplApi26Parcelizer;
                    getresolutionsize2.write(TransformationChildLayout.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), null, false, false, false, 0, false, 55));
                }
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onFastForward(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconVisible
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return VideoLandingViewModel.onRemoveQueueItem(this.AudioAttributesCompatParcelizer, (String) obj2);
                    }
                });
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.write.INSTANCE)) {
            getResolutionSize<TransformationChildLayout> getresolutionsize3 = this.AudioAttributesImplApi26Parcelizer;
            getresolutionsize3.write(TransformationChildLayout.RemoteActionCompatParcelizer(getresolutionsize3.IconCompatParcelizer(), null, false, false, false, 0, false, 55));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromMediaId(null), new MagicModuleSubmissionRequestBody() { // from class: o.setErrorEnabled
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onSeekTo(this.read, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.read.INSTANCE)) {
            onCustomAction();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.AudioAttributesCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPause(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconCheckable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onMediaButtonEvent(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            getResolutionSize<ExpandableBehavior> getresolutionsize4 = this.onPlayFromUri;
            getresolutionsize4.write(ExpandableBehavior.RemoteActionCompatParcelizer(false, getresolutionsize4.IconCompatParcelizer().write));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.RemoteActionCompatParcelizer.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onMediaButtonEvent.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlay(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconMode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPlayFromMediaId(this.write, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPlayFromMediaId.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPlay.INSTANCE)) {
            this.onPlay.write(Boolean.FALSE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.onPrepareFromMediaId.INSTANCE)) {
            getResolutionSize<TransformationChildLayout> getresolutionsize5 = this.AudioAttributesImplApi26Parcelizer;
            getresolutionsize5.write(TransformationChildLayout.RemoteActionCompatParcelizer(getresolutionsize5.IconCompatParcelizer(), null, false, true, false, 0, false, 51));
            getResolutionSize<ExpandableBehavior> getresolutionsize6 = this.onPlayFromUri;
            getresolutionsize6.write(ExpandableBehavior.RemoteActionCompatParcelizer(false, getresolutionsize6.IconCompatParcelizer().write));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onMediaButtonEvent(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconMinSize
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPlay(this.write, (String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof TransformationChildCard.MediaMetadataCompat) {
            read((TransformationChildCard.MediaMetadataCompat) p0);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.MediaBrowserCompatMediaItem.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onPlayFromSearch(null), new MagicModuleSubmissionRequestBody() { // from class: o.setEndIconOnClickListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLandingViewModel.onPause(this.read, (String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.MediaDescriptionCompat.INSTANCE)) {
            this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.write.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, TransformationChildCard.RatingCompat.INSTANCE)) {
            onPlayFromMediaId();
            return;
        }
        if (!(p0 instanceof TransformationChildCard.MediaBrowserCompatSearchResultReceiver)) {
            throw new RenewEligibleCreator();
        }
        isSeekPending isseekpending2 = this.RemoteActionCompatParcelizer;
        setErrorContentDescription seterrorcontentdescription2 = setErrorContentDescription.INSTANCE;
        TransformationChildCard.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = (TransformationChildCard.MediaBrowserCompatSearchResultReceiver) p0;
        isseekpending2.write(setErrorContentDescription.write(mediaBrowserCompatSearchResultReceiver.read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.read(mediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(), mediaBrowserCompatSearchResultReceiver.read()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPrepare extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
        
            if (r6.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(r6) != r0) goto L19;
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L67
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L59
            L21:
                java.lang.Object r1 = r6.AudioAttributesCompatParcelizer
                o.isEncodingHighResolutionPcm r1 = (kotlin.isEncodingHighResolutionPcm) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L45
            L29:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.isEncodingHighResolutionPcm r1 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat(r7)
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.isEncodingHighResolutionPcm r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat(r7)
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.AudioAttributesCompatParcelizer = r1
                r6.IconCompatParcelizer = r4
                java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r5)
                if (r7 == r0) goto L6a
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5 = 0
                r6.AudioAttributesCompatParcelizer = r5
                r6.IconCompatParcelizer = r3
                java.lang.Object r7 = r1.write(r7, r4)
                if (r7 == r0) goto L6a
            L59:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.IconCompatParcelizer = r2
                java.lang.Object r6 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplBaseParcelizer(r7, r1)
                if (r6 != r0) goto L67
                goto L6a
            L67:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L6a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.onPrepare.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onPrepare(SampleVideos<? super onPrepare> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPrepare(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepare) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPrepareFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer(this) == objIconCompatParcelizer) {
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

        onPrepareFromSearch(SampleVideos<? super onPrepareFromSearch> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPrepareFromSearch(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onFastForward(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromUri extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (r6.write.MediaBrowserCompatItemReceiver(r6) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
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
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L64
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L56
            L24:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L49
            L28:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L3c
            L2c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r5
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.read(r7, r1)
                if (r7 == r0) goto L67
            L3c:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r4
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplApi21Parcelizer(r7, r1)
                if (r7 == r0) goto L67
            L49:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r3
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplBaseParcelizer(r7, r1)
                if (r7 == r0) goto L67
            L56:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.read = r2
                java.lang.Object r6 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatItemReceiver(r7, r1)
                if (r6 != r0) goto L64
                goto L67
            L64:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L67:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.onPlayFromUri.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onPlayFromUri(SampleVideos<? super onPlayFromUri> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPlayFromUri(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromUri) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPrepareFromMediaId extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (VideoLandingViewModel.this.MediaBrowserCompatItemReceiver(this) == objIconCompatParcelizer) {
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

        onPrepareFromMediaId(SampleVideos<? super onPrepareFromMediaId> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPrepareFromMediaId(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPrepareFromMediaId) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ TransformationChildCard write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (VideoLandingViewModel.this.IconCompatParcelizer.IconCompatParcelizer(((TransformationChildCard.onFastForward) this.write).read(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer.write(TransformationChildLayout.RemoteActionCompatParcelizer((TransformationChildLayout) VideoLandingViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), null, false, false, false, ((TransformationChildCard.onFastForward) this.write).read(), false, 47));
            VideoLandingViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(TransformationChildCard transformationChildCard, SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.write = transformationChildCard;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromSearch(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.video.landing.VideoLandingViewModel$handleMediaPlayPauseIfPendingOnHandler$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoLandingViewModel AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                IntegrityManager audioAttributesImplApi26Parcelizer;
                StandardIntegrityVerdictOptOut.read readVar;
                isSeekPending isseekpending;
                String str;
                String str2;
                StandardIntegrityVerdictOptOut.read readVar2;
                String str3;
                IntegrityManagerFactory integrityManagerFactory;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesImplBaseParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    IntegrityManagerFactory integrityManagerFactory2 = (IntegrityManagerFactory) this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat.IconCompatParcelizer();
                    if (integrityManagerFactory2 != null) {
                        isSeekPending isseekpending2 = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
                        setErrorContentDescription seterrorcontentdescription = setErrorContentDescription.INSTANCE;
                        isseekpending2.write(setErrorContentDescription.IconCompatParcelizer(integrityManagerFactory2.getRead(), integrityManagerFactory2.getWrite()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                        getResolutionSize getresolutionsize = this.AudioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler;
                        if (integrityManagerFactory2.getAudioAttributesImplApi21Parcelizer()) {
                            audioAttributesImplApi26Parcelizer = new IntegrityManager.AudioAttributesImplApi26Parcelizer(integrityManagerFactory2.getRead(), integrityManagerFactory2.getWrite());
                        } else {
                            audioAttributesImplApi26Parcelizer = IntegrityManager.MediaBrowserCompatSearchResultReceiver.INSTANCE;
                        }
                        getresolutionsize.write(audioAttributesImplApi26Parcelizer);
                        if (integrityManagerFactory2.getWrite() == 2) {
                            readVar = StandardIntegrityVerdictOptOut.read.RemoteActionCompatParcelizer;
                        } else {
                            readVar = StandardIntegrityVerdictOptOut.read.IconCompatParcelizer;
                        }
                        StandardIntegrityVerdictOptOut.read readVar3 = readVar;
                        isSeekPending isseekpending3 = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
                        StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut = StandardIntegrityVerdictOptOut.INSTANCE;
                        String read = integrityManagerFactory2.getRead();
                        String iconCompatParcelizer = integrityManagerFactory2.getIconCompatParcelizer();
                        String audioAttributesCompatParcelizer = integrityManagerFactory2.getAudioAttributesCompatParcelizer();
                        this.AudioAttributesCompatParcelizer = integrityManagerFactory2;
                        this.read = readVar3;
                        this.IconCompatParcelizer = standardIntegrityVerdictOptOut;
                        this.write = read;
                        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
                        this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer;
                        this.MediaBrowserCompatCustomActionResultReceiver = isseekpending3;
                        this.AudioAttributesImplBaseParcelizer = 1;
                        Object objRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(integrityManagerFactory2.getIconCompatParcelizer(), this);
                        if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                        isseekpending = isseekpending3;
                        str = read;
                        str2 = iconCompatParcelizer;
                        readVar2 = readVar3;
                        str3 = audioAttributesCompatParcelizer;
                        obj = objRemoteActionCompatParcelizer;
                        integrityManagerFactory = integrityManagerFactory2;
                    }
                    return getShowPopup.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                isseekpending = (isSeekPending) this.MediaBrowserCompatCustomActionResultReceiver;
                String str4 = (String) this.MediaBrowserCompatItemReceiver;
                str2 = (String) this.RemoteActionCompatParcelizer;
                String str5 = (String) this.write;
                StandardIntegrityVerdictOptOut.read readVar4 = (StandardIntegrityVerdictOptOut.read) this.read;
                integrityManagerFactory = (IntegrityManagerFactory) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                readVar2 = readVar4;
                str3 = str4;
                str = str5;
                isseekpending.write(StandardIntegrityVerdictOptOut.IconCompatParcelizer(str, str2, integrityManagerFactory.getRemoteActionCompatParcelizer(), str3, (String) obj, readVar2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(VideoLandingViewModel videoLandingViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = videoLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.AudioAttributesImplApi26Parcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
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
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver, new AnonymousClass4(VideoLandingViewModel.this, null), this) == objIconCompatParcelizer) {
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

        handleMediaPlayPauseIfPendingOnHandler(SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new handleMediaPlayPauseIfPendingOnHandler(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromUri(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onCommand extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objAudioAttributesCompatParcelizer;
            int i;
            getResolutionSize getresolutionsize2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize = VideoLandingViewModel.this.handleMediaPlayPauseIfPendingOnHandler;
                this.write = getresolutionsize;
                this.IconCompatParcelizer = 1;
                objAudioAttributesCompatParcelizer = VideoLandingViewModel.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.read;
                getresolutionsize2 = (getResolutionSize) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize2.write(new IntegrityManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i, ((Number) obj).intValue()));
                return getShowPopup.INSTANCE;
            }
            getResolutionSize getresolutionsize3 = (getResolutionSize) this.write;
            SdkPayloadData.IconCompatParcelizer(obj);
            objAudioAttributesCompatParcelizer = obj;
            getresolutionsize = getresolutionsize3;
            int iIntValue = ((Number) objAudioAttributesCompatParcelizer).intValue();
            this.write = getresolutionsize;
            this.read = iIntValue;
            this.IconCompatParcelizer = 2;
            Object objIconCompatParcelizer2 = VideoLandingViewModel.this.IconCompatParcelizer.IconCompatParcelizer(this);
            if (objIconCompatParcelizer2 != objIconCompatParcelizer) {
                i = iIntValue;
                getResolutionSize getresolutionsize4 = getresolutionsize;
                obj = objIconCompatParcelizer2;
                getresolutionsize2 = getresolutionsize4;
                getresolutionsize2.write(new IntegrityManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i, ((Number) obj).intValue()));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onCommand(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromMediaId(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onFastForward extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ TransformationChildCard IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r6.write.AudioAttributesCompatParcelizer(r6) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
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
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L78
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L6a
            L24:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L55
            L28:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L3c
            L2c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r5
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatItemReceiver(r7, r1)
                if (r7 == r0) goto L7b
            L3c:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.isEncodingHighResolutionPcm r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat(r7)
                o.TransformationChildCard r1 = r6.IconCompatParcelizer
                o.TransformationChildCard$MediaBrowserCompatItemReceiver r1 = (o.TransformationChildCard.MediaBrowserCompatItemReceiver) r1
                boolean r1 = r1.RemoteActionCompatParcelizer()
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.AudioAttributesCompatParcelizer = r4
                java.lang.Object r7 = r7.IconCompatParcelizer(r1, r5)
                if (r7 == r0) goto L7b
            L55:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.TransformationChildCard r1 = r6.IconCompatParcelizer
                o.TransformationChildCard$MediaBrowserCompatItemReceiver r1 = (o.TransformationChildCard.MediaBrowserCompatItemReceiver) r1
                boolean r1 = r1.RemoteActionCompatParcelizer()
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r6.AudioAttributesCompatParcelizer = r3
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer(r7, r1, r4)
                if (r7 == r0) goto L7b
            L6a:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r2
                java.lang.Object r6 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesCompatParcelizer(r7, r1)
                if (r6 != r0) goto L78
                goto L7b
            L78:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L7b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.onFastForward.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onFastForward(TransformationChildCard transformationChildCard, SampleVideos<? super onFastForward> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = transformationChildCard;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onFastForward(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onFastForward) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onRemoveQueueItem(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromMediaId extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VideoLandingViewModel.this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver(this) == objIconCompatParcelizer) {
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

        onPlayFromMediaId(SampleVideos<? super onPlayFromMediaId> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPlayFromMediaId(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromMediaId) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onSeekTo(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPause extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = VideoLandingViewModel.this.write.onRemoveQueueItem(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                getResolutionSize getresolutionsize = VideoLandingViewModel.this.onPlayFromUri;
                getresolutionsize.write(ExpandableBehavior.RemoteActionCompatParcelizer(true, true));
            } else {
                getResolutionSize getresolutionsize2 = VideoLandingViewModel.this.onPlayFromUri;
                getresolutionsize2.write(ExpandableBehavior.RemoteActionCompatParcelizer(true, false));
            }
            return getShowPopup.INSTANCE;
        }

        onPause(SampleVideos<? super onPause> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPause(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPause) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlay extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = VideoLandingViewModel.this.read.RemoteActionCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                VideoLandingViewModel.this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.MediaBrowserCompatItemReceiver.INSTANCE);
            } else {
                VideoLandingViewModel.this.handleMediaPlayPauseIfPendingOnHandler.write(IntegrityManager.onCommand.INSTANCE);
            }
            return getShowPopup.INSTANCE;
        }

        onPlay(SampleVideos<? super onPlay> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPlay(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlay) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onMediaButtonEvent extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            if (r6.write.AudioAttributesCompatParcelizer(r6) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.RemoteActionCompatParcelizer
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L6c
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L5e
            L24:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L51
            L28:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L40
            L2c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.isEncodingHighResolutionPcm r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.RemoteActionCompatParcelizer = r5
                java.lang.Object r7 = r7.IconCompatParcelizer(r5, r1)
                if (r7 == r0) goto L6f
            L40:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                o.isEncodingHighResolutionPcm r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaMetadataCompat(r7)
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.RemoteActionCompatParcelizer = r4
                java.lang.Object r7 = r7.MediaBrowserCompatSearchResultReceiver(r1)
                if (r7 == r0) goto L6f
            L51:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.RemoteActionCompatParcelizer = r3
                java.lang.Object r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer(r7, r5, r1)
                if (r7 == r0) goto L6f
            L5e:
                com.marrow2.ui.video.landing.VideoLandingViewModel r7 = com.marrow2.ui.video.landing.VideoLandingViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.RemoteActionCompatParcelizer = r2
                java.lang.Object r6 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesCompatParcelizer(r7, r1)
                if (r6 != r0) goto L6c
                goto L6f
            L6c:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L6f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.onMediaButtonEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onMediaButtonEvent(SampleVideos<? super onMediaButtonEvent> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onMediaButtonEvent(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onMediaButtonEvent) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlay(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onPlayFromSearch extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            VideoLandingViewModel videoLandingViewModel;
            int i;
            IntegrityManagerFactory integrityManagerFactory;
            VideoLandingViewModel videoLandingViewModel2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.write;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                IntegrityManagerFactory integrityManagerFactory2 = (IntegrityManagerFactory) VideoLandingViewModel.this.MediaDescriptionCompat.IconCompatParcelizer();
                if (integrityManagerFactory2 != null) {
                    videoLandingViewModel = VideoLandingViewModel.this;
                    isEncodingHighResolutionPcm isencodinghighresolutionpcm = videoLandingViewModel.IconCompatParcelizer;
                    String read = integrityManagerFactory2.getRead();
                    this.AudioAttributesCompatParcelizer = videoLandingViewModel;
                    this.RemoteActionCompatParcelizer = integrityManagerFactory2;
                    i = 0;
                    this.IconCompatParcelizer = 0;
                    this.write = 1;
                    if (isencodinghighresolutionpcm.write(read, this) != objIconCompatParcelizer) {
                        integrityManagerFactory = integrityManagerFactory2;
                    }
                    return objIconCompatParcelizer;
                }
                return getShowPopup.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoLandingViewModel2 = (VideoLandingViewModel) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                videoLandingViewModel2.MediaDescriptionCompat.write(null);
                return getShowPopup.INSTANCE;
            }
            int i3 = this.IconCompatParcelizer;
            integrityManagerFactory = (IntegrityManagerFactory) this.RemoteActionCompatParcelizer;
            VideoLandingViewModel videoLandingViewModel3 = (VideoLandingViewModel) this.AudioAttributesCompatParcelizer;
            SdkPayloadData.IconCompatParcelizer(obj);
            i = i3;
            videoLandingViewModel = videoLandingViewModel3;
            getPlatform getplatform = videoLandingViewModel.MediaBrowserCompatCustomActionResultReceiver;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(videoLandingViewModel, integrityManagerFactory, null);
            this.AudioAttributesCompatParcelizer = videoLandingViewModel;
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = i;
            this.write = 2;
            if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(getplatform, remoteActionCompatParcelizer, this) != objIconCompatParcelizer) {
                videoLandingViewModel2 = videoLandingViewModel;
                videoLandingViewModel2.MediaDescriptionCompat.write(null);
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ IntegrityManagerFactory AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoLandingViewModel AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                String str;
                String str2;
                String str3;
                isSeekPending isseekpending;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesImplBaseParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    isSeekPending isseekpending2 = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
                    StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut = StandardIntegrityVerdictOptOut.INSTANCE;
                    String read = this.AudioAttributesCompatParcelizer.getRead();
                    String iconCompatParcelizer = this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
                    String audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
                    this.RemoteActionCompatParcelizer = isseekpending2;
                    this.read = standardIntegrityVerdictOptOut;
                    this.write = read;
                    this.IconCompatParcelizer = iconCompatParcelizer;
                    this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer;
                    this.AudioAttributesImplBaseParcelizer = 1;
                    Object objRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.getIconCompatParcelizer(), this);
                    if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    str = read;
                    str2 = iconCompatParcelizer;
                    str3 = audioAttributesCompatParcelizer;
                    obj = objRemoteActionCompatParcelizer;
                    isseekpending = isseekpending2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) this.AudioAttributesImplApi26Parcelizer;
                    str2 = (String) this.IconCompatParcelizer;
                    str = (String) this.write;
                    isseekpending = (isSeekPending) this.RemoteActionCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                isseekpending.write(StandardIntegrityVerdictOptOut.write(str, str2, str3, (String) obj), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(VideoLandingViewModel videoLandingViewModel, IntegrityManagerFactory integrityManagerFactory, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi21Parcelizer = videoLandingViewModel;
                this.AudioAttributesCompatParcelizer = integrityManagerFactory;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        onPlayFromSearch(SampleVideos<? super onPlayFromSearch> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onPlayFromSearch(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onPlayFromSearch) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPause(VideoLandingViewModel videoLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLandingViewModel.onPause.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class onSeekTo extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.video.landing.VideoLandingViewModel$onSeekTo$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ VideoLandingViewModel RemoteActionCompatParcelizer;
            private Object read;

            /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
            
                if (r7.RemoteActionCompatParcelizer.write.onSetPlaybackSpeed(r7) == r0) goto L22;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r7.AudioAttributesCompatParcelizer
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L82
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1a:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L47
                L1e:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    com.marrow2.ui.video.landing.VideoLandingViewModel r8 = r7.RemoteActionCompatParcelizer
                    o.isSeekPending r8 = com.marrow2.ui.video.landing.VideoLandingViewModel.IconCompatParcelizer(r8)
                    o.setErrorContentDescription r1 = kotlin.setErrorContentDescription.INSTANCE
                    o.getSubscriptionExpiresOn r1 = kotlin.setErrorContentDescription.IconCompatParcelizer()
                    o.updateLoadingFinished r4 = kotlin.updateLoadingFinished.IconCompatParcelizer
                    java.util.List r4 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r4)
                    r8.write(r1, r4)
                    com.marrow2.ui.video.landing.VideoLandingViewModel r8 = r7.RemoteActionCompatParcelizer
                    o.binarySearchCeil r8 = com.marrow2.ui.video.landing.VideoLandingViewModel.MediaBrowserCompatCustomActionResultReceiver(r8)
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.AudioAttributesCompatParcelizer = r3
                    java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r1)
                    if (r8 == r0) goto L85
                L47:
                    o.addWithOverflowDefault r8 = (kotlin.addWithOverflowDefault) r8
                    if (r8 == 0) goto L6d
                    com.marrow2.ui.video.landing.VideoLandingViewModel r1 = r7.RemoteActionCompatParcelizer
                    o.getResolutionSize r1 = com.marrow2.ui.video.landing.VideoLandingViewModel.onCommand(r1)
                L51:
                    java.lang.Object r3 = r1.IconCompatParcelizer()
                    r4 = r3
                    o.IntegrityManager r4 = (kotlin.IntegrityManager) r4
                    java.lang.String r4 = r8.AudioAttributesCompatParcelizer()
                    java.lang.String r5 = r8.RemoteActionCompatParcelizer()
                    o.IntegrityManager$AudioAttributesImplBaseParcelizer r6 = new o.IntegrityManager$AudioAttributesImplBaseParcelizer
                    r6.<init>(r4, r5)
                    o.IntegrityManager r6 = (kotlin.IntegrityManager) r6
                    boolean r3 = r1.AudioAttributesCompatParcelizer(r3, r6)
                    if (r3 == 0) goto L51
                L6d:
                    com.marrow2.ui.video.landing.VideoLandingViewModel r8 = r7.RemoteActionCompatParcelizer
                    o.getDisplaySizeV17 r8 = com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesImplApi21Parcelizer(r8)
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r3 = 0
                    r7.read = r3
                    r7.AudioAttributesCompatParcelizer = r2
                    java.lang.Object r7 = r8.onSetPlaybackSpeed(r1)
                    if (r7 != r0) goto L82
                    goto L85
                L82:
                    o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                    return r7
                L85:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.onSeekTo.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(VideoLandingViewModel videoLandingViewModel, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = videoLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver, new AnonymousClass1(VideoLandingViewModel.this, null), this) == objIconCompatParcelizer) {
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

        onSeekTo(SampleVideos<? super onSeekTo> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new onSeekTo(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onSeekTo) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPlayFromMediaId() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onSeekTo(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCursorColor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.MediaBrowserCompatMediaItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void read(TransformationChildCard.MediaMetadataCompat p0) {
        if (this.MediaDescriptionCompat.IconCompatParcelizer() instanceof IntegrityManagerFactory.RemoteActionCompatParcelizer) {
            int iWrite = p0.write() - p0.AudioAttributesCompatParcelizer();
            if (p0.AudioAttributesCompatParcelizer() != 0 || Math.abs(iWrite) <= 500) {
                if (iWrite > 10) {
                    this.onCommand.write(requestIntegrityToken.IconCompatParcelizer);
                    this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.RemoteActionCompatParcelizer(false));
                } else if (iWrite < -10) {
                    this.onCommand.write(requestIntegrityToken.RemoteActionCompatParcelizer);
                    this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.RemoteActionCompatParcelizer(true));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (kotlin.setCountry.IconCompatParcelizer(1500, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(boolean r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.video.landing.VideoLandingViewModel.onPrepareFromUri
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.video.landing.VideoLandingViewModel$onPrepareFromUri r0 = (com.marrow2.ui.video.landing.VideoLandingViewModel.onPrepareFromUri) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            com.marrow2.ui.video.landing.VideoLandingViewModel$onPrepareFromUri r0 = new com.marrow2.ui.video.landing.VideoLandingViewModel$onPrepareFromUri
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            int r7 = r0.write
            boolean r2 = r0.read
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            o.ExpandableTransformationBehavior r5 = (kotlin.ExpandableTransformationBehavior) r5
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.getResolutionSize r5 = (kotlin.getResolutionSize) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L66
        L47:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getResolutionSize<o.ExpandableTransformationBehavior> r5 = r6.onPrepareFromSearch
            java.lang.Object r8 = r5.IconCompatParcelizer()
            o.ExpandableTransformationBehavior r8 = (kotlin.ExpandableTransformationBehavior) r8
            o.getDisplaySizeV17 r2 = r6.write
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r7
            r0.write = r4
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r8 = r2.onRemoveQueueItem(r0)
            if (r8 == r1) goto L9a
            r2 = r7
            r7 = r4
        L66:
            if (r7 != 0) goto L69
            r4 = 0
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            o.ExpandableTransformationBehavior r7 = kotlin.ExpandableTransformationBehavior.AudioAttributesCompatParcelizer(r4, r7, r2)
            r5.write(r7)
            r7 = 0
            r0.IconCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r2
            r0.AudioAttributesCompatParcelizer = r3
            r7 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r7 = kotlin.setCountry.IconCompatParcelizer(r7, r0)
            if (r7 != r1) goto L88
            goto L9a
        L88:
            o.getResolutionSize<o.ExpandableTransformationBehavior> r6 = r6.onPrepareFromSearch
            java.lang.Object r7 = r6.IconCompatParcelizer()
            o.ExpandableTransformationBehavior r7 = (kotlin.ExpandableTransformationBehavior) r7
            o.ExpandableTransformationBehavior r7 = kotlin.ExpandableTransformationBehavior.write(r7)
            r6.write(r7)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.landing.VideoLandingViewModel.AudioAttributesCompatParcelizer(boolean, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = VideoLandingViewModel.this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue > 0) {
                VideoLandingViewModel.this.handleMediaPlayPauseIfPendingOnHandler.write(new IntegrityManager.MediaDescriptionCompat(iIntValue));
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLandingViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCursorErrorColor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLandingViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
