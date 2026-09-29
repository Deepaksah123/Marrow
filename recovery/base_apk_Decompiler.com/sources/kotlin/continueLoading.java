package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class continueLoading implements releaseMediaPeriod<Drawable, byte[]> {
    private final releaseMediaPeriod<setYear, byte[]> AudioAttributesCompatParcelizer;
    private final releaseMediaPeriod<Bitmap, byte[]> IconCompatParcelizer;
    private final access3900 write;

    /* JADX WARN: Multi-variable type inference failed */
    private static setMimeType<setYear> write(setMimeType<Drawable> setmimetype) {
        return setmimetype;
    }

    public continueLoading(access3900 access3900Var, releaseMediaPeriod<Bitmap, byte[]> releasemediaperiod, releaseMediaPeriod<setYear, byte[]> releasemediaperiod2) {
        this.write = access3900Var;
        this.IconCompatParcelizer = releasemediaperiod;
        this.AudioAttributesCompatParcelizer = releasemediaperiod2;
    }

    @Override // kotlin.releaseMediaPeriod
    public final setMimeType<byte[]> AudioAttributesCompatParcelizer(setMimeType<Drawable> setmimetype, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Drawable drawableRemoteActionCompatParcelizer = setmimetype.RemoteActionCompatParcelizer();
        if (drawableRemoteActionCompatParcelizer instanceof BitmapDrawable) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(MediaMetadataBuilder.IconCompatParcelizer(((BitmapDrawable) drawableRemoteActionCompatParcelizer).getBitmap(), this.write), r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
        if (drawableRemoteActionCompatParcelizer instanceof setYear) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(write(setmimetype), r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
        return null;
    }
}
