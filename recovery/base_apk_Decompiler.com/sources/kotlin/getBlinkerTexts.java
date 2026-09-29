package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getBlinkerTexts extends setMsDelay {
    private byte[] RemoteActionCompatParcelizer;

    static {
        new setScaleType(getBlinkerTexts.class) { // from class: o.getBlinkerTexts.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return getBlinkerTexts.RemoteActionCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    getBlinkerTexts(byte[] bArr, boolean z) {
        this.RemoteActionCompatParcelizer = bArr;
    }

    static getBlinkerTexts RemoteActionCompatParcelizer(byte[] bArr) {
        return new VideoResolutionDownloadResponseBody(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getBlinkerTexts) {
            return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer, ((getBlinkerTexts) setmsdelay).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 27, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.RemoteActionCompatParcelizer.length);
    }

    private String AudioAttributesCompatParcelizer() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer);
    }

    public String toString() {
        return AudioAttributesCompatParcelizer();
    }
}
