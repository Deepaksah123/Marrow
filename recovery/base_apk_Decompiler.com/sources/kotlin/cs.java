package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class cs {
    private final int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final float write;

    public cs(String str, String str2, String str3, int i, float f) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = i;
        this.write = f;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) csVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) csVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) csVar.read) && this.AudioAttributesCompatParcelizer == csVar.AudioAttributesCompatParcelizer && Float.compare(this.write, csVar.write) == 0;
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Float.hashCode(this.write);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        float f = this.write;
        StringBuilder sb = new StringBuilder("VideoNoteUIModel(imageUrl=");
        sb.append(str);
        sb.append(", key=");
        sb.append(str2);
        sb.append(", fileName=");
        sb.append(str3);
        sb.append(", sTimeStamp=");
        sb.append(i);
        sb.append(", aspectRatio=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
