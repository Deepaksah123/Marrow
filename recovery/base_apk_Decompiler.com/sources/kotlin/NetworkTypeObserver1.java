package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkTypeObserver1 {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public NetworkTypeObserver1(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTypeObserver1)) {
            return false;
        }
        NetworkTypeObserver1 networkTypeObserver1 = (NetworkTypeObserver1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) networkTypeObserver1.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) networkTypeObserver1.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("DownloadNotesModel(url=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
