package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class ResetLessonResponseBody {
    public Object AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public int write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[7];
    private final long[] AudioAttributesImplApi26Parcelizer = new long[7];
    private final float[] AudioAttributesImplBaseParcelizer = new float[7];
    private final double[] MediaBrowserCompatCustomActionResultReceiver = new double[7];

    public ResetLessonResponseBody(Object obj, Object obj2) {
        Object[] objArr = new Object[7];
        this.MediaMetadataCompat = objArr;
        objArr[3] = obj;
        objArr[4] = obj2;
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaMetadataCompat;
                int i2 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i2 + 1;
                objArr[i2] = this.read;
                return 0;
            case 2:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i3 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i3 + 1;
                objArr2[i3] = objArr2[4];
                return 0;
            case 3:
                int i4 = this.IconCompatParcelizer - this.RemoteActionCompatParcelizer;
                this.IconCompatParcelizer = i4;
                this.MediaBrowserCompatItemReceiver = i4;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i5 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i5 + 1;
                Object obj = objArr3[i5];
                objArr3[i5] = null;
                this.AudioAttributesCompatParcelizer = obj;
                return 0;
            case 5:
                Object[] objArr4 = this.MediaMetadataCompat;
                int i6 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i6 + 1;
                objArr4[i6] = objArr4[3];
                return 0;
            case 6:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i7 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i7 + 1;
                iArr[i7] = this.RemoteActionCompatParcelizer;
                return 0;
            case 7:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i8 + 1;
                this.write = iArr2[i8];
                return 0;
            case 8:
                int i9 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i9;
                Object[] objArr5 = this.MediaMetadataCompat;
                Object obj2 = objArr5[i9];
                objArr5[i9] = null;
                objArr5[5] = obj2;
                return 0;
            case 9:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i10 = this.IconCompatParcelizer;
                objArr6[i10] = objArr6[i10 - 1];
                this.IconCompatParcelizer = i10;
                Object obj3 = objArr6[i10];
                objArr6[i10] = null;
                objArr6[6] = obj3;
                return 0;
            case 10:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i11 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i11 + 1;
                objArr7[i11] = objArr7[5];
                return 0;
            case 11:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i12 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i12 + 1;
                objArr8[i12] = objArr8[6];
                return 0;
            case 12:
                int i13 = this.IconCompatParcelizer;
                int i14 = i13 - 1;
                Object[] objArr9 = this.MediaMetadataCompat;
                Object obj4 = objArr9[i14];
                objArr9[i14] = null;
                objArr9[5] = obj4;
                this.IconCompatParcelizer = i13;
                objArr9[i14] = objArr9[3];
                return 0;
            case 13:
                int i15 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i15;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj5 = objArr10[i15];
                objArr10[i15] = null;
                this.write = obj5 == null ? 0 : 1;
                return 0;
            case 14:
                int i16 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i16;
                this.write = this.AudioAttributesImplApi21Parcelizer[i16] == 0 ? 0 : 1;
                return 0;
            case 15:
                int i17 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i17;
                this.MediaMetadataCompat[i17] = null;
                return 0;
            case 16:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i18 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i18 + 1;
                objArr11[i18] = objArr11[i18 - 1];
                return 0;
            case 17:
                int i19 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i19;
                Object[] objArr12 = this.MediaMetadataCompat;
                Object obj6 = objArr12[i19];
                objArr12[i19] = null;
                objArr12[6] = obj6;
                return 0;
            case 18:
                Object[] objArr13 = this.MediaMetadataCompat;
                int i20 = this.IconCompatParcelizer;
                Object obj7 = objArr13[i20 - 1];
                objArr13[i20 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj7;
                return 0;
            case 19:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i21 + 1;
                iArr3[i21] = 2;
                return 0;
            case 20:
                int i22 = this.IconCompatParcelizer;
                int i23 = i22 - 1;
                this.IconCompatParcelizer = i23;
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                iArr4[i22 - 2] = iArr4[i22 - 2] % iArr4[i23];
                return 0;
            case 21:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.IconCompatParcelizer;
                iArr5[i24] = 2;
                iArr5[i24 + 1] = 2;
                int i25 = i24 + 1;
                this.IconCompatParcelizer = i25;
                iArr5[i24] = iArr5[i24] % iArr5[i25];
                return 0;
            case 22:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i26 = this.IconCompatParcelizer;
                iArr6[i26] = 87;
                this.IconCompatParcelizer = i26;
                iArr6[i26 - 1] = iArr6[i26 - 1] + iArr6[i26];
                return 0;
            case 23:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i27 = this.IconCompatParcelizer;
                iArr7[i27] = iArr7[i27 - 1];
                this.IconCompatParcelizer = i27 + 2;
                iArr7[i27 + 1] = 128;
                return 0;
            case 24:
                int i28 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i28;
                this.write = this.AudioAttributesImplApi21Parcelizer[i28] != 0 ? 0 : 1;
                return 0;
            case 25:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.IconCompatParcelizer;
                iArr8[i29] = 3;
                iArr8[i29 + 1] = 3;
                int i30 = i29 + 1;
                this.IconCompatParcelizer = i30;
                iArr8[i29] = iArr8[i29] % iArr8[i30];
                return 0;
            case 26:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i31 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i31 + 1;
                iArr9[i31] = 63;
                return 0;
            case 27:
                int i32 = this.IconCompatParcelizer;
                int i33 = i32 - 1;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i32 - 2] = iArr10[i32 - 2] + iArr10[i33];
                iArr10[i33] = iArr10[i32 - 2];
                this.IconCompatParcelizer = i32 + 1;
                iArr10[i32] = 128;
                return 0;
            case 28:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.IconCompatParcelizer;
                iArr11[i34] = 2;
                this.IconCompatParcelizer = i34;
                iArr11[i34 - 1] = iArr11[i34 - 1] % iArr11[i34];
                return 0;
            case 29:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = this.IconCompatParcelizer;
                iArr12[i35] = 88;
                iArr12[i35 + 1] = 0;
                int i36 = i35 + 1;
                this.IconCompatParcelizer = i36;
                iArr12[i35] = iArr12[i35] / iArr12[i36];
                return 0;
            case 30:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i37 + 1;
                iArr13[i37] = 45;
                return 0;
            case 31:
                int i38 = this.IconCompatParcelizer;
                int i39 = i38 - 1;
                this.IconCompatParcelizer = i39;
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                iArr14[i38 - 2] = iArr14[i38 - 2] + iArr14[i39];
                return 0;
            case 32:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.IconCompatParcelizer;
                iArr15[i40] = iArr15[i40 - 1];
                iArr15[i40 + 1] = 128;
                int i41 = i40 + 1;
                this.IconCompatParcelizer = i41;
                iArr15[i40] = iArr15[i40] % iArr15[i41];
                return 0;
            case 33:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.IconCompatParcelizer;
                iArr16[i42] = 29;
                iArr16[i42 - 1] = iArr16[i42 - 1] + iArr16[i42];
                this.IconCompatParcelizer = i42 + 1;
                iArr16[i42] = iArr16[i42 - 1];
                return 0;
            case 34:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i43 + 1;
                iArr17[i43] = 128;
                return 0;
            case 35:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i44;
                this.write = iArr18[i44];
                return 0;
            case 36:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i45 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i45 + 1;
                iArr19[i45] = 28;
                return 0;
            case 37:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i46 + 1;
                iArr20[i46] = 59;
                return 0;
            case 38:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i47 + 1;
                iArr21[i47] = 1;
                return 0;
            case 39:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i48 + 1;
                iArr22[i48] = 0;
                return 0;
            case 40:
                for (int i49 = this.IconCompatParcelizer - 1; i49 >= 0; i49--) {
                    this.MediaMetadataCompat[i49] = null;
                }
                Object[] objArr14 = this.MediaMetadataCompat;
                this.IconCompatParcelizer = 1;
                objArr14[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
