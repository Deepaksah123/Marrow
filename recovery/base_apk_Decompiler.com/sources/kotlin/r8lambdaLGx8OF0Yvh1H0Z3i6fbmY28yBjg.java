package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class r8lambdaLGx8OF0Yvh1H0Z3i6fbmY28yBjg {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public int RemoteActionCompatParcelizer;
    public long read;
    public Object write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[12];
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[12];
    private final double[] RatingCompat = new double[12];

    public r8lambdaLGx8OF0Yvh1H0Z3i6fbmY28yBjg(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i4 + 1;
                iArr[i4] = 32;
                return 0;
            case 4:
                int i5 = this.AudioAttributesImplBaseParcelizer;
                int i6 = i5 - 1;
                this.AudioAttributesImplBaseParcelizer = i6;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[i5 - 2] = jArr3[i5 - 2] << this.AudioAttributesImplApi21Parcelizer[i6];
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplBaseParcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplBaseParcelizer = i8;
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                jArr4[i7 - 2] = jArr4[i7 - 2] ^ jArr4[i8];
                return 0;
            case 6:
                int i9 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i9;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[8] = jArr5[i9];
                return 0;
            case 7:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                objArr[i10] = this.IconCompatParcelizer;
                return 0;
            case 8:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i11 + 1;
                iArr2[i11] = 1;
                return 0;
            case 9:
                int i12 = this.AudioAttributesImplBaseParcelizer - this.RemoteActionCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i12;
                this.MediaBrowserCompatItemReceiver = i12;
                return 0;
            case 10:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i13 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i13 + 1;
                Object obj = objArr2[i13];
                objArr2[i13] = null;
                this.write = obj;
                return 0;
            case 11:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i14 + 1;
                this.AudioAttributesCompatParcelizer = iArr3[i14];
                return 0;
            case 12:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i15 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i15 + 1;
                objArr3[i15] = objArr3[i15 - 1];
                return 0;
            case 13:
                int i16 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i16;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i16];
                objArr4[i16] = null;
                this.AudioAttributesCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i17 - 1];
                objArr5[i17 - 1] = null;
                Object obj4 = objArr5[i17 - 2];
                objArr5[i17 - 2] = null;
                objArr5[i17 - 1] = obj4;
                objArr5[i17 - 2] = obj3;
                return 0;
            case 15:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i18 - 1];
                objArr6[i18 - 1] = null;
                this.write = obj5;
                return 0;
            case 16:
                int i19 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i19;
                this.MediaBrowserCompatSearchResultReceiver[i19] = null;
                return 0;
            case 17:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i20 + 1;
                iArr4[i20] = 2;
                return 0;
            case 18:
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                int i21 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i21 + 1;
                this.read = jArr6[i21];
                return 0;
            case 19:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i22 - 1];
                objArr7[i22 - 1] = null;
                objArr7[i22] = obj6;
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                jArr7[i22 - 1] = jArr7[i22 - 2];
                objArr7[i22 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i22;
                objArr7[i22] = null;
                return 0;
            case 20:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i23 - 1];
                objArr8[i23 - 1] = null;
                Object obj8 = objArr8[i23 - 2];
                objArr8[i23 - 2] = null;
                objArr8[i23 - 1] = obj8;
                objArr8[i23 - 2] = obj7;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                Object obj9 = objArr8[i23 - 1];
                objArr8[i23 - 1] = null;
                objArr8[i23] = obj9;
                Object obj10 = objArr8[i23 - 2];
                objArr8[i23 - 2] = null;
                objArr8[i23 - 1] = obj10;
                objArr8[i23 - 2] = obj9;
                return 0;
            case 21:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                iArr5[i24] = 1;
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr9[i24 - 1];
                objArr9[i24 - 1] = null;
                objArr9[i24] = obj11;
                iArr5[i24 - 1] = iArr5[i24];
                int i25 = i24 - 2;
                this.AudioAttributesImplBaseParcelizer = i25;
                Object obj12 = objArr9[i25];
                objArr9[i25] = null;
                int i26 = iArr5[i24 - 1];
                Object obj13 = objArr9[i24];
                objArr9[i24] = null;
                ((Object[]) obj12)[i26] = obj13;
                return 0;
            case 22:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i27 + 1;
                Object obj14 = objArr10[i27 - 1];
                objArr10[i27 - 1] = null;
                objArr10[i27] = obj14;
                Object obj15 = objArr10[i27 - 2];
                objArr10[i27 - 2] = null;
                objArr10[i27 - 1] = obj15;
                objArr10[i27 - 2] = obj14;
                return 0;
            case 23:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                iArr6[i28] = 0;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj16 = objArr11[i28 - 1];
                objArr11[i28 - 1] = null;
                objArr11[i28] = obj16;
                iArr6[i28 - 1] = iArr6[i28];
                int i29 = i28 - 2;
                this.AudioAttributesImplBaseParcelizer = i29;
                Object obj17 = objArr11[i29];
                objArr11[i29] = null;
                int i30 = iArr6[i28 - 1];
                Object obj18 = objArr11[i28];
                objArr11[i28] = null;
                ((Object[]) obj17)[i30] = obj18;
                return 0;
            case 24:
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                objArr12[i31] = objArr12[i31 - 1];
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i31 + 2;
                iArr7[i31 + 1] = 0;
                return 0;
            case 25:
                int i32 = this.AudioAttributesImplBaseParcelizer;
                int i33 = i32 - 3;
                this.AudioAttributesImplBaseParcelizer = i33;
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr13[i33];
                objArr13[i33] = null;
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = iArr8[i32 - 2];
                Object obj20 = objArr13[i32 - 1];
                objArr13[i32 - 1] = null;
                ((Object[]) obj19)[i34] = obj20;
                objArr13[i33] = objArr13[i32 - 4];
                this.AudioAttributesImplBaseParcelizer = i32 - 1;
                iArr8[i32 - 2] = 1;
                return 0;
            case 26:
                int i35 = this.AudioAttributesImplBaseParcelizer;
                int i36 = i35 - 3;
                this.AudioAttributesImplBaseParcelizer = i36;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj21 = objArr14[i36];
                objArr14[i36] = null;
                int i37 = this.AudioAttributesImplApi21Parcelizer[i35 - 2];
                Object obj22 = objArr14[i35 - 1];
                objArr14[i35 - 1] = null;
                ((Object[]) obj21)[i37] = obj22;
                return 0;
            case 27:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                Object obj23 = objArr15[i38 - 1];
                objArr15[i38 - 1] = null;
                Object obj24 = objArr15[i38 - 2];
                objArr15[i38 - 2] = null;
                objArr15[i38 - 1] = obj24;
                objArr15[i38 - 2] = obj23;
                this.AudioAttributesImplBaseParcelizer = i38 + 1;
                objArr15[i38] = null;
                Object obj25 = objArr15[i38];
                objArr15[i38] = null;
                Object obj26 = objArr15[i38 - 1];
                objArr15[i38 - 1] = null;
                objArr15[i38] = obj26;
                objArr15[i38 - 1] = obj25;
                return 0;
            case 28:
                int i39 = this.AudioAttributesImplBaseParcelizer;
                int i40 = i39 - 1;
                this.AudioAttributesImplBaseParcelizer = i40;
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                iArr9[i39 - 2] = iArr9[i39 - 2] % iArr9[i40];
                int i41 = i39 - 2;
                this.AudioAttributesImplBaseParcelizer = i41;
                this.MediaBrowserCompatSearchResultReceiver[i41] = null;
                return 0;
            case 29:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                iArr10[i42] = 2;
                this.AudioAttributesImplBaseParcelizer = i42;
                iArr10[i42 - 1] = iArr10[i42 - 1] % iArr10[i42];
                return 0;
            case 30:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                iArr11[i43] = this.RemoteActionCompatParcelizer;
                return 0;
            case 31:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i44 + 1;
                iArr12[i44] = 55;
                return 0;
            case 32:
                int i45 = this.AudioAttributesImplBaseParcelizer;
                int i46 = i45 - 1;
                this.AudioAttributesImplBaseParcelizer = i46;
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i45 - 2] = iArr13[i45 - 2] + iArr13[i46];
                return 0;
            case 33:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i47] = iArr14[i47 - 1];
                this.AudioAttributesImplBaseParcelizer = i47 + 2;
                iArr14[i47 + 1] = 128;
                return 0;
            case 34:
                int i48 = this.AudioAttributesImplBaseParcelizer;
                int i49 = i48 - 1;
                this.AudioAttributesImplBaseParcelizer = i49;
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i48 - 2] = iArr15[i48 - 2] % iArr15[i49];
                return 0;
            case 35:
                int i50 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i50;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i50] != 0 ? 0 : 1;
                return 0;
            case 36:
                long[] jArr8 = this.AudioAttributesImplApi26Parcelizer;
                int i51 = this.AudioAttributesImplBaseParcelizer;
                jArr8[i51] = jArr8[8];
                this.AudioAttributesImplBaseParcelizer = i51 + 2;
                jArr8[i51 + 1] = jArr8[10];
                return 0;
            case 37:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i52 + 1;
                iArr16[i52] = 93;
                return 0;
            case 38:
                int i53 = this.AudioAttributesImplBaseParcelizer;
                int i54 = i53 - 1;
                this.AudioAttributesImplBaseParcelizer = i54;
                long[] jArr9 = this.AudioAttributesImplApi26Parcelizer;
                jArr9[i53 - 2] = jArr9[i53 - 2] >>> this.AudioAttributesImplApi21Parcelizer[i54];
                return 0;
            case 39:
                int i55 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr10 = this.AudioAttributesImplApi26Parcelizer;
                jArr10[i55 - 2] = jArr10[i55 - 2] + jArr10[i55 - 1];
                int i56 = i55 - 2;
                this.AudioAttributesImplBaseParcelizer = i56;
                jArr10[8] = jArr10[i56];
                return 0;
            case 40:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i57 = this.AudioAttributesImplBaseParcelizer;
                iArr17[i57] = 101;
                iArr17[i57 - 1] = iArr17[i57 - 1] + iArr17[i57];
                this.AudioAttributesImplBaseParcelizer = i57 + 1;
                iArr17[i57] = iArr17[i57 - 1];
                return 0;
            case 41:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i58 + 1;
                iArr18[i58] = 128;
                return 0;
            case 42:
                int i59 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i59;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i59] == 0 ? 0 : 1;
                return 0;
            case 43:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i60 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i60;
                this.AudioAttributesCompatParcelizer = iArr19[i60];
                return 0;
            case 44:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i61 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i61 + 1;
                iArr20[i61] = 84;
                return 0;
            case 45:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i62 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i62 + 1;
                iArr21[i62] = 61;
                return 0;
            case 46:
                for (int i63 = this.AudioAttributesImplBaseParcelizer - 1; i63 >= 0; i63--) {
                    this.MediaBrowserCompatSearchResultReceiver[i63] = null;
                }
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr16[0] = this.IconCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
