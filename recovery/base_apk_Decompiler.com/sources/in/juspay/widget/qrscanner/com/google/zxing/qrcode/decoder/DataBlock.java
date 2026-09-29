package in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder;

import in.juspay.widget.qrscanner.com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: loaded from: classes5.dex */
final class DataBlock {
    private final int a;
    private final byte[] b;

    private DataBlock(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    static DataBlock[] a(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != version.getTotalCodewords()) {
            throw new IllegalArgumentException();
        }
        Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
        Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int count = 0;
        for (Version.ECB ecb : eCBlocks) {
            count += ecb.getCount();
        }
        DataBlock[] dataBlockArr = new DataBlock[count];
        int i = 0;
        for (Version.ECB ecb2 : eCBlocks) {
            int i2 = 0;
            while (i2 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i] = new DataBlock(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i2++;
                i++;
            }
        }
        int length = dataBlockArr[0].b.length;
        do {
            count--;
            if (count < 0) {
                break;
            }
        } while (dataBlockArr[count].b.length != length);
        int i3 = count + 1;
        int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
        int i4 = 0;
        for (int i5 = 0; i5 < eCCodewordsPerBlock; i5++) {
            int i6 = 0;
            while (i6 < i) {
                dataBlockArr[i6].b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        int i7 = i3;
        while (i7 < i) {
            dataBlockArr[i7].b[eCCodewordsPerBlock] = bArr[i4];
            i7++;
            i4++;
        }
        int length2 = dataBlockArr[0].b.length;
        while (eCCodewordsPerBlock < length2) {
            int i8 = 0;
            while (i8 < i) {
                dataBlockArr[i8].b[i8 < i3 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i4];
                i8++;
                i4++;
            }
            eCCodewordsPerBlock++;
        }
        return dataBlockArr;
    }

    final byte[] a() {
        return this.b;
    }

    final int b() {
        return this.a;
    }
}
