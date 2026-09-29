package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
final class setArtist {
    private static final access3900 RemoteActionCompatParcelizer = new MediaItemClippingConfigurationBuilder() { // from class: o.setArtist.3
        @Override // kotlin.MediaItemClippingConfigurationBuilder, kotlin.access3900
        public final void write(Bitmap bitmap) {
        }
    };

    static setMimeType<Bitmap> AudioAttributesCompatParcelizer(access3900 access3900Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapIconCompatParcelizer;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapIconCompatParcelizer = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapIconCompatParcelizer = null;
        } else {
            bitmapIconCompatParcelizer = IconCompatParcelizer(access3900Var, current, i, i2);
            z = true;
        }
        if (!z) {
            access3900Var = RemoteActionCompatParcelizer;
        }
        return MediaMetadataBuilder.IconCompatParcelizer(bitmapIconCompatParcelizer, access3900Var);
    }

    private static Bitmap IconCompatParcelizer(access3900 access3900Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lock = setOverallRating.read();
        lock.lock();
        Bitmap bitmapWrite = access3900Var.write(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapWrite);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapWrite;
        } finally {
            lock.unlock();
        }
    }
}
