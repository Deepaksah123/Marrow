package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final String i = "a";
    private static final Collection<String> j;
    private boolean a;
    private boolean b;
    private final boolean c;
    private final Camera d;
    private Handler e;
    private int f = 1;
    private final Handler.Callback g;
    private final Camera.AutoFocusCallback h;

    /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a$a, reason: collision with other inner class name */
    class C0013a implements Handler.Callback {
        C0013a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != a.this.f) {
                return false;
            }
            a.this.c();
            return true;
        }
    }

    class b implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a$b$a, reason: collision with other inner class name */
        class RunnableC0014a implements Runnable {
            RunnableC0014a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b = false;
                a.this.a();
            }
        }

        b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            a.this.e.post(new RunnableC0014a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        j = arrayList;
        arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
        arrayList.add("macro");
    }

    public a(Camera camera, d dVar) {
        C0013a c0013a = new C0013a();
        this.g = c0013a;
        this.h = new b();
        this.e = new Handler(c0013a);
        this.d = camera;
        this.c = dVar.c() && j.contains(camera.getParameters().getFocusMode());
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this) {
            if (!this.a && !this.e.hasMessages(this.f)) {
                Handler handler = this.e;
                handler.sendMessageDelayed(handler.obtainMessage(this.f), 2000L);
            }
        }
    }

    private void b() {
        this.e.removeMessages(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.c || this.a || this.b) {
            return;
        }
        try {
            this.d.autoFocus(this.h);
            this.b = true;
        } catch (RuntimeException unused) {
            a();
        }
    }

    public final void d() {
        this.a = false;
        c();
    }

    public final void e() {
        this.a = true;
        this.b = false;
        b();
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
