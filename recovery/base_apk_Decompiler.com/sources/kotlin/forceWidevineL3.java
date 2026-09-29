package kotlin;

import kotlin.needsForceWidevineL3Workaround;

/* JADX INFO: loaded from: classes5.dex */
final class forceWidevineL3 extends needsForceWidevineL3Workaround {
    private final long IconCompatParcelizer;
    private final needsForceWidevineL3Workaround.write read;

    forceWidevineL3(needsForceWidevineL3Workaround.write writeVar, long j) {
        if (writeVar == null) {
            throw new NullPointerException("Null status");
        }
        this.read = writeVar;
        this.IconCompatParcelizer = j;
    }

    @Override // kotlin.needsForceWidevineL3Workaround
    public final needsForceWidevineL3Workaround.write AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.needsForceWidevineL3Workaround
    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.read);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof needsForceWidevineL3Workaround)) {
            return false;
        }
        needsForceWidevineL3Workaround needsforcewidevinel3workaround = (needsForceWidevineL3Workaround) obj;
        return this.read.equals(needsforcewidevinel3workaround.AudioAttributesCompatParcelizer()) && this.IconCompatParcelizer == needsforcewidevinel3workaround.RemoteActionCompatParcelizer();
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        long j = this.IconCompatParcelizer;
        return ((int) (j ^ (j >>> 32))) ^ ((iHashCode ^ 1000003) * 1000003);
    }
}
