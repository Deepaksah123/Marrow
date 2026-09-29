package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class j extends l {
    private static float a(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    protected float a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        int i = iVar.a;
        if (i <= 0 || iVar.b <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float fA = (1.0f / a(i / iVar2.a)) / a(iVar.b / iVar2.b);
        float fA2 = a((iVar.a / iVar.b) / (iVar2.a / iVar2.b));
        return fA * (((1.0f / fA2) / fA2) / fA2);
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    public Rect b(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        return new Rect(0, 0, iVar2.a, iVar2.b);
    }
}
