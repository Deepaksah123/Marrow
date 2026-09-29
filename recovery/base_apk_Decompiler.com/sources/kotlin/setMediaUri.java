package kotlin;

import com.google.android.exoplayer2.DefaultLoadControl;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class setMediaUri implements MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> {
    private static isRated<Integer> write = isRated.AudioAttributesCompatParcelizer("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));
    private final r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<setMaxPlaybackSpeed, setMaxPlaybackSpeed> AudioAttributesCompatParcelizer;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(setMaxPlaybackSpeed setmaxplaybackspeed) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* bridge */ /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(setMaxPlaybackSpeed setmaxplaybackspeed, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return write(setmaxplaybackspeed, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    public setMediaUri() {
        this(null);
    }

    public setMediaUri(r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<setMaxPlaybackSpeed, setMaxPlaybackSpeed> r8lambdaao7pcxmyqrierrsm5toutyiaylw) {
        this.AudioAttributesCompatParcelizer = r8lambdaao7pcxmyqrierrsm5toutyiaylw;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(setMaxPlaybackSpeed setmaxplaybackspeed, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<setMaxPlaybackSpeed, setMaxPlaybackSpeed> r8lambdaao7pcxmyqrierrsm5toutyiaylw = this.AudioAttributesCompatParcelizer;
        if (r8lambdaao7pcxmyqrierrsm5toutyiaylw != null) {
            setMaxPlaybackSpeed setmaxplaybackspeedRemoteActionCompatParcelizer = r8lambdaao7pcxmyqrierrsm5toutyiaylw.RemoteActionCompatParcelizer(setmaxplaybackspeed);
            if (setmaxplaybackspeedRemoteActionCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setmaxplaybackspeed, setmaxplaybackspeed);
            } else {
                setmaxplaybackspeed = setmaxplaybackspeedRemoteActionCompatParcelizer;
            }
        }
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(setmaxplaybackspeed, new MediaItemAdsConfigurationExternalSyntheticLambda0(setmaxplaybackspeed, ((Integer) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(write)).intValue()));
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<setMaxPlaybackSpeed, InputStream> {
        private final r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<setMaxPlaybackSpeed, setMaxPlaybackSpeed> read = new r8lambdaao7PcXmyqriERRSM5ToUtyIayLw<>(500);

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setMediaUri(this.read);
        }
    }
}
