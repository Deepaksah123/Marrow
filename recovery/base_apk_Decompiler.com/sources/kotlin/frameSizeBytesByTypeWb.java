package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class frameSizeBytesByTypeWb extends amrSignatureWb {
    float IconCompatParcelizer = -1.0f;

    @Override // kotlin.amrSignatureWb
    public final void read(peekNextSampleSize peeknextsamplesize, float f, float f2, float f3) {
        peeknextsamplesize.write(BitmapDescriptorFactory.HUE_RED, f3 * f2, 180.0f, 90.0f);
        double d = f3;
        double d2 = f2;
        peeknextsamplesize.write((float) (Math.sin(Math.toRadians(90.0d)) * d * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d * d2));
    }
}
