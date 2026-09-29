package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setThumbnailUrl extends newHeaderInstance {
    private final getHref AudioAttributesCompatParcelizer;

    public setThumbnailUrl(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        this.AudioAttributesCompatParcelizer = gethref;
    }

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
        return write(z);
    }

    @Override // kotlin.newHeaderInstance
    protected final getHref write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        if (getgroupdescription != bc_()) {
            return new getTaxInfo(this, getgroupdescription);
        }
        return this;
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        return z == ba_() ? this : write().write(z).read(bc_());
    }
}
