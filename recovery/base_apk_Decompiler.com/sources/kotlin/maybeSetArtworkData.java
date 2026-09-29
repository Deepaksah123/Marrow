package kotlin;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeSetArtworkData extends getMediaTypeFromFolderType {
    private static final byte[] IconCompatParcelizer = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(read);

    @Override // kotlin.getMediaTypeFromFolderType
    protected final Bitmap read(access3900 access3900Var, Bitmap bitmap, int i, int i2) {
        return setOverallRating.AudioAttributesCompatParcelizer(access3900Var, bitmap, i, i2);
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        return obj instanceof maybeSetArtworkData;
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        messageDigest.update(IconCompatParcelizer);
    }
}
