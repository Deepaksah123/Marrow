package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private static final String n = "b";
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.f a;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e b;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.c c;
    private Handler d;
    private h e;
    private Handler h;
    private boolean f = false;
    private boolean g = true;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d i = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d();
    private Runnable j = new c();
    private Runnable k = new d();
    private Runnable l = new e();
    private Runnable m = new f();

    class a implements Runnable {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c.b(this.a);
        }
    }

    /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    public class RunnableC0015b implements Runnable {
        public static int RemoteActionCompatParcelizer;
        public static int read;
        final /* synthetic */ k a;

        /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(RunnableC0015b.this.a);
            }
        }

        RunnableC0015b(k kVar) {
            this.a = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f) {
                b.this.a.a(new a());
            } else {
                String unused = b.n;
            }
        }

        public static int write() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 7065210;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int i3 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            read = i3;
            return i3;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = b.n;
                b.this.c.j();
            } catch (Exception e) {
                b.this.a(e);
                String unused2 = b.n;
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = b.n;
                b.this.c.d();
                if (b.this.d != null) {
                    b.this.d.obtainMessage(onProgress.RemoteActionCompatParcelizer.zxing_prewiew_size_ready, b.this.e()).sendToTarget();
                }
            } catch (Exception e) {
                b.this.a(e);
                String unused2 = b.n;
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = b.n;
                b.this.c.a(b.this.b);
                b.this.c.l();
            } catch (Exception e) {
                b.this.a(e);
                String unused2 = b.n;
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = b.n;
                b.this.c.m();
                b.this.c.c();
            } catch (Exception unused2) {
                String unused3 = b.n;
            }
            b.this.g = true;
            b.this.d.sendEmptyMessage(onProgress.RemoteActionCompatParcelizer.zxing_camera_closed);
            b.this.a.b();
        }
    }

    public b(Context context) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        this.a = in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.f.c();
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.c cVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.c(context);
        this.c = cVar;
        cVar.a(this.i);
        this.h = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Exception exc) {
        Handler handler = this.d;
        if (handler != null) {
            handler.obtainMessage(onProgress.RemoteActionCompatParcelizer.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i e() {
        return this.c.g();
    }

    private void i() {
        if (!this.f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void a(Handler handler) {
        this.d = handler;
    }

    public void a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d dVar) {
        if (this.f) {
            return;
        }
        this.i = dVar;
        this.c.a(dVar);
    }

    public void a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e eVar) {
        this.b = eVar;
    }

    public void a(h hVar) {
        this.e = hVar;
        this.c.a(hVar);
    }

    public void a(k kVar) {
        this.h.post(new RunnableC0015b(kVar));
    }

    public void a(boolean z) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        if (this.f) {
            this.a.a(new a(z));
        }
    }

    public void b() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        if (this.f) {
            this.a.a(this.m);
        } else {
            this.g = true;
        }
        this.f = false;
    }

    public void c() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        i();
        this.a.a(this.k);
    }

    public h d() {
        return this.e;
    }

    public boolean f() {
        return this.g;
    }

    public void g() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        this.f = true;
        this.g = false;
        this.a.b(this.j);
    }

    public void h() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.k.a();
        i();
        this.a.a(this.l);
    }
}
