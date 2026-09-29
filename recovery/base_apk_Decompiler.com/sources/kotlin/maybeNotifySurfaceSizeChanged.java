package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeNotifySurfaceSizeChanged {
    public static final int AudioAttributesCompatParcelizer(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.RGBA_F16 ? 8 : 4;
    }

    public static final int write(Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(bitmap, "");
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            sb.append(" [");
            sb.append(bitmap.getWidth());
            sb.append(" x ");
            sb.append(bitmap.getHeight());
            sb.append("] + ");
            sb.append(bitmap.getConfig());
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            stopInternal stopinternal = stopInternal.INSTANCE;
            return stopInternal.write(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        }
    }

    public static final boolean read(Bitmap.Config config) {
        toMagicModuleMetaRepoModel.write(config, "");
        return config == Bitmap.Config.HARDWARE;
    }

    public static final Bitmap.Config AudioAttributesCompatParcelizer(Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(bitmap, "");
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final Bitmap.Config IconCompatParcelizer(Bitmap.Config config) {
        return (config == null || read(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
