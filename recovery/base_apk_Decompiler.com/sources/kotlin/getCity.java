package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getCity {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public getCity(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCity)) {
            return false;
        }
        getCity getcity = (getCity) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getcity.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getcity.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getcity.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ScreenUiDetails(title=");
        sb.append(str);
        sb.append(", toolbarTitle=");
        sb.append(str2);
        sb.append(", subTitle=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
