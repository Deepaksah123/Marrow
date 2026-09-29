package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubjScore {
    public static <T> T read(T t) {
        return t;
    }

    public static <T> T write(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void IconCompatParcelizer(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
