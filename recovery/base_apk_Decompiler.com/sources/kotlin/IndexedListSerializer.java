package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexedListSerializer {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public IndexedListSerializer(String str, String str2, String str3) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexedListSerializer indexedListSerializer = (IndexedListSerializer) obj;
        return LaissezFaireSubTypeValidator.read(this.write, indexedListSerializer.write) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, indexedListSerializer.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, indexedListSerializer.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }
}
