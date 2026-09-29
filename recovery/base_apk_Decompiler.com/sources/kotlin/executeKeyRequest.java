package kotlin;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class executeKeyRequest {
    private static String read(String str) {
        return "TRuntime.".concat(String.valueOf(str));
    }

    public static void read(String str, Object obj) {
        if (Log.isLoggable(read(str), 3)) {
            new Object[]{obj};
        }
    }

    public static void write(String str) {
        read(str);
    }

    public static void write(String str, Object obj) {
        if (Log.isLoggable(read(str), 4)) {
            new Object[]{obj};
        }
    }

    public static void IconCompatParcelizer(String str) {
        read(str);
    }

    public static void IconCompatParcelizer(String str, Object obj) {
        if (Log.isLoggable(read(str), 5)) {
            new Object[]{obj};
        }
    }
}
