package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class OtpVerifyRequestBody {
    public long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    public Object AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final int[] MediaBrowserCompatItemReceiver;
    private final double[] MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final long[] MediaDescriptionCompat;
    private final float[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public float write;

    public OtpVerifyRequestBody(Object obj, Object obj2, int i) {
        int[] iArr = new int[12];
        this.MediaBrowserCompatItemReceiver = iArr;
        this.MediaDescriptionCompat = new long[12];
        this.RatingCompat = new float[12];
        this.MediaBrowserCompatMediaItem = new double[12];
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        iArr[7] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                objArr[i2] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i3;
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj = objArr2[i3];
                objArr2[i3] = null;
                objArr2[10] = obj;
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplApi21Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4;
                this.MediaBrowserCompatCustomActionResultReceiver = i4;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i5 + 1;
                Object obj2 = objArr3[i5];
                objArr3[i5] = null;
                this.AudioAttributesImplBaseParcelizer = obj2;
                return 0;
            case 5:
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                objArr4[i6] = objArr4[6];
                return 0;
            case 6:
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = i7 - 1;
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj3 = objArr5[i8];
                objArr5[i8] = null;
                objArr5[11] = obj3;
                objArr5[i8] = objArr5[10];
                this.AudioAttributesImplApi21Parcelizer = i7 + 1;
                objArr5[i7] = objArr5[11];
                return 0;
            case 7:
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = i9 - 1;
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj4 = objArr6[i10];
                objArr6[i10] = null;
                objArr6[11] = obj4;
                this.AudioAttributesImplApi21Parcelizer = i9;
                objArr6[i10] = objArr6[6];
                return 0;
            case 8:
                long[] jArr = this.MediaDescriptionCompat;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                jArr[i11] = this.read;
                return 0;
            case 9:
                int i12 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i12;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver[i12] == 0 ? 0 : 1;
                return 0;
            case 10:
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = i13 - 1;
                this.AudioAttributesImplApi21Parcelizer = i14;
                long[] jArr2 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver[i13 - 2] = (jArr2[i13 - 2] > jArr2[i14] ? 1 : (jArr2[i13 - 2] == jArr2[i14] ? 0 : -1));
                return 0;
            case 11:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i15 + 1;
                objArr7[i15] = objArr7[11];
                return 0;
            case 12:
                long[] jArr3 = this.MediaDescriptionCompat;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                this.AudioAttributesCompatParcelizer = jArr3[i16];
                return 0;
            case 13:
                int i17 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i17;
                this.MediaBrowserCompatSearchResultReceiver[i17] = null;
                return 0;
            case 14:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                objArr8[i18] = objArr8[11];
                this.AudioAttributesImplApi21Parcelizer = i18 + 2;
                objArr8[i18 + 1] = objArr8[6];
                return 0;
            case 15:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i19 + 1;
                objArr9[i19] = objArr9[5];
                return 0;
            case 16:
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = i20 - 1;
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj5 = objArr10[i21];
                objArr10[i21] = null;
                objArr10[8] = obj5;
                this.AudioAttributesImplApi21Parcelizer = i20;
                objArr10[i21] = objArr10[6];
                return 0;
            case 17:
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = i22 - 1;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj6 = objArr11[i23];
                objArr11[i23] = null;
                objArr11[9] = obj6;
                this.AudioAttributesImplApi21Parcelizer = i22;
                objArr11[i23] = objArr11[8];
                return 0;
            case 18:
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                objArr12[i24] = objArr12[9];
                return 0;
            case 19:
                int i25 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i25;
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj7 = objArr13[i25];
                objArr13[i25] = null;
                objArr13[8] = obj7;
                return 0;
            case 20:
                int i26 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i26;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj8 = objArr14[i26];
                objArr14[i26] = null;
                objArr14[5] = obj8;
                return 0;
            case 21:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i27 + 1;
                objArr15[i27] = objArr15[8];
                return 0;
            case 22:
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i28 + 1;
                this.RemoteActionCompatParcelizer = iArr[i28];
                return 0;
            case 23:
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i29 + 1;
                iArr2[i29] = 1;
                return 0;
            case 24:
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                int i31 = i30 - 1;
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj9 = objArr16[i31];
                objArr16[i31] = null;
                objArr16[8] = obj9;
                this.AudioAttributesImplApi21Parcelizer = i30;
                objArr16[i31] = objArr16[5];
                return 0;
            case 25:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                iArr3[i32] = iArr3[7];
                long[] jArr4 = this.MediaDescriptionCompat;
                jArr4[i32] = iArr3[i32];
                this.AudioAttributesImplApi21Parcelizer = i32;
                jArr4[8] = jArr4[i32];
                return 0;
            case 26:
                long[] jArr5 = this.MediaDescriptionCompat;
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i33 + 1;
                jArr5[i33] = jArr5[8];
                return 0;
            case 27:
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i34 + 1;
                objArr17[i34] = objArr17[10];
                return 0;
            case 28:
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = i35 - 1;
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj10 = objArr18[i36];
                objArr18[i36] = null;
                objArr18[10] = obj10;
                objArr18[i36] = objArr18[5];
                this.AudioAttributesImplApi21Parcelizer = i35 + 1;
                objArr18[i35] = objArr18[10];
                return 0;
            case 29:
                Object[] objArr19 = this.MediaBrowserCompatSearchResultReceiver;
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                Object obj11 = objArr19[i37 - 1];
                objArr19[i37 - 1] = null;
                this.AudioAttributesImplBaseParcelizer = obj11;
                return 0;
            case 30:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                iArr4[i38] = 2;
                iArr4[i38 + 1] = 2;
                int i39 = i38 + 1;
                this.AudioAttributesImplApi21Parcelizer = i39;
                iArr4[i38] = iArr4[i38] % iArr4[i39];
                return 0;
            case 31:
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i40] = 2;
                this.AudioAttributesImplApi21Parcelizer = i40 + 2;
                iArr5[i40 + 1] = 2;
                return 0;
            case 32:
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = i41 - 1;
                this.AudioAttributesImplApi21Parcelizer = i42;
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                iArr6[i41 - 2] = iArr6[i41 - 2] % iArr6[i42];
                int i43 = i41 - 2;
                this.AudioAttributesImplApi21Parcelizer = i43;
                this.MediaBrowserCompatSearchResultReceiver[i43] = null;
                return 0;
            case 33:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i44 + 1;
                iArr7[i44] = this.IconCompatParcelizer;
                return 0;
            case 34:
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                iArr8[i45] = 53;
                this.AudioAttributesImplApi21Parcelizer = i45;
                iArr8[i45 - 1] = iArr8[i45 - 1] + iArr8[i45];
                return 0;
            case 35:
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i46 + 1;
                iArr9[i46] = iArr9[i46 - 1];
                return 0;
            case 36:
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i47] = 128;
                this.AudioAttributesImplApi21Parcelizer = i47;
                iArr10[i47 - 1] = iArr10[i47 - 1] % iArr10[i47];
                return 0;
            case 37:
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i48 + 1;
                iArr11[i48] = 2;
                return 0;
            case 38:
                int i49 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i49;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver[i49] != 0 ? 0 : 1;
                return 0;
            case 39:
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = i50 - 1;
                this.AudioAttributesImplApi21Parcelizer = i51;
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                iArr12[i50 - 2] = iArr12[i50 - 2] % iArr12[i51];
                return 0;
            case 40:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i52] = 117;
                iArr13[i52 - 1] = iArr13[i52 - 1] + iArr13[i52];
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                iArr13[i52] = iArr13[i52 - 1];
                return 0;
            case 41:
                Object[] objArr20 = this.MediaBrowserCompatSearchResultReceiver;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i53 + 1;
                objArr20[i53] = null;
                return 0;
            case 42:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i54 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i54;
                this.RemoteActionCompatParcelizer = iArr14[i54];
                return 0;
            case 43:
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i55 + 1;
                iArr15[i55] = 0;
                return 0;
            case 44:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i56 + 1;
                iArr16[i56] = 2;
                return 0;
            case 45:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i57 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i57 + 1;
                iArr17[i57] = 63;
                return 0;
            case 46:
                for (int i58 = this.AudioAttributesImplApi21Parcelizer - 1; i58 >= 0; i58--) {
                    this.MediaBrowserCompatSearchResultReceiver[i58] = null;
                }
                Object[] objArr21 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr21[0] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 48:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i59] = 87;
                this.AudioAttributesImplApi21Parcelizer = i59;
                iArr18[i59 - 1] = iArr18[i59 - 1] + iArr18[i59];
            case 47:
                return 0;
            case 49:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i60] = iArr19[i60 - 1];
                iArr19[i60 + 1] = 128;
                int i61 = i60 + 1;
                this.AudioAttributesImplApi21Parcelizer = i61;
                iArr19[i60] = iArr19[i60] % iArr19[i61];
                return 0;
            case 50:
                Object[] objArr22 = this.MediaBrowserCompatSearchResultReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                objArr22[i62] = objArr22[5];
                this.AudioAttributesImplApi21Parcelizer = i62 + 2;
                objArr22[i62 + 1] = objArr22[6];
                return 0;
            case 51:
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                int i63 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr23 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj12 = objArr23[i63 - 1];
                objArr23[i63 - 1] = null;
                iArr20[i63 - 1] = ((int[]) obj12).length;
                int i64 = i63 - 1;
                this.AudioAttributesImplApi21Parcelizer = i64;
                objArr23[i64] = null;
                return 0;
            case 52:
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                int i65 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i65 + 1;
                iArr21[i65] = 45;
                return 0;
            case 53:
                int[] iArr22 = this.MediaBrowserCompatItemReceiver;
                int i66 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i66 + 1;
                iArr22[i66] = 24;
                return 0;
            case 54:
                this.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 55:
                int[] iArr23 = this.MediaBrowserCompatItemReceiver;
                int i67 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i67] = 13;
                this.AudioAttributesImplApi21Parcelizer = i67;
                iArr23[i67 - 1] = iArr23[i67 - 1] + iArr23[i67];
                return 0;
            case 56:
                int[] iArr24 = this.MediaBrowserCompatItemReceiver;
                int i68 = this.AudioAttributesImplApi21Parcelizer;
                iArr24[i68] = iArr24[i68 - 1];
                this.AudioAttributesImplApi21Parcelizer = i68 + 2;
                iArr24[i68 + 1] = 128;
                return 0;
            case 57:
                int[] iArr25 = this.MediaBrowserCompatItemReceiver;
                int i69 = this.AudioAttributesImplApi21Parcelizer;
                iArr25[i69] = 63;
                this.AudioAttributesImplApi21Parcelizer = i69;
                iArr25[i69 - 1] = iArr25[i69 - 1] + iArr25[i69];
                return 0;
            case 58:
                int[] iArr26 = this.MediaBrowserCompatItemReceiver;
                int i70 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i70 + 1;
                iArr26[i70] = 128;
                return 0;
            case 59:
                int[] iArr27 = this.MediaBrowserCompatItemReceiver;
                int i71 = this.AudioAttributesImplApi21Parcelizer;
                iArr27[i71] = 2;
                this.AudioAttributesImplApi21Parcelizer = i71;
                iArr27[i71 - 1] = iArr27[i71 - 1] % iArr27[i71];
                return 0;
            case 60:
                int[] iArr28 = this.MediaBrowserCompatItemReceiver;
                int i72 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i72 + 1;
                iArr28[i72] = 76;
                return 0;
            case 61:
                int[] iArr29 = this.MediaBrowserCompatItemReceiver;
                int i73 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i73 + 1;
                iArr29[i73] = 23;
                return 0;
            case 62:
                int[] iArr30 = this.MediaBrowserCompatItemReceiver;
                int i74 = this.AudioAttributesImplApi21Parcelizer;
                iArr30[i74] = 2;
                this.AudioAttributesImplApi21Parcelizer = i74;
                iArr30[i74 - 1] = iArr30[i74 - 1] % iArr30[i74];
                int i75 = i74 - 1;
                this.AudioAttributesImplApi21Parcelizer = i75;
                this.MediaBrowserCompatSearchResultReceiver[i75] = null;
                return 0;
            case 63:
                int[] iArr31 = this.MediaBrowserCompatItemReceiver;
                int i76 = this.AudioAttributesImplApi21Parcelizer;
                iArr31[i76] = 19;
                iArr31[i76 - 1] = iArr31[i76 - 1] + iArr31[i76];
                this.AudioAttributesImplApi21Parcelizer = i76 + 1;
                iArr31[i76] = iArr31[i76 - 1];
                return 0;
            case 64:
                int[] iArr32 = this.MediaBrowserCompatItemReceiver;
                int i77 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i77 + 1;
                iArr32[i77] = 68;
                return 0;
            case 65:
                int[] iArr33 = this.MediaBrowserCompatItemReceiver;
                int i78 = this.AudioAttributesImplApi21Parcelizer;
                iArr33[i78] = 0;
                this.AudioAttributesImplApi21Parcelizer = i78;
                iArr33[i78 - 1] = iArr33[i78 - 1] / iArr33[i78];
                int i79 = i78 - 1;
                this.AudioAttributesImplApi21Parcelizer = i79;
                this.MediaBrowserCompatSearchResultReceiver[i79] = null;
                return 0;
            case 66:
                int[] iArr34 = this.MediaBrowserCompatItemReceiver;
                int i80 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i80 + 1;
                iArr34[i80] = 25;
                return 0;
            case 67:
                int i81 = this.AudioAttributesImplApi21Parcelizer;
                int i82 = i81 - 1;
                int[] iArr35 = this.MediaBrowserCompatItemReceiver;
                iArr35[i81 - 2] = iArr35[i81 - 2] + iArr35[i82];
                iArr35[i82] = iArr35[i81 - 2];
                this.AudioAttributesImplApi21Parcelizer = i81 + 1;
                iArr35[i81] = 128;
                return 0;
            case 68:
                int[] iArr36 = this.MediaBrowserCompatItemReceiver;
                int i83 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i83 + 1;
                iArr36[i83] = 1;
                return 0;
            case 69:
                int i84 = this.AudioAttributesImplApi21Parcelizer;
                int i85 = i84 - 1;
                this.AudioAttributesImplApi21Parcelizer = i85;
                int[] iArr37 = this.MediaBrowserCompatItemReceiver;
                iArr37[i84 - 2] = iArr37[i84 - 2] + iArr37[i85];
                return 0;
            case 70:
                int[] iArr38 = this.MediaBrowserCompatItemReceiver;
                int i86 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i86 + 1;
                iArr38[i86] = 47;
                return 0;
            case 71:
                int[] iArr39 = this.MediaBrowserCompatItemReceiver;
                int i87 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i87 + 1;
                iArr39[i87] = 8;
                return 0;
            case 72:
                Object[] objArr24 = this.MediaBrowserCompatSearchResultReceiver;
                int i88 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i88 + 1;
                objArr24[i88] = objArr24[i88 - 1];
                return 0;
            case 73:
                int i89 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i89;
                Object[] objArr25 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj13 = objArr25[i89];
                objArr25[i89] = null;
                this.RemoteActionCompatParcelizer = obj13 == null ? 0 : 1;
                return 0;
            case 74:
                int i90 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i90;
                Object[] objArr26 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj14 = objArr26[i90];
                objArr26[i90] = null;
                objArr26[7] = obj14;
                return 0;
            case 75:
                Object[] objArr27 = this.MediaBrowserCompatSearchResultReceiver;
                int i91 = this.AudioAttributesImplApi21Parcelizer;
                objArr27[i91] = objArr27[7];
                int[] iArr40 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi21Parcelizer = i91 + 2;
                iArr40[i91 + 1] = iArr40[6];
                return 0;
            case 76:
                long[] jArr6 = this.MediaDescriptionCompat;
                int i92 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i92 + 1;
                jArr6[i92] = 0;
                return 0;
            case 77:
                int[] iArr41 = this.MediaBrowserCompatItemReceiver;
                int i93 = this.AudioAttributesImplApi21Parcelizer;
                iArr41[i93] = 27;
                iArr41[i93 - 1] = iArr41[i93 - 1] + iArr41[i93];
                this.AudioAttributesImplApi21Parcelizer = i93 + 1;
                iArr41[i93] = iArr41[i93 - 1];
                return 0;
            case 78:
                int[] iArr42 = this.MediaBrowserCompatItemReceiver;
                int i94 = this.AudioAttributesImplApi21Parcelizer;
                iArr42[i94] = 11;
                this.AudioAttributesImplApi21Parcelizer = i94;
                iArr42[i94 - 1] = iArr42[i94 - 1] + iArr42[i94];
                return 0;
            case 79:
                int[] iArr43 = this.MediaBrowserCompatItemReceiver;
                int i95 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i95 + 1;
                iArr43[i95] = 87;
                return 0;
            case 80:
                int[] iArr44 = this.MediaBrowserCompatItemReceiver;
                int i96 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i96 + 1;
                iArr44[i96] = 10;
                return 0;
            case 81:
                int[] iArr45 = this.MediaBrowserCompatItemReceiver;
                int i97 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i97 + 1;
                iArr45[i97] = 70;
                return 0;
            case 82:
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 83:
                int[] iArr46 = this.MediaBrowserCompatItemReceiver;
                int i98 = this.AudioAttributesImplApi21Parcelizer;
                iArr46[i98] = 57;
                this.AudioAttributesImplApi21Parcelizer = i98;
                iArr46[i98 - 1] = iArr46[i98 - 1] + iArr46[i98];
                return 0;
            case 84:
                int[] iArr47 = this.MediaBrowserCompatItemReceiver;
                int i99 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i99 + 1;
                iArr47[i99] = 95;
                return 0;
            case 85:
                int[] iArr48 = this.MediaBrowserCompatItemReceiver;
                int i100 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i100 + 1;
                iArr48[i100] = 36;
                return 0;
            case 86:
                int[] iArr49 = this.MediaBrowserCompatItemReceiver;
                int i101 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i101 + 1;
                iArr49[i101] = 50;
                return 0;
            case 87:
                int i102 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i102;
                Object[] objArr28 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj15 = objArr28[i102];
                objArr28[i102] = null;
                this.RemoteActionCompatParcelizer = obj15 != null ? 0 : 1;
                return 0;
            case 88:
                int i103 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i103;
                Object[] objArr29 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj16 = objArr29[i103];
                objArr29[i103] = null;
                objArr29[6] = obj16;
                return 0;
            case 89:
                int[] iArr50 = this.MediaBrowserCompatItemReceiver;
                int i104 = this.AudioAttributesImplApi21Parcelizer;
                iArr50[i104] = 123;
                iArr50[i104 - 1] = iArr50[i104 - 1] + iArr50[i104];
                this.AudioAttributesImplApi21Parcelizer = i104 + 1;
                iArr50[i104] = iArr50[i104 - 1];
                return 0;
            case 90:
                int[] iArr51 = this.MediaBrowserCompatItemReceiver;
                int i105 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i105 + 1;
                iArr51[i105] = 109;
                return 0;
            case 91:
                int[] iArr52 = this.MediaBrowserCompatItemReceiver;
                int i106 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i106 + 1;
                iArr52[i106] = 29;
                return 0;
            case 92:
                int[] iArr53 = this.MediaBrowserCompatItemReceiver;
                int i107 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i107 + 1;
                iArr53[i107] = 26;
                return 0;
            case 93:
                int i108 = this.AudioAttributesImplApi21Parcelizer;
                int i109 = i108 - 2;
                this.AudioAttributesImplApi21Parcelizer = i109;
                int[] iArr54 = this.MediaBrowserCompatItemReceiver;
                this.RemoteActionCompatParcelizer = iArr54[i109] != iArr54[i108 - 1] ? 0 : 1;
                return 0;
            case 94:
                int[] iArr55 = this.MediaBrowserCompatItemReceiver;
                int i110 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i110 + 1;
                iArr55[i110] = 3;
                return 0;
            case 95:
                int[] iArr56 = this.MediaBrowserCompatItemReceiver;
                int i111 = this.AudioAttributesImplApi21Parcelizer;
                iArr56[i111] = 103;
                this.AudioAttributesImplApi21Parcelizer = i111;
                iArr56[i111 - 1] = iArr56[i111 - 1] + iArr56[i111];
                return 0;
            case 96:
                int[] iArr57 = this.MediaBrowserCompatItemReceiver;
                int i112 = this.AudioAttributesImplApi21Parcelizer;
                iArr57[i112] = 5;
                this.AudioAttributesImplApi21Parcelizer = i112 + 2;
                iArr57[i112 + 1] = 0;
                return 0;
            case 97:
                int i113 = this.AudioAttributesImplApi21Parcelizer;
                int i114 = i113 - 1;
                this.AudioAttributesImplApi21Parcelizer = i114;
                int[] iArr58 = this.MediaBrowserCompatItemReceiver;
                iArr58[i113 - 2] = iArr58[i113 - 2] / iArr58[i114];
                return 0;
            case 98:
                int[] iArr59 = this.MediaBrowserCompatItemReceiver;
                int i115 = this.AudioAttributesImplApi21Parcelizer;
                iArr59[i115] = 39;
                this.AudioAttributesImplApi21Parcelizer = i115;
                iArr59[i115 - 1] = iArr59[i115 - 1] + iArr59[i115];
                return 0;
            case 99:
                int[] iArr60 = this.MediaBrowserCompatItemReceiver;
                int i116 = this.AudioAttributesImplApi21Parcelizer;
                iArr60[i116] = 73;
                iArr60[i116 + 1] = 0;
                int i117 = i116 + 1;
                this.AudioAttributesImplApi21Parcelizer = i117;
                iArr60[i116] = iArr60[i116] / iArr60[i117];
                return 0;
            case 100:
                int[] iArr61 = this.MediaBrowserCompatItemReceiver;
                int i118 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i118 + 1;
                iArr61[i118] = 81;
                return 0;
            case 101:
                int[] iArr62 = this.MediaBrowserCompatItemReceiver;
                int i119 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i119 + 1;
                iArr62[i119] = 28;
                return 0;
            case 102:
                int[] iArr63 = this.MediaBrowserCompatItemReceiver;
                int i120 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i120 + 1;
                iArr63[i120] = 79;
                return 0;
            case 103:
                Object[] objArr30 = this.MediaBrowserCompatSearchResultReceiver;
                int i121 = this.AudioAttributesImplApi21Parcelizer;
                objArr30[i121] = objArr30[5];
                this.AudioAttributesImplApi21Parcelizer = i121 + 2;
                objArr30[i121 + 1] = null;
                return 0;
            case 104:
                int[] iArr64 = this.MediaBrowserCompatItemReceiver;
                int i122 = this.AudioAttributesImplApi21Parcelizer;
                iArr64[i122] = 2;
                this.AudioAttributesImplApi21Parcelizer = i122 + 2;
                iArr64[i122 + 1] = 0;
                return 0;
            case 105:
                int i123 = this.AudioAttributesImplApi21Parcelizer;
                int i124 = i123 - 1;
                this.AudioAttributesImplApi21Parcelizer = i124;
                int[] iArr65 = this.MediaBrowserCompatItemReceiver;
                iArr65[i123 - 2] = iArr65[i123 - 2] / iArr65[i124];
                int i125 = i123 - 2;
                this.AudioAttributesImplApi21Parcelizer = i125;
                this.MediaBrowserCompatSearchResultReceiver[i125] = null;
                return 0;
            case 106:
                int[] iArr66 = this.MediaBrowserCompatItemReceiver;
                int i126 = this.AudioAttributesImplApi21Parcelizer;
                iArr66[i126] = 99;
                this.AudioAttributesImplApi21Parcelizer = i126;
                iArr66[i126 - 1] = iArr66[i126 - 1] + iArr66[i126];
                return 0;
            case 107:
                Object[] objArr31 = this.MediaBrowserCompatSearchResultReceiver;
                int i127 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i127 + 1;
                objArr31[i127] = null;
                int[] iArr67 = this.MediaBrowserCompatItemReceiver;
                Object obj17 = objArr31[i127];
                objArr31[i127] = null;
                iArr67[i127] = ((int[]) obj17).length;
                return 0;
            case 108:
                int[] iArr68 = this.MediaBrowserCompatItemReceiver;
                int i128 = this.AudioAttributesImplApi21Parcelizer;
                iArr68[i128] = 95;
                iArr68[i128 - 1] = iArr68[i128 - 1] + iArr68[i128];
                this.AudioAttributesImplApi21Parcelizer = i128 + 1;
                iArr68[i128] = iArr68[i128 - 1];
                return 0;
            case 109:
                int[] iArr69 = this.MediaBrowserCompatItemReceiver;
                int i129 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i129 + 1;
                iArr69[i129] = 71;
                return 0;
            case 110:
                int[] iArr70 = this.MediaBrowserCompatItemReceiver;
                int i130 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i130 + 1;
                iArr70[i130] = 58;
                return 0;
            case 111:
                float[] fArr = this.RatingCompat;
                int i131 = this.AudioAttributesImplApi21Parcelizer;
                fArr[i131] = fArr[6];
                this.AudioAttributesImplApi21Parcelizer = i131 + 2;
                fArr[i131 + 1] = 1.0f;
                return 0;
            case 112:
                float[] fArr2 = this.RatingCompat;
                int i132 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i132 + 1;
                this.write = fArr2[i132];
                return 0;
            case 113:
                int[] iArr71 = this.MediaBrowserCompatItemReceiver;
                int i133 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i133 + 1;
                iArr71[i133] = 33;
                return 0;
            case 114:
                int[] iArr72 = this.MediaBrowserCompatItemReceiver;
                int i134 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i134 + 1;
                iArr72[i134] = 52;
                return 0;
            case 115:
                int[] iArr73 = this.MediaBrowserCompatItemReceiver;
                int i135 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i135 + 1;
                iArr73[i135] = 0;
                return 0;
            case 116:
                int[] iArr74 = this.MediaBrowserCompatItemReceiver;
                int i136 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i136 + 1;
                iArr74[i136] = 121;
                return 0;
            case 117:
                int[] iArr75 = this.MediaBrowserCompatItemReceiver;
                int i137 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i137 + 1;
                iArr75[i137] = 73;
                return 0;
            case 118:
                int i138 = this.AudioAttributesImplApi21Parcelizer;
                int i139 = i138 - 1;
                int[] iArr76 = this.MediaBrowserCompatItemReceiver;
                iArr76[i138 - 2] = iArr76[i138 - 2] + iArr76[i139];
                this.AudioAttributesImplApi21Parcelizer = i138;
                iArr76[i139] = iArr76[i138 - 2];
                return 0;
            default:
                return i;
        }
    }

    public OtpVerifyRequestBody(Object obj, Object obj2) {
        this.MediaBrowserCompatItemReceiver = new int[12];
        this.MediaDescriptionCompat = new long[12];
        this.RatingCompat = new float[12];
        this.MediaBrowserCompatMediaItem = new double[12];
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public OtpVerifyRequestBody(Object obj) {
        this.MediaBrowserCompatItemReceiver = new int[12];
        this.MediaDescriptionCompat = new long[12];
        this.RatingCompat = new float[12];
        this.MediaBrowserCompatMediaItem = new double[12];
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[5] = obj;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public OtpVerifyRequestBody(Object obj, int i) {
        int[] iArr = new int[12];
        this.MediaBrowserCompatItemReceiver = iArr;
        this.MediaDescriptionCompat = new long[12];
        this.RatingCompat = new float[12];
        this.MediaBrowserCompatMediaItem = new double[12];
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[5] = obj;
        iArr[6] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public OtpVerifyRequestBody(Object obj, float f) {
        this.MediaBrowserCompatItemReceiver = new int[12];
        this.MediaDescriptionCompat = new long[12];
        float[] fArr = new float[12];
        this.RatingCompat = fArr;
        this.MediaBrowserCompatMediaItem = new double[12];
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[5] = obj;
        fArr[6] = f;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }
}
