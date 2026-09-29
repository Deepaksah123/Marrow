package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class hasSessionId extends restoreKeys {
    public int onCustomAction = 1;
    public int MediaDescriptionCompat = 1;
    public int MediaBrowserCompatSearchResultReceiver = 1;
    public int MediaMetadataCompat = 1;
    private float onAddQueueItem = BitmapDescriptorFactory.HUE_RED;
    private boolean handleMediaPlayPauseIfPendingOnHandler = false;
    private AudioAttributesCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer.TOP;

    public enum AudioAttributesCompatParcelizer {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public hasSessionId() {
        this.MediaBrowserCompatMediaItem = drmSessionAcquired.write(4.0f);
    }

    public final AudioAttributesCompatParcelizer onRewind() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final float onRemoveQueueItem() {
        return this.onAddQueueItem;
    }

    public final boolean onSetRating() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }
}
