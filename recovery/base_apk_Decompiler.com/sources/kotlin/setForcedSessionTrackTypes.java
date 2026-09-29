package kotlin;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class setForcedSessionTrackTypes<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> {
    private static final int write = 22;
    private final AssetManager AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer<Data> read;

    public interface IconCompatParcelizer<Data> {
        fromUri<Data> AudioAttributesCompatParcelizer(AssetManager assetManager, String str);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return RemoteActionCompatParcelizer(uri);
    }

    public setForcedSessionTrackTypes(AssetManager assetManager, IconCompatParcelizer<Data> iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = assetManager;
        this.read = iconCompatParcelizer;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> RemoteActionCompatParcelizer(Uri uri) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, uri.toString().substring(write)));
    }

    private static boolean IconCompatParcelizer(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static class write implements setTargetOffsetMs<Uri, InputStream>, IconCompatParcelizer<InputStream> {
        private final AssetManager IconCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public write(AssetManager assetManager) {
            this.IconCompatParcelizer = assetManager;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setForcedSessionTrackTypes(this.IconCompatParcelizer, this);
        }

        @Override // o.setForcedSessionTrackTypes.IconCompatParcelizer
        public final fromUri<InputStream> AudioAttributesCompatParcelizer(AssetManager assetManager, String str) {
            return new setAdsConfiguration(assetManager, str);
        }
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<Uri, AssetFileDescriptor>, IconCompatParcelizer<AssetFileDescriptor> {
        private final AssetManager read;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(AssetManager assetManager) {
            this.read = assetManager;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setForcedSessionTrackTypes(this.read, this);
        }

        @Override // o.setForcedSessionTrackTypes.IconCompatParcelizer
        public final fromUri<AssetFileDescriptor> AudioAttributesCompatParcelizer(AssetManager assetManager, String str) {
            return new setAdTagUri(assetManager, str);
        }
    }
}
