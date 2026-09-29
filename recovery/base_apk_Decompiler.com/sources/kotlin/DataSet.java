package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DataSet {
    private final boolean AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public DataSet read() {
        return this;
    }

    public DataSet(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public Integer AudioAttributesCompatParcelizer(DataSet dataSet) {
        toMagicModuleMetaRepoModel.write(dataSet, "");
        C0212toJsonArray c0212toJsonArray = C0212toJsonArray.write;
        return C0212toJsonArray.read(this, dataSet);
    }

    public final String toString() {
        return write();
    }
}
