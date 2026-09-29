package kotlin;

import com.github.mikephil.charting.data.PieEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionExternalSyntheticLambda3 extends DefaultDrmSessionExternalSyntheticLambda0<PieEntry> implements setSessionKeepaliveMs {
    public static int IconCompatParcelizer;
    public static int write;
    private boolean AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private IconCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private boolean MediaMetadataCompat;
    private IconCompatParcelizer RatingCompat;
    private float RemoteActionCompatParcelizer;
    private float read;

    /* JADX INFO: loaded from: classes2.dex */
    public enum IconCompatParcelizer {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public DefaultDrmSessionExternalSyntheticLambda3(List<PieEntry> list, String str) {
        super(list, str);
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = 18.0f;
        this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer.INSIDE_SLICE;
        this.RatingCompat = IconCompatParcelizer.INSIDE_SLICE;
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaBrowserCompatItemReceiver = -16777216;
        this.MediaBrowserCompatMediaItem = 1.0f;
        this.AudioAttributesImplApi26Parcelizer = 75.0f;
        this.AudioAttributesImplApi21Parcelizer = 0.3f;
        this.MediaBrowserCompatCustomActionResultReceiver = 0.4f;
        this.MediaMetadataCompat = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.DefaultDrmSessionExternalSyntheticLambda0
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        IconCompatParcelizer(pieEntry);
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float onPrepare() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final boolean onPrepareFromUri() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void onSetShuffleMode() {
        this.read = drmSessionAcquired.write(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final IconCompatParcelizer onSeekTo() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final IconCompatParcelizer onRemoveQueueItemAt() {
        return this.RatingCompat;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final boolean onSetRating() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final int onPlayFromUri() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float onRemoveQueueItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float onPrepareFromSearch() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float onPrepareFromMediaId() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final float onRewind() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.setSessionKeepaliveMs
    public final boolean onSetCaptioningEnabled() {
        return this.MediaMetadataCompat;
    }

    public static int onSetPlaybackSpeed() {
        int i = write;
        int i2 = i % 5112360;
        write = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        IconCompatParcelizer = iMaxMemory;
        return iMaxMemory;
    }
}
