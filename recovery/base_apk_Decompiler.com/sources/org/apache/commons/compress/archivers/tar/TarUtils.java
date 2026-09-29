package org.apache.commons.compress.archivers.tar;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;

/* JADX INFO: loaded from: classes5.dex */
public class TarUtils {
    private static final int BYTE_MASK = 255;
    static final ZipEncoding DEFAULT_ENCODING = ZipEncodingHelper.getZipEncoding(null);
    static final ZipEncoding FALLBACK_ENCODING = new ZipEncoding() { // from class: org.apache.commons.compress.archivers.tar.TarUtils.1
        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public final boolean canEncode(String str) {
            return true;
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public final ByteBuffer encode(String str) {
            int length = str.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) str.charAt(i);
            }
            return ByteBuffer.wrap(bArr);
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
        public final String decode(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                if (b == 0) {
                    break;
                }
                sb.append((char) (b & 255));
            }
            return sb.toString();
        }
    };

    private TarUtils() {
    }

    public static long parseOctal(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            StringBuilder sb = new StringBuilder("Length ");
            sb.append(i2);
            sb.append(" must be at least 2");
            throw new IllegalArgumentException(sb.toString());
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                throw new IllegalArgumentException(exceptionMessage(bArr, i, i2, i4, b2));
            }
            j = (j << 3) + ((long) (b2 - 48));
            i4++;
        }
        return j;
    }

    public static long parseOctalOrBinary(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        if ((b & 128) == 0) {
            return parseOctal(bArr, i, i2);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            return parseBinaryLong(bArr, i, i2, z);
        }
        return parseBinaryBigInteger(bArr, i, i2, z);
    }

    private static long parseBinaryLong(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            StringBuilder sb = new StringBuilder("At offset ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(" byte binary number exceeds maximum signed long value");
            throw new IllegalArgumentException(sb.toString());
        }
        long jPow = 0;
        for (int i3 = 1; i3 < i2; i3++) {
            jPow = (jPow << 8) + ((long) (bArr[i + i3] & 255));
        }
        if (z) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) << 3)) - 1);
        }
        return z ? -jPow : jPow;
    }

    private static long parseBinaryBigInteger(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            StringBuilder sb = new StringBuilder("At offset ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(" byte binary number exceeds maximum signed long value");
            throw new IllegalArgumentException(sb.toString());
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    public static boolean parseBoolean(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    private static String exceptionMessage(byte[] bArr, int i, int i2, int i3, byte b) {
        String strReplaceAll = new String(bArr, i, i2).replaceAll("\u0000", "{NUL}");
        StringBuilder sb = new StringBuilder("Invalid byte ");
        sb.append((int) b);
        sb.append(" at offset ");
        sb.append(i3 - i);
        sb.append(" in '");
        sb.append(strReplaceAll);
        sb.append("' len=");
        sb.append(i2);
        return sb.toString();
    }

    public static String parseName(byte[] bArr, int i, int i2) {
        try {
            try {
                return parseName(bArr, i, i2, DEFAULT_ENCODING);
            } catch (IOException unused) {
                return parseName(bArr, i, i2, FALLBACK_ENCODING);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String parseName(byte[] bArr, int i, int i2, ZipEncoding zipEncoding) throws IOException {
        while (i2 > 0 && bArr[(i + i2) - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return zipEncoding.decode(bArr2);
        }
        return "";
    }

    public static int formatNameBytes(String str, byte[] bArr, int i, int i2) {
        try {
            try {
                return formatNameBytes(str, bArr, i, i2, DEFAULT_ENCODING);
            } catch (IOException unused) {
                return formatNameBytes(str, bArr, i, i2, FALLBACK_ENCODING);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int formatNameBytes(String str, byte[] bArr, int i, int i2, ZipEncoding zipEncoding) throws IOException {
        int length = str.length();
        ByteBuffer byteBufferEncode = zipEncoding.encode(str);
        while (byteBufferEncode.limit() > i2 && length > 0) {
            length--;
            byteBufferEncode = zipEncoding.encode(str.substring(0, length));
        }
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        System.arraycopy(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), bArr, i, iLimit);
        while (iLimit < i2) {
            bArr[i + iLimit] = 0;
            iLimit++;
        }
        return i + i2;
    }

    public static void formatUnsignedOctalString(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        if (j == 0) {
            i3 = i2 - 2;
            bArr[i4 + i] = TarConstants.LF_NORMAL;
        } else {
            long j2 = j;
            while (i4 >= 0 && j2 != 0) {
                bArr[i + i4] = (byte) (((byte) (7 & j2)) + TarConstants.LF_NORMAL);
                j2 >>>= 3;
                i4--;
            }
            if (j2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append("=");
                sb.append(Long.toOctalString(j));
                sb.append(" will not fit in octal number buffer of length ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = i4;
        }
        while (i3 >= 0) {
            bArr[i + i3] = TarConstants.LF_NORMAL;
            i3--;
        }
    }

    public static int formatOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 2;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 32;
        bArr[(i2 - 1) + i] = 0;
        return i + i2;
    }

    public static int formatLongOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 1;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 32;
        return i + i2;
    }

    public static int formatLongOctalOrBinaryBytes(long j, byte[] bArr, int i, int i2) {
        long j2 = i2 == 8 ? TarConstants.MAXID : TarConstants.MAXSIZE;
        boolean z = j < 0;
        if (!z && j <= j2) {
            return formatLongOctalBytes(j, bArr, i, i2);
        }
        if (i2 < 9) {
            formatLongBinary(j, bArr, i, i2, z);
        }
        formatBigIntegerBinary(j, bArr, i, i2, z);
        bArr[i] = (byte) (z ? 255 : 128);
        return i + i2;
    }

    private static void formatLongBinary(long j, byte[] bArr, int i, int i2, boolean z) {
        int i3 = (i2 - 1) << 3;
        long j2 = 1 << i3;
        long jAbs = Math.abs(j);
        if (jAbs >= j2) {
            StringBuilder sb = new StringBuilder("Value ");
            sb.append(j);
            sb.append(" is too large for ");
            sb.append(i2);
            sb.append(" byte field.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (z) {
            jAbs = ((jAbs ^ (j2 - 1)) | ((long) (255 << i3))) + 1;
        }
        for (int i4 = (i2 + i) - 1; i4 >= i; i4--) {
            bArr[i4] = (byte) jAbs;
            jAbs >>= 8;
        }
    }

    private static void formatBigIntegerBinary(long j, byte[] bArr, int i, int i2, boolean z) {
        byte[] byteArray = BigInteger.valueOf(j).toByteArray();
        int length = byteArray.length;
        int i3 = (i2 + i) - length;
        System.arraycopy(byteArray, 0, bArr, i3, length);
        byte b = (byte) (z ? 255 : 0);
        while (true) {
            i++;
            if (i >= i3) {
                return;
            } else {
                bArr[i] = b;
            }
        }
    }

    public static int formatCheckSumOctalBytes(long j, byte[] bArr, int i, int i2) {
        int i3 = i2 - 2;
        formatUnsignedOctalString(j, bArr, i, i3);
        bArr[i3 + i] = 0;
        bArr[(i2 - 1) + i] = 32;
        return i + i2;
    }

    public static long computeCheckSum(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j += (long) (b & 255);
        }
        return j;
    }

    public static boolean verifyCheckSum(byte[] bArr) {
        long octal = parseOctal(bArr, TarConstants.CHKSUM_OFFSET, 8);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (148 <= i && i < 156) {
                b = 32;
            }
            j += (long) (b & 255);
            j2 += (long) b;
        }
        return octal == j || octal == j2;
    }
}
