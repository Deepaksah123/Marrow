package kotlin;

import com.marrow.data.models.tag.Tag;

/* JADX INFO: loaded from: classes3.dex */
public final class selectEmbeddedTrack implements ChunkSampleStreamReleaseCallback {
    private final resolveCacheKey read;

    @setSdkPayload
    public selectEmbeddedTrack(resolveCacheKey resolvecachekey) {
        toMagicModuleMetaRepoModel.write(resolvecachekey, "");
        this.read = resolvecachekey;
    }

    @Override // kotlin.ChunkSampleStreamReleaseCallback
    public final void read(Tag[] tagArr) {
        toMagicModuleMetaRepoModel.write(tagArr, "");
        this.read.ah_();
        this.read.IconCompatParcelizer((Object[]) tagArr);
    }
}
