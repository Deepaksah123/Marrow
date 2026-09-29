package kotlin;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplInternal extends setEncoderDelay<PointF> {
    private Path AudioAttributesImplApi21Parcelizer;
    private final setEncoderDelay<PointF> RatingCompat;

    public ExoPlayerImplInternal(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setEncoderDelay<PointF> setencoderdelay) {
        super(exoPlayerImplExternalSyntheticLambda19, setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, setencoderdelay.IconCompatParcelizer, setencoderdelay.read, setencoderdelay.AudioAttributesImplBaseParcelizer, setencoderdelay.MediaBrowserCompatItemReceiver, setencoderdelay.AudioAttributesImplApi26Parcelizer, setencoderdelay.write);
        this.RatingCompat = setencoderdelay;
        write();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void write() {
        boolean z = (this.IconCompatParcelizer == 0 || this.MediaBrowserCompatCustomActionResultReceiver == 0 || !((PointF) this.MediaBrowserCompatCustomActionResultReceiver).equals(((PointF) this.IconCompatParcelizer).x, ((PointF) this.IconCompatParcelizer).y)) ? false : true;
        if (this.MediaBrowserCompatCustomActionResultReceiver == 0 || this.IconCompatParcelizer == 0 || z) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = setEncoderPadding.read((PointF) this.MediaBrowserCompatCustomActionResultReceiver, (PointF) this.IconCompatParcelizer, this.RatingCompat.RemoteActionCompatParcelizer, this.RatingCompat.AudioAttributesCompatParcelizer);
    }

    final Path read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }
}
