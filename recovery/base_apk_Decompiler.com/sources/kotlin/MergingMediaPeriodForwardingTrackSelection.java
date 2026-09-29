package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class MergingMediaPeriodForwardingTrackSelection {
    public int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final double[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private final long[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    private int write;

    public MergingMediaPeriodForwardingTrackSelection(Object obj, Object obj2) {
        this.AudioAttributesImplApi21Parcelizer = new int[13];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[13];
        this.AudioAttributesImplApi26Parcelizer = new float[13];
        this.AudioAttributesImplBaseParcelizer = new double[13];
        Object[] objArr = new Object[13];
        this.MediaMetadataCompat = objArr;
        objArr[6] = obj;
        objArr[7] = obj2;
        this.write = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaMetadataCompat;
                int i2 = this.write;
                this.write = i2 + 1;
                objArr[i2] = objArr[6];
                return 0;
            case 2:
                int i3 = this.write - this.read;
                this.write = i3;
                this.MediaBrowserCompatItemReceiver = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i4 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.IconCompatParcelizer = obj;
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
                this.write = i6 + 1;
                objArr4[i6] = objArr4[7];
                return 0;
            case 6:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i7 = this.write;
                this.write = i7 + 1;
                iArr[i7] = 2;
                return 0;
            case 7:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.write;
                iArr2[i8] = 2;
                this.write = i8;
                iArr2[i8 - 1] = iArr2[i8 - 1] % iArr2[i8];
                return 0;
            case 8:
                int i9 = this.write - 1;
                this.write = i9;
                this.MediaMetadataCompat[i9] = null;
                return 0;
            case 9:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i10 = this.write;
                Object obj2 = objArr5[i10 - 1];
                objArr5[i10 - 1] = null;
                this.IconCompatParcelizer = obj2;
                return 0;
            case 11:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.write;
                this.write = i11 + 1;
                iArr3[i11] = this.read;
            case 10:
                return 0;
            case 12:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i12 = this.write;
                this.write = i12 + 1;
                iArr4[i12] = 77;
                return 0;
            case 13:
                int i13 = this.write;
                int i14 = i13 - 1;
                this.write = i14;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i13 - 2] = iArr5[i13 - 2] + iArr5[i14];
                return 0;
            case 14:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.write;
                iArr6[i15] = iArr6[i15 - 1];
                this.write = i15 + 2;
                iArr6[i15 + 1] = 128;
                return 0;
            case 15:
                int i16 = this.write;
                int i17 = i16 - 1;
                this.write = i17;
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i16 - 2] = iArr7[i16 - 2] % iArr7[i17];
                return 0;
            case 16:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i18 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i18 + 1;
                this.AudioAttributesCompatParcelizer = iArr8[i18];
                return 0;
            case 17:
                int i19 = this.write - 1;
                this.write = i19;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i19] == 0 ? 0 : 1;
                return 0;
            case 18:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.write;
                this.write = i20 + 1;
                iArr9[i20] = 49;
                return 0;
            case 19:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.write;
                this.write = i21 + 1;
                iArr10[i21] = iArr10[i21 - 1];
                return 0;
            case 20:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.write;
                iArr11[i22] = 128;
                this.write = i22;
                iArr11[i22 - 1] = iArr11[i22 - 1] % iArr11[i22];
                return 0;
            case 21:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = this.write;
                iArr12[i23] = 2;
                iArr12[i23 + 1] = 2;
                int i24 = i23 + 1;
                this.write = i24;
                iArr12[i23] = iArr12[i23] % iArr12[i24];
                return 0;
            case 22:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.write;
                this.write = i25 + 1;
                iArr13[i25] = 35;
                return 0;
            case 23:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i26 = this.write;
                this.write = i26 + 1;
                iArr14[i26] = 128;
                return 0;
            case 24:
                int i27 = this.write - 1;
                this.write = i27;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i27] != 0 ? 0 : 1;
                return 0;
            case 25:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.write;
                this.write = i28 + 1;
                iArr15[i28] = 53;
                return 0;
            case 26:
                int i29 = this.write;
                int i30 = i29 - 1;
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[i29 - 2] = iArr16[i29 - 2] + iArr16[i30];
                this.write = i29;
                iArr16[i30] = iArr16[i29 - 2];
                return 0;
            case 27:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i31 = this.write;
                objArr6[i31] = objArr6[6];
                this.write = i31 + 2;
                objArr6[i31 + 1] = objArr6[7];
                return 0;
            case 28:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i32 = this.write;
                this.write = i32 + 1;
                objArr7[i32] = null;
                return 0;
            case 29:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = this.write - 1;
                this.write = i33;
                this.AudioAttributesCompatParcelizer = iArr17[i33];
                return 0;
            case 30:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.write;
                this.write = i34 + 1;
                iArr18[i34] = 13;
                return 0;
            case 31:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = this.write;
                this.write = i35 + 1;
                iArr19[i35] = 88;
                return 0;
            case 32:
                for (int i36 = this.write - 1; i36 >= 0; i36--) {
                    this.MediaMetadataCompat[i36] = null;
                }
                Object[] objArr8 = this.MediaMetadataCompat;
                this.write = 1;
                objArr8[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 33:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.write;
                this.write = i37 + 1;
                iArr20[i37] = 117;
                return 0;
            case 34:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = this.write;
                iArr21[i38] = iArr21[i38 - 1];
                iArr21[i38 + 1] = 128;
                int i39 = i38 + 1;
                this.write = i39;
                iArr21[i38] = iArr21[i38] % iArr21[i39];
                return 0;
            case 35:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.write;
                this.write = i40 + 1;
                iArr22[i40] = 43;
                return 0;
            case 36:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.write;
                iArr23[i41] = 10;
                iArr23[i41 + 1] = 0;
                int i42 = i41 + 1;
                this.write = i42;
                iArr23[i41] = iArr23[i41] / iArr23[i42];
                return 0;
            case 37:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.write;
                this.write = i43 + 1;
                iArr24[i43] = 74;
                return 0;
            case 38:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.write;
                this.write = i44 + 1;
                iArr25[i44] = 1;
                return 0;
            case 39:
                Object[] objArr9 = this.MediaMetadataCompat;
                int i45 = this.write;
                this.write = i45 + 1;
                objArr9[i45] = objArr9[i45 - 1];
                return 0;
            case 40:
                int i46 = this.write - 1;
                this.write = i46;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj3 = objArr10[i46];
                objArr10[i46] = null;
                objArr10[9] = obj3;
                return 0;
            case 41:
                int i47 = this.write;
                int i48 = i47 - 1;
                this.write = i48;
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                iArr26[i47 - 2] = iArr26[i47 - 2] & iArr26[i48];
                return 0;
            case 42:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i49 = this.write;
                this.write = i49 + 1;
                objArr11[i49] = objArr11[9];
                return 0;
            case 43:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i50 = this.write;
                objArr12[i50] = objArr12[9];
                this.write = i50;
                Object obj4 = objArr12[i50];
                objArr12[i50] = null;
                objArr12[7] = obj4;
                return 0;
            case 44:
                int i51 = this.write - 1;
                this.write = i51;
                Object[] objArr13 = this.MediaMetadataCompat;
                Object obj5 = objArr13[i51];
                objArr13[i51] = null;
                objArr13[7] = obj5;
                return 0;
            case 45:
                int i52 = this.write - 1;
                this.write = i52;
                Object[] objArr14 = this.MediaMetadataCompat;
                Object obj6 = objArr14[i52];
                objArr14[i52] = null;
                objArr14[10] = obj6;
                return 0;
            case 46:
                int i53 = this.write - 1;
                this.write = i53;
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                iArr27[8] = iArr27[i53];
                return 0;
            case 47:
                int i54 = this.write;
                int i55 = i54 - 2;
                this.write = i55;
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesCompatParcelizer = iArr28[i55] == iArr28[i54 - 1] ? 0 : 1;
                return 0;
            case 48:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = this.write;
                iArr29[i56] = iArr29[8];
                this.write = i56 + 2;
                iArr29[i56 + 1] = 1;
                return 0;
            case 49:
                int i57 = this.write;
                int i58 = i57 - 2;
                this.write = i58;
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesCompatParcelizer = iArr30[i58] != iArr30[i57 - 1] ? 0 : 1;
                return 0;
            case 50:
                int[] iArr31 = this.AudioAttributesImplApi21Parcelizer;
                int i59 = this.write;
                iArr31[i59] = iArr31[8];
                this.write = i59 + 2;
                iArr31[i59 + 1] = 2;
                return 0;
            case 51:
                Object[] objArr15 = this.MediaMetadataCompat;
                int i60 = this.write;
                this.write = i60 + 1;
                objArr15[i60] = objArr15[10];
                return 0;
            case 52:
                int i61 = this.write;
                int i62 = i61 - 2;
                this.write = i62;
                Object[] objArr16 = this.MediaMetadataCompat;
                Object obj7 = objArr16[i62];
                objArr16[i62] = null;
                Object obj8 = objArr16[i61 - 1];
                objArr16[i61 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj7 != obj8 ? 0 : 1;
                return 0;
            case 53:
                int i63 = this.write;
                int i64 = i63 - 2;
                this.write = i64;
                Object[] objArr17 = this.MediaMetadataCompat;
                Object obj9 = objArr17[i64];
                objArr17[i64] = null;
                Object obj10 = objArr17[i63 - 1];
                objArr17[i63 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj9 == obj10 ? 0 : 1;
                return 0;
            case 54:
                Object[] objArr18 = this.MediaMetadataCompat;
                int i65 = this.write;
                objArr18[i65] = objArr18[7];
                int[] iArr32 = this.AudioAttributesImplApi21Parcelizer;
                this.write = i65 + 2;
                iArr32[i65 + 1] = 1;
                return 0;
            case 55:
                int i66 = this.write - 1;
                this.write = i66;
                Object[] objArr19 = this.MediaMetadataCompat;
                Object obj11 = objArr19[i66];
                objArr19[i66] = null;
                objArr19[8] = obj11;
                return 0;
            case 56:
                Object[] objArr20 = this.MediaMetadataCompat;
                int i67 = this.write;
                objArr20[i67] = objArr20[7];
                int[] iArr33 = this.AudioAttributesImplApi21Parcelizer;
                this.write = i67 + 2;
                iArr33[i67 + 1] = 2;
                return 0;
            case 57:
                Object[] objArr21 = this.MediaMetadataCompat;
                int i68 = this.write;
                objArr21[i68] = objArr21[10];
                objArr21[i68 + 1] = objArr21[8];
                this.write = i68 + 3;
                objArr21[i68 + 2] = objArr21[7];
                return 0;
            case 58:
                int[] iArr34 = this.AudioAttributesImplApi21Parcelizer;
                int i69 = this.write;
                iArr34[i69] = 2;
                this.write = i69 + 2;
                iArr34[i69 + 1] = 2;
                return 0;
            case 59:
                int[] iArr35 = this.AudioAttributesImplApi21Parcelizer;
                int i70 = this.write;
                this.write = i70 + 1;
                iArr35[i70] = 33;
                return 0;
            case 60:
                int i71 = this.write;
                int i72 = i71 - 1;
                int[] iArr36 = this.AudioAttributesImplApi21Parcelizer;
                iArr36[i71 - 2] = iArr36[i71 - 2] + iArr36[i72];
                iArr36[i72] = iArr36[i71 - 2];
                this.write = i71 + 1;
                iArr36[i71] = 128;
                return 0;
            case 61:
                int[] iArr37 = this.AudioAttributesImplApi21Parcelizer;
                int i73 = this.write;
                iArr37[i73] = 115;
                this.write = i73;
                iArr37[i73 - 1] = iArr37[i73 - 1] + iArr37[i73];
                return 0;
            case 62:
                int[] iArr38 = this.AudioAttributesImplApi21Parcelizer;
                int i74 = this.write;
                iArr38[i74] = 45;
                iArr38[i74 - 1] = iArr38[i74 - 1] + iArr38[i74];
                this.write = i74 + 1;
                iArr38[i74] = iArr38[i74 - 1];
                return 0;
            case 63:
                int[] iArr39 = this.AudioAttributesImplApi21Parcelizer;
                int i75 = this.write;
                iArr39[i75] = 51;
                this.write = i75;
                iArr39[i75 - 1] = iArr39[i75 - 1] + iArr39[i75];
                return 0;
            case 64:
                int[] iArr40 = this.AudioAttributesImplApi21Parcelizer;
                int i76 = this.write;
                this.write = i76 + 1;
                iArr40[i76] = 0;
                return 0;
            case 65:
                int[] iArr41 = this.AudioAttributesImplApi21Parcelizer;
                int i77 = this.write;
                this.write = i77 + 1;
                iArr41[i77] = 1;
                return 0;
            case 66:
                int[] iArr42 = this.AudioAttributesImplApi21Parcelizer;
                int i78 = this.write;
                this.write = i78 + 1;
                iArr42[i78] = 54;
                return 0;
            case 67:
                int[] iArr43 = this.AudioAttributesImplApi21Parcelizer;
                int i79 = this.write;
                this.write = i79 + 1;
                iArr43[i79] = 87;
                return 0;
            case 68:
                Object[] objArr22 = this.MediaMetadataCompat;
                int i80 = this.write;
                objArr22[i80] = objArr22[i80 - 1];
                this.write = i80;
                Object obj12 = objArr22[i80];
                objArr22[i80] = null;
                objArr22[9] = obj12;
                return 0;
            case 69:
                int i81 = this.write - 1;
                this.write = i81;
                Object[] objArr23 = this.MediaMetadataCompat;
                Object obj13 = objArr23[i81];
                objArr23[i81] = null;
                objArr23[11] = obj13;
                return 0;
            case 70:
                int[] iArr44 = this.AudioAttributesImplApi21Parcelizer;
                int i82 = this.write;
                this.write = i82 + 1;
                iArr44[i82] = iArr44[8];
                return 0;
            case 71:
                int i83 = this.write;
                int i84 = i83 - 1;
                Object[] objArr24 = this.MediaMetadataCompat;
                Object obj14 = objArr24[i84];
                objArr24[i84] = null;
                objArr24[9] = obj14;
                int i85 = i83 - 2;
                this.write = i85;
                Object obj15 = objArr24[i85];
                objArr24[i85] = null;
                objArr24[7] = obj15;
                return 0;
            case 72:
                int i86 = this.write;
                int i87 = i86 - 1;
                Object[] objArr25 = this.MediaMetadataCompat;
                Object obj16 = objArr25[i87];
                objArr25[i87] = null;
                objArr25[7] = obj16;
                this.write = i86;
                objArr25[i87] = objArr25[10];
                return 0;
            case 73:
                Object[] objArr26 = this.MediaMetadataCompat;
                int i88 = this.write;
                objArr26[i88] = objArr26[9];
                int[] iArr45 = this.AudioAttributesImplApi21Parcelizer;
                this.write = i88 + 2;
                iArr45[i88 + 1] = 1;
                return 0;
            case 74:
                Object[] objArr27 = this.MediaMetadataCompat;
                int i89 = this.write;
                this.write = i89 + 1;
                objArr27[i89] = objArr27[11];
                return 0;
            case 75:
                Object[] objArr28 = this.MediaMetadataCompat;
                int i90 = this.write;
                objArr28[i90] = objArr28[i90 - 1];
                this.write = i90;
                Object obj17 = objArr28[i90];
                objArr28[i90] = null;
                objArr28[10] = obj17;
                return 0;
            case 76:
                int i91 = this.write;
                int i92 = i91 - 1;
                Object[] objArr29 = this.MediaMetadataCompat;
                Object obj18 = objArr29[i92];
                objArr29[i92] = null;
                objArr29[10] = obj18;
                this.write = i91;
                objArr29[i92] = null;
                return 0;
            case 77:
                this.MediaMetadataCompat[12] = this.RemoteActionCompatParcelizer;
                return 0;
            case 78:
                Object[] objArr30 = this.MediaMetadataCompat;
                int i93 = this.write;
                this.write = i93 + 1;
                objArr30[i93] = objArr30[12];
                return 0;
            case 79:
                int i94 = this.write - 1;
                this.write = i94;
                Object[] objArr31 = this.MediaMetadataCompat;
                Object obj19 = objArr31[i94];
                objArr31[i94] = null;
                objArr31[12] = obj19;
                return 0;
            case 80:
                Object[] objArr32 = this.MediaMetadataCompat;
                int i95 = this.write;
                objArr32[i95] = objArr32[12];
                this.write = i95 + 2;
                objArr32[i95 + 1] = objArr32[9];
                return 0;
            case 81:
                Object[] objArr33 = this.MediaMetadataCompat;
                int i96 = this.write;
                objArr33[i96] = objArr33[12];
                this.write = i96 + 2;
                objArr33[i96 + 1] = objArr33[10];
                return 0;
            case 82:
                int i97 = this.write;
                int i98 = i97 - 1;
                Object[] objArr34 = this.MediaMetadataCompat;
                Object obj20 = objArr34[i98];
                objArr34[i98] = null;
                objArr34[7] = obj20;
                this.write = i97;
                objArr34[i98] = objArr34[11];
                return 0;
            case 83:
                Object[] objArr35 = this.MediaMetadataCompat;
                int i99 = this.write;
                objArr35[i99] = null;
                objArr35[i99 + 1] = null;
                this.write = i99 + 3;
                objArr35[i99 + 2] = objArr35[12];
                return 0;
            case 84:
                int[] iArr46 = this.AudioAttributesImplApi21Parcelizer;
                int i100 = this.write;
                this.write = i100 + 1;
                iArr46[i100] = 3;
                return 0;
            case 85:
                Object[] objArr36 = this.MediaMetadataCompat;
                int i101 = this.write;
                objArr36[i101] = objArr36[9];
                this.write = i101 + 2;
                objArr36[i101 + 1] = null;
                return 0;
            case 86:
                Object[] objArr37 = this.MediaMetadataCompat;
                int i102 = this.write;
                objArr37[i102] = objArr37[7];
                this.write = i102 + 2;
                objArr37[i102 + 1] = null;
                return 0;
            case 87:
                int[] iArr47 = this.AudioAttributesImplApi21Parcelizer;
                int i103 = this.write;
                iArr47[i103] = 2;
                this.write = i103;
                iArr47[i103 - 1] = iArr47[i103 - 1] % iArr47[i103];
                int i104 = i103 - 1;
                this.write = i104;
                this.MediaMetadataCompat[i104] = null;
                return 0;
            case 88:
                int i105 = this.write;
                int i106 = i105 - 1;
                this.write = i106;
                int[] iArr48 = this.AudioAttributesImplApi21Parcelizer;
                iArr48[i105 - 2] = iArr48[i105 - 2] % iArr48[i106];
                int i107 = i105 - 2;
                this.write = i107;
                this.MediaMetadataCompat[i107] = null;
                return 0;
            case 89:
                int[] iArr49 = this.AudioAttributesImplApi21Parcelizer;
                int i108 = this.write;
                this.write = i108 + 1;
                iArr49[i108] = 55;
                return 0;
            case 90:
                int[] iArr50 = this.AudioAttributesImplApi21Parcelizer;
                int i109 = this.write;
                this.write = i109 + 1;
                iArr50[i109] = 11;
                return 0;
            case 91:
                int[] iArr51 = this.AudioAttributesImplApi21Parcelizer;
                int i110 = this.write;
                this.write = i110 + 1;
                iArr51[i110] = 0;
                return 0;
            case 92:
                int i111 = this.write;
                int i112 = i111 - 1;
                this.write = i112;
                int[] iArr52 = this.AudioAttributesImplApi21Parcelizer;
                iArr52[i111 - 2] = iArr52[i111 - 2] / iArr52[i112];
                return 0;
            case 93:
                int[] iArr53 = this.AudioAttributesImplApi21Parcelizer;
                int i113 = this.write;
                iArr53[i113] = 35;
                iArr53[i113 - 1] = iArr53[i113 - 1] + iArr53[i113];
                this.write = i113 + 1;
                iArr53[i113] = iArr53[i113 - 1];
                return 0;
            case 94:
                int[] iArr54 = this.AudioAttributesImplApi21Parcelizer;
                int i114 = this.write;
                this.write = i114 + 1;
                iArr54[i114] = 57;
                return 0;
            case 95:
                int[] iArr55 = this.AudioAttributesImplApi21Parcelizer;
                int i115 = this.write;
                this.write = i115 + 1;
                iArr55[i115] = 20;
                return 0;
            case 96:
                int[] iArr56 = this.AudioAttributesImplApi21Parcelizer;
                int i116 = this.write;
                this.write = i116 + 1;
                iArr56[i116] = 69;
                return 0;
            case 97:
                int[] iArr57 = this.AudioAttributesImplApi21Parcelizer;
                int i117 = this.write;
                this.write = i117 + 1;
                iArr57[i117] = 91;
                return 0;
            case 98:
                int[] iArr58 = this.AudioAttributesImplApi21Parcelizer;
                int i118 = this.write;
                this.write = i118 + 1;
                iArr58[i118] = 17;
                return 0;
            case 99:
                int[] iArr59 = this.AudioAttributesImplApi21Parcelizer;
                int i119 = this.write;
                this.write = i119 + 1;
                iArr59[i119] = 93;
                return 0;
            case 100:
                int[] iArr60 = this.AudioAttributesImplApi21Parcelizer;
                int i120 = this.write;
                this.write = i120 + 1;
                iArr60[i120] = 10;
                return 0;
            case 101:
                int[] iArr61 = this.AudioAttributesImplApi21Parcelizer;
                int i121 = this.write;
                this.write = i121 + 1;
                iArr61[i121] = 86;
                return 0;
            case 102:
                int i122 = this.write;
                int i123 = i122 - 1;
                Object[] objArr38 = this.MediaMetadataCompat;
                Object obj21 = objArr38[i123];
                objArr38[i123] = null;
                objArr38[9] = obj21;
                this.write = i122;
                objArr38[i123] = objArr38[7];
                return 0;
            case 103:
                int i124 = this.write;
                int i125 = i124 - 1;
                Object[] objArr39 = this.MediaMetadataCompat;
                Object obj22 = objArr39[i125];
                objArr39[i125] = null;
                objArr39[8] = obj22;
                int i126 = i124 - 2;
                this.write = i126;
                Object obj23 = objArr39[i126];
                objArr39[i126] = null;
                objArr39[7] = obj23;
                return 0;
            case 104:
                Object[] objArr40 = this.MediaMetadataCompat;
                int i127 = this.write;
                this.write = i127 + 1;
                objArr40[i127] = objArr40[8];
                return 0;
            case 105:
                int i128 = this.write - 1;
                this.write = i128;
                Object[] objArr41 = this.MediaMetadataCompat;
                Object obj24 = objArr41[i128];
                objArr41[i128] = null;
                this.AudioAttributesCompatParcelizer = obj24 != null ? 0 : 1;
                return 0;
            case 106:
                int[] iArr62 = this.AudioAttributesImplApi21Parcelizer;
                int i129 = this.write;
                iArr62[i129] = 119;
                this.write = i129;
                iArr62[i129 - 1] = iArr62[i129 - 1] + iArr62[i129];
                return 0;
            case 107:
                int[] iArr63 = this.AudioAttributesImplApi21Parcelizer;
                int i130 = this.write;
                this.write = i130 + 1;
                iArr63[i130] = 83;
                return 0;
            case 108:
                int[] iArr64 = this.AudioAttributesImplApi21Parcelizer;
                int i131 = this.write;
                this.write = i131 + 1;
                iArr64[i131] = 25;
                return 0;
            case 109:
                int i132 = this.write;
                int i133 = i132 - 1;
                Object[] objArr42 = this.MediaMetadataCompat;
                objArr42[i133] = null;
                this.write = i132;
                objArr42[i133] = objArr42[9];
                return 0;
            case 110:
                int[] iArr65 = this.AudioAttributesImplApi21Parcelizer;
                int i134 = this.write;
                this.write = i134 + 1;
                iArr65[i134] = 28;
                return 0;
            case 111:
                int[] iArr66 = this.AudioAttributesImplApi21Parcelizer;
                int i135 = this.write;
                this.write = i135 + 1;
                iArr66[i135] = 94;
                return 0;
            case 112:
                Object[] objArr43 = this.MediaMetadataCompat;
                int i136 = this.write;
                objArr43[i136] = null;
                this.write = i136 + 2;
                objArr43[i136 + 1] = null;
                return 0;
            case 113:
                int[] iArr67 = this.AudioAttributesImplApi21Parcelizer;
                int i137 = this.write;
                iArr67[i137] = 99;
                iArr67[i137 - 1] = iArr67[i137 - 1] + iArr67[i137];
                this.write = i137 + 1;
                iArr67[i137] = iArr67[i137 - 1];
                return 0;
            default:
                return i;
        }
    }

    public MergingMediaPeriodForwardingTrackSelection() {
        this.AudioAttributesImplApi21Parcelizer = new int[13];
        this.MediaBrowserCompatCustomActionResultReceiver = new long[13];
        this.AudioAttributesImplApi26Parcelizer = new float[13];
        this.AudioAttributesImplBaseParcelizer = new double[13];
        this.MediaMetadataCompat = new Object[13];
        this.write = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }
}
