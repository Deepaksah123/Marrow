package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class TsBinarySearchSeeker extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer {
    private final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final String write;

    /* synthetic */ TsBinarySearchSeeker(String str, int i, access102 access102Var, byte b) {
        this(str, i, access102Var);
    }

    private TsBinarySearchSeeker(String str, int i, access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> access102Var) {
        this.write = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = access102Var;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer
    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer
    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer
    public final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.write);
        sb.append(", importance=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", frames=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer abstractC0073AudioAttributesCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer) obj;
        return this.write.equals(abstractC0073AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) && this.RemoteActionCompatParcelizer == abstractC0073AudioAttributesCompatParcelizer.write() && this.IconCompatParcelizer.equals(abstractC0073AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return this.IconCompatParcelizer.hashCode() ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003);
    }

    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read {
        private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        private Integer IconCompatParcelizer;
        private String read;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read write(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read AudioAttributesCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> access102Var) {
            if (access102Var == null) {
                throw new NullPointerException("Null frames");
            }
            this.AudioAttributesCompatParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0076read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " name";
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" importance");
                string = sb.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" frames");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new TsBinarySearchSeeker(this.read, this.IconCompatParcelizer.intValue(), this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
