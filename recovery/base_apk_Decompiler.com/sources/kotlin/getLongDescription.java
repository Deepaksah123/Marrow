package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class getLongDescription {
    private byte[] AudioAttributesCompatParcelizer = {TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, 56, 57, 97, 98, 99, 100, 101, 102};
    private byte[] RemoteActionCompatParcelizer = new byte[128];

    public getLongDescription() {
        RemoteActionCompatParcelizer();
    }

    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = 0;
        int i4 = i2;
        while (i4 > 0) {
            int iMin = Math.min(36, i4);
            outputStream.write(bArr2, 0, write(bArr, i3, iMin, bArr2));
            i3 += iMin;
            i4 -= iMin;
        }
        return i2 << 1;
    }

    private int write(byte[] bArr, int i, int i2, byte[] bArr2) throws IOException {
        int i3 = 0;
        int i4 = i;
        while (i4 < i2 + i) {
            byte b = bArr[i4];
            byte[] bArr3 = this.AudioAttributesCompatParcelizer;
            bArr2[i3] = bArr3[(b & 255) >>> 4];
            bArr2[i3 + 1] = bArr3[b & 15];
            i4++;
            i3 += 2;
        }
        return i3;
    }

    private void RemoteActionCompatParcelizer() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.AudioAttributesCompatParcelizer;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.RemoteActionCompatParcelizer;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.RemoteActionCompatParcelizer[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
