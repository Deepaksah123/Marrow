package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class isLoadingMediaPeriod implements releaseMediaPeriod<Bitmap, BitmapDrawable> {
    private final Resources IconCompatParcelizer;

    public isLoadingMediaPeriod(Resources resources) {
        this.IconCompatParcelizer = (Resources) moveMediaSource.AudioAttributesCompatParcelizer(resources);
    }

    @Override // kotlin.releaseMediaPeriod
    public final setMimeType<BitmapDrawable> AudioAttributesCompatParcelizer(setMimeType<Bitmap> setmimetype, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return setGenre.IconCompatParcelizer(this.IconCompatParcelizer, setmimetype);
    }
}
