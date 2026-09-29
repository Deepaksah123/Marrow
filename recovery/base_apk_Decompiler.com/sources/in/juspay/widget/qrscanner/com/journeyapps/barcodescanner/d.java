package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback;

/* JADX INFO: loaded from: classes5.dex */
public class d implements ResultPointCallback {
    private b a;

    public void a(b bVar) {
        this.a = bVar;
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.foundPossibleResultPoint(resultPoint);
        }
    }
}
