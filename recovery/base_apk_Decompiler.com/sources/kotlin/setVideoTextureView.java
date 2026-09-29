package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0007\u0010\u0010"}, d2 = {"Lo/setVideoTextureView;", "Lo/addMediaSourcesInternal;", "<init>", "()V", "Lcoil/memory/MemoryCache$Key;", "p0", "Lo/access2400$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lcoil/memory/MemoryCache$Key;)Lo/access2400$RemoteActionCompatParcelizer;", "Landroid/graphics/Bitmap;", "p1", "", "p2", "", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Z)V", "", "(I)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class setVideoTextureView implements addMediaSourcesInternal {
    public static final setVideoTextureView INSTANCE = new setVideoTextureView();

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(int p0) {
    }

    private setVideoTextureView() {
    }

    @Override // kotlin.addMediaSourcesInternal
    public final access2400.RemoteActionCompatParcelizer IconCompatParcelizer(MemoryCache.Key p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return null;
    }

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(MemoryCache.Key p0, Bitmap p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }
}
