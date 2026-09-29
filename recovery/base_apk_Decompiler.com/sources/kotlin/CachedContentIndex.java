package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedContentIndex {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int write;

    public CachedContentIndex(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = i;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedContentIndex)) {
            return false;
        }
        CachedContentIndex cachedContentIndex = (CachedContentIndex) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cachedContentIndex.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) cachedContentIndex.AudioAttributesCompatParcelizer) && this.write == cachedContentIndex.write;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        StringBuilder sb = new StringBuilder("SubjectBookmarkCountLSModel(subjectId=");
        sb.append(str);
        sb.append(", subjectTitle=");
        sb.append(str2);
        sb.append(", count=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
