package in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder;

import in.juspay.widget.qrscanner.com.google.zxing.FormatException;
import in.juspay.widget.qrscanner.com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes5.dex */
final class BitMatrixParser {
    private final BitMatrix a;
    private Version b;
    private FormatInformation c;
    private boolean d;

    BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height < 21 || (height & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.a = bitMatrix;
    }

    private int a(int i, int i2, int i3) {
        boolean z = this.d;
        BitMatrix bitMatrix = this.a;
        return z ? bitMatrix.get(i2, i) : bitMatrix.get(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    final void a() {
        int i = 0;
        while (i < this.a.getWidth()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.a.getHeight(); i3++) {
                if (this.a.get(i, i3) != this.a.get(i3, i)) {
                    this.a.flip(i3, i);
                    this.a.flip(i, i3);
                }
            }
            i = i2;
        }
    }

    final void a(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }

    final byte[] b() throws FormatException {
        FormatInformation formatInformationC = c();
        Version versionD = d();
        DataMask dataMask = DataMask.values()[formatInformationC.a()];
        int height = this.a.getHeight();
        dataMask.a(this.a, height);
        BitMatrix bitMatrixA = versionD.a();
        byte[] bArr = new byte[versionD.getTotalCodewords()];
        int i = height - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!bitMatrixA.get(i9, i7)) {
                        i5++;
                        i4 <<= 1;
                        if (this.a.get(i9, i7)) {
                            i4 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i3] = (byte) i4;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == versionD.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    final FormatInformation c() throws FormatException {
        FormatInformation formatInformation = this.c;
        if (formatInformation != null) {
            return formatInformation;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i = 0; i < 6; i++) {
            iA2 = a(i, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iA3 = a(8, i2, iA3);
        }
        int height = this.a.getHeight();
        for (int i3 = height - 1; i3 >= height - 7; i3--) {
            iA = a(8, i3, iA);
        }
        for (int i4 = height - 8; i4 < height; i4++) {
            iA = a(i4, 8, iA);
        }
        FormatInformation formatInformationA = FormatInformation.a(iA3, iA);
        this.c = formatInformationA;
        if (formatInformationA != null) {
            return formatInformationA;
        }
        throw FormatException.getFormatInstance();
    }

    final Version d() throws FormatException {
        Version version = this.b;
        if (version != null) {
            return version;
        }
        int height = this.a.getHeight();
        int i = (height - 17) / 4;
        if (i <= 6) {
            return Version.getVersionForNumber(i);
        }
        int i2 = height - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = height - 9; i4 >= i2; i4--) {
                iA2 = a(i4, i3, iA2);
            }
        }
        Version versionA = Version.a(iA2);
        if (versionA != null && versionA.getDimensionForVersion() == height) {
            this.b = versionA;
            return versionA;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = height - 9; i6 >= i2; i6--) {
                iA = a(i5, i6, iA);
            }
        }
        Version versionA2 = Version.a(iA);
        if (versionA2 == null || versionA2.getDimensionForVersion() != height) {
            throw FormatException.getFormatInstance();
        }
        this.b = versionA2;
        return versionA2;
    }

    final void e() {
        if (this.c == null) {
            return;
        }
        DataMask.values()[this.c.a()].a(this.a, this.a.getHeight());
    }
}
