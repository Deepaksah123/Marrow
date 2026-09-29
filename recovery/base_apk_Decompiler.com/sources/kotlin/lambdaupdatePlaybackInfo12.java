package kotlin;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.PixelSize;
import coil.size.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaupdatePlaybackInfo12 implements lambdaupdatePlaybackInfo15 {
    private final Context RemoteActionCompatParcelizer;

    public lambdaupdatePlaybackInfo12(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.lambdaupdatePlaybackInfo15
    public final Object write(SampleVideos<? super Size> sampleVideos) {
        DisplayMetrics displayMetrics = this.RemoteActionCompatParcelizer.getResources().getDisplayMetrics();
        return new PixelSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof lambdaupdatePlaybackInfo12) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((lambdaupdatePlaybackInfo12) obj).RemoteActionCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplaySizeResolver(context=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
