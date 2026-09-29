package kotlin;

import coil.size.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetSkipSilenceEnabled11 implements lambdaupdatePlaybackInfo15 {
    private final Size IconCompatParcelizer;

    public lambdasetSkipSilenceEnabled11(Size size) {
        toMagicModuleMetaRepoModel.write(size, "");
        this.IconCompatParcelizer = size;
    }

    @Override // kotlin.lambdaupdatePlaybackInfo15
    public final Object write(SampleVideos<? super Size> sampleVideos) {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof lambdasetSkipSilenceEnabled11) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((lambdasetSkipSilenceEnabled11) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RealSizeResolver(size=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
