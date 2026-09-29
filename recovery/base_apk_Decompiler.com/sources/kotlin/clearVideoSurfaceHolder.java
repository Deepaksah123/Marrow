package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class clearVideoSurfaceHolder implements setDeviceVolume<Integer, Uri> {
    private final Context IconCompatParcelizer;

    public clearVideoSurfaceHolder(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
    }

    @Override // kotlin.setDeviceVolume
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Integer num) {
        return write(num.intValue());
    }

    @Override // kotlin.setDeviceVolume
    public final /* synthetic */ Uri write(Integer num) {
        return IconCompatParcelizer(num.intValue());
    }

    private boolean write(int i) {
        try {
            return this.IconCompatParcelizer.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    private Uri IconCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append((Object) this.IconCompatParcelizer.getPackageName());
        sb.append('/');
        sb.append(i);
        Uri uri = Uri.parse(sb.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        return uri;
    }
}
