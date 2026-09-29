package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.NotFoundException;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FinderPatternFinder {
    private static final EstimatedModuleComparator f = new EstimatedModuleComparator();
    private final BitMatrix a;
    private final List<FinderPattern> b;
    private boolean c;
    private final int[] d;
    private final ResultPointCallback e;

    static final class EstimatedModuleComparator implements Comparator<FinderPattern>, Serializable {
        private EstimatedModuleComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.a = bitMatrix;
        this.b = new ArrayList();
        this.d = new int[5];
        this.e = resultPointCallback;
    }

    private static double a(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double x = finderPattern.getX() - finderPattern2.getX();
        double y = finderPattern.getY() - finderPattern2.getY();
        return (x * x) + (y * y);
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        BitMatrix bitMatrix = this.a;
        int width = bitMatrix.getWidth();
        int[] iArrB = b();
        int i8 = i;
        while (i8 >= 0 && bitMatrix.get(i8, i2)) {
            iArrB[2] = iArrB[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bitMatrix.get(i8, i2)) {
            int i9 = iArrB[1];
            if (i9 > i3) {
                break;
            }
            iArrB[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrB[1] <= i3) {
            while (i8 >= 0 && bitMatrix.get(i8, i2) && (i7 = iArrB[0]) <= i3) {
                iArrB[0] = i7 + 1;
                i8--;
            }
            if (iArrB[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < width && bitMatrix.get(i10, i2)) {
                iArrB[2] = iArrB[2] + 1;
                i10++;
            }
            if (i10 == width) {
                return Float.NaN;
            }
            while (i10 < width && !bitMatrix.get(i10, i2) && (i6 = iArrB[3]) < i3) {
                iArrB[3] = i6 + 1;
                i10++;
            }
            if (i10 != width && iArrB[3] < i3) {
                while (i10 < width && bitMatrix.get(i10, i2) && (i5 = iArrB[4]) < i3) {
                    iArrB[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrB[4];
                if (i11 < i3 && Math.abs(((((iArrB[0] + iArrB[1]) + iArrB[2]) + iArrB[3]) + i11) - i4) * 5 < i4 && c(iArrB)) {
                    return a(iArrB, i10);
                }
            }
        }
        return Float.NaN;
    }

    private static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private int a() {
        if (this.b.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.b) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.c = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    protected static void a(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    private boolean a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrB = b();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.a.get(i2 - i6, i - i6)) {
            iArrB[2] = iArrB[2] + 1;
            i6++;
        }
        if (iArrB[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.a.get(i2 - i6, i - i6)) {
            iArrB[1] = iArrB[1] + 1;
            i6++;
        }
        if (iArrB[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.a.get(i2 - i6, i - i6)) {
            iArrB[0] = iArrB[0] + 1;
            i6++;
        }
        if (iArrB[0] == 0) {
            return false;
        }
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= height || (i5 = i2 + i7) >= width || !this.a.get(i5, i8)) {
                break;
            }
            iArrB[2] = iArrB[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= height || (i4 = i2 + i7) >= width || this.a.get(i4, i9)) {
                break;
            }
            iArrB[3] = iArrB[3] + 1;
            i7++;
        }
        if (iArrB[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= height || (i3 = i2 + i7) >= width || !this.a.get(i3, i10)) {
                break;
            }
            iArrB[4] = iArrB[4] + 1;
            i7++;
        }
        if (iArrB[4] == 0) {
            return false;
        }
        return d(iArrB);
    }

    private float b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        BitMatrix bitMatrix = this.a;
        int height = bitMatrix.getHeight();
        int[] iArrB = b();
        int i8 = i;
        while (i8 >= 0 && bitMatrix.get(i2, i8)) {
            iArrB[2] = iArrB[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !bitMatrix.get(i2, i8)) {
            int i9 = iArrB[1];
            if (i9 > i3) {
                break;
            }
            iArrB[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrB[1] <= i3) {
            while (i8 >= 0 && bitMatrix.get(i2, i8) && (i7 = iArrB[0]) <= i3) {
                iArrB[0] = i7 + 1;
                i8--;
            }
            if (iArrB[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < height && bitMatrix.get(i2, i10)) {
                iArrB[2] = iArrB[2] + 1;
                i10++;
            }
            if (i10 == height) {
                return Float.NaN;
            }
            while (i10 < height && !bitMatrix.get(i2, i10) && (i6 = iArrB[3]) < i3) {
                iArrB[3] = i6 + 1;
                i10++;
            }
            if (i10 != height && iArrB[3] < i3) {
                while (i10 < height && bitMatrix.get(i2, i10) && (i5 = iArrB[4]) < i3) {
                    iArrB[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrB[4];
                if (i11 < i3 && Math.abs(((((iArrB[0] + iArrB[1]) + iArrB[2]) + iArrB[3]) + i11) - i4) * 5 < (i4 << 1) && c(iArrB)) {
                    return a(iArrB, i10);
                }
            }
        }
        return Float.NaN;
    }

    protected static void b(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private int[] b() {
        a(this.d);
        return this.d;
    }

    private boolean c() {
        int size = this.b.size();
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        float estimatedModuleSize = 0.0f;
        int i = 0;
        for (FinderPattern finderPattern : this.b) {
            if (finderPattern.getCount() >= 2) {
                i++;
                estimatedModuleSize += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i < 3) {
            return false;
        }
        float f2 = estimatedModuleSize / size;
        Iterator<FinderPattern> it = this.b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().getEstimatedModuleSize() - f2);
        }
        return fAbs <= estimatedModuleSize * 0.05f;
    }

    protected static boolean c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 2.0f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    protected static boolean d(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f2 = i / 7.0f;
        float f3 = f2 / 1.333f;
        return Math.abs(f2 - ((float) iArr[0])) < f3 && Math.abs(f2 - ((float) iArr[1])) < f3 && Math.abs((f2 * 3.0f) - ((float) iArr[2])) < 3.0f * f3 && Math.abs(f2 - ((float) iArr[3])) < f3 && Math.abs(f2 - ((float) iArr[4])) < f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[PHI: r16 r18
      0x00b3: PHI (r16v10 double) = (r16v5 double), (r16v2 double) binds: [B:34:0x00b1, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r18v9 double) = (r18v3 double), (r18v0 double) binds: [B:34:0x00b1, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector.FinderPattern[] d() throws in.juspay.widget.qrscanner.com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector.FinderPatternFinder.d():in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector.FinderPattern[]");
    }

    final FinderPatternInfo a(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zC = false;
        while (i2 < height && !zC) {
            a(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < width) {
                if (this.a.get(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (c(iArr) && a(iArr, i2, i3)) {
                    if (this.c) {
                        zC = c();
                    } else {
                        int iA = a();
                        int i5 = iArr[2];
                        if (iA > i5) {
                            i2 += (iA - i5) - 2;
                            i3 = width - 1;
                        }
                    }
                    a(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    b(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (c(iArr) && a(iArr, i2, width)) {
                i = iArr[0];
                if (this.c) {
                    zC = c();
                }
            }
            i2 += i;
        }
        FinderPattern[] finderPatternArrD = d();
        ResultPoint.orderBestPatterns(finderPatternArrD);
        return new FinderPatternInfo(finderPatternArrD);
    }

    protected final boolean a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i2);
        float fB = b(i, iA, iArr[2], i4);
        if (!Float.isNaN(fB)) {
            int i5 = (int) fB;
            float fA = a(iA, i5, iArr[2], i4);
            if (!Float.isNaN(fA) && a(i5, (int) fA)) {
                float f2 = i4 / 7.0f;
                while (true) {
                    if (i3 < this.b.size()) {
                        FinderPattern finderPattern = this.b.get(i3);
                        if (finderPattern.a(f2, fB, fA)) {
                            this.b.set(i3, finderPattern.b(fB, fA, f2));
                            break;
                        }
                        i3++;
                    } else {
                        FinderPattern finderPattern2 = new FinderPattern(fA, fB, f2);
                        this.b.add(finderPattern2);
                        ResultPointCallback resultPointCallback = this.e;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
