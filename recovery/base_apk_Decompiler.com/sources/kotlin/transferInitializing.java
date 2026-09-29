package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.data.models.ResponseError;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes3.dex */
public class transferInitializing {
    private int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final int[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final double[] MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public int write;

    public transferInitializing(int i, Object obj) {
        int[] iArr = new int[47];
        this.AudioAttributesImplBaseParcelizer = iArr;
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        iArr[15] = i;
        objArr[16] = obj;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int i2 = this.AudioAttributesCompatParcelizer - this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i2;
                this.MediaBrowserCompatItemReceiver = i2;
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i3 + 1;
                this.write = iArr[i3];
                return 0;
            case 3:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i4 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i4 + 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.read = obj;
                return 0;
            case 4:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i5 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i5 + 1;
                objArr2[i5] = this.RemoteActionCompatParcelizer;
                return 0;
            case 5:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i6 = this.AudioAttributesCompatParcelizer;
                iArr2[i6] = iArr2[15];
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = i6 + 2;
                objArr3[i6 + 1] = objArr3[16];
                return 0;
            case 6:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i7 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i7 + 1;
                iArr3[i7] = 2;
                return 0;
            case 7:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.AudioAttributesCompatParcelizer;
                iArr4[i8] = 2;
                this.AudioAttributesCompatParcelizer = i8;
                iArr4[i8 - 1] = iArr4[i8 - 1] % iArr4[i8];
                return 0;
            case 8:
                int i9 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i9;
                this.MediaBrowserCompatMediaItem[i9] = null;
                return 0;
            case 9:
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                int i10 = this.AudioAttributesCompatParcelizer;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.read = obj2;
                return 0;
            case 11:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i11 + 1;
                iArr5[i11] = this.IconCompatParcelizer;
            case 10:
                return 0;
            case 12:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i12 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i12 + 1;
                iArr6[i12] = 121;
                return 0;
            case 13:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i13 = this.AudioAttributesCompatParcelizer;
                iArr7[i13 - 1] = -iArr7[i13 - 1];
                this.AudioAttributesCompatParcelizer = i13 + 1;
                iArr7[i13] = iArr7[i13 - 1];
                return 0;
            case 14:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i14 = this.AudioAttributesCompatParcelizer;
                iArr8[i14 - 1] = -iArr8[i14 - 1];
                iArr8[i14] = -1;
                this.AudioAttributesCompatParcelizer = i14;
                iArr8[i14 - 1] = iArr8[i14] ^ iArr8[i14 - 1];
                return 0;
            case 15:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i15 = this.AudioAttributesCompatParcelizer;
                int i16 = iArr9[i15 - 1];
                iArr9[i15 - 1] = iArr9[i15 - 2];
                iArr9[i15 - 2] = i16;
                this.MediaBrowserCompatMediaItem[i15 - 1] = null;
                int i17 = i15 - 2;
                this.AudioAttributesCompatParcelizer = i17;
                iArr9[i15 - 3] = iArr9[i15 - 3] - iArr9[i17];
                return 0;
            case 16:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i18 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i18 + 1;
                iArr10[i18] = 1;
                return 0;
            case 17:
                int i19 = this.AudioAttributesCompatParcelizer;
                int i20 = i19 - 1;
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                iArr11[i19 - 2] = iArr11[i19 - 2] - iArr11[i20];
                this.AudioAttributesCompatParcelizer = i19;
                iArr11[i20] = iArr11[i19 - 2];
                return 0;
            case 18:
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.AudioAttributesCompatParcelizer;
                iArr12[i21] = 128;
                this.AudioAttributesCompatParcelizer = i21;
                iArr12[i21 - 1] = iArr12[i21 - 1] % iArr12[i21];
                return 0;
            case 19:
                int i22 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i22;
                this.write = this.AudioAttributesImplBaseParcelizer[i22] != 0 ? 0 : 1;
                return 0;
            case 20:
                int i23 = this.AudioAttributesCompatParcelizer;
                int i24 = i23 - 1;
                this.AudioAttributesCompatParcelizer = i24;
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                iArr13[i23 - 2] = iArr13[i23 - 2] % iArr13[i24];
                return 0;
            case 21:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i25 + 1;
                iArr14[i25] = iArr14[15];
                return 0;
            case 22:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i26 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i26 + 1;
                objArr5[i26] = objArr5[16];
                return 0;
            case 23:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i27 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i27 + 1;
                objArr6[i27] = null;
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr6[i27];
                objArr6[i27] = null;
                iArr15[i27] = ((int[]) obj3).length;
                return 0;
            case 24:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i28;
                this.write = iArr16[i28];
                return 0;
            case 25:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i29 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i29 + 1;
                iArr17[i29] = 70;
                return 0;
            case 26:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i30 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i30 + 1;
                iArr18[i30] = 82;
                return 0;
            case 27:
                for (int i31 = this.AudioAttributesCompatParcelizer - 1; i31 >= 0; i31--) {
                    this.MediaBrowserCompatMediaItem[i31] = null;
                }
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = 1;
                objArr7[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 28:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i32 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i32 + 1;
                objArr8[i32] = objArr8[15];
                return 0;
            case 29:
                int i33 = this.AudioAttributesCompatParcelizer;
                int i34 = i33 - 1;
                this.AudioAttributesCompatParcelizer = i34;
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                iArr19[i33 - 2] = iArr19[i33 - 2] % iArr19[i34];
                int i35 = i33 - 2;
                this.AudioAttributesCompatParcelizer = i35;
                this.MediaBrowserCompatMediaItem[i35] = null;
                return 0;
            case 30:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i36 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i36 + 1;
                iArr20[i36] = 53;
                return 0;
            case 31:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i37 = this.AudioAttributesCompatParcelizer;
                iArr21[i37 - 1] = -iArr21[i37 - 1];
                this.AudioAttributesCompatParcelizer = i37 + 2;
                iArr21[i37 + 1] = iArr21[i37 - 1];
                iArr21[i37] = iArr21[i37 - 2];
                return 0;
            case 32:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.AudioAttributesCompatParcelizer;
                iArr22[i38 - 1] = -iArr22[i38 - 1];
                return 0;
            case 33:
                int i39 = this.AudioAttributesCompatParcelizer;
                int i40 = i39 - 1;
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                iArr23[i39 - 2] = iArr23[i39 - 2] ^ iArr23[i40];
                int i41 = iArr23[i39 - 2];
                iArr23[i40] = i41;
                iArr23[i39 - 2] = iArr23[i39 - 3];
                iArr23[i39 - 3] = iArr23[i39 - 4];
                iArr23[i39 - 4] = i41;
                int i42 = i39 - 1;
                this.AudioAttributesCompatParcelizer = i42;
                this.MediaBrowserCompatMediaItem[i42] = null;
                return 0;
            case 34:
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                int i43 = this.AudioAttributesCompatParcelizer;
                iArr24[i43 - 1] = -iArr24[i43 - 1];
                iArr24[i43 + 1] = iArr24[i43 - 1];
                iArr24[i43] = iArr24[i43 - 2];
                this.AudioAttributesCompatParcelizer = i43 + 3;
                iArr24[i43 + 2] = -1;
                return 0;
            case 35:
                int i44 = this.AudioAttributesCompatParcelizer;
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                iArr25[i44 - 2] = iArr25[i44 - 1] ^ iArr25[i44 - 2];
                iArr25[i44 - 3] = iArr25[i44 - 2] ^ iArr25[i44 - 3];
                int i45 = i44 - 3;
                this.AudioAttributesCompatParcelizer = i45;
                this.MediaBrowserCompatMediaItem[i45] = null;
                return 0;
            case 36:
                int i46 = this.AudioAttributesCompatParcelizer;
                int i47 = i46 - 1;
                this.AudioAttributesCompatParcelizer = i47;
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                iArr26[i46 - 2] = iArr26[i46 - 2] & iArr26[i47];
                return 0;
            case 37:
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                int i48 = this.AudioAttributesCompatParcelizer;
                iArr27[i48] = 1;
                this.AudioAttributesCompatParcelizer = i48;
                iArr27[i48 - 1] = iArr27[i48 - 1] << iArr27[i48];
                return 0;
            case 38:
                int i49 = this.AudioAttributesCompatParcelizer;
                int i50 = i49 - 1;
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                iArr28[i49 - 2] = iArr28[i49 - 2] + iArr28[i50];
                iArr28[i50] = iArr28[i49 - 2];
                this.AudioAttributesCompatParcelizer = i49 + 1;
                iArr28[i49] = 128;
                return 0;
            case 39:
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                int i51 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i51 + 1;
                iArr29[i51] = 45;
                return 0;
            case 40:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i52 = this.AudioAttributesCompatParcelizer;
                iArr30[i52 - 1] = -iArr30[i52 - 1];
                int i53 = i52 - 1;
                iArr30[i52 - 2] = iArr30[i52 - 2] ^ iArr30[i53];
                this.AudioAttributesCompatParcelizer = i52;
                int i54 = iArr30[i52 - 2];
                iArr30[i53] = i54;
                iArr30[i52 - 2] = iArr30[i52 - 3];
                iArr30[i52 - 3] = iArr30[i52 - 4];
                iArr30[i52 - 4] = i54;
                return 0;
            case 41:
                int i55 = this.AudioAttributesCompatParcelizer;
                int i56 = i55 - 1;
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                iArr31[i55 - 2] = iArr31[i55 - 2] & iArr31[i56];
                iArr31[i56] = 1;
                int i57 = i55 - 1;
                this.AudioAttributesCompatParcelizer = i57;
                iArr31[i55 - 2] = iArr31[i55 - 2] << iArr31[i57];
                return 0;
            case 42:
                int i58 = this.AudioAttributesCompatParcelizer;
                int i59 = i58 - 1;
                this.AudioAttributesCompatParcelizer = i59;
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                iArr32[i58 - 2] = iArr32[i58 - 2] + iArr32[i59];
                return 0;
            case 43:
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                int i60 = this.AudioAttributesCompatParcelizer;
                iArr33[i60] = iArr33[i60 - 1];
                this.AudioAttributesCompatParcelizer = i60 + 2;
                iArr33[i60 + 1] = 128;
                return 0;
            case 44:
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                int i61 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i61 + 1;
                iArr34[i61] = 13;
                return 0;
            case 45:
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                int i62 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i62 + 1;
                iArr35[i62] = 0;
                return 0;
            case 46:
                int i63 = this.AudioAttributesCompatParcelizer;
                int i64 = i63 - 1;
                this.AudioAttributesCompatParcelizer = i64;
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                iArr36[i63 - 2] = iArr36[i63 - 2] / iArr36[i64];
                int i65 = i63 - 2;
                this.AudioAttributesCompatParcelizer = i65;
                this.MediaBrowserCompatMediaItem[i65] = null;
                return 0;
            case 47:
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                int i66 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i66 + 1;
                iArr37[i66] = 0;
                return 0;
            case 48:
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                int i67 = this.AudioAttributesCompatParcelizer;
                iArr38[i67] = 2;
                this.AudioAttributesCompatParcelizer = i67;
                iArr38[i67 - 1] = iArr38[i67 - 1] % iArr38[i67];
                int i68 = i67 - 1;
                this.AudioAttributesCompatParcelizer = i68;
                this.MediaBrowserCompatMediaItem[i68] = null;
                return 0;
            case 49:
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                int i69 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i69 + 1;
                iArr39[i69] = 125;
                return 0;
            case 50:
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                int i70 = this.AudioAttributesCompatParcelizer;
                iArr40[i70 + 1] = iArr40[i70 - 1];
                iArr40[i70] = iArr40[i70 - 2];
                this.AudioAttributesCompatParcelizer = i70 + 4;
                iArr40[i70 + 3] = iArr40[i70 + 1];
                iArr40[i70 + 2] = iArr40[i70];
                return 0;
            case 51:
                int i71 = this.AudioAttributesCompatParcelizer;
                int i72 = i71 - 1;
                this.AudioAttributesCompatParcelizer = i72;
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                iArr41[i71 - 2] = iArr41[i71 - 2] ^ iArr41[i72];
                return 0;
            case 52:
                int[] iArr42 = this.AudioAttributesImplBaseParcelizer;
                int i73 = this.AudioAttributesCompatParcelizer;
                int i74 = iArr42[i73 - 1];
                iArr42[i73] = i74;
                iArr42[i73 - 1] = iArr42[i73 - 2];
                iArr42[i73 - 2] = iArr42[i73 - 3];
                iArr42[i73 - 3] = i74;
                this.MediaBrowserCompatMediaItem[i73] = null;
                int i75 = i73 - 1;
                this.AudioAttributesCompatParcelizer = i75;
                iArr42[i73 - 2] = iArr42[i73 - 2] & iArr42[i75];
                return 0;
            case 53:
                int i76 = this.AudioAttributesCompatParcelizer;
                int i77 = i76 - 1;
                int[] iArr43 = this.AudioAttributesImplBaseParcelizer;
                iArr43[i76 - 2] = iArr43[i76 - 2] | iArr43[i77];
                this.AudioAttributesCompatParcelizer = i76;
                iArr43[i77] = 1;
                return 0;
            case 54:
                int i78 = this.AudioAttributesCompatParcelizer;
                int i79 = i78 - 1;
                this.AudioAttributesCompatParcelizer = i79;
                int[] iArr44 = this.AudioAttributesImplBaseParcelizer;
                iArr44[i78 - 2] = iArr44[i78 - 2] << iArr44[i79];
                return 0;
            case 55:
                int[] iArr45 = this.AudioAttributesImplBaseParcelizer;
                int i80 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i80 + 1;
                int i81 = iArr45[i80 - 1];
                iArr45[i80] = i81;
                iArr45[i80 - 1] = iArr45[i80 - 2];
                iArr45[i80 - 2] = iArr45[i80 - 3];
                iArr45[i80 - 3] = i81;
                return 0;
            case 56:
                int i82 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i82 - 1] = null;
                int i83 = i82 - 2;
                this.AudioAttributesCompatParcelizer = i83;
                int[] iArr46 = this.AudioAttributesImplBaseParcelizer;
                iArr46[i82 - 3] = iArr46[i82 - 3] ^ iArr46[i83];
                return 0;
            case 57:
                int[] iArr47 = this.AudioAttributesImplBaseParcelizer;
                int i84 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i84 + 1;
                iArr47[i84] = iArr47[i84 - 1];
                return 0;
            case 58:
                int[] iArr48 = this.AudioAttributesImplBaseParcelizer;
                int i85 = this.AudioAttributesCompatParcelizer;
                iArr48[i85 - 1] = -iArr48[i85 - 1];
                this.AudioAttributesCompatParcelizer = i85 + 1;
                iArr48[i85] = -1;
                return 0;
            case 59:
                int i86 = this.AudioAttributesCompatParcelizer;
                int[] iArr49 = this.AudioAttributesImplBaseParcelizer;
                iArr49[i86 - 2] = iArr49[i86 - 1] ^ iArr49[i86 - 2];
                int i87 = iArr49[i86 - 2];
                iArr49[i86 - 2] = iArr49[i86 - 3];
                iArr49[i86 - 3] = i87;
                int i88 = i86 - 2;
                this.AudioAttributesCompatParcelizer = i88;
                this.MediaBrowserCompatMediaItem[i88] = null;
                return 0;
            case 60:
                int i89 = this.AudioAttributesCompatParcelizer;
                int i90 = i89 - 1;
                this.AudioAttributesCompatParcelizer = i90;
                int[] iArr50 = this.AudioAttributesImplBaseParcelizer;
                iArr50[i89 - 2] = iArr50[i89 - 2] - iArr50[i90];
                return 0;
            case 61:
                int i91 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i91;
                this.write = this.AudioAttributesImplBaseParcelizer[i91] == 0 ? 0 : 1;
                return 0;
            case 62:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i92 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i92 + 1;
                objArr9[i92] = null;
                return 0;
            case 63:
                int[] iArr51 = this.AudioAttributesImplBaseParcelizer;
                int i93 = this.AudioAttributesCompatParcelizer;
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                Object obj4 = objArr10[i93 - 1];
                objArr10[i93 - 1] = null;
                iArr51[i93 - 1] = ((int[]) obj4).length;
                int i94 = i93 - 1;
                this.AudioAttributesCompatParcelizer = i94;
                objArr10[i94] = null;
                return 0;
            case 64:
                int[] iArr52 = this.AudioAttributesImplBaseParcelizer;
                int i95 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i95 + 1;
                iArr52[i95] = 79;
                return 0;
            case 65:
                int[] iArr53 = this.AudioAttributesImplBaseParcelizer;
                int i96 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i96 + 1;
                iArr53[i96] = 99;
                return 0;
            case 66:
                int[] iArr54 = this.AudioAttributesImplBaseParcelizer;
                int i97 = this.AudioAttributesCompatParcelizer;
                iArr54[i97] = 117;
                iArr54[i97] = -iArr54[i97];
                this.AudioAttributesCompatParcelizer = i97 + 3;
                iArr54[i97 + 2] = iArr54[i97];
                iArr54[i97 + 1] = iArr54[i97 - 1];
                return 0;
            case 67:
                int i98 = this.AudioAttributesCompatParcelizer;
                int[] iArr55 = this.AudioAttributesImplBaseParcelizer;
                iArr55[i98 - 2] = iArr55[i98 - 1] ^ iArr55[i98 - 2];
                int i99 = i98 - 2;
                this.AudioAttributesCompatParcelizer = i99;
                iArr55[i98 - 3] = iArr55[i98 - 3] ^ iArr55[i99];
                return 0;
            case 68:
                int i100 = this.AudioAttributesCompatParcelizer;
                int i101 = i100 - 1;
                int[] iArr56 = this.AudioAttributesImplBaseParcelizer;
                iArr56[i100 - 2] = iArr56[i100 - 2] & iArr56[i101];
                int i102 = iArr56[i100 - 2];
                iArr56[i101] = i102;
                iArr56[i100 - 2] = iArr56[i100 - 3];
                iArr56[i100 - 3] = iArr56[i100 - 4];
                iArr56[i100 - 4] = i102;
                int i103 = i100 - 1;
                this.AudioAttributesCompatParcelizer = i103;
                this.MediaBrowserCompatMediaItem[i103] = null;
                return 0;
            case 69:
                int[] iArr57 = this.AudioAttributesImplBaseParcelizer;
                int i104 = this.AudioAttributesCompatParcelizer;
                iArr57[i104 + 1] = iArr57[i104 - 1];
                iArr57[i104] = iArr57[i104 - 2];
                int i105 = i104 + 1;
                iArr57[i104] = iArr57[i104] ^ iArr57[i105];
                this.AudioAttributesCompatParcelizer = i104 + 2;
                int i106 = iArr57[i104];
                iArr57[i105] = i106;
                iArr57[i104] = iArr57[i104 - 1];
                iArr57[i104 - 1] = iArr57[i104 - 2];
                iArr57[i104 - 2] = i106;
                return 0;
            case 70:
                int i107 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i107 - 1] = null;
                int i108 = i107 - 2;
                this.AudioAttributesCompatParcelizer = i108;
                int[] iArr58 = this.AudioAttributesImplBaseParcelizer;
                iArr58[i107 - 3] = iArr58[i107 - 3] & iArr58[i108];
                return 0;
            case 71:
                int i109 = this.AudioAttributesCompatParcelizer;
                int i110 = i109 - 1;
                this.AudioAttributesCompatParcelizer = i110;
                int[] iArr59 = this.AudioAttributesImplBaseParcelizer;
                iArr59[i109 - 2] = iArr59[i109 - 2] | iArr59[i110];
                return 0;
            case 72:
                int[] iArr60 = this.AudioAttributesImplBaseParcelizer;
                int i111 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i111 + 1;
                iArr60[i111] = -1;
                return 0;
            case 73:
                int[] iArr61 = this.AudioAttributesImplBaseParcelizer;
                int i112 = this.AudioAttributesCompatParcelizer;
                int i113 = iArr61[i112 - 1];
                iArr61[i112 - 1] = iArr61[i112 - 2];
                iArr61[i112 - 2] = i113;
                int i114 = i112 - 1;
                this.AudioAttributesCompatParcelizer = i114;
                this.MediaBrowserCompatMediaItem[i114] = null;
                return 0;
            case 74:
                int i115 = this.AudioAttributesCompatParcelizer;
                int i116 = i115 - 1;
                int[] iArr62 = this.AudioAttributesImplBaseParcelizer;
                iArr62[i115 - 2] = iArr62[i115 - 2] - iArr62[i116];
                this.AudioAttributesCompatParcelizer = i115;
                iArr62[i116] = 1;
                return 0;
            case 75:
                int[] iArr63 = this.AudioAttributesImplBaseParcelizer;
                int i117 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i117 + 1;
                iArr63[i117] = 89;
                return 0;
            case 76:
                int[] iArr64 = this.AudioAttributesImplBaseParcelizer;
                int i118 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i118 + 2;
                iArr64[i118 + 1] = iArr64[i118 - 1];
                iArr64[i118] = iArr64[i118 - 2];
                return 0;
            case 77:
                int i119 = this.AudioAttributesCompatParcelizer;
                int i120 = i119 - 1;
                int[] iArr65 = this.AudioAttributesImplBaseParcelizer;
                iArr65[i119 - 2] = iArr65[i119 - 2] + iArr65[i120];
                this.AudioAttributesCompatParcelizer = i119;
                iArr65[i120] = iArr65[i119 - 2];
                return 0;
            case 78:
                int[] iArr66 = this.AudioAttributesImplBaseParcelizer;
                int i121 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i121 + 1;
                iArr66[i121] = 128;
                return 0;
            case 79:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i122 = this.AudioAttributesCompatParcelizer;
                objArr11[i122] = objArr11[17];
                this.AudioAttributesCompatParcelizer = i122 + 2;
                objArr11[i122 + 1] = objArr11[18];
                return 0;
            case 80:
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                int i123 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i123 + 1;
                objArr12[i123] = objArr12[19];
                return 0;
            case 81:
                int[] iArr67 = this.AudioAttributesImplBaseParcelizer;
                int i124 = this.AudioAttributesCompatParcelizer;
                iArr67[i124] = 91;
                iArr67[i124 + 1] = iArr67[i124];
                this.AudioAttributesCompatParcelizer = i124 + 3;
                iArr67[i124 + 2] = -1;
                return 0;
            case 82:
                int[] iArr68 = this.AudioAttributesImplBaseParcelizer;
                int i125 = this.AudioAttributesCompatParcelizer;
                iArr68[i125 + 1] = iArr68[i125 - 1];
                iArr68[i125] = iArr68[i125 - 2];
                int i126 = i125 + 1;
                iArr68[i125] = iArr68[i125] & iArr68[i126];
                this.AudioAttributesCompatParcelizer = i125 + 2;
                iArr68[i126] = -1;
                return 0;
            case 83:
                int[] iArr69 = this.AudioAttributesImplBaseParcelizer;
                int i127 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i127 + 2;
                iArr69[i127 + 1] = iArr69[i127 - 1];
                iArr69[i127] = iArr69[i127 - 2];
                iArr69[i127 + 1] = -iArr69[i127 + 1];
                return 0;
            case 84:
                int i128 = this.AudioAttributesCompatParcelizer;
                int i129 = i128 - 1;
                int[] iArr70 = this.AudioAttributesImplBaseParcelizer;
                iArr70[i128 - 2] = iArr70[i128 - 2] << iArr70[i129];
                int i130 = iArr70[i128 - 2];
                iArr70[i129] = i130;
                iArr70[i128 - 2] = iArr70[i128 - 3];
                iArr70[i128 - 3] = iArr70[i128 - 4];
                iArr70[i128 - 4] = i130;
                int i131 = i128 - 1;
                this.AudioAttributesCompatParcelizer = i131;
                this.MediaBrowserCompatMediaItem[i131] = null;
                return 0;
            case 85:
                int[] iArr71 = this.AudioAttributesImplBaseParcelizer;
                int i132 = this.AudioAttributesCompatParcelizer;
                iArr71[i132 - 1] = -iArr71[i132 - 1];
                iArr71[i132 - 2] = iArr71[i132 - 1] ^ iArr71[i132 - 2];
                int i133 = i132 - 2;
                this.AudioAttributesCompatParcelizer = i133;
                iArr71[i132 - 3] = iArr71[i132 - 3] - iArr71[i133];
                return 0;
            case 86:
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                int i134 = this.AudioAttributesCompatParcelizer;
                objArr13[i134] = objArr13[17];
                objArr13[i134 + 1] = objArr13[18];
                this.AudioAttributesCompatParcelizer = i134 + 3;
                objArr13[i134 + 2] = objArr13[19];
                return 0;
            case 87:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i135 = this.AudioAttributesCompatParcelizer;
                objArr14[i135] = objArr14[15];
                this.AudioAttributesCompatParcelizer = i135 + 2;
                objArr14[i135 + 1] = objArr14[16];
                return 0;
            case 88:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i136 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i136 + 1;
                objArr15[i136] = objArr15[17];
                return 0;
            case 89:
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                int i137 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i137 + 1;
                objArr16[i137] = objArr16[18];
                return 0;
            case 90:
                int[] iArr72 = this.AudioAttributesImplBaseParcelizer;
                int i138 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i138 + 1;
                iArr72[i138] = 27;
                return 0;
            case 91:
                int[] iArr73 = this.AudioAttributesImplBaseParcelizer;
                int i139 = this.AudioAttributesCompatParcelizer;
                iArr73[i139] = iArr73[i139 - 1];
                iArr73[i139] = -iArr73[i139];
                this.AudioAttributesCompatParcelizer = i139 + 2;
                iArr73[i139 + 1] = -1;
                return 0;
            case 92:
                int[] iArr74 = this.AudioAttributesImplBaseParcelizer;
                int i140 = this.AudioAttributesCompatParcelizer;
                iArr74[i140 + 1] = iArr74[i140 - 1];
                iArr74[i140] = iArr74[i140 - 2];
                int i141 = i140 + 1;
                this.AudioAttributesCompatParcelizer = i141;
                iArr74[i140] = iArr74[i140] & iArr74[i141];
                return 0;
            case 93:
                int[] iArr75 = this.AudioAttributesImplBaseParcelizer;
                int i142 = this.AudioAttributesCompatParcelizer;
                iArr75[i142] = -1;
                iArr75[i142 - 1] = iArr75[i142 - 1] ^ iArr75[i142];
                this.AudioAttributesCompatParcelizer = i142 + 1;
                int i143 = iArr75[i142 - 1];
                iArr75[i142] = i143;
                iArr75[i142 - 1] = iArr75[i142 - 2];
                iArr75[i142 - 2] = iArr75[i142 - 3];
                iArr75[i142 - 3] = i143;
                return 0;
            case 94:
                int i144 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i144 - 1] = null;
                int i145 = i144 - 2;
                this.AudioAttributesCompatParcelizer = i145;
                int[] iArr76 = this.AudioAttributesImplBaseParcelizer;
                iArr76[i144 - 3] = iArr76[i144 - 3] | iArr76[i145];
                return 0;
            case 95:
                int[] iArr77 = this.AudioAttributesImplBaseParcelizer;
                int i146 = this.AudioAttributesCompatParcelizer;
                int i147 = iArr77[i146 - 1];
                iArr77[i146 - 1] = iArr77[i146 - 2];
                iArr77[i146 - 2] = i147;
                return 0;
            case 96:
                int i148 = this.AudioAttributesCompatParcelizer;
                int[] iArr78 = this.AudioAttributesImplBaseParcelizer;
                iArr78[i148 - 2] = iArr78[i148 - 2] << iArr78[i148 - 1];
                int i149 = i148 - 2;
                this.AudioAttributesCompatParcelizer = i149;
                iArr78[i148 - 3] = iArr78[i148 - 3] + iArr78[i149];
                return 0;
            case 97:
                int[] iArr79 = this.AudioAttributesImplBaseParcelizer;
                int i150 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i150 + 1;
                iArr79[i150] = 92;
                return 0;
            case 98:
                int[] iArr80 = this.AudioAttributesImplBaseParcelizer;
                int i151 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i151 + 1;
                iArr80[i151] = 39;
                iArr80[i151] = -iArr80[i151];
                return 0;
            case 99:
                int[] iArr81 = this.AudioAttributesImplBaseParcelizer;
                int i152 = this.AudioAttributesCompatParcelizer;
                iArr81[i152] = -1;
                this.AudioAttributesCompatParcelizer = i152;
                iArr81[i152 - 1] = iArr81[i152] ^ iArr81[i152 - 1];
                return 0;
            case 100:
                int[] iArr82 = this.AudioAttributesImplBaseParcelizer;
                int i153 = this.AudioAttributesCompatParcelizer;
                iArr82[i153] = 1;
                iArr82[i153 - 1] = iArr82[i153 - 1] << iArr82[i153];
                this.AudioAttributesCompatParcelizer = i153 + 2;
                iArr82[i153 + 1] = iArr82[i153 - 1];
                iArr82[i153] = iArr82[i153 - 2];
                return 0;
            case 101:
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                int i154 = this.AudioAttributesCompatParcelizer;
                objArr17[i154] = objArr17[16];
                this.AudioAttributesCompatParcelizer = i154 + 2;
                objArr17[i154 + 1] = objArr17[17];
                return 0;
            case 102:
                int[] iArr83 = this.AudioAttributesImplBaseParcelizer;
                int i155 = this.AudioAttributesCompatParcelizer;
                iArr83[i155] = 63;
                iArr83[i155] = -iArr83[i155];
                this.AudioAttributesCompatParcelizer = i155 + 3;
                iArr83[i155 + 2] = iArr83[i155];
                iArr83[i155 + 1] = iArr83[i155 - 1];
                return 0;
            case 103:
                int[] iArr84 = this.AudioAttributesImplBaseParcelizer;
                int i156 = this.AudioAttributesCompatParcelizer;
                iArr84[i156] = 1;
                iArr84[i156 - 1] = iArr84[i156 - 1] << iArr84[i156];
                int i157 = i156 - 1;
                this.AudioAttributesCompatParcelizer = i157;
                iArr84[i156 - 2] = iArr84[i156 - 2] + iArr84[i157];
                return 0;
            case 104:
                int[] iArr85 = this.AudioAttributesImplBaseParcelizer;
                int i158 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i158 + 1;
                iArr85[i158] = 123;
                return 0;
            case 105:
                int[] iArr86 = this.AudioAttributesImplBaseParcelizer;
                int i159 = this.AudioAttributesCompatParcelizer;
                iArr86[i159 + 1] = iArr86[i159 - 1];
                iArr86[i159] = iArr86[i159 - 2];
                this.AudioAttributesCompatParcelizer = i159 + 3;
                iArr86[i159 + 2] = -1;
                return 0;
            case 106:
                int i160 = this.AudioAttributesCompatParcelizer;
                int[] iArr87 = this.AudioAttributesImplBaseParcelizer;
                iArr87[i160 - 2] = iArr87[i160 - 1] ^ iArr87[i160 - 2];
                int i161 = i160 - 2;
                this.AudioAttributesCompatParcelizer = i161;
                this.MediaBrowserCompatMediaItem[i161] = null;
                return 0;
            case 107:
                int i162 = this.AudioAttributesCompatParcelizer;
                int i163 = i162 - 1;
                this.AudioAttributesCompatParcelizer = i163;
                this.MediaBrowserCompatMediaItem[i163] = null;
                int[] iArr88 = this.AudioAttributesImplBaseParcelizer;
                iArr88[i162 - 2] = -iArr88[i162 - 2];
                return 0;
            case 108:
                int i164 = this.AudioAttributesCompatParcelizer;
                int[] iArr89 = this.AudioAttributesImplBaseParcelizer;
                iArr89[i164 - 2] = iArr89[i164 - 1] & iArr89[i164 - 2];
                int i165 = i164 - 2;
                this.AudioAttributesCompatParcelizer = i165;
                iArr89[i164 - 3] = iArr89[i164 - 3] | iArr89[i165];
                return 0;
            case 109:
                int[] iArr90 = this.AudioAttributesImplBaseParcelizer;
                int i166 = this.AudioAttributesCompatParcelizer;
                iArr90[i166] = 2;
                iArr90[i166 + 1] = 2;
                int i167 = i166 + 1;
                this.AudioAttributesCompatParcelizer = i167;
                iArr90[i166] = iArr90[i166] % iArr90[i167];
                return 0;
            case 110:
                int[] iArr91 = this.AudioAttributesImplBaseParcelizer;
                int i168 = this.AudioAttributesCompatParcelizer;
                iArr91[i168] = 125;
                this.AudioAttributesCompatParcelizer = i168 + 3;
                iArr91[i168 + 2] = iArr91[i168];
                iArr91[i168 + 1] = iArr91[i168 - 1];
                return 0;
            case 111:
                int[] iArr92 = this.AudioAttributesImplBaseParcelizer;
                int i169 = this.AudioAttributesCompatParcelizer;
                int i170 = iArr92[i169 - 1];
                iArr92[i169] = i170;
                iArr92[i169 - 1] = iArr92[i169 - 2];
                iArr92[i169 - 2] = iArr92[i169 - 3];
                iArr92[i169 - 3] = i170;
                this.MediaBrowserCompatMediaItem[i169] = null;
                this.AudioAttributesCompatParcelizer = i169 + 2;
                iArr92[i169 + 1] = iArr92[i169 - 1];
                iArr92[i169] = iArr92[i169 - 2];
                return 0;
            case 112:
                int i171 = this.AudioAttributesCompatParcelizer;
                int i172 = i171 - 1;
                int[] iArr93 = this.AudioAttributesImplBaseParcelizer;
                iArr93[i171 - 2] = iArr93[i171 - 2] ^ iArr93[i172];
                this.AudioAttributesCompatParcelizer = i171;
                int i173 = iArr93[i171 - 2];
                iArr93[i172] = i173;
                iArr93[i171 - 2] = iArr93[i171 - 3];
                iArr93[i171 - 3] = iArr93[i171 - 4];
                iArr93[i171 - 4] = i173;
                return 0;
            case 113:
                int[] iArr94 = this.AudioAttributesImplBaseParcelizer;
                int i174 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i174 + 1;
                iArr94[i174] = 83;
                return 0;
            case 114:
                int[] iArr95 = this.AudioAttributesImplBaseParcelizer;
                int i175 = this.AudioAttributesCompatParcelizer;
                int i176 = iArr95[i175 - 1];
                iArr95[i175] = i176;
                iArr95[i175 - 1] = iArr95[i175 - 2];
                iArr95[i175 - 2] = iArr95[i175 - 3];
                iArr95[i175 - 3] = i176;
                this.AudioAttributesCompatParcelizer = i175;
                this.MediaBrowserCompatMediaItem[i175] = null;
                return 0;
            case 115:
                int[] iArr96 = this.AudioAttributesImplBaseParcelizer;
                int i177 = this.AudioAttributesCompatParcelizer;
                iArr96[i177] = iArr96[i177 - 1];
                iArr96[i177 + 1] = 128;
                int i178 = i177 + 1;
                this.AudioAttributesCompatParcelizer = i178;
                iArr96[i177] = iArr96[i177] % iArr96[i178];
                return 0;
            case 116:
                int[] iArr97 = this.AudioAttributesImplBaseParcelizer;
                int i179 = this.AudioAttributesCompatParcelizer;
                iArr97[i179] = 35;
                this.AudioAttributesCompatParcelizer = i179 + 2;
                iArr97[i179 + 1] = iArr97[i179];
                return 0;
            case 117:
                int[] iArr98 = this.AudioAttributesImplBaseParcelizer;
                int i180 = this.AudioAttributesCompatParcelizer;
                iArr98[i180] = -1;
                this.AudioAttributesCompatParcelizer = i180;
                iArr98[i180 - 1] = iArr98[i180 - 1] ^ iArr98[i180];
                int i181 = iArr98[i180 - 1];
                iArr98[i180 - 1] = iArr98[i180 - 2];
                iArr98[i180 - 2] = i181;
                return 0;
            case 118:
                int[] iArr99 = this.AudioAttributesImplBaseParcelizer;
                int i182 = this.AudioAttributesCompatParcelizer;
                iArr99[i182] = 94;
                iArr99[i182 + 1] = 0;
                int i183 = i182 + 1;
                this.AudioAttributesCompatParcelizer = i183;
                iArr99[i182] = iArr99[i182] / iArr99[i183];
                return 0;
            case 119:
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                int i184 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i184 + 1;
                objArr18[i184] = objArr18[i184 - 1];
                return 0;
            case 120:
                int i185 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i185;
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                Object obj5 = objArr19[i185];
                objArr19[i185] = null;
                objArr19[16] = obj5;
                return 0;
            case 121:
                int i186 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i186;
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                Object obj6 = objArr20[i186];
                objArr20[i186] = null;
                objArr20[18] = obj6;
                return 0;
            case 122:
                int i187 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i187;
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr21[i187];
                objArr21[i187] = null;
                objArr21[19] = obj7;
                return 0;
            case 123:
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                int i188 = this.AudioAttributesCompatParcelizer;
                objArr22[i188] = objArr22[i188 - 1];
                this.AudioAttributesCompatParcelizer = i188;
                Object obj8 = objArr22[i188];
                objArr22[i188] = null;
                objArr22[17] = obj8;
                return 0;
            case 124:
                int i189 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i189;
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                Object obj9 = objArr23[i189];
                objArr23[i189] = null;
                this.write = obj9 != null ? 0 : 1;
                return 0;
            case 125:
                int i190 = this.AudioAttributesCompatParcelizer;
                int i191 = i190 - 1;
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                Object obj10 = objArr24[i191];
                objArr24[i191] = null;
                objArr24[16] = obj10;
                this.AudioAttributesCompatParcelizer = i190;
                objArr24[i191] = objArr24[17];
                return 0;
            case 126:
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                int i192 = this.AudioAttributesCompatParcelizer;
                objArr25[i192] = null;
                this.AudioAttributesCompatParcelizer = i192;
                Object obj11 = objArr25[i192];
                objArr25[i192] = null;
                objArr25[16] = obj11;
                return 0;
            case 127:
                int[] iArr100 = this.AudioAttributesImplBaseParcelizer;
                int i193 = this.AudioAttributesCompatParcelizer;
                iArr100[i193] = 2;
                this.AudioAttributesCompatParcelizer = i193 + 2;
                iArr100[i193 + 1] = 2;
                return 0;
            case 128:
                this.write = this.AudioAttributesImplBaseParcelizer[this.AudioAttributesCompatParcelizer - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr101 = this.AudioAttributesImplBaseParcelizer;
                int i194 = this.AudioAttributesCompatParcelizer;
                iArr101[i194] = 43;
                this.AudioAttributesCompatParcelizer = i194 + 3;
                iArr101[i194 + 2] = iArr101[i194];
                iArr101[i194 + 1] = iArr101[i194 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int i195 = this.AudioAttributesCompatParcelizer;
                int i196 = i195 - 1;
                int[] iArr102 = this.AudioAttributesImplBaseParcelizer;
                iArr102[i195 - 2] = iArr102[i195 - 2] & iArr102[i196];
                this.AudioAttributesCompatParcelizer = i195;
                int i197 = iArr102[i195 - 2];
                iArr102[i196] = i197;
                iArr102[i195 - 2] = iArr102[i195 - 3];
                iArr102[i195 - 3] = iArr102[i195 - 4];
                iArr102[i195 - 4] = i197;
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int i198 = this.AudioAttributesCompatParcelizer;
                int[] iArr103 = this.AudioAttributesImplBaseParcelizer;
                iArr103[i198 - 2] = iArr103[i198 - 1] & iArr103[i198 - 2];
                iArr103[i198 - 3] = iArr103[i198 - 2] | iArr103[i198 - 3];
                int i199 = i198 - 3;
                this.AudioAttributesCompatParcelizer = i199;
                iArr103[i198 - 4] = iArr103[i198 - 4] + iArr103[i199];
                return 0;
            case 132:
                int[] iArr104 = this.AudioAttributesImplBaseParcelizer;
                int i200 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i200 + 1;
                iArr104[i200] = 73;
                return 0;
            case 133:
                int i201 = this.AudioAttributesCompatParcelizer;
                int i202 = i201 - 1;
                int[] iArr105 = this.AudioAttributesImplBaseParcelizer;
                iArr105[i201 - 2] = iArr105[i201 - 2] | iArr105[i202];
                iArr105[i202] = 1;
                int i203 = i201 - 1;
                this.AudioAttributesCompatParcelizer = i203;
                iArr105[i201 - 2] = iArr105[i201 - 2] << iArr105[i203];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int[] iArr106 = this.AudioAttributesImplBaseParcelizer;
                int i204 = this.AudioAttributesCompatParcelizer;
                int i205 = iArr106[i204 - 1];
                iArr106[i204] = i205;
                iArr106[i204 - 1] = iArr106[i204 - 2];
                iArr106[i204 - 2] = iArr106[i204 - 3];
                iArr106[i204 - 3] = i205;
                this.MediaBrowserCompatMediaItem[i204] = null;
                int i206 = i204 - 1;
                this.AudioAttributesCompatParcelizer = i206;
                iArr106[i204 - 2] = iArr106[i204 - 2] | iArr106[i206];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr107 = this.AudioAttributesImplBaseParcelizer;
                int i207 = this.AudioAttributesCompatParcelizer;
                iArr107[i207 + 1] = iArr107[i207 - 1];
                iArr107[i207] = iArr107[i207 - 2];
                iArr107[i207 + 1] = -iArr107[i207 + 1];
                int i208 = i207 + 1;
                this.AudioAttributesCompatParcelizer = i208;
                iArr107[i207] = iArr107[i207] & iArr107[i208];
                return 0;
            case 136:
                int[] iArr108 = this.AudioAttributesImplBaseParcelizer;
                int i209 = this.AudioAttributesCompatParcelizer;
                int i210 = iArr108[i209 - 1];
                iArr108[i209] = i210;
                iArr108[i209 - 1] = iArr108[i209 - 2];
                iArr108[i209 - 2] = iArr108[i209 - 3];
                iArr108[i209 - 3] = i210;
                this.AudioAttributesCompatParcelizer = i209;
                this.MediaBrowserCompatMediaItem[i209] = null;
                iArr108[i209 - 1] = -iArr108[i209 - 1];
                return 0;
            case 137:
                int i211 = this.AudioAttributesCompatParcelizer;
                int[] iArr109 = this.AudioAttributesImplBaseParcelizer;
                iArr109[i211 - 2] = iArr109[i211 - 1] | iArr109[i211 - 2];
                int i212 = i211 - 2;
                this.AudioAttributesCompatParcelizer = i212;
                iArr109[i211 - 3] = iArr109[i211 - 3] + iArr109[i212];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr110 = this.AudioAttributesImplBaseParcelizer;
                int i213 = this.AudioAttributesCompatParcelizer;
                iArr110[i213] = 39;
                iArr110[i213 + 2] = iArr110[i213];
                iArr110[i213 + 1] = iArr110[i213 - 1];
                this.AudioAttributesCompatParcelizer = i213 + 5;
                iArr110[i213 + 4] = iArr110[i213 + 2];
                iArr110[i213 + 3] = iArr110[i213 + 1];
                return 0;
            case 139:
                int i214 = this.AudioAttributesCompatParcelizer;
                int i215 = i214 - 1;
                int[] iArr111 = this.AudioAttributesImplBaseParcelizer;
                iArr111[i214 - 2] = iArr111[i214 - 2] | iArr111[i215];
                this.AudioAttributesCompatParcelizer = i214;
                int i216 = iArr111[i214 - 2];
                iArr111[i215] = i216;
                iArr111[i214 - 2] = iArr111[i214 - 3];
                iArr111[i214 - 3] = iArr111[i214 - 4];
                iArr111[i214 - 4] = i216;
                return 0;
            case 140:
                int i217 = this.AudioAttributesCompatParcelizer;
                int i218 = i217 - 1;
                int[] iArr112 = this.AudioAttributesImplBaseParcelizer;
                iArr112[i217 - 2] = iArr112[i217 - 2] & iArr112[i218];
                this.AudioAttributesCompatParcelizer = i217;
                iArr112[i218] = 1;
                return 0;
            case 141:
                int i219 = this.AudioAttributesCompatParcelizer;
                int i220 = i219 - 1;
                int[] iArr113 = this.AudioAttributesImplBaseParcelizer;
                iArr113[i219 - 2] = iArr113[i219 - 2] << iArr113[i220];
                iArr113[i219] = iArr113[i219 - 2];
                iArr113[i220] = iArr113[i219 - 3];
                this.AudioAttributesCompatParcelizer = i219;
                iArr113[i219 - 1] = iArr113[i219] & iArr113[i219 - 1];
                return 0;
            case 142:
                int i221 = this.AudioAttributesCompatParcelizer;
                int i222 = i221 - 1;
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                Object obj12 = objArr26[i222];
                objArr26[i222] = null;
                objArr26[17] = obj12;
                int i223 = i221 - 2;
                Object obj13 = objArr26[i223];
                objArr26[i223] = null;
                objArr26[16] = obj13;
                this.AudioAttributesCompatParcelizer = i221 - 1;
                objArr26[i223] = objArr26[17];
                return 0;
            case 143:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i224 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i224 + 1;
                objArr27[i224] = null;
                int[] iArr114 = this.AudioAttributesImplBaseParcelizer;
                Object obj14 = objArr27[i224];
                objArr27[i224] = null;
                iArr114[i224] = ((int[]) obj14).length;
                this.AudioAttributesCompatParcelizer = i224;
                objArr27[i224] = null;
                return 0;
            case 144:
                int[] iArr115 = this.AudioAttributesImplBaseParcelizer;
                int i225 = this.AudioAttributesCompatParcelizer;
                iArr115[i225] = 23;
                iArr115[i225 + 2] = iArr115[i225];
                iArr115[i225 + 1] = iArr115[i225 - 1];
                int i226 = i225 + 2;
                this.AudioAttributesCompatParcelizer = i226;
                iArr115[i225 + 1] = iArr115[i226] ^ iArr115[i225 + 1];
                return 0;
            case 145:
                int i227 = this.AudioAttributesCompatParcelizer;
                int[] iArr116 = this.AudioAttributesImplBaseParcelizer;
                iArr116[i227 - 2] = iArr116[i227 - 2] << iArr116[i227 - 1];
                int i228 = i227 - 2;
                iArr116[i227 - 3] = iArr116[i227 - 3] + iArr116[i228];
                this.AudioAttributesCompatParcelizer = i227 - 1;
                iArr116[i228] = iArr116[i227 - 3];
                return 0;
            case 146:
                int[] iArr117 = this.AudioAttributesImplBaseParcelizer;
                int i229 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i229 + 1;
                iArr117[i229] = 93;
                iArr117[i229] = -iArr117[i229];
                return 0;
            case 147:
                int i230 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i230 - 1] = null;
                int i231 = i230 - 2;
                int[] iArr118 = this.AudioAttributesImplBaseParcelizer;
                iArr118[i230 - 3] = iArr118[i230 - 3] & iArr118[i231];
                this.AudioAttributesCompatParcelizer = i230 - 1;
                iArr118[i231] = 1;
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int i232 = this.AudioAttributesCompatParcelizer;
                int i233 = i232 - 1;
                int[] iArr119 = this.AudioAttributesImplBaseParcelizer;
                iArr119[i232 - 2] = iArr119[i232 - 2] << iArr119[i233];
                iArr119[i232 - 2] = -iArr119[i232 - 2];
                this.AudioAttributesCompatParcelizer = i232 + 1;
                iArr119[i232] = iArr119[i232 - 2];
                iArr119[i233] = iArr119[i232 - 3];
                return 0;
            case 149:
                int[] iArr120 = this.AudioAttributesImplBaseParcelizer;
                int i234 = this.AudioAttributesCompatParcelizer;
                iArr120[i234 - 1] = -iArr120[i234 - 1];
                int i235 = i234 - 1;
                iArr120[i234 - 2] = iArr120[i234 - 2] & iArr120[i235];
                this.AudioAttributesCompatParcelizer = i234;
                iArr120[i235] = 1;
                return 0;
            case 150:
                int[] iArr121 = this.AudioAttributesImplBaseParcelizer;
                int i236 = this.AudioAttributesCompatParcelizer;
                iArr121[i236] = 113;
                iArr121[i236] = -iArr121[i236];
                this.AudioAttributesCompatParcelizer = i236 + 3;
                iArr121[i236 + 2] = iArr121[i236];
                iArr121[i236 + 1] = iArr121[i236 - 1];
                return 0;
            case 151:
                int[] iArr122 = this.AudioAttributesImplBaseParcelizer;
                int i237 = this.AudioAttributesCompatParcelizer;
                iArr122[i237 - 1] = -iArr122[i237 - 1];
                iArr122[i237 + 1] = iArr122[i237 - 1];
                iArr122[i237] = iArr122[i237 - 2];
                int i238 = i237 + 1;
                this.AudioAttributesCompatParcelizer = i238;
                iArr122[i237] = iArr122[i237] ^ iArr122[i238];
                return 0;
            case 152:
                int[] iArr123 = this.AudioAttributesImplBaseParcelizer;
                int i239 = this.AudioAttributesCompatParcelizer;
                iArr123[i239] = 1;
                iArr123[i239 - 1] = iArr123[i239 - 1] << iArr123[i239];
                this.AudioAttributesCompatParcelizer = i239 + 1;
                int i240 = iArr123[i239 - 1];
                iArr123[i239] = i240;
                iArr123[i239 - 1] = iArr123[i239 - 2];
                iArr123[i239 - 2] = iArr123[i239 - 3];
                iArr123[i239 - 3] = i240;
                return 0;
            case 153:
                int i241 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i241 - 1] = null;
                int[] iArr124 = this.AudioAttributesImplBaseParcelizer;
                iArr124[i241 - 2] = -iArr124[i241 - 2];
                int i242 = i241 - 2;
                this.AudioAttributesCompatParcelizer = i242;
                iArr124[i241 - 3] = iArr124[i241 - 3] ^ iArr124[i242];
                return 0;
            case 154:
                int[] iArr125 = this.AudioAttributesImplBaseParcelizer;
                int i243 = this.AudioAttributesCompatParcelizer;
                iArr125[i243 - 1] = -iArr125[i243 - 1];
                this.AudioAttributesCompatParcelizer = i243 + 2;
                iArr125[i243 + 1] = iArr125[i243 - 1];
                iArr125[i243] = iArr125[i243 - 2];
                iArr125[i243 + 1] = -iArr125[i243 + 1];
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int i244 = this.AudioAttributesCompatParcelizer;
                int[] iArr126 = this.AudioAttributesImplBaseParcelizer;
                iArr126[i244 - 2] = iArr126[i244 - 1] & iArr126[i244 - 2];
                int i245 = i244 - 2;
                iArr126[i244 - 3] = iArr126[i244 - 3] | iArr126[i245];
                this.AudioAttributesCompatParcelizer = i244 - 1;
                int i246 = iArr126[i244 - 3];
                iArr126[i245] = i246;
                iArr126[i244 - 3] = iArr126[i244 - 4];
                iArr126[i244 - 4] = iArr126[i244 - 5];
                iArr126[i244 - 5] = i246;
                return 0;
            case 156:
                int[] iArr127 = this.AudioAttributesImplBaseParcelizer;
                int i247 = this.AudioAttributesCompatParcelizer;
                iArr127[i247] = 1;
                this.AudioAttributesCompatParcelizer = i247;
                iArr127[i247 - 1] = iArr127[i247 - 1] << iArr127[i247];
                iArr127[i247 - 1] = -iArr127[i247 - 1];
                return 0;
            case 157:
                int[] iArr128 = this.AudioAttributesImplBaseParcelizer;
                int i248 = this.AudioAttributesCompatParcelizer;
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                Object obj15 = objArr28[i248 - 1];
                objArr28[i248 - 1] = null;
                iArr128[i248 - 1] = ((int[]) obj15).length;
                return 0;
            case 158:
                int[] iArr129 = this.AudioAttributesImplBaseParcelizer;
                int i249 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i249 + 1;
                iArr129[i249] = 91;
                return 0;
            case 159:
                int i250 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i250 - 1] = null;
                int[] iArr130 = this.AudioAttributesImplBaseParcelizer;
                iArr130[i250 - 3] = iArr130[i250 - 2] & iArr130[i250 - 3];
                int i251 = i250 - 3;
                this.AudioAttributesCompatParcelizer = i251;
                iArr130[i250 - 4] = iArr130[i250 - 4] | iArr130[i251];
                return 0;
            case 160:
                int[] iArr131 = this.AudioAttributesImplBaseParcelizer;
                int i252 = this.AudioAttributesCompatParcelizer;
                int i253 = iArr131[i252 - 1];
                iArr131[i252 - 1] = iArr131[i252 - 2];
                iArr131[i252 - 2] = i253;
                iArr131[i252] = -1;
                this.AudioAttributesCompatParcelizer = i252;
                iArr131[i252 - 1] = iArr131[i252] ^ iArr131[i252 - 1];
                return 0;
            case 161:
                int i254 = this.AudioAttributesCompatParcelizer;
                int i255 = i254 - 1;
                int[] iArr132 = this.AudioAttributesImplBaseParcelizer;
                iArr132[i254 - 2] = iArr132[i254 - 2] | iArr132[i255];
                iArr132[i254 - 2] = -iArr132[i254 - 2];
                this.AudioAttributesCompatParcelizer = i254 + 1;
                iArr132[i254] = iArr132[i254 - 2];
                iArr132[i255] = iArr132[i254 - 3];
                return 0;
            case 162:
                int i256 = this.AudioAttributesCompatParcelizer;
                int[] iArr133 = this.AudioAttributesImplBaseParcelizer;
                iArr133[i256 - 2] = iArr133[i256 - 1] | iArr133[i256 - 2];
                int i257 = i256 - 2;
                iArr133[i256 - 3] = iArr133[i256 - 3] + iArr133[i257];
                this.AudioAttributesCompatParcelizer = i256 - 1;
                iArr133[i257] = iArr133[i256 - 3];
                return 0;
            case 163:
                int[] iArr134 = this.AudioAttributesImplBaseParcelizer;
                int i258 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i258 + 1;
                iArr134[i258] = 37;
                return 0;
            case 164:
                int i259 = this.AudioAttributesCompatParcelizer;
                int[] iArr135 = this.AudioAttributesImplBaseParcelizer;
                iArr135[i259 - 2] = iArr135[i259 - 1] ^ iArr135[i259 - 2];
                this.MediaBrowserCompatMediaItem[i259 - 2] = null;
                int i260 = i259 - 3;
                this.AudioAttributesCompatParcelizer = i260;
                iArr135[i259 - 4] = iArr135[i259 - 4] & iArr135[i260];
                return 0;
            case 165:
                int[] iArr136 = this.AudioAttributesImplBaseParcelizer;
                int i261 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i261 + 1;
                iArr136[i261] = 19;
                return 0;
            case 166:
                int[] iArr137 = this.AudioAttributesImplBaseParcelizer;
                int i262 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i262 + 1;
                iArr137[i262] = 3;
                return 0;
            case 167:
                int[] iArr138 = this.AudioAttributesImplBaseParcelizer;
                int i263 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i263 + 1;
                iArr138[i263] = 5;
                return 0;
            case 168:
                int i264 = this.AudioAttributesCompatParcelizer;
                int[] iArr139 = this.AudioAttributesImplBaseParcelizer;
                iArr139[i264 - 2] = iArr139[i264 - 2] >> iArr139[i264 - 1];
                int i265 = i264 - 2;
                this.AudioAttributesCompatParcelizer = i265;
                this.MediaBrowserCompatMediaItem[i265] = null;
                return 0;
            case 169:
                int[] iArr140 = this.AudioAttributesImplBaseParcelizer;
                int i266 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i266 + 1;
                iArr140[i266] = 109;
                iArr140[i266] = -iArr140[i266];
                return 0;
            case 170:
                int[] iArr141 = this.AudioAttributesImplBaseParcelizer;
                int i267 = this.AudioAttributesCompatParcelizer;
                iArr141[i267 - 1] = -iArr141[i267 - 1];
                int i268 = i267 - 1;
                this.AudioAttributesCompatParcelizer = i268;
                iArr141[i267 - 2] = iArr141[i267 - 2] ^ iArr141[i268];
                return 0;
            case 171:
                int[] iArr142 = this.AudioAttributesImplBaseParcelizer;
                int i269 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i269 + 1;
                iArr142[i269] = 36;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr143 = this.AudioAttributesImplBaseParcelizer;
                int i270 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i270 + 1;
                iArr143[i270] = 80;
                return 0;
            case 173:
                int[] iArr144 = this.AudioAttributesImplBaseParcelizer;
                int i271 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i271 + 1;
                iArr144[i271] = 59;
                return 0;
            case 174:
                int[] iArr145 = this.AudioAttributesImplBaseParcelizer;
                int i272 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i272 + 1;
                iArr145[i272] = 6;
                return 0;
            case 175:
                int[] iArr146 = this.AudioAttributesImplBaseParcelizer;
                int i273 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i273 + 1;
                iArr146[i273] = 38;
                return 0;
            case 176:
                int[] iArr147 = this.AudioAttributesImplBaseParcelizer;
                int i274 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i274 + 1;
                iArr147[i274] = 55;
                return 0;
            case 177:
                int[] iArr148 = this.AudioAttributesImplBaseParcelizer;
                int i275 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i275 + 1;
                iArr148[i275] = 21;
                return 0;
            case 178:
                int[] iArr149 = this.AudioAttributesImplBaseParcelizer;
                int i276 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i276 + 1;
                iArr149[i276] = 64;
                return 0;
            case 179:
                int[] iArr150 = this.AudioAttributesImplBaseParcelizer;
                int i277 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i277 + 1;
                iArr150[i277] = 74;
                return 0;
            case 180:
                int[] iArr151 = this.AudioAttributesImplBaseParcelizer;
                int i278 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i278 + 1;
                iArr151[i278] = 35;
                return 0;
            case 181:
                int[] iArr152 = this.AudioAttributesImplBaseParcelizer;
                int i279 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i279 + 1;
                iArr152[i279] = 72;
                return 0;
            case 182:
                int[] iArr153 = this.AudioAttributesImplBaseParcelizer;
                int i280 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i280 + 1;
                iArr153[i280] = 88;
                return 0;
            case 183:
                int[] iArr154 = this.AudioAttributesImplBaseParcelizer;
                int i281 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i281 + 1;
                iArr154[i281] = 7;
                return 0;
            case 184:
                int[] iArr155 = this.AudioAttributesImplBaseParcelizer;
                int i282 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i282 + 1;
                iArr155[i282] = 3;
                return 0;
            case 185:
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                int i283 = this.AudioAttributesCompatParcelizer;
                objArr29[i283] = objArr29[15];
                this.AudioAttributesCompatParcelizer = i283;
                Object obj16 = objArr29[i283];
                objArr29[i283] = null;
                objArr29[28] = obj16;
                return 0;
            case 186:
                int i284 = this.AudioAttributesCompatParcelizer;
                int i285 = i284 - 1;
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr30[i285];
                objArr30[i285] = null;
                objArr30[17] = obj17;
                this.AudioAttributesCompatParcelizer = i284;
                objArr30[i285] = objArr30[18];
                return 0;
            case 187:
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                int i286 = this.AudioAttributesCompatParcelizer;
                objArr31[i286] = objArr31[i286 - 1];
                this.AudioAttributesCompatParcelizer = i286;
                Object obj18 = objArr31[i286];
                objArr31[i286] = null;
                objArr31[19] = obj18;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                int i287 = this.AudioAttributesCompatParcelizer;
                objArr32[i287] = objArr32[17];
                this.AudioAttributesCompatParcelizer = i287 + 2;
                objArr32[i287 + 1] = objArr32[19];
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int i288 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i288;
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                Object obj19 = objArr33[i288];
                objArr33[i288] = null;
                objArr33[20] = obj19;
                return 0;
            case 190:
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                int i289 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i289 + 1;
                objArr34[i289] = objArr34[20];
                return 0;
            case 191:
                int i290 = this.AudioAttributesCompatParcelizer;
                int i291 = i290 - 1;
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                Object obj20 = objArr35[i291];
                objArr35[i291] = null;
                objArr35[18] = obj20;
                int i292 = i290 - 2;
                Object obj21 = objArr35[i292];
                objArr35[i292] = null;
                objArr35[17] = obj21;
                this.AudioAttributesCompatParcelizer = i290 - 1;
                objArr35[i292] = objArr35[18];
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                int i293 = this.AudioAttributesCompatParcelizer;
                objArr36[i293] = null;
                this.AudioAttributesCompatParcelizer = i293;
                Object obj22 = objArr36[i293];
                objArr36[i293] = null;
                objArr36[17] = obj22;
                return 0;
            case 193:
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                int i294 = this.AudioAttributesCompatParcelizer;
                objArr37[i294] = objArr37[17];
                this.AudioAttributesCompatParcelizer = i294 + 2;
                objArr37[i294 + 1] = objArr37[20];
                return 0;
            case 194:
                int i295 = this.AudioAttributesCompatParcelizer;
                int i296 = i295 - 1;
                Object[] objArr38 = this.MediaBrowserCompatMediaItem;
                objArr38[i296] = null;
                this.AudioAttributesCompatParcelizer = i295;
                objArr38[i296] = objArr38[15];
                return 0;
            case 195:
                int i297 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i297;
                Object[] objArr39 = this.MediaBrowserCompatMediaItem;
                Object obj23 = objArr39[i297];
                objArr39[i297] = null;
                objArr39[17] = obj23;
                return 0;
            case 196:
                int[] iArr156 = this.AudioAttributesImplBaseParcelizer;
                int i298 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i298 + 1;
                iArr156[i298] = 59;
                iArr156[i298] = -iArr156[i298];
                return 0;
            case 197:
                int[] iArr157 = this.AudioAttributesImplBaseParcelizer;
                int i299 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i299 + 1;
                iArr157[i299] = iArr157[i299 - 1];
                iArr157[i299] = -iArr157[i299];
                return 0;
            case 198:
                int[] iArr158 = this.AudioAttributesImplBaseParcelizer;
                int i300 = this.AudioAttributesCompatParcelizer;
                iArr158[i300 + 1] = iArr158[i300 - 1];
                iArr158[i300] = iArr158[i300 - 2];
                iArr158[i300 + 2] = -1;
                int i301 = i300 + 2;
                this.AudioAttributesCompatParcelizer = i301;
                iArr158[i300 + 1] = iArr158[i300 + 1] ^ iArr158[i301];
                return 0;
            case 199:
                int[] iArr159 = this.AudioAttributesImplBaseParcelizer;
                int i302 = this.AudioAttributesCompatParcelizer;
                int i303 = iArr159[i302 - 1];
                iArr159[i302 - 1] = iArr159[i302 - 2];
                iArr159[i302 - 2] = i303;
                this.AudioAttributesCompatParcelizer = i302 + 1;
                iArr159[i302] = -1;
                return 0;
            case 200:
                int i304 = this.AudioAttributesCompatParcelizer;
                int[] iArr160 = this.AudioAttributesImplBaseParcelizer;
                iArr160[i304 - 2] = iArr160[i304 - 1] ^ iArr160[i304 - 2];
                int i305 = i304 - 2;
                this.AudioAttributesCompatParcelizer = i305;
                iArr160[i304 - 3] = iArr160[i304 - 3] & iArr160[i305];
                return 0;
            case 201:
                int[] iArr161 = this.AudioAttributesImplBaseParcelizer;
                int i306 = this.AudioAttributesCompatParcelizer;
                iArr161[i306 - 1] = -iArr161[i306 - 1];
                int i307 = i306 - 1;
                this.AudioAttributesCompatParcelizer = i307;
                iArr161[i306 - 2] = iArr161[i306 - 2] & iArr161[i307];
                return 0;
            case 202:
                int[] iArr162 = this.AudioAttributesImplBaseParcelizer;
                int i308 = this.AudioAttributesCompatParcelizer;
                iArr162[i308] = 1;
                this.AudioAttributesCompatParcelizer = i308 + 3;
                iArr162[i308 + 2] = iArr162[i308];
                iArr162[i308 + 1] = iArr162[i308 - 1];
                return 0;
            case 203:
                int i309 = this.AudioAttributesCompatParcelizer;
                int[] iArr163 = this.AudioAttributesImplBaseParcelizer;
                iArr163[i309 - 2] = iArr163[i309 - 1] ^ iArr163[i309 - 2];
                int i310 = i309 - 2;
                this.AudioAttributesCompatParcelizer = i310;
                iArr163[i309 - 3] = iArr163[i309 - 3] - iArr163[i310];
                return 0;
            case 204:
                int[] iArr164 = this.AudioAttributesImplBaseParcelizer;
                int i311 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i311 + 1;
                iArr164[i311] = 77;
                return 0;
            case 205:
                int i312 = this.AudioAttributesCompatParcelizer;
                int i313 = i312 - 1;
                int[] iArr165 = this.AudioAttributesImplBaseParcelizer;
                iArr165[i312 - 2] = iArr165[i312 - 2] - iArr165[i313];
                iArr165[i313] = 1;
                int i314 = i312 - 1;
                this.AudioAttributesCompatParcelizer = i314;
                iArr165[i312 - 2] = iArr165[i312 - 2] - iArr165[i314];
                return 0;
            case 206:
                int[] iArr166 = this.AudioAttributesImplBaseParcelizer;
                int i315 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i315 + 1;
                iArr166[i315] = 15;
                iArr166[i315] = -iArr166[i315];
                return 0;
            case 207:
                int[] iArr167 = this.AudioAttributesImplBaseParcelizer;
                int i316 = this.AudioAttributesCompatParcelizer;
                iArr167[i316 - 1] = -iArr167[i316 - 1];
                int i317 = i316 - 1;
                this.AudioAttributesCompatParcelizer = i317;
                iArr167[i316 - 2] = iArr167[i316 - 2] | iArr167[i317];
                return 0;
            case 208:
                int[] iArr168 = this.AudioAttributesImplBaseParcelizer;
                int i318 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i318 + 1;
                iArr168[i318] = 57;
                return 0;
            case 209:
                int[] iArr169 = this.AudioAttributesImplBaseParcelizer;
                int i319 = this.AudioAttributesCompatParcelizer;
                iArr169[i319] = 89;
                this.AudioAttributesCompatParcelizer = i319 + 2;
                iArr169[i319 + 1] = iArr169[i319];
                return 0;
            case 210:
                int[] iArr170 = this.AudioAttributesImplBaseParcelizer;
                int i320 = this.AudioAttributesCompatParcelizer;
                iArr170[i320] = -1;
                iArr170[i320 + 2] = iArr170[i320];
                iArr170[i320 + 1] = iArr170[i320 - 1];
                this.AudioAttributesCompatParcelizer = i320 + 4;
                iArr170[i320 + 3] = -1;
                return 0;
            case 211:
                int i321 = this.AudioAttributesCompatParcelizer;
                int[] iArr171 = this.AudioAttributesImplBaseParcelizer;
                iArr171[i321 - 2] = iArr171[i321 - 1] ^ iArr171[i321 - 2];
                int i322 = i321 - 2;
                iArr171[i321 - 3] = iArr171[i321 - 3] & iArr171[i322];
                this.AudioAttributesCompatParcelizer = i321 - 1;
                int i323 = iArr171[i321 - 3];
                iArr171[i322] = i323;
                iArr171[i321 - 3] = iArr171[i321 - 4];
                iArr171[i321 - 4] = iArr171[i321 - 5];
                iArr171[i321 - 5] = i323;
                return 0;
            case 212:
                int i324 = this.AudioAttributesCompatParcelizer;
                int i325 = i324 - 1;
                this.MediaBrowserCompatMediaItem[i325] = null;
                int[] iArr172 = this.AudioAttributesImplBaseParcelizer;
                int i326 = iArr172[i324 - 2];
                iArr172[i324 - 2] = iArr172[i324 - 3];
                iArr172[i324 - 3] = i326;
                this.AudioAttributesCompatParcelizer = i324;
                iArr172[i325] = -1;
                return 0;
            case 213:
                int[] iArr173 = this.AudioAttributesImplBaseParcelizer;
                int i327 = this.AudioAttributesCompatParcelizer;
                iArr173[i327] = iArr173[i327 - 1];
                iArr173[i327 + 1] = -1;
                int i328 = i327 + 1;
                this.AudioAttributesCompatParcelizer = i328;
                iArr173[i327] = iArr173[i327] ^ iArr173[i328];
                return 0;
            case 214:
                int[] iArr174 = this.AudioAttributesImplBaseParcelizer;
                int i329 = this.AudioAttributesCompatParcelizer;
                iArr174[i329] = 1;
                iArr174[i329 - 1] = iArr174[i329 - 1] - iArr174[i329];
                this.AudioAttributesCompatParcelizer = i329 + 1;
                iArr174[i329] = 1;
                return 0;
            case 215:
                int i330 = this.AudioAttributesCompatParcelizer;
                int i331 = i330 - 1;
                int[] iArr175 = this.AudioAttributesImplBaseParcelizer;
                iArr175[i330 - 2] = iArr175[i330 - 2] << iArr175[i331];
                this.AudioAttributesCompatParcelizer = i330;
                int i332 = iArr175[i330 - 2];
                iArr175[i331] = i332;
                iArr175[i330 - 2] = iArr175[i330 - 3];
                iArr175[i330 - 3] = iArr175[i330 - 4];
                iArr175[i330 - 4] = i332;
                return 0;
            case 216:
                int[] iArr176 = this.AudioAttributesImplBaseParcelizer;
                int i333 = this.AudioAttributesCompatParcelizer;
                iArr176[i333] = 53;
                iArr176[i333 + 2] = iArr176[i333];
                iArr176[i333 + 1] = iArr176[i333 - 1];
                this.AudioAttributesCompatParcelizer = i333 + 5;
                iArr176[i333 + 4] = iArr176[i333 + 2];
                iArr176[i333 + 3] = iArr176[i333 + 1];
                return 0;
            case 217:
                int i334 = this.AudioAttributesCompatParcelizer;
                int[] iArr177 = this.AudioAttributesImplBaseParcelizer;
                iArr177[i334 - 2] = iArr177[i334 - 1] & iArr177[i334 - 2];
                int i335 = i334 - 2;
                iArr177[i334 - 3] = iArr177[i334 - 3] | iArr177[i335];
                this.AudioAttributesCompatParcelizer = i334 - 1;
                iArr177[i335] = 1;
                return 0;
            case 218:
                int[] iArr178 = this.AudioAttributesImplBaseParcelizer;
                int i336 = this.AudioAttributesCompatParcelizer;
                iArr178[i336] = 99;
                this.AudioAttributesCompatParcelizer = i336 + 3;
                iArr178[i336 + 2] = iArr178[i336];
                iArr178[i336 + 1] = iArr178[i336 - 1];
                return 0;
            case 219:
                int[] iArr179 = this.AudioAttributesImplBaseParcelizer;
                int i337 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i337 + 1;
                iArr179[i337] = 115;
                return 0;
            case 220:
                int i338 = this.AudioAttributesCompatParcelizer;
                int i339 = i338 - 1;
                this.AudioAttributesCompatParcelizer = i339;
                int[] iArr180 = this.AudioAttributesImplBaseParcelizer;
                iArr180[i338 - 2] = iArr180[i338 - 2] << iArr180[i339];
                iArr180[i338 - 2] = -iArr180[i338 - 2];
                return 0;
            case 221:
                int[] iArr181 = this.AudioAttributesImplBaseParcelizer;
                int i340 = this.AudioAttributesCompatParcelizer;
                iArr181[i340] = 1;
                this.AudioAttributesCompatParcelizer = i340;
                iArr181[i340 - 1] = iArr181[i340 - 1] - iArr181[i340];
                return 0;
            case 222:
                int[] iArr182 = this.AudioAttributesImplBaseParcelizer;
                int i341 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i341 + 1;
                iArr182[i341] = 39;
                return 0;
            case 223:
                int[] iArr183 = this.AudioAttributesImplBaseParcelizer;
                int i342 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i342 + 1;
                iArr183[i342] = 4;
                return 0;
            case 224:
                int[] iArr184 = this.AudioAttributesImplBaseParcelizer;
                int i343 = this.AudioAttributesCompatParcelizer;
                iArr184[i343] = 0;
                this.AudioAttributesCompatParcelizer = i343;
                iArr184[i343 - 1] = iArr184[i343 - 1] / iArr184[i343];
                return 0;
            case 225:
                int[] iArr185 = this.AudioAttributesImplBaseParcelizer;
                int i344 = this.AudioAttributesCompatParcelizer;
                iArr185[i344] = 17;
                iArr185[i344 + 1] = iArr185[i344];
                this.AudioAttributesCompatParcelizer = i344 + 3;
                iArr185[i344 + 2] = -1;
                return 0;
            case 226:
                int i345 = this.AudioAttributesCompatParcelizer;
                int i346 = i345 - 1;
                this.AudioAttributesCompatParcelizer = i346;
                int[] iArr186 = this.AudioAttributesImplBaseParcelizer;
                iArr186[i345 - 2] = iArr186[i346] ^ iArr186[i345 - 2];
                int i347 = iArr186[i345 - 2];
                iArr186[i345 - 2] = iArr186[i345 - 3];
                iArr186[i345 - 3] = i347;
                return 0;
            case 227:
                int i348 = this.AudioAttributesCompatParcelizer;
                int i349 = i348 - 1;
                Object[] objArr40 = this.MediaBrowserCompatMediaItem;
                Object obj24 = objArr40[i349];
                objArr40[i349] = null;
                objArr40[17] = obj24;
                this.AudioAttributesCompatParcelizer = i348;
                objArr40[i349] = objArr40[16];
                return 0;
            case 228:
                Object[] objArr41 = this.MediaBrowserCompatMediaItem;
                int i350 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i350 + 1;
                objArr41[i350] = objArr41[28];
                return 0;
            case 229:
                int i351 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i351;
                int[] iArr187 = this.AudioAttributesImplBaseParcelizer;
                iArr187[27] = iArr187[i351];
                return 0;
            case 230:
                int[] iArr188 = this.AudioAttributesImplBaseParcelizer;
                int i352 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i352 + 1;
                iArr188[i352] = iArr188[27];
                return 0;
            case 231:
                int i353 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i353;
                int[] iArr189 = this.AudioAttributesImplBaseParcelizer;
                iArr189[23] = iArr189[i353];
                return 0;
            case 232:
                int i354 = this.AudioAttributesCompatParcelizer;
                int i355 = i354 - 1;
                this.AudioAttributesCompatParcelizer = i355;
                int[] iArr190 = this.AudioAttributesImplBaseParcelizer;
                iArr190[i354 - 2] = iArr190[i354 - 2] * iArr190[i355];
                return 0;
            case 233:
                int i356 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i356;
                int[] iArr191 = this.AudioAttributesImplBaseParcelizer;
                iArr191[21] = iArr191[i356];
                return 0;
            case 234:
                int i357 = this.AudioAttributesCompatParcelizer;
                int[] iArr192 = this.AudioAttributesImplBaseParcelizer;
                iArr192[i357 - 2] = iArr192[i357 - 2] * iArr192[i357 - 1];
                int i358 = i357 - 2;
                this.AudioAttributesCompatParcelizer = i358;
                iArr192[22] = iArr192[i358];
                return 0;
            case 235:
                int[] iArr193 = this.AudioAttributesImplBaseParcelizer;
                int i359 = this.AudioAttributesCompatParcelizer;
                iArr193[i359] = iArr193[21];
                this.AudioAttributesCompatParcelizer = i359;
                iArr193[i359 - 1] = iArr193[i359 - 1] * iArr193[i359];
                return 0;
            case 236:
                int[] iArr194 = this.AudioAttributesImplBaseParcelizer;
                int i360 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i360 + 1;
                iArr194[i360] = iArr194[22];
                return 0;
            case 237:
                int i361 = this.AudioAttributesCompatParcelizer;
                int i362 = i361 - 1;
                int[] iArr195 = this.AudioAttributesImplBaseParcelizer;
                iArr195[i361 - 2] = iArr195[i361 - 2] * iArr195[i362];
                this.AudioAttributesCompatParcelizer = i361 + 1;
                iArr195[i361] = iArr195[i361 - 2];
                iArr195[i362] = iArr195[i361 - 3];
                return 0;
            case 238:
                int[] iArr196 = this.AudioAttributesImplBaseParcelizer;
                int i363 = this.AudioAttributesCompatParcelizer;
                iArr196[i363] = iArr196[22];
                this.AudioAttributesCompatParcelizer = i363 + 2;
                iArr196[i363 + 1] = -1;
                return 0;
            case 239:
                int i364 = this.AudioAttributesCompatParcelizer;
                int[] iArr197 = this.AudioAttributesImplBaseParcelizer;
                iArr197[i364 - 2] = iArr197[i364 - 1] ^ iArr197[i364 - 2];
                iArr197[i364 - 3] = iArr197[i364 - 2] & iArr197[i364 - 3];
                int i365 = i364 - 3;
                this.AudioAttributesCompatParcelizer = i365;
                iArr197[i364 - 4] = iArr197[i364 - 4] | iArr197[i365];
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int[] iArr198 = this.AudioAttributesImplBaseParcelizer;
                int i366 = this.AudioAttributesCompatParcelizer;
                iArr198[i366] = -1;
                this.AudioAttributesCompatParcelizer = i366 + 3;
                iArr198[i366 + 2] = iArr198[i366];
                iArr198[i366 + 1] = iArr198[i366 - 1];
                return 0;
            case 241:
                int[] iArr199 = this.AudioAttributesImplBaseParcelizer;
                int i367 = this.AudioAttributesCompatParcelizer;
                iArr199[i367] = -1;
                iArr199[i367 - 1] = iArr199[i367 - 1] ^ iArr199[i367];
                int i368 = i367 - 1;
                this.AudioAttributesCompatParcelizer = i368;
                iArr199[i367 - 2] = iArr199[i367 - 2] & iArr199[i368];
                return 0;
            case 242:
                int[] iArr200 = this.AudioAttributesImplBaseParcelizer;
                int i369 = this.AudioAttributesCompatParcelizer;
                iArr200[i369 + 1] = iArr200[i369 - 1];
                iArr200[i369] = iArr200[i369 - 2];
                int i370 = i369 + 1;
                this.AudioAttributesCompatParcelizer = i370;
                iArr200[i369] = iArr200[i369] ^ iArr200[i370];
                return 0;
            case 243:
                int[] iArr201 = this.AudioAttributesImplBaseParcelizer;
                int i371 = this.AudioAttributesCompatParcelizer;
                iArr201[i371] = iArr201[23];
                iArr201[i371 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i371 + 4;
                iArr201[i371 + 3] = iArr201[i371 + 1];
                iArr201[i371 + 2] = iArr201[i371];
                return 0;
            case 244:
                int[] iArr202 = this.AudioAttributesImplBaseParcelizer;
                int i372 = this.AudioAttributesCompatParcelizer;
                iArr202[i372 + 1] = iArr202[i372 - 1];
                iArr202[i372] = iArr202[i372 - 2];
                iArr202[i372 + 3] = iArr202[i372 + 1];
                iArr202[i372 + 2] = iArr202[i372];
                int i373 = i372 + 3;
                this.AudioAttributesCompatParcelizer = i373;
                iArr202[i372 + 2] = iArr202[i372 + 2] & iArr202[i373];
                return 0;
            case 245:
                int i374 = this.AudioAttributesCompatParcelizer;
                int i375 = i374 - 1;
                int[] iArr203 = this.AudioAttributesImplBaseParcelizer;
                iArr203[i374 - 2] = iArr203[i374 - 2] | iArr203[i375];
                iArr203[i375] = -1;
                this.AudioAttributesCompatParcelizer = i374 + 2;
                iArr203[i374 + 1] = iArr203[i374 - 1];
                iArr203[i374] = iArr203[i374 - 2];
                return 0;
            case 246:
                int i376 = this.AudioAttributesCompatParcelizer;
                int[] iArr204 = this.AudioAttributesImplBaseParcelizer;
                iArr204[i376 - 2] = iArr204[i376 - 1] & iArr204[i376 - 2];
                int i377 = i376 - 2;
                iArr204[i376 - 3] = iArr204[i376 - 3] | iArr204[i377];
                this.AudioAttributesCompatParcelizer = i376;
                iArr204[i376 - 1] = iArr204[i376 - 3];
                iArr204[i377] = iArr204[i376 - 4];
                return 0;
            case 247:
                int[] iArr205 = this.AudioAttributesImplBaseParcelizer;
                int i378 = this.AudioAttributesCompatParcelizer;
                iArr205[i378] = -1;
                iArr205[i378 - 1] = iArr205[i378 - 1] ^ iArr205[i378];
                int i379 = i378 - 1;
                this.AudioAttributesCompatParcelizer = i379;
                iArr205[i378 - 2] = iArr205[i378 - 2] ^ iArr205[i379];
                return 0;
            case 248:
                int[] iArr206 = this.AudioAttributesImplBaseParcelizer;
                int i380 = this.AudioAttributesCompatParcelizer;
                int i381 = iArr206[i380 - 1];
                iArr206[i380 - 1] = iArr206[i380 - 2];
                iArr206[i380 - 2] = i381;
                iArr206[i380] = -1;
                this.AudioAttributesCompatParcelizer = i380 + 3;
                iArr206[i380 + 2] = iArr206[i380];
                iArr206[i380 + 1] = iArr206[i380 - 1];
                return 0;
            case 249:
                int i382 = this.AudioAttributesCompatParcelizer;
                int i383 = i382 - 1;
                int[] iArr207 = this.AudioAttributesImplBaseParcelizer;
                iArr207[i382 - 2] = iArr207[i382 - 2] | iArr207[i383];
                iArr207[i382] = iArr207[i382 - 2];
                iArr207[i383] = iArr207[i382 - 3];
                this.AudioAttributesCompatParcelizer = i382 + 2;
                iArr207[i382 + 1] = -1;
                return 0;
            case 250:
                int i384 = this.AudioAttributesCompatParcelizer;
                int i385 = i384 - 1;
                int[] iArr208 = this.AudioAttributesImplBaseParcelizer;
                iArr208[i384 - 2] = iArr208[i384 - 2] & iArr208[i385];
                this.AudioAttributesCompatParcelizer = i384 + 1;
                iArr208[i384] = iArr208[i384 - 2];
                iArr208[i385] = iArr208[i384 - 3];
                return 0;
            case 251:
                int i386 = this.AudioAttributesCompatParcelizer;
                int i387 = i386 - 1;
                int[] iArr209 = this.AudioAttributesImplBaseParcelizer;
                iArr209[i386 - 2] = iArr209[i386 - 2] | iArr209[i387];
                iArr209[i387] = iArr209[22];
                this.AudioAttributesCompatParcelizer = i386 + 1;
                iArr209[i386] = -1;
                return 0;
            case 252:
                int i388 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i388 - 1] = null;
                int[] iArr210 = this.AudioAttributesImplBaseParcelizer;
                iArr210[i388 - 3] = iArr210[i388 - 2] | iArr210[i388 - 3];
                int i389 = i388 - 3;
                this.AudioAttributesCompatParcelizer = i389;
                iArr210[i388 - 4] = iArr210[i388 - 4] & iArr210[i389];
                return 0;
            case 253:
                int[] iArr211 = this.AudioAttributesImplBaseParcelizer;
                int i390 = this.AudioAttributesCompatParcelizer;
                iArr211[i390] = -1;
                iArr211[i390 - 1] = iArr211[i390 - 1] ^ iArr211[i390];
                this.AudioAttributesCompatParcelizer = i390 + 2;
                iArr211[i390 + 1] = iArr211[i390 - 1];
                iArr211[i390] = iArr211[i390 - 2];
                return 0;
            case 254:
                int[] iArr212 = this.AudioAttributesImplBaseParcelizer;
                int i391 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i391 + 1;
                iArr212[i391] = iArr212[21];
                return 0;
            case 255:
                int i392 = this.AudioAttributesCompatParcelizer;
                int i393 = i392 - 1;
                int[] iArr213 = this.AudioAttributesImplBaseParcelizer;
                iArr213[i392 - 2] = iArr213[i392 - 2] | iArr213[i393];
                this.AudioAttributesCompatParcelizer = i392;
                iArr213[i393] = -1;
                return 0;
            case 256:
                int[] iArr214 = this.AudioAttributesImplBaseParcelizer;
                int i394 = this.AudioAttributesCompatParcelizer;
                int i395 = iArr214[i394 - 1];
                iArr214[i394] = i395;
                iArr214[i394 - 1] = iArr214[i394 - 2];
                iArr214[i394 - 2] = iArr214[i394 - 3];
                iArr214[i394 - 3] = i395;
                this.AudioAttributesCompatParcelizer = i394;
                this.MediaBrowserCompatMediaItem[i394] = null;
                int i396 = iArr214[i394 - 1];
                iArr214[i394 - 1] = iArr214[i394 - 2];
                iArr214[i394 - 2] = i396;
                return 0;
            case 257:
                int i397 = this.AudioAttributesCompatParcelizer;
                int i398 = i397 - 1;
                this.MediaBrowserCompatMediaItem[i398] = null;
                int[] iArr215 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i397 + 1;
                iArr215[i397] = iArr215[i397 - 2];
                iArr215[i398] = iArr215[i397 - 3];
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                int i399 = this.AudioAttributesCompatParcelizer;
                int[] iArr216 = this.AudioAttributesImplBaseParcelizer;
                iArr216[i399 - 2] = iArr216[i399 - 1] | iArr216[i399 - 2];
                int i400 = i399 - 2;
                this.AudioAttributesCompatParcelizer = i400;
                iArr216[i399 - 3] = iArr216[i400] & iArr216[i399 - 3];
                iArr216[i399 - 3] = -iArr216[i399 - 3];
                return 0;
            case 259:
                int i401 = this.AudioAttributesCompatParcelizer;
                int[] iArr217 = this.AudioAttributesImplBaseParcelizer;
                iArr217[i401 - 2] = iArr217[i401 - 1] | iArr217[i401 - 2];
                int i402 = i401 - 2;
                iArr217[i401 - 3] = iArr217[i401 - 3] & iArr217[i402];
                this.AudioAttributesCompatParcelizer = i401;
                iArr217[i401 - 1] = iArr217[i401 - 3];
                iArr217[i402] = iArr217[i401 - 4];
                return 0;
            case 260:
                int i403 = this.AudioAttributesCompatParcelizer;
                int i404 = i403 - 1;
                int[] iArr218 = this.AudioAttributesImplBaseParcelizer;
                iArr218[i403 - 2] = iArr218[i403 - 2] & iArr218[i404];
                iArr218[i403] = iArr218[i403 - 2];
                iArr218[i404] = iArr218[i403 - 3];
                this.AudioAttributesCompatParcelizer = i403;
                iArr218[i403 - 1] = iArr218[i403] ^ iArr218[i403 - 1];
                return 0;
            case 261:
                int i405 = this.AudioAttributesCompatParcelizer;
                int i406 = i405 - 1;
                int[] iArr219 = this.AudioAttributesImplBaseParcelizer;
                iArr219[i405 - 2] = iArr219[i405 - 2] | iArr219[i406];
                iArr219[i406] = iArr219[23];
                this.AudioAttributesCompatParcelizer = i405 + 2;
                iArr219[i405 + 1] = iArr219[i405 - 1];
                iArr219[i405] = iArr219[i405 - 2];
                return 0;
            case 262:
                int i407 = this.AudioAttributesCompatParcelizer;
                int i408 = i407 - 1;
                int[] iArr220 = this.AudioAttributesImplBaseParcelizer;
                iArr220[i407 - 2] = iArr220[i407 - 2] & iArr220[i408];
                this.AudioAttributesCompatParcelizer = i407;
                iArr220[i408] = -1;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                int i409 = this.AudioAttributesCompatParcelizer;
                int[] iArr221 = this.AudioAttributesImplBaseParcelizer;
                iArr221[i409 - 2] = iArr221[i409 - 1] | iArr221[i409 - 2];
                int i410 = i409 - 2;
                this.AudioAttributesCompatParcelizer = i410;
                iArr221[i409 - 3] = iArr221[i409 - 3] & iArr221[i410];
                return 0;
            case 264:
                int i411 = this.AudioAttributesCompatParcelizer;
                int[] iArr222 = this.AudioAttributesImplBaseParcelizer;
                iArr222[i411 - 2] = iArr222[i411 - 1] & iArr222[i411 - 2];
                int i412 = i411 - 2;
                this.AudioAttributesCompatParcelizer = i412;
                iArr222[i411 - 3] = iArr222[i411 - 3] * iArr222[i412];
                iArr222[i411 - 3] = -iArr222[i411 - 3];
                return 0;
            case 265:
                int[] iArr223 = this.AudioAttributesImplBaseParcelizer;
                int i413 = this.AudioAttributesCompatParcelizer;
                iArr223[i413] = iArr223[21];
                iArr223[i413 + 1] = iArr223[22];
                this.AudioAttributesCompatParcelizer = i413 + 3;
                iArr223[i413 + 2] = -1;
                return 0;
            case 266:
                int[] iArr224 = this.AudioAttributesImplBaseParcelizer;
                int i414 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i414 + 1;
                iArr224[i414] = iArr224[23];
                return 0;
            case 267:
                int i415 = this.AudioAttributesCompatParcelizer;
                int i416 = i415 - 1;
                int[] iArr225 = this.AudioAttributesImplBaseParcelizer;
                iArr225[i415 - 2] = iArr225[i415 - 2] | iArr225[i416];
                int i417 = iArr225[i415 - 2];
                iArr225[i416] = i417;
                iArr225[i415 - 2] = iArr225[i415 - 3];
                iArr225[i415 - 3] = iArr225[i415 - 4];
                iArr225[i415 - 4] = i417;
                int i418 = i415 - 1;
                this.AudioAttributesCompatParcelizer = i418;
                this.MediaBrowserCompatMediaItem[i418] = null;
                return 0;
            case 268:
                int i419 = this.AudioAttributesCompatParcelizer;
                int[] iArr226 = this.AudioAttributesImplBaseParcelizer;
                iArr226[i419 - 2] = iArr226[i419 - 1] & iArr226[i419 - 2];
                int i420 = i419 - 2;
                iArr226[i419 - 3] = iArr226[i419 - 3] | iArr226[i420];
                this.AudioAttributesCompatParcelizer = i419 - 1;
                iArr226[i420] = -1;
                return 0;
            case 269:
                int i421 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i421 - 1] = null;
                int i422 = i421 - 2;
                int[] iArr227 = this.AudioAttributesImplBaseParcelizer;
                iArr227[i421 - 3] = iArr227[i421 - 3] & iArr227[i422];
                this.AudioAttributesCompatParcelizer = i421 - 1;
                iArr227[i422] = -1;
                return 0;
            case 270:
                int i423 = this.AudioAttributesCompatParcelizer;
                int i424 = i423 - 1;
                int[] iArr228 = this.AudioAttributesImplBaseParcelizer;
                iArr228[i423 - 2] = iArr228[i423 - 2] | iArr228[i424];
                this.AudioAttributesCompatParcelizer = i423 + 1;
                iArr228[i423] = iArr228[i423 - 2];
                iArr228[i424] = iArr228[i423 - 3];
                return 0;
            case 271:
                int i425 = this.AudioAttributesCompatParcelizer;
                int[] iArr229 = this.AudioAttributesImplBaseParcelizer;
                iArr229[i425 - 2] = iArr229[i425 - 1] | iArr229[i425 - 2];
                int i426 = i425 - 2;
                this.AudioAttributesCompatParcelizer = i426;
                iArr229[i425 - 3] = iArr229[i425 - 3] * iArr229[i426];
                return 0;
            case 272:
                int i427 = this.AudioAttributesCompatParcelizer;
                int i428 = i427 - 1;
                int[] iArr230 = this.AudioAttributesImplBaseParcelizer;
                iArr230[i427 - 2] = iArr230[i427 - 2] | iArr230[i428];
                this.AudioAttributesCompatParcelizer = i427 + 1;
                iArr230[i427] = iArr230[i427 - 2];
                iArr230[i428] = iArr230[i427 - 3];
                iArr230[i427] = -iArr230[i427];
                return 0;
            case 273:
                int i429 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i429;
                int[] iArr231 = this.AudioAttributesImplBaseParcelizer;
                iArr231[26] = iArr231[i429];
                return 0;
            case 274:
                int i430 = this.AudioAttributesCompatParcelizer;
                int[] iArr232 = this.AudioAttributesImplBaseParcelizer;
                iArr232[i430 - 2] = iArr232[i430 - 2] * iArr232[i430 - 1];
                int i431 = i430 - 2;
                this.AudioAttributesCompatParcelizer = i431;
                iArr232[24] = iArr232[i431];
                return 0;
            case 275:
                int i432 = this.AudioAttributesCompatParcelizer;
                int[] iArr233 = this.AudioAttributesImplBaseParcelizer;
                iArr233[i432 - 2] = iArr233[i432 - 2] * iArr233[i432 - 1];
                int i433 = i432 - 2;
                this.AudioAttributesCompatParcelizer = i433;
                iArr233[25] = iArr233[i433];
                return 0;
            case 276:
                int[] iArr234 = this.AudioAttributesImplBaseParcelizer;
                int i434 = this.AudioAttributesCompatParcelizer;
                iArr234[i434] = iArr234[24];
                this.AudioAttributesCompatParcelizer = i434;
                iArr234[i434 - 1] = iArr234[i434 - 1] * iArr234[i434];
                return 0;
            case 277:
                int[] iArr235 = this.AudioAttributesImplBaseParcelizer;
                int i435 = this.AudioAttributesCompatParcelizer;
                iArr235[i435] = iArr235[25];
                this.AudioAttributesCompatParcelizer = i435;
                iArr235[i435 - 1] = iArr235[i435 - 1] * iArr235[i435];
                return 0;
            case 278:
                int[] iArr236 = this.AudioAttributesImplBaseParcelizer;
                int i436 = this.AudioAttributesCompatParcelizer;
                iArr236[i436] = iArr236[26];
                this.AudioAttributesCompatParcelizer = i436 + 2;
                iArr236[i436 + 1] = -1;
                return 0;
            case 279:
                int i437 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i437 - 1] = null;
                int i438 = i437 - 2;
                int[] iArr237 = this.AudioAttributesImplBaseParcelizer;
                iArr237[i437 - 3] = iArr237[i437 - 3] & iArr237[i438];
                this.AudioAttributesCompatParcelizer = i437 - 1;
                iArr237[i438] = iArr237[24];
                return 0;
            case 280:
                int[] iArr238 = this.AudioAttributesImplBaseParcelizer;
                int i439 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i439 + 1;
                iArr238[i439] = iArr238[25];
                return 0;
            case 281:
                int i440 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i440 - 1] = null;
                int i441 = i440 - 2;
                int[] iArr239 = this.AudioAttributesImplBaseParcelizer;
                iArr239[i440 - 3] = iArr239[i440 - 3] & iArr239[i441];
                this.AudioAttributesCompatParcelizer = i440 - 1;
                int i442 = iArr239[i440 - 3];
                iArr239[i441] = i442;
                iArr239[i440 - 3] = iArr239[i440 - 4];
                iArr239[i440 - 4] = iArr239[i440 - 5];
                iArr239[i440 - 5] = i442;
                return 0;
            case 282:
                int i443 = this.AudioAttributesCompatParcelizer;
                int i444 = i443 - 1;
                this.MediaBrowserCompatMediaItem[i444] = null;
                int[] iArr240 = this.AudioAttributesImplBaseParcelizer;
                iArr240[i443] = iArr240[i443 - 2];
                iArr240[i444] = iArr240[i443 - 3];
                this.AudioAttributesCompatParcelizer = i443 + 2;
                iArr240[i443 + 1] = -1;
                return 0;
            case 283:
                int i445 = this.AudioAttributesCompatParcelizer;
                int i446 = i445 - 1;
                int[] iArr241 = this.AudioAttributesImplBaseParcelizer;
                iArr241[i445 - 2] = iArr241[i445 - 2] & iArr241[i446];
                iArr241[i446] = -1;
                int i447 = i445 - 1;
                this.AudioAttributesCompatParcelizer = i447;
                iArr241[i445 - 2] = iArr241[i445 - 2] ^ iArr241[i447];
                return 0;
            case 284:
                int[] iArr242 = this.AudioAttributesImplBaseParcelizer;
                int i448 = this.AudioAttributesCompatParcelizer;
                iArr242[i448] = iArr242[24];
                this.AudioAttributesCompatParcelizer = i448 + 2;
                iArr242[i448 + 1] = iArr242[25];
                return 0;
            case 285:
                int i449 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i449 - 1] = null;
                int i450 = i449 - 2;
                int[] iArr243 = this.AudioAttributesImplBaseParcelizer;
                iArr243[i449 - 3] = iArr243[i449 - 3] & iArr243[i450];
                this.AudioAttributesCompatParcelizer = i449;
                iArr243[i449 - 1] = iArr243[i449 - 3];
                iArr243[i450] = iArr243[i449 - 4];
                return 0;
            case 286:
                int i451 = this.AudioAttributesCompatParcelizer;
                int i452 = i451 - 1;
                this.AudioAttributesCompatParcelizer = i452;
                this.MediaBrowserCompatMediaItem[i452] = null;
                int[] iArr244 = this.AudioAttributesImplBaseParcelizer;
                int i453 = iArr244[i451 - 2];
                iArr244[i451 - 2] = iArr244[i451 - 3];
                iArr244[i451 - 3] = i453;
                return 0;
            case 287:
                int[] iArr245 = this.AudioAttributesImplBaseParcelizer;
                int i454 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i454 + 1;
                iArr245[i454] = iArr245[24];
                return 0;
            case 288:
                int[] iArr246 = this.AudioAttributesImplBaseParcelizer;
                int i455 = this.AudioAttributesCompatParcelizer;
                iArr246[i455] = iArr246[26];
                this.AudioAttributesCompatParcelizer = i455 + 3;
                iArr246[i455 + 2] = iArr246[i455];
                iArr246[i455 + 1] = iArr246[i455 - 1];
                return 0;
            case 289:
                int[] iArr247 = this.AudioAttributesImplBaseParcelizer;
                int i456 = this.AudioAttributesCompatParcelizer;
                iArr247[i456] = -1;
                iArr247[i456 + 2] = iArr247[i456];
                iArr247[i456 + 1] = iArr247[i456 - 1];
                int i457 = i456 + 2;
                this.AudioAttributesCompatParcelizer = i457;
                iArr247[i456 + 1] = iArr247[i456 + 1] & iArr247[i457];
                return 0;
            case 290:
                int[] iArr248 = this.AudioAttributesImplBaseParcelizer;
                int i458 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i458 + 1;
                iArr248[i458] = iArr248[26];
                return 0;
            case 291:
                int[] iArr249 = this.AudioAttributesImplBaseParcelizer;
                int i459 = this.AudioAttributesCompatParcelizer;
                iArr249[i459 + 1] = iArr249[i459 - 1];
                iArr249[i459] = iArr249[i459 - 2];
                iArr249[i459 + 2] = -1;
                this.AudioAttributesCompatParcelizer = i459 + 5;
                iArr249[i459 + 4] = iArr249[i459 + 2];
                iArr249[i459 + 3] = iArr249[i459 + 1];
                return 0;
            case 292:
                int i460 = this.AudioAttributesCompatParcelizer;
                int[] iArr250 = this.AudioAttributesImplBaseParcelizer;
                iArr250[i460 - 2] = iArr250[i460 - 1] | iArr250[i460 - 2];
                int i461 = i460 - 2;
                this.AudioAttributesCompatParcelizer = i461;
                iArr250[i460 - 3] = iArr250[i460 - 3] * iArr250[i461];
                iArr250[i460 - 3] = -iArr250[i460 - 3];
                return 0;
            case 293:
                int[] iArr251 = this.AudioAttributesImplBaseParcelizer;
                int i462 = this.AudioAttributesCompatParcelizer;
                iArr251[i462] = iArr251[24];
                iArr251[i462 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i462 + 4;
                iArr251[i462 + 3] = iArr251[i462 + 1];
                iArr251[i462 + 2] = iArr251[i462];
                return 0;
            case 294:
                int i463 = this.AudioAttributesCompatParcelizer;
                int i464 = i463 - 1;
                int[] iArr252 = this.AudioAttributesImplBaseParcelizer;
                iArr252[i463 - 2] = iArr252[i463 - 2] & iArr252[i464];
                this.AudioAttributesCompatParcelizer = i463;
                iArr252[i464] = iArr252[25];
                return 0;
            case 295:
                int[] iArr253 = this.AudioAttributesImplBaseParcelizer;
                int i465 = this.AudioAttributesCompatParcelizer;
                iArr253[i465 + 1] = iArr253[i465 - 1];
                iArr253[i465] = iArr253[i465 - 2];
                iArr253[i465 + 3] = iArr253[i465 + 1];
                iArr253[i465 + 2] = iArr253[i465];
                this.AudioAttributesCompatParcelizer = i465 + 5;
                iArr253[i465 + 4] = -1;
                return 0;
            case 296:
                int i466 = this.AudioAttributesCompatParcelizer;
                int i467 = i466 - 1;
                int[] iArr254 = this.AudioAttributesImplBaseParcelizer;
                iArr254[i466 - 2] = iArr254[i466 - 2] | iArr254[i467];
                iArr254[i467] = iArr254[24];
                int i468 = i466 - 1;
                this.AudioAttributesCompatParcelizer = i468;
                iArr254[i466 - 2] = iArr254[i466 - 2] | iArr254[i468];
                return 0;
            case 297:
                int[] iArr255 = this.AudioAttributesImplBaseParcelizer;
                int i469 = this.AudioAttributesCompatParcelizer;
                iArr255[i469] = -1;
                iArr255[i469 + 2] = iArr255[i469];
                iArr255[i469 + 1] = iArr255[i469 - 1];
                this.AudioAttributesCompatParcelizer = i469 + 5;
                iArr255[i469 + 4] = iArr255[i469 + 2];
                iArr255[i469 + 3] = iArr255[i469 + 1];
                return 0;
            case 298:
                int i470 = this.AudioAttributesCompatParcelizer;
                int i471 = i470 - 1;
                this.MediaBrowserCompatMediaItem[i471] = null;
                int[] iArr256 = this.AudioAttributesImplBaseParcelizer;
                iArr256[i470] = iArr256[i470 - 2];
                iArr256[i471] = iArr256[i470 - 3];
                this.AudioAttributesCompatParcelizer = i470;
                iArr256[i470 - 1] = iArr256[i470] ^ iArr256[i470 - 1];
                return 0;
            case 299:
                int i472 = this.AudioAttributesCompatParcelizer;
                int i473 = i472 - 1;
                int[] iArr257 = this.AudioAttributesImplBaseParcelizer;
                iArr257[i472 - 2] = iArr257[i472 - 2] * iArr257[i473];
                this.AudioAttributesCompatParcelizer = i472;
                iArr257[i473] = iArr257[i472 - 2];
                return 0;
            case 300:
                int[] iArr258 = this.AudioAttributesImplBaseParcelizer;
                int i474 = this.AudioAttributesCompatParcelizer;
                iArr258[i474 - 1] = -iArr258[i474 - 1];
                iArr258[i474 + 1] = iArr258[i474 - 1];
                iArr258[i474] = iArr258[i474 - 2];
                int i475 = i474 + 1;
                this.AudioAttributesCompatParcelizer = i475;
                iArr258[i474] = iArr258[i474] | iArr258[i475];
                return 0;
            case 301:
                int i476 = this.AudioAttributesCompatParcelizer;
                int i477 = i476 - 2;
                this.AudioAttributesCompatParcelizer = i477;
                int[] iArr259 = this.AudioAttributesImplBaseParcelizer;
                this.write = iArr259[i477] <= iArr259[i476 - 1] ? 0 : 1;
                return 0;
            case 302:
                int[] iArr260 = this.AudioAttributesImplBaseParcelizer;
                int i478 = this.AudioAttributesCompatParcelizer;
                iArr260[i478] = 2;
                this.AudioAttributesCompatParcelizer = i478;
                iArr260[i478 - 1] = iArr260[i478 - 1] >>> iArr260[i478];
                return 0;
            case 303:
                int[] iArr261 = this.AudioAttributesImplBaseParcelizer;
                int i479 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i479 + 1;
                iArr261[i479] = 15;
                return 0;
            case 304:
                int[] iArr262 = this.AudioAttributesImplBaseParcelizer;
                int i480 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i480 + 1;
                iArr262[i480] = 69;
                return 0;
            case 305:
                int[] iArr263 = this.AudioAttributesImplBaseParcelizer;
                int i481 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i481 + 1;
                iArr263[i481] = 103;
                return 0;
            case 306:
                int[] iArr264 = this.AudioAttributesImplBaseParcelizer;
                int i482 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i482 + 1;
                iArr264[i482] = 117;
                return 0;
            case 307:
                int i483 = this.AudioAttributesCompatParcelizer;
                int i484 = i483 - 1;
                int[] iArr265 = this.AudioAttributesImplBaseParcelizer;
                iArr265[i483 - 2] = iArr265[i483 - 2] << iArr265[i484];
                this.AudioAttributesCompatParcelizer = i483 + 1;
                iArr265[i483] = iArr265[i483 - 2];
                iArr265[i484] = iArr265[i483 - 3];
                return 0;
            case 308:
                int[] iArr266 = this.AudioAttributesImplBaseParcelizer;
                int i485 = this.AudioAttributesCompatParcelizer;
                iArr266[i485] = 11;
                iArr266[i485 + 2] = iArr266[i485];
                iArr266[i485 + 1] = iArr266[i485 - 1];
                int i486 = i485 + 2;
                this.AudioAttributesCompatParcelizer = i486;
                iArr266[i485 + 1] = iArr266[i485 + 1] & iArr266[i486];
                return 0;
            case 309:
                int[] iArr267 = this.AudioAttributesImplBaseParcelizer;
                int i487 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i487 + 1;
                iArr267[i487] = 61;
                return 0;
            case 310:
                int[] iArr268 = this.AudioAttributesImplBaseParcelizer;
                int i488 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i488 + 1;
                iArr268[i488] = 10;
                return 0;
            case 311:
                int[] iArr269 = this.AudioAttributesImplBaseParcelizer;
                int i489 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i489 + 1;
                iArr269[i489] = 31;
                return 0;
            case 312:
                int[] iArr270 = this.AudioAttributesImplBaseParcelizer;
                int i490 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i490 + 1;
                iArr270[i490] = 85;
                return 0;
            case 313:
                int[] iArr271 = this.AudioAttributesImplBaseParcelizer;
                int i491 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i491 + 1;
                iArr271[i491] = 8;
                return 0;
            case 314:
                int[] iArr272 = this.AudioAttributesImplBaseParcelizer;
                int i492 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i492 + 1;
                iArr272[i492] = 50;
                return 0;
            case 315:
                Object[] objArr42 = this.MediaBrowserCompatMediaItem;
                int i493 = this.AudioAttributesCompatParcelizer;
                objArr42[i493] = objArr42[i493 - 1];
                this.AudioAttributesCompatParcelizer = i493;
                Object obj25 = objArr42[i493];
                objArr42[i493] = null;
                objArr42[20] = obj25;
                return 0;
            case 316:
                int i494 = this.AudioAttributesCompatParcelizer;
                int[] iArr273 = this.AudioAttributesImplBaseParcelizer;
                iArr273[i494 - 2] = iArr273[i494 - 1] & iArr273[i494 - 2];
                int i495 = i494 - 2;
                this.AudioAttributesCompatParcelizer = i495;
                this.MediaBrowserCompatMediaItem[i495] = null;
                return 0;
            case 317:
                Object[] objArr43 = this.MediaBrowserCompatMediaItem;
                int i496 = this.AudioAttributesCompatParcelizer;
                objArr43[i496] = objArr43[20];
                this.AudioAttributesCompatParcelizer = i496 + 2;
                objArr43[i496 + 1] = objArr43[i496];
                return 0;
            case 318:
                int[] iArr274 = this.AudioAttributesImplBaseParcelizer;
                int i497 = this.AudioAttributesCompatParcelizer;
                int i498 = iArr274[i497 - 1];
                iArr274[i497] = i498;
                iArr274[i497 - 1] = iArr274[i497 - 2];
                iArr274[i497 - 2] = iArr274[i497 - 3];
                iArr274[i497 - 3] = i498;
                this.MediaBrowserCompatMediaItem[i497] = null;
                int i499 = i497 - 1;
                this.AudioAttributesCompatParcelizer = i499;
                iArr274[i497 - 2] = iArr274[i497 - 2] ^ iArr274[i499];
                return 0;
            case 319:
                int i500 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i500;
                Object[] objArr44 = this.MediaBrowserCompatMediaItem;
                Object obj26 = objArr44[i500];
                objArr44[i500] = null;
                objArr44[21] = obj26;
                return 0;
            case 320:
                int i501 = this.AudioAttributesCompatParcelizer;
                int i502 = i501 - 1;
                Object[] objArr45 = this.MediaBrowserCompatMediaItem;
                Object obj27 = objArr45[i502];
                objArr45[i502] = null;
                objArr45[22] = obj27;
                this.AudioAttributesCompatParcelizer = i501;
                objArr45[i502] = objArr45[20];
                return 0;
            case 321:
                int i503 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i503;
                int[] iArr275 = this.AudioAttributesImplBaseParcelizer;
                iArr275[19] = iArr275[i503];
                return 0;
            case 322:
                int[] iArr276 = this.AudioAttributesImplBaseParcelizer;
                int i504 = this.AudioAttributesCompatParcelizer;
                iArr276[i504] = iArr276[19];
                this.AudioAttributesCompatParcelizer = i504 + 2;
                iArr276[i504 + 1] = 1;
                return 0;
            case 323:
                int i505 = this.AudioAttributesCompatParcelizer;
                int i506 = i505 - 2;
                this.AudioAttributesCompatParcelizer = i506;
                int[] iArr277 = this.AudioAttributesImplBaseParcelizer;
                this.write = iArr277[i506] != iArr277[i505 - 1] ? 0 : 1;
                return 0;
            case 324:
                int i507 = this.AudioAttributesCompatParcelizer;
                int i508 = i507 - 1;
                Object[] objArr46 = this.MediaBrowserCompatMediaItem;
                objArr46[i508] = null;
                this.AudioAttributesCompatParcelizer = i507;
                objArr46[i508] = objArr46[20];
                return 0;
            case 325:
                int i509 = this.AudioAttributesCompatParcelizer;
                int i510 = i509 - 1;
                Object[] objArr47 = this.MediaBrowserCompatMediaItem;
                objArr47[i510] = null;
                objArr47[i510] = objArr47[16];
                int i511 = i509 - 1;
                this.AudioAttributesCompatParcelizer = i511;
                Object obj28 = objArr47[i511];
                objArr47[i511] = null;
                objArr47[19] = obj28;
                return 0;
            case 326:
                Object[] objArr48 = this.MediaBrowserCompatMediaItem;
                int i512 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i512 + 1;
                objArr48[i512] = objArr48[21];
                return 0;
            case 327:
                Object[] objArr49 = this.MediaBrowserCompatMediaItem;
                int i513 = this.AudioAttributesCompatParcelizer;
                objArr49[i513] = objArr49[18];
                this.AudioAttributesCompatParcelizer = i513;
                Object obj29 = objArr49[i513];
                objArr49[i513] = null;
                objArr49[19] = obj29;
                return 0;
            case 328:
                int i514 = this.AudioAttributesCompatParcelizer;
                int i515 = i514 - 1;
                Object[] objArr50 = this.MediaBrowserCompatMediaItem;
                objArr50[i515] = null;
                this.AudioAttributesCompatParcelizer = i514;
                objArr50[i515] = objArr50[16];
                return 0;
            case 329:
                Object[] objArr51 = this.MediaBrowserCompatMediaItem;
                int i516 = this.AudioAttributesCompatParcelizer;
                objArr51[i516] = objArr51[20];
                this.AudioAttributesCompatParcelizer = i516 + 2;
                objArr51[i516 + 1] = null;
                return 0;
            case 330:
                Object[] objArr52 = this.MediaBrowserCompatMediaItem;
                int i517 = this.AudioAttributesCompatParcelizer;
                objArr52[i517] = objArr52[20];
                int[] iArr278 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i517 + 2;
                iArr278[i517 + 1] = 1;
                return 0;
            case 331:
                Object[] objArr53 = this.MediaBrowserCompatMediaItem;
                int i518 = this.AudioAttributesCompatParcelizer;
                objArr53[i518] = objArr53[18];
                Object obj30 = objArr53[i518];
                objArr53[i518] = null;
                objArr53[16] = obj30;
                this.AudioAttributesCompatParcelizer = i518 + 1;
                objArr53[i518] = objArr53[17];
                return 0;
            case 332:
                Object[] objArr54 = this.MediaBrowserCompatMediaItem;
                int i519 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i519 + 1;
                objArr54[i519] = objArr54[22];
                return 0;
            case 333:
                int i520 = this.AudioAttributesCompatParcelizer;
                int i521 = i520 - 2;
                this.AudioAttributesCompatParcelizer = i521;
                Object[] objArr55 = this.MediaBrowserCompatMediaItem;
                Object obj31 = objArr55[i521];
                objArr55[i521] = null;
                Object obj32 = objArr55[i520 - 1];
                objArr55[i520 - 1] = null;
                this.write = obj31 != obj32 ? 0 : 1;
                return 0;
            case 334:
                int[] iArr279 = this.AudioAttributesImplBaseParcelizer;
                int i522 = this.AudioAttributesCompatParcelizer;
                iArr279[i522] = 63;
                iArr279[i522 + 2] = iArr279[i522];
                iArr279[i522 + 1] = iArr279[i522 - 1];
                this.AudioAttributesCompatParcelizer = i522 + 5;
                iArr279[i522 + 4] = iArr279[i522 + 2];
                iArr279[i522 + 3] = iArr279[i522 + 1];
                return 0;
            case 335:
                int i523 = this.AudioAttributesCompatParcelizer;
                int[] iArr280 = this.AudioAttributesImplBaseParcelizer;
                iArr280[i523 - 2] = iArr280[i523 - 1] & iArr280[i523 - 2];
                int i524 = iArr280[i523 - 2];
                iArr280[i523 - 2] = iArr280[i523 - 3];
                iArr280[i523 - 3] = i524;
                int i525 = i523 - 2;
                this.AudioAttributesCompatParcelizer = i525;
                this.MediaBrowserCompatMediaItem[i525] = null;
                return 0;
            case 336:
                int i526 = this.AudioAttributesCompatParcelizer;
                int i527 = i526 - 1;
                int[] iArr281 = this.AudioAttributesImplBaseParcelizer;
                iArr281[i526 - 2] = iArr281[i526 - 2] - iArr281[i527];
                iArr281[i527] = iArr281[i526 - 2];
                this.AudioAttributesCompatParcelizer = i526 + 1;
                iArr281[i526] = 128;
                return 0;
            case 337:
                int[] iArr282 = this.AudioAttributesImplBaseParcelizer;
                int i528 = this.AudioAttributesCompatParcelizer;
                iArr282[i528] = 29;
                this.AudioAttributesCompatParcelizer = i528 + 3;
                iArr282[i528 + 2] = iArr282[i528];
                iArr282[i528 + 1] = iArr282[i528 - 1];
                return 0;
            case 338:
                int[] iArr283 = this.AudioAttributesImplBaseParcelizer;
                int i529 = this.AudioAttributesCompatParcelizer;
                iArr283[i529] = 49;
                iArr283[i529 + 2] = iArr283[i529];
                iArr283[i529 + 1] = iArr283[i529 - 1];
                this.AudioAttributesCompatParcelizer = i529 + 5;
                iArr283[i529 + 4] = iArr283[i529 + 2];
                iArr283[i529 + 3] = iArr283[i529 + 1];
                return 0;
            case 339:
                int i530 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i530 - 1] = null;
                int[] iArr284 = this.AudioAttributesImplBaseParcelizer;
                iArr284[i530 - 3] = iArr284[i530 - 2] ^ iArr284[i530 - 3];
                int i531 = i530 - 3;
                this.AudioAttributesCompatParcelizer = i531;
                iArr284[i530 - 4] = iArr284[i530 - 4] - iArr284[i531];
                return 0;
            case 340:
                int[] iArr285 = this.AudioAttributesImplBaseParcelizer;
                int i532 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i532 + 1;
                iArr285[i532] = 97;
                return 0;
            case 341:
                int[] iArr286 = this.AudioAttributesImplBaseParcelizer;
                int i533 = this.AudioAttributesCompatParcelizer;
                iArr286[i533 + 1] = iArr286[i533 - 1];
                iArr286[i533] = iArr286[i533 - 2];
                int i534 = i533 + 1;
                iArr286[i533] = iArr286[i533] & iArr286[i534];
                this.AudioAttributesCompatParcelizer = i533 + 2;
                int i535 = iArr286[i533];
                iArr286[i534] = i535;
                iArr286[i533] = iArr286[i533 - 1];
                iArr286[i533 - 1] = iArr286[i533 - 2];
                iArr286[i533 - 2] = i535;
                return 0;
            case 342:
                int[] iArr287 = this.AudioAttributesImplBaseParcelizer;
                int i536 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i536 + 1;
                iArr287[i536] = 60;
                return 0;
            case 343:
                int[] iArr288 = this.AudioAttributesImplBaseParcelizer;
                int i537 = this.AudioAttributesCompatParcelizer;
                iArr288[i537] = 0;
                this.AudioAttributesCompatParcelizer = i537;
                iArr288[i537 - 1] = iArr288[i537 - 1] / iArr288[i537];
                int i538 = i537 - 1;
                this.AudioAttributesCompatParcelizer = i538;
                this.MediaBrowserCompatMediaItem[i538] = null;
                return 0;
            case 344:
                int i539 = this.AudioAttributesCompatParcelizer;
                int[] iArr289 = this.AudioAttributesImplBaseParcelizer;
                iArr289[i539 - 2] = iArr289[i539 - 1] | iArr289[i539 - 2];
                int i540 = i539 - 2;
                iArr289[i539 - 3] = iArr289[i539 - 3] & iArr289[i540];
                this.AudioAttributesCompatParcelizer = i539 - 1;
                int i541 = iArr289[i539 - 3];
                iArr289[i540] = i541;
                iArr289[i539 - 3] = iArr289[i539 - 4];
                iArr289[i539 - 4] = iArr289[i539 - 5];
                iArr289[i539 - 5] = i541;
                return 0;
            case 345:
                int[] iArr290 = this.AudioAttributesImplBaseParcelizer;
                int i542 = this.AudioAttributesCompatParcelizer;
                iArr290[i542 + 1] = iArr290[i542 - 1];
                iArr290[i542] = iArr290[i542 - 2];
                int i543 = i542 + 1;
                this.AudioAttributesCompatParcelizer = i543;
                iArr290[i542] = iArr290[i542] | iArr290[i543];
                return 0;
            case 346:
                int[] iArr291 = this.AudioAttributesImplBaseParcelizer;
                int i544 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i544 + 1;
                iArr291[i544] = 111;
                return 0;
            case 347:
                int[] iArr292 = this.AudioAttributesImplBaseParcelizer;
                int i545 = this.AudioAttributesCompatParcelizer;
                iArr292[i545 - 1] = -iArr292[i545 - 1];
                int i546 = i545 - 1;
                iArr292[i545 - 2] = iArr292[i545 - 2] & iArr292[i546];
                this.AudioAttributesCompatParcelizer = i545;
                int i547 = iArr292[i545 - 2];
                iArr292[i546] = i547;
                iArr292[i545 - 2] = iArr292[i545 - 3];
                iArr292[i545 - 3] = iArr292[i545 - 4];
                iArr292[i545 - 4] = i547;
                return 0;
            case 348:
                Object[] objArr56 = this.MediaBrowserCompatMediaItem;
                int i548 = this.AudioAttributesCompatParcelizer;
                objArr56[i548] = objArr56[20];
                this.AudioAttributesCompatParcelizer = i548 + 2;
                objArr56[i548 + 1] = objArr56[18];
                return 0;
            case 349:
                int[] iArr293 = this.AudioAttributesImplBaseParcelizer;
                int i549 = this.AudioAttributesCompatParcelizer;
                iArr293[i549] = iArr293[i549 - 1];
                this.AudioAttributesCompatParcelizer = i549 + 2;
                iArr293[i549 + 1] = -1;
                return 0;
            case 350:
                int[] iArr294 = this.AudioAttributesImplBaseParcelizer;
                int i550 = this.AudioAttributesCompatParcelizer;
                iArr294[i550 - 1] = -iArr294[i550 - 1];
                iArr294[i550 + 1] = iArr294[i550 - 1];
                iArr294[i550] = iArr294[i550 - 2];
                int i551 = i550 + 1;
                this.AudioAttributesCompatParcelizer = i551;
                iArr294[i550] = iArr294[i550] & iArr294[i551];
                return 0;
            case 351:
                int[] iArr295 = this.AudioAttributesImplBaseParcelizer;
                int i552 = this.AudioAttributesCompatParcelizer;
                iArr295[i552] = 73;
                iArr295[i552] = -iArr295[i552];
                this.AudioAttributesCompatParcelizer = i552 + 3;
                iArr295[i552 + 2] = iArr295[i552];
                iArr295[i552 + 1] = iArr295[i552 - 1];
                return 0;
            case 352:
                int i553 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i553 - 1] = null;
                int i554 = i553 - 2;
                int[] iArr296 = this.AudioAttributesImplBaseParcelizer;
                iArr296[i553 - 3] = iArr296[i553 - 3] - iArr296[i554];
                this.AudioAttributesCompatParcelizer = i553 - 1;
                iArr296[i554] = 1;
                return 0;
            case 353:
                int[] iArr297 = this.AudioAttributesImplBaseParcelizer;
                int i555 = this.AudioAttributesCompatParcelizer;
                iArr297[i555 - 1] = -iArr297[i555 - 1];
                int i556 = i555 - 1;
                iArr297[i555 - 2] = iArr297[i555 - 2] | iArr297[i556];
                this.AudioAttributesCompatParcelizer = i555;
                iArr297[i556] = 1;
                return 0;
            case 354:
                int i557 = this.AudioAttributesCompatParcelizer;
                int[] iArr298 = this.AudioAttributesImplBaseParcelizer;
                iArr298[i557 - 2] = iArr298[i557 - 1] ^ iArr298[i557 - 2];
                int i558 = i557 - 2;
                iArr298[i557 - 3] = iArr298[i557 - 3] - iArr298[i558];
                this.AudioAttributesCompatParcelizer = i557 - 1;
                iArr298[i558] = iArr298[i557 - 3];
                return 0;
            case 355:
                int[] iArr299 = this.AudioAttributesImplBaseParcelizer;
                int i559 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i559 + 1;
                iArr299[i559] = 52;
                return 0;
            case 356:
                int[] iArr300 = this.AudioAttributesImplBaseParcelizer;
                int i560 = this.AudioAttributesCompatParcelizer;
                int i561 = iArr300[i560 - 1];
                iArr300[i560 - 1] = iArr300[i560 - 2];
                iArr300[i560 - 2] = i561;
                int i562 = i560 - 1;
                this.AudioAttributesCompatParcelizer = i562;
                this.MediaBrowserCompatMediaItem[i562] = null;
                iArr300[i560 - 2] = -iArr300[i560 - 2];
                return 0;
            case 357:
                int[] iArr301 = this.AudioAttributesImplBaseParcelizer;
                int i563 = this.AudioAttributesCompatParcelizer;
                iArr301[i563] = 1;
                iArr301[i563] = -iArr301[i563];
                this.AudioAttributesCompatParcelizer = i563 + 3;
                iArr301[i563 + 2] = iArr301[i563];
                iArr301[i563 + 1] = iArr301[i563 - 1];
                return 0;
            case 358:
                int[] iArr302 = this.AudioAttributesImplBaseParcelizer;
                int i564 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i564 + 1;
                iArr302[i564] = 25;
                return 0;
            case 359:
                int[] iArr303 = this.AudioAttributesImplBaseParcelizer;
                int i565 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i565 + 1;
                iArr303[i565] = 4;
                return 0;
            case 360:
                int[] iArr304 = this.AudioAttributesImplBaseParcelizer;
                int i566 = this.AudioAttributesCompatParcelizer;
                iArr304[i566] = 93;
                iArr304[i566 + 1] = iArr304[i566];
                this.AudioAttributesCompatParcelizer = i566 + 3;
                iArr304[i566 + 2] = -1;
                return 0;
            case 361:
                int[] iArr305 = this.AudioAttributesImplBaseParcelizer;
                int i567 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i567 + 1;
                iArr305[i567] = 26;
                return 0;
            case 362:
                int[] iArr306 = this.AudioAttributesImplBaseParcelizer;
                int i568 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i568 + 1;
                iArr306[i568] = 51;
                return 0;
            case 363:
                int[] iArr307 = this.AudioAttributesImplBaseParcelizer;
                int i569 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i569 + 1;
                iArr307[i569] = 34;
                return 0;
            case 364:
                int[] iArr308 = this.AudioAttributesImplBaseParcelizer;
                int i570 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i570 + 1;
                iArr308[i570] = 29;
                return 0;
            case 365:
                int[] iArr309 = this.AudioAttributesImplBaseParcelizer;
                int i571 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i571 + 1;
                iArr309[i571] = 22;
                return 0;
            case 366:
                int[] iArr310 = this.AudioAttributesImplBaseParcelizer;
                int i572 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i572 + 1;
                iArr310[i572] = 96;
                return 0;
            case 367:
                int[] iArr311 = this.AudioAttributesImplBaseParcelizer;
                int i573 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i573 + 1;
                iArr311[i573] = 84;
                return 0;
            case 368:
                int[] iArr312 = this.AudioAttributesImplBaseParcelizer;
                int i574 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i574 + 1;
                iArr312[i574] = 30;
                return 0;
            case 369:
                Object[] objArr57 = this.MediaBrowserCompatMediaItem;
                int i575 = this.AudioAttributesCompatParcelizer;
                objArr57[i575] = objArr57[15];
                this.AudioAttributesCompatParcelizer = i575;
                Object obj33 = objArr57[i575];
                objArr57[i575] = null;
                objArr57[26] = obj33;
                return 0;
            case 370:
                Object[] objArr58 = this.MediaBrowserCompatMediaItem;
                int i576 = this.AudioAttributesCompatParcelizer;
                objArr58[i576] = objArr58[i576 - 1];
                this.AudioAttributesCompatParcelizer = i576;
                Object obj34 = objArr58[i576];
                objArr58[i576] = null;
                objArr58[18] = obj34;
                return 0;
            case 371:
                Object[] objArr59 = this.MediaBrowserCompatMediaItem;
                int i577 = this.AudioAttributesCompatParcelizer;
                objArr59[i577] = objArr59[17];
                objArr59[i577 + 1] = objArr59[15];
                this.AudioAttributesCompatParcelizer = i577 + 3;
                objArr59[i577 + 2] = objArr59[16];
                return 0;
            case 372:
                int[] iArr313 = this.AudioAttributesImplBaseParcelizer;
                int i578 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i578 + 1;
                iArr313[i578] = 67;
                return 0;
            case 373:
                Object[] objArr60 = this.MediaBrowserCompatMediaItem;
                int i579 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i579 + 1;
                objArr60[i579] = objArr60[26];
                return 0;
            case 374:
                int i580 = this.AudioAttributesCompatParcelizer;
                int i581 = i580 - 1;
                int[] iArr314 = this.AudioAttributesImplBaseParcelizer;
                int i582 = iArr314[i581];
                iArr314[25] = i582;
                iArr314[i581] = i582;
                int i583 = i580 - 1;
                this.AudioAttributesCompatParcelizer = i583;
                iArr314[21] = iArr314[i583];
                return 0;
            case 375:
                int i584 = this.AudioAttributesCompatParcelizer;
                int[] iArr315 = this.AudioAttributesImplBaseParcelizer;
                iArr315[i584 - 2] = iArr315[i584 - 2] * iArr315[i584 - 1];
                int i585 = i584 - 2;
                this.AudioAttributesCompatParcelizer = i585;
                iArr315[19] = iArr315[i585];
                return 0;
            case 376:
                int i586 = this.AudioAttributesCompatParcelizer;
                int[] iArr316 = this.AudioAttributesImplBaseParcelizer;
                iArr316[i586 - 2] = iArr316[i586 - 2] * iArr316[i586 - 1];
                int i587 = i586 - 2;
                this.AudioAttributesCompatParcelizer = i587;
                iArr316[20] = iArr316[i587];
                return 0;
            case 377:
                int[] iArr317 = this.AudioAttributesImplBaseParcelizer;
                int i588 = this.AudioAttributesCompatParcelizer;
                iArr317[i588] = iArr317[19];
                this.AudioAttributesCompatParcelizer = i588;
                iArr317[i588 - 1] = iArr317[i588 - 1] * iArr317[i588];
                return 0;
            case 378:
                int[] iArr318 = this.AudioAttributesImplBaseParcelizer;
                int i589 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i589 + 1;
                iArr318[i589] = iArr318[20];
                return 0;
            case 379:
                int i590 = this.AudioAttributesCompatParcelizer;
                int i591 = i590 - 1;
                int[] iArr319 = this.AudioAttributesImplBaseParcelizer;
                iArr319[i590 - 2] = iArr319[i590 - 2] * iArr319[i591];
                iArr319[i590] = iArr319[i590 - 2];
                iArr319[i591] = iArr319[i590 - 3];
                this.AudioAttributesCompatParcelizer = i590 + 3;
                iArr319[i590 + 2] = iArr319[i590];
                iArr319[i590 + 1] = iArr319[i590 - 1];
                return 0;
            case 380:
                int i592 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i592 - 1] = null;
                int[] iArr320 = this.AudioAttributesImplBaseParcelizer;
                iArr320[i592 - 2] = -iArr320[i592 - 2];
                int i593 = i592 - 2;
                this.AudioAttributesCompatParcelizer = i593;
                iArr320[i592 - 3] = iArr320[i592 - 3] & iArr320[i593];
                return 0;
            case 381:
                int[] iArr321 = this.AudioAttributesImplBaseParcelizer;
                int i594 = this.AudioAttributesCompatParcelizer;
                iArr321[i594] = iArr321[20];
                this.AudioAttributesCompatParcelizer = i594 + 2;
                iArr321[i594 + 1] = -1;
                return 0;
            case 382:
                int i595 = this.AudioAttributesCompatParcelizer;
                int[] iArr322 = this.AudioAttributesImplBaseParcelizer;
                iArr322[i595 - 2] = iArr322[i595 - 1] & iArr322[i595 - 2];
                int i596 = i595 - 2;
                iArr322[i595 - 3] = iArr322[i595 - 3] & iArr322[i596];
                this.AudioAttributesCompatParcelizer = i595;
                iArr322[i595 - 1] = iArr322[i595 - 3];
                iArr322[i596] = iArr322[i595 - 4];
                return 0;
            case 383:
                int i597 = this.AudioAttributesCompatParcelizer;
                int i598 = i597 - 1;
                int[] iArr323 = this.AudioAttributesImplBaseParcelizer;
                iArr323[i597 - 2] = iArr323[i597 - 2] | iArr323[i598];
                iArr323[i598] = iArr323[19];
                this.AudioAttributesCompatParcelizer = i597 + 2;
                iArr323[i597 + 1] = iArr323[i597 - 1];
                iArr323[i597] = iArr323[i597 - 2];
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                int i599 = this.AudioAttributesCompatParcelizer;
                int[] iArr324 = this.AudioAttributesImplBaseParcelizer;
                iArr324[i599 - 2] = iArr324[i599 - 1] & iArr324[i599 - 2];
                int i600 = i599 - 2;
                iArr324[i599 - 3] = iArr324[i599 - 3] | iArr324[i600];
                this.AudioAttributesCompatParcelizer = i599 - 1;
                iArr324[i600] = iArr324[21];
                return 0;
            case 385:
                int i601 = this.AudioAttributesCompatParcelizer;
                int[] iArr325 = this.AudioAttributesImplBaseParcelizer;
                iArr325[i601 - 2] = iArr325[i601 - 1] & iArr325[i601 - 2];
                int i602 = i601 - 2;
                iArr325[i601 - 3] = iArr325[i601 - 3] | iArr325[i602];
                this.AudioAttributesCompatParcelizer = i601 - 1;
                iArr325[i602] = iArr325[20];
                return 0;
            case 386:
                int[] iArr326 = this.AudioAttributesImplBaseParcelizer;
                int i603 = this.AudioAttributesCompatParcelizer;
                iArr326[i603] = iArr326[i603 - 1];
                iArr326[i603 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i603 + 4;
                iArr326[i603 + 3] = iArr326[i603 + 1];
                iArr326[i603 + 2] = iArr326[i603];
                return 0;
            case 387:
                int[] iArr327 = this.AudioAttributesImplBaseParcelizer;
                int i604 = this.AudioAttributesCompatParcelizer;
                iArr327[i604 - 1] = -iArr327[i604 - 1];
                iArr327[i604 - 2] = iArr327[i604 - 1] | iArr327[i604 - 2];
                int i605 = i604 - 2;
                this.AudioAttributesCompatParcelizer = i605;
                iArr327[i604 - 3] = iArr327[i604 - 3] + iArr327[i605];
                return 0;
            case 388:
                int[] iArr328 = this.AudioAttributesImplBaseParcelizer;
                int i606 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i606 + 1;
                iArr328[i606] = iArr328[19];
                return 0;
            case 389:
                int i607 = this.AudioAttributesCompatParcelizer;
                int[] iArr329 = this.AudioAttributesImplBaseParcelizer;
                iArr329[i607 - 2] = iArr329[i607 - 1] & iArr329[i607 - 2];
                iArr329[i607 - 3] = iArr329[i607 - 2] | iArr329[i607 - 3];
                int i608 = i607 - 3;
                this.AudioAttributesCompatParcelizer = i608;
                iArr329[i607 - 4] = iArr329[i607 - 4] * iArr329[i608];
                return 0;
            case 390:
                int i609 = this.AudioAttributesCompatParcelizer;
                int i610 = i609 - 1;
                int[] iArr330 = this.AudioAttributesImplBaseParcelizer;
                iArr330[i609 - 2] = iArr330[i609 - 2] | iArr330[i610];
                this.AudioAttributesCompatParcelizer = i609;
                iArr330[i610] = iArr330[20];
                return 0;
            case 391:
                int[] iArr331 = this.AudioAttributesImplBaseParcelizer;
                int i611 = this.AudioAttributesCompatParcelizer;
                iArr331[i611] = iArr331[21];
                this.AudioAttributesCompatParcelizer = i611 + 2;
                iArr331[i611 + 1] = -1;
                return 0;
            case 392:
                int i612 = this.AudioAttributesCompatParcelizer;
                int i613 = i612 - 1;
                int[] iArr332 = this.AudioAttributesImplBaseParcelizer;
                iArr332[i612 - 2] = iArr332[i612 - 2] & iArr332[i613];
                iArr332[i613] = iArr332[20];
                this.AudioAttributesCompatParcelizer = i612 + 2;
                iArr332[i612 + 1] = iArr332[i612 - 1];
                iArr332[i612] = iArr332[i612 - 2];
                return 0;
            case 393:
                int i614 = this.AudioAttributesCompatParcelizer;
                int[] iArr333 = this.AudioAttributesImplBaseParcelizer;
                iArr333[i614 - 2] = iArr333[i614 - 1] & iArr333[i614 - 2];
                iArr333[i614 - 3] = iArr333[i614 - 2] | iArr333[i614 - 3];
                int i615 = i614 - 3;
                this.AudioAttributesCompatParcelizer = i615;
                iArr333[i614 - 4] = iArr333[i614 - 4] & iArr333[i615];
                return 0;
            case 394:
                int i616 = this.AudioAttributesCompatParcelizer;
                int i617 = i616 - 1;
                int[] iArr334 = this.AudioAttributesImplBaseParcelizer;
                int i618 = iArr334[i617];
                iArr334[27] = i618;
                iArr334[i617] = i618;
                int i619 = i616 - 1;
                this.AudioAttributesCompatParcelizer = i619;
                iArr334[24] = iArr334[i619];
                return 0;
            case 395:
                int i620 = this.AudioAttributesCompatParcelizer;
                int[] iArr335 = this.AudioAttributesImplBaseParcelizer;
                iArr335[i620 - 2] = iArr335[i620 - 2] * iArr335[i620 - 1];
                int i621 = i620 - 2;
                this.AudioAttributesCompatParcelizer = i621;
                iArr335[23] = iArr335[i621];
                return 0;
            case 396:
                int[] iArr336 = this.AudioAttributesImplBaseParcelizer;
                int i622 = this.AudioAttributesCompatParcelizer;
                iArr336[i622] = iArr336[23];
                iArr336[i622 - 1] = iArr336[i622 - 1] * iArr336[i622];
                this.AudioAttributesCompatParcelizer = i622 + 1;
                iArr336[i622] = iArr336[i622 - 1];
                return 0;
            case 397:
                int i623 = this.AudioAttributesCompatParcelizer;
                int[] iArr337 = this.AudioAttributesImplBaseParcelizer;
                iArr337[i623 - 2] = iArr337[i623 - 1] | iArr337[i623 - 2];
                int i624 = i623 - 2;
                this.AudioAttributesCompatParcelizer = i624;
                iArr337[i623 - 3] = iArr337[i624] & iArr337[i623 - 3];
                int i625 = iArr337[i623 - 3];
                iArr337[i623 - 3] = iArr337[i623 - 4];
                iArr337[i623 - 4] = i625;
                return 0;
            case 398:
                int i626 = this.AudioAttributesCompatParcelizer;
                int i627 = i626 - 1;
                this.MediaBrowserCompatMediaItem[i627] = null;
                int[] iArr338 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i626;
                iArr338[i627] = iArr338[i626 - 2];
                return 0;
            case 399:
                int[] iArr339 = this.AudioAttributesImplBaseParcelizer;
                int i628 = this.AudioAttributesCompatParcelizer;
                iArr339[i628] = iArr339[24];
                iArr339[i628 + 2] = iArr339[i628];
                iArr339[i628 + 1] = iArr339[i628 - 1];
                this.AudioAttributesCompatParcelizer = i628 + 5;
                iArr339[i628 + 4] = iArr339[i628 + 2];
                iArr339[i628 + 3] = iArr339[i628 + 1];
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                int i629 = this.AudioAttributesCompatParcelizer;
                int[] iArr340 = this.AudioAttributesImplBaseParcelizer;
                iArr340[i629 - 2] = iArr340[i629 - 1] & iArr340[i629 - 2];
                int i630 = i629 - 2;
                iArr340[i629 - 3] = iArr340[i629 - 3] | iArr340[i630];
                this.AudioAttributesCompatParcelizer = i629 - 1;
                iArr340[i630] = iArr340[22];
                return 0;
            case 401:
                int i631 = this.AudioAttributesCompatParcelizer;
                int[] iArr341 = this.AudioAttributesImplBaseParcelizer;
                iArr341[i631 - 2] = iArr341[i631 - 1] | iArr341[i631 - 2];
                int i632 = i631 - 2;
                iArr341[i631 - 3] = iArr341[i631 - 3] * iArr341[i632];
                this.AudioAttributesCompatParcelizer = i631;
                iArr341[i631 - 1] = iArr341[i631 - 3];
                iArr341[i632] = iArr341[i631 - 4];
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                int[] iArr342 = this.AudioAttributesImplBaseParcelizer;
                int i633 = this.AudioAttributesCompatParcelizer;
                iArr342[i633] = iArr342[23];
                this.AudioAttributesCompatParcelizer = i633 + 2;
                iArr342[i633 + 1] = -1;
                return 0;
            case 403:
                int i634 = this.AudioAttributesCompatParcelizer;
                int i635 = i634 - 1;
                int[] iArr343 = this.AudioAttributesImplBaseParcelizer;
                iArr343[i634 - 2] = iArr343[i634 - 2] | iArr343[i635];
                this.AudioAttributesCompatParcelizer = i634;
                iArr343[i635] = iArr343[22];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                int[] iArr344 = this.AudioAttributesImplBaseParcelizer;
                int i636 = this.AudioAttributesCompatParcelizer;
                iArr344[i636 + 1] = iArr344[i636 - 1];
                iArr344[i636] = iArr344[i636 - 2];
                iArr344[i636 + 3] = iArr344[i636 + 1];
                iArr344[i636 + 2] = iArr344[i636];
                int i637 = i636 + 3;
                this.AudioAttributesCompatParcelizer = i637;
                iArr344[i636 + 2] = iArr344[i636 + 2] ^ iArr344[i637];
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                int[] iArr345 = this.AudioAttributesImplBaseParcelizer;
                int i638 = this.AudioAttributesCompatParcelizer;
                iArr345[i638] = 43;
                iArr345[i638] = -iArr345[i638];
                this.AudioAttributesCompatParcelizer = i638 + 3;
                iArr345[i638 + 2] = iArr345[i638];
                iArr345[i638 + 1] = iArr345[i638 - 1];
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                int i639 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i639;
                int[] iArr346 = this.AudioAttributesImplBaseParcelizer;
                iArr346[34] = iArr346[i639];
                return 0;
            case 407:
                int[] iArr347 = this.AudioAttributesImplBaseParcelizer;
                int i640 = this.AudioAttributesCompatParcelizer;
                iArr347[i640] = iArr347[34];
                this.AudioAttributesCompatParcelizer = i640;
                iArr347[30] = iArr347[i640];
                return 0;
            case 408:
                int i641 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i641;
                int[] iArr348 = this.AudioAttributesImplBaseParcelizer;
                iArr348[28] = iArr348[i641];
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                int i642 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i642;
                int[] iArr349 = this.AudioAttributesImplBaseParcelizer;
                iArr349[29] = iArr349[i642];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                int[] iArr350 = this.AudioAttributesImplBaseParcelizer;
                int i643 = this.AudioAttributesCompatParcelizer;
                iArr350[i643] = iArr350[28];
                this.AudioAttributesCompatParcelizer = i643;
                iArr350[i643 - 1] = iArr350[i643 - 1] * iArr350[i643];
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                int[] iArr351 = this.AudioAttributesImplBaseParcelizer;
                int i644 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i644 + 1;
                iArr351[i644] = iArr351[29];
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int i645 = this.AudioAttributesCompatParcelizer;
                int i646 = i645 - 1;
                this.AudioAttributesCompatParcelizer = i646;
                int[] iArr352 = this.AudioAttributesImplBaseParcelizer;
                iArr352[i645 - 2] = iArr352[i646] | iArr352[i645 - 2];
                iArr352[i645 - 2] = -iArr352[i645 - 2];
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                int[] iArr353 = this.AudioAttributesImplBaseParcelizer;
                int i647 = this.AudioAttributesCompatParcelizer;
                iArr353[i647] = iArr353[30];
                iArr353[i647 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i647 + 4;
                iArr353[i647 + 3] = iArr353[i647 + 1];
                iArr353[i647 + 2] = iArr353[i647];
                return 0;
            case 414:
                int[] iArr354 = this.AudioAttributesImplBaseParcelizer;
                int i648 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i648 + 1;
                iArr354[i648] = iArr354[28];
                return 0;
            case 415:
                int i649 = this.AudioAttributesCompatParcelizer;
                int i650 = i649 - 1;
                int[] iArr355 = this.AudioAttributesImplBaseParcelizer;
                iArr355[i649 - 2] = iArr355[i649 - 2] | iArr355[i650];
                iArr355[i649] = iArr355[i649 - 2];
                iArr355[i650] = iArr355[i649 - 3];
                this.AudioAttributesCompatParcelizer = i649;
                iArr355[i649 - 1] = iArr355[i649] ^ iArr355[i649 - 1];
                return 0;
            case 416:
                int i651 = this.AudioAttributesCompatParcelizer;
                int i652 = i651 - 1;
                int[] iArr356 = this.AudioAttributesImplBaseParcelizer;
                iArr356[i651 - 2] = iArr356[i651 - 2] | iArr356[i652];
                this.AudioAttributesCompatParcelizer = i651;
                iArr356[i652] = iArr356[28];
                return 0;
            case 417:
                int[] iArr357 = this.AudioAttributesImplBaseParcelizer;
                int i653 = this.AudioAttributesCompatParcelizer;
                iArr357[i653] = iArr357[29];
                iArr357[i653 - 1] = iArr357[i653 - 1] | iArr357[i653];
                this.AudioAttributesCompatParcelizer = i653 + 1;
                iArr357[i653] = -1;
                return 0;
            case 418:
                int[] iArr358 = this.AudioAttributesImplBaseParcelizer;
                int i654 = this.AudioAttributesCompatParcelizer;
                iArr358[i654] = iArr358[29];
                this.AudioAttributesCompatParcelizer = i654 + 3;
                iArr358[i654 + 2] = iArr358[i654];
                iArr358[i654 + 1] = iArr358[i654 - 1];
                return 0;
            case 419:
                int[] iArr359 = this.AudioAttributesImplBaseParcelizer;
                int i655 = this.AudioAttributesCompatParcelizer;
                iArr359[i655] = iArr359[28];
                iArr359[i655 + 1] = iArr359[30];
                this.AudioAttributesCompatParcelizer = i655 + 4;
                iArr359[i655 + 3] = iArr359[i655 + 1];
                iArr359[i655 + 2] = iArr359[i655];
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                int i656 = this.AudioAttributesCompatParcelizer;
                int[] iArr360 = this.AudioAttributesImplBaseParcelizer;
                iArr360[i656 - 2] = iArr360[i656 - 1] & iArr360[i656 - 2];
                int i657 = i656 - 2;
                this.AudioAttributesCompatParcelizer = i657;
                iArr360[i656 - 3] = iArr360[i656 - 3] & iArr360[i657];
                return 0;
            case 421:
                int[] iArr361 = this.AudioAttributesImplBaseParcelizer;
                int i658 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i658 + 1;
                iArr361[i658] = iArr361[30];
                return 0;
            case 422:
                int i659 = this.AudioAttributesCompatParcelizer;
                int i660 = i659 - 1;
                int[] iArr362 = this.AudioAttributesImplBaseParcelizer;
                iArr362[i659 - 2] = iArr362[i659 - 2] & iArr362[i660];
                iArr362[i659] = iArr362[i659 - 2];
                iArr362[i660] = iArr362[i659 - 3];
                this.AudioAttributesCompatParcelizer = i659 + 2;
                iArr362[i659 + 1] = -1;
                return 0;
            case 423:
                int i661 = this.AudioAttributesCompatParcelizer;
                int i662 = i661 - 1;
                int[] iArr363 = this.AudioAttributesImplBaseParcelizer;
                iArr363[i661 - 2] = iArr363[i661 - 2] | iArr363[i662];
                this.AudioAttributesCompatParcelizer = i661;
                iArr363[i662] = iArr363[29];
                return 0;
            case 424:
                int i663 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i663;
                int[] iArr364 = this.AudioAttributesImplBaseParcelizer;
                iArr364[33] = iArr364[i663];
                return 0;
            case 425:
                int i664 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i664;
                int[] iArr365 = this.AudioAttributesImplBaseParcelizer;
                iArr365[31] = iArr365[i664];
                return 0;
            case 426:
                int i665 = this.AudioAttributesCompatParcelizer;
                int[] iArr366 = this.AudioAttributesImplBaseParcelizer;
                iArr366[i665 - 2] = iArr366[i665 - 2] * iArr366[i665 - 1];
                int i666 = i665 - 2;
                this.AudioAttributesCompatParcelizer = i666;
                iArr366[32] = iArr366[i666];
                return 0;
            case 427:
                int[] iArr367 = this.AudioAttributesImplBaseParcelizer;
                int i667 = this.AudioAttributesCompatParcelizer;
                iArr367[i667] = iArr367[31];
                this.AudioAttributesCompatParcelizer = i667;
                iArr367[i667 - 1] = iArr367[i667 - 1] * iArr367[i667];
                return 0;
            case 428:
                int[] iArr368 = this.AudioAttributesImplBaseParcelizer;
                int i668 = this.AudioAttributesCompatParcelizer;
                iArr368[i668] = iArr368[32];
                this.AudioAttributesCompatParcelizer = i668;
                iArr368[i668 - 1] = iArr368[i668 - 1] * iArr368[i668];
                return 0;
            case 429:
                int i669 = this.AudioAttributesCompatParcelizer;
                int i670 = i669 - 1;
                this.MediaBrowserCompatMediaItem[i670] = null;
                int[] iArr369 = this.AudioAttributesImplBaseParcelizer;
                iArr369[i669] = iArr369[i669 - 2];
                iArr369[i670] = iArr369[i669 - 3];
                this.AudioAttributesCompatParcelizer = i669;
                iArr369[i669 - 1] = iArr369[i669] & iArr369[i669 - 1];
                return 0;
            case 430:
                int[] iArr370 = this.AudioAttributesImplBaseParcelizer;
                int i671 = this.AudioAttributesCompatParcelizer;
                iArr370[i671] = iArr370[31];
                this.AudioAttributesCompatParcelizer = i671 + 2;
                iArr370[i671 + 1] = -1;
                return 0;
            case 431:
                int i672 = this.AudioAttributesCompatParcelizer;
                int i673 = i672 - 1;
                int[] iArr371 = this.AudioAttributesImplBaseParcelizer;
                iArr371[i672 - 2] = iArr371[i672 - 2] ^ iArr371[i673];
                this.AudioAttributesCompatParcelizer = i672 + 1;
                iArr371[i672] = iArr371[i672 - 2];
                iArr371[i673] = iArr371[i672 - 3];
                return 0;
            case 432:
                int[] iArr372 = this.AudioAttributesImplBaseParcelizer;
                int i674 = this.AudioAttributesCompatParcelizer;
                iArr372[i674] = iArr372[33];
                this.AudioAttributesCompatParcelizer = i674 + 2;
                iArr372[i674 + 1] = -1;
                return 0;
            case 433:
                int i675 = this.AudioAttributesCompatParcelizer;
                int i676 = i675 - 1;
                int[] iArr373 = this.AudioAttributesImplBaseParcelizer;
                iArr373[i675 - 2] = iArr373[i675 - 2] | iArr373[i676];
                this.AudioAttributesCompatParcelizer = i675;
                iArr373[i676] = iArr373[32];
                return 0;
            case 434:
                int[] iArr374 = this.AudioAttributesImplBaseParcelizer;
                int i677 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i677 + 1;
                iArr374[i677] = iArr374[32];
                return 0;
            case 435:
                int i678 = this.AudioAttributesCompatParcelizer;
                int i679 = i678 - 1;
                int[] iArr375 = this.AudioAttributesImplBaseParcelizer;
                iArr375[i678 - 2] = iArr375[i678 - 2] | iArr375[i679];
                this.AudioAttributesCompatParcelizer = i678;
                iArr375[i679] = iArr375[31];
                return 0;
            case 436:
                int i680 = this.AudioAttributesCompatParcelizer;
                int i681 = i680 - 1;
                int[] iArr376 = this.AudioAttributesImplBaseParcelizer;
                iArr376[i680 - 2] = iArr376[i680 - 2] * iArr376[i681];
                iArr376[i680 - 2] = -iArr376[i680 - 2];
                this.AudioAttributesCompatParcelizer = i680 + 1;
                iArr376[i680] = iArr376[i680 - 2];
                iArr376[i681] = iArr376[i680 - 3];
                return 0;
            case 437:
                int i682 = this.AudioAttributesCompatParcelizer;
                int i683 = i682 - 1;
                this.MediaBrowserCompatMediaItem[i683] = null;
                int[] iArr377 = this.AudioAttributesImplBaseParcelizer;
                iArr377[i682 - 2] = -iArr377[i682 - 2];
                this.AudioAttributesCompatParcelizer = i682 + 1;
                iArr377[i682] = iArr377[i682 - 2];
                iArr377[i683] = iArr377[i682 - 3];
                return 0;
            case 438:
                int[] iArr378 = this.AudioAttributesImplBaseParcelizer;
                int i684 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i684 + 1;
                iArr378[i684] = iArr378[31];
                return 0;
            case 439:
                int i685 = this.AudioAttributesCompatParcelizer;
                int[] iArr379 = this.AudioAttributesImplBaseParcelizer;
                iArr379[i685 - 2] = iArr379[i685 - 1] & iArr379[i685 - 2];
                int i686 = i685 - 2;
                iArr379[i685 - 3] = iArr379[i685 - 3] | iArr379[i686];
                this.AudioAttributesCompatParcelizer = i685 - 1;
                iArr379[i686] = iArr379[32];
                return 0;
            case 440:
                int i687 = this.AudioAttributesCompatParcelizer;
                int i688 = i687 - 1;
                int[] iArr380 = this.AudioAttributesImplBaseParcelizer;
                iArr380[i687 - 2] = iArr380[i687 - 2] ^ iArr380[i688];
                this.AudioAttributesCompatParcelizer = i687;
                iArr380[i688] = iArr380[33];
                return 0;
            case 441:
                int i689 = this.AudioAttributesCompatParcelizer;
                int i690 = i689 - 1;
                int[] iArr381 = this.AudioAttributesImplBaseParcelizer;
                iArr381[i689 - 2] = iArr381[i689 - 2] | iArr381[i690];
                iArr381[i690] = iArr381[32];
                this.AudioAttributesCompatParcelizer = i689 + 1;
                iArr381[i689] = -1;
                return 0;
            case 442:
                int[] iArr382 = this.AudioAttributesImplBaseParcelizer;
                int i691 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i691 + 1;
                iArr382[i691] = iArr382[33];
                return 0;
            case 443:
                int i692 = this.AudioAttributesCompatParcelizer;
                int[] iArr383 = this.AudioAttributesImplBaseParcelizer;
                iArr383[i692 - 2] = iArr383[i692 - 1] | iArr383[i692 - 2];
                int i693 = iArr383[i692 - 2];
                iArr383[i692 - 2] = iArr383[i692 - 3];
                iArr383[i692 - 3] = i693;
                int i694 = i692 - 2;
                this.AudioAttributesCompatParcelizer = i694;
                this.MediaBrowserCompatMediaItem[i694] = null;
                return 0;
            case 444:
                int[] iArr384 = this.AudioAttributesImplBaseParcelizer;
                int i695 = this.AudioAttributesCompatParcelizer;
                iArr384[i695] = iArr384[32];
                this.AudioAttributesCompatParcelizer = i695 + 3;
                iArr384[i695 + 2] = iArr384[i695];
                iArr384[i695 + 1] = iArr384[i695 - 1];
                return 0;
            case 445:
                int i696 = this.AudioAttributesCompatParcelizer;
                int i697 = i696 - 1;
                int[] iArr385 = this.AudioAttributesImplBaseParcelizer;
                iArr385[i696 - 2] = iArr385[i696 - 2] * iArr385[i697];
                iArr385[i697] = iArr385[i696 - 2];
                this.AudioAttributesCompatParcelizer = i696 + 1;
                iArr385[i696] = -1;
                return 0;
            case 446:
                int[] iArr386 = this.AudioAttributesImplBaseParcelizer;
                int i698 = this.AudioAttributesCompatParcelizer;
                int i699 = iArr386[i698 - 1];
                iArr386[i698 - 1] = iArr386[i698 - 2];
                iArr386[i698 - 2] = i699;
                int i700 = i698 - 1;
                this.MediaBrowserCompatMediaItem[i700] = null;
                this.AudioAttributesCompatParcelizer = i698 + 1;
                iArr386[i698] = iArr386[i698 - 2];
                iArr386[i700] = iArr386[i698 - 3];
                return 0;
            case 447:
                int[] iArr387 = this.AudioAttributesImplBaseParcelizer;
                int i701 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i701 + 1;
                iArr387[i701] = 65;
                return 0;
            case 448:
                int[] iArr388 = this.AudioAttributesImplBaseParcelizer;
                int i702 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i702 + 1;
                iArr388[i702] = 94;
                return 0;
            case 449:
                int[] iArr389 = this.AudioAttributesImplBaseParcelizer;
                int i703 = this.AudioAttributesCompatParcelizer;
                iArr389[i703 - 1] = -iArr389[i703 - 1];
                iArr389[i703] = iArr389[i703 - 1];
                this.AudioAttributesCompatParcelizer = i703 + 2;
                iArr389[i703 + 1] = -1;
                return 0;
            case 450:
                int[] iArr390 = this.AudioAttributesImplBaseParcelizer;
                int i704 = this.AudioAttributesCompatParcelizer;
                iArr390[i704] = 103;
                iArr390[i704] = -iArr390[i704];
                this.AudioAttributesCompatParcelizer = i704 + 3;
                iArr390[i704 + 2] = iArr390[i704];
                iArr390[i704 + 1] = iArr390[i704 - 1];
                return 0;
            case 451:
                int[] iArr391 = this.AudioAttributesImplBaseParcelizer;
                int i705 = this.AudioAttributesCompatParcelizer;
                iArr391[i705] = 35;
                iArr391[i705 + 1] = 0;
                int i706 = i705 + 1;
                this.AudioAttributesCompatParcelizer = i706;
                iArr391[i705] = iArr391[i705] / iArr391[i706];
                return 0;
            case 452:
                Object[] objArr61 = this.MediaBrowserCompatMediaItem;
                int i707 = this.AudioAttributesCompatParcelizer;
                objArr61[i707] = objArr61[i707 - 1];
                this.AudioAttributesCompatParcelizer = i707;
                Object obj35 = objArr61[i707];
                objArr61[i707] = null;
                objArr61[16] = obj35;
                return 0;
            case 453:
                int i708 = this.AudioAttributesCompatParcelizer;
                int i709 = i708 - 1;
                Object[] objArr62 = this.MediaBrowserCompatMediaItem;
                objArr62[i709] = null;
                objArr62[i709] = objArr62[15];
                int[] iArr392 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i708 + 1;
                iArr392[i708] = 1;
                return 0;
            case 454:
                int[] iArr393 = this.AudioAttributesImplBaseParcelizer;
                int i710 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i710 + 1;
                iArr393[i710] = 33;
                return 0;
            case 455:
                int[] iArr394 = this.AudioAttributesImplBaseParcelizer;
                int i711 = this.AudioAttributesCompatParcelizer;
                iArr394[i711 + 1] = iArr394[i711 - 1];
                iArr394[i711] = iArr394[i711 - 2];
                iArr394[i711 + 1] = -iArr394[i711 + 1];
                this.AudioAttributesCompatParcelizer = i711 + 4;
                iArr394[i711 + 3] = iArr394[i711 + 1];
                iArr394[i711 + 2] = iArr394[i711];
                return 0;
            case 456:
                int[] iArr395 = this.AudioAttributesImplBaseParcelizer;
                int i712 = this.AudioAttributesCompatParcelizer;
                iArr395[i712 + 1] = iArr395[i712 - 1];
                iArr395[i712] = iArr395[i712 - 2];
                iArr395[i712 + 1] = -iArr395[i712 + 1];
                int i713 = i712 + 1;
                this.AudioAttributesCompatParcelizer = i713;
                iArr395[i712] = iArr395[i712] ^ iArr395[i713];
                return 0;
            case 457:
                int i714 = this.AudioAttributesCompatParcelizer;
                int[] iArr396 = this.AudioAttributesImplBaseParcelizer;
                iArr396[i714 - 2] = iArr396[i714 - 2] * iArr396[i714 - 1];
                int i715 = i714 - 2;
                this.AudioAttributesCompatParcelizer = i715;
                iArr396[17] = iArr396[i715];
                return 0;
            case 458:
                int i716 = this.AudioAttributesCompatParcelizer;
                int[] iArr397 = this.AudioAttributesImplBaseParcelizer;
                iArr397[i716 - 2] = iArr397[i716 - 2] * iArr397[i716 - 1];
                int i717 = i716 - 2;
                this.AudioAttributesCompatParcelizer = i717;
                iArr397[18] = iArr397[i717];
                return 0;
            case 459:
                int[] iArr398 = this.AudioAttributesImplBaseParcelizer;
                int i718 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i718 + 1;
                iArr398[i718] = iArr398[17];
                return 0;
            case 460:
                int[] iArr399 = this.AudioAttributesImplBaseParcelizer;
                int i719 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i719 + 1;
                iArr399[i719] = iArr399[18];
                return 0;
            case 461:
                int[] iArr400 = this.AudioAttributesImplBaseParcelizer;
                int i720 = this.AudioAttributesCompatParcelizer;
                iArr400[i720] = iArr400[17];
                this.AudioAttributesCompatParcelizer = i720 + 2;
                iArr400[i720 + 1] = -1;
                return 0;
            case 462:
                int i721 = this.AudioAttributesCompatParcelizer;
                int i722 = i721 - 1;
                int[] iArr401 = this.AudioAttributesImplBaseParcelizer;
                iArr401[i721 - 2] = iArr401[i721 - 2] & iArr401[i722];
                this.AudioAttributesCompatParcelizer = i721;
                iArr401[i722] = iArr401[18];
                return 0;
            case 463:
                int i723 = this.AudioAttributesCompatParcelizer;
                int i724 = i723 - 1;
                int[] iArr402 = this.AudioAttributesImplBaseParcelizer;
                iArr402[i723 - 2] = iArr402[i723 - 2] | iArr402[i724];
                this.AudioAttributesCompatParcelizer = i723;
                iArr402[i724] = iArr402[19];
                return 0;
            case 464:
                int i725 = this.AudioAttributesCompatParcelizer;
                int i726 = i725 - 1;
                int[] iArr403 = this.AudioAttributesImplBaseParcelizer;
                iArr403[i725 - 2] = iArr403[i725 - 2] | iArr403[i726];
                iArr403[i726] = iArr403[18];
                this.AudioAttributesCompatParcelizer = i725 + 2;
                iArr403[i725 + 1] = iArr403[i725 - 1];
                iArr403[i725] = iArr403[i725 - 2];
                return 0;
            case 465:
                int[] iArr404 = this.AudioAttributesImplBaseParcelizer;
                int i727 = this.AudioAttributesCompatParcelizer;
                iArr404[i727] = iArr404[17];
                iArr404[i727 + 2] = iArr404[i727];
                iArr404[i727 + 1] = iArr404[i727 - 1];
                int i728 = i727 + 2;
                this.AudioAttributesCompatParcelizer = i728;
                iArr404[i727 + 1] = iArr404[i727 + 1] ^ iArr404[i728];
                return 0;
            case 466:
                int i729 = this.AudioAttributesCompatParcelizer;
                int[] iArr405 = this.AudioAttributesImplBaseParcelizer;
                iArr405[i729 - 2] = iArr405[i729 - 1] & iArr405[i729 - 2];
                int i730 = i729 - 2;
                iArr405[i729 - 3] = iArr405[i729 - 3] | iArr405[i730];
                this.AudioAttributesCompatParcelizer = i729 - 1;
                iArr405[i730] = iArr405[19];
                return 0;
            case 467:
                int i731 = this.AudioAttributesCompatParcelizer;
                int i732 = i731 - 1;
                int[] iArr406 = this.AudioAttributesImplBaseParcelizer;
                iArr406[i731 - 2] = iArr406[i731 - 2] | iArr406[i732];
                this.AudioAttributesCompatParcelizer = i731;
                iArr406[i732] = iArr406[18];
                return 0;
            case 468:
                int[] iArr407 = this.AudioAttributesImplBaseParcelizer;
                int i733 = this.AudioAttributesCompatParcelizer;
                iArr407[i733] = iArr407[17];
                iArr407[i733 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i733 + 4;
                iArr407[i733 + 3] = iArr407[i733 + 1];
                iArr407[i733 + 2] = iArr407[i733];
                return 0;
            case 469:
                int i734 = this.AudioAttributesCompatParcelizer;
                int i735 = i734 - 1;
                int[] iArr408 = this.AudioAttributesImplBaseParcelizer;
                iArr408[i734 - 2] = iArr408[i734 - 2] | iArr408[i735];
                iArr408[i735] = iArr408[19];
                this.AudioAttributesCompatParcelizer = i734 + 1;
                iArr408[i734] = -1;
                return 0;
            case 470:
                int[] iArr409 = this.AudioAttributesImplBaseParcelizer;
                int i736 = this.AudioAttributesCompatParcelizer;
                iArr409[i736] = iArr409[18];
                this.AudioAttributesCompatParcelizer = i736 + 2;
                iArr409[i736 + 1] = -1;
                return 0;
            case 471:
                int i737 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i737;
                int[] iArr410 = this.AudioAttributesImplBaseParcelizer;
                iArr410[22] = iArr410[i737];
                return 0;
            case 472:
                int i738 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i738;
                int[] iArr411 = this.AudioAttributesImplBaseParcelizer;
                iArr411[20] = iArr411[i738];
                return 0;
            case 473:
                int i739 = this.AudioAttributesCompatParcelizer;
                int[] iArr412 = this.AudioAttributesImplBaseParcelizer;
                iArr412[i739 - 2] = iArr412[i739 - 2] * iArr412[i739 - 1];
                int i740 = i739 - 2;
                this.AudioAttributesCompatParcelizer = i740;
                iArr412[21] = iArr412[i740];
                return 0;
            case 474:
                int[] iArr413 = this.AudioAttributesImplBaseParcelizer;
                int i741 = this.AudioAttributesCompatParcelizer;
                iArr413[i741] = iArr413[20];
                this.AudioAttributesCompatParcelizer = i741;
                iArr413[i741 - 1] = iArr413[i741 - 1] * iArr413[i741];
                return 0;
            case 475:
                int[] iArr414 = this.AudioAttributesImplBaseParcelizer;
                int i742 = this.AudioAttributesCompatParcelizer;
                iArr414[i742] = iArr414[22];
                iArr414[i742 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i742 + 4;
                iArr414[i742 + 3] = iArr414[i742 + 1];
                iArr414[i742 + 2] = iArr414[i742];
                return 0;
            case 476:
                int i743 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i743 - 1] = null;
                int i744 = i743 - 2;
                int[] iArr415 = this.AudioAttributesImplBaseParcelizer;
                iArr415[i743 - 3] = iArr415[i743 - 3] | iArr415[i744];
                this.AudioAttributesCompatParcelizer = i743;
                iArr415[i743 - 1] = iArr415[i743 - 3];
                iArr415[i744] = iArr415[i743 - 4];
                return 0;
            case 477:
                int[] iArr416 = this.AudioAttributesImplBaseParcelizer;
                int i745 = this.AudioAttributesCompatParcelizer;
                iArr416[i745] = iArr416[21];
                this.AudioAttributesCompatParcelizer = i745 + 3;
                iArr416[i745 + 2] = iArr416[i745];
                iArr416[i745 + 1] = iArr416[i745 - 1];
                return 0;
            case 478:
                int[] iArr417 = this.AudioAttributesImplBaseParcelizer;
                int i746 = this.AudioAttributesCompatParcelizer;
                iArr417[i746] = iArr417[21];
                iArr417[i746 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i746 + 4;
                iArr417[i746 + 3] = iArr417[i746 + 1];
                iArr417[i746 + 2] = iArr417[i746];
                return 0;
            case 479:
                int i747 = this.AudioAttributesCompatParcelizer;
                int[] iArr418 = this.AudioAttributesImplBaseParcelizer;
                iArr418[i747 - 2] = iArr418[i747 - 1] | iArr418[i747 - 2];
                iArr418[i747 - 3] = iArr418[i747 - 2] & iArr418[i747 - 3];
                int i748 = i747 - 3;
                this.AudioAttributesCompatParcelizer = i748;
                iArr418[i747 - 4] = iArr418[i747 - 4] & iArr418[i748];
                return 0;
            case 480:
                int i749 = this.AudioAttributesCompatParcelizer;
                int i750 = i749 - 1;
                int[] iArr419 = this.AudioAttributesImplBaseParcelizer;
                iArr419[i749 - 2] = iArr419[i749 - 2] | iArr419[i750];
                iArr419[i750] = iArr419[20];
                this.AudioAttributesCompatParcelizer = i749 + 1;
                iArr419[i749] = -1;
                return 0;
            case 481:
                int i751 = this.AudioAttributesCompatParcelizer;
                int i752 = i751 - 1;
                this.AudioAttributesCompatParcelizer = i752;
                int[] iArr420 = this.AudioAttributesImplBaseParcelizer;
                iArr420[i751 - 2] = iArr420[i752] & iArr420[i751 - 2];
                int i753 = iArr420[i751 - 2];
                iArr420[i751 - 2] = iArr420[i751 - 3];
                iArr420[i751 - 3] = i753;
                return 0;
            case 482:
                int i754 = this.AudioAttributesCompatParcelizer;
                int[] iArr421 = this.AudioAttributesImplBaseParcelizer;
                iArr421[i754 - 2] = iArr421[i754 - 1] ^ iArr421[i754 - 2];
                int i755 = i754 - 2;
                iArr421[i754 - 3] = iArr421[i754 - 3] - iArr421[i755];
                this.AudioAttributesCompatParcelizer = i754 - 1;
                iArr421[i755] = 1;
                return 0;
            case 483:
                int[] iArr422 = this.AudioAttributesImplBaseParcelizer;
                int i756 = this.AudioAttributesCompatParcelizer;
                iArr422[i756] = iArr422[20];
                iArr422[i756 + 1] = iArr422[21];
                this.AudioAttributesCompatParcelizer = i756 + 4;
                iArr422[i756 + 3] = iArr422[i756 + 1];
                iArr422[i756 + 2] = iArr422[i756];
                return 0;
            case 484:
                int i757 = this.AudioAttributesCompatParcelizer;
                int[] iArr423 = this.AudioAttributesImplBaseParcelizer;
                iArr423[i757 - 2] = iArr423[i757 - 1] & iArr423[i757 - 2];
                int i758 = i757 - 2;
                this.AudioAttributesCompatParcelizer = i758;
                iArr423[i757 - 3] = iArr423[i758] | iArr423[i757 - 3];
                int i759 = iArr423[i757 - 3];
                iArr423[i757 - 3] = iArr423[i757 - 4];
                iArr423[i757 - 4] = i759;
                return 0;
            case 485:
                int i760 = this.AudioAttributesCompatParcelizer;
                int i761 = i760 - 1;
                this.MediaBrowserCompatMediaItem[i761] = null;
                int[] iArr424 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i760 + 1;
                iArr424[i760] = iArr424[i760 - 2];
                iArr424[i761] = iArr424[i760 - 3];
                iArr424[i760] = -iArr424[i760];
                return 0;
            case 486:
                int i762 = this.AudioAttributesCompatParcelizer;
                int i763 = i762 - 2;
                this.AudioAttributesCompatParcelizer = i763;
                int[] iArr425 = this.AudioAttributesImplBaseParcelizer;
                this.write = iArr425[i763] > iArr425[i762 - 1] ? 0 : 1;
                return 0;
            case 487:
                int[] iArr426 = this.AudioAttributesImplBaseParcelizer;
                int i764 = this.AudioAttributesCompatParcelizer;
                iArr426[i764] = 41;
                iArr426[i764] = -iArr426[i764];
                this.AudioAttributesCompatParcelizer = i764 + 3;
                iArr426[i764 + 2] = iArr426[i764];
                iArr426[i764 + 1] = iArr426[i764 - 1];
                return 0;
            case 488:
                int[] iArr427 = this.AudioAttributesImplBaseParcelizer;
                int i765 = this.AudioAttributesCompatParcelizer;
                iArr427[i765] = 1;
                iArr427[i765 - 1] = iArr427[i765 - 1] - iArr427[i765];
                this.AudioAttributesCompatParcelizer = i765 + 1;
                iArr427[i765] = iArr427[i765 - 1];
                return 0;
            case 489:
                int[] iArr428 = this.AudioAttributesImplBaseParcelizer;
                int i766 = this.AudioAttributesCompatParcelizer;
                iArr428[i766] = 71;
                iArr428[i766] = -iArr428[i766];
                this.AudioAttributesCompatParcelizer = i766 + 3;
                iArr428[i766 + 2] = iArr428[i766];
                iArr428[i766 + 1] = iArr428[i766 - 1];
                return 0;
            case 490:
                int[] iArr429 = this.AudioAttributesImplBaseParcelizer;
                int i767 = this.AudioAttributesCompatParcelizer;
                iArr429[i767 - 1] = -iArr429[i767 - 1];
                int i768 = i767 - 1;
                this.AudioAttributesCompatParcelizer = i768;
                iArr429[i767 - 2] = iArr429[i768] | iArr429[i767 - 2];
                iArr429[i767 - 2] = -iArr429[i767 - 2];
                return 0;
            case 491:
                int[] iArr430 = this.AudioAttributesImplBaseParcelizer;
                int i769 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i769 + 1;
                iArr430[i769] = 17;
                return 0;
            case 492:
                int[] iArr431 = this.AudioAttributesImplBaseParcelizer;
                int i770 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i770 + 1;
                iArr431[i770] = 123;
                iArr431[i770] = -iArr431[i770];
                return 0;
            case UnixStat.DEFAULT_DIR_PERM /* 493 */:
                int i771 = this.AudioAttributesCompatParcelizer;
                int[] iArr432 = this.AudioAttributesImplBaseParcelizer;
                iArr432[i771 - 2] = iArr432[i771 - 1] & iArr432[i771 - 2];
                iArr432[i771 - 3] = iArr432[i771 - 2] | iArr432[i771 - 3];
                int i772 = i771 - 3;
                this.AudioAttributesCompatParcelizer = i772;
                iArr432[i771 - 4] = iArr432[i771 - 4] - iArr432[i772];
                return 0;
            case 494:
                int[] iArr433 = this.AudioAttributesImplBaseParcelizer;
                int i773 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i773 + 1;
                iArr433[i773] = 63;
                return 0;
            case 495:
                int[] iArr434 = this.AudioAttributesImplBaseParcelizer;
                int i774 = this.AudioAttributesCompatParcelizer;
                iArr434[i774] = 111;
                iArr434[i774 + 1] = iArr434[i774];
                this.AudioAttributesCompatParcelizer = i774 + 3;
                iArr434[i774 + 2] = -1;
                return 0;
            case 496:
                int i775 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i775 - 1] = null;
                int i776 = i775 - 2;
                this.AudioAttributesCompatParcelizer = i776;
                int[] iArr435 = this.AudioAttributesImplBaseParcelizer;
                iArr435[i775 - 3] = iArr435[i775 - 3] - iArr435[i776];
                return 0;
            case 497:
                int[] iArr436 = this.AudioAttributesImplBaseParcelizer;
                int i777 = this.AudioAttributesCompatParcelizer;
                iArr436[i777 - 1] = -iArr436[i777 - 1];
                this.AudioAttributesCompatParcelizer = i777 + 1;
                iArr436[i777] = iArr436[i777 - 1];
                iArr436[i777] = -iArr436[i777];
                return 0;
            case 498:
                int[] iArr437 = this.AudioAttributesImplBaseParcelizer;
                int i778 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i778 + 1;
                iArr437[i778] = 42;
                return 0;
            case 499:
                int[] iArr438 = this.AudioAttributesImplBaseParcelizer;
                int i779 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i779 + 1;
                iArr438[i779] = 11;
                return 0;
            case 500:
                int[] iArr439 = this.AudioAttributesImplBaseParcelizer;
                int i780 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i780 + 1;
                iArr439[i780] = 76;
                return 0;
            case 501:
                int i781 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i781;
                Object[] objArr63 = this.MediaBrowserCompatMediaItem;
                Object obj36 = objArr63[i781];
                objArr63[i781] = null;
                objArr63[35] = obj36;
                return 0;
            case 502:
                int i782 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i782;
                Object[] objArr64 = this.MediaBrowserCompatMediaItem;
                Object obj37 = objArr64[i782];
                objArr64[i782] = null;
                objArr64[23] = obj37;
                return 0;
            case 503:
                int i783 = this.AudioAttributesCompatParcelizer;
                int i784 = i783 - 2;
                this.AudioAttributesCompatParcelizer = i784;
                int[] iArr440 = this.AudioAttributesImplBaseParcelizer;
                this.write = iArr440[i784] == iArr440[i783 - 1] ? 0 : 1;
                return 0;
            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                int[] iArr441 = this.AudioAttributesImplBaseParcelizer;
                int i785 = this.AudioAttributesCompatParcelizer;
                iArr441[i785] = iArr441[19];
                this.AudioAttributesCompatParcelizer = i785 + 2;
                iArr441[i785 + 1] = 2;
                return 0;
            case 505:
                int i786 = this.AudioAttributesCompatParcelizer;
                int i787 = i786 - 1;
                Object[] objArr65 = this.MediaBrowserCompatMediaItem;
                Object obj38 = objArr65[i787];
                objArr65[i787] = null;
                objArr65[16] = obj38;
                this.AudioAttributesCompatParcelizer = i786;
                objArr65[i787] = objArr65[20];
                return 0;
            case 506:
                Object[] objArr66 = this.MediaBrowserCompatMediaItem;
                int i788 = this.AudioAttributesCompatParcelizer;
                objArr66[i788] = objArr66[16];
                this.AudioAttributesCompatParcelizer = i788;
                Object obj39 = objArr66[i788];
                objArr66[i788] = null;
                objArr66[17] = obj39;
                return 0;
            case 507:
                int i789 = this.AudioAttributesCompatParcelizer;
                int i790 = i789 - 1;
                Object[] objArr67 = this.MediaBrowserCompatMediaItem;
                Object obj40 = objArr67[i790];
                objArr67[i790] = null;
                objArr67[18] = obj40;
                this.AudioAttributesCompatParcelizer = i789;
                objArr67[i790] = objArr67[20];
                return 0;
            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                int i791 = this.AudioAttributesCompatParcelizer;
                int i792 = i791 - 1;
                Object[] objArr68 = this.MediaBrowserCompatMediaItem;
                Object obj41 = objArr68[i792];
                objArr68[i792] = null;
                objArr68[17] = obj41;
                this.AudioAttributesCompatParcelizer = i791;
                objArr68[i792] = objArr68[21];
                return 0;
            case 509:
                Object[] objArr69 = this.MediaBrowserCompatMediaItem;
                int i793 = this.AudioAttributesCompatParcelizer;
                objArr69[i793] = objArr69[20];
                this.AudioAttributesCompatParcelizer = i793 + 2;
                objArr69[i793 + 1] = objArr69[17];
                return 0;
            case 510:
                Object[] objArr70 = this.MediaBrowserCompatMediaItem;
                int i794 = this.AudioAttributesCompatParcelizer;
                objArr70[i794] = objArr70[20];
                int[] iArr442 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i794 + 2;
                iArr442[i794 + 1] = 0;
                return 0;
            case UnixStat.DEFAULT_LINK_PERM /* 511 */:
                Object[] objArr71 = this.MediaBrowserCompatMediaItem;
                int i795 = this.AudioAttributesCompatParcelizer;
                objArr71[i795] = objArr71[21];
                this.AudioAttributesCompatParcelizer = i795 + 2;
                objArr71[i795 + 1] = null;
                return 0;
            case 512:
                Object[] objArr72 = this.MediaBrowserCompatMediaItem;
                int i796 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i796 + 1;
                objArr72[i796] = objArr72[23];
                return 0;
            case 513:
                int i797 = this.AudioAttributesCompatParcelizer;
                int i798 = i797 - 2;
                this.AudioAttributesCompatParcelizer = i798;
                Object[] objArr73 = this.MediaBrowserCompatMediaItem;
                Object obj42 = objArr73[i798];
                objArr73[i798] = null;
                Object obj43 = objArr73[i797 - 1];
                objArr73[i797 - 1] = null;
                this.write = obj42 == obj43 ? 0 : 1;
                return 0;
            case 514:
                int[] iArr443 = this.AudioAttributesImplBaseParcelizer;
                int i799 = this.AudioAttributesCompatParcelizer;
                iArr443[i799] = 0;
                iArr443[19] = iArr443[i799];
                Object[] objArr74 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = i799 + 1;
                objArr74[i799] = objArr74[17];
                return 0;
            case 515:
                int i800 = this.AudioAttributesCompatParcelizer;
                int i801 = i800 - 1;
                Object[] objArr75 = this.MediaBrowserCompatMediaItem;
                Object obj44 = objArr75[i801];
                objArr75[i801] = null;
                objArr75[18] = obj44;
                this.AudioAttributesCompatParcelizer = i800;
                objArr75[i801] = objArr75[16];
                return 0;
            case 516:
                Object[] objArr76 = this.MediaBrowserCompatMediaItem;
                int i802 = this.AudioAttributesCompatParcelizer;
                objArr76[i802] = objArr76[15];
                this.AudioAttributesCompatParcelizer = i802 + 2;
                objArr76[i802 + 1] = objArr76[i802];
                return 0;
            case 517:
                int i803 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i803;
                int[] iArr444 = this.AudioAttributesImplBaseParcelizer;
                iArr444[25] = iArr444[i803];
                return 0;
            case 518:
                int[] iArr445 = this.AudioAttributesImplBaseParcelizer;
                int i804 = this.AudioAttributesCompatParcelizer;
                iArr445[i804] = iArr445[26];
                this.AudioAttributesCompatParcelizer = i804;
                iArr445[i804 - 1] = iArr445[i804 - 1] * iArr445[i804];
                iArr445[i804 - 1] = -iArr445[i804 - 1];
                return 0;
            case 519:
                int i805 = this.AudioAttributesCompatParcelizer;
                int i806 = i805 - 1;
                int[] iArr446 = this.AudioAttributesImplBaseParcelizer;
                iArr446[i805 - 2] = iArr446[i805 - 2] | iArr446[i806];
                this.AudioAttributesCompatParcelizer = i805;
                iArr446[i806] = iArr446[25];
                return 0;
            case 520:
                int[] iArr447 = this.AudioAttributesImplBaseParcelizer;
                int i807 = this.AudioAttributesCompatParcelizer;
                iArr447[i807] = iArr447[27];
                iArr447[i807 + 2] = iArr447[i807];
                iArr447[i807 + 1] = iArr447[i807 - 1];
                this.AudioAttributesCompatParcelizer = i807 + 5;
                iArr447[i807 + 4] = iArr447[i807 + 2];
                iArr447[i807 + 3] = iArr447[i807 + 1];
                return 0;
            case 521:
                int i808 = this.AudioAttributesCompatParcelizer;
                int[] iArr448 = this.AudioAttributesImplBaseParcelizer;
                iArr448[i808 - 2] = iArr448[i808 - 1] & iArr448[i808 - 2];
                int i809 = i808 - 2;
                iArr448[i808 - 3] = iArr448[i808 - 3] | iArr448[i809];
                this.AudioAttributesCompatParcelizer = i808 - 1;
                iArr448[i809] = iArr448[26];
                return 0;
            case 522:
                int i810 = this.AudioAttributesCompatParcelizer;
                int i811 = i810 - 1;
                int[] iArr449 = this.AudioAttributesImplBaseParcelizer;
                iArr449[i810 - 2] = iArr449[i810 - 2] + iArr449[i811];
                this.AudioAttributesCompatParcelizer = i810;
                iArr449[i811] = 1;
                iArr449[i810 - 1] = -iArr449[i810 - 1];
                return 0;
            case 523:
                int i812 = this.AudioAttributesCompatParcelizer;
                int[] iArr450 = this.AudioAttributesImplBaseParcelizer;
                iArr450[i812 - 2] = iArr450[i812 - 1] | iArr450[i812 - 2];
                int i813 = i812 - 2;
                this.AudioAttributesCompatParcelizer = i813;
                iArr450[i812 - 3] = iArr450[i812 - 3] | iArr450[i813];
                return 0;
            case 524:
                int i814 = this.AudioAttributesCompatParcelizer;
                int[] iArr451 = this.AudioAttributesImplBaseParcelizer;
                iArr451[i814 - 2] = iArr451[i814 - 2] * iArr451[i814 - 1];
                int i815 = i814 - 2;
                this.AudioAttributesCompatParcelizer = i815;
                iArr451[i814 - 3] = iArr451[i814 - 3] + iArr451[i815];
                return 0;
            case 525:
                int[] iArr452 = this.AudioAttributesImplBaseParcelizer;
                int i816 = this.AudioAttributesCompatParcelizer;
                iArr452[i816] = iArr452[25];
                this.AudioAttributesCompatParcelizer = i816 + 2;
                iArr452[i816 + 1] = iArr452[26];
                return 0;
            case 526:
                int i817 = this.AudioAttributesCompatParcelizer;
                int[] iArr453 = this.AudioAttributesImplBaseParcelizer;
                iArr453[i817 - 2] = iArr453[i817 - 1] & iArr453[i817 - 2];
                int i818 = i817 - 2;
                iArr453[i817 - 3] = iArr453[i817 - 3] | iArr453[i818];
                this.AudioAttributesCompatParcelizer = i817 - 1;
                iArr453[i818] = iArr453[27];
                return 0;
            case 527:
                int i819 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i819;
                Object[] objArr77 = this.MediaBrowserCompatMediaItem;
                Object obj45 = objArr77[i819];
                objArr77[i819] = null;
                objArr77[22] = obj45;
                return 0;
            case 528:
                int i820 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i820;
                Object[] objArr78 = this.MediaBrowserCompatMediaItem;
                Object obj46 = objArr78[i820];
                objArr78[i820] = null;
                this.write = obj46 == null ? 0 : 1;
                return 0;
            case 529:
                Object[] objArr79 = this.MediaBrowserCompatMediaItem;
                int i821 = this.AudioAttributesCompatParcelizer;
                objArr79[i821] = null;
                this.AudioAttributesCompatParcelizer = i821;
                Object obj47 = objArr79[i821];
                objArr79[i821] = null;
                objArr79[21] = obj47;
                return 0;
            case 530:
                this.MediaBrowserCompatMediaItem[24] = this.RemoteActionCompatParcelizer;
                return 0;
            case 531:
                Object[] objArr80 = this.MediaBrowserCompatMediaItem;
                int i822 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i822 + 1;
                objArr80[i822] = objArr80[24];
                return 0;
            case 532:
                Object[] objArr81 = this.MediaBrowserCompatMediaItem;
                int i823 = this.AudioAttributesCompatParcelizer;
                objArr81[i823] = objArr81[22];
                this.AudioAttributesCompatParcelizer = i823 + 2;
                objArr81[i823 + 1] = objArr81[24];
                return 0;
            case 533:
                Object[] objArr82 = this.MediaBrowserCompatMediaItem;
                int i824 = this.AudioAttributesCompatParcelizer;
                objArr82[i824] = objArr82[22];
                this.AudioAttributesCompatParcelizer = i824;
                Object obj48 = objArr82[i824];
                objArr82[i824] = null;
                objArr82[21] = obj48;
                return 0;
            case 534:
                int i825 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i825;
                Object[] objArr83 = this.MediaBrowserCompatMediaItem;
                Object obj49 = objArr83[i825];
                objArr83[i825] = null;
                objArr83[24] = obj49;
                return 0;
            case 535:
                Object[] objArr84 = this.MediaBrowserCompatMediaItem;
                int i826 = this.AudioAttributesCompatParcelizer;
                objArr84[i826] = objArr84[20];
                int[] iArr454 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i826 + 2;
                iArr454[i826 + 1] = 2;
                return 0;
            case 536:
                Object[] objArr85 = this.MediaBrowserCompatMediaItem;
                int i827 = this.AudioAttributesCompatParcelizer;
                objArr85[i827] = objArr85[22];
                this.AudioAttributesCompatParcelizer = i827 + 2;
                objArr85[i827 + 1] = objArr85[21];
                return 0;
            case 537:
                Object[] objArr86 = this.MediaBrowserCompatMediaItem;
                int i828 = this.AudioAttributesCompatParcelizer;
                objArr86[i828] = objArr86[20];
                int[] iArr455 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i828 + 2;
                iArr455[i828 + 1] = 4;
                return 0;
            case 538:
                Object[] objArr87 = this.MediaBrowserCompatMediaItem;
                int i829 = this.AudioAttributesCompatParcelizer;
                objArr87[i829] = objArr87[17];
                this.AudioAttributesCompatParcelizer = i829;
                Object obj50 = objArr87[i829];
                objArr87[i829] = null;
                objArr87[18] = obj50;
                return 0;
            case 539:
                Object[] objArr88 = this.MediaBrowserCompatMediaItem;
                int i830 = this.AudioAttributesCompatParcelizer;
                objArr88[i830] = objArr88[20];
                this.AudioAttributesCompatParcelizer = i830 + 2;
                objArr88[i830 + 1] = objArr88[16];
                return 0;
            case 540:
                Object[] objArr89 = this.MediaBrowserCompatMediaItem;
                int i831 = this.AudioAttributesCompatParcelizer;
                objArr89[i831] = objArr89[20];
                int[] iArr456 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i831 + 2;
                iArr456[i831 + 1] = 3;
                return 0;
            case 541:
                Object[] objArr90 = this.MediaBrowserCompatMediaItem;
                int i832 = this.AudioAttributesCompatParcelizer;
                objArr90[i832] = objArr90[18];
                this.AudioAttributesCompatParcelizer = i832 + 2;
                objArr90[i832 + 1] = objArr90[22];
                return 0;
            case 542:
                Object[] objArr91 = this.MediaBrowserCompatMediaItem;
                int i833 = this.AudioAttributesCompatParcelizer;
                objArr91[i833] = null;
                this.AudioAttributesCompatParcelizer = i833 + 2;
                objArr91[i833 + 1] = objArr91[20];
                return 0;
            case 543:
                Object[] objArr92 = this.MediaBrowserCompatMediaItem;
                int i834 = this.AudioAttributesCompatParcelizer;
                objArr92[i834] = objArr92[20];
                Object obj51 = objArr92[i834];
                objArr92[i834] = null;
                objArr92[18] = obj51;
                this.AudioAttributesCompatParcelizer = i834 + 1;
                objArr92[i834] = objArr92[20];
                return 0;
            case 544:
                int i835 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i835 - 1] = null;
                int[] iArr457 = this.AudioAttributesImplBaseParcelizer;
                iArr457[i835 - 3] = iArr457[i835 - 2] | iArr457[i835 - 3];
                int i836 = i835 - 3;
                this.AudioAttributesCompatParcelizer = i836;
                iArr457[i835 - 4] = iArr457[i835 - 4] + iArr457[i836];
                return 0;
            case 545:
                int[] iArr458 = this.AudioAttributesImplBaseParcelizer;
                int i837 = this.AudioAttributesCompatParcelizer;
                iArr458[i837] = 13;
                this.AudioAttributesCompatParcelizer = i837 + 3;
                iArr458[i837 + 2] = iArr458[i837];
                iArr458[i837 + 1] = iArr458[i837 - 1];
                return 0;
            case 546:
                int i838 = this.AudioAttributesCompatParcelizer;
                int[] iArr459 = this.AudioAttributesImplBaseParcelizer;
                iArr459[i838 - 2] = iArr459[i838 - 1] & iArr459[i838 - 2];
                int i839 = i838 - 2;
                this.AudioAttributesCompatParcelizer = i839;
                iArr459[i838 - 3] = iArr459[i839] | iArr459[i838 - 3];
                iArr459[i838 - 3] = -iArr459[i838 - 3];
                return 0;
            case 547:
                int[] iArr460 = this.AudioAttributesImplBaseParcelizer;
                int i840 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i840 + 1;
                iArr460[i840] = 87;
                return 0;
            case 548:
                int i841 = this.AudioAttributesCompatParcelizer;
                int i842 = i841 - 1;
                int[] iArr461 = this.AudioAttributesImplBaseParcelizer;
                iArr461[i841 - 2] = iArr461[i841 - 2] + iArr461[i842];
                iArr461[i842] = 1;
                this.AudioAttributesCompatParcelizer = i841 + 2;
                iArr461[i841 + 1] = iArr461[i841 - 1];
                iArr461[i841] = iArr461[i841 - 2];
                return 0;
            case 549:
                int[] iArr462 = this.AudioAttributesImplBaseParcelizer;
                int i843 = this.AudioAttributesCompatParcelizer;
                iArr462[i843] = 57;
                iArr462[i843] = -iArr462[i843];
                this.AudioAttributesCompatParcelizer = i843 + 3;
                iArr462[i843 + 2] = iArr462[i843];
                iArr462[i843 + 1] = iArr462[i843 - 1];
                return 0;
            case 550:
                int[] iArr463 = this.AudioAttributesImplBaseParcelizer;
                int i844 = this.AudioAttributesCompatParcelizer;
                iArr463[i844] = 3;
                iArr463[i844] = -iArr463[i844];
                this.AudioAttributesCompatParcelizer = i844 + 3;
                iArr463[i844 + 2] = iArr463[i844];
                iArr463[i844 + 1] = iArr463[i844 - 1];
                return 0;
            case 551:
                int[] iArr464 = this.AudioAttributesImplBaseParcelizer;
                int i845 = this.AudioAttributesCompatParcelizer;
                iArr464[i845] = 45;
                this.AudioAttributesCompatParcelizer = i845 + 3;
                iArr464[i845 + 2] = iArr464[i845];
                iArr464[i845 + 1] = iArr464[i845 - 1];
                return 0;
            case 552:
                int[] iArr465 = this.AudioAttributesImplBaseParcelizer;
                int i846 = this.AudioAttributesCompatParcelizer;
                iArr465[i846 + 1] = iArr465[i846 - 1];
                iArr465[i846] = iArr465[i846 - 2];
                int i847 = i846 + 1;
                iArr465[i846] = iArr465[i846] | iArr465[i847];
                this.AudioAttributesCompatParcelizer = i846 + 2;
                iArr465[i847] = 1;
                return 0;
            case 553:
                int[] iArr466 = this.AudioAttributesImplBaseParcelizer;
                int i848 = this.AudioAttributesCompatParcelizer;
                iArr466[i848 - 1] = -iArr466[i848 - 1];
                int i849 = i848 - 1;
                iArr466[i848 - 2] = iArr466[i848 - 2] | iArr466[i849];
                this.AudioAttributesCompatParcelizer = i848 + 1;
                iArr466[i848] = iArr466[i848 - 2];
                iArr466[i849] = iArr466[i848 - 3];
                return 0;
            case RtspMessageChannel.DEFAULT_RTSP_PORT /* 554 */:
                int[] iArr467 = this.AudioAttributesImplBaseParcelizer;
                int i850 = this.AudioAttributesCompatParcelizer;
                iArr467[i850] = 49;
                iArr467[i850 + 2] = iArr467[i850];
                iArr467[i850 + 1] = iArr467[i850 - 1];
                int i851 = i850 + 2;
                this.AudioAttributesCompatParcelizer = i851;
                iArr467[i850 + 1] = iArr467[i850 + 1] & iArr467[i851];
                return 0;
            case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                int[] iArr468 = this.AudioAttributesImplBaseParcelizer;
                int i852 = this.AudioAttributesCompatParcelizer;
                iArr468[i852] = iArr468[19];
                this.AudioAttributesCompatParcelizer = i852 + 2;
                iArr468[i852 + 1] = 4;
                return 0;
            case 556:
                int[] iArr469 = this.AudioAttributesImplBaseParcelizer;
                int i853 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i853 + 1;
                iArr469[i853] = 81;
                return 0;
            case 557:
                int[] iArr470 = this.AudioAttributesImplBaseParcelizer;
                int i854 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i854 + 1;
                iArr470[i854] = 105;
                return 0;
            case 558:
                int i855 = this.AudioAttributesCompatParcelizer;
                int i856 = i855 - 1;
                int[] iArr471 = this.AudioAttributesImplBaseParcelizer;
                iArr471[i855 - 2] = iArr471[i855 - 2] | iArr471[i856];
                iArr471[i855] = iArr471[i855 - 2];
                iArr471[i856] = iArr471[i855 - 3];
                this.AudioAttributesCompatParcelizer = i855 + 3;
                iArr471[i855 + 2] = iArr471[i855];
                iArr471[i855 + 1] = iArr471[i855 - 1];
                return 0;
            case 559:
                int i857 = this.AudioAttributesCompatParcelizer;
                int[] iArr472 = this.AudioAttributesImplBaseParcelizer;
                iArr472[i857 - 2] = iArr472[i857 - 1] | iArr472[i857 - 2];
                iArr472[i857 - 3] = iArr472[i857 - 3] >>> iArr472[i857 - 2];
                int i858 = i857 - 3;
                this.AudioAttributesCompatParcelizer = i858;
                iArr472[i857 - 4] = iArr472[i857 - 4] * iArr472[i858];
                return 0;
            case 560:
                int[] iArr473 = this.AudioAttributesImplBaseParcelizer;
                int i859 = this.AudioAttributesCompatParcelizer;
                iArr473[i859] = 101;
                iArr473[i859 + 2] = iArr473[i859];
                iArr473[i859 + 1] = iArr473[i859 - 1];
                int i860 = i859 + 2;
                this.AudioAttributesCompatParcelizer = i860;
                iArr473[i859 + 1] = iArr473[i859 + 1] | iArr473[i860];
                return 0;
            case 561:
                Object[] objArr93 = this.MediaBrowserCompatMediaItem;
                int i861 = this.AudioAttributesCompatParcelizer;
                objArr93[i861] = objArr93[24];
                this.AudioAttributesCompatParcelizer = i861 + 2;
                objArr93[i861 + 1] = objArr93[22];
                return 0;
            case 562:
                Object[] objArr94 = this.MediaBrowserCompatMediaItem;
                int i862 = this.AudioAttributesCompatParcelizer;
                objArr94[i862] = objArr94[24];
                objArr94[i862 + 1] = null;
                this.AudioAttributesCompatParcelizer = i862 + 3;
                objArr94[i862 + 2] = objArr94[20];
                return 0;
            case 563:
                int[] iArr474 = this.AudioAttributesImplBaseParcelizer;
                int i863 = this.AudioAttributesCompatParcelizer;
                iArr474[i863] = 55;
                this.AudioAttributesCompatParcelizer = i863 + 3;
                iArr474[i863 + 2] = iArr474[i863];
                iArr474[i863 + 1] = iArr474[i863 - 1];
                return 0;
            case 564:
                int i864 = this.AudioAttributesCompatParcelizer;
                int i865 = i864 - 1;
                this.AudioAttributesCompatParcelizer = i865;
                int[] iArr475 = this.AudioAttributesImplBaseParcelizer;
                iArr475[i864 - 2] = iArr475[i864 - 2] >>> iArr475[i865];
                return 0;
            case 565:
                int i866 = this.AudioAttributesCompatParcelizer;
                int i867 = i866 - 1;
                this.AudioAttributesCompatParcelizer = i867;
                int[] iArr476 = this.AudioAttributesImplBaseParcelizer;
                iArr476[i866 - 2] = iArr476[i866 - 2] / iArr476[i867];
                return 0;
            case 566:
                int[] iArr477 = this.AudioAttributesImplBaseParcelizer;
                int i868 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i868 + 1;
                iArr477[i868] = 45;
                iArr477[i868] = -iArr477[i868];
                return 0;
            case 567:
                int[] iArr478 = this.AudioAttributesImplBaseParcelizer;
                int i869 = this.AudioAttributesCompatParcelizer;
                iArr478[i869] = 123;
                iArr478[i869] = -iArr478[i869];
                this.AudioAttributesCompatParcelizer = i869 + 2;
                iArr478[i869 + 1] = iArr478[i869];
                return 0;
            case 568:
                int[] iArr479 = this.AudioAttributesImplBaseParcelizer;
                int i870 = this.AudioAttributesCompatParcelizer;
                iArr479[i870 - 1] = -iArr479[i870 - 1];
                iArr479[i870] = -1;
                this.AudioAttributesCompatParcelizer = i870 + 3;
                iArr479[i870 + 2] = iArr479[i870];
                iArr479[i870 + 1] = iArr479[i870 - 1];
                return 0;
            case 569:
                int[] iArr480 = this.AudioAttributesImplBaseParcelizer;
                int i871 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i871 + 1;
                iArr480[i871] = 71;
                return 0;
            case 570:
                int[] iArr481 = this.AudioAttributesImplBaseParcelizer;
                int i872 = this.AudioAttributesCompatParcelizer;
                iArr481[i872 + 1] = iArr481[i872 - 1];
                iArr481[i872] = iArr481[i872 - 2];
                iArr481[i872 + 1] = -iArr481[i872 + 1];
                int i873 = i872 + 1;
                this.AudioAttributesCompatParcelizer = i873;
                iArr481[i872] = iArr481[i872] | iArr481[i873];
                return 0;
            case 571:
                int[] iArr482 = this.AudioAttributesImplBaseParcelizer;
                int i874 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i874 + 1;
                iArr482[i874] = 1;
                return 0;
            case 572:
                int i875 = this.AudioAttributesCompatParcelizer;
                int[] iArr483 = this.AudioAttributesImplBaseParcelizer;
                iArr483[i875 - 2] = iArr483[i875 - 1] | iArr483[i875 - 2];
                int i876 = i875 - 2;
                iArr483[i875 - 3] = iArr483[i875 - 3] + iArr483[i876];
                this.AudioAttributesCompatParcelizer = i875 - 1;
                iArr483[i876] = 1;
                return 0;
            case 573:
                int[] iArr484 = this.AudioAttributesImplBaseParcelizer;
                int i877 = this.AudioAttributesCompatParcelizer;
                iArr484[i877] = 43;
                iArr484[i877 + 1] = iArr484[i877];
                this.AudioAttributesCompatParcelizer = i877 + 3;
                iArr484[i877 + 2] = -1;
                return 0;
            case 574:
                int[] iArr485 = this.AudioAttributesImplBaseParcelizer;
                int i878 = this.AudioAttributesCompatParcelizer;
                iArr485[i878] = 4;
                this.AudioAttributesCompatParcelizer = i878 + 2;
                iArr485[i878 + 1] = 3;
                return 0;
            case 575:
                int i879 = this.AudioAttributesCompatParcelizer;
                int[] iArr486 = this.AudioAttributesImplBaseParcelizer;
                iArr486[i879 - 2] = iArr486[i879 - 2] >>> iArr486[i879 - 1];
                int i880 = i879 - 2;
                this.AudioAttributesCompatParcelizer = i880;
                this.MediaBrowserCompatMediaItem[i880] = null;
                return 0;
            case 576:
                int[] iArr487 = this.AudioAttributesImplBaseParcelizer;
                int i881 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i881 + 1;
                iArr487[i881] = 93;
                return 0;
            case 577:
                int[] iArr488 = this.AudioAttributesImplBaseParcelizer;
                int i882 = this.AudioAttributesCompatParcelizer;
                iArr488[i882] = 88;
                this.AudioAttributesCompatParcelizer = i882 + 2;
                iArr488[i882 + 1] = 0;
                return 0;
            case 578:
                int i883 = this.AudioAttributesCompatParcelizer;
                int[] iArr489 = this.AudioAttributesImplBaseParcelizer;
                iArr489[i883 - 2] = iArr489[i883 - 2] - iArr489[i883 - 1];
                int i884 = i883 - 2;
                this.AudioAttributesCompatParcelizer = i884;
                this.MediaBrowserCompatMediaItem[i884] = null;
                return 0;
            case 579:
                int[] iArr490 = this.AudioAttributesImplBaseParcelizer;
                int i885 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i885 + 1;
                iArr490[i885] = 95;
                return 0;
            case 580:
                int[] iArr491 = this.AudioAttributesImplBaseParcelizer;
                int i886 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i886 + 1;
                iArr491[i886] = 1;
                iArr491[i886] = -iArr491[i886];
                return 0;
            case 581:
                int[] iArr492 = this.AudioAttributesImplBaseParcelizer;
                int i887 = this.AudioAttributesCompatParcelizer;
                iArr492[i887] = 5;
                iArr492[i887] = -iArr492[i887];
                this.AudioAttributesCompatParcelizer = i887 + 3;
                iArr492[i887 + 2] = iArr492[i887];
                iArr492[i887 + 1] = iArr492[i887 - 1];
                return 0;
            case 582:
                int[] iArr493 = this.AudioAttributesImplBaseParcelizer;
                int i888 = this.AudioAttributesCompatParcelizer;
                iArr493[i888] = 47;
                this.AudioAttributesCompatParcelizer = i888 + 2;
                iArr493[i888 + 1] = iArr493[i888];
                return 0;
            case 583:
                int[] iArr494 = this.AudioAttributesImplBaseParcelizer;
                int i889 = this.AudioAttributesCompatParcelizer;
                iArr494[i889] = 1;
                iArr494[i889] = -iArr494[i889];
                this.AudioAttributesCompatParcelizer = i889 + 2;
                iArr494[i889 + 1] = iArr494[i889];
                return 0;
            case 584:
                int i890 = this.AudioAttributesCompatParcelizer;
                int[] iArr495 = this.AudioAttributesImplBaseParcelizer;
                iArr495[i890 - 2] = iArr495[i890 - 2] << iArr495[i890 - 1];
                int i891 = i890 - 2;
                iArr495[i890 - 3] = iArr495[i890 - 3] + iArr495[i891];
                this.AudioAttributesCompatParcelizer = i890 - 1;
                iArr495[i891] = 1;
                return 0;
            case 585:
                int[] iArr496 = this.AudioAttributesImplBaseParcelizer;
                int i892 = this.AudioAttributesCompatParcelizer;
                iArr496[i892] = 99;
                iArr496[i892 + 2] = iArr496[i892];
                iArr496[i892 + 1] = iArr496[i892 - 1];
                this.AudioAttributesCompatParcelizer = i892 + 5;
                iArr496[i892 + 4] = iArr496[i892 + 2];
                iArr496[i892 + 3] = iArr496[i892 + 1];
                return 0;
            case 586:
                int i893 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i893;
                int[] iArr497 = this.AudioAttributesImplBaseParcelizer;
                iArr497[30] = iArr497[i893];
                return 0;
            case 587:
                int i894 = this.AudioAttributesCompatParcelizer;
                int[] iArr498 = this.AudioAttributesImplBaseParcelizer;
                iArr498[i894 - 2] = iArr498[i894 - 2] * iArr498[i894 - 1];
                int i895 = i894 - 2;
                this.AudioAttributesCompatParcelizer = i895;
                iArr498[29] = iArr498[i895];
                return 0;
            case 588:
                int[] iArr499 = this.AudioAttributesImplBaseParcelizer;
                int i896 = this.AudioAttributesCompatParcelizer;
                iArr499[i896] = iArr499[29];
                this.AudioAttributesCompatParcelizer = i896;
                iArr499[i896 - 1] = iArr499[i896 - 1] * iArr499[i896];
                return 0;
            case 589:
                int[] iArr500 = this.AudioAttributesImplBaseParcelizer;
                int i897 = this.AudioAttributesCompatParcelizer;
                iArr500[i897] = iArr500[28];
                this.AudioAttributesCompatParcelizer = i897 + 2;
                iArr500[i897 + 1] = iArr500[30];
                return 0;
            case 590:
                int i898 = this.AudioAttributesCompatParcelizer;
                int[] iArr501 = this.AudioAttributesImplBaseParcelizer;
                iArr501[i898 - 2] = iArr501[i898 - 1] & iArr501[i898 - 2];
                int i899 = i898 - 2;
                iArr501[i898 - 3] = iArr501[i898 - 3] & iArr501[i899];
                this.AudioAttributesCompatParcelizer = i898 - 1;
                int i900 = iArr501[i898 - 3];
                iArr501[i899] = i900;
                iArr501[i898 - 3] = iArr501[i898 - 4];
                iArr501[i898 - 4] = iArr501[i898 - 5];
                iArr501[i898 - 5] = i900;
                return 0;
            case 591:
                int[] iArr502 = this.AudioAttributesImplBaseParcelizer;
                int i901 = this.AudioAttributesCompatParcelizer;
                iArr502[i901] = iArr502[29];
                this.AudioAttributesCompatParcelizer = i901 + 2;
                iArr502[i901 + 1] = -1;
                return 0;
            case 592:
                int i902 = this.AudioAttributesCompatParcelizer;
                int i903 = i902 - 1;
                int[] iArr503 = this.AudioAttributesImplBaseParcelizer;
                iArr503[i902 - 2] = iArr503[i902 - 2] | iArr503[i903];
                iArr503[i903] = iArr503[28];
                int i904 = i902 - 1;
                this.AudioAttributesCompatParcelizer = i904;
                iArr503[i902 - 2] = iArr503[i902 - 2] | iArr503[i904];
                return 0;
            case 593:
                int i905 = this.AudioAttributesCompatParcelizer;
                int[] iArr504 = this.AudioAttributesImplBaseParcelizer;
                iArr504[i905 - 2] = iArr504[i905 - 1] & iArr504[i905 - 2];
                int i906 = i905 - 2;
                iArr504[i905 - 3] = iArr504[i905 - 3] | iArr504[i906];
                this.AudioAttributesCompatParcelizer = i905 - 1;
                iArr504[i906] = iArr504[30];
                return 0;
            case 594:
                int[] iArr505 = this.AudioAttributesImplBaseParcelizer;
                int i907 = this.AudioAttributesCompatParcelizer;
                iArr505[i907] = iArr505[28];
                iArr505[i907 + 2] = iArr505[i907];
                iArr505[i907 + 1] = iArr505[i907 - 1];
                int i908 = i907 + 2;
                this.AudioAttributesCompatParcelizer = i908;
                iArr505[i907 + 1] = iArr505[i907 + 1] ^ iArr505[i908];
                return 0;
            case 595:
                int i909 = this.AudioAttributesCompatParcelizer;
                int i910 = i909 - 1;
                int[] iArr506 = this.AudioAttributesImplBaseParcelizer;
                iArr506[i909 - 2] = iArr506[i909 - 2] & iArr506[i910];
                iArr506[i910] = -1;
                this.AudioAttributesCompatParcelizer = i909 + 2;
                iArr506[i909 + 1] = iArr506[i909 - 1];
                iArr506[i909] = iArr506[i909 - 2];
                return 0;
            case 596:
                int i911 = this.AudioAttributesCompatParcelizer;
                int i912 = i911 - 1;
                this.AudioAttributesCompatParcelizer = i912;
                int[] iArr507 = this.AudioAttributesImplBaseParcelizer;
                iArr507[i911 - 2] = iArr507[i911 - 2] * iArr507[i912];
                iArr507[i911 - 2] = -iArr507[i911 - 2];
                return 0;
            case 597:
                int i913 = this.AudioAttributesCompatParcelizer;
                int i914 = i913 - 1;
                int[] iArr508 = this.AudioAttributesImplBaseParcelizer;
                iArr508[i913 - 2] = iArr508[i913 - 2] & iArr508[i914];
                iArr508[i913] = iArr508[i913 - 2];
                iArr508[i914] = iArr508[i913 - 3];
                this.AudioAttributesCompatParcelizer = i913 + 3;
                iArr508[i913 + 2] = iArr508[i913];
                iArr508[i913 + 1] = iArr508[i913 - 1];
                return 0;
            case 598:
                int[] iArr509 = this.AudioAttributesImplBaseParcelizer;
                int i915 = this.AudioAttributesCompatParcelizer;
                iArr509[i915] = iArr509[29];
                iArr509[i915 + 2] = iArr509[i915];
                iArr509[i915 + 1] = iArr509[i915 - 1];
                this.AudioAttributesCompatParcelizer = i915 + 5;
                iArr509[i915 + 4] = iArr509[i915 + 2];
                iArr509[i915 + 3] = iArr509[i915 + 1];
                return 0;
            case 599:
                int i916 = this.AudioAttributesCompatParcelizer;
                int i917 = i916 - 1;
                int[] iArr510 = this.AudioAttributesImplBaseParcelizer;
                iArr510[i916 - 2] = iArr510[i916 - 2] | iArr510[i917];
                this.AudioAttributesCompatParcelizer = i916;
                iArr510[i917] = iArr510[30];
                return 0;
            case 600:
                Object[] objArr95 = this.MediaBrowserCompatMediaItem;
                int i918 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i918 + 1;
                objArr95[i918] = objArr95[35];
                return 0;
            case 601:
                int[] iArr511 = this.AudioAttributesImplBaseParcelizer;
                int i919 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i919 + 1;
                iArr511[i919] = iArr511[34];
                return 0;
            case 602:
                int i920 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i920;
                int[] iArr512 = this.AudioAttributesImplBaseParcelizer;
                iArr512[32] = iArr512[i920];
                return 0;
            case 603:
                int i921 = this.AudioAttributesCompatParcelizer;
                int i922 = i921 - 1;
                int[] iArr513 = this.AudioAttributesImplBaseParcelizer;
                iArr513[i921 - 2] = iArr513[i921 - 2] & iArr513[i922];
                this.AudioAttributesCompatParcelizer = i921;
                iArr513[i922] = iArr513[32];
                return 0;
            case 604:
                int i923 = this.AudioAttributesCompatParcelizer;
                int i924 = i923 - 1;
                int[] iArr514 = this.AudioAttributesImplBaseParcelizer;
                iArr514[i923 - 2] = iArr514[i923 - 2] & iArr514[i924];
                this.AudioAttributesCompatParcelizer = i923;
                iArr514[i924] = iArr514[33];
                return 0;
            case 605:
                int[] iArr515 = this.AudioAttributesImplBaseParcelizer;
                int i925 = this.AudioAttributesCompatParcelizer;
                iArr515[i925] = iArr515[31];
                iArr515[i925 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i925 + 4;
                iArr515[i925 + 3] = iArr515[i925 + 1];
                iArr515[i925 + 2] = iArr515[i925];
                return 0;
            case 606:
                int[] iArr516 = this.AudioAttributesImplBaseParcelizer;
                int i926 = this.AudioAttributesCompatParcelizer;
                iArr516[i926] = iArr516[32];
                this.AudioAttributesCompatParcelizer = i926 + 2;
                iArr516[i926 + 1] = -1;
                return 0;
            case 607:
                int i927 = this.AudioAttributesCompatParcelizer;
                int i928 = i927 - 1;
                int[] iArr517 = this.AudioAttributesImplBaseParcelizer;
                iArr517[i927 - 2] = iArr517[i927 - 2] | iArr517[i928];
                this.AudioAttributesCompatParcelizer = i927;
                iArr517[i928] = iArr517[33];
                return 0;
            case 608:
                int i929 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i929;
                int[] iArr518 = this.AudioAttributesImplBaseParcelizer;
                iArr518[42] = iArr518[i929];
                return 0;
            case 609:
                int[] iArr519 = this.AudioAttributesImplBaseParcelizer;
                int i930 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i930 + 1;
                iArr519[i930] = iArr519[42];
                return 0;
            case 610:
                int i931 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i931;
                int[] iArr520 = this.AudioAttributesImplBaseParcelizer;
                iArr520[38] = iArr520[i931];
                return 0;
            case 611:
                int i932 = this.AudioAttributesCompatParcelizer;
                int[] iArr521 = this.AudioAttributesImplBaseParcelizer;
                iArr521[i932 - 2] = iArr521[i932 - 2] * iArr521[i932 - 1];
                int i933 = i932 - 2;
                this.AudioAttributesCompatParcelizer = i933;
                iArr521[36] = iArr521[i933];
                return 0;
            case 612:
                int i934 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i934;
                int[] iArr522 = this.AudioAttributesImplBaseParcelizer;
                iArr522[37] = iArr522[i934];
                return 0;
            case 613:
                int[] iArr523 = this.AudioAttributesImplBaseParcelizer;
                int i935 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i935 + 1;
                iArr523[i935] = iArr523[36];
                return 0;
            case 614:
                int[] iArr524 = this.AudioAttributesImplBaseParcelizer;
                int i936 = this.AudioAttributesCompatParcelizer;
                iArr524[i936] = iArr524[37];
                this.AudioAttributesCompatParcelizer = i936;
                iArr524[i936 - 1] = iArr524[i936 - 1] * iArr524[i936];
                return 0;
            case 615:
                int i937 = this.AudioAttributesCompatParcelizer;
                int i938 = i937 - 1;
                int[] iArr525 = this.AudioAttributesImplBaseParcelizer;
                iArr525[i937 - 2] = iArr525[i937 - 2] + iArr525[i938];
                this.AudioAttributesCompatParcelizer = i937;
                iArr525[i938] = 1;
                return 0;
            case 616:
                int[] iArr526 = this.AudioAttributesImplBaseParcelizer;
                int i939 = this.AudioAttributesCompatParcelizer;
                iArr526[i939] = iArr526[36];
                iArr526[i939 + 1] = iArr526[38];
                this.AudioAttributesCompatParcelizer = i939 + 4;
                iArr526[i939 + 3] = iArr526[i939 + 1];
                iArr526[i939 + 2] = iArr526[i939];
                return 0;
            case 617:
                int i940 = this.AudioAttributesCompatParcelizer;
                int[] iArr527 = this.AudioAttributesImplBaseParcelizer;
                iArr527[i940 - 2] = iArr527[i940 - 1] | iArr527[i940 - 2];
                iArr527[i940 - 3] = iArr527[i940 - 2] & iArr527[i940 - 3];
                int i941 = i940 - 3;
                this.AudioAttributesCompatParcelizer = i941;
                iArr527[i940 - 4] = iArr527[i940 - 4] * iArr527[i941];
                return 0;
            case 618:
                int[] iArr528 = this.AudioAttributesImplBaseParcelizer;
                int i942 = this.AudioAttributesCompatParcelizer;
                iArr528[i942] = iArr528[37];
                iArr528[i942 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i942 + 4;
                iArr528[i942 + 3] = iArr528[i942 + 1];
                iArr528[i942 + 2] = iArr528[i942];
                return 0;
            case 619:
                int i943 = this.AudioAttributesCompatParcelizer;
                int[] iArr529 = this.AudioAttributesImplBaseParcelizer;
                iArr529[i943 - 2] = iArr529[i943 - 1] & iArr529[i943 - 2];
                int i944 = i943 - 2;
                iArr529[i943 - 3] = iArr529[i943 - 3] | iArr529[i944];
                this.AudioAttributesCompatParcelizer = i943 - 1;
                iArr529[i944] = iArr529[38];
                return 0;
            case 620:
                int i945 = this.AudioAttributesCompatParcelizer;
                int i946 = i945 - 1;
                int[] iArr530 = this.AudioAttributesImplBaseParcelizer;
                iArr530[i945 - 2] = iArr530[i945 - 2] | iArr530[i946];
                this.AudioAttributesCompatParcelizer = i945;
                iArr530[i946] = iArr530[i945 - 2];
                return 0;
            case 621:
                int[] iArr531 = this.AudioAttributesImplBaseParcelizer;
                int i947 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i947 + 1;
                iArr531[i947] = iArr531[37];
                return 0;
            case 622:
                int[] iArr532 = this.AudioAttributesImplBaseParcelizer;
                int i948 = this.AudioAttributesCompatParcelizer;
                iArr532[i948] = iArr532[38];
                this.AudioAttributesCompatParcelizer = i948 + 2;
                iArr532[i948 + 1] = -1;
                return 0;
            case 623:
                int i949 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i949;
                int[] iArr533 = this.AudioAttributesImplBaseParcelizer;
                iArr533[41] = iArr533[i949];
                return 0;
            case 624:
                int i950 = this.AudioAttributesCompatParcelizer;
                int[] iArr534 = this.AudioAttributesImplBaseParcelizer;
                iArr534[i950 - 2] = iArr534[i950 - 2] * iArr534[i950 - 1];
                int i951 = i950 - 2;
                this.AudioAttributesCompatParcelizer = i951;
                iArr534[39] = iArr534[i951];
                return 0;
            case 625:
                int i952 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i952;
                int[] iArr535 = this.AudioAttributesImplBaseParcelizer;
                iArr535[40] = iArr535[i952];
                return 0;
            case 626:
                int[] iArr536 = this.AudioAttributesImplBaseParcelizer;
                int i953 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i953 + 1;
                iArr536[i953] = iArr536[39];
                return 0;
            case 627:
                int[] iArr537 = this.AudioAttributesImplBaseParcelizer;
                int i954 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i954 + 1;
                iArr537[i954] = iArr537[40];
                return 0;
            case 628:
                int[] iArr538 = this.AudioAttributesImplBaseParcelizer;
                int i955 = this.AudioAttributesCompatParcelizer;
                iArr538[i955] = iArr538[40];
                iArr538[i955 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i955 + 4;
                iArr538[i955 + 3] = iArr538[i955 + 1];
                iArr538[i955 + 2] = iArr538[i955];
                return 0;
            case 629:
                int[] iArr539 = this.AudioAttributesImplBaseParcelizer;
                int i956 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i956 + 1;
                iArr539[i956] = iArr539[41];
                return 0;
            case 630:
                int[] iArr540 = this.AudioAttributesImplBaseParcelizer;
                int i957 = this.AudioAttributesCompatParcelizer;
                iArr540[i957] = iArr540[40];
                iArr540[i957 + 2] = iArr540[i957];
                iArr540[i957 + 1] = iArr540[i957 - 1];
                int i958 = i957 + 2;
                this.AudioAttributesCompatParcelizer = i958;
                iArr540[i957 + 1] = iArr540[i957 + 1] ^ iArr540[i958];
                return 0;
            case 631:
                int[] iArr541 = this.AudioAttributesImplBaseParcelizer;
                int i959 = this.AudioAttributesCompatParcelizer;
                iArr541[i959] = iArr541[39];
                this.AudioAttributesCompatParcelizer = i959 + 2;
                iArr541[i959 + 1] = -1;
                return 0;
            case 632:
                int i960 = this.AudioAttributesCompatParcelizer;
                int i961 = i960 - 1;
                int[] iArr542 = this.AudioAttributesImplBaseParcelizer;
                iArr542[i960 - 2] = iArr542[i960 - 2] | iArr542[i961];
                this.AudioAttributesCompatParcelizer = i960;
                iArr542[i961] = iArr542[40];
                return 0;
            case 633:
                int i962 = this.AudioAttributesCompatParcelizer;
                int i963 = i962 - 1;
                int[] iArr543 = this.AudioAttributesImplBaseParcelizer;
                iArr543[i962 - 2] = iArr543[i962 - 2] | iArr543[i963];
                this.AudioAttributesCompatParcelizer = i962;
                iArr543[i963] = iArr543[41];
                return 0;
            case 634:
                int[] iArr544 = this.AudioAttributesImplBaseParcelizer;
                int i964 = this.AudioAttributesCompatParcelizer;
                iArr544[i964] = iArr544[40];
                iArr544[i964 + 2] = iArr544[i964];
                iArr544[i964 + 1] = iArr544[i964 - 1];
                this.AudioAttributesCompatParcelizer = i964 + 5;
                iArr544[i964 + 4] = iArr544[i964 + 2];
                iArr544[i964 + 3] = iArr544[i964 + 1];
                return 0;
            case 635:
                int[] iArr545 = this.AudioAttributesImplBaseParcelizer;
                int i965 = this.AudioAttributesCompatParcelizer;
                iArr545[i965] = 117;
                this.AudioAttributesCompatParcelizer = i965 + 3;
                iArr545[i965 + 2] = iArr545[i965];
                iArr545[i965 + 1] = iArr545[i965 - 1];
                return 0;
            case 636:
                int[] iArr546 = this.AudioAttributesImplBaseParcelizer;
                int i966 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i966 + 1;
                iArr546[i966] = 103;
                iArr546[i966] = -iArr546[i966];
                return 0;
            case 637:
                Object[] objArr96 = this.MediaBrowserCompatMediaItem;
                int i967 = this.AudioAttributesCompatParcelizer;
                objArr96[i967] = objArr96[20];
                int[] iArr547 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i967 + 2;
                iArr547[i967 + 1] = iArr547[19];
                return 0;
            case 638:
                int[] iArr548 = this.AudioAttributesImplBaseParcelizer;
                int i968 = this.AudioAttributesCompatParcelizer;
                iArr548[i968] = 109;
                iArr548[i968 - 1] = iArr548[i968 - 1] + iArr548[i968];
                this.AudioAttributesCompatParcelizer = i968 + 1;
                iArr548[i968] = iArr548[i968 - 1];
                return 0;
            case 639:
                int i969 = this.AudioAttributesCompatParcelizer;
                int[] iArr549 = this.AudioAttributesImplBaseParcelizer;
                iArr549[i969 - 2] = iArr549[i969 - 1] | iArr549[i969 - 2];
                int i970 = i969 - 2;
                iArr549[i969 - 3] = iArr549[i969 - 3] - iArr549[i970];
                this.AudioAttributesCompatParcelizer = i969 - 1;
                iArr549[i970] = iArr549[i969 - 3];
                return 0;
            case 640:
                int[] iArr550 = this.AudioAttributesImplBaseParcelizer;
                int i971 = this.AudioAttributesCompatParcelizer;
                iArr550[i971] = 4;
                this.AudioAttributesCompatParcelizer = i971 + 3;
                iArr550[i971 + 2] = iArr550[i971];
                iArr550[i971 + 1] = iArr550[i971 - 1];
                return 0;
            case 641:
                int[] iArr551 = this.AudioAttributesImplBaseParcelizer;
                int i972 = this.AudioAttributesCompatParcelizer;
                iArr551[i972] = 105;
                this.AudioAttributesCompatParcelizer = i972 + 3;
                iArr551[i972 + 2] = iArr551[i972];
                iArr551[i972 + 1] = iArr551[i972 - 1];
                return 0;
            case 642:
                int[] iArr552 = this.AudioAttributesImplBaseParcelizer;
                int i973 = this.AudioAttributesCompatParcelizer;
                iArr552[i973] = 0;
                iArr552[25] = iArr552[i973];
                int i974 = i973 - 1;
                this.AudioAttributesCompatParcelizer = i974;
                iArr552[26] = iArr552[i974];
                return 0;
            case 643:
                int[] iArr553 = this.AudioAttributesImplBaseParcelizer;
                int i975 = this.AudioAttributesCompatParcelizer;
                iArr553[i975] = 5;
                this.AudioAttributesCompatParcelizer = i975 + 3;
                iArr553[i975 + 2] = iArr553[i975];
                iArr553[i975 + 1] = iArr553[i975 - 1];
                return 0;
            case 644:
                int i976 = this.AudioAttributesCompatParcelizer;
                int i977 = i976 - 1;
                this.AudioAttributesCompatParcelizer = i977;
                int[] iArr554 = this.AudioAttributesImplBaseParcelizer;
                iArr554[i976 - 2] = iArr554[i977] & iArr554[i976 - 2];
                iArr554[i976 - 2] = -iArr554[i976 - 2];
                return 0;
            case 645:
                int[] iArr555 = this.AudioAttributesImplBaseParcelizer;
                int i978 = this.AudioAttributesCompatParcelizer;
                iArr555[i978] = 1;
                iArr555[i978 - 1] = iArr555[i978 - 1] - iArr555[i978];
                int i979 = i978 - 1;
                this.AudioAttributesCompatParcelizer = i979;
                this.MediaBrowserCompatMediaItem[i979] = null;
                return 0;
            case 646:
                int i980 = this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatMediaItem[i980 - 1] = null;
                int[] iArr556 = this.AudioAttributesImplBaseParcelizer;
                iArr556[i980 - 2] = -iArr556[i980 - 2];
                int i981 = i980 - 2;
                this.AudioAttributesCompatParcelizer = i981;
                iArr556[i980 - 3] = iArr556[i980 - 3] | iArr556[i981];
                return 0;
            case 647:
                int[] iArr557 = this.AudioAttributesImplBaseParcelizer;
                int i982 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i982 + 1;
                iArr557[i982] = 25;
                iArr557[i982] = -iArr557[i982];
                return 0;
            case 648:
                int[] iArr558 = this.AudioAttributesImplBaseParcelizer;
                int i983 = this.AudioAttributesCompatParcelizer;
                iArr558[i983] = iArr558[i983 - 1];
                this.AudioAttributesCompatParcelizer = i983;
                iArr558[19] = iArr558[i983];
                return 0;
            case 649:
                int[] iArr559 = this.AudioAttributesImplBaseParcelizer;
                int i984 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i984 + 1;
                iArr559[i984] = 91;
                iArr559[i984] = -iArr559[i984];
                return 0;
            case 650:
                int[] iArr560 = this.AudioAttributesImplBaseParcelizer;
                int i985 = this.AudioAttributesCompatParcelizer;
                iArr560[i985] = 109;
                this.AudioAttributesCompatParcelizer = i985 + 3;
                iArr560[i985 + 2] = iArr560[i985];
                iArr560[i985 + 1] = iArr560[i985 - 1];
                return 0;
            case 651:
                int[] iArr561 = this.AudioAttributesImplBaseParcelizer;
                int i986 = this.AudioAttributesCompatParcelizer;
                iArr561[i986] = 5;
                this.AudioAttributesCompatParcelizer = i986 + 2;
                iArr561[i986 + 1] = 2;
                return 0;
            case 652:
                int[] iArr562 = this.AudioAttributesImplBaseParcelizer;
                int i987 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i987 + 1;
                iArr562[i987] = 115;
                iArr562[i987] = -iArr562[i987];
                return 0;
            case 653:
                int[] iArr563 = this.AudioAttributesImplBaseParcelizer;
                int i988 = this.AudioAttributesCompatParcelizer;
                iArr563[i988] = 27;
                this.AudioAttributesCompatParcelizer = i988 + 2;
                iArr563[i988 + 1] = 0;
                return 0;
            case 654:
                int[] iArr564 = this.AudioAttributesImplBaseParcelizer;
                int i989 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i989 + 1;
                iArr564[i989] = 20;
                return 0;
            case 655:
                int[] iArr565 = this.AudioAttributesImplBaseParcelizer;
                int i990 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i990 + 1;
                iArr565[i990] = 40;
                return 0;
            case 656:
                int[] iArr566 = this.AudioAttributesImplBaseParcelizer;
                int i991 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i991 + 1;
                iArr566[i991] = 54;
                return 0;
            case 657:
                int[] iArr567 = this.AudioAttributesImplBaseParcelizer;
                int i992 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i992 + 1;
                iArr567[i992] = 75;
                return 0;
            case 658:
                int[] iArr568 = this.AudioAttributesImplBaseParcelizer;
                int i993 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i993 + 1;
                iArr568[i993] = 56;
                return 0;
            case 659:
                int[] iArr569 = this.AudioAttributesImplBaseParcelizer;
                int i994 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i994 + 1;
                iArr569[i994] = 9;
                return 0;
            case 660:
                int[] iArr570 = this.AudioAttributesImplBaseParcelizer;
                int i995 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i995 + 1;
                iArr570[i995] = 16;
                return 0;
            case 661:
                int[] iArr571 = this.AudioAttributesImplBaseParcelizer;
                int i996 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i996 + 1;
                iArr571[i996] = 86;
                return 0;
            case 662:
                int[] iArr572 = this.AudioAttributesImplBaseParcelizer;
                int i997 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i997 + 1;
                iArr572[i997] = 98;
                return 0;
            case 663:
                int[] iArr573 = this.AudioAttributesImplBaseParcelizer;
                int i998 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i998 + 1;
                iArr573[i998] = 62;
                return 0;
            case 664:
                int[] iArr574 = this.AudioAttributesImplBaseParcelizer;
                int i999 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i999 + 1;
                iArr574[i999] = 47;
                return 0;
            case 665:
                int[] iArr575 = this.AudioAttributesImplBaseParcelizer;
                int i1000 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1000 + 1;
                iArr575[i1000] = 28;
                return 0;
            case 666:
                Object[] objArr97 = this.MediaBrowserCompatMediaItem;
                int i1001 = this.AudioAttributesCompatParcelizer;
                objArr97[i1001] = objArr97[15];
                this.AudioAttributesCompatParcelizer = i1001;
                Object obj52 = objArr97[i1001];
                objArr97[i1001] = null;
                objArr97[39] = obj52;
                return 0;
            case 667:
                int i1002 = this.AudioAttributesCompatParcelizer;
                int[] iArr576 = this.AudioAttributesImplBaseParcelizer;
                iArr576[i1002 - 2] = iArr576[i1002 - 1] & iArr576[i1002 - 2];
                iArr576[i1002 - 3] = iArr576[i1002 - 2] | iArr576[i1002 - 3];
                int i1003 = i1002 - 3;
                this.AudioAttributesCompatParcelizer = i1003;
                this.MediaBrowserCompatMediaItem[i1003] = null;
                return 0;
            case 668:
                Object[] objArr98 = this.MediaBrowserCompatMediaItem;
                int i1004 = this.AudioAttributesCompatParcelizer;
                objArr98[i1004] = objArr98[19];
                this.AudioAttributesCompatParcelizer = i1004 + 2;
                objArr98[i1004 + 1] = objArr98[i1004];
                return 0;
            case 669:
                int i1005 = this.AudioAttributesCompatParcelizer;
                int i1006 = i1005 - 1;
                Object[] objArr99 = this.MediaBrowserCompatMediaItem;
                Object obj53 = objArr99[i1006];
                objArr99[i1006] = null;
                objArr99[22] = obj53;
                this.AudioAttributesCompatParcelizer = i1005;
                objArr99[i1006] = objArr99[19];
                return 0;
            case 670:
                int i1007 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1007;
                int[] iArr577 = this.AudioAttributesImplBaseParcelizer;
                iArr577[18] = iArr577[i1007];
                return 0;
            case 671:
                int[] iArr578 = this.AudioAttributesImplBaseParcelizer;
                int i1008 = this.AudioAttributesCompatParcelizer;
                iArr578[i1008] = iArr578[18];
                this.AudioAttributesCompatParcelizer = i1008 + 2;
                iArr578[i1008 + 1] = 1;
                return 0;
            case 672:
                int[] iArr579 = this.AudioAttributesImplBaseParcelizer;
                int i1009 = this.AudioAttributesCompatParcelizer;
                iArr579[i1009] = iArr579[18];
                this.AudioAttributesCompatParcelizer = i1009 + 2;
                iArr579[i1009 + 1] = 2;
                return 0;
            case 673:
                int i1010 = this.AudioAttributesCompatParcelizer;
                int i1011 = i1010 - 1;
                Object[] objArr100 = this.MediaBrowserCompatMediaItem;
                Object obj54 = objArr100[i1011];
                objArr100[i1011] = null;
                objArr100[17] = obj54;
                this.AudioAttributesCompatParcelizer = i1010;
                objArr100[i1011] = objArr100[19];
                return 0;
            case 674:
                Object[] objArr101 = this.MediaBrowserCompatMediaItem;
                int i1012 = this.AudioAttributesCompatParcelizer;
                objArr101[i1012] = objArr101[17];
                this.AudioAttributesCompatParcelizer = i1012;
                Object obj55 = objArr101[i1012];
                objArr101[i1012] = null;
                objArr101[16] = obj55;
                return 0;
            case 675:
                int i1013 = this.AudioAttributesCompatParcelizer;
                int i1014 = i1013 - 1;
                Object[] objArr102 = this.MediaBrowserCompatMediaItem;
                Object obj56 = objArr102[i1014];
                objArr102[i1014] = null;
                objArr102[19] = obj56;
                objArr102[i1014] = objArr102[16];
                int i1015 = i1013 - 1;
                this.AudioAttributesCompatParcelizer = i1015;
                Object obj57 = objArr102[i1015];
                objArr102[i1015] = null;
                objArr102[17] = obj57;
                return 0;
            case 676:
                int i1016 = this.AudioAttributesCompatParcelizer;
                int i1017 = i1016 - 1;
                int[] iArr580 = this.AudioAttributesImplBaseParcelizer;
                iArr580[18] = iArr580[i1017];
                Object[] objArr103 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = i1016;
                objArr103[i1017] = objArr103[19];
                return 0;
            case 677:
                Object[] objArr104 = this.MediaBrowserCompatMediaItem;
                int i1018 = this.AudioAttributesCompatParcelizer;
                objArr104[i1018] = objArr104[19];
                this.AudioAttributesCompatParcelizer = i1018 + 2;
                objArr104[i1018 + 1] = objArr104[16];
                return 0;
            case 678:
                Object[] objArr105 = this.MediaBrowserCompatMediaItem;
                int i1019 = this.AudioAttributesCompatParcelizer;
                objArr105[i1019] = objArr105[19];
                this.AudioAttributesCompatParcelizer = i1019 + 2;
                objArr105[i1019 + 1] = objArr105[17];
                return 0;
            case 679:
                Object[] objArr106 = this.MediaBrowserCompatMediaItem;
                int i1020 = this.AudioAttributesCompatParcelizer;
                objArr106[i1020] = objArr106[19];
                int[] iArr581 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i1020 + 2;
                iArr581[i1020 + 1] = 1;
                return 0;
            case 680:
                Object[] objArr107 = this.MediaBrowserCompatMediaItem;
                int i1021 = this.AudioAttributesCompatParcelizer;
                objArr107[i1021] = objArr107[17];
                this.AudioAttributesCompatParcelizer = i1021 + 2;
                objArr107[i1021 + 1] = null;
                return 0;
            case 681:
                int[] iArr582 = this.AudioAttributesImplBaseParcelizer;
                int i1022 = this.AudioAttributesCompatParcelizer;
                iArr582[i1022] = 0;
                this.AudioAttributesCompatParcelizer = i1022;
                iArr582[18] = iArr582[i1022];
                return 0;
            case 682:
                int[] iArr583 = this.AudioAttributesImplBaseParcelizer;
                int i1023 = this.AudioAttributesCompatParcelizer;
                iArr583[i1023] = 1;
                this.AudioAttributesCompatParcelizer = i1023;
                iArr583[23] = iArr583[i1023];
                return 0;
            case 683:
                int i1024 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1024;
                int[] iArr584 = this.AudioAttributesImplBaseParcelizer;
                iArr584[24] = iArr584[i1024];
                return 0;
            case 684:
                int i1025 = this.AudioAttributesCompatParcelizer;
                int i1026 = i1025 - 1;
                int[] iArr585 = this.AudioAttributesImplBaseParcelizer;
                iArr585[i1025 - 2] = iArr585[i1025 - 2] | iArr585[i1026];
                this.AudioAttributesCompatParcelizer = i1025;
                iArr585[i1026] = iArr585[23];
                return 0;
            case 685:
                int[] iArr586 = this.AudioAttributesImplBaseParcelizer;
                int i1027 = this.AudioAttributesCompatParcelizer;
                iArr586[i1027] = iArr586[24];
                this.AudioAttributesCompatParcelizer = i1027 + 3;
                iArr586[i1027 + 2] = iArr586[i1027];
                iArr586[i1027 + 1] = iArr586[i1027 - 1];
                return 0;
            case 686:
                int[] iArr587 = this.AudioAttributesImplBaseParcelizer;
                int i1028 = this.AudioAttributesCompatParcelizer;
                iArr587[i1028] = iArr587[25];
                this.AudioAttributesCompatParcelizer = i1028 + 2;
                iArr587[i1028 + 1] = -1;
                return 0;
            case 687:
                Object[] objArr108 = this.MediaBrowserCompatMediaItem;
                int i1029 = this.AudioAttributesCompatParcelizer;
                objArr108[i1029] = objArr108[17];
                Object obj58 = objArr108[i1029];
                objArr108[i1029] = null;
                objArr108[16] = obj58;
                this.AudioAttributesCompatParcelizer = i1029 + 1;
                objArr108[i1029] = objArr108[19];
                return 0;
            case 688:
                this.MediaBrowserCompatMediaItem[21] = this.RemoteActionCompatParcelizer;
                return 0;
            case 689:
                Object[] objArr109 = this.MediaBrowserCompatMediaItem;
                int i1030 = this.AudioAttributesCompatParcelizer;
                objArr109[i1030] = objArr109[20];
                this.AudioAttributesCompatParcelizer = i1030 + 2;
                objArr109[i1030 + 1] = objArr109[21];
                return 0;
            case 690:
                this.MediaBrowserCompatMediaItem[20] = this.RemoteActionCompatParcelizer;
                return 0;
            case 691:
                Object[] objArr110 = this.MediaBrowserCompatMediaItem;
                int i1031 = this.AudioAttributesCompatParcelizer;
                objArr110[i1031] = objArr110[20];
                int[] iArr588 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i1031 + 2;
                iArr588[i1031 + 1] = 10;
                return 0;
            case 692:
                this.MediaBrowserCompatMediaItem[19] = this.RemoteActionCompatParcelizer;
                return 0;
            case 693:
                Object[] objArr111 = this.MediaBrowserCompatMediaItem;
                int i1032 = this.AudioAttributesCompatParcelizer;
                objArr111[i1032] = objArr111[19];
                this.AudioAttributesCompatParcelizer = i1032 + 2;
                objArr111[i1032 + 1] = objArr111[21];
                return 0;
            case 694:
                int[] iArr589 = this.AudioAttributesImplBaseParcelizer;
                int i1033 = this.AudioAttributesCompatParcelizer;
                iArr589[i1033] = 41;
                iArr589[i1033] = -iArr589[i1033];
                this.AudioAttributesCompatParcelizer = i1033 + 2;
                iArr589[i1033 + 1] = iArr589[i1033];
                return 0;
            case 695:
                int[] iArr590 = this.AudioAttributesImplBaseParcelizer;
                int i1034 = this.AudioAttributesCompatParcelizer;
                iArr590[i1034] = 123;
                iArr590[i1034 + 2] = iArr590[i1034];
                iArr590[i1034 + 1] = iArr590[i1034 - 1];
                this.AudioAttributesCompatParcelizer = i1034 + 5;
                iArr590[i1034 + 4] = iArr590[i1034 + 2];
                iArr590[i1034 + 3] = iArr590[i1034 + 1];
                return 0;
            case 696:
                int[] iArr591 = this.AudioAttributesImplBaseParcelizer;
                int i1035 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1035 + 1;
                iArr591[i1035] = 43;
                return 0;
            case 697:
                int[] iArr592 = this.AudioAttributesImplBaseParcelizer;
                int i1036 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1036 + 1;
                iArr592[i1036] = 5;
                return 0;
            case 698:
                int[] iArr593 = this.AudioAttributesImplBaseParcelizer;
                int i1037 = this.AudioAttributesCompatParcelizer;
                iArr593[i1037] = 15;
                iArr593[i1037 + 1] = 0;
                int i1038 = i1037 + 1;
                this.AudioAttributesCompatParcelizer = i1038;
                iArr593[i1037] = iArr593[i1037] / iArr593[i1038];
                return 0;
            case 699:
                int[] iArr594 = this.AudioAttributesImplBaseParcelizer;
                int i1039 = this.AudioAttributesCompatParcelizer;
                iArr594[i1039] = 11;
                iArr594[i1039 + 2] = iArr594[i1039];
                iArr594[i1039 + 1] = iArr594[i1039 - 1];
                int i1040 = i1039 + 2;
                this.AudioAttributesCompatParcelizer = i1040;
                iArr594[i1039 + 1] = iArr594[i1039 + 1] ^ iArr594[i1040];
                return 0;
            case 700:
                int[] iArr595 = this.AudioAttributesImplBaseParcelizer;
                int i1041 = this.AudioAttributesCompatParcelizer;
                iArr595[i1041] = 3;
                this.AudioAttributesCompatParcelizer = i1041;
                iArr595[i1041 - 1] = iArr595[i1041 - 1] >>> iArr595[i1041];
                return 0;
            case 701:
                int[] iArr596 = this.AudioAttributesImplBaseParcelizer;
                int i1042 = this.AudioAttributesCompatParcelizer;
                iArr596[i1042] = 23;
                iArr596[i1042] = -iArr596[i1042];
                this.AudioAttributesCompatParcelizer = i1042 + 3;
                iArr596[i1042 + 2] = iArr596[i1042];
                iArr596[i1042 + 1] = iArr596[i1042 - 1];
                return 0;
            case 702:
                int[] iArr597 = this.AudioAttributesImplBaseParcelizer;
                int i1043 = this.AudioAttributesCompatParcelizer;
                iArr597[i1043] = 103;
                iArr597[i1043 + 2] = iArr597[i1043];
                iArr597[i1043 + 1] = iArr597[i1043 - 1];
                int i1044 = i1043 + 2;
                this.AudioAttributesCompatParcelizer = i1044;
                iArr597[i1043 + 1] = iArr597[i1043 + 1] ^ iArr597[i1044];
                return 0;
            case 703:
                int[] iArr598 = this.AudioAttributesImplBaseParcelizer;
                int i1045 = this.AudioAttributesCompatParcelizer;
                iArr598[i1045] = 43;
                iArr598[i1045 + 2] = iArr598[i1045];
                iArr598[i1045 + 1] = iArr598[i1045 - 1];
                this.AudioAttributesCompatParcelizer = i1045 + 5;
                iArr598[i1045 + 4] = iArr598[i1045 + 2];
                iArr598[i1045 + 3] = iArr598[i1045 + 1];
                return 0;
            case 704:
                int[] iArr599 = this.AudioAttributesImplBaseParcelizer;
                int i1046 = this.AudioAttributesCompatParcelizer;
                iArr599[i1046] = 1;
                this.AudioAttributesCompatParcelizer = i1046 + 3;
                iArr599[i1046 + 2] = iArr599[i1046];
                iArr599[i1046 + 1] = iArr599[i1046 - 1];
                iArr599[i1046 + 2] = -iArr599[i1046 + 2];
                return 0;
            case 705:
                int i1047 = this.AudioAttributesCompatParcelizer;
                int[] iArr600 = this.AudioAttributesImplBaseParcelizer;
                iArr600[i1047 - 2] = iArr600[i1047 - 2] * iArr600[i1047 - 1];
                int i1048 = i1047 - 2;
                this.AudioAttributesCompatParcelizer = i1048;
                iArr600[26] = iArr600[i1048];
                return 0;
            case 706:
                int[] iArr601 = this.AudioAttributesImplBaseParcelizer;
                int i1049 = this.AudioAttributesCompatParcelizer;
                iArr601[i1049] = iArr601[27];
                this.AudioAttributesCompatParcelizer = i1049;
                iArr601[i1049 - 1] = iArr601[i1049 - 1] * iArr601[i1049];
                return 0;
            case 707:
                int i1050 = this.AudioAttributesCompatParcelizer;
                int[] iArr602 = this.AudioAttributesImplBaseParcelizer;
                iArr602[i1050 - 2] = iArr602[i1050 - 1] | iArr602[i1050 - 2];
                int i1051 = i1050 - 2;
                iArr602[i1050 - 3] = iArr602[i1050 - 3] & iArr602[i1051];
                this.AudioAttributesCompatParcelizer = i1050 - 1;
                iArr602[i1051] = iArr602[27];
                return 0;
            case 708:
                int i1052 = this.AudioAttributesCompatParcelizer;
                int i1053 = i1052 - 1;
                int[] iArr603 = this.AudioAttributesImplBaseParcelizer;
                iArr603[i1052 - 2] = iArr603[i1052 - 2] & iArr603[i1053];
                this.AudioAttributesCompatParcelizer = i1052;
                iArr603[i1053] = iArr603[26];
                return 0;
            case 709:
                int[] iArr604 = this.AudioAttributesImplBaseParcelizer;
                int i1054 = this.AudioAttributesCompatParcelizer;
                iArr604[i1054] = iArr604[27];
                this.AudioAttributesCompatParcelizer = i1054 + 3;
                iArr604[i1054 + 2] = iArr604[i1054];
                iArr604[i1054 + 1] = iArr604[i1054 - 1];
                return 0;
            case 710:
                int i1055 = this.AudioAttributesCompatParcelizer;
                int i1056 = i1055 - 1;
                int[] iArr605 = this.AudioAttributesImplBaseParcelizer;
                iArr605[i1055 - 2] = iArr605[i1055 - 2] | iArr605[i1056];
                iArr605[i1056] = iArr605[28];
                this.AudioAttributesCompatParcelizer = i1055 + 1;
                iArr605[i1055] = -1;
                return 0;
            case 711:
                int i1057 = this.AudioAttributesCompatParcelizer;
                int i1058 = i1057 - 1;
                int[] iArr606 = this.AudioAttributesImplBaseParcelizer;
                iArr606[i1057 - 2] = iArr606[i1057 - 2] * iArr606[i1058];
                iArr606[i1057] = iArr606[i1057 - 2];
                iArr606[i1058] = iArr606[i1057 - 3];
                this.AudioAttributesCompatParcelizer = i1057;
                iArr606[i1057 - 1] = iArr606[i1057] | iArr606[i1057 - 1];
                return 0;
            case 712:
                int i1059 = this.AudioAttributesCompatParcelizer;
                int i1060 = i1059 - 1;
                int[] iArr607 = this.AudioAttributesImplBaseParcelizer;
                iArr607[i1059 - 2] = iArr607[i1059 - 2] | iArr607[i1060];
                iArr607[i1060] = iArr607[31];
                this.AudioAttributesCompatParcelizer = i1059 + 1;
                iArr607[i1059] = -1;
                return 0;
            case 713:
                int i1061 = this.AudioAttributesCompatParcelizer;
                int[] iArr608 = this.AudioAttributesImplBaseParcelizer;
                iArr608[i1061 - 2] = iArr608[i1061 - 1] & iArr608[i1061 - 2];
                int i1062 = i1061 - 2;
                iArr608[i1061 - 3] = iArr608[i1061 - 3] | iArr608[i1062];
                this.AudioAttributesCompatParcelizer = i1061 - 1;
                iArr608[i1062] = iArr608[29];
                return 0;
            case 714:
                int i1063 = this.AudioAttributesCompatParcelizer;
                int[] iArr609 = this.AudioAttributesImplBaseParcelizer;
                iArr609[i1063 - 2] = iArr609[i1063 - 1] ^ iArr609[i1063 - 2];
                int i1064 = i1063 - 2;
                iArr609[i1063 - 3] = iArr609[i1063 - 3] & iArr609[i1064];
                this.AudioAttributesCompatParcelizer = i1063;
                iArr609[i1063 - 1] = iArr609[i1063 - 3];
                iArr609[i1064] = iArr609[i1063 - 4];
                return 0;
            case 715:
                int[] iArr610 = this.AudioAttributesImplBaseParcelizer;
                int i1065 = this.AudioAttributesCompatParcelizer;
                iArr610[i1065] = iArr610[30];
                iArr610[i1065 + 2] = iArr610[i1065];
                iArr610[i1065 + 1] = iArr610[i1065 - 1];
                this.AudioAttributesCompatParcelizer = i1065 + 5;
                iArr610[i1065 + 4] = iArr610[i1065 + 2];
                iArr610[i1065 + 3] = iArr610[i1065 + 1];
                return 0;
            case 716:
                int[] iArr611 = this.AudioAttributesImplBaseParcelizer;
                int i1066 = this.AudioAttributesCompatParcelizer;
                iArr611[i1066] = iArr611[31];
                this.AudioAttributesCompatParcelizer = i1066 + 3;
                iArr611[i1066 + 2] = iArr611[i1066];
                iArr611[i1066 + 1] = iArr611[i1066 - 1];
                return 0;
            case 717:
                int[] iArr612 = this.AudioAttributesImplBaseParcelizer;
                int i1067 = this.AudioAttributesCompatParcelizer;
                iArr612[i1067] = iArr612[30];
                this.AudioAttributesCompatParcelizer = i1067 + 2;
                iArr612[i1067 + 1] = -1;
                return 0;
            case 718:
                int i1068 = this.AudioAttributesCompatParcelizer;
                int i1069 = i1068 - 1;
                int[] iArr613 = this.AudioAttributesImplBaseParcelizer;
                iArr613[i1068 - 2] = iArr613[i1068 - 2] ^ iArr613[i1069];
                this.AudioAttributesCompatParcelizer = i1068;
                iArr613[i1069] = iArr613[31];
                return 0;
            case AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD /* 719 */:
                int i1070 = this.AudioAttributesCompatParcelizer;
                int i1071 = i1070 - 1;
                int[] iArr614 = this.AudioAttributesImplBaseParcelizer;
                iArr614[i1070 - 2] = iArr614[i1070 - 2] | iArr614[i1071];
                iArr614[i1071] = iArr614[29];
                this.AudioAttributesCompatParcelizer = i1070 + 2;
                iArr614[i1070 + 1] = iArr614[i1070 - 1];
                iArr614[i1070] = iArr614[i1070 - 2];
                return 0;
            case 720:
                int i1072 = this.AudioAttributesCompatParcelizer;
                int i1073 = i1072 - 1;
                int[] iArr615 = this.AudioAttributesImplBaseParcelizer;
                iArr615[i1072 - 2] = iArr615[i1072 - 2] & iArr615[i1073];
                this.AudioAttributesCompatParcelizer = i1072;
                iArr615[i1073] = iArr615[31];
                return 0;
            case 721:
                int i1074 = this.AudioAttributesCompatParcelizer;
                int i1075 = i1074 - 1;
                int[] iArr616 = this.AudioAttributesImplBaseParcelizer;
                iArr616[i1074 - 2] = iArr616[i1074 - 2] & iArr616[i1075];
                iArr616[i1075] = iArr616[31];
                this.AudioAttributesCompatParcelizer = i1074 + 1;
                iArr616[i1074] = -1;
                return 0;
            case 722:
                int i1076 = this.AudioAttributesCompatParcelizer;
                int[] iArr617 = this.AudioAttributesImplBaseParcelizer;
                iArr617[i1076 - 2] = iArr617[i1076 - 1] | iArr617[i1076 - 2];
                iArr617[i1076 - 3] = iArr617[i1076 - 3] * iArr617[i1076 - 2];
                int i1077 = i1076 - 3;
                this.AudioAttributesCompatParcelizer = i1077;
                iArr617[i1076 - 4] = iArr617[i1076 - 4] + iArr617[i1077];
                return 0;
            case 723:
                int[] iArr618 = this.AudioAttributesImplBaseParcelizer;
                int i1078 = this.AudioAttributesCompatParcelizer;
                iArr618[i1078] = 123;
                iArr618[i1078] = -iArr618[i1078];
                this.AudioAttributesCompatParcelizer = i1078 + 3;
                iArr618[i1078 + 2] = iArr618[i1078];
                iArr618[i1078 + 1] = iArr618[i1078 - 1];
                return 0;
            case 724:
                int[] iArr619 = this.AudioAttributesImplBaseParcelizer;
                int i1079 = this.AudioAttributesCompatParcelizer;
                iArr619[i1079] = 107;
                this.AudioAttributesCompatParcelizer = i1079 + 3;
                iArr619[i1079 + 2] = iArr619[i1079];
                iArr619[i1079 + 1] = iArr619[i1079 - 1];
                return 0;
            case 725:
                int[] iArr620 = this.AudioAttributesImplBaseParcelizer;
                int i1080 = this.AudioAttributesCompatParcelizer;
                iArr620[i1080] = 4;
                iArr620[i1080 - 1] = iArr620[i1080 - 1] >> iArr620[i1080];
                int i1081 = i1080 - 1;
                this.AudioAttributesCompatParcelizer = i1081;
                this.MediaBrowserCompatMediaItem[i1081] = null;
                return 0;
            case 726:
                int[] iArr621 = this.AudioAttributesImplBaseParcelizer;
                int i1082 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1082 + 1;
                iArr621[i1082] = 31;
                iArr621[i1082] = -iArr621[i1082];
                return 0;
            case 727:
                Object[] objArr112 = this.MediaBrowserCompatMediaItem;
                int i1083 = this.AudioAttributesCompatParcelizer;
                objArr112[i1083] = objArr112[19];
                int[] iArr622 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i1083 + 2;
                iArr622[i1083 + 1] = 0;
                return 0;
            case 728:
                int[] iArr623 = this.AudioAttributesImplBaseParcelizer;
                int i1084 = this.AudioAttributesCompatParcelizer;
                iArr623[i1084] = 4;
                iArr623[i1084 - 1] = iArr623[i1084 - 1] << iArr623[i1084];
                int i1085 = i1084 - 1;
                this.AudioAttributesCompatParcelizer = i1085;
                this.MediaBrowserCompatMediaItem[i1085] = null;
                return 0;
            case 729:
                int i1086 = this.AudioAttributesCompatParcelizer;
                int i1087 = i1086 - 1;
                this.AudioAttributesCompatParcelizer = i1087;
                int[] iArr624 = this.AudioAttributesImplBaseParcelizer;
                iArr624[i1086 - 2] = iArr624[i1087] | iArr624[i1086 - 2];
                int i1088 = iArr624[i1086 - 2];
                iArr624[i1086 - 2] = iArr624[i1086 - 3];
                iArr624[i1086 - 3] = i1088;
                return 0;
            case 730:
                int[] iArr625 = this.AudioAttributesImplBaseParcelizer;
                int i1089 = this.AudioAttributesCompatParcelizer;
                iArr625[i1089] = 62;
                this.AudioAttributesCompatParcelizer = i1089 + 2;
                iArr625[i1089 + 1] = 0;
                return 0;
            case 731:
                int i1090 = this.AudioAttributesCompatParcelizer;
                int i1091 = i1090 - 1;
                this.MediaBrowserCompatMediaItem[i1091] = null;
                int[] iArr626 = this.AudioAttributesImplBaseParcelizer;
                iArr626[i1090 - 2] = -iArr626[i1090 - 2];
                this.AudioAttributesCompatParcelizer = i1090;
                iArr626[i1091] = iArr626[i1090 - 2];
                return 0;
            case 732:
                int[] iArr627 = this.AudioAttributesImplBaseParcelizer;
                int i1092 = this.AudioAttributesCompatParcelizer;
                iArr627[i1092] = 4;
                iArr627[i1092 + 1] = 4;
                this.AudioAttributesCompatParcelizer = i1092 + 3;
                iArr627[i1092 + 2] = iArr627[i1092 + 1];
                return 0;
            case 733:
                int[] iArr628 = this.AudioAttributesImplBaseParcelizer;
                int i1093 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1093 + 1;
                iArr628[i1093] = 47;
                iArr628[i1093] = -iArr628[i1093];
                return 0;
            case 734:
                int[] iArr629 = this.AudioAttributesImplBaseParcelizer;
                int i1094 = this.AudioAttributesCompatParcelizer;
                iArr629[i1094] = 21;
                iArr629[i1094 + 2] = iArr629[i1094];
                iArr629[i1094 + 1] = iArr629[i1094 - 1];
                this.AudioAttributesCompatParcelizer = i1094 + 5;
                iArr629[i1094 + 4] = iArr629[i1094 + 2];
                iArr629[i1094 + 3] = iArr629[i1094 + 1];
                return 0;
            case 735:
                int[] iArr630 = this.AudioAttributesImplBaseParcelizer;
                int i1095 = this.AudioAttributesCompatParcelizer;
                iArr630[i1095] = 21;
                this.AudioAttributesCompatParcelizer = i1095 + 3;
                iArr630[i1095 + 2] = iArr630[i1095];
                iArr630[i1095 + 1] = iArr630[i1095 - 1];
                return 0;
            case 736:
                int i1096 = this.AudioAttributesCompatParcelizer;
                int[] iArr631 = this.AudioAttributesImplBaseParcelizer;
                iArr631[i1096 - 2] = iArr631[i1096 - 1] & iArr631[i1096 - 2];
                int i1097 = i1096 - 2;
                this.AudioAttributesCompatParcelizer = i1097;
                iArr631[i1096 - 3] = iArr631[i1096 - 3] - iArr631[i1097];
                return 0;
            case 737:
                int[] iArr632 = this.AudioAttributesImplBaseParcelizer;
                int i1098 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1098 + 1;
                iArr632[i1098] = 61;
                iArr632[i1098] = -iArr632[i1098];
                return 0;
            case 738:
                int i1099 = this.AudioAttributesCompatParcelizer;
                int i1100 = i1099 - 1;
                this.AudioAttributesCompatParcelizer = i1100;
                int[] iArr633 = this.AudioAttributesImplBaseParcelizer;
                iArr633[i1099 - 2] = iArr633[i1099 - 2] >> iArr633[i1100];
                return 0;
            case 739:
                int[] iArr634 = this.AudioAttributesImplBaseParcelizer;
                int i1101 = this.AudioAttributesCompatParcelizer;
                iArr634[i1101] = 83;
                iArr634[i1101] = -iArr634[i1101];
                this.AudioAttributesCompatParcelizer = i1101 + 3;
                iArr634[i1101 + 2] = iArr634[i1101];
                iArr634[i1101 + 1] = iArr634[i1101 - 1];
                return 0;
            case 740:
                int[] iArr635 = this.AudioAttributesImplBaseParcelizer;
                int i1102 = this.AudioAttributesCompatParcelizer;
                iArr635[i1102] = iArr635[24];
                iArr635[i1102 + 2] = iArr635[i1102];
                iArr635[i1102 + 1] = iArr635[i1102 - 1];
                int i1103 = i1102 + 2;
                this.AudioAttributesCompatParcelizer = i1103;
                iArr635[i1102 + 1] = iArr635[i1102 + 1] ^ iArr635[i1103];
                return 0;
            case 741:
                int i1104 = this.AudioAttributesCompatParcelizer;
                int[] iArr636 = this.AudioAttributesImplBaseParcelizer;
                iArr636[i1104 - 2] = iArr636[i1104 - 1] | iArr636[i1104 - 2];
                int i1105 = i1104 - 2;
                this.AudioAttributesCompatParcelizer = i1105;
                iArr636[i1104 - 3] = iArr636[i1104 - 3] >>> iArr636[i1105];
                return 0;
            case 742:
                int[] iArr637 = this.AudioAttributesImplBaseParcelizer;
                int i1106 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1106 + 1;
                iArr637[i1106] = 109;
                return 0;
            case 743:
                int[] iArr638 = this.AudioAttributesImplBaseParcelizer;
                int i1107 = this.AudioAttributesCompatParcelizer;
                iArr638[i1107] = 89;
                iArr638[i1107 + 2] = iArr638[i1107];
                iArr638[i1107 + 1] = iArr638[i1107 - 1];
                this.AudioAttributesCompatParcelizer = i1107 + 5;
                iArr638[i1107 + 4] = iArr638[i1107 + 2];
                iArr638[i1107 + 3] = iArr638[i1107 + 1];
                return 0;
            case 744:
                int[] iArr639 = this.AudioAttributesImplBaseParcelizer;
                int i1108 = this.AudioAttributesCompatParcelizer;
                iArr639[i1108] = 69;
                this.AudioAttributesCompatParcelizer = i1108 + 2;
                iArr639[i1108 + 1] = iArr639[i1108];
                return 0;
            case 745:
                int[] iArr640 = this.AudioAttributesImplBaseParcelizer;
                int i1109 = this.AudioAttributesCompatParcelizer;
                iArr640[i1109] = 117;
                iArr640[i1109] = -iArr640[i1109];
                this.AudioAttributesCompatParcelizer = i1109 + 2;
                iArr640[i1109 + 1] = iArr640[i1109];
                return 0;
            case 746:
                int i1110 = this.AudioAttributesCompatParcelizer;
                int[] iArr641 = this.AudioAttributesImplBaseParcelizer;
                iArr641[i1110 - 2] = iArr641[i1110 - 2] * iArr641[i1110 - 1];
                int i1111 = i1110 - 2;
                this.AudioAttributesCompatParcelizer = i1111;
                iArr641[33] = iArr641[i1111];
                return 0;
            case 747:
                int[] iArr642 = this.AudioAttributesImplBaseParcelizer;
                int i1112 = this.AudioAttributesCompatParcelizer;
                iArr642[i1112] = iArr642[33];
                this.AudioAttributesCompatParcelizer = i1112;
                iArr642[i1112 - 1] = iArr642[i1112 - 1] * iArr642[i1112];
                iArr642[i1112 - 1] = -iArr642[i1112 - 1];
                return 0;
            case 748:
                int i1113 = this.AudioAttributesCompatParcelizer;
                int i1114 = i1113 - 1;
                int[] iArr643 = this.AudioAttributesImplBaseParcelizer;
                iArr643[i1113 - 2] = iArr643[i1113 - 2] | iArr643[i1114];
                this.AudioAttributesCompatParcelizer = i1113;
                iArr643[i1114] = iArr643[34];
                return 0;
            case 749:
                int i1115 = this.AudioAttributesCompatParcelizer;
                int i1116 = i1115 - 1;
                int[] iArr644 = this.AudioAttributesImplBaseParcelizer;
                iArr644[i1115 - 2] = iArr644[i1115 - 2] | iArr644[i1116];
                iArr644[i1116] = iArr644[33];
                this.AudioAttributesCompatParcelizer = i1115 + 2;
                iArr644[i1115 + 1] = iArr644[i1115 - 1];
                iArr644[i1115] = iArr644[i1115 - 2];
                return 0;
            case 750:
                int[] iArr645 = this.AudioAttributesImplBaseParcelizer;
                int i1117 = this.AudioAttributesCompatParcelizer;
                iArr645[i1117] = iArr645[33];
                this.AudioAttributesCompatParcelizer = i1117 + 3;
                iArr645[i1117 + 2] = iArr645[i1117];
                iArr645[i1117 + 1] = iArr645[i1117 - 1];
                return 0;
            case 751:
                int[] iArr646 = this.AudioAttributesImplBaseParcelizer;
                int i1118 = this.AudioAttributesCompatParcelizer;
                iArr646[i1118] = iArr646[32];
                iArr646[i1118 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i1118 + 4;
                iArr646[i1118 + 3] = iArr646[i1118 + 1];
                iArr646[i1118 + 2] = iArr646[i1118];
                return 0;
            case 752:
                int[] iArr647 = this.AudioAttributesImplBaseParcelizer;
                int i1119 = this.AudioAttributesCompatParcelizer;
                iArr647[i1119] = iArr647[34];
                this.AudioAttributesCompatParcelizer = i1119 + 2;
                iArr647[i1119 + 1] = -1;
                return 0;
            case 753:
                int i1120 = this.AudioAttributesCompatParcelizer;
                int i1121 = i1120 - 1;
                int[] iArr648 = this.AudioAttributesImplBaseParcelizer;
                iArr648[i1120 - 2] = iArr648[i1120 - 2] - iArr648[i1121];
                iArr648[i1121] = 1;
                this.AudioAttributesCompatParcelizer = i1120 + 2;
                iArr648[i1120 + 1] = iArr648[i1120 - 1];
                iArr648[i1120] = iArr648[i1120 - 2];
                return 0;
            case 754:
                int i1122 = this.AudioAttributesCompatParcelizer;
                int i1123 = i1122 - 1;
                int[] iArr649 = this.AudioAttributesImplBaseParcelizer;
                iArr649[i1122 - 2] = iArr649[i1122 - 2] + iArr649[i1123];
                Object[] objArr113 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = i1122;
                objArr113[i1123] = objArr113[39];
                return 0;
            case 755:
                int[] iArr650 = this.AudioAttributesImplBaseParcelizer;
                int i1124 = this.AudioAttributesCompatParcelizer;
                iArr650[i1124] = iArr650[38];
                this.AudioAttributesCompatParcelizer = i1124;
                iArr650[37] = iArr650[i1124];
                return 0;
            case 756:
                int i1125 = this.AudioAttributesCompatParcelizer;
                int[] iArr651 = this.AudioAttributesImplBaseParcelizer;
                iArr651[i1125 - 2] = iArr651[i1125 - 2] * iArr651[i1125 - 1];
                int i1126 = i1125 - 2;
                this.AudioAttributesCompatParcelizer = i1126;
                iArr651[35] = iArr651[i1126];
                return 0;
            case 757:
                int[] iArr652 = this.AudioAttributesImplBaseParcelizer;
                int i1127 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1127 + 1;
                iArr652[i1127] = iArr652[35];
                return 0;
            case 758:
                int i1128 = this.AudioAttributesCompatParcelizer;
                int i1129 = i1128 - 1;
                int[] iArr653 = this.AudioAttributesImplBaseParcelizer;
                iArr653[i1128 - 2] = iArr653[i1128 - 2] * iArr653[i1129];
                iArr653[i1128 - 2] = -iArr653[i1128 - 2];
                this.AudioAttributesCompatParcelizer = i1128;
                iArr653[i1129] = iArr653[i1128 - 2];
                return 0;
            case 759:
                int[] iArr654 = this.AudioAttributesImplBaseParcelizer;
                int i1130 = this.AudioAttributesCompatParcelizer;
                iArr654[i1130] = iArr654[37];
                this.AudioAttributesCompatParcelizer = i1130 + 2;
                iArr654[i1130 + 1] = iArr654[35];
                return 0;
            case 760:
                int[] iArr655 = this.AudioAttributesImplBaseParcelizer;
                int i1131 = this.AudioAttributesCompatParcelizer;
                iArr655[i1131] = iArr655[36];
                this.AudioAttributesCompatParcelizer = i1131 + 3;
                iArr655[i1131 + 2] = iArr655[i1131];
                iArr655[i1131 + 1] = iArr655[i1131 - 1];
                return 0;
            case 761:
                int i1132 = this.AudioAttributesCompatParcelizer;
                int i1133 = i1132 - 1;
                int[] iArr656 = this.AudioAttributesImplBaseParcelizer;
                iArr656[i1132 - 2] = iArr656[i1132 - 2] | iArr656[i1133];
                this.AudioAttributesCompatParcelizer = i1132;
                iArr656[i1133] = iArr656[36];
                return 0;
            case 762:
                int i1134 = this.AudioAttributesCompatParcelizer;
                int i1135 = i1134 - 1;
                int[] iArr657 = this.AudioAttributesImplBaseParcelizer;
                iArr657[i1134 - 2] = iArr657[i1134 - 2] | iArr657[i1135];
                iArr657[i1135] = iArr657[35];
                this.AudioAttributesCompatParcelizer = i1134 + 2;
                iArr657[i1134 + 1] = iArr657[i1134 - 1];
                iArr657[i1134] = iArr657[i1134 - 2];
                return 0;
            case 763:
                int i1136 = this.AudioAttributesCompatParcelizer;
                int i1137 = i1136 - 1;
                int[] iArr658 = this.AudioAttributesImplBaseParcelizer;
                iArr658[i1136 - 2] = iArr658[i1136 - 2] | iArr658[i1137];
                this.AudioAttributesCompatParcelizer = i1136;
                iArr658[i1137] = iArr658[35];
                return 0;
            case 764:
                int i1138 = this.AudioAttributesCompatParcelizer;
                int i1139 = i1138 - 1;
                int[] iArr659 = this.AudioAttributesImplBaseParcelizer;
                iArr659[i1138 - 2] = iArr659[i1138 - 2] | iArr659[i1139];
                iArr659[i1139] = iArr659[36];
                this.AudioAttributesCompatParcelizer = i1138 + 2;
                iArr659[i1138 + 1] = iArr659[i1138 - 1];
                iArr659[i1138] = iArr659[i1138 - 2];
                return 0;
            case 765:
                int i1140 = this.AudioAttributesCompatParcelizer;
                int i1141 = i1140 - 1;
                int[] iArr660 = this.AudioAttributesImplBaseParcelizer;
                iArr660[i1140 - 2] = iArr660[i1140 - 2] | iArr660[i1141];
                iArr660[i1141] = -1;
                int i1142 = i1140 - 1;
                this.AudioAttributesCompatParcelizer = i1142;
                iArr660[i1140 - 2] = iArr660[i1140 - 2] ^ iArr660[i1142];
                return 0;
            case 766:
                int[] iArr661 = this.AudioAttributesImplBaseParcelizer;
                int i1143 = this.AudioAttributesCompatParcelizer;
                iArr661[i1143] = iArr661[37];
                this.AudioAttributesCompatParcelizer = i1143 + 2;
                iArr661[i1143 + 1] = -1;
                return 0;
            case 767:
                int[] iArr662 = this.AudioAttributesImplBaseParcelizer;
                int i1144 = this.AudioAttributesCompatParcelizer;
                iArr662[i1144] = iArr662[35];
                iArr662[i1144 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i1144 + 4;
                iArr662[i1144 + 3] = iArr662[i1144 + 1];
                iArr662[i1144 + 2] = iArr662[i1144];
                return 0;
            case 768:
                int i1145 = this.AudioAttributesCompatParcelizer;
                int i1146 = i1145 - 1;
                int[] iArr663 = this.AudioAttributesImplBaseParcelizer;
                iArr663[i1145 - 2] = iArr663[i1145 - 2] | iArr663[i1146];
                iArr663[i1146] = iArr663[36];
                this.AudioAttributesCompatParcelizer = i1145 + 1;
                iArr663[i1145] = -1;
                return 0;
            case 769:
                int i1147 = this.AudioAttributesCompatParcelizer;
                int[] iArr664 = this.AudioAttributesImplBaseParcelizer;
                iArr664[i1147 - 2] = iArr664[i1147 - 1] & iArr664[i1147 - 2];
                int i1148 = i1147 - 2;
                iArr664[i1147 - 3] = iArr664[i1147 - 3] | iArr664[i1148];
                this.AudioAttributesCompatParcelizer = i1147 - 1;
                iArr664[i1148] = iArr664[35];
                return 0;
            case 770:
                int i1149 = this.AudioAttributesCompatParcelizer;
                int[] iArr665 = this.AudioAttributesImplBaseParcelizer;
                iArr665[i1149 - 2] = iArr665[i1149 - 2] * iArr665[i1149 - 1];
                int i1150 = i1149 - 2;
                this.AudioAttributesCompatParcelizer = i1150;
                iArr665[40] = iArr665[i1150];
                return 0;
            case 771:
                int[] iArr666 = this.AudioAttributesImplBaseParcelizer;
                int i1151 = this.AudioAttributesCompatParcelizer;
                iArr666[i1151] = iArr666[41];
                this.AudioAttributesCompatParcelizer = i1151;
                iArr666[i1151 - 1] = iArr666[i1151 - 1] * iArr666[i1151];
                iArr666[i1151 - 1] = -iArr666[i1151 - 1];
                return 0;
            case 772:
                int i1152 = this.AudioAttributesCompatParcelizer;
                int i1153 = i1152 - 1;
                int[] iArr667 = this.AudioAttributesImplBaseParcelizer;
                iArr667[i1152 - 2] = iArr667[i1152 - 2] | iArr667[i1153];
                this.AudioAttributesCompatParcelizer = i1152;
                iArr667[i1153] = iArr667[42];
                return 0;
            case 773:
                int i1154 = this.AudioAttributesCompatParcelizer;
                int i1155 = i1154 - 1;
                int[] iArr668 = this.AudioAttributesImplBaseParcelizer;
                iArr668[i1154 - 2] = iArr668[i1154 - 2] & iArr668[i1155];
                this.AudioAttributesCompatParcelizer = i1154;
                iArr668[i1155] = iArr668[40];
                return 0;
            case 774:
                int[] iArr669 = this.AudioAttributesImplBaseParcelizer;
                int i1156 = this.AudioAttributesCompatParcelizer;
                iArr669[i1156] = iArr669[41];
                this.AudioAttributesCompatParcelizer = i1156 + 2;
                iArr669[i1156 + 1] = -1;
                return 0;
            case 775:
                int i1157 = this.AudioAttributesCompatParcelizer;
                int i1158 = i1157 - 1;
                int[] iArr670 = this.AudioAttributesImplBaseParcelizer;
                iArr670[i1157 - 2] = iArr670[i1157 - 2] & iArr670[i1158];
                this.AudioAttributesCompatParcelizer = i1157;
                iArr670[i1158] = iArr670[42];
                return 0;
            case 776:
                int i1159 = this.AudioAttributesCompatParcelizer;
                int[] iArr671 = this.AudioAttributesImplBaseParcelizer;
                iArr671[i1159 - 2] = iArr671[i1159 - 1] & iArr671[i1159 - 2];
                int i1160 = i1159 - 2;
                iArr671[i1159 - 3] = iArr671[i1159 - 3] | iArr671[i1160];
                this.AudioAttributesCompatParcelizer = i1159 - 1;
                iArr671[i1160] = iArr671[40];
                return 0;
            case 777:
                int i1161 = this.AudioAttributesCompatParcelizer;
                int i1162 = i1161 - 1;
                int[] iArr672 = this.AudioAttributesImplBaseParcelizer;
                iArr672[i1161 - 2] = iArr672[i1161 - 2] ^ iArr672[i1162];
                this.AudioAttributesCompatParcelizer = i1161;
                iArr672[i1162] = iArr672[40];
                return 0;
            case 778:
                int[] iArr673 = this.AudioAttributesImplBaseParcelizer;
                int i1163 = this.AudioAttributesCompatParcelizer;
                iArr673[i1163] = iArr673[41];
                this.AudioAttributesCompatParcelizer = i1163 + 3;
                iArr673[i1163 + 2] = iArr673[i1163];
                iArr673[i1163 + 1] = iArr673[i1163 - 1];
                return 0;
            case 779:
                int i1164 = this.AudioAttributesCompatParcelizer;
                int[] iArr674 = this.AudioAttributesImplBaseParcelizer;
                iArr674[i1164 - 2] = iArr674[i1164 - 1] ^ iArr674[i1164 - 2];
                int i1165 = i1164 - 2;
                iArr674[i1164 - 3] = iArr674[i1164 - 3] - iArr674[i1165];
                Object[] objArr114 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = i1164 - 1;
                objArr114[i1165] = objArr114[39];
                return 0;
            case 780:
                int i1166 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1166;
                int[] iArr675 = this.AudioAttributesImplBaseParcelizer;
                iArr675[46] = iArr675[i1166];
                return 0;
            case 781:
                int[] iArr676 = this.AudioAttributesImplBaseParcelizer;
                int i1167 = this.AudioAttributesCompatParcelizer;
                iArr676[i1167] = iArr676[46];
                this.AudioAttributesCompatParcelizer = i1167;
                iArr676[45] = iArr676[i1167];
                return 0;
            case 782:
                int i1168 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1168;
                int[] iArr677 = this.AudioAttributesImplBaseParcelizer;
                iArr677[43] = iArr677[i1168];
                return 0;
            case 783:
                int i1169 = this.AudioAttributesCompatParcelizer;
                int[] iArr678 = this.AudioAttributesImplBaseParcelizer;
                iArr678[i1169 - 2] = iArr678[i1169 - 2] * iArr678[i1169 - 1];
                int i1170 = i1169 - 2;
                this.AudioAttributesCompatParcelizer = i1170;
                iArr678[44] = iArr678[i1170];
                return 0;
            case 784:
                int[] iArr679 = this.AudioAttributesImplBaseParcelizer;
                int i1171 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1171 + 1;
                iArr679[i1171] = iArr679[43];
                return 0;
            case 785:
                int[] iArr680 = this.AudioAttributesImplBaseParcelizer;
                int i1172 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1172 + 1;
                iArr680[i1172] = iArr680[44];
                return 0;
            case 786:
                int[] iArr681 = this.AudioAttributesImplBaseParcelizer;
                int i1173 = this.AudioAttributesCompatParcelizer;
                iArr681[i1173] = iArr681[43];
                this.AudioAttributesCompatParcelizer = i1173 + 2;
                iArr681[i1173 + 1] = -1;
                return 0;
            case 787:
                int[] iArr682 = this.AudioAttributesImplBaseParcelizer;
                int i1174 = this.AudioAttributesCompatParcelizer;
                iArr682[i1174] = iArr682[45];
                this.AudioAttributesCompatParcelizer = i1174 + 2;
                iArr682[i1174 + 1] = -1;
                return 0;
            case 788:
                int i1175 = this.AudioAttributesCompatParcelizer;
                int[] iArr683 = this.AudioAttributesImplBaseParcelizer;
                iArr683[i1175 - 2] = iArr683[i1175 - 1] | iArr683[i1175 - 2];
                int i1176 = i1175 - 2;
                iArr683[i1175 - 3] = iArr683[i1175 - 3] * iArr683[i1176];
                this.AudioAttributesCompatParcelizer = i1175 - 1;
                iArr683[i1176] = iArr683[i1175 - 3];
                return 0;
            case 789:
                int[] iArr684 = this.AudioAttributesImplBaseParcelizer;
                int i1177 = this.AudioAttributesCompatParcelizer;
                iArr684[i1177] = iArr684[44];
                iArr684[i1177 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i1177 + 4;
                iArr684[i1177 + 3] = iArr684[i1177 + 1];
                iArr684[i1177 + 2] = iArr684[i1177];
                return 0;
            case 790:
                int i1178 = this.AudioAttributesCompatParcelizer;
                int[] iArr685 = this.AudioAttributesImplBaseParcelizer;
                iArr685[i1178 - 2] = iArr685[i1178 - 1] & iArr685[i1178 - 2];
                int i1179 = i1178 - 2;
                this.AudioAttributesCompatParcelizer = i1179;
                iArr685[i1178 - 3] = iArr685[i1178 - 3] * iArr685[i1179];
                return 0;
            case 791:
                int[] iArr686 = this.AudioAttributesImplBaseParcelizer;
                int i1180 = this.AudioAttributesCompatParcelizer;
                iArr686[i1180] = iArr686[43];
                iArr686[i1180 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i1180 + 4;
                iArr686[i1180 + 3] = iArr686[i1180 + 1];
                iArr686[i1180 + 2] = iArr686[i1180];
                return 0;
            case 792:
                int i1181 = this.AudioAttributesCompatParcelizer;
                int[] iArr687 = this.AudioAttributesImplBaseParcelizer;
                iArr687[i1181 - 2] = iArr687[i1181 - 1] & iArr687[i1181 - 2];
                int i1182 = i1181 - 2;
                iArr687[i1181 - 3] = iArr687[i1181 - 3] | iArr687[i1182];
                this.AudioAttributesCompatParcelizer = i1181 - 1;
                iArr687[i1182] = iArr687[44];
                return 0;
            case 793:
                int i1183 = this.AudioAttributesCompatParcelizer;
                int i1184 = i1183 - 1;
                int[] iArr688 = this.AudioAttributesImplBaseParcelizer;
                iArr688[i1183 - 2] = iArr688[i1183 - 2] & iArr688[i1184];
                iArr688[i1184] = iArr688[45];
                this.AudioAttributesCompatParcelizer = i1183 + 1;
                iArr688[i1183] = -1;
                return 0;
            case 794:
                int[] iArr689 = this.AudioAttributesImplBaseParcelizer;
                int i1185 = this.AudioAttributesCompatParcelizer;
                iArr689[i1185] = iArr689[43];
                iArr689[i1185 + 2] = iArr689[i1185];
                iArr689[i1185 + 1] = iArr689[i1185 - 1];
                this.AudioAttributesCompatParcelizer = i1185 + 5;
                iArr689[i1185 + 4] = iArr689[i1185 + 2];
                iArr689[i1185 + 3] = iArr689[i1185 + 1];
                return 0;
            case 795:
                int[] iArr690 = this.AudioAttributesImplBaseParcelizer;
                int i1186 = this.AudioAttributesCompatParcelizer;
                iArr690[i1186] = 11;
                this.AudioAttributesCompatParcelizer = i1186 + 3;
                iArr690[i1186 + 2] = iArr690[i1186];
                iArr690[i1186 + 1] = iArr690[i1186 - 1];
                return 0;
            case 796:
                int[] iArr691 = this.AudioAttributesImplBaseParcelizer;
                int i1187 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1187 + 1;
                iArr691[i1187] = 49;
                return 0;
            case 797:
                int[] iArr692 = this.AudioAttributesImplBaseParcelizer;
                int i1188 = this.AudioAttributesCompatParcelizer;
                iArr692[i1188] = 15;
                iArr692[i1188] = -iArr692[i1188];
                this.AudioAttributesCompatParcelizer = i1188 + 2;
                iArr692[i1188 + 1] = iArr692[i1188];
                return 0;
            case 798:
                Object[] objArr115 = this.MediaBrowserCompatMediaItem;
                int i1189 = this.AudioAttributesCompatParcelizer;
                objArr115[i1189] = objArr115[19];
                this.AudioAttributesCompatParcelizer = i1189 + 2;
                objArr115[i1189 + 1] = objArr115[22];
                return 0;
            case 799:
                int[] iArr693 = this.AudioAttributesImplBaseParcelizer;
                int i1190 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1190 + 1;
                iArr693[i1190] = 68;
                return 0;
            case 800:
                int[] iArr694 = this.AudioAttributesImplBaseParcelizer;
                int i1191 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1191 + 1;
                iArr694[i1191] = 18;
                return 0;
            case 801:
                int[] iArr695 = this.AudioAttributesImplBaseParcelizer;
                int i1192 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1192 + 1;
                iArr695[i1192] = 41;
                return 0;
            case 802:
                int[] iArr696 = this.AudioAttributesImplBaseParcelizer;
                int i1193 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1193 + 1;
                iArr696[i1193] = 90;
                return 0;
            case 803:
                int[] iArr697 = this.AudioAttributesImplBaseParcelizer;
                int i1194 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1194 + 1;
                iArr697[i1194] = 2;
                return 0;
            case 804:
                Object[] objArr116 = this.MediaBrowserCompatMediaItem;
                int i1195 = this.AudioAttributesCompatParcelizer;
                objArr116[i1195] = objArr116[15];
                this.AudioAttributesCompatParcelizer = i1195 + 2;
                objArr116[i1195 + 1] = objArr116[17];
                return 0;
            case 805:
                Object[] objArr117 = this.MediaBrowserCompatMediaItem;
                int i1196 = this.AudioAttributesCompatParcelizer;
                objArr117[i1196] = objArr117[15];
                int[] iArr698 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i1196 + 2;
                iArr698[i1196 + 1] = 0;
                return 0;
            case 806:
                Object[] objArr118 = this.MediaBrowserCompatMediaItem;
                int i1197 = this.AudioAttributesCompatParcelizer;
                objArr118[i1197] = objArr118[15];
                int[] iArr699 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesCompatParcelizer = i1197 + 2;
                iArr699[i1197 + 1] = 4;
                return 0;
            case 807:
                int[] iArr700 = this.AudioAttributesImplBaseParcelizer;
                int i1198 = this.AudioAttributesCompatParcelizer;
                iArr700[i1198] = 31;
                iArr700[i1198 + 2] = iArr700[i1198];
                iArr700[i1198 + 1] = iArr700[i1198 - 1];
                this.AudioAttributesCompatParcelizer = i1198 + 5;
                iArr700[i1198 + 4] = iArr700[i1198 + 2];
                iArr700[i1198 + 3] = iArr700[i1198 + 1];
                return 0;
            case 808:
                int[] iArr701 = this.AudioAttributesImplBaseParcelizer;
                int i1199 = this.AudioAttributesCompatParcelizer;
                iArr701[i1199] = 3;
                iArr701[i1199 + 1] = 0;
                int i1200 = i1199 + 1;
                this.AudioAttributesCompatParcelizer = i1200;
                iArr701[i1199] = iArr701[i1199] / iArr701[i1200];
                return 0;
            case 809:
                int[] iArr702 = this.AudioAttributesImplBaseParcelizer;
                int i1201 = this.AudioAttributesCompatParcelizer;
                iArr702[i1201] = 91;
                iArr702[i1201] = -iArr702[i1201];
                this.AudioAttributesCompatParcelizer = i1201 + 2;
                iArr702[i1201 + 1] = iArr702[i1201];
                return 0;
            case 810:
                int[] iArr703 = this.AudioAttributesImplBaseParcelizer;
                int i1202 = this.AudioAttributesCompatParcelizer;
                iArr703[i1202] = 11;
                this.AudioAttributesCompatParcelizer = i1202;
                iArr703[i1202 - 1] = iArr703[i1202 - 1] + iArr703[i1202];
                return 0;
            case 811:
                int[] iArr704 = this.AudioAttributesImplBaseParcelizer;
                int i1203 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1203 + 1;
                iArr704[i1203] = 14;
                return 0;
            case 812:
                Object[] objArr119 = this.MediaBrowserCompatMediaItem;
                int i1204 = this.AudioAttributesCompatParcelizer;
                objArr119[i1204] = objArr119[15];
                this.AudioAttributesCompatParcelizer = i1204;
                Object obj59 = objArr119[i1204];
                objArr119[i1204] = null;
                objArr119[27] = obj59;
                return 0;
            case 813:
                int i1205 = this.AudioAttributesCompatParcelizer;
                int i1206 = i1205 - 1;
                Object[] objArr120 = this.MediaBrowserCompatMediaItem;
                Object obj60 = objArr120[i1206];
                objArr120[i1206] = null;
                objArr120[16] = obj60;
                objArr120[i1206] = objArr120[15];
                this.AudioAttributesCompatParcelizer = i1205 + 1;
                objArr120[i1205] = objArr120[16];
                return 0;
            case 814:
                int[] iArr705 = this.AudioAttributesImplBaseParcelizer;
                int i1207 = this.AudioAttributesCompatParcelizer;
                iArr705[i1207] = 0;
                this.AudioAttributesCompatParcelizer = i1207;
                iArr705[16] = iArr705[i1207];
                return 0;
            case 815:
                int i1208 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1208;
                int[] iArr706 = this.AudioAttributesImplBaseParcelizer;
                iArr706[16] = iArr706[i1208];
                return 0;
            case 816:
                int[] iArr707 = this.AudioAttributesImplBaseParcelizer;
                int i1209 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1209 + 1;
                iArr707[i1209] = iArr707[16];
                return 0;
            case 817:
                int i1210 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i1210;
                this.write = this.AudioAttributesImplBaseParcelizer[i1210] <= 0 ? 0 : 1;
                return 0;
            case 818:
                int[] iArr708 = this.AudioAttributesImplBaseParcelizer;
                int i1211 = this.AudioAttributesCompatParcelizer;
                iArr708[i1211] = 4;
                this.AudioAttributesCompatParcelizer = i1211;
                iArr708[i1211 - 1] = iArr708[i1211 - 1] >>> iArr708[i1211];
                return 0;
            case 819:
                int[] iArr709 = this.AudioAttributesImplBaseParcelizer;
                int i1212 = this.AudioAttributesCompatParcelizer;
                iArr709[i1212] = 97;
                iArr709[i1212] = -iArr709[i1212];
                this.AudioAttributesCompatParcelizer = i1212 + 2;
                iArr709[i1212 + 1] = iArr709[i1212];
                return 0;
            case 820:
                int[] iArr710 = this.AudioAttributesImplBaseParcelizer;
                int i1213 = this.AudioAttributesCompatParcelizer;
                iArr710[i1213] = 119;
                iArr710[i1213] = -iArr710[i1213];
                this.AudioAttributesCompatParcelizer = i1213 + 2;
                iArr710[i1213 + 1] = iArr710[i1213];
                return 0;
            case 821:
                int[] iArr711 = this.AudioAttributesImplBaseParcelizer;
                int i1214 = this.AudioAttributesCompatParcelizer;
                iArr711[i1214] = 61;
                iArr711[i1214 + 2] = iArr711[i1214];
                iArr711[i1214 + 1] = iArr711[i1214 - 1];
                this.AudioAttributesCompatParcelizer = i1214 + 5;
                iArr711[i1214 + 4] = iArr711[i1214 + 2];
                iArr711[i1214 + 3] = iArr711[i1214 + 1];
                return 0;
            case 822:
                int[] iArr712 = this.AudioAttributesImplBaseParcelizer;
                int i1215 = this.AudioAttributesCompatParcelizer;
                iArr712[i1215] = 3;
                iArr712[i1215] = -iArr712[i1215];
                this.AudioAttributesCompatParcelizer = i1215 + 2;
                iArr712[i1215 + 1] = iArr712[i1215];
                return 0;
            case 823:
                int i1216 = this.AudioAttributesCompatParcelizer;
                int i1217 = i1216 - 1;
                Object[] objArr121 = this.MediaBrowserCompatMediaItem;
                Object obj61 = objArr121[i1217];
                objArr121[i1217] = null;
                objArr121[18] = obj61;
                this.AudioAttributesCompatParcelizer = i1216;
                objArr121[i1217] = objArr121[19];
                return 0;
            case 824:
                int[] iArr713 = this.AudioAttributesImplBaseParcelizer;
                int i1218 = this.AudioAttributesCompatParcelizer;
                iArr713[i1218] = 37;
                iArr713[i1218 + 2] = iArr713[i1218];
                iArr713[i1218 + 1] = iArr713[i1218 - 1];
                int i1219 = i1218 + 2;
                this.AudioAttributesCompatParcelizer = i1219;
                iArr713[i1218 + 1] = iArr713[i1218 + 1] | iArr713[i1219];
                return 0;
            case 825:
                int i1220 = this.AudioAttributesCompatParcelizer;
                int i1221 = i1220 - 1;
                int[] iArr714 = this.AudioAttributesImplBaseParcelizer;
                iArr714[i1220 - 2] = iArr714[i1220 - 2] & iArr714[i1221];
                this.AudioAttributesCompatParcelizer = i1220;
                iArr714[i1221] = iArr714[i1220 - 2];
                iArr714[i1220 - 1] = -iArr714[i1220 - 1];
                return 0;
            case 826:
                int[] iArr715 = this.AudioAttributesImplBaseParcelizer;
                int i1222 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1222 + 1;
                iArr715[i1222] = 5;
                iArr715[i1222] = -iArr715[i1222];
                return 0;
            case 827:
                int[] iArr716 = this.AudioAttributesImplBaseParcelizer;
                int i1223 = this.AudioAttributesCompatParcelizer;
                iArr716[i1223] = 21;
                this.AudioAttributesCompatParcelizer = i1223 + 2;
                iArr716[i1223 + 1] = 0;
                return 0;
            case 828:
                int[] iArr717 = this.AudioAttributesImplBaseParcelizer;
                int i1224 = this.AudioAttributesCompatParcelizer;
                iArr717[i1224] = 3;
                iArr717[i1224 + 1] = 3;
                int i1225 = i1224 + 1;
                this.AudioAttributesCompatParcelizer = i1225;
                iArr717[i1224] = iArr717[i1224] >> iArr717[i1225];
                return 0;
            case 829:
                int[] iArr718 = this.AudioAttributesImplBaseParcelizer;
                int i1226 = this.AudioAttributesCompatParcelizer;
                iArr718[i1226] = 89;
                iArr718[i1226 + 2] = iArr718[i1226];
                iArr718[i1226 + 1] = iArr718[i1226 - 1];
                int i1227 = i1226 + 2;
                this.AudioAttributesCompatParcelizer = i1227;
                iArr718[i1226 + 1] = iArr718[i1226 + 1] | iArr718[i1227];
                return 0;
            case 830:
                int i1228 = this.AudioAttributesCompatParcelizer;
                int i1229 = i1228 - 1;
                int[] iArr719 = this.AudioAttributesImplBaseParcelizer;
                iArr719[i1228 - 2] = iArr719[i1228 - 2] << iArr719[i1229];
                iArr719[i1228 - 2] = -iArr719[i1228 - 2];
                this.AudioAttributesCompatParcelizer = i1228;
                iArr719[i1229] = iArr719[i1228 - 2];
                return 0;
            case 831:
                int[] iArr720 = this.AudioAttributesImplBaseParcelizer;
                int i1230 = this.AudioAttributesCompatParcelizer;
                iArr720[i1230] = 2;
                this.AudioAttributesCompatParcelizer = i1230 + 2;
                iArr720[i1230 + 1] = 0;
                return 0;
            case 832:
                int[] iArr721 = this.AudioAttributesImplBaseParcelizer;
                int i1231 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1231 + 1;
                iArr721[i1231] = 7;
                iArr721[i1231] = -iArr721[i1231];
                return 0;
            case 833:
                int[] iArr722 = this.AudioAttributesImplBaseParcelizer;
                int i1232 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1232 + 1;
                iArr722[i1232] = 87;
                iArr722[i1232] = -iArr722[i1232];
                return 0;
            case 834:
                int[] iArr723 = this.AudioAttributesImplBaseParcelizer;
                int i1233 = this.AudioAttributesCompatParcelizer;
                iArr723[i1233] = 1;
                iArr723[i1233] = -iArr723[i1233];
                this.AudioAttributesCompatParcelizer = i1233 + 2;
                iArr723[i1233 + 1] = iArr723[i1233];
                return 0;
            case 835:
                Object[] objArr122 = this.MediaBrowserCompatMediaItem;
                int i1234 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1234 + 1;
                objArr122[i1234] = objArr122[27];
                return 0;
            case 836:
                int[] iArr724 = this.AudioAttributesImplBaseParcelizer;
                int i1235 = this.AudioAttributesCompatParcelizer;
                iArr724[i1235] = iArr724[21];
                this.AudioAttributesCompatParcelizer = i1235;
                iArr724[i1235 - 1] = iArr724[i1235 - 1] * iArr724[i1235];
                iArr724[i1235 - 1] = -iArr724[i1235 - 1];
                return 0;
            case 837:
                int i1236 = this.AudioAttributesCompatParcelizer;
                int i1237 = i1236 - 1;
                int[] iArr725 = this.AudioAttributesImplBaseParcelizer;
                iArr725[i1236 - 2] = iArr725[i1236 - 2] & iArr725[i1237];
                iArr725[i1237] = iArr725[22];
                this.AudioAttributesCompatParcelizer = i1236 + 1;
                iArr725[i1236] = -1;
                return 0;
            case 838:
                int[] iArr726 = this.AudioAttributesImplBaseParcelizer;
                int i1238 = this.AudioAttributesCompatParcelizer;
                iArr726[i1238] = iArr726[21];
                iArr726[i1238 + 2] = iArr726[i1238];
                iArr726[i1238 + 1] = iArr726[i1238 - 1];
                this.AudioAttributesCompatParcelizer = i1238 + 5;
                iArr726[i1238 + 4] = iArr726[i1238 + 2];
                iArr726[i1238 + 3] = iArr726[i1238 + 1];
                return 0;
            case 839:
                int[] iArr727 = this.AudioAttributesImplBaseParcelizer;
                int i1239 = this.AudioAttributesCompatParcelizer;
                iArr727[i1239] = iArr727[22];
                iArr727[i1239 + 2] = iArr727[i1239];
                iArr727[i1239 + 1] = iArr727[i1239 - 1];
                this.AudioAttributesCompatParcelizer = i1239 + 5;
                iArr727[i1239 + 4] = iArr727[i1239 + 2];
                iArr727[i1239 + 3] = iArr727[i1239 + 1];
                return 0;
            case 840:
                int i1240 = this.AudioAttributesCompatParcelizer;
                int i1241 = i1240 - 1;
                int[] iArr728 = this.AudioAttributesImplBaseParcelizer;
                iArr728[i1240 - 2] = iArr728[i1240 - 2] & iArr728[i1241];
                this.AudioAttributesCompatParcelizer = i1240;
                iArr728[i1241] = iArr728[20];
                return 0;
            case 841:
                int[] iArr729 = this.AudioAttributesImplBaseParcelizer;
                int i1242 = this.AudioAttributesCompatParcelizer;
                iArr729[i1242] = iArr729[20];
                iArr729[i1242 + 1] = -1;
                this.AudioAttributesCompatParcelizer = i1242 + 4;
                iArr729[i1242 + 3] = iArr729[i1242 + 1];
                iArr729[i1242 + 2] = iArr729[i1242];
                return 0;
            case 842:
                int i1243 = this.AudioAttributesCompatParcelizer;
                int i1244 = i1243 - 1;
                int[] iArr730 = this.AudioAttributesImplBaseParcelizer;
                iArr730[i1243 - 2] = iArr730[i1243 - 2] | iArr730[i1244];
                this.AudioAttributesCompatParcelizer = i1243;
                iArr730[i1244] = iArr730[21];
                return 0;
            case 843:
                int i1245 = this.AudioAttributesCompatParcelizer;
                int[] iArr731 = this.AudioAttributesImplBaseParcelizer;
                iArr731[i1245 - 2] = iArr731[i1245 - 1] & iArr731[i1245 - 2];
                iArr731[i1245 - 3] = iArr731[i1245 - 2] & iArr731[i1245 - 3];
                int i1246 = i1245 - 3;
                this.AudioAttributesCompatParcelizer = i1246;
                iArr731[i1245 - 4] = iArr731[i1245 - 4] | iArr731[i1246];
                return 0;
            case 844:
                int[] iArr732 = this.AudioAttributesImplBaseParcelizer;
                int i1247 = this.AudioAttributesCompatParcelizer;
                iArr732[i1247] = iArr732[23];
                this.AudioAttributesCompatParcelizer = i1247;
                iArr732[i1247 - 1] = iArr732[i1247 - 1] * iArr732[i1247];
                return 0;
            case 845:
                int[] iArr733 = this.AudioAttributesImplBaseParcelizer;
                int i1248 = this.AudioAttributesCompatParcelizer;
                iArr733[i1248] = iArr733[24];
                this.AudioAttributesCompatParcelizer = i1248;
                iArr733[i1248 - 1] = iArr733[i1248 - 1] * iArr733[i1248];
                iArr733[i1248 - 1] = -iArr733[i1248 - 1];
                return 0;
            case 846:
                int i1249 = this.AudioAttributesCompatParcelizer;
                int i1250 = i1249 - 1;
                int[] iArr734 = this.AudioAttributesImplBaseParcelizer;
                iArr734[i1249 - 2] = iArr734[i1249 - 2] & iArr734[i1250];
                this.AudioAttributesCompatParcelizer = i1249;
                iArr734[i1250] = iArr734[24];
                return 0;
            case 847:
                int i1251 = this.AudioAttributesCompatParcelizer;
                int i1252 = i1251 - 1;
                int[] iArr735 = this.AudioAttributesImplBaseParcelizer;
                iArr735[i1251 - 2] = iArr735[i1251 - 2] & iArr735[i1252];
                iArr735[i1252] = iArr735[25];
                this.AudioAttributesCompatParcelizer = i1251 + 2;
                iArr735[i1251 + 1] = iArr735[i1251 - 1];
                iArr735[i1251] = iArr735[i1251 - 2];
                return 0;
            case 848:
                int[] iArr736 = this.AudioAttributesImplBaseParcelizer;
                int i1253 = this.AudioAttributesCompatParcelizer;
                iArr736[i1253] = iArr736[25];
                iArr736[i1253 - 1] = iArr736[i1253 - 1] | iArr736[i1253];
                this.AudioAttributesCompatParcelizer = i1253 + 1;
                iArr736[i1253] = -1;
                return 0;
            case 849:
                int i1254 = this.AudioAttributesCompatParcelizer;
                int i1255 = i1254 - 1;
                int[] iArr737 = this.AudioAttributesImplBaseParcelizer;
                iArr737[i1254 - 2] = iArr737[i1254 - 2] | iArr737[i1255];
                this.AudioAttributesCompatParcelizer = i1254;
                iArr737[i1255] = iArr737[24];
                return 0;
            case 850:
                int i1256 = this.AudioAttributesCompatParcelizer;
                int[] iArr738 = this.AudioAttributesImplBaseParcelizer;
                iArr738[i1256 - 2] = iArr738[i1256 - 1] & iArr738[i1256 - 2];
                int i1257 = i1256 - 2;
                iArr738[i1256 - 3] = iArr738[i1256 - 3] | iArr738[i1257];
                this.AudioAttributesCompatParcelizer = i1256 - 1;
                iArr738[i1257] = iArr738[25];
                return 0;
            case 851:
                int i1258 = this.AudioAttributesCompatParcelizer;
                int[] iArr739 = this.AudioAttributesImplBaseParcelizer;
                iArr739[i1258 - 2] = iArr739[i1258 - 1] & iArr739[i1258 - 2];
                int i1259 = i1258 - 2;
                iArr739[i1258 - 3] = iArr739[i1258 - 3] | iArr739[i1259];
                this.AudioAttributesCompatParcelizer = i1258 - 1;
                iArr739[i1259] = iArr739[24];
                return 0;
            case 852:
                int i1260 = this.AudioAttributesCompatParcelizer;
                int[] iArr740 = this.AudioAttributesImplBaseParcelizer;
                iArr740[i1260 - 2] = iArr740[i1260 - 1] | iArr740[i1260 - 2];
                int i1261 = i1260 - 2;
                iArr740[i1260 - 3] = iArr740[i1260 - 3] | iArr740[i1261];
                this.AudioAttributesCompatParcelizer = i1260 - 1;
                iArr740[i1261] = iArr740[24];
                return 0;
            case 853:
                int[] iArr741 = this.AudioAttributesImplBaseParcelizer;
                int i1262 = this.AudioAttributesCompatParcelizer;
                iArr741[i1262] = 1;
                this.AudioAttributesCompatParcelizer = i1262 + 2;
                iArr741[i1262 + 1] = iArr741[i1262];
                return 0;
            case 854:
                int[] iArr742 = this.AudioAttributesImplBaseParcelizer;
                int i1263 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1263 + 1;
                iArr742[i1263] = 78;
                return 0;
            case 855:
                int[] iArr743 = this.AudioAttributesImplBaseParcelizer;
                int i1264 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1264 + 1;
                iArr743[i1264] = 48;
                return 0;
            case 856:
                int i1265 = this.AudioAttributesCompatParcelizer;
                int i1266 = i1265 - 1;
                this.AudioAttributesCompatParcelizer = i1266;
                int[] iArr744 = this.AudioAttributesImplBaseParcelizer;
                Object[] objArr123 = this.MediaBrowserCompatMediaItem;
                Object obj62 = objArr123[i1265 - 2];
                objArr123[i1265 - 2] = null;
                iArr744[i1265 - 2] = ((int[]) obj62)[iArr744[i1266]];
                this.AudioAttributesCompatParcelizer = i1265;
                iArr744[i1266] = 1;
                return 0;
            case 857:
                int[] iArr745 = this.AudioAttributesImplBaseParcelizer;
                int i1267 = this.AudioAttributesCompatParcelizer;
                iArr745[i1267] = 5;
                this.AudioAttributesCompatParcelizer = i1267 + 2;
                iArr745[i1267 + 1] = iArr745[i1267];
                return 0;
            case 858:
                int[] iArr746 = this.AudioAttributesImplBaseParcelizer;
                int i1268 = this.AudioAttributesCompatParcelizer;
                iArr746[i1268] = 97;
                this.AudioAttributesCompatParcelizer = i1268 + 3;
                iArr746[i1268 + 2] = iArr746[i1268];
                iArr746[i1268 + 1] = iArr746[i1268 - 1];
                return 0;
            case 859:
                int[] iArr747 = this.AudioAttributesImplBaseParcelizer;
                int i1269 = this.AudioAttributesCompatParcelizer;
                iArr747[i1269] = 95;
                this.AudioAttributesCompatParcelizer = i1269 + 3;
                iArr747[i1269 + 2] = iArr747[i1269];
                iArr747[i1269 + 1] = iArr747[i1269 - 1];
                return 0;
            case 860:
                int[] iArr748 = this.AudioAttributesImplBaseParcelizer;
                int i1270 = this.AudioAttributesCompatParcelizer;
                iArr748[i1270] = 29;
                iArr748[i1270] = -iArr748[i1270];
                this.AudioAttributesCompatParcelizer = i1270 + 2;
                iArr748[i1270 + 1] = iArr748[i1270];
                return 0;
            case 861:
                int[] iArr749 = this.AudioAttributesImplBaseParcelizer;
                int i1271 = this.AudioAttributesCompatParcelizer;
                iArr749[i1271] = 49;
                this.AudioAttributesCompatParcelizer = i1271 + 3;
                iArr749[i1271 + 2] = iArr749[i1271];
                iArr749[i1271 + 1] = iArr749[i1271 - 1];
                return 0;
            case 862:
                int[] iArr750 = this.AudioAttributesImplBaseParcelizer;
                int i1272 = this.AudioAttributesCompatParcelizer;
                iArr750[i1272] = 27;
                iArr750[i1272] = -iArr750[i1272];
                this.AudioAttributesCompatParcelizer = i1272 + 3;
                iArr750[i1272 + 2] = iArr750[i1272];
                iArr750[i1272 + 1] = iArr750[i1272 - 1];
                return 0;
            case 863:
                int[] iArr751 = this.AudioAttributesImplBaseParcelizer;
                int i1273 = this.AudioAttributesCompatParcelizer;
                iArr751[i1273] = 7;
                this.AudioAttributesCompatParcelizer = i1273 + 2;
                iArr751[i1273 + 1] = 0;
                return 0;
            case 864:
                int[] iArr752 = this.AudioAttributesImplBaseParcelizer;
                int i1274 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1274 + 1;
                iArr752[i1274] = 46;
                return 0;
            case 865:
                int[] iArr753 = this.AudioAttributesImplBaseParcelizer;
                int i1275 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1275 + 1;
                iArr753[i1275] = 66;
                return 0;
            case 866:
                int[] iArr754 = this.AudioAttributesImplBaseParcelizer;
                int i1276 = this.AudioAttributesCompatParcelizer;
                iArr754[i1276] = 105;
                iArr754[i1276] = -iArr754[i1276];
                this.AudioAttributesCompatParcelizer = i1276 + 2;
                iArr754[i1276 + 1] = iArr754[i1276];
                return 0;
            case 867:
                int i1277 = this.AudioAttributesCompatParcelizer;
                int i1278 = i1277 - 1;
                Object[] objArr124 = this.MediaBrowserCompatMediaItem;
                Object obj63 = objArr124[i1278];
                objArr124[i1278] = null;
                objArr124[16] = obj63;
                this.AudioAttributesCompatParcelizer = i1277;
                objArr124[i1278] = objArr124[19];
                return 0;
            case 868:
                int i1279 = this.AudioAttributesCompatParcelizer;
                int i1280 = i1279 - 3;
                this.AudioAttributesCompatParcelizer = i1280;
                Object[] objArr125 = this.MediaBrowserCompatMediaItem;
                Object obj64 = objArr125[i1280];
                objArr125[i1280] = null;
                int i1281 = this.AudioAttributesImplBaseParcelizer[i1279 - 2];
                Object obj65 = objArr125[i1279 - 1];
                objArr125[i1279 - 1] = null;
                ((Object[]) obj64)[i1281] = obj65;
                this.AudioAttributesCompatParcelizer = i1279 - 2;
                objArr125[i1280] = objArr125[19];
                return 0;
            case 869:
                int i1282 = this.AudioAttributesCompatParcelizer;
                int i1283 = i1282 - 1;
                Object[] objArr126 = this.MediaBrowserCompatMediaItem;
                Object obj66 = objArr126[i1283];
                objArr126[i1283] = null;
                objArr126[19] = obj66;
                this.AudioAttributesCompatParcelizer = i1282;
                objArr126[i1283] = objArr126[15];
                return 0;
            case 870:
                int[] iArr755 = this.AudioAttributesImplBaseParcelizer;
                int i1284 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1284 + 1;
                iArr755[i1284] = 69;
                iArr755[i1284] = -iArr755[i1284];
                return 0;
            case 871:
                int[] iArr756 = this.AudioAttributesImplBaseParcelizer;
                int i1285 = this.AudioAttributesCompatParcelizer;
                iArr756[i1285] = 25;
                iArr756[i1285] = -iArr756[i1285];
                this.AudioAttributesCompatParcelizer = i1285 + 3;
                iArr756[i1285 + 2] = iArr756[i1285];
                iArr756[i1285 + 1] = iArr756[i1285 - 1];
                return 0;
            case 872:
                int[] iArr757 = this.AudioAttributesImplBaseParcelizer;
                int i1286 = this.AudioAttributesCompatParcelizer;
                iArr757[i1286] = 13;
                iArr757[i1286 + 2] = iArr757[i1286];
                iArr757[i1286 + 1] = iArr757[i1286 - 1];
                this.AudioAttributesCompatParcelizer = i1286 + 5;
                iArr757[i1286 + 4] = iArr757[i1286 + 2];
                iArr757[i1286 + 3] = iArr757[i1286 + 1];
                return 0;
            case 873:
                int[] iArr758 = this.AudioAttributesImplBaseParcelizer;
                int i1287 = this.AudioAttributesCompatParcelizer;
                iArr758[i1287] = 107;
                iArr758[i1287 + 2] = iArr758[i1287];
                iArr758[i1287 + 1] = iArr758[i1287 - 1];
                int i1288 = i1287 + 2;
                this.AudioAttributesCompatParcelizer = i1288;
                iArr758[i1287 + 1] = iArr758[i1287 + 1] ^ iArr758[i1288];
                return 0;
            case 874:
                int[] iArr759 = this.AudioAttributesImplBaseParcelizer;
                int i1289 = this.AudioAttributesCompatParcelizer;
                iArr759[i1289] = 111;
                this.AudioAttributesCompatParcelizer = i1289 + 3;
                iArr759[i1289 + 2] = iArr759[i1289];
                iArr759[i1289 + 1] = iArr759[i1289 - 1];
                return 0;
            case 875:
                int[] iArr760 = this.AudioAttributesImplBaseParcelizer;
                int i1290 = this.AudioAttributesCompatParcelizer;
                iArr760[i1290] = 2;
                this.AudioAttributesCompatParcelizer = i1290 + 2;
                iArr760[i1290 + 1] = 5;
                iArr760[i1290 + 1] = -iArr760[i1290 + 1];
                return 0;
            case 876:
                int i1291 = this.AudioAttributesCompatParcelizer;
                int[] iArr761 = this.AudioAttributesImplBaseParcelizer;
                iArr761[i1291 - 2] = iArr761[i1291 - 2] + iArr761[i1291 - 1];
                int i1292 = i1291 - 2;
                this.AudioAttributesCompatParcelizer = i1292;
                this.MediaBrowserCompatMediaItem[i1292] = null;
                return 0;
            case 877:
                int[] iArr762 = this.AudioAttributesImplBaseParcelizer;
                int i1293 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1293 + 1;
                iArr762[i1293] = 58;
                return 0;
            case 878:
                int[] iArr763 = this.AudioAttributesImplBaseParcelizer;
                int i1294 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i1294 + 1;
                iArr763[i1294] = 32;
                return 0;
            default:
                return i;
        }
    }

    public transferInitializing(Object obj) {
        this.AudioAttributesImplBaseParcelizer = new int[47];
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[15] = obj;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public transferInitializing(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.AudioAttributesImplBaseParcelizer = new int[47];
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        objArr[17] = obj3;
        objArr[18] = obj4;
        objArr[19] = obj5;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public transferInitializing(Object obj, Object obj2, Object obj3, Object obj4) {
        this.AudioAttributesImplBaseParcelizer = new int[47];
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        objArr[17] = obj3;
        objArr[18] = obj4;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public transferInitializing(Object obj, Object obj2, Object obj3) {
        this.AudioAttributesImplBaseParcelizer = new int[47];
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        objArr[17] = obj3;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public transferInitializing(Object obj, Object obj2) {
        this.AudioAttributesImplBaseParcelizer = new int[47];
        this.AudioAttributesImplApi21Parcelizer = new long[47];
        this.AudioAttributesImplApi26Parcelizer = new float[47];
        this.MediaBrowserCompatCustomActionResultReceiver = new double[47];
        Object[] objArr = new Object[47];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }
}
