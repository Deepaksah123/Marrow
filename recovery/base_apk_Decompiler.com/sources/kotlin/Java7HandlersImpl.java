package kotlin;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Java7HandlersImpl {
    public static boolean IconCompatParcelizer(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof resetAsArray) {
            return ((resetAsArray) viewParent).IconCompatParcelizer(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return IconCompatParcelizer.RemoteActionCompatParcelizer(viewParent, view, view2, i);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void read(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof resetAsArray) {
            ((resetAsArray) viewParent).read(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                IconCompatParcelizer.read(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void AudioAttributesCompatParcelizer(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof resetAsArray) {
            ((resetAsArray) viewParent).RemoteActionCompatParcelizer(view, i);
        } else if (i == 0) {
            try {
                IconCompatParcelizer.AudioAttributesCompatParcelizer(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void write(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof resetAsObject) {
            ((resetAsObject) viewParent).read(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof resetAsArray) {
            ((resetAsArray) viewParent).AudioAttributesCompatParcelizer(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                IconCompatParcelizer.RemoteActionCompatParcelizer(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void IconCompatParcelizer(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof resetAsArray) {
            ((resetAsArray) viewParent).RemoteActionCompatParcelizer(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                IconCompatParcelizer.read(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return IconCompatParcelizer.write(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean AudioAttributesCompatParcelizer(ViewParent viewParent, View view, float f, float f2) {
        try {
            return IconCompatParcelizer.IconCompatParcelizer(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    static class IconCompatParcelizer {
        static boolean RemoteActionCompatParcelizer(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        static void read(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        static void AudioAttributesCompatParcelizer(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        static void RemoteActionCompatParcelizer(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        static void read(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        static boolean write(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        static boolean IconCompatParcelizer(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }
    }
}
