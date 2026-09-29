package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setNetworkObserver extends InteractivePanelTextView {
    setNetworkObserver(byte[] bArr) {
        super(bArr, false);
    }

    @Override // kotlin.InteractivePanelTextView, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    static void read(setMinimumWidthMargin setminimumwidthmargin, byte b, byte[] bArr, int i, int i2) throws IOException {
        setminimumwidthmargin.IconCompatParcelizer(true, b, bArr, i, i2);
    }

    static void IconCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z, byte[] bArr, int i) throws IOException {
        setminimumwidthmargin.RemoteActionCompatParcelizer(z, 3, bArr, 0, i);
    }

    static int IconCompatParcelizer(boolean z, int i) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, i);
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 3, this.IconCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.IconCompatParcelizer.length);
    }
}
