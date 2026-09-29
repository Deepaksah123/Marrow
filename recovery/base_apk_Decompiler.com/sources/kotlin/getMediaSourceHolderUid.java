package kotlin;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaSourceHolderUid extends FilterInputStream {
    private int RemoteActionCompatParcelizer;
    private final long write;

    public static InputStream IconCompatParcelizer(InputStream inputStream, long j) {
        return new getMediaSourceHolderUid(inputStream, j);
    }

    private getMediaSourceHolderUid(InputStream inputStream, long j) {
        super(inputStream);
        this.write = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int iMax;
        synchronized (this) {
            iMax = (int) Math.max(this.write - ((long) this.RemoteActionCompatParcelizer), ((FilterInputStream) this).in.available());
        }
        return iMax;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        synchronized (this) {
            i = super.read();
            IconCompatParcelizer(i >= 0 ? 1 : -1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iIconCompatParcelizer;
        synchronized (this) {
            iIconCompatParcelizer = IconCompatParcelizer(super.read(bArr, i, i2));
        }
        return iIconCompatParcelizer;
    }

    private int IconCompatParcelizer(int i) throws IOException {
        if (i >= 0) {
            this.RemoteActionCompatParcelizer += i;
            return i;
        }
        if (this.write - ((long) this.RemoteActionCompatParcelizer) <= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Failed to read all expected data, expected: ");
        sb.append(this.write);
        sb.append(", but read: ");
        sb.append(this.RemoteActionCompatParcelizer);
        throw new IOException(sb.toString());
    }
}
