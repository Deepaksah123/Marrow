package kotlin;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.BaseGmsClient;
import kotlin.JsonIntegerFormatVisitor;
import kotlin.Metadata;
import kotlin.StdKeySerializers;
import kotlin.checkAvailabilityAndConnect;
import kotlin.isUnsafeBaseType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0013\u0010\u001fJ\u0017\u0010\u001c\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001c\u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u001bJC\u0010(\u001a\u00020\u000f2\u001e\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0$0#2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0014\u0010\u001a\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00108\u001a\u0002058CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b-\u00107R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010\"\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010/\u001a\u00020>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR \u00103\u001a\b\u0012\u0004\u0012\u00020A0D8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b\u0016\u0010FR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0D8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b8\u0010E\u001a\u0004\b(\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010IR\u0018\u0010<\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010L"}, d2 = {"Lo/checkAvailabilityAndConnect;", "Lo/getApiFeatures;", "Landroid/content/Context;", "p0", "Lo/isValid;", "p1", "Lo/isSeekPending;", "p2", "Lo/readTimestamp;", "p3", "Lo/getPlatform;", "p4", "<init>", "(Landroid/content/Context;Lo/isValid;Lo/isSeekPending;Lo/readTimestamp;Lo/getPlatform;)V", "Lo/BaseGmsClient;", "", "onEvent", "(Lo/BaseGmsClient;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "RemoteActionCompatParcelizer", "(Z)V", "Lo/BinderWrapper;", "(Lo/BinderWrapper;)V", "AudioAttributesImplBaseParcelizer", "()V", "write", "AudioAttributesImplApi26Parcelizer", "Landroidx/media3/exoplayer/ExoPlayer;", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "Lo/ClientSettings;", "(Landroidx/media3/exoplayer/ExoPlayer;)Lo/ClientSettings;", "AudioAttributesImplApi21Parcelizer", "Lo/getSubscriptionExpiresOn;", "", "", "Lkotlin/Function1;", "Lo/setTimeToFirstByteEstimator;", "read", "(Lo/getSubscriptionExpiresOn;Lo/getAnswerMap;)V", "Landroid/content/Context;", "MediaBrowserCompatSearchResultReceiver", "Lo/isValid;", "IconCompatParcelizer", "Lo/isSeekPending;", "RatingCompat", "Lo/readTimestamp;", "Lo/getPlatform;", "Lo/TopUserCompanion;", "MediaMetadataCompat", "Lo/TopUserCompanion;", "Lo/StdKeySerializers$AudioAttributesCompatParcelizer;", "Lo/RenewEligible;", "()Lo/StdKeySerializers$AudioAttributesCompatParcelizer;", "MediaBrowserCompatItemReceiver", "onAddQueueItem", "Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "onCustomAction", "Z", "Lo/ConnectionTelemetryConfiguration;", "Lo/ConnectionTelemetryConfiguration;", "Lo/getResolutionSize;", "Lo/executorService;", "Lo/getResolutionSize;", "MediaBrowserCompatMediaItem", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaDescriptionCompat", "Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;", "Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;", "onCommand", "Lo/setPassingYear;", "Lo/setPassingYear;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class checkAvailabilityAndConnect implements getApiFeatures {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<executorService> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getPlatform AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<ExoPlayer> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private isUnsafeBaseType.AudioAttributesCompatParcelizer onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<ExoPlayer> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<executorService> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final isValid IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private setPassingYear onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final TopUserCompanion AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final readTimestamp RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private ConnectionTelemetryConfiguration RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final isSeekPending read;

    @setSdkPayload
    public checkAvailabilityAndConnect(Context context, isValid isvalid, isSeekPending isseekpending, readTimestamp readtimestamp, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(isvalid, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.write = context;
        this.IconCompatParcelizer = isvalid;
        this.read = isseekpending;
        this.RemoteActionCompatParcelizer = readtimestamp;
        this.AudioAttributesCompatParcelizer = getplatform;
        this.AudioAttributesImplBaseParcelizer = College.AudioAttributesCompatParcelizer(getplatform);
        this.MediaBrowserCompatItemReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getLocalStartServiceAction
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return checkAvailabilityAndConnect.MediaDescriptionCompat(this.write);
            }
        });
        this.MediaBrowserCompatCustomActionResultReceiver = "";
        this.AudioAttributesImplApi26Parcelizer = "";
        this.RatingCompat = new ConnectionTelemetryConfiguration(null, 0, 0L, 7, null);
        getResolutionSize<executorService> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new executorService(null, 0L, 0L, 7, null));
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<ExoPlayer> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
    }

    private final StdKeySerializers.AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return (StdKeySerializers.AudioAttributesCompatParcelizer) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StdKeySerializers.AudioAttributesCompatParcelizer MediaDescriptionCompat(checkAvailabilityAndConnect checkavailabilityandconnect) {
        return checkavailabilityandconnect.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getApiFeatures
    public final setUpdatedStatus<executorService> RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.getApiFeatures
    public final setUpdatedStatus<ExoPlayer> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.getApiFeatures
    public final void onEvent(BaseGmsClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof BaseGmsClient.write) {
            BaseGmsClient.write writeVar = (BaseGmsClient.write) p0;
            AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer(), writeVar.IconCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof BaseGmsClient.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(((BaseGmsClient.RemoteActionCompatParcelizer) p0).IconCompatParcelizer());
            return;
        }
        if (p0 instanceof BaseGmsClient.IconCompatParcelizer) {
            RemoteActionCompatParcelizer(((BaseGmsClient.IconCompatParcelizer) p0).AudioAttributesCompatParcelizer());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, BaseGmsClient.AudioAttributesCompatParcelizer.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, BaseGmsClient.read.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            write();
        }
    }

    private final void AudioAttributesCompatParcelizer(String p0, String p1, String p2) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) p0)) {
            this.AudioAttributesImplApi21Parcelizer = false;
            this.RatingCompat = new ConnectionTelemetryConfiguration(null, 0, 0L, 7, null);
        }
        this.RatingCompat = ConnectionTelemetryConfiguration.IconCompatParcelizer(this.RatingCompat, p2, 0, 0L, 6);
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        this.AudioAttributesImplApi26Parcelizer = p1;
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        if (p0) {
            if (this.MediaDescriptionCompat.IconCompatParcelizer() != null || this.MediaBrowserCompatCustomActionResultReceiver.length() <= 0) {
                return;
            }
            AudioAttributesCompatParcelizer();
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    private final void RemoteActionCompatParcelizer(BinderWrapper p0) {
        executorService executorserviceIconCompatParcelizer;
        ExoPlayer exoPlayerIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer();
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = this.RatingCompat;
        this.RatingCompat = ConnectionTelemetryConfiguration.IconCompatParcelizer(connectionTelemetryConfiguration, null, connectionTelemetryConfiguration.getRemoteActionCompatParcelizer() + 1, 0L, 5);
        getAccountOrDefault getaccountordefault = getAccountOrDefault.INSTANCE;
        Pair<String, Map<String, Object>> pairRemoteActionCompatParcelizer = getAccountOrDefault.RemoteActionCompatParcelizer(exoPlayerIconCompatParcelizer, p0, this.RatingCompat, this.MediaBrowserCompatMediaItem.IconCompatParcelizer().getWrite(), this.AudioAttributesImplApi21Parcelizer);
        this.RatingCompat = ConnectionTelemetryConfiguration.IconCompatParcelizer(this.RatingCompat, null, 0, System.currentTimeMillis(), 3);
        if (exoPlayerIconCompatParcelizer != null) {
            if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer().getWrite() == ClientSettings.read) {
                exoPlayerIconCompatParcelizer.AudioAttributesCompatParcelizer(0L);
                getResolutionSize<executorService> getresolutionsize = this.MediaBrowserCompatMediaItem;
                do {
                    executorserviceIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                } while (!getresolutionsize.AudioAttributesCompatParcelizer(executorserviceIconCompatParcelizer, executorService.IconCompatParcelizer(executorserviceIconCompatParcelizer, ClientSettings.IconCompatParcelizer, 0L, 0L, 6)));
            }
            if (exoPlayerIconCompatParcelizer.onRewind() == 1) {
                exoPlayerIconCompatParcelizer.onSkipToQueueItem();
            }
            exoPlayerIconCompatParcelizer.AudioAttributesCompatParcelizer(true);
        }
        read(pairRemoteActionCompatParcelizer, new getAnswerMap() { // from class: o.getGCoreServiceId
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(checkAvailabilityAndConnect.RemoteActionCompatParcelizer((setTimeToFirstByteEstimator) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(setTimeToFirstByteEstimator settimetofirstbyteestimator) {
        toMagicModuleMetaRepoModel.write(settimetofirstbyteestimator, "");
        return settimetofirstbyteestimator.getRead();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        ExoPlayer exoPlayerIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer();
        if (exoPlayerIconCompatParcelizer != null) {
            exoPlayerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
    }

    private final void write() {
        AudioAttributesImplApi26Parcelizer();
        College.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, null);
    }

    private final void AudioAttributesCompatParcelizer() {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitorWrite = new JsonIntegerFormatVisitor.IconCompatParcelizer().AudioAttributesCompatParcelizer().read().write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonIntegerFormatVisitorWrite, "");
        ExoPlayer exoPlayerWrite = new ExoPlayer.read(this.write).RemoteActionCompatParcelizer(IconCompatParcelizer()).RemoteActionCompatParcelizer(jsonIntegerFormatVisitorWrite).write();
        exoPlayerWrite.read(getRequiredScopes.read((!this.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplApi26Parcelizer.length() <= 0) ? this.MediaBrowserCompatCustomActionResultReceiver : this.AudioAttributesImplApi26Parcelizer));
        exoPlayerWrite.AudioAttributesCompatParcelizer(false);
        exoPlayerWrite.onSkipToQueueItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(exoPlayerWrite, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(exoPlayerWrite);
        exoPlayerWrite.read(remoteActionCompatParcelizer);
        this.onCommand = remoteActionCompatParcelizer;
        this.MediaDescriptionCompat.write(exoPlayerWrite);
    }

    public static final class RemoteActionCompatParcelizer implements isUnsafeBaseType.AudioAttributesCompatParcelizer {
        private /* synthetic */ ExoPlayer RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(ExoPlayer exoPlayer) {
            this.RemoteActionCompatParcelizer = exoPlayer;
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            Object objIconCompatParcelizer;
            Object objIconCompatParcelizer2;
            if (i == 3) {
                getResolutionSize getresolutionsize = checkAvailabilityAndConnect.this.MediaBrowserCompatMediaItem;
                ExoPlayer exoPlayer = this.RemoteActionCompatParcelizer;
                do {
                    objIconCompatParcelizer2 = getresolutionsize.IconCompatParcelizer();
                } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer2, executorService.IconCompatParcelizer((executorService) objIconCompatParcelizer2, null, 0L, getQues.write(exoPlayer.onPlayFromSearch(), 0L), 3)));
            }
            if (i == 4) {
                getResolutionSize getresolutionsize2 = checkAvailabilityAndConnect.this.MediaBrowserCompatMediaItem;
                ExoPlayer exoPlayer2 = this.RemoteActionCompatParcelizer;
                do {
                    objIconCompatParcelizer = getresolutionsize2.IconCompatParcelizer();
                } while (!getresolutionsize2.AudioAttributesCompatParcelizer(objIconCompatParcelizer, executorService.IconCompatParcelizer((executorService) objIconCompatParcelizer, null, getQues.write(exoPlayer2.onPlayFromSearch(), 0L), 0L, 5)));
            }
            checkAvailabilityAndConnect.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(boolean z, int i) {
            checkAvailabilityAndConnect.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(boolean z) {
            if (z) {
                checkAvailabilityAndConnect checkavailabilityandconnect = checkAvailabilityAndConnect.this;
                checkavailabilityandconnect.RatingCompat = ConnectionTelemetryConfiguration.IconCompatParcelizer(checkavailabilityandconnect.RatingCompat, null, 0, 0L, 5);
            }
            checkAvailabilityAndConnect.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            checkAvailabilityAndConnect.this.AudioAttributesCompatParcelizer(z);
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(validateSubClassName validatesubclassname) {
            Object objIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(validatesubclassname, "");
            boolean zWrite = withRequestHeaders.write(validatesubclassname);
            boolean z = (zWrite || checkAvailabilityAndConnect.this.AudioAttributesImplApi21Parcelizer || checkAvailabilityAndConnect.this.AudioAttributesImplApi26Parcelizer.length() <= 0) ? false : true;
            String str = checkAvailabilityAndConnect.this.AudioAttributesImplApi21Parcelizer ? checkAvailabilityAndConnect.this.AudioAttributesImplApi26Parcelizer : checkAvailabilityAndConnect.this.MediaBrowserCompatCustomActionResultReceiver;
            getAccountOrDefault getaccountordefault = getAccountOrDefault.INSTANCE;
            Pair<String, Map<String, Object>> pairIconCompatParcelizer = getAccountOrDefault.IconCompatParcelizer(validatesubclassname, str, z, zWrite, checkAvailabilityAndConnect.this.RatingCompat);
            if (z) {
                checkAvailabilityAndConnect.this.AudioAttributesImplApi21Parcelizer = true;
                getResolutionSize getresolutionsize = checkAvailabilityAndConnect.this.MediaBrowserCompatMediaItem;
                do {
                    objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, executorService.IconCompatParcelizer((executorService) objIconCompatParcelizer, ClientSettings.IconCompatParcelizer, 0L, 0L, 4)));
                this.RemoteActionCompatParcelizer.read(getRequiredScopes.read(checkAvailabilityAndConnect.this.AudioAttributesImplApi26Parcelizer));
                this.RemoteActionCompatParcelizer.onSkipToQueueItem();
            } else {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(false);
                checkAvailabilityAndConnect.this.AudioAttributesImplApi21Parcelizer();
            }
            checkAvailabilityAndConnect.this.read(pairIconCompatParcelizer, new getAnswerMap() { // from class: o.getConnectionHint
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(checkAvailabilityAndConnect.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((setTimeToFirstByteEstimator) obj));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean RemoteActionCompatParcelizer(setTimeToFirstByteEstimator settimetofirstbyteestimator) {
            toMagicModuleMetaRepoModel.write(settimetofirstbyteestimator, "");
            return settimetofirstbyteestimator.getAudioAttributesCompatParcelizer();
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        ExoPlayer exoPlayerIconCompatParcelizer;
        setPassingYear setpassingyear = this.onCustomAction;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.onCustomAction = null;
        isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onCommand;
        if (audioAttributesCompatParcelizer != null && (exoPlayerIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer()) != null) {
            exoPlayerIconCompatParcelizer.write(audioAttributesCompatParcelizer);
        }
        this.onCommand = null;
        ExoPlayer exoPlayerIconCompatParcelizer2 = this.MediaDescriptionCompat.IconCompatParcelizer();
        if (exoPlayerIconCompatParcelizer2 != null) {
            exoPlayerIconCompatParcelizer2.release();
        }
        this.MediaDescriptionCompat.write(null);
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(boolean p0) {
        setPassingYear setpassingyear = this.onCustomAction;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.onCustomAction = null;
        if (p0) {
            this.onCustomAction = C0201setMcqCount.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, null, null, new IconCompatParcelizer(null), 3);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            Object objIconCompatParcelizer2 = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            do {
                ExoPlayer exoPlayer = (ExoPlayer) checkAvailabilityAndConnect.this.MediaDescriptionCompat.IconCompatParcelizer();
                if (exoPlayer != null) {
                    getResolutionSize getresolutionsize = checkAvailabilityAndConnect.this.MediaBrowserCompatMediaItem;
                    do {
                        objIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                    } while (!getresolutionsize.AudioAttributesCompatParcelizer(objIconCompatParcelizer, executorService.IconCompatParcelizer((executorService) objIconCompatParcelizer, null, exoPlayer.onPlayFromUri(), 0L, 5)));
                }
                this.RemoteActionCompatParcelizer = 1;
            } while (setCountry.IconCompatParcelizer(250L, this) != objIconCompatParcelizer2);
            return objIconCompatParcelizer2;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return checkAvailabilityAndConnect.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(ExoPlayer p0) {
        executorService executorserviceIconCompatParcelizer;
        getResolutionSize<executorService> getresolutionsize = this.MediaBrowserCompatMediaItem;
        do {
            executorserviceIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        } while (!getresolutionsize.AudioAttributesCompatParcelizer(executorserviceIconCompatParcelizer, executorService.IconCompatParcelizer(executorserviceIconCompatParcelizer, write(p0), 0L, 0L, 6)));
    }

    private static ClientSettings write(ExoPlayer p0) {
        return p0.onRewind() == 4 ? ClientSettings.read : (p0.onRewind() == 2 && p0.onPrepareFromUri()) ? ClientSettings.IconCompatParcelizer : p0.AudioAttributesImplBaseParcelizer() ? ClientSettings.write : p0.onPlayFromUri() > 0 ? ClientSettings.AudioAttributesCompatParcelizer : ClientSettings.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        this.MediaBrowserCompatMediaItem.write(new executorService(null, 0L, 0L, 7, null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getAnswerMap<setTimeToFirstByteEstimator, Boolean> AudioAttributesCompatParcelizer;
        private /* synthetic */ checkAvailabilityAndConnect IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ Pair<String, Map<String, Object>> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getAnswerMap getanswermap;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getAnswerMap<setTimeToFirstByteEstimator, Boolean> getanswermap2 = this.AudioAttributesCompatParcelizer;
                this.read = getanswermap2;
                this.RemoteActionCompatParcelizer = 1;
                Object obj2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer.read(this);
                if (obj2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                getanswermap = getanswermap2;
                obj = obj2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getanswermap = (getAnswerMap) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (!((Boolean) getanswermap.invoke(obj)).booleanValue()) {
                return getShowPopup.INSTANCE;
            }
            this.IconCompatParcelizer.read.write(this.write, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(getAnswerMap<? super setTimeToFirstByteEstimator, Boolean> getanswermap, checkAvailabilityAndConnect checkavailabilityandconnect, Pair<String, ? extends Map<String, ? extends Object>> pair, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = getanswermap;
            this.IconCompatParcelizer = checkavailabilityandconnect;
            this.write = pair;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(Pair<String, ? extends Map<String, ? extends Object>> p0, getAnswerMap<? super setTimeToFirstByteEstimator, Boolean> p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, new AudioAttributesCompatParcelizer(p1, this, p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getGetServiceRequestExtraArgs
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return checkAvailabilityAndConnect.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
