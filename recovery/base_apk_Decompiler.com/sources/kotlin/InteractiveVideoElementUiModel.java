package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class InteractiveVideoElementUiModel {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public long write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[12];
    private final float[] MediaBrowserCompatItemReceiver = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public InteractiveVideoElementUiModel(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi21Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.RatingCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.AudioAttributesImplApi26Parcelizer;
                jArr[i2] = jArr[8];
                jArr[i2 + 1] = jArr[10];
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr2 = this.AudioAttributesImplApi21Parcelizer;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.AudioAttributesImplBaseParcelizer[i3 - 1];
                jArr2[i3 - 3] = jArr2[i3 - 3] ^ jArr2[i3 - 2];
                int i4 = i3 - 3;
                this.AudioAttributesImplApi26Parcelizer = i4;
                jArr2[8] = jArr2[i4];
                return 0;
            case 3:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i5 + 1;
                iArr2[i5] = 0;
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplApi26Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i6;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                return 0;
            case 5:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i7 + 1;
                this.AudioAttributesCompatParcelizer = iArr3[i7];
                return 0;
            case 6:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i8 + 1;
                iArr4[i8] = this.IconCompatParcelizer;
                return 0;
            case 7:
                Object[] objArr = this.RatingCompat;
                int i9 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i9 + 1;
                objArr[i9] = this.read;
                return 0;
            case 8:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i10 + 1;
                iArr5[i10] = 8;
                return 0;
            case 9:
                int i11 = this.AudioAttributesImplApi26Parcelizer;
                int i12 = i11 - 1;
                this.AudioAttributesImplApi26Parcelizer = i12;
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                iArr6[i11 - 2] = iArr6[i11 - 2] >> iArr6[i12];
                return 0;
            case 10:
                int i13 = this.AudioAttributesImplApi26Parcelizer;
                int i14 = i13 - 1;
                this.AudioAttributesImplApi26Parcelizer = i14;
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                iArr7[i13 - 2] = iArr7[i13 - 2] + iArr7[i14];
                iArr7[i13 - 2] = (char) iArr7[i13 - 2];
                return 0;
            case 11:
                Object[] objArr2 = this.RatingCompat;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 12:
                long[] jArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i16 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i16 + 1;
                jArr3[i16] = jArr3[8];
                return 0;
            case 13:
                Object[] objArr3 = this.RatingCompat;
                int i17 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 14:
                int i18 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i18;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.AudioAttributesCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr5 = this.RatingCompat;
                int i19 = this.AudioAttributesImplApi26Parcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                Object obj4 = objArr5[i19 - 2];
                objArr5[i19 - 2] = null;
                objArr5[i19 - 1] = obj4;
                objArr5[i19 - 2] = obj3;
                int i20 = i19 - 1;
                this.AudioAttributesImplApi26Parcelizer = i20;
                objArr5[i20] = null;
                return 0;
            case 16:
                Object[] objArr6 = this.RatingCompat;
                int i21 = this.AudioAttributesImplApi26Parcelizer;
                Object obj5 = objArr6[i21 - 1];
                objArr6[i21 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 17:
                int i22 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i22;
                this.RatingCompat[i22] = null;
                return 0;
            case 18:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i23 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i23 + 1;
                iArr8[i23] = 2;
                return 0;
            case 19:
                Object[] objArr7 = this.RatingCompat;
                int i24 = this.AudioAttributesImplApi26Parcelizer;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr4 = this.AudioAttributesImplApi21Parcelizer;
                jArr4[i24 - 1] = jArr4[i24 - 2];
                objArr7[i24 - 2] = obj6;
                this.AudioAttributesImplApi26Parcelizer = i24;
                objArr7[i24] = null;
                return 0;
            case 20:
                long[] jArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                this.write = jArr5[i25];
                return 0;
            case 21:
                Object[] objArr8 = this.RatingCompat;
                int i26 = this.AudioAttributesImplApi26Parcelizer;
                Object obj7 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                Object obj8 = objArr8[i26 - 2];
                objArr8[i26 - 2] = null;
                objArr8[i26 - 1] = obj8;
                objArr8[i26 - 2] = obj7;
                this.AudioAttributesImplApi26Parcelizer = i26 + 1;
                Object obj9 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                objArr8[i26] = obj9;
                Object obj10 = objArr8[i26 - 2];
                objArr8[i26 - 2] = null;
                objArr8[i26 - 1] = obj10;
                objArr8[i26 - 2] = obj9;
                return 0;
            case 22:
                Object[] objArr9 = this.RatingCompat;
                int i27 = this.AudioAttributesImplApi26Parcelizer;
                Object obj11 = objArr9[i27 - 1];
                objArr9[i27 - 1] = null;
                Object obj12 = objArr9[i27 - 2];
                objArr9[i27 - 2] = null;
                objArr9[i27 - 1] = obj12;
                objArr9[i27 - 2] = obj11;
                return 0;
            case 23:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i28 + 1;
                iArr9[i28] = 1;
                return 0;
            case 24:
                Object[] objArr10 = this.RatingCompat;
                int i29 = this.AudioAttributesImplApi26Parcelizer;
                Object obj13 = objArr10[i29 - 2];
                objArr10[i29 - 2] = null;
                objArr10[i29 - 1] = obj13;
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                iArr10[i29 - 2] = iArr10[i29 - 1];
                return 0;
            case 25:
                int i30 = this.AudioAttributesImplApi26Parcelizer;
                int i31 = i30 - 3;
                this.AudioAttributesImplApi26Parcelizer = i31;
                Object[] objArr11 = this.RatingCompat;
                Object obj14 = objArr11[i31];
                objArr11[i31] = null;
                int i32 = this.AudioAttributesImplBaseParcelizer[i30 - 2];
                Object obj15 = objArr11[i30 - 1];
                objArr11[i30 - 1] = null;
                ((Object[]) obj14)[i32] = obj15;
                return 0;
            case 26:
                Object[] objArr12 = this.RatingCompat;
                int i33 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i33 + 1;
                Object obj16 = objArr12[i33 - 1];
                objArr12[i33 - 1] = null;
                objArr12[i33] = obj16;
                Object obj17 = objArr12[i33 - 2];
                objArr12[i33 - 2] = null;
                objArr12[i33 - 1] = obj17;
                objArr12[i33 - 2] = obj16;
                return 0;
            case 27:
                Object[] objArr13 = this.RatingCompat;
                int i34 = this.AudioAttributesImplApi26Parcelizer;
                Object obj18 = objArr13[i34 - 1];
                objArr13[i34 - 1] = null;
                Object obj19 = objArr13[i34 - 2];
                objArr13[i34 - 2] = null;
                objArr13[i34 - 1] = obj19;
                objArr13[i34 - 2] = obj18;
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i34 + 1;
                iArr11[i34] = 0;
                Object obj20 = objArr13[i34 - 1];
                objArr13[i34 - 1] = null;
                objArr13[i34] = obj20;
                iArr11[i34 - 1] = iArr11[i34];
                return 0;
            case 28:
                Object[] objArr14 = this.RatingCompat;
                int i35 = this.AudioAttributesImplApi26Parcelizer;
                objArr14[i35] = objArr14[i35 - 1];
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i35 + 2;
                iArr12[i35 + 1] = 0;
                return 0;
            case 29:
                int i36 = this.AudioAttributesImplApi26Parcelizer;
                int i37 = i36 - 3;
                this.AudioAttributesImplApi26Parcelizer = i37;
                Object[] objArr15 = this.RatingCompat;
                Object obj21 = objArr15[i37];
                objArr15[i37] = null;
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i38 = iArr13[i36 - 2];
                Object obj22 = objArr15[i36 - 1];
                objArr15[i36 - 1] = null;
                ((Object[]) obj21)[i38] = obj22;
                objArr15[i37] = objArr15[i36 - 4];
                this.AudioAttributesImplApi26Parcelizer = i36 - 1;
                iArr13[i36 - 2] = 1;
                return 0;
            case 30:
                Object[] objArr16 = this.RatingCompat;
                int i39 = this.AudioAttributesImplApi26Parcelizer;
                Object obj23 = objArr16[i39 - 1];
                objArr16[i39 - 1] = null;
                Object obj24 = objArr16[i39 - 2];
                objArr16[i39 - 2] = null;
                objArr16[i39 - 1] = obj24;
                objArr16[i39 - 2] = obj23;
                this.AudioAttributesImplApi26Parcelizer = i39 + 1;
                objArr16[i39] = null;
                Object obj25 = objArr16[i39];
                objArr16[i39] = null;
                Object obj26 = objArr16[i39 - 1];
                objArr16[i39 - 1] = null;
                objArr16[i39] = obj26;
                objArr16[i39 - 1] = obj25;
                return 0;
            case 31:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i40 = this.AudioAttributesImplApi26Parcelizer;
                iArr14[i40] = 2;
                iArr14[i40 + 1] = 2;
                int i41 = i40 + 1;
                this.AudioAttributesImplApi26Parcelizer = i41;
                iArr14[i40] = iArr14[i40] % iArr14[i41];
                return 0;
            case 32:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i42 = this.AudioAttributesImplApi26Parcelizer;
                iArr15[i42] = 2;
                this.AudioAttributesImplApi26Parcelizer = i42 + 2;
                iArr15[i42 + 1] = 2;
                return 0;
            case 33:
                int i43 = this.AudioAttributesImplApi26Parcelizer;
                int i44 = i43 - 1;
                this.AudioAttributesImplApi26Parcelizer = i44;
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i43 - 2] = iArr16[i43 - 2] % iArr16[i44];
                int i45 = i43 - 2;
                this.AudioAttributesImplApi26Parcelizer = i45;
                this.RatingCompat[i45] = null;
                return 0;
            case 34:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i46 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i46 + 1;
                iArr17[i46] = 45;
                return 0;
            case 35:
                int i47 = this.AudioAttributesImplApi26Parcelizer;
                int i48 = i47 - 1;
                this.AudioAttributesImplApi26Parcelizer = i48;
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                iArr18[i47 - 2] = iArr18[i47 - 2] + iArr18[i48];
                return 0;
            case 36:
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i49 + 1;
                iArr19[i49] = iArr19[i49 - 1];
                return 0;
            case 37:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i50 = this.AudioAttributesImplApi26Parcelizer;
                iArr20[i50] = 128;
                this.AudioAttributesImplApi26Parcelizer = i50;
                iArr20[i50 - 1] = iArr20[i50 - 1] % iArr20[i50];
                return 0;
            case 38:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i51 = this.AudioAttributesImplApi26Parcelizer;
                iArr21[i51] = 2;
                this.AudioAttributesImplApi26Parcelizer = i51;
                iArr21[i51 - 1] = iArr21[i51 - 1] % iArr21[i51];
                return 0;
            case 39:
                int i52 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i52;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer[i52] == 0 ? 0 : 1;
                return 0;
            case 40:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i53 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i53 + 1;
                iArr22[i53] = 95;
                return 0;
            case 41:
                int i54 = this.AudioAttributesImplApi26Parcelizer;
                int i55 = i54 - 1;
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                iArr23[i54 - 2] = iArr23[i54 - 2] + iArr23[i55];
                iArr23[i55] = iArr23[i54 - 2];
                this.AudioAttributesImplApi26Parcelizer = i54 + 1;
                iArr23[i54] = 128;
                return 0;
            case 42:
                int i56 = this.AudioAttributesImplApi26Parcelizer;
                int i57 = i56 - 1;
                this.AudioAttributesImplApi26Parcelizer = i57;
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                iArr24[i56 - 2] = iArr24[i56 - 2] % iArr24[i57];
                return 0;
            case 43:
                for (int i58 = this.AudioAttributesImplApi26Parcelizer - 1; i58 >= 0; i58--) {
                    this.RatingCompat[i58] = null;
                }
                Object[] objArr17 = this.RatingCompat;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objArr17[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
