package in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes5.dex */
public final class GenericGFPoly {
    private final GenericGF a;
    private final int[] b;

    GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = genericGF;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    final int a(int i) {
        if (i == 0) {
            return b(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : this.b) {
                iA = GenericGF.a(iA, i2);
            }
            return iA;
        }
        int[] iArr = this.b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iA2 = GenericGF.a(this.a.c(i, iA2), this.b[i3]);
        }
        return iA2;
    }

    final GenericGFPoly a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.b();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.c(this.b[i3], i2);
        }
        return new GenericGFPoly(this.a, iArr);
    }

    final GenericGFPoly a(GenericGFPoly genericGFPoly) {
        if (!this.a.equals(genericGFPoly.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return genericGFPoly;
        }
        if (genericGFPoly.c()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = genericGFPoly.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = GenericGF.a(iArr2[i - length], iArr[i]);
        }
        return new GenericGFPoly(this.a, iArr3);
    }

    final int[] a() {
        return this.b;
    }

    final int b() {
        return this.b.length - 1;
    }

    final int b(int i) {
        return this.b[(r1.length - 1) - i];
    }

    final GenericGFPoly[] b(GenericGFPoly genericGFPoly) {
        if (!this.a.equals(genericGFPoly.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly genericGFPolyB = this.a.b();
        int iB = this.a.b(genericGFPoly.b(genericGFPoly.b()));
        GenericGFPoly genericGFPolyA = this;
        while (genericGFPolyA.b() >= genericGFPoly.b() && !genericGFPolyA.c()) {
            int iB2 = genericGFPolyA.b() - genericGFPoly.b();
            int iC = this.a.c(genericGFPolyA.b(genericGFPolyA.b()), iB);
            GenericGFPoly genericGFPolyA2 = genericGFPoly.a(iB2, iC);
            genericGFPolyB = genericGFPolyB.a(this.a.b(iB2, iC));
            genericGFPolyA = genericGFPolyA.a(genericGFPolyA2);
        }
        return new GenericGFPoly[]{genericGFPolyB, genericGFPolyA};
    }

    final GenericGFPoly c(int i) {
        if (i == 0) {
            return this.a.b();
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.a.c(this.b[i2], i);
        }
        return new GenericGFPoly(this.a, iArr);
    }

    final GenericGFPoly c(GenericGFPoly genericGFPoly) {
        if (!this.a.equals(genericGFPoly.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c() || genericGFPoly.c()) {
            return this.a.b();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = GenericGF.a(iArr3[i4], this.a.c(i2, iArr2[i3]));
            }
        }
        return new GenericGFPoly(this.a, iArr3);
    }

    final boolean c() {
        return this.b[0] == 0;
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder(b() << 3);
        for (int iB = b(); iB >= 0; iB--) {
            int iB2 = b(iB);
            if (iB2 != 0) {
                if (iB2 < 0) {
                    sb.append(" - ");
                    iB2 = -iB2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || iB2 != 1) {
                    int iC = this.a.c(iB2);
                    if (iC == 0) {
                        c = '1';
                    } else if (iC == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(iC);
                    }
                    sb.append(c);
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
