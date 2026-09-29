package kotlin;

import kotlin.ExoMediaDrmProvisionRequest;

/* JADX INFO: loaded from: classes5.dex */
final class ExoMediaDrm extends ExoMediaDrmProvisionRequest {
    private final isMediaDrmStateException<?, byte[]> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final DrmSessionManagerDrmSessionReference RemoteActionCompatParcelizer;
    private final ExoMediaDrmProvider read;
    private final isNotProvisionedException<?> write;

    /* synthetic */ ExoMediaDrm(ExoMediaDrmProvider exoMediaDrmProvider, String str, isNotProvisionedException isnotprovisionedexception, isMediaDrmStateException ismediadrmstateexception, DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference, byte b) {
        this(exoMediaDrmProvider, str, isnotprovisionedexception, ismediadrmstateexception, drmSessionManagerDrmSessionReference);
    }

    private ExoMediaDrm(ExoMediaDrmProvider exoMediaDrmProvider, String str, isNotProvisionedException<?> isnotprovisionedexception, isMediaDrmStateException<?, byte[]> ismediadrmstateexception, DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference) {
        this.read = exoMediaDrmProvider;
        this.IconCompatParcelizer = str;
        this.write = isnotprovisionedexception;
        this.AudioAttributesCompatParcelizer = ismediadrmstateexception;
        this.RemoteActionCompatParcelizer = drmSessionManagerDrmSessionReference;
    }

    @Override // kotlin.ExoMediaDrmProvisionRequest
    public final ExoMediaDrmProvider RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.ExoMediaDrmProvisionRequest
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmProvisionRequest
    final isNotProvisionedException<?> write() {
        return this.write;
    }

    @Override // kotlin.ExoMediaDrmProvisionRequest
    final isMediaDrmStateException<?, byte[]> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmProvisionRequest
    public final DrmSessionManagerDrmSessionReference AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.read);
        sb.append(", transportName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", event=");
        sb.append(this.write);
        sb.append(", transformer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", encoding=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExoMediaDrmProvisionRequest)) {
            return false;
        }
        ExoMediaDrmProvisionRequest exoMediaDrmProvisionRequest = (ExoMediaDrmProvisionRequest) obj;
        return this.read.equals(exoMediaDrmProvisionRequest.RemoteActionCompatParcelizer()) && this.IconCompatParcelizer.equals(exoMediaDrmProvisionRequest.IconCompatParcelizer()) && this.write.equals(exoMediaDrmProvisionRequest.write()) && this.AudioAttributesCompatParcelizer.equals(exoMediaDrmProvisionRequest.read()) && this.RemoteActionCompatParcelizer.equals(exoMediaDrmProvisionRequest.AudioAttributesCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() ^ ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ this.AudioAttributesCompatParcelizer.hashCode()) * 1000003);
    }

    static final class read extends ExoMediaDrmProvisionRequest.IconCompatParcelizer {
        private isMediaDrmStateException<?, byte[]> AudioAttributesCompatParcelizer;
        private isNotProvisionedException<?> IconCompatParcelizer;
        private ExoMediaDrmProvider RemoteActionCompatParcelizer;
        private String read;
        private DrmSessionManagerDrmSessionReference write;

        read() {
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        public final ExoMediaDrmProvisionRequest.IconCompatParcelizer read(ExoMediaDrmProvider exoMediaDrmProvider) {
            if (exoMediaDrmProvider == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.RemoteActionCompatParcelizer = exoMediaDrmProvider;
            return this;
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        public final ExoMediaDrmProvisionRequest.IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.read = str;
            return this;
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        final ExoMediaDrmProvisionRequest.IconCompatParcelizer RemoteActionCompatParcelizer(isNotProvisionedException<?> isnotprovisionedexception) {
            if (isnotprovisionedexception == null) {
                throw new NullPointerException("Null event");
            }
            this.IconCompatParcelizer = isnotprovisionedexception;
            return this;
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        final ExoMediaDrmProvisionRequest.IconCompatParcelizer AudioAttributesCompatParcelizer(isMediaDrmStateException<?, byte[]> ismediadrmstateexception) {
            if (ismediadrmstateexception == null) {
                throw new NullPointerException("Null transformer");
            }
            this.AudioAttributesCompatParcelizer = ismediadrmstateexception;
            return this;
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        final ExoMediaDrmProvisionRequest.IconCompatParcelizer AudioAttributesCompatParcelizer(DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference) {
            if (drmSessionManagerDrmSessionReference == null) {
                throw new NullPointerException("Null encoding");
            }
            this.write = drmSessionManagerDrmSessionReference;
            return this;
        }

        @Override // o.ExoMediaDrmProvisionRequest.IconCompatParcelizer
        public final ExoMediaDrmProvisionRequest IconCompatParcelizer() {
            String string;
            if (this.RemoteActionCompatParcelizer != null) {
                string = "";
            } else {
                string = " transportContext";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" transportName");
                string = sb.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" event");
                string = sb2.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" transformer");
                string = sb3.toString();
            }
            if (this.write == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" encoding");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new ExoMediaDrm(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, (byte) 0);
        }
    }
}
