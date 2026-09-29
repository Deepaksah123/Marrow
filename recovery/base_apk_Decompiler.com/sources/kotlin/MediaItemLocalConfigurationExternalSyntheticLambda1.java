package kotlin;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.Objects;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemLocalConfigurationExternalSyntheticLambda1<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, Data> {
    private final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> RemoteActionCompatParcelizer;
    private final Resources write;

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Integer num) {
        return true;
    }

    public MediaItemLocalConfigurationExternalSyntheticLambda1(Resources resources, MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> mediaItemLocalConfigurationExternalSyntheticLambda0) {
        this.write = resources;
        this.RemoteActionCompatParcelizer = mediaItemLocalConfigurationExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> write(Integer num, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Uri uri = read2(num);
        if (uri == null) {
            return null;
        }
        return this.RemoteActionCompatParcelizer.write(uri, i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private Uri read2(Integer num) {
        try {
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.write.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.write.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.write.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            return null;
        }
    }

    public static class IconCompatParcelizer implements setTargetOffsetMs<Integer, InputStream> {
        private final Resources AudioAttributesCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public IconCompatParcelizer(Resources resources) {
            this.AudioAttributesCompatParcelizer = resources;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemLocalConfigurationExternalSyntheticLambda1(this.AudioAttributesCompatParcelizer, mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, InputStream.class));
        }
    }

    public static final class RemoteActionCompatParcelizer implements setTargetOffsetMs<Integer, AssetFileDescriptor> {
        private final Resources read;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(Resources resources) {
            this.read = resources;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemLocalConfigurationExternalSyntheticLambda1(this.read, mediaItemRequestMetadataExternalSyntheticLambda0.IconCompatParcelizer(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class read implements setTargetOffsetMs<Integer, Uri> {
        public static int RemoteActionCompatParcelizer;
        public static int write;
        private final Resources AudioAttributesCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public read(Resources resources) {
            this.AudioAttributesCompatParcelizer = resources;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, Uri> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemLocalConfigurationExternalSyntheticLambda1(this.AudioAttributesCompatParcelizer, setExtras.write());
        }

        public static int IconCompatParcelizer() {
            int i = write;
            int i2 = i % 8858369;
            write = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            RemoteActionCompatParcelizer = i3;
            return i3;
        }
    }
}
