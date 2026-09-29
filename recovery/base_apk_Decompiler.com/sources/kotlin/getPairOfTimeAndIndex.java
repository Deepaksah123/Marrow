package kotlin;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class getPairOfTimeAndIndex extends setMsDelay {
    private final int AudioAttributesCompatParcelizer;
    private final byte[] RemoteActionCompatParcelizer;

    static {
        new setScaleType(getPairOfTimeAndIndex.class) { // from class: o.getPairOfTimeAndIndex.4
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return getPairOfTimeAndIndex.AudioAttributesCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private getPairOfTimeAndIndex(byte[] bArr) {
        if (read(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.RemoteActionCompatParcelizer = bArr;
        this.AudioAttributesCompatParcelizer = IconCompatParcelizer(bArr);
    }

    static getPairOfTimeAndIndex AudioAttributesCompatParcelizer(byte[] bArr) {
        return new getPairOfTimeAndIndex(bArr);
    }

    static boolean read(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || FreeVideoPromotionRSModel.AudioAttributesCompatParcelizer("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static int IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getPairOfTimeAndIndex) {
            return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer, ((getPairOfTimeAndIndex) setmsdelay).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 2, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.RemoteActionCompatParcelizer.length);
    }

    public final BigInteger AudioAttributesCompatParcelizer() {
        return new BigInteger(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer);
    }

    public String toString() {
        return AudioAttributesCompatParcelizer().toString();
    }
}
