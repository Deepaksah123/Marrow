package kotlin;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public class lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher {
    protected final Matrix write = new Matrix();
    private RectF read = new RectF();
    private float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    private float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    private float MediaBrowserCompatCustomActionResultReceiver = 1.0f;
    private float AudioAttributesImplApi26Parcelizer = Float.MAX_VALUE;
    private float AudioAttributesImplBaseParcelizer = 1.0f;
    private float MediaBrowserCompatItemReceiver = Float.MAX_VALUE;
    private float AudioAttributesImplApi21Parcelizer = 1.0f;
    private float MediaBrowserCompatSearchResultReceiver = 1.0f;
    private float MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
    private float RatingCompat = BitmapDescriptorFactory.HUE_RED;
    private float MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
    private float MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
    private float[] onAddQueueItem = new float[9];
    private Matrix AudioAttributesCompatParcelizer = new Matrix();
    private float[] onCommand = new float[9];

    public final void IconCompatParcelizer(float f, float f2) {
        float fOnFastForward = onFastForward();
        float fOnPlayFromUri = onPlayFromUri();
        float fOnPlay = onPlay();
        float fOnPlayFromMediaId = onPlayFromMediaId();
        this.RemoteActionCompatParcelizer = f2;
        this.IconCompatParcelizer = f;
        RemoteActionCompatParcelizer(fOnFastForward, fOnPlayFromUri, fOnPlay, fOnPlayFromMediaId);
    }

    public final void RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        this.read.set(f, f2, this.IconCompatParcelizer - f3, this.RemoteActionCompatParcelizer - f4);
    }

    public final float onFastForward() {
        return this.read.left;
    }

    public final float onPlay() {
        return this.IconCompatParcelizer - this.read.right;
    }

    public final float onPlayFromUri() {
        return this.read.top;
    }

    public final float onPlayFromMediaId() {
        return this.RemoteActionCompatParcelizer - this.read.bottom;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.read.top;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.read.left;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.right;
    }

    public final float read() {
        return this.read.bottom;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.read.width();
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.read.height();
    }

    public final RectF MediaBrowserCompatSearchResultReceiver() {
        return this.read;
    }

    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher MediaMetadataCompat() {
        return lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(this.read.centerX(), this.read.centerY());
    }

    public final float MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    public final float handleMediaPlayPauseIfPendingOnHandler() {
        return Math.min(this.read.width(), this.read.height());
    }

    public final void RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, Matrix matrix) {
        matrix.reset();
        matrix.set(this.write);
        matrix.postScale(f, f2, f3, f4);
    }

    public final void AudioAttributesCompatParcelizer(float[] fArr, View view) {
        Matrix matrix = this.AudioAttributesCompatParcelizer;
        matrix.reset();
        matrix.set(this.write);
        matrix.postTranslate(-(fArr[0] - onFastForward()), -(fArr[1] - onPlayFromUri()));
        AudioAttributesCompatParcelizer(matrix, view, true);
    }

    public final Matrix AudioAttributesCompatParcelizer(Matrix matrix, View view, boolean z) {
        this.write.set(matrix);
        AudioAttributesCompatParcelizer(this.write, this.read);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.write);
        return matrix;
    }

    private void AudioAttributesCompatParcelizer(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        matrix.getValues(this.onCommand);
        float[] fArr = this.onCommand;
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.AudioAttributesImplApi21Parcelizer = Math.min(Math.max(this.AudioAttributesImplBaseParcelizer, f2), this.MediaBrowserCompatItemReceiver);
        this.MediaBrowserCompatSearchResultReceiver = Math.min(Math.max(this.MediaBrowserCompatCustomActionResultReceiver, f4), this.AudioAttributesImplApi26Parcelizer);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = BitmapDescriptorFactory.HUE_RED;
            fHeight = 0.0f;
        }
        this.MediaDescriptionCompat = Math.min(Math.max(f, ((-fWidth) * (this.AudioAttributesImplApi21Parcelizer - 1.0f)) - this.MediaMetadataCompat), this.MediaMetadataCompat);
        float fMax = Math.max(Math.min(f3, (fHeight * (this.MediaBrowserCompatSearchResultReceiver - 1.0f)) + this.MediaBrowserCompatMediaItem), -this.MediaBrowserCompatMediaItem);
        this.RatingCompat = fMax;
        float[] fArr2 = this.onCommand;
        fArr2[2] = this.MediaDescriptionCompat;
        fArr2[0] = this.AudioAttributesImplApi21Parcelizer;
        fArr2[5] = fMax;
        fArr2[4] = this.MediaBrowserCompatSearchResultReceiver;
        matrix.setValues(fArr2);
    }

    public final void MediaDescriptionCompat(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.AudioAttributesImplBaseParcelizer = f;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final void AudioAttributesImplApi26Parcelizer(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = Float.MAX_VALUE;
        }
        this.MediaBrowserCompatItemReceiver = f;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final void read(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            f2 = Float.MAX_VALUE;
        }
        this.AudioAttributesImplBaseParcelizer = f;
        this.MediaBrowserCompatItemReceiver = f2;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final void MediaBrowserCompatSearchResultReceiver(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = Float.MAX_VALUE;
        }
        this.AudioAttributesImplApi26Parcelizer = f;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final void RemoteActionCompatParcelizer(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            f2 = Float.MAX_VALUE;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        this.AudioAttributesImplApi26Parcelizer = f2;
        AudioAttributesCompatParcelizer(this.write, this.read);
    }

    public final Matrix RatingCompat() {
        return this.write;
    }

    public final boolean read(float f) {
        return RemoteActionCompatParcelizer(f) && write(f);
    }

    public final boolean AudioAttributesImplBaseParcelizer(float f) {
        return AudioAttributesCompatParcelizer(f) && IconCompatParcelizer(f);
    }

    public final boolean write(float f, float f2) {
        return read(f) && AudioAttributesImplBaseParcelizer(f2);
    }

    public final boolean RemoteActionCompatParcelizer(float f) {
        return this.read.left <= f + 1.0f;
    }

    public final boolean write(float f) {
        return this.read.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean AudioAttributesCompatParcelizer(float f) {
        return this.read.top <= f;
    }

    public final boolean IconCompatParcelizer(float f) {
        return this.read.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public final float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float onAddQueueItem() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean onCustomAction() {
        return onMediaButtonEvent() && onPause();
    }

    public final boolean onPause() {
        float f = this.MediaBrowserCompatSearchResultReceiver;
        float f2 = this.MediaBrowserCompatCustomActionResultReceiver;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean onMediaButtonEvent() {
        float f = this.AudioAttributesImplApi21Parcelizer;
        float f2 = this.AudioAttributesImplBaseParcelizer;
        return f <= f2 && f2 <= 1.0f;
    }

    public final void AudioAttributesImplApi21Parcelizer(float f) {
        this.MediaMetadataCompat = drmSessionAcquired.write(f);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.MediaBrowserCompatMediaItem = drmSessionAcquired.write(f);
    }

    public final boolean onCommand() {
        return this.MediaMetadataCompat <= BitmapDescriptorFactory.HUE_RED && this.MediaBrowserCompatMediaItem <= BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer > this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer < this.MediaBrowserCompatItemReceiver;
    }

    public final boolean write() {
        return this.MediaBrowserCompatSearchResultReceiver > this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver < this.AudioAttributesImplApi26Parcelizer;
    }
}
