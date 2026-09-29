package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class FactoryBasedEnumDeserializer {
    private String AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private double[] RemoteActionCompatParcelizer;
    private deserializeEnumUsingPropertyBased read;
    private float[] MediaBrowserCompatCustomActionResultReceiver = new float[0];
    private double[] AudioAttributesImplApi26Parcelizer = new double[0];
    private double write = 6.283185307179586d;
    private boolean IconCompatParcelizer = false;

    public final String toString() {
        StringBuilder sb = new StringBuilder("pos =");
        sb.append(Arrays.toString(this.AudioAttributesImplApi26Parcelizer));
        sb.append(" period=");
        sb.append(Arrays.toString(this.MediaBrowserCompatCustomActionResultReceiver));
        return sb.toString();
    }

    public final void read(int i, String str) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesCompatParcelizer = str;
        if (str != null) {
            this.read = deserializeEnumUsingPropertyBased.RemoteActionCompatParcelizer(str);
        }
    }

    public final void write(double d, float f) {
        int length = this.MediaBrowserCompatCustomActionResultReceiver.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.AudioAttributesImplApi26Parcelizer, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.AudioAttributesImplApi26Parcelizer = Arrays.copyOf(this.AudioAttributesImplApi26Parcelizer, length);
        this.MediaBrowserCompatCustomActionResultReceiver = Arrays.copyOf(this.MediaBrowserCompatCustomActionResultReceiver, length);
        this.RemoteActionCompatParcelizer = new double[length];
        double[] dArr = this.AudioAttributesImplApi26Parcelizer;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.AudioAttributesImplApi26Parcelizer[iBinarySearch] = d;
        this.MediaBrowserCompatCustomActionResultReceiver[iBinarySearch] = f;
        this.IconCompatParcelizer = false;
    }

    public final void read() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr2[i3] + fArr2[i2]) / 2.0f;
            double[] dArr = this.AudioAttributesImplApi26Parcelizer;
            d2 += (dArr[i2] - dArr[i3]) * ((double) f);
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = fArr3[i4] * ((float) (d / d2));
            i4++;
        }
        this.RemoteActionCompatParcelizer[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i5 < fArr4.length) {
                int i6 = i5 - 1;
                float f2 = (fArr4[i6] + fArr4[i5]) / 2.0f;
                double[] dArr2 = this.AudioAttributesImplApi26Parcelizer;
                double d3 = dArr2[i5];
                double d4 = dArr2[i6];
                double[] dArr3 = this.RemoteActionCompatParcelizer;
                dArr3[i5] = dArr3[i6] + ((d3 - d4) * ((double) f2));
                i5++;
            } else {
                this.IconCompatParcelizer = true;
                return;
            }
        }
    }

    private double AudioAttributesCompatParcelizer(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.AudioAttributesImplApi26Parcelizer, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.AudioAttributesImplApi26Parcelizer;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return this.RemoteActionCompatParcelizer[i] + ((((double) f2) - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    public final double write(double d, double d2) {
        double dAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(d) + d2;
        switch (this.AudioAttributesImplBaseParcelizer) {
            case 1:
                return Math.signum(0.5d - (dAudioAttributesCompatParcelizer % 1.0d));
            case 2:
                return 1.0d - Math.abs((((dAudioAttributesCompatParcelizer * 4.0d) + 1.0d) % 4.0d) - 2.0d);
            case 3:
                return (((dAudioAttributesCompatParcelizer * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                return 1.0d - (((dAudioAttributesCompatParcelizer * 2.0d) + 1.0d) % 2.0d);
            case 5:
                return Math.cos(this.write * (d2 + dAudioAttributesCompatParcelizer));
            case 6:
                double dAbs = 1.0d - Math.abs(((dAudioAttributesCompatParcelizer * 4.0d) % 4.0d) - 2.0d);
                return 1.0d - (dAbs * dAbs);
            case 7:
                return this.read.RemoteActionCompatParcelizer(dAudioAttributesCompatParcelizer % 1.0d);
            default:
                return Math.sin(this.write * dAudioAttributesCompatParcelizer);
        }
    }

    private double write(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.AudioAttributesImplApi26Parcelizer, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.AudioAttributesImplApi26Parcelizer;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return (d * d5) + (((double) f2) - (d5 * d4));
    }

    public final double IconCompatParcelizer(double d, double d2, double d3) {
        double d4;
        double dSignum;
        double dAudioAttributesCompatParcelizer = d2 + AudioAttributesCompatParcelizer(d);
        double dWrite = write(d) + d3;
        switch (this.AudioAttributesImplBaseParcelizer) {
            case 1:
                return 0.0d;
            case 2:
                d4 = dWrite * 4.0d;
                dSignum = Math.signum((((dAudioAttributesCompatParcelizer * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dWrite * 2.0d;
            case 4:
                return (-dWrite) * 2.0d;
            case 5:
                double d5 = this.write;
                return (-d5) * dWrite * Math.sin(d5 * dAudioAttributesCompatParcelizer);
            case 6:
                d4 = dWrite * 4.0d;
                dSignum = (((dAudioAttributesCompatParcelizer * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                break;
            case 7:
                return this.read.IconCompatParcelizer(dAudioAttributesCompatParcelizer % 1.0d, 0);
            default:
                double d6 = this.write;
                d4 = dWrite * d6;
                dSignum = Math.cos(d6 * dAudioAttributesCompatParcelizer);
                break;
        }
        return d4 * dSignum;
    }
}
