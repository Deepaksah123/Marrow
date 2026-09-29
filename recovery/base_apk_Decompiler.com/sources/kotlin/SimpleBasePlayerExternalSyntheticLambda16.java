package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda16 {
    private double AudioAttributesCompatParcelizer;
    private double RemoteActionCompatParcelizer;
    private double write;

    public SimpleBasePlayerExternalSyntheticLambda16(double d, double d2, double d3) {
        this.AudioAttributesCompatParcelizer = d;
        this.RemoteActionCompatParcelizer = d2;
        this.write = d3;
    }

    public final double write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final double AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final double read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBasePlayerExternalSyntheticLambda16)) {
            return false;
        }
        SimpleBasePlayerExternalSyntheticLambda16 simpleBasePlayerExternalSyntheticLambda16 = (SimpleBasePlayerExternalSyntheticLambda16) obj;
        return Double.compare(this.AudioAttributesCompatParcelizer, simpleBasePlayerExternalSyntheticLambda16.AudioAttributesCompatParcelizer) == 0 && Double.compare(this.RemoteActionCompatParcelizer, simpleBasePlayerExternalSyntheticLambda16.RemoteActionCompatParcelizer) == 0 && Double.compare(this.write, simpleBasePlayerExternalSyntheticLambda16.write) == 0;
    }

    public final int hashCode() {
        return (((Double.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Double.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Double.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggerGeoRadius(latitude=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", longitude=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", radius=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
