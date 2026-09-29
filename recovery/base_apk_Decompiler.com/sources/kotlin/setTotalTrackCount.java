package kotlin;

import android.graphics.drawable.Drawable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setTotalTrackCount implements IllegalSeekPositionException<Drawable, Drawable> {
    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ setMimeType<Drawable> AudioAttributesCompatParcelizer(Drawable drawable, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return RemoteActionCompatParcelizer(drawable);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Drawable drawable, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    private static setMimeType<Drawable> RemoteActionCompatParcelizer(Drawable drawable) {
        return setTrackNumber.read(drawable);
    }
}
