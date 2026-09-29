package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes4.dex */
class f {
    private static f e;
    private Handler a;
    private HandlerThread b;
    private int c = 0;
    private final Object d = new Object();

    private f() {
    }

    private void a() {
        synchronized (this.d) {
            if (this.a == null) {
                if (this.c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.b = handlerThread;
                handlerThread.start();
                this.a = new Handler(this.b.getLooper());
            }
        }
    }

    public static f c() {
        if (e == null) {
            e = new f();
        }
        return e;
    }

    private void d() {
        synchronized (this.d) {
            this.b.quit();
            this.b = null;
            this.a = null;
        }
    }

    protected void a(Runnable runnable) {
        synchronized (this.d) {
            a();
            this.a.post(runnable);
        }
    }

    protected void b() {
        synchronized (this.d) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                d();
            }
        }
    }

    protected void b(Runnable runnable) {
        synchronized (this.d) {
            this.c++;
            a(runnable);
        }
    }
}
