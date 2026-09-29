package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setRenderersFactory;", "Lo/setPlaybackLooper;", "<init>", "()V", "Landroid/graphics/Bitmap;", "p0", "", "write", "(Landroid/graphics/Bitmap;)Z", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Bitmap;)V", "p1", "read", "(Landroid/graphics/Bitmap;Z)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setRenderersFactory implements setPlaybackLooper {
    public static final setRenderersFactory INSTANCE = new setRenderersFactory();

    private setRenderersFactory() {
    }

    @Override // kotlin.setPlaybackLooper
    public final boolean write(Bitmap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return false;
    }

    @Override // kotlin.setPlaybackLooper
    public final void AudioAttributesCompatParcelizer(Bitmap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    @Override // kotlin.setPlaybackLooper
    public final void read(Bitmap p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }
}
