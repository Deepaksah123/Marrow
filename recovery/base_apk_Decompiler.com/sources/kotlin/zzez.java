package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class zzez {
    private final int RemoteActionCompatParcelizer;
    private final int read;

    public zzez(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzez)) {
            return false;
        }
        zzez zzezVar = (zzez) obj;
        return this.RemoteActionCompatParcelizer == zzezVar.RemoteActionCompatParcelizer && this.read == zzezVar.read;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("WoqHeader(totalSolvedModule=");
        sb.append(i);
        sb.append(", totalModule=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
