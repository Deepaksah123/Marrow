package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
final class setVideoSurfaceHolder implements addMediaSourcesInternal {
    private final evaluateMediaItemTransitionReason RemoteActionCompatParcelizer;

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(int i) {
    }

    public setVideoSurfaceHolder(evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason) {
        toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
        this.RemoteActionCompatParcelizer = evaluatemediaitemtransitionreason;
    }

    @Override // kotlin.addMediaSourcesInternal
    public final void IconCompatParcelizer(MemoryCache.Key key, Bitmap bitmap, boolean z) {
        toMagicModuleMetaRepoModel.write(key, "");
        toMagicModuleMetaRepoModel.write(bitmap, "");
        this.RemoteActionCompatParcelizer.write(key, bitmap, z, maybeNotifySurfaceSizeChanged.write(bitmap));
    }

    @Override // kotlin.addMediaSourcesInternal
    public final access2400.RemoteActionCompatParcelizer IconCompatParcelizer(MemoryCache.Key key) {
        toMagicModuleMetaRepoModel.write(key, "");
        return null;
    }
}
