package kotlin;

import java.util.Set;
import kotlin.renewLicense;

/* JADX INFO: loaded from: classes5.dex */
final class OfflineLicenseHelperExternalSyntheticLambda2 extends renewLicense.RemoteActionCompatParcelizer {
    private final long AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final Set<renewLicense.write> read;

    /* synthetic */ OfflineLicenseHelperExternalSyntheticLambda2(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    private OfflineLicenseHelperExternalSyntheticLambda2(long j, long j2, Set<renewLicense.write> set) {
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = set;
    }

    @Override // o.renewLicense.RemoteActionCompatParcelizer
    final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.renewLicense.RemoteActionCompatParcelizer
    final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.renewLicense.RemoteActionCompatParcelizer
    final Set<renewLicense.write> write() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", maxAllowedDelay=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", flags=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof renewLicense.RemoteActionCompatParcelizer)) {
            return false;
        }
        renewLicense.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (renewLicense.RemoteActionCompatParcelizer) obj;
        return this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() && this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.read() && this.read.equals(remoteActionCompatParcelizer.write());
    }

    public final int hashCode() {
        long j = this.AudioAttributesCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        return this.read.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    static final class IconCompatParcelizer extends renewLicense.RemoteActionCompatParcelizer.write {
        private Set<renewLicense.write> AudioAttributesCompatParcelizer;
        private Long RemoteActionCompatParcelizer;
        private Long read;

        IconCompatParcelizer() {
        }

        @Override // o.renewLicense.RemoteActionCompatParcelizer.write
        public final renewLicense.RemoteActionCompatParcelizer.write AudioAttributesCompatParcelizer(long j) {
            this.read = Long.valueOf(j);
            return this;
        }

        @Override // o.renewLicense.RemoteActionCompatParcelizer.write
        public final renewLicense.RemoteActionCompatParcelizer.write AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer = 86400000L;
            return this;
        }

        @Override // o.renewLicense.RemoteActionCompatParcelizer.write
        public final renewLicense.RemoteActionCompatParcelizer.write write(Set<renewLicense.write> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.AudioAttributesCompatParcelizer = set;
            return this;
        }

        @Override // o.renewLicense.RemoteActionCompatParcelizer.write
        public final renewLicense.RemoteActionCompatParcelizer read() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " delta";
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" maxAllowedDelay");
                string = sb.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" flags");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new OfflineLicenseHelperExternalSyntheticLambda2(this.read.longValue(), this.RemoteActionCompatParcelizer.longValue(), this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
