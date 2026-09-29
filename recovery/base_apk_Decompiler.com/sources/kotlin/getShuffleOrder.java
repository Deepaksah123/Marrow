package kotlin;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class getShuffleOrder extends FilterInputStream {
    private int IconCompatParcelizer;

    public getShuffleOrder(InputStream inputStream) {
        super(inputStream);
        this.IconCompatParcelizer = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.IconCompatParcelizer = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (write(1L) == -1) {
            return -1;
        }
        int i = super.read();
        AudioAttributesCompatParcelizer(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iWrite = (int) write(i2);
        if (iWrite == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iWrite);
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.IconCompatParcelizer = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jWrite = write(j);
        if (jWrite == -1) {
            return 0L;
        }
        long jSkip = super.skip(jWrite);
        AudioAttributesCompatParcelizer(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private long write(long j) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    private void AudioAttributesCompatParcelizer(long j) {
        int i = this.IconCompatParcelizer;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.IconCompatParcelizer = (int) (((long) i) - j);
    }
}
