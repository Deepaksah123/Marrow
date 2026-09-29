package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getSegmentCount {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;

    public getSegmentCount(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final String write() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSegmentCount)) {
            return false;
        }
        getSegmentCount getsegmentcount = (getSegmentCount) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getsegmentcount.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getsegmentcount.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getsegmentcount.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("ImageAttribution(id=");
        sb.append(str);
        sb.append(", edition=");
        sb.append(str2);
        sb.append(", link=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
