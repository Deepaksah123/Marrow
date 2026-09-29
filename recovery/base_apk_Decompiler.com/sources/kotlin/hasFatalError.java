package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class hasFatalError {
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final int write;

    public hasFatalError(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final int write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasFatalError)) {
            return false;
        }
        hasFatalError hasfatalerror = (hasFatalError) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) hasfatalerror.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) hasfatalerror.read) && this.write == hasfatalerror.write;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.read;
        int i = this.write;
        StringBuilder sb = new StringBuilder("SubjectFilterCount(subjectId=");
        sb.append(str);
        sb.append(", subjectName=");
        sb.append(str2);
        sb.append(", mcqCountForSubject=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
