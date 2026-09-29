package kotlin;

import kotlin.adjustMaxInputChannelCount;

/* JADX INFO: loaded from: classes5.dex */
final class createForAudioDecoding extends adjustMaxInputChannelCount {
    private final adjustMaxInputChannelCount.IconCompatParcelizer IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String write;

    /* synthetic */ createForAudioDecoding(String str, long j, adjustMaxInputChannelCount.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(str, j, iconCompatParcelizer);
    }

    private createForAudioDecoding(String str, long j, adjustMaxInputChannelCount.IconCompatParcelizer iconCompatParcelizer) {
        this.write = str;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    @Override // kotlin.adjustMaxInputChannelCount
    public final String read() {
        return this.write;
    }

    @Override // kotlin.adjustMaxInputChannelCount
    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.adjustMaxInputChannelCount
    public final adjustMaxInputChannelCount.IconCompatParcelizer write() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.write);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", responseCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adjustMaxInputChannelCount)) {
            return false;
        }
        adjustMaxInputChannelCount adjustmaxinputchannelcount = (adjustMaxInputChannelCount) obj;
        String str = this.write;
        if (str == null) {
            if (adjustmaxinputchannelcount.read() != null) {
                return false;
            }
        } else if (!str.equals(adjustmaxinputchannelcount.read())) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer != adjustmaxinputchannelcount.IconCompatParcelizer()) {
            return false;
        }
        adjustMaxInputChannelCount.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer == null) {
            if (adjustmaxinputchannelcount.write() != null) {
                return false;
            }
        } else if (!iconCompatParcelizer.equals(adjustmaxinputchannelcount.write())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.RemoteActionCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        adjustMaxInputChannelCount.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0);
    }

    static final class write extends adjustMaxInputChannelCount.write {
        private Long RemoteActionCompatParcelizer;
        private adjustMaxInputChannelCount.IconCompatParcelizer read;
        private String write;

        write() {
        }

        @Override // o.adjustMaxInputChannelCount.write
        public final adjustMaxInputChannelCount.write read(String str) {
            this.write = str;
            return this;
        }

        @Override // o.adjustMaxInputChannelCount.write
        public final adjustMaxInputChannelCount.write RemoteActionCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.adjustMaxInputChannelCount.write
        public final adjustMaxInputChannelCount.write AudioAttributesCompatParcelizer(adjustMaxInputChannelCount.IconCompatParcelizer iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
            return this;
        }

        @Override // o.adjustMaxInputChannelCount.write
        public final adjustMaxInputChannelCount write() {
            String str;
            if (this.RemoteActionCompatParcelizer != null) {
                str = "";
            } else {
                str = " tokenExpirationTimestamp";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new createForAudioDecoding(this.write, this.RemoteActionCompatParcelizer.longValue(), this.read, (byte) 0);
        }
    }
}
