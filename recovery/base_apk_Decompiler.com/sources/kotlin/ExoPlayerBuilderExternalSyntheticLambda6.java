package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.size.Size;
import kotlin.ExoPlayerBuilderExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda6 implements ExoPlayerBuilderExternalSyntheticLambda9<Bitmap> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean write(Bitmap bitmap) {
        return ExoPlayerBuilderExternalSyntheticLambda9.AudioAttributesCompatParcelizer.write(this, bitmap);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Bitmap bitmap, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return AudioAttributesCompatParcelizer(bitmap, exoPlayerBuilderExternalSyntheticLambda4);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ String RemoteActionCompatParcelizer(Bitmap bitmap) {
        return write2(bitmap);
    }

    private static Object AudioAttributesCompatParcelizer(Bitmap bitmap, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
        Resources resources = exoPlayerBuilderExternalSyntheticLambda4.getIconCompatParcelizer().getResources();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
        return new ExoPlayerBuilderExternalSyntheticLambda7(new BitmapDrawable(resources, bitmap), false, ExoPlayerBuilderExternalSyntheticLambda15.MEMORY);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String write2(Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(bitmap, "");
        return null;
    }
}
