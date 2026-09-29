package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class SectionReader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer {
    private final fillBufferWithAtLeastOnePacket.IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write IconCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer RemoteActionCompatParcelizer;
    private final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> read;
    private final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> write;

    /* synthetic */ SectionReader(access102 access102Var, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer2, access102 access102Var2, byte b) {
        this(access102Var, abstractC0081write, iconCompatParcelizer, iconCompatParcelizer2, access102Var2);
    }

    private SectionReader(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> access102Var, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer2, access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> access102Var2) {
        this.write = access102Var;
        this.IconCompatParcelizer = abstractC0081write;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer2;
        this.read = access102Var2;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer
    public final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer
    public final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> write() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.write);
        sb.append(", exception=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", appExitInfo=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", signal=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", binaries=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer) obj;
        access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> access102Var = this.write;
        if (access102Var == null) {
            if (audioAttributesCompatParcelizer.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!access102Var.equals(audioAttributesCompatParcelizer.IconCompatParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write = this.IconCompatParcelizer;
        if (abstractC0081write == null) {
            if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!abstractC0081write.equals(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
        if (iconCompatParcelizer == null) {
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!iconCompatParcelizer.equals(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer())) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(audioAttributesCompatParcelizer.read()) && this.read.equals(audioAttributesCompatParcelizer.write());
    }

    public final int hashCode() {
        access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> access102Var = this.write;
        int iHashCode = access102Var == null ? 0 : access102Var.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write = this.IconCompatParcelizer;
        int iHashCode2 = abstractC0081write == null ? 0 : abstractC0081write.hashCode();
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
        return this.read.hashCode() ^ ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0)) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }

    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer {
        private fillBufferWithAtLeastOnePacket.IconCompatParcelizer AudioAttributesCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write IconCompatParcelizer;
        private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;
        private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> read;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer write;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer RemoteActionCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> access102Var) {
            this.RemoteActionCompatParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write) {
            this.IconCompatParcelizer = abstractC0081write;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer IconCompatParcelizer(fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer IconCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) {
            if (iconCompatParcelizer == null) {
                throw new NullPointerException("Null signal");
            }
            this.write = iconCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer read(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> access102Var) {
            if (access102Var == null) {
                throw new NullPointerException("Null binaries");
            }
            this.read = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0078RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer write() {
            String string;
            if (this.write != null) {
                string = "";
            } else {
                string = " signal";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" binaries");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new SectionReader(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read, (byte) 0);
        }
    }
}
