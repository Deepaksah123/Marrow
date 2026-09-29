package kotlin;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItem1 extends FilterInputStream {
    private final byte read;
    private int write;
    private static final byte[] IconCompatParcelizer = {-1, -31, 0, 28, 69, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int AudioAttributesCompatParcelizer = 31;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public MediaItem1(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(i)));
        }
        this.read = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.write;
        if (i3 < 2 || i3 > (i2 = AudioAttributesCompatParcelizer)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.read;
        } else {
            i = IconCompatParcelizer[i3 - 2] & 255;
        }
        if (i != -1) {
            this.write++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.write;
        int i5 = AudioAttributesCompatParcelizer;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.read;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(IconCompatParcelizer, this.write - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.write += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.write = (int) (((long) this.write) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
