package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionManagerDrmSessionReference {
    private final String write;

    public static DrmSessionManagerDrmSessionReference IconCompatParcelizer(String str) {
        return new DrmSessionManagerDrmSessionReference(str);
    }

    public final String write() {
        return this.write;
    }

    private DrmSessionManagerDrmSessionReference(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.write = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrmSessionManagerDrmSessionReference) {
            return this.write.equals(((DrmSessionManagerDrmSessionReference) obj).write);
        }
        return false;
    }

    public final int hashCode() {
        return this.write.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.write);
        sb.append("\"}");
        return sb.toString();
    }
}
