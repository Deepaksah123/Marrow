package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class readSdrs extends TrackTransformation {
    private final long AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final long read;

    readSdrs(long j, long j2, long j3) {
        this.AudioAttributesCompatParcelizer = j;
        this.read = j2;
        this.IconCompatParcelizer = j3;
    }

    @Override // kotlin.TrackTransformation
    public final long write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.TrackTransformation
    public final long read() {
        return this.read;
    }

    @Override // kotlin.TrackTransformation
    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", elapsedRealtime=");
        sb.append(this.read);
        sb.append(", uptimeMillis=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackTransformation)) {
            return false;
        }
        TrackTransformation trackTransformation = (TrackTransformation) obj;
        return this.AudioAttributesCompatParcelizer == trackTransformation.write() && this.read == trackTransformation.read() && this.IconCompatParcelizer == trackTransformation.RemoteActionCompatParcelizer();
    }

    public final int hashCode() {
        long j = this.AudioAttributesCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.read;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.IconCompatParcelizer;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((i ^ 1000003) * 1000003) ^ i2) * 1000003);
    }
}
