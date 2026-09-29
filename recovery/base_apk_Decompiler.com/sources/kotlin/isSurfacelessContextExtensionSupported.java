package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isSurfacelessContextExtensionSupported {
    private final long AudioAttributesCompatParcelizer;
    private final String read;

    public isSurfacelessContextExtensionSupported(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = j;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isSurfacelessContextExtensionSupported)) {
            return false;
        }
        isSurfacelessContextExtensionSupported issurfacelesscontextextensionsupported = (isSurfacelessContextExtensionSupported) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) issurfacelesscontextextensionsupported.read) && this.AudioAttributesCompatParcelizer == issurfacelesscontextextensionsupported.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        long j = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("MediaTokenModel(token=");
        sb.append(str);
        sb.append(", expiryMs=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
