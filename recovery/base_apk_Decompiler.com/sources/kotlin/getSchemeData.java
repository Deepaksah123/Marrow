package kotlin;

import java.util.Arrays;
import kotlin.newInstance;

/* JADX INFO: loaded from: classes5.dex */
final class getSchemeData extends newInstance {
    private final byte[] AudioAttributesCompatParcelizer;
    private final Iterable<ExoMediaDrmOnEventListener> read;

    /* synthetic */ getSchemeData(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    private getSchemeData(Iterable<ExoMediaDrmOnEventListener> iterable, byte[] bArr) {
        this.read = iterable;
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // kotlin.newInstance
    public final Iterable<ExoMediaDrmOnEventListener> RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.newInstance
    public final byte[] read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRequest{events=");
        sb.append(this.read);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof newInstance)) {
            return false;
        }
        newInstance newinstance = (newInstance) obj;
        if (this.read.equals(newinstance.RemoteActionCompatParcelizer())) {
            return Arrays.equals(this.AudioAttributesCompatParcelizer, newinstance instanceof getSchemeData ? ((getSchemeData) newinstance).AudioAttributesCompatParcelizer : newinstance.read());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AudioAttributesCompatParcelizer) ^ ((this.read.hashCode() ^ 1000003) * 1000003);
    }

    static final class IconCompatParcelizer extends newInstance.AudioAttributesCompatParcelizer {
        private Iterable<ExoMediaDrmOnEventListener> RemoteActionCompatParcelizer;
        private byte[] write;

        IconCompatParcelizer() {
        }

        @Override // o.newInstance.AudioAttributesCompatParcelizer
        public final newInstance.AudioAttributesCompatParcelizer write(Iterable<ExoMediaDrmOnEventListener> iterable) {
            this.RemoteActionCompatParcelizer = iterable;
            return this;
        }

        @Override // o.newInstance.AudioAttributesCompatParcelizer
        public final newInstance.AudioAttributesCompatParcelizer read(byte[] bArr) {
            this.write = bArr;
            return this;
        }

        @Override // o.newInstance.AudioAttributesCompatParcelizer
        public final newInstance AudioAttributesCompatParcelizer() {
            String str;
            if (this.RemoteActionCompatParcelizer != null) {
                str = "";
            } else {
                str = " events";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            return new getSchemeData(this.RemoteActionCompatParcelizer, this.write, (byte) 0);
        }
    }
}
