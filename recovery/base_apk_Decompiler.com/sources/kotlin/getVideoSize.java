package kotlin;

import android.net.Uri;
import kotlin.setDeviceVolume;

/* JADX INFO: loaded from: classes2.dex */
public final class getVideoSize implements setDeviceVolume<String, Uri> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDeviceVolume
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(String str) {
        return setDeviceVolume.IconCompatParcelizer.AudioAttributesCompatParcelizer(this, str);
    }

    @Override // kotlin.setDeviceVolume
    public final /* synthetic */ Uri write(String str) {
        return read(str);
    }

    private static Uri read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Uri uri = Uri.parse(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        return uri;
    }
}
