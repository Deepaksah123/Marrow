package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readLastScrValueFromBuffer extends fillBufferWithAtLeastOnePacket.IconCompatParcelizer {
    private final access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    /* synthetic */ readLastScrValueFromBuffer(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, access102 access102Var, byte b) {
        this(i, str, i2, i3, j, j2, j3, str2, access102Var);
    }

    private readLastScrValueFromBuffer(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> access102Var) {
        this.IconCompatParcelizer = i;
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.read = i3;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j2;
        this.AudioAttributesImplApi21Parcelizer = j3;
        this.MediaBrowserCompatItemReceiver = str2;
        this.AudioAttributesCompatParcelizer = access102Var;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final int write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final long AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final long AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer
    public final access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", processName=");
        sb.append(this.write);
        sb.append(", reasonCode=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", importance=");
        sb.append(this.read);
        sb.append(", pss=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", rss=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", timestamp=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", traceFile=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", buildIdMappingForArch=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.IconCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer = (fillBufferWithAtLeastOnePacket.IconCompatParcelizer) obj;
        if (this.IconCompatParcelizer != iconCompatParcelizer.write() || !this.write.equals(iconCompatParcelizer.IconCompatParcelizer()) || this.MediaBrowserCompatCustomActionResultReceiver != iconCompatParcelizer.MediaBrowserCompatItemReceiver() || this.read != iconCompatParcelizer.RemoteActionCompatParcelizer() || this.RemoteActionCompatParcelizer != iconCompatParcelizer.read() || this.AudioAttributesImplBaseParcelizer != iconCompatParcelizer.AudioAttributesImplBaseParcelizer() || this.AudioAttributesImplApi21Parcelizer != iconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return false;
        }
        String str = this.MediaBrowserCompatItemReceiver;
        if (str == null) {
            if (iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() != null) {
                return false;
            }
        } else if (!str.equals(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver())) {
            return false;
        }
        access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> access102Var = this.AudioAttributesCompatParcelizer;
        if (access102Var == null) {
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!access102Var.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int iHashCode = this.write.hashCode();
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = this.read;
        long j = this.RemoteActionCompatParcelizer;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.AudioAttributesImplBaseParcelizer;
        int i5 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = (int) (j3 ^ (j3 >>> 32));
        String str = this.MediaBrowserCompatItemReceiver;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> access102Var = this.AudioAttributesCompatParcelizer;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ iHashCode2) * 1000003) ^ (access102Var != null ? access102Var.hashCode() : 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class IconCompatParcelizer extends fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write {
        private String AudioAttributesCompatParcelizer;
        private Integer AudioAttributesImplApi21Parcelizer;
        private Long AudioAttributesImplApi26Parcelizer;
        private Long IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private Long MediaBrowserCompatItemReceiver;
        private access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> RemoteActionCompatParcelizer;
        private Integer read;
        private Integer write;

        IconCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write AudioAttributesCompatParcelizer(int i) {
            this.read = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write write(int i) {
            this.AudioAttributesImplApi21Parcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write IconCompatParcelizer(int i) {
            this.write = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write IconCompatParcelizer(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write read(long j) {
            this.AudioAttributesImplApi26Parcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write AudioAttributesCompatParcelizer(long j) {
            this.MediaBrowserCompatItemReceiver = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write write(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write RemoteActionCompatParcelizer(access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> access102Var) {
            this.RemoteActionCompatParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer RemoteActionCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " pid";
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" processName");
                string = sb.toString();
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" reasonCode");
                string = sb2.toString();
            }
            if (this.write == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" importance");
                string = sb3.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" pss");
                string = sb4.toString();
            }
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string);
                sb5.append(" rss");
                string = sb5.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string);
                sb6.append(" timestamp");
                string = sb6.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readLastScrValueFromBuffer(this.read.intValue(), this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer.intValue(), this.write.intValue(), this.IconCompatParcelizer.longValue(), this.AudioAttributesImplApi26Parcelizer.longValue(), this.MediaBrowserCompatItemReceiver.longValue(), this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
