package com.fasterxml.jackson.core.io.doubleparser;

/* JADX INFO: loaded from: classes2.dex */
class FastDoubleSwar {
    public static double fma(double d, double d2, double d3) {
        return (d * d2) + d3;
    }

    protected static boolean isDigit(char c) {
        return ((char) (c + 65488)) < '\n';
    }

    public static int tryToParseEightDigitsUtf16(long j, long j2) {
        long j3 = j - 13511005043687472L;
        long j4 = j2 - 13511005043687472L;
        if ((((j + 19703549022044230L) | j3 | (j2 + 19703549022044230L) | j4) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return ((int) ((j4 * 281475406208040961L) >>> 48)) + (((int) ((j3 * 281475406208040961L) >>> 48)) * 10000);
    }

    public static int tryToParseFourDigitsUtf16(long j) {
        long j2 = j - 13511005043687472L;
        if ((((j + 19703549022044230L) | j2) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j2 * 281475406208040961L) >>> 48);
    }

    public static long tryToParseFourHexDigitsUtf16(long j) {
        long j2 = j - 13511005043687472L;
        long j3 = (9207186978729525190L + j) & (-9223231297218904064L);
        if (j3 != ((j + 9196209287131529119L) & (-9223231297218904064L) & ((9223231297218904063L ^ j2) + 15481359945891895L))) {
            return -1L;
        }
        long j4 = (j3 >>> 15) * 65535;
        long j5 = ((~j4) & j2) | (j2 - (j4 & 10977691597996071L));
        long j6 = j5 | (j5 >>> 12);
        return (j6 | (j6 >>> 24)) & 65535;
    }

    FastDoubleSwar() {
    }

    public static boolean isEightDigits(CharSequence charSequence, int i) {
        boolean zIsDigit = true;
        for (int i2 = 0; i2 < 8; i2++) {
            zIsDigit &= isDigit(charSequence.charAt(i2 + i));
        }
        return zIsDigit;
    }

    public static boolean isEightZeroes(CharSequence charSequence, int i) {
        boolean z = true;
        for (int i2 = 0; i2 < 8; i2++) {
            z &= '0' == charSequence.charAt(i2 + i);
        }
        return z;
    }

    public static int readIntBE(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int tryToParseEightDigits(CharSequence charSequence, int i) {
        return tryToParseEightDigitsUtf16(((long) charSequence.charAt(i)) | (((long) charSequence.charAt(i + 1)) << 16) | (((long) charSequence.charAt(i + 2)) << 32) | (((long) charSequence.charAt(i + 3)) << 48), (((long) charSequence.charAt(i + 7)) << 48) | (((long) charSequence.charAt(i + 5)) << 16) | ((long) charSequence.charAt(i + 4)) | (((long) charSequence.charAt(i + 6)) << 32));
    }

    public static long tryToParseEightHexDigits(CharSequence charSequence, int i) {
        long jCharAt = charSequence.charAt(i);
        long jCharAt2 = charSequence.charAt(i + 1);
        long jCharAt3 = charSequence.charAt(i + 2);
        return tryToParseEightHexDigitsUtf16((jCharAt << 48) | (jCharAt2 << 32) | (jCharAt3 << 16) | charSequence.charAt(i + 3), (((long) charSequence.charAt(i + 4)) << 48) | (((long) charSequence.charAt(i + 5)) << 32) | (((long) charSequence.charAt(i + 6)) << 16) | ((long) charSequence.charAt(i + 7)));
    }

    public static long tryToParseEightHexDigitsUtf16(long j, long j2) {
        return (tryToParseFourHexDigitsUtf16(j) << 16) | tryToParseFourHexDigitsUtf16(j2);
    }

    public static int tryToParseFourDigits(CharSequence charSequence, int i) {
        return tryToParseFourDigitsUtf16((((long) charSequence.charAt(i + 3)) << 48) | ((long) charSequence.charAt(i)) | (((long) charSequence.charAt(i + 1)) << 16) | (((long) charSequence.charAt(i + 2)) << 32));
    }

    public static int tryToParseUpTo7Digits(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        boolean zIsDigit = true;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            zIsDigit &= isDigit(cCharAt);
            i3 = ((i3 * 10) + cCharAt) - 48;
            i++;
        }
        if (zIsDigit) {
            return i3;
        }
        return -1;
    }

    public static void writeIntBE(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }
}
