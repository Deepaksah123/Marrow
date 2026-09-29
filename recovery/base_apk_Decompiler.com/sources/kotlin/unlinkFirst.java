package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes2.dex */
public final class unlinkFirst {
    public static boolean AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * TsExtractor.TS_PACKET_SIZE) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 5) {
            return C.TIME_UNSET;
        }
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if ((8388608 & iMediaBrowserCompatItemReceiver) != 0 || ((2096896 & iMediaBrowserCompatItemReceiver) >> 8) != i2 || (iMediaBrowserCompatItemReceiver & 32) == 0 || asPropertyTypeDeserializer.onPlayFromMediaId() < 7 || asPropertyTypeDeserializer.IconCompatParcelizer() < 7 || (asPropertyTypeDeserializer.onPlayFromMediaId() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        asPropertyTypeDeserializer.write(bArr, 0, 6);
        return read(bArr);
    }

    private static long read(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
