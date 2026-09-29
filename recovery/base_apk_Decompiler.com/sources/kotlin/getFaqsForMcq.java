package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getFaqsForMcq {
    public static final <T> String write(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        StringBuilder sb = new StringBuilder();
        sb.append(RecentUpdatesResponse.AudioAttributesCompatParcelizer(toMagicModuleMetaDataUcModel.write(t.getClass())));
        sb.append('@');
        sb.append(t.hashCode());
        return sb.toString();
    }

    public static final <T> UpgradePlanMiniRepoModel AudioAttributesCompatParcelizer(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        return new UpgradePlanMiniRepoModel(toMagicModuleMetaDataUcModel.write(t.getClass()));
    }
}
