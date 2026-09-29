package kotlin;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class HeartRatingExternalSyntheticLambda0 extends MediaItemAdsConfiguration<AssetFileDescriptor> {
    @Override // kotlin.MediaItemAdsConfiguration
    protected final /* synthetic */ AssetFileDescriptor read(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return RemoteActionCompatParcelizer(uri, contentResolver);
    }

    @Override // kotlin.MediaItemAdsConfiguration
    protected final /* bridge */ /* synthetic */ void write(AssetFileDescriptor assetFileDescriptor) throws IOException {
        write2(assetFileDescriptor);
    }

    public HeartRatingExternalSyntheticLambda0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static AssetFileDescriptor RemoteActionCompatParcelizer(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static void write2(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // kotlin.fromUri
    public final Class<AssetFileDescriptor> write() {
        return AssetFileDescriptor.class;
    }
}
