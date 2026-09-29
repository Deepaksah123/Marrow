package kotlin;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoSizeChanged extends onSurfaceTextureAvailable {
    private final String AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final setPresenter<LinearGradient> AudioAttributesImplBaseParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<scheduleNextWork, scheduleNextWork> IconCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> MediaBrowserCompatCustomActionResultReceiver;
    private getCurrentLiveOffsetUs MediaBrowserCompatItemReceiver;
    private final setPresenter<RadialGradient> MediaBrowserCompatMediaItem;
    private final seekToPeriodPosition MediaMetadataCompat;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> RatingCompat;
    private final RectF RemoteActionCompatParcelizer;
    private final int read;

    public onVideoSizeChanged(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, seekToCurrentPosition seektocurrentposition) {
        super(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, seektocurrentposition.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), seektocurrentposition.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(), seektocurrentposition.MediaBrowserCompatCustomActionResultReceiver(), seektocurrentposition.AudioAttributesImplBaseParcelizer(), seektocurrentposition.RatingCompat(), seektocurrentposition.AudioAttributesImplApi21Parcelizer(), seektocurrentposition.IconCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = new setPresenter<>();
        this.MediaBrowserCompatMediaItem = new setPresenter<>();
        this.RemoteActionCompatParcelizer = new RectF();
        this.AudioAttributesImplApi21Parcelizer = seektocurrentposition.MediaBrowserCompatItemReceiver();
        this.MediaMetadataCompat = seektocurrentposition.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = seektocurrentposition.MediaBrowserCompatSearchResultReceiver();
        this.read = (int) (exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer() / 32.0f);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<scheduleNextWork, scheduleNextWork> exoPlayerImplComponentListenerExternalSyntheticLambda5 = seektocurrentposition.read().read();
        this.IconCompatParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda52 = seektocurrentposition.MediaBrowserCompatMediaItem().read();
        this.RatingCompat = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda52);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda53 = seektocurrentposition.write().read();
        this.MediaBrowserCompatCustomActionResultReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda53;
        exoPlayerImplComponentListenerExternalSyntheticLambda53.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda53);
    }

    @Override // kotlin.onSurfaceTextureAvailable, kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        Shader shaderIconCompatParcelizer;
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        read(this.RemoteActionCompatParcelizer, matrix, false);
        if (this.MediaMetadataCompat == seekToPeriodPosition.LINEAR) {
            shaderIconCompatParcelizer = read();
        } else {
            shaderIconCompatParcelizer = IconCompatParcelizer();
        }
        this.write.setShader(shaderIconCompatParcelizer);
        super.RemoteActionCompatParcelizer(canvas, matrix, i, access3100Var);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private LinearGradient read() {
        long jWrite = write();
        LinearGradient linearGradientIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(jWrite);
        if (linearGradientIconCompatParcelizer != null) {
            return linearGradientIconCompatParcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.RatingCompat.AudioAttributesImplApi26Parcelizer();
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        scheduleNextWork schedulenextworkAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        LinearGradient linearGradient = new LinearGradient(pointFAudioAttributesImplApi26Parcelizer.x, pointFAudioAttributesImplApi26Parcelizer.y, pointFAudioAttributesImplApi26Parcelizer2.x, pointFAudioAttributesImplApi26Parcelizer2.y, AudioAttributesCompatParcelizer(schedulenextworkAudioAttributesImplApi26Parcelizer.read()), schedulenextworkAudioAttributesImplApi26Parcelizer.write(), Shader.TileMode.CLAMP);
        this.AudioAttributesImplBaseParcelizer.write(jWrite, linearGradient);
        return linearGradient;
    }

    private RadialGradient IconCompatParcelizer() {
        long jWrite = write();
        RadialGradient radialGradientIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(jWrite);
        if (radialGradientIconCompatParcelizer != null) {
            return radialGradientIconCompatParcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.RatingCompat.AudioAttributesImplApi26Parcelizer();
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        scheduleNextWork schedulenextworkAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int[] iArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(schedulenextworkAudioAttributesImplApi26Parcelizer.read());
        float[] fArrWrite = schedulenextworkAudioAttributesImplApi26Parcelizer.write();
        RadialGradient radialGradient = new RadialGradient(pointFAudioAttributesImplApi26Parcelizer.x, pointFAudioAttributesImplApi26Parcelizer.y, (float) Math.hypot(pointFAudioAttributesImplApi26Parcelizer2.x - r7, pointFAudioAttributesImplApi26Parcelizer2.y - r8), iArrAudioAttributesCompatParcelizer, fArrWrite, Shader.TileMode.CLAMP);
        this.MediaBrowserCompatMediaItem.write(jWrite, radialGradient);
        return radialGradient;
    }

    private int write() {
        int iRound = Math.round(this.RatingCompat.RemoteActionCompatParcelizer() * this.read);
        int iRound2 = Math.round(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() * this.read);
        int iRound3 = Math.round(this.IconCompatParcelizer.RemoteActionCompatParcelizer() * this.read);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] AudioAttributesCompatParcelizer(int[] iArr) {
        getCurrentLiveOffsetUs getcurrentliveoffsetus = this.MediaBrowserCompatItemReceiver;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.onSurfaceTextureAvailable, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.RatingCompat) {
            if (this.MediaBrowserCompatItemReceiver != null) {
                this.AudioAttributesCompatParcelizer.write(this.MediaBrowserCompatItemReceiver);
            }
            if (setdrminitdata == null) {
                this.MediaBrowserCompatItemReceiver = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.MediaBrowserCompatItemReceiver = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }
    }
}
