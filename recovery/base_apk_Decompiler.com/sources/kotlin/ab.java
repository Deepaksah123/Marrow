package kotlin;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ab {
    private static final addPermission read = new addPreferredActivity();
    public static final Property<View, Float> IconCompatParcelizer = new Property<View, Float>(Float.class, "translationAlpha") { // from class: o.ab.2
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return write(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            write(view, f);
        }

        private static Float write(View view) {
            return Float.valueOf(ab.write(view));
        }

        private static void write(View view, Float f) {
            ab.write(view, f.floatValue());
        }
    };
    public static final Property<View, Rect> AudioAttributesCompatParcelizer = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: o.ab.4
        @Override // android.util.Property
        public final /* synthetic */ Rect get(View view) {
            return RemoteActionCompatParcelizer(view);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Rect rect) {
            read(view, rect);
        }

        private static Rect RemoteActionCompatParcelizer(View view) {
            return view.getClipBounds();
        }

        private static void read(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    };

    public static void write(View view, float f) {
        read.AudioAttributesCompatParcelizer(view, f);
    }

    public static float write(View view) {
        return read.IconCompatParcelizer(view);
    }

    public static void IconCompatParcelizer(View view) {
        read.RemoteActionCompatParcelizer(view);
    }

    public static void AudioAttributesCompatParcelizer(View view) {
        read.AudioAttributesCompatParcelizer(view);
    }

    public static void IconCompatParcelizer(View view, int i) {
        read.write(view, i);
    }

    public static void IconCompatParcelizer(View view, Matrix matrix) {
        read.IconCompatParcelizer(view, matrix);
    }

    public static void AudioAttributesCompatParcelizer(View view, Matrix matrix) {
        read.AudioAttributesCompatParcelizer(view, matrix);
    }

    public static void RemoteActionCompatParcelizer(View view, Matrix matrix) {
        read.RemoteActionCompatParcelizer(view, matrix);
    }

    public static void write(View view, int i, int i2, int i3, int i4) {
        read.write(view, i, i2, i3, i4);
    }
}
