package com.fasterxml.jackson.core.io.doubleparser;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractJavaFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    abstract long nan();

    abstract long negativeInfinity();

    abstract long positiveInfinity();

    abstract long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    AbstractJavaFloatingPointBitsFromCharSequence() {
    }

    private static int skipWhitespace(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    private long parseDecFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z3;
        int i9;
        int i10 = -1;
        int i11 = i;
        long j2 = 0;
        char cCharAt = 0;
        boolean z4 = false;
        while (true) {
            if (i11 >= i3) {
                break;
            }
            cCharAt = charSequence.charAt(i11);
            if (!FastDoubleSwar.isDigit(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                z4 |= i10 >= 0;
                i10 = i11;
            } else {
                j2 = ((j2 * 10) + ((long) cCharAt)) - 48;
            }
            i11++;
        }
        if (i10 < 0) {
            i5 = i11 - i;
            i4 = i11;
            i6 = 0;
        } else {
            int i12 = (i10 - i11) + 1;
            i4 = i10;
            i5 = (i11 - i) - 1;
            i6 = i12;
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i11 + 1;
            char cCharAt2 = charAt(charSequence, i7, i3);
            boolean z5 = cCharAt2 == '-';
            if (z5 || cCharAt2 == '+') {
                i7 = i11 + 2;
                cCharAt2 = charAt(charSequence, i7, i3);
            }
            boolean zIsDigit = FastDoubleSwar.isDigit(cCharAt2);
            int i13 = 0;
            do {
                if (i13 < 1024) {
                    i13 = ((i13 * 10) + cCharAt2) - 48;
                }
                i7++;
                cCharAt2 = charAt(charSequence, i7, i3);
            } while (FastDoubleSwar.isDigit(cCharAt2));
            if (z5) {
                i13 = -i13;
            }
            i6 += i13;
            z4 |= !zIsDigit;
            int i14 = i13;
            cCharAt = cCharAt2;
            i8 = i14;
        } else {
            i7 = i11;
            i8 = 0;
        }
        if ((cCharAt == 'd') | (cCharAt == 'D') | (cCharAt == 'f') | (cCharAt == 'F')) {
            i7++;
        }
        int iSkipWhitespace = skipWhitespace(charSequence, i7, i3);
        if (z4 || iSkipWhitespace < i3 || (!z2 && i5 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i5 > 19) {
            int i15 = i;
            int i16 = 0;
            long j3 = 0;
            while (i15 < i11) {
                char cCharAt3 = charSequence.charAt(i15);
                if (cCharAt3 != '.') {
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = ((j3 * 10) + ((long) cCharAt3)) - 48;
                } else {
                    i16++;
                }
                i15++;
            }
            j = j3;
            z3 = i15 < i11;
            i9 = (i4 - i15) + i16 + i8;
        } else {
            j = j2;
            z3 = false;
            i9 = 0;
        }
        return valueOfFloatLiteral(charSequence, i2, i3, z, j, i6, z3, i9);
    }

    public final long parseFloatingPointLiteral(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i + i2;
        if (i < 0 || i4 < i || i4 > charSequence.length() || i2 > 2147483643) {
            throw new IllegalArgumentException("offset < 0 or length > str.length");
        }
        int iSkipWhitespace = skipWhitespace(charSequence, i, i4);
        if (iSkipWhitespace == i4) {
            throw new NumberFormatException("illegal syntax");
        }
        char cCharAt = charSequence.charAt(iSkipWhitespace);
        boolean z = cCharAt == '-';
        if ((z || cCharAt == '+') && (cCharAt = charAt(charSequence, (iSkipWhitespace = iSkipWhitespace + 1), i4)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (cCharAt >= 'I') {
            return parseNaNOrInfinity(charSequence, iSkipWhitespace, i4, z);
        }
        boolean z2 = cCharAt == '0';
        if (z2) {
            int i5 = iSkipWhitespace + 1;
            char cCharAt2 = charAt(charSequence, i5, i4);
            if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                return parseHexFloatLiteral(charSequence, iSkipWhitespace + 2, i, i4, z);
            }
            i3 = i5;
        } else {
            i3 = iSkipWhitespace;
        }
        return parseDecFloatLiteral(charSequence, i3, i, i4, z, z2);
    }

    private long parseHexFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10 = -1;
        int i11 = i;
        long j = 0;
        char cCharAt = 0;
        boolean z3 = false;
        while (i11 < i3) {
            cCharAt = charSequence.charAt(i11);
            int iLookupHex = lookupHex(cCharAt);
            if (iLookupHex < 0) {
                if (iLookupHex != -4) {
                    break;
                }
                z3 |= i10 >= 0;
                int i12 = i11;
                while (i12 < i3 - 8) {
                    long jTryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(charSequence, i12 + 1);
                    if (jTryToParseEightHexDigits < 0) {
                        break;
                    }
                    j = (j << 32) + jTryToParseEightHexDigits;
                    i12 += 8;
                }
                int i13 = i11;
                i11 = i12;
                i10 = i13;
            } else {
                j = (j << 4) | ((long) iLookupHex);
            }
            i11++;
        }
        if (i10 < 0) {
            i5 = i11 - i;
            i4 = i11;
            i6 = 0;
        } else {
            int iMin = Math.min((i10 - i11) + 1, 1024) << 2;
            i4 = i10;
            i5 = (i11 - i) - 1;
            i6 = iMin;
        }
        boolean z4 = (cCharAt | ' ') == 112;
        if (z4) {
            i7 = i11 + 1;
            char cCharAt2 = charAt(charSequence, i7, i3);
            boolean z5 = cCharAt2 == '-';
            if (z5 || cCharAt2 == '+') {
                i7 = i11 + 2;
                cCharAt2 = charAt(charSequence, i7, i3);
            }
            boolean zIsDigit = FastDoubleSwar.isDigit(cCharAt2);
            int i14 = 0;
            do {
                if (i14 < 1024) {
                    i14 = ((i14 * 10) + cCharAt2) - 48;
                }
                i7++;
                cCharAt2 = charAt(charSequence, i7, i3);
            } while (FastDoubleSwar.isDigit(cCharAt2));
            if (z5) {
                i14 = -i14;
            }
            i6 += i14;
            z3 |= !zIsDigit;
            int i15 = i14;
            cCharAt = cCharAt2;
            i8 = i15;
        } else {
            i7 = i11;
            i8 = 0;
        }
        boolean z6 = cCharAt == 'd';
        long j2 = j;
        if ((cCharAt == 'F') | (cCharAt == 'D') | z6 | (cCharAt == 'f')) {
            i7++;
        }
        int iSkipWhitespace = skipWhitespace(charSequence, i7, i3);
        if (z3 || iSkipWhitespace < i3 || i5 == 0 || !z4) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i5 > 16) {
            int i16 = i;
            i9 = 0;
            long j3 = 0;
            while (i16 < i11) {
                int iLookupHex2 = lookupHex(charSequence.charAt(i16));
                if (iLookupHex2 < 0) {
                    i9++;
                } else {
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = (j3 << 4) | ((long) iLookupHex2);
                }
                i16++;
            }
            iSkipWhitespace = i16;
            j2 = j3;
            z2 = i16 < i11;
        } else {
            i9 = 0;
            z2 = false;
        }
        return valueOfHexLiteral(charSequence, i2, i3, z, j2, i6, z2, (((i4 - iSkipWhitespace) + i9) << 2) + i8);
    }

    private long parseNaNOrInfinity(CharSequence charSequence, int i, int i2, boolean z) {
        if (charSequence.charAt(i) == 'N') {
            int i3 = i + 2;
            if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && skipWhitespace(charSequence, i + 3, i2) == i2) {
                return nan();
            }
        } else {
            int i4 = i + 7;
            if (i4 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i4) == 'y' && skipWhitespace(charSequence, i + 8, i2) == i2) {
                return z ? negativeInfinity() : positiveInfinity();
            }
        }
        throw new NumberFormatException("illegal syntax");
    }
}
