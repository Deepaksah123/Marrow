package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class openSession extends setOnKeyStatusChangeListener {
    private final long IconCompatParcelizer;

    openSession(long j) {
        this.IconCompatParcelizer = j;
    }

    @Override // kotlin.setOnKeyStatusChangeListener
    public final long read() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof setOnKeyStatusChangeListener) && this.IconCompatParcelizer == ((setOnKeyStatusChangeListener) obj).read();
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }
}
