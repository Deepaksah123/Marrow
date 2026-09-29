package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomicFileAtomicFileOutputStream {
    private final String IconCompatParcelizer;
    private final String read;
    private final long write;

    public AtomicFileAtomicFileOutputStream(String str, long j, String str2) {
        this.read = str;
        this.write = j;
        this.IconCompatParcelizer = str2;
    }

    public final String read() {
        return this.read;
    }

    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtomicFileAtomicFileOutputStream)) {
            return false;
        }
        AtomicFileAtomicFileOutputStream atomicFileAtomicFileOutputStream = (AtomicFileAtomicFileOutputStream) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) atomicFileAtomicFileOutputStream.read) && this.write == atomicFileAtomicFileOutputStream.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) atomicFileAtomicFileOutputStream.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.write);
        String str2 = this.IconCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.read;
        long j = this.write;
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SyncParamLSModel(sinceId=");
        sb.append(str);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", nextUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
