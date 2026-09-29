package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ULongSerializer<T> {
    protected abstract void AudioAttributesCompatParcelizer(setDrawEntryLabels setdrawentrylabels, T t);

    protected abstract String IconCompatParcelizer();

    public final int read(setDrawHoleEnabled setdrawholeenabled, T t) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        if (t == null) {
            return 0;
        }
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(IconCompatParcelizer());
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            AudioAttributesCompatParcelizer(setdrawentrylabels, t);
            setdrawentrylabels.write();
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return setHighlighter.RemoteActionCompatParcelizer(setdrawholeenabled);
        } finally {
        }
    }
}
