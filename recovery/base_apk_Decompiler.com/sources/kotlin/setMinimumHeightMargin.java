package kotlin;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public class setMinimumHeightMargin extends setMsDelay {
    private static final ConcurrentMap<RemoteActionCompatParcelizer, setMinimumHeightMargin> read;
    private String IconCompatParcelizer = null;
    private final byte[] write;

    static class RemoteActionCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final byte[] RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(byte[] bArr) {
            this.AudioAttributesCompatParcelizer = SampleVideosRSModel.write(bArr);
            this.RemoteActionCompatParcelizer = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof RemoteActionCompatParcelizer) {
                return SampleVideosRSModel.write(this.RemoteActionCompatParcelizer, ((RemoteActionCompatParcelizer) obj).RemoteActionCompatParcelizer);
            }
            return false;
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    static {
        new setScaleType(setMinimumHeightMargin.class) { // from class: o.setMinimumHeightMargin.5
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setMinimumHeightMargin.RemoteActionCompatParcelizer(emptyBody.read(), false);
            }
        };
        read = new ConcurrentHashMap();
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private setMinimumHeightMargin(byte[] bArr) {
        this.write = bArr;
    }

    static void RemoteActionCompatParcelizer(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    static setMinimumHeightMargin RemoteActionCompatParcelizer(byte[] bArr, boolean z) {
        RemoteActionCompatParcelizer(bArr.length);
        setMinimumHeightMargin setminimumheightmargin = read.get(new RemoteActionCompatParcelizer(bArr));
        if (setminimumheightmargin != null) {
            return setminimumheightmargin;
        }
        if (!setRandom.AudioAttributesCompatParcelizer(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z) {
            bArr = SampleVideosRSModel.RemoteActionCompatParcelizer(bArr);
        }
        return new setMinimumHeightMargin(bArr);
    }

    private static String RemoteActionCompatParcelizer(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & 127));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
                    sb.append(j2);
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
                        sb.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (this == setmsdelay) {
            return true;
        }
        if (setmsdelay instanceof setMinimumHeightMargin) {
            return SampleVideosRSModel.write(this.write, ((setMinimumHeightMargin) setmsdelay).write);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 6, this.write);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.write.length);
    }

    private String read() {
        String str;
        synchronized (this) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = RemoteActionCompatParcelizer(this.write);
            }
            str = this.IconCompatParcelizer;
        }
        return str;
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return SampleVideosRSModel.write(this.write);
    }

    public String toString() {
        return read();
    }
}
