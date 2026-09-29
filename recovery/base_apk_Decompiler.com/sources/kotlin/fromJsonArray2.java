package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class fromJsonArray2 extends newHeaderInstance {
    private final getHref read;
    private final getHref write;

    public fromJsonArray2(getHref gethref, getHref gethref2) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
        this.read = gethref;
        this.write = gethref2;
    }

    @Override // kotlin.PlanAddOnsCompanion
    public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    public final getHref AudioAttributesImplApi26Parcelizer() {
        return this.write;
    }

    @Override // kotlin.newHeaderInstance
    protected final getHref write() {
        return this.read;
    }

    public final getHref MediaBrowserCompatCustomActionResultReceiver() {
        return write();
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new fromJsonArray2(write().read(getgroupdescription), this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getHref
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public fromJsonArray2 write(boolean z) {
        return new fromJsonArray2(write().write(z), this.write.write(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public fromJsonArray2 AudioAttributesCompatParcelizer(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        return new fromJsonArray2(gethref, this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance, kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public fromJsonArray2 write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getLink getlink = getcheapestplan.read(write());
        toMagicModuleMetaRepoModel.read(getlink, "");
        getLink getlink2 = getcheapestplan.read(this.write);
        toMagicModuleMetaRepoModel.read(getlink2, "");
        return new fromJsonArray2((getHref) getlink, (getHref) getlink2);
    }
}
