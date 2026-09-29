package kotlin;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class AsExternalTypeSerializer {
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private int read;
    public byte[] write;

    public AsExternalTypeSerializer() {
        this.write = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    }

    public AsExternalTypeSerializer(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public AsExternalTypeSerializer(byte[] bArr, int i) {
        this.write = bArr;
        this.read = i;
    }

    public final void read(byte[] bArr) {
        read(bArr, bArr.length);
    }

    public final void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        read(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.read());
        read(asPropertyTypeDeserializer.write() << 3);
    }

    public final void read(byte[] bArr, int i) {
        this.write = bArr;
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = 0;
        this.read = i;
    }

    public final int IconCompatParcelizer() {
        return ((this.read - this.RemoteActionCompatParcelizer) << 3) - this.IconCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return (this.RemoteActionCompatParcelizer << 3) + this.IconCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        buildTypeSerializer.write(this.IconCompatParcelizer == 0);
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(int i) {
        int i2 = i / 8;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = i - (i2 << 3);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        int i = this.IconCompatParcelizer + 1;
        this.IconCompatParcelizer = i;
        if (i == 8) {
            this.IconCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer++;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write(int i) {
        int i2 = i / 8;
        int i3 = this.RemoteActionCompatParcelizer + i2;
        this.RemoteActionCompatParcelizer = i3;
        int i4 = this.IconCompatParcelizer + (i - (i2 << 3));
        this.IconCompatParcelizer = i4;
        if (i4 > 7) {
            this.RemoteActionCompatParcelizer = i3 + 1;
            this.IconCompatParcelizer = i4 - 8;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean read() {
        boolean z = (this.write[this.RemoteActionCompatParcelizer] & (128 >> this.IconCompatParcelizer)) != 0;
        AudioAttributesImplApi21Parcelizer();
        return z;
    }

    public final int IconCompatParcelizer(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.IconCompatParcelizer += i;
        int i3 = 0;
        while (true) {
            i2 = this.IconCompatParcelizer;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.IconCompatParcelizer = i4;
            byte[] bArr = this.write;
            int i5 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.write;
        int i6 = this.RemoteActionCompatParcelizer;
        byte b = bArr2[i6];
        if (i2 == 8) {
            this.IconCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer = i6 + 1;
        }
        MediaBrowserCompatCustomActionResultReceiver();
        return ((-1) >>> (32 - i)) & (((b & 255) >> (8 - i2)) | i3);
    }

    public final long AudioAttributesCompatParcelizer(int i) {
        if (i <= 32) {
            return LaissezFaireSubTypeValidator.MediaBrowserCompatSearchResultReceiver(IconCompatParcelizer(i));
        }
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(IconCompatParcelizer(i - 32), IconCompatParcelizer(32));
    }

    public final void read(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        while (i < i3) {
            byte[] bArr2 = this.write;
            int i4 = this.RemoteActionCompatParcelizer;
            int i5 = i4 + 1;
            this.RemoteActionCompatParcelizer = i5;
            byte b = bArr2[i4];
            int i6 = this.IconCompatParcelizer;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.IconCompatParcelizer;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.write;
            int i9 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.IconCompatParcelizer = i8 - 8;
        }
        int i10 = this.IconCompatParcelizer + i7;
        this.IconCompatParcelizer = i10;
        byte[] bArr4 = this.write;
        int i11 = this.RemoteActionCompatParcelizer;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.IconCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer = i11 + 1;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write() {
        if (this.IconCompatParcelizer == 0) {
            return;
        }
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer++;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write(byte[] bArr, int i) {
        buildTypeSerializer.write(this.IconCompatParcelizer == 0);
        System.arraycopy(this.write, this.RemoteActionCompatParcelizer, bArr, 0, i);
        this.RemoteActionCompatParcelizer += i;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        buildTypeSerializer.write(this.IconCompatParcelizer == 0);
        this.RemoteActionCompatParcelizer += i;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final String AudioAttributesCompatParcelizer(int i, Charset charset) {
        byte[] bArr = new byte[i];
        write(bArr, i);
        return new String(bArr, charset);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int i2 = i & 16383;
        int iMin = Math.min(8 - this.IconCompatParcelizer, 14);
        int i3 = this.IconCompatParcelizer;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.write;
        int i5 = this.RemoteActionCompatParcelizer;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.write[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.write;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        write(14);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        int i2 = this.RemoteActionCompatParcelizer;
        buildTypeSerializer.write(i2 >= 0 && (i2 < (i = this.read) || (i2 == i && this.IconCompatParcelizer == 0)));
    }
}
