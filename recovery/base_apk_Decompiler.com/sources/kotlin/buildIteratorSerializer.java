package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class buildIteratorSerializer {
    public static final buildIteratorSerializer read = new buildIteratorSerializer(0, false);
    public final int IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    public buildIteratorSerializer(int i, boolean z) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        buildIteratorSerializer builditeratorserializer = (buildIteratorSerializer) obj;
        return this.IconCompatParcelizer == builditeratorserializer.IconCompatParcelizer && this.RemoteActionCompatParcelizer == builditeratorserializer.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer << 1) + (this.RemoteActionCompatParcelizer ? 1 : 0);
    }
}
