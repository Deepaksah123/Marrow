package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ExoMediaDrmKeyRequest {
    private final byte[] AudioAttributesCompatParcelizer;
    private final DrmSessionManagerDrmSessionReference RemoteActionCompatParcelizer;

    public ExoMediaDrmKeyRequest(DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference, byte[] bArr) {
        if (drmSessionManagerDrmSessionReference == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.RemoteActionCompatParcelizer = drmSessionManagerDrmSessionReference;
        this.AudioAttributesCompatParcelizer = bArr;
    }

    public final DrmSessionManagerDrmSessionReference write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final byte[] IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExoMediaDrmKeyRequest)) {
            return false;
        }
        ExoMediaDrmKeyRequest exoMediaDrmKeyRequest = (ExoMediaDrmKeyRequest) obj;
        if (this.RemoteActionCompatParcelizer.equals(exoMediaDrmKeyRequest.RemoteActionCompatParcelizer)) {
            return Arrays.equals(this.AudioAttributesCompatParcelizer, exoMediaDrmKeyRequest.AudioAttributesCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AudioAttributesCompatParcelizer) ^ ((this.RemoteActionCompatParcelizer.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
