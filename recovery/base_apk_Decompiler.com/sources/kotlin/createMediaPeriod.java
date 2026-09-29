package kotlin;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class createMediaPeriod implements IllegalSeekPositionException<onAvailableCommandsChanged, Bitmap> {
    private final access3900 read;

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ setMimeType<Bitmap> AudioAttributesCompatParcelizer(onAvailableCommandsChanged onavailablecommandschanged, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return write(onavailablecommandschanged);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(onAvailableCommandsChanged onavailablecommandschanged, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    public createMediaPeriod(access3900 access3900Var) {
        this.read = access3900Var;
    }

    private setMimeType<Bitmap> write(onAvailableCommandsChanged onavailablecommandschanged) {
        return MediaMetadataBuilder.IconCompatParcelizer(onavailablecommandschanged.AudioAttributesImplApi26Parcelizer(), this.read);
    }
}
