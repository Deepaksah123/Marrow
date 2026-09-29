package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class FlacExtractor {
    public long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public int write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[12];
    private final float[] AudioAttributesImplBaseParcelizer = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public FlacExtractor(Object obj, long j, long j2) {
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

    public int IconCompatParcelizer(int i) {
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
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.MediaBrowserCompatCustomActionResultReceiver[i4 - 1];
                jArr2[i4 - 3] = jArr2[i4 - 3] ^ jArr2[i4 - 2];
                int i5 = i4 - 3;
                this.AudioAttributesImplApi21Parcelizer = i5;
                jArr2[8] = jArr2[i5];
                return 0;
            case 4:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                iArr2[i6] = 1;
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplApi21Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i7;
                this.MediaBrowserCompatItemReceiver = i7;
                return 0;
            case 6:
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                int i8 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i8 + 1;
                this.AudioAttributesCompatParcelizer = jArr3[i8];
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                iArr3[i9] = this.IconCompatParcelizer;
                return 0;
            case 8:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                jArr4[i10] = 0;
                return 0;
            case 9:
                Object[] objArr = this.RatingCompat;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                objArr[i11] = this.read;
                return 0;
            case 10:
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = i12 - 1;
                this.AudioAttributesImplApi21Parcelizer = i13;
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i12 - 2] = iArr4[i12 - 2] - iArr4[i13];
                return 0;
            case 11:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i14 + 1;
                this.write = iArr5[i14];
                return 0;
            case 12:
                Object[] objArr2 = this.RatingCompat;
                int i15 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 13:
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i16 + 1;
                jArr5[i16] = jArr5[8];
                return 0;
            case 14:
                Object[] objArr3 = this.RatingCompat;
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 15:
                int i18 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i18;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.RatingCompat;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                Object obj4 = objArr5[i19 - 2];
                objArr5[i19 - 2] = null;
                objArr5[i19 - 1] = obj4;
                objArr5[i19 - 2] = obj3;
                return 0;
            case 17:
                int i20 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i20;
                this.RatingCompat[i20] = null;
                return 0;
            case 18:
                Object[] objArr6 = this.RatingCompat;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr6[i21 - 1];
                objArr6[i21 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 19:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i22 + 1;
                iArr6[i22] = 2;
                return 0;
            case 20:
                Object[] objArr7 = this.RatingCompat;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i23 - 1] = jArr6[i23 - 2];
                objArr7[i23 - 2] = obj6;
                return 0;
            case 21:
                Object[] objArr8 = this.RatingCompat;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                Object obj7 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                objArr8[i24] = obj7;
                Object obj8 = objArr8[i24 - 2];
                objArr8[i24 - 2] = null;
                objArr8[i24 - 1] = obj8;
                objArr8[i24 - 2] = obj7;
                Object obj9 = objArr8[i24];
                objArr8[i24] = null;
                Object obj10 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                objArr8[i24] = obj10;
                objArr8[i24 - 1] = obj9;
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i24 + 2;
                iArr7[i24 + 1] = 1;
                return 0;
            case 22:
                Object[] objArr9 = this.RatingCompat;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                Object obj11 = objArr9[i25 - 2];
                objArr9[i25 - 2] = null;
                objArr9[i25 - 1] = obj11;
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr8[i25 - 2] = iArr8[i25 - 1];
                int i26 = i25 - 3;
                this.AudioAttributesImplApi21Parcelizer = i26;
                Object obj12 = objArr9[i26];
                objArr9[i26] = null;
                int i27 = iArr8[i25 - 2];
                Object obj13 = objArr9[i25 - 1];
                objArr9[i25 - 1] = null;
                ((Object[]) obj12)[i27] = obj13;
                this.AudioAttributesImplApi21Parcelizer = i25 - 2;
                Object obj14 = objArr9[i25 - 4];
                objArr9[i25 - 4] = null;
                objArr9[i26] = obj14;
                Object obj15 = objArr9[i25 - 5];
                objArr9[i25 - 5] = null;
                objArr9[i25 - 4] = obj15;
                objArr9[i25 - 5] = obj14;
                return 0;
            case 23:
                Object[] objArr10 = this.RatingCompat;
                int i28 = this.AudioAttributesImplApi21Parcelizer;
                Object obj16 = objArr10[i28 - 1];
                objArr10[i28 - 1] = null;
                Object obj17 = objArr10[i28 - 2];
                objArr10[i28 - 2] = null;
                objArr10[i28 - 1] = obj17;
                objArr10[i28 - 2] = obj16;
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i28 + 1;
                iArr9[i28] = 0;
                return 0;
            case 24:
                Object[] objArr11 = this.RatingCompat;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                Object obj18 = objArr11[i29 - 2];
                objArr11[i29 - 2] = null;
                objArr11[i29 - 1] = obj18;
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr10[i29 - 2] = iArr10[i29 - 1];
                int i30 = i29 - 3;
                this.AudioAttributesImplApi21Parcelizer = i30;
                Object obj19 = objArr11[i30];
                objArr11[i30] = null;
                int i31 = iArr10[i29 - 2];
                Object obj20 = objArr11[i29 - 1];
                objArr11[i29 - 1] = null;
                ((Object[]) obj19)[i31] = obj20;
                return 0;
            case 25:
                Object[] objArr12 = this.RatingCompat;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                objArr12[i32] = objArr12[i32 - 1];
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i32 + 2;
                iArr11[i32 + 1] = 0;
                return 0;
            case 26:
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = i33 - 3;
                this.AudioAttributesImplApi21Parcelizer = i34;
                Object[] objArr13 = this.RatingCompat;
                Object obj21 = objArr13[i34];
                objArr13[i34] = null;
                int i35 = this.MediaBrowserCompatCustomActionResultReceiver[i33 - 2];
                Object obj22 = objArr13[i33 - 1];
                objArr13[i33 - 1] = null;
                ((Object[]) obj21)[i35] = obj22;
                return 0;
            case 27:
                Object[] objArr14 = this.RatingCompat;
                int i36 = this.AudioAttributesImplApi21Parcelizer;
                objArr14[i36] = objArr14[i36 - 1];
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i36 + 2;
                iArr12[i36 + 1] = 1;
                return 0;
            case 28:
                Object[] objArr15 = this.RatingCompat;
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i37 + 1;
                objArr15[i37] = null;
                Object obj23 = objArr15[i37];
                objArr15[i37] = null;
                Object obj24 = objArr15[i37 - 1];
                objArr15[i37 - 1] = null;
                objArr15[i37] = obj24;
                objArr15[i37 - 1] = obj23;
                return 0;
            case 29:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i38] = 2;
                this.AudioAttributesImplApi21Parcelizer = i38;
                iArr13[i38 - 1] = iArr13[i38 - 1] % iArr13[i38];
                return 0;
            case 30:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                iArr14[i39] = 2;
                this.AudioAttributesImplApi21Parcelizer = i39 + 2;
                iArr14[i39 + 1] = 2;
                return 0;
            case 31:
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = i40 - 1;
                this.AudioAttributesImplApi21Parcelizer = i41;
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr15[i40 - 2] = iArr15[i40 - 2] % iArr15[i41];
                int i42 = i40 - 2;
                this.AudioAttributesImplApi21Parcelizer = i42;
                this.RatingCompat[i42] = null;
                return 0;
            case 32:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[i43] = 67;
                this.AudioAttributesImplApi21Parcelizer = i43;
                iArr16[i43 - 1] = iArr16[i43 - 1] + iArr16[i43];
                return 0;
            case 33:
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i44 + 1;
                iArr17[i44] = iArr17[i44 - 1];
                return 0;
            case 34:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i45] = 128;
                this.AudioAttributesImplApi21Parcelizer = i45;
                iArr18[i45 - 1] = iArr18[i45 - 1] % iArr18[i45];
                return 0;
            case 35:
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = i46 - 1;
                this.AudioAttributesImplApi21Parcelizer = i47;
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i46 - 2] = iArr19[i46 - 2] % iArr19[i47];
                return 0;
            case 36:
                int i48 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i48;
                this.write = this.MediaBrowserCompatCustomActionResultReceiver[i48] != 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i49] = 4;
                this.AudioAttributesImplApi21Parcelizer = i49 + 2;
                iArr20[i49 + 1] = 3;
                return 0;
            case 38:
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i50 - 2] = iArr21[i50 - 2] >> iArr21[i50 - 1];
                int i51 = i50 - 2;
                this.AudioAttributesImplApi21Parcelizer = i51;
                this.RatingCompat[i51] = null;
                return 0;
            case 39:
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                iArr22[i52] = 35;
                return 0;
            case 40:
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                int i54 = i53 - 1;
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr23[i53 - 2] = iArr23[i53 - 2] + iArr23[i54];
                this.AudioAttributesImplApi21Parcelizer = i53;
                iArr23[i54] = iArr23[i53 - 2];
                return 0;
            case 41:
                int i55 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i55;
                this.write = this.MediaBrowserCompatCustomActionResultReceiver[i55] == 0 ? 0 : 1;
                return 0;
            case 42:
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                jArr7[i56] = jArr7[10];
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i56 + 2;
                iArr24[i56 + 1] = 72;
                return 0;
            case 43:
                int i57 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr8 = this.AudioAttributesImplApi26Parcelizer;
                jArr8[i57 - 2] = jArr8[i57 - 2] >>> this.MediaBrowserCompatCustomActionResultReceiver[i57 - 1];
                jArr8[i57 - 3] = jArr8[i57 - 3] | jArr8[i57 - 2];
                int i58 = i57 - 3;
                this.AudioAttributesImplApi21Parcelizer = i58;
                jArr8[8] = jArr8[i58];
                return 0;
            case 44:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i59 + 1;
                iArr25[i59] = 0;
                return 0;
            case 45:
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                int i61 = i60 - 1;
                this.AudioAttributesImplApi21Parcelizer = i61;
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr26[i60 - 2] = iArr26[i60 - 2] / iArr26[i61];
                return 0;
            case 46:
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i62;
                this.write = iArr27[i62];
                return 0;
            case 47:
                int[] iArr28 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i63 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i63 + 1;
                iArr28[i63] = 34;
                return 0;
            case 48:
                int[] iArr29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i64 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i64 + 1;
                iArr29[i64] = 48;
                return 0;
            case 49:
                int[] iArr30 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i65 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i65 + 1;
                iArr30[i65] = 55;
                return 0;
            case 50:
                int[] iArr31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i66 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i66 + 1;
                iArr31[i66] = 92;
                return 0;
            case 51:
                for (int i67 = this.AudioAttributesImplApi21Parcelizer - 1; i67 >= 0; i67--) {
                    this.RatingCompat[i67] = null;
                }
                Object[] objArr16 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr16[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
