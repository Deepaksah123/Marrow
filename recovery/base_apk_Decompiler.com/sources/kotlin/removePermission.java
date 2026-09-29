package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import in.juspay.hyper.constants.LogSubCategory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.queryInstrumentation;

/* JADX INFO: loaded from: classes2.dex */
public final class removePermission {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", LogSubCategory.LifeCycle.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayCutout IconCompatParcelizer(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if ((e instanceof ClassNotFoundException) || (e instanceof NoSuchMethodException) || (e instanceof NoSuchFieldException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException) || (e instanceof InstantiationException)) {
                queryInstrumentation.Companion companion = queryInstrumentation.INSTANCE;
                return null;
            }
            throw e;
        }
    }
}
