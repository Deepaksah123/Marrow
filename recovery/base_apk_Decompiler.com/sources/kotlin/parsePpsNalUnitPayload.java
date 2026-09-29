package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parsePpsNalUnitPayload implements getNalUnitType {
    private final ResolvingDataSource IconCompatParcelizer;

    @setSdkPayload
    public parsePpsNalUnitPayload(ResolvingDataSource resolvingDataSource) {
        toMagicModuleMetaRepoModel.write(resolvingDataSource, "");
        this.IconCompatParcelizer = resolvingDataSource;
    }

    @Override // kotlin.getNalUnitType
    public final Object IconCompatParcelizer(String str, String str2, String str3, boolean z, SampleVideos<? super byte[]> sampleVideos) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, str2, str3, z, sampleVideos);
    }
}
