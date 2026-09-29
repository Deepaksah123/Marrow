package kotlin;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemRequestMetadataBuilder<DataT> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, DataT> {
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, DataT> IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;

    public static setTargetOffsetMs<Uri, InputStream> RemoteActionCompatParcelizer(Context context) {
        return new read(context);
    }

    public static setTargetOffsetMs<Uri, AssetFileDescriptor> read(Context context) {
        return new IconCompatParcelizer(context);
    }

    MediaItemRequestMetadataBuilder(Context context, MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, DataT> mediaItemLocalConfigurationExternalSyntheticLambda0) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        this.IconCompatParcelizer = mediaItemLocalConfigurationExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return write2(uri, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
        if (pathSegments.size() == 2) {
            return AudioAttributesCompatParcelizer(uri, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Objects.toString(uri);
        return null;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> AudioAttributesCompatParcelizer(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(0);
        int identifier = this.RemoteActionCompatParcelizer.getResources().getIdentifier(pathSegments.get(1), str, this.RemoteActionCompatParcelizer.getPackageName());
        if (identifier == 0) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Objects.toString(uri);
            return null;
        }
        return this.IconCompatParcelizer.write(Integer.valueOf(identifier), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> write2(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 == 0) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri);
                }
                return null;
            }
            return this.IconCompatParcelizer.write(Integer.valueOf(i3), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public boolean read(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.RemoteActionCompatParcelizer.getPackageName().equals(uri.getAuthority());
    }

    static final class read implements setTargetOffsetMs<Uri, InputStream> {
        private final Context RemoteActionCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        read(Context context) {
            this.RemoteActionCompatParcelizer = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemRequestMetadataBuilder(this.RemoteActionCompatParcelizer, mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Integer.class, InputStream.class));
        }
    }

    static final class IconCompatParcelizer implements setTargetOffsetMs<Uri, AssetFileDescriptor> {
        private final Context read;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        IconCompatParcelizer(Context context) {
            this.read = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemRequestMetadataBuilder(this.read, mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Integer.class, AssetFileDescriptor.class));
        }
    }
}
