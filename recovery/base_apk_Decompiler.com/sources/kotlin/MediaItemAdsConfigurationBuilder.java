package kotlin;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemAdsConfigurationBuilder extends MediaItemAdsConfiguration<ParcelFileDescriptor> {
    @Override // kotlin.MediaItemAdsConfiguration
    protected final /* synthetic */ ParcelFileDescriptor read(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return write(uri, contentResolver);
    }

    @Override // kotlin.MediaItemAdsConfiguration
    protected final /* bridge */ /* synthetic */ void write(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        write2(parcelFileDescriptor);
    }

    public MediaItemAdsConfigurationBuilder(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static ParcelFileDescriptor write(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
        }
        return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static void write2(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // kotlin.fromUri
    public final Class<ParcelFileDescriptor> write() {
        return ParcelFileDescriptor.class;
    }
}
