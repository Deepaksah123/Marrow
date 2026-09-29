package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getNames {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final List<String> write;

    public getNames(String str, long j, String str2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = list;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<String> read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNames)) {
            return false;
        }
        getNames getnames = (getNames) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getnames.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == getnames.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getnames.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getnames.write);
    }

    public final int hashCode() {
        return (((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        long j = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        List<String> list = this.write;
        StringBuilder sb = new StringBuilder("SubscriptionUiState(contentType=");
        sb.append(str);
        sb.append(", expiresOn=");
        sb.append(j);
        sb.append(", memberShipTitle=");
        sb.append(str2);
        sb.append(", membershipDescriptions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
