package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedContentIndexStorage {
    private final String IconCompatParcelizer;
    private final String write;

    public CachedContentIndexStorage(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedContentIndexStorage)) {
            return false;
        }
        CachedContentIndexStorage cachedContentIndexStorage = (CachedContentIndexStorage) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cachedContentIndexStorage.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cachedContentIndexStorage.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("PearlIdModel(pearlId=");
        sb.append(str);
        sb.append(", pearlDisplayId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
