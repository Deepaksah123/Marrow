package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeEmbedded extends _deserializeUsingProperties {
    private boolean AudioAttributesCompatParcelizer = true;
    private double[][] IconCompatParcelizer;
    private double[] RemoteActionCompatParcelizer;
    private double read;
    private double[] write;

    public _deserializeEmbedded(double[] dArr, double[][] dArr2) {
        this.read = Double.NaN;
        int length = dArr2[0].length;
        this.RemoteActionCompatParcelizer = new double[length];
        this.write = dArr;
        this.IconCompatParcelizer = dArr2;
        if (length > 2) {
            for (int i = 0; i < dArr.length; i++) {
                double d = dArr2[i][0];
            }
            this.read = 0.0d;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final void read(double d, double[] dArr) {
        double[] dArr2 = this.write;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.IconCompatParcelizer[0].length;
        if (this.AudioAttributesCompatParcelizer) {
            double d2 = dArr2[0];
            if (d <= d2) {
                AudioAttributesCompatParcelizer(d2, this.RemoteActionCompatParcelizer);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.IconCompatParcelizer[0][i2] + ((d - this.write[0]) * this.RemoteActionCompatParcelizer[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                AudioAttributesCompatParcelizer(d3, this.RemoteActionCompatParcelizer);
                while (i < length2) {
                    dArr[i] = this.IconCompatParcelizer[i3][i] + ((d - this.write[i3]) * this.RemoteActionCompatParcelizer[i]);
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
            if (d == this.write[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.IconCompatParcelizer[i6][i7];
                }
            }
            double[] dArr3 = this.write;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.IconCompatParcelizer;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final void AudioAttributesCompatParcelizer(double d, float[] fArr) {
        double[] dArr = this.write;
        int length = dArr.length;
        int i = 0;
        int length2 = this.IconCompatParcelizer[0].length;
        if (this.AudioAttributesCompatParcelizer) {
            double d2 = dArr[0];
            if (d <= d2) {
                AudioAttributesCompatParcelizer(d2, this.RemoteActionCompatParcelizer);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.IconCompatParcelizer[0][i2] + ((d - this.write[0]) * this.RemoteActionCompatParcelizer[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                AudioAttributesCompatParcelizer(d3, this.RemoteActionCompatParcelizer);
                while (i < length2) {
                    fArr[i] = (float) (this.IconCompatParcelizer[i3][i] + ((d - this.write[i3]) * this.RemoteActionCompatParcelizer[i]));
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
            if (d == this.write[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.IconCompatParcelizer[i6][i7];
                }
            }
            double[] dArr2 = this.write;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.IconCompatParcelizer;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double RemoteActionCompatParcelizer(double d) {
        double[] dArr = this.write;
        int length = dArr.length;
        if (this.AudioAttributesCompatParcelizer) {
            double d2 = dArr[0];
            if (d <= d2) {
                return this.IconCompatParcelizer[0][0] + ((d - d2) * IconCompatParcelizer(d2, 0));
            }
            int i = length - 1;
            double d3 = dArr[i];
            if (d >= d3) {
                return this.IconCompatParcelizer[i][0] + ((d - d3) * IconCompatParcelizer(d3, 0));
            }
        } else {
            if (d <= dArr[0]) {
                return this.IconCompatParcelizer[0][0];
            }
            int i2 = length - 1;
            if (d >= dArr[i2]) {
                return this.IconCompatParcelizer[i2][0];
            }
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr2 = this.write;
            double d4 = dArr2[i3];
            if (d == d4) {
                return this.IconCompatParcelizer[i3][0];
            }
            int i4 = i3 + 1;
            double d5 = dArr2[i4];
            if (d < d5) {
                double d6 = (d - d4) / (d5 - d4);
                double[][] dArr3 = this.IconCompatParcelizer;
                return (dArr3[i3][0] * (1.0d - d6)) + (dArr3[i4][0] * d6);
            }
            i3 = i4;
        }
        return 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v6 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin._deserializeUsingProperties
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.write
            int r1 = r0.length
            double[][] r2 = r12.IconCompatParcelizer
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L42
            double[] r4 = r12.write
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L40
            r13 = r4[r0]
        L2b:
            if (r3 >= r2) goto L42
            double[][] r1 = r12.IconCompatParcelizer
            r4 = r1[r0]
            r8 = r4[r3]
            r1 = r1[r5]
            r10 = r1[r3]
            double r10 = r10 - r8
            double r8 = r6 - r13
            double r10 = r10 / r8
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2b
        L40:
            r0 = r5
            goto L1b
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._deserializeEmbedded.AudioAttributesCompatParcelizer(double, double[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r2
      0x000a: PHI (r2v5 double) = (r2v0 double), (r2v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin._deserializeUsingProperties
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double IconCompatParcelizer(double r9, int r11) {
        /*
            r8 = this;
            double[] r11 = r8.write
            int r0 = r11.length
            r1 = 0
            r2 = r11[r1]
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
        La:
            r9 = r2
            goto L15
        Lc:
            int r2 = r0 + (-1)
            r2 = r11[r2]
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 < 0) goto L15
            goto La
        L15:
            r11 = r1
        L16:
            int r2 = r0 + (-1)
            if (r11 >= r2) goto L36
            double[] r2 = r8.write
            int r3 = r11 + 1
            r4 = r2[r3]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L34
            r9 = r2[r11]
            double[][] r8 = r8.IconCompatParcelizer
            r11 = r8[r11]
            r6 = r11[r1]
            r8 = r8[r3]
            r0 = r8[r1]
            double r0 = r0 - r6
            double r4 = r4 - r9
            double r0 = r0 / r4
            return r0
        L34:
            r11 = r3
            goto L16
        L36:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._deserializeEmbedded.IconCompatParcelizer(double, int):double");
    }

    @Override // kotlin._deserializeUsingProperties
    public final double[] AudioAttributesCompatParcelizer() {
        return this.write;
    }
}
