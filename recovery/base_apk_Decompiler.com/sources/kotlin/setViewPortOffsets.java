package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setViewPortOffsets implements setCenterTextTypeface {
    private final setEntryLabelTextSize write;

    public setViewPortOffsets(setEntryLabelTextSize setentrylabeltextsize) {
        toMagicModuleMetaRepoModel.write(setentrylabeltextsize, "");
        this.write = setentrylabeltextsize;
    }

    public final setEntryLabelTextSize read() {
        return this.write;
    }

    @Override // kotlin.setCenterTextTypeface
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final setScaleMinima AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new setScaleMinima(this.write.write());
    }
}
