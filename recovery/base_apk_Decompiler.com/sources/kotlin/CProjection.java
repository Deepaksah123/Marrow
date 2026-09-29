package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class CProjection {
    private final String RemoteActionCompatParcelizer;
    private final int read;

    public CProjection(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CProjection)) {
            return false;
        }
        CProjection cProjection = (CProjection) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cProjection.RemoteActionCompatParcelizer) && this.read == cProjection.read;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", generation=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
