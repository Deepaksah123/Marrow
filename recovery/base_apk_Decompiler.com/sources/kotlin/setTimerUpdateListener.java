package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class setTimerUpdateListener extends setMsDelay {
    private byte[] write;

    static {
        new setScaleType(setTimerUpdateListener.class) { // from class: o.setTimerUpdateListener.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setTimerUpdateListener.write(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private setTimerUpdateListener(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.write = bArr;
        if (!write(0) || !write(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    static setTimerUpdateListener write(byte[] bArr) {
        return new setTimerUpdateListener(bArr);
    }

    private boolean write(int i) {
        byte b;
        byte[] bArr = this.write;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setTimerUpdateListener) {
            return SampleVideosRSModel.write(this.write, ((setTimerUpdateListener) setmsdelay).write);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 23, this.write);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.write.length);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.write);
    }

    public String toString() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.write);
    }
}
