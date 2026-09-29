package kotlin;

import kotlin.MediaCodecAdapterFactory;
import kotlin.createForVideoDecoding;

/* JADX INFO: loaded from: classes5.dex */
final class forceEnableAsynchronous extends createForVideoDecoding {
    private final long AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final MediaCodecAdapterFactory.write AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* synthetic */ forceEnableAsynchronous(String str, MediaCodecAdapterFactory.write writeVar, String str2, String str3, long j, long j2, String str4, byte b) {
        this(str, writeVar, str2, str3, j, j2, str4);
    }

    private forceEnableAsynchronous(String str, MediaCodecAdapterFactory.write writeVar, String str2, String str3, long j, long j2, String str4) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = writeVar;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = j2;
        this.write = str4;
    }

    @Override // kotlin.createForVideoDecoding
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.createForVideoDecoding
    public final MediaCodecAdapterFactory.write AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.createForVideoDecoding
    public final String read() {
        return this.read;
    }

    @Override // kotlin.createForVideoDecoding
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.createForVideoDecoding
    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.createForVideoDecoding
    public final long AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.createForVideoDecoding
    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", registrationStatus=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", authToken=");
        sb.append(this.read);
        sb.append(", refreshToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", expiresInSecs=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", fisError=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof createForVideoDecoding)) {
            return false;
        }
        createForVideoDecoding createforvideodecoding = (createForVideoDecoding) obj;
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            if (createforvideodecoding.write() != null) {
                return false;
            }
        } else if (!str.equals(createforvideodecoding.write())) {
            return false;
        }
        if (!this.AudioAttributesImplApi26Parcelizer.equals(createforvideodecoding.AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null) {
            if (createforvideodecoding.read() != null) {
                return false;
            }
        } else if (!str2.equals(createforvideodecoding.read())) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null) {
            if (createforvideodecoding.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!str3.equals(createforvideodecoding.IconCompatParcelizer())) {
            return false;
        }
        if (this.AudioAttributesCompatParcelizer != createforvideodecoding.AudioAttributesCompatParcelizer() || this.AudioAttributesImplApi21Parcelizer != createforvideodecoding.AudioAttributesImplApi21Parcelizer()) {
            return false;
        }
        String str4 = this.write;
        if (str4 == null) {
            if (createforvideodecoding.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str4.equals(createforvideodecoding.RemoteActionCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        String str2 = this.read;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IconCompatParcelizer;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.AudioAttributesCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        String str4 = this.write;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // kotlin.createForVideoDecoding
    public final createForVideoDecoding.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    static final class RemoteActionCompatParcelizer extends createForVideoDecoding.AudioAttributesCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private Long AudioAttributesImplApi21Parcelizer;
        private MediaCodecAdapterFactory.write AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private String read;
        private Long write;

        /* synthetic */ RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding, byte b) {
            this(createforvideodecoding);
        }

        RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding) {
            this.IconCompatParcelizer = createforvideodecoding.write();
            this.AudioAttributesImplBaseParcelizer = createforvideodecoding.AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer = createforvideodecoding.read();
            this.AudioAttributesCompatParcelizer = createforvideodecoding.IconCompatParcelizer();
            this.write = Long.valueOf(createforvideodecoding.AudioAttributesCompatParcelizer());
            this.AudioAttributesImplApi21Parcelizer = Long.valueOf(createforvideodecoding.AudioAttributesImplApi21Parcelizer());
            this.read = createforvideodecoding.RemoteActionCompatParcelizer();
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer read(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(MediaCodecAdapterFactory.write writeVar) {
            if (writeVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.AudioAttributesImplBaseParcelizer = writeVar;
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer write(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer write(long j) {
            this.write = Long.valueOf(j);
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.AudioAttributesImplApi21Parcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        @Override // o.createForVideoDecoding.AudioAttributesCompatParcelizer
        public final createForVideoDecoding AudioAttributesCompatParcelizer() {
            String string;
            if (this.AudioAttributesImplBaseParcelizer != null) {
                string = "";
            } else {
                string = " registrationStatus";
            }
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" expiresInSecs");
                string = sb.toString();
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" tokenCreationEpochInSecs");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new forceEnableAsynchronous(this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write.longValue(), this.AudioAttributesImplApi21Parcelizer.longValue(), this.read, (byte) 0);
        }
    }
}
