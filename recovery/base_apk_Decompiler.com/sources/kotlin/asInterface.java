package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class asInterface {
    private final String IconCompatParcelizer;
    private final String read;
    private final String write;

    public asInterface(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asInterface)) {
            return false;
        }
        asInterface asinterface = (asInterface) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) asinterface.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) asinterface.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) asinterface.write);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        StringBuilder sb = new StringBuilder("EditorModel(fullName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", qualification=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
