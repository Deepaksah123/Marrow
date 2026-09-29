package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getUtf8Bytes {
    private final long AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;
    private final String write;

    public getUtf8Bytes(String str, String str2, long j, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = j;
        this.read = str3;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUtf8Bytes)) {
            return false;
        }
        getUtf8Bytes getutf8bytes = (getUtf8Bytes) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getutf8bytes.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getutf8bytes.write) && this.AudioAttributesCompatParcelizer == getutf8bytes.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getutf8bytes.read);
    }

    public final int hashCode() {
        return (((((this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        long j = this.AudioAttributesCompatParcelizer;
        String str3 = this.read;
        StringBuilder sb = new StringBuilder("SubscriptionInfoUCModel(contentId=");
        sb.append(str);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", expiresOn=");
        sb.append(j);
        sb.append(", contentNameForEvent=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
