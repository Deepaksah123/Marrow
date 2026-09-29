package in.juspay.widget.qrscanner.com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class BitMatrix implements Cloneable {
    private int a;
    private int b;
    private int c;
    private int[] d;

    public BitMatrix(int i) {
        this(i, i);
    }

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(get(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i = -1;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (length < str.length()) {
            if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                if (i3 > i4) {
                    if (i == -1) {
                        i = i3 - i4;
                    } else if (i3 - i4 != i) {
                        throw new IllegalArgumentException("row lengths do not match");
                    }
                    i2++;
                    i4 = i3;
                }
                length++;
            } else {
                if (str.startsWith(str2, length)) {
                    length += str2.length();
                    zArr[i3] = true;
                } else {
                    if (!str.startsWith(str3, length)) {
                        StringBuilder sb = new StringBuilder("illegal character encountered: ");
                        sb.append(str.substring(length));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    length += str3.length();
                    zArr[i3] = false;
                }
                i3++;
            }
        }
        if (i3 > i4) {
            int i5 = i3 - i4;
            if (i == -1) {
                i = i5;
            } else if (i5 != i) {
                throw new IllegalArgumentException("row lengths do not match");
            }
            i2++;
        }
        BitMatrix bitMatrix = new BitMatrix(i, i2);
        for (int i6 = 0; i6 < i3; i6++) {
            if (zArr[i6]) {
                bitMatrix.set(i6 % i, i6 / i);
            }
        }
        return bitMatrix;
    }

    public static BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        BitMatrix bitMatrix = new BitMatrix(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return bitMatrix;
    }

    public final void clear() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final BitMatrix m376clone() {
        return new BitMatrix(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.a == bitMatrix.a && this.b == bitMatrix.b && this.c == bitMatrix.c && Arrays.equals(this.d, bitMatrix.d);
    }

    public final void flip() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            int[] iArr = this.d;
            iArr[i] = ~iArr[i];
        }
    }

    public final void flip(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean get(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final int[] getBottomRightOnBit() {
        int length = this.d.length - 1;
        while (length >= 0 && this.d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.c;
        int i2 = length / i;
        int i3 = 31;
        while ((this.d[length] >>> i3) == 0) {
            i3--;
        }
        return new int[]{((length % i) << 5) + i3, i2};
    }

    public final int[] getEnclosingRectangle() {
        int i = this.a;
        int i2 = this.b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.c;
                if (i6 < i7) {
                    int i8 = this.d[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public final int getHeight() {
        return this.b;
    }

    public final BitArray getRow(int i, BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.a) {
            bitArray = new BitArray(this.a);
        } else {
            bitArray.clear();
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            bitArray.setBulk(i3 << 5, this.d[(i * i2) + i3]);
        }
        return bitArray;
    }

    public final int getRowSize() {
        return this.c;
    }

    public final int[] getTopLeftOnBit() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.c;
        int i4 = i2 / i3;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{((i2 % i3) << 5) + i, i4};
    }

    public final int getWidth() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public final void set(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void setRegion(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.b || i5 > this.a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.c;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 / 32) + (i7 * i2);
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final void setRow(int i, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.d;
        int i2 = this.c;
        System.arraycopy(bitArray2, 0, iArr, i * i2, i2);
    }

    public final String toString() {
        return toString("X ", "  ");
    }

    public final String toString(String str, String str2) {
        return a(str, str2, "\n");
    }

    @Deprecated
    public final String toString(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    public final void unset(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public final void xor(BitMatrix bitMatrix) {
        int i = this.a;
        if (i != bitMatrix.a || this.b != bitMatrix.b || this.c != bitMatrix.c) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        BitArray bitArray = new BitArray(i);
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = this.c;
            int[] bitArray2 = bitMatrix.getRow(i2, bitArray).getBitArray();
            for (int i4 = 0; i4 < this.c; i4++) {
                int[] iArr = this.d;
                int i5 = (i3 * i2) + i4;
                iArr[i5] = iArr[i5] ^ bitArray2[i4];
            }
        }
    }
}
