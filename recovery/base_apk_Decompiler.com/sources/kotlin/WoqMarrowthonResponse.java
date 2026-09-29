package kotlin;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class WoqMarrowthonResponse {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    private static WoqMarrowthonResponse write;
    private final Boolean AudioAttributesImplApi21Parcelizer;
    private final Boolean AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final DisplayMetrics MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final Integer read;

    static WoqMarrowthonResponse RemoteActionCompatParcelizer(Context context) {
        synchronized (AudioAttributesCompatParcelizer) {
            if (write == null) {
                write = new WoqMarrowthonResponse(context.getApplicationContext());
            }
        }
        return write;
    }

    private WoqMarrowthonResponse(Context context) {
        String str;
        Integer numValueOf;
        String string;
        Method method;
        Boolean bool;
        Boolean bool2;
        this.MediaBrowserCompatItemReceiver = context;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool3 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                numValueOf = Integer.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                numValueOf = null;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = ((PackageItemInfo) applicationInfo).labelRes;
        this.IconCompatParcelizer = str;
        this.read = numValueOf;
        if (i == 0) {
            string = ((PackageItemInfo) applicationInfo).nonLocalizedLabel == null ? "Misc" : ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
        }
        this.RemoteActionCompatParcelizer = string;
        try {
            method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
        } catch (NoSuchMethodException unused3) {
            method = null;
        }
        if (method != null) {
            try {
                bool = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
            } catch (IllegalAccessException | InvocationTargetException unused4) {
                bool = null;
            }
            try {
                bool2 = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
            } catch (IllegalAccessException | InvocationTargetException unused5) {
                bool2 = null;
            }
            bool3 = bool;
        } else {
            bool2 = null;
        }
        this.AudioAttributesImplBaseParcelizer = bool3;
        this.AudioAttributesImplApi21Parcelizer = bool2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.MediaBrowserCompatCustomActionResultReceiver = displayMetrics;
        ((WindowManager) this.MediaBrowserCompatItemReceiver.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final Integer AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer.booleanValue();
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.booleanValue();
    }

    public final DisplayMetrics RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String IconCompatParcelizer() {
        TelephonyManager telephonyManager = (TelephonyManager) this.MediaBrowserCompatItemReceiver.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean MediaBrowserCompatItemReceiver() {
        /*
            r2 = this;
            android.content.Context r0 = r2.MediaBrowserCompatItemReceiver
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L2d
            android.content.Context r2 = r2.MediaBrowserCompatItemReceiver
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L27
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L27
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L28
        L27:
            r1 = 0
        L28:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L2d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WoqMarrowthonResponse.MediaBrowserCompatItemReceiver():java.lang.Boolean");
    }

    public final Boolean AudioAttributesImplApi26Parcelizer() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.MediaBrowserCompatItemReceiver.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.MediaBrowserCompatItemReceiver.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String read() {
        if (this.MediaBrowserCompatItemReceiver.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return "ble";
        }
        if (this.MediaBrowserCompatItemReceiver.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return "classic";
        }
        return "none";
    }
}
