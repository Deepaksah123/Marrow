package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class ZipShort implements Cloneable, Serializable {
    private static final int BYTE_1_MASK = 65280;
    private static final int BYTE_1_SHIFT = 8;
    private static final long serialVersionUID = 1;
    private final int value;

    public ZipShort(int i) {
        this.value = i;
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public final byte[] getBytes() {
        int i = this.value;
        return new byte[]{(byte) i, (byte) (i >> 8)};
    }

    public final int getValue() {
        return this.value;
    }

    public static byte[] getBytes(int i) {
        byte[] bArr = new byte[2];
        putShort(i, bArr, 0);
        return bArr;
    }

    public static void putShort(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
    }

    public static int getValue(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & BYTE_1_MASK) + (bArr[i] & 255);
    }

    public static int getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipShort) && this.value == ((ZipShort) obj).getValue();
    }

    public final int hashCode() {
        return this.value;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipShort value: ");
        sb.append(this.value);
        return sb.toString();
    }
}
