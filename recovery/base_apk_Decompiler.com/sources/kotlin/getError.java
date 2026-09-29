package kotlin;

import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class getError extends restoreKeys {
    private boolean MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private write MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private IconCompatParcelizer onCommand;
    private float onCustomAction;
    private boolean onFastForward;
    private boolean onMediaButtonEvent;
    private float onPause;
    private float onPlay;
    private int onPlayFromMediaId;
    private float onPlayFromUri;

    public enum IconCompatParcelizer {
        OUTSIDE_CHART,
        /* JADX INFO: Fake field, exist only in values array */
        INSIDE_CHART
    }

    public enum write {
        LEFT,
        RIGHT
    }

    public getError() {
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.onAddQueueItem = false;
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.onFastForward = false;
        this.onMediaButtonEvent = false;
        this.onPlayFromMediaId = -7829368;
        this.onPlayFromUri = 1.0f;
        this.onPlay = 10.0f;
        this.onPause = 10.0f;
        this.onCommand = IconCompatParcelizer.OUTSIDE_CHART;
        this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.POSITIVE_INFINITY;
        this.MediaDescriptionCompat = write.LEFT;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
    }

    public getError(write writeVar) {
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.onAddQueueItem = false;
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.onFastForward = false;
        this.onMediaButtonEvent = false;
        this.onPlayFromMediaId = -7829368;
        this.onPlayFromUri = 1.0f;
        this.onPlay = 10.0f;
        this.onPause = 10.0f;
        this.onCommand = IconCompatParcelizer.OUTSIDE_CHART;
        this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.POSITIVE_INFINITY;
        this.MediaDescriptionCompat = writeVar;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
    }

    public final write onRemoveQueueItem() {
        return this.MediaDescriptionCompat;
    }

    private float onSkipToQueueItem() {
        return this.onCustomAction;
    }

    private float setSessionImpl() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final IconCompatParcelizer onRewind() {
        return this.onCommand;
    }

    public final boolean onSetCaptioningEnabled() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean onSetPlaybackSpeed() {
        return this.MediaMetadataCompat;
    }

    public final boolean onSkipToNext() {
        return this.onAddQueueItem;
    }

    private float MediaSessionCompatToken() {
        return this.onPlay;
    }

    private float onStop() {
        return this.onPause;
    }

    public final boolean onSetRepeatMode() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final int onSetRating() {
        return this.onPlayFromMediaId;
    }

    public final float onSetShuffleMode() {
        return this.onPlayFromUri;
    }

    public final float RemoteActionCompatParcelizer(Paint paint) {
        paint.setTextSize(this.MediaBrowserCompatItemReceiver);
        float fOnPlayFromUri = drmSessionAcquired.read(paint, AudioAttributesImplBaseParcelizer()) + (onPlayFromUri() * 2.0f);
        float fOnSkipToQueueItem = onSkipToQueueItem();
        float sessionImpl = setSessionImpl();
        if (fOnSkipToQueueItem > BitmapDescriptorFactory.HUE_RED) {
            fOnSkipToQueueItem = drmSessionAcquired.write(fOnSkipToQueueItem);
        }
        if (sessionImpl > BitmapDescriptorFactory.HUE_RED && sessionImpl != Float.POSITIVE_INFINITY) {
            sessionImpl = drmSessionAcquired.write(sessionImpl);
        }
        if (sessionImpl <= 0.0d) {
            sessionImpl = fOnPlayFromUri;
        }
        return Math.max(fOnSkipToQueueItem, Math.min(fOnPlayFromUri, sessionImpl));
    }

    public final float AudioAttributesCompatParcelizer(Paint paint) {
        paint.setTextSize(this.MediaBrowserCompatItemReceiver);
        return drmSessionAcquired.AudioAttributesCompatParcelizer(paint, AudioAttributesImplBaseParcelizer()) + (onPrepare() * 2.0f);
    }

    public final boolean onSkipToPrevious() {
        return onPlayFromSearch() && onCommand() && onRewind() == IconCompatParcelizer.OUTSIDE_CHART;
    }

    @Override // kotlin.restoreKeys
    public final void IconCompatParcelizer(float f, float f2) {
        if (Math.abs(f2 - f) == BitmapDescriptorFactory.HUE_RED) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        float f3 = fAbs / 100.0f;
        ((restoreKeys) this).IconCompatParcelizer = f - (onStop() * f3);
        this.AudioAttributesCompatParcelizer = ((restoreKeys) this).write ? this.AudioAttributesCompatParcelizer : f2 + (f3 * MediaSessionCompatToken());
        this.RemoteActionCompatParcelizer = Math.abs(((restoreKeys) this).IconCompatParcelizer - this.AudioAttributesCompatParcelizer);
    }
}
