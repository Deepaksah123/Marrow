package kotlin;

import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
final class POJONode {
    public final StdKeySerializers.write AudioAttributesCompatParcelizer;
    public final long AudioAttributesImplApi21Parcelizer;
    public final boolean AudioAttributesImplApi26Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompatCustomActionResultReceiver;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final boolean write;

    POJONode(StdKeySerializers.write writeVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        buildTypeSerializer.IconCompatParcelizer(!z4 || z2);
        buildTypeSerializer.IconCompatParcelizer(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        buildTypeSerializer.IconCompatParcelizer(z5);
        this.AudioAttributesCompatParcelizer = writeVar;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j2;
        this.RemoteActionCompatParcelizer = j3;
        this.read = j4;
        this.write = z;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.AudioAttributesImplApi26Parcelizer = z3;
        this.IconCompatParcelizer = z4;
    }

    public final POJONode AudioAttributesCompatParcelizer(long j) {
        return j == this.AudioAttributesImplApi21Parcelizer ? this : new POJONode(this.AudioAttributesCompatParcelizer, j, this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.read, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer);
    }

    public final POJONode IconCompatParcelizer(long j) {
        return j == this.AudioAttributesImplBaseParcelizer ? this : new POJONode(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, j, this.RemoteActionCompatParcelizer, this.read, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        POJONode pOJONode = (POJONode) obj;
        return this.AudioAttributesImplApi21Parcelizer == pOJONode.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == pOJONode.AudioAttributesImplBaseParcelizer && this.RemoteActionCompatParcelizer == pOJONode.RemoteActionCompatParcelizer && this.read == pOJONode.read && this.write == pOJONode.write && this.MediaBrowserCompatCustomActionResultReceiver == pOJONode.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == pOJONode.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == pOJONode.IconCompatParcelizer && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, pOJONode.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int i = (int) this.AudioAttributesImplApi21Parcelizer;
        int i2 = (int) this.AudioAttributesImplBaseParcelizer;
        int i3 = (int) this.RemoteActionCompatParcelizer;
        return ((((((((((((((((iHashCode + 527) * 31) + i) * 31) + i2) * 31) + i3) * 31) + ((int) this.read)) * 31) + (this.write ? 1 : 0)) * 31) + (this.MediaBrowserCompatCustomActionResultReceiver ? 1 : 0)) * 31) + (this.AudioAttributesImplApi26Parcelizer ? 1 : 0)) * 31) + (this.IconCompatParcelizer ? 1 : 0);
    }
}
