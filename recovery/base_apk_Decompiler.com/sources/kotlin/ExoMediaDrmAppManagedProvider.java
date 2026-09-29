package kotlin;

import java.util.Map;
import kotlin.ExoMediaDrmOnEventListener;

/* JADX INFO: loaded from: classes5.dex */
final class ExoMediaDrmAppManagedProvider extends ExoMediaDrmOnEventListener {
    private final Integer AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final Map<String, String> IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final ExoMediaDrmKeyRequest read;
    private final long write;

    /* synthetic */ ExoMediaDrmAppManagedProvider(String str, Integer num, ExoMediaDrmKeyRequest exoMediaDrmKeyRequest, long j, long j2, Map map, byte b) {
        this(str, num, exoMediaDrmKeyRequest, j, j2, map);
    }

    private ExoMediaDrmAppManagedProvider(String str, Integer num, ExoMediaDrmKeyRequest exoMediaDrmKeyRequest, long j, long j2, Map<String, String> map) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = num;
        this.read = exoMediaDrmKeyRequest;
        this.write = j;
        this.AudioAttributesImplApi26Parcelizer = j2;
        this.IconCompatParcelizer = map;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    public final Integer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    public final ExoMediaDrmKeyRequest write() {
        return this.read;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    public final long IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    public final long AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.ExoMediaDrmOnEventListener
    protected final Map<String, String> read() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", code=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", encodedPayload=");
        sb.append(this.read);
        sb.append(", eventMillis=");
        sb.append(this.write);
        sb.append(", uptimeMillis=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", autoMetadata=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExoMediaDrmOnEventListener)) {
            return false;
        }
        ExoMediaDrmOnEventListener exoMediaDrmOnEventListener = (ExoMediaDrmOnEventListener) obj;
        if (!this.RemoteActionCompatParcelizer.equals(exoMediaDrmOnEventListener.RemoteActionCompatParcelizer())) {
            return false;
        }
        Integer num = this.AudioAttributesCompatParcelizer;
        if (num == null) {
            if (exoMediaDrmOnEventListener.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!num.equals(exoMediaDrmOnEventListener.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return this.read.equals(exoMediaDrmOnEventListener.write()) && this.write == exoMediaDrmOnEventListener.IconCompatParcelizer() && this.AudioAttributesImplApi26Parcelizer == exoMediaDrmOnEventListener.AudioAttributesImplBaseParcelizer() && this.IconCompatParcelizer.equals(exoMediaDrmOnEventListener.read());
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        Integer num = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.read.hashCode();
        long j = this.write;
        long j2 = this.AudioAttributesImplApi26Parcelizer;
        return this.IconCompatParcelizer.hashCode() ^ ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    static final class RemoteActionCompatParcelizer extends ExoMediaDrmOnEventListener.IconCompatParcelizer {
        private ExoMediaDrmKeyRequest AudioAttributesCompatParcelizer;
        private Integer IconCompatParcelizer;
        private Long MediaBrowserCompatItemReceiver;
        private Map<String, String> RemoteActionCompatParcelizer;
        private String read;
        private Long write;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener.IconCompatParcelizer read(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.read = str;
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener.IconCompatParcelizer write(Integer num) {
            this.IconCompatParcelizer = num;
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener.IconCompatParcelizer write(ExoMediaDrmKeyRequest exoMediaDrmKeyRequest) {
            if (exoMediaDrmKeyRequest == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.AudioAttributesCompatParcelizer = exoMediaDrmKeyRequest;
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener.IconCompatParcelizer write(long j) {
            this.write = Long.valueOf(j);
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener.IconCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.MediaBrowserCompatItemReceiver = Long.valueOf(j);
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        protected final ExoMediaDrmOnEventListener.IconCompatParcelizer IconCompatParcelizer(Map<String, String> map) {
            this.RemoteActionCompatParcelizer = map;
            return this;
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        protected final Map<String, String> read() {
            Map<String, String> map = this.RemoteActionCompatParcelizer;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o.ExoMediaDrmOnEventListener.IconCompatParcelizer
        public final ExoMediaDrmOnEventListener AudioAttributesCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " transportName";
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" encodedPayload");
                string = sb.toString();
            }
            if (this.write == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" eventMillis");
                string = sb2.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" uptimeMillis");
                string = sb3.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" autoMetadata");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new ExoMediaDrmAppManagedProvider(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write.longValue(), this.MediaBrowserCompatItemReceiver.longValue(), this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
