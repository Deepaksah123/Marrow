package kotlin;

import java.io.InputStream;
import java.net.URL;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdanYnhip21U5ox6ugd5TXEves4Z6I implements MediaItemLocalConfigurationExternalSyntheticLambda0<URL, InputStream> {
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> IconCompatParcelizer;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(URL url) {
        return true;
    }

    public r8lambdanYnhip21U5ox6ugd5TXEves4Z6I(MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, InputStream> mediaItemLocalConfigurationExternalSyntheticLambda0) {
        this.IconCompatParcelizer = mediaItemLocalConfigurationExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(URL url, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return this.IconCompatParcelizer.write(new setMaxPlaybackSpeed(url), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    public static class AudioAttributesCompatParcelizer implements setTargetOffsetMs<URL, InputStream> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<URL, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new r8lambdanYnhip21U5ox6ugd5TXEves4Z6I(mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(setMaxPlaybackSpeed.class, InputStream.class));
        }
    }
}
