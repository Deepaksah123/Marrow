package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class updateAndPost {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;
    private final long write;

    public updateAndPost(String str, String str2, long j, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = j;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long write() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateAndPost)) {
            return false;
        }
        updateAndPost updateandpost = (updateAndPost) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) updateandpost.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) updateandpost.IconCompatParcelizer) && this.write == updateandpost.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) updateandpost.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.write)) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        long j = this.write;
        String str3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubscriptionInfoLSModel(contentId=");
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
