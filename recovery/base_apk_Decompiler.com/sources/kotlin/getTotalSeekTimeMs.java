package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getTotalSeekTimeMs {
    public final String AudioAttributesCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public getTotalSeekTimeMs(String str, String str2, String str3) {
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTotalSeekTimeMs)) {
            return false;
        }
        getTotalSeekTimeMs gettotalseektimems = (getTotalSeekTimeMs) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) gettotalseektimems.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) gettotalseektimems.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) gettotalseektimems.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.read.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
