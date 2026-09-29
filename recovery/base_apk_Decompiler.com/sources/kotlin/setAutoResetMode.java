package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setAutoResetMode extends setMsDelay {
    private byte[] read;

    static {
        new setScaleType(setAutoResetMode.class) { // from class: o.setAutoResetMode.3
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setAutoResetMode.IconCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setAutoResetMode(byte[] bArr, boolean z) {
        this.read = bArr;
    }

    static setAutoResetMode IconCompatParcelizer(byte[] bArr) {
        return new setDownloadJob(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setAutoResetMode) {
            return SampleVideosRSModel.write(this.read, ((setAutoResetMode) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 26, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    private String AudioAttributesCompatParcelizer() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.read);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }

    public String toString() {
        return AudioAttributesCompatParcelizer();
    }
}
