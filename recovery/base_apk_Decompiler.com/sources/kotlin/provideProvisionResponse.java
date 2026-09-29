package kotlin;

import java.util.Arrays;
import kotlin.setPropertyString;

/* JADX INFO: loaded from: classes5.dex */
final class provideProvisionResponse extends setPropertyString {
    private final ErrorStateDrmSession AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final Integer IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final byte[] RemoteActionCompatParcelizer;
    private final long read;
    private final long write;

    /* synthetic */ provideProvisionResponse(long j, Integer num, long j2, byte[] bArr, String str, long j3, ErrorStateDrmSession errorStateDrmSession, byte b) {
        this(j, num, j2, bArr, str, j3, errorStateDrmSession);
    }

    private provideProvisionResponse(long j, Integer num, long j2, byte[] bArr, String str, long j3, ErrorStateDrmSession errorStateDrmSession) {
        this.write = j;
        this.IconCompatParcelizer = num;
        this.read = j2;
        this.RemoteActionCompatParcelizer = bArr;
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesImplApi26Parcelizer = j3;
        this.AudioAttributesCompatParcelizer = errorStateDrmSession;
    }

    @Override // kotlin.setPropertyString
    public final long IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.setPropertyString
    public final Integer read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setPropertyString
    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setPropertyString
    public final byte[] write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setPropertyString
    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.setPropertyString
    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setPropertyString
    public final ErrorStateDrmSession AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.write);
        sb.append(", eventCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", eventUptimeMs=");
        sb.append(this.read);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.RemoteActionCompatParcelizer));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", networkConnectionInfo=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setPropertyString)) {
            return false;
        }
        setPropertyString setpropertystring = (setPropertyString) obj;
        if (this.write != setpropertystring.IconCompatParcelizer()) {
            return false;
        }
        Integer num = this.IconCompatParcelizer;
        if (num == null) {
            if (setpropertystring.read() != null) {
                return false;
            }
        } else if (!num.equals(setpropertystring.read())) {
            return false;
        }
        if (this.read != setpropertystring.RemoteActionCompatParcelizer()) {
            return false;
        }
        if (!Arrays.equals(this.RemoteActionCompatParcelizer, setpropertystring instanceof provideProvisionResponse ? ((provideProvisionResponse) setpropertystring).RemoteActionCompatParcelizer : setpropertystring.write())) {
            return false;
        }
        String str = this.MediaBrowserCompatItemReceiver;
        if (str == null) {
            if (setpropertystring.MediaBrowserCompatItemReceiver() != null) {
                return false;
            }
        } else if (!str.equals(setpropertystring.MediaBrowserCompatItemReceiver())) {
            return false;
        }
        if (this.AudioAttributesImplApi26Parcelizer != setpropertystring.MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        ErrorStateDrmSession errorStateDrmSession = this.AudioAttributesCompatParcelizer;
        if (errorStateDrmSession == null) {
            if (setpropertystring.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!errorStateDrmSession.equals(setpropertystring.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.IconCompatParcelizer;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.read;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int iHashCode2 = Arrays.hashCode(this.RemoteActionCompatParcelizer);
        String str = this.MediaBrowserCompatItemReceiver;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.AudioAttributesImplApi26Parcelizer;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        ErrorStateDrmSession errorStateDrmSession = this.AudioAttributesCompatParcelizer;
        return ((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i3) * 1000003) ^ (errorStateDrmSession != null ? errorStateDrmSession.hashCode() : 0);
    }

    static final class AudioAttributesCompatParcelizer extends setPropertyString.AudioAttributesCompatParcelizer {
        private ErrorStateDrmSession AudioAttributesCompatParcelizer;
        private Long AudioAttributesImplBaseParcelizer;
        private Long IconCompatParcelizer;
        private String MediaBrowserCompatItemReceiver;
        private byte[] RemoteActionCompatParcelizer;
        private Integer read;
        private Long write;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString.AudioAttributesCompatParcelizer write(Integer num) {
            this.read = num;
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.write = Long.valueOf(j);
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        final setPropertyString.AudioAttributesCompatParcelizer IconCompatParcelizer(byte[] bArr) {
            this.RemoteActionCompatParcelizer = bArr;
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        final setPropertyString.AudioAttributesCompatParcelizer write(String str) {
            this.MediaBrowserCompatItemReceiver = str;
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString.AudioAttributesCompatParcelizer write(long j) {
            this.AudioAttributesImplBaseParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString.AudioAttributesCompatParcelizer read(ErrorStateDrmSession errorStateDrmSession) {
            this.AudioAttributesCompatParcelizer = errorStateDrmSession;
            return this;
        }

        @Override // o.setPropertyString.AudioAttributesCompatParcelizer
        public final setPropertyString AudioAttributesCompatParcelizer() {
            String string;
            if (this.IconCompatParcelizer != null) {
                string = "";
            } else {
                string = " eventTimeMs";
            }
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" eventUptimeMs");
                string = sb.toString();
            }
            if (this.AudioAttributesImplBaseParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" timezoneOffsetSeconds");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new provideProvisionResponse(this.IconCompatParcelizer.longValue(), this.read, this.write.longValue(), this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer.longValue(), this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
