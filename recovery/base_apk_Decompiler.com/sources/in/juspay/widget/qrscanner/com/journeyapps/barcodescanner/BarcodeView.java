package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import java.util.HashMap;
import java.util.List;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class BarcodeView extends in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a {
    private b B;
    private BarcodeCallback C;
    private e D;
    private c E;
    private Handler F;
    private final Handler.Callback G;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == onProgress.RemoteActionCompatParcelizer.zxing_decode_succeeded) {
                BarcodeResult barcodeResult = (BarcodeResult) message.obj;
                if (barcodeResult != null && BarcodeView.this.C != null && BarcodeView.this.B != b.NONE) {
                    BarcodeView.this.C.barcodeResult(barcodeResult);
                    if (BarcodeView.this.B == b.SINGLE) {
                        BarcodeView.this.stopDecoding();
                    }
                }
                return true;
            }
            if (i == onProgress.RemoteActionCompatParcelizer.zxing_decode_failed) {
                return true;
            }
            if (i != onProgress.RemoteActionCompatParcelizer.zxing_possible_result_points) {
                return false;
            }
            List<ResultPoint> list = (List) message.obj;
            if (BarcodeView.this.C != null && BarcodeView.this.B != b.NONE) {
                BarcodeView.this.C.possibleResultPoints(list);
            }
            return true;
        }
    }

    enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.B = b.NONE;
        this.C = null;
        this.G = new a();
        m();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = b.NONE;
        this.C = null;
        this.G = new a();
        m();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = b.NONE;
        this.C = null;
        this.G = new a();
        m();
    }

    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.b k() {
        if (this.E == null) {
            this.E = l();
        }
        d dVar = new d();
        HashMap map = new HashMap();
        map.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, dVar);
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.b bVarA = this.E.a(map);
        dVar.a(bVarA);
        return bVarA;
    }

    private void m() {
        this.E = new f();
        this.F = new Handler(this.G);
    }

    private void n() {
        o();
        if (this.B == b.NONE || !isPreviewActive()) {
            return;
        }
        e eVar = new e(getCameraInstance(), k(), this.F);
        this.D = eVar;
        eVar.a(getPreviewFramingRect());
        this.D.b();
    }

    private void o() {
        e eVar = this.D;
        if (eVar != null) {
            eVar.c();
            this.D = null;
        }
    }

    public void decodeContinuous(BarcodeCallback barcodeCallback) {
        this.B = b.CONTINUOUS;
        this.C = barcodeCallback;
        n();
    }

    public void decodeSingle(BarcodeCallback barcodeCallback) {
        this.B = b.SINGLE;
        this.C = barcodeCallback;
        n();
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a
    protected void f() {
        super.f();
        n();
    }

    public c getDecoderFactory() {
        return this.E;
    }

    protected c l() {
        return new f();
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a
    public void pause() {
        o();
        super.pause();
    }

    public void setDecoderFactory(c cVar) {
        k.a();
        this.E = cVar;
        e eVar = this.D;
        if (eVar != null) {
            eVar.a(k());
        }
    }

    public void stopDecoding() {
        this.B = b.NONE;
        this.C = null;
        o();
    }
}
