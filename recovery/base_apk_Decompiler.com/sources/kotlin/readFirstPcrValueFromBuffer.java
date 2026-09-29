package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readFirstPcrValueFromBuffer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write {
    private final String AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    /* synthetic */ readFirstPcrValueFromBuffer(int i, String str, String str2, boolean z, byte b) {
        this(i, str, str2, z);
    }

    private readFirstPcrValueFromBuffer(int i, String str, String str2, boolean z) {
        this.read = i;
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write
    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write
    public final String write() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.read);
        sb.append(", version=");
        sb.append(this.write);
        sb.append(", buildVersion=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", jailbroken=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write) obj;
        return this.read == writeVar.RemoteActionCompatParcelizer() && this.write.equals(writeVar.write()) && this.AudioAttributesCompatParcelizer.equals(writeVar.AudioAttributesCompatParcelizer()) && this.RemoteActionCompatParcelizer == writeVar.IconCompatParcelizer();
    }

    public final int hashCode() {
        int i = this.read;
        int iHashCode = this.write.hashCode();
        return (this.RemoteActionCompatParcelizer ? 1231 : 1237) ^ ((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ this.AudioAttributesCompatParcelizer.hashCode()) * 1000003);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class IconCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer {
        private Integer AudioAttributesCompatParcelizer;
        private String IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private Boolean write;

        IconCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer write(boolean z) {
            this.write = Boolean.valueOf(z);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write write() {
            String string;
            if (this.AudioAttributesCompatParcelizer != null) {
                string = "";
            } else {
                string = " platform";
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" version");
                string = sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" buildVersion");
                string = sb2.toString();
            }
            if (this.write == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" jailbroken");
                string = sb3.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readFirstPcrValueFromBuffer(this.AudioAttributesCompatParcelizer.intValue(), this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write.booleanValue(), (byte) 0);
        }
    }
}
