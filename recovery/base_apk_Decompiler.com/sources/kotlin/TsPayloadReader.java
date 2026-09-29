package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class TsPayloadReader {
    private final int AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public TsPayloadReader(int i, String str) {
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
