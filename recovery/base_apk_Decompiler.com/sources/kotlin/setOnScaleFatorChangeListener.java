package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOnScaleFatorChangeListener extends setMsDelay {
    private static final char[] RemoteActionCompatParcelizer;
    private byte[] AudioAttributesCompatParcelizer;

    static {
        new setScaleType(setOnScaleFatorChangeListener.class) { // from class: o.setOnScaleFatorChangeListener.3
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setOnScaleFatorChangeListener.AudioAttributesCompatParcelizer(emptyBody.read());
            }
        };
        RemoteActionCompatParcelizer = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setOnScaleFatorChangeListener(byte[] bArr, boolean z) {
        this.AudioAttributesCompatParcelizer = bArr;
    }

    static setOnScaleFatorChangeListener AudioAttributesCompatParcelizer(byte[] bArr) {
        return new getNetworkObserver(bArr);
    }

    private static void write(StringBuffer stringBuffer, int i) {
        char[] cArr = RemoteActionCompatParcelizer;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    private static void IconCompatParcelizer(StringBuffer stringBuffer, int i) {
        int i2;
        if (i < 128) {
            write(stringBuffer, i);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 5;
        while (true) {
            i2 = i3 - 1;
            bArr[i2] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                break;
            } else {
                i3 = i2;
            }
        }
        int i4 = i3 - 2;
        bArr[i4] = (byte) ((5 - i2) | 128);
        while (true) {
            int i5 = i4 + 1;
            write(stringBuffer, bArr[i4]);
            if (i5 >= 5) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setOnScaleFatorChangeListener) {
            return SampleVideosRSModel.write(this.AudioAttributesCompatParcelizer, ((setOnScaleFatorChangeListener) setmsdelay).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 28, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.AudioAttributesCompatParcelizer.length);
    }

    private String RemoteActionCompatParcelizer() {
        int length = this.AudioAttributesCompatParcelizer.length;
        StringBuffer stringBuffer = new StringBuffer(((setMinimumWidthMargin.IconCompatParcelizer(length) + length) << 1) + 3);
        stringBuffer.append("#1C");
        IconCompatParcelizer(stringBuffer, length);
        for (int i = 0; i < length; i++) {
            write(stringBuffer, this.AudioAttributesCompatParcelizer[i]);
        }
        return stringBuffer.toString();
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.AudioAttributesCompatParcelizer);
    }

    public String toString() {
        return RemoteActionCompatParcelizer();
    }
}
