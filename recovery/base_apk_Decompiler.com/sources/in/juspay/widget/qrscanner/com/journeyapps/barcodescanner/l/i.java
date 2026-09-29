package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class i extends l {
    private static final String b = "i";

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    protected float a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        if (iVar.a <= 0 || iVar.b <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVarC = iVar.c(iVar2);
        float fPow = iVarC.a / iVar.a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f = (iVar2.a / iVarC.a) * (iVar2.b / iVarC.b);
        return fPow * (((1.0f / f) / f) / f);
    }

    @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l
    public Rect b(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVarC = iVar.c(iVar2);
        Objects.toString(iVar);
        Objects.toString(iVarC);
        Objects.toString(iVar2);
        int i = (iVarC.a - iVar2.a) / 2;
        int i2 = (iVarC.b - iVar2.b) / 2;
        return new Rect(-i, -i2, iVarC.a - i, iVarC.b - i2);
    }
}
