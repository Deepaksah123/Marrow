package kotlin;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleClickAudienceReporter {
    public static <T> ObjectAnimator RemoteActionCompatParcelizer(T t, Property<T, PointF> property, Path path) {
        return RemoteActionCompatParcelizer.write(t, property, path);
    }

    static class RemoteActionCompatParcelizer {
        static <T, V> ObjectAnimator write(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }
}
