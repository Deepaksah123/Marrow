package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class toBundleSparseArray {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final currentTimeMillis IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final double read;
    private final String write;

    public toBundleSparseArray(String str, String str2, double d, int i, currentTimeMillis currenttimemillis, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(currenttimemillis, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.read = d;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = currenttimemillis;
        this.AudioAttributesImplApi21Parcelizer = str3;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final currentTimeMillis RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toBundleSparseArray)) {
            return false;
        }
        toBundleSparseArray tobundlesparsearray = (toBundleSparseArray) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) tobundlesparsearray.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) tobundlesparsearray.write) && Double.compare(this.read, tobundlesparsearray.read) == 0 && this.RemoteActionCompatParcelizer == tobundlesparsearray.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, tobundlesparsearray.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) tobundlesparsearray.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Double.hashCode(this.read)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        double d = this.read;
        int i = this.RemoteActionCompatParcelizer;
        currentTimeMillis currenttimemillis = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("SearchTextRepoModel(id=");
        sb.append(str);
        sb.append(", index=");
        sb.append(str2);
        sb.append(", score=");
        sb.append(d);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(", source=");
        sb.append(currenttimemillis);
        sb.append(", type=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
