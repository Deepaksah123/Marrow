package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0012\u001a'\u0010\b\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\b\u0010\u0013"}, d2 = {"", "p0", "p1", "p2", "p3", "p4", "AudioAttributesCompatParcelizer", "(FFFFF)F", "write", "(FFF)F", "RemoteActionCompatParcelizer", "(FFFF)F", "", "", "IconCompatParcelizer", "(FFF[FI)I", "p5", "Lo/setMenuPrepared;", "(FFFF[FI)J", "(F[FI)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DefaultPrettyPrinterNopIndenter {
    private static final float AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, float f5) {
        return (((((((f4 + ((f2 - f3) * 3.0f)) - f) * f5) + (((f3 - (2.0f * f2)) + f) * 3.0f)) * f5) + ((f2 - f) * 3.0f)) * f5) + f;
    }

    public static final float write(float f, float f2, float f3) {
        return ((((((f - f2) + 0.33333334f) * f3) + (f2 - (2.0f * f))) * f3) + f) * 3.0f * f3;
    }

    private static final int IconCompatParcelizer(float f, float f2, float f3, float[] fArr, int i) {
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            if (d2 == d3) {
                return 0;
            }
            return write((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, i);
        }
        double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
        double d7 = (-d) + d2;
        int iWrite = write((float) ((-(d6 + d7)) / d5), fArr, i);
        int iWrite2 = iWrite + write((float) ((d6 - d7) / d5), fArr, i + iWrite);
        if (iWrite2 <= 1) {
            return iWrite2;
        }
        float f4 = fArr[i];
        int i2 = i + 1;
        float f5 = fArr[i2];
        if (f4 <= f5) {
            return f4 == f5 ? iWrite2 - 1 : iWrite2;
        }
        fArr[i] = f5;
        fArr[i2] = f4;
        return iWrite2;
    }

    public static final long AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, float[] fArr, int i) {
        float f5 = (f2 - f) * 3.0f;
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        int iIconCompatParcelizer = IconCompatParcelizer(f5, f6, f7, fArr, i);
        float f8 = (f6 - f5) * 2.0f;
        int iWrite = write((-f8) / (((f7 - f6) * 2.0f) - f8), fArr, i + iIconCompatParcelizer);
        float fMin = Math.min(f, f4);
        float fMax = Math.max(f, f4);
        for (int i2 = 0; i2 < iIconCompatParcelizer + iWrite; i2++) {
            float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, f2, f3, f4, fArr[i2]);
            fMin = Math.min(fMin, fAudioAttributesCompatParcelizer);
            fMax = Math.max(fMax, fAudioAttributesCompatParcelizer);
        }
        return setMenuPrepared.write(fMin, fMax);
    }

    public static final float RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        float f5;
        double d = f;
        double d2 = ((d - (((double) f2) * 2.0d)) + ((double) f3)) * 3.0d;
        double d3 = ((double) (f2 - f)) * 3.0d;
        double d4 = ((double) (-f)) + (((double) (f2 - f3)) * 3.0d) + ((double) f4);
        double dAbs = Math.abs(d4);
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (dAbs < 1.0E-7d) {
            if (Math.abs(d2) < 1.0E-7d) {
                if (Math.abs(d3) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f7 = (float) ((-d) / d3);
                if (f7 >= BitmapDescriptorFactory.HUE_RED) {
                    f6 = f7;
                }
                f5 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f5 - f7) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f5;
            }
            double dSqrt = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d5 = d2 * 2.0d;
            float f8 = (float) ((dSqrt - d3) / d5);
            float f9 = f8 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f8;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (Math.abs(f9 - f8) > 1.05E-6f) {
                f9 = Float.NaN;
            }
            if (!Float.isNaN(f9)) {
                return f9;
            }
            float f10 = (float) (((-d3) - dSqrt) / d5);
            if (f10 >= BitmapDescriptorFactory.HUE_RED) {
                f6 = f10;
            }
            f5 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f5 - f10) > 1.05E-6f) {
                return Float.NaN;
            }
            return f5;
        }
        double d6 = d2 / d4;
        double d7 = d3 / d4;
        double d8 = d / d4;
        double d9 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
        double d10 = (((((2.0d * d6) * d6) * d6) - ((9.0d * d6) * d7)) + (d8 * 27.0d)) / 54.0d;
        double d11 = d9 * d9 * d9;
        double d12 = (d10 * d10) + d11;
        double d13 = d6 / 3.0d;
        if (d12 >= 0.0d) {
            if (d12 == 0.0d) {
                float f11 = -AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((float) d10);
                float f12 = (float) d13;
                float f13 = (2.0f * f11) - f12;
                float f14 = f13 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (!Float.isNaN(f14)) {
                    return f14;
                }
                float f15 = (-f11) - f12;
                if (f15 >= BitmapDescriptorFactory.HUE_RED) {
                    f6 = f15;
                }
                f5 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f5 - f15) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f5;
            }
            double dSqrt2 = Math.sqrt(d12);
            float fAudioAttributesCompatParcelizer = (float) (((double) (AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((float) ((-d10) + dSqrt2)) - AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((float) (d10 + dSqrt2)))) - d13);
            if (fAudioAttributesCompatParcelizer >= BitmapDescriptorFactory.HUE_RED) {
                f6 = fAudioAttributesCompatParcelizer;
            }
            f5 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f5 - fAudioAttributesCompatParcelizer) > 1.05E-6f) {
                return Float.NaN;
            }
            return f5;
        }
        double dSqrt3 = Math.sqrt(-d11);
        double d14 = (-d10) / dSqrt3;
        if (d14 < -1.0d) {
            d14 = -1.0d;
        }
        if (d14 > 1.0d) {
            d14 = 1.0d;
        }
        double dAcos = Math.acos(d14);
        double dAudioAttributesCompatParcelizer = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dAudioAttributesCompatParcelizer) - d13);
        float f16 = fCos < BitmapDescriptorFactory.HUE_RED ? 0.0f : fCos;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (Math.abs(f16 - fCos) > 1.05E-6f) {
            f16 = Float.NaN;
        }
        if (!Float.isNaN(f16)) {
            return f16;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dAudioAttributesCompatParcelizer) - d13);
        float f17 = fCos2 < BitmapDescriptorFactory.HUE_RED ? 0.0f : fCos2;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - fCos2) > 1.05E-6f) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float fCos3 = (float) ((dAudioAttributesCompatParcelizer * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d13);
        if (fCos3 >= BitmapDescriptorFactory.HUE_RED) {
            f6 = fCos3;
        }
        f5 = f6 <= 1.0f ? f6 : 1.0f;
        if (Math.abs(f5 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(float f, float[] fArr, int i) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
