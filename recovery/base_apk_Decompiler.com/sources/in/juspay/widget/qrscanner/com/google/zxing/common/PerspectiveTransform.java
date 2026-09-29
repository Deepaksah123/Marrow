package in.juspay.widget.qrscanner.com.google.zxing.common;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class PerspectiveTransform {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private PerspectiveTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f4;
        this.c = f7;
        this.d = f2;
        this.e = f5;
        this.f = f8;
        this.g = f3;
        this.h = f6;
        this.i = f9;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return squareToQuadrilateral(f9, f10, f11, f12, f13, f14, f15, f16).a(quadrilateralToSquare(f, f2, f3, f4, f5, f6, f7, f8));
    }

    public static PerspectiveTransform quadrilateralToSquare(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return squareToQuadrilateral(f, f2, f3, f4, f5, f6, f7, f8).a();
    }

    public static PerspectiveTransform squareToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == BitmapDescriptorFactory.HUE_RED && f10 == BitmapDescriptorFactory.HUE_RED) {
            return new PerspectiveTransform(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new PerspectiveTransform((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    final PerspectiveTransform a() {
        float f = this.e;
        float f2 = this.i;
        float f3 = this.f;
        float f4 = this.h;
        float f5 = this.g;
        float f6 = this.d;
        float f7 = this.c;
        float f8 = this.b;
        float f9 = this.a;
        return new PerspectiveTransform((f * f2) - (f3 * f4), (f3 * f5) - (f6 * f2), (f6 * f4) - (f * f5), (f7 * f4) - (f8 * f2), (f2 * f9) - (f7 * f5), (f5 * f8) - (f4 * f9), (f8 * f3) - (f7 * f), (f7 * f6) - (f3 * f9), (f9 * f) - (f8 * f6));
    }

    final PerspectiveTransform a(PerspectiveTransform perspectiveTransform) {
        float f = this.a;
        float f2 = perspectiveTransform.a;
        float f3 = this.d;
        float f4 = perspectiveTransform.b;
        float f5 = this.g;
        float f6 = perspectiveTransform.c;
        float f7 = perspectiveTransform.d;
        float f8 = perspectiveTransform.e;
        float f9 = perspectiveTransform.f;
        float f10 = perspectiveTransform.g;
        float f11 = perspectiveTransform.h;
        float f12 = perspectiveTransform.i;
        float f13 = this.b;
        float f14 = this.e;
        float f15 = this.h;
        float f16 = this.c;
        float f17 = this.f;
        float f18 = this.i;
        return new PerspectiveTransform((f * f2) + (f3 * f4) + (f5 * f6), (f * f7) + (f3 * f8) + (f5 * f9), (f * f10) + (f3 * f11) + (f5 * f12), (f13 * f2) + (f14 * f4) + (f15 * f6), (f13 * f7) + (f14 * f8) + (f15 * f9), (f13 * f10) + (f14 * f11) + (f15 * f12), (f2 * f16) + (f4 * f17) + (f6 * f18), (f16 * f7) + (f8 * f17) + (f9 * f18), (f16 * f10) + (f17 * f11) + (f18 * f12));
    }

    public final void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.h;
        float f9 = this.i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    public final void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.c * f) + (this.f * f2) + this.i;
            fArr[i] = (((this.a * f) + (this.d * f2)) + this.g) / f3;
            fArr2[i] = (((this.b * f) + (this.e * f2)) + this.h) / f3;
        }
    }
}
