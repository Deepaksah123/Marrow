package kotlin;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class getFolderTypeFromMediaType implements IllegalSeekPositionException<ByteBuffer, Bitmap> {
    private final setAlbumTitle RemoteActionCompatParcelizer;

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(ByteBuffer byteBuffer, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return IconCompatParcelizer();
    }

    public getFolderTypeFromMediaType(setAlbumTitle setalbumtitle) {
        this.RemoteActionCompatParcelizer = setalbumtitle;
    }

    private boolean IconCompatParcelizer() {
        return setAlbumTitle.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(byteBuffer, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }
}
