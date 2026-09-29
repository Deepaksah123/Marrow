package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getInteger {
    private final String IconCompatParcelizer;
    private final List<String> RemoteActionCompatParcelizer;
    private final getTrackTypeString read;

    public getInteger(getTrackTypeString gettracktypestring, String str, List<String> list) {
        toMagicModuleMetaRepoModel.write(gettracktypestring, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = gettracktypestring;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final getTrackTypeString RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final List<String> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInteger)) {
            return false;
        }
        getInteger getinteger = (getInteger) obj;
        return this.read == getinteger.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getinteger.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getinteger.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        getTrackTypeString gettracktypestring = this.read;
        String str = this.IconCompatParcelizer;
        List<String> list = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("MembershipDetailUCModel(type=");
        sb.append(gettracktypestring);
        sb.append(", title=");
        sb.append(str);
        sb.append(", descriptions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
