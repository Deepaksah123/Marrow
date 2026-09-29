package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getItemSubTitle {
    private final getLink IconCompatParcelizer;
    private final getBadgeText RemoteActionCompatParcelizer;
    private final getLink read;

    public getItemSubTitle(getBadgeText getbadgetext, getLink getlink, getLink getlink2) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getlink2, "");
        this.RemoteActionCompatParcelizer = getbadgetext;
        this.read = getlink;
        this.IconCompatParcelizer = getlink2;
    }

    public final getBadgeText IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getLink RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final getLink write() {
        return this.IconCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return PlanData.AudioAttributesCompatParcelizer.read(this.read, this.IconCompatParcelizer);
    }
}
