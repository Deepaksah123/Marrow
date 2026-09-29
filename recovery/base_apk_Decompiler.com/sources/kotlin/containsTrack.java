package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.data.models.ResponseError;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes3.dex */
public class containsTrack {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    public Object MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    private final int[] MediaBrowserCompatSearchResultReceiver;
    private final long[] MediaDescriptionCompat;
    private final double[] MediaMetadataCompat;
    private final float[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public float read;
    public long write;

    public containsTrack(Object obj, Object obj2) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                objArr[i2] = objArr[11];
                return 0;
            case 2:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                objArr2[i3] = objArr2[12];
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplApi21Parcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4;
                this.AudioAttributesImplBaseParcelizer = i4;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i5 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i5 + 1;
                Object obj = objArr3[i5];
                objArr3[i5] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj;
                return 0;
            case 5:
                int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
                int i6 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6 + 1;
                iArr[i6] = 2;
                return 0;
            case 6:
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplApi21Parcelizer = i8;
                int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.AudioAttributesImplApi21Parcelizer = i9;
                this.MediaBrowserCompatMediaItem[i9] = null;
                return 0;
            case 8:
                int[] iArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                iArr3[i10] = this.AudioAttributesCompatParcelizer;
            case 7:
                return 0;
            case 9:
                int[] iArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                iArr4[i11] = 71;
                return 0;
            case 10:
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                int i13 = i12 - 1;
                int[] iArr5 = this.MediaBrowserCompatSearchResultReceiver;
                iArr5[i12 - 2] = iArr5[i12 - 2] + iArr5[i13];
                this.AudioAttributesImplApi21Parcelizer = i12;
                iArr5[i13] = iArr5[i12 - 2];
                return 0;
            case 11:
                int[] iArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i14 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i14 + 1;
                iArr6[i14] = 128;
                return 0;
            case 12:
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                int i16 = i15 - 1;
                this.AudioAttributesImplApi21Parcelizer = i16;
                int[] iArr7 = this.MediaBrowserCompatSearchResultReceiver;
                iArr7[i15 - 2] = iArr7[i15 - 2] % iArr7[i16];
                return 0;
            case 13:
                int[] iArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                this.RemoteActionCompatParcelizer = iArr8[i17];
                return 0;
            case 14:
                int[] iArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                iArr9[i18] = 2;
                this.AudioAttributesImplApi21Parcelizer = i18;
                iArr9[i18 - 1] = iArr9[i18 - 1] % iArr9[i18];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i19;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[i19] == 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i20 + 1;
                iArr10[i20] = 1;
                return 0;
            case 17:
                int i21 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i21;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[i21] != 0 ? 0 : 1;
                return 0;
            case 18:
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                Object obj2 = objArr4[i22 - 1];
                objArr4[i22 - 1] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj2;
                return 0;
            case 19:
                int[] iArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                iArr11[i23] = 84;
                return 0;
            case 20:
                int[] iArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                iArr12[i24] = 0;
                return 0;
            case 21:
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                int i26 = i25 - 1;
                this.AudioAttributesImplApi21Parcelizer = i26;
                int[] iArr13 = this.MediaBrowserCompatSearchResultReceiver;
                iArr13[i25 - 2] = iArr13[i25 - 2] / iArr13[i26];
                return 0;
            case 22:
                int i27 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i27;
                this.MediaBrowserCompatMediaItem[i27] = null;
                return 0;
            case 23:
                int[] iArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i28 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i28;
                this.RemoteActionCompatParcelizer = iArr14[i28];
                return 0;
            case 24:
                int[] iArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i29 + 1;
                iArr15[i29] = 39;
                return 0;
            case 25:
                int[] iArr16 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i30 + 1;
                iArr16[i30] = 59;
                return 0;
            case 26:
                for (int i31 = this.AudioAttributesImplApi21Parcelizer - 1; i31 >= 0; i31--) {
                    this.MediaBrowserCompatMediaItem[i31] = null;
                }
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr5[0] = this.MediaBrowserCompatItemReceiver;
                return 0;
            case 27:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                objArr6[i32] = objArr6[11];
                this.AudioAttributesImplApi21Parcelizer = i32 + 2;
                objArr6[i32 + 1] = objArr6[12];
                return 0;
            case 28:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i33 + 1;
                objArr7[i33] = objArr7[13];
                return 0;
            case 29:
                int[] iArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i34 + 1;
                iArr17[i34] = 69;
                return 0;
            case 30:
                int[] iArr18 = this.MediaBrowserCompatSearchResultReceiver;
                int i35 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i35] = 17;
                iArr18[i35 - 1] = iArr18[i35 - 1] + iArr18[i35];
                this.AudioAttributesImplApi21Parcelizer = i35 + 1;
                iArr18[i35] = iArr18[i35 - 1];
                return 0;
            case 31:
                int[] iArr19 = this.MediaBrowserCompatSearchResultReceiver;
                int i36 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i36] = 2;
                iArr19[i36 + 1] = 2;
                int i37 = i36 + 1;
                this.AudioAttributesImplApi21Parcelizer = i37;
                iArr19[i36] = iArr19[i36] % iArr19[i37];
                return 0;
            case 32:
                int[] iArr20 = this.MediaBrowserCompatSearchResultReceiver;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i38] = 21;
                iArr20[i38 - 1] = iArr20[i38 - 1] + iArr20[i38];
                this.AudioAttributesImplApi21Parcelizer = i38 + 1;
                iArr20[i38] = iArr20[i38 - 1];
                return 0;
            case 33:
                int[] iArr21 = this.MediaBrowserCompatSearchResultReceiver;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                iArr21[i39] = 128;
                this.AudioAttributesImplApi21Parcelizer = i39;
                iArr21[i39 - 1] = iArr21[i39 - 1] % iArr21[i39];
                return 0;
            case 34:
                int[] iArr22 = this.MediaBrowserCompatSearchResultReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i40 + 1;
                iArr22[i40] = 19;
                return 0;
            case 35:
                int[] iArr23 = this.MediaBrowserCompatSearchResultReceiver;
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i41 + 1;
                iArr23[i41] = 12;
                return 0;
            case 36:
                int[] iArr24 = this.MediaBrowserCompatSearchResultReceiver;
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i42 + 1;
                iArr24[i42] = 4;
                return 0;
            case 37:
                int[] iArr25 = this.MediaBrowserCompatSearchResultReceiver;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i43 + 1;
                iArr25[i43] = 2;
                return 0;
            case 38:
                float[] fArr = this.RatingCompat;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i44 + 1;
                fArr[i44] = fArr[12];
                return 0;
            case 39:
                float[] fArr2 = this.RatingCompat;
                int i45 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i45 + 1;
                this.AudioAttributesImplApi26Parcelizer = fArr2[i45];
                return 0;
            case 40:
                int[] iArr26 = this.MediaBrowserCompatSearchResultReceiver;
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                iArr26[i46] = 121;
                this.AudioAttributesImplApi21Parcelizer = i46;
                iArr26[i46 - 1] = iArr26[i46 - 1] + iArr26[i46];
                return 0;
            case 41:
                int[] iArr27 = this.MediaBrowserCompatSearchResultReceiver;
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i47 + 1;
                iArr27[i47] = iArr27[i47 - 1];
                return 0;
            case 42:
                int[] iArr28 = this.MediaBrowserCompatSearchResultReceiver;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i48 + 1;
                iArr28[i48] = 111;
                return 0;
            case 43:
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = i49 - 1;
                this.AudioAttributesImplApi21Parcelizer = i50;
                int[] iArr29 = this.MediaBrowserCompatSearchResultReceiver;
                iArr29[i49 - 2] = iArr29[i49 - 2] + iArr29[i50];
                return 0;
            case 44:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                objArr8[i51] = this.MediaBrowserCompatItemReceiver;
                return 0;
            case 45:
                int[] iArr30 = this.MediaBrowserCompatSearchResultReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                iArr30[i52] = 25;
                this.AudioAttributesImplApi21Parcelizer = i52;
                iArr30[i52 - 1] = iArr30[i52 - 1] + iArr30[i52];
                return 0;
            case 46:
                int[] iArr31 = this.MediaBrowserCompatSearchResultReceiver;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i53 + 1;
                iArr31[i53] = 109;
                return 0;
            case 47:
                int[] iArr32 = this.MediaBrowserCompatSearchResultReceiver;
                int i54 = this.AudioAttributesImplApi21Parcelizer;
                iArr32[i54] = 2;
                this.AudioAttributesImplApi21Parcelizer = i54 + 2;
                iArr32[i54 + 1] = 2;
                return 0;
            case 48:
                int[] iArr33 = this.MediaBrowserCompatSearchResultReceiver;
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i55 + 1;
                iArr33[i55] = 45;
                return 0;
            case 49:
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                int i57 = i56 - 1;
                int[] iArr34 = this.MediaBrowserCompatSearchResultReceiver;
                iArr34[i56 - 2] = iArr34[i56 - 2] + iArr34[i57];
                iArr34[i57] = iArr34[i56 - 2];
                this.AudioAttributesImplApi21Parcelizer = i56 + 1;
                iArr34[i56] = 128;
                return 0;
            case 50:
                int[] iArr35 = this.MediaBrowserCompatSearchResultReceiver;
                int i58 = this.AudioAttributesImplApi21Parcelizer;
                iArr35[i58] = 43;
                this.AudioAttributesImplApi21Parcelizer = i58;
                iArr35[i58 - 1] = iArr35[i58 - 1] + iArr35[i58];
                return 0;
            case 51:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i59 + 1;
                objArr9[i59] = null;
                return 0;
            case 52:
                int[] iArr36 = this.MediaBrowserCompatSearchResultReceiver;
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i60 + 1;
                iArr36[i60] = 94;
                return 0;
            case 53:
                int[] iArr37 = this.MediaBrowserCompatSearchResultReceiver;
                int i61 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i61 + 1;
                iArr37[i61] = 35;
                return 0;
            case 54:
                int[] iArr38 = this.MediaBrowserCompatSearchResultReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                iArr38[i62] = 121;
                iArr38[i62 - 1] = iArr38[i62 - 1] + iArr38[i62];
                this.AudioAttributesImplApi21Parcelizer = i62 + 1;
                iArr38[i62] = iArr38[i62 - 1];
                return 0;
            case 55:
                int[] iArr39 = this.MediaBrowserCompatSearchResultReceiver;
                int i63 = this.AudioAttributesImplApi21Parcelizer;
                iArr39[i63] = 18;
                this.AudioAttributesImplApi21Parcelizer = i63 + 2;
                iArr39[i63 + 1] = 0;
                return 0;
            case 56:
                int i64 = this.AudioAttributesImplApi21Parcelizer;
                int i65 = i64 - 1;
                this.AudioAttributesImplApi21Parcelizer = i65;
                int[] iArr40 = this.MediaBrowserCompatSearchResultReceiver;
                iArr40[i64 - 2] = iArr40[i64 - 2] / iArr40[i65];
                int i66 = i64 - 2;
                this.AudioAttributesImplApi21Parcelizer = i66;
                this.MediaBrowserCompatMediaItem[i66] = null;
                return 0;
            case 57:
                int[] iArr41 = this.MediaBrowserCompatSearchResultReceiver;
                int i67 = this.AudioAttributesImplApi21Parcelizer;
                iArr41[i67] = 65;
                this.AudioAttributesImplApi21Parcelizer = i67;
                iArr41[i67 - 1] = iArr41[i67 - 1] + iArr41[i67];
                return 0;
            case 58:
                int[] iArr42 = this.MediaBrowserCompatSearchResultReceiver;
                int i68 = this.AudioAttributesImplApi21Parcelizer;
                iArr42[i68] = 85;
                iArr42[i68 + 1] = 0;
                int i69 = i68 + 1;
                this.AudioAttributesImplApi21Parcelizer = i69;
                iArr42[i68] = iArr42[i68] / iArr42[i69];
                return 0;
            case 59:
                int[] iArr43 = this.MediaBrowserCompatSearchResultReceiver;
                int i70 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i70 + 1;
                iArr43[i70] = 1;
                return 0;
            case 60:
                int[] iArr44 = this.MediaBrowserCompatSearchResultReceiver;
                int i71 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i71 + 1;
                iArr44[i71] = 0;
                return 0;
            case 61:
                int[] iArr45 = this.MediaBrowserCompatSearchResultReceiver;
                int i72 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i72 + 1;
                iArr45[i72] = 75;
                return 0;
            case 62:
                int[] iArr46 = this.MediaBrowserCompatSearchResultReceiver;
                int i73 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i73 + 1;
                iArr46[i73] = 5;
                return 0;
            case 63:
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                int i74 = this.AudioAttributesImplApi21Parcelizer;
                objArr10[i74] = objArr10[11];
                int[] iArr47 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i74 + 2;
                iArr47[i74 + 1] = iArr47[12];
                return 0;
            case 64:
                int[] iArr48 = this.MediaBrowserCompatSearchResultReceiver;
                int i75 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i75 + 1;
                iArr48[i75] = 65;
                return 0;
            case 65:
                int[] iArr49 = this.MediaBrowserCompatSearchResultReceiver;
                int i76 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i76 + 1;
                iArr49[i76] = 62;
                return 0;
            case 66:
                int[] iArr50 = this.MediaBrowserCompatSearchResultReceiver;
                int i77 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i77 + 1;
                iArr50[i77] = 53;
                return 0;
            case 67:
                int[] iArr51 = this.MediaBrowserCompatSearchResultReceiver;
                int i78 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i78 + 1;
                iArr51[i78] = 78;
                return 0;
            case 68:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i79 = this.AudioAttributesImplApi21Parcelizer;
                objArr11[i79] = objArr11[12];
                this.AudioAttributesImplApi21Parcelizer = i79 + 2;
                objArr11[i79 + 1] = objArr11[13];
                return 0;
            case 69:
                int[] iArr52 = this.MediaBrowserCompatSearchResultReceiver;
                int i80 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i80 + 1;
                iArr52[i80] = 29;
                return 0;
            case 70:
                int[] iArr53 = this.MediaBrowserCompatSearchResultReceiver;
                int i81 = this.AudioAttributesImplApi21Parcelizer;
                iArr53[i81] = 63;
                iArr53[i81 - 1] = iArr53[i81 - 1] + iArr53[i81];
                this.AudioAttributesImplApi21Parcelizer = i81 + 1;
                iArr53[i81] = iArr53[i81 - 1];
                return 0;
            case 71:
                int[] iArr54 = this.MediaBrowserCompatSearchResultReceiver;
                int i82 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i82 + 1;
                iArr54[i82] = 89;
                return 0;
            case 72:
                int[] iArr55 = this.MediaBrowserCompatSearchResultReceiver;
                int i83 = this.AudioAttributesImplApi21Parcelizer;
                iArr55[i83] = iArr55[i83 - 1];
                this.AudioAttributesImplApi21Parcelizer = i83 + 2;
                iArr55[i83 + 1] = 128;
                return 0;
            case 73:
                int[] iArr56 = this.MediaBrowserCompatSearchResultReceiver;
                int i84 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                Object obj3 = objArr12[i84 - 1];
                objArr12[i84 - 1] = null;
                iArr56[i84 - 1] = ((int[]) obj3).length;
                return 0;
            case 74:
                int[] iArr57 = this.MediaBrowserCompatSearchResultReceiver;
                int i85 = this.AudioAttributesImplApi21Parcelizer;
                iArr57[i85] = 73;
                iArr57[i85 - 1] = iArr57[i85 - 1] + iArr57[i85];
                this.AudioAttributesImplApi21Parcelizer = i85 + 1;
                iArr57[i85] = iArr57[i85 - 1];
                return 0;
            case 75:
                int[] iArr58 = this.MediaBrowserCompatSearchResultReceiver;
                int i86 = this.AudioAttributesImplApi21Parcelizer;
                iArr58[i86] = 49;
                this.AudioAttributesImplApi21Parcelizer = i86;
                iArr58[i86 - 1] = iArr58[i86 - 1] + iArr58[i86];
                return 0;
            case 76:
                int[] iArr59 = this.MediaBrowserCompatSearchResultReceiver;
                int i87 = this.AudioAttributesImplApi21Parcelizer;
                iArr59[i87] = iArr59[i87 - 1];
                iArr59[i87 + 1] = 128;
                int i88 = i87 + 1;
                this.AudioAttributesImplApi21Parcelizer = i88;
                iArr59[i87] = iArr59[i87] % iArr59[i88];
                return 0;
            case 77:
                int[] iArr60 = this.MediaBrowserCompatSearchResultReceiver;
                int i89 = this.AudioAttributesImplApi21Parcelizer;
                iArr60[i89] = 83;
                this.AudioAttributesImplApi21Parcelizer = i89;
                iArr60[i89 - 1] = iArr60[i89 - 1] + iArr60[i89];
                return 0;
            case 78:
                int[] iArr61 = this.MediaBrowserCompatSearchResultReceiver;
                int i90 = this.AudioAttributesImplApi21Parcelizer;
                iArr61[i90] = 71;
                this.AudioAttributesImplApi21Parcelizer = i90;
                iArr61[i90 - 1] = iArr61[i90 - 1] + iArr61[i90];
                return 0;
            case 79:
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 80:
                int[] iArr62 = this.MediaBrowserCompatSearchResultReceiver;
                int i91 = this.AudioAttributesImplApi21Parcelizer;
                iArr62[i91] = 93;
                iArr62[i91 - 1] = iArr62[i91 - 1] + iArr62[i91];
                this.AudioAttributesImplApi21Parcelizer = i91 + 1;
                iArr62[i91] = iArr62[i91 - 1];
                return 0;
            case 81:
                int[] iArr63 = this.MediaBrowserCompatSearchResultReceiver;
                int i92 = this.AudioAttributesImplApi21Parcelizer;
                iArr63[i92] = 2;
                this.AudioAttributesImplApi21Parcelizer = i92;
                iArr63[i92 - 1] = iArr63[i92 - 1] % iArr63[i92];
                int i93 = i92 - 1;
                this.AudioAttributesImplApi21Parcelizer = i93;
                this.MediaBrowserCompatMediaItem[i93] = null;
                return 0;
            case 82:
                int[] iArr64 = this.MediaBrowserCompatSearchResultReceiver;
                int i94 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i94 + 1;
                iArr64[i94] = 117;
                return 0;
            case 83:
                int[] iArr65 = this.MediaBrowserCompatSearchResultReceiver;
                int i95 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                Object obj4 = objArr13[i95 - 1];
                objArr13[i95 - 1] = null;
                iArr65[i95 - 1] = ((int[]) obj4).length;
                int i96 = i95 - 1;
                this.AudioAttributesImplApi21Parcelizer = i96;
                objArr13[i96] = null;
                return 0;
            case 84:
                int[] iArr66 = this.MediaBrowserCompatSearchResultReceiver;
                int i97 = this.AudioAttributesImplApi21Parcelizer;
                iArr66[i97] = 25;
                iArr66[i97 - 1] = iArr66[i97 - 1] + iArr66[i97];
                this.AudioAttributesImplApi21Parcelizer = i97 + 1;
                iArr66[i97] = iArr66[i97 - 1];
                return 0;
            case 85:
                int[] iArr67 = this.MediaBrowserCompatSearchResultReceiver;
                int i98 = this.AudioAttributesImplApi21Parcelizer;
                iArr67[i98] = 103;
                this.AudioAttributesImplApi21Parcelizer = i98;
                iArr67[i98 - 1] = iArr67[i98 - 1] + iArr67[i98];
                return 0;
            case 86:
                int[] iArr68 = this.MediaBrowserCompatSearchResultReceiver;
                int i99 = this.AudioAttributesImplApi21Parcelizer;
                iArr68[i99] = 87;
                iArr68[i99 + 1] = 0;
                int i100 = i99 + 1;
                this.AudioAttributesImplApi21Parcelizer = i100;
                iArr68[i99] = iArr68[i99] / iArr68[i100];
                return 0;
            case 87:
                int[] iArr69 = this.MediaBrowserCompatSearchResultReceiver;
                int i101 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i101 + 1;
                iArr69[i101] = 72;
                return 0;
            case 88:
                int[] iArr70 = this.MediaBrowserCompatSearchResultReceiver;
                int i102 = this.AudioAttributesImplApi21Parcelizer;
                iArr70[i102] = 111;
                this.AudioAttributesImplApi21Parcelizer = i102;
                iArr70[i102 - 1] = iArr70[i102 - 1] + iArr70[i102];
                return 0;
            case 89:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i103 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i103 + 1;
                objArr14[i103] = null;
                int[] iArr71 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj5 = objArr14[i103];
                objArr14[i103] = null;
                iArr71[i103] = ((int[]) obj5).length;
                return 0;
            case 90:
                int[] iArr72 = this.MediaBrowserCompatSearchResultReceiver;
                int i104 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i104 + 1;
                iArr72[i104] = 30;
                return 0;
            case 91:
                int[] iArr73 = this.MediaBrowserCompatSearchResultReceiver;
                int i105 = this.AudioAttributesImplApi21Parcelizer;
                iArr73[i105] = 7;
                iArr73[i105 - 1] = iArr73[i105 - 1] + iArr73[i105];
                this.AudioAttributesImplApi21Parcelizer = i105 + 1;
                iArr73[i105] = iArr73[i105 - 1];
                return 0;
            case 92:
                int[] iArr74 = this.MediaBrowserCompatSearchResultReceiver;
                int i106 = this.AudioAttributesImplApi21Parcelizer;
                iArr74[i106] = 75;
                iArr74[i106 - 1] = iArr74[i106 - 1] + iArr74[i106];
                this.AudioAttributesImplApi21Parcelizer = i106 + 1;
                iArr74[i106] = iArr74[i106 - 1];
                return 0;
            case 93:
                int[] iArr75 = this.MediaBrowserCompatSearchResultReceiver;
                int i107 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i107 + 1;
                iArr75[i107] = 28;
                return 0;
            case 94:
                int[] iArr76 = this.MediaBrowserCompatSearchResultReceiver;
                int i108 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i108 + 1;
                iArr76[i108] = 32;
                return 0;
            case 95:
                int[] iArr77 = this.MediaBrowserCompatSearchResultReceiver;
                int i109 = this.AudioAttributesImplApi21Parcelizer;
                iArr77[i109] = 57;
                this.AudioAttributesImplApi21Parcelizer = i109;
                iArr77[i109 - 1] = iArr77[i109 - 1] + iArr77[i109];
                return 0;
            case 96:
                int[] iArr78 = this.MediaBrowserCompatSearchResultReceiver;
                int i110 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i110 + 1;
                iArr78[i110] = 77;
                return 0;
            case 97:
                int[] iArr79 = this.MediaBrowserCompatSearchResultReceiver;
                int i111 = this.AudioAttributesImplApi21Parcelizer;
                iArr79[i111] = 69;
                this.AudioAttributesImplApi21Parcelizer = i111;
                iArr79[i111 - 1] = iArr79[i111 - 1] + iArr79[i111];
                return 0;
            case 98:
                int[] iArr80 = this.MediaBrowserCompatSearchResultReceiver;
                int i112 = this.AudioAttributesImplApi21Parcelizer;
                iArr80[i112] = 35;
                iArr80[i112 + 1] = 0;
                int i113 = i112 + 1;
                this.AudioAttributesImplApi21Parcelizer = i113;
                iArr80[i112] = iArr80[i112] / iArr80[i113];
                return 0;
            case 99:
                int[] iArr81 = this.MediaBrowserCompatSearchResultReceiver;
                int i114 = this.AudioAttributesImplApi21Parcelizer;
                iArr81[i114] = 47;
                this.AudioAttributesImplApi21Parcelizer = i114;
                iArr81[i114 - 1] = iArr81[i114 - 1] + iArr81[i114];
                return 0;
            case 100:
                int[] iArr82 = this.MediaBrowserCompatSearchResultReceiver;
                int i115 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i115 + 1;
                iArr82[i115] = 85;
                return 0;
            case 101:
                int[] iArr83 = this.MediaBrowserCompatSearchResultReceiver;
                int i116 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i116 + 1;
                iArr83[i116] = 15;
                return 0;
            case 102:
                int[] iArr84 = this.MediaBrowserCompatSearchResultReceiver;
                int i117 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i117 + 1;
                iArr84[i117] = 26;
                return 0;
            case 103:
                int[] iArr85 = this.MediaBrowserCompatSearchResultReceiver;
                int i118 = this.AudioAttributesImplApi21Parcelizer;
                iArr85[i118] = iArr85[12];
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i118 + 2;
                objArr15[i118 + 1] = objArr15[13];
                return 0;
            case 104:
                int[] iArr86 = this.MediaBrowserCompatSearchResultReceiver;
                int i119 = this.AudioAttributesImplApi21Parcelizer;
                iArr86[i119] = 13;
                this.AudioAttributesImplApi21Parcelizer = i119;
                iArr86[i119 - 1] = iArr86[i119 - 1] + iArr86[i119];
                return 0;
            case 105:
                int[] iArr87 = this.MediaBrowserCompatSearchResultReceiver;
                int i120 = this.AudioAttributesImplApi21Parcelizer;
                iArr87[i120] = 19;
                iArr87[i120 - 1] = iArr87[i120 - 1] + iArr87[i120];
                this.AudioAttributesImplApi21Parcelizer = i120 + 1;
                iArr87[i120] = iArr87[i120 - 1];
                return 0;
            case 106:
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                int i121 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i121 + 1;
                objArr16[i121] = null;
                int[] iArr88 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj6 = objArr16[i121];
                objArr16[i121] = null;
                iArr88[i121] = ((int[]) obj6).length;
                this.AudioAttributesImplApi21Parcelizer = i121;
                objArr16[i121] = null;
                return 0;
            case 107:
                int[] iArr89 = this.MediaBrowserCompatSearchResultReceiver;
                int i122 = this.AudioAttributesImplApi21Parcelizer;
                iArr89[i122] = 5;
                iArr89[i122 - 1] = iArr89[i122 - 1] + iArr89[i122];
                this.AudioAttributesImplApi21Parcelizer = i122 + 1;
                iArr89[i122] = iArr89[i122 - 1];
                return 0;
            case 108:
                int[] iArr90 = this.MediaBrowserCompatSearchResultReceiver;
                int i123 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i123 + 1;
                iArr90[i123] = 31;
                return 0;
            case 109:
                int[] iArr91 = this.MediaBrowserCompatSearchResultReceiver;
                int i124 = this.AudioAttributesImplApi21Parcelizer;
                iArr91[i124] = 59;
                this.AudioAttributesImplApi21Parcelizer = i124 + 2;
                iArr91[i124 + 1] = 0;
                return 0;
            case 110:
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                int i125 = this.AudioAttributesImplApi21Parcelizer;
                objArr17[i125] = objArr17[12];
                int[] iArr92 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i125 + 2;
                iArr92[i125 + 1] = iArr92[13];
                return 0;
            case 111:
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                int i126 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i126 + 1;
                objArr18[i126] = objArr18[14];
                return 0;
            case 112:
                int[] iArr93 = this.MediaBrowserCompatSearchResultReceiver;
                int i127 = this.AudioAttributesImplApi21Parcelizer;
                iArr93[i127] = 79;
                this.AudioAttributesImplApi21Parcelizer = i127;
                iArr93[i127 - 1] = iArr93[i127 - 1] + iArr93[i127];
                return 0;
            case 113:
                int[] iArr94 = this.MediaBrowserCompatSearchResultReceiver;
                int i128 = this.AudioAttributesImplApi21Parcelizer;
                iArr94[i128] = iArr94[13];
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i128 + 2;
                objArr19[i128 + 1] = objArr19[14];
                return 0;
            case 114:
                int[] iArr95 = this.MediaBrowserCompatSearchResultReceiver;
                int i129 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i129 + 1;
                iArr95[i129] = 36;
                return 0;
            case 115:
                int[] iArr96 = this.MediaBrowserCompatSearchResultReceiver;
                int i130 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i130 + 1;
                iArr96[i130] = 88;
                return 0;
            case 116:
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                int i131 = this.AudioAttributesImplApi21Parcelizer;
                objArr20[i131] = objArr20[12];
                objArr20[i131 + 1] = objArr20[13];
                this.AudioAttributesImplApi21Parcelizer = i131 + 3;
                objArr20[i131 + 2] = objArr20[14];
                return 0;
            case 117:
                int[] iArr97 = this.MediaBrowserCompatSearchResultReceiver;
                int i132 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i132 + 1;
                iArr97[i132] = 121;
                return 0;
            case 118:
                int[] iArr98 = this.MediaBrowserCompatSearchResultReceiver;
                int i133 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i133 + 1;
                iArr98[i133] = 91;
                return 0;
            case 119:
                int[] iArr99 = this.MediaBrowserCompatSearchResultReceiver;
                int i134 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i134 + 1;
                iArr99[i134] = 41;
                return 0;
            case 120:
                int[] iArr100 = this.MediaBrowserCompatSearchResultReceiver;
                int i135 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i135 + 1;
                iArr100[i135] = 51;
                return 0;
            case 121:
                int[] iArr101 = this.MediaBrowserCompatSearchResultReceiver;
                int i136 = this.AudioAttributesImplApi21Parcelizer;
                iArr101[i136] = 115;
                iArr101[i136 - 1] = iArr101[i136 - 1] + iArr101[i136];
                this.AudioAttributesImplApi21Parcelizer = i136 + 1;
                iArr101[i136] = iArr101[i136 - 1];
                return 0;
            case 122:
                int[] iArr102 = this.MediaBrowserCompatSearchResultReceiver;
                int i137 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i137 + 1;
                iArr102[i137] = 107;
                return 0;
            case 123:
                int[] iArr103 = this.MediaBrowserCompatSearchResultReceiver;
                int i138 = this.AudioAttributesImplApi21Parcelizer;
                iArr103[i138] = 99;
                this.AudioAttributesImplApi21Parcelizer = i138;
                iArr103[i138 - 1] = iArr103[i138 - 1] + iArr103[i138];
                return 0;
            case 124:
                int[] iArr104 = this.MediaBrowserCompatSearchResultReceiver;
                int i139 = this.AudioAttributesImplApi21Parcelizer;
                iArr104[i139] = 0;
                this.AudioAttributesImplApi21Parcelizer = i139;
                iArr104[i139 - 1] = iArr104[i139 - 1] / iArr104[i139];
                int i140 = i139 - 1;
                this.AudioAttributesImplApi21Parcelizer = i140;
                this.MediaBrowserCompatMediaItem[i140] = null;
                return 0;
            case 125:
                int[] iArr105 = this.MediaBrowserCompatSearchResultReceiver;
                int i141 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i141 + 1;
                iArr105[i141] = 18;
                return 0;
            case 126:
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                int i142 = this.AudioAttributesImplApi21Parcelizer;
                objArr21[i142] = objArr21[11];
                objArr21[i142 + 1] = objArr21[12];
                this.AudioAttributesImplApi21Parcelizer = i142 + 3;
                objArr21[i142 + 2] = objArr21[13];
                return 0;
            case 127:
                int[] iArr106 = this.MediaBrowserCompatSearchResultReceiver;
                int i143 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i143 + 1;
                iArr106[i143] = 101;
                return 0;
            case 128:
                int[] iArr107 = this.MediaBrowserCompatSearchResultReceiver;
                int i144 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i144 + 1;
                iArr107[i144] = 99;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr108 = this.MediaBrowserCompatSearchResultReceiver;
                int i145 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i145 + 1;
                iArr108[i145] = 13;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                int[] iArr109 = this.MediaBrowserCompatSearchResultReceiver;
                int i146 = this.AudioAttributesImplApi21Parcelizer;
                iArr109[i146] = 1;
                iArr109[i146 - 1] = iArr109[i146 - 1] + iArr109[i146];
                this.AudioAttributesImplApi21Parcelizer = i146 + 1;
                iArr109[i146] = iArr109[i146 - 1];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int[] iArr110 = this.MediaBrowserCompatSearchResultReceiver;
                int i147 = this.AudioAttributesImplApi21Parcelizer;
                iArr110[i147] = 11;
                iArr110[i147 - 1] = iArr110[i147 - 1] + iArr110[i147];
                this.AudioAttributesImplApi21Parcelizer = i147 + 1;
                iArr110[i147] = iArr110[i147 - 1];
                return 0;
            case 132:
                int[] iArr111 = this.MediaBrowserCompatSearchResultReceiver;
                int i148 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i148 + 1;
                iArr111[i148] = 8;
                return 0;
            case 133:
                int[] iArr112 = this.MediaBrowserCompatSearchResultReceiver;
                int i149 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i149 + 1;
                iArr112[i149] = 80;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int[] iArr113 = this.MediaBrowserCompatSearchResultReceiver;
                int i150 = this.AudioAttributesImplApi21Parcelizer;
                iArr113[i150] = 87;
                iArr113[i150 - 1] = iArr113[i150 - 1] + iArr113[i150];
                this.AudioAttributesImplApi21Parcelizer = i150 + 1;
                iArr113[i150] = iArr113[i150 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr114 = this.MediaBrowserCompatSearchResultReceiver;
                int i151 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i151 + 1;
                iArr114[i151] = 103;
                return 0;
            case 136:
                int[] iArr115 = this.MediaBrowserCompatSearchResultReceiver;
                int i152 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i152 + 1;
                iArr115[i152] = 87;
                return 0;
            case 137:
                int[] iArr116 = this.MediaBrowserCompatSearchResultReceiver;
                int i153 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i153 + 1;
                iArr116[i153] = 9;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int[] iArr117 = this.MediaBrowserCompatSearchResultReceiver;
                int i154 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i154 + 1;
                iArr117[i154] = 58;
                return 0;
            case 139:
                int[] iArr118 = this.MediaBrowserCompatSearchResultReceiver;
                int i155 = this.AudioAttributesImplApi21Parcelizer;
                iArr118[i155] = 47;
                iArr118[i155 - 1] = iArr118[i155 - 1] + iArr118[i155];
                this.AudioAttributesImplApi21Parcelizer = i155 + 1;
                iArr118[i155] = iArr118[i155 - 1];
                return 0;
            case 140:
                int[] iArr119 = this.MediaBrowserCompatSearchResultReceiver;
                int i156 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i156 + 1;
                iArr119[i156] = 46;
                return 0;
            case 141:
                int[] iArr120 = this.MediaBrowserCompatSearchResultReceiver;
                int i157 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i157 + 1;
                iArr120[i157] = 44;
                return 0;
            case 142:
                int[] iArr121 = this.MediaBrowserCompatSearchResultReceiver;
                int i158 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i158 + 1;
                iArr121[i158] = 73;
                return 0;
            case 143:
                int[] iArr122 = this.MediaBrowserCompatSearchResultReceiver;
                int i159 = this.AudioAttributesImplApi21Parcelizer;
                iArr122[i159] = 23;
                iArr122[i159 - 1] = iArr122[i159 - 1] + iArr122[i159];
                this.AudioAttributesImplApi21Parcelizer = i159 + 1;
                iArr122[i159] = iArr122[i159 - 1];
                return 0;
            case 144:
                int[] iArr123 = this.MediaBrowserCompatSearchResultReceiver;
                int i160 = this.AudioAttributesImplApi21Parcelizer;
                iArr123[i160] = 107;
                this.AudioAttributesImplApi21Parcelizer = i160;
                iArr123[i160 - 1] = iArr123[i160 - 1] + iArr123[i160];
                return 0;
            case 145:
                int[] iArr124 = this.MediaBrowserCompatSearchResultReceiver;
                int i161 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i161 + 1;
                iArr124[i161] = 7;
                return 0;
            case 146:
                int[] iArr125 = this.MediaBrowserCompatSearchResultReceiver;
                int i162 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i162 + 1;
                iArr125[i162] = 81;
                return 0;
            case 147:
                int[] iArr126 = this.MediaBrowserCompatSearchResultReceiver;
                int i163 = this.AudioAttributesImplApi21Parcelizer;
                iArr126[i163] = 61;
                this.AudioAttributesImplApi21Parcelizer = i163;
                iArr126[i163 - 1] = iArr126[i163 - 1] + iArr126[i163];
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int[] iArr127 = this.MediaBrowserCompatSearchResultReceiver;
                int i164 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i164 + 1;
                iArr127[i164] = 33;
                return 0;
            case 149:
                int[] iArr128 = this.MediaBrowserCompatSearchResultReceiver;
                int i165 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i165 + 1;
                iArr128[i165] = 23;
                return 0;
            case 150:
                int[] iArr129 = this.MediaBrowserCompatSearchResultReceiver;
                int i166 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i166 + 1;
                iArr129[i166] = 55;
                return 0;
            case 151:
                int[] iArr130 = this.MediaBrowserCompatSearchResultReceiver;
                int i167 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i167 + 1;
                iArr130[i167] = 66;
                return 0;
            case 152:
                int[] iArr131 = this.MediaBrowserCompatSearchResultReceiver;
                int i168 = this.AudioAttributesImplApi21Parcelizer;
                iArr131[i168] = 77;
                iArr131[i168 - 1] = iArr131[i168 - 1] + iArr131[i168];
                this.AudioAttributesImplApi21Parcelizer = i168 + 1;
                iArr131[i168] = iArr131[i168 - 1];
                return 0;
            case 153:
                int[] iArr132 = this.MediaBrowserCompatSearchResultReceiver;
                int i169 = this.AudioAttributesImplApi21Parcelizer;
                iArr132[i169] = 55;
                this.AudioAttributesImplApi21Parcelizer = i169;
                iArr132[i169 - 1] = iArr132[i169 - 1] + iArr132[i169];
                return 0;
            case 154:
                int[] iArr133 = this.MediaBrowserCompatSearchResultReceiver;
                int i170 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i170 + 1;
                iArr133[i170] = 42;
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr134 = this.MediaBrowserCompatSearchResultReceiver;
                int i171 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i171 + 1;
                iArr134[i171] = 37;
                return 0;
            case 156:
                int[] iArr135 = this.MediaBrowserCompatSearchResultReceiver;
                int i172 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i172 + 1;
                iArr135[i172] = 25;
                return 0;
            case 157:
                int[] iArr136 = this.MediaBrowserCompatSearchResultReceiver;
                int i173 = this.AudioAttributesImplApi21Parcelizer;
                iArr136[i173] = 67;
                this.AudioAttributesImplApi21Parcelizer = i173 + 2;
                iArr136[i173 + 1] = 0;
                return 0;
            case 158:
                int[] iArr137 = this.MediaBrowserCompatSearchResultReceiver;
                int i174 = this.AudioAttributesImplApi21Parcelizer;
                iArr137[i174] = 45;
                iArr137[i174 - 1] = iArr137[i174 - 1] + iArr137[i174];
                this.AudioAttributesImplApi21Parcelizer = i174 + 1;
                iArr137[i174] = iArr137[i174 - 1];
                return 0;
            case 159:
                int[] iArr138 = this.MediaBrowserCompatSearchResultReceiver;
                int i175 = this.AudioAttributesImplApi21Parcelizer;
                iArr138[i175] = 85;
                iArr138[i175 - 1] = iArr138[i175 - 1] + iArr138[i175];
                this.AudioAttributesImplApi21Parcelizer = i175 + 1;
                iArr138[i175] = iArr138[i175 - 1];
                return 0;
            case 160:
                int[] iArr139 = this.MediaBrowserCompatSearchResultReceiver;
                int i176 = this.AudioAttributesImplApi21Parcelizer;
                iArr139[i176] = 0;
                this.AudioAttributesImplApi21Parcelizer = i176;
                iArr139[i176 - 1] = iArr139[i176 - 1] / iArr139[i176];
                return 0;
            case 161:
                int[] iArr140 = this.MediaBrowserCompatSearchResultReceiver;
                int i177 = this.AudioAttributesImplApi21Parcelizer;
                iArr140[i177] = 9;
                this.AudioAttributesImplApi21Parcelizer = i177;
                iArr140[i177 - 1] = iArr140[i177 - 1] + iArr140[i177];
                return 0;
            case 162:
                int[] iArr141 = this.MediaBrowserCompatSearchResultReceiver;
                int i178 = this.AudioAttributesImplApi21Parcelizer;
                iArr141[i178] = 81;
                iArr141[i178 - 1] = iArr141[i178 - 1] + iArr141[i178];
                this.AudioAttributesImplApi21Parcelizer = i178 + 1;
                iArr141[i178] = iArr141[i178 - 1];
                return 0;
            case 163:
                int[] iArr142 = this.MediaBrowserCompatSearchResultReceiver;
                int i179 = this.AudioAttributesImplApi21Parcelizer;
                iArr142[i179] = 40;
                this.AudioAttributesImplApi21Parcelizer = i179 + 2;
                iArr142[i179 + 1] = 0;
                return 0;
            case 164:
                int[] iArr143 = this.MediaBrowserCompatSearchResultReceiver;
                int i180 = this.AudioAttributesImplApi21Parcelizer;
                iArr143[i180] = 43;
                iArr143[i180 - 1] = iArr143[i180 - 1] + iArr143[i180];
                this.AudioAttributesImplApi21Parcelizer = i180 + 1;
                iArr143[i180] = iArr143[i180 - 1];
                return 0;
            case 165:
                int[] iArr144 = this.MediaBrowserCompatSearchResultReceiver;
                int i181 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i181 + 1;
                iArr144[i181] = 60;
                return 0;
            case 166:
                int[] iArr145 = this.MediaBrowserCompatSearchResultReceiver;
                int i182 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i182 + 1;
                iArr145[i182] = 97;
                return 0;
            case 167:
                int[] iArr146 = this.MediaBrowserCompatSearchResultReceiver;
                int i183 = this.AudioAttributesImplApi21Parcelizer;
                iArr146[i183] = 23;
                this.AudioAttributesImplApi21Parcelizer = i183;
                iArr146[i183 - 1] = iArr146[i183 - 1] + iArr146[i183];
                return 0;
            case 168:
                int[] iArr147 = this.MediaBrowserCompatSearchResultReceiver;
                int i184 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i184 + 1;
                iArr147[i184] = 48;
                return 0;
            case 169:
                int[] iArr148 = this.MediaBrowserCompatSearchResultReceiver;
                int i185 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i185 + 1;
                iArr148[i185] = 34;
                return 0;
            case 170:
                int[] iArr149 = this.MediaBrowserCompatSearchResultReceiver;
                int i186 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i186 + 1;
                iArr149[i186] = 52;
                return 0;
            case 171:
                int[] iArr150 = this.MediaBrowserCompatSearchResultReceiver;
                int i187 = this.AudioAttributesImplApi21Parcelizer;
                iArr150[i187] = 101;
                iArr150[i187 - 1] = iArr150[i187 - 1] + iArr150[i187];
                this.AudioAttributesImplApi21Parcelizer = i187 + 1;
                iArr150[i187] = iArr150[i187 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr151 = this.MediaBrowserCompatSearchResultReceiver;
                int i188 = this.AudioAttributesImplApi21Parcelizer;
                iArr151[i188] = 35;
                iArr151[i188 - 1] = iArr151[i188 - 1] + iArr151[i188];
                this.AudioAttributesImplApi21Parcelizer = i188 + 1;
                iArr151[i188] = iArr151[i188 - 1];
                return 0;
            case 173:
                int[] iArr152 = this.MediaBrowserCompatSearchResultReceiver;
                int i189 = this.AudioAttributesImplApi21Parcelizer;
                iArr152[i189] = 19;
                this.AudioAttributesImplApi21Parcelizer = i189;
                iArr152[i189 - 1] = iArr152[i189 - 1] + iArr152[i189];
                return 0;
            case 174:
                long[] jArr = this.MediaDescriptionCompat;
                int i190 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i190 + 1;
                jArr[i190] = this.IconCompatParcelizer;
                return 0;
            case 175:
                this.write = this.MediaDescriptionCompat[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 176:
                int[] iArr153 = this.MediaBrowserCompatSearchResultReceiver;
                int i191 = this.AudioAttributesImplApi21Parcelizer;
                iArr153[i191] = 41;
                iArr153[i191 - 1] = iArr153[i191 - 1] + iArr153[i191];
                this.AudioAttributesImplApi21Parcelizer = i191 + 1;
                iArr153[i191] = iArr153[i191 - 1];
                return 0;
            case 177:
                int[] iArr154 = this.MediaBrowserCompatSearchResultReceiver;
                int i192 = this.AudioAttributesImplApi21Parcelizer;
                iArr154[i192] = 51;
                this.AudioAttributesImplApi21Parcelizer = i192;
                iArr154[i192 - 1] = iArr154[i192 - 1] + iArr154[i192];
                return 0;
            case 178:
                int[] iArr155 = this.MediaBrowserCompatSearchResultReceiver;
                int i193 = this.AudioAttributesImplApi21Parcelizer;
                iArr155[i193] = 39;
                iArr155[i193 - 1] = iArr155[i193 - 1] + iArr155[i193];
                this.AudioAttributesImplApi21Parcelizer = i193 + 1;
                iArr155[i193] = iArr155[i193 - 1];
                return 0;
            case 179:
                int[] iArr156 = this.MediaBrowserCompatSearchResultReceiver;
                int i194 = this.AudioAttributesImplApi21Parcelizer;
                iArr156[i194] = 101;
                this.AudioAttributesImplApi21Parcelizer = i194;
                iArr156[i194 - 1] = iArr156[i194 - 1] + iArr156[i194];
                return 0;
            case 180:
                int[] iArr157 = this.MediaBrowserCompatSearchResultReceiver;
                int i195 = this.AudioAttributesImplApi21Parcelizer;
                iArr157[i195] = 29;
                this.AudioAttributesImplApi21Parcelizer = i195;
                iArr157[i195 - 1] = iArr157[i195 - 1] + iArr157[i195];
                return 0;
            case 181:
                int[] iArr158 = this.MediaBrowserCompatSearchResultReceiver;
                int i196 = this.AudioAttributesImplApi21Parcelizer;
                iArr158[i196] = 39;
                this.AudioAttributesImplApi21Parcelizer = i196;
                iArr158[i196 - 1] = iArr158[i196 - 1] + iArr158[i196];
                return 0;
            case 182:
                int[] iArr159 = this.MediaBrowserCompatSearchResultReceiver;
                int i197 = this.AudioAttributesImplApi21Parcelizer;
                iArr159[i197] = 33;
                iArr159[i197 - 1] = iArr159[i197 - 1] + iArr159[i197];
                this.AudioAttributesImplApi21Parcelizer = i197 + 1;
                iArr159[i197] = iArr159[i197 - 1];
                return 0;
            case 183:
                int[] iArr160 = this.MediaBrowserCompatSearchResultReceiver;
                int i198 = this.AudioAttributesImplApi21Parcelizer;
                iArr160[i198] = 111;
                iArr160[i198 - 1] = iArr160[i198 - 1] + iArr160[i198];
                this.AudioAttributesImplApi21Parcelizer = i198 + 1;
                iArr160[i198] = iArr160[i198 - 1];
                return 0;
            case 184:
                int[] iArr161 = this.MediaBrowserCompatSearchResultReceiver;
                int i199 = this.AudioAttributesImplApi21Parcelizer;
                iArr161[i199] = 7;
                this.AudioAttributesImplApi21Parcelizer = i199 + 2;
                iArr161[i199 + 1] = 0;
                return 0;
            case 185:
                int[] iArr162 = this.MediaBrowserCompatSearchResultReceiver;
                int i200 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i200 + 1;
                iArr162[i200] = 86;
                return 0;
            case 186:
                int[] iArr163 = this.MediaBrowserCompatSearchResultReceiver;
                int i201 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i201 + 1;
                iArr163[i201] = 20;
                return 0;
            case 187:
                int[] iArr164 = this.MediaBrowserCompatSearchResultReceiver;
                int i202 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i202 + 1;
                iArr164[i202] = 125;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr165 = this.MediaBrowserCompatSearchResultReceiver;
                int i203 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i203 + 1;
                iArr165[i203] = 93;
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr166 = this.MediaBrowserCompatSearchResultReceiver;
                int i204 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i204 + 1;
                iArr166[i204] = iArr166[12];
                return 0;
            case 190:
                int[] iArr167 = this.MediaBrowserCompatSearchResultReceiver;
                int i205 = this.AudioAttributesImplApi21Parcelizer;
                iArr167[i205] = 95;
                iArr167[i205 - 1] = iArr167[i205 - 1] + iArr167[i205];
                this.AudioAttributesImplApi21Parcelizer = i205 + 1;
                iArr167[i205] = iArr167[i205 - 1];
                return 0;
            case 191:
                int[] iArr168 = this.MediaBrowserCompatSearchResultReceiver;
                int i206 = this.AudioAttributesImplApi21Parcelizer;
                iArr168[i206] = 37;
                iArr168[i206 - 1] = iArr168[i206 - 1] + iArr168[i206];
                this.AudioAttributesImplApi21Parcelizer = i206 + 1;
                iArr168[i206] = iArr168[i206 - 1];
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int[] iArr169 = this.MediaBrowserCompatSearchResultReceiver;
                int i207 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i207 + 1;
                iArr169[i207] = 49;
                return 0;
            case 193:
                int[] iArr170 = this.MediaBrowserCompatSearchResultReceiver;
                int i208 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i208 + 1;
                iArr170[i208] = 79;
                return 0;
            case 194:
                int[] iArr171 = this.MediaBrowserCompatSearchResultReceiver;
                int i209 = this.AudioAttributesImplApi21Parcelizer;
                iArr171[i209] = 113;
                iArr171[i209 - 1] = iArr171[i209 - 1] + iArr171[i209];
                this.AudioAttributesImplApi21Parcelizer = i209 + 1;
                iArr171[i209] = iArr171[i209 - 1];
                return 0;
            case 195:
                int[] iArr172 = this.MediaBrowserCompatSearchResultReceiver;
                int i210 = this.AudioAttributesImplApi21Parcelizer;
                iArr172[i210] = 17;
                this.AudioAttributesImplApi21Parcelizer = i210;
                iArr172[i210 - 1] = iArr172[i210 - 1] + iArr172[i210];
                return 0;
            case 196:
                int[] iArr173 = this.MediaBrowserCompatSearchResultReceiver;
                int i211 = this.AudioAttributesImplApi21Parcelizer;
                iArr173[i211] = 41;
                this.AudioAttributesImplApi21Parcelizer = i211;
                iArr173[i211 - 1] = iArr173[i211 - 1] + iArr173[i211];
                return 0;
            case 197:
                int[] iArr174 = this.MediaBrowserCompatSearchResultReceiver;
                int i212 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i212 + 1;
                iArr174[i212] = 22;
                return 0;
            case 198:
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                int i213 = this.AudioAttributesImplApi21Parcelizer;
                objArr22[i213] = objArr22[11];
                float[] fArr3 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i213 + 2;
                fArr3[i213 + 1] = fArr3[12];
                return 0;
            case 199:
                int[] iArr175 = this.MediaBrowserCompatSearchResultReceiver;
                int i214 = this.AudioAttributesImplApi21Parcelizer;
                iArr175[i214] = 15;
                this.AudioAttributesImplApi21Parcelizer = i214;
                iArr175[i214 - 1] = iArr175[i214 - 1] + iArr175[i214];
                return 0;
            case 200:
                int[] iArr176 = this.MediaBrowserCompatSearchResultReceiver;
                int i215 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i215 + 1;
                iArr176[i215] = 11;
                return 0;
            case 201:
                int[] iArr177 = this.MediaBrowserCompatSearchResultReceiver;
                int i216 = this.AudioAttributesImplApi21Parcelizer;
                iArr177[i216] = 35;
                this.AudioAttributesImplApi21Parcelizer = i216;
                iArr177[i216 - 1] = iArr177[i216 - 1] + iArr177[i216];
                return 0;
            case 202:
                int[] iArr178 = this.MediaBrowserCompatSearchResultReceiver;
                int i217 = this.AudioAttributesImplApi21Parcelizer;
                iArr178[i217] = 75;
                this.AudioAttributesImplApi21Parcelizer = i217;
                iArr178[i217 - 1] = iArr178[i217 - 1] + iArr178[i217];
                return 0;
            case 203:
                int[] iArr179 = this.MediaBrowserCompatSearchResultReceiver;
                int i218 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i218 + 1;
                iArr179[i218] = 113;
                return 0;
            case 204:
                int[] iArr180 = this.MediaBrowserCompatSearchResultReceiver;
                int i219 = this.AudioAttributesImplApi21Parcelizer;
                iArr180[i219] = 27;
                this.AudioAttributesImplApi21Parcelizer = i219;
                iArr180[i219 - 1] = iArr180[i219 - 1] + iArr180[i219];
                return 0;
            case 205:
                int[] iArr181 = this.MediaBrowserCompatSearchResultReceiver;
                int i220 = this.AudioAttributesImplApi21Parcelizer;
                iArr181[i220] = 59;
                iArr181[i220 - 1] = iArr181[i220 - 1] + iArr181[i220];
                this.AudioAttributesImplApi21Parcelizer = i220 + 1;
                iArr181[i220] = iArr181[i220 - 1];
                return 0;
            case 206:
                int[] iArr182 = this.MediaBrowserCompatSearchResultReceiver;
                int i221 = this.AudioAttributesImplApi21Parcelizer;
                iArr182[i221] = 91;
                this.AudioAttributesImplApi21Parcelizer = i221;
                iArr182[i221 - 1] = iArr182[i221 - 1] + iArr182[i221];
                return 0;
            case 207:
                int[] iArr183 = this.MediaBrowserCompatSearchResultReceiver;
                int i222 = this.AudioAttributesImplApi21Parcelizer;
                iArr183[i222] = 26;
                iArr183[i222 + 1] = 0;
                int i223 = i222 + 1;
                this.AudioAttributesImplApi21Parcelizer = i223;
                iArr183[i222] = iArr183[i222] / iArr183[i223];
                return 0;
            case 208:
                int[] iArr184 = this.MediaBrowserCompatSearchResultReceiver;
                int i224 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i224 + 1;
                iArr184[i224] = 24;
                return 0;
            case 209:
                int[] iArr185 = this.MediaBrowserCompatSearchResultReceiver;
                int i225 = this.AudioAttributesImplApi21Parcelizer;
                iArr185[i225] = 71;
                iArr185[i225 - 1] = iArr185[i225 - 1] + iArr185[i225];
                this.AudioAttributesImplApi21Parcelizer = i225 + 1;
                iArr185[i225] = iArr185[i225 - 1];
                return 0;
            case 210:
                int[] iArr186 = this.MediaBrowserCompatSearchResultReceiver;
                int i226 = this.AudioAttributesImplApi21Parcelizer;
                iArr186[i226] = 97;
                iArr186[i226 - 1] = iArr186[i226 - 1] + iArr186[i226];
                this.AudioAttributesImplApi21Parcelizer = i226 + 1;
                iArr186[i226] = iArr186[i226 - 1];
                return 0;
            case 211:
                int[] iArr187 = this.MediaBrowserCompatSearchResultReceiver;
                int i227 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i227 + 1;
                iArr187[i227] = 67;
                return 0;
            case 212:
                int[] iArr188 = this.MediaBrowserCompatSearchResultReceiver;
                int i228 = this.AudioAttributesImplApi21Parcelizer;
                iArr188[i228] = 99;
                iArr188[i228 - 1] = iArr188[i228 - 1] + iArr188[i228];
                this.AudioAttributesImplApi21Parcelizer = i228 + 1;
                iArr188[i228] = iArr188[i228 - 1];
                return 0;
            case 213:
                int[] iArr189 = this.MediaBrowserCompatSearchResultReceiver;
                int i229 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i229 + 1;
                iArr189[i229] = 83;
                return 0;
            case 214:
                int[] iArr190 = this.MediaBrowserCompatSearchResultReceiver;
                int i230 = this.AudioAttributesImplApi21Parcelizer;
                iArr190[i230] = 89;
                iArr190[i230 - 1] = iArr190[i230 - 1] + iArr190[i230];
                this.AudioAttributesImplApi21Parcelizer = i230 + 1;
                iArr190[i230] = iArr190[i230 - 1];
                return 0;
            case 215:
                int[] iArr191 = this.MediaBrowserCompatSearchResultReceiver;
                int i231 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i231 + 1;
                iArr191[i231] = 95;
                return 0;
            case 216:
                int[] iArr192 = this.MediaBrowserCompatSearchResultReceiver;
                int i232 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i232 + 1;
                iArr192[i232] = 17;
                return 0;
            case 217:
                int[] iArr193 = this.MediaBrowserCompatSearchResultReceiver;
                int i233 = this.AudioAttributesImplApi21Parcelizer;
                iArr193[i233] = 93;
                this.AudioAttributesImplApi21Parcelizer = i233;
                iArr193[i233 - 1] = iArr193[i233 - 1] + iArr193[i233];
                return 0;
            case 218:
                int[] iArr194 = this.MediaBrowserCompatSearchResultReceiver;
                int i234 = this.AudioAttributesImplApi21Parcelizer;
                iArr194[i234] = 7;
                this.AudioAttributesImplApi21Parcelizer = i234;
                iArr194[i234 - 1] = iArr194[i234 - 1] + iArr194[i234];
                return 0;
            case 219:
                int[] iArr195 = this.MediaBrowserCompatSearchResultReceiver;
                int i235 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i235 + 1;
                iArr195[i235] = 68;
                return 0;
            case 220:
                int[] iArr196 = this.MediaBrowserCompatSearchResultReceiver;
                int i236 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i236 + 1;
                iArr196[i236] = 43;
                return 0;
            case 221:
                int[] iArr197 = this.MediaBrowserCompatSearchResultReceiver;
                int i237 = this.AudioAttributesImplApi21Parcelizer;
                iArr197[i237] = 19;
                this.AudioAttributesImplApi21Parcelizer = i237 + 2;
                iArr197[i237 + 1] = 0;
                return 0;
            case 222:
                int[] iArr198 = this.MediaBrowserCompatSearchResultReceiver;
                int i238 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i238 + 1;
                iArr198[i238] = 90;
                return 0;
            case 223:
                int[] iArr199 = this.MediaBrowserCompatSearchResultReceiver;
                int i239 = this.AudioAttributesImplApi21Parcelizer;
                iArr199[i239] = 107;
                iArr199[i239 - 1] = iArr199[i239 - 1] + iArr199[i239];
                this.AudioAttributesImplApi21Parcelizer = i239 + 1;
                iArr199[i239] = iArr199[i239 - 1];
                return 0;
            case 224:
                int[] iArr200 = this.MediaBrowserCompatSearchResultReceiver;
                int i240 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i240 + 1;
                iArr200[i240] = 115;
                return 0;
            case 225:
                int[] iArr201 = this.MediaBrowserCompatSearchResultReceiver;
                int i241 = this.AudioAttributesImplApi21Parcelizer;
                iArr201[i241] = 85;
                this.AudioAttributesImplApi21Parcelizer = i241;
                iArr201[i241 - 1] = iArr201[i241 - 1] + iArr201[i241];
                return 0;
            case 226:
                int[] iArr202 = this.MediaBrowserCompatSearchResultReceiver;
                int i242 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i242 + 1;
                iArr202[i242] = 92;
                return 0;
            case 227:
                int[] iArr203 = this.MediaBrowserCompatSearchResultReceiver;
                int i243 = this.AudioAttributesImplApi21Parcelizer;
                iArr203[i243] = 53;
                iArr203[i243 - 1] = iArr203[i243 - 1] + iArr203[i243];
                this.AudioAttributesImplApi21Parcelizer = i243 + 1;
                iArr203[i243] = iArr203[i243 - 1];
                return 0;
            case 228:
                int[] iArr204 = this.MediaBrowserCompatSearchResultReceiver;
                int i244 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i244 + 1;
                iArr204[i244] = 57;
                return 0;
            case 229:
                int[] iArr205 = this.MediaBrowserCompatSearchResultReceiver;
                int i245 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i245 + 1;
                iArr205[i245] = 63;
                return 0;
            case 230:
                int[] iArr206 = this.MediaBrowserCompatSearchResultReceiver;
                int i246 = this.AudioAttributesImplApi21Parcelizer;
                iArr206[i246] = 81;
                this.AudioAttributesImplApi21Parcelizer = i246;
                iArr206[i246 - 1] = iArr206[i246 - 1] + iArr206[i246];
                return 0;
            case 231:
                int[] iArr207 = this.MediaBrowserCompatSearchResultReceiver;
                int i247 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i247 + 1;
                iArr207[i247] = 27;
                return 0;
            case 232:
                int[] iArr208 = this.MediaBrowserCompatSearchResultReceiver;
                int i248 = this.AudioAttributesImplApi21Parcelizer;
                iArr208[i248] = 4;
                iArr208[i248 + 1] = 0;
                int i249 = i248 + 1;
                this.AudioAttributesImplApi21Parcelizer = i249;
                iArr208[i248] = iArr208[i248] / iArr208[i249];
                return 0;
            case 233:
                int[] iArr209 = this.MediaBrowserCompatSearchResultReceiver;
                int i250 = this.AudioAttributesImplApi21Parcelizer;
                iArr209[i250] = 47;
                this.AudioAttributesImplApi21Parcelizer = i250 + 2;
                iArr209[i250 + 1] = 0;
                return 0;
            case 234:
                int[] iArr210 = this.MediaBrowserCompatSearchResultReceiver;
                int i251 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i251 + 1;
                iArr210[i251] = 3;
                return 0;
            case 235:
                long[] jArr2 = this.MediaDescriptionCompat;
                int i252 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i252 + 1;
                this.write = jArr2[i252];
                return 0;
            case 236:
                int i253 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i253;
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr23[i253];
                objArr23[i253] = null;
                objArr23[12] = obj7;
                return 0;
            case 237:
                int i254 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i254;
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                Object obj8 = objArr24[i254];
                objArr24[i254] = null;
                objArr24[13] = obj8;
                return 0;
            case 238:
                int i255 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i255;
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                Object obj9 = objArr25[i255];
                objArr25[i255] = null;
                objArr25[14] = obj9;
                return 0;
            case 239:
                int i256 = this.AudioAttributesImplApi21Parcelizer;
                int i257 = i256 - 1;
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                Object obj10 = objArr26[i257];
                objArr26[i257] = null;
                objArr26[15] = obj10;
                this.AudioAttributesImplApi21Parcelizer = i256;
                objArr26[i257] = objArr26[12];
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i258 = this.AudioAttributesImplApi21Parcelizer;
                objArr27[i258] = objArr27[13];
                objArr27[i258 + 1] = objArr27[14];
                this.AudioAttributesImplApi21Parcelizer = i258 + 3;
                objArr27[i258 + 2] = objArr27[15];
                return 0;
            case 241:
                int i259 = this.AudioAttributesImplApi21Parcelizer;
                int i260 = i259 - 1;
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                Object obj11 = objArr28[i260];
                objArr28[i260] = null;
                objArr28[13] = obj11;
                this.AudioAttributesImplApi21Parcelizer = i259;
                objArr28[i260] = objArr28[11];
                return 0;
            case 242:
                int i261 = this.AudioAttributesImplApi21Parcelizer;
                int i262 = i261 - 1;
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                Object obj12 = objArr29[i262];
                objArr29[i262] = null;
                objArr29[14] = obj12;
                this.AudioAttributesImplApi21Parcelizer = i261;
                objArr29[i262] = objArr29[12];
                return 0;
            case 243:
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                int i263 = this.AudioAttributesImplApi21Parcelizer;
                objArr30[i263] = objArr30[13];
                this.AudioAttributesImplApi21Parcelizer = i263 + 2;
                objArr30[i263 + 1] = objArr30[14];
                return 0;
            case 244:
                int[] iArr211 = this.MediaBrowserCompatSearchResultReceiver;
                int i264 = this.AudioAttributesImplApi21Parcelizer;
                iArr211[i264] = 31;
                this.AudioAttributesImplApi21Parcelizer = i264;
                iArr211[i264 - 1] = iArr211[i264 - 1] + iArr211[i264];
                return 0;
            case 245:
                int[] iArr212 = this.MediaBrowserCompatSearchResultReceiver;
                int i265 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i265 + 1;
                iArr212[i265] = 16;
                return 0;
            case 246:
                int[] iArr213 = this.MediaBrowserCompatSearchResultReceiver;
                int i266 = this.AudioAttributesImplApi21Parcelizer;
                iArr213[i266] = 1;
                this.AudioAttributesImplApi21Parcelizer = i266;
                iArr213[i266 - 1] = iArr213[i266 - 1] + iArr213[i266];
                return 0;
            case 247:
                int[] iArr214 = this.MediaBrowserCompatSearchResultReceiver;
                int i267 = this.AudioAttributesImplApi21Parcelizer;
                iArr214[i267] = 119;
                this.AudioAttributesImplApi21Parcelizer = i267;
                iArr214[i267 - 1] = iArr214[i267 - 1] + iArr214[i267];
                return 0;
            case 248:
                int i268 = this.AudioAttributesImplApi21Parcelizer;
                int i269 = i268 - 1;
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                objArr31[i269] = null;
                this.AudioAttributesImplApi21Parcelizer = i268;
                objArr31[i269] = objArr31[11];
                return 0;
            case 249:
                int[] iArr215 = this.MediaBrowserCompatSearchResultReceiver;
                int i270 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i270 + 1;
                iArr215[i270] = 50;
                return 0;
            case 250:
                int i271 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i271;
                int[] iArr216 = this.MediaBrowserCompatSearchResultReceiver;
                iArr216[13] = iArr216[i271];
                return 0;
            case 251:
                int[] iArr217 = this.MediaBrowserCompatSearchResultReceiver;
                int i272 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i272 + 1;
                iArr217[i272] = iArr217[13];
                return 0;
            case 252:
                int i273 = this.AudioAttributesImplApi21Parcelizer;
                int i274 = i273 - 2;
                this.AudioAttributesImplApi21Parcelizer = i274;
                int[] iArr218 = this.MediaBrowserCompatSearchResultReceiver;
                this.RemoteActionCompatParcelizer = iArr218[i274] >= iArr218[i273 - 1] ? 0 : 1;
                return 0;
            case 253:
                int[] iArr219 = this.MediaBrowserCompatSearchResultReceiver;
                iArr219[13] = iArr219[13] + 1;
                return 0;
            case 254:
                int[] iArr220 = this.MediaBrowserCompatSearchResultReceiver;
                int i275 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i275 + 1;
                iArr220[i275] = 4;
                return 0;
            case 255:
                int i276 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr221 = this.MediaBrowserCompatSearchResultReceiver;
                iArr221[i276 - 2] = iArr221[i276 - 2] << iArr221[i276 - 1];
                int i277 = i276 - 2;
                this.AudioAttributesImplApi21Parcelizer = i277;
                this.MediaBrowserCompatMediaItem[i277] = null;
                return 0;
            case 256:
                int[] iArr222 = this.MediaBrowserCompatSearchResultReceiver;
                int i278 = this.AudioAttributesImplApi21Parcelizer;
                iArr222[i278] = 67;
                iArr222[i278 - 1] = iArr222[i278 - 1] + iArr222[i278];
                this.AudioAttributesImplApi21Parcelizer = i278 + 1;
                iArr222[i278] = iArr222[i278 - 1];
                return 0;
            case 257:
                int[] iArr223 = this.MediaBrowserCompatSearchResultReceiver;
                int i279 = this.AudioAttributesImplApi21Parcelizer;
                iArr223[i279] = 1;
                this.AudioAttributesImplApi21Parcelizer = i279;
                iArr223[13] = iArr223[i279];
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                int i280 = this.AudioAttributesImplApi21Parcelizer;
                objArr32[i280] = objArr32[11];
                this.AudioAttributesImplApi21Parcelizer = i280 + 2;
                objArr32[i280 + 1] = objArr32[i280];
                return 0;
            case 259:
                int i281 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i281;
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                Object obj13 = objArr33[i281];
                objArr33[i281] = null;
                this.RemoteActionCompatParcelizer = obj13 == null ? 0 : 1;
                return 0;
            case 260:
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                int i282 = this.AudioAttributesImplApi21Parcelizer;
                objArr34[i282] = objArr34[i282 - 1];
                this.AudioAttributesImplApi21Parcelizer = i282;
                Object obj14 = objArr34[i282];
                objArr34[i282] = null;
                objArr34[12] = obj14;
                return 0;
            case 261:
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                int i283 = this.AudioAttributesImplApi21Parcelizer;
                objArr35[i283] = objArr35[12];
                int[] iArr224 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i283 + 2;
                iArr224[i283 + 1] = 1;
                return 0;
            case 262:
                int[] iArr225 = this.MediaBrowserCompatSearchResultReceiver;
                int i284 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i284 + 1;
                iArr225[i284] = 10;
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                int i285 = this.AudioAttributesImplApi21Parcelizer;
                int i286 = i285 - 1;
                int[] iArr226 = this.MediaBrowserCompatSearchResultReceiver;
                iArr226[14] = iArr226[i286];
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i285;
                objArr36[i286] = objArr36[12];
                return 0;
            case 264:
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                int i287 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i287 + 1;
                objArr37[i287] = objArr37[i287 - 1];
                return 0;
            case 265:
                int i288 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i288;
                Object[] objArr38 = this.MediaBrowserCompatMediaItem;
                Object obj15 = objArr38[i288];
                objArr38[i288] = null;
                objArr38[15] = obj15;
                return 0;
            case 266:
                int[] iArr227 = this.MediaBrowserCompatSearchResultReceiver;
                int i289 = this.AudioAttributesImplApi21Parcelizer;
                iArr227[i289] = iArr227[13];
                Object[] objArr39 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i289 + 2;
                objArr39[i289 + 1] = objArr39[15];
                return 0;
            case 267:
                int[] iArr228 = this.MediaBrowserCompatSearchResultReceiver;
                int i290 = this.AudioAttributesImplApi21Parcelizer;
                iArr228[i290] = iArr228[13];
                this.AudioAttributesImplApi21Parcelizer = i290 + 2;
                iArr228[i290 + 1] = iArr228[14];
                return 0;
            case 268:
                Object[] objArr40 = this.MediaBrowserCompatMediaItem;
                int i291 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i291 + 1;
                objArr40[i291] = objArr40[15];
                return 0;
            case 269:
                int[] iArr229 = this.MediaBrowserCompatSearchResultReceiver;
                int i292 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i292 + 1;
                iArr229[i292] = 105;
                return 0;
            case 270:
                int[] iArr230 = this.MediaBrowserCompatSearchResultReceiver;
                int i293 = this.AudioAttributesImplApi21Parcelizer;
                iArr230[i293] = 0;
                this.AudioAttributesImplApi21Parcelizer = i293 + 2;
                iArr230[i293 + 1] = 1;
                return 0;
            case 271:
                int i294 = this.AudioAttributesImplApi21Parcelizer;
                int i295 = i294 - 1;
                Object[] objArr41 = this.MediaBrowserCompatMediaItem;
                Object obj16 = objArr41[i295];
                objArr41[i295] = null;
                objArr41[12] = obj16;
                this.MediaBrowserCompatSearchResultReceiver[i295] = 0;
                this.AudioAttributesImplApi21Parcelizer = i294 + 1;
                objArr41[i294] = objArr41[11];
                return 0;
            case 272:
                int i296 = this.AudioAttributesImplApi21Parcelizer;
                int i297 = i296 - 3;
                this.AudioAttributesImplApi21Parcelizer = i297;
                Object[] objArr42 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr42[i297];
                objArr42[i297] = null;
                int i298 = this.MediaBrowserCompatSearchResultReceiver[i296 - 2];
                Object obj18 = objArr42[i296 - 1];
                objArr42[i296 - 1] = null;
                ((Object[]) obj17)[i298] = obj18;
                return 0;
            case 273:
                int[] iArr231 = this.MediaBrowserCompatSearchResultReceiver;
                int i299 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i299 + 1;
                iArr231[i299] = 21;
                return 0;
            case 274:
                Object[] objArr43 = this.MediaBrowserCompatMediaItem;
                int i300 = this.AudioAttributesImplApi21Parcelizer;
                objArr43[i300] = objArr43[i300 - 1];
                Object obj19 = objArr43[i300];
                objArr43[i300] = null;
                objArr43[12] = obj19;
                int[] iArr232 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i300 + 1;
                iArr232[i300] = 1;
                return 0;
            case 275:
                Object[] objArr44 = this.MediaBrowserCompatMediaItem;
                int i301 = this.AudioAttributesImplApi21Parcelizer;
                objArr44[i301] = objArr44[12];
                this.MediaBrowserCompatSearchResultReceiver[i301 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i301 + 3;
                objArr44[i301 + 2] = objArr44[11];
                return 0;
            case 276:
                int i302 = this.AudioAttributesImplApi21Parcelizer;
                int i303 = i302 - 1;
                Object[] objArr45 = this.MediaBrowserCompatMediaItem;
                Object obj20 = objArr45[i303];
                objArr45[i303] = null;
                objArr45[13] = obj20;
                int[] iArr233 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i302;
                iArr233[i303] = iArr233[12];
                return 0;
            case 277:
                this.RatingCompat[this.AudioAttributesImplApi21Parcelizer - 1] = this.MediaBrowserCompatSearchResultReceiver[r3 - 1];
                return 0;
            case 278:
                Object[] objArr46 = this.MediaBrowserCompatMediaItem;
                int i304 = this.AudioAttributesImplApi21Parcelizer;
                objArr46[i304] = objArr46[13];
                this.AudioAttributesImplApi21Parcelizer = i304 + 2;
                objArr46[i304 + 1] = null;
                return 0;
            case 279:
                Object[] objArr47 = this.MediaBrowserCompatMediaItem;
                int i305 = this.AudioAttributesImplApi21Parcelizer;
                objArr47[i305] = objArr47[13];
                float[] fArr4 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i305 + 2;
                fArr4[i305 + 1] = 0.0f;
                return 0;
            case 280:
                int[] iArr234 = this.MediaBrowserCompatSearchResultReceiver;
                int i306 = this.AudioAttributesImplApi21Parcelizer;
                iArr234[i306] = 0;
                Object[] objArr48 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i306 + 2;
                objArr48[i306 + 1] = objArr48[11];
                return 0;
            case 281:
                Object[] objArr49 = this.MediaBrowserCompatMediaItem;
                int i307 = this.AudioAttributesImplApi21Parcelizer;
                objArr49[i307] = objArr49[12];
                this.MediaBrowserCompatSearchResultReceiver[i307 + 1] = 1;
                this.AudioAttributesImplApi21Parcelizer = i307 + 3;
                objArr49[i307 + 2] = objArr49[11];
                return 0;
            case 282:
                int i308 = this.AudioAttributesImplApi21Parcelizer;
                int i309 = i308 - 3;
                this.AudioAttributesImplApi21Parcelizer = i309;
                Object[] objArr50 = this.MediaBrowserCompatMediaItem;
                Object obj21 = objArr50[i309];
                objArr50[i309] = null;
                int i310 = this.MediaBrowserCompatSearchResultReceiver[i308 - 2];
                Object obj22 = objArr50[i308 - 1];
                objArr50[i308 - 1] = null;
                ((Object[]) obj21)[i310] = obj22;
                this.AudioAttributesImplApi21Parcelizer = i308 - 2;
                objArr50[i309] = objArr50[12];
                return 0;
            case 283:
                int[] iArr235 = this.MediaBrowserCompatSearchResultReceiver;
                int i311 = this.AudioAttributesImplApi21Parcelizer;
                iArr235[i311] = 91;
                iArr235[i311 - 1] = iArr235[i311 - 1] + iArr235[i311];
                this.AudioAttributesImplApi21Parcelizer = i311 + 1;
                iArr235[i311] = iArr235[i311 - 1];
                return 0;
            case 284:
                float[] fArr5 = this.RatingCompat;
                int i312 = this.AudioAttributesImplApi21Parcelizer;
                fArr5[i312 - 1] = this.MediaBrowserCompatSearchResultReceiver[i312 - 1];
                fArr5[i312] = fArr5[i312 - 1];
                this.AudioAttributesImplApi21Parcelizer = i312;
                fArr5[13] = fArr5[i312];
                return 0;
            case 285:
                float[] fArr6 = this.RatingCompat;
                int i313 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i313 + 1;
                fArr6[i313] = this.read;
                return 0;
            case 286:
                int i314 = this.AudioAttributesImplApi21Parcelizer;
                int i315 = i314 - 1;
                this.AudioAttributesImplApi21Parcelizer = i315;
                float[] fArr7 = this.RatingCompat;
                fArr7[i314 - 2] = fArr7[i314 - 2] / fArr7[i315];
                return 0;
            case 287:
                int i316 = this.AudioAttributesImplApi21Parcelizer;
                int i317 = i316 - 1;
                float[] fArr8 = this.RatingCompat;
                fArr8[14] = fArr8[i317];
                this.AudioAttributesImplApi21Parcelizer = i316;
                fArr8[i317] = fArr8[12];
                return 0;
            case 288:
                int i318 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i318;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[i318] >= 0 ? 0 : 1;
                return 0;
            case 289:
                float[] fArr9 = this.RatingCompat;
                int i319 = this.AudioAttributesImplApi21Parcelizer;
                fArr9[i319] = fArr9[14];
                this.AudioAttributesImplApi21Parcelizer = i319;
                this.MediaBrowserCompatSearchResultReceiver[i319 - 1] = (fArr9[i319 - 1] > fArr9[i319] ? 1 : (fArr9[i319 - 1] == fArr9[i319] ? 0 : -1));
                return 0;
            case 290:
                float[] fArr10 = this.RatingCompat;
                int i320 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i320 + 1;
                fArr10[i320] = fArr10[13];
                return 0;
            case 291:
                int i321 = this.AudioAttributesImplApi21Parcelizer;
                int i322 = i321 - 1;
                this.AudioAttributesImplApi21Parcelizer = i322;
                float[] fArr11 = this.RatingCompat;
                fArr11[i321 - 2] = fArr11[i321 - 2] - fArr11[i322];
                return 0;
            case 292:
                int[] iArr236 = this.MediaBrowserCompatSearchResultReceiver;
                int i323 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i323 + 1;
                iArr236[i323] = 123;
                return 0;
            case 293:
                int[] iArr237 = this.MediaBrowserCompatSearchResultReceiver;
                int i324 = this.AudioAttributesImplApi21Parcelizer;
                iArr237[i324] = 57;
                iArr237[i324 - 1] = iArr237[i324 - 1] + iArr237[i324];
                this.AudioAttributesImplApi21Parcelizer = i324 + 1;
                iArr237[i324] = iArr237[i324 - 1];
                return 0;
            case 294:
                int[] iArr238 = this.MediaBrowserCompatSearchResultReceiver;
                int i325 = this.AudioAttributesImplApi21Parcelizer;
                iArr238[i325] = 34;
                this.AudioAttributesImplApi21Parcelizer = i325 + 2;
                iArr238[i325 + 1] = 0;
                return 0;
            case 295:
                int[] iArr239 = this.MediaBrowserCompatSearchResultReceiver;
                int i326 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i326 + 1;
                iArr239[i326] = 6;
                return 0;
            case 296:
                int[] iArr240 = this.MediaBrowserCompatSearchResultReceiver;
                int i327 = this.AudioAttributesImplApi21Parcelizer;
                iArr240[i327] = 81;
                this.AudioAttributesImplApi21Parcelizer = i327 + 2;
                iArr240[i327 + 1] = 0;
                return 0;
            case 297:
                int[] iArr241 = this.MediaBrowserCompatSearchResultReceiver;
                int i328 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i328 + 1;
                iArr241[i328] = 96;
                return 0;
            case 298:
                int[] iArr242 = this.MediaBrowserCompatSearchResultReceiver;
                int i329 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i329 + 1;
                iArr242[i329] = 74;
                return 0;
            case 299:
                int[] iArr243 = this.MediaBrowserCompatSearchResultReceiver;
                int i330 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i330 + 1;
                iArr243[i330] = 40;
                return 0;
            case 300:
                Object[] objArr51 = this.MediaBrowserCompatMediaItem;
                int i331 = this.AudioAttributesImplApi21Parcelizer;
                objArr51[i331] = objArr51[12];
                int[] iArr244 = this.MediaBrowserCompatSearchResultReceiver;
                iArr244[i331 + 1] = iArr244[13];
                this.AudioAttributesImplApi21Parcelizer = i331 + 3;
                iArr244[i331 + 2] = 1;
                return 0;
            case 301:
                int i332 = this.AudioAttributesImplApi21Parcelizer;
                int i333 = i332 - 1;
                this.AudioAttributesImplApi21Parcelizer = i333;
                int[] iArr245 = this.MediaBrowserCompatSearchResultReceiver;
                iArr245[i332 - 2] = iArr245[i332 - 2] ^ iArr245[i333];
                return 0;
            case 302:
                int i334 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i334;
                float[] fArr12 = this.RatingCompat;
                fArr12[13] = fArr12[i334];
                return 0;
            case 303:
                float[] fArr13 = this.RatingCompat;
                int i335 = this.AudioAttributesImplApi21Parcelizer;
                fArr13[i335] = 1.0f;
                this.AudioAttributesImplApi21Parcelizer = i335;
                fArr13[13] = fArr13[i335];
                return 0;
            case 304:
                Object[] objArr52 = this.MediaBrowserCompatMediaItem;
                int i336 = this.AudioAttributesImplApi21Parcelizer;
                objArr52[i336] = objArr52[12];
                float[] fArr14 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i336 + 2;
                fArr14[i336 + 1] = fArr14[13];
                return 0;
            case 305:
                int[] iArr246 = this.MediaBrowserCompatSearchResultReceiver;
                int i337 = this.AudioAttributesImplApi21Parcelizer;
                iArr246[i337] = iArr246[14];
                Object[] objArr53 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i337 + 2;
                objArr53[i337 + 1] = objArr53[11];
                return 0;
            case 306:
                int i338 = this.AudioAttributesImplApi21Parcelizer;
                int i339 = i338 - 1;
                this.AudioAttributesImplApi21Parcelizer = i339;
                int[] iArr247 = this.MediaBrowserCompatSearchResultReceiver;
                iArr247[i338 - 2] = iArr247[i338 - 2] - iArr247[i339];
                return 0;
            case 307:
                int i340 = this.AudioAttributesImplApi21Parcelizer;
                int i341 = i340 - 2;
                this.AudioAttributesImplApi21Parcelizer = i341;
                int[] iArr248 = this.MediaBrowserCompatSearchResultReceiver;
                this.RemoteActionCompatParcelizer = iArr248[i341] != iArr248[i340 - 1] ? 0 : 1;
                return 0;
            case 308:
                int[] iArr249 = this.MediaBrowserCompatSearchResultReceiver;
                int i342 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i342 + 1;
                iArr249[i342] = iArr249[15];
                return 0;
            case 309:
                int[] iArr250 = this.MediaBrowserCompatSearchResultReceiver;
                int i343 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i343 + 1;
                iArr250[i343] = 54;
                return 0;
            case 310:
                int[] iArr251 = this.MediaBrowserCompatSearchResultReceiver;
                int i344 = this.AudioAttributesImplApi21Parcelizer;
                iArr251[i344] = 105;
                iArr251[i344 - 1] = iArr251[i344 - 1] + iArr251[i344];
                this.AudioAttributesImplApi21Parcelizer = i344 + 1;
                iArr251[i344] = iArr251[i344 - 1];
                return 0;
            case 311:
                int[] iArr252 = this.MediaBrowserCompatSearchResultReceiver;
                int i345 = this.AudioAttributesImplApi21Parcelizer;
                iArr252[i345] = 0;
                this.AudioAttributesImplApi21Parcelizer = i345 + 2;
                iArr252[i345 + 1] = 0;
                return 0;
            case 312:
                int[] iArr253 = this.MediaBrowserCompatSearchResultReceiver;
                int i346 = this.AudioAttributesImplApi21Parcelizer;
                iArr253[i346] = 109;
                this.AudioAttributesImplApi21Parcelizer = i346;
                iArr253[i346 - 1] = iArr253[i346 - 1] + iArr253[i346];
                return 0;
            case 313:
                int[] iArr254 = this.MediaBrowserCompatSearchResultReceiver;
                int i347 = this.AudioAttributesImplApi21Parcelizer;
                iArr254[i347] = 95;
                this.AudioAttributesImplApi21Parcelizer = i347;
                iArr254[i347 - 1] = iArr254[i347 - 1] + iArr254[i347];
                return 0;
            case 314:
                int[] iArr255 = this.MediaBrowserCompatSearchResultReceiver;
                int i348 = this.AudioAttributesImplApi21Parcelizer;
                iArr255[i348] = 13;
                iArr255[i348 - 1] = iArr255[i348 - 1] + iArr255[i348];
                this.AudioAttributesImplApi21Parcelizer = i348 + 1;
                iArr255[i348] = iArr255[i348 - 1];
                return 0;
            case 315:
                int i349 = this.AudioAttributesImplApi21Parcelizer;
                int i350 = i349 - 2;
                this.AudioAttributesImplApi21Parcelizer = i350;
                int[] iArr256 = this.MediaBrowserCompatSearchResultReceiver;
                this.RemoteActionCompatParcelizer = iArr256[i350] <= iArr256[i349 - 1] ? 0 : 1;
                return 0;
            case 316:
                int i351 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i351;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver[i351] <= 0 ? 0 : 1;
                return 0;
            case 317:
                Object[] objArr54 = this.MediaBrowserCompatMediaItem;
                int i352 = this.AudioAttributesImplApi21Parcelizer;
                objArr54[i352] = objArr54[12];
                this.AudioAttributesImplApi21Parcelizer = i352 + 2;
                objArr54[i352 + 1] = objArr54[i352];
                return 0;
            case 318:
                int[] iArr257 = this.MediaBrowserCompatSearchResultReceiver;
                int i353 = this.AudioAttributesImplApi21Parcelizer;
                iArr257[i353] = 69;
                iArr257[i353 - 1] = iArr257[i353 - 1] + iArr257[i353];
                this.AudioAttributesImplApi21Parcelizer = i353 + 1;
                iArr257[i353] = iArr257[i353 - 1];
                return 0;
            case 319:
                int[] iArr258 = this.MediaBrowserCompatSearchResultReceiver;
                int i354 = this.AudioAttributesImplApi21Parcelizer;
                iArr258[i354] = 119;
                iArr258[i354 - 1] = iArr258[i354 - 1] + iArr258[i354];
                this.AudioAttributesImplApi21Parcelizer = i354 + 1;
                iArr258[i354] = iArr258[i354 - 1];
                return 0;
            case 320:
                int[] iArr259 = this.MediaBrowserCompatSearchResultReceiver;
                int i355 = this.AudioAttributesImplApi21Parcelizer;
                iArr259[i355] = 117;
                iArr259[i355 - 1] = iArr259[i355 - 1] + iArr259[i355];
                this.AudioAttributesImplApi21Parcelizer = i355 + 1;
                iArr259[i355] = iArr259[i355 - 1];
                return 0;
            case 321:
                int[] iArr260 = this.MediaBrowserCompatSearchResultReceiver;
                int i356 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i356 + 1;
                iArr260[i356] = 56;
                return 0;
            case 322:
                int[] iArr261 = this.MediaBrowserCompatSearchResultReceiver;
                int i357 = this.AudioAttributesImplApi21Parcelizer;
                iArr261[i357] = iArr261[12];
                this.AudioAttributesImplApi21Parcelizer = i357 + 2;
                iArr261[i357 + 1] = -1;
                return 0;
            case 323:
                int i358 = this.AudioAttributesImplApi21Parcelizer;
                int i359 = i358 - 2;
                this.AudioAttributesImplApi21Parcelizer = i359;
                int[] iArr262 = this.MediaBrowserCompatSearchResultReceiver;
                this.RemoteActionCompatParcelizer = iArr262[i359] == iArr262[i358 - 1] ? 0 : 1;
                return 0;
            case 324:
                int[] iArr263 = this.MediaBrowserCompatSearchResultReceiver;
                int i360 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i360 + 1;
                iArr263[i360] = 3;
                return 0;
            case 325:
                int[] iArr264 = this.MediaBrowserCompatSearchResultReceiver;
                int i361 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i361 + 1;
                iArr264[i361] = -3;
                return 0;
            case 326:
                int i362 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i362;
                int[] iArr265 = this.MediaBrowserCompatSearchResultReceiver;
                iArr265[12] = iArr265[i362];
                return 0;
            case 327:
                int[] iArr266 = this.MediaBrowserCompatSearchResultReceiver;
                int i363 = this.AudioAttributesImplApi21Parcelizer;
                iArr266[i363] = iArr266[12];
                this.AudioAttributesImplApi21Parcelizer = i363 + 2;
                iArr266[i363 + 1] = iArr266[13];
                return 0;
            case 328:
                int[] iArr267 = this.MediaBrowserCompatSearchResultReceiver;
                int i364 = this.AudioAttributesImplApi21Parcelizer;
                iArr267[i364] = 31;
                iArr267[i364 - 1] = iArr267[i364 - 1] + iArr267[i364];
                this.AudioAttributesImplApi21Parcelizer = i364 + 1;
                iArr267[i364] = iArr267[i364 - 1];
                return 0;
            case 329:
                int[] iArr268 = this.MediaBrowserCompatSearchResultReceiver;
                int i365 = this.AudioAttributesImplApi21Parcelizer;
                iArr268[i365] = 79;
                iArr268[i365 - 1] = iArr268[i365 - 1] + iArr268[i365];
                this.AudioAttributesImplApi21Parcelizer = i365 + 1;
                iArr268[i365] = iArr268[i365 - 1];
                return 0;
            case 330:
                int[] iArr269 = this.MediaBrowserCompatSearchResultReceiver;
                int i366 = this.AudioAttributesImplApi21Parcelizer;
                iArr269[i366] = 123;
                iArr269[i366 - 1] = iArr269[i366 - 1] + iArr269[i366];
                this.AudioAttributesImplApi21Parcelizer = i366 + 1;
                iArr269[i366] = iArr269[i366 - 1];
                return 0;
            case 331:
                int[] iArr270 = this.MediaBrowserCompatSearchResultReceiver;
                int i367 = this.AudioAttributesImplApi21Parcelizer;
                iArr270[i367] = 35;
                this.AudioAttributesImplApi21Parcelizer = i367 + 2;
                iArr270[i367 + 1] = 0;
                return 0;
            case 332:
                int[] iArr271 = this.MediaBrowserCompatSearchResultReceiver;
                int i368 = this.AudioAttributesImplApi21Parcelizer;
                iArr271[i368] = 53;
                this.AudioAttributesImplApi21Parcelizer = i368;
                iArr271[i368 - 1] = iArr271[i368 - 1] + iArr271[i368];
                return 0;
            case 333:
                int[] iArr272 = this.MediaBrowserCompatSearchResultReceiver;
                int i369 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i369 + 1;
                iArr272[i369] = 61;
                return 0;
            case 334:
                int[] iArr273 = this.MediaBrowserCompatSearchResultReceiver;
                int i370 = this.AudioAttributesImplApi21Parcelizer;
                iArr273[i370] = 103;
                iArr273[i370 - 1] = iArr273[i370 - 1] + iArr273[i370];
                this.AudioAttributesImplApi21Parcelizer = i370 + 1;
                iArr273[i370] = iArr273[i370 - 1];
                return 0;
            case 335:
                int[] iArr274 = this.MediaBrowserCompatSearchResultReceiver;
                int i371 = this.AudioAttributesImplApi21Parcelizer;
                iArr274[i371] = 53;
                this.AudioAttributesImplApi21Parcelizer = i371 + 2;
                iArr274[i371 + 1] = 0;
                return 0;
            case 336:
                int[] iArr275 = this.MediaBrowserCompatSearchResultReceiver;
                int i372 = this.AudioAttributesImplApi21Parcelizer;
                iArr275[i372] = 93;
                iArr275[i372 + 1] = 0;
                int i373 = i372 + 1;
                this.AudioAttributesImplApi21Parcelizer = i373;
                iArr275[i372] = iArr275[i372] / iArr275[i373];
                return 0;
            case 337:
                int[] iArr276 = this.MediaBrowserCompatSearchResultReceiver;
                int i374 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i374 + 1;
                iArr276[i374] = 82;
                return 0;
            case 338:
                int[] iArr277 = this.MediaBrowserCompatSearchResultReceiver;
                int i375 = this.AudioAttributesImplApi21Parcelizer;
                iArr277[i375] = 115;
                this.AudioAttributesImplApi21Parcelizer = i375;
                iArr277[i375 - 1] = iArr277[i375 - 1] + iArr277[i375];
                return 0;
            case 339:
                int[] iArr278 = this.MediaBrowserCompatSearchResultReceiver;
                int i376 = this.AudioAttributesImplApi21Parcelizer;
                iArr278[i376] = 63;
                this.AudioAttributesImplApi21Parcelizer = i376;
                iArr278[i376 - 1] = iArr278[i376 - 1] + iArr278[i376];
                return 0;
            case 340:
                int[] iArr279 = this.MediaBrowserCompatSearchResultReceiver;
                int i377 = this.AudioAttributesImplApi21Parcelizer;
                iArr279[i377] = 33;
                this.AudioAttributesImplApi21Parcelizer = i377;
                iArr279[i377 - 1] = iArr279[i377 - 1] + iArr279[i377];
                return 0;
            case 341:
                int i378 = this.AudioAttributesImplApi21Parcelizer;
                int i379 = i378 - 2;
                this.AudioAttributesImplApi21Parcelizer = i379;
                Object[] objArr55 = this.MediaBrowserCompatMediaItem;
                Object obj23 = objArr55[i379];
                objArr55[i379] = null;
                Object obj24 = objArr55[i378 - 1];
                objArr55[i378 - 1] = null;
                this.RemoteActionCompatParcelizer = obj23 != obj24 ? 0 : 1;
                return 0;
            case 342:
                int[] iArr280 = this.MediaBrowserCompatSearchResultReceiver;
                int i380 = this.AudioAttributesImplApi21Parcelizer;
                iArr280[i380] = 49;
                iArr280[i380 - 1] = iArr280[i380 - 1] + iArr280[i380];
                this.AudioAttributesImplApi21Parcelizer = i380 + 1;
                iArr280[i380] = iArr280[i380 - 1];
                return 0;
            case 343:
                int[] iArr281 = this.MediaBrowserCompatSearchResultReceiver;
                int i381 = this.AudioAttributesImplApi21Parcelizer;
                iArr281[i381] = 63;
                iArr281[i381 + 1] = 0;
                int i382 = i381 + 1;
                this.AudioAttributesImplApi21Parcelizer = i382;
                iArr281[i381] = iArr281[i381] / iArr281[i382];
                return 0;
            case 344:
                Object[] objArr56 = this.MediaBrowserCompatMediaItem;
                int i383 = this.AudioAttributesImplApi21Parcelizer;
                objArr56[i383] = objArr56[i383 - 1];
                this.AudioAttributesImplApi21Parcelizer = i383;
                Object obj25 = objArr56[i383];
                objArr56[i383] = null;
                objArr56[13] = obj25;
                return 0;
            case 345:
                int[] iArr282 = this.MediaBrowserCompatSearchResultReceiver;
                int i384 = this.AudioAttributesImplApi21Parcelizer;
                iArr282[i384] = 0;
                Object[] objArr57 = this.MediaBrowserCompatMediaItem;
                objArr57[i384 + 1] = objArr57[12];
                int i385 = i384 - 1;
                this.AudioAttributesImplApi21Parcelizer = i385;
                Object obj26 = objArr57[i385];
                objArr57[i385] = null;
                int i386 = iArr282[i384];
                Object obj27 = objArr57[i384 + 1];
                objArr57[i384 + 1] = null;
                ((Object[]) obj26)[i386] = obj27;
                return 0;
            case 346:
                int i387 = this.AudioAttributesImplApi21Parcelizer;
                int i388 = i387 - 1;
                Object[] objArr58 = this.MediaBrowserCompatMediaItem;
                Object obj28 = objArr58[i388];
                objArr58[i388] = null;
                objArr58[12] = obj28;
                int[] iArr283 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i387;
                iArr283[i388] = 1;
                return 0;
            case 347:
                int[] iArr284 = this.MediaBrowserCompatSearchResultReceiver;
                int i389 = this.AudioAttributesImplApi21Parcelizer;
                iArr284[i389] = 98;
                this.AudioAttributesImplApi21Parcelizer = i389 + 2;
                iArr284[i389 + 1] = 0;
                return 0;
            case 348:
                int i390 = this.AudioAttributesImplApi21Parcelizer;
                int i391 = i390 - 1;
                Object[] objArr59 = this.MediaBrowserCompatMediaItem;
                Object obj29 = objArr59[i391];
                objArr59[i391] = null;
                objArr59[13] = obj29;
                this.MediaBrowserCompatSearchResultReceiver[i391] = 0;
                this.AudioAttributesImplApi21Parcelizer = i390 + 1;
                objArr59[i390] = objArr59[12];
                return 0;
            case 349:
                int i392 = this.AudioAttributesImplApi21Parcelizer;
                int i393 = i392 - 3;
                this.AudioAttributesImplApi21Parcelizer = i393;
                Object[] objArr60 = this.MediaBrowserCompatMediaItem;
                Object obj30 = objArr60[i393];
                objArr60[i393] = null;
                int i394 = this.MediaBrowserCompatSearchResultReceiver[i392 - 2];
                Object obj31 = objArr60[i392 - 1];
                objArr60[i392 - 1] = null;
                ((Object[]) obj30)[i394] = obj31;
                this.AudioAttributesImplApi21Parcelizer = i392 - 2;
                objArr60[i393] = objArr60[11];
                return 0;
            case 350:
                int[] iArr285 = this.MediaBrowserCompatSearchResultReceiver;
                int i395 = this.AudioAttributesImplApi21Parcelizer;
                iArr285[i395] = 42;
                iArr285[i395 + 1] = 0;
                int i396 = i395 + 1;
                this.AudioAttributesImplApi21Parcelizer = i396;
                iArr285[i395] = iArr285[i395] / iArr285[i396];
                return 0;
            case 351:
                int[] iArr286 = this.MediaBrowserCompatSearchResultReceiver;
                int i397 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i397 + 1;
                iArr286[i397] = 38;
                return 0;
            case 352:
                int i398 = this.AudioAttributesImplApi21Parcelizer;
                int i399 = i398 - 1;
                Object[] objArr61 = this.MediaBrowserCompatMediaItem;
                Object obj32 = objArr61[i399];
                objArr61[i399] = null;
                objArr61[12] = obj32;
                this.AudioAttributesImplApi21Parcelizer = i398;
                objArr61[i399] = objArr61[13];
                return 0;
            case 353:
                int[] iArr287 = this.MediaBrowserCompatSearchResultReceiver;
                int i400 = this.AudioAttributesImplApi21Parcelizer;
                iArr287[i400] = 68;
                this.AudioAttributesImplApi21Parcelizer = i400 + 2;
                iArr287[i400 + 1] = 0;
                return 0;
            case 354:
                int i401 = this.AudioAttributesImplApi21Parcelizer;
                int i402 = i401 - 1;
                int[] iArr288 = this.MediaBrowserCompatSearchResultReceiver;
                iArr288[13] = iArr288[i402];
                Object[] objArr62 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i401;
                objArr62[i402] = objArr62[12];
                return 0;
            case 355:
                int i403 = this.AudioAttributesImplApi21Parcelizer;
                int i404 = i403 - 1;
                Object[] objArr63 = this.MediaBrowserCompatMediaItem;
                Object obj33 = objArr63[i404];
                objArr63[i404] = null;
                objArr63[14] = obj33;
                this.AudioAttributesImplApi21Parcelizer = i403;
                objArr63[i404] = objArr63[13];
                return 0;
            case 356:
                int i405 = this.AudioAttributesImplApi21Parcelizer;
                int i406 = i405 - 1;
                int[] iArr289 = this.MediaBrowserCompatSearchResultReceiver;
                iArr289[13] = iArr289[i406];
                Object[] objArr64 = this.MediaBrowserCompatMediaItem;
                objArr64[i406] = objArr64[12];
                this.AudioAttributesImplApi21Parcelizer = i405 + 1;
                objArr64[i405] = objArr64[14];
                return 0;
            case 357:
                int[] iArr290 = this.MediaBrowserCompatSearchResultReceiver;
                int i407 = this.AudioAttributesImplApi21Parcelizer;
                iArr290[i407] = iArr290[12];
                this.AudioAttributesImplApi21Parcelizer = i407 + 2;
                iArr290[i407 + 1] = 1000;
                return 0;
            case 358:
                int i408 = this.AudioAttributesImplApi21Parcelizer;
                int i409 = i408 - 1;
                this.AudioAttributesImplApi21Parcelizer = i409;
                int[] iArr291 = this.MediaBrowserCompatSearchResultReceiver;
                iArr291[i408 - 2] = iArr291[i408 - 2] * iArr291[i409];
                this.MediaDescriptionCompat[i408 - 2] = iArr291[i408 - 2];
                return 0;
            case 359:
                int[] iArr292 = this.MediaBrowserCompatSearchResultReceiver;
                int i410 = this.AudioAttributesImplApi21Parcelizer;
                iArr292[i410] = 117;
                this.AudioAttributesImplApi21Parcelizer = i410;
                iArr292[i410 - 1] = iArr292[i410 - 1] + iArr292[i410];
                return 0;
            case 360:
                int i411 = this.AudioAttributesImplApi21Parcelizer;
                int i412 = i411 - 1;
                int[] iArr293 = this.MediaBrowserCompatSearchResultReceiver;
                iArr293[12] = iArr293[i412];
                Object[] objArr65 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i411;
                objArr65[i412] = objArr65[11];
                return 0;
            case 361:
                int[] iArr294 = this.MediaBrowserCompatSearchResultReceiver;
                int i413 = this.AudioAttributesImplApi21Parcelizer;
                iArr294[i413] = 11;
                this.AudioAttributesImplApi21Parcelizer = i413;
                iArr294[i413 - 1] = iArr294[i413 - 1] + iArr294[i413];
                return 0;
            case 362:
                int[] iArr295 = this.MediaBrowserCompatSearchResultReceiver;
                int i414 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i414 + 1;
                iArr295[i414] = 47;
                return 0;
            case 363:
                int[] iArr296 = this.MediaBrowserCompatSearchResultReceiver;
                int i415 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i415 + 1;
                iArr296[i415] = -1;
                return 0;
            case 364:
                int[] iArr297 = this.MediaBrowserCompatSearchResultReceiver;
                int i416 = this.AudioAttributesImplApi21Parcelizer;
                iArr297[i416] = 5;
                this.AudioAttributesImplApi21Parcelizer = i416 + 2;
                iArr297[i416 + 1] = 4;
                return 0;
            case 365:
                int i417 = this.AudioAttributesImplApi21Parcelizer;
                int i418 = i417 - 1;
                this.AudioAttributesImplApi21Parcelizer = i418;
                int[] iArr298 = this.MediaBrowserCompatSearchResultReceiver;
                iArr298[i417 - 2] = iArr298[i417 - 2] >> iArr298[i418];
                return 0;
            case 366:
                int[] iArr299 = this.MediaBrowserCompatSearchResultReceiver;
                int i419 = this.AudioAttributesImplApi21Parcelizer;
                iArr299[i419] = 3;
                this.AudioAttributesImplApi21Parcelizer = i419;
                iArr299[i419 - 1] = iArr299[i419 - 1] + iArr299[i419];
                return 0;
            case 367:
                int[] iArr300 = this.MediaBrowserCompatSearchResultReceiver;
                int i420 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i420 + 1;
                iArr300[i420] = 76;
                return 0;
            case 368:
                int[] iArr301 = this.MediaBrowserCompatSearchResultReceiver;
                int i421 = this.AudioAttributesImplApi21Parcelizer;
                iArr301[i421] = 59;
                this.AudioAttributesImplApi21Parcelizer = i421;
                iArr301[i421 - 1] = iArr301[i421 - 1] + iArr301[i421];
                return 0;
            case 369:
                int[] iArr302 = this.MediaBrowserCompatSearchResultReceiver;
                int i422 = this.AudioAttributesImplApi21Parcelizer;
                iArr302[i422] = 65;
                iArr302[i422 - 1] = iArr302[i422 - 1] + iArr302[i422];
                this.AudioAttributesImplApi21Parcelizer = i422 + 1;
                iArr302[i422] = iArr302[i422 - 1];
                return 0;
            case 370:
                Object[] objArr66 = this.MediaBrowserCompatMediaItem;
                int i423 = this.AudioAttributesImplApi21Parcelizer;
                objArr66[i423] = objArr66[12];
                int[] iArr303 = this.MediaBrowserCompatSearchResultReceiver;
                iArr303[i423 + 1] = iArr303[13];
                this.AudioAttributesImplApi21Parcelizer = i423 + 3;
                objArr66[i423 + 2] = objArr66[14];
                return 0;
            case 371:
                int[] iArr304 = this.MediaBrowserCompatSearchResultReceiver;
                int i424 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i424 + 1;
                iArr304[i424] = 5;
                return 0;
            case 372:
                float[] fArr15 = this.RatingCompat;
                int i425 = this.AudioAttributesImplApi21Parcelizer;
                fArr15[i425] = 0.0f;
                Object[] objArr67 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i425 + 2;
                objArr67[i425 + 1] = objArr67[11];
                return 0;
            case 373:
                this.MediaDescriptionCompat[this.AudioAttributesImplApi21Parcelizer - 1] = this.MediaBrowserCompatSearchResultReceiver[r3 - 1];
                return 0;
            case 374:
                float[] fArr16 = this.RatingCompat;
                int i426 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i426 + 1;
                fArr16[i426] = 0.0f;
                return 0;
            case 375:
                int i427 = this.AudioAttributesImplApi21Parcelizer;
                int i428 = i427 - 1;
                Object[] objArr68 = this.MediaBrowserCompatMediaItem;
                Object obj34 = objArr68[i428];
                objArr68[i428] = null;
                objArr68[12] = obj34;
                this.AudioAttributesImplApi21Parcelizer = i427;
                objArr68[i428] = objArr68[11];
                return 0;
            case 376:
                int[] iArr305 = this.MediaBrowserCompatSearchResultReceiver;
                int i429 = this.AudioAttributesImplApi21Parcelizer;
                iArr305[i429] = 37;
                this.AudioAttributesImplApi21Parcelizer = i429;
                iArr305[i429 - 1] = iArr305[i429 - 1] + iArr305[i429];
                return 0;
            case 377:
                int[] iArr306 = this.MediaBrowserCompatSearchResultReceiver;
                int i430 = this.AudioAttributesImplApi21Parcelizer;
                iArr306[i430] = 90;
                this.AudioAttributesImplApi21Parcelizer = i430 + 2;
                iArr306[i430 + 1] = 0;
                return 0;
            case 378:
                int[] iArr307 = this.MediaBrowserCompatSearchResultReceiver;
                int i431 = this.AudioAttributesImplApi21Parcelizer;
                iArr307[i431] = 0;
                this.AudioAttributesImplApi21Parcelizer = i431;
                iArr307[12] = iArr307[i431];
                return 0;
            case 379:
                int[] iArr308 = this.MediaBrowserCompatSearchResultReceiver;
                int i432 = this.AudioAttributesImplApi21Parcelizer;
                iArr308[i432] = 125;
                iArr308[i432 - 1] = iArr308[i432 - 1] + iArr308[i432];
                this.AudioAttributesImplApi21Parcelizer = i432 + 1;
                iArr308[i432] = iArr308[i432 - 1];
                return 0;
            case 380:
                int i433 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i433;
                int[] iArr309 = this.MediaBrowserCompatSearchResultReceiver;
                iArr309[15] = iArr309[i433];
                return 0;
            case 381:
                int[] iArr310 = this.MediaBrowserCompatSearchResultReceiver;
                int i434 = this.AudioAttributesImplApi21Parcelizer;
                iArr310[i434] = -1;
                this.AudioAttributesImplApi21Parcelizer = i434;
                iArr310[14] = iArr310[i434];
                return 0;
            case 382:
                int i435 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i435;
                int[] iArr311 = this.MediaBrowserCompatSearchResultReceiver;
                iArr311[14] = iArr311[i435];
                return 0;
            case 383:
                int[] iArr312 = this.MediaBrowserCompatSearchResultReceiver;
                int i436 = this.AudioAttributesImplApi21Parcelizer;
                iArr312[i436] = 1;
                this.AudioAttributesImplApi21Parcelizer = i436;
                iArr312[14] = iArr312[i436];
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                int[] iArr313 = this.MediaBrowserCompatSearchResultReceiver;
                int i437 = this.AudioAttributesImplApi21Parcelizer;
                iArr313[i437] = 0;
                this.AudioAttributesImplApi21Parcelizer = i437;
                iArr313[14] = iArr313[i437];
                return 0;
            case 385:
                int[] iArr314 = this.MediaBrowserCompatSearchResultReceiver;
                int i438 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i438 + 1;
                iArr314[i438] = iArr314[14];
                return 0;
            case 386:
                int[] iArr315 = this.MediaBrowserCompatSearchResultReceiver;
                int i439 = this.AudioAttributesImplApi21Parcelizer;
                iArr315[i439] = 5;
                iArr315[i439 + 1] = 2;
                int i440 = i439 + 1;
                this.AudioAttributesImplApi21Parcelizer = i440;
                iArr315[i439] = iArr315[i439] / iArr315[i440];
                return 0;
            case 387:
                int[] iArr316 = this.MediaBrowserCompatSearchResultReceiver;
                int i441 = this.AudioAttributesImplApi21Parcelizer;
                iArr316[i441] = 4;
                this.AudioAttributesImplApi21Parcelizer = i441;
                iArr316[14] = iArr316[i441];
                return 0;
            case 388:
                int[] iArr317 = this.MediaBrowserCompatSearchResultReceiver;
                int i442 = this.AudioAttributesImplApi21Parcelizer;
                iArr317[i442] = 27;
                iArr317[i442 - 1] = iArr317[i442 - 1] + iArr317[i442];
                this.AudioAttributesImplApi21Parcelizer = i442 + 1;
                iArr317[i442] = iArr317[i442 - 1];
                return 0;
            case 389:
                int i443 = this.AudioAttributesImplApi21Parcelizer;
                int i444 = i443 - 1;
                Object[] objArr69 = this.MediaBrowserCompatMediaItem;
                Object obj35 = objArr69[i444];
                objArr69[i444] = null;
                objArr69[14] = obj35;
                this.AudioAttributesImplApi21Parcelizer = i443;
                objArr69[i444] = objArr69[11];
                return 0;
            case 390:
                Object[] objArr70 = this.MediaBrowserCompatMediaItem;
                int i445 = this.AudioAttributesImplApi21Parcelizer;
                objArr70[i445] = objArr70[12];
                objArr70[i445 + 1] = objArr70[13];
                int[] iArr318 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i445 + 3;
                iArr318[i445 + 2] = 0;
                return 0;
            case 391:
                int[] iArr319 = this.MediaBrowserCompatSearchResultReceiver;
                int i446 = this.AudioAttributesImplApi21Parcelizer;
                iArr319[i446] = 50;
                iArr319[i446 + 1] = 0;
                int i447 = i446 + 1;
                this.AudioAttributesImplApi21Parcelizer = i447;
                iArr319[i446] = iArr319[i446] / iArr319[i447];
                return 0;
            case 392:
                int i448 = this.AudioAttributesImplApi21Parcelizer;
                int i449 = i448 - 1;
                Object[] objArr71 = this.MediaBrowserCompatMediaItem;
                Object obj36 = objArr71[i449];
                objArr71[i449] = null;
                objArr71[20] = obj36;
                this.AudioAttributesImplApi21Parcelizer = i448;
                objArr71[i449] = objArr71[11];
                return 0;
            case 393:
                int i450 = this.AudioAttributesImplApi21Parcelizer;
                int i451 = i450 - 1;
                Object[] objArr72 = this.MediaBrowserCompatMediaItem;
                objArr72[i451] = null;
                this.AudioAttributesImplApi21Parcelizer = i450;
                objArr72[i451] = objArr72[20];
                return 0;
            case 394:
                Object[] objArr73 = this.MediaBrowserCompatMediaItem;
                int i452 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i452 + 1;
                objArr73[i452] = objArr73[20];
                return 0;
            case 395:
                int[] iArr320 = this.MediaBrowserCompatSearchResultReceiver;
                int i453 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i453 + 1;
                iArr320[i453] = iArr320[16];
                return 0;
            case 396:
                Object[] objArr74 = this.MediaBrowserCompatMediaItem;
                int i454 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i454 + 1;
                objArr74[i454] = objArr74[17];
                return 0;
            case 397:
                int[] iArr321 = this.MediaBrowserCompatSearchResultReceiver;
                int i455 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i455 + 1;
                iArr321[i455] = iArr321[18];
                return 0;
            case 398:
                int[] iArr322 = this.MediaBrowserCompatSearchResultReceiver;
                int i456 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i456 + 1;
                iArr322[i456] = iArr322[19];
                return 0;
            case 399:
                Object[] objArr75 = this.MediaBrowserCompatMediaItem;
                int i457 = this.AudioAttributesImplApi21Parcelizer;
                objArr75[i457] = objArr75[i457 - 1];
                Object obj37 = objArr75[i457];
                objArr75[i457] = null;
                objArr75[11] = obj37;
                this.AudioAttributesImplApi21Parcelizer = i457 + 1;
                objArr75[i457] = objArr75[20];
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                Object[] objArr76 = this.MediaBrowserCompatMediaItem;
                int i458 = this.AudioAttributesImplApi21Parcelizer;
                objArr76[i458] = objArr76[12];
                objArr76[i458 + 1] = objArr76[13];
                int[] iArr323 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i458 + 3;
                iArr323[i458 + 2] = iArr323[14];
                return 0;
            case 401:
                int[] iArr324 = this.MediaBrowserCompatSearchResultReceiver;
                int i459 = this.AudioAttributesImplApi21Parcelizer;
                iArr324[i459] = iArr324[16];
                iArr324[i459 + 1] = iArr324[17];
                Object[] objArr77 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i459 + 3;
                objArr77[i459 + 2] = null;
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                int[] iArr325 = this.MediaBrowserCompatSearchResultReceiver;
                int i460 = this.AudioAttributesImplApi21Parcelizer;
                iArr325[i460] = iArr325[18];
                iArr325[i460 + 1] = iArr325[19];
                this.AudioAttributesImplApi21Parcelizer = i460 + 3;
                iArr325[i460 + 2] = iArr325[20];
                return 0;
            case 403:
                int i461 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i461;
                Object[] objArr78 = this.MediaBrowserCompatMediaItem;
                Object obj38 = objArr78[i461];
                objArr78[i461] = null;
                objArr78[22] = obj38;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                Object[] objArr79 = this.MediaBrowserCompatMediaItem;
                int i462 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i462 + 1;
                objArr79[i462] = objArr79[22];
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                int[] iArr326 = this.MediaBrowserCompatSearchResultReceiver;
                int i463 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i463 + 1;
                iArr326[i463] = iArr326[17];
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                Object[] objArr80 = this.MediaBrowserCompatMediaItem;
                int i464 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i464 + 1;
                objArr80[i464] = objArr80[18];
                return 0;
            case 407:
                int[] iArr327 = this.MediaBrowserCompatSearchResultReceiver;
                int i465 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i465 + 1;
                iArr327[i465] = iArr327[20];
                return 0;
            case 408:
                int[] iArr328 = this.MediaBrowserCompatSearchResultReceiver;
                int i466 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i466 + 1;
                iArr328[i466] = iArr328[21];
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                Object[] objArr81 = this.MediaBrowserCompatMediaItem;
                int i467 = this.AudioAttributesImplApi21Parcelizer;
                objArr81[i467] = objArr81[i467 - 1];
                Object obj39 = objArr81[i467];
                objArr81[i467] = null;
                objArr81[11] = obj39;
                this.AudioAttributesImplApi21Parcelizer = i467 + 1;
                objArr81[i467] = objArr81[22];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                int[] iArr329 = this.MediaBrowserCompatSearchResultReceiver;
                int i468 = this.AudioAttributesImplApi21Parcelizer;
                iArr329[i468] = 83;
                iArr329[i468 - 1] = iArr329[i468 - 1] + iArr329[i468];
                this.AudioAttributesImplApi21Parcelizer = i468 + 1;
                iArr329[i468] = iArr329[i468 - 1];
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                Object[] objArr82 = this.MediaBrowserCompatMediaItem;
                int i469 = this.AudioAttributesImplApi21Parcelizer;
                objArr82[i469] = objArr82[11];
                this.AudioAttributesImplApi21Parcelizer = i469 + 2;
                objArr82[i469 + 1] = null;
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int[] iArr330 = this.MediaBrowserCompatSearchResultReceiver;
                int i470 = this.AudioAttributesImplApi21Parcelizer;
                iArr330[i470] = 97;
                this.AudioAttributesImplApi21Parcelizer = i470;
                iArr330[i470 - 1] = iArr330[i470 - 1] + iArr330[i470];
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                int[] iArr331 = this.MediaBrowserCompatSearchResultReceiver;
                int i471 = this.AudioAttributesImplApi21Parcelizer;
                iArr331[i471] = -1;
                this.AudioAttributesImplApi21Parcelizer = i471 + 2;
                iArr331[i471 + 1] = 0;
                return 0;
            case 414:
                int[] iArr332 = this.MediaBrowserCompatSearchResultReceiver;
                int i472 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i472 + 1;
                iArr332[i472] = -2;
                return 0;
            case 415:
                int[] iArr333 = this.MediaBrowserCompatSearchResultReceiver;
                int i473 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i473 + 1;
                iArr333[i473] = 64;
                return 0;
            case 416:
                int[] iArr334 = this.MediaBrowserCompatSearchResultReceiver;
                int i474 = this.AudioAttributesImplApi21Parcelizer;
                iArr334[i474] = 0;
                this.AudioAttributesImplApi21Parcelizer = i474 + 2;
                iArr334[i474 + 1] = iArr334[13];
                return 0;
            case 417:
                int[] iArr335 = this.MediaBrowserCompatSearchResultReceiver;
                int i475 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i475 + 1;
                iArr335[i475] = 14;
                return 0;
            case 418:
                Object[] objArr83 = this.MediaBrowserCompatMediaItem;
                int i476 = this.AudioAttributesImplApi21Parcelizer;
                objArr83[i476] = objArr83[12];
                this.MediaBrowserCompatSearchResultReceiver[i476 + 1] = 2;
                this.AudioAttributesImplApi21Parcelizer = i476 + 3;
                objArr83[i476 + 2] = objArr83[11];
                return 0;
            case 419:
                int[] iArr336 = this.MediaBrowserCompatSearchResultReceiver;
                int i477 = this.AudioAttributesImplApi21Parcelizer;
                iArr336[i477] = 3;
                Object[] objArr84 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i477 + 2;
                objArr84[i477 + 1] = objArr84[11];
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                int[] iArr337 = this.MediaBrowserCompatSearchResultReceiver;
                int i478 = this.AudioAttributesImplApi21Parcelizer;
                iArr337[i478] = 4;
                Object[] objArr85 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i478 + 2;
                objArr85[i478 + 1] = objArr85[11];
                return 0;
            case 421:
                int i479 = this.AudioAttributesImplApi21Parcelizer;
                int i480 = i479 - 3;
                this.AudioAttributesImplApi21Parcelizer = i480;
                Object[] objArr86 = this.MediaBrowserCompatMediaItem;
                Object obj40 = objArr86[i480];
                objArr86[i480] = null;
                int[] iArr338 = this.MediaBrowserCompatSearchResultReceiver;
                int i481 = iArr338[i479 - 2];
                Object obj41 = objArr86[i479 - 1];
                objArr86[i479 - 1] = null;
                ((Object[]) obj40)[i481] = obj41;
                objArr86[i480] = objArr86[12];
                this.AudioAttributesImplApi21Parcelizer = i479 - 1;
                iArr338[i479 - 2] = 5;
                return 0;
            case 422:
                int i482 = this.AudioAttributesImplApi21Parcelizer;
                int i483 = i482 - 3;
                this.AudioAttributesImplApi21Parcelizer = i483;
                Object[] objArr87 = this.MediaBrowserCompatMediaItem;
                Object obj42 = objArr87[i483];
                objArr87[i483] = null;
                int[] iArr339 = this.MediaBrowserCompatSearchResultReceiver;
                int i484 = iArr339[i482 - 2];
                Object obj43 = objArr87[i482 - 1];
                objArr87[i482 - 1] = null;
                ((Object[]) obj42)[i484] = obj43;
                objArr87[i483] = objArr87[12];
                this.AudioAttributesImplApi21Parcelizer = i482 - 1;
                iArr339[i482 - 2] = 6;
                return 0;
            case 423:
                int i485 = this.AudioAttributesImplApi21Parcelizer;
                int i486 = i485 - 1;
                Object[] objArr88 = this.MediaBrowserCompatMediaItem;
                Object obj44 = objArr88[i486];
                objArr88[i486] = null;
                objArr88[13] = obj44;
                this.AudioAttributesImplApi21Parcelizer = i485;
                objArr88[i486] = objArr88[12];
                return 0;
            case 424:
                int[] iArr340 = this.MediaBrowserCompatSearchResultReceiver;
                int i487 = this.AudioAttributesImplApi21Parcelizer;
                iArr340[i487] = 7;
                Object[] objArr89 = this.MediaBrowserCompatMediaItem;
                objArr89[i487 + 1] = objArr89[13];
                int i488 = i487 - 1;
                this.AudioAttributesImplApi21Parcelizer = i488;
                Object obj45 = objArr89[i488];
                objArr89[i488] = null;
                int i489 = iArr340[i487];
                Object obj46 = objArr89[i487 + 1];
                objArr89[i487 + 1] = null;
                ((Object[]) obj45)[i489] = obj46;
                return 0;
            case 425:
                Object[] objArr90 = this.MediaBrowserCompatMediaItem;
                int i490 = this.AudioAttributesImplApi21Parcelizer;
                objArr90[i490] = objArr90[13];
                int i491 = i490 - 2;
                this.AudioAttributesImplApi21Parcelizer = i491;
                Object obj47 = objArr90[i491];
                objArr90[i491] = null;
                int i492 = this.MediaBrowserCompatSearchResultReceiver[i490 - 1];
                Object obj48 = objArr90[i490];
                objArr90[i490] = null;
                ((Object[]) obj47)[i492] = obj48;
                this.AudioAttributesImplApi21Parcelizer = i490 - 1;
                objArr90[i491] = objArr90[12];
                return 0;
            case 426:
                int[] iArr341 = this.MediaBrowserCompatSearchResultReceiver;
                int i493 = this.AudioAttributesImplApi21Parcelizer;
                iArr341[i493] = 9;
                Object[] objArr91 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i493 + 2;
                objArr91[i493 + 1] = objArr91[11];
                return 0;
            case 427:
                int i494 = this.AudioAttributesImplApi21Parcelizer;
                int i495 = i494 - 1;
                int[] iArr342 = this.MediaBrowserCompatSearchResultReceiver;
                iArr342[14] = iArr342[i495];
                Object[] objArr92 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i494;
                objArr92[i495] = objArr92[11];
                return 0;
            case 428:
                int[] iArr343 = this.MediaBrowserCompatSearchResultReceiver;
                int i496 = this.AudioAttributesImplApi21Parcelizer;
                iArr343[i496] = 0;
                this.AudioAttributesImplApi21Parcelizer = i496 + 2;
                iArr343[i496 + 1] = iArr343[14];
                return 0;
            case 429:
                int[] iArr344 = this.MediaBrowserCompatSearchResultReceiver;
                int i497 = this.AudioAttributesImplApi21Parcelizer;
                iArr344[i497] = iArr344[14];
                this.AudioAttributesImplApi21Parcelizer = i497 + 2;
                iArr344[i497 + 1] = 0;
                return 0;
            case 430:
                int[] iArr345 = this.MediaBrowserCompatSearchResultReceiver;
                int i498 = this.AudioAttributesImplApi21Parcelizer;
                iArr345[i498] = 67;
                this.AudioAttributesImplApi21Parcelizer = i498;
                iArr345[i498 - 1] = iArr345[i498 - 1] + iArr345[i498];
                return 0;
            case 431:
                int[] iArr346 = this.MediaBrowserCompatSearchResultReceiver;
                int i499 = this.AudioAttributesImplApi21Parcelizer;
                iArr346[i499] = 123;
                this.AudioAttributesImplApi21Parcelizer = i499;
                iArr346[i499 - 1] = iArr346[i499 - 1] + iArr346[i499];
                return 0;
            case 432:
                int i500 = this.AudioAttributesImplApi21Parcelizer;
                int i501 = i500 - 1;
                Object[] objArr93 = this.MediaBrowserCompatMediaItem;
                Object obj49 = objArr93[i501];
                objArr93[i501] = null;
                objArr93[13] = obj49;
                objArr93[i501] = objArr93[12];
                this.AudioAttributesImplApi21Parcelizer = i500 + 1;
                objArr93[i500] = objArr93[13];
                return 0;
            case 433:
                int[] iArr347 = this.MediaBrowserCompatSearchResultReceiver;
                int i502 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i502 + 1;
                iArr347[i502] = 70;
                return 0;
            case 434:
                int[] iArr348 = this.MediaBrowserCompatSearchResultReceiver;
                int i503 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i503 + 1;
                iArr348[i503] = 5894;
                return 0;
            case 435:
                int[] iArr349 = this.MediaBrowserCompatSearchResultReceiver;
                int i504 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i504 + 1;
                iArr349[i504] = 18005;
                return 0;
            case 436:
                int i505 = this.AudioAttributesImplApi21Parcelizer;
                int i506 = i505 - 1;
                Object[] objArr94 = this.MediaBrowserCompatMediaItem;
                Object obj50 = objArr94[i506];
                objArr94[i506] = null;
                objArr94[12] = obj50;
                int[] iArr350 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i505;
                iArr350[i506] = 17;
                return 0;
            case 437:
                int i507 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i507;
                Object[] objArr95 = this.MediaBrowserCompatMediaItem;
                Object obj51 = objArr95[i507];
                objArr95[i507] = null;
                objArr95[16] = obj51;
                return 0;
            case 438:
                Object[] objArr96 = this.MediaBrowserCompatMediaItem;
                int i508 = this.AudioAttributesImplApi21Parcelizer;
                objArr96[i508] = objArr96[11];
                objArr96[i508 + 1] = objArr96[15];
                int[] iArr351 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i508 + 3;
                iArr351[i508 + 2] = iArr351[12];
                return 0;
            case 439:
                int[] iArr352 = this.MediaBrowserCompatSearchResultReceiver;
                int i509 = this.AudioAttributesImplApi21Parcelizer;
                iArr352[i509] = iArr352[14];
                this.AudioAttributesImplApi21Parcelizer = i509 + 2;
                iArr352[i509 + 1] = iArr352[13];
                return 0;
            case 440:
                Object[] objArr97 = this.MediaBrowserCompatMediaItem;
                int i510 = this.AudioAttributesImplApi21Parcelizer;
                objArr97[i510] = objArr97[11];
                objArr97[i510 + 1] = objArr97[16];
                int[] iArr353 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i510 + 3;
                iArr353[i510 + 2] = iArr353[12];
                return 0;
            case 441:
                int[] iArr354 = this.MediaBrowserCompatSearchResultReceiver;
                iArr354[14] = iArr354[14] + 1;
                return 0;
            case 442:
                int[] iArr355 = this.MediaBrowserCompatSearchResultReceiver;
                int i511 = this.AudioAttributesImplApi21Parcelizer;
                iArr355[i511] = 120;
                this.AudioAttributesImplApi21Parcelizer = i511;
                iArr355[13] = iArr355[i511];
                return 0;
            case 443:
                int[] iArr356 = this.MediaBrowserCompatSearchResultReceiver;
                int i512 = this.AudioAttributesImplApi21Parcelizer;
                iArr356[i512] = 20;
                this.AudioAttributesImplApi21Parcelizer = i512;
                iArr356[12] = iArr356[i512];
                return 0;
            case 444:
                int[] iArr357 = this.MediaBrowserCompatSearchResultReceiver;
                int i513 = this.AudioAttributesImplApi21Parcelizer;
                iArr357[i513] = 32;
                this.AudioAttributesImplApi21Parcelizer = i513;
                iArr357[12] = iArr357[i513];
                return 0;
            case 445:
                int[] iArr358 = this.MediaBrowserCompatSearchResultReceiver;
                int i514 = this.AudioAttributesImplApi21Parcelizer;
                iArr358[i514] = 7;
                iArr358[i514 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i514 + 3;
                iArr358[i514 + 2] = 7;
                return 0;
            case 446:
                int[] iArr359 = this.MediaBrowserCompatSearchResultReceiver;
                int i515 = this.AudioAttributesImplApi21Parcelizer;
                iArr359[i515] = 2;
                iArr359[i515 + 1] = 2;
                int i516 = i515 + 1;
                this.AudioAttributesImplApi21Parcelizer = i516;
                iArr359[i515] = iArr359[i515] << iArr359[i516];
                return 0;
            case 447:
                int[] iArr360 = this.MediaBrowserCompatSearchResultReceiver;
                int i517 = this.AudioAttributesImplApi21Parcelizer;
                iArr360[i517] = 5;
                this.AudioAttributesImplApi21Parcelizer = i517;
                iArr360[i517 - 1] = iArr360[i517 - 1] + iArr360[i517];
                return 0;
            case 448:
                int[] iArr361 = this.MediaBrowserCompatSearchResultReceiver;
                int i518 = this.AudioAttributesImplApi21Parcelizer;
                iArr361[i518] = 3;
                this.AudioAttributesImplApi21Parcelizer = i518 + 2;
                iArr361[i518 + 1] = 5;
                return 0;
            case 449:
                int i519 = this.AudioAttributesImplApi21Parcelizer;
                int i520 = i519 - 1;
                this.AudioAttributesImplApi21Parcelizer = i520;
                int[] iArr362 = this.MediaBrowserCompatSearchResultReceiver;
                iArr362[i519 - 2] = iArr362[i519 - 2] * iArr362[i520];
                return 0;
            case 450:
                int[] iArr363 = this.MediaBrowserCompatSearchResultReceiver;
                int i521 = this.AudioAttributesImplApi21Parcelizer;
                iArr363[i521] = 3;
                this.AudioAttributesImplApi21Parcelizer = i521 + 2;
                iArr363[i521 + 1] = 0;
                return 0;
            case 451:
                int[] iArr364 = this.MediaBrowserCompatSearchResultReceiver;
                int i522 = this.AudioAttributesImplApi21Parcelizer;
                iArr364[i522] = 4;
                this.AudioAttributesImplApi21Parcelizer = i522 + 2;
                iArr364[i522 + 1] = 0;
                return 0;
            case 452:
                int[] iArr365 = this.MediaBrowserCompatSearchResultReceiver;
                int i523 = this.AudioAttributesImplApi21Parcelizer;
                iArr365[i523] = 7;
                Object[] objArr98 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i523 + 2;
                objArr98[i523 + 1] = objArr98[11];
                return 0;
            case 453:
                Object[] objArr99 = this.MediaBrowserCompatMediaItem;
                int i524 = this.AudioAttributesImplApi21Parcelizer;
                objArr99[i524] = objArr99[13];
                this.AudioAttributesImplApi21Parcelizer = i524 + 2;
                objArr99[i524 + 1] = objArr99[12];
                return 0;
            case 454:
                int i525 = this.AudioAttributesImplApi21Parcelizer;
                int i526 = i525 - 1;
                Object[] objArr100 = this.MediaBrowserCompatMediaItem;
                Object obj52 = objArr100[i526];
                objArr100[i526] = null;
                objArr100[13] = obj52;
                int[] iArr366 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i525;
                iArr366[i526] = 8;
                return 0;
            case 455:
                Object[] objArr101 = this.MediaBrowserCompatMediaItem;
                int i527 = this.AudioAttributesImplApi21Parcelizer;
                objArr101[i527] = objArr101[i527 - 1];
                this.AudioAttributesImplApi21Parcelizer = i527;
                Object obj53 = objArr101[i527];
                objArr101[i527] = null;
                objArr101[14] = obj53;
                return 0;
            case 456:
                Object[] objArr102 = this.MediaBrowserCompatMediaItem;
                int i528 = this.AudioAttributesImplApi21Parcelizer;
                objArr102[i528] = objArr102[14];
                int[] iArr367 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i528 + 2;
                iArr367[i528 + 1] = 1;
                return 0;
            case 457:
                Object[] objArr103 = this.MediaBrowserCompatMediaItem;
                int i529 = this.AudioAttributesImplApi21Parcelizer;
                objArr103[i529] = objArr103[14];
                int[] iArr368 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i529 + 2;
                iArr368[i529 + 1] = 3;
                return 0;
            case 458:
                Object[] objArr104 = this.MediaBrowserCompatMediaItem;
                int i530 = this.AudioAttributesImplApi21Parcelizer;
                objArr104[i530] = objArr104[14];
                int[] iArr369 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i530 + 2;
                iArr369[i530 + 1] = 7;
                return 0;
            case 459:
                int i531 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i531;
                int[] iArr370 = this.MediaBrowserCompatSearchResultReceiver;
                iArr370[16] = iArr370[i531];
                return 0;
            case 460:
                Object[] objArr105 = this.MediaBrowserCompatMediaItem;
                int i532 = this.AudioAttributesImplApi21Parcelizer;
                objArr105[i532] = objArr105[13];
                int[] iArr371 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i532 + 2;
                iArr371[i532 + 1] = iArr371[16];
                return 0;
            case 461:
                int i533 = this.AudioAttributesImplApi21Parcelizer;
                int i534 = i533 - 3;
                this.AudioAttributesImplApi21Parcelizer = i534;
                Object[] objArr106 = this.MediaBrowserCompatMediaItem;
                Object obj54 = objArr106[i534];
                objArr106[i534] = null;
                int i535 = this.MediaBrowserCompatSearchResultReceiver[i533 - 2];
                Object obj55 = objArr106[i533 - 1];
                objArr106[i533 - 1] = null;
                ((Object[]) obj54)[i535] = obj55;
                this.AudioAttributesImplApi21Parcelizer = i533 - 2;
                objArr106[i534] = objArr106[14];
                return 0;
            case 462:
                int i536 = this.AudioAttributesImplApi21Parcelizer;
                int i537 = i536 - 3;
                this.AudioAttributesImplApi21Parcelizer = i537;
                Object[] objArr107 = this.MediaBrowserCompatMediaItem;
                Object obj56 = objArr107[i537];
                objArr107[i537] = null;
                int[] iArr372 = this.MediaBrowserCompatSearchResultReceiver;
                int i538 = iArr372[i536 - 2];
                Object obj57 = objArr107[i536 - 1];
                objArr107[i536 - 1] = null;
                ((Object[]) obj56)[i538] = obj57;
                objArr107[i537] = objArr107[14];
                this.AudioAttributesImplApi21Parcelizer = i536 - 1;
                iArr372[i536 - 2] = 3;
                return 0;
            case 463:
                Object[] objArr108 = this.MediaBrowserCompatMediaItem;
                int i539 = this.AudioAttributesImplApi21Parcelizer;
                objArr108[i539] = objArr108[14];
                int[] iArr373 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i539 + 2;
                iArr373[i539 + 1] = 4;
                return 0;
            case 464:
                int i540 = this.AudioAttributesImplApi21Parcelizer;
                int i541 = i540 - 3;
                this.AudioAttributesImplApi21Parcelizer = i541;
                Object[] objArr109 = this.MediaBrowserCompatMediaItem;
                Object obj58 = objArr109[i541];
                objArr109[i541] = null;
                int[] iArr374 = this.MediaBrowserCompatSearchResultReceiver;
                int i542 = iArr374[i540 - 2];
                Object obj59 = objArr109[i540 - 1];
                objArr109[i540 - 1] = null;
                ((Object[]) obj58)[i542] = obj59;
                objArr109[i541] = objArr109[14];
                this.AudioAttributesImplApi21Parcelizer = i540 - 1;
                iArr374[i540 - 2] = 5;
                return 0;
            case 465:
                Object[] objArr110 = this.MediaBrowserCompatMediaItem;
                int i543 = this.AudioAttributesImplApi21Parcelizer;
                objArr110[i543] = objArr110[14];
                int[] iArr375 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i543 + 2;
                iArr375[i543 + 1] = 6;
                return 0;
            case 466:
                int i544 = this.AudioAttributesImplApi21Parcelizer;
                int i545 = i544 - 3;
                this.AudioAttributesImplApi21Parcelizer = i545;
                Object[] objArr111 = this.MediaBrowserCompatMediaItem;
                Object obj60 = objArr111[i545];
                objArr111[i545] = null;
                int i546 = this.MediaBrowserCompatSearchResultReceiver[i544 - 2];
                Object obj61 = objArr111[i544 - 1];
                objArr111[i544 - 1] = null;
                ((Object[]) obj60)[i546] = obj61;
                this.AudioAttributesImplApi21Parcelizer = i544 - 2;
                objArr111[i545] = objArr111[13];
                return 0;
            case 467:
                Object[] objArr112 = this.MediaBrowserCompatMediaItem;
                int i547 = this.AudioAttributesImplApi21Parcelizer;
                objArr112[i547] = null;
                this.AudioAttributesImplApi21Parcelizer = i547;
                Object obj62 = objArr112[i547];
                objArr112[i547] = null;
                objArr112[13] = obj62;
                return 0;
            case 468:
                int i548 = this.AudioAttributesImplApi21Parcelizer;
                int i549 = i548 - 1;
                Object[] objArr113 = this.MediaBrowserCompatMediaItem;
                Object obj63 = objArr113[i549];
                objArr113[i549] = null;
                objArr113[15] = obj63;
                this.AudioAttributesImplApi21Parcelizer = i548;
                objArr113[i549] = objArr113[14];
                return 0;
            case 469:
                int i550 = this.AudioAttributesImplApi21Parcelizer;
                int i551 = i550 - 1;
                int[] iArr376 = this.MediaBrowserCompatSearchResultReceiver;
                iArr376[13] = iArr376[i551];
                Object[] objArr114 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i550;
                objArr114[i551] = objArr114[14];
                return 0;
            case 470:
                int i552 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i552;
                Object[] objArr115 = this.MediaBrowserCompatMediaItem;
                Object obj64 = objArr115[i552];
                objArr115[i552] = null;
                this.RemoteActionCompatParcelizer = obj64 != null ? 0 : 1;
                return 0;
            case 471:
                Object[] objArr116 = this.MediaBrowserCompatMediaItem;
                int i553 = this.AudioAttributesImplApi21Parcelizer;
                objArr116[i553] = objArr116[11];
                this.AudioAttributesImplApi21Parcelizer = i553 + 2;
                objArr116[i553 + 1] = objArr116[13];
                return 0;
            case 472:
                Object[] objArr117 = this.MediaBrowserCompatMediaItem;
                int i554 = this.AudioAttributesImplApi21Parcelizer;
                objArr117[i554] = objArr117[13];
                this.AudioAttributesImplApi21Parcelizer = i554 + 2;
                objArr117[i554 + 1] = objArr117[15];
                return 0;
            case 473:
                int[] iArr377 = this.MediaBrowserCompatSearchResultReceiver;
                int i555 = this.AudioAttributesImplApi21Parcelizer;
                iArr377[i555] = 61;
                iArr377[i555 + 1] = 0;
                int i556 = i555 + 1;
                this.AudioAttributesImplApi21Parcelizer = i556;
                iArr377[i555] = iArr377[i555] / iArr377[i556];
                return 0;
            case 474:
                int i557 = this.AudioAttributesImplApi21Parcelizer;
                int i558 = i557 - 1;
                Object[] objArr118 = this.MediaBrowserCompatMediaItem;
                Object obj65 = objArr118[i558];
                objArr118[i558] = null;
                objArr118[16] = obj65;
                this.AudioAttributesImplApi21Parcelizer = i557;
                objArr118[i558] = objArr118[11];
                return 0;
            case 475:
                int i559 = this.AudioAttributesImplApi21Parcelizer;
                int i560 = i559 - 1;
                int[] iArr378 = this.MediaBrowserCompatSearchResultReceiver;
                iArr378[15] = iArr378[i560];
                Object[] objArr119 = this.MediaBrowserCompatMediaItem;
                objArr119[i560] = objArr119[16];
                this.AudioAttributesImplApi21Parcelizer = i559 + 1;
                objArr119[i559] = objArr119[12];
                return 0;
            case 476:
                int[] iArr379 = this.MediaBrowserCompatSearchResultReceiver;
                int i561 = this.AudioAttributesImplApi21Parcelizer;
                iArr379[i561] = iArr379[13];
                this.AudioAttributesImplApi21Parcelizer = i561 + 2;
                iArr379[i561 + 1] = 1;
                return 0;
            case 477:
                int i562 = this.AudioAttributesImplApi21Parcelizer;
                int i563 = i562 - 1;
                Object[] objArr120 = this.MediaBrowserCompatMediaItem;
                Object obj66 = objArr120[i563];
                objArr120[i563] = null;
                objArr120[13] = obj66;
                this.MediaBrowserCompatSearchResultReceiver[i563] = 0;
                this.AudioAttributesImplApi21Parcelizer = i562 + 1;
                objArr120[i562] = objArr120[11];
                return 0;
            case 478:
                int[] iArr380 = this.MediaBrowserCompatSearchResultReceiver;
                int i564 = this.AudioAttributesImplApi21Parcelizer;
                iArr380[i564] = 1;
                Object[] objArr121 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i564 + 2;
                objArr121[i564 + 1] = objArr121[11];
                return 0;
            case 479:
                int[] iArr381 = this.MediaBrowserCompatSearchResultReceiver;
                int i565 = this.AudioAttributesImplApi21Parcelizer;
                iArr381[i565] = 89;
                this.AudioAttributesImplApi21Parcelizer = i565;
                iArr381[i565 - 1] = iArr381[i565 - 1] + iArr381[i565];
                return 0;
            case 480:
                Object[] objArr122 = this.MediaBrowserCompatMediaItem;
                int i566 = this.AudioAttributesImplApi21Parcelizer;
                objArr122[i566] = objArr122[i566 - 1];
                Object obj67 = objArr122[i566];
                objArr122[i566] = null;
                objArr122[13] = obj67;
                int[] iArr382 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i566 + 1;
                iArr382[i566] = 0;
                return 0;
            case 481:
                int[] iArr383 = this.MediaBrowserCompatSearchResultReceiver;
                int i567 = this.AudioAttributesImplApi21Parcelizer;
                iArr383[i567] = 0;
                this.AudioAttributesImplApi21Parcelizer = i567 + 2;
                iArr383[i567 + 1] = 0;
                return 0;
            case 482:
                float[] fArr17 = this.RatingCompat;
                int i568 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i568 + 1;
                fArr17[i568] = 1.0f;
                return 0;
            case 483:
                float[] fArr18 = this.RatingCompat;
                int i569 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i569 + 1;
                fArr18[i569] = 2.0f;
                return 0;
            case 484:
                int[] iArr384 = this.MediaBrowserCompatSearchResultReceiver;
                int i570 = this.AudioAttributesImplApi21Parcelizer;
                iArr384[i570] = 7;
                iArr384[i570 + 1] = 0;
                int i571 = i570 + 1;
                this.AudioAttributesImplApi21Parcelizer = i571;
                iArr384[i570] = iArr384[i570] / iArr384[i571];
                return 0;
            case 485:
                int[] iArr385 = this.MediaBrowserCompatSearchResultReceiver;
                int i572 = this.AudioAttributesImplApi21Parcelizer;
                iArr385[i572] = 30;
                iArr385[i572 + 1] = 0;
                int i573 = i572 + 1;
                this.AudioAttributesImplApi21Parcelizer = i573;
                iArr385[i572] = iArr385[i572] / iArr385[i573];
                return 0;
            case 486:
                int[] iArr386 = this.MediaBrowserCompatSearchResultReceiver;
                int i574 = this.AudioAttributesImplApi21Parcelizer;
                iArr386[i574] = 125;
                this.AudioAttributesImplApi21Parcelizer = i574;
                iArr386[i574 - 1] = iArr386[i574 - 1] + iArr386[i574];
                return 0;
            case 487:
                Object[] objArr123 = this.MediaBrowserCompatMediaItem;
                int i575 = this.AudioAttributesImplApi21Parcelizer;
                objArr123[i575] = objArr123[i575 - 1];
                Object obj68 = objArr123[i575];
                objArr123[i575] = null;
                objArr123[12] = obj68;
                int[] iArr387 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i575 + 1;
                iArr387[i575] = 0;
                return 0;
            case 488:
                Object[] objArr124 = this.MediaBrowserCompatMediaItem;
                int i576 = this.AudioAttributesImplApi21Parcelizer;
                objArr124[i576] = objArr124[12];
                this.MediaBrowserCompatSearchResultReceiver[i576 + 1] = 6;
                this.AudioAttributesImplApi21Parcelizer = i576 + 3;
                objArr124[i576 + 2] = objArr124[11];
                return 0;
            case 489:
                int[] iArr388 = this.MediaBrowserCompatSearchResultReceiver;
                int i577 = this.AudioAttributesImplApi21Parcelizer;
                iArr388[i577] = 87;
                this.AudioAttributesImplApi21Parcelizer = i577;
                iArr388[i577 - 1] = iArr388[i577 - 1] + iArr388[i577];
                return 0;
            case 490:
                int[] iArr389 = this.MediaBrowserCompatSearchResultReceiver;
                int i578 = this.AudioAttributesImplApi21Parcelizer;
                iArr389[i578] = 73;
                this.AudioAttributesImplApi21Parcelizer = i578 + 2;
                iArr389[i578 + 1] = 0;
                return 0;
            case 491:
                int[] iArr390 = this.MediaBrowserCompatSearchResultReceiver;
                int i579 = this.AudioAttributesImplApi21Parcelizer;
                iArr390[i579] = 9;
                iArr390[i579 - 1] = iArr390[i579 - 1] + iArr390[i579];
                this.AudioAttributesImplApi21Parcelizer = i579 + 1;
                iArr390[i579] = iArr390[i579 - 1];
                return 0;
            case 492:
                int[] iArr391 = this.MediaBrowserCompatSearchResultReceiver;
                int i580 = this.AudioAttributesImplApi21Parcelizer;
                iArr391[i580] = 91;
                this.AudioAttributesImplApi21Parcelizer = i580 + 2;
                iArr391[i580 + 1] = 0;
                return 0;
            case UnixStat.DEFAULT_DIR_PERM /* 493 */:
                int[] iArr392 = this.MediaBrowserCompatSearchResultReceiver;
                int i581 = this.AudioAttributesImplApi21Parcelizer;
                iArr392[i581] = 15;
                iArr392[i581 - 1] = iArr392[i581 - 1] + iArr392[i581];
                this.AudioAttributesImplApi21Parcelizer = i581 + 1;
                iArr392[i581] = iArr392[i581 - 1];
                return 0;
            case 494:
                int[] iArr393 = this.MediaBrowserCompatSearchResultReceiver;
                int i582 = this.AudioAttributesImplApi21Parcelizer;
                iArr393[i582] = 83;
                iArr393[i582 + 1] = 0;
                int i583 = i582 + 1;
                this.AudioAttributesImplApi21Parcelizer = i583;
                iArr393[i582] = iArr393[i582] / iArr393[i583];
                return 0;
            case 495:
                int[] iArr394 = this.MediaBrowserCompatSearchResultReceiver;
                int i584 = this.AudioAttributesImplApi21Parcelizer;
                iArr394[i584] = 55;
                iArr394[i584 - 1] = iArr394[i584 - 1] + iArr394[i584];
                this.AudioAttributesImplApi21Parcelizer = i584 + 1;
                iArr394[i584] = iArr394[i584 - 1];
                return 0;
            case 496:
                int[] iArr395 = this.MediaBrowserCompatSearchResultReceiver;
                int i585 = this.AudioAttributesImplApi21Parcelizer;
                iArr395[i585] = 6;
                this.AudioAttributesImplApi21Parcelizer = i585 + 2;
                iArr395[i585 + 1] = 0;
                return 0;
            case 497:
                int i586 = this.AudioAttributesImplApi21Parcelizer;
                int i587 = i586 - 3;
                this.AudioAttributesImplApi21Parcelizer = i587;
                Object[] objArr125 = this.MediaBrowserCompatMediaItem;
                Object obj69 = objArr125[i587];
                objArr125[i587] = null;
                int[] iArr396 = this.MediaBrowserCompatSearchResultReceiver;
                int i588 = iArr396[i586 - 2];
                Object obj70 = objArr125[i586 - 1];
                objArr125[i586 - 1] = null;
                ((Object[]) obj69)[i588] = obj70;
                objArr125[i587] = objArr125[12];
                this.AudioAttributesImplApi21Parcelizer = i586 - 1;
                iArr396[i586 - 2] = 2;
                return 0;
            case 498:
                int i589 = this.AudioAttributesImplApi21Parcelizer;
                int i590 = i589 - 3;
                this.AudioAttributesImplApi21Parcelizer = i590;
                Object[] objArr126 = this.MediaBrowserCompatMediaItem;
                Object obj71 = objArr126[i590];
                objArr126[i590] = null;
                int[] iArr397 = this.MediaBrowserCompatSearchResultReceiver;
                int i591 = iArr397[i589 - 2];
                Object obj72 = objArr126[i589 - 1];
                objArr126[i589 - 1] = null;
                ((Object[]) obj71)[i591] = obj72;
                objArr126[i590] = objArr126[12];
                this.AudioAttributesImplApi21Parcelizer = i589 - 1;
                iArr397[i589 - 2] = 4;
                return 0;
            case 499:
                int[] iArr398 = this.MediaBrowserCompatSearchResultReceiver;
                int i592 = this.AudioAttributesImplApi21Parcelizer;
                iArr398[i592] = 62;
                this.AudioAttributesImplApi21Parcelizer = i592 + 2;
                iArr398[i592 + 1] = 0;
                return 0;
            case 500:
                int[] iArr399 = this.MediaBrowserCompatSearchResultReceiver;
                int i593 = this.AudioAttributesImplApi21Parcelizer;
                iArr399[i593] = 86;
                iArr399[i593 + 1] = 0;
                int i594 = i593 + 1;
                this.AudioAttributesImplApi21Parcelizer = i594;
                iArr399[i593] = iArr399[i593] / iArr399[i594];
                return 0;
            case 501:
                int[] iArr400 = this.MediaBrowserCompatSearchResultReceiver;
                int i595 = this.AudioAttributesImplApi21Parcelizer;
                iArr400[i595] = 45;
                this.AudioAttributesImplApi21Parcelizer = i595;
                iArr400[i595 - 1] = iArr400[i595 - 1] + iArr400[i595];
                return 0;
            case 502:
                Object[] objArr127 = this.MediaBrowserCompatMediaItem;
                int i596 = this.AudioAttributesImplApi21Parcelizer;
                objArr127[i596] = objArr127[13];
                int i597 = i596 - 2;
                this.AudioAttributesImplApi21Parcelizer = i597;
                Object obj73 = objArr127[i597];
                objArr127[i597] = null;
                int i598 = this.MediaBrowserCompatSearchResultReceiver[i596 - 1];
                Object obj74 = objArr127[i596];
                objArr127[i596] = null;
                ((Object[]) obj73)[i598] = obj74;
                return 0;
            case 503:
                Object[] objArr128 = this.MediaBrowserCompatMediaItem;
                int i599 = this.AudioAttributesImplApi21Parcelizer;
                objArr128[i599] = objArr128[12];
                int i600 = i599 - 2;
                this.AudioAttributesImplApi21Parcelizer = i600;
                Object obj75 = objArr128[i600];
                objArr128[i600] = null;
                int i601 = this.MediaBrowserCompatSearchResultReceiver[i599 - 1];
                Object obj76 = objArr128[i599];
                objArr128[i599] = null;
                ((Object[]) obj75)[i601] = obj76;
                return 0;
            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                Object[] objArr129 = this.MediaBrowserCompatMediaItem;
                int i602 = this.AudioAttributesImplApi21Parcelizer;
                objArr129[i602] = objArr129[13];
                int i603 = i602 - 2;
                this.AudioAttributesImplApi21Parcelizer = i603;
                Object obj77 = objArr129[i603];
                objArr129[i603] = null;
                int i604 = this.MediaBrowserCompatSearchResultReceiver[i602 - 1];
                Object obj78 = objArr129[i602];
                objArr129[i602] = null;
                ((Object[]) obj77)[i604] = obj78;
                this.AudioAttributesImplApi21Parcelizer = i602 - 1;
                objArr129[i603] = objArr129[14];
                return 0;
            case 505:
                int[] iArr401 = this.MediaBrowserCompatSearchResultReceiver;
                int i605 = this.AudioAttributesImplApi21Parcelizer;
                iArr401[i605] = 22;
                iArr401[i605 + 1] = 0;
                int i606 = i605 + 1;
                this.AudioAttributesImplApi21Parcelizer = i606;
                iArr401[i605] = iArr401[i605] / iArr401[i606];
                return 0;
            case 506:
                int[] iArr402 = this.MediaBrowserCompatSearchResultReceiver;
                int i607 = this.AudioAttributesImplApi21Parcelizer;
                iArr402[i607] = 84;
                this.AudioAttributesImplApi21Parcelizer = i607 + 2;
                iArr402[i607 + 1] = 0;
                return 0;
            case 507:
                int[] iArr403 = this.MediaBrowserCompatSearchResultReceiver;
                int i608 = this.AudioAttributesImplApi21Parcelizer;
                iArr403[i608] = 44;
                this.AudioAttributesImplApi21Parcelizer = i608 + 2;
                iArr403[i608 + 1] = 0;
                return 0;
            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                int[] iArr404 = this.MediaBrowserCompatSearchResultReceiver;
                int i609 = this.AudioAttributesImplApi21Parcelizer;
                iArr404[i609] = iArr404[12];
                iArr404[i609 + 1] = 1;
                int i610 = i609 + 1;
                this.AudioAttributesImplApi21Parcelizer = i610;
                iArr404[i609] = iArr404[i609] ^ iArr404[i610];
                return 0;
            case 509:
                int[] iArr405 = this.MediaBrowserCompatSearchResultReceiver;
                int i611 = this.AudioAttributesImplApi21Parcelizer;
                iArr405[i611] = 1;
                this.AudioAttributesImplApi21Parcelizer = i611;
                iArr405[i611 - 1] = iArr405[i611 - 1] ^ iArr405[i611];
                return 0;
            case 510:
                int[] iArr406 = this.MediaBrowserCompatSearchResultReceiver;
                int i612 = this.AudioAttributesImplApi21Parcelizer;
                iArr406[i612] = 44;
                iArr406[i612 + 1] = 0;
                int i613 = i612 + 1;
                this.AudioAttributesImplApi21Parcelizer = i613;
                iArr406[i612] = iArr406[i612] / iArr406[i613];
                return 0;
            case UnixStat.DEFAULT_LINK_PERM /* 511 */:
                int[] iArr407 = this.MediaBrowserCompatSearchResultReceiver;
                int i614 = this.AudioAttributesImplApi21Parcelizer;
                iArr407[i614] = 63;
                this.AudioAttributesImplApi21Parcelizer = i614 + 2;
                iArr407[i614 + 1] = 0;
                return 0;
            case 512:
                int[] iArr408 = this.MediaBrowserCompatSearchResultReceiver;
                int i615 = this.AudioAttributesImplApi21Parcelizer;
                iArr408[i615] = 77;
                this.AudioAttributesImplApi21Parcelizer = i615;
                iArr408[i615 - 1] = iArr408[i615 - 1] + iArr408[i615];
                return 0;
            case 513:
                int[] iArr409 = this.MediaBrowserCompatSearchResultReceiver;
                int i616 = this.AudioAttributesImplApi21Parcelizer;
                iArr409[i616] = -1;
                this.AudioAttributesImplApi21Parcelizer = i616 + 2;
                iArr409[i616 + 1] = iArr409[13];
                return 0;
            case 514:
                int[] iArr410 = this.MediaBrowserCompatSearchResultReceiver;
                int i617 = this.AudioAttributesImplApi21Parcelizer;
                iArr410[i617] = 51;
                iArr410[i617 - 1] = iArr410[i617 - 1] + iArr410[i617];
                this.AudioAttributesImplApi21Parcelizer = i617 + 1;
                iArr410[i617] = iArr410[i617 - 1];
                return 0;
            case 515:
                int[] iArr411 = this.MediaBrowserCompatSearchResultReceiver;
                int i618 = this.AudioAttributesImplApi21Parcelizer;
                iArr411[i618] = iArr411[12];
                this.AudioAttributesImplApi21Parcelizer = i618 + 2;
                iArr411[i618 + 1] = 1;
                return 0;
            case 516:
                int i619 = this.AudioAttributesImplApi21Parcelizer;
                int i620 = i619 - 1;
                this.AudioAttributesImplApi21Parcelizer = i620;
                long[] jArr3 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatSearchResultReceiver[i619 - 2] = (jArr3[i619 - 2] > jArr3[i620] ? 1 : (jArr3[i619 - 2] == jArr3[i620] ? 0 : -1));
                return 0;
            case 517:
                int[] iArr412 = this.MediaBrowserCompatSearchResultReceiver;
                int i621 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i621 + 1;
                iArr412[i621] = 28102;
                return 0;
            case 518:
                int[] iArr413 = this.MediaBrowserCompatSearchResultReceiver;
                int i622 = this.AudioAttributesImplApi21Parcelizer;
                iArr413[i622 - 1] = (byte) iArr413[i622 - 1];
                return 0;
            case 519:
                int i623 = this.AudioAttributesImplApi21Parcelizer;
                int i624 = i623 - 1;
                this.AudioAttributesImplApi21Parcelizer = i624;
                int[] iArr414 = this.MediaBrowserCompatSearchResultReceiver;
                iArr414[i623 - 2] = iArr414[i623 - 2] + iArr414[i624];
                iArr414[i623 - 2] = (char) iArr414[i623 - 2];
                return 0;
            case 520:
                int[] iArr415 = this.MediaBrowserCompatSearchResultReceiver;
                int i625 = this.AudioAttributesImplApi21Parcelizer;
                iArr415[i625 - 1] = (char) iArr415[i625 - 1];
                return 0;
            case 521:
                Object[] objArr130 = this.MediaBrowserCompatMediaItem;
                int i626 = this.AudioAttributesImplApi21Parcelizer;
                objArr130[i626] = objArr130[i626 - 1];
                int[] iArr416 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i626 + 2;
                iArr416[i626 + 1] = 0;
                return 0;
            case 522:
                Object[] objArr131 = this.MediaBrowserCompatMediaItem;
                int i627 = this.AudioAttributesImplApi21Parcelizer;
                objArr131[i627] = null;
                int[] iArr417 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i627 + 2;
                iArr417[i627 + 1] = 1;
                return 0;
            case 523:
                Object[] objArr132 = this.MediaBrowserCompatMediaItem;
                int i628 = this.AudioAttributesImplApi21Parcelizer;
                objArr132[i628] = objArr132[i628 - 1];
                this.MediaBrowserCompatSearchResultReceiver[i628 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i628 + 3;
                objArr132[i628 + 2] = objArr132[13];
                return 0;
            case 524:
                Object[] objArr133 = this.MediaBrowserCompatMediaItem;
                int i629 = this.AudioAttributesImplApi21Parcelizer;
                Object obj79 = objArr133[i629 - 1];
                objArr133[i629 - 1] = null;
                Object obj80 = objArr133[i629 - 2];
                objArr133[i629 - 2] = null;
                objArr133[i629 - 1] = obj80;
                objArr133[i629 - 2] = obj79;
                return 0;
            case 525:
                Object[] objArr134 = this.MediaBrowserCompatMediaItem;
                int i630 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i630 + 1;
                Object obj81 = objArr134[i630 - 1];
                objArr134[i630 - 1] = null;
                objArr134[i630] = obj81;
                int[] iArr418 = this.MediaBrowserCompatSearchResultReceiver;
                iArr418[i630 - 1] = iArr418[i630 - 2];
                objArr134[i630 - 2] = obj81;
                return 0;
            case 526:
                int[] iArr419 = this.MediaBrowserCompatSearchResultReceiver;
                int i631 = this.AudioAttributesImplApi21Parcelizer;
                iArr419[i631 - 1] = iArr419[i631 - 2];
                Object[] objArr135 = this.MediaBrowserCompatMediaItem;
                Object obj82 = objArr135[i631 - 1];
                objArr135[i631 - 1] = null;
                objArr135[i631 - 2] = obj82;
                return 0;
            case 527:
                Object[] objArr136 = this.MediaBrowserCompatMediaItem;
                int i632 = this.AudioAttributesImplApi21Parcelizer;
                Object obj83 = objArr136[i632 - 2];
                objArr136[i632 - 2] = null;
                objArr136[i632 - 1] = obj83;
                int[] iArr420 = this.MediaBrowserCompatSearchResultReceiver;
                iArr420[i632 - 2] = iArr420[i632 - 1];
                int i633 = i632 - 3;
                this.AudioAttributesImplApi21Parcelizer = i633;
                Object obj84 = objArr136[i633];
                objArr136[i633] = null;
                int i634 = iArr420[i632 - 2];
                Object obj85 = objArr136[i632 - 1];
                objArr136[i632 - 1] = null;
                ((Object[]) obj84)[i634] = obj85;
                this.AudioAttributesImplApi21Parcelizer = i632 - 2;
                Object obj86 = objArr136[i632 - 4];
                objArr136[i632 - 4] = null;
                objArr136[i633] = obj86;
                iArr420[i632 - 4] = iArr420[i632 - 5];
                objArr136[i632 - 5] = obj86;
                return 0;
            case 528:
                int[] iArr421 = this.MediaBrowserCompatSearchResultReceiver;
                int i635 = this.AudioAttributesImplApi21Parcelizer;
                iArr421[i635] = 1;
                Object[] objArr137 = this.MediaBrowserCompatMediaItem;
                Object obj87 = objArr137[i635 - 1];
                objArr137[i635 - 1] = null;
                objArr137[i635] = obj87;
                iArr421[i635 - 1] = iArr421[i635];
                int i636 = i635 - 2;
                this.AudioAttributesImplApi21Parcelizer = i636;
                Object obj88 = objArr137[i636];
                objArr137[i636] = null;
                int i637 = iArr421[i635 - 1];
                Object obj89 = objArr137[i635];
                objArr137[i635] = null;
                ((Object[]) obj88)[i637] = obj89;
                return 0;
            case 529:
                Object[] objArr138 = this.MediaBrowserCompatMediaItem;
                int i638 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i638 + 1;
                Object obj90 = objArr138[i638 - 1];
                objArr138[i638 - 1] = null;
                objArr138[i638] = obj90;
                int[] iArr422 = this.MediaBrowserCompatSearchResultReceiver;
                iArr422[i638 - 1] = iArr422[i638 - 2];
                objArr138[i638 - 2] = obj90;
                iArr422[i638] = iArr422[i638 - 1];
                Object obj91 = objArr138[i638];
                objArr138[i638] = null;
                objArr138[i638 - 1] = obj91;
                return 0;
            case 530:
                int[] iArr423 = this.MediaBrowserCompatSearchResultReceiver;
                int i639 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i639 + 1;
                iArr423[i639] = 0;
                Object[] objArr139 = this.MediaBrowserCompatMediaItem;
                Object obj92 = objArr139[i639 - 1];
                objArr139[i639 - 1] = null;
                objArr139[i639] = obj92;
                iArr423[i639 - 1] = iArr423[i639];
                return 0;
            case 531:
                int i640 = this.AudioAttributesImplApi21Parcelizer;
                int i641 = i640 - 3;
                this.AudioAttributesImplApi21Parcelizer = i641;
                Object[] objArr140 = this.MediaBrowserCompatMediaItem;
                Object obj93 = objArr140[i641];
                objArr140[i641] = null;
                int[] iArr424 = this.MediaBrowserCompatSearchResultReceiver;
                int i642 = iArr424[i640 - 2];
                Object obj94 = objArr140[i640 - 1];
                objArr140[i640 - 1] = null;
                ((Object[]) obj93)[i642] = obj94;
                objArr140[i641] = objArr140[i640 - 4];
                this.AudioAttributesImplApi21Parcelizer = i640 - 1;
                iArr424[i640 - 2] = 1;
                return 0;
            case 532:
                Object[] objArr141 = this.MediaBrowserCompatMediaItem;
                int i643 = this.AudioAttributesImplApi21Parcelizer;
                Object obj95 = objArr141[i643 - 1];
                objArr141[i643 - 1] = null;
                Object obj96 = objArr141[i643 - 2];
                objArr141[i643 - 2] = null;
                objArr141[i643 - 1] = obj96;
                objArr141[i643 - 2] = obj95;
                this.AudioAttributesImplApi21Parcelizer = i643 + 1;
                objArr141[i643] = null;
                return 0;
            case 533:
                int[] iArr425 = this.MediaBrowserCompatSearchResultReceiver;
                int i644 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i644 + 1;
                iArr425[i644] = 7507;
                return 0;
            case 534:
                Object[] objArr142 = this.MediaBrowserCompatMediaItem;
                int i645 = this.AudioAttributesImplApi21Parcelizer;
                objArr142[i645] = null;
                int[] iArr426 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i645 + 2;
                iArr426[i645 + 1] = 0;
                return 0;
            case 535:
                long[] jArr4 = this.MediaDescriptionCompat;
                int i646 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i646 + 1;
                jArr4[i646] = jArr4[i646 - 1];
                return 0;
            case 536:
                int[] iArr427 = this.MediaBrowserCompatSearchResultReceiver;
                int i647 = this.AudioAttributesImplApi21Parcelizer;
                iArr427[i647] = 12;
                this.AudioAttributesImplApi21Parcelizer = i647;
                long[] jArr5 = this.MediaDescriptionCompat;
                jArr5[i647 - 1] = jArr5[i647 - 1] >> iArr427[i647];
                return 0;
            case 537:
                Object[] objArr143 = this.MediaBrowserCompatMediaItem;
                int i648 = this.AudioAttributesImplApi21Parcelizer;
                objArr143[i648] = objArr143[13];
                Object obj97 = objArr143[i648];
                objArr143[i648] = null;
                objArr143[17] = obj97;
                this.AudioAttributesImplApi21Parcelizer = i648 + 1;
                objArr143[i648] = obj97;
                return 0;
            case 538:
                int[] iArr428 = this.MediaBrowserCompatSearchResultReceiver;
                int i649 = this.AudioAttributesImplApi21Parcelizer;
                iArr428[i649] = 3;
                this.AudioAttributesImplApi21Parcelizer = i649;
                Object[] objArr144 = this.MediaBrowserCompatMediaItem;
                Object obj98 = objArr144[i649 - 1];
                objArr144[i649 - 1] = null;
                objArr144[i649 - 1] = ((Object[]) obj98)[iArr428[i649]];
                return 0;
            case 539:
                int[] iArr429 = this.MediaBrowserCompatSearchResultReceiver;
                int i650 = this.AudioAttributesImplApi21Parcelizer;
                iArr429[i650] = 0;
                this.AudioAttributesImplApi21Parcelizer = i650;
                Object[] objArr145 = this.MediaBrowserCompatMediaItem;
                Object obj99 = objArr145[i650 - 1];
                objArr145[i650 - 1] = null;
                iArr429[i650 - 1] = ((int[]) obj99)[iArr429[i650]];
                return 0;
            case 540:
                int i651 = this.AudioAttributesImplApi21Parcelizer;
                int i652 = i651 - 1;
                int[] iArr430 = this.MediaBrowserCompatSearchResultReceiver;
                iArr430[14] = iArr430[i652];
                Object[] objArr146 = this.MediaBrowserCompatMediaItem;
                objArr146[i652] = objArr146[13];
                int i653 = i651 - 1;
                this.AudioAttributesImplApi21Parcelizer = i653;
                Object obj100 = objArr146[i653];
                objArr146[i653] = null;
                objArr146[17] = obj100;
                return 0;
            case 541:
                int[] iArr431 = this.MediaBrowserCompatSearchResultReceiver;
                int i654 = this.AudioAttributesImplApi21Parcelizer;
                iArr431[i654] = 2;
                this.AudioAttributesImplApi21Parcelizer = i654;
                Object[] objArr147 = this.MediaBrowserCompatMediaItem;
                Object obj101 = objArr147[i654 - 1];
                objArr147[i654 - 1] = null;
                objArr147[i654 - 1] = ((Object[]) obj101)[iArr431[i654]];
                return 0;
            case 542:
                int i655 = this.AudioAttributesImplApi21Parcelizer;
                int i656 = i655 - 1;
                int[] iArr432 = this.MediaBrowserCompatSearchResultReceiver;
                iArr432[13] = iArr432[i656];
                this.AudioAttributesImplApi21Parcelizer = i655;
                iArr432[i656] = iArr432[14];
                return 0;
            case 543:
                int i657 = this.AudioAttributesImplApi21Parcelizer;
                int i658 = i657 - 1;
                this.AudioAttributesImplApi21Parcelizer = i658;
                int[] iArr433 = this.MediaBrowserCompatSearchResultReceiver;
                iArr433[i657 - 2] = iArr433[i658] ^ iArr433[i657 - 2];
                this.MediaDescriptionCompat[i657 - 2] = iArr433[i657 - 2];
                return 0;
            case 544:
                int i659 = this.AudioAttributesImplApi21Parcelizer;
                int i660 = i659 - 1;
                this.AudioAttributesImplApi21Parcelizer = i660;
                long[] jArr6 = this.MediaDescriptionCompat;
                jArr6[i659 - 2] = jArr6[i660] & jArr6[i659 - 2];
                return 0;
            case 545:
                int i661 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr7 = this.MediaDescriptionCompat;
                jArr7[i661 - 2] = jArr7[i661 - 2] | jArr7[i661 - 1];
                int i662 = i661 - 2;
                this.AudioAttributesImplApi21Parcelizer = i662;
                jArr7[15] = jArr7[i662];
                return 0;
            case 546:
                long[] jArr8 = this.MediaDescriptionCompat;
                int i663 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i663 + 1;
                jArr8[i663] = jArr8[15];
                return 0;
            case 547:
                Object[] objArr148 = this.MediaBrowserCompatMediaItem;
                int i664 = this.AudioAttributesImplApi21Parcelizer;
                Object obj102 = objArr148[i664 - 1];
                objArr148[i664 - 1] = null;
                Object obj103 = objArr148[i664 - 2];
                objArr148[i664 - 2] = null;
                objArr148[i664 - 1] = obj103;
                objArr148[i664 - 2] = obj102;
                int i665 = i664 - 1;
                this.AudioAttributesImplApi21Parcelizer = i665;
                objArr148[i665] = null;
                return 0;
            case 548:
                int[] iArr434 = this.MediaBrowserCompatSearchResultReceiver;
                int i666 = this.AudioAttributesImplApi21Parcelizer;
                iArr434[i666] = 4;
                Object[] objArr149 = this.MediaBrowserCompatMediaItem;
                Object obj104 = objArr149[i666 - 1];
                objArr149[i666 - 1] = null;
                objArr149[i666] = obj104;
                iArr434[i666 - 1] = iArr434[i666];
                int i667 = i666 - 2;
                this.AudioAttributesImplApi21Parcelizer = i667;
                Object obj105 = objArr149[i667];
                objArr149[i667] = null;
                int i668 = iArr434[i666 - 1];
                Object obj106 = objArr149[i666];
                objArr149[i666] = null;
                ((Object[]) obj105)[i668] = obj106;
                return 0;
            case 549:
                Object[] objArr150 = this.MediaBrowserCompatMediaItem;
                int i669 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i669 + 1;
                Object obj107 = objArr150[i669 - 1];
                objArr150[i669 - 1] = null;
                objArr150[i669] = obj107;
                Object obj108 = objArr150[i669 - 2];
                objArr150[i669 - 2] = null;
                objArr150[i669 - 1] = obj108;
                objArr150[i669 - 2] = obj107;
                Object obj109 = objArr150[i669];
                objArr150[i669] = null;
                Object obj110 = objArr150[i669 - 1];
                objArr150[i669 - 1] = null;
                objArr150[i669] = obj110;
                objArr150[i669 - 1] = obj109;
                return 0;
            case 550:
                int[] iArr435 = this.MediaBrowserCompatSearchResultReceiver;
                int i670 = this.AudioAttributesImplApi21Parcelizer;
                iArr435[i670] = 3;
                Object[] objArr151 = this.MediaBrowserCompatMediaItem;
                Object obj111 = objArr151[i670 - 1];
                objArr151[i670 - 1] = null;
                objArr151[i670] = obj111;
                iArr435[i670 - 1] = iArr435[i670];
                int i671 = i670 - 2;
                this.AudioAttributesImplApi21Parcelizer = i671;
                Object obj112 = objArr151[i671];
                objArr151[i671] = null;
                int i672 = iArr435[i670 - 1];
                Object obj113 = objArr151[i670];
                objArr151[i670] = null;
                ((Object[]) obj112)[i672] = obj113;
                return 0;
            case 551:
                Object[] objArr152 = this.MediaBrowserCompatMediaItem;
                int i673 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i673 + 1;
                Object obj114 = objArr152[i673 - 1];
                objArr152[i673 - 1] = null;
                objArr152[i673] = obj114;
                Object obj115 = objArr152[i673 - 2];
                objArr152[i673 - 2] = null;
                objArr152[i673 - 1] = obj115;
                objArr152[i673 - 2] = obj114;
                return 0;
            case 552:
                int[] iArr436 = this.MediaBrowserCompatSearchResultReceiver;
                int i674 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i674 + 1;
                iArr436[i674] = 2;
                Object[] objArr153 = this.MediaBrowserCompatMediaItem;
                Object obj116 = objArr153[i674 - 1];
                objArr153[i674 - 1] = null;
                objArr153[i674] = obj116;
                iArr436[i674 - 1] = iArr436[i674];
                return 0;
            case 553:
                int i675 = this.AudioAttributesImplApi21Parcelizer;
                int i676 = i675 - 3;
                this.AudioAttributesImplApi21Parcelizer = i676;
                Object[] objArr154 = this.MediaBrowserCompatMediaItem;
                Object obj117 = objArr154[i676];
                objArr154[i676] = null;
                int i677 = this.MediaBrowserCompatSearchResultReceiver[i675 - 2];
                Object obj118 = objArr154[i675 - 1];
                objArr154[i675 - 1] = null;
                ((Object[]) obj117)[i677] = obj118;
                this.AudioAttributesImplApi21Parcelizer = i675 - 2;
                Object obj119 = objArr154[i675 - 4];
                objArr154[i675 - 4] = null;
                objArr154[i676] = obj119;
                long[] jArr9 = this.MediaDescriptionCompat;
                jArr9[i675 - 4] = jArr9[i675 - 5];
                objArr154[i675 - 5] = obj119;
                return 0;
            case RtspMessageChannel.DEFAULT_RTSP_PORT /* 554 */:
                Object[] objArr155 = this.MediaBrowserCompatMediaItem;
                int i678 = this.AudioAttributesImplApi21Parcelizer;
                Object obj120 = objArr155[i678 - 1];
                objArr155[i678 - 1] = null;
                Object obj121 = objArr155[i678 - 2];
                objArr155[i678 - 2] = null;
                objArr155[i678 - 1] = obj121;
                objArr155[i678 - 2] = obj120;
                this.AudioAttributesImplApi21Parcelizer = i678 + 1;
                Object obj122 = objArr155[i678 - 1];
                objArr155[i678 - 1] = null;
                objArr155[i678] = obj122;
                Object obj123 = objArr155[i678 - 2];
                objArr155[i678 - 2] = null;
                objArr155[i678 - 1] = obj123;
                objArr155[i678 - 2] = obj122;
                return 0;
            case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                Object[] objArr156 = this.MediaBrowserCompatMediaItem;
                int i679 = this.AudioAttributesImplApi21Parcelizer;
                Object obj124 = objArr156[i679 - 1];
                objArr156[i679 - 1] = null;
                Object obj125 = objArr156[i679 - 2];
                objArr156[i679 - 2] = null;
                objArr156[i679 - 1] = obj125;
                objArr156[i679 - 2] = obj124;
                int[] iArr437 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i679 + 1;
                iArr437[i679] = 1;
                Object obj126 = objArr156[i679 - 1];
                objArr156[i679 - 1] = null;
                objArr156[i679] = obj126;
                iArr437[i679 - 1] = iArr437[i679];
                return 0;
            case 556:
                int i680 = this.AudioAttributesImplApi21Parcelizer;
                int i681 = i680 - 3;
                this.AudioAttributesImplApi21Parcelizer = i681;
                Object[] objArr157 = this.MediaBrowserCompatMediaItem;
                Object obj127 = objArr157[i681];
                objArr157[i681] = null;
                int[] iArr438 = this.MediaBrowserCompatSearchResultReceiver;
                int i682 = iArr438[i680 - 2];
                Object obj128 = objArr157[i680 - 1];
                objArr157[i680 - 1] = null;
                ((Object[]) obj127)[i682] = obj128;
                this.AudioAttributesImplApi21Parcelizer = i680 - 2;
                Object obj129 = objArr157[i680 - 4];
                objArr157[i680 - 4] = null;
                objArr157[i681] = obj129;
                iArr438[i680 - 4] = iArr438[i680 - 5];
                objArr157[i680 - 5] = obj129;
                return 0;
            case 557:
                Object[] objArr158 = this.MediaBrowserCompatMediaItem;
                int i683 = this.AudioAttributesImplApi21Parcelizer;
                objArr158[i683] = objArr158[i683 - 1];
                int[] iArr439 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i683 + 2;
                iArr439[i683 + 1] = 2;
                return 0;
            case 558:
                Object[] objArr159 = this.MediaBrowserCompatMediaItem;
                int i684 = this.AudioAttributesImplApi21Parcelizer;
                objArr159[i684] = objArr159[i684 - 1];
                int[] iArr440 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i684 + 2;
                iArr440[i684 + 1] = 3;
                return 0;
            case 559:
                Object[] objArr160 = this.MediaBrowserCompatMediaItem;
                int i685 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i685 + 1;
                Object obj130 = objArr160[i685 - 1];
                objArr160[i685 - 1] = null;
                objArr160[i685] = obj130;
                Object obj131 = objArr160[i685 - 2];
                objArr160[i685 - 2] = null;
                objArr160[i685 - 1] = obj131;
                Object obj132 = objArr160[i685 - 3];
                objArr160[i685 - 3] = null;
                objArr160[i685 - 2] = obj132;
                objArr160[i685 - 3] = obj130;
                return 0;
            case 560:
                int[] iArr441 = this.MediaBrowserCompatSearchResultReceiver;
                int i686 = this.AudioAttributesImplApi21Parcelizer;
                iArr441[i686] = 3;
                iArr441[i686 - 1] = iArr441[i686 - 1] + iArr441[i686];
                this.AudioAttributesImplApi21Parcelizer = i686 + 1;
                iArr441[i686] = iArr441[i686 - 1];
                return 0;
            case 561:
                int[] iArr442 = this.MediaBrowserCompatSearchResultReceiver;
                int i687 = this.AudioAttributesImplApi21Parcelizer;
                iArr442[i687] = 62;
                iArr442[i687 + 1] = 0;
                int i688 = i687 + 1;
                this.AudioAttributesImplApi21Parcelizer = i688;
                iArr442[i687] = iArr442[i687] / iArr442[i688];
                return 0;
            case 562:
                Object[] objArr161 = this.MediaBrowserCompatMediaItem;
                int i689 = this.AudioAttributesImplApi21Parcelizer;
                objArr161[i689] = objArr161[12];
                this.AudioAttributesImplApi21Parcelizer = i689 + 2;
                objArr161[i689 + 1] = null;
                return 0;
            case 563:
                Object[] objArr162 = this.MediaBrowserCompatMediaItem;
                int i690 = this.AudioAttributesImplApi21Parcelizer;
                objArr162[i690] = objArr162[12];
                int[] iArr443 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i690 + 2;
                iArr443[i690 + 1] = 0;
                return 0;
            case 564:
                int i691 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr444 = this.MediaBrowserCompatSearchResultReceiver;
                iArr444[i691 - 2] = iArr444[i691 - 2] * iArr444[i691 - 1];
                int i692 = i691 - 2;
                this.AudioAttributesImplApi21Parcelizer = i692;
                this.MediaBrowserCompatMediaItem[i692] = null;
                return 0;
            case 565:
                int[] iArr445 = this.MediaBrowserCompatSearchResultReceiver;
                int i693 = this.AudioAttributesImplApi21Parcelizer;
                iArr445[i693] = 89;
                this.AudioAttributesImplApi21Parcelizer = i693 + 2;
                iArr445[i693 + 1] = 0;
                return 0;
            case 566:
                int i694 = this.AudioAttributesImplApi21Parcelizer;
                int i695 = i694 - 1;
                Object[] objArr163 = this.MediaBrowserCompatMediaItem;
                objArr163[i695] = null;
                objArr163[i695] = objArr163[12];
                this.AudioAttributesImplApi21Parcelizer = i694 + 1;
                objArr163[i694] = objArr163[11];
                return 0;
            case 567:
                int i696 = this.AudioAttributesImplApi21Parcelizer;
                int i697 = i696 - 3;
                this.AudioAttributesImplApi21Parcelizer = i697;
                Object[] objArr164 = this.MediaBrowserCompatMediaItem;
                Object obj133 = objArr164[i697];
                objArr164[i697] = null;
                int[] iArr446 = this.MediaBrowserCompatSearchResultReceiver;
                int i698 = iArr446[i696 - 2];
                Object obj134 = objArr164[i696 - 1];
                objArr164[i696 - 1] = null;
                ((Object[]) obj133)[i698] = obj134;
                objArr164[i697] = objArr164[13];
                this.AudioAttributesImplApi21Parcelizer = i696 - 1;
                iArr446[i696 - 2] = 1;
                return 0;
            case 568:
                int[] iArr447 = this.MediaBrowserCompatSearchResultReceiver;
                int i699 = this.AudioAttributesImplApi21Parcelizer;
                iArr447[i699] = 5;
                Object[] objArr165 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i699 + 2;
                objArr165[i699 + 1] = objArr165[11];
                return 0;
            case 569:
                int i700 = this.AudioAttributesImplApi21Parcelizer;
                int i701 = i700 - 1;
                Object[] objArr166 = this.MediaBrowserCompatMediaItem;
                Object obj135 = objArr166[i701];
                objArr166[i701] = null;
                objArr166[14] = obj135;
                objArr166[i701] = objArr166[13];
                int[] iArr448 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i700 + 1;
                iArr448[i700] = 6;
                return 0;
            case 570:
                Object[] objArr167 = this.MediaBrowserCompatMediaItem;
                int i702 = this.AudioAttributesImplApi21Parcelizer;
                objArr167[i702] = objArr167[14];
                int i703 = i702 - 2;
                this.AudioAttributesImplApi21Parcelizer = i703;
                Object obj136 = objArr167[i703];
                objArr167[i703] = null;
                int i704 = this.MediaBrowserCompatSearchResultReceiver[i702 - 1];
                Object obj137 = objArr167[i702];
                objArr167[i702] = null;
                ((Object[]) obj136)[i704] = obj137;
                return 0;
            case 571:
                Object[] objArr168 = this.MediaBrowserCompatMediaItem;
                int i705 = this.AudioAttributesImplApi21Parcelizer;
                objArr168[i705] = objArr168[13];
                this.MediaBrowserCompatSearchResultReceiver[i705 + 1] = 7;
                this.AudioAttributesImplApi21Parcelizer = i705 + 3;
                objArr168[i705 + 2] = objArr168[11];
                return 0;
            case 572:
                Object[] objArr169 = this.MediaBrowserCompatMediaItem;
                int i706 = this.AudioAttributesImplApi21Parcelizer;
                objArr169[i706] = objArr169[13];
                int[] iArr449 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i706 + 2;
                iArr449[i706 + 1] = 8;
                return 0;
            case 573:
                Object[] objArr170 = this.MediaBrowserCompatMediaItem;
                int i707 = this.AudioAttributesImplApi21Parcelizer;
                objArr170[i707] = objArr170[14];
                int i708 = i707 - 2;
                this.AudioAttributesImplApi21Parcelizer = i708;
                Object obj138 = objArr170[i708];
                objArr170[i708] = null;
                int i709 = this.MediaBrowserCompatSearchResultReceiver[i707 - 1];
                Object obj139 = objArr170[i707];
                objArr170[i707] = null;
                ((Object[]) obj138)[i709] = obj139;
                this.AudioAttributesImplApi21Parcelizer = i707 - 1;
                objArr170[i708] = objArr170[13];
                return 0;
            case 574:
                int i710 = this.AudioAttributesImplApi21Parcelizer;
                int i711 = i710 - 3;
                this.AudioAttributesImplApi21Parcelizer = i711;
                Object[] objArr171 = this.MediaBrowserCompatMediaItem;
                Object obj140 = objArr171[i711];
                objArr171[i711] = null;
                int[] iArr450 = this.MediaBrowserCompatSearchResultReceiver;
                int i712 = iArr450[i710 - 2];
                Object obj141 = objArr171[i710 - 1];
                objArr171[i710 - 1] = null;
                ((Object[]) obj140)[i712] = obj141;
                objArr171[i711] = objArr171[13];
                this.AudioAttributesImplApi21Parcelizer = i710 - 1;
                iArr450[i710 - 2] = 10;
                return 0;
            case 575:
                int[] iArr451 = this.MediaBrowserCompatSearchResultReceiver;
                int i713 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i713 + 1;
                iArr451[i713] = 119;
                return 0;
            case 576:
                Object[] objArr172 = this.MediaBrowserCompatMediaItem;
                int i714 = this.AudioAttributesImplApi21Parcelizer;
                objArr172[i714] = objArr172[12];
                int[] iArr452 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i714 + 2;
                iArr452[i714 + 1] = 108;
                return 0;
            case 577:
                Object[] objArr173 = this.MediaBrowserCompatMediaItem;
                int i715 = this.AudioAttributesImplApi21Parcelizer;
                objArr173[i715] = objArr173[12];
                objArr173[i715 + 1] = objArr173[15];
                this.AudioAttributesImplApi21Parcelizer = i715 + 3;
                objArr173[i715 + 2] = objArr173[16];
                return 0;
            case 578:
                Object[] objArr174 = this.MediaBrowserCompatMediaItem;
                int i716 = this.AudioAttributesImplApi21Parcelizer;
                objArr174[i716] = objArr174[12];
                this.AudioAttributesImplApi21Parcelizer = i716 + 2;
                objArr174[i716 + 1] = objArr174[15];
                return 0;
            case 579:
                int[] iArr453 = this.MediaBrowserCompatSearchResultReceiver;
                int i717 = this.AudioAttributesImplApi21Parcelizer;
                iArr453[i717] = iArr453[13];
                iArr453[i717 + 1] = iArr453[14];
                Object[] objArr175 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i717 + 3;
                objArr175[i717 + 2] = objArr175[11];
                return 0;
            case 580:
                int i718 = this.AudioAttributesImplApi21Parcelizer;
                int i719 = i718 - 1;
                int[] iArr454 = this.MediaBrowserCompatSearchResultReceiver;
                iArr454[i718 - 2] = iArr454[i718 - 2] ^ iArr454[i719];
                this.AudioAttributesImplApi21Parcelizer = i718;
                iArr454[i719] = iArr454[19];
                return 0;
            case 581:
                int i720 = this.AudioAttributesImplApi21Parcelizer;
                int i721 = i720 - 1;
                Object[] objArr176 = this.MediaBrowserCompatMediaItem;
                Object obj142 = objArr176[i721];
                objArr176[i721] = null;
                objArr176[12] = obj142;
                objArr176[i721] = objArr176[11];
                this.AudioAttributesImplApi21Parcelizer = i720 + 1;
                objArr176[i720] = objArr176[12];
                return 0;
            case 582:
                int i722 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i722;
                Object[] objArr177 = this.MediaBrowserCompatMediaItem;
                Object obj143 = objArr177[i722];
                objArr177[i722] = null;
                objArr177[17] = obj143;
                return 0;
            case 583:
                int[] iArr455 = this.MediaBrowserCompatSearchResultReceiver;
                int i723 = this.AudioAttributesImplApi21Parcelizer;
                iArr455[i723] = iArr455[15];
                this.AudioAttributesImplApi21Parcelizer = i723 + 2;
                iArr455[i723 + 1] = iArr455[14];
                return 0;
            case 584:
                int i724 = this.AudioAttributesImplApi21Parcelizer;
                int i725 = i724 - 1;
                Object[] objArr178 = this.MediaBrowserCompatMediaItem;
                Object obj144 = objArr178[i725];
                objArr178[i725] = null;
                objArr178[17] = obj144;
                this.AudioAttributesImplApi21Parcelizer = i724;
                objArr178[i725] = objArr178[11];
                return 0;
            case 585:
                int[] iArr456 = this.MediaBrowserCompatSearchResultReceiver;
                int i726 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i726 + 1;
                iArr456[i726] = 1205;
                return 0;
            case 586:
                Object[] objArr179 = this.MediaBrowserCompatMediaItem;
                int i727 = this.AudioAttributesImplApi21Parcelizer;
                objArr179[i727] = objArr179[i727 - 1];
                this.AudioAttributesImplApi21Parcelizer = i727;
                Object obj145 = objArr179[i727];
                objArr179[i727] = null;
                objArr179[17] = obj145;
                return 0;
            case 587:
                Object[] objArr180 = this.MediaBrowserCompatMediaItem;
                int i728 = this.AudioAttributesImplApi21Parcelizer;
                objArr180[i728] = null;
                this.AudioAttributesImplApi21Parcelizer = i728;
                Object obj146 = objArr180[i728];
                objArr180[i728] = null;
                objArr180[12] = obj146;
                return 0;
            case 588:
                Object[] objArr181 = this.MediaBrowserCompatMediaItem;
                int i729 = this.AudioAttributesImplApi21Parcelizer;
                objArr181[i729] = objArr181[12];
                this.AudioAttributesImplApi21Parcelizer = i729 + 2;
                objArr181[i729 + 1] = objArr181[11];
                return 0;
            case 589:
                int i730 = this.AudioAttributesImplApi21Parcelizer;
                int i731 = i730 - 1;
                Object[] objArr182 = this.MediaBrowserCompatMediaItem;
                objArr182[i731] = null;
                objArr182[i731] = objArr182[11];
                this.AudioAttributesImplApi21Parcelizer = i730 + 1;
                objArr182[i730] = null;
                return 0;
            case 590:
                int i732 = this.AudioAttributesImplApi21Parcelizer;
                int i733 = i732 - 1;
                float[] fArr19 = this.RatingCompat;
                fArr19[13] = fArr19[i733];
                int[] iArr457 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i732;
                iArr457[i733] = 1;
                return 0;
            case 591:
                Object[] objArr183 = this.MediaBrowserCompatMediaItem;
                int i734 = this.AudioAttributesImplApi21Parcelizer;
                objArr183[i734] = objArr183[i734 - 1];
                Object obj147 = objArr183[i734];
                objArr183[i734] = null;
                objArr183[16] = obj147;
                int[] iArr458 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i734 + 1;
                iArr458[i734] = 0;
                return 0;
            case 592:
                int i735 = this.AudioAttributesImplApi21Parcelizer;
                int i736 = i735 - 3;
                this.AudioAttributesImplApi21Parcelizer = i736;
                Object[] objArr184 = this.MediaBrowserCompatMediaItem;
                Object obj148 = objArr184[i736];
                objArr184[i736] = null;
                int i737 = this.MediaBrowserCompatSearchResultReceiver[i735 - 2];
                Object obj149 = objArr184[i735 - 1];
                objArr184[i735 - 1] = null;
                ((Object[]) obj148)[i737] = obj149;
                objArr184[i736] = objArr184[14];
                this.AudioAttributesImplApi21Parcelizer = i735 - 1;
                objArr184[i735 - 2] = objArr184[15];
                return 0;
            case 593:
                Object[] objArr185 = this.MediaBrowserCompatMediaItem;
                int i738 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i738 + 1;
                objArr185[i738] = objArr185[16];
                return 0;
            case 594:
                int i739 = this.AudioAttributesImplApi21Parcelizer;
                int i740 = i739 - 3;
                this.AudioAttributesImplApi21Parcelizer = i740;
                Object[] objArr186 = this.MediaBrowserCompatMediaItem;
                Object obj150 = objArr186[i740];
                objArr186[i740] = null;
                int[] iArr459 = this.MediaBrowserCompatSearchResultReceiver;
                int i741 = iArr459[i739 - 2];
                Object obj151 = objArr186[i739 - 1];
                objArr186[i739 - 1] = null;
                ((Object[]) obj150)[i741] = obj151;
                objArr186[i740] = objArr186[13];
                this.AudioAttributesImplApi21Parcelizer = i739 - 1;
                iArr459[i739 - 2] = 3;
                return 0;
            case 595:
                Object[] objArr187 = this.MediaBrowserCompatMediaItem;
                int i742 = this.AudioAttributesImplApi21Parcelizer;
                objArr187[i742] = objArr187[i742 - 1];
                Object obj152 = objArr187[i742];
                objArr187[i742] = null;
                objArr187[12] = obj152;
                this.AudioAttributesImplApi21Parcelizer = i742 + 1;
                objArr187[i742] = objArr187[13];
                return 0;
            case 596:
                int i743 = this.AudioAttributesImplApi21Parcelizer;
                int i744 = i743 - 3;
                this.AudioAttributesImplApi21Parcelizer = i744;
                Object[] objArr188 = this.MediaBrowserCompatMediaItem;
                Object obj153 = objArr188[i744];
                objArr188[i744] = null;
                int[] iArr460 = this.MediaBrowserCompatSearchResultReceiver;
                int i745 = iArr460[i743 - 2];
                Object obj154 = objArr188[i743 - 1];
                objArr188[i743 - 1] = null;
                ((Object[]) obj153)[i745] = obj154;
                objArr188[i744] = objArr188[12];
                this.AudioAttributesImplApi21Parcelizer = i743 - 1;
                iArr460[i743 - 2] = 1;
                return 0;
            case 597:
                int i746 = this.AudioAttributesImplApi21Parcelizer;
                int i747 = i746 - 1;
                Object[] objArr189 = this.MediaBrowserCompatMediaItem;
                Object obj155 = objArr189[i747];
                objArr189[i747] = null;
                objArr189[12] = obj155;
                int[] iArr461 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i746;
                iArr461[i747] = 0;
                return 0;
            case 598:
                int[] iArr462 = this.MediaBrowserCompatSearchResultReceiver;
                int i748 = this.AudioAttributesImplApi21Parcelizer;
                iArr462[i748] = 5;
                iArr462[i748 + 1] = 4;
                int i749 = i748 + 1;
                this.AudioAttributesImplApi21Parcelizer = i749;
                iArr462[i748] = iArr462[i748] << iArr462[i749];
                return 0;
            case 599:
                Object[] objArr190 = this.MediaBrowserCompatMediaItem;
                int i750 = this.AudioAttributesImplApi21Parcelizer;
                objArr190[i750] = objArr190[14];
                this.MediaBrowserCompatSearchResultReceiver[i750 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i750 + 3;
                objArr190[i750 + 2] = objArr190[12];
                return 0;
            case 600:
                Object[] objArr191 = this.MediaBrowserCompatMediaItem;
                int i751 = this.AudioAttributesImplApi21Parcelizer;
                objArr191[i751] = objArr191[14];
                this.MediaBrowserCompatSearchResultReceiver[i751 + 1] = 2;
                this.AudioAttributesImplApi21Parcelizer = i751 + 3;
                objArr191[i751 + 2] = objArr191[12];
                return 0;
            case 601:
                int i752 = this.AudioAttributesImplApi21Parcelizer;
                int i753 = i752 - 1;
                int[] iArr463 = this.MediaBrowserCompatSearchResultReceiver;
                iArr463[14] = iArr463[i753];
                Object[] objArr192 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i752;
                objArr192[i753] = objArr192[13];
                return 0;
            case 602:
                Object[] objArr193 = this.MediaBrowserCompatMediaItem;
                int i754 = this.AudioAttributesImplApi21Parcelizer;
                objArr193[i754 - 1] = new int[this.MediaBrowserCompatSearchResultReceiver[i754 - 1]];
                return 0;
            case 603:
                int i755 = this.AudioAttributesImplApi21Parcelizer;
                int i756 = i755 - 3;
                this.AudioAttributesImplApi21Parcelizer = i756;
                Object[] objArr194 = this.MediaBrowserCompatMediaItem;
                Object obj156 = objArr194[i756];
                objArr194[i756] = null;
                int[] iArr464 = this.MediaBrowserCompatSearchResultReceiver;
                ((int[]) obj156)[iArr464[i755 - 2]] = iArr464[i755 - 1];
                objArr194[i756] = objArr194[12];
                this.AudioAttributesImplApi21Parcelizer = i755 - 1;
                iArr464[i755 - 2] = 1;
                return 0;
            case 604:
                int i757 = this.AudioAttributesImplApi21Parcelizer;
                int i758 = i757 - 3;
                this.AudioAttributesImplApi21Parcelizer = i758;
                Object[] objArr195 = this.MediaBrowserCompatMediaItem;
                Object obj157 = objArr195[i758];
                objArr195[i758] = null;
                int[] iArr465 = this.MediaBrowserCompatSearchResultReceiver;
                ((int[]) obj157)[iArr465[i757 - 2]] = iArr465[i757 - 1];
                objArr195[i758] = objArr195[12];
                this.AudioAttributesImplApi21Parcelizer = i757 - 1;
                iArr465[i757 - 2] = 2;
                return 0;
            case 605:
                int i759 = this.AudioAttributesImplApi21Parcelizer;
                int i760 = i759 - 3;
                this.AudioAttributesImplApi21Parcelizer = i760;
                Object[] objArr196 = this.MediaBrowserCompatMediaItem;
                Object obj158 = objArr196[i760];
                objArr196[i760] = null;
                int[] iArr466 = this.MediaBrowserCompatSearchResultReceiver;
                ((int[]) obj158)[iArr466[i759 - 2]] = iArr466[i759 - 1];
                return 0;
            case 606:
                int[] iArr467 = this.MediaBrowserCompatSearchResultReceiver;
                int i761 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i761 + 1;
                iArr467[i761] = 3;
                this.MediaBrowserCompatMediaItem[i761] = new int[iArr467[i761]];
                return 0;
            case 607:
                Object[] objArr197 = this.MediaBrowserCompatMediaItem;
                int i762 = this.AudioAttributesImplApi21Parcelizer;
                objArr197[i762] = objArr197[13];
                int[] iArr468 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i762 + 2;
                iArr468[i762 + 1] = 1;
                return 0;
            case 608:
                Object[] objArr198 = this.MediaBrowserCompatMediaItem;
                int i763 = this.AudioAttributesImplApi21Parcelizer;
                objArr198[i763] = objArr198[13];
                int[] iArr469 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i763 + 2;
                iArr469[i763 + 1] = 2;
                return 0;
            case 609:
                int[] iArr470 = this.MediaBrowserCompatSearchResultReceiver;
                int i764 = this.AudioAttributesImplApi21Parcelizer;
                iArr470[i764] = 0;
                int i765 = i764 - 2;
                this.AudioAttributesImplApi21Parcelizer = i765;
                Object[] objArr199 = this.MediaBrowserCompatMediaItem;
                Object obj159 = objArr199[i765];
                objArr199[i765] = null;
                ((int[]) obj159)[iArr470[i764 - 1]] = iArr470[i764];
                return 0;
            case 610:
                int[] iArr471 = this.MediaBrowserCompatSearchResultReceiver;
                int i766 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr200 = this.MediaBrowserCompatMediaItem;
                Object obj160 = objArr200[i766 - 1];
                objArr200[i766 - 1] = null;
                iArr471[i766 - 1] = ((Object[]) obj160).length;
                return 0;
            case 611:
                int[] iArr472 = this.MediaBrowserCompatSearchResultReceiver;
                int i767 = this.AudioAttributesImplApi21Parcelizer;
                iArr472[i767] = 3;
                iArr472[i767 + 1] = 4;
                int i768 = i767 + 1;
                this.AudioAttributesImplApi21Parcelizer = i768;
                iArr472[i767] = iArr472[i767] - iArr472[i768];
                return 0;
            case 612:
                Object[] objArr201 = this.MediaBrowserCompatMediaItem;
                int i769 = this.AudioAttributesImplApi21Parcelizer;
                objArr201[i769] = objArr201[13];
                int[] iArr473 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i769 + 2;
                iArr473[i769 + 1] = iArr473[14];
                return 0;
            case 613:
                int[] iArr474 = this.MediaBrowserCompatSearchResultReceiver;
                int i770 = this.AudioAttributesImplApi21Parcelizer;
                iArr474[i770] = 27;
                this.AudioAttributesImplApi21Parcelizer = i770 + 2;
                iArr474[i770 + 1] = 0;
                return 0;
            case 614:
                long[] jArr10 = this.MediaDescriptionCompat;
                int i771 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i771 + 1;
                jArr10[i771] = jArr10[12];
                return 0;
            case 615:
                int i772 = this.AudioAttributesImplApi21Parcelizer;
                int i773 = i772 - 1;
                this.AudioAttributesImplApi21Parcelizer = i773;
                long[] jArr11 = this.MediaDescriptionCompat;
                jArr11[i772 - 2] = jArr11[i772 - 2] + jArr11[i773];
                return 0;
            case 616:
                int i774 = this.AudioAttributesImplApi21Parcelizer;
                int i775 = i774 - 1;
                Object[] objArr202 = this.MediaBrowserCompatMediaItem;
                Object obj161 = objArr202[i775];
                objArr202[i775] = null;
                objArr202[13] = obj161;
                int[] iArr475 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i774;
                iArr475[i775] = 0;
                return 0;
            case 617:
                int[] iArr476 = this.MediaBrowserCompatSearchResultReceiver;
                int i776 = this.AudioAttributesImplApi21Parcelizer;
                iArr476[i776] = 105;
                this.AudioAttributesImplApi21Parcelizer = i776;
                iArr476[i776 - 1] = iArr476[i776 - 1] + iArr476[i776];
                return 0;
            case 618:
                Object[] objArr203 = this.MediaBrowserCompatMediaItem;
                int i777 = this.AudioAttributesImplApi21Parcelizer;
                objArr203[i777] = objArr203[11];
                objArr203[i777 + 1] = objArr203[11];
                float[] fArr20 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i777 + 3;
                fArr20[i777 + 2] = fArr20[12];
                return 0;
            case 619:
                int[] iArr477 = this.MediaBrowserCompatSearchResultReceiver;
                int i778 = this.AudioAttributesImplApi21Parcelizer;
                iArr477[i778] = 21;
                this.AudioAttributesImplApi21Parcelizer = i778;
                iArr477[i778 - 1] = iArr477[i778 - 1] + iArr477[i778];
                return 0;
            case 620:
                int i779 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i779;
                Object[] objArr204 = this.MediaBrowserCompatMediaItem;
                Object obj162 = objArr204[i779];
                objArr204[i779] = null;
                objArr204[18] = obj162;
                return 0;
            case 621:
                int i780 = this.AudioAttributesImplApi21Parcelizer;
                int i781 = i780 - 1;
                Object[] objArr205 = this.MediaBrowserCompatMediaItem;
                Object obj163 = objArr205[i781];
                objArr205[i781] = null;
                objArr205[18] = obj163;
                this.AudioAttributesImplApi21Parcelizer = i780;
                objArr205[i781] = objArr205[12];
                return 0;
            case 622:
                int i782 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i782;
                Object[] objArr206 = this.MediaBrowserCompatMediaItem;
                Object obj164 = objArr206[i782];
                objArr206[i782] = null;
                objArr206[19] = obj164;
                return 0;
            case 623:
                int i783 = this.AudioAttributesImplApi21Parcelizer;
                int i784 = i783 - 1;
                int[] iArr478 = this.MediaBrowserCompatSearchResultReceiver;
                iArr478[15] = iArr478[i784];
                Object[] objArr207 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i783;
                objArr207[i784] = objArr207[12];
                return 0;
            case 624:
                int i785 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i785;
                int[] iArr479 = this.MediaBrowserCompatSearchResultReceiver;
                iArr479[17] = iArr479[i785];
                return 0;
            case 625:
                int i786 = this.AudioAttributesImplApi21Parcelizer;
                int i787 = i786 - 1;
                Object[] objArr208 = this.MediaBrowserCompatMediaItem;
                Object obj165 = objArr208[i787];
                objArr208[i787] = null;
                objArr208[20] = obj165;
                objArr208[i787] = objArr208[18];
                this.AudioAttributesImplApi21Parcelizer = i786 + 1;
                objArr208[i786] = objArr208[19];
                return 0;
            case 626:
                Object[] objArr209 = this.MediaBrowserCompatMediaItem;
                int i788 = this.AudioAttributesImplApi21Parcelizer;
                objArr209[i788] = objArr209[13];
                objArr209[i788 + 1] = objArr209[20];
                this.AudioAttributesImplApi21Parcelizer = i788 + 3;
                objArr209[i788 + 2] = objArr209[14];
                return 0;
            case 627:
                Object[] objArr210 = this.MediaBrowserCompatMediaItem;
                int i789 = this.AudioAttributesImplApi21Parcelizer;
                objArr210[i789] = objArr210[i789 - 1];
                this.AudioAttributesImplApi21Parcelizer = i789;
                Object obj166 = objArr210[i789];
                objArr210[i789] = null;
                objArr210[18] = obj166;
                return 0;
            case 628:
                int[] iArr480 = this.MediaBrowserCompatSearchResultReceiver;
                int i790 = this.AudioAttributesImplApi21Parcelizer;
                iArr480[i790] = 9;
                iArr480[i790 + 1] = 0;
                int i791 = i790 + 1;
                this.AudioAttributesImplApi21Parcelizer = i791;
                iArr480[i790] = iArr480[i790] / iArr480[i791];
                return 0;
            case 629:
                int[] iArr481 = this.MediaBrowserCompatSearchResultReceiver;
                int i792 = this.AudioAttributesImplApi21Parcelizer;
                iArr481[i792] = 2;
                Object[] objArr211 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i792 + 2;
                objArr211[i792 + 1] = objArr211[11];
                return 0;
            case 630:
                int[] iArr482 = this.MediaBrowserCompatSearchResultReceiver;
                int i793 = this.AudioAttributesImplApi21Parcelizer;
                iArr482[i793] = 109;
                iArr482[i793 - 1] = iArr482[i793 - 1] + iArr482[i793];
                this.AudioAttributesImplApi21Parcelizer = i793 + 1;
                iArr482[i793] = iArr482[i793 - 1];
                return 0;
            case 631:
                int[] iArr483 = this.MediaBrowserCompatSearchResultReceiver;
                int i794 = this.AudioAttributesImplApi21Parcelizer;
                iArr483[i794] = 51;
                iArr483[i794 + 1] = 0;
                int i795 = i794 + 1;
                this.AudioAttributesImplApi21Parcelizer = i795;
                iArr483[i794] = iArr483[i794] / iArr483[i795];
                return 0;
            case 632:
                Object[] objArr212 = this.MediaBrowserCompatMediaItem;
                int i796 = this.AudioAttributesImplApi21Parcelizer;
                objArr212[i796] = objArr212[14];
                float[] fArr21 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i796 + 2;
                fArr21[i796 + 1] = fArr21[13];
                return 0;
            case 633:
                int[] iArr484 = this.MediaBrowserCompatSearchResultReceiver;
                int i797 = this.AudioAttributesImplApi21Parcelizer;
                iArr484[i797] = 29;
                iArr484[i797 - 1] = iArr484[i797 - 1] + iArr484[i797];
                this.AudioAttributesImplApi21Parcelizer = i797 + 1;
                iArr484[i797] = iArr484[i797 - 1];
                return 0;
            case 634:
                Object[] objArr213 = this.MediaBrowserCompatMediaItem;
                int i798 = this.AudioAttributesImplApi21Parcelizer;
                objArr213[i798] = objArr213[i798 - 1];
                this.AudioAttributesImplApi21Parcelizer = i798;
                Object obj167 = objArr213[i798];
                objArr213[i798] = null;
                objArr213[15] = obj167;
                return 0;
            case 635:
                int i799 = this.AudioAttributesImplApi21Parcelizer;
                int i800 = i799 - 1;
                Object[] objArr214 = this.MediaBrowserCompatMediaItem;
                Object obj168 = objArr214[i800];
                objArr214[i800] = null;
                objArr214[15] = obj168;
                this.MediaBrowserCompatSearchResultReceiver[i800] = 0;
                this.AudioAttributesImplApi21Parcelizer = i799 + 1;
                objArr214[i799] = objArr214[12];
                return 0;
            case 636:
                Object[] objArr215 = this.MediaBrowserCompatMediaItem;
                int i801 = this.AudioAttributesImplApi21Parcelizer;
                objArr215[i801] = objArr215[14];
                this.AudioAttributesImplApi21Parcelizer = i801 + 2;
                objArr215[i801 + 1] = objArr215[15];
                return 0;
            case 637:
                int i802 = this.AudioAttributesImplApi21Parcelizer;
                int i803 = i802 - 2;
                this.AudioAttributesImplApi21Parcelizer = i803;
                Object[] objArr216 = this.MediaBrowserCompatMediaItem;
                Object obj169 = objArr216[i803];
                objArr216[i803] = null;
                Object obj170 = objArr216[i802 - 1];
                objArr216[i802 - 1] = null;
                this.RemoteActionCompatParcelizer = obj169 == obj170 ? 0 : 1;
                return 0;
            case 638:
                int[] iArr485 = this.MediaBrowserCompatSearchResultReceiver;
                int i804 = this.AudioAttributesImplApi21Parcelizer;
                iArr485[i804] = 4;
                iArr485[i804 + 1] = 3;
                int i805 = i804 + 1;
                this.AudioAttributesImplApi21Parcelizer = i805;
                iArr485[i804] = iArr485[i804] + iArr485[i805];
                return 0;
            case 639:
                int[] iArr486 = this.MediaBrowserCompatSearchResultReceiver;
                int i806 = this.AudioAttributesImplApi21Parcelizer;
                iArr486[i806] = 52;
                this.AudioAttributesImplApi21Parcelizer = i806 + 2;
                iArr486[i806 + 1] = 0;
                return 0;
            case 640:
                int i807 = this.AudioAttributesImplApi21Parcelizer;
                int i808 = i807 - 1;
                Object[] objArr217 = this.MediaBrowserCompatMediaItem;
                Object obj171 = objArr217[i808];
                objArr217[i808] = null;
                objArr217[15] = obj171;
                this.AudioAttributesImplApi21Parcelizer = i807;
                objArr217[i808] = objArr217[11];
                return 0;
            case 641:
                Object[] objArr218 = this.MediaBrowserCompatMediaItem;
                int i809 = this.AudioAttributesImplApi21Parcelizer;
                objArr218[i809] = objArr218[15];
                this.AudioAttributesImplApi21Parcelizer = i809 + 2;
                objArr218[i809 + 1] = objArr218[12];
                return 0;
            case 642:
                int i810 = this.AudioAttributesImplApi21Parcelizer;
                int i811 = i810 - 1;
                Object[] objArr219 = this.MediaBrowserCompatMediaItem;
                Object obj172 = objArr219[i811];
                objArr219[i811] = null;
                objArr219[12] = obj172;
                objArr219[i811] = null;
                int i812 = i810 - 1;
                this.AudioAttributesImplApi21Parcelizer = i812;
                Object obj173 = objArr219[i812];
                objArr219[i812] = null;
                objArr219[13] = obj173;
                return 0;
            case 643:
                int[] iArr487 = this.MediaBrowserCompatSearchResultReceiver;
                int i813 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i813 + 1;
                iArr487[i813] = 225;
                return 0;
            case 644:
                int[] iArr488 = this.MediaBrowserCompatSearchResultReceiver;
                int i814 = this.AudioAttributesImplApi21Parcelizer;
                iArr488[i814] = 113;
                this.AudioAttributesImplApi21Parcelizer = i814;
                iArr488[i814 - 1] = iArr488[i814 - 1] + iArr488[i814];
                return 0;
            case 645:
                Object[] objArr220 = this.MediaBrowserCompatMediaItem;
                int i815 = this.AudioAttributesImplApi21Parcelizer;
                objArr220[i815] = objArr220[15];
                objArr220[i815 + 1] = objArr220[12];
                this.AudioAttributesImplApi21Parcelizer = i815 + 3;
                objArr220[i815 + 2] = objArr220[13];
                return 0;
            case 646:
                int[] iArr489 = this.MediaBrowserCompatSearchResultReceiver;
                int i816 = this.AudioAttributesImplApi21Parcelizer;
                iArr489[i816] = 1;
                this.AudioAttributesImplApi21Parcelizer = i816 + 2;
                iArr489[i816 + 1] = 0;
                return 0;
            case 647:
                Object[] objArr221 = this.MediaBrowserCompatMediaItem;
                int i817 = this.AudioAttributesImplApi21Parcelizer;
                objArr221[i817] = objArr221[12];
                int[] iArr490 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i817 + 2;
                iArr490[i817 + 1] = 2;
                return 0;
            case 648:
                int[] iArr491 = this.MediaBrowserCompatSearchResultReceiver;
                int i818 = this.AudioAttributesImplApi21Parcelizer;
                iArr491[i818] = 4;
                this.AudioAttributesImplApi21Parcelizer = i818 + 2;
                iArr491[i818 + 1] = 3;
                return 0;
            case 649:
                int i819 = this.AudioAttributesImplApi21Parcelizer;
                int i820 = i819 - 1;
                this.AudioAttributesImplApi21Parcelizer = i820;
                int[] iArr492 = this.MediaBrowserCompatSearchResultReceiver;
                iArr492[i819 - 2] = iArr492[i819 - 2] >>> iArr492[i820];
                return 0;
            case 650:
                Object[] objArr222 = this.MediaBrowserCompatMediaItem;
                int i821 = this.AudioAttributesImplApi21Parcelizer;
                objArr222[i821] = objArr222[12];
                this.AudioAttributesImplApi21Parcelizer = i821 + 2;
                objArr222[i821 + 1] = objArr222[14];
                return 0;
            case 651:
                int[] iArr493 = this.MediaBrowserCompatSearchResultReceiver;
                int i822 = this.AudioAttributesImplApi21Parcelizer;
                iArr493[i822] = 1;
                this.AudioAttributesImplApi21Parcelizer = i822 + 2;
                iArr493[i822 + 1] = 1;
                return 0;
            case 652:
                int i823 = this.AudioAttributesImplApi21Parcelizer;
                int i824 = i823 - 1;
                Object[] objArr223 = this.MediaBrowserCompatMediaItem;
                Object obj174 = objArr223[i824];
                objArr223[i824] = null;
                objArr223[14] = obj174;
                objArr223[i824] = objArr223[15];
                this.AudioAttributesImplApi21Parcelizer = i823 + 1;
                objArr223[i823] = objArr223[12];
                return 0;
            case 653:
                int[] iArr494 = this.MediaBrowserCompatSearchResultReceiver;
                int i825 = this.AudioAttributesImplApi21Parcelizer;
                iArr494[i825] = 1;
                Object[] objArr224 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i825 + 2;
                objArr224[i825 + 1] = objArr224[14];
                return 0;
            case 654:
                int[] iArr495 = this.MediaBrowserCompatSearchResultReceiver;
                int i826 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i826 + 1;
                iArr495[i826] = 175;
                return 0;
            case 655:
                Object[] objArr225 = this.MediaBrowserCompatMediaItem;
                int i827 = this.AudioAttributesImplApi21Parcelizer;
                objArr225[i827] = objArr225[14];
                this.AudioAttributesImplApi21Parcelizer = i827;
                Object obj175 = objArr225[i827];
                objArr225[i827] = null;
                objArr225[13] = obj175;
                return 0;
            case 656:
                int[] iArr496 = this.MediaBrowserCompatSearchResultReceiver;
                int i828 = this.AudioAttributesImplApi21Parcelizer;
                iArr496[i828] = 4;
                this.AudioAttributesImplApi21Parcelizer = i828 + 2;
                iArr496[i828 + 1] = 4;
                return 0;
            case 657:
                int[] iArr497 = this.MediaBrowserCompatSearchResultReceiver;
                int i829 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i829 + 1;
                iArr497[i829] = 98;
                return 0;
            case 658:
                Object[] objArr226 = this.MediaBrowserCompatMediaItem;
                int i830 = this.AudioAttributesImplApi21Parcelizer;
                objArr226[i830] = objArr226[i830 - 1];
                Object obj176 = objArr226[i830];
                objArr226[i830] = null;
                objArr226[14] = obj176;
                int[] iArr498 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i830 + 1;
                iArr498[i830] = 0;
                return 0;
            case 659:
                Object[] objArr227 = this.MediaBrowserCompatMediaItem;
                int i831 = this.AudioAttributesImplApi21Parcelizer;
                objArr227[i831] = objArr227[14];
                this.MediaBrowserCompatSearchResultReceiver[i831 + 1] = 1;
                this.AudioAttributesImplApi21Parcelizer = i831 + 3;
                objArr227[i831 + 2] = objArr227[13];
                return 0;
            case 660:
                int i832 = this.AudioAttributesImplApi21Parcelizer;
                int i833 = i832 - 1;
                Object[] objArr228 = this.MediaBrowserCompatMediaItem;
                Object obj177 = objArr228[i833];
                objArr228[i833] = null;
                objArr228[14] = obj177;
                this.AudioAttributesImplApi21Parcelizer = i832;
                objArr228[i833] = objArr228[15];
                return 0;
            case 661:
                int i834 = this.AudioAttributesImplApi21Parcelizer;
                int i835 = i834 - 1;
                Object[] objArr229 = this.MediaBrowserCompatMediaItem;
                Object obj178 = objArr229[i835];
                objArr229[i835] = null;
                objArr229[12] = obj178;
                this.AudioAttributesImplApi21Parcelizer = i834;
                objArr229[i835] = objArr229[14];
                return 0;
            case 662:
                int[] iArr499 = this.MediaBrowserCompatSearchResultReceiver;
                int i836 = this.AudioAttributesImplApi21Parcelizer;
                iArr499[i836] = 5;
                iArr499[i836 + 1] = 5;
                int i837 = i836 + 1;
                this.AudioAttributesImplApi21Parcelizer = i837;
                iArr499[i836] = iArr499[i836] >> iArr499[i837];
                return 0;
            case 663:
                Object[] objArr230 = this.MediaBrowserCompatMediaItem;
                int i838 = this.AudioAttributesImplApi21Parcelizer;
                objArr230[i838] = objArr230[14];
                this.AudioAttributesImplApi21Parcelizer = i838 + 2;
                objArr230[i838 + 1] = objArr230[12];
                return 0;
            case 664:
                int i839 = this.AudioAttributesImplApi21Parcelizer;
                int i840 = i839 - 1;
                Object[] objArr231 = this.MediaBrowserCompatMediaItem;
                Object obj179 = objArr231[i840];
                objArr231[i840] = null;
                objArr231[13] = obj179;
                objArr231[i840] = objArr231[14];
                this.AudioAttributesImplApi21Parcelizer = i839 + 1;
                objArr231[i839] = objArr231[12];
                return 0;
            case 665:
                int[] iArr500 = this.MediaBrowserCompatSearchResultReceiver;
                int i841 = this.AudioAttributesImplApi21Parcelizer;
                iArr500[i841] = 13;
                this.AudioAttributesImplApi21Parcelizer = i841 + 2;
                iArr500[i841 + 1] = 0;
                return 0;
            case 666:
                int[] iArr501 = this.MediaBrowserCompatSearchResultReceiver;
                int i842 = this.AudioAttributesImplApi21Parcelizer;
                iArr501[i842] = 88;
                this.AudioAttributesImplApi21Parcelizer = i842 + 2;
                iArr501[i842 + 1] = 0;
                return 0;
            case 667:
                int[] iArr502 = this.MediaBrowserCompatSearchResultReceiver;
                int i843 = this.AudioAttributesImplApi21Parcelizer;
                iArr502[i843] = 61;
                iArr502[i843 - 1] = iArr502[i843 - 1] + iArr502[i843];
                this.AudioAttributesImplApi21Parcelizer = i843 + 1;
                iArr502[i843] = iArr502[i843 - 1];
                return 0;
            case 668:
                int[] iArr503 = this.MediaBrowserCompatSearchResultReceiver;
                int i844 = this.AudioAttributesImplApi21Parcelizer;
                iArr503[i844] = 0;
                iArr503[16] = iArr503[i844];
                Object[] objArr232 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i844 + 1;
                objArr232[i844] = objArr232[13];
                return 0;
            case 669:
                int[] iArr504 = this.MediaBrowserCompatSearchResultReceiver;
                int i845 = this.AudioAttributesImplApi21Parcelizer;
                iArr504[i845] = iArr504[17];
                this.AudioAttributesImplApi21Parcelizer = i845 + 2;
                iArr504[i845 + 1] = iArr504[15];
                return 0;
            case 670:
                int[] iArr505 = this.MediaBrowserCompatSearchResultReceiver;
                int i846 = this.AudioAttributesImplApi21Parcelizer;
                iArr505[i846] = iArr505[16];
                Object[] objArr233 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i846 + 2;
                objArr233[i846 + 1] = objArr233[12];
                return 0;
            case 671:
                Object[] objArr234 = this.MediaBrowserCompatMediaItem;
                int i847 = this.AudioAttributesImplApi21Parcelizer;
                objArr234[i847] = objArr234[15];
                this.AudioAttributesImplApi21Parcelizer = i847 + 2;
                objArr234[i847 + 1] = objArr234[13];
                return 0;
            case 672:
                Object[] objArr235 = this.MediaBrowserCompatMediaItem;
                int i848 = this.AudioAttributesImplApi21Parcelizer;
                objArr235[i848] = objArr235[15];
                objArr235[i848 + 1] = objArr235[13];
                this.AudioAttributesImplApi21Parcelizer = i848 + 3;
                objArr235[i848 + 2] = objArr235[14];
                return 0;
            case 673:
                int[] iArr506 = this.MediaBrowserCompatSearchResultReceiver;
                iArr506[16] = iArr506[16] + 1;
                return 0;
            case 674:
                int i849 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr507 = this.MediaBrowserCompatSearchResultReceiver;
                iArr507[i849 - 2] = iArr507[i849 - 2] >>> iArr507[i849 - 1];
                int i850 = i849 - 2;
                this.AudioAttributesImplApi21Parcelizer = i850;
                this.MediaBrowserCompatMediaItem[i850] = null;
                return 0;
            case 675:
                Object[] objArr236 = this.MediaBrowserCompatMediaItem;
                int i851 = this.AudioAttributesImplApi21Parcelizer;
                objArr236[i851] = objArr236[12];
                this.MediaBrowserCompatSearchResultReceiver[i851 + 1] = 5;
                this.AudioAttributesImplApi21Parcelizer = i851 + 3;
                objArr236[i851 + 2] = objArr236[11];
                return 0;
            case 676:
                int[] iArr508 = this.MediaBrowserCompatSearchResultReceiver;
                int i852 = this.AudioAttributesImplApi21Parcelizer;
                iArr508[i852] = 0;
                Object[] objArr237 = this.MediaBrowserCompatMediaItem;
                objArr237[i852 + 1] = objArr237[16];
                int i853 = i852 - 1;
                this.AudioAttributesImplApi21Parcelizer = i853;
                Object obj180 = objArr237[i853];
                objArr237[i853] = null;
                int i854 = iArr508[i852];
                Object obj181 = objArr237[i852 + 1];
                objArr237[i852 + 1] = null;
                ((Object[]) obj180)[i854] = obj181;
                return 0;
            case 677:
                int i855 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr509 = this.MediaBrowserCompatSearchResultReceiver;
                iArr509[i855 - 2] = iArr509[i855 - 2] >> iArr509[i855 - 1];
                int i856 = i855 - 2;
                this.AudioAttributesImplApi21Parcelizer = i856;
                this.MediaBrowserCompatMediaItem[i856] = null;
                return 0;
            case 678:
                int i857 = this.AudioAttributesImplApi21Parcelizer;
                int i858 = i857 - 1;
                Object[] objArr238 = this.MediaBrowserCompatMediaItem;
                Object obj182 = objArr238[i858];
                objArr238[i858] = null;
                objArr238[14] = obj182;
                objArr238[i858] = objArr238[12];
                this.AudioAttributesImplApi21Parcelizer = i857 + 1;
                objArr238[i857] = objArr238[14];
                return 0;
            case 679:
                int[] iArr510 = this.MediaBrowserCompatSearchResultReceiver;
                int i859 = this.AudioAttributesImplApi21Parcelizer;
                iArr510[i859] = 31;
                iArr510[i859 + 1] = 0;
                int i860 = i859 + 1;
                this.AudioAttributesImplApi21Parcelizer = i860;
                iArr510[i859] = iArr510[i859] / iArr510[i860];
                return 0;
            default:
                return i;
        }
    }

    public containsTrack(Object obj, Object obj2, Object obj3) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, float f, Object obj2) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        float[] fArr = new float[23];
        this.RatingCompat = fArr;
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        fArr[12] = f;
        objArr[13] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, int i) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, int i, Object obj2) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        objArr[13] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i, Object obj3) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        objArr[14] = obj3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        objArr[14] = obj4;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, float f) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        float[] fArr = new float[23];
        this.RatingCompat = fArr;
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        fArr[12] = f;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i, int i2, int i3) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        iArr[14] = i2;
        iArr[15] = i3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4, int i4, int i5) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        iArr[14] = i;
        iArr[15] = i2;
        iArr[16] = i3;
        objArr[17] = obj4;
        iArr[18] = i4;
        iArr[19] = i5;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        iArr[14] = i;
        iArr[15] = i2;
        iArr[16] = i3;
        iArr[17] = i4;
        iArr[18] = i5;
        iArr[19] = i6;
        iArr[20] = i7;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4, Object obj4, int i5, int i6, int i7) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        iArr[14] = i;
        iArr[15] = i2;
        iArr[16] = i3;
        iArr[17] = i4;
        objArr[18] = obj4;
        iArr[19] = i5;
        iArr[20] = i6;
        iArr[21] = i7;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, int i, int i2) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        iArr[13] = i2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        objArr[14] = obj4;
        objArr[15] = obj5;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, float f, float f2) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        this.MediaDescriptionCompat = new long[23];
        float[] fArr = new float[23];
        this.RatingCompat = fArr;
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        fArr[12] = f;
        fArr[13] = f2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, int i, int i2, Object obj2) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        iArr[13] = i2;
        objArr[14] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i, int i2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        iArr[14] = i2;
        objArr[15] = obj3;
        objArr[16] = obj4;
        objArr[17] = obj5;
        objArr[18] = obj6;
        iArr[19] = i3;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        iArr[13] = i2;
        iArr[14] = i3;
        iArr[15] = i4;
        iArr[16] = i5;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, long j) {
        this.MediaBrowserCompatSearchResultReceiver = new int[23];
        long[] jArr = new long[23];
        this.MediaDescriptionCompat = jArr;
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        jArr[12] = j;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i, Object obj3, long j) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        long[] jArr = new long[23];
        this.MediaDescriptionCompat = jArr;
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        objArr[14] = obj3;
        jArr[15] = j;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        objArr[14] = obj4;
        iArr[15] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public containsTrack(Object obj, Object obj2, int i, int i2) {
        int[] iArr = new int[23];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        this.MediaDescriptionCompat = new long[23];
        this.RatingCompat = new float[23];
        this.MediaMetadataCompat = new double[23];
        Object[] objArr = new Object[23];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        iArr[14] = i2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }
}
