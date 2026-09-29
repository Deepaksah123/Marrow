package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readLastPcrValue extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver {
    private final String write;

    /* synthetic */ readLastPcrValue(String str, byte b) {
        this(str);
    }

    private readLastPcrValue(String str) {
        this.write = str;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver
    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User{identifier=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
            return this.write.equals(((fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) obj).RemoteActionCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        return this.write.hashCode() ^ 1000003;
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read {
        private String AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read write(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver read() {
            String str;
            if (this.AudioAttributesCompatParcelizer != null) {
                str = "";
            } else {
                str = " identifier";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new readLastPcrValue(this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
