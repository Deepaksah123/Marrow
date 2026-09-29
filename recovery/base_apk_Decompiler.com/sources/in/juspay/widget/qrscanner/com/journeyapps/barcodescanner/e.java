package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import in.juspay.widget.qrscanner.com.google.zxing.LuminanceSource;
import in.juspay.widget.qrscanner.com.google.zxing.Result;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    private static final String k = "e";
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b a;
    private HandlerThread b;
    private Handler c;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.b d;
    private Handler e;
    private Rect f;
    private boolean g = false;
    private final Object h = new Object();
    private final Handler.Callback i = new a();
    private final in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.k j = new b();

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == onProgress.RemoteActionCompatParcelizer.zxing_decode) {
                e.this.b((j) message.obj);
                return true;
            }
            if (i != onProgress.RemoteActionCompatParcelizer.zxing_preview_failed) {
                return true;
            }
            e.this.a();
            return true;
        }
    }

    class b implements in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.k {
        b() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.k
        public void a(j jVar) {
            synchronized (e.this.h) {
                if (e.this.g) {
                    e.this.c.obtainMessage(onProgress.RemoteActionCompatParcelizer.zxing_decode, jVar).sendToTarget();
                }
            }
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.k
        public void a(Exception exc) {
            synchronized (e.this.h) {
                if (e.this.g) {
                    e.this.c.obtainMessage(onProgress.RemoteActionCompatParcelizer.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public e(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.b bVar2, Handler handler) {
        k.a();
        this.a = bVar;
        this.d = bVar2;
        this.e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.a.a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(j jVar) {
        Message messageObtain;
        System.currentTimeMillis();
        jVar.a(this.f);
        LuminanceSource luminanceSourceA = a(jVar);
        Result resultA = luminanceSourceA != null ? this.d.a(luminanceSourceA) : null;
        if (resultA != null) {
            System.currentTimeMillis();
            if (this.e != null) {
                messageObtain = Message.obtain(this.e, onProgress.RemoteActionCompatParcelizer.zxing_decode_succeeded, new BarcodeResult(resultA, jVar));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.e;
            if (handler != null) {
                messageObtain = Message.obtain(handler, onProgress.RemoteActionCompatParcelizer.zxing_decode_failed);
                messageObtain.sendToTarget();
            }
        }
        if (this.e != null) {
            Message.obtain(this.e, onProgress.RemoteActionCompatParcelizer.zxing_possible_result_points, this.d.a()).sendToTarget();
        }
        a();
    }

    protected LuminanceSource a(j jVar) {
        if (this.f == null) {
            return null;
        }
        return jVar.a();
    }

    public void a(Rect rect) {
        this.f = rect;
    }

    public void a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.b bVar) {
        this.d = bVar;
    }

    public void b() {
        k.a();
        HandlerThread handlerThread = new HandlerThread(k);
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(this.b.getLooper(), this.i);
        this.g = true;
        a();
    }

    public void c() {
        k.a();
        synchronized (this.h) {
            this.g = false;
            this.c.removeCallbacksAndMessages(null);
            this.b.quit();
        }
    }
}
