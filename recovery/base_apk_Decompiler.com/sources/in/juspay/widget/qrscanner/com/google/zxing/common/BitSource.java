package in.juspay.widget.qrscanner.com.google.zxing.common;

/* JADX INFO: loaded from: classes5.dex */
public final class BitSource {
    private final byte[] a;
    private int b;
    private int c;

    public BitSource(byte[] bArr) {
        this.a = bArr;
    }

    public final int available() {
        return ((this.a.length - this.b) << 3) - this.c;
    }

    public final int getBitOffset() {
        return this.c;
    }

    public final int getByteOffset() {
        return this.b;
    }

    public final int readBits(int i) {
        if (i <= 0 || i > 32 || i > available()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            byte[] bArr = this.a;
            int i7 = this.b;
            byte b = bArr[i7];
            i -= i5;
            int i8 = i2 + i5;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.b = i7 + 1;
            }
            i3 = (((255 >> (8 - i5)) << i6) & b) >> i6;
        }
        if (i > 0) {
            while (i >= 8) {
                byte[] bArr2 = this.a;
                int i9 = this.b;
                i3 = (i3 << 8) | (bArr2[i9] & 255);
                this.b = i9 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i10 = 8 - i;
                byte b2 = this.a[this.b];
                this.c += i;
                return ((((255 >> i10) << i10) & b2) >> i10) | (i3 << i);
            }
        }
        return i3;
    }
}
