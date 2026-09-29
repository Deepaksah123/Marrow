package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStsd {
    public static <T> T IconCompatParcelizer(T t) {
        return t;
    }

    public static void RemoteActionCompatParcelizer(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void write(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void RemoteActionCompatParcelizer(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(parseVideoSampleEntry.AudioAttributesCompatParcelizer(str, Character.valueOf(c)));
        }
    }

    public static void AudioAttributesCompatParcelizer(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(parseVideoSampleEntry.AudioAttributesCompatParcelizer(str, Long.valueOf(j)));
        }
    }

    public static void AudioAttributesCompatParcelizer(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(parseVideoSampleEntry.AudioAttributesCompatParcelizer(str, obj));
        }
    }

    public static void RemoteActionCompatParcelizer(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(parseVideoSampleEntry.AudioAttributesCompatParcelizer(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void IconCompatParcelizer(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void RemoteActionCompatParcelizer(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void read(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(parseVideoSampleEntry.AudioAttributesCompatParcelizer(str, obj));
        }
    }

    public static <T> T IconCompatParcelizer(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int write(int i, int i2) {
        return RemoteActionCompatParcelizer(i, i2, "index");
    }

    private static int RemoteActionCompatParcelizer(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(write(i, i2, str));
        }
        return i;
    }

    private static String write(int i, int i2, String str) {
        if (i < 0) {
            return parseVideoSampleEntry.AudioAttributesCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        }
        return parseVideoSampleEntry.AudioAttributesCompatParcelizer("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int read(int i, int i2) {
        return AudioAttributesCompatParcelizer(i, i2, "index");
    }

    private static int AudioAttributesCompatParcelizer(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(read(i, i2, str));
        }
        return i;
    }

    private static String read(int i, int i2, String str) {
        if (i < 0) {
            return parseVideoSampleEntry.AudioAttributesCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        }
        return parseVideoSampleEntry.AudioAttributesCompatParcelizer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void read(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(RemoteActionCompatParcelizer(i, i2, i3));
        }
    }

    private static String RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return read(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return read(i2, i3, "end index");
        }
        return parseVideoSampleEntry.AudioAttributesCompatParcelizer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}
