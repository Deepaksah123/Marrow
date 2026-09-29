package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setTransactionInfo {
    private final String read;

    public setTransactionInfo(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setTransactionInfo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((setTransactionInfo) obj).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        String str = this.read;
        StringBuilder sb = new StringBuilder("WeakLessonUIModel(title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
