package kotlin;

/* JADX INFO: renamed from: o.cache, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0162cache {
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private String read;
    private final String write;

    public C0162cache(String str, String str2, String str3, int i, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = str4;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.write;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0162cache)) {
            return false;
        }
        C0162cache c0162cache = (C0162cache) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) c0162cache.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) c0162cache.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) c0162cache.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == c0162cache.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) c0162cache.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.write;
        String str3 = this.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqParentInfoRepoModel(mcqId=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", parentType=");
        sb.append(str3);
        sb.append(", order=");
        sb.append(i);
        sb.append(", parentMcqId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
