package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class getMaxSupportedInstancesV23 {
    private boolean AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final flushHandlerThread RemoteActionCompatParcelizer;
    private final SharedPreferences read;

    public getMaxSupportedInstancesV23(Context context, String str, flushHandlerThread flushhandlerthread) {
        Context contextWrite = write(context);
        this.IconCompatParcelizer = contextWrite;
        this.read = contextWrite.getSharedPreferences("com.google.firebase.common.prefs:".concat(String.valueOf(str)), 0);
        this.RemoteActionCompatParcelizer = flushhandlerthread;
        this.AudioAttributesCompatParcelizer = write();
    }

    private static Context write(Context context) {
        return _isNaN.createDeviceProtectedStorageContext(context);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        boolean z;
        synchronized (this) {
            z = this.AudioAttributesCompatParcelizer;
        }
        return z;
    }

    private boolean RemoteActionCompatParcelizer() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.IconCompatParcelizer.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.IconCompatParcelizer.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return ((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private boolean write() {
        if (this.read.contains("firebase_data_collection_default_enabled")) {
            return this.read.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return RemoteActionCompatParcelizer();
    }
}
