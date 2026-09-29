package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class executePost {
    public static <T> T AudioAttributesCompatParcelizer(T t) {
        return t;
    }

    public static <T> T IconCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> void read(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
