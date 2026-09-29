package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class findNextCueHeader {
    public long AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public int RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] MediaBrowserCompatMediaItem = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public findNextCueHeader(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                int i4 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i4 + 1;
                iArr[i4] = 32;
                return 0;
            case 4:
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i5 - 2] = jArr3[i5 - 2] << this.MediaBrowserCompatItemReceiver[i5 - 1];
                int i6 = i5 - 2;
                this.AudioAttributesImplApi26Parcelizer = i6;
                jArr3[i5 - 3] = jArr3[i5 - 3] ^ jArr3[i6];
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i7;
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                jArr4[8] = jArr4[i7];
                return 0;
            case 6:
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i8 + 1;
                jArr5[i8] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 7:
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                int i9 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i9] = 0;
                this.AudioAttributesImplApi26Parcelizer = i9;
                this.MediaBrowserCompatItemReceiver[i9 - 1] = (jArr6[i9 - 1] > jArr6[i9] ? 1 : (jArr6[i9 - 1] == jArr6[i9] ? 0 : -1));
                return 0;
            case 8:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i10 + 1;
                objArr[i10] = this.IconCompatParcelizer;
                return 0;
            case 9:
                int i11 = this.AudioAttributesImplApi26Parcelizer - this.RemoteActionCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i11;
                this.MediaBrowserCompatCustomActionResultReceiver = i11;
                return 0;
            case 10:
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                this.write = iArr2[i12];
                return 0;
            case 11:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i13 + 1;
                Object obj = objArr2[i13];
                objArr2[i13] = null;
                this.AudioAttributesImplApi21Parcelizer = obj;
                return 0;
            case 12:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i14 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i14 + 1;
                objArr3[i14] = objArr3[i14 - 1];
                return 0;
            case 13:
                int i15 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i15;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i15];
                objArr4[i15] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i16 = this.AudioAttributesImplApi26Parcelizer;
                Object obj3 = objArr5[i16 - 1];
                objArr5[i16 - 1] = null;
                this.AudioAttributesImplApi21Parcelizer = obj3;
                return 0;
            case 15:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i17 = this.AudioAttributesImplApi26Parcelizer;
                Object obj4 = objArr6[i17 - 1];
                objArr6[i17 - 1] = null;
                Object obj5 = objArr6[i17 - 2];
                objArr6[i17 - 2] = null;
                objArr6[i17 - 1] = obj5;
                objArr6[i17 - 2] = obj4;
                int i18 = i17 - 1;
                this.AudioAttributesImplApi26Parcelizer = i18;
                objArr6[i18] = null;
                return 0;
            case 16:
                int i19 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i19;
                this.MediaBrowserCompatSearchResultReceiver[i19] = null;
                return 0;
            case 17:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i20 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i20 + 1;
                iArr3[i20] = 2;
                return 0;
            case 18:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i21 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i21 + 1;
                Object obj6 = objArr7[i21 - 1];
                objArr7[i21 - 1] = null;
                objArr7[i21] = obj6;
                long[] jArr7 = this.AudioAttributesImplBaseParcelizer;
                jArr7[i21 - 1] = jArr7[i21 - 2];
                objArr7[i21 - 2] = obj6;
                return 0;
            case 19:
                long[] jArr8 = this.AudioAttributesImplBaseParcelizer;
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i22 + 1;
                this.read = jArr8[i22];
                return 0;
            case 20:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplApi26Parcelizer;
                Object obj7 = objArr8[i23 - 1];
                objArr8[i23 - 1] = null;
                Object obj8 = objArr8[i23 - 2];
                objArr8[i23 - 2] = null;
                objArr8[i23 - 1] = obj8;
                objArr8[i23 - 2] = obj7;
                return 0;
            case 21:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i24 + 1;
                Object obj9 = objArr9[i24 - 1];
                objArr9[i24 - 1] = null;
                objArr9[i24] = obj9;
                Object obj10 = objArr9[i24 - 2];
                objArr9[i24 - 2] = null;
                objArr9[i24 - 1] = obj10;
                objArr9[i24 - 2] = obj9;
                Object obj11 = objArr9[i24];
                objArr9[i24] = null;
                Object obj12 = objArr9[i24 - 1];
                objArr9[i24 - 1] = null;
                objArr9[i24] = obj12;
                objArr9[i24 - 1] = obj11;
                return 0;
            case 22:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i25 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i25 + 1;
                iArr4[i25] = 1;
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj13 = objArr10[i25 - 1];
                objArr10[i25 - 1] = null;
                objArr10[i25] = obj13;
                iArr4[i25 - 1] = iArr4[i25];
                return 0;
            case 23:
                int i26 = this.AudioAttributesImplApi26Parcelizer;
                int i27 = i26 - 3;
                this.AudioAttributesImplApi26Parcelizer = i27;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj14 = objArr11[i27];
                objArr11[i27] = null;
                int i28 = this.MediaBrowserCompatItemReceiver[i26 - 2];
                Object obj15 = objArr11[i26 - 1];
                objArr11[i26 - 1] = null;
                ((Object[]) obj14)[i28] = obj15;
                return 0;
            case 24:
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                int i29 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i29 + 1;
                iArr5[i29] = 0;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj16 = objArr12[i29 - 1];
                objArr12[i29 - 1] = null;
                objArr12[i29] = obj16;
                iArr5[i29 - 1] = iArr5[i29];
                return 0;
            case 25:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplApi26Parcelizer;
                objArr13[i30] = objArr13[i30 - 1];
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi26Parcelizer = i30 + 2;
                iArr6[i30 + 1] = 0;
                return 0;
            case 26:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i31 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i31 + 1;
                iArr7[i31] = 1;
                return 0;
            case 27:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i32 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i32 + 1;
                objArr14[i32] = null;
                return 0;
            case 28:
                int i33 = this.AudioAttributesImplApi26Parcelizer;
                int i34 = i33 - 1;
                this.AudioAttributesImplApi26Parcelizer = i34;
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                iArr8[i33 - 2] = iArr8[i33 - 2] % iArr8[i34];
                int i35 = i33 - 2;
                this.AudioAttributesImplApi26Parcelizer = i35;
                this.MediaBrowserCompatSearchResultReceiver[i35] = null;
                return 0;
            case 30:
                int i36 = this.AudioAttributesImplApi26Parcelizer;
                int i37 = i36 - 1;
                this.AudioAttributesImplApi26Parcelizer = i37;
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                iArr9[i36 - 2] = iArr9[i36 - 2] % iArr9[i37];
            case 29:
                return 0;
            case 31:
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                int i38 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i38 + 1;
                iArr10[i38] = this.RemoteActionCompatParcelizer;
                return 0;
            case 32:
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                int i39 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i39 + 1;
                iArr11[i39] = 73;
                return 0;
            case 33:
                int i40 = this.AudioAttributesImplApi26Parcelizer;
                int i41 = i40 - 1;
                this.AudioAttributesImplApi26Parcelizer = i41;
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                iArr12[i40 - 2] = iArr12[i40 - 2] + iArr12[i41];
                return 0;
            case 34:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i42 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i42 + 1;
                iArr13[i42] = iArr13[i42 - 1];
                return 0;
            case 35:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i43 = this.AudioAttributesImplApi26Parcelizer;
                iArr14[i43] = 128;
                this.AudioAttributesImplApi26Parcelizer = i43;
                iArr14[i43 - 1] = iArr14[i43 - 1] % iArr14[i43];
                return 0;
            case 36:
                int i44 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i44;
                this.write = this.MediaBrowserCompatItemReceiver[i44] != 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                int i45 = this.AudioAttributesImplApi26Parcelizer;
                iArr15[i45] = 25;
                iArr15[i45 - 1] = iArr15[i45 - 1] + iArr15[i45];
                this.AudioAttributesImplApi26Parcelizer = i45 + 1;
                iArr15[i45] = iArr15[i45 - 1];
                return 0;
            case 38:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i46 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i46 + 1;
                iArr16[i46] = 128;
                return 0;
            case 39:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i47 = this.AudioAttributesImplApi26Parcelizer;
                iArr17[i47] = 2;
                this.AudioAttributesImplApi26Parcelizer = i47;
                iArr17[i47 - 1] = iArr17[i47 - 1] % iArr17[i47];
                return 0;
            case 40:
                int i48 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i48;
                this.write = this.MediaBrowserCompatItemReceiver[i48] == 0 ? 0 : 1;
                return 0;
            case 41:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i49 = this.AudioAttributesImplApi26Parcelizer;
                iArr18[i49] = 69;
                iArr18[i49 - 1] = iArr18[i49 - 1] + iArr18[i49];
                this.AudioAttributesImplApi26Parcelizer = i49 + 1;
                iArr18[i49] = iArr18[i49 - 1];
                return 0;
            case 42:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i50 = this.AudioAttributesImplApi26Parcelizer;
                iArr19[i50] = 77;
                this.AudioAttributesImplApi26Parcelizer = i50;
                iArr19[i50 - 1] = iArr19[i50 - 1] + iArr19[i50];
                return 0;
            case 43:
                for (int i51 = this.AudioAttributesImplApi26Parcelizer - 1; i51 >= 0; i51--) {
                    this.MediaBrowserCompatSearchResultReceiver[i51] = null;
                }
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objArr15[0] = this.IconCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
