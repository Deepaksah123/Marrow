package kotlin;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/queryIntentActivityOptions;", "Lo/queryInstrumentation;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "read", "(Landroid/app/Activity;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class queryIntentActivityOptions implements queryInstrumentation {
    public static final queryIntentActivityOptions INSTANCE = new queryIntentActivityOptions();

    private queryIntentActivityOptions() {
    }

    @Override // kotlin.queryInstrumentation
    public final Rect read(Activity p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        Rect rect = new Rect();
        Configuration configuration = p0.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (queryContentProviders.INSTANCE.read(p0)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                toMagicModuleMetaRepoModel.read(objInvoke, "");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                toMagicModuleMetaRepoModel.read(objInvoke2, "");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if ((e instanceof NoSuchFieldException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                removePermission.read(p0, rect);
            } else {
                throw e;
            }
        }
        Display defaultDisplay = p0.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!queryContentProviders.INSTANCE.read(p0)) {
            int iAudioAttributesCompatParcelizer = removePermission.AudioAttributesCompatParcelizer(p0);
            if (rect.bottom + iAudioAttributesCompatParcelizer == point.y) {
                rect.bottom += iAudioAttributesCompatParcelizer;
            } else if (rect.right + iAudioAttributesCompatParcelizer == point.x) {
                rect.right += iAudioAttributesCompatParcelizer;
            } else if (rect.left == iAudioAttributesCompatParcelizer) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !queryContentProviders.INSTANCE.read(p0)) {
            toMagicModuleMetaRepoModel.write(defaultDisplay);
            DisplayCutout displayCutoutIconCompatParcelizer = removePermission.IconCompatParcelizer(defaultDisplay);
            if (displayCutoutIconCompatParcelizer != null) {
                if (rect.left == resolveService.INSTANCE.IconCompatParcelizer(displayCutoutIconCompatParcelizer)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == resolveService.INSTANCE.write(displayCutoutIconCompatParcelizer)) {
                    rect.right += resolveService.INSTANCE.write(displayCutoutIconCompatParcelizer);
                }
                if (rect.top == resolveService.INSTANCE.RemoteActionCompatParcelizer(displayCutoutIconCompatParcelizer)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == resolveService.INSTANCE.read(displayCutoutIconCompatParcelizer)) {
                    rect.bottom += resolveService.INSTANCE.read(displayCutoutIconCompatParcelizer);
                }
            }
        }
        return rect;
    }
}
