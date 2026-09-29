package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class blockUntilStarted {
    private final String read;
    private final String write;

    public blockUntilStarted(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.read = str2;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blockUntilStarted)) {
            return false;
        }
        blockUntilStarted blockuntilstarted = (blockUntilStarted) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) blockuntilstarted.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) blockuntilstarted.read);
    }

    public final int hashCode() {
        String str = this.write;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("RecentUpdateFilterUCModel(subjectId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
