package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.JavaDoubleParser;
import com.fasterxml.jackson.core.io.doubleparser.JavaFloatParser;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberInput {
    static final String MAX_LONG_STR = "9223372036854775807";
    static final String MIN_LONG_STR_NO_SIGN = "9223372036854775808";

    public static int parseInt(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * PlaybackException.CUSTOM_ERROR_CODE_BASE;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int parseInt(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L23
            if (r2 == r4) goto L1e
            if (r2 > r5) goto L1e
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L2c
        L1e:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L23:
            r6 = 9
            if (r2 <= r6) goto L2c
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2c:
            r6 = 57
            if (r1 > r6) goto L7c
            r7 = 48
            if (r1 < r7) goto L7c
            int r1 = r1 - r7
            if (r4 >= r2) goto L77
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L72
            if (r9 < r7) goto L72
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L77
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L6d
            if (r3 < r7) goto L6d
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L77
        L56:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L68
            if (r4 < r7) goto L68
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 >= r2) goto L77
            r4 = r3
            goto L56
        L68:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L6d:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L72:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L77:
            if (r0 == 0) goto L7b
            int r10 = -r1
            return r10
        L7b:
            return r1
        L7c:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) parseInt(cArr, i, i3)) * C.NANOS_PER_SECOND) + ((long) parseInt(cArr, i + i3, 9));
    }

    public static long parseLong19(char[] cArr, int i, boolean z) {
        long j = 0;
        for (int i2 = 0; i2 < 19; i2++) {
            j = (j * 10) + ((long) (cArr[i + i2] - '0'));
        }
        return z ? -j : j;
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int iCharAt = cArr[i + i3] - str.charAt(i3);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int iCharAt = str.charAt(i) - str2.charAt(i);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int parseAsInt(String str, int i) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i2 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    try {
                        return (int) parseDouble(strTrim, true);
                    } catch (NumberFormatException unused) {
                        return i;
                    }
                }
                i2++;
            }
            try {
                return Integer.parseInt(strTrim);
            } catch (NumberFormatException unused2) {
            }
        }
        return i;
    }

    public static long parseAsLong(String str, long j) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i = 1;
            }
            while (i < length) {
                char cCharAt2 = strTrim.charAt(i);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    try {
                        return (long) parseDouble(strTrim, true);
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                }
                i++;
            }
            try {
                return Long.parseLong(strTrim);
            } catch (NumberFormatException unused2) {
            }
        }
        return j;
    }

    public static double parseAsDouble(String str, double d) {
        return parseAsDouble(str, d, false);
    }

    public static double parseAsDouble(String str, double d, boolean z) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                try {
                    return parseDouble(strTrim, z);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d;
    }

    public static double parseDouble(String str) throws NumberFormatException {
        return parseDouble(str, false);
    }

    public static double parseDouble(String str, boolean z) throws NumberFormatException {
        return z ? JavaDoubleParser.parseDouble(str) : Double.parseDouble(str);
    }

    public static float parseFloat(String str) throws NumberFormatException {
        return parseFloat(str, false);
    }

    public static float parseFloat(String str, boolean z) throws NumberFormatException {
        return z ? JavaFloatParser.parseFloat(str) : Float.parseFloat(str);
    }

    public static BigDecimal parseBigDecimal(String str, boolean z) throws NumberFormatException {
        if (z) {
            return BigDecimalParser.parseWithFastParser(str);
        }
        return BigDecimalParser.parse(str);
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        return new BigInteger(str);
    }

    public static BigInteger parseBigInteger(String str, boolean z) throws NumberFormatException {
        if (z) {
            return BigIntegerParser.parseWithFastParser(str);
        }
        return parseBigInteger(str);
    }
}
