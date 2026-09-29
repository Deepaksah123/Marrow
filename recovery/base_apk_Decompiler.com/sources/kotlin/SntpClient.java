package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class SntpClient {
    private String write;

    public SntpClient(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = str;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SntpClient) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ((SntpClient) obj).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        String str = this.write;
        StringBuilder sb = new StringBuilder("RecentUpdateImageUCModel(imageUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
