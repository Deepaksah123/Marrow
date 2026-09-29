package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\n\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u000e\u0010\rR\"\u0010\f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r"}, d2 = {"Lo/_nextTokenWithBuffering;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "IconCompatParcelizer", "I", "read", "()I", "AudioAttributesCompatParcelizer", "(I)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _nextTokenWithBuffering {
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int write;
    private int read;

    public _nextTokenWithBuffering(int i, int i2, int i3) {
        this.write = i;
        this.read = i2;
        this.AudioAttributesCompatParcelizer = i3;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public final void write(int i) {
        this.read = i;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
