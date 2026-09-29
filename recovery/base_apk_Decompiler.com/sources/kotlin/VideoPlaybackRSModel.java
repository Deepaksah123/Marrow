package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoPlaybackRSModel extends getOnMoveListener {
    public VideoPlaybackRSModel(byte[] bArr) {
        super(bArr);
    }

    @Override // kotlin.getOnMoveListener, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    private byte[] AudioAttributesImplBaseParcelizer() {
        if (this.read[this.read.length - 1] != 90) {
            return this.read;
        }
        if (!RemoteActionCompatParcelizer()) {
            byte[] bArr = new byte[this.read.length + 4];
            System.arraycopy(this.read, 0, bArr, 0, this.read.length - 1);
            System.arraycopy(ShareCopyRSModel.read("0000Z"), 0, bArr, this.read.length - 1, 5);
            return bArr;
        }
        if (!read()) {
            byte[] bArr2 = new byte[this.read.length + 2];
            System.arraycopy(this.read, 0, bArr2, 0, this.read.length - 1);
            System.arraycopy(ShareCopyRSModel.read("00Z"), 0, bArr2, this.read.length - 1, 3);
            return bArr2;
        }
        if (!AudioAttributesCompatParcelizer()) {
            return this.read;
        }
        int length = this.read.length - 2;
        while (length > 0 && this.read[length] == 48) {
            length--;
        }
        if (this.read[length] == 46) {
            byte[] bArr3 = new byte[length + 1];
            System.arraycopy(this.read, 0, bArr3, 0, length);
            bArr3[length] = 90;
            return bArr3;
        }
        byte[] bArr4 = new byte[length + 2];
        int i = length + 1;
        System.arraycopy(this.read, 0, bArr4, 0, i);
        bArr4[i] = 90;
        return bArr4;
    }

    @Override // kotlin.getOnMoveListener, kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 24, AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.getOnMoveListener, kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, AudioAttributesImplBaseParcelizer().length);
    }
}
