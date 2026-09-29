package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultPlaybackSessionManagerSessionDescriptor {
    private final double AudioAttributesCompatParcelizer;

    public DefaultPlaybackSessionManagerSessionDescriptor(double d) {
        this.AudioAttributesCompatParcelizer = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultPlaybackSessionManagerSessionDescriptor) && Double.compare(this.AudioAttributesCompatParcelizer, ((DefaultPlaybackSessionManagerSessionDescriptor) obj).AudioAttributesCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfidenceScore(score=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
