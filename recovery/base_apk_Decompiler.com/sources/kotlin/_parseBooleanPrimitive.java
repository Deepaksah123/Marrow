package kotlin;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseBooleanPrimitive {
    private static int RemoteActionCompatParcelizer(Context context, String str, int i, int i2, String str2) {
        int iIconCompatParcelizer;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strAudioAttributesCompatParcelizer = _checkFloatToIntCoercion.AudioAttributesCompatParcelizer(str);
        if (strAudioAttributesCompatParcelizer == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i2 && configureFromStringCreator.RemoteActionCompatParcelizer((Object) packageName, (Object) str2)) {
            iIconCompatParcelizer = _checkFloatToIntCoercion.IconCompatParcelizer(context, i2, strAudioAttributesCompatParcelizer, str2);
        } else {
            iIconCompatParcelizer = _checkFloatToIntCoercion.read(context, strAudioAttributesCompatParcelizer, str2);
        }
        return iIconCompatParcelizer == 0 ? 0 : -2;
    }

    public static int read(Context context, String str) {
        return RemoteActionCompatParcelizer(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
