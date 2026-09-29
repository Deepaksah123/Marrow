package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes3.dex */
public class hideScrubber {
    public long AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    public float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    public double MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final double[] MediaBrowserCompatSearchResultReceiver;
    private final int[] MediaDescriptionCompat;
    private final float[] MediaMetadataCompat;
    private final long[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    private final Object[] onCommand;
    public long read;
    public float write;

    public hideScrubber() {
        this.MediaDescriptionCompat = new int[18];
        this.RatingCompat = new long[18];
        this.MediaMetadataCompat = new float[18];
        this.MediaBrowserCompatSearchResultReceiver = new double[18];
        this.onCommand = new Object[18];
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.onCommand;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i2 + 1;
                objArr[i2] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 2:
                int[] iArr = this.MediaDescriptionCompat;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i3 + 1;
                iArr[i3] = 2;
                return 0;
            case 3:
                int[] iArr2 = this.MediaDescriptionCompat;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                iArr2[i4] = 2;
                this.AudioAttributesImplBaseParcelizer = i4;
                iArr2[i4 - 1] = iArr2[i4 - 1] % iArr2[i4];
                int i5 = i4 - 1;
                this.AudioAttributesImplBaseParcelizer = i5;
                this.onCommand[i5] = null;
                return 0;
            case 5:
                Object[] objArr2 = this.onCommand;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                Object obj = objArr2[i6 - 1];
                objArr2[i6 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj;
            case 4:
                return 0;
            case 6:
                int[] iArr3 = this.MediaDescriptionCompat;
                int i7 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i7 + 1;
                iArr3[i7] = this.IconCompatParcelizer;
                return 0;
            case 7:
                int[] iArr4 = this.MediaDescriptionCompat;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i8 + 1;
                iArr4[i8] = 35;
                return 0;
            case 8:
                int i9 = this.AudioAttributesImplBaseParcelizer;
                int i10 = i9 - 1;
                int[] iArr5 = this.MediaDescriptionCompat;
                iArr5[i9 - 2] = iArr5[i9 - 2] + iArr5[i10];
                this.AudioAttributesImplBaseParcelizer = i9;
                iArr5[i10] = iArr5[i9 - 2];
                return 0;
            case 9:
                int[] iArr6 = this.MediaDescriptionCompat;
                int i11 = this.AudioAttributesImplBaseParcelizer;
                iArr6[i11] = 128;
                this.AudioAttributesImplBaseParcelizer = i11;
                iArr6[i11 - 1] = iArr6[i11 - 1] % iArr6[i11];
                return 0;
            case 10:
                int i12 = this.AudioAttributesImplBaseParcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i12;
                this.MediaBrowserCompatMediaItem = i12;
                return 0;
            case 11:
                int[] iArr7 = this.MediaDescriptionCompat;
                int i13 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i13 + 1;
                this.RemoteActionCompatParcelizer = iArr7[i13];
                return 0;
            case 12:
                int i14 = this.AudioAttributesImplBaseParcelizer;
                int i15 = i14 - 1;
                this.AudioAttributesImplBaseParcelizer = i15;
                int[] iArr8 = this.MediaDescriptionCompat;
                iArr8[i14 - 2] = iArr8[i14 - 2] % iArr8[i15];
                return 0;
            case 13:
                int i16 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i16;
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat[i16] != 0 ? 0 : 1;
                return 0;
            case 14:
                int[] iArr9 = this.MediaDescriptionCompat;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                iArr9[i17] = 21;
                return 0;
            case 15:
                int i18 = this.AudioAttributesImplBaseParcelizer;
                int i19 = i18 - 1;
                this.AudioAttributesImplBaseParcelizer = i19;
                int[] iArr10 = this.MediaDescriptionCompat;
                iArr10[i18 - 2] = iArr10[i18 - 2] + iArr10[i19];
                return 0;
            case 16:
                int[] iArr11 = this.MediaDescriptionCompat;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                iArr11[i20] = iArr11[i20 - 1];
                iArr11[i20 + 1] = 128;
                int i21 = i20 + 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                iArr11[i20] = iArr11[i20] % iArr11[i21];
                return 0;
            case 17:
                Object[] objArr3 = this.onCommand;
                int i22 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i22 + 1;
                Object obj2 = objArr3[i22];
                objArr3[i22] = null;
                this.MediaBrowserCompatItemReceiver = obj2;
                return 0;
            case 18:
                Object[] objArr4 = this.onCommand;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i23 + 1;
                objArr4[i23] = objArr4[5];
                return 0;
            case 19:
                int i24 = this.AudioAttributesImplBaseParcelizer;
                int i25 = i24 - 1;
                this.AudioAttributesImplBaseParcelizer = i25;
                int[] iArr12 = this.MediaDescriptionCompat;
                iArr12[i24 - 2] = iArr12[i24 - 2] % iArr12[i25];
                int i26 = i24 - 2;
                this.AudioAttributesImplBaseParcelizer = i26;
                this.onCommand[i26] = null;
                return 0;
            case 20:
                int[] iArr13 = this.MediaDescriptionCompat;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                iArr13[i27] = 61;
                iArr13[i27 - 1] = iArr13[i27 - 1] + iArr13[i27];
                this.AudioAttributesImplBaseParcelizer = i27 + 1;
                iArr13[i27] = iArr13[i27 - 1];
                return 0;
            case 21:
                int[] iArr14 = this.MediaDescriptionCompat;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i28 + 1;
                iArr14[i28] = 128;
                return 0;
            case 22:
                int[] iArr15 = this.MediaDescriptionCompat;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                iArr15[i29] = 2;
                this.AudioAttributesImplBaseParcelizer = i29;
                iArr15[i29 - 1] = iArr15[i29 - 1] % iArr15[i29];
                return 0;
            case 23:
                Object[] objArr5 = this.onCommand;
                int i30 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i30 + 1;
                objArr5[i30] = null;
                return 0;
            case 24:
                int[] iArr16 = this.MediaDescriptionCompat;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr6 = this.onCommand;
                Object obj3 = objArr6[i31 - 1];
                objArr6[i31 - 1] = null;
                iArr16[i31 - 1] = ((int[]) obj3).length;
                return 0;
            case 25:
                int i32 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i32;
                this.onCommand[i32] = null;
                return 0;
            case 26:
                int[] iArr17 = this.MediaDescriptionCompat;
                int i33 = this.AudioAttributesImplBaseParcelizer;
                iArr17[i33] = 91;
                this.AudioAttributesImplBaseParcelizer = i33;
                iArr17[i33 - 1] = iArr17[i33 - 1] + iArr17[i33];
                return 0;
            case 27:
                int[] iArr18 = this.MediaDescriptionCompat;
                int i34 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i34 + 1;
                iArr18[i34] = 16;
                return 0;
            case 28:
                int[] iArr19 = this.MediaDescriptionCompat;
                int i35 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i35 + 1;
                iArr19[i35] = 0;
                return 0;
            case 29:
                int i36 = this.AudioAttributesImplBaseParcelizer;
                int i37 = i36 - 1;
                this.AudioAttributesImplBaseParcelizer = i37;
                int[] iArr20 = this.MediaDescriptionCompat;
                iArr20[i36 - 2] = iArr20[i36 - 2] / iArr20[i37];
                int i38 = i36 - 2;
                this.AudioAttributesImplBaseParcelizer = i38;
                this.onCommand[i38] = null;
                return 0;
            case 30:
                int[] iArr21 = this.MediaDescriptionCompat;
                int i39 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i39;
                this.RemoteActionCompatParcelizer = iArr21[i39];
                return 0;
            case 31:
                int[] iArr22 = this.MediaDescriptionCompat;
                int i40 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i40 + 1;
                iArr22[i40] = 0;
                return 0;
            case 32:
                int[] iArr23 = this.MediaDescriptionCompat;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i41 + 1;
                iArr23[i41] = 1;
                return 0;
            case 33:
                int[] iArr24 = this.MediaDescriptionCompat;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i42 + 1;
                iArr24[i42] = 17;
                return 0;
            case 34:
                int[] iArr25 = this.MediaDescriptionCompat;
                int i43 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i43 + 1;
                iArr25[i43] = 63;
                return 0;
            case 35:
                for (int i44 = this.AudioAttributesImplBaseParcelizer - 1; i44 >= 0; i44--) {
                    this.onCommand[i44] = null;
                }
                Object[] objArr7 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr7[0] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 36:
                int[] iArr26 = this.MediaDescriptionCompat;
                int i45 = this.AudioAttributesImplBaseParcelizer;
                iArr26[i45] = 2;
                iArr26[i45 + 1] = 2;
                int i46 = i45 + 1;
                this.AudioAttributesImplBaseParcelizer = i46;
                iArr26[i45] = iArr26[i45] % iArr26[i46];
                return 0;
            case 37:
                int[] iArr27 = this.MediaDescriptionCompat;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                iArr27[i47] = 9;
                iArr27[i47 - 1] = iArr27[i47 - 1] + iArr27[i47];
                this.AudioAttributesImplBaseParcelizer = i47 + 1;
                iArr27[i47] = iArr27[i47 - 1];
                return 0;
            case 38:
                int i48 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i48;
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat[i48] == 0 ? 0 : 1;
                return 0;
            case 39:
                int[] iArr28 = this.MediaDescriptionCompat;
                int i49 = this.AudioAttributesImplBaseParcelizer;
                iArr28[i49] = 11;
                this.AudioAttributesImplBaseParcelizer = i49;
                iArr28[i49 - 1] = iArr28[i49 - 1] + iArr28[i49];
                return 0;
            case 40:
                int[] iArr29 = this.MediaDescriptionCompat;
                int i50 = this.AudioAttributesImplBaseParcelizer;
                iArr29[i50] = iArr29[i50 - 1];
                this.AudioAttributesImplBaseParcelizer = i50 + 2;
                iArr29[i50 + 1] = 128;
                return 0;
            case 41:
                int[] iArr30 = this.MediaDescriptionCompat;
                int i51 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i51 + 1;
                iArr30[i51] = 75;
                return 0;
            case 42:
                int i52 = this.AudioAttributesImplBaseParcelizer;
                int i53 = i52 - 1;
                int[] iArr31 = this.MediaDescriptionCompat;
                iArr31[i52 - 2] = iArr31[i52 - 2] + iArr31[i53];
                iArr31[i53] = iArr31[i52 - 2];
                this.AudioAttributesImplBaseParcelizer = i52 + 1;
                iArr31[i52] = 128;
                return 0;
            case 43:
                int[] iArr32 = this.MediaDescriptionCompat;
                int i54 = this.AudioAttributesImplBaseParcelizer;
                iArr32[i54] = 89;
                iArr32[i54 + 1] = 0;
                int i55 = i54 + 1;
                this.AudioAttributesImplBaseParcelizer = i55;
                iArr32[i54] = iArr32[i54] / iArr32[i55];
                return 0;
            case 44:
                int[] iArr33 = this.MediaDescriptionCompat;
                int i56 = this.AudioAttributesImplBaseParcelizer;
                iArr33[i56] = 59;
                iArr33[i56 - 1] = iArr33[i56 - 1] + iArr33[i56];
                this.AudioAttributesImplBaseParcelizer = i56 + 1;
                iArr33[i56] = iArr33[i56 - 1];
                return 0;
            case 45:
                int[] iArr34 = this.MediaDescriptionCompat;
                int i57 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i57 + 1;
                iArr34[i57] = 5;
                return 0;
            case 46:
                int[] iArr35 = this.MediaDescriptionCompat;
                int i58 = this.AudioAttributesImplBaseParcelizer;
                iArr35[i58] = 1;
                this.AudioAttributesImplBaseParcelizer = i58;
                iArr35[i58 - 1] = iArr35[i58 - 1] + iArr35[i58];
                return 0;
            case 47:
                int[] iArr36 = this.MediaDescriptionCompat;
                int i59 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i59 + 1;
                iArr36[i59] = iArr36[i59 - 1];
                return 0;
            case 48:
                int[] iArr37 = this.MediaDescriptionCompat;
                int i60 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i60 + 1;
                iArr37[i60] = 67;
                return 0;
            case 49:
                int[] iArr38 = this.MediaDescriptionCompat;
                int i61 = this.AudioAttributesImplBaseParcelizer;
                iArr38[i61] = 79;
                this.AudioAttributesImplBaseParcelizer = i61;
                iArr38[i61 - 1] = iArr38[i61 - 1] + iArr38[i61];
                return 0;
            case 50:
                int[] iArr39 = this.MediaDescriptionCompat;
                int i62 = this.AudioAttributesImplBaseParcelizer;
                iArr39[i62] = 39;
                iArr39[i62 - 1] = iArr39[i62 - 1] + iArr39[i62];
                this.AudioAttributesImplBaseParcelizer = i62 + 1;
                iArr39[i62] = iArr39[i62 - 1];
                return 0;
            case 51:
                int[] iArr40 = this.MediaDescriptionCompat;
                int i63 = this.AudioAttributesImplBaseParcelizer;
                iArr40[i63] = iArr40[6];
                this.AudioAttributesImplBaseParcelizer = i63;
                Object[] objArr8 = this.onCommand;
                Object obj4 = objArr8[i63 - 1];
                objArr8[i63 - 1] = null;
                iArr40[i63 - 1] = ((int[]) obj4)[iArr40[i63]];
                return 0;
            case 52:
                int i64 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i64;
                int[] iArr41 = this.MediaDescriptionCompat;
                iArr41[16] = iArr41[i64];
                return 0;
            case 53:
                int[] iArr42 = this.MediaDescriptionCompat;
                int i65 = this.AudioAttributesImplBaseParcelizer;
                iArr42[i65] = iArr42[6];
                this.AudioAttributesImplBaseParcelizer = i65;
                Object[] objArr9 = this.onCommand;
                Object obj5 = objArr9[i65 - 1];
                objArr9[i65 - 1] = null;
                objArr9[i65 - 1] = ((Object[]) obj5)[iArr42[i65]];
                int i66 = i65 - 1;
                this.AudioAttributesImplBaseParcelizer = i66;
                Object obj6 = objArr9[i66];
                objArr9[i66] = null;
                objArr9[17] = obj6;
                return 0;
            case 54:
                Object[] objArr10 = this.onCommand;
                int i67 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i67 + 1;
                objArr10[i67] = objArr10[i67 - 1];
                return 0;
            case 55:
                int i68 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i68;
                Object[] objArr11 = this.onCommand;
                Object obj7 = objArr11[i68];
                objArr11[i68] = null;
                objArr11[7] = obj7;
                return 0;
            case 56:
                Object[] objArr12 = this.onCommand;
                int i69 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i69 + 1;
                objArr12[i69] = objArr12[7];
                return 0;
            case 57:
                int i70 = this.AudioAttributesImplBaseParcelizer;
                int i71 = i70 - 1;
                int[] iArr43 = this.MediaDescriptionCompat;
                iArr43[6] = iArr43[i71];
                Object[] objArr13 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i70;
                objArr13[i71] = objArr13[7];
                return 0;
            case 58:
                this.MediaMetadataCompat[this.AudioAttributesImplBaseParcelizer - 1] = this.MediaDescriptionCompat[r2 - 1];
                return 0;
            case 59:
                float[] fArr = this.MediaMetadataCompat;
                int i72 = this.AudioAttributesImplBaseParcelizer;
                fArr[i72] = fArr[i72 - 1];
                this.AudioAttributesImplBaseParcelizer = i72;
                fArr[7] = fArr[i72];
                return 0;
            case 60:
                float[] fArr2 = this.MediaMetadataCompat;
                int i73 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i73 + 1;
                fArr2[i73] = this.write;
                return 0;
            case 61:
                int i74 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr3 = this.MediaMetadataCompat;
                fArr3[i74 - 2] = fArr3[i74 - 2] * fArr3[i74 - 1];
                int[] iArr44 = this.MediaDescriptionCompat;
                iArr44[i74 - 2] = (int) fArr3[i74 - 2];
                int i75 = i74 - 2;
                this.AudioAttributesImplBaseParcelizer = i75;
                iArr44[13] = iArr44[i75];
                return 0;
            case 62:
                int[] iArr45 = this.MediaDescriptionCompat;
                int i76 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i76 + 1;
                iArr45[i76] = iArr45[6];
                return 0;
            case 63:
                int i77 = this.AudioAttributesImplBaseParcelizer;
                int i78 = i77 - 1;
                this.AudioAttributesImplBaseParcelizer = i78;
                float[] fArr4 = this.MediaMetadataCompat;
                fArr4[i77 - 2] = fArr4[i77 - 2] * fArr4[i78];
                return 0;
            case 64:
                int[] iArr46 = this.MediaDescriptionCompat;
                int i79 = this.AudioAttributesImplBaseParcelizer;
                iArr46[i79 - 1] = (int) this.MediaMetadataCompat[i79 - 1];
                return 0;
            case 65:
                int i80 = this.AudioAttributesImplBaseParcelizer;
                int i81 = i80 - 1;
                int[] iArr47 = this.MediaDescriptionCompat;
                iArr47[6] = iArr47[i81];
                Object[] objArr14 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i80;
                objArr14[i81] = objArr14[5];
                return 0;
            case 66:
                int[] iArr48 = this.MediaDescriptionCompat;
                int i82 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i82 + 1;
                iArr48[i82] = 100;
                return 0;
            case 67:
                int i83 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr5 = this.MediaMetadataCompat;
                fArr5[i83 - 2] = fArr5[i83 - 2] / fArr5[i83 - 1];
                int i84 = i83 - 2;
                this.AudioAttributesImplBaseParcelizer = i84;
                fArr5[10] = fArr5[i84];
                return 0;
            case 68:
                int i85 = this.AudioAttributesImplBaseParcelizer;
                int i86 = i85 - 1;
                this.AudioAttributesImplBaseParcelizer = i86;
                float[] fArr6 = this.MediaMetadataCompat;
                fArr6[i85 - 2] = fArr6[i85 - 2] / fArr6[i86];
                return 0;
            case 69:
                int i87 = this.AudioAttributesImplBaseParcelizer;
                int i88 = i87 - 1;
                float[] fArr7 = this.MediaMetadataCompat;
                fArr7[11] = fArr7[i88];
                Object[] objArr15 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i87;
                objArr15[i88] = objArr15[5];
                return 0;
            case 70:
                int i89 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr8 = this.MediaMetadataCompat;
                fArr8[i89 - 2] = fArr8[i89 - 2] / fArr8[i89 - 1];
                int i90 = i89 - 2;
                this.AudioAttributesImplBaseParcelizer = i90;
                fArr8[8] = fArr8[i90];
                return 0;
            case 71:
                int i91 = this.AudioAttributesImplBaseParcelizer;
                int i92 = i91 - 1;
                float[] fArr9 = this.MediaMetadataCompat;
                fArr9[9] = fArr9[i92];
                int[] iArr49 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i91;
                iArr49[i92] = iArr49[13];
                fArr9[i91 - 1] = iArr49[i91 - 1];
                return 0;
            case 72:
                int i93 = this.AudioAttributesImplBaseParcelizer;
                int i94 = i93 - 1;
                float[] fArr10 = this.MediaMetadataCompat;
                fArr10[12] = fArr10[i94];
                fArr10[i94] = fArr10[10];
                this.AudioAttributesImplBaseParcelizer = i93 + 1;
                fArr10[i93] = fArr10[12];
                return 0;
            case 73:
                int i95 = this.AudioAttributesImplBaseParcelizer;
                float[] fArr11 = this.MediaMetadataCompat;
                fArr11[i95 - 2] = fArr11[i95 - 2] * fArr11[i95 - 1];
                int[] iArr50 = this.MediaDescriptionCompat;
                iArr50[i95 - 2] = (int) fArr11[i95 - 2];
                int i96 = i95 - 2;
                this.AudioAttributesImplBaseParcelizer = i96;
                iArr50[10] = iArr50[i96];
                return 0;
            case 74:
                int i97 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i97;
                int[] iArr51 = this.MediaDescriptionCompat;
                iArr51[13] = iArr51[i97];
                return 0;
            case 75:
                int[] iArr52 = this.MediaDescriptionCompat;
                int i98 = this.AudioAttributesImplBaseParcelizer;
                iArr52[i98] = iArr52[10];
                this.AudioAttributesImplBaseParcelizer = i98 + 2;
                iArr52[i98 + 1] = iArr52[13];
                return 0;
            case 76:
                int i99 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i99;
                int[] iArr53 = this.MediaDescriptionCompat;
                iArr53[15] = iArr53[i99];
                return 0;
            case 77:
                float[] fArr12 = this.MediaMetadataCompat;
                int i100 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i100 + 1;
                fArr12[i100] = fArr12[12];
                return 0;
            case 78:
                float[] fArr13 = this.MediaMetadataCompat;
                int i101 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i101 + 1;
                fArr13[i101] = fArr13[11];
                return 0;
            case 79:
                int[] iArr54 = this.MediaDescriptionCompat;
                int i102 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i102 + 1;
                iArr54[i102] = iArr54[13];
                return 0;
            case 80:
                int i103 = this.AudioAttributesImplBaseParcelizer;
                int i104 = i103 - 1;
                int[] iArr55 = this.MediaDescriptionCompat;
                iArr55[12] = iArr55[i104];
                this.AudioAttributesImplBaseParcelizer = i103;
                iArr55[i104] = iArr55[6];
                return 0;
            case 81:
                int i105 = this.AudioAttributesImplBaseParcelizer;
                int i106 = i105 - 1;
                float[] fArr14 = this.MediaMetadataCompat;
                fArr14[10] = fArr14[i106];
                this.AudioAttributesImplBaseParcelizer = i105;
                fArr14[i106] = fArr14[8];
                return 0;
            case 82:
                float[] fArr15 = this.MediaMetadataCompat;
                int i107 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i107 + 1;
                fArr15[i107] = fArr15[10];
                return 0;
            case 83:
                int i108 = this.AudioAttributesImplBaseParcelizer;
                int i109 = i108 - 1;
                int[] iArr56 = this.MediaDescriptionCompat;
                iArr56[6] = iArr56[i109];
                this.AudioAttributesImplBaseParcelizer = i108;
                iArr56[i109] = iArr56[13];
                return 0;
            case 84:
                int i110 = this.AudioAttributesImplBaseParcelizer;
                int[] iArr57 = this.MediaDescriptionCompat;
                iArr57[i110 - 2] = iArr57[i110 - 2] + iArr57[i110 - 1];
                int i111 = i110 - 2;
                this.AudioAttributesImplBaseParcelizer = i111;
                iArr57[14] = iArr57[i111];
                return 0;
            case 85:
                float[] fArr16 = this.MediaMetadataCompat;
                int i112 = this.AudioAttributesImplBaseParcelizer;
                fArr16[i112] = fArr16[10];
                fArr16[i112 + 1] = fArr16[9];
                int i113 = i112 + 1;
                this.AudioAttributesImplBaseParcelizer = i113;
                fArr16[i112] = fArr16[i112] * fArr16[i113];
                return 0;
            case 86:
                int[] iArr58 = this.MediaDescriptionCompat;
                int i114 = this.AudioAttributesImplBaseParcelizer;
                iArr58[i114 - 1] = (int) this.MediaMetadataCompat[i114 - 1];
                this.AudioAttributesImplBaseParcelizer = i114 + 1;
                iArr58[i114] = iArr58[6];
                return 0;
            case 87:
                int i115 = this.AudioAttributesImplBaseParcelizer;
                int i116 = i115 - 1;
                int[] iArr59 = this.MediaDescriptionCompat;
                iArr59[8] = iArr59[i116];
                Object[] objArr16 = this.onCommand;
                objArr16[i116] = objArr16[17];
                this.AudioAttributesImplBaseParcelizer = i115 + 1;
                iArr59[i115] = 0;
                return 0;
            case 88:
                int i117 = this.AudioAttributesImplBaseParcelizer;
                int i118 = i117 - 1;
                this.AudioAttributesImplBaseParcelizer = i118;
                int[] iArr60 = this.MediaDescriptionCompat;
                Object[] objArr17 = this.onCommand;
                Object obj8 = objArr17[i117 - 2];
                objArr17[i117 - 2] = null;
                iArr60[i117 - 2] = ((int[]) obj8)[iArr60[i118]];
                iArr60[i118] = iArr60[i117 - 2];
                int i119 = i117 - 1;
                this.AudioAttributesImplBaseParcelizer = i119;
                iArr60[13] = iArr60[i119];
                return 0;
            case 89:
                int[] iArr61 = this.MediaDescriptionCompat;
                int i120 = this.AudioAttributesImplBaseParcelizer;
                iArr61[i120] = 1;
                this.AudioAttributesImplBaseParcelizer = i120;
                iArr61[i120 - 1] = iArr61[i120] & iArr61[i120 - 1];
                return 0;
            case 90:
                int i121 = this.AudioAttributesImplBaseParcelizer;
                int i122 = i121 - 2;
                this.AudioAttributesImplBaseParcelizer = i122;
                int[] iArr62 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer = iArr62[i122] != iArr62[i121 - 1] ? 0 : 1;
                return 0;
            case 91:
                int i123 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i123;
                int[] iArr63 = this.MediaDescriptionCompat;
                iArr63[6] = iArr63[i123];
                return 0;
            case 92:
                int[] iArr64 = this.MediaDescriptionCompat;
                int i124 = this.AudioAttributesImplBaseParcelizer;
                iArr64[i124] = 0;
                this.AudioAttributesImplBaseParcelizer = i124;
                iArr64[6] = iArr64[i124];
                return 0;
            case 93:
                int[] iArr65 = this.MediaDescriptionCompat;
                int i125 = this.AudioAttributesImplBaseParcelizer;
                iArr65[i125] = iArr65[13];
                iArr65[i125 + 1] = 2;
                int i126 = i125 + 1;
                this.AudioAttributesImplBaseParcelizer = i126;
                iArr65[i125] = iArr65[i125] & iArr65[i126];
                return 0;
            case 94:
                Object[] objArr18 = this.onCommand;
                int i127 = this.AudioAttributesImplBaseParcelizer;
                objArr18[i127] = objArr18[17];
                int[] iArr66 = this.MediaDescriptionCompat;
                iArr66[i127 + 1] = 1;
                int i128 = i127 + 1;
                this.AudioAttributesImplBaseParcelizer = i128;
                Object obj9 = objArr18[i127];
                objArr18[i127] = null;
                iArr66[i127] = ((int[]) obj9)[iArr66[i128]];
                return 0;
            case 95:
                int i129 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i129;
                int[] iArr67 = this.MediaDescriptionCompat;
                iArr67[11] = iArr67[i129];
                return 0;
            case 96:
                int[] iArr68 = this.MediaDescriptionCompat;
                int i130 = this.AudioAttributesImplBaseParcelizer;
                iArr68[i130] = 1;
                this.AudioAttributesImplBaseParcelizer = i130;
                iArr68[10] = iArr68[i130];
                return 0;
            case 97:
                int i131 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i131;
                int[] iArr69 = this.MediaDescriptionCompat;
                iArr69[10] = iArr69[i131];
                return 0;
            case 98:
                int[] iArr70 = this.MediaDescriptionCompat;
                int i132 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i132 + 1;
                iArr70[i132] = iArr70[11];
                return 0;
            case 99:
                int[] iArr71 = this.MediaDescriptionCompat;
                int i133 = this.AudioAttributesImplBaseParcelizer;
                iArr71[i133] = 2;
                iArr71[i133 - 1] = iArr71[i133 - 1] & iArr71[i133];
                this.AudioAttributesImplBaseParcelizer = i133 + 1;
                iArr71[i133] = 2;
                return 0;
            case 100:
                int[] iArr72 = this.MediaDescriptionCompat;
                int i134 = this.AudioAttributesImplBaseParcelizer;
                iArr72[i134] = 1;
                this.AudioAttributesImplBaseParcelizer = i134;
                iArr72[11] = iArr72[i134];
                return 0;
            case 101:
                int[] iArr73 = this.MediaDescriptionCompat;
                int i135 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i135 + 1;
                iArr73[i135] = iArr73[15];
                return 0;
            case 102:
                int[] iArr74 = this.MediaDescriptionCompat;
                int i136 = this.AudioAttributesImplBaseParcelizer;
                iArr74[i136] = iArr74[12];
                this.AudioAttributesImplBaseParcelizer = i136;
                iArr74[13] = iArr74[i136];
                return 0;
            case 103:
                int[] iArr75 = this.MediaDescriptionCompat;
                int i137 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i137 + 1;
                iArr75[i137] = iArr75[10];
                return 0;
            case 104:
                int[] iArr76 = this.MediaDescriptionCompat;
                int i138 = this.AudioAttributesImplBaseParcelizer;
                iArr76[i138] = iArr76[14];
                this.AudioAttributesImplBaseParcelizer = i138;
                iArr76[10] = iArr76[i138];
                return 0;
            case 105:
                int[] iArr77 = this.MediaDescriptionCompat;
                int i139 = this.AudioAttributesImplBaseParcelizer;
                iArr77[i139] = 0;
                this.AudioAttributesImplBaseParcelizer = i139;
                iArr77[10] = iArr77[i139];
                return 0;
            case 106:
                int[] iArr78 = this.MediaDescriptionCompat;
                int i140 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i140 + 1;
                iArr78[i140] = iArr78[8];
                return 0;
            case 107:
                int[] iArr79 = this.MediaDescriptionCompat;
                int i141 = this.AudioAttributesImplBaseParcelizer;
                iArr79[i141] = 0;
                this.AudioAttributesImplBaseParcelizer = i141;
                iArr79[11] = iArr79[i141];
                return 0;
            case 108:
                int i142 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i142;
                int[] iArr80 = this.MediaDescriptionCompat;
                iArr80[12] = iArr80[i142];
                return 0;
            case 109:
                int i143 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i143;
                int[] iArr81 = this.MediaDescriptionCompat;
                iArr81[14] = iArr81[i143];
                return 0;
            case 110:
                int i144 = this.AudioAttributesImplBaseParcelizer;
                int i145 = i144 - 2;
                this.AudioAttributesImplBaseParcelizer = i145;
                int[] iArr82 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer = iArr82[i145] == iArr82[i144 - 1] ? 0 : 1;
                return 0;
            case 111:
                int i146 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i146;
                int[] iArr83 = this.MediaDescriptionCompat;
                iArr83[8] = iArr83[i146];
                return 0;
            case 112:
                int[] iArr84 = this.MediaDescriptionCompat;
                int i147 = this.AudioAttributesImplBaseParcelizer;
                iArr84[i147] = 0;
                this.AudioAttributesImplBaseParcelizer = i147;
                iArr84[8] = iArr84[i147];
                return 0;
            case 113:
                int[] iArr85 = this.MediaDescriptionCompat;
                int i148 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i148 + 1;
                iArr85[i148] = iArr85[12];
                return 0;
            case 114:
                int i149 = this.AudioAttributesImplBaseParcelizer;
                int i150 = i149 - 1;
                float[] fArr17 = this.MediaMetadataCompat;
                fArr17[8] = fArr17[i150];
                int[] iArr86 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i149;
                iArr86[i150] = iArr86[14];
                return 0;
            case 115:
                int i151 = this.AudioAttributesImplBaseParcelizer;
                int i152 = i151 - 1;
                float[] fArr18 = this.MediaMetadataCompat;
                fArr18[9] = fArr18[i152];
                this.AudioAttributesImplBaseParcelizer = i151;
                fArr18[i152] = fArr18[8];
                return 0;
            case 116:
                float[] fArr19 = this.MediaMetadataCompat;
                int i153 = this.AudioAttributesImplBaseParcelizer;
                fArr19[i153] = fArr19[9];
                this.AudioAttributesImplBaseParcelizer = i153;
                fArr19[i153 - 1] = fArr19[i153 - 1] / fArr19[i153];
                return 0;
            case 117:
                int i154 = this.AudioAttributesImplBaseParcelizer;
                int i155 = i154 - 1;
                this.AudioAttributesImplBaseParcelizer = i155;
                float[] fArr20 = this.MediaMetadataCompat;
                this.MediaDescriptionCompat[i154 - 2] = (fArr20[i154 - 2] > fArr20[i155] ? 1 : (fArr20[i154 - 2] == fArr20[i155] ? 0 : -1));
                return 0;
            case 118:
                float[] fArr21 = this.MediaMetadataCompat;
                int i156 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i156 + 1;
                fArr21[i156] = fArr21[9];
                return 0;
            case 119:
                int i157 = this.AudioAttributesImplBaseParcelizer;
                int i158 = i157 - 1;
                this.AudioAttributesImplBaseParcelizer = i158;
                float[] fArr22 = this.MediaMetadataCompat;
                fArr22[i157 - 2] = fArr22[i157 - 2] * fArr22[i158];
                this.MediaDescriptionCompat[i157 - 2] = (int) fArr22[i157 - 2];
                return 0;
            case 120:
                int[] iArr87 = this.MediaDescriptionCompat;
                int i159 = this.AudioAttributesImplBaseParcelizer;
                iArr87[i159] = iArr87[12];
                this.AudioAttributesImplBaseParcelizer = i159;
                iArr87[i159 - 1] = iArr87[i159 - 1] - iArr87[i159];
                return 0;
            case 121:
                int i160 = this.AudioAttributesImplBaseParcelizer;
                int i161 = i160 - 1;
                int[] iArr88 = this.MediaDescriptionCompat;
                iArr88[6] = iArr88[i161];
                iArr88[i161] = iArr88[13];
                this.AudioAttributesImplBaseParcelizer = i160 + 1;
                iArr88[i160] = iArr88[8];
                return 0;
            case 122:
                Object[] objArr19 = this.onCommand;
                int i162 = this.AudioAttributesImplBaseParcelizer;
                objArr19[i162] = objArr19[i162 - 1];
                this.AudioAttributesImplBaseParcelizer = i162;
                Object obj10 = objArr19[i162];
                objArr19[i162] = null;
                objArr19[17] = obj10;
                return 0;
            case 123:
                Object[] objArr20 = this.onCommand;
                int i163 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i163 + 1;
                objArr20[i163] = objArr20[17];
                return 0;
            case 124:
                Object[] objArr21 = this.onCommand;
                int i164 = this.AudioAttributesImplBaseParcelizer;
                objArr21[i164] = objArr21[i164 - 1];
                Object obj11 = objArr21[i164];
                objArr21[i164] = null;
                objArr21[17] = obj11;
                int[] iArr89 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i164 + 1;
                iArr89[i164] = iArr89[6];
                return 0;
            case 125:
                int[] iArr90 = this.MediaDescriptionCompat;
                int i165 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i165 + 1;
                iArr90[i165] = iArr90[16];
                return 0;
            case 126:
                Object[] objArr22 = this.onCommand;
                int i166 = this.AudioAttributesImplBaseParcelizer;
                objArr22[i166] = objArr22[5];
                this.AudioAttributesImplBaseParcelizer = i166 + 2;
                objArr22[i166 + 1] = objArr22[i166];
                return 0;
            case 127:
                int i167 = this.AudioAttributesImplBaseParcelizer;
                int i168 = i167 - 1;
                int[] iArr91 = this.MediaDescriptionCompat;
                iArr91[i167 - 2] = iArr91[i167 - 2] + iArr91[i168];
                this.AudioAttributesImplBaseParcelizer = i167;
                iArr91[i168] = iArr91[6];
                return 0;
            case 128:
                int[] iArr92 = this.MediaDescriptionCompat;
                int i169 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr23 = this.onCommand;
                Object obj12 = objArr23[i169 - 1];
                objArr23[i169 - 1] = null;
                iArr92[i169 - 1] = ((float[]) obj12).length;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                Object[] objArr24 = this.onCommand;
                int i170 = this.AudioAttributesImplBaseParcelizer;
                int i171 = i170 + 1;
                this.AudioAttributesImplBaseParcelizer = i171;
                objArr24[i170] = objArr24[17];
                int[] iArr93 = this.MediaDescriptionCompat;
                Object obj13 = objArr24[i170];
                objArr24[i170] = null;
                iArr93[i170] = ((float[]) obj13).length;
                this.AudioAttributesImplBaseParcelizer = i170 + 2;
                iArr93[i171] = 1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int i172 = this.AudioAttributesImplBaseParcelizer;
                int i173 = i172 - 1;
                this.AudioAttributesImplBaseParcelizer = i173;
                int[] iArr94 = this.MediaDescriptionCompat;
                iArr94[i172 - 2] = iArr94[i172 - 2] - iArr94[i173];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr95 = this.MediaDescriptionCompat;
                int i174 = this.AudioAttributesImplBaseParcelizer;
                iArr95[i174] = 2;
                this.AudioAttributesImplBaseParcelizer = i174;
                iArr95[i174 - 1] = iArr95[i174 - 1] % iArr95[i174];
                int i175 = i174 - 1;
                this.AudioAttributesImplBaseParcelizer = i175;
                iArr95[6] = iArr95[i175];
                return 0;
            case 132:
                float[] fArr23 = this.MediaMetadataCompat;
                int i176 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i176 + 1;
                fArr23[i176] = fArr23[7];
                return 0;
            case 133:
                float[] fArr24 = this.MediaMetadataCompat;
                int i177 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i177 + 1;
                this.AudioAttributesImplApi26Parcelizer = fArr24[i177];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int i178 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i178;
                float[] fArr25 = this.MediaMetadataCompat;
                fArr25[7] = fArr25[i178];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr96 = this.MediaDescriptionCompat;
                int i179 = this.AudioAttributesImplBaseParcelizer;
                iArr96[i179] = iArr96[6];
                Object[] objArr25 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i179 + 2;
                objArr25[i179 + 1] = objArr25[5];
                return 0;
            case 136:
                int[] iArr97 = this.MediaDescriptionCompat;
                int i180 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr26 = this.onCommand;
                Object obj14 = objArr26[i180 - 1];
                objArr26[i180 - 1] = null;
                iArr97[i180 - 1] = ((int[]) obj14).length;
                return 0;
            case 137:
                int[] iArr98 = this.MediaDescriptionCompat;
                int i181 = this.AudioAttributesImplBaseParcelizer;
                iArr98[i181] = 1;
                this.AudioAttributesImplBaseParcelizer = i181;
                iArr98[i181 - 1] = iArr98[i181 - 1] - iArr98[i181];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                float[] fArr26 = this.MediaMetadataCompat;
                int i182 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i182 + 1;
                fArr26[i182] = 0.0f;
                return 0;
            case 139:
                double[] dArr = this.MediaBrowserCompatSearchResultReceiver;
                int i183 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i183 + 1;
                dArr[i183] = this.MediaBrowserCompatCustomActionResultReceiver;
                return 0;
            case 140:
                int i184 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i184;
                double[] dArr2 = this.MediaBrowserCompatSearchResultReceiver;
                dArr2[7] = dArr2[i184];
                return 0;
            case 141:
                float[] fArr27 = this.MediaMetadataCompat;
                int i185 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i185 + 1;
                fArr27[i185] = fArr27[7];
                this.MediaBrowserCompatSearchResultReceiver[i185] = fArr27[i185];
                return 0;
            case 142:
                int i186 = this.AudioAttributesImplBaseParcelizer;
                int i187 = i186 - 1;
                this.AudioAttributesImplBaseParcelizer = i187;
                double[] dArr3 = this.MediaBrowserCompatSearchResultReceiver;
                dArr3[i186 - 2] = dArr3[i186 - 2] * dArr3[i187];
                return 0;
            case 143:
                int i188 = this.AudioAttributesImplBaseParcelizer;
                int i189 = i188 - 1;
                double[] dArr4 = this.MediaBrowserCompatSearchResultReceiver;
                dArr4[7] = dArr4[i189];
                int[] iArr99 = this.MediaDescriptionCompat;
                iArr99[i189] = 5;
                int i190 = i188 - 1;
                this.AudioAttributesImplBaseParcelizer = i190;
                iArr99[13] = iArr99[i190];
                return 0;
            case 144:
                float[] fArr28 = this.MediaMetadataCompat;
                int i191 = this.AudioAttributesImplBaseParcelizer;
                fArr28[i191] = fArr28[7];
                this.AudioAttributesImplBaseParcelizer = i191 + 2;
                fArr28[i191 + 1] = 0.0f;
                return 0;
            case 145:
                this.MediaBrowserCompatSearchResultReceiver[this.AudioAttributesImplBaseParcelizer - 1] = this.MediaMetadataCompat[r2 - 1];
                return 0;
            case 146:
                int i192 = this.AudioAttributesImplBaseParcelizer;
                int i193 = i192 - 1;
                double[] dArr5 = this.MediaBrowserCompatSearchResultReceiver;
                dArr5[7] = dArr5[i193];
                int[] iArr100 = this.MediaDescriptionCompat;
                iArr100[i193] = 7;
                int i194 = i192 - 1;
                this.AudioAttributesImplBaseParcelizer = i194;
                iArr100[13] = iArr100[i194];
                return 0;
            case 147:
                this.MediaBrowserCompatSearchResultReceiver[this.AudioAttributesImplBaseParcelizer - 1] = this.MediaDescriptionCompat[r2 - 1];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                double[] dArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i195 = this.AudioAttributesImplBaseParcelizer;
                dArr6[i195] = dArr6[7];
                dArr6[i195 - 1] = dArr6[i195 - 1] + dArr6[i195];
                int i196 = i195 - 1;
                this.AudioAttributesImplBaseParcelizer = i196;
                dArr6[7] = dArr6[i196];
                return 0;
            case 149:
                Object[] objArr27 = this.onCommand;
                int i197 = this.AudioAttributesImplBaseParcelizer;
                objArr27[i197] = objArr27[5];
                int[] iArr101 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i197 + 2;
                iArr101[i197 + 1] = 0;
                return 0;
            case 150:
                double[] dArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i198 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i198 + 1;
                dArr7[i198] = dArr7[7];
                this.MediaDescriptionCompat[i198] = (int) dArr7[i198];
                return 0;
            case 151:
                float[] fArr29 = this.MediaMetadataCompat;
                int i199 = this.AudioAttributesImplBaseParcelizer;
                fArr29[i199 - 1] = this.MediaDescriptionCompat[i199 - 1];
                int i200 = i199 - 1;
                fArr29[7] = fArr29[i200];
                Object[] objArr28 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i199;
                objArr28[i200] = objArr28[5];
                return 0;
            case 152:
                int[] iArr102 = this.MediaDescriptionCompat;
                int i201 = this.AudioAttributesImplBaseParcelizer;
                iArr102[i201] = 1;
                float[] fArr30 = this.MediaMetadataCompat;
                this.AudioAttributesImplBaseParcelizer = i201 + 2;
                fArr30[i201 + 1] = fArr30[7];
                return 0;
            case 153:
                int i202 = this.AudioAttributesImplBaseParcelizer;
                int i203 = i202 - 1;
                this.AudioAttributesImplBaseParcelizer = i203;
                int[] iArr103 = this.MediaDescriptionCompat;
                Object[] objArr29 = this.onCommand;
                Object obj15 = objArr29[i202 - 2];
                objArr29[i202 - 2] = null;
                iArr103[i202 - 2] = ((int[]) obj15)[iArr103[i203]];
                return 0;
            case 154:
                int[] iArr104 = this.MediaDescriptionCompat;
                int i204 = this.AudioAttributesImplBaseParcelizer;
                iArr104[i204] = 2;
                this.AudioAttributesImplBaseParcelizer = i204 + 2;
                iArr104[i204 + 1] = 2;
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr105 = this.MediaDescriptionCompat;
                int i205 = this.AudioAttributesImplBaseParcelizer;
                iArr105[i205] = 43;
                this.AudioAttributesImplBaseParcelizer = i205;
                iArr105[i205 - 1] = iArr105[i205 - 1] + iArr105[i205];
                return 0;
            case 156:
                int[] iArr106 = this.MediaDescriptionCompat;
                int i206 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i206 + 1;
                iArr106[i206] = 117;
                return 0;
            case 157:
                int[] iArr107 = this.MediaDescriptionCompat;
                int i207 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i207 + 1;
                iArr107[i207] = 109;
                return 0;
            case 158:
                int[] iArr108 = this.MediaDescriptionCompat;
                int i208 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i208 + 1;
                iArr108[i208] = iArr108[14];
                return 0;
            case 159:
                int[] iArr109 = this.MediaDescriptionCompat;
                int i209 = this.AudioAttributesImplBaseParcelizer;
                iArr109[i209] = 7;
                this.AudioAttributesImplBaseParcelizer = i209;
                iArr109[i209 - 1] = iArr109[i209 - 1] + iArr109[i209];
                return 0;
            case 160:
                float[] fArr31 = this.MediaMetadataCompat;
                int i210 = this.AudioAttributesImplBaseParcelizer;
                fArr31[i210] = fArr31[7];
                fArr31[i210 + 1] = 0.0f;
                int i211 = i210 + 1;
                this.AudioAttributesImplBaseParcelizer = i211;
                this.MediaDescriptionCompat[i210] = (fArr31[i210] > fArr31[i211] ? 1 : (fArr31[i210] == fArr31[i211] ? 0 : -1));
                return 0;
            case 161:
                int[] iArr110 = this.MediaDescriptionCompat;
                int i212 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i212 + 1;
                iArr110[i212] = 95;
                return 0;
            case 162:
                int[] iArr111 = this.MediaDescriptionCompat;
                int i213 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i213 + 1;
                iArr111[i213] = 15;
                return 0;
            case 163:
                int[] iArr112 = this.MediaDescriptionCompat;
                int i214 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i214 + 1;
                iArr112[i214] = 46;
                return 0;
            case 164:
                int[] iArr113 = this.MediaDescriptionCompat;
                int i215 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i215 + 1;
                iArr113[i215] = 33;
                return 0;
            case 165:
                Object[] objArr30 = this.onCommand;
                int i216 = this.AudioAttributesImplBaseParcelizer;
                objArr30[i216] = objArr30[i216 - 1];
                this.AudioAttributesImplBaseParcelizer = i216;
                Object obj16 = objArr30[i216];
                objArr30[i216] = null;
                objArr30[6] = obj16;
                return 0;
            case 166:
                int i217 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i217;
                Object[] objArr31 = this.onCommand;
                Object obj17 = objArr31[i217];
                objArr31[i217] = null;
                this.RemoteActionCompatParcelizer = obj17 == null ? 0 : 1;
                return 0;
            case 167:
                Object[] objArr32 = this.onCommand;
                int i218 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i218 + 1;
                objArr32[i218] = objArr32[6];
                return 0;
            case 168:
                int i219 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i219;
                Object[] objArr33 = this.onCommand;
                Object obj18 = objArr33[i219];
                objArr33[i219] = null;
                objArr33[8] = obj18;
                return 0;
            case 169:
                int[] iArr114 = this.MediaDescriptionCompat;
                int i220 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr34 = this.onCommand;
                Object obj19 = objArr34[i220 - 1];
                objArr34[i220 - 1] = null;
                iArr114[i220 - 1] = ((Object[]) obj19).length;
                return 0;
            case 170:
                int i221 = this.AudioAttributesImplBaseParcelizer;
                int i222 = i221 - 2;
                this.AudioAttributesImplBaseParcelizer = i222;
                int[] iArr115 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer = iArr115[i222] <= iArr115[i221 - 1] ? 0 : 1;
                return 0;
            case 171:
                long[] jArr = this.RatingCompat;
                int i223 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i223 + 1;
                jArr[i223] = this.AudioAttributesCompatParcelizer;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                long[] jArr2 = this.RatingCompat;
                int i224 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i224 + 1;
                this.read = jArr2[i224];
                return 0;
            case 173:
                int i225 = this.AudioAttributesImplBaseParcelizer;
                int i226 = i225 - 3;
                this.AudioAttributesImplBaseParcelizer = i226;
                Object[] objArr35 = this.onCommand;
                Object obj20 = objArr35[i226];
                objArr35[i226] = null;
                int i227 = this.MediaDescriptionCompat[i225 - 2];
                Object obj21 = objArr35[i225 - 1];
                objArr35[i225 - 1] = null;
                ((Object[]) obj20)[i227] = obj21;
                return 0;
            case 174:
                Object[] objArr36 = this.onCommand;
                int i228 = this.AudioAttributesImplBaseParcelizer;
                objArr36[i228] = null;
                this.AudioAttributesImplBaseParcelizer = i228;
                Object obj22 = objArr36[i228];
                objArr36[i228] = null;
                objArr36[8] = obj22;
                return 0;
            case 175:
                Object[] objArr37 = this.onCommand;
                int i229 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i229 + 1;
                objArr37[i229] = objArr37[8];
                return 0;
            case 176:
                int i230 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i230;
                int[] iArr116 = this.MediaDescriptionCompat;
                iArr116[7] = iArr116[i230];
                return 0;
            case 177:
                int i231 = this.AudioAttributesImplBaseParcelizer;
                int i232 = i231 - 1;
                int[] iArr117 = this.MediaDescriptionCompat;
                iArr117[6] = iArr117[i232];
                iArr117[i232] = iArr117[7];
                Object[] objArr38 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i231 + 1;
                objArr38[i231] = objArr38[8];
                return 0;
            case 178:
                int i233 = this.AudioAttributesImplBaseParcelizer;
                int i234 = i233 - 2;
                this.AudioAttributesImplBaseParcelizer = i234;
                int[] iArr118 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer = iArr118[i234] < iArr118[i233 - 1] ? 0 : 1;
                return 0;
            case 179:
                Object[] objArr39 = this.onCommand;
                int i235 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i235 + 1;
                objArr39[i235] = objArr39[8];
                int[] iArr119 = this.MediaDescriptionCompat;
                Object obj23 = objArr39[i235];
                objArr39[i235] = null;
                iArr119[i235] = ((Object[]) obj23).length;
                return 0;
            case 180:
                int i236 = this.AudioAttributesImplBaseParcelizer;
                int i237 = i236 - 1;
                int[] iArr120 = this.MediaDescriptionCompat;
                iArr120[7] = iArr120[i237];
                Object[] objArr40 = this.onCommand;
                this.AudioAttributesImplBaseParcelizer = i236;
                objArr40[i237] = objArr40[5];
                return 0;
            case 181:
                int i238 = this.AudioAttributesImplBaseParcelizer;
                int i239 = i238 - 1;
                this.AudioAttributesImplBaseParcelizer = i239;
                Object[] objArr41 = this.onCommand;
                Object obj24 = objArr41[i238 - 2];
                objArr41[i238 - 2] = null;
                objArr41[i238 - 2] = ((Object[]) obj24)[this.MediaDescriptionCompat[i239]];
                return 0;
            case 182:
                int[] iArr121 = this.MediaDescriptionCompat;
                int i240 = this.AudioAttributesImplBaseParcelizer;
                iArr121[i240] = iArr121[6];
                this.AudioAttributesImplBaseParcelizer = i240 + 2;
                iArr121[i240 + 1] = 1;
                return 0;
            case 183:
                int i241 = this.AudioAttributesImplBaseParcelizer;
                int i242 = i241 - 1;
                int[] iArr122 = this.MediaDescriptionCompat;
                iArr122[i241 - 2] = iArr122[i241 - 2] + iArr122[i242];
                this.AudioAttributesImplBaseParcelizer = i241;
                iArr122[i242] = iArr122[7];
                return 0;
            case 184:
                int[] iArr123 = this.MediaDescriptionCompat;
                int i243 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i243 + 1;
                iArr123[i243] = 37;
                return 0;
            case 185:
                int[] iArr124 = this.MediaDescriptionCompat;
                int i244 = this.AudioAttributesImplBaseParcelizer;
                iArr124[i244] = iArr124[i244 - 1];
                this.AudioAttributesImplBaseParcelizer = i244;
                iArr124[7] = iArr124[i244];
                return 0;
            case 186:
                int i245 = this.AudioAttributesImplBaseParcelizer;
                int i246 = i245 - 1;
                int[] iArr125 = this.MediaDescriptionCompat;
                iArr125[6] = iArr125[i246];
                this.AudioAttributesImplBaseParcelizer = i245;
                iArr125[i246] = iArr125[7];
                return 0;
            case 187:
                int[] iArr126 = this.MediaDescriptionCompat;
                int i247 = this.AudioAttributesImplBaseParcelizer;
                iArr126[i247] = 74;
                this.AudioAttributesImplBaseParcelizer = i247 + 2;
                iArr126[i247 + 1] = 0;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr127 = this.MediaDescriptionCompat;
                int i248 = this.AudioAttributesImplBaseParcelizer;
                iArr127[i248] = 63;
                iArr127[i248 - 1] = iArr127[i248 - 1] + iArr127[i248];
                this.AudioAttributesImplBaseParcelizer = i248 + 1;
                iArr127[i248] = iArr127[i248 - 1];
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                Object[] objArr42 = this.onCommand;
                int i249 = this.AudioAttributesImplBaseParcelizer;
                objArr42[i249] = objArr42[6];
                this.AudioAttributesImplBaseParcelizer = i249 + 2;
                objArr42[i249 + 1] = objArr42[5];
                return 0;
            case 190:
                int[] iArr128 = this.MediaDescriptionCompat;
                int i250 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr43 = this.onCommand;
                Object obj25 = objArr43[i250 - 1];
                objArr43[i250 - 1] = null;
                iArr128[i250 - 1] = ((int[]) obj25).length;
                int i251 = i250 - 1;
                this.AudioAttributesImplBaseParcelizer = i251;
                objArr43[i251] = null;
                return 0;
            case 191:
                int[] iArr129 = this.MediaDescriptionCompat;
                int i252 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i252 + 1;
                iArr129[i252] = 38;
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int[] iArr130 = this.MediaDescriptionCompat;
                int i253 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i253 + 1;
                iArr130[i253] = 78;
                return 0;
            case 193:
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat[this.AudioAttributesImplBaseParcelizer - 1];
                return 0;
            case 194:
                int[] iArr131 = this.MediaDescriptionCompat;
                int i254 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i254 + 1;
                iArr131[i254] = 11;
                return 0;
            case 195:
                Object[] objArr44 = this.onCommand;
                int i255 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i255 + 1;
                objArr44[i255] = null;
                int[] iArr132 = this.MediaDescriptionCompat;
                Object obj26 = objArr44[i255];
                objArr44[i255] = null;
                iArr132[i255] = ((int[]) obj26).length;
                this.AudioAttributesImplBaseParcelizer = i255;
                objArr44[i255] = null;
                return 0;
            case 196:
                int[] iArr133 = this.MediaDescriptionCompat;
                int i256 = this.AudioAttributesImplBaseParcelizer;
                iArr133[i256] = 51;
                iArr133[i256 - 1] = iArr133[i256 - 1] + iArr133[i256];
                this.AudioAttributesImplBaseParcelizer = i256 + 1;
                iArr133[i256] = iArr133[i256 - 1];
                return 0;
            case 197:
                int i257 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i257;
                Object[] objArr45 = this.onCommand;
                Object obj27 = objArr45[i257];
                objArr45[i257] = null;
                objArr45[6] = obj27;
                return 0;
            case 198:
                int[] iArr134 = this.MediaDescriptionCompat;
                int i258 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i258 + 1;
                iArr134[i258] = 72;
                return 0;
            case 199:
                int[] iArr135 = this.MediaDescriptionCompat;
                int i259 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i259 + 1;
                iArr135[i259] = 30;
                return 0;
            case 200:
                int[] iArr136 = this.MediaDescriptionCompat;
                int i260 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i260 + 1;
                iArr136[i260] = 84;
                return 0;
            case 201:
                int[] iArr137 = this.MediaDescriptionCompat;
                int i261 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i261 + 1;
                iArr137[i261] = 98;
                return 0;
            case 202:
                int i262 = this.AudioAttributesImplBaseParcelizer;
                int i263 = i262 - 1;
                int[] iArr138 = this.MediaDescriptionCompat;
                iArr138[7] = iArr138[i263];
                iArr138[i263] = 0;
                int i264 = i262 - 1;
                this.AudioAttributesImplBaseParcelizer = i264;
                iArr138[6] = iArr138[i264];
                return 0;
            case 203:
                int i265 = this.AudioAttributesImplBaseParcelizer;
                int i266 = i265 - 2;
                this.AudioAttributesImplBaseParcelizer = i266;
                int[] iArr139 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer = iArr139[i266] >= iArr139[i265 - 1] ? 0 : 1;
                return 0;
            case 204:
                int[] iArr140 = this.MediaDescriptionCompat;
                int i267 = this.AudioAttributesImplBaseParcelizer;
                iArr140[i267] = iArr140[7];
                this.AudioAttributesImplBaseParcelizer = i267 + 2;
                iArr140[i267 + 1] = 10;
                return 0;
            case 205:
                int[] iArr141 = this.MediaDescriptionCompat;
                iArr141[7] = iArr141[7] + 1;
                return 0;
            case 206:
                int[] iArr142 = this.MediaDescriptionCompat;
                int i268 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i268 + 1;
                iArr142[i268] = 123;
                return 0;
            case 207:
                int[] iArr143 = this.MediaDescriptionCompat;
                int i269 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i269 + 1;
                iArr143[i269] = 103;
                return 0;
            case 208:
                int[] iArr144 = this.MediaDescriptionCompat;
                int i270 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i270 + 1;
                iArr144[i270] = 19;
                return 0;
            case 209:
                int i271 = this.AudioAttributesImplBaseParcelizer;
                int i272 = i271 - 1;
                this.AudioAttributesImplBaseParcelizer = i272;
                int[] iArr145 = this.MediaDescriptionCompat;
                iArr145[i271 - 2] = iArr145[i271 - 2] / iArr145[i272];
                return 0;
            case 210:
                Object[] objArr46 = this.onCommand;
                int i273 = this.AudioAttributesImplBaseParcelizer;
                objArr46[i273] = objArr46[5];
                int[] iArr146 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i273 + 2;
                iArr146[i273 + 1] = 8;
                return 0;
            case 211:
                int[] iArr147 = this.MediaDescriptionCompat;
                int i274 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i274 + 1;
                iArr147[i274] = 79;
                return 0;
            case 212:
                int[] iArr148 = this.MediaDescriptionCompat;
                int i275 = this.AudioAttributesImplBaseParcelizer;
                iArr148[i275] = 79;
                iArr148[i275 - 1] = iArr148[i275 - 1] + iArr148[i275];
                this.AudioAttributesImplBaseParcelizer = i275 + 1;
                iArr148[i275] = iArr148[i275 - 1];
                return 0;
            case 213:
                int[] iArr149 = this.MediaDescriptionCompat;
                int i276 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i276 + 1;
                iArr149[i276] = 1;
                return 0;
            case 214:
                int[] iArr150 = this.MediaDescriptionCompat;
                int i277 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i277 + 1;
                iArr150[i277] = 90;
                return 0;
            case 215:
                int[] iArr151 = this.MediaDescriptionCompat;
                int i278 = this.AudioAttributesImplBaseParcelizer;
                iArr151[i278] = 89;
                iArr151[i278 - 1] = iArr151[i278 - 1] + iArr151[i278];
                this.AudioAttributesImplBaseParcelizer = i278 + 1;
                iArr151[i278] = iArr151[i278 - 1];
                return 0;
            case 216:
                int[] iArr152 = this.MediaDescriptionCompat;
                int i279 = this.AudioAttributesImplBaseParcelizer;
                iArr152[i279] = 7;
                iArr152[i279 - 1] = iArr152[i279 - 1] + iArr152[i279];
                this.AudioAttributesImplBaseParcelizer = i279 + 1;
                iArr152[i279] = iArr152[i279 - 1];
                return 0;
            case 217:
                int[] iArr153 = this.MediaDescriptionCompat;
                int i280 = this.AudioAttributesImplBaseParcelizer;
                iArr153[i280] = 38;
                this.AudioAttributesImplBaseParcelizer = i280 + 2;
                iArr153[i280 + 1] = 0;
                return 0;
            case 218:
                int[] iArr154 = this.MediaDescriptionCompat;
                int i281 = this.AudioAttributesImplBaseParcelizer;
                iArr154[i281] = 23;
                iArr154[i281 - 1] = iArr154[i281 - 1] + iArr154[i281];
                this.AudioAttributesImplBaseParcelizer = i281 + 1;
                iArr154[i281] = iArr154[i281 - 1];
                return 0;
            case 219:
                int[] iArr155 = this.MediaDescriptionCompat;
                int i282 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i282 + 1;
                iArr155[i282] = 59;
                return 0;
            case 220:
                int i283 = this.AudioAttributesImplBaseParcelizer;
                int i284 = i283 - 1;
                Object[] objArr47 = this.onCommand;
                objArr47[i284] = null;
                this.AudioAttributesImplBaseParcelizer = i283;
                objArr47[i284] = objArr47[5];
                return 0;
            case 221:
                int i285 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i285;
                Object[] objArr48 = this.onCommand;
                Object obj28 = objArr48[i285];
                objArr48[i285] = null;
                objArr48[9] = obj28;
                return 0;
            case 222:
                long[] jArr3 = this.RatingCompat;
                int i286 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i286] = jArr3[i286 - 1];
                this.AudioAttributesImplBaseParcelizer = i286;
                jArr3[7] = jArr3[i286];
                return 0;
            case 223:
                int i287 = this.AudioAttributesImplBaseParcelizer;
                int i288 = i287 - 1;
                this.AudioAttributesImplBaseParcelizer = i288;
                long[] jArr4 = this.RatingCompat;
                this.MediaDescriptionCompat[i287 - 2] = (jArr4[i287 - 2] > jArr4[i288] ? 1 : (jArr4[i287 - 2] == jArr4[i288] ? 0 : -1));
                return 0;
            case 224:
                int[] iArr156 = this.MediaDescriptionCompat;
                int i289 = this.AudioAttributesImplBaseParcelizer;
                iArr156[i289] = 1000;
                this.AudioAttributesImplBaseParcelizer = i289;
                iArr156[6] = iArr156[i289];
                return 0;
            case 225:
                int[] iArr157 = this.MediaDescriptionCompat;
                int i290 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i290 + 1;
                iArr157[i290] = iArr157[6];
                this.RatingCompat[i290] = iArr157[i290];
                return 0;
            case 226:
                int i291 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i291;
                long[] jArr5 = this.RatingCompat;
                jArr5[7] = jArr5[i291];
                return 0;
            case 227:
                Object[] objArr49 = this.onCommand;
                int i292 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i292 + 1;
                objArr49[i292] = objArr49[9];
                return 0;
            case 228:
                long[] jArr6 = this.RatingCompat;
                int i293 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i293 + 1;
                jArr6[i293] = jArr6[7];
                return 0;
            case 229:
                int[] iArr158 = this.MediaDescriptionCompat;
                int i294 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i294 + 1;
                iArr158[i294] = 99;
                return 0;
            case 230:
                int[] iArr159 = this.MediaDescriptionCompat;
                int i295 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i295 + 1;
                iArr159[i295] = 47;
                return 0;
            case 231:
                int[] iArr160 = this.MediaDescriptionCompat;
                int i296 = this.AudioAttributesImplBaseParcelizer;
                iArr160[i296] = 13;
                iArr160[i296 - 1] = iArr160[i296 - 1] + iArr160[i296];
                this.AudioAttributesImplBaseParcelizer = i296 + 1;
                iArr160[i296] = iArr160[i296 - 1];
                return 0;
            case 232:
                int[] iArr161 = this.MediaDescriptionCompat;
                int i297 = this.AudioAttributesImplBaseParcelizer;
                iArr161[i297] = 63;
                iArr161[i297 + 1] = 0;
                int i298 = i297 + 1;
                this.AudioAttributesImplBaseParcelizer = i298;
                iArr161[i297] = iArr161[i297] / iArr161[i298];
                return 0;
            case 233:
                int[] iArr162 = this.MediaDescriptionCompat;
                int i299 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i299 + 1;
                iArr162[i299] = 92;
                return 0;
            case 234:
                int[] iArr163 = this.MediaDescriptionCompat;
                int i300 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i300 + 1;
                iArr163[i300] = 36;
                return 0;
            case 235:
                int[] iArr164 = this.MediaDescriptionCompat;
                int i301 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i301 + 1;
                iArr164[i301] = 41;
                return 0;
            case 236:
                int[] iArr165 = this.MediaDescriptionCompat;
                int i302 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i302 + 1;
                iArr165[i302] = 49;
                return 0;
            case 237:
                int[] iArr166 = this.MediaDescriptionCompat;
                int i303 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i303 + 1;
                iArr166[i303] = 70;
                return 0;
            case 238:
                int[] iArr167 = this.MediaDescriptionCompat;
                int i304 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i304 + 1;
                iArr167[i304] = 71;
                return 0;
            case 239:
                int[] iArr168 = this.MediaDescriptionCompat;
                int i305 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i305 + 1;
                iArr168[i305] = 87;
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int[] iArr169 = this.MediaDescriptionCompat;
                int i306 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i306 + 1;
                iArr169[i306] = 7;
                return 0;
            case 241:
                int[] iArr170 = this.MediaDescriptionCompat;
                int i307 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i307 + 1;
                iArr170[i307] = 125;
                return 0;
            case 242:
                int[] iArr171 = this.MediaDescriptionCompat;
                int i308 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i308 + 1;
                iArr171[i308] = 51;
                return 0;
            case 243:
                int[] iArr172 = this.MediaDescriptionCompat;
                int i309 = this.AudioAttributesImplBaseParcelizer;
                iArr172[i309] = 9;
                this.AudioAttributesImplBaseParcelizer = i309;
                iArr172[i309 - 1] = iArr172[i309 - 1] + iArr172[i309];
                return 0;
            case 244:
                int[] iArr173 = this.MediaDescriptionCompat;
                int i310 = this.AudioAttributesImplBaseParcelizer;
                iArr173[i310] = 27;
                this.AudioAttributesImplBaseParcelizer = i310;
                iArr173[i310 - 1] = iArr173[i310 - 1] + iArr173[i310];
                return 0;
            case 245:
                int[] iArr174 = this.MediaDescriptionCompat;
                int i311 = this.AudioAttributesImplBaseParcelizer;
                iArr174[i311] = 57;
                this.AudioAttributesImplBaseParcelizer = i311;
                iArr174[i311 - 1] = iArr174[i311 - 1] + iArr174[i311];
                return 0;
            case 246:
                int[] iArr175 = this.MediaDescriptionCompat;
                int i312 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i312 + 1;
                iArr175[i312] = 61;
                return 0;
            case 247:
                int[] iArr176 = this.MediaDescriptionCompat;
                int i313 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i313 + 1;
                iArr176[i313] = 57;
                return 0;
            case 248:
                int[] iArr177 = this.MediaDescriptionCompat;
                int i314 = this.AudioAttributesImplBaseParcelizer;
                iArr177[i314] = 105;
                this.AudioAttributesImplBaseParcelizer = i314;
                iArr177[i314 - 1] = iArr177[i314 - 1] + iArr177[i314];
                return 0;
            case 249:
                int[] iArr178 = this.MediaDescriptionCompat;
                int i315 = this.AudioAttributesImplBaseParcelizer;
                iArr178[i315] = 125;
                iArr178[i315 - 1] = iArr178[i315 - 1] + iArr178[i315];
                this.AudioAttributesImplBaseParcelizer = i315 + 1;
                iArr178[i315] = iArr178[i315 - 1];
                return 0;
            case 250:
                int[] iArr179 = this.MediaDescriptionCompat;
                int i316 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i316 + 1;
                iArr179[i316] = 27;
                return 0;
            case 251:
                int[] iArr180 = this.MediaDescriptionCompat;
                int i317 = this.AudioAttributesImplBaseParcelizer;
                iArr180[i317] = 109;
                iArr180[i317 - 1] = iArr180[i317 - 1] + iArr180[i317];
                this.AudioAttributesImplBaseParcelizer = i317 + 1;
                iArr180[i317] = iArr180[i317 - 1];
                return 0;
            case 252:
                int[] iArr181 = this.MediaDescriptionCompat;
                int i318 = this.AudioAttributesImplBaseParcelizer;
                iArr181[i318] = 117;
                this.AudioAttributesImplBaseParcelizer = i318;
                iArr181[i318 - 1] = iArr181[i318 - 1] + iArr181[i318];
                return 0;
            case 253:
                int[] iArr182 = this.MediaDescriptionCompat;
                int i319 = this.AudioAttributesImplBaseParcelizer;
                iArr182[i319] = 17;
                iArr182[i319 - 1] = iArr182[i319 - 1] + iArr182[i319];
                this.AudioAttributesImplBaseParcelizer = i319 + 1;
                iArr182[i319] = iArr182[i319 - 1];
                return 0;
            case 254:
                int[] iArr183 = this.MediaDescriptionCompat;
                int i320 = this.AudioAttributesImplBaseParcelizer;
                iArr183[i320] = 0;
                this.AudioAttributesImplBaseParcelizer = i320;
                iArr183[i320 - 1] = iArr183[i320 - 1] / iArr183[i320];
                return 0;
            case 255:
                int[] iArr184 = this.MediaDescriptionCompat;
                int i321 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i321 + 1;
                iArr184[i321] = 62;
                return 0;
            case 256:
                int[] iArr185 = this.MediaDescriptionCompat;
                int i322 = this.AudioAttributesImplBaseParcelizer;
                iArr185[i322] = 83;
                iArr185[i322 - 1] = iArr185[i322 - 1] + iArr185[i322];
                this.AudioAttributesImplBaseParcelizer = i322 + 1;
                iArr185[i322] = iArr185[i322 - 1];
                return 0;
            case 257:
                int[] iArr186 = this.MediaDescriptionCompat;
                int i323 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i323 + 1;
                iArr186[i323] = 83;
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                int[] iArr187 = this.MediaDescriptionCompat;
                int i324 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i324 + 1;
                iArr187[i324] = 43;
                return 0;
            case 259:
                int[] iArr188 = this.MediaDescriptionCompat;
                int i325 = this.AudioAttributesImplBaseParcelizer;
                iArr188[i325] = 65;
                this.AudioAttributesImplBaseParcelizer = i325;
                iArr188[i325 - 1] = iArr188[i325 - 1] + iArr188[i325];
                return 0;
            case 260:
                Object[] objArr50 = this.onCommand;
                int i326 = this.AudioAttributesImplBaseParcelizer;
                objArr50[i326] = objArr50[5];
                this.AudioAttributesImplBaseParcelizer = i326 + 2;
                objArr50[i326 + 1] = objArr50[6];
                return 0;
            case 261:
                int[] iArr189 = this.MediaDescriptionCompat;
                int i327 = this.AudioAttributesImplBaseParcelizer;
                iArr189[i327] = 71;
                iArr189[i327 - 1] = iArr189[i327 - 1] + iArr189[i327];
                this.AudioAttributesImplBaseParcelizer = i327 + 1;
                iArr189[i327] = iArr189[i327 - 1];
                return 0;
            case 262:
                int[] iArr190 = this.MediaDescriptionCompat;
                int i328 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i328 + 1;
                iArr190[i328] = 56;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                int[] iArr191 = this.MediaDescriptionCompat;
                int i329 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i329 + 1;
                iArr191[i329] = 28;
                return 0;
            case 264:
                Object[] objArr51 = this.onCommand;
                int i330 = this.AudioAttributesImplBaseParcelizer;
                objArr51[i330] = objArr51[5];
                int[] iArr192 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i330 + 2;
                iArr192[i330 + 1] = iArr192[6];
                return 0;
            case 265:
                int[] iArr193 = this.MediaDescriptionCompat;
                int i331 = this.AudioAttributesImplBaseParcelizer;
                iArr193[i331] = 103;
                this.AudioAttributesImplBaseParcelizer = i331;
                iArr193[i331 - 1] = iArr193[i331 - 1] + iArr193[i331];
                return 0;
            case 266:
                int[] iArr194 = this.MediaDescriptionCompat;
                int i332 = this.AudioAttributesImplBaseParcelizer;
                iArr194[i332] = 69;
                iArr194[i332 - 1] = iArr194[i332 - 1] + iArr194[i332];
                this.AudioAttributesImplBaseParcelizer = i332 + 1;
                iArr194[i332] = iArr194[i332 - 1];
                return 0;
            case 267:
                Object[] objArr52 = this.onCommand;
                int i333 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i333 + 1;
                objArr52[i333] = null;
                int[] iArr195 = this.MediaDescriptionCompat;
                Object obj29 = objArr52[i333];
                objArr52[i333] = null;
                iArr195[i333] = ((int[]) obj29).length;
                return 0;
            case 268:
                int[] iArr196 = this.MediaDescriptionCompat;
                int i334 = this.AudioAttributesImplBaseParcelizer;
                iArr196[i334] = 117;
                iArr196[i334 - 1] = iArr196[i334 - 1] + iArr196[i334];
                this.AudioAttributesImplBaseParcelizer = i334 + 1;
                iArr196[i334] = iArr196[i334 - 1];
                return 0;
            case 269:
                int[] iArr197 = this.MediaDescriptionCompat;
                int i335 = this.AudioAttributesImplBaseParcelizer;
                iArr197[i335] = 67;
                iArr197[i335 - 1] = iArr197[i335 - 1] + iArr197[i335];
                this.AudioAttributesImplBaseParcelizer = i335 + 1;
                iArr197[i335] = iArr197[i335 - 1];
                return 0;
            case 270:
                int[] iArr198 = this.MediaDescriptionCompat;
                int i336 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i336 + 1;
                iArr198[i336] = 22;
                return 0;
            case 271:
                int[] iArr199 = this.MediaDescriptionCompat;
                int i337 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i337 + 1;
                iArr199[i337] = 97;
                return 0;
            case 272:
                int[] iArr200 = this.MediaDescriptionCompat;
                int i338 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i338 + 1;
                iArr200[i338] = 55;
                return 0;
            case 273:
                int[] iArr201 = this.MediaDescriptionCompat;
                int i339 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i339 + 1;
                iArr201[i339] = 42;
                return 0;
            case 274:
                int[] iArr202 = this.MediaDescriptionCompat;
                int i340 = this.AudioAttributesImplBaseParcelizer;
                iArr202[i340] = 61;
                this.AudioAttributesImplBaseParcelizer = i340;
                iArr202[i340 - 1] = iArr202[i340 - 1] + iArr202[i340];
                return 0;
            case 275:
                int[] iArr203 = this.MediaDescriptionCompat;
                int i341 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i341 + 1;
                iArr203[i341] = 29;
                return 0;
            case 276:
                int[] iArr204 = this.MediaDescriptionCompat;
                int i342 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i342 + 1;
                iArr204[i342] = 3;
                return 0;
            case 277:
                int[] iArr205 = this.MediaDescriptionCompat;
                int i343 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i343 + 1;
                iArr205[i343] = 107;
                return 0;
            case 278:
                int[] iArr206 = this.MediaDescriptionCompat;
                int i344 = this.AudioAttributesImplBaseParcelizer;
                iArr206[i344] = 21;
                this.AudioAttributesImplBaseParcelizer = i344;
                iArr206[i344 - 1] = iArr206[i344 - 1] + iArr206[i344];
                return 0;
            case 279:
                int[] iArr207 = this.MediaDescriptionCompat;
                int i345 = this.AudioAttributesImplBaseParcelizer;
                iArr207[i345] = 107;
                this.AudioAttributesImplBaseParcelizer = i345;
                iArr207[i345 - 1] = iArr207[i345 - 1] + iArr207[i345];
                return 0;
            case 280:
                int[] iArr208 = this.MediaDescriptionCompat;
                int i346 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i346 + 1;
                iArr208[i346] = 23;
                return 0;
            case 281:
                int[] iArr209 = this.MediaDescriptionCompat;
                int i347 = this.AudioAttributesImplBaseParcelizer;
                iArr209[i347] = 0;
                this.AudioAttributesImplBaseParcelizer = i347;
                iArr209[i347 - 1] = iArr209[i347 - 1] / iArr209[i347];
                int i348 = i347 - 1;
                this.AudioAttributesImplBaseParcelizer = i348;
                this.onCommand[i348] = null;
                return 0;
            case 282:
                int[] iArr210 = this.MediaDescriptionCompat;
                int i349 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i349 + 1;
                iArr210[i349] = 89;
                return 0;
            case 283:
                Object[] objArr53 = this.onCommand;
                int i350 = this.AudioAttributesImplBaseParcelizer;
                objArr53[i350] = objArr53[5];
                long[] jArr7 = this.RatingCompat;
                this.AudioAttributesImplBaseParcelizer = i350 + 2;
                jArr7[i350 + 1] = jArr7[6];
                return 0;
            case 284:
                int[] iArr211 = this.MediaDescriptionCompat;
                int i351 = this.AudioAttributesImplBaseParcelizer;
                iArr211[i351] = 103;
                iArr211[i351 - 1] = iArr211[i351 - 1] + iArr211[i351];
                this.AudioAttributesImplBaseParcelizer = i351 + 1;
                iArr211[i351] = iArr211[i351 - 1];
                return 0;
            case 285:
                int[] iArr212 = this.MediaDescriptionCompat;
                int i352 = this.AudioAttributesImplBaseParcelizer;
                iArr212[i352] = 19;
                this.AudioAttributesImplBaseParcelizer = i352;
                iArr212[i352 - 1] = iArr212[i352 - 1] + iArr212[i352];
                return 0;
            case 286:
                int[] iArr213 = this.MediaDescriptionCompat;
                int i353 = this.AudioAttributesImplBaseParcelizer;
                iArr213[i353] = 111;
                iArr213[i353 - 1] = iArr213[i353 - 1] + iArr213[i353];
                this.AudioAttributesImplBaseParcelizer = i353 + 1;
                iArr213[i353] = iArr213[i353 - 1];
                return 0;
            case 287:
                int[] iArr214 = this.MediaDescriptionCompat;
                int i354 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i354 + 1;
                iArr214[i354] = 14;
                return 0;
            case 288:
                int[] iArr215 = this.MediaDescriptionCompat;
                int i355 = this.AudioAttributesImplBaseParcelizer;
                iArr215[i355] = 39;
                this.AudioAttributesImplBaseParcelizer = i355;
                iArr215[i355 - 1] = iArr215[i355 - 1] + iArr215[i355];
                return 0;
            case 289:
                int[] iArr216 = this.MediaDescriptionCompat;
                int i356 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i356 + 1;
                iArr216[i356] = 44;
                return 0;
            case 290:
                int[] iArr217 = this.MediaDescriptionCompat;
                int i357 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i357 + 1;
                iArr217[i357] = 121;
                return 0;
            case 291:
                int[] iArr218 = this.MediaDescriptionCompat;
                int i358 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i358 + 1;
                iArr218[i358] = 96;
                return 0;
            case 292:
                int[] iArr219 = this.MediaDescriptionCompat;
                int i359 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i359 + 1;
                iArr219[i359] = 88;
                return 0;
            case 293:
                int[] iArr220 = this.MediaDescriptionCompat;
                int i360 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i360 + 1;
                iArr220[i360] = 39;
                return 0;
            case 294:
                int[] iArr221 = this.MediaDescriptionCompat;
                int i361 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i361 + 1;
                iArr221[i361] = 86;
                return 0;
            case 295:
                int[] iArr222 = this.MediaDescriptionCompat;
                int i362 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i362 + 1;
                iArr222[i362] = 113;
                return 0;
            case 296:
                int[] iArr223 = this.MediaDescriptionCompat;
                int i363 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i363 + 1;
                iArr223[i363] = 50;
                return 0;
            case 297:
                int[] iArr224 = this.MediaDescriptionCompat;
                int i364 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i364 + 1;
                iArr224[i364] = 8;
                return 0;
            default:
                return i;
        }
    }

