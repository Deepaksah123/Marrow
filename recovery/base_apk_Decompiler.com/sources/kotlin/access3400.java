package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class access3400<DataType> implements IllegalSeekPositionException<DataType, BitmapDrawable> {
    private final IllegalSeekPositionException<DataType, Bitmap> IconCompatParcelizer;
    private final Resources read;

    public access3400(Resources resources, IllegalSeekPositionException<DataType, Bitmap> illegalSeekPositionException) {
        this.read = (Resources) moveMediaSource.AudioAttributesCompatParcelizer(resources);
        this.IconCompatParcelizer = (IllegalSeekPositionException) moveMediaSource.AudioAttributesCompatParcelizer(illegalSeekPositionException);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final boolean RemoteActionCompatParcelizer(DataType datatype, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(datatype, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final setMimeType<BitmapDrawable> AudioAttributesCompatParcelizer(DataType datatype, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return setGenre.IconCompatParcelizer(this.read, this.IconCompatParcelizer.AudioAttributesCompatParcelizer(datatype, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk));
    }
}
