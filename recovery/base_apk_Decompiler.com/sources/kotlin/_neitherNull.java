package kotlin;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes4.dex */
public final class _neitherNull {
    @Deprecated
    public static boolean RemoteActionCompatParcelizer(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
