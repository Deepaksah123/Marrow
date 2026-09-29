package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

import in.juspay.widget.qrscanner.com.google.zxing.NotFoundException;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AlignmentPatternFinder {
    private final BitMatrix a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final ResultPointCallback i;
    private final List<AlignmentPattern> b = new ArrayList(5);
    private final int[] h = new int[3];

    AlignmentPatternFinder(BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, ResultPointCallback resultPointCallback) {
        this.a = bitMatrix;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = resultPointCallback;
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        BitMatrix bitMatrix = this.a;
        int height = bitMatrix.getHeight();
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && bitMatrix.get(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !bitMatrix.get(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            while (true) {
                i++;
                if (i >= height || !bitMatrix.get(i2, i) || (i5 = iArr[1]) > i3) {
                    break;
                }
                iArr[1] = i5 + 1;
            }
            if (i != height && iArr[1] <= i3) {
                while (i < height && !bitMatrix.get(i2, i)) {
                    int i9 = iArr[2];
                    if (i9 > i3) {
                        break;
                    }
                    iArr[2] = i9 + 1;
                    i++;
                }
                int i10 = iArr[2];
                if (i10 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i10) - i4) * 5 < (i4 << 1) && a(iArr)) {
                    return a(iArr, i);
                }
            }
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    private AlignmentPattern a(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        float fA = a(iArr, i2);
        float fA2 = a(i, (int) fA, iArr[1] << 1, i3 + i4 + i5);
        if (Float.isNaN(fA2)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (AlignmentPattern alignmentPattern : this.b) {
            if (alignmentPattern.a(f, fA2, fA)) {
                return alignmentPattern.b(fA2, fA, f);
            }
        }
        AlignmentPattern alignmentPattern2 = new AlignmentPattern(fA, fA2, f);
        this.b.add(alignmentPattern2);
        ResultPointCallback resultPointCallback = this.i;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
        return null;
    }

    private boolean a(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    final AlignmentPattern a() throws NotFoundException {
        AlignmentPattern alignmentPatternA;
        AlignmentPattern alignmentPatternA2;
        int i = this.c;
        int i2 = this.f;
        int i3 = this.e + i;
        int i4 = this.d;
        int i5 = i2 / 2;
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = ((i6 & 1) == 0 ? (i6 + 1) / 2 : -((i6 + 1) / 2)) + i4 + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i;
            while (i8 < i3 && !this.a.get(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i3) {
                if (!this.a.get(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else {
                    if (a(iArr) && (alignmentPatternA2 = a(iArr, i7, i8)) != null) {
                        return alignmentPatternA2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (a(iArr) && (alignmentPatternA = a(iArr, i7, i3)) != null) {
                return alignmentPatternA;
            }
        }
        if (this.b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.b.get(0);
    }
}
