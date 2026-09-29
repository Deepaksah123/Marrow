package kotlin;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class _findExplicitStringFactoryMethod {
    public static boolean read(Context context) {
        return read.read(context);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class read {
        static boolean read(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }
}
