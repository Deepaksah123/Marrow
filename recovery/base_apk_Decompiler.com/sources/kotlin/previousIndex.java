package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class previousIndex {
    private String write;

    public previousIndex(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = str;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof previousIndex) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ((previousIndex) obj).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        String str = this.write;
        StringBuilder sb = new StringBuilder("RecentUpdateImageUIModel(imageUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
