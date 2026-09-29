package kotlin;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class forBuilder {
    public static Interpolator read(Path path) {
        return IconCompatParcelizer.write(path);
    }

    public static Interpolator IconCompatParcelizer(float f, float f2, float f3, float f4) {
        return IconCompatParcelizer.IconCompatParcelizer(f, f2, f3, f4);
    }

    static class IconCompatParcelizer {
        static Interpolator write(Path path) {
            return new PathInterpolator(path);
        }

        static Interpolator IconCompatParcelizer(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }
    }
}
