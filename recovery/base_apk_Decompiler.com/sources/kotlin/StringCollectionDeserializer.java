package kotlin;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class StringCollectionDeserializer {
    public static <T> T RemoteActionCompatParcelizer(T t) {
        return t;
    }

    public static void RemoteActionCompatParcelizer(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void read(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T extends CharSequence> T RemoteActionCompatParcelizer(T t, Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    public static <T> T write(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void IconCompatParcelizer(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static int read(int i) {
        if ((i & 1) == i) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Requested flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", but only 0x");
        sb.append(Integer.toHexString(1));
        sb.append(" are allowed");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int RemoteActionCompatParcelizer(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int IconCompatParcelizer(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static int IconCompatParcelizer(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, 0, 5));
        }
        if (i <= 5) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, 0, 5));
    }
}
