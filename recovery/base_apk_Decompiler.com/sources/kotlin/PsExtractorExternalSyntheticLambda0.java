package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class PsExtractorExternalSyntheticLambda0 extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read {
    private final long AudioAttributesCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer IconCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write RemoteActionCompatParcelizer;
    private final String read;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer write;

    /* synthetic */ PsExtractorExternalSyntheticLambda0(long j, String str, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer abstractC0071RemoteActionCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(j, str, writeVar, abstractC0071RemoteActionCompatParcelizer, iconCompatParcelizer);
    }

    private PsExtractorExternalSyntheticLambda0(long j, String str, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer abstractC0071RemoteActionCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = j;
        this.read = str;
        this.RemoteActionCompatParcelizer = writeVar;
        this.write = abstractC0071RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer write() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{timestamp=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", type=");
        sb.append(this.read);
        sb.append(", app=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", device=");
        sb.append(this.write);
        sb.append(", log=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read) obj;
        if (this.AudioAttributesCompatParcelizer != readVar.read() || !this.read.equals(readVar.RemoteActionCompatParcelizer()) || !this.RemoteActionCompatParcelizer.equals(readVar.AudioAttributesCompatParcelizer()) || !this.write.equals(readVar.write())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer == null) {
            if (readVar.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!iconCompatParcelizer.equals(readVar.IconCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.AudioAttributesCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        return (iconCompatParcelizer == null ? 0 : iconCompatParcelizer.hashCode()) ^ ((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003);
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read AudioAttributesImplApi26Parcelizer() {
        return new IconCompatParcelizer(this, (byte) 0);
    }

    static final class IconCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read {
        private Long AudioAttributesCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer IconCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write RemoteActionCompatParcelizer;
        private String read;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer write;

        /* synthetic */ IconCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar, byte b) {
            this(readVar);
        }

        IconCompatParcelizer() {
        }

        private IconCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar) {
            this.AudioAttributesCompatParcelizer = Long.valueOf(readVar.read());
            this.read = readVar.RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = readVar.write();
            this.write = readVar.IconCompatParcelizer();
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read IconCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read write(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read IconCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar) {
            if (writeVar == null) {
                throw new NullPointerException("Null app");
            }
            this.RemoteActionCompatParcelizer = writeVar;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read write(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer abstractC0071RemoteActionCompatParcelizer) {
            if (abstractC0071RemoteActionCompatParcelizer == null) {
                throw new NullPointerException("Null device");
            }
            this.IconCompatParcelizer = abstractC0071RemoteActionCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read AudioAttributesCompatParcelizer() {
            String string;
            if (this.AudioAttributesCompatParcelizer != null) {
                string = "";
            } else {
                string = " timestamp";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" type");
                string = sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" app");
                string = sb2.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" device");
                string = sb3.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new PsExtractorExternalSyntheticLambda0(this.AudioAttributesCompatParcelizer.longValue(), this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, (byte) 0);
        }
    }
}
