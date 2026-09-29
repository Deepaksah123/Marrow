package kotlin;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class setConductor implements IllegalSeekPositionException<InputStream, Bitmap> {
    private final MediaMetadata1 AudioAttributesCompatParcelizer = new MediaMetadata1();

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(InputStream inputStream, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(InputStream inputStream, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(ImageDecoder.createSource(maybeReleaseChildSource.read(inputStream)), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }
}
