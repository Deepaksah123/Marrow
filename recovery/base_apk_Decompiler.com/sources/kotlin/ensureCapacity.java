package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ensureCapacity {
    private final String AudioAttributesCompatParcelizer;
    private final String read;

    public ensureCapacity(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ensureCapacity)) {
            return false;
        }
        ensureCapacity ensurecapacity = (ensureCapacity) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) ensurecapacity.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ensurecapacity.read);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("CountriesUCModel(title=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
