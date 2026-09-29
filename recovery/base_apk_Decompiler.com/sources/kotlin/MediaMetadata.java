package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadata implements LoadControl<BitmapDrawable> {
    private final access3900 AudioAttributesCompatParcelizer;
    private final LoadControl<Bitmap> IconCompatParcelizer;

    public MediaMetadata(access3900 access3900Var, LoadControl<Bitmap> loadControl) {
        this.AudioAttributesCompatParcelizer = access3900Var;
        this.IconCompatParcelizer = loadControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onShuffleModeEnabledChanged
    public boolean write(setMimeType<BitmapDrawable> setmimetype, File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return this.IconCompatParcelizer.write((Bitmap) new MediaMetadataBuilder(setmimetype.RemoteActionCompatParcelizer().getBitmap(), this.AudioAttributesCompatParcelizer), file, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    @Override // kotlin.LoadControl
    public final onTimelineChanged RemoteActionCompatParcelizer(r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }
}
