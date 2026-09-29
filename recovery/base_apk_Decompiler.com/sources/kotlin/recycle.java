package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class recycle {
    private int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private int read;
    private final String write;

    public recycle(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = i;
        this.read = 1;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.read = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recycle)) {
            return false;
        }
        recycle recycleVar = (recycle) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) recycleVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) recycleVar.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == recycleVar.AudioAttributesCompatParcelizer && this.read == recycleVar.read;
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("SchemaQBankResultModel(schemaId=");
        sb.append(str);
        sb.append(", schemaName=");
        sb.append(str2);
        sb.append(", correctCount=");
        sb.append(i);
        sb.append(", totalCount=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
