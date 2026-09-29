package kotlin;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class copyWithMergedRequest extends FilterInputStream {
    private int AudioAttributesCompatParcelizer;
    private byte[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private long[] AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private short MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private long[] RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public copyWithMergedRequest(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private copyWithMergedRequest(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AudioAttributesCompatParcelizer = 1;
        this.MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s, 4), 8);
        this.IconCompatParcelizer = iMin;
        this.AudioAttributesImplApi21Parcelizer = new byte[iMin];
        this.RemoteActionCompatParcelizer = new long[4];
        this.AudioAttributesImplBaseParcelizer = new long[4];
        this.AudioAttributesImplApi26Parcelizer = iMin;
        this.MediaBrowserCompatMediaItem = iMin;
        this.RemoteActionCompatParcelizer = toMediaItem.IconCompatParcelizer(i ^ i4, iMin ^ i4);
        this.AudioAttributesImplBaseParcelizer = toMediaItem.IconCompatParcelizer(i2 ^ i4, i3 ^ i4);
        this.write = 100;
        this.read = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        IconCompatParcelizer();
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i >= this.MediaBrowserCompatMediaItem) {
            return -1;
        }
        byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi26Parcelizer = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            IconCompatParcelizer();
            int i5 = this.AudioAttributesImplApi26Parcelizer;
            if (i5 >= this.MediaBrowserCompatMediaItem) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = i5 + 1;
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
        IconCompatParcelizer();
        return this.MediaBrowserCompatMediaItem - this.AudioAttributesImplApi26Parcelizer;
    }

    private void write() {
        toMediaItem.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            this.AudioAttributesImplApi21Parcelizer[i] = (byte) (((long) r1[i]) ^ ((this.RemoteActionCompatParcelizer[this.MediaBrowserCompatCustomActionResultReceiver] >> (i << 3)) & 255));
        }
        this.MediaBrowserCompatCustomActionResultReceiver = (short) ((this.MediaBrowserCompatCustomActionResultReceiver + 1) % 4);
    }

    private int IconCompatParcelizer() throws IOException {
        int i;
        if (this.MediaBrowserCompatItemReceiver == Integer.MAX_VALUE) {
            this.MediaBrowserCompatItemReceiver = ((FilterInputStream) this).in.read();
        }
        if (this.AudioAttributesImplApi26Parcelizer == this.IconCompatParcelizer) {
            byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.MediaBrowserCompatItemReceiver;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.AudioAttributesImplApi21Parcelizer, i3, this.IconCompatParcelizer - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < this.IconCompatParcelizer);
            if (i3 < this.IconCompatParcelizer) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.write;
            if (i5 == this.read) {
                write();
            } else {
                if (this.AudioAttributesCompatParcelizer <= i5) {
                    write();
                }
                AudioAttributesCompatParcelizer();
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.MediaBrowserCompatItemReceiver = i6;
            this.AudioAttributesImplApi26Parcelizer = 0;
            if (i6 < 0) {
                int i7 = this.IconCompatParcelizer;
                i = i7 - (this.AudioAttributesImplApi21Parcelizer[i7 - 1] & 255);
            } else {
                i = this.IconCompatParcelizer;
            }
            this.MediaBrowserCompatMediaItem = i;
        }
        return this.MediaBrowserCompatMediaItem;
    }

    private void AudioAttributesCompatParcelizer() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i < this.read) {
            this.AudioAttributesCompatParcelizer = i + 1;
        } else {
            this.AudioAttributesCompatParcelizer = 1;
        }
    }
}
