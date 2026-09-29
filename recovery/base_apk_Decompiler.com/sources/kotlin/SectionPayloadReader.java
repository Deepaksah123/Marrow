package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class SectionPayloadReader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final long write;

    /* synthetic */ SectionPayloadReader(long j, long j2, String str, String str2, byte b) {
        this(j, j2, str, str2);
    }

    private SectionPayloadReader(long j, long j2, String str, String str2) {
        this.IconCompatParcelizer = j;
        this.write = j2;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read
    public final long read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read
    public final long IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read
    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", size=");
        sb.append(this.write);
        sb.append(", name=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", uuid=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read abstractC0079read = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read) obj;
        if (this.IconCompatParcelizer != abstractC0079read.read() || this.write != abstractC0079read.IconCompatParcelizer() || !this.RemoteActionCompatParcelizer.equals(abstractC0079read.write())) {
            return false;
        }
        String str = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            if (abstractC0079read.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0079read.RemoteActionCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.write;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        return (str == null ? 0 : str.hashCode()) ^ ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003);
    }

    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private Long IconCompatParcelizer;
        private String read;
        private Long write;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer read(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.write = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AbstractC0080RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read read() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " baseAddress";
            }
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" size");
                string = sb.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" name");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new SectionPayloadReader(this.IconCompatParcelizer.longValue(), this.write.longValue(), this.AudioAttributesCompatParcelizer, this.read, (byte) 0);
        }
    }
}