    public hideScrubber(Object obj) {
        this.MediaDescriptionCompat = new int[18];
        this.RatingCompat = new long[18];
        this.MediaMetadataCompat = new float[18];
        this.MediaBrowserCompatSearchResultReceiver = new double[18];
        Object[] objArr = new Object[18];
        this.onCommand = objArr;
        objArr[5] = obj;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public hideScrubber(Object obj, int i) {
        int[] iArr = new int[18];
        this.MediaDescriptionCompat = iArr;
        this.RatingCompat = new long[18];
        this.MediaMetadataCompat = new float[18];
        this.MediaBrowserCompatSearchResultReceiver = new double[18];
        Object[] objArr = new Object[18];
        this.onCommand = objArr;
        objArr[5] = obj;
        iArr[6] = i;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public hideScrubber(Object obj, Object obj2) {
        this.MediaDescriptionCompat = new int[18];
        this.RatingCompat = new long[18];
        this.MediaMetadataCompat = new float[18];
        this.MediaBrowserCompatSearchResultReceiver = new double[18];
        Object[] objArr = new Object[18];
        this.onCommand = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public hideScrubber(Object obj, long j) {
        this.MediaDescriptionCompat = new int[18];
        long[] jArr = new long[18];
        this.RatingCompat = jArr;
        this.MediaMetadataCompat = new float[18];
        this.MediaBrowserCompatSearchResultReceiver = new double[18];
        Object[] objArr = new Object[18];
        this.onCommand = objArr;
        objArr[5] = obj;
        jArr[6] = j;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
