package kotlin;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
public final class AdWordsRemarketingReporter {
    public static PropertyValuesHolder IconCompatParcelizer(Property<?, PointF> property, Path path) {
        return RemoteActionCompatParcelizer.IconCompatParcelizer(property, path);
    }

    static class RemoteActionCompatParcelizer {
        static <V> PropertyValuesHolder IconCompatParcelizer(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }
}
