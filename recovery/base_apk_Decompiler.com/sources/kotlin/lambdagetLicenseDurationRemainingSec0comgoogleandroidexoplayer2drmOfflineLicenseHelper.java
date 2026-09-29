package kotlin;

import java.util.Map;
import kotlin.renewLicense;

/* JADX INFO: loaded from: classes5.dex */
final class lambdagetLicenseDurationRemainingSec0comgoogleandroidexoplayer2drmOfflineLicenseHelper extends renewLicense {
    private final Map<DrmUtilApi21, renewLicense.RemoteActionCompatParcelizer> read;
    private final BinarySearchSeeker write;

    lambdagetLicenseDurationRemainingSec0comgoogleandroidexoplayer2drmOfflineLicenseHelper(BinarySearchSeeker binarySearchSeeker, Map<DrmUtilApi21, renewLicense.RemoteActionCompatParcelizer> map) {
        if (binarySearchSeeker == null) {
            throw new NullPointerException("Null clock");
        }
        this.write = binarySearchSeeker;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.read = map;
    }

    @Override // kotlin.renewLicense
    final BinarySearchSeeker RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.renewLicense
    final Map<DrmUtilApi21, renewLicense.RemoteActionCompatParcelizer> read() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.write);
        sb.append(", values=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof renewLicense)) {
            return false;
        }
        renewLicense renewlicense = (renewLicense) obj;
        return this.write.equals(renewlicense.RemoteActionCompatParcelizer()) && this.read.equals(renewlicense.read());
    }

    public final int hashCode() {
        return this.read.hashCode() ^ ((this.write.hashCode() ^ 1000003) * 1000003);
    }
}
