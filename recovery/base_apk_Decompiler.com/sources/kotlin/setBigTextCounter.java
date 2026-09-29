package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setBigTextCounter extends setMsDelay {
    private byte[] read;

    static {
        new setScaleType(setBigTextCounter.class) { // from class: o.setBigTextCounter.1
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setBigTextCounter.write(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setBigTextCounter(byte[] bArr, boolean z) {
        this.read = bArr;
    }

    static setBigTextCounter write(byte[] bArr) {
        return new AppModule(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setBigTextCounter) {
            return SampleVideosRSModel.write(this.read, ((setBigTextCounter) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 18, this.read);
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
