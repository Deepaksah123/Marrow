package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
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
public class setTargetVoice {
    public int AudioAttributesCompatParcelizer;
    public float AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public Object AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final float[] MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final double[] MediaDescriptionCompat;
    private final int[] MediaMetadataCompat;
    private final long[] RatingCompat;
    public float RemoteActionCompatParcelizer;
    public int read;
    public long write;

    public setTargetVoice(Object obj) {
        this.MediaMetadataCompat = new int[TarConstants.PREFIXLEN_XSTAR];
        this.RatingCompat = new long[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatMediaItem = new float[TarConstants.PREFIXLEN_XSTAR];
        this.MediaDescriptionCompat = new double[TarConstants.PREFIXLEN_XSTAR];
        Object[] objArr = new Object[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int i2 = this.AudioAttributesImplApi26Parcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2;
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
                return 0;
            case 2:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i4 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i4 + 1;
                objArr2[i4] = this.AudioAttributesImplBaseParcelizer;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i5 + 1;
                objArr3[i5] = objArr3[11];
                return 0;
            case 5:
                int[] iArr = this.MediaMetadataCompat;
                int i6 = this.AudioAttributesImplApi26Parcelizer;
                iArr[i6] = 2;
                this.AudioAttributesImplApi26Parcelizer = i6 + 2;
                iArr[i6 + 1] = 2;
                return 0;
            case 6:
                int i7 = this.AudioAttributesImplApi26Parcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplApi26Parcelizer = i8;
                int[] iArr2 = this.MediaMetadataCompat;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                return 0;
            case 7:
                int i9 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i9;
                this.MediaBrowserCompatSearchResultReceiver[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj2;
                return 0;
            case 10:
                int[] iArr3 = this.MediaMetadataCompat;
                int i11 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i11 + 1;
                iArr3[i11] = this.AudioAttributesCompatParcelizer;
            case 9:
                return 0;
            case 11:
                int[] iArr4 = this.MediaMetadataCompat;
                int i12 = this.AudioAttributesImplApi26Parcelizer;
                iArr4[i12] = 75;
                iArr4[i12 - 1] = iArr4[i12 - 1] + iArr4[i12];
                this.AudioAttributesImplApi26Parcelizer = i12 + 1;
                iArr4[i12] = iArr4[i12 - 1];
                return 0;
            case 12:
                int[] iArr5 = this.MediaMetadataCompat;
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i13 + 1;
                this.read = iArr5[i13];
                return 0;
            case 13:
                int[] iArr6 = this.MediaMetadataCompat;
                int i14 = this.AudioAttributesImplApi26Parcelizer;
                iArr6[i14] = 128;
                this.AudioAttributesImplApi26Parcelizer = i14;
                iArr6[i14 - 1] = iArr6[i14 - 1] % iArr6[i14];
                return 0;
            case 14:
                int[] iArr7 = this.MediaMetadataCompat;
                int i15 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i15 + 1;
                iArr7[i15] = 2;
                return 0;
            case 15:
                int i16 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i16;
                this.read = this.MediaMetadataCompat[i16] == 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr8 = this.MediaMetadataCompat;
                int i17 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i17 + 1;
                iArr8[i17] = 93;
                return 0;
            case 17:
                int i18 = this.AudioAttributesImplApi26Parcelizer;
                int i19 = i18 - 1;
                int[] iArr9 = this.MediaMetadataCompat;
                iArr9[i18 - 2] = iArr9[i18 - 2] + iArr9[i19];
                iArr9[i19] = iArr9[i18 - 2];
                this.AudioAttributesImplApi26Parcelizer = i18 + 1;
                iArr9[i18] = 128;
                return 0;
            case 18:
                int i20 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i20;
                this.read = this.MediaMetadataCompat[i20] != 0 ? 0 : 1;
                return 0;
            case 19:
                int[] iArr10 = this.MediaMetadataCompat;
                int i21 = this.AudioAttributesImplApi26Parcelizer;
                iArr10[i21] = 2;
                this.AudioAttributesImplApi26Parcelizer = i21;
                iArr10[i21 - 1] = iArr10[i21 - 1] % iArr10[i21];
                return 0;
            case 20:
                int[] iArr11 = this.MediaMetadataCompat;
                int i22 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i22 + 1;
                iArr11[i22] = 62;
                return 0;
            case 21:
                int[] iArr12 = this.MediaMetadataCompat;
                int i23 = this.AudioAttributesImplApi26Parcelizer;
                iArr12[i23] = 0;
                this.AudioAttributesImplApi26Parcelizer = i23;
                iArr12[i23 - 1] = iArr12[i23 - 1] / iArr12[i23];
                return 0;
            case 22:
                int[] iArr13 = this.MediaMetadataCompat;
                int i24 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i24;
                this.read = iArr13[i24];
                return 0;
            case 23:
                int[] iArr14 = this.MediaMetadataCompat;
                int i25 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i25 + 1;
                iArr14[i25] = 83;
                return 0;
            case 24:
                int[] iArr15 = this.MediaMetadataCompat;
                int i26 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i26 + 1;
                iArr15[i26] = 13;
                return 0;
            case 25:
                for (int i27 = this.AudioAttributesImplApi26Parcelizer - 1; i27 >= 0; i27--) {
                    this.MediaBrowserCompatSearchResultReceiver[i27] = null;
                }
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objArr5[0] = this.AudioAttributesImplBaseParcelizer;
                return 0;
            case 26:
                int i28 = this.AudioAttributesImplApi26Parcelizer;
                int i29 = i28 - 1;
                this.AudioAttributesImplApi26Parcelizer = i29;
                int[] iArr16 = this.MediaMetadataCompat;
                iArr16[i28 - 2] = iArr16[i28 - 2] % iArr16[i29];
                int i30 = i28 - 2;
                this.AudioAttributesImplApi26Parcelizer = i30;
                this.MediaBrowserCompatSearchResultReceiver[i30] = null;
                return 0;
            case 27:
                int[] iArr17 = this.MediaMetadataCompat;
                int i31 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i31 + 1;
                iArr17[i31] = 101;
                return 0;
            case 28:
                int i32 = this.AudioAttributesImplApi26Parcelizer;
                int i33 = i32 - 1;
                this.AudioAttributesImplApi26Parcelizer = i33;
                int[] iArr18 = this.MediaMetadataCompat;
                iArr18[i32 - 2] = iArr18[i32 - 2] + iArr18[i33];
                return 0;
            case 29:
                int[] iArr19 = this.MediaMetadataCompat;
                int i34 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i34 + 1;
                iArr19[i34] = iArr19[i34 - 1];
                return 0;
            case 30:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i35 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i35 + 1;
                objArr6[i35] = null;
                return 0;
            case 31:
                int[] iArr20 = this.MediaMetadataCompat;
                int i36 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i36 + 1;
                iArr20[i36] = 105;
                return 0;
            case 32:
                int[] iArr21 = this.MediaMetadataCompat;
                int i37 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i37 + 1;
                iArr21[i37] = 1;
                return 0;
            case 33:
                int[] iArr22 = this.MediaMetadataCompat;
                int i38 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i38 + 1;
                iArr22[i38] = 0;
                return 0;
            case 34:
                int[] iArr23 = this.MediaMetadataCompat;
                int i39 = this.AudioAttributesImplApi26Parcelizer;
                iArr23[i39] = 113;
                this.AudioAttributesImplApi26Parcelizer = i39;
                iArr23[i39 - 1] = iArr23[i39 - 1] + iArr23[i39];
                return 0;
            case 35:
                int[] iArr24 = this.MediaMetadataCompat;
                int i40 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i40 + 1;
                iArr24[i40] = 128;
                return 0;
            case 36:
                int[] iArr25 = this.MediaMetadataCompat;
                int i41 = this.AudioAttributesImplApi26Parcelizer;
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj3 = objArr7[i41 - 1];
                objArr7[i41 - 1] = null;
                iArr25[i41 - 1] = ((int[]) obj3).length;
                int i42 = i41 - 1;
                this.AudioAttributesImplApi26Parcelizer = i42;
                objArr7[i42] = null;
                return 0;
            case 37:
                int[] iArr26 = this.MediaMetadataCompat;
                int i43 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i43 + 1;
                iArr26[i43] = 71;
                return 0;
            case 38:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i44 = this.AudioAttributesImplApi26Parcelizer;
                objArr8[i44] = objArr8[i44 - 1];
                this.AudioAttributesImplApi26Parcelizer = i44;
                Object obj4 = objArr8[i44];
                objArr8[i44] = null;
                objArr8[11] = obj4;
                return 0;
            case 39:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i45 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i45 + 1;
                objArr9[i45] = objArr9[13];
                return 0;
            case 40:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i46 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i46 + 1;
                objArr10[i46] = objArr10[12];
                return 0;
            case 41:
                int i47 = this.AudioAttributesImplApi26Parcelizer;
                int i48 = i47 - 1;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                objArr11[i48] = null;
                this.AudioAttributesImplApi26Parcelizer = i47;
                objArr11[i48] = objArr11[11];
                return 0;
            case 42:
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i49 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i49 + 1;
                objArr12[i49] = objArr12[14];
                return 0;
            case 43:
                int[] iArr27 = this.MediaMetadataCompat;
                int i50 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i50 + 1;
                iArr27[i50] = 61;
                return 0;
            case 44:
                int i51 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i51;
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj5 = objArr13[i51];
                objArr13[i51] = null;
                objArr13[12] = obj5;
                return 0;
            case 45:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i52 = this.AudioAttributesImplApi26Parcelizer;
                objArr14[i52] = objArr14[11];
                this.AudioAttributesImplApi26Parcelizer = i52 + 2;
                objArr14[i52 + 1] = objArr14[12];
                return 0;
            case 46:
                int[] iArr28 = this.MediaMetadataCompat;
                int i53 = this.AudioAttributesImplApi26Parcelizer;
                iArr28[i53] = 2;
                iArr28[i53 + 1] = 2;
                int i54 = i53 + 1;
                this.AudioAttributesImplApi26Parcelizer = i54;
                iArr28[i53] = iArr28[i53] % iArr28[i54];
                return 0;
            case 47:
                int[] iArr29 = this.MediaMetadataCompat;
                int i55 = this.AudioAttributesImplApi26Parcelizer;
                iArr29[i55] = 99;
                this.AudioAttributesImplApi26Parcelizer = i55;
                iArr29[i55 - 1] = iArr29[i55 - 1] + iArr29[i55];
                return 0;
            case 48:
                int[] iArr30 = this.MediaMetadataCompat;
                int i56 = this.AudioAttributesImplApi26Parcelizer;
                iArr30[i56] = iArr30[i56 - 1];
                this.AudioAttributesImplApi26Parcelizer = i56 + 2;
                iArr30[i56 + 1] = 128;
                return 0;
            case 49:
                int[] iArr31 = this.MediaMetadataCompat;
                int i57 = this.AudioAttributesImplApi26Parcelizer;
                iArr31[i57] = 125;
                this.AudioAttributesImplApi26Parcelizer = i57;
                iArr31[i57 - 1] = iArr31[i57 - 1] + iArr31[i57];
                return 0;
            case 50:
                int i58 = this.AudioAttributesImplApi26Parcelizer;
                int i59 = i58 - 1;
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj6 = objArr15[i59];
                objArr15[i59] = null;
                objArr15[12] = obj6;
                objArr15[i59] = objArr15[11];
                this.AudioAttributesImplApi26Parcelizer = i58 + 1;
                objArr15[i58] = objArr15[12];
                return 0;
            case 51:
                int[] iArr32 = this.MediaMetadataCompat;
                int i60 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i60 + 1;
                iArr32[i60] = 81;
                return 0;
            case 52:
                int[] iArr33 = this.MediaMetadataCompat;
                int i61 = this.AudioAttributesImplApi26Parcelizer;
                iArr33[i61] = 22;
                this.AudioAttributesImplApi26Parcelizer = i61 + 2;
                iArr33[i61 + 1] = 0;
                return 0;
            case 53:
                int i62 = this.AudioAttributesImplApi26Parcelizer;
                int i63 = i62 - 1;
                this.AudioAttributesImplApi26Parcelizer = i63;
                int[] iArr34 = this.MediaMetadataCompat;
                iArr34[i62 - 2] = iArr34[i62 - 2] / iArr34[i63];
                return 0;
            case 54:
                int[] iArr35 = this.MediaMetadataCompat;
                int i64 = this.AudioAttributesImplApi26Parcelizer;
                iArr35[i64] = iArr35[i64 - 1];
                iArr35[i64 + 1] = 128;
                int i65 = i64 + 1;
                this.AudioAttributesImplApi26Parcelizer = i65;
                iArr35[i64] = iArr35[i64] % iArr35[i65];
                return 0;
            case 55:
                int i66 = this.AudioAttributesImplApi26Parcelizer;
                int i67 = i66 - 1;
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj7 = objArr16[i67];
                objArr16[i67] = null;
                objArr16[12] = obj7;
                this.AudioAttributesImplApi26Parcelizer = i66;
                objArr16[i67] = objArr16[11];
                return 0;
            case 56:
                int[] iArr36 = this.MediaMetadataCompat;
                int i68 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i68 + 1;
                iArr36[i68] = 27;
                return 0;
            case 57:
                int[] iArr37 = this.MediaMetadataCompat;
                int i69 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i69 + 1;
                iArr37[i69] = 60;
                return 0;
            case 58:
                int[] iArr38 = this.MediaMetadataCompat;
                int i70 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i70 + 1;
                iArr38[i70] = 66;
                return 0;
            case 59:
                int[] iArr39 = this.MediaMetadataCompat;
                int i71 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i71 + 1;
                iArr39[i71] = 51;
                return 0;
            case 60:
                int[] iArr40 = this.MediaMetadataCompat;
                int i72 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i72 + 1;
                iArr40[i72] = 1;
                return 0;
            case 61:
                int i73 = this.AudioAttributesImplApi26Parcelizer;
                int i74 = i73 - 1;
                int[] iArr41 = this.MediaMetadataCompat;
                iArr41[i73 - 2] = iArr41[i73 - 2] + iArr41[i74];
                this.AudioAttributesImplApi26Parcelizer = i73;
                iArr41[i74] = iArr41[i73 - 2];
                return 0;
            case 62:
                int i75 = this.AudioAttributesImplApi26Parcelizer;
                int i76 = i75 - 1;
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj8 = objArr17[i76];
                objArr17[i76] = null;
                objArr17[13] = obj8;
                this.AudioAttributesImplApi26Parcelizer = i75;
                objArr17[i76] = objArr17[12];
                return 0;
            case 63:
                int i77 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i77;
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj9 = objArr18[i77];
                objArr18[i77] = null;
                this.read = obj9 == null ? 0 : 1;
                return 0;
            case 64:
                int[] iArr42 = this.MediaMetadataCompat;
                int i78 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i78 + 1;
                iArr42[i78] = 123;
                return 0;
            case 65:
                int[] iArr43 = this.MediaMetadataCompat;
                int i79 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i79 + 1;
                iArr43[i79] = 72;
                return 0;
            case 66:
                int[] iArr44 = this.MediaMetadataCompat;
                int i80 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i80 + 1;
                iArr44[i80] = 48;
                return 0;
            case 67:
                Object[] objArr19 = this.MediaBrowserCompatSearchResultReceiver;
                int i81 = this.AudioAttributesImplApi26Parcelizer;
                objArr19[i81] = objArr19[i81 - 1];
                this.AudioAttributesImplApi26Parcelizer = i81;
                Object obj10 = objArr19[i81];
                objArr19[i81] = null;
                objArr19[15] = obj10;
                return 0;
            case 68:
                Object[] objArr20 = this.MediaBrowserCompatSearchResultReceiver;
                int i82 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i82 + 1;
                objArr20[i82] = objArr20[15];
                return 0;
            case 69:
                int i83 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i83;
                Object[] objArr21 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr21[i83];
                objArr21[i83] = null;
                objArr21[15] = obj11;
                return 0;
            case 70:
                int i84 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i84;
                int[] iArr45 = this.MediaMetadataCompat;
                iArr45[14] = iArr45[i84];
                return 0;
            case 71:
                int i85 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i85;
                Object[] objArr22 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj12 = objArr22[i85];
                objArr22[i85] = null;
                this.read = obj12 != null ? 0 : 1;
                return 0;
            case 72:
                int i86 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i86;
                int[] iArr46 = this.MediaMetadataCompat;
                iArr46[12] = iArr46[i86];
                return 0;
            case 73:
                int[] iArr47 = this.MediaMetadataCompat;
                int i87 = this.AudioAttributesImplApi26Parcelizer;
                iArr47[i87] = 0;
                this.AudioAttributesImplApi26Parcelizer = i87;
                iArr47[12] = iArr47[i87];
                return 0;
            case 74:
                int[] iArr48 = this.MediaMetadataCompat;
                int i88 = this.AudioAttributesImplApi26Parcelizer;
                iArr48[i88] = 0;
                iArr48[13] = iArr48[i88];
                this.AudioAttributesImplApi26Parcelizer = i88 + 1;
                iArr48[i88] = iArr48[12];
                return 0;
            case 75:
                int[] iArr49 = this.MediaMetadataCompat;
                int i89 = this.AudioAttributesImplApi26Parcelizer;
                iArr49[i89] = 0;
                iArr49[13] = iArr49[i89];
                Object[] objArr23 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i89 + 1;
                objArr23[i89] = objArr23[11];
                return 0;
            case 76:
                int i90 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i90;
                int[] iArr50 = this.MediaMetadataCompat;
                iArr50[13] = iArr50[i90];
                return 0;
            case 77:
                int i91 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i91;
                int[] iArr51 = this.MediaMetadataCompat;
                iArr51[15] = iArr51[i91];
                return 0;
            case 78:
                int[] iArr52 = this.MediaMetadataCompat;
                int i92 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i92 + 1;
                iArr52[i92] = iArr52[14];
                return 0;
            case 79:
                int[] iArr53 = this.MediaMetadataCompat;
                int i93 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i93 + 1;
                iArr53[i93] = iArr53[12];
                return 0;
            case 80:
                int[] iArr54 = this.MediaMetadataCompat;
                int i94 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i94 + 1;
                iArr54[i94] = iArr54[13];
                return 0;
            case 81:
                int[] iArr55 = this.MediaMetadataCompat;
                int i95 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i95 + 1;
                iArr55[i95] = iArr55[15];
                return 0;
            case 82:
                int[] iArr56 = this.MediaMetadataCompat;
                int i96 = this.AudioAttributesImplApi26Parcelizer;
                iArr56[i96] = 2;
                this.AudioAttributesImplApi26Parcelizer = i96;
                iArr56[i96 - 1] = iArr56[i96 - 1] % iArr56[i96];
                int i97 = i96 - 1;
                this.AudioAttributesImplApi26Parcelizer = i97;
                this.MediaBrowserCompatSearchResultReceiver[i97] = null;
                return 0;
            case 83:
                int[] iArr57 = this.MediaMetadataCompat;
                int i98 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i98 + 1;
                iArr57[i98] = 31;
                return 0;
            case 84:
                int[] iArr58 = this.MediaMetadataCompat;
                int i99 = this.AudioAttributesImplApi26Parcelizer;
                iArr58[i99] = 123;
                this.AudioAttributesImplApi26Parcelizer = i99;
                iArr58[i99 - 1] = iArr58[i99 - 1] + iArr58[i99];
                return 0;
            case 85:
                int[] iArr59 = this.MediaMetadataCompat;
                int i100 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i100 + 1;
                iArr59[i100] = 37;
                return 0;
            case 86:
                int[] iArr60 = this.MediaMetadataCompat;
                int i101 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i101 + 1;
                iArr60[i101] = 34;
                return 0;
            case 87:
                int[] iArr61 = this.MediaMetadataCompat;
                int i102 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i102 + 1;
                iArr61[i102] = 40;
                return 0;
            case 88:
                int[] iArr62 = this.MediaMetadataCompat;
                int i103 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i103 + 1;
                iArr62[i103] = 49;
                return 0;
            case 89:
                int[] iArr63 = this.MediaMetadataCompat;
                int i104 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i104 + 1;
                iArr63[i104] = 96;
                return 0;
            case 90:
                int[] iArr64 = this.MediaMetadataCompat;
                int i105 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i105 + 1;
                iArr64[i105] = 30;
                return 0;
            case 91:
                int[] iArr65 = this.MediaMetadataCompat;
                int i106 = this.AudioAttributesImplApi26Parcelizer;
                iArr65[i106] = 1;
                this.AudioAttributesImplApi26Parcelizer = i106;
                iArr65[i106 - 1] = iArr65[i106] ^ iArr65[i106 - 1];
                return 0;
            case 92:
                this.read = this.MediaMetadataCompat[this.AudioAttributesImplApi26Parcelizer - 1];
                return 0;
            case 93:
                int[] iArr66 = this.MediaMetadataCompat;
                int i107 = this.AudioAttributesImplApi26Parcelizer;
                iArr66[i107] = 97;
                this.AudioAttributesImplApi26Parcelizer = i107;
                iArr66[i107 - 1] = iArr66[i107 - 1] + iArr66[i107];
                return 0;
            case 94:
                int[] iArr67 = this.MediaMetadataCompat;
                int i108 = this.AudioAttributesImplApi26Parcelizer;
                iArr67[i108] = 29;
                this.AudioAttributesImplApi26Parcelizer = i108;
                iArr67[i108 - 1] = iArr67[i108 - 1] + iArr67[i108];
                return 0;
            case 95:
                int[] iArr68 = this.MediaMetadataCompat;
                int i109 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i109 + 1;
                iArr68[i109] = 22;
                return 0;
            case 96:
                int[] iArr69 = this.MediaMetadataCompat;
                int i110 = this.AudioAttributesImplApi26Parcelizer;
                iArr69[i110] = 67;
                iArr69[i110 - 1] = iArr69[i110 - 1] + iArr69[i110];
                this.AudioAttributesImplApi26Parcelizer = i110 + 1;
                iArr69[i110] = iArr69[i110 - 1];
                return 0;
            case 97:
                int i111 = this.AudioAttributesImplApi26Parcelizer;
                int i112 = i111 - 2;
                this.AudioAttributesImplApi26Parcelizer = i112;
                Object[] objArr24 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj13 = objArr24[i112];
                objArr24[i112] = null;
                Object obj14 = objArr24[i111 - 1];
                objArr24[i111 - 1] = null;
                this.read = obj13 == obj14 ? 0 : 1;
                return 0;
            case 98:
                int[] iArr70 = this.MediaMetadataCompat;
                int i113 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i113 + 1;
                iArr70[i113] = 1101;
                return 0;
            case 99:
                int[] iArr71 = this.MediaMetadataCompat;
                int i114 = this.AudioAttributesImplApi26Parcelizer;
                iArr71[i114] = 23;
                iArr71[i114 - 1] = iArr71[i114 - 1] + iArr71[i114];
                this.AudioAttributesImplApi26Parcelizer = i114 + 1;
                iArr71[i114] = iArr71[i114 - 1];
                return 0;
            case 100:
                int[] iArr72 = this.MediaMetadataCompat;
                int i115 = this.AudioAttributesImplApi26Parcelizer;
                iArr72[i115] = 7;
                this.AudioAttributesImplApi26Parcelizer = i115;
                iArr72[i115 - 1] = iArr72[i115 - 1] + iArr72[i115];
                return 0;
            case 101:
                int[] iArr73 = this.MediaMetadataCompat;
                int i116 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i116 + 1;
                iArr73[i116] = 63;
                return 0;
            case 102:
                int[] iArr74 = this.MediaMetadataCompat;
                int i117 = this.AudioAttributesImplApi26Parcelizer;
                iArr74[i117] = 3;
                iArr74[i117 + 1] = 5;
                int i118 = i117 + 1;
                this.AudioAttributesImplApi26Parcelizer = i118;
                iArr74[i117] = iArr74[i117] % iArr74[i118];
                return 0;
            case 103:
                int[] iArr75 = this.MediaMetadataCompat;
                int i119 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i119 + 1;
                iArr75[i119] = 74;
                return 0;
            case 104:
                int[] iArr76 = this.MediaMetadataCompat;
                int i120 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i120 + 1;
                iArr76[i120] = 3;
                return 0;
            case 105:
                int[] iArr77 = this.MediaMetadataCompat;
                int i121 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i121 + 1;
                iArr77[i121] = 28;
                return 0;
            case 106:
                int[] iArr78 = this.MediaMetadataCompat;
                int i122 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i122 + 1;
                iArr78[i122] = 77;
                return 0;
            case 107:
                int i123 = this.AudioAttributesImplApi26Parcelizer;
                int i124 = i123 - 1;
                Object[] objArr25 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj15 = objArr25[i124];
                objArr25[i124] = null;
                objArr25[13] = obj15;
                this.AudioAttributesImplApi26Parcelizer = i123;
                objArr25[i124] = objArr25[11];
                return 0;
            case 108:
                Object[] objArr26 = this.MediaBrowserCompatSearchResultReceiver;
                int i125 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i125 + 1;
                objArr26[i125] = objArr26[i125 - 1];
                return 0;
            case 109:
                int[] iArr79 = this.MediaMetadataCompat;
                int i126 = this.AudioAttributesImplApi26Parcelizer;
                iArr79[i126] = 33;
                iArr79[i126 - 1] = iArr79[i126 - 1] + iArr79[i126];
                this.AudioAttributesImplApi26Parcelizer = i126 + 1;
                iArr79[i126] = iArr79[i126 - 1];
                return 0;
            case 110:
                int[] iArr80 = this.MediaMetadataCompat;
                int i127 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i127 + 1;
                iArr80[i127] = 53;
                return 0;
            case 111:
                int[] iArr81 = this.MediaMetadataCompat;
                int i128 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i128 + 1;
                iArr81[i128] = 55;
                return 0;
            case 112:
                int[] iArr82 = this.MediaMetadataCompat;
                int i129 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i129 + 1;
                iArr82[i129] = 17;
                return 0;
            case 113:
                int[] iArr83 = this.MediaMetadataCompat;
                int i130 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i130 + 1;
                iArr83[i130] = 58;
                return 0;
            case 114:
                Object[] objArr27 = this.MediaBrowserCompatSearchResultReceiver;
                int i131 = this.AudioAttributesImplApi26Parcelizer;
                objArr27[i131] = objArr27[12];
                this.AudioAttributesImplApi26Parcelizer = i131 + 2;
                objArr27[i131 + 1] = objArr27[11];
                return 0;
            case 115:
                int[] iArr84 = this.MediaMetadataCompat;
                int i132 = this.AudioAttributesImplApi26Parcelizer;
                iArr84[i132] = 29;
                iArr84[i132 - 1] = iArr84[i132 - 1] + iArr84[i132];
                this.AudioAttributesImplApi26Parcelizer = i132 + 1;
                iArr84[i132] = iArr84[i132 - 1];
                return 0;
            case 116:
                int[] iArr85 = this.MediaMetadataCompat;
                int i133 = this.AudioAttributesImplApi26Parcelizer;
                iArr85[i133] = 11;
                iArr85[i133 - 1] = iArr85[i133 - 1] + iArr85[i133];
                this.AudioAttributesImplApi26Parcelizer = i133 + 1;
                iArr85[i133] = iArr85[i133 - 1];
                return 0;
            case 117:
                int[] iArr86 = this.MediaMetadataCompat;
                int i134 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i134 + 1;
                iArr86[i134] = 33;
                return 0;
            case 118:
                int[] iArr87 = this.MediaMetadataCompat;
                int i135 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i135 + 1;
                iArr87[i135] = 46;
                return 0;
            case 119:
                int[] iArr88 = this.MediaMetadataCompat;
                int i136 = this.AudioAttributesImplApi26Parcelizer;
                iArr88[i136] = 101;
                iArr88[i136 - 1] = iArr88[i136 - 1] + iArr88[i136];
                this.AudioAttributesImplApi26Parcelizer = i136 + 1;
                iArr88[i136] = iArr88[i136 - 1];
                return 0;
            case 120:
                Object[] objArr28 = this.MediaBrowserCompatSearchResultReceiver;
                int i137 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i137 + 1;
                objArr28[i137] = null;
                int[] iArr89 = this.MediaMetadataCompat;
                Object obj16 = objArr28[i137];
                objArr28[i137] = null;
                iArr89[i137] = ((int[]) obj16).length;
                this.AudioAttributesImplApi26Parcelizer = i137;
                objArr28[i137] = null;
                return 0;
            case 121:
                int[] iArr90 = this.MediaMetadataCompat;
                int i138 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i138 + 1;
                iArr90[i138] = 23;
                return 0;
            case 122:
                int[] iArr91 = this.MediaMetadataCompat;
                int i139 = this.AudioAttributesImplApi26Parcelizer;
                iArr91[i139] = 0;
                this.AudioAttributesImplApi26Parcelizer = i139;
                iArr91[i139 - 1] = iArr91[i139 - 1] / iArr91[i139];
                int i140 = i139 - 1;
                this.AudioAttributesImplApi26Parcelizer = i140;
                this.MediaBrowserCompatSearchResultReceiver[i140] = null;
                return 0;
            case 123:
                int[] iArr92 = this.MediaMetadataCompat;
                int i141 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i141 + 1;
                iArr92[i141] = 65;
                return 0;
            case 124:
                int[] iArr93 = this.MediaMetadataCompat;
                int i142 = this.AudioAttributesImplApi26Parcelizer;
                iArr93[i142] = 69;
                this.AudioAttributesImplApi26Parcelizer = i142;
                iArr93[i142 - 1] = iArr93[i142 - 1] + iArr93[i142];
                return 0;
            case 125:
                int[] iArr94 = this.MediaMetadataCompat;
                int i143 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i143 + 1;
                iArr94[i143] = 11;
                return 0;
            case 126:
                int[] iArr95 = this.MediaMetadataCompat;
                int i144 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i144 + 1;
                iArr95[i144] = 50;
                return 0;
            case 127:
                int[] iArr96 = this.MediaMetadataCompat;
                int i145 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i145 + 1;
                iArr96[i145] = 87;
                return 0;
            case 128:
                int[] iArr97 = this.MediaMetadataCompat;
                int i146 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i146 + 1;
                iArr97[i146] = 80;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr98 = this.MediaMetadataCompat;
                int i147 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i147 + 1;
                iArr98[i147] = 75;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                Object[] objArr29 = this.MediaBrowserCompatSearchResultReceiver;
                int i148 = this.AudioAttributesImplApi26Parcelizer;
                objArr29[i148] = objArr29[i148 - 1];
                this.AudioAttributesImplApi26Parcelizer = i148;
                Object obj17 = objArr29[i148];
                objArr29[i148] = null;
                objArr29[12] = obj17;
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr99 = this.MediaMetadataCompat;
                int i149 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i149 + 1;
                iArr99[i149] = 57;
                return 0;
            case 132:
                int[] iArr100 = this.MediaMetadataCompat;
                int i150 = this.AudioAttributesImplApi26Parcelizer;
                iArr100[i150] = 13;
                iArr100[i150 - 1] = iArr100[i150 - 1] + iArr100[i150];
                this.AudioAttributesImplApi26Parcelizer = i150 + 1;
                iArr100[i150] = iArr100[i150 - 1];
                return 0;
            case 133:
                int[] iArr101 = this.MediaMetadataCompat;
                int i151 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i151 + 1;
                iArr101[i151] = 29;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int[] iArr102 = this.MediaMetadataCompat;
                int i152 = this.AudioAttributesImplApi26Parcelizer;
                iArr102[i152] = 43;
                this.AudioAttributesImplApi26Parcelizer = i152;
                iArr102[i152 - 1] = iArr102[i152 - 1] + iArr102[i152];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr103 = this.MediaMetadataCompat;
                int i153 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i153 + 1;
                iArr103[i153] = 45;
                return 0;
            case 136:
                int[] iArr104 = this.MediaMetadataCompat;
                int i154 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i154 + 1;
                iArr104[i154] = 41;
                return 0;
            case 137:
                int[] iArr105 = this.MediaMetadataCompat;
                int i155 = this.AudioAttributesImplApi26Parcelizer;
                iArr105[i155] = 49;
                this.AudioAttributesImplApi26Parcelizer = i155;
                iArr105[i155 - 1] = iArr105[i155 - 1] + iArr105[i155];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr106 = this.MediaMetadataCompat;
                int i156 = this.AudioAttributesImplApi26Parcelizer;
                iArr106[i156] = 43;
                iArr106[i156 - 1] = iArr106[i156 - 1] + iArr106[i156];
                this.AudioAttributesImplApi26Parcelizer = i156 + 1;
                iArr106[i156] = iArr106[i156 - 1];
                return 0;
            case 139:
                int[] iArr107 = this.MediaMetadataCompat;
                int i157 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i157 + 1;
                iArr107[i157] = 64;
                return 0;
            case 140:
                long[] jArr = this.RatingCompat;
                int i158 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i158 + 1;
                jArr[i158] = this.write;
                return 0;
            case 141:
                int i159 = this.AudioAttributesImplApi26Parcelizer;
                int i160 = i159 - 1;
                long[] jArr2 = this.RatingCompat;
                jArr2[13] = jArr2[i160];
                int[] iArr108 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i159;
                iArr108[i160] = 1;
                return 0;
            case 142:
                int[] iArr109 = this.MediaMetadataCompat;
                int i161 = this.AudioAttributesImplApi26Parcelizer;
                iArr109[i161] = 8;
                this.AudioAttributesImplApi26Parcelizer = i161;
                iArr109[i161 - 1] = iArr109[i161 - 1] >> iArr109[i161];
                return 0;
            case 143:
                int[] iArr110 = this.MediaMetadataCompat;
                int i162 = this.AudioAttributesImplApi26Parcelizer;
                iArr110[i162] = 52;
                long[] jArr3 = this.RatingCompat;
                jArr3[i162 - 1] = jArr3[i162 - 1] << iArr110[i162];
                this.AudioAttributesImplApi26Parcelizer = i162 + 1;
                iArr110[i162] = 52;
                return 0;
            case 144:
                int i163 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr4 = this.RatingCompat;
                jArr4[i163 - 2] = jArr4[i163 - 2] >>> this.MediaMetadataCompat[i163 - 1];
                int i164 = i163 - 2;
                this.AudioAttributesImplApi26Parcelizer = i164;
                jArr4[i163 - 3] = jArr4[i163 - 3] - jArr4[i164];
                return 0;
            case 145:
                int[] iArr111 = this.MediaMetadataCompat;
                int i165 = this.AudioAttributesImplApi26Parcelizer;
                iArr111[i165] = 12;
                long[] jArr5 = this.RatingCompat;
                jArr5[i165 - 1] = jArr5[i165 - 1] >> iArr111[i165];
                int i166 = i165 - 1;
                this.AudioAttributesImplApi26Parcelizer = i166;
                jArr5[15] = jArr5[i166];
                return 0;
            case 146:
                long[] jArr6 = this.RatingCompat;
                int i167 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i167] = jArr6[13];
                this.AudioAttributesImplApi26Parcelizer = i167 + 2;
                jArr6[i167 + 1] = jArr6[15];
                return 0;
            case 147:
                int i168 = this.AudioAttributesImplApi26Parcelizer;
                int i169 = i168 - 1;
                this.AudioAttributesImplApi26Parcelizer = i169;
                long[] jArr7 = this.RatingCompat;
                this.MediaMetadataCompat[i168 - 2] = (jArr7[i168 - 2] > jArr7[i169] ? 1 : (jArr7[i168 - 2] == jArr7[i169] ? 0 : -1));
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int[] iArr112 = this.MediaMetadataCompat;
                int i170 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i170 + 1;
                iArr112[i170] = 4;
                return 0;
            case 149:
                Object[] objArr30 = this.MediaBrowserCompatSearchResultReceiver;
                int i171 = this.AudioAttributesImplApi26Parcelizer;
                objArr30[i171] = objArr30[i171 - 1];
                int[] iArr113 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i171 + 2;
                iArr113[i171 + 1] = 1;
                return 0;
            case 150:
                int[] iArr114 = this.MediaMetadataCompat;
                int i172 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i172 + 1;
                iArr114[i172] = 1;
                this.MediaBrowserCompatSearchResultReceiver[i172] = new int[iArr114[i172]];
                return 0;
            case 151:
                int i173 = this.AudioAttributesImplApi26Parcelizer;
                int i174 = i173 - 3;
                this.AudioAttributesImplApi26Parcelizer = i174;
                Object[] objArr31 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj18 = objArr31[i174];
                objArr31[i174] = null;
                int i175 = this.MediaMetadataCompat[i173 - 2];
                Object obj19 = objArr31[i173 - 1];
                objArr31[i173 - 1] = null;
                ((Object[]) obj18)[i175] = obj19;
                this.AudioAttributesImplApi26Parcelizer = i173 - 2;
                objArr31[i174] = objArr31[i173 - 4];
                return 0;
            case 152:
                int[] iArr115 = this.MediaMetadataCompat;
                int i176 = this.AudioAttributesImplApi26Parcelizer;
                iArr115[i176] = 2;
                this.AudioAttributesImplApi26Parcelizer = i176 + 2;
                iArr115[i176 + 1] = 1;
                return 0;
            case 153:
                Object[] objArr32 = this.MediaBrowserCompatSearchResultReceiver;
                int i177 = this.AudioAttributesImplApi26Parcelizer;
                objArr32[i177 - 1] = new int[this.MediaMetadataCompat[i177 - 1]];
                return 0;
            case 154:
                int i178 = this.AudioAttributesImplApi26Parcelizer;
                int i179 = i178 - 3;
                this.AudioAttributesImplApi26Parcelizer = i179;
                Object[] objArr33 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj20 = objArr33[i179];
                objArr33[i179] = null;
                int[] iArr116 = this.MediaMetadataCompat;
                int i180 = iArr116[i178 - 2];
                Object obj21 = objArr33[i178 - 1];
                objArr33[i178 - 1] = null;
                ((Object[]) obj20)[i180] = obj21;
                objArr33[i179] = objArr33[i178 - 4];
                this.AudioAttributesImplApi26Parcelizer = i178 - 1;
                iArr116[i178 - 2] = 3;
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int i181 = this.AudioAttributesImplApi26Parcelizer;
                int i182 = i181 - 3;
                this.AudioAttributesImplApi26Parcelizer = i182;
                Object[] objArr34 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj22 = objArr34[i182];
                objArr34[i182] = null;
                int i183 = this.MediaMetadataCompat[i181 - 2];
                Object obj23 = objArr34[i181 - 1];
                objArr34[i181 - 1] = null;
                ((Object[]) obj22)[i183] = obj23;
                objArr34[i182] = objArr34[i181 - 4];
                int i184 = i181 - 3;
                this.AudioAttributesImplApi26Parcelizer = i184;
                objArr34[i184] = null;
                return 0;
            case 156:
                int[] iArr117 = this.MediaMetadataCompat;
                int i185 = this.AudioAttributesImplApi26Parcelizer;
                iArr117[i185] = 0;
                iArr117[23] = iArr117[i185];
                int i186 = i185 - 1;
                this.AudioAttributesImplApi26Parcelizer = i186;
                iArr117[22] = iArr117[i186];
                return 0;
            case 157:
                int i187 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i187;
                Object[] objArr35 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj24 = objArr35[i187];
                objArr35[i187] = null;
                objArr35[21] = obj24;
                return 0;
            case 158:
                int i188 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i188;
                Object[] objArr36 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj25 = objArr36[i188];
                objArr36[i188] = null;
                objArr36[20] = obj25;
                return 0;
            case 159:
                Object[] objArr37 = this.MediaBrowserCompatSearchResultReceiver;
                int i189 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i189 + 1;
                objArr37[i189] = objArr37[20];
                return 0;
            case 160:
                Object[] objArr38 = this.MediaBrowserCompatSearchResultReceiver;
                int i190 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i190 + 1;
                objArr38[i190] = objArr38[21];
                return 0;
            case 161:
                int[] iArr118 = this.MediaMetadataCompat;
                int i191 = this.AudioAttributesImplApi26Parcelizer;
                iArr118[i191] = 2;
                this.AudioAttributesImplApi26Parcelizer = i191;
                Object[] objArr39 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj26 = objArr39[i191 - 1];
                objArr39[i191 - 1] = null;
                objArr39[i191 - 1] = ((Object[]) obj26)[iArr118[i191]];
                return 0;
            case 162:
                int[] iArr119 = this.MediaMetadataCompat;
                int i192 = this.AudioAttributesImplApi26Parcelizer;
                iArr119[i192] = 0;
                this.AudioAttributesImplApi26Parcelizer = i192;
                Object[] objArr40 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj27 = objArr40[i192 - 1];
                objArr40[i192 - 1] = null;
                iArr119[i192 - 1] = ((int[]) obj27)[iArr119[i192]];
                return 0;
            case 163:
                int[] iArr120 = this.MediaMetadataCompat;
                int i193 = this.AudioAttributesImplApi26Parcelizer;
                iArr120[i193] = 3;
                this.AudioAttributesImplApi26Parcelizer = i193;
                Object[] objArr41 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj28 = objArr41[i193 - 1];
                objArr41[i193 - 1] = null;
                objArr41[i193 - 1] = ((Object[]) obj28)[iArr120[i193]];
                return 0;
            case 164:
                int i194 = this.AudioAttributesImplApi26Parcelizer;
                int i195 = i194 - 1;
                this.AudioAttributesImplApi26Parcelizer = i195;
                int[] iArr121 = this.MediaMetadataCompat;
                Object[] objArr42 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj29 = objArr42[i194 - 2];
                objArr42[i194 - 2] = null;
                iArr121[i194 - 2] = ((int[]) obj29)[iArr121[i195]];
                return 0;
            case 165:
                int[] iArr122 = this.MediaMetadataCompat;
                int i196 = this.AudioAttributesImplApi26Parcelizer;
                iArr122[i196] = 0;
                this.AudioAttributesImplApi26Parcelizer = i196;
                Object[] objArr43 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj30 = objArr43[i196 - 1];
                objArr43[i196 - 1] = null;
                objArr43[i196 - 1] = ((Object[]) obj30)[iArr122[i196]];
                return 0;
            case 166:
                int[] iArr123 = this.MediaMetadataCompat;
                int i197 = this.AudioAttributesImplApi26Parcelizer;
                iArr123[i197] = iArr123[22];
                iArr123[i197 + 1] = iArr123[23];
                int i198 = i197 + 1;
                this.AudioAttributesImplApi26Parcelizer = i198;
                iArr123[29] = iArr123[i198];
                return 0;
            case 167:
                int i199 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr124 = this.MediaMetadataCompat;
                iArr124[28] = iArr124[i199 - 1];
                int i200 = i199 - 2;
                Object[] objArr44 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj31 = objArr44[i200];
                objArr44[i200] = null;
                objArr44[27] = obj31;
                int i201 = i199 - 3;
                this.AudioAttributesImplApi26Parcelizer = i201;
                iArr124[26] = iArr124[i201];
                return 0;
            case 168:
                int i202 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i202;
                int[] iArr125 = this.MediaMetadataCompat;
                iArr125[25] = iArr125[i202];
                return 0;
            case 169:
                int i203 = this.AudioAttributesImplApi26Parcelizer;
                int i204 = i203 - 1;
                Object[] objArr45 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj32 = objArr45[i204];
                objArr45[i204] = null;
                objArr45[24] = obj32;
                this.AudioAttributesImplApi26Parcelizer = i203;
                objArr45[i204] = obj32;
                return 0;
            case 170:
                Object[] objArr46 = this.MediaBrowserCompatSearchResultReceiver;
                int i205 = this.AudioAttributesImplApi26Parcelizer;
                objArr46[i205] = objArr46[24];
                int[] iArr126 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i205 + 2;
                iArr126[i205 + 1] = iArr126[25];
                return 0;
            case 171:
                Object[] objArr47 = this.MediaBrowserCompatSearchResultReceiver;
                int i206 = this.AudioAttributesImplApi26Parcelizer;
                Object obj33 = objArr47[i206 - 2];
                objArr47[i206 - 2] = null;
                objArr47[i206 - 1] = obj33;
                int[] iArr127 = this.MediaMetadataCompat;
                iArr127[i206 - 2] = iArr127[i206 - 1];
                iArr127[i206] = 2;
                this.AudioAttributesImplApi26Parcelizer = i206;
                Object obj34 = objArr47[i206 - 1];
                objArr47[i206 - 1] = null;
                objArr47[i206 - 1] = ((Object[]) obj34)[iArr127[i206]];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr128 = this.MediaMetadataCompat;
                int i207 = this.AudioAttributesImplApi26Parcelizer;
                iArr128[i207 - 1] = iArr128[i207 - 2];
                Object[] objArr48 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj35 = objArr48[i207 - 1];
                objArr48[i207 - 1] = null;
                objArr48[i207 - 2] = obj35;
                this.AudioAttributesImplApi26Parcelizer = i207 + 1;
                iArr128[i207] = 0;
                int i208 = iArr128[i207];
                iArr128[i207] = iArr128[i207 - 1];
                iArr128[i207 - 1] = i208;
                return 0;
            case 173:
                int i209 = this.AudioAttributesImplApi26Parcelizer;
                int i210 = i209 - 3;
                this.AudioAttributesImplApi26Parcelizer = i210;
                Object[] objArr49 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj36 = objArr49[i210];
                objArr49[i210] = null;
                int[] iArr129 = this.MediaMetadataCompat;
                ((int[]) obj36)[iArr129[i209 - 2]] = iArr129[i209 - 1];
                return 0;
            case 174:
                Object[] objArr50 = this.MediaBrowserCompatSearchResultReceiver;
                int i211 = this.AudioAttributesImplApi26Parcelizer;
                objArr50[i211] = objArr50[24];
                int[] iArr130 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i211 + 2;
                iArr130[i211 + 1] = iArr130[26];
                Object obj37 = objArr50[i211];
                objArr50[i211] = null;
                objArr50[i211 + 1] = obj37;
                iArr130[i211] = iArr130[i211 + 1];
                return 0;
            case 175:
                int[] iArr131 = this.MediaMetadataCompat;
                int i212 = this.AudioAttributesImplApi26Parcelizer;
                iArr131[i212 - 1] = iArr131[i212 - 2];
                Object[] objArr51 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj38 = objArr51[i212 - 1];
                objArr51[i212 - 1] = null;
                objArr51[i212 - 2] = obj38;
                return 0;
            case 176:
                int[] iArr132 = this.MediaMetadataCompat;
                int i213 = this.AudioAttributesImplApi26Parcelizer;
                int i214 = iArr132[i213 - 1];
                iArr132[i213 - 1] = iArr132[i213 - 2];
                iArr132[i213 - 2] = i214;
                return 0;
            case 177:
                int i215 = this.AudioAttributesImplApi26Parcelizer;
                int i216 = i215 - 3;
                this.AudioAttributesImplApi26Parcelizer = i216;
                Object[] objArr52 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj39 = objArr52[i216];
                objArr52[i216] = null;
                int[] iArr133 = this.MediaMetadataCompat;
                ((int[]) obj39)[iArr133[i215 - 2]] = iArr133[i215 - 1];
                this.AudioAttributesImplApi26Parcelizer = i215 - 2;
                objArr52[i216] = objArr52[24];
                return 0;
            case 178:
                Object[] objArr53 = this.MediaBrowserCompatSearchResultReceiver;
                int i217 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i217 + 1;
                objArr53[i217] = objArr53[27];
                return 0;
            case 179:
                Object[] objArr54 = this.MediaBrowserCompatSearchResultReceiver;
                int i218 = this.AudioAttributesImplApi26Parcelizer;
                Object obj40 = objArr54[i218 - 2];
                objArr54[i218 - 2] = null;
                objArr54[i218 - 1] = obj40;
                int[] iArr134 = this.MediaMetadataCompat;
                iArr134[i218 - 2] = iArr134[i218 - 1];
                return 0;
            case 180:
                int i219 = this.AudioAttributesImplApi26Parcelizer;
                int i220 = i219 - 3;
                this.AudioAttributesImplApi26Parcelizer = i220;
                Object[] objArr55 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj41 = objArr55[i220];
                objArr55[i220] = null;
                int i221 = this.MediaMetadataCompat[i219 - 2];
                Object obj42 = objArr55[i219 - 1];
                objArr55[i219 - 1] = null;
                ((Object[]) obj41)[i221] = obj42;
                return 0;
            case 181:
                Object[] objArr56 = this.MediaBrowserCompatSearchResultReceiver;
                int i222 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i222 + 1;
                objArr56[i222] = objArr56[24];
                return 0;
            case 182:
                int[] iArr135 = this.MediaMetadataCompat;
                int i223 = this.AudioAttributesImplApi26Parcelizer;
                iArr135[i223] = iArr135[28];
                this.AudioAttributesImplApi26Parcelizer = i223 + 2;
                iArr135[i223 + 1] = iArr135[29];
                return 0;
            case 183:
                int i224 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i224;
                int[] iArr136 = this.MediaMetadataCompat;
                iArr136[27] = iArr136[i224];
                return 0;
            case 184:
                int i225 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i225;
                int[] iArr137 = this.MediaMetadataCompat;
                iArr137[26] = iArr137[i225];
                return 0;
            case 185:
                int[] iArr138 = this.MediaMetadataCompat;
                int i226 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i226 + 1;
                iArr138[i226] = iArr138[27];
                return 0;
            case 186:
                int[] iArr139 = this.MediaMetadataCompat;
                int i227 = this.AudioAttributesImplApi26Parcelizer;
                iArr139[i227] = iArr139[26];
                this.AudioAttributesImplApi26Parcelizer = i227;
                iArr139[i227 - 1] = iArr139[i227 - 1] + iArr139[i227];
                return 0;
            case 187:
                int i228 = this.AudioAttributesImplApi26Parcelizer;
                int i229 = i228 - 1;
                int[] iArr140 = this.MediaMetadataCompat;
                iArr140[i228 - 2] = iArr140[i228 - 2] + iArr140[i229];
                iArr140[i229] = iArr140[i228 - 2];
                this.AudioAttributesImplApi26Parcelizer = i228 + 1;
                iArr140[i228] = 13;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int i230 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr141 = this.MediaMetadataCompat;
                iArr141[i230 - 2] = iArr141[i230 - 2] << iArr141[i230 - 1];
                int i231 = i230 - 2;
                iArr141[i230 - 3] = iArr141[i230 - 3] ^ iArr141[i231];
                this.AudioAttributesImplApi26Parcelizer = i230 - 1;
                iArr141[i231] = iArr141[i230 - 3];
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr142 = this.MediaMetadataCompat;
                int i232 = this.AudioAttributesImplApi26Parcelizer;
                iArr142[i232] = 17;
                iArr142[i232 - 1] = iArr142[i232 - 1] >>> iArr142[i232];
                int i233 = i232 - 1;
                this.AudioAttributesImplApi26Parcelizer = i233;
                iArr142[i232 - 2] = iArr142[i232 - 2] ^ iArr142[i233];
                return 0;
            case 190:
                int[] iArr143 = this.MediaMetadataCompat;
                int i234 = this.AudioAttributesImplApi26Parcelizer;
                iArr143[i234] = iArr143[i234 - 1];
                iArr143[i234 + 1] = 5;
                int i235 = i234 + 1;
                this.AudioAttributesImplApi26Parcelizer = i235;
                iArr143[i234] = iArr143[i234] << iArr143[i235];
                return 0;
            case 191:
                int i236 = this.AudioAttributesImplApi26Parcelizer;
                int i237 = i236 - 1;
                int[] iArr144 = this.MediaMetadataCompat;
                iArr144[i236 - 2] = iArr144[i236 - 2] ^ iArr144[i237];
                Object[] objArr57 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj43 = objArr57[i236 - 3];
                objArr57[i236 - 3] = null;
                objArr57[i236 - 2] = obj43;
                iArr144[i236 - 3] = iArr144[i236 - 2];
                this.AudioAttributesImplApi26Parcelizer = i236;
                iArr144[i237] = 1;
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int i238 = this.AudioAttributesImplApi26Parcelizer;
                int i239 = i238 - 1;
                this.AudioAttributesImplApi26Parcelizer = i239;
                Object[] objArr58 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj44 = objArr58[i238 - 2];
                objArr58[i238 - 2] = null;
                objArr58[i238 - 2] = ((Object[]) obj44)[this.MediaMetadataCompat[i239]];
                return 0;
            case 193:
                long[] jArr8 = this.RatingCompat;
                int i240 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i240 + 1;
                jArr8[i240] = 0;
                return 0;
            case 194:
                Object[] objArr59 = this.MediaBrowserCompatSearchResultReceiver;
                int i241 = this.AudioAttributesImplApi26Parcelizer;
                objArr59[i241] = objArr59[i241 - 1];
                int[] iArr145 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i241 + 2;
                iArr145[i241 + 1] = 0;
                return 0;
            case 195:
                int[] iArr146 = this.MediaMetadataCompat;
                int i242 = this.AudioAttributesImplApi26Parcelizer;
                iArr146[i242] = 0;
                Object[] objArr60 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i242 + 2;
                objArr60[i242 + 1] = objArr60[12];
                return 0;
            case 196:
                int[] iArr147 = this.MediaMetadataCompat;
                int i243 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i243 + 1;
                iArr147[i243] = 16;
                return 0;
            case 197:
                int i244 = this.AudioAttributesImplApi26Parcelizer;
                int i245 = i244 - 1;
                this.AudioAttributesImplApi26Parcelizer = i245;
                int[] iArr148 = this.MediaMetadataCompat;
                iArr148[i244 - 2] = iArr148[i244 - 2] >> iArr148[i245];
                return 0;
            case 198:
                int[] iArr149 = this.MediaMetadataCompat;
                int i246 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i246 + 1;
                iArr149[i246] = 24;
                return 0;
            case 199:
                long[] jArr9 = this.RatingCompat;
                int i247 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i247 + 1;
                this.IconCompatParcelizer = jArr9[i247];
                return 0;
            case 200:
                long[] jArr10 = this.RatingCompat;
                int i248 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i248 + 1;
                jArr10[i248] = jArr10[i248 - 1];
                return 0;
            case 201:
                int[] iArr150 = this.MediaMetadataCompat;
                int i249 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i249 + 1;
                iArr150[i249] = 12;
                return 0;
            case 202:
                int i250 = this.AudioAttributesImplApi26Parcelizer;
                int i251 = i250 - 1;
                this.AudioAttributesImplApi26Parcelizer = i251;
                long[] jArr11 = this.RatingCompat;
                jArr11[i250 - 2] = jArr11[i250 - 2] >> this.MediaMetadataCompat[i251];
                return 0;
            case 203:
                Object[] objArr61 = this.MediaBrowserCompatSearchResultReceiver;
                int i252 = this.AudioAttributesImplApi26Parcelizer;
                objArr61[i252] = objArr61[12];
                this.AudioAttributesImplApi26Parcelizer = i252;
                Object obj45 = objArr61[i252];
                objArr61[i252] = null;
                objArr61[30] = obj45;
                return 0;
            case 204:
                Object[] objArr62 = this.MediaBrowserCompatSearchResultReceiver;
                int i253 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i253 + 1;
                objArr62[i253] = objArr62[30];
                return 0;
            case 205:
                int[] iArr151 = this.MediaMetadataCompat;
                int i254 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i254 + 1;
                iArr151[i254] = 3;
                return 0;
            case 206:
                Object[] objArr63 = this.MediaBrowserCompatSearchResultReceiver;
                int i255 = this.AudioAttributesImplApi26Parcelizer;
                objArr63[i255] = objArr63[12];
                Object obj46 = objArr63[i255];
                objArr63[i255] = null;
                objArr63[30] = obj46;
                this.AudioAttributesImplApi26Parcelizer = i255 + 1;
                objArr63[i255] = obj46;
                return 0;
            case 207:
                int[] iArr152 = this.MediaMetadataCompat;
                int i256 = this.AudioAttributesImplApi26Parcelizer;
                iArr152[i256] = 0;
                this.AudioAttributesImplApi26Parcelizer = i256;
                Object[] objArr64 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj47 = objArr64[i256 - 1];
                objArr64[i256 - 1] = null;
                iArr152[i256 - 1] = ((int[]) obj47)[iArr152[i256]];
                this.AudioAttributesImplApi26Parcelizer = i256 + 1;
                iArr152[i256] = iArr152[i256 - 1];
                return 0;
            case 208:
                int i257 = this.AudioAttributesImplApi26Parcelizer;
                int i258 = i257 - 1;
                int[] iArr153 = this.MediaMetadataCompat;
                iArr153[13] = iArr153[i258];
                this.AudioAttributesImplApi26Parcelizer = i257;
                iArr153[i258] = iArr153[14];
                return 0;
            case 209:
                int i259 = this.AudioAttributesImplApi26Parcelizer;
                int i260 = i259 - 2;
                this.AudioAttributesImplApi26Parcelizer = i260;
                int[] iArr154 = this.MediaMetadataCompat;
                this.read = iArr154[i260] != iArr154[i259 - 1] ? 0 : 1;
                return 0;
            case 210:
                Object[] objArr65 = this.MediaBrowserCompatSearchResultReceiver;
                int i261 = this.AudioAttributesImplApi26Parcelizer;
                objArr65[i261] = objArr65[i261 - 1];
                int[] iArr155 = this.MediaMetadataCompat;
                iArr155[i261 + 1] = 1;
                this.AudioAttributesImplApi26Parcelizer = i261 + 3;
                iArr155[i261 + 2] = 1;
                return 0;
            case 211:
                Object[] objArr66 = this.MediaBrowserCompatSearchResultReceiver;
                int i262 = this.AudioAttributesImplApi26Parcelizer;
                objArr66[i262] = objArr66[i262 - 1];
                int[] iArr156 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i262 + 2;
                iArr156[i262 + 1] = 2;
                return 0;
            case 212:
                int[] iArr157 = this.MediaMetadataCompat;
                int i263 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i263 + 1;
                iArr157[i263] = 1;
                Object[] objArr67 = this.MediaBrowserCompatSearchResultReceiver;
                objArr67[i263] = new int[iArr157[i263]];
                int i264 = i263 - 2;
                this.AudioAttributesImplApi26Parcelizer = i264;
                Object obj48 = objArr67[i264];
                objArr67[i264] = null;
                int i265 = iArr157[i263 - 1];
                Object obj49 = objArr67[i263];
                objArr67[i263] = null;
                ((Object[]) obj48)[i265] = obj49;
                return 0;
            case 213:
                int[] iArr158 = this.MediaMetadataCompat;
                int i266 = this.AudioAttributesImplApi26Parcelizer;
                iArr158[i266] = 3;
                this.AudioAttributesImplApi26Parcelizer = i266 + 2;
                iArr158[i266 + 1] = 1;
                return 0;
            case 214:
                Object[] objArr68 = this.MediaBrowserCompatSearchResultReceiver;
                int i267 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr159 = this.MediaMetadataCompat;
                objArr68[i267 - 1] = new int[iArr159[i267 - 1]];
                int i268 = i267 - 3;
                this.AudioAttributesImplApi26Parcelizer = i268;
                Object obj50 = objArr68[i268];
                objArr68[i268] = null;
                int i269 = iArr159[i267 - 2];
                Object obj51 = objArr68[i267 - 1];
                objArr68[i267 - 1] = null;
                ((Object[]) obj50)[i269] = obj51;
                this.AudioAttributesImplApi26Parcelizer = i267 - 2;
                objArr68[i268] = objArr68[i267 - 4];
                return 0;
            case 215:
                int i270 = this.AudioAttributesImplApi26Parcelizer;
                int i271 = i270 - 1;
                Object[] objArr69 = this.MediaBrowserCompatSearchResultReceiver;
                objArr69[i271] = null;
                this.AudioAttributesImplApi26Parcelizer = i270;
                objArr69[i271] = objArr69[i270 - 2];
                return 0;
            case 216:
                int i272 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i272;
                Object[] objArr70 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj52 = objArr70[i272];
                objArr70[i272] = null;
                objArr70[30] = obj52;
                return 0;
            case 217:
                Object[] objArr71 = this.MediaBrowserCompatSearchResultReceiver;
                int i273 = this.AudioAttributesImplApi26Parcelizer;
                objArr71[i273] = objArr71[30];
                int[] iArr160 = this.MediaMetadataCompat;
                iArr160[i273 + 1] = 1;
                int i274 = i273 + 1;
                this.AudioAttributesImplApi26Parcelizer = i274;
                Object obj53 = objArr71[i273];
                objArr71[i273] = null;
                objArr71[i273] = ((Object[]) obj53)[iArr160[i274]];
                return 0;
            case 218:
                Object[] objArr72 = this.MediaBrowserCompatSearchResultReceiver;
                int i275 = this.AudioAttributesImplApi26Parcelizer;
                objArr72[i275] = objArr72[21];
                int[] iArr161 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i275 + 2;
                iArr161[i275 + 1] = 2;
                return 0;
            case 219:
                int[] iArr162 = this.MediaMetadataCompat;
                int i276 = this.AudioAttributesImplApi26Parcelizer;
                iArr162[i276] = 0;
                this.AudioAttributesImplApi26Parcelizer = i276;
                Object[] objArr73 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj54 = objArr73[i276 - 1];
                objArr73[i276 - 1] = null;
                iArr162[i276 - 1] = ((int[]) obj54)[iArr162[i276]];
                this.AudioAttributesImplApi26Parcelizer = i276 + 1;
                objArr73[i276] = objArr73[21];
                return 0;
            case 220:
                int i277 = this.AudioAttributesImplApi26Parcelizer;
                int i278 = i277 - 1;
                this.AudioAttributesImplApi26Parcelizer = i278;
                int[] iArr163 = this.MediaMetadataCompat;
                Object[] objArr74 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj55 = objArr74[i277 - 2];
                objArr74[i277 - 2] = null;
                iArr163[i277 - 2] = ((int[]) obj55)[iArr163[i278]];
                this.AudioAttributesImplApi26Parcelizer = i277;
                objArr74[i278] = objArr74[21];
                return 0;
            case 221:
                int[] iArr164 = this.MediaMetadataCompat;
                int i279 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i279 + 1;
                iArr164[i279] = iArr164[22];
                return 0;
            case 222:
                int[] iArr165 = this.MediaMetadataCompat;
                int i280 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i280 + 1;
                iArr165[i280] = iArr165[23];
                return 0;
            case 223:
                int i281 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr166 = this.MediaMetadataCompat;
                iArr166[29] = iArr166[i281 - 1];
                int i282 = i281 - 2;
                this.AudioAttributesImplApi26Parcelizer = i282;
                iArr166[28] = iArr166[i282];
                return 0;
            case 224:
                int i283 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i283;
                Object[] objArr75 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj56 = objArr75[i283];
                objArr75[i283] = null;
                objArr75[27] = obj56;
                return 0;
            case 225:
                int i284 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr167 = this.MediaMetadataCompat;
                iArr167[26] = iArr167[i284 - 1];
                int i285 = i284 - 2;
                this.AudioAttributesImplApi26Parcelizer = i285;
                iArr167[25] = iArr167[i285];
                return 0;
            case 226:
                int i286 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i286;
                Object[] objArr76 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj57 = objArr76[i286];
                objArr76[i286] = null;
                objArr76[24] = obj57;
                return 0;
            case 227:
                Object[] objArr77 = this.MediaBrowserCompatSearchResultReceiver;
                int i287 = this.AudioAttributesImplApi26Parcelizer;
                objArr77[i287] = objArr77[24];
                this.AudioAttributesImplApi26Parcelizer = i287;
                objArr77[i287] = null;
                return 0;
            case 228:
                int[] iArr168 = this.MediaMetadataCompat;
                int i288 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i288 + 1;
                iArr168[i288] = iArr168[25];
                return 0;
            case 229:
                int[] iArr169 = this.MediaMetadataCompat;
                int i289 = this.AudioAttributesImplApi26Parcelizer;
                iArr169[i289 - 1] = iArr169[i289 - 2];
                Object[] objArr78 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj58 = objArr78[i289 - 1];
                objArr78[i289 - 1] = null;
                objArr78[i289 - 2] = obj58;
                this.AudioAttributesImplApi26Parcelizer = i289 + 1;
                iArr169[i289] = 0;
                return 0;
            case 230:
                int[] iArr170 = this.MediaMetadataCompat;
                int i290 = this.AudioAttributesImplApi26Parcelizer;
                int i291 = iArr170[i290 - 1];
                iArr170[i290 - 1] = iArr170[i290 - 2];
                iArr170[i290 - 2] = i291;
                int i292 = i290 - 3;
                this.AudioAttributesImplApi26Parcelizer = i292;
                Object[] objArr79 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj59 = objArr79[i292];
                objArr79[i292] = null;
                ((int[]) obj59)[iArr170[i290 - 2]] = iArr170[i290 - 1];
                return 0;
            case 231:
                Object[] objArr80 = this.MediaBrowserCompatSearchResultReceiver;
                int i293 = this.AudioAttributesImplApi26Parcelizer;
                objArr80[i293] = objArr80[24];
                int[] iArr171 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i293 + 2;
                iArr171[i293 + 1] = iArr171[26];
                return 0;
            case 232:
                Object[] objArr81 = this.MediaBrowserCompatSearchResultReceiver;
                int i294 = this.AudioAttributesImplApi26Parcelizer;
                Object obj60 = objArr81[i294 - 2];
                objArr81[i294 - 2] = null;
                objArr81[i294 - 1] = obj60;
                int[] iArr172 = this.MediaMetadataCompat;
                iArr172[i294 - 2] = iArr172[i294 - 1];
                int i295 = i294 - 3;
                this.AudioAttributesImplApi26Parcelizer = i295;
                Object obj61 = objArr81[i295];
                objArr81[i295] = null;
                int i296 = iArr172[i294 - 2];
                Object obj62 = objArr81[i294 - 1];
                objArr81[i294 - 1] = null;
                ((Object[]) obj61)[i296] = obj62;
                this.AudioAttributesImplApi26Parcelizer = i294 - 2;
                objArr81[i295] = objArr81[24];
                return 0;
            case 233:
                int[] iArr173 = this.MediaMetadataCompat;
                int i297 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i297 + 1;
                iArr173[i297] = iArr173[26];
                return 0;
            case 234:
                int i298 = this.AudioAttributesImplApi26Parcelizer;
                int i299 = i298 - 1;
                this.AudioAttributesImplApi26Parcelizer = i299;
                int[] iArr174 = this.MediaMetadataCompat;
                iArr174[i298 - 2] = iArr174[i298 - 2] << iArr174[i299];
                return 0;
            case 235:
                int i300 = this.AudioAttributesImplApi26Parcelizer;
                int i301 = i300 - 1;
                int[] iArr175 = this.MediaMetadataCompat;
                iArr175[i300 - 2] = iArr175[i300 - 2] ^ iArr175[i301];
                this.AudioAttributesImplApi26Parcelizer = i300;
                iArr175[i301] = iArr175[i300 - 2];
                return 0;
            case 236:
                int[] iArr176 = this.MediaMetadataCompat;
                int i302 = this.AudioAttributesImplApi26Parcelizer;
                iArr176[i302] = 17;
                this.AudioAttributesImplApi26Parcelizer = i302;
                iArr176[i302 - 1] = iArr176[i302 - 1] >>> iArr176[i302];
                return 0;
            case 237:
                int i303 = this.AudioAttributesImplApi26Parcelizer;
                int i304 = i303 - 1;
                this.AudioAttributesImplApi26Parcelizer = i304;
                int[] iArr177 = this.MediaMetadataCompat;
                iArr177[i303 - 2] = iArr177[i303 - 2] ^ iArr177[i304];
                return 0;
            case 238:
                int[] iArr178 = this.MediaMetadataCompat;
                int i305 = this.AudioAttributesImplApi26Parcelizer;
                iArr178[i305] = 5;
                iArr178[i305 - 1] = iArr178[i305 - 1] << iArr178[i305];
                int i306 = i305 - 1;
                this.AudioAttributesImplApi26Parcelizer = i306;
                iArr178[i305 - 2] = iArr178[i305 - 2] ^ iArr178[i306];
                return 0;
            case 239:
                int[] iArr179 = this.MediaMetadataCompat;
                int i307 = this.AudioAttributesImplApi26Parcelizer;
                iArr179[i307] = 1;
                this.AudioAttributesImplApi26Parcelizer = i307;
                Object[] objArr82 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj63 = objArr82[i307 - 1];
                objArr82[i307 - 1] = null;
                objArr82[i307 - 1] = ((Object[]) obj63)[iArr179[i307]];
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int i308 = this.AudioAttributesImplApi26Parcelizer;
                int i309 = i308 - 1;
                Object[] objArr83 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj64 = objArr83[i309];
                objArr83[i309] = null;
                objArr83[12] = obj64;
                int[] iArr180 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i308;
                iArr180[i309] = 4;
                return 0;
            case 241:
                int[] iArr181 = this.MediaMetadataCompat;
                int i310 = this.AudioAttributesImplApi26Parcelizer;
                iArr181[i310] = 2;
                this.AudioAttributesImplApi26Parcelizer = i310 + 2;
                iArr181[i310 + 1] = 1;
                this.MediaBrowserCompatSearchResultReceiver[i310 + 1] = new int[iArr181[i310 + 1]];
                return 0;
            case 242:
                Object[] objArr84 = this.MediaBrowserCompatSearchResultReceiver;
                int i311 = this.AudioAttributesImplApi26Parcelizer;
                objArr84[i311] = objArr84[i311 - 1];
                this.AudioAttributesImplApi26Parcelizer = i311 + 2;
                objArr84[i311 + 1] = objArr84[12];
                return 0;
            case 243:
                Object[] objArr85 = this.MediaBrowserCompatSearchResultReceiver;
                int i312 = this.AudioAttributesImplApi26Parcelizer;
                objArr85[i312] = objArr85[i312 - 1];
                this.AudioAttributesImplApi26Parcelizer = i312;
                Object obj65 = objArr85[i312];
                objArr85[i312] = null;
                objArr85[30] = obj65;
                return 0;
            case 244:
                Object[] objArr86 = this.MediaBrowserCompatSearchResultReceiver;
                int i313 = this.AudioAttributesImplApi26Parcelizer;
                objArr86[i313] = objArr86[30];
                int[] iArr182 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i313 + 2;
                iArr182[i313 + 1] = 1;
                return 0;
            case 245:
                int i314 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr183 = this.MediaMetadataCompat;
                iArr183[23] = iArr183[i314 - 1];
                iArr183[22] = iArr183[i314 - 2];
                int i315 = i314 - 3;
                this.AudioAttributesImplApi26Parcelizer = i315;
                Object[] objArr87 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj66 = objArr87[i315];
                objArr87[i315] = null;
                objArr87[21] = obj66;
                return 0;
            case 246:
                int i316 = this.AudioAttributesImplApi26Parcelizer;
                int i317 = i316 - 1;
                Object[] objArr88 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj67 = objArr88[i317];
                objArr88[i317] = null;
                objArr88[20] = obj67;
                this.AudioAttributesImplApi26Parcelizer = i316;
                objArr88[i317] = obj67;
                return 0;
            case 247:
                Object[] objArr89 = this.MediaBrowserCompatSearchResultReceiver;
                int i318 = this.AudioAttributesImplApi26Parcelizer;
                objArr89[i318] = objArr89[21];
                int[] iArr184 = this.MediaMetadataCompat;
                iArr184[i318 + 1] = 0;
                int i319 = i318 + 1;
                this.AudioAttributesImplApi26Parcelizer = i319;
                Object obj68 = objArr89[i318];
                objArr89[i318] = null;
                objArr89[i318] = ((Object[]) obj68)[iArr184[i319]];
                return 0;
            case 248:
                int i320 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i320;
                int[] iArr185 = this.MediaMetadataCompat;
                iArr185[28] = iArr185[i320];
                return 0;
            case 249:
                int[] iArr186 = this.MediaMetadataCompat;
                int i321 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i321 + 1;
                iArr186[i321] = iArr186[25];
                Object[] objArr90 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj69 = objArr90[i321 - 1];
                objArr90[i321 - 1] = null;
                objArr90[i321] = obj69;
                iArr186[i321 - 1] = iArr186[i321];
                return 0;
            case 250:
                int[] iArr187 = this.MediaMetadataCompat;
                int i322 = this.AudioAttributesImplApi26Parcelizer;
                iArr187[i322] = iArr187[26];
                Object[] objArr91 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj70 = objArr91[i322 - 1];
                objArr91[i322 - 1] = null;
                objArr91[i322] = obj70;
                iArr187[i322 - 1] = iArr187[i322];
                this.AudioAttributesImplApi26Parcelizer = i322 + 2;
                iArr187[i322 + 1] = 3;
                return 0;
            case 251:
                Object[] objArr92 = this.MediaBrowserCompatSearchResultReceiver;
                int i323 = this.AudioAttributesImplApi26Parcelizer;
                objArr92[i323] = objArr92[24];
                objArr92[i323 + 1] = objArr92[27];
                int[] iArr188 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i323 + 3;
                iArr188[i323 + 2] = 0;
                return 0;
            case 252:
                int i324 = this.AudioAttributesImplApi26Parcelizer;
                int i325 = i324 - 3;
                this.AudioAttributesImplApi26Parcelizer = i325;
                Object[] objArr93 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj71 = objArr93[i325];
                objArr93[i325] = null;
                int i326 = this.MediaMetadataCompat[i324 - 2];
                Object obj72 = objArr93[i324 - 1];
                objArr93[i324 - 1] = null;
                ((Object[]) obj71)[i326] = obj72;
                this.AudioAttributesImplApi26Parcelizer = i324 - 2;
                objArr93[i325] = objArr93[24];
                return 0;
            case 253:
                int i327 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr189 = this.MediaMetadataCompat;
                int i328 = iArr189[i327 - 1];
                iArr189[27] = i328;
                int i329 = i327 - 2;
                iArr189[26] = iArr189[i329];
                this.AudioAttributesImplApi26Parcelizer = i327 - 1;
                iArr189[i329] = i328;
                return 0;
            case 254:
                int[] iArr190 = this.MediaMetadataCompat;
                int i330 = this.AudioAttributesImplApi26Parcelizer;
                iArr190[i330] = 13;
                this.AudioAttributesImplApi26Parcelizer = i330;
                iArr190[i330 - 1] = iArr190[i330 - 1] << iArr190[i330];
                return 0;
            case 255:
                int[] iArr191 = this.MediaMetadataCompat;
                int i331 = this.AudioAttributesImplApi26Parcelizer;
                iArr191[i331] = iArr191[i331 - 1];
                iArr191[i331 + 1] = 17;
                int i332 = i331 + 1;
                this.AudioAttributesImplApi26Parcelizer = i332;
                iArr191[i331] = iArr191[i331] >>> iArr191[i332];
                return 0;
            case 256:
                int i333 = this.AudioAttributesImplApi26Parcelizer;
                int i334 = i333 - 1;
                int[] iArr192 = this.MediaMetadataCompat;
                iArr192[i333 - 2] = iArr192[i333 - 2] ^ iArr192[i334];
                iArr192[i334] = iArr192[i333 - 2];
                this.AudioAttributesImplApi26Parcelizer = i333 + 1;
                iArr192[i333] = 5;
                return 0;
            case 257:
                int i335 = this.AudioAttributesImplApi26Parcelizer;
                int i336 = i335 - 3;
                this.AudioAttributesImplApi26Parcelizer = i336;
                Object[] objArr94 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj73 = objArr94[i336];
                objArr94[i336] = null;
                int[] iArr193 = this.MediaMetadataCompat;
                ((int[]) obj73)[iArr193[i335 - 2]] = iArr193[i335 - 1];
                int i337 = i335 - 4;
                this.AudioAttributesImplApi26Parcelizer = i337;
                Object obj74 = objArr94[i337];
                objArr94[i337] = null;
                objArr94[12] = obj74;
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                int[] iArr194 = this.MediaMetadataCompat;
                int i338 = this.AudioAttributesImplApi26Parcelizer;
                iArr194[i338] = 1;
                this.AudioAttributesImplApi26Parcelizer = i338 + 2;
                iArr194[i338 + 1] = 1;
                return 0;
            case 259:
                Object[] objArr95 = this.MediaBrowserCompatSearchResultReceiver;
                int i339 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr195 = this.MediaMetadataCompat;
                objArr95[i339 - 1] = new int[iArr195[i339 - 1]];
                int i340 = i339 - 3;
                this.AudioAttributesImplApi26Parcelizer = i340;
                Object obj75 = objArr95[i340];
                objArr95[i340] = null;
                int i341 = iArr195[i339 - 2];
                Object obj76 = objArr95[i339 - 1];
                objArr95[i339 - 1] = null;
                ((Object[]) obj75)[i341] = obj76;
                return 0;
            case 260:
                Object[] objArr96 = this.MediaBrowserCompatSearchResultReceiver;
                int i342 = this.AudioAttributesImplApi26Parcelizer;
                objArr96[i342] = objArr96[i342 - 1];
                int[] iArr196 = this.MediaMetadataCompat;
                iArr196[i342 + 1] = 3;
                this.AudioAttributesImplApi26Parcelizer = i342 + 3;
                iArr196[i342 + 2] = 1;
                return 0;
            case 261:
                int i343 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i343;
                int[] iArr197 = this.MediaMetadataCompat;
                iArr197[23] = iArr197[i343];
                return 0;
            case 262:
                int i344 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr198 = this.MediaMetadataCompat;
                iArr198[22] = iArr198[i344 - 1];
                int i345 = i344 - 2;
                Object[] objArr97 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj77 = objArr97[i345];
                objArr97[i345] = null;
                objArr97[21] = obj77;
                int i346 = i344 - 3;
                this.AudioAttributesImplApi26Parcelizer = i346;
                Object obj78 = objArr97[i346];
                objArr97[i346] = null;
                objArr97[20] = obj78;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                int i347 = this.AudioAttributesImplApi26Parcelizer;
                int i348 = i347 - 1;
                this.AudioAttributesImplApi26Parcelizer = i348;
                int[] iArr199 = this.MediaMetadataCompat;
                Object[] objArr98 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj79 = objArr98[i347 - 2];
                objArr98[i347 - 2] = null;
                iArr199[i347 - 2] = ((int[]) obj79)[iArr199[i348]];
                objArr98[i348] = objArr98[21];
                this.AudioAttributesImplApi26Parcelizer = i347 + 1;
                iArr199[i347] = 3;
                return 0;
            case 264:
                Object[] objArr99 = this.MediaBrowserCompatSearchResultReceiver;
                int i349 = this.AudioAttributesImplApi26Parcelizer;
                objArr99[i349] = objArr99[21];
                int[] iArr200 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i349 + 2;
                iArr200[i349 + 1] = 0;
                return 0;
            case 265:
                int[] iArr201 = this.MediaMetadataCompat;
                int i350 = this.AudioAttributesImplApi26Parcelizer;
                iArr201[i350] = iArr201[22];
                this.AudioAttributesImplApi26Parcelizer = i350 + 2;
                iArr201[i350 + 1] = iArr201[23];
                return 0;
            case 266:
                int i351 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr202 = this.MediaMetadataCompat;
                iArr202[29] = iArr202[i351 - 1];
                iArr202[28] = iArr202[i351 - 2];
                int i352 = i351 - 3;
                this.AudioAttributesImplApi26Parcelizer = i352;
                Object[] objArr100 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj80 = objArr100[i352];
                objArr100[i352] = null;
                objArr100[27] = obj80;
                return 0;
            case 267:
                int i353 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr203 = this.MediaMetadataCompat;
                iArr203[25] = iArr203[i353 - 1];
                int i354 = i353 - 2;
                Object[] objArr101 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj81 = objArr101[i354];
                objArr101[i354] = null;
                objArr101[24] = obj81;
                this.AudioAttributesImplApi26Parcelizer = i353 - 1;
                objArr101[i354] = obj81;
                return 0;
            case 268:
                Object[] objArr102 = this.MediaBrowserCompatSearchResultReceiver;
                int i355 = this.AudioAttributesImplApi26Parcelizer;
                objArr102[i355] = objArr102[24];
                int[] iArr204 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i355 + 2;
                iArr204[i355 + 1] = iArr204[25];
                Object obj82 = objArr102[i355];
                objArr102[i355] = null;
                objArr102[i355 + 1] = obj82;
                iArr204[i355] = iArr204[i355 + 1];
                return 0;
            case 269:
                int[] iArr205 = this.MediaMetadataCompat;
                int i356 = this.AudioAttributesImplApi26Parcelizer;
                iArr205[i356] = 0;
                int i357 = iArr205[i356];
                iArr205[i356] = iArr205[i356 - 1];
                iArr205[i356 - 1] = i357;
                int i358 = i356 - 2;
                this.AudioAttributesImplApi26Parcelizer = i358;
                Object[] objArr103 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj83 = objArr103[i358];
                objArr103[i358] = null;
                ((int[]) obj83)[iArr205[i356 - 1]] = iArr205[i356];
                return 0;
            case 270:
                Object[] objArr104 = this.MediaBrowserCompatSearchResultReceiver;
                int i359 = this.AudioAttributesImplApi26Parcelizer;
                Object obj84 = objArr104[i359 - 2];
                objArr104[i359 - 2] = null;
                objArr104[i359 - 1] = obj84;
                int[] iArr206 = this.MediaMetadataCompat;
                iArr206[i359 - 2] = iArr206[i359 - 1];
                this.AudioAttributesImplApi26Parcelizer = i359 + 1;
                iArr206[i359] = 3;
                return 0;
            case 271:
                int[] iArr207 = this.MediaMetadataCompat;
                int i360 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i360 + 1;
                iArr207[i360] = 0;
                int i361 = iArr207[i360];
                iArr207[i360] = iArr207[i360 - 1];
                iArr207[i360 - 1] = i361;
                return 0;
            case 272:
                int[] iArr208 = this.MediaMetadataCompat;
                int i362 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i362 + 1;
                iArr208[i362] = iArr208[28];
                return 0;
            case 273:
                int[] iArr209 = this.MediaMetadataCompat;
                int i363 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i363 + 1;
                iArr209[i363] = iArr209[29];
                return 0;
            case 274:
                int[] iArr210 = this.MediaMetadataCompat;
                int i364 = this.AudioAttributesImplApi26Parcelizer;
                iArr210[i364] = iArr210[i364 - 1];
                this.AudioAttributesImplApi26Parcelizer = i364 + 2;
                iArr210[i364 + 1] = 5;
                return 0;
            case 275:
                int i365 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr211 = this.MediaMetadataCompat;
                iArr211[i365 - 2] = iArr211[i365 - 2] << iArr211[i365 - 1];
                int i366 = i365 - 2;
                this.AudioAttributesImplApi26Parcelizer = i366;
                iArr211[i365 - 3] = iArr211[i365 - 3] ^ iArr211[i366];
                return 0;
            case 276:
                Object[] objArr105 = this.MediaBrowserCompatSearchResultReceiver;
                int i367 = this.AudioAttributesImplApi26Parcelizer;
                Object obj85 = objArr105[i367 - 2];
                objArr105[i367 - 2] = null;
                objArr105[i367 - 1] = obj85;
                int[] iArr212 = this.MediaMetadataCompat;
                iArr212[i367 - 2] = iArr212[i367 - 1];
                iArr212[i367] = 1;
                this.AudioAttributesImplApi26Parcelizer = i367;
                Object obj86 = objArr105[i367 - 1];
                objArr105[i367 - 1] = null;
                objArr105[i367 - 1] = ((Object[]) obj86)[iArr212[i367]];
                return 0;
            case 277:
                int i368 = this.AudioAttributesImplApi26Parcelizer;
                int i369 = i368 - 1;
                Object[] objArr106 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj87 = objArr106[i369];
                objArr106[i369] = null;
                objArr106[15] = obj87;
                objArr106[i369] = objArr106[12];
                int i370 = i368 - 1;
                this.AudioAttributesImplApi26Parcelizer = i370;
                Object obj88 = objArr106[i370];
                objArr106[i370] = null;
                objArr106[30] = obj88;
                return 0;
            case 278:
                Object[] objArr107 = this.MediaBrowserCompatSearchResultReceiver;
                int i371 = this.AudioAttributesImplApi26Parcelizer;
                objArr107[i371] = objArr107[30];
                int[] iArr213 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i371 + 2;
                iArr213[i371 + 1] = 0;
                return 0;
            case 279:
                Object[] objArr108 = this.MediaBrowserCompatSearchResultReceiver;
                int i372 = this.AudioAttributesImplApi26Parcelizer;
                objArr108[i372] = objArr108[i372 - 1];
                this.AudioAttributesImplApi26Parcelizer = i372;
                Object obj89 = objArr108[i372];
                objArr108[i372] = null;
                objArr108[17] = obj89;
                return 0;
            case 280:
                int i373 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i373;
                int[] iArr214 = this.MediaMetadataCompat;
                iArr214[16] = iArr214[i373];
                return 0;
            case 281:
                int[] iArr215 = this.MediaMetadataCompat;
                int i374 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i374 + 1;
                iArr215[i374] = iArr215[16];
                return 0;
            case 282:
                Object[] objArr109 = this.MediaBrowserCompatSearchResultReceiver;
                int i375 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i375 + 1;
                objArr109[i375] = objArr109[17];
                return 0;
            case 283:
                int[] iArr216 = this.MediaMetadataCompat;
                int i376 = this.AudioAttributesImplApi26Parcelizer;
                Object[] objArr110 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj90 = objArr110[i376 - 1];
                objArr110[i376 - 1] = null;
                iArr216[i376 - 1] = ((Object[]) obj90).length;
                return 0;
            case 284:
                int i377 = this.AudioAttributesImplApi26Parcelizer;
                int i378 = i377 - 2;
                this.AudioAttributesImplApi26Parcelizer = i378;
                int[] iArr217 = this.MediaMetadataCompat;
                this.read = iArr217[i378] >= iArr217[i377 - 1] ? 0 : 1;
                return 0;
            case 285:
                Object[] objArr111 = this.MediaBrowserCompatSearchResultReceiver;
                int i379 = this.AudioAttributesImplApi26Parcelizer;
                objArr111[i379] = objArr111[15];
                this.AudioAttributesImplApi26Parcelizer = i379 + 2;
                objArr111[i379 + 1] = objArr111[17];
                return 0;
            case 286:
                int i380 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i380;
                this.MediaBrowserCompatSearchResultReceiver[i380] = null;
                int[] iArr218 = this.MediaMetadataCompat;
                iArr218[16] = iArr218[16] + 1;
                return 0;
            case 287:
                long[] jArr12 = this.RatingCompat;
                int i381 = this.AudioAttributesImplApi26Parcelizer;
                jArr12[i381] = 0;
                this.AudioAttributesImplApi26Parcelizer = i381;
                this.MediaMetadataCompat[i381 - 1] = (jArr12[i381 - 1] > jArr12[i381] ? 1 : (jArr12[i381 - 1] == jArr12[i381] ? 0 : -1));
                return 0;
            case 288:
                int i382 = this.AudioAttributesImplApi26Parcelizer;
                int i383 = i382 - 1;
                this.AudioAttributesImplApi26Parcelizer = i383;
                int[] iArr219 = this.MediaMetadataCompat;
                iArr219[i382 - 2] = iArr219[i382 - 2] - iArr219[i383];
                return 0;
            case 289:
                long[] jArr13 = this.RatingCompat;
                int i384 = this.AudioAttributesImplApi26Parcelizer;
                jArr13[i384] = 0;
                int[] iArr220 = this.MediaMetadataCompat;
                iArr220[i384 - 1] = (jArr13[i384 - 1] > jArr13[i384] ? 1 : (jArr13[i384 - 1] == jArr13[i384] ? 0 : -1));
                int i385 = i384 - 1;
                this.AudioAttributesImplApi26Parcelizer = i385;
                iArr220[i384 - 2] = iArr220[i384 - 2] + iArr220[i385];
                return 0;
            case 290:
                Object[] objArr112 = this.MediaBrowserCompatSearchResultReceiver;
                int i386 = this.AudioAttributesImplApi26Parcelizer;
                objArr112[i386] = objArr112[i386 - 1];
                this.AudioAttributesImplApi26Parcelizer = i386;
                Object obj91 = objArr112[i386];
                objArr112[i386] = null;
                objArr112[16] = obj91;
                return 0;
            case 291:
                Object[] objArr113 = this.MediaBrowserCompatSearchResultReceiver;
                int i387 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i387 + 1;
                objArr113[i387] = objArr113[16];
                return 0;
            case 292:
                int i388 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i388;
                Object[] objArr114 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj92 = objArr114[i388];
                objArr114[i388] = null;
                objArr114[16] = obj92;
                return 0;
            case 293:
                this.RatingCompat[this.AudioAttributesImplApi26Parcelizer - 1] = this.MediaMetadataCompat[r2 - 1];
                return 0;
            case 294:
                int i389 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr14 = this.RatingCompat;
                jArr14[i389 - 2] = jArr14[i389 - 2] & jArr14[i389 - 1];
                int i390 = i389 - 2;
                this.AudioAttributesImplApi26Parcelizer = i390;
                jArr14[i389 - 3] = jArr14[i390] ^ jArr14[i389 - 3];
                return 0;
            case 295:
                Object[] objArr115 = this.MediaBrowserCompatSearchResultReceiver;
                int i391 = this.AudioAttributesImplApi26Parcelizer;
                Object obj93 = objArr115[i391 - 1];
                objArr115[i391 - 1] = null;
                Object obj94 = objArr115[i391 - 2];
                objArr115[i391 - 2] = null;
                objArr115[i391 - 1] = obj94;
                objArr115[i391 - 2] = obj93;
                int i392 = i391 - 1;
                this.AudioAttributesImplApi26Parcelizer = i392;
                objArr115[i392] = null;
                return 0;
            case 296:
                Object[] objArr116 = this.MediaBrowserCompatSearchResultReceiver;
                int i393 = this.AudioAttributesImplApi26Parcelizer;
                Object obj95 = objArr116[i393 - 1];
                objArr116[i393 - 1] = null;
                objArr116[i393] = obj95;
                long[] jArr15 = this.RatingCompat;
                jArr15[i393 - 1] = jArr15[i393 - 2];
                objArr116[i393 - 2] = obj95;
                this.AudioAttributesImplApi26Parcelizer = i393;
                objArr116[i393] = null;
                return 0;
            case 297:
                Object[] objArr117 = this.MediaBrowserCompatSearchResultReceiver;
                int i394 = this.AudioAttributesImplApi26Parcelizer;
                Object obj96 = objArr117[i394 - 1];
                objArr117[i394 - 1] = null;
                Object obj97 = objArr117[i394 - 2];
                objArr117[i394 - 2] = null;
                objArr117[i394 - 1] = obj97;
                objArr117[i394 - 2] = obj96;
                return 0;
            case 298:
                Object[] objArr118 = this.MediaBrowserCompatSearchResultReceiver;
                int i395 = this.AudioAttributesImplApi26Parcelizer;
                Object obj98 = objArr118[i395 - 1];
                objArr118[i395 - 1] = null;
                objArr118[i395] = obj98;
                Object obj99 = objArr118[i395 - 2];
                objArr118[i395 - 2] = null;
                objArr118[i395 - 1] = obj99;
                objArr118[i395 - 2] = obj98;
                Object obj100 = objArr118[i395];
                objArr118[i395] = null;
                Object obj101 = objArr118[i395 - 1];
                objArr118[i395 - 1] = null;
                objArr118[i395] = obj101;
                objArr118[i395 - 1] = obj100;
                int[] iArr221 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i395 + 2;
                iArr221[i395 + 1] = 2;
                return 0;
            case 299:
                Object[] objArr119 = this.MediaBrowserCompatSearchResultReceiver;
                int i396 = this.AudioAttributesImplApi26Parcelizer;
                Object obj102 = objArr119[i396 - 2];
                objArr119[i396 - 2] = null;
                objArr119[i396 - 1] = obj102;
                int[] iArr222 = this.MediaMetadataCompat;
                iArr222[i396 - 2] = iArr222[i396 - 1];
                int i397 = i396 - 3;
                this.AudioAttributesImplApi26Parcelizer = i397;
                Object obj103 = objArr119[i397];
                objArr119[i397] = null;
                int i398 = iArr222[i396 - 2];
                Object obj104 = objArr119[i396 - 1];
                objArr119[i396 - 1] = null;
                ((Object[]) obj103)[i398] = obj104;
                this.AudioAttributesImplApi26Parcelizer = i396 - 2;
                Object obj105 = objArr119[i396 - 4];
                objArr119[i396 - 4] = null;
                objArr119[i397] = obj105;
                long[] jArr16 = this.RatingCompat;
                jArr16[i396 - 4] = jArr16[i396 - 5];
                objArr119[i396 - 5] = obj105;
                return 0;
            case 300:
                Object[] objArr120 = this.MediaBrowserCompatSearchResultReceiver;
                int i399 = this.AudioAttributesImplApi26Parcelizer;
                Object obj106 = objArr120[i399 - 1];
                objArr120[i399 - 1] = null;
                Object obj107 = objArr120[i399 - 2];
                objArr120[i399 - 2] = null;
                objArr120[i399 - 1] = obj107;
                objArr120[i399 - 2] = obj106;
                this.AudioAttributesImplApi26Parcelizer = i399 + 1;
                Object obj108 = objArr120[i399 - 1];
                objArr120[i399 - 1] = null;
                objArr120[i399] = obj108;
                Object obj109 = objArr120[i399 - 2];
                objArr120[i399 - 2] = null;
                objArr120[i399 - 1] = obj109;
                objArr120[i399 - 2] = obj108;
                return 0;
            case 301:
                Object[] objArr121 = this.MediaBrowserCompatSearchResultReceiver;
                int i400 = this.AudioAttributesImplApi26Parcelizer;
                Object obj110 = objArr121[i400 - 1];
                objArr121[i400 - 1] = null;
                Object obj111 = objArr121[i400 - 2];
                objArr121[i400 - 2] = null;
                objArr121[i400 - 1] = obj111;
                objArr121[i400 - 2] = obj110;
                int[] iArr223 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i400 + 1;
                iArr223[i400] = 1;
                Object obj112 = objArr121[i400 - 1];
                objArr121[i400 - 1] = null;
                objArr121[i400] = obj112;
                iArr223[i400 - 1] = iArr223[i400];
                return 0;
            case 302:
                int i401 = this.AudioAttributesImplApi26Parcelizer;
                int i402 = i401 - 3;
                this.AudioAttributesImplApi26Parcelizer = i402;
                Object[] objArr122 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj113 = objArr122[i402];
                objArr122[i402] = null;
                int i403 = this.MediaMetadataCompat[i401 - 2];
                Object obj114 = objArr122[i401 - 1];
                objArr122[i401 - 1] = null;
                ((Object[]) obj113)[i403] = obj114;
                this.AudioAttributesImplApi26Parcelizer = i401 - 2;
                Object obj115 = objArr122[i401 - 4];
                objArr122[i401 - 4] = null;
                objArr122[i402] = obj115;
                Object obj116 = objArr122[i401 - 5];
                objArr122[i401 - 5] = null;
                objArr122[i401 - 4] = obj116;
                objArr122[i401 - 5] = obj115;
                Object obj117 = objArr122[i401 - 3];
                objArr122[i401 - 3] = null;
                Object obj118 = objArr122[i401 - 4];
                objArr122[i401 - 4] = null;
                objArr122[i401 - 3] = obj118;
                objArr122[i401 - 4] = obj117;
                return 0;
            case 303:
                int[] iArr224 = this.MediaMetadataCompat;
                int i404 = this.AudioAttributesImplApi26Parcelizer;
                iArr224[i404] = 0;
                Object[] objArr123 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj119 = objArr123[i404 - 1];
                objArr123[i404 - 1] = null;
                objArr123[i404] = obj119;
                iArr224[i404 - 1] = iArr224[i404];
                int i405 = i404 - 2;
                this.AudioAttributesImplApi26Parcelizer = i405;
                Object obj120 = objArr123[i405];
                objArr123[i405] = null;
                int i406 = iArr224[i404 - 1];
                Object obj121 = objArr123[i404];
                objArr123[i404] = null;
                ((Object[]) obj120)[i406] = obj121;
                return 0;
            case 304:
                int i407 = this.AudioAttributesImplApi26Parcelizer;
                int i408 = i407 - 3;
                this.AudioAttributesImplApi26Parcelizer = i408;
                Object[] objArr124 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj122 = objArr124[i408];
                objArr124[i408] = null;
                int[] iArr225 = this.MediaMetadataCompat;
                int i409 = iArr225[i407 - 2];
                Object obj123 = objArr124[i407 - 1];
                objArr124[i407 - 1] = null;
                ((Object[]) obj122)[i409] = obj123;
                objArr124[i408] = objArr124[i407 - 4];
                this.AudioAttributesImplApi26Parcelizer = i407 - 1;
                iArr225[i407 - 2] = 1;
                return 0;
            case 305:
                Object[] objArr125 = this.MediaBrowserCompatSearchResultReceiver;
                int i410 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i410 + 1;
                objArr125[i410] = null;
                Object obj124 = objArr125[i410];
                objArr125[i410] = null;
                Object obj125 = objArr125[i410 - 1];
                objArr125[i410 - 1] = null;
                objArr125[i410] = obj125;
                objArr125[i410 - 1] = obj124;
                return 0;
            case 306:
                int i411 = this.AudioAttributesImplApi26Parcelizer;
                int i412 = i411 - 3;
                this.AudioAttributesImplApi26Parcelizer = i412;
                Object[] objArr126 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj126 = objArr126[i412];
                objArr126[i412] = null;
                int[] iArr226 = this.MediaMetadataCompat;
                int i413 = iArr226[i411 - 2];
                Object obj127 = objArr126[i411 - 1];
                objArr126[i411 - 1] = null;
                ((Object[]) obj126)[i413] = obj127;
                objArr126[i412] = objArr126[i411 - 4];
                this.AudioAttributesImplApi26Parcelizer = i411 - 1;
                iArr226[i411 - 2] = 2;
                return 0;
            case 307:
                int[] iArr227 = this.MediaMetadataCompat;
                int i414 = this.AudioAttributesImplApi26Parcelizer;
                iArr227[i414] = 3;
                this.AudioAttributesImplApi26Parcelizer = i414 + 2;
                iArr227[i414 + 1] = 1;
                this.MediaBrowserCompatSearchResultReceiver[i414 + 1] = new int[iArr227[i414 + 1]];
                return 0;
            case 308:
                Object[] objArr127 = this.MediaBrowserCompatSearchResultReceiver;
                int i415 = this.AudioAttributesImplApi26Parcelizer;
                objArr127[i415] = objArr127[i415 - 1];
                objArr127[i415 + 1] = objArr127[12];
                this.AudioAttributesImplApi26Parcelizer = i415 + 3;
                objArr127[i415 + 2] = objArr127[i415 + 1];
                return 0;
            case 309:
                int i416 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i416;
                int[] iArr228 = this.MediaMetadataCompat;
                iArr228[22] = iArr228[i416];
                return 0;
            case 310:
                int i417 = this.AudioAttributesImplApi26Parcelizer;
                int i418 = i417 - 1;
                Object[] objArr128 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj128 = objArr128[i418];
                objArr128[i418] = null;
                objArr128[20] = obj128;
                objArr128[i418] = obj128;
                this.AudioAttributesImplApi26Parcelizer = i417 + 1;
                objArr128[i417] = objArr128[21];
                return 0;
            case 311:
                int[] iArr229 = this.MediaMetadataCompat;
                int i419 = this.AudioAttributesImplApi26Parcelizer;
                iArr229[i419] = iArr229[23];
                iArr229[29] = iArr229[i419];
                int i420 = i419 - 1;
                this.AudioAttributesImplApi26Parcelizer = i420;
                iArr229[28] = iArr229[i420];
                return 0;
            case 312:
                int i421 = this.AudioAttributesImplApi26Parcelizer;
                int i422 = i421 - 1;
                Object[] objArr129 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj129 = objArr129[i422];
                objArr129[i422] = null;
                objArr129[27] = obj129;
                int i423 = i421 - 2;
                this.AudioAttributesImplApi26Parcelizer = i423;
                int[] iArr230 = this.MediaMetadataCompat;
                iArr230[26] = iArr230[i423];
                return 0;
            case 313:
                int i424 = this.AudioAttributesImplApi26Parcelizer;
                int i425 = i424 - 1;
                Object[] objArr130 = this.MediaBrowserCompatSearchResultReceiver;
                objArr130[i425] = null;
                this.AudioAttributesImplApi26Parcelizer = i424;
                objArr130[i425] = objArr130[24];
                return 0;
            case 314:
                int[] iArr231 = this.MediaMetadataCompat;
                int i426 = this.AudioAttributesImplApi26Parcelizer;
                int i427 = iArr231[i426 - 1];
                iArr231[i426 - 1] = iArr231[i426 - 2];
                iArr231[i426 - 2] = i427;
                int i428 = i426 - 3;
                this.AudioAttributesImplApi26Parcelizer = i428;
                Object[] objArr131 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj130 = objArr131[i428];
                objArr131[i428] = null;
                ((int[]) obj130)[iArr231[i426 - 2]] = iArr231[i426 - 1];
                this.AudioAttributesImplApi26Parcelizer = i426 - 2;
                objArr131[i428] = objArr131[24];
                return 0;
            case 315:
                int[] iArr232 = this.MediaMetadataCompat;
                int i429 = this.AudioAttributesImplApi26Parcelizer;
                iArr232[i429] = iArr232[27];
                this.AudioAttributesImplApi26Parcelizer = i429 + 2;
                iArr232[i429 + 1] = iArr232[26];
                return 0;
            case 316:
                int[] iArr233 = this.MediaMetadataCompat;
                int i430 = this.AudioAttributesImplApi26Parcelizer;
                iArr233[i430] = iArr233[i430 - 1];
                iArr233[i430 + 1] = 13;
                int i431 = i430 + 1;
                this.AudioAttributesImplApi26Parcelizer = i431;
                iArr233[i430] = iArr233[i430] << iArr233[i431];
                return 0;
            case 317:
                int i432 = this.AudioAttributesImplApi26Parcelizer;
                int i433 = i432 - 1;
                this.AudioAttributesImplApi26Parcelizer = i433;
                int[] iArr234 = this.MediaMetadataCompat;
                iArr234[i432 - 2] = iArr234[i432 - 2] >>> iArr234[i433];
                return 0;
            case 318:
                int[] iArr235 = this.MediaMetadataCompat;
                int i434 = this.AudioAttributesImplApi26Parcelizer;
                iArr235[i434] = 5;
                this.AudioAttributesImplApi26Parcelizer = i434;
                iArr235[i434 - 1] = iArr235[i434 - 1] << iArr235[i434];
                return 0;
            case 319:
                int i435 = this.AudioAttributesImplApi26Parcelizer;
                int i436 = i435 - 1;
                this.AudioAttributesImplApi26Parcelizer = i436;
                int[] iArr236 = this.MediaMetadataCompat;
                iArr236[i435 - 2] = iArr236[i436] ^ iArr236[i435 - 2];
                this.RatingCompat[i435 - 2] = iArr236[i435 - 2];
                return 0;
            case 320:
                int i437 = this.AudioAttributesImplApi26Parcelizer;
                int i438 = i437 - 1;
                this.AudioAttributesImplApi26Parcelizer = i438;
                long[] jArr17 = this.RatingCompat;
                jArr17[i437 - 2] = jArr17[i438] & jArr17[i437 - 2];
                return 0;
            case 321:
                int i439 = this.AudioAttributesImplApi26Parcelizer;
                int i440 = i439 - 1;
                this.AudioAttributesImplApi26Parcelizer = i440;
                long[] jArr18 = this.RatingCompat;
                jArr18[i439 - 2] = jArr18[i440] | jArr18[i439 - 2];
                return 0;
            case 322:
                int i441 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i441;
                long[] jArr19 = this.RatingCompat;
                jArr19[18] = jArr19[i441];
                return 0;
            case 323:
                long[] jArr20 = this.RatingCompat;
                int i442 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i442 + 1;
                jArr20[i442] = jArr20[18];
                return 0;
            case 324:
                int[] iArr237 = this.MediaMetadataCompat;
                int i443 = this.AudioAttributesImplApi26Parcelizer;
                iArr237[i443] = 0;
                this.AudioAttributesImplApi26Parcelizer = i443;
                iArr237[23] = iArr237[i443];
                return 0;
            case 325:
                Object[] objArr132 = this.MediaBrowserCompatSearchResultReceiver;
                int i444 = this.AudioAttributesImplApi26Parcelizer;
                objArr132[i444] = objArr132[20];
                this.AudioAttributesImplApi26Parcelizer = i444 + 2;
                objArr132[i444 + 1] = objArr132[21];
                return 0;
            case 326:
                int i445 = this.AudioAttributesImplApi26Parcelizer;
                int i446 = i445 - 1;
                this.AudioAttributesImplApi26Parcelizer = i446;
                int[] iArr238 = this.MediaMetadataCompat;
                Object[] objArr133 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj131 = objArr133[i445 - 2];
                objArr133[i445 - 2] = null;
                iArr238[i445 - 2] = ((int[]) obj131)[iArr238[i446]];
                objArr133[i446] = objArr133[21];
                this.AudioAttributesImplApi26Parcelizer = i445 + 1;
                iArr238[i445] = 0;
                return 0;
            case 327:
                int i447 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i447;
                int[] iArr239 = this.MediaMetadataCompat;
                iArr239[29] = iArr239[i447];
                return 0;
            case 328:
                int i448 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr240 = this.MediaMetadataCompat;
                iArr240[25] = iArr240[i448 - 1];
                int i449 = i448 - 2;
                this.AudioAttributesImplApi26Parcelizer = i449;
                Object[] objArr134 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj132 = objArr134[i449];
                objArr134[i449] = null;
                objArr134[24] = obj132;
                return 0;
            case 329:
                Object[] objArr135 = this.MediaBrowserCompatSearchResultReceiver;
                int i450 = this.AudioAttributesImplApi26Parcelizer;
                objArr135[i450] = objArr135[24];
                objArr135[i450] = null;
                this.AudioAttributesImplApi26Parcelizer = i450 + 1;
                objArr135[i450] = objArr135[24];
                return 0;
            case 330:
                int[] iArr241 = this.MediaMetadataCompat;
                int i451 = this.AudioAttributesImplApi26Parcelizer;
                iArr241[i451] = iArr241[26];
                iArr241[i451 - 1] = iArr241[i451 - 1] + iArr241[i451];
                int i452 = i451 - 1;
                this.AudioAttributesImplApi26Parcelizer = i452;
                iArr241[i451 - 2] = iArr241[i451 - 2] + iArr241[i452];
                return 0;
            case 331:
                int[] iArr242 = this.MediaMetadataCompat;
                int i453 = this.AudioAttributesImplApi26Parcelizer;
                iArr242[i453] = 13;
                iArr242[i453 - 1] = iArr242[i453 - 1] << iArr242[i453];
                int i454 = i453 - 1;
                this.AudioAttributesImplApi26Parcelizer = i454;
                iArr242[i453 - 2] = iArr242[i453 - 2] ^ iArr242[i454];
                return 0;
            case 332:
                int i455 = this.AudioAttributesImplApi26Parcelizer;
                int i456 = i455 - 1;
                this.AudioAttributesImplApi26Parcelizer = i456;
                int[] iArr243 = this.MediaMetadataCompat;
                iArr243[i455 - 2] = iArr243[i456] ^ iArr243[i455 - 2];
                Object[] objArr136 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj133 = objArr136[i455 - 3];
                objArr136[i455 - 3] = null;
                objArr136[i455 - 2] = obj133;
                iArr243[i455 - 3] = iArr243[i455 - 2];
                return 0;
            case 333:
                Object[] objArr137 = this.MediaBrowserCompatSearchResultReceiver;
                int i457 = this.AudioAttributesImplApi26Parcelizer;
                objArr137[i457] = null;
                int[] iArr244 = this.MediaMetadataCompat;
                iArr244[i457 + 1] = iArr244[13];
                this.AudioAttributesImplApi26Parcelizer = i457 + 3;
                iArr244[i457 + 2] = iArr244[i457 + 1];
                return 0;
            case 334:
                int[] iArr245 = this.MediaMetadataCompat;
                int i458 = this.AudioAttributesImplApi26Parcelizer;
                iArr245[i458] = iArr245[13];
                iArr245[i458 + 1] = 1;
                int i459 = i458 + 1;
                this.AudioAttributesImplApi26Parcelizer = i459;
                iArr245[i458] = iArr245[i458] - iArr245[i459];
                return 0;
            case 335:
                int i460 = this.AudioAttributesImplApi26Parcelizer;
                int i461 = i460 - 1;
                this.AudioAttributesImplApi26Parcelizer = i461;
                int[] iArr246 = this.MediaMetadataCompat;
                iArr246[i460 - 2] = iArr246[i460 - 2] * iArr246[i461];
                return 0;
            case 336:
                int[] iArr247 = this.MediaMetadataCompat;
                int i462 = this.AudioAttributesImplApi26Parcelizer;
                iArr247[i462] = 2;
                this.AudioAttributesImplApi26Parcelizer = i462;
                iArr247[i462 - 1] = iArr247[i462 - 1] % iArr247[i462];
                int i463 = i462 - 1;
                this.AudioAttributesImplApi26Parcelizer = i463;
                iArr247[i462 - 2] = iArr247[i462 - 2] / iArr247[i463];
                return 0;
            case 337:
                int i464 = this.AudioAttributesImplApi26Parcelizer;
                int i465 = i464 - 1;
                Object[] objArr138 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj134 = objArr138[i465];
                objArr138[i465] = null;
                objArr138[30] = obj134;
                objArr138[i465] = obj134;
                int[] iArr248 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i464 + 1;
                iArr248[i464] = 1;
                return 0;
            case 338:
                int i466 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr249 = this.MediaMetadataCompat;
                iArr249[28] = iArr249[i466 - 1];
                int i467 = i466 - 2;
                this.AudioAttributesImplApi26Parcelizer = i467;
                Object[] objArr139 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj135 = objArr139[i467];
                objArr139[i467] = null;
                objArr139[27] = obj135;
                return 0;
            case 339:
                int[] iArr250 = this.MediaMetadataCompat;
                int i468 = this.AudioAttributesImplApi26Parcelizer;
                iArr250[i468] = iArr250[i468 - 1];
                this.AudioAttributesImplApi26Parcelizer = i468 + 2;
                iArr250[i468 + 1] = 13;
                return 0;
            case 340:
                int i469 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr251 = this.MediaMetadataCompat;
                iArr251[i469 - 2] = iArr251[i469 - 2] >>> iArr251[i469 - 1];
                int i470 = i469 - 2;
                this.AudioAttributesImplApi26Parcelizer = i470;
                iArr251[i469 - 3] = iArr251[i469 - 3] ^ iArr251[i470];
                return 0;
            case 341:
                int[] iArr252 = this.MediaMetadataCompat;
                int i471 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i471 + 1;
                iArr252[i471] = 5;
                return 0;
            case 342:
                Object[] objArr140 = this.MediaBrowserCompatSearchResultReceiver;
                int i472 = this.AudioAttributesImplApi26Parcelizer;
                Object obj136 = objArr140[i472 - 2];
                objArr140[i472 - 2] = null;
                objArr140[i472 - 1] = obj136;
                int[] iArr253 = this.MediaMetadataCompat;
                iArr253[i472 - 2] = iArr253[i472 - 1];
                this.AudioAttributesImplApi26Parcelizer = i472 + 1;
                iArr253[i472] = 1;
                return 0;
            case 343:
                int[] iArr254 = this.MediaMetadataCompat;
                int i473 = this.AudioAttributesImplApi26Parcelizer;
                iArr254[i473] = 95;
                this.AudioAttributesImplApi26Parcelizer = i473;
                iArr254[i473 - 1] = iArr254[i473 - 1] + iArr254[i473];
                return 0;
            case 344:
                int[] iArr255 = this.MediaMetadataCompat;
                int i474 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i474 + 1;
                iArr255[i474] = 109;
                return 0;
            case 345:
                int i475 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr256 = this.MediaMetadataCompat;
                iArr256[i475 - 2] = iArr256[i475 - 2] - iArr256[i475 - 1];
                int i476 = i475 - 2;
                this.AudioAttributesImplApi26Parcelizer = i476;
                this.MediaBrowserCompatSearchResultReceiver[i476] = null;
                return 0;
            case 346:
                int[] iArr257 = this.MediaMetadataCompat;
                int i477 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i477 + 1;
                iArr257[i477] = 73;
                return 0;
            case 347:
                int[] iArr258 = this.MediaMetadataCompat;
                int i478 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i478 + 1;
                iArr258[i478] = 47;
                return 0;
            case 348:
                int i479 = this.AudioAttributesImplApi26Parcelizer;
                int i480 = i479 - 1;
                Object[] objArr141 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj137 = objArr141[i480];
                objArr141[i480] = null;
                objArr141[125] = obj137;
                int[] iArr259 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i479;
                iArr259[i480] = 17;
                return 0;
            case 349:
                int i481 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i481;
                Object[] objArr142 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj138 = objArr142[i481];
                objArr142[i481] = null;
                objArr142[126] = obj138;
                return 0;
            case 350:
                int i482 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i482;
                Object[] objArr143 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj139 = objArr143[i482];
                objArr143[i482] = null;
                objArr143[127] = obj139;
                return 0;
            case 351:
                Object[] objArr144 = this.MediaBrowserCompatSearchResultReceiver;
                int i483 = this.AudioAttributesImplApi26Parcelizer;
                objArr144[i483] = null;
                this.AudioAttributesImplApi26Parcelizer = i483 + 2;
                objArr144[i483 + 1] = null;
                return 0;
            case 352:
                int[] iArr260 = this.MediaMetadataCompat;
                int i484 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i484 + 1;
                iArr260[i484] = -115;
                return 0;
            case 353:
                int i485 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i485;
                Object[] objArr145 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj140 = objArr145[i485];
                objArr145[i485] = null;
                objArr145[128] = obj140;
                return 0;
            case 354:
                int[] iArr261 = this.MediaMetadataCompat;
                int i486 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i486 + 1;
                iArr261[i486] = -10;
                return 0;
            case 355:
                int i487 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i487;
                Object[] objArr146 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj141 = objArr146[i487];
                objArr146[i487] = null;
                objArr146[129] = obj141;
                return 0;
            case 356:
                int[] iArr262 = this.MediaMetadataCompat;
                int i488 = this.AudioAttributesImplApi26Parcelizer;
                iArr262[i488] = 1;
                long[] jArr21 = this.RatingCompat;
                this.AudioAttributesImplApi26Parcelizer = i488 + 2;
                jArr21[i488 + 1] = 0;
                return 0;
            case 357:
                int i489 = this.AudioAttributesImplApi26Parcelizer;
                int i490 = i489 - 1;
                Object[] objArr147 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj142 = objArr147[i490];
                objArr147[i490] = null;
                objArr147[130] = obj142;
                this.AudioAttributesImplApi26Parcelizer = i489;
                objArr147[i490] = objArr147[11];
                return 0;
            case 358:
                int[] iArr263 = this.MediaMetadataCompat;
                int i491 = this.AudioAttributesImplApi26Parcelizer;
                iArr263[i491] = -3;
                this.AudioAttributesImplApi26Parcelizer = i491;
                iArr263[i491 - 1] = iArr263[i491] & iArr263[i491 - 1];
                return 0;
            case 359:
                int[] iArr264 = this.MediaMetadataCompat;
                int i492 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i492 + 1;
                iArr264[i492] = -30;
                return 0;
            case 360:
                Object[] objArr148 = this.MediaBrowserCompatSearchResultReceiver;
                int i493 = this.AudioAttributesImplApi26Parcelizer;
                objArr148[i493] = null;
                int[] iArr265 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i493 + 2;
                iArr265[i493 + 1] = 0;
                return 0;
            case 361:
                int[] iArr266 = this.MediaMetadataCompat;
                int i494 = this.AudioAttributesImplApi26Parcelizer;
                iArr266[i494] = iArr266[i494 - 1];
                this.AudioAttributesImplApi26Parcelizer = i494;
                iArr266[13] = iArr266[i494];
                return 0;
            case 362:
                int i495 = this.AudioAttributesImplApi26Parcelizer;
                int i496 = i495 - 2;
                this.AudioAttributesImplApi26Parcelizer = i496;
                int[] iArr267 = this.MediaMetadataCompat;
                this.read = iArr267[i496] < iArr267[i495 - 1] ? 0 : 1;
                return 0;
            case 363:
                int i497 = this.AudioAttributesImplApi26Parcelizer;
                int i498 = i497 - 2;
                this.AudioAttributesImplApi26Parcelizer = i498;
                int[] iArr268 = this.MediaMetadataCompat;
                this.read = iArr268[i498] <= iArr268[i497 - 1] ? 0 : 1;
                return 0;
            case 364:
                Object[] objArr149 = this.MediaBrowserCompatSearchResultReceiver;
                int i499 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i499 + 1;
                objArr149[i499] = objArr149[125];
                return 0;
            case 365:
                Object[] objArr150 = this.MediaBrowserCompatSearchResultReceiver;
                int i500 = this.AudioAttributesImplApi26Parcelizer;
                objArr150[i500] = objArr150[126];
                int[] iArr269 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i500 + 2;
                iArr269[i500 + 1] = 0;
                return 0;
            case 366:
                Object[] objArr151 = this.MediaBrowserCompatSearchResultReceiver;
                int i501 = this.AudioAttributesImplApi26Parcelizer;
                objArr151[i501] = objArr151[i501 - 1];
                this.AudioAttributesImplApi26Parcelizer = i501;
                Object obj143 = objArr151[i501];
                objArr151[i501] = null;
                objArr151[13] = obj143;
                return 0;
            case 367:
                int i502 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i502;
                Object[] objArr152 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj144 = objArr152[i502];
                objArr152[i502] = null;
                objArr152[13] = obj144;
                return 0;
            case 368:
                Object[] objArr153 = this.MediaBrowserCompatSearchResultReceiver;
                int i503 = this.AudioAttributesImplApi26Parcelizer;
                objArr153[i503] = null;
                this.AudioAttributesImplApi26Parcelizer = i503;
                Object obj145 = objArr153[i503];
                objArr153[i503] = null;
                objArr153[13] = obj145;
                return 0;
            case 369:
                int[] iArr270 = this.MediaMetadataCompat;
                int i504 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i504 + 1;
                iArr270[i504] = -3;
                return 0;
            case 370:
                int i505 = this.AudioAttributesImplApi26Parcelizer;
                int i506 = i505 - 1;
                this.AudioAttributesImplApi26Parcelizer = i506;
                int[] iArr271 = this.MediaMetadataCompat;
                iArr271[i505 - 2] = iArr271[i505 - 2] & iArr271[i506];
                return 0;
            case 371:
                int[] iArr272 = this.MediaMetadataCompat;
                int i507 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i507 + 1;
                iArr272[i507] = -36;
                return 0;
            case 372:
                int[] iArr273 = this.MediaMetadataCompat;
                int i508 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i508 + 1;
                iArr273[i508] = -109;
                return 0;
            case 373:
                int[] iArr274 = this.MediaMetadataCompat;
                int i509 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i509 + 1;
                iArr274[i509] = 67;
                return 0;
            case 374:
                int[] iArr275 = this.MediaMetadataCompat;
                int i510 = this.AudioAttributesImplApi26Parcelizer;
                iArr275[i510] = 16;
                iArr275[i510 - 1] = iArr275[i510 - 1] >> iArr275[i510];
                int i511 = i510 - 1;
                this.AudioAttributesImplApi26Parcelizer = i511;
                iArr275[i510 - 2] = iArr275[i510 - 2] + iArr275[i511];
                return 0;
            case 375:
                int[] iArr276 = this.MediaMetadataCompat;
                int i512 = this.AudioAttributesImplApi26Parcelizer;
                iArr276[i512] = -29;
                this.AudioAttributesImplApi26Parcelizer = i512;
                iArr276[i512 - 1] = iArr276[i512 - 1] + iArr276[i512];
                return 0;
            case 376:
                int[] iArr277 = this.MediaMetadataCompat;
                int i513 = this.AudioAttributesImplApi26Parcelizer;
                iArr277[i513] = 0;
                this.AudioAttributesImplApi26Parcelizer = i513;
                iArr277[i513 - 1] = iArr277[i513 - 1] + iArr277[i513];
                return 0;
            case 377:
                int i514 = this.AudioAttributesImplApi26Parcelizer;
                int i515 = i514 - 1;
                long[] jArr22 = this.RatingCompat;
                jArr22[18] = jArr22[i515];
                Object[] objArr154 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i514;
                objArr154[i515] = objArr154[127];
                return 0;
            case 378:
                Object[] objArr155 = this.MediaBrowserCompatSearchResultReceiver;
                int i516 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i516 + 1;
                objArr155[i516] = objArr155[128];
                return 0;
            case 379:
                int[] iArr278 = this.MediaMetadataCompat;
                int i517 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i517 + 1;
                iArr278[i517] = 52;
                return 0;
            case 380:
                int i518 = this.AudioAttributesImplApi26Parcelizer;
                int i519 = i518 - 1;
                long[] jArr23 = this.RatingCompat;
                long j = jArr23[i518 - 2];
                int[] iArr279 = this.MediaMetadataCompat;
                jArr23[i518 - 2] = j << iArr279[i519];
                iArr279[i519] = 52;
                int i520 = i518 - 1;
                this.AudioAttributesImplApi26Parcelizer = i520;
                jArr23[i518 - 2] = jArr23[i518 - 2] >>> iArr279[i520];
                return 0;
            case 381:
                int i521 = this.AudioAttributesImplApi26Parcelizer;
                int i522 = i521 - 1;
                this.AudioAttributesImplApi26Parcelizer = i522;
                long[] jArr24 = this.RatingCompat;
                jArr24[i521 - 2] = jArr24[i521 - 2] - jArr24[i522];
                return 0;
            case 382:
                int i523 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr25 = this.RatingCompat;
                jArr25[i523 - 2] = jArr25[i523 - 2] >> this.MediaMetadataCompat[i523 - 1];
                int i524 = i523 - 2;
                this.AudioAttributesImplApi26Parcelizer = i524;
                jArr25[20] = jArr25[i524];
                return 0;
            case 383:
                long[] jArr26 = this.RatingCompat;
                int i525 = this.AudioAttributesImplApi26Parcelizer;
                jArr26[i525] = jArr26[18];
                jArr26[i525 + 1] = jArr26[20];
                int i526 = i525 + 1;
                this.AudioAttributesImplApi26Parcelizer = i526;
                this.MediaMetadataCompat[i525] = (jArr26[i525] > jArr26[i526] ? 1 : (jArr26[i525] == jArr26[i526] ? 0 : -1));
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                Object[] objArr156 = this.MediaBrowserCompatSearchResultReceiver;
                int i527 = this.AudioAttributesImplApi26Parcelizer;
                objArr156[i527] = objArr156[i527 - 1];
                int[] iArr280 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i527 + 2;
                iArr280[i527 + 1] = 3;
                return 0;
            case 385:
                int[] iArr281 = this.MediaMetadataCompat;
                int i528 = this.AudioAttributesImplApi26Parcelizer;
                iArr281[i528] = 0;
                iArr281[117] = iArr281[i528];
                int i529 = i528 - 1;
                this.AudioAttributesImplApi26Parcelizer = i529;
                iArr281[116] = iArr281[i529];
                return 0;
            case 386:
                int i530 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i530;
                Object[] objArr157 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj146 = objArr157[i530];
                objArr157[i530] = null;
                objArr157[115] = obj146;
                return 0;
            case 387:
                int i531 = this.AudioAttributesImplApi26Parcelizer;
                int i532 = i531 - 1;
                Object[] objArr158 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj147 = objArr158[i532];
                objArr158[i532] = null;
                objArr158[114] = obj147;
                objArr158[i532] = obj147;
                this.AudioAttributesImplApi26Parcelizer = i531 + 1;
                objArr158[i531] = objArr158[115];
                return 0;
            case 388:
                int[] iArr282 = this.MediaMetadataCompat;
                int i533 = this.AudioAttributesImplApi26Parcelizer;
                iArr282[i533] = 0;
                this.AudioAttributesImplApi26Parcelizer = i533;
                Object[] objArr159 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj148 = objArr159[i533 - 1];
                objArr159[i533 - 1] = null;
                iArr282[i533 - 1] = ((int[]) obj148)[iArr282[i533]];
                this.AudioAttributesImplApi26Parcelizer = i533 + 1;
                objArr159[i533] = objArr159[115];
                return 0;
            case 389:
                int[] iArr283 = this.MediaMetadataCompat;
                int i534 = this.AudioAttributesImplApi26Parcelizer;
                iArr283[i534] = iArr283[116];
                this.AudioAttributesImplApi26Parcelizer = i534 + 2;
                iArr283[i534 + 1] = iArr283[117];
                return 0;
            case 390:
                Object[] objArr160 = this.MediaBrowserCompatSearchResultReceiver;
                int i535 = this.AudioAttributesImplApi26Parcelizer;
                objArr160[i535] = objArr160[115];
                int[] iArr284 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i535 + 2;
                iArr284[i535 + 1] = 2;
                return 0;
            case 391:
                int i536 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i536;
                Object[] objArr161 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj149 = objArr161[i536];
                objArr161[i536] = null;
                objArr161[123] = obj149;
                return 0;
            case 392:
                int i537 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr285 = this.MediaMetadataCompat;
                iArr285[122] = iArr285[i537 - 1];
                iArr285[121] = iArr285[i537 - 2];
                int i538 = i537 - 3;
                this.AudioAttributesImplApi26Parcelizer = i538;
                iArr285[120] = iArr285[i538];
                return 0;
            case 393:
                int i539 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i539;
                int[] iArr286 = this.MediaMetadataCompat;
                iArr286[119] = iArr286[i539];
                return 0;
            case 394:
                int i540 = this.AudioAttributesImplApi26Parcelizer;
                int i541 = i540 - 1;
                Object[] objArr162 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj150 = objArr162[i541];
                objArr162[i541] = null;
                objArr162[118] = obj150;
                this.AudioAttributesImplApi26Parcelizer = i540;
                objArr162[i541] = obj150;
                return 0;
            case 395:
                Object[] objArr163 = this.MediaBrowserCompatSearchResultReceiver;
                int i542 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i542 + 1;
                objArr163[i542] = objArr163[118];
                return 0;
            case 396:
                int[] iArr287 = this.MediaMetadataCompat;
                int i543 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i543 + 1;
                iArr287[i543] = iArr287[119];
                return 0;
            case 397:
                int[] iArr288 = this.MediaMetadataCompat;
                int i544 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i544 + 1;
                iArr288[i544] = iArr288[120];
                return 0;
            case 398:
                int i545 = this.AudioAttributesImplApi26Parcelizer;
                int i546 = i545 - 3;
                this.AudioAttributesImplApi26Parcelizer = i546;
                Object[] objArr164 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj151 = objArr164[i546];
                objArr164[i546] = null;
                int[] iArr289 = this.MediaMetadataCompat;
                ((int[]) obj151)[iArr289[i545 - 2]] = iArr289[i545 - 1];
                objArr164[i546] = objArr164[118];
                this.AudioAttributesImplApi26Parcelizer = i545 - 1;
                iArr289[i545 - 2] = iArr289[121];
                return 0;
            case 399:
                int[] iArr290 = this.MediaMetadataCompat;
                int i547 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i547 + 1;
                iArr290[i547] = iArr290[122];
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                int i548 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i548;
                int[] iArr291 = this.MediaMetadataCompat;
                iArr291[121] = iArr291[i548];
                return 0;
            case 401:
                int i549 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i549;
                int[] iArr292 = this.MediaMetadataCompat;
                iArr292[120] = iArr292[i549];
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                int[] iArr293 = this.MediaMetadataCompat;
                int i550 = this.AudioAttributesImplApi26Parcelizer;
                iArr293[i550] = iArr293[121];
                this.AudioAttributesImplApi26Parcelizer = i550 + 2;
                iArr293[i550 + 1] = iArr293[120];
                return 0;
            case 403:
                int i551 = this.AudioAttributesImplApi26Parcelizer;
                int i552 = i551 - 1;
                int[] iArr294 = this.MediaMetadataCompat;
                iArr294[i551 - 2] = iArr294[i551 - 2] ^ iArr294[i552];
                Object[] objArr165 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj152 = objArr165[i551 - 3];
                objArr165[i551 - 3] = null;
                objArr165[i551 - 2] = obj152;
                iArr294[i551 - 3] = iArr294[i551 - 2];
                this.AudioAttributesImplApi26Parcelizer = i551;
                iArr294[i552] = 0;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                Object[] objArr166 = this.MediaBrowserCompatSearchResultReceiver;
                int i553 = this.AudioAttributesImplApi26Parcelizer;
                objArr166[i553] = objArr166[118];
                objArr166[i553 + 1] = objArr166[123];
                int[] iArr295 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i553 + 3;
                iArr295[i553 + 2] = 2;
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                Object[] objArr167 = this.MediaBrowserCompatSearchResultReceiver;
                int i554 = this.AudioAttributesImplApi26Parcelizer;
                Object obj153 = objArr167[i554 - 2];
                objArr167[i554 - 2] = null;
                objArr167[i554 - 1] = obj153;
                int[] iArr296 = this.MediaMetadataCompat;
                iArr296[i554 - 2] = iArr296[i554 - 1];
                int i555 = i554 - 3;
                this.AudioAttributesImplApi26Parcelizer = i555;
                Object obj154 = objArr167[i555];
                objArr167[i555] = null;
                int i556 = iArr296[i554 - 2];
                Object obj155 = objArr167[i554 - 1];
                objArr167[i554 - 1] = null;
                ((Object[]) obj154)[i556] = obj155;
                int i557 = i554 - 4;
                this.AudioAttributesImplApi26Parcelizer = i557;
                Object obj156 = objArr167[i557];
                objArr167[i557] = null;
                objArr167[13] = obj156;
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                Object[] objArr168 = this.MediaBrowserCompatSearchResultReceiver;
                int i558 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i558 + 1;
                objArr168[i558] = objArr168[126];
                return 0;
            case 407:
                Object[] objArr169 = this.MediaBrowserCompatSearchResultReceiver;
                int i559 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i559 + 1;
                objArr169[i559] = objArr169[129];
                return 0;
            case 408:
                Object[] objArr170 = this.MediaBrowserCompatSearchResultReceiver;
                int i560 = this.AudioAttributesImplApi26Parcelizer;
                objArr170[i560] = objArr170[130];
                int[] iArr297 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i560 + 2;
                iArr297[i560 + 1] = 1;
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                Object[] objArr171 = this.MediaBrowserCompatSearchResultReceiver;
                int i561 = this.AudioAttributesImplApi26Parcelizer;
                objArr171[i561] = objArr171[15];
                int i562 = i561 - 2;
                this.AudioAttributesImplApi26Parcelizer = i562;
                Object obj157 = objArr171[i562];
                objArr171[i562] = null;
                int i563 = this.MediaMetadataCompat[i561 - 1];
                Object obj158 = objArr171[i561];
                objArr171[i561] = null;
                ((Object[]) obj157)[i563] = obj158;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                Object[] objArr172 = this.MediaBrowserCompatSearchResultReceiver;
                int i564 = this.AudioAttributesImplApi26Parcelizer;
                objArr172[i564] = objArr172[13];
                objArr172[i564 + 1] = null;
                int[] iArr298 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i564 + 3;
                iArr298[i564 + 2] = iArr298[14];
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                Object[] objArr173 = this.MediaBrowserCompatSearchResultReceiver;
                int i565 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i565 + 1;
                Object obj159 = objArr173[i565 - 1];
                objArr173[i565 - 1] = null;
                objArr173[i565] = obj159;
                int[] iArr299 = this.MediaMetadataCompat;
                iArr299[i565 - 1] = iArr299[i565 - 2];
                objArr173[i565 - 2] = obj159;
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int[] iArr300 = this.MediaMetadataCompat;
                int i566 = this.AudioAttributesImplApi26Parcelizer;
                iArr300[i566] = 4;
                Object[] objArr174 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj160 = objArr174[i566 - 1];
                objArr174[i566 - 1] = null;
                objArr174[i566] = obj160;
                iArr300[i566 - 1] = iArr300[i566];
                int i567 = i566 - 2;
                this.AudioAttributesImplApi26Parcelizer = i567;
                Object obj161 = objArr174[i567];
                objArr174[i567] = null;
                int i568 = iArr300[i566 - 1];
                Object obj162 = objArr174[i566];
                objArr174[i566] = null;
                ((Object[]) obj161)[i568] = obj162;
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                Object[] objArr175 = this.MediaBrowserCompatSearchResultReceiver;
                int i569 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i569 + 1;
                Object obj163 = objArr175[i569 - 1];
                objArr175[i569 - 1] = null;
                objArr175[i569] = obj163;
                int[] iArr301 = this.MediaMetadataCompat;
                iArr301[i569 - 1] = iArr301[i569 - 2];
                objArr175[i569 - 2] = obj163;
                iArr301[i569] = iArr301[i569 - 1];
                Object obj164 = objArr175[i569];
                objArr175[i569] = null;
                objArr175[i569 - 1] = obj164;
                return 0;
            case 414:
                int i570 = this.AudioAttributesImplApi26Parcelizer;
                int i571 = i570 - 3;
                this.AudioAttributesImplApi26Parcelizer = i571;
                Object[] objArr176 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj165 = objArr176[i571];
                objArr176[i571] = null;
                int[] iArr302 = this.MediaMetadataCompat;
                int i572 = iArr302[i570 - 2];
                Object obj166 = objArr176[i570 - 1];
                objArr176[i570 - 1] = null;
                ((Object[]) obj165)[i572] = obj166;
                this.AudioAttributesImplApi26Parcelizer = i570 - 2;
                Object obj167 = objArr176[i570 - 4];
                objArr176[i570 - 4] = null;
                objArr176[i571] = obj167;
                iArr302[i570 - 4] = iArr302[i570 - 5];
                objArr176[i570 - 5] = obj167;
                return 0;
            case 415:
                int[] iArr303 = this.MediaMetadataCompat;
                int i573 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i573 + 1;
                iArr303[i573] = 2;
                Object[] objArr177 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj168 = objArr177[i573 - 1];
                objArr177[i573 - 1] = null;
                objArr177[i573] = obj168;
                iArr303[i573 - 1] = iArr303[i573];
                return 0;
            case 416:
                int i574 = this.AudioAttributesImplApi26Parcelizer;
                int i575 = i574 - 3;
                this.AudioAttributesImplApi26Parcelizer = i575;
                Object[] objArr178 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj169 = objArr178[i575];
                objArr178[i575] = null;
                int i576 = this.MediaMetadataCompat[i574 - 2];
                Object obj170 = objArr178[i574 - 1];
                objArr178[i574 - 1] = null;
                ((Object[]) obj169)[i576] = obj170;
                this.AudioAttributesImplApi26Parcelizer = i574 - 2;
                Object obj171 = objArr178[i574 - 4];
                objArr178[i574 - 4] = null;
                objArr178[i575] = obj171;
                Object obj172 = objArr178[i574 - 5];
                objArr178[i574 - 5] = null;
                objArr178[i574 - 4] = obj172;
                objArr178[i574 - 5] = obj171;
                return 0;
            case 417:
                int i577 = this.AudioAttributesImplApi26Parcelizer;
                int i578 = i577 - 3;
                this.AudioAttributesImplApi26Parcelizer = i578;
                Object[] objArr179 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj173 = objArr179[i578];
                objArr179[i578] = null;
                int[] iArr304 = this.MediaMetadataCompat;
                int i579 = iArr304[i577 - 2];
                Object obj174 = objArr179[i577 - 1];
                objArr179[i577 - 1] = null;
                ((Object[]) obj173)[i579] = obj174;
                objArr179[i578] = objArr179[i577 - 4];
                this.AudioAttributesImplApi26Parcelizer = i577 - 1;
                iArr304[i577 - 2] = 4;
                return 0;
            case 418:
                Object[] objArr180 = this.MediaBrowserCompatSearchResultReceiver;
                int i580 = this.AudioAttributesImplApi26Parcelizer;
                Object obj175 = objArr180[i580 - 1];
                objArr180[i580 - 1] = null;
                Object obj176 = objArr180[i580 - 2];
                objArr180[i580 - 2] = null;
                objArr180[i580 - 1] = obj176;
                objArr180[i580 - 2] = obj175;
                this.AudioAttributesImplApi26Parcelizer = i580 + 1;
                objArr180[i580] = null;
                return 0;
            case 419:
                Object[] objArr181 = this.MediaBrowserCompatSearchResultReceiver;
                int i581 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i581 + 1;
                objArr181[i581] = objArr181[127];
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                int[] iArr305 = this.MediaMetadataCompat;
                int i582 = this.AudioAttributesImplApi26Parcelizer;
                iArr305[i582] = 12;
                this.AudioAttributesImplApi26Parcelizer = i582;
                long[] jArr27 = this.RatingCompat;
                jArr27[i582 - 1] = jArr27[i582 - 1] >> iArr305[i582];
                return 0;
            case 421:
                int i583 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i583;
                Object[] objArr182 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj177 = objArr182[i583];
                objArr182[i583] = null;
                objArr182[124] = obj177;
                return 0;
            case 422:
                Object[] objArr183 = this.MediaBrowserCompatSearchResultReceiver;
                int i584 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i584 + 1;
                objArr183[i584] = objArr183[124];
                return 0;
            case 423:
                int[] iArr306 = this.MediaMetadataCompat;
                int i585 = this.AudioAttributesImplApi26Parcelizer;
                iArr306[i585] = 0;
                this.AudioAttributesImplApi26Parcelizer = i585;
                Object[] objArr184 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj178 = objArr184[i585 - 1];
                objArr184[i585 - 1] = null;
                iArr306[i585 - 1] = ((int[]) obj178)[iArr306[i585]];
                int i586 = i585 - 1;
                this.AudioAttributesImplApi26Parcelizer = i586;
                iArr306[16] = iArr306[i586];
                return 0;
            case 424:
                int i587 = this.AudioAttributesImplApi26Parcelizer;
                int i588 = i587 - 1;
                Object[] objArr185 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj179 = objArr185[i588];
                objArr185[i588] = null;
                objArr185[124] = obj179;
                objArr185[i588] = obj179;
                int[] iArr307 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i587 + 1;
                iArr307[i587] = 1;
                return 0;
            case 425:
                int[] iArr308 = this.MediaMetadataCompat;
                int i589 = this.AudioAttributesImplApi26Parcelizer;
                iArr308[i589] = iArr308[i589 - 1];
                iArr308[14] = iArr308[i589];
                this.AudioAttributesImplApi26Parcelizer = i589 + 1;
                iArr308[i589] = iArr308[16];
                return 0;
            case 426:
                int[] iArr309 = this.MediaMetadataCompat;
                int i590 = this.AudioAttributesImplApi26Parcelizer;
                iArr309[i590] = 0;
                this.AudioAttributesImplApi26Parcelizer = i590 + 2;
                iArr309[i590 + 1] = 1;
                this.MediaBrowserCompatSearchResultReceiver[i590 + 1] = new int[iArr309[i590 + 1]];
                return 0;
            case 427:
                Object[] objArr186 = this.MediaBrowserCompatSearchResultReceiver;
                int i591 = this.AudioAttributesImplApi26Parcelizer;
                objArr186[i591] = objArr186[i591 - 1];
                objArr186[i591 + 1] = objArr186[13];
                this.AudioAttributesImplApi26Parcelizer = i591 + 3;
                objArr186[i591 + 2] = objArr186[i591 + 1];
                return 0;
            case 428:
                Object[] objArr187 = this.MediaBrowserCompatSearchResultReceiver;
                int i592 = this.AudioAttributesImplApi26Parcelizer;
                objArr187[i592] = objArr187[124];
                int[] iArr310 = this.MediaMetadataCompat;
                iArr310[i592 + 1] = 0;
                int i593 = i592 + 1;
                this.AudioAttributesImplApi26Parcelizer = i593;
                Object obj180 = objArr187[i592];
                objArr187[i592] = null;
                objArr187[i592] = ((Object[]) obj180)[iArr310[i593]];
                return 0;
            case 429:
                int[] iArr311 = this.MediaMetadataCompat;
                int i594 = this.AudioAttributesImplApi26Parcelizer;
                iArr311[i594] = 0;
                this.AudioAttributesImplApi26Parcelizer = i594;
                Object[] objArr188 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj181 = objArr188[i594 - 1];
                objArr188[i594 - 1] = null;
                iArr311[i594 - 1] = ((int[]) obj181)[iArr311[i594]];
                this.AudioAttributesImplApi26Parcelizer = i594 + 1;
                iArr311[i594] = 0;
                return 0;
            case 430:
                int i595 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr312 = this.MediaMetadataCompat;
                iArr312[117] = iArr312[i595 - 1];
                iArr312[116] = iArr312[i595 - 2];
                int i596 = i595 - 3;
                this.AudioAttributesImplApi26Parcelizer = i596;
                Object[] objArr189 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj182 = objArr189[i596];
                objArr189[i596] = null;
                objArr189[115] = obj182;
                return 0;
            case 431:
                int i597 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i597;
                Object[] objArr190 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj183 = objArr190[i597];
                objArr190[i597] = null;
                objArr190[114] = obj183;
                return 0;
            case 432:
                Object[] objArr191 = this.MediaBrowserCompatSearchResultReceiver;
                int i598 = this.AudioAttributesImplApi26Parcelizer;
                objArr191[i598] = objArr191[114];
                this.AudioAttributesImplApi26Parcelizer = i598 + 2;
                objArr191[i598 + 1] = objArr191[115];
                return 0;
            case 433:
                int[] iArr313 = this.MediaMetadataCompat;
                int i599 = this.AudioAttributesImplApi26Parcelizer;
                iArr313[i599] = 0;
                this.AudioAttributesImplApi26Parcelizer = i599;
                Object[] objArr192 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj184 = objArr192[i599 - 1];
                objArr192[i599 - 1] = null;
                iArr313[i599 - 1] = ((int[]) obj184)[iArr313[i599]];
                this.AudioAttributesImplApi26Parcelizer = i599 + 1;
                iArr313[i599] = iArr313[116];
                return 0;
            case 434:
                int[] iArr314 = this.MediaMetadataCompat;
                int i600 = this.AudioAttributesImplApi26Parcelizer;
                iArr314[i600] = iArr314[117];
                Object[] objArr193 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i600 + 2;
                objArr193[i600 + 1] = objArr193[115];
                return 0;
            case 435:
                int i601 = this.AudioAttributesImplApi26Parcelizer;
                int i602 = i601 - 1;
                Object[] objArr194 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj185 = objArr194[i602];
                objArr194[i602] = null;
                objArr194[123] = obj185;
                int i603 = i601 - 2;
                this.AudioAttributesImplApi26Parcelizer = i603;
                int[] iArr315 = this.MediaMetadataCompat;
                iArr315[122] = iArr315[i603];
                return 0;
            case 436:
                int i604 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr316 = this.MediaMetadataCompat;
                iArr316[121] = iArr316[i604 - 1];
                int i605 = i604 - 2;
                this.AudioAttributesImplApi26Parcelizer = i605;
                iArr316[120] = iArr316[i605];
                return 0;
            case 437:
                int i606 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr317 = this.MediaMetadataCompat;
                iArr317[119] = iArr317[i606 - 1];
                int i607 = i606 - 2;
                Object[] objArr195 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj186 = objArr195[i607];
                objArr195[i607] = null;
                objArr195[118] = obj186;
                this.AudioAttributesImplApi26Parcelizer = i606 - 1;
                objArr195[i607] = obj186;
                return 0;
            case 438:
                int i608 = this.AudioAttributesImplApi26Parcelizer;
                int i609 = i608 - 3;
                this.AudioAttributesImplApi26Parcelizer = i609;
                Object[] objArr196 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj187 = objArr196[i609];
                objArr196[i609] = null;
                int[] iArr318 = this.MediaMetadataCompat;
                ((int[]) obj187)[iArr318[i608 - 2]] = iArr318[i608 - 1];
                objArr196[i609] = objArr196[118];
                this.AudioAttributesImplApi26Parcelizer = i608 - 1;
                iArr318[i608 - 2] = iArr318[120];
                return 0;
            case 439:
                Object[] objArr197 = this.MediaBrowserCompatSearchResultReceiver;
                int i610 = this.AudioAttributesImplApi26Parcelizer;
                Object obj188 = objArr197[i610 - 2];
                objArr197[i610 - 2] = null;
                objArr197[i610 - 1] = obj188;
                int[] iArr319 = this.MediaMetadataCompat;
                iArr319[i610 - 2] = iArr319[i610 - 1];
                iArr319[i610] = 3;
                this.AudioAttributesImplApi26Parcelizer = i610;
                Object obj189 = objArr197[i610 - 1];
                objArr197[i610 - 1] = null;
                objArr197[i610 - 1] = ((Object[]) obj189)[iArr319[i610]];
                return 0;
            case 440:
                Object[] objArr198 = this.MediaBrowserCompatSearchResultReceiver;
                int i611 = this.AudioAttributesImplApi26Parcelizer;
                objArr198[i611] = objArr198[118];
                int[] iArr320 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i611 + 2;
                iArr320[i611 + 1] = iArr320[121];
                return 0;
            case 441:
                int[] iArr321 = this.MediaMetadataCompat;
                int i612 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i612 + 1;
                iArr321[i612] = iArr321[121];
                return 0;
            case 442:
                int i613 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr322 = this.MediaMetadataCompat;
                iArr322[i613 - 2] = iArr322[i613 - 2] + iArr322[i613 - 1];
                int i614 = i613 - 2;
                this.AudioAttributesImplApi26Parcelizer = i614;
                iArr322[i613 - 3] = iArr322[i613 - 3] + iArr322[i614];
                return 0;
            case 443:
                int[] iArr323 = this.MediaMetadataCompat;
                int i615 = this.AudioAttributesImplApi26Parcelizer;
                int i616 = iArr323[i615 - 1];
                iArr323[i615 - 1] = iArr323[i615 - 2];
                iArr323[i615 - 2] = i616;
                int i617 = i615 - 3;
                this.AudioAttributesImplApi26Parcelizer = i617;
                Object[] objArr199 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj190 = objArr199[i617];
                objArr199[i617] = null;
                ((int[]) obj190)[iArr323[i615 - 2]] = iArr323[i615 - 1];
                this.AudioAttributesImplApi26Parcelizer = i615 - 2;
                objArr199[i617] = objArr199[118];
                return 0;
            case 444:
                Object[] objArr200 = this.MediaBrowserCompatSearchResultReceiver;
                int i618 = this.AudioAttributesImplApi26Parcelizer;
                objArr200[i618] = objArr200[123];
                int[] iArr324 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i618 + 2;
                iArr324[i618 + 1] = 2;
                return 0;
            case 445:
                int i619 = this.AudioAttributesImplApi26Parcelizer;
                int i620 = i619 - 1;
                Object[] objArr201 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj191 = objArr201[i620];
                objArr201[i620] = null;
                objArr201[13] = obj191;
                int[] iArr325 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i619;
                iArr325[i620] = 4;
                return 0;
            case 446:
                Object[] objArr202 = this.MediaBrowserCompatSearchResultReceiver;
                int i621 = this.AudioAttributesImplApi26Parcelizer;
                objArr202[i621] = objArr202[i621 - 1];
                Object obj192 = objArr202[i621];
                objArr202[i621] = null;
                objArr202[124] = obj192;
                this.AudioAttributesImplApi26Parcelizer = i621 + 1;
                objArr202[i621] = obj192;
                return 0;
            case 447:
                int i622 = this.AudioAttributesImplApi26Parcelizer;
                int i623 = i622 - 1;
                this.AudioAttributesImplApi26Parcelizer = i623;
                int[] iArr326 = this.MediaMetadataCompat;
                Object[] objArr203 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj193 = objArr203[i622 - 2];
                objArr203[i622 - 2] = null;
                iArr326[i622 - 2] = ((int[]) obj193)[iArr326[i623]];
                this.AudioAttributesImplApi26Parcelizer = i622;
                iArr326[i623] = 0;
                return 0;
            case 448:
                int i624 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i624;
                int[] iArr327 = this.MediaMetadataCompat;
                iArr327[117] = iArr327[i624];
                return 0;
            case 449:
                int i625 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr328 = this.MediaMetadataCompat;
                iArr328[116] = iArr328[i625 - 1];
                int i626 = i625 - 2;
                this.AudioAttributesImplApi26Parcelizer = i626;
                Object[] objArr204 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj194 = objArr204[i626];
                objArr204[i626] = null;
                objArr204[115] = obj194;
                return 0;
            case 450:
                int[] iArr329 = this.MediaMetadataCompat;
                int i627 = this.AudioAttributesImplApi26Parcelizer;
                iArr329[i627] = iArr329[117];
                Object[] objArr205 = this.MediaBrowserCompatSearchResultReceiver;
                objArr205[i627 + 1] = objArr205[115];
                this.AudioAttributesImplApi26Parcelizer = i627 + 3;
                iArr329[i627 + 2] = 2;
                return 0;
            case 451:
                int i628 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr330 = this.MediaMetadataCompat;
                iArr330[120] = iArr330[i628 - 1];
                int i629 = i628 - 2;
                this.AudioAttributesImplApi26Parcelizer = i629;
                iArr330[119] = iArr330[i629];
                return 0;
            case 452:
                int i630 = this.AudioAttributesImplApi26Parcelizer;
                int i631 = i630 - 1;
                Object[] objArr206 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj195 = objArr206[i631];
                objArr206[i631] = null;
                objArr206[118] = obj195;
                objArr206[i631] = obj195;
                int i632 = i630 - 1;
                this.AudioAttributesImplApi26Parcelizer = i632;
                objArr206[i632] = null;
                return 0;
            case 453:
                Object[] objArr207 = this.MediaBrowserCompatSearchResultReceiver;
                int i633 = this.AudioAttributesImplApi26Parcelizer;
                objArr207[i633] = objArr207[118];
                int[] iArr331 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i633 + 2;
                iArr331[i633 + 1] = iArr331[119];
                Object obj196 = objArr207[i633];
                objArr207[i633] = null;
                objArr207[i633 + 1] = obj196;
                iArr331[i633] = iArr331[i633 + 1];
                return 0;
            case 454:
                int[] iArr332 = this.MediaMetadataCompat;
                int i634 = this.AudioAttributesImplApi26Parcelizer;
                iArr332[i634] = iArr332[121];
                this.AudioAttributesImplApi26Parcelizer = i634 + 2;
                iArr332[i634 + 1] = iArr332[122];
                return 0;
            case 455:
                int[] iArr333 = this.MediaMetadataCompat;
                int i635 = this.AudioAttributesImplApi26Parcelizer;
                iArr333[i635] = iArr333[i635 - 1];
                this.AudioAttributesImplApi26Parcelizer = i635 + 2;
                iArr333[i635 + 1] = 17;
                return 0;
            case 456:
                Object[] objArr208 = this.MediaBrowserCompatSearchResultReceiver;
                int i636 = this.AudioAttributesImplApi26Parcelizer;
                Object obj197 = objArr208[i636 - 2];
                objArr208[i636 - 2] = null;
                objArr208[i636 - 1] = obj197;
                int[] iArr334 = this.MediaMetadataCompat;
                iArr334[i636 - 2] = iArr334[i636 - 1];
                this.AudioAttributesImplApi26Parcelizer = i636 + 1;
                iArr334[i636] = 0;
                return 0;
            case 457:
                int[] iArr335 = this.MediaMetadataCompat;
                int i637 = this.AudioAttributesImplApi26Parcelizer;
                iArr335[i637] = 1;
                this.AudioAttributesImplApi26Parcelizer = i637 + 2;
                iArr335[i637 + 1] = 1;
                this.MediaBrowserCompatSearchResultReceiver[i637 + 1] = new int[iArr335[i637 + 1]];
                return 0;
            case 458:
                Object[] objArr209 = this.MediaBrowserCompatSearchResultReceiver;
                int i638 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i638 + 1;
                objArr209[i638] = objArr209[114];
                return 0;
            case 459:
                Object[] objArr210 = this.MediaBrowserCompatSearchResultReceiver;
                int i639 = this.AudioAttributesImplApi26Parcelizer;
                objArr210[i639] = objArr210[115];
                int[] iArr336 = this.MediaMetadataCompat;
                iArr336[i639 + 1] = 1;
                int i640 = i639 + 1;
                this.AudioAttributesImplApi26Parcelizer = i640;
                Object obj198 = objArr210[i639];
                objArr210[i639] = null;
                objArr210[i639] = ((Object[]) obj198)[iArr336[i640]];
                return 0;
            case 460:
                int[] iArr337 = this.MediaMetadataCompat;
                int i641 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i641 + 1;
                iArr337[i641] = iArr337[116];
                return 0;
            case 461:
                int i642 = this.AudioAttributesImplApi26Parcelizer;
                int i643 = i642 - 1;
                Object[] objArr211 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj199 = objArr211[i643];
                objArr211[i643] = null;
                objArr211[123] = obj199;
                int[] iArr338 = this.MediaMetadataCompat;
                iArr338[122] = iArr338[i642 - 2];
                int i644 = i642 - 3;
                this.AudioAttributesImplApi26Parcelizer = i644;
                iArr338[121] = iArr338[i644];
                return 0;
            case 462:
                int i645 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i645;
                Object[] objArr212 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj200 = objArr212[i645];
                objArr212[i645] = null;
                objArr212[118] = obj200;
                return 0;
            case 463:
                Object[] objArr213 = this.MediaBrowserCompatSearchResultReceiver;
                int i646 = this.AudioAttributesImplApi26Parcelizer;
                objArr213[i646] = objArr213[118];
                objArr213[i646] = null;
                this.AudioAttributesImplApi26Parcelizer = i646 + 1;
                objArr213[i646] = objArr213[118];
                return 0;
            case 464:
                int[] iArr339 = this.MediaMetadataCompat;
                int i647 = this.AudioAttributesImplApi26Parcelizer;
                iArr339[i647] = iArr339[119];
                Object[] objArr214 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj201 = objArr214[i647 - 1];
                objArr214[i647 - 1] = null;
                objArr214[i647] = obj201;
                iArr339[i647 - 1] = iArr339[i647];
                this.AudioAttributesImplApi26Parcelizer = i647 + 2;
                iArr339[i647 + 1] = 1;
                return 0;
            case 465:
                int[] iArr340 = this.MediaMetadataCompat;
                int i648 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i648 + 1;
                iArr340[i648] = iArr340[120];
                Object[] objArr215 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj202 = objArr215[i648 - 1];
                objArr215[i648 - 1] = null;
                objArr215[i648] = obj202;
                iArr340[i648 - 1] = iArr340[i648];
                return 0;
            case 466:
                int[] iArr341 = this.MediaMetadataCompat;
                int i649 = this.AudioAttributesImplApi26Parcelizer;
                iArr341[i649] = iArr341[120];
                iArr341[i649 - 1] = iArr341[i649 - 1] + iArr341[i649];
                int i650 = i649 - 1;
                this.AudioAttributesImplApi26Parcelizer = i650;
                iArr341[i649 - 2] = iArr341[i649 - 2] + iArr341[i650];
                return 0;
            case 467:
                Object[] objArr216 = this.MediaBrowserCompatSearchResultReceiver;
                int i651 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i651 + 1;
                objArr216[i651] = objArr216[123];
                return 0;
            case 468:
                Object[] objArr217 = this.MediaBrowserCompatSearchResultReceiver;
                int i652 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i652 + 1;
                objArr217[i652] = objArr217[17];
                int[] iArr342 = this.MediaMetadataCompat;
                Object obj203 = objArr217[i652];
                objArr217[i652] = null;
                iArr342[i652] = ((Object[]) obj203).length;
                return 0;
            case 469:
                Object[] objArr218 = this.MediaBrowserCompatSearchResultReceiver;
                int i653 = this.AudioAttributesImplApi26Parcelizer;
                objArr218[i653] = objArr218[17];
                int[] iArr343 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i653 + 2;
                iArr343[i653 + 1] = iArr343[15];
                return 0;
            case 470:
                int i654 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i654;
                this.MediaBrowserCompatSearchResultReceiver[i654] = null;
                int[] iArr344 = this.MediaMetadataCompat;
                iArr344[15] = iArr344[15] + 1;
                return 0;
            case 471:
                int i655 = this.AudioAttributesImplApi26Parcelizer;
                int i656 = i655 - 1;
                Object[] objArr219 = this.MediaBrowserCompatSearchResultReceiver;
                objArr219[i656] = null;
                this.AudioAttributesImplApi26Parcelizer = i655;
                objArr219[i656] = objArr219[125];
                return 0;
            case 472:
                Object[] objArr220 = this.MediaBrowserCompatSearchResultReceiver;
                int i657 = this.AudioAttributesImplApi26Parcelizer;
                objArr220[i657] = null;
                this.AudioAttributesImplApi26Parcelizer = i657;
                Object obj204 = objArr220[i657];
                objArr220[i657] = null;
                objArr220[15] = obj204;
                return 0;
            case 473:
                int[] iArr345 = this.MediaMetadataCompat;
                int i658 = this.AudioAttributesImplApi26Parcelizer;
                iArr345[i658] = iArr345[14];
                this.AudioAttributesImplApi26Parcelizer = i658;
                iArr345[i658 - 1] = iArr345[i658] ^ iArr345[i658 - 1];
                return 0;
            case 474:
                Object[] objArr221 = this.MediaBrowserCompatSearchResultReceiver;
                int i659 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i659 + 1;
                Object obj205 = objArr221[i659 - 1];
                objArr221[i659 - 1] = null;
                objArr221[i659] = obj205;
                long[] jArr28 = this.RatingCompat;
                jArr28[i659 - 1] = jArr28[i659 - 2];
                objArr221[i659 - 2] = obj205;
                return 0;
            case 475:
                Object[] objArr222 = this.MediaBrowserCompatSearchResultReceiver;
                int i660 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i660 + 1;
                Object obj206 = objArr222[i660 - 1];
                objArr222[i660 - 1] = null;
                objArr222[i660] = obj206;
                Object obj207 = objArr222[i660 - 2];
                objArr222[i660 - 2] = null;
                objArr222[i660 - 1] = obj207;
                objArr222[i660 - 2] = obj206;
                return 0;
            case 476:
                Object[] objArr223 = this.MediaBrowserCompatSearchResultReceiver;
                int i661 = this.AudioAttributesImplApi26Parcelizer;
                Object obj208 = objArr223[i661 - 1];
                objArr223[i661 - 1] = null;
                Object obj209 = objArr223[i661 - 2];
                objArr223[i661 - 2] = null;
                objArr223[i661 - 1] = obj209;
                objArr223[i661 - 2] = obj208;
                int[] iArr346 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i661 + 1;
                iArr346[i661] = 2;
                return 0;
            case 477:
                int i662 = this.AudioAttributesImplApi26Parcelizer;
                int i663 = i662 - 3;
                this.AudioAttributesImplApi26Parcelizer = i663;
                Object[] objArr224 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj210 = objArr224[i663];
                objArr224[i663] = null;
                int i664 = this.MediaMetadataCompat[i662 - 2];
                Object obj211 = objArr224[i662 - 1];
                objArr224[i662 - 1] = null;
                ((Object[]) obj210)[i664] = obj211;
                this.AudioAttributesImplApi26Parcelizer = i662 - 2;
                Object obj212 = objArr224[i662 - 4];
                objArr224[i662 - 4] = null;
                objArr224[i663] = obj212;
                long[] jArr29 = this.RatingCompat;
                jArr29[i662 - 4] = jArr29[i662 - 5];
                objArr224[i662 - 5] = obj212;
                return 0;
            case 478:
                Object[] objArr225 = this.MediaBrowserCompatSearchResultReceiver;
                int i665 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i665 + 1;
                Object obj213 = objArr225[i665 - 1];
                objArr225[i665 - 1] = null;
                objArr225[i665] = obj213;
                Object obj214 = objArr225[i665 - 2];
                objArr225[i665 - 2] = null;
                objArr225[i665 - 1] = obj214;
                objArr225[i665 - 2] = obj213;
                Object obj215 = objArr225[i665];
                objArr225[i665] = null;
                Object obj216 = objArr225[i665 - 1];
                objArr225[i665 - 1] = null;
                objArr225[i665] = obj216;
                objArr225[i665 - 1] = obj215;
                return 0;
            case 479:
                int[] iArr347 = this.MediaMetadataCompat;
                int i666 = this.AudioAttributesImplApi26Parcelizer;
                iArr347[i666] = 1;
                Object[] objArr226 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj217 = objArr226[i666 - 1];
                objArr226[i666 - 1] = null;
                objArr226[i666] = obj217;
                iArr347[i666 - 1] = iArr347[i666];
                int i667 = i666 - 2;
                this.AudioAttributesImplApi26Parcelizer = i667;
                Object obj218 = objArr226[i667];
                objArr226[i667] = null;
                int i668 = iArr347[i666 - 1];
                Object obj219 = objArr226[i666];
                objArr226[i666] = null;
                ((Object[]) obj218)[i668] = obj219;
                return 0;
            case 480:
                Object[] objArr227 = this.MediaBrowserCompatSearchResultReceiver;
                int i669 = this.AudioAttributesImplApi26Parcelizer;
                Object obj220 = objArr227[i669 - 1];
                objArr227[i669 - 1] = null;
                Object obj221 = objArr227[i669 - 2];
                objArr227[i669 - 2] = null;
                objArr227[i669 - 1] = obj221;
                objArr227[i669 - 2] = obj220;
                this.AudioAttributesImplApi26Parcelizer = i669 + 1;
                objArr227[i669] = null;
                Object obj222 = objArr227[i669];
                objArr227[i669] = null;
                Object obj223 = objArr227[i669 - 1];
                objArr227[i669 - 1] = null;
                objArr227[i669] = obj223;
                objArr227[i669 - 1] = obj222;
                return 0;
            case 481:
                Object[] objArr228 = this.MediaBrowserCompatSearchResultReceiver;
                int i670 = this.AudioAttributesImplApi26Parcelizer;
                objArr228[i670] = objArr228[i670 - 1];
                this.AudioAttributesImplApi26Parcelizer = i670 + 2;
                objArr228[i670 + 1] = objArr228[13];
                return 0;
            case 482:
                int i671 = this.AudioAttributesImplApi26Parcelizer;
                int i672 = i671 - 1;
                this.AudioAttributesImplApi26Parcelizer = i672;
                int[] iArr348 = this.MediaMetadataCompat;
                Object[] objArr229 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj224 = objArr229[i671 - 2];
                objArr229[i671 - 2] = null;
                iArr348[i671 - 2] = ((int[]) obj224)[iArr348[i672]];
                this.AudioAttributesImplApi26Parcelizer = i671;
                objArr229[i672] = objArr229[115];
                return 0;
            case 483:
                int[] iArr349 = this.MediaMetadataCompat;
                int i673 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i673 + 1;
                iArr349[i673] = iArr349[117];
                return 0;
            case 484:
                Object[] objArr230 = this.MediaBrowserCompatSearchResultReceiver;
                int i674 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i674 + 1;
                objArr230[i674] = objArr230[115];
                return 0;
            case 485:
                int[] iArr350 = this.MediaMetadataCompat;
                int i675 = this.AudioAttributesImplApi26Parcelizer;
                iArr350[i675] = iArr350[121];
                iArr350[i675 + 1] = iArr350[120];
                int i676 = i675 + 1;
                this.AudioAttributesImplApi26Parcelizer = i676;
                iArr350[i675] = iArr350[i675] + iArr350[i676];
                return 0;
            case 486:
                int i677 = this.AudioAttributesImplApi26Parcelizer;
                int i678 = i677 - 1;
                int[] iArr351 = this.MediaMetadataCompat;
                iArr351[i677 - 2] = iArr351[i677 - 2] ^ iArr351[i678];
                iArr351[i678] = iArr351[i677 - 2];
                this.AudioAttributesImplApi26Parcelizer = i677 + 1;
                iArr351[i677] = 17;
                return 0;
            case 487:
                int i679 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr352 = this.MediaMetadataCompat;
                iArr352[i679 - 2] = iArr352[i679 - 2] << iArr352[i679 - 1];
                int i680 = i679 - 2;
                this.AudioAttributesImplApi26Parcelizer = i680;
                iArr352[i679 - 3] = iArr352[i680] ^ iArr352[i679 - 3];
                Object[] objArr231 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj225 = objArr231[i679 - 4];
                objArr231[i679 - 4] = null;
                objArr231[i679 - 3] = obj225;
                iArr352[i679 - 4] = iArr352[i679 - 3];
                return 0;
            case 488:
                int i681 = this.AudioAttributesImplApi26Parcelizer;
                int i682 = i681 - 3;
                this.AudioAttributesImplApi26Parcelizer = i682;
                Object[] objArr232 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj226 = objArr232[i682];
                objArr232[i682] = null;
                int[] iArr353 = this.MediaMetadataCompat;
                ((int[]) obj226)[iArr353[i681 - 2]] = iArr353[i681 - 1];
                this.AudioAttributesImplApi26Parcelizer = i681 - 2;
                objArr232[i682] = objArr232[118];
                return 0;
            case 489:
                Object[] objArr233 = this.MediaBrowserCompatSearchResultReceiver;
                int i683 = this.AudioAttributesImplApi26Parcelizer;
                objArr233[i683] = objArr233[123];
                int[] iArr354 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i683 + 2;
                iArr354[i683 + 1] = 2;
                Object obj227 = objArr233[i683];
                objArr233[i683] = null;
                objArr233[i683 + 1] = obj227;
                iArr354[i683] = iArr354[i683 + 1];
                return 0;
            case 490:
                int i684 = this.AudioAttributesImplApi26Parcelizer;
                int i685 = i684 - 3;
                this.AudioAttributesImplApi26Parcelizer = i685;
                Object[] objArr234 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj228 = objArr234[i685];
                objArr234[i685] = null;
                int[] iArr355 = this.MediaMetadataCompat;
                int i686 = iArr355[i684 - 2];
                Object obj229 = objArr234[i684 - 1];
                objArr234[i684 - 1] = null;
                ((Object[]) obj228)[i686] = obj229;
                int i687 = i684 - 4;
                Object obj230 = objArr234[i687];
                objArr234[i687] = null;
                objArr234[13] = obj230;
                this.AudioAttributesImplApi26Parcelizer = i684 - 3;
                iArr355[i687] = iArr355[14];
                return 0;
            case 491:
                int[] iArr356 = this.MediaMetadataCompat;
                int i688 = this.AudioAttributesImplApi26Parcelizer;
                iArr356[i688] = iArr356[16];
                this.AudioAttributesImplApi26Parcelizer = i688;
                iArr356[i688 - 1] = iArr356[i688 - 1] ^ iArr356[i688];
                this.RatingCompat[i688 - 1] = iArr356[i688 - 1];
                return 0;
            case 492:
                int i689 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i689;
                long[] jArr30 = this.RatingCompat;
                jArr30[22] = jArr30[i689];
                return 0;
            case UnixStat.DEFAULT_DIR_PERM /* 493 */:
                long[] jArr31 = this.RatingCompat;
                int i690 = this.AudioAttributesImplApi26Parcelizer;
                jArr31[i690] = jArr31[22];
                Object[] objArr235 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i690 + 2;
                objArr235[i690 + 1] = objArr235[12];
                return 0;
            case 494:
                int[] iArr357 = this.MediaMetadataCompat;
                int i691 = this.AudioAttributesImplApi26Parcelizer;
                iArr357[i691] = iArr357[116];
                iArr357[i691 + 1] = iArr357[117];
                Object[] objArr236 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i691 + 3;
                objArr236[i691 + 2] = objArr236[115];
                return 0;
            case 495:
                int i692 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr358 = this.MediaMetadataCompat;
                iArr358[119] = iArr358[i692 - 1];
                int i693 = i692 - 2;
                this.AudioAttributesImplApi26Parcelizer = i693;
                Object[] objArr237 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj231 = objArr237[i693];
                objArr237[i693] = null;
                objArr237[118] = obj231;
                return 0;
            case 496:
                int i694 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr359 = this.MediaMetadataCompat;
                iArr359[i694 - 2] = iArr359[i694 - 2] >>> iArr359[i694 - 1];
                int i695 = i694 - 2;
                iArr359[i694 - 3] = iArr359[i694 - 3] ^ iArr359[i695];
                this.AudioAttributesImplApi26Parcelizer = i694 - 1;
                iArr359[i695] = iArr359[i694 - 3];
                return 0;
            case 497:
                int[] iArr360 = this.MediaMetadataCompat;
                int i696 = this.AudioAttributesImplApi26Parcelizer;
                iArr360[i696] = 2;
                Object[] objArr238 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj232 = objArr238[i696 - 1];
                objArr238[i696 - 1] = null;
                objArr238[i696] = obj232;
                iArr360[i696 - 1] = iArr360[i696];
                int i697 = i696 - 2;
                this.AudioAttributesImplApi26Parcelizer = i697;
                Object obj233 = objArr238[i697];
                objArr238[i697] = null;
                int i698 = iArr360[i696 - 1];
                Object obj234 = objArr238[i696];
                objArr238[i696] = null;
                ((Object[]) obj233)[i698] = obj234;
                return 0;
            case 498:
                int i699 = this.AudioAttributesImplApi26Parcelizer;
                int i700 = i699 - 1;
                long[] jArr32 = this.RatingCompat;
                jArr32[24] = jArr32[i700];
                Object[] objArr239 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i699;
                objArr239[i700] = objArr239[127];
                return 0;
            case 499:
                Object[] objArr240 = this.MediaBrowserCompatSearchResultReceiver;
                int i701 = this.AudioAttributesImplApi26Parcelizer;
                objArr240[i701] = objArr240[128];
                int[] iArr361 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i701 + 2;
                iArr361[i701 + 1] = 0;
                return 0;
            case 500:
                int i702 = this.AudioAttributesImplApi26Parcelizer;
                int i703 = i702 - 1;
                this.AudioAttributesImplApi26Parcelizer = i703;
                long[] jArr33 = this.RatingCompat;
                jArr33[i702 - 2] = jArr33[i702 - 2] >>> this.MediaMetadataCompat[i703];
                return 0;
            case 501:
                int i704 = this.AudioAttributesImplApi26Parcelizer;
                int i705 = i704 - 1;
                long[] jArr34 = this.RatingCompat;
                jArr34[i704 - 2] = jArr34[i704 - 2] - jArr34[i705];
                int[] iArr362 = this.MediaMetadataCompat;
                iArr362[i705] = 12;
                int i706 = i704 - 1;
                this.AudioAttributesImplApi26Parcelizer = i706;
                jArr34[i704 - 2] = jArr34[i704 - 2] >> iArr362[i706];
                return 0;
            case 502:
                int i707 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i707;
                long[] jArr35 = this.RatingCompat;
                jArr35[26] = jArr35[i707];
                return 0;
            case 503:
                long[] jArr36 = this.RatingCompat;
                int i708 = this.AudioAttributesImplApi26Parcelizer;
                jArr36[i708] = jArr36[24];
                this.AudioAttributesImplApi26Parcelizer = i708 + 2;
                jArr36[i708 + 1] = jArr36[26];
                return 0;
            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                int i709 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i709;
                Object[] objArr241 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj235 = objArr241[i709];
                objArr241[i709] = null;
                objArr241[14] = obj235;
                return 0;
            case 505:
                int[] iArr363 = this.MediaMetadataCompat;
                int i710 = this.AudioAttributesImplApi26Parcelizer;
                iArr363[i710] = 0;
                iArr363[105] = iArr363[i710];
                int i711 = i710 - 1;
                this.AudioAttributesImplApi26Parcelizer = i711;
                iArr363[104] = iArr363[i711];
                return 0;
            case 506:
                int i712 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i712;
                Object[] objArr242 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj236 = objArr242[i712];
                objArr242[i712] = null;
                objArr242[103] = obj236;
                return 0;
            case 507:
                int i713 = this.AudioAttributesImplApi26Parcelizer;
                int i714 = i713 - 1;
                Object[] objArr243 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj237 = objArr243[i714];
                objArr243[i714] = null;
                objArr243[102] = obj237;
                objArr243[i714] = obj237;
                this.AudioAttributesImplApi26Parcelizer = i713 + 1;
                objArr243[i713] = objArr243[103];
                return 0;
            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                Object[] objArr244 = this.MediaBrowserCompatSearchResultReceiver;
                int i715 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i715 + 1;
                objArr244[i715] = objArr244[103];
                return 0;
            case 509:
                Object[] objArr245 = this.MediaBrowserCompatSearchResultReceiver;
                int i716 = this.AudioAttributesImplApi26Parcelizer;
                objArr245[i716] = objArr245[103];
                int[] iArr364 = this.MediaMetadataCompat;
                iArr364[i716 + 1] = 1;
                int i717 = i716 + 1;
                this.AudioAttributesImplApi26Parcelizer = i717;
                Object obj238 = objArr245[i716];
                objArr245[i716] = null;
                objArr245[i716] = ((Object[]) obj238)[iArr364[i717]];
                return 0;
            case 510:
                int[] iArr365 = this.MediaMetadataCompat;
                int i718 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i718 + 1;
                iArr365[i718] = iArr365[104];
                return 0;
            case UnixStat.DEFAULT_LINK_PERM /* 511 */:
                int[] iArr366 = this.MediaMetadataCompat;
                int i719 = this.AudioAttributesImplApi26Parcelizer;
                iArr366[i719] = iArr366[105];
                this.AudioAttributesImplApi26Parcelizer = i719;
                iArr366[111] = iArr366[i719];
                return 0;
            case 512:
                int i720 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i720;
                int[] iArr367 = this.MediaMetadataCompat;
                iArr367[110] = iArr367[i720];
                return 0;
            case 513:
                int i721 = this.AudioAttributesImplApi26Parcelizer;
                int i722 = i721 - 1;
                Object[] objArr246 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj239 = objArr246[i722];
                objArr246[i722] = null;
                objArr246[109] = obj239;
                int[] iArr368 = this.MediaMetadataCompat;
                iArr368[108] = iArr368[i721 - 2];
                int i723 = i721 - 3;
                this.AudioAttributesImplApi26Parcelizer = i723;
                iArr368[107] = iArr368[i723];
                return 0;
            case 514:
                int i724 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i724;
                Object[] objArr247 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj240 = objArr247[i724];
                objArr247[i724] = null;
                objArr247[106] = obj240;
                return 0;
            case 515:
                Object[] objArr248 = this.MediaBrowserCompatSearchResultReceiver;
                int i725 = this.AudioAttributesImplApi26Parcelizer;
                objArr248[i725] = objArr248[106];
                this.AudioAttributesImplApi26Parcelizer = i725;
                objArr248[i725] = null;
                return 0;
            case 516:
                Object[] objArr249 = this.MediaBrowserCompatSearchResultReceiver;
                int i726 = this.AudioAttributesImplApi26Parcelizer;
                objArr249[i726] = objArr249[106];
                int[] iArr369 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i726 + 2;
                iArr369[i726 + 1] = iArr369[107];
                Object obj241 = objArr249[i726];
                objArr249[i726] = null;
                objArr249[i726 + 1] = obj241;
                iArr369[i726] = iArr369[i726 + 1];
                return 0;
            case 517:
                int i727 = this.AudioAttributesImplApi26Parcelizer;
                int i728 = i727 - 3;
                this.AudioAttributesImplApi26Parcelizer = i728;
                Object[] objArr250 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj242 = objArr250[i728];
                objArr250[i728] = null;
                int[] iArr370 = this.MediaMetadataCompat;
                ((int[]) obj242)[iArr370[i727 - 2]] = iArr370[i727 - 1];
                this.AudioAttributesImplApi26Parcelizer = i727 - 2;
                objArr250[i728] = objArr250[106];
                return 0;
            case 518:
                int[] iArr371 = this.MediaMetadataCompat;
                int i729 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i729 + 1;
                iArr371[i729] = iArr371[108];
                Object[] objArr251 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj243 = objArr251[i729 - 1];
                objArr251[i729 - 1] = null;
                objArr251[i729] = obj243;
                iArr371[i729 - 1] = iArr371[i729];
                return 0;
            case 519:
                Object[] objArr252 = this.MediaBrowserCompatSearchResultReceiver;
                int i730 = this.AudioAttributesImplApi26Parcelizer;
                objArr252[i730] = objArr252[109];
                int[] iArr372 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i730 + 2;
                iArr372[i730 + 1] = 1;
                Object obj244 = objArr252[i730];
                objArr252[i730] = null;
                objArr252[i730 + 1] = obj244;
                iArr372[i730] = iArr372[i730 + 1];
                return 0;
            case 520:
                Object[] objArr253 = this.MediaBrowserCompatSearchResultReceiver;
                int i731 = this.AudioAttributesImplApi26Parcelizer;
                objArr253[i731] = objArr253[106];
                int[] iArr373 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i731 + 2;
                iArr373[i731 + 1] = iArr373[110];
                return 0;
            case 521:
                int[] iArr374 = this.MediaMetadataCompat;
                int i732 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i732 + 1;
                iArr374[i732] = iArr374[111];
                return 0;
            case 522:
                int i733 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i733;
                int[] iArr375 = this.MediaMetadataCompat;
                iArr375[109] = iArr375[i733];
                return 0;
            case 523:
                int i734 = this.AudioAttributesImplApi26Parcelizer;
                int i735 = i734 - 1;
                int[] iArr376 = this.MediaMetadataCompat;
                iArr376[108] = iArr376[i735];
                iArr376[i735] = iArr376[109];
                this.AudioAttributesImplApi26Parcelizer = i734 + 1;
                iArr376[i734] = iArr376[108];
                return 0;
            case 524:
                int i736 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr377 = this.MediaMetadataCompat;
                iArr377[i736 - 2] = iArr377[i736 - 2] + iArr377[i736 - 1];
                int i737 = i736 - 2;
                iArr377[i736 - 3] = iArr377[i736 - 3] + iArr377[i737];
                this.AudioAttributesImplApi26Parcelizer = i736 - 1;
                iArr377[i737] = iArr377[i736 - 3];
                return 0;
            case 525:
                Object[] objArr254 = this.MediaBrowserCompatSearchResultReceiver;
                int i738 = this.AudioAttributesImplApi26Parcelizer;
                objArr254[i738] = null;
                this.AudioAttributesImplApi26Parcelizer = i738;
                Object obj245 = objArr254[i738];
                objArr254[i738] = null;
                objArr254[16] = obj245;
                return 0;
            case 526:
                Object[] objArr255 = this.MediaBrowserCompatSearchResultReceiver;
                int i739 = this.AudioAttributesImplApi26Parcelizer;
                objArr255[i739] = null;
                int[] iArr378 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i739 + 2;
                iArr378[i739 + 1] = 1;
                return 0;
            case 527:
                int i740 = this.AudioAttributesImplApi26Parcelizer;
                int i741 = i740 - 1;
                int[] iArr379 = this.MediaMetadataCompat;
                iArr379[14] = iArr379[i741];
                Object[] objArr256 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i740;
                objArr256[i741] = objArr256[16];
                return 0;
            case 528:
                Object[] objArr257 = this.MediaBrowserCompatSearchResultReceiver;
                int i742 = this.AudioAttributesImplApi26Parcelizer;
                Object obj246 = objArr257[i742 - 2];
                objArr257[i742 - 2] = null;
                objArr257[i742 - 1] = obj246;
                int[] iArr380 = this.MediaMetadataCompat;
                iArr380[i742 - 2] = iArr380[i742 - 1];
                int i743 = i742 - 3;
                this.AudioAttributesImplApi26Parcelizer = i743;
                Object obj247 = objArr257[i743];
                objArr257[i743] = null;
                int i744 = iArr380[i742 - 2];
                Object obj248 = objArr257[i742 - 1];
                objArr257[i742 - 1] = null;
                ((Object[]) obj247)[i744] = obj248;
                this.AudioAttributesImplApi26Parcelizer = i742 - 2;
                Object obj249 = objArr257[i742 - 4];
                objArr257[i742 - 4] = null;
                objArr257[i743] = obj249;
                iArr380[i742 - 4] = iArr380[i742 - 5];
                objArr257[i742 - 5] = obj249;
                return 0;
            case 529:
                int[] iArr381 = this.MediaMetadataCompat;
                int i745 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i745 + 1;
                iArr381[i745] = 1;
                Object[] objArr258 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj250 = objArr258[i745 - 1];
                objArr258[i745 - 1] = null;
                objArr258[i745] = obj250;
                iArr381[i745 - 1] = iArr381[i745];
                return 0;
            case 530:
                Object[] objArr259 = this.MediaBrowserCompatSearchResultReceiver;
                int i746 = this.AudioAttributesImplApi26Parcelizer;
                Object obj251 = objArr259[i746 - 1];
                objArr259[i746 - 1] = null;
                Object obj252 = objArr259[i746 - 2];
                objArr259[i746 - 2] = null;
                objArr259[i746 - 1] = obj252;
                objArr259[i746 - 2] = obj251;
                int[] iArr382 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i746 + 1;
                iArr382[i746] = 0;
                return 0;
            case 531:
                Object[] objArr260 = this.MediaBrowserCompatSearchResultReceiver;
                int i747 = this.AudioAttributesImplApi26Parcelizer;
                Object obj253 = objArr260[i747 - 2];
                objArr260[i747 - 2] = null;
                objArr260[i747 - 1] = obj253;
                int[] iArr383 = this.MediaMetadataCompat;
                iArr383[i747 - 2] = iArr383[i747 - 1];
                int i748 = i747 - 3;
                this.AudioAttributesImplApi26Parcelizer = i748;
                Object obj254 = objArr260[i748];
                objArr260[i748] = null;
                int i749 = iArr383[i747 - 2];
                Object obj255 = objArr260[i747 - 1];
                objArr260[i747 - 1] = null;
                ((Object[]) obj254)[i749] = obj255;
                return 0;
            case 532:
                int i750 = this.AudioAttributesImplApi26Parcelizer;
                int i751 = i750 - 1;
                Object[] objArr261 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj256 = objArr261[i751];
                objArr261[i751] = null;
                objArr261[14] = obj256;
                this.AudioAttributesImplApi26Parcelizer = i750;
                objArr261[i751] = objArr261[16];
                return 0;
            case 533:
                int i752 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i752;
                Object[] objArr262 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj257 = objArr262[i752];
                objArr262[i752] = null;
                objArr262[112] = obj257;
                return 0;
            case 534:
                Object[] objArr263 = this.MediaBrowserCompatSearchResultReceiver;
                int i753 = this.AudioAttributesImplApi26Parcelizer;
                objArr263[i753] = objArr263[112];
                int[] iArr384 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i753 + 2;
                iArr384[i753 + 1] = 0;
                return 0;
            case 535:
                int i754 = this.AudioAttributesImplApi26Parcelizer;
                int i755 = i754 - 1;
                int[] iArr385 = this.MediaMetadataCompat;
                iArr385[17] = iArr385[i755];
                Object[] objArr264 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i754;
                objArr264[i755] = objArr264[14];
                return 0;
            case 536:
                int i756 = this.AudioAttributesImplApi26Parcelizer;
                int i757 = i756 - 1;
                Object[] objArr265 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj258 = objArr265[i757];
                objArr265[i757] = null;
                objArr265[112] = obj258;
                this.AudioAttributesImplApi26Parcelizer = i756;
                objArr265[i757] = obj258;
                return 0;
            case 537:
                int[] iArr386 = this.MediaMetadataCompat;
                int i758 = this.AudioAttributesImplApi26Parcelizer;
                iArr386[i758] = iArr386[i758 - 1];
                iArr386[16] = iArr386[i758];
                this.AudioAttributesImplApi26Parcelizer = i758 + 1;
                iArr386[i758] = iArr386[17];
                return 0;
            case 538:
                int[] iArr387 = this.MediaMetadataCompat;
                int i759 = this.AudioAttributesImplApi26Parcelizer;
                iArr387[i759] = 0;
                this.AudioAttributesImplApi26Parcelizer = i759 + 2;
                iArr387[i759 + 1] = 1;
                return 0;
            case 539:
                Object[] objArr266 = this.MediaBrowserCompatSearchResultReceiver;
                int i760 = this.AudioAttributesImplApi26Parcelizer;
                objArr266[i760] = objArr266[i760 - 1];
                int[] iArr388 = this.MediaMetadataCompat;
                iArr388[i760 + 1] = 2;
                this.AudioAttributesImplApi26Parcelizer = i760 + 3;
                iArr388[i760 + 2] = 1;
                return 0;
            case 540:
                int i761 = this.AudioAttributesImplApi26Parcelizer;
                int i762 = i761 - 1;
                Object[] objArr267 = this.MediaBrowserCompatSearchResultReceiver;
                objArr267[i762] = null;
                objArr267[i762] = objArr267[i761 - 2];
                this.AudioAttributesImplApi26Parcelizer = i761 + 1;
                objArr267[i761] = objArr267[14];
                return 0;
            case 541:
                Object[] objArr268 = this.MediaBrowserCompatSearchResultReceiver;
                int i763 = this.AudioAttributesImplApi26Parcelizer;
                objArr268[i763] = objArr268[i763 - 1];
                Object obj259 = objArr268[i763];
                objArr268[i763] = null;
                objArr268[112] = obj259;
                this.AudioAttributesImplApi26Parcelizer = i763 + 1;
                objArr268[i763] = obj259;
                return 0;
            case 542:
                int[] iArr389 = this.MediaMetadataCompat;
                int i764 = this.AudioAttributesImplApi26Parcelizer;
                iArr389[i764] = 0;
                this.AudioAttributesImplApi26Parcelizer = i764;
                iArr389[105] = iArr389[i764];
                return 0;
            case 543:
                int i765 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr390 = this.MediaMetadataCompat;
                iArr390[104] = iArr390[i765 - 1];
                int i766 = i765 - 2;
                Object[] objArr269 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj260 = objArr269[i766];
                objArr269[i766] = null;
                objArr269[103] = obj260;
                int i767 = i765 - 3;
                this.AudioAttributesImplApi26Parcelizer = i767;
                Object obj261 = objArr269[i767];
                objArr269[i767] = null;
                objArr269[102] = obj261;
                return 0;
            case 544:
                Object[] objArr270 = this.MediaBrowserCompatSearchResultReceiver;
                int i768 = this.AudioAttributesImplApi26Parcelizer;
                objArr270[i768] = objArr270[102];
                this.AudioAttributesImplApi26Parcelizer = i768 + 2;
                objArr270[i768 + 1] = objArr270[103];
                return 0;
            case 545:
                int i769 = this.AudioAttributesImplApi26Parcelizer;
                int i770 = i769 - 1;
                this.AudioAttributesImplApi26Parcelizer = i770;
                int[] iArr391 = this.MediaMetadataCompat;
                Object[] objArr271 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj262 = objArr271[i769 - 2];
                objArr271[i769 - 2] = null;
                iArr391[i769 - 2] = ((int[]) obj262)[iArr391[i770]];
                this.AudioAttributesImplApi26Parcelizer = i769;
                objArr271[i770] = objArr271[103];
                return 0;
            case 546:
                int[] iArr392 = this.MediaMetadataCompat;
                int i771 = this.AudioAttributesImplApi26Parcelizer;
                iArr392[i771] = iArr392[104];
                iArr392[i771 + 1] = iArr392[105];
                int i772 = i771 + 1;
                this.AudioAttributesImplApi26Parcelizer = i772;
                iArr392[111] = iArr392[i772];
                return 0;
            case 547:
                int i773 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr393 = this.MediaMetadataCompat;
                iArr393[110] = iArr393[i773 - 1];
                int i774 = i773 - 2;
                this.AudioAttributesImplApi26Parcelizer = i774;
                Object[] objArr272 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj263 = objArr272[i774];
                objArr272[i774] = null;
                objArr272[109] = obj263;
                return 0;
            case 548:
                int i775 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i775;
                int[] iArr394 = this.MediaMetadataCompat;
                iArr394[108] = iArr394[i775];
                return 0;
            case 549:
                int i776 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr395 = this.MediaMetadataCompat;
                iArr395[107] = iArr395[i776 - 1];
                int i777 = i776 - 2;
                Object[] objArr273 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj264 = objArr273[i777];
                objArr273[i777] = null;
                objArr273[106] = obj264;
                this.AudioAttributesImplApi26Parcelizer = i776 - 1;
                objArr273[i777] = obj264;
                return 0;
            case 550:
                int i778 = this.AudioAttributesImplApi26Parcelizer;
                int i779 = i778 - 1;
                Object[] objArr274 = this.MediaBrowserCompatSearchResultReceiver;
                objArr274[i779] = null;
                objArr274[i779] = objArr274[106];
                int[] iArr396 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i778 + 1;
                iArr396[i778] = iArr396[107];
                return 0;
            case 551:
                int i780 = this.AudioAttributesImplApi26Parcelizer;
                int i781 = i780 - 3;
                this.AudioAttributesImplApi26Parcelizer = i781;
                Object[] objArr275 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj265 = objArr275[i781];
                objArr275[i781] = null;
                int[] iArr397 = this.MediaMetadataCompat;
                ((int[]) obj265)[iArr397[i780 - 2]] = iArr397[i780 - 1];
                objArr275[i781] = objArr275[106];
                this.AudioAttributesImplApi26Parcelizer = i780 - 1;
                iArr397[i780 - 2] = iArr397[108];
                return 0;
            case 552:
                int[] iArr398 = this.MediaMetadataCompat;
                int i782 = this.AudioAttributesImplApi26Parcelizer;
                int i783 = iArr398[i782 - 1];
                iArr398[i782 - 1] = iArr398[i782 - 2];
                iArr398[i782 - 2] = i783;
                int i784 = i782 - 3;
                this.AudioAttributesImplApi26Parcelizer = i784;
                Object[] objArr276 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj266 = objArr276[i784];
                objArr276[i784] = null;
                ((int[]) obj266)[iArr398[i782 - 2]] = iArr398[i782 - 1];
                this.AudioAttributesImplApi26Parcelizer = i782 - 2;
                objArr276[i784] = objArr276[106];
                return 0;
            case 553:
                int i785 = this.AudioAttributesImplApi26Parcelizer;
                int i786 = i785 - 3;
                this.AudioAttributesImplApi26Parcelizer = i786;
                Object[] objArr277 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj267 = objArr277[i786];
                objArr277[i786] = null;
                int[] iArr399 = this.MediaMetadataCompat;
                int i787 = iArr399[i785 - 2];
                Object obj268 = objArr277[i785 - 1];
                objArr277[i785 - 1] = null;
                ((Object[]) obj267)[i787] = obj268;
                objArr277[i786] = objArr277[106];
                this.AudioAttributesImplApi26Parcelizer = i785 - 1;
                iArr399[i785 - 2] = iArr399[110];
                return 0;
            case RtspMessageChannel.DEFAULT_RTSP_PORT /* 554 */:
                int i788 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr400 = this.MediaMetadataCompat;
                int i789 = iArr400[i788 - 1];
                iArr400[109] = i789;
                int i790 = i788 - 2;
                iArr400[108] = iArr400[i790];
                this.AudioAttributesImplApi26Parcelizer = i788 - 1;
                iArr400[i790] = i789;
                return 0;
            case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                int[] iArr401 = this.MediaMetadataCompat;
                int i791 = this.AudioAttributesImplApi26Parcelizer;
                iArr401[i791] = iArr401[108];
                iArr401[i791 - 1] = iArr401[i791 - 1] + iArr401[i791];
                int i792 = i791 - 1;
                this.AudioAttributesImplApi26Parcelizer = i792;
                iArr401[i791 - 2] = iArr401[i791 - 2] + iArr401[i792];
                return 0;
            case 556:
                Object[] objArr278 = this.MediaBrowserCompatSearchResultReceiver;
                int i793 = this.AudioAttributesImplApi26Parcelizer;
                objArr278[i793] = objArr278[14];
                this.AudioAttributesImplApi26Parcelizer = i793 + 2;
                objArr278[i793 + 1] = objArr278[i793];
                return 0;
            case 557:
                Object[] objArr279 = this.MediaBrowserCompatSearchResultReceiver;
                int i794 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i794 + 1;
                objArr279[i794] = objArr279[112];
                return 0;
            case 558:
                int i795 = this.AudioAttributesImplApi26Parcelizer;
                int i796 = i795 - 1;
                this.AudioAttributesImplApi26Parcelizer = i796;
                int[] iArr402 = this.MediaMetadataCompat;
                Object[] objArr280 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj269 = objArr280[i795 - 2];
                objArr280[i795 - 2] = null;
                iArr402[i795 - 2] = ((int[]) obj269)[iArr402[i796]];
                iArr402[i796] = 0;
                int i797 = i795 - 1;
                this.AudioAttributesImplApi26Parcelizer = i797;
                iArr402[105] = iArr402[i797];
                return 0;
            case 559:
                int i798 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr403 = this.MediaMetadataCompat;
                iArr403[104] = iArr403[i798 - 1];
                int i799 = i798 - 2;
                this.AudioAttributesImplApi26Parcelizer = i799;
                Object[] objArr281 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj270 = objArr281[i799];
                objArr281[i799] = null;
                objArr281[103] = obj270;
                return 0;
            case 560:
                int i800 = this.AudioAttributesImplApi26Parcelizer;
                int i801 = i800 - 1;
                Object[] objArr282 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj271 = objArr282[i801];
                objArr282[i801] = null;
                objArr282[102] = obj271;
                this.AudioAttributesImplApi26Parcelizer = i800;
                objArr282[i801] = obj271;
                return 0;
            case 561:
                int[] iArr404 = this.MediaMetadataCompat;
                int i802 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i802 + 1;
                iArr404[i802] = iArr404[105];
                return 0;
            case 562:
                int i803 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr405 = this.MediaMetadataCompat;
                iArr405[111] = iArr405[i803 - 1];
                int i804 = i803 - 2;
                this.AudioAttributesImplApi26Parcelizer = i804;
                iArr405[110] = iArr405[i804];
                return 0;
            case 563:
                int i805 = this.AudioAttributesImplApi26Parcelizer;
                int i806 = i805 - 1;
                Object[] objArr283 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj272 = objArr283[i806];
                objArr283[i806] = null;
                objArr283[109] = obj272;
                int i807 = i805 - 2;
                this.AudioAttributesImplApi26Parcelizer = i807;
                int[] iArr406 = this.MediaMetadataCompat;
                iArr406[108] = iArr406[i807];
                return 0;
            case 564:
                int i808 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i808;
                int[] iArr407 = this.MediaMetadataCompat;
                iArr407[107] = iArr407[i808];
                return 0;
            case 565:
                int i809 = this.AudioAttributesImplApi26Parcelizer;
                int i810 = i809 - 1;
                Object[] objArr284 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj273 = objArr284[i810];
                objArr284[i810] = null;
                objArr284[106] = obj273;
                this.AudioAttributesImplApi26Parcelizer = i809;
                objArr284[i810] = obj273;
                return 0;
            case 566:
                Object[] objArr285 = this.MediaBrowserCompatSearchResultReceiver;
                int i811 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i811 + 1;
                objArr285[i811] = objArr285[106];
                return 0;
            case 567:
                int[] iArr408 = this.MediaMetadataCompat;
                int i812 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i812 + 1;
                iArr408[i812] = iArr408[107];
                return 0;
            case 568:
                Object[] objArr286 = this.MediaBrowserCompatSearchResultReceiver;
                int i813 = this.AudioAttributesImplApi26Parcelizer;
                objArr286[i813] = objArr286[106];
                int[] iArr409 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i813 + 2;
                iArr409[i813 + 1] = iArr409[108];
                Object obj274 = objArr286[i813];
                objArr286[i813] = null;
                objArr286[i813 + 1] = obj274;
                iArr409[i813] = iArr409[i813 + 1];
                return 0;
            case 569:
                Object[] objArr287 = this.MediaBrowserCompatSearchResultReceiver;
                int i814 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i814 + 1;
                objArr287[i814] = objArr287[109];
                return 0;
            case 570:
                int i815 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr410 = this.MediaMetadataCompat;
                iArr410[109] = iArr410[i815 - 1];
                int i816 = i815 - 2;
                this.AudioAttributesImplApi26Parcelizer = i816;
                iArr410[108] = iArr410[i816];
                return 0;
            case 571:
                int[] iArr411 = this.MediaMetadataCompat;
                int i817 = this.AudioAttributesImplApi26Parcelizer;
                iArr411[i817] = iArr411[109];
                iArr411[i817 + 1] = iArr411[108];
                int i818 = i817 + 1;
                this.AudioAttributesImplApi26Parcelizer = i818;
                iArr411[i817] = iArr411[i817] + iArr411[i818];
                return 0;
            case 572:
                int i819 = this.AudioAttributesImplApi26Parcelizer;
                int i820 = i819 - 3;
                this.AudioAttributesImplApi26Parcelizer = i820;
                Object[] objArr288 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj275 = objArr288[i820];
                objArr288[i820] = null;
                int[] iArr412 = this.MediaMetadataCompat;
                ((int[]) obj275)[iArr412[i819 - 2]] = iArr412[i819 - 1];
                int i821 = i819 - 4;
                Object obj276 = objArr288[i821];
                objArr288[i821] = null;
                objArr288[14] = obj276;
                this.AudioAttributesImplApi26Parcelizer = i819 - 3;
                iArr412[i821] = 4;
                return 0;
            case 573:
                int i822 = this.AudioAttributesImplApi26Parcelizer;
                int i823 = i822 - 1;
                Object[] objArr289 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj277 = objArr289[i823];
                objArr289[i823] = null;
                objArr289[103] = obj277;
                int i824 = i822 - 2;
                this.AudioAttributesImplApi26Parcelizer = i824;
                Object obj278 = objArr289[i824];
                objArr289[i824] = null;
                objArr289[102] = obj278;
                return 0;
            case 574:
                Object[] objArr290 = this.MediaBrowserCompatSearchResultReceiver;
                int i825 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i825 + 1;
                objArr290[i825] = objArr290[102];
                return 0;
            case 575:
                Object[] objArr291 = this.MediaBrowserCompatSearchResultReceiver;
                int i826 = this.AudioAttributesImplApi26Parcelizer;
                objArr291[i826] = objArr291[103];
                int[] iArr413 = this.MediaMetadataCompat;
                iArr413[i826 + 1] = 0;
                int i827 = i826 + 1;
                this.AudioAttributesImplApi26Parcelizer = i827;
                Object obj279 = objArr291[i826];
                objArr291[i826] = null;
                objArr291[i826] = ((Object[]) obj279)[iArr413[i827]];
                return 0;
            case 576:
                int[] iArr414 = this.MediaMetadataCompat;
                int i828 = this.AudioAttributesImplApi26Parcelizer;
                iArr414[i828] = iArr414[104];
                this.AudioAttributesImplApi26Parcelizer = i828 + 2;
                iArr414[i828 + 1] = iArr414[105];
                return 0;
            case 577:
                int i829 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i829;
                Object[] objArr292 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj280 = objArr292[i829];
                objArr292[i829] = null;
                objArr292[109] = obj280;
                return 0;
            case 578:
                int[] iArr415 = this.MediaMetadataCompat;
                int i830 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i830 + 1;
                iArr415[i830] = iArr415[108];
                return 0;
            case 579:
                Object[] objArr293 = this.MediaBrowserCompatSearchResultReceiver;
                int i831 = this.AudioAttributesImplApi26Parcelizer;
                objArr293[i831] = objArr293[109];
                int[] iArr416 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i831 + 2;
                iArr416[i831 + 1] = 1;
                return 0;
            case 580:
                Object[] objArr294 = this.MediaBrowserCompatSearchResultReceiver;
                int i832 = this.AudioAttributesImplApi26Parcelizer;
                objArr294[i832] = null;
                this.AudioAttributesImplApi26Parcelizer = i832;
                Object obj281 = objArr294[i832];
                objArr294[i832] = null;
                objArr294[12] = obj281;
                return 0;
            case 581:
                int[] iArr417 = this.MediaMetadataCompat;
                int i833 = this.AudioAttributesImplApi26Parcelizer;
                iArr417[i833] = iArr417[17];
                iArr417[i833 + 1] = iArr417[16];
                int i834 = i833 + 1;
                this.AudioAttributesImplApi26Parcelizer = i834;
                iArr417[i833] = iArr417[i833] ^ iArr417[i834];
                return 0;
            case 582:
                Object[] objArr295 = this.MediaBrowserCompatSearchResultReceiver;
                int i835 = this.AudioAttributesImplApi26Parcelizer;
                Object obj282 = objArr295[i835 - 1];
                objArr295[i835 - 1] = null;
                objArr295[i835] = obj282;
                Object obj283 = objArr295[i835 - 2];
                objArr295[i835 - 2] = null;
                objArr295[i835 - 1] = obj283;
                objArr295[i835 - 2] = obj282;
                Object obj284 = objArr295[i835];
                objArr295[i835] = null;
                Object obj285 = objArr295[i835 - 1];
                objArr295[i835 - 1] = null;
                objArr295[i835] = obj285;
                objArr295[i835 - 1] = obj284;
                int[] iArr418 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i835 + 2;
                iArr418[i835 + 1] = 0;
                return 0;
            case 583:
                Object[] objArr296 = this.MediaBrowserCompatSearchResultReceiver;
                int i836 = this.AudioAttributesImplApi26Parcelizer;
                objArr296[i836] = objArr296[i836 - 1];
                this.AudioAttributesImplApi26Parcelizer = i836;
                objArr296[i836] = null;
                return 0;
            case 584:
                Object[] objArr297 = this.MediaBrowserCompatSearchResultReceiver;
                int i837 = this.AudioAttributesImplApi26Parcelizer;
                objArr297[i837] = objArr297[i837 - 1];
                objArr297[i837 + 1] = objArr297[14];
                this.AudioAttributesImplApi26Parcelizer = i837 + 3;
                objArr297[i837 + 2] = objArr297[i837 + 1];
                return 0;
            case 585:
                int i838 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i838;
                Object[] objArr298 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj286 = objArr298[i838];
                objArr298[i838] = null;
                objArr298[102] = obj286;
                return 0;
            case 586:
                int[] iArr419 = this.MediaMetadataCompat;
                int i839 = this.AudioAttributesImplApi26Parcelizer;
                iArr419[i839] = 0;
                this.AudioAttributesImplApi26Parcelizer = i839;
                Object[] objArr299 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj287 = objArr299[i839 - 1];
                objArr299[i839 - 1] = null;
                iArr419[i839 - 1] = ((int[]) obj287)[iArr419[i839]];
                this.AudioAttributesImplApi26Parcelizer = i839 + 1;
                objArr299[i839] = objArr299[103];
                return 0;
            case 587:
                int i840 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr420 = this.MediaMetadataCompat;
                iArr420[110] = iArr420[i840 - 1];
                int i841 = i840 - 2;
                Object[] objArr300 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj288 = objArr300[i841];
                objArr300[i841] = null;
                objArr300[109] = obj288;
                int i842 = i840 - 3;
                this.AudioAttributesImplApi26Parcelizer = i842;
                iArr420[108] = iArr420[i842];
                return 0;
            case 588:
                int[] iArr421 = this.MediaMetadataCompat;
                int i843 = this.AudioAttributesImplApi26Parcelizer;
                iArr421[i843] = iArr421[110];
                this.AudioAttributesImplApi26Parcelizer = i843 + 2;
                iArr421[i843 + 1] = iArr421[111];
                return 0;
            case 589:
                int i844 = this.AudioAttributesImplApi26Parcelizer;
                int i845 = i844 - 1;
                int[] iArr422 = this.MediaMetadataCompat;
                iArr422[108] = iArr422[i845];
                this.AudioAttributesImplApi26Parcelizer = i844;
                iArr422[i845] = iArr422[109];
                return 0;
            case 590:
                int i846 = this.AudioAttributesImplApi26Parcelizer;
                int i847 = i846 - 3;
                this.AudioAttributesImplApi26Parcelizer = i847;
                Object[] objArr301 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj289 = objArr301[i847];
                objArr301[i847] = null;
                int[] iArr423 = this.MediaMetadataCompat;
                ((int[]) obj289)[iArr423[i846 - 2]] = iArr423[i846 - 1];
                int i848 = i846 - 4;
                this.AudioAttributesImplApi26Parcelizer = i848;
                Object obj290 = objArr301[i848];
                objArr301[i848] = null;
                objArr301[14] = obj290;
                return 0;
            case 591:
                int[] iArr424 = this.MediaMetadataCompat;
                int i849 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i849 + 1;
                iArr424[i849] = iArr424[17];
                return 0;
            case 592:
                int i850 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr37 = this.RatingCompat;
                jArr37[i850 - 2] = jArr37[i850 - 2] | jArr37[i850 - 1];
                int i851 = i850 - 2;
                this.AudioAttributesImplApi26Parcelizer = i851;
                jArr37[28] = jArr37[i851];
                return 0;
            case 593:
                long[] jArr38 = this.RatingCompat;
                int i852 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i852 + 1;
                jArr38[i852] = jArr38[28];
                return 0;
            case 594:
                int[] iArr425 = this.MediaMetadataCompat;
                int i853 = this.AudioAttributesImplApi26Parcelizer;
                iArr425[i853] = 0;
                this.AudioAttributesImplApi26Parcelizer = i853 + 2;
                iArr425[i853 + 1] = 0;
                return 0;
            case 595:
                Object[] objArr302 = this.MediaBrowserCompatSearchResultReceiver;
                int i854 = this.AudioAttributesImplApi26Parcelizer;
                objArr302[i854] = objArr302[14];
                objArr302[i854 + 1] = objArr302[i854];
                int i855 = i854 + 1;
                this.AudioAttributesImplApi26Parcelizer = i855;
                Object obj291 = objArr302[i855];
                objArr302[i855] = null;
                objArr302[112] = obj291;
                return 0;
            case 596:
                Object[] objArr303 = this.MediaBrowserCompatSearchResultReceiver;
                int i856 = this.AudioAttributesImplApi26Parcelizer;
                objArr303[i856] = objArr303[112];
                int[] iArr426 = this.MediaMetadataCompat;
                iArr426[i856 + 1] = 3;
                int i857 = i856 + 1;
                this.AudioAttributesImplApi26Parcelizer = i857;
                Object obj292 = objArr303[i856];
                objArr303[i856] = null;
                objArr303[i856] = ((Object[]) obj292)[iArr426[i857]];
                return 0;
            case 597:
                int i858 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i858;
                int[] iArr427 = this.MediaMetadataCompat;
                iArr427[104] = iArr427[i858];
                return 0;
            case 598:
                Object[] objArr304 = this.MediaBrowserCompatSearchResultReceiver;
                int i859 = this.AudioAttributesImplApi26Parcelizer;
                objArr304[i859] = objArr304[103];
                int[] iArr428 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i859 + 2;
                iArr428[i859 + 1] = 2;
                return 0;
            case 599:
                int[] iArr429 = this.MediaMetadataCompat;
                int i860 = this.AudioAttributesImplApi26Parcelizer;
                iArr429[i860] = iArr429[105];
                iArr429[111] = iArr429[i860];
                int i861 = i860 - 1;
                this.AudioAttributesImplApi26Parcelizer = i861;
                iArr429[110] = iArr429[i861];
                return 0;
            case 600:
                Object[] objArr305 = this.MediaBrowserCompatSearchResultReceiver;
                int i862 = this.AudioAttributesImplApi26Parcelizer;
                Object obj293 = objArr305[i862 - 2];
                objArr305[i862 - 2] = null;
                objArr305[i862 - 1] = obj293;
                int[] iArr430 = this.MediaMetadataCompat;
                iArr430[i862 - 2] = iArr430[i862 - 1];
                this.AudioAttributesImplApi26Parcelizer = i862 + 1;
                iArr430[i862] = 2;
                return 0;
            case 601:
                Object[] objArr306 = this.MediaBrowserCompatSearchResultReceiver;
                int i863 = this.AudioAttributesImplApi26Parcelizer;
                objArr306[i863] = objArr306[106];
                int[] iArr431 = this.MediaMetadataCompat;
                iArr431[i863 + 1] = iArr431[110];
                this.AudioAttributesImplApi26Parcelizer = i863 + 3;
                iArr431[i863 + 2] = iArr431[111];
                return 0;
            case 602:
                int[] iArr432 = this.MediaMetadataCompat;
                int i864 = this.AudioAttributesImplApi26Parcelizer;
                iArr432[i864] = iArr432[108];
                this.AudioAttributesImplApi26Parcelizer = i864;
                iArr432[i864 - 1] = iArr432[i864 - 1] + iArr432[i864];
                return 0;
            case 603:
                int i865 = this.AudioAttributesImplApi26Parcelizer;
                int i866 = i865 - 1;
                int[] iArr433 = this.MediaMetadataCompat;
                iArr433[i865 - 2] = iArr433[i865 - 2] ^ iArr433[i866];
                Object[] objArr307 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj294 = objArr307[i865 - 3];
                objArr307[i865 - 3] = null;
                objArr307[i865 - 2] = obj294;
                iArr433[i865 - 3] = iArr433[i865 - 2];
                this.AudioAttributesImplApi26Parcelizer = i865;
                iArr433[i866] = 3;
                return 0;
            case 604:
                int[] iArr434 = this.MediaMetadataCompat;
                int i867 = this.AudioAttributesImplApi26Parcelizer;
                int i868 = iArr434[i867 - 1];
                iArr434[i867 - 1] = iArr434[i867 - 2];
                iArr434[i867 - 2] = i868;
                int i869 = i867 - 3;
                this.AudioAttributesImplApi26Parcelizer = i869;
                Object[] objArr308 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj295 = objArr308[i869];
                objArr308[i869] = null;
                ((int[]) obj295)[iArr434[i867 - 2]] = iArr434[i867 - 1];
                this.AudioAttributesImplApi26Parcelizer = i867 - 2;
                iArr434[i869] = iArr434[16];
                return 0;
            case 605:
                int i870 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i870;
                long[] jArr39 = this.RatingCompat;
                jArr39[30] = jArr39[i870];
                return 0;
            case 606:
                int i871 = this.AudioAttributesImplApi26Parcelizer;
                int i872 = i871 - 1;
                this.AudioAttributesImplApi26Parcelizer = i872;
                long[] jArr40 = this.RatingCompat;
                jArr40[i871 - 2] = jArr40[i871 - 2] << this.MediaMetadataCompat[i872];
                return 0;
            case 607:
                int i873 = this.AudioAttributesImplApi26Parcelizer;
                int i874 = i873 - 1;
                long[] jArr41 = this.RatingCompat;
                jArr41[i873 - 2] = jArr41[i873 - 2] - jArr41[i874];
                int[] iArr435 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i873;
                iArr435[i874] = 12;
                return 0;
            case 608:
                int i875 = this.AudioAttributesImplApi26Parcelizer;
                int i876 = i875 - 1;
                long[] jArr42 = this.RatingCompat;
                jArr42[32] = jArr42[i876];
                this.AudioAttributesImplApi26Parcelizer = i875;
                jArr42[i876] = jArr42[30];
                return 0;
            case 609:
                long[] jArr43 = this.RatingCompat;
                int i877 = this.AudioAttributesImplApi26Parcelizer;
                jArr43[i877] = jArr43[32];
                this.AudioAttributesImplApi26Parcelizer = i877;
                this.MediaMetadataCompat[i877 - 1] = (jArr43[i877 - 1] > jArr43[i877] ? 1 : (jArr43[i877 - 1] == jArr43[i877] ? 0 : -1));
                return 0;
            case 610:
                Object[] objArr309 = this.MediaBrowserCompatSearchResultReceiver;
                int i878 = this.AudioAttributesImplApi26Parcelizer;
                objArr309[i878] = objArr309[i878 - 1];
                this.AudioAttributesImplApi26Parcelizer = i878 + 2;
                objArr309[i878 + 1] = objArr309[16];
                return 0;
            case 611:
                int i879 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i879;
                int[] iArr436 = this.MediaMetadataCompat;
                iArr436[105] = iArr436[i879];
                return 0;
            case 612:
                int i880 = this.AudioAttributesImplApi26Parcelizer;
                int i881 = i880 - 1;
                Object[] objArr310 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj296 = objArr310[i881];
                objArr310[i881] = null;
                objArr310[106] = obj296;
                objArr310[i881] = obj296;
                int i882 = i880 - 1;
                this.AudioAttributesImplApi26Parcelizer = i882;
                objArr310[i882] = null;
                return 0;
            case 613:
                Object[] objArr311 = this.MediaBrowserCompatSearchResultReceiver;
                int i883 = this.AudioAttributesImplApi26Parcelizer;
                objArr311[i883] = objArr311[106];
                int[] iArr437 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i883 + 2;
                iArr437[i883 + 1] = iArr437[107];
                return 0;
            case 614:
                int i884 = this.AudioAttributesImplApi26Parcelizer;
                int i885 = i884 - 3;
                this.AudioAttributesImplApi26Parcelizer = i885;
                Object[] objArr312 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj297 = objArr312[i885];
                objArr312[i885] = null;
                int[] iArr438 = this.MediaMetadataCompat;
                ((int[]) obj297)[iArr438[i884 - 2]] = iArr438[i884 - 1];
                objArr312[i885] = objArr312[106];
                this.AudioAttributesImplApi26Parcelizer = i884 - 1;
                objArr312[i884 - 2] = objArr312[109];
                return 0;
            case 615:
                Object[] objArr313 = this.MediaBrowserCompatSearchResultReceiver;
                int i886 = this.AudioAttributesImplApi26Parcelizer;
                objArr313[i886] = objArr313[i886 - 1];
                this.MediaMetadataCompat[i886 + 1] = 0;
                this.AudioAttributesImplApi26Parcelizer = i886 + 3;
                objArr313[i886 + 2] = objArr313[15];
                return 0;
            case 616:
                int[] iArr439 = this.MediaMetadataCompat;
                int i887 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i887 + 1;
                iArr439[i887] = 0;
                Object[] objArr314 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj298 = objArr314[i887 - 1];
                objArr314[i887 - 1] = null;
                objArr314[i887] = obj298;
                iArr439[i887 - 1] = iArr439[i887];
                return 0;
            case 617:
                int i888 = this.AudioAttributesImplApi26Parcelizer;
                int i889 = i888 - 1;
                Object[] objArr315 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj299 = objArr315[i889];
                objArr315[i889] = null;
                objArr315[112] = obj299;
                objArr315[i889] = obj299;
                int[] iArr440 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i888 + 1;
                iArr440[i888] = 0;
                return 0;
            case 618:
                int[] iArr441 = this.MediaMetadataCompat;
                int i890 = this.AudioAttributesImplApi26Parcelizer;
                iArr441[i890] = 0;
                this.AudioAttributesImplApi26Parcelizer = i890;
                Object[] objArr316 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj300 = objArr316[i890 - 1];
                objArr316[i890 - 1] = null;
                iArr441[i890 - 1] = ((int[]) obj300)[iArr441[i890]];
                int i891 = i890 - 1;
                this.AudioAttributesImplApi26Parcelizer = i891;
                iArr441[18] = iArr441[i891];
                return 0;
            case 619:
                int[] iArr442 = this.MediaMetadataCompat;
                int i892 = this.AudioAttributesImplApi26Parcelizer;
                iArr442[i892] = iArr442[i892 - 1];
                iArr442[17] = iArr442[i892];
                this.AudioAttributesImplApi26Parcelizer = i892 + 1;
                iArr442[i892] = iArr442[18];
                return 0;
            case 620:
                Object[] objArr317 = this.MediaBrowserCompatSearchResultReceiver;
                int i893 = this.AudioAttributesImplApi26Parcelizer;
                objArr317[i893] = objArr317[i893 - 1];
                objArr317[i893 + 1] = objArr317[16];
                this.AudioAttributesImplApi26Parcelizer = i893 + 3;
                objArr317[i893 + 2] = objArr317[i893 + 1];
                return 0;
            case 621:
                int i894 = this.AudioAttributesImplApi26Parcelizer;
                int i895 = i894 - 1;
                Object[] objArr318 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj301 = objArr318[i895];
                objArr318[i895] = null;
                objArr318[112] = obj301;
                objArr318[i895] = obj301;
                int[] iArr443 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i894 + 1;
                iArr443[i894] = 3;
                return 0;
            case 622:
                Object[] objArr319 = this.MediaBrowserCompatSearchResultReceiver;
                int i896 = this.AudioAttributesImplApi26Parcelizer;
                objArr319[i896] = objArr319[106];
                objArr319[i896] = null;
                this.AudioAttributesImplApi26Parcelizer = i896 + 1;
                objArr319[i896] = objArr319[106];
                return 0;
            case 623:
                int[] iArr444 = this.MediaMetadataCompat;
                int i897 = this.AudioAttributesImplApi26Parcelizer;
                iArr444[i897] = iArr444[107];
                Object[] objArr320 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj302 = objArr320[i897 - 1];
                objArr320[i897 - 1] = null;
                objArr320[i897] = obj302;
                iArr444[i897 - 1] = iArr444[i897];
                this.AudioAttributesImplApi26Parcelizer = i897 + 2;
                iArr444[i897 + 1] = 2;
                return 0;
            case 624:
                Object[] objArr321 = this.MediaBrowserCompatSearchResultReceiver;
                int i898 = this.AudioAttributesImplApi26Parcelizer;
                objArr321[i898] = objArr321[106];
                int[] iArr445 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i898 + 2;
                iArr445[i898 + 1] = iArr445[108];
                return 0;
            case 625:
                Object[] objArr322 = this.MediaBrowserCompatSearchResultReceiver;
                int i899 = this.AudioAttributesImplApi26Parcelizer;
                Object obj303 = objArr322[i899 - 2];
                objArr322[i899 - 2] = null;
                objArr322[i899 - 1] = obj303;
                int[] iArr446 = this.MediaMetadataCompat;
                iArr446[i899 - 2] = iArr446[i899 - 1];
                int i900 = i899 - 3;
                this.AudioAttributesImplApi26Parcelizer = i900;
                Object obj304 = objArr322[i900];
                objArr322[i900] = null;
                int i901 = iArr446[i899 - 2];
                Object obj305 = objArr322[i899 - 1];
                objArr322[i899 - 1] = null;
                ((Object[]) obj304)[i901] = obj305;
                this.AudioAttributesImplApi26Parcelizer = i899 - 2;
                objArr322[i900] = objArr322[106];
                return 0;
            case 626:
                int[] iArr447 = this.MediaMetadataCompat;
                int i902 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i902 + 1;
                iArr447[i902] = iArr447[109];
                return 0;
            case 627:
                int i903 = this.AudioAttributesImplApi26Parcelizer;
                int i904 = i903 - 1;
                Object[] objArr323 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj306 = objArr323[i904];
                objArr323[i904] = null;
                objArr323[16] = obj306;
                int[] iArr448 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i903;
                iArr448[i904] = 4;
                return 0;
            case 628:
                int i905 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr449 = this.MediaMetadataCompat;
                iArr449[105] = iArr449[i905 - 1];
                iArr449[104] = iArr449[i905 - 2];
                int i906 = i905 - 3;
                this.AudioAttributesImplApi26Parcelizer = i906;
                Object[] objArr324 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj307 = objArr324[i906];
                objArr324[i906] = null;
                objArr324[103] = obj307;
                return 0;
            case 629:
                int[] iArr450 = this.MediaMetadataCompat;
                int i907 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i907 + 1;
                iArr450[i907] = iArr450[107];
                Object[] objArr325 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj308 = objArr325[i907 - 1];
                objArr325[i907 - 1] = null;
                objArr325[i907] = obj308;
                iArr450[i907 - 1] = iArr450[i907];
                return 0;
            case 630:
                Object[] objArr326 = this.MediaBrowserCompatSearchResultReceiver;
                int i908 = this.AudioAttributesImplApi26Parcelizer;
                Object obj309 = objArr326[i908 - 2];
                objArr326[i908 - 2] = null;
                objArr326[i908 - 1] = obj309;
                int[] iArr451 = this.MediaMetadataCompat;
                iArr451[i908 - 2] = iArr451[i908 - 1];
                iArr451[i908] = 0;
                this.AudioAttributesImplApi26Parcelizer = i908;
                Object obj310 = objArr326[i908 - 1];
                objArr326[i908 - 1] = null;
                objArr326[i908 - 1] = ((Object[]) obj310)[iArr451[i908]];
                return 0;
            case 631:
                int i909 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr452 = this.MediaMetadataCompat;
                iArr452[105] = iArr452[i909 - 1];
                int i910 = i909 - 2;
                this.AudioAttributesImplApi26Parcelizer = i910;
                iArr452[104] = iArr452[i910];
                return 0;
            case 632:
                int i911 = this.AudioAttributesImplApi26Parcelizer;
                int i912 = i911 - 1;
                Object[] objArr327 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj311 = objArr327[i912];
                objArr327[i912] = null;
                objArr327[103] = obj311;
                int i913 = i911 - 2;
                Object obj312 = objArr327[i913];
                objArr327[i913] = null;
                objArr327[102] = obj312;
                this.AudioAttributesImplApi26Parcelizer = i911 - 1;
                objArr327[i913] = obj312;
                return 0;
            case 633:
                Object[] objArr328 = this.MediaBrowserCompatSearchResultReceiver;
                int i914 = this.AudioAttributesImplApi26Parcelizer;
                objArr328[i914] = objArr328[106];
                this.AudioAttributesImplApi26Parcelizer = i914 + 2;
                objArr328[i914 + 1] = objArr328[109];
                return 0;
            case 634:
                int i915 = this.AudioAttributesImplApi26Parcelizer;
                int i916 = i915 - 3;
                this.AudioAttributesImplApi26Parcelizer = i916;
                Object[] objArr329 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj313 = objArr329[i916];
                objArr329[i916] = null;
                int[] iArr453 = this.MediaMetadataCompat;
                ((int[]) obj313)[iArr453[i915 - 2]] = iArr453[i915 - 1];
                int i917 = i915 - 4;
                this.AudioAttributesImplApi26Parcelizer = i917;
                Object obj314 = objArr329[i917];
                objArr329[i917] = null;
                objArr329[16] = obj314;
                return 0;
            case 635:
                int i918 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i918;
                Object[] objArr330 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj315 = objArr330[i918];
                objArr330[i918] = null;
                objArr330[19] = obj315;
                return 0;
            case 636:
                Object[] objArr331 = this.MediaBrowserCompatSearchResultReceiver;
                int i919 = this.AudioAttributesImplApi26Parcelizer;
                objArr331[i919] = objArr331[16];
                this.AudioAttributesImplApi26Parcelizer = i919;
                Object obj316 = objArr331[i919];
                objArr331[i919] = null;
                objArr331[112] = obj316;
                return 0;
            case 637:
                Object[] objArr332 = this.MediaBrowserCompatSearchResultReceiver;
                int i920 = this.AudioAttributesImplApi26Parcelizer;
                objArr332[i920] = objArr332[i920 - 1];
                this.AudioAttributesImplApi26Parcelizer = i920;
                Object obj317 = objArr332[i920];
                objArr332[i920] = null;
                objArr332[21] = obj317;
                return 0;
            case 638:
                int i921 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i921;
                int[] iArr454 = this.MediaMetadataCompat;
                iArr454[20] = iArr454[i921];
                return 0;
            case 639:
                int[] iArr455 = this.MediaMetadataCompat;
                int i922 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i922 + 1;
                iArr455[i922] = iArr455[20];
                return 0;
            case 640:
                Object[] objArr333 = this.MediaBrowserCompatSearchResultReceiver;
                int i923 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i923 + 1;
                objArr333[i923] = objArr333[21];
                int[] iArr456 = this.MediaMetadataCompat;
                Object obj318 = objArr333[i923];
                objArr333[i923] = null;
                iArr456[i923] = ((Object[]) obj318).length;
                return 0;
            case 641:
                Object[] objArr334 = this.MediaBrowserCompatSearchResultReceiver;
                int i924 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i924 + 1;
                objArr334[i924] = objArr334[19];
                return 0;
            case 642:
                int i925 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i925;
                this.MediaBrowserCompatSearchResultReceiver[i925] = null;
                int[] iArr457 = this.MediaMetadataCompat;
                iArr457[20] = iArr457[20] + 1;
                return 0;
            case 643:
                Object[] objArr335 = this.MediaBrowserCompatSearchResultReceiver;
                int i926 = this.AudioAttributesImplApi26Parcelizer;
                objArr335[i926] = null;
                this.AudioAttributesImplApi26Parcelizer = i926;
                Object obj319 = objArr335[i926];
                objArr335[i926] = null;
                objArr335[20] = obj319;
                return 0;
            case 644:
                int[] iArr458 = this.MediaMetadataCompat;
                int i927 = this.AudioAttributesImplApi26Parcelizer;
                iArr458[i927] = iArr458[18];
                iArr458[i927 + 1] = iArr458[17];
                int i928 = i927 + 1;
                this.AudioAttributesImplApi26Parcelizer = i928;
                iArr458[i927] = iArr458[i927] ^ iArr458[i928];
                return 0;
            case 645:
                int i929 = this.AudioAttributesImplApi26Parcelizer;
                int i930 = i929 - 1;
                this.AudioAttributesImplApi26Parcelizer = i930;
                long[] jArr44 = this.RatingCompat;
                jArr44[i929 - 2] = jArr44[i930] ^ jArr44[i929 - 2];
                return 0;
            case 646:
                Object[] objArr336 = this.MediaBrowserCompatSearchResultReceiver;
                int i931 = this.AudioAttributesImplApi26Parcelizer;
                Object obj320 = objArr336[i931 - 1];
                objArr336[i931 - 1] = null;
                objArr336[i931] = obj320;
                Object obj321 = objArr336[i931 - 2];
                objArr336[i931 - 2] = null;
                objArr336[i931 - 1] = obj321;
                objArr336[i931 - 2] = obj320;
                Object obj322 = objArr336[i931];
                objArr336[i931] = null;
                Object obj323 = objArr336[i931 - 1];
                objArr336[i931 - 1] = null;
                objArr336[i931] = obj323;
                objArr336[i931 - 1] = obj322;
                int[] iArr459 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i931 + 2;
                iArr459[i931 + 1] = 1;
                return 0;
            case 647:
                Object[] objArr337 = this.MediaBrowserCompatSearchResultReceiver;
                int i932 = this.AudioAttributesImplApi26Parcelizer;
                objArr337[i932] = objArr337[16];
                this.AudioAttributesImplApi26Parcelizer = i932 + 2;
                objArr337[i932 + 1] = objArr337[i932];
                return 0;
            case 648:
                int[] iArr460 = this.MediaMetadataCompat;
                int i933 = this.AudioAttributesImplApi26Parcelizer;
                iArr460[i933] = iArr460[108];
                Object[] objArr338 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj324 = objArr338[i933 - 1];
                objArr338[i933 - 1] = null;
                objArr338[i933] = obj324;
                iArr460[i933 - 1] = iArr460[i933];
                this.AudioAttributesImplApi26Parcelizer = i933 + 2;
                iArr460[i933 + 1] = 0;
                return 0;
            case 649:
                int[] iArr461 = this.MediaMetadataCompat;
                int i934 = this.AudioAttributesImplApi26Parcelizer;
                iArr461[i934] = iArr461[17];
                this.AudioAttributesImplApi26Parcelizer = i934 + 2;
                iArr461[i934 + 1] = iArr461[18];
                return 0;
            case 650:
                int i935 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr45 = this.RatingCompat;
                jArr45[i935 - 2] = jArr45[i935 - 2] | jArr45[i935 - 1];
                int i936 = i935 - 2;
                this.AudioAttributesImplApi26Parcelizer = i936;
                jArr45[34] = jArr45[i936];
                return 0;
            case 651:
                long[] jArr46 = this.RatingCompat;
                int i937 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i937 + 1;
                jArr46[i937] = jArr46[34];
                return 0;
            case 652:
                Object[] objArr339 = this.MediaBrowserCompatSearchResultReceiver;
                int i938 = this.AudioAttributesImplApi26Parcelizer;
                objArr339[i938] = objArr339[16];
                objArr339[i938 + 1] = objArr339[i938];
                int i939 = i938 + 1;
                this.AudioAttributesImplApi26Parcelizer = i939;
                Object obj325 = objArr339[i939];
                objArr339[i939] = null;
                objArr339[112] = obj325;
                return 0;
            case 653:
                Object[] objArr340 = this.MediaBrowserCompatSearchResultReceiver;
                int i940 = this.AudioAttributesImplApi26Parcelizer;
                objArr340[i940] = objArr340[102];
                objArr340[i940 + 1] = objArr340[103];
                int[] iArr462 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i940 + 3;
                iArr462[i940 + 2] = 2;
                return 0;
            case 654:
                int i941 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr463 = this.MediaMetadataCompat;
                iArr463[111] = iArr463[i941 - 1];
                iArr463[110] = iArr463[i941 - 2];
                int i942 = i941 - 3;
                this.AudioAttributesImplApi26Parcelizer = i942;
                Object[] objArr341 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj326 = objArr341[i942];
                objArr341[i942] = null;
                objArr341[109] = obj326;
                return 0;
            case 655:
                int[] iArr464 = this.MediaMetadataCompat;
                int i943 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i943 + 1;
                iArr464[i943] = iArr464[110];
                return 0;
            case 656:
                int[] iArr465 = this.MediaMetadataCompat;
                int i944 = this.AudioAttributesImplApi26Parcelizer;
                iArr465[i944] = iArr465[i944 - 1];
                iArr465[i944 + 1] = iArr465[17];
                this.AudioAttributesImplApi26Parcelizer = i944 + 3;
                iArr465[i944 + 2] = 1;
                return 0;
            case 657:
                int i945 = this.AudioAttributesImplApi26Parcelizer;
                int i946 = i945 - 1;
                this.AudioAttributesImplApi26Parcelizer = i946;
                int[] iArr466 = this.MediaMetadataCompat;
                iArr466[i945 - 2] = iArr466[i945 - 2] % iArr466[i946];
                int i947 = i945 - 2;
                this.AudioAttributesImplApi26Parcelizer = i947;
                iArr466[i945 - 3] = iArr466[i945 - 3] / iArr466[i947];
                return 0;
            case 658:
                int i948 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i948;
                int[] iArr467 = this.MediaMetadataCompat;
                iArr467[111] = iArr467[i948];
                return 0;
            case 659:
                int i949 = this.AudioAttributesImplApi26Parcelizer;
                int i950 = i949 - 3;
                this.AudioAttributesImplApi26Parcelizer = i950;
                Object[] objArr342 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj327 = objArr342[i950];
                objArr342[i950] = null;
                int i951 = this.MediaMetadataCompat[i949 - 2];
                Object obj328 = objArr342[i949 - 1];
                objArr342[i949 - 1] = null;
                ((Object[]) obj327)[i951] = obj328;
                this.AudioAttributesImplApi26Parcelizer = i949 - 2;
                objArr342[i950] = objArr342[106];
                return 0;
            case 660:
                int i952 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i952;
                long[] jArr47 = this.RatingCompat;
                jArr47[36] = jArr47[i952];
                return 0;
            case 661:
                int i953 = this.AudioAttributesImplApi26Parcelizer;
                int i954 = i953 - 1;
                long[] jArr48 = this.RatingCompat;
                jArr48[38] = jArr48[i954];
                jArr48[i954] = jArr48[36];
                this.AudioAttributesImplApi26Parcelizer = i953 + 1;
                jArr48[i953] = jArr48[38];
                return 0;
            case 662:
                int i955 = this.AudioAttributesImplApi26Parcelizer;
                int i956 = i955 - 1;
                Object[] objArr343 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj329 = objArr343[i956];
                objArr343[i956] = null;
                objArr343[17] = obj329;
                int[] iArr468 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i955;
                iArr468[i956] = 4;
                return 0;
            case 663:
                Object[] objArr344 = this.MediaBrowserCompatSearchResultReceiver;
                int i957 = this.AudioAttributesImplApi26Parcelizer;
                objArr344[i957] = objArr344[103];
                int[] iArr469 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i957 + 2;
                iArr469[i957 + 1] = 0;
                return 0;
            case 664:
                int i958 = this.AudioAttributesImplApi26Parcelizer;
                int i959 = i958 - 3;
                this.AudioAttributesImplApi26Parcelizer = i959;
                Object[] objArr345 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj330 = objArr345[i959];
                objArr345[i959] = null;
                int[] iArr470 = this.MediaMetadataCompat;
                ((int[]) obj330)[iArr470[i958 - 2]] = iArr470[i958 - 1];
                int i960 = i958 - 4;
                this.AudioAttributesImplApi26Parcelizer = i960;
                Object obj331 = objArr345[i960];
                objArr345[i960] = null;
                objArr345[17] = obj331;
                return 0;
            case 665:
                int i961 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i961;
                Object[] objArr346 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj332 = objArr346[i961];
                objArr346[i961] = null;
                objArr346[18] = obj332;
                return 0;
            case 666:
                Object[] objArr347 = this.MediaBrowserCompatSearchResultReceiver;
                int i962 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i962 + 1;
                objArr347[i962] = objArr347[18];
                return 0;
            case 667:
                Object[] objArr348 = this.MediaBrowserCompatSearchResultReceiver;
                int i963 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i963 + 1;
                objArr348[i963] = objArr348[130];
                return 0;
            case 668:
                int i964 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i964;
                int[] iArr471 = this.MediaMetadataCompat;
                iArr471[17] = iArr471[i964];
                return 0;
            case 669:
                int i965 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i965;
                Object[] objArr349 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj333 = objArr349[i965];
                objArr349[i965] = null;
                objArr349[17] = obj333;
                return 0;
            case 670:
                Object[] objArr350 = this.MediaBrowserCompatSearchResultReceiver;
                int i966 = this.AudioAttributesImplApi26Parcelizer;
                objArr350[i966] = objArr350[17];
                this.AudioAttributesImplApi26Parcelizer = i966;
                Object obj334 = objArr350[i966];
                objArr350[i966] = null;
                objArr350[112] = obj334;
                return 0;
            case 671:
                int i967 = this.AudioAttributesImplApi26Parcelizer;
                int i968 = i967 - 1;
                this.AudioAttributesImplApi26Parcelizer = i968;
                int[] iArr472 = this.MediaMetadataCompat;
                Object[] objArr351 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj335 = objArr351[i967 - 2];
                objArr351[i967 - 2] = null;
                iArr472[i967 - 2] = ((int[]) obj335)[iArr472[i968]];
                int i969 = i967 - 2;
                iArr472[19] = iArr472[i969];
                this.AudioAttributesImplApi26Parcelizer = i967 - 1;
                objArr351[i969] = objArr351[17];
                return 0;
            case 672:
                Object[] objArr352 = this.MediaBrowserCompatSearchResultReceiver;
                int i970 = this.AudioAttributesImplApi26Parcelizer;
                objArr352[i970] = objArr352[112];
                int[] iArr473 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i970 + 2;
                iArr473[i970 + 1] = 2;
                return 0;
            case 673:
                int i971 = this.AudioAttributesImplApi26Parcelizer;
                int i972 = i971 - 1;
                int[] iArr474 = this.MediaMetadataCompat;
                iArr474[18] = iArr474[i972];
                this.AudioAttributesImplApi26Parcelizer = i971;
                iArr474[i972] = iArr474[19];
                return 0;
            case 674:
                Object[] objArr353 = this.MediaBrowserCompatSearchResultReceiver;
                int i973 = this.AudioAttributesImplApi26Parcelizer;
                objArr353[i973] = objArr353[i973 - 1];
                int[] iArr475 = this.MediaMetadataCompat;
                iArr475[i973 + 1] = 0;
                this.AudioAttributesImplApi26Parcelizer = i973 + 3;
                iArr475[i973 + 2] = 1;
                return 0;
            case 675:
                Object[] objArr354 = this.MediaBrowserCompatSearchResultReceiver;
                int i974 = this.AudioAttributesImplApi26Parcelizer;
                objArr354[i974] = objArr354[i974 - 1];
                objArr354[i974] = null;
                this.AudioAttributesImplApi26Parcelizer = i974 + 1;
                objArr354[i974] = objArr354[i974 - 1];
                return 0;
            case 676:
                int[] iArr476 = this.MediaMetadataCompat;
                int i975 = this.AudioAttributesImplApi26Parcelizer;
                iArr476[i975] = iArr476[109];
                this.AudioAttributesImplApi26Parcelizer = i975 + 2;
                iArr476[i975 + 1] = iArr476[108];
                return 0;
            case 677:
                int i976 = this.AudioAttributesImplApi26Parcelizer;
                int i977 = i976 - 3;
                this.AudioAttributesImplApi26Parcelizer = i977;
                Object[] objArr355 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj336 = objArr355[i977];
                objArr355[i977] = null;
                int[] iArr477 = this.MediaMetadataCompat;
                ((int[]) obj336)[iArr477[i976 - 2]] = iArr477[i976 - 1];
                int i978 = i976 - 4;
                Object obj337 = objArr355[i978];
                objArr355[i978] = null;
                objArr355[17] = obj337;
                this.AudioAttributesImplApi26Parcelizer = i976 - 3;
                iArr477[i978] = 4;
                return 0;
            case 678:
                Object[] objArr356 = this.MediaBrowserCompatSearchResultReceiver;
                int i979 = this.AudioAttributesImplApi26Parcelizer;
                objArr356[i979] = objArr356[i979 - 1];
                this.AudioAttributesImplApi26Parcelizer = i979 + 2;
                objArr356[i979 + 1] = objArr356[17];
                return 0;
            case 679:
                int i980 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr478 = this.MediaMetadataCompat;
                iArr478[107] = iArr478[i980 - 1];
                int i981 = i980 - 2;
                this.AudioAttributesImplApi26Parcelizer = i981;
                Object[] objArr357 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj338 = objArr357[i981];
                objArr357[i981] = null;
                objArr357[106] = obj338;
                return 0;
            case 680:
                int[] iArr479 = this.MediaMetadataCompat;
                int i982 = this.AudioAttributesImplApi26Parcelizer;
                int i983 = iArr479[i982 - 1];
                iArr479[i982 - 1] = iArr479[i982 - 2];
                iArr479[i982 - 2] = i983;
                int i984 = i982 - 3;
                this.AudioAttributesImplApi26Parcelizer = i984;
                Object[] objArr358 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj339 = objArr358[i984];
                objArr358[i984] = null;
                ((int[]) obj339)[iArr479[i982 - 2]] = iArr479[i982 - 1];
                int i985 = i982 - 4;
                this.AudioAttributesImplApi26Parcelizer = i985;
                Object obj340 = objArr358[i985];
                objArr358[i985] = null;
                objArr358[17] = obj340;
                return 0;
            case 681:
                int i986 = this.AudioAttributesImplApi26Parcelizer;
                int i987 = i986 - 1;
                Object[] objArr359 = this.MediaBrowserCompatSearchResultReceiver;
                objArr359[i987] = null;
                objArr359[i987] = objArr359[i986 - 2];
                this.AudioAttributesImplApi26Parcelizer = i986 + 1;
                objArr359[i986] = objArr359[17];
                return 0;
            case 682:
                int i988 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr480 = this.MediaMetadataCompat;
                iArr480[108] = iArr480[i988 - 1];
                iArr480[107] = iArr480[i988 - 2];
                int i989 = i988 - 3;
                this.AudioAttributesImplApi26Parcelizer = i989;
                Object[] objArr360 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj341 = objArr360[i989];
                objArr360[i989] = null;
                objArr360[106] = obj341;
                return 0;
            case 683:
                int[] iArr481 = this.MediaMetadataCompat;
                int i990 = this.AudioAttributesImplApi26Parcelizer;
                iArr481[i990] = iArr481[19];
                this.AudioAttributesImplApi26Parcelizer = i990 + 2;
                iArr481[i990 + 1] = iArr481[18];
                return 0;
            case 684:
                int i991 = this.AudioAttributesImplApi26Parcelizer;
                int i992 = i991 - 3;
                this.AudioAttributesImplApi26Parcelizer = i992;
                Object[] objArr361 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj342 = objArr361[i992];
                objArr361[i992] = null;
                int[] iArr482 = this.MediaMetadataCompat;
                ((int[]) obj342)[iArr482[i991 - 2]] = iArr482[i991 - 1];
                int i993 = i991 - 4;
                Object obj343 = objArr361[i993];
                objArr361[i993] = null;
                objArr361[17] = obj343;
                this.AudioAttributesImplApi26Parcelizer = i991 - 3;
                iArr482[i993] = iArr482[18];
                return 0;
            case 685:
                int[] iArr483 = this.MediaMetadataCompat;
                int i994 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i994 + 1;
                iArr483[i994] = iArr483[19];
                return 0;
            case 686:
                int i995 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr49 = this.RatingCompat;
                jArr49[i995 - 2] = jArr49[i995 - 2] | jArr49[i995 - 1];
                int i996 = i995 - 2;
                this.AudioAttributesImplApi26Parcelizer = i996;
                jArr49[40] = jArr49[i996];
                return 0;
            case 687:
                long[] jArr50 = this.RatingCompat;
                int i997 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i997 + 1;
                jArr50[i997] = jArr50[40];
                return 0;
            case 688:
                int i998 = this.AudioAttributesImplApi26Parcelizer;
                int i999 = i998 - 1;
                Object[] objArr362 = this.MediaBrowserCompatSearchResultReceiver;
                objArr362[i999] = null;
                this.AudioAttributesImplApi26Parcelizer = i998;
                objArr362[i999] = objArr362[17];
                return 0;
            case 689:
                int i1000 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1000;
                long[] jArr51 = this.RatingCompat;
                jArr51[43] = jArr51[i1000];
                return 0;
            case 690:
                int[] iArr484 = this.MediaMetadataCompat;
                int i1001 = this.AudioAttributesImplApi26Parcelizer;
                iArr484[i1001] = 52;
                this.AudioAttributesImplApi26Parcelizer = i1001;
                long[] jArr52 = this.RatingCompat;
                jArr52[i1001 - 1] = jArr52[i1001 - 1] >>> iArr484[i1001];
                return 0;
            case 691:
                int i1002 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1002;
                long[] jArr53 = this.RatingCompat;
                jArr53[45] = jArr53[i1002];
                return 0;
            case 692:
                long[] jArr54 = this.RatingCompat;
                int i1003 = this.AudioAttributesImplApi26Parcelizer;
                jArr54[i1003] = jArr54[43];
                this.AudioAttributesImplApi26Parcelizer = i1003 + 2;
                jArr54[i1003 + 1] = jArr54[45];
                return 0;
            case 693:
                int i1004 = this.AudioAttributesImplApi26Parcelizer;
                int i1005 = i1004 - 1;
                Object[] objArr363 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj344 = objArr363[i1005];
                objArr363[i1005] = null;
                objArr363[18] = obj344;
                int[] iArr485 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1004;
                iArr485[i1005] = 4;
                return 0;
            case 694:
                Object[] objArr364 = this.MediaBrowserCompatSearchResultReceiver;
                int i1006 = this.AudioAttributesImplApi26Parcelizer;
                objArr364[i1006] = objArr364[i1006 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1006 + 2;
                objArr364[i1006 + 1] = objArr364[18];
                return 0;
            case 695:
                int i1007 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr486 = this.MediaMetadataCompat;
                iArr486[89] = iArr486[i1007 - 1];
                int i1008 = i1007 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1008;
                iArr486[88] = iArr486[i1008];
                return 0;
            case 696:
                int i1009 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1009;
                Object[] objArr365 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj345 = objArr365[i1009];
                objArr365[i1009] = null;
                objArr365[87] = obj345;
                return 0;
            case 697:
                int i1010 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1010;
                Object[] objArr366 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj346 = objArr366[i1010];
                objArr366[i1010] = null;
                objArr366[86] = obj346;
                return 0;
            case 698:
                Object[] objArr367 = this.MediaBrowserCompatSearchResultReceiver;
                int i1011 = this.AudioAttributesImplApi26Parcelizer;
                objArr367[i1011] = objArr367[86];
                this.AudioAttributesImplApi26Parcelizer = i1011 + 2;
                objArr367[i1011 + 1] = objArr367[87];
                return 0;
            case 699:
                int i1012 = this.AudioAttributesImplApi26Parcelizer;
                int i1013 = i1012 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1013;
                int[] iArr487 = this.MediaMetadataCompat;
                Object[] objArr368 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj347 = objArr368[i1012 - 2];
                objArr368[i1012 - 2] = null;
                iArr487[i1012 - 2] = ((int[]) obj347)[iArr487[i1013]];
                objArr368[i1013] = objArr368[87];
                this.AudioAttributesImplApi26Parcelizer = i1012 + 1;
                iArr487[i1012] = 1;
                return 0;
            case 700:
                int[] iArr488 = this.MediaMetadataCompat;
                int i1014 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1014 + 1;
                iArr488[i1014] = iArr488[88];
                return 0;
            case 701:
                int[] iArr489 = this.MediaMetadataCompat;
                int i1015 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1015 + 1;
                iArr489[i1015] = iArr489[89];
                return 0;
            case 702:
                int i1016 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr490 = this.MediaMetadataCompat;
                iArr490[94] = iArr490[i1016 - 1];
                int i1017 = i1016 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1017;
                iArr490[93] = iArr490[i1017];
                return 0;
            case 703:
                int i1018 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr491 = this.MediaMetadataCompat;
                iArr491[92] = iArr491[i1018 - 1];
                int i1019 = i1018 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1019;
                iArr491[91] = iArr491[i1019];
                return 0;
            case 704:
                int i1020 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1020;
                Object[] objArr369 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj348 = objArr369[i1020];
                objArr369[i1020] = null;
                objArr369[90] = obj348;
                return 0;
            case 705:
                Object[] objArr370 = this.MediaBrowserCompatSearchResultReceiver;
                int i1021 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1021 + 1;
                objArr370[i1021] = objArr370[90];
                return 0;
            case 706:
                int[] iArr492 = this.MediaMetadataCompat;
                int i1022 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1022 + 1;
                iArr492[i1022] = iArr492[91];
                return 0;
            case 707:
                int[] iArr493 = this.MediaMetadataCompat;
                int i1023 = this.AudioAttributesImplApi26Parcelizer;
                iArr493[i1023] = iArr493[92];
                this.AudioAttributesImplApi26Parcelizer = i1023 + 2;
                iArr493[i1023 + 1] = iArr493[93];
                return 0;
            case 708:
                int[] iArr494 = this.MediaMetadataCompat;
                int i1024 = this.AudioAttributesImplApi26Parcelizer;
                iArr494[i1024] = iArr494[94];
                this.AudioAttributesImplApi26Parcelizer = i1024 + 2;
                iArr494[i1024 + 1] = 0;
                return 0;
            case 709:
                int i1025 = this.AudioAttributesImplApi26Parcelizer;
                int i1026 = i1025 - 1;
                Object[] objArr371 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj349 = objArr371[i1026];
                objArr371[i1026] = null;
                objArr371[100] = obj349;
                int[] iArr495 = this.MediaMetadataCompat;
                iArr495[99] = iArr495[i1025 - 2];
                int i1027 = i1025 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1027;
                iArr495[98] = iArr495[i1027];
                return 0;
            case 710:
                int i1028 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1028;
                int[] iArr496 = this.MediaMetadataCompat;
                iArr496[97] = iArr496[i1028];
                return 0;
            case 711:
                int i1029 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr497 = this.MediaMetadataCompat;
                iArr497[96] = iArr497[i1029 - 1];
                int i1030 = i1029 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1030;
                Object[] objArr372 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj350 = objArr372[i1030];
                objArr372[i1030] = null;
                objArr372[95] = obj350;
                return 0;
            case 712:
                Object[] objArr373 = this.MediaBrowserCompatSearchResultReceiver;
                int i1031 = this.AudioAttributesImplApi26Parcelizer;
                objArr373[i1031] = objArr373[95];
                this.AudioAttributesImplApi26Parcelizer = i1031;
                objArr373[i1031] = null;
                return 0;
            case 713:
                Object[] objArr374 = this.MediaBrowserCompatSearchResultReceiver;
                int i1032 = this.AudioAttributesImplApi26Parcelizer;
                objArr374[i1032] = objArr374[95];
                int[] iArr498 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1032 + 2;
                iArr498[i1032 + 1] = iArr498[96];
                return 0;
            case 714:
                Object[] objArr375 = this.MediaBrowserCompatSearchResultReceiver;
                int i1033 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1033 + 1;
                objArr375[i1033] = objArr375[95];
                return 0;
            case 715:
                int[] iArr499 = this.MediaMetadataCompat;
                int i1034 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1034 + 1;
                iArr499[i1034] = iArr499[97];
                return 0;
            case 716:
                int[] iArr500 = this.MediaMetadataCompat;
                int i1035 = this.AudioAttributesImplApi26Parcelizer;
                int i1036 = iArr500[i1035 - 1];
                iArr500[i1035 - 1] = iArr500[i1035 - 2];
                iArr500[i1035 - 2] = i1036;
                int i1037 = i1035 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1037;
                Object[] objArr376 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj351 = objArr376[i1037];
                objArr376[i1037] = null;
                ((int[]) obj351)[iArr500[i1035 - 2]] = iArr500[i1035 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1035 - 2;
                objArr376[i1037] = objArr376[95];
                return 0;
            case 717:
                Object[] objArr377 = this.MediaBrowserCompatSearchResultReceiver;
                int i1038 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1038 + 1;
                objArr377[i1038] = objArr377[100];
                return 0;
            case 718:
                int[] iArr501 = this.MediaMetadataCompat;
                int i1039 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1039 + 1;
                iArr501[i1039] = iArr501[98];
                return 0;
            case AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD /* 719 */:
                int[] iArr502 = this.MediaMetadataCompat;
                int i1040 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1040 + 1;
                iArr502[i1040] = iArr502[99];
                return 0;
            case 720:
                int i1041 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr503 = this.MediaMetadataCompat;
                iArr503[98] = iArr503[i1041 - 1];
                int i1042 = i1041 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1042;
                iArr503[97] = iArr503[i1042];
                return 0;
            case 721:
                int[] iArr504 = this.MediaMetadataCompat;
                int i1043 = this.AudioAttributesImplApi26Parcelizer;
                iArr504[i1043] = iArr504[97];
                this.AudioAttributesImplApi26Parcelizer = i1043;
                iArr504[i1043 - 1] = iArr504[i1043 - 1] + iArr504[i1043];
                return 0;
            case 722:
                Object[] objArr378 = this.MediaBrowserCompatSearchResultReceiver;
                int i1044 = this.AudioAttributesImplApi26Parcelizer;
                objArr378[i1044] = objArr378[i1044 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1044;
                Object obj352 = objArr378[i1044];
                objArr378[i1044] = null;
                objArr378[18] = obj352;
                return 0;
            case 723:
                Object[] objArr379 = this.MediaBrowserCompatSearchResultReceiver;
                int i1045 = this.AudioAttributesImplApi26Parcelizer;
                objArr379[i1045] = objArr379[18];
                this.AudioAttributesImplApi26Parcelizer = i1045;
                Object obj353 = objArr379[i1045];
                objArr379[i1045] = null;
                objArr379[101] = obj353;
                return 0;
            case 724:
                Object[] objArr380 = this.MediaBrowserCompatSearchResultReceiver;
                int i1046 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1046 + 1;
                objArr380[i1046] = objArr380[101];
                return 0;
            case 725:
                int i1047 = this.AudioAttributesImplApi26Parcelizer;
                int i1048 = i1047 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1048;
                int[] iArr505 = this.MediaMetadataCompat;
                Object[] objArr381 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj354 = objArr381[i1047 - 2];
                objArr381[i1047 - 2] = null;
                iArr505[i1047 - 2] = ((int[]) obj354)[iArr505[i1048]];
                int i1049 = i1047 - 2;
                iArr505[20] = iArr505[i1049];
                this.AudioAttributesImplApi26Parcelizer = i1047 - 1;
                objArr381[i1049] = objArr381[18];
                return 0;
            case 726:
                int i1050 = this.AudioAttributesImplApi26Parcelizer;
                int i1051 = i1050 - 1;
                Object[] objArr382 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj355 = objArr382[i1051];
                objArr382[i1051] = null;
                objArr382[101] = obj355;
                this.AudioAttributesImplApi26Parcelizer = i1050;
                objArr382[i1051] = obj355;
                return 0;
            case 727:
                int[] iArr506 = this.MediaMetadataCompat;
                int i1052 = this.AudioAttributesImplApi26Parcelizer;
                iArr506[i1052] = iArr506[i1052 - 1];
                iArr506[19] = iArr506[i1052];
                this.AudioAttributesImplApi26Parcelizer = i1052 + 1;
                iArr506[i1052] = iArr506[20];
                return 0;
            case 728:
                Object[] objArr383 = this.MediaBrowserCompatSearchResultReceiver;
                int i1053 = this.AudioAttributesImplApi26Parcelizer;
                objArr383[i1053] = objArr383[i1053 - 1];
                objArr383[i1053 + 1] = objArr383[18];
                this.AudioAttributesImplApi26Parcelizer = i1053 + 3;
                objArr383[i1053 + 2] = objArr383[i1053 + 1];
                return 0;
            case 729:
                int i1054 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr507 = this.MediaMetadataCompat;
                iArr507[89] = iArr507[i1054 - 1];
                iArr507[88] = iArr507[i1054 - 2];
                int i1055 = i1054 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1055;
                Object[] objArr384 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj356 = objArr384[i1055];
                objArr384[i1055] = null;
                objArr384[87] = obj356;
                return 0;
            case 730:
                Object[] objArr385 = this.MediaBrowserCompatSearchResultReceiver;
                int i1056 = this.AudioAttributesImplApi26Parcelizer;
                objArr385[i1056] = objArr385[86];
                objArr385[i1056 + 1] = objArr385[87];
                int[] iArr508 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1056 + 3;
                iArr508[i1056 + 2] = 0;
                return 0;
            case 731:
                Object[] objArr386 = this.MediaBrowserCompatSearchResultReceiver;
                int i1057 = this.AudioAttributesImplApi26Parcelizer;
                objArr386[i1057] = objArr386[87];
                int[] iArr509 = this.MediaMetadataCompat;
                iArr509[i1057 + 1] = 1;
                int i1058 = i1057 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1058;
                Object obj357 = objArr386[i1057];
                objArr386[i1057] = null;
                objArr386[i1057] = ((Object[]) obj357)[iArr509[i1058]];
                return 0;
            case 732:
                int[] iArr510 = this.MediaMetadataCompat;
                int i1059 = this.AudioAttributesImplApi26Parcelizer;
                iArr510[i1059] = iArr510[89];
                iArr510[94] = iArr510[i1059];
                int i1060 = i1059 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1060;
                iArr510[93] = iArr510[i1060];
                return 0;
            case 733:
                int i1061 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1061;
                int[] iArr511 = this.MediaMetadataCompat;
                iArr511[92] = iArr511[i1061];
                return 0;
            case 734:
                int i1062 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1062;
                int[] iArr512 = this.MediaMetadataCompat;
                iArr512[91] = iArr512[i1062];
                return 0;
            case 735:
                int i1063 = this.AudioAttributesImplApi26Parcelizer;
                int i1064 = i1063 - 1;
                Object[] objArr387 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj358 = objArr387[i1064];
                objArr387[i1064] = null;
                objArr387[90] = obj358;
                this.AudioAttributesImplApi26Parcelizer = i1063;
                objArr387[i1064] = obj358;
                return 0;
            case 736:
                int[] iArr513 = this.MediaMetadataCompat;
                int i1065 = this.AudioAttributesImplApi26Parcelizer;
                iArr513[i1065] = iArr513[91];
                this.AudioAttributesImplApi26Parcelizer = i1065 + 2;
                iArr513[i1065 + 1] = iArr513[92];
                return 0;
            case 737:
                int[] iArr514 = this.MediaMetadataCompat;
                int i1066 = this.AudioAttributesImplApi26Parcelizer;
                iArr514[i1066] = iArr514[93];
                iArr514[i1066 + 1] = iArr514[94];
                this.AudioAttributesImplApi26Parcelizer = i1066 + 3;
                iArr514[i1066 + 2] = 0;
                return 0;
            case 738:
                int i1067 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr515 = this.MediaMetadataCompat;
                iArr515[97] = iArr515[i1067 - 1];
                iArr515[96] = iArr515[i1067 - 2];
                int i1068 = i1067 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1068;
                Object[] objArr388 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj359 = objArr388[i1068];
                objArr388[i1068] = null;
                objArr388[95] = obj359;
                return 0;
            case 739:
                Object[] objArr389 = this.MediaBrowserCompatSearchResultReceiver;
                int i1069 = this.AudioAttributesImplApi26Parcelizer;
                objArr389[i1069] = objArr389[95];
                objArr389[i1069] = null;
                this.AudioAttributesImplApi26Parcelizer = i1069 + 1;
                objArr389[i1069] = objArr389[95];
                return 0;
            case 740:
                int[] iArr516 = this.MediaMetadataCompat;
                int i1070 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1070 + 1;
                iArr516[i1070] = iArr516[96];
                Object[] objArr390 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj360 = objArr390[i1070 - 1];
                objArr390[i1070 - 1] = null;
                objArr390[i1070] = obj360;
                iArr516[i1070 - 1] = iArr516[i1070];
                return 0;
            case 741:
                int[] iArr517 = this.MediaMetadataCompat;
                int i1071 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1071 + 1;
                iArr517[i1071] = iArr517[97];
                Object[] objArr391 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj361 = objArr391[i1071 - 1];
                objArr391[i1071 - 1] = null;
                objArr391[i1071] = obj361;
                iArr517[i1071 - 1] = iArr517[i1071];
                return 0;
            case 742:
                Object[] objArr392 = this.MediaBrowserCompatSearchResultReceiver;
                int i1072 = this.AudioAttributesImplApi26Parcelizer;
                objArr392[i1072] = objArr392[95];
                objArr392[i1072 + 1] = objArr392[100];
                int[] iArr518 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1072 + 3;
                iArr518[i1072 + 2] = 3;
                return 0;
            case 743:
                int i1073 = this.AudioAttributesImplApi26Parcelizer;
                int i1074 = i1073 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1074;
                Object[] objArr393 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj362 = objArr393[i1074];
                objArr393[i1074] = null;
                int[] iArr519 = this.MediaMetadataCompat;
                int i1075 = iArr519[i1073 - 2];
                Object obj363 = objArr393[i1073 - 1];
                objArr393[i1073 - 1] = null;
                ((Object[]) obj362)[i1075] = obj363;
                objArr393[i1074] = objArr393[95];
                this.AudioAttributesImplApi26Parcelizer = i1073 - 1;
                iArr519[i1073 - 2] = iArr519[98];
                return 0;
            case 744:
                int[] iArr520 = this.MediaMetadataCompat;
                int i1076 = this.AudioAttributesImplApi26Parcelizer;
                iArr520[i1076] = iArr520[98];
                iArr520[i1076 + 1] = iArr520[97];
                int i1077 = i1076 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1077;
                iArr520[i1076] = iArr520[i1076] + iArr520[i1077];
                return 0;
            case 745:
                int i1078 = this.AudioAttributesImplApi26Parcelizer;
                int i1079 = i1078 - 1;
                Object[] objArr394 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj364 = objArr394[i1079];
                objArr394[i1079] = null;
                objArr394[87] = obj364;
                int i1080 = i1078 - 2;
                Object obj365 = objArr394[i1080];
                objArr394[i1080] = null;
                objArr394[86] = obj365;
                this.AudioAttributesImplApi26Parcelizer = i1078 - 1;
                objArr394[i1080] = obj365;
                return 0;
            case 746:
                Object[] objArr395 = this.MediaBrowserCompatSearchResultReceiver;
                int i1081 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1081 + 1;
                objArr395[i1081] = objArr395[87];
                return 0;
            case 747:
                Object[] objArr396 = this.MediaBrowserCompatSearchResultReceiver;
                int i1082 = this.AudioAttributesImplApi26Parcelizer;
                objArr396[i1082] = objArr396[87];
                int[] iArr521 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1082 + 2;
                iArr521[i1082 + 1] = 1;
                return 0;
            case 748:
                int[] iArr522 = this.MediaMetadataCompat;
                int i1083 = this.AudioAttributesImplApi26Parcelizer;
                iArr522[i1083] = iArr522[88];
                this.AudioAttributesImplApi26Parcelizer = i1083 + 2;
                iArr522[i1083 + 1] = iArr522[89];
                return 0;
            case 749:
                int[] iArr523 = this.MediaMetadataCompat;
                int i1084 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1084 + 1;
                iArr523[i1084] = iArr523[92];
                return 0;
            case 750:
                int[] iArr524 = this.MediaMetadataCompat;
                int i1085 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1085 + 1;
                iArr524[i1085] = iArr524[93];
                return 0;
            case 751:
                int[] iArr525 = this.MediaMetadataCompat;
                int i1086 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1086 + 1;
                iArr525[i1086] = iArr525[94];
                return 0;
            case 752:
                int i1087 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr526 = this.MediaMetadataCompat;
                iArr526[97] = iArr526[i1087 - 1];
                int i1088 = i1087 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1088;
                iArr526[96] = iArr526[i1088];
                return 0;
            case 753:
                int i1089 = this.AudioAttributesImplApi26Parcelizer;
                int i1090 = i1089 - 1;
                Object[] objArr397 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj366 = objArr397[i1090];
                objArr397[i1090] = null;
                objArr397[95] = obj366;
                objArr397[i1090] = obj366;
                int i1091 = i1089 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1091;
                objArr397[i1091] = null;
                return 0;
            case 754:
                int[] iArr527 = this.MediaMetadataCompat;
                int i1092 = this.AudioAttributesImplApi26Parcelizer;
                iArr527[i1092] = iArr527[97];
                Object[] objArr398 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj367 = objArr398[i1092 - 1];
                objArr398[i1092 - 1] = null;
                objArr398[i1092] = obj367;
                iArr527[i1092 - 1] = iArr527[i1092];
                this.AudioAttributesImplApi26Parcelizer = i1092 + 2;
                iArr527[i1092 + 1] = 1;
                return 0;
            case 755:
                int i1093 = this.AudioAttributesImplApi26Parcelizer;
                int i1094 = i1093 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1094;
                Object[] objArr399 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj368 = objArr399[i1094];
                objArr399[i1094] = null;
                int[] iArr528 = this.MediaMetadataCompat;
                ((int[]) obj368)[iArr528[i1093 - 2]] = iArr528[i1093 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1093 - 2;
                objArr399[i1094] = objArr399[95];
                return 0;
            case 756:
                Object[] objArr400 = this.MediaBrowserCompatSearchResultReceiver;
                int i1095 = this.AudioAttributesImplApi26Parcelizer;
                objArr400[i1095] = objArr400[100];
                int[] iArr529 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1095 + 2;
                iArr529[i1095 + 1] = 3;
                return 0;
            case 757:
                int i1096 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr530 = this.MediaMetadataCompat;
                int i1097 = iArr530[i1096 - 1];
                iArr530[98] = i1097;
                int i1098 = i1096 - 2;
                iArr530[97] = iArr530[i1098];
                this.AudioAttributesImplApi26Parcelizer = i1096 - 1;
                iArr530[i1098] = i1097;
                return 0;
            case 758:
                int i1099 = this.AudioAttributesImplApi26Parcelizer;
                int i1100 = i1099 - 1;
                int[] iArr531 = this.MediaMetadataCompat;
                iArr531[i1099 - 2] = iArr531[i1099 - 2] ^ iArr531[i1100];
                Object[] objArr401 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj369 = objArr401[i1099 - 3];
                objArr401[i1099 - 3] = null;
                objArr401[i1099 - 2] = obj369;
                iArr531[i1099 - 3] = iArr531[i1099 - 2];
                this.AudioAttributesImplApi26Parcelizer = i1099;
                iArr531[i1100] = 2;
                return 0;
            case 759:
                int i1101 = this.AudioAttributesImplApi26Parcelizer;
                int i1102 = i1101 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1102;
                Object[] objArr402 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj370 = objArr402[i1102];
                objArr402[i1102] = null;
                int[] iArr532 = this.MediaMetadataCompat;
                ((int[]) obj370)[iArr532[i1101 - 2]] = iArr532[i1101 - 1];
                int i1103 = i1101 - 4;
                Object obj371 = objArr402[i1103];
                objArr402[i1103] = null;
                objArr402[18] = obj371;
                this.AudioAttributesImplApi26Parcelizer = i1101 - 3;
                iArr532[i1103] = 4;
                return 0;
            case 760:
                Object[] objArr403 = this.MediaBrowserCompatSearchResultReceiver;
                int i1104 = this.AudioAttributesImplApi26Parcelizer;
                objArr403[i1104] = objArr403[18];
                objArr403[i1104 + 1] = objArr403[i1104];
                int i1105 = i1104 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1105;
                Object obj372 = objArr403[i1105];
                objArr403[i1105] = null;
                objArr403[101] = obj372;
                return 0;
            case 761:
                Object[] objArr404 = this.MediaBrowserCompatSearchResultReceiver;
                int i1106 = this.AudioAttributesImplApi26Parcelizer;
                objArr404[i1106] = objArr404[101];
                int[] iArr533 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1106 + 2;
                iArr533[i1106 + 1] = 2;
                return 0;
            case 762:
                int i1107 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1107;
                int[] iArr534 = this.MediaMetadataCompat;
                iArr534[89] = iArr534[i1107];
                return 0;
            case 763:
                int i1108 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr535 = this.MediaMetadataCompat;
                iArr535[88] = iArr535[i1108 - 1];
                int i1109 = i1108 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1109;
                Object[] objArr405 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj373 = objArr405[i1109];
                objArr405[i1109] = null;
                objArr405[87] = obj373;
                return 0;
            case 764:
                int i1110 = this.AudioAttributesImplApi26Parcelizer;
                int i1111 = i1110 - 1;
                Object[] objArr406 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj374 = objArr406[i1111];
                objArr406[i1111] = null;
                objArr406[86] = obj374;
                objArr406[i1111] = obj374;
                this.AudioAttributesImplApi26Parcelizer = i1110 + 1;
                objArr406[i1110] = objArr406[87];
                return 0;
            case 765:
                int i1112 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr536 = this.MediaMetadataCompat;
                iArr536[92] = iArr536[i1112 - 1];
                iArr536[91] = iArr536[i1112 - 2];
                int i1113 = i1112 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1113;
                Object[] objArr407 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj375 = objArr407[i1113];
                objArr407[i1113] = null;
                objArr407[90] = obj375;
                return 0;
            case 766:
                Object[] objArr408 = this.MediaBrowserCompatSearchResultReceiver;
                int i1114 = this.AudioAttributesImplApi26Parcelizer;
                objArr408[i1114] = objArr408[90];
                int[] iArr537 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1114 + 2;
                iArr537[i1114 + 1] = iArr537[91];
                return 0;
            case 767:
                int i1115 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1115;
                Object[] objArr409 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj376 = objArr409[i1115];
                objArr409[i1115] = null;
                objArr409[100] = obj376;
                return 0;
            case 768:
                int i1116 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr538 = this.MediaMetadataCompat;
                iArr538[99] = iArr538[i1116 - 1];
                iArr538[98] = iArr538[i1116 - 2];
                int i1117 = i1116 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1117;
                iArr538[97] = iArr538[i1117];
                return 0;
            case 769:
                int i1118 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1118;
                int[] iArr539 = this.MediaMetadataCompat;
                iArr539[96] = iArr539[i1118];
                return 0;
            case 770:
                int i1119 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1119;
                Object[] objArr410 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj377 = objArr410[i1119];
                objArr410[i1119] = null;
                objArr410[95] = obj377;
                return 0;
            case 771:
                int i1120 = this.AudioAttributesImplApi26Parcelizer;
                int i1121 = i1120 - 1;
                Object[] objArr411 = this.MediaBrowserCompatSearchResultReceiver;
                objArr411[i1121] = null;
                objArr411[i1121] = objArr411[95];
                int[] iArr540 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1120 + 1;
                iArr540[i1120] = iArr540[96];
                return 0;
            case 772:
                Object[] objArr412 = this.MediaBrowserCompatSearchResultReceiver;
                int i1122 = this.AudioAttributesImplApi26Parcelizer;
                objArr412[i1122] = objArr412[100];
                int[] iArr541 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1122 + 2;
                iArr541[i1122 + 1] = 3;
                Object obj378 = objArr412[i1122];
                objArr412[i1122] = null;
                objArr412[i1122 + 1] = obj378;
                iArr541[i1122] = iArr541[i1122 + 1];
                return 0;
            case 773:
                Object[] objArr413 = this.MediaBrowserCompatSearchResultReceiver;
                int i1123 = this.AudioAttributesImplApi26Parcelizer;
                objArr413[i1123] = objArr413[95];
                int[] iArr542 = this.MediaMetadataCompat;
                iArr542[i1123 + 1] = iArr542[98];
                this.AudioAttributesImplApi26Parcelizer = i1123 + 3;
                iArr542[i1123 + 2] = iArr542[99];
                return 0;
            case 774:
                int i1124 = this.AudioAttributesImplApi26Parcelizer;
                int i1125 = i1124 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1125;
                Object[] objArr414 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj379 = objArr414[i1125];
                objArr414[i1125] = null;
                int[] iArr543 = this.MediaMetadataCompat;
                ((int[]) obj379)[iArr543[i1124 - 2]] = iArr543[i1124 - 1];
                int i1126 = i1124 - 4;
                this.AudioAttributesImplApi26Parcelizer = i1126;
                Object obj380 = objArr414[i1126];
                objArr414[i1126] = null;
                objArr414[18] = obj380;
                return 0;
            case 775:
                int i1127 = this.AudioAttributesImplApi26Parcelizer;
                int i1128 = i1127 - 1;
                Object[] objArr415 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj381 = objArr415[i1128];
                objArr415[i1128] = null;
                objArr415[12] = obj381;
                objArr415[i1128] = objArr415[18];
                int i1129 = i1127 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1129;
                Object obj382 = objArr415[i1129];
                objArr415[i1129] = null;
                objArr415[101] = obj382;
                return 0;
            case 776:
                Object[] objArr416 = this.MediaBrowserCompatSearchResultReceiver;
                int i1130 = this.AudioAttributesImplApi26Parcelizer;
                objArr416[i1130] = objArr416[101];
                int[] iArr544 = this.MediaMetadataCompat;
                iArr544[i1130 + 1] = 3;
                int i1131 = i1130 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1131;
                Object obj383 = objArr416[i1130];
                objArr416[i1130] = null;
                objArr416[i1130] = ((Object[]) obj383)[iArr544[i1131]];
                return 0;
            case 777:
                int[] iArr545 = this.MediaMetadataCompat;
                int i1132 = this.AudioAttributesImplApi26Parcelizer;
                iArr545[i1132] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1132;
                iArr545[13] = iArr545[i1132];
                return 0;
            case 778:
                Object[] objArr417 = this.MediaBrowserCompatSearchResultReceiver;
                int i1133 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1133 + 1;
                objArr417[i1133] = objArr417[14];
                int[] iArr546 = this.MediaMetadataCompat;
                Object obj384 = objArr417[i1133];
                objArr417[i1133] = null;
                iArr546[i1133] = ((Object[]) obj384).length;
                return 0;
            case 779:
                Object[] objArr418 = this.MediaBrowserCompatSearchResultReceiver;
                int i1134 = this.AudioAttributesImplApi26Parcelizer;
                objArr418[i1134] = objArr418[12];
                objArr418[i1134 + 1] = objArr418[14];
                int[] iArr547 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1134 + 3;
                iArr547[i1134 + 2] = iArr547[13];
                return 0;
            case 780:
                int[] iArr548 = this.MediaMetadataCompat;
                iArr548[13] = iArr548[13] + 1;
                return 0;
            case 781:
                int[] iArr549 = this.MediaMetadataCompat;
                int i1135 = this.AudioAttributesImplApi26Parcelizer;
                iArr549[i1135] = iArr549[19];
                this.AudioAttributesImplApi26Parcelizer = i1135;
                iArr549[i1135 - 1] = iArr549[i1135 - 1] ^ iArr549[i1135];
                this.RatingCompat[i1135 - 1] = iArr549[i1135 - 1];
                return 0;
            case 782:
                Object[] objArr419 = this.MediaBrowserCompatSearchResultReceiver;
                int i1136 = this.AudioAttributesImplApi26Parcelizer;
                Object obj385 = objArr419[i1136 - 1];
                objArr419[i1136 - 1] = null;
                Object obj386 = objArr419[i1136 - 2];
                objArr419[i1136 - 2] = null;
                objArr419[i1136 - 1] = obj386;
                objArr419[i1136 - 2] = obj385;
                this.AudioAttributesImplApi26Parcelizer = i1136 + 1;
                Object obj387 = objArr419[i1136 - 1];
                objArr419[i1136 - 1] = null;
                objArr419[i1136] = obj387;
                Object obj388 = objArr419[i1136 - 2];
                objArr419[i1136 - 2] = null;
                objArr419[i1136 - 1] = obj388;
                objArr419[i1136 - 2] = obj387;
                Object obj389 = objArr419[i1136];
                objArr419[i1136] = null;
                Object obj390 = objArr419[i1136 - 1];
                objArr419[i1136 - 1] = null;
                objArr419[i1136] = obj390;
                objArr419[i1136 - 1] = obj389;
                return 0;
            case 783:
                Object[] objArr420 = this.MediaBrowserCompatSearchResultReceiver;
                int i1137 = this.AudioAttributesImplApi26Parcelizer;
                objArr420[i1137] = objArr420[i1137 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1137;
                Object obj391 = objArr420[i1137];
                objArr420[i1137] = null;
                objArr420[101] = obj391;
                return 0;
            case 784:
                int[] iArr550 = this.MediaMetadataCompat;
                int i1138 = this.AudioAttributesImplApi26Parcelizer;
                iArr550[i1138] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1138;
                iArr550[89] = iArr550[i1138];
                return 0;
            case 785:
                int i1139 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr551 = this.MediaMetadataCompat;
                iArr551[88] = iArr551[i1139 - 1];
                int i1140 = i1139 - 2;
                Object[] objArr421 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj392 = objArr421[i1140];
                objArr421[i1140] = null;
                objArr421[87] = obj392;
                int i1141 = i1139 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1141;
                Object obj393 = objArr421[i1141];
                objArr421[i1141] = null;
                objArr421[86] = obj393;
                return 0;
            case 786:
                int[] iArr552 = this.MediaMetadataCompat;
                int i1142 = this.AudioAttributesImplApi26Parcelizer;
                iArr552[i1142] = iArr552[88];
                iArr552[i1142 + 1] = iArr552[89];
                int i1143 = i1142 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1143;
                iArr552[94] = iArr552[i1143];
                return 0;
            case 787:
                int i1144 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1144;
                int[] iArr553 = this.MediaMetadataCompat;
                iArr553[93] = iArr553[i1144];
                return 0;
            case 788:
                int[] iArr554 = this.MediaMetadataCompat;
                int i1145 = this.AudioAttributesImplApi26Parcelizer;
                iArr554[i1145] = iArr554[93];
                this.AudioAttributesImplApi26Parcelizer = i1145 + 2;
                iArr554[i1145 + 1] = iArr554[94];
                return 0;
            case 789:
                int i1146 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1146;
                int[] iArr555 = this.MediaMetadataCompat;
                iArr555[99] = iArr555[i1146];
                return 0;
            case 790:
                int i1147 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1147;
                int[] iArr556 = this.MediaMetadataCompat;
                iArr556[98] = iArr556[i1147];
                return 0;
            case 791:
                int i1148 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr557 = this.MediaMetadataCompat;
                iArr557[96] = iArr557[i1148 - 1];
                int i1149 = i1148 - 2;
                Object[] objArr422 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj394 = objArr422[i1149];
                objArr422[i1149] = null;
                objArr422[95] = obj394;
                this.AudioAttributesImplApi26Parcelizer = i1148 - 1;
                objArr422[i1149] = obj394;
                return 0;
            case 792:
                Object[] objArr423 = this.MediaBrowserCompatSearchResultReceiver;
                int i1150 = this.AudioAttributesImplApi26Parcelizer;
                objArr423[i1150] = objArr423[95];
                int[] iArr558 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1150 + 2;
                iArr558[i1150 + 1] = iArr558[96];
                Object obj395 = objArr423[i1150];
                objArr423[i1150] = null;
                objArr423[i1150 + 1] = obj395;
                iArr558[i1150] = iArr558[i1150 + 1];
                return 0;
            case 793:
                Object[] objArr424 = this.MediaBrowserCompatSearchResultReceiver;
                int i1151 = this.AudioAttributesImplApi26Parcelizer;
                objArr424[i1151] = objArr424[95];
                int[] iArr559 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1151 + 2;
                iArr559[i1151 + 1] = iArr559[97];
                Object obj396 = objArr424[i1151];
                objArr424[i1151] = null;
                objArr424[i1151 + 1] = obj396;
                iArr559[i1151] = iArr559[i1151 + 1];
                return 0;
            case 794:
                int i1152 = this.AudioAttributesImplApi26Parcelizer;
                int i1153 = i1152 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1153;
                Object[] objArr425 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj397 = objArr425[i1153];
                objArr425[i1153] = null;
                int[] iArr560 = this.MediaMetadataCompat;
                ((int[]) obj397)[iArr560[i1152 - 2]] = iArr560[i1152 - 1];
                objArr425[i1153] = objArr425[95];
                this.AudioAttributesImplApi26Parcelizer = i1152 - 1;
                objArr425[i1152 - 2] = objArr425[100];
                return 0;
            case 795:
                int[] iArr561 = this.MediaMetadataCompat;
                int i1154 = this.AudioAttributesImplApi26Parcelizer;
                iArr561[i1154] = 3;
                Object[] objArr426 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj398 = objArr426[i1154 - 1];
                objArr426[i1154 - 1] = null;
                objArr426[i1154] = obj398;
                iArr561[i1154 - 1] = iArr561[i1154];
                int i1155 = i1154 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1155;
                Object obj399 = objArr426[i1155];
                objArr426[i1155] = null;
                int i1156 = iArr561[i1154 - 1];
                Object obj400 = objArr426[i1154];
                objArr426[i1154] = null;
                ((Object[]) obj399)[i1156] = obj400;
                return 0;
            case 796:
                int[] iArr562 = this.MediaMetadataCompat;
                int i1157 = this.AudioAttributesImplApi26Parcelizer;
                iArr562[i1157] = iArr562[98];
                this.AudioAttributesImplApi26Parcelizer = i1157 + 2;
                iArr562[i1157 + 1] = iArr562[99];
                return 0;
            case 797:
                int i1158 = this.AudioAttributesImplApi26Parcelizer;
                int i1159 = i1158 - 1;
                Object[] objArr427 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj401 = objArr427[i1159];
                objArr427[i1159] = null;
                objArr427[18] = obj401;
                int[] iArr563 = this.MediaMetadataCompat;
                iArr563[i1159] = iArr563[19];
                this.AudioAttributesImplApi26Parcelizer = i1158 + 1;
                iArr563[i1158] = iArr563[20];
                return 0;
            case 798:
                int i1160 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr55 = this.RatingCompat;
                jArr55[i1160 - 2] = jArr55[i1160 - 2] | jArr55[i1160 - 1];
                int i1161 = i1160 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1161;
                jArr55[53] = jArr55[i1161];
                return 0;
            case 799:
                long[] jArr56 = this.RatingCompat;
                int i1162 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1162 + 1;
                jArr56[i1162] = jArr56[53];
                return 0;
            case 800:
                int i1163 = this.AudioAttributesImplApi26Parcelizer;
                int i1164 = i1163 - 1;
                Object[] objArr428 = this.MediaBrowserCompatSearchResultReceiver;
                objArr428[i1164] = null;
                this.AudioAttributesImplApi26Parcelizer = i1163;
                objArr428[i1164] = objArr428[18];
                return 0;
            case 801:
                int[] iArr564 = this.MediaMetadataCompat;
                int i1165 = this.AudioAttributesImplApi26Parcelizer;
                iArr564[i1165] = 0;
                iArr564[89] = iArr564[i1165];
                int i1166 = i1165 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1166;
                iArr564[88] = iArr564[i1166];
                return 0;
            case 802:
                int i1167 = this.AudioAttributesImplApi26Parcelizer;
                int i1168 = i1167 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1168;
                int[] iArr565 = this.MediaMetadataCompat;
                Object[] objArr429 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj402 = objArr429[i1167 - 2];
                objArr429[i1167 - 2] = null;
                iArr565[i1167 - 2] = ((int[]) obj402)[iArr565[i1168]];
                iArr565[i1168] = iArr565[88];
                this.AudioAttributesImplApi26Parcelizer = i1167 + 1;
                iArr565[i1167] = iArr565[89];
                return 0;
            case 803:
                int i1169 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr566 = this.MediaMetadataCompat;
                iArr566[94] = iArr566[i1169 - 1];
                iArr566[93] = iArr566[i1169 - 2];
                int i1170 = i1169 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1170;
                iArr566[92] = iArr566[i1170];
                return 0;
            case 804:
                Object[] objArr430 = this.MediaBrowserCompatSearchResultReceiver;
                int i1171 = this.AudioAttributesImplApi26Parcelizer;
                objArr430[i1171] = objArr430[90];
                int[] iArr567 = this.MediaMetadataCompat;
                iArr567[i1171 + 1] = iArr567[91];
                this.AudioAttributesImplApi26Parcelizer = i1171 + 3;
                iArr567[i1171 + 2] = iArr567[92];
                return 0;
            case 805:
                int i1172 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr568 = this.MediaMetadataCompat;
                iArr568[99] = iArr568[i1172 - 1];
                int i1173 = i1172 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1173;
                iArr568[98] = iArr568[i1173];
                return 0;
            case 806:
                int[] iArr569 = this.MediaMetadataCompat;
                int i1174 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1174 + 1;
                iArr569[i1174] = iArr569[96];
                return 0;
            case 807:
                Object[] objArr431 = this.MediaBrowserCompatSearchResultReceiver;
                int i1175 = this.AudioAttributesImplApi26Parcelizer;
                objArr431[i1175] = objArr431[95];
                this.AudioAttributesImplApi26Parcelizer = i1175 + 2;
                objArr431[i1175 + 1] = objArr431[100];
                return 0;
            case 808:
                int i1176 = this.AudioAttributesImplApi26Parcelizer;
                int i1177 = i1176 - 1;
                int[] iArr570 = this.MediaMetadataCompat;
                iArr570[97] = iArr570[i1177];
                this.AudioAttributesImplApi26Parcelizer = i1176;
                iArr570[i1177] = iArr570[98];
                return 0;
            case 809:
                int i1178 = this.AudioAttributesImplApi26Parcelizer;
                int i1179 = i1178 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1179;
                Object[] objArr432 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj403 = objArr432[i1179];
                objArr432[i1179] = null;
                int[] iArr571 = this.MediaMetadataCompat;
                ((int[]) obj403)[iArr571[i1178 - 2]] = iArr571[i1178 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1178 - 2;
                iArr571[i1179] = iArr571[19];
                return 0;
            case 810:
                int i1180 = this.AudioAttributesImplApi26Parcelizer;
                int i1181 = i1180 - 1;
                long[] jArr57 = this.RatingCompat;
                jArr57[56] = jArr57[i1181];
                Object[] objArr433 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i1180;
                objArr433[i1181] = objArr433[127];
                return 0;
            case 811:
                int i1182 = this.AudioAttributesImplApi26Parcelizer;
                int i1183 = i1182 - 1;
                long[] jArr58 = this.RatingCompat;
                long j2 = jArr58[i1182 - 2];
                int[] iArr572 = this.MediaMetadataCompat;
                jArr58[i1182 - 2] = j2 << iArr572[i1183];
                this.AudioAttributesImplApi26Parcelizer = i1182;
                iArr572[i1183] = 52;
                return 0;
            case 812:
                int i1184 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1184;
                long[] jArr59 = this.RatingCompat;
                jArr59[58] = jArr59[i1184];
                return 0;
            case 813:
                long[] jArr60 = this.RatingCompat;
                int i1185 = this.AudioAttributesImplApi26Parcelizer;
                jArr60[i1185] = jArr60[56];
                jArr60[i1185 + 1] = jArr60[58];
                int i1186 = i1185 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1186;
                this.MediaMetadataCompat[i1185] = (jArr60[i1185] > jArr60[i1186] ? 1 : (jArr60[i1185] == jArr60[i1186] ? 0 : -1));
                return 0;
            case 814:
                int i1187 = this.AudioAttributesImplApi26Parcelizer;
                int i1188 = i1187 - 1;
                Object[] objArr434 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj404 = objArr434[i1188];
                objArr434[i1188] = null;
                objArr434[19] = obj404;
                int[] iArr573 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1187;
                iArr573[i1188] = 4;
                return 0;
            case 815:
                Object[] objArr435 = this.MediaBrowserCompatSearchResultReceiver;
                int i1189 = this.AudioAttributesImplApi26Parcelizer;
                objArr435[i1189] = objArr435[i1189 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1189 + 2;
                objArr435[i1189 + 1] = objArr435[19];
                return 0;
            case 816:
                int[] iArr574 = this.MediaMetadataCompat;
                int i1190 = this.AudioAttributesImplApi26Parcelizer;
                iArr574[i1190] = 0;
                iArr574[78] = iArr574[i1190];
                int i1191 = i1190 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1191;
                iArr574[77] = iArr574[i1191];
                return 0;
            case 817:
                int i1192 = this.AudioAttributesImplApi26Parcelizer;
                int i1193 = i1192 - 1;
                Object[] objArr436 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj405 = objArr436[i1193];
                objArr436[i1193] = null;
                objArr436[76] = obj405;
                int i1194 = i1192 - 2;
                Object obj406 = objArr436[i1194];
                objArr436[i1194] = null;
                objArr436[75] = obj406;
                this.AudioAttributesImplApi26Parcelizer = i1192 - 1;
                objArr436[i1194] = obj406;
                return 0;
            case 818:
                Object[] objArr437 = this.MediaBrowserCompatSearchResultReceiver;
                int i1195 = this.AudioAttributesImplApi26Parcelizer;
                objArr437[i1195] = objArr437[76];
                int[] iArr575 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1195 + 2;
                iArr575[i1195 + 1] = 1;
                return 0;
            case 819:
                Object[] objArr438 = this.MediaBrowserCompatSearchResultReceiver;
                int i1196 = this.AudioAttributesImplApi26Parcelizer;
                objArr438[i1196] = objArr438[76];
                int[] iArr576 = this.MediaMetadataCompat;
                iArr576[i1196 + 1] = 2;
                int i1197 = i1196 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1197;
                Object obj407 = objArr438[i1196];
                objArr438[i1196] = null;
                objArr438[i1196] = ((Object[]) obj407)[iArr576[i1197]];
                return 0;
            case 820:
                int[] iArr577 = this.MediaMetadataCompat;
                int i1198 = this.AudioAttributesImplApi26Parcelizer;
                iArr577[i1198] = iArr577[77];
                iArr577[i1198 + 1] = iArr577[78];
                Object[] objArr439 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i1198 + 3;
                objArr439[i1198 + 2] = objArr439[76];
                return 0;
            case 821:
                int i1199 = this.AudioAttributesImplApi26Parcelizer;
                int i1200 = i1199 - 1;
                Object[] objArr440 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj408 = objArr440[i1200];
                objArr440[i1200] = null;
                objArr440[84] = obj408;
                int i1201 = i1199 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1201;
                int[] iArr578 = this.MediaMetadataCompat;
                iArr578[83] = iArr578[i1201];
                return 0;
            case 822:
                int i1202 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr579 = this.MediaMetadataCompat;
                iArr579[82] = iArr579[i1202 - 1];
                int i1203 = i1202 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1203;
                iArr579[81] = iArr579[i1203];
                return 0;
            case 823:
                int i1204 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1204;
                int[] iArr580 = this.MediaMetadataCompat;
                iArr580[80] = iArr580[i1204];
                return 0;
            case 824:
                int i1205 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1205;
                Object[] objArr441 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj409 = objArr441[i1205];
                objArr441[i1205] = null;
                objArr441[79] = obj409;
                return 0;
            case 825:
                Object[] objArr442 = this.MediaBrowserCompatSearchResultReceiver;
                int i1206 = this.AudioAttributesImplApi26Parcelizer;
                objArr442[i1206] = objArr442[79];
                objArr442[i1206] = null;
                this.AudioAttributesImplApi26Parcelizer = i1206 + 1;
                objArr442[i1206] = objArr442[79];
                return 0;
            case 826:
                int[] iArr581 = this.MediaMetadataCompat;
                int i1207 = this.AudioAttributesImplApi26Parcelizer;
                iArr581[i1207] = iArr581[80];
                Object[] objArr443 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj410 = objArr443[i1207 - 1];
                objArr443[i1207 - 1] = null;
                objArr443[i1207] = obj410;
                iArr581[i1207 - 1] = iArr581[i1207];
                this.AudioAttributesImplApi26Parcelizer = i1207 + 2;
                iArr581[i1207 + 1] = 1;
                return 0;
            case 827:
                int i1208 = this.AudioAttributesImplApi26Parcelizer;
                int i1209 = i1208 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1209;
                Object[] objArr444 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj411 = objArr444[i1209];
                objArr444[i1209] = null;
                int[] iArr582 = this.MediaMetadataCompat;
                ((int[]) obj411)[iArr582[i1208 - 2]] = iArr582[i1208 - 1];
                objArr444[i1209] = objArr444[79];
                this.AudioAttributesImplApi26Parcelizer = i1208 - 1;
                iArr582[i1208 - 2] = iArr582[81];
                return 0;
            case 828:
                Object[] objArr445 = this.MediaBrowserCompatSearchResultReceiver;
                int i1210 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1210 + 1;
                objArr445[i1210] = objArr445[79];
                return 0;
            case 829:
                int[] iArr583 = this.MediaMetadataCompat;
                int i1211 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1211 + 1;
                iArr583[i1211] = iArr583[82];
                return 0;
            case 830:
                int[] iArr584 = this.MediaMetadataCompat;
                int i1212 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1212 + 1;
                iArr584[i1212] = iArr584[83];
                return 0;
            case 831:
                int i1213 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr585 = this.MediaMetadataCompat;
                int i1214 = iArr585[i1213 - 1];
                iArr585[82] = i1214;
                int i1215 = i1213 - 2;
                iArr585[81] = iArr585[i1215];
                this.AudioAttributesImplApi26Parcelizer = i1213 - 1;
                iArr585[i1215] = i1214;
                return 0;
            case 832:
                int[] iArr586 = this.MediaMetadataCompat;
                int i1216 = this.AudioAttributesImplApi26Parcelizer;
                iArr586[i1216] = iArr586[81];
                this.AudioAttributesImplApi26Parcelizer = i1216;
                iArr586[i1216 - 1] = iArr586[i1216 - 1] + iArr586[i1216];
                return 0;
            case 833:
                Object[] objArr446 = this.MediaBrowserCompatSearchResultReceiver;
                int i1217 = this.AudioAttributesImplApi26Parcelizer;
                objArr446[i1217] = objArr446[79];
                this.AudioAttributesImplApi26Parcelizer = i1217 + 2;
                objArr446[i1217 + 1] = objArr446[84];
                return 0;
            case 834:
                int i1218 = this.AudioAttributesImplApi26Parcelizer;
                int i1219 = i1218 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1219;
                Object[] objArr447 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj412 = objArr447[i1219];
                objArr447[i1219] = null;
                int i1220 = this.MediaMetadataCompat[i1218 - 2];
                Object obj413 = objArr447[i1218 - 1];
                objArr447[i1218 - 1] = null;
                ((Object[]) obj412)[i1220] = obj413;
                int i1221 = i1218 - 4;
                this.AudioAttributesImplApi26Parcelizer = i1221;
                Object obj414 = objArr447[i1221];
                objArr447[i1221] = null;
                objArr447[19] = obj414;
                return 0;
            case 835:
                int i1222 = this.AudioAttributesImplApi26Parcelizer;
                int i1223 = i1222 - 1;
                int[] iArr587 = this.MediaMetadataCompat;
                iArr587[19] = iArr587[i1223];
                this.AudioAttributesImplApi26Parcelizer = i1222;
                iArr587[i1223] = 1;
                return 0;
            case 836:
                Object[] objArr448 = this.MediaBrowserCompatSearchResultReceiver;
                int i1224 = this.AudioAttributesImplApi26Parcelizer;
                objArr448[i1224] = objArr448[i1224 - 1];
                this.MediaMetadataCompat[i1224 + 1] = 0;
                float[] fArr = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi26Parcelizer = i1224 + 3;
                fArr[i1224 + 2] = 0.0f;
                return 0;
            case 837:
                float[] fArr2 = this.MediaBrowserCompatMediaItem;
                int i1225 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i1225 + 1;
                this.AudioAttributesImplApi21Parcelizer = fArr2[i1225];
                return 0;
            case 838:
                float[] fArr3 = this.MediaBrowserCompatMediaItem;
                int i1226 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1226 + 1;
                fArr3[i1226] = this.RemoteActionCompatParcelizer;
                return 0;
            case 839:
                float[] fArr4 = this.MediaBrowserCompatMediaItem;
                int i1227 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1227 + 1;
                fArr4[i1227] = 0.0f;
                return 0;
            case 840:
                float[] fArr5 = this.MediaBrowserCompatMediaItem;
                int i1228 = this.AudioAttributesImplApi26Parcelizer;
                fArr5[i1228] = 0.0f;
                this.AudioAttributesImplApi26Parcelizer = i1228;
                this.MediaMetadataCompat[i1228 - 1] = (fArr5[i1228 - 1] > fArr5[i1228] ? 1 : (fArr5[i1228 - 1] == fArr5[i1228] ? 0 : -1));
                return 0;
            case 841:
                int i1229 = this.AudioAttributesImplApi26Parcelizer;
                int i1230 = i1229 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1230;
                Object[] objArr449 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj415 = objArr449[i1230];
                objArr449[i1230] = null;
                int i1231 = this.MediaMetadataCompat[i1229 - 2];
                Object obj416 = objArr449[i1229 - 1];
                objArr449[i1229 - 1] = null;
                ((Object[]) obj415)[i1231] = obj416;
                this.AudioAttributesImplApi26Parcelizer = i1229 - 2;
                objArr449[i1230] = objArr449[20];
                Object obj417 = objArr449[i1229 - 3];
                objArr449[i1229 - 3] = null;
                Object obj418 = objArr449[i1229 - 4];
                objArr449[i1229 - 4] = null;
                objArr449[i1229 - 3] = obj418;
                objArr449[i1229 - 4] = obj417;
                return 0;
            case 842:
                int[] iArr588 = this.MediaMetadataCompat;
                int i1232 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1232 + 1;
                iArr588[i1232] = 4;
                Object[] objArr450 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj419 = objArr450[i1232 - 1];
                objArr450[i1232 - 1] = null;
                objArr450[i1232] = obj419;
                iArr588[i1232 - 1] = iArr588[i1232];
                return 0;
            case 843:
                Object[] objArr451 = this.MediaBrowserCompatSearchResultReceiver;
                int i1233 = this.AudioAttributesImplApi26Parcelizer;
                objArr451[i1233] = objArr451[i1233 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1233;
                Object obj420 = objArr451[i1233];
                objArr451[i1233] = null;
                objArr451[19] = obj420;
                return 0;
            case 844:
                int i1234 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1234;
                Object[] objArr452 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj421 = objArr452[i1234];
                objArr452[i1234] = null;
                objArr452[85] = obj421;
                return 0;
            case 845:
                Object[] objArr453 = this.MediaBrowserCompatSearchResultReceiver;
                int i1235 = this.AudioAttributesImplApi26Parcelizer;
                objArr453[i1235] = objArr453[85];
                int[] iArr589 = this.MediaMetadataCompat;
                iArr589[i1235 + 1] = 2;
                int i1236 = i1235 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1236;
                Object obj422 = objArr453[i1235];
                objArr453[i1235] = null;
                objArr453[i1235] = ((Object[]) obj422)[iArr589[i1236]];
                return 0;
            case 846:
                int i1237 = this.AudioAttributesImplApi26Parcelizer;
                int i1238 = i1237 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1238;
                int[] iArr590 = this.MediaMetadataCompat;
                Object[] objArr454 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj423 = objArr454[i1237 - 2];
                objArr454[i1237 - 2] = null;
                iArr590[i1237 - 2] = ((int[]) obj423)[iArr590[i1238]];
                int i1239 = i1237 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1239;
                objArr454[i1239] = null;
                return 0;
            case 847:
                int i1240 = this.AudioAttributesImplApi26Parcelizer;
                int i1241 = i1240 - 1;
                Object[] objArr455 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj424 = objArr455[i1241];
                objArr455[i1241] = null;
                objArr455[85] = obj424;
                this.AudioAttributesImplApi26Parcelizer = i1240;
                objArr455[i1241] = obj424;
                return 0;
            case 848:
                int[] iArr591 = this.MediaMetadataCompat;
                int i1242 = this.AudioAttributesImplApi26Parcelizer;
                iArr591[i1242] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1242;
                Object[] objArr456 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj425 = objArr456[i1242 - 1];
                objArr456[i1242 - 1] = null;
                iArr591[i1242 - 1] = ((int[]) obj425)[iArr591[i1242]];
                int i1243 = i1242 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1243;
                objArr456[i1243] = null;
                return 0;
            case 849:
                Object[] objArr457 = this.MediaBrowserCompatSearchResultReceiver;
                int i1244 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1244 + 1;
                objArr457[i1244] = objArr457[85];
                return 0;
            case 850:
                int i1245 = this.AudioAttributesImplApi26Parcelizer;
                int i1246 = i1245 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1246;
                int[] iArr592 = this.MediaMetadataCompat;
                Object[] objArr458 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj426 = objArr458[i1245 - 2];
                objArr458[i1245 - 2] = null;
                iArr592[i1245 - 2] = ((int[]) obj426)[iArr592[i1246]];
                int i1247 = i1245 - 2;
                iArr592[21] = iArr592[i1247];
                this.AudioAttributesImplApi26Parcelizer = i1245 - 1;
                objArr458[i1247] = objArr458[19];
                return 0;
            case 851:
                int i1248 = this.AudioAttributesImplApi26Parcelizer;
                int i1249 = i1248 - 1;
                Object[] objArr459 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj427 = objArr459[i1249];
                objArr459[i1249] = null;
                objArr459[85] = obj427;
                objArr459[i1249] = obj427;
                int[] iArr593 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1248 + 1;
                iArr593[i1248] = 1;
                return 0;
            case 852:
                int i1250 = this.AudioAttributesImplApi26Parcelizer;
                int i1251 = i1250 - 1;
                int[] iArr594 = this.MediaMetadataCompat;
                iArr594[20] = iArr594[i1251];
                this.AudioAttributesImplApi26Parcelizer = i1250;
                iArr594[i1251] = iArr594[21];
                return 0;
            case 853:
                Object[] objArr460 = this.MediaBrowserCompatSearchResultReceiver;
                int i1252 = this.AudioAttributesImplApi26Parcelizer;
                objArr460[i1252] = objArr460[i1252 - 1];
                Object obj428 = objArr460[i1252];
                objArr460[i1252] = null;
                objArr460[85] = obj428;
                this.AudioAttributesImplApi26Parcelizer = i1252 + 1;
                objArr460[i1252] = obj428;
                return 0;
            case 854:
                int[] iArr595 = this.MediaMetadataCompat;
                int i1253 = this.AudioAttributesImplApi26Parcelizer;
                iArr595[i1253] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1253;
                iArr595[78] = iArr595[i1253];
                return 0;
            case 855:
                int i1254 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr596 = this.MediaMetadataCompat;
                iArr596[77] = iArr596[i1254 - 1];
                int i1255 = i1254 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1255;
                Object[] objArr461 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj429 = objArr461[i1255];
                objArr461[i1255] = null;
                objArr461[76] = obj429;
                return 0;
            case 856:
                int i1256 = this.AudioAttributesImplApi26Parcelizer;
                int i1257 = i1256 - 1;
                Object[] objArr462 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj430 = objArr462[i1257];
                objArr462[i1257] = null;
                objArr462[75] = obj430;
                this.AudioAttributesImplApi26Parcelizer = i1256;
                objArr462[i1257] = obj430;
                return 0;
            case 857:
                Object[] objArr463 = this.MediaBrowserCompatSearchResultReceiver;
                int i1258 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1258 + 1;
                objArr463[i1258] = objArr463[76];
                return 0;
            case 858:
                int i1259 = this.AudioAttributesImplApi26Parcelizer;
                int i1260 = i1259 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1260;
                int[] iArr597 = this.MediaMetadataCompat;
                Object[] objArr464 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj431 = objArr464[i1259 - 2];
                objArr464[i1259 - 2] = null;
                iArr597[i1259 - 2] = ((int[]) obj431)[iArr597[i1260]];
                this.AudioAttributesImplApi26Parcelizer = i1259;
                objArr464[i1260] = objArr464[76];
                return 0;
            case 859:
                int i1261 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1261;
                Object[] objArr465 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj432 = objArr465[i1261];
                objArr465[i1261] = null;
                objArr465[84] = obj432;
                return 0;
            case 860:
                int i1262 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1262;
                int[] iArr598 = this.MediaMetadataCompat;
                iArr598[83] = iArr598[i1262];
                return 0;
            case 861:
                int i1263 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1263;
                int[] iArr599 = this.MediaMetadataCompat;
                iArr599[82] = iArr599[i1263];
                return 0;
            case 862:
                int i1264 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr600 = this.MediaMetadataCompat;
                iArr600[81] = iArr600[i1264 - 1];
                int i1265 = i1264 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1265;
                iArr600[80] = iArr600[i1265];
                return 0;
            case 863:
                int i1266 = this.AudioAttributesImplApi26Parcelizer;
                int i1267 = i1266 - 1;
                Object[] objArr466 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj433 = objArr466[i1267];
                objArr466[i1267] = null;
                objArr466[79] = obj433;
                this.AudioAttributesImplApi26Parcelizer = i1266;
                objArr466[i1267] = obj433;
                return 0;
            case 864:
                int i1268 = this.AudioAttributesImplApi26Parcelizer;
                int i1269 = i1268 - 1;
                Object[] objArr467 = this.MediaBrowserCompatSearchResultReceiver;
                objArr467[i1269] = null;
                this.AudioAttributesImplApi26Parcelizer = i1268;
                objArr467[i1269] = objArr467[79];
                return 0;
            case 865:
                int[] iArr601 = this.MediaMetadataCompat;
                int i1270 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1270 + 1;
                iArr601[i1270] = iArr601[80];
                return 0;
            case 866:
                int[] iArr602 = this.MediaMetadataCompat;
                int i1271 = this.AudioAttributesImplApi26Parcelizer;
                int i1272 = iArr602[i1271 - 1];
                iArr602[i1271 - 1] = iArr602[i1271 - 2];
                iArr602[i1271 - 2] = i1272;
                int i1273 = i1271 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1273;
                Object[] objArr468 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj434 = objArr468[i1273];
                objArr468[i1273] = null;
                ((int[]) obj434)[iArr602[i1271 - 2]] = iArr602[i1271 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1271 - 2;
                objArr468[i1273] = objArr468[79];
                return 0;
            case 867:
                int[] iArr603 = this.MediaMetadataCompat;
                int i1274 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1274 + 1;
                iArr603[i1274] = iArr603[81];
                return 0;
            case 868:
                int i1275 = this.AudioAttributesImplApi26Parcelizer;
                int i1276 = i1275 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1276;
                Object[] objArr469 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj435 = objArr469[i1276];
                objArr469[i1276] = null;
                int[] iArr604 = this.MediaMetadataCompat;
                ((int[]) obj435)[iArr604[i1275 - 2]] = iArr604[i1275 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1275 - 2;
                objArr469[i1276] = objArr469[79];
                return 0;
            case 869:
                int i1277 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1277;
                int[] iArr605 = this.MediaMetadataCompat;
                iArr605[81] = iArr605[i1277];
                return 0;
            case 870:
                int i1278 = this.AudioAttributesImplApi26Parcelizer;
                int i1279 = i1278 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1279;
                Object[] objArr470 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj436 = objArr470[i1279];
                objArr470[i1279] = null;
                int[] iArr606 = this.MediaMetadataCompat;
                ((int[]) obj436)[iArr606[i1278 - 2]] = iArr606[i1278 - 1];
                objArr470[i1279] = objArr470[79];
                this.AudioAttributesImplApi26Parcelizer = i1278 - 1;
                objArr470[i1278 - 2] = objArr470[84];
                return 0;
            case 871:
                Object[] objArr471 = this.MediaBrowserCompatSearchResultReceiver;
                int i1280 = this.AudioAttributesImplApi26Parcelizer;
                objArr471[i1280] = objArr471[85];
                int[] iArr607 = this.MediaMetadataCompat;
                iArr607[i1280 + 1] = 0;
                int i1281 = i1280 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1281;
                Object obj437 = objArr471[i1280];
                objArr471[i1280] = null;
                objArr471[i1280] = ((Object[]) obj437)[iArr607[i1281]];
                return 0;
            case 872:
                int i1282 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1282;
                int[] iArr608 = this.MediaMetadataCompat;
                iArr608[78] = iArr608[i1282];
                return 0;
            case 873:
                int i1283 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1283;
                Object[] objArr472 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj438 = objArr472[i1283];
                objArr472[i1283] = null;
                objArr472[75] = obj438;
                return 0;
            case 874:
                Object[] objArr473 = this.MediaBrowserCompatSearchResultReceiver;
                int i1284 = this.AudioAttributesImplApi26Parcelizer;
                objArr473[i1284] = objArr473[75];
                objArr473[i1284 + 1] = objArr473[76];
                int[] iArr609 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1284 + 3;
                iArr609[i1284 + 2] = 1;
                return 0;
            case 875:
                Object[] objArr474 = this.MediaBrowserCompatSearchResultReceiver;
                int i1285 = this.AudioAttributesImplApi26Parcelizer;
                objArr474[i1285] = objArr474[76];
                int[] iArr610 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1285 + 2;
                iArr610[i1285 + 1] = 2;
                return 0;
            case 876:
                int i1286 = this.AudioAttributesImplApi26Parcelizer;
                int i1287 = i1286 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1287;
                int[] iArr611 = this.MediaMetadataCompat;
                Object[] objArr475 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj439 = objArr475[i1286 - 2];
                objArr475[i1286 - 2] = null;
                iArr611[i1286 - 2] = ((int[]) obj439)[iArr611[i1287]];
                iArr611[i1287] = iArr611[77];
                this.AudioAttributesImplApi26Parcelizer = i1286 + 1;
                iArr611[i1286] = iArr611[78];
                return 0;
            case 877:
                Object[] objArr476 = this.MediaBrowserCompatSearchResultReceiver;
                int i1288 = this.AudioAttributesImplApi26Parcelizer;
                objArr476[i1288] = objArr476[76];
                int[] iArr612 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1288 + 2;
                iArr612[i1288 + 1] = 3;
                return 0;
            case 878:
                int i1289 = this.AudioAttributesImplApi26Parcelizer;
                int i1290 = i1289 - 1;
                Object[] objArr477 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj440 = objArr477[i1290];
                objArr477[i1290] = null;
                objArr477[84] = obj440;
                int[] iArr613 = this.MediaMetadataCompat;
                iArr613[83] = iArr613[i1289 - 2];
                int i1291 = i1289 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1291;
                iArr613[82] = iArr613[i1291];
                return 0;
            case 879:
                int i1292 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr614 = this.MediaMetadataCompat;
                iArr614[81] = iArr614[i1292 - 1];
                iArr614[80] = iArr614[i1292 - 2];
                int i1293 = i1292 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1293;
                Object[] objArr478 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj441 = objArr478[i1293];
                objArr478[i1293] = null;
                objArr478[79] = obj441;
                return 0;
            case 880:
                Object[] objArr479 = this.MediaBrowserCompatSearchResultReceiver;
                int i1294 = this.AudioAttributesImplApi26Parcelizer;
                objArr479[i1294] = objArr479[79];
                this.AudioAttributesImplApi26Parcelizer = i1294;
                objArr479[i1294] = null;
                return 0;
            case 881:
                int[] iArr615 = this.MediaMetadataCompat;
                int i1295 = this.AudioAttributesImplApi26Parcelizer;
                iArr615[i1295] = iArr615[82];
                this.AudioAttributesImplApi26Parcelizer = i1295 + 2;
                iArr615[i1295 + 1] = iArr615[83];
                return 0;
            case 882:
                int i1296 = this.AudioAttributesImplApi26Parcelizer;
                int i1297 = i1296 - 1;
                int[] iArr616 = this.MediaMetadataCompat;
                iArr616[81] = iArr616[i1297];
                iArr616[i1297] = iArr616[82];
                this.AudioAttributesImplApi26Parcelizer = i1296 + 1;
                iArr616[i1296] = iArr616[81];
                return 0;
            case 883:
                Object[] objArr480 = this.MediaBrowserCompatSearchResultReceiver;
                int i1298 = this.AudioAttributesImplApi26Parcelizer;
                objArr480[i1298] = objArr480[84];
                int[] iArr617 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1298 + 2;
                iArr617[i1298 + 1] = 3;
                Object obj442 = objArr480[i1298];
                objArr480[i1298] = null;
                objArr480[i1298 + 1] = obj442;
                iArr617[i1298] = iArr617[i1298 + 1];
                return 0;
            case 884:
                Object[] objArr481 = this.MediaBrowserCompatSearchResultReceiver;
                int i1299 = this.AudioAttributesImplApi26Parcelizer;
                objArr481[i1299] = objArr481[19];
                this.AudioAttributesImplApi26Parcelizer = i1299 + 2;
                objArr481[i1299 + 1] = objArr481[i1299];
                return 0;
            case 885:
                int i1300 = this.AudioAttributesImplApi26Parcelizer;
                int i1301 = i1300 - 1;
                Object[] objArr482 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj443 = objArr482[i1301];
                objArr482[i1301] = null;
                objArr482[85] = obj443;
                objArr482[i1301] = obj443;
                int[] iArr618 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1300 + 1;
                iArr618[i1300] = 0;
                return 0;
            case 886:
                int i1302 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr619 = this.MediaMetadataCompat;
                iArr619[78] = iArr619[i1302 - 1];
                int i1303 = i1302 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1303;
                iArr619[77] = iArr619[i1303];
                return 0;
            case 887:
                int i1304 = this.AudioAttributesImplApi26Parcelizer;
                int i1305 = i1304 - 1;
                Object[] objArr483 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj444 = objArr483[i1305];
                objArr483[i1305] = null;
                objArr483[76] = obj444;
                int i1306 = i1304 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1306;
                Object obj445 = objArr483[i1306];
                objArr483[i1306] = null;
                objArr483[75] = obj445;
                return 0;
            case 888:
                Object[] objArr484 = this.MediaBrowserCompatSearchResultReceiver;
                int i1307 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1307 + 1;
                objArr484[i1307] = objArr484[75];
                return 0;
            case 889:
                Object[] objArr485 = this.MediaBrowserCompatSearchResultReceiver;
                int i1308 = this.AudioAttributesImplApi26Parcelizer;
                objArr485[i1308] = objArr485[76];
                int[] iArr620 = this.MediaMetadataCompat;
                iArr620[i1308 + 1] = 1;
                int i1309 = i1308 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1309;
                Object obj446 = objArr485[i1308];
                objArr485[i1308] = null;
                objArr485[i1308] = ((Object[]) obj446)[iArr620[i1309]];
                return 0;
            case 890:
                int i1310 = this.AudioAttributesImplApi26Parcelizer;
                int i1311 = i1310 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1311;
                int[] iArr621 = this.MediaMetadataCompat;
                Object[] objArr486 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj447 = objArr486[i1310 - 2];
                objArr486[i1310 - 2] = null;
                iArr621[i1310 - 2] = ((int[]) obj447)[iArr621[i1311]];
                objArr486[i1311] = objArr486[76];
                this.AudioAttributesImplApi26Parcelizer = i1310 + 1;
                iArr621[i1310] = 2;
                return 0;
            case 891:
                int[] iArr622 = this.MediaMetadataCompat;
                int i1312 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1312 + 1;
                iArr622[i1312] = iArr622[77];
                return 0;
            case 892:
                int[] iArr623 = this.MediaMetadataCompat;
                int i1313 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1313 + 1;
                iArr623[i1313] = iArr623[78];
                return 0;
            case 893:
                Object[] objArr487 = this.MediaBrowserCompatSearchResultReceiver;
                int i1314 = this.AudioAttributesImplApi26Parcelizer;
                objArr487[i1314] = objArr487[76];
                int[] iArr624 = this.MediaMetadataCompat;
                iArr624[i1314 + 1] = 3;
                int i1315 = i1314 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1315;
                Object obj448 = objArr487[i1314];
                objArr487[i1314] = null;
                objArr487[i1314] = ((Object[]) obj448)[iArr624[i1315]];
                return 0;
            case 894:
                int i1316 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr625 = this.MediaMetadataCompat;
                iArr625[80] = iArr625[i1316 - 1];
                int i1317 = i1316 - 2;
                Object[] objArr488 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj449 = objArr488[i1317];
                objArr488[i1317] = null;
                objArr488[79] = obj449;
                this.AudioAttributesImplApi26Parcelizer = i1316 - 1;
                objArr488[i1317] = obj449;
                return 0;
            case 895:
                Object[] objArr489 = this.MediaBrowserCompatSearchResultReceiver;
                int i1318 = this.AudioAttributesImplApi26Parcelizer;
                objArr489[i1318] = objArr489[79];
                int[] iArr626 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1318 + 2;
                iArr626[i1318 + 1] = iArr626[80];
                Object obj450 = objArr489[i1318];
                objArr489[i1318] = null;
                objArr489[i1318 + 1] = obj450;
                iArr626[i1318] = iArr626[i1318 + 1];
                return 0;
            case 896:
                Object[] objArr490 = this.MediaBrowserCompatSearchResultReceiver;
                int i1319 = this.AudioAttributesImplApi26Parcelizer;
                objArr490[i1319] = objArr490[79];
                int[] iArr627 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1319 + 2;
                iArr627[i1319 + 1] = iArr627[81];
                Object obj451 = objArr490[i1319];
                objArr490[i1319] = null;
                objArr490[i1319 + 1] = obj451;
                iArr627[i1319] = iArr627[i1319 + 1];
                return 0;
            case 897:
                Object[] objArr491 = this.MediaBrowserCompatSearchResultReceiver;
                int i1320 = this.AudioAttributesImplApi26Parcelizer;
                objArr491[i1320] = objArr491[79];
                int[] iArr628 = this.MediaMetadataCompat;
                iArr628[i1320 + 1] = iArr628[82];
                this.AudioAttributesImplApi26Parcelizer = i1320 + 3;
                iArr628[i1320 + 2] = iArr628[83];
                return 0;
            case 898:
                Object[] objArr492 = this.MediaBrowserCompatSearchResultReceiver;
                int i1321 = this.AudioAttributesImplApi26Parcelizer;
                Object obj452 = objArr492[i1321 - 2];
                objArr492[i1321 - 2] = null;
                objArr492[i1321 - 1] = obj452;
                int[] iArr629 = this.MediaMetadataCompat;
                iArr629[i1321 - 2] = iArr629[i1321 - 1];
                int i1322 = i1321 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1322;
                Object obj453 = objArr492[i1322];
                objArr492[i1322] = null;
                int i1323 = iArr629[i1321 - 2];
                Object obj454 = objArr492[i1321 - 1];
                objArr492[i1321 - 1] = null;
                ((Object[]) obj453)[i1323] = obj454;
                int i1324 = i1321 - 4;
                this.AudioAttributesImplApi26Parcelizer = i1324;
                Object obj455 = objArr492[i1324];
                objArr492[i1324] = null;
                objArr492[19] = obj455;
                return 0;
            case 899:
                int i1325 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1325;
                Object[] objArr493 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj456 = objArr493[i1325];
                objArr493[i1325] = null;
                objArr493[22] = obj456;
                return 0;
            case 900:
                Object[] objArr494 = this.MediaBrowserCompatSearchResultReceiver;
                int i1326 = this.AudioAttributesImplApi26Parcelizer;
                objArr494[i1326] = objArr494[i1326 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1326;
                Object obj457 = objArr494[i1326];
                objArr494[i1326] = null;
                objArr494[24] = obj457;
                return 0;
            case 901:
                int[] iArr630 = this.MediaMetadataCompat;
                int i1327 = this.AudioAttributesImplApi26Parcelizer;
                iArr630[i1327] = iArr630[23];
                Object[] objArr495 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i1327 + 2;
                objArr495[i1327 + 1] = objArr495[24];
                return 0;
            case 902:
                Object[] objArr496 = this.MediaBrowserCompatSearchResultReceiver;
                int i1328 = this.AudioAttributesImplApi26Parcelizer;
                objArr496[i1328] = objArr496[22];
                this.AudioAttributesImplApi26Parcelizer = i1328 + 2;
                objArr496[i1328 + 1] = objArr496[24];
                return 0;
            case 903:
                int i1329 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1329;
                this.MediaBrowserCompatSearchResultReceiver[i1329] = null;
                int[] iArr631 = this.MediaMetadataCompat;
                iArr631[23] = iArr631[23] + 1;
                return 0;
            case 904:
                int i1330 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1330;
                Object[] objArr497 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj458 = objArr497[i1330];
                objArr497[i1330] = null;
                objArr497[23] = obj458;
                return 0;
            case 905:
                Object[] objArr498 = this.MediaBrowserCompatSearchResultReceiver;
                int i1331 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1331 + 1;
                objArr498[i1331] = objArr498[23];
                return 0;
            case 906:
                Object[] objArr499 = this.MediaBrowserCompatSearchResultReceiver;
                int i1332 = this.AudioAttributesImplApi26Parcelizer;
                objArr499[i1332] = null;
                this.AudioAttributesImplApi26Parcelizer = i1332;
                Object obj459 = objArr499[i1332];
                objArr499[i1332] = null;
                objArr499[23] = obj459;
                return 0;
            case 907:
                int[] iArr632 = this.MediaMetadataCompat;
                int i1333 = this.AudioAttributesImplApi26Parcelizer;
                iArr632[i1333] = iArr632[21];
                iArr632[i1333 + 1] = iArr632[20];
                int i1334 = i1333 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1334;
                iArr632[i1333] = iArr632[i1333] ^ iArr632[i1334];
                return 0;
            case 908:
                Object[] objArr500 = this.MediaBrowserCompatSearchResultReceiver;
                int i1335 = this.AudioAttributesImplApi26Parcelizer;
                objArr500[i1335] = objArr500[i1335 - 1];
                objArr500[i1335 + 1] = objArr500[19];
                this.AudioAttributesImplApi26Parcelizer = i1335 + 3;
                objArr500[i1335 + 2] = objArr500[i1335 + 1];
                return 0;
            case 909:
                int i1336 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1336;
                int[] iArr633 = this.MediaMetadataCompat;
                iArr633[77] = iArr633[i1336];
                return 0;
            case 910:
                int[] iArr634 = this.MediaMetadataCompat;
                int i1337 = this.AudioAttributesImplApi26Parcelizer;
                iArr634[i1337] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1337;
                Object[] objArr501 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj460 = objArr501[i1337 - 1];
                objArr501[i1337 - 1] = null;
                iArr634[i1337 - 1] = ((int[]) obj460)[iArr634[i1337]];
                this.AudioAttributesImplApi26Parcelizer = i1337 + 1;
                iArr634[i1337] = iArr634[77];
                return 0;
            case 911:
                int i1338 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr635 = this.MediaMetadataCompat;
                iArr635[82] = iArr635[i1338 - 1];
                iArr635[81] = iArr635[i1338 - 2];
                int i1339 = i1338 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1339;
                iArr635[80] = iArr635[i1339];
                return 0;
            case 912:
                Object[] objArr502 = this.MediaBrowserCompatSearchResultReceiver;
                int i1340 = this.AudioAttributesImplApi26Parcelizer;
                objArr502[i1340] = objArr502[79];
                int[] iArr636 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1340 + 2;
                iArr636[i1340 + 1] = iArr636[80];
                return 0;
            case 913:
                int[] iArr637 = this.MediaMetadataCompat;
                int i1341 = this.AudioAttributesImplApi26Parcelizer;
                iArr637[i1341] = iArr637[20];
                this.AudioAttributesImplApi26Parcelizer = i1341 + 2;
                iArr637[i1341 + 1] = iArr637[21];
                return 0;
            case 914:
                int i1342 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1342;
                long[] jArr61 = this.RatingCompat;
                jArr61[68] = jArr61[i1342];
                return 0;
            case 915:
                long[] jArr62 = this.RatingCompat;
                int i1343 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1343 + 1;
                jArr62[i1343] = jArr62[68];
                return 0;
            case 916:
                Object[] objArr503 = this.MediaBrowserCompatSearchResultReceiver;
                int i1344 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1344 + 1;
                objArr503[i1344] = objArr503[22];
                return 0;
            case 917:
                Object[] objArr504 = this.MediaBrowserCompatSearchResultReceiver;
                int i1345 = this.AudioAttributesImplApi26Parcelizer;
                objArr504[i1345] = objArr504[85];
                int[] iArr638 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1345 + 2;
                iArr638[i1345 + 1] = 0;
                return 0;
            case 918:
                int i1346 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr639 = this.MediaMetadataCompat;
                iArr639[83] = iArr639[i1346 - 1];
                iArr639[82] = iArr639[i1346 - 2];
                int i1347 = i1346 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1347;
                iArr639[81] = iArr639[i1347];
                return 0;
            case 919:
                Object[] objArr505 = this.MediaBrowserCompatSearchResultReceiver;
                int i1348 = this.AudioAttributesImplApi26Parcelizer;
                objArr505[i1348] = objArr505[79];
                int[] iArr640 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1348 + 2;
                iArr640[i1348 + 1] = iArr640[82];
                return 0;
            case 920:
                int[] iArr641 = this.MediaMetadataCompat;
                int i1349 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1349 + 1;
                iArr641[i1349] = 3;
                Object[] objArr506 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj461 = objArr506[i1349 - 1];
                objArr506[i1349 - 1] = null;
                objArr506[i1349] = obj461;
                iArr641[i1349 - 1] = iArr641[i1349];
                return 0;
            case 921:
                int i1350 = this.AudioAttributesImplApi26Parcelizer;
                int i1351 = i1350 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1351;
                Object[] objArr507 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj462 = objArr507[i1351];
                objArr507[i1351] = null;
                int i1352 = this.MediaMetadataCompat[i1350 - 2];
                Object obj463 = objArr507[i1350 - 1];
                objArr507[i1350 - 1] = null;
                ((Object[]) obj462)[i1352] = obj463;
                int i1353 = i1350 - 4;
                Object obj464 = objArr507[i1353];
                objArr507[i1353] = null;
                objArr507[19] = obj464;
                this.AudioAttributesImplApi26Parcelizer = i1350 - 3;
                objArr507[i1353] = null;
                return 0;
            case 922:
                int[] iArr642 = this.MediaMetadataCompat;
                int i1354 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1354 + 1;
                iArr642[i1354] = iArr642[20];
                this.MediaBrowserCompatSearchResultReceiver[i1354] = new int[iArr642[i1354]];
                return 0;
            case 923:
                int[] iArr643 = this.MediaMetadataCompat;
                int i1355 = this.AudioAttributesImplApi26Parcelizer;
                iArr643[i1355] = iArr643[20];
                iArr643[i1355 + 1] = 1;
                int i1356 = i1355 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1356;
                iArr643[i1355] = iArr643[i1355] - iArr643[i1356];
                return 0;
            case 924:
                int i1357 = this.AudioAttributesImplApi26Parcelizer;
                int i1358 = i1357 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1358;
                Object[] objArr508 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj465 = objArr508[i1358];
                objArr508[i1358] = null;
                int[] iArr644 = this.MediaMetadataCompat;
                ((int[]) obj465)[iArr644[i1357 - 2]] = iArr644[i1357 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1357 - 2;
                iArr644[i1358] = iArr644[20];
                return 0;
            case 925:
                int i1359 = this.AudioAttributesImplApi26Parcelizer;
                int i1360 = i1359 - 1;
                int[] iArr645 = this.MediaMetadataCompat;
                iArr645[i1359 - 2] = iArr645[i1359 - 2] * iArr645[i1360];
                this.AudioAttributesImplApi26Parcelizer = i1359;
                iArr645[i1360] = 2;
                return 0;
            case 926:
                int i1361 = this.AudioAttributesImplApi26Parcelizer;
                int i1362 = i1361 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1362;
                int[] iArr646 = this.MediaMetadataCompat;
                iArr646[i1361 - 2] = iArr646[i1361 - 2] % iArr646[i1362];
                this.AudioAttributesImplApi26Parcelizer = i1361;
                iArr646[i1362] = 1;
                return 0;
            case 927:
                int i1363 = this.AudioAttributesImplApi26Parcelizer;
                int i1364 = i1363 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1364;
                int[] iArr647 = this.MediaMetadataCompat;
                Object[] objArr509 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj466 = objArr509[i1363 - 2];
                objArr509[i1363 - 2] = null;
                iArr647[i1363 - 2] = ((int[]) obj466)[iArr647[i1364]];
                this.AudioAttributesImplApi26Parcelizer = i1363;
                iArr647[i1364] = 1;
                return 0;
            case 928:
                int[] iArr648 = this.MediaMetadataCompat;
                int i1365 = this.AudioAttributesImplApi26Parcelizer;
                iArr648[i1365] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1365;
                Object[] objArr510 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj467 = objArr510[i1365 - 1];
                objArr510[i1365 - 1] = null;
                iArr648[i1365 - 1] = ((int[]) obj467)[iArr648[i1365]];
                this.AudioAttributesImplApi26Parcelizer = i1365 + 1;
                objArr510[i1365] = objArr510[76];
                return 0;
            case 929:
                int[] iArr649 = this.MediaMetadataCompat;
                int i1366 = this.AudioAttributesImplApi26Parcelizer;
                iArr649[i1366] = iArr649[82];
                this.AudioAttributesImplApi26Parcelizer = i1366 + 2;
                iArr649[i1366 + 1] = iArr649[81];
                return 0;
            case 930:
                int i1367 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1367;
                Object[] objArr511 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj468 = objArr511[i1367];
                objArr511[i1367] = null;
                objArr511[113] = obj468;
                return 0;
            case 931:
                Object[] objArr512 = this.MediaBrowserCompatSearchResultReceiver;
                int i1368 = this.AudioAttributesImplApi26Parcelizer;
                objArr512[i1368] = objArr512[113];
                int[] iArr650 = this.MediaMetadataCompat;
                iArr650[i1368 + 1] = 3;
                int i1369 = i1368 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1369;
                Object obj469 = objArr512[i1368];
                objArr512[i1368] = null;
                objArr512[i1368] = ((Object[]) obj469)[iArr650[i1369]];
                return 0;
            case 932:
                Object[] objArr513 = this.MediaBrowserCompatSearchResultReceiver;
                int i1370 = this.AudioAttributesImplApi26Parcelizer;
                objArr513[i1370] = objArr513[15];
                Object obj470 = objArr513[i1370];
                objArr513[i1370] = null;
                objArr513[113] = obj470;
                this.AudioAttributesImplApi26Parcelizer = i1370 + 1;
                objArr513[i1370] = obj470;
                return 0;
            case 933:
                int i1371 = this.AudioAttributesImplApi26Parcelizer;
                int i1372 = i1371 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1372;
                int[] iArr651 = this.MediaMetadataCompat;
                this.read = iArr651[i1372] == iArr651[i1371 - 1] ? 0 : 1;
                return 0;
            case 934:
                int i1373 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1373;
                long[] jArr63 = this.RatingCompat;
                jArr63[73] = jArr63[i1373];
                return 0;
            case 935:
                long[] jArr64 = this.RatingCompat;
                int i1374 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1374 + 1;
                jArr64[i1374] = jArr64[73];
                return 0;
            case 936:
                Object[] objArr514 = this.MediaBrowserCompatSearchResultReceiver;
                int i1375 = this.AudioAttributesImplApi26Parcelizer;
                Object obj471 = objArr514[i1375 - 1];
                objArr514[i1375 - 1] = null;
                Object obj472 = objArr514[i1375 - 2];
                objArr514[i1375 - 2] = null;
                objArr514[i1375 - 1] = obj472;
                objArr514[i1375 - 2] = obj471;
                int[] iArr652 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1375 + 1;
                iArr652[i1375] = 3;
                Object obj473 = objArr514[i1375 - 1];
                objArr514[i1375 - 1] = null;
                objArr514[i1375] = obj473;
                iArr652[i1375 - 1] = iArr652[i1375];
                return 0;
            case 937:
                Object[] objArr515 = this.MediaBrowserCompatSearchResultReceiver;
                int i1376 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1376 + 1;
                Object obj474 = objArr515[i1376 - 1];
                objArr515[i1376 - 1] = null;
                objArr515[i1376] = obj474;
                Object obj475 = objArr515[i1376 - 2];
                objArr515[i1376 - 2] = null;
                objArr515[i1376 - 1] = obj475;
                Object obj476 = objArr515[i1376 - 3];
                objArr515[i1376 - 3] = null;
                objArr515[i1376 - 2] = obj476;
                objArr515[i1376 - 3] = obj474;
                return 0;
            case 938:
                int[] iArr653 = this.MediaMetadataCompat;
                int i1377 = this.AudioAttributesImplApi26Parcelizer;
                iArr653[i1377] = iArr653[i1377 - 1];
                iArr653[i1377 + 1] = iArr653[i1377];
                this.AudioAttributesImplApi26Parcelizer = i1377 + 3;
                iArr653[i1377 + 2] = iArr653[i1377 + 1];
                return 0;
            case 939:
                int i1378 = this.AudioAttributesImplApi26Parcelizer;
                int i1379 = i1378 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1379;
                int[] iArr654 = this.MediaMetadataCompat;
                iArr654[i1378 - 2] = iArr654[i1378 - 2] * iArr654[i1379];
                int i1380 = iArr654[i1378 - 2];
                iArr654[i1378 - 2] = iArr654[i1378 - 3];
                iArr654[i1378 - 3] = i1380;
                return 0;
            case 940:
                int i1381 = this.AudioAttributesImplApi26Parcelizer;
                int i1382 = i1381 - 1;
                int[] iArr655 = this.MediaMetadataCompat;
                iArr655[i1381 - 2] = iArr655[i1381 - 2] * iArr655[i1382];
                this.AudioAttributesImplApi26Parcelizer = i1381 + 1;
                iArr655[i1381] = iArr655[i1381 - 2];
                iArr655[i1382] = iArr655[i1381 - 3];
                iArr655[i1381] = -iArr655[i1381];
                return 0;
            case 941:
                int i1383 = this.AudioAttributesImplApi26Parcelizer;
                int i1384 = i1383 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1384;
                int[] iArr656 = this.MediaMetadataCompat;
                iArr656[i1383 - 2] = iArr656[i1383 - 2] | iArr656[i1384];
                return 0;
            case 942:
                int[] iArr657 = this.MediaMetadataCompat;
                int i1385 = this.AudioAttributesImplApi26Parcelizer;
                iArr657[i1385] = 1;
                this.AudioAttributesImplApi26Parcelizer = i1385;
                iArr657[i1385 - 1] = iArr657[i1385 - 1] << iArr657[i1385];
                return 0;
            case 943:
                int[] iArr658 = this.MediaMetadataCompat;
                int i1386 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1386 + 1;
                int i1387 = iArr658[i1386 - 1];
                iArr658[i1386] = i1387;
                iArr658[i1386 - 1] = iArr658[i1386 - 2];
                iArr658[i1386 - 2] = iArr658[i1386 - 3];
                iArr658[i1386 - 3] = i1387;
                return 0;
            case 944:
                int[] iArr659 = this.MediaMetadataCompat;
                int i1388 = this.AudioAttributesImplApi26Parcelizer;
                iArr659[i1388 - 1] = -iArr659[i1388 - 1];
                return 0;
            case 945:
                int i1389 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr660 = this.MediaMetadataCompat;
                iArr660[i1389 - 2] = iArr660[i1389 - 1] ^ iArr660[i1389 - 2];
                int i1390 = i1389 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1390;
                iArr660[i1389 - 3] = iArr660[i1389 - 3] - iArr660[i1390];
                return 0;
            case 946:
                int[] iArr661 = this.MediaMetadataCompat;
                int i1391 = this.AudioAttributesImplApi26Parcelizer;
                iArr661[i1391 + 1] = iArr661[i1391 - 1];
                iArr661[i1391] = iArr661[i1391 - 2];
                iArr661[i1391 + 1] = -iArr661[i1391 + 1];
                int i1392 = i1391 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1392;
                iArr661[i1391] = iArr661[i1391] & iArr661[i1392];
                return 0;
            case 947:
                int[] iArr662 = this.MediaMetadataCompat;
                int i1393 = this.AudioAttributesImplApi26Parcelizer;
                int i1394 = iArr662[i1393 - 1];
                iArr662[i1393] = i1394;
                iArr662[i1393 - 1] = iArr662[i1393 - 2];
                iArr662[i1393 - 2] = iArr662[i1393 - 3];
                iArr662[i1393 - 3] = i1394;
                this.AudioAttributesImplApi26Parcelizer = i1393;
                this.MediaBrowserCompatSearchResultReceiver[i1393] = null;
                return 0;
            case 948:
                int[] iArr663 = this.MediaMetadataCompat;
                int i1395 = this.AudioAttributesImplApi26Parcelizer;
                iArr663[i1395 + 1] = iArr663[i1395 - 1];
                iArr663[i1395] = iArr663[i1395 - 2];
                int i1396 = i1395 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1396;
                iArr663[i1395] = iArr663[i1395] | iArr663[i1396];
                return 0;
            case 949:
                int i1397 = this.AudioAttributesImplApi26Parcelizer;
                int i1398 = i1397 - 1;
                int[] iArr664 = this.MediaMetadataCompat;
                iArr664[i1397 - 2] = iArr664[i1397 - 2] << iArr664[i1398];
                int i1399 = iArr664[i1397 - 2];
                iArr664[i1398] = i1399;
                iArr664[i1397 - 2] = iArr664[i1397 - 3];
                iArr664[i1397 - 3] = iArr664[i1397 - 4];
                iArr664[i1397 - 4] = i1399;
                int i1400 = i1397 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1400;
                this.MediaBrowserCompatSearchResultReceiver[i1400] = null;
                return 0;
            case 950:
                int i1401 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr665 = this.MediaMetadataCompat;
                iArr665[i1401 - 2] = iArr665[i1401 - 1] ^ iArr665[i1401 - 2];
                int i1402 = i1401 - 2;
                iArr665[i1401 - 3] = iArr665[i1401 - 3] - iArr665[i1402];
                this.AudioAttributesImplApi26Parcelizer = i1401 - 1;
                iArr665[i1402] = iArr665[i1401 - 3];
                return 0;
            case 951:
                int[] iArr666 = this.MediaMetadataCompat;
                int i1403 = this.AudioAttributesImplApi26Parcelizer;
                iArr666[i1403] = 25;
                iArr666[i1403 - 1] = iArr666[i1403 - 1] >> iArr666[i1403];
                this.AudioAttributesImplApi26Parcelizer = i1403 + 1;
                iArr666[i1403] = iArr666[i1403 - 1];
                return 0;
            case 952:
                int[] iArr667 = this.MediaMetadataCompat;
                int i1404 = this.AudioAttributesImplApi26Parcelizer;
                iArr667[i1404] = -255;
                iArr667[i1404 - 1] = iArr667[i1404 - 1] | iArr667[i1404];
                this.AudioAttributesImplApi26Parcelizer = i1404 + 1;
                iArr667[i1404] = 1;
                return 0;
            case 953:
                int i1405 = this.AudioAttributesImplApi26Parcelizer;
                int i1406 = i1405 - 1;
                int[] iArr668 = this.MediaMetadataCompat;
                iArr668[i1405 - 2] = iArr668[i1405 - 2] << iArr668[i1406];
                int i1407 = iArr668[i1405 - 2];
                iArr668[i1405 - 2] = iArr668[i1405 - 3];
                iArr668[i1405 - 3] = i1407;
                this.AudioAttributesImplApi26Parcelizer = i1405;
                iArr668[i1406] = -255;
                return 0;
            case 954:
                int i1408 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr669 = this.MediaMetadataCompat;
                iArr669[i1408 - 2] = iArr669[i1408 - 1] ^ iArr669[i1408 - 2];
                int i1409 = i1408 - 2;
                iArr669[i1408 - 3] = iArr669[i1408 - 3] - iArr669[i1409];
                this.AudioAttributesImplApi26Parcelizer = i1408 - 1;
                iArr669[i1409] = 128;
                return 0;
            case 955:
                int i1410 = this.AudioAttributesImplApi26Parcelizer;
                int i1411 = i1410 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1411;
                int[] iArr670 = this.MediaMetadataCompat;
                iArr670[i1410 - 2] = iArr670[i1410 - 2] / iArr670[i1411];
                iArr670[i1411] = 1;
                this.AudioAttributesImplApi26Parcelizer = i1410 + 2;
                iArr670[i1410 + 1] = iArr670[i1410 - 1];
                iArr670[i1410] = iArr670[i1410 - 2];
                return 0;
            case 956:
                int i1412 = this.AudioAttributesImplApi26Parcelizer;
                int i1413 = i1412 - 1;
                int[] iArr671 = this.MediaMetadataCompat;
                iArr671[i1412 - 2] = iArr671[i1412 - 2] ^ iArr671[i1413];
                int i1414 = iArr671[i1412 - 2];
                iArr671[i1413] = i1414;
                iArr671[i1412 - 2] = iArr671[i1412 - 3];
                iArr671[i1412 - 3] = iArr671[i1412 - 4];
                iArr671[i1412 - 4] = i1414;
                int i1415 = i1412 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1415;
                this.MediaBrowserCompatSearchResultReceiver[i1415] = null;
                return 0;
            case 957:
                int i1416 = this.AudioAttributesImplApi26Parcelizer;
                int i1417 = i1416 - 1;
                int[] iArr672 = this.MediaMetadataCompat;
                iArr672[i1416 - 2] = iArr672[i1416 - 2] & iArr672[i1417];
                iArr672[i1417] = 1;
                int i1418 = i1416 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1418;
                iArr672[i1416 - 2] = iArr672[i1416 - 2] << iArr672[i1418];
                return 0;
            case 958:
                int i1419 = this.AudioAttributesImplApi26Parcelizer;
                int i1420 = i1419 - 1;
                int[] iArr673 = this.MediaMetadataCompat;
                iArr673[i1419 - 2] = iArr673[i1419 - 2] + iArr673[i1420];
                this.AudioAttributesImplApi26Parcelizer = i1419 + 1;
                iArr673[i1419] = iArr673[i1419 - 2];
                iArr673[i1420] = iArr673[i1419 - 3];
                return 0;
            case 959:
                int i1421 = this.AudioAttributesImplApi26Parcelizer;
                int i1422 = i1421 - 1;
                int[] iArr674 = this.MediaMetadataCompat;
                iArr674[i1421 - 2] = iArr674[i1421 - 2] & iArr674[i1422];
                this.AudioAttributesImplApi26Parcelizer = i1421;
                int i1423 = iArr674[i1421 - 2];
                iArr674[i1422] = i1423;
                iArr674[i1421 - 2] = iArr674[i1421 - 3];
                iArr674[i1421 - 3] = iArr674[i1421 - 4];
                iArr674[i1421 - 4] = i1423;
                return 0;
            case 960:
                int i1424 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr675 = this.MediaMetadataCompat;
                iArr675[i1424 - 2] = iArr675[i1424 - 1] | iArr675[i1424 - 2];
                int i1425 = i1424 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1425;
                iArr675[i1424 - 3] = iArr675[i1424 - 3] + iArr675[i1425];
                int i1426 = iArr675[i1424 - 3];
                iArr675[i1424 - 3] = iArr675[i1424 - 4];
                iArr675[i1424 - 4] = i1426;
                return 0;
            case 961:
                int[] iArr676 = this.MediaMetadataCompat;
                int i1427 = this.AudioAttributesImplApi26Parcelizer;
                iArr676[i1427] = 17;
                iArr676[i1427 - 1] = iArr676[i1427 - 1] >> iArr676[i1427];
                this.AudioAttributesImplApi26Parcelizer = i1427 + 1;
                iArr676[i1427] = iArr676[i1427 - 1];
                return 0;
            case 962:
                int i1428 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr677 = this.MediaMetadataCompat;
                iArr677[i1428 - 2] = iArr677[i1428 - 2] << iArr677[i1428 - 1];
                int i1429 = i1428 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1429;
                iArr677[i1428 - 3] = iArr677[i1428 - 3] + iArr677[i1429];
                return 0;
            case 963:
                int[] iArr678 = this.MediaMetadataCompat;
                int i1430 = this.AudioAttributesImplApi26Parcelizer;
                iArr678[i1430] = -2;
                this.AudioAttributesImplApi26Parcelizer = i1430;
                iArr678[i1430 - 1] = iArr678[i1430 - 1] - iArr678[i1430];
                return 0;
            case 964:
                int i1431 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr679 = this.MediaMetadataCompat;
                iArr679[i1431 - 2] = iArr679[i1431 - 2] - iArr679[i1431 - 1];
                int i1432 = i1431 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1432;
                iArr679[i1431 - 3] = iArr679[i1431 - 3] ^ iArr679[i1432];
                return 0;
            case 965:
                int[] iArr680 = this.MediaMetadataCompat;
                int i1433 = this.AudioAttributesImplApi26Parcelizer;
                iArr680[i1433 - 1] = -iArr680[i1433 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1433 + 1;
                iArr680[i1433] = 1;
                return 0;
            case 966:
                int[] iArr681 = this.MediaMetadataCompat;
                int i1434 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1434 + 2;
                iArr681[i1434 + 1] = iArr681[i1434 - 1];
                iArr681[i1434] = iArr681[i1434 - 2];
                return 0;
            case 967:
                int i1435 = this.AudioAttributesImplApi26Parcelizer;
                int i1436 = i1435 - 1;
                int[] iArr682 = this.MediaMetadataCompat;
                iArr682[i1435 - 2] = iArr682[i1435 - 2] ^ iArr682[i1436];
                this.AudioAttributesImplApi26Parcelizer = i1435;
                int i1437 = iArr682[i1435 - 2];
                iArr682[i1436] = i1437;
                iArr682[i1435 - 2] = iArr682[i1435 - 3];
                iArr682[i1435 - 3] = iArr682[i1435 - 4];
                iArr682[i1435 - 4] = i1437;
                return 0;
            case 968:
                int[] iArr683 = this.MediaMetadataCompat;
                int i1438 = this.AudioAttributesImplApi26Parcelizer;
                iArr683[i1438] = iArr683[i1438 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1438 + 2;
                iArr683[i1438 + 1] = 18;
                return 0;
            case 969:
                int[] iArr684 = this.MediaMetadataCompat;
                int i1439 = this.AudioAttributesImplApi26Parcelizer;
                iArr684[i1439] = iArr684[i1439 - 1];
                iArr684[i1439 + 1] = -32767;
                int i1440 = i1439 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1440;
                iArr684[i1439] = iArr684[i1439] ^ iArr684[i1440];
                return 0;
            case 970:
                int[] iArr685 = this.MediaMetadataCompat;
                int i1441 = this.AudioAttributesImplApi26Parcelizer;
                iArr685[i1441] = -32767;
                iArr685[i1441 - 1] = iArr685[i1441 - 1] & iArr685[i1441];
                this.AudioAttributesImplApi26Parcelizer = i1441 + 1;
                iArr685[i1441] = 1;
                return 0;
            case 971:
                int[] iArr686 = this.MediaMetadataCompat;
                int i1442 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1442 + 1;
                iArr686[i1442] = 16384;
                return 0;
            case 972:
                int i1443 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i1443 - 1] = null;
                int[] iArr687 = this.MediaMetadataCompat;
                iArr687[i1443 - 3] = iArr687[i1443 - 2] | iArr687[i1443 - 3];
                int i1444 = i1443 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1444;
                iArr687[i1443 - 4] = iArr687[i1443 - 4] + iArr687[i1444];
                return 0;
            case 973:
                int i1445 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr688 = this.MediaMetadataCompat;
                iArr688[i1445 - 2] = iArr688[i1445 - 2] - iArr688[i1445 - 1];
                iArr688[i1445 - 2] = -iArr688[i1445 - 2];
                int i1446 = i1445 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1446;
                iArr688[i1445 - 3] = iArr688[i1445 - 3] & iArr688[i1446];
                return 0;
            case 974:
                int[] iArr689 = this.MediaMetadataCompat;
                int i1447 = this.AudioAttributesImplApi26Parcelizer;
                iArr689[i1447] = 1661;
                this.AudioAttributesImplApi26Parcelizer = i1447;
                iArr689[i1447 - 1] = iArr689[i1447 - 1] * iArr689[i1447];
                return 0;
            case 975:
                int i1448 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1448;
                Object[] objArr516 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj477 = objArr516[i1448];
                objArr516[i1448] = null;
                objArr516[101] = obj477;
                return 0;
            case 976:
                Object[] objArr517 = this.MediaBrowserCompatSearchResultReceiver;
                int i1449 = this.AudioAttributesImplApi26Parcelizer;
                objArr517[i1449] = objArr517[101];
                int[] iArr690 = this.MediaMetadataCompat;
                iArr690[i1449 + 1] = 2;
                int i1450 = i1449 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1450;
                Object obj478 = objArr517[i1449];
                objArr517[i1449] = null;
                objArr517[i1449] = ((Object[]) obj478)[iArr690[i1450]];
                return 0;
            case 977:
                int[] iArr691 = this.MediaMetadataCompat;
                int i1451 = this.AudioAttributesImplApi26Parcelizer;
                iArr691[i1451] = iArr691[i1451 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1451 + 2;
                iArr691[i1451 + 1] = iArr691[i1451];
                return 0;
            case 978:
                int[] iArr692 = this.MediaMetadataCompat;
                int i1452 = this.AudioAttributesImplApi26Parcelizer;
                iArr692[i1452 - 1] = -iArr692[i1452 - 1];
                int i1453 = i1452 - 1;
                iArr692[i1452 - 2] = iArr692[i1452 - 2] | iArr692[i1453];
                this.AudioAttributesImplApi26Parcelizer = i1452;
                iArr692[i1453] = 1;
                return 0;
            case 979:
                int[] iArr693 = this.MediaMetadataCompat;
                int i1454 = this.AudioAttributesImplApi26Parcelizer;
                iArr693[i1454 - 1] = -iArr693[i1454 - 1];
                int i1455 = i1454 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1455;
                iArr693[i1454 - 2] = iArr693[i1454 - 2] ^ iArr693[i1455];
                return 0;
            case 980:
                int i1456 = this.AudioAttributesImplApi26Parcelizer;
                int i1457 = i1456 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1457;
                int[] iArr694 = this.MediaMetadataCompat;
                iArr694[i1456 - 2] = iArr694[i1456 - 2] - iArr694[i1457];
                int i1458 = iArr694[i1456 - 2];
                iArr694[i1456 - 2] = iArr694[i1456 - 3];
                iArr694[i1456 - 3] = i1458;
                return 0;
            case 981:
                int[] iArr695 = this.MediaMetadataCompat;
                int i1459 = this.AudioAttributesImplApi26Parcelizer;
                int i1460 = iArr695[i1459 - 1];
                iArr695[i1459] = i1460;
                iArr695[i1459 - 1] = iArr695[i1459 - 2];
                iArr695[i1459 - 2] = iArr695[i1459 - 3];
                iArr695[i1459 - 3] = i1460;
                this.AudioAttributesImplApi26Parcelizer = i1459;
                this.MediaBrowserCompatSearchResultReceiver[i1459] = null;
                iArr695[i1459 - 1] = -iArr695[i1459 - 1];
                return 0;
            case 982:
                int[] iArr696 = this.MediaMetadataCompat;
                int i1461 = this.AudioAttributesImplApi26Parcelizer;
                iArr696[i1461 + 1] = iArr696[i1461 - 1];
                iArr696[i1461] = iArr696[i1461 - 2];
                int i1462 = i1461 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1462;
                iArr696[i1461] = iArr696[i1461] & iArr696[i1462];
                return 0;
            case 983:
                int[] iArr697 = this.MediaMetadataCompat;
                int i1463 = this.AudioAttributesImplApi26Parcelizer;
                iArr697[i1463] = 23;
                this.AudioAttributesImplApi26Parcelizer = i1463;
                iArr697[i1463 - 1] = iArr697[i1463 - 1] >> iArr697[i1463];
                return 0;
            case 984:
                int[] iArr698 = this.MediaMetadataCompat;
                int i1464 = this.AudioAttributesImplApi26Parcelizer;
                iArr698[i1464] = iArr698[i1464 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1464 + 2;
                iArr698[i1464 + 1] = -1023;
                return 0;
            case 985:
                int i1465 = this.AudioAttributesImplApi26Parcelizer;
                int i1466 = i1465 - 1;
                int[] iArr699 = this.MediaMetadataCompat;
                iArr699[i1465 - 2] = iArr699[i1465 - 2] ^ iArr699[i1466];
                int i1467 = iArr699[i1465 - 2];
                iArr699[i1465 - 2] = iArr699[i1465 - 3];
                iArr699[i1465 - 3] = i1467;
                this.AudioAttributesImplApi26Parcelizer = i1465;
                iArr699[i1466] = -1023;
                return 0;
            case 986:
                int[] iArr700 = this.MediaMetadataCompat;
                int i1468 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1468 + 1;
                iArr700[i1468] = 512;
                return 0;
            case 987:
                int i1469 = this.AudioAttributesImplApi26Parcelizer;
                int i1470 = i1469 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1470;
                int[] iArr701 = this.MediaMetadataCompat;
                iArr701[i1469 - 2] = iArr701[i1469 - 2] / iArr701[i1470];
                this.AudioAttributesImplApi26Parcelizer = i1469;
                iArr701[i1470] = 1;
                return 0;
            case 988:
                int i1471 = this.AudioAttributesImplApi26Parcelizer;
                int i1472 = i1471 - 1;
                int[] iArr702 = this.MediaMetadataCompat;
                iArr702[i1471 - 2] = iArr702[i1471 - 2] | iArr702[i1472];
                this.AudioAttributesImplApi26Parcelizer = i1471;
                iArr702[i1472] = 1;
                return 0;
            case 989:
                int i1473 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr703 = this.MediaMetadataCompat;
                iArr703[i1473 - 2] = iArr703[i1473 - 1] ^ iArr703[i1473 - 2];
                int i1474 = i1473 - 2;
                iArr703[i1473 - 3] = iArr703[i1473 - 3] - iArr703[i1474];
                this.AudioAttributesImplApi26Parcelizer = i1473;
                iArr703[i1473 - 1] = iArr703[i1473 - 3];
                iArr703[i1474] = iArr703[i1473 - 4];
                return 0;
            case 990:
                int i1475 = this.AudioAttributesImplApi26Parcelizer;
                int i1476 = i1475 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1476;
                int[] iArr704 = this.MediaMetadataCompat;
                iArr704[i1475 - 2] = iArr704[i1475 - 2] + iArr704[i1476];
                int i1477 = iArr704[i1475 - 2];
                iArr704[i1475 - 2] = iArr704[i1475 - 3];
                iArr704[i1475 - 3] = i1477;
                return 0;
            case 991:
                int[] iArr705 = this.MediaMetadataCompat;
                int i1478 = this.AudioAttributesImplApi26Parcelizer;
                iArr705[i1478] = 19;
                iArr705[i1478 - 1] = iArr705[i1478 - 1] >> iArr705[i1478];
                this.AudioAttributesImplApi26Parcelizer = i1478 + 1;
                iArr705[i1478] = iArr705[i1478 - 1];
                return 0;
            case 992:
                int[] iArr706 = this.MediaMetadataCompat;
                int i1479 = this.AudioAttributesImplApi26Parcelizer;
                iArr706[i1479] = -16383;
                this.AudioAttributesImplApi26Parcelizer = i1479;
                iArr706[i1479 - 1] = iArr706[i1479 - 1] & iArr706[i1479];
                int i1480 = iArr706[i1479 - 1];
                iArr706[i1479 - 1] = iArr706[i1479 - 2];
                iArr706[i1479 - 2] = i1480;
                return 0;
            case 993:
                int[] iArr707 = this.MediaMetadataCompat;
                int i1481 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1481 + 1;
                iArr707[i1481] = -16383;
                return 0;
            case 994:
                int i1482 = this.AudioAttributesImplApi26Parcelizer;
                int i1483 = i1482 - 1;
                int[] iArr708 = this.MediaMetadataCompat;
                iArr708[i1482 - 2] = iArr708[i1482 - 2] + iArr708[i1483];
                iArr708[i1483] = 8192;
                int i1484 = i1482 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1484;
                iArr708[i1482 - 2] = iArr708[i1482 - 2] / iArr708[i1484];
                return 0;
            case 995:
                int[] iArr709 = this.MediaMetadataCompat;
                int i1485 = this.AudioAttributesImplApi26Parcelizer;
                iArr709[i1485 + 1] = iArr709[i1485 - 1];
                iArr709[i1485] = iArr709[i1485 - 2];
                int i1486 = i1485 + 1;
                iArr709[i1485] = iArr709[i1485] ^ iArr709[i1486];
                this.AudioAttributesImplApi26Parcelizer = i1485 + 2;
                int i1487 = iArr709[i1485];
                iArr709[i1486] = i1487;
                iArr709[i1485] = iArr709[i1485 - 1];
                iArr709[i1485 - 1] = iArr709[i1485 - 2];
                iArr709[i1485 - 2] = i1487;
                return 0;
            case 996:
                int i1488 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i1488 - 1] = null;
                int i1489 = i1488 - 2;
                int[] iArr710 = this.MediaMetadataCompat;
                iArr710[i1488 - 3] = iArr710[i1488 - 3] & iArr710[i1489];
                this.AudioAttributesImplApi26Parcelizer = i1488 - 1;
                iArr710[i1489] = 1;
                return 0;
            case 997:
                int[] iArr711 = this.MediaMetadataCompat;
                int i1490 = this.AudioAttributesImplApi26Parcelizer;
                iArr711[i1490 - 1] = -iArr711[i1490 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1490 + 1;
                iArr711[i1490] = 4;
                return 0;
            case 998:
                int[] iArr712 = this.MediaMetadataCompat;
                int i1491 = this.AudioAttributesImplApi26Parcelizer;
                iArr712[i1491] = iArr712[i1491 - 1];
                iArr712[i1491 + 1] = 27;
                int i1492 = i1491 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1492;
                iArr712[i1491] = iArr712[i1491] >> iArr712[i1492];
                return 0;
            case 999:
                int[] iArr713 = this.MediaMetadataCompat;
                int i1493 = this.AudioAttributesImplApi26Parcelizer;
                iArr713[i1493] = iArr713[i1493 - 1];
                iArr713[i1493 + 1] = -63;
                int i1494 = i1493 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1494;
                iArr713[i1493] = iArr713[i1493] & iArr713[i1494];
                return 0;
            case 1000:
                int[] iArr714 = this.MediaMetadataCompat;
                int i1495 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1495 + 1;
                iArr714[i1495] = -63;
                return 0;
            case 1001:
                int i1496 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr715 = this.MediaMetadataCompat;
                iArr715[i1496 - 2] = iArr715[i1496 - 1] | iArr715[i1496 - 2];
                int i1497 = i1496 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1497;
                iArr715[i1496 - 3] = iArr715[i1496 - 3] + iArr715[i1497];
                return 0;
            case 1002:
                int[] iArr716 = this.MediaMetadataCompat;
                int i1498 = this.AudioAttributesImplApi26Parcelizer;
                iArr716[i1498] = 32;
                this.AudioAttributesImplApi26Parcelizer = i1498;
                iArr716[i1498 - 1] = iArr716[i1498 - 1] / iArr716[i1498];
                this.AudioAttributesImplApi26Parcelizer = i1498 + 1;
                iArr716[i1498] = 1;
                return 0;
            case 1003:
                int i1499 = this.AudioAttributesImplApi26Parcelizer;
                int i1500 = i1499 - 1;
                int[] iArr717 = this.MediaMetadataCompat;
                iArr717[i1499 - 2] = iArr717[i1499 - 2] << iArr717[i1500];
                this.AudioAttributesImplApi26Parcelizer = i1499;
                int i1501 = iArr717[i1499 - 2];
                iArr717[i1500] = i1501;
                iArr717[i1499 - 2] = iArr717[i1499 - 3];
                iArr717[i1499 - 3] = iArr717[i1499 - 4];
                iArr717[i1499 - 4] = i1501;
                return 0;
            case 1004:
                int[] iArr718 = this.MediaMetadataCompat;
                int i1502 = this.AudioAttributesImplApi26Parcelizer;
                iArr718[i1502] = 1;
                iArr718[i1502 + 2] = iArr718[i1502];
                iArr718[i1502 + 1] = iArr718[i1502 - 1];
                int i1503 = i1502 + 2;
                this.AudioAttributesImplApi26Parcelizer = i1503;
                iArr718[i1502 + 1] = iArr718[i1502 + 1] & iArr718[i1503];
                return 0;
            case 1005:
                int i1504 = this.AudioAttributesImplApi26Parcelizer;
                int i1505 = i1504 - 1;
                int[] iArr719 = this.MediaMetadataCompat;
                iArr719[i1504 - 2] = iArr719[i1504 - 2] & iArr719[i1505];
                iArr719[i1505] = 288;
                int i1506 = i1504 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1506;
                iArr719[i1504 - 2] = iArr719[i1504 - 2] * iArr719[i1506];
                return 0;
            case AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE /* 1006 */:
                int i1507 = this.AudioAttributesImplApi26Parcelizer;
                int i1508 = i1507 - 1;
                int[] iArr720 = this.MediaMetadataCompat;
                iArr720[i1507 - 2] = iArr720[i1507 - 2] + iArr720[i1508];
                Object[] objArr518 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i1507;
                objArr518[i1508] = objArr518[19];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_ENABLED /* 1007 */:
                int[] iArr721 = this.MediaMetadataCompat;
                int i1509 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1509 + 2;
                iArr721[i1509 + 1] = iArr721[i1509 - 1];
                iArr721[i1509] = iArr721[i1509 - 2];
                iArr721[i1509 + 1] = -iArr721[i1509 + 1];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED /* 1008 */:
                int[] iArr722 = this.MediaMetadataCompat;
                int i1510 = this.AudioAttributesImplApi26Parcelizer;
                iArr722[i1510] = iArr722[i1510 - 1];
                iArr722[i1510 + 1] = iArr722[i1510];
                this.AudioAttributesImplApi26Parcelizer = i1510 + 3;
                iArr722[i1510 + 2] = 19;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED /* 1009 */:
                int[] iArr723 = this.MediaMetadataCompat;
                int i1511 = this.AudioAttributesImplApi26Parcelizer;
                int i1512 = iArr723[i1511 - 1];
                iArr723[i1511 - 1] = iArr723[i1511 - 2];
                iArr723[i1511 - 2] = i1512;
                iArr723[i1511] = -16383;
                this.AudioAttributesImplApi26Parcelizer = i1511;
                iArr723[i1511 - 1] = iArr723[i1511] | iArr723[i1511 - 1];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING /* 1010 */:
                int i1513 = this.AudioAttributesImplApi26Parcelizer;
                int i1514 = i1513 - 1;
                int[] iArr724 = this.MediaMetadataCompat;
                iArr724[i1513 - 2] = iArr724[i1513 - 2] + iArr724[i1514];
                this.AudioAttributesImplApi26Parcelizer = i1513;
                iArr724[i1514] = 8192;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_UNDERRUN /* 1011 */:
                int i1515 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i1515 - 1] = null;
                int i1516 = i1515 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1516;
                int[] iArr725 = this.MediaMetadataCompat;
                iArr725[i1515 - 3] = iArr725[i1515 - 3] | iArr725[i1516];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED /* 1012 */:
                int[] iArr726 = this.MediaMetadataCompat;
                int i1517 = this.AudioAttributesImplApi26Parcelizer;
                int i1518 = iArr726[i1517 - 1];
                iArr726[i1517 - 1] = iArr726[i1517 - 2];
                iArr726[i1517 - 2] = i1518;
                iArr726[i1517] = 29;
                this.AudioAttributesImplApi26Parcelizer = i1517;
                iArr726[i1517 - 1] = iArr726[i1517 - 1] >> iArr726[i1517];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DISABLED /* 1013 */:
                int[] iArr727 = this.MediaMetadataCompat;
                int i1519 = this.AudioAttributesImplApi26Parcelizer;
                iArr727[i1519] = -15;
                this.AudioAttributesImplApi26Parcelizer = i1519;
                iArr727[i1519 - 1] = iArr727[i1519] | iArr727[i1519 - 1];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_SINK_ERROR /* 1014 */:
                int i1520 = this.AudioAttributesImplApi26Parcelizer;
                int i1521 = i1520 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1521;
                int[] iArr728 = this.MediaMetadataCompat;
                iArr728[i1520 - 2] = iArr728[i1520 - 2] << iArr728[i1521];
                int i1522 = iArr728[i1520 - 2];
                iArr728[i1520 - 2] = iArr728[i1520 - 3];
                iArr728[i1520 - 3] = i1522;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_ENABLED /* 1015 */:
                int[] iArr729 = this.MediaMetadataCompat;
                int i1523 = this.AudioAttributesImplApi26Parcelizer;
                iArr729[i1523] = -15;
                this.AudioAttributesImplApi26Parcelizer = i1523;
                iArr729[i1523 - 1] = iArr729[i1523] ^ iArr729[i1523 - 1];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED /* 1016 */:
                int i1524 = this.AudioAttributesImplApi26Parcelizer;
                int i1525 = i1524 - 1;
                int[] iArr730 = this.MediaMetadataCompat;
                iArr730[i1524 - 2] = iArr730[i1524 - 2] - iArr730[i1525];
                this.AudioAttributesImplApi26Parcelizer = i1524;
                iArr730[i1525] = 8;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED /* 1017 */:
                int[] iArr731 = this.MediaMetadataCompat;
                int i1526 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1526 + 1;
                iArr731[i1526] = -2;
                return 0;
            case AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES /* 1018 */:
                int i1527 = this.AudioAttributesImplApi26Parcelizer;
                int i1528 = i1527 - 1;
                int[] iArr732 = this.MediaMetadataCompat;
                iArr732[i1527 - 2] = iArr732[i1527 - 2] - iArr732[i1528];
                iArr732[i1528] = 1;
                int i1529 = i1527 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1529;
                iArr732[i1527 - 2] = iArr732[i1527 - 2] - iArr732[i1529];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED /* 1019 */:
                int i1530 = this.AudioAttributesImplApi26Parcelizer;
                int i1531 = i1530 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1531;
                int[] iArr733 = this.MediaMetadataCompat;
                iArr733[i1530 - 2] = iArr733[i1531] ^ iArr733[i1530 - 2];
                iArr733[i1530 - 2] = -iArr733[i1530 - 2];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DISABLED /* 1020 */:
                int[] iArr734 = this.MediaMetadataCompat;
                int i1532 = this.AudioAttributesImplApi26Parcelizer;
                iArr734[i1532] = 4;
                iArr734[i1532 + 2] = iArr734[i1532];
                iArr734[i1532 + 1] = iArr734[i1532 - 1];
                int i1533 = i1532 + 2;
                this.AudioAttributesImplApi26Parcelizer = i1533;
                iArr734[i1532 + 1] = iArr734[i1532 + 1] ^ iArr734[i1533];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET /* 1021 */:
                int i1534 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i1534 - 1] = null;
                int i1535 = i1534 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1535;
                int[] iArr735 = this.MediaMetadataCompat;
                iArr735[i1534 - 3] = iArr735[i1534 - 3] & iArr735[i1535];
                return 0;
            case AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED /* 1022 */:
                int i1536 = this.AudioAttributesImplApi26Parcelizer;
                int i1537 = i1536 - 1;
                int[] iArr736 = this.MediaMetadataCompat;
                iArr736[i1536 - 2] = iArr736[i1536 - 2] + iArr736[i1537];
                iArr736[i1537] = iArr736[i1536 - 2];
                this.AudioAttributesImplApi26Parcelizer = i1536 + 1;
                iArr736[i1536] = 15;
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_LOADED /* 1023 */:
                int i1538 = this.AudioAttributesImplApi26Parcelizer;
                int i1539 = i1538 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1539;
                int[] iArr737 = this.MediaMetadataCompat;
                iArr737[i1538 - 2] = iArr737[i1539] ^ iArr737[i1538 - 2];
                int i1540 = iArr737[i1538 - 2];
                iArr737[i1538 - 2] = iArr737[i1538 - 3];
                iArr737[i1538 - 3] = i1540;
                return 0;
            case 1024:
                int i1541 = this.AudioAttributesImplApi26Parcelizer;
                int i1542 = i1541 - 1;
                int[] iArr738 = this.MediaMetadataCompat;
                iArr738[i1541 - 2] = iArr738[i1541 - 2] & iArr738[i1542];
                this.AudioAttributesImplApi26Parcelizer = i1541;
                iArr738[i1542] = 1;
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_RESTORED /* 1025 */:
                int i1543 = this.AudioAttributesImplApi26Parcelizer;
                int i1544 = i1543 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1544;
                int[] iArr739 = this.MediaMetadataCompat;
                iArr739[i1543 - 2] = iArr739[i1543 - 2] / iArr739[i1544];
                iArr739[i1544] = -2;
                int i1545 = i1543 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1545;
                iArr739[i1543 - 2] = iArr739[i1543 - 2] - iArr739[i1545];
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_REMOVED /* 1026 */:
                int[] iArr740 = this.MediaMetadataCompat;
                int i1546 = this.AudioAttributesImplApi26Parcelizer;
                iArr740[i1546 - 1] = -iArr740[i1546 - 1];
                int i1547 = i1546 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1547;
                iArr740[i1546 - 2] = iArr740[i1546 - 2] & iArr740[i1547];
                return 0;
            case AnalyticsListener.EVENT_DRM_SESSION_RELEASED /* 1027 */:
                int[] iArr741 = this.MediaMetadataCompat;
                int i1548 = this.AudioAttributesImplApi26Parcelizer;
                iArr741[i1548] = 338;
                this.AudioAttributesImplApi26Parcelizer = i1548;
                iArr741[i1548 - 1] = iArr741[i1548 - 1] * iArr741[i1548];
                return 0;
            case AnalyticsListener.EVENT_PLAYER_RELEASED /* 1028 */:
                int[] iArr742 = this.MediaMetadataCompat;
                int i1549 = this.AudioAttributesImplApi26Parcelizer;
                int i1550 = iArr742[i1549 - 1];
                iArr742[i1549 - 1] = iArr742[i1549 - 2];
                iArr742[i1549 - 2] = i1550;
                int i1551 = i1549 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1551;
                iArr742[i1549 - 2] = iArr742[i1549 - 2] / iArr742[i1551];
                int i1552 = i1549 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1552;
                iArr742[i1549 - 3] = iArr742[i1549 - 3] + iArr742[i1552];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_CODEC_ERROR /* 1029 */:
                int i1553 = this.AudioAttributesImplApi26Parcelizer;
                int i1554 = i1553 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1554;
                long[] jArr65 = this.RatingCompat;
                jArr65[i1553 - 2] = jArr65[i1553 - 2] + jArr65[i1554];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_CODEC_ERROR /* 1030 */:
                Object[] objArr519 = this.MediaBrowserCompatSearchResultReceiver;
                int i1555 = this.AudioAttributesImplApi26Parcelizer;
                objArr519[i1555] = objArr519[13];
                this.AudioAttributesImplApi26Parcelizer = i1555;
                Object obj479 = objArr519[i1555];
                objArr519[i1555] = null;
                objArr519[124] = obj479;
                return 0;
            case 1031:
                Object[] objArr520 = this.MediaBrowserCompatSearchResultReceiver;
                int i1556 = this.AudioAttributesImplApi26Parcelizer;
                objArr520[i1556] = objArr520[124];
                int[] iArr743 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1556 + 2;
                iArr743[i1556 + 1] = 0;
                return 0;
            case 1032:
                int i1557 = this.AudioAttributesImplApi26Parcelizer;
                int i1558 = i1557 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1558;
                int[] iArr744 = this.MediaMetadataCompat;
                iArr744[i1557 - 2] = iArr744[i1557 - 2] * iArr744[i1558];
                iArr744[i1557 - 2] = -iArr744[i1557 - 2];
                return 0;
            case 1033:
                int[] iArr745 = this.MediaMetadataCompat;
                int i1559 = this.AudioAttributesImplApi26Parcelizer;
                iArr745[i1559] = -1;
                iArr745[i1559 - 1] = iArr745[i1559 - 1] ^ iArr745[i1559];
                int i1560 = i1559 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1560;
                iArr745[i1559 - 2] = iArr745[i1559 - 2] - iArr745[i1560];
                return 0;
            case 1034:
                int[] iArr746 = this.MediaMetadataCompat;
                int i1561 = this.AudioAttributesImplApi26Parcelizer;
                iArr746[i1561 - 1] = -iArr746[i1561 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1561 + 1;
                iArr746[i1561] = -1;
                return 0;
            case 1035:
                int i1562 = this.AudioAttributesImplApi26Parcelizer;
                int i1563 = i1562 - 1;
                int[] iArr747 = this.MediaMetadataCompat;
                iArr747[i1562 - 2] = iArr747[i1562 - 2] - iArr747[i1563];
                this.AudioAttributesImplApi26Parcelizer = i1562;
                iArr747[i1563] = 1;
                return 0;
            case 1036:
                int[] iArr748 = this.MediaMetadataCompat;
                int i1564 = this.AudioAttributesImplApi26Parcelizer;
                iArr748[i1564] = 1;
                iArr748[i1564 - 1] = iArr748[i1564 - 1] << iArr748[i1564];
                int i1565 = i1564 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1565;
                iArr748[i1564 - 2] = iArr748[i1564 - 2] + iArr748[i1565];
                return 0;
            case 1037:
                int[] iArr749 = this.MediaMetadataCompat;
                int i1566 = this.AudioAttributesImplApi26Parcelizer;
                iArr749[i1566] = iArr749[i1566 - 1];
                iArr749[i1566 + 1] = iArr749[i1566];
                this.AudioAttributesImplApi26Parcelizer = i1566 + 3;
                iArr749[i1566 + 2] = 26;
                return 0;
            case 1038:
                int[] iArr750 = this.MediaMetadataCompat;
                int i1567 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1567 + 1;
                iArr750[i1567] = -127;
                return 0;
            case 1039:
                int[] iArr751 = this.MediaMetadataCompat;
                int i1568 = this.AudioAttributesImplApi26Parcelizer;
                int i1569 = iArr751[i1568 - 1];
                iArr751[i1568 - 1] = iArr751[i1568 - 2];
                iArr751[i1568 - 2] = i1569;
                iArr751[i1568] = -127;
                this.AudioAttributesImplApi26Parcelizer = i1568;
                iArr751[i1568 - 1] = iArr751[i1568] ^ iArr751[i1568 - 1];
                return 0;
            case 1040:
                int[] iArr752 = this.MediaMetadataCompat;
                int i1570 = this.AudioAttributesImplApi26Parcelizer;
                iArr752[i1570] = 1;
                iArr752[i1570 + 2] = iArr752[i1570];
                iArr752[i1570 + 1] = iArr752[i1570 - 1];
                int i1571 = i1570 + 2;
                this.AudioAttributesImplApi26Parcelizer = i1571;
                iArr752[i1570 + 1] = iArr752[i1570 + 1] ^ iArr752[i1571];
                return 0;
            case 1041:
                int[] iArr753 = this.MediaMetadataCompat;
                int i1572 = this.AudioAttributesImplApi26Parcelizer;
                iArr753[i1572 + 1] = iArr753[i1572 - 1];
                iArr753[i1572] = iArr753[i1572 - 2];
                int i1573 = i1572 + 1;
                iArr753[i1572] = iArr753[i1572] & iArr753[i1573];
                this.AudioAttributesImplApi26Parcelizer = i1572 + 2;
                int i1574 = iArr753[i1572];
                iArr753[i1573] = i1574;
                iArr753[i1572] = iArr753[i1572 - 1];
                iArr753[i1572 - 1] = iArr753[i1572 - 2];
                iArr753[i1572 - 2] = i1574;
                return 0;
            case 1042:
                int i1575 = this.AudioAttributesImplApi26Parcelizer;
                int i1576 = i1575 - 1;
                int[] iArr754 = this.MediaMetadataCompat;
                iArr754[i1575 - 2] = iArr754[i1575 - 2] + iArr754[i1576];
                int i1577 = iArr754[i1575 - 2];
                iArr754[i1575 - 2] = iArr754[i1575 - 3];
                iArr754[i1575 - 3] = i1577;
                this.AudioAttributesImplApi26Parcelizer = i1575;
                iArr754[i1576] = 21;
                return 0;
            case 1043:
                int i1578 = this.AudioAttributesImplApi26Parcelizer;
                int i1579 = i1578 - 1;
                int[] iArr755 = this.MediaMetadataCompat;
                iArr755[i1578 - 2] = iArr755[i1578 - 2] >> iArr755[i1579];
                this.AudioAttributesImplApi26Parcelizer = i1578;
                iArr755[i1579] = iArr755[i1578 - 2];
                return 0;
            case 1044:
                int[] iArr756 = this.MediaMetadataCompat;
                int i1580 = this.AudioAttributesImplApi26Parcelizer;
                iArr756[i1580] = -4095;
                this.AudioAttributesImplApi26Parcelizer = i1580;
                iArr756[i1580 - 1] = iArr756[i1580 - 1] & iArr756[i1580];
                int i1581 = iArr756[i1580 - 1];
                iArr756[i1580 - 1] = iArr756[i1580 - 2];
                iArr756[i1580 - 2] = i1581;
                return 0;
            case 1045:
                int[] iArr757 = this.MediaMetadataCompat;
                int i1582 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1582 + 1;
                iArr757[i1582] = -4095;
                return 0;
            case 1046:
                int[] iArr758 = this.MediaMetadataCompat;
                int i1583 = this.AudioAttributesImplApi26Parcelizer;
                iArr758[i1583] = 2048;
                this.AudioAttributesImplApi26Parcelizer = i1583;
                iArr758[i1583 - 1] = iArr758[i1583 - 1] / iArr758[i1583];
                this.AudioAttributesImplApi26Parcelizer = i1583 + 1;
                iArr758[i1583] = 1;
                return 0;
            case 1047:
                int i1584 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr759 = this.MediaMetadataCompat;
                iArr759[i1584 - 2] = iArr759[i1584 - 2] + iArr759[i1584 - 1];
                int i1585 = i1584 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1585;
                iArr759[i1584 - 3] = iArr759[i1585] ^ iArr759[i1584 - 3];
                iArr759[i1584 - 3] = -iArr759[i1584 - 3];
                return 0;
            case 1048:
                int[] iArr760 = this.MediaMetadataCompat;
                int i1586 = this.AudioAttributesImplApi26Parcelizer;
                iArr760[i1586] = -8;
                iArr760[i1586 - 1] = iArr760[i1586 - 1] - iArr760[i1586];
                this.AudioAttributesImplApi26Parcelizer = i1586 + 1;
                iArr760[i1586] = 1;
                return 0;
            case 1049:
                int i1587 = this.AudioAttributesImplApi26Parcelizer;
                int i1588 = i1587 - 1;
                int[] iArr761 = this.MediaMetadataCompat;
                iArr761[i1587 - 2] = iArr761[i1587 - 2] - iArr761[i1588];
                this.AudioAttributesImplApi26Parcelizer = i1587;
                iArr761[i1588] = iArr761[i1587 - 2];
                return 0;
            case 1050:
                int[] iArr762 = this.MediaMetadataCompat;
                int i1589 = this.AudioAttributesImplApi26Parcelizer;
                iArr762[i1589] = 20;
                this.AudioAttributesImplApi26Parcelizer = i1589;
                iArr762[i1589 - 1] = iArr762[i1589 - 1] >> iArr762[i1589];
                return 0;
            case 1051:
                int[] iArr763 = this.MediaMetadataCompat;
                int i1590 = this.AudioAttributesImplApi26Parcelizer;
                iArr763[i1590] = iArr763[i1590 - 1];
                iArr763[i1590 + 1] = -8191;
                int i1591 = i1590 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1591;
                iArr763[i1590] = iArr763[i1590] | iArr763[i1591];
                return 0;
            case 1052:
                int[] iArr764 = this.MediaMetadataCompat;
                int i1592 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1592 + 1;
                iArr764[i1592] = -8191;
                return 0;
            case 1053:
                int i1593 = this.AudioAttributesImplApi26Parcelizer;
                int i1594 = i1593 - 1;
                int[] iArr765 = this.MediaMetadataCompat;
                iArr765[i1593 - 2] = iArr765[i1593 - 2] - iArr765[i1594];
                this.AudioAttributesImplApi26Parcelizer = i1593;
                iArr765[i1594] = 4096;
                return 0;
            case 1054:
                int i1595 = this.AudioAttributesImplApi26Parcelizer;
                int i1596 = i1595 - 1;
                int[] iArr766 = this.MediaMetadataCompat;
                iArr766[i1595 - 2] = iArr766[i1595 - 2] + iArr766[i1596];
                this.AudioAttributesImplApi26Parcelizer = i1595;
                iArr766[i1596] = -2;
                return 0;
            case 1055:
                int[] iArr767 = this.MediaMetadataCompat;
                int i1597 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1597 + 1;
                iArr767[i1597] = 1507;
                return 0;
            case 1056:
                int i1598 = this.AudioAttributesImplApi26Parcelizer;
                int i1599 = i1598 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1599;
                int[] iArr768 = this.MediaMetadataCompat;
                iArr768[i1598 - 2] = iArr768[i1598 - 2] / iArr768[i1599];
                Object[] objArr521 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i1598;
                objArr521[i1599] = objArr521[14];
                return 0;
            case 1057:
                int[] iArr769 = this.MediaMetadataCompat;
                int i1600 = this.AudioAttributesImplApi26Parcelizer;
                iArr769[i1600] = -1;
                this.AudioAttributesImplApi26Parcelizer = i1600;
                iArr769[i1600 - 1] = iArr769[i1600] ^ iArr769[i1600 - 1];
                return 0;
            case 1058:
                int[] iArr770 = this.MediaMetadataCompat;
                int i1601 = this.AudioAttributesImplApi26Parcelizer;
                iArr770[i1601 + 1] = iArr770[i1601 - 1];
                iArr770[i1601] = iArr770[i1601 - 2];
                int i1602 = i1601 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1602;
                iArr770[i1601] = iArr770[i1601] ^ iArr770[i1602];
                return 0;
            case 1059:
                int[] iArr771 = this.MediaMetadataCompat;
                int i1603 = this.AudioAttributesImplApi26Parcelizer;
                iArr771[i1603] = 16;
                this.AudioAttributesImplApi26Parcelizer = i1603;
                iArr771[i1603 - 1] = iArr771[i1603 - 1] >> iArr771[i1603];
                return 0;
            case 1060:
                int[] iArr772 = this.MediaMetadataCompat;
                int i1604 = this.AudioAttributesImplApi26Parcelizer;
                iArr772[i1604] = 22;
                this.AudioAttributesImplApi26Parcelizer = i1604;
                iArr772[i1604 - 1] = iArr772[i1604 - 1] >> iArr772[i1604];
                return 0;
            case 1061:
                int[] iArr773 = this.MediaMetadataCompat;
                int i1605 = this.AudioAttributesImplApi26Parcelizer;
                iArr773[i1605] = 2046;
                iArr773[i1605 - 1] = iArr773[i1605 - 1] - iArr773[i1605];
                this.AudioAttributesImplApi26Parcelizer = i1605 + 1;
                iArr773[i1605] = 1;
                return 0;
            case 1062:
                int i1606 = this.AudioAttributesImplApi26Parcelizer;
                int i1607 = i1606 - 1;
                int[] iArr774 = this.MediaMetadataCompat;
                iArr774[i1606 - 2] = iArr774[i1606 - 2] - iArr774[i1607];
                iArr774[i1607] = 1024;
                int i1608 = i1606 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1608;
                iArr774[i1606 - 2] = iArr774[i1606 - 2] / iArr774[i1608];
                return 0;
            case 1063:
                int i1609 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr775 = this.MediaMetadataCompat;
                iArr775[i1609 - 2] = iArr775[i1609 - 2] + iArr775[i1609 - 1];
                int i1610 = i1609 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1610;
                iArr775[i1609 - 3] = iArr775[i1609 - 3] ^ iArr775[i1610];
                return 0;
            case 1064:
                int[] iArr776 = this.MediaMetadataCompat;
                int i1611 = this.AudioAttributesImplApi26Parcelizer;
                iArr776[i1611 - 1] = -iArr776[i1611 - 1];
                iArr776[i1611] = 6;
                this.AudioAttributesImplApi26Parcelizer = i1611 + 3;
                iArr776[i1611 + 2] = iArr776[i1611];
                iArr776[i1611 + 1] = iArr776[i1611 - 1];
                return 0;
            case 1065:
                int i1612 = this.AudioAttributesImplApi26Parcelizer;
                int i1613 = i1612 - 1;
                int[] iArr777 = this.MediaMetadataCompat;
                iArr777[i1612 - 2] = iArr777[i1612 - 2] & iArr777[i1613];
                int i1614 = iArr777[i1612 - 2];
                iArr777[i1613] = i1614;
                iArr777[i1612 - 2] = iArr777[i1612 - 3];
                iArr777[i1612 - 3] = iArr777[i1612 - 4];
                iArr777[i1612 - 4] = i1614;
                int i1615 = i1612 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1615;
                this.MediaBrowserCompatSearchResultReceiver[i1615] = null;
                return 0;
            case 1066:
                int[] iArr778 = this.MediaMetadataCompat;
                int i1616 = this.AudioAttributesImplApi26Parcelizer;
                iArr778[i1616] = iArr778[i1616 - 1];
                iArr778[i1616 + 1] = 25;
                int i1617 = i1616 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1617;
                iArr778[i1616] = iArr778[i1616] >> iArr778[i1617];
                return 0;
            case 1067:
                int[] iArr779 = this.MediaMetadataCompat;
                int i1618 = this.AudioAttributesImplApi26Parcelizer;
                iArr779[i1618] = iArr779[i1618 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1618 + 2;
                iArr779[i1618 + 1] = -255;
                return 0;
            case 1068:
                int[] iArr780 = this.MediaMetadataCompat;
                int i1619 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1619 + 1;
                iArr780[i1619] = -255;
                return 0;
            case 1069:
                int[] iArr781 = this.MediaMetadataCompat;
                int i1620 = this.AudioAttributesImplApi26Parcelizer;
                iArr781[i1620] = 1;
                this.AudioAttributesImplApi26Parcelizer = i1620;
                iArr781[i1620 - 1] = iArr781[i1620 - 1] - iArr781[i1620];
                return 0;
            case 1070:
                int[] iArr782 = this.MediaMetadataCompat;
                int i1621 = this.AudioAttributesImplApi26Parcelizer;
                iArr782[i1621] = 1690;
                this.AudioAttributesImplApi26Parcelizer = i1621;
                iArr782[i1621 - 1] = iArr782[i1621 - 1] * iArr782[i1621];
                return 0;
            case 1071:
                Object[] objArr522 = this.MediaBrowserCompatSearchResultReceiver;
                int i1622 = this.AudioAttributesImplApi26Parcelizer;
                objArr522[i1622] = objArr522[16];
                Object obj480 = objArr522[i1622];
                objArr522[i1622] = null;
                objArr522[112] = obj480;
                this.AudioAttributesImplApi26Parcelizer = i1622 + 1;
                objArr522[i1622] = obj480;
                return 0;
            case 1072:
                int i1623 = this.AudioAttributesImplApi26Parcelizer;
                int i1624 = i1623 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1624;
                this.MediaBrowserCompatSearchResultReceiver[i1624] = null;
                int[] iArr783 = this.MediaMetadataCompat;
                iArr783[i1623 - 2] = -iArr783[i1623 - 2];
                return 0;
            case 1073:
                int i1625 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr784 = this.MediaMetadataCompat;
                iArr784[i1625 - 2] = iArr784[i1625 - 2] << iArr784[i1625 - 1];
                int i1626 = i1625 - 2;
                iArr784[i1625 - 3] = iArr784[i1625 - 3] + iArr784[i1626];
                this.AudioAttributesImplApi26Parcelizer = i1625 - 1;
                iArr784[i1626] = iArr784[i1625 - 3];
                return 0;
            case 1074:
                int[] iArr785 = this.MediaMetadataCompat;
                int i1627 = this.AudioAttributesImplApi26Parcelizer;
                iArr785[i1627] = iArr785[i1627 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1627 + 2;
                iArr785[i1627 + 1] = 29;
                return 0;
            case 1075:
                int[] iArr786 = this.MediaMetadataCompat;
                int i1628 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1628 + 1;
                iArr786[i1628] = -15;
                return 0;
            case 1076:
                int[] iArr787 = this.MediaMetadataCompat;
                int i1629 = this.AudioAttributesImplApi26Parcelizer;
                int i1630 = iArr787[i1629 - 1];
                iArr787[i1629 - 1] = iArr787[i1629 - 2];
                iArr787[i1629 - 2] = i1630;
                iArr787[i1629] = -15;
                this.AudioAttributesImplApi26Parcelizer = i1629;
                iArr787[i1629 - 1] = iArr787[i1629] & iArr787[i1629 - 1];
                return 0;
            case 1077:
                int i1631 = this.AudioAttributesImplApi26Parcelizer;
                int i1632 = i1631 - 1;
                int[] iArr788 = this.MediaMetadataCompat;
                iArr788[i1631 - 2] = iArr788[i1631 - 2] + iArr788[i1632];
                iArr788[i1632] = 8;
                int i1633 = i1631 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1633;
                iArr788[i1631 - 2] = iArr788[i1631 - 2] / iArr788[i1633];
                return 0;
            case 1078:
                int[] iArr789 = this.MediaMetadataCompat;
                int i1634 = this.AudioAttributesImplApi26Parcelizer;
                iArr789[i1634] = 1;
                this.AudioAttributesImplApi26Parcelizer = i1634 + 3;
                iArr789[i1634 + 2] = iArr789[i1634];
                iArr789[i1634 + 1] = iArr789[i1634 - 1];
                return 0;
            case 1079:
                int i1635 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i1635 - 1] = null;
                int[] iArr790 = this.MediaMetadataCompat;
                iArr790[i1635 - 3] = iArr790[i1635 - 2] ^ iArr790[i1635 - 3];
                int i1636 = i1635 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1636;
                iArr790[i1635 - 4] = iArr790[i1635 - 4] - iArr790[i1636];
                return 0;
            case 1080:
                int i1637 = this.AudioAttributesImplApi26Parcelizer;
                int i1638 = i1637 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1638;
                int[] iArr791 = this.MediaMetadataCompat;
                iArr791[i1637 - 2] = iArr791[i1638] & iArr791[i1637 - 2];
                int i1639 = iArr791[i1637 - 2];
                iArr791[i1637 - 2] = iArr791[i1637 - 3];
                iArr791[i1637 - 3] = i1639;
                return 0;
            case 1081:
                int i1640 = this.AudioAttributesImplApi26Parcelizer;
                int i1641 = i1640 - 1;
                int[] iArr792 = this.MediaMetadataCompat;
                iArr792[i1640 - 2] = iArr792[i1640 - 2] | iArr792[i1641];
                iArr792[i1641] = 1;
                int i1642 = i1640 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1642;
                iArr792[i1640 - 2] = iArr792[i1640 - 2] << iArr792[i1642];
                return 0;
            case 1082:
                int[] iArr793 = this.MediaMetadataCompat;
                int i1643 = this.AudioAttributesImplApi26Parcelizer;
                int i1644 = iArr793[i1643 - 1];
                iArr793[i1643] = i1644;
                iArr793[i1643 - 1] = iArr793[i1643 - 2];
                iArr793[i1643 - 2] = iArr793[i1643 - 3];
                iArr793[i1643 - 3] = i1644;
                this.MediaBrowserCompatSearchResultReceiver[i1643] = null;
                int i1645 = i1643 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1645;
                iArr793[i1643 - 2] = iArr793[i1643 - 2] ^ iArr793[i1645];
                return 0;
            case 1083:
                int i1646 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr794 = this.MediaMetadataCompat;
                iArr794[i1646 - 2] = iArr794[i1646 - 2] - iArr794[i1646 - 1];
                int i1647 = i1646 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1647;
                iArr794[i1646 - 3] = iArr794[i1647] ^ iArr794[i1646 - 3];
                iArr794[i1646 - 3] = -iArr794[i1646 - 3];
                return 0;
            case 1084:
                int[] iArr795 = this.MediaMetadataCompat;
                int i1648 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1648 + 1;
                iArr795[i1648] = -9;
                return 0;
            case 1085:
                int[] iArr796 = this.MediaMetadataCompat;
                int i1649 = this.AudioAttributesImplApi26Parcelizer;
                iArr796[i1649] = -2047;
                this.AudioAttributesImplApi26Parcelizer = i1649;
                iArr796[i1649 - 1] = iArr796[i1649] & iArr796[i1649 - 1];
                return 0;
            case 1086:
                int[] iArr797 = this.MediaMetadataCompat;
                int i1650 = this.AudioAttributesImplApi26Parcelizer;
                iArr797[i1650] = -2047;
                this.AudioAttributesImplApi26Parcelizer = i1650;
                iArr797[i1650 - 1] = iArr797[i1650] | iArr797[i1650 - 1];
                return 0;
            case 1087:
                int[] iArr798 = this.MediaMetadataCompat;
                int i1651 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1651 + 1;
                iArr798[i1651] = 1024;
                return 0;
            case 1088:
                int i1652 = this.AudioAttributesImplApi26Parcelizer;
                int i1653 = i1652 - 1;
                int[] iArr799 = this.MediaMetadataCompat;
                iArr799[i1652 - 2] = iArr799[i1652 - 2] & iArr799[i1653];
                this.AudioAttributesImplApi26Parcelizer = i1652;
                iArr799[i1653] = 740;
                return 0;
            case 1089:
                int i1654 = this.AudioAttributesImplApi26Parcelizer;
                int i1655 = i1654 - 1;
                Object[] objArr523 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj481 = objArr523[i1655];
                objArr523[i1655] = null;
                objArr523[14] = obj481;
                this.AudioAttributesImplApi26Parcelizer = i1654;
                objArr523[i1655] = objArr523[12];
                return 0;
            case 1090:
                int[] iArr800 = this.MediaMetadataCompat;
                int i1656 = this.AudioAttributesImplApi26Parcelizer;
                iArr800[i1656] = 123;
                iArr800[i1656 - 1] = iArr800[i1656 - 1] + iArr800[i1656];
                this.AudioAttributesImplApi26Parcelizer = i1656 + 1;
                iArr800[i1656] = iArr800[i1656 - 1];
                return 0;
            case 1091:
                int[] iArr801 = this.MediaMetadataCompat;
                int i1657 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1657 + 1;
                iArr801[i1657] = 79;
                return 0;
            case 1092:
                Object[] objArr524 = this.MediaBrowserCompatSearchResultReceiver;
                int i1658 = this.AudioAttributesImplApi26Parcelizer;
                objArr524[i1658] = objArr524[21];
                int[] iArr802 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1658 + 2;
                iArr802[i1658 + 1] = iArr802[20];
                return 0;
            case 1093:
                int[] iArr803 = this.MediaMetadataCompat;
                iArr803[20] = iArr803[20] + 127;
                return 0;
            case 1094:
                int[] iArr804 = this.MediaMetadataCompat;
                int i1659 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1659 + 1;
                iArr804[i1659] = 107;
                return 0;
            case 1095:
                int[] iArr805 = this.MediaMetadataCompat;
                int i1660 = this.AudioAttributesImplApi26Parcelizer;
                iArr805[i1660] = 119;
                this.AudioAttributesImplApi26Parcelizer = i1660;
                iArr805[i1660 - 1] = iArr805[i1660 - 1] + iArr805[i1660];
                return 0;
            case 1096:
                int[] iArr806 = this.MediaMetadataCompat;
                int i1661 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1661 + 1;
                iArr806[i1661] = 7;
                return 0;
            case 1097:
                int[] iArr807 = this.MediaMetadataCompat;
                int i1662 = this.AudioAttributesImplApi26Parcelizer;
                iArr807[i1662] = 35;
                iArr807[i1662 - 1] = iArr807[i1662 - 1] + iArr807[i1662];
                this.AudioAttributesImplApi26Parcelizer = i1662 + 1;
                iArr807[i1662] = iArr807[i1662 - 1];
                return 0;
            case 1098:
                int[] iArr808 = this.MediaMetadataCompat;
                int i1663 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1663 + 1;
                iArr808[i1663] = 125;
                return 0;
            case 1099:
                int[] iArr809 = this.MediaMetadataCompat;
                int i1664 = this.AudioAttributesImplApi26Parcelizer;
                iArr809[i1664] = 89;
                iArr809[i1664 - 1] = iArr809[i1664 - 1] + iArr809[i1664];
                this.AudioAttributesImplApi26Parcelizer = i1664 + 1;
                iArr809[i1664] = iArr809[i1664 - 1];
                return 0;
            case 1100:
                int[] iArr810 = this.MediaMetadataCompat;
                int i1665 = this.AudioAttributesImplApi26Parcelizer;
                iArr810[i1665] = 37;
                iArr810[i1665 - 1] = iArr810[i1665 - 1] + iArr810[i1665];
                this.AudioAttributesImplApi26Parcelizer = i1665 + 1;
                iArr810[i1665] = iArr810[i1665 - 1];
                return 0;
            case 1101:
                int[] iArr811 = this.MediaMetadataCompat;
                int i1666 = this.AudioAttributesImplApi26Parcelizer;
                iArr811[i1666] = iArr811[15];
                this.AudioAttributesImplApi26Parcelizer = i1666;
                Object[] objArr525 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj482 = objArr525[i1666 - 1];
                objArr525[i1666 - 1] = null;
                objArr525[i1666 - 1] = ((Object[]) obj482)[iArr811[i1666]];
                return 0;
            case 1102:
                int i1667 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1667;
                this.MediaBrowserCompatSearchResultReceiver[i1667] = null;
                int[] iArr812 = this.MediaMetadataCompat;
                iArr812[15] = iArr812[15] + 46;
                return 0;
            case 1103:
                int[] iArr813 = this.MediaMetadataCompat;
                int i1668 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1668 + 1;
                iArr813[i1668] = 42;
                return 0;
            case 1104:
                int[] iArr814 = this.MediaMetadataCompat;
                int i1669 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1669 + 1;
                iArr814[i1669] = 85;
                return 0;
            case 1105:
                int[] iArr815 = this.MediaMetadataCompat;
                int i1670 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1670 + 1;
                iArr815[i1670] = 36;
                return 0;
            case 1106:
                int[] iArr816 = this.MediaMetadataCompat;
                int i1671 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1671 + 1;
                iArr816[i1671] = 26;
                return 0;
            case 1107:
                int[] iArr817 = this.MediaMetadataCompat;
                int i1672 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1672 + 1;
                iArr817[i1672] = 43;
                return 0;
            case 1108:
                int[] iArr818 = this.MediaMetadataCompat;
                int i1673 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1673 + 1;
                iArr818[i1673] = 25;
                return 0;
            case 1109:
                int[] iArr819 = this.MediaMetadataCompat;
                int i1674 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1674 + 1;
                iArr819[i1674] = 9;
                return 0;
            case 1110:
                int[] iArr820 = this.MediaMetadataCompat;
                int i1675 = this.AudioAttributesImplApi26Parcelizer;
                iArr820[i1675] = 59;
                this.AudioAttributesImplApi26Parcelizer = i1675;
                iArr820[i1675 - 1] = iArr820[i1675 - 1] + iArr820[i1675];
                return 0;
            case 1111:
                int[] iArr821 = this.MediaMetadataCompat;
                int i1676 = this.AudioAttributesImplApi26Parcelizer;
                iArr821[i1676] = 85;
                this.AudioAttributesImplApi26Parcelizer = i1676;
                iArr821[i1676 - 1] = iArr821[i1676 - 1] + iArr821[i1676];
                return 0;
            case 1112:
                int[] iArr822 = this.MediaMetadataCompat;
                int i1677 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1677 + 1;
                iArr822[i1677] = 20;
                return 0;
            case 1113:
                int[] iArr823 = this.MediaMetadataCompat;
                int i1678 = this.AudioAttributesImplApi26Parcelizer;
                iArr823[i1678] = 33;
                this.AudioAttributesImplApi26Parcelizer = i1678;
                iArr823[i1678 - 1] = iArr823[i1678 - 1] + iArr823[i1678];
                return 0;
            case 1114:
                int[] iArr824 = this.MediaMetadataCompat;
                int i1679 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1679 + 1;
                iArr824[i1679] = -4;
                return 0;
            case 1115:
                int i1680 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1680;
                Object[] objArr526 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj483 = objArr526[i1680];
                objArr526[i1680] = null;
                objArr526[66] = obj483;
                return 0;
            case 1116:
                int i1681 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1681;
                Object[] objArr527 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj484 = objArr527[i1681];
                objArr527[i1681] = null;
                objArr527[67] = obj484;
                return 0;
            case 1117:
                int[] iArr825 = this.MediaMetadataCompat;
                int i1682 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1682 + 1;
                iArr825[i1682] = -46;
                return 0;
            case 1118:
                int i1683 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1683;
                Object[] objArr528 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj485 = objArr528[i1683];
                objArr528[i1683] = null;
                objArr528[68] = obj485;
                return 0;
            case 1119:
                int i1684 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1684;
                Object[] objArr529 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj486 = objArr529[i1684];
                objArr529[i1684] = null;
                objArr529[69] = obj486;
                return 0;
            case 1120:
                Object[] objArr530 = this.MediaBrowserCompatSearchResultReceiver;
                int i1685 = this.AudioAttributesImplApi26Parcelizer;
                objArr530[i1685] = objArr530[11];
                this.AudioAttributesImplApi26Parcelizer = i1685;
                Object obj487 = objArr530[i1685];
                objArr530[i1685] = null;
                objArr530[17] = obj487;
                return 0;
            case 1121:
                int i1686 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1686;
                long[] jArr66 = this.RatingCompat;
                jArr66[13] = jArr66[i1686];
                return 0;
            case 1122:
                Object[] objArr531 = this.MediaBrowserCompatSearchResultReceiver;
                int i1687 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1687 + 1;
                objArr531[i1687] = objArr531[66];
                return 0;
            case 1123:
                Object[] objArr532 = this.MediaBrowserCompatSearchResultReceiver;
                int i1688 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1688 + 1;
                objArr532[i1688] = objArr532[67];
                return 0;
            case 1124:
                int[] iArr826 = this.MediaMetadataCompat;
                int i1689 = this.AudioAttributesImplApi26Parcelizer;
                iArr826[i1689] = 52;
                this.AudioAttributesImplApi26Parcelizer = i1689;
                long[] jArr67 = this.RatingCompat;
                jArr67[i1689 - 1] = jArr67[i1689 - 1] << iArr826[i1689];
                return 0;
            case 1125:
                int i1690 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1690;
                long[] jArr68 = this.RatingCompat;
                jArr68[15] = jArr68[i1690];
                return 0;
            case 1126:
                int i1691 = this.AudioAttributesImplApi26Parcelizer;
                int i1692 = i1691 - 1;
                Object[] objArr533 = this.MediaBrowserCompatSearchResultReceiver;
                objArr533[i1692] = null;
                objArr533[i1692] = objArr533[i1691 - 2];
                this.AudioAttributesImplApi26Parcelizer = i1691 + 1;
                objArr533[i1691] = objArr533[12];
                return 0;
            case 1127:
                int i1693 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr827 = this.MediaMetadataCompat;
                iArr827[58] = iArr827[i1693 - 1];
                int i1694 = i1693 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1694;
                iArr827[57] = iArr827[i1694];
                return 0;
            case 1128:
                int i1695 = this.AudioAttributesImplApi26Parcelizer;
                int i1696 = i1695 - 1;
                Object[] objArr534 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj488 = objArr534[i1696];
                objArr534[i1696] = null;
                objArr534[56] = obj488;
                int i1697 = i1695 - 2;
                Object obj489 = objArr534[i1697];
                objArr534[i1697] = null;
                objArr534[55] = obj489;
                this.AudioAttributesImplApi26Parcelizer = i1695 - 1;
                objArr534[i1697] = obj489;
                return 0;
            case 1129:
                Object[] objArr535 = this.MediaBrowserCompatSearchResultReceiver;
                int i1698 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1698 + 1;
                objArr535[i1698] = objArr535[56];
                return 0;
            case 1130:
                Object[] objArr536 = this.MediaBrowserCompatSearchResultReceiver;
                int i1699 = this.AudioAttributesImplApi26Parcelizer;
                objArr536[i1699] = objArr536[56];
                int[] iArr828 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1699 + 2;
                iArr828[i1699 + 1] = 1;
                return 0;
            case 1131:
                int i1700 = this.AudioAttributesImplApi26Parcelizer;
                int i1701 = i1700 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1701;
                int[] iArr829 = this.MediaMetadataCompat;
                Object[] objArr537 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj490 = objArr537[i1700 - 2];
                objArr537[i1700 - 2] = null;
                iArr829[i1700 - 2] = ((int[]) obj490)[iArr829[i1701]];
                this.AudioAttributesImplApi26Parcelizer = i1700;
                objArr537[i1701] = objArr537[56];
                return 0;
            case 1132:
                int[] iArr830 = this.MediaMetadataCompat;
                int i1702 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1702 + 1;
                iArr830[i1702] = iArr830[57];
                return 0;
            case 1133:
                int[] iArr831 = this.MediaMetadataCompat;
                int i1703 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1703 + 1;
                iArr831[i1703] = iArr831[58];
                return 0;
            case 1134:
                int i1704 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1704;
                int[] iArr832 = this.MediaMetadataCompat;
                iArr832[64] = iArr832[i1704];
                return 0;
            case 1135:
                int i1705 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1705;
                int[] iArr833 = this.MediaMetadataCompat;
                iArr833[63] = iArr833[i1705];
                return 0;
            case 1136:
                int i1706 = this.AudioAttributesImplApi26Parcelizer;
                int i1707 = i1706 - 1;
                Object[] objArr538 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj491 = objArr538[i1707];
                objArr538[i1707] = null;
                objArr538[62] = obj491;
                int i1708 = i1706 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1708;
                int[] iArr834 = this.MediaMetadataCompat;
                iArr834[61] = iArr834[i1708];
                return 0;
            case 1137:
                int i1709 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr835 = this.MediaMetadataCompat;
                iArr835[60] = iArr835[i1709 - 1];
                int i1710 = i1709 - 2;
                Object[] objArr539 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj492 = objArr539[i1710];
                objArr539[i1710] = null;
                objArr539[59] = obj492;
                this.AudioAttributesImplApi26Parcelizer = i1709 - 1;
                objArr539[i1710] = obj492;
                return 0;
            case 1138:
                Object[] objArr540 = this.MediaBrowserCompatSearchResultReceiver;
                int i1711 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1711 + 1;
                objArr540[i1711] = objArr540[59];
                return 0;
            case 1139:
                int[] iArr836 = this.MediaMetadataCompat;
                int i1712 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1712 + 1;
                iArr836[i1712] = iArr836[60];
                Object[] objArr541 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj493 = objArr541[i1712 - 1];
                objArr541[i1712 - 1] = null;
                objArr541[i1712] = obj493;
                iArr836[i1712 - 1] = iArr836[i1712];
                return 0;
            case 1140:
                int i1713 = this.AudioAttributesImplApi26Parcelizer;
                int i1714 = i1713 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1714;
                Object[] objArr542 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj494 = objArr542[i1714];
                objArr542[i1714] = null;
                int[] iArr837 = this.MediaMetadataCompat;
                ((int[]) obj494)[iArr837[i1713 - 2]] = iArr837[i1713 - 1];
                objArr542[i1714] = objArr542[59];
                this.AudioAttributesImplApi26Parcelizer = i1713 - 1;
                iArr837[i1713 - 2] = iArr837[61];
                return 0;
            case 1141:
                Object[] objArr543 = this.MediaBrowserCompatSearchResultReceiver;
                int i1715 = this.AudioAttributesImplApi26Parcelizer;
                objArr543[i1715] = objArr543[59];
                objArr543[i1715 + 1] = objArr543[62];
                int[] iArr838 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1715 + 3;
                iArr838[i1715 + 2] = 2;
                return 0;
            case 1142:
                int[] iArr839 = this.MediaMetadataCompat;
                int i1716 = this.AudioAttributesImplApi26Parcelizer;
                iArr839[i1716] = iArr839[63];
                this.AudioAttributesImplApi26Parcelizer = i1716 + 2;
                iArr839[i1716 + 1] = iArr839[64];
                return 0;
            case 1143:
                int i1717 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1717;
                int[] iArr840 = this.MediaMetadataCompat;
                iArr840[62] = iArr840[i1717];
                return 0;
            case 1144:
                int i1718 = this.AudioAttributesImplApi26Parcelizer;
                int i1719 = i1718 - 1;
                int[] iArr841 = this.MediaMetadataCompat;
                iArr841[61] = iArr841[i1719];
                this.AudioAttributesImplApi26Parcelizer = i1718;
                iArr841[i1719] = iArr841[62];
                return 0;
            case 1145:
                int[] iArr842 = this.MediaMetadataCompat;
                int i1720 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1720 + 1;
                iArr842[i1720] = iArr842[61];
                return 0;
            case 1146:
                Object[] objArr544 = this.MediaBrowserCompatSearchResultReceiver;
                int i1721 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1721 + 1;
                objArr544[i1721] = objArr544[68];
                return 0;
            case 1147:
                Object[] objArr545 = this.MediaBrowserCompatSearchResultReceiver;
                int i1722 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1722 + 1;
                objArr545[i1722] = objArr545[69];
                return 0;
            case 1148:
                int[] iArr843 = this.MediaMetadataCompat;
                int i1723 = this.AudioAttributesImplApi26Parcelizer;
                iArr843[i1723] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1723 + 2;
                iArr843[i1723 + 1] = 4;
                return 0;
            case 1149:
                int i1724 = this.AudioAttributesImplApi26Parcelizer;
                int i1725 = i1724 - 1;
                int[] iArr844 = this.MediaMetadataCompat;
                int i1726 = iArr844[i1725];
                iArr844[12] = i1726;
                Object[] objArr546 = this.MediaBrowserCompatSearchResultReceiver;
                objArr546[i1725] = objArr546[13];
                this.AudioAttributesImplApi26Parcelizer = i1724 + 1;
                iArr844[i1724] = i1726;
                return 0;
            case 1150:
                Object[] objArr547 = this.MediaBrowserCompatSearchResultReceiver;
                int i1727 = this.AudioAttributesImplApi26Parcelizer;
                Object obj495 = objArr547[i1727 - 1];
                objArr547[i1727 - 1] = null;
                Object obj496 = objArr547[i1727 - 2];
                objArr547[i1727 - 2] = null;
                objArr547[i1727 - 1] = obj496;
                objArr547[i1727 - 2] = obj495;
                int[] iArr845 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1727 + 1;
                iArr845[i1727] = 0;
                Object obj497 = objArr547[i1727 - 1];
                objArr547[i1727 - 1] = null;
                objArr547[i1727] = obj497;
                iArr845[i1727 - 1] = iArr845[i1727];
                return 0;
            case 1151:
                int i1728 = this.AudioAttributesImplApi26Parcelizer;
                int i1729 = i1728 - 1;
                Object[] objArr548 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj498 = objArr548[i1729];
                objArr548[i1729] = null;
                objArr548[12] = obj498;
                this.AudioAttributesImplApi26Parcelizer = i1728;
                objArr548[i1729] = objArr548[13];
                return 0;
            case 1152:
                Object[] objArr549 = this.MediaBrowserCompatSearchResultReceiver;
                int i1730 = this.AudioAttributesImplApi26Parcelizer;
                objArr549[i1730] = objArr549[67];
                int[] iArr846 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1730 + 2;
                iArr846[i1730 + 1] = 0;
                return 0;
            case 1153:
                int i1731 = this.AudioAttributesImplApi26Parcelizer;
                int i1732 = i1731 - 1;
                Object[] objArr550 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj499 = objArr550[i1732];
                objArr550[i1732] = null;
                objArr550[65] = obj499;
                this.AudioAttributesImplApi26Parcelizer = i1731;
                objArr550[i1732] = obj499;
                return 0;
            case 1154:
                int i1733 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1733;
                Object[] objArr551 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj500 = objArr551[i1733];
                objArr551[i1733] = null;
                objArr551[65] = obj500;
                return 0;
            case 1155:
                Object[] objArr552 = this.MediaBrowserCompatSearchResultReceiver;
                int i1734 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1734 + 1;
                objArr552[i1734] = objArr552[65];
                return 0;
            case 1156:
                int i1735 = this.AudioAttributesImplApi26Parcelizer;
                int i1736 = i1735 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1736;
                int[] iArr847 = this.MediaMetadataCompat;
                Object[] objArr553 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj501 = objArr553[i1735 - 2];
                objArr553[i1735 - 2] = null;
                iArr847[i1735 - 2] = ((int[]) obj501)[iArr847[i1736]];
                this.AudioAttributesImplApi26Parcelizer = i1735;
                iArr847[i1736] = iArr847[i1735 - 2];
                return 0;
            case 1157:
                Object[] objArr554 = this.MediaBrowserCompatSearchResultReceiver;
                int i1737 = this.AudioAttributesImplApi26Parcelizer;
                objArr554[i1737] = objArr554[65];
                int[] iArr848 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1737 + 2;
                iArr848[i1737 + 1] = 0;
                return 0;
            case 1158:
                int i1738 = this.AudioAttributesImplApi26Parcelizer;
                int i1739 = i1738 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1739;
                int[] iArr849 = this.MediaMetadataCompat;
                Object[] objArr555 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj502 = objArr555[i1738 - 2];
                objArr555[i1738 - 2] = null;
                iArr849[i1738 - 2] = ((int[]) obj502)[iArr849[i1739]];
                iArr849[i1739] = 0;
                int i1740 = i1738 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1740;
                iArr849[58] = iArr849[i1740];
                return 0;
            case 1159:
                int i1741 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr850 = this.MediaMetadataCompat;
                iArr850[57] = iArr850[i1741 - 1];
                int i1742 = i1741 - 2;
                Object[] objArr556 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj503 = objArr556[i1742];
                objArr556[i1742] = null;
                objArr556[56] = obj503;
                int i1743 = i1741 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1743;
                Object obj504 = objArr556[i1743];
                objArr556[i1743] = null;
                objArr556[55] = obj504;
                return 0;
            case 1160:
                Object[] objArr557 = this.MediaBrowserCompatSearchResultReceiver;
                int i1744 = this.AudioAttributesImplApi26Parcelizer;
                objArr557[i1744] = objArr557[55];
                objArr557[i1744 + 1] = objArr557[56];
                int[] iArr851 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1744 + 3;
                iArr851[i1744 + 2] = 3;
                return 0;
            case 1161:
                Object[] objArr558 = this.MediaBrowserCompatSearchResultReceiver;
                int i1745 = this.AudioAttributesImplApi26Parcelizer;
                objArr558[i1745] = objArr558[56];
                int[] iArr852 = this.MediaMetadataCompat;
                iArr852[i1745 + 1] = 1;
                int i1746 = i1745 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1746;
                Object obj505 = objArr558[i1745];
                objArr558[i1745] = null;
                objArr558[i1745] = ((Object[]) obj505)[iArr852[i1746]];
                return 0;
            case 1162:
                Object[] objArr559 = this.MediaBrowserCompatSearchResultReceiver;
                int i1747 = this.AudioAttributesImplApi26Parcelizer;
                objArr559[i1747] = objArr559[56];
                int[] iArr853 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1747 + 2;
                iArr853[i1747 + 1] = 2;
                return 0;
            case 1163:
                int i1748 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1748;
                Object[] objArr560 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj506 = objArr560[i1748];
                objArr560[i1748] = null;
                objArr560[62] = obj506;
                return 0;
            case 1164:
                int i1749 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1749;
                int[] iArr854 = this.MediaMetadataCompat;
                iArr854[61] = iArr854[i1749];
                return 0;
            case 1165:
                int i1750 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1750;
                int[] iArr855 = this.MediaMetadataCompat;
                iArr855[60] = iArr855[i1750];
                return 0;
            case 1166:
                int i1751 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1751;
                Object[] objArr561 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj507 = objArr561[i1751];
                objArr561[i1751] = null;
                objArr561[59] = obj507;
                return 0;
            case 1167:
                Object[] objArr562 = this.MediaBrowserCompatSearchResultReceiver;
                int i1752 = this.AudioAttributesImplApi26Parcelizer;
                objArr562[i1752] = objArr562[59];
                int[] iArr856 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1752 + 2;
                iArr856[i1752 + 1] = iArr856[60];
                Object obj508 = objArr562[i1752];
                objArr562[i1752] = null;
                objArr562[i1752 + 1] = obj508;
                iArr856[i1752] = iArr856[i1752 + 1];
                return 0;
            case 1168:
                int[] iArr857 = this.MediaMetadataCompat;
                int i1753 = this.AudioAttributesImplApi26Parcelizer;
                int i1754 = iArr857[i1753 - 1];
                iArr857[i1753 - 1] = iArr857[i1753 - 2];
                iArr857[i1753 - 2] = i1754;
                int i1755 = i1753 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1755;
                Object[] objArr563 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj509 = objArr563[i1755];
                objArr563[i1755] = null;
                ((int[]) obj509)[iArr857[i1753 - 2]] = iArr857[i1753 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1753 - 2;
                objArr563[i1755] = objArr563[59];
                return 0;
            case 1169:
                int[] iArr858 = this.MediaMetadataCompat;
                int i1756 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1756 + 1;
                iArr858[i1756] = iArr858[61];
                Object[] objArr564 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj510 = objArr564[i1756 - 1];
                objArr564[i1756 - 1] = null;
                objArr564[i1756] = obj510;
                iArr858[i1756 - 1] = iArr858[i1756];
                return 0;
            case 1170:
                int i1757 = this.AudioAttributesImplApi26Parcelizer;
                int i1758 = i1757 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1758;
                Object[] objArr565 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj511 = objArr565[i1758];
                objArr565[i1758] = null;
                int[] iArr859 = this.MediaMetadataCompat;
                ((int[]) obj511)[iArr859[i1757 - 2]] = iArr859[i1757 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1757 - 2;
                objArr565[i1758] = objArr565[59];
                return 0;
            case 1171:
                Object[] objArr566 = this.MediaBrowserCompatSearchResultReceiver;
                int i1759 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1759 + 1;
                objArr566[i1759] = objArr566[62];
                return 0;
            case 1172:
                Object[] objArr567 = this.MediaBrowserCompatSearchResultReceiver;
                int i1760 = this.AudioAttributesImplApi26Parcelizer;
                objArr567[i1760] = objArr567[59];
                int[] iArr860 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1760 + 2;
                iArr860[i1760 + 1] = iArr860[63];
                return 0;
            case 1173:
                int[] iArr861 = this.MediaMetadataCompat;
                int i1761 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1761 + 1;
                iArr861[i1761] = iArr861[64];
                return 0;
            case 1174:
                int i1762 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr862 = this.MediaMetadataCompat;
                int i1763 = iArr862[i1762 - 1];
                iArr862[62] = i1763;
                int i1764 = i1762 - 2;
                iArr862[61] = iArr862[i1764];
                this.AudioAttributesImplApi26Parcelizer = i1762 - 1;
                iArr862[i1764] = i1763;
                return 0;
            case 1175:
                Object[] objArr568 = this.MediaBrowserCompatSearchResultReceiver;
                int i1765 = this.AudioAttributesImplApi26Parcelizer;
                objArr568[i1765] = objArr568[12];
                objArr568[i1765 + 1] = objArr568[i1765];
                int i1766 = i1765 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1766;
                Object obj512 = objArr568[i1766];
                objArr568[i1766] = null;
                objArr568[65] = obj512;
                return 0;
            case 1176:
                int i1767 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1767;
                int[] iArr863 = this.MediaMetadataCompat;
                iArr863[58] = iArr863[i1767];
                return 0;
            case 1177:
                int i1768 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr864 = this.MediaMetadataCompat;
                iArr864[57] = iArr864[i1768 - 1];
                int i1769 = i1768 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1769;
                Object[] objArr569 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj513 = objArr569[i1769];
                objArr569[i1769] = null;
                objArr569[56] = obj513;
                return 0;
            case 1178:
                int i1770 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1770;
                Object[] objArr570 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj514 = objArr570[i1770];
                objArr570[i1770] = null;
                objArr570[55] = obj514;
                return 0;
            case 1179:
                int i1771 = this.AudioAttributesImplApi26Parcelizer;
                int i1772 = i1771 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1772;
                int[] iArr865 = this.MediaMetadataCompat;
                Object[] objArr571 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj515 = objArr571[i1771 - 2];
                objArr571[i1771 - 2] = null;
                iArr865[i1771 - 2] = ((int[]) obj515)[iArr865[i1772]];
                objArr571[i1772] = objArr571[56];
                this.AudioAttributesImplApi26Parcelizer = i1771 + 1;
                iArr865[i1771] = 2;
                return 0;
            case 1180:
                int i1773 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr866 = this.MediaMetadataCompat;
                iArr866[64] = iArr866[i1773 - 1];
                iArr866[63] = iArr866[i1773 - 2];
                int i1774 = i1773 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1774;
                Object[] objArr572 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj516 = objArr572[i1774];
                objArr572[i1774] = null;
                objArr572[62] = obj516;
                return 0;
            case 1181:
                int i1775 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr867 = this.MediaMetadataCompat;
                iArr867[61] = iArr867[i1775 - 1];
                int i1776 = i1775 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1776;
                iArr867[60] = iArr867[i1776];
                return 0;
            case 1182:
                int i1777 = this.AudioAttributesImplApi26Parcelizer;
                int i1778 = i1777 - 1;
                Object[] objArr573 = this.MediaBrowserCompatSearchResultReceiver;
                objArr573[i1778] = null;
                this.AudioAttributesImplApi26Parcelizer = i1777;
                objArr573[i1778] = objArr573[59];
                return 0;
            case 1183:
                Object[] objArr574 = this.MediaBrowserCompatSearchResultReceiver;
                int i1779 = this.AudioAttributesImplApi26Parcelizer;
                objArr574[i1779] = objArr574[59];
                int[] iArr868 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1779 + 2;
                iArr868[i1779 + 1] = iArr868[61];
                return 0;
            case 1184:
                Object[] objArr575 = this.MediaBrowserCompatSearchResultReceiver;
                int i1780 = this.AudioAttributesImplApi26Parcelizer;
                objArr575[i1780] = objArr575[62];
                int[] iArr869 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1780 + 2;
                iArr869[i1780 + 1] = 2;
                Object obj517 = objArr575[i1780];
                objArr575[i1780] = null;
                objArr575[i1780 + 1] = obj517;
                iArr869[i1780] = iArr869[i1780 + 1];
                return 0;
            case 1185:
                int i1781 = this.AudioAttributesImplApi26Parcelizer;
                int i1782 = i1781 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1782;
                Object[] objArr576 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj518 = objArr576[i1782];
                objArr576[i1782] = null;
                int i1783 = this.MediaMetadataCompat[i1781 - 2];
                Object obj519 = objArr576[i1781 - 1];
                objArr576[i1781 - 1] = null;
                ((Object[]) obj518)[i1783] = obj519;
                this.AudioAttributesImplApi26Parcelizer = i1781 - 2;
                objArr576[i1782] = objArr576[59];
                return 0;
            case 1186:
                int[] iArr870 = this.MediaMetadataCompat;
                int i1784 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1784 + 1;
                iArr870[i1784] = iArr870[63];
                return 0;
            case 1187:
                Object[] objArr577 = this.MediaBrowserCompatSearchResultReceiver;
                int i1785 = this.AudioAttributesImplApi26Parcelizer;
                objArr577[i1785] = objArr577[i1785 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1785;
                Object obj520 = objArr577[i1785];
                objArr577[i1785] = null;
                objArr577[65] = obj520;
                return 0;
            case 1188:
                int[] iArr871 = this.MediaMetadataCompat;
                int i1786 = this.AudioAttributesImplApi26Parcelizer;
                iArr871[i1786] = 0;
                iArr871[58] = iArr871[i1786];
                int i1787 = i1786 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1787;
                iArr871[57] = iArr871[i1787];
                return 0;
            case 1189:
                int i1788 = this.AudioAttributesImplApi26Parcelizer;
                int i1789 = i1788 - 1;
                Object[] objArr578 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj521 = objArr578[i1789];
                objArr578[i1789] = null;
                objArr578[56] = obj521;
                int i1790 = i1788 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1790;
                Object obj522 = objArr578[i1790];
                objArr578[i1790] = null;
                objArr578[55] = obj522;
                return 0;
            case 1190:
                Object[] objArr579 = this.MediaBrowserCompatSearchResultReceiver;
                int i1791 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1791 + 1;
                objArr579[i1791] = objArr579[55];
                return 0;
            case 1191:
                int[] iArr872 = this.MediaMetadataCompat;
                int i1792 = this.AudioAttributesImplApi26Parcelizer;
                iArr872[i1792] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1792;
                Object[] objArr580 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj523 = objArr580[i1792 - 1];
                objArr580[i1792 - 1] = null;
                iArr872[i1792 - 1] = ((int[]) obj523)[iArr872[i1792]];
                this.AudioAttributesImplApi26Parcelizer = i1792 + 1;
                objArr580[i1792] = objArr580[56];
                return 0;
            case 1192:
                Object[] objArr581 = this.MediaBrowserCompatSearchResultReceiver;
                int i1793 = this.AudioAttributesImplApi26Parcelizer;
                objArr581[i1793] = objArr581[56];
                int[] iArr873 = this.MediaMetadataCompat;
                iArr873[i1793 + 1] = 2;
                int i1794 = i1793 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1794;
                Object obj524 = objArr581[i1793];
                objArr581[i1793] = null;
                objArr581[i1793] = ((Object[]) obj524)[iArr873[i1794]];
                return 0;
            case 1193:
                int[] iArr874 = this.MediaMetadataCompat;
                int i1795 = this.AudioAttributesImplApi26Parcelizer;
                iArr874[i1795] = iArr874[57];
                iArr874[i1795 + 1] = iArr874[58];
                int i1796 = i1795 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1796;
                iArr874[64] = iArr874[i1796];
                return 0;
            case 1194:
                int i1797 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr875 = this.MediaMetadataCompat;
                iArr875[61] = iArr875[i1797 - 1];
                iArr875[60] = iArr875[i1797 - 2];
                int i1798 = i1797 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1798;
                Object[] objArr582 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj525 = objArr582[i1798];
                objArr582[i1798] = null;
                objArr582[59] = obj525;
                return 0;
            case 1195:
                Object[] objArr583 = this.MediaBrowserCompatSearchResultReceiver;
                int i1799 = this.AudioAttributesImplApi26Parcelizer;
                objArr583[i1799] = objArr583[59];
                this.AudioAttributesImplApi26Parcelizer = i1799;
                objArr583[i1799] = null;
                return 0;
            case 1196:
                int[] iArr876 = this.MediaMetadataCompat;
                int i1800 = this.AudioAttributesImplApi26Parcelizer;
                iArr876[i1800] = iArr876[61];
                Object[] objArr584 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj526 = objArr584[i1800 - 1];
                objArr584[i1800 - 1] = null;
                objArr584[i1800] = obj526;
                iArr876[i1800 - 1] = iArr876[i1800];
                this.AudioAttributesImplApi26Parcelizer = i1800 + 2;
                iArr876[i1800 + 1] = 1;
                return 0;
            case 1197:
                Object[] objArr585 = this.MediaBrowserCompatSearchResultReceiver;
                int i1801 = this.AudioAttributesImplApi26Parcelizer;
                objArr585[i1801] = objArr585[59];
                int[] iArr877 = this.MediaMetadataCompat;
                iArr877[i1801 + 1] = iArr877[63];
                this.AudioAttributesImplApi26Parcelizer = i1801 + 3;
                iArr877[i1801 + 2] = iArr877[64];
                return 0;
            case 1198:
                int i1802 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr878 = this.MediaMetadataCompat;
                iArr878[62] = iArr878[i1802 - 1];
                int i1803 = i1802 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1803;
                iArr878[61] = iArr878[i1803];
                return 0;
            case 1199:
                int[] iArr879 = this.MediaMetadataCompat;
                int i1804 = this.AudioAttributesImplApi26Parcelizer;
                iArr879[i1804] = iArr879[62];
                this.AudioAttributesImplApi26Parcelizer = i1804 + 2;
                iArr879[i1804 + 1] = iArr879[61];
                return 0;
            case 1200:
                Object[] objArr586 = this.MediaBrowserCompatSearchResultReceiver;
                int i1805 = this.AudioAttributesImplApi26Parcelizer;
                objArr586[i1805] = objArr586[12];
                Object obj527 = objArr586[i1805];
                objArr586[i1805] = null;
                objArr586[65] = obj527;
                this.AudioAttributesImplApi26Parcelizer = i1805 + 1;
                objArr586[i1805] = obj527;
                return 0;
            case 1201:
                int[] iArr880 = this.MediaMetadataCompat;
                int i1806 = this.AudioAttributesImplApi26Parcelizer;
                iArr880[i1806] = iArr880[16];
                this.AudioAttributesImplApi26Parcelizer = i1806;
                Object[] objArr587 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj528 = objArr587[i1806 - 1];
                objArr587[i1806 - 1] = null;
                objArr587[i1806 - 1] = ((Object[]) obj528)[iArr880[i1806]];
                return 0;
            case 1202:
                int[] iArr881 = this.MediaMetadataCompat;
                int i1807 = this.AudioAttributesImplApi26Parcelizer;
                iArr881[i1807] = iArr881[13];
                this.AudioAttributesImplApi26Parcelizer = i1807;
                iArr881[i1807 - 1] = iArr881[i1807] ^ iArr881[i1807 - 1];
                return 0;
            case 1203:
                Object[] objArr588 = this.MediaBrowserCompatSearchResultReceiver;
                int i1808 = this.AudioAttributesImplApi26Parcelizer;
                Object obj529 = objArr588[i1808 - 2];
                objArr588[i1808 - 2] = null;
                objArr588[i1808 - 1] = obj529;
                int[] iArr882 = this.MediaMetadataCompat;
                iArr882[i1808 - 2] = iArr882[i1808 - 1];
                int i1809 = i1808 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1809;
                Object obj530 = objArr588[i1809];
                objArr588[i1809] = null;
                int i1810 = iArr882[i1808 - 2];
                Object obj531 = objArr588[i1808 - 1];
                objArr588[i1808 - 1] = null;
                ((Object[]) obj530)[i1810] = obj531;
                this.AudioAttributesImplApi26Parcelizer = i1808 - 2;
                Object obj532 = objArr588[i1808 - 4];
                objArr588[i1808 - 4] = null;
                objArr588[i1809] = obj532;
                Object obj533 = objArr588[i1808 - 5];
                objArr588[i1808 - 5] = null;
                objArr588[i1808 - 4] = obj533;
                objArr588[i1808 - 5] = obj532;
                return 0;
            case 1204:
                int[] iArr883 = this.MediaMetadataCompat;
                int i1811 = this.AudioAttributesImplApi26Parcelizer;
                iArr883[i1811] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1811;
                iArr883[58] = iArr883[i1811];
                return 0;
            case 1205:
                Object[] objArr589 = this.MediaBrowserCompatSearchResultReceiver;
                int i1812 = this.AudioAttributesImplApi26Parcelizer;
                objArr589[i1812] = objArr589[56];
                int[] iArr884 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1812 + 2;
                iArr884[i1812 + 1] = 3;
                return 0;
            case 1206:
                int i1813 = this.AudioAttributesImplApi26Parcelizer;
                int i1814 = i1813 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1814;
                Object[] objArr590 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj534 = objArr590[i1814];
                objArr590[i1814] = null;
                int[] iArr885 = this.MediaMetadataCompat;
                ((int[]) obj534)[iArr885[i1813 - 2]] = iArr885[i1813 - 1];
                objArr590[i1814] = objArr590[59];
                this.AudioAttributesImplApi26Parcelizer = i1813 - 1;
                objArr590[i1813 - 2] = objArr590[62];
                return 0;
            case 1207:
                int[] iArr886 = this.MediaMetadataCompat;
                int i1815 = this.AudioAttributesImplApi26Parcelizer;
                int i1816 = iArr886[i1815 - 1];
                iArr886[i1815 - 1] = iArr886[i1815 - 2];
                iArr886[i1815 - 2] = i1816;
                int i1817 = i1815 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1817;
                Object[] objArr591 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj535 = objArr591[i1817];
                objArr591[i1817] = null;
                ((int[]) obj535)[iArr886[i1815 - 2]] = iArr886[i1815 - 1];
                int i1818 = i1815 - 4;
                this.AudioAttributesImplApi26Parcelizer = i1818;
                Object obj536 = objArr591[i1818];
                objArr591[i1818] = null;
                objArr591[12] = obj536;
                return 0;
            case 1208:
                int i1819 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr69 = this.RatingCompat;
                jArr69[i1819 - 2] = jArr69[i1819 - 2] | jArr69[i1819 - 1];
                int i1820 = i1819 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1820;
                jArr69[20] = jArr69[i1820];
                return 0;
            case 1209:
                long[] jArr70 = this.RatingCompat;
                int i1821 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1821 + 1;
                jArr70[i1821] = jArr70[20];
                return 0;
            case 1210:
                Object[] objArr592 = this.MediaBrowserCompatSearchResultReceiver;
                int i1822 = this.AudioAttributesImplApi26Parcelizer;
                objArr592[i1822] = objArr592[12];
                this.AudioAttributesImplApi26Parcelizer = i1822 + 2;
                objArr592[i1822 + 1] = objArr592[i1822];
                return 0;
            case 1211:
                int i1823 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1823;
                int[] iArr887 = this.MediaMetadataCompat;
                iArr887[57] = iArr887[i1823];
                return 0;
            case 1212:
                int i1824 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1824;
                Object[] objArr593 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj537 = objArr593[i1824];
                objArr593[i1824] = null;
                objArr593[56] = obj537;
                return 0;
            case 1213:
                int i1825 = this.AudioAttributesImplApi26Parcelizer;
                int i1826 = i1825 - 1;
                Object[] objArr594 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj538 = objArr594[i1826];
                objArr594[i1826] = null;
                objArr594[55] = obj538;
                objArr594[i1826] = obj538;
                this.AudioAttributesImplApi26Parcelizer = i1825 + 1;
                objArr594[i1825] = objArr594[56];
                return 0;
            case 1214:
                int[] iArr888 = this.MediaMetadataCompat;
                int i1827 = this.AudioAttributesImplApi26Parcelizer;
                iArr888[i1827] = iArr888[57];
                this.AudioAttributesImplApi26Parcelizer = i1827 + 2;
                iArr888[i1827 + 1] = iArr888[58];
                return 0;
            case 1215:
                int i1828 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr889 = this.MediaMetadataCompat;
                iArr889[64] = iArr889[i1828 - 1];
                int i1829 = i1828 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1829;
                iArr889[63] = iArr889[i1829];
                return 0;
            case 1216:
                int i1830 = this.AudioAttributesImplApi26Parcelizer;
                int i1831 = i1830 - 1;
                Object[] objArr595 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj539 = objArr595[i1831];
                objArr595[i1831] = null;
                objArr595[62] = obj539;
                int[] iArr890 = this.MediaMetadataCompat;
                iArr890[61] = iArr890[i1830 - 2];
                int i1832 = i1830 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1832;
                iArr890[60] = iArr890[i1832];
                return 0;
            case 1217:
                int i1833 = this.AudioAttributesImplApi26Parcelizer;
                int i1834 = i1833 - 1;
                Object[] objArr596 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj540 = objArr596[i1834];
                objArr596[i1834] = null;
                objArr596[59] = obj540;
                objArr596[i1834] = obj540;
                int i1835 = i1833 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1835;
                objArr596[i1835] = null;
                return 0;
            case 1218:
                int[] iArr891 = this.MediaMetadataCompat;
                int i1836 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1836 + 1;
                iArr891[i1836] = iArr891[60];
                return 0;
            case 1219:
                Object[] objArr597 = this.MediaBrowserCompatSearchResultReceiver;
                int i1837 = this.AudioAttributesImplApi26Parcelizer;
                Object obj541 = objArr597[i1837 - 2];
                objArr597[i1837 - 2] = null;
                objArr597[i1837 - 1] = obj541;
                int[] iArr892 = this.MediaMetadataCompat;
                iArr892[i1837 - 2] = iArr892[i1837 - 1];
                int i1838 = i1837 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1838;
                Object obj542 = objArr597[i1838];
                objArr597[i1838] = null;
                int i1839 = iArr892[i1837 - 2];
                Object obj543 = objArr597[i1837 - 1];
                objArr597[i1837 - 1] = null;
                ((Object[]) obj542)[i1839] = obj543;
                this.AudioAttributesImplApi26Parcelizer = i1837 - 2;
                objArr597[i1838] = objArr597[59];
                return 0;
            case 1220:
                int[] iArr893 = this.MediaMetadataCompat;
                int i1840 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1840 + 1;
                iArr893[i1840] = iArr893[62];
                return 0;
            case 1221:
                int[] iArr894 = this.MediaMetadataCompat;
                int i1841 = this.AudioAttributesImplApi26Parcelizer;
                iArr894[i1841] = iArr894[61];
                iArr894[i1841 - 1] = iArr894[i1841 - 1] + iArr894[i1841];
                int i1842 = i1841 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1842;
                iArr894[i1841 - 2] = iArr894[i1841 - 2] + iArr894[i1842];
                return 0;
            case 1222:
                int[] iArr895 = this.MediaMetadataCompat;
                int i1843 = this.AudioAttributesImplApi26Parcelizer;
                iArr895[i1843] = 52;
                long[] jArr71 = this.RatingCompat;
                jArr71[i1843 - 1] = jArr71[i1843 - 1] >>> iArr895[i1843];
                int i1844 = i1843 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1844;
                jArr71[i1843 - 2] = jArr71[i1843 - 2] - jArr71[i1844];
                return 0;
            case 1223:
                int i1845 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr72 = this.RatingCompat;
                jArr72[i1845 - 2] = jArr72[i1845 - 2] >> this.MediaMetadataCompat[i1845 - 1];
                int i1846 = i1845 - 2;
                jArr72[24] = jArr72[i1846];
                this.AudioAttributesImplApi26Parcelizer = i1845 - 1;
                jArr72[i1846] = jArr72[22];
                return 0;
            case 1224:
                long[] jArr73 = this.RatingCompat;
                int i1847 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1847 + 1;
                jArr73[i1847] = jArr73[24];
                return 0;
            case 1225:
                int[] iArr896 = this.MediaMetadataCompat;
                int i1848 = this.AudioAttributesImplApi26Parcelizer;
                iArr896[i1848] = 0;
                iArr896[37] = iArr896[i1848];
                int i1849 = i1848 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1849;
                iArr896[36] = iArr896[i1849];
                return 0;
            case 1226:
                int i1850 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1850;
                Object[] objArr598 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj544 = objArr598[i1850];
                objArr598[i1850] = null;
                objArr598[35] = obj544;
                return 0;
            case 1227:
                int i1851 = this.AudioAttributesImplApi26Parcelizer;
                int i1852 = i1851 - 1;
                Object[] objArr599 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj545 = objArr599[i1852];
                objArr599[i1852] = null;
                objArr599[34] = obj545;
                objArr599[i1852] = obj545;
                this.AudioAttributesImplApi26Parcelizer = i1851 + 1;
                objArr599[i1851] = objArr599[35];
                return 0;
            case 1228:
                Object[] objArr600 = this.MediaBrowserCompatSearchResultReceiver;
                int i1853 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1853 + 1;
                objArr600[i1853] = objArr600[35];
                return 0;
            case 1229:
                int[] iArr897 = this.MediaMetadataCompat;
                int i1854 = this.AudioAttributesImplApi26Parcelizer;
                iArr897[i1854] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1854;
                Object[] objArr601 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj546 = objArr601[i1854 - 1];
                objArr601[i1854 - 1] = null;
                iArr897[i1854 - 1] = ((int[]) obj546)[iArr897[i1854]];
                this.AudioAttributesImplApi26Parcelizer = i1854 + 1;
                objArr601[i1854] = objArr601[35];
                return 0;
            case 1230:
                int[] iArr898 = this.MediaMetadataCompat;
                int i1855 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1855 + 1;
                iArr898[i1855] = iArr898[36];
                return 0;
            case 1231:
                int[] iArr899 = this.MediaMetadataCompat;
                int i1856 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1856 + 1;
                iArr899[i1856] = iArr899[37];
                return 0;
            case 1232:
                int i1857 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr900 = this.MediaMetadataCompat;
                iArr900[43] = iArr900[i1857 - 1];
                iArr900[42] = iArr900[i1857 - 2];
                int i1858 = i1857 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1858;
                Object[] objArr602 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj547 = objArr602[i1858];
                objArr602[i1858] = null;
                objArr602[41] = obj547;
                return 0;
            case 1233:
                int i1859 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1859;
                int[] iArr901 = this.MediaMetadataCompat;
                iArr901[40] = iArr901[i1859];
                return 0;
            case 1234:
                int i1860 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1860;
                int[] iArr902 = this.MediaMetadataCompat;
                iArr902[39] = iArr902[i1860];
                return 0;
            case 1235:
                int i1861 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1861;
                Object[] objArr603 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj548 = objArr603[i1861];
                objArr603[i1861] = null;
                objArr603[38] = obj548;
                return 0;
            case 1236:
                Object[] objArr604 = this.MediaBrowserCompatSearchResultReceiver;
                int i1862 = this.AudioAttributesImplApi26Parcelizer;
                objArr604[i1862] = objArr604[38];
                objArr604[i1862] = null;
                this.AudioAttributesImplApi26Parcelizer = i1862 + 1;
                objArr604[i1862] = objArr604[38];
                return 0;
            case 1237:
                int[] iArr903 = this.MediaMetadataCompat;
                int i1863 = this.AudioAttributesImplApi26Parcelizer;
                iArr903[i1863] = iArr903[39];
                Object[] objArr605 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj549 = objArr605[i1863 - 1];
                objArr605[i1863 - 1] = null;
                objArr605[i1863] = obj549;
                iArr903[i1863 - 1] = iArr903[i1863];
                this.AudioAttributesImplApi26Parcelizer = i1863 + 2;
                iArr903[i1863 + 1] = 0;
                return 0;
            case 1238:
                Object[] objArr606 = this.MediaBrowserCompatSearchResultReceiver;
                int i1864 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1864 + 1;
                objArr606[i1864] = objArr606[38];
                return 0;
            case 1239:
                int[] iArr904 = this.MediaMetadataCompat;
                int i1865 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1865 + 1;
                iArr904[i1865] = iArr904[40];
                Object[] objArr607 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj550 = objArr607[i1865 - 1];
                objArr607[i1865 - 1] = null;
                objArr607[i1865] = obj550;
                iArr904[i1865 - 1] = iArr904[i1865];
                return 0;
            case 1240:
                Object[] objArr608 = this.MediaBrowserCompatSearchResultReceiver;
                int i1866 = this.AudioAttributesImplApi26Parcelizer;
                objArr608[i1866] = objArr608[38];
                this.AudioAttributesImplApi26Parcelizer = i1866 + 2;
                objArr608[i1866 + 1] = objArr608[41];
                return 0;
            case 1241:
                int[] iArr905 = this.MediaMetadataCompat;
                int i1867 = this.AudioAttributesImplApi26Parcelizer;
                iArr905[i1867] = iArr905[42];
                this.AudioAttributesImplApi26Parcelizer = i1867 + 2;
                iArr905[i1867 + 1] = iArr905[43];
                return 0;
            case 1242:
                int i1868 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1868;
                int[] iArr906 = this.MediaMetadataCompat;
                iArr906[41] = iArr906[i1868];
                return 0;
            case 1243:
                int i1869 = this.AudioAttributesImplApi26Parcelizer;
                int i1870 = i1869 - 1;
                int[] iArr907 = this.MediaMetadataCompat;
                iArr907[40] = iArr907[i1870];
                iArr907[i1870] = iArr907[41];
                this.AudioAttributesImplApi26Parcelizer = i1869 + 1;
                iArr907[i1869] = iArr907[40];
                return 0;
            case 1244:
                int i1871 = this.AudioAttributesImplApi26Parcelizer;
                int i1872 = i1871 - 1;
                Object[] objArr609 = this.MediaBrowserCompatSearchResultReceiver;
                objArr609[i1872] = null;
                this.AudioAttributesImplApi26Parcelizer = i1871;
                objArr609[i1872] = objArr609[68];
                return 0;
            case 1245:
                Object[] objArr610 = this.MediaBrowserCompatSearchResultReceiver;
                int i1873 = this.AudioAttributesImplApi26Parcelizer;
                objArr610[i1873] = objArr610[69];
                int[] iArr908 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1873 + 2;
                iArr908[i1873 + 1] = 0;
                return 0;
            case 1246:
                int[] iArr909 = this.MediaMetadataCompat;
                int i1874 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1874 + 1;
                iArr909[i1874] = -35;
                return 0;
            case 1247:
                int[] iArr910 = this.MediaMetadataCompat;
                int i1875 = this.AudioAttributesImplApi26Parcelizer;
                iArr910[i1875] = 0;
                Object[] objArr611 = this.MediaBrowserCompatSearchResultReceiver;
                objArr611[i1875 + 1] = objArr611[17];
                int i1876 = i1875 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1876;
                Object obj551 = objArr611[i1876];
                objArr611[i1876] = null;
                int i1877 = iArr910[i1875];
                Object obj552 = objArr611[i1875 + 1];
                objArr611[i1875 + 1] = null;
                ((Object[]) obj551)[i1877] = obj552;
                return 0;
            case 1248:
                Object[] objArr612 = this.MediaBrowserCompatSearchResultReceiver;
                int i1878 = this.AudioAttributesImplApi26Parcelizer;
                objArr612[i1878] = objArr612[13];
                int[] iArr911 = this.MediaMetadataCompat;
                iArr911[i1878 + 1] = iArr911[14];
                this.AudioAttributesImplApi26Parcelizer = i1878 + 3;
                iArr911[i1878 + 2] = 0;
                return 0;
            case 1249:
                int i1879 = this.AudioAttributesImplApi26Parcelizer;
                int i1880 = i1879 - 1;
                Object[] objArr613 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj553 = objArr613[i1880];
                objArr613[i1880] = null;
                objArr613[44] = obj553;
                objArr613[i1880] = obj553;
                int[] iArr912 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1879 + 1;
                iArr912[i1879] = 1;
                return 0;
            case 1250:
                int i1881 = this.AudioAttributesImplApi26Parcelizer;
                int i1882 = i1881 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1882;
                int[] iArr913 = this.MediaMetadataCompat;
                Object[] objArr614 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj554 = objArr614[i1881 - 2];
                objArr614[i1881 - 2] = null;
                iArr913[i1881 - 2] = ((int[]) obj554)[iArr913[i1882]];
                int i1883 = i1881 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1883;
                iArr913[15] = iArr913[i1883];
                return 0;
            case 1251:
                int i1884 = this.AudioAttributesImplApi26Parcelizer;
                int i1885 = i1884 - 1;
                Object[] objArr615 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj555 = objArr615[i1885];
                objArr615[i1885] = null;
                objArr615[44] = obj555;
                objArr615[i1885] = obj555;
                int[] iArr914 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1884 + 1;
                iArr914[i1884] = 0;
                return 0;
            case 1252:
                Object[] objArr616 = this.MediaBrowserCompatSearchResultReceiver;
                int i1886 = this.AudioAttributesImplApi26Parcelizer;
                objArr616[i1886] = objArr616[13];
                objArr616[i1886 + 1] = objArr616[i1886];
                int i1887 = i1886 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1887;
                Object obj556 = objArr616[i1887];
                objArr616[i1887] = null;
                objArr616[44] = obj556;
                return 0;
            case 1253:
                Object[] objArr617 = this.MediaBrowserCompatSearchResultReceiver;
                int i1888 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1888 + 1;
                objArr617[i1888] = objArr617[44];
                return 0;
            case 1254:
                int i1889 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1889;
                int[] iArr915 = this.MediaMetadataCompat;
                iArr915[37] = iArr915[i1889];
                return 0;
            case 1255:
                int i1890 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr916 = this.MediaMetadataCompat;
                iArr916[36] = iArr916[i1890 - 1];
                int i1891 = i1890 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1891;
                Object[] objArr618 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj557 = objArr618[i1891];
                objArr618[i1891] = null;
                objArr618[35] = obj557;
                return 0;
            case 1256:
                int i1892 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1892;
                Object[] objArr619 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj558 = objArr619[i1892];
                objArr619[i1892] = null;
                objArr619[34] = obj558;
                return 0;
            case 1257:
                Object[] objArr620 = this.MediaBrowserCompatSearchResultReceiver;
                int i1893 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1893 + 1;
                objArr620[i1893] = objArr620[34];
                return 0;
            case 1258:
                Object[] objArr621 = this.MediaBrowserCompatSearchResultReceiver;
                int i1894 = this.AudioAttributesImplApi26Parcelizer;
                objArr621[i1894] = objArr621[35];
                int[] iArr917 = this.MediaMetadataCompat;
                iArr917[i1894 + 1] = 0;
                int i1895 = i1894 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1895;
                Object obj559 = objArr621[i1894];
                objArr621[i1894] = null;
                objArr621[i1894] = ((Object[]) obj559)[iArr917[i1895]];
                return 0;
            case 1259:
                int i1896 = this.AudioAttributesImplApi26Parcelizer;
                int i1897 = i1896 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1897;
                int[] iArr918 = this.MediaMetadataCompat;
                Object[] objArr622 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj560 = objArr622[i1896 - 2];
                objArr622[i1896 - 2] = null;
                iArr918[i1896 - 2] = ((int[]) obj560)[iArr918[i1897]];
                objArr622[i1897] = objArr622[35];
                this.AudioAttributesImplApi26Parcelizer = i1896 + 1;
                iArr918[i1896] = 2;
                return 0;
            case 1260:
                int[] iArr919 = this.MediaMetadataCompat;
                int i1898 = this.AudioAttributesImplApi26Parcelizer;
                iArr919[i1898] = iArr919[36];
                this.AudioAttributesImplApi26Parcelizer = i1898 + 2;
                iArr919[i1898 + 1] = iArr919[37];
                return 0;
            case 1261:
                Object[] objArr623 = this.MediaBrowserCompatSearchResultReceiver;
                int i1899 = this.AudioAttributesImplApi26Parcelizer;
                objArr623[i1899] = objArr623[38];
                this.AudioAttributesImplApi26Parcelizer = i1899;
                objArr623[i1899] = null;
                return 0;
            case 1262:
                int[] iArr920 = this.MediaMetadataCompat;
                int i1900 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1900 + 1;
                iArr920[i1900] = iArr920[39];
                return 0;
            case 1263:
                int i1901 = this.AudioAttributesImplApi26Parcelizer;
                int i1902 = i1901 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1902;
                Object[] objArr624 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj561 = objArr624[i1902];
                objArr624[i1902] = null;
                int[] iArr921 = this.MediaMetadataCompat;
                ((int[]) obj561)[iArr921[i1901 - 2]] = iArr921[i1901 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1901 - 2;
                objArr624[i1902] = objArr624[38];
                return 0;
            case 1264:
                Object[] objArr625 = this.MediaBrowserCompatSearchResultReceiver;
                int i1903 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1903 + 1;
                objArr625[i1903] = objArr625[41];
                return 0;
            case 1265:
                Object[] objArr626 = this.MediaBrowserCompatSearchResultReceiver;
                int i1904 = this.AudioAttributesImplApi26Parcelizer;
                objArr626[i1904] = objArr626[38];
                int[] iArr922 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1904 + 2;
                iArr922[i1904 + 1] = iArr922[42];
                return 0;
            case 1266:
                int[] iArr923 = this.MediaMetadataCompat;
                int i1905 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1905 + 1;
                iArr923[i1905] = iArr923[43];
                return 0;
            case 1267:
                int i1906 = this.AudioAttributesImplApi26Parcelizer;
                int i1907 = i1906 - 1;
                Object[] objArr627 = this.MediaBrowserCompatSearchResultReceiver;
                objArr627[i1907] = null;
                objArr627[i1907] = objArr627[i1906 - 2];
                this.AudioAttributesImplApi26Parcelizer = i1906 + 1;
                objArr627[i1906] = objArr627[13];
                return 0;
            case 1268:
                Object[] objArr628 = this.MediaBrowserCompatSearchResultReceiver;
                int i1908 = this.AudioAttributesImplApi26Parcelizer;
                objArr628[i1908] = objArr628[i1908 - 1];
                this.AudioAttributesImplApi26Parcelizer = i1908;
                Object obj562 = objArr628[i1908];
                objArr628[i1908] = null;
                objArr628[44] = obj562;
                return 0;
            case 1269:
                int i1909 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr924 = this.MediaMetadataCompat;
                iArr924[37] = iArr924[i1909 - 1];
                int i1910 = i1909 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1910;
                iArr924[36] = iArr924[i1910];
                return 0;
            case 1270:
                int i1911 = this.AudioAttributesImplApi26Parcelizer;
                int i1912 = i1911 - 1;
                Object[] objArr629 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj563 = objArr629[i1912];
                objArr629[i1912] = null;
                objArr629[35] = obj563;
                int i1913 = i1911 - 2;
                Object obj564 = objArr629[i1913];
                objArr629[i1913] = null;
                objArr629[34] = obj564;
                this.AudioAttributesImplApi26Parcelizer = i1911 - 1;
                objArr629[i1913] = obj564;
                return 0;
            case 1271:
                Object[] objArr630 = this.MediaBrowserCompatSearchResultReceiver;
                int i1914 = this.AudioAttributesImplApi26Parcelizer;
                objArr630[i1914] = objArr630[35];
                int[] iArr925 = this.MediaMetadataCompat;
                iArr925[i1914 + 1] = 2;
                int i1915 = i1914 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1915;
                Object obj565 = objArr630[i1914];
                objArr630[i1914] = null;
                objArr630[i1914] = ((Object[]) obj565)[iArr925[i1915]];
                return 0;
            case 1272:
                int i1916 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr926 = this.MediaMetadataCompat;
                iArr926[40] = iArr926[i1916 - 1];
                iArr926[39] = iArr926[i1916 - 2];
                int i1917 = i1916 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1917;
                Object[] objArr631 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj566 = objArr631[i1917];
                objArr631[i1917] = null;
                objArr631[38] = obj566;
                return 0;
            case 1273:
                int i1918 = this.AudioAttributesImplApi26Parcelizer;
                int i1919 = i1918 - 1;
                Object[] objArr632 = this.MediaBrowserCompatSearchResultReceiver;
                objArr632[i1919] = null;
                this.AudioAttributesImplApi26Parcelizer = i1918;
                objArr632[i1919] = objArr632[38];
                return 0;
            case 1274:
                int[] iArr927 = this.MediaMetadataCompat;
                int i1920 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1920 + 1;
                iArr927[i1920] = iArr927[42];
                return 0;
            case 1275:
                int[] iArr928 = this.MediaMetadataCompat;
                int i1921 = this.AudioAttributesImplApi26Parcelizer;
                iArr928[i1921] = iArr928[41];
                iArr928[i1921 + 1] = iArr928[40];
                int i1922 = i1921 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1922;
                iArr928[i1921] = iArr928[i1921] + iArr928[i1922];
                return 0;
            case 1276:
                int[] iArr929 = this.MediaMetadataCompat;
                int i1923 = this.AudioAttributesImplApi26Parcelizer;
                int i1924 = iArr929[i1923 - 1];
                iArr929[i1923 - 1] = iArr929[i1923 - 2];
                iArr929[i1923 - 2] = i1924;
                int i1925 = i1923 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1925;
                Object[] objArr633 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj567 = objArr633[i1925];
                objArr633[i1925] = null;
                ((int[]) obj567)[iArr929[i1923 - 2]] = iArr929[i1923 - 1];
                int i1926 = i1923 - 4;
                this.AudioAttributesImplApi26Parcelizer = i1926;
                Object obj568 = objArr633[i1926];
                objArr633[i1926] = null;
                objArr633[13] = obj568;
                return 0;
            case 1277:
                Object[] objArr634 = this.MediaBrowserCompatSearchResultReceiver;
                int i1927 = this.AudioAttributesImplApi26Parcelizer;
                objArr634[i1927] = objArr634[44];
                int[] iArr930 = this.MediaMetadataCompat;
                iArr930[i1927 + 1] = 3;
                int i1928 = i1927 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1928;
                Object obj569 = objArr634[i1927];
                objArr634[i1927] = null;
                objArr634[i1927] = ((Object[]) obj569)[iArr930[i1928]];
                return 0;
            case 1278:
                int i1929 = this.AudioAttributesImplApi26Parcelizer;
                int i1930 = i1929 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1930;
                int[] iArr931 = this.MediaMetadataCompat;
                Object[] objArr635 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj570 = objArr635[i1929 - 2];
                objArr635[i1929 - 2] = null;
                iArr931[i1929 - 2] = ((int[]) obj570)[iArr931[i1930]];
                iArr931[i1930] = 0;
                int i1931 = i1929 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1931;
                iArr931[37] = iArr931[i1931];
                return 0;
            case AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD /* 1279 */:
                Object[] objArr636 = this.MediaBrowserCompatSearchResultReceiver;
                int i1932 = this.AudioAttributesImplApi26Parcelizer;
                objArr636[i1932] = objArr636[34];
                objArr636[i1932 + 1] = objArr636[35];
                int[] iArr932 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1932 + 3;
                iArr932[i1932 + 2] = 0;
                return 0;
            case 1280:
                int i1933 = this.AudioAttributesImplApi26Parcelizer;
                int i1934 = i1933 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1934;
                int[] iArr933 = this.MediaMetadataCompat;
                Object[] objArr637 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj571 = objArr637[i1933 - 2];
                objArr637[i1933 - 2] = null;
                iArr933[i1933 - 2] = ((int[]) obj571)[iArr933[i1934]];
                this.AudioAttributesImplApi26Parcelizer = i1933;
                objArr637[i1934] = objArr637[35];
                return 0;
            case 1281:
                int i1935 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1935;
                int[] iArr934 = this.MediaMetadataCompat;
                iArr934[43] = iArr934[i1935];
                return 0;
            case 1282:
                int i1936 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1936;
                int[] iArr935 = this.MediaMetadataCompat;
                iArr935[42] = iArr935[i1936];
                return 0;
            case 1283:
                int i1937 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1937;
                Object[] objArr638 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj572 = objArr638[i1937];
                objArr638[i1937] = null;
                objArr638[41] = obj572;
                return 0;
            case 1284:
                int i1938 = this.AudioAttributesImplApi26Parcelizer;
                int i1939 = i1938 - 1;
                Object[] objArr639 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj573 = objArr639[i1939];
                objArr639[i1939] = null;
                objArr639[38] = obj573;
                objArr639[i1939] = obj573;
                int i1940 = i1938 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1940;
                objArr639[i1940] = null;
                return 0;
            case 1285:
                int i1941 = this.AudioAttributesImplApi26Parcelizer;
                int i1942 = i1941 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1942;
                Object[] objArr640 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj574 = objArr640[i1942];
                objArr640[i1942] = null;
                int[] iArr936 = this.MediaMetadataCompat;
                ((int[]) obj574)[iArr936[i1941 - 2]] = iArr936[i1941 - 1];
                objArr640[i1942] = objArr640[38];
                this.AudioAttributesImplApi26Parcelizer = i1941 - 1;
                iArr936[i1941 - 2] = iArr936[40];
                return 0;
            case 1286:
                int i1943 = this.AudioAttributesImplApi26Parcelizer;
                int i1944 = i1943 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1944;
                Object[] objArr641 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj575 = objArr641[i1944];
                objArr641[i1944] = null;
                int[] iArr937 = this.MediaMetadataCompat;
                ((int[]) obj575)[iArr937[i1943 - 2]] = iArr937[i1943 - 1];
                objArr641[i1944] = objArr641[38];
                this.AudioAttributesImplApi26Parcelizer = i1943 - 1;
                objArr641[i1943 - 2] = objArr641[41];
                return 0;
            case 1287:
                int i1945 = this.AudioAttributesImplApi26Parcelizer;
                int i1946 = i1945 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1946;
                Object[] objArr642 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj576 = objArr642[i1946];
                objArr642[i1946] = null;
                int i1947 = this.MediaMetadataCompat[i1945 - 2];
                Object obj577 = objArr642[i1945 - 1];
                objArr642[i1945 - 1] = null;
                ((Object[]) obj576)[i1947] = obj577;
                this.AudioAttributesImplApi26Parcelizer = i1945 - 2;
                objArr642[i1946] = objArr642[38];
                return 0;
            case 1288:
                int[] iArr938 = this.MediaMetadataCompat;
                int i1948 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1948 + 1;
                iArr938[i1948] = iArr938[41];
                return 0;
            case 1289:
                int[] iArr939 = this.MediaMetadataCompat;
                int i1949 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1949 + 1;
                iArr939[i1949] = iArr939[40];
                return 0;
            case 1290:
                int i1950 = this.AudioAttributesImplApi26Parcelizer;
                int i1951 = i1950 - 1;
                Object[] objArr643 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj578 = objArr643[i1951];
                objArr643[i1951] = null;
                objArr643[16] = obj578;
                objArr643[i1951] = objArr643[13];
                int i1952 = i1950 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1952;
                Object obj579 = objArr643[i1952];
                objArr643[i1952] = null;
                objArr643[44] = obj579;
                return 0;
            case 1291:
                int[] iArr940 = this.MediaMetadataCompat;
                int i1953 = this.AudioAttributesImplApi26Parcelizer;
                iArr940[i1953] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1953;
                iArr940[18] = iArr940[i1953];
                return 0;
            case 1292:
                int[] iArr941 = this.MediaMetadataCompat;
                int i1954 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1954 + 1;
                iArr941[i1954] = iArr941[18];
                return 0;
            case 1293:
                Object[] objArr644 = this.MediaBrowserCompatSearchResultReceiver;
                int i1955 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1955 + 1;
                objArr644[i1955] = objArr644[19];
                int[] iArr942 = this.MediaMetadataCompat;
                Object obj580 = objArr644[i1955];
                objArr644[i1955] = null;
                iArr942[i1955] = ((Object[]) obj580).length;
                return 0;
            case 1294:
                Object[] objArr645 = this.MediaBrowserCompatSearchResultReceiver;
                int i1956 = this.AudioAttributesImplApi26Parcelizer;
                objArr645[i1956] = objArr645[19];
                int[] iArr943 = this.MediaMetadataCompat;
                iArr943[i1956 + 1] = iArr943[18];
                int i1957 = i1956 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1957;
                Object obj581 = objArr645[i1956];
                objArr645[i1956] = null;
                objArr645[i1956] = ((Object[]) obj581)[iArr943[i1957]];
                return 0;
            case 1295:
                int i1958 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1958;
                this.MediaBrowserCompatSearchResultReceiver[i1958] = null;
                int[] iArr944 = this.MediaMetadataCompat;
                iArr944[18] = iArr944[18] + 1;
                return 0;
            case 1296:
                int[] iArr945 = this.MediaMetadataCompat;
                int i1959 = this.AudioAttributesImplApi26Parcelizer;
                iArr945[i1959] = iArr945[15];
                this.AudioAttributesImplApi26Parcelizer = i1959 + 2;
                iArr945[i1959 + 1] = iArr945[14];
                return 0;
            case 1297:
                int i1960 = this.AudioAttributesImplApi26Parcelizer;
                int i1961 = i1960 - 1;
                this.AudioAttributesImplApi26Parcelizer = i1961;
                int[] iArr946 = this.MediaMetadataCompat;
                Object[] objArr646 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj582 = objArr646[i1960 - 2];
                objArr646[i1960 - 2] = null;
                iArr946[i1960 - 2] = ((int[]) obj582)[iArr946[i1961]];
                objArr646[i1961] = objArr646[35];
                this.AudioAttributesImplApi26Parcelizer = i1960 + 1;
                iArr946[i1960] = 1;
                return 0;
            case 1298:
                int[] iArr947 = this.MediaMetadataCompat;
                int i1962 = this.AudioAttributesImplApi26Parcelizer;
                iArr947[i1962] = iArr947[36];
                iArr947[i1962 + 1] = iArr947[37];
                int i1963 = i1962 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1963;
                iArr947[43] = iArr947[i1963];
                return 0;
            case 1299:
                int i1964 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr948 = this.MediaMetadataCompat;
                iArr948[42] = iArr948[i1964 - 1];
                int i1965 = i1964 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1965;
                Object[] objArr647 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj583 = objArr647[i1965];
                objArr647[i1965] = null;
                objArr647[41] = obj583;
                return 0;
            case 1300:
                int i1966 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr949 = this.MediaMetadataCompat;
                iArr949[39] = iArr949[i1966 - 1];
                int i1967 = i1966 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1967;
                Object[] objArr648 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj584 = objArr648[i1967];
                objArr648[i1967] = null;
                objArr648[38] = obj584;
                return 0;
            case 1301:
                int i1968 = this.AudioAttributesImplApi26Parcelizer;
                int i1969 = i1968 - 1;
                Object[] objArr649 = this.MediaBrowserCompatSearchResultReceiver;
                objArr649[i1969] = null;
                objArr649[i1969] = objArr649[38];
                int[] iArr950 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1968 + 1;
                iArr950[i1968] = iArr950[39];
                return 0;
            case 1302:
                Object[] objArr650 = this.MediaBrowserCompatSearchResultReceiver;
                int i1970 = this.AudioAttributesImplApi26Parcelizer;
                objArr650[i1970] = objArr650[38];
                int[] iArr951 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1970 + 2;
                iArr951[i1970 + 1] = iArr951[40];
                Object obj585 = objArr650[i1970];
                objArr650[i1970] = null;
                objArr650[i1970 + 1] = obj585;
                iArr951[i1970] = iArr951[i1970 + 1];
                return 0;
            case 1303:
                Object[] objArr651 = this.MediaBrowserCompatSearchResultReceiver;
                int i1971 = this.AudioAttributesImplApi26Parcelizer;
                objArr651[i1971] = objArr651[38];
                int[] iArr952 = this.MediaMetadataCompat;
                iArr952[i1971 + 1] = iArr952[42];
                this.AudioAttributesImplApi26Parcelizer = i1971 + 3;
                iArr952[i1971 + 2] = iArr952[43];
                return 0;
            case 1304:
                int i1972 = this.AudioAttributesImplApi26Parcelizer;
                int i1973 = i1972 - 1;
                Object[] objArr652 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj586 = objArr652[i1973];
                objArr652[i1973] = null;
                objArr652[13] = obj586;
                int[] iArr953 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1972;
                iArr953[i1973] = iArr953[14];
                return 0;
            case 1305:
                long[] jArr74 = this.RatingCompat;
                int i1974 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1974 + 1;
                jArr74[i1974] = jArr74[26];
                return 0;
            case 1306:
                int i1975 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i1975;
                int[] iArr954 = this.MediaMetadataCompat;
                iArr954[36] = iArr954[i1975];
                return 0;
            case 1307:
                Object[] objArr653 = this.MediaBrowserCompatSearchResultReceiver;
                int i1976 = this.AudioAttributesImplApi26Parcelizer;
                objArr653[i1976] = objArr653[35];
                int[] iArr955 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1976 + 2;
                iArr955[i1976 + 1] = 2;
                return 0;
            case 1308:
                Object[] objArr654 = this.MediaBrowserCompatSearchResultReceiver;
                int i1977 = this.AudioAttributesImplApi26Parcelizer;
                objArr654[i1977] = objArr654[38];
                int[] iArr956 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1977 + 2;
                iArr956[i1977 + 1] = iArr956[39];
                return 0;
            case 1309:
                int[] iArr957 = this.MediaMetadataCompat;
                int i1978 = this.AudioAttributesImplApi26Parcelizer;
                iArr957[i1978] = iArr957[40];
                Object[] objArr655 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj587 = objArr655[i1978 - 1];
                objArr655[i1978 - 1] = null;
                objArr655[i1978] = obj587;
                iArr957[i1978 - 1] = iArr957[i1978];
                this.AudioAttributesImplApi26Parcelizer = i1978 + 2;
                iArr957[i1978 + 1] = 1;
                return 0;
            case 1310:
                int i1979 = this.AudioAttributesImplApi26Parcelizer;
                int i1980 = i1979 - 1;
                Object[] objArr656 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj588 = objArr656[i1980];
                objArr656[i1980] = null;
                objArr656[13] = obj588;
                this.AudioAttributesImplApi26Parcelizer = i1979;
                objArr656[i1980] = null;
                return 0;
            case 1311:
                Object[] objArr657 = this.MediaBrowserCompatSearchResultReceiver;
                int i1981 = this.AudioAttributesImplApi26Parcelizer;
                objArr657[i1981 - 1] = new int[this.MediaMetadataCompat[i1981 - 1]];
                this.AudioAttributesImplApi26Parcelizer = i1981 + 1;
                objArr657[i1981] = objArr657[i1981 - 1];
                return 0;
            case 1312:
                int[] iArr958 = this.MediaMetadataCompat;
                int i1982 = this.AudioAttributesImplApi26Parcelizer;
                iArr958[i1982] = iArr958[14];
                iArr958[i1982 + 1] = 1;
                int i1983 = i1982 + 1;
                this.AudioAttributesImplApi26Parcelizer = i1983;
                iArr958[i1982] = iArr958[i1982] - iArr958[i1983];
                return 0;
            case 1313:
                int[] iArr959 = this.MediaMetadataCompat;
                int i1984 = this.AudioAttributesImplApi26Parcelizer;
                iArr959[i1984] = iArr959[14];
                this.AudioAttributesImplApi26Parcelizer = i1984 + 2;
                iArr959[i1984 + 1] = iArr959[i1984];
                return 0;
            case 1314:
                int i1985 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr960 = this.MediaMetadataCompat;
                iArr960[i1985 - 2] = iArr960[i1985 - 2] - iArr960[i1985 - 1];
                int i1986 = i1985 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1986;
                Object[] objArr658 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj589 = objArr658[i1985 - 3];
                objArr658[i1985 - 3] = null;
                iArr960[i1985 - 3] = ((int[]) obj589)[iArr960[i1986]];
                this.AudioAttributesImplApi26Parcelizer = i1985 - 1;
                iArr960[i1986] = 1;
                return 0;
            case 1315:
                Object[] objArr659 = this.MediaBrowserCompatSearchResultReceiver;
                int i1987 = this.AudioAttributesImplApi26Parcelizer;
                objArr659[i1987] = objArr659[i1987 - 1];
                Object obj590 = objArr659[i1987];
                objArr659[i1987] = null;
                objArr659[44] = obj590;
                this.AudioAttributesImplApi26Parcelizer = i1987 + 1;
                objArr659[i1987] = obj590;
                return 0;
            case 1316:
                int[] iArr961 = this.MediaMetadataCompat;
                int i1988 = this.AudioAttributesImplApi26Parcelizer;
                iArr961[i1988] = 0;
                this.AudioAttributesImplApi26Parcelizer = i1988;
                iArr961[37] = iArr961[i1988];
                return 0;
            case 1317:
                int i1989 = this.AudioAttributesImplApi26Parcelizer;
                int i1990 = i1989 - 1;
                Object[] objArr660 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj591 = objArr660[i1990];
                objArr660[i1990] = null;
                objArr660[34] = obj591;
                this.AudioAttributesImplApi26Parcelizer = i1989;
                objArr660[i1990] = obj591;
                return 0;
            case 1318:
                int i1991 = this.AudioAttributesImplApi26Parcelizer;
                int i1992 = i1991 - 1;
                Object[] objArr661 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj592 = objArr661[i1992];
                objArr661[i1992] = null;
                objArr661[41] = obj592;
                int i1993 = i1991 - 2;
                this.AudioAttributesImplApi26Parcelizer = i1993;
                int[] iArr962 = this.MediaMetadataCompat;
                iArr962[40] = iArr962[i1993];
                return 0;
            case 1319:
                int[] iArr963 = this.MediaMetadataCompat;
                int i1994 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i1994 + 1;
                iArr963[i1994] = iArr963[39];
                Object[] objArr662 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj593 = objArr662[i1994 - 1];
                objArr662[i1994 - 1] = null;
                objArr662[i1994] = obj593;
                iArr963[i1994 - 1] = iArr963[i1994];
                return 0;
            case 1320:
                Object[] objArr663 = this.MediaBrowserCompatSearchResultReceiver;
                int i1995 = this.AudioAttributesImplApi26Parcelizer;
                objArr663[i1995] = objArr663[38];
                objArr663[i1995 + 1] = objArr663[41];
                int[] iArr964 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i1995 + 3;
                iArr964[i1995 + 2] = 2;
                return 0;
            case 1321:
                Object[] objArr664 = this.MediaBrowserCompatSearchResultReceiver;
                int i1996 = this.AudioAttributesImplApi26Parcelizer;
                Object obj594 = objArr664[i1996 - 2];
                objArr664[i1996 - 2] = null;
                objArr664[i1996 - 1] = obj594;
                int[] iArr965 = this.MediaMetadataCompat;
                iArr965[i1996 - 2] = iArr965[i1996 - 1];
                int i1997 = i1996 - 3;
                this.AudioAttributesImplApi26Parcelizer = i1997;
                Object obj595 = objArr664[i1997];
                objArr664[i1997] = null;
                int i1998 = iArr965[i1996 - 2];
                Object obj596 = objArr664[i1996 - 1];
                objArr664[i1996 - 1] = null;
                ((Object[]) obj595)[i1998] = obj596;
                this.AudioAttributesImplApi26Parcelizer = i1996 - 2;
                objArr664[i1997] = objArr664[38];
                return 0;
            case 1322:
                int i1999 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr966 = this.MediaMetadataCompat;
                int i2000 = iArr966[i1999 - 1];
                iArr966[41] = i2000;
                int i2001 = i1999 - 2;
                iArr966[40] = iArr966[i2001];
                this.AudioAttributesImplApi26Parcelizer = i1999 - 1;
                iArr966[i2001] = i2000;
                return 0;
            case 1323:
                int i2002 = this.AudioAttributesImplApi26Parcelizer;
                int i2003 = i2002 - 1;
                long[] jArr75 = this.RatingCompat;
                jArr75[28] = jArr75[i2003];
                Object[] objArr665 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i2002;
                objArr665[i2003] = objArr665[66];
                return 0;
            case 1324:
                long[] jArr76 = this.RatingCompat;
                int i2004 = this.AudioAttributesImplApi26Parcelizer;
                jArr76[i2004] = jArr76[28];
                jArr76[i2004 + 1] = jArr76[30];
                int i2005 = i2004 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2005;
                this.MediaMetadataCompat[i2004] = (jArr76[i2004] > jArr76[i2005] ? 1 : (jArr76[i2004] == jArr76[i2005] ? 0 : -1));
                return 0;
            case 1325:
                int i2006 = this.AudioAttributesImplApi26Parcelizer;
                int i2007 = i2006 - 1;
                Object[] objArr666 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj597 = objArr666[i2007];
                objArr666[i2007] = null;
                objArr666[14] = obj597;
                int[] iArr967 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i2006;
                iArr967[i2007] = 3;
                return 0;
            case 1326:
                int[] iArr968 = this.MediaMetadataCompat;
                int i2008 = this.AudioAttributesImplApi26Parcelizer;
                iArr968[i2008] = 0;
                this.AudioAttributesImplApi26Parcelizer = i2008;
                iArr968[48] = iArr968[i2008];
                return 0;
            case 1327:
                int i2009 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr969 = this.MediaMetadataCompat;
                iArr969[47] = iArr969[i2009 - 1];
                int i2010 = i2009 - 2;
                Object[] objArr667 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj598 = objArr667[i2010];
                objArr667[i2010] = null;
                objArr667[46] = obj598;
                int i2011 = i2009 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2011;
                Object obj599 = objArr667[i2011];
                objArr667[i2011] = null;
                objArr667[45] = obj599;
                return 0;
            case 1328:
                Object[] objArr668 = this.MediaBrowserCompatSearchResultReceiver;
                int i2012 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2012 + 1;
                objArr668[i2012] = objArr668[45];
                return 0;
            case 1329:
                Object[] objArr669 = this.MediaBrowserCompatSearchResultReceiver;
                int i2013 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2013 + 1;
                objArr669[i2013] = objArr669[46];
                return 0;
            case 1330:
                Object[] objArr670 = this.MediaBrowserCompatSearchResultReceiver;
                int i2014 = this.AudioAttributesImplApi26Parcelizer;
                objArr670[i2014] = objArr670[46];
                int[] iArr970 = this.MediaMetadataCompat;
                iArr970[i2014 + 1] = 2;
                int i2015 = i2014 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2015;
                Object obj600 = objArr670[i2014];
                objArr670[i2014] = null;
                objArr670[i2014] = ((Object[]) obj600)[iArr970[i2015]];
                return 0;
            case 1331:
                int i2016 = this.AudioAttributesImplApi26Parcelizer;
                int i2017 = i2016 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2017;
                int[] iArr971 = this.MediaMetadataCompat;
                Object[] objArr671 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj601 = objArr671[i2016 - 2];
                objArr671[i2016 - 2] = null;
                iArr971[i2016 - 2] = ((int[]) obj601)[iArr971[i2017]];
                this.AudioAttributesImplApi26Parcelizer = i2016;
                iArr971[i2017] = iArr971[47];
                return 0;
            case 1332:
                int[] iArr972 = this.MediaMetadataCompat;
                int i2018 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2018 + 1;
                iArr972[i2018] = iArr972[48];
                return 0;
            case 1333:
                int i2019 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr973 = this.MediaMetadataCompat;
                iArr973[53] = iArr973[i2019 - 1];
                int i2020 = i2019 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2020;
                iArr973[52] = iArr973[i2020];
                return 0;
            case 1334:
                int i2021 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2021;
                int[] iArr974 = this.MediaMetadataCompat;
                iArr974[51] = iArr974[i2021];
                return 0;
            case 1335:
                int i2022 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2022;
                int[] iArr975 = this.MediaMetadataCompat;
                iArr975[50] = iArr975[i2022];
                return 0;
            case 1336:
                int i2023 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2023;
                Object[] objArr672 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj602 = objArr672[i2023];
                objArr672[i2023] = null;
                objArr672[49] = obj602;
                return 0;
            case 1337:
                Object[] objArr673 = this.MediaBrowserCompatSearchResultReceiver;
                int i2024 = this.AudioAttributesImplApi26Parcelizer;
                objArr673[i2024] = objArr673[49];
                objArr673[i2024] = null;
                this.AudioAttributesImplApi26Parcelizer = i2024 + 1;
                objArr673[i2024] = objArr673[49];
                return 0;
            case 1338:
                int[] iArr976 = this.MediaMetadataCompat;
                int i2025 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2025 + 1;
                iArr976[i2025] = iArr976[50];
                Object[] objArr674 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj603 = objArr674[i2025 - 1];
                objArr674[i2025 - 1] = null;
                objArr674[i2025] = obj603;
                iArr976[i2025 - 1] = iArr976[i2025];
                return 0;
            case 1339:
                int[] iArr977 = this.MediaMetadataCompat;
                int i2026 = this.AudioAttributesImplApi26Parcelizer;
                int i2027 = iArr977[i2026 - 1];
                iArr977[i2026 - 1] = iArr977[i2026 - 2];
                iArr977[i2026 - 2] = i2027;
                int i2028 = i2026 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2028;
                Object[] objArr675 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj604 = objArr675[i2028];
                objArr675[i2028] = null;
                ((int[]) obj604)[iArr977[i2026 - 2]] = iArr977[i2026 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2026 - 2;
                objArr675[i2028] = objArr675[49];
                return 0;
            case 1340:
                int[] iArr978 = this.MediaMetadataCompat;
                int i2029 = this.AudioAttributesImplApi26Parcelizer;
                iArr978[i2029] = iArr978[51];
                Object[] objArr676 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj605 = objArr676[i2029 - 1];
                objArr676[i2029 - 1] = null;
                objArr676[i2029] = obj605;
                iArr978[i2029 - 1] = iArr978[i2029];
                this.AudioAttributesImplApi26Parcelizer = i2029 + 2;
                iArr978[i2029 + 1] = 2;
                return 0;
            case 1341:
                Object[] objArr677 = this.MediaBrowserCompatSearchResultReceiver;
                int i2030 = this.AudioAttributesImplApi26Parcelizer;
                objArr677[i2030] = objArr677[49];
                int[] iArr979 = this.MediaMetadataCompat;
                iArr979[i2030 + 1] = iArr979[52];
                this.AudioAttributesImplApi26Parcelizer = i2030 + 3;
                iArr979[i2030 + 2] = iArr979[53];
                return 0;
            case 1342:
                int i2031 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2031;
                int[] iArr980 = this.MediaMetadataCompat;
                iArr980[52] = iArr980[i2031];
                return 0;
            case 1343:
                int[] iArr981 = this.MediaMetadataCompat;
                int i2032 = this.AudioAttributesImplApi26Parcelizer;
                iArr981[i2032] = iArr981[52];
                iArr981[i2032 + 1] = iArr981[51];
                int i2033 = i2032 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2033;
                iArr981[i2032] = iArr981[i2032] + iArr981[i2033];
                return 0;
            case 1344:
                int[] iArr982 = this.MediaMetadataCompat;
                int i2034 = this.AudioAttributesImplApi26Parcelizer;
                iArr982[i2034] = -114;
                this.AudioAttributesImplApi26Parcelizer = i2034;
                iArr982[i2034 - 1] = iArr982[i2034 - 1] + iArr982[i2034];
                return 0;
            case 1345:
                int i2035 = this.AudioAttributesImplApi26Parcelizer;
                int i2036 = i2035 - 1;
                Object[] objArr678 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj606 = objArr678[i2036];
                objArr678[i2036] = null;
                objArr678[54] = obj606;
                this.AudioAttributesImplApi26Parcelizer = i2035;
                objArr678[i2036] = obj606;
                return 0;
            case 1346:
                int i2037 = this.AudioAttributesImplApi26Parcelizer;
                int i2038 = i2037 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2038;
                int[] iArr983 = this.MediaMetadataCompat;
                Object[] objArr679 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj607 = objArr679[i2037 - 2];
                objArr679[i2037 - 2] = null;
                iArr983[i2037 - 2] = ((int[]) obj607)[iArr983[i2038]];
                int i2039 = i2037 - 2;
                iArr983[16] = iArr983[i2039];
                this.AudioAttributesImplApi26Parcelizer = i2037 - 1;
                objArr679[i2039] = objArr679[14];
                return 0;
            case 1347:
                int i2040 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2040;
                Object[] objArr680 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj608 = objArr680[i2040];
                objArr680[i2040] = null;
                objArr680[54] = obj608;
                return 0;
            case 1348:
                Object[] objArr681 = this.MediaBrowserCompatSearchResultReceiver;
                int i2041 = this.AudioAttributesImplApi26Parcelizer;
                objArr681[i2041] = objArr681[54];
                int[] iArr984 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i2041 + 2;
                iArr984[i2041 + 1] = 0;
                return 0;
            case 1349:
                int i2042 = this.AudioAttributesImplApi26Parcelizer;
                int i2043 = i2042 - 1;
                int[] iArr985 = this.MediaMetadataCompat;
                iArr985[15] = iArr985[i2043];
                this.AudioAttributesImplApi26Parcelizer = i2042;
                iArr985[i2043] = iArr985[16];
                return 0;
            case 1350:
                Object[] objArr682 = this.MediaBrowserCompatSearchResultReceiver;
                int i2044 = this.AudioAttributesImplApi26Parcelizer;
                objArr682[i2044] = objArr682[54];
                int[] iArr986 = this.MediaMetadataCompat;
                iArr986[i2044 + 1] = 1;
                int i2045 = i2044 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2045;
                Object obj609 = objArr682[i2044];
                objArr682[i2044] = null;
                objArr682[i2044] = ((Object[]) obj609)[iArr986[i2045]];
                return 0;
            case 1351:
                int i2046 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr987 = this.MediaMetadataCompat;
                iArr987[48] = iArr987[i2046 - 1];
                iArr987[47] = iArr987[i2046 - 2];
                int i2047 = i2046 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2047;
                Object[] objArr683 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj610 = objArr683[i2047];
                objArr683[i2047] = null;
                objArr683[46] = obj610;
                return 0;
            case 1352:
                int i2048 = this.AudioAttributesImplApi26Parcelizer;
                int i2049 = i2048 - 1;
                Object[] objArr684 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj611 = objArr684[i2049];
                objArr684[i2049] = null;
                objArr684[45] = obj611;
                objArr684[i2049] = obj611;
                this.AudioAttributesImplApi26Parcelizer = i2048 + 1;
                objArr684[i2048] = objArr684[46];
                return 0;
            case 1353:
                int[] iArr988 = this.MediaMetadataCompat;
                int i2050 = this.AudioAttributesImplApi26Parcelizer;
                iArr988[i2050] = iArr988[47];
                iArr988[i2050 + 1] = iArr988[48];
                int i2051 = i2050 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2051;
                iArr988[53] = iArr988[i2051];
                return 0;
            case 1354:
                int i2052 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr989 = this.MediaMetadataCompat;
                iArr989[52] = iArr989[i2052 - 1];
                int i2053 = i2052 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2053;
                iArr989[51] = iArr989[i2053];
                return 0;
            case 1355:
                int i2054 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr990 = this.MediaMetadataCompat;
                iArr990[50] = iArr990[i2054 - 1];
                int i2055 = i2054 - 2;
                Object[] objArr685 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj612 = objArr685[i2055];
                objArr685[i2055] = null;
                objArr685[49] = obj612;
                this.AudioAttributesImplApi26Parcelizer = i2054 - 1;
                objArr685[i2055] = obj612;
                return 0;
            case 1356:
                Object[] objArr686 = this.MediaBrowserCompatSearchResultReceiver;
                int i2056 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2056 + 1;
                objArr686[i2056] = objArr686[49];
                return 0;
            case 1357:
                int[] iArr991 = this.MediaMetadataCompat;
                int i2057 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2057 + 1;
                iArr991[i2057] = iArr991[51];
                Object[] objArr687 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj613 = objArr687[i2057 - 1];
                objArr687[i2057 - 1] = null;
                objArr687[i2057] = obj613;
                iArr991[i2057 - 1] = iArr991[i2057];
                return 0;
            case 1358:
                int[] iArr992 = this.MediaMetadataCompat;
                int i2058 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2058 + 1;
                iArr992[i2058] = iArr992[52];
                return 0;
            case 1359:
                int[] iArr993 = this.MediaMetadataCompat;
                int i2059 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2059 + 1;
                iArr993[i2059] = iArr993[53];
                return 0;
            case 1360:
                int i2060 = this.AudioAttributesImplApi26Parcelizer;
                int i2061 = i2060 - 1;
                int[] iArr994 = this.MediaMetadataCompat;
                iArr994[51] = iArr994[i2061];
                this.AudioAttributesImplApi26Parcelizer = i2060;
                iArr994[i2061] = iArr994[52];
                return 0;
            case 1361:
                int[] iArr995 = this.MediaMetadataCompat;
                int i2062 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2062 + 1;
                iArr995[i2062] = iArr995[51];
                return 0;
            case 1362:
                Object[] objArr688 = this.MediaBrowserCompatSearchResultReceiver;
                int i2063 = this.AudioAttributesImplApi26Parcelizer;
                objArr688[i2063] = objArr688[54];
                int[] iArr996 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i2063 + 2;
                iArr996[i2063 + 1] = 1;
                return 0;
            case 1363:
                int i2064 = this.AudioAttributesImplApi26Parcelizer;
                int i2065 = i2064 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2065;
                int[] iArr997 = this.MediaMetadataCompat;
                Object[] objArr689 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj614 = objArr689[i2064 - 2];
                objArr689[i2064 - 2] = null;
                iArr997[i2064 - 2] = ((int[]) obj614)[iArr997[i2065]];
                iArr997[i2065] = 0;
                int i2066 = i2064 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2066;
                iArr997[48] = iArr997[i2066];
                return 0;
            case 1364:
                int i2067 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2067;
                int[] iArr998 = this.MediaMetadataCompat;
                iArr998[47] = iArr998[i2067];
                return 0;
            case 1365:
                int i2068 = this.AudioAttributesImplApi26Parcelizer;
                int i2069 = i2068 - 1;
                Object[] objArr690 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj615 = objArr690[i2069];
                objArr690[i2069] = null;
                objArr690[46] = obj615;
                int i2070 = i2068 - 2;
                Object obj616 = objArr690[i2070];
                objArr690[i2070] = null;
                objArr690[45] = obj616;
                this.AudioAttributesImplApi26Parcelizer = i2068 - 1;
                objArr690[i2070] = obj616;
                return 0;
            case 1366:
                Object[] objArr691 = this.MediaBrowserCompatSearchResultReceiver;
                int i2071 = this.AudioAttributesImplApi26Parcelizer;
                objArr691[i2071] = objArr691[46];
                int[] iArr999 = this.MediaMetadataCompat;
                iArr999[i2071 + 1] = 0;
                int i2072 = i2071 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2072;
                Object obj617 = objArr691[i2071];
                objArr691[i2071] = null;
                objArr691[i2071] = ((Object[]) obj617)[iArr999[i2072]];
                return 0;
            case 1367:
                int i2073 = this.AudioAttributesImplApi26Parcelizer;
                int i2074 = i2073 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2074;
                int[] iArr1000 = this.MediaMetadataCompat;
                Object[] objArr692 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj618 = objArr692[i2073 - 2];
                objArr692[i2073 - 2] = null;
                iArr1000[i2073 - 2] = ((int[]) obj618)[iArr1000[i2074]];
                objArr692[i2074] = objArr692[46];
                this.AudioAttributesImplApi26Parcelizer = i2073 + 1;
                iArr1000[i2073] = 2;
                return 0;
            case 1368:
                int[] iArr1001 = this.MediaMetadataCompat;
                int i2075 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2075 + 1;
                iArr1001[i2075] = iArr1001[47];
                return 0;
            case 1369:
                int i2076 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1002 = this.MediaMetadataCompat;
                iArr1002[53] = iArr1002[i2076 - 1];
                iArr1002[52] = iArr1002[i2076 - 2];
                int i2077 = i2076 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2077;
                iArr1002[51] = iArr1002[i2077];
                return 0;
            case 1370:
                Object[] objArr693 = this.MediaBrowserCompatSearchResultReceiver;
                int i2078 = this.AudioAttributesImplApi26Parcelizer;
                objArr693[i2078] = objArr693[49];
                int[] iArr1003 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i2078 + 2;
                iArr1003[i2078 + 1] = iArr1003[50];
                return 0;
            case 1371:
                int[] iArr1004 = this.MediaMetadataCompat;
                int i2079 = this.AudioAttributesImplApi26Parcelizer;
                iArr1004[i2079] = iArr1004[52];
                this.AudioAttributesImplApi26Parcelizer = i2079 + 2;
                iArr1004[i2079 + 1] = iArr1004[53];
                return 0;
            case 1372:
                int[] iArr1005 = this.MediaMetadataCompat;
                int i2080 = this.AudioAttributesImplApi26Parcelizer;
                iArr1005[i2080] = iArr1005[52];
                this.AudioAttributesImplApi26Parcelizer = i2080 + 2;
                iArr1005[i2080 + 1] = iArr1005[51];
                return 0;
            case 1373:
                Object[] objArr694 = this.MediaBrowserCompatSearchResultReceiver;
                int i2081 = this.AudioAttributesImplApi26Parcelizer;
                objArr694[i2081] = objArr694[i2081 - 1];
                Object obj619 = objArr694[i2081];
                objArr694[i2081] = null;
                objArr694[54] = obj619;
                this.AudioAttributesImplApi26Parcelizer = i2081 + 1;
                objArr694[i2081] = obj619;
                return 0;
            case 1374:
                int i2082 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1006 = this.MediaMetadataCompat;
                iArr1006[48] = iArr1006[i2082 - 1];
                int i2083 = i2082 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2083;
                iArr1006[47] = iArr1006[i2083];
                return 0;
            case 1375:
                int[] iArr1007 = this.MediaMetadataCompat;
                int i2084 = this.AudioAttributesImplApi26Parcelizer;
                iArr1007[i2084] = 0;
                this.AudioAttributesImplApi26Parcelizer = i2084;
                Object[] objArr695 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj620 = objArr695[i2084 - 1];
                objArr695[i2084 - 1] = null;
                iArr1007[i2084 - 1] = ((int[]) obj620)[iArr1007[i2084]];
                this.AudioAttributesImplApi26Parcelizer = i2084 + 1;
                objArr695[i2084] = objArr695[46];
                return 0;
            case 1376:
                int i2085 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2085;
                int[] iArr1008 = this.MediaMetadataCompat;
                iArr1008[53] = iArr1008[i2085];
                return 0;
            case 1377:
                int i2086 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1009 = this.MediaMetadataCompat;
                iArr1009[52] = iArr1009[i2086 - 1];
                iArr1009[51] = iArr1009[i2086 - 2];
                int i2087 = i2086 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2087;
                iArr1009[50] = iArr1009[i2087];
                return 0;
            case 1378:
                Object[] objArr696 = this.MediaBrowserCompatSearchResultReceiver;
                int i2088 = this.AudioAttributesImplApi26Parcelizer;
                objArr696[i2088] = objArr696[49];
                int[] iArr1010 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = i2088 + 2;
                iArr1010[i2088 + 1] = iArr1010[51];
                return 0;
            case 1379:
                Object[] objArr697 = this.MediaBrowserCompatSearchResultReceiver;
                int i2089 = this.AudioAttributesImplApi26Parcelizer;
                objArr697[i2089] = objArr697[i2089 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2089 + 2;
                objArr697[i2089 + 1] = objArr697[14];
                return 0;
            case 1380:
                int i2090 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2090;
                int[] iArr1011 = this.MediaMetadataCompat;
                iArr1011[48] = iArr1011[i2090];
                return 0;
            case 1381:
                int i2091 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2091;
                Object[] objArr698 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj621 = objArr698[i2091];
                objArr698[i2091] = null;
                objArr698[46] = obj621;
                return 0;
            case 1382:
                int i2092 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2092;
                Object[] objArr699 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj622 = objArr699[i2092];
                objArr699[i2092] = null;
                objArr699[45] = obj622;
                return 0;
            case 1383:
                Object[] objArr700 = this.MediaBrowserCompatSearchResultReceiver;
                int i2093 = this.AudioAttributesImplApi26Parcelizer;
                objArr700[i2093] = objArr700[45];
                this.AudioAttributesImplApi26Parcelizer = i2093 + 2;
                objArr700[i2093 + 1] = objArr700[46];
                return 0;
            case 1384:
                int i2094 = this.AudioAttributesImplApi26Parcelizer;
                int i2095 = i2094 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2095;
                int[] iArr1012 = this.MediaMetadataCompat;
                Object[] objArr701 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj623 = objArr701[i2094 - 2];
                objArr701[i2094 - 2] = null;
                iArr1012[i2094 - 2] = ((int[]) obj623)[iArr1012[i2095]];
                iArr1012[i2095] = iArr1012[47];
                this.AudioAttributesImplApi26Parcelizer = i2094 + 1;
                iArr1012[i2094] = iArr1012[48];
                return 0;
            case 1385:
                int[] iArr1013 = this.MediaMetadataCompat;
                int i2096 = this.AudioAttributesImplApi26Parcelizer;
                iArr1013[i2096] = iArr1013[51];
                this.AudioAttributesImplApi26Parcelizer = i2096;
                iArr1013[i2096 - 1] = iArr1013[i2096 - 1] + iArr1013[i2096];
                return 0;
            case 1386:
                int i2097 = this.AudioAttributesImplApi26Parcelizer;
                int i2098 = i2097 - 1;
                Object[] objArr702 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj624 = objArr702[i2098];
                objArr702[i2098] = null;
                objArr702[14] = obj624;
                int[] iArr1014 = this.MediaMetadataCompat;
                iArr1014[i2098] = iArr1014[15];
                this.AudioAttributesImplApi26Parcelizer = i2097 + 1;
                iArr1014[i2097] = iArr1014[16];
                return 0;
            case 1387:
                int i2099 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr77 = this.RatingCompat;
                jArr77[i2099 - 2] = jArr77[i2099 - 2] | jArr77[i2099 - 1];
                int i2100 = i2099 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2100;
                jArr77[32] = jArr77[i2100];
                return 0;
            case 1388:
                long[] jArr78 = this.RatingCompat;
                int i2101 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2101 + 1;
                jArr78[i2101] = jArr78[32];
                return 0;
            case 1389:
                Object[] objArr703 = this.MediaBrowserCompatSearchResultReceiver;
                int i2102 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2102 + 1;
                objArr703[i2102] = objArr703[54];
                return 0;
            case 1390:
                int i2103 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1015 = this.MediaMetadataCompat;
                iArr1015[47] = iArr1015[i2103 - 1];
                int i2104 = i2103 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2104;
                Object[] objArr704 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj625 = objArr704[i2104];
                objArr704[i2104] = null;
                objArr704[46] = obj625;
                return 0;
            case 1391:
                int[] iArr1016 = this.MediaMetadataCompat;
                int i2105 = this.AudioAttributesImplApi26Parcelizer;
                iArr1016[i2105] = iArr1016[51];
                iArr1016[i2105 - 1] = iArr1016[i2105 - 1] + iArr1016[i2105];
                int i2106 = i2105 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2106;
                iArr1016[i2105 - 2] = iArr1016[i2105 - 2] + iArr1016[i2106];
                return 0;
            case 1392:
                int[] iArr1017 = this.MediaMetadataCompat;
                int i2107 = this.AudioAttributesImplApi26Parcelizer;
                int i2108 = iArr1017[i2107 - 1];
                iArr1017[i2107 - 1] = iArr1017[i2107 - 2];
                iArr1017[i2107 - 2] = i2108;
                int i2109 = i2107 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2109;
                Object[] objArr705 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj626 = objArr705[i2109];
                objArr705[i2109] = null;
                ((int[]) obj626)[iArr1017[i2107 - 2]] = iArr1017[i2107 - 1];
                int i2110 = i2107 - 4;
                this.AudioAttributesImplApi26Parcelizer = i2110;
                Object obj627 = objArr705[i2110];
                objArr705[i2110] = null;
                objArr705[14] = obj627;
                return 0;
            case 1393:
                int[] iArr1018 = this.MediaMetadataCompat;
                int i2111 = this.AudioAttributesImplApi26Parcelizer;
                iArr1018[i2111] = iArr1018[15];
                iArr1018[i2111 + 1] = 1;
                int i2112 = i2111 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2112;
                iArr1018[i2111] = iArr1018[i2111] - iArr1018[i2112];
                return 0;
            case 1394:
                int i2113 = this.AudioAttributesImplApi26Parcelizer;
                int i2114 = i2113 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2114;
                Object[] objArr706 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj628 = objArr706[i2114];
                objArr706[i2114] = null;
                int[] iArr1019 = this.MediaMetadataCompat;
                ((int[]) obj628)[iArr1019[i2113 - 2]] = iArr1019[i2113 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2113 - 2;
                iArr1019[i2114] = iArr1019[15];
                return 0;
            case 1395:
                int[] iArr1020 = this.MediaMetadataCompat;
                int i2115 = this.AudioAttributesImplApi26Parcelizer;
                iArr1020[i2115] = 1;
                iArr1020[i2115 - 1] = iArr1020[i2115 - 1] - iArr1020[i2115];
                int i2116 = i2115 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2116;
                iArr1020[i2115 - 2] = iArr1020[i2115 - 2] * iArr1020[i2116];
                return 0;
            case 1396:
                int[] iArr1021 = this.MediaMetadataCompat;
                int i2117 = this.AudioAttributesImplApi26Parcelizer;
                iArr1021[i2117] = 0;
                this.AudioAttributesImplApi26Parcelizer = i2117;
                Object[] objArr707 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj629 = objArr707[i2117 - 1];
                objArr707[i2117 - 1] = null;
                iArr1021[i2117 - 1] = ((int[]) obj629)[iArr1021[i2117]];
                this.AudioAttributesImplApi26Parcelizer = i2117 + 1;
                iArr1021[i2117] = iArr1021[47];
                return 0;
            case 1397:
                int i2118 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1022 = this.MediaMetadataCompat;
                iArr1022[51] = iArr1022[i2118 - 1];
                int i2119 = i2118 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2119;
                iArr1022[50] = iArr1022[i2119];
                return 0;
            case 1398:
                int[] iArr1023 = this.MediaMetadataCompat;
                int i2120 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2120 + 1;
                iArr1023[i2120] = iArr1023[50];
                return 0;
            case 1399:
                int i2121 = this.AudioAttributesImplApi26Parcelizer;
                int i2122 = i2121 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2122;
                Object[] objArr708 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj630 = objArr708[i2122];
                objArr708[i2122] = null;
                int[] iArr1024 = this.MediaMetadataCompat;
                ((int[]) obj630)[iArr1024[i2121 - 2]] = iArr1024[i2121 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2121 - 2;
                objArr708[i2122] = objArr708[49];
                return 0;
            case 1400:
                int i2123 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1025 = this.MediaMetadataCompat;
                int i2124 = iArr1025[i2123 - 1];
                iArr1025[52] = i2124;
                int i2125 = i2123 - 2;
                iArr1025[51] = iArr1025[i2125];
                this.AudioAttributesImplApi26Parcelizer = i2123 - 1;
                iArr1025[i2125] = i2124;
                return 0;
            case 1401:
                int[] iArr1026 = this.MediaMetadataCompat;
                int i2126 = this.AudioAttributesImplApi26Parcelizer;
                iArr1026[i2126] = iArr1026[i2126 - 1];
                iArr1026[i2126 + 1] = iArr1026[i2126];
                int i2127 = i2126 + 1;
                this.AudioAttributesImplApi26Parcelizer = i2127;
                iArr1026[i2126] = iArr1026[i2126] * iArr1026[i2127];
                return 0;
            case 1402:
                int i2128 = this.AudioAttributesImplApi26Parcelizer;
                int i2129 = i2128 - 1;
                int[] iArr1027 = this.MediaMetadataCompat;
                iArr1027[i2128 - 2] = iArr1027[i2128 - 2] * iArr1027[i2129];
                this.AudioAttributesImplApi26Parcelizer = i2128 + 1;
                iArr1027[i2128] = iArr1027[i2128 - 2];
                iArr1027[i2129] = iArr1027[i2128 - 3];
                return 0;
            case 1403:
                int i2130 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i2130 - 1] = null;
                int[] iArr1028 = this.MediaMetadataCompat;
                iArr1028[i2130 - 2] = -iArr1028[i2130 - 2];
                int i2131 = i2130 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2131;
                iArr1028[i2130 - 3] = iArr1028[i2130 - 3] & iArr1028[i2131];
                return 0;
            case 1404:
                int[] iArr1029 = this.MediaMetadataCompat;
                int i2132 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2132 + 1;
                iArr1029[i2132] = 21;
                return 0;
            case 1405:
                int[] iArr1030 = this.MediaMetadataCompat;
                int i2133 = this.AudioAttributesImplApi26Parcelizer;
                iArr1030[i2133] = iArr1030[i2133 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2133 + 2;
                iArr1030[i2133 + 1] = -4095;
                return 0;
            case 1406:
                int i2134 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1031 = this.MediaMetadataCompat;
                iArr1031[i2134 - 2] = iArr1031[i2134 - 2] << iArr1031[i2134 - 1];
                int i2135 = i2134 - 2;
                iArr1031[i2134 - 3] = iArr1031[i2134 - 3] + iArr1031[i2135];
                this.AudioAttributesImplApi26Parcelizer = i2134 - 1;
                iArr1031[i2135] = 2048;
                return 0;
            case 1407:
                int[] iArr1032 = this.MediaMetadataCompat;
                int i2136 = this.AudioAttributesImplApi26Parcelizer;
                iArr1032[i2136 + 1] = iArr1032[i2136 - 1];
                iArr1032[i2136] = iArr1032[i2136 - 2];
                int i2137 = i2136 + 1;
                iArr1032[i2136] = iArr1032[i2136] | iArr1032[i2137];
                this.AudioAttributesImplApi26Parcelizer = i2136 + 2;
                iArr1032[i2137] = 1;
                return 0;
            case 1408:
                int[] iArr1033 = this.MediaMetadataCompat;
                int i2138 = this.AudioAttributesImplApi26Parcelizer;
                int i2139 = iArr1033[i2138 - 1];
                iArr1033[i2138] = i2139;
                iArr1033[i2138 - 1] = iArr1033[i2138 - 2];
                iArr1033[i2138 - 2] = iArr1033[i2138 - 3];
                iArr1033[i2138 - 3] = i2139;
                this.MediaBrowserCompatSearchResultReceiver[i2138] = null;
                int i2140 = i2138 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2140;
                iArr1033[i2138 - 2] = iArr1033[i2138 - 2] | iArr1033[i2140];
                return 0;
            case 1409:
                int i2141 = this.AudioAttributesImplApi26Parcelizer;
                int i2142 = i2141 - 1;
                int[] iArr1034 = this.MediaMetadataCompat;
                iArr1034[i2141 - 2] = iArr1034[i2141 - 2] + iArr1034[i2142];
                int i2143 = iArr1034[i2141 - 2];
                iArr1034[i2141 - 2] = iArr1034[i2141 - 3];
                iArr1034[i2141 - 3] = i2143;
                this.AudioAttributesImplApi26Parcelizer = i2141;
                iArr1034[i2142] = 28;
                return 0;
            case 1410:
                int[] iArr1035 = this.MediaMetadataCompat;
                int i2144 = this.AudioAttributesImplApi26Parcelizer;
                iArr1035[i2144] = iArr1035[i2144 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2144 + 2;
                iArr1035[i2144 + 1] = -31;
                return 0;
            case 1411:
                int[] iArr1036 = this.MediaMetadataCompat;
                int i2145 = this.AudioAttributesImplApi26Parcelizer;
                iArr1036[i2145] = -31;
                iArr1036[i2145 - 1] = iArr1036[i2145 - 1] ^ iArr1036[i2145];
                int i2146 = i2145 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2146;
                iArr1036[i2145 - 2] = iArr1036[i2145 - 2] - iArr1036[i2146];
                return 0;
            case 1412:
                int[] iArr1037 = this.MediaMetadataCompat;
                int i2147 = this.AudioAttributesImplApi26Parcelizer;
                iArr1037[i2147 - 1] = -iArr1037[i2147 - 1];
                iArr1037[i2147] = -5;
                this.AudioAttributesImplApi26Parcelizer = i2147;
                iArr1037[i2147 - 1] = iArr1037[i2147 - 1] - iArr1037[i2147];
                return 0;
            case 1413:
                int[] iArr1038 = this.MediaMetadataCompat;
                int i2148 = this.AudioAttributesImplApi26Parcelizer;
                iArr1038[i2148] = -2047;
                iArr1038[i2148 - 1] = iArr1038[i2148 - 1] | iArr1038[i2148];
                this.AudioAttributesImplApi26Parcelizer = i2148 + 1;
                iArr1038[i2148] = 1;
                return 0;
            case 1414:
                int i2149 = this.AudioAttributesImplApi26Parcelizer;
                int i2150 = i2149 - 1;
                int[] iArr1039 = this.MediaMetadataCompat;
                iArr1039[i2149 - 2] = iArr1039[i2149 - 2] << iArr1039[i2150];
                int i2151 = iArr1039[i2149 - 2];
                iArr1039[i2149 - 2] = iArr1039[i2149 - 3];
                iArr1039[i2149 - 3] = i2151;
                this.AudioAttributesImplApi26Parcelizer = i2149;
                iArr1039[i2150] = -2047;
                return 0;
            case 1415:
                int[] iArr1040 = this.MediaMetadataCompat;
                int i2152 = this.AudioAttributesImplApi26Parcelizer;
                iArr1040[i2152] = 1024;
                this.AudioAttributesImplApi26Parcelizer = i2152;
                iArr1040[i2152 - 1] = iArr1040[i2152 - 1] / iArr1040[i2152];
                this.AudioAttributesImplApi26Parcelizer = i2152 + 1;
                iArr1040[i2152] = 1;
                return 0;
            case 1416:
                int[] iArr1041 = this.MediaMetadataCompat;
                int i2153 = this.AudioAttributesImplApi26Parcelizer;
                iArr1041[i2153] = 136;
                this.AudioAttributesImplApi26Parcelizer = i2153;
                iArr1041[i2153 - 1] = iArr1041[i2153 - 1] * iArr1041[i2153];
                return 0;
            case 1417:
                int[] iArr1042 = this.MediaMetadataCompat;
                int i2154 = this.AudioAttributesImplApi26Parcelizer;
                int i2155 = iArr1042[i2154 - 1];
                iArr1042[i2154 - 1] = iArr1042[i2154 - 2];
                iArr1042[i2154 - 2] = i2155;
                int i2156 = i2154 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2156;
                iArr1042[i2154 - 2] = iArr1042[i2154 - 2] / iArr1042[i2156];
                Object[] objArr709 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi26Parcelizer = i2154;
                objArr709[i2156] = objArr709[13];
                return 0;
            case 1418:
                int i2157 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i2157;
                Object[] objArr710 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj631 = objArr710[i2157];
                objArr710[i2157] = null;
                objArr710[44] = obj631;
                return 0;
            case 1419:
                int[] iArr1043 = this.MediaMetadataCompat;
                int i2158 = this.AudioAttributesImplApi26Parcelizer;
                iArr1043[i2158] = iArr1043[i2158 - 1];
                iArr1043[i2158 + 1] = iArr1043[i2158];
                this.AudioAttributesImplApi26Parcelizer = i2158 + 3;
                iArr1043[i2158 + 2] = 29;
                return 0;
            case 1420:
                int i2159 = this.AudioAttributesImplApi26Parcelizer;
                int i2160 = i2159 - 1;
                int[] iArr1044 = this.MediaMetadataCompat;
                iArr1044[i2159 - 2] = iArr1044[i2159 - 2] >> iArr1044[i2160];
                this.AudioAttributesImplApi26Parcelizer = i2159;
                iArr1044[i2160] = 14;
                return 0;
            case 1421:
                int[] iArr1045 = this.MediaMetadataCompat;
                int i2161 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2161 + 1;
                iArr1045[i2161] = 8;
                return 0;
            case 1422:
                int i2162 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1046 = this.MediaMetadataCompat;
                iArr1046[i2162 - 2] = iArr1046[i2162 - 1] | iArr1046[i2162 - 2];
                int i2163 = i2162 - 2;
                iArr1046[i2162 - 3] = iArr1046[i2162 - 3] + iArr1046[i2163];
                this.AudioAttributesImplApi26Parcelizer = i2162;
                iArr1046[i2162 - 1] = iArr1046[i2162 - 3];
                iArr1046[i2163] = iArr1046[i2162 - 4];
                return 0;
            case 1423:
                int[] iArr1047 = this.MediaMetadataCompat;
                int i2164 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2164 + 1;
                iArr1047[i2164] = -1023;
                return 0;
            case 1424:
                int[] iArr1048 = this.MediaMetadataCompat;
                int i2165 = this.AudioAttributesImplApi26Parcelizer;
                int i2166 = iArr1048[i2165 - 1];
                iArr1048[i2165 - 1] = iArr1048[i2165 - 2];
                iArr1048[i2165 - 2] = i2166;
                this.AudioAttributesImplApi26Parcelizer = i2165 + 1;
                iArr1048[i2165] = -1023;
                return 0;
            case 1425:
                int i2167 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1049 = this.MediaMetadataCompat;
                iArr1049[i2167 - 2] = iArr1049[i2167 - 1] ^ iArr1049[i2167 - 2];
                int i2168 = i2167 - 2;
                iArr1049[i2167 - 3] = iArr1049[i2167 - 3] - iArr1049[i2168];
                this.AudioAttributesImplApi26Parcelizer = i2167 - 1;
                iArr1049[i2168] = 512;
                return 0;
            case 1426:
                int i2169 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1050 = this.MediaMetadataCompat;
                iArr1050[i2169 - 2] = iArr1050[i2169 - 1] | iArr1050[i2169 - 2];
                iArr1050[i2169 - 3] = iArr1050[i2169 - 3] + iArr1050[i2169 - 2];
                int i2170 = i2169 - 3;
                this.AudioAttributesImplApi26Parcelizer = i2170;
                iArr1050[i2169 - 4] = iArr1050[i2169 - 4] ^ iArr1050[i2170];
                return 0;
            case 1427:
                int[] iArr1051 = this.MediaMetadataCompat;
                int i2171 = this.AudioAttributesImplApi26Parcelizer;
                iArr1051[i2171 - 1] = -iArr1051[i2171 - 1];
                this.AudioAttributesImplApi26Parcelizer = i2171 + 1;
                iArr1051[i2171] = 2;
                return 0;
            case 1428:
                int i2172 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatSearchResultReceiver[i2172 - 1] = null;
                int i2173 = i2172 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2173;
                int[] iArr1052 = this.MediaMetadataCompat;
                iArr1052[i2172 - 3] = iArr1052[i2172 - 3] ^ iArr1052[i2173];
                return 0;
            case 1429:
                int[] iArr1053 = this.MediaMetadataCompat;
                int i2174 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2174 + 1;
                iArr1053[i2174] = 213;
                return 0;
            case 1430:
                Object[] objArr711 = this.MediaBrowserCompatSearchResultReceiver;
                int i2175 = this.AudioAttributesImplApi26Parcelizer;
                objArr711[i2175] = objArr711[14];
                Object obj632 = objArr711[i2175];
                objArr711[i2175] = null;
                objArr711[54] = obj632;
                this.AudioAttributesImplApi26Parcelizer = i2175 + 1;
                objArr711[i2175] = obj632;
                return 0;
            case 1431:
                int[] iArr1054 = this.MediaMetadataCompat;
                int i2176 = this.AudioAttributesImplApi26Parcelizer;
                iArr1054[i2176] = 1;
                this.AudioAttributesImplApi26Parcelizer = i2176;
                iArr1054[i2176 - 1] = iArr1054[i2176 - 1] - iArr1054[i2176];
                int i2177 = iArr1054[i2176 - 1];
                iArr1054[i2176 - 1] = iArr1054[i2176 - 2];
                iArr1054[i2176 - 2] = i2177;
                return 0;
            case 1432:
                int i2178 = this.AudioAttributesImplApi26Parcelizer;
                int i2179 = i2178 - 1;
                int[] iArr1055 = this.MediaMetadataCompat;
                iArr1055[i2178 - 2] = iArr1055[i2178 - 2] - iArr1055[i2179];
                iArr1055[i2179] = iArr1055[i2178 - 2];
                this.AudioAttributesImplApi26Parcelizer = i2178 + 1;
                iArr1055[i2178] = iArr1055[i2178 - 1];
                return 0;
            case 1433:
                int[] iArr1056 = this.MediaMetadataCompat;
                int i2180 = this.AudioAttributesImplApi26Parcelizer;
                iArr1056[i2180] = 28;
                iArr1056[i2180 - 1] = iArr1056[i2180 - 1] >> iArr1056[i2180];
                this.AudioAttributesImplApi26Parcelizer = i2180 + 1;
                iArr1056[i2180] = iArr1056[i2180 - 1];
                return 0;
            case 1434:
                int[] iArr1057 = this.MediaMetadataCompat;
                int i2181 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2181 + 1;
                iArr1057[i2181] = -31;
                return 0;
            case 1435:
                int[] iArr1058 = this.MediaMetadataCompat;
                int i2182 = this.AudioAttributesImplApi26Parcelizer;
                int i2183 = iArr1058[i2182 - 1];
                iArr1058[i2182 - 1] = iArr1058[i2182 - 2];
                iArr1058[i2182 - 2] = i2183;
                iArr1058[i2182] = -31;
                this.AudioAttributesImplApi26Parcelizer = i2182;
                iArr1058[i2182 - 1] = iArr1058[i2182] ^ iArr1058[i2182 - 1];
                return 0;
            case 1436:
                int i2184 = this.AudioAttributesImplApi26Parcelizer;
                int i2185 = i2184 - 1;
                int[] iArr1059 = this.MediaMetadataCompat;
                iArr1059[i2184 - 2] = iArr1059[i2184 - 2] - iArr1059[i2185];
                iArr1059[i2185] = 16;
                int i2186 = i2184 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2186;
                iArr1059[i2184 - 2] = iArr1059[i2184 - 2] / iArr1059[i2186];
                return 0;
            case 1437:
                int i2187 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1060 = this.MediaMetadataCompat;
                iArr1060[i2187 - 2] = iArr1060[i2187 - 2] << iArr1060[i2187 - 1];
                int i2188 = i2187 - 2;
                iArr1060[i2187 - 3] = iArr1060[i2187 - 3] + iArr1060[i2188];
                this.AudioAttributesImplApi26Parcelizer = i2187;
                iArr1060[i2187 - 1] = iArr1060[i2187 - 3];
                iArr1060[i2188] = iArr1060[i2187 - 4];
                return 0;
            case 1438:
                int i2189 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr1061 = this.MediaMetadataCompat;
                iArr1061[i2189 - 2] = iArr1061[i2189 - 2] << iArr1061[i2189 - 1];
                int i2190 = i2189 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2190;
                iArr1061[i2189 - 3] = iArr1061[i2189 - 3] + iArr1061[i2190];
                int i2191 = iArr1061[i2189 - 3];
                iArr1061[i2189 - 3] = iArr1061[i2189 - 4];
                iArr1061[i2189 - 4] = i2191;
                return 0;
            case 1439:
                int i2192 = this.AudioAttributesImplApi26Parcelizer;
                int i2193 = i2192 - 1;
                int[] iArr1062 = this.MediaMetadataCompat;
                iArr1062[i2192 - 2] = iArr1062[i2192 - 2] + iArr1062[i2193];
                iArr1062[i2193] = iArr1062[i2192 - 2];
                this.AudioAttributesImplApi26Parcelizer = i2192 + 1;
                iArr1062[i2192] = 18;
                return 0;
            case 1440:
                int[] iArr1063 = this.MediaMetadataCompat;
                int i2194 = this.AudioAttributesImplApi26Parcelizer;
                iArr1063[i2194] = -32767;
                iArr1063[i2194 - 1] = iArr1063[i2194 - 1] | iArr1063[i2194];
                this.AudioAttributesImplApi26Parcelizer = i2194 + 1;
                iArr1063[i2194] = 1;
                return 0;
            case 1441:
                int i2195 = this.AudioAttributesImplApi26Parcelizer;
                int i2196 = i2195 - 1;
                int[] iArr1064 = this.MediaMetadataCompat;
                iArr1064[i2195 - 2] = iArr1064[i2195 - 2] << iArr1064[i2196];
                int i2197 = iArr1064[i2195 - 2];
                iArr1064[i2195 - 2] = iArr1064[i2195 - 3];
                iArr1064[i2195 - 3] = i2197;
                this.AudioAttributesImplApi26Parcelizer = i2195;
                iArr1064[i2196] = -32767;
                return 0;
            case 1442:
                int[] iArr1065 = this.MediaMetadataCompat;
                int i2198 = this.AudioAttributesImplApi26Parcelizer;
                iArr1065[i2198] = 16384;
                this.AudioAttributesImplApi26Parcelizer = i2198;
                iArr1065[i2198 - 1] = iArr1065[i2198 - 1] / iArr1065[i2198];
                return 0;
            case 1443:
                int[] iArr1066 = this.MediaMetadataCompat;
                int i2199 = this.AudioAttributesImplApi26Parcelizer;
                int i2200 = iArr1066[i2199 - 1];
                iArr1066[i2199] = i2200;
                iArr1066[i2199 - 1] = iArr1066[i2199 - 2];
                iArr1066[i2199 - 2] = iArr1066[i2199 - 3];
                iArr1066[i2199 - 3] = i2200;
                this.MediaBrowserCompatSearchResultReceiver[i2199] = null;
                int i2201 = i2199 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2201;
                iArr1066[i2199 - 2] = iArr1066[i2199 - 2] & iArr1066[i2201];
                return 0;
            case 1444:
                int i2202 = this.AudioAttributesImplApi26Parcelizer;
                int i2203 = i2202 - 1;
                int[] iArr1067 = this.MediaMetadataCompat;
                iArr1067[i2202 - 2] = iArr1067[i2202 - 2] & iArr1067[i2203];
                this.AudioAttributesImplApi26Parcelizer = i2202;
                iArr1067[i2203] = 1608;
                return 0;
            case 1445:
                int i2204 = this.AudioAttributesImplApi26Parcelizer;
                int i2205 = i2204 - 1;
                this.AudioAttributesImplApi26Parcelizer = i2205;
                int[] iArr1068 = this.MediaMetadataCompat;
                iArr1068[i2204 - 2] = iArr1068[i2204 - 2] / iArr1068[i2205];
                int i2206 = i2204 - 2;
                this.AudioAttributesImplApi26Parcelizer = i2206;
                iArr1068[i2204 - 3] = iArr1068[i2204 - 3] + iArr1068[i2206];
                this.RatingCompat[i2204 - 3] = iArr1068[i2204 - 3];
                return 0;
            case 1446:
                int[] iArr1069 = this.MediaMetadataCompat;
                int i2207 = this.AudioAttributesImplApi26Parcelizer;
                iArr1069[i2207] = 11;
                this.AudioAttributesImplApi26Parcelizer = i2207;
                iArr1069[i2207 - 1] = iArr1069[i2207 - 1] + iArr1069[i2207];
                return 0;
            case 1447:
                int[] iArr1070 = this.MediaMetadataCompat;
                int i2208 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2208 + 1;
                iArr1070[i2208] = 113;
                return 0;
            case 1448:
                int[] iArr1071 = this.MediaMetadataCompat;
                int i2209 = this.AudioAttributesImplApi26Parcelizer;
                iArr1071[i2209] = 41;
                iArr1071[i2209 - 1] = iArr1071[i2209 - 1] + iArr1071[i2209];
                this.AudioAttributesImplApi26Parcelizer = i2209 + 1;
                iArr1071[i2209] = iArr1071[i2209 - 1];
                return 0;
            case 1449:
                int[] iArr1072 = this.MediaMetadataCompat;
                int i2210 = this.AudioAttributesImplApi26Parcelizer;
                iArr1072[i2210] = 63;
                iArr1072[i2210 - 1] = iArr1072[i2210 - 1] + iArr1072[i2210];
                this.AudioAttributesImplApi26Parcelizer = i2210 + 1;
                iArr1072[i2210] = iArr1072[i2210 - 1];
                return 0;
            case 1450:
                int[] iArr1073 = this.MediaMetadataCompat;
                int i2211 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2211 + 1;
                iArr1073[i2211] = 91;
                return 0;
            case 1451:
                int[] iArr1074 = this.MediaMetadataCompat;
                int i2212 = this.AudioAttributesImplApi26Parcelizer;
                iArr1074[i2212] = 77;
                this.AudioAttributesImplApi26Parcelizer = i2212;
                iArr1074[i2212 - 1] = iArr1074[i2212 - 1] + iArr1074[i2212];
                return 0;
            case 1452:
                int[] iArr1075 = this.MediaMetadataCompat;
                int i2213 = this.AudioAttributesImplApi26Parcelizer;
                iArr1075[i2213] = 103;
                iArr1075[i2213 - 1] = iArr1075[i2213 - 1] + iArr1075[i2213];
                this.AudioAttributesImplApi26Parcelizer = i2213 + 1;
                iArr1075[i2213] = iArr1075[i2213 - 1];
                return 0;
            case 1453:
                int[] iArr1076 = this.MediaMetadataCompat;
                int i2214 = this.AudioAttributesImplApi26Parcelizer;
                iArr1076[i2214] = 4;
                this.AudioAttributesImplApi26Parcelizer = i2214 + 2;
                iArr1076[i2214 + 1] = 2;
                return 0;
            case 1454:
                int[] iArr1077 = this.MediaMetadataCompat;
                int i2215 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2215 + 1;
                iArr1077[i2215] = 69;
                return 0;
            case 1455:
                int[] iArr1078 = this.MediaMetadataCompat;
                int i2216 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2216 + 1;
                iArr1078[i2216] = 95;
                return 0;
            case 1456:
                int[] iArr1079 = this.MediaMetadataCompat;
                int i2217 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2217 + 1;
                iArr1079[i2217] = 6;
                return 0;
            case 1457:
                int[] iArr1080 = this.MediaMetadataCompat;
                int i2218 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2218 + 1;
                iArr1080[i2218] = 10;
                return 0;
            default:
                return i;
        }
    }

    public setTargetVoice(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaMetadataCompat = new int[TarConstants.PREFIXLEN_XSTAR];
        this.RatingCompat = new long[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatMediaItem = new float[TarConstants.PREFIXLEN_XSTAR];
        this.MediaDescriptionCompat = new double[TarConstants.PREFIXLEN_XSTAR];
        Object[] objArr = new Object[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        objArr[14] = obj4;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public setTargetVoice(Object obj, Object obj2) {
        this.MediaMetadataCompat = new int[TarConstants.PREFIXLEN_XSTAR];
        this.RatingCompat = new long[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatMediaItem = new float[TarConstants.PREFIXLEN_XSTAR];
        this.MediaDescriptionCompat = new double[TarConstants.PREFIXLEN_XSTAR];
        Object[] objArr = new Object[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public setTargetVoice(Object obj, Object obj2, Object obj3) {
        this.MediaMetadataCompat = new int[TarConstants.PREFIXLEN_XSTAR];
        this.RatingCompat = new long[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatMediaItem = new float[TarConstants.PREFIXLEN_XSTAR];
        this.MediaDescriptionCompat = new double[TarConstants.PREFIXLEN_XSTAR];
        Object[] objArr = new Object[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public setTargetVoice(Object obj, int i, int i2, Object obj2) {
        int[] iArr = new int[TarConstants.PREFIXLEN_XSTAR];
        this.MediaMetadataCompat = iArr;
        this.RatingCompat = new long[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatMediaItem = new float[TarConstants.PREFIXLEN_XSTAR];
        this.MediaDescriptionCompat = new double[TarConstants.PREFIXLEN_XSTAR];
        Object[] objArr = new Object[TarConstants.PREFIXLEN_XSTAR];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        iArr[13] = i2;
        objArr[14] = obj2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }
}
