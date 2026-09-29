package kotlin;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class setChecked {
    public static final boolean RemoteActionCompatParcelizer = true;
    private static Method write;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            write = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            write.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean AudioAttributesCompatParcelizer(View view) {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 1;
    }

    public static void read(View view, Rect rect, Rect rect2) {
        Method method = write;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static void read(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
