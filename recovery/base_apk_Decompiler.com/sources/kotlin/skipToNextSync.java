package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class skipToNextSync {
    public static void read(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T write(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void RemoteActionCompatParcelizer(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
