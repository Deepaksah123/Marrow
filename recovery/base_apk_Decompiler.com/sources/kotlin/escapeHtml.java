package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes5.dex */
public class escapeHtml {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private final int[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private final double[] MediaBrowserCompatCustomActionResultReceiver;
    private final float[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    private int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    public escapeHtml(Object obj, Object obj2) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        objArr[21] = obj2;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i2 = this.RemoteActionCompatParcelizer;
                objArr[i2] = objArr[20];
                this.RemoteActionCompatParcelizer = i2 + 2;
                objArr[i2 + 1] = objArr[21];
                return 0;
            case 2:
                int i3 = this.RemoteActionCompatParcelizer - this.read;
                this.RemoteActionCompatParcelizer = i3;
                this.AudioAttributesImplApi21Parcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.IconCompatParcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i5 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i5 + 1;
                objArr3[i5] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 5:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i6 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i6 + 1;
                iArr[i6] = 2;
                return 0;
            case 6:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i7 = this.RemoteActionCompatParcelizer;
                iArr2[i7] = 2;
                this.RemoteActionCompatParcelizer = i7;
                iArr2[i7 - 1] = iArr2[i7 - 1] % iArr2[i7];
                return 0;
            case 7:
                int i8 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i8;
                this.MediaBrowserCompatMediaItem[i8] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                int i9 = this.RemoteActionCompatParcelizer;
                Object obj2 = objArr4[i9 - 1];
                objArr4[i9 - 1] = null;
                this.IconCompatParcelizer = obj2;
                return 0;
            case 10:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i10 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i10 + 1;
                iArr3[i10] = this.read;
            case 9:
                return 0;
            case 11:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i11 + 1;
                iArr4[i11] = 3322;
                return 0;
            case 12:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                this.write = iArr5[i12];
                return 0;
            case 13:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i13 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i13 + 2;
                iArr6[i13 + 1] = iArr6[i13 - 1];
                iArr6[i13] = iArr6[i13 - 2];
                return 0;
            case 14:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i14 = this.RemoteActionCompatParcelizer;
                iArr7[i14] = -1;
                iArr7[i14 + 2] = iArr7[i14];
                iArr7[i14 + 1] = iArr7[i14 - 1];
                this.RemoteActionCompatParcelizer = i14 + 4;
                iArr7[i14 + 3] = -1;
                return 0;
            case 15:
                int i15 = this.RemoteActionCompatParcelizer;
                int i16 = i15 - 1;
                this.RemoteActionCompatParcelizer = i16;
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                iArr8[i15 - 2] = iArr8[i15 - 2] ^ iArr8[i16];
                return 0;
            case 16:
                int i17 = this.RemoteActionCompatParcelizer;
                int i18 = i17 - 1;
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i17 - 2] = iArr9[i17 - 2] & iArr9[i18];
                this.RemoteActionCompatParcelizer = i17;
                int i19 = iArr9[i17 - 2];
                iArr9[i18] = i19;
                iArr9[i17 - 2] = iArr9[i17 - 3];
                iArr9[i17 - 3] = iArr9[i17 - 4];
                iArr9[i17 - 4] = i19;
                return 0;
            case 17:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i20 = this.RemoteActionCompatParcelizer;
                int i21 = iArr10[i20 - 1];
                iArr10[i20 - 1] = iArr10[i20 - 2];
                iArr10[i20 - 2] = i21;
                iArr10[i20] = -1;
                this.RemoteActionCompatParcelizer = i20;
                iArr10[i20 - 1] = iArr10[i20] ^ iArr10[i20 - 1];
                return 0;
            case 18:
                int i22 = this.RemoteActionCompatParcelizer;
                int i23 = i22 - 1;
                this.RemoteActionCompatParcelizer = i23;
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                iArr11[i22 - 2] = iArr11[i22 - 2] & iArr11[i23];
                return 0;
            case 19:
                int i24 = this.RemoteActionCompatParcelizer;
                int i25 = i24 - 1;
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                iArr12[i24 - 2] = iArr12[i24 - 2] | iArr12[i25];
                iArr12[i24] = iArr12[i24 - 2];
                iArr12[i25] = iArr12[i24 - 3];
                this.RemoteActionCompatParcelizer = i24 + 2;
                iArr12[i24 + 1] = -1;
                return 0;
            case 20:
                int i26 = this.RemoteActionCompatParcelizer;
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                iArr13[i26 - 2] = iArr13[i26 - 1] ^ iArr13[i26 - 2];
                int i27 = i26 - 2;
                this.RemoteActionCompatParcelizer = i27;
                this.MediaBrowserCompatMediaItem[i27] = null;
                return 0;
            case 21:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i28 + 1;
                int i29 = iArr14[i28 - 1];
                iArr14[i28] = i29;
                iArr14[i28 - 1] = iArr14[i28 - 2];
                iArr14[i28 - 2] = iArr14[i28 - 3];
                iArr14[i28 - 3] = i29;
                return 0;
            case 22:
                int i30 = this.RemoteActionCompatParcelizer;
                int i31 = i30 - 1;
                this.RemoteActionCompatParcelizer = i31;
                this.MediaBrowserCompatMediaItem[i31] = null;
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i32 = iArr15[i30 - 2];
                iArr15[i30 - 2] = iArr15[i30 - 3];
                iArr15[i30 - 3] = i32;
                return 0;
            case 23:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i33 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i33 + 1;
                iArr16[i33] = -1;
                return 0;
            case 24:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i34 = this.RemoteActionCompatParcelizer;
                iArr17[i34 + 1] = iArr17[i34 - 1];
                iArr17[i34] = iArr17[i34 - 2];
                int i35 = i34 + 1;
                this.RemoteActionCompatParcelizer = i35;
                iArr17[i34] = iArr17[i34] & iArr17[i35];
                return 0;
            case 25:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i36 = this.RemoteActionCompatParcelizer;
                iArr18[i36] = -1;
                this.RemoteActionCompatParcelizer = i36;
                iArr18[i36 - 1] = iArr18[i36] ^ iArr18[i36 - 1];
                return 0;
            case 26:
                int i37 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i37 - 1] = null;
                int i38 = i37 - 2;
                this.RemoteActionCompatParcelizer = i38;
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                iArr19[i37 - 3] = iArr19[i37 - 3] | iArr19[i38];
                return 0;
            case 27:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i39 = this.RemoteActionCompatParcelizer;
                iArr20[i39 + 1] = iArr20[i39 - 1];
                iArr20[i39] = iArr20[i39 - 2];
                iArr20[i39 + 2] = -1;
                int i40 = i39 + 2;
                this.RemoteActionCompatParcelizer = i40;
                iArr20[i39 + 1] = iArr20[i39 + 1] ^ iArr20[i40];
                return 0;
            case 28:
                int i41 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i41 - 1] = null;
                int i42 = i41 - 2;
                this.RemoteActionCompatParcelizer = i42;
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i41 - 3] = iArr21[i41 - 3] & iArr21[i42];
                return 0;
            case 29:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i43 = this.RemoteActionCompatParcelizer;
                iArr22[i43 + 1] = iArr22[i43 - 1];
                iArr22[i43] = iArr22[i43 - 2];
                int i44 = i43 + 1;
                iArr22[i43] = iArr22[i43] ^ iArr22[i44];
                this.RemoteActionCompatParcelizer = i43 + 2;
                int i45 = iArr22[i43];
                iArr22[i44] = i45;
                iArr22[i43] = iArr22[i43 - 1];
                iArr22[i43 - 1] = iArr22[i43 - 2];
                iArr22[i43 - 2] = i45;
                return 0;
            case 30:
                int i46 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i46 - 1] = null;
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                iArr23[i46 - 3] = iArr23[i46 - 2] & iArr23[i46 - 3];
                int i47 = i46 - 3;
                this.RemoteActionCompatParcelizer = i47;
                iArr23[i46 - 4] = iArr23[i46 - 4] | iArr23[i47];
                return 0;
            case 31:
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                int i48 = this.RemoteActionCompatParcelizer;
                iArr24[i48] = 8;
                this.RemoteActionCompatParcelizer = i48;
                iArr24[i48 - 1] = iArr24[i48 - 1] >> iArr24[i48];
                return 0;
            case 32:
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i49 + 1;
                iArr25[i49] = 1;
                return 0;
            case 33:
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                int i50 = this.RemoteActionCompatParcelizer;
                iArr26[i50 + 1] = iArr26[i50 - 1];
                iArr26[i50] = iArr26[i50 - 2];
                this.RemoteActionCompatParcelizer = i50 + 3;
                iArr26[i50 + 2] = -1;
                return 0;
            case 34:
                int i51 = this.RemoteActionCompatParcelizer;
                int i52 = i51 - 1;
                this.MediaBrowserCompatMediaItem[i52] = null;
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                this.RemoteActionCompatParcelizer = i51 + 1;
                iArr27[i51] = iArr27[i51 - 2];
                iArr27[i52] = iArr27[i51 - 3];
                return 0;
            case 35:
                int i53 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i53;
                this.write = this.AudioAttributesImplBaseParcelizer[i53] == 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                int i54 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i54 + 1;
                iArr28[i54] = 5875;
                return 0;
            case 37:
                int i55 = this.RemoteActionCompatParcelizer;
                int i56 = i55 - 1;
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                iArr29[i55 - 2] = iArr29[i55 - 2] & iArr29[i56];
                iArr29[i56] = -1;
                this.RemoteActionCompatParcelizer = i55 + 2;
                iArr29[i55 + 1] = iArr29[i55 - 1];
                iArr29[i55] = iArr29[i55 - 2];
                return 0;
            case 38:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i57 = this.RemoteActionCompatParcelizer;
                iArr30[i57] = -1;
                iArr30[i57 - 1] = iArr30[i57 - 1] ^ iArr30[i57];
                int i58 = i57 - 1;
                this.RemoteActionCompatParcelizer = i58;
                iArr30[i57 - 2] = iArr30[i57 - 2] & iArr30[i58];
                return 0;
            case 39:
                int i59 = this.RemoteActionCompatParcelizer;
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                iArr31[i59 - 2] = iArr31[i59 - 1] & iArr31[i59 - 2];
                int i60 = i59 - 2;
                iArr31[i59 - 3] = iArr31[i59 - 3] | iArr31[i60];
                this.RemoteActionCompatParcelizer = i59 - 1;
                int i61 = iArr31[i59 - 3];
                iArr31[i60] = i61;
                iArr31[i59 - 3] = iArr31[i59 - 4];
                iArr31[i59 - 4] = iArr31[i59 - 5];
                iArr31[i59 - 5] = i61;
                return 0;
            case 40:
                int i62 = this.RemoteActionCompatParcelizer;
                int i63 = i62 - 1;
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                iArr32[i62 - 2] = iArr32[i62 - 2] & iArr32[i63];
                iArr32[i63] = 5;
                int i64 = i62 - 1;
                this.RemoteActionCompatParcelizer = i64;
                iArr32[i62 - 2] = iArr32[i62 - 2] >> iArr32[i64];
                return 0;
            case 41:
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                int i65 = this.RemoteActionCompatParcelizer;
                int i66 = iArr33[i65 - 1];
                iArr33[i65] = i66;
                iArr33[i65 - 1] = iArr33[i65 - 2];
                iArr33[i65 - 2] = iArr33[i65 - 3];
                iArr33[i65 - 3] = i66;
                this.RemoteActionCompatParcelizer = i65;
                this.MediaBrowserCompatMediaItem[i65] = null;
                int i67 = iArr33[i65 - 1];
                iArr33[i65 - 1] = iArr33[i65 - 2];
                iArr33[i65 - 2] = i67;
                return 0;
            case 42:
                int i68 = this.RemoteActionCompatParcelizer;
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                iArr34[i68 - 2] = iArr34[i68 - 1] & iArr34[i68 - 2];
                int i69 = i68 - 2;
                this.RemoteActionCompatParcelizer = i69;
                iArr34[i68 - 3] = iArr34[i68 - 3] | iArr34[i69];
                return 0;
            case 43:
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                int i70 = this.RemoteActionCompatParcelizer;
                iArr35[i70] = -1;
                iArr35[i70 - 1] = iArr35[i70 - 1] ^ iArr35[i70];
                this.RemoteActionCompatParcelizer = i70 + 1;
                int i71 = iArr35[i70 - 1];
                iArr35[i70] = i71;
                iArr35[i70 - 1] = iArr35[i70 - 2];
                iArr35[i70 - 2] = iArr35[i70 - 3];
                iArr35[i70 - 3] = i71;
                return 0;
            case 44:
                int i72 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i72;
                this.write = this.AudioAttributesImplBaseParcelizer[i72] != 0 ? 0 : 1;
                return 0;
            case 45:
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                int i73 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i73 + 1;
                iArr36[i73] = 84;
                return 0;
            case 46:
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                int i74 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i74 + 1;
                iArr37[i74] = 0;
                return 0;
            case 47:
                int i75 = this.RemoteActionCompatParcelizer;
                int i76 = i75 - 1;
                this.RemoteActionCompatParcelizer = i76;
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                iArr38[i75 - 2] = iArr38[i75 - 2] / iArr38[i76];
                int i77 = i75 - 2;
                this.RemoteActionCompatParcelizer = i77;
                this.MediaBrowserCompatMediaItem[i77] = null;
                return 0;
            case 48:
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                int i78 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i78;
                this.write = iArr39[i78];
                return 0;
            case 49:
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                int i79 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i79 + 1;
                iArr40[i79] = 93;
                return 0;
            case 50:
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                int i80 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i80 + 1;
                iArr41[i80] = 62;
                return 0;
            case 51:
                for (int i81 = this.RemoteActionCompatParcelizer - 1; i81 >= 0; i81--) {
                    this.MediaBrowserCompatMediaItem[i81] = null;
                }
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                this.RemoteActionCompatParcelizer = 1;
                objArr5[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 52:
                int i82 = this.RemoteActionCompatParcelizer;
                int i83 = i82 - 1;
                this.RemoteActionCompatParcelizer = i83;
                int[] iArr42 = this.AudioAttributesImplBaseParcelizer;
                iArr42[i82 - 2] = iArr42[i82 - 2] % iArr42[i83];
                return 0;
            case 53:
                int[] iArr43 = this.AudioAttributesImplBaseParcelizer;
                int i84 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i84 + 1;
                iArr43[i84] = 4703;
                return 0;
            case 54:
                int[] iArr44 = this.AudioAttributesImplBaseParcelizer;
                int i85 = this.RemoteActionCompatParcelizer;
                iArr44[i85 + 1] = iArr44[i85 - 1];
                iArr44[i85] = iArr44[i85 - 2];
                iArr44[i85 + 2] = -1;
                this.RemoteActionCompatParcelizer = i85 + 5;
                iArr44[i85 + 4] = iArr44[i85 + 2];
                iArr44[i85 + 3] = iArr44[i85 + 1];
                return 0;
            case 55:
                int i86 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i86 - 1] = null;
                int[] iArr45 = this.AudioAttributesImplBaseParcelizer;
                iArr45[i86 - 3] = iArr45[i86 - 2] | iArr45[i86 - 3];
                int i87 = i86 - 3;
                this.RemoteActionCompatParcelizer = i87;
                iArr45[i86 - 4] = iArr45[i86 - 4] & iArr45[i87];
                return 0;
            case 56:
                int i88 = this.RemoteActionCompatParcelizer;
                int[] iArr46 = this.AudioAttributesImplBaseParcelizer;
                iArr46[i88 - 2] = iArr46[i88 - 1] ^ iArr46[i88 - 2];
                int i89 = i88 - 2;
                this.RemoteActionCompatParcelizer = i89;
                iArr46[i88 - 3] = iArr46[i88 - 3] ^ iArr46[i89];
                return 0;
            case 57:
                int i90 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i90 - 1] = null;
                int i91 = i90 - 2;
                int[] iArr47 = this.AudioAttributesImplBaseParcelizer;
                iArr47[i90 - 3] = iArr47[i90 - 3] & iArr47[i91];
                this.RemoteActionCompatParcelizer = i90 - 1;
                int i92 = iArr47[i90 - 3];
                iArr47[i91] = i92;
                iArr47[i90 - 3] = iArr47[i90 - 4];
                iArr47[i90 - 4] = iArr47[i90 - 5];
                iArr47[i90 - 5] = i92;
                return 0;
            case 58:
                int i93 = this.RemoteActionCompatParcelizer;
                int[] iArr48 = this.AudioAttributesImplBaseParcelizer;
                iArr48[i93 - 2] = iArr48[i93 - 1] ^ iArr48[i93 - 2];
                int i94 = i93 - 2;
                iArr48[i93 - 3] = iArr48[i93 - 3] & iArr48[i94];
                this.RemoteActionCompatParcelizer = i93 - 1;
                int i95 = iArr48[i93 - 3];
                iArr48[i94] = i95;
                iArr48[i93 - 3] = iArr48[i93 - 4];
                iArr48[i93 - 4] = iArr48[i93 - 5];
                iArr48[i93 - 5] = i95;
                return 0;
            case 59:
                int i96 = this.RemoteActionCompatParcelizer;
                int i97 = i96 - 1;
                this.MediaBrowserCompatMediaItem[i97] = null;
                int[] iArr49 = this.AudioAttributesImplBaseParcelizer;
                int i98 = iArr49[i96 - 2];
                iArr49[i96 - 2] = iArr49[i96 - 3];
                iArr49[i96 - 3] = i98;
                this.RemoteActionCompatParcelizer = i96;
                iArr49[i97] = -1;
                return 0;
            case 60:
                int i99 = this.RemoteActionCompatParcelizer;
                int[] iArr50 = this.AudioAttributesImplBaseParcelizer;
                iArr50[i99 - 2] = iArr50[i99 - 1] ^ iArr50[i99 - 2];
                int i100 = i99 - 2;
                this.RemoteActionCompatParcelizer = i100;
                iArr50[i99 - 3] = iArr50[i99 - 3] & iArr50[i100];
                return 0;
            case 61:
                int i101 = this.RemoteActionCompatParcelizer;
                int i102 = i101 - 1;
                int[] iArr51 = this.AudioAttributesImplBaseParcelizer;
                iArr51[i101 - 2] = iArr51[i101 - 2] | iArr51[i102];
                this.RemoteActionCompatParcelizer = i101;
                iArr51[i102] = 13;
                return 0;
            case 62:
                int i103 = this.RemoteActionCompatParcelizer;
                int i104 = i103 - 1;
                this.RemoteActionCompatParcelizer = i104;
                int[] iArr52 = this.AudioAttributesImplBaseParcelizer;
                iArr52[i103 - 2] = iArr52[i103 - 2] >> iArr52[i104];
                return 0;
            case 63:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i105 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i105 + 1;
                objArr6[i105] = null;
                return 0;
            case 64:
                int[] iArr53 = this.AudioAttributesImplBaseParcelizer;
                int i106 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i106 + 1;
                iArr53[i106] = 50;
                return 0;
            case 65:
                int[] iArr54 = this.AudioAttributesImplBaseParcelizer;
                int i107 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i107 + 1;
                iArr54[i107] = 77;
                return 0;
            case 66:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i108 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i108 + 1;
                objArr7[i108] = objArr7[20];
                return 0;
            case 67:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i109 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i109 + 1;
                objArr8[i109] = objArr8[21];
                return 0;
            case 68:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i110 = this.RemoteActionCompatParcelizer;
                objArr9[i110] = objArr9[22];
                this.RemoteActionCompatParcelizer = i110 + 2;
                objArr9[i110 + 1] = objArr9[23];
                return 0;
            case 69:
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                int i111 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i111 + 1;
                objArr10[i111] = objArr10[24];
                return 0;
            case 70:
                int i112 = this.RemoteActionCompatParcelizer;
                int i113 = i112 - 1;
                this.RemoteActionCompatParcelizer = i113;
                int[] iArr55 = this.AudioAttributesImplBaseParcelizer;
                iArr55[i112 - 2] = iArr55[i112 - 2] % iArr55[i113];
                int i114 = i112 - 2;
                this.RemoteActionCompatParcelizer = i114;
                this.MediaBrowserCompatMediaItem[i114] = null;
                return 0;
            case 71:
                int[] iArr56 = this.AudioAttributesImplBaseParcelizer;
                int i115 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i115 + 1;
                iArr56[i115] = 235;
                return 0;
            case 72:
                int[] iArr57 = this.AudioAttributesImplBaseParcelizer;
                int i116 = this.RemoteActionCompatParcelizer;
                iArr57[i116 + 1] = iArr57[i116 - 1];
                iArr57[i116] = iArr57[i116 - 2];
                iArr57[i116 + 3] = iArr57[i116 + 1];
                iArr57[i116 + 2] = iArr57[i116];
                this.RemoteActionCompatParcelizer = i116 + 5;
                iArr57[i116 + 4] = -1;
                return 0;
            case 73:
                int i117 = this.RemoteActionCompatParcelizer;
                int i118 = i117 - 1;
                int[] iArr58 = this.AudioAttributesImplBaseParcelizer;
                iArr58[i117 - 2] = iArr58[i117 - 2] & iArr58[i118];
                this.RemoteActionCompatParcelizer = i117;
                iArr58[i118] = -1;
                return 0;
            case 74:
                int[] iArr59 = this.AudioAttributesImplBaseParcelizer;
                int i119 = this.RemoteActionCompatParcelizer;
                int i120 = iArr59[i119 - 1];
                iArr59[i119] = i120;
                iArr59[i119 - 1] = iArr59[i119 - 2];
                iArr59[i119 - 2] = iArr59[i119 - 3];
                iArr59[i119 - 3] = i120;
                this.RemoteActionCompatParcelizer = i119;
                this.MediaBrowserCompatMediaItem[i119] = null;
                return 0;
            case 75:
                int i121 = this.RemoteActionCompatParcelizer;
                int[] iArr60 = this.AudioAttributesImplBaseParcelizer;
                iArr60[i121 - 2] = iArr60[i121 - 1] | iArr60[i121 - 2];
                int i122 = i121 - 2;
                this.RemoteActionCompatParcelizer = i122;
                iArr60[i121 - 3] = iArr60[i121 - 3] & iArr60[i122];
                return 0;
            case 76:
                int i123 = this.RemoteActionCompatParcelizer;
                int i124 = i123 - 1;
                int[] iArr61 = this.AudioAttributesImplBaseParcelizer;
                iArr61[i123 - 2] = iArr61[i123 - 2] ^ iArr61[i124];
                this.RemoteActionCompatParcelizer = i123;
                int i125 = iArr61[i123 - 2];
                iArr61[i124] = i125;
                iArr61[i123 - 2] = iArr61[i123 - 3];
                iArr61[i123 - 3] = iArr61[i123 - 4];
                iArr61[i123 - 4] = i125;
                return 0;
            case 77:
                int i126 = this.RemoteActionCompatParcelizer;
                int[] iArr62 = this.AudioAttributesImplBaseParcelizer;
                iArr62[i126 - 2] = iArr62[i126 - 1] & iArr62[i126 - 2];
                int i127 = i126 - 2;
                iArr62[i126 - 3] = iArr62[i126 - 3] | iArr62[i127];
                this.RemoteActionCompatParcelizer = i126;
                iArr62[i126 - 1] = iArr62[i126 - 3];
                iArr62[i127] = iArr62[i126 - 4];
                return 0;
            case 78:
                int i128 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i128 - 1] = null;
                int i129 = i128 - 2;
                int[] iArr63 = this.AudioAttributesImplBaseParcelizer;
                iArr63[i128 - 3] = iArr63[i128 - 3] & iArr63[i129];
                this.RemoteActionCompatParcelizer = i128 - 1;
                iArr63[i129] = 19;
                return 0;
            case 79:
                int i130 = this.RemoteActionCompatParcelizer;
                int i131 = i130 - 1;
                int[] iArr64 = this.AudioAttributesImplBaseParcelizer;
                iArr64[i130 - 2] = iArr64[i130 - 2] >> iArr64[i131];
                iArr64[i131] = 1;
                this.RemoteActionCompatParcelizer = i130 + 2;
                iArr64[i130 + 1] = iArr64[i130 - 1];
                iArr64[i130] = iArr64[i130 - 2];
                return 0;
            case 80:
                int[] iArr65 = this.AudioAttributesImplBaseParcelizer;
                int i132 = this.RemoteActionCompatParcelizer;
                int i133 = iArr65[i132 - 1];
                iArr65[i132] = i133;
                iArr65[i132 - 1] = iArr65[i132 - 2];
                iArr65[i132 - 2] = iArr65[i132 - 3];
                iArr65[i132 - 3] = i133;
                this.MediaBrowserCompatMediaItem[i132] = null;
                int i134 = i132 - 1;
                this.RemoteActionCompatParcelizer = i134;
                iArr65[i132 - 2] = iArr65[i132 - 2] | iArr65[i134];
                return 0;
            case 81:
                int i135 = this.RemoteActionCompatParcelizer;
                int[] iArr66 = this.AudioAttributesImplBaseParcelizer;
                iArr66[i135 - 2] = iArr66[i135 - 1] & iArr66[i135 - 2];
                int i136 = i135 - 2;
                this.MediaBrowserCompatMediaItem[i136] = null;
                this.RemoteActionCompatParcelizer = i135;
                iArr66[i135 - 1] = iArr66[i135 - 3];
                iArr66[i136] = iArr66[i135 - 4];
                return 0;
            case 82:
                int i137 = this.RemoteActionCompatParcelizer;
                int[] iArr67 = this.AudioAttributesImplBaseParcelizer;
                iArr67[i137 - 2] = iArr67[i137 - 1] ^ iArr67[i137 - 2];
                this.MediaBrowserCompatMediaItem[i137 - 2] = null;
                int i138 = i137 - 3;
                this.RemoteActionCompatParcelizer = i138;
                iArr67[i137 - 4] = iArr67[i137 - 4] & iArr67[i138];
                return 0;
            case 83:
                int[] iArr68 = this.AudioAttributesImplBaseParcelizer;
                int i139 = this.RemoteActionCompatParcelizer;
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                Object obj3 = objArr11[i139 - 1];
                objArr11[i139 - 1] = null;
                iArr68[i139 - 1] = ((int[]) obj3).length;
                return 0;
            case 84:
                int[] iArr69 = this.AudioAttributesImplBaseParcelizer;
                int i140 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i140 + 1;
                iArr69[i140] = 4409;
                return 0;
            case 85:
                int i141 = this.RemoteActionCompatParcelizer;
                int i142 = i141 - 1;
                int[] iArr70 = this.AudioAttributesImplBaseParcelizer;
                iArr70[i141 - 2] = iArr70[i141 - 2] & iArr70[i142];
                int i143 = iArr70[i141 - 2];
                iArr70[i142] = i143;
                iArr70[i141 - 2] = iArr70[i141 - 3];
                iArr70[i141 - 3] = iArr70[i141 - 4];
                iArr70[i141 - 4] = i143;
                int i144 = i141 - 1;
                this.RemoteActionCompatParcelizer = i144;
                this.MediaBrowserCompatMediaItem[i144] = null;
                return 0;
            case 86:
                int[] iArr71 = this.AudioAttributesImplBaseParcelizer;
                int i145 = this.RemoteActionCompatParcelizer;
                int i146 = iArr71[i145 - 1];
                iArr71[i145 - 1] = iArr71[i145 - 2];
                iArr71[i145 - 2] = i146;
                return 0;
            case 87:
                int i147 = this.RemoteActionCompatParcelizer;
                int i148 = i147 - 1;
                this.RemoteActionCompatParcelizer = i148;
                int[] iArr72 = this.AudioAttributesImplBaseParcelizer;
                iArr72[i147 - 2] = iArr72[i147 - 2] | iArr72[i148];
                return 0;
            case 88:
                int[] iArr73 = this.AudioAttributesImplBaseParcelizer;
                int i149 = this.RemoteActionCompatParcelizer;
                iArr73[i149] = 30;
                this.RemoteActionCompatParcelizer = i149;
                iArr73[i149 - 1] = iArr73[i149 - 1] >> iArr73[i149];
                return 0;
            case 89:
                int[] iArr74 = this.AudioAttributesImplBaseParcelizer;
                int i150 = this.RemoteActionCompatParcelizer;
                int i151 = iArr74[i150 - 1];
                iArr74[i150 - 1] = iArr74[i150 - 2];
                iArr74[i150 - 2] = i151;
                this.RemoteActionCompatParcelizer = i150 + 1;
                iArr74[i150] = -1;
                return 0;
            case 90:
                int i152 = this.RemoteActionCompatParcelizer;
                int i153 = i152 - 1;
                int[] iArr75 = this.AudioAttributesImplBaseParcelizer;
                iArr75[i152 - 2] = iArr75[i152 - 2] | iArr75[i153];
                iArr75[i152] = iArr75[i152 - 2];
                iArr75[i153] = iArr75[i152 - 3];
                this.RemoteActionCompatParcelizer = i152;
                iArr75[i152 - 1] = iArr75[i152] & iArr75[i152 - 1];
                return 0;
            case 91:
                int[] iArr76 = this.AudioAttributesImplBaseParcelizer;
                int i154 = this.RemoteActionCompatParcelizer;
                iArr76[i154] = -1;
                iArr76[i154 - 1] = iArr76[i154 - 1] ^ iArr76[i154];
                int i155 = i154 - 1;
                this.RemoteActionCompatParcelizer = i155;
                iArr76[i154 - 2] = iArr76[i154 - 2] ^ iArr76[i155];
                return 0;
            case 92:
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                int i156 = this.RemoteActionCompatParcelizer;
                objArr12[i156] = objArr12[22];
                objArr12[i156 + 1] = objArr12[23];
                this.RemoteActionCompatParcelizer = i156 + 3;
                objArr12[i156 + 2] = objArr12[24];
                return 0;
            case 93:
                int[] iArr77 = this.AudioAttributesImplBaseParcelizer;
                int i157 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i157 + 1;
                iArr77[i157] = 55;
                return 0;
            case 94:
                int i158 = this.RemoteActionCompatParcelizer;
                int i159 = i158 - 1;
                this.RemoteActionCompatParcelizer = i159;
                int[] iArr78 = this.AudioAttributesImplBaseParcelizer;
                iArr78[i158 - 2] = iArr78[i158 - 2] / iArr78[i159];
                return 0;
            case 95:
                int[] iArr79 = this.AudioAttributesImplBaseParcelizer;
                int i160 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i160 + 1;
                iArr79[i160] = 0;
                return 0;
            case 96:
                int[] iArr80 = this.AudioAttributesImplBaseParcelizer;
                int i161 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i161 + 1;
                iArr80[i161] = 15;
                return 0;
            case 97:
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                int i162 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i162 + 1;
                objArr13[i162] = objArr13[25];
                return 0;
            case 98:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i163 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i163 + 1;
                objArr14[i163] = objArr14[26];
                return 0;
            case 99:
                int[] iArr81 = this.AudioAttributesImplBaseParcelizer;
                int i164 = this.RemoteActionCompatParcelizer;
                iArr81[i164] = 2;
                this.RemoteActionCompatParcelizer = i164 + 2;
                iArr81[i164 + 1] = 2;
                return 0;
            case 100:
                int[] iArr82 = this.AudioAttributesImplBaseParcelizer;
                int i165 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i165 + 1;
                iArr82[i165] = 5987;
                return 0;
            case 101:
                int i166 = this.RemoteActionCompatParcelizer;
                int i167 = i166 - 1;
                int[] iArr83 = this.AudioAttributesImplBaseParcelizer;
                iArr83[i166 - 2] = iArr83[i166 - 2] ^ iArr83[i167];
                this.RemoteActionCompatParcelizer = i166;
                iArr83[i167] = 17;
                return 0;
            case 102:
                int[] iArr84 = this.AudioAttributesImplBaseParcelizer;
                int i168 = this.RemoteActionCompatParcelizer;
                iArr84[i168] = -1;
                this.RemoteActionCompatParcelizer = i168 + 3;
                iArr84[i168 + 2] = iArr84[i168];
                iArr84[i168 + 1] = iArr84[i168 - 1];
                return 0;
            case 103:
                int i169 = this.RemoteActionCompatParcelizer;
                int i170 = i169 - 1;
                this.MediaBrowserCompatMediaItem[i170] = null;
                int[] iArr85 = this.AudioAttributesImplBaseParcelizer;
                iArr85[i169] = iArr85[i169 - 2];
                iArr85[i170] = iArr85[i169 - 3];
                this.RemoteActionCompatParcelizer = i169 + 2;
                iArr85[i169 + 1] = -1;
                return 0;
            case 104:
                int i171 = this.RemoteActionCompatParcelizer;
                int[] iArr86 = this.AudioAttributesImplBaseParcelizer;
                iArr86[i171 - 2] = iArr86[i171 - 1] ^ iArr86[i171 - 2];
                iArr86[i171 - 3] = iArr86[i171 - 2] ^ iArr86[i171 - 3];
                int i172 = i171 - 3;
                this.RemoteActionCompatParcelizer = i172;
                this.MediaBrowserCompatMediaItem[i172] = null;
                return 0;
            case 105:
                int[] iArr87 = this.AudioAttributesImplBaseParcelizer;
                int i173 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i173 + 1;
                iArr87[i173] = 5156;
                return 0;
            case 106:
                int[] iArr88 = this.AudioAttributesImplBaseParcelizer;
                int i174 = this.RemoteActionCompatParcelizer;
                iArr88[i174] = 9;
                this.RemoteActionCompatParcelizer = i174;
                iArr88[i174 - 1] = iArr88[i174 - 1] >> iArr88[i174];
                return 0;
            case 107:
                int i175 = this.RemoteActionCompatParcelizer;
                int[] iArr89 = this.AudioAttributesImplBaseParcelizer;
                iArr89[i175 - 2] = iArr89[i175 - 1] | iArr89[i175 - 2];
                int i176 = i175 - 2;
                this.RemoteActionCompatParcelizer = i176;
                this.MediaBrowserCompatMediaItem[i176] = null;
                return 0;
            case 108:
                int[] iArr90 = this.AudioAttributesImplBaseParcelizer;
                int i177 = this.RemoteActionCompatParcelizer;
                iArr90[i177] = 91;
                this.RemoteActionCompatParcelizer = i177 + 2;
                iArr90[i177 + 1] = 0;
                return 0;
            case 109:
                int[] iArr91 = this.AudioAttributesImplBaseParcelizer;
                int i178 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i178 + 1;
                iArr91[i178] = 14;
                return 0;
            case 110:
                int[] iArr92 = this.AudioAttributesImplBaseParcelizer;
                int i179 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i179 + 1;
                iArr92[i179] = 74;
                return 0;
            case 111:
                int[] iArr93 = this.AudioAttributesImplBaseParcelizer;
                int i180 = this.RemoteActionCompatParcelizer;
                iArr93[i180] = 2;
                iArr93[i180 + 1] = 2;
                int i181 = i180 + 1;
                this.RemoteActionCompatParcelizer = i181;
                iArr93[i180] = iArr93[i180] % iArr93[i181];
                return 0;
            case 112:
                int[] iArr94 = this.AudioAttributesImplBaseParcelizer;
                int i182 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i182 + 1;
                iArr94[i182] = 6315;
                return 0;
            case 113:
                int[] iArr95 = this.AudioAttributesImplBaseParcelizer;
                int i183 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i183 + 1;
                iArr95[i183] = 23;
                return 0;
            case 114:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i184 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i184 + 1;
                objArr15[i184] = null;
                int[] iArr96 = this.AudioAttributesImplBaseParcelizer;
                Object obj4 = objArr15[i184];
                objArr15[i184] = null;
                iArr96[i184] = ((int[]) obj4).length;
                return 0;
            case 115:
                int[] iArr97 = this.AudioAttributesImplBaseParcelizer;
                int i185 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i185 + 1;
                iArr97[i185] = 7104;
                return 0;
            case 116:
                int[] iArr98 = this.AudioAttributesImplBaseParcelizer;
                int i186 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i186 + 1;
                iArr98[i186] = 10;
                return 0;
            case 117:
                int i187 = this.RemoteActionCompatParcelizer;
                int[] iArr99 = this.AudioAttributesImplBaseParcelizer;
                iArr99[i187 - 2] = iArr99[i187 - 1] ^ iArr99[i187 - 2];
                iArr99[i187 - 3] = iArr99[i187 - 2] & iArr99[i187 - 3];
                int i188 = i187 - 3;
                this.RemoteActionCompatParcelizer = i188;
                iArr99[i187 - 4] = iArr99[i187 - 4] | iArr99[i188];
                return 0;
            case 118:
                int i189 = this.RemoteActionCompatParcelizer;
                int[] iArr100 = this.AudioAttributesImplBaseParcelizer;
                iArr100[i189 - 2] = iArr100[i189 - 1] & iArr100[i189 - 2];
                iArr100[i189 - 3] = iArr100[i189 - 2] | iArr100[i189 - 3];
                int i190 = i189 - 3;
                this.RemoteActionCompatParcelizer = i190;
                this.MediaBrowserCompatMediaItem[i190] = null;
                return 0;
            case 119:
                int[] iArr101 = this.AudioAttributesImplBaseParcelizer;
                int i191 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i191 + 1;
                iArr101[i191] = 61;
                return 0;
            case 120:
                int[] iArr102 = this.AudioAttributesImplBaseParcelizer;
                int i192 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i192 + 1;
                iArr102[i192] = 95;
                return 0;
            case 121:
                int[] iArr103 = this.AudioAttributesImplBaseParcelizer;
                int i193 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i193 + 1;
                iArr103[i193] = 2546;
                return 0;
            case 122:
                int[] iArr104 = this.AudioAttributesImplBaseParcelizer;
                int i194 = this.RemoteActionCompatParcelizer;
                iArr104[i194 + 1] = iArr104[i194 - 1];
                iArr104[i194] = iArr104[i194 - 2];
                int i195 = i194 + 1;
                this.RemoteActionCompatParcelizer = i195;
                iArr104[i194] = iArr104[i194] ^ iArr104[i195];
                return 0;
            case 123:
                int[] iArr105 = this.AudioAttributesImplBaseParcelizer;
                int i196 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i196 + 1;
                iArr105[i196] = 20;
                return 0;
            case 124:
                int i197 = this.RemoteActionCompatParcelizer;
                int i198 = i197 - 1;
                int[] iArr106 = this.AudioAttributesImplBaseParcelizer;
                iArr106[i197 - 2] = iArr106[i197 - 2] & iArr106[i198];
                iArr106[i198] = -1;
                int i199 = i197 - 1;
                this.RemoteActionCompatParcelizer = i199;
                iArr106[i197 - 2] = iArr106[i197 - 2] ^ iArr106[i199];
                return 0;
            case 125:
                int[] iArr107 = this.AudioAttributesImplBaseParcelizer;
                int i200 = this.RemoteActionCompatParcelizer;
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                Object obj5 = objArr16[i200 - 1];
                objArr16[i200 - 1] = null;
                iArr107[i200 - 1] = ((int[]) obj5).length;
                int i201 = i200 - 1;
                this.RemoteActionCompatParcelizer = i201;
                objArr16[i201] = null;
                return 0;
            case 126:
                int[] iArr108 = this.AudioAttributesImplBaseParcelizer;
                int i202 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i202 + 1;
                iArr108[i202] = 2252;
                return 0;
            case 127:
                int[] iArr109 = this.AudioAttributesImplBaseParcelizer;
                int i203 = this.RemoteActionCompatParcelizer;
                int i204 = iArr109[i203 - 1];
                iArr109[i203] = i204;
                iArr109[i203 - 1] = iArr109[i203 - 2];
                iArr109[i203 - 2] = iArr109[i203 - 3];
                iArr109[i203 - 3] = i204;
                this.MediaBrowserCompatMediaItem[i203] = null;
                this.RemoteActionCompatParcelizer = i203 + 2;
                iArr109[i203 + 1] = iArr109[i203 - 1];
                iArr109[i203] = iArr109[i203 - 2];
                return 0;
            case 128:
                int[] iArr110 = this.AudioAttributesImplBaseParcelizer;
                int i205 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i205 + 1;
                iArr110[i205] = 11;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int i206 = this.RemoteActionCompatParcelizer;
                int i207 = i206 - 1;
                int[] iArr111 = this.AudioAttributesImplBaseParcelizer;
                iArr111[i206 - 2] = iArr111[i206 - 2] >> iArr111[i207];
                this.RemoteActionCompatParcelizer = i206;
                iArr111[i207] = 1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int[] iArr112 = this.AudioAttributesImplBaseParcelizer;
                int i208 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i208 + 1;
                iArr112[i208] = 3909;
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr113 = this.AudioAttributesImplBaseParcelizer;
                int i209 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i209 + 1;
                iArr113[i209] = 29;
                return 0;
            case 132:
                int[] iArr114 = this.AudioAttributesImplBaseParcelizer;
                int i210 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i210 + 1;
                iArr114[i210] = 3;
                return 0;
            case 133:
                int[] iArr115 = this.AudioAttributesImplBaseParcelizer;
                int i211 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i211 + 1;
                iArr115[i211] = 1561;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int i212 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i212 - 1] = null;
                int i213 = i212 - 2;
                int[] iArr116 = this.AudioAttributesImplBaseParcelizer;
                iArr116[i212 - 3] = iArr116[i212 - 3] & iArr116[i213];
                this.RemoteActionCompatParcelizer = i212;
                iArr116[i212 - 1] = iArr116[i212 - 3];
                iArr116[i213] = iArr116[i212 - 4];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr117 = this.AudioAttributesImplBaseParcelizer;
                int i214 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i214 + 1;
                iArr117[i214] = 1;
                return 0;
            case 136:
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                int i215 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i215 + 1;
                objArr17[i215] = objArr17[22];
                return 0;
            case 137:
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                int i216 = this.RemoteActionCompatParcelizer;
                objArr18[i216] = objArr18[23];
                this.RemoteActionCompatParcelizer = i216 + 2;
                objArr18[i216 + 1] = objArr18[24];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr118 = this.AudioAttributesImplBaseParcelizer;
                int i217 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i217 + 1;
                iArr118[i217] = 6141;
                return 0;
            case 139:
                int[] iArr119 = this.AudioAttributesImplBaseParcelizer;
                int i218 = this.RemoteActionCompatParcelizer;
                iArr119[i218] = -1;
                iArr119[i218 + 2] = iArr119[i218];
                iArr119[i218 + 1] = iArr119[i218 - 1];
                int i219 = i218 + 2;
                this.RemoteActionCompatParcelizer = i219;
                iArr119[i218 + 1] = iArr119[i218 + 1] & iArr119[i219];
                return 0;
            case 140:
                int i220 = this.RemoteActionCompatParcelizer;
                int i221 = i220 - 1;
                int[] iArr120 = this.AudioAttributesImplBaseParcelizer;
                iArr120[i220 - 2] = iArr120[i220 - 2] ^ iArr120[i221];
                int i222 = iArr120[i220 - 2];
                iArr120[i221] = i222;
                iArr120[i220 - 2] = iArr120[i220 - 3];
                iArr120[i220 - 3] = iArr120[i220 - 4];
                iArr120[i220 - 4] = i222;
                int i223 = i220 - 1;
                this.RemoteActionCompatParcelizer = i223;
                this.MediaBrowserCompatMediaItem[i223] = null;
                return 0;
            case 141:
                int i224 = this.RemoteActionCompatParcelizer;
                int i225 = i224 - 1;
                int[] iArr121 = this.AudioAttributesImplBaseParcelizer;
                iArr121[i224 - 2] = iArr121[i224 - 2] & iArr121[i225];
                this.RemoteActionCompatParcelizer = i224 + 1;
                iArr121[i224] = iArr121[i224 - 2];
                iArr121[i225] = iArr121[i224 - 3];
                return 0;
            case 142:
                int i226 = this.RemoteActionCompatParcelizer;
                int i227 = i226 - 1;
                int[] iArr122 = this.AudioAttributesImplBaseParcelizer;
                iArr122[i226 - 2] = iArr122[i226 - 2] | iArr122[i227];
                this.RemoteActionCompatParcelizer = i226 + 1;
                iArr122[i226] = iArr122[i226 - 2];
                iArr122[i227] = iArr122[i226 - 3];
                return 0;
            case 143:
                int[] iArr123 = this.AudioAttributesImplBaseParcelizer;
                int i228 = this.RemoteActionCompatParcelizer;
                iArr123[i228] = 9;
                iArr123[i228 - 1] = iArr123[i228 - 1] >> iArr123[i228];
                this.RemoteActionCompatParcelizer = i228 + 1;
                iArr123[i228] = 1;
                return 0;
            case 144:
                int[] iArr124 = this.AudioAttributesImplBaseParcelizer;
                int i229 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i229 + 1;
                iArr124[i229] = 389;
                return 0;
            case 145:
                int[] iArr125 = this.AudioAttributesImplBaseParcelizer;
                int i230 = this.RemoteActionCompatParcelizer;
                int i231 = iArr125[i230 - 1];
                iArr125[i230 - 1] = iArr125[i230 - 2];
                iArr125[i230 - 2] = i231;
                iArr125[i230] = -1;
                this.RemoteActionCompatParcelizer = i230 + 3;
                iArr125[i230 + 2] = iArr125[i230];
                iArr125[i230 + 1] = iArr125[i230 - 1];
                return 0;
            case 146:
                int i232 = this.RemoteActionCompatParcelizer;
                int[] iArr126 = this.AudioAttributesImplBaseParcelizer;
                iArr126[i232 - 2] = iArr126[i232 - 1] & iArr126[i232 - 2];
                int i233 = i232 - 2;
                iArr126[i232 - 3] = iArr126[i232 - 3] | iArr126[i233];
                this.RemoteActionCompatParcelizer = i232 - 1;
                iArr126[i233] = 9;
                return 0;
            case 147:
                int i234 = this.RemoteActionCompatParcelizer;
                int i235 = i234 - 1;
                int[] iArr127 = this.AudioAttributesImplBaseParcelizer;
                iArr127[i234 - 2] = iArr127[i234 - 2] ^ iArr127[i235];
                iArr127[i234] = iArr127[i234 - 2];
                iArr127[i235] = iArr127[i234 - 3];
                this.RemoteActionCompatParcelizer = i234;
                iArr127[i234 - 1] = iArr127[i234] & iArr127[i234 - 1];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int[] iArr128 = this.AudioAttributesImplBaseParcelizer;
                int i236 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i236 + 1;
                iArr128[i236] = 86;
                return 0;
            case 149:
                int[] iArr129 = this.AudioAttributesImplBaseParcelizer;
                int i237 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i237 + 1;
                iArr129[i237] = 96;
                return 0;
            case 150:
                int[] iArr130 = this.AudioAttributesImplBaseParcelizer;
                int i238 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i238 + 1;
                iArr130[i238] = 40;
                return 0;
            case 151:
                int[] iArr131 = this.AudioAttributesImplBaseParcelizer;
                int i239 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i239 + 1;
                iArr131[i239] = 2392;
                return 0;
            case 152:
                int[] iArr132 = this.AudioAttributesImplBaseParcelizer;
                int i240 = this.RemoteActionCompatParcelizer;
                iArr132[i240 + 1] = iArr132[i240 - 1];
                iArr132[i240] = iArr132[i240 - 2];
                int i241 = i240 + 1;
                iArr132[i240] = iArr132[i240] & iArr132[i241];
                this.RemoteActionCompatParcelizer = i240 + 2;
                iArr132[i241] = -1;
                return 0;
            case 153:
                int[] iArr133 = this.AudioAttributesImplBaseParcelizer;
                int i242 = this.RemoteActionCompatParcelizer;
                iArr133[i242] = 28;
                this.RemoteActionCompatParcelizer = i242;
                iArr133[i242 - 1] = iArr133[i242 - 1] >> iArr133[i242];
                return 0;
            case 154:
                int[] iArr134 = this.AudioAttributesImplBaseParcelizer;
                int i243 = this.RemoteActionCompatParcelizer;
                iArr134[i243] = 46;
                this.RemoteActionCompatParcelizer = i243 + 2;
                iArr134[i243 + 1] = 0;
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr135 = this.AudioAttributesImplBaseParcelizer;
                int i244 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i244 + 1;
                iArr135[i244] = 81;
                return 0;
            case 156:
                int[] iArr136 = this.AudioAttributesImplBaseParcelizer;
                int i245 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i245 + 1;
                iArr136[i245] = 68;
                return 0;
            case 157:
                int[] iArr137 = this.AudioAttributesImplBaseParcelizer;
                int i246 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i246 + 1;
                iArr137[i246] = 5422;
                return 0;
            case 158:
                int i247 = this.RemoteActionCompatParcelizer;
                int i248 = i247 - 1;
                this.MediaBrowserCompatMediaItem[i248] = null;
                int[] iArr138 = this.AudioAttributesImplBaseParcelizer;
                iArr138[i247] = iArr138[i247 - 2];
                iArr138[i248] = iArr138[i247 - 3];
                this.RemoteActionCompatParcelizer = i247;
                iArr138[i247 - 1] = iArr138[i247] ^ iArr138[i247 - 1];
                return 0;
            case 159:
                int i249 = this.RemoteActionCompatParcelizer;
                int[] iArr139 = this.AudioAttributesImplBaseParcelizer;
                iArr139[i249 - 2] = iArr139[i249 - 1] | iArr139[i249 - 2];
                int i250 = i249 - 2;
                iArr139[i249 - 3] = iArr139[i249 - 3] & iArr139[i250];
                this.RemoteActionCompatParcelizer = i249;
                iArr139[i249 - 1] = iArr139[i249 - 3];
                iArr139[i250] = iArr139[i249 - 4];
                return 0;
            case 160:
                int[] iArr140 = this.AudioAttributesImplBaseParcelizer;
                int i251 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i251 + 1;
                iArr140[i251] = 302;
                return 0;
            case 161:
                int[] iArr141 = this.AudioAttributesImplBaseParcelizer;
                int i252 = this.RemoteActionCompatParcelizer;
                iArr141[i252] = 1;
                iArr141[i252 + 2] = iArr141[i252];
                iArr141[i252 + 1] = iArr141[i252 - 1];
                this.RemoteActionCompatParcelizer = i252 + 4;
                iArr141[i252 + 3] = -1;
                return 0;
            case 162:
                int i253 = this.RemoteActionCompatParcelizer;
                int[] iArr142 = this.AudioAttributesImplBaseParcelizer;
                iArr142[i253 - 2] = iArr142[i253 - 1] | iArr142[i253 - 2];
                int i254 = i253 - 2;
                this.MediaBrowserCompatMediaItem[i254] = null;
                this.RemoteActionCompatParcelizer = i253;
                iArr142[i253 - 1] = iArr142[i253 - 3];
                iArr142[i254] = iArr142[i253 - 4];
                return 0;
            case 163:
                int[] iArr143 = this.AudioAttributesImplBaseParcelizer;
                int i255 = this.RemoteActionCompatParcelizer;
                iArr143[i255] = 35;
                this.RemoteActionCompatParcelizer = i255 + 2;
                iArr143[i255 + 1] = 0;
                return 0;
            case 164:
                int[] iArr144 = this.AudioAttributesImplBaseParcelizer;
                int i256 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i256 + 1;
                iArr144[i256] = 70;
                return 0;
            case 165:
                int[] iArr145 = this.AudioAttributesImplBaseParcelizer;
                int i257 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i257 + 1;
                iArr145[i257] = 52;
                return 0;
            case 166:
                int[] iArr146 = this.AudioAttributesImplBaseParcelizer;
                int i258 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i258 + 1;
                iArr146[i258] = 4497;
                return 0;
            case 167:
                int i259 = this.RemoteActionCompatParcelizer;
                int i260 = i259 - 1;
                int[] iArr147 = this.AudioAttributesImplBaseParcelizer;
                iArr147[i259 - 2] = iArr147[i259 - 2] | iArr147[i260];
                iArr147[i260] = 29;
                int i261 = i259 - 1;
                this.RemoteActionCompatParcelizer = i261;
                iArr147[i259 - 2] = iArr147[i259 - 2] >> iArr147[i261];
                return 0;
            case 168:
                int[] iArr148 = this.AudioAttributesImplBaseParcelizer;
                int i262 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i262 + 1;
                iArr148[i262] = 89;
                return 0;
            case 169:
                int[] iArr149 = this.AudioAttributesImplBaseParcelizer;
                int i263 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i263 + 1;
                iArr149[i263] = 6066;
                return 0;
            case 170:
                int[] iArr150 = this.AudioAttributesImplBaseParcelizer;
                int i264 = this.RemoteActionCompatParcelizer;
                int i265 = iArr150[i264 - 1];
                iArr150[i264] = i265;
                iArr150[i264 - 1] = iArr150[i264 - 2];
                iArr150[i264 - 2] = iArr150[i264 - 3];
                iArr150[i264 - 3] = i265;
                this.MediaBrowserCompatMediaItem[i264] = null;
                int i266 = i264 - 1;
                this.RemoteActionCompatParcelizer = i266;
                iArr150[i264 - 2] = iArr150[i264 - 2] & iArr150[i266];
                return 0;
            case 171:
                int[] iArr151 = this.AudioAttributesImplBaseParcelizer;
                int i267 = this.RemoteActionCompatParcelizer;
                iArr151[i267] = 5;
                iArr151[i267 - 1] = iArr151[i267 - 1] >> iArr151[i267];
                this.RemoteActionCompatParcelizer = i267 + 1;
                iArr151[i267] = 1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int i268 = this.RemoteActionCompatParcelizer;
                int i269 = i268 - 1;
                int[] iArr152 = this.AudioAttributesImplBaseParcelizer;
                iArr152[i268 - 2] = iArr152[i268 - 2] & iArr152[i269];
                this.RemoteActionCompatParcelizer = i268;
                iArr152[i269] = 18;
                return 0;
            case 173:
                int i270 = this.RemoteActionCompatParcelizer;
                int i271 = i270 - 1;
                int[] iArr153 = this.AudioAttributesImplBaseParcelizer;
                iArr153[i270 - 2] = iArr153[i270 - 2] & iArr153[i271];
                iArr153[i270] = iArr153[i270 - 2];
                iArr153[i271] = iArr153[i270 - 3];
                this.RemoteActionCompatParcelizer = i270;
                iArr153[i270 - 1] = iArr153[i270] & iArr153[i270 - 1];
                return 0;
            case 174:
                int[] iArr154 = this.AudioAttributesImplBaseParcelizer;
                int i272 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i272 + 1;
                iArr154[i272] = 1282;
                return 0;
            case 175:
                int[] iArr155 = this.AudioAttributesImplBaseParcelizer;
                int i273 = this.RemoteActionCompatParcelizer;
                iArr155[i273] = 11;
                iArr155[i273 - 1] = iArr155[i273 - 1] >> iArr155[i273];
                this.RemoteActionCompatParcelizer = i273 + 1;
                iArr155[i273] = 1;
                return 0;
            case 176:
                int i274 = this.RemoteActionCompatParcelizer;
                int[] iArr156 = this.AudioAttributesImplBaseParcelizer;
                iArr156[i274 - 2] = iArr156[i274 - 1] | iArr156[i274 - 2];
                iArr156[i274 - 3] = iArr156[i274 - 2] & iArr156[i274 - 3];
                int i275 = i274 - 3;
                this.RemoteActionCompatParcelizer = i275;
                this.MediaBrowserCompatMediaItem[i275] = null;
                return 0;
            case 177:
                int[] iArr157 = this.AudioAttributesImplBaseParcelizer;
                int i276 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i276 + 1;
                iArr157[i276] = 85;
                return 0;
            case 178:
                int[] iArr158 = this.AudioAttributesImplBaseParcelizer;
                int i277 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i277 + 1;
                iArr158[i277] = 35;
                return 0;
            case 179:
                int i278 = this.RemoteActionCompatParcelizer;
                int i279 = i278 - 1;
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                Object obj6 = objArr19[i279];
                objArr19[i279] = null;
                objArr19[30] = obj6;
                this.RemoteActionCompatParcelizer = i278;
                objArr19[i279] = objArr19[20];
                return 0;
            case 180:
                int i280 = this.RemoteActionCompatParcelizer;
                int i281 = i280 - 1;
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr20[i281];
                objArr20[i281] = null;
                objArr20[29] = obj7;
                this.RemoteActionCompatParcelizer = i280;
                objArr20[i281] = objArr20[21];
                return 0;
            case 181:
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                int i282 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i282 + 1;
                objArr21[i282] = objArr21[i282 - 1];
                return 0;
            case 182:
                int i283 = this.RemoteActionCompatParcelizer;
                int i284 = i283 - 1;
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                Object obj8 = objArr22[i284];
                objArr22[i284] = null;
                objArr22[27] = obj8;
                int i285 = i283 - 2;
                Object obj9 = objArr22[i285];
                objArr22[i285] = null;
                objArr22[28] = obj9;
                this.RemoteActionCompatParcelizer = i283 - 1;
                objArr22[i285] = objArr22[27];
                return 0;
            case 183:
                int i286 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i286;
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                Object obj10 = objArr23[i286];
                objArr23[i286] = null;
                objArr23[28] = obj10;
                return 0;
            case 184:
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                int i287 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i287 + 1;
                objArr24[i287] = objArr24[28];
                return 0;
            case 185:
                int i288 = this.RemoteActionCompatParcelizer;
                int i289 = i288 - 1;
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                Object obj11 = objArr25[i289];
                objArr25[i289] = null;
                objArr25[31] = obj11;
                this.RemoteActionCompatParcelizer = i288;
                objArr25[i289] = objArr25[26];
                return 0;
            case 186:
                int i290 = this.RemoteActionCompatParcelizer;
                int i291 = i290 - 1;
                int[] iArr159 = this.AudioAttributesImplBaseParcelizer;
                iArr159[27] = iArr159[i291];
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                objArr26[i291] = objArr26[31];
                this.RemoteActionCompatParcelizer = i290 + 1;
                objArr26[i290] = objArr26[29];
                return 0;
            case 187:
                int[] iArr160 = this.AudioAttributesImplBaseParcelizer;
                int i292 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i292 + 1;
                iArr160[i292] = iArr160[27];
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i293 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i293 + 1;
                objArr27[i293] = objArr27[30];
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int i294 = this.RemoteActionCompatParcelizer;
                int i295 = i294 - 1;
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                Object obj12 = objArr28[i295];
                objArr28[i295] = null;
                objArr28[27] = obj12;
                this.RemoteActionCompatParcelizer = i294;
                objArr28[i295] = objArr28[26];
                return 0;
            case 190:
                int i296 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i296;
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                Object obj13 = objArr29[i296];
                objArr29[i296] = null;
                objArr29[26] = obj13;
                return 0;
            case 191:
                int i297 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i297;
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                Object obj14 = objArr30[i297];
                objArr30[i297] = null;
                this.write = obj14 != null ? 0 : 1;
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int i298 = this.RemoteActionCompatParcelizer;
                int i299 = i298 - 1;
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                Object obj15 = objArr31[i299];
                objArr31[i299] = null;
                objArr31[20] = obj15;
                this.RemoteActionCompatParcelizer = i298;
                objArr31[i299] = objArr31[23];
                return 0;
            case 193:
                int i300 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i300;
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                Object obj16 = objArr32[i300];
                objArr32[i300] = null;
                objArr32[23] = obj16;
                return 0;
            case 194:
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                int i301 = this.RemoteActionCompatParcelizer;
                objArr33[i301] = objArr33[29];
                objArr33[i301 + 1] = objArr33[20];
                this.RemoteActionCompatParcelizer = i301 + 3;
                objArr33[i301 + 2] = objArr33[23];
                return 0;
            case 195:
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                int i302 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i302 + 1;
                objArr34[i302] = objArr34[27];
                return 0;
            case 196:
                int i303 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i303;
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr35[i303];
                objArr35[i303] = null;
                objArr35[25] = obj17;
                return 0;
            case 197:
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                int i304 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i304 + 1;
                objArr36[i304] = objArr36[31];
                return 0;
            case 198:
                int[] iArr161 = this.AudioAttributesImplBaseParcelizer;
                int i305 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i305 + 1;
                iArr161[i305] = 446;
                return 0;
            case 199:
                int i306 = this.RemoteActionCompatParcelizer;
                int i307 = i306 - 1;
                int[] iArr162 = this.AudioAttributesImplBaseParcelizer;
                iArr162[i306 - 2] = iArr162[i306 - 2] & iArr162[i307];
                this.RemoteActionCompatParcelizer = i306;
                iArr162[i307] = 2;
                return 0;
            case 200:
                int i308 = this.RemoteActionCompatParcelizer;
                int i309 = i308 - 1;
                int[] iArr163 = this.AudioAttributesImplBaseParcelizer;
                iArr163[27] = iArr163[i309];
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                this.RemoteActionCompatParcelizer = i308;
                objArr37[i309] = objArr37[31];
                return 0;
            case 201:
                Object[] objArr38 = this.MediaBrowserCompatMediaItem;
                int i310 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i310 + 1;
                objArr38[i310] = objArr38[29];
                return 0;
            case 202:
                int[] iArr164 = this.AudioAttributesImplBaseParcelizer;
                int i311 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i311 + 1;
                iArr164[i311] = 3509;
                return 0;
            case 203:
                int i312 = this.RemoteActionCompatParcelizer;
                int i313 = i312 - 1;
                int[] iArr165 = this.AudioAttributesImplBaseParcelizer;
                iArr165[i312 - 2] = iArr165[i312 - 2] | iArr165[i313];
                iArr165[i313] = 12;
                int i314 = i312 - 1;
                this.RemoteActionCompatParcelizer = i314;
                iArr165[i312 - 2] = iArr165[i312 - 2] >> iArr165[i314];
                return 0;
            case 204:
                int[] iArr166 = this.AudioAttributesImplBaseParcelizer;
                int i315 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i315 + 1;
                iArr166[i315] = 22;
                return 0;
            case 205:
                int[] iArr167 = this.AudioAttributesImplBaseParcelizer;
                int i316 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i316 + 1;
                iArr167[i316] = 4158;
                return 0;
            case 206:
                int[] iArr168 = this.AudioAttributesImplBaseParcelizer;
                int i317 = this.RemoteActionCompatParcelizer;
                iArr168[i317] = 16;
                iArr168[i317 - 1] = iArr168[i317 - 1] >> iArr168[i317];
                this.RemoteActionCompatParcelizer = i317 + 1;
                iArr168[i317] = 1;
                return 0;
            case 207:
                int[] iArr169 = this.AudioAttributesImplBaseParcelizer;
                int i318 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i318 + 1;
                iArr169[i318] = 4549;
                return 0;
            case 208:
                int i319 = this.RemoteActionCompatParcelizer;
                int i320 = i319 - 1;
                int[] iArr170 = this.AudioAttributesImplBaseParcelizer;
                iArr170[i319 - 2] = iArr170[i319 - 2] & iArr170[i320];
                this.RemoteActionCompatParcelizer = i319;
                iArr170[i320] = 19;
                return 0;
            case 209:
                int[] iArr171 = this.AudioAttributesImplBaseParcelizer;
                int i321 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i321 + 1;
                iArr171[i321] = 5268;
                return 0;
            case 210:
                int i322 = this.RemoteActionCompatParcelizer;
                int i323 = i322 - 1;
                int[] iArr172 = this.AudioAttributesImplBaseParcelizer;
                iArr172[i322 - 2] = iArr172[i322 - 2] & iArr172[i323];
                iArr172[i323] = 11;
                int i324 = i322 - 1;
                this.RemoteActionCompatParcelizer = i324;
                iArr172[i322 - 2] = iArr172[i322 - 2] >> iArr172[i324];
                return 0;
            case 211:
                int[] iArr173 = this.AudioAttributesImplBaseParcelizer;
                int i325 = this.RemoteActionCompatParcelizer;
                iArr173[i325] = 4;
                this.RemoteActionCompatParcelizer = i325 + 2;
                iArr173[i325 + 1] = 5;
                return 0;
            case 212:
                int i326 = this.RemoteActionCompatParcelizer;
                int i327 = i326 - 1;
                this.RemoteActionCompatParcelizer = i327;
                int[] iArr174 = this.AudioAttributesImplBaseParcelizer;
                iArr174[i326 - 2] = iArr174[i326 - 2] << iArr174[i327];
                return 0;
            case 213:
                int[] iArr175 = this.AudioAttributesImplBaseParcelizer;
                int i328 = this.RemoteActionCompatParcelizer;
                iArr175[i328 + 1] = iArr175[i328 - 1];
                iArr175[i328] = iArr175[i328 - 2];
                this.RemoteActionCompatParcelizer = i328 + 4;
                iArr175[i328 + 3] = iArr175[i328 + 1];
                iArr175[i328 + 2] = iArr175[i328];
                return 0;
            case 214:
                int i329 = this.RemoteActionCompatParcelizer;
                int i330 = i329 - 1;
                int[] iArr176 = this.AudioAttributesImplBaseParcelizer;
                iArr176[i329 - 2] = iArr176[i329 - 2] & iArr176[i330];
                this.RemoteActionCompatParcelizer = i329;
                iArr176[i330] = 27;
                return 0;
            case 215:
                int[] iArr177 = this.AudioAttributesImplBaseParcelizer;
                int i331 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i331 + 1;
                iArr177[i331] = 9;
                return 0;
            case 216:
                int[] iArr178 = this.AudioAttributesImplBaseParcelizer;
                int i332 = this.RemoteActionCompatParcelizer;
                iArr178[i332] = 0;
                this.RemoteActionCompatParcelizer = i332;
                iArr178[i332 - 1] = iArr178[i332 - 1] / iArr178[i332];
                int i333 = i332 - 1;
                this.RemoteActionCompatParcelizer = i333;
                this.MediaBrowserCompatMediaItem[i333] = null;
                return 0;
            case 217:
                int[] iArr179 = this.AudioAttributesImplBaseParcelizer;
                int i334 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i334 + 1;
                iArr179[i334] = 842;
                return 0;
            case 218:
                int i335 = this.RemoteActionCompatParcelizer;
                int i336 = i335 - 1;
                int[] iArr180 = this.AudioAttributesImplBaseParcelizer;
                iArr180[i335 - 2] = iArr180[i335 - 2] | iArr180[i336];
                this.RemoteActionCompatParcelizer = i335;
                int i337 = iArr180[i335 - 2];
                iArr180[i336] = i337;
                iArr180[i335 - 2] = iArr180[i335 - 3];
                iArr180[i335 - 3] = iArr180[i335 - 4];
                iArr180[i335 - 4] = i337;
                return 0;
            case 219:
                int i338 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i338 - 1] = null;
                int i339 = i338 - 2;
                int[] iArr181 = this.AudioAttributesImplBaseParcelizer;
                iArr181[i338 - 3] = iArr181[i338 - 3] & iArr181[i339];
                this.RemoteActionCompatParcelizer = i338 - 1;
                iArr181[i339] = 1;
                return 0;
            case 220:
                int[] iArr182 = this.AudioAttributesImplBaseParcelizer;
                int i340 = this.RemoteActionCompatParcelizer;
                iArr182[i340] = 1;
                this.RemoteActionCompatParcelizer = i340 + 3;
                iArr182[i340 + 2] = iArr182[i340];
                iArr182[i340 + 1] = iArr182[i340 - 1];
                return 0;
            case 221:
                int i341 = this.RemoteActionCompatParcelizer;
                int[] iArr183 = this.AudioAttributesImplBaseParcelizer;
                iArr183[i341 - 2] = iArr183[i341 - 1] & iArr183[i341 - 2];
                iArr183[i341 - 3] = iArr183[i341 - 2] ^ iArr183[i341 - 3];
                int i342 = i341 - 3;
                this.RemoteActionCompatParcelizer = i342;
                this.MediaBrowserCompatMediaItem[i342] = null;
                return 0;
            case 222:
                int i343 = this.RemoteActionCompatParcelizer;
                int i344 = i343 - 1;
                Object[] objArr39 = this.MediaBrowserCompatMediaItem;
                Object obj18 = objArr39[i344];
                objArr39[i344] = null;
                objArr39[27] = obj18;
                int i345 = i343 - 2;
                this.RemoteActionCompatParcelizer = i345;
                Object obj19 = objArr39[i345];
                objArr39[i345] = null;
                objArr39[28] = obj19;
                return 0;
            case 223:
                int[] iArr184 = this.AudioAttributesImplBaseParcelizer;
                int i346 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i346 + 1;
                iArr184[i346] = 6054;
                return 0;
            case 224:
                int[] iArr185 = this.AudioAttributesImplBaseParcelizer;
                int i347 = this.RemoteActionCompatParcelizer;
                iArr185[i347] = 8;
                iArr185[i347 - 1] = iArr185[i347 - 1] >> iArr185[i347];
                this.RemoteActionCompatParcelizer = i347 + 1;
                iArr185[i347] = 1;
                return 0;
            case 225:
                int i348 = this.RemoteActionCompatParcelizer;
                int[] iArr186 = this.AudioAttributesImplBaseParcelizer;
                iArr186[i348 - 2] = iArr186[i348 - 1] & iArr186[i348 - 2];
                int i349 = i348 - 2;
                this.RemoteActionCompatParcelizer = i349;
                this.MediaBrowserCompatMediaItem[i349] = null;
                return 0;
            case 226:
                int[] iArr187 = this.AudioAttributesImplBaseParcelizer;
                int i350 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i350 + 1;
                iArr187[i350] = 4628;
                return 0;
            case 227:
                int[] iArr188 = this.AudioAttributesImplBaseParcelizer;
                int i351 = this.RemoteActionCompatParcelizer;
                iArr188[i351] = 4;
                iArr188[i351 - 1] = iArr188[i351 - 1] >> iArr188[i351];
                this.RemoteActionCompatParcelizer = i351 + 1;
                iArr188[i351] = 1;
                return 0;
            case 228:
                int[] iArr189 = this.AudioAttributesImplBaseParcelizer;
                int i352 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i352 + 1;
                iArr189[i352] = 6773;
                return 0;
            case 229:
                int[] iArr190 = this.AudioAttributesImplBaseParcelizer;
                int i353 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i353 + 1;
                iArr190[i353] = 16;
                return 0;
            case 230:
                int[] iArr191 = this.AudioAttributesImplBaseParcelizer;
                int i354 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i354 + 1;
                iArr191[i354] = 954;
                return 0;
            case 231:
                int i355 = this.RemoteActionCompatParcelizer;
                int i356 = i355 - 1;
                int[] iArr192 = this.AudioAttributesImplBaseParcelizer;
                iArr192[i355 - 2] = iArr192[i355 - 2] | iArr192[i356];
                this.RemoteActionCompatParcelizer = i355;
                iArr192[i356] = 1;
                return 0;
            case 232:
                int[] iArr193 = this.AudioAttributesImplBaseParcelizer;
                int i357 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i357 + 1;
                iArr193[i357] = 4760;
                return 0;
            case 233:
                int i358 = this.RemoteActionCompatParcelizer;
                int i359 = i358 - 1;
                int[] iArr194 = this.AudioAttributesImplBaseParcelizer;
                iArr194[i358 - 2] = iArr194[i358 - 2] & iArr194[i359];
                iArr194[i359] = 28;
                int i360 = i358 - 1;
                this.RemoteActionCompatParcelizer = i360;
                iArr194[i358 - 2] = iArr194[i358 - 2] >> iArr194[i360];
                return 0;
            case 234:
                int[] iArr195 = this.AudioAttributesImplBaseParcelizer;
                int i361 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i361 + 1;
                iArr195[i361] = 4;
                return 0;
            case 235:
                int[] iArr196 = this.AudioAttributesImplBaseParcelizer;
                int i362 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i362 + 1;
                iArr196[i362] = 33;
                return 0;
            case 236:
                int[] iArr197 = this.AudioAttributesImplBaseParcelizer;
                int i363 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i363 + 1;
                iArr197[i363] = 17;
                return 0;
            case 237:
                int[] iArr198 = this.AudioAttributesImplBaseParcelizer;
                int i364 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i364 + 1;
                iArr198[i364] = 44;
                return 0;
            case 238:
                int[] iArr199 = this.AudioAttributesImplBaseParcelizer;
                int i365 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i365 + 1;
                iArr199[i365] = 82;
                return 0;
            case 239:
                int[] iArr200 = this.AudioAttributesImplBaseParcelizer;
                int i366 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i366 + 1;
                iArr200[i366] = 39;
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int[] iArr201 = this.AudioAttributesImplBaseParcelizer;
                int i367 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i367 + 1;
                iArr201[i367] = 97;
                return 0;
            case 241:
                int[] iArr202 = this.AudioAttributesImplBaseParcelizer;
                int i368 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i368 + 1;
                iArr202[i368] = 99;
                return 0;
            case 242:
                Object[] objArr40 = this.MediaBrowserCompatMediaItem;
                int i369 = this.RemoteActionCompatParcelizer;
                objArr40[i369] = null;
                this.RemoteActionCompatParcelizer = i369 + 2;
                objArr40[i369 + 1] = null;
                return 0;
            case 243:
                Object[] objArr41 = this.MediaBrowserCompatMediaItem;
                int i370 = this.RemoteActionCompatParcelizer;
                objArr41[i370] = null;
                objArr41[i370 + 1] = null;
                this.RemoteActionCompatParcelizer = i370 + 3;
                objArr41[i370 + 2] = null;
                return 0;
            case 244:
                Object[] objArr42 = this.MediaBrowserCompatMediaItem;
                int i371 = this.RemoteActionCompatParcelizer;
                objArr42[i371] = null;
                objArr42[i371 + 1] = null;
                int[] iArr203 = this.AudioAttributesImplBaseParcelizer;
                this.RemoteActionCompatParcelizer = i371 + 3;
                iArr203[i371 + 2] = 1015;
                return 0;
            case 245:
                int[] iArr204 = this.AudioAttributesImplBaseParcelizer;
                int i372 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i372 + 1;
                iArr204[i372] = 5666;
                return 0;
            case 246:
                int i373 = this.RemoteActionCompatParcelizer;
                int[] iArr205 = this.AudioAttributesImplBaseParcelizer;
                iArr205[i373 - 2] = iArr205[i373 - 1] & iArr205[i373 - 2];
                int i374 = i373 - 2;
                this.RemoteActionCompatParcelizer = i374;
                iArr205[i373 - 3] = iArr205[i373 - 3] & iArr205[i374];
                return 0;
            case 247:
                int[] iArr206 = this.AudioAttributesImplBaseParcelizer;
                int i375 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i375 + 1;
                iArr206[i375] = 19;
                return 0;
            case 248:
                int[] iArr207 = this.AudioAttributesImplBaseParcelizer;
                int i376 = this.RemoteActionCompatParcelizer;
                iArr207[i376] = 10;
                this.RemoteActionCompatParcelizer = i376;
                iArr207[i376 - 1] = iArr207[i376 - 1] >> iArr207[i376];
                return 0;
            case 249:
                int[] iArr208 = this.AudioAttributesImplBaseParcelizer;
                int i377 = this.RemoteActionCompatParcelizer;
                iArr208[i377] = 2;
                this.RemoteActionCompatParcelizer = i377;
                iArr208[i377 - 1] = iArr208[i377 - 1] % iArr208[i377];
                int i378 = i377 - 1;
                this.RemoteActionCompatParcelizer = i378;
                this.MediaBrowserCompatMediaItem[i378] = null;
                return 0;
            case 250:
                int i379 = this.RemoteActionCompatParcelizer;
                int i380 = i379 - 1;
                int[] iArr209 = this.AudioAttributesImplBaseParcelizer;
                iArr209[i379 - 2] = iArr209[i379 - 2] | iArr209[i380];
                this.RemoteActionCompatParcelizer = i379;
                iArr209[i380] = 31;
                return 0;
            case 251:
                int[] iArr210 = this.AudioAttributesImplBaseParcelizer;
                int i381 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i381 + 1;
                iArr210[i381] = 6594;
                return 0;
            case 252:
                int i382 = this.RemoteActionCompatParcelizer;
                int i383 = i382 - 1;
                int[] iArr211 = this.AudioAttributesImplBaseParcelizer;
                iArr211[i382 - 2] = iArr211[i382 - 2] & iArr211[i383];
                iArr211[i383] = 6;
                int i384 = i382 - 1;
                this.RemoteActionCompatParcelizer = i384;
                iArr211[i382 - 2] = iArr211[i382 - 2] >> iArr211[i384];
                return 0;
            case 253:
                int[] iArr212 = this.AudioAttributesImplBaseParcelizer;
                int i385 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i385 + 1;
                iArr212[i385] = 41;
                return 0;
            case 254:
                int[] iArr213 = this.AudioAttributesImplBaseParcelizer;
                int i386 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i386 + 1;
                iArr213[i386] = 3830;
                return 0;
            case 255:
                int[] iArr214 = this.AudioAttributesImplBaseParcelizer;
                int i387 = this.RemoteActionCompatParcelizer;
                iArr214[i387] = 12;
                this.RemoteActionCompatParcelizer = i387;
                iArr214[i387 - 1] = iArr214[i387 - 1] >> iArr214[i387];
                return 0;
            case 256:
                Object[] objArr43 = this.MediaBrowserCompatMediaItem;
                int i388 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i388 + 1;
                objArr43[i388] = null;
                int[] iArr215 = this.AudioAttributesImplBaseParcelizer;
                Object obj20 = objArr43[i388];
                objArr43[i388] = null;
                iArr215[i388] = ((int[]) obj20).length;
                this.RemoteActionCompatParcelizer = i388;
                objArr43[i388] = null;
                return 0;
            case 257:
                int[] iArr216 = this.AudioAttributesImplBaseParcelizer;
                int i389 = this.RemoteActionCompatParcelizer;
                iArr216[i389] = -1;
                iArr216[i389 - 1] = iArr216[i389 - 1] ^ iArr216[i389];
                this.RemoteActionCompatParcelizer = i389 + 2;
                iArr216[i389 + 1] = iArr216[i389 - 1];
                iArr216[i389] = iArr216[i389 - 2];
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                int[] iArr217 = this.AudioAttributesImplBaseParcelizer;
                int i390 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i390 + 1;
                iArr217[i390] = 26;
                return 0;
            case 259:
                int i391 = this.RemoteActionCompatParcelizer;
                int[] iArr218 = this.AudioAttributesImplBaseParcelizer;
                iArr218[i391 - 2] = iArr218[i391 - 1] | iArr218[i391 - 2];
                iArr218[i391 - 3] = iArr218[i391 - 2] ^ iArr218[i391 - 3];
                int i392 = i391 - 3;
                this.RemoteActionCompatParcelizer = i392;
                this.MediaBrowserCompatMediaItem[i392] = null;
                return 0;
            case 260:
                int[] iArr219 = this.AudioAttributesImplBaseParcelizer;
                int i393 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i393 + 1;
                iArr219[i393] = 24;
                return 0;
            case 261:
                Object[] objArr44 = this.MediaBrowserCompatMediaItem;
                int i394 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i394 + 1;
                objArr44[i394] = objArr44[23];
                return 0;
            case 262:
                int i395 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i395;
                Object[] objArr45 = this.MediaBrowserCompatMediaItem;
                Object obj21 = objArr45[i395];
                objArr45[i395] = null;
                objArr45[21] = obj21;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                Object[] objArr46 = this.MediaBrowserCompatMediaItem;
                int i396 = this.RemoteActionCompatParcelizer;
                objArr46[i396] = objArr46[23];
                objArr46[i396 + 1] = objArr46[25];
                this.RemoteActionCompatParcelizer = i396 + 3;
                objArr46[i396 + 2] = objArr46[26];
                return 0;
            case 264:
                Object[] objArr47 = this.MediaBrowserCompatMediaItem;
                int i397 = this.RemoteActionCompatParcelizer;
                objArr47[i397] = objArr47[i397 - 1];
                this.RemoteActionCompatParcelizer = i397;
                Object obj22 = objArr47[i397];
                objArr47[i397] = null;
                objArr47[21] = obj22;
                return 0;
            case 265:
                int[] iArr220 = this.AudioAttributesImplBaseParcelizer;
                int i398 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i398 + 1;
                iArr220[i398] = 1033;
                return 0;
            case 266:
                int i399 = this.RemoteActionCompatParcelizer;
                int i400 = i399 - 1;
                int[] iArr221 = this.AudioAttributesImplBaseParcelizer;
                iArr221[i399 - 2] = iArr221[i399 - 2] | iArr221[i400];
                this.RemoteActionCompatParcelizer = i399;
                iArr221[i400] = 4;
                return 0;
            case 267:
                int i401 = this.RemoteActionCompatParcelizer;
                int[] iArr222 = this.AudioAttributesImplBaseParcelizer;
                iArr222[i401 - 2] = iArr222[i401 - 1] & iArr222[i401 - 2];
                int i402 = i401 - 2;
                this.RemoteActionCompatParcelizer = i402;
                iArr222[i401 - 3] = iArr222[i401 - 3] ^ iArr222[i402];
                return 0;
            case 268:
                int[] iArr223 = this.AudioAttributesImplBaseParcelizer;
                int i403 = this.RemoteActionCompatParcelizer;
                iArr223[i403] = 19;
                this.RemoteActionCompatParcelizer = i403 + 2;
                iArr223[i403 + 1] = 0;
                return 0;
            case 269:
                int[] iArr224 = this.AudioAttributesImplBaseParcelizer;
                int i404 = this.RemoteActionCompatParcelizer;
                iArr224[i404] = 27;
                this.RemoteActionCompatParcelizer = i404;
                iArr224[i404 - 1] = iArr224[i404 - 1] >> iArr224[i404];
                return 0;
            case 270:
                Object[] objArr48 = this.MediaBrowserCompatMediaItem;
                int i405 = this.RemoteActionCompatParcelizer;
                objArr48[i405] = objArr48[24];
                this.RemoteActionCompatParcelizer = i405 + 2;
                objArr48[i405 + 1] = objArr48[21];
                return 0;
            case 271:
                int i406 = this.RemoteActionCompatParcelizer;
                int i407 = i406 - 1;
                Object[] objArr49 = this.MediaBrowserCompatMediaItem;
                Object obj23 = objArr49[i407];
                objArr49[i407] = null;
                objArr49[21] = obj23;
                objArr49[i407] = objArr49[20];
                this.RemoteActionCompatParcelizer = i406 + 1;
                objArr49[i406] = objArr49[21];
                return 0;
            case 272:
                int[] iArr225 = this.AudioAttributesImplBaseParcelizer;
                int i408 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i408 + 1;
                iArr225[i408] = 563;
                return 0;
            case 273:
                int[] iArr226 = this.AudioAttributesImplBaseParcelizer;
                int i409 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i409 + 1;
                iArr226[i409] = 31;
                return 0;
            case 274:
                int[] iArr227 = this.AudioAttributesImplBaseParcelizer;
                int i410 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i410 + 1;
                iArr227[i410] = 1740;
                return 0;
            case 275:
                int[] iArr228 = this.AudioAttributesImplBaseParcelizer;
                int i411 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i411 + 1;
                iArr228[i411] = 3690;
                return 0;
            case 276:
                int i412 = this.RemoteActionCompatParcelizer;
                int i413 = i412 - 1;
                int[] iArr229 = this.AudioAttributesImplBaseParcelizer;
                iArr229[i412 - 2] = iArr229[i412 - 2] & iArr229[i413];
                this.RemoteActionCompatParcelizer = i412;
                iArr229[i413] = 17;
                return 0;
            case 277:
                Object[] objArr50 = this.MediaBrowserCompatMediaItem;
                int i414 = this.RemoteActionCompatParcelizer;
                objArr50[i414] = objArr50[20];
                objArr50[i414 + 1] = objArr50[21];
                this.RemoteActionCompatParcelizer = i414 + 3;
                objArr50[i414 + 2] = objArr50[22];
                return 0;
            case 278:
                int[] iArr230 = this.AudioAttributesImplBaseParcelizer;
                int i415 = this.RemoteActionCompatParcelizer;
                iArr230[i415] = 90;
                iArr230[i415 + 1] = 0;
                int i416 = i415 + 1;
                this.RemoteActionCompatParcelizer = i416;
                iArr230[i415] = iArr230[i415] / iArr230[i416];
                return 0;
            case 279:
                int[] iArr231 = this.AudioAttributesImplBaseParcelizer;
                int i417 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i417 + 1;
                iArr231[i417] = 63;
                return 0;
            case 280:
                int[] iArr232 = this.AudioAttributesImplBaseParcelizer;
                int i418 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i418 + 1;
                iArr232[i418] = 6917;
                return 0;
            case 281:
                int i419 = this.RemoteActionCompatParcelizer;
                int i420 = i419 - 1;
                int[] iArr233 = this.AudioAttributesImplBaseParcelizer;
                iArr233[i419 - 2] = iArr233[i419 - 2] | iArr233[i420];
                int i421 = iArr233[i419 - 2];
                iArr233[i420] = i421;
                iArr233[i419 - 2] = iArr233[i419 - 3];
                iArr233[i419 - 3] = iArr233[i419 - 4];
                iArr233[i419 - 4] = i421;
                int i422 = i419 - 1;
                this.RemoteActionCompatParcelizer = i422;
                this.MediaBrowserCompatMediaItem[i422] = null;
                return 0;
            case 282:
                int i423 = this.RemoteActionCompatParcelizer;
                int[] iArr234 = this.AudioAttributesImplBaseParcelizer;
                iArr234[i423 - 2] = iArr234[i423 - 1] | iArr234[i423 - 2];
                int i424 = i423 - 2;
                iArr234[i423 - 3] = iArr234[i423 - 3] & iArr234[i424];
                this.RemoteActionCompatParcelizer = i423 - 1;
                iArr234[i424] = 17;
                return 0;
            case 283:
                int[] iArr235 = this.AudioAttributesImplBaseParcelizer;
                int i425 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i425 + 1;
                iArr235[i425] = 64;
                return 0;
            case 284:
                int i426 = this.RemoteActionCompatParcelizer;
                int i427 = i426 - 1;
                Object[] objArr51 = this.MediaBrowserCompatMediaItem;
                Object obj24 = objArr51[i427];
                objArr51[i427] = null;
                objArr51[21] = obj24;
                this.RemoteActionCompatParcelizer = i426;
                objArr51[i427] = objArr51[20];
                return 0;
            case 285:
                int[] iArr236 = this.AudioAttributesImplBaseParcelizer;
                int i428 = this.RemoteActionCompatParcelizer;
                iArr236[i428] = 18;
                this.RemoteActionCompatParcelizer = i428;
                iArr236[i428 - 1] = iArr236[i428 - 1] >> iArr236[i428];
                return 0;
            case 286:
                int[] iArr237 = this.AudioAttributesImplBaseParcelizer;
                int i429 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i429 + 1;
                iArr237[i429] = 2471;
                return 0;
            case 287:
                int i430 = this.RemoteActionCompatParcelizer;
                int i431 = i430 - 1;
                int[] iArr238 = this.AudioAttributesImplBaseParcelizer;
                iArr238[i430 - 2] = iArr238[i430 - 2] | iArr238[i431];
                iArr238[i431] = 10;
                int i432 = i430 - 1;
                this.RemoteActionCompatParcelizer = i432;
                iArr238[i430 - 2] = iArr238[i430 - 2] >> iArr238[i432];
                return 0;
            case 288:
                int[] iArr239 = this.AudioAttributesImplBaseParcelizer;
                int i433 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i433 + 1;
                iArr239[i433] = 5596;
                return 0;
            case 289:
                int[] iArr240 = this.AudioAttributesImplBaseParcelizer;
                int i434 = this.RemoteActionCompatParcelizer;
                iArr240[i434] = 9;
                this.RemoteActionCompatParcelizer = i434 + 2;
                iArr240[i434 + 1] = 0;
                return 0;
            case 290:
                int[] iArr241 = this.AudioAttributesImplBaseParcelizer;
                int i435 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i435 + 1;
                iArr241[i435] = 47;
                return 0;
            case 291:
                int[] iArr242 = this.AudioAttributesImplBaseParcelizer;
                int i436 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i436 + 1;
                iArr242[i436] = 3897;
                return 0;
            case 292:
                int[] iArr243 = this.AudioAttributesImplBaseParcelizer;
                int i437 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i437 + 1;
                iArr243[i437] = 5;
                return 0;
            case 293:
                int i438 = this.RemoteActionCompatParcelizer;
                int[] iArr244 = this.AudioAttributesImplBaseParcelizer;
                iArr244[i438 - 2] = iArr244[i438 - 1] & iArr244[i438 - 2];
                iArr244[i438 - 3] = iArr244[i438 - 2] | iArr244[i438 - 3];
                int i439 = i438 - 3;
                this.RemoteActionCompatParcelizer = i439;
                iArr244[i438 - 4] = iArr244[i438 - 4] & iArr244[i439];
                return 0;
            case 294:
                int i440 = this.RemoteActionCompatParcelizer;
                int[] iArr245 = this.AudioAttributesImplBaseParcelizer;
                iArr245[i440 - 2] = iArr245[i440 - 1] & iArr245[i440 - 2];
                iArr245[i440 - 3] = iArr245[i440 - 2] | iArr245[i440 - 3];
                int i441 = i440 - 3;
                this.RemoteActionCompatParcelizer = i441;
                iArr245[i440 - 4] = iArr245[i440 - 4] ^ iArr245[i441];
                return 0;
            case 295:
                int i442 = this.RemoteActionCompatParcelizer;
                int i443 = i442 - 1;
                int[] iArr246 = this.AudioAttributesImplBaseParcelizer;
                iArr246[i442 - 2] = iArr246[i442 - 2] & iArr246[i443];
                iArr246[i442] = iArr246[i442 - 2];
                iArr246[i443] = iArr246[i442 - 3];
                this.RemoteActionCompatParcelizer = i442;
                iArr246[i442 - 1] = iArr246[i442] ^ iArr246[i442 - 1];
                return 0;
            case 296:
                int[] iArr247 = this.AudioAttributesImplBaseParcelizer;
                int i444 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i444 + 1;
                iArr247[i444] = 21;
                return 0;
            case 297:
                int[] iArr248 = this.AudioAttributesImplBaseParcelizer;
                int i445 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i445 + 1;
                iArr248[i445] = 2971;
                return 0;
            case 298:
                int[] iArr249 = this.AudioAttributesImplBaseParcelizer;
                int i446 = this.RemoteActionCompatParcelizer;
                iArr249[i446] = 80;
                iArr249[i446 + 1] = 0;
                int i447 = i446 + 1;
                this.RemoteActionCompatParcelizer = i447;
                iArr249[i446] = iArr249[i446] / iArr249[i447];
                return 0;
            case 299:
                int i448 = this.RemoteActionCompatParcelizer;
                int i449 = i448 - 1;
                int[] iArr250 = this.AudioAttributesImplBaseParcelizer;
                iArr250[i448 - 2] = iArr250[i448 - 2] ^ iArr250[i449];
                iArr250[i449] = 19;
                int i450 = i448 - 1;
                this.RemoteActionCompatParcelizer = i450;
                iArr250[i448 - 2] = iArr250[i448 - 2] >> iArr250[i450];
                return 0;
            case 300:
                int[] iArr251 = this.AudioAttributesImplBaseParcelizer;
                int i451 = this.RemoteActionCompatParcelizer;
                iArr251[i451] = 1;
                this.RemoteActionCompatParcelizer = i451;
                iArr251[i451 - 1] = iArr251[i451] & iArr251[i451 - 1];
                return 0;
            case 301:
                int[] iArr252 = this.AudioAttributesImplBaseParcelizer;
                int i452 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i452 + 1;
                iArr252[i452] = 37;
                return 0;
            case 302:
                int[] iArr253 = this.AudioAttributesImplBaseParcelizer;
                int i453 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i453 + 1;
                iArr253[i453] = 49;
                return 0;
            case 303:
                int[] iArr254 = this.AudioAttributesImplBaseParcelizer;
                int i454 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i454 + 1;
                iArr254[i454] = 92;
                return 0;
            case 304:
                int[] iArr255 = this.AudioAttributesImplBaseParcelizer;
                int i455 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i455 + 1;
                iArr255[i455] = 7;
                return 0;
            case 305:
                int i456 = this.RemoteActionCompatParcelizer;
                int[] iArr256 = this.AudioAttributesImplBaseParcelizer;
                iArr256[i456 - 2] = iArr256[i456 - 1] & iArr256[i456 - 2];
                this.MediaBrowserCompatMediaItem[i456 - 2] = null;
                int i457 = i456 - 3;
                this.RemoteActionCompatParcelizer = i457;
                iArr256[i456 - 4] = iArr256[i456 - 4] & iArr256[i457];
                return 0;
            case 306:
                int[] iArr257 = this.AudioAttributesImplBaseParcelizer;
                int i458 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i458 + 1;
                iArr257[i458] = 1352;
                return 0;
            case 307:
                int i459 = this.RemoteActionCompatParcelizer;
                int i460 = i459 - 1;
                int[] iArr258 = this.AudioAttributesImplBaseParcelizer;
                iArr258[i459 - 2] = iArr258[i459 - 2] | iArr258[i460];
                iArr258[i460] = 25;
                int i461 = i459 - 1;
                this.RemoteActionCompatParcelizer = i461;
                iArr258[i459 - 2] = iArr258[i459 - 2] >> iArr258[i461];
                return 0;
            case 308:
                int i462 = this.RemoteActionCompatParcelizer;
                int i463 = i462 - 1;
                Object[] objArr52 = this.MediaBrowserCompatMediaItem;
                Object obj25 = objArr52[i463];
                objArr52[i463] = null;
                objArr52[24] = obj25;
                this.RemoteActionCompatParcelizer = i462;
                objArr52[i463] = objArr52[21];
                return 0;
            case 309:
                Object[] objArr53 = this.MediaBrowserCompatMediaItem;
                int i464 = this.RemoteActionCompatParcelizer;
                objArr53[i464] = objArr53[22];
                this.RemoteActionCompatParcelizer = i464 + 2;
                objArr53[i464 + 1] = objArr53[25];
                return 0;
            case 310:
                int[] iArr259 = this.AudioAttributesImplBaseParcelizer;
                int i465 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i465 + 1;
                iArr259[i465] = 4616;
                return 0;
            case 311:
                int i466 = this.RemoteActionCompatParcelizer;
                int i467 = i466 - 1;
                int[] iArr260 = this.AudioAttributesImplBaseParcelizer;
                iArr260[i466 - 2] = iArr260[i466 - 2] ^ iArr260[i467];
                this.RemoteActionCompatParcelizer = i466 + 1;
                iArr260[i466] = iArr260[i466 - 2];
                iArr260[i467] = iArr260[i466 - 3];
                return 0;
            case 312:
                int[] iArr261 = this.AudioAttributesImplBaseParcelizer;
                int i468 = this.RemoteActionCompatParcelizer;
                iArr261[i468] = 21;
                this.RemoteActionCompatParcelizer = i468;
                iArr261[i468 - 1] = iArr261[i468 - 1] >> iArr261[i468];
                return 0;
            case 313:
                int[] iArr262 = this.AudioAttributesImplBaseParcelizer;
                int i469 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i469 + 1;
                iArr262[i469] = 1752;
                return 0;
            case 314:
                int i470 = this.RemoteActionCompatParcelizer;
                int i471 = i470 - 1;
                int[] iArr263 = this.AudioAttributesImplBaseParcelizer;
                iArr263[i470 - 2] = iArr263[i470 - 2] & iArr263[i471];
                iArr263[i470] = iArr263[i470 - 2];
                iArr263[i471] = iArr263[i470 - 3];
                this.RemoteActionCompatParcelizer = i470 + 2;
                iArr263[i470 + 1] = -1;
                return 0;
            case 315:
                int[] iArr264 = this.AudioAttributesImplBaseParcelizer;
                int i472 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i472 + 1;
                iArr264[i472] = 87;
                return 0;
            case 316:
                int[] iArr265 = this.AudioAttributesImplBaseParcelizer;
                int i473 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i473 + 1;
                iArr265[i473] = 814;
                return 0;
            case 317:
                int[] iArr266 = this.AudioAttributesImplBaseParcelizer;
                int i474 = this.RemoteActionCompatParcelizer;
                iArr266[i474] = 15;
                iArr266[i474 - 1] = iArr266[i474 - 1] >> iArr266[i474];
                this.RemoteActionCompatParcelizer = i474 + 1;
                iArr266[i474] = 1;
                return 0;
            case 318:
                int[] iArr267 = this.AudioAttributesImplBaseParcelizer;
                int i475 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i475 + 1;
                iArr267[i475] = 8;
                return 0;
            case 319:
                int i476 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i476 - 1] = null;
                int i477 = i476 - 2;
                int[] iArr268 = this.AudioAttributesImplBaseParcelizer;
                iArr268[i476 - 3] = iArr268[i476 - 3] & iArr268[i477];
                this.RemoteActionCompatParcelizer = i476 - 1;
                iArr268[i477] = 15;
                return 0;
            case 320:
                int i478 = this.RemoteActionCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i478 - 1] = null;
                int i479 = i478 - 2;
                int[] iArr269 = this.AudioAttributesImplBaseParcelizer;
                iArr269[i478 - 3] = iArr269[i478 - 3] & iArr269[i479];
                this.RemoteActionCompatParcelizer = i478 - 1;
                iArr269[i479] = -1;
                return 0;
            case 321:
                int[] iArr270 = this.AudioAttributesImplBaseParcelizer;
                int i480 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i480 + 1;
                iArr270[i480] = 94;
                return 0;
            case 322:
                int[] iArr271 = this.AudioAttributesImplBaseParcelizer;
                int i481 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i481 + 1;
                iArr271[i481] = 65;
                return 0;
            case 323:
                int[] iArr272 = this.AudioAttributesImplBaseParcelizer;
                int i482 = this.RemoteActionCompatParcelizer;
                iArr272[i482] = 23;
                this.RemoteActionCompatParcelizer = i482;
                iArr272[i482 - 1] = iArr272[i482 - 1] >> iArr272[i482];
                return 0;
            case 324:
                int[] iArr273 = this.AudioAttributesImplBaseParcelizer;
                int i483 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i483 + 1;
                iArr273[i483] = 6566;
                return 0;
            case 325:
                int[] iArr274 = this.AudioAttributesImplBaseParcelizer;
                int i484 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i484 + 1;
                iArr274[i484] = 18;
                return 0;
            case 326:
                int[] iArr275 = this.AudioAttributesImplBaseParcelizer;
                int i485 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i485 + 1;
                iArr275[i485] = 57;
                return 0;
            case 327:
                int[] iArr276 = this.AudioAttributesImplBaseParcelizer;
                int i486 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i486 + 1;
                iArr276[i486] = 3984;
                return 0;
            case 328:
                int i487 = this.RemoteActionCompatParcelizer;
                int[] iArr277 = this.AudioAttributesImplBaseParcelizer;
                iArr277[i487 - 2] = iArr277[i487 - 1] | iArr277[i487 - 2];
                int i488 = i487 - 2;
                iArr277[i487 - 3] = iArr277[i487 - 3] & iArr277[i488];
                this.RemoteActionCompatParcelizer = i487 - 1;
                int i489 = iArr277[i487 - 3];
                iArr277[i488] = i489;
                iArr277[i487 - 3] = iArr277[i487 - 4];
                iArr277[i487 - 4] = iArr277[i487 - 5];
                iArr277[i487 - 5] = i489;
                return 0;
            case 329:
                int[] iArr278 = this.AudioAttributesImplBaseParcelizer;
                int i490 = this.RemoteActionCompatParcelizer;
                iArr278[i490] = 20;
                this.RemoteActionCompatParcelizer = i490;
                iArr278[i490 - 1] = iArr278[i490 - 1] >> iArr278[i490];
                return 0;
            case 330:
                int[] iArr279 = this.AudioAttributesImplBaseParcelizer;
                int i491 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i491 + 1;
                iArr279[i491] = 90;
                return 0;
            case 331:
                int[] iArr280 = this.AudioAttributesImplBaseParcelizer;
                int i492 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i492 + 1;
                iArr280[i492] = 73;
                return 0;
            case 332:
                int[] iArr281 = this.AudioAttributesImplBaseParcelizer;
                int i493 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i493 + 1;
                iArr281[i493] = 183;
                return 0;
            case 333:
                int i494 = this.RemoteActionCompatParcelizer;
                int[] iArr282 = this.AudioAttributesImplBaseParcelizer;
                iArr282[i494 - 2] = iArr282[i494 - 1] ^ iArr282[i494 - 2];
                int i495 = i494 - 2;
                this.MediaBrowserCompatMediaItem[i495] = null;
                this.RemoteActionCompatParcelizer = i494;
                iArr282[i494 - 1] = iArr282[i494 - 3];
                iArr282[i495] = iArr282[i494 - 4];
                return 0;
            case 334:
                int[] iArr283 = this.AudioAttributesImplBaseParcelizer;
                int i496 = this.RemoteActionCompatParcelizer;
                iArr283[i496] = 20;
                iArr283[i496 - 1] = iArr283[i496 - 1] >> iArr283[i496];
                this.RemoteActionCompatParcelizer = i496 + 1;
                iArr283[i496] = 1;
                return 0;
            case 335:
                int[] iArr284 = this.AudioAttributesImplBaseParcelizer;
                int i497 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i497 + 1;
                iArr284[i497] = 1827;
                return 0;
            case 336:
                int[] iArr285 = this.AudioAttributesImplBaseParcelizer;
                int i498 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i498 + 1;
                iArr285[i498] = 30;
                return 0;
            case 337:
                Object[] objArr54 = this.MediaBrowserCompatMediaItem;
                int i499 = this.RemoteActionCompatParcelizer;
                objArr54[i499] = objArr54[24];
                objArr54[i499 + 1] = objArr54[22];
                this.RemoteActionCompatParcelizer = i499 + 3;
                objArr54[i499 + 2] = objArr54[25];
                return 0;
            case 338:
                int i500 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i500;
                Object[] objArr55 = this.MediaBrowserCompatMediaItem;
                Object obj26 = objArr55[i500];
                objArr55[i500] = null;
                objArr55[22] = obj26;
                return 0;
            case 339:
                int[] iArr286 = this.AudioAttributesImplBaseParcelizer;
                int i501 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i501 + 1;
                iArr286[i501] = 2340;
                return 0;
            case 340:
                int i502 = this.RemoteActionCompatParcelizer;
                int i503 = i502 - 1;
                int[] iArr287 = this.AudioAttributesImplBaseParcelizer;
                iArr287[i502 - 2] = iArr287[i502 - 2] & iArr287[i503];
                this.RemoteActionCompatParcelizer = i502;
                iArr287[i503] = 6;
                return 0;
            case 341:
                int[] iArr288 = this.AudioAttributesImplBaseParcelizer;
                int i504 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i504 + 1;
                iArr288[i504] = 5935;
                return 0;
            case 342:
                int i505 = this.RemoteActionCompatParcelizer;
                int i506 = i505 - 1;
                int[] iArr289 = this.AudioAttributesImplBaseParcelizer;
                iArr289[i505 - 2] = iArr289[i505 - 2] ^ iArr289[i506];
                iArr289[i506] = 22;
                int i507 = i505 - 1;
                this.RemoteActionCompatParcelizer = i507;
                iArr289[i505 - 2] = iArr289[i505 - 2] >> iArr289[i507];
                return 0;
            case 343:
                int[] iArr290 = this.AudioAttributesImplBaseParcelizer;
                int i508 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i508 + 1;
                iArr290[i508] = 1021;
                return 0;
            case 344:
                int[] iArr291 = this.AudioAttributesImplBaseParcelizer;
                int i509 = this.RemoteActionCompatParcelizer;
                iArr291[i509] = 13;
                iArr291[i509 - 1] = iArr291[i509 - 1] >> iArr291[i509];
                this.RemoteActionCompatParcelizer = i509 + 1;
                iArr291[i509] = 1;
                return 0;
            case 345:
                int[] iArr292 = this.AudioAttributesImplBaseParcelizer;
                int i510 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i510 + 1;
                iArr292[i510] = 6385;
                return 0;
            case 346:
                int i511 = this.RemoteActionCompatParcelizer;
                int i512 = i511 - 1;
                int[] iArr293 = this.AudioAttributesImplBaseParcelizer;
                iArr293[i511 - 2] = iArr293[i511 - 2] & iArr293[i512];
                iArr293[i512] = 3;
                int i513 = i511 - 1;
                this.RemoteActionCompatParcelizer = i513;
                iArr293[i511 - 2] = iArr293[i511 - 2] >> iArr293[i513];
                return 0;
            case 347:
                Object[] objArr56 = this.MediaBrowserCompatMediaItem;
                int i514 = this.RemoteActionCompatParcelizer;
                objArr56[i514] = objArr56[24];
                this.RemoteActionCompatParcelizer = i514 + 2;
                objArr56[i514 + 1] = objArr56[22];
                return 0;
            case 348:
                int[] iArr294 = this.AudioAttributesImplBaseParcelizer;
                int i515 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i515 + 1;
                iArr294[i515] = 2280;
                return 0;
            case 349:
                int[] iArr295 = this.AudioAttributesImplBaseParcelizer;
                int i516 = this.RemoteActionCompatParcelizer;
                iArr295[i516] = 6;
                iArr295[i516 - 1] = iArr295[i516 - 1] >> iArr295[i516];
                this.RemoteActionCompatParcelizer = i516 + 1;
                iArr295[i516] = 1;
                return 0;
            case 350:
                int i517 = this.RemoteActionCompatParcelizer;
                int[] iArr296 = this.AudioAttributesImplBaseParcelizer;
                iArr296[i517 - 2] = iArr296[i517 - 1] | iArr296[i517 - 2];
                this.MediaBrowserCompatMediaItem[i517 - 2] = null;
                int i518 = i517 - 3;
                this.RemoteActionCompatParcelizer = i518;
                iArr296[i517 - 4] = iArr296[i517 - 4] & iArr296[i518];
                return 0;
            case 351:
                int i519 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i519;
                Object[] objArr57 = this.MediaBrowserCompatMediaItem;
                Object obj27 = objArr57[i519];
                objArr57[i519] = null;
                objArr57[27] = obj27;
                return 0;
            case 352:
                int i520 = this.RemoteActionCompatParcelizer;
                int i521 = i520 - 1;
                Object[] objArr58 = this.MediaBrowserCompatMediaItem;
                Object obj28 = objArr58[i521];
                objArr58[i521] = null;
                objArr58[29] = obj28;
                this.RemoteActionCompatParcelizer = i520;
                objArr58[i521] = objArr58[24];
                return 0;
            case 353:
                int i522 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i522;
                int[] iArr297 = this.AudioAttributesImplBaseParcelizer;
                iArr297[25] = iArr297[i522];
                return 0;
            case 354:
                Object[] objArr59 = this.MediaBrowserCompatMediaItem;
                int i523 = this.RemoteActionCompatParcelizer;
                objArr59[i523] = objArr59[27];
                objArr59[i523 + 1] = objArr59[28];
                this.RemoteActionCompatParcelizer = i523 + 3;
                objArr59[i523 + 2] = objArr59[29];
                return 0;
            case 355:
                int[] iArr298 = this.AudioAttributesImplBaseParcelizer;
                int i524 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i524 + 1;
                iArr298[i524] = iArr298[25];
                return 0;
            case 356:
                Object[] objArr60 = this.MediaBrowserCompatMediaItem;
                int i525 = this.RemoteActionCompatParcelizer;
                objArr60[i525] = objArr60[21];
                objArr60[i525 + 1] = objArr60[22];
                this.RemoteActionCompatParcelizer = i525 + 3;
                objArr60[i525 + 2] = objArr60[26];
                return 0;
            case 357:
                int[] iArr299 = this.AudioAttributesImplBaseParcelizer;
                int i526 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i526 + 1;
                iArr299[i526] = 633;
                return 0;
            case 358:
                int i527 = this.RemoteActionCompatParcelizer;
                int i528 = i527 - 1;
                int[] iArr300 = this.AudioAttributesImplBaseParcelizer;
                iArr300[i527 - 2] = iArr300[i527 - 2] | iArr300[i528];
                this.RemoteActionCompatParcelizer = i527;
                iArr300[i528] = 19;
                return 0;
            case 359:
                int[] iArr301 = this.AudioAttributesImplBaseParcelizer;
                int i529 = this.RemoteActionCompatParcelizer;
                iArr301[i529] = 37;
                this.RemoteActionCompatParcelizer = i529 + 2;
                iArr301[i529 + 1] = 0;
                return 0;
            case 360:
                int[] iArr302 = this.AudioAttributesImplBaseParcelizer;
                int i530 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i530 + 1;
                iArr302[i530] = 4228;
                return 0;
            case 361:
                int i531 = this.RemoteActionCompatParcelizer;
                int i532 = i531 - 1;
                int[] iArr303 = this.AudioAttributesImplBaseParcelizer;
                iArr303[i531 - 2] = iArr303[i531 - 2] | iArr303[i532];
                iArr303[i532] = 21;
                int i533 = i531 - 1;
                this.RemoteActionCompatParcelizer = i533;
                iArr303[i531 - 2] = iArr303[i531 - 2] >> iArr303[i533];
                return 0;
            case 362:
                int i534 = this.RemoteActionCompatParcelizer;
                int i535 = i534 - 1;
                Object[] objArr61 = this.MediaBrowserCompatMediaItem;
                Object obj29 = objArr61[i535];
                objArr61[i535] = null;
                objArr61[26] = obj29;
                this.RemoteActionCompatParcelizer = i534;
                objArr61[i535] = objArr61[23];
                return 0;
            case 363:
                int[] iArr304 = this.AudioAttributesImplBaseParcelizer;
                int i536 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i536 + 1;
                iArr304[i536] = 2999;
                return 0;
            case 364:
                int[] iArr305 = this.AudioAttributesImplBaseParcelizer;
                int i537 = this.RemoteActionCompatParcelizer;
                iArr305[i537] = 11;
                this.RemoteActionCompatParcelizer = i537;
                iArr305[i537 - 1] = iArr305[i537 - 1] >> iArr305[i537];
                return 0;
            case 365:
                int[] iArr306 = this.AudioAttributesImplBaseParcelizer;
                int i538 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i538 + 1;
                iArr306[i538] = 902;
                return 0;
            case 366:
                int[] iArr307 = this.AudioAttributesImplBaseParcelizer;
                int i539 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i539 + 1;
                iArr307[i539] = 3718;
                return 0;
            case 367:
                int i540 = this.RemoteActionCompatParcelizer;
                int i541 = i540 - 1;
                int[] iArr308 = this.AudioAttributesImplBaseParcelizer;
                iArr308[i540 - 2] = iArr308[i540 - 2] | iArr308[i541];
                iArr308[i541] = 4;
                int i542 = i540 - 1;
                this.RemoteActionCompatParcelizer = i542;
                iArr308[i540 - 2] = iArr308[i540 - 2] >> iArr308[i542];
                return 0;
            case 368:
                int i543 = this.RemoteActionCompatParcelizer;
                int i544 = i543 - 1;
                int[] iArr309 = this.AudioAttributesImplBaseParcelizer;
                iArr309[i543 - 2] = iArr309[i543 - 2] & iArr309[i544];
                iArr309[i544] = 9;
                int i545 = i543 - 1;
                this.RemoteActionCompatParcelizer = i545;
                iArr309[i543 - 2] = iArr309[i543 - 2] >> iArr309[i545];
                return 0;
            case 369:
                int[] iArr310 = this.AudioAttributesImplBaseParcelizer;
                int i546 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i546 + 1;
                iArr310[i546] = 2001;
                return 0;
            case 370:
                int[] iArr311 = this.AudioAttributesImplBaseParcelizer;
                int i547 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i547 + 1;
                iArr311[i547] = 79;
                return 0;
            case 371:
                int[] iArr312 = this.AudioAttributesImplBaseParcelizer;
                int i548 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i548 + 1;
                iArr312[i548] = 46;
                return 0;
            case 372:
                int[] iArr313 = this.AudioAttributesImplBaseParcelizer;
                int i549 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i549 + 1;
                iArr313[i549] = 2;
                return 0;
            case 373:
                int[] iArr314 = this.AudioAttributesImplBaseParcelizer;
                int i550 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i550 + 1;
                iArr314[i550] = 36;
                return 0;
            case 374:
                int[] iArr315 = this.AudioAttributesImplBaseParcelizer;
                int i551 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i551 + 1;
                iArr315[i551] = 48;
                return 0;
            case 375:
                Object[] objArr62 = this.MediaBrowserCompatMediaItem;
                int i552 = this.RemoteActionCompatParcelizer;
                objArr62[i552] = objArr62[i552 - 1];
                this.RemoteActionCompatParcelizer = i552;
                Object obj30 = objArr62[i552];
                objArr62[i552] = null;
                objArr62[26] = obj30;
                return 0;
            case 376:
                Object[] objArr63 = this.MediaBrowserCompatMediaItem;
                int i553 = this.RemoteActionCompatParcelizer;
                objArr63[i553] = objArr63[21];
                objArr63[i553 + 1] = objArr63[22];
                this.RemoteActionCompatParcelizer = i553 + 3;
                objArr63[i553 + 2] = objArr63[24];
                return 0;
            case 377:
                Object[] objArr64 = this.MediaBrowserCompatMediaItem;
                int i554 = this.RemoteActionCompatParcelizer;
                objArr64[i554] = objArr64[20];
                this.RemoteActionCompatParcelizer = i554 + 2;
                objArr64[i554 + 1] = objArr64[22];
                return 0;
            case 378:
                int[] iArr316 = this.AudioAttributesImplBaseParcelizer;
                int i555 = this.RemoteActionCompatParcelizer;
                iArr316[i555] = 29;
                this.RemoteActionCompatParcelizer = i555;
                iArr316[i555 - 1] = iArr316[i555 - 1] >> iArr316[i555];
                return 0;
            case 379:
                int[] iArr317 = this.AudioAttributesImplBaseParcelizer;
                int i556 = this.RemoteActionCompatParcelizer;
                iArr317[i556] = 19;
                this.RemoteActionCompatParcelizer = i556;
                iArr317[i556 - 1] = iArr317[i556 - 1] >> iArr317[i556];
                return 0;
            case 380:
                int[] iArr318 = this.AudioAttributesImplBaseParcelizer;
                int i557 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i557 + 1;
                iArr318[i557] = 3190;
                return 0;
            case 381:
                int i558 = this.RemoteActionCompatParcelizer;
                int i559 = i558 - 1;
                int[] iArr319 = this.AudioAttributesImplBaseParcelizer;
                iArr319[i558 - 2] = iArr319[i558 - 2] & iArr319[i559];
                this.RemoteActionCompatParcelizer = i558;
                iArr319[i559] = 30;
                return 0;
            case 382:
                int[] iArr320 = this.AudioAttributesImplBaseParcelizer;
                int i560 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i560 + 1;
                iArr320[i560] = 6198;
                return 0;
            case 383:
                int[] iArr321 = this.AudioAttributesImplBaseParcelizer;
                int i561 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i561 + 1;
                iArr321[i561] = 1108;
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                int[] iArr322 = this.AudioAttributesImplBaseParcelizer;
                int i562 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i562 + 1;
                iArr322[i562] = 78;
                return 0;
            case 385:
                Object[] objArr65 = this.MediaBrowserCompatMediaItem;
                int i563 = this.RemoteActionCompatParcelizer;
                objArr65[i563] = objArr65[23];
                this.RemoteActionCompatParcelizer = i563 + 2;
                objArr65[i563 + 1] = objArr65[25];
                return 0;
            case 386:
                int i564 = this.RemoteActionCompatParcelizer;
                int i565 = i564 - 1;
                Object[] objArr66 = this.MediaBrowserCompatMediaItem;
                Object obj31 = objArr66[i565];
                objArr66[i565] = null;
                objArr66[23] = obj31;
                this.RemoteActionCompatParcelizer = i564;
                objArr66[i565] = objArr66[20];
                return 0;
            case 387:
                int[] iArr323 = this.AudioAttributesImplBaseParcelizer;
                int i566 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i566 + 1;
                iArr323[i566] = 3059;
                return 0;
            case 388:
                int[] iArr324 = this.AudioAttributesImplBaseParcelizer;
                int i567 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i567 + 1;
                iArr324[i567] = 2720;
                return 0;
            case 389:
                int[] iArr325 = this.AudioAttributesImplBaseParcelizer;
                int i568 = this.RemoteActionCompatParcelizer;
                iArr325[i568] = 17;
                this.RemoteActionCompatParcelizer = i568;
                iArr325[i568 - 1] = iArr325[i568 - 1] >> iArr325[i568];
                return 0;
            case 390:
                int[] iArr326 = this.AudioAttributesImplBaseParcelizer;
                int i569 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i569 + 1;
                iArr326[i569] = 1533;
                return 0;
            case 391:
                int[] iArr327 = this.AudioAttributesImplBaseParcelizer;
                int i570 = this.RemoteActionCompatParcelizer;
                iArr327[i570] = 25;
                iArr327[i570 - 1] = iArr327[i570 - 1] >> iArr327[i570];
                this.RemoteActionCompatParcelizer = i570 + 1;
                iArr327[i570] = 1;
                return 0;
            case 392:
                int[] iArr328 = this.AudioAttributesImplBaseParcelizer;
                int i571 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i571 + 1;
                iArr328[i571] = 67;
                return 0;
            default:
                return i;
        }
    }

    public escapeHtml(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        objArr[21] = obj2;
        objArr[22] = obj3;
        objArr[23] = obj4;
        objArr[24] = obj5;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public escapeHtml(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        objArr[21] = obj2;
        objArr[22] = obj3;
        objArr[23] = obj4;
        objArr[24] = obj5;
        objArr[25] = obj6;
        objArr[26] = obj7;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public escapeHtml(Object obj) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public escapeHtml(Object obj, Object obj2, Object obj3, Object obj4) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        objArr[21] = obj2;
        objArr[22] = obj3;
        objArr[23] = obj4;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public escapeHtml(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.AudioAttributesImplBaseParcelizer = new int[32];
        this.AudioAttributesImplApi26Parcelizer = new long[32];
        this.MediaBrowserCompatItemReceiver = new float[32];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[32];
        Object[] objArr = new Object[32];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[20] = obj;
        objArr[21] = obj2;
        objArr[22] = obj3;
        objArr[23] = obj4;
        objArr[24] = obj5;
        objArr[25] = obj6;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }
}
