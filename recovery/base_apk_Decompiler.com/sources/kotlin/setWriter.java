package kotlin;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setWriter implements LoadControl<setYear> {
    @Override // kotlin.onShuffleModeEnabledChanged
    public final /* synthetic */ boolean write(Object obj, File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return read((setMimeType) obj, file);
    }

    @Override // kotlin.LoadControl
    public final onTimelineChanged RemoteActionCompatParcelizer(r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return onTimelineChanged.SOURCE;
    }

    private static boolean read(setMimeType<setYear> setmimetype, File file) throws Throwable {
        try {
            maybeReleaseChildSource.RemoteActionCompatParcelizer(setmimetype.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
