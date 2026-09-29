package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class Plan extends hasBody implements getValueAsJSON {
    private final setTags read;
    private final getPlanAddOns write;

    @Override // kotlin.getLink
    public final getPlanAddOns AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Plan(getPlans getplans, boolean z, getPlanAddOns getplanaddons) {
        super(getplans, z);
        toMagicModuleMetaRepoModel.write(getplans, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        this.write = getplanaddons;
        this.read = getplans.aU_().write().read();
    }

    @Override // kotlin.hasBody
    public final hasBody AudioAttributesCompatParcelizer(boolean z) {
        return new Plan(AudioAttributesImplApi26Parcelizer(), z, AudioAttributesImplApi21Parcelizer());
    }

    @Override // kotlin.hasBody, kotlin.getLink
    public final setTags read() {
        return this.read;
    }

    @Override // kotlin.getHref
    public final String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(AudioAttributesImplApi26Parcelizer());
        sb.append(ba_() ? "?" : "");
        return sb.toString();
    }
}
