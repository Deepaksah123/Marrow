package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class FlagSet {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String write;

    public FlagSet(String str, String str2, boolean z, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = j;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) flagSet.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) flagSet.write) && this.IconCompatParcelizer == flagSet.IconCompatParcelizer && this.RemoteActionCompatParcelizer == flagSet.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        boolean z = this.IconCompatParcelizer;
        long j = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("TestMcqTimeRepoModel(mcqId=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", answeredFirstTime=");
        sb.append(z);
        sb.append(", spentTime=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
