package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public class addVisibilityListener {
    public int AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    private final double[] MediaDescriptionCompat;
    private final float[] MediaMetadataCompat;
    private final long[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    public double read;
    public long write;

    public addVisibilityListener(Object obj) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.RatingCompat = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaDescriptionCompat = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[5] = obj;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                iArr[i2] = 2;
                iArr[i2 + 1] = 2;
                int i3 = i2 + 1;
                this.AudioAttributesImplBaseParcelizer = i3;
                iArr[i2] = iArr[i2] % iArr[i3];
                return 0;
            case 2:
                int i4 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i4;
                this.MediaBrowserCompatMediaItem[i4] = null;
                return 0;
            case 4:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i5 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i5 + 1;
                iArr2[i5] = this.AudioAttributesCompatParcelizer;
            case 3:
                return 0;
            case 5:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i6 + 1;
                iArr3[i6] = 113;
                return 0;
            case 6:
                int i7 = this.AudioAttributesImplBaseParcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplBaseParcelizer = i8;
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i7 - 2] = iArr4[i7 - 2] + iArr4[i8];
                return 0;
            case 7:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.AudioAttributesImplBaseParcelizer;
                iArr5[i9] = iArr5[i9 - 1];
                iArr5[i9 + 1] = 128;
                int i10 = i9 + 1;
                this.AudioAttributesImplBaseParcelizer = i10;
                iArr5[i9] = iArr5[i9] % iArr5[i10];
                return 0;
            case 8:
                int i11 = this.AudioAttributesImplBaseParcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i11;
                this.AudioAttributesImplApi26Parcelizer = i11;
                return 0;
            case 9:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i12 + 1;
                this.IconCompatParcelizer = iArr6[i12];
                return 0;
            case 10:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i13 + 1;
                iArr7[i13] = 2;
                return 0;
            case 11:
                int i14 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i14;
                this.IconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i14] != 0 ? 0 : 1;
                return 0;
            case 12:
                int i15 = this.AudioAttributesImplBaseParcelizer;
                int i16 = i15 - 1;
                this.AudioAttributesImplBaseParcelizer = i16;
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr8[i15 - 2] = iArr8[i15 - 2] % iArr8[i16];
                return 0;
            case 13:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                Object obj = objArr[i17 - 1];
                objArr[i17 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 14:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i18 + 1;
                objArr2[i18] = null;
                return 0;
            case 15:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                Object obj2 = objArr3[i19 - 1];
                objArr3[i19 - 1] = null;
                iArr9[i19 - 1] = ((int[]) obj2).length;
                int i20 = i19 - 1;
                this.AudioAttributesImplBaseParcelizer = i20;
                objArr3[i20] = null;
                return 0;
            case 16:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i21 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                this.IconCompatParcelizer = iArr10[i21];
                return 0;
            case 17:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i22 + 1;
                iArr11[i22] = 1;
                return 0;
            case 18:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                iArr12[i23] = 0;
                return 0;
            case 19:
                for (int i24 = this.AudioAttributesImplBaseParcelizer - 1; i24 >= 0; i24--) {
                    this.MediaBrowserCompatMediaItem[i24] = null;
                }
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr4[0] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 20:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i25 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i25 + 1;
                Object obj3 = objArr5[i25];
                objArr5[i25] = null;
                this.MediaBrowserCompatItemReceiver = obj3;
                return 0;
            case 21:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i26 + 1;
                objArr6[i26] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 22:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i27 + 1;
                objArr7[i27] = objArr7[6];
                return 0;
            case 23:
                this.IconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[this.AudioAttributesImplBaseParcelizer - 1];
                return 0;
            case 24:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i28 + 1;
                iArr13[i28] = 35;
                return 0;
            case 25:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i29 + 1;
                iArr14[i29] = iArr14[i29 - 1];
                return 0;
            case 26:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i30 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i30 + 1;
                iArr15[i30] = 128;
                return 0;
            case 27:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i31 + 1;
                iArr16[i31] = 109;
                return 0;
            case 28:
                int i32 = this.AudioAttributesImplBaseParcelizer;
                int i33 = i32 - 1;
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i32 - 2] = iArr17[i32 - 2] + iArr17[i33];
                iArr17[i33] = iArr17[i32 - 2];
                this.AudioAttributesImplBaseParcelizer = i32 + 1;
                iArr17[i32] = 128;
                return 0;
            case 29:
                int i34 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i34;
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                Object obj4 = objArr8[i34];
                objArr8[i34] = null;
                objArr8[16] = obj4;
                return 0;
            case 30:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i35 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i35 + 1;
                objArr9[i35] = objArr9[i35 - 1];
                return 0;
            case 31:
                int i36 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i36;
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                Object obj5 = objArr10[i36];
                objArr10[i36] = null;
                objArr10[15] = obj5;
                return 0;
            case 32:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i37 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i37 + 1;
                objArr11[i37] = objArr11[16];
                return 0;
            case 33:
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                objArr12[i38] = objArr12[i38 - 1];
                this.AudioAttributesImplBaseParcelizer = i38;
                Object obj6 = objArr12[i38];
                objArr12[i38] = null;
                objArr12[16] = obj6;
                return 0;
            case 34:
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                int i39 = this.AudioAttributesImplBaseParcelizer;
                objArr13[i39] = objArr13[15];
                this.AudioAttributesImplBaseParcelizer = i39 + 2;
                objArr13[i39 + 1] = objArr13[16];
                return 0;
            case 35:
                int i40 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i40;
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr18[9] = iArr18[i40];
                return 0;
            case 36:
                int i41 = this.AudioAttributesImplBaseParcelizer;
                int i42 = i41 - 1;
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr14[i42];
                objArr14[i42] = null;
                objArr14[17] = obj7;
                objArr14[i42] = objArr14[5];
                this.AudioAttributesImplBaseParcelizer = i41 + 1;
                objArr14[i41] = objArr14[6];
                return 0;
            case 37:
                long[] jArr = this.RatingCompat;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                jArr[i43] = this.RemoteActionCompatParcelizer;
                return 0;
            case 38:
                int i44 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i44;
                long[] jArr2 = this.RatingCompat;
                jArr2[11] = jArr2[i44];
                return 0;
            case 39:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i45 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i45 + 1;
                objArr15[i45] = objArr15[5];
                return 0;
            case 40:
                int i46 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i46;
                long[] jArr3 = this.RatingCompat;
                jArr3[13] = jArr3[i46];
                return 0;
            case 41:
                int i47 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i47;
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[10] = iArr19[i47];
                return 0;
            case 42:
                int i48 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i48;
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                Object obj8 = objArr16[i48];
                objArr16[i48] = null;
                objArr16[18] = obj8;
                return 0;
            case 43:
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                int i49 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i49 + 1;
                objArr17[i49] = objArr17[15];
                return 0;
            case 44:
                long[] jArr4 = this.RatingCompat;
                int i50 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i50 + 1;
                jArr4[i50] = jArr4[11];
                this.MediaDescriptionCompat[i50] = jArr4[i50];
                return 0;
            case 45:
                int i51 = this.AudioAttributesImplBaseParcelizer;
                int i52 = i51 - 1;
                double[] dArr = this.MediaDescriptionCompat;
                dArr[7] = dArr[i52];
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = i51;
                objArr18[i52] = objArr18[15];
                return 0;
            case 46:
                double[] dArr2 = this.MediaDescriptionCompat;
                int i53 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i53 + 1;
                dArr2[i53] = dArr2[7];
                return 0;
            case 47:
                double[] dArr3 = this.MediaDescriptionCompat;
                int i54 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i54 + 1;
                this.read = dArr3[i54];
                return 0;
            case 48:
                long[] jArr5 = this.RatingCompat;
                int i55 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i55 + 1;
                jArr5[i55] = jArr5[13];
                return 0;
            case 49:
                double[] dArr4 = this.MediaDescriptionCompat;
                int i56 = this.AudioAttributesImplBaseParcelizer;
                dArr4[i56 - 1] = this.RatingCompat[i56 - 1];
                int i57 = i56 - 1;
                dArr4[7] = dArr4[i57];
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = i56;
                objArr19[i57] = objArr19[15];
                return 0;
            case 50:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i58 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i58 + 1;
                iArr20[i58] = iArr20[9];
                return 0;
            case 51:
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i59 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i59 + 1;
                iArr21[i59] = iArr21[10];
                return 0;
            case 52:
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                int i60 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i60 + 1;
                objArr20[i60] = objArr20[17];
                return 0;
            case 53:
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                int i61 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i61 + 1;
                objArr21[i61] = objArr21[18];
                return 0;
            case 54:
                int i62 = this.AudioAttributesImplBaseParcelizer;
                int i63 = i62 - 1;
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr22[9] = iArr22[i63];
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = i62;
                objArr22[i63] = objArr22[15];
                return 0;
            case 55:
                int i64 = this.AudioAttributesImplBaseParcelizer;
                int i65 = i64 - 1;
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr23[7] = iArr23[i65];
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = i64;
                objArr23[i65] = objArr23[15];
                return 0;
            case 56:
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i66 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i66 + 1;
                iArr24[i66] = iArr24[7];
                return 0;
            case 57:
                int i67 = this.AudioAttributesImplBaseParcelizer;
                int i68 = i67 - 1;
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                objArr24[i68] = null;
                this.AudioAttributesImplBaseParcelizer = i67;
                objArr24[i68] = objArr24[15];
                return 0;
            case 58:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i69 = this.AudioAttributesImplBaseParcelizer;
                iArr25[i69] = 2;
                this.AudioAttributesImplBaseParcelizer = i69 + 2;
                iArr25[i69 + 1] = 2;
                return 0;
            case 59:
                int i70 = this.AudioAttributesImplBaseParcelizer;
                int i71 = i70 - 1;
                this.AudioAttributesImplBaseParcelizer = i71;
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr26[i70 - 2] = iArr26[i70 - 2] % iArr26[i71];
                int i72 = i70 - 2;
                this.AudioAttributesImplBaseParcelizer = i72;
                this.MediaBrowserCompatMediaItem[i72] = null;
                return 0;
            case 60:
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i73 = this.AudioAttributesImplBaseParcelizer;
                iArr27[i73] = 91;
                iArr27[i73 - 1] = iArr27[i73 - 1] + iArr27[i73];
                this.AudioAttributesImplBaseParcelizer = i73 + 1;
                iArr27[i73] = iArr27[i73 - 1];
                return 0;
            case 61:
                int[] iArr28 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i74 = this.AudioAttributesImplBaseParcelizer;
                iArr28[i74] = 128;
                this.AudioAttributesImplBaseParcelizer = i74;
                iArr28[i74 - 1] = iArr28[i74 - 1] % iArr28[i74];
                return 0;
            case 62:
                int[] iArr29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i75 = this.AudioAttributesImplBaseParcelizer;
                iArr29[i75] = 97;
                this.AudioAttributesImplBaseParcelizer = i75 + 2;
                iArr29[i75 + 1] = 0;
                return 0;
            case 63:
                int i76 = this.AudioAttributesImplBaseParcelizer;
                int i77 = i76 - 1;
                this.AudioAttributesImplBaseParcelizer = i77;
                int[] iArr30 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr30[i76 - 2] = iArr30[i76 - 2] / iArr30[i77];
                int i78 = i76 - 2;
                this.AudioAttributesImplBaseParcelizer = i78;
                this.MediaBrowserCompatMediaItem[i78] = null;
                return 0;
            case 64:
                int[] iArr31 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i79 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i79 + 1;
                iArr31[i79] = 25;
                return 0;
            case 65:
                int[] iArr32 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i80 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i80 + 1;
                iArr32[i80] = 96;
                return 0;
            case 66:
                int i81 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i81;
                int[] iArr33 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr33[7] = iArr33[i81];
                return 0;
            case 67:
                int i82 = this.AudioAttributesImplBaseParcelizer;
                int i83 = i82 - 1;
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                Object obj9 = objArr25[i83];
                objArr25[i83] = null;
                objArr25[8] = obj9;
                this.AudioAttributesImplBaseParcelizer = i82;
                objArr25[i83] = objArr25[5];
                return 0;
            case 68:
                int i84 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i84;
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                Object obj10 = objArr26[i84];
                objArr26[i84] = null;
                objArr26[9] = obj10;
                return 0;
            case 69:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i85 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i85 + 1;
                objArr27[i85] = objArr27[8];
                return 0;
            case 70:
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                int i86 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i86 + 1;
                objArr28[i86] = objArr28[9];
                return 0;
            case 71:
                int i87 = this.AudioAttributesImplBaseParcelizer;
                int i88 = i87 - 1;
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                Object obj11 = objArr29[i88];
                objArr29[i88] = null;
                objArr29[9] = obj11;
                this.AudioAttributesImplBaseParcelizer = i87;
                objArr29[i88] = objArr29[8];
                return 0;
            case 72:
                int i89 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i89;
                this.IconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i89] == 0 ? 0 : 1;
                return 0;
            case 73:
                int i90 = this.AudioAttributesImplBaseParcelizer;
                int i91 = i90 - 1;
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                Object obj12 = objArr30[i91];
                objArr30[i91] = null;
                objArr30[5] = obj12;
                this.AudioAttributesImplBaseParcelizer = i90;
                objArr30[i91] = objArr30[8];
                return 0;
            case 74:
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                int i92 = this.AudioAttributesImplBaseParcelizer;
                objArr31[i92] = objArr31[i92 - 1];
                this.AudioAttributesImplBaseParcelizer = i92;
                Object obj13 = objArr31[i92];
                objArr31[i92] = null;
                objArr31[5] = obj13;
                return 0;
            case 75:
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                int i93 = this.AudioAttributesImplBaseParcelizer;
                objArr32[i93] = objArr32[6];
                this.AudioAttributesImplBaseParcelizer = i93 + 2;
                objArr32[i93 + 1] = objArr32[5];
                return 0;
            case 76:
                int i94 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i94;
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                Object obj14 = objArr33[i94];
                objArr33[i94] = null;
                objArr33[5] = obj14;
                return 0;
            case 77:
                int[] iArr34 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i95 = this.AudioAttributesImplBaseParcelizer;
                iArr34[i95] = 2;
                this.AudioAttributesImplBaseParcelizer = i95;
                iArr34[i95 - 1] = iArr34[i95 - 1] % iArr34[i95];
                int i96 = i95 - 1;
                this.AudioAttributesImplBaseParcelizer = i96;
                this.MediaBrowserCompatMediaItem[i96] = null;
                return 0;
            case 78:
                int[] iArr35 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i97 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i97 + 1;
                iArr35[i97] = 105;
                return 0;
            case 79:
                int[] iArr36 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i98 = this.AudioAttributesImplBaseParcelizer;
                iArr36[i98] = 2;
                this.AudioAttributesImplBaseParcelizer = i98;
                iArr36[i98 - 1] = iArr36[i98 - 1] % iArr36[i98];
                return 0;
            case 80:
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                int i99 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i99 + 1;
                objArr34[i99] = null;
                int[] iArr37 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj15 = objArr34[i99];
                objArr34[i99] = null;
                iArr37[i99] = ((int[]) obj15).length;
                return 0;
            case 81:
                int[] iArr38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i100 + 1;
                iArr38[i100] = 15;
                return 0;
            case 82:
                int[] iArr39 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i101 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i101 + 1;
                iArr39[i101] = 93;
                return 0;
            case 83:
                int[] iArr40 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i102 = this.AudioAttributesImplBaseParcelizer;
                iArr40[i102] = 0;
                this.AudioAttributesImplBaseParcelizer = i102;
                iArr40[i102 - 1] = iArr40[i102 - 1] / iArr40[i102];
                int i103 = i102 - 1;
                this.AudioAttributesImplBaseParcelizer = i103;
                this.MediaBrowserCompatMediaItem[i103] = null;
                return 0;
            case 84:
                int[] iArr41 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i104 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i104 + 1;
                iArr41[i104] = 22;
                return 0;
            case 85:
                int[] iArr42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i105 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i105 + 1;
                iArr42[i105] = 36;
                return 0;
            case 86:
                int i106 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i106;
                int[] iArr43 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr43[6] = iArr43[i106];
                return 0;
            case 87:
                int i107 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i107;
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                Object obj16 = objArr35[i107];
                objArr35[i107] = null;
                objArr35[8] = obj16;
                return 0;
            case 88:
                int i108 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i108;
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr36[i108];
                objArr36[i108] = null;
                objArr36[7] = obj17;
                return 0;
            case 89:
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                int i109 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i109 + 1;
                objArr37[i109] = objArr37[7];
                return 0;
            case 90:
                int[] iArr44 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i110 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i110 + 1;
                iArr44[i110] = iArr44[6];
                return 0;
            case 91:
                int[] iArr45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i111 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i111 + 1;
                iArr45[i111] = 33;
                return 0;
            case 92:
                int[] iArr46 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i112 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i112 + 1;
                iArr46[i112] = 61;
                return 0;
            case 93:
                int[] iArr47 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i113 = this.AudioAttributesImplBaseParcelizer;
                iArr47[i113] = 98;
                this.AudioAttributesImplBaseParcelizer = i113 + 2;
                iArr47[i113 + 1] = 0;
                return 0;
            case 94:
                int i114 = this.AudioAttributesImplBaseParcelizer;
                int i115 = i114 - 1;
                this.AudioAttributesImplBaseParcelizer = i115;
                int[] iArr48 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr48[i114 - 2] = iArr48[i114 - 2] / iArr48[i115];
                return 0;
            case 95:
                int[] iArr49 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i116 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i116 + 1;
                iArr49[i116] = 60;
                return 0;
            case 96:
                int[] iArr50 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i117 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i117 + 1;
                iArr50[i117] = 64;
                return 0;
            case 97:
                int[] iArr51 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i118 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i118 + 1;
                iArr51[i118] = 21;
                return 0;
            case 98:
                int i119 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i119;
                int[] iArr52 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr52[8] = iArr52[i119];
                return 0;
            case 99:
                int i120 = this.AudioAttributesImplBaseParcelizer;
                int i121 = i120 - 1;
                Object[] objArr38 = this.MediaBrowserCompatMediaItem;
                Object obj18 = objArr38[i121];
                objArr38[i121] = null;
                objArr38[9] = obj18;
                this.AudioAttributesImplBaseParcelizer = i120;
                objArr38[i121] = objArr38[5];
                return 0;
            case 100:
                int i122 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i122;
                Object[] objArr39 = this.MediaBrowserCompatMediaItem;
                Object obj19 = objArr39[i122];
                objArr39[i122] = null;
                objArr39[10] = obj19;
                return 0;
            case 101:
                Object[] objArr40 = this.MediaBrowserCompatMediaItem;
                int i123 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i123 + 1;
                objArr40[i123] = objArr40[10];
                return 0;
            case 102:
                int i124 = this.AudioAttributesImplBaseParcelizer;
                int i125 = i124 - 1;
                Object[] objArr41 = this.MediaBrowserCompatMediaItem;
                Object obj20 = objArr41[i125];
                objArr41[i125] = null;
                objArr41[10] = obj20;
                this.AudioAttributesImplBaseParcelizer = i124;
                objArr41[i125] = objArr41[9];
                return 0;
            case 103:
                int[] iArr53 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i126 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i126 + 1;
                iArr53[i126] = iArr53[8];
                return 0;
            case 104:
                int[] iArr54 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i127 = this.AudioAttributesImplBaseParcelizer;
                iArr54[i127] = 69;
                iArr54[i127 - 1] = iArr54[i127 - 1] + iArr54[i127];
                this.AudioAttributesImplBaseParcelizer = i127 + 1;
                iArr54[i127] = iArr54[i127 - 1];
                return 0;
            case 105:
                int i128 = this.AudioAttributesImplBaseParcelizer;
                int i129 = i128 - 1;
                Object[] objArr42 = this.MediaBrowserCompatMediaItem;
                Object obj21 = objArr42[i129];
                objArr42[i129] = null;
                objArr42[5] = obj21;
                this.AudioAttributesImplBaseParcelizer = i128;
                objArr42[i129] = objArr42[9];
                return 0;
            case 106:
                int[] iArr55 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i130 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i130 + 1;
                iArr55[i130] = 56;
                return 0;
            case 107:
                int[] iArr56 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i131 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i131 + 1;
                iArr56[i131] = 84;
                return 0;
            case 108:
                int i132 = this.AudioAttributesImplBaseParcelizer;
                int i133 = i132 - 2;
                this.AudioAttributesImplBaseParcelizer = i133;
                int[] iArr57 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = iArr57[i133] < iArr57[i132 - 1] ? 0 : 1;
                return 0;
            case 109:
                int i134 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i134;
                Object[] objArr43 = this.MediaBrowserCompatMediaItem;
                Object obj22 = objArr43[i134];
                objArr43[i134] = null;
                objArr43[6] = obj22;
                return 0;
            case 110:
                long[] jArr6 = this.RatingCompat;
                int i135 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i135 + 1;
                this.write = jArr6[i135];
                return 0;
            case 111:
                long[] jArr7 = this.RatingCompat;
                int i136 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i136 + 1;
                jArr7[i136] = 0;
                return 0;
            case 112:
                Object[] objArr44 = this.MediaBrowserCompatMediaItem;
                int i137 = this.AudioAttributesImplBaseParcelizer;
                objArr44[i137] = objArr44[7];
                objArr44[i137 + 1] = objArr44[6];
                this.AudioAttributesImplBaseParcelizer = i137 + 3;
                objArr44[i137 + 2] = objArr44[8];
                return 0;
            case 113:
                int i138 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i138;
                long[] jArr8 = this.RatingCompat;
                jArr8[7] = jArr8[i138];
                return 0;
            case 114:
                long[] jArr9 = this.RatingCompat;
                int i139 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i139 + 1;
                jArr9[i139] = jArr9[7];
                return 0;
            case 115:
                this.write = this.RatingCompat[this.AudioAttributesImplBaseParcelizer - 1];
                return 0;
            case 116:
                int[] iArr58 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i140 = this.AudioAttributesImplBaseParcelizer;
                iArr58[i140] = 73;
                iArr58[i140 - 1] = iArr58[i140 - 1] + iArr58[i140];
                this.AudioAttributesImplBaseParcelizer = i140 + 1;
                iArr58[i140] = iArr58[i140 - 1];
                return 0;
            case 117:
                int[] iArr59 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i141 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i141 + 1;
                iArr59[i141] = 51;
                return 0;
            case 118:
                int[] iArr60 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i142 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i142 + 1;
                iArr60[i142] = 75;
                return 0;
            case 119:
                int[] iArr61 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i143 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i143 + 1;
                iArr61[i143] = 17;
                return 0;
            case 120:
                Object[] objArr45 = this.MediaBrowserCompatMediaItem;
                int i144 = this.AudioAttributesImplBaseParcelizer;
                objArr45[i144] = objArr45[7];
                this.AudioAttributesImplBaseParcelizer = i144 + 2;
                objArr45[i144 + 1] = objArr45[6];
                return 0;
            case 121:
                int[] iArr62 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i145 = this.AudioAttributesImplBaseParcelizer;
                iArr62[i145] = 27;
                iArr62[i145 - 1] = iArr62[i145 - 1] + iArr62[i145];
                this.AudioAttributesImplBaseParcelizer = i145 + 1;
                iArr62[i145] = iArr62[i145 - 1];
                return 0;
            case 122:
                int[] iArr63 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i146 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i146 + 1;
                iArr63[i146] = 3;
                return 0;
            case 123:
                int i147 = this.AudioAttributesImplBaseParcelizer;
                int i148 = i147 - 1;
                int[] iArr64 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr64[i147 - 2] = iArr64[i147 - 2] + iArr64[i148];
                this.AudioAttributesImplBaseParcelizer = i147;
                iArr64[i148] = iArr64[i147 - 2];
                return 0;
            case 124:
                int[] iArr65 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i149 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i149 + 1;
                iArr65[i149] = 103;
                return 0;
            case 125:
                int[] iArr66 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i150 = this.AudioAttributesImplBaseParcelizer;
                iArr66[i150] = 17;
                iArr66[i150 - 1] = iArr66[i150 - 1] + iArr66[i150];
                this.AudioAttributesImplBaseParcelizer = i150 + 1;
                iArr66[i150] = iArr66[i150 - 1];
                return 0;
            case 126:
                int i151 = this.AudioAttributesImplBaseParcelizer;
                int i152 = i151 - 1;
                this.AudioAttributesImplBaseParcelizer = i152;
                int[] iArr67 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr67[i151 - 2] = iArr67[i151 - 2] - iArr67[i152];
                return 0;
            case 127:
                int[] iArr68 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i153 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i153 + 1;
                iArr68[i153] = 47;
                return 0;
            case 128:
                int[] iArr69 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i154 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i154 + 1;
                iArr69[i154] = 94;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int i155 = this.AudioAttributesImplBaseParcelizer;
                int i156 = i155 - 1;
                Object[] objArr46 = this.MediaBrowserCompatMediaItem;
                Object obj23 = objArr46[i156];
                objArr46[i156] = null;
                objArr46[7] = obj23;
                this.AudioAttributesImplBaseParcelizer = i155;
                objArr46[i156] = objArr46[6];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                Object[] objArr47 = this.MediaBrowserCompatMediaItem;
                int i157 = this.AudioAttributesImplBaseParcelizer;
                objArr47[i157] = objArr47[7];
                this.AudioAttributesImplBaseParcelizer = i157 + 2;
                objArr47[i157 + 1] = objArr47[5];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr70 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i158 = this.AudioAttributesImplBaseParcelizer;
                iArr70[i158] = 11;
                iArr70[i158 - 1] = iArr70[i158 - 1] + iArr70[i158];
                this.AudioAttributesImplBaseParcelizer = i158 + 1;
                iArr70[i158] = iArr70[i158 - 1];
                return 0;
            case 132:
                this.MediaBrowserCompatMediaItem[7] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 133:
                Object[] objArr48 = this.MediaBrowserCompatMediaItem;
                int i159 = this.AudioAttributesImplBaseParcelizer;
                objArr48[i159] = objArr48[6];
                this.AudioAttributesImplBaseParcelizer = i159 + 2;
                objArr48[i159 + 1] = objArr48[7];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                this.MediaBrowserCompatMediaItem[6] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int i160 = this.AudioAttributesImplBaseParcelizer;
                int i161 = i160 - 1;
                Object[] objArr49 = this.MediaBrowserCompatMediaItem;
                Object obj24 = objArr49[i161];
                objArr49[i161] = null;
                objArr49[7] = obj24;
                this.AudioAttributesImplBaseParcelizer = i160;
                objArr49[i161] = obj24;
                return 0;
            case 136:
                Object[] objArr50 = this.MediaBrowserCompatMediaItem;
                int i162 = this.AudioAttributesImplBaseParcelizer;
                objArr50[i162] = objArr50[i162 - 1];
                this.AudioAttributesImplBaseParcelizer = i162;
                Object obj25 = objArr50[i162];
                objArr50[i162] = null;
                objArr50[7] = obj25;
                return 0;
            case 137:
                int i163 = this.AudioAttributesImplBaseParcelizer;
                int i164 = i163 - 1;
                Object[] objArr51 = this.MediaBrowserCompatMediaItem;
                objArr51[i164] = null;
                objArr51[i164] = null;
                int i165 = i163 - 1;
                this.AudioAttributesImplBaseParcelizer = i165;
                Object obj26 = objArr51[i165];
                objArr51[i165] = null;
                objArr51[6] = obj26;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int i166 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i166;
                Object[] objArr52 = this.MediaBrowserCompatMediaItem;
                Object obj27 = objArr52[i166];
                objArr52[i166] = null;
                this.IconCompatParcelizer = obj27 == null ? 0 : 1;
                return 0;
            case 139:
                int i167 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i167;
                Object[] objArr53 = this.MediaBrowserCompatMediaItem;
                Object obj28 = objArr53[i167];
                objArr53[i167] = null;
                objArr53[11] = obj28;
                return 0;
            case 140:
                Object[] objArr54 = this.MediaBrowserCompatMediaItem;
                int i168 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i168 + 1;
                objArr54[i168] = objArr54[11];
                return 0;
            case 141:
                int i169 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i169;
                Object[] objArr55 = this.MediaBrowserCompatMediaItem;
                Object obj29 = objArr55[i169];
                objArr55[i169] = null;
                objArr55[12] = obj29;
                return 0;
            case 142:
                Object[] objArr56 = this.MediaBrowserCompatMediaItem;
                int i170 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i170 + 1;
                objArr56[i170] = objArr56[12];
                return 0;
            case 143:
                int i171 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i171;
                Object[] objArr57 = this.MediaBrowserCompatMediaItem;
                Object obj30 = objArr57[i171];
                objArr57[i171] = null;
                objArr57[13] = obj30;
                return 0;
            case 144:
                Object[] objArr58 = this.MediaBrowserCompatMediaItem;
                int i172 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i172 + 1;
                objArr58[i172] = objArr58[13];
                return 0;
            case 145:
                Object[] objArr59 = this.MediaBrowserCompatMediaItem;
                int i173 = this.AudioAttributesImplBaseParcelizer;
                objArr59[i173] = objArr59[i173 - 1];
                Object obj31 = objArr59[i173];
                objArr59[i173] = null;
                objArr59[8] = obj31;
                int i174 = i173 - 1;
                this.AudioAttributesImplBaseParcelizer = i174;
                Object obj32 = objArr59[i174];
                objArr59[i174] = null;
                objArr59[9] = obj32;
                return 0;
            case 146:
                int i175 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i175;
                Object[] objArr60 = this.MediaBrowserCompatMediaItem;
                Object obj33 = objArr60[i175];
                objArr60[i175] = null;
                objArr60[14] = obj33;
                return 0;
            case 147:
                Object[] objArr61 = this.MediaBrowserCompatMediaItem;
                int i176 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i176 + 1;
                objArr61[i176] = objArr61[14];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                Object[] objArr62 = this.MediaBrowserCompatMediaItem;
                int i177 = this.AudioAttributesImplBaseParcelizer;
                objArr62[i177] = objArr62[10];
                objArr62[i177 + 1] = objArr62[12];
                this.AudioAttributesImplBaseParcelizer = i177 + 3;
                objArr62[i177 + 2] = objArr62[14];
                return 0;
            case 149:
                int[] iArr71 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i178 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i178 + 1;
                iArr71[i178] = 83;
                return 0;
            case 150:
                int[] iArr72 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i179 = this.AudioAttributesImplBaseParcelizer;
                iArr72[i179] = 89;
                this.AudioAttributesImplBaseParcelizer = i179 + 2;
                iArr72[i179 + 1] = 0;
                return 0;
            case 151:
                int[] iArr73 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i180 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i180 + 1;
                iArr73[i180] = 27;
                return 0;
            case 152:
                int[] iArr74 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i181 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i181 + 1;
                iArr74[i181] = 5;
                return 0;
            case 153:
                int[] iArr75 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i182 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i182 + 1;
                iArr75[i182] = 4;
                return 0;
            case 154:
                int[] iArr76 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i183 = this.AudioAttributesImplBaseParcelizer;
                iArr76[i183] = 69;
                this.AudioAttributesImplBaseParcelizer = i183;
                iArr76[i183 - 1] = iArr76[i183 - 1] + iArr76[i183];
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr77 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i184 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i184 + 1;
                iArr77[i184] = 73;
                return 0;
            case 156:
                int[] iArr78 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i185 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i185 + 1;
                iArr78[i185] = 98;
                return 0;
            case 157:
                int i186 = this.AudioAttributesImplBaseParcelizer;
                int i187 = i186 - 1;
                Object[] objArr63 = this.MediaBrowserCompatMediaItem;
                Object obj34 = objArr63[i187];
                objArr63[i187] = null;
                objArr63[9] = obj34;
                int[] iArr79 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplBaseParcelizer = i186;
                iArr79[i187] = 0;
                return 0;
            case 158:
                int i188 = this.AudioAttributesImplBaseParcelizer;
                int i189 = i188 - 3;
                this.AudioAttributesImplBaseParcelizer = i189;
                Object[] objArr64 = this.MediaBrowserCompatMediaItem;
                Object obj35 = objArr64[i189];
                objArr64[i189] = null;
                int i190 = this.MediaBrowserCompatCustomActionResultReceiver[i188 - 2];
                Object obj36 = objArr64[i188 - 1];
                objArr64[i188 - 1] = null;
                ((Object[]) obj35)[i190] = obj36;
                return 0;
            case 159:
                int[] iArr80 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i191 = this.AudioAttributesImplBaseParcelizer;
                iArr80[i191] = 2;
                this.AudioAttributesImplBaseParcelizer = i191 + 2;
                iArr80[i191 + 1] = 496;
                return 0;
            case 160:
                int i192 = this.AudioAttributesImplBaseParcelizer;
                int i193 = i192 - 3;
                this.AudioAttributesImplBaseParcelizer = i193;
                Object[] objArr65 = this.MediaBrowserCompatMediaItem;
                Object obj37 = objArr65[i193];
                objArr65[i193] = null;
                int i194 = this.MediaBrowserCompatCustomActionResultReceiver[i192 - 2];
                Object obj38 = objArr65[i192 - 1];
                objArr65[i192 - 1] = null;
                ((Object[]) obj37)[i194] = obj38;
                this.AudioAttributesImplBaseParcelizer = i192 - 2;
                objArr65[i193] = objArr65[9];
                return 0;
            case 161:
                int[] iArr81 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i195 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i195 + 1;
                iArr81[i195] = 3;
                return 0;
            case 162:
                int[] iArr82 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i196 = this.AudioAttributesImplBaseParcelizer;
                iArr82[i196] = 4;
                Object[] objArr66 = this.MediaBrowserCompatMediaItem;
                objArr66[i196 + 1] = objArr66[5];
                int i197 = i196 - 1;
                this.AudioAttributesImplBaseParcelizer = i197;
                Object obj39 = objArr66[i197];
                objArr66[i197] = null;
                int i198 = iArr82[i196];
                Object obj40 = objArr66[i196 + 1];
                objArr66[i196 + 1] = null;
                ((Object[]) obj39)[i198] = obj40;
                return 0;
            case 163:
                int[] iArr83 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i199 = this.AudioAttributesImplBaseParcelizer;
                iArr83[i199] = 121;
                iArr83[i199 - 1] = iArr83[i199 - 1] + iArr83[i199];
                this.AudioAttributesImplBaseParcelizer = i199 + 1;
                iArr83[i199] = iArr83[i199 - 1];
                return 0;
            case 164:
                int[] iArr84 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i200 = this.AudioAttributesImplBaseParcelizer;
                iArr84[i200] = 39;
                this.AudioAttributesImplBaseParcelizer = i200;
                iArr84[i200 - 1] = iArr84[i200 - 1] + iArr84[i200];
                return 0;
            case 165:
                int[] iArr85 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i201 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i201 + 1;
                iArr85[i201] = 39;
                return 0;
            case 166:
                int i202 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i202;
                int[] iArr86 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr86[5] = iArr86[i202];
                return 0;
            case 167:
                int i203 = this.AudioAttributesImplBaseParcelizer;
                int i204 = i203 - 2;
                this.AudioAttributesImplBaseParcelizer = i204;
                int[] iArr87 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = iArr87[i204] != iArr87[i203 - 1] ? 0 : 1;
                return 0;
            case 168:
                int[] iArr88 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i205 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i205 + 1;
                iArr88[i205] = iArr88[5];
                return 0;
            case 169:
                int[] iArr89 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i206 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i206 + 1;
                iArr89[i206] = 23;
                return 0;
            case 170:
                int[] iArr90 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i207 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i207 + 1;
                iArr90[i207] = 89;
                return 0;
            case 171:
                int[] iArr91 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i208 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i208 + 1;
                iArr91[i208] = 38;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr92 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i209 = this.AudioAttributesImplBaseParcelizer;
                iArr92[i209] = 9;
                iArr92[i209 - 1] = iArr92[i209 - 1] + iArr92[i209];
                this.AudioAttributesImplBaseParcelizer = i209 + 1;
                iArr92[i209] = iArr92[i209 - 1];
                return 0;
            case 173:
                int[] iArr93 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i210 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i210 + 1;
                iArr93[i210] = 29;
                return 0;
            case 174:
                int[] iArr94 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i211 = this.AudioAttributesImplBaseParcelizer;
                iArr94[i211] = iArr94[i211 - 1];
                this.AudioAttributesImplBaseParcelizer = i211 + 2;
                iArr94[i211 + 1] = 128;
                return 0;
            case 175:
                Object[] objArr67 = this.MediaBrowserCompatMediaItem;
                int i212 = this.AudioAttributesImplBaseParcelizer;
                objArr67[i212] = objArr67[i212 - 1];
                this.AudioAttributesImplBaseParcelizer = i212;
                Object obj41 = objArr67[i212];
                objArr67[i212] = null;
                objArr67[6] = obj41;
                return 0;
            case 176:
                int[] iArr95 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i213 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i213 + 1;
                iArr95[i213] = 8;
                return 0;
            case 177:
                int i214 = this.AudioAttributesImplBaseParcelizer;
                int i215 = i214 - 2;
                this.AudioAttributesImplBaseParcelizer = i215;
                int[] iArr96 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = iArr96[i215] > iArr96[i214 - 1] ? 0 : 1;
                return 0;
            case 178:
                int[] iArr97 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i216 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i216 + 1;
                iArr97[i216] = 14;
                return 0;
            case 179:
                Object[] objArr68 = this.MediaBrowserCompatMediaItem;
                int i217 = this.AudioAttributesImplBaseParcelizer;
                objArr68[i217] = objArr68[6];
                Object obj42 = objArr68[i217];
                objArr68[i217] = null;
                objArr68[5] = obj42;
                this.AudioAttributesImplBaseParcelizer = i217 + 1;
                objArr68[i217] = objArr68[6];
                return 0;
            case 180:
                Object[] objArr69 = this.MediaBrowserCompatMediaItem;
                int i218 = this.AudioAttributesImplBaseParcelizer;
                objArr69[i218] = objArr69[6];
                this.AudioAttributesImplBaseParcelizer = i218;
                Object obj43 = objArr69[i218];
                objArr69[i218] = null;
                objArr69[5] = obj43;
                return 0;
            case 181:
                int[] iArr98 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i219 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i219 + 1;
                iArr98[i219] = 12;
                return 0;
            case 182:
                Object[] objArr70 = this.MediaBrowserCompatMediaItem;
                int i220 = this.AudioAttributesImplBaseParcelizer;
                objArr70[i220] = objArr70[5];
                Object obj44 = objArr70[i220];
                objArr70[i220] = null;
                objArr70[6] = obj44;
                this.AudioAttributesImplBaseParcelizer = i220 + 1;
                objArr70[i220] = objArr70[5];
                return 0;
            case 183:
                Object[] objArr71 = this.MediaBrowserCompatMediaItem;
                int i221 = this.AudioAttributesImplBaseParcelizer;
                objArr71[i221] = objArr71[5];
                int[] iArr99 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplBaseParcelizer = i221 + 2;
                iArr99[i221 + 1] = 1;
                return 0;
            case 184:
                int i222 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i222;
                long[] jArr10 = this.RatingCompat;
                jArr10[6] = jArr10[i222];
                return 0;
            case 185:
                int[] iArr100 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i223 = this.AudioAttributesImplBaseParcelizer;
                iArr100[i223] = 91;
                long[] jArr11 = this.RatingCompat;
                this.AudioAttributesImplBaseParcelizer = i223 + 2;
                jArr11[i223 + 1] = jArr11[6];
                return 0;
            case 186:
                int[] iArr101 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i224 = this.AudioAttributesImplBaseParcelizer;
                iArr101[i224] = 1;
                this.AudioAttributesImplBaseParcelizer = i224;
                iArr101[i224 - 1] = iArr101[i224 - 1] + iArr101[i224];
                return 0;
            case 187:
                int[] iArr102 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i225 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i225 + 1;
                iArr102[i225] = 111;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr103 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i226 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i226 + 1;
                iArr103[i226] = 87;
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr104 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i227 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i227 + 1;
                iArr104[i227] = 19;
                return 0;
            case 190:
                int[] iArr105 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i228 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i228 + 1;
                iArr105[i228] = 80;
                return 0;
            case 191:
                int[] iArr106 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i229 = this.AudioAttributesImplBaseParcelizer;
                iArr106[i229] = -1;
                this.AudioAttributesImplBaseParcelizer = i229 + 2;
                iArr106[i229 + 1] = iArr106[7];
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int i230 = this.AudioAttributesImplBaseParcelizer;
                int i231 = i230 - 2;
                this.AudioAttributesImplBaseParcelizer = i231;
                int[] iArr107 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = iArr107[i231] == iArr107[i230 - 1] ? 0 : 1;
                return 0;
            case 193:
                Object[] objArr72 = this.MediaBrowserCompatMediaItem;
                int i232 = this.AudioAttributesImplBaseParcelizer;
                objArr72[i232] = objArr72[6];
                int[] iArr108 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplBaseParcelizer = i232 + 2;
                iArr108[i232 + 1] = iArr108[7];
                return 0;
            case 194:
                int i233 = this.AudioAttributesImplBaseParcelizer;
                int i234 = i233 - 1;
                Object[] objArr73 = this.MediaBrowserCompatMediaItem;
                Object obj45 = objArr73[i234];
                objArr73[i234] = null;
                objArr73[7] = obj45;
                int i235 = i233 - 2;
                this.AudioAttributesImplBaseParcelizer = i235;
                Object obj46 = objArr73[i235];
                objArr73[i235] = null;
                objArr73[5] = obj46;
                return 0;
            case 195:
                int[] iArr109 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i236 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i236 + 1;
                iArr109[i236] = 123;
                return 0;
            case 196:
                int[] iArr110 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i237 = this.AudioAttributesImplBaseParcelizer;
                iArr110[i237] = 121;
                this.AudioAttributesImplBaseParcelizer = i237;
                iArr110[i237 - 1] = iArr110[i237 - 1] + iArr110[i237];
                return 0;
            case 197:
                int[] iArr111 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i238 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i238 + 1;
                iArr111[i238] = 97;
                return 0;
            case 198:
                int[] iArr112 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i239 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i239 + 1;
                iArr112[i239] = 16;
                return 0;
            case 199:
                int[] iArr113 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i240 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i240 + 1;
                iArr113[i240] = 11;
                return 0;
            case 200:
                int i241 = this.AudioAttributesImplBaseParcelizer;
                int i242 = i241 - 1;
                Object[] objArr74 = this.MediaBrowserCompatMediaItem;
                Object obj47 = objArr74[i242];
                objArr74[i242] = null;
                objArr74[7] = obj47;
                objArr74[i242] = objArr74[5];
                this.AudioAttributesImplBaseParcelizer = i241 + 1;
                objArr74[i241] = objArr74[7];
                return 0;
            case 201:
                int[] iArr114 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i243 = this.AudioAttributesImplBaseParcelizer;
                iArr114[i243] = 47;
                this.AudioAttributesImplBaseParcelizer = i243 + 2;
                iArr114[i243 + 1] = 0;
                return 0;
            case 202:
                int[] iArr115 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i244 = this.AudioAttributesImplBaseParcelizer;
                iArr115[i244] = iArr115[6];
                this.AudioAttributesImplBaseParcelizer = i244 + 2;
                iArr115[i244 + 1] = 60;
                return 0;
            case 203:
                int[] iArr116 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i245 = this.AudioAttributesImplBaseParcelizer;
                iArr116[i245] = iArr116[i245 - 1];
                iArr116[6] = iArr116[i245];
                this.AudioAttributesImplBaseParcelizer = i245 + 1;
                iArr116[i245] = 1;
                return 0;
            case 204:
                int[] iArr117 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i246 = this.AudioAttributesImplBaseParcelizer;
                iArr117[i246] = 43;
                this.AudioAttributesImplBaseParcelizer = i246;
                iArr117[i246 - 1] = iArr117[i246 - 1] + iArr117[i246];
                return 0;
            case 205:
                int[] iArr118 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i247 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i247 + 1;
                iArr118[i247] = 99;
                return 0;
            case 206:
                int[] iArr119 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i248 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i248 + 1;
                iArr119[i248] = 53;
                return 0;
            case 207:
                int[] iArr120 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i249 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i249 + 1;
                iArr120[i249] = 70;
                return 0;
            case 208:
                int[] iArr121 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i250 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i250 + 1;
                iArr121[i250] = 88;
                return 0;
            case 209:
                int[] iArr122 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i251 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i251 + 1;
                iArr122[i251] = 65;
                return 0;
            case 210:
                int[] iArr123 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i252 = this.AudioAttributesImplBaseParcelizer;
                iArr123[i252] = 119;
                this.AudioAttributesImplBaseParcelizer = i252;
                iArr123[i252 - 1] = iArr123[i252 - 1] + iArr123[i252];
                return 0;
            case 211:
                int[] iArr124 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i253 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i253 + 1;
                iArr124[i253] = 31;
                return 0;
            case 212:
                int[] iArr125 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i254 = this.AudioAttributesImplBaseParcelizer;
                iArr125[i254] = 85;
                iArr125[i254 - 1] = iArr125[i254 - 1] + iArr125[i254];
                this.AudioAttributesImplBaseParcelizer = i254 + 1;
                iArr125[i254] = iArr125[i254 - 1];
                return 0;
            case 213:
                int[] iArr126 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i255 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i255 + 1;
                iArr126[i255] = 72;
                return 0;
            case 214:
                int[] iArr127 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i256 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i256 + 1;
                iArr127[i256] = 13;
                return 0;
            case 215:
                int[] iArr128 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i257 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i257 + 1;
                iArr128[i257] = 86;
                return 0;
            case 216:
                int[] iArr129 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i258 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i258 + 1;
                iArr129[i258] = 78;
                return 0;
            default:
                return i;
        }
    }

    public addVisibilityListener(Object obj, Object obj2) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.RatingCompat = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaDescriptionCompat = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public addVisibilityListener(Object obj, Object obj2, Object obj3) {
        this.MediaBrowserCompatCustomActionResultReceiver = new int[19];
        this.RatingCompat = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaDescriptionCompat = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public addVisibilityListener(Object obj, int i) {
        int[] iArr = new int[19];
        this.MediaBrowserCompatCustomActionResultReceiver = iArr;
        this.RatingCompat = new long[19];
        this.MediaMetadataCompat = new float[19];
        this.MediaDescriptionCompat = new double[19];
        Object[] objArr = new Object[19];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[5] = obj;
        iArr[6] = i;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }
}
