package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class EventMessageEncoder extends writeNullTerminatedString {
    private final Set<String> RemoteActionCompatParcelizer;

    EventMessageEncoder(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.RemoteActionCompatParcelizer = set;
    }

    @Override // kotlin.writeNullTerminatedString
    public final Set<String> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigUpdate{updatedKeys=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof writeNullTerminatedString) {
            return this.RemoteActionCompatParcelizer.equals(((writeNullTerminatedString) obj).RemoteActionCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() ^ 1000003;
    }
}
