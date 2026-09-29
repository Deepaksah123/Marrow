package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;

/* JADX INFO: loaded from: classes2.dex */
public final class access2400 implements MemoryCache {
    private final evaluateMediaItemTransitionReason IconCompatParcelizer;
    private final addMediaSourcesInternal RemoteActionCompatParcelizer;
    private final setPlaybackLooper read;
    private final setDeviceVolumeControlEnabled write;

    public interface RemoteActionCompatParcelizer {
        boolean AudioAttributesCompatParcelizer();

        Bitmap write();
    }

    public access2400(addMediaSourcesInternal addmediasourcesinternal, evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason, setPlaybackLooper setplaybacklooper, setDeviceVolumeControlEnabled setdevicevolumecontrolenabled) {
        toMagicModuleMetaRepoModel.write(addmediasourcesinternal, "");
        toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
        toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
        toMagicModuleMetaRepoModel.write(setdevicevolumecontrolenabled, "");
        this.RemoteActionCompatParcelizer = addmediasourcesinternal;
        this.IconCompatParcelizer = evaluatemediaitemtransitionreason;
        this.read = setplaybacklooper;
        this.write = setdevicevolumecontrolenabled;
    }

    public final addMediaSourcesInternal write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final evaluateMediaItemTransitionReason IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setPlaybackLooper AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final setDeviceVolumeControlEnabled read() {
        return this.write;
    }
}
