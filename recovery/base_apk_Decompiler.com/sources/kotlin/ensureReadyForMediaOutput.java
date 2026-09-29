package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class ensureReadyForMediaOutput {
    public long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public Object write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[12];
    private final double[] RatingCompat = new double[12];

    public ensureReadyForMediaOutput(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplApi21Parcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                iArr[i3] = 32;
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.MediaBrowserCompatItemReceiver[i4 - 1];
                int i5 = i4 - 2;
                this.AudioAttributesImplApi21Parcelizer = i5;
                jArr2[i4 - 3] = jArr2[i4 - 3] ^ jArr2[i5];
                return 0;
            case 4:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                objArr[i6] = this.RemoteActionCompatParcelizer;
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = i7 - 1;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[8] = jArr3[i8];
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi21Parcelizer = i7;
                iArr2[i8] = 3;
                return 0;
            case 6:
                int i9 = this.AudioAttributesImplApi21Parcelizer - this.read;
                this.AudioAttributesImplApi21Parcelizer = i9;
                this.AudioAttributesImplBaseParcelizer = i9;
                return 0;
            case 7:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                Object obj = objArr2[i10];
                objArr2[i10] = null;
                this.write = obj;
                return 0;
            case 8:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i11 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i11 + 1;
                this.IconCompatParcelizer = iArr3[i11];
                return 0;
            case 9:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                iArr4[i12] = this.read;
                return 0;
            case 10:
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i13 + 1;
                iArr5[i13] = 48;
                return 0;
            case 11:
                int i14 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = i14 - 1;
                this.AudioAttributesImplApi21Parcelizer = i15;
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                iArr6[i14 - 2] = iArr6[i14 - 2] + iArr6[i15];
                return 0;
            case 12:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i16 + 1;
                jArr4[i16] = jArr4[8];
                return 0;
            case 13:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 14:
                int i18 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i18;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.IconCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                Object obj4 = objArr5[i19 - 2];
                objArr5[i19 - 2] = null;
                objArr5[i19 - 1] = obj4;
                objArr5[i19 - 2] = obj3;
                return 0;
            case 16:
                int i20 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i20;
                this.MediaBrowserCompatSearchResultReceiver[i20] = null;
                return 0;
            case 17:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr6[i21 - 1];
                objArr6[i21 - 1] = null;
                this.write = obj5;
                return 0;
            case 18:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i22 + 1;
                iArr7[i22] = 2;
                return 0;
            case 19:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[i23 - 1] = jArr5[i23 - 2];
                objArr7[i23 - 2] = obj6;
                return 0;
            case 20:
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i24 + 1;
                this.AudioAttributesCompatParcelizer = jArr6[i24];
                return 0;
            case 21:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i25 + 1;
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj7;
                Object obj8 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj8;
                objArr8[i25 - 2] = obj7;
                Object obj9 = objArr8[i25];
                objArr8[i25] = null;
                Object obj10 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj10;
                objArr8[i25 - 1] = obj9;
                return 0;
            case 22:
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                int i26 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i26 + 1;
                iArr8[i26] = 1;
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr9[i26 - 1];
                objArr9[i26 - 1] = null;
                objArr9[i26] = obj11;
                iArr8[i26 - 1] = iArr8[i26];
                return 0;
            case 23:
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = i27 - 3;
                this.AudioAttributesImplApi21Parcelizer = i28;
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj12 = objArr10[i28];
                objArr10[i28] = null;
                int i29 = this.MediaBrowserCompatItemReceiver[i27 - 2];
                Object obj13 = objArr10[i27 - 1];
                objArr10[i27 - 1] = null;
                ((Object[]) obj12)[i29] = obj13;
                this.AudioAttributesImplApi21Parcelizer = i27 - 2;
                Object obj14 = objArr10[i27 - 4];
                objArr10[i27 - 4] = null;
                objArr10[i28] = obj14;
                Object obj15 = objArr10[i27 - 5];
                objArr10[i27 - 5] = null;
                objArr10[i27 - 4] = obj15;
                objArr10[i27 - 5] = obj14;
                Object obj16 = objArr10[i27 - 3];
                objArr10[i27 - 3] = null;
                Object obj17 = objArr10[i27 - 4];
                objArr10[i27 - 4] = null;
                objArr10[i27 - 3] = obj17;
                objArr10[i27 - 4] = obj16;
                return 0;
            case 24:
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i30 + 1;
                iArr9[i30] = 0;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj18 = objArr11[i30 - 1];
                objArr11[i30 - 1] = null;
                objArr11[i30] = obj18;
                iArr9[i30 - 1] = iArr9[i30];
                return 0;
            case 25:
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                int i32 = i31 - 3;
                this.AudioAttributesImplApi21Parcelizer = i32;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr12[i32];
                objArr12[i32] = null;
                int i33 = this.MediaBrowserCompatItemReceiver[i31 - 2];
                Object obj20 = objArr12[i31 - 1];
                objArr12[i31 - 1] = null;
                ((Object[]) obj19)[i33] = obj20;
                return 0;
            case 26:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                objArr13[i34] = objArr13[i34 - 1];
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi21Parcelizer = i34 + 2;
                iArr10[i34 + 1] = 0;
                return 0;
            case 27:
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = i35 - 3;
                this.AudioAttributesImplApi21Parcelizer = i36;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj21 = objArr14[i36];
                objArr14[i36] = null;
                int i37 = this.MediaBrowserCompatItemReceiver[i35 - 2];
                Object obj22 = objArr14[i35 - 1];
                objArr14[i35 - 1] = null;
                ((Object[]) obj21)[i37] = obj22;
                this.AudioAttributesImplApi21Parcelizer = i35 - 2;
                objArr14[i36] = objArr14[i35 - 4];
                return 0;
            case 28:
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i38 + 1;
                iArr11[i38] = 1;
                return 0;
            case 29:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                Object obj23 = objArr15[i39 - 1];
                objArr15[i39 - 1] = null;
                Object obj24 = objArr15[i39 - 2];
                objArr15[i39 - 2] = null;
                objArr15[i39 - 1] = obj24;
                objArr15[i39 - 2] = obj23;
                this.AudioAttributesImplApi21Parcelizer = i39 + 1;
                objArr15[i39] = null;
                Object obj25 = objArr15[i39];
                objArr15[i39] = null;
                Object obj26 = objArr15[i39 - 1];
                objArr15[i39 - 1] = null;
                objArr15[i39] = obj26;
                objArr15[i39 - 1] = obj25;
                return 0;
            case 30:
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                iArr12[i40] = 2;
                iArr12[i40 + 1] = 2;
                int i41 = i40 + 1;
                this.AudioAttributesImplApi21Parcelizer = i41;
                iArr12[i40] = iArr12[i40] % iArr12[i41];
                return 0;
            case 32:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i42 + 1;
                iArr13[i42] = 119;
            case 31:
                return 0;
            case 33:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                iArr14[i43] = iArr14[i43 - 1];
                this.AudioAttributesImplApi21Parcelizer = i43 + 2;
                iArr14[i43 + 1] = 128;
                return 0;
            case 34:
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                int i45 = i44 - 1;
                this.AudioAttributesImplApi21Parcelizer = i45;
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                iArr15[i44 - 2] = iArr15[i44 - 2] % iArr15[i45];
                return 0;
            case 35:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[i46] = 2;
                this.AudioAttributesImplApi21Parcelizer = i46;
                iArr16[i46 - 1] = iArr16[i46 - 1] % iArr16[i46];
                return 0;
            case 36:
                int i47 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i47;
                this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver[i47] != 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i48 + 1;
                iArr17[i48] = 47;
                return 0;
            case 38:
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                jArr7[i49 - 2] = jArr7[i49 - 2] >> this.MediaBrowserCompatItemReceiver[i49 - 1];
                jArr7[i49 - 3] = jArr7[i49 - 3] + jArr7[i49 - 2];
                int i50 = i49 - 3;
                this.AudioAttributesImplApi21Parcelizer = i50;
                jArr7[8] = jArr7[i50];
                return 0;
            case 39:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                iArr18[i51] = 5;
                return 0;
            case 40:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                iArr19[i52] = 36;
                return 0;
            case 41:
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                int i54 = i53 - 1;
                this.AudioAttributesImplApi21Parcelizer = i54;
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                iArr20[i53 - 2] = iArr20[i53 - 2] * iArr20[i54];
                return 0;
            case 42:
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i55 + 1;
                iArr21[i55] = 67;
                return 0;
            case 43:
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                int i57 = i56 - 1;
                int[] iArr22 = this.MediaBrowserCompatItemReceiver;
                iArr22[i56 - 2] = iArr22[i56 - 2] + iArr22[i57];
                this.AudioAttributesImplApi21Parcelizer = i56;
                iArr22[i57] = iArr22[i56 - 2];
                return 0;
            case 44:
                int[] iArr23 = this.MediaBrowserCompatItemReceiver;
                int i58 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i58] = 128;
                this.AudioAttributesImplApi21Parcelizer = i58;
                iArr23[i58 - 1] = iArr23[i58 - 1] % iArr23[i58];
                return 0;
            case 45:
                int i59 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i59;
                this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver[i59] == 0 ? 0 : 1;
                return 0;
            case 46:
                int[] iArr24 = this.MediaBrowserCompatItemReceiver;
                int i60 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i60;
                this.IconCompatParcelizer = iArr24[i60];
                return 0;
            case 47:
                int[] iArr25 = this.MediaBrowserCompatItemReceiver;
                int i61 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i61 + 1;
                iArr25[i61] = 66;
                return 0;
            case 48:
                int[] iArr26 = this.MediaBrowserCompatItemReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i62 + 1;
                iArr26[i62] = 0;
                return 0;
            case 49:
                for (int i63 = this.AudioAttributesImplApi21Parcelizer - 1; i63 >= 0; i63--) {
                    this.MediaBrowserCompatSearchResultReceiver[i63] = null;
                }
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr16[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
