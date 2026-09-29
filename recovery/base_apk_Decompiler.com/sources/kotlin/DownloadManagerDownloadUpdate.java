package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadManagerDownloadUpdate {
    private static final removeAllDownloads IconCompatParcelizer = RemoteActionCompatParcelizer();
    private static final removeAllDownloads write = new resumeDownloads();

    DownloadManagerDownloadUpdate() {
    }

    static removeAllDownloads read() {
        return IconCompatParcelizer;
    }

    static removeAllDownloads AudioAttributesCompatParcelizer() {
        return write;
    }

    private static removeAllDownloads RemoteActionCompatParcelizer() {
        try {
            return (removeAllDownloads) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
