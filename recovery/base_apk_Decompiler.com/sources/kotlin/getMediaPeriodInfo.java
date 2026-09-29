package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class getMediaPeriodInfo {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatCustomActionResultReceiver;
    private final long[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public long RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[12];
    private final float[] MediaBrowserCompatMediaItem = new float[12];
    private final double[] RatingCompat = new double[12];

    public getMediaPeriodInfo(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.MediaBrowserCompatItemReceiver = jArr;
        Object[] objArr = new Object[12];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaBrowserCompatItemReceiver;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplBaseParcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                iArr[i3] = 32;
                long[] jArr2 = this.MediaBrowserCompatItemReceiver;
                jArr2[i3 - 1] = jArr2[i3 - 1] << iArr[i3];
                int i4 = i3 - 1;
                this.AudioAttributesImplBaseParcelizer = i4;
                jArr2[i3 - 2] = jArr2[i3 - 2] ^ jArr2[i4];
                return 0;
            case 3:
                int i5 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i5;
                long[] jArr3 = this.MediaBrowserCompatItemReceiver;
                jArr3[8] = jArr3[i5];
                return 0;
            case 4:
                long[] jArr4 = this.MediaBrowserCompatItemReceiver;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i6 + 1;
                jArr4[i6] = this.RemoteActionCompatParcelizer;
                return 0;
            case 5:
                Object[] objArr = this.MediaMetadataCompat;
                int i7 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i7 + 1;
                objArr[i7] = this.IconCompatParcelizer;
                return 0;
            case 6:
                long[] jArr5 = this.MediaBrowserCompatItemReceiver;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                jArr5[i8] = 0;
                this.AudioAttributesImplBaseParcelizer = i8;
                this.AudioAttributesImplApi21Parcelizer[i8 - 1] = (jArr5[i8 - 1] > jArr5[i8] ? 1 : (jArr5[i8 - 1] == jArr5[i8] ? 0 : -1));
                return 0;
            case 7:
                int i9 = this.AudioAttributesImplBaseParcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i9;
                this.AudioAttributesImplApi26Parcelizer = i9;
                return 0;
            case 8:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i10 + 1;
                this.write = iArr2[i10];
                return 0;
            case 9:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i11 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i11 + 1;
                Object obj = objArr2[i11];
                objArr2[i11] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj;
                return 0;
            case 10:
                long[] jArr6 = this.MediaBrowserCompatItemReceiver;
                int i12 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i12 + 1;
                jArr6[i12] = jArr6[8];
                return 0;
            case 11:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i13 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i13 + 1;
                objArr3[i13] = objArr3[i13 - 1];
                return 0;
            case 12:
                int i14 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i14;
                Object[] objArr4 = this.MediaMetadataCompat;
                Object obj2 = objArr4[i14];
                objArr4[i14] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 13:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i15 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i15 - 1];
                objArr5[i15 - 1] = null;
                Object obj4 = objArr5[i15 - 2];
                objArr5[i15 - 2] = null;
                objArr5[i15 - 1] = obj4;
                objArr5[i15 - 2] = obj3;
                int i16 = i15 - 1;
                this.AudioAttributesImplBaseParcelizer = i16;
                objArr5[i16] = null;
                return 0;
            case 14:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i17 - 1];
                objArr6[i17 - 1] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj5;
                return 0;
            case 15:
                int i18 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i18;
                this.MediaMetadataCompat[i18] = null;
                return 0;
            case 16:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i19 + 1;
                iArr3[i19] = 2;
                return 0;
            case 17:
                long[] jArr7 = this.MediaBrowserCompatItemReceiver;
                int i20 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i20 + 1;
                this.read = jArr7[i20];
                return 0;
            case 18:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i21 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i21 - 1];
                objArr7[i21 - 1] = null;
                objArr7[i21] = obj6;
                long[] jArr8 = this.MediaBrowserCompatItemReceiver;
                jArr8[i21 - 1] = jArr8[i21 - 2];
                objArr7[i21 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i21;
                objArr7[i21] = null;
                return 0;
            case 19:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i22 - 1];
                objArr8[i22 - 1] = null;
                Object obj8 = objArr8[i22 - 2];
                objArr8[i22 - 2] = null;
                objArr8[i22 - 1] = obj8;
                objArr8[i22 - 2] = obj7;
                this.AudioAttributesImplBaseParcelizer = i22 + 1;
                Object obj9 = objArr8[i22 - 1];
                objArr8[i22 - 1] = null;
                objArr8[i22] = obj9;
                Object obj10 = objArr8[i22 - 2];
                objArr8[i22 - 2] = null;
                objArr8[i22 - 1] = obj10;
                objArr8[i22 - 2] = obj9;
                return 0;
            case 20:
                Object[] objArr9 = this.MediaMetadataCompat;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                Object obj11 = objArr9[i23 - 1];
                objArr9[i23 - 1] = null;
                Object obj12 = objArr9[i23 - 2];
                objArr9[i23 - 2] = null;
                objArr9[i23 - 1] = obj12;
                objArr9[i23 - 2] = obj11;
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                iArr4[i23] = 1;
                Object obj13 = objArr9[i23 - 1];
                objArr9[i23 - 1] = null;
                objArr9[i23] = obj13;
                iArr4[i23 - 1] = iArr4[i23];
                return 0;
            case 21:
                int i24 = this.AudioAttributesImplBaseParcelizer;
                int i25 = i24 - 3;
                this.AudioAttributesImplBaseParcelizer = i25;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj14 = objArr10[i25];
                objArr10[i25] = null;
                int i26 = this.AudioAttributesImplApi21Parcelizer[i24 - 2];
                Object obj15 = objArr10[i24 - 1];
                objArr10[i24 - 1] = null;
                ((Object[]) obj14)[i26] = obj15;
                return 0;
            case 22:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i27 + 1;
                Object obj16 = objArr11[i27 - 1];
                objArr11[i27 - 1] = null;
                objArr11[i27] = obj16;
                Object obj17 = objArr11[i27 - 2];
                objArr11[i27 - 2] = null;
                objArr11[i27 - 1] = obj17;
                objArr11[i27 - 2] = obj16;
                return 0;
            case 23:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                Object obj18 = objArr12[i28 - 1];
                objArr12[i28 - 1] = null;
                Object obj19 = objArr12[i28 - 2];
                objArr12[i28 - 2] = null;
                objArr12[i28 - 1] = obj19;
                objArr12[i28 - 2] = obj18;
                return 0;
            case 24:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                iArr5[i29] = 0;
                Object[] objArr13 = this.MediaMetadataCompat;
                Object obj20 = objArr13[i29 - 1];
                objArr13[i29 - 1] = null;
                objArr13[i29] = obj20;
                iArr5[i29 - 1] = iArr5[i29];
                int i30 = i29 - 2;
                this.AudioAttributesImplBaseParcelizer = i30;
                Object obj21 = objArr13[i30];
                objArr13[i30] = null;
                int i31 = iArr5[i29 - 1];
                Object obj22 = objArr13[i29];
                objArr13[i29] = null;
                ((Object[]) obj21)[i31] = obj22;
                return 0;
            case 25:
                Object[] objArr14 = this.MediaMetadataCompat;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                objArr14[i32] = objArr14[i32 - 1];
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i32 + 2;
                iArr6[i32 + 1] = 0;
                return 0;
            case 26:
                int i33 = this.AudioAttributesImplBaseParcelizer;
                int i34 = i33 - 3;
                this.AudioAttributesImplBaseParcelizer = i34;
                Object[] objArr15 = this.MediaMetadataCompat;
                Object obj23 = objArr15[i34];
                objArr15[i34] = null;
                int i35 = this.AudioAttributesImplApi21Parcelizer[i33 - 2];
                Object obj24 = objArr15[i33 - 1];
                objArr15[i33 - 1] = null;
                ((Object[]) obj23)[i35] = obj24;
                this.AudioAttributesImplBaseParcelizer = i33 - 2;
                objArr15[i34] = objArr15[i33 - 4];
                return 0;
            case 27:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i36 + 1;
                iArr7[i36] = 1;
                return 0;
            case 28:
                Object[] objArr16 = this.MediaMetadataCompat;
                int i37 = this.AudioAttributesImplBaseParcelizer;
                objArr16[i37] = objArr16[i37 - 1];
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i37 + 2;
                iArr8[i37 + 1] = 1;
                return 0;
            case 29:
                Object[] objArr17 = this.MediaMetadataCompat;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                Object obj25 = objArr17[i38 - 1];
                objArr17[i38 - 1] = null;
                Object obj26 = objArr17[i38 - 2];
                objArr17[i38 - 2] = null;
                objArr17[i38 - 1] = obj26;
                objArr17[i38 - 2] = obj25;
                this.AudioAttributesImplBaseParcelizer = i38 + 1;
                objArr17[i38] = null;
                return 0;
            case 30:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i39 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i39] = 2;
                this.AudioAttributesImplBaseParcelizer = i39 + 2;
                iArr9[i39 + 1] = 2;
                return 0;
            case 31:
                int i40 = this.AudioAttributesImplBaseParcelizer;
                int i41 = i40 - 1;
                this.AudioAttributesImplBaseParcelizer = i41;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i40 - 2] = iArr10[i40 - 2] % iArr10[i41];
                int i42 = i40 - 2;
                this.AudioAttributesImplBaseParcelizer = i42;
                this.MediaMetadataCompat[i42] = null;
                return 0;
            case 33:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                iArr11[i43] = this.AudioAttributesCompatParcelizer;
            case 32:
                return 0;
            case 34:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i44 + 1;
                iArr12[i44] = 45;
                return 0;
            case 35:
                int i45 = this.AudioAttributesImplBaseParcelizer;
                int i46 = i45 - 1;
                this.AudioAttributesImplBaseParcelizer = i46;
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i45 - 2] = iArr13[i45 - 2] + iArr13[i46];
                return 0;
            case 36:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i47] = iArr14[i47 - 1];
                this.AudioAttributesImplBaseParcelizer = i47 + 2;
                iArr14[i47 + 1] = 128;
                return 0;
            case 37:
                int i48 = this.AudioAttributesImplBaseParcelizer;
                int i49 = i48 - 1;
                this.AudioAttributesImplBaseParcelizer = i49;
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i48 - 2] = iArr15[i48 - 2] % iArr15[i49];
                return 0;
            case 38:
                int i50 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i50;
                this.write = this.AudioAttributesImplApi21Parcelizer[i50] != 0 ? 0 : 1;
                return 0;
            case 39:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i51 + 1;
                iArr16[i51] = 25;
                return 0;
            case 40:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.AudioAttributesImplBaseParcelizer;
                iArr17[i52] = iArr17[i52 - 1];
                iArr17[i52 + 1] = 128;
                int i53 = i52 + 1;
                this.AudioAttributesImplBaseParcelizer = i53;
                iArr17[i52] = iArr17[i52] % iArr17[i53];
                return 0;
            case 41:
                for (int i54 = this.AudioAttributesImplBaseParcelizer - 1; i54 >= 0; i54--) {
                    this.MediaMetadataCompat[i54] = null;
                }
                Object[] objArr18 = this.MediaMetadataCompat;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr18[0] = this.IconCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
