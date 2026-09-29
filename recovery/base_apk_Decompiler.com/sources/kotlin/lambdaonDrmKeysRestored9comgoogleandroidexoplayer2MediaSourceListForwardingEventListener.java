package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    private int RemoteActionCompatParcelizer;
    private byte[] read;

    private lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(byte[] bArr) {
        this.read = bArr;
        this.RemoteActionCompatParcelizer = Arrays.hashCode(bArr);
    }

    public static lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener read(byte[] bArr) {
        return new lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener) {
            return Arrays.equals(this.read, ((lambdaonDrmKeysRestored9comgoogleandroidexoplayer2MediaSourceListForwardingEventListener) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer;
    }
}
