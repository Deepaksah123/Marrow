package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class processH264FmtpAttribute {
    private final onInterleavedBinaryDataReceived AudioAttributesCompatParcelizer;
    private final parseNextLine RemoteActionCompatParcelizer;
    private final boolean read;

    private processH264FmtpAttribute(onInterleavedBinaryDataReceived oninterleavedbinarydatareceived, parseNextLine parsenextline, boolean z) {
        this.AudioAttributesCompatParcelizer = oninterleavedbinarydatareceived;
        this.RemoteActionCompatParcelizer = parsenextline;
        this.read = z;
    }

    public final onInterleavedBinaryDataReceived RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final parseNextLine read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public processH264FmtpAttribute(onInterleavedBinaryDataReceived oninterleavedbinarydatareceived) {
        this(oninterleavedbinarydatareceived, null, true);
        toMagicModuleMetaRepoModel.write(oninterleavedbinarydatareceived, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public processH264FmtpAttribute(parseNextLine parsenextline) {
        this(null, parsenextline, false);
        toMagicModuleMetaRepoModel.write(parsenextline, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof processH264FmtpAttribute)) {
            return false;
        }
        processH264FmtpAttribute processh264fmtpattribute = (processH264FmtpAttribute) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, processh264fmtpattribute.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, processh264fmtpattribute.RemoteActionCompatParcelizer) && this.read == processh264fmtpattribute.read;
    }

    public final int hashCode() {
        onInterleavedBinaryDataReceived oninterleavedbinarydatareceived = this.AudioAttributesCompatParcelizer;
        int iHashCode = oninterleavedbinarydatareceived == null ? 0 : oninterleavedbinarydatareceived.hashCode();
        parseNextLine parsenextline = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + (parsenextline != null ? parsenextline.hashCode() : 0)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        onInterleavedBinaryDataReceived oninterleavedbinarydatareceived = this.AudioAttributesCompatParcelizer;
        parseNextLine parsenextline = this.RemoteActionCompatParcelizer;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("AttestationDataResult(successData=");
        sb.append(oninterleavedbinarydatareceived);
        sb.append(", failureException=");
        sb.append(parsenextline);
        sb.append(", isSuccess=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
