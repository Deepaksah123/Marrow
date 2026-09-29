package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getItemType<T> {
    private final T AudioAttributesCompatParcelizer;
    private final T RemoteActionCompatParcelizer;

    public getItemType(T t, T t2) {
        this.RemoteActionCompatParcelizer = t;
        this.AudioAttributesCompatParcelizer = t2;
    }

    public final T write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final T RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getItemType)) {
            return false;
        }
        getItemType getitemtype = (getItemType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getitemtype.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getitemtype.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        T t = this.RemoteActionCompatParcelizer;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.AudioAttributesCompatParcelizer;
        return (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", upper=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
