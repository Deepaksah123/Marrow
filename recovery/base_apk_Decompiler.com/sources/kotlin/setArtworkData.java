package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class setArtworkData implements MediaItem<Drawable> {
    private final MediaItem<Bitmap> IconCompatParcelizer;
    private final boolean write;

    public final MediaItem<BitmapDrawable> read() {
        return this;
    }

    public setArtworkData(MediaItem<Bitmap> mediaItem, boolean z) {
        this.IconCompatParcelizer = mediaItem;
        this.write = z;
    }

    @Override // kotlin.MediaItem
    public final setMimeType<Drawable> write(Context context, setMimeType<Drawable> setmimetype, int i, int i2) {
        access3900 access3900Var = Glide.read(context).read();
        Drawable drawableRemoteActionCompatParcelizer = setmimetype.RemoteActionCompatParcelizer();
        setMimeType<Bitmap> setmimetypeAudioAttributesCompatParcelizer = setArtist.AudioAttributesCompatParcelizer(access3900Var, drawableRemoteActionCompatParcelizer, i, i2);
        if (setmimetypeAudioAttributesCompatParcelizer == null) {
            if (!this.write) {
                return setmimetype;
            }
            StringBuilder sb = new StringBuilder("Unable to convert ");
            sb.append(drawableRemoteActionCompatParcelizer);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        setMimeType<Bitmap> setmimetypeWrite = this.IconCompatParcelizer.write(context, setmimetypeAudioAttributesCompatParcelizer, i, i2);
        if (setmimetypeWrite.equals(setmimetypeAudioAttributesCompatParcelizer)) {
            setmimetypeWrite.MediaBrowserCompatCustomActionResultReceiver();
            return setmimetype;
        }
        return read(context, setmimetypeWrite);
    }

    private static setMimeType<Drawable> read(Context context, setMimeType<Bitmap> setmimetype) {
        return setGenre.IconCompatParcelizer(context.getResources(), setmimetype);
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (obj instanceof setArtworkData) {
            return this.IconCompatParcelizer.equals(((setArtworkData) obj).IconCompatParcelizer);
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
