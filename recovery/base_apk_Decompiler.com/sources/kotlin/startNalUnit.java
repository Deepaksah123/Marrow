package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class startNalUnit extends readNalUnitData {
    private final String IconCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket read;
    private final File write;

    startNalUnit(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket, String str, File file) {
        if (fillbufferwithatleastonepacket == null) {
            throw new NullPointerException("Null report");
        }
        this.read = fillbufferwithatleastonepacket;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.IconCompatParcelizer = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.write = file;
    }

    @Override // kotlin.readNalUnitData
    public final fillBufferWithAtLeastOnePacket RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.readNalUnitData
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.readNalUnitData
    public final File AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        sb.append(this.read);
        sb.append(", sessionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", reportFile=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof readNalUnitData)) {
            return false;
        }
        readNalUnitData readnalunitdata = (readNalUnitData) obj;
        return this.read.equals(readnalunitdata.RemoteActionCompatParcelizer()) && this.IconCompatParcelizer.equals(readnalunitdata.IconCompatParcelizer()) && this.write.equals(readnalunitdata.AudioAttributesCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return this.write.hashCode() ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.IconCompatParcelizer.hashCode()) * 1000003);
    }
}
