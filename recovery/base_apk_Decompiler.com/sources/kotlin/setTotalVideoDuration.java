package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setTotalVideoDuration extends setMsDelay {
    private char[] IconCompatParcelizer;

    static {
        new setScaleType(setTotalVideoDuration.class) { // from class: o.setTotalVideoDuration.1
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setTotalVideoDuration.read(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    setTotalVideoDuration(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 << 1;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.IconCompatParcelizer = cArr;
    }

    setTotalVideoDuration(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.IconCompatParcelizer = cArr;
    }

    static setTotalVideoDuration read(byte[] bArr) {
        return new VideoPlayerException(bArr);
    }

    static setTotalVideoDuration RemoteActionCompatParcelizer(char[] cArr) {
        return new VideoPlayerException(cArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof setTotalVideoDuration) {
            return SampleVideosRSModel.read(this.IconCompatParcelizer, ((setTotalVideoDuration) setmsdelay).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        int length = this.IconCompatParcelizer.length;
        setminimumwidthmargin.write(z, 30);
        setminimumwidthmargin.RemoteActionCompatParcelizer(length << 1);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            char[] cArr = this.IconCompatParcelizer;
            char c = cArr[i];
            char c2 = cArr[i + 1];
            char c3 = cArr[i + 2];
            char c4 = cArr[i + 3];
            i += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            setminimumwidthmargin.IconCompatParcelizer(bArr, 0, 8);
        }
        if (i >= length) {
            return;
        }
        int i2 = 0;
        while (true) {
            char c5 = this.IconCompatParcelizer[i];
            i++;
            bArr[i2] = (byte) (c5 >> '\b');
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) c5;
            if (i >= length) {
                setminimumwidthmargin.IconCompatParcelizer(bArr, 0, i3);
                return;
            }
            i2 = i3;
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.IconCompatParcelizer.length << 1);
    }

    private String RemoteActionCompatParcelizer() {
        return new String(this.IconCompatParcelizer);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.IconCompatParcelizer);
    }

    public String toString() {
        return RemoteActionCompatParcelizer();
    }
}
