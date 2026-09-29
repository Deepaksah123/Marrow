package in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder;

import in.juspay.widget.qrscanner.com.google.zxing.ChecksumException;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.FormatException;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import in.juspay.widget.qrscanner.com.google.zxing.common.DecoderResult;
import in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon.GenericGF;
import in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import in.juspay.widget.qrscanner.com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Decoder {
    private final ReedSolomonDecoder a = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

    private DecoderResult a(BitMatrixParser bitMatrixParser, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        Version versionD = bitMatrixParser.d();
        ErrorCorrectionLevel errorCorrectionLevelB = bitMatrixParser.c().b();
        DataBlock[] dataBlockArrA = DataBlock.a(bitMatrixParser.b(), versionD, errorCorrectionLevelB);
        int iB = 0;
        for (DataBlock dataBlock : dataBlockArrA) {
            iB += dataBlock.b();
        }
        byte[] bArr = new byte[iB];
        int i = 0;
        for (DataBlock dataBlock2 : dataBlockArrA) {
            byte[] bArrA = dataBlock2.a();
            int iB2 = dataBlock2.b();
            a(bArrA, iB2);
            int i2 = 0;
            while (i2 < iB2) {
                bArr[i] = bArrA[i2];
                i2++;
                i++;
            }
        }
        return DecodedBitStreamParser.a(bArr, versionD, errorCorrectionLevelB, map);
    }

    private void a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public final DecoderResult decode(BitMatrix bitMatrix) {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    public final DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) {
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        ChecksumException checksumException = null;
        try {
            return a(bitMatrixParser, map);
        } catch (ChecksumException e) {
            e = null;
            checksumException = e;
            try {
                bitMatrixParser.e();
                bitMatrixParser.a(true);
                bitMatrixParser.d();
                bitMatrixParser.c();
                bitMatrixParser.a();
                DecoderResult decoderResultA = this.a(bitMatrixParser, map);
                decoderResultA.setOther(new QRCodeDecoderMetaData(true));
                return decoderResultA;
            } catch (ChecksumException | FormatException e2) {
                if (e != null) {
                    throw e;
                }
                if (checksumException != null) {
                    throw checksumException;
                }
                throw e2;
            }
        } catch (FormatException e3) {
            e = e3;
            bitMatrixParser.e();
            bitMatrixParser.a(true);
            bitMatrixParser.d();
            bitMatrixParser.c();
            bitMatrixParser.a();
            DecoderResult decoderResultA2 = this.a(bitMatrixParser, map);
            decoderResultA2.setOther(new QRCodeDecoderMetaData(true));
            return decoderResultA2;
        }
    }

    public final DecoderResult decode(boolean[][] zArr) {
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public final DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) {
        return decode(BitMatrix.parse(zArr), map);
    }
}
