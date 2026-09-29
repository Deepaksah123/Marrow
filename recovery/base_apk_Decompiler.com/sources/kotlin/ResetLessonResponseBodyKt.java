package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class ResetLessonResponseBodyKt {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[12];
    private final long[] AudioAttributesImplApi21Parcelizer = new long[12];
    private final float[] MediaBrowserCompatSearchResultReceiver = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public ResetLessonResponseBodyKt(Object obj, Object obj2) {
        Object[] objArr = new Object[12];
        this.MediaDescriptionCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaDescriptionCompat;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                objArr[i2] = this.RemoteActionCompatParcelizer;
                return 0;
            case 2:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                objArr2[i3] = objArr2[6];
                return 0;
            case 3:
                int i4 = this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i4;
                this.AudioAttributesImplApi26Parcelizer = i4;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i5 + 1;
                Object obj = objArr3[i5];
                objArr3[i5] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 5:
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                Object[] objArr4 = this.MediaDescriptionCompat;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[11] = obj2;
                return 0;
            case 6:
                Object[] objArr5 = this.MediaDescriptionCompat;
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr5[i7] = objArr5[i7 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i7;
                Object obj3 = objArr5[i7];
                objArr5[i7] = null;
                objArr5[9] = obj3;
                return 0;
            case 7:
                Object[] objArr6 = this.MediaDescriptionCompat;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i8 + 1;
                objArr6[i8] = objArr6[i8 - 1];
                return 0;
            case 8:
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i9;
                Object[] objArr7 = this.MediaDescriptionCompat;
                Object obj4 = objArr7[i9];
                objArr7[i9] = null;
                objArr7[10] = obj4;
                return 0;
            case 9:
                Object[] objArr8 = this.MediaDescriptionCompat;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                objArr8[i10] = objArr8[11];
                return 0;
            case 10:
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i11;
                this.MediaDescriptionCompat[i11] = null;
                return 0;
            case 11:
                Object[] objArr9 = this.MediaDescriptionCompat;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                objArr9[i12] = objArr9[10];
                return 0;
            case 12:
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = i13 - 1;
                Object[] objArr10 = this.MediaDescriptionCompat;
                objArr10[i14] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                objArr10[i14] = objArr10[11];
                return 0;
            case 13:
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i15;
                Object[] objArr11 = this.MediaDescriptionCompat;
                Object obj5 = objArr11[i15];
                objArr11[i15] = null;
                objArr11[7] = obj5;
                return 0;
            case 14:
                Object[] objArr12 = this.MediaDescriptionCompat;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                objArr12[i16] = objArr12[7];
                return 0;
            case 15:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i17 + 1;
                iArr[i17] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 16:
                int i18 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i18;
                this.write = this.AudioAttributesImplBaseParcelizer[i18] == 0 ? 0 : 1;
                return 0;
            case 17:
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i19;
                Object[] objArr13 = this.MediaDescriptionCompat;
                Object obj6 = objArr13[i19];
                objArr13[i19] = null;
                objArr13[8] = obj6;
                return 0;
            case 18:
                Object[] objArr14 = this.MediaDescriptionCompat;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr14[i20] = objArr14[10];
                objArr14[i20 + 1] = objArr14[8];
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 3;
                objArr14[i20 + 2] = objArr14[11];
                return 0;
            case 19:
                Object[] objArr15 = this.MediaDescriptionCompat;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i21 + 1;
                objArr15[i21] = objArr15[8];
                return 0;
            case 20:
                long[] jArr = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i22 + 1;
                jArr[i22] = this.read;
                return 0;
            case 21:
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i23;
                long[] jArr2 = this.AudioAttributesImplApi21Parcelizer;
                jArr2[7] = jArr2[i23];
                return 0;
            case 22:
                long[] jArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i24 + 1;
                this.IconCompatParcelizer = jArr3[i24];
                return 0;
            case 23:
                long[] jArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                jArr4[i25] = jArr4[7];
                return 0;
            case 24:
                int i26 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i26;
                Object[] objArr16 = this.MediaDescriptionCompat;
                Object obj7 = objArr16[i26];
                objArr16[i26] = null;
                objArr16[6] = obj7;
                return 0;
            case 25:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i27 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i27 + 1;
                this.write = iArr2[i27];
                return 0;
            case 26:
                long[] jArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr5[i28] = jArr5[7];
                this.MediaBrowserCompatCustomActionResultReceiver = i28;
                jArr5[i28 - 1] = jArr5[i28 - 1] - jArr5[i28];
                return 0;
            case 27:
                Object[] objArr17 = this.MediaDescriptionCompat;
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i29 + 1;
                objArr17[i29] = objArr17[5];
                return 0;
            case 28:
                Object[] objArr18 = this.MediaDescriptionCompat;
                int i30 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i30 + 1;
                objArr18[i30] = objArr18[9];
                return 0;
            case 29:
                Object[] objArr19 = this.MediaDescriptionCompat;
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj8 = objArr19[i31 - 1];
                objArr19[i31 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj8;
                return 0;
            case 30:
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i33 = i32 - 1;
                Object[] objArr20 = this.MediaDescriptionCompat;
                Object obj9 = objArr20[i33];
                objArr20[i33] = null;
                objArr20[6] = obj9;
                this.MediaBrowserCompatCustomActionResultReceiver = i32;
                objArr20[i33] = objArr20[10];
                return 0;
            case 31:
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i35 = i34 - 1;
                Object[] objArr21 = this.MediaDescriptionCompat;
                objArr21[i35] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i34;
                objArr21[i35] = objArr21[5];
                return 0;
            case 32:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr3[i36] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i36 + 2;
                iArr3[i36 + 1] = 2;
                return 0;
            case 33:
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i38 = i37 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i38;
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                iArr4[i37 - 2] = iArr4[i37 - 2] % iArr4[i38];
                return 0;
            case 34:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i39 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i39 + 1;
                iArr5[i39] = 2;
                return 0;
            case 35:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i40 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr6[i40] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i40;
                iArr6[i40 - 1] = iArr6[i40 - 1] % iArr6[i40];
                int i41 = i40 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i41;
                this.MediaDescriptionCompat[i41] = null;
                return 0;
            case 36:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr7[i42] = 2;
                iArr7[i42 + 1] = 2;
                int i43 = i42 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i43;
                iArr7[i42] = iArr7[i42] % iArr7[i43];
                return 0;
            case 37:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i44 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i44 + 1;
                iArr8[i44] = 67;
                return 0;
            case 38:
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = i45 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i46;
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i45 - 2] = iArr9[i45 - 2] + iArr9[i46];
                return 0;
            case 39:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr10[i47] = iArr10[i47 - 1];
                iArr10[i47 + 1] = 128;
                int i48 = i47 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i48;
                iArr10[i47] = iArr10[i47] % iArr10[i48];
                return 0;
            case 40:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr11[i49] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i49;
                iArr11[i49 - 1] = iArr11[i49 - 1] % iArr11[i49];
                return 0;
            case 41:
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                this.write = this.AudioAttributesImplBaseParcelizer[i50] != 0 ? 0 : 1;
                return 0;
            case 42:
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr12[i51] = 15;
                this.MediaBrowserCompatCustomActionResultReceiver = i51;
                iArr12[i51 - 1] = iArr12[i51 - 1] + iArr12[i51];
                return 0;
            case 43:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i52;
                this.write = iArr13[i52];
                return 0;
            case 44:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i53 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i53 + 1;
                iArr14[i53] = 85;
                return 0;
            case 45:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i54 + 1;
                iArr15[i54] = 96;
                return 0;
            case 46:
                for (int i55 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i55 >= 0; i55--) {
                    this.MediaDescriptionCompat[i55] = null;
                }
                Object[] objArr22 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr22[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
