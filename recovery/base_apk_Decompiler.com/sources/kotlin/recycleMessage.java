package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class recycleMessage {
    private final int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;

    public recycleMessage(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recycleMessage)) {
            return false;
        }
        recycleMessage recyclemessage = (recycleMessage) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) recyclemessage.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) recyclemessage.read) && this.AudioAttributesCompatParcelizer == recyclemessage.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaFilterItemUCModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", count=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
