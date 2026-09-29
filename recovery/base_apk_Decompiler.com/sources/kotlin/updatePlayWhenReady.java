package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class updatePlayWhenReady {
    public static final boolean AudioAttributesCompatParcelizer(Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                context = null;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
                return false;
            }
            return AudioAttributesCompatParcelizer(baseContext);
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return activity.isDestroyed();
    }
}
