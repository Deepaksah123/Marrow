package org.apache.commons.compress.compressors.snappy;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class SnappyCompressorInputStream extends CompressorInputStream {
    public static final int DEFAULT_BLOCK_SIZE = 32768;
    private static final int TAG_MASK = 3;
    private final int blockSize;
    private final byte[] decompressBuf;
    private boolean endReached;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f17in;
    private final byte[] oneByte;
    private int readIndex;
    private final int size;
    private int uncompressedBytesRemaining;
    private int writeIndex;

    public SnappyCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, 32768);
    }

    public SnappyCompressorInputStream(InputStream inputStream, int i) throws IOException {
        this.oneByte = new byte[1];
        this.endReached = false;
        this.f17in = inputStream;
        this.blockSize = i;
        this.decompressBuf = new byte[i * 3];
        this.readIndex = 0;
        this.writeIndex = 0;
        int size = (int) readSize();
        this.size = size;
        this.uncompressedBytesRemaining = size;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17in.close();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.writeIndex - this.readIndex;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.endReached) {
            return -1;
        }
        int iAvailable = available();
        if (i2 > iAvailable) {
            fill(i2 - iAvailable);
        }
        int iMin = Math.min(i2, available());
        if (iMin == 0 && i2 > 0) {
            return -1;
        }
        System.arraycopy(this.decompressBuf, this.readIndex, bArr, i, iMin);
        int i3 = this.readIndex + iMin;
        this.readIndex = i3;
        if (i3 > this.blockSize) {
            slideBuffer();
        }
        return iMin;
    }

    private void fill(int i) throws IOException {
        int literalLength;
        int i2 = this.uncompressedBytesRemaining;
        if (i2 == 0) {
            this.endReached = true;
        }
        int iMin = Math.min(i, i2);
        while (iMin > 0) {
            int oneByte = readOneByte();
            int i3 = oneByte & 3;
            if (i3 == 0) {
                literalLength = readLiteralLength(oneByte);
                if (expandLiteral(literalLength)) {
                    return;
                }
            } else if (i3 == 1) {
                int i4 = ((oneByte >> 2) & 7) + 4;
                if (expandCopy(((long) ((oneByte & 224) << 3)) | ((long) readOneByte()), i4)) {
                    return;
                } else {
                    literalLength = i4;
                }
            } else if (i3 == 2) {
                literalLength = (oneByte >> 2) + 1;
                if (expandCopy(((long) readOneByte()) | ((long) (readOneByte() << 8)), literalLength)) {
                    return;
                }
            } else if (i3 != 3) {
                literalLength = 0;
            } else {
                literalLength = (oneByte >> 2) + 1;
                if (expandCopy(readOneByte() | (readOneByte() << 8) | ((long) (readOneByte() << 16)) | (((long) readOneByte()) << 24), literalLength)) {
                    return;
                }
            }
            iMin -= literalLength;
            this.uncompressedBytesRemaining -= literalLength;
        }
    }

    private void slideBuffer() {
        byte[] bArr = this.decompressBuf;
        int i = this.blockSize;
        System.arraycopy(bArr, i, bArr, 0, i << 1);
        int i2 = this.writeIndex;
        int i3 = this.blockSize;
        this.writeIndex = i2 - i3;
        this.readIndex -= i3;
    }

    private int readLiteralLength(int i) throws IOException {
        int oneByte;
        int oneByte2;
        int oneByte3 = i >> 2;
        switch (oneByte3) {
            case 60:
                oneByte3 = readOneByte();
                break;
            case 61:
                oneByte = readOneByte();
                oneByte2 = readOneByte() << 8;
                oneByte3 = oneByte | oneByte2;
                break;
            case 62:
                oneByte = readOneByte() | (readOneByte() << 8);
                oneByte2 = readOneByte() << 16;
                oneByte3 = oneByte | oneByte2;
                break;
            case 63:
                oneByte3 = (int) ((((long) readOneByte()) << 24) | ((long) (readOneByte() | (readOneByte() << 8) | (readOneByte() << 16))));
                break;
        }
        return oneByte3 + 1;
    }

    private boolean expandLiteral(int i) throws IOException {
        int fully = IOUtils.readFully(this.f17in, this.decompressBuf, this.writeIndex, i);
        count(fully);
        if (i != fully) {
            throw new IOException("Premature end of stream");
        }
        int i2 = this.writeIndex + i;
        this.writeIndex = i2;
        return i2 >= (this.blockSize << 1);
    }

    private boolean expandCopy(long j, int i) throws IOException {
        if (j > this.blockSize) {
            throw new IOException("Offset is larger than block size");
        }
        int i2 = (int) j;
        if (i2 == 1) {
            byte b = this.decompressBuf[this.writeIndex - 1];
            for (int i3 = 0; i3 < i; i3++) {
                byte[] bArr = this.decompressBuf;
                int i4 = this.writeIndex;
                this.writeIndex = i4 + 1;
                bArr[i4] = b;
            }
        } else if (i < i2) {
            byte[] bArr2 = this.decompressBuf;
            int i5 = this.writeIndex;
            System.arraycopy(bArr2, i5 - i2, bArr2, i5, i);
            this.writeIndex += i;
        } else {
            int i6 = i / i2;
            int i7 = i - (i2 * i6);
            while (i6 != 0) {
                byte[] bArr3 = this.decompressBuf;
                int i8 = this.writeIndex;
                System.arraycopy(bArr3, i8 - i2, bArr3, i8, i2);
                this.writeIndex += i2;
                i6--;
            }
            if (i7 > 0) {
                byte[] bArr4 = this.decompressBuf;
                int i9 = this.writeIndex;
                System.arraycopy(bArr4, i9 - i2, bArr4, i9, i7);
                this.writeIndex += i7;
            }
        }
        return this.writeIndex >= (this.blockSize << 1);
    }

    private int readOneByte() throws IOException {
        int i = this.f17in.read();
        if (i == -1) {
            throw new IOException("Premature end of stream");
        }
        count(1);
        return i & 255;
    }

    private long readSize() throws IOException {
        int i = 0;
        long j = 0;
        while (true) {
            int oneByte = readOneByte();
            j |= (long) ((oneByte & 127) << (i * 7));
            if ((oneByte & 128) == 0) {
                return j;
            }
            i++;
        }
    }

    public int getSize() {
        return this.size;
    }
}
