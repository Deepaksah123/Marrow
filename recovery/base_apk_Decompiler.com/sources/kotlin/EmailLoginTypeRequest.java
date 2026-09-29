package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class EmailLoginTypeRequest {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public int write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[12];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[12];
    private final double[] RatingCompat = new double[12];

    public EmailLoginTypeRequest(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                iArr[i4] = 32;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i4 - 1] = jArr3[i4 - 1] << iArr[i4];
                int i5 = i4 - 1;
                this.AudioAttributesImplApi21Parcelizer = i5;
                jArr3[i4 - 2] = jArr3[i4 - 2] ^ jArr3[i5];
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i6;
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                jArr4[8] = jArr4[i6];
                return 0;
            case 5:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i7 + 1;
                iArr2[i7] = 1;
                return 0;
            case 6:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                iArr3[i8] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 7:
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                iArr4[i9] = 22;
                return 0;
            case 8:
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = i10 - 1;
                this.AudioAttributesImplApi21Parcelizer = i11;
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr5[i10 - 2] = iArr5[i10 - 2] >> iArr5[i11];
                return 0;
            case 9:
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = i12 - 1;
                this.AudioAttributesImplApi21Parcelizer = i13;
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr6[i12 - 2] = iArr6[i12 - 2] + iArr6[i13];
                return 0;
            case 10:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i14 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i14 + 1;
                objArr[i14] = this.RemoteActionCompatParcelizer;
                return 0;
            case 11:
                int i15 = this.AudioAttributesImplApi21Parcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i15;
                this.MediaBrowserCompatItemReceiver = i15;
                return 0;
            case 12:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i16 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i16 + 1;
                this.write = iArr7[i16];
                return 0;
            case 13:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i17 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i17 + 1;
                Object obj = objArr2[i17];
                objArr2[i17] = null;
                this.read = obj;
                return 0;
            case 14:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i18 + 1;
                objArr3[i18] = objArr3[i18 - 1];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i19;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
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
                this.MediaBrowserCompatSearchResultReceiver[i21] = null;
                return 0;
            case 18:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr6[i22 - 1];
                objArr6[i22 - 1] = null;
                this.read = obj5;
                return 0;
            case 19:
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                iArr8[i23] = 2;
                return 0;
            case 20:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                jArr5[i24 - 1] = jArr5[i24 - 2];
                objArr7[i24 - 2] = obj6;
                return 0;
            case 21:
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                this.IconCompatParcelizer = jArr6[i25];
                return 0;
            case 22:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i26 = this.AudioAttributesImplApi21Parcelizer;
                Object obj7 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                objArr8[i26] = obj7;
                Object obj8 = objArr8[i26 - 2];
                objArr8[i26 - 2] = null;
                objArr8[i26 - 1] = obj8;
                objArr8[i26 - 2] = obj7;
                Object obj9 = objArr8[i26];
                objArr8[i26] = null;
                Object obj10 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                objArr8[i26] = obj10;
                objArr8[i26 - 1] = obj9;
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i26 + 2;
                iArr9[i26 + 1] = 1;
                return 0;
            case 23:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                Object obj11 = objArr9[i27 - 2];
                objArr9[i27 - 2] = null;
                objArr9[i27 - 1] = obj11;
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr10[i27 - 2] = iArr10[i27 - 1];
                int i28 = i27 - 3;
                this.AudioAttributesImplApi21Parcelizer = i28;
                Object obj12 = objArr9[i28];
                objArr9[i28] = null;
                int i29 = iArr10[i27 - 2];
                Object obj13 = objArr9[i27 - 1];
                objArr9[i27 - 1] = null;
                ((Object[]) obj12)[i29] = obj13;
                return 0;
            case 24:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                Object obj14 = objArr10[i30 - 1];
                objArr10[i30 - 1] = null;
                objArr10[i30] = obj14;
                Object obj15 = objArr10[i30 - 2];
                objArr10[i30 - 2] = null;
                objArr10[i30 - 1] = obj15;
                objArr10[i30 - 2] = obj14;
                Object obj16 = objArr10[i30];
                objArr10[i30] = null;
                Object obj17 = objArr10[i30 - 1];
                objArr10[i30 - 1] = null;
                objArr10[i30] = obj17;
                objArr10[i30 - 1] = obj16;
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i30 + 2;
                iArr11[i30 + 1] = 0;
                return 0;
            case 25:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i31 + 1;
                iArr12[i31] = 0;
                return 0;
            case 26:
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = i32 - 3;
                this.AudioAttributesImplApi21Parcelizer = i33;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj18 = objArr11[i33];
                objArr11[i33] = null;
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i34 = iArr13[i32 - 2];
                Object obj19 = objArr11[i32 - 1];
                objArr11[i32 - 1] = null;
                ((Object[]) obj18)[i34] = obj19;
                objArr11[i33] = objArr11[i32 - 4];
                this.AudioAttributesImplApi21Parcelizer = i32 - 1;
                iArr13[i32 - 2] = 1;
                return 0;
            case 27:
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = i35 - 3;
                this.AudioAttributesImplApi21Parcelizer = i36;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj20 = objArr12[i36];
                objArr12[i36] = null;
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver[i35 - 2];
                Object obj21 = objArr12[i35 - 1];
                objArr12[i35 - 1] = null;
                ((Object[]) obj20)[i37] = obj21;
                return 0;
            case 28:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                objArr13[i38] = objArr13[i38 - 1];
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i38 + 2;
                iArr14[i38 + 1] = 1;
                return 0;
            case 29:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                Object obj22 = objArr14[i39 - 1];
                objArr14[i39 - 1] = null;
                Object obj23 = objArr14[i39 - 2];
                objArr14[i39 - 2] = null;
                objArr14[i39 - 1] = obj23;
                objArr14[i39 - 2] = obj22;
                this.AudioAttributesImplApi21Parcelizer = i39 + 1;
                objArr14[i39] = null;
                return 0;
            case 30:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i40] = 2;
                iArr15[i40 + 1] = 2;
                int i41 = i40 + 1;
                this.AudioAttributesImplApi21Parcelizer = i41;
                iArr15[i40] = iArr15[i40] % iArr15[i41];
                return 0;
            case 31:
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = i42 - 1;
                this.AudioAttributesImplApi21Parcelizer = i43;
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr16[i42 - 2] = iArr16[i42 - 2] % iArr16[i43];
                return 0;
            case 32:
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                iArr17[i44] = 27;
                iArr17[i44 - 1] = iArr17[i44 - 1] + iArr17[i44];
                this.AudioAttributesImplApi21Parcelizer = i44 + 1;
                iArr17[i44] = iArr17[i44 - 1];
                return 0;
            case 33:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i45] = 128;
                this.AudioAttributesImplApi21Parcelizer = i45;
                iArr18[i45 - 1] = iArr18[i45 - 1] % iArr18[i45];
                return 0;
            case 34:
                int i46 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i46;
                this.write = this.MediaBrowserCompatCustomActionResultReceiver[i46] != 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i47] = 2;
                this.AudioAttributesImplApi21Parcelizer = i47;
                iArr19[i47 - 1] = iArr19[i47 - 1] % iArr19[i47];
                return 0;
            case 36:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i48 + 1;
                iArr20[i48] = 107;
                return 0;
            case 37:
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = i49 - 1;
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i49 - 2] = iArr21[i49 - 2] + iArr21[i50];
                this.AudioAttributesImplApi21Parcelizer = i49;
                iArr21[i50] = iArr21[i49 - 2];
                return 0;
            case 38:
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                iArr22[i51] = 75;
                this.AudioAttributesImplApi21Parcelizer = i51;
                iArr22[i51 - 1] = iArr22[i51 - 1] + iArr22[i51];
                return 0;
            case 39:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i52] = iArr23[i52 - 1];
                this.AudioAttributesImplApi21Parcelizer = i52 + 2;
                iArr23[i52 + 1] = 128;
                return 0;
            case 40:
                for (int i53 = this.AudioAttributesImplApi21Parcelizer - 1; i53 >= 0; i53--) {
                    this.MediaBrowserCompatSearchResultReceiver[i53] = null;
                }
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr15[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
