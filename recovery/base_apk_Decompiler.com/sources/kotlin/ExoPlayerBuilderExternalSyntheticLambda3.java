package kotlin;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.size.Size;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda3;", "Lo/ExoPlayerBuilderExternalSyntheticLambda9;", "Landroid/net/Uri;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lo/setDeviceVolumeControlEnabled;", "p1", "Lcoil/size/Size;", "p2", "Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "p3", "Lo/ExoPlayerDeviceComponent;", "write", "(Landroid/net/Uri;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(Landroid/net/Uri;)Z", "", "IconCompatParcelizer", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/Context;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda3 implements ExoPlayerBuilderExternalSyntheticLambda9<Uri> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Context AudioAttributesCompatParcelizer;

    public ExoPlayerBuilderExternalSyntheticLambda3(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = context;
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Uri uri, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return write2(uri);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ String RemoteActionCompatParcelizer(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ boolean write(Uri uri) {
        return RemoteActionCompatParcelizer2(uri);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static boolean RemoteActionCompatParcelizer2(Uri p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getScheme(), (Object) "file") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) sendRendererMessage.write(p0), (Object) "android_asset");
    }

    private static String IconCompatParcelizer(Uri p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private Object write2(Uri uri) throws IOException {
        List<String> pathSegments = uri.getPathSegments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pathSegments, "");
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.IconCompatParcelizer((Iterable) pathSegments, 1), "/", null, null, 0, null, null, 62);
        InputStream inputStreamOpen = this.AudioAttributesCompatParcelizer.getAssets().open(strRemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputStreamOpen, "");
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(inputStreamOpen));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(singleton, "");
        return new getDeviceVolume(lessonCompletedDialogAudioAttributesCompatParcelizer, sendRendererMessage.write(singleton, strRemoteActionCompatParcelizer), ExoPlayerBuilderExternalSyntheticLambda15.DISK);
    }
}
