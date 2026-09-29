package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class fromPath {
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public fromPath(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromPath)) {
            return false;
        }
        fromPath frompath = (fromPath) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) frompath.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) frompath.read);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("DataVMModel(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
