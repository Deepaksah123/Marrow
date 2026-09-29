package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class GoogleApi {
    public long AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public float write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[12];
    private final float[] MediaDescriptionCompat = new float[12];
    private final double[] MediaBrowserCompatMediaItem = new double[12];

    public GoogleApi(Object obj, long j, long j2) {
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

    public int RemoteActionCompatParcelizer(int i) {
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
                iArr[i4] = 32;
                this.AudioAttributesImplBaseParcelizer = i4;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[i4 - 1] = jArr3[i4 - 1] << iArr[i4];
                return 0;
            case 4:
                int i5 = this.AudioAttributesImplBaseParcelizer;
                int i6 = i5 - 1;
                this.AudioAttributesImplBaseParcelizer = i6;
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                jArr4[i5 - 2] = jArr4[i5 - 2] ^ jArr4[i6];
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i7;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[8] = jArr5[i7];
                return 0;
            case 6:
                float[] fArr = this.MediaDescriptionCompat;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i8 + 1;
                fArr[i8] = this.write;
                return 0;
            case 7:
                float[] fArr2 = this.MediaDescriptionCompat;
                int i9 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i9 + 1;
                fArr2[i9] = 0.0f;
                return 0;
            case 8:
                Object[] objArr = this.RatingCompat;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                objArr[i10] = this.RemoteActionCompatParcelizer;
                return 0;
            case 9:
                int i11 = this.AudioAttributesImplBaseParcelizer;
                int i12 = i11 - 1;
                this.AudioAttributesImplBaseParcelizer = i12;
                float[] fArr3 = this.MediaDescriptionCompat;
                this.AudioAttributesImplApi21Parcelizer[i11 - 2] = (fArr3[i11 - 2] > fArr3[i12] ? 1 : (fArr3[i11 - 2] == fArr3[i12] ? 0 : -1));
                return 0;
            case 10:
                int i13 = this.AudioAttributesImplBaseParcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i13;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                return 0;
            case 11:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                this.read = iArr2[i14];
                return 0;
            case 12:
                Object[] objArr2 = this.RatingCompat;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 13:
                Object[] objArr3 = this.RatingCompat;
                int i16 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i16 + 1;
                objArr3[i16] = objArr3[i16 - 1];
                return 0;
            case 14:
                int i17 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i17;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i17];
                objArr4[i17] = null;
                this.read = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr5 = this.RatingCompat;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i18 - 1];
                objArr5[i18 - 1] = null;
                Object obj4 = objArr5[i18 - 2];
                objArr5[i18 - 2] = null;
                objArr5[i18 - 1] = obj4;
                objArr5[i18 - 2] = obj3;
                int i19 = i18 - 1;
                this.AudioAttributesImplBaseParcelizer = i19;
                objArr5[i19] = null;
                return 0;
            case 16:
                Object[] objArr6 = this.RatingCompat;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i20 - 1];
                objArr6[i20 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj5;
                return 0;
            case 17:
                int i21 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                this.RatingCompat[i21] = null;
                return 0;
            case 18:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i22 + 1;
                iArr3[i22] = 2;
                return 0;
            case 19:
                Object[] objArr7 = this.RatingCompat;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i23 - 1] = jArr6[i23 - 2];
                objArr7[i23 - 2] = obj6;
                return 0;
            case 20:
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                this.AudioAttributesCompatParcelizer = jArr7[i24];
                return 0;
            case 21:
                Object[] objArr8 = this.RatingCompat;
                int i25 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                Object obj8 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj8;
                objArr8[i25 - 2] = obj7;
                this.AudioAttributesImplBaseParcelizer = i25 + 1;
                Object obj9 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj9;
                Object obj10 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj10;
                objArr8[i25 - 2] = obj9;
                Object obj11 = objArr8[i25];
                objArr8[i25] = null;
                Object obj12 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj12;
                objArr8[i25 - 1] = obj11;
                return 0;
            case 22:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i26 + 1;
                iArr4[i26] = 1;
                return 0;
            case 23:
                Object[] objArr9 = this.RatingCompat;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                Object obj13 = objArr9[i27 - 2];
                objArr9[i27 - 2] = null;
                objArr9[i27 - 1] = obj13;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i27 - 2] = iArr5[i27 - 1];
                return 0;
            case 24:
                int i28 = this.AudioAttributesImplBaseParcelizer;
                int i29 = i28 - 3;
                this.AudioAttributesImplBaseParcelizer = i29;
                Object[] objArr10 = this.RatingCompat;
                Object obj14 = objArr10[i29];
                objArr10[i29] = null;
                int i30 = this.AudioAttributesImplApi21Parcelizer[i28 - 2];
                Object obj15 = objArr10[i28 - 1];
                objArr10[i28 - 1] = null;
                ((Object[]) obj14)[i30] = obj15;
                this.AudioAttributesImplBaseParcelizer = i28 - 2;
                Object obj16 = objArr10[i28 - 4];
                objArr10[i28 - 4] = null;
                objArr10[i29] = obj16;
                Object obj17 = objArr10[i28 - 5];
                objArr10[i28 - 5] = null;
                objArr10[i28 - 4] = obj17;
                objArr10[i28 - 5] = obj16;
                return 0;
            case 25:
                Object[] objArr11 = this.RatingCompat;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                Object obj18 = objArr11[i31 - 1];
                objArr11[i31 - 1] = null;
                Object obj19 = objArr11[i31 - 2];
                objArr11[i31 - 2] = null;
                objArr11[i31 - 1] = obj19;
                objArr11[i31 - 2] = obj18;
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i31 + 1;
                iArr6[i31] = 0;
                return 0;
            case 26:
                Object[] objArr12 = this.RatingCompat;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                Object obj20 = objArr12[i32 - 2];
                objArr12[i32 - 2] = null;
                objArr12[i32 - 1] = obj20;
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i32 - 2] = iArr7[i32 - 1];
                int i33 = i32 - 3;
                this.AudioAttributesImplBaseParcelizer = i33;
                Object obj21 = objArr12[i33];
                objArr12[i33] = null;
                int i34 = iArr7[i32 - 2];
                Object obj22 = objArr12[i32 - 1];
                objArr12[i32 - 1] = null;
                ((Object[]) obj21)[i34] = obj22;
                return 0;
            case 27:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i35 + 1;
                iArr8[i35] = 0;
                return 0;
            case 28:
                int i36 = this.AudioAttributesImplBaseParcelizer;
                int i37 = i36 - 3;
                this.AudioAttributesImplBaseParcelizer = i37;
                Object[] objArr13 = this.RatingCompat;
                Object obj23 = objArr13[i37];
                objArr13[i37] = null;
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = iArr9[i36 - 2];
                Object obj24 = objArr13[i36 - 1];
                objArr13[i36 - 1] = null;
                ((Object[]) obj23)[i38] = obj24;
                objArr13[i37] = objArr13[i36 - 4];
                this.AudioAttributesImplBaseParcelizer = i36 - 1;
                iArr9[i36 - 2] = 1;
                return 0;
            case 29:
                int i39 = this.AudioAttributesImplBaseParcelizer;
                int i40 = i39 - 3;
                this.AudioAttributesImplBaseParcelizer = i40;
                Object[] objArr14 = this.RatingCompat;
                Object obj25 = objArr14[i40];
                objArr14[i40] = null;
                int i41 = this.AudioAttributesImplApi21Parcelizer[i39 - 2];
                Object obj26 = objArr14[i39 - 1];
                objArr14[i39 - 1] = null;
                ((Object[]) obj25)[i41] = obj26;
                return 0;
            case 30:
                Object[] objArr15 = this.RatingCompat;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                Object obj27 = objArr15[i42 - 1];
                objArr15[i42 - 1] = null;
                Object obj28 = objArr15[i42 - 2];
                objArr15[i42 - 2] = null;
                objArr15[i42 - 1] = obj28;
                objArr15[i42 - 2] = obj27;
                return 0;
            case 31:
                Object[] objArr16 = this.RatingCompat;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                objArr16[i43] = null;
                return 0;
            case 32:
                int i44 = this.AudioAttributesImplBaseParcelizer;
                int i45 = i44 - 1;
                this.AudioAttributesImplBaseParcelizer = i45;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i44 - 2] = iArr10[i44 - 2] % iArr10[i45];
                return 0;
            case 33:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.AudioAttributesImplBaseParcelizer;
                iArr11[i46] = 2;
                this.AudioAttributesImplBaseParcelizer = i46;
                iArr11[i46 - 1] = iArr11[i46 - 1] % iArr11[i46];
                int i47 = i46 - 1;
                this.AudioAttributesImplBaseParcelizer = i47;
                this.RatingCompat[i47] = null;
                return 0;
            case 35:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i48 + 1;
                iArr12[i48] = this.IconCompatParcelizer;
            case 34:
                return 0;
            case 36:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i49 + 1;
                iArr13[i49] = 99;
                return 0;
            case 37:
                int i50 = this.AudioAttributesImplBaseParcelizer;
                int i51 = i50 - 1;
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                iArr14[i50 - 2] = iArr14[i50 - 2] + iArr14[i51];
                this.AudioAttributesImplBaseParcelizer = i50;
                iArr14[i51] = iArr14[i50 - 2];
                return 0;
            case 38:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.AudioAttributesImplBaseParcelizer;
                iArr15[i52] = 128;
                this.AudioAttributesImplBaseParcelizer = i52;
                iArr15[i52 - 1] = iArr15[i52 - 1] % iArr15[i52];
                return 0;
            case 39:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i53 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i53] = 2;
                this.AudioAttributesImplBaseParcelizer = i53;
                iArr16[i53 - 1] = iArr16[i53 - 1] % iArr16[i53];
                return 0;
            case 40:
                int i54 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i54;
                this.read = this.AudioAttributesImplApi21Parcelizer[i54] != 0 ? 0 : 1;
                return 0;
            case 41:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.AudioAttributesImplBaseParcelizer;
                iArr17[i55] = 77;
                iArr17[i55 - 1] = iArr17[i55 - 1] + iArr17[i55];
                this.AudioAttributesImplBaseParcelizer = i55 + 1;
                iArr17[i55] = iArr17[i55 - 1];
                return 0;
            case 42:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i56 + 1;
                iArr18[i56] = 128;
                return 0;
            case 43:
                int i57 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i57;
                this.read = this.AudioAttributesImplApi21Parcelizer[i57] == 0 ? 0 : 1;
                return 0;
            case 44:
                for (int i58 = this.AudioAttributesImplBaseParcelizer - 1; i58 >= 0; i58--) {
                    this.RatingCompat[i58] = null;
                }
                Object[] objArr17 = this.RatingCompat;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr17[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
