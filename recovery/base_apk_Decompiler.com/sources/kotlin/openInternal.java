package kotlin;

import android.graphics.Typeface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class openInternal {
    private boolean IconCompatParcelizer = true;
    protected float RatingCompat = 5.0f;
    protected float MediaBrowserCompatMediaItem = 5.0f;
    private Typeface write = null;
    protected float MediaBrowserCompatItemReceiver = drmSessionAcquired.write(10.0f);
    private int read = -16777216;

    public final float onPlayFromUri() {
        return this.RatingCompat;
    }

    public final void onRemoveQueueItemAt() {
        this.RatingCompat = drmSessionAcquired.write(BitmapDescriptorFactory.HUE_RED);
    }

    public final float onPrepare() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void onSeekTo() {
        this.MediaBrowserCompatMediaItem = drmSessionAcquired.write(BitmapDescriptorFactory.HUE_RED);
    }

    public final Typeface onPrepareFromSearch() {
        return this.write;
    }

    public final void write(Typeface typeface) {
        this.write = typeface;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (f > 24.0f) {
            f = 24.0f;
        }
        if (f < 6.0f) {
            f = 6.0f;
        }
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(f);
    }

    public final float onPrepareFromMediaId() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void IconCompatParcelizer(int i) {
        this.read = i;
    }

    public final int onFastForward() {
        return this.read;
    }

    public final void onPrepareFromUri() {
        this.IconCompatParcelizer = false;
    }

    public final boolean onPlayFromSearch() {
        return this.IconCompatParcelizer;
    }
}
