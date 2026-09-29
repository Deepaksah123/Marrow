package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class writeTimestamp {
    private final int RemoteActionCompatParcelizer;
    private final int read;

    public writeTimestamp(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeTimestamp)) {
            return false;
        }
        writeTimestamp writetimestamp = (writeTimestamp) obj;
        return this.read == writetimestamp.read && this.RemoteActionCompatParcelizer == writetimestamp.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.read) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("CourseEdition(courseId=");
        sb.append(i);
        sb.append(", edition=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
