package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readFirstScrValue extends fillBufferWithAtLeastOnePacket.write {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    /* synthetic */ readFirstScrValue(String str, String str2, byte b) {
        this(str, str2);
    }

    private readFirstScrValue(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.write
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.write
    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.write)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.write writeVar = (fillBufferWithAtLeastOnePacket.write) obj;
        return this.RemoteActionCompatParcelizer.equals(writeVar.RemoteActionCompatParcelizer()) && this.IconCompatParcelizer.equals(writeVar.write());
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ ((this.RemoteActionCompatParcelizer.hashCode() ^ 1000003) * 1000003);
    }

    static final class write extends fillBufferWithAtLeastOnePacket.write.read {
        private String IconCompatParcelizer;
        private String write;

        write() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.write.read
        public final fillBufferWithAtLeastOnePacket.write.read RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.write.read
        public final fillBufferWithAtLeastOnePacket.write.read AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.write.read
        public final fillBufferWithAtLeastOnePacket.write RemoteActionCompatParcelizer() {
            String string;
            if (this.write != null) {
                string = "";
            } else {
                string = " key";
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" value");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readFirstScrValue(this.write, this.IconCompatParcelizer, (byte) 0);
        }
    }
}
