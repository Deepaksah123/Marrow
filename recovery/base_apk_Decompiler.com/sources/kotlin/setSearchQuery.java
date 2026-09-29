package kotlin;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class setSearchQuery<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, Data> {
    private static final Set<String> IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final IconCompatParcelizer<Data> RemoteActionCompatParcelizer;

    public interface IconCompatParcelizer<Data> {
        fromUri<Data> AudioAttributesCompatParcelizer(Uri uri);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer write(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return RemoteActionCompatParcelizer(uri);
    }

    public setSearchQuery(IconCompatParcelizer<Data> iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> RemoteActionCompatParcelizer(Uri uri) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(uri), this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(uri));
    }

    private static boolean IconCompatParcelizer(Uri uri) {
        return IconCompatParcelizer.contains(uri.getScheme());
    }

    public static class RemoteActionCompatParcelizer implements setTargetOffsetMs<Uri, InputStream>, IconCompatParcelizer<InputStream> {
        private final ContentResolver write;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public RemoteActionCompatParcelizer(ContentResolver contentResolver) {
            this.write = contentResolver;
        }

        @Override // o.setSearchQuery.IconCompatParcelizer
        public final fromUri<InputStream> AudioAttributesCompatParcelizer(Uri uri) {
            return new setAdsId(this.write, uri);
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setSearchQuery(this);
        }
    }

    public static class AudioAttributesCompatParcelizer implements setTargetOffsetMs<Uri, ParcelFileDescriptor>, IconCompatParcelizer<ParcelFileDescriptor> {
        private final ContentResolver RemoteActionCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public AudioAttributesCompatParcelizer(ContentResolver contentResolver) {
            this.RemoteActionCompatParcelizer = contentResolver;
        }

        @Override // o.setSearchQuery.IconCompatParcelizer
        public final fromUri<ParcelFileDescriptor> AudioAttributesCompatParcelizer(Uri uri) {
            return new MediaItemAdsConfigurationBuilder(this.RemoteActionCompatParcelizer, uri);
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, ParcelFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setSearchQuery(this);
        }
    }

    public static final class write implements setTargetOffsetMs<Uri, AssetFileDescriptor>, IconCompatParcelizer<AssetFileDescriptor> {
        private final ContentResolver AudioAttributesCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public write(ContentResolver contentResolver) {
            this.AudioAttributesCompatParcelizer = contentResolver;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Uri, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setSearchQuery(this);
        }

        @Override // o.setSearchQuery.IconCompatParcelizer
        public final fromUri<AssetFileDescriptor> AudioAttributesCompatParcelizer(Uri uri) {
            return new HeartRatingExternalSyntheticLambda0(this.AudioAttributesCompatParcelizer, uri);
        }
    }
}
