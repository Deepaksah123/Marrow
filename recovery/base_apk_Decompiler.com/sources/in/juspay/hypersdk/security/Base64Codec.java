package in.juspay.hypersdk.security;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public class Base64Codec {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static int computeEncodedLength(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (!z) {
            return (((i - 1) / 3) + 1) << 2;
        }
        int i2 = (i / 3) << 2;
        int i3 = i % 3;
        return i3 == 0 ? i2 : i2 + i3 + 1;
    }

    public static byte[] decode(String str) throws UnsupportedEncodingException {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(CharsetNames.UTF_8);
        int length = bytes.length;
        byte[] bArr = new byte[(length * 6) >> 3];
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4 && i < length) {
                int iDecodeDigit = decodeDigit(bytes[i]);
                if (iDecodeDigit >= 0) {
                    i4 |= iDecodeDigit << (18 - (i3 * 6));
                    i3++;
                }
                i++;
            }
            if (i3 >= 2) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
                if (i3 >= 3) {
                    int i6 = i2 + 2;
                    bArr[i5] = (byte) (i4 >> 8);
                    if (i3 >= 4) {
                        i2 += 3;
                        bArr[i6] = (byte) i4;
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = i5;
                }
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    static int decodeDigit(byte b) {
        int iTpGT = tpGT(b, 64) & tpLT(b, 91);
        int iTpGT2 = tpGT(b, 96) & tpLT(b, 123);
        int iTpGT3 = tpGT(b, 47) & tpLT(b, 58);
        int iTpEq = tpEq(b, 45) | tpEq(b, 43);
        int iTpEq2 = tpEq(b, 47) | tpEq(b, 95);
        int iTpSelect = tpSelect(iTpGT, b - 65, 0);
        int iTpSelect2 = tpSelect(iTpGT2, b - 71, 0);
        return tpSelect(iTpGT3, b + 4, 0) | iTpSelect | iTpSelect2 | tpSelect(iTpEq, 62, 0) | tpSelect(iTpEq2, 63, 0) | tpSelect(iTpGT | iTpGT2 | iTpGT3 | iTpEq | iTpEq2, 0, -1);
    }

    public static String encodeToString(byte[] bArr, boolean z) {
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i2 = (length / 3) * 3;
        int iComputeEncodedLength = computeEncodedLength(length, z);
        byte[] bArr2 = new byte[iComputeEncodedLength];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 3;
            int i6 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            if (z) {
                bArr2[i4] = encodeDigitBase64URL((i6 >>> 18) & 63);
                bArr2[i4 + 1] = encodeDigitBase64URL((i6 >>> 12) & 63);
                bArr2[i4 + 2] = encodeDigitBase64URL((i6 >>> 6) & 63);
                i = i4 + 4;
                bArr2[i4 + 3] = encodeDigitBase64URL(i6 & 63);
            } else {
                bArr2[i4] = encodeDigitBase64((i6 >>> 18) & 63);
                bArr2[i4 + 1] = encodeDigitBase64((i6 >>> 12) & 63);
                bArr2[i4 + 2] = encodeDigitBase64((i6 >>> 6) & 63);
                i = i4 + 4;
                bArr2[i4 + 3] = encodeDigitBase64(i6 & 63);
            }
            i4 = i;
            i3 = i5;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = ((bArr[i2] & 255) << 10) | (i7 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z) {
                bArr2[iComputeEncodedLength - 4] = encodeDigitBase64(i8 >> 12);
                bArr2[iComputeEncodedLength - 3] = encodeDigitBase64((i8 >>> 6) & 63);
                bArr2[iComputeEncodedLength - 2] = i7 == 2 ? encodeDigitBase64(i8 & 63) : (byte) 61;
                bArr2[iComputeEncodedLength - 1] = 61;
            } else if (i7 == 2) {
                bArr2[iComputeEncodedLength - 3] = encodeDigitBase64URL(i8 >> 12);
                bArr2[iComputeEncodedLength - 2] = encodeDigitBase64URL((i8 >>> 6) & 63);
                bArr2[iComputeEncodedLength - 1] = encodeDigitBase64URL(i8 & 63);
            } else {
                bArr2[iComputeEncodedLength - 2] = encodeDigitBase64URL(i8 >> 12);
                bArr2[iComputeEncodedLength - 1] = encodeDigitBase64URL((i8 >>> 6) & 63);
            }
        }
        return new String(bArr2, CharsetNames.UTF_8);
    }

    static int tpEq(int i, int i2) {
        int i3 = i ^ i2;
        return ((i3 - 1) & (~i3)) >>> 63;
    }

    static int tpGT(int i, int i2) {
        return (int) ((((long) i2) - ((long) i)) >>> 63);
    }

    static int tpLT(int i, int i2) {
        return (int) ((((long) i) - ((long) i2)) >>> 63);
    }

    static int tpSelect(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }

    static byte encodeDigitBase64(int i) {
        int iTpLT = tpLT(i, 26);
        int iTpGT = tpGT(i, 25);
        int iTpLT2 = tpLT(i, 52);
        int iTpGT2 = tpGT(i, 51);
        int iTpLT3 = tpLT(i, 62);
        int iTpEq = tpEq(i, 62);
        int iTpEq2 = tpEq(i, 63);
        return (byte) (tpSelect(iTpGT2 & iTpLT3, i - 4, 0) | tpSelect(iTpLT, i + 65, 0) | tpSelect(iTpGT & iTpLT2, i + 71, 0) | tpSelect(iTpEq, 43, 0) | tpSelect(iTpEq2, 47, 0));
    }

    static byte encodeDigitBase64URL(int i) {
        int iTpLT = tpLT(i, 26);
        int iTpGT = tpGT(i, 25);
        int iTpLT2 = tpLT(i, 52);
        int iTpGT2 = tpGT(i, 51);
        int iTpLT3 = tpLT(i, 62);
        int iTpEq = tpEq(i, 62);
        int iTpEq2 = tpEq(i, 63);
        return (byte) (tpSelect(iTpGT2 & iTpLT3, i - 4, 0) | tpSelect(iTpLT, i + 65, 0) | tpSelect(iTpGT & iTpLT2, i + 71, 0) | tpSelect(iTpEq, 45, 0) | tpSelect(iTpEq2, 95, 0));
    }
}
