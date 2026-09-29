package kotlin;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadata1 implements IllegalSeekPositionException<ImageDecoder.Source, Bitmap> {
    private final access3900 read = new MediaItemClippingConfigurationBuilder();

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(ImageDecoder.Source source, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setMimeType<Bitmap> AudioAttributesCompatParcelizer(ImageDecoder.Source source, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new MediaItemSubtitleConfigurationBuilder(i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new MediaMetadataBuilder(bitmapDecodeBitmap, this.read);
    }
}
