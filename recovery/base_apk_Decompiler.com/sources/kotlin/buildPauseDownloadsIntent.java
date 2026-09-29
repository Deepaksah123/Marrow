package kotlin;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class buildPauseDownloadsIntent extends FilterInputStream {
    private DownloadRequestBuilder AudioAttributesCompatParcelizer;
    private byte[] AudioAttributesImplApi21Parcelizer;
    private int[] AudioAttributesImplApi26Parcelizer;
    private byte[] AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private byte[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private int RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private int read;
    private final int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public buildPauseDownloadsIntent(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        this(inputStream, iArr, bArr, i, false, i2, (byte) 0);
    }

    private buildPauseDownloadsIntent(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.read = 1;
        this.RatingCompat = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.IconCompatParcelizer = iMin;
        this.AudioAttributesImplBaseParcelizer = new byte[8];
        byte[] bArr2 = new byte[8];
        this.MediaBrowserCompatCustomActionResultReceiver = bArr2;
        this.AudioAttributesImplApi21Parcelizer = new byte[8];
        this.AudioAttributesImplApi26Parcelizer = new int[2];
        this.MediaBrowserCompatItemReceiver = 8;
        this.MediaBrowserCompatMediaItem = 8;
        this.MediaDescriptionCompat = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AudioAttributesCompatParcelizer = new DownloadRequestBuilder(iArr, iMin, true, z);
        this.write = 100;
        this.RemoteActionCompatParcelizer = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        write();
        int i = this.MediaBrowserCompatItemReceiver;
        if (i >= this.MediaBrowserCompatMediaItem) {
            return -1;
        }
        byte[] bArr = this.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatItemReceiver = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            write();
            int i5 = this.MediaBrowserCompatItemReceiver;
            if (i5 >= this.MediaBrowserCompatMediaItem) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatItemReceiver = i5 + 1;
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
        return this.MediaBrowserCompatMediaItem - this.MediaBrowserCompatItemReceiver;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaDescriptionCompat == 2) {
            byte[] bArr = this.AudioAttributesImplBaseParcelizer;
            System.arraycopy(bArr, 0, this.AudioAttributesImplApi21Parcelizer, 0, bArr.length);
        }
        byte[] bArr2 = this.AudioAttributesImplBaseParcelizer;
        DownloadRequest1.RemoteActionCompatParcelizer(((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer.read, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        int[] iArr = this.AudioAttributesImplApi26Parcelizer;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.AudioAttributesImplBaseParcelizer;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.MediaDescriptionCompat == 2) {
            IconCompatParcelizer();
            byte[] bArr4 = this.AudioAttributesImplApi21Parcelizer;
            System.arraycopy(bArr4, 0, this.MediaBrowserCompatCustomActionResultReceiver, 0, bArr4.length);
        }
    }

    private void IconCompatParcelizer() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.AudioAttributesImplBaseParcelizer;
            bArr[i] = (byte) (bArr[i] ^ this.MediaBrowserCompatCustomActionResultReceiver[i]);
        }
    }

    private int write() throws IOException {
        if (this.RatingCompat == Integer.MAX_VALUE) {
            this.RatingCompat = ((FilterInputStream) this).in.read();
        }
        if (this.MediaBrowserCompatItemReceiver == 8) {
            byte[] bArr = this.AudioAttributesImplBaseParcelizer;
            int i = this.RatingCompat;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.AudioAttributesImplBaseParcelizer, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.write;
            if (i4 == this.RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer();
            } else {
                if (this.read <= i4) {
                    RemoteActionCompatParcelizer();
                }
                AudioAttributesCompatParcelizer();
            }
            int i5 = ((FilterInputStream) this).in.read();
            this.RatingCompat = i5;
            this.MediaBrowserCompatItemReceiver = 0;
            this.MediaBrowserCompatMediaItem = i5 < 0 ? 8 - (this.AudioAttributesImplBaseParcelizer[7] & 255) : 8;
        }
        return this.MediaBrowserCompatMediaItem;
    }

    private void AudioAttributesCompatParcelizer() {
        int i = this.read;
        if (i < this.RemoteActionCompatParcelizer) {
            this.read = i + 1;
        } else {
            this.read = 1;
        }
    }
}
