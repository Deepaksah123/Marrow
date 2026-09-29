package kotlin;

import android.view.View;
import coil.size.Size;
import kotlin.lambdaupdatePlaybackInfo18;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetVolume10<T extends View> implements lambdaupdatePlaybackInfo18<T> {
    private final T AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;

    public lambdasetVolume10(T t, boolean z) {
        toMagicModuleMetaRepoModel.write(t, "");
        this.AudioAttributesCompatParcelizer = t;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.lambdaupdatePlaybackInfo15
    public final Object write(SampleVideos<? super Size> sampleVideos) {
        return lambdaupdatePlaybackInfo18.IconCompatParcelizer.AudioAttributesCompatParcelizer(this, sampleVideos);
    }

    @Override // kotlin.lambdaupdatePlaybackInfo18
    public final T write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.lambdaupdatePlaybackInfo18
    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasetVolume10)) {
            return false;
        }
        lambdasetVolume10 lambdasetvolume10 = (lambdasetVolume10) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), lambdasetvolume10.write()) && IconCompatParcelizer() == lambdasetvolume10.IconCompatParcelizer();
    }

    public final int hashCode() {
        return (write().hashCode() * 31) + Boolean.hashCode(IconCompatParcelizer());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RealViewSizeResolver(view=");
        sb.append(write());
        sb.append(", subtractPadding=");
        sb.append(IconCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }
}
