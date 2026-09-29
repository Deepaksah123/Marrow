package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class revokeAccess {
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public revokeAccess(String str, String str2) {
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
        if (!(obj instanceof revokeAccess)) {
            return false;
        }
        revokeAccess revokeaccess = (revokeAccess) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) revokeaccess.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) revokeaccess.read);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("FaqModel(question=");
        sb.append(str);
        sb.append(", answer=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
