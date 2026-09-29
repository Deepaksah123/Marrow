package kotlin;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class setMinimumWidthMargin {
    private OutputStream IconCompatParcelizer;

    setMinimumWidthMargin(OutputStream outputStream) {
        this.IconCompatParcelizer = outputStream;
    }

    static int IconCompatParcelizer(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    static int read(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static setMinimumWidthMargin AudioAttributesCompatParcelizer(OutputStream outputStream) {
        return new setMinimumWidthMargin(outputStream);
    }

    public static setMinimumWidthMargin read(OutputStream outputStream, String str) {
        return str.equals("DER") ? new VideoDownloadFGService(outputStream) : str.equals("DL") ? new PaginatedSyncTask(outputStream) : new setMinimumWidthMargin(outputStream);
    }

    static int RemoteActionCompatParcelizer(boolean z, int i) {
        return (z ? 1 : 0) + IconCompatParcelizer(i) + i;
    }

    VideoDownloadFGService read() {
        return new VideoDownloadFGService(this.IconCompatParcelizer);
    }

    PaginatedSyncTask write() {
        return new PaginatedSyncTask(this.IconCompatParcelizer);
    }

    final void write(int i) throws IOException {
        this.IconCompatParcelizer.write(i);
    }

    final void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        this.IconCompatParcelizer.write(bArr, i, i2);
    }

    final void RemoteActionCompatParcelizer(int i) throws IOException {
        if (i < 128) {
            write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                IconCompatParcelizer(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    void write(LottieRatingBar[] lottieRatingBarArr) throws IOException {
        for (LottieRatingBar lottieRatingBar : lottieRatingBarArr) {
            lottieRatingBar.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(this, true);
        }
    }

    final void IconCompatParcelizer(boolean z, byte b) throws IOException {
        write(z, 1);
        RemoteActionCompatParcelizer(1);
        write(b);
    }

    final void IconCompatParcelizer(boolean z, byte b, byte[] bArr, int i, int i2) throws IOException {
        write(true, 3);
        RemoteActionCompatParcelizer(i2 + 1);
        write(b);
        IconCompatParcelizer(bArr, i, i2);
    }

    final void read(boolean z, int i, byte[] bArr) throws IOException {
        write(z, i);
        RemoteActionCompatParcelizer(bArr.length);
        IconCompatParcelizer(bArr, 0, bArr.length);
    }

    final void RemoteActionCompatParcelizer(boolean z, int i, byte[] bArr, int i2, int i3) throws IOException {
        write(z, i);
        RemoteActionCompatParcelizer(i3);
        IconCompatParcelizer(bArr, i2, i3);
    }

    final void read(boolean z, byte[] bArr, int i, byte b) throws IOException {
        write(z, 3);
        RemoteActionCompatParcelizer(i + 1);
        IconCompatParcelizer(bArr, 0, i);
        write(b);
    }

    final void read(boolean z, int i, LottieRatingBar[] lottieRatingBarArr) throws IOException {
        write(z, i);
        write(128);
        write(lottieRatingBarArr);
        write(0);
        write(0);
    }

    final void write(boolean z, int i) throws IOException {
        if (z) {
            write(i);
        }
    }

    final void IconCompatParcelizer(int i, int i2) throws IOException {
        if (i2 < 31) {
            write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        IconCompatParcelizer(bArr, i4, 6 - i4);
    }

    void RemoteActionCompatParcelizer(setMsDelay setmsdelay) throws IOException {
        setmsdelay.RemoteActionCompatParcelizer(this, true);
    }

    void AudioAttributesCompatParcelizer(setMsDelay[] setmsdelayArr) throws IOException {
        for (setMsDelay setmsdelay : setmsdelayArr) {
            setmsdelay.RemoteActionCompatParcelizer(this, true);
        }
    }
}
