package kotlin;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class access4700<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> {
    private static final Set<String> IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, Data> AudioAttributesCompatParcelizer;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return write(uri);
    }

    public access4700(MediaItemLocalConfigurationExternalSyntheticLambda0<setMaxPlaybackSpeed, Data> mediaItemLocalConfigurationExternalSyntheticLambda0) {
        this.AudioAttributesCompatParcelizer = mediaItemLocalConfigurationExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return this.AudioAttributesCompatParcelizer.write(new setMaxPlaybackSpeed(uri.toString()), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    private static boolean write(Uri uri) {
        return IconCompatParcelizer.contains(uri.getScheme());
    }

    public static class write implements setTargetOffsetMs<Uri, InputStream> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new access4700(mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(setMaxPlaybackSpeed.class, InputStream.class));
        }
    }
}
