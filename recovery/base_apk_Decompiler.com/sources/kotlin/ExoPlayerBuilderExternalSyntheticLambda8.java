package kotlin;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.size.Size;
import kotlin.ExoPlayerBuilderExternalSyntheticLambda9;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda8 implements ExoPlayerBuilderExternalSyntheticLambda9<Drawable> {
    private final ExoPlayerBuilderExternalSyntheticLambda19 read;

    public ExoPlayerBuilderExternalSyntheticLambda8(ExoPlayerBuilderExternalSyntheticLambda19 exoPlayerBuilderExternalSyntheticLambda19) {
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda19, "");
        this.read = exoPlayerBuilderExternalSyntheticLambda19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean write(Drawable drawable) {
        return ExoPlayerBuilderExternalSyntheticLambda9.AudioAttributesCompatParcelizer.write(this, drawable);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* bridge */ /* synthetic */ Object RemoteActionCompatParcelizer(Drawable drawable, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return RemoteActionCompatParcelizer(drawable, size, exoPlayerBuilderExternalSyntheticLambda4);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* bridge */ /* synthetic */ String RemoteActionCompatParcelizer(Drawable drawable) {
        return RemoteActionCompatParcelizer2(drawable);
    }

    private Object RemoteActionCompatParcelizer(Drawable drawable, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
        boolean zAudioAttributesCompatParcelizer = sendRendererMessage.AudioAttributesCompatParcelizer(drawable);
        if (zAudioAttributesCompatParcelizer) {
            Bitmap bitmapWrite = this.read.write(drawable, exoPlayerBuilderExternalSyntheticLambda4.getWrite(), size, exoPlayerBuilderExternalSyntheticLambda4.getRatingCompat(), exoPlayerBuilderExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
            Resources resources = exoPlayerBuilderExternalSyntheticLambda4.getIconCompatParcelizer().getResources();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
            drawable = new BitmapDrawable(resources, bitmapWrite);
        }
        return new ExoPlayerBuilderExternalSyntheticLambda7(drawable, zAudioAttributesCompatParcelizer, ExoPlayerBuilderExternalSyntheticLambda15.MEMORY);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String RemoteActionCompatParcelizer2(Drawable drawable) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        return null;
    }
}
