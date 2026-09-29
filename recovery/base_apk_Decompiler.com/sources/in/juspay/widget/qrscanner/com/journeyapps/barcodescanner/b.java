package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import in.juspay.widget.qrscanner.com.google.zxing.BinaryBitmap;
import in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource;
import in.juspay.widget.qrscanner.com.google.zxing.MultiFormatReader;
import in.juspay.widget.qrscanner.com.google.zxing.Reader;
import in.juspay.widget.qrscanner.com.google.zxing.Result;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback;
import in.juspay.widget.qrscanner.com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b implements ResultPointCallback {
    private Reader a;
    private List<ResultPoint> b = new ArrayList();

    public b(Reader reader) {
        this.a = reader;
    }

    protected Result a(BinaryBitmap binaryBitmap) {
        this.b.clear();
        try {
            Reader reader = this.a;
            Result resultDecodeWithState = reader instanceof MultiFormatReader ? ((MultiFormatReader) reader).decodeWithState(binaryBitmap) : reader.decode(binaryBitmap);
            this.a.reset();
            return resultDecodeWithState;
        } catch (Exception unused) {
            this.a.reset();
            return null;
        } catch (Throwable th) {
            this.a.reset();
            throw th;
        }
    }

    public Result a(LuminanceSource luminanceSource) {
        return a(b(luminanceSource));
    }

    public List<ResultPoint> a() {
        return new ArrayList(this.b);
    }

    protected BinaryBitmap b(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource));
    }

    @Override // in.juspay.widget.qrscanner.com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.b.add(resultPoint);
    }
}
