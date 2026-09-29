package com.marrow2.ui.main.viewmodel;

import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel;
import dagger.Lazy;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.BitmapTeleporter;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataBufferIterator;
import kotlin.DataBufferObserver;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getLastName;
import kotlin.getLocaleLanguageTagV21;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.peekChar;
import kotlin.readSynchSafeInt;
import kotlin.readTimestamp;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0017H\u0082@¢\u0006\u0004\b \u0010\u0019J\u0010\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b\"\u0010\u0019J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020!H\u0082@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b$\u0010\u0019J \u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%H\u0082@¢\u0006\u0004\b\u001b\u0010&J\u0010\u0010'\u001a\u00020!H\u0082@¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010\u001f\u001a\u00020!H\u0082@¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010\u001b\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020(H\u0082@¢\u0006\u0004\b\u001b\u0010)J\u0010\u0010\u001b\u001a\u00020!H\u0082@¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001b\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020*H\u0082@¢\u0006\u0004\b\u001b\u0010+J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%H\u0082@¢\u0006\u0004\b\u0018\u0010&J\u0010\u0010,\u001a\u00020!H\u0082@¢\u0006\u0004\b,\u0010\u0019J\u0010\u0010\u001d\u001a\u00020!H\u0082@¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010:R\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010;R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010>R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020=0?8\u0007¢\u0006\f\n\u0004\b9\u0010@\u001a\u0004\b,\u0010AR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010DR \u00101\u001a\b\u0012\u0004\u0012\u00020C0E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010F\u001a\u0004\b\u0018\u0010GR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020!0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020!0?8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u001c\u0010M\u001a\u00020I8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b \u0010LR\u001e\u0010J\u001a\u0004\u0018\u00010I8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\b9\u0010LR\u001c\u0010-\u001a\u00020!8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001f\u0010N\u001a\u0004\b$\u0010O"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/HomeBlockingActivityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/readTimestamp;", "p1", "Lo/readSynchSafeInt;", "p2", "Lo/LogLogLevel;", "p3", "Lo/peekChar;", "p4", "Lcom/marrow/TrainingApplication;", "p5", "Ldagger/Lazy;", "Lo/BandwidthMeterEventListenerEventDispatcherHandlerAndListener;", "p6", "Lo/getPlatform;", "p7", "Lo/isSeekPending;", "p8", "<init>", "(Lo/getDisplaySizeV17;Lo/readTimestamp;Lo/readSynchSafeInt;Lo/LogLogLevel;Lo/peekChar;Lcom/marrow/TrainingApplication;Ldagger/Lazy;Lo/getPlatform;Lo/isSeekPending;)V", "", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/BitmapTeleporter;", "write", "(Lo/BitmapTeleporter;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "(ZLo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "", "(IILo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow/data/api/models/response/plan/RenewEligible;", "(Lcom/marrow/data/api/models/response/plan/RenewEligible;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getLocaleLanguageTagV21;", "(Lo/getLocaleLanguageTagV21;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getDisplaySizeV17;", "MediaDescriptionCompat", "Lo/readTimestamp;", "MediaBrowserCompatSearchResultReceiver", "Lo/readSynchSafeInt;", "Lo/LogLogLevel;", "RatingCompat", "Lo/peekChar;", "Lcom/marrow/TrainingApplication;", "MediaBrowserCompatMediaItem", "Ldagger/Lazy;", "AudioAttributesImplApi21Parcelizer", "Lo/getPlatform;", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/DataBufferIterator;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/DataBufferObserver;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "MediaMetadataCompat", "", "onAddQueueItem", "Ljava/lang/String;", "()Ljava/lang/String;", "onCommand", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeBlockingActivityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TrainingApplication MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataBufferIterator> RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<DataBufferObserver> MediaBrowserCompatSearchResultReceiver;
    private final getPlatform AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final LogLogLevel write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Lazy<BandwidthMeterEventListenerEventDispatcherHandlerAndListener> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final readSynchSafeInt AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final readTimestamp IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final peekChar read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataBufferIterator> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final getDisplaySizeV17 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String onCommand;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private String onAddQueueItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<DataBufferObserver> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaMetadataCompat;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        long IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        long read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.IconCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.MediaBrowserCompatItemReceiver(this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        int read;
        /* synthetic */ Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.read(this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        int write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.RemoteActionCompatParcelizer(false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.write(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.MediaBrowserCompatCustomActionResultReceiver(this);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.AudioAttributesImplApi26Parcelizer(this);
        }
    }

    static final class MediaDescriptionCompat extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.MediaBrowserCompatItemReceiver(HomeBlockingActivityViewModel.this, this);
        }
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        handleMediaPlayPauseIfPendingOnHandler(SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.AudioAttributesImplBaseParcelizer(this);
        }
    }

    static final class onCustomAction extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.write(0, 0, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.this.write((getLocaleLanguageTagV21) null, this);
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeBlockingActivityViewModel.RemoteActionCompatParcelizer(HomeBlockingActivityViewModel.this, this);
        }
    }

    @setSdkPayload
    public HomeBlockingActivityViewModel(getDisplaySizeV17 getdisplaysizev17, readTimestamp readtimestamp, readSynchSafeInt readsynchsafeint, LogLogLevel logLogLevel, peekChar peekchar, TrainingApplication trainingApplication, Lazy<BandwidthMeterEventListenerEventDispatcherHandlerAndListener> lazy, getPlatform getplatform, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(readsynchsafeint, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(trainingApplication, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = getdisplaysizev17;
        this.IconCompatParcelizer = readtimestamp;
        this.AudioAttributesCompatParcelizer = readsynchsafeint;
        this.write = logLogLevel;
        this.read = peekchar;
        this.MediaBrowserCompatItemReceiver = trainingApplication;
        this.AudioAttributesImplApi21Parcelizer = lazy;
        this.AudioAttributesImplBaseParcelizer = getplatform;
        this.MediaBrowserCompatCustomActionResultReceiver = isseekpending;
        getResolutionSize<DataBufferIterator> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(DataBufferIterator.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<DataBufferObserver> fromcursor = getLastName.read(0, null, 7);
        this.MediaBrowserCompatMediaItem = fromcursor;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        this.onCommand = "";
        write(BitmapTeleporter.read.INSTANCE);
    }

    public static final /* synthetic */ Object MediaBrowserCompatItemReceiver(HomeBlockingActivityViewModel homeBlockingActivityViewModel, SampleVideos sampleVideos) {
        return homeBlockingActivityViewModel.write((RenewEligible) null, (SampleVideos<? super Boolean>) sampleVideos);
    }

    public static final /* synthetic */ Object RemoteActionCompatParcelizer(HomeBlockingActivityViewModel homeBlockingActivityViewModel, SampleVideos sampleVideos) {
        return homeBlockingActivityViewModel.read(0, 0, sampleVideos);
    }

    public final setUpdatedStatus<DataBufferIterator> IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final NewNumberOtpResendRequest<DataBufferObserver> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r5.RemoteActionCompatParcelizer(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplApi26Parcelizer r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplApi26Parcelizer r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplApi26Parcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L5b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L46
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getDisplaySizeV17 r6 = r5.RemoteActionCompatParcelizer
            r0.read = r4
            java.lang.Object r6 = r6.onRewind(r0)
            if (r6 == r1) goto L61
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5e
            o.fromCursor<o.DataBufferObserver> r5 = r5.MediaBrowserCompatMediaItem
            o.DataBufferObserver$MediaBrowserCompatCustomActionResultReceiver r6 = o.DataBufferObserver.MediaBrowserCompatCustomActionResultReceiver.INSTANCE
            r0.read = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r6, r0)
            if (r5 != r1) goto L5b
            goto L61
        L5b:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L5e:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.read(o.SampleVideos):java.lang.Object");
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ HomeBlockingActivityViewModel IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ BitmapTeleporter read;

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        
            if (r1.RemoteActionCompatParcelizer(new o.DataBufferObserver.RemoteActionCompatParcelizer(((kotlin.getLocaleLanguageTagV21) r5).RatingCompat()), r4) == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
        
            if (r4.IconCompatParcelizer.AudioAttributesCompatParcelizer(r4) == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new o.DataBufferObserver.write("https://www.marrow.com/home/privacy-policy", "Privacy Policy"), r4) != r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new o.DataBufferObserver.write("https://www.marrow.com/home/terms", "Terms & Conditions"), r4) != r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
        
            if (r5 == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01cc, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(o.DataBufferObserver.AudioAttributesImplBaseParcelizer.INSTANCE, r4) == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01e9, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatItemReceiver(r4) == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0207, code lost:
        
            if (r4.IconCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(o.DataBufferObserver.AudioAttributesCompatParcelizer.INSTANCE, r4) != r0) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0225, code lost:
        
            if (r4.IconCompatParcelizer.RemoteActionCompatParcelizer(((o.BitmapTeleporter.MediaBrowserCompatItemReceiver) r4.read).RemoteActionCompatParcelizer(), r4) == r0) goto L83;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.RatingCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(BitmapTeleporter bitmapTeleporter, HomeBlockingActivityViewModel homeBlockingActivityViewModel, SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
            this.read = bitmapTeleporter;
            this.IconCompatParcelizer = homeBlockingActivityViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RatingCompat(this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void write(BitmapTeleporter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.getLong
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeBlockingActivityViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r4.read.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new o.DataBufferObserver.AudioAttributesImplApi21Parcelizer("Thank You"), r4) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4b
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel r5 = com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.this
                o.getDisplaySizeV17 r5 = com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplApi26Parcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.write = r3
                java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r1)
                if (r5 == r0) goto L4e
            L32:
                com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel r5 = com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.this
                o.fromCursor r5 = com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplApi21Parcelizer(r5)
                o.DataBufferObserver$AudioAttributesImplApi21Parcelizer r1 = new o.DataBufferObserver$AudioAttributesImplApi21Parcelizer
                java.lang.String r3 = "Thank You"
                r1.<init>(r3)
                r3 = r4
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4.write = r2
                java.lang.Object r4 = r5.RemoteActionCompatParcelizer(r1, r3)
                if (r4 != r0) goto L4b
                goto L4e
            L4b:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L4e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaMetadataCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeBlockingActivityViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.getByteArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeBlockingActivityViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (HomeBlockingActivityViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeBlockingActivityViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.getBoolean
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeBlockingActivityViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private boolean MediaBrowserCompatItemReceiver;
        private boolean RemoteActionCompatParcelizer;
        private int read;
        private long write;

        /* JADX WARN: Code restructure failed: missing block: B:111:0x036d, code lost:
        
            if (r15 == r0) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0208, code lost:
        
            if (r15 != r0) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0332  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0356  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01c0 A[PHI: r1 r5 r7 r15
          0x01c0: PHI (r1v19 int) = (r1v15 int), (r1v20 int) binds: [B:53:0x01be, B:16:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x01c0: PHI (r5v7 long) = (r5v6 long), (r5v9 long) binds: [B:53:0x01be, B:16:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x01c0: PHI (r7v1 o.getLocaleLanguageTagV21) = (r7v0 o.getLocaleLanguageTagV21), (r7v4 o.getLocaleLanguageTagV21) binds: [B:53:0x01be, B:16:0x00b4] A[DONT_GENERATE, DONT_INLINE]
          0x01c0: PHI (r15v32 java.lang.Object) = (r15v31 java.lang.Object), (r15v0 java.lang.Object) binds: [B:53:0x01be, B:16:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x022e A[PHI: r1 r5 r6 r7 r9 r15
          0x022e: PHI (r1v26 boolean) = (r1v23 boolean), (r1v27 boolean) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x022e: PHI (r5v16 boolean) = (r5v13 boolean), (r5v18 boolean) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x022e: PHI (r6v10 int) = (r6v7 int), (r6v11 int) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x022e: PHI (r7v10 long) = (r7v7 long), (r7v11 long) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x022e: PHI (r9v9 o.getLocaleLanguageTagV21) = (r9v5 o.getLocaleLanguageTagV21), (r9v11 o.getLocaleLanguageTagV21) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x022e: PHI (r15v45 java.lang.Object) = (r15v41 java.lang.Object), (r15v0 java.lang.Object) binds: [B:68:0x022c, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02dd  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x030e  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 932
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeBlockingActivityViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, new RemoteActionCompatParcelizer(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.IconCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$IconCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.read
            o.setLogger r0 = (kotlin.setLogger) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L74
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L4b
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.LogLogLevel r9 = r8.write
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r9 = r9.AudioAttributesImplBaseParcelizer(r0)
            if (r9 == r1) goto La6
        L4b:
            o.setLogger r9 = (kotlin.setLogger) r9
            if (r9 != 0) goto L54
            java.lang.Boolean r8 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r8
        L54:
            java.lang.String r2 = r9.read()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 == 0) goto La1
            o.getDisplaySizeV17 r2 = r8.RemoteActionCompatParcelizer
            java.lang.String r6 = r9.read()
            r0.read = r9
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r0 = r2.read(r6, r0)
            if (r0 != r1) goto L71
            goto La6
        L71:
            r7 = r0
            r0 = r9
            r9 = r7
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7d
            goto La1
        L7d:
            o.getResolutionSize<o.DataBufferIterator> r9 = r8.AudioAttributesImplApi26Parcelizer
            o.DataBufferIterator$MediaBrowserCompatSearchResultReceiver r1 = new o.DataBufferIterator$MediaBrowserCompatSearchResultReceiver
            o.setLogger$write r0 = r0.RemoteActionCompatParcelizer()
            r1.<init>(r0)
            r9.write(r1)
            o.isSeekPending r8 = r8.MediaBrowserCompatCustomActionResultReceiver
            o.SignInHubActivity r9 = kotlin.SignInHubActivity.INSTANCE
            o.getSubscriptionExpiresOn r9 = kotlin.SignInHubActivity.read()
            o.updateLoadingFinished r0 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r0)
            r8.write(r9, r0)
            java.lang.Boolean r8 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
            return r8
        La1:
            java.lang.Boolean r8 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r8
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (AudioAttributesImplBaseParcelizer(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(boolean r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplBaseParcelizer r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplBaseParcelizer r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$AudioAttributesImplBaseParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            boolean r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4c
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getDisplaySizeV17 r7 = r5.RemoteActionCompatParcelizer
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r4
            java.lang.Object r7 = r7.write(r0)
            if (r7 == r1) goto L70
        L4c:
            if (r6 == 0) goto L6d
            o.isSeekPending r7 = r5.MediaBrowserCompatCustomActionResultReceiver
            o.SignInHubActivity r2 = kotlin.SignInHubActivity.INSTANCE
            o.getSubscriptionExpiresOn r2 = kotlin.SignInHubActivity.RemoteActionCompatParcelizer()
            o.updateLoadingFinished r4 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r4 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r4)
            r7.write(r2, r4)
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r5 = r5.AudioAttributesImplBaseParcelizer(r0)
            if (r5 != r1) goto L6a
            goto L70
        L6a:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L6d:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.RemoteActionCompatParcelizer(boolean, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r14.RemoteActionCompatParcelizer(r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r13.RemoteActionCompatParcelizer(r14, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r14) throws java.lang.Exception {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.handleMediaPlayPauseIfPendingOnHandler
            if (r0 == 0) goto L14
            r0 = r14
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$handleMediaPlayPauseIfPendingOnHandler r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.handleMediaPlayPauseIfPendingOnHandler) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.RemoteActionCompatParcelizer
            int r14 = r14 + r2
            r0.RemoteActionCompatParcelizer = r14
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$handleMediaPlayPauseIfPendingOnHandler r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$handleMediaPlayPauseIfPendingOnHandler
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r13 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto La0
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)     // Catch: java.lang.Exception -> L8c
            goto La0
        L3f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)     // Catch: java.lang.Exception -> L8c
            goto L5a
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            o.getPlatform r14 = r13.AudioAttributesImplBaseParcelizer     // Catch: java.lang.Exception -> L8c
            o.CurrentQuery r14 = (kotlin.CurrentQuery) r14     // Catch: java.lang.Exception -> L8c
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$onCommand r2 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$onCommand     // Catch: java.lang.Exception -> L8c
            r2.<init>(r3)     // Catch: java.lang.Exception -> L8c
            o.MagicModuleSubmissionRequestBody r2 = (kotlin.MagicModuleSubmissionRequestBody) r2     // Catch: java.lang.Exception -> L8c
            r0.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Exception -> L8c
            java.lang.Object r14 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r14, r2, r0)     // Catch: java.lang.Exception -> L8c
            if (r14 != r1) goto L5a
            goto L9f
        L5a:
            dagger.Lazy<o.BandwidthMeterEventListenerEventDispatcherHandlerAndListener> r14 = r13.AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Exception -> L8c
            java.lang.Object r14 = r14.get()     // Catch: java.lang.Exception -> L8c
            o.BandwidthMeterEventListenerEventDispatcherHandlerAndListener r14 = (kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener) r14     // Catch: java.lang.Exception -> L8c
            java.lang.Object[] r7 = new java.lang.Object[]{r14}     // Catch: java.lang.Exception -> L8c
            int r8 = kotlin.getExamName.onRemoveQueueItem()     // Catch: java.lang.Exception -> L8c
            int r6 = kotlin.getExamName.onRemoveQueueItem()     // Catch: java.lang.Exception -> L8c
            int r12 = kotlin.getExamName.onRemoveQueueItem()     // Catch: java.lang.Exception -> L8c
            int r10 = kotlin.getExamName.onRemoveQueueItem()     // Catch: java.lang.Exception -> L8c
            r9 = 1896980334(0x71119f6e, float:7.2108904E29)
            r11 = -1896980334(0xffffffff8eee6092, float:-5.8764524E-30)
            kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L8c
            o.fromCursor<o.DataBufferObserver> r14 = r13.MediaBrowserCompatMediaItem     // Catch: java.lang.Exception -> L8c
            o.DataBufferObserver$AudioAttributesImplApi26Parcelizer r2 = o.DataBufferObserver.AudioAttributesImplApi26Parcelizer.INSTANCE     // Catch: java.lang.Exception -> L8c
            r0.RemoteActionCompatParcelizer = r5     // Catch: java.lang.Exception -> L8c
            java.lang.Object r13 = r14.RemoteActionCompatParcelizer(r2, r0)     // Catch: java.lang.Exception -> L8c
            if (r13 != r1) goto La0
            goto L9f
        L8c:
            r14 = move-exception
            boolean r2 = r14 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto La3
            o.fromCursor<o.DataBufferObserver> r13 = r13.MediaBrowserCompatMediaItem
            o.DataBufferObserver$read r14 = o.DataBufferObserver.read.INSTANCE
            r0.IconCompatParcelizer = r3
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r13 = r13.RemoteActionCompatParcelizer(r14, r0)
            if (r13 != r1) goto La0
        L9f:
            return r1
        La0:
            o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
            return r13
        La3:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplBaseParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class onCommand extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x010c, code lost:
        
            if (r6.read.read.read(r2, r1, r6) != r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[PHI: r1 r7
          0x0072: PHI (r1v4 int) = (r1v3 int), (r1v6 int) binds: [B:16:0x0070, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r7v9 java.lang.Object) = (r7v8 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0070, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c2 A[PHI: r1 r2
          0x00c2: PHI (r1v11 int) = (r1v9 int), (r1v12 int) binds: [B:25:0x00c0, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x00c2: PHI (r2v11 int) = (r2v9 int), (r2v12 int) binds: [B:25:0x00c0, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e1 A[PHI: r1 r2
          0x00e1: PHI (r1v13 int) = (r1v11 int), (r1v14 int) binds: [B:27:0x00df, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r2v13 int) = (r2v11 int), (r2v14 int) binds: [B:27:0x00df, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.onCommand.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeBlockingActivityViewModel.this.new onCommand(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r5.IconCompatParcelizer(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(int r6, int r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.onCustomAction
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$onCustomAction r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.onCustomAction) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.RemoteActionCompatParcelizer
            int r8 = r8 + r2
            r0.RemoteActionCompatParcelizer = r8
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$onCustomAction r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$onCustomAction
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r5 = r0.IconCompatParcelizer
            int r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r5 = r0.read
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L87
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            int r7 = r0.IconCompatParcelizer
            int r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r2 = r0.read
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r2 = (com.marrow2.data.user.remote.model.CourseModelV3.Companion) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Exception -> L65
            goto L5e
        L49:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r2 = com.marrow2.data.user.remote.model.CourseModelV3.INSTANCE     // Catch: java.lang.Exception -> L65
            o.peekChar r8 = r5.read     // Catch: java.lang.Exception -> L65
            r0.read = r2     // Catch: java.lang.Exception -> L65
            r0.AudioAttributesCompatParcelizer = r6     // Catch: java.lang.Exception -> L65
            r0.IconCompatParcelizer = r7     // Catch: java.lang.Exception -> L65
            r0.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Exception -> L65
            java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r0)     // Catch: java.lang.Exception -> L65
            if (r8 == r1) goto L86
        L5e:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L65
            java.lang.String r8 = r2.getCourseNameWithEdition(r8, r6, r7)     // Catch: java.lang.Exception -> L65
            goto L6c
        L65:
            r8 = move-exception
            boolean r2 = r8 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L8d
            java.lang.String r8 = ""
        L6c:
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L8a
            o.peekChar r5 = r5.read
            r2 = 0
            r0.read = r2
            r0.AudioAttributesCompatParcelizer = r6
            r0.IconCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r8, r0)
            if (r5 != r1) goto L87
        L86:
            return r1
        L87:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L8a:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L8d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write(int, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi26Parcelizer(kotlin.SampleVideos<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatMediaItem r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatMediaItem) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.IconCompatParcelizer
            int r7 = r7 + r2
            r0.IconCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatMediaItem r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatMediaItem
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            return r7
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            int r2 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L65
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4f
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.readTimestamp r7 = r6.IconCompatParcelizer
            r0.IconCompatParcelizer = r5
            java.lang.Object r7 = r7.AudioAttributesCompatParcelizer()
            if (r7 == r1) goto L7f
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L79
            int r2 = android.os.Build.VERSION.SDK_INT
            o.readTimestamp r7 = r6.IconCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r2
            r0.IconCompatParcelizer = r4
            java.lang.Object r7 = r7.MediaBrowserCompatSearchResultReceiver()
            if (r7 == r1) goto L7f
        L65:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 > r7) goto L79
            o.getDisplaySizeV17 r6 = r6.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = r6.read(r0)
            if (r6 != r1) goto L78
            goto L7f
        L78:
            return r6
        L79:
            r6 = 0
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r6)
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.AudioAttributesImplApi26Parcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        if (kotlin.setCountry.IconCompatParcelizer(100, r2) == r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: Exception -> 0x006f, TRY_ENTER, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0063, B:21:0x006b, B:38:0x00cd, B:40:0x00d1, B:36:0x00be), top: B:67:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:18:0x0063, B:21:0x006b, B:38:0x00cd, B:40:0x00d1, B:36:0x00be), top: B:67:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4 A[PHI: r1 r14
      0x00f4: PHI (r1v9 boolean) = (r1v7 boolean), (r1v14 boolean) binds: [B:30:0x009f, B:48:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r14v1 long) = (r14v0 long), (r14v2 long) binds: [B:30:0x009f, B:48:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatItemReceiver(kotlin.SampleVideos<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatItemReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(com.marrow.data.api.models.response.plan.RenewEligible r20, kotlin.SampleVideos<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write(com.marrow.data.api.models.response.plan.RenewEligible, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatCustomActionResultReceiver r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatCustomActionResultReceiver r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.AudioAttributesCompatParcelizer
            com.marrow.data.api.models.response.plan.UpgradePlanResponse r0 = (com.marrow.data.api.models.response.plan.UpgradePlanResponse) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L76
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4a
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.readSynchSafeInt r7 = r6.AudioAttributesCompatParcelizer
            r0.read = r4
            java.lang.Object r7 = r7.AudioAttributesImplBaseParcelizer(r0)
            if (r7 == r1) goto L95
        L4a:
            com.marrow.data.api.models.response.plan.UpgradePlanResponse r7 = (com.marrow.data.api.models.response.plan.UpgradePlanResponse) r7
            java.lang.Boolean r2 = r7.getShowPopup()
            java.lang.Boolean r5 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            boolean r2 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r5)
            if (r2 == 0) goto L8f
            java.lang.String r2 = r7.getId()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L8f
            int r2 = r2.length()
            if (r2 == 0) goto L8f
            o.readSynchSafeInt r2 = r6.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r0 = r2.onCommand(r0)
            if (r0 != r1) goto L75
            goto L95
        L75:
            r0 = r7
        L76:
            java.lang.String r7 = r0.getUrl()
            java.lang.String r7 = kotlin.PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(r7)
            r6.onCommand = r7
            o.getResolutionSize<o.DataBufferIterator> r6 = r6.AudioAttributesImplApi26Parcelizer
            o.DataBufferIterator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver r7 = new o.DataBufferIterator$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r7.<init>(r0)
            r6.write(r7)
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r6
        L8f:
            r6 = 0
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r6)
            return r6
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (read(r10, r11, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (kotlin.setCountry.IconCompatParcelizer(100, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (read(r10, r11, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.getLocaleLanguageTagV21 r10, kotlin.SampleVideos<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write(o.getLocaleLanguageTagV21, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object read(int r5, int r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$write r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.write) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$write r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$write
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.read
            int r4 = r0.IconCompatParcelizer
            java.lang.Object r4 = r0.write
            o.getResolutionSize r4 = (kotlin.getResolutionSize) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L66
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getResolutionSize<o.DataBufferIterator> r4 = r4.AudioAttributesImplApi26Parcelizer
            if (r5 == 0) goto L55
            if (r5 == r3) goto L4b
            o.DataBufferIterator$RemoteActionCompatParcelizer r6 = new o.DataBufferIterator$RemoteActionCompatParcelizer
            r6.<init>(r5)
            o.DataBufferIterator r6 = (kotlin.DataBufferIterator) r6
            goto L6e
        L4b:
            o.DataBufferIterator$RemoteActionCompatParcelizer r5 = new o.DataBufferIterator$RemoteActionCompatParcelizer
            r6 = 0
            r5.<init>(r6)
            r6 = r5
            o.DataBufferIterator r6 = (kotlin.DataBufferIterator) r6
            goto L6e
        L55:
            r0.write = r4
            r0.IconCompatParcelizer = r5
            r0.read = r6
            r0.AudioAttributesCompatParcelizer = r3
            r2 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r5 = kotlin.setCountry.IconCompatParcelizer(r2, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            o.DataBufferIterator$AudioAttributesImplBaseParcelizer r5 = new o.DataBufferIterator$AudioAttributesImplBaseParcelizer
            r5.<init>(r6)
            r6 = r5
            o.DataBufferIterator r6 = (kotlin.DataBufferIterator) r6
        L6e:
            r4.write(r6)
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.read(int, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatCustomActionResultReceiver(kotlin.SampleVideos<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatItemReceiver r0 = (com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatItemReceiver r0 = new com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L42
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getDisplaySizeV17 r8 = r7.RemoteActionCompatParcelizer
            r0.read = r3
            r2 = 496(0x1f0, float:6.95E-43)
            java.lang.Object r8 = r8.write(r2, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            com.marrow.data.api.models.response.VersionUpdateData r8 = (com.marrow.data.api.models.response.VersionUpdateData) r8
            r0 = 0
            if (r8 == 0) goto Lae
            int r1 = r8.mType
            if (r1 != r3) goto L5a
            o.getResolutionSize<o.DataBufferIterator> r7 = r7.AudioAttributesImplApi26Parcelizer
            o.DataBufferIterator$AudioAttributesImplApi26Parcelizer r8 = new o.DataBufferIterator$AudioAttributesImplApi26Parcelizer
            r8.<init>()
            r7.write(r8)
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r7
        L5a:
            int r1 = r8.mType
            r2 = 4
            java.lang.String r4 = ""
            if (r1 != r2) goto L7a
            o.getResolutionSize<o.DataBufferIterator> r7 = r7.AudioAttributesImplApi26Parcelizer
            java.lang.String r1 = r8.mDescription
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r4)
            java.lang.String r8 = r8.mUrl
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r4)
            o.DataBufferIterator$AudioAttributesImplApi21Parcelizer r2 = new o.DataBufferIterator$AudioAttributesImplApi21Parcelizer
            r2.<init>(r1, r8)
            r7.write(r2)
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
            return r7
        L7a:
            java.lang.String r1 = r8.mUrl
            r7.onAddQueueItem = r1
            int r1 = r8.mType
            r2 = 3
            if (r1 != r2) goto L85
            r1 = r3
            goto L86
        L85:
            r1 = r0
        L86:
            r7.handleMediaPlayPauseIfPendingOnHandler = r1
            o.getResolutionSize<o.DataBufferIterator> r7 = r7.AudioAttributesImplApi26Parcelizer
            java.lang.String r1 = r8.mDescription
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r4)
            int r5 = r8.mType
            if (r5 != r2) goto L95
            r5 = r3
            goto L96
        L95:
            r5 = r0
        L96:
            java.lang.String r6 = r8.mUrl
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r4)
            o.DataBufferIterator$RatingCompat r4 = new o.DataBufferIterator$RatingCompat
            r4.<init>(r1, r5, r6)
            r7.write(r4)
            int r7 = r8.mType
            if (r7 != r2) goto La8
            goto La9
        La8:
            r3 = r0
        La9:
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r3)
            return r7
        Lae:
            java.lang.Boolean r7 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel.MediaBrowserCompatCustomActionResultReceiver(o.SampleVideos):java.lang.Object");
    }
}
