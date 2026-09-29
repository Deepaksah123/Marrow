package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onSeekForwardIncrementChanged {
    private final int RemoteActionCompatParcelizer;
    private final int read;

    public onSeekForwardIncrementChanged(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        if (!onLoadingChanged.RemoteActionCompatParcelizer(i)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!onLoadingChanged.RemoteActionCompatParcelizer(i2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onSeekForwardIncrementChanged)) {
            return false;
        }
        onSeekForwardIncrementChanged onseekforwardincrementchanged = (onSeekForwardIncrementChanged) obj;
        return this.RemoteActionCompatParcelizer == onseekforwardincrementchanged.RemoteActionCompatParcelizer && this.read == onseekforwardincrementchanged.read;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", height=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
