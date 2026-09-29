package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setHighlightPerTapEnabled {
    public static final int AudioAttributesCompatParcelizer(setDrawEntryLabels setdrawentrylabels, String str) {
        toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
        toMagicModuleMetaRepoModel.write(str, "");
        int iIconCompatParcelizer = setLogEnabled.IconCompatParcelizer(setdrawentrylabels, str);
        if (iIconCompatParcelizer >= 0) {
            return iIconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append('`');
        int iIconCompatParcelizer2 = setLogEnabled.IconCompatParcelizer(setdrawentrylabels, sb.toString());
        if (iIconCompatParcelizer2 >= 0) {
            return iIconCompatParcelizer2;
        }
        return -1;
    }
}
