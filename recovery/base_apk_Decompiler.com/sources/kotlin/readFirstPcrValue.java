package kotlin;

import kotlin.access108;

/* JADX INFO: loaded from: classes5.dex */
final class readFirstPcrValue extends access108 {
    private final access108.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final access108.write read;
    private final access108.read write;

    readFirstPcrValue(access108.read readVar, access108.RemoteActionCompatParcelizer remoteActionCompatParcelizer, access108.write writeVar) {
        if (readVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.write = readVar;
        if (remoteActionCompatParcelizer == null) {
            throw new NullPointerException("Null osData");
        }
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        if (writeVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.read = writeVar;
    }

    @Override // kotlin.access108
    public final access108.read write() {
        return this.write;
    }

    @Override // kotlin.access108
    public final access108.RemoteActionCompatParcelizer read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.access108
    public final access108.write RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticSessionData{appData=");
        sb.append(this.write);
        sb.append(", osData=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", deviceData=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof access108)) {
            return false;
        }
        access108 access108Var = (access108) obj;
        return this.write.equals(access108Var.write()) && this.RemoteActionCompatParcelizer.equals(access108Var.read()) && this.read.equals(access108Var.RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return this.read.hashCode() ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }
}
