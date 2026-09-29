package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isDone {
    private final String IconCompatParcelizer;
    private final int write;

    public isDone(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = i;
        this.IconCompatParcelizer = str;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isDone)) {
            return false;
        }
        isDone isdone = (isDone) obj;
        return this.write == isdone.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) isdone.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.write) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdateReferencesUCModel(type=");
        sb.append(i);
        sb.append(", displayId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
