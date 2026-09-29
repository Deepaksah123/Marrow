package kotlin;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class updatePlaybackPositions extends setShuffleModeEnabledInternal {
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private final Path AudioAttributesImplBaseParcelizer;
    private final stopRenderers MediaBrowserCompatCustomActionResultReceiver;
    private final float[] MediaBrowserCompatItemReceiver;
    private final RectF MediaBrowserCompatMediaItem;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> write;

    updatePlaybackPositions(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers) {
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
        this.MediaBrowserCompatMediaItem = new RectF();
        onSurfaceTextureDestroyed onsurfacetexturedestroyed = new onSurfaceTextureDestroyed();
        this.AudioAttributesImplApi26Parcelizer = onsurfacetexturedestroyed;
        this.MediaBrowserCompatItemReceiver = new float[8];
        this.AudioAttributesImplBaseParcelizer = new Path();
        this.MediaBrowserCompatCustomActionResultReceiver = stoprenderers;
        onsurfacetexturedestroyed.setAlpha(0);
        onsurfacetexturedestroyed.setStyle(Paint.Style.FILL);
        onsurfacetexturedestroyed.setColor(stoprenderers.handleMediaPlayPauseIfPendingOnHandler());
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    public final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        int iAlpha = Color.alpha(this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler());
        if (iAlpha != 0) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.write;
            Integer numAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5 == null ? null : exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer();
            if (numAudioAttributesImplApi26Parcelizer != null) {
                this.AudioAttributesImplApi26Parcelizer.setColor(numAudioAttributesImplApi26Parcelizer.intValue());
            } else {
                this.AudioAttributesImplApi26Parcelizer.setColor(this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler());
            }
            int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() == null ? 100 : this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer().intValue())) / 100.0f) * 255.0f);
            this.AudioAttributesImplApi26Parcelizer.setAlpha(iIntValue);
            if (access3100Var != null) {
                access3100Var.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            } else {
                this.AudioAttributesImplApi26Parcelizer.clearShadowLayer();
            }
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.AudioAttributesImplApi21Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                this.AudioAttributesImplApi26Parcelizer.setColorFilter(exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer());
            }
            if (iIntValue > 0) {
                float[] fArr = this.MediaBrowserCompatItemReceiver;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.MediaBrowserCompatCustomActionResultReceiver.onCustomAction();
                float[] fArr2 = this.MediaBrowserCompatItemReceiver;
                fArr2[3] = 0.0f;
                fArr2[4] = this.MediaBrowserCompatCustomActionResultReceiver.onCustomAction();
                this.MediaBrowserCompatItemReceiver[5] = this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                float[] fArr3 = this.MediaBrowserCompatItemReceiver;
                fArr3[6] = 0.0f;
                fArr3[7] = this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                matrix.mapPoints(this.MediaBrowserCompatItemReceiver);
                this.AudioAttributesImplBaseParcelizer.reset();
                Path path = this.AudioAttributesImplBaseParcelizer;
                float[] fArr4 = this.MediaBrowserCompatItemReceiver;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr5 = this.MediaBrowserCompatItemReceiver;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr6 = this.MediaBrowserCompatItemReceiver;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr7 = this.MediaBrowserCompatItemReceiver;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr8 = this.MediaBrowserCompatItemReceiver;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.AudioAttributesImplBaseParcelizer.close();
                canvas.drawPath(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer);
            }
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        this.MediaBrowserCompatMediaItem.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver.onCustomAction(), this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        this.RemoteActionCompatParcelizer.mapRect(this.MediaBrowserCompatMediaItem);
        rectF.set(this.MediaBrowserCompatMediaItem);
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            if (setdrminitdata == null) {
                this.AudioAttributesImplApi21Parcelizer = null;
                return;
            } else {
                this.AudioAttributesImplApi21Parcelizer = new getCurrentLiveOffsetUs(setdrminitdata);
                return;
            }
        }
        if (t == onAudioPositionAdvancing.AudioAttributesCompatParcelizer) {
            if (setdrminitdata == null) {
                this.write = null;
                this.AudioAttributesImplApi26Parcelizer.setColor(this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler());
            } else {
                this.write = new getCurrentLiveOffsetUs(setdrminitdata);
            }
        }
    }
}
