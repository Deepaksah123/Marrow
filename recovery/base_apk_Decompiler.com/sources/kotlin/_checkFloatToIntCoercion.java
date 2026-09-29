package kotlin;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;

/* JADX INFO: loaded from: classes2.dex */
public final class _checkFloatToIntCoercion {
    public static String AudioAttributesCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }

    public static int read(Context context, String str, String str2) {
        return RemoteActionCompatParcelizer.write((AppOpsManager) RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(context, AppOpsManager.class), str, str2);
    }

    public static int IconCompatParcelizer(Context context, int i, String str, String str2) {
        AppOpsManager appOpsManagerWrite = AudioAttributesCompatParcelizer.write(context);
        int iRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(appOpsManagerWrite, str, Binder.getCallingUid(), str2);
        return iRemoteActionCompatParcelizer != 0 ? iRemoteActionCompatParcelizer : AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(appOpsManagerWrite, str, i, AudioAttributesCompatParcelizer.IconCompatParcelizer(context));
    }

    static class AudioAttributesCompatParcelizer {
        static AppOpsManager write(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        static int RemoteActionCompatParcelizer(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        static String IconCompatParcelizer(Context context) {
            return context.getOpPackageName();
        }
    }

    static class RemoteActionCompatParcelizer {
        static String AudioAttributesCompatParcelizer(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        static <T> T RemoteActionCompatParcelizer(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int write(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }
}
