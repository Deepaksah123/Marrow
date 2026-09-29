package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class resetMcqBookmarks extends getBookmarked {
    public resetMcqBookmarks() {
        super(PlanBUpgradeLSModel.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.getBookmarked
    public final void read(PlanBUpgradeLSModel planBUpgradeLSModel, String str) {
        toMagicModuleMetaRepoModel.write(planBUpgradeLSModel, "");
        toMagicModuleMetaRepoModel.write(str, "");
    }
}
