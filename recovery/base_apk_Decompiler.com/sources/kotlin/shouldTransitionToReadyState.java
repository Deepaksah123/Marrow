package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.setContainerMimeType;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldTransitionToReadyState extends setShuffleModeEnabledInternal {
    private final Rect AudioAttributesImplApi21Parcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Bitmap, Bitmap> AudioAttributesImplApi26Parcelizer;
    private onCameraMotionReset AudioAttributesImplBaseParcelizer;
    private final RectF MediaBrowserCompatCustomActionResultReceiver;
    private final onAudioDisabled MediaBrowserCompatItemReceiver;
    private final Paint MediaBrowserCompatSearchResultReceiver;
    private setContainerMimeType.write MediaDescriptionCompat;
    private setContainerMimeType MediaMetadataCompat;
    private final Rect RatingCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> write;

    shouldTransitionToReadyState(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers) {
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
        this.MediaBrowserCompatSearchResultReceiver = new onSurfaceTextureDestroyed(3);
        this.RatingCompat = new Rect();
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.MediaBrowserCompatCustomActionResultReceiver = new RectF();
        this.MediaBrowserCompatItemReceiver = exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(stoprenderers.MediaBrowserCompatMediaItem());
        if (read() != null) {
            this.AudioAttributesImplBaseParcelizer = new onCameraMotionReset(this, this, read());
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    public final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        Bitmap bitmapMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (bitmapMediaBrowserCompatItemReceiver == null || bitmapMediaBrowserCompatItemReceiver.isRecycled() || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        float fIconCompatParcelizer = setEncoderPadding.IconCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver.setAlpha(i);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.write;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            this.MediaBrowserCompatSearchResultReceiver.setColorFilter(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        }
        onCameraMotionReset oncameramotionreset = this.AudioAttributesImplBaseParcelizer;
        if (oncameramotionreset != null) {
            access3100Var = oncameramotionreset.write(matrix, i);
        }
        this.RatingCompat.set(0, 0, bitmapMediaBrowserCompatItemReceiver.getWidth(), bitmapMediaBrowserCompatItemReceiver.getHeight());
        if (this.IconCompatParcelizer.write()) {
            this.AudioAttributesImplApi21Parcelizer.set(0, 0, (int) (this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() * fIconCompatParcelizer), (int) (this.MediaBrowserCompatItemReceiver.read() * fIconCompatParcelizer));
        } else {
            this.AudioAttributesImplApi21Parcelizer.set(0, 0, (int) (bitmapMediaBrowserCompatItemReceiver.getWidth() * fIconCompatParcelizer), (int) (bitmapMediaBrowserCompatItemReceiver.getHeight() * fIconCompatParcelizer));
        }
        boolean z = access3100Var != null;
        if (z) {
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new setContainerMimeType();
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new setContainerMimeType.write();
            }
            this.MediaDescriptionCompat.write();
            access3100Var.RemoteActionCompatParcelizer(i, this.MediaDescriptionCompat);
            this.MediaBrowserCompatCustomActionResultReceiver.set(this.AudioAttributesImplApi21Parcelizer.left, this.AudioAttributesImplApi21Parcelizer.top, this.AudioAttributesImplApi21Parcelizer.right, this.AudioAttributesImplApi21Parcelizer.bottom);
            matrix.mapRect(this.MediaBrowserCompatCustomActionResultReceiver);
            canvas = this.MediaMetadataCompat.AudioAttributesCompatParcelizer(canvas, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapMediaBrowserCompatItemReceiver, this.RatingCompat, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver);
        if (z) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
            if (this.MediaMetadataCompat.write()) {
                return;
            }
        }
        canvas.restore();
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapMediaBrowserCompatItemReceiver;
        super.read(rectF, matrix, z);
        if (this.MediaBrowserCompatItemReceiver != null) {
            float fIconCompatParcelizer = setEncoderPadding.IconCompatParcelizer();
            if (!this.IconCompatParcelizer.write() && (bitmapMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver()) != null) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapMediaBrowserCompatItemReceiver.getWidth() * fIconCompatParcelizer, bitmapMediaBrowserCompatItemReceiver.getHeight() * fIconCompatParcelizer);
            } else {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() * fIconCompatParcelizer, this.MediaBrowserCompatItemReceiver.read() * fIconCompatParcelizer);
            }
            this.RemoteActionCompatParcelizer.mapRect(rectF);
        }
    }

    private Bitmap MediaBrowserCompatItemReceiver() {
        Bitmap bitmapAudioAttributesImplApi26Parcelizer;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Bitmap, Bitmap> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplApi26Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null && (bitmapAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer()) != null) {
            return bitmapAudioAttributesImplApi26Parcelizer;
        }
        Bitmap bitmapWrite = this.IconCompatParcelizer.write(this.read.MediaBrowserCompatMediaItem());
        if (bitmapWrite != null) {
            return bitmapWrite;
        }
        onAudioDisabled onaudiodisabled = this.MediaBrowserCompatItemReceiver;
        if (onaudiodisabled != null) {
            return onaudiodisabled.AudioAttributesCompatParcelizer();
        }
        return null;
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        onCameraMotionReset oncameramotionreset;
        onCameraMotionReset oncameramotionreset2;
        onCameraMotionReset oncameramotionreset3;
        onCameraMotionReset oncameramotionreset4;
        onCameraMotionReset oncameramotionreset5;
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            if (setdrminitdata == null) {
                this.write = null;
                return;
            } else {
                this.write = new getCurrentLiveOffsetUs(setdrminitdata);
                return;
            }
        }
        if (t == onAudioPositionAdvancing.MediaMetadataCompat) {
            if (setdrminitdata == null) {
                this.AudioAttributesImplApi26Parcelizer = null;
                return;
            } else {
                this.AudioAttributesImplApi26Parcelizer = new getCurrentLiveOffsetUs(setdrminitdata);
                return;
            }
        }
        if (t == onAudioPositionAdvancing.IconCompatParcelizer && (oncameramotionreset5 = this.AudioAttributesImplBaseParcelizer) != null) {
            oncameramotionreset5.IconCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplApi21Parcelizer && (oncameramotionreset4 = this.AudioAttributesImplBaseParcelizer) != null) {
            oncameramotionreset4.read(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplBaseParcelizer && (oncameramotionreset3 = this.AudioAttributesImplBaseParcelizer) != null) {
            oncameramotionreset3.RemoteActionCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaBrowserCompatItemReceiver && (oncameramotionreset2 = this.AudioAttributesImplBaseParcelizer) != null) {
            oncameramotionreset2.AudioAttributesCompatParcelizer(setdrminitdata);
        } else {
            if (t != onAudioPositionAdvancing.AudioAttributesImplApi26Parcelizer || (oncameramotionreset = this.AudioAttributesImplBaseParcelizer) == null) {
                return;
            }
            oncameramotionreset.write(setdrminitdata);
        }
    }
}
