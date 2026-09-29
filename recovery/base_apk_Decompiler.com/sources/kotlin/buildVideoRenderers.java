package kotlin;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class buildVideoRenderers {
    private static boolean RemoteActionCompatParcelizer(int i) {
        return i != 0 && i == 1;
    }

    static {
        n.write("PackageManagerHelper");
    }

    public static void RemoteActionCompatParcelizer(Context context, Class<?> cls, boolean z) {
        try {
            if (z == RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(context, cls.getName()))) {
                n.write();
                cls.getName();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
                n.write();
                cls.getName();
            }
        } catch (Exception unused) {
            n.write();
            cls.getName();
        }
    }

    private static int AudioAttributesCompatParcelizer(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }
}
