package kotlin;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setDiscNumber implements IllegalSeekPositionException<ParcelFileDescriptor, Bitmap> {
    private final setAlbumTitle read;

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return write(parcelFileDescriptor);
    }

    public setDiscNumber(setAlbumTitle setalbumtitle) {
        this.read = setalbumtitle;
    }

    private boolean write(ParcelFileDescriptor parcelFileDescriptor) {
        return RemoteActionCompatParcelizer(parcelFileDescriptor) && setAlbumTitle.AudioAttributesCompatParcelizer();
    }

    private static boolean RemoteActionCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor) {
        return !("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    public setMimeType<Bitmap> AudioAttributesCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return this.read.IconCompatParcelizer(parcelFileDescriptor, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }
}
