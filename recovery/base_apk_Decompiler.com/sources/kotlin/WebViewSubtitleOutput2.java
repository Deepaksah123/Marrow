package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewSubtitleOutput2 {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final double[] AudioAttributesImplApi26Parcelizer;
    private final int[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final float[] MediaBrowserCompatCustomActionResultReceiver;
    private final long[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public Object write;

    public WebViewSubtitleOutput2(Object obj) {
        this.AudioAttributesImplBaseParcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.MediaBrowserCompatCustomActionResultReceiver = new float[10];
        this.AudioAttributesImplApi26Parcelizer = new double[10];
        Object[] objArr = new Object[10];
        this.MediaDescriptionCompat = objArr;
        objArr[5] = obj;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaDescriptionCompat;
                int i2 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i2 + 1;
                objArr[i2] = objArr[5];
                return 0;
            case 2:
                int i3 = this.AudioAttributesCompatParcelizer - this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i3;
                this.AudioAttributesImplApi21Parcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i5 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i5 + 1;
                objArr3[i5] = this.write;
                return 0;
            case 5:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i6 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i6 + 1;
                iArr[i6] = 2;
                return 0;
            case 6:
                int i7 = this.AudioAttributesCompatParcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesCompatParcelizer = i8;
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.AudioAttributesCompatParcelizer = i9;
                this.MediaDescriptionCompat[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaDescriptionCompat;
                int i10 = this.AudioAttributesCompatParcelizer;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.RemoteActionCompatParcelizer = obj2;
            case 7:
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i11 + 1;
                iArr3[i11] = this.IconCompatParcelizer;
                return 0;
            case 10:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i12 = this.AudioAttributesCompatParcelizer;
                iArr4[i12] = 65;
                iArr4[i12 - 1] = iArr4[i12 - 1] + iArr4[i12];
                this.AudioAttributesCompatParcelizer = i12 + 1;
                iArr4[i12] = iArr4[i12 - 1];
                return 0;
            case 11:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i13 + 1;
                this.read = iArr5[i13];
                return 0;
            case 12:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i14 = this.AudioAttributesCompatParcelizer;
                iArr6[i14] = 128;
                this.AudioAttributesCompatParcelizer = i14;
                iArr6[i14 - 1] = iArr6[i14 - 1] % iArr6[i14];
                return 0;
            case 13:
                int i15 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i15;
                this.read = this.AudioAttributesImplBaseParcelizer[i15] != 0 ? 0 : 1;
                return 0;
            case 14:
                int i16 = this.AudioAttributesCompatParcelizer;
                int i17 = i16 - 1;
                this.AudioAttributesCompatParcelizer = i17;
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                iArr7[i16 - 2] = iArr7[i16 - 2] % iArr7[i17];
                return 0;
            case 15:
                Object[] objArr5 = this.MediaDescriptionCompat;
                int i18 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i18 + 1;
                objArr5[i18] = null;
                return 0;
            case 16:
                int i19 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i19;
                this.MediaDescriptionCompat[i19] = null;
                return 0;
            case 17:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i20 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i20;
                this.read = iArr8[i20];
                return 0;
            case 18:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i21 + 1;
                iArr9[i21] = 0;
                return 0;
            case 19:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i22 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i22 + 1;
                iArr10[i22] = 1;
                return 0;
            case 20:
                for (int i23 = this.AudioAttributesCompatParcelizer - 1; i23 >= 0; i23--) {
                    this.MediaDescriptionCompat[i23] = null;
                }
                Object[] objArr6 = this.MediaDescriptionCompat;
                this.AudioAttributesCompatParcelizer = 1;
                objArr6[0] = this.write;
                return 0;
            case 21:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i24 = this.AudioAttributesCompatParcelizer;
                iArr11[i24] = 9;
                this.AudioAttributesCompatParcelizer = i24;
                iArr11[i24 - 1] = iArr11[i24 - 1] + iArr11[i24];
                return 0;
            case 22:
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i25 + 1;
                iArr12[i25] = iArr12[i25 - 1];
                return 0;
            case 23:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i26 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i26 + 1;
                iArr13[i26] = 128;
                return 0;
            case 24:
                int i27 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i27;
                this.read = this.AudioAttributesImplBaseParcelizer[i27] == 0 ? 0 : 1;
                return 0;
            case 25:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.AudioAttributesCompatParcelizer;
                iArr14[i28] = 45;
                iArr14[i28 - 1] = iArr14[i28 - 1] + iArr14[i28];
                this.AudioAttributesCompatParcelizer = i28 + 1;
                iArr14[i28] = iArr14[i28 - 1];
                return 0;
            case 26:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i29 = this.AudioAttributesCompatParcelizer;
                iArr15[i29] = 2;
                this.AudioAttributesCompatParcelizer = i29;
                iArr15[i29 - 1] = iArr15[i29 - 1] % iArr15[i29];
                return 0;
            case 27:
                Object[] objArr7 = this.MediaDescriptionCompat;
                int i30 = this.AudioAttributesCompatParcelizer;
                objArr7[i30] = objArr7[5];
                this.AudioAttributesCompatParcelizer = i30 + 2;
                objArr7[i30 + 1] = objArr7[6];
                return 0;
            case 28:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i31 = this.AudioAttributesCompatParcelizer;
                iArr16[i31] = iArr16[7];
                Object[] objArr8 = this.MediaDescriptionCompat;
                this.AudioAttributesCompatParcelizer = i31 + 2;
                objArr8[i31 + 1] = objArr8[8];
                return 0;
            case 29:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i32 = this.AudioAttributesCompatParcelizer;
                iArr17[i32] = 2;
                this.AudioAttributesCompatParcelizer = i32 + 2;
                iArr17[i32 + 1] = 2;
                return 0;
            case 30:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i33 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i33 + 1;
                iArr18[i33] = 9;
                return 0;
            case 31:
                int i34 = this.AudioAttributesCompatParcelizer;
                int i35 = i34 - 1;
                this.AudioAttributesCompatParcelizer = i35;
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                iArr19[i34 - 2] = iArr19[i34 - 2] + iArr19[i35];
                return 0;
            case 32:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i36 = this.AudioAttributesCompatParcelizer;
                iArr20[i36] = iArr20[i36 - 1];
                iArr20[i36 + 1] = 128;
                int i37 = i36 + 1;
                this.AudioAttributesCompatParcelizer = i37;
                iArr20[i36] = iArr20[i36] % iArr20[i37];
                return 0;
            case 33:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.AudioAttributesCompatParcelizer;
                iArr21[i38] = 32;
                iArr21[i38 + 1] = 0;
                int i39 = i38 + 1;
                this.AudioAttributesCompatParcelizer = i39;
                iArr21[i38] = iArr21[i38] / iArr21[i39];
                return 0;
            case 34:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i40 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i40 + 1;
                iArr22[i40] = 31;
                return 0;
            case 35:
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                int i41 = this.AudioAttributesCompatParcelizer;
                iArr23[i41] = iArr23[i41 - 1];
                this.AudioAttributesCompatParcelizer = i41 + 2;
                iArr23[i41 + 1] = 128;
                return 0;
            case 36:
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                int i42 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i42 + 1;
                iArr24[i42] = 36;
                return 0;
            case 37:
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                int i43 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i43 + 1;
                iArr25[i43] = 59;
                return 0;
            case 38:
                Object[] objArr9 = this.MediaDescriptionCompat;
                int i44 = this.AudioAttributesCompatParcelizer;
                objArr9[i44] = objArr9[8];
                this.AudioAttributesCompatParcelizer = i44 + 2;
                objArr9[i44 + 1] = objArr9[7];
                return 0;
            case 39:
                int i45 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i45;
                Object[] objArr10 = this.MediaDescriptionCompat;
                Object obj3 = objArr10[i45];
                objArr10[i45] = null;
                objArr10[7] = obj3;
                return 0;
            case 40:
                Object[] objArr11 = this.MediaDescriptionCompat;
                int i46 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i46 + 1;
                objArr11[i46] = objArr11[7];
                return 0;
            case 41:
                int i47 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i47;
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                iArr26[9] = iArr26[i47];
                return 0;
            case 42:
                int i48 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i48;
                Object[] objArr12 = this.MediaDescriptionCompat;
                Object obj4 = objArr12[i48];
                objArr12[i48] = null;
                objArr12[8] = obj4;
                return 0;
            case 43:
                Object[] objArr13 = this.MediaDescriptionCompat;
                int i49 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i49 + 1;
                objArr13[i49] = objArr13[8];
                return 0;
            case 44:
                Object[] objArr14 = this.MediaDescriptionCompat;
                int i50 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i50 + 1;
                objArr14[i50] = objArr14[6];
                return 0;
            case 45:
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                int i51 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i51 + 1;
                iArr27[i51] = iArr27[9];
                return 0;
            case 46:
                Object[] objArr15 = this.MediaDescriptionCompat;
                int i52 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i52 + 1;
                objArr15[i52] = objArr15[i52 - 1];
                return 0;
            case 47:
                int i53 = this.AudioAttributesCompatParcelizer;
                int i54 = i53 - 1;
                Object[] objArr16 = this.MediaDescriptionCompat;
                Object obj5 = objArr16[i54];
                objArr16[i54] = null;
                objArr16[8] = obj5;
                this.AudioAttributesCompatParcelizer = i53;
                objArr16[i54] = objArr16[5];
                return 0;
            case 48:
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                int i55 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i55 + 1;
                iArr28[i55] = 9001;
                return 0;
            case 49:
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                int i56 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i56 + 1;
                iArr29[i56] = 83;
                return 0;
            case 50:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i57 = this.AudioAttributesCompatParcelizer;
                iArr30[i57] = 3;
                iArr30[i57 + 1] = 4;
                int i58 = i57 + 1;
                this.AudioAttributesCompatParcelizer = i58;
                iArr30[i57] = iArr30[i57] << iArr30[i58];
                return 0;
            case 51:
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                int i59 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i59 + 1;
                iArr31[i59] = 121;
                return 0;
            case 52:
                int i60 = this.AudioAttributesCompatParcelizer;
                int i61 = i60 - 1;
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                iArr32[i60 - 2] = iArr32[i60 - 2] + iArr32[i61];
                this.AudioAttributesCompatParcelizer = i60;
                iArr32[i61] = iArr32[i60 - 2];
                return 0;
            case 53:
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                int i62 = this.AudioAttributesCompatParcelizer;
                Object[] objArr17 = this.MediaDescriptionCompat;
                Object obj6 = objArr17[i62 - 1];
                objArr17[i62 - 1] = null;
                iArr33[i62 - 1] = ((int[]) obj6).length;
                return 0;
            case 54:
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                int i63 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i63 + 1;
                iArr34[i63] = 87;
                return 0;
            case 55:
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                int i64 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i64 + 1;
                iArr35[i64] = 47;
                return 0;
            case 56:
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                int i65 = this.AudioAttributesCompatParcelizer;
                iArr36[i65] = 121;
                this.AudioAttributesCompatParcelizer = i65;
                iArr36[i65 - 1] = iArr36[i65 - 1] + iArr36[i65];
                return 0;
            case 57:
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                int i66 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i66 + 1;
                iArr37[i66] = iArr37[7];
                return 0;
            case 58:
                int i67 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i67;
                Object[] objArr18 = this.MediaDescriptionCompat;
                Object obj7 = objArr18[i67];
                objArr18[i67] = null;
                objArr18[9] = obj7;
                return 0;
            case 59:
                int i68 = this.AudioAttributesCompatParcelizer;
                int i69 = i68 - 1;
                Object[] objArr19 = this.MediaDescriptionCompat;
                objArr19[i69] = null;
                this.AudioAttributesCompatParcelizer = i68;
                objArr19[i69] = objArr19[6];
                return 0;
            case 60:
                int i70 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i70;
                Object[] objArr20 = this.MediaDescriptionCompat;
                Object obj8 = objArr20[i70];
                objArr20[i70] = null;
                objArr20[6] = obj8;
                return 0;
            case 61:
                int i71 = this.AudioAttributesCompatParcelizer;
                int i72 = i71 - 1;
                Object[] objArr21 = this.MediaDescriptionCompat;
                Object obj9 = objArr21[i72];
                objArr21[i72] = null;
                objArr21[8] = obj9;
                objArr21[i72] = objArr21[9];
                this.AudioAttributesCompatParcelizer = i71 + 1;
                objArr21[i71] = objArr21[6];
                return 0;
            case 62:
                Object[] objArr22 = this.MediaDescriptionCompat;
                int i73 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i73 + 1;
                objArr22[i73] = null;
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                Object obj10 = objArr22[i73];
                objArr22[i73] = null;
                iArr38[i73] = ((int[]) obj10).length;
                this.AudioAttributesCompatParcelizer = i73;
                objArr22[i73] = null;
                return 0;
            case 63:
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                int i74 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i74 + 1;
                iArr39[i74] = 15;
                return 0;
            case 64:
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                int i75 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i75 + 1;
                iArr40[i75] = 85;
                return 0;
            case 65:
                Object[] objArr23 = this.MediaDescriptionCompat;
                int i76 = this.AudioAttributesCompatParcelizer;
                objArr23[i76] = objArr23[i76 - 1];
                this.AudioAttributesCompatParcelizer = i76;
                Object obj11 = objArr23[i76];
                objArr23[i76] = null;
                objArr23[7] = obj11;
                return 0;
            case 66:
                Object[] objArr24 = this.MediaDescriptionCompat;
                int i77 = this.AudioAttributesCompatParcelizer;
                objArr24[i77] = objArr24[i77 - 1];
                this.AudioAttributesCompatParcelizer = i77;
                Object obj12 = objArr24[i77];
                objArr24[i77] = null;
                objArr24[8] = obj12;
                return 0;
            case 67:
                Object[] objArr25 = this.MediaDescriptionCompat;
                int i78 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i78 + 1;
                objArr25[i78] = objArr25[9];
                return 0;
            case 68:
                int i79 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i79;
                Object[] objArr26 = this.MediaDescriptionCompat;
                Object obj13 = objArr26[i79];
                objArr26[i79] = null;
                this.read = obj13 != null ? 0 : 1;
                return 0;
            case 69:
                Object[] objArr27 = this.MediaDescriptionCompat;
                int i80 = this.AudioAttributesCompatParcelizer;
                objArr27[i80] = objArr27[i80 - 1];
                this.AudioAttributesCompatParcelizer = i80;
                Object obj14 = objArr27[i80];
                objArr27[i80] = null;
                objArr27[9] = obj14;
                return 0;
            case 70:
                Object[] objArr28 = this.MediaDescriptionCompat;
                int i81 = this.AudioAttributesCompatParcelizer;
                objArr28[i81] = objArr28[8];
                this.AudioAttributesCompatParcelizer = i81 + 2;
                objArr28[i81 + 1] = objArr28[9];
                return 0;
            case 71:
                Object[] objArr29 = this.MediaDescriptionCompat;
                int i82 = this.AudioAttributesCompatParcelizer;
                objArr29[i82] = objArr29[7];
                this.AudioAttributesCompatParcelizer = i82 + 2;
                objArr29[i82 + 1] = objArr29[6];
                return 0;
            case 72:
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                int i83 = this.AudioAttributesCompatParcelizer;
                iArr41[i83] = 19;
                iArr41[i83 - 1] = iArr41[i83 - 1] + iArr41[i83];
                this.AudioAttributesCompatParcelizer = i83 + 1;
                iArr41[i83] = iArr41[i83 - 1];
                return 0;
            case 73:
                int[] iArr42 = this.AudioAttributesImplBaseParcelizer;
                int i84 = this.AudioAttributesCompatParcelizer;
                iArr42[i84] = 109;
                this.AudioAttributesCompatParcelizer = i84;
                iArr42[i84 - 1] = iArr42[i84 - 1] + iArr42[i84];
                return 0;
            case 74:
                int[] iArr43 = this.AudioAttributesImplBaseParcelizer;
                int i85 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i85 + 1;
                iArr43[i85] = 39;
                return 0;
            case 75:
                int[] iArr44 = this.AudioAttributesImplBaseParcelizer;
                int i86 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i86 + 1;
                iArr44[i86] = 10;
                return 0;
            case 76:
                int[] iArr45 = this.AudioAttributesImplBaseParcelizer;
                int i87 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i87 + 1;
                iArr45[i87] = 97;
                return 0;
            default:
                return i;
        }
    }

    public WebViewSubtitleOutput2(Object obj, Object obj2, int i, Object obj3) {
        int[] iArr = new int[10];
        this.AudioAttributesImplBaseParcelizer = iArr;
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.MediaBrowserCompatCustomActionResultReceiver = new float[10];
        this.AudioAttributesImplApi26Parcelizer = new double[10];
        Object[] objArr = new Object[10];
        this.MediaDescriptionCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        iArr[7] = i;
        objArr[8] = obj3;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public WebViewSubtitleOutput2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.AudioAttributesImplBaseParcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.MediaBrowserCompatCustomActionResultReceiver = new float[10];
        this.AudioAttributesImplApi26Parcelizer = new double[10];
        Object[] objArr = new Object[10];
        this.MediaDescriptionCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public WebViewSubtitleOutput2(Object obj, Object obj2) {
        this.AudioAttributesImplBaseParcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.MediaBrowserCompatCustomActionResultReceiver = new float[10];
        this.AudioAttributesImplApi26Parcelizer = new double[10];
        Object[] objArr = new Object[10];
        this.MediaDescriptionCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }
}
