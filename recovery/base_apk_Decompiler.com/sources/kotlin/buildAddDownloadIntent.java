package kotlin;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class buildAddDownloadIntent extends FilterInputStream {
    private static final short IconCompatParcelizer = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final int RatingCompat;
    private int RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private byte[] read;
    private byte[] write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public buildAddDownloadIntent(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private buildAddDownloadIntent(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;
        this.handleMediaPlayPauseIfPendingOnHandler = 1;
        this.write = new byte[8];
        this.AudioAttributesCompatParcelizer = new byte[8];
        this.read = new byte[8];
        this.RemoteActionCompatParcelizer = 8;
        this.AudioAttributesImplApi26Parcelizer = 8;
        this.MediaBrowserCompatCustomActionResultReceiver = Math.min(Math.max(i2, 5), 16);
        this.AudioAttributesImplApi21Parcelizer = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AudioAttributesCompatParcelizer, 0, 8);
        }
        long j = -1;
        long j2 = -1;
        RemoteActionCompatParcelizer((((long) iArr[1]) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | ((((long) iArr[0]) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) << 32), i);
        this.RatingCompat = 100;
        this.MediaDescriptionCompat = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        RemoteActionCompatParcelizer();
        int i = this.RemoteActionCompatParcelizer;
        if (i >= this.AudioAttributesImplApi26Parcelizer) {
            return -1;
        }
        byte[] bArr = this.write;
        this.RemoteActionCompatParcelizer = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            RemoteActionCompatParcelizer();
            int i5 = this.RemoteActionCompatParcelizer;
            if (i5 >= this.AudioAttributesImplApi26Parcelizer) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.write;
            this.RemoteActionCompatParcelizer = i5 + 1;
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
        RemoteActionCompatParcelizer();
        return this.AudioAttributesImplApi26Parcelizer - this.RemoteActionCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(long j, int i) {
        if (i == 0) {
            RemoteActionCompatParcelizer(j);
            return;
        }
        int i2 = (int) j;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaMetadataCompat = i2 * i;
        this.MediaBrowserCompatSearchResultReceiver = i ^ i2;
        this.MediaBrowserCompatMediaItem = (int) (j >> 32);
    }

    private void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplBaseParcelizer = (int) j;
        long j2 = j >> 3;
        short s = IconCompatParcelizer;
        this.MediaMetadataCompat = (int) ((((long) s) * j2) >> 32);
        this.MediaBrowserCompatSearchResultReceiver = (int) (j >> 32);
        this.MediaBrowserCompatMediaItem = (int) (j2 + ((long) s));
    }

    private void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer == 3) {
            byte[] bArr = this.write;
            System.arraycopy(bArr, 0, this.read, 0, bArr.length);
        }
        byte[] bArr2 = this.write;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i3 >= i4) {
                break;
            }
            short s = IconCompatParcelizer;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.MediaBrowserCompatSearchResultReceiver)) ^ ((i >>> 5) + this.MediaBrowserCompatMediaItem);
            i -= (((i2 << 4) + this.AudioAttributesImplBaseParcelizer) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.MediaMetadataCompat);
            i3++;
        }
        byte[] bArr3 = this.write;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.AudioAttributesImplApi21Parcelizer == 3) {
            write();
            byte[] bArr4 = this.read;
            System.arraycopy(bArr4, 0, this.AudioAttributesCompatParcelizer, 0, bArr4.length);
        }
    }

    private void write() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.write;
            bArr[i] = (byte) (bArr[i] ^ this.AudioAttributesCompatParcelizer[i]);
        }
    }

    private int RemoteActionCompatParcelizer() throws IOException {
        if (this.MediaBrowserCompatItemReceiver == Integer.MAX_VALUE) {
            this.MediaBrowserCompatItemReceiver = ((FilterInputStream) this).in.read();
        }
        if (this.RemoteActionCompatParcelizer == 8) {
            byte[] bArr = this.write;
            int i = this.MediaBrowserCompatItemReceiver;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.write, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.RatingCompat;
            if (i4 == this.MediaDescriptionCompat) {
                IconCompatParcelizer();
            } else {
                if (this.handleMediaPlayPauseIfPendingOnHandler <= i4) {
                    IconCompatParcelizer();
                }
                AudioAttributesCompatParcelizer();
            }
            int i5 = ((FilterInputStream) this).in.read();
            this.MediaBrowserCompatItemReceiver = i5;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesImplApi26Parcelizer = i5 < 0 ? 8 - (this.write[7] & 255) : 8;
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesCompatParcelizer() {
        int i = this.handleMediaPlayPauseIfPendingOnHandler;
        if (i < this.MediaDescriptionCompat) {
            this.handleMediaPlayPauseIfPendingOnHandler = i + 1;
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler = 1;
        }
    }
}
