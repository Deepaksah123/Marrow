package kotlin;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.setMinimumHeightMargin;

/* JADX INFO: loaded from: classes4.dex */
public class setRandom extends setMsDelay {
    private static final ConcurrentMap<setMinimumHeightMargin.RemoteActionCompatParcelizer, setRandom> IconCompatParcelizer;
    private final byte[] read;
    private String write = null;

    static {
        new setScaleType(setRandom.class) { // from class: o.setRandom.3
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setRandom.RemoteActionCompatParcelizer(emptyBody.read(), false);
            }
        };
        IconCompatParcelizer = new ConcurrentHashMap();
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private setRandom(byte[] bArr) {
        this.read = bArr;
    }

    static void IconCompatParcelizer(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    static setRandom RemoteActionCompatParcelizer(byte[] bArr, boolean z) {
        IconCompatParcelizer(bArr.length);
        setRandom setrandom = IconCompatParcelizer.get(new setMinimumHeightMargin.RemoteActionCompatParcelizer(bArr));
        if (setrandom != null) {
            return setrandom;
        }
        if (!AudioAttributesCompatParcelizer(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
        }
        if (z) {
            bArr = SampleVideosRSModel.RemoteActionCompatParcelizer(bArr);
        }
        return new setRandom(bArr);
    }

    static boolean AudioAttributesCompatParcelizer(byte[] bArr) {
        if (bArr.length <= 0) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & 128) == 0;
        }
        return z;
    }

    private static String write(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & 127));
                if ((b & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                if ((b & 128) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (this == setmsdelay) {
            return true;
        }
        if (setmsdelay instanceof setRandom) {
            return SampleVideosRSModel.write(this.read, ((setRandom) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 13, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    private String read() {
        String str;
        synchronized (this) {
            if (this.write == null) {
                this.write = write(this.read);
            }
            str = this.write;
        }
        return str;
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }

    public String toString() {
        return read();
    }
}
