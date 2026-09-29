package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class TsBinarySearchSeekerTsPcrSeeker extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final long write;

    /* synthetic */ TsBinarySearchSeekerTsPcrSeeker(long j, String str, String str2, long j2, int i, byte b) {
        this(j, str, str2, j2, i);
    }

    private TsBinarySearchSeekerTsPcrSeeker(long j, String str, String str2, long j2, int i) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = j2;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer
    public final long IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer
    public final String write() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer
    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer
    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.write);
        sb.append(", symbol=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", file=");
        sb.append(this.read);
        sb.append(", offset=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", importance=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer abstractC0074AudioAttributesCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer) obj;
        if (this.write != abstractC0074AudioAttributesCompatParcelizer.IconCompatParcelizer() || !this.AudioAttributesCompatParcelizer.equals(abstractC0074AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        String str = this.read;
        if (str == null) {
            if (abstractC0074AudioAttributesCompatParcelizer.write() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0074AudioAttributesCompatParcelizer.write())) {
            return false;
        }
        return this.IconCompatParcelizer == abstractC0074AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer() && this.RemoteActionCompatParcelizer == abstractC0074AudioAttributesCompatParcelizer.read();
    }

    public final int hashCode() {
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        String str = this.read;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.IconCompatParcelizer;
        return this.RemoteActionCompatParcelizer ^ ((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    static final class write extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read {
        private Long AudioAttributesCompatParcelizer;
        private Long IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private Integer read;
        private String write;

        write() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read IconCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read AudioAttributesCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read write(long j) {
            this.AudioAttributesCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read read(int i) {
            this.read = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer read() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " pc";
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" symbol");
                string = sb.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" offset");
                string = sb2.toString();
            }
            if (this.read == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" importance");
                string = sb3.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new TsBinarySearchSeekerTsPcrSeeker(this.IconCompatParcelizer.longValue(), this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer.longValue(), this.read.intValue(), (byte) 0);
        }
    }
}
