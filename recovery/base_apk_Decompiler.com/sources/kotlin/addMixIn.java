package kotlin;

import kotlin.Metadata;
import kotlin._assertNotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bR\u001a\u0010\u001a\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010\u000e\u001a\u00020#8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010$R\u0014\u0010\u001e\u001a\u00020#8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\"\u0010\u0016\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)\"\u0004\b \u0010*R\"\u0010(\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b+\u0010)\"\u0004\b\u001a\u0010*R\"\u0010+\u001a\u00020,8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u000e\u00100R\u0014\u00102\u001a\u00020&8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0014\u00104\u001a\u00020&8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\"\u00103\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b5\u0010)\"\u0004\b+\u0010*R\"\u0010.\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010'\u001a\u0004\b6\u0010)\"\u0004\b\u0016\u0010*R\"\u0010!\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b7\u0010)\"\u0004\b2\u0010*R\"\u0010\u0018\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010$\"\u0004\b\u000e\u0010;R\"\u0010=\u001a\u00020#8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00109\u001a\u0004\b<\u0010$\"\u0004\b \u0010;R\u0014\u00107\u001a\u00020>8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010?R\u0016\u00108\u001a\u0004\u0018\u00010>8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010?R*\u00106\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b2\u0010)\"\u0004\b\u0010\u0010*R*\u00105\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010)\"\u0004\b\u000e\u0010*R*\u00101\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020#8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00109\u001a\u0004\b\u001a\u0010$\"\u0004\b\u001a\u0010;R*\u0010<\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b=\u0010)\"\u0004\b\u001e\u0010*R*\u0010@\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010'\u001a\u0004\b8\u0010)\"\u0004\b\"\u0010*R*\u0010A\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020#8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\b \u0010$\"\u0004\b\u0010\u0010;R\u001a\u0010:\u001a\u00020B8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b4\u0010C\u001a\u0004\b@\u0010DR(\u0010\u0007\u001a\u0004\u0018\u00010E2\b\u0010\u0003\u001a\u0004\u0018\u00010E8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\bA\u0010G"}, d2 = {"Lo/addMixIn;", "", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "", "onPrepareFromMediaId", "()V", "onPrepareFromUri", "onSeekTo", "onRemoveQueueItemAt", "onRewind", "Lo/PropertyValueAny;", "IconCompatParcelizer", "(J)V", "write", "onSetCaptioningEnabled", "onPrepare", "onSetRating", "onPlayFromSearch", "onRemoveQueueItem", "AudioAttributesImplBaseParcelizer", "Lo/_assertNotNull;", "MediaDescriptionCompat", "()Lo/_assertNotNull;", "AudioAttributesCompatParcelizer", "Lo/_bindAndClose;", "onPrepareFromSearch", "()Lo/_bindAndClose;", "AudioAttributesImplApi26Parcelizer", "()Lo/PropertyValueAny;", "RemoteActionCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "read", "", "()I", "onPlayFromUri", "", "Z", "MediaBrowserCompatItemReceiver", "()Z", "(Z)V", "AudioAttributesImplApi21Parcelizer", "Lo/_assertNotNull$RemoteActionCompatParcelizer;", "Lo/_assertNotNull$RemoteActionCompatParcelizer;", "MediaMetadataCompat", "()Lo/_assertNotNull$RemoteActionCompatParcelizer;", "(Lo/_assertNotNull$RemoteActionCompatParcelizer;)V", "onPlayFromMediaId", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onCustomAction", "I", "onFastForward", "(I)V", "onPause", "onCommand", "Lo/KeyDeserializer;", "()Lo/KeyDeserializer;", "onMediaButtonEvent", "onPlay", "Lo/getSubtypeResolver;", "Lo/getSubtypeResolver;", "()Lo/getSubtypeResolver;", "Lo/setPropertyNamingStrategy;", "Lo/setPropertyNamingStrategy;", "()Lo/setPropertyNamingStrategy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addMixIn {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int onPlayFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean onPause;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final _assertNotNull AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean onMediaButtonEvent;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setPropertyNamingStrategy onPrepareFromMediaId;
    private boolean RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int onPlay;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int onCommand;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private int MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private _assertNotNull.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer = _assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getSubtypeResolver onFastForward = new getSubtypeResolver(this);

    public addMixIn(_assertNotNull _assertnotnull) {
        this.AudioAttributesCompatParcelizer = _assertnotnull;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final _assertNotNull getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final _bindAndClose onPrepareFromSearch() {
        return this.AudioAttributesCompatParcelizer.get_init_lambda2().getIconCompatParcelizer();
    }

    public final PropertyValueAny AudioAttributesImplApi26Parcelizer() {
        return this.onFastForward.MediaMetadataCompat();
    }

    public final PropertyValueAny MediaBrowserCompatSearchResultReceiver() {
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy != null) {
            return setpropertynamingstrategy.getHandleMediaPlayPauseIfPendingOnHandler();
        }
        return null;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.onFastForward.getRemoteActionCompatParcelizer();
    }

    public final int onPlayFromUri() {
        return this.onFastForward.getRead();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void IconCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final _assertNotNull.RemoteActionCompatParcelizer getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean onPlayFromMediaId() {
        return this.onFastForward.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final boolean RatingCompat() {
        return this.onFastForward.getOnMediaButtonEvent();
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.RatingCompat = z;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.MediaMetadataCompat = z;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.onCommand = i;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    public final void onPrepareFromMediaId() {
        this.onFastForward.onPlayFromSearch();
    }

    public final void onPrepareFromUri() {
        this.onFastForward.onPrepare();
    }

    public final void onSeekTo() {
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    public final void onRemoveQueueItemAt() {
        this.RatingCompat = true;
    }

    public final KeyDeserializer read() {
        return this.onFastForward;
    }

    public final KeyDeserializer MediaBrowserCompatMediaItem() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void write(boolean z) {
        if (this.handleMediaPlayPauseIfPendingOnHandler != z) {
            this.handleMediaPlayPauseIfPendingOnHandler = z;
            if (z && !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                AudioAttributesCompatParcelizer(this.onPlayFromMediaId + 1);
            } else {
                if (z || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    return;
                }
                AudioAttributesCompatParcelizer(this.onPlayFromMediaId - 1);
            }
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != z) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            if (z && !this.handleMediaPlayPauseIfPendingOnHandler) {
                AudioAttributesCompatParcelizer(this.onPlayFromMediaId + 1);
            } else {
                if (z || this.handleMediaPlayPauseIfPendingOnHandler) {
                    return;
                }
                AudioAttributesCompatParcelizer(this.onPlayFromMediaId - 1);
            }
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        int i2 = this.onPlayFromMediaId;
        this.onPlayFromMediaId = i;
        if ((i2 == 0) != (i == 0)) {
            _assertNotNull _assertnotnull_init_lambda4 = this.AudioAttributesCompatParcelizer._init_lambda4();
            addMixIn accessaddObserverForBackInvoker = _assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker() : null;
            if (accessaddObserverForBackInvoker != null) {
                if (i == 0) {
                    accessaddObserverForBackInvoker.AudioAttributesCompatParcelizer(accessaddObserverForBackInvoker.onPlayFromMediaId - 1);
                } else {
                    accessaddObserverForBackInvoker.AudioAttributesCompatParcelizer(accessaddObserverForBackInvoker.onPlayFromMediaId + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnPause() {
        return this.onPause;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        if (this.onPause != z) {
            this.onPause = z;
            if (z && !this.onMediaButtonEvent) {
                write(this.onPlay + 1);
            } else {
                if (z || this.onMediaButtonEvent) {
                    return;
                }
                write(this.onPlay - 1);
            }
        }
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final void read(boolean z) {
        if (this.onMediaButtonEvent != z) {
            this.onMediaButtonEvent = z;
            if (z && !this.onPause) {
                write(this.onPlay + 1);
            } else {
                if (z || this.onPause) {
                    return;
                }
                write(this.onPlay - 1);
            }
        }
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    public final void write(int i) {
        int i2 = this.onPlay;
        this.onPlay = i;
        if ((i2 == 0) != (i == 0)) {
            _assertNotNull _assertnotnull_init_lambda4 = this.AudioAttributesCompatParcelizer._init_lambda4();
            addMixIn accessaddObserverForBackInvoker = _assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker() : null;
            if (accessaddObserverForBackInvoker != null) {
                if (i == 0) {
                    accessaddObserverForBackInvoker.write(accessaddObserverForBackInvoker.onPlay - 1);
                } else {
                    accessaddObserverForBackInvoker.write(accessaddObserverForBackInvoker.onPlay + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final getSubtypeResolver getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final setPropertyNamingStrategy getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    public final void onRewind() {
        _assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnSkipToQueueItem = this.AudioAttributesCompatParcelizer.onSkipToQueueItem();
        if (remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.read || remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            if (this.onFastForward.getOnPrepare()) {
                write(true);
            } else {
                IconCompatParcelizer(true);
            }
        }
        if (remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
            if (setpropertynamingstrategy != null && setpropertynamingstrategy.getOnPrepare()) {
                AudioAttributesImplApi26Parcelizer(true);
            } else {
                read(true);
            }
        }
    }

    public final void IconCompatParcelizer(long p0) {
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy != null) {
            setpropertynamingstrategy.RemoteActionCompatParcelizer(p0);
        }
    }

    public final void write() {
        if (this.onPrepareFromMediaId == null) {
            this.onPrepareFromMediaId = new setPropertyNamingStrategy(this);
        }
    }

    public final void onSetCaptioningEnabled() {
        _assertNotNull _assertnotnull_init_lambda4;
        if (this.onFastForward.onRemoveQueueItem() && (_assertnotnull_init_lambda4 = this.AudioAttributesCompatParcelizer._init_lambda4()) != null) {
            _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, false, false, 7, null);
        }
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy == null || !setpropertynamingstrategy.onPrepareFromSearch()) {
            return;
        }
        if (configure.write(this.AudioAttributesCompatParcelizer)) {
            _assertNotNull _assertnotnull_init_lambda42 = this.AudioAttributesCompatParcelizer._init_lambda4();
            if (_assertnotnull_init_lambda42 != null) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda42, false, false, false, 7, null);
                return;
            }
            return;
        }
        _assertNotNull _assertnotnull_init_lambda43 = this.AudioAttributesCompatParcelizer._init_lambda4();
        if (_assertnotnull_init_lambda43 != null) {
            _assertNotNull.IconCompatParcelizer$default(_assertnotnull_init_lambda43, false, false, false, 7, null);
        }
    }

    public final void onPrepare() {
        this.onFastForward.onFastForward();
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy != null) {
            setpropertynamingstrategy.onPlay();
        }
    }

    public final void onSetRating() {
        properties propertiesVarIconCompatParcelizer;
        this.onFastForward.getOnPause().AudioAttributesImplBaseParcelizer();
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy == null || (propertiesVarIconCompatParcelizer = setpropertynamingstrategy.getOnPause()) == null) {
            return;
        }
        propertiesVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    public final void onPlayFromSearch() {
        this.onFastForward.RemoteActionCompatParcelizer(true);
        setPropertyNamingStrategy setpropertynamingstrategy = this.onPrepareFromMediaId;
        if (setpropertynamingstrategy != null) {
            setpropertynamingstrategy.AudioAttributesCompatParcelizer(true);
        }
    }

    public final void onRemoveQueueItem() {
        this.onPrepareFromMediaId = null;
        this.MediaMetadataCompat = false;
        this.RatingCompat = false;
    }
}
