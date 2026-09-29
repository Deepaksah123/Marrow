package kotlin;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoSurfaceDestroyed implements onVideoDisabled, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<scheduleNextWork, scheduleNextWork> AudioAttributesCompatParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> AudioAttributesImplApi21Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> AudioAttributesImplApi26Parcelizer;
    private final setShuffleModeEnabledInternal AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private getCurrentLiveOffsetUs MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final ExoPlayerImplExternalSyntheticLambda6 MediaBrowserCompatSearchResultReceiver;
    private final Path MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Paint MediaDescriptionCompat;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> MediaMetadataCompat;
    private final String RatingCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> RemoteActionCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> onAddQueueItem;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> onCommand;
    private final seekToPeriodPosition onCustomAction;
    private float read;
    private final RectF write;
    private final setPresenter<LinearGradient> MediaBrowserCompatMediaItem = new setPresenter<>();
    private final setPresenter<RadialGradient> handleMediaPlayPauseIfPendingOnHandler = new setPresenter<>();

    public onVideoSurfaceDestroyed(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal, sendMessageInternal sendmessageinternal) {
        Path path = new Path();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = path;
        this.MediaDescriptionCompat = new onSurfaceTextureDestroyed(1);
        this.write = new RectF();
        this.onCommand = new ArrayList();
        this.read = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplBaseParcelizer = setshufflemodeenabledinternal;
        this.RatingCompat = sendmessageinternal.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = sendmessageinternal.AudioAttributesImplApi26Parcelizer();
        this.MediaBrowserCompatSearchResultReceiver = exoPlayerImplExternalSyntheticLambda6;
        this.onCustomAction = sendmessageinternal.read();
        path.setFillType(sendmessageinternal.IconCompatParcelizer());
        this.IconCompatParcelizer = (int) (exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer() / 32.0f);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<scheduleNextWork, scheduleNextWork> exoPlayerImplComponentListenerExternalSyntheticLambda5 = sendmessageinternal.write().read();
        this.AudioAttributesCompatParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = sendmessageinternal.AudioAttributesImplBaseParcelizer().read();
        this.MediaMetadataCompat = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda52);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda53 = sendmessageinternal.MediaBrowserCompatItemReceiver().read();
        this.onAddQueueItem = exoPlayerImplComponentListenerExternalSyntheticLambda53;
        exoPlayerImplComponentListenerExternalSyntheticLambda53.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda53);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = sendmessageinternal.RemoteActionCompatParcelizer().read();
        this.AudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda54;
        exoPlayerImplComponentListenerExternalSyntheticLambda54.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda54);
        if (setshufflemodeenabledinternal.IconCompatParcelizer() != null) {
            onCameraMotion oncameramotion = setshufflemodeenabledinternal.IconCompatParcelizer().IconCompatParcelizer().read();
            this.RemoteActionCompatParcelizer = oncameramotion;
            oncameramotion.RemoteActionCompatParcelizer(this);
            setshufflemodeenabledinternal.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver.invalidateSelf();
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        for (int i = 0; i < list2.size(); i++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = list2.get(i);
            if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda0) {
                this.onCommand.add((ExoPlayerImplComponentListenerExternalSyntheticLambda0) onvideoframeprocessingoffset);
            }
        }
    }

    @Override // kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        Shader shaderWrite;
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
        for (int i2 = 0; i2 < this.onCommand.size(); i2++) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addPath(this.onCommand.get(i2).write(), matrix);
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.computeBounds(this.write, false);
        if (this.onCustomAction == seekToPeriodPosition.LINEAR) {
            shaderWrite = read();
        } else {
            shaderWrite = write();
        }
        shaderWrite.setLocalMatrix(matrix);
        this.MediaDescriptionCompat.setShader(shaderWrite);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplApi21Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            this.MediaDescriptionCompat.setColorFilter(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RemoteActionCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            float fFloatValue = exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.MediaDescriptionCompat.setMaskFilter(null);
            } else if (fFloatValue != this.read) {
                this.MediaDescriptionCompat.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.read = fFloatValue;
        }
        float fIntValue = this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer().intValue() / 100.0f;
        this.MediaDescriptionCompat.setAlpha(setColorInfo.RemoteActionCompatParcelizer((int) (i * fIntValue)));
        if (access3100Var != null) {
            access3100Var.write((int) (fIntValue * 255.0f), this.MediaDescriptionCompat);
        }
        canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaDescriptionCompat);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
        for (int i = 0; i < this.onCommand.size(); i++) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addPath(this.onCommand.get(i).write(), matrix);
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    private LinearGradient read() {
        long jIconCompatParcelizer = IconCompatParcelizer();
        LinearGradient linearGradientIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(jIconCompatParcelizer);
        if (linearGradientIconCompatParcelizer != null) {
            return linearGradientIconCompatParcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.onAddQueueItem.AudioAttributesImplApi26Parcelizer();
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
        scheduleNextWork schedulenextworkAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(schedulenextworkAudioAttributesImplApi26Parcelizer.read());
        float[] fArrWrite = schedulenextworkAudioAttributesImplApi26Parcelizer.write();
        if (iArrAudioAttributesCompatParcelizer.length < 2) {
            int i = iArrAudioAttributesCompatParcelizer[0];
            iArrAudioAttributesCompatParcelizer = new int[]{i, i};
            fArrWrite = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        LinearGradient linearGradient = new LinearGradient(pointFAudioAttributesImplApi26Parcelizer.x, pointFAudioAttributesImplApi26Parcelizer.y, pointFAudioAttributesImplApi26Parcelizer2.x, pointFAudioAttributesImplApi26Parcelizer2.y, iArrAudioAttributesCompatParcelizer, fArrWrite, Shader.TileMode.CLAMP);
        this.MediaBrowserCompatMediaItem.write(jIconCompatParcelizer, linearGradient);
        return linearGradient;
    }

    private RadialGradient write() {
        long jIconCompatParcelizer = IconCompatParcelizer();
        RadialGradient radialGradientIconCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(jIconCompatParcelizer);
        if (radialGradientIconCompatParcelizer != null) {
            return radialGradientIconCompatParcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.onAddQueueItem.AudioAttributesImplApi26Parcelizer();
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
        scheduleNextWork schedulenextworkAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(schedulenextworkAudioAttributesImplApi26Parcelizer.read());
        float[] fArrWrite = schedulenextworkAudioAttributesImplApi26Parcelizer.write();
        if (iArrAudioAttributesCompatParcelizer.length < 2) {
            int i = iArrAudioAttributesCompatParcelizer[0];
            iArrAudioAttributesCompatParcelizer = new int[]{i, i};
            fArrWrite = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        float[] fArr = fArrWrite;
        int[] iArr = iArrAudioAttributesCompatParcelizer;
        float f = pointFAudioAttributesImplApi26Parcelizer.x;
        float f2 = pointFAudioAttributesImplApi26Parcelizer.y;
        float fHypot = (float) Math.hypot(pointFAudioAttributesImplApi26Parcelizer2.x - f, pointFAudioAttributesImplApi26Parcelizer2.y - f2);
        if (fHypot <= BitmapDescriptorFactory.HUE_RED) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.handleMediaPlayPauseIfPendingOnHandler.write(jIconCompatParcelizer, radialGradient);
        return radialGradient;
    }

    private int IconCompatParcelizer() {
        int iRound = Math.round(this.onAddQueueItem.RemoteActionCompatParcelizer() * this.IconCompatParcelizer);
        int iRound2 = Math.round(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() * this.IconCompatParcelizer);
        int iRound3 = Math.round(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() * this.IconCompatParcelizer);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] AudioAttributesCompatParcelizer(int[] iArr) {
        getCurrentLiveOffsetUs getcurrentliveoffsetus = this.MediaBrowserCompatCustomActionResultReceiver;
        if (getcurrentliveoffsetus != null) {
            Integer[] numArr = (Integer[]) getcurrentliveoffsetus.AudioAttributesImplApi26Parcelizer();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.MediaBrowserCompatMediaItem) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplApi21Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                this.AudioAttributesImplBaseParcelizer.write(exoPlayerImplComponentListenerExternalSyntheticLambda5);
            }
            if (setdrminitdata == null) {
                this.AudioAttributesImplApi21Parcelizer = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.AudioAttributesImplApi21Parcelizer = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            return;
        }
        if (t == onAudioPositionAdvancing.RatingCompat) {
            getCurrentLiveOffsetUs getcurrentliveoffsetus2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (getcurrentliveoffsetus2 != null) {
                this.AudioAttributesImplBaseParcelizer.write(getcurrentliveoffsetus2);
            }
            if (setdrminitdata == null) {
                this.MediaBrowserCompatCustomActionResultReceiver = null;
                return;
            }
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
            getCurrentLiveOffsetUs getcurrentliveoffsetus3 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.MediaBrowserCompatCustomActionResultReceiver = getcurrentliveoffsetus3;
            getcurrentliveoffsetus3.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            return;
        }
        if (t == onAudioPositionAdvancing.read) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RemoteActionCompatParcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus4 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.RemoteActionCompatParcelizer = getcurrentliveoffsetus4;
            getcurrentliveoffsetus4.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }
}
