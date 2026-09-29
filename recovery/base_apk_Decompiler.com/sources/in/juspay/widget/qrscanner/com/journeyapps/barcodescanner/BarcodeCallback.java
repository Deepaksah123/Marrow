package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface BarcodeCallback {
    void barcodeResult(BarcodeResult barcodeResult);

    void possibleResultPoints(List<ResultPoint> list);
}
