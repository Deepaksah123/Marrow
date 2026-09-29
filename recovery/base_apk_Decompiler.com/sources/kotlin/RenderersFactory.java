package kotlin;

import android.content.Context;
import kotlin.SimpleExoPlayer;
import kotlin.getVolumeFromManager;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderersFactory implements buildStateForNewPosition {
    private final r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI IconCompatParcelizer;

    public RenderersFactory(r8lambdaZoLHJofyPUY4MqwZiRbTUU6tYtI r8lambdazolhjofypuy4mqwzirbtuu6tyti) {
        toMagicModuleMetaRepoModel.write(r8lambdazolhjofypuy4mqwzirbtuu6tyti, "");
        this.IconCompatParcelizer = r8lambdazolhjofypuy4mqwzirbtuu6tyti;
    }

    @Override // kotlin.buildStateForNewPosition
    public final SimpleExoPlayer read(SeekParameters seekParameters) {
        toMagicModuleMetaRepoModel.write(seekParameters, "");
        RendererWakeupListener.MediaMetadataCompat();
        String remoteActionCompatParcelizer = seekParameters.getRemoteActionCompatParcelizer();
        Context contextAudioAttributesImplBaseParcelizer = seekParameters.AudioAttributesImplBaseParcelizer();
        String str = remoteActionCompatParcelizer;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj24 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
            return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.RemoteActionCompatParcelizer);
        }
        String str2 = TestGroupLSModel.read(TestGroupLSModel.read(TestGroupLSModel.read(TestGroupLSModel.read(remoteActionCompatParcelizer, "///", "/", false), "//", "/", false), "http:/", "http://", false), "https:/", "https://", false);
        if (contextAudioAttributesImplBaseParcelizer != null) {
            getVolumeFromManager.Companion writeVar = getVolumeFromManager.INSTANCE;
            if (!getVolumeFromManager.Companion.write(contextAudioAttributesImplBaseParcelizer)) {
                RendererWakeupListener.MediaMetadataCompat();
                r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24 r8lambda3upcxnc6ymkwyb4djn0nvthj242 = r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.RemoteActionCompatParcelizer;
                return r8lambda3UPcXNC6yMkWYB4Djn0NvTHj24.read(SimpleExoPlayer.write.write);
            }
        }
        return this.IconCompatParcelizer.read(str2);
    }
}
