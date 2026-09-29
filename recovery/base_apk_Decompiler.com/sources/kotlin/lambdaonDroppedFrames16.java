package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerView;
import kotlin.C0209subTypeValidator;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import kotlin._newSimpleType;
import kotlin.createIfNeeded;
import kotlin.reportInvalidBaseType;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDroppedFrames16 implements lambdaonDeviceVolumeChanged59 {
    private long AudioAttributesCompatParcelizer;
    private ExoPlayer IconCompatParcelizer;
    private FrameLayout.LayoutParams RemoteActionCompatParcelizer = new FrameLayout.LayoutParams(-1, -1);
    private ViewGroup.LayoutParams read;
    private PlayerView write;

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void AudioAttributesCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (this.IconCompatParcelizer != null) {
            return;
        }
        _newSimpleType _newsimpletypeWrite = new _newSimpleType.RemoteActionCompatParcelizer(context).write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_newsimpletypeWrite, "");
        findBoundType findboundtype = new findBoundType(context, new createIfNeeded.read());
        String strWrite = LaissezFaireSubTypeValidator.write(context, context.getPackageName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        reportInvalidBaseType.IconCompatParcelizer IconCompatParcelizer = new reportInvalidBaseType.IconCompatParcelizer().IconCompatParcelizer(strWrite).IconCompatParcelizer(_newsimpletypeWrite.RemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(IconCompatParcelizer, "");
        C0209subTypeValidator.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new C0209subTypeValidator.RemoteActionCompatParcelizer(context, IconCompatParcelizer);
        JsonSerializableSchema jsonSerializableSchema = JsonSerializableSchema.read(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonSerializableSchema, "");
        HlsMediaSource hlsMediaSourceWrite = new HlsMediaSource.Factory(remoteActionCompatParcelizer).write(jsonSerializableSchema);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaSourceWrite, "");
        ExoPlayer exoPlayerWrite = new ExoPlayer.read(context).read(findboundtype).write();
        exoPlayerWrite.setMediaSource(hlsMediaSourceWrite);
        exoPlayerWrite.onSkipToQueueItem();
        exoPlayerWrite.IconCompatParcelizer(1);
        exoPlayerWrite.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.IconCompatParcelizer = exoPlayerWrite;
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write(Context context, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        if (this.write != null) {
            return;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, z);
        int i = read(context, z);
        PlayerView playerView = new PlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRemoteActionCompatParcelizer, i);
        this.read = layoutParams;
        playerView.setLayoutParams(layoutParams);
        playerView.setShowBuffering(1);
        playerView.setUseArtwork(true);
        playerView.setControllerAutoShow(false);
        playerView.setDefaultArtwork(_parseDoublePrimitive.read(context.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_audio, null));
        this.write = playerView;
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void IconCompatParcelizer() {
        PlayerView playerView = this.write;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setVisibility(0);
            playerView.setPlayer(this.IconCompatParcelizer);
        }
        ExoPlayer exoPlayer = this.IconCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.AudioAttributesCompatParcelizer(true);
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write() {
        ExoPlayer exoPlayer = this.IconCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.ParcelableVolumeInfo();
            exoPlayer.release();
            this.IconCompatParcelizer = null;
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void read() {
        ExoPlayer exoPlayer = this.IconCompatParcelizer;
        if (exoPlayer != null) {
            toMagicModuleMetaRepoModel.write(exoPlayer);
            this.AudioAttributesCompatParcelizer = exoPlayer.onPlayFromUri();
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write(boolean z) {
        if (z) {
            PlayerView playerView = this.write;
            toMagicModuleMetaRepoModel.write(playerView);
            this.read = playerView.getLayoutParams();
            PlayerView playerView2 = this.write;
            toMagicModuleMetaRepoModel.write(playerView2);
            playerView2.setLayoutParams(this.RemoteActionCompatParcelizer);
            return;
        }
        PlayerView playerView3 = this.write;
        toMagicModuleMetaRepoModel.write(playerView3);
        playerView3.setLayoutParams(this.read);
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final View AudioAttributesCompatParcelizer() {
        PlayerView playerView = this.write;
        toMagicModuleMetaRepoModel.write(playerView);
        return playerView;
    }

    private static int RemoteActionCompatParcelizer(Context context, boolean z) {
        return (int) TypedValue.applyDimension(1, z ? 408.0f : 240.0f, context.getResources().getDisplayMetrics());
    }

    private static int read(Context context, boolean z) {
        return (int) TypedValue.applyDimension(1, z ? 299.0f : 134.0f, context.getResources().getDisplayMetrics());
    }
}
