package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOnMoveListener extends setMsDelay {
    private byte[] read;

    static {
        new setScaleType(setOnMoveListener.class) { // from class: o.setOnMoveListener.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setOnMoveListener.AudioAttributesCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setOnMoveListener(byte[] bArr, boolean z) {
        this.read = bArr;
    }

    static setOnMoveListener AudioAttributesCompatParcelizer(byte[] bArr) {
        return new NetworkApiResponseCompanion(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setOnMoveListener) {
            return SampleVideosRSModel.write(this.read, ((setOnMoveListener) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 19, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    public final String read() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.read);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }

    public String toString() {
        return read();
    }
}
