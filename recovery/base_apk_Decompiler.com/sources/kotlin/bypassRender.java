package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class bypassRender {
    private final Context AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer = 0;
    private String RemoteActionCompatParcelizer;
    private int read;
    private String write;

    bypassRender(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    final boolean IconCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer() != 0;
    }

    private int AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.AudioAttributesCompatParcelizer.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                    this.IconCompatParcelizer = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                this.IconCompatParcelizer = 2;
                return 2;
            }
            if (PlatformVersion.isAtLeastO()) {
                this.IconCompatParcelizer = 2;
            } else {
                this.IconCompatParcelizer = 1;
            }
            return this.IconCompatParcelizer;
        }
    }

    static String AudioAttributesCompatParcelizer(FirebaseApp firebaseApp) {
        String strIconCompatParcelizer = firebaseApp.read().IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            return strIconCompatParcelizer;
        }
        String strRemoteActionCompatParcelizer = firebaseApp.read().RemoteActionCompatParcelizer();
        if (!strRemoteActionCompatParcelizer.startsWith("1:")) {
            return strRemoteActionCompatParcelizer;
        }
        String[] strArrSplit = strRemoteActionCompatParcelizer.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    final String read() {
        String str;
        synchronized (this) {
            if (this.write == null) {
                write();
            }
            str = this.write;
        }
        return str;
    }

    final String AudioAttributesCompatParcelizer() {
        String str;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                write();
            }
            str = this.RemoteActionCompatParcelizer;
        }
        return str;
    }

    final int RemoteActionCompatParcelizer() {
        int i;
        PackageInfo packageInfoIconCompatParcelizer;
        synchronized (this) {
            if (this.read == 0 && (packageInfoIconCompatParcelizer = IconCompatParcelizer("com.google.android.gms")) != null) {
                this.read = packageInfoIconCompatParcelizer.versionCode;
            }
            i = this.read;
        }
        return i;
    }

    private void write() {
        synchronized (this) {
            PackageInfo packageInfoIconCompatParcelizer = IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getPackageName());
            if (packageInfoIconCompatParcelizer != null) {
                this.write = Integer.toString(packageInfoIconCompatParcelizer.versionCode);
                this.RemoteActionCompatParcelizer = packageInfoIconCompatParcelizer.versionName;
            }
        }
    }

    private PackageInfo IconCompatParcelizer(String str) {
        try {
            return this.AudioAttributesCompatParcelizer.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }
}
