package kotlin;

import android.webkit.MimeTypeMap;
import coil.size.Size;
import java.io.File;
import kotlin.ExoPlayerBuilderExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes2.dex */
public final class decreaseDeviceVolume implements ExoPlayerBuilderExternalSyntheticLambda9<File> {
    private final boolean RemoteActionCompatParcelizer;

    public decreaseDeviceVolume(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean write(File file) {
        return ExoPlayerBuilderExternalSyntheticLambda9.AudioAttributesCompatParcelizer.write(this, file);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ Object RemoteActionCompatParcelizer(File file, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return IconCompatParcelizer(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public String RemoteActionCompatParcelizer(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        if (!this.RemoteActionCompatParcelizer) {
            String path = file.getPath();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(path, "");
            return path;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) file.getPath());
        sb.append(':');
        sb.append(file.lastModified());
        return sb.toString();
    }

    private static Object IconCompatParcelizer(File file) {
        return new getDeviceVolume(CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.RemoteActionCompatParcelizer(file)), MimeTypeMap.getSingleton().getMimeTypeFromExtension(downloadMagicModuleDetail.AudioAttributesImplApi21Parcelizer(file)), ExoPlayerBuilderExternalSyntheticLambda15.DISK);
    }
}
