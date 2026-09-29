package kotlin;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setNonVideoOutputSurfaceHolderInternal;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/getPlaybackUrlsEncrypt;", "read", "(Landroid/content/Context;)Lo/getPlaybackUrlsEncrypt;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setNonVideoOutputSurfaceHolderInternal {
    public static final setNonVideoOutputSurfaceHolderInternal INSTANCE = new setNonVideoOutputSurfaceHolderInternal();

    private setNonVideoOutputSurfaceHolderInternal() {
    }

    @getMagicModuleMeta
    public static final getPlaybackUrlsEncrypt read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        stopInternal stopinternal = stopInternal.INSTANCE;
        File fileAudioAttributesCompatParcelizer = stopInternal.AudioAttributesCompatParcelizer(p0);
        stopInternal stopinternal2 = stopInternal.INSTANCE;
        return new getPlaybackUrlsEncrypt(fileAudioAttributesCompatParcelizer, stopInternal.RemoteActionCompatParcelizer(fileAudioAttributesCompatParcelizer));
    }
}
