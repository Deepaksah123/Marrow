package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamiteModule {
    private final String IconCompatParcelizer;
    private final String read;
    private final boolean write;

    public DynamiteModule(String str, boolean z, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.write = z;
        this.read = str2;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamiteModule)) {
            return false;
        }
        DynamiteModule dynamiteModule = (DynamiteModule) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) dynamiteModule.IconCompatParcelizer) && this.write == dynamiteModule.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) dynamiteModule.read);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write)) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        boolean z = this.write;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("SubjectPlanItem(title=");
        sb.append(str);
        sb.append(", isExpiringSoon=");
        sb.append(z);
        sb.append(", validTill=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
