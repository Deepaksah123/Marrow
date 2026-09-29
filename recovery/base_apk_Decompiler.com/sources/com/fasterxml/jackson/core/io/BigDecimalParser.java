package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalParser;
import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class BigDecimalParser {
    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    public static BigDecimal parse(char[] cArr, int i, int i2) {
        String string;
        try {
            if (i2 < 500) {
                return new BigDecimal(cArr, i, i2);
            }
            return parseBigDecimal(cArr, i, i2, i2 / 10);
        } catch (ArithmeticException | NumberFormatException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (i2 <= 1000) {
                string = new String(cArr, i, i2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(new String(Arrays.copyOfRange(cArr, i, 1000)));
                sb.append("(truncated, full length is ");
                sb.append(cArr.length);
                sb.append(" chars)");
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Value \"");
            sb2.append(string);
            sb2.append("\" can not be represented as `java.math.BigDecimal`, reason: ");
            sb2.append(message);
            throw new NumberFormatException(sb2.toString());
        }
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, 1000));
                sb.append(" [truncated]");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Value \"");
            sb2.append(str);
            sb2.append("\" can not be represented as `java.math.BigDecimal`, reason: ");
            sb2.append(e.getMessage());
            throw new NumberFormatException(sb2.toString());
        }
    }

    private static BigDecimal parseBigDecimal(char[] cArr, int i, int i2, int i3) {
        int i4;
        int i5;
        BigDecimal bigDecimalRec;
        int i6;
        int i7 = i + i2;
        int i8 = i;
        int i9 = i8;
        int i10 = -1;
        int i11 = -1;
        int iAdjustScale = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i8 < i7) {
            char c = cArr[i8];
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (i10 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i10 = i8;
                } else if (c != '-') {
                    if (c != '.') {
                        if (i11 >= 0 && i10 == -1) {
                            iAdjustScale++;
                        }
                    } else {
                        if (i11 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i11 = i8;
                    }
                } else if (i10 >= 0) {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i6 = i8 + 1;
                    z3 = true;
                    i9 = i6;
                    z = true;
                }
            } else if (i10 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i6 = i8 + 1;
                i9 = i6;
                z = true;
            }
            i8++;
        }
        if (i10 >= 0) {
            i4 = 1;
            i5 = Integer.parseInt(new String(cArr, i10 + 1, (i7 - i10) - 1));
            iAdjustScale = adjustScale(iAdjustScale, i5);
            i7 = i10;
        } else {
            i4 = 1;
            i5 = 0;
        }
        if (i11 >= 0) {
            int i12 = (i7 - i11) - i4;
            bigDecimalRec = toBigDecimalRec(cArr, i9, i11 - i9, i5, i3).add(toBigDecimalRec(cArr, i11 + i4, i12, i5 - i12, i3));
        } else {
            bigDecimalRec = toBigDecimalRec(cArr, i9, i7 - i9, i5, i3);
        }
        if (iAdjustScale != 0) {
            bigDecimalRec = bigDecimalRec.setScale(iAdjustScale);
        }
        return z3 ? bigDecimalRec.negate() : bigDecimalRec;
    }

    private static int adjustScale(int i, long j) {
        long j2 = ((long) i) - j;
        if (j2 <= 2147483647L && j2 >= -2147483648L) {
            return (int) j2;
        }
        StringBuilder sb = new StringBuilder("Scale out of range: ");
        sb.append(j2);
        sb.append(" while adjusting scale ");
        sb.append(i);
        sb.append(" to exponent ");
        sb.append(j);
        throw new NumberFormatException(sb.toString());
    }

    private static BigDecimal toBigDecimalRec(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 > i4) {
            int i5 = i2 / 2;
            return toBigDecimalRec(cArr, i, i5, (i3 + i2) - i5, i4).add(toBigDecimalRec(cArr, i + i5, i2 - i5, i3, i4));
        }
        if (i2 == 0) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal(cArr, i, i2).scaleByPowerOfTen(i3);
    }
}
