package kotlin;

import android.content.Context;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class access3300<T> implements MediaItem<T> {
    private static final MediaItem<?> AudioAttributesCompatParcelizer = new access3300();

    @Override // kotlin.MediaItem
    public final setMimeType<T> write(Context context, setMimeType<T> setmimetype, int i, int i2) {
        return setmimetype;
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
    }

    public static <T> access3300<T> write() {
        return (access3300) AudioAttributesCompatParcelizer;
    }

    private access3300() {
    }
}
