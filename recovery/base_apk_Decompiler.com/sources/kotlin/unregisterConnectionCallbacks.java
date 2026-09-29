package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010(R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010(R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010(R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b/\u0010(R\u0014\u00100\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00107\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b)\u0010:R\u001a\u0010?\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u001a\u0010C\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\bB\u0010>R\u001a\u0010B\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\b5\u0010>R\u001a\u0010D\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b3\u0010>R\u001a\u0010F\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\bE\u0010>R\u0014\u0010.\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010<R\u001a\u0010/\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\bG\u0010>R\u001a\u00105\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bH\u0010>R\u001a\u0010=\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\b?\u0010IR\u001a\u0010H\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\b;\u0010IR\u001a\u0010@\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010J\u001a\u0004\bD\u0010&R\u0014\u0010E\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u00104R\u001a\u00101\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\b,\u0010IR\u0014\u0010-\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010JR\u001a\u00103\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010J\u001a\u0004\bC\u0010&R\u001a\u0010K\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\bA\u0010MR\u0011\u0010G\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bF\u0010>R\u0011\u0010N\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b2\u0010>"}, d2 = {"Lo/unregisterConnectionCallbacks;", "", "", "p0", "p1", "p2", "p3", "", "p4", "Lo/reconnect;", "p5", "Lo/getContextAttributionTag;", "p6", "", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "", "p18", "p19", "p20", "p21", "p22", "Lo/getTrackTypeOfCodec;", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLo/reconnect;Lo/getContextAttributionTag;ZZZZZZZZZJJIJJIILo/getTrackTypeOfCodec;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "onPause", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "RemoteActionCompatParcelizer", "onPlay", "IconCompatParcelizer", "onFastForward", "J", "onCustomAction", "Lo/reconnect;", "AudioAttributesImplBaseParcelizer", "()Lo/reconnect;", "Lo/getContextAttributionTag;", "()Lo/getContextAttributionTag;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "handleMediaPlayPauseIfPendingOnHandler", "()Z", "AudioAttributesImplApi26Parcelizer", "onAddQueueItem", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "onCommand", "MediaBrowserCompatSearchResultReceiver", "onPlayFromMediaId", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()J", "I", "onMediaButtonEvent", "Lo/getTrackTypeOfCodec;", "()Lo/getTrackTypeOfCodec;", "onPrepare"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class unregisterConnectionCallbacks {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getTrackTypeOfCodec onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int onAddQueueItem;
    private final boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final long onPlay;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int onPause;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getContextAttributionTag MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int onFastForward;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final reconnect AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final long onCommand;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;

    private unregisterConnectionCallbacks(String str, String str2, String str3, String str4, long j, reconnect reconnectVar, getContextAttributionTag getcontextattributiontag, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, int i, long j4, long j5, int i2, int i3, getTrackTypeOfCodec gettracktypeofcodec) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(reconnectVar, "");
        toMagicModuleMetaRepoModel.write(getcontextattributiontag, "");
        toMagicModuleMetaRepoModel.write(gettracktypeofcodec, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = reconnectVar;
        this.MediaBrowserCompatCustomActionResultReceiver = getcontextattributiontag;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.RatingCompat = z4;
        this.MediaMetadataCompat = z5;
        this.MediaBrowserCompatSearchResultReceiver = z6;
        this.MediaDescriptionCompat = z7;
        this.MediaBrowserCompatMediaItem = z8;
        this.onCustomAction = z9;
        this.handleMediaPlayPauseIfPendingOnHandler = j2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j3;
        this.onAddQueueItem = i;
        this.onCommand = j4;
        this.onPlay = j5;
        this.onPause = i2;
        this.onFastForward = i3;
        this.onMediaButtonEvent = gettracktypeofcodec;
    }

    public /* synthetic */ unregisterConnectionCallbacks(String str, String str2, String str3, String str4, long j, reconnect reconnectVar, getContextAttributionTag getcontextattributiontag, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, int i, long j4, long j5, int i2, int i3, getTrackTypeOfCodec gettracktypeofcodec, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) == 0 ? str4 : "", (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? reconnect.write : reconnectVar, (i4 & 64) != 0 ? getContextAttributionTag.read : getcontextattributiontag, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? false : z4, (i4 & 2048) != 0 ? false : z5, (i4 & 4096) != 0 ? false : z6, (i4 & 8192) != 0 ? false : z7, (i4 & 16384) != 0 ? true : z8, (i4 & 32768) != 0 ? false : z9, (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0L : j2, (i4 & 131072) != 0 ? 0L : j3, (i4 & 262144) != 0 ? 0 : i, (i4 & 524288) != 0 ? 0L : j4, (i4 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0L : j5, (i4 & 2097152) != 0 ? 0 : i2, (i4 & 4194304) != 0 ? 0 : i3, (i4 & 8388608) != 0 ? getTrackTypeOfCodec.write : gettracktypeofcodec);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final reconnect getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final getContextAttributionTag getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final long getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final getTrackTypeOfCodec getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem == 1;
    }

    public final boolean IconCompatParcelizer() {
        return (this.AudioAttributesImplApi26Parcelizer || this.AudioAttributesImplApi21Parcelizer) && !MediaBrowserCompatSearchResultReceiver();
    }

    public unregisterConnectionCallbacks() {
        this(null, null, null, null, 0L, null, null, false, false, false, false, false, false, false, false, false, 0L, 0L, 0, 0L, 0L, 0, 0, null, 16777215, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof unregisterConnectionCallbacks)) {
            return false;
        }
        unregisterConnectionCallbacks unregisterconnectioncallbacks = (unregisterConnectionCallbacks) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) unregisterconnectioncallbacks.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) unregisterconnectioncallbacks.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) unregisterconnectioncallbacks.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) unregisterconnectioncallbacks.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == unregisterconnectioncallbacks.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer == unregisterconnectioncallbacks.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == unregisterconnectioncallbacks.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == unregisterconnectioncallbacks.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplApi21Parcelizer == unregisterconnectioncallbacks.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == unregisterconnectioncallbacks.MediaBrowserCompatItemReceiver && this.RatingCompat == unregisterconnectioncallbacks.RatingCompat && this.MediaMetadataCompat == unregisterconnectioncallbacks.MediaMetadataCompat && this.MediaBrowserCompatSearchResultReceiver == unregisterconnectioncallbacks.MediaBrowserCompatSearchResultReceiver && this.MediaDescriptionCompat == unregisterconnectioncallbacks.MediaDescriptionCompat && this.MediaBrowserCompatMediaItem == unregisterconnectioncallbacks.MediaBrowserCompatMediaItem && this.onCustomAction == unregisterconnectioncallbacks.onCustomAction && this.handleMediaPlayPauseIfPendingOnHandler == unregisterconnectioncallbacks.handleMediaPlayPauseIfPendingOnHandler && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == unregisterconnectioncallbacks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onAddQueueItem == unregisterconnectioncallbacks.onAddQueueItem && this.onCommand == unregisterconnectioncallbacks.onCommand && this.onPlay == unregisterconnectioncallbacks.onPlay && this.onPause == unregisterconnectioncallbacks.onPause && this.onFastForward == unregisterconnectioncallbacks.onFastForward && this.onMediaButtonEvent == unregisterconnectioncallbacks.onMediaButtonEvent;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.RatingCompat)) * 31) + Boolean.hashCode(this.MediaMetadataCompat)) * 31) + Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Boolean.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Boolean.hashCode(this.onCustomAction)) * 31) + Long.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Long.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Integer.hashCode(this.onAddQueueItem)) * 31) + Long.hashCode(this.onCommand)) * 31) + Long.hashCode(this.onPlay)) * 31) + Integer.hashCode(this.onPause)) * 31) + Integer.hashCode(this.onFastForward)) * 31) + this.onMediaButtonEvent.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        String str3 = this.read;
        String str4 = this.IconCompatParcelizer;
        long j = this.RemoteActionCompatParcelizer;
        reconnect reconnectVar = this.AudioAttributesImplBaseParcelizer;
        getContextAttributionTag getcontextattributiontag = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        boolean z2 = this.AudioAttributesImplApi21Parcelizer;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        boolean z4 = this.RatingCompat;
        boolean z5 = this.MediaMetadataCompat;
        boolean z6 = this.MediaBrowserCompatSearchResultReceiver;
        boolean z7 = this.MediaDescriptionCompat;
        boolean z8 = this.MediaBrowserCompatMediaItem;
        boolean z9 = this.onCustomAction;
        long j2 = this.handleMediaPlayPauseIfPendingOnHandler;
        long j3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i = this.onAddQueueItem;
        long j4 = this.onCommand;
        long j5 = this.onPlay;
        int i2 = this.onPause;
        int i3 = this.onFastForward;
        getTrackTypeOfCodec gettracktypeofcodec = this.onMediaButtonEvent;
        StringBuilder sb = new StringBuilder("unregisterConnectionCallbacks(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", IconCompatParcelizer=");
        sb.append(str4);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(j);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(reconnectVar);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(getcontextattributiontag);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z3);
        sb.append(", RatingCompat=");
        sb.append(z4);
        sb.append(", MediaMetadataCompat=");
        sb.append(z5);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(z6);
        sb.append(", MediaDescriptionCompat=");
        sb.append(z7);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(z8);
        sb.append(", onCustomAction=");
        sb.append(z9);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(j2);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(j3);
        sb.append(", onAddQueueItem=");
        sb.append(i);
        sb.append(", onCommand=");
        sb.append(j4);
        sb.append(", onPlay=");
        sb.append(j5);
        sb.append(", onPause=");
        sb.append(i2);
        sb.append(", onFastForward=");
        sb.append(i3);
        sb.append(", onMediaButtonEvent=");
        sb.append(gettracktypeofcodec);
        sb.append(")");
        return sb.toString();
    }
}
