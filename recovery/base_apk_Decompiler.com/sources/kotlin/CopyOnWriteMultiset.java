package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class CopyOnWriteMultiset {
    private final int write;

    public CopyOnWriteMultiset(int i) {
        this.write = i;
    }

    public final int read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CopyOnWriteMultiset) && this.write == ((CopyOnWriteMultiset) obj).write;
    }

    public final int hashCode() {
        return Integer.hashCode(this.write);
    }

    public final String toString() {
        int i = this.write;
        StringBuilder sb = new StringBuilder("SubjectGroupType(groupId=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
