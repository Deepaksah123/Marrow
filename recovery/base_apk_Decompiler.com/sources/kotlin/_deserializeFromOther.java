package kotlin;

import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _deserializeFromOther {
    private int RemoteActionCompatParcelizer;
    public _deserializeUsingProperties read;
    private String write;
    private int[] IconCompatParcelizer = new int[10];
    private float[] AudioAttributesCompatParcelizer = new float[10];

    public String toString() {
        String string = this.write;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("[");
            sb.append(this.IconCompatParcelizer[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.AudioAttributesCompatParcelizer[i]));
            sb.append("] ");
            string = sb.toString();
        }
        return string;
    }

    public final void write(String str) {
        this.write = str;
    }

    public final float AudioAttributesCompatParcelizer(float f) {
        return (float) this.read.RemoteActionCompatParcelizer(f);
    }

    public final float IconCompatParcelizer(float f) {
        return (float) this.read.IconCompatParcelizer(f, 0);
    }

    public void IconCompatParcelizer(int i, float f) {
        int[] iArr = this.IconCompatParcelizer;
        if (iArr.length < this.RemoteActionCompatParcelizer + 1) {
            this.IconCompatParcelizer = Arrays.copyOf(iArr, iArr.length << 1);
            float[] fArr = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = Arrays.copyOf(fArr, fArr.length << 1);
        }
        int[] iArr2 = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        iArr2[i2] = i;
        this.AudioAttributesCompatParcelizer[i2] = f;
        this.RemoteActionCompatParcelizer = i2 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(int r10) {
        /*
            r9 = this;
            int r0 = r9.RemoteActionCompatParcelizer
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.IconCompatParcelizer
            float[] r2 = r9.AudioAttributesCompatParcelizer
            r3 = 1
            int r0 = r0 - r3
            o._deserializeFromOther.read.read(r1, r2, r0)
            r0 = r3
            r1 = r0
        L10:
            int r2 = r9.RemoteActionCompatParcelizer
            if (r0 >= r2) goto L23
            int[] r2 = r9.IconCompatParcelizer
            int r4 = r0 + (-1)
            r4 = r2[r4]
            r2 = r2[r0]
            if (r4 == r2) goto L20
            int r1 = r1 + 1
        L20:
            int r0 = r0 + 1
            goto L10
        L23:
            double[] r0 = new double[r1]
            int[] r1 = new int[]{r1, r3}
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            double[][] r1 = (double[][]) r1
            r2 = 0
            r3 = r2
            r4 = r3
        L34:
            int r5 = r9.RemoteActionCompatParcelizer
            if (r3 >= r5) goto L5f
            if (r3 <= 0) goto L44
            int[] r5 = r9.IconCompatParcelizer
            r6 = r5[r3]
            int r7 = r3 + (-1)
            r5 = r5[r7]
            if (r6 == r5) goto L5c
        L44:
            int[] r5 = r9.IconCompatParcelizer
            r5 = r5[r3]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r4] = r5
            r5 = r1[r4]
            float[] r6 = r9.AudioAttributesCompatParcelizer
            r6 = r6[r3]
            double r6 = (double) r6
            r5[r2] = r6
            int r4 = r4 + 1
        L5c:
            int r3 = r3 + 1
            goto L34
        L5f:
            o._deserializeUsingProperties r10 = kotlin._deserializeUsingProperties.AudioAttributesCompatParcelizer(r10, r0, r1)
            r9.read = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._deserializeFromOther.write(int):void");
    }

    static class read {
        static void read(int[] iArr, float[] fArr, int i) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i;
            iArr2[1] = 0;
            int i2 = 2;
            while (i2 > 0) {
                int i3 = i2 - 1;
                int i4 = iArr2[i3];
                int i5 = i2 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iIconCompatParcelizer = IconCompatParcelizer(iArr, fArr, i4, i6);
                    iArr2[i5] = iIconCompatParcelizer - 1;
                    iArr2[i3] = i4;
                    iArr2[i2] = i6;
                    iArr2[i2 + 1] = iIconCompatParcelizer + 1;
                    i2 += 2;
                } else {
                    i2 = i5;
                }
            }
        }

        private static int IconCompatParcelizer(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    AudioAttributesCompatParcelizer(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            AudioAttributesCompatParcelizer(iArr, fArr, i4, i2);
            return i4;
        }

        private static void AudioAttributesCompatParcelizer(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }
}
