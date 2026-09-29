package kotlin;

import com.google.android.exoplayer2.C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class setDisplayTitle extends FilterInputStream {
    private volatile byte[] AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final setSubtitleConfigurations IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private int read;
    private int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public setDisplayTitle(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) {
        this(inputStream, setsubtitleconfigurations, (byte) 0);
    }

    private setDisplayTitle(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations, byte b) {
        super(inputStream);
        this.write = -1;
        this.IconCompatParcelizer = setsubtitleconfigurations;
        this.AudioAttributesCompatParcelizer = (byte[]) setsubtitleconfigurations.IconCompatParcelizer(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i;
        int i2;
        int iAvailable;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.AudioAttributesCompatParcelizer == null || inputStream == null) {
                throw IconCompatParcelizer();
            }
            i = this.RemoteActionCompatParcelizer;
            i2 = this.AudioAttributesImplBaseParcelizer;
            iAvailable = inputStream.available();
        }
        return (i - i2) + iAvailable;
    }

    private static IOException IconCompatParcelizer() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            this.read = this.AudioAttributesCompatParcelizer.length;
        }
    }

    public final void write() {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer != null) {
                this.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.AudioAttributesCompatParcelizer != null) {
            this.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int IconCompatParcelizer(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.write;
        if (i != -1) {
            int i2 = this.AudioAttributesImplBaseParcelizer;
            int i3 = this.read;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.RemoteActionCompatParcelizer == bArr.length) {
                    int length = bArr.length << 1;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.IconCompatParcelizer.IconCompatParcelizer(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.AudioAttributesCompatParcelizer = bArr2;
                    this.IconCompatParcelizer.read(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.AudioAttributesImplBaseParcelizer - this.write;
                this.AudioAttributesImplBaseParcelizer = i4;
                this.write = 0;
                this.RemoteActionCompatParcelizer = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.AudioAttributesImplBaseParcelizer;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.RemoteActionCompatParcelizer = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.write = -1;
            this.AudioAttributesImplBaseParcelizer = 0;
            this.RemoteActionCompatParcelizer = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.read = Math.max(this.read, i);
            this.write = this.AudioAttributesImplBaseParcelizer;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        synchronized (this) {
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                throw IconCompatParcelizer();
            }
            if (this.AudioAttributesImplBaseParcelizer >= this.RemoteActionCompatParcelizer && IconCompatParcelizer(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.AudioAttributesCompatParcelizer && (bArr = this.AudioAttributesCompatParcelizer) == null) {
                throw IconCompatParcelizer();
            }
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.AudioAttributesImplBaseParcelizer;
            if (i - i2 <= 0) {
                return -1;
            }
            this.AudioAttributesImplBaseParcelizer = i2 + 1;
            return bArr[i2] & 255;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        synchronized (this) {
            byte[] bArr2 = this.AudioAttributesCompatParcelizer;
            if (bArr2 == null) {
                throw IconCompatParcelizer();
            }
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw IconCompatParcelizer();
            }
            int i5 = this.AudioAttributesImplBaseParcelizer;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.AudioAttributesImplBaseParcelizer += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.write == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (IconCompatParcelizer(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.AudioAttributesCompatParcelizer && (bArr2 = this.AudioAttributesCompatParcelizer) == null) {
                        throw IconCompatParcelizer();
                    }
                    int i8 = this.RemoteActionCompatParcelizer;
                    int i9 = this.AudioAttributesImplBaseParcelizer;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.AudioAttributesImplBaseParcelizer += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.write;
            if (-1 == i) {
                StringBuilder sb = new StringBuilder("Mark has been invalidated, pos: ");
                sb.append(this.AudioAttributesImplBaseParcelizer);
                sb.append(" markLimit: ");
                sb.append(this.read);
                throw new IconCompatParcelizer(sb.toString());
            }
            this.AudioAttributesImplBaseParcelizer = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            if (bArr == null) {
                throw IconCompatParcelizer();
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw IconCompatParcelizer();
            }
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.AudioAttributesImplBaseParcelizer;
            if (i - i2 >= j) {
                this.AudioAttributesImplBaseParcelizer = (int) (((long) i2) + j);
                return j;
            }
            long j2 = ((long) i) - ((long) i2);
            this.AudioAttributesImplBaseParcelizer = i;
            if (this.write != -1 && j <= this.read) {
                if (IconCompatParcelizer(inputStream, bArr) == -1) {
                    return j2;
                }
                int i3 = this.RemoteActionCompatParcelizer;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                if (i3 - i4 >= j - j2) {
                    this.AudioAttributesImplBaseParcelizer = (int) ((((long) i4) + j) - j2);
                    return j;
                }
                long j3 = i3;
                long j4 = i4;
                this.AudioAttributesImplBaseParcelizer = i3;
                return (j2 + j3) - j4;
            }
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.write = -1;
            }
            return j2 + jSkip;
        }
    }

    static class IconCompatParcelizer extends IOException {
        public IconCompatParcelizer(String str) {
            super(str);
        }
    }
}
