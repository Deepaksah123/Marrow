package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes5.dex */
public final class FinderPattern extends ResultPoint {
    private final float c;
    private final int d;

    FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.c = f3;
        this.d = i;
    }

    final boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.c);
        return fAbs <= 1.0f || fAbs <= this.c;
    }

    final FinderPattern b(float f, float f2, float f3) {
        int i = this.d;
        int i2 = i + 1;
        float f4 = i2;
        return new FinderPattern(((i * getX()) + f2) / f4, ((this.d * getY()) + f) / f4, ((this.d * this.c) + f3) / f4, i2);
    }

    public final int getCount() {
        return this.d;
    }

    public final float getEstimatedModuleSize() {
        return this.c;
    }
}
