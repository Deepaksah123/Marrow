package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncResult<T> {
    private final int RemoteActionCompatParcelizer;
    private final T write;

    public SyncResult(int i, T t) {
        this.RemoteActionCompatParcelizer = i;
        this.write = t;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T write() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final T read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncResult)) {
            return false;
        }
        SyncResult syncResult = (SyncResult) obj;
        return this.RemoteActionCompatParcelizer == syncResult.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, syncResult.write);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        T t = this.write;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", value=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
