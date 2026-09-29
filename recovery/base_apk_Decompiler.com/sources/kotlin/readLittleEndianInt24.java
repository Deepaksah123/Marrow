package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readLittleEndianInt24 {
    private final readShort AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;

    public readLittleEndianInt24(boolean z, readShort readshort) {
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = readshort;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final readShort RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readLittleEndianInt24)) {
            return false;
        }
        readLittleEndianInt24 readlittleendianint24 = (readLittleEndianInt24) obj;
        return this.IconCompatParcelizer == readlittleendianint24.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, readlittleendianint24.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
        readShort readshort = this.AudioAttributesCompatParcelizer;
        return (iHashCode * 31) + (readshort == null ? 0 : readshort.hashCode());
    }

    public final String toString() {
        boolean z = this.IconCompatParcelizer;
        readShort readshort = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("CreateOrderResponseUCModel(updateCollegeRequired=");
        sb.append(z);
        sb.append(", sdkPayloadParams=");
        sb.append(readshort);
        sb.append(")");
        return sb.toString();
    }
}
