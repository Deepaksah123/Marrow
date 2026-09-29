package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setPossibleScore {
    public static <T> T RemoteActionCompatParcelizer(T t) {
        return t;
    }

    public static <T> T write(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> T write(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> void IconCompatParcelizer(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
