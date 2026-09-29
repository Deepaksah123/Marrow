package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class H264ReaderSampleReader {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    public H264ReaderSampleReader(String str, String str2, String str3) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }
}
