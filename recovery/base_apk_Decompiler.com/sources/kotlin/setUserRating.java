package kotlin;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setUserRating implements IllegalSeekPositionException<File, File> {
    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ setMimeType<File> AudioAttributesCompatParcelizer(File file, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return RemoteActionCompatParcelizer(file);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return true;
    }

    private static setMimeType<File> RemoteActionCompatParcelizer(File file) {
        return new setStation(file);
    }
}
