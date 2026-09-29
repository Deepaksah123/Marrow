package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class isWideBandValidFrameType extends amrSignatureWb {
    float write = -1.0f;

    @Override // kotlin.amrSignatureWb
    public final void read(peekNextSampleSize peeknextsamplesize, float f, float f2, float f3) {
        peeknextsamplesize.write(BitmapDescriptorFactory.HUE_RED, f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        peeknextsamplesize.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f4, 180.0f, 90.0f);
    }
}
