package kotlin;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class disableChildSource implements onVolumeChanged {
    private static final disableChildSource write = new disableChildSource();

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
    }

    public static disableChildSource RemoteActionCompatParcelizer() {
        return write;
    }

    private disableChildSource() {
    }

    public final String toString() {
        return "EmptySignature";
    }
}
