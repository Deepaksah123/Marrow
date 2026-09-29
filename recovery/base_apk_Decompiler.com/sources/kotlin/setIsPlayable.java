package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setIsPlayable implements IllegalSeekPositionException<Uri, Bitmap> {
    private final setTotalDiscCount IconCompatParcelizer;
    private final access3900 RemoteActionCompatParcelizer;

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Uri uri, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return read(uri);
    }

    public setIsPlayable(setTotalDiscCount settotaldisccount, access3900 access3900Var) {
        this.IconCompatParcelizer = settotaldisccount;
        this.RemoteActionCompatParcelizer = access3900Var;
    }

    private static boolean read(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        setMimeType<Drawable> setmimetypeAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(uri, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        if (setmimetypeAudioAttributesCompatParcelizer == null) {
            return null;
        }
        return setArtist.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, setmimetypeAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), i, i2);
    }
}
