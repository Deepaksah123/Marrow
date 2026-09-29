package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadHelperLiveContentUnsupportedException {
    private static final Class<?> RemoteActionCompatParcelizer = write("libcore.io.Memory");
    private static final boolean write;

    static {
        write = write("org.robolectric.Robolectric") != null;
    }

    static boolean RemoteActionCompatParcelizer() {
        return (RemoteActionCompatParcelizer == null || write) ? false : true;
    }

    static Class<?> AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    private static <T> Class<T> write(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
