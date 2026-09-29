package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class MarrowFileException extends setIsTablet {
    private final setIsTablet[] AudioAttributesCompatParcelizer;
    private final int write;

    public MarrowFileException(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return true;
    }

    private MarrowFileException(byte[] bArr, byte b) {
        this(bArr, null, 1000);
    }

    private MarrowFileException(byte[] bArr, setIsTablet[] setistabletArr, int i) {
        super(bArr);
        this.AudioAttributesCompatParcelizer = setistabletArr;
        this.write = 1000;
    }

    public MarrowFileException(setIsTablet[] setistabletArr) {
        this(setistabletArr, (byte) 0);
    }

    private MarrowFileException(setIsTablet[] setistabletArr, byte b) {
        this(write(setistabletArr), setistabletArr, 1000);
    }

    static byte[] write(setIsTablet[] setistabletArr) {
        int length = setistabletArr.length;
        if (length == 0) {
            return read;
        }
        if (length == 1) {
            return setistabletArr[0].RemoteActionCompatParcelizer;
        }
        int length2 = 0;
        for (setIsTablet setistablet : setistabletArr) {
            length2 += setistablet.RemoteActionCompatParcelizer.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (setIsTablet setistablet2 : setistabletArr) {
            byte[] bArr2 = setistablet2.RemoteActionCompatParcelizer;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 36);
        setminimumwidthmargin.write(128);
        setIsTablet[] setistabletArr = this.AudioAttributesCompatParcelizer;
        if (setistabletArr != null) {
            setminimumwidthmargin.AudioAttributesCompatParcelizer(setistabletArr);
        } else {
            int i = 0;
            while (i < this.RemoteActionCompatParcelizer.length) {
                int iMin = Math.min(this.RemoteActionCompatParcelizer.length - i, this.write);
                EmptyBody.RemoteActionCompatParcelizer(setminimumwidthmargin, this.RemoteActionCompatParcelizer, i, iMin);
                i += iMin;
            }
        }
        setminimumwidthmargin.write(0);
        setminimumwidthmargin.write(0);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        int iWrite = z ? 4 : 3;
        if (this.AudioAttributesCompatParcelizer == null) {
            int length = this.RemoteActionCompatParcelizer.length;
            int i = this.write;
            int i2 = length / i;
            int iIconCompatParcelizer = iWrite + (EmptyBody.IconCompatParcelizer(i) * i2);
            int length2 = this.RemoteActionCompatParcelizer.length - (i2 * this.write);
            return length2 > 0 ? iIconCompatParcelizer + EmptyBody.IconCompatParcelizer(length2) : iIconCompatParcelizer;
        }
        int i3 = 0;
        while (true) {
            setIsTablet[] setistabletArr = this.AudioAttributesCompatParcelizer;
            if (i3 >= setistabletArr.length) {
                return iWrite;
            }
            iWrite += setistabletArr[i3].write(true);
            i3++;
        }
    }
}
