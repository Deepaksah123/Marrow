package kotlin;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataExternalSyntheticLambda0 implements IllegalSeekPositionException<ByteBuffer, Bitmap> {
    private final MediaMetadata1 read = new MediaMetadata1();

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(ByteBuffer byteBuffer, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return this.read.AudioAttributesCompatParcelizer(ImageDecoder.createSource(byteBuffer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }
}
