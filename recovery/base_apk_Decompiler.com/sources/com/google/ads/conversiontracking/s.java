package com.google.ads.conversiontracking;

import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class s {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    private static final byte[] c = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, -9, -9, -9, -9, -9};
    private static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, -9, -9, -9, -9, -9};

    private static char[] a(byte[] bArr, int i, int i2, char[] cArr, int i3, char[] cArr2) {
        int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            cArr[i3] = cArr2[i4 >>> 18];
            cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
            cArr[i3 + 2] = '=';
            cArr[i3 + 3] = '=';
            return cArr;
        }
        if (i2 == 2) {
            cArr[i3] = cArr2[i4 >>> 18];
            cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
            cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
            cArr[i3 + 3] = '=';
            return cArr;
        }
        if (i2 != 3) {
            return cArr;
        }
        cArr[i3] = cArr2[i4 >>> 18];
        cArr[i3 + 1] = cArr2[(i4 >>> 12) & 63];
        cArr[i3 + 2] = cArr2[(i4 >>> 6) & 63];
        cArr[i3 + 3] = cArr2[i4 & 63];
        return cArr;
    }

    @Deprecated
    public static String a(byte[] bArr, boolean z) {
        return a(bArr, 0, bArr.length, b, z);
    }

    public static String a(byte[] bArr, int i, int i2, char[] cArr, boolean z) {
        char[] cArrA = a(bArr, i, i2, cArr, Integer.MAX_VALUE);
        int length = cArrA.length;
        while (!z && length > 0 && cArrA[length - 1] == '=') {
            length--;
        }
        return new String(cArrA, 0, length);
    }

    static char[] a(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = ((i2 + 2) / 3) << 2;
        char[] cArr2 = new char[i4 + (i4 / i3)];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i2 - 2) {
            int i8 = ((bArr[i5 + i] << 24) >>> 8) | ((bArr[(i5 + 1) + i] << 24) >>> 16) | ((bArr[(i5 + 2) + i] << 24) >>> 24);
            cArr2[i6] = cArr[i8 >>> 18];
            int i9 = i6 + 1;
            cArr2[i9] = cArr[(i8 >>> 12) & 63];
            cArr2[i6 + 2] = cArr[(i8 >>> 6) & 63];
            cArr2[i6 + 3] = cArr[i8 & 63];
            i7 += 4;
            if (i7 == i3) {
                cArr2[i6 + 4] = '\n';
                i7 = 0;
                i6 = i9;
            }
            i5 += 3;
            i6 += 4;
        }
        if (i5 < i2) {
            a(bArr, i + i5, i2 - i5, cArr2, i6, cArr);
            if (i7 + 4 == i3) {
                cArr2[i6 + 4] = '\n';
            }
        }
        return cArr2;
    }
}
