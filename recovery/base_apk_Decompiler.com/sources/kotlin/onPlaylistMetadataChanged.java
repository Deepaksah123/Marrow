package kotlin;

import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class onPlaylistMetadataChanged implements MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> {
    private final toDownloadInfo.AudioAttributesCompatParcelizer write;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(setMaxPlaybackSpeed setmaxplaybackspeed) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(setMaxPlaybackSpeed setmaxplaybackspeed, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return read2(setmaxplaybackspeed);
    }

    public onPlaylistMetadataChanged(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write = audioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> read2(setMaxPlaybackSpeed setmaxplaybackspeed) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(setmaxplaybackspeed, new onRepeatModeChanged(this.write, setmaxplaybackspeed));
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<setMaxPlaybackSpeed, InputStream> {
        private static volatile toDownloadInfo.AudioAttributesCompatParcelizer IconCompatParcelizer;
        private final toDownloadInfo.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        private static toDownloadInfo.AudioAttributesCompatParcelizer IconCompatParcelizer() {
            if (IconCompatParcelizer == null) {
                synchronized (RemoteActionCompatParcelizer.class) {
                    if (IconCompatParcelizer == null) {
                        IconCompatParcelizer = new ThemeKtExternalSyntheticLambda3();
                    }
                }
            }
            return IconCompatParcelizer;
        }

        public RemoteActionCompatParcelizer() {
            this(IconCompatParcelizer());
        }

        public RemoteActionCompatParcelizer(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new onPlaylistMetadataChanged(this.AudioAttributesCompatParcelizer);
        }
    }
}
