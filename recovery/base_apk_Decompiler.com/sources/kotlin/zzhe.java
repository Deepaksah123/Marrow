package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhe {
    private final String IconCompatParcelizer;
    private final String read;

    public zzhe(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhe)) {
            return false;
        }
        zzhe zzheVar = (zzhe) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zzheVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzheVar.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdateSubjectDetailsUIModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
