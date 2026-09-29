package in.juspay.hyperqr;

import android.graphics.Bitmap;
import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.EncodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;
import in.juspay.widget.qrscanner.com.google.zxing.qrcode.QRCodeWriter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class QrHelper {
    public static Bitmap getBitMapFromBitMatrix(int i, int i2, BitMatrix bitMatrix) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                bitmapCreateBitmap.setPixel(i3, i4, bitMatrix.get(i3, i4) ? -16777216 : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap getQrBitMap(String str, int i, int i2) {
        HashMap map = new HashMap();
        map.put(EncodeHintType.MARGIN, Integer.valueOf(i2));
        BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i, i, map);
        return getBitMapFromBitMatrix(bitMatrixEncode.getWidth(), bitMatrixEncode.getHeight(), bitMatrixEncode);
    }
}
