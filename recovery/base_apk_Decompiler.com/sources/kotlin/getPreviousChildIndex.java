package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getPreviousChildIndex {
    public static final <T> T RemoteActionCompatParcelizer(getConcatenatedUid getconcatenateduid, String str, getCreatedOnDateMs<? extends T> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getconcatenateduid, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        boolean zIconCompatParcelizer = getconcatenateduid.IconCompatParcelizer();
        if (zIconCompatParcelizer) {
            try {
                getconcatenateduid.read(str);
            } finally {
                if (zIconCompatParcelizer) {
                    getconcatenateduid.RemoteActionCompatParcelizer();
                }
            }
        }
        return getcreatedondatems.invoke();
    }
}
