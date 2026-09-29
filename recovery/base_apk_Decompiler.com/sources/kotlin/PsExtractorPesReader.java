package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class PsExtractorPesReader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;
    private final int read;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write write;

    /* synthetic */ PsExtractorPesReader(String str, String str2, access102 access102Var, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write, int i, byte b) {
        this(str, str2, access102Var, abstractC0081write, i);
    }

    private PsExtractorPesReader(String str, String str2, access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> access102Var, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write, int i) {
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = access102Var;
        this.write = abstractC0081write;
        this.read = i;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write
    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write
    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write
    public final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write read() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write
    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", reason=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", frames=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", causedBy=");
        sb.append(this.write);
        sb.append(", overflowCount=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write) obj;
        if (!this.AudioAttributesCompatParcelizer.equals(abstractC0081write.write())) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null) {
            if (abstractC0081write.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0081write.RemoteActionCompatParcelizer())) {
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.equals(abstractC0081write.AudioAttributesCompatParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write2 = this.write;
        if (abstractC0081write2 == null) {
            if (abstractC0081write.read() != null) {
                return false;
            }
        } else if (!abstractC0081write2.equals(abstractC0081write.read())) {
            return false;
        }
        return this.read == abstractC0081write.IconCompatParcelizer();
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        String str = this.IconCompatParcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write = this.write;
        return this.read ^ ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (abstractC0081write != null ? abstractC0081write.hashCode() : 0)) * 1000003);
    }

    static final class IconCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer {
        private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        private String IconCompatParcelizer;
        private Integer RemoteActionCompatParcelizer;
        private String read;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write write;

        IconCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer read(String str) {
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> access102Var) {
            if (access102Var == null) {
                throw new NullPointerException("Null frames");
            }
            this.AudioAttributesCompatParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer IconCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write abstractC0081write) {
            this.write = abstractC0081write;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer write(int i) {
            this.RemoteActionCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write AudioAttributesCompatParcelizer() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " type";
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" frames");
                string = sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" overflowCount");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new PsExtractorPesReader(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer.intValue(), (byte) 0);
        }
    }
}
