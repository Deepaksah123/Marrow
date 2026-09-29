package in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes5.dex */
public final class ReedSolomonDecoder {
    private final GenericGF a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.a = genericGF;
    }

    private int[] a(GenericGFPoly genericGFPoly) throws ReedSolomonException {
        int iB = genericGFPoly.b();
        if (iB == 1) {
            return new int[]{genericGFPoly.b(1)};
        }
        int[] iArr = new int[iB];
        int i = 0;
        for (int i2 = 1; i2 < this.a.getSize() && i < iB; i2++) {
            if (genericGFPoly.a(i2) == 0) {
                iArr[i] = this.a.b(i2);
                i++;
            }
        }
        if (i == iB) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] a(GenericGFPoly genericGFPoly, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iB = this.a.b(iArr[i]);
            int iC = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iC2 = this.a.c(iArr[i2], iB);
                    iC = this.a.c(iC, (iC2 & 1) == 0 ? iC2 | 1 : iC2 & (-2));
                }
            }
            iArr2[i] = this.a.c(genericGFPoly.a(iB), this.a.b(iC));
            if (this.a.getGeneratorBase() != 0) {
                iArr2[i] = this.a.c(iArr2[i], iB);
            }
        }
        return iArr2;
    }

    private GenericGFPoly[] a(GenericGFPoly genericGFPoly, GenericGFPoly genericGFPoly2, int i) throws ReedSolomonException {
        if (genericGFPoly.b() >= genericGFPoly2.b()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        GenericGFPoly genericGFPolyB = this.a.b();
        GenericGFPoly genericGFPolyA = this.a.a();
        while (genericGFPoly.b() >= i / 2) {
            if (genericGFPoly.c()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            GenericGFPoly genericGFPolyB2 = this.a.b();
            int iB = this.a.b(genericGFPoly.b(genericGFPoly.b()));
            while (genericGFPoly2.b() >= genericGFPoly.b() && !genericGFPoly2.c()) {
                int iB2 = genericGFPoly2.b() - genericGFPoly.b();
                int iC = this.a.c(genericGFPoly2.b(genericGFPoly2.b()), iB);
                genericGFPolyB2 = genericGFPolyB2.a(this.a.b(iB2, iC));
                genericGFPoly2 = genericGFPoly2.a(genericGFPoly.a(iB2, iC));
            }
            GenericGFPoly genericGFPolyA2 = genericGFPolyB2.c(genericGFPolyA).a(genericGFPolyB);
            if (genericGFPoly2.b() >= genericGFPoly.b()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            GenericGFPoly genericGFPoly3 = genericGFPoly2;
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly3;
            GenericGFPoly genericGFPoly4 = genericGFPolyA;
            genericGFPolyA = genericGFPolyA2;
            genericGFPolyB = genericGFPoly4;
        }
        int iB3 = genericGFPolyA.b(0);
        if (iB3 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int iB4 = this.a.b(iB3);
        return new GenericGFPoly[]{genericGFPolyA.c(iB4), genericGFPoly.c(iB4)};
    }

    public final void decode(int[] iArr, int i) throws ReedSolomonException {
        GenericGFPoly genericGFPoly = new GenericGFPoly(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            GenericGF genericGF = this.a;
            int iA = genericGFPoly.a(genericGF.a(genericGF.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = iA;
            if (iA != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        GenericGFPoly[] genericGFPolyArrA = a(this.a.b(i, 1), new GenericGFPoly(this.a, iArr2), i);
        GenericGFPoly genericGFPoly2 = genericGFPolyArrA[0];
        GenericGFPoly genericGFPoly3 = genericGFPolyArrA[1];
        int[] iArrA = a(genericGFPoly2);
        int[] iArrA2 = a(genericGFPoly3, iArrA);
        for (int i3 = 0; i3 < iArrA.length; i3++) {
            int length = (iArr.length - 1) - this.a.c(iArrA[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = GenericGF.a(iArr[length], iArrA2[i3]);
        }
    }
}
