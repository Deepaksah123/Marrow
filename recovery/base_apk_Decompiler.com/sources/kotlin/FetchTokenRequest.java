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

/* JADX INFO: loaded from: classes5.dex */
public class FetchTokenRequest {
    public long AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    public Object AudioAttributesImplBaseParcelizer;
    public float IconCompatParcelizer;
    public float MediaBrowserCompatCustomActionResultReceiver;
    public double MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final long[] MediaBrowserCompatSearchResultReceiver;
    private final double[] MediaDescriptionCompat;
    private final int[] MediaMetadataCompat;
    private final float[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    private final Object[] onCustomAction;
    public int read;
    public long write;

    public FetchTokenRequest(Object obj) {
        this.MediaMetadataCompat = new int[84];
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.onCustomAction;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                objArr[i2] = objArr[8];
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplApi21Parcelizer - this.read;
                this.AudioAttributesImplApi21Parcelizer = i3;
                this.MediaBrowserCompatMediaItem = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.onCustomAction;
                int i4 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.AudioAttributesImplBaseParcelizer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.onCustomAction;
                int i5 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i5 + 1;
                objArr3[i5] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 5:
                int[] iArr = this.MediaMetadataCompat;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                iArr[i6] = 2;
                return 0;
            case 6:
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplApi21Parcelizer = i8;
                int[] iArr2 = this.MediaMetadataCompat;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.AudioAttributesImplApi21Parcelizer = i9;
                this.onCustomAction[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.onCustomAction;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.AudioAttributesImplBaseParcelizer = obj2;
            case 7:
                return 0;
            case 9:
                int[] iArr3 = this.MediaMetadataCompat;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                iArr3[i11] = this.read;
                return 0;
            case 10:
                int[] iArr4 = this.MediaMetadataCompat;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                iArr4[i12] = 73;
                return 0;
            case 11:
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = i13 - 1;
                int[] iArr5 = this.MediaMetadataCompat;
                iArr5[i13 - 2] = iArr5[i13 - 2] + iArr5[i14];
                iArr5[i14] = iArr5[i13 - 2];
                this.AudioAttributesImplApi21Parcelizer = i13 + 1;
                iArr5[i13] = 128;
                return 0;
            case 12:
                int[] iArr6 = this.MediaMetadataCompat;
                int i15 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i15 + 1;
                this.RemoteActionCompatParcelizer = iArr6[i15];
                return 0;
            case 13:
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                int i17 = i16 - 1;
                this.AudioAttributesImplApi21Parcelizer = i17;
                int[] iArr7 = this.MediaMetadataCompat;
                iArr7[i16 - 2] = iArr7[i16 - 2] % iArr7[i17];
                return 0;
            case 14:
                int[] iArr8 = this.MediaMetadataCompat;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                iArr8[i18] = 2;
                this.AudioAttributesImplApi21Parcelizer = i18;
                iArr8[i18 - 1] = iArr8[i18 - 1] % iArr8[i18];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i19;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i19] == 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr9 = this.MediaMetadataCompat;
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i20 + 1;
                iArr9[i20] = 23;
                return 0;
            case 17:
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = i21 - 1;
                this.AudioAttributesImplApi21Parcelizer = i22;
                int[] iArr10 = this.MediaMetadataCompat;
                iArr10[i21 - 2] = iArr10[i21 - 2] + iArr10[i22];
                return 0;
            case 18:
                int[] iArr11 = this.MediaMetadataCompat;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                iArr11[i23] = iArr11[i23 - 1];
                return 0;
            case 19:
                int[] iArr12 = this.MediaMetadataCompat;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                iArr12[i24] = 128;
                this.AudioAttributesImplApi21Parcelizer = i24;
                iArr12[i24 - 1] = iArr12[i24 - 1] % iArr12[i24];
                return 0;
            case 20:
                int i25 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i25;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i25] != 0 ? 0 : 1;
                return 0;
            case 21:
                for (int i26 = this.AudioAttributesImplApi21Parcelizer - 1; i26 >= 0; i26--) {
                    this.onCustomAction[i26] = null;
                }
                Object[] objArr5 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr5[0] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 22:
                Object[] objArr6 = this.onCustomAction;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                objArr6[i27] = objArr6[8];
                this.AudioAttributesImplApi21Parcelizer = i27 + 2;
                objArr6[i27 + 1] = objArr6[9];
                return 0;
            case 23:
                int i28 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i28;
                this.onCustomAction[i28] = null;
                return 0;
            case 24:
                int[] iArr13 = this.MediaMetadataCompat;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i29] = 125;
                iArr13[i29 - 1] = iArr13[i29 - 1] + iArr13[i29];
                this.AudioAttributesImplApi21Parcelizer = i29 + 1;
                iArr13[i29] = iArr13[i29 - 1];
                return 0;
            case 25:
                int[] iArr14 = this.MediaMetadataCompat;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i30 + 1;
                iArr14[i30] = 128;
                return 0;
            case 26:
                int[] iArr15 = this.MediaMetadataCompat;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i31 + 1;
                iArr15[i31] = 53;
                return 0;
            case 27:
                int[] iArr16 = this.MediaMetadataCompat;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[i32] = 2;
                this.AudioAttributesImplApi21Parcelizer = i32 + 2;
                iArr16[i32 + 1] = 2;
                return 0;
            case 28:
                int[] iArr17 = this.MediaMetadataCompat;
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i33 + 1;
                iArr17[i33] = 27;
                return 0;
            case 29:
                int[] iArr18 = this.MediaMetadataCompat;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i34 + 1;
                iArr18[i34] = 43;
                return 0;
            case 30:
                int[] iArr19 = this.MediaMetadataCompat;
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i35] = iArr19[i35 - 1];
                iArr19[i35 + 1] = 128;
                int i36 = i35 + 1;
                this.AudioAttributesImplApi21Parcelizer = i36;
                iArr19[i35] = iArr19[i35] % iArr19[i36];
                return 0;
            case 31:
                int[] iArr20 = this.MediaMetadataCompat;
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i37] = 2;
                this.AudioAttributesImplApi21Parcelizer = i37;
                iArr20[i37 - 1] = iArr20[i37 - 1] % iArr20[i37];
                int i38 = i37 - 1;
                this.AudioAttributesImplApi21Parcelizer = i38;
                this.onCustomAction[i38] = null;
                return 0;
            case 32:
                int[] iArr21 = this.MediaMetadataCompat;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i39 + 1;
                iArr21[i39] = 75;
                return 0;
            case 33:
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = i40 - 1;
                int[] iArr22 = this.MediaMetadataCompat;
                iArr22[i40 - 2] = iArr22[i40 - 2] + iArr22[i41];
                this.AudioAttributesImplApi21Parcelizer = i40;
                iArr22[i41] = iArr22[i40 - 2];
                return 0;
            case 34:
                int[] iArr23 = this.MediaMetadataCompat;
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i42] = 15;
                this.AudioAttributesImplApi21Parcelizer = i42;
                iArr23[i42 - 1] = iArr23[i42 - 1] + iArr23[i42];
                return 0;
            case 35:
                Object[] objArr7 = this.onCustomAction;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i43 + 1;
                objArr7[i43] = objArr7[9];
                return 0;
            case 36:
                int[] iArr24 = this.MediaMetadataCompat;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                iArr24[i44] = 4;
                this.AudioAttributesImplApi21Parcelizer = i44 + 2;
                iArr24[i44 + 1] = 0;
                return 0;
            case 37:
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = i45 - 1;
                this.AudioAttributesImplApi21Parcelizer = i46;
                int[] iArr25 = this.MediaMetadataCompat;
                iArr25[i45 - 2] = iArr25[i45 - 2] / iArr25[i46];
                int i47 = i45 - 2;
                this.AudioAttributesImplApi21Parcelizer = i47;
                this.onCustomAction[i47] = null;
                return 0;
            case 38:
                int[] iArr26 = this.MediaMetadataCompat;
                int i48 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i48;
                this.RemoteActionCompatParcelizer = iArr26[i48];
                return 0;
            case 39:
                int[] iArr27 = this.MediaMetadataCompat;
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i49 + 1;
                iArr27[i49] = 1;
                return 0;
            case 40:
                int[] iArr28 = this.MediaMetadataCompat;
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i50 + 1;
                iArr28[i50] = 0;
                return 0;
            case 41:
                Object[] objArr8 = this.onCustomAction;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                objArr8[i51] = null;
                return 0;
            case 42:
                int[] iArr29 = this.MediaMetadataCompat;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                iArr29[i52] = 87;
                return 0;
            case 43:
                int[] iArr30 = this.MediaMetadataCompat;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                iArr30[i53] = 113;
                this.AudioAttributesImplApi21Parcelizer = i53;
                iArr30[i53 - 1] = iArr30[i53 - 1] + iArr30[i53];
                return 0;
            case 44:
                Object[] objArr9 = this.onCustomAction;
                int i54 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i54 + 1;
                objArr9[i54] = null;
                int[] iArr31 = this.MediaMetadataCompat;
                Object obj3 = objArr9[i54];
                objArr9[i54] = null;
                iArr31[i54] = ((int[]) obj3).length;
                this.AudioAttributesImplApi21Parcelizer = i54;
                objArr9[i54] = null;
                return 0;
            case 45:
                int[] iArr32 = this.MediaMetadataCompat;
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i55 + 1;
                iArr32[i55] = 115;
                return 0;
            case 46:
                int[] iArr33 = this.MediaMetadataCompat;
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                iArr33[i56] = 95;
                iArr33[i56 - 1] = iArr33[i56 - 1] + iArr33[i56];
                this.AudioAttributesImplApi21Parcelizer = i56 + 1;
                iArr33[i56] = iArr33[i56 - 1];
                return 0;
            case 47:
                Object[] objArr10 = this.onCustomAction;
                int i57 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i57 + 1;
                objArr10[i57] = null;
                int[] iArr34 = this.MediaMetadataCompat;
                Object obj4 = objArr10[i57];
                objArr10[i57] = null;
                iArr34[i57] = ((int[]) obj4).length;
                return 0;
            case 48:
                int[] iArr35 = this.MediaMetadataCompat;
                int i58 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i58 + 1;
                iArr35[i58] = 2;
                return 0;
            case 49:
                int[] iArr36 = this.MediaMetadataCompat;
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i59 + 1;
                iArr36[i59] = 25;
                return 0;
            case 50:
                int[] iArr37 = this.MediaMetadataCompat;
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i60 + 1;
                iArr37[i60] = 85;
                return 0;
            case 51:
                int[] iArr38 = this.MediaMetadataCompat;
                int i61 = this.AudioAttributesImplApi21Parcelizer;
                iArr38[i61] = 99;
                this.AudioAttributesImplApi21Parcelizer = i61;
                iArr38[i61 - 1] = iArr38[i61 - 1] + iArr38[i61];
                return 0;
            case 52:
                int[] iArr39 = this.MediaMetadataCompat;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                iArr39[i62] = 2;
                iArr39[i62 + 1] = 2;
                int i63 = i62 + 1;
                this.AudioAttributesImplApi21Parcelizer = i63;
                iArr39[i62] = iArr39[i62] % iArr39[i63];
                return 0;
            case 53:
                int[] iArr40 = this.MediaMetadataCompat;
                int i64 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i64 + 1;
                iArr40[i64] = 51;
                return 0;
            case 54:
                int[] iArr41 = this.MediaMetadataCompat;
                int i65 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i65 + 1;
                iArr41[i65] = 28;
                return 0;
            case 55:
                int[] iArr42 = this.MediaMetadataCompat;
                int i66 = this.AudioAttributesImplApi21Parcelizer;
                iArr42[i66] = 0;
                this.AudioAttributesImplApi21Parcelizer = i66;
                iArr42[i66 - 1] = iArr42[i66 - 1] / iArr42[i66];
                return 0;
            case 56:
                Object[] objArr11 = this.onCustomAction;
                int i67 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i67 + 1;
                objArr11[i67] = objArr11[10];
                return 0;
            case 57:
                int[] iArr43 = this.MediaMetadataCompat;
                int i68 = this.AudioAttributesImplApi21Parcelizer;
                iArr43[i68] = 29;
                this.AudioAttributesImplApi21Parcelizer = i68;
                iArr43[i68 - 1] = iArr43[i68 - 1] + iArr43[i68];
                return 0;
            case 58:
                int[] iArr44 = this.MediaMetadataCompat;
                int i69 = this.AudioAttributesImplApi21Parcelizer;
                iArr44[i69] = 45;
                iArr44[i69 - 1] = iArr44[i69 - 1] + iArr44[i69];
                this.AudioAttributesImplApi21Parcelizer = i69 + 1;
                iArr44[i69] = iArr44[i69 - 1];
                return 0;
            case 59:
                int[] iArr45 = this.MediaMetadataCompat;
                int i70 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i70 + 1;
                iArr45[i70] = 10;
                return 0;
            case 60:
                int[] iArr46 = this.MediaMetadataCompat;
                int i71 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i71 + 1;
                iArr46[i71] = 5;
                return 0;
            case 61:
                Object[] objArr12 = this.onCustomAction;
                int i72 = this.AudioAttributesImplApi21Parcelizer;
                objArr12[i72] = objArr12[9];
                this.AudioAttributesImplApi21Parcelizer = i72 + 2;
                objArr12[i72 + 1] = objArr12[10];
                return 0;
            case 62:
                int[] iArr47 = this.MediaMetadataCompat;
                int i73 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i73 + 1;
                iArr47[i73] = 103;
                return 0;
            case 63:
                int[] iArr48 = this.MediaMetadataCompat;
                int i74 = this.AudioAttributesImplApi21Parcelizer;
                iArr48[i74] = iArr48[i74 - 1];
                this.AudioAttributesImplApi21Parcelizer = i74 + 2;
                iArr48[i74 + 1] = 128;
                return 0;
            case 64:
                int[] iArr49 = this.MediaMetadataCompat;
                int i75 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i75 + 1;
                iArr49[i75] = 45;
                return 0;
            case 65:
                int[] iArr50 = this.MediaMetadataCompat;
                int i76 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i76 + 1;
                iArr50[i76] = 42;
                return 0;
            case 66:
                int[] iArr51 = this.MediaMetadataCompat;
                int i77 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i77 + 1;
                iArr51[i77] = 39;
                return 0;
            case 67:
                int[] iArr52 = this.MediaMetadataCompat;
                int i78 = this.AudioAttributesImplApi21Parcelizer;
                iArr52[i78] = 81;
                iArr52[i78 - 1] = iArr52[i78 - 1] + iArr52[i78];
                this.AudioAttributesImplApi21Parcelizer = i78 + 1;
                iArr52[i78] = iArr52[i78 - 1];
                return 0;
            case 68:
                int[] iArr53 = this.MediaMetadataCompat;
                int i79 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i79 + 1;
                iArr53[i79] = 20;
                return 0;
            case 69:
                int[] iArr54 = this.MediaMetadataCompat;
                int i80 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i80 + 1;
                iArr54[i80] = 77;
                return 0;
            case 70:
                int[] iArr55 = this.MediaMetadataCompat;
                int i81 = this.AudioAttributesImplApi21Parcelizer;
                iArr55[i81] = 9;
                iArr55[i81 - 1] = iArr55[i81 - 1] + iArr55[i81];
                this.AudioAttributesImplApi21Parcelizer = i81 + 1;
                iArr55[i81] = iArr55[i81 - 1];
                return 0;
            case 71:
                int[] iArr56 = this.MediaMetadataCompat;
                int i82 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i82 + 1;
                iArr56[i82] = 98;
                return 0;
            case 72:
                int[] iArr57 = this.MediaMetadataCompat;
                int i83 = this.AudioAttributesImplApi21Parcelizer;
                iArr57[i83] = 0;
                this.AudioAttributesImplApi21Parcelizer = i83;
                iArr57[i83 - 1] = iArr57[i83 - 1] / iArr57[i83];
                int i84 = i83 - 1;
                this.AudioAttributesImplApi21Parcelizer = i84;
                this.onCustomAction[i84] = null;
                return 0;
            case 73:
                int[] iArr58 = this.MediaMetadataCompat;
                int i85 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i85 + 1;
                iArr58[i85] = 62;
                return 0;
            case 74:
                int[] iArr59 = this.MediaMetadataCompat;
                int i86 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i86 + 1;
                iArr59[i86] = 0;
                return 0;
            case 75:
                int[] iArr60 = this.MediaMetadataCompat;
                int i87 = this.AudioAttributesImplApi21Parcelizer;
                iArr60[i87] = 33;
                iArr60[i87 - 1] = iArr60[i87 - 1] + iArr60[i87];
                this.AudioAttributesImplApi21Parcelizer = i87 + 1;
                iArr60[i87] = iArr60[i87 - 1];
                return 0;
            case 76:
                int[] iArr61 = this.MediaMetadataCompat;
                int i88 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i88 + 1;
                iArr61[i88] = 95;
                return 0;
            case 77:
                int[] iArr62 = this.MediaMetadataCompat;
                int i89 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i89 + 1;
                iArr62[i89] = 109;
                return 0;
            case 78:
                int[] iArr63 = this.MediaMetadataCompat;
                int i90 = this.AudioAttributesImplApi21Parcelizer;
                iArr63[i90] = 91;
                iArr63[i90 - 1] = iArr63[i90 - 1] + iArr63[i90];
                this.AudioAttributesImplApi21Parcelizer = i90 + 1;
                iArr63[i90] = iArr63[i90 - 1];
                return 0;
            case 79:
                Object[] objArr13 = this.onCustomAction;
                int i91 = this.AudioAttributesImplApi21Parcelizer;
                objArr13[i91] = objArr13[8];
                objArr13[i91 + 1] = objArr13[9];
                this.AudioAttributesImplApi21Parcelizer = i91 + 3;
                objArr13[i91 + 2] = objArr13[10];
                return 0;
            case 80:
                int[] iArr64 = this.MediaMetadataCompat;
                int i92 = this.AudioAttributesImplApi21Parcelizer;
                iArr64[i92] = 45;
                this.AudioAttributesImplApi21Parcelizer = i92;
                iArr64[i92 - 1] = iArr64[i92 - 1] + iArr64[i92];
                return 0;
            case 81:
                int[] iArr65 = this.MediaMetadataCompat;
                int i93 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i93 + 1;
                iArr65[i93] = 117;
                return 0;
            case 82:
                int[] iArr66 = this.MediaMetadataCompat;
                int i94 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i94 + 1;
                iArr66[i94] = 123;
                return 0;
            case 83:
                int[] iArr67 = this.MediaMetadataCompat;
                int i95 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i95 + 1;
                iArr67[i95] = 92;
                return 0;
            case 84:
                int i96 = this.AudioAttributesImplApi21Parcelizer;
                int i97 = i96 - 1;
                this.AudioAttributesImplApi21Parcelizer = i97;
                int[] iArr68 = this.MediaMetadataCompat;
                iArr68[i96 - 2] = iArr68[i96 - 2] / iArr68[i97];
                return 0;
            case 85:
                int[] iArr69 = this.MediaMetadataCompat;
                int i98 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i98 + 1;
                iArr69[i98] = 30;
                return 0;
            case 86:
                int[] iArr70 = this.MediaMetadataCompat;
                int i99 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i99 + 1;
                iArr70[i99] = 86;
                return 0;
            case 87:
                int[] iArr71 = this.MediaMetadataCompat;
                int i100 = this.AudioAttributesImplApi21Parcelizer;
                iArr71[i100] = 61;
                this.AudioAttributesImplApi21Parcelizer = i100;
                iArr71[i100 - 1] = iArr71[i100 - 1] + iArr71[i100];
                return 0;
            case 88:
                int[] iArr72 = this.MediaMetadataCompat;
                int i101 = this.AudioAttributesImplApi21Parcelizer;
                iArr72[i101] = 23;
                this.AudioAttributesImplApi21Parcelizer = i101;
                iArr72[i101 - 1] = iArr72[i101 - 1] + iArr72[i101];
                return 0;
            case 89:
                int[] iArr73 = this.MediaMetadataCompat;
                int i102 = this.AudioAttributesImplApi21Parcelizer;
                iArr73[i102] = 86;
                iArr73[i102 + 1] = 0;
                int i103 = i102 + 1;
                this.AudioAttributesImplApi21Parcelizer = i103;
                iArr73[i102] = iArr73[i102] / iArr73[i103];
                return 0;
            case 90:
                int[] iArr74 = this.MediaMetadataCompat;
                int i104 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i104 + 1;
                iArr74[i104] = 64;
                return 0;
            case 91:
                int[] iArr75 = this.MediaMetadataCompat;
                int i105 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i105 + 1;
                iArr75[i105] = 82;
                return 0;
            case 92:
                int[] iArr76 = this.MediaMetadataCompat;
                int i106 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i106 + 1;
                iArr76[i106] = 3;
                return 0;
            case 93:
                int[] iArr77 = this.MediaMetadataCompat;
                int i107 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i107 + 1;
                iArr77[i107] = 89;
                return 0;
            case 94:
                int[] iArr78 = this.MediaMetadataCompat;
                int i108 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i108 + 1;
                iArr78[i108] = 15;
                return 0;
            case 95:
                int[] iArr79 = this.MediaMetadataCompat;
                int i109 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i109 + 1;
                iArr79[i109] = 4;
                return 0;
            case 96:
                int[] iArr80 = this.MediaMetadataCompat;
                int i110 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i110 + 1;
                iArr80[i110] = 46;
                return 0;
            case 97:
                int[] iArr81 = this.MediaMetadataCompat;
                int i111 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i111 + 1;
                iArr81[i111] = 57;
                return 0;
            case 98:
                int[] iArr82 = this.MediaMetadataCompat;
                int i112 = this.AudioAttributesImplApi21Parcelizer;
                iArr82[i112] = 121;
                this.AudioAttributesImplApi21Parcelizer = i112;
                iArr82[i112 - 1] = iArr82[i112 - 1] + iArr82[i112];
                return 0;
            case 99:
                int[] iArr83 = this.MediaMetadataCompat;
                int i113 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i113 + 1;
                iArr83[i113] = 61;
                return 0;
            case 100:
                int[] iArr84 = this.MediaMetadataCompat;
                int i114 = this.AudioAttributesImplApi21Parcelizer;
                iArr84[i114] = 85;
                iArr84[i114 - 1] = iArr84[i114 - 1] + iArr84[i114];
                this.AudioAttributesImplApi21Parcelizer = i114 + 1;
                iArr84[i114] = iArr84[i114 - 1];
                return 0;
            case 101:
                int[] iArr85 = this.MediaMetadataCompat;
                int i115 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr14 = this.onCustomAction;
                Object obj5 = objArr14[i115 - 1];
                objArr14[i115 - 1] = null;
                iArr85[i115 - 1] = ((int[]) obj5).length;
                return 0;
            case 102:
                int[] iArr86 = this.MediaMetadataCompat;
                int i116 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i116 + 1;
                iArr86[i116] = 59;
                return 0;
            case 103:
                int[] iArr87 = this.MediaMetadataCompat;
                int i117 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i117 + 1;
                iArr87[i117] = 9;
                return 0;
            case 104:
                int[] iArr88 = this.MediaMetadataCompat;
                int i118 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i118 + 1;
                iArr88[i118] = iArr88[9];
                return 0;
            case 105:
                int[] iArr89 = this.MediaMetadataCompat;
                int i119 = this.AudioAttributesImplApi21Parcelizer;
                iArr89[i119] = 5;
                iArr89[i119 - 1] = iArr89[i119 - 1] + iArr89[i119];
                this.AudioAttributesImplApi21Parcelizer = i119 + 1;
                iArr89[i119] = iArr89[i119 - 1];
                return 0;
            case 106:
                int[] iArr90 = this.MediaMetadataCompat;
                int i120 = this.AudioAttributesImplApi21Parcelizer;
                iArr90[i120] = 119;
                this.AudioAttributesImplApi21Parcelizer = i120;
                iArr90[i120 - 1] = iArr90[i120 - 1] + iArr90[i120];
                return 0;
            case 107:
                int[] iArr91 = this.MediaMetadataCompat;
                int i121 = this.AudioAttributesImplApi21Parcelizer;
                iArr91[i121] = 117;
                this.AudioAttributesImplApi21Parcelizer = i121;
                iArr91[i121 - 1] = iArr91[i121 - 1] + iArr91[i121];
                return 0;
            case 108:
                int[] iArr92 = this.MediaMetadataCompat;
                int i122 = this.AudioAttributesImplApi21Parcelizer;
                iArr92[i122] = 69;
                iArr92[i122 - 1] = iArr92[i122 - 1] + iArr92[i122];
                this.AudioAttributesImplApi21Parcelizer = i122 + 1;
                iArr92[i122] = iArr92[i122 - 1];
                return 0;
            case 109:
                int[] iArr93 = this.MediaMetadataCompat;
                int i123 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i123 + 1;
                iArr93[i123] = 49;
                return 0;
            case 110:
                int[] iArr94 = this.MediaMetadataCompat;
                int i124 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i124 + 1;
                iArr94[i124] = 38;
                return 0;
            case 111:
                int[] iArr95 = this.MediaMetadataCompat;
                int i125 = this.AudioAttributesImplApi21Parcelizer;
                iArr95[i125] = 65;
                this.AudioAttributesImplApi21Parcelizer = i125;
                iArr95[i125 - 1] = iArr95[i125 - 1] + iArr95[i125];
                return 0;
            case 112:
                int[] iArr96 = this.MediaMetadataCompat;
                int i126 = this.AudioAttributesImplApi21Parcelizer;
                iArr96[i126] = 37;
                this.AudioAttributesImplApi21Parcelizer = i126;
                iArr96[i126 - 1] = iArr96[i126 - 1] + iArr96[i126];
                return 0;
            case 113:
                int[] iArr97 = this.MediaMetadataCompat;
                int i127 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i127 + 1;
                iArr97[i127] = 97;
                return 0;
            case 114:
                int[] iArr98 = this.MediaMetadataCompat;
                int i128 = this.AudioAttributesImplApi21Parcelizer;
                iArr98[i128] = 79;
                iArr98[i128 - 1] = iArr98[i128 - 1] + iArr98[i128];
                this.AudioAttributesImplApi21Parcelizer = i128 + 1;
                iArr98[i128] = iArr98[i128 - 1];
                return 0;
            case 115:
                int[] iArr99 = this.MediaMetadataCompat;
                int i129 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i129 + 1;
                iArr99[i129] = 58;
                return 0;
            case 116:
                int[] iArr100 = this.MediaMetadataCompat;
                int i130 = this.AudioAttributesImplApi21Parcelizer;
                iArr100[i130] = 37;
                iArr100[i130 - 1] = iArr100[i130 - 1] + iArr100[i130];
                this.AudioAttributesImplApi21Parcelizer = i130 + 1;
                iArr100[i130] = iArr100[i130 - 1];
                return 0;
            case 117:
                int[] iArr101 = this.MediaMetadataCompat;
                int i131 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i131 + 1;
                iArr101[i131] = 44;
                return 0;
            case 118:
                int[] iArr102 = this.MediaMetadataCompat;
                int i132 = this.AudioAttributesImplApi21Parcelizer;
                iArr102[i132] = 43;
                iArr102[i132 - 1] = iArr102[i132 - 1] + iArr102[i132];
                this.AudioAttributesImplApi21Parcelizer = i132 + 1;
                iArr102[i132] = iArr102[i132 - 1];
                return 0;
            case 119:
                int[] iArr103 = this.MediaMetadataCompat;
                int i133 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i133 + 1;
                iArr103[i133] = 74;
                return 0;
            case 120:
                int[] iArr104 = this.MediaMetadataCompat;
                int i134 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i134 + 1;
                iArr104[i134] = 83;
                return 0;
            case 121:
                int[] iArr105 = this.MediaMetadataCompat;
                int i135 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i135 + 1;
                iArr105[i135] = 70;
                return 0;
            case 122:
                int[] iArr106 = this.MediaMetadataCompat;
                int i136 = this.AudioAttributesImplApi21Parcelizer;
                iArr106[i136] = 59;
                iArr106[i136 - 1] = iArr106[i136 - 1] + iArr106[i136];
                this.AudioAttributesImplApi21Parcelizer = i136 + 1;
                iArr106[i136] = iArr106[i136 - 1];
                return 0;
            case 123:
                int[] iArr107 = this.MediaMetadataCompat;
                int i137 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i137 + 1;
                iArr107[i137] = 125;
                return 0;
            case 124:
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 125:
                int[] iArr108 = this.MediaMetadataCompat;
                int i138 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i138 + 1;
                iArr108[i138] = 71;
                return 0;
            case 126:
                int[] iArr109 = this.MediaMetadataCompat;
                int i139 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i139 + 1;
                iArr109[i139] = 91;
                return 0;
            case 127:
                int[] iArr110 = this.MediaMetadataCompat;
                int i140 = this.AudioAttributesImplApi21Parcelizer;
                iArr110[i140] = 87;
                iArr110[i140 - 1] = iArr110[i140 - 1] + iArr110[i140];
                this.AudioAttributesImplApi21Parcelizer = i140 + 1;
                iArr110[i140] = iArr110[i140 - 1];
                return 0;
            case 128:
                int[] iArr111 = this.MediaMetadataCompat;
                int i141 = this.AudioAttributesImplApi21Parcelizer;
                iArr111[i141] = 98;
                this.AudioAttributesImplApi21Parcelizer = i141 + 2;
                iArr111[i141 + 1] = 0;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr112 = this.MediaMetadataCompat;
                int i142 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i142 + 1;
                iArr112[i142] = 63;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int[] iArr113 = this.MediaMetadataCompat;
                int i143 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i143 + 1;
                iArr113[i143] = 41;
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr114 = this.MediaMetadataCompat;
                int i144 = this.AudioAttributesImplApi21Parcelizer;
                iArr114[i144] = 123;
                this.AudioAttributesImplApi21Parcelizer = i144;
                iArr114[i144 - 1] = iArr114[i144 - 1] + iArr114[i144];
                return 0;
            case 132:
                int[] iArr115 = this.MediaMetadataCompat;
                int i145 = this.AudioAttributesImplApi21Parcelizer;
                iArr115[i145] = 39;
                this.AudioAttributesImplApi21Parcelizer = i145;
                iArr115[i145 - 1] = iArr115[i145 - 1] + iArr115[i145];
                return 0;
            case 133:
                int[] iArr116 = this.MediaMetadataCompat;
                int i146 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr15 = this.onCustomAction;
                Object obj6 = objArr15[i146 - 1];
                objArr15[i146 - 1] = null;
                iArr116[i146 - 1] = ((int[]) obj6).length;
                int i147 = i146 - 1;
                this.AudioAttributesImplApi21Parcelizer = i147;
                objArr15[i147] = null;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int[] iArr117 = this.MediaMetadataCompat;
                int i148 = this.AudioAttributesImplApi21Parcelizer;
                iArr117[i148] = 35;
                this.AudioAttributesImplApi21Parcelizer = i148;
                iArr117[i148 - 1] = iArr117[i148 - 1] + iArr117[i148];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr118 = this.MediaMetadataCompat;
                int i149 = this.AudioAttributesImplApi21Parcelizer;
                iArr118[i149] = 28;
                iArr118[i149 + 1] = 0;
                int i150 = i149 + 1;
                this.AudioAttributesImplApi21Parcelizer = i150;
                iArr118[i149] = iArr118[i149] / iArr118[i150];
                return 0;
            case 136:
                int[] iArr119 = this.MediaMetadataCompat;
                int i151 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i151 + 1;
                iArr119[i151] = 37;
                return 0;
            case 137:
                int[] iArr120 = this.MediaMetadataCompat;
                int i152 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i152 + 1;
                iArr120[i152] = 6;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr121 = this.MediaMetadataCompat;
                int i153 = this.AudioAttributesImplApi21Parcelizer;
                iArr121[i153] = 11;
                iArr121[i153 - 1] = iArr121[i153 - 1] + iArr121[i153];
                this.AudioAttributesImplApi21Parcelizer = i153 + 1;
                iArr121[i153] = iArr121[i153 - 1];
                return 0;
            case 139:
                long[] jArr = this.MediaBrowserCompatSearchResultReceiver;
                int i154 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i154 + 1;
                jArr[i154] = this.write;
                return 0;
            case 140:
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 141:
                int[] iArr122 = this.MediaMetadataCompat;
                int i155 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i155 + 1;
                iArr122[i155] = 19;
                return 0;
            case 142:
                int[] iArr123 = this.MediaMetadataCompat;
                int i156 = this.AudioAttributesImplApi21Parcelizer;
                iArr123[i156] = 23;
                this.AudioAttributesImplApi21Parcelizer = i156 + 2;
                iArr123[i156 + 1] = 0;
                return 0;
            case 143:
                int[] iArr124 = this.MediaMetadataCompat;
                int i157 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i157 + 1;
                iArr124[i157] = 68;
                return 0;
            case 144:
                int[] iArr125 = this.MediaMetadataCompat;
                int i158 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i158 + 1;
                iArr125[i158] = 93;
                return 0;
            case 145:
                int[] iArr126 = this.MediaMetadataCompat;
                int i159 = this.AudioAttributesImplApi21Parcelizer;
                iArr126[i159] = 53;
                this.AudioAttributesImplApi21Parcelizer = i159;
                iArr126[i159 - 1] = iArr126[i159 - 1] + iArr126[i159];
                return 0;
            case 146:
                int[] iArr127 = this.MediaMetadataCompat;
                int i160 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i160 + 1;
                iArr127[i160] = 79;
                return 0;
            case 147:
                int[] iArr128 = this.MediaMetadataCompat;
                int i161 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i161 + 1;
                iArr128[i161] = 99;
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                Object[] objArr16 = this.onCustomAction;
                int i162 = this.AudioAttributesImplApi21Parcelizer;
                objArr16[i162] = objArr16[8];
                int[] iArr129 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i162 + 2;
                iArr129[i162 + 1] = iArr129[9];
                return 0;
            case 149:
                int[] iArr130 = this.MediaMetadataCompat;
                int i163 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i163 + 1;
                iArr130[i163] = 84;
                return 0;
            case 150:
                int[] iArr131 = this.MediaMetadataCompat;
                int i164 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i164 + 1;
                iArr131[i164] = 72;
                return 0;
            case 151:
                int[] iArr132 = this.MediaMetadataCompat;
                int i165 = this.AudioAttributesImplApi21Parcelizer;
                iArr132[i165] = 105;
                this.AudioAttributesImplApi21Parcelizer = i165;
                iArr132[i165 - 1] = iArr132[i165 - 1] + iArr132[i165];
                return 0;
            case 152:
                int[] iArr133 = this.MediaMetadataCompat;
                int i166 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i166 + 1;
                iArr133[i166] = 119;
                return 0;
            case 153:
                int[] iArr134 = this.MediaMetadataCompat;
                int i167 = this.AudioAttributesImplApi21Parcelizer;
                iArr134[i167] = 89;
                this.AudioAttributesImplApi21Parcelizer = i167;
                iArr134[i167 - 1] = iArr134[i167 - 1] + iArr134[i167];
                return 0;
            case 154:
                int[] iArr135 = this.MediaMetadataCompat;
                int i168 = this.AudioAttributesImplApi21Parcelizer;
                iArr135[i168] = 59;
                this.AudioAttributesImplApi21Parcelizer = i168;
                iArr135[i168 - 1] = iArr135[i168 - 1] + iArr135[i168];
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr136 = this.MediaMetadataCompat;
                int i169 = this.AudioAttributesImplApi21Parcelizer;
                iArr136[i169] = 125;
                this.AudioAttributesImplApi21Parcelizer = i169;
                iArr136[i169 - 1] = iArr136[i169 - 1] + iArr136[i169];
                return 0;
            case 156:
                int[] iArr137 = this.MediaMetadataCompat;
                int i170 = this.AudioAttributesImplApi21Parcelizer;
                iArr137[i170] = 27;
                iArr137[i170 - 1] = iArr137[i170 - 1] + iArr137[i170];
                this.AudioAttributesImplApi21Parcelizer = i170 + 1;
                iArr137[i170] = iArr137[i170 - 1];
                return 0;
            case 157:
                int[] iArr138 = this.MediaMetadataCompat;
                int i171 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i171 + 1;
                iArr138[i171] = 81;
                return 0;
            case 158:
                int[] iArr139 = this.MediaMetadataCompat;
                int i172 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i172 + 1;
                iArr139[i172] = 34;
                return 0;
            case 159:
                int[] iArr140 = this.MediaMetadataCompat;
                int i173 = this.AudioAttributesImplApi21Parcelizer;
                iArr140[i173] = 63;
                iArr140[i173 - 1] = iArr140[i173 - 1] + iArr140[i173];
                this.AudioAttributesImplApi21Parcelizer = i173 + 1;
                iArr140[i173] = iArr140[i173 - 1];
                return 0;
            case 160:
                int[] iArr141 = this.MediaMetadataCompat;
                int i174 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i174 + 1;
                iArr141[i174] = 21;
                return 0;
            case 161:
                int[] iArr142 = this.MediaMetadataCompat;
                int i175 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i175 + 1;
                iArr142[i175] = iArr142[10];
                return 0;
            case 162:
                int[] iArr143 = this.MediaMetadataCompat;
                int i176 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i176 + 1;
                iArr143[i176] = 29;
                return 0;
            case 163:
                int[] iArr144 = this.MediaMetadataCompat;
                int i177 = this.AudioAttributesImplApi21Parcelizer;
                iArr144[i177] = 71;
                iArr144[i177 - 1] = iArr144[i177 - 1] + iArr144[i177];
                this.AudioAttributesImplApi21Parcelizer = i177 + 1;
                iArr144[i177] = iArr144[i177 - 1];
                return 0;
            case 164:
                int[] iArr145 = this.MediaMetadataCompat;
                int i178 = this.AudioAttributesImplApi21Parcelizer;
                iArr145[i178] = 73;
                this.AudioAttributesImplApi21Parcelizer = i178;
                iArr145[i178 - 1] = iArr145[i178 - 1] + iArr145[i178];
                return 0;
            case 165:
                Object[] objArr17 = this.onCustomAction;
                int i179 = this.AudioAttributesImplApi21Parcelizer;
                objArr17[i179] = objArr17[8];
                objArr17[i179 + 1] = objArr17[9];
                int[] iArr146 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i179 + 3;
                iArr146[i179 + 2] = iArr146[10];
                return 0;
            case 166:
                int[] iArr147 = this.MediaMetadataCompat;
                int i180 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i180 + 1;
                iArr147[i180] = iArr147[11];
                return 0;
            case 167:
                int[] iArr148 = this.MediaMetadataCompat;
                int i181 = this.AudioAttributesImplApi21Parcelizer;
                iArr148[i181] = 93;
                this.AudioAttributesImplApi21Parcelizer = i181;
                iArr148[i181 - 1] = iArr148[i181 - 1] + iArr148[i181];
                return 0;
            case 168:
                int[] iArr149 = this.MediaMetadataCompat;
                int i182 = this.AudioAttributesImplApi21Parcelizer;
                iArr149[i182] = 77;
                this.AudioAttributesImplApi21Parcelizer = i182;
                iArr149[i182 - 1] = iArr149[i182 - 1] + iArr149[i182];
                return 0;
            case 169:
                int[] iArr150 = this.MediaMetadataCompat;
                int i183 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i183 + 1;
                iArr150[i183] = 80;
                return 0;
            case 170:
                int[] iArr151 = this.MediaMetadataCompat;
                int i184 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i184 + 1;
                iArr151[i184] = 1;
                return 0;
            case 171:
                int[] iArr152 = this.MediaMetadataCompat;
                int i185 = this.AudioAttributesImplApi21Parcelizer;
                iArr152[i185] = 6;
                this.AudioAttributesImplApi21Parcelizer = i185 + 2;
                iArr152[i185 + 1] = 0;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr153 = this.MediaMetadataCompat;
                int i186 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i186 + 1;
                iArr153[i186] = 7;
                return 0;
            case 173:
                int[] iArr154 = this.MediaMetadataCompat;
                int i187 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i187 + 1;
                iArr154[i187] = 90;
                return 0;
            case 174:
                int[] iArr155 = this.MediaMetadataCompat;
                int i188 = this.AudioAttributesImplApi21Parcelizer;
                iArr155[i188] = 41;
                iArr155[i188 - 1] = iArr155[i188 - 1] + iArr155[i188];
                this.AudioAttributesImplApi21Parcelizer = i188 + 1;
                iArr155[i188] = iArr155[i188 - 1];
                return 0;
            case 175:
                int[] iArr156 = this.MediaMetadataCompat;
                int i189 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i189 + 1;
                iArr156[i189] = 24;
                return 0;
            case 176:
                int[] iArr157 = this.MediaMetadataCompat;
                int i190 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i190 + 1;
                iArr157[i190] = 14;
                return 0;
            case 177:
                int[] iArr158 = this.MediaMetadataCompat;
                int i191 = this.AudioAttributesImplApi21Parcelizer;
                iArr158[i191] = 3;
                this.AudioAttributesImplApi21Parcelizer = i191;
                iArr158[i191 - 1] = iArr158[i191 - 1] + iArr158[i191];
                return 0;
            case 178:
                int[] iArr159 = this.MediaMetadataCompat;
                int i192 = this.AudioAttributesImplApi21Parcelizer;
                iArr159[i192] = 19;
                this.AudioAttributesImplApi21Parcelizer = i192;
                iArr159[i192 - 1] = iArr159[i192 - 1] + iArr159[i192];
                return 0;
            case 179:
                int[] iArr160 = this.MediaMetadataCompat;
                int i193 = this.AudioAttributesImplApi21Parcelizer;
                iArr160[i193] = 65;
                iArr160[i193 - 1] = iArr160[i193 - 1] + iArr160[i193];
                this.AudioAttributesImplApi21Parcelizer = i193 + 1;
                iArr160[i193] = iArr160[i193 - 1];
                return 0;
            case 180:
                int[] iArr161 = this.MediaMetadataCompat;
                int i194 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i194 + 1;
                iArr161[i194] = 52;
                return 0;
            case 181:
                int[] iArr162 = this.MediaMetadataCompat;
                int i195 = this.AudioAttributesImplApi21Parcelizer;
                iArr162[i195] = 47;
                this.AudioAttributesImplApi21Parcelizer = i195;
                iArr162[i195 - 1] = iArr162[i195 - 1] + iArr162[i195];
                return 0;
            case 182:
                int[] iArr163 = this.MediaMetadataCompat;
                int i196 = this.AudioAttributesImplApi21Parcelizer;
                iArr163[i196] = 111;
                this.AudioAttributesImplApi21Parcelizer = i196;
                iArr163[i196 - 1] = iArr163[i196 - 1] + iArr163[i196];
                return 0;
            case 183:
                int[] iArr164 = this.MediaMetadataCompat;
                int i197 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i197 + 1;
                iArr164[i197] = 78;
                return 0;
            case 184:
                int[] iArr165 = this.MediaMetadataCompat;
                int i198 = this.AudioAttributesImplApi21Parcelizer;
                iArr165[i198] = 69;
                this.AudioAttributesImplApi21Parcelizer = i198;
                iArr165[i198 - 1] = iArr165[i198 - 1] + iArr165[i198];
                return 0;
            case 185:
                int[] iArr166 = this.MediaMetadataCompat;
                int i199 = this.AudioAttributesImplApi21Parcelizer;
                iArr166[i199] = 29;
                iArr166[i199 - 1] = iArr166[i199 - 1] + iArr166[i199];
                this.AudioAttributesImplApi21Parcelizer = i199 + 1;
                iArr166[i199] = iArr166[i199 - 1];
                return 0;
            case 186:
                int[] iArr167 = this.MediaMetadataCompat;
                int i200 = this.AudioAttributesImplApi21Parcelizer;
                iArr167[i200] = 67;
                iArr167[i200 - 1] = iArr167[i200 - 1] + iArr167[i200];
                this.AudioAttributesImplApi21Parcelizer = i200 + 1;
                iArr167[i200] = iArr167[i200 - 1];
                return 0;
            case 187:
                int[] iArr168 = this.MediaMetadataCompat;
                int i201 = this.AudioAttributesImplApi21Parcelizer;
                iArr168[i201] = 99;
                iArr168[i201 - 1] = iArr168[i201 - 1] + iArr168[i201];
                this.AudioAttributesImplApi21Parcelizer = i201 + 1;
                iArr168[i201] = iArr168[i201 - 1];
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr169 = this.MediaMetadataCompat;
                int i202 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i202 + 1;
                iArr169[i202] = 65;
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr170 = this.MediaMetadataCompat;
                int i203 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i203 + 1;
                iArr170[i203] = 111;
                return 0;
            case 190:
                int[] iArr171 = this.MediaMetadataCompat;
                int i204 = this.AudioAttributesImplApi21Parcelizer;
                iArr171[i204] = 35;
                iArr171[i204 - 1] = iArr171[i204 - 1] + iArr171[i204];
                this.AudioAttributesImplApi21Parcelizer = i204 + 1;
                iArr171[i204] = iArr171[i204 - 1];
                return 0;
            case 191:
                Object[] objArr18 = this.onCustomAction;
                int i205 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i205 + 1;
                objArr18[i205] = objArr18[11];
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                Object[] objArr19 = this.onCustomAction;
                int i206 = this.AudioAttributesImplApi21Parcelizer;
                objArr19[i206] = objArr19[10];
                this.AudioAttributesImplApi21Parcelizer = i206 + 2;
                objArr19[i206 + 1] = objArr19[11];
                return 0;
            case 193:
                int[] iArr172 = this.MediaMetadataCompat;
                int i207 = this.AudioAttributesImplApi21Parcelizer;
                iArr172[i207] = 68;
                this.AudioAttributesImplApi21Parcelizer = i207 + 2;
                iArr172[i207 + 1] = 0;
                return 0;
            case 194:
                int[] iArr173 = this.MediaMetadataCompat;
                int i208 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i208 + 1;
                iArr173[i208] = 96;
                return 0;
            case 195:
                int[] iArr174 = this.MediaMetadataCompat;
                int i209 = this.AudioAttributesImplApi21Parcelizer;
                iArr174[i209] = 79;
                this.AudioAttributesImplApi21Parcelizer = i209;
                iArr174[i209 - 1] = iArr174[i209 - 1] + iArr174[i209];
                return 0;
            case 196:
                int[] iArr175 = this.MediaMetadataCompat;
                int i210 = this.AudioAttributesImplApi21Parcelizer;
                iArr175[i210] = 34;
                iArr175[i210 + 1] = 0;
                int i211 = i210 + 1;
                this.AudioAttributesImplApi21Parcelizer = i211;
                iArr175[i210] = iArr175[i210] / iArr175[i211];
                return 0;
            case 197:
                int[] iArr176 = this.MediaMetadataCompat;
                int i212 = this.AudioAttributesImplApi21Parcelizer;
                iArr176[i212] = 123;
                iArr176[i212 - 1] = iArr176[i212 - 1] + iArr176[i212];
                this.AudioAttributesImplApi21Parcelizer = i212 + 1;
                iArr176[i212] = iArr176[i212 - 1];
                return 0;
            case 198:
                int[] iArr177 = this.MediaMetadataCompat;
                int i213 = this.AudioAttributesImplApi21Parcelizer;
                iArr177[i213] = 103;
                this.AudioAttributesImplApi21Parcelizer = i213;
                iArr177[i213 - 1] = iArr177[i213 - 1] + iArr177[i213];
                return 0;
            case 199:
                int[] iArr178 = this.MediaMetadataCompat;
                int i214 = this.AudioAttributesImplApi21Parcelizer;
                iArr178[i214] = 41;
                this.AudioAttributesImplApi21Parcelizer = i214;
                iArr178[i214 - 1] = iArr178[i214 - 1] + iArr178[i214];
                return 0;
            case 200:
                int i215 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i215;
                Object[] objArr20 = this.onCustomAction;
                Object obj7 = objArr20[i215];
                objArr20[i215] = null;
                this.RemoteActionCompatParcelizer = obj7 != null ? 0 : 1;
                return 0;
            case 201:
                Object[] objArr21 = this.onCustomAction;
                int i216 = this.AudioAttributesImplApi21Parcelizer;
                objArr21[i216] = objArr21[i216 - 1];
                this.AudioAttributesImplApi21Parcelizer = i216;
                Object obj8 = objArr21[i216];
                objArr21[i216] = null;
                objArr21[10] = obj8;
                return 0;
            case 202:
                int i217 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i217;
                Object[] objArr22 = this.onCustomAction;
                Object obj9 = objArr22[i217];
                objArr22[i217] = null;
                objArr22[10] = obj9;
                return 0;
            case 203:
                int i218 = this.AudioAttributesImplApi21Parcelizer;
                int i219 = i218 - 1;
                int[] iArr179 = this.MediaMetadataCompat;
                iArr179[i218 - 2] = iArr179[i218 - 2] ^ iArr179[i219];
                Object[] objArr23 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i218;
                objArr23[i219] = objArr23[8];
                return 0;
            case 204:
                float[] fArr = this.RatingCompat;
                int i220 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i220 + 1;
                fArr[i220] = this.IconCompatParcelizer;
                return 0;
            case 205:
                float[] fArr2 = this.RatingCompat;
                int i221 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i221 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = fArr2[i221];
                return 0;
            case 206:
                int[] iArr180 = this.MediaMetadataCompat;
                int i222 = this.AudioAttributesImplApi21Parcelizer;
                iArr180[i222] = 75;
                iArr180[i222 - 1] = iArr180[i222 - 1] + iArr180[i222];
                this.AudioAttributesImplApi21Parcelizer = i222 + 1;
                iArr180[i222] = iArr180[i222 - 1];
                return 0;
            case 207:
                int[] iArr181 = this.MediaMetadataCompat;
                int i223 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i223 + 1;
                iArr181[i223] = 107;
                return 0;
            case 208:
                int[] iArr182 = this.MediaMetadataCompat;
                int i224 = this.AudioAttributesImplApi21Parcelizer;
                iArr182[i224] = 77;
                iArr182[i224 - 1] = iArr182[i224 - 1] + iArr182[i224];
                this.AudioAttributesImplApi21Parcelizer = i224 + 1;
                iArr182[i224] = iArr182[i224 - 1];
                return 0;
            case 209:
                int i225 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i225;
                Object[] objArr24 = this.onCustomAction;
                Object obj10 = objArr24[i225];
                objArr24[i225] = null;
                objArr24[9] = obj10;
                return 0;
            case 210:
                int i226 = this.AudioAttributesImplApi21Parcelizer;
                int i227 = i226 - 1;
                int[] iArr183 = this.MediaMetadataCompat;
                iArr183[9] = iArr183[i227];
                Object[] objArr25 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i226;
                objArr25[i227] = objArr25[8];
                return 0;
            case 211:
                int i228 = this.AudioAttributesImplApi21Parcelizer;
                int i229 = i228 - 1;
                Object[] objArr26 = this.onCustomAction;
                Object obj11 = objArr26[i229];
                objArr26[i229] = null;
                objArr26[11] = obj11;
                int[] iArr184 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i228;
                iArr184[i229] = iArr184[9];
                return 0;
            case 212:
                Object[] objArr27 = this.onCustomAction;
                int i230 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i230 + 1;
                objArr27[i230] = objArr27[i230 - 1];
                return 0;
            case 213:
                int i231 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i231;
                Object[] objArr28 = this.onCustomAction;
                Object obj12 = objArr28[i231];
                objArr28[i231] = null;
                objArr28[11] = obj12;
                return 0;
            case 214:
                int i232 = this.AudioAttributesImplApi21Parcelizer;
                int i233 = i232 - 3;
                this.AudioAttributesImplApi21Parcelizer = i233;
                Object[] objArr29 = this.onCustomAction;
                Object obj13 = objArr29[i233];
                objArr29[i233] = null;
                int i234 = this.MediaMetadataCompat[i232 - 2];
                Object obj14 = objArr29[i232 - 1];
                objArr29[i232 - 1] = null;
                ((Object[]) obj13)[i234] = obj14;
                return 0;
            case 215:
                int i235 = this.AudioAttributesImplApi21Parcelizer;
                int i236 = i235 - 1;
                Object[] objArr30 = this.onCustomAction;
                Object obj15 = objArr30[i236];
                objArr30[i236] = null;
                objArr30[10] = obj15;
                this.AudioAttributesImplApi21Parcelizer = i235;
                objArr30[i236] = objArr30[9];
                return 0;
            case 216:
                int i237 = this.AudioAttributesImplApi21Parcelizer;
                int i238 = i237 - 2;
                this.AudioAttributesImplApi21Parcelizer = i238;
                Object[] objArr31 = this.onCustomAction;
                Object obj16 = objArr31[i238];
                objArr31[i238] = null;
                Object obj17 = objArr31[i237 - 1];
                objArr31[i237 - 1] = null;
                this.RemoteActionCompatParcelizer = obj16 != obj17 ? 0 : 1;
                return 0;
            case 217:
                int[] iArr185 = this.MediaMetadataCompat;
                int i239 = this.AudioAttributesImplApi21Parcelizer;
                iArr185[i239] = 63;
                this.AudioAttributesImplApi21Parcelizer = i239;
                iArr185[i239 - 1] = iArr185[i239 - 1] + iArr185[i239];
                return 0;
            case 218:
                int[] iArr186 = this.MediaMetadataCompat;
                int i240 = this.AudioAttributesImplApi21Parcelizer;
                iArr186[i240] = 101;
                this.AudioAttributesImplApi21Parcelizer = i240;
                iArr186[i240 - 1] = iArr186[i240 - 1] + iArr186[i240];
                return 0;
            case 219:
                int i241 = this.AudioAttributesImplApi21Parcelizer;
                int i242 = i241 - 1;
                Object[] objArr32 = this.onCustomAction;
                Object obj18 = objArr32[i242];
                objArr32[i242] = null;
                objArr32[10] = obj18;
                this.AudioAttributesImplApi21Parcelizer = i241;
                objArr32[i242] = objArr32[8];
                return 0;
            case 220:
                Object[] objArr33 = this.onCustomAction;
                int i243 = this.AudioAttributesImplApi21Parcelizer;
                objArr33[i243] = objArr33[11];
                this.AudioAttributesImplApi21Parcelizer = i243 + 2;
                objArr33[i243 + 1] = objArr33[8];
                return 0;
            case 221:
                Object[] objArr34 = this.onCustomAction;
                int i244 = this.AudioAttributesImplApi21Parcelizer;
                objArr34[i244] = objArr34[10];
                this.AudioAttributesImplApi21Parcelizer = i244 + 2;
                objArr34[i244 + 1] = objArr34[8];
                return 0;
            case 222:
                int i245 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i245;
                int[] iArr187 = this.MediaMetadataCompat;
                iArr187[9] = iArr187[i245];
                return 0;
            case 223:
                Object[] objArr35 = this.onCustomAction;
                int i246 = this.AudioAttributesImplApi21Parcelizer;
                objArr35[i246] = objArr35[11];
                this.AudioAttributesImplApi21Parcelizer = i246 + 2;
                objArr35[i246 + 1] = objArr35[10];
                return 0;
            case 224:
                int[] iArr188 = this.MediaMetadataCompat;
                int i247 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i247 + 1;
                iArr188[i247] = 48;
                return 0;
            case 225:
                int[] iArr189 = this.MediaMetadataCompat;
                int i248 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i248 + 1;
                iArr189[i248] = 32;
                return 0;
            case 226:
                int[] iArr190 = this.MediaMetadataCompat;
                int i249 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i249 + 1;
                iArr190[i249] = 54;
                return 0;
            case 227:
                int i250 = this.AudioAttributesImplApi21Parcelizer;
                int i251 = i250 - 2;
                this.AudioAttributesImplApi21Parcelizer = i251;
                int[] iArr191 = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = iArr191[i251] != iArr191[i250 - 1] ? 0 : 1;
                return 0;
            case 228:
                int[] iArr192 = this.MediaMetadataCompat;
                int i252 = this.AudioAttributesImplApi21Parcelizer;
                iArr192[i252] = 1;
                this.AudioAttributesImplApi21Parcelizer = i252;
                iArr192[11] = iArr192[i252];
                return 0;
            case 229:
                int[] iArr193 = this.MediaMetadataCompat;
                int i253 = this.AudioAttributesImplApi21Parcelizer;
                iArr193[i253] = 0;
                this.AudioAttributesImplApi21Parcelizer = i253;
                iArr193[11] = iArr193[i253];
                return 0;
            case 230:
                int i254 = this.AudioAttributesImplApi21Parcelizer;
                int i255 = i254 - 1;
                Object[] objArr36 = this.onCustomAction;
                objArr36[i255] = null;
                this.AudioAttributesImplApi21Parcelizer = i254;
                objArr36[i255] = objArr36[8];
                return 0;
            case 231:
                int i256 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i256;
                int[] iArr194 = this.MediaMetadataCompat;
                iArr194[12] = iArr194[i256];
                return 0;
            case 232:
                int[] iArr195 = this.MediaMetadataCompat;
                int i257 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i257 + 1;
                iArr195[i257] = iArr195[12];
                return 0;
            case 233:
                int i258 = this.AudioAttributesImplApi21Parcelizer;
                int i259 = i258 - 1;
                int[] iArr196 = this.MediaMetadataCompat;
                iArr196[12] = iArr196[i259];
                Object[] objArr37 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i258;
                objArr37[i259] = objArr37[8];
                return 0;
            case 234:
                int i260 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i260;
                Object[] objArr38 = this.onCustomAction;
                Object obj19 = objArr38[i260];
                objArr38[i260] = null;
                this.RemoteActionCompatParcelizer = obj19 == null ? 0 : 1;
                return 0;
            case 235:
                int i261 = this.AudioAttributesImplApi21Parcelizer;
                int i262 = i261 - 1;
                this.onCustomAction[i262] = null;
                int[] iArr197 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i261;
                iArr197[i262] = iArr197[12];
                return 0;
            case 236:
                int i263 = this.AudioAttributesImplApi21Parcelizer;
                int i264 = i263 - 1;
                Object[] objArr39 = this.onCustomAction;
                Object obj20 = objArr39[i264];
                objArr39[i264] = null;
                objArr39[9] = obj20;
                this.AudioAttributesImplApi21Parcelizer = i263;
                objArr39[i264] = objArr39[8];
                return 0;
            case 237:
                int i265 = this.AudioAttributesImplApi21Parcelizer;
                int i266 = i265 - 1;
                Object[] objArr40 = this.onCustomAction;
                Object obj21 = objArr40[i266];
                objArr40[i266] = null;
                objArr40[9] = obj21;
                objArr40[i266] = objArr40[8];
                this.AudioAttributesImplApi21Parcelizer = i265 + 1;
                objArr40[i265] = objArr40[9];
                return 0;
            case 238:
                int[] iArr198 = this.MediaMetadataCompat;
                int i267 = this.AudioAttributesImplApi21Parcelizer;
                iArr198[i267] = 73;
                iArr198[i267 - 1] = iArr198[i267 - 1] + iArr198[i267];
                this.AudioAttributesImplApi21Parcelizer = i267 + 1;
                iArr198[i267] = iArr198[i267 - 1];
                return 0;
            case 239:
                int[] iArr199 = this.MediaMetadataCompat;
                int i268 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i268 + 1;
                iArr199[i268] = 17;
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int[] iArr200 = this.MediaMetadataCompat;
                int i269 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i269 + 1;
                iArr200[i269] = 13;
                return 0;
            case 241:
                int[] iArr201 = this.MediaMetadataCompat;
                int i270 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i270 + 1;
                iArr201[i270] = 47;
                return 0;
            case 242:
                int[] iArr202 = this.MediaMetadataCompat;
                int i271 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i271 + 1;
                iArr202[i271] = 31;
                return 0;
            case 243:
                int i272 = this.AudioAttributesImplApi21Parcelizer;
                int i273 = i272 - 2;
                this.AudioAttributesImplApi21Parcelizer = i273;
                int[] iArr203 = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = iArr203[i273] == iArr203[i272 - 1] ? 0 : 1;
                return 0;
            case 244:
                int[] iArr204 = this.MediaMetadataCompat;
                int i274 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i274 + 1;
                iArr204[i274] = -1;
                return 0;
            case 245:
                int i275 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i275;
                Object[] objArr41 = this.onCustomAction;
                Object obj22 = objArr41[i275];
                objArr41[i275] = null;
                objArr41[14] = obj22;
                return 0;
            case 246:
                int i276 = this.AudioAttributesImplApi21Parcelizer;
                int i277 = i276 - 1;
                Object[] objArr42 = this.onCustomAction;
                Object obj23 = objArr42[i277];
                objArr42[i277] = null;
                objArr42[12] = obj23;
                this.AudioAttributesImplApi21Parcelizer = i276;
                objArr42[i277] = objArr42[14];
                return 0;
            case 247:
                Object[] objArr43 = this.onCustomAction;
                int i278 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i278 + 1;
                objArr43[i278] = objArr43[14];
                return 0;
            case 248:
                Object[] objArr44 = this.onCustomAction;
                int i279 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i279 + 1;
                objArr44[i279] = objArr44[12];
                return 0;
            case 249:
                int[] iArr205 = this.MediaMetadataCompat;
                int i280 = this.AudioAttributesImplApi21Parcelizer;
                iArr205[i280] = 1;
                iArr205[10] = iArr205[i280];
                Object[] objArr45 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i280 + 1;
                objArr45[i280] = objArr45[14];
                return 0;
            case 250:
                int i281 = this.AudioAttributesImplApi21Parcelizer;
                int i282 = i281 - 1;
                this.AudioAttributesImplApi21Parcelizer = i282;
                float[] fArr3 = this.RatingCompat;
                this.MediaMetadataCompat[i281 - 2] = (fArr3[i281 - 2] > fArr3[i282] ? 1 : (fArr3[i281 - 2] == fArr3[i282] ? 0 : -1));
                return 0;
            case 251:
                int[] iArr206 = this.MediaMetadataCompat;
                int i283 = this.AudioAttributesImplApi21Parcelizer;
                iArr206[i283] = 0;
                this.AudioAttributesImplApi21Parcelizer = i283;
                iArr206[9] = iArr206[i283];
                return 0;
            case 252:
                Object[] objArr46 = this.onCustomAction;
                int i284 = this.AudioAttributesImplApi21Parcelizer;
                objArr46[i284] = objArr46[i284 - 1];
                this.AudioAttributesImplApi21Parcelizer = i284;
                Object obj24 = objArr46[i284];
                objArr46[i284] = null;
                objArr46[11] = obj24;
                return 0;
            case 253:
                int i285 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i285;
                int[] iArr207 = this.MediaMetadataCompat;
                iArr207[10] = iArr207[i285];
                return 0;
            case 254:
                int i286 = this.AudioAttributesImplApi21Parcelizer;
                int i287 = i286 - 1;
                Object[] objArr47 = this.onCustomAction;
                Object obj25 = objArr47[i287];
                objArr47[i287] = null;
                objArr47[13] = obj25;
                int[] iArr208 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i286;
                iArr208[i287] = iArr208[9];
                return 0;
            case 255:
                Object[] objArr48 = this.onCustomAction;
                int i288 = this.AudioAttributesImplApi21Parcelizer;
                objArr48[i288] = objArr48[13];
                this.AudioAttributesImplApi21Parcelizer = i288;
                Object obj26 = objArr48[i288];
                objArr48[i288] = null;
                objArr48[11] = obj26;
                return 0;
            case 256:
                int i289 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i289;
                Object[] objArr49 = this.onCustomAction;
                Object obj27 = objArr49[i289];
                objArr49[i289] = null;
                objArr49[12] = obj27;
                return 0;
            case 257:
                int i290 = this.AudioAttributesImplApi21Parcelizer;
                int i291 = i290 - 1;
                Object[] objArr50 = this.onCustomAction;
                Object obj28 = objArr50[i291];
                objArr50[i291] = null;
                objArr50[12] = obj28;
                this.AudioAttributesImplApi21Parcelizer = i290;
                objArr50[i291] = objArr50[13];
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                Object[] objArr51 = this.onCustomAction;
                int i292 = this.AudioAttributesImplApi21Parcelizer;
                objArr51[i292] = objArr51[i292 - 1];
                this.AudioAttributesImplApi21Parcelizer = i292;
                Object obj29 = objArr51[i292];
                objArr51[i292] = null;
                objArr51[12] = obj29;
                return 0;
            case 259:
                Object[] objArr52 = this.onCustomAction;
                int i293 = this.AudioAttributesImplApi21Parcelizer;
                objArr52[i293] = objArr52[8];
                this.AudioAttributesImplApi21Parcelizer = i293 + 2;
                objArr52[i293 + 1] = objArr52[i293];
                return 0;
            case 260:
                int[] iArr209 = this.MediaMetadataCompat;
                int i294 = this.AudioAttributesImplApi21Parcelizer;
                iArr209[i294] = iArr209[10];
                Object[] objArr53 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i294 + 2;
                objArr53[i294 + 1] = objArr53[11];
                return 0;
            case 261:
                Object[] objArr54 = this.onCustomAction;
                int i295 = this.AudioAttributesImplApi21Parcelizer;
                objArr54[i295] = objArr54[8];
                this.AudioAttributesImplApi21Parcelizer = i295 + 2;
                objArr54[i295 + 1] = objArr54[11];
                return 0;
            case 262:
                int[] iArr210 = this.MediaMetadataCompat;
                int i296 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i296 + 1;
                iArr210[i296] = 4;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                int[] iArr211 = this.MediaMetadataCompat;
                int i297 = this.AudioAttributesImplApi21Parcelizer;
                iArr211[i297] = 5;
                this.AudioAttributesImplApi21Parcelizer = i297;
                iArr211[i297 - 1] = iArr211[i297 - 1] >> iArr211[i297];
                return 0;
            case 264:
                int[] iArr212 = this.MediaMetadataCompat;
                int i298 = this.AudioAttributesImplApi21Parcelizer;
                iArr212[i298] = 109;
                this.AudioAttributesImplApi21Parcelizer = i298;
                iArr212[i298 - 1] = iArr212[i298 - 1] + iArr212[i298];
                return 0;
            case 265:
                int[] iArr213 = this.MediaMetadataCompat;
                int i299 = this.AudioAttributesImplApi21Parcelizer;
                iArr213[i299] = 101;
                iArr213[i299 - 1] = iArr213[i299 - 1] + iArr213[i299];
                this.AudioAttributesImplApi21Parcelizer = i299 + 1;
                iArr213[i299] = iArr213[i299 - 1];
                return 0;
            case 266:
                int[] iArr214 = this.MediaMetadataCompat;
                int i300 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i300 + 1;
                iArr214[i300] = 16;
                return 0;
            case 267:
                int[] iArr215 = this.MediaMetadataCompat;
                int i301 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i301 + 1;
                iArr215[i301] = 60;
                return 0;
            case 268:
                int[] iArr216 = this.MediaMetadataCompat;
                int i302 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i302 + 1;
                iArr216[i302] = 33;
                return 0;
            case 269:
                int[] iArr217 = this.MediaMetadataCompat;
                int i303 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i303 + 1;
                iArr217[i303] = 8;
                return 0;
            case 270:
                Object[] objArr55 = this.onCustomAction;
                int i304 = this.AudioAttributesImplApi21Parcelizer;
                objArr55[i304] = objArr55[9];
                this.AudioAttributesImplApi21Parcelizer = i304 + 2;
                objArr55[i304 + 1] = objArr55[8];
                return 0;
            case 271:
                int[] iArr218 = this.MediaMetadataCompat;
                int i305 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i305 + 1;
                iArr218[i305] = 69;
                return 0;
            case 272:
                int[] iArr219 = this.MediaMetadataCompat;
                int i306 = this.AudioAttributesImplApi21Parcelizer;
                iArr219[i306] = 97;
                iArr219[i306 - 1] = iArr219[i306 - 1] + iArr219[i306];
                this.AudioAttributesImplApi21Parcelizer = i306 + 1;
                iArr219[i306] = iArr219[i306 - 1];
                return 0;
            case 273:
                int i307 = this.AudioAttributesImplApi21Parcelizer;
                int i308 = i307 - 1;
                Object[] objArr56 = this.onCustomAction;
                Object obj30 = objArr56[i308];
                objArr56[i308] = null;
                objArr56[12] = obj30;
                objArr56[i308] = objArr56[10];
                this.AudioAttributesImplApi21Parcelizer = i307 + 1;
                objArr56[i307] = objArr56[11];
                return 0;
            case 274:
                int[] iArr220 = this.MediaMetadataCompat;
                int i309 = this.AudioAttributesImplApi21Parcelizer;
                iArr220[i309] = 93;
                iArr220[i309 - 1] = iArr220[i309 - 1] + iArr220[i309];
                this.AudioAttributesImplApi21Parcelizer = i309 + 1;
                iArr220[i309] = iArr220[i309 - 1];
                return 0;
            case 275:
                int i310 = this.AudioAttributesImplApi21Parcelizer;
                int i311 = i310 - 1;
                long[] jArr2 = this.MediaBrowserCompatSearchResultReceiver;
                jArr2[9] = jArr2[i311];
                Object[] objArr57 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i310;
                objArr57[i311] = objArr57[8];
                return 0;
            case 276:
                int i312 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i312;
                long[] jArr3 = this.MediaBrowserCompatSearchResultReceiver;
                jArr3[11] = jArr3[i312];
                return 0;
            case 277:
                long[] jArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i313 = this.AudioAttributesImplApi21Parcelizer;
                jArr4[i313] = jArr4[9];
                jArr4[i313 + 1] = 0;
                int i314 = i313 + 1;
                this.AudioAttributesImplApi21Parcelizer = i314;
                this.MediaMetadataCompat[i313] = (jArr4[i313] > jArr4[i314] ? 1 : (jArr4[i313] == jArr4[i314] ? 0 : -1));
                return 0;
            case 278:
                int i315 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i315;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i315] <= 0 ? 0 : 1;
                return 0;
            case 279:
                long[] jArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i316 = this.AudioAttributesImplApi21Parcelizer;
                jArr5[i316] = jArr5[9];
                this.AudioAttributesImplApi21Parcelizer = i316 + 2;
                jArr5[i316 + 1] = jArr5[11];
                return 0;
            case 280:
                int i317 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i317;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i317] > 0 ? 0 : 1;
                return 0;
            case 281:
                int i318 = this.AudioAttributesImplApi21Parcelizer;
                int i319 = i318 - 1;
                this.AudioAttributesImplApi21Parcelizer = i319;
                long[] jArr6 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaMetadataCompat[i318 - 2] = (jArr6[i318 - 2] > jArr6[i319] ? 1 : (jArr6[i318 - 2] == jArr6[i319] ? 0 : -1));
                return 0;
            case 282:
                int[] iArr221 = this.MediaMetadataCompat;
                int i320 = this.AudioAttributesImplApi21Parcelizer;
                iArr221[i320] = 1;
                this.AudioAttributesImplApi21Parcelizer = i320;
                iArr221[9] = iArr221[i320];
                return 0;
            case 283:
                int[] iArr222 = this.MediaMetadataCompat;
                int i321 = this.AudioAttributesImplApi21Parcelizer;
                iArr222[i321] = 55;
                iArr222[i321 - 1] = iArr222[i321 - 1] + iArr222[i321];
                this.AudioAttributesImplApi21Parcelizer = i321 + 1;
                iArr222[i321] = iArr222[i321 - 1];
                return 0;
            case 284:
                int i322 = this.AudioAttributesImplApi21Parcelizer;
                int i323 = i322 - 1;
                long[] jArr7 = this.MediaBrowserCompatSearchResultReceiver;
                jArr7[11] = jArr7[i323];
                this.AudioAttributesImplApi21Parcelizer = i322;
                jArr7[i323] = jArr7[9];
                return 0;
            case 285:
                long[] jArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i324 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i324 + 1;
                jArr8[i324] = 1;
                return 0;
            case 286:
                Object[] objArr58 = this.onCustomAction;
                int i325 = this.AudioAttributesImplApi21Parcelizer;
                objArr58[i325] = objArr58[9];
                this.AudioAttributesImplApi21Parcelizer = i325 + 2;
                objArr58[i325 + 1] = objArr58[12];
                return 0;
            case 287:
                long[] jArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i326 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i326 + 1;
                this.AudioAttributesCompatParcelizer = jArr9[i326];
                return 0;
            case 288:
                int i327 = this.AudioAttributesImplApi21Parcelizer;
                int i328 = i327 - 1;
                Object[] objArr59 = this.onCustomAction;
                Object obj31 = objArr59[i328];
                objArr59[i328] = null;
                objArr59[11] = obj31;
                this.AudioAttributesImplApi21Parcelizer = i327;
                objArr59[i328] = objArr59[9];
                return 0;
            case 289:
                int[] iArr223 = this.MediaMetadataCompat;
                int i329 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i329 + 1;
                iArr223[i329] = 66;
                return 0;
            case 290:
                int[] iArr224 = this.MediaMetadataCompat;
                int i330 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i330 + 1;
                iArr224[i330] = 11;
                return 0;
            case 291:
                int[] iArr225 = this.MediaMetadataCompat;
                int i331 = this.AudioAttributesImplApi21Parcelizer;
                iArr225[i331] = 1528;
                Object[] objArr60 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i331 + 2;
                objArr60[i331 + 1] = objArr60[8];
                return 0;
            case 292:
                int i332 = this.AudioAttributesImplApi21Parcelizer;
                int i333 = i332 - 1;
                Object[] objArr61 = this.onCustomAction;
                Object obj32 = objArr61[i333];
                objArr61[i333] = null;
                objArr61[11] = obj32;
                this.AudioAttributesImplApi21Parcelizer = i332;
                objArr61[i333] = objArr61[8];
                return 0;
            case 293:
                Object[] objArr62 = this.onCustomAction;
                int i334 = this.AudioAttributesImplApi21Parcelizer;
                objArr62[i334] = objArr62[11];
                int[] iArr226 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i334 + 2;
                iArr226[i334 + 1] = iArr226[10];
                return 0;
            case 294:
                Object[] objArr63 = this.onCustomAction;
                int i335 = this.AudioAttributesImplApi21Parcelizer;
                objArr63[i335] = objArr63[8];
                objArr63[i335 + 1] = objArr63[9];
                int[] iArr227 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i335 + 3;
                iArr227[i335 + 2] = 1528;
                return 0;
            case 295:
                int i336 = this.AudioAttributesImplApi21Parcelizer;
                int i337 = i336 - 1;
                Object[] objArr64 = this.onCustomAction;
                Object obj33 = objArr64[i337];
                objArr64[i337] = null;
                objArr64[11] = obj33;
                int[] iArr228 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i336;
                iArr228[i337] = 2;
                return 0;
            case 296:
                int[] iArr229 = this.MediaMetadataCompat;
                int i338 = this.AudioAttributesImplApi21Parcelizer;
                iArr229[i338] = 0;
                this.AudioAttributesImplApi21Parcelizer = i338 + 2;
                iArr229[i338 + 1] = 1527;
                return 0;
            case 297:
                int i339 = this.AudioAttributesImplApi21Parcelizer;
                int i340 = i339 - 3;
                this.AudioAttributesImplApi21Parcelizer = i340;
                Object[] objArr65 = this.onCustomAction;
                Object obj34 = objArr65[i340];
                objArr65[i340] = null;
                int i341 = this.MediaMetadataCompat[i339 - 2];
                Object obj35 = objArr65[i339 - 1];
                objArr65[i339 - 1] = null;
                ((Object[]) obj34)[i341] = obj35;
                this.AudioAttributesImplApi21Parcelizer = i339 - 2;
                objArr65[i340] = objArr65[10];
                return 0;
            case 298:
                int[] iArr230 = this.MediaMetadataCompat;
                int i342 = this.AudioAttributesImplApi21Parcelizer;
                iArr230[i342] = 1;
                Object[] objArr66 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i342 + 2;
                objArr66[i342 + 1] = objArr66[11];
                return 0;
            case 299:
                int[] iArr231 = this.MediaMetadataCompat;
                int i343 = this.AudioAttributesImplApi21Parcelizer;
                iArr231[i343] = 1527;
                Object[] objArr67 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i343 + 2;
                objArr67[i343 + 1] = objArr67[9];
                return 0;
            case 300:
                Object[] objArr68 = this.onCustomAction;
                int i344 = this.AudioAttributesImplApi21Parcelizer;
                objArr68[i344] = objArr68[8];
                int[] iArr232 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i344 + 2;
                iArr232[i344 + 1] = 2020;
                return 0;
            case 301:
                int[] iArr233 = this.MediaMetadataCompat;
                int i345 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i345 + 1;
                iArr233[i345] = 2020;
                return 0;
            case 302:
                Object[] objArr69 = this.onCustomAction;
                int i346 = this.AudioAttributesImplApi21Parcelizer;
                objArr69[i346] = objArr69[8];
                this.AudioAttributesImplApi21Parcelizer = i346 + 2;
                objArr69[i346 + 1] = objArr69[10];
                return 0;
            case 303:
                int[] iArr234 = this.MediaMetadataCompat;
                int i347 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i347 + 1;
                iArr234[i347] = 2021;
                return 0;
            case 304:
                int[] iArr235 = this.MediaMetadataCompat;
                int i348 = this.AudioAttributesImplApi21Parcelizer;
                iArr235[i348] = 115;
                this.AudioAttributesImplApi21Parcelizer = i348;
                iArr235[i348 - 1] = iArr235[i348 - 1] + iArr235[i348];
                return 0;
            case 305:
                Object[] objArr70 = this.onCustomAction;
                int i349 = this.AudioAttributesImplApi21Parcelizer;
                objArr70[i349] = objArr70[10];
                this.AudioAttributesImplApi21Parcelizer = i349 + 2;
                objArr70[i349 + 1] = objArr70[9];
                return 0;
            case 306:
                int[] iArr236 = this.MediaMetadataCompat;
                int i350 = this.AudioAttributesImplApi21Parcelizer;
                iArr236[i350] = 95;
                iArr236[i350 + 1] = 0;
                int i351 = i350 + 1;
                this.AudioAttributesImplApi21Parcelizer = i351;
                iArr236[i350] = iArr236[i350] / iArr236[i351];
                return 0;
            case 307:
                Object[] objArr71 = this.onCustomAction;
                int i352 = this.AudioAttributesImplApi21Parcelizer;
                objArr71[i352] = objArr71[i352 - 1];
                this.AudioAttributesImplApi21Parcelizer = i352;
                Object obj36 = objArr71[i352];
                objArr71[i352] = null;
                objArr71[9] = obj36;
                return 0;
            case 308:
                int[] iArr237 = this.MediaMetadataCompat;
                int i353 = this.AudioAttributesImplApi21Parcelizer;
                iArr237[i353] = 3;
                iArr237[i353 - 1] = iArr237[i353 - 1] + iArr237[i353];
                this.AudioAttributesImplApi21Parcelizer = i353 + 1;
                iArr237[i353] = iArr237[i353 - 1];
                return 0;
            case 309:
                int[] iArr238 = this.MediaMetadataCompat;
                int i354 = this.AudioAttributesImplApi21Parcelizer;
                iArr238[i354] = 111;
                iArr238[i354 - 1] = iArr238[i354 - 1] + iArr238[i354];
                this.AudioAttributesImplApi21Parcelizer = i354 + 1;
                iArr238[i354] = iArr238[i354 - 1];
                return 0;
            case 310:
                int[] iArr239 = this.MediaMetadataCompat;
                int i355 = this.AudioAttributesImplApi21Parcelizer;
                iArr239[i355] = 3;
                iArr239[i355 + 1] = 5;
                int i356 = i355 + 1;
                this.AudioAttributesImplApi21Parcelizer = i356;
                iArr239[i355] = iArr239[i355] >> iArr239[i356];
                return 0;
            case 311:
                int[] iArr240 = this.MediaMetadataCompat;
                int i357 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i357 + 1;
                iArr240[i357] = 88;
                return 0;
            case 312:
                int[] iArr241 = this.MediaMetadataCompat;
                int i358 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i358 + 1;
                iArr241[i358] = 113;
                return 0;
            case 313:
                int[] iArr242 = this.MediaMetadataCompat;
                int i359 = this.AudioAttributesImplApi21Parcelizer;
                iArr242[i359] = 39;
                this.AudioAttributesImplApi21Parcelizer = i359 + 2;
                iArr242[i359 + 1] = 0;
                return 0;
            case 314:
                int[] iArr243 = this.MediaMetadataCompat;
                int i360 = this.AudioAttributesImplApi21Parcelizer;
                iArr243[i360] = 13;
                iArr243[i360 - 1] = iArr243[i360 - 1] + iArr243[i360];
                this.AudioAttributesImplApi21Parcelizer = i360 + 1;
                iArr243[i360] = iArr243[i360 - 1];
                return 0;
            case 315:
                int[] iArr244 = this.MediaMetadataCompat;
                int i361 = this.AudioAttributesImplApi21Parcelizer;
                iArr244[i361] = iArr244[9];
                Object[] objArr72 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i361 + 2;
                objArr72[i361 + 1] = objArr72[10];
                return 0;
            case 316:
                int[] iArr245 = this.MediaMetadataCompat;
                int i362 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i362 + 1;
                iArr245[i362] = 101;
                return 0;
            case 317:
                int[] iArr246 = this.MediaMetadataCompat;
                int i363 = this.AudioAttributesImplApi21Parcelizer;
                iArr246[i363] = 85;
                this.AudioAttributesImplApi21Parcelizer = i363 + 2;
                iArr246[i363 + 1] = 0;
                return 0;
            case 318:
                int i364 = this.AudioAttributesImplApi21Parcelizer;
                int i365 = i364 - 1;
                int[] iArr247 = this.MediaMetadataCompat;
                iArr247[9] = iArr247[i365];
                Object[] objArr73 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i364;
                objArr73[i365] = objArr73[10];
                return 0;
            case 319:
                Object[] objArr74 = this.onCustomAction;
                int i366 = this.AudioAttributesImplApi21Parcelizer;
                objArr74[i366] = objArr74[10];
                int[] iArr248 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i366 + 2;
                iArr248[i366 + 1] = iArr248[9];
                return 0;
            case 320:
                int[] iArr249 = this.MediaMetadataCompat;
                int i367 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i367 + 1;
                iArr249[i367] = 26;
                return 0;
            case 321:
                int[] iArr250 = this.MediaMetadataCompat;
                int i368 = this.AudioAttributesImplApi21Parcelizer;
                iArr250[i368] = 13;
                this.AudioAttributesImplApi21Parcelizer = i368;
                iArr250[i368 - 1] = iArr250[i368 - 1] + iArr250[i368];
                return 0;
            case 322:
                int[] iArr251 = this.MediaMetadataCompat;
                int i369 = this.AudioAttributesImplApi21Parcelizer;
                iArr251[i369] = 70;
                this.AudioAttributesImplApi21Parcelizer = i369 + 2;
                iArr251[i369 + 1] = 0;
                return 0;
            case 323:
                int[] iArr252 = this.MediaMetadataCompat;
                int i370 = this.AudioAttributesImplApi21Parcelizer;
                iArr252[i370] = 17;
                iArr252[i370 - 1] = iArr252[i370 - 1] + iArr252[i370];
                this.AudioAttributesImplApi21Parcelizer = i370 + 1;
                iArr252[i370] = iArr252[i370 - 1];
                return 0;
            case 324:
                int[] iArr253 = this.MediaMetadataCompat;
                int i371 = this.AudioAttributesImplApi21Parcelizer;
                iArr253[i371] = 25;
                iArr253[i371 - 1] = iArr253[i371 - 1] + iArr253[i371];
                this.AudioAttributesImplApi21Parcelizer = i371 + 1;
                iArr253[i371] = iArr253[i371 - 1];
                return 0;
            case 325:
                int i372 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i372;
                Object[] objArr75 = this.onCustomAction;
                Object obj37 = objArr75[i372];
                objArr75[i372] = null;
                objArr75[8] = obj37;
                return 0;
            case 326:
                Object[] objArr76 = this.onCustomAction;
                int i373 = this.AudioAttributesImplApi21Parcelizer;
                objArr76[i373] = objArr76[10];
                objArr76[i373 + 1] = objArr76[9];
                this.AudioAttributesImplApi21Parcelizer = i373 + 3;
                objArr76[i373 + 2] = objArr76[8];
                return 0;
            case 327:
                int[] iArr254 = this.MediaMetadataCompat;
                int i374 = this.AudioAttributesImplApi21Parcelizer;
                iArr254[i374] = 103;
                iArr254[i374 - 1] = iArr254[i374 - 1] + iArr254[i374];
                this.AudioAttributesImplApi21Parcelizer = i374 + 1;
                iArr254[i374] = iArr254[i374 - 1];
                return 0;
            case 328:
                int i375 = this.AudioAttributesImplApi21Parcelizer;
                int i376 = i375 - 1;
                Object[] objArr77 = this.onCustomAction;
                Object obj38 = objArr77[i376];
                objArr77[i376] = null;
                objArr77[12] = obj38;
                this.AudioAttributesImplApi21Parcelizer = i375;
                objArr77[i376] = objArr77[11];
                return 0;
            case 329:
                int i377 = this.AudioAttributesImplApi21Parcelizer;
                int i378 = i377 - 2;
                this.AudioAttributesImplApi21Parcelizer = i378;
                Object[] objArr78 = this.onCustomAction;
                Object obj39 = objArr78[i378];
                objArr78[i378] = null;
                Object obj40 = objArr78[i377 - 1];
                objArr78[i377 - 1] = null;
                this.RemoteActionCompatParcelizer = obj39 == obj40 ? 0 : 1;
                return 0;
            case 330:
                int i379 = this.AudioAttributesImplApi21Parcelizer;
                int i380 = i379 - 1;
                Object[] objArr79 = this.onCustomAction;
                Object obj41 = objArr79[i380];
                objArr79[i380] = null;
                objArr79[13] = obj41;
                objArr79[i380] = objArr79[12];
                this.AudioAttributesImplApi21Parcelizer = i379 + 1;
                objArr79[i379] = objArr79[11];
                return 0;
            case 331:
                long[] jArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i381 = this.AudioAttributesImplApi21Parcelizer;
                jArr10[i381] = jArr10[9];
                Object[] objArr80 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i381 + 2;
                objArr80[i381 + 1] = objArr80[13];
                return 0;
            case 332:
                int[] iArr255 = this.MediaMetadataCompat;
                int i382 = this.AudioAttributesImplApi21Parcelizer;
                iArr255[i382] = 19;
                iArr255[i382 - 1] = iArr255[i382 - 1] + iArr255[i382];
                this.AudioAttributesImplApi21Parcelizer = i382 + 1;
                iArr255[i382] = iArr255[i382 - 1];
                return 0;
            case 333:
                int[] iArr256 = this.MediaMetadataCompat;
                int i383 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i383 + 1;
                iArr256[i383] = 55;
                return 0;
            case 334:
                int[] iArr257 = this.MediaMetadataCompat;
                int i384 = this.AudioAttributesImplApi21Parcelizer;
                iArr257[i384] = 51;
                iArr257[i384 - 1] = iArr257[i384 - 1] + iArr257[i384];
                this.AudioAttributesImplApi21Parcelizer = i384 + 1;
                iArr257[i384] = iArr257[i384 - 1];
                return 0;
            case 335:
                int i385 = this.AudioAttributesImplApi21Parcelizer;
                int i386 = i385 - 1;
                Object[] objArr81 = this.onCustomAction;
                Object obj42 = objArr81[i386];
                objArr81[i386] = null;
                objArr81[11] = obj42;
                this.AudioAttributesImplApi21Parcelizer = i385;
                objArr81[i386] = objArr81[10];
                return 0;
            case 336:
                Object[] objArr82 = this.onCustomAction;
                int i387 = this.AudioAttributesImplApi21Parcelizer;
                objArr82[i387] = objArr82[9];
                this.AudioAttributesImplApi21Parcelizer = i387 + 2;
                objArr82[i387 + 1] = objArr82[11];
                return 0;
            case 337:
                int[] iArr258 = this.MediaMetadataCompat;
                int i388 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i388 + 1;
                iArr258[i388] = 35;
                return 0;
            case 338:
                int i389 = this.AudioAttributesImplApi21Parcelizer;
                int i390 = i389 - 1;
                Object[] objArr83 = this.onCustomAction;
                Object obj43 = objArr83[i390];
                objArr83[i390] = null;
                objArr83[12] = obj43;
                this.AudioAttributesImplApi21Parcelizer = i389;
                objArr83[i390] = objArr83[10];
                return 0;
            case 339:
                Object[] objArr84 = this.onCustomAction;
                int i391 = this.AudioAttributesImplApi21Parcelizer;
                objArr84[i391] = objArr84[11];
                this.AudioAttributesImplApi21Parcelizer = i391 + 2;
                objArr84[i391 + 1] = objArr84[12];
                return 0;
            case 340:
                int[] iArr259 = this.MediaMetadataCompat;
                int i392 = this.AudioAttributesImplApi21Parcelizer;
                iArr259[i392] = 57;
                this.AudioAttributesImplApi21Parcelizer = i392;
                iArr259[i392 - 1] = iArr259[i392 - 1] + iArr259[i392];
                return 0;
            case 341:
                int[] iArr260 = this.MediaMetadataCompat;
                int i393 = this.AudioAttributesImplApi21Parcelizer;
                iArr260[i393] = 5;
                iArr260[i393 + 1] = 4;
                int i394 = i393 + 1;
                this.AudioAttributesImplApi21Parcelizer = i394;
                iArr260[i393] = iArr260[i393] >>> iArr260[i394];
                return 0;
            case 342:
                int i395 = this.AudioAttributesImplApi21Parcelizer;
                int i396 = i395 - 1;
                Object[] objArr85 = this.onCustomAction;
                objArr85[i396] = null;
                objArr85[i396] = objArr85[10];
                this.AudioAttributesImplApi21Parcelizer = i395 + 1;
                objArr85[i395] = objArr85[11];
                return 0;
            case 343:
                int i397 = this.AudioAttributesImplApi21Parcelizer;
                int i398 = i397 - 1;
                Object[] objArr86 = this.onCustomAction;
                objArr86[i398] = null;
                this.AudioAttributesImplApi21Parcelizer = i397;
                objArr86[i398] = objArr86[10];
                return 0;
            case 344:
                int i399 = this.AudioAttributesImplApi21Parcelizer;
                int i400 = i399 - 1;
                Object[] objArr87 = this.onCustomAction;
                Object obj44 = objArr87[i400];
                objArr87[i400] = null;
                objArr87[10] = obj44;
                this.AudioAttributesImplApi21Parcelizer = i399;
                objArr87[i400] = objArr87[11];
                return 0;
            case 345:
                Object[] objArr88 = this.onCustomAction;
                int i401 = this.AudioAttributesImplApi21Parcelizer;
                objArr88[i401] = objArr88[9];
                int[] iArr261 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i401 + 2;
                iArr261[i401 + 1] = iArr261[10];
                return 0;
            case 346:
                int i402 = this.AudioAttributesImplApi21Parcelizer;
                int i403 = i402 - 1;
                Object[] objArr89 = this.onCustomAction;
                objArr89[i403] = null;
                objArr89[i403] = objArr89[8];
                this.AudioAttributesImplApi21Parcelizer = i402 + 1;
                objArr89[i402] = objArr89[9];
                return 0;
            case 347:
                int i404 = this.AudioAttributesImplApi21Parcelizer;
                int i405 = i404 - 1;
                Object[] objArr90 = this.onCustomAction;
                objArr90[i405] = null;
                this.AudioAttributesImplApi21Parcelizer = i404;
                objArr90[i405] = objArr90[11];
                return 0;
            case 348:
                int[] iArr262 = this.MediaMetadataCompat;
                int i406 = this.AudioAttributesImplApi21Parcelizer;
                iArr262[i406] = 11;
                this.AudioAttributesImplApi21Parcelizer = i406;
                iArr262[i406 - 1] = iArr262[i406 - 1] + iArr262[i406];
                return 0;
            case 349:
                int i407 = this.AudioAttributesImplApi21Parcelizer;
                int i408 = i407 - 1;
                Object[] objArr91 = this.onCustomAction;
                Object obj45 = objArr91[i408];
                objArr91[i408] = null;
                objArr91[10] = obj45;
                objArr91[i408] = objArr91[9];
                this.AudioAttributesImplApi21Parcelizer = i407 + 1;
                objArr91[i407] = objArr91[10];
                return 0;
            case 350:
                int[] iArr263 = this.MediaMetadataCompat;
                int i409 = this.AudioAttributesImplApi21Parcelizer;
                iArr263[i409] = 31;
                iArr263[i409 - 1] = iArr263[i409 - 1] + iArr263[i409];
                this.AudioAttributesImplApi21Parcelizer = i409 + 1;
                iArr263[i409] = iArr263[i409 - 1];
                return 0;
            case 351:
                Object[] objArr92 = this.onCustomAction;
                int i410 = this.AudioAttributesImplApi21Parcelizer;
                objArr92[i410] = objArr92[8];
                int[] iArr264 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i410 + 2;
                iArr264[i410 + 1] = 0;
                return 0;
            case 352:
                int[] iArr265 = this.MediaMetadataCompat;
                int i411 = this.AudioAttributesImplApi21Parcelizer;
                iArr265[i411] = 1;
                iArr265[i411 - 1] = iArr265[i411 - 1] + iArr265[i411];
                this.AudioAttributesImplApi21Parcelizer = i411 + 1;
                iArr265[i411] = iArr265[i411 - 1];
                return 0;
            case 353:
                long[] jArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i412 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i412 + 1;
                jArr11[i412] = 0;
                return 0;
            case 354:
                int i413 = this.AudioAttributesImplApi21Parcelizer;
                int i414 = i413 - 1;
                this.AudioAttributesImplApi21Parcelizer = i414;
                int[] iArr266 = this.MediaMetadataCompat;
                iArr266[i413 - 2] = iArr266[i413 - 2] + iArr266[i414];
                iArr266[i413 - 2] = (char) iArr266[i413 - 2];
                return 0;
            case 355:
                int i415 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i415;
                Object[] objArr93 = this.onCustomAction;
                Object obj46 = objArr93[i415];
                objArr93[i415] = null;
                objArr93[80] = obj46;
                return 0;
            case 356:
                int i416 = this.AudioAttributesImplApi21Parcelizer;
                int i417 = i416 - 1;
                this.AudioAttributesImplApi21Parcelizer = i417;
                int[] iArr267 = this.MediaMetadataCompat;
                iArr267[i416 - 2] = iArr267[i416 - 2] - iArr267[i417];
                return 0;
            case 357:
                int[] iArr268 = this.MediaMetadataCompat;
                int i418 = this.AudioAttributesImplApi21Parcelizer;
                iArr268[i418] = 16;
                iArr268[i418 - 1] = iArr268[i418 - 1] >> iArr268[i418];
                int i419 = i418 - 1;
                this.AudioAttributesImplApi21Parcelizer = i419;
                iArr268[i418 - 2] = iArr268[i418 - 2] - iArr268[i419];
                return 0;
            case 358:
                int[] iArr269 = this.MediaMetadataCompat;
                int i420 = this.AudioAttributesImplApi21Parcelizer;
                iArr269[i420 - 1] = (char) iArr269[i420 - 1];
                return 0;
            case 359:
                int i421 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i421;
                Object[] objArr94 = this.onCustomAction;
                Object obj47 = objArr94[i421];
                objArr94[i421] = null;
                objArr94[81] = obj47;
                return 0;
            case 360:
                int i422 = this.AudioAttributesImplApi21Parcelizer;
                int i423 = i422 - 1;
                this.AudioAttributesImplApi21Parcelizer = i423;
                int[] iArr270 = this.MediaMetadataCompat;
                iArr270[i422 - 2] = iArr270[i422 - 2] - iArr270[i423];
                iArr270[i422 - 2] = (char) iArr270[i422 - 2];
                return 0;
            case 361:
                int i424 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i424;
                Object[] objArr95 = this.onCustomAction;
                Object obj48 = objArr95[i424];
                objArr95[i424] = null;
                objArr95[82] = obj48;
                return 0;
            case 362:
                int[] iArr271 = this.MediaMetadataCompat;
                int i425 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i425 + 1;
                iArr271[i425] = 18902;
                return 0;
            case 363:
                float[] fArr4 = this.RatingCompat;
                int i426 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i426 + 1;
                fArr4[i426] = 0.0f;
                return 0;
            case 364:
                int i427 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i427;
                Object[] objArr96 = this.onCustomAction;
                Object obj49 = objArr96[i427];
                objArr96[i427] = null;
                objArr96[83] = obj49;
                return 0;
            case 365:
                Object[] objArr97 = this.onCustomAction;
                int i428 = this.AudioAttributesImplApi21Parcelizer;
                objArr97[i428] = objArr97[8];
                this.AudioAttributesImplApi21Parcelizer = i428;
                Object obj50 = objArr97[i428];
                objArr97[i428] = null;
                objArr97[14] = obj50;
                return 0;
            case 366:
                int i429 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i429;
                long[] jArr12 = this.MediaBrowserCompatSearchResultReceiver;
                jArr12[10] = jArr12[i429];
                return 0;
            case 367:
                Object[] objArr98 = this.onCustomAction;
                int i430 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i430 + 1;
                objArr98[i430] = objArr98[80];
                return 0;
            case 368:
                Object[] objArr99 = this.onCustomAction;
                int i431 = this.AudioAttributesImplApi21Parcelizer;
                objArr99[i431] = objArr99[81];
                int[] iArr272 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i431 + 2;
                iArr272[i431 + 1] = 0;
                return 0;
            case 369:
                int[] iArr273 = this.MediaMetadataCompat;
                int i432 = this.AudioAttributesImplApi21Parcelizer;
                iArr273[i432] = 52;
                this.AudioAttributesImplApi21Parcelizer = i432;
                long[] jArr13 = this.MediaBrowserCompatSearchResultReceiver;
                jArr13[i432 - 1] = jArr13[i432 - 1] << iArr273[i432];
                return 0;
            case 370:
                int[] iArr274 = this.MediaMetadataCompat;
                int i433 = this.AudioAttributesImplApi21Parcelizer;
                iArr274[i433] = 52;
                this.AudioAttributesImplApi21Parcelizer = i433;
                long[] jArr14 = this.MediaBrowserCompatSearchResultReceiver;
                jArr14[i433 - 1] = jArr14[i433 - 1] >>> iArr274[i433];
                return 0;
            case 371:
                int i434 = this.AudioAttributesImplApi21Parcelizer;
                int i435 = i434 - 1;
                long[] jArr15 = this.MediaBrowserCompatSearchResultReceiver;
                jArr15[i434 - 2] = jArr15[i434 - 2] - jArr15[i435];
                int[] iArr275 = this.MediaMetadataCompat;
                iArr275[i435] = 12;
                int i436 = i434 - 1;
                this.AudioAttributesImplApi21Parcelizer = i436;
                jArr15[i434 - 2] = jArr15[i434 - 2] >> iArr275[i436];
                return 0;
            case 372:
                int i437 = this.AudioAttributesImplApi21Parcelizer;
                int i438 = i437 - 1;
                long[] jArr16 = this.MediaBrowserCompatSearchResultReceiver;
                jArr16[12] = jArr16[i438];
                jArr16[i438] = jArr16[10];
                this.AudioAttributesImplApi21Parcelizer = i437 + 1;
                jArr16[i437] = jArr16[12];
                return 0;
            case 373:
                Object[] objArr100 = this.onCustomAction;
                int i439 = this.AudioAttributesImplApi21Parcelizer;
                objArr100[i439] = objArr100[i439 - 1];
                int[] iArr276 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i439 + 2;
                iArr276[i439 + 1] = 0;
                return 0;
            case 374:
                int[] iArr277 = this.MediaMetadataCompat;
                int i440 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i440 + 1;
                iArr277[i440] = 1;
                this.onCustomAction[i440] = new int[iArr277[i440]];
                return 0;
            case 375:
                Object[] objArr101 = this.onCustomAction;
                int i441 = this.AudioAttributesImplApi21Parcelizer;
                objArr101[i441] = objArr101[i441 - 1];
                int[] iArr278 = this.MediaMetadataCompat;
                iArr278[i441 + 1] = 1;
                this.AudioAttributesImplApi21Parcelizer = i441 + 3;
                iArr278[i441 + 2] = 1;
                return 0;
            case 376:
                Object[] objArr102 = this.onCustomAction;
                int i442 = this.AudioAttributesImplApi21Parcelizer;
                objArr102[i442 - 1] = new int[this.MediaMetadataCompat[i442 - 1]];
                return 0;
            case 377:
                Object[] objArr103 = this.onCustomAction;
                int i443 = this.AudioAttributesImplApi21Parcelizer;
                objArr103[i443] = objArr103[i443 - 1];
                int[] iArr279 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i443 + 2;
                iArr279[i443 + 1] = 2;
                return 0;
            case 378:
                Object[] objArr104 = this.onCustomAction;
                int i444 = this.AudioAttributesImplApi21Parcelizer;
                objArr104[i444] = objArr104[i444 - 1];
                this.AudioAttributesImplApi21Parcelizer = i444 + 2;
                objArr104[i444 + 1] = objArr104[9];
                return 0;
            case 379:
                int i445 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr280 = this.MediaMetadataCompat;
                iArr280[50] = iArr280[i445 - 1];
                int i446 = i445 - 2;
                this.AudioAttributesImplApi21Parcelizer = i446;
                iArr280[49] = iArr280[i446];
                return 0;
            case 380:
                int i447 = this.AudioAttributesImplApi21Parcelizer;
                int i448 = i447 - 1;
                Object[] objArr105 = this.onCustomAction;
                Object obj51 = objArr105[i448];
                objArr105[i448] = null;
                objArr105[48] = obj51;
                int i449 = i447 - 2;
                this.AudioAttributesImplApi21Parcelizer = i449;
                Object obj52 = objArr105[i449];
                objArr105[i449] = null;
                objArr105[47] = obj52;
                return 0;
            case 381:
                Object[] objArr106 = this.onCustomAction;
                int i450 = this.AudioAttributesImplApi21Parcelizer;
                objArr106[i450] = objArr106[47];
                this.AudioAttributesImplApi21Parcelizer = i450 + 2;
                objArr106[i450 + 1] = objArr106[48];
                return 0;
            case 382:
                int[] iArr281 = this.MediaMetadataCompat;
                int i451 = this.AudioAttributesImplApi21Parcelizer;
                iArr281[i451] = 0;
                this.AudioAttributesImplApi21Parcelizer = i451;
                Object[] objArr107 = this.onCustomAction;
                Object obj53 = objArr107[i451 - 1];
                objArr107[i451 - 1] = null;
                objArr107[i451 - 1] = ((Object[]) obj53)[iArr281[i451]];
                return 0;
            case 383:
                int i452 = this.AudioAttributesImplApi21Parcelizer;
                int i453 = i452 - 1;
                this.AudioAttributesImplApi21Parcelizer = i453;
                int[] iArr282 = this.MediaMetadataCompat;
                Object[] objArr108 = this.onCustomAction;
                Object obj54 = objArr108[i452 - 2];
                objArr108[i452 - 2] = null;
                iArr282[i452 - 2] = ((int[]) obj54)[iArr282[i453]];
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                Object[] objArr109 = this.onCustomAction;
                int i454 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i454 + 1;
                objArr109[i454] = objArr109[48];
                return 0;
            case 385:
                int i455 = this.AudioAttributesImplApi21Parcelizer;
                int i456 = i455 - 1;
                this.AudioAttributesImplApi21Parcelizer = i456;
                Object[] objArr110 = this.onCustomAction;
                Object obj55 = objArr110[i455 - 2];
                objArr110[i455 - 2] = null;
                objArr110[i455 - 2] = ((Object[]) obj55)[this.MediaMetadataCompat[i456]];
                return 0;
            case 386:
                int[] iArr283 = this.MediaMetadataCompat;
                int i457 = this.AudioAttributesImplApi21Parcelizer;
                iArr283[i457] = iArr283[49];
                iArr283[i457 + 1] = iArr283[50];
                Object[] objArr111 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i457 + 3;
                objArr111[i457 + 2] = objArr111[48];
                return 0;
            case 387:
                int[] iArr284 = this.MediaMetadataCompat;
                int i458 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i458 + 1;
                iArr284[i458] = 3;
                return 0;
            case 388:
                int i459 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i459;
                Object[] objArr112 = this.onCustomAction;
                Object obj56 = objArr112[i459];
                objArr112[i459] = null;
                objArr112[56] = obj56;
                return 0;
            case 389:
                int i460 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i460;
                int[] iArr285 = this.MediaMetadataCompat;
                iArr285[55] = iArr285[i460];
                return 0;
            case 390:
                int i461 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i461;
                int[] iArr286 = this.MediaMetadataCompat;
                iArr286[54] = iArr286[i461];
                return 0;
            case 391:
                int i462 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr287 = this.MediaMetadataCompat;
                iArr287[53] = iArr287[i462 - 1];
                int i463 = i462 - 2;
                this.AudioAttributesImplApi21Parcelizer = i463;
                iArr287[52] = iArr287[i463];
                return 0;
            case 392:
                int i464 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i464;
                Object[] objArr113 = this.onCustomAction;
                Object obj57 = objArr113[i464];
                objArr113[i464] = null;
                objArr113[51] = obj57;
                return 0;
            case 393:
                Object[] objArr114 = this.onCustomAction;
                int i465 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i465 + 1;
                objArr114[i465] = objArr114[51];
                return 0;
            case 394:
                int i466 = this.AudioAttributesImplApi21Parcelizer;
                int i467 = i466 - 1;
                Object[] objArr115 = this.onCustomAction;
                objArr115[i467] = null;
                this.AudioAttributesImplApi21Parcelizer = i466;
                objArr115[i467] = objArr115[51];
                return 0;
            case 395:
                int[] iArr288 = this.MediaMetadataCompat;
                int i468 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i468 + 1;
                iArr288[i468] = iArr288[52];
                return 0;
            case 396:
                Object[] objArr116 = this.onCustomAction;
                int i469 = this.AudioAttributesImplApi21Parcelizer;
                Object obj58 = objArr116[i469 - 2];
                objArr116[i469 - 2] = null;
                objArr116[i469 - 1] = obj58;
                int[] iArr289 = this.MediaMetadataCompat;
                iArr289[i469 - 2] = iArr289[i469 - 1];
                this.AudioAttributesImplApi21Parcelizer = i469 + 1;
                iArr289[i469] = 0;
                return 0;
            case 397:
                int[] iArr290 = this.MediaMetadataCompat;
                int i470 = this.AudioAttributesImplApi21Parcelizer;
                iArr290[i470 - 1] = iArr290[i470 - 2];
                Object[] objArr117 = this.onCustomAction;
                Object obj59 = objArr117[i470 - 1];
                objArr117[i470 - 1] = null;
                objArr117[i470 - 2] = obj59;
                return 0;
            case 398:
                int[] iArr291 = this.MediaMetadataCompat;
                int i471 = this.AudioAttributesImplApi21Parcelizer;
                int i472 = iArr291[i471 - 1];
                iArr291[i471 - 1] = iArr291[i471 - 2];
                iArr291[i471 - 2] = i472;
                int i473 = i471 - 3;
                this.AudioAttributesImplApi21Parcelizer = i473;
                Object[] objArr118 = this.onCustomAction;
                Object obj60 = objArr118[i473];
                objArr118[i473] = null;
                ((int[]) obj60)[iArr291[i471 - 2]] = iArr291[i471 - 1];
                this.AudioAttributesImplApi21Parcelizer = i471 - 2;
                objArr118[i473] = objArr118[51];
                return 0;
            case 399:
                int[] iArr292 = this.MediaMetadataCompat;
                int i474 = this.AudioAttributesImplApi21Parcelizer;
                iArr292[i474] = iArr292[53];
                Object[] objArr119 = this.onCustomAction;
                Object obj61 = objArr119[i474 - 1];
                objArr119[i474 - 1] = null;
                objArr119[i474] = obj61;
                iArr292[i474 - 1] = iArr292[i474];
                this.AudioAttributesImplApi21Parcelizer = i474 + 2;
                iArr292[i474 + 1] = 2;
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                int[] iArr293 = this.MediaMetadataCompat;
                int i475 = this.AudioAttributesImplApi21Parcelizer;
                iArr293[i475 - 1] = iArr293[i475 - 2];
                Object[] objArr120 = this.onCustomAction;
                Object obj62 = objArr120[i475 - 1];
                objArr120[i475 - 1] = null;
                objArr120[i475 - 2] = obj62;
                this.AudioAttributesImplApi21Parcelizer = i475 + 1;
                iArr293[i475] = 0;
                int i476 = iArr293[i475];
                iArr293[i475] = iArr293[i475 - 1];
                iArr293[i475 - 1] = i476;
                return 0;
            case 401:
                int i477 = this.AudioAttributesImplApi21Parcelizer;
                int i478 = i477 - 3;
                this.AudioAttributesImplApi21Parcelizer = i478;
                Object[] objArr121 = this.onCustomAction;
                Object obj63 = objArr121[i478];
                objArr121[i478] = null;
                int[] iArr294 = this.MediaMetadataCompat;
                ((int[]) obj63)[iArr294[i477 - 2]] = iArr294[i477 - 1];
                objArr121[i478] = objArr121[51];
                this.AudioAttributesImplApi21Parcelizer = i477 - 1;
                objArr121[i477 - 2] = objArr121[56];
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                Object[] objArr122 = this.onCustomAction;
                int i479 = this.AudioAttributesImplApi21Parcelizer;
                Object obj64 = objArr122[i479 - 2];
                objArr122[i479 - 2] = null;
                objArr122[i479 - 1] = obj64;
                int[] iArr295 = this.MediaMetadataCompat;
                iArr295[i479 - 2] = iArr295[i479 - 1];
                return 0;
            case 403:
                int i480 = this.AudioAttributesImplApi21Parcelizer;
                int i481 = i480 - 3;
                this.AudioAttributesImplApi21Parcelizer = i481;
                Object[] objArr123 = this.onCustomAction;
                Object obj65 = objArr123[i481];
                objArr123[i481] = null;
                int[] iArr296 = this.MediaMetadataCompat;
                int i482 = iArr296[i480 - 2];
                Object obj66 = objArr123[i480 - 1];
                objArr123[i480 - 1] = null;
                ((Object[]) obj65)[i482] = obj66;
                objArr123[i481] = objArr123[51];
                this.AudioAttributesImplApi21Parcelizer = i480 - 1;
                iArr296[i480 - 2] = iArr296[54];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                int[] iArr297 = this.MediaMetadataCompat;
                int i483 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i483 + 1;
                iArr297[i483] = iArr297[55];
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                int i484 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr298 = this.MediaMetadataCompat;
                iArr298[54] = iArr298[i484 - 1];
                int i485 = i484 - 2;
                this.AudioAttributesImplApi21Parcelizer = i485;
                iArr298[53] = iArr298[i485];
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                int[] iArr299 = this.MediaMetadataCompat;
                int i486 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i486 + 1;
                iArr299[i486] = iArr299[54];
                return 0;
            case 407:
                int[] iArr300 = this.MediaMetadataCompat;
                int i487 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i487 + 1;
                iArr300[i487] = iArr300[53];
                return 0;
            case 408:
                int[] iArr301 = this.MediaMetadataCompat;
                int i488 = this.AudioAttributesImplApi21Parcelizer;
                iArr301[i488] = iArr301[i488 - 1];
                this.AudioAttributesImplApi21Parcelizer = i488 + 2;
                iArr301[i488 + 1] = 13;
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                int i489 = this.AudioAttributesImplApi21Parcelizer;
                int i490 = i489 - 1;
                this.AudioAttributesImplApi21Parcelizer = i490;
                int[] iArr302 = this.MediaMetadataCompat;
                iArr302[i489 - 2] = iArr302[i489 - 2] << iArr302[i490];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                int i491 = this.AudioAttributesImplApi21Parcelizer;
                int i492 = i491 - 1;
                int[] iArr303 = this.MediaMetadataCompat;
                iArr303[i491 - 2] = iArr303[i491 - 2] ^ iArr303[i492];
                iArr303[i492] = iArr303[i491 - 2];
                this.AudioAttributesImplApi21Parcelizer = i491 + 1;
                iArr303[i491] = 17;
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                int i493 = this.AudioAttributesImplApi21Parcelizer;
                int i494 = i493 - 1;
                this.AudioAttributesImplApi21Parcelizer = i494;
                int[] iArr304 = this.MediaMetadataCompat;
                iArr304[i493 - 2] = iArr304[i493 - 2] >>> iArr304[i494];
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int i495 = this.AudioAttributesImplApi21Parcelizer;
                int i496 = i495 - 1;
                int[] iArr305 = this.MediaMetadataCompat;
                iArr305[i495 - 2] = iArr305[i495 - 2] ^ iArr305[i496];
                this.AudioAttributesImplApi21Parcelizer = i495;
                iArr305[i496] = iArr305[i495 - 2];
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                int[] iArr306 = this.MediaMetadataCompat;
                int i497 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i497 + 1;
                iArr306[i497] = 5;
                return 0;
            case 414:
                int i498 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr307 = this.MediaMetadataCompat;
                iArr307[i498 - 2] = iArr307[i498 - 2] << iArr307[i498 - 1];
                int i499 = i498 - 2;
                this.AudioAttributesImplApi21Parcelizer = i499;
                iArr307[i498 - 3] = iArr307[i499] ^ iArr307[i498 - 3];
                Object[] objArr124 = this.onCustomAction;
                Object obj67 = objArr124[i498 - 4];
                objArr124[i498 - 4] = null;
                objArr124[i498 - 3] = obj67;
                iArr307[i498 - 4] = iArr307[i498 - 3];
                return 0;
            case 415:
                int[] iArr308 = this.MediaMetadataCompat;
                int i500 = this.AudioAttributesImplApi21Parcelizer;
                int i501 = iArr308[i500 - 1];
                iArr308[i500 - 1] = iArr308[i500 - 2];
                iArr308[i500 - 2] = i501;
                int i502 = i500 - 3;
                this.AudioAttributesImplApi21Parcelizer = i502;
                Object[] objArr125 = this.onCustomAction;
                Object obj68 = objArr125[i502];
                objArr125[i502] = null;
                ((int[]) obj68)[iArr308[i500 - 2]] = iArr308[i500 - 1];
                int i503 = i500 - 4;
                this.AudioAttributesImplApi21Parcelizer = i503;
                Object obj69 = objArr125[i503];
                objArr125[i503] = null;
                objArr125[9] = obj69;
                return 0;
            case 416:
                int[] iArr309 = this.MediaMetadataCompat;
                int i504 = this.AudioAttributesImplApi21Parcelizer;
                iArr309[i504] = 8;
                this.AudioAttributesImplApi21Parcelizer = i504;
                iArr309[i504 - 1] = iArr309[i504 - 1] >> iArr309[i504];
                return 0;
            case 417:
                int[] iArr310 = this.MediaMetadataCompat;
                int i505 = this.AudioAttributesImplApi21Parcelizer;
                iArr310[i505] = 48;
                this.AudioAttributesImplApi21Parcelizer = i505 + 2;
                iArr310[i505 + 1] = 0;
                return 0;
            case 418:
                float[] fArr5 = this.RatingCompat;
                int i506 = this.AudioAttributesImplApi21Parcelizer;
                fArr5[i506] = 0.0f;
                int[] iArr311 = this.MediaMetadataCompat;
                iArr311[i506 - 1] = (fArr5[i506 - 1] > fArr5[i506] ? 1 : (fArr5[i506 - 1] == fArr5[i506] ? 0 : -1));
                int i507 = i506 - 1;
                this.AudioAttributesImplApi21Parcelizer = i507;
                iArr311[i506 - 2] = iArr311[i506 - 2] + iArr311[i507];
                return 0;
            case 419:
                int[] iArr312 = this.MediaMetadataCompat;
                int i508 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i508 + 1;
                iArr312[i508] = 9357;
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                Object[] objArr126 = this.onCustomAction;
                int i509 = this.AudioAttributesImplApi21Parcelizer;
                objArr126[i509] = null;
                int[] iArr313 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i509 + 2;
                iArr313[i509 + 1] = 0;
                return 0;
            case 421:
                long[] jArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i510 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i510 + 1;
                jArr17[i510] = jArr17[i510 - 1];
                return 0;
            case 422:
                int[] iArr314 = this.MediaMetadataCompat;
                int i511 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i511 + 1;
                iArr314[i511] = 12;
                return 0;
            case 423:
                int i512 = this.AudioAttributesImplApi21Parcelizer;
                int i513 = i512 - 1;
                this.AudioAttributesImplApi21Parcelizer = i513;
                long[] jArr18 = this.MediaBrowserCompatSearchResultReceiver;
                jArr18[i512 - 2] = jArr18[i512 - 2] >> this.MediaMetadataCompat[i513];
                return 0;
            case 424:
                Object[] objArr127 = this.onCustomAction;
                int i514 = this.AudioAttributesImplApi21Parcelizer;
                objArr127[i514] = objArr127[9];
                Object obj70 = objArr127[i514];
                objArr127[i514] = null;
                objArr127[57] = obj70;
                this.AudioAttributesImplApi21Parcelizer = i514 + 1;
                objArr127[i514] = obj70;
                return 0;
            case 425:
                int i515 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i515;
                int[] iArr315 = this.MediaMetadataCompat;
                iArr315[11] = iArr315[i515];
                return 0;
            case 426:
                int i516 = this.AudioAttributesImplApi21Parcelizer;
                int i517 = i516 - 1;
                Object[] objArr128 = this.onCustomAction;
                Object obj71 = objArr128[i517];
                objArr128[i517] = null;
                objArr128[57] = obj71;
                this.AudioAttributesImplApi21Parcelizer = i516;
                objArr128[i517] = obj71;
                return 0;
            case 427:
                int[] iArr316 = this.MediaMetadataCompat;
                int i518 = this.AudioAttributesImplApi21Parcelizer;
                iArr316[i518] = 0;
                this.AudioAttributesImplApi21Parcelizer = i518;
                Object[] objArr129 = this.onCustomAction;
                Object obj72 = objArr129[i518 - 1];
                objArr129[i518 - 1] = null;
                iArr316[i518 - 1] = ((int[]) obj72)[iArr316[i518]];
                return 0;
            case 428:
                int[] iArr317 = this.MediaMetadataCompat;
                int i519 = this.AudioAttributesImplApi21Parcelizer;
                iArr317[i519] = 0;
                this.AudioAttributesImplApi21Parcelizer = i519 + 2;
                iArr317[i519 + 1] = 1;
                return 0;
            case 429:
                int[] iArr318 = this.MediaMetadataCompat;
                int i520 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i520 + 1;
                iArr318[i520] = 1;
                Object[] objArr130 = this.onCustomAction;
                objArr130[i520] = new int[iArr318[i520]];
                int i521 = i520 - 2;
                this.AudioAttributesImplApi21Parcelizer = i521;
                Object obj73 = objArr130[i521];
                objArr130[i521] = null;
                int i522 = iArr318[i520 - 1];
                Object obj74 = objArr130[i520];
                objArr130[i520] = null;
                ((Object[]) obj73)[i522] = obj74;
                return 0;
            case 430:
                int i523 = this.AudioAttributesImplApi21Parcelizer;
                int i524 = i523 - 3;
                this.AudioAttributesImplApi21Parcelizer = i524;
                Object[] objArr131 = this.onCustomAction;
                Object obj75 = objArr131[i524];
                objArr131[i524] = null;
                int i525 = this.MediaMetadataCompat[i523 - 2];
                Object obj76 = objArr131[i523 - 1];
                objArr131[i523 - 1] = null;
                ((Object[]) obj75)[i525] = obj76;
                this.AudioAttributesImplApi21Parcelizer = i523 - 2;
                objArr131[i524] = objArr131[i523 - 4];
                return 0;
            case 431:
                int i526 = this.AudioAttributesImplApi21Parcelizer;
                int i527 = i526 - 1;
                Object[] objArr132 = this.onCustomAction;
                objArr132[i527] = null;
                this.AudioAttributesImplApi21Parcelizer = i526;
                objArr132[i527] = objArr132[i526 - 2];
                return 0;
            case 432:
                Object[] objArr133 = this.onCustomAction;
                int i528 = this.AudioAttributesImplApi21Parcelizer;
                objArr133[i528] = objArr133[9];
                this.AudioAttributesImplApi21Parcelizer = i528 + 2;
                objArr133[i528 + 1] = objArr133[i528];
                return 0;
            case 433:
                int i529 = this.AudioAttributesImplApi21Parcelizer;
                int i530 = i529 - 1;
                Object[] objArr134 = this.onCustomAction;
                Object obj77 = objArr134[i530];
                objArr134[i530] = null;
                objArr134[57] = obj77;
                objArr134[i530] = obj77;
                int[] iArr319 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i529 + 1;
                iArr319[i529] = 1;
                return 0;
            case 434:
                int i531 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i531;
                int[] iArr320 = this.MediaMetadataCompat;
                iArr320[50] = iArr320[i531];
                return 0;
            case 435:
                int i532 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i532;
                int[] iArr321 = this.MediaMetadataCompat;
                iArr321[49] = iArr321[i532];
                return 0;
            case 436:
                int i533 = this.AudioAttributesImplApi21Parcelizer;
                int i534 = i533 - 1;
                Object[] objArr135 = this.onCustomAction;
                Object obj78 = objArr135[i534];
                objArr135[i534] = null;
                objArr135[48] = obj78;
                int i535 = i533 - 2;
                Object obj79 = objArr135[i535];
                objArr135[i535] = null;
                objArr135[47] = obj79;
                this.AudioAttributesImplApi21Parcelizer = i533 - 1;
                objArr135[i535] = obj79;
                return 0;
            case 437:
                Object[] objArr136 = this.onCustomAction;
                int i536 = this.AudioAttributesImplApi21Parcelizer;
                objArr136[i536] = objArr136[48];
                int[] iArr322 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i536 + 2;
                iArr322[i536 + 1] = 0;
                return 0;
            case 438:
                Object[] objArr137 = this.onCustomAction;
                int i537 = this.AudioAttributesImplApi21Parcelizer;
                objArr137[i537] = objArr137[48];
                int[] iArr323 = this.MediaMetadataCompat;
                iArr323[i537 + 1] = 2;
                int i538 = i537 + 1;
                this.AudioAttributesImplApi21Parcelizer = i538;
                Object obj80 = objArr137[i537];
                objArr137[i537] = null;
                objArr137[i537] = ((Object[]) obj80)[iArr323[i538]];
                return 0;
            case 439:
                int[] iArr324 = this.MediaMetadataCompat;
                int i539 = this.AudioAttributesImplApi21Parcelizer;
                iArr324[i539] = 3;
                this.AudioAttributesImplApi21Parcelizer = i539;
                Object[] objArr138 = this.onCustomAction;
                Object obj81 = objArr138[i539 - 1];
                objArr138[i539 - 1] = null;
                objArr138[i539 - 1] = ((Object[]) obj81)[iArr324[i539]];
                return 0;
            case 440:
                int i540 = this.AudioAttributesImplApi21Parcelizer;
                int i541 = i540 - 1;
                Object[] objArr139 = this.onCustomAction;
                Object obj82 = objArr139[i541];
                objArr139[i541] = null;
                objArr139[56] = obj82;
                int[] iArr325 = this.MediaMetadataCompat;
                iArr325[55] = iArr325[i540 - 2];
                int i542 = i540 - 3;
                this.AudioAttributesImplApi21Parcelizer = i542;
                iArr325[54] = iArr325[i542];
                return 0;
            case 441:
                int i543 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr326 = this.MediaMetadataCompat;
                iArr326[53] = iArr326[i543 - 1];
                iArr326[52] = iArr326[i543 - 2];
                int i544 = i543 - 3;
                this.AudioAttributesImplApi21Parcelizer = i544;
                Object[] objArr140 = this.onCustomAction;
                Object obj83 = objArr140[i544];
                objArr140[i544] = null;
                objArr140[51] = obj83;
                return 0;
            case 442:
                Object[] objArr141 = this.onCustomAction;
                int i545 = this.AudioAttributesImplApi21Parcelizer;
                objArr141[i545] = objArr141[51];
                this.AudioAttributesImplApi21Parcelizer = i545;
                objArr141[i545] = null;
                return 0;
            case 443:
                int[] iArr327 = this.MediaMetadataCompat;
                int i546 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i546 + 1;
                iArr327[i546] = iArr327[52];
                Object[] objArr142 = this.onCustomAction;
                Object obj84 = objArr142[i546 - 1];
                objArr142[i546 - 1] = null;
                objArr142[i546] = obj84;
                iArr327[i546 - 1] = iArr327[i546];
                return 0;
            case 444:
                int[] iArr328 = this.MediaMetadataCompat;
                int i547 = this.AudioAttributesImplApi21Parcelizer;
                int i548 = iArr328[i547 - 1];
                iArr328[i547 - 1] = iArr328[i547 - 2];
                iArr328[i547 - 2] = i548;
                return 0;
            case 445:
                int i549 = this.AudioAttributesImplApi21Parcelizer;
                int i550 = i549 - 3;
                this.AudioAttributesImplApi21Parcelizer = i550;
                Object[] objArr143 = this.onCustomAction;
                Object obj85 = objArr143[i550];
                objArr143[i550] = null;
                int[] iArr329 = this.MediaMetadataCompat;
                ((int[]) obj85)[iArr329[i549 - 2]] = iArr329[i549 - 1];
                return 0;
            case 446:
                Object[] objArr144 = this.onCustomAction;
                int i551 = this.AudioAttributesImplApi21Parcelizer;
                objArr144[i551] = objArr144[51];
                int[] iArr330 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i551 + 2;
                iArr330[i551 + 1] = iArr330[53];
                Object obj86 = objArr144[i551];
                objArr144[i551] = null;
                objArr144[i551 + 1] = obj86;
                iArr330[i551] = iArr330[i551 + 1];
                return 0;
            case 447:
                Object[] objArr145 = this.onCustomAction;
                int i552 = this.AudioAttributesImplApi21Parcelizer;
                Object obj87 = objArr145[i552 - 2];
                objArr145[i552 - 2] = null;
                objArr145[i552 - 1] = obj87;
                int[] iArr331 = this.MediaMetadataCompat;
                iArr331[i552 - 2] = iArr331[i552 - 1];
                int i553 = i552 - 3;
                this.AudioAttributesImplApi21Parcelizer = i553;
                Object obj88 = objArr145[i553];
                objArr145[i553] = null;
                int i554 = iArr331[i552 - 2];
                Object obj89 = objArr145[i552 - 1];
                objArr145[i552 - 1] = null;
                ((Object[]) obj88)[i554] = obj89;
                return 0;
            case 448:
                Object[] objArr146 = this.onCustomAction;
                int i555 = this.AudioAttributesImplApi21Parcelizer;
                objArr146[i555] = objArr146[51];
                int[] iArr332 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i555 + 2;
                iArr332[i555 + 1] = iArr332[54];
                return 0;
            case 449:
                int i556 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i556;
                int[] iArr333 = this.MediaMetadataCompat;
                iArr333[53] = iArr333[i556];
                return 0;
            case 450:
                int[] iArr334 = this.MediaMetadataCompat;
                int i557 = this.AudioAttributesImplApi21Parcelizer;
                iArr334[i557] = iArr334[54];
                iArr334[i557 + 1] = iArr334[53];
                int i558 = i557 + 1;
                this.AudioAttributesImplApi21Parcelizer = i558;
                iArr334[i557] = iArr334[i557] + iArr334[i558];
                return 0;
            case 451:
                int i559 = this.AudioAttributesImplApi21Parcelizer;
                int i560 = i559 - 1;
                int[] iArr335 = this.MediaMetadataCompat;
                iArr335[i559 - 2] = iArr335[i559 - 2] + iArr335[i560];
                iArr335[i560] = iArr335[i559 - 2];
                this.AudioAttributesImplApi21Parcelizer = i559 + 1;
                iArr335[i559] = 13;
                return 0;
            case 452:
                int i561 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr336 = this.MediaMetadataCompat;
                iArr336[i561 - 2] = iArr336[i561 - 2] << iArr336[i561 - 1];
                int i562 = i561 - 2;
                this.AudioAttributesImplApi21Parcelizer = i562;
                iArr336[i561 - 3] = iArr336[i561 - 3] ^ iArr336[i562];
                return 0;
            case 453:
                int[] iArr337 = this.MediaMetadataCompat;
                int i563 = this.AudioAttributesImplApi21Parcelizer;
                iArr337[i563] = iArr337[i563 - 1];
                this.AudioAttributesImplApi21Parcelizer = i563 + 2;
                iArr337[i563 + 1] = 17;
                return 0;
            case 454:
                int i564 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr338 = this.MediaMetadataCompat;
                iArr338[i564 - 2] = iArr338[i564 - 2] >>> iArr338[i564 - 1];
                int i565 = i564 - 2;
                this.AudioAttributesImplApi21Parcelizer = i565;
                iArr338[i564 - 3] = iArr338[i564 - 3] ^ iArr338[i565];
                return 0;
            case 455:
                int[] iArr339 = this.MediaMetadataCompat;
                int i566 = this.AudioAttributesImplApi21Parcelizer;
                iArr339[i566] = iArr339[i566 - 1];
                iArr339[i566 + 1] = 5;
                int i567 = i566 + 1;
                this.AudioAttributesImplApi21Parcelizer = i567;
                iArr339[i566] = iArr339[i566] << iArr339[i567];
                return 0;
            case 456:
                int i568 = this.AudioAttributesImplApi21Parcelizer;
                int i569 = i568 - 1;
                this.AudioAttributesImplApi21Parcelizer = i569;
                int[] iArr340 = this.MediaMetadataCompat;
                iArr340[i568 - 2] = iArr340[i568 - 2] ^ iArr340[i569];
                return 0;
            case 457:
                int[] iArr341 = this.MediaMetadataCompat;
                int i570 = this.AudioAttributesImplApi21Parcelizer;
                iArr341[i570] = 1;
                this.AudioAttributesImplApi21Parcelizer = i570;
                Object[] objArr147 = this.onCustomAction;
                Object obj90 = objArr147[i570 - 1];
                objArr147[i570 - 1] = null;
                objArr147[i570 - 1] = ((Object[]) obj90)[iArr341[i570]];
                return 0;
            case 458:
                Object[] objArr148 = this.onCustomAction;
                int i571 = this.AudioAttributesImplApi21Parcelizer;
                objArr148[i571] = objArr148[i571 - 1];
                int[] iArr342 = this.MediaMetadataCompat;
                iArr342[i571 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i571 + 3;
                iArr342[i571 + 2] = 1;
                return 0;
            case 459:
                Object[] objArr149 = this.onCustomAction;
                int i572 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr343 = this.MediaMetadataCompat;
                objArr149[i572 - 1] = new int[iArr343[i572 - 1]];
                int i573 = i572 - 3;
                this.AudioAttributesImplApi21Parcelizer = i573;
                Object obj91 = objArr149[i573];
                objArr149[i573] = null;
                int i574 = iArr343[i572 - 2];
                Object obj92 = objArr149[i572 - 1];
                objArr149[i572 - 1] = null;
                ((Object[]) obj91)[i574] = obj92;
                return 0;
            case 460:
                int[] iArr344 = this.MediaMetadataCompat;
                int i575 = this.AudioAttributesImplApi21Parcelizer;
                iArr344[i575] = 1;
                this.AudioAttributesImplApi21Parcelizer = i575 + 2;
                iArr344[i575 + 1] = 1;
                this.onCustomAction[i575 + 1] = new int[iArr344[i575 + 1]];
                return 0;
            case 461:
                int i576 = this.AudioAttributesImplApi21Parcelizer;
                int i577 = i576 - 3;
                this.AudioAttributesImplApi21Parcelizer = i577;
                Object[] objArr150 = this.onCustomAction;
                Object obj93 = objArr150[i577];
                objArr150[i577] = null;
                int[] iArr345 = this.MediaMetadataCompat;
                int i578 = iArr345[i576 - 2];
                Object obj94 = objArr150[i576 - 1];
                objArr150[i576 - 1] = null;
                ((Object[]) obj93)[i578] = obj94;
                objArr150[i577] = objArr150[i576 - 4];
                this.AudioAttributesImplApi21Parcelizer = i576 - 1;
                iArr345[i576 - 2] = 2;
                return 0;
            case 462:
                Object[] objArr151 = this.onCustomAction;
                int i579 = this.AudioAttributesImplApi21Parcelizer;
                objArr151[i579] = objArr151[i579 - 1];
                objArr151[i579] = null;
                this.AudioAttributesImplApi21Parcelizer = i579 + 1;
                objArr151[i579] = objArr151[i579 - 1];
                return 0;
            case 463:
                int i580 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i580;
                Object[] objArr152 = this.onCustomAction;
                Object obj95 = objArr152[i580];
                objArr152[i580] = null;
                objArr152[57] = obj95;
                return 0;
            case 464:
                Object[] objArr153 = this.onCustomAction;
                int i581 = this.AudioAttributesImplApi21Parcelizer;
                objArr153[i581] = objArr153[57];
                int[] iArr346 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i581 + 2;
                iArr346[i581 + 1] = 1;
                return 0;
            case 465:
                int[] iArr347 = this.MediaMetadataCompat;
                int i582 = this.AudioAttributesImplApi21Parcelizer;
                iArr347[i582] = 0;
                this.AudioAttributesImplApi21Parcelizer = i582;
                iArr347[50] = iArr347[i582];
                return 0;
            case 466:
                Object[] objArr154 = this.onCustomAction;
                int i583 = this.AudioAttributesImplApi21Parcelizer;
                objArr154[i583] = objArr154[48];
                int[] iArr348 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i583 + 2;
                iArr348[i583 + 1] = 2;
                return 0;
            case 467:
                int[] iArr349 = this.MediaMetadataCompat;
                int i584 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i584 + 1;
                iArr349[i584] = iArr349[49];
                return 0;
            case 468:
                int[] iArr350 = this.MediaMetadataCompat;
                int i585 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i585 + 1;
                iArr350[i585] = iArr350[50];
                return 0;
            case 469:
                Object[] objArr155 = this.onCustomAction;
                int i586 = this.AudioAttributesImplApi21Parcelizer;
                objArr155[i586] = objArr155[48];
                int[] iArr351 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i586 + 2;
                iArr351[i586 + 1] = 3;
                return 0;
            case 470:
                int i587 = this.AudioAttributesImplApi21Parcelizer;
                int i588 = i587 - 1;
                Object[] objArr156 = this.onCustomAction;
                Object obj96 = objArr156[i588];
                objArr156[i588] = null;
                objArr156[56] = obj96;
                int i589 = i587 - 2;
                this.AudioAttributesImplApi21Parcelizer = i589;
                int[] iArr352 = this.MediaMetadataCompat;
                iArr352[55] = iArr352[i589];
                return 0;
            case 471:
                int i590 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr353 = this.MediaMetadataCompat;
                iArr353[52] = iArr353[i590 - 1];
                int i591 = i590 - 2;
                this.AudioAttributesImplApi21Parcelizer = i591;
                Object[] objArr157 = this.onCustomAction;
                Object obj97 = objArr157[i591];
                objArr157[i591] = null;
                objArr157[51] = obj97;
                return 0;
            case 472:
                int i592 = this.AudioAttributesImplApi21Parcelizer;
                int i593 = i592 - 1;
                Object[] objArr158 = this.onCustomAction;
                objArr158[i593] = null;
                objArr158[i593] = objArr158[51];
                int[] iArr354 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i592 + 1;
                iArr354[i592] = iArr354[52];
                return 0;
            case 473:
                int[] iArr355 = this.MediaMetadataCompat;
                int i594 = this.AudioAttributesImplApi21Parcelizer;
                iArr355[i594] = 0;
                int i595 = iArr355[i594];
                iArr355[i594] = iArr355[i594 - 1];
                iArr355[i594 - 1] = i595;
                int i596 = i594 - 2;
                this.AudioAttributesImplApi21Parcelizer = i596;
                Object[] objArr159 = this.onCustomAction;
                Object obj98 = objArr159[i596];
                objArr159[i596] = null;
                ((int[]) obj98)[iArr355[i594 - 1]] = iArr355[i594];
                return 0;
            case 474:
                Object[] objArr160 = this.onCustomAction;
                int i597 = this.AudioAttributesImplApi21Parcelizer;
                objArr160[i597] = objArr160[51];
                int[] iArr356 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i597 + 2;
                iArr356[i597 + 1] = iArr356[53];
                return 0;
            case 475:
                Object[] objArr161 = this.onCustomAction;
                int i598 = this.AudioAttributesImplApi21Parcelizer;
                Object obj99 = objArr161[i598 - 2];
                objArr161[i598 - 2] = null;
                objArr161[i598 - 1] = obj99;
                int[] iArr357 = this.MediaMetadataCompat;
                iArr357[i598 - 2] = iArr357[i598 - 1];
                iArr357[i598] = 2;
                this.AudioAttributesImplApi21Parcelizer = i598;
                Object obj100 = objArr161[i598 - 1];
                objArr161[i598 - 1] = null;
                objArr161[i598 - 1] = ((Object[]) obj100)[iArr357[i598]];
                return 0;
            case 476:
                int i599 = this.AudioAttributesImplApi21Parcelizer;
                int i600 = i599 - 3;
                this.AudioAttributesImplApi21Parcelizer = i600;
                Object[] objArr162 = this.onCustomAction;
                Object obj101 = objArr162[i600];
                objArr162[i600] = null;
                int[] iArr358 = this.MediaMetadataCompat;
                ((int[]) obj101)[iArr358[i599 - 2]] = iArr358[i599 - 1];
                this.AudioAttributesImplApi21Parcelizer = i599 - 2;
                objArr162[i600] = objArr162[51];
                return 0;
            case 477:
                Object[] objArr163 = this.onCustomAction;
                int i601 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i601 + 1;
                objArr163[i601] = objArr163[56];
                return 0;
            case 478:
                int[] iArr359 = this.MediaMetadataCompat;
                int i602 = this.AudioAttributesImplApi21Parcelizer;
                iArr359[i602] = 3;
                Object[] objArr164 = this.onCustomAction;
                Object obj102 = objArr164[i602 - 1];
                objArr164[i602 - 1] = null;
                objArr164[i602] = obj102;
                iArr359[i602 - 1] = iArr359[i602];
                int i603 = i602 - 2;
                this.AudioAttributesImplApi21Parcelizer = i603;
                Object obj103 = objArr164[i603];
                objArr164[i603] = null;
                int i604 = iArr359[i602 - 1];
                Object obj104 = objArr164[i602];
                objArr164[i602] = null;
                ((Object[]) obj103)[i604] = obj104;
                return 0;
            case 479:
                int[] iArr360 = this.MediaMetadataCompat;
                int i605 = this.AudioAttributesImplApi21Parcelizer;
                iArr360[i605] = iArr360[53];
                this.AudioAttributesImplApi21Parcelizer = i605;
                iArr360[i605 - 1] = iArr360[i605 - 1] + iArr360[i605];
                return 0;
            case 480:
                int[] iArr361 = this.MediaMetadataCompat;
                int i606 = this.AudioAttributesImplApi21Parcelizer;
                iArr361[i606] = 17;
                iArr361[i606 - 1] = iArr361[i606 - 1] >>> iArr361[i606];
                int i607 = i606 - 1;
                this.AudioAttributesImplApi21Parcelizer = i607;
                iArr361[i606 - 2] = iArr361[i606 - 2] ^ iArr361[i607];
                return 0;
            case 481:
                Object[] objArr165 = this.onCustomAction;
                int i608 = this.AudioAttributesImplApi21Parcelizer;
                Object obj105 = objArr165[i608 - 2];
                objArr165[i608 - 2] = null;
                objArr165[i608 - 1] = obj105;
                int[] iArr362 = this.MediaMetadataCompat;
                iArr362[i608 - 2] = iArr362[i608 - 1];
                iArr362[i608] = 1;
                this.AudioAttributesImplApi21Parcelizer = i608;
                Object obj106 = objArr165[i608 - 1];
                objArr165[i608 - 1] = null;
                objArr165[i608 - 1] = ((Object[]) obj106)[iArr362[i608]];
                return 0;
            case 482:
                int[] iArr363 = this.MediaMetadataCompat;
                int i609 = this.AudioAttributesImplApi21Parcelizer;
                iArr363[i609] = 0;
                this.AudioAttributesImplApi21Parcelizer = i609 + 2;
                iArr363[i609 + 1] = 1;
                this.onCustomAction[i609 + 1] = new int[iArr363[i609 + 1]];
                return 0;
            case 483:
                int i610 = this.AudioAttributesImplApi21Parcelizer;
                int i611 = i610 - 1;
                Object[] objArr166 = this.onCustomAction;
                objArr166[i611] = null;
                this.AudioAttributesImplApi21Parcelizer = i610;
                objArr166[i611] = objArr166[9];
                return 0;
            case 484:
                int[] iArr364 = this.MediaMetadataCompat;
                int i612 = this.AudioAttributesImplApi21Parcelizer;
                iArr364[i612] = 0;
                iArr364[50] = iArr364[i612];
                int i613 = i612 - 1;
                this.AudioAttributesImplApi21Parcelizer = i613;
                iArr364[49] = iArr364[i613];
                return 0;
            case 485:
                int[] iArr365 = this.MediaMetadataCompat;
                int i614 = this.AudioAttributesImplApi21Parcelizer;
                iArr365[i614] = 2;
                this.AudioAttributesImplApi21Parcelizer = i614;
                Object[] objArr167 = this.onCustomAction;
                Object obj107 = objArr167[i614 - 1];
                objArr167[i614 - 1] = null;
                objArr167[i614 - 1] = ((Object[]) obj107)[iArr365[i614]];
                return 0;
            case 486:
                int[] iArr366 = this.MediaMetadataCompat;
                int i615 = this.AudioAttributesImplApi21Parcelizer;
                iArr366[i615] = 0;
                this.AudioAttributesImplApi21Parcelizer = i615;
                Object[] objArr168 = this.onCustomAction;
                Object obj108 = objArr168[i615 - 1];
                objArr168[i615 - 1] = null;
                iArr366[i615 - 1] = ((int[]) obj108)[iArr366[i615]];
                this.AudioAttributesImplApi21Parcelizer = i615 + 1;
                iArr366[i615] = iArr366[49];
                return 0;
            case 487:
                int[] iArr367 = this.MediaMetadataCompat;
                int i616 = this.AudioAttributesImplApi21Parcelizer;
                iArr367[i616] = iArr367[50];
                Object[] objArr169 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i616 + 2;
                objArr169[i616 + 1] = objArr169[48];
                return 0;
            case 488:
                int i617 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i617;
                int[] iArr368 = this.MediaMetadataCompat;
                iArr368[52] = iArr368[i617];
                return 0;
            case 489:
                Object[] objArr170 = this.onCustomAction;
                int i618 = this.AudioAttributesImplApi21Parcelizer;
                objArr170[i618] = objArr170[51];
                int[] iArr369 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i618 + 2;
                iArr369[i618 + 1] = iArr369[52];
                Object obj109 = objArr170[i618];
                objArr170[i618] = null;
                objArr170[i618 + 1] = obj109;
                iArr369[i618] = iArr369[i618 + 1];
                return 0;
            case 490:
                Object[] objArr171 = this.onCustomAction;
                int i619 = this.AudioAttributesImplApi21Parcelizer;
                objArr171[i619] = objArr171[51];
                this.AudioAttributesImplApi21Parcelizer = i619 + 2;
                objArr171[i619 + 1] = objArr171[56];
                return 0;
            case 491:
                Object[] objArr172 = this.onCustomAction;
                int i620 = this.AudioAttributesImplApi21Parcelizer;
                Object obj110 = objArr172[i620 - 2];
                objArr172[i620 - 2] = null;
                objArr172[i620 - 1] = obj110;
                int[] iArr370 = this.MediaMetadataCompat;
                iArr370[i620 - 2] = iArr370[i620 - 1];
                int i621 = i620 - 3;
                this.AudioAttributesImplApi21Parcelizer = i621;
                Object obj111 = objArr172[i621];
                objArr172[i621] = null;
                int i622 = iArr370[i620 - 2];
                Object obj112 = objArr172[i620 - 1];
                objArr172[i620 - 1] = null;
                ((Object[]) obj111)[i622] = obj112;
                this.AudioAttributesImplApi21Parcelizer = i620 - 2;
                objArr172[i621] = objArr172[51];
                return 0;
            case 492:
                int i623 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr371 = this.MediaMetadataCompat;
                int i624 = iArr371[i623 - 1];
                iArr371[54] = i624;
                int i625 = i623 - 2;
                iArr371[53] = iArr371[i625];
                this.AudioAttributesImplApi21Parcelizer = i623 - 1;
                iArr371[i625] = i624;
                return 0;
            case UnixStat.DEFAULT_DIR_PERM /* 493 */:
                int i626 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr372 = this.MediaMetadataCompat;
                iArr372[i626 - 2] = iArr372[i626 - 2] + iArr372[i626 - 1];
                int i627 = i626 - 2;
                this.AudioAttributesImplApi21Parcelizer = i627;
                iArr372[i626 - 3] = iArr372[i626 - 3] + iArr372[i627];
                return 0;
            case 494:
                int[] iArr373 = this.MediaMetadataCompat;
                int i628 = this.AudioAttributesImplApi21Parcelizer;
                iArr373[i628] = 5;
                iArr373[i628 - 1] = iArr373[i628 - 1] << iArr373[i628];
                int i629 = i628 - 1;
                this.AudioAttributesImplApi21Parcelizer = i629;
                iArr373[i628 - 2] = iArr373[i628 - 2] ^ iArr373[i629];
                return 0;
            case 495:
                int[] iArr374 = this.MediaMetadataCompat;
                int i630 = this.AudioAttributesImplApi21Parcelizer;
                iArr374[i630 - 1] = iArr374[i630 - 2];
                Object[] objArr173 = this.onCustomAction;
                Object obj113 = objArr173[i630 - 1];
                objArr173[i630 - 1] = null;
                objArr173[i630 - 2] = obj113;
                this.AudioAttributesImplApi21Parcelizer = i630 + 1;
                iArr374[i630] = 0;
                return 0;
            case 496:
                int i631 = this.AudioAttributesImplApi21Parcelizer;
                int i632 = i631 - 1;
                Object[] objArr174 = this.onCustomAction;
                Object obj114 = objArr174[i632];
                objArr174[i632] = null;
                objArr174[12] = obj114;
                this.AudioAttributesImplApi21Parcelizer = i631;
                objArr174[i632] = objArr174[9];
                return 0;
            case 497:
                Object[] objArr175 = this.onCustomAction;
                int i633 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i633 + 1;
                objArr175[i633] = objArr175[57];
                return 0;
            case 498:
                int i634 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i634;
                Object[] objArr176 = this.onCustomAction;
                Object obj115 = objArr176[i634];
                objArr176[i634] = null;
                objArr176[15] = obj115;
                return 0;
            case 499:
                int i635 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i635;
                int[] iArr375 = this.MediaMetadataCompat;
                iArr375[13] = iArr375[i635];
                return 0;
            case 500:
                int[] iArr376 = this.MediaMetadataCompat;
                int i636 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i636 + 1;
                iArr376[i636] = iArr376[13];
                return 0;
            case 501:
                Object[] objArr177 = this.onCustomAction;
                int i637 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i637 + 1;
                objArr177[i637] = objArr177[15];
                int[] iArr377 = this.MediaMetadataCompat;
                Object obj116 = objArr177[i637];
                objArr177[i637] = null;
                iArr377[i637] = ((Object[]) obj116).length;
                return 0;
            case 502:
                int i638 = this.AudioAttributesImplApi21Parcelizer;
                int i639 = i638 - 2;
                this.AudioAttributesImplApi21Parcelizer = i639;
                int[] iArr378 = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = iArr378[i639] >= iArr378[i638 - 1] ? 0 : 1;
                return 0;
            case 503:
                Object[] objArr178 = this.onCustomAction;
                int i640 = this.AudioAttributesImplApi21Parcelizer;
                objArr178[i640] = objArr178[12];
                this.AudioAttributesImplApi21Parcelizer = i640 + 2;
                objArr178[i640 + 1] = objArr178[15];
                return 0;
            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                int i641 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i641;
                this.onCustomAction[i641] = null;
                int[] iArr379 = this.MediaMetadataCompat;
                iArr379[13] = iArr379[13] + 1;
                return 0;
            case 505:
                Object[] objArr179 = this.onCustomAction;
                int i642 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i642 + 1;
                objArr179[i642] = objArr179[82];
                return 0;
            case 506:
                Object[] objArr180 = this.onCustomAction;
                int i643 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i643 + 1;
                objArr180[i643] = objArr180[83];
                return 0;
            case 507:
                Object[] objArr181 = this.onCustomAction;
                int i644 = this.AudioAttributesImplApi21Parcelizer;
                objArr181[i644] = null;
                this.AudioAttributesImplApi21Parcelizer = i644 + 2;
                objArr181[i644 + 1] = null;
                return 0;
            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                Object[] objArr182 = this.onCustomAction;
                int i645 = this.AudioAttributesImplApi21Parcelizer;
                objArr182[i645] = objArr182[i645 - 1];
                this.AudioAttributesImplApi21Parcelizer = i645;
                Object obj117 = objArr182[i645];
                objArr182[i645] = null;
                objArr182[13] = obj117;
                return 0;
            case 509:
                Object[] objArr183 = this.onCustomAction;
                int i646 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i646 + 1;
                objArr183[i646] = objArr183[13];
                return 0;
            case 510:
                int i647 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i647;
                Object[] objArr184 = this.onCustomAction;
                Object obj118 = objArr184[i647];
                objArr184[i647] = null;
                objArr184[13] = obj118;
                return 0;
            case UnixStat.DEFAULT_LINK_PERM /* 511 */:
                Object[] objArr185 = this.onCustomAction;
                int i648 = this.AudioAttributesImplApi21Parcelizer;
                objArr185[i648] = null;
                this.AudioAttributesImplApi21Parcelizer = i648;
                Object obj119 = objArr185[i648];
                objArr185[i648] = null;
                objArr185[13] = obj119;
                return 0;
            case 512:
                int[] iArr380 = this.MediaMetadataCompat;
                int i649 = this.AudioAttributesImplApi21Parcelizer;
                iArr380[i649] = iArr380[10];
                this.AudioAttributesImplApi21Parcelizer = i649;
                iArr380[i649 - 1] = iArr380[i649] ^ iArr380[i649 - 1];
                return 0;
            case 513:
                this.MediaBrowserCompatSearchResultReceiver[this.AudioAttributesImplApi21Parcelizer - 1] = this.MediaMetadataCompat[r2 - 1];
                return 0;
            case 514:
                int i650 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr19 = this.MediaBrowserCompatSearchResultReceiver;
                jArr19[i650 - 2] = jArr19[i650 - 2] & jArr19[i650 - 1];
                int i651 = i650 - 2;
                this.AudioAttributesImplApi21Parcelizer = i651;
                jArr19[i650 - 3] = jArr19[i651] ^ jArr19[i650 - 3];
                return 0;
            case 515:
                Object[] objArr186 = this.onCustomAction;
                int i652 = this.AudioAttributesImplApi21Parcelizer;
                Object obj120 = objArr186[i652 - 1];
                objArr186[i652 - 1] = null;
                Object obj121 = objArr186[i652 - 2];
                objArr186[i652 - 2] = null;
                objArr186[i652 - 1] = obj121;
                objArr186[i652 - 2] = obj120;
                int i653 = i652 - 1;
                this.AudioAttributesImplApi21Parcelizer = i653;
                objArr186[i653] = null;
                return 0;
            case 516:
                Object[] objArr187 = this.onCustomAction;
                int i654 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i654 + 1;
                Object obj122 = objArr187[i654 - 1];
                objArr187[i654 - 1] = null;
                objArr187[i654] = obj122;
                long[] jArr20 = this.MediaBrowserCompatSearchResultReceiver;
                jArr20[i654 - 1] = jArr20[i654 - 2];
                objArr187[i654 - 2] = obj122;
                return 0;
            case 517:
                Object[] objArr188 = this.onCustomAction;
                int i655 = this.AudioAttributesImplApi21Parcelizer;
                Object obj123 = objArr188[i655 - 1];
                objArr188[i655 - 1] = null;
                Object obj124 = objArr188[i655 - 2];
                objArr188[i655 - 2] = null;
                objArr188[i655 - 1] = obj124;
                objArr188[i655 - 2] = obj123;
                return 0;
            case 518:
                Object[] objArr189 = this.onCustomAction;
                int i656 = this.AudioAttributesImplApi21Parcelizer;
                Object obj125 = objArr189[i656 - 1];
                objArr189[i656 - 1] = null;
                objArr189[i656] = obj125;
                Object obj126 = objArr189[i656 - 2];
                objArr189[i656 - 2] = null;
                objArr189[i656 - 1] = obj126;
                objArr189[i656 - 2] = obj125;
                Object obj127 = objArr189[i656];
                objArr189[i656] = null;
                Object obj128 = objArr189[i656 - 1];
                objArr189[i656 - 1] = null;
                objArr189[i656] = obj128;
                objArr189[i656 - 1] = obj127;
                int[] iArr381 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i656 + 2;
                iArr381[i656 + 1] = 2;
                return 0;
            case 519:
                Object[] objArr190 = this.onCustomAction;
                int i657 = this.AudioAttributesImplApi21Parcelizer;
                Object obj129 = objArr190[i657 - 2];
                objArr190[i657 - 2] = null;
                objArr190[i657 - 1] = obj129;
                int[] iArr382 = this.MediaMetadataCompat;
                iArr382[i657 - 2] = iArr382[i657 - 1];
                int i658 = i657 - 3;
                this.AudioAttributesImplApi21Parcelizer = i658;
                Object obj130 = objArr190[i658];
                objArr190[i658] = null;
                int i659 = iArr382[i657 - 2];
                Object obj131 = objArr190[i657 - 1];
                objArr190[i657 - 1] = null;
                ((Object[]) obj130)[i659] = obj131;
                this.AudioAttributesImplApi21Parcelizer = i657 - 2;
                Object obj132 = objArr190[i657 - 4];
                objArr190[i657 - 4] = null;
                objArr190[i658] = obj132;
                long[] jArr21 = this.MediaBrowserCompatSearchResultReceiver;
                jArr21[i657 - 4] = jArr21[i657 - 5];
                objArr190[i657 - 5] = obj132;
                return 0;
            case 520:
                Object[] objArr191 = this.onCustomAction;
                int i660 = this.AudioAttributesImplApi21Parcelizer;
                Object obj133 = objArr191[i660 - 1];
                objArr191[i660 - 1] = null;
                objArr191[i660] = obj133;
                Object obj134 = objArr191[i660 - 2];
                objArr191[i660 - 2] = null;
                objArr191[i660 - 1] = obj134;
                objArr191[i660 - 2] = obj133;
                Object obj135 = objArr191[i660];
                objArr191[i660] = null;
                Object obj136 = objArr191[i660 - 1];
                objArr191[i660 - 1] = null;
                objArr191[i660] = obj136;
                objArr191[i660 - 1] = obj135;
                int[] iArr383 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i660 + 2;
                iArr383[i660 + 1] = 1;
                return 0;
            case 521:
                Object[] objArr192 = this.onCustomAction;
                int i661 = this.AudioAttributesImplApi21Parcelizer;
                Object obj137 = objArr192[i661 - 2];
                objArr192[i661 - 2] = null;
                objArr192[i661 - 1] = obj137;
                int[] iArr384 = this.MediaMetadataCompat;
                iArr384[i661 - 2] = iArr384[i661 - 1];
                int i662 = i661 - 3;
                this.AudioAttributesImplApi21Parcelizer = i662;
                Object obj138 = objArr192[i662];
                objArr192[i662] = null;
                int i663 = iArr384[i661 - 2];
                Object obj139 = objArr192[i661 - 1];
                objArr192[i661 - 1] = null;
                ((Object[]) obj138)[i663] = obj139;
                this.AudioAttributesImplApi21Parcelizer = i661 - 2;
                Object obj140 = objArr192[i661 - 4];
                objArr192[i661 - 4] = null;
                objArr192[i662] = obj140;
                Object obj141 = objArr192[i661 - 5];
                objArr192[i661 - 5] = null;
                objArr192[i661 - 4] = obj141;
                objArr192[i661 - 5] = obj140;
                return 0;
            case 522:
                Object[] objArr193 = this.onCustomAction;
                int i664 = this.AudioAttributesImplApi21Parcelizer;
                Object obj142 = objArr193[i664 - 1];
                objArr193[i664 - 1] = null;
                Object obj143 = objArr193[i664 - 2];
                objArr193[i664 - 2] = null;
                objArr193[i664 - 1] = obj143;
                objArr193[i664 - 2] = obj142;
                int[] iArr385 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i664 + 1;
                iArr385[i664] = 0;
                Object obj144 = objArr193[i664 - 1];
                objArr193[i664 - 1] = null;
                objArr193[i664] = obj144;
                iArr385[i664 - 1] = iArr385[i664];
                return 0;
            case 523:
                Object[] objArr194 = this.onCustomAction;
                int i665 = this.AudioAttributesImplApi21Parcelizer;
                objArr194[i665] = objArr194[i665 - 1];
                int[] iArr386 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i665 + 2;
                iArr386[i665 + 1] = 1;
                return 0;
            case 524:
                Object[] objArr195 = this.onCustomAction;
                int i666 = this.AudioAttributesImplApi21Parcelizer;
                Object obj145 = objArr195[i666 - 1];
                objArr195[i666 - 1] = null;
                Object obj146 = objArr195[i666 - 2];
                objArr195[i666 - 2] = null;
                objArr195[i666 - 1] = obj146;
                objArr195[i666 - 2] = obj145;
                this.AudioAttributesImplApi21Parcelizer = i666 + 1;
                objArr195[i666] = null;
                Object obj147 = objArr195[i666];
                objArr195[i666] = null;
                Object obj148 = objArr195[i666 - 1];
                objArr195[i666 - 1] = null;
                objArr195[i666] = obj148;
                objArr195[i666 - 1] = obj147;
                return 0;
            case 525:
                Object[] objArr196 = this.onCustomAction;
                int i667 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr387 = this.MediaMetadataCompat;
                objArr196[i667 - 1] = new int[iArr387[i667 - 1]];
                int i668 = i667 - 3;
                this.AudioAttributesImplApi21Parcelizer = i668;
                Object obj149 = objArr196[i668];
                objArr196[i668] = null;
                int i669 = iArr387[i667 - 2];
                Object obj150 = objArr196[i667 - 1];
                objArr196[i667 - 1] = null;
                ((Object[]) obj149)[i669] = obj150;
                this.AudioAttributesImplApi21Parcelizer = i667 - 2;
                objArr196[i668] = objArr196[i667 - 4];
                return 0;
            case 526:
                int i670 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i670;
                Object[] objArr197 = this.onCustomAction;
                Object obj151 = objArr197[i670];
                objArr197[i670] = null;
                objArr197[48] = obj151;
                return 0;
            case 527:
                int i671 = this.AudioAttributesImplApi21Parcelizer;
                int i672 = i671 - 1;
                Object[] objArr198 = this.onCustomAction;
                Object obj152 = objArr198[i672];
                objArr198[i672] = null;
                objArr198[47] = obj152;
                this.AudioAttributesImplApi21Parcelizer = i671;
                objArr198[i672] = obj152;
                return 0;
            case 528:
                int i673 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr388 = this.MediaMetadataCompat;
                iArr388[55] = iArr388[i673 - 1];
                iArr388[54] = iArr388[i673 - 2];
                int i674 = i673 - 3;
                this.AudioAttributesImplApi21Parcelizer = i674;
                iArr388[53] = iArr388[i674];
                return 0;
            case 529:
                Object[] objArr199 = this.onCustomAction;
                int i675 = this.AudioAttributesImplApi21Parcelizer;
                objArr199[i675] = objArr199[51];
                objArr199[i675] = null;
                this.AudioAttributesImplApi21Parcelizer = i675 + 1;
                objArr199[i675] = objArr199[51];
                return 0;
            case 530:
                Object[] objArr200 = this.onCustomAction;
                int i676 = this.AudioAttributesImplApi21Parcelizer;
                objArr200[i676] = objArr200[56];
                int[] iArr389 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i676 + 2;
                iArr389[i676 + 1] = 3;
                Object obj153 = objArr200[i676];
                objArr200[i676] = null;
                objArr200[i676 + 1] = obj153;
                iArr389[i676] = iArr389[i676 + 1];
                return 0;
            case 531:
                int[] iArr390 = this.MediaMetadataCompat;
                int i677 = this.AudioAttributesImplApi21Parcelizer;
                iArr390[i677] = 13;
                iArr390[i677 - 1] = iArr390[i677 - 1] << iArr390[i677];
                int i678 = i677 - 1;
                this.AudioAttributesImplApi21Parcelizer = i678;
                iArr390[i677 - 2] = iArr390[i677 - 2] ^ iArr390[i678];
                return 0;
            case 532:
                int i679 = this.AudioAttributesImplApi21Parcelizer;
                int i680 = i679 - 1;
                int[] iArr391 = this.MediaMetadataCompat;
                iArr391[i679 - 2] = iArr391[i679 - 2] ^ iArr391[i680];
                Object[] objArr201 = this.onCustomAction;
                Object obj154 = objArr201[i679 - 3];
                objArr201[i679 - 3] = null;
                objArr201[i679 - 2] = obj154;
                iArr391[i679 - 3] = iArr391[i679 - 2];
                this.AudioAttributesImplApi21Parcelizer = i679;
                iArr391[i680] = 1;
                return 0;
            case 533:
                int i681 = this.AudioAttributesImplApi21Parcelizer;
                int i682 = i681 - 1;
                Object[] objArr202 = this.onCustomAction;
                Object obj155 = objArr202[i682];
                objArr202[i682] = null;
                objArr202[9] = obj155;
                int[] iArr392 = this.MediaMetadataCompat;
                iArr392[i682] = iArr392[10];
                this.AudioAttributesImplApi21Parcelizer = i681 + 1;
                iArr392[i681] = iArr392[11];
                return 0;
            case 534:
                int i683 = this.AudioAttributesImplApi21Parcelizer;
                int i684 = i683 - 1;
                this.AudioAttributesImplApi21Parcelizer = i684;
                int[] iArr393 = this.MediaMetadataCompat;
                iArr393[i683 - 2] = iArr393[i684] ^ iArr393[i683 - 2];
                this.MediaBrowserCompatSearchResultReceiver[i683 - 2] = iArr393[i683 - 2];
                return 0;
            case 535:
                int i685 = this.AudioAttributesImplApi21Parcelizer;
                int i686 = i685 - 1;
                this.AudioAttributesImplApi21Parcelizer = i686;
                long[] jArr22 = this.MediaBrowserCompatSearchResultReceiver;
                jArr22[i685 - 2] = jArr22[i686] & jArr22[i685 - 2];
                return 0;
            case 536:
                int i687 = this.AudioAttributesImplApi21Parcelizer;
                int i688 = i687 - 1;
                this.AudioAttributesImplApi21Parcelizer = i688;
                long[] jArr23 = this.MediaBrowserCompatSearchResultReceiver;
                jArr23[i687 - 2] = jArr23[i688] | jArr23[i687 - 2];
                return 0;
            case 537:
                int i689 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i689;
                long[] jArr24 = this.MediaBrowserCompatSearchResultReceiver;
                jArr24[16] = jArr24[i689];
                return 0;
            case 538:
                long[] jArr25 = this.MediaBrowserCompatSearchResultReceiver;
                int i690 = this.AudioAttributesImplApi21Parcelizer;
                jArr25[i690] = jArr25[16];
                Object[] objArr203 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i690 + 2;
                objArr203[i690 + 1] = objArr203[12];
                return 0;
            case 539:
                int[] iArr394 = this.MediaMetadataCompat;
                int i691 = this.AudioAttributesImplApi21Parcelizer;
                iArr394[i691] = 0;
                this.AudioAttributesImplApi21Parcelizer = i691 + 2;
                iArr394[i691 + 1] = 0;
                return 0;
            case 540:
                Object[] objArr204 = this.onCustomAction;
                int i692 = this.AudioAttributesImplApi21Parcelizer;
                objArr204[i692] = objArr204[i692 - 1];
                this.AudioAttributesImplApi21Parcelizer = i692;
                objArr204[i692] = null;
                return 0;
            case 541:
                Object[] objArr205 = this.onCustomAction;
                int i693 = this.AudioAttributesImplApi21Parcelizer;
                objArr205[i693] = objArr205[i693 - 1];
                objArr205[i693 + 1] = objArr205[9];
                this.AudioAttributesImplApi21Parcelizer = i693 + 3;
                objArr205[i693 + 2] = objArr205[i693 + 1];
                return 0;
            case 542:
                int i694 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr395 = this.MediaMetadataCompat;
                iArr395[50] = iArr395[i694 - 1];
                iArr395[49] = iArr395[i694 - 2];
                int i695 = i694 - 3;
                this.AudioAttributesImplApi21Parcelizer = i695;
                Object[] objArr206 = this.onCustomAction;
                Object obj156 = objArr206[i695];
                objArr206[i695] = null;
                objArr206[48] = obj156;
                return 0;
            case 543:
                Object[] objArr207 = this.onCustomAction;
                int i696 = this.AudioAttributesImplApi21Parcelizer;
                objArr207[i696] = objArr207[48];
                int[] iArr396 = this.MediaMetadataCompat;
                iArr396[i696 + 1] = 0;
                int i697 = i696 + 1;
                this.AudioAttributesImplApi21Parcelizer = i697;
                Object obj157 = objArr207[i696];
                objArr207[i696] = null;
                objArr207[i696] = ((Object[]) obj157)[iArr396[i697]];
                return 0;
            case 544:
                int i698 = this.AudioAttributesImplApi21Parcelizer;
                int i699 = i698 - 1;
                this.AudioAttributesImplApi21Parcelizer = i699;
                int[] iArr397 = this.MediaMetadataCompat;
                Object[] objArr208 = this.onCustomAction;
                Object obj158 = objArr208[i698 - 2];
                objArr208[i698 - 2] = null;
                iArr397[i698 - 2] = ((int[]) obj158)[iArr397[i699]];
                this.AudioAttributesImplApi21Parcelizer = i698;
                objArr208[i699] = objArr208[48];
                return 0;
            case 545:
                int[] iArr398 = this.MediaMetadataCompat;
                int i700 = this.AudioAttributesImplApi21Parcelizer;
                iArr398[i700] = iArr398[50];
                Object[] objArr209 = this.onCustomAction;
                objArr209[i700 + 1] = objArr209[48];
                this.AudioAttributesImplApi21Parcelizer = i700 + 3;
                iArr398[i700 + 2] = 3;
                return 0;
            case 546:
                int i701 = this.AudioAttributesImplApi21Parcelizer;
                int i702 = i701 - 1;
                Object[] objArr210 = this.onCustomAction;
                Object obj159 = objArr210[i702];
                objArr210[i702] = null;
                objArr210[51] = obj159;
                objArr210[i702] = obj159;
                int i703 = i701 - 1;
                this.AudioAttributesImplApi21Parcelizer = i703;
                objArr210[i703] = null;
                return 0;
            case 547:
                Object[] objArr211 = this.onCustomAction;
                int i704 = this.AudioAttributesImplApi21Parcelizer;
                objArr211[i704] = objArr211[51];
                int[] iArr399 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i704 + 2;
                iArr399[i704 + 1] = iArr399[52];
                return 0;
            case 548:
                Object[] objArr212 = this.onCustomAction;
                int i705 = this.AudioAttributesImplApi21Parcelizer;
                Object obj160 = objArr212[i705 - 2];
                objArr212[i705 - 2] = null;
                objArr212[i705 - 1] = obj160;
                int[] iArr400 = this.MediaMetadataCompat;
                iArr400[i705 - 2] = iArr400[i705 - 1];
                iArr400[i705] = 0;
                this.AudioAttributesImplApi21Parcelizer = i705;
                Object obj161 = objArr212[i705 - 1];
                objArr212[i705 - 1] = null;
                objArr212[i705 - 1] = ((Object[]) obj161)[iArr400[i705]];
                return 0;
            case 549:
                int[] iArr401 = this.MediaMetadataCompat;
                int i706 = this.AudioAttributesImplApi21Parcelizer;
                int i707 = iArr401[i706 - 1];
                iArr401[i706 - 1] = iArr401[i706 - 2];
                iArr401[i706 - 2] = i707;
                int i708 = i706 - 3;
                this.AudioAttributesImplApi21Parcelizer = i708;
                Object[] objArr213 = this.onCustomAction;
                Object obj162 = objArr213[i708];
                objArr213[i708] = null;
                ((int[]) obj162)[iArr401[i706 - 2]] = iArr401[i706 - 1];
                return 0;
            case 550:
                Object[] objArr214 = this.onCustomAction;
                int i709 = this.AudioAttributesImplApi21Parcelizer;
                objArr214[i709] = objArr214[51];
                objArr214[i709 + 1] = objArr214[56];
                int[] iArr402 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i709 + 3;
                iArr402[i709 + 2] = 3;
                return 0;
            case 551:
                Object[] objArr215 = this.onCustomAction;
                int i710 = this.AudioAttributesImplApi21Parcelizer;
                objArr215[i710] = objArr215[51];
                int[] iArr403 = this.MediaMetadataCompat;
                iArr403[i710 + 1] = iArr403[54];
                this.AudioAttributesImplApi21Parcelizer = i710 + 3;
                iArr403[i710 + 2] = iArr403[55];
                return 0;
            case 552:
                int[] iArr404 = this.MediaMetadataCompat;
                int i711 = this.AudioAttributesImplApi21Parcelizer;
                iArr404[i711] = iArr404[54];
                this.AudioAttributesImplApi21Parcelizer = i711 + 2;
                iArr404[i711 + 1] = iArr404[53];
                return 0;
            case 553:
                int[] iArr405 = this.MediaMetadataCompat;
                int i712 = this.AudioAttributesImplApi21Parcelizer;
                iArr405[i712] = 13;
                this.AudioAttributesImplApi21Parcelizer = i712;
                iArr405[i712 - 1] = iArr405[i712 - 1] << iArr405[i712];
                return 0;
            case RtspMessageChannel.DEFAULT_RTSP_PORT /* 554 */:
                int[] iArr406 = this.MediaMetadataCompat;
                int i713 = this.AudioAttributesImplApi21Parcelizer;
                iArr406[i713] = 5;
                this.AudioAttributesImplApi21Parcelizer = i713;
                iArr406[i713 - 1] = iArr406[i713 - 1] << iArr406[i713];
                return 0;
            case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                int i714 = this.AudioAttributesImplApi21Parcelizer;
                int i715 = i714 - 1;
                this.AudioAttributesImplApi21Parcelizer = i715;
                int[] iArr407 = this.MediaMetadataCompat;
                iArr407[i714 - 2] = iArr407[i715] ^ iArr407[i714 - 2];
                Object[] objArr216 = this.onCustomAction;
                Object obj163 = objArr216[i714 - 3];
                objArr216[i714 - 3] = null;
                objArr216[i714 - 2] = obj163;
                iArr407[i714 - 3] = iArr407[i714 - 2];
                return 0;
            case 556:
                int i716 = this.AudioAttributesImplApi21Parcelizer;
                int i717 = i716 - 3;
                this.AudioAttributesImplApi21Parcelizer = i717;
                Object[] objArr217 = this.onCustomAction;
                Object obj164 = objArr217[i717];
                objArr217[i717] = null;
                int[] iArr408 = this.MediaMetadataCompat;
                ((int[]) obj164)[iArr408[i716 - 2]] = iArr408[i716 - 1];
                int i718 = i716 - 4;
                this.AudioAttributesImplApi21Parcelizer = i718;
                Object obj165 = objArr217[i718];
                objArr217[i718] = null;
                objArr217[9] = obj165;
                return 0;
            case 557:
                int[] iArr409 = this.MediaMetadataCompat;
                int i719 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i719 + 1;
                iArr409[i719] = iArr409[10];
                this.onCustomAction[i719] = new int[iArr409[i719]];
                return 0;
            case 558:
                int[] iArr410 = this.MediaMetadataCompat;
                int i720 = this.AudioAttributesImplApi21Parcelizer;
                iArr410[i720] = iArr410[10];
                iArr410[i720 + 1] = 1;
                int i721 = i720 + 1;
                this.AudioAttributesImplApi21Parcelizer = i721;
                iArr410[i720] = iArr410[i720] - iArr410[i721];
                return 0;
            case 559:
                int[] iArr411 = this.MediaMetadataCompat;
                int i722 = this.AudioAttributesImplApi21Parcelizer;
                iArr411[i722] = 1;
                int i723 = i722 - 2;
                this.AudioAttributesImplApi21Parcelizer = i723;
                Object[] objArr218 = this.onCustomAction;
                Object obj166 = objArr218[i723];
                objArr218[i723] = null;
                ((int[]) obj166)[iArr411[i722 - 1]] = iArr411[i722];
                return 0;
            case 560:
                int[] iArr412 = this.MediaMetadataCompat;
                int i724 = this.AudioAttributesImplApi21Parcelizer;
                iArr412[i724] = iArr412[i724 - 1];
                iArr412[i724 + 1] = 1;
                int i725 = i724 + 1;
                this.AudioAttributesImplApi21Parcelizer = i725;
                iArr412[i724] = iArr412[i724] - iArr412[i725];
                return 0;
            case 561:
                int i726 = this.AudioAttributesImplApi21Parcelizer;
                int i727 = i726 - 1;
                this.AudioAttributesImplApi21Parcelizer = i727;
                int[] iArr413 = this.MediaMetadataCompat;
                iArr413[i726 - 2] = iArr413[i726 - 2] * iArr413[i727];
                return 0;
            case 562:
                int[] iArr414 = this.MediaMetadataCompat;
                int i728 = this.AudioAttributesImplApi21Parcelizer;
                iArr414[i728] = 1;
                this.AudioAttributesImplApi21Parcelizer = i728;
                iArr414[i728 - 1] = iArr414[i728 - 1] - iArr414[i728];
                return 0;
            case 563:
                int[] iArr415 = this.MediaMetadataCompat;
                int i729 = this.AudioAttributesImplApi21Parcelizer;
                iArr415[i729] = 1;
                this.AudioAttributesImplApi21Parcelizer = i729 + 2;
                iArr415[i729 + 1] = 1;
                return 0;
            case 564:
                int i730 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr416 = this.MediaMetadataCompat;
                iArr416[55] = iArr416[i730 - 1];
                int i731 = i730 - 2;
                this.AudioAttributesImplApi21Parcelizer = i731;
                iArr416[54] = iArr416[i731];
                return 0;
            case 565:
                int[] iArr417 = this.MediaMetadataCompat;
                int i732 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i732 + 1;
                iArr417[i732] = 0;
                int i733 = iArr417[i732];
                iArr417[i732] = iArr417[i732 - 1];
                iArr417[i732 - 1] = i733;
                return 0;
            case 566:
                int[] iArr418 = this.MediaMetadataCompat;
                int i734 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i734 + 1;
                iArr418[i734] = 3;
                Object[] objArr219 = this.onCustomAction;
                Object obj167 = objArr219[i734 - 1];
                objArr219[i734 - 1] = null;
                objArr219[i734] = obj167;
                iArr418[i734 - 1] = iArr418[i734];
                return 0;
            case 567:
                int i735 = this.AudioAttributesImplApi21Parcelizer;
                int i736 = i735 - 1;
                int[] iArr419 = this.MediaMetadataCompat;
                iArr419[53] = iArr419[i736];
                this.AudioAttributesImplApi21Parcelizer = i735;
                iArr419[i736] = iArr419[54];
                return 0;
            case 568:
                int i737 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr420 = this.MediaMetadataCompat;
                iArr420[i737 - 2] = iArr420[i737 - 2] >>> iArr420[i737 - 1];
                int i738 = i737 - 2;
                iArr420[i737 - 3] = iArr420[i737 - 3] ^ iArr420[i738];
                this.AudioAttributesImplApi21Parcelizer = i737 - 1;
                iArr420[i738] = iArr420[i737 - 3];
                return 0;
            case 569:
                int i739 = this.AudioAttributesImplApi21Parcelizer;
                int i740 = i739 - 1;
                long[] jArr26 = this.MediaBrowserCompatSearchResultReceiver;
                jArr26[18] = jArr26[i740];
                Object[] objArr220 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i739;
                objArr220[i740] = objArr220[80];
                return 0;
            case 570:
                int i741 = this.AudioAttributesImplApi21Parcelizer;
                int i742 = i741 - 1;
                long[] jArr27 = this.MediaBrowserCompatSearchResultReceiver;
                long j = jArr27[i741 - 2];
                int[] iArr421 = this.MediaMetadataCompat;
                jArr27[i741 - 2] = j << iArr421[i742];
                iArr421[i742] = 52;
                int i743 = i741 - 1;
                this.AudioAttributesImplApi21Parcelizer = i743;
                jArr27[i741 - 2] = jArr27[i741 - 2] >>> iArr421[i743];
                return 0;
            case 571:
                int i744 = this.AudioAttributesImplApi21Parcelizer;
                int i745 = i744 - 1;
                this.AudioAttributesImplApi21Parcelizer = i745;
                long[] jArr28 = this.MediaBrowserCompatSearchResultReceiver;
                jArr28[i744 - 2] = jArr28[i744 - 2] - jArr28[i745];
                return 0;
            case 572:
                int[] iArr422 = this.MediaMetadataCompat;
                int i746 = this.AudioAttributesImplApi21Parcelizer;
                iArr422[i746] = 12;
                long[] jArr29 = this.MediaBrowserCompatSearchResultReceiver;
                jArr29[i746 - 1] = jArr29[i746 - 1] >> iArr422[i746];
                int i747 = i746 - 1;
                this.AudioAttributesImplApi21Parcelizer = i747;
                jArr29[20] = jArr29[i747];
                return 0;
            case 573:
                long[] jArr30 = this.MediaBrowserCompatSearchResultReceiver;
                int i748 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i748 + 1;
                jArr30[i748] = jArr30[18];
                return 0;
            case 574:
                long[] jArr31 = this.MediaBrowserCompatSearchResultReceiver;
                int i749 = this.AudioAttributesImplApi21Parcelizer;
                jArr31[i749] = jArr31[20];
                this.AudioAttributesImplApi21Parcelizer = i749;
                this.MediaMetadataCompat[i749 - 1] = (jArr31[i749 - 1] > jArr31[i749] ? 1 : (jArr31[i749 - 1] == jArr31[i749] ? 0 : -1));
                return 0;
            case 575:
                int i750 = this.AudioAttributesImplApi21Parcelizer;
                int i751 = i750 - 1;
                Object[] objArr221 = this.onCustomAction;
                Object obj168 = objArr221[i751];
                objArr221[i751] = null;
                objArr221[9] = obj168;
                int[] iArr423 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i750;
                iArr423[i751] = 4;
                return 0;
            case 576:
                int i752 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i752;
                int[] iArr424 = this.MediaMetadataCompat;
                iArr424[39] = iArr424[i752];
                return 0;
            case 577:
                int i753 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i753;
                int[] iArr425 = this.MediaMetadataCompat;
                iArr425[38] = iArr425[i753];
                return 0;
            case 578:
                int i754 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i754;
                Object[] objArr222 = this.onCustomAction;
                Object obj169 = objArr222[i754];
                objArr222[i754] = null;
                objArr222[37] = obj169;
                return 0;
            case 579:
                int i755 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i755;
                Object[] objArr223 = this.onCustomAction;
                Object obj170 = objArr223[i755];
                objArr223[i755] = null;
                objArr223[36] = obj170;
                return 0;
            case 580:
                Object[] objArr224 = this.onCustomAction;
                int i756 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i756 + 1;
                objArr224[i756] = objArr224[36];
                return 0;
            case 581:
                Object[] objArr225 = this.onCustomAction;
                int i757 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i757 + 1;
                objArr225[i757] = objArr225[37];
                return 0;
            case 582:
                int[] iArr426 = this.MediaMetadataCompat;
                int i758 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i758 + 1;
                iArr426[i758] = iArr426[38];
                return 0;
            case 583:
                int[] iArr427 = this.MediaMetadataCompat;
                int i759 = this.AudioAttributesImplApi21Parcelizer;
                iArr427[i759] = iArr427[39];
                this.AudioAttributesImplApi21Parcelizer = i759;
                iArr427[45] = iArr427[i759];
                return 0;
            case 584:
                int i760 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i760;
                int[] iArr428 = this.MediaMetadataCompat;
                iArr428[44] = iArr428[i760];
                return 0;
            case 585:
                int i761 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i761;
                Object[] objArr226 = this.onCustomAction;
                Object obj171 = objArr226[i761];
                objArr226[i761] = null;
                objArr226[43] = obj171;
                return 0;
            case 586:
                int i762 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr429 = this.MediaMetadataCompat;
                iArr429[42] = iArr429[i762 - 1];
                iArr429[41] = iArr429[i762 - 2];
                int i763 = i762 - 3;
                this.AudioAttributesImplApi21Parcelizer = i763;
                Object[] objArr227 = this.onCustomAction;
                Object obj172 = objArr227[i763];
                objArr227[i763] = null;
                objArr227[40] = obj172;
                return 0;
            case 587:
                Object[] objArr228 = this.onCustomAction;
                int i764 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i764 + 1;
                objArr228[i764] = objArr228[40];
                return 0;
            case 588:
                int i765 = this.AudioAttributesImplApi21Parcelizer;
                int i766 = i765 - 1;
                Object[] objArr229 = this.onCustomAction;
                objArr229[i766] = null;
                this.AudioAttributesImplApi21Parcelizer = i765;
                objArr229[i766] = objArr229[40];
                return 0;
            case 589:
                int[] iArr430 = this.MediaMetadataCompat;
                int i767 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i767 + 1;
                iArr430[i767] = iArr430[41];
                return 0;
            case 590:
                int[] iArr431 = this.MediaMetadataCompat;
                int i768 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i768 + 1;
                iArr431[i768] = iArr431[42];
                return 0;
            case 591:
                Object[] objArr230 = this.onCustomAction;
                int i769 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i769 + 1;
                objArr230[i769] = objArr230[43];
                return 0;
            case 592:
                int[] iArr432 = this.MediaMetadataCompat;
                int i770 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i770 + 1;
                iArr432[i770] = 2;
                Object[] objArr231 = this.onCustomAction;
                Object obj173 = objArr231[i770 - 1];
                objArr231[i770 - 1] = null;
                objArr231[i770] = obj173;
                iArr432[i770 - 1] = iArr432[i770];
                return 0;
            case 593:
                int[] iArr433 = this.MediaMetadataCompat;
                int i771 = this.AudioAttributesImplApi21Parcelizer;
                iArr433[i771] = iArr433[44];
                this.AudioAttributesImplApi21Parcelizer = i771 + 2;
                iArr433[i771 + 1] = iArr433[45];
                return 0;
            case 594:
                int i772 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i772;
                int[] iArr434 = this.MediaMetadataCompat;
                iArr434[43] = iArr434[i772];
                return 0;
            case 595:
                int i773 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i773;
                int[] iArr435 = this.MediaMetadataCompat;
                iArr435[42] = iArr435[i773];
                return 0;
            case 596:
                int[] iArr436 = this.MediaMetadataCompat;
                int i774 = this.AudioAttributesImplApi21Parcelizer;
                iArr436[i774] = iArr436[43];
                iArr436[i774 + 1] = iArr436[42];
                int i775 = i774 + 1;
                this.AudioAttributesImplApi21Parcelizer = i775;
                iArr436[i774] = iArr436[i774] + iArr436[i775];
                return 0;
            case 597:
                int i776 = this.AudioAttributesImplApi21Parcelizer;
                int i777 = i776 - 1;
                int[] iArr437 = this.MediaMetadataCompat;
                iArr437[i776 - 2] = iArr437[i776 - 2] ^ iArr437[i777];
                iArr437[i777] = iArr437[i776 - 2];
                this.AudioAttributesImplApi21Parcelizer = i776 + 1;
                iArr437[i776] = 5;
                return 0;
            case 598:
                int i778 = this.AudioAttributesImplApi21Parcelizer;
                int i779 = i778 - 1;
                int[] iArr438 = this.MediaMetadataCompat;
                iArr438[i778 - 2] = iArr438[i778 - 2] ^ iArr438[i779];
                Object[] objArr232 = this.onCustomAction;
                Object obj174 = objArr232[i778 - 3];
                objArr232[i778 - 3] = null;
                objArr232[i778 - 2] = obj174;
                iArr438[i778 - 3] = iArr438[i778 - 2];
                this.AudioAttributesImplApi21Parcelizer = i778;
                iArr438[i779] = 3;
                return 0;
            case 599:
                Object[] objArr233 = this.onCustomAction;
                int i780 = this.AudioAttributesImplApi21Parcelizer;
                objArr233[i780] = null;
                this.AudioAttributesImplApi21Parcelizer = i780;
                Object obj175 = objArr233[i780];
                objArr233[i780] = null;
                objArr233[9] = obj175;
                return 0;
            case 600:
                float[] fArr6 = this.RatingCompat;
                int i781 = this.AudioAttributesImplApi21Parcelizer;
                fArr6[i781] = 0.0f;
                this.AudioAttributesImplApi21Parcelizer = i781 + 2;
                fArr6[i781 + 1] = 0.0f;
                return 0;
            case 601:
                int i782 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr439 = this.MediaMetadataCompat;
                float[] fArr7 = this.RatingCompat;
                iArr439[i782 - 2] = (fArr7[i782 - 2] > fArr7[i782 - 1] ? 1 : (fArr7[i782 - 2] == fArr7[i782 - 1] ? 0 : -1));
                int i783 = i782 - 2;
                this.AudioAttributesImplApi21Parcelizer = i783;
                iArr439[i782 - 3] = iArr439[i782 - 3] - iArr439[i783];
                iArr439[i782 - 3] = (char) iArr439[i782 - 3];
                return 0;
            case 602:
                int i784 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr440 = this.MediaMetadataCompat;
                iArr440[i784 - 2] = iArr440[i784 - 2] >> iArr440[i784 - 1];
                int i785 = i784 - 2;
                this.AudioAttributesImplApi21Parcelizer = i785;
                iArr440[i784 - 3] = iArr440[i784 - 3] + iArr440[i785];
                return 0;
            case 603:
                Object[] objArr234 = this.onCustomAction;
                int i786 = this.AudioAttributesImplApi21Parcelizer;
                objArr234[i786] = objArr234[i786 - 1];
                this.MediaMetadataCompat[i786 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i786 + 3;
                objArr234[i786 + 2] = objArr234[14];
                return 0;
            case 604:
                int i787 = this.AudioAttributesImplApi21Parcelizer;
                int i788 = i787 - 1;
                int[] iArr441 = this.MediaMetadataCompat;
                int i789 = iArr441[i788];
                iArr441[10] = i789;
                Object[] objArr235 = this.onCustomAction;
                objArr235[i788] = objArr235[9];
                this.AudioAttributesImplApi21Parcelizer = i787 + 1;
                iArr441[i787] = i789;
                return 0;
            case 605:
                Object[] objArr236 = this.onCustomAction;
                int i790 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i790 + 1;
                Object obj176 = objArr236[i790 - 1];
                objArr236[i790 - 1] = null;
                objArr236[i790] = obj176;
                int[] iArr442 = this.MediaMetadataCompat;
                iArr442[i790 - 1] = iArr442[i790 - 2];
                objArr236[i790 - 2] = obj176;
                iArr442[i790] = iArr442[i790 - 1];
                Object obj177 = objArr236[i790];
                objArr236[i790] = null;
                objArr236[i790 - 1] = obj177;
                return 0;
            case 606:
                int i791 = this.AudioAttributesImplApi21Parcelizer;
                int i792 = i791 - 3;
                this.AudioAttributesImplApi21Parcelizer = i792;
                Object[] objArr237 = this.onCustomAction;
                Object obj178 = objArr237[i792];
                objArr237[i792] = null;
                int[] iArr443 = this.MediaMetadataCompat;
                int i793 = iArr443[i791 - 2];
                Object obj179 = objArr237[i791 - 1];
                objArr237[i791 - 1] = null;
                ((Object[]) obj178)[i793] = obj179;
                this.AudioAttributesImplApi21Parcelizer = i791 - 2;
                Object obj180 = objArr237[i791 - 4];
                objArr237[i791 - 4] = null;
                objArr237[i792] = obj180;
                iArr443[i791 - 4] = iArr443[i791 - 5];
                objArr237[i791 - 5] = obj180;
                return 0;
            case 607:
                Object[] objArr238 = this.onCustomAction;
                int i794 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i794 + 1;
                Object obj181 = objArr238[i794 - 1];
                objArr238[i794 - 1] = null;
                objArr238[i794] = obj181;
                int[] iArr444 = this.MediaMetadataCompat;
                iArr444[i794 - 1] = iArr444[i794 - 2];
                objArr238[i794 - 2] = obj181;
                return 0;
            case 608:
                int[] iArr445 = this.MediaMetadataCompat;
                int i795 = this.AudioAttributesImplApi21Parcelizer;
                iArr445[i795] = 1;
                Object[] objArr239 = this.onCustomAction;
                Object obj182 = objArr239[i795 - 1];
                objArr239[i795 - 1] = null;
                objArr239[i795] = obj182;
                iArr445[i795 - 1] = iArr445[i795];
                int i796 = i795 - 2;
                this.AudioAttributesImplApi21Parcelizer = i796;
                Object obj183 = objArr239[i796];
                objArr239[i796] = null;
                int i797 = iArr445[i795 - 1];
                Object obj184 = objArr239[i795];
                objArr239[i795] = null;
                ((Object[]) obj183)[i797] = obj184;
                return 0;
            case 609:
                Object[] objArr240 = this.onCustomAction;
                int i798 = this.AudioAttributesImplApi21Parcelizer;
                Object obj185 = objArr240[i798 - 1];
                objArr240[i798 - 1] = null;
                objArr240[i798] = obj185;
                Object obj186 = objArr240[i798 - 2];
                objArr240[i798 - 2] = null;
                objArr240[i798 - 1] = obj186;
                objArr240[i798 - 2] = obj185;
                Object obj187 = objArr240[i798];
                objArr240[i798] = null;
                Object obj188 = objArr240[i798 - 1];
                objArr240[i798 - 1] = null;
                objArr240[i798] = obj188;
                objArr240[i798 - 1] = obj187;
                int[] iArr446 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i798 + 2;
                iArr446[i798 + 1] = 0;
                return 0;
            case 610:
                int i799 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i799;
                Object[] objArr241 = this.onCustomAction;
                Object obj189 = objArr241[i799];
                objArr241[i799] = null;
                objArr241[46] = obj189;
                return 0;
            case 611:
                Object[] objArr242 = this.onCustomAction;
                int i800 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i800 + 1;
                objArr242[i800] = objArr242[46];
                return 0;
            case 612:
                int i801 = this.AudioAttributesImplApi21Parcelizer;
                int i802 = i801 - 1;
                int[] iArr447 = this.MediaMetadataCompat;
                iArr447[11] = iArr447[i802];
                Object[] objArr243 = this.onCustomAction;
                objArr243[i802] = objArr243[9];
                int i803 = i801 - 1;
                this.AudioAttributesImplApi21Parcelizer = i803;
                Object obj190 = objArr243[i803];
                objArr243[i803] = null;
                objArr243[46] = obj190;
                return 0;
            case 613:
                int[] iArr448 = this.MediaMetadataCompat;
                int i804 = this.AudioAttributesImplApi21Parcelizer;
                iArr448[i804] = 3;
                this.AudioAttributesImplApi21Parcelizer = i804 + 2;
                iArr448[i804 + 1] = 1;
                this.onCustomAction[i804 + 1] = new int[iArr448[i804 + 1]];
                return 0;
            case 614:
                Object[] objArr244 = this.onCustomAction;
                int i805 = this.AudioAttributesImplApi21Parcelizer;
                objArr244[i805] = objArr244[46];
                int[] iArr449 = this.MediaMetadataCompat;
                iArr449[i805 + 1] = 3;
                int i806 = i805 + 1;
                this.AudioAttributesImplApi21Parcelizer = i806;
                Object obj191 = objArr244[i805];
                objArr244[i805] = null;
                objArr244[i805] = ((Object[]) obj191)[iArr449[i806]];
                return 0;
            case 615:
                int[] iArr450 = this.MediaMetadataCompat;
                int i807 = this.AudioAttributesImplApi21Parcelizer;
                iArr450[i807] = 0;
                iArr450[39] = iArr450[i807];
                int i808 = i807 - 1;
                this.AudioAttributesImplApi21Parcelizer = i808;
                iArr450[38] = iArr450[i808];
                return 0;
            case 616:
                int i809 = this.AudioAttributesImplApi21Parcelizer;
                int i810 = i809 - 1;
                Object[] objArr245 = this.onCustomAction;
                Object obj192 = objArr245[i810];
                objArr245[i810] = null;
                objArr245[36] = obj192;
                this.AudioAttributesImplApi21Parcelizer = i809;
                objArr245[i810] = obj192;
                return 0;
            case 617:
                Object[] objArr246 = this.onCustomAction;
                int i811 = this.AudioAttributesImplApi21Parcelizer;
                objArr246[i811] = objArr246[37];
                int[] iArr451 = this.MediaMetadataCompat;
                iArr451[i811 + 1] = 0;
                int i812 = i811 + 1;
                this.AudioAttributesImplApi21Parcelizer = i812;
                Object obj193 = objArr246[i811];
                objArr246[i811] = null;
                objArr246[i811] = ((Object[]) obj193)[iArr451[i812]];
                return 0;
            case 618:
                int[] iArr452 = this.MediaMetadataCompat;
                int i813 = this.AudioAttributesImplApi21Parcelizer;
                iArr452[i813] = iArr452[38];
                iArr452[i813 + 1] = iArr452[39];
                int i814 = i813 + 1;
                this.AudioAttributesImplApi21Parcelizer = i814;
                iArr452[45] = iArr452[i814];
                return 0;
            case 619:
                int i815 = this.AudioAttributesImplApi21Parcelizer;
                int i816 = i815 - 1;
                Object[] objArr247 = this.onCustomAction;
                Object obj194 = objArr247[i816];
                objArr247[i816] = null;
                objArr247[43] = obj194;
                int[] iArr453 = this.MediaMetadataCompat;
                iArr453[42] = iArr453[i815 - 2];
                int i817 = i815 - 3;
                this.AudioAttributesImplApi21Parcelizer = i817;
                iArr453[41] = iArr453[i817];
                return 0;
            case 620:
                int i818 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i818;
                Object[] objArr248 = this.onCustomAction;
                Object obj195 = objArr248[i818];
                objArr248[i818] = null;
                objArr248[40] = obj195;
                return 0;
            case 621:
                Object[] objArr249 = this.onCustomAction;
                int i819 = this.AudioAttributesImplApi21Parcelizer;
                objArr249[i819] = objArr249[40];
                objArr249[i819] = null;
                this.AudioAttributesImplApi21Parcelizer = i819 + 1;
                objArr249[i819] = objArr249[40];
                return 0;
            case 622:
                int[] iArr454 = this.MediaMetadataCompat;
                int i820 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i820 + 1;
                iArr454[i820] = iArr454[41];
                Object[] objArr250 = this.onCustomAction;
                Object obj196 = objArr250[i820 - 1];
                objArr250[i820 - 1] = null;
                objArr250[i820] = obj196;
                iArr454[i820 - 1] = iArr454[i820];
                return 0;
            case 623:
                int i821 = this.AudioAttributesImplApi21Parcelizer;
                int i822 = i821 - 3;
                this.AudioAttributesImplApi21Parcelizer = i822;
                Object[] objArr251 = this.onCustomAction;
                Object obj197 = objArr251[i822];
                objArr251[i822] = null;
                int[] iArr455 = this.MediaMetadataCompat;
                ((int[]) obj197)[iArr455[i821 - 2]] = iArr455[i821 - 1];
                objArr251[i822] = objArr251[40];
                this.AudioAttributesImplApi21Parcelizer = i821 - 1;
                objArr251[i821 - 2] = objArr251[43];
                return 0;
            case 624:
                int i823 = this.AudioAttributesImplApi21Parcelizer;
                int i824 = i823 - 3;
                this.AudioAttributesImplApi21Parcelizer = i824;
                Object[] objArr252 = this.onCustomAction;
                Object obj198 = objArr252[i824];
                objArr252[i824] = null;
                int i825 = this.MediaMetadataCompat[i823 - 2];
                Object obj199 = objArr252[i823 - 1];
                objArr252[i823 - 1] = null;
                ((Object[]) obj198)[i825] = obj199;
                this.AudioAttributesImplApi21Parcelizer = i823 - 2;
                objArr252[i824] = objArr252[40];
                return 0;
            case 625:
                int[] iArr456 = this.MediaMetadataCompat;
                int i826 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i826 + 1;
                iArr456[i826] = iArr456[44];
                return 0;
            case 626:
                int[] iArr457 = this.MediaMetadataCompat;
                int i827 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i827 + 1;
                iArr457[i827] = iArr457[45];
                return 0;
            case 627:
                int i828 = this.AudioAttributesImplApi21Parcelizer;
                int i829 = i828 - 1;
                int[] iArr458 = this.MediaMetadataCompat;
                iArr458[42] = iArr458[i829];
                this.AudioAttributesImplApi21Parcelizer = i828;
                iArr458[i829] = iArr458[43];
                return 0;
            case 628:
                int[] iArr459 = this.MediaMetadataCompat;
                int i830 = this.AudioAttributesImplApi21Parcelizer;
                iArr459[i830] = iArr459[42];
                iArr459[i830 - 1] = iArr459[i830 - 1] + iArr459[i830];
                int i831 = i830 - 1;
                this.AudioAttributesImplApi21Parcelizer = i831;
                iArr459[i830 - 2] = iArr459[i830 - 2] + iArr459[i831];
                return 0;
            case 629:
                int[] iArr460 = this.MediaMetadataCompat;
                int i832 = this.AudioAttributesImplApi21Parcelizer;
                iArr460[i832] = iArr460[i832 - 1];
                this.AudioAttributesImplApi21Parcelizer = i832 + 2;
                iArr460[i832 + 1] = 5;
                return 0;
            case 630:
                Object[] objArr253 = this.onCustomAction;
                int i833 = this.AudioAttributesImplApi21Parcelizer;
                Object obj200 = objArr253[i833 - 2];
                objArr253[i833 - 2] = null;
                objArr253[i833 - 1] = obj200;
                int[] iArr461 = this.MediaMetadataCompat;
                iArr461[i833 - 2] = iArr461[i833 - 1];
                iArr461[i833] = 3;
                this.AudioAttributesImplApi21Parcelizer = i833;
                Object obj201 = objArr253[i833 - 1];
                objArr253[i833 - 1] = null;
                objArr253[i833 - 1] = ((Object[]) obj201)[iArr461[i833]];
                return 0;
            case 631:
                Object[] objArr254 = this.onCustomAction;
                int i834 = this.AudioAttributesImplApi21Parcelizer;
                objArr254[i834] = objArr254[i834 - 1];
                int[] iArr462 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i834 + 2;
                iArr462[i834 + 1] = 3;
                return 0;
            case 632:
                Object[] objArr255 = this.onCustomAction;
                int i835 = this.AudioAttributesImplApi21Parcelizer;
                objArr255[i835] = objArr255[9];
                objArr255[i835 + 1] = objArr255[i835];
                int i836 = i835 + 1;
                this.AudioAttributesImplApi21Parcelizer = i836;
                Object obj202 = objArr255[i836];
                objArr255[i836] = null;
                objArr255[46] = obj202;
                return 0;
            case 633:
                int i837 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr463 = this.MediaMetadataCompat;
                iArr463[39] = iArr463[i837 - 1];
                int i838 = i837 - 2;
                this.AudioAttributesImplApi21Parcelizer = i838;
                iArr463[38] = iArr463[i838];
                return 0;
            case 634:
                int i839 = this.AudioAttributesImplApi21Parcelizer;
                int i840 = i839 - 1;
                Object[] objArr256 = this.onCustomAction;
                Object obj203 = objArr256[i840];
                objArr256[i840] = null;
                objArr256[37] = obj203;
                int i841 = i839 - 2;
                Object obj204 = objArr256[i841];
                objArr256[i841] = null;
                objArr256[36] = obj204;
                this.AudioAttributesImplApi21Parcelizer = i839 - 1;
                objArr256[i841] = obj204;
                return 0;
            case 635:
                Object[] objArr257 = this.onCustomAction;
                int i842 = this.AudioAttributesImplApi21Parcelizer;
                objArr257[i842] = objArr257[37];
                int[] iArr464 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i842 + 2;
                iArr464[i842 + 1] = 0;
                return 0;
            case 636:
                Object[] objArr258 = this.onCustomAction;
                int i843 = this.AudioAttributesImplApi21Parcelizer;
                objArr258[i843] = objArr258[37];
                int[] iArr465 = this.MediaMetadataCompat;
                iArr465[i843 + 1] = 2;
                int i844 = i843 + 1;
                this.AudioAttributesImplApi21Parcelizer = i844;
                Object obj205 = objArr258[i843];
                objArr258[i843] = null;
                objArr258[i843] = ((Object[]) obj205)[iArr465[i844]];
                return 0;
            case 637:
                int i845 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr466 = this.MediaMetadataCompat;
                iArr466[44] = iArr466[i845 - 1];
                int i846 = i845 - 2;
                this.AudioAttributesImplApi21Parcelizer = i846;
                Object[] objArr259 = this.onCustomAction;
                Object obj206 = objArr259[i846];
                objArr259[i846] = null;
                objArr259[43] = obj206;
                return 0;
            case 638:
                Object[] objArr260 = this.onCustomAction;
                int i847 = this.AudioAttributesImplApi21Parcelizer;
                objArr260[i847] = objArr260[40];
                objArr260[i847 + 1] = objArr260[43];
                int[] iArr467 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i847 + 3;
                iArr467[i847 + 2] = 2;
                return 0;
            case 639:
                int i848 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr468 = this.MediaMetadataCompat;
                iArr468[43] = iArr468[i848 - 1];
                int i849 = i848 - 2;
                this.AudioAttributesImplApi21Parcelizer = i849;
                iArr468[42] = iArr468[i849];
                return 0;
            case 640:
                int[] iArr469 = this.MediaMetadataCompat;
                int i850 = this.AudioAttributesImplApi21Parcelizer;
                iArr469[i850] = iArr469[43];
                this.AudioAttributesImplApi21Parcelizer = i850 + 2;
                iArr469[i850 + 1] = iArr469[42];
                return 0;
            case 641:
                int i851 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr470 = this.MediaMetadataCompat;
                iArr470[i851 - 2] = iArr470[i851 - 2] << iArr470[i851 - 1];
                int i852 = i851 - 2;
                iArr470[i851 - 3] = iArr470[i851 - 3] ^ iArr470[i852];
                this.AudioAttributesImplApi21Parcelizer = i851 - 1;
                iArr470[i852] = iArr470[i851 - 3];
                return 0;
            case 642:
                Object[] objArr261 = this.onCustomAction;
                int i853 = this.AudioAttributesImplApi21Parcelizer;
                objArr261[i853] = objArr261[i853 - 1];
                objArr261[i853] = null;
                this.AudioAttributesImplApi21Parcelizer = i853 + 1;
                objArr261[i853] = objArr261[9];
                return 0;
            case 643:
                Object[] objArr262 = this.onCustomAction;
                int i854 = this.AudioAttributesImplApi21Parcelizer;
                objArr262[i854] = objArr262[i854 - 1];
                Object obj207 = objArr262[i854];
                objArr262[i854] = null;
                objArr262[46] = obj207;
                this.AudioAttributesImplApi21Parcelizer = i854 + 1;
                objArr262[i854] = obj207;
                return 0;
            case 644:
                int[] iArr471 = this.MediaMetadataCompat;
                int i855 = this.AudioAttributesImplApi21Parcelizer;
                iArr471[i855] = 0;
                this.AudioAttributesImplApi21Parcelizer = i855;
                Object[] objArr263 = this.onCustomAction;
                Object obj208 = objArr263[i855 - 1];
                objArr263[i855 - 1] = null;
                iArr471[i855 - 1] = ((int[]) obj208)[iArr471[i855]];
                this.AudioAttributesImplApi21Parcelizer = i855 + 1;
                iArr471[i855] = 0;
                return 0;
            case 645:
                int i856 = this.AudioAttributesImplApi21Parcelizer;
                int i857 = i856 - 1;
                this.AudioAttributesImplApi21Parcelizer = i857;
                int[] iArr472 = this.MediaMetadataCompat;
                Object[] objArr264 = this.onCustomAction;
                Object obj209 = objArr264[i856 - 2];
                objArr264[i856 - 2] = null;
                iArr472[i856 - 2] = ((int[]) obj209)[iArr472[i857]];
                this.AudioAttributesImplApi21Parcelizer = i856;
                objArr264[i857] = objArr264[37];
                return 0;
            case 646:
                int i858 = this.AudioAttributesImplApi21Parcelizer;
                int i859 = i858 - 1;
                Object[] objArr265 = this.onCustomAction;
                Object obj210 = objArr265[i859];
                objArr265[i859] = null;
                objArr265[40] = obj210;
                objArr265[i859] = obj210;
                int i860 = i858 - 1;
                this.AudioAttributesImplApi21Parcelizer = i860;
                objArr265[i860] = null;
                return 0;
            case 647:
                Object[] objArr266 = this.onCustomAction;
                int i861 = this.AudioAttributesImplApi21Parcelizer;
                objArr266[i861] = objArr266[40];
                int[] iArr473 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i861 + 2;
                iArr473[i861 + 1] = iArr473[41];
                return 0;
            case 648:
                int[] iArr474 = this.MediaMetadataCompat;
                int i862 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i862 + 1;
                iArr474[i862] = iArr474[42];
                Object[] objArr267 = this.onCustomAction;
                Object obj211 = objArr267[i862 - 1];
                objArr267[i862 - 1] = null;
                objArr267[i862] = obj211;
                iArr474[i862 - 1] = iArr474[i862];
                return 0;
            case 649:
                int i863 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr475 = this.MediaMetadataCompat;
                iArr475[i863 - 2] = iArr475[i863 - 2] + iArr475[i863 - 1];
                int i864 = i863 - 2;
                iArr475[i863 - 3] = iArr475[i863 - 3] + iArr475[i864];
                this.AudioAttributesImplApi21Parcelizer = i863 - 1;
                iArr475[i864] = iArr475[i863 - 3];
                return 0;
            case 650:
                int i865 = this.AudioAttributesImplApi21Parcelizer;
                int i866 = i865 - 1;
                Object[] objArr268 = this.onCustomAction;
                Object obj212 = objArr268[i866];
                objArr268[i866] = null;
                objArr268[46] = obj212;
                this.AudioAttributesImplApi21Parcelizer = i865;
                objArr268[i866] = obj212;
                return 0;
            case 651:
                int[] iArr476 = this.MediaMetadataCompat;
                int i867 = this.AudioAttributesImplApi21Parcelizer;
                iArr476[i867] = iArr476[13];
                Object[] objArr269 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i867 + 2;
                objArr269[i867 + 1] = objArr269[14];
                return 0;
            case 652:
                int[] iArr477 = this.MediaMetadataCompat;
                int i868 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr270 = this.onCustomAction;
                Object obj213 = objArr270[i868 - 1];
                objArr270[i868 - 1] = null;
                iArr477[i868 - 1] = ((Object[]) obj213).length;
                return 0;
            case 653:
                Object[] objArr271 = this.onCustomAction;
                int i869 = this.AudioAttributesImplApi21Parcelizer;
                objArr271[i869] = objArr271[83];
                int[] iArr478 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i869 + 2;
                iArr478[i869 + 1] = 0;
                return 0;
            case 654:
                Object[] objArr272 = this.onCustomAction;
                int i870 = this.AudioAttributesImplApi21Parcelizer;
                Object obj214 = objArr272[i870 - 1];
                objArr272[i870 - 1] = null;
                Object obj215 = objArr272[i870 - 2];
                objArr272[i870 - 2] = null;
                objArr272[i870 - 1] = obj215;
                objArr272[i870 - 2] = obj214;
                this.AudioAttributesImplApi21Parcelizer = i870 + 1;
                Object obj216 = objArr272[i870 - 1];
                objArr272[i870 - 1] = null;
                objArr272[i870] = obj216;
                Object obj217 = objArr272[i870 - 2];
                objArr272[i870 - 2] = null;
                objArr272[i870 - 1] = obj217;
                objArr272[i870 - 2] = obj216;
                return 0;
            case 655:
                Object[] objArr273 = this.onCustomAction;
                int i871 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i871 + 1;
                Object obj218 = objArr273[i871 - 1];
                objArr273[i871 - 1] = null;
                objArr273[i871] = obj218;
                Object obj219 = objArr273[i871 - 2];
                objArr273[i871 - 2] = null;
                objArr273[i871 - 1] = obj219;
                objArr273[i871 - 2] = obj218;
                return 0;
            case 656:
                Object[] objArr274 = this.onCustomAction;
                int i872 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i872 + 1;
                Object obj220 = objArr274[i872 - 1];
                objArr274[i872 - 1] = null;
                objArr274[i872] = obj220;
                Object obj221 = objArr274[i872 - 2];
                objArr274[i872 - 2] = null;
                objArr274[i872 - 1] = obj221;
                objArr274[i872 - 2] = obj220;
                Object obj222 = objArr274[i872];
                objArr274[i872] = null;
                Object obj223 = objArr274[i872 - 1];
                objArr274[i872 - 1] = null;
                objArr274[i872] = obj223;
                objArr274[i872 - 1] = obj222;
                return 0;
            case 657:
                int i873 = this.AudioAttributesImplApi21Parcelizer;
                int i874 = i873 - 3;
                this.AudioAttributesImplApi21Parcelizer = i874;
                Object[] objArr275 = this.onCustomAction;
                Object obj224 = objArr275[i874];
                objArr275[i874] = null;
                int[] iArr479 = this.MediaMetadataCompat;
                int i875 = iArr479[i873 - 2];
                Object obj225 = objArr275[i873 - 1];
                objArr275[i873 - 1] = null;
                ((Object[]) obj224)[i875] = obj225;
                objArr275[i874] = objArr275[i873 - 4];
                this.AudioAttributesImplApi21Parcelizer = i873 - 1;
                iArr479[i873 - 2] = 1;
                return 0;
            case 658:
                Object[] objArr276 = this.onCustomAction;
                int i876 = this.AudioAttributesImplApi21Parcelizer;
                Object obj226 = objArr276[i876 - 1];
                objArr276[i876 - 1] = null;
                Object obj227 = objArr276[i876 - 2];
                objArr276[i876 - 2] = null;
                objArr276[i876 - 1] = obj227;
                objArr276[i876 - 2] = obj226;
                this.AudioAttributesImplApi21Parcelizer = i876 + 1;
                objArr276[i876] = null;
                return 0;
            case 659:
                Object[] objArr277 = this.onCustomAction;
                int i877 = this.AudioAttributesImplApi21Parcelizer;
                objArr277[i877] = objArr277[46];
                int[] iArr480 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i877 + 2;
                iArr480[i877 + 1] = 3;
                return 0;
            case 660:
                int i878 = this.AudioAttributesImplApi21Parcelizer;
                int i879 = i878 - 1;
                Object[] objArr278 = this.onCustomAction;
                Object obj228 = objArr278[i879];
                objArr278[i879] = null;
                objArr278[37] = obj228;
                int i880 = i878 - 2;
                this.AudioAttributesImplApi21Parcelizer = i880;
                Object obj229 = objArr278[i880];
                objArr278[i880] = null;
                objArr278[36] = obj229;
                return 0;
            case 661:
                Object[] objArr279 = this.onCustomAction;
                int i881 = this.AudioAttributesImplApi21Parcelizer;
                objArr279[i881] = objArr279[37];
                int[] iArr481 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i881 + 2;
                iArr481[i881 + 1] = 1;
                return 0;
            case 662:
                Object[] objArr280 = this.onCustomAction;
                int i882 = this.AudioAttributesImplApi21Parcelizer;
                objArr280[i882] = objArr280[37];
                int[] iArr482 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i882 + 2;
                iArr482[i882 + 1] = 2;
                return 0;
            case 663:
                Object[] objArr281 = this.onCustomAction;
                int i883 = this.AudioAttributesImplApi21Parcelizer;
                objArr281[i883] = objArr281[40];
                this.AudioAttributesImplApi21Parcelizer = i883;
                objArr281[i883] = null;
                return 0;
            case 664:
                int[] iArr483 = this.MediaMetadataCompat;
                int i884 = this.AudioAttributesImplApi21Parcelizer;
                iArr483[i884] = iArr483[41];
                Object[] objArr282 = this.onCustomAction;
                Object obj230 = objArr282[i884 - 1];
                objArr282[i884 - 1] = null;
                objArr282[i884] = obj230;
                iArr483[i884 - 1] = iArr483[i884];
                this.AudioAttributesImplApi21Parcelizer = i884 + 2;
                iArr483[i884 + 1] = 0;
                return 0;
            case 665:
                int i885 = this.AudioAttributesImplApi21Parcelizer;
                int i886 = i885 - 3;
                this.AudioAttributesImplApi21Parcelizer = i886;
                Object[] objArr283 = this.onCustomAction;
                Object obj231 = objArr283[i886];
                objArr283[i886] = null;
                int[] iArr484 = this.MediaMetadataCompat;
                ((int[]) obj231)[iArr484[i885 - 2]] = iArr484[i885 - 1];
                this.AudioAttributesImplApi21Parcelizer = i885 - 2;
                objArr283[i886] = objArr283[40];
                return 0;
            case 666:
                int i887 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr485 = this.MediaMetadataCompat;
                int i888 = iArr485[i887 - 1];
                iArr485[43] = i888;
                int i889 = i887 - 2;
                iArr485[42] = iArr485[i889];
                this.AudioAttributesImplApi21Parcelizer = i887 - 1;
                iArr485[i889] = i888;
                return 0;
            case 667:
                int i890 = this.AudioAttributesImplApi21Parcelizer;
                int i891 = i890 - 1;
                Object[] objArr284 = this.onCustomAction;
                Object obj232 = objArr284[i891];
                objArr284[i891] = null;
                objArr284[9] = obj232;
                int[] iArr486 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i890;
                iArr486[i891] = iArr486[10];
                return 0;
            case 668:
                int[] iArr487 = this.MediaMetadataCompat;
                int i892 = this.AudioAttributesImplApi21Parcelizer;
                iArr487[i892] = iArr487[11];
                this.AudioAttributesImplApi21Parcelizer = i892;
                iArr487[i892 - 1] = iArr487[i892 - 1] ^ iArr487[i892];
                this.MediaBrowserCompatSearchResultReceiver[i892 - 1] = iArr487[i892 - 1];
                return 0;
            case 669:
                int i893 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr32 = this.MediaBrowserCompatSearchResultReceiver;
                jArr32[i893 - 2] = jArr32[i893 - 2] | jArr32[i893 - 1];
                int i894 = i893 - 2;
                this.AudioAttributesImplApi21Parcelizer = i894;
                jArr32[22] = jArr32[i894];
                return 0;
            case 670:
                long[] jArr33 = this.MediaBrowserCompatSearchResultReceiver;
                int i895 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i895 + 1;
                jArr33[i895] = jArr33[22];
                return 0;
            case 671:
                int i896 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr488 = this.MediaMetadataCompat;
                iArr488[38] = iArr488[i896 - 1];
                int i897 = i896 - 2;
                Object[] objArr285 = this.onCustomAction;
                Object obj233 = objArr285[i897];
                objArr285[i897] = null;
                objArr285[37] = obj233;
                int i898 = i896 - 3;
                this.AudioAttributesImplApi21Parcelizer = i898;
                Object obj234 = objArr285[i898];
                objArr285[i898] = null;
                objArr285[36] = obj234;
                return 0;
            case 672:
                Object[] objArr286 = this.onCustomAction;
                int i899 = this.AudioAttributesImplApi21Parcelizer;
                objArr286[i899] = objArr286[36];
                this.AudioAttributesImplApi21Parcelizer = i899 + 2;
                objArr286[i899 + 1] = objArr286[37];
                return 0;
            case 673:
                int[] iArr489 = this.MediaMetadataCompat;
                int i900 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i900 + 1;
                iArr489[i900] = iArr489[39];
                return 0;
            case 674:
                int i901 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr490 = this.MediaMetadataCompat;
                iArr490[45] = iArr490[i901 - 1];
                iArr490[44] = iArr490[i901 - 2];
                int i902 = i901 - 3;
                this.AudioAttributesImplApi21Parcelizer = i902;
                Object[] objArr287 = this.onCustomAction;
                Object obj235 = objArr287[i902];
                objArr287[i902] = null;
                objArr287[43] = obj235;
                return 0;
            case 675:
                int i903 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i903;
                int[] iArr491 = this.MediaMetadataCompat;
                iArr491[41] = iArr491[i903];
                return 0;
            case 676:
                Object[] objArr288 = this.onCustomAction;
                int i904 = this.AudioAttributesImplApi21Parcelizer;
                objArr288[i904] = objArr288[40];
                int[] iArr492 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i904 + 2;
                iArr492[i904 + 1] = iArr492[42];
                return 0;
            case 677:
                Object[] objArr289 = this.onCustomAction;
                int i905 = this.AudioAttributesImplApi21Parcelizer;
                objArr289[i905] = objArr289[40];
                int[] iArr493 = this.MediaMetadataCompat;
                iArr493[i905 + 1] = iArr493[44];
                this.AudioAttributesImplApi21Parcelizer = i905 + 3;
                iArr493[i905 + 2] = iArr493[45];
                return 0;
            case 678:
                int[] iArr494 = this.MediaMetadataCompat;
                int i906 = this.AudioAttributesImplApi21Parcelizer;
                iArr494[i906] = iArr494[42];
                this.AudioAttributesImplApi21Parcelizer = i906;
                iArr494[i906 - 1] = iArr494[i906 - 1] + iArr494[i906];
                return 0;
            case 679:
                int i907 = this.AudioAttributesImplApi21Parcelizer;
                int i908 = i907 - 1;
                long[] jArr34 = this.MediaBrowserCompatSearchResultReceiver;
                jArr34[24] = jArr34[i908];
                Object[] objArr290 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i907;
                objArr290[i908] = objArr290[80];
                return 0;
            case 680:
                int i909 = this.AudioAttributesImplApi21Parcelizer;
                int i910 = i909 - 1;
                this.AudioAttributesImplApi21Parcelizer = i910;
                long[] jArr35 = this.MediaBrowserCompatSearchResultReceiver;
                jArr35[i909 - 2] = jArr35[i909 - 2] << this.MediaMetadataCompat[i910];
                return 0;
            case 681:
                int[] iArr495 = this.MediaMetadataCompat;
                int i911 = this.AudioAttributesImplApi21Parcelizer;
                iArr495[i911] = 52;
                long[] jArr36 = this.MediaBrowserCompatSearchResultReceiver;
                jArr36[i911 - 1] = jArr36[i911 - 1] >>> iArr495[i911];
                int i912 = i911 - 1;
                this.AudioAttributesImplApi21Parcelizer = i912;
                jArr36[i911 - 2] = jArr36[i911 - 2] - jArr36[i912];
                return 0;
            case 682:
                int[] iArr496 = this.MediaMetadataCompat;
                int i913 = this.AudioAttributesImplApi21Parcelizer;
                iArr496[i913] = 12;
                long[] jArr37 = this.MediaBrowserCompatSearchResultReceiver;
                jArr37[i913 - 1] = jArr37[i913 - 1] >> iArr496[i913];
                int i914 = i913 - 1;
                this.AudioAttributesImplApi21Parcelizer = i914;
                jArr37[26] = jArr37[i914];
                return 0;
            case 683:
                long[] jArr38 = this.MediaBrowserCompatSearchResultReceiver;
                int i915 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i915 + 1;
                jArr38[i915] = jArr38[24];
                return 0;
            case 684:
                long[] jArr39 = this.MediaBrowserCompatSearchResultReceiver;
                int i916 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i916 + 1;
                jArr39[i916] = jArr39[26];
                return 0;
            case 685:
                int[] iArr497 = this.MediaMetadataCompat;
                int i917 = this.AudioAttributesImplApi21Parcelizer;
                iArr497[i917] = 0;
                this.AudioAttributesImplApi21Parcelizer = i917;
                iArr497[72] = iArr497[i917];
                return 0;
            case 686:
                int i918 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr498 = this.MediaMetadataCompat;
                iArr498[71] = iArr498[i918 - 1];
                int i919 = i918 - 2;
                this.AudioAttributesImplApi21Parcelizer = i919;
                Object[] objArr291 = this.onCustomAction;
                Object obj236 = objArr291[i919];
                objArr291[i919] = null;
                objArr291[70] = obj236;
                return 0;
            case 687:
                int i920 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i920;
                Object[] objArr292 = this.onCustomAction;
                Object obj237 = objArr292[i920];
                objArr292[i920] = null;
                objArr292[69] = obj237;
                return 0;
            case 688:
                Object[] objArr293 = this.onCustomAction;
                int i921 = this.AudioAttributesImplApi21Parcelizer;
                objArr293[i921] = objArr293[69];
                objArr293[i921 + 1] = objArr293[70];
                int[] iArr499 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i921 + 3;
                iArr499[i921 + 2] = 3;
                return 0;
            case 689:
                int i922 = this.AudioAttributesImplApi21Parcelizer;
                int i923 = i922 - 1;
                this.AudioAttributesImplApi21Parcelizer = i923;
                int[] iArr500 = this.MediaMetadataCompat;
                Object[] objArr294 = this.onCustomAction;
                Object obj238 = objArr294[i922 - 2];
                objArr294[i922 - 2] = null;
                iArr500[i922 - 2] = ((int[]) obj238)[iArr500[i923]];
                this.AudioAttributesImplApi21Parcelizer = i922;
                objArr294[i923] = objArr294[70];
                return 0;
            case 690:
                int i924 = this.AudioAttributesImplApi21Parcelizer;
                int i925 = i924 - 1;
                this.AudioAttributesImplApi21Parcelizer = i925;
                int[] iArr501 = this.MediaMetadataCompat;
                Object[] objArr295 = this.onCustomAction;
                Object obj239 = objArr295[i924 - 2];
                objArr295[i924 - 2] = null;
                iArr501[i924 - 2] = ((int[]) obj239)[iArr501[i925]];
                objArr295[i925] = objArr295[70];
                this.AudioAttributesImplApi21Parcelizer = i924 + 1;
                iArr501[i924] = 2;
                return 0;
            case 691:
                int[] iArr502 = this.MediaMetadataCompat;
                int i926 = this.AudioAttributesImplApi21Parcelizer;
                iArr502[i926] = iArr502[71];
                iArr502[i926 + 1] = iArr502[72];
                int i927 = i926 + 1;
                this.AudioAttributesImplApi21Parcelizer = i927;
                iArr502[78] = iArr502[i927];
                return 0;
            case 692:
                int i928 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr503 = this.MediaMetadataCompat;
                iArr503[77] = iArr503[i928 - 1];
                int i929 = i928 - 2;
                this.AudioAttributesImplApi21Parcelizer = i929;
                Object[] objArr296 = this.onCustomAction;
                Object obj240 = objArr296[i929];
                objArr296[i929] = null;
                objArr296[76] = obj240;
                return 0;
            case 693:
                int i930 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i930;
                int[] iArr504 = this.MediaMetadataCompat;
                iArr504[75] = iArr504[i930];
                return 0;
            case 694:
                int i931 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr505 = this.MediaMetadataCompat;
                iArr505[74] = iArr505[i931 - 1];
                int i932 = i931 - 2;
                this.AudioAttributesImplApi21Parcelizer = i932;
                Object[] objArr297 = this.onCustomAction;
                Object obj241 = objArr297[i932];
                objArr297[i932] = null;
                objArr297[73] = obj241;
                return 0;
            case 695:
                Object[] objArr298 = this.onCustomAction;
                int i933 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i933 + 1;
                objArr298[i933] = objArr298[73];
                return 0;
            case 696:
                int i934 = this.AudioAttributesImplApi21Parcelizer;
                int i935 = i934 - 1;
                Object[] objArr299 = this.onCustomAction;
                objArr299[i935] = null;
                objArr299[i935] = objArr299[73];
                int[] iArr506 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i934 + 1;
                iArr506[i934] = iArr506[74];
                return 0;
            case 697:
                Object[] objArr300 = this.onCustomAction;
                int i936 = this.AudioAttributesImplApi21Parcelizer;
                Object obj242 = objArr300[i936 - 2];
                objArr300[i936 - 2] = null;
                objArr300[i936 - 1] = obj242;
                int[] iArr507 = this.MediaMetadataCompat;
                iArr507[i936 - 2] = iArr507[i936 - 1];
                this.AudioAttributesImplApi21Parcelizer = i936 + 1;
                iArr507[i936] = 3;
                return 0;
            case 698:
                Object[] objArr301 = this.onCustomAction;
                int i937 = this.AudioAttributesImplApi21Parcelizer;
                objArr301[i937] = objArr301[73];
                int[] iArr508 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i937 + 2;
                iArr508[i937 + 1] = iArr508[75];
                Object obj243 = objArr301[i937];
                objArr301[i937] = null;
                objArr301[i937 + 1] = obj243;
                iArr508[i937] = iArr508[i937 + 1];
                return 0;
            case 699:
                Object[] objArr302 = this.onCustomAction;
                int i938 = this.AudioAttributesImplApi21Parcelizer;
                objArr302[i938] = objArr302[73];
                objArr302[i938 + 1] = objArr302[76];
                int[] iArr509 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i938 + 3;
                iArr509[i938 + 2] = 2;
                return 0;
            case 700:
                Object[] objArr303 = this.onCustomAction;
                int i939 = this.AudioAttributesImplApi21Parcelizer;
                objArr303[i939] = objArr303[73];
                int[] iArr510 = this.MediaMetadataCompat;
                iArr510[i939 + 1] = iArr510[77];
                this.AudioAttributesImplApi21Parcelizer = i939 + 3;
                iArr510[i939 + 2] = iArr510[78];
                return 0;
            case 701:
                int i940 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i940;
                int[] iArr511 = this.MediaMetadataCompat;
                iArr511[76] = iArr511[i940];
                return 0;
            case 702:
                int[] iArr512 = this.MediaMetadataCompat;
                int i941 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i941 + 1;
                iArr512[i941] = iArr512[76];
                return 0;
            case 703:
                int[] iArr513 = this.MediaMetadataCompat;
                int i942 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i942 + 1;
                iArr513[i942] = iArr513[75];
                return 0;
            case 704:
                int[] iArr514 = this.MediaMetadataCompat;
                int i943 = this.AudioAttributesImplApi21Parcelizer;
                iArr514[i943] = iArr514[i943 - 1];
                iArr514[i943 + 1] = 13;
                int i944 = i943 + 1;
                this.AudioAttributesImplApi21Parcelizer = i944;
                iArr514[i943] = iArr514[i943] << iArr514[i944];
                return 0;
            case 705:
                int[] iArr515 = this.MediaMetadataCompat;
                int i945 = this.AudioAttributesImplApi21Parcelizer;
                iArr515[i945] = 16;
                this.AudioAttributesImplApi21Parcelizer = i945;
                iArr515[i945 - 1] = iArr515[i945 - 1] >> iArr515[i945];
                return 0;
            case 706:
                int i946 = this.AudioAttributesImplApi21Parcelizer;
                int i947 = i946 - 1;
                this.AudioAttributesImplApi21Parcelizer = i947;
                int[] iArr516 = this.MediaMetadataCompat;
                iArr516[i946 - 2] = iArr516[i946 - 2] >> iArr516[i947];
                return 0;
            case 707:
                int[] iArr517 = this.MediaMetadataCompat;
                int i948 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i948 + 1;
                iArr517[i948] = 9358;
                return 0;
            case 708:
                int[] iArr518 = this.MediaMetadataCompat;
                int i949 = this.AudioAttributesImplApi21Parcelizer;
                iArr518[i949 - 1] = (byte) iArr518[i949 - 1];
                return 0;
            case 709:
                Object[] objArr304 = this.onCustomAction;
                int i950 = this.AudioAttributesImplApi21Parcelizer;
                objArr304[i950] = null;
                int[] iArr519 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i950 + 2;
                iArr519[i950 + 1] = 1;
                return 0;
            case 710:
                int[] iArr520 = this.MediaMetadataCompat;
                int i951 = this.AudioAttributesImplApi21Parcelizer;
                iArr520[i951] = 0;
                Object[] objArr305 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i951 + 2;
                objArr305[i951 + 1] = objArr305[14];
                return 0;
            case 711:
                int[] iArr521 = this.MediaMetadataCompat;
                int i952 = this.AudioAttributesImplApi21Parcelizer;
                iArr521[i952] = iArr521[9];
                this.AudioAttributesImplApi21Parcelizer = i952 + 2;
                iArr521[i952 + 1] = 0;
                return 0;
            case 712:
                Object[] objArr306 = this.onCustomAction;
                int i953 = this.AudioAttributesImplApi21Parcelizer;
                Object obj244 = objArr306[i953 - 2];
                objArr306[i953 - 2] = null;
                objArr306[i953 - 1] = obj244;
                int[] iArr522 = this.MediaMetadataCompat;
                iArr522[i953 - 2] = iArr522[i953 - 1];
                int i954 = i953 - 3;
                this.AudioAttributesImplApi21Parcelizer = i954;
                Object obj245 = objArr306[i954];
                objArr306[i954] = null;
                int i955 = iArr522[i953 - 2];
                Object obj246 = objArr306[i953 - 1];
                objArr306[i953 - 1] = null;
                ((Object[]) obj245)[i955] = obj246;
                this.AudioAttributesImplApi21Parcelizer = i953 - 2;
                Object obj247 = objArr306[i953 - 4];
                objArr306[i953 - 4] = null;
                objArr306[i954] = obj247;
                iArr522[i953 - 4] = iArr522[i953 - 5];
                objArr306[i953 - 5] = obj247;
                return 0;
            case 713:
                int i956 = this.AudioAttributesImplApi21Parcelizer;
                int i957 = i956 - 3;
                this.AudioAttributesImplApi21Parcelizer = i957;
                Object[] objArr307 = this.onCustomAction;
                Object obj248 = objArr307[i957];
                objArr307[i957] = null;
                int i958 = this.MediaMetadataCompat[i956 - 2];
                Object obj249 = objArr307[i956 - 1];
                objArr307[i956 - 1] = null;
                ((Object[]) obj248)[i958] = obj249;
                this.AudioAttributesImplApi21Parcelizer = i956 - 2;
                Object obj250 = objArr307[i956 - 4];
                objArr307[i956 - 4] = null;
                objArr307[i957] = obj250;
                Object obj251 = objArr307[i956 - 5];
                objArr307[i956 - 5] = null;
                objArr307[i956 - 4] = obj251;
                objArr307[i956 - 5] = obj250;
                Object obj252 = objArr307[i956 - 3];
                objArr307[i956 - 3] = null;
                Object obj253 = objArr307[i956 - 4];
                objArr307[i956 - 4] = null;
                objArr307[i956 - 3] = obj253;
                objArr307[i956 - 4] = obj252;
                return 0;
            case 714:
                int[] iArr523 = this.MediaMetadataCompat;
                int i959 = this.AudioAttributesImplApi21Parcelizer;
                iArr523[i959] = 0;
                Object[] objArr308 = this.onCustomAction;
                Object obj254 = objArr308[i959 - 1];
                objArr308[i959 - 1] = null;
                objArr308[i959] = obj254;
                iArr523[i959 - 1] = iArr523[i959];
                int i960 = i959 - 2;
                this.AudioAttributesImplApi21Parcelizer = i960;
                Object obj255 = objArr308[i960];
                objArr308[i960] = null;
                int i961 = iArr523[i959 - 1];
                Object obj256 = objArr308[i959];
                objArr308[i959] = null;
                ((Object[]) obj255)[i961] = obj256;
                return 0;
            case 715:
                int i962 = this.AudioAttributesImplApi21Parcelizer;
                int i963 = i962 - 1;
                Object[] objArr309 = this.onCustomAction;
                Object obj257 = objArr309[i963];
                objArr309[i963] = null;
                objArr309[79] = obj257;
                this.AudioAttributesImplApi21Parcelizer = i962;
                objArr309[i963] = obj257;
                return 0;
            case 716:
                Object[] objArr310 = this.onCustomAction;
                int i964 = this.AudioAttributesImplApi21Parcelizer;
                objArr310[i964] = objArr310[9];
                this.AudioAttributesImplApi21Parcelizer = i964;
                Object obj258 = objArr310[i964];
                objArr310[i964] = null;
                objArr310[79] = obj258;
                return 0;
            case 717:
                Object[] objArr311 = this.onCustomAction;
                int i965 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i965 + 1;
                objArr311[i965] = objArr311[79];
                return 0;
            case 718:
                int[] iArr524 = this.MediaMetadataCompat;
                int i966 = this.AudioAttributesImplApi21Parcelizer;
                iArr524[i966] = 0;
                this.AudioAttributesImplApi21Parcelizer = i966;
                Object[] objArr312 = this.onCustomAction;
                Object obj259 = objArr312[i966 - 1];
                objArr312[i966 - 1] = null;
                iArr524[i966 - 1] = ((int[]) obj259)[iArr524[i966]];
                this.AudioAttributesImplApi21Parcelizer = i966 + 1;
                iArr524[i966] = iArr524[i966 - 1];
                return 0;
            case AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD /* 719 */:
                int i967 = this.AudioAttributesImplApi21Parcelizer;
                int i968 = i967 - 1;
                int[] iArr525 = this.MediaMetadataCompat;
                iArr525[10] = iArr525[i968];
                this.AudioAttributesImplApi21Parcelizer = i967;
                iArr525[i968] = iArr525[11];
                return 0;
            case 720:
                Object[] objArr313 = this.onCustomAction;
                int i969 = this.AudioAttributesImplApi21Parcelizer;
                objArr313[i969] = objArr313[i969 - 1];
                this.AudioAttributesImplApi21Parcelizer = i969;
                Object obj260 = objArr313[i969];
                objArr313[i969] = null;
                objArr313[79] = obj260;
                return 0;
            case 721:
                int i970 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i970;
                int[] iArr526 = this.MediaMetadataCompat;
                iArr526[72] = iArr526[i970];
                return 0;
            case 722:
                Object[] objArr314 = this.onCustomAction;
                int i971 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i971 + 1;
                objArr314[i971] = objArr314[69];
                return 0;
            case 723:
                Object[] objArr315 = this.onCustomAction;
                int i972 = this.AudioAttributesImplApi21Parcelizer;
                objArr315[i972] = objArr315[70];
                int[] iArr527 = this.MediaMetadataCompat;
                iArr527[i972 + 1] = 3;
                int i973 = i972 + 1;
                this.AudioAttributesImplApi21Parcelizer = i973;
                Object obj261 = objArr315[i972];
                objArr315[i972] = null;
                objArr315[i972] = ((Object[]) obj261)[iArr527[i973]];
                return 0;
            case 724:
                int i974 = this.AudioAttributesImplApi21Parcelizer;
                int i975 = i974 - 1;
                this.AudioAttributesImplApi21Parcelizer = i975;
                int[] iArr528 = this.MediaMetadataCompat;
                Object[] objArr316 = this.onCustomAction;
                Object obj262 = objArr316[i974 - 2];
                objArr316[i974 - 2] = null;
                iArr528[i974 - 2] = ((int[]) obj262)[iArr528[i975]];
                objArr316[i975] = objArr316[70];
                this.AudioAttributesImplApi21Parcelizer = i974 + 1;
                iArr528[i974] = 1;
                return 0;
            case 725:
                Object[] objArr317 = this.onCustomAction;
                int i976 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i976 + 1;
                objArr317[i976] = objArr317[70];
                return 0;
            case 726:
                int[] iArr529 = this.MediaMetadataCompat;
                int i977 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i977 + 1;
                iArr529[i977] = iArr529[71];
                return 0;
            case 727:
                int[] iArr530 = this.MediaMetadataCompat;
                int i978 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i978 + 1;
                iArr530[i978] = iArr530[72];
                return 0;
            case 728:
                int i979 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr531 = this.MediaMetadataCompat;
                iArr531[78] = iArr531[i979 - 1];
                iArr531[77] = iArr531[i979 - 2];
                int i980 = i979 - 3;
                this.AudioAttributesImplApi21Parcelizer = i980;
                Object[] objArr318 = this.onCustomAction;
                Object obj263 = objArr318[i980];
                objArr318[i980] = null;
                objArr318[76] = obj263;
                return 0;
            case 729:
                Object[] objArr319 = this.onCustomAction;
                int i981 = this.AudioAttributesImplApi21Parcelizer;
                objArr319[i981] = objArr319[73];
                this.AudioAttributesImplApi21Parcelizer = i981;
                objArr319[i981] = null;
                return 0;
            case 730:
                Object[] objArr320 = this.onCustomAction;
                int i982 = this.AudioAttributesImplApi21Parcelizer;
                objArr320[i982] = objArr320[73];
                int[] iArr532 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i982 + 2;
                iArr532[i982 + 1] = iArr532[74];
                return 0;
            case 731:
                Object[] objArr321 = this.onCustomAction;
                int i983 = this.AudioAttributesImplApi21Parcelizer;
                objArr321[i983] = objArr321[73];
                int[] iArr533 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i983 + 2;
                iArr533[i983 + 1] = iArr533[75];
                return 0;
            case 732:
                int[] iArr534 = this.MediaMetadataCompat;
                int i984 = this.AudioAttributesImplApi21Parcelizer;
                int i985 = iArr534[i984 - 1];
                iArr534[i984 - 1] = iArr534[i984 - 2];
                iArr534[i984 - 2] = i985;
                int i986 = i984 - 3;
                this.AudioAttributesImplApi21Parcelizer = i986;
                Object[] objArr322 = this.onCustomAction;
                Object obj264 = objArr322[i986];
                objArr322[i986] = null;
                ((int[]) obj264)[iArr534[i984 - 2]] = iArr534[i984 - 1];
                this.AudioAttributesImplApi21Parcelizer = i984 - 2;
                objArr322[i986] = objArr322[73];
                return 0;
            case 733:
                Object[] objArr323 = this.onCustomAction;
                int i987 = this.AudioAttributesImplApi21Parcelizer;
                objArr323[i987] = objArr323[76];
                int[] iArr535 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i987 + 2;
                iArr535[i987 + 1] = 2;
                Object obj265 = objArr323[i987];
                objArr323[i987] = null;
                objArr323[i987 + 1] = obj265;
                iArr535[i987] = iArr535[i987 + 1];
                return 0;
            case 734:
                int i988 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr536 = this.MediaMetadataCompat;
                int i989 = iArr536[i988 - 1];
                iArr536[76] = i989;
                int i990 = i988 - 2;
                iArr536[75] = iArr536[i990];
                this.AudioAttributesImplApi21Parcelizer = i988 - 1;
                iArr536[i990] = i989;
                return 0;
            case 735:
                int i991 = this.AudioAttributesImplApi21Parcelizer;
                int i992 = i991 - 3;
                this.AudioAttributesImplApi21Parcelizer = i992;
                Object[] objArr324 = this.onCustomAction;
                Object obj266 = objArr324[i992];
                objArr324[i992] = null;
                int[] iArr537 = this.MediaMetadataCompat;
                ((int[]) obj266)[iArr537[i991 - 2]] = iArr537[i991 - 1];
                int i993 = i991 - 4;
                Object obj267 = objArr324[i993];
                objArr324[i993] = null;
                objArr324[9] = obj267;
                this.AudioAttributesImplApi21Parcelizer = i991 - 3;
                iArr537[i993] = 4;
                return 0;
            case 736:
                int i994 = this.AudioAttributesImplApi21Parcelizer;
                int i995 = i994 - 1;
                Object[] objArr325 = this.onCustomAction;
                Object obj268 = objArr325[i995];
                objArr325[i995] = null;
                objArr325[79] = obj268;
                objArr325[i995] = obj268;
                int[] iArr538 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i994 + 1;
                iArr538[i994] = 0;
                return 0;
            case 737:
                int i996 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr539 = this.MediaMetadataCompat;
                iArr539[72] = iArr539[i996 - 1];
                int i997 = i996 - 2;
                this.AudioAttributesImplApi21Parcelizer = i997;
                iArr539[71] = iArr539[i997];
                return 0;
            case 738:
                int i998 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i998;
                Object[] objArr326 = this.onCustomAction;
                Object obj269 = objArr326[i998];
                objArr326[i998] = null;
                objArr326[70] = obj269;
                return 0;
            case 739:
                int i999 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr540 = this.MediaMetadataCompat;
                iArr540[78] = iArr540[i999 - 1];
                int i1000 = i999 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1000;
                iArr540[77] = iArr540[i1000];
                return 0;
            case 740:
                int i1001 = this.AudioAttributesImplApi21Parcelizer;
                int i1002 = i1001 - 1;
                Object[] objArr327 = this.onCustomAction;
                Object obj270 = objArr327[i1002];
                objArr327[i1002] = null;
                objArr327[76] = obj270;
                int[] iArr541 = this.MediaMetadataCompat;
                iArr541[75] = iArr541[i1001 - 2];
                int i1003 = i1001 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1003;
                iArr541[74] = iArr541[i1003];
                return 0;
            case 741:
                int i1004 = this.AudioAttributesImplApi21Parcelizer;
                int i1005 = i1004 - 1;
                Object[] objArr328 = this.onCustomAction;
                Object obj271 = objArr328[i1005];
                objArr328[i1005] = null;
                objArr328[73] = obj271;
                this.AudioAttributesImplApi21Parcelizer = i1004;
                objArr328[i1005] = obj271;
                return 0;
            case 742:
                Object[] objArr329 = this.onCustomAction;
                int i1006 = this.AudioAttributesImplApi21Parcelizer;
                objArr329[i1006] = objArr329[73];
                int[] iArr542 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1006 + 2;
                iArr542[i1006 + 1] = iArr542[74];
                Object obj272 = objArr329[i1006];
                objArr329[i1006] = null;
                objArr329[i1006 + 1] = obj272;
                iArr542[i1006] = iArr542[i1006 + 1];
                return 0;
            case 743:
                Object[] objArr330 = this.onCustomAction;
                int i1007 = this.AudioAttributesImplApi21Parcelizer;
                Object obj273 = objArr330[i1007 - 2];
                objArr330[i1007 - 2] = null;
                objArr330[i1007 - 1] = obj273;
                int[] iArr543 = this.MediaMetadataCompat;
                iArr543[i1007 - 2] = iArr543[i1007 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1007 + 1;
                iArr543[i1007] = 1;
                return 0;
            case 744:
                Object[] objArr331 = this.onCustomAction;
                int i1008 = this.AudioAttributesImplApi21Parcelizer;
                objArr331[i1008] = objArr331[73];
                int[] iArr544 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1008 + 2;
                iArr544[i1008 + 1] = iArr544[77];
                return 0;
            case 745:
                int[] iArr545 = this.MediaMetadataCompat;
                int i1009 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1009 + 1;
                iArr545[i1009] = iArr545[78];
                return 0;
            case 746:
                int i1010 = this.AudioAttributesImplApi21Parcelizer;
                int i1011 = i1010 - 1;
                int[] iArr546 = this.MediaMetadataCompat;
                iArr546[75] = iArr546[i1011];
                this.AudioAttributesImplApi21Parcelizer = i1010;
                iArr546[i1011] = iArr546[76];
                return 0;
            case 747:
                int[] iArr547 = this.MediaMetadataCompat;
                int i1012 = this.AudioAttributesImplApi21Parcelizer;
                iArr547[i1012] = 17;
                this.AudioAttributesImplApi21Parcelizer = i1012;
                iArr547[i1012 - 1] = iArr547[i1012 - 1] >>> iArr547[i1012];
                return 0;
            case 748:
                int i1013 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1013;
                Object[] objArr332 = this.onCustomAction;
                Object obj274 = objArr332[i1013];
                objArr332[i1013] = null;
                objArr332[79] = obj274;
                return 0;
            case 749:
                int i1014 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr548 = this.MediaMetadataCompat;
                iArr548[72] = iArr548[i1014 - 1];
                iArr548[71] = iArr548[i1014 - 2];
                int i1015 = i1014 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1015;
                Object[] objArr333 = this.onCustomAction;
                Object obj275 = objArr333[i1015];
                objArr333[i1015] = null;
                objArr333[70] = obj275;
                return 0;
            case 750:
                int i1016 = this.AudioAttributesImplApi21Parcelizer;
                int i1017 = i1016 - 1;
                Object[] objArr334 = this.onCustomAction;
                Object obj276 = objArr334[i1017];
                objArr334[i1017] = null;
                objArr334[69] = obj276;
                objArr334[i1017] = obj276;
                this.AudioAttributesImplApi21Parcelizer = i1016 + 1;
                objArr334[i1016] = objArr334[70];
                return 0;
            case 751:
                Object[] objArr335 = this.onCustomAction;
                int i1018 = this.AudioAttributesImplApi21Parcelizer;
                objArr335[i1018] = objArr335[70];
                int[] iArr549 = this.MediaMetadataCompat;
                iArr549[i1018 + 1] = 2;
                int i1019 = i1018 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1019;
                Object obj277 = objArr335[i1018];
                objArr335[i1018] = null;
                objArr335[i1018] = ((Object[]) obj277)[iArr549[i1019]];
                return 0;
            case 752:
                int[] iArr550 = this.MediaMetadataCompat;
                int i1020 = this.AudioAttributesImplApi21Parcelizer;
                iArr550[i1020] = iArr550[71];
                this.AudioAttributesImplApi21Parcelizer = i1020 + 2;
                iArr550[i1020 + 1] = iArr550[72];
                return 0;
            case 753:
                int i1021 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr551 = this.MediaMetadataCompat;
                iArr551[75] = iArr551[i1021 - 1];
                int i1022 = i1021 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1022;
                iArr551[74] = iArr551[i1022];
                return 0;
            case 754:
                int i1023 = this.AudioAttributesImplApi21Parcelizer;
                int i1024 = i1023 - 1;
                Object[] objArr336 = this.onCustomAction;
                Object obj278 = objArr336[i1024];
                objArr336[i1024] = null;
                objArr336[73] = obj278;
                objArr336[i1024] = obj278;
                int i1025 = i1023 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1025;
                objArr336[i1025] = null;
                return 0;
            case 755:
                int[] iArr552 = this.MediaMetadataCompat;
                int i1026 = this.AudioAttributesImplApi21Parcelizer;
                iArr552[i1026] = iArr552[74];
                Object[] objArr337 = this.onCustomAction;
                Object obj279 = objArr337[i1026 - 1];
                objArr337[i1026 - 1] = null;
                objArr337[i1026] = obj279;
                iArr552[i1026 - 1] = iArr552[i1026];
                this.AudioAttributesImplApi21Parcelizer = i1026 + 2;
                iArr552[i1026 + 1] = 3;
                return 0;
            case 756:
                Object[] objArr338 = this.onCustomAction;
                int i1027 = this.AudioAttributesImplApi21Parcelizer;
                objArr338[i1027] = objArr338[73];
                this.AudioAttributesImplApi21Parcelizer = i1027 + 2;
                objArr338[i1027 + 1] = objArr338[76];
                return 0;
            case 757:
                Object[] objArr339 = this.onCustomAction;
                int i1028 = this.AudioAttributesImplApi21Parcelizer;
                objArr339[i1028] = objArr339[9];
                Object obj280 = objArr339[i1028];
                objArr339[i1028] = null;
                objArr339[79] = obj280;
                this.AudioAttributesImplApi21Parcelizer = i1028 + 1;
                objArr339[i1028] = obj280;
                return 0;
            case 758:
                Object[] objArr340 = this.onCustomAction;
                int i1029 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1029 + 1;
                objArr340[i1029] = objArr340[14];
                int[] iArr553 = this.MediaMetadataCompat;
                Object obj281 = objArr340[i1029];
                objArr340[i1029] = null;
                iArr553[i1029] = ((Object[]) obj281).length;
                return 0;
            case 759:
                Object[] objArr341 = this.onCustomAction;
                int i1030 = this.AudioAttributesImplApi21Parcelizer;
                objArr341[i1030] = objArr341[12];
                this.AudioAttributesImplApi21Parcelizer = i1030 + 2;
                objArr341[i1030 + 1] = objArr341[14];
                return 0;
            case 760:
                int i1031 = this.AudioAttributesImplApi21Parcelizer;
                int i1032 = i1031 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1032;
                Object[] objArr342 = this.onCustomAction;
                Object obj282 = objArr342[i1032];
                objArr342[i1032] = null;
                int i1033 = this.MediaMetadataCompat[i1031 - 2];
                Object obj283 = objArr342[i1031 - 1];
                objArr342[i1031 - 1] = null;
                ((Object[]) obj282)[i1033] = obj283;
                this.AudioAttributesImplApi21Parcelizer = i1031 - 2;
                Object obj284 = objArr342[i1031 - 4];
                objArr342[i1031 - 4] = null;
                objArr342[i1032] = obj284;
                long[] jArr40 = this.MediaBrowserCompatSearchResultReceiver;
                jArr40[i1031 - 4] = jArr40[i1031 - 5];
                objArr342[i1031 - 5] = obj284;
                return 0;
            case 761:
                int[] iArr554 = this.MediaMetadataCompat;
                int i1034 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1034 + 1;
                iArr554[i1034] = 1;
                Object[] objArr343 = this.onCustomAction;
                Object obj285 = objArr343[i1034 - 1];
                objArr343[i1034 - 1] = null;
                objArr343[i1034] = obj285;
                iArr554[i1034 - 1] = iArr554[i1034];
                return 0;
            case 762:
                int i1035 = this.AudioAttributesImplApi21Parcelizer;
                int i1036 = i1035 - 1;
                Object[] objArr344 = this.onCustomAction;
                objArr344[i1036] = null;
                objArr344[i1036] = objArr344[i1035 - 2];
                this.AudioAttributesImplApi21Parcelizer = i1035 + 1;
                objArr344[i1035] = objArr344[9];
                return 0;
            case 763:
                int[] iArr555 = this.MediaMetadataCompat;
                int i1037 = this.AudioAttributesImplApi21Parcelizer;
                iArr555[i1037] = 0;
                iArr555[72] = iArr555[i1037];
                int i1038 = i1037 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1038;
                iArr555[71] = iArr555[i1038];
                return 0;
            case 764:
                int[] iArr556 = this.MediaMetadataCompat;
                int i1039 = this.AudioAttributesImplApi21Parcelizer;
                iArr556[i1039] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1039;
                Object[] objArr345 = this.onCustomAction;
                Object obj286 = objArr345[i1039 - 1];
                objArr345[i1039 - 1] = null;
                iArr556[i1039 - 1] = ((int[]) obj286)[iArr556[i1039]];
                this.AudioAttributesImplApi21Parcelizer = i1039 + 1;
                objArr345[i1039] = objArr345[70];
                return 0;
            case 765:
                Object[] objArr346 = this.onCustomAction;
                int i1040 = this.AudioAttributesImplApi21Parcelizer;
                objArr346[i1040] = objArr346[70];
                int[] iArr557 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1040 + 2;
                iArr557[i1040 + 1] = 2;
                return 0;
            case 766:
                int i1041 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1041;
                int[] iArr558 = this.MediaMetadataCompat;
                iArr558[78] = iArr558[i1041];
                return 0;
            case 767:
                int i1042 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr559 = this.MediaMetadataCompat;
                iArr559[75] = iArr559[i1042 - 1];
                iArr559[74] = iArr559[i1042 - 2];
                int i1043 = i1042 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1043;
                Object[] objArr347 = this.onCustomAction;
                Object obj287 = objArr347[i1043];
                objArr347[i1043] = null;
                objArr347[73] = obj287;
                return 0;
            case 768:
                int[] iArr560 = this.MediaMetadataCompat;
                int i1044 = this.AudioAttributesImplApi21Parcelizer;
                iArr560[i1044] = iArr560[75];
                Object[] objArr348 = this.onCustomAction;
                Object obj288 = objArr348[i1044 - 1];
                objArr348[i1044 - 1] = null;
                objArr348[i1044] = obj288;
                iArr560[i1044 - 1] = iArr560[i1044];
                this.AudioAttributesImplApi21Parcelizer = i1044 + 2;
                iArr560[i1044 + 1] = 1;
                return 0;
            case 769:
                int[] iArr561 = this.MediaMetadataCompat;
                int i1045 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1045 + 1;
                iArr561[i1045] = iArr561[77];
                return 0;
            case 770:
                int[] iArr562 = this.MediaMetadataCompat;
                int i1046 = this.AudioAttributesImplApi21Parcelizer;
                iArr562[i1046] = iArr562[11];
                this.AudioAttributesImplApi21Parcelizer = i1046;
                iArr562[i1046 - 1] = iArr562[i1046] ^ iArr562[i1046 - 1];
                return 0;
            case 771:
                int i1047 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr41 = this.MediaBrowserCompatSearchResultReceiver;
                jArr41[i1047 - 2] = jArr41[i1047 - 2] | jArr41[i1047 - 1];
                int i1048 = i1047 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1048;
                jArr41[28] = jArr41[i1048];
                return 0;
            case 772:
                long[] jArr42 = this.MediaBrowserCompatSearchResultReceiver;
                int i1049 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1049 + 1;
                jArr42[i1049] = jArr42[28];
                return 0;
            case 773:
                Object[] objArr349 = this.onCustomAction;
                int i1050 = this.AudioAttributesImplApi21Parcelizer;
                objArr349[i1050] = objArr349[9];
                objArr349[i1050 + 1] = objArr349[i1050];
                int i1051 = i1050 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1051;
                Object obj289 = objArr349[i1051];
                objArr349[i1051] = null;
                objArr349[79] = obj289;
                return 0;
            case 774:
                Object[] objArr350 = this.onCustomAction;
                int i1052 = this.AudioAttributesImplApi21Parcelizer;
                objArr350[i1052] = objArr350[79];
                int[] iArr563 = this.MediaMetadataCompat;
                iArr563[i1052 + 1] = 0;
                int i1053 = i1052 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1053;
                Object obj290 = objArr350[i1052];
                objArr350[i1052] = null;
                objArr350[i1052] = ((Object[]) obj290)[iArr563[i1053]];
                return 0;
            case 775:
                int i1054 = this.AudioAttributesImplApi21Parcelizer;
                int i1055 = i1054 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1055;
                int[] iArr564 = this.MediaMetadataCompat;
                Object[] objArr351 = this.onCustomAction;
                Object obj291 = objArr351[i1054 - 2];
                objArr351[i1054 - 2] = null;
                iArr564[i1054 - 2] = ((int[]) obj291)[iArr564[i1055]];
                this.AudioAttributesImplApi21Parcelizer = i1054;
                iArr564[i1055] = 0;
                return 0;
            case 776:
                int i1056 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1056;
                int[] iArr565 = this.MediaMetadataCompat;
                iArr565[77] = iArr565[i1056];
                return 0;
            case 777:
                int i1057 = this.AudioAttributesImplApi21Parcelizer;
                int i1058 = i1057 - 1;
                Object[] objArr352 = this.onCustomAction;
                Object obj292 = objArr352[i1058];
                objArr352[i1058] = null;
                objArr352[76] = obj292;
                int i1059 = i1057 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1059;
                int[] iArr566 = this.MediaMetadataCompat;
                iArr566[75] = iArr566[i1059];
                return 0;
            case 778:
                int i1060 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1060;
                int[] iArr567 = this.MediaMetadataCompat;
                iArr567[74] = iArr567[i1060];
                return 0;
            case 779:
                int i1061 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1061;
                Object[] objArr353 = this.onCustomAction;
                Object obj293 = objArr353[i1061];
                objArr353[i1061] = null;
                objArr353[73] = obj293;
                return 0;
            case 780:
                Object[] objArr354 = this.onCustomAction;
                int i1062 = this.AudioAttributesImplApi21Parcelizer;
                objArr354[i1062] = objArr354[76];
                int[] iArr568 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1062 + 2;
                iArr568[i1062 + 1] = 2;
                return 0;
            case 781:
                Object[] objArr355 = this.onCustomAction;
                int i1063 = this.AudioAttributesImplApi21Parcelizer;
                Object obj294 = objArr355[i1063 - 2];
                objArr355[i1063 - 2] = null;
                objArr355[i1063 - 1] = obj294;
                int[] iArr569 = this.MediaMetadataCompat;
                iArr569[i1063 - 2] = iArr569[i1063 - 1];
                int i1064 = i1063 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1064;
                Object obj295 = objArr355[i1064];
                objArr355[i1064] = null;
                int i1065 = iArr569[i1063 - 2];
                Object obj296 = objArr355[i1063 - 1];
                objArr355[i1063 - 1] = null;
                ((Object[]) obj295)[i1065] = obj296;
                this.AudioAttributesImplApi21Parcelizer = i1063 - 2;
                objArr355[i1064] = objArr355[73];
                return 0;
            case 782:
                int[] iArr570 = this.MediaMetadataCompat;
                int i1066 = this.AudioAttributesImplApi21Parcelizer;
                iArr570[i1066] = iArr570[75];
                this.AudioAttributesImplApi21Parcelizer = i1066;
                iArr570[i1066 - 1] = iArr570[i1066 - 1] + iArr570[i1066];
                return 0;
            case 783:
                int i1067 = this.AudioAttributesImplApi21Parcelizer;
                int i1068 = i1067 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1068;
                Object[] objArr356 = this.onCustomAction;
                Object obj297 = objArr356[i1068];
                objArr356[i1068] = null;
                int[] iArr571 = this.MediaMetadataCompat;
                ((int[]) obj297)[iArr571[i1067 - 2]] = iArr571[i1067 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1067 - 2;
                iArr571[i1068] = iArr571[10];
                return 0;
            case 784:
                int i1069 = this.AudioAttributesImplApi21Parcelizer;
                int i1070 = i1069 - 1;
                long[] jArr43 = this.MediaBrowserCompatSearchResultReceiver;
                jArr43[30] = jArr43[i1070];
                Object[] objArr357 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1069;
                objArr357[i1070] = objArr357[80];
                return 0;
            case 785:
                int i1071 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr44 = this.MediaBrowserCompatSearchResultReceiver;
                jArr44[i1071 - 2] = jArr44[i1071 - 2] >> this.MediaMetadataCompat[i1071 - 1];
                int i1072 = i1071 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1072;
                jArr44[32] = jArr44[i1072];
                return 0;
            case 786:
                long[] jArr45 = this.MediaBrowserCompatSearchResultReceiver;
                int i1073 = this.AudioAttributesImplApi21Parcelizer;
                jArr45[i1073] = jArr45[30];
                this.AudioAttributesImplApi21Parcelizer = i1073 + 2;
                jArr45[i1073 + 1] = jArr45[32];
                return 0;
            case 787:
                int[] iArr572 = this.MediaMetadataCompat;
                int i1074 = this.AudioAttributesImplApi21Parcelizer;
                iArr572[i1074] = 2;
                this.AudioAttributesImplApi21Parcelizer = i1074 + 2;
                iArr572[i1074 + 1] = 1;
                return 0;
            case 788:
                int i1075 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr573 = this.MediaMetadataCompat;
                iArr573[61] = iArr573[i1075 - 1];
                int i1076 = i1075 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1076;
                iArr573[60] = iArr573[i1076];
                return 0;
            case 789:
                int i1077 = this.AudioAttributesImplApi21Parcelizer;
                int i1078 = i1077 - 1;
                Object[] objArr358 = this.onCustomAction;
                Object obj298 = objArr358[i1078];
                objArr358[i1078] = null;
                objArr358[59] = obj298;
                int i1079 = i1077 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1079;
                Object obj299 = objArr358[i1079];
                objArr358[i1079] = null;
                objArr358[58] = obj299;
                return 0;
            case 790:
                Object[] objArr359 = this.onCustomAction;
                int i1080 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1080 + 1;
                objArr359[i1080] = objArr359[58];
                return 0;
            case 791:
                Object[] objArr360 = this.onCustomAction;
                int i1081 = this.AudioAttributesImplApi21Parcelizer;
                objArr360[i1081] = objArr360[59];
                int[] iArr574 = this.MediaMetadataCompat;
                iArr574[i1081 + 1] = 2;
                int i1082 = i1081 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1082;
                Object obj300 = objArr360[i1081];
                objArr360[i1081] = null;
                objArr360[i1081] = ((Object[]) obj300)[iArr574[i1082]];
                return 0;
            case 792:
                Object[] objArr361 = this.onCustomAction;
                int i1083 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1083 + 1;
                objArr361[i1083] = objArr361[59];
                return 0;
            case 793:
                int[] iArr575 = this.MediaMetadataCompat;
                int i1084 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1084 + 1;
                iArr575[i1084] = iArr575[60];
                return 0;
            case 794:
                int[] iArr576 = this.MediaMetadataCompat;
                int i1085 = this.AudioAttributesImplApi21Parcelizer;
                iArr576[i1085] = iArr576[61];
                iArr576[67] = iArr576[i1085];
                int i1086 = i1085 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1086;
                iArr576[66] = iArr576[i1086];
                return 0;
            case 795:
                int i1087 = this.AudioAttributesImplApi21Parcelizer;
                int i1088 = i1087 - 1;
                Object[] objArr362 = this.onCustomAction;
                Object obj301 = objArr362[i1088];
                objArr362[i1088] = null;
                objArr362[65] = obj301;
                int i1089 = i1087 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1089;
                int[] iArr577 = this.MediaMetadataCompat;
                iArr577[64] = iArr577[i1089];
                return 0;
            case 796:
                int i1090 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr578 = this.MediaMetadataCompat;
                iArr578[63] = iArr578[i1090 - 1];
                int i1091 = i1090 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1091;
                Object[] objArr363 = this.onCustomAction;
                Object obj302 = objArr363[i1091];
                objArr363[i1091] = null;
                objArr363[62] = obj302;
                return 0;
            case 797:
                Object[] objArr364 = this.onCustomAction;
                int i1092 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1092 + 1;
                objArr364[i1092] = objArr364[62];
                return 0;
            case 798:
                int[] iArr579 = this.MediaMetadataCompat;
                int i1093 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1093 + 1;
                iArr579[i1093] = iArr579[63];
                Object[] objArr365 = this.onCustomAction;
                Object obj303 = objArr365[i1093 - 1];
                objArr365[i1093 - 1] = null;
                objArr365[i1093] = obj303;
                iArr579[i1093 - 1] = iArr579[i1093];
                return 0;
            case 799:
                int i1094 = this.AudioAttributesImplApi21Parcelizer;
                int i1095 = i1094 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1095;
                Object[] objArr366 = this.onCustomAction;
                Object obj304 = objArr366[i1095];
                objArr366[i1095] = null;
                int[] iArr580 = this.MediaMetadataCompat;
                ((int[]) obj304)[iArr580[i1094 - 2]] = iArr580[i1094 - 1];
                objArr366[i1095] = objArr366[62];
                this.AudioAttributesImplApi21Parcelizer = i1094 - 1;
                iArr580[i1094 - 2] = iArr580[64];
                return 0;
            case 800:
                int i1096 = this.AudioAttributesImplApi21Parcelizer;
                int i1097 = i1096 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1097;
                Object[] objArr367 = this.onCustomAction;
                Object obj305 = objArr367[i1097];
                objArr367[i1097] = null;
                int[] iArr581 = this.MediaMetadataCompat;
                ((int[]) obj305)[iArr581[i1096 - 2]] = iArr581[i1096 - 1];
                objArr367[i1097] = objArr367[62];
                this.AudioAttributesImplApi21Parcelizer = i1096 - 1;
                objArr367[i1096 - 2] = objArr367[65];
                return 0;
            case 801:
                int[] iArr582 = this.MediaMetadataCompat;
                int i1098 = this.AudioAttributesImplApi21Parcelizer;
                iArr582[i1098] = iArr582[66];
                this.AudioAttributesImplApi21Parcelizer = i1098 + 2;
                iArr582[i1098 + 1] = iArr582[67];
                return 0;
            case 802:
                int i1099 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr583 = this.MediaMetadataCompat;
                iArr583[65] = iArr583[i1099 - 1];
                int i1100 = i1099 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1100;
                iArr583[64] = iArr583[i1100];
                return 0;
            case 803:
                int[] iArr584 = this.MediaMetadataCompat;
                int i1101 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1101 + 1;
                iArr584[i1101] = iArr584[65];
                return 0;
            case 804:
                int[] iArr585 = this.MediaMetadataCompat;
                int i1102 = this.AudioAttributesImplApi21Parcelizer;
                iArr585[i1102] = iArr585[64];
                iArr585[i1102 - 1] = iArr585[i1102 - 1] + iArr585[i1102];
                int i1103 = i1102 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1103;
                iArr585[i1102 - 2] = iArr585[i1102 - 2] + iArr585[i1103];
                return 0;
            case 805:
                Object[] objArr368 = this.onCustomAction;
                int i1104 = this.AudioAttributesImplApi21Parcelizer;
                objArr368[i1104] = objArr368[14];
                int i1105 = i1104 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1105;
                Object obj306 = objArr368[i1105];
                objArr368[i1105] = null;
                int i1106 = this.MediaMetadataCompat[i1104 - 1];
                Object obj307 = objArr368[i1104];
                objArr368[i1104] = null;
                ((Object[]) obj306)[i1106] = obj307;
                return 0;
            case 806:
                Object[] objArr369 = this.onCustomAction;
                int i1107 = this.AudioAttributesImplApi21Parcelizer;
                objArr369[i1107] = objArr369[9];
                Object obj308 = objArr369[i1107];
                objArr369[i1107] = null;
                objArr369[68] = obj308;
                this.AudioAttributesImplApi21Parcelizer = i1107 + 1;
                objArr369[i1107] = obj308;
                return 0;
            case 807:
                int i1108 = this.AudioAttributesImplApi21Parcelizer;
                int i1109 = i1108 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1109;
                int[] iArr586 = this.MediaMetadataCompat;
                Object[] objArr370 = this.onCustomAction;
                Object obj309 = objArr370[i1108 - 2];
                objArr370[i1108 - 2] = null;
                iArr586[i1108 - 2] = ((int[]) obj309)[iArr586[i1109]];
                int i1110 = i1108 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1110;
                iArr586[11] = iArr586[i1110];
                return 0;
            case 808:
                int i1111 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1111;
                Object[] objArr371 = this.onCustomAction;
                Object obj310 = objArr371[i1111];
                objArr371[i1111] = null;
                objArr371[68] = obj310;
                return 0;
            case 809:
                Object[] objArr372 = this.onCustomAction;
                int i1112 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1112 + 1;
                objArr372[i1112] = objArr372[68];
                return 0;
            case 810:
                int[] iArr587 = this.MediaMetadataCompat;
                int i1113 = this.AudioAttributesImplApi21Parcelizer;
                iArr587[i1113] = iArr587[i1113 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1113;
                iArr587[10] = iArr587[i1113];
                return 0;
            case 811:
                Object[] objArr373 = this.onCustomAction;
                int i1114 = this.AudioAttributesImplApi21Parcelizer;
                objArr373[i1114] = objArr373[i1114 - 1];
                int[] iArr588 = this.MediaMetadataCompat;
                iArr588[i1114 + 1] = 3;
                this.AudioAttributesImplApi21Parcelizer = i1114 + 3;
                iArr588[i1114 + 2] = 1;
                return 0;
            case 812:
                Object[] objArr374 = this.onCustomAction;
                int i1115 = this.AudioAttributesImplApi21Parcelizer;
                objArr374[i1115] = objArr374[68];
                int[] iArr589 = this.MediaMetadataCompat;
                iArr589[i1115 + 1] = 1;
                int i1116 = i1115 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1116;
                Object obj311 = objArr374[i1115];
                objArr374[i1115] = null;
                objArr374[i1115] = ((Object[]) obj311)[iArr589[i1116]];
                return 0;
            case 813:
                int i1117 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1117;
                int[] iArr590 = this.MediaMetadataCompat;
                iArr590[61] = iArr590[i1117];
                return 0;
            case 814:
                int i1118 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr591 = this.MediaMetadataCompat;
                iArr591[60] = iArr591[i1118 - 1];
                int i1119 = i1118 - 2;
                Object[] objArr375 = this.onCustomAction;
                Object obj312 = objArr375[i1119];
                objArr375[i1119] = null;
                objArr375[59] = obj312;
                int i1120 = i1118 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1120;
                Object obj313 = objArr375[i1120];
                objArr375[i1120] = null;
                objArr375[58] = obj313;
                return 0;
            case 815:
                int[] iArr592 = this.MediaMetadataCompat;
                int i1121 = this.AudioAttributesImplApi21Parcelizer;
                iArr592[i1121] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1121;
                Object[] objArr376 = this.onCustomAction;
                Object obj314 = objArr376[i1121 - 1];
                objArr376[i1121 - 1] = null;
                iArr592[i1121 - 1] = ((int[]) obj314)[iArr592[i1121]];
                this.AudioAttributesImplApi21Parcelizer = i1121 + 1;
                objArr376[i1121] = objArr376[59];
                return 0;
            case 816:
                Object[] objArr377 = this.onCustomAction;
                int i1122 = this.AudioAttributesImplApi21Parcelizer;
                objArr377[i1122] = objArr377[59];
                int[] iArr593 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1122 + 2;
                iArr593[i1122 + 1] = 0;
                return 0;
            case 817:
                int i1123 = this.AudioAttributesImplApi21Parcelizer;
                int i1124 = i1123 - 1;
                Object[] objArr378 = this.onCustomAction;
                Object obj315 = objArr378[i1124];
                objArr378[i1124] = null;
                objArr378[65] = obj315;
                int[] iArr594 = this.MediaMetadataCompat;
                iArr594[64] = iArr594[i1123 - 2];
                int i1125 = i1123 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1125;
                iArr594[63] = iArr594[i1125];
                return 0;
            case 818:
                int i1126 = this.AudioAttributesImplApi21Parcelizer;
                int i1127 = i1126 - 1;
                Object[] objArr379 = this.onCustomAction;
                Object obj316 = objArr379[i1127];
                objArr379[i1127] = null;
                objArr379[62] = obj316;
                objArr379[i1127] = obj316;
                int i1128 = i1126 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1128;
                objArr379[i1128] = null;
                return 0;
            case 819:
                int[] iArr595 = this.MediaMetadataCompat;
                int i1129 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1129 + 1;
                iArr595[i1129] = iArr595[63];
                return 0;
            case 820:
                Object[] objArr380 = this.onCustomAction;
                int i1130 = this.AudioAttributesImplApi21Parcelizer;
                objArr380[i1130] = objArr380[62];
                int[] iArr596 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1130 + 2;
                iArr596[i1130 + 1] = iArr596[64];
                Object obj317 = objArr380[i1130];
                objArr380[i1130] = null;
                objArr380[i1130 + 1] = obj317;
                iArr596[i1130] = iArr596[i1130 + 1];
                return 0;
            case 821:
                int i1131 = this.AudioAttributesImplApi21Parcelizer;
                int i1132 = i1131 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1132;
                Object[] objArr381 = this.onCustomAction;
                Object obj318 = objArr381[i1132];
                objArr381[i1132] = null;
                int[] iArr597 = this.MediaMetadataCompat;
                ((int[]) obj318)[iArr597[i1131 - 2]] = iArr597[i1131 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1131 - 2;
                objArr381[i1132] = objArr381[62];
                return 0;
            case 822:
                Object[] objArr382 = this.onCustomAction;
                int i1133 = this.AudioAttributesImplApi21Parcelizer;
                objArr382[i1133] = objArr382[65];
                int[] iArr598 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1133 + 2;
                iArr598[i1133 + 1] = 0;
                Object obj319 = objArr382[i1133];
                objArr382[i1133] = null;
                objArr382[i1133 + 1] = obj319;
                iArr598[i1133] = iArr598[i1133 + 1];
                return 0;
            case 823:
                int i1134 = this.AudioAttributesImplApi21Parcelizer;
                int i1135 = i1134 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1135;
                Object[] objArr383 = this.onCustomAction;
                Object obj320 = objArr383[i1135];
                objArr383[i1135] = null;
                int[] iArr599 = this.MediaMetadataCompat;
                int i1136 = iArr599[i1134 - 2];
                Object obj321 = objArr383[i1134 - 1];
                objArr383[i1134 - 1] = null;
                ((Object[]) obj320)[i1136] = obj321;
                objArr383[i1135] = objArr383[62];
                this.AudioAttributesImplApi21Parcelizer = i1134 - 1;
                iArr599[i1134 - 2] = iArr599[66];
                return 0;
            case 824:
                int[] iArr600 = this.MediaMetadataCompat;
                int i1137 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1137 + 1;
                iArr600[i1137] = iArr600[67];
                return 0;
            case 825:
                int[] iArr601 = this.MediaMetadataCompat;
                int i1138 = this.AudioAttributesImplApi21Parcelizer;
                iArr601[i1138] = iArr601[65];
                iArr601[i1138 + 1] = iArr601[64];
                int i1139 = i1138 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1139;
                iArr601[i1138] = iArr601[i1138] + iArr601[i1139];
                return 0;
            case 826:
                int i1140 = this.AudioAttributesImplApi21Parcelizer;
                int i1141 = i1140 - 1;
                Object[] objArr384 = this.onCustomAction;
                Object obj322 = objArr384[i1141];
                objArr384[i1141] = null;
                objArr384[68] = obj322;
                this.AudioAttributesImplApi21Parcelizer = i1140;
                objArr384[i1141] = obj322;
                return 0;
            case 827:
                Object[] objArr385 = this.onCustomAction;
                int i1142 = this.AudioAttributesImplApi21Parcelizer;
                objArr385[i1142] = objArr385[59];
                int[] iArr602 = this.MediaMetadataCompat;
                iArr602[i1142 + 1] = 0;
                int i1143 = i1142 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1143;
                Object obj323 = objArr385[i1142];
                objArr385[i1142] = null;
                objArr385[i1142] = ((Object[]) obj323)[iArr602[i1143]];
                return 0;
            case 828:
                int[] iArr603 = this.MediaMetadataCompat;
                int i1144 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1144 + 1;
                iArr603[i1144] = iArr603[61];
                return 0;
            case 829:
                int i1145 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1145;
                int[] iArr604 = this.MediaMetadataCompat;
                iArr604[67] = iArr604[i1145];
                return 0;
            case 830:
                int i1146 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1146;
                int[] iArr605 = this.MediaMetadataCompat;
                iArr605[66] = iArr605[i1146];
                return 0;
            case 831:
                int i1147 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1147;
                Object[] objArr386 = this.onCustomAction;
                Object obj324 = objArr386[i1147];
                objArr386[i1147] = null;
                objArr386[62] = obj324;
                return 0;
            case 832:
                Object[] objArr387 = this.onCustomAction;
                int i1148 = this.AudioAttributesImplApi21Parcelizer;
                objArr387[i1148] = objArr387[62];
                int[] iArr606 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1148 + 2;
                iArr606[i1148 + 1] = iArr606[63];
                return 0;
            case 833:
                int[] iArr607 = this.MediaMetadataCompat;
                int i1149 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1149 + 1;
                iArr607[i1149] = 0;
                Object[] objArr388 = this.onCustomAction;
                Object obj325 = objArr388[i1149 - 1];
                objArr388[i1149 - 1] = null;
                objArr388[i1149] = obj325;
                iArr607[i1149 - 1] = iArr607[i1149];
                return 0;
            case 834:
                int i1150 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1150;
                int[] iArr608 = this.MediaMetadataCompat;
                iArr608[65] = iArr608[i1150];
                return 0;
            case 835:
                int i1151 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1151;
                int[] iArr609 = this.MediaMetadataCompat;
                iArr609[64] = iArr609[i1151];
                return 0;
            case 836:
                int i1152 = this.AudioAttributesImplApi21Parcelizer;
                int i1153 = i1152 - 1;
                Object[] objArr389 = this.onCustomAction;
                Object obj326 = objArr389[i1153];
                objArr389[i1153] = null;
                objArr389[68] = obj326;
                objArr389[i1153] = obj326;
                int[] iArr610 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1152 + 1;
                iArr610[i1152] = 1;
                return 0;
            case 837:
                int[] iArr611 = this.MediaMetadataCompat;
                int i1154 = this.AudioAttributesImplApi21Parcelizer;
                iArr611[i1154] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1154;
                iArr611[61] = iArr611[i1154];
                return 0;
            case 838:
                int i1155 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1155;
                int[] iArr612 = this.MediaMetadataCompat;
                iArr612[60] = iArr612[i1155];
                return 0;
            case 839:
                int i1156 = this.AudioAttributesImplApi21Parcelizer;
                int i1157 = i1156 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1157;
                int[] iArr613 = this.MediaMetadataCompat;
                Object[] objArr390 = this.onCustomAction;
                Object obj327 = objArr390[i1156 - 2];
                objArr390[i1156 - 2] = null;
                iArr613[i1156 - 2] = ((int[]) obj327)[iArr613[i1157]];
                objArr390[i1157] = objArr390[59];
                this.AudioAttributesImplApi21Parcelizer = i1156 + 1;
                iArr613[i1156] = 3;
                return 0;
            case 840:
                int[] iArr614 = this.MediaMetadataCompat;
                int i1158 = this.AudioAttributesImplApi21Parcelizer;
                iArr614[i1158] = iArr614[61];
                this.AudioAttributesImplApi21Parcelizer = i1158;
                iArr614[67] = iArr614[i1158];
                return 0;
            case 841:
                Object[] objArr391 = this.onCustomAction;
                int i1159 = this.AudioAttributesImplApi21Parcelizer;
                objArr391[i1159] = objArr391[62];
                objArr391[i1159] = null;
                this.AudioAttributesImplApi21Parcelizer = i1159 + 1;
                objArr391[i1159] = objArr391[62];
                return 0;
            case 842:
                int[] iArr615 = this.MediaMetadataCompat;
                int i1160 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1160 + 1;
                iArr615[i1160] = iArr615[64];
                return 0;
            case 843:
                int[] iArr616 = this.MediaMetadataCompat;
                int i1161 = this.AudioAttributesImplApi21Parcelizer;
                iArr616[i1161] = iArr616[64];
                this.AudioAttributesImplApi21Parcelizer = i1161;
                iArr616[i1161 - 1] = iArr616[i1161 - 1] + iArr616[i1161];
                return 0;
            case 844:
                int i1162 = this.AudioAttributesImplApi21Parcelizer;
                int i1163 = i1162 - 1;
                Object[] objArr392 = this.onCustomAction;
                Object obj328 = objArr392[i1163];
                objArr392[i1163] = null;
                objArr392[12] = obj328;
                objArr392[i1163] = objArr392[9];
                int i1164 = i1162 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1164;
                Object obj329 = objArr392[i1164];
                objArr392[i1164] = null;
                objArr392[68] = obj329;
                return 0;
            case 845:
                Object[] objArr393 = this.onCustomAction;
                int i1165 = this.AudioAttributesImplApi21Parcelizer;
                objArr393[i1165] = objArr393[i1165 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1165;
                Object obj330 = objArr393[i1165];
                objArr393[i1165] = null;
                objArr393[14] = obj330;
                return 0;
            case 846:
                int[] iArr617 = this.MediaMetadataCompat;
                int i1166 = this.AudioAttributesImplApi21Parcelizer;
                iArr617[i1166] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1166;
                iArr617[13] = iArr617[i1166];
                return 0;
            case 847:
                int[] iArr618 = this.MediaMetadataCompat;
                int i1167 = this.AudioAttributesImplApi21Parcelizer;
                iArr618[i1167] = iArr618[13];
                Object[] objArr394 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1167 + 2;
                objArr394[i1167 + 1] = objArr394[14];
                Object obj331 = objArr394[i1167 + 1];
                objArr394[i1167 + 1] = null;
                iArr618[i1167 + 1] = ((Object[]) obj331).length;
                return 0;
            case 848:
                int[] iArr619 = this.MediaMetadataCompat;
                int i1168 = this.AudioAttributesImplApi21Parcelizer;
                iArr619[i1168] = iArr619[13];
                this.AudioAttributesImplApi21Parcelizer = i1168;
                Object[] objArr395 = this.onCustomAction;
                Object obj332 = objArr395[i1168 - 1];
                objArr395[i1168 - 1] = null;
                objArr395[i1168 - 1] = ((Object[]) obj332)[iArr619[i1168]];
                return 0;
            case 849:
                int[] iArr620 = this.MediaMetadataCompat;
                int i1169 = this.AudioAttributesImplApi21Parcelizer;
                iArr620[i1169] = iArr620[11];
                iArr620[i1169 + 1] = iArr620[10];
                int i1170 = i1169 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1170;
                iArr620[i1169] = iArr620[i1169] ^ iArr620[i1170];
                return 0;
            case 850:
                int i1171 = this.AudioAttributesImplApi21Parcelizer;
                int i1172 = i1171 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1172;
                long[] jArr46 = this.MediaBrowserCompatSearchResultReceiver;
                jArr46[i1171 - 2] = jArr46[i1172] ^ jArr46[i1171 - 2];
                return 0;
            case 851:
                Object[] objArr396 = this.onCustomAction;
                int i1173 = this.AudioAttributesImplApi21Parcelizer;
                Object obj333 = objArr396[i1173 - 1];
                objArr396[i1173 - 1] = null;
                objArr396[i1173] = obj333;
                long[] jArr47 = this.MediaBrowserCompatSearchResultReceiver;
                jArr47[i1173 - 1] = jArr47[i1173 - 2];
                objArr396[i1173 - 2] = obj333;
                this.AudioAttributesImplApi21Parcelizer = i1173;
                objArr396[i1173] = null;
                return 0;
            case 852:
                Object[] objArr397 = this.onCustomAction;
                int i1174 = this.AudioAttributesImplApi21Parcelizer;
                Object obj334 = objArr397[i1174 - 1];
                objArr397[i1174 - 1] = null;
                Object obj335 = objArr397[i1174 - 2];
                objArr397[i1174 - 2] = null;
                objArr397[i1174 - 1] = obj335;
                objArr397[i1174 - 2] = obj334;
                int[] iArr621 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1174 + 1;
                iArr621[i1174] = 1;
                Object obj336 = objArr397[i1174 - 1];
                objArr397[i1174 - 1] = null;
                objArr397[i1174] = obj336;
                iArr621[i1174 - 1] = iArr621[i1174];
                return 0;
            case 853:
                int i1175 = this.AudioAttributesImplApi21Parcelizer;
                int i1176 = i1175 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1176;
                Object[] objArr398 = this.onCustomAction;
                Object obj337 = objArr398[i1176];
                objArr398[i1176] = null;
                int i1177 = this.MediaMetadataCompat[i1175 - 2];
                Object obj338 = objArr398[i1175 - 1];
                objArr398[i1175 - 1] = null;
                ((Object[]) obj337)[i1177] = obj338;
                this.AudioAttributesImplApi21Parcelizer = i1175 - 2;
                Object obj339 = objArr398[i1175 - 4];
                objArr398[i1175 - 4] = null;
                objArr398[i1176] = obj339;
                Object obj340 = objArr398[i1175 - 5];
                objArr398[i1175 - 5] = null;
                objArr398[i1175 - 4] = obj340;
                objArr398[i1175 - 5] = obj339;
                return 0;
            case 854:
                Object[] objArr399 = this.onCustomAction;
                int i1178 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1178 + 1;
                objArr399[i1178] = null;
                Object obj341 = objArr399[i1178];
                objArr399[i1178] = null;
                Object obj342 = objArr399[i1178 - 1];
                objArr399[i1178 - 1] = null;
                objArr399[i1178] = obj342;
                objArr399[i1178 - 1] = obj341;
                return 0;
            case 855:
                int i1179 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr622 = this.MediaMetadataCompat;
                iArr622[61] = iArr622[i1179 - 1];
                iArr622[60] = iArr622[i1179 - 2];
                int i1180 = i1179 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1180;
                Object[] objArr400 = this.onCustomAction;
                Object obj343 = objArr400[i1180];
                objArr400[i1180] = null;
                objArr400[59] = obj343;
                return 0;
            case 856:
                int i1181 = this.AudioAttributesImplApi21Parcelizer;
                int i1182 = i1181 - 1;
                Object[] objArr401 = this.onCustomAction;
                Object obj344 = objArr401[i1182];
                objArr401[i1182] = null;
                objArr401[58] = obj344;
                this.AudioAttributesImplApi21Parcelizer = i1181;
                objArr401[i1182] = obj344;
                return 0;
            case 857:
                Object[] objArr402 = this.onCustomAction;
                int i1183 = this.AudioAttributesImplApi21Parcelizer;
                objArr402[i1183] = objArr402[59];
                int[] iArr623 = this.MediaMetadataCompat;
                iArr623[i1183 + 1] = 3;
                int i1184 = i1183 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1184;
                Object obj345 = objArr402[i1183];
                objArr402[i1183] = null;
                objArr402[i1183] = ((Object[]) obj345)[iArr623[i1184]];
                return 0;
            case 858:
                Object[] objArr403 = this.onCustomAction;
                int i1185 = this.AudioAttributesImplApi21Parcelizer;
                Object obj346 = objArr403[i1185 - 2];
                objArr403[i1185 - 2] = null;
                objArr403[i1185 - 1] = obj346;
                int[] iArr624 = this.MediaMetadataCompat;
                iArr624[i1185 - 2] = iArr624[i1185 - 1];
                int i1186 = i1185 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1186;
                Object obj347 = objArr403[i1186];
                objArr403[i1186] = null;
                int i1187 = iArr624[i1185 - 2];
                Object obj348 = objArr403[i1185 - 1];
                objArr403[i1185 - 1] = null;
                ((Object[]) obj347)[i1187] = obj348;
                this.AudioAttributesImplApi21Parcelizer = i1185 - 2;
                objArr403[i1186] = objArr403[62];
                return 0;
            case 859:
                int i1188 = this.AudioAttributesImplApi21Parcelizer;
                int i1189 = i1188 - 1;
                int[] iArr625 = this.MediaMetadataCompat;
                iArr625[64] = iArr625[i1189];
                this.AudioAttributesImplApi21Parcelizer = i1188;
                iArr625[i1189] = iArr625[65];
                return 0;
            case 860:
                int i1190 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr48 = this.MediaBrowserCompatSearchResultReceiver;
                jArr48[i1190 - 2] = jArr48[i1190 - 2] | jArr48[i1190 - 1];
                int i1191 = i1190 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1191;
                jArr48[34] = jArr48[i1191];
                return 0;
            case 861:
                long[] jArr49 = this.MediaBrowserCompatSearchResultReceiver;
                int i1192 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1192 + 1;
                jArr49[i1192] = jArr49[34];
                return 0;
            case 862:
                int i1193 = this.AudioAttributesImplApi21Parcelizer;
                int i1194 = i1193 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1194;
                Object[] objArr404 = this.onCustomAction;
                Object obj349 = objArr404[i1194];
                objArr404[i1194] = null;
                int[] iArr626 = this.MediaMetadataCompat;
                int i1195 = iArr626[i1193 - 2];
                Object obj350 = objArr404[i1193 - 1];
                objArr404[i1193 - 1] = null;
                ((Object[]) obj349)[i1195] = obj350;
                objArr404[i1194] = objArr404[i1193 - 4];
                this.AudioAttributesImplApi21Parcelizer = i1193 - 1;
                iArr626[i1193 - 2] = 3;
                return 0;
            case 863:
                Object[] objArr405 = this.onCustomAction;
                int i1196 = this.AudioAttributesImplApi21Parcelizer;
                objArr405[i1196] = objArr405[i1196 - 1];
                Object obj351 = objArr405[i1196];
                objArr405[i1196] = null;
                objArr405[68] = obj351;
                this.AudioAttributesImplApi21Parcelizer = i1196 + 1;
                objArr405[i1196] = obj351;
                return 0;
            case 864:
                int i1197 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr627 = this.MediaMetadataCompat;
                iArr627[60] = iArr627[i1197 - 1];
                int i1198 = i1197 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1198;
                Object[] objArr406 = this.onCustomAction;
                Object obj352 = objArr406[i1198];
                objArr406[i1198] = null;
                objArr406[59] = obj352;
                return 0;
            case 865:
                int i1199 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1199;
                Object[] objArr407 = this.onCustomAction;
                Object obj353 = objArr407[i1199];
                objArr407[i1199] = null;
                objArr407[58] = obj353;
                return 0;
            case 866:
                Object[] objArr408 = this.onCustomAction;
                int i1200 = this.AudioAttributesImplApi21Parcelizer;
                objArr408[i1200] = objArr408[58];
                this.AudioAttributesImplApi21Parcelizer = i1200 + 2;
                objArr408[i1200 + 1] = objArr408[59];
                return 0;
            case 867:
                int i1201 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr628 = this.MediaMetadataCompat;
                iArr628[66] = iArr628[i1201 - 1];
                int i1202 = i1201 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1202;
                Object[] objArr409 = this.onCustomAction;
                Object obj354 = objArr409[i1202];
                objArr409[i1202] = null;
                objArr409[65] = obj354;
                return 0;
            case 868:
                int i1203 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr629 = this.MediaMetadataCompat;
                iArr629[64] = iArr629[i1203 - 1];
                int i1204 = i1203 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1204;
                iArr629[63] = iArr629[i1204];
                return 0;
            case 869:
                Object[] objArr410 = this.onCustomAction;
                int i1205 = this.AudioAttributesImplApi21Parcelizer;
                objArr410[i1205] = objArr410[62];
                int[] iArr630 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1205 + 2;
                iArr630[i1205 + 1] = iArr630[64];
                return 0;
            case 870:
                Object[] objArr411 = this.onCustomAction;
                int i1206 = this.AudioAttributesImplApi21Parcelizer;
                objArr411[i1206] = objArr411[62];
                objArr411[i1206 + 1] = objArr411[65];
                int[] iArr631 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1206 + 3;
                iArr631[i1206 + 2] = 0;
                return 0;
            case 871:
                Object[] objArr412 = this.onCustomAction;
                int i1207 = this.AudioAttributesImplApi21Parcelizer;
                objArr412[i1207] = objArr412[62];
                int[] iArr632 = this.MediaMetadataCompat;
                iArr632[i1207 + 1] = iArr632[66];
                this.AudioAttributesImplApi21Parcelizer = i1207 + 3;
                iArr632[i1207 + 2] = iArr632[67];
                return 0;
            case 872:
                int[] iArr633 = this.MediaMetadataCompat;
                int i1208 = this.AudioAttributesImplApi21Parcelizer;
                iArr633[i1208] = iArr633[10];
                this.AudioAttributesImplApi21Parcelizer = i1208 + 2;
                iArr633[i1208 + 1] = iArr633[i1208];
                return 0;
            case 873:
                int i1209 = this.AudioAttributesImplApi21Parcelizer;
                int i1210 = i1209 - 1;
                int[] iArr634 = this.MediaMetadataCompat;
                iArr634[i1209 - 2] = iArr634[i1209 - 2] * iArr634[i1210];
                this.AudioAttributesImplApi21Parcelizer = i1209;
                iArr634[i1210] = 2;
                return 0;
            case 874:
                int i1211 = this.AudioAttributesImplApi21Parcelizer;
                int i1212 = i1211 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1212;
                int[] iArr635 = this.MediaMetadataCompat;
                iArr635[i1211 - 2] = iArr635[i1211 - 2] % iArr635[i1212];
                int i1213 = i1211 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1213;
                iArr635[i1211 - 3] = iArr635[i1211 - 3] / iArr635[i1213];
                return 0;
            case 875:
                int i1214 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1214;
                Object[] objArr413 = this.onCustomAction;
                Object obj355 = objArr413[i1214];
                objArr413[i1214] = null;
                objArr413[59] = obj355;
                return 0;
            case 876:
                int i1215 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1215;
                Object[] objArr414 = this.onCustomAction;
                Object obj356 = objArr414[i1215];
                objArr414[i1215] = null;
                objArr414[65] = obj356;
                return 0;
            case 877:
                int i1216 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr636 = this.MediaMetadataCompat;
                iArr636[64] = iArr636[i1216 - 1];
                iArr636[63] = iArr636[i1216 - 2];
                int i1217 = i1216 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1217;
                Object[] objArr415 = this.onCustomAction;
                Object obj357 = objArr415[i1217];
                objArr415[i1217] = null;
                objArr415[62] = obj357;
                return 0;
            case 878:
                int i1218 = this.AudioAttributesImplApi21Parcelizer;
                int i1219 = i1218 - 1;
                Object[] objArr416 = this.onCustomAction;
                objArr416[i1219] = null;
                objArr416[i1219] = objArr416[62];
                int[] iArr637 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1218 + 1;
                iArr637[i1218] = iArr637[63];
                return 0;
            case 879:
                Object[] objArr417 = this.onCustomAction;
                int i1220 = this.AudioAttributesImplApi21Parcelizer;
                objArr417[i1220] = objArr417[65];
                int[] iArr638 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1220 + 2;
                iArr638[i1220 + 1] = 0;
                return 0;
            case 880:
                int i1221 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr639 = this.MediaMetadataCompat;
                int i1222 = iArr639[i1221 - 1];
                iArr639[65] = i1222;
                int i1223 = i1221 - 2;
                iArr639[64] = iArr639[i1223];
                this.AudioAttributesImplApi21Parcelizer = i1221 - 1;
                iArr639[i1223] = i1222;
                return 0;
            case 881:
                int[] iArr640 = this.MediaMetadataCompat;
                int i1224 = this.AudioAttributesImplApi21Parcelizer;
                iArr640[i1224] = 51;
                this.AudioAttributesImplApi21Parcelizer = i1224 + 2;
                iArr640[i1224 + 1] = 0;
                return 0;
            case 882:
                int[] iArr641 = this.MediaMetadataCompat;
                int i1225 = this.AudioAttributesImplApi21Parcelizer;
                iArr641[i1225] = 1;
                this.AudioAttributesImplApi21Parcelizer = i1225;
                iArr641[13] = iArr641[i1225];
                return 0;
            case 883:
                Object[] objArr418 = this.onCustomAction;
                int i1226 = this.AudioAttributesImplApi21Parcelizer;
                objArr418[i1226] = objArr418[8];
                int[] iArr642 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1226 + 2;
                iArr642[i1226 + 1] = iArr642[12];
                return 0;
            case 884:
                int[] iArr643 = this.MediaMetadataCompat;
                int i1227 = this.AudioAttributesImplApi21Parcelizer;
                iArr643[i1227] = 1;
                this.AudioAttributesImplApi21Parcelizer = i1227;
                iArr643[i1227 - 1] = iArr643[i1227 - 1] + iArr643[i1227];
                return 0;
            case 885:
                Object[] objArr419 = this.onCustomAction;
                int i1228 = this.AudioAttributesImplApi21Parcelizer;
                objArr419[i1228] = objArr419[10];
                this.AudioAttributesImplApi21Parcelizer = i1228 + 2;
                objArr419[i1228 + 1] = objArr419[14];
                return 0;
            case 886:
                int i1229 = this.AudioAttributesImplApi21Parcelizer;
                int i1230 = i1229 - 1;
                int[] iArr644 = this.MediaMetadataCompat;
                iArr644[11] = iArr644[i1230];
                Object[] objArr420 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1229;
                objArr420[i1230] = objArr420[14];
                return 0;
            case 887:
                Object[] objArr421 = this.onCustomAction;
                int i1231 = this.AudioAttributesImplApi21Parcelizer;
                objArr421[i1231] = objArr421[14];
                this.AudioAttributesImplApi21Parcelizer = i1231;
                Object obj358 = objArr421[i1231];
                objArr421[i1231] = null;
                objArr421[9] = obj358;
                return 0;
            case 888:
                Object[] objArr422 = this.onCustomAction;
                int i1232 = this.AudioAttributesImplApi21Parcelizer;
                objArr422[i1232] = objArr422[9];
                int[] iArr645 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1232 + 2;
                iArr645[i1232 + 1] = iArr645[12];
                return 0;
            case 889:
                int[] iArr646 = this.MediaMetadataCompat;
                int i1233 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1233 + 1;
                iArr646[i1233] = 1603;
                return 0;
            case 890:
                int[] iArr647 = this.MediaMetadataCompat;
                int i1234 = this.AudioAttributesImplApi21Parcelizer;
                iArr647[i1234] = 1;
                this.AudioAttributesImplApi21Parcelizer = i1234;
                iArr647[12] = iArr647[i1234];
                return 0;
            case 891:
                int[] iArr648 = this.MediaMetadataCompat;
                int i1235 = this.AudioAttributesImplApi21Parcelizer;
                iArr648[i1235] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1235;
                iArr648[12] = iArr648[i1235];
                return 0;
            case 892:
                Object[] objArr423 = this.onCustomAction;
                int i1236 = this.AudioAttributesImplApi21Parcelizer;
                objArr423[i1236] = objArr423[8];
                int[] iArr649 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1236 + 2;
                iArr649[i1236 + 1] = 1;
                return 0;
            case 893:
                Object[] objArr424 = this.onCustomAction;
                int i1237 = this.AudioAttributesImplApi21Parcelizer;
                objArr424[i1237] = objArr424[8];
                int[] iArr650 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1237 + 2;
                iArr650[i1237 + 1] = iArr650[11];
                return 0;
            case 894:
                int i1238 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr651 = this.MediaMetadataCompat;
                iArr651[i1238 - 2] = iArr651[i1238 - 2] >>> iArr651[i1238 - 1];
                int i1239 = i1238 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1239;
                this.onCustomAction[i1239] = null;
                return 0;
            case 895:
                int[] iArr652 = this.MediaMetadataCompat;
                int i1240 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1240 + 1;
                iArr652[i1240] = 1203;
                return 0;
            case 896:
                int[] iArr653 = this.MediaMetadataCompat;
                int i1241 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1241 + 1;
                iArr653[i1241] = 1403;
                return 0;
            case 897:
                int[] iArr654 = this.MediaMetadataCompat;
                int i1242 = this.AudioAttributesImplApi21Parcelizer;
                iArr654[i1242] = 55;
                this.AudioAttributesImplApi21Parcelizer = i1242;
                iArr654[i1242 - 1] = iArr654[i1242 - 1] + iArr654[i1242];
                return 0;
            case 898:
                int[] iArr655 = this.MediaMetadataCompat;
                int i1243 = this.AudioAttributesImplApi21Parcelizer;
                iArr655[i1243] = 71;
                this.AudioAttributesImplApi21Parcelizer = i1243 + 2;
                iArr655[i1243 + 1] = 0;
                return 0;
            case 899:
                int i1244 = this.AudioAttributesImplApi21Parcelizer;
                int i1245 = i1244 - 1;
                int[] iArr656 = this.MediaMetadataCompat;
                iArr656[11] = iArr656[i1245];
                this.AudioAttributesImplApi21Parcelizer = i1244;
                iArr656[i1245] = -1;
                return 0;
            case 900:
                int[] iArr657 = this.MediaMetadataCompat;
                int i1246 = this.AudioAttributesImplApi21Parcelizer;
                iArr657[i1246] = 2;
                this.AudioAttributesImplApi21Parcelizer = i1246;
                iArr657[10] = iArr657[i1246];
                return 0;
            case 901:
                int[] iArr658 = this.MediaMetadataCompat;
                int i1247 = this.AudioAttributesImplApi21Parcelizer;
                iArr658[i1247] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1247;
                iArr658[10] = iArr658[i1247];
                return 0;
            case 902:
                int i1248 = this.AudioAttributesImplApi21Parcelizer;
                int i1249 = i1248 - 1;
                Object[] objArr425 = this.onCustomAction;
                objArr425[i1249] = null;
                objArr425[i1249] = objArr425[8];
                this.AudioAttributesImplApi21Parcelizer = i1248 + 1;
                objArr425[i1248] = objArr425[i1248 - 1];
                return 0;
            case 903:
                int i1250 = this.AudioAttributesImplApi21Parcelizer;
                int i1251 = i1250 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1251;
                int[] iArr659 = this.MediaMetadataCompat;
                Object[] objArr426 = this.onCustomAction;
                Object obj359 = objArr426[i1250 - 2];
                objArr426[i1250 - 2] = null;
                iArr659[i1250 - 2] = ((int[]) obj359)[iArr659[i1251]];
                this.AudioAttributesImplApi21Parcelizer = i1250;
                iArr659[i1251] = iArr659[i1250 - 2];
                return 0;
            case 904:
                int i1252 = this.AudioAttributesImplApi21Parcelizer;
                int i1253 = i1252 - 1;
                int[] iArr660 = this.MediaMetadataCompat;
                iArr660[9] = iArr660[i1253];
                this.AudioAttributesImplApi21Parcelizer = i1252;
                iArr660[i1253] = 1;
                return 0;
            case 905:
                int[] iArr661 = this.MediaMetadataCompat;
                int i1254 = this.AudioAttributesImplApi21Parcelizer;
                iArr661[i1254] = iArr661[9];
                this.AudioAttributesImplApi21Parcelizer = i1254 + 2;
                iArr661[i1254 + 1] = 3;
                return 0;
            case 906:
                Object[] objArr427 = this.onCustomAction;
                int i1255 = this.AudioAttributesImplApi21Parcelizer;
                objArr427[i1255] = objArr427[8];
                objArr427[i1255 + 1] = objArr427[10];
                this.AudioAttributesImplApi21Parcelizer = i1255 + 3;
                objArr427[i1255 + 2] = objArr427[8];
                return 0;
            case 907:
                int i1256 = this.AudioAttributesImplApi21Parcelizer;
                int i1257 = i1256 - 1;
                Object[] objArr428 = this.onCustomAction;
                Object obj360 = objArr428[i1257];
                objArr428[i1257] = null;
                objArr428[12] = obj360;
                this.AudioAttributesImplApi21Parcelizer = i1256;
                objArr428[i1257] = objArr428[8];
                return 0;
            case 908:
                int i1258 = this.AudioAttributesImplApi21Parcelizer;
                int i1259 = i1258 - 1;
                Object[] objArr429 = this.onCustomAction;
                Object obj361 = objArr429[i1259];
                objArr429[i1259] = null;
                objArr429[13] = obj361;
                this.AudioAttributesImplApi21Parcelizer = i1258;
                objArr429[i1259] = objArr429[8];
                return 0;
            case 909:
                int i1260 = this.AudioAttributesImplApi21Parcelizer;
                int i1261 = i1260 - 1;
                Object[] objArr430 = this.onCustomAction;
                Object obj362 = objArr430[i1261];
                objArr430[i1261] = null;
                objArr430[14] = obj362;
                this.AudioAttributesImplApi21Parcelizer = i1260;
                objArr430[i1261] = objArr430[8];
                return 0;
            case 910:
                int i1262 = this.AudioAttributesImplApi21Parcelizer;
                int i1263 = i1262 - 1;
                int[] iArr662 = this.MediaMetadataCompat;
                iArr662[10] = iArr662[i1263];
                Object[] objArr431 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1262;
                objArr431[i1263] = objArr431[8];
                return 0;
            case 911:
                Object[] objArr432 = this.onCustomAction;
                int i1264 = this.AudioAttributesImplApi21Parcelizer;
                objArr432[i1264] = objArr432[14];
                int[] iArr663 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1264 + 2;
                iArr663[i1264 + 1] = iArr663[9];
                return 0;
            case 912:
                Object[] objArr433 = this.onCustomAction;
                int i1265 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1265 + 1;
                objArr433[i1265] = objArr433[15];
                return 0;
            case 913:
                int i1266 = this.AudioAttributesImplApi21Parcelizer;
                int i1267 = i1266 - 1;
                Object[] objArr434 = this.onCustomAction;
                Object obj363 = objArr434[i1267];
                objArr434[i1267] = null;
                objArr434[14] = obj363;
                this.AudioAttributesImplApi21Parcelizer = i1266;
                objArr434[i1267] = objArr434[13];
                return 0;
            case 914:
                int i1268 = this.AudioAttributesImplApi21Parcelizer;
                int i1269 = i1268 - 1;
                Object[] objArr435 = this.onCustomAction;
                Object obj364 = objArr435[i1269];
                objArr435[i1269] = null;
                objArr435[15] = obj364;
                this.AudioAttributesImplApi21Parcelizer = i1268;
                objArr435[i1269] = objArr435[8];
                return 0;
            case 915:
                int i1270 = this.AudioAttributesImplApi21Parcelizer;
                int i1271 = i1270 - 1;
                Object[] objArr436 = this.onCustomAction;
                Object obj365 = objArr436[i1271];
                objArr436[i1271] = null;
                objArr436[9] = obj365;
                this.AudioAttributesImplApi21Parcelizer = i1270;
                objArr436[i1271] = objArr436[12];
                return 0;
            case 916:
                Object[] objArr437 = this.onCustomAction;
                int i1272 = this.AudioAttributesImplApi21Parcelizer;
                objArr437[i1272] = objArr437[14];
                this.AudioAttributesImplApi21Parcelizer = i1272 + 2;
                objArr437[i1272 + 1] = objArr437[15];
                return 0;
            case 917:
                int i1273 = this.AudioAttributesImplApi21Parcelizer;
                int i1274 = i1273 - 1;
                Object[] objArr438 = this.onCustomAction;
                Object obj366 = objArr438[i1274];
                objArr438[i1274] = null;
                objArr438[12] = obj366;
                objArr438[i1274] = objArr438[11];
                this.AudioAttributesImplApi21Parcelizer = i1273 + 1;
                objArr438[i1273] = objArr438[12];
                return 0;
            case 918:
                int[] iArr664 = this.MediaMetadataCompat;
                int i1275 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1275 + 1;
                iArr664[i1275] = 76;
                return 0;
            case 919:
                int i1276 = this.AudioAttributesImplApi21Parcelizer;
                int i1277 = i1276 - 1;
                Object[] objArr439 = this.onCustomAction;
                Object obj367 = objArr439[i1277];
                objArr439[i1277] = null;
                objArr439[11] = obj367;
                objArr439[i1277] = objArr439[10];
                this.AudioAttributesImplApi21Parcelizer = i1276 + 1;
                objArr439[i1276] = objArr439[11];
                return 0;
            case 920:
                int[] iArr665 = this.MediaMetadataCompat;
                int i1278 = this.AudioAttributesImplApi21Parcelizer;
                iArr665[i1278] = 89;
                iArr665[i1278 - 1] = iArr665[i1278 - 1] + iArr665[i1278];
                this.AudioAttributesImplApi21Parcelizer = i1278 + 1;
                iArr665[i1278] = iArr665[i1278 - 1];
                return 0;
            case 921:
                int[] iArr666 = this.MediaMetadataCompat;
                int i1279 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1279 + 1;
                iArr666[i1279] = 2015;
                return 0;
            case 922:
                int[] iArr667 = this.MediaMetadataCompat;
                int i1280 = this.AudioAttributesImplApi21Parcelizer;
                iArr667[i1280] = iArr667[10];
                this.AudioAttributesImplApi21Parcelizer = i1280 + 2;
                iArr667[i1280 + 1] = 1457;
                return 0;
            case 923:
                int[] iArr668 = this.MediaMetadataCompat;
                int i1281 = this.AudioAttributesImplApi21Parcelizer;
                iArr668[i1281] = iArr668[10];
                this.AudioAttributesImplApi21Parcelizer = i1281 + 2;
                iArr668[i1281 + 1] = 1456;
                return 0;
            case 924:
                int[] iArr669 = this.MediaMetadataCompat;
                int i1282 = this.AudioAttributesImplApi21Parcelizer;
                iArr669[i1282] = iArr669[10];
                this.AudioAttributesImplApi21Parcelizer = i1282 + 2;
                iArr669[i1282 + 1] = 9013;
                return 0;
            case 925:
                int[] iArr670 = this.MediaMetadataCompat;
                int i1283 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1283 + 1;
                iArr670[i1283] = 9012;
                return 0;
            case 926:
                int[] iArr671 = this.MediaMetadataCompat;
                int i1284 = this.AudioAttributesImplApi21Parcelizer;
                iArr671[i1284] = 21;
                this.AudioAttributesImplApi21Parcelizer = i1284;
                iArr671[i1284 - 1] = iArr671[i1284 - 1] + iArr671[i1284];
                return 0;
            case 927:
                int[] iArr672 = this.MediaMetadataCompat;
                int i1285 = this.AudioAttributesImplApi21Parcelizer;
                iArr672[i1285] = iArr672[9];
                this.AudioAttributesImplApi21Parcelizer = i1285 + 2;
                iArr672[i1285 + 1] = 100;
                return 0;
            case 928:
                int[] iArr673 = this.MediaMetadataCompat;
                int i1286 = this.AudioAttributesImplApi21Parcelizer;
                iArr673[i1286] = iArr673[9];
                this.AudioAttributesImplApi21Parcelizer = i1286 + 2;
                iArr673[i1286 + 1] = 106;
                return 0;
            case 929:
                int[] iArr674 = this.MediaMetadataCompat;
                int i1287 = this.AudioAttributesImplApi21Parcelizer;
                iArr674[i1287] = iArr674[9];
                this.AudioAttributesImplApi21Parcelizer = i1287 + 2;
                iArr674[i1287 + 1] = 107;
                return 0;
            case 930:
                int[] iArr675 = this.MediaMetadataCompat;
                int i1288 = this.AudioAttributesImplApi21Parcelizer;
                iArr675[i1288] = iArr675[9];
                this.AudioAttributesImplApi21Parcelizer = i1288 + 2;
                iArr675[i1288 + 1] = 108;
                return 0;
            case 931:
                Object[] objArr440 = this.onCustomAction;
                int i1289 = this.AudioAttributesImplApi21Parcelizer;
                objArr440[i1289] = objArr440[8];
                int[] iArr676 = this.MediaMetadataCompat;
                iArr676[i1289 + 1] = iArr676[9];
                this.AudioAttributesImplApi21Parcelizer = i1289 + 3;
                objArr440[i1289 + 2] = objArr440[10];
                return 0;
            case 932:
                int[] iArr677 = this.MediaMetadataCompat;
                int i1290 = this.AudioAttributesImplApi21Parcelizer;
                iArr677[i1290] = 49;
                iArr677[i1290 - 1] = iArr677[i1290 - 1] + iArr677[i1290];
                this.AudioAttributesImplApi21Parcelizer = i1290 + 1;
                iArr677[i1290] = iArr677[i1290 - 1];
                return 0;
            case 933:
                int[] iArr678 = this.MediaMetadataCompat;
                int i1291 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1291 + 1;
                iArr678[i1291] = 124;
                return 0;
            case 934:
                int[] iArr679 = this.MediaMetadataCompat;
                int i1292 = this.AudioAttributesImplApi21Parcelizer;
                iArr679[i1292] = iArr679[9];
                this.AudioAttributesImplApi21Parcelizer = i1292 + 2;
                iArr679[i1292 + 1] = 1606;
                return 0;
            case 935:
                int[] iArr680 = this.MediaMetadataCompat;
                int i1293 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1293 + 1;
                iArr680[i1293] = 1610;
                return 0;
            case 936:
                int[] iArr681 = this.MediaMetadataCompat;
                int i1294 = this.AudioAttributesImplApi21Parcelizer;
                iArr681[i1294] = 97;
                this.AudioAttributesImplApi21Parcelizer = i1294;
                iArr681[i1294 - 1] = iArr681[i1294 - 1] + iArr681[i1294];
                return 0;
            case 937:
                int[] iArr682 = this.MediaMetadataCompat;
                int i1295 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1295 + 1;
                iArr682[i1295] = 20164;
                return 0;
            case 938:
                int[] iArr683 = this.MediaMetadataCompat;
                int i1296 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1296 + 1;
                iArr683[i1296] = 19785;
                return 0;
            case 939:
                int[] iArr684 = this.MediaMetadataCompat;
                int i1297 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1297 + 1;
                iArr684[i1297] = 67;
                return 0;
            case 940:
                long[] jArr50 = this.MediaBrowserCompatSearchResultReceiver;
                int i1298 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1298 + 1;
                jArr50[i1298] = jArr50[9];
                return 0;
            case 941:
                long[] jArr51 = this.MediaBrowserCompatSearchResultReceiver;
                int i1299 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1299 + 1;
                jArr51[i1299] = jArr51[11];
                return 0;
            case 942:
                long[] jArr52 = this.MediaBrowserCompatSearchResultReceiver;
                int i1300 = this.AudioAttributesImplApi21Parcelizer;
                jArr52[i1300] = jArr52[9];
                this.RatingCompat[i1300] = jArr52[i1300];
                this.AudioAttributesImplApi21Parcelizer = i1300 + 2;
                jArr52[i1300 + 1] = jArr52[11];
                return 0;
            case 943:
                this.RatingCompat[this.AudioAttributesImplApi21Parcelizer - 1] = this.MediaBrowserCompatSearchResultReceiver[r2 - 1];
                return 0;
            case 944:
                double[] dArr = this.MediaDescriptionCompat;
                int i1301 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1301 + 1;
                dArr[i1301] = this.MediaBrowserCompatItemReceiver;
                return 0;
            case 945:
                int i1302 = this.AudioAttributesImplApi21Parcelizer;
                int i1303 = i1302 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1303;
                float[] fArr8 = this.RatingCompat;
                fArr8[i1302 - 2] = fArr8[i1302 - 2] / fArr8[i1303];
                this.MediaDescriptionCompat[i1302 - 2] = fArr8[i1302 - 2];
                return 0;
            case 946:
                int i1304 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1304;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i1304] >= 0 ? 0 : 1;
                return 0;
            case 947:
                int i1305 = this.AudioAttributesImplApi21Parcelizer;
                int i1306 = i1305 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1306;
                double[] dArr2 = this.MediaDescriptionCompat;
                this.MediaMetadataCompat[i1305 - 2] = (dArr2[i1305 - 2] > dArr2[i1306] ? 1 : (dArr2[i1305 - 2] == dArr2[i1306] ? 0 : -1));
                return 0;
            case 948:
                Object[] objArr441 = this.onCustomAction;
                int i1307 = this.AudioAttributesImplApi21Parcelizer;
                objArr441[i1307] = objArr441[13];
                this.AudioAttributesImplApi21Parcelizer = i1307 + 2;
                objArr441[i1307 + 1] = objArr441[11];
                return 0;
            case 949:
                int i1308 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1308;
                this.RemoteActionCompatParcelizer = this.MediaMetadataCompat[i1308] < 0 ? 0 : 1;
                return 0;
            case 950:
                int[] iArr685 = this.MediaMetadataCompat;
                int i1309 = this.AudioAttributesImplApi21Parcelizer;
                iArr685[i1309] = 109;
                iArr685[i1309 - 1] = iArr685[i1309 - 1] + iArr685[i1309];
                this.AudioAttributesImplApi21Parcelizer = i1309 + 1;
                iArr685[i1309] = iArr685[i1309 - 1];
                return 0;
            case 951:
                int[] iArr686 = this.MediaMetadataCompat;
                int i1310 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1310 + 1;
                iArr686[i1310] = 40;
                return 0;
            case 952:
                int i1311 = this.AudioAttributesImplApi21Parcelizer;
                int i1312 = i1311 - 1;
                float[] fArr9 = this.RatingCompat;
                fArr9[9] = fArr9[i1312];
                Object[] objArr442 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1311;
                objArr442[i1312] = objArr442[8];
                return 0;
            case 953:
                float[] fArr10 = this.RatingCompat;
                int i1313 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1313 + 1;
                fArr10[i1313] = fArr10[9];
                return 0;
            case 954:
                int[] iArr687 = this.MediaMetadataCompat;
                int i1314 = this.AudioAttributesImplApi21Parcelizer;
                iArr687[i1314] = 57;
                iArr687[i1314 - 1] = iArr687[i1314 - 1] + iArr687[i1314];
                this.AudioAttributesImplApi21Parcelizer = i1314 + 1;
                iArr687[i1314] = iArr687[i1314 - 1];
                return 0;
            case 955:
                int[] iArr688 = this.MediaMetadataCompat;
                int i1315 = this.AudioAttributesImplApi21Parcelizer;
                iArr688[i1315] = 91;
                this.AudioAttributesImplApi21Parcelizer = i1315;
                iArr688[i1315 - 1] = iArr688[i1315 - 1] + iArr688[i1315];
                return 0;
            case 956:
                int[] iArr689 = this.MediaMetadataCompat;
                int i1316 = this.AudioAttributesImplApi21Parcelizer;
                iArr689[i1316] = 5;
                iArr689[i1316 + 1] = 5;
                int i1317 = i1316 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1317;
                iArr689[i1316] = iArr689[i1316] + iArr689[i1317];
                return 0;
            case 957:
                int[] iArr690 = this.MediaMetadataCompat;
                int i1318 = this.AudioAttributesImplApi21Parcelizer;
                iArr690[i1318] = 28;
                this.AudioAttributesImplApi21Parcelizer = i1318 + 2;
                iArr690[i1318 + 1] = 0;
                return 0;
            case 958:
                int[] iArr691 = this.MediaMetadataCompat;
                int i1319 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1319 + 1;
                iArr691[i1319] = 56;
                return 0;
            case 959:
                Object[] objArr443 = this.onCustomAction;
                int i1320 = this.AudioAttributesImplApi21Parcelizer;
                objArr443[i1320] = objArr443[i1320 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1320;
                Object obj368 = objArr443[i1320];
                objArr443[i1320] = null;
                objArr443[16] = obj368;
                return 0;
            case 960:
                Object[] objArr444 = this.onCustomAction;
                int i1321 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1321 + 1;
                objArr444[i1321] = objArr444[16];
                return 0;
            case 961:
                int[] iArr692 = this.MediaMetadataCompat;
                int i1322 = this.AudioAttributesImplApi21Parcelizer;
                iArr692[i1322] = 1;
                this.AudioAttributesImplApi21Parcelizer = i1322;
                iArr692[15] = iArr692[i1322];
                return 0;
            case 962:
                int i1323 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1323;
                int[] iArr693 = this.MediaMetadataCompat;
                iArr693[15] = iArr693[i1323];
                return 0;
            case 963:
                int i1324 = this.AudioAttributesImplApi21Parcelizer;
                int i1325 = i1324 - 1;
                Object[] objArr445 = this.onCustomAction;
                Object obj369 = objArr445[i1325];
                objArr445[i1325] = null;
                objArr445[16] = obj369;
                int[] iArr694 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1324;
                iArr694[i1325] = iArr694[15];
                return 0;
            case 964:
                int[] iArr695 = this.MediaMetadataCompat;
                int i1326 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1326 + 1;
                iArr695[i1326] = 1520;
                return 0;
            case 965:
                int i1327 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1327;
                Object[] objArr446 = this.onCustomAction;
                Object obj370 = objArr446[i1327];
                objArr446[i1327] = null;
                objArr446[16] = obj370;
                return 0;
            case 966:
                int[] iArr696 = this.MediaMetadataCompat;
                int i1328 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1328 + 1;
                iArr696[i1328] = 4202;
                return 0;
            case 967:
                int[] iArr697 = this.MediaMetadataCompat;
                int i1329 = this.AudioAttributesImplApi21Parcelizer;
                iArr697[i1329] = 1525;
                this.AudioAttributesImplApi21Parcelizer = i1329;
                iArr697[12] = iArr697[i1329];
                return 0;
            case 968:
                int[] iArr698 = this.MediaMetadataCompat;
                int i1330 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1330 + 1;
                iArr698[i1330] = 1524;
                return 0;
            case 969:
                int[] iArr699 = this.MediaMetadataCompat;
                int i1331 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1331 + 1;
                iArr699[i1331] = 1523;
                return 0;
            case 970:
                int[] iArr700 = this.MediaMetadataCompat;
                int i1332 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1332 + 1;
                iArr700[i1332] = 1522;
                return 0;
            case 971:
                int i1333 = this.AudioAttributesImplApi21Parcelizer;
                int i1334 = i1333 - 1;
                Object[] objArr447 = this.onCustomAction;
                Object obj371 = objArr447[i1334];
                objArr447[i1334] = null;
                objArr447[16] = obj371;
                int[] iArr701 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1333;
                iArr701[i1334] = 1521;
                return 0;
            case 972:
                int i1335 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1335;
                Object[] objArr448 = this.onCustomAction;
                Object obj372 = objArr448[i1335];
                objArr448[i1335] = null;
                objArr448[17] = obj372;
                return 0;
            case 973:
                int i1336 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1336;
                Object[] objArr449 = this.onCustomAction;
                Object obj373 = objArr449[i1336];
                objArr449[i1336] = null;
                objArr449[18] = obj373;
                return 0;
            case 974:
                int[] iArr702 = this.MediaMetadataCompat;
                int i1337 = this.AudioAttributesImplApi21Parcelizer;
                iArr702[i1337] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1337 + 2;
                iArr702[i1337 + 1] = iArr702[12];
                return 0;
            case 975:
                Object[] objArr450 = this.onCustomAction;
                int i1338 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1338 + 1;
                objArr450[i1338] = objArr450[18];
                return 0;
            case 976:
                int[] iArr703 = this.MediaMetadataCompat;
                int i1339 = this.AudioAttributesImplApi21Parcelizer;
                iArr703[i1339] = 1;
                Object[] objArr451 = this.onCustomAction;
                objArr451[i1339 + 1] = objArr451[16];
                int i1340 = i1339 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1340;
                Object obj374 = objArr451[i1340];
                objArr451[i1340] = null;
                int i1341 = iArr703[i1339];
                Object obj375 = objArr451[i1339 + 1];
                objArr451[i1339 + 1] = null;
                ((Object[]) obj374)[i1341] = obj375;
                return 0;
            case 977:
                int[] iArr704 = this.MediaMetadataCompat;
                int i1342 = this.AudioAttributesImplApi21Parcelizer;
                iArr704[i1342] = iArr704[12];
                Object[] objArr452 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1342 + 2;
                objArr452[i1342 + 1] = objArr452[17];
                return 0;
            case 978:
                int i1343 = this.AudioAttributesImplApi21Parcelizer;
                int i1344 = i1343 - 1;
                Object[] objArr453 = this.onCustomAction;
                Object obj376 = objArr453[i1344];
                objArr453[i1344] = null;
                objArr453[16] = obj376;
                this.AudioAttributesImplApi21Parcelizer = i1343;
                objArr453[i1344] = objArr453[8];
                return 0;
            case 979:
                int[] iArr705 = this.MediaMetadataCompat;
                int i1345 = this.AudioAttributesImplApi21Parcelizer;
                iArr705[i1345] = iArr705[12];
                iArr705[13] = iArr705[i1345];
                Object[] objArr454 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1345 + 1;
                objArr454[i1345] = objArr454[16];
                return 0;
            case 980:
                int[] iArr706 = this.MediaMetadataCompat;
                int i1346 = this.AudioAttributesImplApi21Parcelizer;
                iArr706[i1346] = 1526;
                this.AudioAttributesImplApi21Parcelizer = i1346;
                iArr706[13] = iArr706[i1346];
                return 0;
            case 981:
                Object[] objArr455 = this.onCustomAction;
                int i1347 = this.AudioAttributesImplApi21Parcelizer;
                objArr455[i1347] = objArr455[10];
                int[] iArr707 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1347 + 2;
                iArr707[i1347 + 1] = 1526;
                return 0;
            case 982:
                int i1348 = this.AudioAttributesImplApi21Parcelizer;
                int i1349 = i1348 - 1;
                Object[] objArr456 = this.onCustomAction;
                Object obj377 = objArr456[i1349];
                objArr456[i1349] = null;
                objArr456[18] = obj377;
                this.AudioAttributesImplApi21Parcelizer = i1348;
                objArr456[i1349] = objArr456[10];
                return 0;
            case 983:
                int i1350 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1350;
                int[] iArr708 = this.MediaMetadataCompat;
                iArr708[14] = iArr708[i1350];
                return 0;
            case 984:
                int[] iArr709 = this.MediaMetadataCompat;
                int i1351 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1351 + 1;
                iArr709[i1351] = iArr709[14];
                return 0;
            case 985:
                int[] iArr710 = this.MediaMetadataCompat;
                int i1352 = this.AudioAttributesImplApi21Parcelizer;
                iArr710[i1352] = 1546;
                this.AudioAttributesImplApi21Parcelizer = i1352;
                iArr710[12] = iArr710[i1352];
                return 0;
            case 986:
                int[] iArr711 = this.MediaMetadataCompat;
                int i1353 = this.AudioAttributesImplApi21Parcelizer;
                iArr711[i1353] = iArr711[13];
                this.AudioAttributesImplApi21Parcelizer = i1353;
                iArr711[12] = iArr711[i1353];
                return 0;
            case 987:
                int[] iArr712 = this.MediaMetadataCompat;
                int i1354 = this.AudioAttributesImplApi21Parcelizer;
                iArr712[i1354] = 1547;
                this.AudioAttributesImplApi21Parcelizer = i1354;
                iArr712[12] = iArr712[i1354];
                return 0;
            case 988:
                int[] iArr713 = this.MediaMetadataCompat;
                int i1355 = this.AudioAttributesImplApi21Parcelizer;
                iArr713[i1355] = iArr713[i1355 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1355;
                iArr713[14] = iArr713[i1355];
                return 0;
            case 989:
                int[] iArr714 = this.MediaMetadataCompat;
                int i1356 = this.AudioAttributesImplApi21Parcelizer;
                iArr714[i1356] = 1528;
                this.AudioAttributesImplApi21Parcelizer = i1356;
                iArr714[12] = iArr714[i1356];
                return 0;
            case 990:
                int[] iArr715 = this.MediaMetadataCompat;
                int i1357 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1357 + 1;
                iArr715[i1357] = 1527;
                return 0;
            case 991:
                int i1358 = this.AudioAttributesImplApi21Parcelizer;
                int i1359 = i1358 - 1;
                Object[] objArr457 = this.onCustomAction;
                Object obj378 = objArr457[i1359];
                objArr457[i1359] = null;
                objArr457[16] = obj378;
                int[] iArr716 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1358;
                iArr716[i1359] = iArr716[14];
                return 0;
            case 992:
                Object[] objArr458 = this.onCustomAction;
                int i1360 = this.AudioAttributesImplApi21Parcelizer;
                objArr458[i1360] = objArr458[16];
                int[] iArr717 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1360 + 2;
                iArr717[i1360 + 1] = iArr717[13];
                return 0;
            case 993:
                Object[] objArr459 = this.onCustomAction;
                int i1361 = this.AudioAttributesImplApi21Parcelizer;
                objArr459[i1361] = objArr459[i1361 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1361;
                Object obj379 = objArr459[i1361];
                objArr459[i1361] = null;
                objArr459[17] = obj379;
                return 0;
            case 994:
                int i1362 = this.AudioAttributesImplApi21Parcelizer;
                int i1363 = i1362 - 1;
                Object[] objArr460 = this.onCustomAction;
                Object obj380 = objArr460[i1363];
                objArr460[i1363] = null;
                objArr460[16] = obj380;
                int[] iArr718 = this.MediaMetadataCompat;
                iArr718[i1363] = iArr718[12];
                int i1364 = i1362 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1364;
                iArr718[13] = iArr718[i1364];
                return 0;
            case 995:
                Object[] objArr461 = this.onCustomAction;
                int i1365 = this.AudioAttributesImplApi21Parcelizer;
                objArr461[i1365] = objArr461[17];
                Object obj381 = objArr461[i1365];
                objArr461[i1365] = null;
                objArr461[16] = obj381;
                int[] iArr719 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1365 + 1;
                iArr719[i1365] = iArr719[12];
                return 0;
            case 996:
                int i1366 = this.AudioAttributesImplApi21Parcelizer;
                int i1367 = i1366 - 1;
                int[] iArr720 = this.MediaMetadataCompat;
                iArr720[13] = iArr720[i1367];
                Object[] objArr462 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1366;
                objArr462[i1367] = objArr462[8];
                return 0;
            case 997:
                Object[] objArr463 = this.onCustomAction;
                int i1368 = this.AudioAttributesImplApi21Parcelizer;
                objArr463[i1368] = objArr463[17];
                this.AudioAttributesImplApi21Parcelizer = i1368;
                Object obj382 = objArr463[i1368];
                objArr463[i1368] = null;
                objArr463[16] = obj382;
                return 0;
            case 998:
                int[] iArr721 = this.MediaMetadataCompat;
                int i1369 = this.AudioAttributesImplApi21Parcelizer;
                iArr721[i1369] = 1529;
                this.AudioAttributesImplApi21Parcelizer = i1369;
                iArr721[12] = iArr721[i1369];
                return 0;
            case 999:
                int[] iArr722 = this.MediaMetadataCompat;
                int i1370 = this.AudioAttributesImplApi21Parcelizer;
                iArr722[i1370] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1370;
                iArr722[14] = iArr722[i1370];
                return 0;
            case 1000:
                int[] iArr723 = this.MediaMetadataCompat;
                int i1371 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1371 + 1;
                iArr723[i1371] = 1530;
                return 0;
            case 1001:
                int[] iArr724 = this.MediaMetadataCompat;
                int i1372 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1372 + 1;
                iArr724[i1372] = iArr724[15];
                return 0;
            case 1002:
                int[] iArr725 = this.MediaMetadataCompat;
                int i1373 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1373 + 1;
                iArr725[i1373] = 1531;
                return 0;
            case 1003:
                int i1374 = this.AudioAttributesImplApi21Parcelizer;
                int i1375 = i1374 - 1;
                Object[] objArr464 = this.onCustomAction;
                Object obj383 = objArr464[i1375];
                objArr464[i1375] = null;
                objArr464[16] = obj383;
                int[] iArr726 = this.MediaMetadataCompat;
                iArr726[i1375] = 1532;
                int i1376 = i1374 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1376;
                iArr726[12] = iArr726[i1376];
                return 0;
            case 1004:
                int i1377 = this.AudioAttributesImplApi21Parcelizer;
                int i1378 = i1377 - 1;
                Object[] objArr465 = this.onCustomAction;
                Object obj384 = objArr465[i1378];
                objArr465[i1378] = null;
                objArr465[16] = obj384;
                int[] iArr727 = this.MediaMetadataCompat;
                iArr727[i1378] = 1533;
                int i1379 = i1377 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1379;
                iArr727[12] = iArr727[i1379];
                return 0;
            case 1005:
                int[] iArr728 = this.MediaMetadataCompat;
                int i1380 = this.AudioAttributesImplApi21Parcelizer;
                iArr728[i1380] = 1534;
                this.AudioAttributesImplApi21Parcelizer = i1380;
                iArr728[12] = iArr728[i1380];
                return 0;
            case AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE /* 1006 */:
                int[] iArr729 = this.MediaMetadataCompat;
                int i1381 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1381 + 1;
                iArr729[i1381] = 1535;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_ENABLED /* 1007 */:
                int[] iArr730 = this.MediaMetadataCompat;
                int i1382 = this.AudioAttributesImplApi21Parcelizer;
                iArr730[i1382] = 1;
                iArr730[13] = iArr730[i1382];
                this.AudioAttributesImplApi21Parcelizer = i1382 + 1;
                iArr730[i1382] = 1;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED /* 1008 */:
                int[] iArr731 = this.MediaMetadataCompat;
                int i1383 = this.AudioAttributesImplApi21Parcelizer;
                iArr731[i1383] = 1536;
                this.AudioAttributesImplApi21Parcelizer = i1383;
                iArr731[12] = iArr731[i1383];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED /* 1009 */:
                int[] iArr732 = this.MediaMetadataCompat;
                int i1384 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1384 + 1;
                iArr732[i1384] = 1544;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING /* 1010 */:
                int[] iArr733 = this.MediaMetadataCompat;
                int i1385 = this.AudioAttributesImplApi21Parcelizer;
                iArr733[i1385] = 1537;
                this.AudioAttributesImplApi21Parcelizer = i1385;
                iArr733[12] = iArr733[i1385];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_UNDERRUN /* 1011 */:
                int i1386 = this.AudioAttributesImplApi21Parcelizer;
                int i1387 = i1386 - 1;
                Object[] objArr466 = this.onCustomAction;
                Object obj385 = objArr466[i1387];
                objArr466[i1387] = null;
                objArr466[16] = obj385;
                int[] iArr734 = this.MediaMetadataCompat;
                iArr734[i1387] = 1538;
                int i1388 = i1386 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1388;
                iArr734[12] = iArr734[i1388];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED /* 1012 */:
                int i1389 = this.AudioAttributesImplApi21Parcelizer;
                int i1390 = i1389 - 1;
                Object[] objArr467 = this.onCustomAction;
                Object obj386 = objArr467[i1390];
                objArr467[i1390] = null;
                objArr467[16] = obj386;
                int[] iArr735 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1389;
                iArr735[i1390] = 1539;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_DISABLED /* 1013 */:
                int[] iArr736 = this.MediaMetadataCompat;
                int i1391 = this.AudioAttributesImplApi21Parcelizer;
                iArr736[i1391] = 1542;
                this.AudioAttributesImplApi21Parcelizer = i1391;
                iArr736[12] = iArr736[i1391];
                return 0;
            case AnalyticsListener.EVENT_AUDIO_SINK_ERROR /* 1014 */:
                int i1392 = this.AudioAttributesImplApi21Parcelizer;
                int i1393 = i1392 - 1;
                Object[] objArr468 = this.onCustomAction;
                Object obj387 = objArr468[i1393];
                objArr468[i1393] = null;
                objArr468[16] = obj387;
                int[] iArr737 = this.MediaMetadataCompat;
                iArr737[i1393] = 1540;
                int i1394 = i1392 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1394;
                iArr737[12] = iArr737[i1394];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_ENABLED /* 1015 */:
                int i1395 = this.AudioAttributesImplApi21Parcelizer;
                int i1396 = i1395 - 1;
                Object[] objArr469 = this.onCustomAction;
                Object obj388 = objArr469[i1396];
                objArr469[i1396] = null;
                objArr469[16] = obj388;
                int[] iArr738 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1395;
                iArr738[i1396] = 4104;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED /* 1016 */:
                int[] iArr739 = this.MediaMetadataCompat;
                int i1397 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1397 + 1;
                iArr739[i1397] = 1541;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED /* 1017 */:
                int[] iArr740 = this.MediaMetadataCompat;
                int i1398 = this.AudioAttributesImplApi21Parcelizer;
                iArr740[i1398] = iArr740[13];
                iArr740[12] = iArr740[i1398];
                Object[] objArr470 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1398 + 1;
                objArr470[i1398] = objArr470[17];
                return 0;
            case AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES /* 1018 */:
                int i1399 = this.AudioAttributesImplApi21Parcelizer;
                int i1400 = i1399 - 1;
                int[] iArr741 = this.MediaMetadataCompat;
                int i1401 = iArr741[i1400];
                iArr741[14] = i1401;
                Object[] objArr471 = this.onCustomAction;
                objArr471[i1400] = objArr471[8];
                this.AudioAttributesImplApi21Parcelizer = i1399 + 1;
                iArr741[i1399] = i1401;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED /* 1019 */:
                int i1402 = this.AudioAttributesImplApi21Parcelizer;
                int i1403 = i1402 - 1;
                Object[] objArr472 = this.onCustomAction;
                Object obj389 = objArr472[i1403];
                objArr472[i1403] = null;
                objArr472[16] = obj389;
                int[] iArr742 = this.MediaMetadataCompat;
                iArr742[i1403] = iArr742[14];
                this.AudioAttributesImplApi21Parcelizer = i1402 + 1;
                iArr742[i1402] = 2;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_DISABLED /* 1020 */:
                int[] iArr743 = this.MediaMetadataCompat;
                int i1404 = this.AudioAttributesImplApi21Parcelizer;
                iArr743[i1404] = 1545;
                this.AudioAttributesImplApi21Parcelizer = i1404;
                iArr743[12] = iArr743[i1404];
                return 0;
            case AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET /* 1021 */:
                int i1405 = this.AudioAttributesImplApi21Parcelizer;
                int i1406 = i1405 - 1;
                Object[] objArr473 = this.onCustomAction;
                Object obj390 = objArr473[i1406];
                objArr473[i1406] = null;
                objArr473[17] = obj390;
                int[] iArr744 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1405;
                iArr744[i1406] = iArr744[11];
                return 0;
            case AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED /* 1022 */:
                int i1407 = this.AudioAttributesImplApi21Parcelizer;
                int i1408 = i1407 - 1;
                int[] iArr745 = this.MediaMetadataCompat;
                iArr745[i1407 - 2] = iArr745[i1407 - 2] & iArr745[i1408];
                this.AudioAttributesImplApi21Parcelizer = i1407;
                iArr745[i1408] = 3;
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_LOADED /* 1023 */:
                Object[] objArr474 = this.onCustomAction;
                int i1409 = this.AudioAttributesImplApi21Parcelizer;
                objArr474[i1409] = objArr474[9];
                int[] iArr746 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1409 + 2;
                iArr746[i1409 + 1] = 1;
                return 0;
            case 1024:
                int i1410 = this.AudioAttributesImplApi21Parcelizer;
                int i1411 = i1410 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1411;
                Object[] objArr475 = this.onCustomAction;
                Object obj391 = objArr475[i1411];
                objArr475[i1411] = null;
                int[] iArr747 = this.MediaMetadataCompat;
                int i1412 = iArr747[i1410 - 2];
                Object obj392 = objArr475[i1410 - 1];
                objArr475[i1410 - 1] = null;
                ((Object[]) obj391)[i1412] = obj392;
                iArr747[i1411] = iArr747[12];
                this.AudioAttributesImplApi21Parcelizer = i1410 - 1;
                objArr475[i1410 - 2] = objArr475[18];
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_RESTORED /* 1025 */:
                int i1413 = this.AudioAttributesImplApi21Parcelizer;
                int i1414 = i1413 - 1;
                int[] iArr748 = this.MediaMetadataCompat;
                iArr748[14] = iArr748[i1414];
                Object[] objArr476 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1413;
                objArr476[i1414] = objArr476[8];
                return 0;
            case AnalyticsListener.EVENT_DRM_KEYS_REMOVED /* 1026 */:
                Object[] objArr477 = this.onCustomAction;
                int i1415 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1415 + 1;
                objArr477[i1415] = objArr477[17];
                return 0;
            case AnalyticsListener.EVENT_DRM_SESSION_RELEASED /* 1027 */:
                int i1416 = this.AudioAttributesImplApi21Parcelizer;
                int i1417 = i1416 - 1;
                int[] iArr749 = this.MediaMetadataCompat;
                iArr749[11] = iArr749[i1417];
                Object[] objArr478 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1416;
                objArr478[i1417] = objArr478[8];
                return 0;
            case AnalyticsListener.EVENT_PLAYER_RELEASED /* 1028 */:
                int i1418 = this.AudioAttributesImplApi21Parcelizer;
                int i1419 = i1418 - 1;
                int[] iArr750 = this.MediaMetadataCompat;
                iArr750[15] = iArr750[i1419];
                this.AudioAttributesImplApi21Parcelizer = i1418;
                iArr750[i1419] = 0;
                return 0;
            case AnalyticsListener.EVENT_AUDIO_CODEC_ERROR /* 1029 */:
                int[] iArr751 = this.MediaMetadataCompat;
                int i1420 = this.AudioAttributesImplApi21Parcelizer;
                iArr751[i1420] = iArr751[15];
                this.AudioAttributesImplApi21Parcelizer = i1420 + 2;
                iArr751[i1420 + 1] = 3;
                return 0;
            case AnalyticsListener.EVENT_VIDEO_CODEC_ERROR /* 1030 */:
                Object[] objArr479 = this.onCustomAction;
                int i1421 = this.AudioAttributesImplApi21Parcelizer;
                objArr479[i1421] = objArr479[8];
                int[] iArr752 = this.MediaMetadataCompat;
                iArr752[i1421 + 1] = iArr752[15];
                this.AudioAttributesImplApi21Parcelizer = i1421 + 3;
                iArr752[i1421 + 2] = 1;
                return 0;
            case 1031:
                Object[] objArr480 = this.onCustomAction;
                int i1422 = this.AudioAttributesImplApi21Parcelizer;
                objArr480[i1422] = objArr480[8];
                objArr480[i1422 + 1] = objArr480[10];
                this.AudioAttributesImplApi21Parcelizer = i1422 + 3;
                objArr480[i1422 + 2] = objArr480[17];
                return 0;
            case 1032:
                Object[] objArr481 = this.onCustomAction;
                int i1423 = this.AudioAttributesImplApi21Parcelizer;
                objArr481[i1423] = objArr481[8];
                this.AudioAttributesImplApi21Parcelizer = i1423 + 2;
                objArr481[i1423 + 1] = objArr481[16];
                return 0;
            case 1033:
                int[] iArr753 = this.MediaMetadataCompat;
                int i1424 = this.AudioAttributesImplApi21Parcelizer;
                iArr753[i1424] = 21;
                iArr753[i1424 - 1] = iArr753[i1424 - 1] + iArr753[i1424];
                this.AudioAttributesImplApi21Parcelizer = i1424 + 1;
                iArr753[i1424] = iArr753[i1424 - 1];
                return 0;
            case 1034:
                int[] iArr754 = this.MediaMetadataCompat;
                int i1425 = this.AudioAttributesImplApi21Parcelizer;
                iArr754[i1425] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1425;
                iArr754[15] = iArr754[i1425];
                return 0;
            case 1035:
                int i1426 = this.AudioAttributesImplApi21Parcelizer;
                int i1427 = i1426 - 1;
                Object[] objArr482 = this.onCustomAction;
                Object obj393 = objArr482[i1427];
                objArr482[i1427] = null;
                objArr482[16] = obj393;
                int[] iArr755 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1426;
                iArr755[i1427] = 10810;
                return 0;
            case 1036:
                int[] iArr756 = this.MediaMetadataCompat;
                int i1428 = this.AudioAttributesImplApi21Parcelizer;
                iArr756[i1428] = 15;
                iArr756[i1428 - 1] = iArr756[i1428 - 1] + iArr756[i1428];
                this.AudioAttributesImplApi21Parcelizer = i1428 + 1;
                iArr756[i1428] = iArr756[i1428 - 1];
                return 0;
            case 1037:
                int[] iArr757 = this.MediaMetadataCompat;
                int i1429 = this.AudioAttributesImplApi21Parcelizer;
                iArr757[i1429] = 88;
                this.AudioAttributesImplApi21Parcelizer = i1429 + 2;
                iArr757[i1429 + 1] = 0;
                return 0;
            case 1038:
                int[] iArr758 = this.MediaMetadataCompat;
                int i1430 = this.AudioAttributesImplApi21Parcelizer;
                iArr758[i1430] = 107;
                iArr758[i1430 - 1] = iArr758[i1430 - 1] + iArr758[i1430];
                this.AudioAttributesImplApi21Parcelizer = i1430 + 1;
                iArr758[i1430] = iArr758[i1430 - 1];
                return 0;
            case 1039:
                int[] iArr759 = this.MediaMetadataCompat;
                int i1431 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1431 + 1;
                iArr759[i1431] = 18;
                return 0;
            case 1040:
                Object[] objArr483 = this.onCustomAction;
                int i1432 = this.AudioAttributesImplApi21Parcelizer;
                objArr483[i1432] = objArr483[8];
                this.AudioAttributesImplApi21Parcelizer = i1432 + 2;
                objArr483[i1432 + 1] = objArr483[8];
                return 0;
            case 1041:
                int[] iArr760 = this.MediaMetadataCompat;
                int i1433 = this.AudioAttributesImplApi21Parcelizer;
                iArr760[i1433] = 27;
                this.AudioAttributesImplApi21Parcelizer = i1433;
                iArr760[i1433 - 1] = iArr760[i1433 - 1] + iArr760[i1433];
                return 0;
            case 1042:
                Object[] objArr484 = this.onCustomAction;
                int i1434 = this.AudioAttributesImplApi21Parcelizer;
                objArr484[i1434] = objArr484[11];
                objArr484[i1434 + 1] = objArr484[12];
                this.AudioAttributesImplApi21Parcelizer = i1434 + 3;
                objArr484[i1434 + 2] = objArr484[10];
                return 0;
            case 1043:
                Object[] objArr485 = this.onCustomAction;
                int i1435 = this.AudioAttributesImplApi21Parcelizer;
                objArr485[i1435] = objArr485[13];
                int[] iArr761 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1435 + 2;
                iArr761[i1435 + 1] = iArr761[9];
                return 0;
            case 1044:
                int[] iArr762 = this.MediaMetadataCompat;
                int i1436 = this.AudioAttributesImplApi21Parcelizer;
                iArr762[i1436] = 43;
                this.AudioAttributesImplApi21Parcelizer = i1436;
                iArr762[i1436 - 1] = iArr762[i1436 - 1] + iArr762[i1436];
                return 0;
            case 1045:
                int i1437 = this.AudioAttributesImplApi21Parcelizer;
                int i1438 = i1437 - 1;
                long[] jArr53 = this.MediaBrowserCompatSearchResultReceiver;
                jArr53[13] = jArr53[i1438];
                this.AudioAttributesImplApi21Parcelizer = i1437;
                jArr53[i1438] = 0;
                return 0;
            case 1046:
                int i1439 = this.AudioAttributesImplApi21Parcelizer;
                int i1440 = i1439 - 1;
                long[] jArr54 = this.MediaBrowserCompatSearchResultReceiver;
                jArr54[9] = jArr54[i1440];
                jArr54[i1440] = jArr54[13];
                this.AudioAttributesImplApi21Parcelizer = i1439 + 1;
                jArr54[i1439] = 0;
                return 0;
            case 1047:
                int i1441 = this.AudioAttributesImplApi21Parcelizer;
                int i1442 = i1441 - 1;
                long[] jArr55 = this.MediaBrowserCompatSearchResultReceiver;
                jArr55[11] = jArr55[i1442];
                this.RatingCompat[i1441 - 2] = jArr55[i1441 - 2];
                this.AudioAttributesImplApi21Parcelizer = i1441;
                jArr55[i1442] = jArr55[13];
                return 0;
            case 1048:
                int i1443 = this.AudioAttributesImplApi21Parcelizer;
                float[] fArr11 = this.RatingCompat;
                fArr11[i1443 - 2] = fArr11[i1443 - 2] * fArr11[i1443 - 1];
                int i1444 = i1443 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1444;
                this.MediaMetadataCompat[i1443 - 3] = (fArr11[i1443 - 3] > fArr11[i1444] ? 1 : (fArr11[i1443 - 3] == fArr11[i1444] ? 0 : -1));
                return 0;
            case 1049:
                int i1445 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1445;
                long[] jArr56 = this.MediaBrowserCompatSearchResultReceiver;
                jArr56[9] = jArr56[i1445];
                return 0;
            case 1050:
                Object[] objArr486 = this.onCustomAction;
                int i1446 = this.AudioAttributesImplApi21Parcelizer;
                objArr486[i1446] = objArr486[8];
                long[] jArr57 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i1446 + 2;
                jArr57[i1446 + 1] = jArr57[9];
                return 0;
            case 1051:
                long[] jArr58 = this.MediaBrowserCompatSearchResultReceiver;
                int i1447 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1447 + 1;
                jArr58[i1447] = jArr58[13];
                return 0;
            case 1052:
                int[] iArr763 = this.MediaMetadataCompat;
                int i1448 = this.AudioAttributesImplApi21Parcelizer;
                iArr763[i1448] = 7;
                iArr763[i1448 - 1] = iArr763[i1448 - 1] + iArr763[i1448];
                this.AudioAttributesImplApi21Parcelizer = i1448 + 1;
                iArr763[i1448] = iArr763[i1448 - 1];
                return 0;
            case 1053:
                int i1449 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1449;
                float[] fArr12 = this.RatingCompat;
                fArr12[11] = fArr12[i1449];
                return 0;
            case 1054:
                float[] fArr13 = this.RatingCompat;
                int i1450 = this.AudioAttributesImplApi21Parcelizer;
                fArr13[i1450] = 0.0f;
                this.AudioAttributesImplApi21Parcelizer = i1450;
                fArr13[11] = fArr13[i1450];
                return 0;
            case 1055:
                int i1451 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1451;
                long[] jArr59 = this.MediaBrowserCompatSearchResultReceiver;
                jArr59[15] = jArr59[i1451];
                return 0;
            case 1056:
                long[] jArr60 = this.MediaBrowserCompatSearchResultReceiver;
                int i1452 = this.AudioAttributesImplApi21Parcelizer;
                jArr60[i1452] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1452;
                jArr60[15] = jArr60[i1452];
                return 0;
            case 1057:
                long[] jArr61 = this.MediaBrowserCompatSearchResultReceiver;
                int i1453 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1453 + 1;
                jArr61[i1453] = jArr61[15];
                return 0;
            case 1058:
                int i1454 = this.AudioAttributesImplApi21Parcelizer;
                int i1455 = i1454 - 1;
                Object[] objArr487 = this.onCustomAction;
                Object obj394 = objArr487[i1455];
                objArr487[i1455] = null;
                objArr487[21] = obj394;
                this.AudioAttributesImplApi21Parcelizer = i1454;
                objArr487[i1455] = objArr487[14];
                return 0;
            case 1059:
                float[] fArr14 = this.RatingCompat;
                int i1456 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1456 + 1;
                fArr14[i1456] = fArr14[11];
                this.MediaMetadataCompat[i1456] = (int) fArr14[i1456];
                return 0;
            case 1060:
                int i1457 = this.AudioAttributesImplApi21Parcelizer;
                int i1458 = i1457 - 1;
                Object[] objArr488 = this.onCustomAction;
                Object obj395 = objArr488[i1458];
                objArr488[i1458] = null;
                objArr488[18] = obj395;
                this.AudioAttributesImplApi21Parcelizer = i1457;
                objArr488[i1458] = objArr488[14];
                return 0;
            case 1061:
                int i1459 = this.AudioAttributesImplApi21Parcelizer;
                int i1460 = i1459 - 1;
                Object[] objArr489 = this.onCustomAction;
                Object obj396 = objArr489[i1460];
                objArr489[i1460] = null;
                objArr489[19] = obj396;
                objArr489[i1460] = objArr489[i1459 - 2];
                int i1461 = i1459 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1461;
                Object obj397 = objArr489[i1461];
                objArr489[i1461] = null;
                objArr489[14] = obj397;
                return 0;
            case 1062:
                Object[] objArr490 = this.onCustomAction;
                int i1462 = this.AudioAttributesImplApi21Parcelizer;
                objArr490[i1462] = objArr490[14];
                Object obj398 = objArr490[i1462];
                objArr490[i1462] = null;
                objArr490[17] = obj398;
                this.AudioAttributesImplApi21Parcelizer = i1462 + 1;
                objArr490[i1462] = objArr490[19];
                return 0;
            case 1063:
                int i1463 = this.AudioAttributesImplApi21Parcelizer;
                int i1464 = i1463 - 1;
                Object[] objArr491 = this.onCustomAction;
                Object obj399 = objArr491[i1464];
                objArr491[i1464] = null;
                objArr491[20] = obj399;
                this.AudioAttributesImplApi21Parcelizer = i1463;
                objArr491[i1464] = objArr491[8];
                return 0;
            case 1064:
                int i1465 = this.AudioAttributesImplApi21Parcelizer;
                int i1466 = i1465 - 1;
                Object[] objArr492 = this.onCustomAction;
                Object obj400 = objArr492[i1466];
                objArr492[i1466] = null;
                objArr492[19] = obj400;
                this.AudioAttributesImplApi21Parcelizer = i1465;
                objArr492[i1466] = objArr492[8];
                return 0;
            case 1065:
                int i1467 = this.AudioAttributesImplApi21Parcelizer;
                int i1468 = i1467 - 1;
                Object[] objArr493 = this.onCustomAction;
                Object obj401 = objArr493[i1468];
                objArr493[i1468] = null;
                objArr493[22] = obj401;
                this.AudioAttributesImplApi21Parcelizer = i1467;
                objArr493[i1468] = objArr493[8];
                return 0;
            case 1066:
                int i1469 = this.AudioAttributesImplApi21Parcelizer;
                int i1470 = i1469 - 1;
                long[] jArr62 = this.MediaBrowserCompatSearchResultReceiver;
                jArr62[15] = jArr62[i1470];
                int[] iArr764 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1469;
                iArr764[i1470] = 4;
                return 0;
            case 1067:
                Object[] objArr494 = this.onCustomAction;
                int i1471 = this.AudioAttributesImplApi21Parcelizer;
                objArr494[i1471] = objArr494[i1471 - 1];
                Object obj402 = objArr494[i1471];
                objArr494[i1471] = null;
                objArr494[23] = obj402;
                int[] iArr765 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1471 + 1;
                iArr765[i1471] = 0;
                return 0;
            case 1068:
                Object[] objArr495 = this.onCustomAction;
                int i1472 = this.AudioAttributesImplApi21Parcelizer;
                objArr495[i1472] = objArr495[19];
                int i1473 = i1472 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1473;
                Object obj403 = objArr495[i1473];
                objArr495[i1473] = null;
                int i1474 = this.MediaMetadataCompat[i1472 - 1];
                Object obj404 = objArr495[i1472];
                objArr495[i1472] = null;
                ((Object[]) obj403)[i1474] = obj404;
                this.AudioAttributesImplApi21Parcelizer = i1472 - 1;
                objArr495[i1473] = objArr495[23];
                return 0;
            case 1069:
                int[] iArr766 = this.MediaMetadataCompat;
                int i1475 = this.AudioAttributesImplApi21Parcelizer;
                iArr766[i1475] = 1;
                Object[] objArr496 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1475 + 2;
                objArr496[i1475 + 1] = objArr496[12];
                return 0;
            case 1070:
                Object[] objArr497 = this.onCustomAction;
                int i1476 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1476 + 1;
                objArr497[i1476] = objArr497[23];
                return 0;
            case 1071:
                int[] iArr767 = this.MediaMetadataCompat;
                int i1477 = this.AudioAttributesImplApi21Parcelizer;
                iArr767[i1477] = 2;
                Object[] objArr498 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1477 + 2;
                objArr498[i1477 + 1] = objArr498[22];
                return 0;
            case 1072:
                int i1478 = this.AudioAttributesImplApi21Parcelizer;
                int i1479 = i1478 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1479;
                Object[] objArr499 = this.onCustomAction;
                Object obj405 = objArr499[i1479];
                objArr499[i1479] = null;
                int[] iArr768 = this.MediaMetadataCompat;
                int i1480 = iArr768[i1478 - 2];
                Object obj406 = objArr499[i1478 - 1];
                objArr499[i1478 - 1] = null;
                ((Object[]) obj405)[i1480] = obj406;
                objArr499[i1479] = objArr499[23];
                this.AudioAttributesImplApi21Parcelizer = i1478 - 1;
                iArr768[i1478 - 2] = 3;
                return 0;
            case 1073:
                int i1481 = this.AudioAttributesImplApi21Parcelizer;
                int i1482 = i1481 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1482;
                float[] fArr15 = this.RatingCompat;
                fArr15[i1481 - 2] = fArr15[i1481 - 2] * fArr15[i1482];
                return 0;
            case 1074:
                int[] iArr769 = this.MediaMetadataCompat;
                int i1483 = this.AudioAttributesImplApi21Parcelizer;
                iArr769[i1483 - 1] = (int) this.RatingCompat[i1483 - 1];
                int i1484 = i1483 - 1;
                iArr769[11] = iArr769[i1484];
                Object[] objArr500 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1483;
                objArr500[i1484] = objArr500[8];
                return 0;
            case 1075:
                int i1485 = this.AudioAttributesImplApi21Parcelizer;
                int i1486 = i1485 - 1;
                int[] iArr770 = this.MediaMetadataCompat;
                iArr770[12] = iArr770[i1486];
                this.AudioAttributesImplApi21Parcelizer = i1485;
                iArr770[i1486] = 2;
                return 0;
            case 1076:
                int i1487 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1487;
                Object[] objArr501 = this.onCustomAction;
                Object obj407 = objArr501[i1487];
                objArr501[i1487] = null;
                objArr501[19] = obj407;
                return 0;
            case 1077:
                int i1488 = this.AudioAttributesImplApi21Parcelizer;
                int i1489 = i1488 - 3;
                this.AudioAttributesImplApi21Parcelizer = i1489;
                Object[] objArr502 = this.onCustomAction;
                Object obj408 = objArr502[i1489];
                objArr502[i1489] = null;
                int i1490 = this.MediaMetadataCompat[i1488 - 2];
                Object obj409 = objArr502[i1488 - 1];
                objArr502[i1488 - 1] = null;
                ((Object[]) obj408)[i1490] = obj409;
                this.AudioAttributesImplApi21Parcelizer = i1488 - 2;
                objArr502[i1489] = objArr502[19];
                return 0;
            case 1078:
                int[] iArr771 = this.MediaMetadataCompat;
                int i1491 = this.AudioAttributesImplApi21Parcelizer;
                iArr771[i1491] = 1;
                this.AudioAttributesImplApi21Parcelizer = i1491 + 2;
                iArr771[i1491 + 1] = iArr771[11];
                return 0;
            case 1079:
                Object[] objArr503 = this.onCustomAction;
                int i1492 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1492 + 1;
                objArr503[i1492] = objArr503[19];
                return 0;
            case 1080:
                int i1493 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1493;
                Object[] objArr504 = this.onCustomAction;
                Object obj410 = objArr504[i1493];
                objArr504[i1493] = null;
                objArr504[22] = obj410;
                return 0;
            case 1081:
                Object[] objArr505 = this.onCustomAction;
                int i1494 = this.AudioAttributesImplApi21Parcelizer;
                objArr505[i1494] = objArr505[12];
                this.AudioAttributesImplApi21Parcelizer = i1494 + 2;
                objArr505[i1494 + 1] = objArr505[8];
                return 0;
            case 1082:
                int[] iArr772 = this.MediaMetadataCompat;
                int i1495 = this.AudioAttributesImplApi21Parcelizer;
                iArr772[i1495] = -1;
                this.AudioAttributesImplApi21Parcelizer = i1495;
                iArr772[11] = iArr772[i1495];
                return 0;
            case 1083:
                Object[] objArr506 = this.onCustomAction;
                int i1496 = this.AudioAttributesImplApi21Parcelizer;
                objArr506[i1496] = objArr506[i1496 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1496;
                Object obj411 = objArr506[i1496];
                objArr506[i1496] = null;
                objArr506[23] = obj411;
                return 0;
            case 1084:
                Object[] objArr507 = this.onCustomAction;
                int i1497 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1497 + 1;
                objArr507[i1497] = objArr507[21];
                return 0;
            case 1085:
                int i1498 = this.AudioAttributesImplApi21Parcelizer;
                int i1499 = i1498 - 1;
                Object[] objArr508 = this.onCustomAction;
                objArr508[i1499] = null;
                this.AudioAttributesImplApi21Parcelizer = i1498;
                objArr508[i1499] = objArr508[23];
                return 0;
            case 1086:
                int[] iArr773 = this.MediaMetadataCompat;
                int i1500 = this.AudioAttributesImplApi21Parcelizer;
                iArr773[i1500] = iArr773[i1500 - 1];
                this.AudioAttributesImplApi21Parcelizer = i1500;
                iArr773[13] = iArr773[i1500];
                return 0;
            case 1087:
                int i1501 = this.AudioAttributesImplApi21Parcelizer;
                int i1502 = i1501 - 1;
                this.onCustomAction[i1502] = null;
                int[] iArr774 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1501;
                iArr774[i1502] = iArr774[13];
                return 0;
            case 1088:
                Object[] objArr509 = this.onCustomAction;
                int i1503 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1503 + 1;
                objArr509[i1503] = objArr509[20];
                return 0;
            case 1089:
                Object[] objArr510 = this.onCustomAction;
                int i1504 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1504 + 1;
                objArr510[i1504] = objArr510[22];
                return 0;
            case 1090:
                int[] iArr775 = this.MediaMetadataCompat;
                int i1505 = this.AudioAttributesImplApi21Parcelizer;
                iArr775[i1505] = 3;
                this.AudioAttributesImplApi21Parcelizer = i1505 + 2;
                iArr775[i1505 + 1] = 5;
                return 0;
            case 1091:
                int[] iArr776 = this.MediaMetadataCompat;
                int i1506 = this.AudioAttributesImplApi21Parcelizer;
                iArr776[i1506] = 53;
                iArr776[i1506 - 1] = iArr776[i1506 - 1] + iArr776[i1506];
                this.AudioAttributesImplApi21Parcelizer = i1506 + 1;
                iArr776[i1506] = iArr776[i1506 - 1];
                return 0;
            case 1092:
                int i1507 = this.AudioAttributesImplApi21Parcelizer;
                int i1508 = i1507 - 1;
                Object[] objArr511 = this.onCustomAction;
                Object obj412 = objArr511[i1508];
                objArr511[i1508] = null;
                objArr511[17] = obj412;
                this.AudioAttributesImplApi21Parcelizer = i1507;
                objArr511[i1508] = objArr511[14];
                return 0;
            case 1093:
                int[] iArr777 = this.MediaMetadataCompat;
                int i1509 = this.AudioAttributesImplApi21Parcelizer;
                iArr777[i1509] = 75;
                this.AudioAttributesImplApi21Parcelizer = i1509;
                iArr777[i1509 - 1] = iArr777[i1509 - 1] + iArr777[i1509];
                return 0;
            case 1094:
                int i1510 = this.AudioAttributesImplApi21Parcelizer;
                int i1511 = i1510 - 1;
                Object[] objArr512 = this.onCustomAction;
                Object obj413 = objArr512[i1511];
                objArr512[i1511] = null;
                objArr512[10] = obj413;
                int[] iArr778 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1510;
                iArr778[i1511] = 1;
                return 0;
            case 1095:
                int i1512 = this.AudioAttributesImplApi21Parcelizer;
                int i1513 = i1512 - 1;
                int[] iArr779 = this.MediaMetadataCompat;
                iArr779[10] = iArr779[i1513];
                this.AudioAttributesImplApi21Parcelizer = i1512;
                iArr779[i1513] = iArr779[9];
                return 0;
            case 1096:
                int[] iArr780 = this.MediaMetadataCompat;
                int i1514 = this.AudioAttributesImplApi21Parcelizer;
                iArr780[i1514] = 47;
                iArr780[i1514 - 1] = iArr780[i1514 - 1] + iArr780[i1514];
                this.AudioAttributesImplApi21Parcelizer = i1514 + 1;
                iArr780[i1514] = iArr780[i1514 - 1];
                return 0;
            case 1097:
                int i1515 = this.AudioAttributesImplApi21Parcelizer;
                int i1516 = i1515 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1516;
                int[] iArr781 = this.MediaMetadataCompat;
                this.RemoteActionCompatParcelizer = iArr781[i1516] <= iArr781[i1515 - 1] ? 0 : 1;
                return 0;
            case 1098:
                int i1517 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i1517;
                long[] jArr63 = this.MediaBrowserCompatSearchResultReceiver;
                jArr63[12] = jArr63[i1517];
                return 0;
            case 1099:
                long[] jArr64 = this.MediaBrowserCompatSearchResultReceiver;
                int i1518 = this.AudioAttributesImplApi21Parcelizer;
                jArr64[i1518] = 0;
                this.AudioAttributesImplApi21Parcelizer = i1518;
                jArr64[12] = jArr64[i1518];
                return 0;
            case 1100:
                int i1519 = this.AudioAttributesImplApi21Parcelizer;
                int i1520 = i1519 - 1;
                this.onCustomAction[i1520] = null;
                int[] iArr782 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1519;
                iArr782[i1520] = iArr782[11];
                return 0;
            case 1101:
                int[] iArr783 = this.MediaMetadataCompat;
                int i1521 = this.AudioAttributesImplApi21Parcelizer;
                iArr783[i1521] = iArr783[10];
                long[] jArr65 = this.MediaBrowserCompatSearchResultReceiver;
                jArr65[i1521 + 1] = jArr65[12];
                Object[] objArr513 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1521 + 3;
                objArr513[i1521 + 2] = objArr513[9];
                return 0;
            case 1102:
                Object[] objArr514 = this.onCustomAction;
                int i1522 = this.AudioAttributesImplApi21Parcelizer;
                objArr514[i1522] = objArr514[14];
                objArr514[i1522 + 1] = objArr514[9];
                this.AudioAttributesImplApi21Parcelizer = i1522 + 3;
                objArr514[i1522 + 2] = objArr514[10];
                return 0;
            case 1103:
                int[] iArr784 = this.MediaMetadataCompat;
                int i1523 = this.AudioAttributesImplApi21Parcelizer;
                iArr784[i1523] = 5;
                iArr784[i1523 + 1] = 2;
                int i1524 = i1523 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1524;
                iArr784[i1523] = iArr784[i1523] >> iArr784[i1524];
                return 0;
            case 1104:
                int[] iArr785 = this.MediaMetadataCompat;
                int i1525 = this.AudioAttributesImplApi21Parcelizer;
                iArr785[i1525] = 69;
                iArr785[i1525 + 1] = 0;
                int i1526 = i1525 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1526;
                iArr785[i1525] = iArr785[i1525] / iArr785[i1526];
                return 0;
            case 1105:
                int[] iArr786 = this.MediaMetadataCompat;
                int i1527 = this.AudioAttributesImplApi21Parcelizer;
                iArr786[i1527] = 2;
                this.AudioAttributesImplApi21Parcelizer = i1527 + 2;
                iArr786[i1527 + 1] = 4;
                return 0;
            case 1106:
                int[] iArr787 = this.MediaMetadataCompat;
                int i1528 = this.AudioAttributesImplApi21Parcelizer;
                iArr787[i1528] = 121;
                iArr787[i1528 - 1] = iArr787[i1528 - 1] + iArr787[i1528];
                this.AudioAttributesImplApi21Parcelizer = i1528 + 1;
                iArr787[i1528] = iArr787[i1528 - 1];
                return 0;
            case 1107:
                Object[] objArr515 = this.onCustomAction;
                int i1529 = this.AudioAttributesImplApi21Parcelizer;
                objArr515[i1529] = objArr515[9];
                Object obj414 = objArr515[i1529];
                objArr515[i1529] = null;
                objArr515[10] = obj414;
                this.AudioAttributesImplApi21Parcelizer = i1529 + 1;
                objArr515[i1529] = objArr515[9];
                return 0;
            case 1108:
                Object[] objArr516 = this.onCustomAction;
                int i1530 = this.AudioAttributesImplApi21Parcelizer;
                objArr516[i1530] = objArr516[8];
                this.AudioAttributesImplApi21Parcelizer = i1530 + 2;
                objArr516[i1530 + 1] = null;
                return 0;
            case 1109:
                int[] iArr788 = this.MediaMetadataCompat;
                int i1531 = this.AudioAttributesImplApi21Parcelizer;
                iArr788[i1531] = 25;
                this.AudioAttributesImplApi21Parcelizer = i1531;
                iArr788[i1531 - 1] = iArr788[i1531 - 1] + iArr788[i1531];
                return 0;
            case 1110:
                int[] iArr789 = this.MediaMetadataCompat;
                int i1532 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1532 + 1;
                iArr789[i1532] = 50;
                return 0;
            case 1111:
                Object[] objArr517 = this.onCustomAction;
                int i1533 = this.AudioAttributesImplApi21Parcelizer;
                objArr517[i1533] = objArr517[8];
                int[] iArr790 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i1533 + 2;
                iArr790[i1533 + 1] = iArr790[10];
                return 0;
            case 1112:
                int[] iArr791 = this.MediaMetadataCompat;
                int i1534 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1534 + 1;
                iArr791[i1534] = 22;
                return 0;
            case 1113:
                int i1535 = this.AudioAttributesImplApi21Parcelizer;
                int i1536 = i1535 - 1;
                long[] jArr66 = this.MediaBrowserCompatSearchResultReceiver;
                jArr66[12] = jArr66[i1536];
                Object[] objArr518 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1535;
                objArr518[i1536] = objArr518[8];
                return 0;
            case 1114:
                long[] jArr67 = this.MediaBrowserCompatSearchResultReceiver;
                int i1537 = this.AudioAttributesImplApi21Parcelizer;
                jArr67[i1537] = jArr67[12];
                Object[] objArr519 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1537 + 2;
                objArr519[i1537 + 1] = objArr519[8];
                return 0;
            case 1115:
                long[] jArr68 = this.MediaBrowserCompatSearchResultReceiver;
                int i1538 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1538 + 1;
                jArr68[i1538] = jArr68[12];
                return 0;
            case 1116:
                long[] jArr69 = this.MediaBrowserCompatSearchResultReceiver;
                int i1539 = this.AudioAttributesImplApi21Parcelizer;
                jArr69[i1539] = jArr69[10];
                Object[] objArr520 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1539 + 2;
                objArr520[i1539 + 1] = objArr520[8];
                return 0;
            case 1117:
                int[] iArr792 = this.MediaMetadataCompat;
                int i1540 = this.AudioAttributesImplApi21Parcelizer;
                iArr792[i1540] = 12;
                this.AudioAttributesImplApi21Parcelizer = i1540 + 2;
                iArr792[i1540 + 1] = 0;
                return 0;
            case 1118:
                int i1541 = this.AudioAttributesImplApi21Parcelizer;
                int i1542 = i1541 - 1;
                Object[] objArr521 = this.onCustomAction;
                Object obj415 = objArr521[i1542];
                objArr521[i1542] = null;
                objArr521[9] = obj415;
                this.AudioAttributesImplApi21Parcelizer = i1541;
                objArr521[i1542] = objArr521[10];
                return 0;
            case 1119:
                int[] iArr793 = this.MediaMetadataCompat;
                int i1543 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1543 + 1;
                iArr793[i1543] = 1700;
                return 0;
            case 1120:
                int[] iArr794 = this.MediaMetadataCompat;
                int i1544 = this.AudioAttributesImplApi21Parcelizer;
                iArr794[i1544] = 61;
                iArr794[i1544 - 1] = iArr794[i1544 - 1] + iArr794[i1544];
                this.AudioAttributesImplApi21Parcelizer = i1544 + 1;
                iArr794[i1544] = iArr794[i1544 - 1];
                return 0;
            case 1121:
                int[] iArr795 = this.MediaMetadataCompat;
                int i1545 = this.AudioAttributesImplApi21Parcelizer;
                iArr795[i1545] = 67;
                this.AudioAttributesImplApi21Parcelizer = i1545;
                iArr795[i1545 - 1] = iArr795[i1545 - 1] + iArr795[i1545];
                return 0;
            case 1122:
                Object[] objArr522 = this.onCustomAction;
                int i1546 = this.AudioAttributesImplApi21Parcelizer;
                objArr522[i1546] = objArr522[9];
                Object obj416 = objArr522[i1546];
                objArr522[i1546] = null;
                objArr522[11] = obj416;
                this.AudioAttributesImplApi21Parcelizer = i1546 + 1;
                objArr522[i1546] = objArr522[9];
                return 0;
            case 1123:
                Object[] objArr523 = this.onCustomAction;
                int i1547 = this.AudioAttributesImplApi21Parcelizer;
                objArr523[i1547] = objArr523[9];
                int[] iArr796 = this.MediaMetadataCompat;
                iArr796[i1547 + 1] = 0;
                int i1548 = i1547 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1548;
                Object obj417 = objArr523[i1547];
                objArr523[i1547] = null;
                objArr523[i1547] = ((Object[]) obj417)[iArr796[i1548]];
                return 0;
            case 1124:
                int[] iArr797 = this.MediaMetadataCompat;
                int i1549 = this.AudioAttributesImplApi21Parcelizer;
                iArr797[i1549] = 2;
                iArr797[i1549 + 1] = 0;
                int i1550 = i1549 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1550;
                iArr797[i1549] = iArr797[i1549] / iArr797[i1550];
                return 0;
            case 1125:
                int[] iArr798 = this.MediaMetadataCompat;
                int i1551 = this.AudioAttributesImplApi21Parcelizer;
                iArr798[i1551] = 107;
                this.AudioAttributesImplApi21Parcelizer = i1551;
                iArr798[i1551 - 1] = iArr798[i1551 - 1] + iArr798[i1551];
                return 0;
            case 1126:
                int[] iArr799 = this.MediaMetadataCompat;
                int i1552 = this.AudioAttributesImplApi21Parcelizer;
                iArr799[i1552] = 105;
                iArr799[i1552 - 1] = iArr799[i1552 - 1] + iArr799[i1552];
                this.AudioAttributesImplApi21Parcelizer = i1552 + 1;
                iArr799[i1552] = iArr799[i1552 - 1];
                return 0;
            case 1127:
                int i1553 = this.AudioAttributesImplApi21Parcelizer;
                int i1554 = i1553 - 1;
                long[] jArr70 = this.MediaBrowserCompatSearchResultReceiver;
                jArr70[11] = jArr70[i1554];
                Object[] objArr524 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1553;
                objArr524[i1554] = objArr524[8];
                return 0;
            case 1128:
                long[] jArr71 = this.MediaBrowserCompatSearchResultReceiver;
                int i1555 = this.AudioAttributesImplApi21Parcelizer;
                jArr71[i1555] = jArr71[9];
                Object[] objArr525 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1555 + 2;
                objArr525[i1555 + 1] = objArr525[8];
                return 0;
            case 1129:
                int i1556 = this.AudioAttributesImplApi21Parcelizer;
                int i1557 = i1556 - 1;
                this.AudioAttributesImplApi21Parcelizer = i1557;
                long[] jArr72 = this.MediaBrowserCompatSearchResultReceiver;
                jArr72[i1556 - 2] = jArr72[i1556 - 2] % jArr72[i1557];
                int i1558 = i1556 - 2;
                jArr72[9] = jArr72[i1558];
                Object[] objArr526 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1556 - 1;
                objArr526[i1558] = objArr526[8];
                return 0;
            case 1130:
                int[] iArr800 = this.MediaMetadataCompat;
                int i1559 = this.AudioAttributesImplApi21Parcelizer;
                iArr800[i1559] = 39;
                iArr800[i1559 - 1] = iArr800[i1559 - 1] + iArr800[i1559];
                this.AudioAttributesImplApi21Parcelizer = i1559 + 1;
                iArr800[i1559] = iArr800[i1559 - 1];
                return 0;
            case 1131:
                int i1560 = this.AudioAttributesImplApi21Parcelizer;
                int i1561 = i1560 - 1;
                float[] fArr16 = this.RatingCompat;
                fArr16[10] = fArr16[i1561];
                Object[] objArr527 = this.onCustomAction;
                this.AudioAttributesImplApi21Parcelizer = i1560;
                objArr527[i1561] = objArr527[8];
                return 0;
            case 1132:
                float[] fArr17 = this.RatingCompat;
                int i1562 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1562 + 1;
                fArr17[i1562] = fArr17[10];
                return 0;
            case 1133:
                float[] fArr18 = this.RatingCompat;
                int i1563 = this.AudioAttributesImplApi21Parcelizer;
                fArr18[i1563] = 1.0f;
                this.AudioAttributesImplApi21Parcelizer = i1563;
                this.MediaMetadataCompat[i1563 - 1] = (fArr18[i1563 - 1] > fArr18[i1563] ? 1 : (fArr18[i1563 - 1] == fArr18[i1563] ? 0 : -1));
                return 0;
            case 1134:
                float[] fArr19 = this.RatingCompat;
                int i1564 = this.AudioAttributesImplApi21Parcelizer;
                fArr19[i1564] = fArr19[10];
                fArr19[i1564 + 1] = 2.0f;
                int i1565 = i1564 + 1;
                this.AudioAttributesImplApi21Parcelizer = i1565;
                this.MediaMetadataCompat[i1564] = (fArr19[i1564] > fArr19[i1565] ? 1 : (fArr19[i1564] == fArr19[i1565] ? 0 : -1));
                return 0;
            case 1135:
                float[] fArr20 = this.RatingCompat;
                int i1566 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1566 + 1;
                fArr20[i1566] = 2.0f;
                return 0;
            case 1136:
                int i1567 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr801 = this.MediaMetadataCompat;
                iArr801[i1567 - 2] = iArr801[i1567 - 1] ^ iArr801[i1567 - 2];
                int i1568 = i1567 - 2;
                this.AudioAttributesImplApi21Parcelizer = i1568;
                iArr801[9] = iArr801[i1568];
                return 0;
            case 1137:
                int[] iArr802 = this.MediaMetadataCompat;
                int i1569 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1569 + 1;
                iArr802[i1569] = 36;
                return 0;
            case 1138:
                long[] jArr73 = this.MediaBrowserCompatSearchResultReceiver;
                int i1570 = this.AudioAttributesImplApi21Parcelizer;
                jArr73[i1570] = jArr73[9];
                this.AudioAttributesImplApi21Parcelizer = i1570;
                jArr73[i1570 - 1] = jArr73[i1570 - 1] * jArr73[i1570];
                return 0;
            case 1139:
                int[] iArr803 = this.MediaMetadataCompat;
                int i1571 = this.AudioAttributesImplApi21Parcelizer;
                iArr803[i1571] = iArr803[10];
                this.AudioAttributesImplApi21Parcelizer = i1571 + 2;
                iArr803[i1571 + 1] = 100;
                return 0;
            case 1140:
                int[] iArr804 = this.MediaMetadataCompat;
                int i1572 = this.AudioAttributesImplApi21Parcelizer;
                iArr804[i1572] = 33;
                this.AudioAttributesImplApi21Parcelizer = i1572;
                iArr804[i1572 - 1] = iArr804[i1572 - 1] + iArr804[i1572];
                return 0;
            case 1141:
                int[] iArr805 = this.MediaMetadataCompat;
                int i1573 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1573 + 1;
                iArr805[i1573] = 122;
                return 0;
            case 1142:
                int[] iArr806 = this.MediaMetadataCompat;
                int i1574 = this.AudioAttributesImplApi21Parcelizer;
                iArr806[i1574] = 92;
                this.AudioAttributesImplApi21Parcelizer = i1574 + 2;
                iArr806[i1574 + 1] = 0;
                return 0;
            case 1143:
                int[] iArr807 = this.MediaMetadataCompat;
                int i1575 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i1575 + 1;
                iArr807[i1575] = 121;
                return 0;
            case 1144:
                int[] iArr808 = this.MediaMetadataCompat;
                int i1576 = this.AudioAttributesImplApi21Parcelizer;
                iArr808[i1576] = 2;
                this.AudioAttributesImplApi21Parcelizer = i1576 + 2;
                iArr808[i1576 + 1] = 5;
                return 0;
            case 1145:
                int[] iArr809 = this.MediaMetadataCompat;
                int i1577 = this.AudioAttributesImplApi21Parcelizer;
                iArr809[i1577] = 95;
                this.AudioAttributesImplApi21Parcelizer = i1577;
                iArr809[i1577 - 1] = iArr809[i1577 - 1] + iArr809[i1577];
                return 0;
            case 1146:
                Object[] objArr528 = this.onCustomAction;
                int i1578 = this.AudioAttributesImplApi21Parcelizer;
                objArr528[i1578] = objArr528[12];
                this.AudioAttributesImplApi21Parcelizer = i1578 + 2;
                objArr528[i1578 + 1] = objArr528[13];
                return 0;
            case 1147:
                int[] iArr810 = this.MediaMetadataCompat;
                int i1579 = this.AudioAttributesImplApi21Parcelizer;
                iArr810[i1579] = 115;
                iArr810[i1579 - 1] = iArr810[i1579 - 1] + iArr810[i1579];
                this.AudioAttributesImplApi21Parcelizer = i1579 + 1;
                iArr810[i1579] = iArr810[i1579 - 1];
                return 0;
            case 1148:
                int i1580 = this.AudioAttributesImplApi21Parcelizer;
                int i1581 = i1580 - 1;
                Object[] objArr529 = this.onCustomAction;
                Object obj418 = objArr529[i1581];
                objArr529[i1581] = null;
                objArr529[10] = obj418;
                objArr529[i1581] = objArr529[8];
                this.AudioAttributesImplApi21Parcelizer = i1580 + 1;
                objArr529[i1580] = objArr529[10];
                return 0;
            default:
                return i;
        }
    }

    public FetchTokenRequest(Object obj, Object obj2) {
        this.MediaMetadataCompat = new int[84];
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, Object obj3) {
        this.MediaMetadataCompat = new int[84];
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, int i, Object obj2) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        iArr[9] = i;
        objArr[10] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, int i) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        iArr[9] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, int i, int i2) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        iArr[9] = i;
        iArr[10] = i2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, int i) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        iArr[10] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, int i, Object obj2, int i2) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        iArr[9] = i;
        objArr[10] = obj2;
        iArr[11] = i2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaMetadataCompat = new int[84];
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        objArr[11] = obj4;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, int i, Object obj3) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        iArr[10] = i;
        objArr[11] = obj3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        iArr[11] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, long j, long j2) {
        this.MediaMetadataCompat = new int[84];
        long[] jArr = new long[84];
        this.MediaBrowserCompatSearchResultReceiver = jArr;
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        jArr[9] = j;
        jArr[11] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, Object obj2, int i, int i2) {
        int[] iArr = new int[84];
        this.MediaMetadataCompat = iArr;
        this.MediaBrowserCompatSearchResultReceiver = new long[84];
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        iArr[10] = i;
        iArr[11] = i2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, long j, Object obj2) {
        this.MediaMetadataCompat = new int[84];
        long[] jArr = new long[84];
        this.MediaBrowserCompatSearchResultReceiver = jArr;
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        jArr[9] = j;
        objArr[11] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public FetchTokenRequest(Object obj, long j) {
        this.MediaMetadataCompat = new int[84];
        long[] jArr = new long[84];
        this.MediaBrowserCompatSearchResultReceiver = jArr;
        this.RatingCompat = new float[84];
        this.MediaDescriptionCompat = new double[84];
        Object[] objArr = new Object[84];
        this.onCustomAction = objArr;
        objArr[8] = obj;
        jArr[9] = j;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
