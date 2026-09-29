package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class paint8BitPixelCodeString {
    public long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public Object write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[12];
    private final float[] AudioAttributesImplBaseParcelizer = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public paint8BitPixelCodeString(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.RatingCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplApi21Parcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                iArr[i3] = 32;
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                int i5 = i4 - 1;
                this.AudioAttributesImplApi21Parcelizer = i5;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.MediaBrowserCompatCustomActionResultReceiver[i5];
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                int i7 = i6 - 1;
                this.AudioAttributesImplApi21Parcelizer = i7;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[i6 - 2] = jArr3[i6 - 2] ^ jArr3[i7];
                return 0;
            case 5:
                int i8 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i8;
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                jArr4[8] = jArr4[i8];
                return 0;
            case 6:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                iArr2[i9] = this.IconCompatParcelizer;
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                iArr3[i10] = 0;
                return 0;
            case 8:
                int i11 = this.AudioAttributesImplApi21Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11;
                this.MediaBrowserCompatItemReceiver = i11;
                return 0;
            case 9:
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i12 + 1;
                this.RemoteActionCompatParcelizer = iArr4[i12];
                return 0;
            case 10:
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = i13 - 1;
                this.AudioAttributesImplApi21Parcelizer = i14;
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr5[i13 - 2] = iArr5[i13 - 2] + iArr5[i14];
                return 0;
            case 11:
                Object[] objArr = this.RatingCompat;
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i15 + 1;
                objArr[i15] = this.read;
                return 0;
            case 12:
                Object[] objArr2 = this.RatingCompat;
                int i16 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i16 + 1;
                Object obj = objArr2[i16];
                objArr2[i16] = null;
                this.write = obj;
                return 0;
            case 13:
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i17 + 1;
                jArr5[i17] = jArr5[8];
                return 0;
            case 14:
                Object[] objArr3 = this.RatingCompat;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i18 + 1;
                objArr3[i18] = objArr3[i18 - 1];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i19;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                this.RemoteActionCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.RatingCompat;
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr5[i20 - 1];
                objArr5[i20 - 1] = null;
                Object obj4 = objArr5[i20 - 2];
                objArr5[i20 - 2] = null;
                objArr5[i20 - 1] = obj4;
                objArr5[i20 - 2] = obj3;
                return 0;
            case 17:
                int i21 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i21;
                this.RatingCompat[i21] = null;
                return 0;
            case 18:
                Object[] objArr6 = this.RatingCompat;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr6[i22 - 1];
                objArr6[i22 - 1] = null;
                this.write = obj5;
                return 0;
            case 19:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                iArr6[i23] = 2;
                return 0;
            case 20:
                Object[] objArr7 = this.RatingCompat;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i24 - 1] = jArr6[i24 - 2];
                objArr7[i24 - 2] = obj6;
                this.AudioAttributesImplApi21Parcelizer = i24;
                objArr7[i24] = null;
                return 0;
            case 21:
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                this.AudioAttributesCompatParcelizer = jArr7[i25];
                return 0;
            case 22:
                Object[] objArr8 = this.RatingCompat;
                int i26 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i26 + 1;
                Object obj7 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                objArr8[i26] = obj7;
                Object obj8 = objArr8[i26 - 2];
                objArr8[i26 - 2] = null;
                objArr8[i26 - 1] = obj8;
                objArr8[i26 - 2] = obj7;
                return 0;
            case 23:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i27] = 1;
                Object[] objArr9 = this.RatingCompat;
                Object obj9 = objArr9[i27 - 1];
                objArr9[i27 - 1] = null;
                objArr9[i27] = obj9;
                iArr7[i27 - 1] = iArr7[i27];
                int i28 = i27 - 2;
                this.AudioAttributesImplApi21Parcelizer = i28;
                Object obj10 = objArr9[i28];
                objArr9[i28] = null;
                int i29 = iArr7[i27 - 1];
                Object obj11 = objArr9[i27];
                objArr9[i27] = null;
                ((Object[]) obj10)[i29] = obj11;
                return 0;
            case 24:
                Object[] objArr10 = this.RatingCompat;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                Object obj12 = objArr10[i30 - 1];
                objArr10[i30 - 1] = null;
                Object obj13 = objArr10[i30 - 2];
                objArr10[i30 - 2] = null;
                objArr10[i30 - 1] = obj13;
                objArr10[i30 - 2] = obj12;
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i30 + 1;
                iArr8[i30] = 0;
                return 0;
            case 25:
                Object[] objArr11 = this.RatingCompat;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                Object obj14 = objArr11[i31 - 2];
                objArr11[i31 - 2] = null;
                objArr11[i31 - 1] = obj14;
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i31 - 2] = iArr9[i31 - 1];
                return 0;
            case 26:
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = i32 - 3;
                this.AudioAttributesImplApi21Parcelizer = i33;
                Object[] objArr12 = this.RatingCompat;
                Object obj15 = objArr12[i33];
                objArr12[i33] = null;
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver[i32 - 2];
                Object obj16 = objArr12[i32 - 1];
                objArr12[i32 - 1] = null;
                ((Object[]) obj15)[i34] = obj16;
                return 0;
            case 27:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i35 + 1;
                iArr10[i35] = 1;
                return 0;
            case 28:
                Object[] objArr13 = this.RatingCompat;
                int i36 = this.AudioAttributesImplApi21Parcelizer;
                Object obj17 = objArr13[i36 - 1];
                objArr13[i36 - 1] = null;
                Object obj18 = objArr13[i36 - 2];
                objArr13[i36 - 2] = null;
                objArr13[i36 - 1] = obj18;
                objArr13[i36 - 2] = obj17;
                this.AudioAttributesImplApi21Parcelizer = i36 + 1;
                objArr13[i36] = null;
                Object obj19 = objArr13[i36];
                objArr13[i36] = null;
                Object obj20 = objArr13[i36 - 1];
                objArr13[i36 - 1] = null;
                objArr13[i36] = obj20;
                objArr13[i36 - 1] = obj19;
                return 0;
            case 29:
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = i37 - 1;
                this.AudioAttributesImplApi21Parcelizer = i38;
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr11[i37 - 2] = iArr11[i37 - 2] % iArr11[i38];
                int i39 = i37 - 2;
                this.AudioAttributesImplApi21Parcelizer = i39;
                this.RatingCompat[i39] = null;
                return 0;
            case 31:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i40 + 1;
                iArr12[i40] = 73;
            case 30:
                return 0;
            case 32:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i41 + 1;
                iArr13[i41] = iArr13[i41 - 1];
                return 0;
            case 33:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                iArr14[i42] = 128;
                this.AudioAttributesImplApi21Parcelizer = i42;
                iArr14[i42 - 1] = iArr14[i42 - 1] % iArr14[i42];
                return 0;
            case 34:
                int i43 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i43;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i43] == 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i44] = 2;
                this.AudioAttributesImplApi21Parcelizer = i44;
                iArr15[i44 - 1] = iArr15[i44 - 1] % iArr15[i44];
                return 0;
            case 36:
                Object[] objArr14 = this.RatingCompat;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i45 + 1;
                objArr14[i45] = null;
                return 0;
            case 37:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i46 + 1;
                iArr16[i46] = 47;
                return 0;
            case 38:
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = i47 - 1;
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i47 - 2] = iArr17[i47 - 2] + iArr17[i48];
                this.AudioAttributesImplApi21Parcelizer = i47;
                iArr17[i48] = iArr17[i47 - 2];
                return 0;
            case 39:
                int i49 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i49;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i49] != 0 ? 0 : 1;
                return 0;
            case 40:
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = i50 - 1;
                this.AudioAttributesImplApi21Parcelizer = i51;
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr18[i50 - 2] = iArr18[i50 - 2] % iArr18[i51];
                return 0;
            case 41:
                long[] jArr8 = this.AudioAttributesImplApi26Parcelizer;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                jArr8[i52] = jArr8[10];
                return 0;
            case 42:
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i53 + 1;
                iArr19[i53] = 23;
                return 0;
            case 43:
                int i54 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = i54 - 1;
                this.AudioAttributesImplApi21Parcelizer = i55;
                long[] jArr9 = this.AudioAttributesImplApi26Parcelizer;
                jArr9[i54 - 2] = jArr9[i54 - 2] >> this.MediaBrowserCompatCustomActionResultReceiver[i55];
                return 0;
            case 44:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i56] = 0;
                this.AudioAttributesImplApi21Parcelizer = i56 + 2;
                iArr20[i56 + 1] = 1;
                return 0;
            case 45:
                int i57 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = i57 - 1;
                this.AudioAttributesImplApi21Parcelizer = i58;
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i57 - 2] = iArr21[i57 - 2] >> iArr21[i58];
                return 0;
            case 46:
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i59 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i59;
                this.RemoteActionCompatParcelizer = iArr22[i59];
                return 0;
            case 47:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i60 + 1;
                iArr23[i60] = 93;
                return 0;
            case 48:
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i61 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i61 + 1;
                iArr24[i61] = 66;
                return 0;
            case 49:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i62 + 1;
                iArr25[i62] = 55;
                return 0;
            case 50:
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i63 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i63 + 1;
                iArr26[i63] = 44;
                return 0;
            case 51:
                for (int i64 = this.AudioAttributesImplApi21Parcelizer - 1; i64 >= 0; i64--) {
                    this.RatingCompat[i64] = null;
                }
                Object[] objArr15 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr15[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
