package kotlin;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class IntentSenderRequest {
    private static final int[] RemoteActionCompatParcelizer = {R.attr.state_checked};
    private static final int[] IconCompatParcelizer = new int[0];
    public static final Rect write = new Rect();

    public static boolean write() {
        return true;
    }

    public static Rect write(Drawable drawable) {
        Insets insets = RemoteActionCompatParcelizer.read(drawable);
        return new Rect(insets.left, insets.top, insets.right, insets.bottom);
    }

    static void read(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        IconCompatParcelizer(drawable);
    }

    private static void IconCompatParcelizer(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(RemoteActionCompatParcelizer);
        } else {
            drawable.setState(IconCompatParcelizer);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode write(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static class RemoteActionCompatParcelizer {
        static Insets read(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
