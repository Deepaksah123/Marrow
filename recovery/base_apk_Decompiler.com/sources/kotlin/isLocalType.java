package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class isLocalType {
    public static final isLocalType AudioAttributesCompatParcelizer = new isLocalType(0, 0);
    public final long IconCompatParcelizer;
    public final long write;

    public isLocalType(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.write = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", position=");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isLocalType islocaltype = (isLocalType) obj;
        return this.IconCompatParcelizer == islocaltype.IconCompatParcelizer && this.write == islocaltype.write;
    }

    public final int hashCode() {
        return (((int) this.IconCompatParcelizer) * 31) + ((int) this.write);
    }
}
