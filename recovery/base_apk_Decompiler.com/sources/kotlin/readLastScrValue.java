package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readLastScrValue extends fillBufferWithAtLeastOnePacket {
    private final String AudioAttributesCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.read AudioAttributesImplApi21Parcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.IconCompatParcelizer read;
    private final String write;

    /* synthetic */ readLastScrValue(String str, String str2, int i, String str3, String str4, String str5, String str6, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer, fillBufferWithAtLeastOnePacket.read readVar, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(str, str2, i, str3, str4, str5, str6, remoteActionCompatParcelizer, readVar, iconCompatParcelizer);
    }

    private readLastScrValue(String str, String str2, int i, String str3, String str4, String str5, String str6, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer, fillBufferWithAtLeastOnePacket.read readVar, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.IconCompatParcelizer = str4;
        this.write = str5;
        this.RemoteActionCompatParcelizer = str6;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = readVar;
        this.read = iconCompatParcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final fillBufferWithAtLeastOnePacket.read AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    public final fillBufferWithAtLeastOnePacket.IconCompatParcelizer read() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReport{sdkVersion=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", gmpAppId=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", platform=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", installationUuid=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", firebaseInstallationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", buildVersion=");
        sb.append(this.write);
        sb.append(", displayVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", session=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", ndkPayload=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", appExitInfo=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket = (fillBufferWithAtLeastOnePacket) obj;
        if (!this.MediaBrowserCompatItemReceiver.equals(fillbufferwithatleastonepacket.MediaBrowserCompatItemReceiver()) || !this.AudioAttributesCompatParcelizer.equals(fillbufferwithatleastonepacket.RemoteActionCompatParcelizer()) || this.MediaBrowserCompatCustomActionResultReceiver != fillbufferwithatleastonepacket.MediaBrowserCompatCustomActionResultReceiver() || !this.AudioAttributesImplBaseParcelizer.equals(fillbufferwithatleastonepacket.AudioAttributesImplApi21Parcelizer())) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null) {
            if (fillbufferwithatleastonepacket.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(fillbufferwithatleastonepacket.IconCompatParcelizer())) {
            return false;
        }
        if (!this.write.equals(fillbufferwithatleastonepacket.AudioAttributesCompatParcelizer()) || !this.RemoteActionCompatParcelizer.equals(fillbufferwithatleastonepacket.write())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (remoteActionCompatParcelizer == null) {
            if (fillbufferwithatleastonepacket.AudioAttributesImplApi26Parcelizer() != null) {
                return false;
            }
        } else if (!remoteActionCompatParcelizer.equals(fillbufferwithatleastonepacket.AudioAttributesImplApi26Parcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.read readVar = this.AudioAttributesImplApi21Parcelizer;
        if (readVar == null) {
            if (fillbufferwithatleastonepacket.AudioAttributesImplBaseParcelizer() != null) {
                return false;
            }
        } else if (!readVar.equals(fillbufferwithatleastonepacket.AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer == null) {
            if (fillbufferwithatleastonepacket.read() != null) {
                return false;
            }
        } else if (!iconCompatParcelizer.equals(fillbufferwithatleastonepacket.read())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode3 = this.AudioAttributesImplBaseParcelizer.hashCode();
        String str = this.IconCompatParcelizer;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.write.hashCode();
        int iHashCode6 = this.RemoteActionCompatParcelizer.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode7 = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
        fillBufferWithAtLeastOnePacket.read readVar = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode8 = readVar == null ? 0 : readVar.hashCode();
        fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer = this.read;
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ (iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0);
    }

    @Override // kotlin.fillBufferWithAtLeastOnePacket
    protected final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem() {
        return new AudioAttributesCompatParcelizer(this, (byte) 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class AudioAttributesCompatParcelizer extends fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private Integer AudioAttributesImplApi21Parcelizer;
        private fillBufferWithAtLeastOnePacket.read AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private String RemoteActionCompatParcelizer;
        private String read;
        private fillBufferWithAtLeastOnePacket.IconCompatParcelizer write;

        /* synthetic */ AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket, byte b) {
            this(fillbufferwithatleastonepacket);
        }

        AudioAttributesCompatParcelizer() {
        }

        private AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket) {
            this.AudioAttributesImplBaseParcelizer = fillbufferwithatleastonepacket.MediaBrowserCompatItemReceiver();
            this.read = fillbufferwithatleastonepacket.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = Integer.valueOf(fillbufferwithatleastonepacket.MediaBrowserCompatCustomActionResultReceiver());
            this.MediaBrowserCompatItemReceiver = fillbufferwithatleastonepacket.AudioAttributesImplApi21Parcelizer();
            this.RemoteActionCompatParcelizer = fillbufferwithatleastonepacket.IconCompatParcelizer();
            this.IconCompatParcelizer = fillbufferwithatleastonepacket.AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer = fillbufferwithatleastonepacket.write();
            this.MediaBrowserCompatCustomActionResultReceiver = fillbufferwithatleastonepacket.AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesImplApi26Parcelizer = fillbufferwithatleastonepacket.AudioAttributesImplBaseParcelizer();
            this.write = fillbufferwithatleastonepacket.read();
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.AudioAttributesImplBaseParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.read = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplApi21Parcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer read(String str) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer write(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer read(fillBufferWithAtLeastOnePacket.read readVar) {
            this.AudioAttributesImplApi26Parcelizer = readVar;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer
        public final fillBufferWithAtLeastOnePacket IconCompatParcelizer() {
            String string;
            if (this.AudioAttributesImplBaseParcelizer != null) {
                string = "";
            } else {
                string = " sdkVersion";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" gmpAppId");
                string = sb.toString();
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" platform");
                string = sb2.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" installationUuid");
                string = sb3.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" buildVersion");
                string = sb4.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string);
                sb5.append(" displayVersion");
                string = sb5.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readLastScrValue(this.AudioAttributesImplBaseParcelizer, this.read, this.AudioAttributesImplApi21Parcelizer.intValue(), this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, (byte) 0);
        }
    }
}
