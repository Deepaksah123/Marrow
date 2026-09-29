package kotlin;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _deserializeLocale {
    public _deserializeUsingProperties AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public String IconCompatParcelizer;
    public int read = 0;
    private int[] AudioAttributesImplBaseParcelizer = new int[10];
    private float[][] MediaBrowserCompatCustomActionResultReceiver = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    public float[] RemoteActionCompatParcelizer = new float[3];
    public boolean write = false;
    private float MediaBrowserCompatItemReceiver = Float.NaN;

    public String toString() {
        String string = this.IconCompatParcelizer;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.AudioAttributesImplApi26Parcelizer; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("[");
            sb.append(this.AudioAttributesImplBaseParcelizer[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.MediaBrowserCompatCustomActionResultReceiver[i]));
            sb.append("] ");
            string = sb.toString();
        }
        return string;
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
    }

    protected final float write(float f) {
        switch (this.read) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                return 1.0f - Math.abs(f);
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                return 1.0f - (((f * 2.0f) + 1.0f) % 2.0f);
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                return 1.0f - (fAbs * fAbs);
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
    }

    public void read(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        iArr[i3] = i;
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.read = Math.max(this.read, i2);
        this.AudioAttributesImplApi26Parcelizer++;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void IconCompatParcelizer(int r12) {
        /*
            r11 = this;
            int r0 = r11.AudioAttributesImplApi26Parcelizer
            if (r0 != 0) goto L1a
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error no points added to "
            r0.<init>(r1)
            java.lang.String r11 = r11.IconCompatParcelizer
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.println(r11)
            return
        L1a:
            int[] r1 = r11.AudioAttributesImplBaseParcelizer
            float[][] r2 = r11.MediaBrowserCompatCustomActionResultReceiver
            r3 = 1
            int r0 = r0 - r3
            o._deserializeLocale.RemoteActionCompatParcelizer.read(r1, r2, r0)
            r0 = 0
            r2 = r0
            r1 = r3
        L26:
            int[] r4 = r11.AudioAttributesImplBaseParcelizer
            int r5 = r4.length
            if (r1 >= r5) goto L38
            r5 = r4[r1]
            int r6 = r1 + (-1)
            r4 = r4[r6]
            if (r5 == r4) goto L35
            int r2 = r2 + 1
        L35:
            int r1 = r1 + 1
            goto L26
        L38:
            if (r2 != 0) goto L3b
            r2 = r3
        L3b:
            double[] r1 = new double[r2]
            r4 = 3
            int[] r2 = new int[]{r2, r4}
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)
            double[][] r2 = (double[][]) r2
            r4 = r0
            r5 = r4
        L4c:
            int r6 = r11.AudioAttributesImplApi26Parcelizer
            if (r4 >= r6) goto L84
            if (r4 <= 0) goto L5c
            int[] r6 = r11.AudioAttributesImplBaseParcelizer
            r7 = r6[r4]
            int r8 = r4 + (-1)
            r6 = r6[r8]
            if (r7 == r6) goto L81
        L5c:
            int[] r6 = r11.AudioAttributesImplBaseParcelizer
            r6 = r6[r4]
            double r6 = (double) r6
            r8 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r6 = r6 * r8
            r1[r5] = r6
            r6 = r2[r5]
            float[][] r7 = r11.MediaBrowserCompatCustomActionResultReceiver
            r7 = r7[r4]
            r8 = r7[r0]
            double r8 = (double) r8
            r6[r0] = r8
            r8 = r7[r3]
            double r8 = (double) r8
            r6[r3] = r8
            r8 = 2
            r7 = r7[r8]
            double r9 = (double) r7
            r6[r8] = r9
            int r5 = r5 + 1
        L81:
            int r4 = r4 + 1
            goto L4c
        L84:
            o._deserializeUsingProperties r12 = kotlin._deserializeUsingProperties.AudioAttributesCompatParcelizer(r12, r1, r2)
            r11.AudioAttributesCompatParcelizer = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._deserializeLocale.IconCompatParcelizer(int):void");
    }

    protected static class RemoteActionCompatParcelizer {
        protected RemoteActionCompatParcelizer() {
        }

        static void read(int[] iArr, float[][] fArr, int i) {
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
                    int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iArr, fArr, i4, i6);
                    iArr2[i5] = iAudioAttributesCompatParcelizer - 1;
                    iArr2[i3] = i4;
                    iArr2[i2] = i6;
                    iArr2[i2 + 1] = iAudioAttributesCompatParcelizer + 1;
                    i2 += 2;
                } else {
                    i2 = i5;
                }
            }
        }

        private static int AudioAttributesCompatParcelizer(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    IconCompatParcelizer(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            IconCompatParcelizer(iArr, fArr, i4, i2);
            return i4;
        }

        private static void IconCompatParcelizer(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }
}
