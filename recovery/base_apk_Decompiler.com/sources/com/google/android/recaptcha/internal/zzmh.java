package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmh {
    protected static final Charset zza = StandardCharsets.UTF_16;

    public static String zzb(String str, byte[] bArr, zzmi zzmiVar) {
        int i;
        int i2 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        char c = '\f';
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        int i3 = 16;
        int[] iArr2 = new int[16];
        int i4 = 0;
        while (true) {
            if (i4 >= 4) {
                break;
            }
            iArr2[i4] = zza(iArr[i4], 2131181306);
            i4++;
        }
        for (i = 4; i < 12; i++) {
            iArr2[i] = zze(bArr, (i - 4) << 2);
        }
        iArr2[12] = 1;
        for (int i5 = 13; i5 < 16; i5++) {
            iArr2[i5] = zze(bArr2, (i5 - 13) << 2);
        }
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        byte[] bArr4 = new byte[length];
        int i6 = 1;
        int i7 = length;
        int i8 = 0;
        while (i7 > 0) {
            System.arraycopy(iArr3, i2, iArr2, i2, i3);
            iArr2[c] = i6;
            int i9 = i2;
            while (i9 < 10) {
                int[] iArr4 = iArr3;
                int i10 = i6;
                zzc(0, 4, 8, 12, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(1, 5, 9, 13, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(2, 6, 10, 14, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(3, 7, 11, 15, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(0, 5, 10, 15, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(1, 6, 11, 12, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(2, 7, 8, 13, iArr, bArr, bArr2, i10, iArr2, iArr4);
                zzc(3, 4, 9, 14, iArr, bArr, bArr2, i10, iArr2, iArr4);
                i9++;
                i3 = i3;
                i7 = i7;
                bArr4 = bArr4;
                iArr3 = iArr4;
            }
            int i11 = i7;
            byte[] bArr5 = bArr4;
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr2;
            int i12 = i3;
            byte[] bArr6 = new byte[64];
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = iArr6[i13];
                int i15 = i13 << 2;
                bArr6[i15] = (byte) i14;
                bArr6[i15 + 1] = (byte) (i14 >> 8);
                bArr6[i15 + 2] = (byte) (i14 >> 16);
                bArr6[i15 + 3] = (byte) (i14 >>> 24);
            }
            for (int i16 = 0; i16 < Math.min(64, i11); i16++) {
                int i17 = i8 + i16;
                bArr5[i17] = (byte) zza(bArr6[i16], bArr3[i17]);
            }
            i6++;
            i7 = i11 - 64;
            i8 += 64;
            i3 = i12;
            bArr4 = bArr5;
            iArr3 = iArr5;
            iArr2 = iArr6;
            i2 = 0;
            c = '\f';
        }
        return new String(bArr4, zza);
    }

    protected static final void zzc(int i, int i2, int i3, int i4, int[] iArr, byte[] bArr, byte[] bArr2, int i5, int[] iArr2, int[] iArr3) {
        zzd(i, i2, i4, 16, iArr, bArr, bArr2, i5, iArr2, iArr3);
        zzd(i3, i4, i2, 12, iArr, bArr, bArr2, i5, iArr2, iArr3);
        zzd(i, i2, i4, 8, iArr, bArr, bArr2, i5, iArr2, iArr3);
        zzd(i3, i4, i2, 7, iArr, bArr, bArr2, i5, iArr2, iArr3);
    }

    private static final int zze(byte[] bArr, int i) {
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    protected static int zza(int i, int i2) {
        if (i % 2 != 0) {
            return (i | i2) - (i & i2);
        }
        return (i & (~i2)) | ((~i) & i2);
    }

    protected static final void zzd(int i, int i2, int i3, int i4, int[] iArr, byte[] bArr, byte[] bArr2, int i5, int[] iArr2, int[] iArr3) {
        int i6 = iArr2[i] + iArr2[i2];
        iArr2[i] = i6;
        int iZza = zza(iArr2[i3], i6);
        iArr2[i3] = (iZza >>> (32 - i4)) | (iZza << i4);
    }
}
