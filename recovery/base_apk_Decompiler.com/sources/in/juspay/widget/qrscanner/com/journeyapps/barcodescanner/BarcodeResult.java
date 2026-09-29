package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.Result;
import in.juspay.widget.qrscanner.com.google.zxing.ResultMetadataType;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BarcodeResult {
    protected Result a;
    protected j b;

    public BarcodeResult(Result result, j jVar) {
        this.a = result;
        this.b = jVar;
    }

    public int getBitmapScaleFactor() {
        return 2;
    }

    private static void a(Canvas canvas, Paint paint, ResultPoint resultPoint, ResultPoint resultPoint2, int i) {
        if (resultPoint == null || resultPoint2 == null) {
            return;
        }
        float f = i;
        canvas.drawLine(resultPoint.getX() / f, resultPoint.getY() / f, resultPoint2.getX() / f, resultPoint2.getY() / f, paint);
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.a.getBarcodeFormat();
    }

    public Bitmap getBitmap() {
        return this.b.a(2);
    }

    public Bitmap getBitmapWithResultPoints(int i) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        Bitmap bitmap = getBitmap();
        ResultPoint[] resultPoints = this.a.getResultPoints();
        if (resultPoints == null || resultPoints.length <= 0 || bitmap == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i);
        if (resultPoints.length == 2) {
            paint.setStrokeWidth(4.0f);
            resultPoint = resultPoints[0];
            resultPoint2 = resultPoints[1];
        } else {
            if (resultPoints.length != 4 || (this.a.getBarcodeFormat() != BarcodeFormat.UPC_A && this.a.getBarcodeFormat() != BarcodeFormat.EAN_13)) {
                paint.setStrokeWidth(10.0f);
                for (ResultPoint resultPoint3 : resultPoints) {
                    if (resultPoint3 != null) {
                        canvas.drawPoint(resultPoint3.getX() / 2.0f, resultPoint3.getY() / 2.0f, paint);
                    }
                }
                return bitmapCreateBitmap;
            }
            a(canvas, paint, resultPoints[0], resultPoints[1], 2);
            resultPoint = resultPoints[2];
            resultPoint2 = resultPoints[3];
        }
        a(canvas, paint, resultPoint, resultPoint2, 2);
        return bitmapCreateBitmap;
    }

    public byte[] getRawBytes() {
        return this.a.getRawBytes();
    }

    public Result getResult() {
        return this.a;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.a.getResultMetadata();
    }

    public ResultPoint[] getResultPoints() {
        return this.a.getResultPoints();
    }

    public String getText() {
        return this.a.getText();
    }

    public long getTimestamp() {
        return this.a.getTimestamp();
    }

    public String toString() {
        return this.a.getText();
    }
}
