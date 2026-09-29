package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public class getOwnerCategory {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    private final double[] MediaBrowserCompatSearchResultReceiver;
    private final float[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public long write;

    public getOwnerCategory(Object obj, Object obj2) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.AudioAttributesImplApi21Parcelizer = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaBrowserCompatSearchResultReceiver = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i2 = this.MediaBrowserCompatItemReceiver;
                objArr[i2] = objArr[9];
                this.MediaBrowserCompatItemReceiver = i2 + 2;
                objArr[i2 + 1] = objArr[10];
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatItemReceiver - this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = i3;
                this.AudioAttributesImplBaseParcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.AudioAttributesImplApi26Parcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i5 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i5 + 1;
                objArr3[i5] = this.IconCompatParcelizer;
                return 0;
            case 5:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = this.MediaBrowserCompatItemReceiver;
                iArr[i6] = 2;
                this.MediaBrowserCompatItemReceiver = i6 + 2;
                iArr[i6 + 1] = 2;
                return 0;
            case 6:
                int i7 = this.MediaBrowserCompatItemReceiver;
                int i8 = i7 - 1;
                this.MediaBrowserCompatItemReceiver = i8;
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.MediaBrowserCompatItemReceiver = i9;
                this.MediaBrowserCompatMediaItem[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                int i10 = this.MediaBrowserCompatItemReceiver;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.AudioAttributesImplApi26Parcelizer = obj2;
            case 7:
                return 0;
            case 9:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i11 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i11 + 1;
                iArr3[i11] = this.RemoteActionCompatParcelizer;
                return 0;
            case 10:
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.MediaBrowserCompatItemReceiver;
                iArr4[i12] = 103;
                this.MediaBrowserCompatItemReceiver = i12;
                iArr4[i12 - 1] = iArr4[i12 - 1] + iArr4[i12];
                return 0;
            case 11:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = this.MediaBrowserCompatItemReceiver;
                iArr5[i13] = iArr5[i13 - 1];
                this.MediaBrowserCompatItemReceiver = i13 + 2;
                iArr5[i13 + 1] = 128;
                return 0;
            case 12:
                int i14 = this.MediaBrowserCompatItemReceiver;
                int i15 = i14 - 1;
                this.MediaBrowserCompatItemReceiver = i15;
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr6[i14 - 2] = iArr6[i14 - 2] % iArr6[i15];
                return 0;
            case 13:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i16 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i16 + 1;
                this.AudioAttributesCompatParcelizer = iArr7[i16];
                return 0;
            case 14:
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i17 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i17 + 1;
                iArr8[i17] = 2;
                return 0;
            case 15:
                int i18 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i18;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i18] != 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i19 = this.MediaBrowserCompatItemReceiver;
                iArr9[i19] = 19;
                this.MediaBrowserCompatItemReceiver = i19;
                iArr9[i19 - 1] = iArr9[i19 - 1] + iArr9[i19];
                return 0;
            case 17:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i20 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i20 + 1;
                iArr10[i20] = iArr10[i20 - 1];
                return 0;
            case 18:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i21 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i21 + 1;
                iArr11[i21] = 128;
                return 0;
            case 19:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i22 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i22 + 1;
                objArr5[i22] = null;
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj3 = objArr5[i22];
                objArr5[i22] = null;
                iArr12[i22] = ((int[]) obj3).length;
                return 0;
            case 20:
                int i23 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i23;
                this.MediaBrowserCompatMediaItem[i23] = null;
                return 0;
            case 21:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i24 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i24;
                this.AudioAttributesCompatParcelizer = iArr13[i24];
                return 0;
            case 22:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                iArr14[i25] = 4;
                return 0;
            case 23:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i26 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i26 + 1;
                iArr15[i26] = 38;
                return 0;
            case 24:
                for (int i27 = this.MediaBrowserCompatItemReceiver - 1; i27 >= 0; i27--) {
                    this.MediaBrowserCompatMediaItem[i27] = null;
                }
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr6[0] = this.IconCompatParcelizer;
                return 0;
            case 25:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i28 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i28 + 1;
                objArr7[i28] = objArr7[9];
                return 0;
            case 26:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i29 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i29 + 1;
                objArr8[i29] = objArr8[10];
                return 0;
            case 27:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i30 = this.MediaBrowserCompatItemReceiver;
                iArr16[i30] = 109;
                iArr16[i30 - 1] = iArr16[i30 - 1] + iArr16[i30];
                this.MediaBrowserCompatItemReceiver = i30 + 1;
                iArr16[i30] = iArr16[i30 - 1];
                return 0;
            case 28:
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i31 = this.MediaBrowserCompatItemReceiver;
                iArr17[i31] = 128;
                this.MediaBrowserCompatItemReceiver = i31;
                iArr17[i31 - 1] = iArr17[i31 - 1] % iArr17[i31];
                return 0;
            case 29:
                int i32 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i32;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i32] == 0 ? 0 : 1;
                return 0;
            case 30:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i33 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i33 + 1;
                iArr18[i33] = 77;
                return 0;
            case 31:
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i34 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i34 + 1;
                iArr19[i34] = 0;
                return 0;
            case 32:
                int i35 = this.MediaBrowserCompatItemReceiver;
                int i36 = i35 - 1;
                this.MediaBrowserCompatItemReceiver = i36;
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr20[i35 - 2] = iArr20[i35 - 2] / iArr20[i36];
                int i37 = i35 - 2;
                this.MediaBrowserCompatItemReceiver = i37;
                this.MediaBrowserCompatMediaItem[i37] = null;
                return 0;
            case 33:
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i38 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i38 + 1;
                iArr21[i38] = 45;
                return 0;
            case 34:
                int i39 = this.MediaBrowserCompatItemReceiver;
                int i40 = i39 - 1;
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr22[i39 - 2] = iArr22[i39 - 2] + iArr22[i40];
                iArr22[i40] = iArr22[i39 - 2];
                this.MediaBrowserCompatItemReceiver = i39 + 1;
                iArr22[i39] = 128;
                return 0;
            case 35:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i41 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i41 + 1;
                iArr23[i41] = 1;
                return 0;
            case 36:
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i42 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i42 + 1;
                iArr24[i42] = 0;
                return 0;
            case 37:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i43 = this.MediaBrowserCompatItemReceiver;
                iArr25[i43] = 2;
                this.MediaBrowserCompatItemReceiver = i43;
                iArr25[i43 - 1] = iArr25[i43 - 1] % iArr25[i43];
                return 0;
            case 38:
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[this.MediaBrowserCompatItemReceiver - 1];
                return 0;
            case 39:
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i44 + 1;
                iArr26[i44] = 71;
                return 0;
            case 40:
                int i45 = this.MediaBrowserCompatItemReceiver;
                int i46 = i45 - 1;
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr27[i45 - 2] = iArr27[i45 - 2] + iArr27[i46];
                this.MediaBrowserCompatItemReceiver = i45;
                iArr27[i46] = iArr27[i45 - 2];
                return 0;
            case 41:
                int[] iArr28 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i47 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i47 + 1;
                iArr28[i47] = 105;
                return 0;
            case 42:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i48 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i48 + 1;
                objArr9[i48] = objArr9[11];
                return 0;
            case 43:
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                int i49 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i49 + 1;
                objArr10[i49] = objArr10[12];
                return 0;
            case 44:
                int[] iArr29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i50 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i50 + 1;
                iArr29[i50] = 33;
                return 0;
            case 45:
                int i51 = this.MediaBrowserCompatItemReceiver;
                int i52 = i51 - 1;
                this.MediaBrowserCompatItemReceiver = i52;
                int[] iArr30 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr30[i51 - 2] = iArr30[i51 - 2] + iArr30[i52];
                return 0;
            case 46:
                int[] iArr31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i53 = this.MediaBrowserCompatItemReceiver;
                iArr31[i53] = 21;
                iArr31[i53 - 1] = iArr31[i53 - 1] + iArr31[i53];
                this.MediaBrowserCompatItemReceiver = i53 + 1;
                iArr31[i53] = iArr31[i53 - 1];
                return 0;
            case 47:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i54 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i54 + 1;
                objArr11[i54] = objArr11[i54 - 1];
                return 0;
            case 48:
                int i55 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i55;
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                Object obj4 = objArr12[i55];
                objArr12[i55] = null;
                objArr12[10] = obj4;
                return 0;
            case 49:
                int[] iArr32 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i56 = this.MediaBrowserCompatItemReceiver;
                iArr32[i56] = 91;
                this.MediaBrowserCompatItemReceiver = i56;
                iArr32[i56 - 1] = iArr32[i56 - 1] + iArr32[i56];
                return 0;
            case 50:
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                int i57 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i57 + 1;
                objArr13[i57] = null;
                return 0;
            case 51:
                int[] iArr33 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i58 = this.MediaBrowserCompatItemReceiver;
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                Object obj5 = objArr14[i58 - 1];
                objArr14[i58 - 1] = null;
                iArr33[i58 - 1] = ((int[]) obj5).length;
                int i59 = i58 - 1;
                this.MediaBrowserCompatItemReceiver = i59;
                objArr14[i59] = null;
                return 0;
            case 52:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i60 = this.MediaBrowserCompatItemReceiver;
                objArr15[i60] = objArr15[9];
                this.MediaBrowserCompatItemReceiver = i60 + 2;
                objArr15[i60 + 1] = objArr15[9];
                return 0;
            case 53:
                int i61 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i61;
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                Object obj6 = objArr16[i61];
                objArr16[i61] = null;
                objArr16[11] = obj6;
                return 0;
            case 54:
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                int i62 = this.MediaBrowserCompatItemReceiver;
                objArr17[i62] = objArr17[11];
                this.MediaBrowserCompatItemReceiver = i62 + 2;
                objArr17[i62 + 1] = objArr17[9];
                return 0;
            case 55:
                int i63 = this.MediaBrowserCompatItemReceiver;
                int i64 = i63 - 1;
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr18[i64];
                objArr18[i64] = null;
                objArr18[13] = obj7;
                this.MediaBrowserCompatItemReceiver = i63;
                objArr18[i64] = objArr18[9];
                return 0;
            case 56:
                int i65 = this.MediaBrowserCompatItemReceiver;
                int i66 = i65 - 1;
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                Object obj8 = objArr19[i66];
                objArr19[i66] = null;
                objArr19[11] = obj8;
                this.MediaBrowserCompatItemReceiver = i65;
                objArr19[i66] = objArr19[9];
                return 0;
            case 57:
                int i67 = this.MediaBrowserCompatItemReceiver;
                int i68 = i67 - 1;
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                Object obj9 = objArr20[i68];
                objArr20[i68] = null;
                objArr20[12] = obj9;
                this.MediaBrowserCompatItemReceiver = i67;
                objArr20[i68] = objArr20[9];
                return 0;
            case 58:
                int i69 = this.MediaBrowserCompatItemReceiver;
                int i70 = i69 - 1;
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                Object obj10 = objArr21[i70];
                objArr21[i70] = null;
                objArr21[14] = obj10;
                this.MediaBrowserCompatItemReceiver = i69;
                objArr21[i70] = objArr21[11];
                return 0;
            case 59:
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                int i71 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i71 + 1;
                objArr22[i71] = objArr22[14];
                return 0;
            case 60:
                int i72 = this.MediaBrowserCompatItemReceiver;
                int i73 = i72 - 1;
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                Object obj11 = objArr23[i73];
                objArr23[i73] = null;
                objArr23[14] = obj11;
                this.MediaBrowserCompatItemReceiver = i72;
                objArr23[i73] = objArr23[9];
                return 0;
            case 61:
                int i74 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i74;
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                Object obj12 = objArr24[i74];
                objArr24[i74] = null;
                objArr24[15] = obj12;
                return 0;
            case 62:
                int i75 = this.MediaBrowserCompatItemReceiver;
                int i76 = i75 - 1;
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                Object obj13 = objArr25[i76];
                objArr25[i76] = null;
                objArr25[16] = obj13;
                this.MediaBrowserCompatItemReceiver = i75;
                objArr25[i76] = objArr25[9];
                return 0;
            case 63:
                int i77 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i77;
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                Object obj14 = objArr26[i77];
                objArr26[i77] = null;
                objArr26[17] = obj14;
                return 0;
            case 64:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i78 = this.MediaBrowserCompatItemReceiver;
                objArr27[i78] = objArr27[i78 - 1];
                this.MediaBrowserCompatItemReceiver = i78;
                Object obj15 = objArr27[i78];
                objArr27[i78] = null;
                objArr27[12] = obj15;
                return 0;
            case 65:
                int i79 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i79;
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                Object obj16 = objArr28[i79];
                objArr28[i79] = null;
                this.AudioAttributesCompatParcelizer = obj16 != null ? 0 : 1;
                return 0;
            case 66:
                int i80 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i80;
                int[] iArr34 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr34[10] = iArr34[i80];
                return 0;
            case 67:
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                int i81 = this.MediaBrowserCompatItemReceiver;
                objArr29[i81] = objArr29[9];
                objArr29[i81 + 1] = objArr29[15];
                this.MediaBrowserCompatItemReceiver = i81 + 3;
                objArr29[i81 + 2] = objArr29[16];
                return 0;
            case 68:
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                int i82 = this.MediaBrowserCompatItemReceiver;
                objArr30[i82] = objArr30[17];
                this.MediaBrowserCompatItemReceiver = i82 + 2;
                objArr30[i82 + 1] = objArr30[11];
                return 0;
            case 69:
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                int i83 = this.MediaBrowserCompatItemReceiver;
                objArr31[i83] = objArr31[13];
                int[] iArr35 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatItemReceiver = i83 + 2;
                iArr35[i83 + 1] = iArr35[10];
                return 0;
            case 70:
                int i84 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i84;
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr32[i84];
                objArr32[i84] = null;
                objArr32[12] = obj17;
                return 0;
            case 71:
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                int i85 = this.MediaBrowserCompatItemReceiver;
                objArr33[i85] = objArr33[11];
                objArr33[i85 + 1] = objArr33[12];
                this.MediaBrowserCompatItemReceiver = i85 + 3;
                objArr33[i85 + 2] = objArr33[14];
                return 0;
            case 72:
                int i86 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i86;
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                Object obj18 = objArr34[i86];
                objArr34[i86] = null;
                this.AudioAttributesCompatParcelizer = obj18 == null ? 0 : 1;
                return 0;
            case 73:
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                int i87 = this.MediaBrowserCompatItemReceiver;
                objArr35[i87] = objArr35[i87 - 1];
                this.MediaBrowserCompatItemReceiver = i87;
                Object obj19 = objArr35[i87];
                objArr35[i87] = null;
                objArr35[11] = obj19;
                return 0;
            case 74:
                int i88 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i88;
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                Object obj20 = objArr36[i88];
                objArr36[i88] = null;
                objArr36[14] = obj20;
                return 0;
            case 75:
                int i89 = this.MediaBrowserCompatItemReceiver;
                int i90 = i89 - 1;
                int[] iArr36 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr36[10] = iArr36[i90];
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatItemReceiver = i89;
                objArr37[i90] = objArr37[9];
                return 0;
            case 76:
                Object[] objArr38 = this.MediaBrowserCompatMediaItem;
                int i91 = this.MediaBrowserCompatItemReceiver;
                objArr38[i91] = objArr38[12];
                objArr38[i91 + 1] = objArr38[14];
                this.MediaBrowserCompatItemReceiver = i91 + 3;
                objArr38[i91 + 2] = objArr38[11];
                return 0;
            case 77:
                Object[] objArr39 = this.MediaBrowserCompatMediaItem;
                int i92 = this.MediaBrowserCompatItemReceiver;
                objArr39[i92] = objArr39[13];
                this.MediaBrowserCompatItemReceiver = i92 + 2;
                objArr39[i92 + 1] = objArr39[15];
                return 0;
            case 78:
                int[] iArr37 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i93 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i93 + 1;
                iArr37[i93] = iArr37[10];
                return 0;
            case 79:
                Object[] objArr40 = this.MediaBrowserCompatMediaItem;
                int i94 = this.MediaBrowserCompatItemReceiver;
                objArr40[i94] = objArr40[9];
                this.MediaBrowserCompatItemReceiver = i94 + 2;
                objArr40[i94 + 1] = objArr40[11];
                return 0;
            case 80:
                int[] iArr38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i95 = this.MediaBrowserCompatItemReceiver;
                iArr38[i95] = 2;
                iArr38[i95 + 1] = 2;
                int i96 = i95 + 1;
                this.MediaBrowserCompatItemReceiver = i96;
                iArr38[i95] = iArr38[i95] % iArr38[i96];
                return 0;
            case 81:
                int[] iArr39 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i97 = this.MediaBrowserCompatItemReceiver;
                iArr39[i97] = 2;
                this.MediaBrowserCompatItemReceiver = i97;
                iArr39[i97 - 1] = iArr39[i97 - 1] % iArr39[i97];
                int i98 = i97 - 1;
                this.MediaBrowserCompatItemReceiver = i98;
                this.MediaBrowserCompatMediaItem[i98] = null;
                return 0;
            case 82:
                Object[] objArr41 = this.MediaBrowserCompatMediaItem;
                int i99 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i99 + 1;
                objArr41[i99] = null;
                int[] iArr40 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj21 = objArr41[i99];
                objArr41[i99] = null;
                iArr40[i99] = ((int[]) obj21).length;
                this.MediaBrowserCompatItemReceiver = i99;
                objArr41[i99] = null;
                return 0;
            case 83:
                int[] iArr41 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i100 + 1;
                iArr41[i100] = 79;
                return 0;
            case 84:
                int[] iArr42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i101 = this.MediaBrowserCompatItemReceiver;
                iArr42[i101] = iArr42[i101 - 1];
                iArr42[i101 + 1] = 128;
                int i102 = i101 + 1;
                this.MediaBrowserCompatItemReceiver = i102;
                iArr42[i101] = iArr42[i101] % iArr42[i102];
                return 0;
            case 85:
                int i103 = this.MediaBrowserCompatItemReceiver;
                int[] iArr43 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr43[i103 - 2] = iArr43[i103 - 2] >>> iArr43[i103 - 1];
                int i104 = i103 - 2;
                this.MediaBrowserCompatItemReceiver = i104;
                this.MediaBrowserCompatMediaItem[i104] = null;
                return 0;
            case 86:
                int[] iArr44 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i105 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i105 + 1;
                iArr44[i105] = 85;
                return 0;
            case 87:
                int[] iArr45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i106 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i106 + 1;
                iArr45[i106] = 52;
                return 0;
            case 88:
                int[] iArr46 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i107 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i107 + 1;
                iArr46[i107] = 82;
                return 0;
            case 89:
                int[] iArr47 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i108 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i108 + 1;
                iArr47[i108] = 25;
                return 0;
            case 90:
                int[] iArr48 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i109 = this.MediaBrowserCompatItemReceiver;
                iArr48[i109] = 29;
                this.MediaBrowserCompatItemReceiver = i109;
                iArr48[i109 - 1] = iArr48[i109 - 1] + iArr48[i109];
                return 0;
            case 91:
                int[] iArr49 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i110 = this.MediaBrowserCompatItemReceiver;
                iArr49[i110] = 75;
                this.MediaBrowserCompatItemReceiver = i110;
                iArr49[i110 - 1] = iArr49[i110 - 1] + iArr49[i110];
                return 0;
            case 92:
                int[] iArr50 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i111 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i111 + 1;
                iArr50[i111] = 119;
                return 0;
            case 93:
                int[] iArr51 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i112 = this.MediaBrowserCompatItemReceiver;
                iArr51[i112] = 63;
                this.MediaBrowserCompatItemReceiver = i112 + 2;
                iArr51[i112 + 1] = 0;
                return 0;
            case 94:
                int[] iArr52 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i113 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i113 + 1;
                iArr52[i113] = 57;
                return 0;
            case 95:
                int[] iArr53 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i114 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i114 + 1;
                iArr53[i114] = 42;
                return 0;
            case 96:
                int[] iArr54 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i115 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i115 + 1;
                iArr54[i115] = 97;
                return 0;
            case 97:
                int[] iArr55 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i116 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i116 + 1;
                iArr55[i116] = 54;
                return 0;
            case 98:
                int[] iArr56 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i117 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i117 + 1;
                iArr56[i117] = 125;
                return 0;
            case 99:
                int[] iArr57 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i118 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i118 + 1;
                iArr57[i118] = 28;
                return 0;
            case 100:
                long[] jArr = this.AudioAttributesImplApi21Parcelizer;
                int i119 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i119 + 1;
                jArr[i119] = this.write;
                return 0;
            case 101:
                long[] jArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i120 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i120 + 1;
                this.read = jArr2[i120];
                return 0;
            case 102:
                Object[] objArr42 = this.MediaBrowserCompatMediaItem;
                int i121 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i121 + 1;
                objArr42[i121] = objArr42[15];
                return 0;
            case 103:
                Object[] objArr43 = this.MediaBrowserCompatMediaItem;
                int i122 = this.MediaBrowserCompatItemReceiver;
                objArr43[i122] = objArr43[10];
                this.MediaBrowserCompatItemReceiver = i122 + 2;
                objArr43[i122 + 1] = objArr43[11];
                return 0;
            case 104:
                Object[] objArr44 = this.MediaBrowserCompatMediaItem;
                int i123 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i123 + 1;
                objArr44[i123] = objArr44[13];
                return 0;
            case 105:
                Object[] objArr45 = this.MediaBrowserCompatMediaItem;
                int i124 = this.MediaBrowserCompatItemReceiver;
                objArr45[i124] = objArr45[10];
                this.MediaBrowserCompatItemReceiver = i124 + 2;
                objArr45[i124 + 1] = objArr45[12];
                return 0;
            case 106:
                int[] iArr58 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i125 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i125 + 1;
                iArr58[i125] = 107;
                return 0;
            case 107:
                int[] iArr59 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i126 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i126 + 1;
                iArr59[i126] = 9;
                return 0;
            case 108:
                int[] iArr60 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i127 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i127 + 1;
                iArr60[i127] = 50;
                return 0;
            case 109:
                Object[] objArr46 = this.MediaBrowserCompatMediaItem;
                int i128 = this.MediaBrowserCompatItemReceiver;
                objArr46[i128] = objArr46[12];
                this.MediaBrowserCompatItemReceiver = i128 + 2;
                objArr46[i128 + 1] = objArr46[11];
                return 0;
            case 110:
                int[] iArr61 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i129 = this.MediaBrowserCompatItemReceiver;
                iArr61[i129] = 91;
                iArr61[i129 - 1] = iArr61[i129 - 1] + iArr61[i129];
                this.MediaBrowserCompatItemReceiver = i129 + 1;
                iArr61[i129] = iArr61[i129 - 1];
                return 0;
            case 111:
                int[] iArr62 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i130 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i130 + 1;
                iArr62[i130] = 86;
                return 0;
            case 112:
                int[] iArr63 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i131 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i131 + 1;
                iArr63[i131] = 51;
                return 0;
            case 113:
                Object[] objArr47 = this.MediaBrowserCompatMediaItem;
                int i132 = this.MediaBrowserCompatItemReceiver;
                objArr47[i132] = objArr47[i132 - 1];
                Object obj22 = objArr47[i132];
                objArr47[i132] = null;
                objArr47[11] = obj22;
                int i133 = i132 - 1;
                this.MediaBrowserCompatItemReceiver = i133;
                Object obj23 = objArr47[i133];
                objArr47[i133] = null;
                objArr47[10] = obj23;
                return 0;
            case 114:
                Object[] objArr48 = this.MediaBrowserCompatMediaItem;
                int i134 = this.MediaBrowserCompatItemReceiver;
                objArr48[i134] = null;
                this.MediaBrowserCompatItemReceiver = i134;
                Object obj24 = objArr48[i134];
                objArr48[i134] = null;
                objArr48[10] = obj24;
                return 0;
            case 115:
                int[] iArr64 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i135 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i135 + 1;
                iArr64[i135] = 75;
                return 0;
            case 116:
                int[] iArr65 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i136 = this.MediaBrowserCompatItemReceiver;
                iArr65[i136] = 19;
                iArr65[i136 - 1] = iArr65[i136 - 1] + iArr65[i136];
                this.MediaBrowserCompatItemReceiver = i136 + 1;
                iArr65[i136] = iArr65[i136 - 1];
                return 0;
            case 117:
                int[] iArr66 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i137 = this.MediaBrowserCompatItemReceiver;
                iArr66[i137] = 4;
                this.MediaBrowserCompatItemReceiver = i137;
                iArr66[i137 - 1] = iArr66[i137 - 1] * iArr66[i137];
                return 0;
            case 118:
                int i138 = this.MediaBrowserCompatItemReceiver;
                int i139 = i138 - 1;
                Object[] objArr49 = this.MediaBrowserCompatMediaItem;
                Object obj25 = objArr49[i139];
                objArr49[i139] = null;
                objArr49[10] = obj25;
                this.MediaBrowserCompatItemReceiver = i138;
                objArr49[i139] = objArr49[11];
                return 0;
            case 119:
                int[] iArr67 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i140 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i140 + 1;
                iArr67[i140] = 19;
                return 0;
            case 120:
                int[] iArr68 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i141 = this.MediaBrowserCompatItemReceiver;
                iArr68[i141] = 2;
                this.MediaBrowserCompatItemReceiver = i141 + 2;
                iArr68[i141 + 1] = 4;
                return 0;
            case 121:
                int[] iArr69 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i142 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i142 + 1;
                iArr69[i142] = 21;
                return 0;
            case 122:
                int[] iArr70 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i143 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i143 + 1;
                iArr70[i143] = 10;
                return 0;
            case 123:
                int[] iArr71 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i144 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i144 + 1;
                iArr71[i144] = 59;
                return 0;
            case 124:
                int[] iArr72 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i145 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i145 + 1;
                iArr72[i145] = 64;
                return 0;
            case 125:
                int[] iArr73 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i146 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i146 + 1;
                iArr73[i146] = 24;
                return 0;
            case 126:
                int[] iArr74 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i147 = this.MediaBrowserCompatItemReceiver;
                iArr74[i147] = 97;
                this.MediaBrowserCompatItemReceiver = i147;
                iArr74[i147 - 1] = iArr74[i147 - 1] + iArr74[i147];
                return 0;
            case 127:
                int[] iArr75 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i148 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i148 + 1;
                iArr75[i148] = 109;
                return 0;
            case 128:
                int[] iArr76 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i149 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i149 + 1;
                iArr76[i149] = 78;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr77 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i150 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i150 + 1;
                iArr77[i150] = 2;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int i151 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i151;
                Object[] objArr50 = this.MediaBrowserCompatMediaItem;
                Object obj26 = objArr50[i151];
                objArr50[i151] = null;
                objArr50[16] = obj26;
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int i152 = this.MediaBrowserCompatItemReceiver;
                int i153 = i152 - 1;
                Object[] objArr51 = this.MediaBrowserCompatMediaItem;
                Object obj27 = objArr51[i153];
                objArr51[i153] = null;
                objArr51[12] = obj27;
                int i154 = i152 - 2;
                Object obj28 = objArr51[i154];
                objArr51[i154] = null;
                objArr51[11] = obj28;
                this.MediaBrowserCompatItemReceiver = i152 - 1;
                objArr51[i154] = objArr51[12];
                return 0;
            case 132:
                int i155 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i155;
                Object[] objArr52 = this.MediaBrowserCompatMediaItem;
                Object obj29 = objArr52[i155];
                objArr52[i155] = null;
                objArr52[13] = obj29;
                return 0;
            case 133:
                int i156 = this.MediaBrowserCompatItemReceiver;
                int i157 = i156 - 1;
                Object[] objArr53 = this.MediaBrowserCompatMediaItem;
                Object obj30 = objArr53[i157];
                objArr53[i157] = null;
                objArr53[12] = obj30;
                this.MediaBrowserCompatItemReceiver = i156;
                objArr53[i157] = objArr53[13];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                Object[] objArr54 = this.MediaBrowserCompatMediaItem;
                int i158 = this.MediaBrowserCompatItemReceiver;
                objArr54[i158] = null;
                this.MediaBrowserCompatItemReceiver = i158;
                Object obj31 = objArr54[i158];
                objArr54[i158] = null;
                objArr54[12] = obj31;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int i159 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i159;
                Object[] objArr55 = this.MediaBrowserCompatMediaItem;
                Object obj32 = objArr55[i159];
                objArr55[i159] = null;
                objArr55[18] = obj32;
                return 0;
            case 136:
                Object[] objArr56 = this.MediaBrowserCompatMediaItem;
                int i160 = this.MediaBrowserCompatItemReceiver;
                objArr56[i160] = objArr56[i160 - 1];
                Object obj33 = objArr56[i160];
                objArr56[i160] = null;
                objArr56[14] = obj33;
                int i161 = i160 - 1;
                this.MediaBrowserCompatItemReceiver = i161;
                Object obj34 = objArr56[i161];
                objArr56[i161] = null;
                objArr56[13] = obj34;
                return 0;
            case 137:
                Object[] objArr57 = this.MediaBrowserCompatMediaItem;
                int i162 = this.MediaBrowserCompatItemReceiver;
                objArr57[i162] = null;
                this.MediaBrowserCompatItemReceiver = i162;
                Object obj35 = objArr57[i162];
                objArr57[i162] = null;
                objArr57[13] = obj35;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int i163 = this.MediaBrowserCompatItemReceiver;
                int i164 = i163 - 1;
                Object[] objArr58 = this.MediaBrowserCompatMediaItem;
                Object obj36 = objArr58[i164];
                objArr58[i164] = null;
                objArr58[15] = obj36;
                int i165 = i163 - 2;
                Object obj37 = objArr58[i165];
                objArr58[i165] = null;
                objArr58[14] = obj37;
                this.MediaBrowserCompatItemReceiver = i163 - 1;
                objArr58[i165] = objArr58[15];
                return 0;
            case 139:
                Object[] objArr59 = this.MediaBrowserCompatMediaItem;
                int i166 = this.MediaBrowserCompatItemReceiver;
                objArr59[i166] = objArr59[9];
                objArr59[i166 + 1] = objArr59[17];
                this.MediaBrowserCompatItemReceiver = i166 + 3;
                objArr59[i166 + 2] = objArr59[11];
                return 0;
            case 140:
                Object[] objArr60 = this.MediaBrowserCompatMediaItem;
                int i167 = this.MediaBrowserCompatItemReceiver;
                objArr60[i167] = objArr60[18];
                this.MediaBrowserCompatItemReceiver = i167 + 2;
                objArr60[i167 + 1] = objArr60[13];
                return 0;
            case 141:
                Object[] objArr61 = this.MediaBrowserCompatMediaItem;
                int i168 = this.MediaBrowserCompatItemReceiver;
                objArr61[i168] = objArr61[10];
                objArr61[i168 + 1] = objArr61[16];
                this.MediaBrowserCompatItemReceiver = i168 + 3;
                objArr61[i168 + 2] = objArr61[11];
                return 0;
            case 142:
                int[] iArr78 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i169 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i169 + 1;
                iArr78[i169] = 123;
                return 0;
            case 143:
                int[] iArr79 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i170 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i170 + 1;
                iArr79[i170] = 93;
                return 0;
            case 144:
                int[] iArr80 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i171 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i171 + 1;
                iArr80[i171] = 3;
                return 0;
            case 145:
                int[] iArr81 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i172 = this.MediaBrowserCompatItemReceiver;
                iArr81[i172] = 3;
                this.MediaBrowserCompatItemReceiver = i172;
                iArr81[i172 - 1] = iArr81[i172 - 1] * iArr81[i172];
                return 0;
            case 146:
                int[] iArr82 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i173 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i173 + 1;
                iArr82[i173] = 31;
                return 0;
            case 147:
                int[] iArr83 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i174 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i174 + 1;
                iArr83[i174] = 11;
                return 0;
            default:
                return i;
        }
    }

    public getOwnerCategory(Object obj) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.AudioAttributesImplApi21Parcelizer = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaBrowserCompatSearchResultReceiver = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[9] = obj;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public getOwnerCategory(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.AudioAttributesImplApi21Parcelizer = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaBrowserCompatSearchResultReceiver = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public getOwnerCategory(Object obj, Object obj2, Object obj3) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.AudioAttributesImplApi21Parcelizer = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaBrowserCompatSearchResultReceiver = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public getOwnerCategory(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.AudioAttributesImplApi21Parcelizer = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaBrowserCompatSearchResultReceiver = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        objArr[13] = obj5;
        objArr[14] = obj6;
        objArr[15] = obj7;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }
}
