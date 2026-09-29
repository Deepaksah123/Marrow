package kotlin;

import kotlin.getLastOutputBufferPresentationTimeUs;

/* JADX INFO: loaded from: classes5.dex */
final class AsynchronousMediaCodecCallbackExternalSyntheticLambda0 extends getLastOutputBufferPresentationTimeUs {
    private final long IconCompatParcelizer;
    private final String read;
    private final long write;

    /* synthetic */ AsynchronousMediaCodecCallbackExternalSyntheticLambda0(String str, long j, long j2, byte b) {
        this(str, j, j2);
    }

    private AsynchronousMediaCodecCallbackExternalSyntheticLambda0(String str, long j, long j2) {
        this.read = str;
        this.IconCompatParcelizer = j;
        this.write = j2;
    }

    @Override // kotlin.getLastOutputBufferPresentationTimeUs
    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.getLastOutputBufferPresentationTimeUs
    public final long write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getLastOutputBufferPresentationTimeUs
    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.read);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getLastOutputBufferPresentationTimeUs)) {
            return false;
        }
        getLastOutputBufferPresentationTimeUs getlastoutputbufferpresentationtimeus = (getLastOutputBufferPresentationTimeUs) obj;
        return this.read.equals(getlastoutputbufferpresentationtimeus.AudioAttributesCompatParcelizer()) && this.IconCompatParcelizer == getlastoutputbufferpresentationtimeus.write() && this.write == getlastoutputbufferpresentationtimeus.RemoteActionCompatParcelizer();
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        long j = this.IconCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.write;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003);
    }

    static final class AudioAttributesCompatParcelizer extends getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer {
        private Long IconCompatParcelizer;
        private Long RemoteActionCompatParcelizer;
        private String read;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer
        public final getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer read(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.read = str;
            return this;
        }

        @Override // o.getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer
        public final getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer
        public final getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer write(long j) {
            this.RemoteActionCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.getLastOutputBufferPresentationTimeUs.RemoteActionCompatParcelizer
        public final getLastOutputBufferPresentationTimeUs read() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " token";
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" tokenExpirationTimestamp");
                string = sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" tokenCreationTimestamp");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AsynchronousMediaCodecCallbackExternalSyntheticLambda0(this.read, this.IconCompatParcelizer.longValue(), this.RemoteActionCompatParcelizer.longValue(), (byte) 0);
        }
    }
}
