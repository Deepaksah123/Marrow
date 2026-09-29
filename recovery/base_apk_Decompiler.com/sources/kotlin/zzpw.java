package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpw {
    private final int IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public zzpw(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = i;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpw)) {
            return false;
        }
        zzpw zzpwVar = (zzpw) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) zzpwVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zzpwVar.read) && this.IconCompatParcelizer == zzpwVar.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        int i = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaFilterItem(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", count=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
