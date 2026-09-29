package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class getCardTitle {
    public int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final float[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private final long[] MediaBrowserCompatCustomActionResultReceiver;
    private final double[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    private int RemoteActionCompatParcelizer;
    public int read;
    public Object write;

    public getCardTitle(Object obj, Object obj2) {
        this.AudioAttributesImplApi21Parcelizer = new int[7];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[7];
        this.AudioAttributesImplBaseParcelizer = new float[7];
        this.MediaBrowserCompatItemReceiver = new double[7];
        Object[] objArr = new Object[7];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                int i2 = this.RemoteActionCompatParcelizer - this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = i2;
                this.AudioAttributesImplApi26Parcelizer = i2;
                return 0;
            case 2:
                Object[] objArr = this.MediaMetadataCompat;
                int i3 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.write = obj;
                return 0;
            case 3:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i4 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i4 + 1;
                iArr[i4] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 4:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i5 = this.RemoteActionCompatParcelizer;
                objArr2[i5] = objArr2[4];
                this.RemoteActionCompatParcelizer = i5 + 2;
                objArr2[i5 + 1] = objArr2[5];
                return 0;
            case 5:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i6 = this.RemoteActionCompatParcelizer;
                iArr2[i6] = 2;
                iArr2[i6 + 1] = 2;
                int i7 = i6 + 1;
                this.RemoteActionCompatParcelizer = i7;
                iArr2[i6] = iArr2[i6] % iArr2[i7];
                return 0;
            case 6:
                int i8 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i8;
                this.MediaMetadataCompat[i8] = null;
                return 0;
            case 7:
                this.read = this.AudioAttributesImplApi21Parcelizer[this.RemoteActionCompatParcelizer - 1];
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i9 = this.RemoteActionCompatParcelizer;
                iArr3[i9] = 123;
                iArr3[i9 - 1] = iArr3[i9 - 1] + iArr3[i9];
                this.RemoteActionCompatParcelizer = i9 + 1;
                iArr3[i9] = iArr3[i9 - 1];
            case 8:
                return 0;
            case 10:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i10 + 1;
                iArr4[i10] = 128;
                return 0;
            case 11:
                int i11 = this.RemoteActionCompatParcelizer;
                int i12 = i11 - 1;
                this.RemoteActionCompatParcelizer = i12;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i11 - 2] = iArr5[i11 - 2] % iArr5[i12];
                return 0;
            case 12:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i13 + 1;
                this.read = iArr6[i13];
                return 0;
            case 13:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i14 + 1;
                iArr7[i14] = 2;
                return 0;
            case 14:
                int i15 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i15;
                this.read = this.AudioAttributesImplApi21Parcelizer[i15] == 0 ? 0 : 1;
                return 0;
            case 15:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i16 = this.RemoteActionCompatParcelizer;
                iArr8[i16] = 89;
                iArr8[i16 - 1] = iArr8[i16 - 1] + iArr8[i16];
                this.RemoteActionCompatParcelizer = i16 + 1;
                iArr8[i16] = iArr8[i16 - 1];
                return 0;
            case 16:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i17 = this.RemoteActionCompatParcelizer;
                iArr9[i17] = 128;
                this.RemoteActionCompatParcelizer = i17;
                iArr9[i17 - 1] = iArr9[i17 - 1] % iArr9[i17];
                return 0;
            case 17:
                int i18 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i18;
                this.read = this.AudioAttributesImplApi21Parcelizer[i18] != 0 ? 0 : 1;
                return 0;
            case 18:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i19 = this.RemoteActionCompatParcelizer;
                Object obj2 = objArr3[i19 - 1];
                objArr3[i19 - 1] = null;
                this.write = obj2;
                return 0;
            case 19:
                for (int i20 = this.RemoteActionCompatParcelizer - 1; i20 >= 0; i20--) {
                    this.MediaMetadataCompat[i20] = null;
                }
                Object[] objArr4 = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = 1;
                objArr4[0] = this.IconCompatParcelizer;
                return 0;
            case 20:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.RemoteActionCompatParcelizer;
                iArr10[i21] = 2;
                this.RemoteActionCompatParcelizer = i21 + 2;
                iArr10[i21 + 1] = 2;
                return 0;
            case 21:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.RemoteActionCompatParcelizer;
                iArr11[i22] = 33;
                iArr11[i22 - 1] = iArr11[i22 - 1] + iArr11[i22];
                this.RemoteActionCompatParcelizer = i22 + 1;
                iArr11[i22] = iArr11[i22 - 1];
                return 0;
            case 22:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = this.RemoteActionCompatParcelizer;
                iArr12[i23] = 2;
                this.RemoteActionCompatParcelizer = i23;
                iArr12[i23 - 1] = iArr12[i23 - 1] % iArr12[i23];
                return 0;
            case 23:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.RemoteActionCompatParcelizer;
                iArr13[i24] = 75;
                this.RemoteActionCompatParcelizer = i24;
                iArr13[i24 - 1] = iArr13[i24 - 1] + iArr13[i24];
                return 0;
            case 24:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i25 + 1;
                iArr14[i25] = iArr14[i25 - 1];
                return 0;
            case 25:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i26 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i26 + 1;
                objArr5[i26] = objArr5[4];
                return 0;
            case 26:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i27 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i27 + 1;
                objArr6[i27] = objArr6[5];
                return 0;
            case 27:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i28 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i28 + 1;
                objArr7[i28] = null;
                return 0;
            case 28:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i29;
                this.read = iArr15[i29];
                return 0;
            case 29:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i30 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i30 + 1;
                iArr16[i30] = 0;
                return 0;
            case 30:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i31 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i31 + 1;
                iArr17[i31] = 1;
                return 0;
            case 31:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i32 = this.RemoteActionCompatParcelizer;
                iArr18[i32] = 107;
                this.RemoteActionCompatParcelizer = i32;
                iArr18[i32 - 1] = iArr18[i32 - 1] + iArr18[i32];
                return 0;
            case 32:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = this.RemoteActionCompatParcelizer;
                iArr19[i33] = iArr19[i33 - 1];
                this.RemoteActionCompatParcelizer = i33 + 2;
                iArr19[i33 + 1] = 128;
                return 0;
            case 33:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i34 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i34 + 1;
                objArr8[i34] = null;
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr8[i34];
                objArr8[i34] = null;
                iArr20[i34] = ((int[]) obj3).length;
                this.RemoteActionCompatParcelizer = i34;
                objArr8[i34] = null;
                return 0;
            case 34:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i35 + 1;
                iArr21[i35] = 43;
                return 0;
            case 35:
                int i36 = this.RemoteActionCompatParcelizer;
                int i37 = i36 - 1;
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                iArr22[i36 - 2] = iArr22[i36 - 2] + iArr22[i37];
                this.RemoteActionCompatParcelizer = i36;
                iArr22[i37] = iArr22[i36 - 2];
                return 0;
            case 36:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = this.RemoteActionCompatParcelizer;
                iArr23[i38] = 2;
                this.RemoteActionCompatParcelizer = i38;
                iArr23[i38 - 1] = iArr23[i38 - 1] % iArr23[i38];
                int i39 = i38 - 1;
                this.RemoteActionCompatParcelizer = i39;
                this.MediaMetadataCompat[i39] = null;
                return 0;
            case 37:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.RemoteActionCompatParcelizer;
                iArr24[i40] = 21;
                iArr24[i40 - 1] = iArr24[i40 - 1] + iArr24[i40];
                this.RemoteActionCompatParcelizer = i40 + 1;
                iArr24[i40] = iArr24[i40 - 1];
                return 0;
            case 38:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.RemoteActionCompatParcelizer;
                iArr25[i41] = 41;
                iArr25[i41 + 1] = 0;
                int i42 = i41 + 1;
                this.RemoteActionCompatParcelizer = i42;
                iArr25[i41] = iArr25[i41] / iArr25[i42];
                return 0;
            case 39:
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i43 + 1;
                iArr26[i43] = 99;
                return 0;
            case 40:
                int i44 = this.RemoteActionCompatParcelizer;
                int i45 = i44 - 1;
                this.RemoteActionCompatParcelizer = i45;
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                iArr27[i44 - 2] = iArr27[i44 - 2] + iArr27[i45];
                return 0;
            case 41:
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.RemoteActionCompatParcelizer;
                iArr28[i46] = iArr28[i46 - 1];
                iArr28[i46 + 1] = 128;
                int i47 = i46 + 1;
                this.RemoteActionCompatParcelizer = i47;
                iArr28[i46] = iArr28[i46] % iArr28[i47];
                return 0;
            case 42:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i48 + 1;
                iArr29[i48] = 75;
                return 0;
            case 43:
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.RemoteActionCompatParcelizer;
                iArr30[i49] = 91;
                iArr30[i49 - 1] = iArr30[i49 - 1] + iArr30[i49];
                this.RemoteActionCompatParcelizer = i49 + 1;
                iArr30[i49] = iArr30[i49 - 1];
                return 0;
            case 44:
                int[] iArr31 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i50 + 1;
                iArr31[i50] = 31;
                return 0;
            case 45:
                int[] iArr32 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = this.RemoteActionCompatParcelizer;
                iArr32[i51] = 39;
                this.RemoteActionCompatParcelizer = i51 + 2;
                iArr32[i51 + 1] = 0;
                return 0;
            case 46:
                int i52 = this.RemoteActionCompatParcelizer;
                int i53 = i52 - 1;
                this.RemoteActionCompatParcelizer = i53;
                int[] iArr33 = this.AudioAttributesImplApi21Parcelizer;
                iArr33[i52 - 2] = iArr33[i52 - 2] / iArr33[i53];
                int i54 = i52 - 2;
                this.RemoteActionCompatParcelizer = i54;
                this.MediaMetadataCompat[i54] = null;
                return 0;
            case 47:
                int[] iArr34 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i55 + 1;
                iArr34[i55] = 15;
                return 0;
            case 48:
                int[] iArr35 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i56 + 1;
                iArr35[i56] = 25;
                return 0;
            case 49:
                int[] iArr36 = this.AudioAttributesImplApi21Parcelizer;
                int i57 = this.RemoteActionCompatParcelizer;
                iArr36[i57] = 0;
                this.RemoteActionCompatParcelizer = i57;
                iArr36[i57 - 1] = iArr36[i57 - 1] / iArr36[i57];
                int i58 = i57 - 1;
                this.RemoteActionCompatParcelizer = i58;
                this.MediaMetadataCompat[i58] = null;
                return 0;
            case 50:
                int[] iArr37 = this.AudioAttributesImplApi21Parcelizer;
                int i59 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i59 + 1;
                iArr37[i59] = 19;
                return 0;
            case 51:
                int[] iArr38 = this.AudioAttributesImplApi21Parcelizer;
                int i60 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i60 + 1;
                iArr38[i60] = 36;
                return 0;
            case 52:
                int[] iArr39 = this.AudioAttributesImplApi21Parcelizer;
                int i61 = this.RemoteActionCompatParcelizer;
                iArr39[i61] = 121;
                iArr39[i61 - 1] = iArr39[i61 - 1] + iArr39[i61];
                this.RemoteActionCompatParcelizer = i61 + 1;
                iArr39[i61] = iArr39[i61 - 1];
                return 0;
            case 53:
                int[] iArr40 = this.AudioAttributesImplApi21Parcelizer;
                int i62 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i62 + 1;
                iArr40[i62] = 39;
                return 0;
            case 54:
                int[] iArr41 = this.AudioAttributesImplApi21Parcelizer;
                int i63 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i63 + 1;
                iArr41[i63] = 4;
                return 0;
            case 55:
                Object[] objArr9 = this.MediaMetadataCompat;
                int i64 = this.RemoteActionCompatParcelizer;
                objArr9[i64] = objArr9[4];
                objArr9[i64 + 1] = objArr9[5];
                this.RemoteActionCompatParcelizer = i64 + 3;
                objArr9[i64 + 2] = objArr9[4];
                return 0;
            case 56:
                Object[] objArr10 = this.MediaMetadataCompat;
                int i65 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i65 + 1;
                objArr10[i65] = this.IconCompatParcelizer;
                return 0;
            case 57:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i66 = this.RemoteActionCompatParcelizer;
                objArr11[i66] = objArr11[5];
                this.RemoteActionCompatParcelizer = i66 + 2;
                objArr11[i66 + 1] = objArr11[4];
                return 0;
            case 58:
                int[] iArr42 = this.AudioAttributesImplApi21Parcelizer;
                int i67 = this.RemoteActionCompatParcelizer;
                Object[] objArr12 = this.MediaMetadataCompat;
                Object obj4 = objArr12[i67 - 1];
                objArr12[i67 - 1] = null;
                iArr42[i67 - 1] = ((int[]) obj4).length;
                return 0;
            case 59:
                int[] iArr43 = this.AudioAttributesImplApi21Parcelizer;
                int i68 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i68 + 1;
                iArr43[i68] = 37;
                return 0;
            case 60:
                int[] iArr44 = this.AudioAttributesImplApi21Parcelizer;
                int i69 = this.RemoteActionCompatParcelizer;
                iArr44[i69] = 103;
                iArr44[i69 - 1] = iArr44[i69 - 1] + iArr44[i69];
                this.RemoteActionCompatParcelizer = i69 + 1;
                iArr44[i69] = iArr44[i69 - 1];
                return 0;
            case 61:
                int[] iArr45 = this.AudioAttributesImplApi21Parcelizer;
                int i70 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i70 + 1;
                iArr45[i70] = 65;
                return 0;
            case 62:
                int[] iArr46 = this.AudioAttributesImplApi21Parcelizer;
                int i71 = this.RemoteActionCompatParcelizer;
                iArr46[i71] = 41;
                this.RemoteActionCompatParcelizer = i71;
                iArr46[i71 - 1] = iArr46[i71 - 1] + iArr46[i71];
                return 0;
            case 63:
                int[] iArr47 = this.AudioAttributesImplApi21Parcelizer;
                int i72 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i72 + 1;
                iArr47[i72] = 95;
                return 0;
            case 64:
                int[] iArr48 = this.AudioAttributesImplApi21Parcelizer;
                int i73 = this.RemoteActionCompatParcelizer;
                iArr48[i73] = 84;
                this.RemoteActionCompatParcelizer = i73 + 2;
                iArr48[i73 + 1] = 0;
                return 0;
            case 65:
                int[] iArr49 = this.AudioAttributesImplApi21Parcelizer;
                int i74 = this.RemoteActionCompatParcelizer;
                iArr49[i74] = 69;
                iArr49[i74 - 1] = iArr49[i74 - 1] + iArr49[i74];
                this.RemoteActionCompatParcelizer = i74 + 1;
                iArr49[i74] = iArr49[i74 - 1];
                return 0;
            case 66:
                int[] iArr50 = this.AudioAttributesImplApi21Parcelizer;
                int i75 = this.RemoteActionCompatParcelizer;
                iArr50[i75] = 85;
                this.RemoteActionCompatParcelizer = i75;
                iArr50[i75 - 1] = iArr50[i75 - 1] + iArr50[i75];
                return 0;
            case 67:
                int[] iArr51 = this.AudioAttributesImplApi21Parcelizer;
                int i76 = this.RemoteActionCompatParcelizer;
                iArr51[i76] = 77;
                this.RemoteActionCompatParcelizer = i76;
                iArr51[i76 - 1] = iArr51[i76 - 1] + iArr51[i76];
                return 0;
            case 68:
                int[] iArr52 = this.AudioAttributesImplApi21Parcelizer;
                int i77 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i77 + 1;
                iArr52[i77] = 41;
                return 0;
            case 69:
                int i78 = this.RemoteActionCompatParcelizer;
                int i79 = i78 - 1;
                this.RemoteActionCompatParcelizer = i79;
                int[] iArr53 = this.AudioAttributesImplApi21Parcelizer;
                iArr53[i78 - 2] = iArr53[i78 - 2] % iArr53[i79];
                int i80 = i78 - 2;
                this.RemoteActionCompatParcelizer = i80;
                this.MediaMetadataCompat[i80] = null;
                return 0;
            case 70:
                int[] iArr54 = this.AudioAttributesImplApi21Parcelizer;
                int i81 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i81 + 1;
                iArr54[i81] = 11;
                return 0;
            case 71:
                int i82 = this.RemoteActionCompatParcelizer;
                int i83 = i82 - 1;
                int[] iArr55 = this.AudioAttributesImplApi21Parcelizer;
                iArr55[i82 - 2] = iArr55[i82 - 2] + iArr55[i83];
                iArr55[i83] = iArr55[i82 - 2];
                this.RemoteActionCompatParcelizer = i82 + 1;
                iArr55[i82] = 128;
                return 0;
            case 72:
                int[] iArr56 = this.AudioAttributesImplApi21Parcelizer;
                int i84 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i84 + 1;
                iArr56[i84] = 81;
                return 0;
            case 73:
                int[] iArr57 = this.AudioAttributesImplApi21Parcelizer;
                int i85 = this.RemoteActionCompatParcelizer;
                iArr57[i85] = 0;
                this.RemoteActionCompatParcelizer = i85;
                iArr57[i85 - 1] = iArr57[i85 - 1] / iArr57[i85];
                return 0;
            case 74:
                int[] iArr58 = this.AudioAttributesImplApi21Parcelizer;
                int i86 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i86 + 1;
                iArr58[i86] = 53;
                return 0;
            case 75:
                int[] iArr59 = this.AudioAttributesImplApi21Parcelizer;
                int i87 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i87 + 1;
                iArr59[i87] = 5;
                return 0;
            case 76:
                int[] iArr60 = this.AudioAttributesImplApi21Parcelizer;
                int i88 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i88 + 1;
                iArr60[i88] = 59;
                return 0;
            case 77:
                int[] iArr61 = this.AudioAttributesImplApi21Parcelizer;
                int i89 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i89 + 1;
                iArr61[i89] = 79;
                return 0;
            case 78:
                int[] iArr62 = this.AudioAttributesImplApi21Parcelizer;
                int i90 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i90 + 1;
                iArr62[i90] = 97;
                return 0;
            case 79:
                int[] iArr63 = this.AudioAttributesImplApi21Parcelizer;
                int i91 = this.RemoteActionCompatParcelizer;
                iArr63[i91] = 83;
                this.RemoteActionCompatParcelizer = i91;
                iArr63[i91 - 1] = iArr63[i91 - 1] + iArr63[i91];
                return 0;
            case 80:
                int[] iArr64 = this.AudioAttributesImplApi21Parcelizer;
                int i92 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i92 + 1;
                iArr64[i92] = 67;
                return 0;
            case 81:
                int[] iArr65 = this.AudioAttributesImplApi21Parcelizer;
                int i93 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i93 + 1;
                iArr65[i93] = 0;
                return 0;
            case 82:
                int i94 = this.RemoteActionCompatParcelizer;
                int i95 = i94 - 1;
                this.RemoteActionCompatParcelizer = i95;
                int[] iArr66 = this.AudioAttributesImplApi21Parcelizer;
                iArr66[i94 - 2] = iArr66[i94 - 2] / iArr66[i95];
                return 0;
            case 83:
                int[] iArr67 = this.AudioAttributesImplApi21Parcelizer;
                int i96 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i96 + 1;
                iArr67[i96] = 93;
                return 0;
            case 84:
                int[] iArr68 = this.AudioAttributesImplApi21Parcelizer;
                int i97 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i97 + 1;
                iArr68[i97] = 13;
                return 0;
            case 85:
                int[] iArr69 = this.AudioAttributesImplApi21Parcelizer;
                int i98 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i98 + 1;
                iArr69[i98] = iArr69[6];
                return 0;
            case 86:
                int[] iArr70 = this.AudioAttributesImplApi21Parcelizer;
                int i99 = this.RemoteActionCompatParcelizer;
                Object[] objArr13 = this.MediaMetadataCompat;
                Object obj5 = objArr13[i99 - 1];
                objArr13[i99 - 1] = null;
                iArr70[i99 - 1] = ((int[]) obj5).length;
                int i100 = i99 - 1;
                this.RemoteActionCompatParcelizer = i100;
                objArr13[i100] = null;
                return 0;
            case 87:
                int[] iArr71 = this.AudioAttributesImplApi21Parcelizer;
                int i101 = this.RemoteActionCompatParcelizer;
                iArr71[i101] = 47;
                this.RemoteActionCompatParcelizer = i101;
                iArr71[i101 - 1] = iArr71[i101 - 1] + iArr71[i101];
                return 0;
            case 88:
                Object[] objArr14 = this.MediaMetadataCompat;
                int i102 = this.RemoteActionCompatParcelizer;
                objArr14[i102] = objArr14[5];
                int[] iArr72 = this.AudioAttributesImplApi21Parcelizer;
                this.RemoteActionCompatParcelizer = i102 + 2;
                iArr72[i102 + 1] = iArr72[6];
                return 0;
            case 89:
                int[] iArr73 = this.AudioAttributesImplApi21Parcelizer;
                int i103 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i103 + 1;
                iArr73[i103] = 68;
                return 0;
            case 90:
                int[] iArr74 = this.AudioAttributesImplApi21Parcelizer;
                int i104 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i104 + 1;
                iArr74[i104] = 58;
                return 0;
            case 91:
                int[] iArr75 = this.AudioAttributesImplApi21Parcelizer;
                int i105 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i105 + 1;
                iArr75[i105] = 47;
                return 0;
            case 92:
                int[] iArr76 = this.AudioAttributesImplApi21Parcelizer;
                int i106 = this.RemoteActionCompatParcelizer;
                iArr76[i106] = 103;
                this.RemoteActionCompatParcelizer = i106;
                iArr76[i106 - 1] = iArr76[i106 - 1] + iArr76[i106];
                return 0;
            case 93:
                int[] iArr77 = this.AudioAttributesImplApi21Parcelizer;
                int i107 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i107 + 1;
                iArr77[i107] = 66;
                return 0;
            case 94:
                int[] iArr78 = this.AudioAttributesImplApi21Parcelizer;
                int i108 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i108 + 1;
                iArr78[i108] = 56;
                return 0;
            case 95:
                int[] iArr79 = this.AudioAttributesImplApi21Parcelizer;
                int i109 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i109 + 1;
                iArr79[i109] = 42;
                return 0;
            case 96:
                int[] iArr80 = this.AudioAttributesImplApi21Parcelizer;
                int i110 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i110 + 1;
                iArr80[i110] = 35;
                return 0;
            case 97:
                int[] iArr81 = this.AudioAttributesImplApi21Parcelizer;
                int i111 = this.RemoteActionCompatParcelizer;
                iArr81[i111] = 33;
                this.RemoteActionCompatParcelizer = i111 + 2;
                iArr81[i111 + 1] = 0;
                return 0;
            case 98:
                int[] iArr82 = this.AudioAttributesImplApi21Parcelizer;
                int i112 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i112 + 1;
                iArr82[i112] = 88;
                return 0;
            case 99:
                int[] iArr83 = this.AudioAttributesImplApi21Parcelizer;
                int i113 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i113 + 1;
                iArr83[i113] = 121;
                return 0;
            case 100:
                int[] iArr84 = this.AudioAttributesImplApi21Parcelizer;
                int i114 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i114 + 1;
                iArr84[i114] = 83;
                return 0;
            case 101:
                int[] iArr85 = this.AudioAttributesImplApi21Parcelizer;
                int i115 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i115 + 1;
                iArr85[i115] = 119;
                return 0;
            case 102:
                int[] iArr86 = this.AudioAttributesImplApi21Parcelizer;
                int i116 = this.RemoteActionCompatParcelizer;
                iArr86[i116] = 105;
                iArr86[i116 - 1] = iArr86[i116 - 1] + iArr86[i116];
                this.RemoteActionCompatParcelizer = i116 + 1;
                iArr86[i116] = iArr86[i116 - 1];
                return 0;
            case 103:
                int[] iArr87 = this.AudioAttributesImplApi21Parcelizer;
                int i117 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i117 + 1;
                iArr87[i117] = 96;
                return 0;
            case 104:
                int[] iArr88 = this.AudioAttributesImplApi21Parcelizer;
                int i118 = this.RemoteActionCompatParcelizer;
                iArr88[i118] = 109;
                this.RemoteActionCompatParcelizer = i118;
                iArr88[i118 - 1] = iArr88[i118 - 1] + iArr88[i118];
                return 0;
            case 105:
                int[] iArr89 = this.AudioAttributesImplApi21Parcelizer;
                int i119 = this.RemoteActionCompatParcelizer;
                iArr89[i119] = 31;
                iArr89[i119 - 1] = iArr89[i119 - 1] + iArr89[i119];
                this.RemoteActionCompatParcelizer = i119 + 1;
                iArr89[i119] = iArr89[i119 - 1];
                return 0;
            case 106:
                Object[] objArr15 = this.MediaMetadataCompat;
                int i120 = this.RemoteActionCompatParcelizer;
                objArr15[i120] = objArr15[4];
                objArr15[i120 + 1] = objArr15[5];
                this.RemoteActionCompatParcelizer = i120 + 3;
                objArr15[i120 + 2] = objArr15[6];
                return 0;
            case 107:
                int[] iArr90 = this.AudioAttributesImplApi21Parcelizer;
                int i121 = this.RemoteActionCompatParcelizer;
                iArr90[i121] = 113;
                iArr90[i121 - 1] = iArr90[i121 - 1] + iArr90[i121];
                this.RemoteActionCompatParcelizer = i121 + 1;
                iArr90[i121] = iArr90[i121 - 1];
                return 0;
            case 108:
                int[] iArr91 = this.AudioAttributesImplApi21Parcelizer;
                int i122 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i122 + 1;
                iArr91[i122] = 78;
                return 0;
            case 109:
                int[] iArr92 = this.AudioAttributesImplApi21Parcelizer;
                int i123 = this.RemoteActionCompatParcelizer;
                iArr92[i123] = 47;
                iArr92[i123 - 1] = iArr92[i123 - 1] + iArr92[i123];
                this.RemoteActionCompatParcelizer = i123 + 1;
                iArr92[i123] = iArr92[i123 - 1];
                return 0;
            case 110:
                int i124 = this.RemoteActionCompatParcelizer;
                int i125 = i124 - 1;
                Object[] objArr16 = this.MediaMetadataCompat;
                Object obj6 = objArr16[i125];
                objArr16[i125] = null;
                objArr16[5] = obj6;
                this.RemoteActionCompatParcelizer = i124;
                objArr16[i125] = objArr16[4];
                return 0;
            case 111:
                int i126 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i126;
                Object[] objArr17 = this.MediaMetadataCompat;
                Object obj7 = objArr17[i126];
                objArr17[i126] = null;
                objArr17[6] = obj7;
                return 0;
            case 112:
                Object[] objArr18 = this.MediaMetadataCompat;
                int i127 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i127 + 1;
                objArr18[i127] = objArr18[6];
                return 0;
            case 113:
                int i128 = this.RemoteActionCompatParcelizer;
                int i129 = i128 - 1;
                Object[] objArr19 = this.MediaMetadataCompat;
                Object obj8 = objArr19[i129];
                objArr19[i129] = null;
                objArr19[5] = obj8;
                objArr19[i129] = objArr19[4];
                this.RemoteActionCompatParcelizer = i128 + 1;
                objArr19[i128] = objArr19[5];
                return 0;
            case 114:
                Object[] objArr20 = this.MediaMetadataCompat;
                int i130 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i130 + 1;
                objArr20[i130] = objArr20[i130 - 1];
                return 0;
            case 115:
                int i131 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i131;
                Object[] objArr21 = this.MediaMetadataCompat;
                Object obj9 = objArr21[i131];
                objArr21[i131] = null;
                this.read = obj9 == null ? 0 : 1;
                return 0;
            case 116:
                int i132 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i132;
                Object[] objArr22 = this.MediaMetadataCompat;
                Object obj10 = objArr22[i132];
                objArr22[i132] = null;
                objArr22[5] = obj10;
                return 0;
            case 117:
                int[] iArr93 = this.AudioAttributesImplApi21Parcelizer;
                int i133 = this.RemoteActionCompatParcelizer;
                iArr93[i133] = 43;
                this.RemoteActionCompatParcelizer = i133;
                iArr93[i133 - 1] = iArr93[i133 - 1] + iArr93[i133];
                return 0;
            default:
                return i;
        }
    }

    public getCardTitle(Object obj) {
        this.AudioAttributesImplApi21Parcelizer = new int[7];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[7];
        this.AudioAttributesImplBaseParcelizer = new float[7];
        this.MediaBrowserCompatItemReceiver = new double[7];
        Object[] objArr = new Object[7];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public getCardTitle(Object obj, Object obj2, int i) {
        int[] iArr = new int[7];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatCustomActionResultReceiver = new long[7];
        this.AudioAttributesImplBaseParcelizer = new float[7];
        this.MediaBrowserCompatItemReceiver = new double[7];
        Object[] objArr = new Object[7];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        iArr[6] = i;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public getCardTitle(Object obj, Object obj2, Object obj3) {
        this.AudioAttributesImplApi21Parcelizer = new int[7];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[7];
        this.AudioAttributesImplBaseParcelizer = new float[7];
        this.MediaBrowserCompatItemReceiver = new double[7];
        Object[] objArr = new Object[7];
        this.MediaMetadataCompat = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }
}
