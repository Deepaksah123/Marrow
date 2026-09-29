package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMediaTypeFromFolderType implements MediaItem<Bitmap> {
    protected abstract Bitmap read(access3900 access3900Var, Bitmap bitmap, int i, int i2);

    @Override // kotlin.MediaItem
    public final setMimeType<Bitmap> write(Context context, setMimeType<Bitmap> setmimetype, int i, int i2) {
        if (!moveMediaSourceRange.IconCompatParcelizer(i, i2)) {
            StringBuilder sb = new StringBuilder("Cannot apply transformation on width: ");
            sb.append(i);
            sb.append(" or height: ");
            sb.append(i2);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        access3900 access3900Var = Glide.read(context).read();
        Bitmap bitmapRemoteActionCompatParcelizer = setmimetype.RemoteActionCompatParcelizer();
        if (i == Integer.MIN_VALUE) {
            i = bitmapRemoteActionCompatParcelizer.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapRemoteActionCompatParcelizer.getHeight();
        }
        Bitmap bitmap = read(access3900Var, bitmapRemoteActionCompatParcelizer, i, i2);
        return bitmapRemoteActionCompatParcelizer.equals(bitmap) ? setmimetype : MediaMetadataBuilder.IconCompatParcelizer(bitmap, access3900Var);
    }
}
