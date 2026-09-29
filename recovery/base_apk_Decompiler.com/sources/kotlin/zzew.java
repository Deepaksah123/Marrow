package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzew {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public zzew(String str, String str2, String str3, String str4, String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.write = str5;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzew)) {
            return false;
        }
        zzew zzewVar = (zzew) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzewVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zzewVar.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zzewVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) zzewVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) zzewVar.write);
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.RemoteActionCompatParcelizer;
        String str5 = this.write;
        StringBuilder sb = new StringBuilder("WoqBanner(title=");
        sb.append(str);
        sb.append(", date=");
        sb.append(str2);
        sb.append(", info=");
        sb.append(str3);
        sb.append(", suffix=");
        sb.append(str4);
        sb.append(", url=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
