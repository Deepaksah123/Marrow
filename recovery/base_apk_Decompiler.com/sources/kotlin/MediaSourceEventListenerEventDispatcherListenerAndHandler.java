package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.data.models.ResponseError;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes.dex */
public class MediaSourceEventListenerEventDispatcherListenerAndHandler {
    public int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final long[] MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final double[] MediaMetadataCompat;
    private final float[] RatingCompat;
    public float RemoteActionCompatParcelizer;
    public int read;
    public long write;

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, int i, Object obj2, Object obj3) {
        int[] iArr = new int[20];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        objArr[13] = obj2;
        objArr[14] = obj3;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr[i2] = objArr[11];
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                iArr[i2 + 1] = iArr[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 3;
                objArr[i2 + 2] = objArr[13];
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i3;
                this.AudioAttributesImplBaseParcelizer = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 4:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i5 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i5 + 1;
                this.read = iArr2[i5];
                return 0;
            case 5:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i6 + 1;
                objArr3[i6] = objArr3[14];
                return 0;
            case 6:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i7 + 1;
                iArr3[i7] = 2;
                return 0;
            case 7:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i8] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i8;
                iArr4[i8 - 1] = iArr4[i8 - 1] % iArr4[i8];
                int i9 = i8 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i9;
                this.MediaBrowserCompatSearchResultReceiver[i9] = null;
                return 0;
            case 9:
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                iArr5[i10] = this.AudioAttributesCompatParcelizer;
            case 8:
                return 0;
            case 10:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 1;
                iArr6[i11] = 121;
                return 0;
            case 11:
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i13 = i12 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i12 - 2] = iArr7[i12 - 2] + iArr7[i13];
                return 0;
            case 12:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                iArr8[i14] = iArr8[i14 - 1];
                return 0;
            case 13:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i15] = 128;
                this.MediaBrowserCompatCustomActionResultReceiver = i15;
                iArr9[i15 - 1] = iArr9[i15 - 1] % iArr9[i15];
                return 0;
            case 14:
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i17 = i16 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i17;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i16 - 2] = iArr10[i16 - 2] % iArr10[i17];
                return 0;
            case 15:
                int i18 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i18;
                this.read = this.AudioAttributesImplApi21Parcelizer[i18] != 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr11[i19] = 89;
                iArr11[i19 - 1] = iArr11[i19 - 1] + iArr11[i19];
                this.MediaBrowserCompatCustomActionResultReceiver = i19 + 1;
                iArr11[i19] = iArr11[i19 - 1];
                return 0;
            case 17:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 1;
                iArr12[i20] = 128;
                return 0;
            case 18:
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i21;
                this.read = this.AudioAttributesImplApi21Parcelizer[i21] == 0 ? 0 : 1;
                return 0;
            case 19:
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj2 = objArr4[i22 - 1];
                objArr4[i22 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj2;
                return 0;
            case 20:
                for (int i23 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i23 >= 0; i23--) {
                    this.MediaBrowserCompatSearchResultReceiver[i23] = null;
                }
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr5[0] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 21:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr6[i24] = objArr6[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 2;
                objArr6[i24 + 1] = objArr6[12];
                return 0;
            case 22:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr13[i25] = 2;
                iArr13[i25 + 1] = 2;
                int i26 = i25 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i26;
                iArr13[i25] = iArr13[i25] % iArr13[i26];
                return 0;
            case 23:
                int i27 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i27;
                this.MediaBrowserCompatSearchResultReceiver[i27] = null;
                return 0;
            case 24:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i28 + 1;
                iArr14[i28] = 19;
                return 0;
            case 25:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr15[i29] = iArr15[i29 - 1];
                iArr15[i29 + 1] = 128;
                int i30 = i29 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i30;
                iArr15[i29] = iArr15[i29] % iArr15[i30];
                return 0;
            case 26:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i31 + 1;
                objArr7[i31] = objArr7[11];
                return 0;
            case 27:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i32 + 1;
                objArr8[i32] = objArr8[12];
                return 0;
            case 28:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i33 + 1;
                iArr16[i33] = 92;
                return 0;
            case 29:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i34] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i34;
                iArr17[i34 - 1] = iArr17[i34 - 1] / iArr17[i34];
                int i35 = i34 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i35;
                this.MediaBrowserCompatSearchResultReceiver[i35] = null;
                return 0;
            case 30:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i36;
                this.read = iArr18[i36];
                return 0;
            case 31:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i37 + 1;
                iArr19[i37] = 0;
                return 0;
            case 32:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 + 1;
                iArr20[i38] = 1;
                return 0;
            case 33:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i39 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i39] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i39 + 2;
                iArr21[i39 + 1] = 2;
                return 0;
            case 34:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr22[i40] = 19;
                this.MediaBrowserCompatCustomActionResultReceiver = i40;
                iArr22[i40 - 1] = iArr22[i40 - 1] + iArr22[i40];
                return 0;
            case 35:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr23[i41] = iArr23[i41 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 2;
                iArr23[i41 + 1] = 128;
                return 0;
            case 36:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr24[i42] = 7;
                iArr24[i42 - 1] = iArr24[i42 - 1] + iArr24[i42];
                this.MediaBrowserCompatCustomActionResultReceiver = i42 + 1;
                iArr24[i42] = iArr24[i42 - 1];
                return 0;
            case 37:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr25[i43] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i43;
                iArr25[i43 - 1] = iArr25[i43 - 1] % iArr25[i43];
                return 0;
            case 38:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i44 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i44 + 1;
                objArr9[i44] = null;
                return 0;
            case 39:
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i45 + 1;
                iArr26[i45] = 24;
                return 0;
            case 40:
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i46 + 1;
                iArr27[i46] = 75;
                return 0;
            case 41:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i47 + 1;
                objArr10[i47] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 42:
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr28[i48] = 109;
                iArr28[i48 - 1] = iArr28[i48 - 1] + iArr28[i48];
                this.MediaBrowserCompatCustomActionResultReceiver = i48 + 1;
                iArr28[i48] = iArr28[i48 - 1];
                return 0;
            case 43:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i49 + 1;
                iArr29[i49] = 117;
                return 0;
            case 44:
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr30[i50] = 111;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                iArr30[i50 - 1] = iArr30[i50 - 1] + iArr30[i50];
                return 0;
            case 45:
                int[] iArr31 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr31[i51] = 5;
                this.MediaBrowserCompatCustomActionResultReceiver = i51;
                iArr31[i51 - 1] = iArr31[i51 - 1] + iArr31[i51];
                return 0;
            case 46:
                int[] iArr32 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i52 + 1;
                iArr32[i52] = 65;
                return 0;
            case 47:
                int[] iArr33 = this.AudioAttributesImplApi21Parcelizer;
                int i53 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i53 + 1;
                iArr33[i53] = 23;
                return 0;
            case 48:
                int[] iArr34 = this.AudioAttributesImplApi21Parcelizer;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i54 + 1;
                iArr34[i54] = 61;
                return 0;
            case 49:
                int[] iArr35 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i55 + 1;
                iArr35[i55] = 0;
                return 0;
            case 50:
                int i56 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i57 = i56 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i57;
                int[] iArr36 = this.AudioAttributesImplApi21Parcelizer;
                iArr36[i56 - 2] = iArr36[i56 - 2] / iArr36[i57];
                return 0;
            case 51:
                int[] iArr37 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i58 + 1;
                iArr37[i58] = 66;
                return 0;
            case 52:
                int[] iArr38 = this.AudioAttributesImplApi21Parcelizer;
                int i59 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i59 + 1;
                iArr38[i59] = 87;
                return 0;
            case 53:
                int[] iArr39 = this.AudioAttributesImplApi21Parcelizer;
                int i60 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i60 + 1;
                iArr39[i60] = 15;
                return 0;
            case 54:
                int[] iArr40 = this.AudioAttributesImplApi21Parcelizer;
                int i61 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr40[i61] = 53;
                iArr40[i61 - 1] = iArr40[i61 - 1] + iArr40[i61];
                this.MediaBrowserCompatCustomActionResultReceiver = i61 + 1;
                iArr40[i61] = iArr40[i61 - 1];
                return 0;
            case 55:
                int[] iArr41 = this.AudioAttributesImplApi21Parcelizer;
                int i62 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i62 + 1;
                iArr41[i62] = 41;
                return 0;
            case 56:
                int[] iArr42 = this.AudioAttributesImplApi21Parcelizer;
                int i63 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i63 + 1;
                iArr42[i63] = 32;
                return 0;
            case 57:
                int[] iArr43 = this.AudioAttributesImplApi21Parcelizer;
                int i64 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i64 + 1;
                iArr43[i64] = 91;
                return 0;
            case 58:
                int i65 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i66 = i65 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i66;
                int[] iArr44 = this.AudioAttributesImplApi21Parcelizer;
                iArr44[i65 - 2] = iArr44[i65 - 2] % iArr44[i66];
                int i67 = i65 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i67;
                this.MediaBrowserCompatSearchResultReceiver[i67] = null;
                return 0;
            case 59:
                int[] iArr45 = this.AudioAttributesImplApi21Parcelizer;
                int i68 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i68 + 1;
                iArr45[i68] = 115;
                return 0;
            case 60:
                int i69 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i70 = i69 - 1;
                int[] iArr46 = this.AudioAttributesImplApi21Parcelizer;
                iArr46[i69 - 2] = iArr46[i69 - 2] + iArr46[i70];
                iArr46[i70] = iArr46[i69 - 2];
                this.MediaBrowserCompatCustomActionResultReceiver = i69 + 1;
                iArr46[i69] = 128;
                return 0;
            case 61:
                int[] iArr47 = this.AudioAttributesImplApi21Parcelizer;
                int i71 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr47[i71] = 60;
                this.MediaBrowserCompatCustomActionResultReceiver = i71 + 2;
                iArr47[i71 + 1] = 0;
                return 0;
            case 62:
                int[] iArr48 = this.AudioAttributesImplApi21Parcelizer;
                int i72 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr48[i72] = 13;
                iArr48[i72 - 1] = iArr48[i72 - 1] + iArr48[i72];
                this.MediaBrowserCompatCustomActionResultReceiver = i72 + 1;
                iArr48[i72] = iArr48[i72 - 1];
                return 0;
            case 63:
                int[] iArr49 = this.AudioAttributesImplApi21Parcelizer;
                int i73 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i73 + 1;
                iArr49[i73] = 101;
                return 0;
            case 64:
                int i74 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i75 = i74 - 1;
                int[] iArr50 = this.AudioAttributesImplApi21Parcelizer;
                iArr50[i74 - 2] = iArr50[i74 - 2] + iArr50[i75];
                this.MediaBrowserCompatCustomActionResultReceiver = i74;
                iArr50[i75] = iArr50[i74 - 2];
                return 0;
            case 65:
                int[] iArr51 = this.AudioAttributesImplApi21Parcelizer;
                int i76 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i76 + 1;
                iArr51[i76] = iArr51[12];
                return 0;
            case 66:
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i77 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i77 + 1;
                objArr11[i77] = objArr11[13];
                return 0;
            case 67:
                int[] iArr52 = this.AudioAttributesImplApi21Parcelizer;
                int i78 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i78 + 1;
                iArr52[i78] = 2;
                return 0;
            case 68:
                int[] iArr53 = this.AudioAttributesImplApi21Parcelizer;
                int i79 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i79 + 1;
                iArr53[i79] = 25;
                return 0;
            case 69:
                int[] iArr54 = this.AudioAttributesImplApi21Parcelizer;
                int i80 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj3 = objArr12[i80 - 1];
                objArr12[i80 - 1] = null;
                iArr54[i80 - 1] = ((int[]) obj3).length;
                return 0;
            case 70:
                int[] iArr55 = this.AudioAttributesImplApi21Parcelizer;
                int i81 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i81 + 1;
                iArr55[i81] = 14;
                return 0;
            case 71:
                int[] iArr56 = this.AudioAttributesImplApi21Parcelizer;
                int i82 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i82 + 1;
                iArr56[i82] = 57;
                return 0;
            case 72:
                this.read = this.AudioAttributesImplApi21Parcelizer[this.MediaBrowserCompatCustomActionResultReceiver - 1];
                return 0;
            case 73:
                int[] iArr57 = this.AudioAttributesImplApi21Parcelizer;
                int i83 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr57[i83] = 7;
                this.MediaBrowserCompatCustomActionResultReceiver = i83;
                iArr57[i83 - 1] = iArr57[i83 - 1] + iArr57[i83];
                return 0;
            case 74:
                int[] iArr58 = this.AudioAttributesImplApi21Parcelizer;
                int i84 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr58[i84] = 37;
                iArr58[i84 - 1] = iArr58[i84 - 1] + iArr58[i84];
                this.MediaBrowserCompatCustomActionResultReceiver = i84 + 1;
                iArr58[i84] = iArr58[i84 - 1];
                return 0;
            case 75:
                int[] iArr59 = this.AudioAttributesImplApi21Parcelizer;
                int i85 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr59[i85] = 73;
                this.MediaBrowserCompatCustomActionResultReceiver = i85;
                iArr59[i85 - 1] = iArr59[i85 - 1] + iArr59[i85];
                return 0;
            case 76:
                int[] iArr60 = this.AudioAttributesImplApi21Parcelizer;
                int i86 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i86 + 1;
                iArr60[i86] = 97;
                return 0;
            case 77:
                int[] iArr61 = this.AudioAttributesImplApi21Parcelizer;
                int i87 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i87 + 1;
                iArr61[i87] = 99;
                return 0;
            case 78:
                int[] iArr62 = this.AudioAttributesImplApi21Parcelizer;
                int i88 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr62[i88] = 95;
                iArr62[i88 - 1] = iArr62[i88 - 1] + iArr62[i88];
                this.MediaBrowserCompatCustomActionResultReceiver = i88 + 1;
                iArr62[i88] = iArr62[i88 - 1];
                return 0;
            case 79:
                int[] iArr63 = this.AudioAttributesImplApi21Parcelizer;
                int i89 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr63[i89] = 47;
                this.MediaBrowserCompatCustomActionResultReceiver = i89;
                iArr63[i89 - 1] = iArr63[i89 - 1] + iArr63[i89];
                return 0;
            case 80:
                int[] iArr64 = this.AudioAttributesImplApi21Parcelizer;
                int i90 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr64[i90] = 43;
                iArr64[i90 - 1] = iArr64[i90 - 1] + iArr64[i90];
                this.MediaBrowserCompatCustomActionResultReceiver = i90 + 1;
                iArr64[i90] = iArr64[i90 - 1];
                return 0;
            case 81:
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                int i91 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i91 + 1;
                objArr13[i91] = null;
                int[] iArr65 = this.AudioAttributesImplApi21Parcelizer;
                Object obj4 = objArr13[i91];
                objArr13[i91] = null;
                iArr65[i91] = ((int[]) obj4).length;
                this.MediaBrowserCompatCustomActionResultReceiver = i91;
                objArr13[i91] = null;
                return 0;
            case 82:
                long[] jArr = this.MediaBrowserCompatMediaItem;
                int i92 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i92 + 1;
                this.write = jArr[i92];
                return 0;
            case 83:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i93 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr14[i93] = objArr14[11];
                long[] jArr2 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatCustomActionResultReceiver = i93 + 2;
                jArr2[i93 + 1] = jArr2[12];
                return 0;
            case 84:
                int[] iArr66 = this.AudioAttributesImplApi21Parcelizer;
                int i94 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i94 + 1;
                iArr66[i94] = 9;
                return 0;
            case 85:
                long[] jArr3 = this.MediaBrowserCompatMediaItem;
                int i95 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i95 + 1;
                jArr3[i95] = this.IconCompatParcelizer;
                return 0;
            case 86:
                long[] jArr4 = this.MediaBrowserCompatMediaItem;
                int i96 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i96 + 1;
                jArr4[i96] = 0;
                return 0;
            case 87:
                int i97 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i98 = i97 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i98;
                long[] jArr5 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer[i97 - 2] = (jArr5[i97 - 2] > jArr5[i98] ? 1 : (jArr5[i97 - 2] == jArr5[i98] ? 0 : -1));
                return 0;
            case 88:
                int i99 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = i99 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i100;
                int[] iArr67 = this.AudioAttributesImplApi21Parcelizer;
                iArr67[i99 - 2] = iArr67[i99 - 2] - iArr67[i100];
                return 0;
            case 89:
                long[] jArr6 = this.MediaBrowserCompatMediaItem;
                int i101 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i101 + 1;
                jArr6[i101] = jArr6[12];
                return 0;
            case 90:
                int[] iArr68 = this.AudioAttributesImplApi21Parcelizer;
                int i102 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i102 + 1;
                iArr68[i102] = 35;
                return 0;
            case 91:
                int i103 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i103;
                long[] jArr7 = this.MediaBrowserCompatMediaItem;
                jArr7[12] = jArr7[i103];
                return 0;
            case 92:
                long[] jArr8 = this.MediaBrowserCompatMediaItem;
                int i104 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr8[i104] = jArr8[i104 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i104;
                jArr8[14] = jArr8[i104];
                return 0;
            case 93:
                int i105 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i105;
                this.read = this.AudioAttributesImplApi21Parcelizer[i105] <= 0 ? 0 : 1;
                return 0;
            case 94:
                long[] jArr9 = this.MediaBrowserCompatMediaItem;
                int i106 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i106 + 1;
                jArr9[i106] = jArr9[14];
                return 0;
            case 95:
                int[] iArr69 = this.AudioAttributesImplApi21Parcelizer;
                int i107 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr69[i107] = 121;
                this.MediaBrowserCompatCustomActionResultReceiver = i107;
                iArr69[i107 - 1] = iArr69[i107 - 1] + iArr69[i107];
                return 0;
            case 96:
                int[] iArr70 = this.AudioAttributesImplApi21Parcelizer;
                int i108 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i108 + 1;
                iArr70[i108] = 3;
                return 0;
            case 97:
                int[] iArr71 = this.AudioAttributesImplApi21Parcelizer;
                int i109 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i109 + 1;
                iArr71[i109] = 77;
                return 0;
            case 98:
                int[] iArr72 = this.AudioAttributesImplApi21Parcelizer;
                int i110 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i110 + 1;
                iArr72[i110] = 53;
                return 0;
            case 99:
                int[] iArr73 = this.AudioAttributesImplApi21Parcelizer;
                int i111 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i111 + 1;
                iArr73[i111] = 5;
                return 0;
            case 100:
                int i112 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i113 = i112 - 1;
                long[] jArr10 = this.MediaBrowserCompatMediaItem;
                jArr10[i112 - 2] = jArr10[i112 - 2] - jArr10[i113];
                this.MediaBrowserCompatCustomActionResultReceiver = i112;
                jArr10[i113] = jArr10[i112 - 2];
                return 0;
            case 101:
                int i114 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i115 = i114 - 1;
                long[] jArr11 = this.MediaBrowserCompatMediaItem;
                jArr11[14] = jArr11[i115];
                jArr11[i115] = jArr11[12];
                int i116 = i114 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i116;
                this.AudioAttributesImplApi21Parcelizer[i114 - 2] = (jArr11[i114 - 2] > jArr11[i116] ? 1 : (jArr11[i114 - 2] == jArr11[i116] ? 0 : -1));
                return 0;
            case 102:
                int i117 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i118 = i117 - 1;
                long[] jArr12 = this.MediaBrowserCompatMediaItem;
                jArr12[i117 - 2] = jArr12[i117 - 2] * jArr12[i118];
                this.MediaBrowserCompatCustomActionResultReceiver = i117;
                jArr12[i118] = jArr12[i117 - 2];
                return 0;
            case 103:
                int i119 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i120 = i119 - 1;
                long[] jArr13 = this.MediaBrowserCompatMediaItem;
                jArr13[14] = jArr13[i120];
                this.MediaBrowserCompatCustomActionResultReceiver = i119;
                jArr13[i120] = jArr13[12];
                return 0;
            case 104:
                int[] iArr74 = this.AudioAttributesImplApi21Parcelizer;
                int i121 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr74[i121] = 81;
                iArr74[i121 - 1] = iArr74[i121 - 1] + iArr74[i121];
                this.MediaBrowserCompatCustomActionResultReceiver = i121 + 1;
                iArr74[i121] = iArr74[i121 - 1];
                return 0;
            case 105:
                int[] iArr75 = this.AudioAttributesImplApi21Parcelizer;
                int i122 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i122 + 1;
                iArr75[i122] = 46;
                return 0;
            case 106:
                int[] iArr76 = this.AudioAttributesImplApi21Parcelizer;
                int i123 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i123 + 1;
                iArr76[i123] = 56;
                return 0;
            case 107:
                int[] iArr77 = this.AudioAttributesImplApi21Parcelizer;
                int i124 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr77[i124] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i124;
                iArr77[i124 - 1] = iArr77[i124 - 1] + iArr77[i124];
                return 0;
            case 108:
                int[] iArr78 = this.AudioAttributesImplApi21Parcelizer;
                int i125 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr78[i125] = 99;
                this.MediaBrowserCompatCustomActionResultReceiver = i125 + 2;
                iArr78[i125 + 1] = 0;
                return 0;
            case 109:
                int i126 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i127 = i126 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i127;
                int[] iArr79 = this.AudioAttributesImplApi21Parcelizer;
                iArr79[i126 - 2] = iArr79[i126 - 2] / iArr79[i127];
                int i128 = i126 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i128;
                this.MediaBrowserCompatSearchResultReceiver[i128] = null;
                return 0;
            case 110:
                int[] iArr80 = this.AudioAttributesImplApi21Parcelizer;
                int i129 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr80[i129] = 111;
                iArr80[i129 - 1] = iArr80[i129 - 1] + iArr80[i129];
                this.MediaBrowserCompatCustomActionResultReceiver = i129 + 1;
                iArr80[i129] = iArr80[i129 - 1];
                return 0;
            case 111:
                int[] iArr81 = this.AudioAttributesImplApi21Parcelizer;
                int i130 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr81[i130] = 69;
                this.MediaBrowserCompatCustomActionResultReceiver = i130;
                iArr81[i130 - 1] = iArr81[i130 - 1] + iArr81[i130];
                return 0;
            case 112:
                int[] iArr82 = this.AudioAttributesImplApi21Parcelizer;
                int i131 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i131 + 1;
                iArr82[i131] = 43;
                return 0;
            case 113:
                int[] iArr83 = this.AudioAttributesImplApi21Parcelizer;
                int i132 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i132 + 1;
                iArr83[i132] = 34;
                return 0;
            case 114:
                int[] iArr84 = this.AudioAttributesImplApi21Parcelizer;
                int i133 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i133 + 1;
                iArr84[i133] = 49;
                return 0;
            case 115:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i134 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr15[i134] = objArr15[i134 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i134;
                Object obj5 = objArr15[i134];
                objArr15[i134] = null;
                objArr15[11] = obj5;
                return 0;
            case 116:
                int i135 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i135;
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj6 = objArr16[i135];
                objArr16[i135] = null;
                this.read = obj6 != null ? 0 : 1;
                return 0;
            case 117:
                int i136 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i136;
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj7 = objArr17[i136];
                objArr17[i136] = null;
                objArr17[12] = obj7;
                return 0;
            case 118:
                int i137 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i138 = i137 - 1;
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj8 = objArr18[i138];
                objArr18[i138] = null;
                objArr18[13] = obj8;
                this.MediaBrowserCompatCustomActionResultReceiver = i137;
                objArr18[i138] = objArr18[12];
                return 0;
            case 119:
                int i139 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i140 = i139 - 1;
                Object[] objArr19 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj9 = objArr19[i140];
                objArr19[i140] = null;
                objArr19[11] = obj9;
                this.MediaBrowserCompatCustomActionResultReceiver = i139;
                objArr19[i140] = objArr19[12];
                return 0;
            case 120:
                int[] iArr85 = this.AudioAttributesImplApi21Parcelizer;
                int i141 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr85[i141] = 48;
                iArr85[i141 + 1] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i141 + 3;
                iArr85[i141 + 2] = 0;
                return 0;
            case 121:
                int i142 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i142;
                Object[] objArr20 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj10 = objArr20[i142];
                objArr20[i142] = null;
                objArr20[11] = obj10;
                return 0;
            case 122:
                int[] iArr86 = this.AudioAttributesImplApi21Parcelizer;
                int i143 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr86[i143] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i143 + 2;
                iArr86[i143 + 1] = 0;
                return 0;
            case 123:
                int[] iArr87 = this.AudioAttributesImplApi21Parcelizer;
                int i144 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i144 + 1;
                iArr87[i144] = 37;
                return 0;
            case 124:
                int[] iArr88 = this.AudioAttributesImplApi21Parcelizer;
                int i145 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr88[i145] = 123;
                iArr88[i145 - 1] = iArr88[i145 - 1] + iArr88[i145];
                this.MediaBrowserCompatCustomActionResultReceiver = i145 + 1;
                iArr88[i145] = iArr88[i145 - 1];
                return 0;
            case 125:
                int[] iArr89 = this.AudioAttributesImplApi21Parcelizer;
                int i146 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i146 + 1;
                iArr89[i146] = 45;
                return 0;
            case 126:
                int[] iArr90 = this.AudioAttributesImplApi21Parcelizer;
                int i147 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr90[i147] = 63;
                iArr90[i147 - 1] = iArr90[i147 - 1] + iArr90[i147];
                this.MediaBrowserCompatCustomActionResultReceiver = i147 + 1;
                iArr90[i147] = iArr90[i147 - 1];
                return 0;
            case 127:
                int[] iArr91 = this.AudioAttributesImplApi21Parcelizer;
                int i148 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr91[i148] = 11;
                iArr91[i148 - 1] = iArr91[i148 - 1] + iArr91[i148];
                this.MediaBrowserCompatCustomActionResultReceiver = i148 + 1;
                iArr91[i148] = iArr91[i148 - 1];
                return 0;
            case 128:
                int i149 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i150 = i149 - 1;
                Object[] objArr21 = this.MediaBrowserCompatSearchResultReceiver;
                objArr21[i150] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i149;
                objArr21[i150] = objArr21[11];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                Object[] objArr22 = this.MediaBrowserCompatSearchResultReceiver;
                int i151 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr22[i151] = objArr22[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i151 + 2;
                objArr22[i151 + 1] = objArr22[i151];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int i152 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i153 = i152 - 1;
                Object[] objArr23 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr23[i153];
                objArr23[i153] = null;
                objArr23[13] = obj11;
                this.MediaBrowserCompatCustomActionResultReceiver = i152;
                objArr23[i153] = objArr23[11];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int i154 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i154;
                Object[] objArr24 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj12 = objArr24[i154];
                objArr24[i154] = null;
                objArr24[14] = obj12;
                return 0;
            case 132:
                int i155 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i155;
                Object[] objArr25 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj13 = objArr25[i155];
                objArr25[i155] = null;
                this.read = obj13 == null ? 0 : 1;
                return 0;
            case 133:
                Object[] objArr26 = this.MediaBrowserCompatSearchResultReceiver;
                int i156 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr26[i156] = objArr26[13];
                this.MediaBrowserCompatCustomActionResultReceiver = i156;
                Object obj14 = objArr26[i156];
                objArr26[i156] = null;
                objArr26[12] = obj14;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                Object[] objArr27 = this.MediaBrowserCompatSearchResultReceiver;
                int i157 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr27[i157] = objArr27[14];
                this.MediaBrowserCompatCustomActionResultReceiver = i157 + 2;
                objArr27[i157 + 1] = objArr27[12];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                long[] jArr14 = this.MediaBrowserCompatMediaItem;
                int i158 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr14[i158] = jArr14[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i158;
                jArr14[i158 - 1] = jArr14[i158 - 1] - jArr14[i158];
                return 0;
            case 136:
                int i159 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i159;
                this.read = this.AudioAttributesImplApi21Parcelizer[i159] < 0 ? 0 : 1;
                return 0;
            case 137:
                int i160 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i161 = i160 - 1;
                this.MediaBrowserCompatSearchResultReceiver[i161] = null;
                int[] iArr92 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i160;
                iArr92[i161] = 1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr93 = this.AudioAttributesImplApi21Parcelizer;
                int i162 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr93[i162] = 4;
                this.MediaBrowserCompatCustomActionResultReceiver = i162 + 2;
                iArr93[i162 + 1] = 5;
                return 0;
            case 139:
                int[] iArr94 = this.AudioAttributesImplApi21Parcelizer;
                int i163 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i163 + 1;
                iArr94[i163] = 11;
                return 0;
            case 140:
                int[] iArr95 = this.AudioAttributesImplApi21Parcelizer;
                int i164 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i164 + 1;
                iArr95[i164] = 107;
                return 0;
            case 141:
                int[] iArr96 = this.AudioAttributesImplApi21Parcelizer;
                int i165 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i165 + 1;
                iArr96[i165] = 71;
                return 0;
            case 142:
                int[] iArr97 = this.AudioAttributesImplApi21Parcelizer;
                int i166 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr97[i166] = 103;
                iArr97[i166 - 1] = iArr97[i166 - 1] + iArr97[i166];
                this.MediaBrowserCompatCustomActionResultReceiver = i166 + 1;
                iArr97[i166] = iArr97[i166 - 1];
                return 0;
            case 143:
                int[] iArr98 = this.AudioAttributesImplApi21Parcelizer;
                int i167 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr98[i167] = 125;
                this.MediaBrowserCompatCustomActionResultReceiver = i167;
                iArr98[i167 - 1] = iArr98[i167 - 1] + iArr98[i167];
                return 0;
            case 144:
                int[] iArr99 = this.AudioAttributesImplApi21Parcelizer;
                int i168 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr99[i168] = 33;
                iArr99[i168 - 1] = iArr99[i168 - 1] + iArr99[i168];
                this.MediaBrowserCompatCustomActionResultReceiver = i168 + 1;
                iArr99[i168] = iArr99[i168 - 1];
                return 0;
            case 145:
                int[] iArr100 = this.AudioAttributesImplApi21Parcelizer;
                int i169 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr100[i169] = 2;
                iArr100[i169 + 1] = 0;
                int i170 = i169 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i170;
                iArr100[i169] = iArr100[i169] / iArr100[i170];
                return 0;
            case 146:
                int[] iArr101 = this.AudioAttributesImplApi21Parcelizer;
                int i171 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr101[i171] = 29;
                this.MediaBrowserCompatCustomActionResultReceiver = i171;
                iArr101[i171 - 1] = iArr101[i171 - 1] + iArr101[i171];
                return 0;
            case 147:
                int[] iArr102 = this.AudioAttributesImplApi21Parcelizer;
                int i172 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr102[i172] = 89;
                iArr102[i172 + 1] = 0;
                int i173 = i172 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i173;
                iArr102[i172] = iArr102[i172] / iArr102[i173];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int[] iArr103 = this.AudioAttributesImplApi21Parcelizer;
                int i174 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i174 + 1;
                iArr103[i174] = 111;
                return 0;
            case 149:
                int[] iArr104 = this.AudioAttributesImplApi21Parcelizer;
                int i175 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr104[i175] = 92;
                iArr104[i175 + 1] = 0;
                int i176 = i175 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i176;
                iArr104[i175] = iArr104[i175] / iArr104[i176];
                return 0;
            case 150:
                int[] iArr105 = this.AudioAttributesImplApi21Parcelizer;
                int i177 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i177 + 1;
                iArr105[i177] = 76;
                return 0;
            case 151:
                Object[] objArr28 = this.MediaBrowserCompatSearchResultReceiver;
                int i178 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr28[i178] = objArr28[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i178 + 2;
                objArr28[i178 + 1] = objArr28[11];
                return 0;
            case 152:
                int[] iArr106 = this.AudioAttributesImplApi21Parcelizer;
                int i179 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr106[i179] = 103;
                this.MediaBrowserCompatCustomActionResultReceiver = i179;
                iArr106[i179 - 1] = iArr106[i179 - 1] + iArr106[i179];
                return 0;
            case 153:
                int[] iArr107 = this.AudioAttributesImplApi21Parcelizer;
                int i180 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i180 + 1;
                iArr107[i180] = 81;
                return 0;
            case 154:
                int[] iArr108 = this.AudioAttributesImplApi21Parcelizer;
                int i181 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i181 + 1;
                iArr108[i181] = 16;
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr109 = this.AudioAttributesImplApi21Parcelizer;
                int i182 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i182 + 1;
                iArr109[i182] = 51;
                return 0;
            case 156:
                int[] iArr110 = this.AudioAttributesImplApi21Parcelizer;
                int i183 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i183 + 1;
                iArr110[i183] = 73;
                return 0;
            case 157:
                long[] jArr15 = this.MediaBrowserCompatMediaItem;
                int i184 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr15[i184] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i184;
                this.AudioAttributesImplApi21Parcelizer[i184 - 1] = (jArr15[i184 - 1] > jArr15[i184] ? 1 : (jArr15[i184 - 1] == jArr15[i184] ? 0 : -1));
                return 0;
            case 158:
                int[] iArr111 = this.AudioAttributesImplApi21Parcelizer;
                int i185 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i185 + 1;
                iArr111[i185] = -1;
                return 0;
            case 159:
                int[] iArr112 = this.AudioAttributesImplApi21Parcelizer;
                int i186 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr112[i186] = 97;
                iArr112[i186 - 1] = iArr112[i186 - 1] + iArr112[i186];
                this.MediaBrowserCompatCustomActionResultReceiver = i186 + 1;
                iArr112[i186] = iArr112[i186 - 1];
                return 0;
            case 160:
                int[] iArr113 = this.AudioAttributesImplApi21Parcelizer;
                int i187 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i187 + 1;
                iArr113[i187] = 96;
                return 0;
            case 161:
                int[] iArr114 = this.AudioAttributesImplApi21Parcelizer;
                int i188 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i188 + 1;
                iArr114[i188] = 52;
                return 0;
            case 162:
                int[] iArr115 = this.AudioAttributesImplApi21Parcelizer;
                int i189 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i189 + 1;
                iArr115[i189] = 64;
                return 0;
            case 163:
                int[] iArr116 = this.AudioAttributesImplApi21Parcelizer;
                int i190 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i190 + 1;
                iArr116[i190] = 78;
                return 0;
            case 164:
                int[] iArr117 = this.AudioAttributesImplApi21Parcelizer;
                int i191 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i191 + 1;
                iArr117[i191] = 7;
                return 0;
            case 165:
                int[] iArr118 = this.AudioAttributesImplApi21Parcelizer;
                int i192 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr118[i192] = 63;
                this.MediaBrowserCompatCustomActionResultReceiver = i192;
                iArr118[i192 - 1] = iArr118[i192 - 1] + iArr118[i192];
                return 0;
            case 166:
                int[] iArr119 = this.AudioAttributesImplApi21Parcelizer;
                int i193 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i193 + 1;
                iArr119[i193] = 59;
                return 0;
            case 167:
                int[] iArr120 = this.AudioAttributesImplApi21Parcelizer;
                int i194 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i194 + 1;
                iArr120[i194] = 47;
                return 0;
            case 168:
                int[] iArr121 = this.AudioAttributesImplApi21Parcelizer;
                int i195 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i195 + 1;
                iArr121[i195] = 74;
                return 0;
            case 169:
                int[] iArr122 = this.AudioAttributesImplApi21Parcelizer;
                int i196 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i196 + 1;
                iArr122[i196] = 1;
                return 0;
            case 170:
                int[] iArr123 = this.AudioAttributesImplApi21Parcelizer;
                int i197 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i197 + 1;
                iArr123[i197] = 55;
                return 0;
            case 171:
                Object[] objArr29 = this.MediaBrowserCompatSearchResultReceiver;
                int i198 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr29[i198] = objArr29[11];
                int[] iArr124 = this.AudioAttributesImplApi21Parcelizer;
                iArr124[i198 + 1] = iArr124[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i198 + 3;
                objArr29[i198 + 2] = objArr29[14];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int i199 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i199;
                Object[] objArr30 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj15 = objArr30[i199];
                objArr30[i199] = null;
                objArr30[13] = obj15;
                return 0;
            case 173:
                Object[] objArr31 = this.MediaBrowserCompatSearchResultReceiver;
                int i200 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr31[i200] = objArr31[11];
                int[] iArr125 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i200 + 2;
                iArr125[i200 + 1] = iArr125[12];
                return 0;
            case 174:
                int i201 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i202 = i201 - 1;
                Object[] objArr32 = this.MediaBrowserCompatSearchResultReceiver;
                objArr32[i202] = null;
                objArr32[i202] = objArr32[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i201 + 1;
                objArr32[i201] = objArr32[13];
                return 0;
            case 175:
                int[] iArr126 = this.AudioAttributesImplApi21Parcelizer;
                int i203 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr126[i203] = 47;
                iArr126[i203 - 1] = iArr126[i203 - 1] + iArr126[i203];
                this.MediaBrowserCompatCustomActionResultReceiver = i203 + 1;
                iArr126[i203] = iArr126[i203 - 1];
                return 0;
            case 176:
                int[] iArr127 = this.AudioAttributesImplApi21Parcelizer;
                int i204 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr127[i204] = 62;
                iArr127[i204 + 1] = 0;
                int i205 = i204 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i205;
                iArr127[i204] = iArr127[i204] / iArr127[i205];
                return 0;
            case 177:
                int[] iArr128 = this.AudioAttributesImplApi21Parcelizer;
                int i206 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i206 + 1;
                iArr128[i206] = 93;
                return 0;
            case 178:
                int[] iArr129 = this.AudioAttributesImplApi21Parcelizer;
                int i207 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i207 + 1;
                iArr129[i207] = 62;
                return 0;
            case 179:
                Object[] objArr33 = this.MediaBrowserCompatSearchResultReceiver;
                int i208 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr33[i208] = objArr33[i208 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i208;
                Object obj16 = objArr33[i208];
                objArr33[i208] = null;
                objArr33[12] = obj16;
                return 0;
            case 180:
                int[] iArr130 = this.AudioAttributesImplApi21Parcelizer;
                int i209 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr130[i209] = 91;
                iArr130[i209 - 1] = iArr130[i209 - 1] + iArr130[i209];
                this.MediaBrowserCompatCustomActionResultReceiver = i209 + 1;
                iArr130[i209] = iArr130[i209 - 1];
                return 0;
            case 181:
                int[] iArr131 = this.AudioAttributesImplApi21Parcelizer;
                int i210 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr131[i210] = 107;
                this.MediaBrowserCompatCustomActionResultReceiver = i210;
                iArr131[i210 - 1] = iArr131[i210 - 1] + iArr131[i210];
                return 0;
            case 182:
                int[] iArr132 = this.AudioAttributesImplApi21Parcelizer;
                int i211 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr132[i211] = 49;
                iArr132[i211 - 1] = iArr132[i211 - 1] + iArr132[i211];
                this.MediaBrowserCompatCustomActionResultReceiver = i211 + 1;
                iArr132[i211] = iArr132[i211 - 1];
                return 0;
            case 183:
                int i212 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i212;
                int[] iArr133 = this.AudioAttributesImplApi21Parcelizer;
                iArr133[13] = iArr133[i212];
                return 0;
            case 184:
                int i213 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i213;
                int[] iArr134 = this.AudioAttributesImplApi21Parcelizer;
                iArr134[14] = iArr134[i213];
                return 0;
            case 185:
                int i214 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i215 = i214 - 1;
                int[] iArr135 = this.AudioAttributesImplApi21Parcelizer;
                iArr135[15] = iArr135[i215];
                Object[] objArr34 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i214;
                objArr34[i215] = objArr34[11];
                return 0;
            case 186:
                int i216 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i216;
                int[] iArr136 = this.AudioAttributesImplApi21Parcelizer;
                iArr136[16] = iArr136[i216];
                return 0;
            case 187:
                Object[] objArr35 = this.MediaBrowserCompatSearchResultReceiver;
                int i217 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr35[i217] = objArr35[12];
                int[] iArr137 = this.AudioAttributesImplApi21Parcelizer;
                iArr137[i217 + 1] = iArr137[13];
                this.MediaBrowserCompatCustomActionResultReceiver = i217 + 3;
                iArr137[i217 + 2] = iArr137[15];
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr138 = this.AudioAttributesImplApi21Parcelizer;
                int i218 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i218 + 1;
                iArr138[i218] = iArr138[14];
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr139 = this.AudioAttributesImplApi21Parcelizer;
                int i219 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i219 + 1;
                iArr139[i219] = iArr139[16];
                return 0;
            case 190:
                int[] iArr140 = this.AudioAttributesImplApi21Parcelizer;
                int i220 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr140[i220] = 51;
                iArr140[i220 - 1] = iArr140[i220 - 1] + iArr140[i220];
                this.MediaBrowserCompatCustomActionResultReceiver = i220 + 1;
                iArr140[i220] = iArr140[i220 - 1];
                return 0;
            case 191:
                int[] iArr141 = this.AudioAttributesImplApi21Parcelizer;
                int i221 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i221 + 1;
                iArr141[i221] = 89;
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int[] iArr142 = this.AudioAttributesImplApi21Parcelizer;
                int i222 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr142[i222] = 1;
                iArr142[i222 - 1] = iArr142[i222 - 1] + iArr142[i222];
                this.MediaBrowserCompatCustomActionResultReceiver = i222 + 1;
                iArr142[i222] = iArr142[i222 - 1];
                return 0;
            case 193:
                int[] iArr143 = this.AudioAttributesImplApi21Parcelizer;
                int i223 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr36 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj17 = objArr36[i223 - 1];
                objArr36[i223 - 1] = null;
                iArr143[i223 - 1] = ((int[]) obj17).length;
                int i224 = i223 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i224;
                objArr36[i224] = null;
                return 0;
            case 194:
                int[] iArr144 = this.AudioAttributesImplApi21Parcelizer;
                int i225 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i225 + 1;
                iArr144[i225] = 69;
                return 0;
            case 195:
                int[] iArr145 = this.AudioAttributesImplApi21Parcelizer;
                int i226 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i226 + 1;
                iArr145[i226] = 26;
                return 0;
            case 196:
                Object[] objArr37 = this.MediaBrowserCompatSearchResultReceiver;
                int i227 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr37[i227] = objArr37[11];
                int[] iArr146 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i227 + 2;
                iArr146[i227 + 1] = 1;
                return 0;
            case 197:
                int[] iArr147 = this.AudioAttributesImplApi21Parcelizer;
                int i228 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr147[i228] = 123;
                this.MediaBrowserCompatCustomActionResultReceiver = i228;
                iArr147[i228 - 1] = iArr147[i228 - 1] + iArr147[i228];
                return 0;
            case 198:
                int[] iArr148 = this.AudioAttributesImplApi21Parcelizer;
                int i229 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i229 + 1;
                iArr148[i229] = 63;
                return 0;
            case 199:
                int[] iArr149 = this.AudioAttributesImplApi21Parcelizer;
                int i230 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i230 + 1;
                iArr149[i230] = 88;
                return 0;
            case 200:
                int[] iArr150 = this.AudioAttributesImplApi21Parcelizer;
                int i231 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr150[i231] = 75;
                this.MediaBrowserCompatCustomActionResultReceiver = i231;
                iArr150[i231 - 1] = iArr150[i231 - 1] + iArr150[i231];
                return 0;
            case 201:
                int[] iArr151 = this.AudioAttributesImplApi21Parcelizer;
                int i232 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i232 + 1;
                iArr151[i232] = 39;
                return 0;
            case 202:
                int i233 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i233;
                int[] iArr152 = this.AudioAttributesImplApi21Parcelizer;
                iArr152[12] = iArr152[i233];
                return 0;
            case 203:
                int[] iArr153 = this.AudioAttributesImplApi21Parcelizer;
                int i234 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i234 + 1;
                iArr153[i234] = 120;
                return 0;
            case 204:
                int i235 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i236 = i235 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i236;
                int[] iArr154 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr154[i236] >= iArr154[i235 - 1] ? 0 : 1;
                return 0;
            case 205:
                int[] iArr155 = this.AudioAttributesImplApi21Parcelizer;
                int i237 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i237 + 1;
                iArr155[i237] = 4;
                return 0;
            case 206:
                int[] iArr156 = this.AudioAttributesImplApi21Parcelizer;
                int i238 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i238 + 1;
                iArr156[i238] = 29;
                return 0;
            case 207:
                int[] iArr157 = this.AudioAttributesImplApi21Parcelizer;
                int i239 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i239 + 1;
                iArr157[i239] = 36;
                return 0;
            case 208:
                int[] iArr158 = this.AudioAttributesImplApi21Parcelizer;
                int i240 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr158[i240] = 85;
                this.MediaBrowserCompatCustomActionResultReceiver = i240;
                iArr158[i240 - 1] = iArr158[i240 - 1] + iArr158[i240];
                return 0;
            case 209:
                int[] iArr159 = this.AudioAttributesImplApi21Parcelizer;
                int i241 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr159[i241] = 53;
                iArr159[i241 + 1] = 0;
                int i242 = i241 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i242;
                iArr159[i241] = iArr159[i241] / iArr159[i242];
                return 0;
            case 210:
                int[] iArr160 = this.AudioAttributesImplApi21Parcelizer;
                int i243 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr160[i243] = iArr160[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i243 + 2;
                iArr160[i243 + 1] = 1;
                return 0;
            case 211:
                int i244 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i245 = i244 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i245;
                int[] iArr161 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr161[i245] != iArr161[i244 - 1] ? 0 : 1;
                return 0;
            case 212:
                int[] iArr162 = this.AudioAttributesImplApi21Parcelizer;
                int i246 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr162[i246] = iArr162[12];
                Object[] objArr38 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i246 + 2;
                objArr38[i246 + 1] = objArr38[13];
                return 0;
            case 213:
                Object[] objArr39 = this.MediaBrowserCompatSearchResultReceiver;
                int i247 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr39[i247] = objArr39[i247 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i247;
                Object obj18 = objArr39[i247];
                objArr39[i247] = null;
                objArr39[14] = obj18;
                return 0;
            case 214:
                int[] iArr163 = this.AudioAttributesImplApi21Parcelizer;
                int i248 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr163[i248] = 13;
                this.MediaBrowserCompatCustomActionResultReceiver = i248 + 2;
                iArr163[i248 + 1] = 0;
                return 0;
            case 215:
                int[] iArr164 = this.AudioAttributesImplApi21Parcelizer;
                int i249 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr164[i249] = 31;
                this.MediaBrowserCompatCustomActionResultReceiver = i249;
                iArr164[i249 - 1] = iArr164[i249 - 1] + iArr164[i249];
                return 0;
            case 216:
                int[] iArr165 = this.AudioAttributesImplApi21Parcelizer;
                int i250 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i250 + 1;
                iArr165[i250] = 83;
                return 0;
            case 217:
                int[] iArr166 = this.AudioAttributesImplApi21Parcelizer;
                int i251 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i251 + 1;
                iArr166[i251] = 22;
                return 0;
            case 218:
                Object[] objArr40 = this.MediaBrowserCompatSearchResultReceiver;
                int i252 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i252 + 1;
                objArr40[i252] = objArr40[i252 - 1];
                return 0;
            case 219:
                int i253 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i254 = i253 - 1;
                Object[] objArr41 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr41[i254];
                objArr41[i254] = null;
                objArr41[13] = obj19;
                int[] iArr167 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i253;
                iArr167[i254] = iArr167[12];
                return 0;
            case 220:
                int[] iArr168 = this.AudioAttributesImplApi21Parcelizer;
                int i255 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr168[i255] = 11;
                this.MediaBrowserCompatCustomActionResultReceiver = i255;
                iArr168[i255 - 1] = iArr168[i255 - 1] + iArr168[i255];
                return 0;
            case 221:
                int[] iArr169 = this.AudioAttributesImplApi21Parcelizer;
                int i256 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i256 + 1;
                iArr169[i256] = 42;
                return 0;
            case 222:
                int[] iArr170 = this.AudioAttributesImplApi21Parcelizer;
                int i257 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i257 + 1;
                iArr170[i257] = 54;
                return 0;
            case 223:
                int[] iArr171 = this.AudioAttributesImplApi21Parcelizer;
                int i258 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i258 + 1;
                iArr171[i258] = 135;
                return 0;
            case 224:
                int[] iArr172 = this.AudioAttributesImplApi21Parcelizer;
                int i259 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr172[i259] = 16;
                this.MediaBrowserCompatCustomActionResultReceiver = i259;
                iArr172[i259 - 1] = iArr172[i259 - 1] >> iArr172[i259];
                return 0;
            case 225:
                int i260 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i261 = i260 - 1;
                int[] iArr173 = this.AudioAttributesImplApi21Parcelizer;
                iArr173[i260 - 2] = iArr173[i260 - 2] + iArr173[i261];
                this.MediaBrowserCompatCustomActionResultReceiver = i260;
                iArr173[i261] = 1;
                return 0;
            case 226:
                int i262 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i263 = i262 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i263;
                int[] iArr174 = this.AudioAttributesImplApi21Parcelizer;
                iArr174[i262 - 2] = iArr174[i262 - 2] >> iArr174[i263];
                return 0;
            case 227:
                int[] iArr175 = this.AudioAttributesImplApi21Parcelizer;
                int i264 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr175[i264] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i264 + 2;
                iArr175[i264 + 1] = 144;
                return 0;
            case 228:
                long[] jArr16 = this.MediaBrowserCompatMediaItem;
                int i265 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr16[i265] = 0;
                int[] iArr176 = this.AudioAttributesImplApi21Parcelizer;
                iArr176[i265 - 1] = (jArr16[i265 - 1] > jArr16[i265] ? 1 : (jArr16[i265 - 1] == jArr16[i265] ? 0 : -1));
                int i266 = i265 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i266;
                iArr176[i265 - 2] = iArr176[i265 - 2] + iArr176[i266];
                return 0;
            case 229:
                int[] iArr177 = this.AudioAttributesImplApi21Parcelizer;
                int i267 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i267 + 1;
                iArr177[i267] = 5;
                return 0;
            case 230:
                float[] fArr = this.RatingCompat;
                int i268 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i268 + 1;
                fArr[i268] = this.RemoteActionCompatParcelizer;
                return 0;
            case 231:
                float[] fArr2 = this.RatingCompat;
                int i269 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i269 + 1;
                fArr2[i269] = 0.0f;
                return 0;
            case 232:
                int i270 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i271 = i270 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i271;
                float[] fArr3 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer[i270 - 2] = (fArr3[i270 - 2] > fArr3[i271] ? 1 : (fArr3[i270 - 2] == fArr3[i271] ? 0 : -1));
                return 0;
            case 233:
                int[] iArr178 = this.AudioAttributesImplApi21Parcelizer;
                int i272 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i272 + 1;
                iArr178[i272] = 13;
                return 0;
            case 234:
                int i273 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr179 = this.AudioAttributesImplApi21Parcelizer;
                iArr179[i273 - 2] = iArr179[i273 - 2] >> iArr179[i273 - 1];
                int i274 = i273 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i274;
                iArr179[i273 - 3] = iArr179[i273 - 3] - iArr179[i274];
                return 0;
            case 235:
                int[] iArr180 = this.AudioAttributesImplApi21Parcelizer;
                int i275 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i275 + 1;
                iArr180[i275] = 134;
                return 0;
            case 236:
                int[] iArr181 = this.AudioAttributesImplApi21Parcelizer;
                int i276 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr181[i276] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i276 + 2;
                iArr181[i276 + 1] = 141;
                return 0;
            case 237:
                int i277 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i278 = i277 - 1;
                int[] iArr182 = this.AudioAttributesImplApi21Parcelizer;
                iArr182[i277 - 2] = iArr182[i277 - 2] + iArr182[i278];
                this.MediaBrowserCompatCustomActionResultReceiver = i277;
                iArr182[i278] = 7;
                return 0;
            case 238:
                int[] iArr183 = this.AudioAttributesImplApi21Parcelizer;
                int i279 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr183[i279] = 48;
                this.MediaBrowserCompatCustomActionResultReceiver = i279 + 2;
                iArr183[i279 + 1] = 0;
                return 0;
            case 239:
                Object[] objArr42 = this.MediaBrowserCompatSearchResultReceiver;
                int i280 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj20 = objArr42[i280 - 1];
                objArr42[i280 - 1] = null;
                Object obj21 = objArr42[i280 - 2];
                objArr42[i280 - 2] = null;
                objArr42[i280 - 1] = obj21;
                objArr42[i280 - 2] = obj20;
                int[] iArr184 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i280 + 1;
                iArr184[i280] = 0;
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int i281 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i281;
                Object[] objArr43 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj22 = objArr43[i281];
                objArr43[i281] = null;
                objArr43[15] = obj22;
                return 0;
            case 241:
                int[] iArr185 = this.AudioAttributesImplApi21Parcelizer;
                int i282 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr185[i282] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i282 + 2;
                iArr185[i282 + 1] = 137;
                return 0;
            case 242:
                int[] iArr186 = this.AudioAttributesImplApi21Parcelizer;
                int i283 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr186[i283] = 16;
                iArr186[i283 - 1] = iArr186[i283 - 1] >> iArr186[i283];
                int i284 = i283 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i284;
                iArr186[i283 - 2] = iArr186[i283 - 2] - iArr186[i284];
                return 0;
            case 243:
                int[] iArr187 = this.AudioAttributesImplApi21Parcelizer;
                int i285 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i285 + 1;
                iArr187[i285] = 28;
                return 0;
            case 244:
                int i286 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr188 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr17 = this.MediaBrowserCompatMediaItem;
                iArr188[i286 - 2] = (jArr17[i286 - 2] > jArr17[i286 - 1] ? 1 : (jArr17[i286 - 2] == jArr17[i286 - 1] ? 0 : -1));
                int i287 = i286 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i287;
                iArr188[i286 - 3] = iArr188[i286 - 3] + iArr188[i287];
                return 0;
            case 245:
                int[] iArr189 = this.AudioAttributesImplApi21Parcelizer;
                int i288 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr189[i288] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i288 + 2;
                iArr189[i288 + 1] = 140;
                return 0;
            case 246:
                int i289 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i290 = i289 - 1;
                int[] iArr190 = this.AudioAttributesImplApi21Parcelizer;
                iArr190[i289 - 2] = iArr190[i289 - 2] + iArr190[i290];
                this.MediaBrowserCompatCustomActionResultReceiver = i289;
                iArr190[i290] = 3;
                return 0;
            case 247:
                int i291 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i292 = i291 - 1;
                Object[] objArr44 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj23 = objArr44[i292];
                objArr44[i292] = null;
                objArr44[17] = obj23;
                int[] iArr191 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i291;
                iArr191[i292] = 0;
                return 0;
            case 248:
                int[] iArr192 = this.AudioAttributesImplApi21Parcelizer;
                int i293 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr45 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj24 = objArr45[i293 - 1];
                objArr45[i293 - 1] = null;
                iArr192[i293 - 1] = ((Object[]) obj24).length;
                int i294 = i293 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i294;
                iArr192[13] = iArr192[i294];
                return 0;
            case 249:
                int i295 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i295;
                int[] iArr193 = this.AudioAttributesImplApi21Parcelizer;
                iArr193[18] = iArr193[i295];
                return 0;
            case 250:
                int[] iArr194 = this.AudioAttributesImplApi21Parcelizer;
                int i296 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i296 + 1;
                iArr194[i296] = iArr194[18];
                return 0;
            case 251:
                int[] iArr195 = this.AudioAttributesImplApi21Parcelizer;
                int i297 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i297 + 1;
                iArr195[i297] = iArr195[13];
                return 0;
            case 252:
                Object[] objArr46 = this.MediaBrowserCompatSearchResultReceiver;
                int i298 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr46[i298] = objArr46[12];
                int[] iArr196 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i298 + 2;
                iArr196[i298 + 1] = iArr196[18];
                return 0;
            case 253:
                int i299 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i300 = i299 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i300;
                Object[] objArr47 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj25 = objArr47[i299 - 2];
                objArr47[i299 - 2] = null;
                objArr47[i299 - 2] = ((Object[]) obj25)[this.AudioAttributesImplApi21Parcelizer[i300]];
                return 0;
            case 254:
                int i301 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i302 = i301 - 1;
                Object[] objArr48 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj26 = objArr48[i302];
                objArr48[i302] = null;
                objArr48[14] = obj26;
                this.MediaBrowserCompatCustomActionResultReceiver = i301;
                objArr48[i302] = objArr48[15];
                Object obj27 = objArr48[i301 - 1];
                objArr48[i301 - 1] = null;
                this.AudioAttributesImplApi21Parcelizer[i301 - 1] = ((Object[]) obj27).length;
                return 0;
            case 255:
                int i303 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i303;
                int[] iArr197 = this.AudioAttributesImplApi21Parcelizer;
                iArr197[19] = iArr197[i303];
                return 0;
            case 256:
                int[] iArr198 = this.AudioAttributesImplApi21Parcelizer;
                int i304 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr198[i304] = iArr198[19];
                this.MediaBrowserCompatCustomActionResultReceiver = i304 + 2;
                iArr198[i304 + 1] = iArr198[16];
                return 0;
            case 257:
                Object[] objArr49 = this.MediaBrowserCompatSearchResultReceiver;
                int i305 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr49[i305] = objArr49[15];
                int[] iArr199 = this.AudioAttributesImplApi21Parcelizer;
                iArr199[i305 + 1] = iArr199[19];
                int i306 = i305 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i306;
                Object obj28 = objArr49[i305];
                objArr49[i305] = null;
                objArr49[i305] = ((Object[]) obj28)[iArr199[i306]];
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                Object[] objArr50 = this.MediaBrowserCompatSearchResultReceiver;
                int i307 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr50[i307] = objArr50[17];
                this.MediaBrowserCompatCustomActionResultReceiver = i307 + 2;
                objArr50[i307 + 1] = objArr50[14];
                return 0;
            case 259:
                int[] iArr200 = this.AudioAttributesImplApi21Parcelizer;
                iArr200[19] = iArr200[19] + 1;
                return 0;
            case 260:
                int[] iArr201 = this.AudioAttributesImplApi21Parcelizer;
                iArr201[18] = iArr201[18] + 1;
                return 0;
            case 261:
                int[] iArr202 = this.AudioAttributesImplApi21Parcelizer;
                int i308 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i308 + 1;
                iArr202[i308] = 17;
                return 0;
            case 262:
                int[] iArr203 = this.AudioAttributesImplApi21Parcelizer;
                int i309 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i309 + 1;
                iArr203[i309] = 10;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                Object[] objArr51 = this.MediaBrowserCompatSearchResultReceiver;
                int i310 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr51[i310] = objArr51[i310 - 1];
                Object obj29 = objArr51[i310];
                objArr51[i310] = null;
                objArr51[12] = obj29;
                int[] iArr204 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i310 + 1;
                iArr204[i310] = 5;
                return 0;
            case 264:
                Object[] objArr52 = this.MediaBrowserCompatSearchResultReceiver;
                int i311 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr52[i311] = objArr52[12];
                int[] iArr205 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i311 + 2;
                iArr205[i311 + 1] = 4;
                return 0;
            case 265:
                Object[] objArr53 = this.MediaBrowserCompatSearchResultReceiver;
                int i312 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr53[i312] = objArr53[12];
                int[] iArr206 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i312 + 2;
                iArr206[i312 + 1] = 3;
                return 0;
            case 266:
                Object[] objArr54 = this.MediaBrowserCompatSearchResultReceiver;
                int i313 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr54[i313] = objArr54[12];
                int[] iArr207 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i313 + 2;
                iArr207[i313 + 1] = 2;
                return 0;
            case 267:
                int[] iArr208 = this.AudioAttributesImplApi21Parcelizer;
                int i314 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i314 + 1;
                iArr208[i314] = 33;
                return 0;
            case 268:
                int[] iArr209 = this.AudioAttributesImplApi21Parcelizer;
                int i315 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr209[i315] = 25;
                this.MediaBrowserCompatCustomActionResultReceiver = i315;
                iArr209[i315 - 1] = iArr209[i315 - 1] + iArr209[i315];
                return 0;
            case 269:
                int[] iArr210 = this.AudioAttributesImplApi21Parcelizer;
                int i316 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i316 + 1;
                iArr210[i316] = 72;
                return 0;
            case 270:
                int[] iArr211 = this.AudioAttributesImplApi21Parcelizer;
                int i317 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i317 + 1;
                iArr211[i317] = 38;
                return 0;
            case 271:
                int[] iArr212 = this.AudioAttributesImplApi21Parcelizer;
                int i318 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr212[i318] = 71;
                this.MediaBrowserCompatCustomActionResultReceiver = i318;
                iArr212[i318 - 1] = iArr212[i318 - 1] + iArr212[i318];
                return 0;
            case 272:
                int[] iArr213 = this.AudioAttributesImplApi21Parcelizer;
                int i319 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr213[i319] = 59;
                this.MediaBrowserCompatCustomActionResultReceiver = i319;
                iArr213[i319 - 1] = iArr213[i319 - 1] + iArr213[i319];
                return 0;
            case 273:
                int[] iArr214 = this.AudioAttributesImplApi21Parcelizer;
                int i320 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr214[i320] = 5;
                this.MediaBrowserCompatCustomActionResultReceiver = i320 + 2;
                iArr214[i320 + 1] = 3;
                return 0;
            case 274:
                int i321 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr215 = this.AudioAttributesImplApi21Parcelizer;
                iArr215[i321 - 2] = iArr215[i321 - 2] >> iArr215[i321 - 1];
                int i322 = i321 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i322;
                this.MediaBrowserCompatSearchResultReceiver[i322] = null;
                return 0;
            case 275:
                int[] iArr216 = this.AudioAttributesImplApi21Parcelizer;
                int i323 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i323 + 1;
                iArr216[i323] = 109;
                return 0;
            case 276:
                Object[] objArr55 = this.MediaBrowserCompatSearchResultReceiver;
                int i324 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i324 + 1;
                objArr55[i324] = null;
                int[] iArr217 = this.AudioAttributesImplApi21Parcelizer;
                Object obj30 = objArr55[i324];
                objArr55[i324] = null;
                iArr217[i324] = ((int[]) obj30).length;
                return 0;
            case 277:
                int[] iArr218 = this.AudioAttributesImplApi21Parcelizer;
                int i325 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i325 + 1;
                iArr218[i325] = 85;
                return 0;
            case 278:
                int[] iArr219 = this.AudioAttributesImplApi21Parcelizer;
                int i326 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i326 + 1;
                iArr219[i326] = 125;
                return 0;
            case 279:
                int[] iArr220 = this.AudioAttributesImplApi21Parcelizer;
                int i327 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr220[i327] = 67;
                this.MediaBrowserCompatCustomActionResultReceiver = i327;
                iArr220[i327 - 1] = iArr220[i327 - 1] + iArr220[i327];
                return 0;
            case 280:
                int[] iArr221 = this.AudioAttributesImplApi21Parcelizer;
                int i328 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i328 + 1;
                iArr221[i328] = 40;
                return 0;
            case 281:
                int[] iArr222 = this.AudioAttributesImplApi21Parcelizer;
                int i329 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i329 + 1;
                iArr222[i329] = 18;
                return 0;
            case 282:
                int[] iArr223 = this.AudioAttributesImplApi21Parcelizer;
                int i330 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i330 + 1;
                iArr223[i330] = 67;
                return 0;
            case 283:
                int[] iArr224 = this.AudioAttributesImplApi21Parcelizer;
                int i331 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr224[i331] = 101;
                this.MediaBrowserCompatCustomActionResultReceiver = i331;
                iArr224[i331 - 1] = iArr224[i331 - 1] + iArr224[i331];
                return 0;
            case 284:
                int[] iArr225 = this.AudioAttributesImplApi21Parcelizer;
                int i332 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i332 + 1;
                iArr225[i332] = 98;
                return 0;
            case 285:
                int i333 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i334 = i333 - 1;
                Object[] objArr56 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj31 = objArr56[i334];
                objArr56[i334] = null;
                objArr56[12] = obj31;
                objArr56[i334] = objArr56[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i333 + 1;
                objArr56[i333] = objArr56[12];
                return 0;
            case 286:
                int[] iArr226 = this.AudioAttributesImplApi21Parcelizer;
                int i335 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr226[i335] = 117;
                this.MediaBrowserCompatCustomActionResultReceiver = i335;
                iArr226[i335 - 1] = iArr226[i335 - 1] + iArr226[i335];
                return 0;
            case 287:
                int[] iArr227 = this.AudioAttributesImplApi21Parcelizer;
                int i336 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i336 + 1;
                iArr227[i336] = 95;
                return 0;
            case 288:
                int[] iArr228 = this.AudioAttributesImplApi21Parcelizer;
                int i337 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr228[i337] = 21;
                this.MediaBrowserCompatCustomActionResultReceiver = i337;
                iArr228[i337 - 1] = iArr228[i337 - 1] + iArr228[i337];
                return 0;
            case 289:
                int[] iArr229 = this.AudioAttributesImplApi21Parcelizer;
                int i338 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr229[i338] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i338 + 2;
                iArr229[i338 + 1] = 0;
                return 0;
            case 290:
                int[] iArr230 = this.AudioAttributesImplApi21Parcelizer;
                int i339 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr230[i339] = 125;
                iArr230[i339 - 1] = iArr230[i339 - 1] + iArr230[i339];
                this.MediaBrowserCompatCustomActionResultReceiver = i339 + 1;
                iArr230[i339] = iArr230[i339 - 1];
                return 0;
            case 291:
                int[] iArr231 = this.AudioAttributesImplApi21Parcelizer;
                int i340 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i340 + 1;
                iArr231[i340] = 79;
                return 0;
            case 292:
                int[] iArr232 = this.AudioAttributesImplApi21Parcelizer;
                int i341 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i341 + 1;
                iArr232[i341] = 103;
                return 0;
            case 293:
                int i342 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i343 = i342 - 1;
                Object[] objArr57 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj32 = objArr57[i343];
                objArr57[i343] = null;
                objArr57[12] = obj32;
                this.MediaBrowserCompatCustomActionResultReceiver = i342;
                objArr57[i343] = objArr57[11];
                return 0;
            case 294:
                int[] iArr233 = this.AudioAttributesImplApi21Parcelizer;
                int i344 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr233[i344] = 99;
                this.MediaBrowserCompatCustomActionResultReceiver = i344;
                iArr233[i344 - 1] = iArr233[i344 - 1] + iArr233[i344];
                return 0;
            case 295:
                int[] iArr234 = this.AudioAttributesImplApi21Parcelizer;
                int i345 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr234[i345] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i345;
                iArr234[i345 - 1] = iArr234[i345] ^ iArr234[i345 - 1];
                return 0;
            case 296:
                int[] iArr235 = this.AudioAttributesImplApi21Parcelizer;
                int i346 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr235[i346] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i346;
                iArr235[i346 - 1] = iArr235[i346] ^ iArr235[i346 - 1];
                return 0;
            case 297:
                int[] iArr236 = this.AudioAttributesImplApi21Parcelizer;
                int i347 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr236[i347] = 65;
                this.MediaBrowserCompatCustomActionResultReceiver = i347;
                iArr236[i347 - 1] = iArr236[i347 - 1] + iArr236[i347];
                return 0;
            case 298:
                int i348 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i349 = i348 - 1;
                Object[] objArr58 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj33 = objArr58[i349];
                objArr58[i349] = null;
                objArr58[14] = obj33;
                this.MediaBrowserCompatCustomActionResultReceiver = i348;
                objArr58[i349] = objArr58[13];
                return 0;
            case 299:
                int[] iArr237 = this.AudioAttributesImplApi21Parcelizer;
                int i350 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr237[i350] = 61;
                iArr237[i350 - 1] = iArr237[i350 - 1] + iArr237[i350];
                this.MediaBrowserCompatCustomActionResultReceiver = i350 + 1;
                iArr237[i350] = iArr237[i350 - 1];
                return 0;
            case 300:
                Object[] objArr59 = this.MediaBrowserCompatSearchResultReceiver;
                int i351 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr59[i351] = objArr59[13];
                this.MediaBrowserCompatCustomActionResultReceiver = i351 + 2;
                objArr59[i351 + 1] = objArr59[14];
                return 0;
            case 301:
                Object[] objArr60 = this.MediaBrowserCompatSearchResultReceiver;
                int i352 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr60[i352] = objArr60[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i352 + 2;
                objArr60[i352 + 1] = objArr60[13];
                return 0;
            case 302:
                int[] iArr238 = this.AudioAttributesImplApi21Parcelizer;
                int i353 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr238[i353] = 15;
                iArr238[i353 - 1] = iArr238[i353 - 1] + iArr238[i353];
                this.MediaBrowserCompatCustomActionResultReceiver = i353 + 1;
                iArr238[i353] = iArr238[i353 - 1];
                return 0;
            case 303:
                int[] iArr239 = this.AudioAttributesImplApi21Parcelizer;
                int i354 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr239[i354] = 37;
                this.MediaBrowserCompatCustomActionResultReceiver = i354;
                iArr239[i354 - 1] = iArr239[i354 - 1] + iArr239[i354];
                return 0;
            case 304:
                int[] iArr240 = this.AudioAttributesImplApi21Parcelizer;
                int i355 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i355 + 1;
                iArr240[i355] = 44;
                return 0;
            case 305:
                int[] iArr241 = this.AudioAttributesImplApi21Parcelizer;
                int i356 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr241[i356] = 93;
                this.MediaBrowserCompatCustomActionResultReceiver = i356;
                iArr241[i356 - 1] = iArr241[i356 - 1] + iArr241[i356];
                return 0;
            case 306:
                int i357 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i358 = i357 - 1;
                Object[] objArr61 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj34 = objArr61[i358];
                objArr61[i358] = null;
                objArr61[13] = obj34;
                objArr61[i358] = objArr61[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i357 + 1;
                objArr61[i357] = objArr61[12];
                return 0;
            case 307:
                int[] iArr242 = this.AudioAttributesImplApi21Parcelizer;
                int i359 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr242[i359] = 119;
                this.MediaBrowserCompatCustomActionResultReceiver = i359;
                iArr242[i359 - 1] = iArr242[i359 - 1] + iArr242[i359];
                return 0;
            case 308:
                int[] iArr243 = this.AudioAttributesImplApi21Parcelizer;
                int i360 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i360 + 1;
                iArr243[i360] = 21;
                return 0;
            case 309:
                int[] iArr244 = this.AudioAttributesImplApi21Parcelizer;
                int i361 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr244[i361] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i361 + 2;
                iArr244[i361 + 1] = 134;
                return 0;
            case 310:
                int[] iArr245 = this.AudioAttributesImplApi21Parcelizer;
                int i362 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr245[i362] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i362 + 2;
                iArr245[i362 + 1] = 4;
                return 0;
            case 311:
                int[] iArr246 = this.AudioAttributesImplApi21Parcelizer;
                int i363 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr246[i363] = -3;
                this.MediaBrowserCompatCustomActionResultReceiver = i363;
                iArr246[i363 - 1] = iArr246[i363 - 1] + iArr246[i363];
                return 0;
            case 312:
                int[] iArr247 = this.AudioAttributesImplApi21Parcelizer;
                int i364 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i364 + 1;
                iArr247[i364] = -19;
                return 0;
            case 313:
                int[] iArr248 = this.AudioAttributesImplApi21Parcelizer;
                int i365 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i365 + 1;
                iArr248[i365] = 141;
                return 0;
            case 314:
                Object[] objArr62 = this.MediaBrowserCompatSearchResultReceiver;
                int i366 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr62[i366] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = i366 + 2;
                objArr62[i366 + 1] = null;
                return 0;
            case 315:
                int[] iArr249 = this.AudioAttributesImplApi21Parcelizer;
                int i367 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr249[i367] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i367;
                iArr249[i367 - 1] = iArr249[i367 - 1] + iArr249[i367];
                return 0;
            case 316:
                int[] iArr250 = this.AudioAttributesImplApi21Parcelizer;
                int i368 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i368 + 1;
                iArr250[i368] = -22;
                return 0;
            case 317:
                int[] iArr251 = this.AudioAttributesImplApi21Parcelizer;
                int i369 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr251[i369] = 0;
                iArr251[i369 + 1] = 135;
                this.MediaBrowserCompatCustomActionResultReceiver = i369 + 3;
                iArr251[i369 + 2] = 0;
                return 0;
            case 318:
                int[] iArr252 = this.AudioAttributesImplApi21Parcelizer;
                int i370 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr252[i370] = -114;
                this.MediaBrowserCompatCustomActionResultReceiver = i370;
                iArr252[i370 - 1] = iArr252[i370 - 1] + iArr252[i370];
                return 0;
            case 319:
                int[] iArr253 = this.AudioAttributesImplApi21Parcelizer;
                int i371 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i371 + 1;
                iArr253[i371] = -3;
                return 0;
            case 320:
                int i372 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr254 = this.AudioAttributesImplApi21Parcelizer;
                iArr254[i372 - 2] = iArr254[i372 - 1] & iArr254[i372 - 2];
                int i373 = i372 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i373;
                iArr254[i372 - 3] = iArr254[i372 - 3] + iArr254[i373];
                return 0;
            case 321:
                int[] iArr255 = this.AudioAttributesImplApi21Parcelizer;
                int i374 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i374 + 1;
                iArr255[i374] = 4;
                return 0;
            case 322:
                int[] iArr256 = this.AudioAttributesImplApi21Parcelizer;
                int i375 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i375 + 1;
                iArr256[i375] = -28;
                return 0;
            case 323:
                int[] iArr257 = this.AudioAttributesImplApi21Parcelizer;
                int i376 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i376 + 1;
                iArr257[i376] = 3;
                return 0;
            case 324:
                int[] iArr258 = this.AudioAttributesImplApi21Parcelizer;
                int i377 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i377 + 1;
                iArr258[i377] = 137;
                return 0;
            case 325:
                int i378 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr259 = this.AudioAttributesImplApi21Parcelizer;
                iArr259[i378 - 2] = iArr259[i378 - 2] >> iArr259[i378 - 1];
                int i379 = i378 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i379;
                iArr259[i378 - 3] = iArr259[i378 - 3] + iArr259[i379];
                return 0;
            case 326:
                int[] iArr260 = this.AudioAttributesImplApi21Parcelizer;
                int i380 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr260[i380] = -11;
                this.MediaBrowserCompatCustomActionResultReceiver = i380;
                iArr260[i380 - 1] = iArr260[i380 - 1] + iArr260[i380];
                return 0;
            case 327:
                int[] iArr261 = this.AudioAttributesImplApi21Parcelizer;
                int i381 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr261[i381] = -3;
                iArr261[i381 - 1] = iArr261[i381 - 1] & iArr261[i381];
                this.MediaBrowserCompatCustomActionResultReceiver = i381 + 1;
                iArr261[i381] = 26;
                return 0;
            case 328:
                int[] iArr262 = this.AudioAttributesImplApi21Parcelizer;
                int i382 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i382 + 1;
                iArr262[i382] = 136;
                return 0;
            case 329:
                Object[] objArr63 = this.MediaBrowserCompatSearchResultReceiver;
                int i383 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i383 + 1;
                objArr63[i383] = objArr63[12];
                int[] iArr263 = this.AudioAttributesImplApi21Parcelizer;
                Object obj35 = objArr63[i383];
                objArr63[i383] = null;
                iArr263[i383] = ((Object[]) obj35).length;
                return 0;
            case 330:
                int[] iArr264 = this.AudioAttributesImplApi21Parcelizer;
                int i384 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr264[i384] = iArr264[18];
                this.MediaBrowserCompatCustomActionResultReceiver = i384 + 2;
                iArr264[i384 + 1] = iArr264[13];
                return 0;
            case 331:
                int i385 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i386 = i385 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i386;
                Object[] objArr64 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj36 = objArr64[i385 - 2];
                objArr64[i385 - 2] = null;
                objArr64[i385 - 2] = ((Object[]) obj36)[this.AudioAttributesImplApi21Parcelizer[i386]];
                int i387 = i385 - 2;
                Object obj37 = objArr64[i387];
                objArr64[i387] = null;
                objArr64[14] = obj37;
                this.MediaBrowserCompatCustomActionResultReceiver = i385 - 1;
                objArr64[i387] = objArr64[15];
                return 0;
            case 332:
                int[] iArr265 = this.AudioAttributesImplApi21Parcelizer;
                int i388 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object[] objArr65 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj38 = objArr65[i388 - 1];
                objArr65[i388 - 1] = null;
                iArr265[i388 - 1] = ((Object[]) obj38).length;
                int i389 = i388 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i389;
                iArr265[16] = iArr265[i389];
                return 0;
            case 333:
                int[] iArr266 = this.AudioAttributesImplApi21Parcelizer;
                int i390 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr266[i390] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i390;
                iArr266[19] = iArr266[i390];
                return 0;
            case 334:
                int[] iArr267 = this.AudioAttributesImplApi21Parcelizer;
                int i391 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i391 + 1;
                iArr267[i391] = iArr267[19];
                return 0;
            case 335:
                Object[] objArr66 = this.MediaBrowserCompatSearchResultReceiver;
                int i392 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i392 + 1;
                objArr66[i392] = objArr66[15];
                return 0;
            case 336:
                int[] iArr268 = this.AudioAttributesImplApi21Parcelizer;
                int i393 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr268[i393] = iArr268[19];
                this.MediaBrowserCompatCustomActionResultReceiver = i393;
                Object[] objArr67 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj39 = objArr67[i393 - 1];
                objArr67[i393 - 1] = null;
                objArr67[i393 - 1] = ((Object[]) obj39)[iArr268[i393]];
                return 0;
            case 337:
                Object[] objArr68 = this.MediaBrowserCompatSearchResultReceiver;
                int i394 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i394 + 1;
                objArr68[i394] = objArr68[17];
                return 0;
            case 338:
                Object[] objArr69 = this.MediaBrowserCompatSearchResultReceiver;
                int i395 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr69[i395] = objArr69[11];
                this.MediaBrowserCompatCustomActionResultReceiver = i395 + 2;
                objArr69[i395 + 1] = objArr69[11];
                return 0;
            case 339:
                Object[] objArr70 = this.MediaBrowserCompatSearchResultReceiver;
                int i396 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr70[i396] = objArr70[12];
                int[] iArr269 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i396 + 2;
                iArr269[i396 + 1] = 0;
                return 0;
            case 340:
                int[] iArr270 = this.AudioAttributesImplApi21Parcelizer;
                int i397 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i397 + 1;
                iArr270[i397] = 105;
                return 0;
            case 341:
                int[] iArr271 = this.AudioAttributesImplApi21Parcelizer;
                int i398 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr271[i398] = 73;
                iArr271[i398 - 1] = iArr271[i398 - 1] + iArr271[i398];
                this.MediaBrowserCompatCustomActionResultReceiver = i398 + 1;
                iArr271[i398] = iArr271[i398 - 1];
                return 0;
            case 342:
                int[] iArr272 = this.AudioAttributesImplApi21Parcelizer;
                int i399 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr272[i399] = 31;
                iArr272[i399 - 1] = iArr272[i399 - 1] + iArr272[i399];
                this.MediaBrowserCompatCustomActionResultReceiver = i399 + 1;
                iArr272[i399] = iArr272[i399 - 1];
                return 0;
            case 343:
                int[] iArr273 = this.AudioAttributesImplApi21Parcelizer;
                int i400 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr273[i400] = 4;
                iArr273[i400 + 1] = 2;
                int i401 = i400 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i401;
                iArr273[i400] = iArr273[i400] >>> iArr273[i401];
                return 0;
            case 344:
                int[] iArr274 = this.AudioAttributesImplApi21Parcelizer;
                int i402 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i402 + 1;
                iArr274[i402] = 50;
                return 0;
            case 345:
                int[] iArr275 = this.AudioAttributesImplApi21Parcelizer;
                int i403 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr275[i403] = iArr275[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i403 + 2;
                iArr275[i403 + 1] = 20;
                return 0;
            case 346:
                int i404 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i405 = i404 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i405;
                int[] iArr276 = this.AudioAttributesImplApi21Parcelizer;
                this.read = iArr276[i405] == iArr276[i404 - 1] ? 0 : 1;
                return 0;
            case 347:
                int[] iArr277 = this.AudioAttributesImplApi21Parcelizer;
                int i406 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr277[i406] = 66;
                this.MediaBrowserCompatCustomActionResultReceiver = i406 + 2;
                iArr277[i406 + 1] = 0;
                return 0;
            case 348:
                int i407 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i408 = i407 - 1;
                int[] iArr278 = this.AudioAttributesImplApi21Parcelizer;
                iArr278[12] = iArr278[i408];
                Object[] objArr71 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i407;
                objArr71[i408] = objArr71[11];
                return 0;
            case 349:
                int[] iArr279 = this.AudioAttributesImplApi21Parcelizer;
                int i409 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr279[i409] = 75;
                iArr279[i409 - 1] = iArr279[i409 - 1] + iArr279[i409];
                this.MediaBrowserCompatCustomActionResultReceiver = i409 + 1;
                iArr279[i409] = iArr279[i409 - 1];
                return 0;
            case 350:
                int[] iArr280 = this.AudioAttributesImplApi21Parcelizer;
                int i410 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i410 + 1;
                iArr280[i410] = 68;
                return 0;
            case 351:
                int i411 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i412 = i411 - 1;
                Object[] objArr72 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj40 = objArr72[i412];
                objArr72[i412] = null;
                objArr72[13] = obj40;
                int[] iArr281 = this.AudioAttributesImplApi21Parcelizer;
                iArr281[i412] = 0;
                int i413 = i411 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i413;
                iArr281[12] = iArr281[i413];
                return 0;
            case 352:
                int i414 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i415 = i414 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i415;
                Object[] objArr73 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj41 = objArr73[i415];
                objArr73[i415] = null;
                int i416 = this.AudioAttributesImplApi21Parcelizer[i414 - 2];
                Object obj42 = objArr73[i414 - 1];
                objArr73[i414 - 1] = null;
                ((Object[]) obj41)[i416] = obj42;
                this.MediaBrowserCompatCustomActionResultReceiver = i414 - 2;
                objArr73[i415] = objArr73[13];
                return 0;
            case 353:
                int i417 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i418 = i417 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i418;
                Object[] objArr74 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj43 = objArr74[i418];
                objArr74[i418] = null;
                int i419 = this.AudioAttributesImplApi21Parcelizer[i417 - 2];
                Object obj44 = objArr74[i417 - 1];
                objArr74[i417 - 1] = null;
                ((Object[]) obj43)[i419] = obj44;
                return 0;
            case 354:
                int[] iArr282 = this.AudioAttributesImplApi21Parcelizer;
                int i420 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr282[i420] = iArr282[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i420 + 2;
                iArr282[i420 + 1] = 3;
                return 0;
            case 355:
                int[] iArr283 = this.AudioAttributesImplApi21Parcelizer;
                int i421 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr283[i421] = iArr283[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i421;
                Object[] objArr75 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj45 = objArr75[i421 - 1];
                objArr75[i421 - 1] = null;
                objArr75[i421 - 1] = ((Object[]) obj45)[iArr283[i421]];
                int i422 = i421 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i422;
                Object obj46 = objArr75[i422];
                objArr75[i422] = null;
                objArr75[14] = obj46;
                return 0;
            case 356:
                int i423 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i423;
                this.MediaBrowserCompatSearchResultReceiver[i423] = null;
                int[] iArr284 = this.AudioAttributesImplApi21Parcelizer;
                iArr284[12] = iArr284[12] + 1;
                return 0;
            case 357:
                int[] iArr285 = this.AudioAttributesImplApi21Parcelizer;
                int i424 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr285[i424] = 49;
                this.MediaBrowserCompatCustomActionResultReceiver = i424;
                iArr285[i424 - 1] = iArr285[i424 - 1] + iArr285[i424];
                return 0;
            case 358:
                Object[] objArr76 = this.MediaBrowserCompatSearchResultReceiver;
                int i425 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr76[i425] = objArr76[11];
                int[] iArr286 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i425 + 2;
                iArr286[i425 + 1] = -44;
                return 0;
            case 359:
                int[] iArr287 = this.AudioAttributesImplApi21Parcelizer;
                int i426 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i426 + 1;
                iArr287[i426] = 27;
                return 0;
            case 360:
                Object[] objArr77 = this.MediaBrowserCompatSearchResultReceiver;
                int i427 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr77[i427] = objArr77[11];
                int[] iArr288 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i427 + 2;
                iArr288[i427 + 1] = 2;
                return 0;
            case 361:
                int[] iArr289 = this.AudioAttributesImplApi21Parcelizer;
                int i428 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i428 + 1;
                iArr289[i428] = 30;
                return 0;
            case 362:
                int[] iArr290 = this.AudioAttributesImplApi21Parcelizer;
                int i429 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i429 + 1;
                iArr290[i429] = 84;
                return 0;
            case 363:
                int[] iArr291 = this.AudioAttributesImplApi21Parcelizer;
                int i430 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr291[i430] = 32;
                this.MediaBrowserCompatCustomActionResultReceiver = i430;
                long[] jArr18 = this.MediaBrowserCompatMediaItem;
                jArr18[i430 - 1] = jArr18[i430 - 1] << iArr291[i430];
                return 0;
            case 364:
                int i431 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr19 = this.MediaBrowserCompatMediaItem;
                jArr19[i431 - 2] = jArr19[i431 - 2] ^ jArr19[i431 - 1];
                int i432 = i431 - 2;
                jArr19[12] = jArr19[i432];
                int[] iArr292 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i431 - 1;
                iArr292[i432] = 1;
                return 0;
            case 365:
                int[] iArr293 = this.AudioAttributesImplApi21Parcelizer;
                int i433 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr293[i433] = 83;
                iArr293[i433 - 1] = iArr293[i433 - 1] + iArr293[i433];
                this.MediaBrowserCompatCustomActionResultReceiver = i433 + 1;
                iArr293[i433] = iArr293[i433 - 1];
                return 0;
            case 366:
                long[] jArr20 = this.MediaBrowserCompatMediaItem;
                int i434 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr20[i434] = jArr20[14];
                int[] iArr294 = this.AudioAttributesImplApi21Parcelizer;
                iArr294[i434 + 1] = 32;
                int i435 = i434 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i435;
                jArr20[i434] = jArr20[i434] << iArr294[i435];
                return 0;
            case 367:
                int i436 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i437 = i436 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i437;
                long[] jArr21 = this.MediaBrowserCompatMediaItem;
                jArr21[i436 - 2] = jArr21[i437] ^ jArr21[i436 - 2];
                return 0;
            case 368:
                int i438 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i439 = i438 - 1;
                long[] jArr22 = this.MediaBrowserCompatMediaItem;
                jArr22[12] = jArr22[i439];
                int[] iArr295 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i438;
                iArr295[i439] = 31531;
                return 0;
            case 369:
                int[] iArr296 = this.AudioAttributesImplApi21Parcelizer;
                int i440 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr296[i440] = 55;
                iArr296[i440 - 1] = iArr296[i440 - 1] + iArr296[i440];
                this.MediaBrowserCompatCustomActionResultReceiver = i440 + 1;
                iArr296[i440] = iArr296[i440 - 1];
                return 0;
            case 370:
                long[] jArr23 = this.MediaBrowserCompatMediaItem;
                int i441 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr23[i441] = jArr23[14];
                int[] iArr297 = this.AudioAttributesImplApi21Parcelizer;
                iArr297[i441 + 1] = 84;
                int i442 = i441 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i442;
                jArr23[i441] = jArr23[i441] >> iArr297[i442];
                return 0;
            case 371:
                int i443 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr24 = this.MediaBrowserCompatMediaItem;
                jArr24[i443 - 2] = jArr24[i443 - 2] + jArr24[i443 - 1];
                int i444 = i443 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i444;
                jArr24[12] = jArr24[i444];
                return 0;
            case 372:
                int[] iArr298 = this.AudioAttributesImplApi21Parcelizer;
                int i445 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i445 + 1;
                iArr298[i445] = 19879;
                return 0;
            case 373:
                int[] iArr299 = this.AudioAttributesImplApi21Parcelizer;
                int i446 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i446 + 1;
                iArr299[i446] = 6;
                return 0;
            case 374:
                long[] jArr25 = this.MediaBrowserCompatMediaItem;
                int i447 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr25[i447] = jArr25[12];
                this.MediaBrowserCompatCustomActionResultReceiver = i447 + 2;
                jArr25[i447 + 1] = jArr25[14];
                return 0;
            case 375:
                int[] iArr300 = this.AudioAttributesImplApi21Parcelizer;
                int i448 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr300[i448] = 8;
                long[] jArr26 = this.MediaBrowserCompatMediaItem;
                jArr26[i448 - 1] = jArr26[i448 - 1] << iArr300[i448];
                int i449 = i448 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i449;
                jArr26[i448 - 2] = jArr26[i448 - 2] - jArr26[i449];
                return 0;
            case 376:
                int[] iArr301 = this.AudioAttributesImplApi21Parcelizer;
                int i450 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr301[i450] = 127;
                iArr301[i450 - 1] = iArr301[i450 - 1] + iArr301[i450];
                int i451 = i450 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i451;
                iArr301[i450 - 2] = iArr301[i450 - 2] >> iArr301[i451];
                return 0;
            case 377:
                int i452 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i453 = i452 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i453;
                long[] jArr27 = this.MediaBrowserCompatMediaItem;
                jArr27[i452 - 2] = jArr27[i452 - 2] << this.AudioAttributesImplApi21Parcelizer[i453];
                return 0;
            case 378:
                int i454 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr28 = this.MediaBrowserCompatMediaItem;
                jArr28[i454 - 2] = jArr28[i454 - 2] ^ jArr28[i454 - 1];
                int i455 = i454 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i455;
                jArr28[12] = jArr28[i455];
                return 0;
            case 379:
                int i456 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr29 = this.MediaBrowserCompatMediaItem;
                jArr29[i456 - 2] = jArr29[i456 - 2] << this.AudioAttributesImplApi21Parcelizer[i456 - 1];
                jArr29[i456 - 3] = jArr29[i456 - 3] ^ jArr29[i456 - 2];
                int i457 = i456 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i457;
                jArr29[12] = jArr29[i457];
                return 0;
            case 380:
                Object[] objArr78 = this.MediaBrowserCompatSearchResultReceiver;
                int i458 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj47 = objArr78[i458 - 1];
                objArr78[i458 - 1] = null;
                Object obj48 = objArr78[i458 - 2];
                objArr78[i458 - 2] = null;
                objArr78[i458 - 1] = obj48;
                objArr78[i458 - 2] = obj47;
                return 0;
            case 381:
                Object[] objArr79 = this.MediaBrowserCompatSearchResultReceiver;
                int i459 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr79[i459] = objArr79[i459 - 1];
                int[] iArr302 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i459 + 2;
                iArr302[i459 + 1] = 1;
                return 0;
            case 382:
                Object[] objArr80 = this.MediaBrowserCompatSearchResultReceiver;
                int i460 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr80[i460] = objArr80[i460 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i460;
                Object obj49 = objArr80[i460];
                objArr80[i460] = null;
                objArr80[15] = obj49;
                return 0;
            case 383:
                Object[] objArr81 = this.MediaBrowserCompatSearchResultReceiver;
                int i461 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i461 + 1;
                Object obj50 = objArr81[i461 - 1];
                objArr81[i461 - 1] = null;
                objArr81[i461] = obj50;
                int[] iArr303 = this.AudioAttributesImplApi21Parcelizer;
                iArr303[i461 - 1] = iArr303[i461 - 2];
                objArr81[i461 - 2] = obj50;
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                int[] iArr304 = this.AudioAttributesImplApi21Parcelizer;
                int i462 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr304[i462 - 1] = iArr304[i462 - 2];
                Object[] objArr82 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj51 = objArr82[i462 - 1];
                objArr82[i462 - 1] = null;
                objArr82[i462 - 2] = obj51;
                return 0;
            case 385:
                int[] iArr305 = this.AudioAttributesImplApi21Parcelizer;
                int i463 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr305[i463] = 1;
                Object[] objArr83 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj52 = objArr83[i463 - 1];
                objArr83[i463 - 1] = null;
                objArr83[i463] = obj52;
                iArr305[i463 - 1] = iArr305[i463];
                int i464 = i463 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i464;
                Object obj53 = objArr83[i464];
                objArr83[i464] = null;
                int i465 = iArr305[i463 - 1];
                Object obj54 = objArr83[i463];
                objArr83[i463] = null;
                ((Object[]) obj53)[i465] = obj54;
                return 0;
            case 386:
                Object[] objArr84 = this.MediaBrowserCompatSearchResultReceiver;
                int i466 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i466 + 1;
                Object obj55 = objArr84[i466 - 1];
                objArr84[i466 - 1] = null;
                objArr84[i466] = obj55;
                Object obj56 = objArr84[i466 - 2];
                objArr84[i466 - 2] = null;
                objArr84[i466 - 1] = obj56;
                objArr84[i466 - 2] = obj55;
                Object obj57 = objArr84[i466];
                objArr84[i466] = null;
                Object obj58 = objArr84[i466 - 1];
                objArr84[i466 - 1] = null;
                objArr84[i466] = obj58;
                objArr84[i466 - 1] = obj57;
                return 0;
            case 387:
                Object[] objArr85 = this.MediaBrowserCompatSearchResultReceiver;
                int i467 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj59 = objArr85[i467 - 2];
                objArr85[i467 - 2] = null;
                objArr85[i467 - 1] = obj59;
                int[] iArr306 = this.AudioAttributesImplApi21Parcelizer;
                iArr306[i467 - 2] = iArr306[i467 - 1];
                int i468 = i467 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i468;
                Object obj60 = objArr85[i468];
                objArr85[i468] = null;
                int i469 = iArr306[i467 - 2];
                Object obj61 = objArr85[i467 - 1];
                objArr85[i467 - 1] = null;
                ((Object[]) obj60)[i469] = obj61;
                return 0;
            case 388:
                int[] iArr307 = this.AudioAttributesImplApi21Parcelizer;
                int i470 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i470 + 1;
                iArr307[i470] = 15796;
                return 0;
            case 389:
                int i471 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i472 = i471 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i472;
                Object[] objArr86 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj62 = objArr86[i472];
                objArr86[i472] = null;
                int[] iArr308 = this.AudioAttributesImplApi21Parcelizer;
                int i473 = iArr308[i471 - 2];
                Object obj63 = objArr86[i471 - 1];
                objArr86[i471 - 1] = null;
                ((Object[]) obj62)[i473] = obj63;
                objArr86[i472] = objArr86[i471 - 4];
                this.MediaBrowserCompatCustomActionResultReceiver = i471 - 1;
                iArr308[i471 - 2] = 1;
                return 0;
            case 390:
                Object[] objArr87 = this.MediaBrowserCompatSearchResultReceiver;
                int i474 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i474 + 1;
                Object obj64 = objArr87[i474 - 1];
                objArr87[i474 - 1] = null;
                objArr87[i474] = obj64;
                Object obj65 = objArr87[i474 - 2];
                objArr87[i474 - 2] = null;
                objArr87[i474 - 1] = obj65;
                Object obj66 = objArr87[i474 - 3];
                objArr87[i474 - 3] = null;
                objArr87[i474 - 2] = obj66;
                objArr87[i474 - 3] = obj64;
                return 0;
            case 391:
                int[] iArr309 = this.AudioAttributesImplApi21Parcelizer;
                int i475 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i475 + 1;
                iArr309[i475] = 8231;
                return 0;
            case 392:
                long[] jArr30 = this.MediaBrowserCompatMediaItem;
                int i476 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr30[i476] = jArr30[12];
                Object[] objArr88 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i476 + 2;
                objArr88[i476 + 1] = objArr88[15];
                return 0;
            case 393:
                Object[] objArr89 = this.MediaBrowserCompatSearchResultReceiver;
                int i477 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i477 + 1;
                Object obj67 = objArr89[i477 - 1];
                objArr89[i477 - 1] = null;
                objArr89[i477] = obj67;
                Object obj68 = objArr89[i477 - 2];
                objArr89[i477 - 2] = null;
                objArr89[i477 - 1] = obj68;
                objArr89[i477 - 2] = obj67;
                return 0;
            case 394:
                Object[] objArr90 = this.MediaBrowserCompatSearchResultReceiver;
                int i478 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj69 = objArr90[i478 - 1];
                objArr90[i478 - 1] = null;
                Object obj70 = objArr90[i478 - 2];
                objArr90[i478 - 2] = null;
                objArr90[i478 - 1] = obj70;
                objArr90[i478 - 2] = obj69;
                int[] iArr310 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i478 + 1;
                iArr310[i478] = 2;
                return 0;
            case 395:
                Object[] objArr91 = this.MediaBrowserCompatSearchResultReceiver;
                int i479 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj71 = objArr91[i479 - 2];
                objArr91[i479 - 2] = null;
                objArr91[i479 - 1] = obj71;
                int[] iArr311 = this.AudioAttributesImplApi21Parcelizer;
                iArr311[i479 - 2] = iArr311[i479 - 1];
                return 0;
            case 396:
                Object[] objArr92 = this.MediaBrowserCompatSearchResultReceiver;
                int i480 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i480 + 1;
                Object obj72 = objArr92[i480 - 1];
                objArr92[i480 - 1] = null;
                objArr92[i480] = obj72;
                long[] jArr31 = this.MediaBrowserCompatMediaItem;
                jArr31[i480 - 1] = jArr31[i480 - 2];
                objArr92[i480 - 2] = obj72;
                return 0;
            case 397:
                Object[] objArr93 = this.MediaBrowserCompatSearchResultReceiver;
                int i481 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj73 = objArr93[i481 - 1];
                objArr93[i481 - 1] = null;
                Object obj74 = objArr93[i481 - 2];
                objArr93[i481 - 2] = null;
                objArr93[i481 - 1] = obj74;
                objArr93[i481 - 2] = obj73;
                this.MediaBrowserCompatCustomActionResultReceiver = i481 + 1;
                Object obj75 = objArr93[i481 - 1];
                objArr93[i481 - 1] = null;
                objArr93[i481] = obj75;
                Object obj76 = objArr93[i481 - 2];
                objArr93[i481 - 2] = null;
                objArr93[i481 - 1] = obj76;
                objArr93[i481 - 2] = obj75;
                Object obj77 = objArr93[i481];
                objArr93[i481] = null;
                Object obj78 = objArr93[i481 - 1];
                objArr93[i481 - 1] = null;
                objArr93[i481] = obj78;
                objArr93[i481 - 1] = obj77;
                return 0;
            case 398:
                Object[] objArr94 = this.MediaBrowserCompatSearchResultReceiver;
                int i482 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj79 = objArr94[i482 - 2];
                objArr94[i482 - 2] = null;
                objArr94[i482 - 1] = obj79;
                int[] iArr312 = this.AudioAttributesImplApi21Parcelizer;
                iArr312[i482 - 2] = iArr312[i482 - 1];
                int i483 = i482 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i483;
                Object obj80 = objArr94[i483];
                objArr94[i483] = null;
                int i484 = iArr312[i482 - 2];
                Object obj81 = objArr94[i482 - 1];
                objArr94[i482 - 1] = null;
                ((Object[]) obj80)[i484] = obj81;
                this.MediaBrowserCompatCustomActionResultReceiver = i482 - 2;
                Object obj82 = objArr94[i482 - 4];
                objArr94[i482 - 4] = null;
                objArr94[i483] = obj82;
                Object obj83 = objArr94[i482 - 5];
                objArr94[i482 - 5] = null;
                objArr94[i482 - 4] = obj83;
                objArr94[i482 - 5] = obj82;
                return 0;
            case 399:
                int[] iArr313 = this.AudioAttributesImplApi21Parcelizer;
                int i485 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr313[i485] = 0;
                Object[] objArr95 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj84 = objArr95[i485 - 1];
                objArr95[i485 - 1] = null;
                objArr95[i485] = obj84;
                iArr313[i485 - 1] = iArr313[i485];
                int i486 = i485 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i486;
                Object obj85 = objArr95[i486];
                objArr95[i486] = null;
                int i487 = iArr313[i485 - 1];
                Object obj86 = objArr95[i485];
                objArr95[i485] = null;
                ((Object[]) obj85)[i487] = obj86;
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                int i488 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i489 = i488 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i489;
                Object[] objArr96 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj87 = objArr96[i489];
                objArr96[i489] = null;
                int i490 = this.AudioAttributesImplApi21Parcelizer[i488 - 2];
                Object obj88 = objArr96[i488 - 1];
                objArr96[i488 - 1] = null;
                ((Object[]) obj87)[i490] = obj88;
                this.MediaBrowserCompatCustomActionResultReceiver = i488 - 2;
                objArr96[i489] = objArr96[i488 - 4];
                return 0;
            case 401:
                int[] iArr314 = this.AudioAttributesImplApi21Parcelizer;
                int i491 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr314[i491 - 1] = (byte) iArr314[i491 - 1];
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                int[] iArr315 = this.AudioAttributesImplApi21Parcelizer;
                int i492 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i492 + 1;
                iArr315[i492] = 1;
                Object[] objArr97 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj89 = objArr97[i492 - 1];
                objArr97[i492 - 1] = null;
                objArr97[i492] = obj89;
                iArr315[i492 - 1] = iArr315[i492];
                return 0;
            case 403:
                int i493 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i494 = i493 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i494;
                Object[] objArr98 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj90 = objArr98[i494];
                objArr98[i494] = null;
                int i495 = this.AudioAttributesImplApi21Parcelizer[i493 - 2];
                Object obj91 = objArr98[i493 - 1];
                objArr98[i493 - 1] = null;
                ((Object[]) obj90)[i495] = obj91;
                this.MediaBrowserCompatCustomActionResultReceiver = i493 - 2;
                Object obj92 = objArr98[i493 - 4];
                objArr98[i493 - 4] = null;
                objArr98[i494] = obj92;
                Object obj93 = objArr98[i493 - 5];
                objArr98[i493 - 5] = null;
                objArr98[i493 - 4] = obj93;
                objArr98[i493 - 5] = obj92;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                int[] iArr316 = this.AudioAttributesImplApi21Parcelizer;
                int i496 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i496 + 1;
                iArr316[i496] = 0;
                Object[] objArr99 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj94 = objArr99[i496 - 1];
                objArr99[i496 - 1] = null;
                objArr99[i496] = obj94;
                iArr316[i496 - 1] = iArr316[i496];
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                Object[] objArr100 = this.MediaBrowserCompatSearchResultReceiver;
                int i497 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr100[i497] = objArr100[i497 - 1];
                int[] iArr317 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i497 + 2;
                iArr317[i497 + 1] = 0;
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                Object[] objArr101 = this.MediaBrowserCompatSearchResultReceiver;
                int i498 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj95 = objArr101[i498 - 1];
                objArr101[i498 - 1] = null;
                Object obj96 = objArr101[i498 - 2];
                objArr101[i498 - 2] = null;
                objArr101[i498 - 1] = obj96;
                objArr101[i498 - 2] = obj95;
                this.MediaBrowserCompatCustomActionResultReceiver = i498 + 1;
                objArr101[i498] = null;
                return 0;
            case 407:
                Object[] objArr102 = this.MediaBrowserCompatSearchResultReceiver;
                int i499 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr102[i499] = objArr102[11];
                int[] iArr318 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i499 + 2;
                iArr318[i499 + 1] = 3;
                return 0;
            case 408:
                int i500 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr319 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr32 = this.MediaBrowserCompatMediaItem;
                iArr319[i500 - 2] = (jArr32[i500 - 2] > jArr32[i500 - 1] ? 1 : (jArr32[i500 - 2] == jArr32[i500 - 1] ? 0 : -1));
                int i501 = i500 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i501;
                iArr319[i500 - 3] = iArr319[i500 - 3] - iArr319[i501];
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                int[] iArr320 = this.AudioAttributesImplApi21Parcelizer;
                int i502 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i502 + 1;
                iArr320[i502] = 8;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                Object[] objArr103 = this.MediaBrowserCompatSearchResultReceiver;
                int i503 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj97 = objArr103[i503 - 1];
                objArr103[i503 - 1] = null;
                Object obj98 = objArr103[i503 - 2];
                objArr103[i503 - 2] = null;
                objArr103[i503 - 1] = obj98;
                objArr103[i503 - 2] = obj97;
                this.MediaBrowserCompatCustomActionResultReceiver = i503 + 1;
                Object obj99 = objArr103[i503 - 1];
                objArr103[i503 - 1] = null;
                objArr103[i503] = obj99;
                Object obj100 = objArr103[i503 - 2];
                objArr103[i503 - 2] = null;
                objArr103[i503 - 1] = obj100;
                objArr103[i503 - 2] = obj99;
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                Object[] objArr104 = this.MediaBrowserCompatSearchResultReceiver;
                int i504 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj101 = objArr104[i504 - 1];
                objArr104[i504 - 1] = null;
                objArr104[i504] = obj101;
                Object obj102 = objArr104[i504 - 2];
                objArr104[i504 - 2] = null;
                objArr104[i504 - 1] = obj102;
                objArr104[i504 - 2] = obj101;
                Object obj103 = objArr104[i504];
                objArr104[i504] = null;
                Object obj104 = objArr104[i504 - 1];
                objArr104[i504 - 1] = null;
                objArr104[i504] = obj104;
                objArr104[i504 - 1] = obj103;
                int[] iArr321 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i504 + 2;
                iArr321[i504 + 1] = 0;
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int i505 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i506 = i505 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i506;
                long[] jArr33 = this.MediaBrowserCompatMediaItem;
                jArr33[i505 - 2] = jArr33[i505 - 2] >> this.AudioAttributesImplApi21Parcelizer[i506];
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                int i507 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i508 = i507 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i508;
                long[] jArr34 = this.MediaBrowserCompatMediaItem;
                jArr34[i507 - 2] = jArr34[i507 - 2] - jArr34[i508];
                return 0;
            case 414:
                float[] fArr4 = this.RatingCompat;
                int i509 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i509 + 1;
                fArr4[i509] = 1.0f;
                return 0;
            case 415:
                float[] fArr5 = this.RatingCompat;
                int i510 = this.MediaBrowserCompatCustomActionResultReceiver;
                fArr5[i510] = 0.0f;
                int[] iArr322 = this.AudioAttributesImplApi21Parcelizer;
                iArr322[i510 - 1] = (fArr5[i510 - 1] > fArr5[i510] ? 1 : (fArr5[i510 - 1] == fArr5[i510] ? 0 : -1));
                int i511 = i510 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i511;
                iArr322[i510 - 2] = iArr322[i510 - 2] + iArr322[i511];
                return 0;
            case 416:
                int[] iArr323 = this.AudioAttributesImplApi21Parcelizer;
                int i512 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr323[i512] = 107;
                iArr323[i512 - 1] = iArr323[i512 - 1] + iArr323[i512];
                this.MediaBrowserCompatCustomActionResultReceiver = i512 + 1;
                iArr323[i512] = iArr323[i512 - 1];
                return 0;
            case 417:
                long[] jArr35 = this.MediaBrowserCompatMediaItem;
                int i513 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr35[i513] = jArr35[14];
                int[] iArr324 = this.AudioAttributesImplApi21Parcelizer;
                iArr324[i513 + 1] = 101;
                int i514 = i513 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i514;
                jArr35[i513] = jArr35[i513] << iArr324[i514];
                return 0;
            case 418:
                int i515 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i516 = i515 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i516;
                long[] jArr36 = this.MediaBrowserCompatMediaItem;
                jArr36[i515 - 2] = jArr36[i515 - 2] / jArr36[i516];
                return 0;
            case 419:
                int i517 = this.MediaBrowserCompatCustomActionResultReceiver;
                int[] iArr325 = this.AudioAttributesImplApi21Parcelizer;
                float[] fArr6 = this.RatingCompat;
                iArr325[i517 - 2] = (fArr6[i517 - 2] > fArr6[i517 - 1] ? 1 : (fArr6[i517 - 2] == fArr6[i517 - 1] ? 0 : -1));
                int i518 = i517 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i518;
                iArr325[i517 - 3] = iArr325[i517 - 3] / iArr325[i518];
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                int i519 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr37 = this.MediaBrowserCompatMediaItem;
                jArr37[i519 - 2] = jArr37[i519 - 2] ^ jArr37[i519 - 1];
                int i520 = i519 - 2;
                jArr37[12] = jArr37[i520];
                int[] iArr326 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i519 - 1;
                iArr326[i520] = 0;
                return 0;
            case 421:
                long[] jArr38 = this.MediaBrowserCompatMediaItem;
                int i521 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr38[i521] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i521;
                int[] iArr327 = this.AudioAttributesImplApi21Parcelizer;
                iArr327[i521 - 1] = (jArr38[i521 - 1] > jArr38[i521] ? 1 : (jArr38[i521 - 1] == jArr38[i521] ? 0 : -1));
                iArr327[i521 - 1] = -iArr327[i521 - 1];
                return 0;
            case 422:
                int[] iArr328 = this.AudioAttributesImplApi21Parcelizer;
                int i522 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr328[i522] = 33;
                this.MediaBrowserCompatCustomActionResultReceiver = i522;
                iArr328[i522 - 1] = iArr328[i522 - 1] + iArr328[i522];
                return 0;
            case 423:
                int i523 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i524 = i523 - 1;
                long[] jArr39 = this.MediaBrowserCompatMediaItem;
                jArr39[12] = jArr39[i524];
                int[] iArr329 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i523;
                iArr329[i524] = 11954;
                return 0;
            case 424:
                float[] fArr7 = this.RatingCompat;
                int i525 = this.MediaBrowserCompatCustomActionResultReceiver;
                fArr7[i525] = 0.0f;
                int[] iArr330 = this.AudioAttributesImplApi21Parcelizer;
                iArr330[i525 - 1] = (fArr7[i525 - 1] > fArr7[i525] ? 1 : (fArr7[i525 - 1] == fArr7[i525] ? 0 : -1));
                int i526 = i525 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i526;
                iArr330[i525 - 2] = iArr330[i525 - 2] - iArr330[i526];
                return 0;
            case 425:
                int[] iArr331 = this.AudioAttributesImplApi21Parcelizer;
                int i527 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr331[i527] = 17;
                this.MediaBrowserCompatCustomActionResultReceiver = i527;
                long[] jArr40 = this.MediaBrowserCompatMediaItem;
                jArr40[i527 - 1] = jArr40[i527 - 1] >>> iArr331[i527];
                return 0;
            case 426:
                int i528 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i529 = i528 - 1;
                long[] jArr41 = this.MediaBrowserCompatMediaItem;
                jArr41[12] = jArr41[i529];
                int[] iArr332 = this.AudioAttributesImplApi21Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i528;
                iArr332[i529] = 29579;
                return 0;
            case 427:
                float[] fArr8 = this.RatingCompat;
                int i530 = this.MediaBrowserCompatCustomActionResultReceiver;
                fArr8[i530] = 0.0f;
                this.MediaBrowserCompatCustomActionResultReceiver = i530;
                this.AudioAttributesImplApi21Parcelizer[i530 - 1] = (fArr8[i530 - 1] > fArr8[i530] ? 1 : (fArr8[i530 - 1] == fArr8[i530] ? 0 : -1));
                return 0;
            default:
                return i;
        }
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, Object obj2) {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj) {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, int i, Object obj2) {
        int[] iArr = new int[20];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        objArr[13] = obj2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, long j) {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        long[] jArr = new long[20];
        this.MediaBrowserCompatMediaItem = jArr;
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        jArr[12] = j;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler() {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        this.MediaBrowserCompatSearchResultReceiver = new Object[20];
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, int i) {
        int[] iArr = new int[20];
        this.AudioAttributesImplApi21Parcelizer = iArr;
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, Object obj2, Object obj3) {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        this.MediaBrowserCompatMediaItem = new long[20];
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public MediaSourceEventListenerEventDispatcherListenerAndHandler(Object obj, long j, long j2) {
        this.AudioAttributesImplApi21Parcelizer = new int[20];
        long[] jArr = new long[20];
        this.MediaBrowserCompatMediaItem = jArr;
        this.RatingCompat = new float[20];
        this.MediaMetadataCompat = new double[20];
        Object[] objArr = new Object[20];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        jArr[12] = j;
        jArr[14] = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }
}
