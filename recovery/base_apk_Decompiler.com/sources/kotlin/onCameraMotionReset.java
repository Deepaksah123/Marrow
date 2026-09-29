package kotlin;

import android.graphics.Color;
import android.graphics.Matrix;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class onCameraMotionReset implements ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer {
    private final setShuffleModeEnabledInternal AudioAttributesCompatParcelizer;
    private final onCameraMotion AudioAttributesImplApi21Parcelizer;
    private final onCameraMotion IconCompatParcelizer;
    private final onCameraMotion MediaBrowserCompatCustomActionResultReceiver;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
    private Matrix RemoteActionCompatParcelizer;
    private final onCameraMotion read;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> write;

    public onCameraMotionReset(ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setShuffleModeEnabledInternal setshufflemodeenabledinternal, ExoPlayerImplInternalExternalSyntheticLambda2 exoPlayerImplInternalExternalSyntheticLambda2) {
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = setshufflemodeenabledinternal;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = exoPlayerImplInternalExternalSyntheticLambda2.AudioAttributesCompatParcelizer().read();
        this.write = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        onCameraMotion oncameramotion = exoPlayerImplInternalExternalSyntheticLambda2.IconCompatParcelizer().read();
        this.MediaBrowserCompatCustomActionResultReceiver = oncameramotion;
        oncameramotion.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion);
        onCameraMotion oncameramotion2 = exoPlayerImplInternalExternalSyntheticLambda2.RemoteActionCompatParcelizer().read();
        this.read = oncameramotion2;
        oncameramotion2.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion2);
        onCameraMotion oncameramotion3 = exoPlayerImplInternalExternalSyntheticLambda2.read().read();
        this.IconCompatParcelizer = oncameramotion3;
        oncameramotion3.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion3);
        onCameraMotion oncameramotion4 = exoPlayerImplInternalExternalSyntheticLambda2.write().read();
        this.AudioAttributesImplApi21Parcelizer = oncameramotion4;
        oncameramotion4.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion4);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    public final access3100 write(Matrix matrix, int i) {
        float fMediaBrowserCompatMediaItem = this.read.MediaBrowserCompatMediaItem();
        float fFloatValue = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        double d = fMediaBrowserCompatMediaItem * 0.017453292f;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d + 3.141592653589793d);
        float fFloatValue2 = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        int iIntValue = this.write.AudioAttributesImplApi26Parcelizer().intValue();
        access3100 access3100Var = new access3100(fFloatValue2 * 0.33f, fSin * fFloatValue, fCos * fFloatValue, Color.argb(Math.round((this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer().floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        access3100Var.AudioAttributesCompatParcelizer(matrix);
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new Matrix();
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().invert(this.RemoteActionCompatParcelizer);
        access3100Var.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        return access3100Var;
    }

    public final void IconCompatParcelizer(setDrmInitData<Integer> setdrminitdata) {
        this.write.AudioAttributesCompatParcelizer(setdrminitdata);
    }

    public final void read(final setDrmInitData<Float> setdrminitdata) {
        if (setdrminitdata == null) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((setDrmInitData) null);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(new setDrmInitData<Float>(this) { // from class: o.onCameraMotionReset.2
                private /* synthetic */ onCameraMotionReset RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.setDrmInitData
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Float write(setInitializationData<Float> setinitializationdata) {
                    Float f = (Float) setdrminitdata.write(setinitializationdata);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public final void RemoteActionCompatParcelizer(setDrmInitData<Float> setdrminitdata) {
        this.read.AudioAttributesCompatParcelizer(setdrminitdata);
    }

    public final void AudioAttributesCompatParcelizer(setDrmInitData<Float> setdrminitdata) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(setdrminitdata);
    }

    public final void write(setDrmInitData<Float> setdrminitdata) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(setdrminitdata);
    }
}
