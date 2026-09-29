package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
interface setEndPositionMs {
    String AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config);

    void AudioAttributesCompatParcelizer(Bitmap bitmap);

    String IconCompatParcelizer(Bitmap bitmap);

    Bitmap read(int i, int i2, Bitmap.Config config);

    int write(Bitmap bitmap);

    Bitmap write();
}
