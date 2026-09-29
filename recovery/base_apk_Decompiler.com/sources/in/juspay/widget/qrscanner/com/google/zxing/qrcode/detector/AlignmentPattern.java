package in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector;

import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes5.dex */
public final class AlignmentPattern extends ResultPoint {
    private final float c;

    AlignmentPattern(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
    }

    final boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.c);
        return fAbs <= 1.0f || fAbs <= this.c;
    }

    final AlignmentPattern b(float f, float f2, float f3) {
        return new AlignmentPattern((getX() + f2) / 2.0f, (getY() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
