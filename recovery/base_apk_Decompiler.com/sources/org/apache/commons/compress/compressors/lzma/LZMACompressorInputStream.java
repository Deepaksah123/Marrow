package org.apache.commons.compress.compressors.lzma;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.tukaani.xz.LZMAInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class LZMACompressorInputStream extends CompressorInputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f14in;

    public LZMACompressorInputStream(InputStream inputStream) throws IOException {
        this.f14in = new LZMAInputStream(inputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f14in.read();
        count(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f14in.read(bArr, i, i2);
        count(i3);
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.f14in.skip(j);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f14in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14in.close();
    }

    public static boolean matches(byte[] bArr, int i) {
        return bArr != null && i >= 3 && bArr[0] == 93 && bArr[1] == 0 && bArr[2] == 0;
    }
}
