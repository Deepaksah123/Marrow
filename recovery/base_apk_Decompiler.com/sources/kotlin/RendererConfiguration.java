package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import kotlin.SimpleExoPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class RendererConfiguration implements buildStateForNewPosition {
    private final buildStateForNewPosition read;

    public RendererConfiguration(buildStateForNewPosition buildstatefornewposition) {
        toMagicModuleMetaRepoModel.write(buildstatefornewposition, "");
        this.read = buildstatefornewposition;
    }

    @Override // kotlin.buildStateForNewPosition
    public final SimpleExoPlayer read(final SeekParameters seekParameters) {
        toMagicModuleMetaRepoModel.write(seekParameters, "");
        RendererWakeupListener.MediaMetadataCompat();
        boolean read = seekParameters.getRead();
        Context iconCompatParcelizer = seekParameters.getIconCompatParcelizer();
        CleverTapInstanceConfig audioAttributesCompatParcelizer = seekParameters.getAudioAttributesCompatParcelizer();
        long write = seekParameters.getWrite();
        if (audioAttributesCompatParcelizer == null || write == -1) {
            RendererWakeupListener.MediaMetadataCompat();
            RendererWakeupListener.MediaMetadataCompat();
            return this.read.read(seekParameters);
        }
        isTrackSupported istracksupportedIconCompatParcelizer = TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer).IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(istracksupportedIconCompatParcelizer, "");
        SimpleExoPlayer simpleExoPlayer = (SimpleExoPlayer) istracksupportedIconCompatParcelizer.IconCompatParcelizer("getNotificationBitmap", new Callable() { // from class: o.SimpleBasePlayer
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RendererConfiguration.read(this.write, seekParameters);
            }
        }, write);
        if (simpleExoPlayer == null) {
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            simpleExoPlayer = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.AudioAttributesCompatParcelizer);
        }
        SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer = RendererCapabilitiesListener.RemoteActionCompatParcelizer(read, iconCompatParcelizer, simpleExoPlayer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleExoPlayerRemoteActionCompatParcelizer, "");
        return simpleExoPlayerRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleExoPlayer read(RendererConfiguration rendererConfiguration, SeekParameters seekParameters) {
        toMagicModuleMetaRepoModel.write(rendererConfiguration, "");
        toMagicModuleMetaRepoModel.write(seekParameters, "");
        return rendererConfiguration.read.read(seekParameters);
    }
}
