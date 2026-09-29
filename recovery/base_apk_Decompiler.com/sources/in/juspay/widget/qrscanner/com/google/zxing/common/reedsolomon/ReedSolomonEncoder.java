package in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ReedSolomonEncoder {
    private final GenericGF a;
    private final List<GenericGFPoly> b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    private GenericGFPoly a(int i) {
        if (i >= this.b.size()) {
            List<GenericGFPoly> list = this.b;
            GenericGFPoly genericGFPolyC = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                GenericGF genericGF = this.a;
                genericGFPolyC = genericGFPolyC.c(new GenericGFPoly(genericGF, new int[]{1, genericGF.a((size - 1) + genericGF.getGeneratorBase())}));
                this.b.add(genericGFPolyC);
            }
        }
        return this.b.get(i);
    }

    public final void encode(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        GenericGFPoly genericGFPolyA = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrA = new GenericGFPoly(this.a, iArr2).a(i, 1).b(genericGFPolyA)[1].a();
        int length2 = i - iArrA.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrA, 0, iArr, length + length2, iArrA.length);
    }
}
