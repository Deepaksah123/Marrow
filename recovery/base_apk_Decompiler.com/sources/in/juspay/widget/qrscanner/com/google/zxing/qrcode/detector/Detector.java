package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.FormatException;
import in.juspay.widget.qrscanner.com.google.zxing.NotFoundException;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import in.juspay.widget.qrscanner.com.google.zxing.common.DetectorResult;
import in.juspay.widget.qrscanner.com.google.zxing.common.GridSampler;
import in.juspay.widget.qrscanner.com.google.zxing.common.PerspectiveTransform;
import in.juspay.widget.qrscanner.com.google.zxing.common.detector.MathUtils;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Detector {
    private final BitMatrix a;
    private ResultPointCallback b;

    public Detector(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r14 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        return in.juspay.widget.qrscanner.com.google.zxing.common.detector.MathUtils.distance(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float a(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r15 = r4
            r14 = 0
        L41:
            if (r13 == r5) goto L82
            if (r0 == 0) goto L47
            r2 = r15
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r15
        L4d:
            if (r14 != r3) goto L57
            r16 = r0
            r0 = r3
            r19 = r5
            r3 = r17
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix r5 = r3.a
            boolean r2 = r5.get(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r14 != r0) goto L6e
            float r0 = in.juspay.widget.qrscanner.com.google.zxing.common.detector.MathUtils.distance(r13, r15, r1, r4)
            return r0
        L6e:
            int r14 = r14 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L7a
            if (r15 == r6) goto L78
            int r15 = r15 + r11
            int r9 = r9 - r7
            goto L7a
        L78:
            r0 = 2
            goto L85
        L7a:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L82:
            r19 = r5
            r0 = r10
        L85:
            if (r14 != r0) goto L8e
            r5 = r19
            float r0 = in.juspay.widget.qrscanner.com.google.zxing.common.detector.MathUtils.distance(r5, r6, r1, r4)
            return r0
        L8e:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector.Detector.a(int, int, int, int):float");
    }

    private float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float fB = b((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float fB2 = b((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        return Float.isNaN(fB) ? fB2 / 7.0f : Float.isNaN(fB2) ? fB / 7.0f : (fB + fB2) / 14.0f;
    }

    private static int a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f) throws NotFoundException {
        int iRound = (MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f)) / 2;
        int i = iRound + 7;
        int i2 = i & 3;
        if (i2 == 0) {
            return iRound + 8;
        }
        if (i2 == 2) {
            return iRound + 6;
        }
        if (i2 != 3) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static BitMatrix a(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i, i, perspectiveTransform);
    }

    private static PerspectiveTransform a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i) {
        float x;
        float y;
        float f;
        float f2 = i - 3.5f;
        if (resultPoint4 != null) {
            x = resultPoint4.getX();
            y = resultPoint4.getY();
            f = f2 - 3.0f;
        } else {
            x = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f = f2;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x, y, resultPoint3.getX(), resultPoint3.getY());
    }

    private float b(int i, int i2, int i3, int i4) {
        float width;
        float height;
        float fA = a(i, i2, i3, i4);
        int width2 = i - (i3 - i);
        int height2 = 0;
        if (width2 < 0) {
            width = i / (i - width2);
            width2 = 0;
        } else if (width2 >= this.a.getWidth()) {
            width = ((this.a.getWidth() - 1) - i) / (width2 - i);
            width2 = this.a.getWidth() - 1;
        } else {
            width = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * width));
        if (i5 < 0) {
            height = f / (i2 - i5);
        } else if (i5 >= this.a.getHeight()) {
            height = ((this.a.getHeight() - 1) - i2) / (i5 - i2);
            height2 = this.a.getHeight() - 1;
        } else {
            height2 = i5;
            height = 1.0f;
        }
        return (fA + a(i, i2, (int) (i + ((width2 - i) * height)), height2)) - 1.0f;
    }

    protected final float a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (a(resultPoint, resultPoint2) + a(resultPoint, resultPoint3)) / 2.0f;
    }

    protected final DetectorResult a(FinderPatternInfo finderPatternInfo) throws FormatException, NotFoundException {
        AlignmentPattern alignmentPatternA;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float fA = a(topLeft, topRight, bottomLeft);
        if (fA < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iA = a(topLeft, topRight, bottomLeft, fA);
        Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(iA);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion();
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
            float x = topRight.getX();
            float x2 = topLeft.getX();
            float x3 = bottomLeft.getX();
            float y = topRight.getY();
            float y2 = topLeft.getY();
            float y3 = bottomLeft.getY();
            float f = 1.0f - (3.0f / (dimensionForVersion - 7));
            int x4 = (int) (topLeft.getX() + ((((x - x2) + x3) - topLeft.getX()) * f));
            int y4 = (int) (topLeft.getY() + (f * (((y - y2) + y3) - topLeft.getY())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    alignmentPatternA = a(fA, x4, y4, i);
                    break;
                } catch (NotFoundException unused) {
                }
            }
            alignmentPatternA = null;
        } else {
            alignmentPatternA = null;
        }
        return new DetectorResult(a(this.a, a(topLeft, topRight, bottomLeft, alignmentPatternA, iA), iA), alignmentPatternA == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPatternA});
    }

    protected final AlignmentPattern a(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.a.getWidth() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(this.a.getHeight() - 1, i2 + i3) - iMax2;
        if (iMin2 >= f3) {
            return new AlignmentPatternFinder(this.a, iMax, iMax2, iMin, iMin2, f, this.b).a();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public DetectorResult detect() {
        return detect(null);
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) {
        this.b = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return a(new FinderPatternFinder(this.a, this.b).a(map));
    }
}
