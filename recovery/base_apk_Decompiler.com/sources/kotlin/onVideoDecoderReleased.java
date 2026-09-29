package kotlin;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoDecoderReleased implements onVideoDisabled, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> AudioAttributesCompatParcelizer;
    private final Paint AudioAttributesImplApi21Parcelizer;
    private final setShuffleModeEnabledInternal AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> MediaBrowserCompatCustomActionResultReceiver;
    private final ExoPlayerImplExternalSyntheticLambda6 MediaBrowserCompatItemReceiver;
    private final Path MediaBrowserCompatSearchResultReceiver;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> MediaMetadataCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> RemoteActionCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> read;
    private float write;

    public onVideoDecoderReleased(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setPauseAtEndOfWindowInternal setpauseatendofwindowinternal) {
        Path path = new Path();
        this.MediaBrowserCompatSearchResultReceiver = path;
        this.AudioAttributesImplApi21Parcelizer = new onSurfaceTextureDestroyed(1);
        this.MediaMetadataCompat = new ArrayList();
        this.AudioAttributesImplApi26Parcelizer = setshufflemodeenabledinternal;
        this.AudioAttributesImplBaseParcelizer = setpauseatendofwindowinternal.IconCompatParcelizer();
        this.IconCompatParcelizer = setpauseatendofwindowinternal.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = exoPlayerImplExternalSyntheticLambda6;
        if (setshufflemodeenabledinternal.IconCompatParcelizer() != null) {
            onCameraMotion oncameramotion = setshufflemodeenabledinternal.IconCompatParcelizer().IconCompatParcelizer().read();
            this.RemoteActionCompatParcelizer = oncameramotion;
            oncameramotion.RemoteActionCompatParcelizer(this);
            setshufflemodeenabledinternal.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (setpauseatendofwindowinternal.AudioAttributesCompatParcelizer() == null || setpauseatendofwindowinternal.write() == null) {
            this.read = null;
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            return;
        }
        path.setFillType(setpauseatendofwindowinternal.read());
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = setpauseatendofwindowinternal.AudioAttributesCompatParcelizer().read();
        this.read = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = setpauseatendofwindowinternal.write().read();
        this.MediaBrowserCompatCustomActionResultReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda52);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver.invalidateSelf();
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        for (int i = 0; i < list2.size(); i++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = list2.get(i);
            if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda0) {
                this.MediaMetadataCompat.add((ExoPlayerImplComponentListenerExternalSyntheticLambda0) onvideoframeprocessingoffset);
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        if (this.IconCompatParcelizer) {
            return;
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        float fIntValue = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer().intValue() / 100.0f;
        this.AudioAttributesImplApi21Parcelizer.setColor((setColorInfo.RemoteActionCompatParcelizer((int) (i * fIntValue)) << 24) | (((ExoPlayerImplFrameMetadataListener) this.read).MediaBrowserCompatMediaItem() & 16777215));
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            this.AudioAttributesImplApi21Parcelizer.setColorFilter(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RemoteActionCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            float fFloatValue = exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.AudioAttributesImplApi21Parcelizer.setMaskFilter(null);
            } else if (fFloatValue != this.write) {
                this.AudioAttributesImplApi21Parcelizer.setMaskFilter(this.AudioAttributesImplApi26Parcelizer.read(fFloatValue));
            }
            this.write = fFloatValue;
        }
        if (access3100Var != null) {
            access3100Var.write((int) (fIntValue * 255.0f), this.AudioAttributesImplApi21Parcelizer);
        } else {
            this.AudioAttributesImplApi21Parcelizer.clearShadowLayer();
        }
        this.MediaBrowserCompatSearchResultReceiver.reset();
        for (int i2 = 0; i2 < this.MediaMetadataCompat.size(); i2++) {
            this.MediaBrowserCompatSearchResultReceiver.addPath(this.MediaMetadataCompat.get(i2).write(), matrix);
        }
        canvas.drawPath(this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        this.MediaBrowserCompatSearchResultReceiver.reset();
        for (int i = 0; i < this.MediaMetadataCompat.size(); i++) {
            this.MediaBrowserCompatSearchResultReceiver.addPath(this.MediaMetadataCompat.get(i).write(), matrix);
        }
        this.MediaBrowserCompatSearchResultReceiver.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.AudioAttributesCompatParcelizer) {
            this.read.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesCompatParcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                this.AudioAttributesImplApi26Parcelizer.write(exoPlayerImplComponentListenerExternalSyntheticLambda5);
            }
            if (setdrminitdata == null) {
                this.AudioAttributesCompatParcelizer = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.AudioAttributesCompatParcelizer = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            return;
        }
        if (t == onAudioPositionAdvancing.read) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RemoteActionCompatParcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus2 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.RemoteActionCompatParcelizer = getcurrentliveoffsetus2;
            getcurrentliveoffsetus2.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }
}
