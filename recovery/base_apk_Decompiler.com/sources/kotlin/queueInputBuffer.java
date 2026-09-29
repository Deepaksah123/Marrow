package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class queueInputBuffer {
    public final long AudioAttributesCompatParcelizer;
    public final long read;

    public queueInputBuffer(long j, long j2) {
        this.read = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof queueInputBuffer)) {
            return false;
        }
        queueInputBuffer queueinputbuffer = (queueInputBuffer) obj;
        return this.read == queueinputbuffer.read && this.AudioAttributesCompatParcelizer == queueinputbuffer.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.AudioAttributesCompatParcelizer) + (Long.hashCode(this.read) * 31);
    }

    public final String toString() {
        return "";
    }
}
