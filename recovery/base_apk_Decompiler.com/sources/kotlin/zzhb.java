package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhb {
    private final String AudioAttributesCompatParcelizer;
    private boolean read;
    private final String write;

    public zzhb(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.read = false;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.read = z;
    }

    public final boolean read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhbVar = (zzhb) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzhbVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zzhbVar.AudioAttributesCompatParcelizer) && this.read == zzhbVar.read;
    }

    public final int hashCode() {
        String str = this.write;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("RecentUpdateFilterUIModel(subjectId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
