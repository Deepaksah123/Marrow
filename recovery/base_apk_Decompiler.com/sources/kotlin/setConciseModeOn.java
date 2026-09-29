package kotlin;

import java.util.Arrays;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class setConciseModeOn {
    private static final byte[] IconCompatParcelizer;

    static {
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.Companion;
        IconCompatParcelizer = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").read();
        getRelatedModuleAdapter.Companion companion2 = getRelatedModuleAdapter.Companion;
        getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").read();
    }

    public static final byte[] IconCompatParcelizer(String str) {
        int i;
        char cCharAt;
        toMagicModuleMetaRepoModel.write(str, "");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                bArr[i5 + 1] = (byte) (i4 >> 8);
                bArr[i5 + 2] = (byte) i4;
                i5 += 3;
            }
        }
        int i7 = i3 % 4;
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i7 == 3) {
            int i8 = i4 << 6;
            bArr[i5] = (byte) (i8 >> 16);
            bArr[i5 + 1] = (byte) (i8 >> 8);
            i5 += 2;
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrCopyOf, "");
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String write(byte[] bArr, byte[] bArr2) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(bArr2, "");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            int i3 = i + 3;
            byte b3 = bArr[i + 2];
            bArr3[i2] = bArr2[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            bArr3[i2 + 3] = bArr2[b3 & 63];
            i2 += 4;
            i = i3;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return setMarkers.AudioAttributesCompatParcelizer(bArr3);
    }
}
