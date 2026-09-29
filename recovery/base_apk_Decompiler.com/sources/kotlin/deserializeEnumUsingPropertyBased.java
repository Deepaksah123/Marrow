package kotlin;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class deserializeEnumUsingPropertyBased extends _deserializeUsingProperties {
    private double[] AudioAttributesCompatParcelizer;
    private double[][] IconCompatParcelizer;
    private double[] RemoteActionCompatParcelizer;
    private double[][] read;
    private boolean write = true;

    private static double RemoteActionCompatParcelizer(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return ((((((((((-6.0d) * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    private static double read(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return (((((((((((-2.0d) * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d * 2.0d) * d5) * d7)) + (d11 * d2);
    }

    public deserializeEnumUsingPropertyBased(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.RemoteActionCompatParcelizer = new double[length2];
        int i = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4];
                double d2 = dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d3 = (dArr2[i4][i2] - dArr2[i3][i2]) / (d - d2);
                dArr5[i2] = d3;
                if (i3 == 0) {
                    dArr4[i3][i2] = d3;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d3) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d4 = dArr3[i5][i6];
                if (d4 == 0.0d) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d5 = dArr4[i5][i6] / d4;
                    int i7 = i5 + 1;
                    double d6 = dArr4[i7][i6] / d4;
                    double dHypot = Math.hypot(d5, d6);
                    if (dHypot > 9.0d) {
                        double d7 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d5 * d7 * dArr7[i6];
                        dArr4[i7][i6] = d7 * d6 * dArr7[i6];
                    }
                }
            }
        }
        this.AudioAttributesCompatParcelizer = dArr;
        this.IconCompatParcelizer = dArr2;
        this.read = dArr4;
    }

    @Override // kotlin._deserializeUsingProperties
    public final void read(double d, double[] dArr) {
        double[] dArr2 = this.AudioAttributesCompatParcelizer;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.IconCompatParcelizer[0].length;
        if (this.write) {
            double d2 = dArr2[0];
            if (d <= d2) {
                AudioAttributesCompatParcelizer(d2, this.RemoteActionCompatParcelizer);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.IconCompatParcelizer[0][i2] + ((d - this.AudioAttributesCompatParcelizer[0]) * this.RemoteActionCompatParcelizer[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                AudioAttributesCompatParcelizer(d3, this.RemoteActionCompatParcelizer);
                while (i < length2) {
                    dArr[i] = this.IconCompatParcelizer[i3][i] + ((d - this.AudioAttributesCompatParcelizer[i3]) * this.RemoteActionCompatParcelizer[i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = this.IconCompatParcelizer[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.IconCompatParcelizer[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.AudioAttributesCompatParcelizer[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.IconCompatParcelizer[i6][i7];
                }
            }
            double[] dArr3 = this.AudioAttributesCompatParcelizer;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.IconCompatParcelizer;
                    double d8 = dArr4[i6][i];
                    double d9 = dArr4[i8][i];
                    double[][] dArr5 = this.read;
                    dArr[i] = read(d6, d7, d8, d9, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final void AudioAttributesCompatParcelizer(double d, float[] fArr) {
        double[] dArr = this.AudioAttributesCompatParcelizer;
        int length = dArr.length;
        int i = 0;
        int length2 = this.IconCompatParcelizer[0].length;
        if (this.write) {
            double d2 = dArr[0];
            if (d <= d2) {
                AudioAttributesCompatParcelizer(d2, this.RemoteActionCompatParcelizer);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.IconCompatParcelizer[0][i2] + ((d - this.AudioAttributesCompatParcelizer[0]) * this.RemoteActionCompatParcelizer[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                AudioAttributesCompatParcelizer(d3, this.RemoteActionCompatParcelizer);
                while (i < length2) {
                    fArr[i] = (float) (this.IconCompatParcelizer[i3][i] + ((d - this.AudioAttributesCompatParcelizer[i3]) * this.RemoteActionCompatParcelizer[i]));
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) this.IconCompatParcelizer[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.IconCompatParcelizer[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.AudioAttributesCompatParcelizer[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.IconCompatParcelizer[i6][i7];
                }
            }
            double[] dArr2 = this.AudioAttributesCompatParcelizer;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.IconCompatParcelizer;
                    double d8 = dArr3[i6][i];
                    double d9 = dArr3[i8][i];
                    double[][] dArr4 = this.read;
                    fArr[i] = (float) read(d6, d7, d8, d9, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double RemoteActionCompatParcelizer(double d) {
        double d2;
        double d3;
        double dIconCompatParcelizer;
        double[] dArr = this.AudioAttributesCompatParcelizer;
        int length = dArr.length;
        if (this.write) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.IconCompatParcelizer[0][0];
                d3 = d - d4;
                dIconCompatParcelizer = IconCompatParcelizer(d4, 0);
            } else {
                int i = length - 1;
                double d5 = dArr[i];
                if (d >= d5) {
                    d2 = this.IconCompatParcelizer[i][0];
                    d3 = d - d5;
                    dIconCompatParcelizer = IconCompatParcelizer(d5, 0);
                }
            }
            return d2 + (d3 * dIconCompatParcelizer);
        }
        if (d <= dArr[0]) {
            return this.IconCompatParcelizer[0][0];
        }
        int i2 = length - 1;
        if (d >= dArr[i2]) {
            return this.IconCompatParcelizer[i2][0];
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr2 = this.AudioAttributesCompatParcelizer;
            double d6 = dArr2[i3];
            if (d == d6) {
                return this.IconCompatParcelizer[i3][0];
            }
            int i4 = i3 + 1;
            double d7 = dArr2[i4];
            if (d < d7) {
                double d8 = d7 - d6;
                double d9 = (d - d6) / d8;
                double[][] dArr3 = this.IconCompatParcelizer;
                double d10 = dArr3[i3][0];
                double d11 = dArr3[i4][0];
                double[][] dArr4 = this.read;
                return read(d8, d9, d10, d11, dArr4[i3][0], dArr4[i4][0]);
            }
            i3 = i4;
        }
        return 0.0d;
    }

    @Override // kotlin._deserializeUsingProperties
    public final void AudioAttributesCompatParcelizer(double d, double[] dArr) {
        double[] dArr2 = this.AudioAttributesCompatParcelizer;
        int length = dArr2.length;
        int length2 = this.IconCompatParcelizer[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.AudioAttributesCompatParcelizer;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.IconCompatParcelizer;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.read;
                    dArr[i3] = RemoteActionCompatParcelizer(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double IconCompatParcelizer(double d, int i) {
        double[] dArr = this.AudioAttributesCompatParcelizer;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr2 = this.AudioAttributesCompatParcelizer;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d2 <= d3) {
                double d4 = dArr2[i2];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                double[][] dArr3 = this.IconCompatParcelizer;
                double d7 = dArr3[i2][0];
                double d8 = dArr3[i3][0];
                double[][] dArr4 = this.read;
                return RemoteActionCompatParcelizer(d5, d6, d7, d8, dArr4[i2][0], dArr4[i3][0]) / d5;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // kotlin._deserializeUsingProperties
    public final double[] AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static deserializeEnumUsingPropertyBased RemoteActionCompatParcelizer(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return write(Arrays.copyOf(dArr, i + 1));
    }

    private static deserializeEnumUsingPropertyBased write(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 << 1) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        return new deserializeEnumUsingPropertyBased(dArr3, dArr2);
    }
}
