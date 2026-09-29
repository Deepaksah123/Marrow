package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: loaded from: classes4.dex */
public final class generateEventTime {
    public static boolean IconCompatParcelizer(Context context) {
        try {
            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean AudioAttributesCompatParcelizer(Context context) {
        return AudioAttributesCompatParcelizer(context, "com.android.vending") || AudioAttributesCompatParcelizer(context, "com.google.market");
    }

    private static boolean AudioAttributesCompatParcelizer(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
