package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class Atom extends XingSeeker {
    private final int IconCompatParcelizer;
    private final long read;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XingSeeker)) {
            return false;
        }
        XingSeeker xingSeeker = (XingSeeker) obj;
        return this.IconCompatParcelizer == xingSeeker.write() && this.read == xingSeeker.read();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", eventTimestamp=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    Atom(int i, long j) {
        this.IconCompatParcelizer = i;
        this.read = j;
    }

    @Override // kotlin.XingSeeker
    public final int write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.XingSeeker
    public final long read() {
        return this.read;
    }

    public final int hashCode() {
        long j = this.read;
        return ((this.IconCompatParcelizer ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
