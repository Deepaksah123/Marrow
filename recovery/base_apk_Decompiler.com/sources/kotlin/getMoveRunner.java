package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getMoveRunner extends setMsDelay {
    static final setScaleType IconCompatParcelizer = new setScaleType(getMoveRunner.class) { // from class: o.getMoveRunner.2
        @Override // kotlin.setScaleType
        final setMsDelay read(EmptyBody emptyBody) {
            return getMoveRunner.write(emptyBody.read());
        }
    };
    private byte[] AudioAttributesCompatParcelizer;

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    getMoveRunner(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.AudioAttributesCompatParcelizer = bArr;
    }

    static getMoveRunner write(byte[] bArr) {
        return new isApproved(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getMoveRunner) {
            return SampleVideosRSModel.write(this.AudioAttributesCompatParcelizer, ((getMoveRunner) setmsdelay).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 25, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.AudioAttributesCompatParcelizer.length);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.AudioAttributesCompatParcelizer);
    }
}
