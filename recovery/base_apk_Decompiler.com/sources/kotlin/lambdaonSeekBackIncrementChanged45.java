package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class lambdaonSeekBackIncrementChanged45 {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public long RemoteActionCompatParcelizer;
    public Object read;
    public Object write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public lambdaonSeekBackIncrementChanged45(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                jArr[i2] = jArr[8];
                jArr[i2 + 1] = jArr[10];
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.MediaBrowserCompatItemReceiver[i3 - 1];
                jArr2[i3 - 3] = jArr2[i3 - 3] ^ jArr2[i3 - 2];
                int i4 = i3 - 3;
                this.AudioAttributesImplBaseParcelizer = i4;
                jArr2[8] = jArr2[i4];
                return 0;
            case 3:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i5 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i5 + 1;
                objArr[i5] = this.read;
                return 0;
            case 4:
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i6 + 1;
                iArr2[i6] = 1;
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplBaseParcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i7;
                this.AudioAttributesImplApi21Parcelizer = i7;
                return 0;
            case 6:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                Object obj = objArr2[i8];
                objArr2[i8] = null;
                this.write = obj;
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                this.IconCompatParcelizer = iArr3[i9];
                return 0;
            case 8:
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                jArr3[i10] = jArr3[8];
                return 0;
            case 9:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i11 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i11 + 1;
                objArr3[i11] = objArr3[i11 - 1];
                return 0;
            case 10:
                int i12 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i12;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i12];
                objArr4[i12] = null;
                this.IconCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 11:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i13 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i13 - 1];
                objArr5[i13 - 1] = null;
                Object obj4 = objArr5[i13 - 2];
                objArr5[i13 - 2] = null;
                objArr5[i13 - 1] = obj4;
                objArr5[i13 - 2] = obj3;
                return 0;
            case 12:
                int i14 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i14;
                this.MediaBrowserCompatSearchResultReceiver[i14] = null;
                return 0;
            case 13:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i15 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i15 - 1];
                objArr6[i15 - 1] = null;
                this.write = obj5;
                return 0;
            case 14:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i16 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i16 + 1;
                iArr4[i16] = 2;
                return 0;
            case 15:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i17 + 1;
                this.RemoteActionCompatParcelizer = jArr4[i17];
                return 0;
            case 16:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i18 - 1];
                objArr7[i18 - 1] = null;
                objArr7[i18] = obj6;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[i18 - 1] = jArr5[i18 - 2];
                objArr7[i18 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i18;
                objArr7[i18] = null;
                return 0;
            case 17:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i19 + 1;
                Object obj7 = objArr8[i19 - 1];
                objArr8[i19 - 1] = null;
                objArr8[i19] = obj7;
                Object obj8 = objArr8[i19 - 2];
                objArr8[i19 - 2] = null;
                objArr8[i19 - 1] = obj8;
                objArr8[i19 - 2] = obj7;
                return 0;
            case 18:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                Object obj9 = objArr9[i20 - 1];
                objArr9[i20 - 1] = null;
                Object obj10 = objArr9[i20 - 2];
                objArr9[i20 - 2] = null;
                objArr9[i20 - 1] = obj10;
                objArr9[i20 - 2] = obj9;
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i20 + 1;
                iArr5[i20] = 1;
                return 0;
            case 19:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i21 = this.AudioAttributesImplBaseParcelizer;
                Object obj11 = objArr10[i21 - 2];
                objArr10[i21 - 2] = null;
                objArr10[i21 - 1] = obj11;
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                iArr6[i21 - 2] = iArr6[i21 - 1];
                int i22 = i21 - 3;
                this.AudioAttributesImplBaseParcelizer = i22;
                Object obj12 = objArr10[i22];
                objArr10[i22] = null;
                int i23 = iArr6[i21 - 2];
                Object obj13 = objArr10[i21 - 1];
                objArr10[i21 - 1] = null;
                ((Object[]) obj12)[i23] = obj13;
                this.AudioAttributesImplBaseParcelizer = i21 - 2;
                Object obj14 = objArr10[i21 - 4];
                objArr10[i21 - 4] = null;
                objArr10[i22] = obj14;
                Object obj15 = objArr10[i21 - 5];
                objArr10[i21 - 5] = null;
                objArr10[i21 - 4] = obj15;
                objArr10[i21 - 5] = obj14;
                return 0;
            case 20:
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                Object obj16 = objArr11[i24 - 1];
                objArr11[i24 - 1] = null;
                Object obj17 = objArr11[i24 - 2];
                objArr11[i24 - 2] = null;
                objArr11[i24 - 1] = obj17;
                objArr11[i24 - 2] = obj16;
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i24 + 1;
                iArr7[i24] = 0;
                Object obj18 = objArr11[i24 - 1];
                objArr11[i24 - 1] = null;
                objArr11[i24] = obj18;
                iArr7[i24 - 1] = iArr7[i24];
                return 0;
            case 21:
                int i25 = this.AudioAttributesImplBaseParcelizer;
                int i26 = i25 - 3;
                this.AudioAttributesImplBaseParcelizer = i26;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr12[i26];
                objArr12[i26] = null;
                int i27 = this.MediaBrowserCompatItemReceiver[i25 - 2];
                Object obj20 = objArr12[i25 - 1];
                objArr12[i25 - 1] = null;
                ((Object[]) obj19)[i27] = obj20;
                return 0;
            case 22:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                objArr13[i28] = objArr13[i28 - 1];
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i28 + 2;
                iArr8[i28 + 1] = 0;
                return 0;
            case 23:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                objArr14[i29] = objArr14[i29 - 1];
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i29 + 2;
                iArr9[i29 + 1] = 1;
                return 0;
            case 24:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i30 + 1;
                objArr15[i30] = null;
                return 0;
            case 25:
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                iArr10[i31] = 2;
                this.AudioAttributesImplBaseParcelizer = i31;
                iArr10[i31 - 1] = iArr10[i31 - 1] % iArr10[i31];
                return 0;
            case 26:
                int i32 = this.AudioAttributesImplBaseParcelizer;
                int i33 = i32 - 1;
                this.AudioAttributesImplBaseParcelizer = i33;
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                iArr11[i32 - 2] = iArr11[i32 - 2] % iArr11[i33];
                return 0;
            case 27:
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                int i34 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i34 + 1;
                iArr12[i34] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 28:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i35 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i35 + 1;
                iArr13[i35] = 99;
                return 0;
            case 29:
                int i36 = this.AudioAttributesImplBaseParcelizer;
                int i37 = i36 - 1;
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                iArr14[i36 - 2] = iArr14[i36 - 2] + iArr14[i37];
                this.AudioAttributesImplBaseParcelizer = i36;
                iArr14[i37] = iArr14[i36 - 2];
                return 0;
            case 30:
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i38 + 1;
                iArr15[i38] = 128;
                return 0;
            case 31:
                int i39 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i39;
                this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver[i39] != 0 ? 0 : 1;
                return 0;
            case 32:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i40 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i40] = 97;
                this.AudioAttributesImplBaseParcelizer = i40;
                iArr16[i40 - 1] = iArr16[i40 - 1] + iArr16[i40];
                return 0;
            case 33:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i41 + 1;
                iArr17[i41] = iArr17[i41 - 1];
                return 0;
            case 34:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                iArr18[i42] = 128;
                this.AudioAttributesImplBaseParcelizer = i42;
                iArr18[i42 - 1] = iArr18[i42 - 1] % iArr18[i42];
                return 0;
            case 35:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                iArr19[i43] = 3;
                return 0;
            case 36:
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                int i44 = this.AudioAttributesImplBaseParcelizer;
                iArr20[i44] = 3;
                this.AudioAttributesImplBaseParcelizer = i44;
                iArr20[i44 - 1] = iArr20[i44 - 1] - iArr20[i44];
                return 0;
            case 37:
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                int i45 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i45;
                this.IconCompatParcelizer = iArr21[i45];
                return 0;
            case 38:
                int[] iArr22 = this.MediaBrowserCompatItemReceiver;
                int i46 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i46 + 1;
                iArr22[i46] = 0;
                return 0;
            case 39:
                for (int i47 = this.AudioAttributesImplBaseParcelizer - 1; i47 >= 0; i47--) {
                    this.MediaBrowserCompatSearchResultReceiver[i47] = null;
                }
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr16[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
