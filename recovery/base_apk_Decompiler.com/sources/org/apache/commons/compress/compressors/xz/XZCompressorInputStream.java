package org.apache.commons.compress.compressors.xz;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.tukaani.xz.SingleXZInputStream;
import org.tukaani.xz.XZ;
import org.tukaani.xz.XZInputStream;

/* JADX INFO: loaded from: classes5.dex */
public class XZCompressorInputStream extends CompressorInputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f18in;

    public static boolean matches(byte[] bArr, int i) {
        if (i < XZ.HEADER_MAGIC.length) {
            return false;
        }
        for (int i2 = 0; i2 < XZ.HEADER_MAGIC.length; i2++) {
            if (bArr[i2] != XZ.HEADER_MAGIC[i2]) {
                return false;
            }
        }
        return true;
    }

    public XZCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public XZCompressorInputStream(InputStream inputStream, boolean z) throws IOException {
        if (z) {
            this.f18in = new XZInputStream(inputStream);
        } else {
            this.f18in = new SingleXZInputStream(inputStream);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f18in.read();
        count(i != -1 ? 1 : -1);
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18in.read(bArr, i, i2);
        count(i3);
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.f18in.skip(j);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f18in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18in.close();
    }
}
