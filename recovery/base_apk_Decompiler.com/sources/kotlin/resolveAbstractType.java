package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00078\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R*\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R*\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001e\u0010\u0014R*\u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u001b\u0010\u0014R*\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b!\u0010\u0014R*\u0010\u0017\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\"8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b!\u0010$\"\u0004\b\u0011\u0010%R*\u0010(\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\"8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b'\u0010$\"\u0004\b\u0017\u0010%R*\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0017\u0010\u0014R*\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b\b\u0010\u0014R*\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b(\u0010\u0012\"\u0004\b(\u0010\u0014R*\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u0011\u0010\u0014R*\u0010!\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b\u001c\u0010$\"\u0004\b\b\u0010%R*\u0010\u0018\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020+8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u0019\u00100R*\u0010 \u001a\u0002012\u0006\u0010\u000e\u001a\u0002018\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\b\u000f\u00103\"\u0004\b\u0015\u00104R*\u00107\u001a\u0002052\u0006\u0010\u000e\u001a\u0002058\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0015\u00106R\"\u0010\u000f\u001a\u0002088\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b7\u0010#\u001a\u0004\b\b\u0010$\"\u0004\b\u001c\u0010%R\"\u0010\u0016\u001a\u0002098\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010:\u001a\u0004\b,\u0010;\"\u0004\b\u001a\u0010<R\"\u0010,\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010>\u001a\u0004\b \u0010?\"\u0004\b\u0015\u0010@R\u0014\u0010\n\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010&\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R.\u0010*\u001a\u0004\u0018\u00010A2\b\u0010\u000e\u001a\u0004\u0018\u00010A8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010B\u001a\u0004\b&\u0010C\"\u0004\b\u0015\u0010DR.\u0010\u001d\u001a\u0004\u0018\u00010E2\b\u0010\u000e\u001a\u0004\u0018\u00010E8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b(\u0010F\u001a\u0004\b7\u0010G\"\u0004\b\u001f\u0010HR*\u0010.\u001a\u00020I2\u0006\u0010\u000e\u001a\u00020I8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u00106R\u001e\u0010\u0005\u001a\u0004\u0018\u00010J8\u0001@\u0001X\u0081\f¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\b*\u0010L"}, d2 = {"Lo/resolveAbstractType;", "Lo/validateAppend;", "<init>", "()V", "", "onPlayFromUri", "onPrepareFromSearch", "", "MediaBrowserCompatCustomActionResultReceiver", "I", "onMediaButtonEvent", "()I", "RemoteActionCompatParcelizer", "", "p0", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "F", "AudioAttributesImplApi21Parcelizer", "()F", "MediaBrowserCompatSearchResultReceiver", "(F)V", "IconCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplApi26Parcelizer", "MediaDescriptionCompat", "write", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "onFastForward", "MediaBrowserCompatMediaItem", "read", "onAddQueueItem", "RatingCompat", "Lo/switchToNext;", "J", "()J", "(J)V", "onPause", "onPlayFromSearch", "AudioAttributesImplBaseParcelizer", "Lo/findCreatorAnnotation;", "onPlayFromMediaId", "Lo/findAndAddVirtualProperties;", "onCustomAction", "Lo/findAndAddVirtualProperties;", "onPlay", "()Lo/findAndAddVirtualProperties;", "(Lo/findAndAddVirtualProperties;)V", "", "Z", "()Z", "(Z)V", "Lo/Separators;", "(I)V", "onCommand", "Lo/calloc;", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "Lo/tryToResolveUnresolved;", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "(Lo/tryToResolveUnresolved;)V", "Lo/parseVersionPart;", "Lo/parseVersionPart;", "()Lo/parseVersionPart;", "(Lo/parseVersionPart;)V", "Lo/switchAndReturnNext;", "Lo/switchAndReturnNext;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "Lo/createInstance;", "Lo/resetWithString;", "Lo/resetWithString;", "()Lo/resetWithString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resolveAbstractType implements validateAppend {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private switchAndReturnNext onFastForward;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private float MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private float MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private parseVersionPart onPlayFromMediaId;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private resetWithString onPlayFromUri;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private float read;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private float IconCompatParcelizer = 1.0f;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private float write = 1.0f;
    private float AudioAttributesCompatParcelizer = 1.0f;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer = contentsAsArray.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private long AudioAttributesImplBaseParcelizer = contentsAsArray.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float MediaBrowserCompatMediaItem = 8.0f;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private long RatingCompat = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private findAndAddVirtualProperties MediaDescriptionCompat = parseVersion.read();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int onCommand = Separators.INSTANCE.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = calloc.INSTANCE.IconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private bufferMapProperty handleMediaPlayPauseIfPendingOnHandler = bufferAnyProperty.IconCompatParcelizer$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private tryToResolveUnresolved onCustomAction = tryToResolveUnresolved.write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int onPlay = createInstance.INSTANCE.onPrepare();

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.validateAppend
    public final void MediaBrowserCompatSearchResultReceiver(float f) {
        if (this.IconCompatParcelizer == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 1;
        this.IconCompatParcelizer = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    @Override // kotlin.validateAppend
    public final void MediaDescriptionCompat(float f) {
        if (this.write == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 2;
        this.write = f;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.validateAppend
    public final void MediaBrowserCompatItemReceiver(float f) {
        if (this.AudioAttributesCompatParcelizer == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 4;
        this.AudioAttributesCompatParcelizer = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    @Override // kotlin.validateAppend
    public final void MediaBrowserCompatMediaItem(float f) {
        if (this.read == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 8;
        this.read = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final float getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.validateAppend
    public final void MediaMetadataCompat(float f) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 16;
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final float getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.validateAppend
    public final void RatingCompat(float f) {
        if (this.MediaBrowserCompatItemReceiver == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 32;
        this.MediaBrowserCompatItemReceiver = f;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.validateAppend
    public final void AudioAttributesImplApi21Parcelizer(long j) {
        if (switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, j)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 64;
        this.AudioAttributesImplApi26Parcelizer = j;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.validateAppend
    public final void AudioAttributesImplApi26Parcelizer(long j) {
        if (switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, j)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 128;
        this.AudioAttributesImplBaseParcelizer = j;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.validateAppend
    public final void AudioAttributesImplApi26Parcelizer(float f) {
        if (this.AudioAttributesImplApi21Parcelizer == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 256;
        this.AudioAttributesImplApi21Parcelizer = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.validateAppend
    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        if (this.MediaBrowserCompatSearchResultReceiver == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 512;
        this.MediaBrowserCompatSearchResultReceiver = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.validateAppend
    public final void AudioAttributesImplBaseParcelizer(float f) {
        if (this.MediaMetadataCompat == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 1024;
        this.MediaMetadataCompat = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.validateAppend
    public final void AudioAttributesImplApi21Parcelizer(float f) {
        if (this.MediaBrowserCompatMediaItem == f) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 2048;
        this.MediaBrowserCompatMediaItem = f;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    @Override // kotlin.validateAppend
    public final void MediaBrowserCompatCustomActionResultReceiver(long j) {
        if (findCreatorAnnotation.IconCompatParcelizer(this.RatingCompat, j)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 4096;
        this.RatingCompat = j;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final findAndAddVirtualProperties getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.validateAppend
    public final void write(findAndAddVirtualProperties findandaddvirtualproperties) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, findandaddvirtualproperties)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 8192;
        this.MediaDescriptionCompat = findandaddvirtualproperties;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.validateAppend
    public final void IconCompatParcelizer(boolean z) {
        if (this.onAddQueueItem != z) {
            this.RemoteActionCompatParcelizer |= 16384;
            this.onAddQueueItem = z;
        }
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    @Override // kotlin.validateAppend
    public final void IconCompatParcelizer(int i) {
        if (Separators.RemoteActionCompatParcelizer(this.onCommand, i)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 32768;
        this.onCommand = i;
    }

    @Override // kotlin.validateAppend
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final long getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void MediaBrowserCompatItemReceiver(long j) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j;
    }

    public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
        this.handleMediaPlayPauseIfPendingOnHandler = buffermapproperty;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final bufferMapProperty getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void IconCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
        this.onCustomAction = trytoresolveunresolved;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final tryToResolveUnresolved getOnCustomAction() {
        return this.onCustomAction;
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        return this.handleMediaPlayPauseIfPendingOnHandler.getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final float getIconCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler.getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final parseVersionPart getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    @Override // kotlin.validateAppend
    public final void IconCompatParcelizer(parseVersionPart parseversionpart) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromMediaId, parseversionpart)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 131072;
        this.onPlayFromMediaId = parseversionpart;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final switchAndReturnNext getOnFastForward() {
        return this.onFastForward;
    }

    @Override // kotlin.validateAppend
    public final void read(switchAndReturnNext switchandreturnnext) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onFastForward, switchandreturnnext)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 262144;
        this.onFastForward = switchandreturnnext;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    @Override // kotlin.validateAppend
    public final void write(int i) {
        if (createInstance.IconCompatParcelizer(this.onPlay, i)) {
            return;
        }
        this.RemoteActionCompatParcelizer |= 524288;
        this.onPlay = i;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final resetWithString getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    public final void onPlayFromUri() {
        MediaBrowserCompatSearchResultReceiver(1.0f);
        MediaDescriptionCompat(1.0f);
        MediaBrowserCompatItemReceiver(1.0f);
        MediaBrowserCompatMediaItem(BitmapDescriptorFactory.HUE_RED);
        MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED);
        RatingCompat(BitmapDescriptorFactory.HUE_RED);
        AudioAttributesImplApi21Parcelizer(contentsAsArray.AudioAttributesCompatParcelizer());
        AudioAttributesImplApi26Parcelizer(contentsAsArray.AudioAttributesCompatParcelizer());
        AudioAttributesImplApi26Parcelizer(BitmapDescriptorFactory.HUE_RED);
        MediaBrowserCompatCustomActionResultReceiver(BitmapDescriptorFactory.HUE_RED);
        AudioAttributesImplBaseParcelizer(BitmapDescriptorFactory.HUE_RED);
        AudioAttributesImplApi21Parcelizer(8.0f);
        MediaBrowserCompatCustomActionResultReceiver(findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer());
        write(parseVersion.read());
        IconCompatParcelizer(false);
        IconCompatParcelizer((parseVersionPart) null);
        read((switchAndReturnNext) null);
        write(createInstance.INSTANCE.onPrepare());
        IconCompatParcelizer(Separators.INSTANCE.AudioAttributesCompatParcelizer());
        MediaBrowserCompatItemReceiver(calloc.INSTANCE.IconCompatParcelizer());
        this.onPlayFromUri = null;
        this.RemoteActionCompatParcelizer = 0;
    }

    public final void onPrepareFromSearch() {
        this.onPlayFromUri = getMediaDescriptionCompat().write(getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler);
    }
}
