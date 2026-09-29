package kotlin;

import kotlin.access108;

/* JADX INFO: loaded from: classes5.dex */
final class readLastPcrValueFromBuffer extends access108.read {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final parseCsdBuffer IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    readLastPcrValueFromBuffer(String str, String str2, String str3, String str4, int i, parseCsdBuffer parsecsdbuffer) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.RemoteActionCompatParcelizer = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.write = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.AudioAttributesImplApi21Parcelizer = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.AudioAttributesCompatParcelizer = str4;
        this.read = i;
        if (parsecsdbuffer == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.IconCompatParcelizer = parsecsdbuffer;
    }

    @Override // o.access108.read
    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.access108.read
    public final String write() {
        return this.write;
    }

    @Override // o.access108.read
    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.access108.read
    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.access108.read
    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // o.access108.read
    public final parseCsdBuffer RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppData{appIdentifier=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", versionCode=");
        sb.append(this.write);
        sb.append(", versionName=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", installUuid=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", deliveryMechanism=");
        sb.append(this.read);
        sb.append(", developmentPlatformProvider=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof access108.read)) {
            return false;
        }
        access108.read readVar = (access108.read) obj;
        return this.RemoteActionCompatParcelizer.equals(readVar.IconCompatParcelizer()) && this.write.equals(readVar.write()) && this.AudioAttributesImplApi21Parcelizer.equals(readVar.AudioAttributesImplBaseParcelizer()) && this.AudioAttributesCompatParcelizer.equals(readVar.read()) && this.read == readVar.AudioAttributesCompatParcelizer() && this.IconCompatParcelizer.equals(readVar.RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode4 = this.AudioAttributesCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() ^ ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ this.read) * 1000003);
    }
}
