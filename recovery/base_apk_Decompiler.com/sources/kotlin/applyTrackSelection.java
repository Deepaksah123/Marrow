package kotlin;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class applyTrackSelection implements releaseMediaPeriod<Bitmap, byte[]> {
    private final int AudioAttributesCompatParcelizer;
    private final Bitmap.CompressFormat IconCompatParcelizer;

    public applyTrackSelection() {
        this(Bitmap.CompressFormat.JPEG);
    }

    private applyTrackSelection(Bitmap.CompressFormat compressFormat) {
        this.IconCompatParcelizer = compressFormat;
        this.AudioAttributesCompatParcelizer = 100;
    }

    @Override // kotlin.releaseMediaPeriod
    public final setMimeType<byte[]> AudioAttributesCompatParcelizer(setMimeType<Bitmap> setmimetype, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setmimetype.RemoteActionCompatParcelizer().compress(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, byteArrayOutputStream);
        setmimetype.MediaBrowserCompatCustomActionResultReceiver();
        return new setRecordingMonth(byteArrayOutputStream.toByteArray());
    }
}
