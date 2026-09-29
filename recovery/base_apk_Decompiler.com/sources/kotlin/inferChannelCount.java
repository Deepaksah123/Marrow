package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class inferChannelCount {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final float[] MediaDescriptionCompat;
    private final Object[] MediaMetadataCompat;
    private final double[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public Object write;

    public inferChannelCount(Object obj) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[22];
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaDescriptionCompat = new float[22];
        this.RatingCompat = new double[22];
        Object[] objArr = new Object[22];
        this.MediaMetadataCompat = objArr;
        objArr[5] = obj;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                int i2 = this.MediaBrowserCompatItemReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = i2;
                this.AudioAttributesImplApi21Parcelizer = i2;
                return 0;
            case 2:
                Object[] objArr = this.MediaMetadataCompat;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.AudioAttributesImplApi26Parcelizer = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i4 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i4 + 1;
                objArr2[i4] = this.write;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i5 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i5 + 1;
                objArr3[i5] = objArr3[5];
                return 0;
            case 5:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                this.read = iArr[i6];
                return 0;
            case 6:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i7 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i7 + 1;
                iArr2[i7] = 1;
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i8 = this.MediaBrowserCompatItemReceiver;
                iArr3[i8] = 2;
                this.MediaBrowserCompatItemReceiver = i8 + 2;
                iArr3[i8 + 1] = 2;
                return 0;
            case 8:
                int i9 = this.MediaBrowserCompatItemReceiver;
                int i10 = i9 - 1;
                this.MediaBrowserCompatItemReceiver = i10;
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i9 - 2] = iArr4[i9 - 2] % iArr4[i10];
                return 0;
            case 9:
                int i11 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i11;
                this.MediaMetadataCompat[i11] = null;
                return 0;
            case 11:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i12 + 1;
                iArr5[i12] = this.AudioAttributesCompatParcelizer;
            case 10:
                return 0;
            case 12:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = this.MediaBrowserCompatItemReceiver;
                iArr6[i13] = 3;
                this.MediaBrowserCompatItemReceiver = i13;
                iArr6[i13 - 1] = iArr6[i13 - 1] + iArr6[i13];
                return 0;
            case 13:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = this.MediaBrowserCompatItemReceiver;
                iArr7[i14] = iArr7[i14 - 1];
                this.MediaBrowserCompatItemReceiver = i14 + 2;
                iArr7[i14 + 1] = 128;
                return 0;
            case 14:
                int i15 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i15;
                this.read = this.MediaBrowserCompatCustomActionResultReceiver[i15] != 0 ? 0 : 1;
                return 0;
            case 15:
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i16 = this.MediaBrowserCompatItemReceiver;
                iArr8[i16] = 2;
                this.MediaBrowserCompatItemReceiver = i16;
                iArr8[i16 - 1] = iArr8[i16 - 1] % iArr8[i16];
                return 0;
            case 16:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i17 = this.MediaBrowserCompatItemReceiver;
                iArr9[i17] = 123;
                iArr9[i17 - 1] = iArr9[i17 - 1] + iArr9[i17];
                this.MediaBrowserCompatItemReceiver = i17 + 1;
                iArr9[i17] = iArr9[i17 - 1];
                return 0;
            case 17:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i18 = this.MediaBrowserCompatItemReceiver;
                iArr10[i18] = 128;
                this.MediaBrowserCompatItemReceiver = i18;
                iArr10[i18 - 1] = iArr10[i18 - 1] % iArr10[i18];
                return 0;
            case 18:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i19 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i19 + 1;
                iArr11[i19] = 2;
                return 0;
            case 19:
                Object[] objArr4 = this.MediaMetadataCompat;
                int i20 = this.MediaBrowserCompatItemReceiver;
                Object obj2 = objArr4[i20 - 1];
                objArr4[i20 - 1] = null;
                this.AudioAttributesImplApi26Parcelizer = obj2;
                return 0;
            case 20:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i21 = this.MediaBrowserCompatItemReceiver;
                iArr12[i21] = 82;
                iArr12[i21 + 1] = 0;
                int i22 = i21 + 1;
                this.MediaBrowserCompatItemReceiver = i22;
                iArr12[i21] = iArr12[i21] / iArr12[i22];
                return 0;
            case 21:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i23;
                this.read = iArr13[i23];
                return 0;
            case 22:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i24 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i24 + 1;
                iArr14[i24] = 60;
                return 0;
            case 23:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                iArr15[i25] = 54;
                return 0;
            case 24:
                for (int i26 = this.MediaBrowserCompatItemReceiver - 1; i26 >= 0; i26--) {
                    this.MediaMetadataCompat[i26] = null;
                }
                Object[] objArr5 = this.MediaMetadataCompat;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr5[0] = this.write;
                return 0;
            case 25:
                int i27 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i27;
                Object[] objArr6 = this.MediaMetadataCompat;
                Object obj3 = objArr6[i27];
                objArr6[i27] = null;
                this.read = obj3 == null ? 0 : 1;
                return 0;
            case 26:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i28 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i28 + 1;
                objArr7[i28] = objArr7[7];
                return 0;
            case 27:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i29 = this.MediaBrowserCompatItemReceiver;
                objArr8[i29] = objArr8[7];
                this.MediaBrowserCompatItemReceiver = i29 + 2;
                objArr8[i29 + 1] = objArr8[i29];
                return 0;
            case 28:
                int i30 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i30;
                Object[] objArr9 = this.MediaMetadataCompat;
                Object obj4 = objArr9[i30];
                objArr9[i30] = null;
                objArr9[7] = obj4;
                return 0;
            case 29:
                int i31 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i31;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj5 = objArr10[i31];
                objArr10[i31] = null;
                this.read = obj5 != null ? 0 : 1;
                return 0;
            case 30:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i32 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i32 + 1;
                objArr11[i32] = objArr11[6];
                return 0;
            case 31:
                int i33 = this.MediaBrowserCompatItemReceiver;
                int i34 = i33 - 1;
                Object[] objArr12 = this.MediaMetadataCompat;
                Object obj6 = objArr12[i34];
                objArr12[i34] = null;
                objArr12[7] = obj6;
                this.MediaBrowserCompatItemReceiver = i33;
                objArr12[i34] = objArr12[5];
                return 0;
            case 32:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i35 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i35 + 1;
                iArr16[i35] = 119;
                return 0;
            case 33:
                int i36 = this.MediaBrowserCompatItemReceiver;
                int i37 = i36 - 1;
                this.MediaBrowserCompatItemReceiver = i37;
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i36 - 2] = iArr17[i36 - 2] + iArr17[i37];
                return 0;
            case 34:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i38 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i38 + 1;
                iArr18[i38] = iArr18[i38 - 1];
                return 0;
            case 35:
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i39 = this.MediaBrowserCompatItemReceiver;
                iArr19[i39] = 93;
                this.MediaBrowserCompatItemReceiver = i39;
                iArr19[i39 - 1] = iArr19[i39 - 1] + iArr19[i39];
                return 0;
            case 36:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i40 = this.MediaBrowserCompatItemReceiver;
                iArr20[i40] = iArr20[i40 - 1];
                iArr20[i40 + 1] = 128;
                int i41 = i40 + 1;
                this.MediaBrowserCompatItemReceiver = i41;
                iArr20[i40] = iArr20[i40] % iArr20[i41];
                return 0;
            case 37:
                int i42 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i42;
                this.read = this.MediaBrowserCompatCustomActionResultReceiver[i42] == 0 ? 0 : 1;
                return 0;
            case 38:
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i43 = this.MediaBrowserCompatItemReceiver;
                iArr21[i43] = 115;
                this.MediaBrowserCompatItemReceiver = i43;
                iArr21[i43 - 1] = iArr21[i43 - 1] + iArr21[i43];
                return 0;
            case 39:
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i44 + 1;
                iArr22[i44] = 27;
                return 0;
            case 40:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i45 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i45 + 1;
                iArr23[i45] = 71;
                return 0;
            case 41:
                Object[] objArr13 = this.MediaMetadataCompat;
                int i46 = this.MediaBrowserCompatItemReceiver;
                objArr13[i46] = objArr13[5];
                this.MediaBrowserCompatItemReceiver = i46 + 2;
                objArr13[i46 + 1] = objArr13[7];
                return 0;
            case 42:
                Object[] objArr14 = this.MediaMetadataCompat;
                int i47 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i47 + 1;
                objArr14[i47] = objArr14[8];
                return 0;
            case 43:
                int i48 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i48;
                Object[] objArr15 = this.MediaMetadataCompat;
                Object obj7 = objArr15[i48];
                objArr15[i48] = null;
                objArr15[10] = obj7;
                return 0;
            case 44:
                int i49 = this.MediaBrowserCompatItemReceiver;
                int i50 = i49 - 1;
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr24[9] = iArr24[i50];
                Object[] objArr16 = this.MediaMetadataCompat;
                this.MediaBrowserCompatItemReceiver = i49;
                objArr16[i50] = objArr16[10];
                return 0;
            case 45:
                Object[] objArr17 = this.MediaMetadataCompat;
                int i51 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i51 + 1;
                objArr17[i51] = objArr17[10];
                return 0;
            case 46:
                int i52 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i52;
                Object[] objArr18 = this.MediaMetadataCompat;
                Object obj8 = objArr18[i52];
                objArr18[i52] = null;
                objArr18[8] = obj8;
                return 0;
            case 47:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i53 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i53 + 1;
                iArr25[i53] = 0;
                return 0;
            case 48:
                int i54 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i54;
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr26[9] = iArr26[i54];
                return 0;
            case 49:
                Object[] objArr19 = this.MediaMetadataCompat;
                int i55 = this.MediaBrowserCompatItemReceiver;
                objArr19[i55] = objArr19[8];
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatItemReceiver = i55 + 2;
                iArr27[i55 + 1] = iArr27[9];
                return 0;
            case 50:
                int i56 = this.MediaBrowserCompatItemReceiver;
                int i57 = i56 - 1;
                this.MediaBrowserCompatItemReceiver = i57;
                int[] iArr28 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr28[i56 - 2] = iArr28[i56 - 2] % iArr28[i57];
                int i58 = i56 - 2;
                this.MediaBrowserCompatItemReceiver = i58;
                this.MediaMetadataCompat[i58] = null;
                return 0;
            case 51:
                int[] iArr29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i59 = this.MediaBrowserCompatItemReceiver;
                iArr29[i59] = 1;
                this.MediaBrowserCompatItemReceiver = i59;
                iArr29[i59 - 1] = iArr29[i59 - 1] + iArr29[i59];
                return 0;
            case 52:
                int[] iArr30 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i60 = this.MediaBrowserCompatItemReceiver;
                iArr30[i60] = 7;
                this.MediaBrowserCompatItemReceiver = i60;
                iArr30[i60 - 1] = iArr30[i60 - 1] + iArr30[i60];
                return 0;
            case 53:
                int[] iArr31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i61 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i61 + 1;
                iArr31[i61] = 59;
                return 0;
            case 54:
                int i62 = this.MediaBrowserCompatItemReceiver;
                int i63 = i62 - 1;
                int[] iArr32 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr32[i62 - 2] = iArr32[i62 - 2] + iArr32[i63];
                iArr32[i63] = iArr32[i62 - 2];
                this.MediaBrowserCompatItemReceiver = i62 + 1;
                iArr32[i62] = 128;
                return 0;
            case 55:
                int[] iArr33 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i64 = this.MediaBrowserCompatItemReceiver;
                iArr33[i64] = 2;
                this.MediaBrowserCompatItemReceiver = i64 + 2;
                iArr33[i64 + 1] = 4;
                return 0;
            case 56:
                int i65 = this.MediaBrowserCompatItemReceiver;
                int[] iArr34 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr34[i65 - 2] = iArr34[i65 - 2] << iArr34[i65 - 1];
                int i66 = i65 - 2;
                this.MediaBrowserCompatItemReceiver = i66;
                this.MediaMetadataCompat[i66] = null;
                return 0;
            case 57:
                int[] iArr35 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i67 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i67 + 1;
                iArr35[i67] = 94;
                return 0;
            case 58:
                int[] iArr36 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i68 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i68 + 1;
                iArr36[i68] = 0;
                return 0;
            case 59:
                this.read = this.MediaBrowserCompatCustomActionResultReceiver[this.MediaBrowserCompatItemReceiver - 1];
                return 0;
            case 60:
                int[] iArr37 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i69 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i69 + 1;
                iArr37[i69] = 113;
                return 0;
            case 61:
                int i70 = this.MediaBrowserCompatItemReceiver;
                int i71 = i70 - 1;
                int[] iArr38 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr38[i70 - 2] = iArr38[i70 - 2] + iArr38[i71];
                this.MediaBrowserCompatItemReceiver = i70;
                iArr38[i71] = iArr38[i70 - 2];
                return 0;
            case 62:
                int[] iArr39 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i72 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i72 + 1;
                iArr39[i72] = 128;
                return 0;
            case 63:
                int[] iArr40 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i73 = this.MediaBrowserCompatItemReceiver;
                iArr40[i73] = 67;
                iArr40[i73 - 1] = iArr40[i73 - 1] + iArr40[i73];
                this.MediaBrowserCompatItemReceiver = i73 + 1;
                iArr40[i73] = iArr40[i73 - 1];
                return 0;
            case 64:
                int[] iArr41 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i74 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i74 + 1;
                iArr41[i74] = 4;
                return 0;
            case 65:
                int[] iArr42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i75 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i75 + 1;
                iArr42[i75] = 65;
                return 0;
            case 66:
                int[] iArr43 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i76 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i76 + 1;
                iArr43[i76] = 89;
                return 0;
            case 67:
                int[] iArr44 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i77 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i77 + 1;
                iArr44[i77] = 79;
                return 0;
            case 68:
                int[] iArr45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i78 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i78 + 1;
                iArr45[i78] = 99;
                return 0;
            case 69:
                Object[] objArr20 = this.MediaMetadataCompat;
                int i79 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i79 + 1;
                objArr20[i79] = null;
                int[] iArr46 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj9 = objArr20[i79];
                objArr20[i79] = null;
                iArr46[i79] = ((int[]) obj9).length;
                this.MediaBrowserCompatItemReceiver = i79;
                objArr20[i79] = null;
                return 0;
            case 70:
                Object[] objArr21 = this.MediaMetadataCompat;
                int i80 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i80 + 1;
                objArr21[i80] = null;
                return 0;
            case 71:
                Object[] objArr22 = this.MediaMetadataCompat;
                int i81 = this.MediaBrowserCompatItemReceiver;
                objArr22[i81] = objArr22[6];
                this.MediaBrowserCompatItemReceiver = i81 + 2;
                objArr22[i81 + 1] = objArr22[7];
                return 0;
            case 72:
                int i82 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i82;
                Object[] objArr23 = this.MediaMetadataCompat;
                Object obj10 = objArr23[i82];
                objArr23[i82] = null;
                objArr23[6] = obj10;
                return 0;
            case 73:
                int[] iArr47 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i83 = this.MediaBrowserCompatItemReceiver;
                iArr47[i83] = 85;
                this.MediaBrowserCompatItemReceiver = i83;
                iArr47[i83 - 1] = iArr47[i83 - 1] + iArr47[i83];
                return 0;
            case 74:
                int[] iArr48 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i84 = this.MediaBrowserCompatItemReceiver;
                iArr48[i84] = 81;
                iArr48[i84 - 1] = iArr48[i84 - 1] + iArr48[i84];
                this.MediaBrowserCompatItemReceiver = i84 + 1;
                iArr48[i84] = iArr48[i84 - 1];
                return 0;
            case 75:
                int i85 = this.MediaBrowserCompatItemReceiver;
                int i86 = i85 - 1;
                Object[] objArr24 = this.MediaMetadataCompat;
                Object obj11 = objArr24[i86];
                objArr24[i86] = null;
                objArr24[7] = obj11;
                this.MediaBrowserCompatItemReceiver = i85;
                objArr24[i86] = objArr24[6];
                return 0;
            case 76:
                int i87 = this.MediaBrowserCompatItemReceiver;
                int i88 = i87 - 1;
                Object[] objArr25 = this.MediaMetadataCompat;
                Object obj12 = objArr25[i88];
                objArr25[i88] = null;
                objArr25[9] = obj12;
                this.MediaBrowserCompatItemReceiver = i87;
                objArr25[i88] = objArr25[6];
                return 0;
            case 77:
                Object[] objArr26 = this.MediaMetadataCompat;
                int i89 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i89 + 1;
                objArr26[i89] = objArr26[9];
                return 0;
            case 78:
                int i90 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i90;
                Object[] objArr27 = this.MediaMetadataCompat;
                Object obj13 = objArr27[i90];
                objArr27[i90] = null;
                objArr27[9] = obj13;
                return 0;
            case 79:
                this.MediaMetadataCompat[10] = this.write;
                return 0;
            case 80:
                Object[] objArr28 = this.MediaMetadataCompat;
                int i91 = this.MediaBrowserCompatItemReceiver;
                objArr28[i91] = objArr28[5];
                objArr28[i91 + 1] = objArr28[6];
                this.MediaBrowserCompatItemReceiver = i91 + 3;
                objArr28[i91 + 2] = objArr28[10];
                return 0;
            case 81:
                Object[] objArr29 = this.MediaMetadataCompat;
                int i92 = this.MediaBrowserCompatItemReceiver;
                objArr29[i92] = objArr29[10];
                this.MediaBrowserCompatItemReceiver = i92 + 2;
                objArr29[i92 + 1] = objArr29[9];
                return 0;
            case 82:
                int i93 = this.MediaBrowserCompatItemReceiver;
                int i94 = i93 - 1;
                Object[] objArr30 = this.MediaMetadataCompat;
                Object obj14 = objArr30[i94];
                objArr30[i94] = null;
                objArr30[6] = obj14;
                this.MediaBrowserCompatItemReceiver = i93;
                objArr30[i94] = objArr30[5];
                return 0;
            case 83:
                int[] iArr49 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i95 = this.MediaBrowserCompatItemReceiver;
                iArr49[i95] = 2;
                this.MediaBrowserCompatItemReceiver = i95;
                iArr49[i95 - 1] = iArr49[i95 - 1] % iArr49[i95];
                int i96 = i95 - 1;
                this.MediaBrowserCompatItemReceiver = i96;
                this.MediaMetadataCompat[i96] = null;
                return 0;
            case 84:
                int[] iArr50 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i97 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i97 + 1;
                iArr50[i97] = 125;
                return 0;
            case 85:
                int[] iArr51 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i98 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i98 + 1;
                iArr51[i98] = 13;
                return 0;
            case 86:
                int[] iArr52 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i99 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i99 + 1;
                iArr52[i99] = 11;
                return 0;
            case 87:
                int[] iArr53 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i100 + 1;
                iArr53[i100] = 25;
                return 0;
            case 88:
                int i101 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i101;
                Object[] objArr31 = this.MediaMetadataCompat;
                Object obj15 = objArr31[i101];
                objArr31[i101] = null;
                objArr31[14] = obj15;
                return 0;
            case 89:
                Object[] objArr32 = this.MediaMetadataCompat;
                int i102 = this.MediaBrowserCompatItemReceiver;
                objArr32[i102] = objArr32[6];
                this.MediaBrowserCompatItemReceiver = i102 + 2;
                objArr32[i102 + 1] = objArr32[14];
                return 0;
            case 90:
                int i103 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i103;
                Object[] objArr33 = this.MediaMetadataCompat;
                Object obj16 = objArr33[i103];
                objArr33[i103] = null;
                objArr33[15] = obj16;
                return 0;
            case 91:
                int i104 = this.MediaBrowserCompatItemReceiver;
                int i105 = i104 - 2;
                this.MediaBrowserCompatItemReceiver = i105;
                int[] iArr54 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.read = iArr54[i105] >= iArr54[i104 - 1] ? 0 : 1;
                return 0;
            case 92:
                int[] iArr55 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i106 = this.MediaBrowserCompatItemReceiver;
                iArr55[i106] = iArr55[8];
                this.MediaBrowserCompatItemReceiver = i106 + 2;
                iArr55[i106 + 1] = 3;
                return 0;
            case 93:
                Object[] objArr34 = this.MediaMetadataCompat;
                int i107 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i107 + 1;
                objArr34[i107] = objArr34[15];
                return 0;
            case 94:
                Object[] objArr35 = this.MediaMetadataCompat;
                int i108 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i108 + 1;
                objArr35[i108] = objArr35[i108 - 1];
                return 0;
            case 95:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i109 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i109 + 1;
                jArr[i109] = this.RemoteActionCompatParcelizer;
                return 0;
            case 96:
                Object[] objArr36 = this.MediaMetadataCompat;
                int i110 = this.MediaBrowserCompatItemReceiver;
                objArr36[i110] = objArr36[i110 - 1];
                this.MediaBrowserCompatItemReceiver = i110;
                Object obj17 = objArr36[i110];
                objArr36[i110] = null;
                objArr36[16] = obj17;
                return 0;
            case 97:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i111 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i111 + 1;
                this.IconCompatParcelizer = jArr2[i111];
                return 0;
            case 98:
                int i112 = this.MediaBrowserCompatItemReceiver;
                int i113 = i112 - 1;
                Object[] objArr37 = this.MediaMetadataCompat;
                objArr37[i113] = null;
                this.MediaBrowserCompatItemReceiver = i112;
                objArr37[i113] = objArr37[16];
                return 0;
            case 99:
                int i114 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i114;
                Object[] objArr38 = this.MediaMetadataCompat;
                Object obj18 = objArr38[i114];
                objArr38[i114] = null;
                objArr38[17] = obj18;
                return 0;
            case 100:
                int i115 = this.MediaBrowserCompatItemReceiver;
                int i116 = i115 - 1;
                Object[] objArr39 = this.MediaMetadataCompat;
                Object obj19 = objArr39[i116];
                objArr39[i116] = null;
                objArr39[16] = obj19;
                this.MediaBrowserCompatItemReceiver = i115;
                objArr39[i116] = objArr39[14];
                return 0;
            case 101:
                int i117 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i117;
                Object[] objArr40 = this.MediaMetadataCompat;
                Object obj20 = objArr40[i117];
                objArr40[i117] = null;
                objArr40[18] = obj20;
                return 0;
            case 102:
                Object[] objArr41 = this.MediaMetadataCompat;
                int i118 = this.MediaBrowserCompatItemReceiver;
                objArr41[i118] = objArr41[16];
                this.MediaBrowserCompatItemReceiver = i118;
                Object obj21 = objArr41[i118];
                objArr41[i118] = null;
                objArr41[14] = obj21;
                return 0;
            case 103:
                Object[] objArr42 = this.MediaMetadataCompat;
                int i119 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i119 + 1;
                objArr42[i119] = objArr42[18];
                return 0;
            case 104:
                Object[] objArr43 = this.MediaMetadataCompat;
                int i120 = this.MediaBrowserCompatItemReceiver;
                objArr43[i120] = objArr43[18];
                this.MediaBrowserCompatItemReceiver = i120 + 2;
                objArr43[i120 + 1] = objArr43[16];
                return 0;
            case 105:
                Object[] objArr44 = this.MediaMetadataCompat;
                int i121 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i121 + 1;
                objArr44[i121] = objArr44[17];
                return 0;
            case 106:
                Object[] objArr45 = this.MediaMetadataCompat;
                int i122 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i122 + 1;
                objArr45[i122] = objArr45[14];
                return 0;
            case 107:
                this.MediaMetadataCompat[19] = this.write;
                return 0;
            case 108:
                Object[] objArr46 = this.MediaMetadataCompat;
                int i123 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i123 + 1;
                objArr46[i123] = objArr46[19];
                return 0;
            case 109:
                int i124 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i124;
                int[] iArr56 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr56[11] = iArr56[i124];
                return 0;
            case 110:
                int i125 = this.MediaBrowserCompatItemReceiver;
                int i126 = i125 - 1;
                Object[] objArr47 = this.MediaMetadataCompat;
                Object obj22 = objArr47[i126];
                objArr47[i126] = null;
                objArr47[18] = obj22;
                objArr47[i126] = objArr47[15];
                int i127 = i125 - 1;
                this.MediaBrowserCompatItemReceiver = i127;
                Object obj23 = objArr47[i127];
                objArr47[i127] = null;
                objArr47[16] = obj23;
                return 0;
            case 111:
                int[] iArr57 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i128 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i128 + 1;
                iArr57[i128] = iArr57[11];
                return 0;
            case 112:
                int i129 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i129;
                Object[] objArr48 = this.MediaMetadataCompat;
                Object obj24 = objArr48[i129];
                objArr48[i129] = null;
                objArr48[20] = obj24;
                return 0;
            case 113:
                Object[] objArr49 = this.MediaMetadataCompat;
                int i130 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i130 + 1;
                objArr49[i130] = objArr49[20];
                return 0;
            case 114:
                int i131 = this.MediaBrowserCompatItemReceiver;
                int i132 = i131 - 2;
                this.MediaBrowserCompatItemReceiver = i132;
                int[] iArr58 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.read = iArr58[i132] == iArr58[i131 - 1] ? 0 : 1;
                return 0;
            case 115:
                Object[] objArr50 = this.MediaMetadataCompat;
                int i133 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i133 + 1;
                objArr50[i133] = objArr50[16];
                return 0;
            case 116:
                Object[] objArr51 = this.MediaMetadataCompat;
                int i134 = this.MediaBrowserCompatItemReceiver;
                objArr51[i134] = null;
                this.MediaBrowserCompatItemReceiver = i134;
                Object obj25 = objArr51[i134];
                objArr51[i134] = null;
                objArr51[6] = obj25;
                return 0;
            case 117:
                Object[] objArr52 = this.MediaMetadataCompat;
                int i135 = this.MediaBrowserCompatItemReceiver;
                objArr52[i135] = objArr52[14];
                this.MediaBrowserCompatItemReceiver = i135 + 2;
                objArr52[i135 + 1] = objArr52[7];
                return 0;
            case 118:
                this.MediaMetadataCompat[6] = this.write;
                return 0;
            case 119:
                this.MediaMetadataCompat[7] = this.write;
                return 0;
            case 120:
                Object[] objArr53 = this.MediaMetadataCompat;
                int i136 = this.MediaBrowserCompatItemReceiver;
                objArr53[i136] = objArr53[7];
                this.MediaBrowserCompatItemReceiver = i136 + 2;
                objArr53[i136 + 1] = objArr53[6];
                return 0;
            case 121:
                int i137 = this.MediaBrowserCompatItemReceiver;
                int i138 = i137 - 1;
                Object[] objArr54 = this.MediaMetadataCompat;
                Object obj26 = objArr54[i138];
                objArr54[i138] = null;
                objArr54[6] = obj26;
                this.MediaBrowserCompatItemReceiver = i137;
                objArr54[i138] = null;
                return 0;
            case 122:
                int i139 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i139;
                int[] iArr59 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr59[10] = iArr59[i139];
                return 0;
            case 123:
                int[] iArr60 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i140 = this.MediaBrowserCompatItemReceiver;
                iArr60[i140] = iArr60[10];
                Object[] objArr55 = this.MediaMetadataCompat;
                this.MediaBrowserCompatItemReceiver = i140 + 2;
                objArr55[i140 + 1] = objArr55[17];
                return 0;
            case 124:
                int[] iArr61 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i141 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i141 + 1;
                iArr61[i141] = iArr61[10];
                return 0;
            case 125:
                int i142 = this.MediaBrowserCompatItemReceiver;
                int i143 = i142 - 2;
                this.MediaBrowserCompatItemReceiver = i143;
                int[] iArr62 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.read = iArr62[i143] != iArr62[i142 - 1] ? 0 : 1;
                return 0;
            case 126:
                int[] iArr63 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i144 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i144 + 1;
                iArr63[i144] = 1250;
                return 0;
            case 127:
                int i145 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i145;
                Object[] objArr56 = this.MediaMetadataCompat;
                Object obj27 = objArr56[i145];
                objArr56[i145] = null;
                objArr56[11] = obj27;
                return 0;
            case 128:
                int i146 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i146;
                Object[] objArr57 = this.MediaMetadataCompat;
                Object obj28 = objArr57[i146];
                objArr57[i146] = null;
                objArr57[19] = obj28;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                Object[] objArr58 = this.MediaMetadataCompat;
                int i147 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i147 + 1;
                objArr58[i147] = objArr58[11];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int i148 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i148;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[12] = jArr3[i148];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                this.MediaMetadataCompat[21] = this.write;
                return 0;
            case 132:
                Object[] objArr59 = this.MediaMetadataCompat;
                int i149 = this.MediaBrowserCompatItemReceiver;
                objArr59[i149] = objArr59[21];
                this.MediaBrowserCompatItemReceiver = i149 + 2;
                objArr59[i149 + 1] = objArr59[20];
                return 0;
            case 133:
                this.MediaMetadataCompat[20] = this.write;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                Object[] objArr60 = this.MediaMetadataCompat;
                int i150 = this.MediaBrowserCompatItemReceiver;
                objArr60[i150] = objArr60[20];
                this.MediaBrowserCompatItemReceiver = i150 + 2;
                objArr60[i150 + 1] = objArr60[7];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                int i151 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i151 + 1;
                jArr4[i151] = jArr4[12];
                return 0;
            case 136:
                this.MediaMetadataCompat[11] = this.write;
                return 0;
            case 137:
                Object[] objArr61 = this.MediaMetadataCompat;
                int i152 = this.MediaBrowserCompatItemReceiver;
                objArr61[i152] = objArr61[11];
                this.MediaBrowserCompatItemReceiver = i152 + 2;
                objArr61[i152 + 1] = objArr61[19];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr64 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i153 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i153 + 1;
                iArr64[i153] = iArr64[9];
                return 0;
            case 139:
                Object[] objArr62 = this.MediaMetadataCompat;
                int i154 = this.MediaBrowserCompatItemReceiver;
                objArr62[i154] = objArr62[20];
                this.MediaBrowserCompatItemReceiver = i154 + 2;
                objArr62[i154 + 1] = objArr62[17];
                return 0;
            case 140:
                Object[] objArr63 = this.MediaMetadataCompat;
                int i155 = this.MediaBrowserCompatItemReceiver;
                objArr63[i155] = objArr63[6];
                this.MediaBrowserCompatItemReceiver = i155 + 2;
                objArr63[i155 + 1] = objArr63[5];
                return 0;
            case 141:
                this.MediaMetadataCompat[17] = this.write;
                return 0;
            case 142:
                int[] iArr65 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i156 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i156 + 1;
                iArr65[i156] = 1203;
                return 0;
            case 143:
                Object[] objArr64 = this.MediaMetadataCompat;
                int i157 = this.MediaBrowserCompatItemReceiver;
                objArr64[i157] = objArr64[7];
                this.MediaBrowserCompatItemReceiver = i157 + 2;
                objArr64[i157 + 1] = objArr64[17];
                return 0;
            case 144:
                int i158 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i158;
                Object[] objArr65 = this.MediaMetadataCompat;
                Object obj29 = objArr65[i158];
                objArr65[i158] = null;
                objArr65[16] = obj29;
                return 0;
            case 145:
                int[] iArr66 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i159 = this.MediaBrowserCompatItemReceiver;
                iArr66[i159] = iArr66[9];
                this.MediaBrowserCompatItemReceiver = i159 + 2;
                iArr66[i159 + 1] = 1;
                return 0;
            case 146:
                Object[] objArr66 = this.MediaMetadataCompat;
                int i160 = this.MediaBrowserCompatItemReceiver;
                objArr66[i160] = objArr66[7];
                this.MediaBrowserCompatItemReceiver = i160;
                Object obj30 = objArr66[i160];
                objArr66[i160] = null;
                objArr66[16] = obj30;
                return 0;
            case 147:
                Object[] objArr67 = this.MediaMetadataCompat;
                int i161 = this.MediaBrowserCompatItemReceiver;
                objArr67[i161] = objArr67[19];
                this.MediaBrowserCompatItemReceiver = i161 + 2;
                objArr67[i161 + 1] = objArr67[16];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                this.MediaMetadataCompat[16] = this.write;
                return 0;
            case 149:
                Object[] objArr68 = this.MediaMetadataCompat;
                int i162 = this.MediaBrowserCompatItemReceiver;
                objArr68[i162] = objArr68[5];
                objArr68[i162 + 1] = objArr68[6];
                this.MediaBrowserCompatItemReceiver = i162 + 3;
                objArr68[i162 + 2] = objArr68[7];
                return 0;
            case 150:
                int[] iArr67 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i163 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i163 + 1;
                iArr67[i163] = iArr67[8];
                return 0;
            case 151:
                int[] iArr68 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i164 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i164 + 1;
                iArr68[i164] = 1309;
                return 0;
            case 152:
                Object[] objArr69 = this.MediaMetadataCompat;
                int i165 = this.MediaBrowserCompatItemReceiver;
                objArr69[i165] = objArr69[i165 - 1];
                this.MediaBrowserCompatItemReceiver = i165;
                Object obj31 = objArr69[i165];
                objArr69[i165] = null;
                objArr69[7] = obj31;
                return 0;
            case 153:
                int[] iArr69 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i166 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i166 + 1;
                iArr69[i166] = -44;
                return 0;
            case 154:
                int[] iArr70 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i167 = this.MediaBrowserCompatItemReceiver;
                iArr70[i167] = 2;
                iArr70[i167 + 1] = 2;
                int i168 = i167 + 1;
                this.MediaBrowserCompatItemReceiver = i168;
                iArr70[i167] = iArr70[i167] % iArr70[i168];
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr71 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i169 = this.MediaBrowserCompatItemReceiver;
                iArr71[i169] = 53;
                iArr71[i169 - 1] = iArr71[i169 - 1] + iArr71[i169];
                this.MediaBrowserCompatItemReceiver = i169 + 1;
                iArr71[i169] = iArr71[i169 - 1];
                return 0;
            case 156:
                int[] iArr72 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i170 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i170 + 1;
                iArr72[i170] = 83;
                return 0;
            case 157:
                int[] iArr73 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i171 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i171 + 1;
                iArr73[i171] = 31;
                return 0;
            case 158:
                int i172 = this.MediaBrowserCompatItemReceiver;
                int i173 = i172 - 1;
                Object[] objArr70 = this.MediaMetadataCompat;
                Object obj32 = objArr70[i173];
                objArr70[i173] = null;
                objArr70[15] = obj32;
                int[] iArr74 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr74[i173] = iArr74[8];
                this.MediaBrowserCompatItemReceiver = i172 + 1;
                iArr74[i172] = 2;
                return 0;
            case 159:
                int[] iArr75 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i174 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i174 + 1;
                iArr75[i174] = 5;
                return 0;
            case 160:
                int[] iArr76 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i175 = this.MediaBrowserCompatItemReceiver;
                Object[] objArr71 = this.MediaMetadataCompat;
                Object obj33 = objArr71[i175 - 1];
                objArr71[i175 - 1] = null;
                iArr76[i175 - 1] = ((int[]) obj33).length;
                int i176 = i175 - 1;
                this.MediaBrowserCompatItemReceiver = i176;
                objArr71[i176] = null;
                return 0;
            case 161:
                int[] iArr77 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i177 = this.MediaBrowserCompatItemReceiver;
                iArr77[i177] = 17;
                iArr77[i177 - 1] = iArr77[i177 - 1] + iArr77[i177];
                this.MediaBrowserCompatItemReceiver = i177 + 1;
                iArr77[i177] = iArr77[i177 - 1];
                return 0;
            case 162:
                int[] iArr78 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i178 = this.MediaBrowserCompatItemReceiver;
                iArr78[i178] = 21;
                this.MediaBrowserCompatItemReceiver = i178;
                iArr78[i178 - 1] = iArr78[i178 - 1] + iArr78[i178];
                return 0;
            case 163:
                int[] iArr79 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i179 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i179 + 1;
                iArr79[i179] = 21957;
                return 0;
            case 164:
                int[] iArr80 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i180 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i180 + 1;
                iArr80[i180] = 61;
                return 0;
            case 165:
                int[] iArr81 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i181 = this.MediaBrowserCompatItemReceiver;
                iArr81[i181] = 91;
                this.MediaBrowserCompatItemReceiver = i181;
                iArr81[i181 - 1] = iArr81[i181 - 1] + iArr81[i181];
                return 0;
            case 166:
                int[] iArr82 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i182 = this.MediaBrowserCompatItemReceiver;
                iArr82[i182] = 29;
                iArr82[i182 - 1] = iArr82[i182 - 1] + iArr82[i182];
                this.MediaBrowserCompatItemReceiver = i182 + 1;
                iArr82[i182] = iArr82[i182 - 1];
                return 0;
            case 167:
                int[] iArr83 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i183 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i183 + 1;
                iArr83[i183] = 62;
                return 0;
            case 168:
                int[] iArr84 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i184 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i184 + 1;
                iArr84[i184] = 15;
                return 0;
            case 169:
                int[] iArr85 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i185 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i185 + 1;
                iArr85[i185] = 51;
                return 0;
            case 170:
                int[] iArr86 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i186 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i186 + 1;
                iArr86[i186] = 49;
                return 0;
            case 171:
                Object[] objArr72 = this.MediaMetadataCompat;
                int i187 = this.MediaBrowserCompatItemReceiver;
                objArr72[i187] = objArr72[6];
                objArr72[i187 + 1] = objArr72[7];
                int[] iArr87 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatItemReceiver = i187 + 3;
                iArr87[i187 + 2] = 0;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr88 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i188 = this.MediaBrowserCompatItemReceiver;
                iArr88[i188] = 109;
                iArr88[i188 - 1] = iArr88[i188 - 1] + iArr88[i188];
                this.MediaBrowserCompatItemReceiver = i188 + 1;
                iArr88[i188] = iArr88[i188 - 1];
                return 0;
            default:
                return i;
        }
    }

    public inferChannelCount(Object obj, Object obj2, Object obj3) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[22];
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaDescriptionCompat = new float[22];
        this.RatingCompat = new double[22];
        Object[] objArr = new Object[22];
        this.MediaMetadataCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public inferChannelCount(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[22];
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaDescriptionCompat = new float[22];
        this.RatingCompat = new double[22];
        Object[] objArr = new Object[22];
        this.MediaMetadataCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public inferChannelCount(Object obj, Object obj2) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[22];
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaDescriptionCompat = new float[22];
        this.RatingCompat = new double[22];
        Object[] objArr = new Object[22];
        this.MediaMetadataCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public inferChannelCount(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[22];
        this.MediaBrowserCompatCustomActionResultReceiver = iArr;
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaDescriptionCompat = new float[22];
        this.RatingCompat = new double[22];
        Object[] objArr = new Object[22];
        this.MediaMetadataCompat = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        iArr[8] = i;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }
}
