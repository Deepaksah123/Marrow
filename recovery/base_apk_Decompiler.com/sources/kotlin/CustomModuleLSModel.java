package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomModuleLSModel {
    private static final short[] IconCompatParcelizer = new short[128];
    private static final byte[] RemoteActionCompatParcelizer;

    static {
        byte[] bArr = new byte[112];
        RemoteActionCompatParcelizer = bArr;
        byte[] bArr2 = new byte[128];
        RemoteActionCompatParcelizer(bArr2, 0, 15, (byte) 1);
        RemoteActionCompatParcelizer(bArr2, 16, 31, (byte) 2);
        RemoteActionCompatParcelizer(bArr2, 32, 63, (byte) 3);
        RemoteActionCompatParcelizer(bArr2, 64, 65, (byte) 0);
        RemoteActionCompatParcelizer(bArr2, 66, 95, (byte) 4);
        RemoteActionCompatParcelizer(bArr2, 96, 96, (byte) 5);
        RemoteActionCompatParcelizer(bArr2, 97, 108, (byte) 6);
        RemoteActionCompatParcelizer(bArr2, 109, 109, (byte) 7);
        RemoteActionCompatParcelizer(bArr2, 110, 111, (byte) 6);
        RemoteActionCompatParcelizer(bArr2, 112, 112, (byte) 8);
        RemoteActionCompatParcelizer(bArr2, 113, 115, (byte) 9);
        RemoteActionCompatParcelizer(bArr2, 116, 116, (byte) 10);
        RemoteActionCompatParcelizer(bArr2, 117, 127, (byte) 0);
        RemoteActionCompatParcelizer(bArr, 0, 111, (byte) -2);
        RemoteActionCompatParcelizer(bArr, 8, 11, (byte) -1);
        RemoteActionCompatParcelizer(bArr, 24, 27, (byte) 0);
        RemoteActionCompatParcelizer(bArr, 40, 43, (byte) 16);
        RemoteActionCompatParcelizer(bArr, 58, 59, (byte) 0);
        RemoteActionCompatParcelizer(bArr, 72, 73, (byte) 0);
        RemoteActionCompatParcelizer(bArr, 89, 91, (byte) 16);
        RemoteActionCompatParcelizer(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, TarConstants.LF_NORMAL, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            IconCompatParcelizer[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    private static void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }

    private static int IconCompatParcelizer(byte[] bArr, int i, char[] cArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                short s = IconCompatParcelizer[b & 127];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i4 >= i) {
                        return -1;
                    }
                    byte b3 = bArr[i4];
                    i5 = (i5 << 6) | (b3 & 63);
                    b2 = RemoteActionCompatParcelizer[b2 + ((b3 & 255) >>> 4)];
                    i4++;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i5 <= 65535) {
                    if (i3 >= cArr.length) {
                        return -1;
                    }
                    cArr[i3] = (char) i5;
                } else {
                    if (i3 >= cArr.length - 1) {
                        return -1;
                    }
                    cArr[i3] = (char) ((i5 >>> 10) + 55232);
                    cArr[i3 + 1] = (char) ((i5 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) | 56320);
                    i3 += 2;
                    i2 = i4;
                }
            } else {
                if (i3 >= cArr.length) {
                    return -1;
                }
                cArr[i3] = (char) b;
            }
            i3++;
            i2 = i4;
        }
        return i3;
    }

    public static int IconCompatParcelizer(byte[] bArr, char[] cArr) {
        return IconCompatParcelizer(bArr, bArr.length, cArr);
    }
}
