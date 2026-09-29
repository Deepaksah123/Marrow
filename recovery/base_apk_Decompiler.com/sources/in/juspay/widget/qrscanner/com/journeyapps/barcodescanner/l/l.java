package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l {
    private static final String a = "l";

    class a implements Comparator<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> {
        final /* synthetic */ in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i a;

        a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
            this.a = iVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2) {
            return Float.compare(l.this.a(iVar2, this.a), l.this.a(iVar, this.a));
        }
    }

    protected abstract float a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2);

    public abstract Rect b(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar2);

    public List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> a(List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> list, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
        if (iVar == null) {
            return list;
        }
        Collections.sort(list, new a(iVar));
        return list;
    }

    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i b(List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> list, in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
        List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> listA = a(list, iVar);
        Objects.toString(iVar);
        Objects.toString(listA);
        return listA.get(0);
    }
}
