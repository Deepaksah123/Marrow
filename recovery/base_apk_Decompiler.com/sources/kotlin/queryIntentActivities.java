package kotlin;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/queryIntentActivities;", "Lo/queryInstrumentation;", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/graphics/Rect;", "read", "(Landroid/app/Activity;)Landroid/graphics/Rect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class queryIntentActivities implements queryInstrumentation {
    public static final queryIntentActivities INSTANCE = new queryIntentActivities();

    private queryIntentActivities() {
    }

    @Override // kotlin.queryInstrumentation
    public final Rect read(Activity p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        Configuration configuration = p0.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            toMagicModuleMetaRepoModel.read(objInvoke, "");
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if ((e instanceof NoSuchFieldException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                return queryIntentActivityOptions.INSTANCE.read(p0);
            }
            throw e;
        }
    }
}
