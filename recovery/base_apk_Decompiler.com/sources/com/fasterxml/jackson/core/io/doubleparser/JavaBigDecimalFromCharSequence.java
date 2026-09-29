package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
final class JavaBigDecimalFromCharSequence extends AbstractNumberParser {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal parseBigDecimalString(java.lang.CharSequence r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalFromCharSequence.parseBigDecimalString(java.lang.CharSequence, int, int):java.math.BigDecimal");
    }

    final BigDecimal parseBigDecimalStringWithManyDigits(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        long j;
        int i7;
        int i8;
        boolean z2;
        int i9;
        long j2;
        int i10 = i;
        if (i2 > 1292782635) {
            throw new NumberFormatException("illegal syntax");
        }
        int i11 = i2 + i10;
        char cCharAt = charAt(charSequence, i10, i11);
        boolean z3 = cCharAt == '-';
        if ((z3 || cCharAt == '+') && (cCharAt = charAt(charSequence, (i10 = i10 + 1), i11)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int i12 = i10;
        while (true) {
            i3 = i11 - 8;
            if (i12 >= i3 || !FastDoubleSwar.isEightZeroes(charSequence, i12)) {
                break;
            }
            i12 += 8;
        }
        while (i12 < i11 && charSequence.charAt(i12) == '0') {
            i12++;
        }
        int i13 = i12;
        while (i13 < i3 && FastDoubleSwar.isEightDigits(charSequence, i13)) {
            i13 += 8;
        }
        while (i13 < i11) {
            cCharAt = charSequence.charAt(i13);
            if (!FastDoubleSwar.isDigit(cCharAt)) {
                break;
            }
            i13++;
        }
        if (cCharAt == '.') {
            i4 = i13 + 1;
            while (i4 < i3 && FastDoubleSwar.isEightZeroes(charSequence, i4)) {
                i4 += 8;
            }
            while (i4 < i11 && charSequence.charAt(i4) == '0') {
                i4++;
            }
            i5 = i4;
            while (i5 < i3 && FastDoubleSwar.isEightDigits(charSequence, i5)) {
                i5 += 8;
            }
            while (i5 < i11) {
                cCharAt = charSequence.charAt(i5);
                if (!FastDoubleSwar.isDigit(cCharAt)) {
                    break;
                }
                i5++;
            }
        } else {
            i4 = -1;
            i5 = i13;
            i13 = -1;
        }
        long j3 = 0;
        if (i13 < 0) {
            i6 = i5 - i12;
            z = z3;
            i13 = i5;
            i4 = i13;
            j = 0;
        } else {
            i6 = i12 == i13 ? i5 - i4 : (i5 - i12) - 1;
            z = z3;
            j = (i13 - i5) + 1;
        }
        if ((cCharAt | ' ') == 101) {
            int i14 = i5 + 1;
            char cCharAt2 = charAt(charSequence, i14, i11);
            boolean z4 = cCharAt2 == '-';
            if (z4 || cCharAt2 == '+') {
                i14 = i5 + 2;
                cCharAt2 = charAt(charSequence, i14, i11);
            }
            boolean zIsDigit = FastDoubleSwar.isDigit(cCharAt2);
            while (true) {
                if (j3 < 2147483647L) {
                    i9 = i5;
                    i7 = i13;
                    j3 = ((j3 * 10) + ((long) cCharAt2)) - 48;
                } else {
                    i9 = i5;
                    i7 = i13;
                }
                j2 = j3;
                i14++;
                char cCharAt3 = charAt(charSequence, i14, i11);
                if (!FastDoubleSwar.isDigit(cCharAt3)) {
                    break;
                }
                cCharAt2 = cCharAt3;
                j3 = j2;
                i13 = i7;
                i5 = i9;
            }
            if (z4) {
                j2 = -j2;
            }
            j += j2;
            z2 = true ^ zIsDigit;
            i8 = i9;
            i5 = i14;
        } else {
            i7 = i13;
            i8 = i11;
            z2 = false;
        }
        if (z2 || i5 < i11) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i8 - i10 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j < -2147483648L || j > 2147483647L || i6 > 1292782621) {
            throw new NumberFormatException("value exceeds limits");
        }
        return valueOfBigDecimalString(charSequence, i12, i7, i4, i8, z, (int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.math.BigDecimal valueOfBigDecimalString(java.lang.CharSequence r4, int r5, int r6, int r7, int r8, boolean r9, int r10) {
        /*
            r3 = this;
            int r3 = r8 - r6
            int r3 = r3 + (-1)
            int r0 = r6 - r5
            r1 = 400(0x190, float:5.6E-43)
            r2 = 0
            if (r0 <= 0) goto L1e
            if (r0 <= r1) goto L19
            java.util.NavigableMap r0 = com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.createPowersOfTenFloor16Map()
            com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.fillPowersOfNFloor16Recursive(r0, r5, r6)
            java.math.BigInteger r5 = com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence.parseDigitsRecursive(r4, r5, r6, r0)
            goto L21
        L19:
            java.math.BigInteger r5 = com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence.parseDigitsRecursive(r4, r5, r6, r2)
            goto L20
        L1e:
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
        L20:
            r0 = r2
        L21:
            if (r3 <= 0) goto L4d
            int r6 = r8 - r7
            if (r6 <= r1) goto L35
            if (r0 != 0) goto L2d
            java.util.NavigableMap r0 = com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.createPowersOfTenFloor16Map()
        L2d:
            com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.fillPowersOfNFloor16Recursive(r0, r7, r8)
            java.math.BigInteger r4 = com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence.parseDigitsRecursive(r4, r7, r8, r0)
            goto L39
        L35:
            java.math.BigInteger r4 = com.fasterxml.jackson.core.io.doubleparser.ParseDigitsTaskCharSequence.parseDigitsRecursive(r4, r7, r8, r2)
        L39:
            int r6 = r5.signum()
            if (r6 != 0) goto L41
            r5 = r4
            goto L4d
        L41:
            java.math.BigInteger r3 = com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.computePowerOfTen(r0, r3)
            java.math.BigInteger r3 = com.fasterxml.jackson.core.io.doubleparser.FftMultiplier.multiply(r5, r3)
            java.math.BigInteger r5 = r3.add(r4)
        L4d:
            if (r9 == 0) goto L53
            java.math.BigInteger r5 = r5.negate()
        L53:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            int r4 = -r10
            r3.<init>(r5, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalFromCharSequence.valueOfBigDecimalString(java.lang.CharSequence, int, int, int, int, boolean, int):java.math.BigDecimal");
    }
}
