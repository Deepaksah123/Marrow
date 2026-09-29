package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseBooleanFromInt {
    private final float AudioAttributesCompatParcelizer;
    private final float AudioAttributesImplApi21Parcelizer;
    private final float AudioAttributesImplBaseParcelizer;
    private final float IconCompatParcelizer;
    private final float MediaBrowserCompatCustomActionResultReceiver;
    private final float MediaBrowserCompatItemReceiver;
    private final float RemoteActionCompatParcelizer;
    private final float read;
    private final float write;

    final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    final float IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private float AudioAttributesCompatParcelizer() {
        return this.write;
    }

    private float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private float write() {
        return this.read;
    }

    private float RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private _parseBooleanFromInt(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = f3;
        this.MediaBrowserCompatCustomActionResultReceiver = f4;
        this.MediaBrowserCompatItemReceiver = f5;
        this.AudioAttributesImplBaseParcelizer = f6;
        this.AudioAttributesImplApi21Parcelizer = f7;
        this.read = f8;
        this.IconCompatParcelizer = f9;
    }

    public static int RemoteActionCompatParcelizer(float f, float f2, float f3) {
        return AudioAttributesCompatParcelizer(f, f2, f3, _shortOverflow.RemoteActionCompatParcelizer);
    }

    static _parseBooleanFromInt RemoteActionCompatParcelizer(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        AudioAttributesCompatParcelizer(i, _shortOverflow.RemoteActionCompatParcelizer, fArr, fArr2);
        return new _parseBooleanFromInt(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    private static void AudioAttributesCompatParcelizer(int i, _shortOverflow _shortoverflow, float[] fArr, float[] fArr2) {
        _parseBoolean.write(i, fArr2);
        float[][] fArr3 = _parseBoolean.AudioAttributesCompatParcelizer;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0];
        float f3 = fArr2[1];
        float f4 = fArr4[1];
        float f5 = fArr2[2];
        float f6 = fArr4[2];
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0];
        float f8 = fArr5[1];
        float f9 = fArr5[2];
        float[] fArr6 = fArr3[2];
        float f10 = fArr6[0];
        float f11 = fArr6[1];
        float f12 = fArr6[2];
        float f13 = _shortoverflow.AudioAttributesImplApi26Parcelizer()[0] * ((f2 * f) + (f4 * f3) + (f6 * f5));
        float f14 = _shortoverflow.AudioAttributesImplApi26Parcelizer()[1] * ((f7 * f) + (f8 * f3) + (f9 * f5));
        float f15 = _shortoverflow.AudioAttributesImplApi26Parcelizer()[2] * ((f * f10) + (f3 * f11) + (f5 * f12));
        float fPow = (float) Math.pow(((double) (_shortoverflow.write() * Math.abs(f13))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (_shortoverflow.write() * Math.abs(f14))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (_shortoverflow.write() * Math.abs(f15))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f16 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f17 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = (((fSignum * 20.0f) + f18) + (21.0f * fSignum3)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < BitmapDescriptorFactory.HUE_RED) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * _shortoverflow.MediaBrowserCompatCustomActionResultReceiver()) / _shortoverflow.RemoteActionCompatParcelizer(), _shortoverflow.IconCompatParcelizer() * _shortoverflow.AudioAttributesImplApi21Parcelizer())) * 100.0f;
        float fIconCompatParcelizer = 4.0f / _shortoverflow.IconCompatParcelizer();
        float fSqrt = (float) Math.sqrt(fPow4 / 100.0f);
        float fRemoteActionCompatParcelizer = _shortoverflow.RemoteActionCompatParcelizer();
        float fAudioAttributesCompatParcelizer = _shortoverflow.AudioAttributesCompatParcelizer();
        float fSqrt2 = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, _shortoverflow.read()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * _shortoverflow.MediaBrowserCompatItemReceiver()) * _shortoverflow.AudioAttributesImplBaseParcelizer()) * ((float) Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d));
        float fAudioAttributesCompatParcelizer2 = _shortoverflow.AudioAttributesCompatParcelizer() * fSqrt2;
        float fSqrt3 = (float) Math.sqrt((r4 * _shortoverflow.IconCompatParcelizer()) / (_shortoverflow.RemoteActionCompatParcelizer() + 4.0f));
        float f22 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fAudioAttributesCompatParcelizer2) + 1.0f)) * 43.85965f;
        double d2 = f21;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        fArr[0] = fPow4;
        fArr[1] = fIconCompatParcelizer * fSqrt * (fRemoteActionCompatParcelizer + 4.0f) * fAudioAttributesCompatParcelizer;
        fArr[2] = fAudioAttributesCompatParcelizer2;
        fArr[3] = fSqrt3 * 50.0f;
        fArr[4] = f22;
        fArr[5] = fCos * fLog;
        fArr[6] = fLog * fSin;
    }

    private static _parseBooleanFromInt read(float f, float f2, float f3) {
        return RemoteActionCompatParcelizer(f, f2, f3, _shortOverflow.RemoteActionCompatParcelizer);
    }

    private static _parseBooleanFromInt RemoteActionCompatParcelizer(float f, float f2, float f3, _shortOverflow _shortoverflow) {
        float fIconCompatParcelizer = 4.0f / _shortoverflow.IconCompatParcelizer();
        float fSqrt = (float) Math.sqrt(((double) f) / 100.0d);
        float fRemoteActionCompatParcelizer = _shortoverflow.RemoteActionCompatParcelizer();
        float fAudioAttributesCompatParcelizer = _shortoverflow.AudioAttributesCompatParcelizer();
        float fAudioAttributesCompatParcelizer2 = _shortoverflow.AudioAttributesCompatParcelizer() * f2;
        float fSqrt2 = (float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * _shortoverflow.IconCompatParcelizer()) / (_shortoverflow.RemoteActionCompatParcelizer() + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fAudioAttributesCompatParcelizer2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new _parseBooleanFromInt(f3, f2, f, fIconCompatParcelizer * fSqrt * (fRemoteActionCompatParcelizer + 4.0f) * fAudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer2, fSqrt2 * 50.0f, f4, ((float) Math.cos(d)) * fLog, fLog * ((float) Math.sin(d)));
    }

    private float read(_parseBooleanFromInt _parsebooleanfromint) {
        float fMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver() - _parsebooleanfromint.MediaBrowserCompatCustomActionResultReceiver();
        float fWrite = write() - _parsebooleanfromint.write();
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() - _parsebooleanfromint.RemoteActionCompatParcelizer();
        return (float) (Math.pow(Math.sqrt((fMediaBrowserCompatCustomActionResultReceiver * fMediaBrowserCompatCustomActionResultReceiver) + (fWrite * fWrite) + (fRemoteActionCompatParcelizer * fRemoteActionCompatParcelizer)), 0.63d) * 1.41d);
    }

    private int AudioAttributesImplBaseParcelizer() {
        return RemoteActionCompatParcelizer(_shortOverflow.RemoteActionCompatParcelizer);
    }

    private int RemoteActionCompatParcelizer(_shortOverflow _shortoverflow) {
        float fPow = (float) Math.pow(((double) ((((double) IconCompatParcelizer()) == 0.0d || ((double) AudioAttributesCompatParcelizer()) == 0.0d) ? BitmapDescriptorFactory.HUE_RED : IconCompatParcelizer() / ((float) Math.sqrt(((double) AudioAttributesCompatParcelizer()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, _shortoverflow.read()), 0.73d), 1.1111111111111112d);
        double d = (read() * 3.1415927f) / 180.0f;
        float fCos = (float) (Math.cos(2.0d + d) + 3.8d);
        float fRemoteActionCompatParcelizer = _shortoverflow.RemoteActionCompatParcelizer();
        float fPow2 = (float) Math.pow(((double) AudioAttributesCompatParcelizer()) / 100.0d, (1.0d / ((double) _shortoverflow.IconCompatParcelizer())) / ((double) _shortoverflow.AudioAttributesImplApi21Parcelizer()));
        float fMediaBrowserCompatItemReceiver = _shortoverflow.MediaBrowserCompatItemReceiver();
        float fAudioAttributesImplBaseParcelizer = _shortoverflow.AudioAttributesImplBaseParcelizer();
        float fMediaBrowserCompatCustomActionResultReceiver = (fRemoteActionCompatParcelizer * fPow2) / _shortoverflow.MediaBrowserCompatCustomActionResultReceiver();
        float fSin = (float) Math.sin(d);
        float fCos2 = (float) Math.cos(d);
        float f = (((0.305f + fMediaBrowserCompatCustomActionResultReceiver) * 23.0f) * fPow) / (((((((fCos * 0.25f) * 3846.1538f) * fMediaBrowserCompatItemReceiver) * fAudioAttributesImplBaseParcelizer) * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fMediaBrowserCompatCustomActionResultReceiver * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5))));
        float fSignum = Math.signum(f5);
        float fWrite = 100.0f / _shortoverflow.write();
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))));
        float fSignum2 = Math.signum(f6);
        float fWrite2 = 100.0f / _shortoverflow.write();
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        float fMax3 = (float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))));
        float fSignum3 = Math.signum(f7);
        float fWrite3 = 100.0f / _shortoverflow.write();
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float f8 = ((fSignum * fWrite) * fPow3) / _shortoverflow.AudioAttributesImplApi26Parcelizer()[0];
        float f9 = ((fSignum2 * fWrite2) * fPow4) / _shortoverflow.AudioAttributesImplApi26Parcelizer()[1];
        float f10 = ((fSignum3 * fWrite3) * fPow5) / _shortoverflow.AudioAttributesImplApi26Parcelizer()[2];
        float[][] fArr = _parseBoolean.IconCompatParcelizer;
        float[] fArr2 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f14 = fArr3[0];
        float f15 = fArr3[1];
        float f16 = fArr3[2];
        float[] fArr4 = fArr[2];
        return _verifyNumberForScalarCoercion.read((f11 * f8) + (f12 * f9) + (f13 * f10), (f14 * f8) + (f15 * f9) + (f16 * f10), (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    private static int AudioAttributesCompatParcelizer(float f, float f2, float f3, _shortOverflow _shortoverflow) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return _parseBoolean.AudioAttributesCompatParcelizer(f3);
        }
        float fMin = f < BitmapDescriptorFactory.HUE_RED ? 0.0f : Math.min(360.0f, f);
        boolean z = true;
        _parseBooleanFromInt _parsebooleanfromint = null;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            _parseBooleanFromInt _parsebooleanfromintAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fMin, f5, f3);
            if (!z) {
                if (_parsebooleanfromintAudioAttributesCompatParcelizer == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    _parsebooleanfromint = _parsebooleanfromintAudioAttributesCompatParcelizer;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (_parsebooleanfromintAudioAttributesCompatParcelizer != null) {
                    return _parsebooleanfromintAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(_shortoverflow);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        if (_parsebooleanfromint == null) {
            return _parseBoolean.AudioAttributesCompatParcelizer(f3);
        }
        return _parsebooleanfromint.RemoteActionCompatParcelizer(_shortoverflow);
    }

    private static _parseBooleanFromInt AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        _parseBooleanFromInt _parsebooleanfromint = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iAudioAttributesImplBaseParcelizer = read(f8, f2, f).AudioAttributesImplBaseParcelizer();
            float fIconCompatParcelizer = _parseBoolean.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer);
            float fAbs = Math.abs(f3 - fIconCompatParcelizer);
            if (fAbs < 0.2f) {
                _parseBooleanFromInt _parsebooleanfromintRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iAudioAttributesImplBaseParcelizer);
                float f9 = _parsebooleanfromintRemoteActionCompatParcelizer.read(read(_parsebooleanfromintRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), _parsebooleanfromintRemoteActionCompatParcelizer.IconCompatParcelizer(), f));
                if (f9 <= 1.0f) {
                    _parsebooleanfromint = _parsebooleanfromintRemoteActionCompatParcelizer;
                    f5 = fAbs;
                    f7 = f9;
                }
            }
            if (f5 == BitmapDescriptorFactory.HUE_RED && f7 == BitmapDescriptorFactory.HUE_RED) {
                return _parsebooleanfromint;
            }
            if (fIconCompatParcelizer < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return _parsebooleanfromint;
    }
}
