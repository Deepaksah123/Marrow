package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.C0209subTypeValidator;
import kotlin._newSimpleType;
import kotlin.createIfNeeded;
import kotlin.reportInvalidBaseType;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonIsPlayingChanged38 implements lambdaonDrmKeysLoaded62 {
    private PlayerView AudioAttributesCompatParcelizer;
    private ExoPlayer read;

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void AudioAttributesCompatParcelizer(Context context, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        if (this.read != null) {
            return;
        }
        ExoPlayer exoPlayerWrite = new ExoPlayer.read(context).read(new findBoundType(context, new createIfNeeded.read())).write();
        exoPlayerWrite.read(BitmapDescriptorFactory.HUE_RED);
        exoPlayerWrite.read(new RemoteActionCompatParcelizer(getcreatedondatems, this, exoPlayerWrite, getcreatedondatems2));
        this.read = exoPlayerWrite;
    }

    public static final class RemoteActionCompatParcelizer extends lambdaonLoadCompleted24 {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ lambdaonIsPlayingChanged38 IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
        private /* synthetic */ ExoPlayer write;

        RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, lambdaonIsPlayingChanged38 lambdaonisplayingchanged38, ExoPlayer exoPlayer, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
            this.read = getcreatedondatems;
            this.IconCompatParcelizer = lambdaonisplayingchanged38;
            this.write = exoPlayer;
            this.AudioAttributesCompatParcelizer = getcreatedondatems2;
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            if (i == 2) {
                this.read.invoke();
                return;
            }
            if (i != 3) {
                if (i != 4 || this.IconCompatParcelizer.read == null) {
                    return;
                }
                this.write.AudioAttributesCompatParcelizer(0L);
                this.write.AudioAttributesCompatParcelizer(false);
                PlayerView playerView = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
                if (playerView != null) {
                    playerView.showController();
                    return;
                }
                return;
            }
            this.AudioAttributesCompatParcelizer.invoke();
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final View read() {
        PlayerView playerView = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(playerView);
        return playerView;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void RemoteActionCompatParcelizer(boolean z) {
        ExoPlayer exoPlayer = this.read;
        if (exoPlayer != null) {
            exoPlayer.AudioAttributesCompatParcelizer(z);
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void write() {
        ExoPlayer exoPlayer = this.read;
        if (exoPlayer != null) {
            exoPlayer.ParcelableVolumeInfo();
            exoPlayer.release();
        }
        this.read = null;
        this.AudioAttributesCompatParcelizer = null;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void IconCompatParcelizer(Context context, getCreatedOnDateMs<? extends Drawable> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        if (this.AudioAttributesCompatParcelizer != null) {
            return;
        }
        PlayerView playerView = new PlayerView(context);
        playerView.setBackgroundColor(0);
        playerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        playerView.setUseArtwork(true);
        playerView.setDefaultArtwork(getcreatedondatems.invoke());
        playerView.setUseController(true);
        playerView.setControllerAutoShow(false);
        playerView.setPlayer(this.read);
        this.AudioAttributesCompatParcelizer = playerView;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final float RemoteActionCompatParcelizer() {
        ExoPlayer exoPlayer = this.read;
        return exoPlayer != null ? exoPlayer.onSkipToNext() : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void IconCompatParcelizer() {
        ExoPlayer exoPlayer = this.read;
        if (exoPlayer != null) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (fRemoteActionCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
                exoPlayer.read(BitmapDescriptorFactory.HUE_RED);
            } else if (fRemoteActionCompatParcelizer == BitmapDescriptorFactory.HUE_RED) {
                exoPlayer.read(1.0f);
            }
        }
    }

    @Override // kotlin.lambdaonDrmKeysLoaded62
    public final void write(Context context, String str, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        PlayerView playerView = this.AudioAttributesCompatParcelizer;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.read;
        if (exoPlayer != null) {
            _newSimpleType _newsimpletypeWrite = new _newSimpleType.RemoteActionCompatParcelizer(context).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_newsimpletypeWrite, "");
            String strWrite = LaissezFaireSubTypeValidator.write(context, context.getPackageName());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
            JsonSerializableSchema jsonSerializableSchema = JsonSerializableSchema.read(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonSerializableSchema, "");
            reportInvalidBaseType.IconCompatParcelizer IconCompatParcelizer = new reportInvalidBaseType.IconCompatParcelizer().IconCompatParcelizer(strWrite).IconCompatParcelizer(_newsimpletypeWrite);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(IconCompatParcelizer, "");
            HlsMediaSource hlsMediaSourceWrite = new HlsMediaSource.Factory(new C0209subTypeValidator.RemoteActionCompatParcelizer(context, IconCompatParcelizer)).write(jsonSerializableSchema);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaSourceWrite, "");
            exoPlayer.setMediaSource(hlsMediaSourceWrite);
            exoPlayer.onSkipToQueueItem();
            if (!z) {
                if (z2) {
                    exoPlayer.AudioAttributesCompatParcelizer(true);
                    exoPlayer.read(RemoteActionCompatParcelizer());
                    return;
                }
                return;
            }
            PlayerView playerView2 = this.AudioAttributesCompatParcelizer;
            if (playerView2 != null) {
                playerView2.showController();
            }
            exoPlayer.AudioAttributesCompatParcelizer(false);
            exoPlayer.read(1.0f);
        }
    }
}
