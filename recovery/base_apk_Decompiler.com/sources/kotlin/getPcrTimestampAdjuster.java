package kotlin;

import kotlin.access108;

/* JADX INFO: loaded from: classes5.dex */
final class getPcrTimestampAdjuster extends access108.write {
    private final int AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    getPcrTimestampAdjuster(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.IconCompatParcelizer = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesCompatParcelizer = i2;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.write = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.AudioAttributesImplBaseParcelizer = str3;
    }

    @Override // o.access108.write
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.access108.write
    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // o.access108.write
    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.access108.write
    public final long AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o.access108.write
    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.access108.write
    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.access108.write
    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // o.access108.write
    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // o.access108.write
    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", model=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", availableProcessors=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", totalRam=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", diskSpace=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isEmulator=");
        sb.append(this.read);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", manufacturer=");
        sb.append(this.write);
        sb.append(", modelClass=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof access108.write)) {
            return false;
        }
        access108.write writeVar = (access108.write) obj;
        return this.IconCompatParcelizer == writeVar.RemoteActionCompatParcelizer() && this.MediaBrowserCompatItemReceiver.equals(writeVar.AudioAttributesImplApi26Parcelizer()) && this.AudioAttributesCompatParcelizer == writeVar.read() && this.AudioAttributesImplApi26Parcelizer == writeVar.AudioAttributesImplBaseParcelizer() && this.RemoteActionCompatParcelizer == writeVar.write() && this.read == writeVar.IconCompatParcelizer() && this.MediaBrowserCompatCustomActionResultReceiver == writeVar.MediaBrowserCompatItemReceiver() && this.write.equals(writeVar.AudioAttributesCompatParcelizer()) && this.AudioAttributesImplBaseParcelizer.equals(writeVar.MediaBrowserCompatCustomActionResultReceiver());
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
        int i2 = this.AudioAttributesCompatParcelizer;
        long j = this.AudioAttributesImplApi26Parcelizer;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.RemoteActionCompatParcelizer;
        int i4 = (int) ((j2 >>> 32) ^ j2);
        int i5 = this.read ? 1231 : 1237;
        return this.AudioAttributesImplBaseParcelizer.hashCode() ^ ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ this.MediaBrowserCompatCustomActionResultReceiver) * 1000003) ^ this.write.hashCode()) * 1000003);
    }
}
