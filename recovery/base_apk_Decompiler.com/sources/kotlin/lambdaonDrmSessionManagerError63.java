package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmSessionManagerError63 implements lambdaonDrmKeysLoaded62 {
    private ExoPlayer AudioAttributesCompatParcelizer;
    private StyledPlayerView read;

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void AudioAttributesCompatParcelizer(Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        if (this.AudioAttributesCompatParcelizer != null) {
            return;
        }
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory())).build();
        exoPlayerBuild.setVolume(BitmapDescriptorFactory.HUE_RED);
        exoPlayerBuild.addListener(new IconCompatParcelizer(getcreatedondatems, this, exoPlayerBuild, getcreatedondatems2));
        this.AudioAttributesCompatParcelizer = exoPlayerBuild;
    }

    public static final class IconCompatParcelizer extends lambdaonDrmSessionAcquired61 {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ lambdaonDrmSessionManagerError63 read;
        private /* synthetic */ ExoPlayer write;

        IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, lambdaonDrmSessionManagerError63 lambdaondrmsessionmanagererror63, ExoPlayer exoPlayer, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
            this.RemoteActionCompatParcelizer = getcreatedondatems;
            this.read = lambdaondrmsessionmanagererror63;
            this.write = exoPlayer;
            this.IconCompatParcelizer = getcreatedondatems2;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                this.RemoteActionCompatParcelizer.invoke();
                return;
            }
            if (i != 3) {
                if (i != 4 || this.read.AudioAttributesCompatParcelizer == null) {
                    return;
                }
                this.write.seekTo(0L);
                this.write.setPlayWhenReady(false);
                StyledPlayerView styledPlayerView = this.read.read;
                if (styledPlayerView != null) {
                    styledPlayerView.showController();
                    return;
                }
                return;
            }
            this.IconCompatParcelizer.invoke();
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final View read() {
        StyledPlayerView styledPlayerView = this.read;
        toMagicModuleMetaRepoModel.write(styledPlayerView);
        return styledPlayerView;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void RemoteActionCompatParcelizer(boolean z) {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(z);
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void write() {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.AudioAttributesCompatParcelizer = null;
        this.read = null;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void IconCompatParcelizer(Context context, getCreatedOnDateMs<? extends Drawable> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        if (this.read != null) {
            return;
        }
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setBackgroundColor(0);
        styledPlayerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setDefaultArtwork(getcreatedondatems.invoke());
        styledPlayerView.setUseController(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setPlayer(this.AudioAttributesCompatParcelizer);
        this.read = styledPlayerView;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final float RemoteActionCompatParcelizer() {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        return exoPlayer != null ? exoPlayer.getVolume() : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void IconCompatParcelizer() {
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (fRemoteActionCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
                exoPlayer.setVolume(BitmapDescriptorFactory.HUE_RED);
            } else if (fRemoteActionCompatParcelizer == BitmapDescriptorFactory.HUE_RED) {
                exoPlayer.setVolume(1.0f);
            }
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void write(Context context, String str, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        StyledPlayerView styledPlayerView = this.read;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.AudioAttributesCompatParcelizer;
        if (exoPlayer != null) {
            DefaultBandwidthMeter defaultBandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultBandwidthMeterBuild, "");
            String userAgent = Util.getUserAgent(context, context.getPackageName());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userAgent, "");
            MediaItem mediaItemFromUri = MediaItem.fromUri(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaItemFromUri, "");
            DefaultHttpDataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(defaultBandwidthMeterBuild);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(transferListener, "");
            HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(new DefaultDataSource.Factory(context, transferListener)).createMediaSource(mediaItemFromUri);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaSourceCreateMediaSource, "");
            exoPlayer.setMediaSource(hlsMediaSourceCreateMediaSource);
            exoPlayer.prepare();
            if (!z) {
                if (z2) {
                    exoPlayer.setPlayWhenReady(true);
                    exoPlayer.setVolume(RemoteActionCompatParcelizer());
                    return;
                }
                return;
            }
            StyledPlayerView styledPlayerView2 = this.read;
            if (styledPlayerView2 != null) {
                styledPlayerView2.showController();
            }
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.setVolume(1.0f);
        }
    }
}
