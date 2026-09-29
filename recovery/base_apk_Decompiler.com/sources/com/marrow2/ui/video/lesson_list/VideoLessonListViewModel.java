package com.marrow2.ui.video.lesson_list;

import com.marrow2.ui.video.lesson_list.VideoLessonListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.BundledChunkExtractor;
import kotlin.C0195r;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Recaptcha;
import kotlin.RenewEligibleCreator;
import kotlin.ReviewInfo;
import kotlin.ReviewManagerFactory;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getClientBWLJW6A;
import kotlin.getClientBWLJW6Adefault;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTasksClient;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.isTrafficRestricted;
import kotlin.isTv;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.lambdaonPrepareComplete0comgoogleandroidexoplayer2sourceadsAdsMediaSourceAdPrepareListener;
import kotlin.readTimestamp;
import kotlin.registerEvent;
import kotlin.setErrorTextColor;
import kotlin.setLogStackTraces;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.t;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0015\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082@¢\u0006\u0004\b\"\u0010\u0017J\u001d\u0010\u0015\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020#0 H\u0002¢\u0006\u0004\b\u0015\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0003\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\"\u0010&J\u0018\u0010%\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020(H\u0002¢\u0006\u0004\b\"\u0010)R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u000207098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b5\u0010<R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020=068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00108R \u00103\u001a\b\u0012\u0004\u0012\u00020=098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b\u001e\u0010<R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020?068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020?098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\b3\u0010<R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0 068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R&\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0 098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010;\u001a\u0004\b\u0015\u0010<R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u00108R \u0010,\u001a\b\u0012\u0004\u0012\u00020C098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\b\u001d\u0010<R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020C068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u00020C098\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b%\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020F068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u00108R \u0010/\u001a\b\u0012\u0004\u0012\u00020F098\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b\u0018\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0014068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010;"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/VideoLessonListViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/lambdanewSingleThreadScheduledExecutor4;", "p1", "Lo/readTimestamp;", "p2", "Lo/LogLogLevel;", "p3", "Lo/BundledChunkExtractor;", "p4", "Lo/isSeekPending;", "p5", "<init>", "(Lo/POJOPropertyBuilder5;Lo/lambdanewSingleThreadScheduledExecutor4;Lo/readTimestamp;Lo/LogLogLevel;Lo/BundledChunkExtractor;Lo/isSeekPending;)V", "Lo/Recaptcha;", "", "RemoteActionCompatParcelizer", "(Lo/Recaptcha;)V", "", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "()V", "Lo/setLogStackTraces;", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "", "Lo/isTrafficRestricted;", "write", "Lo/isTrafficRestricted$AudioAttributesImplApi26Parcelizer;", "(Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "MediaBrowserCompatMediaItem", "", "(I)V", "onPlay", "Lo/lambdanewSingleThreadScheduledExecutor4;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/readTimestamp;", "Lo/LogLogLevel;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/BundledChunkExtractor;", "Lo/isSeekPending;", "Lo/ReviewInfo;", "AudioAttributesImplApi26Parcelizer", "Lo/ReviewInfo;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getResolutionSize;", "Lo/ReviewManagerFactory;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "onCommand", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/getTasksClient;", "onPlayFromMediaId", "Lo/r;", "onCustomAction", "Lo/registerEvent;", "RatingCompat", "Lo/t;", "MediaMetadataCompat", "onAddQueueItem", "Lo/getClientBWLJW6A;", "onFastForward"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoLessonListViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<t> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getTasksClient> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final ReviewInfo MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<t> onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<ReviewManagerFactory> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<C0195r> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<List<registerEvent>> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<t> onCommand;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final readTimestamp read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final LogLogLevel write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<t> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> onFastForward;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> onPlayFromMediaId;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final BundledChunkExtractor RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final setUpdatedStatus<getClientBWLJW6A> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<ReviewManagerFactory> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final setUpdatedStatus<C0195r> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final lambdanewSingleThreadScheduledExecutor4 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<getTasksClient> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<List<registerEvent>> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<getClientBWLJW6A> onCustomAction;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.IconCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        /* synthetic */ Object MediaBrowserCompatSearchResultReceiver;
        Object MediaDescriptionCompat;
        int MediaMetadataCompat;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.write(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        boolean read;
        Object write;

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.AudioAttributesImplApi21Parcelizer(this);
        }
    }

    static final class MediaDescriptionCompat extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.MediaBrowserCompatItemReceiver(this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.AudioAttributesImplBaseParcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.AudioAttributesCompatParcelizer((String) null, this);
        }
    }

    static final class read extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.read(this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return VideoLessonListViewModel.this.write((String) null, this);
        }
    }

    @setSdkPayload
    public VideoLessonListViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, readTimestamp readtimestamp, LogLogLevel logLogLevel, BundledChunkExtractor bundledChunkExtractor, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = lambdanewsinglethreadscheduledexecutor4;
        this.read = readtimestamp;
        this.write = logLogLevel;
        this.RemoteActionCompatParcelizer = bundledChunkExtractor;
        this.IconCompatParcelizer = isseekpending;
        ReviewInfo.Companion companion = ReviewInfo.INSTANCE;
        this.MediaBrowserCompatCustomActionResultReceiver = ReviewInfo.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<ReviewManagerFactory> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new ReviewManagerFactory(0, null, 3, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<getTasksClient> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new getTasksClient(false, false, 0, false, 15, null));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<C0195r> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new C0195r(false, 0, false, 7, null));
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<List<registerEvent>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<t> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(new t(null, null, false, false, false, 0, 63, null));
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<t> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new t(null, null, false, false, false, 0, 63, null));
        this.onAddQueueItem = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<getClientBWLJW6A> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(getClientBWLJW6A.AudioAttributesCompatParcelizer.INSTANCE);
        this.onCustomAction = getresolutionsizeRemoteActionCompatParcelizer7;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer("");
        this.onPlayFromMediaId = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onFastForward = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass3(null), new MagicModuleSubmissionRequestBody() { // from class: o.az
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListViewModel.AudioAttributesImplBaseParcelizer(this.write, (String) obj2);
            }
        });
    }

    public final setUpdatedStatus<ReviewManagerFactory> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<getTasksClient> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<C0195r> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<List<registerEvent>> read() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<t> IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUpdatedStatus<t> AudioAttributesCompatParcelizer() {
        return this.onCommand;
    }

    public final setUpdatedStatus<getClientBWLJW6A> AudioAttributesImplBaseParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (r6.write.AudioAttributesImplApi21Parcelizer(r6) != r0) goto L23;
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
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r5
                java.lang.Object r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatCustomActionResultReceiver(r7, r1)
                if (r7 == r0) goto L6c
            L3c:
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r4
                java.lang.Object r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.RemoteActionCompatParcelizer(r7, r1)
                if (r7 == r0) goto L6c
            L49:
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r3
                java.lang.Object r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplApi26Parcelizer(r7, r1)
                if (r7 == r0) goto L6c
            L56:
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.AudioAttributesCompatParcelizer = r2
                java.lang.Object r7 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplBaseParcelizer(r7, r1)
                if (r7 != r0) goto L64
                goto L6c
            L64:
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel r6 = com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.this
                com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.IconCompatParcelizer(r6)
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L6c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass3(SampleVideos<? super AnonymousClass3> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new AnonymousClass3(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass3) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(VideoLessonListViewModel videoLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLessonListViewModel.onPlayFromMediaId.write(str);
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(Recaptcha p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.onCustomAction.write(getClientBWLJW6A.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.IconCompatParcelizer.INSTANCE)) {
            boolean remoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().getRemoteActionCompatParcelizer();
            getResolutionSize<getTasksClient> getresolutionsize = this.MediaBrowserCompatItemReceiver;
            getresolutionsize.write(getTasksClient.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, !remoteActionCompatParcelizer, 0, false, 13));
            return;
        }
        if (p0 instanceof Recaptcha.handleMediaPlayPauseIfPendingOnHandler) {
            write(((Recaptcha.handleMediaPlayPauseIfPendingOnHandler) p0).IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.read.INSTANCE)) {
            this.onCustomAction.write(getClientBWLJW6A.read.INSTANCE);
            return;
        }
        if (p0 instanceof Recaptcha.RemoteActionCompatParcelizer) {
            Recaptcha.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (Recaptcha.RemoteActionCompatParcelizer) p0;
            read(remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer2.write());
            return;
        }
        if (p0 instanceof Recaptcha.MediaBrowserCompatItemReceiver) {
            Recaptcha.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (Recaptcha.MediaBrowserCompatItemReceiver) p0;
            if (mediaBrowserCompatItemReceiver.read().getMediaBrowserCompatCustomActionResultReceiver()) {
                if (lambdaonPrepareComplete0comgoogleandroidexoplayer2sourceadsAdsMediaSourceAdPrepareListener.AudioAttributesCompatParcelizer().contains(mediaBrowserCompatItemReceiver.read().getOnCommand())) {
                    this.onCustomAction.write(getClientBWLJW6A.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                    return;
                } else {
                    this.onCustomAction.write(getClientBWLJW6A.AudioAttributesImplBaseParcelizer.INSTANCE);
                    return;
                }
            }
            if (mediaBrowserCompatItemReceiver.read().getRatingCompat() && !this.MediaDescriptionCompat.IconCompatParcelizer().getAudioAttributesCompatParcelizer()) {
                this.onCustomAction.write(getClientBWLJW6A.AudioAttributesImplApi26Parcelizer.INSTANCE);
                return;
            }
            this.onCustomAction.write(new getClientBWLJW6A.AudioAttributesImplApi21Parcelizer(mediaBrowserCompatItemReceiver.read().getOnPlayFromMediaId()));
            isSeekPending isseekpending = this.IconCompatParcelizer;
            StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut = StandardIntegrityVerdictOptOut.INSTANCE;
            isseekpending.write(StandardIntegrityVerdictOptOut.IconCompatParcelizer(mediaBrowserCompatItemReceiver.read().getAudioAttributesImplApi21Parcelizer(), mediaBrowserCompatItemReceiver.read().getOnCommand(), mediaBrowserCompatItemReceiver.read().getOnCustomAction(), mediaBrowserCompatItemReceiver.read().getHandleMediaPlayPauseIfPendingOnHandler(), this.MediaMetadataCompat.IconCompatParcelizer().getAudioAttributesCompatParcelizer(), getClientBWLJW6Adefault.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer())), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (p0 instanceof Recaptcha.MediaMetadataCompat) {
            Recaptcha.MediaMetadataCompat mediaMetadataCompat = (Recaptcha.MediaMetadataCompat) p0;
            this.onCustomAction.write(new getClientBWLJW6A.RemoteActionCompatParcelizer(mediaMetadataCompat.AudioAttributesCompatParcelizer(), mediaMetadataCompat.RemoteActionCompatParcelizer()));
            return;
        }
        if (p0 instanceof Recaptcha.MediaDescriptionCompat) {
            if (((Recaptcha.MediaDescriptionCompat) p0).IconCompatParcelizer().length() > 0) {
                MediaDescriptionCompat();
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.RatingCompat.INSTANCE)) {
            MediaDescriptionCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut2 = StandardIntegrityVerdictOptOut.INSTANCE;
            isseekpending2.write(StandardIntegrityVerdictOptOut.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            isSeekPending isseekpending3 = this.IconCompatParcelizer;
            StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut3 = StandardIntegrityVerdictOptOut.INSTANCE;
            isseekpending3.write(StandardIntegrityVerdictOptOut.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            isSeekPending isseekpending4 = this.IconCompatParcelizer;
            StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut4 = StandardIntegrityVerdictOptOut.INSTANCE;
            isseekpending4.write(StandardIntegrityVerdictOptOut.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            if (this.MediaMetadataCompat.IconCompatParcelizer().getIconCompatParcelizer()) {
                getResolutionSize<t> getresolutionsize2 = this.MediaMetadataCompat;
                getresolutionsize2.write(t.read(getresolutionsize2.IconCompatParcelizer(), null, null, false, false, false, 0, 47));
                MediaDescriptionCompat();
                return;
            } else {
                getResolutionSize<getTasksClient> getresolutionsize3 = this.MediaBrowserCompatItemReceiver;
                getresolutionsize3.write(getTasksClient.IconCompatParcelizer(getresolutionsize3.IconCompatParcelizer(), false, false, 0, true, 7));
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.MediaBrowserCompatMediaItem.INSTANCE)) {
            this.onCustomAction.write(getClientBWLJW6A.write.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
            this.onCustomAction.write(new getClientBWLJW6A.MediaDescriptionCompat(this.RemoteActionCompatParcelizer.onRemoveQueueItem(), this.RemoteActionCompatParcelizer.onSetRating()));
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Recaptcha.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = VideoLessonListViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            VideoLessonListViewModel.this.onCustomAction.write(new getClientBWLJW6A.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (List) obj, ((C0195r) VideoLessonListViewModel.this.MediaDescriptionCompat.IconCompatParcelizer()).getAudioAttributesCompatParcelizer()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(String str, String str2, SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new RatingCompat(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String p0, String p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.be
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListViewModel.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(VideoLessonListViewModel videoLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLessonListViewModel.onPlayFromMediaId.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r10
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatItemReceiver r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.read
            int r10 = r10 + r2
            r0.read = r10
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatItemReceiver r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatItemReceiver
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L59
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.ReviewInfo r10 = r9.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r10 = r10.getRead()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r2 = r10.length()
            if (r2 != 0) goto L5b
            o.lambdanewSingleThreadScheduledExecutor4 r10 = r9.AudioAttributesCompatParcelizer
            o.ReviewInfo r2 = r9.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r2 = r2.getRemoteActionCompatParcelizer()
            r4 = 0
            r0.AudioAttributesCompatParcelizer = r4
            r0.read = r3
            java.lang.Object r10 = r10.MediaDescriptionCompat(r2, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            java.lang.String r10 = (java.lang.String) r10
        L5b:
            java.lang.String r10 = (java.lang.String) r10
            o.getResolutionSize<o.t> r8 = r9.MediaMetadataCompat
            java.lang.Object r0 = r8.IconCompatParcelizer()
            o.t r0 = (kotlin.t) r0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 61
            r2 = r10
            o.t r0 = kotlin.t.read(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.write(r0)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r10 = r10.length()
            if (r10 != 0) goto L83
            o.getResolutionSize<o.getClientBWLJW6A> r9 = r9.onCustomAction
            o.getClientBWLJW6A$MediaBrowserCompatSearchResultReceiver r10 = o.getClientBWLJW6A.MediaBrowserCompatSearchResultReceiver.INSTANCE
            r9.write(r10)
        L83:
            o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.read
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$read r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$read r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$read
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r5 = r0.read
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.r r5 = (kotlin.C0195r) r5
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer
            o.getResolutionSize r0 = (kotlin.getResolutionSize) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L5c
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<o.r> r6 = r5.MediaDescriptionCompat
            java.lang.Object r2 = r6.IconCompatParcelizer()
            o.r r2 = (kotlin.C0195r) r2
            o.lambdanewSingleThreadScheduledExecutor4 r5 = r5.AudioAttributesCompatParcelizer
            r0.RemoteActionCompatParcelizer = r6
            r0.IconCompatParcelizer = r2
            r0.read = r4
            r0.write = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            r0 = r6
            r6 = r5
            r5 = r2
        L5c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r1 = 5
            o.r r5 = kotlin.C0195r.read(r5, r4, r6, r4, r1)
            r0.write(r5)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaMetadataCompat
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaMetadataCompat r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaMetadataCompat) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaMetadataCompat r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaMetadataCompat
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.read
            o.r r5 = (kotlin.C0195r) r5
            java.lang.Object r0 = r0.IconCompatParcelizer
            o.getResolutionSize r0 = (kotlin.getResolutionSize) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L5d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<o.r> r6 = r5.MediaDescriptionCompat
            java.lang.Object r2 = r6.IconCompatParcelizer()
            o.r r2 = (kotlin.C0195r) r2
            o.lambdanewSingleThreadScheduledExecutor4 r4 = r5.AudioAttributesCompatParcelizer
            o.ReviewInfo r5 = r5.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r5 = r5.getRemoteActionCompatParcelizer()
            r0.IconCompatParcelizer = r6
            r0.read = r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r5 = r4.AudioAttributesCompatParcelizer(r5, r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            r0 = r6
            r6 = r5
            r5 = r2
        L5d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 6
            r2 = 0
            o.r r5 = kotlin.C0195r.read(r5, r6, r2, r2, r1)
            r0.write(r5)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplBaseParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi21Parcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatSearchResultReceiver
            if (r0 == 0) goto L14
            r0 = r13
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatSearchResultReceiver r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatSearchResultReceiver) r0
            int r1 = r0.MediaBrowserCompatItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.MediaBrowserCompatItemReceiver
            int r13 = r13 + r2
            r0.MediaBrowserCompatItemReceiver = r13
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatSearchResultReceiver r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaBrowserCompatSearchResultReceiver
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.MediaBrowserCompatItemReceiver
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            int r12 = r0.RemoteActionCompatParcelizer
            int r12 = r0.IconCompatParcelizer
            boolean r12 = r0.read
            java.lang.Object r12 = r0.write
            o.r r12 = (kotlin.C0195r) r12
            java.lang.Object r0 = r0.AudioAttributesCompatParcelizer
            o.getResolutionSize r0 = (kotlin.getResolutionSize) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L91
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L55
        L48:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            o.lambdanewSingleThreadScheduledExecutor4 r13 = r12.AudioAttributesCompatParcelizer
            r0.MediaBrowserCompatItemReceiver = r4
            java.lang.Object r13 = r13.read(r0)
            if (r13 == r1) goto Laa
        L55:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            o.getResolutionSize<o.getTasksClient> r2 = r12.MediaBrowserCompatItemReceiver
            java.lang.Object r6 = r2.IconCompatParcelizer()
            o.getTasksClient r6 = (kotlin.getTasksClient) r6
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r7 = r13
            o.getTasksClient r6 = kotlin.getTasksClient.IconCompatParcelizer(r6, r7, r8, r9, r10, r11)
            r2.write(r6)
            o.getResolutionSize<o.r> r2 = r12.MediaDescriptionCompat
            java.lang.Object r6 = r2.IconCompatParcelizer()
            o.r r6 = (kotlin.C0195r) r6
            if (r13 == 0) goto L9c
            o.lambdanewSingleThreadScheduledExecutor4 r12 = r12.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r6
            r0.read = r13
            r0.IconCompatParcelizer = r5
            r0.RemoteActionCompatParcelizer = r5
            r0.MediaBrowserCompatItemReceiver = r3
            java.lang.Object r13 = r12.AudioAttributesCompatParcelizer(r0)
            if (r13 != r1) goto L8f
            goto Laa
        L8f:
            r0 = r2
            r12 = r6
        L91:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L9a
            goto L9f
        L9a:
            r6 = r12
            r2 = r0
        L9c:
            r0 = r2
            r4 = r5
            r12 = r6
        L9f:
            r13 = 3
            o.r r12 = kotlin.C0195r.read(r12, r5, r5, r4, r13)
            r0.write(r12)
            o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
            return r12
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplApi21Parcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List<String> listAudioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = VideoLessonListViewModel.this.IconCompatParcelizer(this);
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
                VideoLessonListViewModel.this.onCustomAction.write(new getClientBWLJW6A.MediaBrowserCompatItemReceiver(new setErrorTextColor(listAudioAttributesCompatParcelizer)));
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.bb
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListViewModel.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(VideoLessonListViewModel videoLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLessonListViewModel.onPlayFromMediaId.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.setLogStackTraces> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.RemoteActionCompatParcelizer
            int r5 = r5 + r2
            r0.RemoteActionCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.LogLogLevel r5 = r4.write
            r0.RemoteActionCompatParcelizer = r3
            java.lang.String r2 = "content_change_lesson_list"
            java.lang.Object r5 = r5.IconCompatParcelizer(r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            o.setLogStackTraces r5 = (kotlin.setLogStackTraces) r5
            if (r5 == 0) goto L57
            java.util.List r0 = r5.IconCompatParcelizer()
            o.ReviewInfo r4 = r4.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r4 = r4.getRemoteActionCompatParcelizer()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L57
            return r5
        L57:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaDescriptionCompat
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaDescriptionCompat r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaDescriptionCompat) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaDescriptionCompat r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$MediaDescriptionCompat
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r6 = r0.IconCompatParcelizer
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.ReviewManagerFactory r6 = (kotlin.ReviewManagerFactory) r6
            java.lang.Object r0 = r0.write
            o.getResolutionSize r0 = (kotlin.getResolutionSize) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L62
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getResolutionSize<o.ReviewManagerFactory> r7 = r6.AudioAttributesImplBaseParcelizer
            java.lang.Object r2 = r7.IconCompatParcelizer()
            o.ReviewManagerFactory r2 = (kotlin.ReviewManagerFactory) r2
            o.lambdanewSingleThreadScheduledExecutor4 r5 = r6.AudioAttributesCompatParcelizer
            o.ReviewInfo r6 = r6.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r6 = r6.getRemoteActionCompatParcelizer()
            r0.write = r7
            r0.RemoteActionCompatParcelizer = r2
            r0.IconCompatParcelizer = r3
            r0.read = r4
            java.lang.Object r6 = r5.MediaBrowserCompatSearchResultReceiver(r6, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r0 = r7
            r7 = r6
            r6 = r2
        L62:
            java.util.List r7 = (java.util.List) r7
            o.ReviewManagerFactory r6 = kotlin.ReviewManagerFactory.AudioAttributesCompatParcelizer(r6, r3, r7, r4)
            r0.write(r6)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.MediaBrowserCompatItemReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        if (this.MediaMetadataCompat.IconCompatParcelizer().getIconCompatParcelizer()) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.bc
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return VideoLessonListViewModel.AudioAttributesImplApi26Parcelizer(this.read, (String) obj2);
                }
            });
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e9 A[PHI: r15
          0x00e9: PHI (r15v12 java.lang.Object) = (r15v11 java.lang.Object), (r15v0 java.lang.Object) binds: [B:19:0x00e7, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 662
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(VideoLessonListViewModel videoLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLessonListViewModel.onPlayFromMediaId.write(str);
        getResolutionSize<t> getresolutionsize = videoLessonListViewModel.MediaMetadataCompat;
        getresolutionsize.write(t.read(getresolutionsize.IconCompatParcelizer(), null, videoLessonListViewModel.MediaBrowserCompatCustomActionResultReceiver.getRead(), false, false, false, 0, 57));
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
        
            if (r4 != r1) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0266  */
        /* JADX WARN: Type inference failed for: r7v18, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v28, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
        /* JADX WARN: Type inference failed for: r7v36, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
        /* JADX WARN: Type inference failed for: r7v40, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
        /* JADX WARN: Type inference failed for: r8v17, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
        /* JADX WARN: Type inference failed for: r8v19, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01ea -> B:29:0x025c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0234 -> B:28:0x023e). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            /*
                Method dump skipped, instruction units count: 670
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.bd
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListViewModel.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(VideoLessonListViewModel videoLessonListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoLessonListViewModel.onPlayFromMediaId.write(str);
        getResolutionSize<t> getresolutionsize = videoLessonListViewModel.onAddQueueItem;
        getresolutionsize.write(t.read(getresolutionsize.IconCompatParcelizer(), null, "New videos", false, false, false, 0, 57));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0318 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r10v15, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r10v19, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r10v25, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, o.isTrafficRestricted$AudioAttributesImplApi26Parcelizer] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x029b -> B:64:0x030e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02d7 -> B:63:0x02e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super java.util.List<? extends kotlin.isTrafficRestricted>> r70) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.write(o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ List<isTrafficRestricted.AudioAttributesImplApi26Parcelizer> IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4 = VideoLessonListViewModel.this.AudioAttributesCompatParcelizer;
                String remoteActionCompatParcelizer = VideoLessonListViewModel.this.MediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer();
                List<isTrafficRestricted.AudioAttributesImplApi26Parcelizer> list = this.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) it.next()).getAudioAttributesImplApi21Parcelizer());
                }
                this.read = 1;
                if (lambdanewsinglethreadscheduledexecutor4.IconCompatParcelizer(remoteActionCompatParcelizer, arrayList, this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatMediaItem(List<isTrafficRestricted.AudioAttributesImplApi26Parcelizer> list, SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoLessonListViewModel.this.new MediaBrowserCompatMediaItem(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(List<isTrafficRestricted.AudioAttributesImplApi26Parcelizer> p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.bf
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoLessonListViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.isTrafficRestricted> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesImplBaseParcelizer r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.write
            int r5 = r5 + r2
            r0.write = r5
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesImplBaseParcelizer r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$AudioAttributesImplBaseParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.lambdanewSingleThreadScheduledExecutor4 r5 = r4.AudioAttributesCompatParcelizer
            o.ReviewInfo r4 = r4.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r4 = r4.getRemoteActionCompatParcelizer()
            r0.write = r3
            java.lang.Object r5 = r5.AudioAttributesImplApi26Parcelizer(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            if (r4 <= 0) goto L56
            o.isTrafficRestricted$IconCompatParcelizer r5 = new o.isTrafficRestricted$IconCompatParcelizer
            r5.<init>(r4)
            o.isTrafficRestricted r5 = (kotlin.isTrafficRestricted) r5
            return r5
        L56:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r13, kotlin.SampleVideos<? super kotlin.isTrafficRestricted> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.write
            if (r0 == 0) goto L14
            r0 = r14
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$write r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.read
            int r14 = r14 + r2
            r0.read = r14
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$write r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$write
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L45
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            o.lambdanewSingleThreadScheduledExecutor4 r12 = r12.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r4
            r0.read = r3
            java.lang.Object r14 = r12.write(r13, r0)
            if (r14 != r1) goto L45
            return r1
        L45:
            o.removeSpan r14 = (kotlin.removeSpan) r14
            if (r14 == 0) goto L62
            java.lang.String r6 = r14.getAudioAttributesCompatParcelizer()
            java.lang.String r7 = r14.getRemoteActionCompatParcelizer()
            java.lang.String r8 = r14.getWrite()
            o.isTrafficRestricted$AudioAttributesCompatParcelizer r12 = new o.isTrafficRestricted$AudioAttributesCompatParcelizer
            r9 = 0
            r10 = 8
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            o.isTrafficRestricted r12 = (kotlin.isTrafficRestricted) r12
            return r12
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.write(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r10, kotlin.SampleVideos<? super kotlin.isTrafficRestricted> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r11
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.RemoteActionCompatParcelizer
            int r11 = r11 + r2
            r0.RemoteActionCompatParcelizer = r11
            goto L19
        L14:
            com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.video.lesson_list.VideoLessonListViewModel$RemoteActionCompatParcelizer
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L44
            if (r2 == r3) goto L3c
            if (r2 != r4) goto L34
            int r10 = r0.IconCompatParcelizer
            java.lang.Object r0 = r0.read
            java.lang.String r0 = (java.lang.String) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            r5 = r10
            goto L6c
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r10 = r0.read
            java.lang.String r10 = (java.lang.String) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L53
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            o.lambdanewSingleThreadScheduledExecutor4 r11 = r9.AudioAttributesCompatParcelizer
            r0.read = r10
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r11 = r11.AudioAttributesCompatParcelizer(r10, r4, r0)
            if (r11 == r1) goto L88
        L53:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            o.lambdanewSingleThreadScheduledExecutor4 r2 = r9.AudioAttributesCompatParcelizer
            r3 = 0
            r0.read = r3
            r0.IconCompatParcelizer = r11
            r0.RemoteActionCompatParcelizer = r4
            r3 = -1
            java.lang.Object r10 = r2.AudioAttributesCompatParcelizer(r10, r3, r0)
            if (r10 != r1) goto L6a
            goto L88
        L6a:
            r5 = r11
            r11 = r10
        L6c:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            o.getResolutionSize<o.getTasksClient> r9 = r9.MediaBrowserCompatItemReceiver
            java.lang.Object r9 = r9.IconCompatParcelizer()
            o.getTasksClient r9 = (kotlin.getTasksClient) r9
            boolean r6 = r9.getAudioAttributesCompatParcelizer()
            o.isTrafficRestricted$AudioAttributesImplBaseParcelizer r9 = new o.isTrafficRestricted$AudioAttributesImplBaseParcelizer
            r3 = 0
            r7 = 1
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.lesson_list.VideoLessonListViewModel.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        getResolutionSize<List<registerEvent>> getresolutionsize = this.MediaBrowserCompatMediaItem;
        List<isTrafficRestricted> listRemoteActionCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer().RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRemoteActionCompatParcelizer) {
            if (obj instanceof isTrafficRestricted.read) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(isTv.RemoteActionCompatParcelizer((isTrafficRestricted.read) it.next()));
        }
        getresolutionsize.write(arrayList3);
    }

    private final void write(int p0) {
        if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().getWrite() != p0) {
            this.AudioAttributesImplBaseParcelizer.write(ReviewManagerFactory.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(), p0, null, 2));
            MediaDescriptionCompat();
        }
    }
}
