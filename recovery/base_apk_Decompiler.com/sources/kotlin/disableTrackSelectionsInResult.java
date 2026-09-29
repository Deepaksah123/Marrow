package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class disableTrackSelectionsInResult implements MediaItem<setYear> {
    private final MediaItem<Bitmap> IconCompatParcelizer;

    public disableTrackSelectionsInResult(MediaItem<Bitmap> mediaItem) {
        this.IconCompatParcelizer = (MediaItem) moveMediaSource.AudioAttributesCompatParcelizer(mediaItem);
    }

    @Override // kotlin.MediaItem
    public final setMimeType<setYear> write(Context context, setMimeType<setYear> setmimetype, int i, int i2) {
        setYear setyearRemoteActionCompatParcelizer = setmimetype.RemoteActionCompatParcelizer();
        setMimeType<Bitmap> mediaMetadataBuilder = new MediaMetadataBuilder(setyearRemoteActionCompatParcelizer.read(), Glide.read(context).read());
        setMimeType<Bitmap> setmimetypeWrite = this.IconCompatParcelizer.write(context, mediaMetadataBuilder, i, i2);
        if (!mediaMetadataBuilder.equals(setmimetypeWrite)) {
            mediaMetadataBuilder.MediaBrowserCompatCustomActionResultReceiver();
        }
        setyearRemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, setmimetypeWrite.RemoteActionCompatParcelizer());
        return setmimetype;
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (obj instanceof disableTrackSelectionsInResult) {
            return this.IconCompatParcelizer.equals(((disableTrackSelectionsInResult) obj).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        this.IconCompatParcelizer.write(messageDigest);
    }
}
