package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import in.juspay.widget.qrscanner.com.google.zxing.BarcodeFormat;
import in.juspay.widget.qrscanner.com.google.zxing.DecodeHintType;
import in.juspay.widget.qrscanner.com.google.zxing.MultiFormatReader;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.DecodeFormatManager;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.DecodeHintManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class DecoratedBarcodeView extends FrameLayout {
    private BarcodeView a;
    private ViewfinderView b;
    private TextView c;
    private a d;

    public interface a {
        void a();

        void b();
    }

    class b implements BarcodeCallback {
        private BarcodeCallback a;

        public b(BarcodeCallback barcodeCallback) {
            this.a = barcodeCallback;
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback
        public void barcodeResult(BarcodeResult barcodeResult) {
            this.a.barcodeResult(barcodeResult);
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.BarcodeCallback
        public void possibleResultPoints(List<ResultPoint> list) {
            Iterator<ResultPoint> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.b.a(it.next());
            }
            this.a.possibleResultPoints(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        a();
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    private void a() {
        a((AttributeSet) null);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onProgress.AudioAttributesImplBaseParcelizer.zxing_view);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(onProgress.AudioAttributesImplBaseParcelizer.zxing_view_zxing_scanner_layout, onProgress.IconCompatParcelizer.zxing_juspay_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(onProgress.RemoteActionCompatParcelizer.juspay_zxing_barcode_surface);
        this.a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.a(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(onProgress.RemoteActionCompatParcelizer.juspay_zxing_viewfinder_view);
        this.b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.a);
        TextView textView = (TextView) findViewById(onProgress.RemoteActionCompatParcelizer.juspay_zxing_status_view);
        textView.setText(onProgress.AudioAttributesCompatParcelizer.zxing_msg_qrcode_status);
        this.c = textView;
    }

    public void decodeContinuous(BarcodeCallback barcodeCallback) {
        this.a.decodeContinuous(new b(barcodeCallback));
    }

    public void decodeSingle(BarcodeCallback barcodeCallback) {
        this.a.decodeSingle(new b(barcodeCallback));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(onProgress.RemoteActionCompatParcelizer.juspay_zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.c;
    }

    public ViewfinderView getViewFinder() {
        return this.b;
    }

    public void initializeFromIntent(Intent intent) {
        int intExtra;
        Set<BarcodeFormat> decodeFormats = DecodeFormatManager.parseDecodeFormats(intent);
        Map<DecodeHintType, ?> decodeHints = DecodeHintManager.parseDecodeHints(intent);
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d dVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            dVar.a(intExtra);
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new MultiFormatReader().setHints(decodeHints);
        this.a.setCameraSettings(dVar);
        this.a.setDecoderFactory(new f(decodeFormats, decodeHints, stringExtra2));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        }
        if (i == 25) {
            setTorchOff();
            return true;
        }
        if (i == 27 || i == 80) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void pause() {
        this.a.pause();
    }

    public void pauseAndWait() {
        this.a.pauseAndWait();
    }

    public void resume() {
        this.a.resume();
    }

    public void setStatusText(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.d = aVar;
    }

    public void setTorchOff() {
        this.a.setTorch(false);
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setTorchOn() {
        this.a.setTorch(true);
        a aVar = this.d;
        if (aVar != null) {
            aVar.b();
        }
    }
}
