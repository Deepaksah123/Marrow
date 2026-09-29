package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class handlePendingSeek {
    public Object AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[12];
    private final float[] MediaBrowserCompatItemReceiver = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public handlePendingSeek(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.RatingCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplBaseParcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                iArr[i3] = 32;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i3 - 1] = jArr2[i3 - 1] << iArr[i3];
                int i4 = i3 - 1;
                this.AudioAttributesImplBaseParcelizer = i4;
                jArr2[i3 - 2] = jArr2[i3 - 2] ^ jArr2[i4];
                return 0;
            case 3:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i5 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i5 + 1;
                iArr2[i5] = this.read;
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i6;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[8] = jArr3[i6];
                return 0;
            case 5:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i7 = this.AudioAttributesImplBaseParcelizer;
                iArr3[i7] = 16;
                this.AudioAttributesImplBaseParcelizer = i7;
                iArr3[i7 - 1] = iArr3[i7 - 1] >> iArr3[i7];
                iArr3[i7 - 1] = (char) iArr3[i7 - 1];
                return 0;
            case 6:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i8 + 1;
                iArr4[i8] = 1;
                return 0;
            case 7:
                Object[] objArr = this.RatingCompat;
                int i9 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i9 + 1;
                objArr[i9] = this.write;
                return 0;
            case 8:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                iArr5[i10] = 0;
                return 0;
            case 9:
                int i11 = this.AudioAttributesImplBaseParcelizer - this.read;
                this.AudioAttributesImplBaseParcelizer = i11;
                this.MediaBrowserCompatCustomActionResultReceiver = i11;
                return 0;
            case 10:
                Object[] objArr2 = this.RatingCompat;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                Object obj = objArr2[i12];
                objArr2[i12] = null;
                this.AudioAttributesCompatParcelizer = obj;
                return 0;
            case 11:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i13 + 1;
                this.RemoteActionCompatParcelizer = iArr6[i13];
                return 0;
            case 12:
                int i14 = this.AudioAttributesImplBaseParcelizer;
                int i15 = i14 - 1;
                this.AudioAttributesImplBaseParcelizer = i15;
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i14 - 2] = iArr7[i14 - 2] - iArr7[i15];
                return 0;
            case 13:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i16 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i16 + 1;
                jArr4[i16] = jArr4[8];
                return 0;
            case 14:
                Object[] objArr3 = this.RatingCompat;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 15:
                int i18 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i18;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.RemoteActionCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.RatingCompat;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj3;
                return 0;
            case 17:
                Object[] objArr6 = this.RatingCompat;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                Object obj4 = objArr6[i20 - 1];
                objArr6[i20 - 1] = null;
                Object obj5 = objArr6[i20 - 2];
                objArr6[i20 - 2] = null;
                objArr6[i20 - 1] = obj5;
                objArr6[i20 - 2] = obj4;
                int i21 = i20 - 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                objArr6[i21] = null;
                return 0;
            case 18:
                int i22 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i22;
                this.RatingCompat[i22] = null;
                return 0;
            case 19:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                iArr8[i23] = 2;
                return 0;
            case 20:
                Object[] objArr7 = this.RatingCompat;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i24 + 1;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[i24 - 1] = jArr5[i24 - 2];
                objArr7[i24 - 2] = obj6;
                return 0;
            case 21:
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                this.IconCompatParcelizer = jArr6[i25];
                return 0;
            case 22:
                Object[] objArr8 = this.RatingCompat;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                Object obj8 = objArr8[i26 - 2];
                objArr8[i26 - 2] = null;
                objArr8[i26 - 1] = obj8;
                objArr8[i26 - 2] = obj7;
                return 0;
            case 23:
                Object[] objArr9 = this.RatingCompat;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i27 + 1;
                Object obj9 = objArr9[i27 - 1];
                objArr9[i27 - 1] = null;
                objArr9[i27] = obj9;
                Object obj10 = objArr9[i27 - 2];
                objArr9[i27 - 2] = null;
                objArr9[i27 - 1] = obj10;
                objArr9[i27 - 2] = obj9;
                return 0;
            case 24:
                Object[] objArr10 = this.RatingCompat;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                Object obj11 = objArr10[i28 - 2];
                objArr10[i28 - 2] = null;
                objArr10[i28 - 1] = obj11;
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                iArr9[i28 - 2] = iArr9[i28 - 1];
                int i29 = i28 - 3;
                this.AudioAttributesImplBaseParcelizer = i29;
                Object obj12 = objArr10[i29];
                objArr10[i29] = null;
                int i30 = iArr9[i28 - 2];
                Object obj13 = objArr10[i28 - 1];
                objArr10[i28 - 1] = null;
                ((Object[]) obj12)[i30] = obj13;
                this.AudioAttributesImplBaseParcelizer = i28 - 2;
                Object obj14 = objArr10[i28 - 4];
                objArr10[i28 - 4] = null;
                objArr10[i29] = obj14;
                Object obj15 = objArr10[i28 - 5];
                objArr10[i28 - 5] = null;
                objArr10[i28 - 4] = obj15;
                objArr10[i28 - 5] = obj14;
                return 0;
            case 25:
                Object[] objArr11 = this.RatingCompat;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                Object obj16 = objArr11[i31 - 1];
                objArr11[i31 - 1] = null;
                Object obj17 = objArr11[i31 - 2];
                objArr11[i31 - 2] = null;
                objArr11[i31 - 1] = obj17;
                objArr11[i31 - 2] = obj16;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i31 + 1;
                iArr10[i31] = 0;
                return 0;
            case 26:
                Object[] objArr12 = this.RatingCompat;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                Object obj18 = objArr12[i32 - 2];
                objArr12[i32 - 2] = null;
                objArr12[i32 - 1] = obj18;
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                iArr11[i32 - 2] = iArr11[i32 - 1];
                int i33 = i32 - 3;
                this.AudioAttributesImplBaseParcelizer = i33;
                Object obj19 = objArr12[i33];
                objArr12[i33] = null;
                int i34 = iArr11[i32 - 2];
                Object obj20 = objArr12[i32 - 1];
                objArr12[i32 - 1] = null;
                ((Object[]) obj19)[i34] = obj20;
                return 0;
            case 27:
                int i35 = this.AudioAttributesImplBaseParcelizer;
                int i36 = i35 - 3;
                this.AudioAttributesImplBaseParcelizer = i36;
                Object[] objArr13 = this.RatingCompat;
                Object obj21 = objArr13[i36];
                objArr13[i36] = null;
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = iArr12[i35 - 2];
                Object obj22 = objArr13[i35 - 1];
                objArr13[i35 - 1] = null;
                ((Object[]) obj21)[i37] = obj22;
                objArr13[i36] = objArr13[i35 - 4];
                this.AudioAttributesImplBaseParcelizer = i35 - 1;
                iArr12[i35 - 2] = 1;
                return 0;
            case 28:
                int i38 = this.AudioAttributesImplBaseParcelizer;
                int i39 = i38 - 3;
                this.AudioAttributesImplBaseParcelizer = i39;
                Object[] objArr14 = this.RatingCompat;
                Object obj23 = objArr14[i39];
                objArr14[i39] = null;
                int i40 = this.AudioAttributesImplApi21Parcelizer[i38 - 2];
                Object obj24 = objArr14[i38 - 1];
                objArr14[i38 - 1] = null;
                ((Object[]) obj23)[i40] = obj24;
                return 0;
            case 29:
                Object[] objArr15 = this.RatingCompat;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                objArr15[i41] = objArr15[i41 - 1];
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i41 + 2;
                iArr13[i41 + 1] = 1;
                return 0;
            case 30:
                Object[] objArr16 = this.RatingCompat;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                Object obj25 = objArr16[i42 - 1];
                objArr16[i42 - 1] = null;
                Object obj26 = objArr16[i42 - 2];
                objArr16[i42 - 2] = null;
                objArr16[i42 - 1] = obj26;
                objArr16[i42 - 2] = obj25;
                this.AudioAttributesImplBaseParcelizer = i42 + 1;
                objArr16[i42] = null;
                Object obj27 = objArr16[i42];
                objArr16[i42] = null;
                Object obj28 = objArr16[i42 - 1];
                objArr16[i42 - 1] = null;
                objArr16[i42] = obj28;
                objArr16[i42 - 1] = obj27;
                return 0;
            case 31:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i43] = 2;
                this.AudioAttributesImplBaseParcelizer = i43 + 2;
                iArr14[i43 + 1] = 2;
                return 0;
            case 32:
                int i44 = this.AudioAttributesImplBaseParcelizer;
                int i45 = i44 - 1;
                this.AudioAttributesImplBaseParcelizer = i45;
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i44 - 2] = iArr15[i44 - 2] % iArr15[i45];
                int i46 = i44 - 2;
                this.AudioAttributesImplBaseParcelizer = i46;
                this.RatingCompat[i46] = null;
                return 0;
            case 33:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i47] = 2;
                this.AudioAttributesImplBaseParcelizer = i47;
                iArr16[i47 - 1] = iArr16[i47 - 1] % iArr16[i47];
                int i48 = i47 - 1;
                this.AudioAttributesImplBaseParcelizer = i48;
                this.RatingCompat[i48] = null;
                return 0;
            case 34:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.AudioAttributesImplBaseParcelizer;
                iArr17[i49] = 17;
                iArr17[i49 - 1] = iArr17[i49 - 1] + iArr17[i49];
                this.AudioAttributesImplBaseParcelizer = i49 + 1;
                iArr17[i49] = iArr17[i49 - 1];
                return 0;
            case 35:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i50 + 1;
                iArr18[i50] = 128;
                return 0;
            case 36:
                int i51 = this.AudioAttributesImplBaseParcelizer;
                int i52 = i51 - 1;
                this.AudioAttributesImplBaseParcelizer = i52;
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i51 - 2] = iArr19[i51 - 2] % iArr19[i52];
                return 0;
            case 37:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i53 = this.AudioAttributesImplBaseParcelizer;
                iArr20[i53] = 2;
                this.AudioAttributesImplBaseParcelizer = i53;
                iArr20[i53 - 1] = iArr20[i53 - 1] % iArr20[i53];
                return 0;
            case 38:
                int i54 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i54;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i54] != 0 ? 0 : 1;
                return 0;
            case 39:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i55 + 1;
                iArr21[i55] = 81;
                return 0;
            case 40:
                int i56 = this.AudioAttributesImplBaseParcelizer;
                int i57 = i56 - 1;
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                iArr22[i56 - 2] = iArr22[i56 - 2] + iArr22[i57];
                this.AudioAttributesImplBaseParcelizer = i56;
                iArr22[i57] = iArr22[i56 - 2];
                return 0;
            case 41:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = this.AudioAttributesImplBaseParcelizer;
                iArr23[i58] = 128;
                this.AudioAttributesImplBaseParcelizer = i58;
                iArr23[i58 - 1] = iArr23[i58 - 1] % iArr23[i58];
                return 0;
            case 42:
                for (int i59 = this.AudioAttributesImplBaseParcelizer - 1; i59 >= 0; i59--) {
                    this.RatingCompat[i59] = null;
                }
                Object[] objArr17 = this.RatingCompat;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr17[0] = this.write;
                return 0;
            default:
                return i;
        }
    }
}
