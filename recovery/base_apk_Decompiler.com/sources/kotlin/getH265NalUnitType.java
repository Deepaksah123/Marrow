package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getH265NalUnitType {
    private final Boolean AudioAttributesCompatParcelizer;
    private final List<Integer> IconCompatParcelizer;
    private final String read;
    private final String write;

    public getH265NalUnitType(String str, List<Integer> list, Boolean bool, String str2) {
        this.write = str;
        this.IconCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = bool;
        this.read = str2;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final List<Integer> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getH265NalUnitType)) {
            return false;
        }
        getH265NalUnitType geth265nalunittype = (getH265NalUnitType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) geth265nalunittype.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, geth265nalunittype.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, geth265nalunittype.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) geth265nalunittype.read);
    }

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<Integer> list = this.IconCompatParcelizer;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Boolean bool = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str2 = this.read;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.write;
        List<Integer> list = this.IconCompatParcelizer;
        Boolean bool = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("ZenAreaDynamicInfoUCModel(moduleCountUi=");
        sb.append(str);
        sb.append(", allowedSubjectGroupIds=");
        sb.append(list);
        sb.append(", isCtaVisible=");
        sb.append(bool);
        sb.append(", ctaText=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
