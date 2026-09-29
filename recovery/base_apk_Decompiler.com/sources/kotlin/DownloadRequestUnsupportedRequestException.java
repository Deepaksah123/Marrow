package kotlin;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class DownloadRequestUnsupportedRequestException extends FilterInputStream {
    private final int AudioAttributesImplApi21Parcelizer;
    private final int[] AudioAttributesImplApi26Parcelizer;
    private final byte[][] AudioAttributesImplBaseParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    private final byte[] MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final byte[] MediaMetadataCompat;
    private int RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onCustomAction;
    private static final byte[] IconCompatParcelizer = buildRemoveDownloadIntent.AudioAttributesCompatParcelizer;
    private static final int[] read = buildRemoveDownloadIntent.write;
    private static final int[] write = buildRemoveDownloadIntent.IconCompatParcelizer;
    private static final int[] RemoteActionCompatParcelizer = buildRemoveDownloadIntent.read;
    private static final int[] AudioAttributesCompatParcelizer = buildRemoveDownloadIntent.RemoteActionCompatParcelizer;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public DownloadRequestUnsupportedRequestException(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private DownloadRequestUnsupportedRequestException(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.MediaBrowserCompatCustomActionResultReceiver = new int[4];
        this.MediaBrowserCompatItemReceiver = new byte[16];
        this.MediaMetadataCompat = new byte[16];
        this.RatingCompat = 1;
        this.MediaBrowserCompatSearchResultReceiver = Integer.MAX_VALUE;
        this.onCustomAction = 16;
        this.handleMediaPlayPauseIfPendingOnHandler = 16;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = buildRemoveDownloadIntent.write(bArr, i);
        this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(bArr2);
        this.MediaDescriptionCompat = 100;
        this.MediaBrowserCompatMediaItem = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        write();
        int i = this.onCustomAction;
        if (i >= this.handleMediaPlayPauseIfPendingOnHandler) {
            return -1;
        }
        byte[] bArr = this.MediaMetadataCompat;
        this.onCustomAction = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            write();
            int i5 = this.onCustomAction;
            if (i5 >= this.handleMediaPlayPauseIfPendingOnHandler) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.MediaMetadataCompat;
            this.onCustomAction = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        write();
        return this.handleMediaPlayPauseIfPendingOnHandler - this.onCustomAction;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    private static byte[][] AudioAttributesCompatParcelizer(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    private int write() throws IOException {
        if (this.MediaBrowserCompatSearchResultReceiver == Integer.MAX_VALUE) {
            this.MediaBrowserCompatSearchResultReceiver = ((FilterInputStream) this).in.read();
        }
        if (this.onCustomAction == 16) {
            byte[] bArr = this.MediaBrowserCompatItemReceiver;
            int i = this.MediaBrowserCompatSearchResultReceiver;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.MediaBrowserCompatItemReceiver, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.MediaDescriptionCompat;
            if (i4 == this.MediaBrowserCompatMediaItem) {
                read(this.MediaBrowserCompatItemReceiver, this.MediaMetadataCompat);
            } else {
                if (this.RatingCompat <= i4) {
                    read(this.MediaBrowserCompatItemReceiver, this.MediaMetadataCompat);
                } else {
                    byte[] bArr2 = this.MediaBrowserCompatItemReceiver;
                    System.arraycopy(bArr2, 0, this.MediaMetadataCompat, 0, bArr2.length);
                }
                RemoteActionCompatParcelizer();
            }
            int i5 = ((FilterInputStream) this).in.read();
            this.MediaBrowserCompatSearchResultReceiver = i5;
            this.onCustomAction = 0;
            this.handleMediaPlayPauseIfPendingOnHandler = i5 < 0 ? 16 - (this.MediaMetadataCompat[15] & 255) : 16;
        }
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void read(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.AudioAttributesImplApi26Parcelizer;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i2 = 4;
        int i3 = 1;
        while (i3 < this.AudioAttributesImplApi21Parcelizer) {
            int[] iArr3 = read;
            int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
            byte[][] bArr3 = this.AudioAttributesImplBaseParcelizer;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = write;
            byte[] bArr5 = bArr3[c];
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = RemoteActionCompatParcelizer;
            byte[] bArr6 = bArr3[2];
            int i6 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = AudioAttributesCompatParcelizer;
            byte[] bArr7 = bArr3[3];
            int i7 = iArr7[iArr4[bArr7[0]] & 255] ^ i6;
            int[] iArr8 = this.AudioAttributesImplApi26Parcelizer;
            int i8 = i7 ^ iArr8[i2];
            int i9 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i2 + 1];
            int i10 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i2 + 2];
            int i11 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i2 + 3];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = i11;
            i3++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.AudioAttributesImplApi26Parcelizer;
        int i12 = iArr9[i2];
        byte[] bArr8 = IconCompatParcelizer;
        int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
        byte[][] bArr9 = this.AudioAttributesImplBaseParcelizer;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i12);
        int i13 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i14 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i15 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[3]] & 255] ^ i15);
    }

    private void RemoteActionCompatParcelizer() {
        int i = this.RatingCompat;
        if (i < this.MediaBrowserCompatMediaItem) {
            this.RatingCompat = i + 1;
        } else {
            this.RatingCompat = 1;
        }
    }
}
