package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class installIfNeeded {
    private long AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private String read;
    private boolean write;

    public installIfNeeded(boolean z, boolean z2, String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
        this.read = str;
        this.AudioAttributesCompatParcelizer = j;
    }

    public final boolean IconCompatParcelizer() {
        return this.write;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof installIfNeeded)) {
            return false;
        }
        installIfNeeded installifneeded = (installIfNeeded) obj;
        return this.write == installifneeded.write && this.RemoteActionCompatParcelizer == installifneeded.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) installifneeded.read) && this.AudioAttributesCompatParcelizer == installifneeded.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.write) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.write;
        boolean z2 = this.RemoteActionCompatParcelizer;
        String str = this.read;
        long j = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("ReviewScreenModel(isReviewAvailable=");
        sb.append(z);
        sb.append(", isLocked=");
        sb.append(z2);
        sb.append(", testId=");
        sb.append(str);
        sb.append(", resultTimeStamp=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
