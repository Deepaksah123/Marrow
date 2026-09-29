package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class getScrTimestampAdjuster extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer {
    private final String write;

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer
    public final String write() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization{clsId=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer)) {
            return false;
        }
        ((fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer) obj).write();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
