package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ZipUtil {
    private static final byte[] DOS_TIME_MIN = ZipLong.getBytes(8448);

    public static long adjustToLong(int i) {
        long j = i;
        if (i >= 0) {
            return j;
        }
        long j2 = 0;
        return j + ((((long) 1) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    public static int signedByteToUnsignedInt(byte b) {
        return b >= 0 ? b : b + TarConstants.LF_OLDNORM;
    }

    public static ZipLong toDosTime(Date date) {
        return new ZipLong(toDosTime(date.getTime()));
    }

    public static byte[] toDosTime(long j) {
        byte[] bArr = new byte[4];
        toDosTime(j, bArr, 0);
        return bArr;
    }

    public static void toDosTime(long j, byte[] bArr, int i) {
        toDosTime(Calendar.getInstance(), j, bArr, i);
    }

    static void toDosTime(Calendar calendar, long j, byte[] bArr, int i) {
        calendar.setTimeInMillis(j);
        if (calendar.get(1) < 1980) {
            byte[] bArr2 = DOS_TIME_MIN;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return;
        }
        int i2 = (calendar.get(2) + 1) << 21;
        ZipLong.putLong((calendar.get(13) >> 1) | i2 | ((r10 - 1980) << 25) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5), bArr, i);
    }

    public static byte[] reverse(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = (length - 1) - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    static long bigToLong(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        StringBuilder sb = new StringBuilder("The BigInteger cannot fit inside a 64 bit java long: [");
        sb.append(bigInteger);
        sb.append("]");
        throw new NumberFormatException(sb.toString());
    }

    static BigInteger longToBig(long j) {
        if (j < -2147483648L) {
            StringBuilder sb = new StringBuilder("Negative longs < -2^31 not permitted: [");
            sb.append(j);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
        if (j < 0 && j >= -2147483648L) {
            j = adjustToLong((int) j);
        }
        return BigInteger.valueOf(j);
    }

    public static byte unsignedIntToSignedByte(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i - 256);
        }
        StringBuilder sb = new StringBuilder("Can only convert non-negative integers between [0,255] to byte: [");
        sb.append(i);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    public static Date fromDosTime(ZipLong zipLong) {
        return new Date(dosToJavaTime(zipLong.getValue()));
    }

    public static long dosToJavaTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j >> 16)) & 31);
        calendar.set(11, ((int) (j >> 11)) & 31);
        calendar.set(12, ((int) (j >> 5)) & 63);
        calendar.set(13, ((int) (j << 1)) & 62);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    static void setNameAndCommentFromExtraFields(ZipArchiveEntry zipArchiveEntry, byte[] bArr, byte[] bArr2) {
        String unicodeStringIfOriginalMatches;
        UnicodePathExtraField unicodePathExtraField = (UnicodePathExtraField) zipArchiveEntry.getExtraField(UnicodePathExtraField.UPATH_ID);
        String name = zipArchiveEntry.getName();
        String unicodeStringIfOriginalMatches2 = getUnicodeStringIfOriginalMatches(unicodePathExtraField, bArr);
        if (unicodeStringIfOriginalMatches2 != null && !name.equals(unicodeStringIfOriginalMatches2)) {
            zipArchiveEntry.setName(unicodeStringIfOriginalMatches2);
        }
        if (bArr2 == null || bArr2.length <= 0 || (unicodeStringIfOriginalMatches = getUnicodeStringIfOriginalMatches((UnicodeCommentExtraField) zipArchiveEntry.getExtraField(UnicodeCommentExtraField.UCOM_ID), bArr2)) == null) {
            return;
        }
        zipArchiveEntry.setComment(unicodeStringIfOriginalMatches);
    }

    private static String getUnicodeStringIfOriginalMatches(AbstractUnicodeExtraField abstractUnicodeExtraField, byte[] bArr) {
        if (abstractUnicodeExtraField == null) {
            return null;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (crc32.getValue() != abstractUnicodeExtraField.getNameCRC32()) {
            return null;
        }
        try {
            return ZipEncodingHelper.UTF8_ZIP_ENCODING.decode(abstractUnicodeExtraField.getUnicodeName());
        } catch (IOException unused) {
            return null;
        }
    }

    static byte[] copy(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    static void copy(byte[] bArr, byte[] bArr2, int i) {
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        }
    }

    static boolean canHandleEntryData(ZipArchiveEntry zipArchiveEntry) {
        return supportsEncryptionOf(zipArchiveEntry) && supportsMethodOf(zipArchiveEntry);
    }

    private static boolean supportsEncryptionOf(ZipArchiveEntry zipArchiveEntry) {
        return !zipArchiveEntry.getGeneralPurposeBit().usesEncryption();
    }

    private static boolean supportsMethodOf(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getMethod() == 0 || zipArchiveEntry.getMethod() == ZipMethod.UNSHRINKING.getCode() || zipArchiveEntry.getMethod() == ZipMethod.IMPLODING.getCode() || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.BZIP2.getCode();
    }

    static void checkRequestedFeatures(ZipArchiveEntry zipArchiveEntry) throws UnsupportedZipFeatureException {
        if (!supportsEncryptionOf(zipArchiveEntry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.ENCRYPTION, zipArchiveEntry);
        }
        if (supportsMethodOf(zipArchiveEntry)) {
            return;
        }
        ZipMethod methodByCode = ZipMethod.getMethodByCode(zipArchiveEntry.getMethod());
        if (methodByCode == null) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.METHOD, zipArchiveEntry);
        }
        throw new UnsupportedZipFeatureException(methodByCode, zipArchiveEntry);
    }
}
