package in.juspay.widget.qrscanner.com.google.zxing.qrcode;

import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.BinaryBitmap;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.NotFoundException;
import in.juspay.widget.qrscanner.com.google.zxing.Reader;
import in.juspay.widget.qrscanner.com.google.zxing.Result;
import in.juspay.widget.qrscanner.com.google.zxing.ResultMetadataType;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import in.juspay.widget.qrscanner.com.google.zxing.common.DecoderResult;
import in.juspay.widget.qrscanner.com.google.zxing.common.DetectorResult;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Decoder;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.detector.Detector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class QRCodeReader implements Reader {
    private static final ResultPoint[] b = new ResultPoint[0];
    private final Decoder a = new Decoder();

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public void reset() {
    }

    private static float a(int[] iArr, BitMatrix bitMatrix) throws NotFoundException {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < width && i2 < height) {
            if (z != bitMatrix.get(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i == width || i2 == height) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i - iArr[0]) / 7.0f;
    }

    private static BitMatrix a(BitMatrix bitMatrix) throws NotFoundException {
        int[] topLeftOnBit = bitMatrix.getTopLeftOnBit();
        int[] bottomRightOnBit = bitMatrix.getBottomRightOnBit();
        if (topLeftOnBit == null || bottomRightOnBit == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fA = a(topLeftOnBit, bitMatrix);
        int i = topLeftOnBit[1];
        int i2 = bottomRightOnBit[1];
        int i3 = topLeftOnBit[0];
        int i4 = bottomRightOnBit[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3 && (i4 = i3 + i5) >= bitMatrix.getWidth()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iRound = Math.round(((i4 - i3) + 1) / fA);
        int iRound2 = Math.round((i5 + 1) / fA);
        if (iRound <= 0 || iRound2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = (int) (fA / 2.0f);
        int i7 = i + i6;
        int i8 = i3 + i6;
        int i9 = (((int) ((iRound - 1) * fA)) + i8) - i4;
        if (i9 > 0) {
            if (i9 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i8 -= i9;
        }
        int i10 = (((int) ((iRound2 - 1) * fA)) + i7) - i2;
        if (i10 > 0) {
            if (i10 > i6) {
                throw NotFoundException.getNotFoundInstance();
            }
            i7 -= i10;
        }
        BitMatrix bitMatrix2 = new BitMatrix(iRound, iRound2);
        for (int i11 = 0; i11 < iRound2; i11++) {
            int i12 = (int) (i11 * fA);
            for (int i13 = 0; i13 < iRound; i13++) {
                if (bitMatrix.get(((int) (i13 * fA)) + i8, i12 + i7)) {
                    bitMatrix2.set(i13, i11);
                }
            }
        }
        return bitMatrix2;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        DecoderResult decoderResultDecode;
        ResultPoint[] points;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            DetectorResult detectorResultDetect = new Detector(binaryBitmap.getBlackMatrix()).detect(map);
            decoderResultDecode = this.a.decode(detectorResultDetect.getBits(), map);
            points = detectorResultDetect.getPoints();
        } else {
            decoderResultDecode = this.a.decode(a(binaryBitmap.getBlackMatrix()), map);
            points = b;
        }
        if (decoderResultDecode.getOther() instanceof QRCodeDecoderMetaData) {
            ((QRCodeDecoderMetaData) decoderResultDecode.getOther()).applyMirroredCorrection(points);
        }
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), points, BarcodeFormat.QR_CODE);
        List<byte[]> byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        if (decoderResultDecode.hasStructuredAppend()) {
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(decoderResultDecode.getStructuredAppendSequenceNumber()));
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(decoderResultDecode.getStructuredAppendParity()));
        }
        ResultMetadataType resultMetadataType = ResultMetadataType.SYMBOLOGY_IDENTIFIER;
        StringBuilder sb = new StringBuilder("]Q");
        sb.append(decoderResultDecode.getSymbologyModifier());
        result.putMetadata(resultMetadataType, sb.toString());
        return result;
    }
}
