package kotlin;

import coil.memory.MemoryCache;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
public final class access2300 {
    private final addMediaSourcesInternal IconCompatParcelizer;
    private final evaluateMediaItemTransitionReason read;
    private final setPlaybackLooper write;

    public access2300(setPlaybackLooper setplaybacklooper, addMediaSourcesInternal addmediasourcesinternal, evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason) {
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        toMagicModuleMetaRepoModel.write(addmediasourcesinternal, "");
        toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
        this.write = setplaybacklooper;
        this.IconCompatParcelizer = addmediasourcesinternal;
        this.read = evaluatemediaitemtransitionreason;
    }

    public final access2400.RemoteActionCompatParcelizer IconCompatParcelizer(MemoryCache.Key key) {
        if (key == null) {
            return null;
        }
        access2400.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(key);
        if (remoteActionCompatParcelizerIconCompatParcelizer == null) {
            remoteActionCompatParcelizerIconCompatParcelizer = this.read.read(key);
        }
        if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
            this.write.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer.write());
        }
        return remoteActionCompatParcelizerIconCompatParcelizer;
    }
}
