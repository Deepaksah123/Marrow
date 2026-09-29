package kotlin;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class setComposer extends getMediaTypeFromFolderType {
    private static final byte[] write = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(read);

    @Override // kotlin.getMediaTypeFromFolderType
    protected final Bitmap read(access3900 access3900Var, Bitmap bitmap, int i, int i2) {
        return setOverallRating.write(access3900Var, bitmap, i, i2);
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        return obj instanceof setComposer;
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        messageDigest.update(write);
    }
}
