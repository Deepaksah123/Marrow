package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getTaxInfo extends setThumbnailUrl {
    private final getGroupDescription read;

    @Override // kotlin.newHeaderInstance, kotlin.getLink
    public final getGroupDescription bc_() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTaxInfo(getHref gethref, getGroupDescription getgroupdescription) {
        super(gethref);
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        this.read = getgroupdescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getTaxInfo AudioAttributesCompatParcelizer(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        return new getTaxInfo(gethref, bc_());
    }
}
