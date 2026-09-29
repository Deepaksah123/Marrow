package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.util.Util;
import kotlin.RendererCapabilitiesAdaptiveSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmKeysRestored64 implements lambdaonDeviceVolumeChanged59 {
    private ExoPlayer AudioAttributesCompatParcelizer;
    private FrameLayout.LayoutParams IconCompatParcelizer = new FrameLayout.LayoutParams(-1, -1);
    private ViewGroup.LayoutParams RemoteActionCompatParcelizer;
    private long read;
    private StyledPlayerView write;

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void AudioAttributesCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (this.AudioAttributesCompatParcelizer != null) {
            return;
        }
        DefaultBandwidthMeter defaultBandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultBandwidthMeterBuild, "");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userAgent, "");
        DefaultHttpDataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(defaultBandwidthMeterBuild.getTransferListener());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(transferListener, "");
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context, transferListener);
        MediaItem mediaItemFromUri = MediaItem.fromUri(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaItemFromUri, "");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(factory).createMediaSource(mediaItemFromUri);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaSourceCreateMediaSource, "");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).build();
        exoPlayerBuild.setMediaSource(hlsMediaSourceCreateMediaSource);
        exoPlayerBuild.prepare();
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.seekTo(this.read);
        this.AudioAttributesCompatParcelizer = exoPlayerBuild;
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write(Context context, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        if (this.write != null) {
            return;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, z);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, z);
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRemoteActionCompatParcelizer, iAudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer = layoutParams;
        styledPlayerView.setLayoutParams(layoutParams);
        styledPlayerView.setShowBuffering(1);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setDefaultArtwork(_parseDoublePrimitive.read(context.getResources(), RendererCapabilitiesAdaptiveSupport.read.ct_audio, null));
        this.write = styledPlayerView;
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void IconCompatParcelizer() {
        StyledPlayerView styledPlayerView = this.write;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setVisibility(0);
            styledPlayerView.setPlayer(this.AudioAttributesCompatParcelizer);
        }
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write() {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void read() {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            toMagicModuleMetaRepoModel.write(exoPlayer);
            this.read = exoPlayer.getCurrentPosition();
        }
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final void write(boolean z) {
        if (z) {
            StyledPlayerView styledPlayerView = this.write;
            toMagicModuleMetaRepoModel.write(styledPlayerView);
            this.RemoteActionCompatParcelizer = styledPlayerView.getLayoutParams();
            StyledPlayerView styledPlayerView2 = this.write;
            toMagicModuleMetaRepoModel.write(styledPlayerView2);
            styledPlayerView2.setLayoutParams(this.IconCompatParcelizer);
            return;
        }
        StyledPlayerView styledPlayerView3 = this.write;
        toMagicModuleMetaRepoModel.write(styledPlayerView3);
        styledPlayerView3.setLayoutParams(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.lambdaonDeviceVolumeChanged59
    public final View AudioAttributesCompatParcelizer() {
        StyledPlayerView styledPlayerView = this.write;
        toMagicModuleMetaRepoModel.write(styledPlayerView);
        return styledPlayerView;
    }

    private static int RemoteActionCompatParcelizer(Context context, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        return (int) TypedValue.applyDimension(1, z ? 408.0f : 240.0f, context.getResources().getDisplayMetrics());
    }

    private static int AudioAttributesCompatParcelizer(Context context, boolean z) {
        toMagicModuleMetaRepoModel.write(context, "");
        return (int) TypedValue.applyDimension(1, z ? 299.0f : 134.0f, context.getResources().getDisplayMetrics());
    }
}
