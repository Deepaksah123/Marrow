package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class setSeekBackIncrementMs implements setDeviceVolumeControlEnabled {
    @Override // kotlin.setDeviceVolumeControlEnabled
    public final void AudioAttributesCompatParcelizer(int i) {
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final void RemoteActionCompatParcelizer(Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(bitmap, "");
        bitmap.recycle();
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final Bitmap read(int i, int i2, Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        return IconCompatParcelizer(i, i2, config);
    }

    @Override // kotlin.setDeviceVolumeControlEnabled
    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        AudioAttributesCompatParcelizer(config);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmapCreateBitmap, "");
        return bitmapCreateBitmap;
    }

    private static void AudioAttributesCompatParcelizer(Bitmap.Config config) {
        if (maybeNotifySurfaceSizeChanged.read(config)) {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
    }
}
