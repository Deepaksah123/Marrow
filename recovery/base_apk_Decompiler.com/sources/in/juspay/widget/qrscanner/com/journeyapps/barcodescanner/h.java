package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    private int a;
    private WindowManager b;
    private OrientationEventListener c;
    private g d;

    class a extends OrientationEventListener {
        a(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager windowManager = h.this.b;
            g gVar = h.this.d;
            if (h.this.b == null || gVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == h.this.a) {
                return;
            }
            h.this.a = rotation;
            gVar.a(rotation);
        }
    }

    public void a() {
        OrientationEventListener orientationEventListener = this.c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.c = null;
        this.b = null;
        this.d = null;
    }

    public void a(Context context, g gVar) {
        a();
        Context applicationContext = context.getApplicationContext();
        this.d = gVar;
        this.b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.c = aVar;
        aVar.enable();
        this.a = this.b.getDefaultDisplay().getRotation();
    }
}
