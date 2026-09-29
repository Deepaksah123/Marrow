package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class TsDurationReader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final long read;

    /* synthetic */ TsDurationReader(String str, String str2, long j, byte b) {
        this(str, str2, j);
    }

    private TsDurationReader(String str, String str2, long j) {
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = j;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer
    public final String write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer
    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", code=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", address=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer) obj;
        return this.AudioAttributesCompatParcelizer.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer()) && this.IconCompatParcelizer.equals(iconCompatParcelizer.write()) && this.read == iconCompatParcelizer.IconCompatParcelizer();
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        long j = this.read;
        return ((int) (j ^ (j >>> 32))) ^ ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003);
    }

    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer {
        private String IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private Long read;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer write(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.read = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.AbstractC0077IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer read() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " name";
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" code");
                string = sb.toString();
            }
            if (this.read == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" address");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new TsDurationReader(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read.longValue(), (byte) 0);
        }
    }
}
