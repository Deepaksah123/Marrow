package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class finishReadDuration extends fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    /* synthetic */ finishReadDuration(String str, String str2, String str3, byte b) {
        this(str, str2, str3);
    }

    private finishReadDuration(String str, String str2, String str3) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read
    public final String IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read
    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.write);
        sb.append(", libraryName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", buildId=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read readVar = (fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read) obj;
        return this.write.equals(readVar.IconCompatParcelizer()) && this.RemoteActionCompatParcelizer.equals(readVar.RemoteActionCompatParcelizer()) && this.AudioAttributesCompatParcelizer.equals(readVar.write());
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return this.AudioAttributesCompatParcelizer.hashCode() ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write {
        private String AudioAttributesCompatParcelizer;
        private String read;
        private String write;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write write(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write read(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read IconCompatParcelizer() {
            String string;
            if (this.AudioAttributesCompatParcelizer != null) {
                string = "";
            } else {
                string = " arch";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" libraryName");
                string = sb.toString();
            }
            if (this.write == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" buildId");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new finishReadDuration(this.AudioAttributesCompatParcelizer, this.read, this.write, (byte) 0);
        }
    }
}
