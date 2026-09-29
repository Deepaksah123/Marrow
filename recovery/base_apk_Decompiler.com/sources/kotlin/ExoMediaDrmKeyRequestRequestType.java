package kotlin;

import java.util.Arrays;
import kotlin.ExoMediaDrmProvider;

/* JADX INFO: loaded from: classes5.dex */
final class ExoMediaDrmKeyRequestRequestType extends ExoMediaDrmProvider {
    private final byte[] IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final DrmUtilApi21 read;

    /* synthetic */ ExoMediaDrmKeyRequestRequestType(String str, byte[] bArr, DrmUtilApi21 drmUtilApi21, byte b) {
        this(str, bArr, drmUtilApi21);
    }

    private ExoMediaDrmKeyRequestRequestType(String str, byte[] bArr, DrmUtilApi21 drmUtilApi21) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = bArr;
        this.read = drmUtilApi21;
    }

    @Override // kotlin.ExoMediaDrmProvider
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmProvider
    public final byte[] write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ExoMediaDrmProvider
    public final DrmUtilApi21 AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExoMediaDrmProvider)) {
            return false;
        }
        ExoMediaDrmProvider exoMediaDrmProvider = (ExoMediaDrmProvider) obj;
        if (this.RemoteActionCompatParcelizer.equals(exoMediaDrmProvider.RemoteActionCompatParcelizer())) {
            return Arrays.equals(this.IconCompatParcelizer, exoMediaDrmProvider instanceof ExoMediaDrmKeyRequestRequestType ? ((ExoMediaDrmKeyRequestRequestType) exoMediaDrmProvider).IconCompatParcelizer : exoMediaDrmProvider.write()) && this.read.equals(exoMediaDrmProvider.AudioAttributesCompatParcelizer());
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.read.hashCode() ^ ((((iHashCode ^ 1000003) * 1000003) ^ Arrays.hashCode(this.IconCompatParcelizer)) * 1000003);
    }

    static final class RemoteActionCompatParcelizer extends ExoMediaDrmProvider.RemoteActionCompatParcelizer {
        private byte[] AudioAttributesCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private DrmUtilApi21 write;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.ExoMediaDrmProvider.RemoteActionCompatParcelizer
        public final ExoMediaDrmProvider.RemoteActionCompatParcelizer write(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.RemoteActionCompatParcelizer = str;
            return this;
        }

        @Override // o.ExoMediaDrmProvider.RemoteActionCompatParcelizer
        public final ExoMediaDrmProvider.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(byte[] bArr) {
            this.AudioAttributesCompatParcelizer = bArr;
            return this;
        }

        @Override // o.ExoMediaDrmProvider.RemoteActionCompatParcelizer
        public final ExoMediaDrmProvider.RemoteActionCompatParcelizer read(DrmUtilApi21 drmUtilApi21) {
            if (drmUtilApi21 == null) {
                throw new NullPointerException("Null priority");
            }
            this.write = drmUtilApi21;
            return this;
        }

        @Override // o.ExoMediaDrmProvider.RemoteActionCompatParcelizer
        public final ExoMediaDrmProvider RemoteActionCompatParcelizer() {
            String string;
            if (this.RemoteActionCompatParcelizer != null) {
                string = "";
            } else {
                string = " backendName";
            }
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" priority");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new ExoMediaDrmKeyRequestRequestType(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, (byte) 0);
        }
    }
}
