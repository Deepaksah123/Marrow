package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class PendingResults {
    private final boolean AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;
    private final String write;

    public PendingResults(String str, String str2, String str3, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingResults)) {
            return false;
        }
        PendingResults pendingResults = (PendingResults) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) pendingResults.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) pendingResults.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) pendingResults.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == pendingResults.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        String str3 = this.IconCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("EncryptedImageUIModel(fileName=");
        sb.append(str);
        sb.append(", fallbackUrl=");
        sb.append(str2);
        sb.append(", decryptionKey=");
        sb.append(str3);
        sb.append(", forceDownload=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
