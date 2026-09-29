package kotlin;

import java.util.List;
import kotlin.setPropertyByteArray;

/* JADX INFO: loaded from: classes5.dex */
final class provideKeyResponse extends setPropertyByteArray {
    private final setPlayerIdForSession AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final setOnExpirationUpdateListener IconCompatParcelizer;
    private final List<setPropertyString> RemoteActionCompatParcelizer;
    private final String read;
    private final Integer write;

    /* synthetic */ provideKeyResponse(long j, long j2, setOnExpirationUpdateListener setonexpirationupdatelistener, Integer num, String str, List list, setPlayerIdForSession setplayeridforsession, byte b) {
        this(j, j2, setonexpirationupdatelistener, num, str, list, setplayeridforsession);
    }

    private provideKeyResponse(long j, long j2, setOnExpirationUpdateListener setonexpirationupdatelistener, Integer num, String str, List<setPropertyString> list, setPlayerIdForSession setplayeridforsession) {
        this.AudioAttributesImplApi26Parcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = j2;
        this.IconCompatParcelizer = setonexpirationupdatelistener;
        this.write = num;
        this.read = str;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = setplayeridforsession;
    }

    @Override // kotlin.setPropertyByteArray
    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setPropertyByteArray
    public final long AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.setPropertyByteArray
    public final setOnExpirationUpdateListener read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setPropertyByteArray
    public final Integer write() {
        return this.write;
    }

    @Override // kotlin.setPropertyByteArray
    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setPropertyByteArray
    public final List<setPropertyString> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setPropertyByteArray
    public final setPlayerIdForSession IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", requestUptimeMs=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", clientInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", logSource=");
        sb.append(this.write);
        sb.append(", logSourceName=");
        sb.append(this.read);
        sb.append(", logEvents=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", qosTier=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setPropertyByteArray)) {
            return false;
        }
        setPropertyByteArray setpropertybytearray = (setPropertyByteArray) obj;
        if (this.AudioAttributesImplApi26Parcelizer != setpropertybytearray.MediaBrowserCompatCustomActionResultReceiver() || this.AudioAttributesImplApi21Parcelizer != setpropertybytearray.AudioAttributesImplApi21Parcelizer()) {
            return false;
        }
        setOnExpirationUpdateListener setonexpirationupdatelistener = this.IconCompatParcelizer;
        if (setonexpirationupdatelistener == null) {
            if (setpropertybytearray.read() != null) {
                return false;
            }
        } else if (!setonexpirationupdatelistener.equals(setpropertybytearray.read())) {
            return false;
        }
        Integer num = this.write;
        if (num == null) {
            if (setpropertybytearray.write() != null) {
                return false;
            }
        } else if (!num.equals(setpropertybytearray.write())) {
            return false;
        }
        String str = this.read;
        if (str == null) {
            if (setpropertybytearray.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(setpropertybytearray.RemoteActionCompatParcelizer())) {
            return false;
        }
        List<setPropertyString> list = this.RemoteActionCompatParcelizer;
        if (list == null) {
            if (setpropertybytearray.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!list.equals(setpropertybytearray.AudioAttributesCompatParcelizer())) {
            return false;
        }
        setPlayerIdForSession setplayeridforsession = this.AudioAttributesCompatParcelizer;
        if (setplayeridforsession == null) {
            if (setpropertybytearray.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!setplayeridforsession.equals(setpropertybytearray.IconCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.AudioAttributesImplApi26Parcelizer;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        setOnExpirationUpdateListener setonexpirationupdatelistener = this.IconCompatParcelizer;
        int iHashCode = setonexpirationupdatelistener == null ? 0 : setonexpirationupdatelistener.hashCode();
        Integer num = this.write;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.read;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<setPropertyString> list = this.RemoteActionCompatParcelizer;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        setPlayerIdForSession setplayeridforsession = this.AudioAttributesCompatParcelizer;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (setplayeridforsession != null ? setplayeridforsession.hashCode() : 0);
    }

    static final class read extends setPropertyByteArray.IconCompatParcelizer {
        private List<setPropertyString> AudioAttributesCompatParcelizer;
        private Long AudioAttributesImplApi21Parcelizer;
        private Integer IconCompatParcelizer;
        private Long MediaBrowserCompatItemReceiver;
        private setPlayerIdForSession RemoteActionCompatParcelizer;
        private setOnExpirationUpdateListener read;
        private String write;

        read() {
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray.IconCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            this.MediaBrowserCompatItemReceiver = Long.valueOf(j);
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray.IconCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.AudioAttributesImplApi21Parcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray.IconCompatParcelizer IconCompatParcelizer(setOnExpirationUpdateListener setonexpirationupdatelistener) {
            this.read = setonexpirationupdatelistener;
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        final setPropertyByteArray.IconCompatParcelizer AudioAttributesCompatParcelizer(Integer num) {
            this.IconCompatParcelizer = num;
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        final setPropertyByteArray.IconCompatParcelizer IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray.IconCompatParcelizer write(List<setPropertyString> list) {
            this.AudioAttributesCompatParcelizer = list;
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray.IconCompatParcelizer IconCompatParcelizer(setPlayerIdForSession setplayeridforsession) {
            this.RemoteActionCompatParcelizer = setplayeridforsession;
            return this;
        }

        @Override // o.setPropertyByteArray.IconCompatParcelizer
        public final setPropertyByteArray AudioAttributesCompatParcelizer() {
            String string;
            if (this.MediaBrowserCompatItemReceiver != null) {
                string = "";
            } else {
                string = " requestTimeMs";
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" requestUptimeMs");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new provideKeyResponse(this.MediaBrowserCompatItemReceiver.longValue(), this.AudioAttributesImplApi21Parcelizer.longValue(), this.read, this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
