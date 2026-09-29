package in.juspay.widget.qrscanner.com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ByteMatrix {
    private final byte[][] a;
    private final int b;
    private final int c;

    public ByteMatrix(int i, int i2) {
        this.a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final void clear(byte b) {
        for (byte[] bArr : this.a) {
            Arrays.fill(bArr, b);
        }
    }

    public final byte get(int i, int i2) {
        return this.a[i2][i];
    }

    public final byte[][] getArray() {
        return this.a;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final void set(int i, int i2, byte b) {
        this.a[i2][i] = b;
    }

    public final void set(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public final void set(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(((this.b << 1) * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            byte[] bArr = this.a[i];
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = bArr[i2];
                sb.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
