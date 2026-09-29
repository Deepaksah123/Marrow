package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotatedMethodCollectorMethodBuilder {
    private static final boolean AudioAttributesCompatParcelizer;
    private static final Class<?> IconCompatParcelizer = RemoteActionCompatParcelizer("libcore.io.Memory");

    AnnotatedMethodCollectorMethodBuilder() {
    }

    static {
        AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer("org.robolectric.Robolectric") != null;
    }

    static boolean RemoteActionCompatParcelizer() {
        return (IconCompatParcelizer == null || AudioAttributesCompatParcelizer) ? false : true;
    }

    static Class<?> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    private static <T> Class<T> RemoteActionCompatParcelizer(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
