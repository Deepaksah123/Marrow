package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ensureClassLoader {
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public ensureClassLoader(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
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
        if (!(obj instanceof ensureClassLoader)) {
            return false;
        }
        ensureClassLoader ensureclassloader = (ensureClassLoader) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ensureclassloader.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ensureclassloader.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ensureclassloader.write);
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        StringBuilder sb = new StringBuilder("SchemaLSModel(schemaId=");
        sb.append(str);
        sb.append(", schemaName=");
        sb.append(str2);
        sb.append(", mcqId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
