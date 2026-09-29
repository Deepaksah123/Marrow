package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public class getSkipCount {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    private final double[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    private int write;

    public getSkipCount(Object obj) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[11];
        this.AudioAttributesImplBaseParcelizer = new long[11];
        this.AudioAttributesImplApi26Parcelizer = new float[11];
        this.MediaBrowserCompatItemReceiver = new double[11];
        Object[] objArr = new Object[11];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaMetadataCompat;
                int i2 = this.write;
                this.write = i2 + 1;
                objArr[i2] = objArr[7];
                return 0;
            case 2:
                int i3 = this.write - this.IconCompatParcelizer;
                this.write = i3;
                this.AudioAttributesImplApi21Parcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.read = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i5 = this.write;
                this.write = i5 + 1;
                objArr3[i5] = this.RemoteActionCompatParcelizer;
                return 0;
            case 5:
                Object[] objArr4 = this.MediaMetadataCompat;
                int i6 = this.write;
                objArr4[i6] = objArr4[i6 - 1];
                this.write = i6;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[8] = obj2;
                return 0;
            case 6:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i7 = this.write;
                this.write = i7 + 1;
                objArr5[i7] = objArr5[8];
                return 0;
            case 7:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i8 = this.write;
                iArr[i8] = 2;
                iArr[i8 + 1] = 2;
                int i9 = i8 + 1;
                this.write = i9;
                iArr[i8] = iArr[i8] % iArr[i9];
                return 0;
            case 8:
                int i10 = this.write - 1;
                this.write = i10;
                this.MediaMetadataCompat[i10] = null;
                return 0;
            case 10:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i11 = this.write;
                Object obj3 = objArr6[i11 - 1];
                objArr6[i11 - 1] = null;
                this.read = obj3;
            case 9:
                return 0;
            case 11:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.write;
                this.write = i12 + 1;
                iArr2[i12] = this.IconCompatParcelizer;
                return 0;
            case 12:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = this.write;
                iArr3[i13] = 69;
                this.write = i13 + 3;
                iArr3[i13 + 2] = iArr3[i13];
                iArr3[i13 + 1] = iArr3[i13 - 1];
                return 0;
            case 13:
                int i14 = this.write;
                int i15 = i14 - 1;
                this.write = i15;
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i14 - 2] = iArr4[i14 - 2] ^ iArr4[i15];
                return 0;
            case 14:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i16 = this.write;
                this.write = i16 + 1;
                int i17 = iArr5[i16 - 1];
                iArr5[i16] = i17;
                iArr5[i16 - 1] = iArr5[i16 - 2];
                iArr5[i16 - 2] = iArr5[i16 - 3];
                iArr5[i16 - 3] = i17;
                return 0;
            case 15:
                int i18 = this.write;
                int i19 = i18 - 1;
                this.write = i19;
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr6[i18 - 2] = iArr6[i18 - 2] & iArr6[i19];
                return 0;
            case 16:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i20 = this.write;
                this.write = i20 + 1;
                iArr7[i20] = 1;
                return 0;
            case 17:
                int i21 = this.write;
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr8[i21 - 2] = iArr8[i21 - 2] << iArr8[i21 - 1];
                int i22 = i21 - 2;
                this.write = i22;
                iArr8[i21 - 3] = iArr8[i21 - 3] + iArr8[i22];
                return 0;
            case 18:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.write;
                iArr9[i23] = iArr9[i23 - 1];
                iArr9[i23 + 1] = 128;
                int i24 = i23 + 1;
                this.write = i24;
                iArr9[i23] = iArr9[i23] % iArr9[i24];
                return 0;
            case 19:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i25 + 1;
                this.AudioAttributesCompatParcelizer = iArr10[i25];
                return 0;
            case 20:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i26 = this.write;
                this.write = i26 + 1;
                iArr11[i26] = 2;
                return 0;
            case 21:
                int i27 = this.write - 1;
                this.write = i27;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i27] == 0 ? 0 : 1;
                return 0;
            case 22:
                int i28 = this.write;
                int i29 = i28 - 1;
                this.write = i29;
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr12[i28 - 2] = iArr12[i28 - 2] % iArr12[i29];
                return 0;
            case 23:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i30 = this.write;
                this.write = i30 + 1;
                objArr7[i30] = null;
                return 0;
            case 24:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i31 = this.write;
                iArr13[i31] = 79;
                this.write = i31 + 3;
                iArr13[i31 + 2] = iArr13[i31];
                iArr13[i31 + 1] = iArr13[i31 - 1];
                return 0;
            case 25:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i32 = this.write;
                this.write = i32 + 2;
                iArr14[i32 + 1] = iArr14[i32 - 1];
                iArr14[i32] = iArr14[i32 - 2];
                return 0;
            case 26:
                int i33 = this.write;
                int i34 = i33 - 1;
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr15[i33 - 2] = iArr15[i33 - 2] ^ iArr15[i34];
                this.write = i33;
                int i35 = iArr15[i33 - 2];
                iArr15[i34] = i35;
                iArr15[i33 - 2] = iArr15[i33 - 3];
                iArr15[i33 - 3] = iArr15[i33 - 4];
                iArr15[i33 - 4] = i35;
                return 0;
            case 27:
                int i36 = this.write;
                this.MediaMetadataCompat[i36 - 1] = null;
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr16[i36 - 3] = iArr16[i36 - 2] & iArr16[i36 - 3];
                int i37 = i36 - 3;
                this.write = i37;
                iArr16[i36 - 4] = iArr16[i36 - 4] | iArr16[i37];
                return 0;
            case 28:
                int i38 = this.write;
                int i39 = i38 - 1;
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i38 - 2] = iArr17[i38 - 2] << iArr17[i39];
                int i40 = iArr17[i38 - 2];
                iArr17[i39] = i40;
                iArr17[i38 - 2] = iArr17[i38 - 3];
                iArr17[i38 - 3] = iArr17[i38 - 4];
                iArr17[i38 - 4] = i40;
                int i41 = i38 - 1;
                this.write = i41;
                this.MediaMetadataCompat[i41] = null;
                return 0;
            case 29:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i42 = this.write;
                this.write = i42 + 1;
                iArr18[i42] = -1;
                return 0;
            case 30:
                int i43 = this.write;
                int i44 = i43 - 1;
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i43 - 2] = iArr19[i43 - 2] & iArr19[i44];
                int i45 = iArr19[i43 - 2];
                iArr19[i44] = i45;
                iArr19[i43 - 2] = iArr19[i43 - 3];
                iArr19[i43 - 3] = iArr19[i43 - 4];
                iArr19[i43 - 4] = i45;
                int i46 = i43 - 1;
                this.write = i46;
                this.MediaMetadataCompat[i46] = null;
                return 0;
            case 31:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i47 = this.write;
                int i48 = iArr20[i47 - 1];
                iArr20[i47 - 1] = iArr20[i47 - 2];
                iArr20[i47 - 2] = i48;
                this.write = i47 + 1;
                iArr20[i47] = -1;
                return 0;
            case 32:
                int i49 = this.write;
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i49 - 2] = iArr21[i49 - 1] ^ iArr21[i49 - 2];
                iArr21[i49 - 3] = iArr21[i49 - 2] & iArr21[i49 - 3];
                int i50 = i49 - 3;
                this.write = i50;
                iArr21[i49 - 4] = iArr21[i49 - 4] | iArr21[i50];
                return 0;
            case 33:
                int i51 = this.write;
                int i52 = i51 - 1;
                this.write = i52;
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr22[i51 - 2] = iArr22[i51 - 2] - iArr22[i52];
                return 0;
            case 34:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i53 = this.write;
                iArr23[i53] = iArr23[i53 - 1];
                this.write = i53 + 2;
                iArr23[i53 + 1] = 128;
                return 0;
            case 35:
                int i54 = this.write - 1;
                this.write = i54;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i54] != 0 ? 0 : 1;
                return 0;
            case 36:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i55 = this.write;
                this.write = i55 + 1;
                objArr8[i55] = objArr8[i55 - 1];
                return 0;
            case 37:
                int i56 = this.write - 1;
                this.write = i56;
                Object[] objArr9 = this.MediaMetadataCompat;
                Object obj4 = objArr9[i56];
                objArr9[i56] = null;
                objArr9[8] = obj4;
                return 0;
            case 38:
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i57 = this.write;
                this.write = i57 + 1;
                iArr24[i57] = 5;
                return 0;
            case 39:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i58 = this.write;
                this.write = i58 + 1;
                iArr25[i58] = 0;
                return 0;
            case 40:
                int i59 = this.write;
                int i60 = i59 - 1;
                this.write = i60;
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr26[i59 - 2] = iArr26[i59 - 2] / iArr26[i60];
                return 0;
            case 41:
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i61 = this.write - 1;
                this.write = i61;
                this.AudioAttributesCompatParcelizer = iArr27[i61];
                return 0;
            case 42:
                int[] iArr28 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i62 = this.write;
                this.write = i62 + 1;
                iArr28[i62] = 0;
                return 0;
            case 43:
                int[] iArr29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i63 = this.write;
                this.write = i63 + 1;
                iArr29[i63] = 25;
                return 0;
            case 44:
                int[] iArr30 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i64 = this.write;
                this.write = i64 + 1;
                iArr30[i64] = 82;
                return 0;
            case 45:
                for (int i65 = this.write - 1; i65 >= 0; i65--) {
                    this.MediaMetadataCompat[i65] = null;
                }
                Object[] objArr10 = this.MediaMetadataCompat;
                this.write = 1;
                objArr10[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 46:
                int[] iArr31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i66 = this.write;
                this.write = i66 + 1;
                iArr31[i66] = 15;
                iArr31[i66] = -iArr31[i66];
                return 0;
            case 47:
                int[] iArr32 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i67 = this.write;
                iArr32[i67 - 1] = -iArr32[i67 - 1];
                this.write = i67 + 2;
                iArr32[i67 + 1] = iArr32[i67 - 1];
                iArr32[i67] = iArr32[i67 - 2];
                return 0;
            case 48:
                int[] iArr33 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i68 = this.write;
                iArr33[i68 - 1] = -iArr33[i68 - 1];
                int i69 = i68 - 1;
                iArr33[i68 - 2] = iArr33[i68 - 2] & iArr33[i69];
                this.write = i68;
                iArr33[i69] = 1;
                return 0;
            case 49:
                int i70 = this.write;
                int i71 = i70 - 1;
                this.write = i71;
                int[] iArr34 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr34[i70 - 2] = iArr34[i70 - 2] << iArr34[i71];
                iArr34[i70 - 2] = -iArr34[i70 - 2];
                return 0;
            case 50:
                int[] iArr35 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i72 = this.write;
                iArr35[i72 - 1] = -iArr35[i72 - 1];
                int i73 = i72 - 1;
                iArr35[i72 - 2] = iArr35[i72 - 2] | iArr35[i73];
                this.write = i72;
                iArr35[i73] = 1;
                return 0;
            case 51:
                int i74 = this.write;
                int i75 = i74 - 1;
                int[] iArr36 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr36[i74 - 2] = iArr36[i74 - 2] << iArr36[i75];
                this.write = i74;
                int i76 = iArr36[i74 - 2];
                iArr36[i75] = i76;
                iArr36[i74 - 2] = iArr36[i74 - 3];
                iArr36[i74 - 3] = iArr36[i74 - 4];
                iArr36[i74 - 4] = i76;
                return 0;
            case 52:
                int i77 = this.write;
                this.MediaMetadataCompat[i77 - 1] = null;
                int[] iArr37 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr37[i77 - 2] = -iArr37[i77 - 2];
                int i78 = i77 - 2;
                this.write = i78;
                iArr37[i77 - 3] = iArr37[i77 - 3] ^ iArr37[i78];
                return 0;
            case 53:
                int[] iArr38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i79 = this.write;
                this.write = i79 + 1;
                iArr38[i79] = 48;
                return 0;
            case 54:
                int[] iArr39 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i80 = this.write;
                this.write = i80 + 1;
                iArr39[i80] = 14;
                return 0;
            case 55:
                int[] iArr40 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i81 = this.write;
                iArr40[i81] = 125;
                this.write = i81 + 3;
                iArr40[i81 + 2] = iArr40[i81];
                iArr40[i81 + 1] = iArr40[i81 - 1];
                return 0;
            case 56:
                int i82 = this.write;
                int i83 = i82 - 1;
                int[] iArr41 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr41[i82 - 2] = iArr41[i82 - 2] | iArr41[i83];
                this.write = i82;
                iArr41[i83] = 1;
                return 0;
            case 57:
                int[] iArr42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i84 = this.write;
                this.write = i84 + 1;
                iArr42[i84] = iArr42[i84 - 1];
                return 0;
            case 58:
                int[] iArr43 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i85 = this.write;
                this.write = i85 + 1;
                iArr43[i85] = 128;
                return 0;
            case 59:
                int[] iArr44 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i86 = this.write;
                iArr44[i86] = 51;
                iArr44[i86 + 1] = 0;
                int i87 = i86 + 1;
                this.write = i87;
                iArr44[i86] = iArr44[i86] / iArr44[i87];
                return 0;
            case 60:
                int[] iArr45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i88 = this.write;
                iArr45[i88] = 61;
                this.write = i88 + 3;
                iArr45[i88 + 2] = iArr45[i88];
                iArr45[i88 + 1] = iArr45[i88 - 1];
                return 0;
            case 61:
                int[] iArr46 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i89 = this.write;
                iArr46[i89] = -1;
                iArr46[i89 - 1] = iArr46[i89 - 1] ^ iArr46[i89];
                this.write = i89 + 1;
                int i90 = iArr46[i89 - 1];
                iArr46[i89] = i90;
                iArr46[i89 - 1] = iArr46[i89 - 2];
                iArr46[i89 - 2] = iArr46[i89 - 3];
                iArr46[i89 - 3] = i90;
                return 0;
            case 62:
                int i91 = this.write;
                this.MediaMetadataCompat[i91 - 1] = null;
                int[] iArr47 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr47[i91 - 3] = iArr47[i91 - 2] | iArr47[i91 - 3];
                int i92 = i91 - 3;
                this.write = i92;
                iArr47[i91 - 4] = iArr47[i91 - 4] & iArr47[i92];
                return 0;
            case 63:
                int[] iArr48 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i93 = this.write;
                int i94 = iArr48[i93 - 1];
                iArr48[i93] = i94;
                iArr48[i93 - 1] = iArr48[i93 - 2];
                iArr48[i93 - 2] = iArr48[i93 - 3];
                iArr48[i93 - 3] = i94;
                this.MediaMetadataCompat[i93] = null;
                this.write = i93 + 2;
                iArr48[i93 + 1] = iArr48[i93 - 1];
                iArr48[i93] = iArr48[i93 - 2];
                return 0;
            case 64:
                int i95 = this.write;
                this.MediaMetadataCompat[i95 - 1] = null;
                int i96 = i95 - 2;
                this.write = i96;
                int[] iArr49 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr49[i95 - 3] = iArr49[i95 - 3] & iArr49[i96];
                return 0;
            case 65:
                int i97 = this.write;
                int i98 = i97 - 1;
                int[] iArr50 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr50[i97 - 2] = iArr50[i97 - 2] << iArr50[i98];
                iArr50[i97 - 2] = -iArr50[i97 - 2];
                this.write = i97;
                iArr50[i98] = iArr50[i97 - 2];
                return 0;
            case 66:
                int[] iArr51 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i99 = this.write;
                iArr51[i99 - 1] = -iArr51[i99 - 1];
                iArr51[i99] = -1;
                this.write = i99;
                iArr51[i99 - 1] = iArr51[i99] ^ iArr51[i99 - 1];
                return 0;
            case 67:
                int[] iArr52 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = this.write;
                int i101 = iArr52[i100 - 1];
                iArr52[i100 - 1] = iArr52[i100 - 2];
                iArr52[i100 - 2] = i101;
                int i102 = i100 - 1;
                this.write = i102;
                this.MediaMetadataCompat[i102] = null;
                return 0;
            case 68:
                int[] iArr53 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i103 = this.write;
                iArr53[i103] = 1;
                this.write = i103;
                iArr53[i103 - 1] = iArr53[i103 - 1] - iArr53[i103];
                return 0;
            case 69:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i104 = this.write;
                this.write = i104 + 1;
                objArr11[i104] = objArr11[9];
                return 0;
            case 70:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i105 = this.write;
                this.write = i105 + 1;
                objArr12[i105] = objArr12[10];
                return 0;
            case 71:
                int[] iArr54 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i106 = this.write;
                this.write = i106 + 1;
                iArr54[i106] = iArr54[8];
                return 0;
            case 72:
                int i107 = this.write;
                int i108 = i107 - 2;
                this.write = i108;
                int[] iArr55 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesCompatParcelizer = iArr55[i108] == iArr55[i107 - 1] ? 0 : 1;
                return 0;
            case 73:
                int[] iArr56 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i109 = this.write;
                iArr56[i109] = iArr56[8];
                this.write = i109 + 2;
                iArr56[i109 + 1] = 2;
                return 0;
            case 74:
                Object[] objArr13 = this.MediaMetadataCompat;
                int i110 = this.write;
                objArr13[i110] = objArr13[9];
                objArr13[i110 + 1] = objArr13[10];
                int[] iArr57 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.write = i110 + 3;
                iArr57[i110 + 2] = 2;
                return 0;
            case 75:
                int[] iArr58 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i111 = this.write;
                iArr58[i111] = 2;
                this.write = i111;
                iArr58[i111 - 1] = iArr58[i111 - 1] % iArr58[i111];
                return 0;
            case 76:
                int[] iArr59 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i112 = this.write;
                iArr59[i112] = 31;
                iArr59[i112 - 1] = iArr59[i112 - 1] + iArr59[i112];
                this.write = i112 + 1;
                iArr59[i112] = iArr59[i112 - 1];
                return 0;
            case 77:
                int[] iArr60 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i113 = this.write;
                this.write = i113 + 1;
                iArr60[i113] = 62;
                return 0;
            case 78:
                int i114 = this.write;
                int i115 = i114 - 1;
                this.write = i115;
                int[] iArr61 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr61[i114 - 2] = iArr61[i114 - 2] / iArr61[i115];
                int i116 = i114 - 2;
                this.write = i116;
                this.MediaMetadataCompat[i116] = null;
                return 0;
            case 79:
                int[] iArr62 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i117 = this.write;
                iArr62[i117] = 109;
                this.write = i117 + 3;
                iArr62[i117 + 2] = iArr62[i117];
                iArr62[i117 + 1] = iArr62[i117 - 1];
                return 0;
            case 80:
                int[] iArr63 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i118 = this.write;
                iArr63[i118] = -1;
                iArr63[i118 - 1] = iArr63[i118 - 1] ^ iArr63[i118];
                int i119 = i118 - 1;
                this.write = i119;
                iArr63[i118 - 2] = iArr63[i118 - 2] ^ iArr63[i119];
                return 0;
            case 81:
                int i120 = this.write;
                this.MediaMetadataCompat[i120 - 1] = null;
                int i121 = i120 - 2;
                int[] iArr64 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr64[i120 - 3] = iArr64[i120 - 3] | iArr64[i121];
                this.write = i120;
                iArr64[i120 - 1] = iArr64[i120 - 3];
                iArr64[i121] = iArr64[i120 - 4];
                return 0;
            case 82:
                int i122 = this.write;
                int i123 = i122 - 1;
                int[] iArr65 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr65[i122 - 2] = iArr65[i122 - 2] ^ iArr65[i123];
                int i124 = iArr65[i122 - 2];
                iArr65[i123] = i124;
                iArr65[i122 - 2] = iArr65[i122 - 3];
                iArr65[i122 - 3] = iArr65[i122 - 4];
                iArr65[i122 - 4] = i124;
                int i125 = i122 - 1;
                this.write = i125;
                this.MediaMetadataCompat[i125] = null;
                return 0;
            case 83:
                int i126 = this.write;
                int i127 = i126 - 1;
                int[] iArr66 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr66[i126 - 2] = iArr66[i126 - 2] & iArr66[i127];
                iArr66[i127] = 1;
                int i128 = i126 - 1;
                this.write = i128;
                iArr66[i126 - 2] = iArr66[i126 - 2] << iArr66[i128];
                return 0;
            case 84:
                int i129 = this.write;
                int i130 = i129 - 1;
                this.write = i130;
                int[] iArr67 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr67[i129 - 2] = iArr67[i129 - 2] + iArr67[i130];
                return 0;
            case 85:
                int[] iArr68 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i131 = this.write;
                this.write = i131 + 1;
                iArr68[i131] = 31;
                return 0;
            case 86:
                Object[] objArr14 = this.MediaMetadataCompat;
                int i132 = this.write;
                this.write = i132 + 1;
                objArr14[i132] = null;
                int[] iArr69 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj5 = objArr14[i132];
                objArr14[i132] = null;
                iArr69[i132] = ((int[]) obj5).length;
                return 0;
            case 87:
                int[] iArr70 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i133 = this.write;
                iArr70[i133] = 75;
                this.write = i133 + 2;
                iArr70[i133 + 1] = iArr70[i133];
                return 0;
            case 88:
                int[] iArr71 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i134 = this.write;
                iArr71[i134] = -1;
                this.write = i134;
                iArr71[i134 - 1] = iArr71[i134] ^ iArr71[i134 - 1];
                return 0;
            case 89:
                int i135 = this.write;
                int i136 = i135 - 1;
                int[] iArr72 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr72[i135 - 2] = iArr72[i135 - 2] & iArr72[i136];
                this.write = i135;
                int i137 = iArr72[i135 - 2];
                iArr72[i136] = i137;
                iArr72[i135 - 2] = iArr72[i135 - 3];
                iArr72[i135 - 3] = iArr72[i135 - 4];
                iArr72[i135 - 4] = i137;
                return 0;
            case 90:
                int[] iArr73 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i138 = this.write;
                int i139 = iArr73[i138 - 1];
                iArr73[i138 - 1] = iArr73[i138 - 2];
                iArr73[i138 - 2] = i139;
                return 0;
            case 91:
                int i140 = this.write;
                int[] iArr74 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr74[i140 - 2] = iArr74[i140 - 1] | iArr74[i140 - 2];
                int i141 = iArr74[i140 - 2];
                iArr74[i140 - 2] = iArr74[i140 - 3];
                iArr74[i140 - 3] = i141;
                int i142 = i140 - 2;
                this.write = i142;
                this.MediaMetadataCompat[i142] = null;
                return 0;
            case 92:
                int[] iArr75 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i143 = this.write;
                iArr75[i143 - 1] = -iArr75[i143 - 1];
                return 0;
            case 93:
                int[] iArr76 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i144 = this.write;
                iArr76[i144 + 1] = iArr76[i144 - 1];
                iArr76[i144] = iArr76[i144 - 2];
                int i145 = i144 + 1;
                iArr76[i144] = iArr76[i144] & iArr76[i145];
                this.write = i144 + 2;
                int i146 = iArr76[i144];
                iArr76[i145] = i146;
                iArr76[i144] = iArr76[i144 - 1];
                iArr76[i144 - 1] = iArr76[i144 - 2];
                iArr76[i144 - 2] = i146;
                return 0;
            case 94:
                int i147 = this.write;
                this.MediaMetadataCompat[i147 - 1] = null;
                int[] iArr77 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr77[i147 - 3] = iArr77[i147 - 2] | iArr77[i147 - 3];
                int i148 = i147 - 3;
                this.write = i148;
                iArr77[i147 - 4] = iArr77[i147 - 4] + iArr77[i148];
                return 0;
            case 95:
                int[] iArr78 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i149 = this.write;
                iArr78[i149] = 39;
                iArr78[i149] = -iArr78[i149];
                this.write = i149 + 3;
                iArr78[i149 + 2] = iArr78[i149];
                iArr78[i149 + 1] = iArr78[i149 - 1];
                return 0;
            case 96:
                int[] iArr79 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i150 = this.write;
                iArr79[i150 - 1] = -iArr79[i150 - 1];
                int i151 = i150 - 1;
                this.write = i151;
                iArr79[i150 - 2] = iArr79[i150 - 2] ^ iArr79[i151];
                return 0;
            case 97:
                int i152 = this.write;
                int i153 = i152 - 1;
                this.write = i153;
                this.MediaMetadataCompat[i153] = null;
                int[] iArr80 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr80[i152 - 2] = -iArr80[i152 - 2];
                return 0;
            case 98:
                int i154 = this.write;
                int i155 = i154 - 1;
                int[] iArr81 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr81[i154 - 2] = iArr81[i154 - 2] & iArr81[i155];
                this.write = i154;
                iArr81[i155] = 1;
                return 0;
            case 99:
                int i156 = this.write;
                int i157 = i156 - 1;
                this.write = i157;
                int[] iArr82 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr82[i156 - 2] = iArr82[i156 - 2] << iArr82[i157];
                return 0;
            case 100:
                int[] iArr83 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i158 = this.write;
                this.write = i158 + 1;
                iArr83[i158] = 69;
                iArr83[i158] = -iArr83[i158];
                return 0;
            case 101:
                int[] iArr84 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i159 = this.write;
                iArr84[i159 + 1] = iArr84[i159 - 1];
                iArr84[i159] = iArr84[i159 - 2];
                iArr84[i159 + 2] = -1;
                int i160 = i159 + 2;
                this.write = i160;
                iArr84[i159 + 1] = iArr84[i159 + 1] ^ iArr84[i160];
                return 0;
            case 102:
                int[] iArr85 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i161 = this.write;
                int i162 = iArr85[i161 - 1];
                iArr85[i161] = i162;
                iArr85[i161 - 1] = iArr85[i161 - 2];
                iArr85[i161 - 2] = iArr85[i161 - 3];
                iArr85[i161 - 3] = i162;
                this.write = i161;
                this.MediaMetadataCompat[i161] = null;
                int i163 = iArr85[i161 - 1];
                iArr85[i161 - 1] = iArr85[i161 - 2];
                iArr85[i161 - 2] = i163;
                return 0;
            case 103:
                int i164 = this.write;
                int[] iArr86 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr86[i164 - 2] = iArr86[i164 - 1] & iArr86[i164 - 2];
                int i165 = i164 - 2;
                this.write = i165;
                iArr86[i164 - 3] = iArr86[i164 - 3] | iArr86[i165];
                return 0;
            case 104:
                int[] iArr87 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i166 = this.write;
                iArr87[i166] = 1;
                this.write = i166;
                iArr87[i166 - 1] = iArr87[i166 - 1] << iArr87[i166];
                iArr87[i166 - 1] = -iArr87[i166 - 1];
                return 0;
            case 105:
                int i167 = this.write;
                int i168 = i167 - 1;
                int[] iArr88 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr88[i167 - 2] = iArr88[i167 - 2] - iArr88[i168];
                iArr88[i168] = 1;
                int i169 = i167 - 1;
                this.write = i169;
                iArr88[i167 - 2] = iArr88[i167 - 2] - iArr88[i169];
                return 0;
            case 106:
                int[] iArr89 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i170 = this.write;
                this.write = i170 + 1;
                iArr89[i170] = 7;
                return 0;
            case 107:
                int[] iArr90 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i171 = this.write;
                this.write = i171 + 1;
                iArr90[i171] = 29;
                return 0;
            case 108:
                int[] iArr91 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i172 = this.write;
                this.write = i172 + 1;
                iArr91[i172] = 33;
                return 0;
            case 109:
                int[] iArr92 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i173 = this.write;
                this.write = i173 + 1;
                iArr92[i173] = 61;
                return 0;
            case 110:
                int[] iArr93 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i174 = this.write;
                this.write = i174 + 1;
                iArr93[i174] = 10;
                return 0;
            case 111:
                int[] iArr94 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i175 = this.write;
                this.write = i175 + 1;
                iArr94[i175] = 96;
                return 0;
            case 112:
                int i176 = this.write;
                int i177 = i176 - 1;
                this.write = i177;
                int[] iArr95 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr95[i176 - 2] = iArr95[i176 - 2] % iArr95[i177];
                int i178 = i176 - 2;
                this.write = i178;
                this.MediaMetadataCompat[i178] = null;
                return 0;
            case 113:
                int[] iArr96 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i179 = this.write;
                this.write = i179 + 1;
                iArr96[i179] = 3;
                return 0;
            case 114:
                int[] iArr97 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i180 = this.write;
                this.write = i180 + 1;
                iArr97[i180] = iArr97[i180 - 1];
                iArr97[i180] = -iArr97[i180];
                return 0;
            case 115:
                int[] iArr98 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i181 = this.write;
                int i182 = iArr98[i181 - 1];
                iArr98[i181] = i182;
                iArr98[i181 - 1] = iArr98[i181 - 2];
                iArr98[i181 - 2] = iArr98[i181 - 3];
                iArr98[i181 - 3] = i182;
                this.write = i181;
                this.MediaMetadataCompat[i181] = null;
                return 0;
            case 116:
                int i183 = this.write;
                int[] iArr99 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr99[i183 - 2] = iArr99[i183 - 1] | iArr99[i183 - 2];
                int i184 = i183 - 2;
                this.write = i184;
                iArr99[i183 - 3] = iArr99[i184] & iArr99[i183 - 3];
                int i185 = iArr99[i183 - 3];
                iArr99[i183 - 3] = iArr99[i183 - 4];
                iArr99[i183 - 4] = i185;
                return 0;
            case 117:
                int i186 = this.write;
                this.MediaMetadataCompat[i186 - 1] = null;
                int i187 = i186 - 2;
                this.write = i187;
                int[] iArr100 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr100[i186 - 3] = iArr100[i186 - 3] | iArr100[i187];
                return 0;
            case 118:
                int i188 = this.write;
                int i189 = i188 - 1;
                int[] iArr101 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr101[i188 - 2] = iArr101[i188 - 2] + iArr101[i189];
                iArr101[i189] = iArr101[i188 - 2];
                this.write = i188 + 1;
                iArr101[i188] = 128;
                return 0;
            case 119:
                int[] iArr102 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i190 = this.write;
                this.write = i190 + 1;
                iArr102[i190] = 101;
                return 0;
            case 120:
                int i191 = this.write - 1;
                this.write = i191;
                Object[] objArr15 = this.MediaMetadataCompat;
                Object obj6 = objArr15[i191];
                objArr15[i191] = null;
                objArr15[10] = obj6;
                return 0;
            case 121:
                int i192 = this.write;
                int i193 = i192 - 1;
                Object[] objArr16 = this.MediaMetadataCompat;
                objArr16[i193] = null;
                objArr16[i193] = objArr16[8];
                this.write = i192 + 1;
                objArr16[i192] = objArr16[9];
                return 0;
            case 122:
                int i194 = this.write;
                int i195 = i194 - 1;
                Object[] objArr17 = this.MediaMetadataCompat;
                Object obj7 = objArr17[i195];
                objArr17[i195] = null;
                objArr17[8] = obj7;
                this.write = i194;
                objArr17[i195] = objArr17[10];
                return 0;
            case 123:
                int[] iArr103 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i196 = this.write;
                this.write = i196 + 1;
                iArr103[i196] = 1;
                return 0;
            case 124:
                int[] iArr104 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i197 = this.write;
                iArr104[i197 - 1] = -iArr104[i197 - 1];
                this.write = i197 + 2;
                iArr104[i197 + 1] = iArr104[i197 - 1];
                iArr104[i197] = iArr104[i197 - 2];
                iArr104[i197 + 1] = -iArr104[i197 + 1];
                return 0;
            case 125:
                int i198 = this.write;
                int[] iArr105 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr105[i198 - 2] = iArr105[i198 - 1] ^ iArr105[i198 - 2];
                this.MediaMetadataCompat[i198 - 2] = null;
                int i199 = i198 - 3;
                this.write = i199;
                iArr105[i198 - 4] = iArr105[i198 - 4] & iArr105[i199];
                return 0;
            case 126:
                int i200 = this.write;
                int i201 = i200 - 1;
                int[] iArr106 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr106[i200 - 2] = iArr106[i200 - 2] | iArr106[i201];
                iArr106[i201] = iArr106[i200 - 2];
                this.write = i200 + 1;
                iArr106[i200] = -1;
                return 0;
            case 127:
                int i202 = this.write;
                this.MediaMetadataCompat[i202 - 1] = null;
                int i203 = i202 - 2;
                int[] iArr107 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr107[i202 - 3] = iArr107[i202 - 3] - iArr107[i203];
                this.write = i202 - 1;
                iArr107[i203] = 1;
                return 0;
            case 128:
                int[] iArr108 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i204 = this.write;
                iArr108[i204] = 128;
                this.write = i204;
                iArr108[i204 - 1] = iArr108[i204 - 1] % iArr108[i204];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr109 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i205 = this.write;
                iArr109[i205] = 53;
                this.write = i205;
                iArr109[i205 - 1] = iArr109[i205 - 1] + iArr109[i205];
                return 0;
            default:
                return i;
        }
    }

    public getSkipCount(Object obj, Object obj2) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[11];
        this.AudioAttributesImplBaseParcelizer = new long[11];
        this.AudioAttributesImplApi26Parcelizer = new float[11];
        this.MediaBrowserCompatItemReceiver = new double[11];
        Object[] objArr = new Object[11];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        objArr[8] = obj2;
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public getSkipCount(Object obj, int i, Object obj2, Object obj3) {
        int[] iArr = new int[11];
        this.MediaBrowserCompatCustomActionResultReceiver = iArr;
        this.AudioAttributesImplBaseParcelizer = new long[11];
        this.AudioAttributesImplApi26Parcelizer = new float[11];
        this.MediaBrowserCompatItemReceiver = new double[11];
        Object[] objArr = new Object[11];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        iArr[8] = i;
        objArr[9] = obj2;
        objArr[10] = obj3;
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public getSkipCount(Object obj, Object obj2, Object obj3) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[11];
        this.AudioAttributesImplBaseParcelizer = new long[11];
        this.AudioAttributesImplApi26Parcelizer = new float[11];
        this.MediaBrowserCompatItemReceiver = new double[11];
        Object[] objArr = new Object[11];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        objArr[8] = obj2;
        objArr[9] = obj3;
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }
}
