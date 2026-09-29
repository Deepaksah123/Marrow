package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i a;
    private int b;
    private l c = new i();

    public h(int i, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
        this.b = i;
        this.a = iVar;
    }

    public int a() {
        return this.b;
    }

    public Rect a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
        return this.c.b(iVar, this.a);
    }

    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i a(List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> list, boolean z) {
        return this.c.b(list, a(z));
    }

    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i a(boolean z) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar = this.a;
        if (iVar == null) {
            return null;
        }
        return z ? iVar.a() : iVar;
    }

    public void a(l lVar) {
        this.c = lVar;
    }
}
