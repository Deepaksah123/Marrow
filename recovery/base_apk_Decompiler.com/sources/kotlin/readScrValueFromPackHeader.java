package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class readScrValueFromPackHeader extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer {
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final Long IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write MediaBrowserCompatItemReceiver;
    private final long MediaDescriptionCompat;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer read;
    private final boolean write;

    /* synthetic */ readScrValueFromPackHeader(String str, String str2, String str3, long j, Long l, boolean z, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access102 access102Var, int i, byte b) {
        this(str, str2, str3, j, l, z, iconCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver, writeVar, audioAttributesCompatParcelizer, access102Var, i);
    }

    private readScrValueFromPackHeader(String str, String str2, String str3, long j, Long l, boolean z, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> access102Var, int i) {
        this.AudioAttributesImplBaseParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaDescriptionCompat = j;
        this.IconCompatParcelizer = l;
        this.write = z;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.RatingCompat = mediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatItemReceiver = writeVar;
        this.read = audioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = access102Var;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final Long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final boolean MediaMetadataCompat() {
        return this.write;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver RatingCompat() {
        return this.RatingCompat;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer write() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", identifier=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", appQualitySessionId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", startedAt=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", endedAt=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", crashed=");
        sb.append(this.write);
        sb.append(", app=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", user=");
        sb.append(this.RatingCompat);
        sb.append(", os=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", device=");
        sb.append(this.read);
        sb.append(", events=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", generatorType=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer) obj;
        if (!this.AudioAttributesImplBaseParcelizer.equals(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) || !this.AudioAttributesImplApi21Parcelizer.equals(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer())) {
            return false;
        }
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            if (remoteActionCompatParcelizer.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(remoteActionCompatParcelizer.IconCompatParcelizer())) {
            return false;
        }
        if (this.MediaDescriptionCompat != remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        Long l = this.IconCompatParcelizer;
        if (l == null) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!l.equals(remoteActionCompatParcelizer.RemoteActionCompatParcelizer())) {
            return false;
        }
        if (this.write != remoteActionCompatParcelizer.MediaMetadataCompat() || !this.AudioAttributesCompatParcelizer.equals(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.RatingCompat;
        if (mediaBrowserCompatCustomActionResultReceiver == null) {
            if (remoteActionCompatParcelizer.RatingCompat() != null) {
                return false;
            }
        } else if (!mediaBrowserCompatCustomActionResultReceiver.equals(remoteActionCompatParcelizer.RatingCompat())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar = this.MediaBrowserCompatItemReceiver;
        if (writeVar == null) {
            if (remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() != null) {
                return false;
            }
        } else if (!writeVar.equals(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read;
        if (audioAttributesCompatParcelizer == null) {
            if (remoteActionCompatParcelizer.write() != null) {
                return false;
            }
        } else if (!audioAttributesCompatParcelizer.equals(remoteActionCompatParcelizer.write())) {
            return false;
        }
        access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> access102Var = this.AudioAttributesImplApi26Parcelizer;
        if (access102Var == null) {
            if (remoteActionCompatParcelizer.read() != null) {
                return false;
            }
        } else if (!access102Var.equals(remoteActionCompatParcelizer.read())) {
            return false;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver == remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j = this.MediaDescriptionCompat;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.IconCompatParcelizer;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int i2 = this.write ? 1231 : 1237;
        int iHashCode5 = this.AudioAttributesCompatParcelizer.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.RatingCompat;
        int iHashCode6 = mediaBrowserCompatCustomActionResultReceiver == null ? 0 : mediaBrowserCompatCustomActionResultReceiver.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar = this.MediaBrowserCompatItemReceiver;
        int iHashCode7 = writeVar == null ? 0 : writeVar.hashCode();
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read;
        int iHashCode8 = audioAttributesCompatParcelizer == null ? 0 : audioAttributesCompatParcelizer.hashCode();
        access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> access102Var = this.AudioAttributesImplApi26Parcelizer;
        return this.MediaBrowserCompatCustomActionResultReceiver ^ ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i) * 1000003) ^ iHashCode4) * 1000003) ^ i2) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ (access102Var != null ? access102Var.hashCode() : 0)) * 1000003);
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer
    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer MediaDescriptionCompat() {
        return new read(this, (byte) 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class read extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer {
        private Long AudioAttributesCompatParcelizer;
        private String AudioAttributesImplApi21Parcelizer;
        private String AudioAttributesImplApi26Parcelizer;
        private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> AudioAttributesImplBaseParcelizer;
        private Boolean IconCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write MediaBrowserCompatCustomActionResultReceiver;
        private Integer MediaBrowserCompatItemReceiver;
        private Long MediaBrowserCompatMediaItem;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatSearchResultReceiver;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer RemoteActionCompatParcelizer;
        private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer read;
        private String write;

        /* synthetic */ read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
            this(remoteActionCompatParcelizer);
        }

        read() {
        }

        private read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            this.write = remoteActionCompatParcelizer.IconCompatParcelizer();
            this.MediaBrowserCompatMediaItem = Long.valueOf(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer = Boolean.valueOf(remoteActionCompatParcelizer.MediaMetadataCompat());
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer.RatingCompat();
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            this.read = remoteActionCompatParcelizer.write();
            this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.read();
            this.MediaBrowserCompatItemReceiver = Integer.valueOf(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer write(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer read(long j) {
            this.MediaBrowserCompatMediaItem = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Long l) {
            this.AudioAttributesCompatParcelizer = l;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(boolean z) {
            this.IconCompatParcelizer = Boolean.valueOf(z);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer write(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) {
            if (iconCompatParcelizer == null) {
                throw new NullPointerException("Null app");
            }
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatSearchResultReceiver = mediaBrowserCompatCustomActionResultReceiver;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write writeVar) {
            this.MediaBrowserCompatCustomActionResultReceiver = writeVar;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer write(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.read = audioAttributesCompatParcelizer;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer read(access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> access102Var) {
            this.AudioAttributesImplBaseParcelizer = access102Var;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer read(int i) {
            this.MediaBrowserCompatItemReceiver = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AbstractC0069RemoteActionCompatParcelizer
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            String string;
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                string = "";
            } else {
                string = " generator";
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" identifier");
                string = sb.toString();
            }
            if (this.MediaBrowserCompatMediaItem == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" startedAt");
                string = sb2.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" crashed");
                string = sb3.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" app");
                string = sb4.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(string);
                sb5.append(" generatorType");
                string = sb5.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new readScrValueFromPackHeader(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.write, this.MediaBrowserCompatMediaItem.longValue(), this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer.booleanValue(), this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.read, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver.intValue(), (byte) 0);
        }
    }
}
