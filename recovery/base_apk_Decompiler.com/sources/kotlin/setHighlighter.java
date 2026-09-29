package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setHighlighter {
    public static final int RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer("SELECT changes()");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            setdrawentrylabels.write();
            int iIconCompatParcelizer = (int) setdrawentrylabels.IconCompatParcelizer(0);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return iIconCompatParcelizer;
        } finally {
        }
    }
}
