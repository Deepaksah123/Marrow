package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MapEntrySerializer {
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public MapEntrySerializer(String str, String str2) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }
}
