package kotlin;

import android.graphics.DashPathEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class restoreKeys extends openInternal {
    public int AudioAttributesImplApi26Parcelizer;
    public int MediaBrowserCompatCustomActionResultReceiver;
    private DefaultDrmSessionResponseHandler MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private List<getOfflineLicenseKeySetId> onPlayFromUri;
    private int onPrepareFromMediaId = -7829368;
    private float onPrepare = 1.0f;
    private int MediaDescriptionCompat = -7829368;
    private float MediaBrowserCompatSearchResultReceiver = 1.0f;
    public float[] AudioAttributesImplBaseParcelizer = new float[0];
    public float[] read = new float[0];
    private int onPlayFromSearch = 6;
    private float onPlay = 1.0f;
    private boolean onPlayFromMediaId = false;
    private boolean onFastForward = false;
    private boolean onCustomAction = true;
    private boolean onCommand = true;
    private boolean onPause = true;
    private boolean handleMediaPlayPauseIfPendingOnHandler = false;
    private DashPathEffect MediaMetadataCompat = null;
    private DashPathEffect onPrepareFromSearch = null;
    private boolean onMediaButtonEvent = false;
    private boolean onAddQueueItem = true;
    private float onSeekTo = BitmapDescriptorFactory.HUE_RED;
    private float onRemoveQueueItem = BitmapDescriptorFactory.HUE_RED;
    protected boolean AudioAttributesImplApi21Parcelizer = false;
    protected boolean write = false;
    public float AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    public float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;

    public final boolean RatingCompat() {
        return false;
    }

    public restoreKeys() {
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(10.0f);
        this.RatingCompat = drmSessionAcquired.write(5.0f);
        this.MediaBrowserCompatMediaItem = drmSessionAcquired.write(5.0f);
        this.onPlayFromUri = new ArrayList();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.onCustomAction;
    }

    public final boolean MediaDescriptionCompat() {
        return this.onCommand;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.onPrepareFromMediaId;
    }

    public final float write() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPrepare;
    }

    public final int read() {
        return this.MediaDescriptionCompat;
    }

    public final void onPause() {
        this.onPause = false;
    }

    public final boolean onCommand() {
        return this.onPause;
    }

    private void write(int i) {
        this.onPlayFromSearch = 5;
        this.onFastForward = false;
    }

    public final void onPlayFromMediaId() {
        write(5);
        this.onFastForward = true;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onFastForward;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.onPlayFromSearch;
    }

    public final boolean onCustomAction() {
        return this.onPlayFromMediaId;
    }

    public final float IconCompatParcelizer() {
        return this.onPlay;
    }

    public final List<getOfflineLicenseKeySetId> AudioAttributesImplApi21Parcelizer() {
        return this.onPlayFromUri;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onMediaButtonEvent;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        String str = "";
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.length; i++) {
            String str2 = read(i);
            if (str2 != null && str.length() < str2.length()) {
                str = str2;
            }
        }
        return str;
    }

    public final String read(int i) {
        if (i < 0 || i >= this.AudioAttributesImplBaseParcelizer.length) {
            return "";
        }
        return MediaMetadataCompat().write(this.AudioAttributesImplBaseParcelizer[i]);
    }

    public final void AudioAttributesCompatParcelizer(DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = defaultDrmSessionResponseHandler;
    }

    public final DefaultDrmSessionResponseHandler MediaMetadataCompat() {
        DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (defaultDrmSessionResponseHandler == null || ((defaultDrmSessionResponseHandler instanceof post) && ((post) defaultDrmSessionResponseHandler).write() != this.AudioAttributesImplApi26Parcelizer)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new post(this.AudioAttributesImplApi26Parcelizer);
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final DashPathEffect MediaBrowserCompatItemReceiver() {
        return this.onPrepareFromSearch;
    }

    public final DashPathEffect RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void onAddQueueItem() {
        this.write = true;
        this.AudioAttributesCompatParcelizer = 100.0f;
        this.RemoteActionCompatParcelizer = Math.abs(100.0f - this.IconCompatParcelizer);
    }

    public void IconCompatParcelizer(float f, float f2) {
        float f3 = f - this.onSeekTo;
        float f4 = this.write ? this.AudioAttributesCompatParcelizer : f2 + this.onRemoveQueueItem;
        if (Math.abs(f4 - f3) == BitmapDescriptorFactory.HUE_RED) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.IconCompatParcelizer = f3;
        this.AudioAttributesCompatParcelizer = f4;
        this.RemoteActionCompatParcelizer = Math.abs(f4 - f3);
    }

    public final void onMediaButtonEvent() {
        this.onSeekTo = 0.5f;
    }

    public final void onPlay() {
        this.onRemoveQueueItem = 0.5f;
    }
}
