package kotlin;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setIsBrowsable implements IllegalSeekPositionException<Bitmap, Bitmap> {
    @Override // kotlin.IllegalSeekPositionException
    public final /* bridge */ /* synthetic */ setMimeType<Bitmap> AudioAttributesCompatParcelizer(Bitmap bitmap, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return AudioAttributesCompatParcelizer(bitmap);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Bitmap bitmap, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    private static setMimeType<Bitmap> AudioAttributesCompatParcelizer(Bitmap bitmap) {
        return new write(bitmap);
    }

    static final class write implements setMimeType<Bitmap> {
        private final Bitmap read;

        @Override // kotlin.setMimeType
        public final void MediaBrowserCompatCustomActionResultReceiver() {
        }

        write(Bitmap bitmap) {
            this.read = bitmap;
        }

        @Override // kotlin.setMimeType
        public final Class<Bitmap> read() {
            return Bitmap.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setMimeType
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Bitmap RemoteActionCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.setMimeType
        public final int write() {
            return moveMediaSourceRange.RemoteActionCompatParcelizer(this.read);
        }
    }
}
