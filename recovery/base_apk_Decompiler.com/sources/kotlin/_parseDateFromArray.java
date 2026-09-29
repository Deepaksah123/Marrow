package kotlin;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseDateFromArray {
    public static long RemoteActionCompatParcelizer(PackageInfo packageInfo) {
        return RemoteActionCompatParcelizer.write(packageInfo);
    }

    static class RemoteActionCompatParcelizer {
        static long write(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }
}
