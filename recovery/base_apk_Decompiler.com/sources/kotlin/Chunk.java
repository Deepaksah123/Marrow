package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class Chunk implements BundledChunkExtractorBindingTrackOutput {
    private final isExplicit IconCompatParcelizer;

    @setSdkPayload
    public Chunk(isExplicit isexplicit) {
        toMagicModuleMetaRepoModel.write(isexplicit, "");
        this.IconCompatParcelizer = isexplicit;
    }

    @Override // kotlin.BundledChunkExtractorBindingTrackOutput
    public final int write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.BundledChunkExtractorBindingTrackOutput
    public final void IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer.read(str, i);
    }
}
