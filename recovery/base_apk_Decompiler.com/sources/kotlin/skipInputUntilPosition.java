package kotlin;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class skipInputUntilPosition {
    boolean AudioAttributesCompatParcelizer;
    public int AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplApi26Parcelizer;
    int AudioAttributesImplBaseParcelizer;
    public int MediaBrowserCompatItemReceiver;
    public int MediaBrowserCompatSearchResultReceiver;
    int MediaMetadataCompat;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    float onCommand;
    float onCustomAction;
    boolean read;
    public int write;
    public int MediaDescriptionCompat = Integer.MAX_VALUE;
    public int handleMediaPlayPauseIfPendingOnHandler = Integer.MAX_VALUE;
    public int MediaBrowserCompatMediaItem = Integer.MIN_VALUE;
    public int IconCompatParcelizer = Integer.MIN_VALUE;
    List<Integer> MediaBrowserCompatCustomActionResultReceiver = new ArrayList();

    skipInputUntilPosition() {
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int write() {
        return this.AudioAttributesImplApi26Parcelizer - this.AudioAttributesImplBaseParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.MediaDescriptionCompat = Math.min(this.MediaDescriptionCompat, (view.getLeft() - flexItem.MediaBrowserCompatCustomActionResultReceiver()) - i);
        this.handleMediaPlayPauseIfPendingOnHandler = Math.min(this.handleMediaPlayPauseIfPendingOnHandler, (view.getTop() - flexItem.AudioAttributesImplApi21Parcelizer()) - i2);
        this.MediaBrowserCompatMediaItem = Math.max(this.MediaBrowserCompatMediaItem, view.getRight() + flexItem.AudioAttributesImplApi26Parcelizer() + i3);
        this.IconCompatParcelizer = Math.max(this.IconCompatParcelizer, view.getBottom() + flexItem.AudioAttributesImplBaseParcelizer() + i4);
    }
}
