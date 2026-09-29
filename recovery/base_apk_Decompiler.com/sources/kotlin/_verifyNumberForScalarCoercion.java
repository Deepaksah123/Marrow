package kotlin;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class _verifyNumberForScalarCoercion {
    private static final ThreadLocal<double[]> read = new ThreadLocal<>();

    public static int read(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iWrite = write(iAlpha2, iAlpha);
        return Color.argb(iWrite, RemoteActionCompatParcelizer(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iWrite), RemoteActionCompatParcelizer(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iWrite), RemoteActionCompatParcelizer(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iWrite));
    }

    private static int write(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    private static int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static double read(int i) {
        double[] dArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(i, dArrRemoteActionCompatParcelizer);
        return dArrRemoteActionCompatParcelizer[1] / 100.0d;
    }

    public static double RemoteActionCompatParcelizer(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            StringBuilder sb = new StringBuilder("background can not be translucent: #");
            sb.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(sb.toString());
        }
        if (Color.alpha(i) < 255) {
            i = read(i, i2);
        }
        double d = read(i) + 0.05d;
        double d2 = read(i2) + 0.05d;
        return Math.max(d, d2) / Math.min(d, d2);
    }

    public static int IconCompatParcelizer(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            StringBuilder sb = new StringBuilder("background can not be translucent: #");
            sb.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(sb.toString());
        }
        double d = f;
        if (RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < BitmapDescriptorFactory.HUE_RED) {
            f7 += 360.0f;
        }
        fArr[0] = AudioAttributesCompatParcelizer(f7, 360.0f);
        fArr[1] = AudioAttributesCompatParcelizer(fAbs, 1.0f);
        fArr[2] = AudioAttributesCompatParcelizer(f6, 1.0f);
    }

    public static void write(int i, float[] fArr) {
        RemoteActionCompatParcelizer(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    private static void AudioAttributesCompatParcelizer(int i, double[] dArr) {
        read(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static void read(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int read(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(AudioAttributesCompatParcelizer((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), AudioAttributesCompatParcelizer((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), AudioAttributesCompatParcelizer((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    private static float AudioAttributesCompatParcelizer(float f, float f2) {
        return f < BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : Math.min(f, f2);
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static double[] RemoteActionCompatParcelizer() {
        ThreadLocal<double[]> threadLocal = read;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
