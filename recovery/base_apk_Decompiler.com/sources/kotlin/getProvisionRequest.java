package kotlin;

import kotlin.ErrorStateDrmSession;

/* JADX INFO: loaded from: classes5.dex */
final class getProvisionRequest extends ErrorStateDrmSession {
    private final ErrorStateDrmSession.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final ErrorStateDrmSession.RemoteActionCompatParcelizer IconCompatParcelizer;

    /* synthetic */ getProvisionRequest(ErrorStateDrmSession.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ErrorStateDrmSession.RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b) {
        this(audioAttributesCompatParcelizer, remoteActionCompatParcelizer);
    }

    private getProvisionRequest(ErrorStateDrmSession.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ErrorStateDrmSession.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.ErrorStateDrmSession
    public final ErrorStateDrmSession.AudioAttributesCompatParcelizer write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ErrorStateDrmSession
    public final ErrorStateDrmSession.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", mobileSubtype=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ErrorStateDrmSession)) {
            return false;
        }
        ErrorStateDrmSession errorStateDrmSession = (ErrorStateDrmSession) obj;
        ErrorStateDrmSession.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer == null) {
            if (errorStateDrmSession.write() != null) {
                return false;
            }
        } else if (!audioAttributesCompatParcelizer.equals(errorStateDrmSession.write())) {
            return false;
        }
        ErrorStateDrmSession.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer == null) {
            if (errorStateDrmSession.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!remoteActionCompatParcelizer.equals(errorStateDrmSession.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ErrorStateDrmSession.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        int iHashCode = audioAttributesCompatParcelizer == null ? 0 : audioAttributesCompatParcelizer.hashCode();
        ErrorStateDrmSession.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        return ((iHashCode ^ 1000003) * 1000003) ^ (remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.hashCode() : 0);
    }

    static final class AudioAttributesCompatParcelizer extends ErrorStateDrmSession.read {
        private ErrorStateDrmSession.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private ErrorStateDrmSession.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer() {
        }

        @Override // o.ErrorStateDrmSession.read
        public final ErrorStateDrmSession.read read(ErrorStateDrmSession.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
            return this;
        }

        @Override // o.ErrorStateDrmSession.read
        public final ErrorStateDrmSession.read write(ErrorStateDrmSession.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        @Override // o.ErrorStateDrmSession.read
        public final ErrorStateDrmSession write() {
            return new getProvisionRequest(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
