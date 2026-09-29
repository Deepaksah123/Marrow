package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readScrValueFromPack extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer {
    private final String AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    /* synthetic */ readScrValueFromPack(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3, byte b) {
        this(i, str, i2, j, j2, z, i3, str2, str3);
    }

    private readScrValueFromPack(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = str;
        this.read = i2;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = i3;
        this.write = str2;
        this.MediaBrowserCompatItemReceiver = str3;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final int write() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final boolean MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", model=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", cores=");
        sb.append(this.read);
        sb.append(", ram=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", diskSpace=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", simulator=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", state=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", manufacturer=");
        sb.append(this.write);
        sb.append(", modelClass=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) obj;
        return this.IconCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() && this.AudioAttributesCompatParcelizer.equals(audioAttributesCompatParcelizer.read()) && this.read == audioAttributesCompatParcelizer.write() && this.AudioAttributesImplApi26Parcelizer == audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer() && this.AudioAttributesImplApi21Parcelizer == audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver() && this.AudioAttributesImplBaseParcelizer == audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer() && this.write.equals(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) && this.MediaBrowserCompatItemReceiver.equals(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer());
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int i2 = this.read;
        long j = this.AudioAttributesImplApi26Parcelizer;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.RemoteActionCompatParcelizer;
        int i4 = (int) ((j2 >>> 32) ^ j2);
        int i5 = this.AudioAttributesImplApi21Parcelizer ? 1231 : 1237;
        return this.MediaBrowserCompatItemReceiver.hashCode() ^ ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ this.AudioAttributesImplBaseParcelizer) * 1000003) ^ this.write.hashCode()) * 1000003);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class read extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read {
        private Long AudioAttributesCompatParcelizer;
        private Long AudioAttributesImplApi21Parcelizer;
        private Boolean AudioAttributesImplApi26Parcelizer;
        private Integer AudioAttributesImplBaseParcelizer;
        private Integer IconCompatParcelizer;
        private String MediaBrowserCompatItemReceiver;
        private Integer RemoteActionCompatParcelizer;
        private String read;
        private String write;

        read() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read read(int i) {
            this.IconCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read write(int i) {
            this.RemoteActionCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read RemoteActionCompatParcelizer(long j) {
            this.AudioAttributesImplApi21Parcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read read(long j) {
            this.AudioAttributesCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read read(boolean z) {
            this.AudioAttributesImplApi26Parcelizer = Boolean.valueOf(z);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read read(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read IconCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.read
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " arch";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" model");
                string = sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" cores");
                string = sb2.toString();
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ram");
                string = sb3.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" diskSpace");
                string = sb4.toString();
            }
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string);
                sb5.append(" simulator");
                string = sb5.toString();
            }
            if (this.AudioAttributesImplBaseParcelizer == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string);
                sb6.append(" state");
                string = sb6.toString();
            }
            if (this.write == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(string);
                sb7.append(" manufacturer");
                string = sb7.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(string);
                sb8.append(" modelClass");
                string = sb8.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readScrValueFromPack(this.IconCompatParcelizer.intValue(), this.read, this.RemoteActionCompatParcelizer.intValue(), this.AudioAttributesImplApi21Parcelizer.longValue(), this.AudioAttributesCompatParcelizer.longValue(), this.AudioAttributesImplApi26Parcelizer.booleanValue(), this.AudioAttributesImplBaseParcelizer.intValue(), this.write, this.MediaBrowserCompatItemReceiver, (byte) 0);
        }
    }
}
