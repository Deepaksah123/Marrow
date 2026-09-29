package kotlin;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class buildTypeSerializer {
    public static <T> T IconCompatParcelizer(T t) {
        return t;
    }

    public static void IconCompatParcelizer(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void write(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static void write(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void read(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T AudioAttributesCompatParcelizer(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    public static <T> T read(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static <T> T write(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String write(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
