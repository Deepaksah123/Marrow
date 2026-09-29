package kotlin;

import android.content.Context;
import kotlin.SimpleExoPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaItemTransitionReason implements buildStateForNewPosition {
    private final buildStateForNewPosition IconCompatParcelizer;

    public getMediaItemTransitionReason(buildStateForNewPosition buildstatefornewposition) {
        toMagicModuleMetaRepoModel.write(buildstatefornewposition, "");
        this.IconCompatParcelizer = buildstatefornewposition;
    }

    @Override // kotlin.buildStateForNewPosition
    public final SimpleExoPlayer read(SeekParameters seekParameters) {
        toMagicModuleMetaRepoModel.write(seekParameters, "");
        RendererWakeupListener.MediaMetadataCompat();
        String strIconCompatParcelizer = seekParameters.IconCompatParcelizer();
        boolean read = seekParameters.getRead();
        Context iconCompatParcelizer = seekParameters.getIconCompatParcelizer();
        String str = strIconCompatParcelizer;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer = RendererCapabilitiesListener.RemoteActionCompatParcelizer(read, iconCompatParcelizer, r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.RemoteActionCompatParcelizer));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleExoPlayerRemoteActionCompatParcelizer, "");
            return simpleExoPlayerRemoteActionCompatParcelizer;
        }
        SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer2 = RendererCapabilitiesListener.RemoteActionCompatParcelizer(read, iconCompatParcelizer, this.IconCompatParcelizer.read(seekParameters));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleExoPlayerRemoteActionCompatParcelizer2, "");
        return simpleExoPlayerRemoteActionCompatParcelizer2;
    }
}
