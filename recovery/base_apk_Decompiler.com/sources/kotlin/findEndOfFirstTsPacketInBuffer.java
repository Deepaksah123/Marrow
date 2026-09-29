package kotlin;

import kotlin.access108;

/* JADX INFO: loaded from: classes5.dex */
final class findEndOfFirstTsPacketInBuffer extends access108.RemoteActionCompatParcelizer {
    private final boolean AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    findEndOfFirstTsPacketInBuffer(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.read = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // o.access108.RemoteActionCompatParcelizer
    public final String read() {
        return this.read;
    }

    @Override // o.access108.RemoteActionCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.access108.RemoteActionCompatParcelizer
    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.read);
        sb.append(", osCodeName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isRooted=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof access108.RemoteActionCompatParcelizer)) {
            return false;
        }
        access108.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (access108.RemoteActionCompatParcelizer) obj;
        return this.read.equals(remoteActionCompatParcelizer.read()) && this.RemoteActionCompatParcelizer.equals(remoteActionCompatParcelizer.IconCompatParcelizer()) && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return (this.AudioAttributesCompatParcelizer ? 1231 : 1237) ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }
}
