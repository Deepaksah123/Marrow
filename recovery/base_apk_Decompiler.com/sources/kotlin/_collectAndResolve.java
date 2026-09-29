package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _collectAndResolve {
    private int AudioAttributesCompatParcelizer;
    private byte[] IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private int read;

    public _collectAndResolve(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.IconCompatParcelizer = bArr;
        this.read = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer + 1;
        this.RemoteActionCompatParcelizer = i;
        if (i == 8) {
            this.RemoteActionCompatParcelizer = 0;
            int i2 = this.read;
            this.read = i2 + (IconCompatParcelizer(i2 + 1) ? 2 : 1);
        }
        AudioAttributesImplBaseParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        int i2 = this.read;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.read = i4;
        int i5 = this.RemoteActionCompatParcelizer + (i - (i3 << 3));
        this.RemoteActionCompatParcelizer = i5;
        if (i5 > 7) {
            this.read = i4 + 1;
            this.RemoteActionCompatParcelizer = i5 - 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 <= this.read) {
                if (IconCompatParcelizer(i6)) {
                    this.read++;
                    i2 += 3;
                } else {
                    i2 = i6;
                }
            } else {
                AudioAttributesImplBaseParcelizer();
                return;
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        int i2 = this.read;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.RemoteActionCompatParcelizer + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > i4 || i4 >= this.AudioAttributesCompatParcelizer) {
                break;
            }
            if (IconCompatParcelizer(i6)) {
                i4++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
        int i7 = this.AudioAttributesCompatParcelizer;
        if (i4 >= i7) {
            return i4 == i7 && i5 == 0;
        }
        return true;
    }

    public final boolean IconCompatParcelizer() {
        boolean z = (this.IconCompatParcelizer[this.read] & (128 >> this.RemoteActionCompatParcelizer)) != 0;
        AudioAttributesCompatParcelizer();
        return z;
    }

    public final int write(int i) {
        int i2;
        this.RemoteActionCompatParcelizer += i;
        int i3 = 0;
        while (true) {
            i2 = this.RemoteActionCompatParcelizer;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.RemoteActionCompatParcelizer = i4;
            byte[] bArr = this.IconCompatParcelizer;
            int i5 = this.read;
            i3 |= (bArr[i5] & 255) << i4;
            if (IconCompatParcelizer(i5 + 1)) {
                i = 2;
            }
            this.read = i5 + i;
        }
        byte[] bArr2 = this.IconCompatParcelizer;
        int i6 = this.read;
        byte b = bArr2[i6];
        if (i2 == 8) {
            this.RemoteActionCompatParcelizer = 0;
            this.read = i6 + (IconCompatParcelizer(i6 + 1) ? 2 : 1);
        }
        AudioAttributesImplBaseParcelizer();
        return ((-1) >>> (32 - i)) & (((b & 255) >> (8 - i2)) | i3);
    }

    public final boolean write() {
        int i = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = 0;
        while (this.read < this.AudioAttributesCompatParcelizer && !IconCompatParcelizer()) {
            i3++;
        }
        boolean z = this.read == this.AudioAttributesCompatParcelizer;
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        return !z && RemoteActionCompatParcelizer((i3 << 1) + 1);
    }

    public final int read() {
        return AudioAttributesImplApi21Parcelizer();
    }

    public final int RemoteActionCompatParcelizer() {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        return (iAudioAttributesImplApi21Parcelizer % 2 == 0 ? -1 : 1) * ((iAudioAttributesImplApi21Parcelizer + 1) / 2);
    }

    private int AudioAttributesImplApi21Parcelizer() {
        int i = 0;
        while (!IconCompatParcelizer()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? write(i) : 0);
    }

    private boolean IconCompatParcelizer(int i) {
        if (2 > i || i >= this.AudioAttributesCompatParcelizer) {
            return false;
        }
        byte[] bArr = this.IconCompatParcelizer;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i;
        int i2 = this.read;
        buildTypeSerializer.write(i2 >= 0 && (i2 < (i = this.AudioAttributesCompatParcelizer) || (i2 == i && this.RemoteActionCompatParcelizer == 0)));
    }
}
