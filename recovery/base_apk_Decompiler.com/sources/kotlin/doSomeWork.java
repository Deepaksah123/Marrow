package kotlin;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class doSomeWork extends ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> {
    private setDrmInitData<Float> AudioAttributesImplApi21Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> AudioAttributesImplBaseParcelizer;
    private setDrmInitData<Float> MediaBrowserCompatCustomActionResultReceiver;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> MediaBrowserCompatItemReceiver;
    private final PointF read;
    private final PointF write;

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    final /* synthetic */ PointF read(setEncoderDelay<PointF> setencoderdelay, float f) {
        return MediaBrowserCompatSearchResultReceiver();
    }

    public doSomeWork(ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        super(Collections.emptyList());
        this.write = new PointF();
        this.read = new PointF();
        this.AudioAttributesImplBaseParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        this.MediaBrowserCompatItemReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
    }

    public final void read(setDrmInitData<Float> setdrminitdata) {
        this.AudioAttributesImplApi21Parcelizer = setdrminitdata;
    }

    public final void RemoteActionCompatParcelizer(setDrmInitData<Float> setdrminitdata) {
        this.MediaBrowserCompatCustomActionResultReceiver = setdrminitdata;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    public final void AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(f);
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(f);
        this.write.set(this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer().floatValue(), this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().floatValue());
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            this.RemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
    public PointF AudioAttributesImplApi26Parcelizer() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    private PointF MediaBrowserCompatSearchResultReceiver() {
        Float fRemoteActionCompatParcelizer;
        setEncoderDelay<Float> setencoderdelayIconCompatParcelizer;
        setEncoderDelay<Float> setencoderdelayIconCompatParcelizer2;
        Float fRemoteActionCompatParcelizer2 = null;
        if (this.AudioAttributesImplApi21Parcelizer == null || (setencoderdelayIconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer()) == null) {
            fRemoteActionCompatParcelizer = null;
        } else {
            Float f = setencoderdelayIconCompatParcelizer2.write;
            fRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(setencoderdelayIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer, f == null ? setencoderdelayIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : f.floatValue(), setencoderdelayIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver, setencoderdelayIconCompatParcelizer2.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(), this.AudioAttributesImplBaseParcelizer.write(), this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != null && (setencoderdelayIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) != null) {
            Float f2 = setencoderdelayIconCompatParcelizer.write;
            fRemoteActionCompatParcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(setencoderdelayIconCompatParcelizer.AudioAttributesImplApi26Parcelizer, f2 == null ? setencoderdelayIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : f2.floatValue(), setencoderdelayIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, setencoderdelayIconCompatParcelizer.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(), this.MediaBrowserCompatItemReceiver.write(), this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
        }
        if (fRemoteActionCompatParcelizer == null) {
            this.read.set(this.write.x, BitmapDescriptorFactory.HUE_RED);
        } else {
            this.read.set(fRemoteActionCompatParcelizer.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        if (fRemoteActionCompatParcelizer2 == null) {
            PointF pointF = this.read;
            pointF.set(pointF.x, this.write.y);
        } else {
            PointF pointF2 = this.read;
            pointF2.set(pointF2.x, fRemoteActionCompatParcelizer2.floatValue());
        }
        return this.read;
    }
}
