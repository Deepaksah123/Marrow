package kotlin;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class MarrowWebView extends setMsDelay {
    private static final MarrowWebView[] read;
    private final int RemoteActionCompatParcelizer;
    private final byte[] write;

    static {
        new setScaleType(MarrowWebView.class) { // from class: o.MarrowWebView.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return MarrowWebView.write(emptyBody.read(), false);
            }
        };
        read = new MarrowWebView[12];
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private MarrowWebView(byte[] bArr, boolean z) {
        if (getPairOfTimeAndIndex.read(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.write = z ? SampleVideosRSModel.RemoteActionCompatParcelizer(bArr) : bArr;
        this.RemoteActionCompatParcelizer = getPairOfTimeAndIndex.IconCompatParcelizer(bArr);
    }

    static MarrowWebView write(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new MarrowWebView(bArr, z);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        MarrowWebView[] marrowWebViewArr = read;
        if (i >= marrowWebViewArr.length) {
            return new MarrowWebView(bArr, z);
        }
        MarrowWebView marrowWebView = marrowWebViewArr[i];
        if (marrowWebView != null) {
            return marrowWebView;
        }
        MarrowWebView marrowWebView2 = new MarrowWebView(bArr, z);
        marrowWebViewArr[i] = marrowWebView2;
        return marrowWebView2;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof MarrowWebView) {
            return SampleVideosRSModel.write(this.write, ((MarrowWebView) setmsdelay).write);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 10, this.write);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.write.length);
    }

    public final BigInteger read() {
        return new BigInteger(this.write);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.write);
    }
}
