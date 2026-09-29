package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class fromBundleSparseArray {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final int read;

    public fromBundleSparseArray(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromBundleSparseArray)) {
            return false;
        }
        fromBundleSparseArray frombundlesparsearray = (fromBundleSparseArray) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) frombundlesparsearray.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) frombundlesparsearray.IconCompatParcelizer) && this.read == frombundlesparsearray.read;
    }

    public final int hashCode() {
        String str = this.AudioAttributesCompatParcelizer;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        int i = this.read;
        StringBuilder sb = new StringBuilder("SchemaFilterItemRepoModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", count=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
