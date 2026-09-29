package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setScrollStartListener extends setMsDelay {
    private byte[] write;

    static {
        new setScaleType(setScrollStartListener.class) { // from class: o.setScrollStartListener.4
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setScrollStartListener.write(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setScrollStartListener(byte[] bArr, boolean z) {
        this.write = bArr;
    }

    static setScrollStartListener write(byte[] bArr) {
        return new setDbFlushIgnored(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setScrollStartListener) {
            return SampleVideosRSModel.write(this.write, ((setScrollStartListener) setmsdelay).write);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 20, this.write);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.write.length);
    }

    private String RemoteActionCompatParcelizer() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.write);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.write);
    }

    public String toString() {
        return RemoteActionCompatParcelizer();
    }
}
