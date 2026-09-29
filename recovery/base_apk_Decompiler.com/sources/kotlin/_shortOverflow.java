package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
final class _shortOverflow {
    static final _shortOverflow RemoteActionCompatParcelizer = IconCompatParcelizer(_parseBoolean.write, (float) ((((double) _parseBoolean.IconCompatParcelizer(50.0f)) * 63.66197723675813d) / 100.0d));
    private final float AudioAttributesCompatParcelizer;
    private final float AudioAttributesImplApi21Parcelizer;
    private final float AudioAttributesImplApi26Parcelizer;
    private final float[] AudioAttributesImplBaseParcelizer;
    private final float IconCompatParcelizer;
    private final float MediaBrowserCompatCustomActionResultReceiver = 1.0f;
    private final float MediaBrowserCompatItemReceiver;
    private final float MediaBrowserCompatMediaItem;
    private final float read;
    private final float write;

    final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    final float read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final float IconCompatParcelizer() {
        return this.read;
    }

    final float MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    final float[] AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    final float write() {
        return this.IconCompatParcelizer;
    }

    final float AudioAttributesCompatParcelizer() {
        return this.write;
    }

    final float AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    private _shortOverflow(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.AudioAttributesImplApi26Parcelizer = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.MediaBrowserCompatItemReceiver = f3;
        this.AudioAttributesImplApi21Parcelizer = f4;
        this.read = f5;
        this.AudioAttributesImplBaseParcelizer = fArr;
        this.IconCompatParcelizer = f7;
        this.write = f8;
        this.MediaBrowserCompatMediaItem = f9;
    }

    private static _shortOverflow IconCompatParcelizer(float[] fArr, float f) {
        float[][] fArr2 = _parseBoolean.AudioAttributesCompatParcelizer;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr[2];
        float f7 = (f3 * f2) + (f5 * f4) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f2) + (fArr4[1] * f4) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f2 * fArr5[0]) + (f4 * fArr5[1]) + (f6 * fArr5[2]);
        float fWrite = _parseBoolean.write(0.59f, 0.69f, 1.0000002f);
        float fExp = 1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr6 = {(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * f) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) f) * 5.0d))) + (f11 * f);
        float fIconCompatParcelizer = _parseBoolean.IconCompatParcelizer(50.0f) / fArr[1];
        double d2 = fIconCompatParcelizer;
        float fSqrt = (float) Math.sqrt(d2);
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f9)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        return new _shortOverflow(fIconCompatParcelizer, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fWrite, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt + 1.48f);
    }
}
