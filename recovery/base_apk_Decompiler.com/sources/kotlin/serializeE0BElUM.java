package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class serializeE0BElUM<T> {
    protected abstract void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, T t);

    protected abstract String read();

    public final void RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled, T t) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        if (t == null) {
            return;
        }
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(read());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            IconCompatParcelizer(setdrawentrylabels, t);
            setdrawentrylabels.write();
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
        } finally {
        }
    }
}
