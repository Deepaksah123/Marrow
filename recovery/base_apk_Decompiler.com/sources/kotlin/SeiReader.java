package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class SeiReader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer {
    private final String read;

    /* synthetic */ SeiReader(String str, byte b) {
        this(str);
    }

    private SeiReader(String str) {
        this.read = str;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Log{content=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer) {
            return this.read.equals(((fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer) obj).AudioAttributesCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode() ^ 1000003;
    }

    static final class read extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.AbstractC0070IconCompatParcelizer {
        private String write;

        read() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.AbstractC0070IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.AbstractC0070IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.AbstractC0070IconCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer AudioAttributesCompatParcelizer() {
            String str;
            if (this.write != null) {
                str = "";
            } else {
                str = " content";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new SeiReader(this.write, (byte) 0);
        }
    }
}
