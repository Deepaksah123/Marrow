package kotlin;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class onFrameRendered extends OutputStream {
    private long read = 0;

    onFrameRendered() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.read++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.read += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.read += (long) i2;
    }

    final long write() {
        return this.read;
    }
}
