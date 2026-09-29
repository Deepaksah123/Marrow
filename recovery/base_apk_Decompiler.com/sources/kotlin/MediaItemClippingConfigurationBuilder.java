package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class MediaItemClippingConfigurationBuilder implements access3900 {
    @Override // kotlin.access3900
    public final void IconCompatParcelizer() {
    }

    @Override // kotlin.access3900
    public final void read(int i) {
    }

    @Override // kotlin.access3900
    public void write(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // kotlin.access3900
    public final Bitmap write(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // kotlin.access3900
    public final Bitmap RemoteActionCompatParcelizer(int i, int i2, Bitmap.Config config) {
        return write(i, i2, config);
    }
}
