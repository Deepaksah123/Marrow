package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class isSuppressed extends InteractivePanelTextView {
    isSuppressed(byte[] bArr) {
        super(bArr, false);
    }

    @Override // kotlin.InteractivePanelTextView, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.InteractivePanelTextView, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        byte b = this.IconCompatParcelizer[0];
        int length = this.IconCompatParcelizer.length - 1;
        byte b2 = this.IconCompatParcelizer[length];
        byte b3 = (byte) ((255 << (b & 255)) & this.IconCompatParcelizer[length]);
        if (b2 == b3) {
            setminimumwidthmargin.read(z, 3, this.IconCompatParcelizer);
        } else {
            setminimumwidthmargin.read(z, this.IconCompatParcelizer, length, b3);
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.IconCompatParcelizer.length);
    }
}
