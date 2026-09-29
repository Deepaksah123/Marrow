package kotlin;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import coil.size.Size;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda23 implements ExoPlayerBuilderExternalSyntheticLambda9<Uri> {
    private final Context AudioAttributesCompatParcelizer;

    public ExoPlayerBuilderExternalSyntheticLambda23(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = context;
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Uri uri, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return AudioAttributesCompatParcelizer(uri);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ String RemoteActionCompatParcelizer(Uri uri) {
        return write2(uri);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ boolean write(Uri uri) {
        return RemoteActionCompatParcelizer2(uri);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static boolean RemoteActionCompatParcelizer2(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "content");
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String write2(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        String string = uri.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private Object AudioAttributesCompatParcelizer(Uri uri) throws FileNotFoundException {
        FileInputStream fileInputStreamOpenInputStream;
        if (read(uri)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.AudioAttributesCompatParcelizer.getContentResolver().openAssetFileDescriptor(uri, "r");
            fileInputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor == null ? null : assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            if (fileInputStreamOpenInputStream == null) {
                StringBuilder sb = new StringBuilder("Unable to find a contact photo associated with '");
                sb.append(uri);
                sb.append("'.");
                throw new IllegalStateException(sb.toString().toString());
            }
        } else {
            fileInputStreamOpenInputStream = this.AudioAttributesCompatParcelizer.getContentResolver().openInputStream(uri);
            if (fileInputStreamOpenInputStream == null) {
                StringBuilder sb2 = new StringBuilder("Unable to open '");
                sb2.append(uri);
                sb2.append("'.");
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        return new getDeviceVolume(CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(fileInputStreamOpenInputStream)), this.AudioAttributesCompatParcelizer.getContentResolver().getType(uri), ExoPlayerBuilderExternalSyntheticLambda15.DISK);
    }

    private static boolean read(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getAuthority(), (Object) "com.android.contacts") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getLastPathSegment(), (Object) "display_photo");
    }
}
