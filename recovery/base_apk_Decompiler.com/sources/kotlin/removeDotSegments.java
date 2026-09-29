package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class removeDotSegments {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public removeDotSegments(String str, String str2, String str3, String str4, String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.write = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = str5;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeDotSegments)) {
            return false;
        }
        removeDotSegments removedotsegments = (removeDotSegments) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) removedotsegments.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) removedotsegments.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) removedotsegments.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) removedotsegments.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) removedotsegments.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.IconCompatParcelizer;
        String str5 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ShareAppUCModel(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", longDescription=");
        sb.append(str3);
        sb.append(", shortDescription=");
        sb.append(str4);
        sb.append(", subject=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
