package kotlin;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
class incrementPendingOperationAcks {
    private static final Interpolator RemoteActionCompatParcelizer = new LinearInterpolator();
    private static Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("t", CmcdHeadersFactory.STREAMING_FORMAT_SS, "e", "o", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, CmcdHeadersFactory.STREAMING_FORMAT_HLS, "to", "ti");
    private static Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("x", "y");

    incrementPendingOperationAcks() {
    }

    static <T> setEncoderDelay<T> read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, copyWithCryptoType<T> copywithcryptotype, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return write(exoPlayerImplExternalSyntheticLambda19, format1, f, copywithcryptotype);
        }
        if (z) {
            return IconCompatParcelizer(exoPlayerImplExternalSyntheticLambda19, format1, f, copywithcryptotype);
        }
        return RemoteActionCompatParcelizer(format1, f, copywithcryptotype);
    }

    private static <T> setEncoderDelay<T> IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, Format1 format1, float f, copyWithCryptoType<T> copywithcryptotype) throws IOException {
        Interpolator interpolatorIconCompatParcelizer;
        Interpolator interpolator;
        T t;
        format1.AudioAttributesCompatParcelizer();
        PointF pointF = null;
        T tAudioAttributesCompatParcelizer = null;
        T tAudioAttributesCompatParcelizer2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float fAudioAttributesImplApi21Parcelizer = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(read)) {
                case 0:
                    fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
                    break;
                case 1:
                    tAudioAttributesCompatParcelizer2 = copywithcryptotype.AudioAttributesCompatParcelizer(format1, f);
                    break;
                case 2:
                    tAudioAttributesCompatParcelizer = copywithcryptotype.AudioAttributesCompatParcelizer(format1, f);
                    break;
                case 3:
                    pointF = setPlayWhenReadyChangeReason.read(format1, 1.0f);
                    break;
                case 4:
                    pointF4 = setPlayWhenReadyChangeReason.read(format1, 1.0f);
                    break;
                case 5:
                    z = format1.AudioAttributesImplBaseParcelizer() == 1;
                    break;
                case 6:
                    pointF3 = setPlayWhenReadyChangeReason.read(format1, f);
                    break;
                case 7:
                    pointF2 = setPlayWhenReadyChangeReason.read(format1, f);
                    break;
                default:
                    format1.RatingCompat();
                    break;
            }
        }
        format1.IconCompatParcelizer();
        if (z) {
            interpolator = RemoteActionCompatParcelizer;
            t = tAudioAttributesCompatParcelizer2;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolatorIconCompatParcelizer = IconCompatParcelizer(pointF, pointF4);
            } else {
                interpolatorIconCompatParcelizer = RemoteActionCompatParcelizer;
            }
            interpolator = interpolatorIconCompatParcelizer;
            t = tAudioAttributesCompatParcelizer;
        }
        setEncoderDelay<T> setencoderdelay = new setEncoderDelay<>(exoPlayerImplExternalSyntheticLambda19, tAudioAttributesCompatParcelizer2, t, interpolator, fAudioAttributesImplApi21Parcelizer, (Float) null);
        setencoderdelay.RemoteActionCompatParcelizer = pointF3;
        setencoderdelay.AudioAttributesCompatParcelizer = pointF2;
        return setencoderdelay;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> kotlin.setEncoderDelay<T> write(kotlin.ExoPlayerImplExternalSyntheticLambda19 r21, kotlin.Format1 r22, float r23, kotlin.copyWithCryptoType<T> r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.incrementPendingOperationAcks.write(o.ExoPlayerImplExternalSyntheticLambda19, o.Format1, float, o.copyWithCryptoType):o.setEncoderDelay");
    }

    private static Interpolator IconCompatParcelizer(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = setColorInfo.AudioAttributesCompatParcelizer(pointF.x, -1.0f, 1.0f);
        pointF.y = setColorInfo.AudioAttributesCompatParcelizer(pointF.y, -100.0f, 100.0f);
        pointF2.x = setColorInfo.AudioAttributesCompatParcelizer(pointF2.x, -1.0f, 1.0f);
        pointF2.y = setColorInfo.AudioAttributesCompatParcelizer(pointF2.y, -100.0f, 100.0f);
        setEncoderPadding.read(pointF.x, pointF.y, pointF2.x, pointF2.y);
        ExoPlayerImplExternalSyntheticLambda18.RemoteActionCompatParcelizer();
        try {
            linearInterpolator = forBuilder.IconCompatParcelizer(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                linearInterpolator = forBuilder.IconCompatParcelizer(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, BitmapDescriptorFactory.HUE_RED), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        ExoPlayerImplExternalSyntheticLambda18.RemoteActionCompatParcelizer();
        return linearInterpolator;
    }

    private static <T> setEncoderDelay<T> RemoteActionCompatParcelizer(Format1 format1, float f, copyWithCryptoType<T> copywithcryptotype) throws IOException {
        return new setEncoderDelay<>(copywithcryptotype.AudioAttributesCompatParcelizer(format1, f));
    }
}
