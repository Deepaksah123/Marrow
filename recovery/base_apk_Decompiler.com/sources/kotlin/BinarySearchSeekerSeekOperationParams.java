package kotlin;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class BinarySearchSeekerSeekOperationParams {
    public static final TimeInterpolator write = new LinearInterpolator();
    public static final TimeInterpolator AudioAttributesCompatParcelizer = new _selectSetterFromMultiple();
    public static final TimeInterpolator IconCompatParcelizer = new _findExplicitNames();
    public static final TimeInterpolator RemoteActionCompatParcelizer = new _rawTypeOf();
    public static final TimeInterpolator read = new DecelerateInterpolator();

    public static float read(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : read(f, f2, (f5 - f3) / (f4 - f3));
    }
}
