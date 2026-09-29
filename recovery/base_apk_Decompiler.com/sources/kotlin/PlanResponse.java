package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
final class PlanResponse {
    PlanResponse() {
    }

    public static boolean write(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        return (packageManager == null || packageName == null || packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) ? false : true;
    }
}
