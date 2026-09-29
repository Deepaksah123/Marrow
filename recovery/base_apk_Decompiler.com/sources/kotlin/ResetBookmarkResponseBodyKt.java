package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class ResetBookmarkResponseBodyKt extends AuthorRSModel {
    private int AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    ResetBookmarkResponseBodyKt(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.write = false;
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = inputStream.read();
        int i2 = inputStream.read();
        this.read = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        write();
    }

    private boolean write() {
        if (!this.write && this.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == 0 && this.read == 0) {
            this.write = true;
            RemoteActionCompatParcelizer();
        }
        return this.write;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (write()) {
            return -1;
        }
        int i = this.IconCompatParcelizer.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = this.read;
        this.read = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.RemoteActionCompatParcelizer || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.write) {
            return -1;
        }
        int i3 = this.IconCompatParcelizer.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.AudioAttributesCompatParcelizer;
        bArr[i + 1] = (byte) this.read;
        this.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.read();
        int i4 = this.IconCompatParcelizer.read();
        this.read = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }

    final void read(boolean z) {
        this.RemoteActionCompatParcelizer = z;
        write();
    }
}
