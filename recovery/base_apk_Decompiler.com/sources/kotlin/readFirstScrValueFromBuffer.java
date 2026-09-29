package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readFirstScrValueFromBuffer extends fillBufferWithAtLeastOnePacket.read {
    private final String AudioAttributesCompatParcelizer;
    private final access102<fillBufferWithAtLeastOnePacket.read.AbstractC0083read> RemoteActionCompatParcelizer;

    /* synthetic */ readFirstScrValueFromBuffer(access102 access102Var, String str, byte b) {
        this(access102Var, str);
    }

    private readFirstScrValueFromBuffer(access102<fillBufferWithAtLeastOnePacket.read.AbstractC0083read> access102Var, String str) {
        this.RemoteActionCompatParcelizer = access102Var;
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.read
    public final access102<fillBufferWithAtLeastOnePacket.read.AbstractC0083read> read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.read
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", orgId=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.read)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.read readVar = (fillBufferWithAtLeastOnePacket.read) obj;
        if (!this.RemoteActionCompatParcelizer.equals(readVar.read())) {
            return false;
        }
        String str = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            if (readVar.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(readVar.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        return (str == null ? 0 : str.hashCode()) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class write extends fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer {
        private access102<fillBufferWithAtLeastOnePacket.read.AbstractC0083read> read;
        private String write;

        write() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer write(access102<fillBufferWithAtLeastOnePacket.read.AbstractC0083read> access102Var) {
            if (access102Var == null) {
                throw new NullPointerException("Null files");
            }
            this.read = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read AudioAttributesCompatParcelizer() {
            String str;
            if (this.read != null) {
                str = "";
            } else {
                str = " files";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new readFirstScrValueFromBuffer(this.read, this.write, (byte) 0);
        }
    }
}
