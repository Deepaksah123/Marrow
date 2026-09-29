package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes.dex */
public final class RendererCapabilitiesFormatSupport {
    public static SharedPreferences IconCompatParcelizer(Context context, String str) {
        String strConcat;
        if (str == null) {
            strConcat = "WizRocket";
        } else {
            strConcat = "WizRocket_".concat(String.valueOf(str));
        }
        return context.getSharedPreferences(strConcat, 0);
    }

    public static SharedPreferences read(Context context) {
        return IconCompatParcelizer(context, null);
    }

    public static String write(Context context, String str, String str2) {
        return read(context).getString(str, str2);
    }

    public static String IconCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver()) {
            String strWrite = write(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), str2);
            return strWrite != null ? strWrite : write(context, str, str2);
        }
        return write(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), str2);
    }

    public static void write(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    private static void IconCompatParcelizer(SharedPreferences.Editor editor) {
        try {
            editor.commit();
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public static void AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        write(read(context).edit().putString(str, str2));
    }

    public static void RemoteActionCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        write(read(context).edit().putString(AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), str2));
    }

    public static void RemoteActionCompatParcelizer(Context context, String str, String str2) {
        IconCompatParcelizer(read(context).edit().putString(str, str2));
    }

    public static void write(Context context, String str) {
        write(read(context).edit().remove(str));
    }

    @Deprecated
    public static String AudioAttributesCompatParcelizer(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(cleverTapInstanceConfig.write());
        return sb.toString();
    }

    public static String write(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public static boolean RemoteActionCompatParcelizer(Context context, String str, boolean z) {
        return read(context).getBoolean(str, z);
    }

    static boolean IconCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver()) {
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), false);
            return !zRemoteActionCompatParcelizer ? RemoteActionCompatParcelizer(context, str, false) : zRemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), false);
    }

    public static int RemoteActionCompatParcelizer(Context context, String str, int i) {
        return read(context).getInt(str, i);
    }

    public static int write(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver()) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), -1000);
            return iRemoteActionCompatParcelizer != -1000 ? iRemoteActionCompatParcelizer : RemoteActionCompatParcelizer(context, str, 0);
        }
        return RemoteActionCompatParcelizer(context, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), 0);
    }

    private static long write(Context context, String str, String str2, long j) {
        return IconCompatParcelizer(context, str).getLong(str2, j);
    }

    public static long read(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, String str2) {
        if (cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver()) {
            long jWrite = write(context, str2, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), -1000L);
            return jWrite != -1000 ? jWrite : write(context, str2, str, 0L);
        }
        return write(context, str2, AudioAttributesCompatParcelizer(cleverTapInstanceConfig, str), 0L);
    }

    static String read(Context context, String str, String str2, String str3) {
        return IconCompatParcelizer(context, str).getString(str2, null);
    }

    public static void AudioAttributesCompatParcelizer(Context context, String str, boolean z) {
        write(read(context).edit().putBoolean(str, z));
    }

    public static void IconCompatParcelizer(Context context, String str, boolean z) {
        IconCompatParcelizer(read(context).edit().putBoolean(str, z));
    }

    public static void AudioAttributesCompatParcelizer(Context context, String str, int i) {
        write(read(context).edit().putInt(str, i));
    }

    public static void read(Context context, String str, int i) {
        IconCompatParcelizer(read(context).edit().putInt(str, i));
    }
}
