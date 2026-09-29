package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkApiResponse extends setDontHide {
    public static final NetworkApiResponse write = new NetworkApiResponse();
    private static final byte[] read = new byte[0];

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private NetworkApiResponse() {
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 5, read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, 0);
    }
}
