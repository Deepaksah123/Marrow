package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes4.dex */
public class ResetLessonRequestBody {
    public int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final float[] MediaBrowserCompatSearchResultReceiver;
    private final double[] MediaDescriptionCompat;
    private final Object[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public Object write;

    public ResetLessonRequestBody(Object obj, int i) {
        int[] iArr = new int[22];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaBrowserCompatSearchResultReceiver = new float[22];
        this.MediaDescriptionCompat = new double[22];
        Object[] objArr = new Object[22];
        this.RatingCompat = objArr;
        objArr[8] = obj;
        iArr[9] = i;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                iArr[i2] = 10;
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i3;
                this.AudioAttributesImplApi26Parcelizer = i3;
                return 0;
            case 3:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i4 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i4 + 1;
                this.RemoteActionCompatParcelizer = iArr2[i4];
                return 0;
            case 4:
                Object[] objArr = this.RatingCompat;
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i5 + 1;
                objArr[i5] = this.write;
                return 0;
            case 5:
                Object[] objArr2 = this.RatingCompat;
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i6 + 1;
                objArr2[i6] = objArr2[i6 - 1];
                return 0;
            case 6:
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i7;
                Object[] objArr3 = this.RatingCompat;
                Object obj = objArr3[i7];
                objArr3[i7] = null;
                objArr3[10] = obj;
                return 0;
            case 7:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i8 + 1;
                iArr3[i8] = 0;
                return 0;
            case 8:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i9 + 1;
                iArr4[i9] = 1204;
                return 0;
            case 9:
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i11 = i10 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i11;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i11];
                objArr4[i11] = null;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i12 = iArr5[i10 - 2];
                Object obj3 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                ((Object[]) obj2)[i12] = obj3;
                objArr4[i11] = objArr4[10];
                this.MediaBrowserCompatCustomActionResultReceiver = i10 - 1;
                iArr5[i10 - 2] = 1;
                return 0;
            case 10:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i13 + 1;
                iArr6[i13] = 1206;
                return 0;
            case 11:
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i15 = i14 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i15;
                Object[] objArr5 = this.RatingCompat;
                Object obj4 = objArr5[i15];
                objArr5[i15] = null;
                int i16 = this.AudioAttributesImplApi21Parcelizer[i14 - 2];
                Object obj5 = objArr5[i14 - 1];
                objArr5[i14 - 1] = null;
                ((Object[]) obj4)[i16] = obj5;
                return 0;
            case 12:
                Object[] objArr6 = this.RatingCompat;
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i17 + 1;
                objArr6[i17] = objArr6[10];
                return 0;
            case 13:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i18 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i18 + 1;
                iArr7[i18] = 2;
                return 0;
            case 14:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i19 + 1;
                iArr8[i19] = 9999;
                return 0;
            case 15:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i20] = 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 2;
                iArr9[i20 + 1] = 9998;
                return 0;
            case 16:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i21 + 1;
                iArr10[i21] = 4;
                return 0;
            case 17:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i22 + 1;
                iArr11[i22] = 1307;
                return 0;
            case 18:
                Object[] objArr7 = this.RatingCompat;
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr7[i23] = objArr7[10];
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i23 + 2;
                iArr12[i23 + 1] = 5;
                return 0;
            case 19:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                iArr13[i24] = 1207;
                return 0;
            case 20:
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i26 = i25 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i26;
                Object[] objArr8 = this.RatingCompat;
                Object obj6 = objArr8[i26];
                objArr8[i26] = null;
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i27 = iArr14[i25 - 2];
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                ((Object[]) obj6)[i27] = obj7;
                objArr8[i26] = objArr8[10];
                this.MediaBrowserCompatCustomActionResultReceiver = i25 - 1;
                iArr14[i25 - 2] = 6;
                return 0;
            case 21:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i28 + 1;
                iArr15[i28] = 1210;
                return 0;
            case 22:
                Object[] objArr9 = this.RatingCompat;
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr9[i29] = objArr9[10];
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i29 + 2;
                iArr16[i29 + 1] = 7;
                return 0;
            case 23:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i30 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i30 + 1;
                iArr17[i30] = 15001;
                return 0;
            case 24:
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i32 = i31 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i32;
                Object[] objArr10 = this.RatingCompat;
                Object obj8 = objArr10[i32];
                objArr10[i32] = null;
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = iArr18[i31 - 2];
                Object obj9 = objArr10[i31 - 1];
                objArr10[i31 - 1] = null;
                ((Object[]) obj8)[i33] = obj9;
                objArr10[i32] = objArr10[10];
                this.MediaBrowserCompatCustomActionResultReceiver = i31 - 1;
                iArr18[i31 - 2] = 8;
                return 0;
            case 25:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i34 + 1;
                iArr19[i34] = 15002;
                return 0;
            case 26:
                Object[] objArr11 = this.RatingCompat;
                int i35 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr11[i35] = objArr11[10];
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i35 + 2;
                iArr20[i35 + 1] = 9;
                return 0;
            case 27:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i36 + 1;
                iArr21[i36] = 15003;
                return 0;
            case 28:
                Object[] objArr12 = this.RatingCompat;
                int i37 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i37 + 1;
                Object obj10 = objArr12[i37];
                objArr12[i37] = null;
                this.MediaBrowserCompatItemReceiver = obj10;
                return 0;
            case 29:
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i39 = i38 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i39;
                Object[] objArr13 = this.RatingCompat;
                Object obj11 = objArr13[i39];
                objArr13[i39] = null;
                int i40 = this.AudioAttributesImplApi21Parcelizer[i38 - 2];
                Object obj12 = objArr13[i38 - 1];
                objArr13[i38 - 1] = null;
                ((Object[]) obj11)[i40] = obj12;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 - 2;
                objArr13[i39] = objArr13[10];
                return 0;
            case 30:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 1;
                iArr22[i41] = iArr22[9];
                return 0;
            case 31:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i42 + 1;
                iArr23[i42] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 32:
                int i43 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = i43 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i44;
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                iArr24[i43 - 2] = iArr24[i43 - 2] % iArr24[i44];
                int i45 = i43 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i45;
                this.RatingCompat[i45] = null;
                return 0;
            case 33:
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[this.MediaBrowserCompatCustomActionResultReceiver - 1];
                return 0;
            case 35:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr25[i46] = 23;
                this.MediaBrowserCompatCustomActionResultReceiver = i46;
                iArr25[i46 - 1] = iArr25[i46 - 1] + iArr25[i46];
            case 34:
                return 0;
            case 36:
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i47 + 1;
                iArr26[i47] = iArr26[i47 - 1];
                return 0;
            case 37:
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i48 + 1;
                iArr27[i48] = 128;
                return 0;
            case 38:
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i50 = i49 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                iArr28[i49 - 2] = iArr28[i49 - 2] % iArr28[i50];
                return 0;
            case 39:
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i51;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i51] != 0 ? 0 : 1;
                return 0;
            case 40:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i52 + 1;
                iArr29[i52] = 109;
                return 0;
            case 41:
                int i53 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i54 = i53 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i54;
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                iArr30[i53 - 2] = iArr30[i53 - 2] + iArr30[i54];
                return 0;
            case 42:
                int[] iArr31 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr31[i55] = 128;
                this.MediaBrowserCompatCustomActionResultReceiver = i55;
                iArr31[i55 - 1] = iArr31[i55 - 1] % iArr31[i55];
                return 0;
            case 43:
                Object[] objArr14 = this.RatingCompat;
                int i56 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj13 = objArr14[i56 - 1];
                objArr14[i56 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj13;
                return 0;
            case 44:
                Object[] objArr15 = this.RatingCompat;
                int i57 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i57 + 1;
                objArr15[i57] = null;
                return 0;
            case 45:
                int[] iArr32 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr16 = this.RatingCompat;
                Object obj14 = objArr16[i58 - 1];
                objArr16[i58 - 1] = null;
                iArr32[i58 - 1] = ((int[]) obj14).length;
                int i59 = i58 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i59;
                objArr16[i59] = null;
                return 0;
            case 46:
                int[] iArr33 = this.AudioAttributesImplApi21Parcelizer;
                int i60 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i60;
                this.RemoteActionCompatParcelizer = iArr33[i60];
                return 0;
            case 47:
                int[] iArr34 = this.AudioAttributesImplApi21Parcelizer;
                int i61 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i61 + 1;
                iArr34[i61] = 73;
                return 0;
            case 48:
                int[] iArr35 = this.AudioAttributesImplApi21Parcelizer;
                int i62 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i62 + 1;
                iArr35[i62] = 88;
                return 0;
            case 49:
                for (int i63 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i63 >= 0; i63--) {
                    this.RatingCompat[i63] = null;
                }
                Object[] objArr17 = this.RatingCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr17[0] = this.write;
                return 0;
            case 50:
                Object[] objArr18 = this.RatingCompat;
                int i64 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i64 + 1;
                objArr18[i64] = objArr18[9];
                return 0;
            case 51:
                int i65 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i65;
                Object[] objArr19 = this.RatingCompat;
                Object obj15 = objArr19[i65];
                objArr19[i65] = null;
                objArr19[15] = obj15;
                return 0;
            case 52:
                Object[] objArr20 = this.RatingCompat;
                int i66 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i66 + 1;
                objArr20[i66] = objArr20[15];
                return 0;
            case 53:
                Object[] objArr21 = this.RatingCompat;
                int i67 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr21[i67] = objArr21[i67 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i67;
                Object obj16 = objArr21[i67];
                objArr21[i67] = null;
                objArr21[14] = obj16;
                return 0;
            case 54:
                Object[] objArr22 = this.RatingCompat;
                int i68 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr22[i68] = objArr22[i68 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i68;
                Object obj17 = objArr22[i68];
                objArr22[i68] = null;
                objArr22[10] = obj17;
                return 0;
            case 55:
                int i69 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i69;
                Object[] objArr23 = this.RatingCompat;
                Object obj18 = objArr23[i69];
                objArr23[i69] = null;
                this.RemoteActionCompatParcelizer = obj18 == null ? 0 : 1;
                return 0;
            case 56:
                int i70 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i70;
                Object[] objArr24 = this.RatingCompat;
                Object obj19 = objArr24[i70];
                objArr24[i70] = null;
                objArr24[13] = obj19;
                return 0;
            case 57:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i71 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i71 + 1;
                jArr[i71] = this.IconCompatParcelizer;
                return 0;
            case 58:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i72 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i72 + 1;
                this.read = jArr2[i72];
                return 0;
            case 59:
                int i73 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i74 = i73 - 1;
                Object[] objArr25 = this.RatingCompat;
                objArr25[i74] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i73;
                objArr25[i74] = objArr25[10];
                return 0;
            case 60:
                Object[] objArr26 = this.RatingCompat;
                int i75 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i75 + 1;
                objArr26[i75] = objArr26[13];
                return 0;
            case 61:
                Object[] objArr27 = this.RatingCompat;
                int i76 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr27[i76] = objArr27[i76 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i76;
                Object obj20 = objArr27[i76];
                objArr27[i76] = null;
                objArr27[16] = obj20;
                return 0;
            case 62:
                int[] iArr36 = this.AudioAttributesImplApi21Parcelizer;
                int i77 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i77 + 1;
                iArr36[i77] = 1;
                return 0;
            case 63:
                int i78 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i78;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i78] == 0 ? 0 : 1;
                return 0;
            case 64:
                Object[] objArr28 = this.RatingCompat;
                int i79 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i79 + 1;
                objArr28[i79] = objArr28[16];
                return 0;
            case 65:
                int i80 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i80;
                Object[] objArr29 = this.RatingCompat;
                Object obj21 = objArr29[i80];
                objArr29[i80] = null;
                objArr29[17] = obj21;
                return 0;
            case 66:
                int i81 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i81;
                int[] iArr37 = this.AudioAttributesImplApi21Parcelizer;
                iArr37[11] = iArr37[i81];
                return 0;
            case 67:
                Object[] objArr30 = this.RatingCompat;
                int i82 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr30[i82] = objArr30[8];
                int[] iArr38 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i82 + 2;
                iArr38[i82 + 1] = iArr38[11];
                return 0;
            case 68:
                Object[] objArr31 = this.RatingCompat;
                int i83 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i83 + 1;
                objArr31[i83] = objArr31[8];
                return 0;
            case 69:
                int i84 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i84;
                Object[] objArr32 = this.RatingCompat;
                Object obj22 = objArr32[i84];
                objArr32[i84] = null;
                objArr32[18] = obj22;
                return 0;
            case 70:
                Object[] objArr33 = this.RatingCompat;
                int i85 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i85 + 1;
                objArr33[i85] = objArr33[17];
                return 0;
            case 71:
                int i86 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i86;
                Object[] objArr34 = this.RatingCompat;
                Object obj23 = objArr34[i86];
                objArr34[i86] = null;
                this.RemoteActionCompatParcelizer = obj23 != null ? 0 : 1;
                return 0;
            case 72:
                int i87 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i88 = i87 - 1;
                Object[] objArr35 = this.RatingCompat;
                Object obj24 = objArr35[i88];
                objArr35[i88] = null;
                objArr35[13] = obj24;
                this.MediaBrowserCompatCustomActionResultReceiver = i87;
                objArr35[i88] = objArr35[10];
                return 0;
            case 73:
                Object[] objArr36 = this.RatingCompat;
                int i89 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i89 + 1;
                objArr36[i89] = objArr36[18];
                return 0;
            case 74:
                int[] iArr39 = this.AudioAttributesImplApi21Parcelizer;
                int i90 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i90 + 1;
                iArr39[i90] = iArr39[11];
                return 0;
            case 75:
                int i91 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i92 = i91 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i92;
                int[] iArr40 = this.AudioAttributesImplApi21Parcelizer;
                this.RemoteActionCompatParcelizer = iArr40[i92] != iArr40[i91 - 1] ? 0 : 1;
                return 0;
            case 76:
                int[] iArr41 = this.AudioAttributesImplApi21Parcelizer;
                int i93 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr41[i93] = iArr41[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i93 + 2;
                iArr41[i93 + 1] = 1208;
                return 0;
            case 77:
                Object[] objArr37 = this.RatingCompat;
                int i94 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i94 + 1;
                objArr37[i94] = objArr37[14];
                return 0;
            case 78:
                int[] iArr42 = this.AudioAttributesImplApi21Parcelizer;
                int i95 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i95 + 1;
                iArr42[i95] = 1250;
                return 0;
            case 79:
                int i96 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i97 = i96 - 1;
                Object[] objArr38 = this.RatingCompat;
                objArr38[i97] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i96;
                objArr38[i97] = objArr38[14];
                return 0;
            case 80:
                int i98 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i99 = i98 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i99;
                int[] iArr43 = this.AudioAttributesImplApi21Parcelizer;
                this.RemoteActionCompatParcelizer = iArr43[i99] == iArr43[i98 - 1] ? 0 : 1;
                return 0;
            case 81:
                int[] iArr44 = this.AudioAttributesImplApi21Parcelizer;
                int i100 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i100 + 1;
                iArr44[i100] = 411;
                return 0;
            case 82:
                int[] iArr45 = this.AudioAttributesImplApi21Parcelizer;
                int i101 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr45[i101] = iArr45[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i101 + 2;
                iArr45[i101 + 1] = 401;
                return 0;
            case 83:
                int[] iArr46 = this.AudioAttributesImplApi21Parcelizer;
                int i102 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i102 + 1;
                iArr46[i102] = 1202;
                return 0;
            case 84:
                int[] iArr47 = this.AudioAttributesImplApi21Parcelizer;
                int i103 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i103 + 1;
                iArr47[i103] = 1203;
                return 0;
            case 85:
                int i104 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i104;
                this.RatingCompat[i104] = null;
                return 0;
            case 86:
                int i105 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i106 = i105 - 1;
                Object[] objArr39 = this.RatingCompat;
                Object obj25 = objArr39[i106];
                objArr39[i106] = null;
                objArr39[18] = obj25;
                this.MediaBrowserCompatCustomActionResultReceiver = i105;
                objArr39[i106] = objArr39[8];
                return 0;
            case 87:
                int i107 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i108 = i107 - 1;
                Object[] objArr40 = this.RatingCompat;
                Object obj26 = objArr40[i108];
                objArr40[i108] = null;
                objArr40[19] = obj26;
                this.MediaBrowserCompatCustomActionResultReceiver = i107;
                objArr40[i108] = objArr40[8];
                return 0;
            case 88:
                int i109 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i110 = i109 - 1;
                Object[] objArr41 = this.RatingCompat;
                Object obj27 = objArr41[i110];
                objArr41[i110] = null;
                objArr41[20] = obj27;
                this.MediaBrowserCompatCustomActionResultReceiver = i109;
                objArr41[i110] = objArr41[8];
                return 0;
            case 89:
                int i111 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i111;
                Object[] objArr42 = this.RatingCompat;
                Object obj28 = objArr42[i111];
                objArr42[i111] = null;
                objArr42[21] = obj28;
                return 0;
            case 90:
                int i112 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i113 = i112 - 1;
                Object[] objArr43 = this.RatingCompat;
                Object obj29 = objArr43[i113];
                objArr43[i113] = null;
                objArr43[10] = obj29;
                int i114 = i112 - 2;
                Object obj30 = objArr43[i114];
                objArr43[i114] = null;
                objArr43[13] = obj30;
                this.MediaBrowserCompatCustomActionResultReceiver = i112 - 1;
                objArr43[i114] = objArr43[10];
                return 0;
            case 91:
                int i115 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i116 = i115 - 1;
                int[] iArr48 = this.AudioAttributesImplApi21Parcelizer;
                iArr48[12] = iArr48[i116];
                Object[] objArr44 = this.RatingCompat;
                objArr44[i116] = objArr44[19];
                this.MediaBrowserCompatCustomActionResultReceiver = i115 + 1;
                objArr44[i115] = objArr44[20];
                return 0;
            case 92:
                Object[] objArr45 = this.RatingCompat;
                int i117 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i117 + 1;
                objArr45[i117] = objArr45[21];
                return 0;
            case 93:
                Object[] objArr46 = this.RatingCompat;
                int i118 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr46[i118] = objArr46[10];
                int[] iArr49 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i118 + 2;
                iArr49[i118 + 1] = iArr49[12];
                return 0;
            case 94:
                Object[] objArr47 = this.RatingCompat;
                int i119 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr47[i119] = objArr47[9];
                this.MediaBrowserCompatCustomActionResultReceiver = i119 + 2;
                objArr47[i119 + 1] = objArr47[18];
                return 0;
            case 95:
                Object[] objArr48 = this.RatingCompat;
                int i120 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr48[i120] = objArr48[13];
                this.MediaBrowserCompatCustomActionResultReceiver = i120;
                Object obj31 = objArr48[i120];
                objArr48[i120] = null;
                objArr48[10] = obj31;
                return 0;
            case 96:
                int i121 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i121;
                int[] iArr50 = this.AudioAttributesImplApi21Parcelizer;
                iArr50[10] = iArr50[i121];
                return 0;
            case 97:
                int[] iArr51 = this.AudioAttributesImplApi21Parcelizer;
                int i122 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr51[i122] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i122;
                iArr51[10] = iArr51[i122];
                return 0;
            case 98:
                int i123 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i123;
                int[] iArr52 = this.AudioAttributesImplApi21Parcelizer;
                iArr52[12] = iArr52[i123];
                return 0;
            case 99:
                int[] iArr53 = this.AudioAttributesImplApi21Parcelizer;
                int i124 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i124 + 1;
                iArr53[i124] = iArr53[10];
                return 0;
            case 100:
                int i125 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i125;
                Object[] objArr49 = this.RatingCompat;
                Object obj32 = objArr49[i125];
                objArr49[i125] = null;
                objArr49[9] = obj32;
                return 0;
            case 101:
                int[] iArr54 = this.AudioAttributesImplApi21Parcelizer;
                int i126 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i126 + 1;
                iArr54[i126] = iArr54[12];
                return 0;
            case 102:
                int i127 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i128 = i127 - 1;
                Object[] objArr50 = this.RatingCompat;
                Object obj33 = objArr50[i128];
                objArr50[i128] = null;
                objArr50[13] = obj33;
                objArr50[i128] = objArr50[9];
                this.MediaBrowserCompatCustomActionResultReceiver = i127 + 1;
                objArr50[i127] = objArr50[13];
                return 0;
            case 103:
                int[] iArr55 = this.AudioAttributesImplApi21Parcelizer;
                int i129 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr55[i129] = iArr55[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i129 + 2;
                iArr55[i129 + 1] = 1309;
                return 0;
            case 104:
                int i130 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i131 = i130 - 1;
                Object[] objArr51 = this.RatingCompat;
                objArr51[i131] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i130;
                objArr51[i131] = objArr51[16];
                return 0;
            case 105:
                int i132 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i133 = i132 - 1;
                Object[] objArr52 = this.RatingCompat;
                Object obj34 = objArr52[i133];
                objArr52[i133] = null;
                objArr52[9] = obj34;
                this.MediaBrowserCompatCustomActionResultReceiver = i132;
                objArr52[i133] = objArr52[14];
                return 0;
            case 106:
                int[] iArr56 = this.AudioAttributesImplApi21Parcelizer;
                int i134 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr56[i134] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i134;
                iArr56[i134 - 1] = iArr56[i134 - 1] % iArr56[i134];
                return 0;
            case 107:
                int[] iArr57 = this.AudioAttributesImplApi21Parcelizer;
                int i135 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr57[i135] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i135;
                iArr57[i135 - 1] = iArr57[i135 - 1] % iArr57[i135];
                int i136 = i135 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i136;
                this.RatingCompat[i136] = null;
                return 0;
            case 108:
                int[] iArr58 = this.AudioAttributesImplApi21Parcelizer;
                int i137 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr58[i137] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i137 + 2;
                iArr58[i137 + 1] = 2;
                return 0;
            case 109:
                int[] iArr59 = this.AudioAttributesImplApi21Parcelizer;
                int i138 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr59[i138] = 1;
                iArr59[i138 - 1] = iArr59[i138 - 1] + iArr59[i138];
                this.MediaBrowserCompatCustomActionResultReceiver = i138 + 1;
                iArr59[i138] = iArr59[i138 - 1];
                return 0;
            case 110:
                int[] iArr60 = this.AudioAttributesImplApi21Parcelizer;
                int i139 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i139 + 1;
                iArr60[i139] = 97;
                return 0;
            case 111:
                Object[] objArr53 = this.RatingCompat;
                int i140 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr53[i140] = objArr53[i140 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i140;
                Object obj35 = objArr53[i140];
                objArr53[i140] = null;
                objArr53[17] = obj35;
                return 0;
            case 112:
                int i141 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i142 = i141 - 1;
                int[] iArr61 = this.AudioAttributesImplApi21Parcelizer;
                iArr61[11] = iArr61[i142];
                Object[] objArr54 = this.RatingCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = i141;
                objArr54[i142] = objArr54[8];
                return 0;
            case 113:
                int[] iArr62 = this.AudioAttributesImplApi21Parcelizer;
                int i143 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr55 = this.RatingCompat;
                Object obj36 = objArr55[i143 - 1];
                objArr55[i143 - 1] = null;
                iArr62[i143 - 1] = ((int[]) obj36).length;
                return 0;
            case 114:
                int[] iArr63 = this.AudioAttributesImplApi21Parcelizer;
                int i144 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr63[i144] = 121;
                this.MediaBrowserCompatCustomActionResultReceiver = i144;
                iArr63[i144 - 1] = iArr63[i144 - 1] + iArr63[i144];
                return 0;
            case 115:
                int[] iArr64 = this.AudioAttributesImplApi21Parcelizer;
                int i145 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr64[i145] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i145;
                iArr64[i145 - 1] = iArr64[i145 - 1] / iArr64[i145];
                return 0;
            case 116:
                int[] iArr65 = this.AudioAttributesImplApi21Parcelizer;
                int i146 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr65[i146] = 11;
                iArr65[i146 - 1] = iArr65[i146 - 1] + iArr65[i146];
                this.MediaBrowserCompatCustomActionResultReceiver = i146 + 1;
                iArr65[i146] = iArr65[i146 - 1];
                return 0;
            case 117:
                int[] iArr66 = this.AudioAttributesImplApi21Parcelizer;
                int i147 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i147 + 1;
                iArr66[i147] = 47;
                return 0;
            case 118:
                int[] iArr67 = this.AudioAttributesImplApi21Parcelizer;
                int i148 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr67[i148] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i148;
                iArr67[i148 - 1] = iArr67[i148 - 1] / iArr67[i148];
                int i149 = i148 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i149;
                this.RatingCompat[i149] = null;
                return 0;
            case 119:
                int[] iArr68 = this.AudioAttributesImplApi21Parcelizer;
                int i150 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i150 + 1;
                iArr68[i150] = 119;
                return 0;
            case 120:
                int[] iArr69 = this.AudioAttributesImplApi21Parcelizer;
                int i151 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr69[i151] = iArr69[i151 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i151 + 2;
                iArr69[i151 + 1] = 128;
                return 0;
            case 121:
                int[] iArr70 = this.AudioAttributesImplApi21Parcelizer;
                int i152 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr70[i152] = 83;
                iArr70[i152 - 1] = iArr70[i152 - 1] + iArr70[i152];
                this.MediaBrowserCompatCustomActionResultReceiver = i152 + 1;
                iArr70[i152] = iArr70[i152 - 1];
                return 0;
            case 122:
                int[] iArr71 = this.AudioAttributesImplApi21Parcelizer;
                int i153 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr71[i153] = 101;
                this.MediaBrowserCompatCustomActionResultReceiver = i153;
                iArr71[i153 - 1] = iArr71[i153 - 1] + iArr71[i153];
                return 0;
            case 123:
                int[] iArr72 = this.AudioAttributesImplApi21Parcelizer;
                int i154 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr72[i154] = 7;
                this.MediaBrowserCompatCustomActionResultReceiver = i154 + 2;
                iArr72[i154 + 1] = 0;
                return 0;
            case 124:
                int i155 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i156 = i155 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i156;
                int[] iArr73 = this.AudioAttributesImplApi21Parcelizer;
                iArr73[i155 - 2] = iArr73[i155 - 2] / iArr73[i156];
                int i157 = i155 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i157;
                this.RatingCompat[i157] = null;
                return 0;
            case 125:
                int[] iArr74 = this.AudioAttributesImplApi21Parcelizer;
                int i158 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i158 + 1;
                iArr74[i158] = 15;
                return 0;
            case 126:
                int[] iArr75 = this.AudioAttributesImplApi21Parcelizer;
                int i159 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i159 + 1;
                iArr75[i159] = 46;
                return 0;
            case 127:
                int[] iArr76 = this.AudioAttributesImplApi21Parcelizer;
                int i160 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i160 + 1;
                iArr76[i160] = 71;
                return 0;
            case 128:
                int[] iArr77 = this.AudioAttributesImplApi21Parcelizer;
                int i161 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i161 + 1;
                iArr77[i161] = 23;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr78 = this.AudioAttributesImplApi21Parcelizer;
                int i162 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i162 + 1;
                iArr78[i162] = 98;
                return 0;
            default:
                return i;
        }
    }

    public ResetLessonRequestBody(Object obj, Object obj2) {
        this.AudioAttributesImplApi21Parcelizer = new int[22];
        this.AudioAttributesImplBaseParcelizer = new long[22];
        this.MediaBrowserCompatSearchResultReceiver = new float[22];
        this.MediaDescriptionCompat = new double[22];
        Object[] objArr = new Object[22];
        this.RatingCompat = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }
}
