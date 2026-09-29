package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class DashUtil {
    private final int AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final String read;
    private final long write;

    public DashUtil(String str, boolean z, long j, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = j;
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String write() {
        return this.read;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashUtil)) {
            return false;
        }
        DashUtil dashUtil = (DashUtil) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) dashUtil.read) && this.RemoteActionCompatParcelizer == dashUtil.RemoteActionCompatParcelizer && this.write == dashUtil.write && this.AudioAttributesCompatParcelizer == dashUtil.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.read;
        boolean z = this.RemoteActionCompatParcelizer;
        long j = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubjectUpdatedStatus(subjectId=");
        sb.append(str);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", expiresOn=");
        sb.append(j);
        sb.append(", activeEdition=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
