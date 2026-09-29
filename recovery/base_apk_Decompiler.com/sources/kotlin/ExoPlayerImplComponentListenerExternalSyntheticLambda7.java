package kotlin;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda7 extends onSurfaceTextureAvailable {
    private final String AudioAttributesImplApi21Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> IconCompatParcelizer;
    private final setShuffleModeEnabledInternal MediaBrowserCompatCustomActionResultReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> read;

    public ExoPlayerImplComponentListenerExternalSyntheticLambda7(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setSeekParametersInternal setseekparametersinternal) {
        super(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, setseekparametersinternal.write().RemoteActionCompatParcelizer(), setseekparametersinternal.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(), setseekparametersinternal.AudioAttributesImplApi26Parcelizer(), setseekparametersinternal.MediaBrowserCompatCustomActionResultReceiver(), setseekparametersinternal.AudioAttributesImplBaseParcelizer(), setseekparametersinternal.RemoteActionCompatParcelizer(), setseekparametersinternal.IconCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver = setshufflemodeenabledinternal;
        this.AudioAttributesImplApi21Parcelizer = setseekparametersinternal.MediaBrowserCompatItemReceiver();
        this.RemoteActionCompatParcelizer = setseekparametersinternal.AudioAttributesImplApi21Parcelizer();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = setseekparametersinternal.read().read();
        this.IconCompatParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
    }

    @Override // kotlin.onSurfaceTextureAvailable, kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.write.setColor(((ExoPlayerImplFrameMetadataListener) this.IconCompatParcelizer).MediaBrowserCompatMediaItem());
        if (this.read != null) {
            this.write.setColorFilter(this.read.AudioAttributesImplApi26Parcelizer());
        }
        super.RemoteActionCompatParcelizer(canvas, matrix, i, access3100Var);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.onSurfaceTextureAvailable, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.onMediaButtonEvent) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.read;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                this.MediaBrowserCompatCustomActionResultReceiver.write(exoPlayerImplComponentListenerExternalSyntheticLambda5);
            }
            if (setdrminitdata == null) {
                this.read = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.read = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer);
        }
    }
}
