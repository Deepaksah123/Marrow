package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import in.juspay.widget.qrscanner.com.google.zxing.ResultMetadataType;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.BeepManager;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.InactivityTimer;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a;
import java.util.Iterator;
import java.util.Map;
import kotlin._checkBooleanToStringCoercion;
import kotlin._isNaN;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class CaptureManager {
    private static final String l = "CaptureManager";
    private static int m = 250;
    private Activity a;
    private DecoratedBarcodeView b;
    private InactivityTimer e;
    private BeepManager f;
    private Handler g;
    private final a.f j;
    private boolean k;
    private int c = -1;
    private boolean d = false;
    private boolean h = false;
    private BarcodeCallback i = null;

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = CaptureManager.l;
            CaptureManager.this.d();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CaptureManager.this.g();
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            CaptureManager.this.d();
        }
    }

    class e implements DialogInterface.OnCancelListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            CaptureManager.this.d();
        }
    }

    class a implements a.f {
        a() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void b() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void c() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a(Exception exc) {
            CaptureManager.this.c();
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void d() {
            if (CaptureManager.this.h) {
                String unused = CaptureManager.l;
                CaptureManager.this.d();
            }
        }
    }

    public CaptureManager(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        a aVar = new a();
        this.j = aVar;
        this.k = false;
        this.a = activity;
        this.b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().addStateListener(aVar);
        this.g = new Handler();
        this.e = new InactivityTimer(activity, new b());
        this.f = new BeepManager(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.a.finish();
    }

    private void f() {
        if (_isNaN.checkSelfPermission(this.a, "android.permission.CAMERA") == 0) {
            this.b.resume();
        } else {
            if (this.k) {
                return;
            }
            _checkBooleanToStringCoercion.AudioAttributesCompatParcelizer(this.a, new String[]{"android.permission.CAMERA"}, m);
            this.k = true;
        }
    }

    public static int getCameraPermissionReqCode() {
        return m;
    }

    public static Intent resultIntent(BarcodeResult barcodeResult, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", barcodeResult.toString());
        intent.putExtra("SCAN_RESULT", barcodeResult.getBarcodeFormat().toString());
        byte[] rawBytes = barcodeResult.getRawBytes();
        if (rawBytes != null && rawBytes.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", rawBytes);
        }
        Map<ResultMetadataType, Object> resultMetadata = barcodeResult.getResultMetadata();
        if (resultMetadata != null) {
            if (resultMetadata.containsKey(ResultMetadataType.UPC_EAN_EXTENSION)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", resultMetadata.get(ResultMetadataType.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) resultMetadata.get(ResultMetadataType.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) resultMetadata.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) resultMetadata.get(ResultMetadataType.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i = 0;
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_".concat(String.valueOf(i)), (byte[]) it.next());
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    public static void setCameraPermissionReqCode(int i) {
        m = i;
    }

    protected void b() {
        if (this.b.getBarcodeView().isCameraClosed()) {
            d();
        } else {
            this.h = true;
        }
        this.b.pause();
        this.e.cancel();
    }

    protected void c() {
        if (this.a.isFinishing() || this.d || this.h) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setTitle(this.a.getString(onProgress.AudioAttributesCompatParcelizer.zxing_app_name));
        builder.setMessage(this.a.getString(onProgress.AudioAttributesCompatParcelizer.zxing_msg_camera_framework_bug));
        builder.setPositiveButton(onProgress.AudioAttributesCompatParcelizer.zxing_button_ok, new d());
        builder.setOnCancelListener(new e());
        builder.show();
    }

    public void decode() {
        this.b.decodeSingle(this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void e() {
        /*
            r5 = this;
            int r0 = r5.c
            r1 = -1
            if (r0 != r1) goto L39
            android.app.Activity r0 = r5.a
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            android.app.Activity r1 = r5.a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L2c
            if (r0 == 0) goto L36
            if (r0 != r3) goto L29
            goto L36
        L29:
            r3 = 8
            goto L37
        L2c:
            if (r1 != r3) goto L36
            if (r0 == 0) goto L37
            r1 = 3
            if (r0 == r1) goto L37
            r3 = 9
            goto L37
        L36:
            r3 = r4
        L37:
            r5.c = r3
        L39:
            android.app.Activity r0 = r5.a
            int r5 = r5.c
            r0.setRequestedOrientation(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.CaptureManager.e():void");
    }

    protected void g() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.a.setResult(0, intent);
        b();
    }

    public void initializeFromIntent(Intent intent, Bundle bundle) {
        this.a.getWindow().addFlags(128);
        if (bundle != null) {
            this.c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                e();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.b.initializeFromIntent(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f.setBeepEnabled(false);
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.g.postDelayed(new c(), intent.getLongExtra("TIMEOUT", 0L));
            }
            intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false);
        }
    }

    public void onDestroy() {
        this.d = true;
        this.e.cancel();
        this.g.removeCallbacksAndMessages(null);
    }

    public void onPause() {
        this.e.cancel();
        this.b.pauseAndWait();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == m) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                c();
            } else {
                this.b.resume();
            }
        }
    }

    public void onResume() {
        f();
        this.e.start();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.c);
    }

    public void setBarcodeCallBack(BarcodeCallback barcodeCallback) {
        this.i = barcodeCallback;
    }
}
