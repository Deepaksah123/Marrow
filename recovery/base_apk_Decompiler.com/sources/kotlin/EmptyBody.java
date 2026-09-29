package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyBody extends setIsTablet {
    public EmptyBody(byte[] bArr) {
        super(bArr);
    }

    @Override // kotlin.setIsTablet, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.setIsTablet, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    static void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, byte[] bArr, int i, int i2) throws IOException {
        setminimumwidthmargin.RemoteActionCompatParcelizer(true, 4, bArr, i, i2);
    }

    static int IconCompatParcelizer(int i) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(true, i);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 4, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.RemoteActionCompatParcelizer.length);
    }
}
