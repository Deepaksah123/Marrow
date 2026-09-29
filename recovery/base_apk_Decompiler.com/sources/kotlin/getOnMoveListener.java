package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class getOnMoveListener extends setMsDelay {
    final byte[] read;

    static {
        new setScaleType(getOnMoveListener.class) { // from class: o.getOnMoveListener.4
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return getOnMoveListener.IconCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    getOnMoveListener(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.read = bArr;
        if (!RemoteActionCompatParcelizer(0) || !RemoteActionCompatParcelizer(1) || !RemoteActionCompatParcelizer(2) || !RemoteActionCompatParcelizer(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    static getOnMoveListener IconCompatParcelizer(byte[] bArr) {
        return new getOnMoveListener(bArr);
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        byte b;
        byte[] bArr = this.read;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getOnMoveListener) {
            return SampleVideosRSModel.write(this.read, ((getOnMoveListener) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 24, this.read);
    }

    @Override // kotlin.setMsDelay
    int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    protected final boolean AudioAttributesCompatParcelizer() {
        int i = 0;
        while (true) {
            byte[] bArr = this.read;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    protected final boolean RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer(10) && RemoteActionCompatParcelizer(11);
    }

    protected final boolean read() {
        return RemoteActionCompatParcelizer(12) && RemoteActionCompatParcelizer(13);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new VideoPlaybackRSModel(this.read);
    }
}
