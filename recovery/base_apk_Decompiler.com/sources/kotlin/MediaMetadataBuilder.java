package kotlin;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataBuilder implements setMimeType<Bitmap>, setLiveTargetOffsetMs {
    private final access3900 RemoteActionCompatParcelizer;
    private final Bitmap write;

    public static MediaMetadataBuilder IconCompatParcelizer(Bitmap bitmap, access3900 access3900Var) {
        if (bitmap == null) {
            return null;
        }
        return new MediaMetadataBuilder(bitmap, access3900Var);
    }

    public MediaMetadataBuilder(Bitmap bitmap, access3900 access3900Var) {
        this.write = (Bitmap) moveMediaSource.IconCompatParcelizer(bitmap, "Bitmap must not be null");
        this.RemoteActionCompatParcelizer = (access3900) moveMediaSource.IconCompatParcelizer(access3900Var, "BitmapPool must not be null");
    }

    @Override // kotlin.setMimeType
    public final Class<Bitmap> read() {
        return Bitmap.class;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setMimeType
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Bitmap RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.setMimeType
    public final int write() {
        return moveMediaSourceRange.RemoteActionCompatParcelizer(this.write);
    }

    @Override // kotlin.setMimeType
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.RemoteActionCompatParcelizer.write(this.write);
    }

    @Override // kotlin.setLiveTargetOffsetMs
    public final void IconCompatParcelizer() {
        this.write.prepareToDraw();
    }
}
