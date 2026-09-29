package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class onFormatResult {
    public int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public Object AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final long[] MediaBrowserCompatItemReceiver;
    private final double[] MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final float[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public Object write;

    public onFormatResult(Object obj) {
        this.AudioAttributesImplApi21Parcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.RatingCompat = new float[10];
        this.MediaBrowserCompatMediaItem = new double[10];
        Object[] objArr = new Object[10];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[6] = obj;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                objArr[i2] = objArr[6];
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i3;
                this.AudioAttributesImplApi26Parcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i4 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.AudioAttributesImplBaseParcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i5 + 1;
                objArr3[i5] = this.write;
                return 0;
            case 5:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr[i6] = 2;
                iArr[i6 + 1] = 2;
                int i7 = i6 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i7;
                iArr[i6] = iArr[i6] % iArr[i7];
                return 0;
            case 6:
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i8;
                this.MediaBrowserCompatSearchResultReceiver[i8] = null;
                return 0;
            case 7:
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj2 = objArr4[i9 - 1];
                objArr4[i9 - 1] = null;
                this.AudioAttributesImplBaseParcelizer = obj2;
                return 0;
            case 9:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                iArr2[i10] = this.AudioAttributesCompatParcelizer;
            case 8:
                return 0;
            case 10:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 1;
                iArr3[i11] = 91;
                return 0;
            case 11:
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = i12 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                iArr4[i12 - 2] = iArr4[i12 - 2] + iArr4[i13];
                return 0;
            case 12:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                iArr5[i14] = iArr5[i14 - 1];
                return 0;
            case 13:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                iArr6[i15] = 128;
                return 0;
            case 14:
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i17 = i16 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i17;
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i16 - 2] = iArr7[i16 - 2] % iArr7[i17];
                return 0;
            case 15:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i18 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i18 + 1;
                this.read = iArr8[i18];
                return 0;
            case 16:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i19] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i19;
                iArr9[i19 - 1] = iArr9[i19 - 1] % iArr9[i19];
                return 0;
            case 17:
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i20;
                this.read = this.AudioAttributesImplApi21Parcelizer[i20] != 0 ? 0 : 1;
                return 0;
            case 18:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i21 + 1;
                iArr10[i21] = 31;
                return 0;
            case 19:
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = i22 - 1;
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                iArr11[i22 - 2] = iArr11[i22 - 2] + iArr11[i23];
                iArr11[i23] = iArr11[i22 - 2];
                this.MediaBrowserCompatCustomActionResultReceiver = i22 + 1;
                iArr11[i22] = 128;
                return 0;
            case 20:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                iArr12[i24] = 2;
                return 0;
            case 21:
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i25;
                this.read = this.AudioAttributesImplApi21Parcelizer[i25] == 0 ? 0 : 1;
                return 0;
            case 22:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i26 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i26 + 1;
                objArr5[i26] = null;
                return 0;
            case 23:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i27 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i27;
                this.read = iArr13[i27];
                return 0;
            case 24:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i28 + 1;
                iArr14[i28] = 1;
                return 0;
            case 25:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i29 + 1;
                iArr15[i29] = 0;
                return 0;
            case 26:
                for (int i30 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i30 >= 0; i30--) {
                    this.MediaBrowserCompatSearchResultReceiver[i30] = null;
                }
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr6[0] = this.write;
                return 0;
            case 27:
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i31;
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj3 = objArr7[i31];
                objArr7[i31] = null;
                objArr7[9] = obj3;
                return 0;
            case 28:
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i32;
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[8] = iArr16[i32];
                return 0;
            case 29:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i33] = iArr17[8];
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i33 + 2;
                objArr8[i33 + 1] = objArr8[7];
                return 0;
            case 30:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj4 = objArr9[i34 - 1];
                objArr9[i34 - 1] = null;
                iArr18[i34 - 1] = ((int[]) obj4).length;
                return 0;
            case 31:
                int i35 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i36 = i35 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i36;
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr19[i36] >= iArr19[i35 - 1] ? 0 : 1;
                return 0;
            case 32:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr20[i37] = iArr20[8];
                this.MediaBrowserCompatCustomActionResultReceiver = i37 + 2;
                iArr20[i37 + 1] = 4;
                return 0;
            case 33:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 + 1;
                objArr10[i38] = objArr10[9];
                return 0;
            case 34:
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i39 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i39 + 1;
                objArr11[i39] = objArr11[7];
                return 0;
            case 35:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i40 + 1;
                iArr21[i40] = iArr21[8];
                return 0;
            case 36:
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i42 = i41 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i42;
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj5 = objArr12[i41 - 2];
                objArr12[i41 - 2] = null;
                iArr22[i41 - 2] = ((int[]) obj5)[iArr22[i42]];
                return 0;
            case 37:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i43 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr13[i43] = objArr13[7];
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i43 + 1] = iArr23[8];
                int i44 = i43 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i44;
                Object obj6 = objArr13[i43];
                objArr13[i43] = null;
                iArr23[i43] = ((int[]) obj6)[iArr23[i44]];
                return 0;
            case 38:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                iArr24[8] = iArr24[8] + 1;
                return 0;
            case 39:
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i45;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj7 = objArr14[i45];
                objArr14[i45] = null;
                objArr14[7] = obj7;
                return 0;
            case 40:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr25[i46] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i46 + 2;
                iArr25[i46 + 1] = 2;
                return 0;
            case 41:
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i47 + 1;
                iArr26[i47] = 105;
                return 0;
            case 42:
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr27[i48] = iArr27[i48 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i48 + 2;
                iArr27[i48 + 1] = 128;
                return 0;
            case 43:
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i50 = i49 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                iArr28[i49 - 2] = iArr28[i49 - 2] << iArr28[i50];
                return 0;
            case 44:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr29[i51] = 37;
                this.MediaBrowserCompatCustomActionResultReceiver = i51;
                iArr29[i51 - 1] = iArr29[i51 - 1] + iArr29[i51];
                return 0;
            case 45:
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr30[i52] = 128;
                this.MediaBrowserCompatCustomActionResultReceiver = i52;
                iArr30[i52 - 1] = iArr30[i52 - 1] % iArr30[i52];
                return 0;
            case 46:
                int[] iArr31 = this.AudioAttributesImplApi21Parcelizer;
                int i53 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i53 + 1;
                iArr31[i53] = 39;
                return 0;
            case 47:
                int[] iArr32 = this.AudioAttributesImplApi21Parcelizer;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i54 + 1;
                iArr32[i54] = 81;
                return 0;
            case 48:
                int[] iArr33 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i55 + 1;
                iArr33[i55] = 77;
                return 0;
            case 49:
                int[] iArr34 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i56 + 1;
                iArr34[i56] = 16;
                return 0;
            case 50:
                int[] iArr35 = this.AudioAttributesImplApi21Parcelizer;
                int i57 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i57 + 1;
                iArr35[i57] = 32;
                return 0;
            case 51:
                long[] jArr = this.MediaBrowserCompatItemReceiver;
                int i58 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i58 + 1;
                jArr[i58] = this.IconCompatParcelizer;
                return 0;
            case 52:
                int i59 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i60 = i59 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i60;
                long[] jArr2 = this.MediaBrowserCompatItemReceiver;
                jArr2[i59 - 2] = jArr2[i59 - 2] + jArr2[i60];
                return 0;
            case 53:
                int i61 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i62 = i61 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i62;
                long[] jArr3 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi21Parcelizer[i61 - 2] = (jArr3[i61 - 2] > jArr3[i62] ? 1 : (jArr3[i61 - 2] == jArr3[i62] ? 0 : -1));
                return 0;
            case 54:
                int i63 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i63;
                this.read = this.AudioAttributesImplApi21Parcelizer[i63] <= 0 ? 0 : 1;
                return 0;
            case 55:
                this.read = this.AudioAttributesImplApi21Parcelizer[this.MediaBrowserCompatCustomActionResultReceiver - 1];
                return 0;
            case 56:
                int[] iArr36 = this.AudioAttributesImplApi21Parcelizer;
                int i64 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i64 + 1;
                iArr36[i64] = 13;
                return 0;
            case 57:
                int[] iArr37 = this.AudioAttributesImplApi21Parcelizer;
                int i65 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr37[i65] = 99;
                iArr37[i65 - 1] = iArr37[i65 - 1] + iArr37[i65];
                this.MediaBrowserCompatCustomActionResultReceiver = i65 + 1;
                iArr37[i65] = iArr37[i65 - 1];
                return 0;
            case 58:
                int i66 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i67 = i66 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i67;
                int[] iArr38 = this.AudioAttributesImplApi21Parcelizer;
                iArr38[i66 - 2] = iArr38[i66 - 2] % iArr38[i67];
                int i68 = i66 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i68;
                this.MediaBrowserCompatSearchResultReceiver[i68] = null;
                return 0;
            case 59:
                int[] iArr39 = this.AudioAttributesImplApi21Parcelizer;
                int i69 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i69 + 1;
                iArr39[i69] = 67;
                return 0;
            case 60:
                int[] iArr40 = this.AudioAttributesImplApi21Parcelizer;
                int i70 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj8 = objArr15[i70 - 1];
                objArr15[i70 - 1] = null;
                iArr40[i70 - 1] = ((int[]) obj8).length;
                int i71 = i70 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i71;
                objArr15[i71] = null;
                return 0;
            case 61:
                int[] iArr41 = this.AudioAttributesImplApi21Parcelizer;
                int i72 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i72 + 1;
                iArr41[i72] = 57;
                return 0;
            case 62:
                int[] iArr42 = this.AudioAttributesImplApi21Parcelizer;
                int i73 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr42[i73] = 56;
                this.MediaBrowserCompatCustomActionResultReceiver = i73 + 2;
                iArr42[i73 + 1] = 0;
                return 0;
            case 63:
                int i74 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i75 = i74 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i75;
                int[] iArr43 = this.AudioAttributesImplApi21Parcelizer;
                iArr43[i74 - 2] = iArr43[i74 - 2] / iArr43[i75];
                return 0;
            case 64:
                int[] iArr44 = this.AudioAttributesImplApi21Parcelizer;
                int i76 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i76 + 1;
                iArr44[i76] = 5;
                return 0;
            case 65:
                int[] iArr45 = this.AudioAttributesImplApi21Parcelizer;
                int i77 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i77 + 1;
                iArr45[i77] = 69;
                return 0;
            case 66:
                int[] iArr46 = this.AudioAttributesImplApi21Parcelizer;
                int i78 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i78 + 1;
                iArr46[i78] = 40;
                return 0;
            case 67:
                int[] iArr47 = this.AudioAttributesImplApi21Parcelizer;
                int i79 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i79 + 1;
                iArr47[i79] = 78;
                return 0;
            case 68:
                int[] iArr48 = this.AudioAttributesImplApi21Parcelizer;
                int i80 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i80 + 1;
                iArr48[i80] = iArr48[7];
                return 0;
            case 69:
                int i81 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i82 = i81 - 1;
                this.MediaBrowserCompatSearchResultReceiver[i82] = null;
                int[] iArr49 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i81;
                iArr49[i82] = 1;
                return 0;
            case 70:
                int i83 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i84 = i83 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i84;
                int[] iArr50 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr50[i84] != iArr50[i83 - 1] ? 0 : 1;
                return 0;
            case 71:
                int[] iArr51 = this.AudioAttributesImplApi21Parcelizer;
                int i85 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr51[i85] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i85;
                iArr51[i85 - 1] = iArr51[i85 - 1] % iArr51[i85];
                int i86 = i85 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i86;
                this.MediaBrowserCompatSearchResultReceiver[i86] = null;
                return 0;
            case 72:
                int[] iArr52 = this.AudioAttributesImplApi21Parcelizer;
                int i87 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr52[i87] = 23;
                iArr52[i87 - 1] = iArr52[i87 - 1] + iArr52[i87];
                this.MediaBrowserCompatCustomActionResultReceiver = i87 + 1;
                iArr52[i87] = iArr52[i87 - 1];
                return 0;
            case 73:
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                int i88 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i88 + 1;
                objArr16[i88] = null;
                int[] iArr53 = this.AudioAttributesImplApi21Parcelizer;
                Object obj9 = objArr16[i88];
                objArr16[i88] = null;
                iArr53[i88] = ((int[]) obj9).length;
                return 0;
            case 74:
                int[] iArr54 = this.AudioAttributesImplApi21Parcelizer;
                int i89 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr54[i89] = 37;
                iArr54[i89 - 1] = iArr54[i89 - 1] + iArr54[i89];
                this.MediaBrowserCompatCustomActionResultReceiver = i89 + 1;
                iArr54[i89] = iArr54[i89 - 1];
                return 0;
            case 75:
                int[] iArr55 = this.AudioAttributesImplApi21Parcelizer;
                int i90 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i90 + 1;
                iArr55[i90] = 119;
                return 0;
            case 76:
                int i91 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i92 = i91 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i92;
                int[] iArr56 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr56[i92] == iArr56[i91 - 1] ? 0 : 1;
                return 0;
            case 77:
                int[] iArr57 = this.AudioAttributesImplApi21Parcelizer;
                int i93 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr57[i93] = 109;
                this.MediaBrowserCompatCustomActionResultReceiver = i93;
                iArr57[i93 - 1] = iArr57[i93 - 1] + iArr57[i93];
                return 0;
            case 78:
                int[] iArr58 = this.AudioAttributesImplApi21Parcelizer;
                int i94 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i94 + 1;
                iArr58[i94] = 47;
                return 0;
            case 79:
                int[] iArr59 = this.AudioAttributesImplApi21Parcelizer;
                int i95 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i95 + 1;
                iArr59[i95] = 63;
                return 0;
            case 80:
                int[] iArr60 = this.AudioAttributesImplApi21Parcelizer;
                int i96 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr60[i96] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i96;
                iArr60[i96 - 1] = iArr60[i96 - 1] / iArr60[i96];
                return 0;
            case 81:
                int[] iArr61 = this.AudioAttributesImplApi21Parcelizer;
                int i97 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i97 + 1;
                iArr61[i97] = 9;
                return 0;
            case 82:
                int[] iArr62 = this.AudioAttributesImplApi21Parcelizer;
                int i98 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i98 + 1;
                iArr62[i98] = 44;
                return 0;
            case 83:
                int[] iArr63 = this.AudioAttributesImplApi21Parcelizer;
                int i99 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i99 + 1;
                iArr63[i99] = 2;
                return 0;
            case 84:
                int[] iArr64 = this.AudioAttributesImplApi21Parcelizer;
                int i100 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i100 + 1;
                iArr64[i100] = 48;
                return 0;
            case 85:
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i101 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr17[i101] = objArr17[6];
                int[] iArr65 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i101 + 2;
                iArr65[i101 + 1] = iArr65[7];
                return 0;
            case 86:
                int i102 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i103 = i102 - 1;
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                objArr18[i103] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i102;
                objArr18[i103] = objArr18[6];
                return 0;
            case 87:
                int[] iArr66 = this.AudioAttributesImplApi21Parcelizer;
                int i104 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr66[i104] = 27;
                iArr66[i104 - 1] = iArr66[i104 - 1] + iArr66[i104];
                this.MediaBrowserCompatCustomActionResultReceiver = i104 + 1;
                iArr66[i104] = iArr66[i104 - 1];
                return 0;
            case 88:
                Object[] objArr19 = this.MediaBrowserCompatSearchResultReceiver;
                int i105 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i105 + 1;
                objArr19[i105] = null;
                int[] iArr67 = this.AudioAttributesImplApi21Parcelizer;
                Object obj10 = objArr19[i105];
                objArr19[i105] = null;
                iArr67[i105] = ((int[]) obj10).length;
                this.MediaBrowserCompatCustomActionResultReceiver = i105;
                objArr19[i105] = null;
                return 0;
            case 89:
                int i106 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i106;
                int[] iArr68 = this.AudioAttributesImplApi21Parcelizer;
                iArr68[7] = iArr68[i106];
                return 0;
            case 90:
                long[] jArr4 = this.MediaBrowserCompatItemReceiver;
                int i107 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i107 + 1;
                this.RemoteActionCompatParcelizer = jArr4[i107];
                return 0;
            case 91:
                Object[] objArr20 = this.MediaBrowserCompatSearchResultReceiver;
                int i108 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr20[i108 - 1] = new int[this.AudioAttributesImplApi21Parcelizer[i108 - 1]];
                this.MediaBrowserCompatCustomActionResultReceiver = i108 + 1;
                objArr20[i108] = objArr20[i108 - 1];
                return 0;
            case 92:
                int i109 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i110 = i109 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i110;
                Object[] objArr21 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr21[i110];
                objArr21[i110] = null;
                int[] iArr69 = this.AudioAttributesImplApi21Parcelizer;
                ((int[]) obj11)[iArr69[i109 - 2]] = iArr69[i109 - 1];
                objArr21[i110] = objArr21[6];
                this.MediaBrowserCompatCustomActionResultReceiver = i109 - 1;
                objArr21[i109 - 2] = objArr21[7];
                return 0;
            case 93:
                int[] iArr70 = this.AudioAttributesImplApi21Parcelizer;
                int i111 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr70[i111] = 21;
                iArr70[i111 - 1] = iArr70[i111 - 1] + iArr70[i111];
                this.MediaBrowserCompatCustomActionResultReceiver = i111 + 1;
                iArr70[i111] = iArr70[i111 - 1];
                return 0;
            case 94:
                int[] iArr71 = this.AudioAttributesImplApi21Parcelizer;
                int i112 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i112 + 1;
                iArr71[i112] = 99;
                return 0;
            case 95:
                int[] iArr72 = this.AudioAttributesImplApi21Parcelizer;
                int i113 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i113 + 1;
                iArr72[i113] = 22;
                return 0;
            case 96:
                int[] iArr73 = this.AudioAttributesImplApi21Parcelizer;
                int i114 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i114 + 1;
                iArr73[i114] = 61;
                return 0;
            case 97:
                int[] iArr74 = this.AudioAttributesImplApi21Parcelizer;
                int i115 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr74[i115] = 61;
                this.MediaBrowserCompatCustomActionResultReceiver = i115;
                iArr74[i115 - 1] = iArr74[i115 - 1] + iArr74[i115];
                return 0;
            case 98:
                int[] iArr75 = this.AudioAttributesImplApi21Parcelizer;
                int i116 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i116 + 1;
                iArr75[i116] = 113;
                return 0;
            case 99:
                int i117 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i118 = i117 - 1;
                int[] iArr76 = this.AudioAttributesImplApi21Parcelizer;
                iArr76[i117 - 2] = iArr76[i117 - 2] + iArr76[i118];
                this.MediaBrowserCompatCustomActionResultReceiver = i117;
                iArr76[i118] = iArr76[i117 - 2];
                return 0;
            case 100:
                int[] iArr77 = this.AudioAttributesImplApi21Parcelizer;
                int i119 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr77[i119] = 25;
                this.MediaBrowserCompatCustomActionResultReceiver = i119;
                iArr77[i119 - 1] = iArr77[i119 - 1] + iArr77[i119];
                return 0;
            case 101:
                int[] iArr78 = this.AudioAttributesImplApi21Parcelizer;
                int i120 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i120 + 1;
                iArr78[i120] = 37;
                return 0;
            case 102:
                int[] iArr79 = this.AudioAttributesImplApi21Parcelizer;
                int i121 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i121 + 1;
                iArr79[i121] = 15;
                return 0;
            case 103:
                int[] iArr80 = this.AudioAttributesImplApi21Parcelizer;
                int i122 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr80[i122] = 28;
                iArr80[i122 + 1] = 0;
                int i123 = i122 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i123;
                iArr80[i122] = iArr80[i122] / iArr80[i123];
                return 0;
            case 104:
                int[] iArr81 = this.AudioAttributesImplApi21Parcelizer;
                int i124 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i124 + 1;
                iArr81[i124] = 83;
                return 0;
            case 105:
                int[] iArr82 = this.AudioAttributesImplApi21Parcelizer;
                int i125 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr82[i125] = 39;
                this.MediaBrowserCompatCustomActionResultReceiver = i125;
                iArr82[i125 - 1] = iArr82[i125 - 1] + iArr82[i125];
                return 0;
            case 106:
                int[] iArr83 = this.AudioAttributesImplApi21Parcelizer;
                int i126 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr83[i126] = 95;
                iArr83[i126 - 1] = iArr83[i126 - 1] + iArr83[i126];
                this.MediaBrowserCompatCustomActionResultReceiver = i126 + 1;
                iArr83[i126] = iArr83[i126 - 1];
                return 0;
            case 107:
                int[] iArr84 = this.AudioAttributesImplApi21Parcelizer;
                int i127 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr84[i127] = 40;
                iArr84[i127 + 1] = 0;
                int i128 = i127 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i128;
                iArr84[i127] = iArr84[i127] / iArr84[i128];
                return 0;
            default:
                return i;
        }
    }

    public onFormatResult(Object obj, Object obj2) {
        this.AudioAttributesImplApi21Parcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.RatingCompat = new float[10];
        this.MediaBrowserCompatMediaItem = new double[10];
        Object[] objArr = new Object[10];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[6] = obj;
        objArr[7] = obj2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public onFormatResult() {
        this.AudioAttributesImplApi21Parcelizer = new int[10];
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.RatingCompat = new float[10];
        this.MediaBrowserCompatMediaItem = new double[10];
        this.MediaBrowserCompatSearchResultReceiver = new Object[10];
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public onFormatResult(Object obj, int i) {
        int[] iArr = new int[10];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatItemReceiver = new long[10];
        this.RatingCompat = new float[10];
        this.MediaBrowserCompatMediaItem = new double[10];
        Object[] objArr = new Object[10];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[6] = obj;
        iArr[7] = i;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }
}
