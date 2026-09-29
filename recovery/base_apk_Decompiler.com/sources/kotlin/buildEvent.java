package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class buildEvent {
    public int AudioAttributesCompatParcelizer;
    private final float[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final int[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private final long[] MediaBrowserCompatCustomActionResultReceiver;
    private final double[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    private int read;
    public Object write;

    public buildEvent(Object obj) {
        this.AudioAttributesImplBaseParcelizer = new int[8];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[8];
        this.AudioAttributesImplApi21Parcelizer = new float[8];
        this.MediaBrowserCompatItemReceiver = new double[8];
        Object[] objArr = new Object[8];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        this.read = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaMetadataCompat;
                int i2 = this.read;
                this.read = i2 + 1;
                objArr[i2] = objArr[4];
                return 0;
            case 2:
                int i3 = this.read - this.AudioAttributesCompatParcelizer;
                this.read = i3;
                this.AudioAttributesImplApi26Parcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i4 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.IconCompatParcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i5 = this.read;
                this.read = i5 + 1;
                objArr3[i5] = this.write;
                return 0;
            case 5:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i6 = this.read;
                iArr[i6] = 2;
                this.read = i6 + 2;
                iArr[i6 + 1] = 2;
                return 0;
            case 6:
                int i7 = this.read;
                int i8 = i7 - 1;
                this.read = i8;
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.read = i9;
                this.MediaMetadataCompat[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaMetadataCompat;
                int i10 = this.read;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.IconCompatParcelizer = obj2;
            case 7:
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.read;
                this.read = i11 + 1;
                iArr3[i11] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 10:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i12 = this.read;
                this.read = i12 + 1;
                iArr4[i12] = 69;
                return 0;
            case 11:
                int i13 = this.read;
                int i14 = i13 - 1;
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                iArr5[i13 - 2] = iArr5[i13 - 2] + iArr5[i14];
                iArr5[i14] = iArr5[i13 - 2];
                this.read = i13 + 1;
                iArr5[i13] = 128;
                return 0;
            case 12:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i15 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i15 + 1;
                this.RemoteActionCompatParcelizer = iArr6[i15];
                return 0;
            case 13:
                int i16 = this.read;
                int i17 = i16 - 1;
                this.read = i17;
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                iArr7[i16 - 2] = iArr7[i16 - 2] % iArr7[i17];
                return 0;
            case 14:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i18 = this.read;
                iArr8[i18] = 2;
                this.read = i18;
                iArr8[i18 - 1] = iArr8[i18 - 1] % iArr8[i18];
                return 0;
            case 15:
                int i19 = this.read - 1;
                this.read = i19;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer[i19] == 0 ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i20 = this.read;
                this.read = i20 + 1;
                objArr5[i20] = null;
                return 0;
            case 17:
                int i21 = this.read - 1;
                this.read = i21;
                this.MediaMetadataCompat[i21] = null;
                return 0;
            case 18:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i22 = this.read - 1;
                this.read = i22;
                this.RemoteActionCompatParcelizer = iArr9[i22];
                return 0;
            case 19:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i23 = this.read;
                this.read = i23 + 1;
                iArr10[i23] = 1;
                return 0;
            case 20:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i24 = this.read;
                this.read = i24 + 1;
                iArr11[i24] = 0;
                return 0;
            case 21:
                for (int i25 = this.read - 1; i25 >= 0; i25--) {
                    this.MediaMetadataCompat[i25] = null;
                }
                Object[] objArr6 = this.MediaMetadataCompat;
                this.read = 1;
                objArr6[0] = this.write;
                return 0;
            case 22:
                int i26 = this.read - 1;
                this.read = i26;
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                iArr12[5] = iArr12[i26];
                return 0;
            case 23:
                int i27 = this.read - 1;
                this.read = i27;
                Object[] objArr7 = this.MediaMetadataCompat;
                Object obj3 = objArr7[i27];
                objArr7[i27] = null;
                objArr7[6] = obj3;
                return 0;
            case 24:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.read;
                this.read = i28 + 1;
                iArr13[i28] = iArr13[5];
                return 0;
            case 25:
                int i29 = this.read - 1;
                this.read = i29;
                Object[] objArr8 = this.MediaMetadataCompat;
                Object obj4 = objArr8[i29];
                objArr8[i29] = null;
                objArr8[5] = obj4;
                return 0;
            case 26:
                int i30 = this.read;
                int i31 = i30 - 1;
                Object[] objArr9 = this.MediaMetadataCompat;
                Object obj5 = objArr9[i31];
                objArr9[i31] = null;
                objArr9[4] = obj5;
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                this.read = i30;
                iArr14[i31] = 2;
                return 0;
            case 27:
                Object[] objArr10 = this.MediaMetadataCompat;
                int i32 = this.read;
                this.read = i32 + 1;
                objArr10[i32] = objArr10[i32 - 1];
                return 0;
            case 28:
                int i33 = this.read;
                int i34 = i33 - 1;
                Object[] objArr11 = this.MediaMetadataCompat;
                Object obj6 = objArr11[i34];
                objArr11[i34] = null;
                objArr11[7] = obj6;
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                this.read = i33;
                iArr15[i34] = 0;
                return 0;
            case 29:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i35 = this.read;
                objArr12[i35] = objArr12[5];
                int i36 = i35 - 2;
                this.read = i36;
                Object obj7 = objArr12[i36];
                objArr12[i36] = null;
                int i37 = this.AudioAttributesImplBaseParcelizer[i35 - 1];
                Object obj8 = objArr12[i35];
                objArr12[i35] = null;
                ((Object[]) obj7)[i37] = obj8;
                return 0;
            case 30:
                Object[] objArr13 = this.MediaMetadataCompat;
                int i38 = this.read;
                this.read = i38 + 1;
                objArr13[i38] = objArr13[7];
                return 0;
            case 31:
                int i39 = this.read;
                int i40 = i39 - 3;
                this.read = i40;
                Object[] objArr14 = this.MediaMetadataCompat;
                Object obj9 = objArr14[i40];
                objArr14[i40] = null;
                int i41 = this.AudioAttributesImplBaseParcelizer[i39 - 2];
                Object obj10 = objArr14[i39 - 1];
                objArr14[i39 - 1] = null;
                ((Object[]) obj9)[i41] = obj10;
                return 0;
            case 32:
                Object[] objArr15 = this.MediaMetadataCompat;
                int i42 = this.read;
                this.read = i42 + 1;
                objArr15[i42] = objArr15[6];
                return 0;
            case 33:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i43 = this.read;
                iArr16[i43] = 2;
                iArr16[i43 + 1] = 2;
                int i44 = i43 + 1;
                this.read = i44;
                iArr16[i43] = iArr16[i43] % iArr16[i44];
                return 0;
            case 34:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i45 = this.read;
                iArr17[i45] = 35;
                this.read = i45;
                iArr17[i45 - 1] = iArr17[i45 - 1] + iArr17[i45];
                return 0;
            case 35:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i46 = this.read;
                iArr18[i46] = iArr18[i46 - 1];
                iArr18[i46 + 1] = 128;
                int i47 = i46 + 1;
                this.read = i47;
                iArr18[i46] = iArr18[i46] % iArr18[i47];
                return 0;
            case 36:
                int i48 = this.read - 1;
                this.read = i48;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer[i48] != 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.read;
                this.read = i49 + 1;
                iArr19[i49] = 89;
                return 0;
            case 38:
                int i50 = this.read;
                int i51 = i50 - 1;
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                iArr20[i50 - 2] = iArr20[i50 - 2] + iArr20[i51];
                this.read = i50;
                iArr20[i51] = iArr20[i50 - 2];
                return 0;
            case 39:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i52 = this.read;
                this.read = i52 + 1;
                iArr21[i52] = 128;
                return 0;
            case 40:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i53 = this.read;
                iArr22[i53] = 79;
                this.read = i53;
                iArr22[i53 - 1] = iArr22[i53 - 1] + iArr22[i53];
                return 0;
            case 41:
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                int i54 = this.read;
                this.read = i54 + 1;
                iArr23[i54] = iArr23[i54 - 1];
                return 0;
            case 42:
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                int i55 = this.read;
                iArr24[i55] = 128;
                this.read = i55;
                iArr24[i55 - 1] = iArr24[i55 - 1] % iArr24[i55];
                return 0;
            case 43:
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                int i56 = this.read;
                Object[] objArr16 = this.MediaMetadataCompat;
                Object obj11 = objArr16[i56 - 1];
                objArr16[i56 - 1] = null;
                iArr25[i56 - 1] = ((int[]) obj11).length;
                return 0;
            case 44:
                Object[] objArr17 = this.MediaMetadataCompat;
                int i57 = this.read;
                this.read = i57 + 1;
                objArr17[i57] = objArr17[5];
                return 0;
            case 45:
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                int i58 = this.read;
                this.read = i58 + 1;
                iArr26[i58] = 2;
                return 0;
            case 46:
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                int i59 = this.read;
                iArr27[i59] = 15;
                this.read = i59;
                iArr27[i59 - 1] = iArr27[i59 - 1] + iArr27[i59];
                return 0;
            case 47:
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                int i60 = this.read;
                iArr28[i60] = 36;
                iArr28[i60 + 1] = 0;
                int i61 = i60 + 1;
                this.read = i61;
                iArr28[i60] = iArr28[i60] / iArr28[i61];
                return 0;
            case 48:
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                int i62 = this.read;
                this.read = i62 + 1;
                iArr29[i62] = 8;
                return 0;
            case 49:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i63 = this.read;
                this.read = i63 + 1;
                iArr30[i63] = 26;
                return 0;
            case 50:
                int i64 = this.read - 1;
                this.read = i64;
                Object[] objArr18 = this.MediaMetadataCompat;
                Object obj12 = objArr18[i64];
                objArr18[i64] = null;
                this.RemoteActionCompatParcelizer = obj12 != null ? 0 : 1;
                return 0;
            case 51:
                int i65 = this.read;
                int i66 = i65 - 1;
                Object[] objArr19 = this.MediaMetadataCompat;
                Object obj13 = objArr19[i66];
                objArr19[i66] = null;
                objArr19[4] = obj13;
                this.read = i65;
                objArr19[i66] = objArr19[5];
                return 0;
            case 52:
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                int i67 = this.read;
                iArr31[i67] = 67;
                iArr31[i67 - 1] = iArr31[i67 - 1] + iArr31[i67];
                this.read = i67 + 1;
                iArr31[i67] = iArr31[i67 - 1];
                return 0;
            case 53:
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                int i68 = this.read;
                iArr32[i68] = 35;
                iArr32[i68 - 1] = iArr32[i68 - 1] + iArr32[i68];
                this.read = i68 + 1;
                iArr32[i68] = iArr32[i68 - 1];
                return 0;
            case 54:
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                int i69 = this.read;
                this.read = i69 + 1;
                iArr33[i69] = 38;
                return 0;
            case 55:
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                int i70 = this.read;
                this.read = i70 + 1;
                iArr34[i70] = 82;
                return 0;
            case 56:
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                int i71 = this.read;
                this.read = i71 + 1;
                iArr35[i71] = 75;
                return 0;
            case 57:
                int i72 = this.read;
                int i73 = i72 - 1;
                this.read = i73;
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                iArr36[i72 - 2] = iArr36[i72 - 2] + iArr36[i73];
                return 0;
            case 58:
                int i74 = this.read;
                int i75 = i74 - 1;
                Object[] objArr20 = this.MediaMetadataCompat;
                Object obj14 = objArr20[i75];
                objArr20[i75] = null;
                objArr20[6] = obj14;
                this.read = i74;
                objArr20[i75] = objArr20[4];
                return 0;
            case 59:
                int i76 = this.read - 1;
                this.read = i76;
                Object[] objArr21 = this.MediaMetadataCompat;
                Object obj15 = objArr21[i76];
                objArr21[i76] = null;
                objArr21[4] = obj15;
                return 0;
            case 60:
                Object[] objArr22 = this.MediaMetadataCompat;
                int i77 = this.read;
                objArr22[i77] = objArr22[5];
                this.read = i77 + 2;
                objArr22[i77 + 1] = objArr22[6];
                return 0;
            case 61:
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                int i78 = this.read;
                iArr37[i78] = 2;
                this.read = i78;
                iArr37[i78 - 1] = iArr37[i78 - 1] % iArr37[i78];
                int i79 = i78 - 1;
                this.read = i79;
                this.MediaMetadataCompat[i79] = null;
                return 0;
            case 62:
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                int i80 = this.read;
                iArr38[i80] = 51;
                iArr38[i80 - 1] = iArr38[i80 - 1] + iArr38[i80];
                this.read = i80 + 1;
                iArr38[i80] = iArr38[i80 - 1];
                return 0;
            case 63:
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                int i81 = this.read;
                iArr39[i81] = 109;
                iArr39[i81 - 1] = iArr39[i81 - 1] + iArr39[i81];
                this.read = i81 + 1;
                iArr39[i81] = iArr39[i81 - 1];
                return 0;
            case 64:
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                int i82 = this.read;
                this.read = i82 + 1;
                iArr40[i82] = 78;
                return 0;
            case 65:
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                int i83 = this.read;
                this.read = i83 + 1;
                iArr41[i83] = 37;
                return 0;
            default:
                return i;
        }
    }

    public buildEvent(Object obj, Object obj2, Object obj3) {
        this.AudioAttributesImplBaseParcelizer = new int[8];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[8];
        this.AudioAttributesImplApi21Parcelizer = new float[8];
        this.MediaBrowserCompatItemReceiver = new double[8];
        Object[] objArr = new Object[8];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
        this.read = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public buildEvent(Object obj, Object obj2) {
        this.AudioAttributesImplBaseParcelizer = new int[8];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[8];
        this.AudioAttributesImplApi21Parcelizer = new float[8];
        this.MediaBrowserCompatItemReceiver = new double[8];
        Object[] objArr = new Object[8];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        this.read = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }
}
