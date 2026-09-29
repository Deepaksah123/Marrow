package kotlin;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerVideoComponent implements setDeviceVolume<Uri, File> {
    @Override // kotlin.setDeviceVolume
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    @Override // kotlin.setDeviceVolume
    public final /* bridge */ /* synthetic */ File write(Uri uri) {
        return write2(uri);
    }

    private static boolean IconCompatParcelizer(Uri uri) {
        String strWrite;
        toMagicModuleMetaRepoModel.write(uri, "");
        return (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "file") || (strWrite = sendRendererMessage.write(uri)) == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) "android_asset")) ? false : true;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static File write2(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        return _parseInt.read(uri);
    }
}
