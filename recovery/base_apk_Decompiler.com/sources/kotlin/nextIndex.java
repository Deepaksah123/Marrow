package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class nextIndex {
    private final int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;

    public nextIndex(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = str;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nextIndex)) {
            return false;
        }
        nextIndex nextindex = (nextIndex) obj;
        return this.AudioAttributesCompatParcelizer == nextindex.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) nextindex.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdateReferencesUIModel(type=");
        sb.append(i);
        sb.append(", displayId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
