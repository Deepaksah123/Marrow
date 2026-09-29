package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAutoResetMode extends setMsDelay {
    private byte[] read;

    static {
        new setScaleType(getAutoResetMode.class) { // from class: o.getAutoResetMode.1
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return getAutoResetMode.IconCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    getAutoResetMode(byte[] bArr, boolean z) {
        this.read = bArr;
    }

    static getAutoResetMode IconCompatParcelizer(byte[] bArr) {
        return new getDownloadJob(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getAutoResetMode) {
            return SampleVideosRSModel.write(this.read, ((getAutoResetMode) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 21, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }
}
