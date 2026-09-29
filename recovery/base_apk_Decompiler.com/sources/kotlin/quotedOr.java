package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class quotedOr {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private final byte[] read;
    private final int write;

    public quotedOr(byte[] bArr) {
        this.read = bArr;
        this.write = bArr.length;
    }

    public final boolean IconCompatParcelizer() {
        boolean z = (((this.read[this.IconCompatParcelizer] & 255) >> this.AudioAttributesCompatParcelizer) & 1) == 1;
        AudioAttributesCompatParcelizer(1);
        return z;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.IconCompatParcelizer;
        int iMin = Math.min(i, 8 - this.AudioAttributesCompatParcelizer);
        int i3 = i2 + 1;
        int i4 = ((this.read[i2] & 255) >> this.AudioAttributesCompatParcelizer) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.read[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        AudioAttributesCompatParcelizer(i);
        return ((-1) >>> (32 - i)) & i4;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        int i2 = i / 8;
        int i3 = this.IconCompatParcelizer + i2;
        this.IconCompatParcelizer = i3;
        int i4 = this.AudioAttributesCompatParcelizer + (i - (i2 << 3));
        this.AudioAttributesCompatParcelizer = i4;
        if (i4 > 7) {
            this.IconCompatParcelizer = i3 + 1;
            this.AudioAttributesCompatParcelizer = i4 - 8;
        }
        write();
    }

    public final int read() {
        return (this.IconCompatParcelizer << 3) + this.AudioAttributesCompatParcelizer;
    }

    private void write() {
        int i;
        int i2 = this.IconCompatParcelizer;
        buildTypeSerializer.write(i2 >= 0 && (i2 < (i = this.write) || (i2 == i && this.AudioAttributesCompatParcelizer == 0)));
    }
}
