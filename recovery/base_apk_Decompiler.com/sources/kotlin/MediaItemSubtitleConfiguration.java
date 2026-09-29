package kotlin;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemSubtitleConfiguration implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> {
    private final Context write;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return AudioAttributesCompatParcelizer(uri);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return AudioAttributesCompatParcelizer(uri, i, i2);
    }

    public MediaItemSubtitleConfiguration(Context context) {
        this.write = context.getApplicationContext();
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> AudioAttributesCompatParcelizer(Uri uri, int i, int i2) {
        if (setClipEndPositionMs.IconCompatParcelizer(i, i2)) {
            return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), setClipRelativeToDefaultPosition.RemoteActionCompatParcelizer(this.write, uri));
        }
        return null;
    }

    private static boolean AudioAttributesCompatParcelizer(Uri uri) {
        return setClipEndPositionMs.write(uri);
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<Uri, InputStream> {
        private final Context IconCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(Context context) {
            this.IconCompatParcelizer = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemSubtitleConfiguration(this.IconCompatParcelizer);
        }
    }
}
