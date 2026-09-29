package kotlin;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemSubtitle implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> {
    private final Context read;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    public MediaItemSubtitle(Context context) {
        this.read = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<InputStream> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        if (setClipEndPositionMs.IconCompatParcelizer(i, i2) && AudioAttributesCompatParcelizer(r8lambda_r106e6zya8q8i_ekunqwrolpk)) {
            return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), setClipRelativeToDefaultPosition.write(this.read, uri));
        }
        return null;
    }

    private static boolean AudioAttributesCompatParcelizer(r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Long l = (Long) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setMediaType.read);
        return l != null && l.longValue() == -1;
    }

    private static boolean IconCompatParcelizer(Uri uri) {
        return setClipEndPositionMs.RemoteActionCompatParcelizer(uri);
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<Uri, InputStream> {
        private final Context read;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(Context context) {
            this.read = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemSubtitle(this.read);
        }
    }
}
