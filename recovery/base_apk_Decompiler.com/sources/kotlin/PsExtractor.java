package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class PsExtractor extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write {
    private final int AudioAttributesCompatParcelizer;
    private final access102<fillBufferWithAtLeastOnePacket.write> IconCompatParcelizer;
    private final Boolean RemoteActionCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer read;
    private final access102<fillBufferWithAtLeastOnePacket.write> write;

    /* synthetic */ PsExtractor(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access102 access102Var, access102 access102Var2, Boolean bool, int i, byte b) {
        this(audioAttributesCompatParcelizer, access102Var, access102Var2, bool, i);
    }

    private PsExtractor(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access102<fillBufferWithAtLeastOnePacket.write> access102Var, access102<fillBufferWithAtLeastOnePacket.write> access102Var2, Boolean bool, int i) {
        this.read = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = access102Var;
        this.write = access102Var2;
        this.RemoteActionCompatParcelizer = bool;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final access102<fillBufferWithAtLeastOnePacket.write> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final access102<fillBufferWithAtLeastOnePacket.write> read() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final Boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.read);
        sb.append(", customAttributes=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", internalKeys=");
        sb.append(this.write);
        sb.append(", background=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", uiOrientation=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write) obj;
        if (!this.read.equals(writeVar.IconCompatParcelizer())) {
            return false;
        }
        access102<fillBufferWithAtLeastOnePacket.write> access102Var = this.IconCompatParcelizer;
        if (access102Var == null) {
            if (writeVar.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!access102Var.equals(writeVar.RemoteActionCompatParcelizer())) {
            return false;
        }
        access102<fillBufferWithAtLeastOnePacket.write> access102Var2 = this.write;
        if (access102Var2 == null) {
            if (writeVar.read() != null) {
                return false;
            }
        } else if (!access102Var2.equals(writeVar.read())) {
            return false;
        }
        Boolean bool = this.RemoteActionCompatParcelizer;
        if (bool == null) {
            if (writeVar.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!bool.equals(writeVar.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return this.AudioAttributesCompatParcelizer == writeVar.write();
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        access102<fillBufferWithAtLeastOnePacket.write> access102Var = this.IconCompatParcelizer;
        int iHashCode2 = access102Var == null ? 0 : access102Var.hashCode();
        access102<fillBufferWithAtLeastOnePacket.write> access102Var2 = this.write;
        int iHashCode3 = access102Var2 == null ? 0 : access102Var2.hashCode();
        Boolean bool = this.RemoteActionCompatParcelizer;
        return this.AudioAttributesCompatParcelizer ^ ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (bool != null ? bool.hashCode() : 0)) * 1000003);
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return new read(this, (byte) 0);
    }

    static final class read extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer {
        private Integer AudioAttributesCompatParcelizer;
        private access102<fillBufferWithAtLeastOnePacket.write> IconCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        private access102<fillBufferWithAtLeastOnePacket.write> read;
        private Boolean write;

        /* synthetic */ read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar, byte b) {
            this(writeVar);
        }

        read() {
        }

        private read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write writeVar) {
            this.RemoteActionCompatParcelizer = writeVar.IconCompatParcelizer();
            this.IconCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
            this.read = writeVar.read();
            this.write = writeVar.AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer = Integer.valueOf(writeVar.write());
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer RemoteActionCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (audioAttributesCompatParcelizer == null) {
                throw new NullPointerException("Null execution");
            }
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer AudioAttributesCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.write> access102Var) {
            this.IconCompatParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer IconCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.write> access102Var) {
            this.read = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer RemoteActionCompatParcelizer(Boolean bool) {
            this.write = bool;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write RemoteActionCompatParcelizer() {
            String string;
            if (this.RemoteActionCompatParcelizer != null) {
                string = "";
            } else {
                string = " execution";
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" uiOrientation");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new PsExtractor(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer.intValue(), (byte) 0);
        }
    }
}
