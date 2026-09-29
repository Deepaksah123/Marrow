package kotlin;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class access4800<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<String, Data> {
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> write;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(String str) {
        return true;
    }

    public access4800(MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> mediaItemLocalConfigurationExternalSyntheticLambda0) {
        this.write = mediaItemLocalConfigurationExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> write(String str, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Uri uriAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str);
        if (uriAudioAttributesCompatParcelizer == null || !this.write.read(uriAudioAttributesCompatParcelizer)) {
            return null;
        }
        return this.write.write(uriAudioAttributesCompatParcelizer, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    private static Uri AudioAttributesCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return RemoteActionCompatParcelizer(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? RemoteActionCompatParcelizer(str) : uri;
    }

    private static Uri RemoteActionCompatParcelizer(String str) {
        return Uri.fromFile(new File(str));
    }

    public static class AudioAttributesCompatParcelizer implements setTargetOffsetMs<String, InputStream> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<String, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new access4800(mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, InputStream.class));
        }
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<String, ParcelFileDescriptor> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<String, ParcelFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new access4800(mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static final class write implements setTargetOffsetMs<String, AssetFileDescriptor> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<String, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new access4800(mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, AssetFileDescriptor.class));
        }
    }
}
