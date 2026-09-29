package in.juspay.widget.qrscanner.com.google.zxing.qrcode.encoder;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import in.juspay.widget.qrscanner.com.google.zxing.WriterException;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitArray;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: loaded from: classes5.dex */
final class MatrixUtil {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, -1}, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean b(int i) {
        return i == -1;
    }

    private MatrixUtil() {
    }

    static int a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iA = a(i2);
        int iA2 = i << (iA - 1);
        while (a(iA2) >= iA) {
            iA2 ^= i2 << (a(iA2) - iA);
        }
        return iA2;
    }

    private static void a(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!b(byteMatrix.get(i4, i2))) {
                throw new WriterException();
            }
            byteMatrix.set(i4, i2, 0);
        }
    }

    static void a(BitArray bitArray, int i, ByteMatrix byteMatrix) throws WriterException {
        boolean z;
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i2 = 0;
        int i3 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < byteMatrix.getHeight()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = width - i4;
                    if (b(byteMatrix.get(i5, height))) {
                        if (i2 < bitArray.getSize()) {
                            z = bitArray.get(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && MaskUtil.a(i, i5, height)) {
                            z = !z;
                        }
                        byteMatrix.set(i5, height, z);
                    }
                }
                height += i3;
            }
            i3 = -i3;
            height += i3;
            width -= 2;
        }
        if (i2 == bitArray.getSize()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Not all bits consumed: ");
        sb.append(i2);
        sb.append('/');
        sb.append(bitArray.getSize());
        throw new WriterException(sb.toString());
    }

    static void a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) {
        a(byteMatrix);
        a(version, byteMatrix);
        a(errorCorrectionLevel, i, byteMatrix);
        c(version, byteMatrix);
        a(bitArray, i, byteMatrix);
    }

    static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) throws WriterException {
        if (!QRCode.isValidMaskPattern(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        bitArray.appendBits(bits, 5);
        bitArray.appendBits(a(bits, 1335), 10);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(21522, 15);
        bitArray.xor(bitArray2);
        if (bitArray.getSize() == 15) {
            return;
        }
        StringBuilder sb = new StringBuilder("should not happen but we got: ");
        sb.append(bitArray.getSize());
        throw new WriterException(sb.toString());
    }

    static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) throws WriterException {
        BitArray bitArray = new BitArray();
        a(errorCorrectionLevel, i, bitArray);
        for (int i2 = 0; i2 < bitArray.getSize(); i2++) {
            boolean z = bitArray.get((bitArray.getSize() - 1) - i2);
            int[] iArr = d[i2];
            byteMatrix.set(iArr[0], iArr[1], z);
            if (i2 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i2) - 1, 8, z);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i2 - 8), z);
            }
        }
    }

    static void a(Version version, BitArray bitArray) throws WriterException {
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(a(version.getVersionNumber(), 7973), 12);
        if (bitArray.getSize() == 18) {
            return;
        }
        StringBuilder sb = new StringBuilder("should not happen but we got: ");
        sb.append(bitArray.getSize());
        throw new WriterException(sb.toString());
    }

    static void a(Version version, ByteMatrix byteMatrix) throws WriterException {
        c(byteMatrix);
        b(byteMatrix);
        b(version, byteMatrix);
        d(byteMatrix);
    }

    static void a(ByteMatrix byteMatrix) {
        byteMatrix.clear((byte) -1);
    }

    private static void b(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                byteMatrix.set(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void b(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() >= 2) {
            int[] iArr = c[version.getVersionNumber() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && b(byteMatrix.get(i2, i))) {
                            b(i2 - 2, i - 2, byteMatrix);
                        }
                    }
                }
            }
        }
    }

    private static void b(ByteMatrix byteMatrix) throws WriterException {
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
    }

    private static void c(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.set(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    static void c(Version version, ByteMatrix byteMatrix) throws WriterException {
        if (version.getVersionNumber() >= 7) {
            BitArray bitArray = new BitArray();
            a(version, bitArray);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean z = bitArray.get(i);
                    i--;
                    byteMatrix.set(i2, (byteMatrix.getHeight() - 11) + i3, z);
                    byteMatrix.set((byteMatrix.getHeight() - 11) + i3, i2, z);
                }
            }
        }
    }

    private static void c(ByteMatrix byteMatrix) throws WriterException {
        int length = a[0].length;
        c(0, 0, byteMatrix);
        c(byteMatrix.getWidth() - length, 0, byteMatrix);
        c(0, byteMatrix.getWidth() - length, byteMatrix);
        a(0, 7, byteMatrix);
        a(byteMatrix.getWidth() - 8, 7, byteMatrix);
        a(0, byteMatrix.getWidth() - 8, byteMatrix);
        d(7, 0, byteMatrix);
        d(byteMatrix.getHeight() - 8, 0, byteMatrix);
        d(7, byteMatrix.getHeight() - 7, byteMatrix);
    }

    private static void d(int i, int i2, ByteMatrix byteMatrix) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!b(byteMatrix.get(i, i4))) {
                throw new WriterException();
            }
            byteMatrix.set(i, i4, 0);
        }
    }

    private static void d(ByteMatrix byteMatrix) {
        int i = 8;
        while (i < byteMatrix.getWidth() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b(byteMatrix.get(i, 6))) {
                byteMatrix.set(i, 6, i3);
            }
            if (b(byteMatrix.get(6, i))) {
                byteMatrix.set(6, i, i3);
            }
            i = i2;
        }
    }
}
