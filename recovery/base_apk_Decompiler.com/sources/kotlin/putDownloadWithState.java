package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class putDownloadWithState {
    private static final DownloadManagerInternalHandler IconCompatParcelizer = write();
    private static final DownloadManagerInternalHandler AudioAttributesCompatParcelizer = new copyDownloadWithState();

    putDownloadWithState() {
    }

    static DownloadManagerInternalHandler RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static DownloadManagerInternalHandler read() {
        return AudioAttributesCompatParcelizer;
    }

    private static DownloadManagerInternalHandler write() {
        try {
            return (DownloadManagerInternalHandler) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
