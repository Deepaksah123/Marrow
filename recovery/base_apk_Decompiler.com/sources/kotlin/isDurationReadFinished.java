package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class isDurationReadFinished extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer {
    private final String AudioAttributesCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* synthetic */ isDurationReadFinished(String str, String str2, String str3, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str4, String str5, String str6, byte b) {
        this(str, str2, str3, audioAttributesCompatParcelizer, str4, str5, str6);
    }

    private isDurationReadFinished(String str, String str2, String str3, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str4, String str5, String str6) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.write = str3;
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
        this.read = str4;
        this.IconCompatParcelizer = str5;
        this.AudioAttributesCompatParcelizer = str6;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String read() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", version=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", displayVersion=");
        sb.append(this.write);
        sb.append(", organization=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", installationUuid=");
        sb.append(this.read);
        sb.append(", developmentPlatform=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", developmentPlatformVersion=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer) obj;
        if (!this.RemoteActionCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer()) || !this.AudioAttributesImplApi26Parcelizer.equals(iconCompatParcelizer.AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        String str = this.write;
        if (str == null) {
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (audioAttributesCompatParcelizer == null) {
            if (iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() != null) {
                return false;
            }
        } else if (!audioAttributesCompatParcelizer.equals(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver())) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null) {
            if (iconCompatParcelizer.read() != null) {
                return false;
            }
        } else if (!str2.equals(iconCompatParcelizer.read())) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null) {
            if (iconCompatParcelizer.write() != null) {
                return false;
            }
        } else if (!str3.equals(iconCompatParcelizer.write())) {
            return false;
        }
        String str4 = this.AudioAttributesCompatParcelizer;
        if (str4 == null) {
            if (iconCompatParcelizer.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str4.equals(iconCompatParcelizer.RemoteActionCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        String str = this.write;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode4 = audioAttributesCompatParcelizer == null ? 0 : audioAttributesCompatParcelizer.hashCode();
        String str2 = this.read;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IconCompatParcelizer;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AudioAttributesCompatParcelizer;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class write extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write {
        private String AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
        private String IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private String read;
        private String write;

        write() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write read(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write AudioAttributesImplApi26Parcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write IconCompatParcelizer(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write write(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write AudioAttributesCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write RemoteActionCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer AudioAttributesCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " identifier";
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" version");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new isDurationReadFinished(this.read, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, (byte) 0);
        }
    }
}
