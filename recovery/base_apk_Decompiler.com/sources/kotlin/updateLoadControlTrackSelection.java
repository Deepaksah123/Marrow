package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum updateLoadControlTrackSelection {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String IconCompatParcelizer;

    updateLoadControlTrackSelection(String str) {
        this.IconCompatParcelizer = str;
    }

    public final String RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder(".temp");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.IconCompatParcelizer;
    }
}
