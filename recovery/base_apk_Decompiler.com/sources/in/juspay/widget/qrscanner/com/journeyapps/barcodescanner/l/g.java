package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class g extends l {
    private static final String b = "g";

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    protected float a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        if (iVar.a <= 0 || iVar.b <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVarB = iVar.b(iVar2);
        float fPow = iVarB.a / iVar.a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f = (iVarB.a / iVar2.a) + (iVarB.b / iVar2.b);
        return fPow * ((1.0f / f) / f);
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    public Rect b(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVarB = iVar.b(iVar2);
        Objects.toString(iVar);
        Objects.toString(iVarB);
        Objects.toString(iVar2);
        int i = (iVarB.a - iVar2.a) / 2;
        int i2 = (iVarB.b - iVar2.b) / 2;
        return new Rect(-i, -i2, iVarB.a - i, iVarB.b - i2);
    }
}
