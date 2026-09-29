package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public final class secureDecodersExplicit {
    private static Boolean read;

    public static int RemoteActionCompatParcelizer(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String IconCompatParcelizer(String str) {
        ThemeAlphaConstantsKt themeAlphaConstantsKtIconCompatParcelizer = ThemeAlphaConstantsKt.IconCompatParcelizer(str);
        return themeAlphaConstantsKtIconCompatParcelizer != null ? themeAlphaConstantsKtIconCompatParcelizer.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatSearchResultReceiver("").RemoteActionCompatParcelizer("").write().IconCompatParcelizer().toString() : str;
    }

    public static String AudioAttributesCompatParcelizer(String str) {
        int iLastIndexOf;
        if (str.length() <= 2000) {
            return str;
        }
        if (str.charAt(2000) == '/') {
            return str.substring(0, 2000);
        }
        ThemeAlphaConstantsKt themeAlphaConstantsKtIconCompatParcelizer = ThemeAlphaConstantsKt.IconCompatParcelizer(str);
        if (themeAlphaConstantsKtIconCompatParcelizer == null) {
            return str.substring(0, 2000);
        }
        if (themeAlphaConstantsKtIconCompatParcelizer.RemoteActionCompatParcelizer().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str.substring(0, 2000);
    }

    public static boolean read(Context context) {
        Boolean bool = read;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            read = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
            e.getMessage();
            return false;
        }
    }

    public static void read(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
