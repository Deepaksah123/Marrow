package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceListForwardingEventListener {
    private int AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private int read;

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.read = i;
    }
}
