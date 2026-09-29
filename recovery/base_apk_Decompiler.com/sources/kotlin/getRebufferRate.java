package kotlin;

import android.app.ActivityManager;
import android.os.StatFs;

/* JADX INFO: loaded from: classes2.dex */
public final class getRebufferRate {
    public final ActivityManager RemoteActionCompatParcelizer;
    public final StatFs read;

    public getRebufferRate(ActivityManager activityManager, StatFs statFs) {
        this.RemoteActionCompatParcelizer = activityManager;
        this.read = statFs;
    }
}
