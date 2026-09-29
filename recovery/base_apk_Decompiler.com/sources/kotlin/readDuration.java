package kotlin;

import java.util.Arrays;
import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readDuration extends fillBufferWithAtLeastOnePacket.read.AbstractC0083read {
    private final byte[] AudioAttributesCompatParcelizer;
    private final String read;

    /* synthetic */ readDuration(String str, byte[] bArr, byte b) {
        this(str, bArr);
    }

    private readDuration(String str, byte[] bArr) {
        this.read = str;
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.read.AbstractC0083read
    public final String write() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.read.AbstractC0083read
    public final byte[] IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("File{filename=");
        sb.append(this.read);
        sb.append(", contents=");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.read.AbstractC0083read)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.read.AbstractC0083read abstractC0083read = (fillBufferWithAtLeastOnePacket.read.AbstractC0083read) obj;
        if (this.read.equals(abstractC0083read.write())) {
            return Arrays.equals(this.AudioAttributesCompatParcelizer, abstractC0083read instanceof readDuration ? ((readDuration) abstractC0083read).AudioAttributesCompatParcelizer : abstractC0083read.IconCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AudioAttributesCompatParcelizer) ^ ((this.read.hashCode() ^ 1000003) * 1000003);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class write extends fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer {
        private byte[] RemoteActionCompatParcelizer;
        private String read;

        write() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer write(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer read(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.RemoteActionCompatParcelizer = bArr;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.read.AbstractC0083read AudioAttributesCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " filename";
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" contents");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readDuration(this.read, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
