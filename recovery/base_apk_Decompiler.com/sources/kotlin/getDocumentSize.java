package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getDocumentSize {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public getDocumentSize(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDocumentSize)) {
            return false;
        }
        getDocumentSize getdocumentsize = (getDocumentSize) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getdocumentsize.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getdocumentsize.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getdocumentsize.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("LabelRepoModel(text=");
        sb.append(str);
        sb.append(", color=");
        sb.append(str2);
        sb.append(", backgroundColor=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
