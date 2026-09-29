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

/* JADX INFO: loaded from: classes5.dex */
public class filterRequirements {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public float AudioAttributesImplApi26Parcelizer;
    public Object AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    public double MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final long[] MediaBrowserCompatMediaItem;
    private final double[] MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private final float[] MediaMetadataCompat;
    private final int[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    private final Object[] onAddQueueItem;
    public float read;
    public int write;

    public filterRequirements(Object obj, Object obj2, int i) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        iArr[13] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.onAddQueueItem;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                objArr[i2] = this.MediaBrowserCompatItemReceiver;
                return 0;
            case 2:
                int[] iArr = this.RatingCompat;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                iArr[i3] = 58;
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplApi21Parcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4;
                this.MediaDescriptionCompat = i4;
                return 0;
            case 4:
                Object[] objArr2 = this.onAddQueueItem;
                int i5 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i5 + 1;
                Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.AudioAttributesImplBaseParcelizer = obj;
                return 0;
            case 5:
                int[] iArr2 = this.RatingCompat;
                int i6 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i6 + 1;
                this.write = iArr2[i6];
                return 0;
            case 6:
                int[] iArr3 = this.RatingCompat;
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i7 + 1;
                iArr3[i7] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 7:
                int[] iArr4 = this.RatingCompat;
                int i8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                iArr4[i8] = 0;
                return 0;
            case 8:
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = i9 - 1;
                this.AudioAttributesImplApi21Parcelizer = i10;
                int[] iArr5 = this.RatingCompat;
                iArr5[i9 - 2] = iArr5[i9 - 2] + iArr5[i10];
                return 0;
            case 9:
                int[] iArr6 = this.RatingCompat;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                iArr6[i11 - 1] = (byte) iArr6[i11 - 1];
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                iArr6[i11] = 11;
                return 0;
            case 10:
                int[] iArr7 = this.RatingCompat;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                iArr7[i12] = 16;
                iArr7[i12 - 1] = iArr7[i12 - 1] >> iArr7[i12];
                int i13 = i12 - 1;
                this.AudioAttributesImplApi21Parcelizer = i13;
                iArr7[i12 - 2] = iArr7[i12 - 2] + iArr7[i13];
                return 0;
            case 11:
                int[] iArr8 = this.RatingCompat;
                int i14 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i14 + 1;
                iArr8[i14] = 1;
                return 0;
            case 12:
                Object[] objArr3 = this.onAddQueueItem;
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                objArr3[i15] = objArr3[i15 - 1];
                this.AudioAttributesImplApi21Parcelizer = i15;
                Object obj2 = objArr3[i15];
                objArr3[i15] = null;
                objArr3[25] = obj2;
                return 0;
            case 13:
                Object[] objArr4 = this.onAddQueueItem;
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i16 + 1;
                objArr4[i16] = objArr4[25];
                return 0;
            case 14:
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                int i18 = i17 - 1;
                this.AudioAttributesImplApi21Parcelizer = i18;
                Object[] objArr5 = this.onAddQueueItem;
                Object obj3 = objArr5[i17 - 2];
                objArr5[i17 - 2] = null;
                objArr5[i17 - 2] = ((Object[]) obj3)[this.RatingCompat[i18]];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i19;
                Object[] objArr6 = this.onAddQueueItem;
                Object obj4 = objArr6[i19];
                objArr6[i19] = null;
                objArr6[23] = obj4;
                return 0;
            case 16:
                int[] iArr9 = this.RatingCompat;
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i20 + 1;
                iArr9[i20] = 70;
                return 0;
            case 17:
                int[] iArr10 = this.RatingCompat;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                iArr10[i21] = 0;
                this.AudioAttributesImplApi21Parcelizer = i21 + 2;
                iArr10[i21 + 1] = 0;
                return 0;
            case 18:
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = i22 - 1;
                this.AudioAttributesImplApi21Parcelizer = i23;
                int[] iArr11 = this.RatingCompat;
                iArr11[i22 - 2] = iArr11[i22 - 2] - iArr11[i23];
                return 0;
            case 19:
                int[] iArr12 = this.RatingCompat;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                iArr12[i24 - 1] = (byte) iArr12[i24 - 1];
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                iArr12[i24] = 22;
                return 0;
            case 20:
                long[] jArr = this.MediaBrowserCompatMediaItem;
                int i25 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i25 + 1;
                this.IconCompatParcelizer = jArr[i25];
                return 0;
            case 21:
                long[] jArr2 = this.MediaBrowserCompatMediaItem;
                int i26 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i26 + 1;
                jArr2[i26] = 0;
                return 0;
            case 22:
                Object[] objArr7 = this.onAddQueueItem;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i27 + 1;
                objArr7[i27] = objArr7[i27 - 1];
                return 0;
            case 23:
                int i28 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i28;
                Object[] objArr8 = this.onAddQueueItem;
                Object obj5 = objArr8[i28];
                objArr8[i28] = null;
                objArr8[25] = obj5;
                return 0;
            case 24:
                Object[] objArr9 = this.onAddQueueItem;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                objArr9[i29] = objArr9[25];
                int[] iArr13 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i29 + 2;
                iArr13[i29 + 1] = 0;
                return 0;
            case 25:
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                int i31 = i30 - 1;
                Object[] objArr10 = this.onAddQueueItem;
                Object obj6 = objArr10[i31];
                objArr10[i31] = null;
                objArr10[24] = obj6;
                objArr10[i31] = null;
                int i32 = i30 - 1;
                this.AudioAttributesImplApi21Parcelizer = i32;
                Object obj7 = objArr10[i32];
                objArr10[i32] = null;
                objArr10[14] = obj7;
                return 0;
            case 26:
                int i33 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i33;
                int[] iArr14 = this.RatingCompat;
                iArr14[15] = iArr14[i33];
                return 0;
            case 27:
                Object[] objArr11 = this.onAddQueueItem;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i34 + 1;
                objArr11[i34] = null;
                return 0;
            case 28:
                int i35 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i35;
                Object[] objArr12 = this.onAddQueueItem;
                Object obj8 = objArr12[i35];
                objArr12[i35] = null;
                objArr12[16] = obj8;
                return 0;
            case 29:
                int i36 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = i36 - 2;
                this.AudioAttributesImplApi21Parcelizer = i37;
                int[] iArr15 = this.RatingCompat;
                this.write = iArr15[i37] >= iArr15[i36 - 1] ? 0 : 1;
                return 0;
            case 30:
                int[] iArr16 = this.RatingCompat;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i38 + 1;
                iArr16[i38] = 24;
                return 0;
            case 31:
                int[] iArr17 = this.RatingCompat;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                iArr17[i39] = iArr17[13];
                this.AudioAttributesImplApi21Parcelizer = i39 + 2;
                iArr17[i39 + 1] = 16;
                return 0;
            case 32:
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = i40 - 1;
                this.AudioAttributesImplApi21Parcelizer = i41;
                int[] iArr18 = this.RatingCompat;
                iArr18[i40 - 2] = iArr18[i40 - 2] & iArr18[i41];
                return 0;
            case 33:
                int i42 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i42;
                this.write = this.RatingCompat[i42] != 0 ? 0 : 1;
                return 0;
            case 34:
                int[] iArr19 = this.RatingCompat;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i43 + 1;
                iArr19[i43] = 57;
                return 0;
            case 35:
                int[] iArr20 = this.RatingCompat;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i44] = iArr20[15];
                Object[] objArr13 = this.onAddQueueItem;
                objArr13[i44 + 1] = null;
                this.AudioAttributesImplApi21Parcelizer = i44 + 3;
                objArr13[i44 + 2] = null;
                return 0;
            case 36:
                Object[] objArr14 = this.onAddQueueItem;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                Object obj9 = objArr14[i45 - 1];
                objArr14[i45 - 1] = null;
                this.AudioAttributesImplBaseParcelizer = obj9;
                return 0;
            case 37:
                int i46 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i46;
                Object[] objArr15 = this.onAddQueueItem;
                Object obj10 = objArr15[i46];
                objArr15[i46] = null;
                this.write = obj10 == null ? 0 : 1;
                return 0;
            case 38:
                Object[] objArr16 = this.onAddQueueItem;
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                Object obj11 = objArr16[i47 - 1];
                objArr16[i47 - 1] = null;
                Object obj12 = objArr16[i47 - 2];
                objArr16[i47 - 2] = null;
                objArr16[i47 - 1] = obj12;
                objArr16[i47 - 2] = obj11;
                int i48 = i47 - 1;
                this.AudioAttributesImplApi21Parcelizer = i48;
                objArr16[i48] = null;
                return 0;
            case 39:
                int i49 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i49;
                this.onAddQueueItem[i49] = null;
                return 0;
            case 40:
                int[] iArr21 = this.RatingCompat;
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i50 + 1;
                iArr21[i50] = 14;
                return 0;
            case 41:
                double[] dArr = this.MediaBrowserCompatSearchResultReceiver;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                dArr[i51] = this.MediaBrowserCompatCustomActionResultReceiver;
                return 0;
            case 42:
                double[] dArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i52 + 1;
                dArr2[i52] = 0.0d;
                return 0;
            case 43:
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                int i54 = i53 - 1;
                this.AudioAttributesImplApi21Parcelizer = i54;
                double[] dArr3 = this.MediaBrowserCompatSearchResultReceiver;
                this.RatingCompat[i53 - 2] = (dArr3[i53 - 2] > dArr3[i54] ? 1 : (dArr3[i53 - 2] == dArr3[i54] ? 0 : -1));
                return 0;
            case 44:
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = i55 - 1;
                int[] iArr22 = this.RatingCompat;
                iArr22[i55 - 2] = iArr22[i55 - 2] + iArr22[i56];
                this.AudioAttributesImplApi21Parcelizer = i55;
                iArr22[i56] = 1;
                return 0;
            case 45:
                int i57 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i57;
                Object[] objArr17 = this.onAddQueueItem;
                Object obj13 = objArr17[i57];
                objArr17[i57] = null;
                objArr17[17] = obj13;
                return 0;
            case 46:
                int i58 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i58;
                Object[] objArr18 = this.onAddQueueItem;
                Object obj14 = objArr18[i58];
                objArr18[i58] = null;
                objArr18[18] = obj14;
                return 0;
            case 47:
                Object[] objArr19 = this.onAddQueueItem;
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                objArr19[i59] = null;
                this.AudioAttributesImplApi21Parcelizer = i59;
                Object obj15 = objArr19[i59];
                objArr19[i59] = null;
                objArr19[19] = obj15;
                return 0;
            case 48:
                int[] iArr23 = this.RatingCompat;
                int i60 = this.AudioAttributesImplApi21Parcelizer;
                iArr23[i60] = 16;
                iArr23[i60 - 1] = iArr23[i60 - 1] >> iArr23[i60];
                this.AudioAttributesImplApi21Parcelizer = i60 + 1;
                iArr23[i60] = 0;
                return 0;
            case 49:
                int[] iArr24 = this.RatingCompat;
                int i61 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i61 + 1;
                iArr24[i61] = 20;
                return 0;
            case 50:
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                int i63 = i62 - 1;
                int[] iArr25 = this.RatingCompat;
                iArr25[i62 - 2] = iArr25[i62 - 2] + iArr25[i63];
                this.AudioAttributesImplApi21Parcelizer = i62;
                iArr25[i63] = 6;
                return 0;
            case 51:
                int i64 = this.AudioAttributesImplApi21Parcelizer;
                int i65 = i64 - 1;
                this.AudioAttributesImplApi21Parcelizer = i65;
                int[] iArr26 = this.RatingCompat;
                iArr26[i64 - 2] = iArr26[i64 - 2] >> iArr26[i65];
                iArr26[i64 - 2] = (char) iArr26[i64 - 2];
                return 0;
            case 52:
                int[] iArr27 = this.RatingCompat;
                int i66 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i66 + 1;
                iArr27[i66] = 15;
                return 0;
            case 53:
                Object[] objArr20 = this.onAddQueueItem;
                int i67 = this.AudioAttributesImplApi21Parcelizer;
                objArr20[i67] = objArr20[25];
                int[] iArr28 = this.RatingCompat;
                iArr28[i67 + 1] = 0;
                int i68 = i67 + 1;
                this.AudioAttributesImplApi21Parcelizer = i68;
                Object obj16 = objArr20[i67];
                objArr20[i67] = null;
                objArr20[i67] = ((Object[]) obj16)[iArr28[i68]];
                return 0;
            case 54:
                Object[] objArr21 = this.onAddQueueItem;
                int i69 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i69 + 1;
                Object obj17 = objArr21[i69 - 1];
                objArr21[i69 - 1] = null;
                objArr21[i69] = obj17;
                Object obj18 = objArr21[i69 - 2];
                objArr21[i69 - 2] = null;
                objArr21[i69 - 1] = obj18;
                objArr21[i69 - 2] = obj17;
                return 0;
            case 55:
                Object[] objArr22 = this.onAddQueueItem;
                int i70 = this.AudioAttributesImplApi21Parcelizer;
                Object obj19 = objArr22[i70 - 1];
                objArr22[i70 - 1] = null;
                Object obj20 = objArr22[i70 - 2];
                objArr22[i70 - 2] = null;
                objArr22[i70 - 1] = obj20;
                objArr22[i70 - 2] = obj19;
                return 0;
            case 56:
                int[] iArr29 = this.RatingCompat;
                int i71 = this.AudioAttributesImplApi21Parcelizer;
                iArr29[i71] = 0;
                Object[] objArr23 = this.onAddQueueItem;
                Object obj21 = objArr23[i71 - 1];
                objArr23[i71 - 1] = null;
                objArr23[i71] = obj21;
                iArr29[i71 - 1] = iArr29[i71];
                int i72 = i71 - 2;
                this.AudioAttributesImplApi21Parcelizer = i72;
                Object obj22 = objArr23[i72];
                objArr23[i72] = null;
                int i73 = iArr29[i71 - 1];
                Object obj23 = objArr23[i71];
                objArr23[i71] = null;
                ((Object[]) obj22)[i73] = obj23;
                return 0;
            case 57:
                Object[] objArr24 = this.onAddQueueItem;
                int i74 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i74 + 1;
                objArr24[i74] = objArr24[24];
                return 0;
            case 58:
                Object[] objArr25 = this.onAddQueueItem;
                int i75 = this.AudioAttributesImplApi21Parcelizer;
                objArr25[i75] = objArr25[23];
                int[] iArr30 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i75 + 2;
                iArr30[i75 + 1] = 1;
                return 0;
            case 59:
                Object[] objArr26 = this.onAddQueueItem;
                int i76 = this.AudioAttributesImplApi21Parcelizer;
                objArr26[i76] = objArr26[i76 - 1];
                int[] iArr31 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i76 + 2;
                iArr31[i76 + 1] = 0;
                return 0;
            case 60:
                int i77 = this.AudioAttributesImplApi21Parcelizer;
                int i78 = i77 - 3;
                this.AudioAttributesImplApi21Parcelizer = i78;
                Object[] objArr27 = this.onAddQueueItem;
                Object obj24 = objArr27[i78];
                objArr27[i78] = null;
                int i79 = this.RatingCompat[i77 - 2];
                Object obj25 = objArr27[i77 - 1];
                objArr27[i77 - 1] = null;
                ((Object[]) obj24)[i79] = obj25;
                return 0;
            case 61:
                Object[] objArr28 = this.onAddQueueItem;
                int i80 = this.AudioAttributesImplApi21Parcelizer;
                objArr28[i80] = objArr28[i80 - 1];
                Object obj26 = objArr28[i80];
                objArr28[i80] = null;
                objArr28[19] = obj26;
                this.AudioAttributesImplApi21Parcelizer = i80 + 1;
                objArr28[i80] = null;
                return 0;
            case 62:
                Object[] objArr29 = this.onAddQueueItem;
                int i81 = this.AudioAttributesImplApi21Parcelizer;
                Object obj27 = objArr29[i81 - 2];
                objArr29[i81 - 2] = null;
                objArr29[i81 - 1] = obj27;
                int[] iArr32 = this.RatingCompat;
                iArr32[i81 - 2] = iArr32[i81 - 1];
                int i82 = i81 - 3;
                this.AudioAttributesImplApi21Parcelizer = i82;
                Object obj28 = objArr29[i82];
                objArr29[i82] = null;
                int i83 = iArr32[i81 - 2];
                Object obj29 = objArr29[i81 - 1];
                objArr29[i81 - 1] = null;
                ((Object[]) obj28)[i83] = obj29;
                this.AudioAttributesImplApi21Parcelizer = i81 - 2;
                objArr29[i82] = objArr29[24];
                return 0;
            case 63:
                int[] iArr33 = this.RatingCompat;
                int i84 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i84 + 1;
                iArr33[i84] = 4;
                return 0;
            case 64:
                int[] iArr34 = this.RatingCompat;
                int i85 = this.AudioAttributesImplApi21Parcelizer;
                iArr34[i85] = 16;
                iArr34[i85 - 1] = iArr34[i85 - 1] >> iArr34[i85];
                int i86 = i85 - 1;
                this.AudioAttributesImplApi21Parcelizer = i86;
                iArr34[i85 - 2] = iArr34[i85 - 2] - iArr34[i86];
                return 0;
            case 65:
                Object[] objArr30 = this.onAddQueueItem;
                int i87 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i87 + 1;
                Object obj30 = objArr30[i87 - 1];
                objArr30[i87 - 1] = null;
                objArr30[i87] = obj30;
                Object obj31 = objArr30[i87 - 2];
                objArr30[i87 - 2] = null;
                objArr30[i87 - 1] = obj31;
                Object obj32 = objArr30[i87 - 3];
                objArr30[i87 - 3] = null;
                objArr30[i87 - 2] = obj32;
                objArr30[i87 - 3] = obj30;
                return 0;
            case 66:
                int i88 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i88;
                int[] iArr35 = this.RatingCompat;
                iArr35[20] = iArr35[i88];
                return 0;
            case 67:
                Object[] objArr31 = this.onAddQueueItem;
                int i89 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i89 + 1;
                objArr31[i89] = objArr31[11];
                return 0;
            case 68:
                int[] iArr36 = this.RatingCompat;
                int i90 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i90 + 1;
                iArr36[i90] = 26;
                return 0;
            case 69:
                float[] fArr = this.MediaMetadataCompat;
                int i91 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i91 + 1;
                fArr[i91] = this.read;
                return 0;
            case 70:
                float[] fArr2 = this.MediaMetadataCompat;
                int i92 = this.AudioAttributesImplApi21Parcelizer;
                fArr2[i92] = 0.0f;
                int[] iArr37 = this.RatingCompat;
                iArr37[i92 - 1] = (fArr2[i92 - 1] > fArr2[i92] ? 1 : (fArr2[i92 - 1] == fArr2[i92] ? 0 : -1));
                int i93 = i92 - 1;
                this.AudioAttributesImplApi21Parcelizer = i93;
                iArr37[i92 - 2] = iArr37[i92 - 2] - iArr37[i93];
                return 0;
            case 71:
                int[] iArr38 = this.RatingCompat;
                int i94 = this.AudioAttributesImplApi21Parcelizer;
                iArr38[i94 - 1] = (byte) iArr38[i94 - 1];
                return 0;
            case 72:
                int[] iArr39 = this.RatingCompat;
                int i95 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i95 + 1;
                iArr39[i95] = 23;
                return 0;
            case 73:
                int[] iArr40 = this.RatingCompat;
                int i96 = this.AudioAttributesImplApi21Parcelizer;
                iArr40[i96] = 16;
                this.AudioAttributesImplApi21Parcelizer = i96;
                iArr40[i96 - 1] = iArr40[i96 - 1] >> iArr40[i96];
                return 0;
            case 74:
                int[] iArr41 = this.RatingCompat;
                int i97 = this.AudioAttributesImplApi21Parcelizer;
                iArr41[i97] = 0;
                this.AudioAttributesImplApi21Parcelizer = i97;
                Object[] objArr32 = this.onAddQueueItem;
                Object obj33 = objArr32[i97 - 1];
                objArr32[i97 - 1] = null;
                objArr32[i97 - 1] = ((Object[]) obj33)[iArr41[i97]];
                return 0;
            case 75:
                int[] iArr42 = this.RatingCompat;
                int i98 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i98 + 1;
                iArr42[i98] = 17;
                return 0;
            case 76:
                int[] iArr43 = this.RatingCompat;
                int i99 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i99 + 1;
                iArr43[i99] = 16;
                return 0;
            case 77:
                int i100 = this.AudioAttributesImplApi21Parcelizer;
                int i101 = i100 - 1;
                this.AudioAttributesImplApi21Parcelizer = i101;
                int[] iArr44 = this.RatingCompat;
                iArr44[i100 - 2] = iArr44[i100 - 2] >> iArr44[i101];
                return 0;
            case 78:
                int i102 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i102;
                Object[] objArr33 = this.onAddQueueItem;
                Object obj34 = objArr33[i102];
                objArr33[i102] = null;
                objArr33[21] = obj34;
                return 0;
            case 79:
                int i103 = this.AudioAttributesImplApi21Parcelizer;
                int i104 = i103 - 2;
                this.AudioAttributesImplApi21Parcelizer = i104;
                int[] iArr45 = this.RatingCompat;
                this.write = iArr45[i104] < iArr45[i103 - 1] ? 0 : 1;
                return 0;
            case 80:
                int[] iArr46 = this.RatingCompat;
                int i105 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i105 + 1;
                iArr46[i105] = 28;
                return 0;
            case 81:
                Object[] objArr34 = this.onAddQueueItem;
                int i106 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i106 + 1;
                objArr34[i106] = objArr34[21];
                return 0;
            case 82:
                int[] iArr47 = this.RatingCompat;
                int i107 = this.AudioAttributesImplApi21Parcelizer;
                iArr47[i107] = 48;
                this.AudioAttributesImplApi21Parcelizer = i107 + 2;
                iArr47[i107 + 1] = 0;
                return 0;
            case 83:
                int[] iArr48 = this.RatingCompat;
                int i108 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i108 + 1;
                iArr48[i108] = -1;
                return 0;
            case 84:
                int[] iArr49 = this.RatingCompat;
                int i109 = this.AudioAttributesImplApi21Parcelizer;
                iArr49[i109 - 1] = (char) iArr49[i109 - 1];
                this.AudioAttributesImplApi21Parcelizer = i109 + 1;
                iArr49[i109] = 35;
                return 0;
            case 85:
                int[] iArr50 = this.RatingCompat;
                int i110 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i110 + 1;
                iArr50[i110] = 22;
                return 0;
            case 86:
                int i111 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr51 = this.RatingCompat;
                iArr51[i111 - 2] = iArr51[i111 - 2] >> iArr51[i111 - 1];
                int i112 = i111 - 2;
                iArr51[i111 - 3] = iArr51[i111 - 3] + iArr51[i112];
                this.AudioAttributesImplApi21Parcelizer = i111 - 1;
                iArr51[i112] = 1;
                return 0;
            case 87:
                Object[] objArr35 = this.onAddQueueItem;
                int i113 = this.AudioAttributesImplApi21Parcelizer;
                Object obj35 = objArr35[i113 - 2];
                objArr35[i113 - 2] = null;
                objArr35[i113 - 1] = obj35;
                int[] iArr52 = this.RatingCompat;
                iArr52[i113 - 2] = iArr52[i113 - 1];
                int i114 = i113 - 3;
                this.AudioAttributesImplApi21Parcelizer = i114;
                Object obj36 = objArr35[i114];
                objArr35[i114] = null;
                int i115 = iArr52[i113 - 2];
                Object obj37 = objArr35[i113 - 1];
                objArr35[i113 - 1] = null;
                ((Object[]) obj36)[i115] = obj37;
                return 0;
            case 88:
                int[] iArr53 = this.RatingCompat;
                int i116 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i116 + 1;
                iArr53[i116] = 33;
                return 0;
            case 89:
                int[] iArr54 = this.RatingCompat;
                int i117 = this.AudioAttributesImplApi21Parcelizer;
                iArr54[i117] = 34;
                iArr54[i117 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i117 + 3;
                iArr54[i117 + 2] = 0;
                return 0;
            case 90:
                int[] iArr55 = this.RatingCompat;
                int i118 = this.AudioAttributesImplApi21Parcelizer;
                iArr55[i118 - 1] = (byte) iArr55[i118 - 1];
                this.AudioAttributesImplApi21Parcelizer = i118 + 1;
                iArr55[i118] = 16;
                return 0;
            case 91:
                Object[] objArr36 = this.onAddQueueItem;
                int i119 = this.AudioAttributesImplApi21Parcelizer;
                Object obj38 = objArr36[i119 - 1];
                objArr36[i119 - 1] = null;
                objArr36[i119] = obj38;
                Object obj39 = objArr36[i119 - 2];
                objArr36[i119 - 2] = null;
                objArr36[i119 - 1] = obj39;
                Object obj40 = objArr36[i119 - 3];
                objArr36[i119 - 3] = null;
                objArr36[i119 - 2] = obj40;
                objArr36[i119 - 3] = obj38;
                this.AudioAttributesImplApi21Parcelizer = i119;
                objArr36[i119] = null;
                return 0;
            case 92:
                int i120 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i120;
                this.write = this.RatingCompat[i120] == 0 ? 0 : 1;
                return 0;
            case 93:
                int i121 = this.AudioAttributesImplApi21Parcelizer;
                int i122 = i121 - 1;
                int[] iArr56 = this.RatingCompat;
                iArr56[i121 - 2] = iArr56[i121 - 2] + iArr56[i122];
                iArr56[i121 - 2] = (byte) iArr56[i121 - 2];
                this.AudioAttributesImplApi21Parcelizer = i121;
                iArr56[i122] = 18;
                return 0;
            case 94:
                Object[] objArr37 = this.onAddQueueItem;
                int i123 = this.AudioAttributesImplApi21Parcelizer;
                objArr37[i123] = objArr37[23];
                this.AudioAttributesImplApi21Parcelizer = i123 + 2;
                objArr37[i123 + 1] = null;
                return 0;
            case 95:
                Object[] objArr38 = this.onAddQueueItem;
                int i124 = this.AudioAttributesImplApi21Parcelizer;
                objArr38[i124] = null;
                this.AudioAttributesImplApi21Parcelizer = i124 + 2;
                objArr38[i124 + 1] = null;
                return 0;
            case 96:
                Object[] objArr39 = this.onAddQueueItem;
                int i125 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i125 + 1;
                objArr39[i125] = objArr39[17];
                return 0;
            case 97:
                int[] iArr57 = this.RatingCompat;
                int i126 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i126 + 1;
                iArr57[i126] = 0;
                Object[] objArr40 = this.onAddQueueItem;
                Object obj41 = objArr40[i126 - 1];
                objArr40[i126 - 1] = null;
                objArr40[i126] = obj41;
                iArr57[i126 - 1] = iArr57[i126];
                return 0;
            case 98:
                int[] iArr58 = this.RatingCompat;
                int i127 = this.AudioAttributesImplApi21Parcelizer;
                iArr58[i127] = 15;
                long[] jArr3 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = i127 + 2;
                jArr3[i127 + 1] = 0;
                return 0;
            case 99:
                int[] iArr59 = this.RatingCompat;
                int i128 = this.AudioAttributesImplApi21Parcelizer;
                iArr59[i128 - 1] = (byte) iArr59[i128 - 1];
                this.AudioAttributesImplApi21Parcelizer = i128 + 1;
                iArr59[i128] = 19;
                return 0;
            case 100:
                int[] iArr60 = this.RatingCompat;
                int i129 = this.AudioAttributesImplApi21Parcelizer;
                iArr60[i129 - 1] = (byte) iArr60[i129 - 1];
                int i130 = i129 - 1;
                this.AudioAttributesImplApi21Parcelizer = i130;
                iArr60[i129 - 2] = iArr60[i129 - 2] + iArr60[i130];
                return 0;
            case 101:
                int[] iArr61 = this.RatingCompat;
                int i131 = this.AudioAttributesImplApi21Parcelizer;
                iArr61[i131] = 7;
                this.AudioAttributesImplApi21Parcelizer = i131 + 2;
                iArr61[i131 + 1] = 0;
                return 0;
            case 102:
                int[] iArr62 = this.RatingCompat;
                int i132 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i132 + 1;
                iArr62[i132] = 8;
                return 0;
            case 103:
                int i133 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr63 = this.RatingCompat;
                iArr63[i133 - 2] = iArr63[i133 - 2] >> iArr63[i133 - 1];
                int i134 = i133 - 2;
                this.AudioAttributesImplApi21Parcelizer = i134;
                iArr63[i133 - 3] = iArr63[i133 - 3] + iArr63[i134];
                return 0;
            case 104:
                int[] iArr64 = this.RatingCompat;
                int i135 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i135 + 1;
                iArr64[i135] = 11;
                return 0;
            case 105:
                int[] iArr65 = this.RatingCompat;
                int i136 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i136 + 1;
                iArr65[i136] = 2;
                return 0;
            case 106:
                Object[] objArr41 = this.onAddQueueItem;
                int i137 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i137 + 1;
                Object obj42 = objArr41[i137 - 1];
                objArr41[i137 - 1] = null;
                objArr41[i137] = obj42;
                int[] iArr66 = this.RatingCompat;
                iArr66[i137 - 1] = iArr66[i137 - 2];
                objArr41[i137 - 2] = obj42;
                iArr66[i137] = iArr66[i137 - 1];
                Object obj43 = objArr41[i137];
                objArr41[i137] = null;
                objArr41[i137 - 1] = obj43;
                return 0;
            case 107:
                Object[] objArr42 = this.onAddQueueItem;
                int i138 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i138 + 1;
                Object obj44 = objArr42[i138 - 1];
                objArr42[i138 - 1] = null;
                objArr42[i138] = obj44;
                int[] iArr67 = this.RatingCompat;
                iArr67[i138 - 1] = iArr67[i138 - 2];
                objArr42[i138 - 2] = obj44;
                return 0;
            case 108:
                int[] iArr68 = this.RatingCompat;
                int i139 = this.AudioAttributesImplApi21Parcelizer;
                iArr68[i139 - 1] = iArr68[i139 - 2];
                Object[] objArr43 = this.onAddQueueItem;
                Object obj45 = objArr43[i139 - 1];
                objArr43[i139 - 1] = null;
                objArr43[i139 - 2] = obj45;
                return 0;
            case 109:
                Object[] objArr44 = this.onAddQueueItem;
                int i140 = this.AudioAttributesImplApi21Parcelizer;
                Object obj46 = objArr44[i140 - 2];
                objArr44[i140 - 2] = null;
                objArr44[i140 - 1] = obj46;
                int[] iArr69 = this.RatingCompat;
                iArr69[i140 - 2] = iArr69[i140 - 1];
                return 0;
            case 110:
                int[] iArr70 = this.RatingCompat;
                int i141 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i141 + 1;
                iArr70[i141] = 48;
                return 0;
            case 111:
                int[] iArr71 = this.RatingCompat;
                int i142 = this.AudioAttributesImplApi21Parcelizer;
                iArr71[i142 - 1] = (byte) iArr71[i142 - 1];
                iArr71[i142] = 18;
                this.AudioAttributesImplApi21Parcelizer = i142 + 2;
                iArr71[i142 + 1] = 0;
                return 0;
            case 112:
                double[] dArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i143 = this.AudioAttributesImplApi21Parcelizer;
                dArr4[i143] = 0.0d;
                int[] iArr72 = this.RatingCompat;
                iArr72[i143 - 1] = (dArr4[i143 - 1] > dArr4[i143] ? 1 : (dArr4[i143 - 1] == dArr4[i143] ? 0 : -1));
                int i144 = i143 - 1;
                this.AudioAttributesImplApi21Parcelizer = i144;
                iArr72[i143 - 2] = iArr72[i143 - 2] + iArr72[i144];
                return 0;
            case 113:
                int[] iArr73 = this.RatingCompat;
                int i145 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i145 + 1;
                iArr73[i145] = 66;
                return 0;
            case 114:
                int i146 = this.AudioAttributesImplApi21Parcelizer;
                int i147 = i146 - 1;
                this.AudioAttributesImplApi21Parcelizer = i147;
                int[] iArr74 = this.RatingCompat;
                iArr74[i146 - 2] = iArr74[i146 - 2] - iArr74[i147];
                iArr74[i146 - 2] = (byte) iArr74[i146 - 2];
                return 0;
            case 115:
                int[] iArr75 = this.RatingCompat;
                int i148 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i148 + 1;
                iArr75[i148] = 18;
                return 0;
            case 116:
                long[] jArr4 = this.MediaBrowserCompatMediaItem;
                int i149 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i149 + 1;
                jArr4[i149] = this.RemoteActionCompatParcelizer;
                return 0;
            case 117:
                long[] jArr5 = this.MediaBrowserCompatMediaItem;
                int i150 = this.AudioAttributesImplApi21Parcelizer;
                jArr5[i150] = 0;
                int[] iArr76 = this.RatingCompat;
                iArr76[i150 - 1] = (jArr5[i150 - 1] > jArr5[i150] ? 1 : (jArr5[i150 - 1] == jArr5[i150] ? 0 : -1));
                int i151 = i150 - 1;
                this.AudioAttributesImplApi21Parcelizer = i151;
                iArr76[i150 - 2] = iArr76[i150 - 2] + iArr76[i151];
                return 0;
            case 118:
                int[] iArr77 = this.RatingCompat;
                int i152 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i152 + 1;
                iArr77[i152] = 7;
                return 0;
            case 119:
                Object[] objArr45 = this.onAddQueueItem;
                int i153 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i153 + 1;
                objArr45[i153] = objArr45[18];
                return 0;
            case 120:
                int[] iArr78 = this.RatingCompat;
                int i154 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i154 + 1;
                iArr78[i154] = 12;
                return 0;
            case 121:
                int[] iArr79 = this.RatingCompat;
                int i155 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i155 + 1;
                iArr79[i155] = 51;
                return 0;
            case 122:
                int i156 = this.AudioAttributesImplApi21Parcelizer;
                int i157 = i156 - 1;
                this.AudioAttributesImplApi21Parcelizer = i157;
                long[] jArr6 = this.MediaBrowserCompatMediaItem;
                this.RatingCompat[i156 - 2] = (jArr6[i156 - 2] > jArr6[i157] ? 1 : (jArr6[i156 - 2] == jArr6[i157] ? 0 : -1));
                return 0;
            case 123:
                int[] iArr80 = this.RatingCompat;
                int i158 = this.AudioAttributesImplApi21Parcelizer;
                iArr80[i158 - 1] = (char) iArr80[i158 - 1];
                return 0;
            case 124:
                int i159 = this.AudioAttributesImplApi21Parcelizer;
                int i160 = i159 - 1;
                int[] iArr81 = this.RatingCompat;
                iArr81[i159 - 2] = iArr81[i159 - 2] - iArr81[i160];
                this.AudioAttributesImplApi21Parcelizer = i159;
                iArr81[i160] = 1;
                return 0;
            case 125:
                Object[] objArr46 = this.onAddQueueItem;
                int i161 = this.AudioAttributesImplApi21Parcelizer;
                Object obj47 = objArr46[i161 - 1];
                objArr46[i161 - 1] = null;
                objArr46[i161] = obj47;
                Object obj48 = objArr46[i161 - 2];
                objArr46[i161 - 2] = null;
                objArr46[i161 - 1] = obj48;
                objArr46[i161 - 2] = obj47;
                Object obj49 = objArr46[i161];
                objArr46[i161] = null;
                Object obj50 = objArr46[i161 - 1];
                objArr46[i161 - 1] = null;
                objArr46[i161] = obj50;
                objArr46[i161 - 1] = obj49;
                int[] iArr82 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i161 + 2;
                iArr82[i161 + 1] = 0;
                return 0;
            case 126:
                int[] iArr83 = this.RatingCompat;
                int i162 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i162 + 1;
                iArr83[i162] = 77;
                return 0;
            case 127:
                int[] iArr84 = this.RatingCompat;
                int i163 = this.AudioAttributesImplApi21Parcelizer;
                iArr84[i163 - 1] = (byte) iArr84[i163 - 1];
                iArr84[i163] = 37;
                this.AudioAttributesImplApi21Parcelizer = i163 + 2;
                iArr84[i163 + 1] = 0;
                return 0;
            case 128:
                int[] iArr85 = this.RatingCompat;
                int i164 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i164 + 1;
                iArr85[i164] = 59;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                int[] iArr86 = this.RatingCompat;
                int i165 = this.AudioAttributesImplApi21Parcelizer;
                iArr86[i165 - 1] = (char) iArr86[i165 - 1];
                this.AudioAttributesImplApi21Parcelizer = i165 + 1;
                iArr86[i165] = 7;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                Object[] objArr47 = this.onAddQueueItem;
                int i166 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i166 + 1;
                objArr47[i166] = objArr47[12];
                return 0;
            case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                int i167 = this.AudioAttributesImplApi21Parcelizer;
                int i168 = i167 - 1;
                Object[] objArr48 = this.onAddQueueItem;
                Object obj51 = objArr48[i168];
                objArr48[i168] = null;
                objArr48[12] = obj51;
                int[] iArr87 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i167;
                iArr87[i168] = iArr87[20];
                return 0;
            case 132:
                int[] iArr88 = this.RatingCompat;
                int i169 = this.AudioAttributesImplApi21Parcelizer;
                iArr88[i169] = 66;
                this.AudioAttributesImplApi21Parcelizer = i169 + 2;
                iArr88[i169 + 1] = 0;
                return 0;
            case 133:
                long[] jArr7 = this.MediaBrowserCompatMediaItem;
                int i170 = this.AudioAttributesImplApi21Parcelizer;
                jArr7[i170] = 0;
                int[] iArr89 = this.RatingCompat;
                iArr89[i170 - 1] = (jArr7[i170 - 1] > jArr7[i170] ? 1 : (jArr7[i170 - 1] == jArr7[i170] ? 0 : -1));
                int i171 = i170 - 1;
                this.AudioAttributesImplApi21Parcelizer = i171;
                iArr89[i170 - 2] = iArr89[i170 - 2] - iArr89[i171];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                int[] iArr90 = this.RatingCompat;
                int i172 = this.AudioAttributesImplApi21Parcelizer;
                iArr90[i172] = 20;
                this.AudioAttributesImplApi21Parcelizer = i172 + 2;
                iArr90[i172 + 1] = 0;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                int[] iArr91 = this.RatingCompat;
                int i173 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i173 + 1;
                iArr91[i173] = 86;
                return 0;
            case 136:
                int[] iArr92 = this.RatingCompat;
                int i174 = this.AudioAttributesImplApi21Parcelizer;
                iArr92[i174] = 9598;
                this.AudioAttributesImplApi21Parcelizer = i174 + 2;
                iArr92[i174 + 1] = 0;
                return 0;
            case 137:
                int[] iArr93 = this.RatingCompat;
                int i175 = this.AudioAttributesImplApi21Parcelizer;
                iArr93[i175 - 1] = (char) iArr93[i175 - 1];
                iArr93[i175] = 2;
                this.AudioAttributesImplApi21Parcelizer = i175 + 2;
                iArr93[i175 + 1] = 0;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                int i176 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr94 = this.RatingCompat;
                long[] jArr8 = this.MediaBrowserCompatMediaItem;
                iArr94[i176 - 2] = (jArr8[i176 - 2] > jArr8[i176 - 1] ? 1 : (jArr8[i176 - 2] == jArr8[i176 - 1] ? 0 : -1));
                int i177 = i176 - 2;
                iArr94[i176 - 3] = iArr94[i176 - 3] + iArr94[i177];
                this.AudioAttributesImplApi21Parcelizer = i176 - 1;
                iArr94[i177] = -1;
                return 0;
            case 139:
                int[] iArr95 = this.RatingCompat;
                int i178 = this.AudioAttributesImplApi21Parcelizer;
                iArr95[i178 - 1] = (char) iArr95[i178 - 1];
                this.AudioAttributesImplApi21Parcelizer = i178 + 1;
                iArr95[i178] = 15;
                return 0;
            case 140:
                Object[] objArr49 = this.onAddQueueItem;
                int i179 = this.AudioAttributesImplApi21Parcelizer;
                Object obj52 = objArr49[i179 - 1];
                objArr49[i179 - 1] = null;
                objArr49[i179] = obj52;
                Object obj53 = objArr49[i179 - 2];
                objArr49[i179 - 2] = null;
                objArr49[i179 - 1] = obj53;
                objArr49[i179 - 2] = obj52;
                Object obj54 = objArr49[i179];
                objArr49[i179] = null;
                Object obj55 = objArr49[i179 - 1];
                objArr49[i179 - 1] = null;
                objArr49[i179] = obj55;
                objArr49[i179 - 1] = obj54;
                int[] iArr96 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i179 + 2;
                iArr96[i179 + 1] = 1;
                return 0;
            case 141:
                int i180 = this.AudioAttributesImplApi21Parcelizer;
                int i181 = i180 - 1;
                int[] iArr97 = this.RatingCompat;
                iArr97[i180 - 2] = iArr97[i180 - 2] - iArr97[i181];
                iArr97[i180 - 2] = (byte) iArr97[i180 - 2];
                this.AudioAttributesImplApi21Parcelizer = i180;
                iArr97[i181] = 30;
                return 0;
            case 142:
                Object[] objArr50 = this.onAddQueueItem;
                int i182 = this.AudioAttributesImplApi21Parcelizer;
                objArr50[i182] = objArr50[23];
                int[] iArr98 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i182 + 2;
                iArr98[i182 + 1] = 2;
                return 0;
            case 143:
                int i183 = this.AudioAttributesImplApi21Parcelizer;
                int i184 = i183 - 3;
                this.AudioAttributesImplApi21Parcelizer = i184;
                Object[] objArr51 = this.onAddQueueItem;
                Object obj56 = objArr51[i184];
                objArr51[i184] = null;
                int[] iArr99 = this.RatingCompat;
                int i185 = iArr99[i183 - 2];
                Object obj57 = objArr51[i183 - 1];
                objArr51[i183 - 1] = null;
                ((Object[]) obj56)[i185] = obj57;
                objArr51[i184] = objArr51[i183 - 4];
                this.AudioAttributesImplApi21Parcelizer = i183 - 1;
                iArr99[i183 - 2] = 1;
                return 0;
            case 144:
                Object[] objArr52 = this.onAddQueueItem;
                int i186 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i186 + 1;
                objArr52[i186] = null;
                Object obj58 = objArr52[i186];
                objArr52[i186] = null;
                Object obj59 = objArr52[i186 - 1];
                objArr52[i186 - 1] = null;
                objArr52[i186] = obj59;
                objArr52[i186 - 1] = obj58;
                return 0;
            case 145:
                Object[] objArr53 = this.onAddQueueItem;
                int i187 = this.AudioAttributesImplApi21Parcelizer;
                objArr53[i187] = objArr53[i187 - 1];
                Object obj60 = objArr53[i187];
                objArr53[i187] = null;
                objArr53[17] = obj60;
                this.AudioAttributesImplApi21Parcelizer = i187 + 1;
                objArr53[i187] = objArr53[12];
                return 0;
            case 146:
                int i188 = this.AudioAttributesImplApi21Parcelizer;
                int i189 = i188 - 1;
                Object[] objArr54 = this.onAddQueueItem;
                Object obj61 = objArr54[i189];
                objArr54[i189] = null;
                objArr54[17] = obj61;
                this.AudioAttributesImplApi21Parcelizer = i188;
                objArr54[i189] = objArr54[11];
                return 0;
            case 147:
                int[] iArr100 = this.RatingCompat;
                int i190 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i190 + 1;
                iArr100[i190] = 88;
                return 0;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                int[] iArr101 = this.RatingCompat;
                int i191 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i191 + 1;
                iArr101[i191] = 114;
                return 0;
            case 149:
                int[] iArr102 = this.RatingCompat;
                int i192 = this.AudioAttributesImplApi21Parcelizer;
                iArr102[i192] = 8;
                this.AudioAttributesImplApi21Parcelizer = i192;
                iArr102[i192 - 1] = iArr102[i192 - 1] >> iArr102[i192];
                iArr102[i192 - 1] = (char) iArr102[i192 - 1];
                return 0;
            case 150:
                int i193 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr103 = this.RatingCompat;
                long[] jArr9 = this.MediaBrowserCompatMediaItem;
                iArr103[i193 - 2] = (jArr9[i193 - 2] > jArr9[i193 - 1] ? 1 : (jArr9[i193 - 2] == jArr9[i193 - 1] ? 0 : -1));
                int i194 = i193 - 2;
                iArr103[i193 - 3] = iArr103[i193 - 3] + iArr103[i194];
                this.AudioAttributesImplApi21Parcelizer = i193 - 1;
                iArr103[i194] = 1;
                return 0;
            case 151:
                int i195 = this.AudioAttributesImplApi21Parcelizer;
                int i196 = i195 - 1;
                Object[] objArr55 = this.onAddQueueItem;
                objArr55[i196] = null;
                this.AudioAttributesImplApi21Parcelizer = i195;
                objArr55[i196] = null;
                return 0;
            case 152:
                int i197 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i197;
                Object[] objArr56 = this.onAddQueueItem;
                Object obj62 = objArr56[i197];
                objArr56[i197] = null;
                this.write = obj62 != null ? 0 : 1;
                return 0;
            case 153:
                int i198 = this.AudioAttributesImplApi21Parcelizer;
                int i199 = i198 - 1;
                int[] iArr104 = this.RatingCompat;
                iArr104[15] = iArr104[i199];
                Object[] objArr57 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i198;
                objArr57[i199] = null;
                return 0;
            case 154:
                int[] iArr105 = this.RatingCompat;
                int i200 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i200 + 1;
                iArr105[i200] = iArr105[20];
                return 0;
            case TarConstants.PREFIXLEN /* 155 */:
                int[] iArr106 = this.RatingCompat;
                int i201 = this.AudioAttributesImplApi21Parcelizer;
                iArr106[i201] = iArr106[13];
                iArr106[i201 + 1] = 1;
                int i202 = i201 + 1;
                this.AudioAttributesImplApi21Parcelizer = i202;
                iArr106[i201] = iArr106[i201] & iArr106[i202];
                return 0;
            case 156:
                int[] iArr107 = this.RatingCompat;
                int i203 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i203 + 1;
                iArr107[i203] = 67;
                return 0;
            case 157:
                int i204 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr108 = this.RatingCompat;
                long[] jArr10 = this.MediaBrowserCompatMediaItem;
                iArr108[i204 - 2] = (jArr10[i204 - 2] > jArr10[i204 - 1] ? 1 : (jArr10[i204 - 2] == jArr10[i204 - 1] ? 0 : -1));
                int i205 = i204 - 2;
                this.AudioAttributesImplApi21Parcelizer = i205;
                iArr108[i204 - 3] = iArr108[i204 - 3] - iArr108[i205];
                return 0;
            case 158:
                int[] iArr109 = this.RatingCompat;
                int i206 = this.AudioAttributesImplApi21Parcelizer;
                iArr109[i206 - 1] = (char) iArr109[i206 - 1];
                this.AudioAttributesImplApi21Parcelizer = i206 + 1;
                iArr109[i206] = 20;
                return 0;
            case 159:
                int i207 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr110 = this.RatingCompat;
                iArr110[i207 - 2] = iArr110[i207 - 2] >> iArr110[i207 - 1];
                int i208 = i207 - 2;
                this.AudioAttributesImplApi21Parcelizer = i208;
                iArr110[i207 - 3] = iArr110[i207 - 3] - iArr110[i208];
                return 0;
            case 160:
                int[] iArr111 = this.RatingCompat;
                int i209 = this.AudioAttributesImplApi21Parcelizer;
                iArr111[i209] = 9598;
                iArr111[i209 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i209 + 3;
                iArr111[i209 + 2] = 0;
                return 0;
            case 161:
                Object[] objArr58 = this.onAddQueueItem;
                int i210 = this.AudioAttributesImplApi21Parcelizer;
                Object obj63 = objArr58[i210 - 1];
                objArr58[i210 - 1] = null;
                Object obj64 = objArr58[i210 - 2];
                objArr58[i210 - 2] = null;
                objArr58[i210 - 1] = obj64;
                objArr58[i210 - 2] = obj63;
                int[] iArr112 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i210 + 1;
                iArr112[i210] = 1;
                return 0;
            case 162:
                Object[] objArr59 = this.onAddQueueItem;
                int i211 = this.AudioAttributesImplApi21Parcelizer;
                Object obj65 = objArr59[i211 - 2];
                objArr59[i211 - 2] = null;
                objArr59[i211 - 1] = obj65;
                int[] iArr113 = this.RatingCompat;
                iArr113[i211 - 2] = iArr113[i211 - 1];
                int i212 = i211 - 3;
                this.AudioAttributesImplApi21Parcelizer = i212;
                Object obj66 = objArr59[i212];
                objArr59[i212] = null;
                int i213 = iArr113[i211 - 2];
                Object obj67 = objArr59[i211 - 1];
                objArr59[i211 - 1] = null;
                ((Object[]) obj66)[i213] = obj67;
                this.AudioAttributesImplApi21Parcelizer = i211 - 2;
                Object obj68 = objArr59[i211 - 4];
                objArr59[i211 - 4] = null;
                objArr59[i212] = obj68;
                Object obj69 = objArr59[i211 - 5];
                objArr59[i211 - 5] = null;
                objArr59[i211 - 4] = obj69;
                objArr59[i211 - 5] = obj68;
                return 0;
            case 163:
                int i214 = this.AudioAttributesImplApi21Parcelizer;
                int i215 = i214 - 3;
                this.AudioAttributesImplApi21Parcelizer = i215;
                Object[] objArr60 = this.onAddQueueItem;
                Object obj70 = objArr60[i215];
                objArr60[i215] = null;
                int[] iArr114 = this.RatingCompat;
                int i216 = iArr114[i214 - 2];
                Object obj71 = objArr60[i214 - 1];
                objArr60[i214 - 1] = null;
                ((Object[]) obj70)[i216] = obj71;
                this.AudioAttributesImplApi21Parcelizer = i214 - 2;
                iArr114[i215] = 68;
                return 0;
            case 164:
                int[] iArr115 = this.RatingCompat;
                int i217 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i217 + 1;
                iArr115[i217] = 31;
                return 0;
            case 165:
                int i218 = this.AudioAttributesImplApi21Parcelizer;
                int i219 = i218 - 3;
                this.AudioAttributesImplApi21Parcelizer = i219;
                Object[] objArr61 = this.onAddQueueItem;
                Object obj72 = objArr61[i219];
                objArr61[i219] = null;
                int i220 = this.RatingCompat[i218 - 2];
                Object obj73 = objArr61[i218 - 1];
                objArr61[i218 - 1] = null;
                ((Object[]) obj72)[i220] = obj73;
                this.AudioAttributesImplApi21Parcelizer = i218 - 2;
                objArr61[i219] = objArr61[i218 - 4];
                return 0;
            case 166:
                Object[] objArr62 = this.onAddQueueItem;
                int i221 = this.AudioAttributesImplApi21Parcelizer;
                objArr62[i221] = objArr62[i221 - 1];
                Object obj74 = objArr62[i221];
                objArr62[i221] = null;
                objArr62[20] = obj74;
                this.AudioAttributesImplApi21Parcelizer = i221 + 1;
                objArr62[i221] = objArr62[12];
                return 0;
            case 167:
                Object[] objArr63 = this.onAddQueueItem;
                int i222 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i222 + 1;
                objArr63[i222] = objArr63[20];
                return 0;
            case 168:
                int[] iArr116 = this.RatingCompat;
                int i223 = this.AudioAttributesImplApi21Parcelizer;
                iArr116[i223] = 50;
                this.AudioAttributesImplApi21Parcelizer = i223;
                iArr116[15] = iArr116[i223];
                return 0;
            case 169:
                int[] iArr117 = this.RatingCompat;
                int i224 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i224 + 1;
                iArr117[i224] = iArr117[15];
                return 0;
            case 170:
                Object[] objArr64 = this.onAddQueueItem;
                int i225 = this.AudioAttributesImplApi21Parcelizer;
                objArr64[i225] = objArr64[19];
                this.AudioAttributesImplApi21Parcelizer = i225 + 2;
                objArr64[i225 + 1] = objArr64[18];
                return 0;
            case 171:
                int i226 = this.AudioAttributesImplApi21Parcelizer;
                int i227 = i226 - 3;
                this.AudioAttributesImplApi21Parcelizer = i227;
                Object[] objArr65 = this.onAddQueueItem;
                Object obj75 = objArr65[i227];
                objArr65[i227] = null;
                int i228 = this.RatingCompat[i226 - 2];
                Object obj76 = objArr65[i226 - 1];
                objArr65[i226 - 1] = null;
                ((Object[]) obj75)[i228] = obj76;
                this.AudioAttributesImplApi21Parcelizer = i226 - 2;
                objArr65[i227] = objArr65[24];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                int[] iArr118 = this.RatingCompat;
                int i229 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i229 + 1;
                iArr118[i229] = 19;
                return 0;
            case 173:
                int i230 = this.AudioAttributesImplApi21Parcelizer;
                int i231 = i230 - 1;
                Object[] objArr66 = this.onAddQueueItem;
                Object obj77 = objArr66[i231];
                objArr66[i231] = null;
                objArr66[20] = obj77;
                int[] iArr119 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i230;
                iArr119[i231] = 132;
                return 0;
            case 174:
                int[] iArr120 = this.RatingCompat;
                int i232 = this.AudioAttributesImplApi21Parcelizer;
                iArr120[i232] = 8;
                this.AudioAttributesImplApi21Parcelizer = i232;
                iArr120[i232 - 1] = iArr120[i232 - 1] >> iArr120[i232];
                return 0;
            case 175:
                int i233 = this.AudioAttributesImplApi21Parcelizer;
                int i234 = i233 - 1;
                int[] iArr121 = this.RatingCompat;
                iArr121[i233 - 2] = iArr121[i233 - 2] + iArr121[i234];
                this.AudioAttributesImplApi21Parcelizer = i233;
                iArr121[i234] = -1;
                return 0;
            case 176:
                float[] fArr3 = this.MediaMetadataCompat;
                int i235 = this.AudioAttributesImplApi21Parcelizer;
                fArr3[i235] = 0.0f;
                int[] iArr122 = this.RatingCompat;
                iArr122[i235 - 1] = (fArr3[i235 - 1] > fArr3[i235] ? 1 : (fArr3[i235 - 1] == fArr3[i235] ? 0 : -1));
                int i236 = i235 - 1;
                this.AudioAttributesImplApi21Parcelizer = i236;
                iArr122[i235 - 2] = iArr122[i235 - 2] + iArr122[i236];
                return 0;
            case 177:
                int[] iArr123 = this.RatingCompat;
                int i237 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i237 + 1;
                iArr123[i237] = 5;
                return 0;
            case 178:
                Object[] objArr67 = this.onAddQueueItem;
                int i238 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i238 + 1;
                Object obj78 = objArr67[i238 - 1];
                objArr67[i238 - 1] = null;
                objArr67[i238] = obj78;
                Object obj79 = objArr67[i238 - 2];
                objArr67[i238 - 2] = null;
                objArr67[i238 - 1] = obj79;
                objArr67[i238 - 2] = obj78;
                Object obj80 = objArr67[i238];
                objArr67[i238] = null;
                Object obj81 = objArr67[i238 - 1];
                objArr67[i238 - 1] = null;
                objArr67[i238] = obj81;
                objArr67[i238 - 1] = obj80;
                return 0;
            case 179:
                int[] iArr124 = this.RatingCompat;
                int i239 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i239 + 1;
                iArr124[i239] = 37;
                return 0;
            case 180:
                Object[] objArr68 = this.onAddQueueItem;
                int i240 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i240 + 1;
                objArr68[i240] = objArr68[23];
                return 0;
            case 181:
                int i241 = this.AudioAttributesImplApi21Parcelizer;
                int i242 = i241 - 1;
                Object[] objArr69 = this.onAddQueueItem;
                Object obj82 = objArr69[i242];
                objArr69[i242] = null;
                objArr69[12] = obj82;
                this.AudioAttributesImplApi21Parcelizer = i241;
                objArr69[i242] = objArr69[17];
                Object obj83 = objArr69[i241 - 1];
                objArr69[i241 - 1] = null;
                this.RatingCompat[i241 - 1] = ((Object[]) obj83).length;
                return 0;
            case 182:
                int i243 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i243;
                int[] iArr125 = this.RatingCompat;
                iArr125[21] = iArr125[i243];
                return 0;
            case 183:
                int[] iArr126 = this.RatingCompat;
                int i244 = this.AudioAttributesImplApi21Parcelizer;
                iArr126[i244] = 0;
                this.AudioAttributesImplApi21Parcelizer = i244;
                iArr126[22] = iArr126[i244];
                return 0;
            case 184:
                int[] iArr127 = this.RatingCompat;
                int i245 = this.AudioAttributesImplApi21Parcelizer;
                iArr127[i245] = iArr127[22];
                this.AudioAttributesImplApi21Parcelizer = i245 + 2;
                iArr127[i245 + 1] = iArr127[21];
                return 0;
            case 185:
                int[] iArr128 = this.RatingCompat;
                int i246 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i246 + 1;
                iArr128[i246] = iArr128[22];
                return 0;
            case 186:
                int[] iArr129 = this.RatingCompat;
                int i247 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i247 + 1;
                iArr129[i247] = 82;
                return 0;
            case 187:
                int[] iArr130 = this.RatingCompat;
                int i248 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i248 + 1;
                iArr130[i248] = 30;
                return 0;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                int[] iArr131 = this.RatingCompat;
                int i249 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i249 + 1;
                iArr131[i249] = 125;
                return 0;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                int[] iArr132 = this.RatingCompat;
                int i250 = this.AudioAttributesImplApi21Parcelizer;
                iArr132[i250 - 1] = (byte) iArr132[i250 - 1];
                iArr132[i250] = 10;
                this.AudioAttributesImplApi21Parcelizer = i250 + 2;
                iArr132[i250 + 1] = 0;
                return 0;
            case 190:
                Object[] objArr70 = this.onAddQueueItem;
                int i251 = this.AudioAttributesImplApi21Parcelizer;
                Object obj84 = objArr70[i251 - 1];
                objArr70[i251 - 1] = null;
                Object obj85 = objArr70[i251 - 2];
                objArr70[i251 - 2] = null;
                objArr70[i251 - 1] = obj85;
                objArr70[i251 - 2] = obj84;
                this.AudioAttributesImplApi21Parcelizer = i251 + 1;
                objArr70[i251] = null;
                return 0;
            case 191:
                Object[] objArr71 = this.onAddQueueItem;
                int i252 = this.AudioAttributesImplApi21Parcelizer;
                objArr71[i252] = objArr71[20];
                objArr71[i252 + 1] = objArr71[12];
                this.AudioAttributesImplApi21Parcelizer = i252 + 3;
                objArr71[i252 + 2] = objArr71[23];
                return 0;
            case PsExtractor.AUDIO_STREAM /* 192 */:
                int[] iArr133 = this.RatingCompat;
                int i253 = this.AudioAttributesImplApi21Parcelizer;
                iArr133[i253] = 37;
                this.AudioAttributesImplApi21Parcelizer = i253 + 2;
                iArr133[i253 + 1] = 0;
                return 0;
            case 193:
                int i254 = this.AudioAttributesImplApi21Parcelizer;
                int i255 = i254 - 1;
                Object[] objArr72 = this.onAddQueueItem;
                objArr72[i255] = null;
                this.AudioAttributesImplApi21Parcelizer = i254;
                objArr72[i255] = objArr72[23];
                return 0;
            case 194:
                int[] iArr134 = this.RatingCompat;
                iArr134[22] = iArr134[22] + 1;
                return 0;
            case 195:
                int i256 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i256;
                Object[] objArr73 = this.onAddQueueItem;
                Object obj86 = objArr73[i256];
                objArr73[i256] = null;
                objArr73[14] = obj86;
                return 0;
            case 196:
                Object[] objArr74 = this.onAddQueueItem;
                int i257 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i257 + 1;
                objArr74[i257] = objArr74[19];
                return 0;
            case 197:
                Object[] objArr75 = this.onAddQueueItem;
                int i258 = this.AudioAttributesImplApi21Parcelizer;
                Object obj87 = objArr75[i258 - 1];
                objArr75[i258 - 1] = null;
                Object obj88 = objArr75[i258 - 2];
                objArr75[i258 - 2] = null;
                objArr75[i258 - 1] = obj88;
                objArr75[i258 - 2] = obj87;
                int[] iArr135 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i258 + 1;
                iArr135[i258] = 0;
                Object obj89 = objArr75[i258 - 1];
                objArr75[i258 - 1] = null;
                objArr75[i258] = obj89;
                iArr135[i258 - 1] = iArr135[i258];
                return 0;
            case 198:
                int i259 = this.AudioAttributesImplApi21Parcelizer;
                int i260 = i259 - 1;
                Object[] objArr76 = this.onAddQueueItem;
                Object obj90 = objArr76[i260];
                objArr76[i260] = null;
                objArr76[20] = obj90;
                this.AudioAttributesImplApi21Parcelizer = i259;
                objArr76[i260] = objArr76[11];
                return 0;
            case 199:
                int[] iArr136 = this.RatingCompat;
                int i261 = this.AudioAttributesImplApi21Parcelizer;
                iArr136[i261] = 22;
                this.AudioAttributesImplApi21Parcelizer = i261;
                iArr136[i261 - 1] = iArr136[i261 - 1] >> iArr136[i261];
                iArr136[i261 - 1] = (char) iArr136[i261 - 1];
                return 0;
            case 200:
                float[] fArr4 = this.MediaMetadataCompat;
                int i262 = this.AudioAttributesImplApi21Parcelizer;
                fArr4[i262] = 0.0f;
                this.AudioAttributesImplApi21Parcelizer = i262;
                this.RatingCompat[i262 - 1] = (fArr4[i262 - 1] > fArr4[i262] ? 1 : (fArr4[i262 - 1] == fArr4[i262] ? 0 : -1));
                return 0;
            case 201:
                int[] iArr137 = this.RatingCompat;
                int i263 = this.AudioAttributesImplApi21Parcelizer;
                iArr137[i263 - 1] = (char) iArr137[i263 - 1];
                this.AudioAttributesImplApi21Parcelizer = i263 + 1;
                iArr137[i263] = 18;
                return 0;
            case 202:
                int[] iArr138 = this.RatingCompat;
                int i264 = this.AudioAttributesImplApi21Parcelizer;
                iArr138[i264] = 0;
                this.AudioAttributesImplApi21Parcelizer = i264;
                iArr138[15] = iArr138[i264];
                return 0;
            case 203:
                int[] iArr139 = this.RatingCompat;
                int i265 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i265 + 1;
                iArr139[i265] = iArr139[13];
                return 0;
            case 204:
                int[] iArr140 = this.RatingCompat;
                int i266 = this.AudioAttributesImplApi21Parcelizer;
                iArr140[i266] = 51;
                iArr140[15] = iArr140[i266];
                Object[] objArr77 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i266 + 1;
                objArr77[i266] = objArr77[20];
                return 0;
            case 205:
                int i267 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i267;
                Object[] objArr78 = this.onAddQueueItem;
                Object obj91 = objArr78[i267];
                objArr78[i267] = null;
                objArr78[11] = obj91;
                return 0;
            case 206:
                Object[] objArr79 = this.onAddQueueItem;
                int i268 = this.AudioAttributesImplApi21Parcelizer;
                objArr79[i268] = objArr79[19];
                this.AudioAttributesImplApi21Parcelizer = i268 + 2;
                objArr79[i268 + 1] = null;
                return 0;
            case 207:
                Object[] objArr80 = this.onAddQueueItem;
                int i269 = this.AudioAttributesImplApi21Parcelizer;
                Object obj92 = objArr80[i269 - 1];
                objArr80[i269 - 1] = null;
                Object obj93 = objArr80[i269 - 2];
                objArr80[i269 - 2] = null;
                objArr80[i269 - 1] = obj93;
                objArr80[i269 - 2] = obj92;
                int[] iArr141 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i269 + 1;
                iArr141[i269] = 0;
                return 0;
            case 208:
                Object[] objArr81 = this.onAddQueueItem;
                int i270 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i270 + 1;
                objArr81[i270] = objArr81[16];
                return 0;
            case 209:
                Object[] objArr82 = this.onAddQueueItem;
                int i271 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i271 + 1;
                objArr82[i271] = objArr82[14];
                return 0;
            case 210:
                for (int i272 = this.AudioAttributesImplApi21Parcelizer - 1; i272 >= 0; i272--) {
                    this.onAddQueueItem[i272] = null;
                }
                Object[] objArr83 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr83[0] = this.MediaBrowserCompatItemReceiver;
                return 0;
            case 211:
                Object[] objArr84 = this.onAddQueueItem;
                int i273 = this.AudioAttributesImplApi21Parcelizer;
                objArr84[i273] = objArr84[i273 - 1];
                this.AudioAttributesImplApi21Parcelizer = i273;
                Object obj94 = objArr84[i273];
                objArr84[i273] = null;
                objArr84[15] = obj94;
                return 0;
            case 212:
                Object[] objArr85 = this.onAddQueueItem;
                int i274 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i274 + 1;
                objArr85[i274] = objArr85[15];
                return 0;
            case 213:
                int i275 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i275;
                Object[] objArr86 = this.onAddQueueItem;
                Object obj95 = objArr86[i275];
                objArr86[i275] = null;
                objArr86[13] = obj95;
                return 0;
            case 214:
                Object[] objArr87 = this.onAddQueueItem;
                int i276 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i276 + 1;
                objArr87[i276] = objArr87[13];
                return 0;
            case 215:
                int[] iArr142 = this.RatingCompat;
                int i277 = this.AudioAttributesImplApi21Parcelizer;
                iArr142[i277] = 137;
                this.AudioAttributesImplApi21Parcelizer = i277 + 2;
                iArr142[i277 + 1] = 0;
                return 0;
            case 216:
                int i278 = this.AudioAttributesImplApi21Parcelizer;
                int i279 = i278 - 1;
                this.AudioAttributesImplApi21Parcelizer = i279;
                int[] iArr143 = this.RatingCompat;
                iArr143[i278 - 2] = iArr143[i278 - 2] - iArr143[i279];
                iArr143[i278 - 2] = (char) iArr143[i278 - 2];
                return 0;
            case 217:
                int[] iArr144 = this.RatingCompat;
                int i280 = this.AudioAttributesImplApi21Parcelizer;
                iArr144[i280] = 0;
                iArr144[i280 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i280 + 3;
                iArr144[i280 + 2] = 0;
                return 0;
            case 218:
                int i281 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i281;
                Object[] objArr88 = this.onAddQueueItem;
                Object obj96 = objArr88[i281];
                objArr88[i281] = null;
                objArr88[15] = obj96;
                return 0;
            case 219:
                Object[] objArr89 = this.onAddQueueItem;
                int i282 = this.AudioAttributesImplApi21Parcelizer;
                objArr89[i282] = objArr89[15];
                int[] iArr145 = this.RatingCompat;
                iArr145[i282 + 1] = 0;
                int i283 = i282 + 1;
                this.AudioAttributesImplApi21Parcelizer = i283;
                Object obj97 = objArr89[i282];
                objArr89[i282] = null;
                objArr89[i282] = ((Object[]) obj97)[iArr145[i283]];
                return 0;
            case 220:
                Object[] objArr90 = this.onAddQueueItem;
                int i284 = this.AudioAttributesImplApi21Parcelizer;
                objArr90[i284] = objArr90[13];
                int[] iArr146 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i284 + 2;
                iArr146[i284 + 1] = iArr146[12];
                return 0;
            case 221:
                int i285 = this.AudioAttributesImplApi21Parcelizer;
                int i286 = i285 - 1;
                Object[] objArr91 = this.onAddQueueItem;
                Object obj98 = objArr91[i286];
                objArr91[i286] = null;
                objArr91[13] = obj98;
                int i287 = i285 - 2;
                int[] iArr147 = this.RatingCompat;
                iArr147[11] = iArr147[i287];
                this.AudioAttributesImplApi21Parcelizer = i285 - 1;
                iArr147[i287] = 2;
                return 0;
            case 222:
                Object[] objArr92 = this.onAddQueueItem;
                int i288 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr148 = this.RatingCompat;
                objArr92[i288 - 1] = new int[iArr148[i288 - 1]];
                int i289 = i288 - 3;
                this.AudioAttributesImplApi21Parcelizer = i289;
                Object obj99 = objArr92[i289];
                objArr92[i289] = null;
                int i290 = iArr148[i288 - 2];
                Object obj100 = objArr92[i288 - 1];
                objArr92[i288 - 1] = null;
                ((Object[]) obj99)[i290] = obj100;
                return 0;
            case 223:
                Object[] objArr93 = this.onAddQueueItem;
                int i291 = this.AudioAttributesImplApi21Parcelizer;
                objArr93[i291] = objArr93[i291 - 1];
                objArr93[i291] = null;
                this.AudioAttributesImplApi21Parcelizer = i291 + 1;
                objArr93[i291] = objArr93[i291 - 1];
                return 0;
            case 224:
                int[] iArr149 = this.RatingCompat;
                int i292 = this.AudioAttributesImplApi21Parcelizer;
                iArr149[i292] = iArr149[11];
                Object[] objArr94 = this.onAddQueueItem;
                objArr94[i292 + 1] = objArr94[13];
                int i293 = i292 + 1;
                this.AudioAttributesImplApi21Parcelizer = i293;
                Object obj101 = objArr94[i293];
                objArr94[i293] = null;
                objArr94[20] = obj101;
                return 0;
            case 225:
                int i294 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i294;
                int[] iArr150 = this.RatingCompat;
                iArr150[19] = iArr150[i294];
                return 0;
            case 226:
                int[] iArr151 = this.RatingCompat;
                int i295 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i295 + 1;
                iArr151[i295] = iArr151[19];
                return 0;
            case 227:
                Object[] objArr95 = this.onAddQueueItem;
                int i296 = this.AudioAttributesImplApi21Parcelizer;
                Object obj102 = objArr95[i296 - 2];
                objArr95[i296 - 2] = null;
                objArr95[i296 - 1] = obj102;
                int[] iArr152 = this.RatingCompat;
                iArr152[i296 - 2] = iArr152[i296 - 1];
                this.AudioAttributesImplApi21Parcelizer = i296 + 1;
                iArr152[i296] = 1;
                return 0;
            case 228:
                int[] iArr153 = this.RatingCompat;
                int i297 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i297 + 1;
                iArr153[i297] = 0;
                int i298 = iArr153[i297];
                iArr153[i297] = iArr153[i297 - 1];
                iArr153[i297 - 1] = i298;
                return 0;
            case 229:
                int i299 = this.AudioAttributesImplApi21Parcelizer;
                int i300 = i299 - 3;
                this.AudioAttributesImplApi21Parcelizer = i300;
                Object[] objArr96 = this.onAddQueueItem;
                Object obj103 = objArr96[i300];
                objArr96[i300] = null;
                int[] iArr154 = this.RatingCompat;
                ((int[]) obj103)[iArr154[i299 - 2]] = iArr154[i299 - 1];
                objArr96[i300] = objArr96[18];
                this.AudioAttributesImplApi21Parcelizer = i299 - 1;
                objArr96[i299 - 2] = objArr96[20];
                return 0;
            case 230:
                Object[] objArr97 = this.onAddQueueItem;
                int i301 = this.AudioAttributesImplApi21Parcelizer;
                objArr97[i301] = objArr97[i301 - 1];
                int[] iArr155 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i301 + 2;
                iArr155[i301 + 1] = 1;
                return 0;
            case 231:
                int[] iArr156 = this.RatingCompat;
                int i302 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i302 + 1;
                iArr156[i302] = 1;
                Object[] objArr98 = this.onAddQueueItem;
                objArr98[i302] = new int[iArr156[i302]];
                int i303 = i302 - 2;
                this.AudioAttributesImplApi21Parcelizer = i303;
                Object obj104 = objArr98[i303];
                objArr98[i303] = null;
                int i304 = iArr156[i302 - 1];
                Object obj105 = objArr98[i302];
                objArr98[i302] = null;
                ((Object[]) obj104)[i304] = obj105;
                return 0;
            case 232:
                Object[] objArr99 = this.onAddQueueItem;
                int i305 = this.AudioAttributesImplApi21Parcelizer;
                objArr99[i305] = objArr99[i305 - 1];
                this.AudioAttributesImplApi21Parcelizer = i305;
                objArr99[i305] = null;
                return 0;
            case 233:
                Object[] objArr100 = this.onAddQueueItem;
                int i306 = this.AudioAttributesImplApi21Parcelizer;
                objArr100[i306] = objArr100[13];
                this.AudioAttributesImplApi21Parcelizer = i306;
                Object obj106 = objArr100[i306];
                objArr100[i306] = null;
                objArr100[20] = obj106;
                return 0;
            case 234:
                int i307 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr157 = this.RatingCompat;
                iArr157[19] = iArr157[i307 - 1];
                int i308 = i307 - 2;
                this.AudioAttributesImplApi21Parcelizer = i308;
                Object[] objArr101 = this.onAddQueueItem;
                Object obj107 = objArr101[i308];
                objArr101[i308] = null;
                objArr101[18] = obj107;
                return 0;
            case 235:
                int i309 = this.AudioAttributesImplApi21Parcelizer;
                int i310 = i309 - 1;
                Object[] objArr102 = this.onAddQueueItem;
                objArr102[i310] = null;
                objArr102[i310] = objArr102[18];
                int[] iArr158 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i309 + 1;
                iArr158[i309] = iArr158[19];
                return 0;
            case 236:
                int[] iArr159 = this.RatingCompat;
                int i311 = this.AudioAttributesImplApi21Parcelizer;
                iArr159[i311] = 1;
                this.AudioAttributesImplApi21Parcelizer = i311;
                Object[] objArr103 = this.onAddQueueItem;
                Object obj108 = objArr103[i311 - 1];
                objArr103[i311 - 1] = null;
                objArr103[i311 - 1] = ((Object[]) obj108)[iArr159[i311]];
                return 0;
            case 237:
                int i312 = this.AudioAttributesImplApi21Parcelizer;
                int i313 = i312 - 3;
                this.AudioAttributesImplApi21Parcelizer = i313;
                Object[] objArr104 = this.onAddQueueItem;
                Object obj109 = objArr104[i313];
                objArr104[i313] = null;
                int[] iArr160 = this.RatingCompat;
                ((int[]) obj109)[iArr160[i312 - 2]] = iArr160[i312 - 1];
                this.AudioAttributesImplApi21Parcelizer = i312 - 2;
                objArr104[i313] = objArr104[18];
                return 0;
            case 238:
                Object[] objArr105 = this.onAddQueueItem;
                int i314 = this.AudioAttributesImplApi21Parcelizer;
                objArr105[i314] = objArr105[20];
                int[] iArr161 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i314 + 2;
                iArr161[i314 + 1] = 0;
                Object obj110 = objArr105[i314];
                objArr105[i314] = null;
                objArr105[i314 + 1] = obj110;
                iArr161[i314] = iArr161[i314 + 1];
                return 0;
            case 239:
                int[] iArr162 = this.RatingCompat;
                int i315 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i315 + 1;
                iArr162[i315] = iArr162[12];
                return 0;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                int[] iArr163 = this.RatingCompat;
                int i316 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i316 + 1;
                iArr163[i316] = 32;
                return 0;
            case 241:
                int[] iArr164 = this.RatingCompat;
                int i317 = this.AudioAttributesImplApi21Parcelizer;
                iArr164[i317] = 1;
                this.AudioAttributesImplApi21Parcelizer = i317 + 2;
                iArr164[i317 + 1] = 1;
                return 0;
            case 242:
                Object[] objArr106 = this.onAddQueueItem;
                int i318 = this.AudioAttributesImplApi21Parcelizer;
                objArr106[i318 - 1] = new int[this.RatingCompat[i318 - 1]];
                return 0;
            case 243:
                int i319 = this.AudioAttributesImplApi21Parcelizer;
                int i320 = i319 - 3;
                this.AudioAttributesImplApi21Parcelizer = i320;
                Object[] objArr107 = this.onAddQueueItem;
                Object obj111 = objArr107[i320];
                objArr107[i320] = null;
                int i321 = this.RatingCompat[i319 - 2];
                Object obj112 = objArr107[i319 - 1];
                objArr107[i319 - 1] = null;
                ((Object[]) obj111)[i321] = obj112;
                objArr107[i320] = objArr107[i319 - 4];
                int i322 = i319 - 3;
                this.AudioAttributesImplApi21Parcelizer = i322;
                objArr107[i322] = null;
                return 0;
            case 244:
                int[] iArr165 = this.RatingCompat;
                int i323 = this.AudioAttributesImplApi21Parcelizer;
                iArr165[i323] = 58;
                Object[] objArr108 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i323 + 2;
                objArr108[i323 + 1] = objArr108[13];
                return 0;
            case 245:
                int i324 = this.AudioAttributesImplApi21Parcelizer;
                int i325 = i324 - 1;
                Object[] objArr109 = this.onAddQueueItem;
                Object obj113 = objArr109[i325];
                objArr109[i325] = null;
                objArr109[20] = obj113;
                int[] iArr166 = this.RatingCompat;
                iArr166[19] = iArr166[i324 - 2];
                int i326 = i324 - 3;
                this.AudioAttributesImplApi21Parcelizer = i326;
                Object obj114 = objArr109[i326];
                objArr109[i326] = null;
                objArr109[18] = obj114;
                return 0;
            case 246:
                Object[] objArr110 = this.onAddQueueItem;
                int i327 = this.AudioAttributesImplApi21Parcelizer;
                objArr110[i327] = objArr110[18];
                int[] iArr167 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i327 + 2;
                iArr167[i327 + 1] = iArr167[19];
                Object obj115 = objArr110[i327];
                objArr110[i327] = null;
                objArr110[i327 + 1] = obj115;
                iArr167[i327] = iArr167[i327 + 1];
                return 0;
            case 247:
                int[] iArr168 = this.RatingCompat;
                int i328 = this.AudioAttributesImplApi21Parcelizer;
                iArr168[i328 - 1] = iArr168[i328 - 2];
                Object[] objArr111 = this.onAddQueueItem;
                Object obj116 = objArr111[i328 - 1];
                objArr111[i328 - 1] = null;
                objArr111[i328 - 2] = obj116;
                this.AudioAttributesImplApi21Parcelizer = i328 + 1;
                iArr168[i328] = 0;
                int i329 = iArr168[i328];
                iArr168[i328] = iArr168[i328 - 1];
                iArr168[i328 - 1] = i329;
                return 0;
            case 248:
                int i330 = this.AudioAttributesImplApi21Parcelizer;
                int i331 = i330 - 3;
                this.AudioAttributesImplApi21Parcelizer = i331;
                Object[] objArr112 = this.onAddQueueItem;
                Object obj117 = objArr112[i331];
                objArr112[i331] = null;
                int[] iArr169 = this.RatingCompat;
                ((int[]) obj117)[iArr169[i330 - 2]] = iArr169[i330 - 1];
                return 0;
            case 249:
                Object[] objArr113 = this.onAddQueueItem;
                int i332 = this.AudioAttributesImplApi21Parcelizer;
                objArr113[i332] = objArr113[18];
                objArr113[i332 + 1] = objArr113[20];
                int[] iArr170 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i332 + 3;
                iArr170[i332 + 2] = 0;
                return 0;
            case 250:
                int i333 = this.AudioAttributesImplApi21Parcelizer;
                int i334 = i333 - 1;
                Object[] objArr114 = this.onAddQueueItem;
                Object obj118 = objArr114[i334];
                objArr114[i334] = null;
                objArr114[13] = obj118;
                int[] iArr171 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i333;
                iArr171[i334] = 2;
                return 0;
            case 251:
                int[] iArr172 = this.RatingCompat;
                int i335 = this.AudioAttributesImplApi21Parcelizer;
                iArr172[i335] = 1;
                this.AudioAttributesImplApi21Parcelizer = i335 + 2;
                iArr172[i335 + 1] = 1;
                this.onAddQueueItem[i335 + 1] = new int[iArr172[i335 + 1]];
                return 0;
            case 252:
                int i336 = this.AudioAttributesImplApi21Parcelizer;
                int i337 = i336 - 1;
                Object[] objArr115 = this.onAddQueueItem;
                objArr115[i337] = null;
                this.AudioAttributesImplApi21Parcelizer = i336;
                objArr115[i337] = objArr115[18];
                return 0;
            case 253:
                int[] iArr173 = this.RatingCompat;
                int i338 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i338 + 1;
                iArr173[i338] = iArr173[19];
                Object[] objArr116 = this.onAddQueueItem;
                Object obj119 = objArr116[i338 - 1];
                objArr116[i338 - 1] = null;
                objArr116[i338] = obj119;
                iArr173[i338 - 1] = iArr173[i338];
                return 0;
            case 254:
                int[] iArr174 = this.RatingCompat;
                int i339 = this.AudioAttributesImplApi21Parcelizer;
                iArr174[i339] = 1;
                this.AudioAttributesImplApi21Parcelizer = i339;
                iArr174[i339 - 1] = iArr174[i339 - 1] - iArr174[i339];
                return 0;
            case 255:
                int i340 = this.AudioAttributesImplApi21Parcelizer;
                int i341 = i340 - 1;
                Object[] objArr117 = this.onAddQueueItem;
                Object obj120 = objArr117[i341];
                objArr117[i341] = null;
                objArr117[15] = obj120;
                this.AudioAttributesImplApi21Parcelizer = i340;
                objArr117[i341] = objArr117[14];
                return 0;
            case 256:
                int[] iArr175 = this.RatingCompat;
                int i342 = this.AudioAttributesImplApi21Parcelizer;
                iArr175[i342] = 1;
                iArr175[i342 - 1] = iArr175[i342 - 1] - iArr175[i342];
                int i343 = i342 - 1;
                this.AudioAttributesImplApi21Parcelizer = i343;
                iArr175[16] = iArr175[i343];
                return 0;
            case 257:
                int i344 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i344;
                this.write = this.RatingCompat[i344] < 0 ? 0 : 1;
                return 0;
            case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                int[] iArr176 = this.RatingCompat;
                int i345 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i345 + 1;
                iArr176[i345] = iArr176[16];
                return 0;
            case 259:
                int[] iArr177 = this.RatingCompat;
                int i346 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i346 + 1;
                iArr177[i346] = 83;
                return 0;
            case 260:
                int[] iArr178 = this.RatingCompat;
                int i347 = this.AudioAttributesImplApi21Parcelizer;
                iArr178[i347] = 22;
                iArr178[i347 - 1] = iArr178[i347 - 1] >> iArr178[i347];
                int i348 = i347 - 1;
                this.AudioAttributesImplApi21Parcelizer = i348;
                iArr178[i347 - 2] = iArr178[i347 - 2] - iArr178[i348];
                return 0;
            case 261:
                int[] iArr179 = this.RatingCompat;
                int i349 = this.AudioAttributesImplApi21Parcelizer;
                iArr179[i349 - 1] = (byte) iArr179[i349 - 1];
                iArr179[i349] = 30;
                float[] fArr5 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi21Parcelizer = i349 + 2;
                fArr5[i349 + 1] = 0.0f;
                return 0;
            case 262:
                float[] fArr6 = this.MediaMetadataCompat;
                int i350 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i350 + 1;
                this.AudioAttributesImplApi26Parcelizer = fArr6[i350];
                return 0;
            case TarConstants.VERSION_OFFSET /* 263 */:
                float[] fArr7 = this.MediaMetadataCompat;
                int i351 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i351 + 1;
                fArr7[i351] = 0.0f;
                return 0;
            case 264:
                Object[] objArr118 = this.onAddQueueItem;
                int i352 = this.AudioAttributesImplApi21Parcelizer;
                objArr118[i352] = objArr118[15];
                int[] iArr180 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i352 + 2;
                iArr180[i352 + 1] = 0;
                return 0;
            case 265:
                int[] iArr181 = this.RatingCompat;
                int i353 = this.AudioAttributesImplApi21Parcelizer;
                iArr181[i353] = 60;
                this.AudioAttributesImplApi21Parcelizer = i353 + 2;
                iArr181[i353 + 1] = 48;
                return 0;
            case 266:
                Object[] objArr119 = this.onAddQueueItem;
                int i354 = this.AudioAttributesImplApi21Parcelizer;
                objArr119[i354] = objArr119[14];
                int[] iArr182 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i354 + 2;
                iArr182[i354 + 1] = iArr182[16];
                return 0;
            case 267:
                Object[] objArr120 = this.onAddQueueItem;
                int i355 = this.AudioAttributesImplApi21Parcelizer;
                objArr120[i355] = objArr120[i355 - 1];
                this.AudioAttributesImplApi21Parcelizer = i355;
                Object obj121 = objArr120[i355];
                objArr120[i355] = null;
                objArr120[17] = obj121;
                return 0;
            case 268:
                Object[] objArr121 = this.onAddQueueItem;
                int i356 = this.AudioAttributesImplApi21Parcelizer;
                Object obj122 = objArr121[i356 - 2];
                objArr121[i356 - 2] = null;
                objArr121[i356 - 1] = obj122;
                int[] iArr183 = this.RatingCompat;
                iArr183[i356 - 2] = iArr183[i356 - 1];
                int i357 = i356 - 3;
                this.AudioAttributesImplApi21Parcelizer = i357;
                Object obj123 = objArr121[i357];
                objArr121[i357] = null;
                int i358 = iArr183[i356 - 2];
                Object obj124 = objArr121[i356 - 1];
                objArr121[i356 - 1] = null;
                ((Object[]) obj123)[i358] = obj124;
                this.AudioAttributesImplApi21Parcelizer = i356 - 2;
                iArr183[i357] = 84;
                return 0;
            case 269:
                long[] jArr11 = this.MediaBrowserCompatMediaItem;
                int i359 = this.AudioAttributesImplApi21Parcelizer;
                jArr11[i359] = 0;
                this.AudioAttributesImplApi21Parcelizer = i359;
                this.RatingCompat[i359 - 1] = (jArr11[i359 - 1] > jArr11[i359] ? 1 : (jArr11[i359 - 1] == jArr11[i359] ? 0 : -1));
                return 0;
            case 270:
                int[] iArr184 = this.RatingCompat;
                int i360 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i360 + 1;
                iArr184[i360] = 6;
                return 0;
            case 271:
                int[] iArr185 = this.RatingCompat;
                int i361 = this.AudioAttributesImplApi21Parcelizer;
                iArr185[i361] = 23;
                this.AudioAttributesImplApi21Parcelizer = i361 + 2;
                iArr185[i361 + 1] = 0;
                return 0;
            case 272:
                int[] iArr186 = this.RatingCompat;
                int i362 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i362 + 1;
                iArr186[i362] = 35;
                return 0;
            case 273:
                int[] iArr187 = this.RatingCompat;
                int i363 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i363 + 1;
                iArr187[i363] = 13;
                return 0;
            case 274:
                int[] iArr188 = this.RatingCompat;
                int i364 = this.AudioAttributesImplApi21Parcelizer;
                iArr188[i364] = iArr188[12];
                iArr188[i364 + 1] = 64;
                int i365 = i364 + 1;
                this.AudioAttributesImplApi21Parcelizer = i365;
                iArr188[i364] = iArr188[i364] & iArr188[i365];
                return 0;
            case 275:
                int[] iArr189 = this.RatingCompat;
                int i366 = this.AudioAttributesImplApi21Parcelizer;
                iArr189[i366] = 15;
                this.AudioAttributesImplApi21Parcelizer = i366 + 2;
                iArr189[i366 + 1] = 0;
                return 0;
            case 276:
                Object[] objArr122 = this.onAddQueueItem;
                int i367 = this.AudioAttributesImplApi21Parcelizer;
                objArr122[i367] = objArr122[i367 - 1];
                int[] iArr190 = this.RatingCompat;
                iArr190[i367 + 1] = 1;
                this.AudioAttributesImplApi21Parcelizer = i367 + 3;
                iArr190[i367 + 2] = 1;
                return 0;
            case 277:
                int i368 = this.AudioAttributesImplApi21Parcelizer;
                int i369 = i368 - 1;
                Object[] objArr123 = this.onAddQueueItem;
                objArr123[i369] = null;
                objArr123[i369] = objArr123[i368 - 2];
                int[] iArr191 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i368 + 1;
                iArr191[i368] = 12;
                return 0;
            case 278:
                int i370 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i370;
                Object[] objArr124 = this.onAddQueueItem;
                Object obj125 = objArr124[i370];
                objArr124[i370] = null;
                objArr124[20] = obj125;
                return 0;
            case 279:
                Object[] objArr125 = this.onAddQueueItem;
                int i371 = this.AudioAttributesImplApi21Parcelizer;
                objArr125[i371] = objArr125[18];
                this.AudioAttributesImplApi21Parcelizer = i371;
                objArr125[i371] = null;
                return 0;
            case 280:
                Object[] objArr126 = this.onAddQueueItem;
                int i372 = this.AudioAttributesImplApi21Parcelizer;
                objArr126[i372] = objArr126[18];
                int[] iArr192 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i372 + 2;
                iArr192[i372 + 1] = iArr192[19];
                return 0;
            case 281:
                Object[] objArr127 = this.onAddQueueItem;
                int i373 = this.AudioAttributesImplApi21Parcelizer;
                objArr127[i373] = objArr127[18];
                this.AudioAttributesImplApi21Parcelizer = i373 + 2;
                objArr127[i373 + 1] = objArr127[20];
                return 0;
            case 282:
                int[] iArr193 = this.RatingCompat;
                int i374 = this.AudioAttributesImplApi21Parcelizer;
                iArr193[i374] = 11;
                Object[] objArr128 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i374 + 2;
                objArr128[i374 + 1] = objArr128[13];
                return 0;
            case 283:
                int[] iArr194 = this.RatingCompat;
                int i375 = this.AudioAttributesImplApi21Parcelizer;
                int i376 = iArr194[i375 - 1];
                iArr194[i375 - 1] = iArr194[i375 - 2];
                iArr194[i375 - 2] = i376;
                int i377 = i375 - 3;
                this.AudioAttributesImplApi21Parcelizer = i377;
                Object[] objArr129 = this.onAddQueueItem;
                Object obj126 = objArr129[i377];
                objArr129[i377] = null;
                ((int[]) obj126)[iArr194[i375 - 2]] = iArr194[i375 - 1];
                return 0;
            case 284:
                Object[] objArr130 = this.onAddQueueItem;
                int i378 = this.AudioAttributesImplApi21Parcelizer;
                objArr130[i378] = objArr130[18];
                objArr130[i378] = null;
                this.AudioAttributesImplApi21Parcelizer = i378 + 1;
                objArr130[i378] = objArr130[18];
                return 0;
            case 285:
                Object[] objArr131 = this.onAddQueueItem;
                int i379 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr195 = this.RatingCompat;
                objArr131[i379 - 1] = new int[iArr195[i379 - 1]];
                int i380 = i379 - 3;
                this.AudioAttributesImplApi21Parcelizer = i380;
                Object obj127 = objArr131[i380];
                objArr131[i380] = null;
                int i381 = iArr195[i379 - 2];
                Object obj128 = objArr131[i379 - 1];
                objArr131[i379 - 1] = null;
                ((Object[]) obj127)[i381] = obj128;
                this.AudioAttributesImplApi21Parcelizer = i379 - 2;
                objArr131[i380] = objArr131[i379 - 4];
                return 0;
            case 286:
                int i382 = this.AudioAttributesImplApi21Parcelizer;
                int i383 = i382 - 1;
                Object[] objArr132 = this.onAddQueueItem;
                objArr132[i383] = null;
                this.AudioAttributesImplApi21Parcelizer = i382;
                objArr132[i383] = objArr132[i382 - 2];
                return 0;
            case 287:
                int[] iArr196 = this.RatingCompat;
                int i384 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i384 + 1;
                iArr196[i384] = 10;
                return 0;
            case 288:
                int i385 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr197 = this.RatingCompat;
                iArr197[19] = iArr197[i385 - 1];
                int i386 = i385 - 2;
                Object[] objArr133 = this.onAddQueueItem;
                Object obj129 = objArr133[i386];
                objArr133[i386] = null;
                objArr133[18] = obj129;
                this.AudioAttributesImplApi21Parcelizer = i385 - 1;
                objArr133[i386] = obj129;
                return 0;
            case 289:
                Object[] objArr134 = this.onAddQueueItem;
                int i387 = this.AudioAttributesImplApi21Parcelizer;
                objArr134[i387] = objArr134[17];
                int[] iArr198 = this.RatingCompat;
                iArr198[i387 + 1] = 143;
                this.AudioAttributesImplApi21Parcelizer = i387 + 3;
                iArr198[i387 + 2] = 0;
                return 0;
            case 290:
                int[] iArr199 = this.RatingCompat;
                int i388 = this.AudioAttributesImplApi21Parcelizer;
                iArr199[i388] = 24;
                this.AudioAttributesImplApi21Parcelizer = i388 + 2;
                iArr199[i388 + 1] = 0;
                return 0;
            case 291:
                double[] dArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i389 = this.AudioAttributesImplApi21Parcelizer;
                dArr5[i389] = 0.0d;
                this.AudioAttributesImplApi21Parcelizer = i389;
                this.RatingCompat[i389 - 1] = (dArr5[i389 - 1] > dArr5[i389] ? 1 : (dArr5[i389 - 1] == dArr5[i389] ? 0 : -1));
                return 0;
            case 292:
                Object[] objArr135 = this.onAddQueueItem;
                int i390 = this.AudioAttributesImplApi21Parcelizer;
                objArr135[i390] = objArr135[15];
                objArr135[i390 + 1] = objArr135[13];
                this.AudioAttributesImplApi21Parcelizer = i390 + 3;
                objArr135[i390 + 2] = objArr135[14];
                return 0;
            case 293:
                int[] iArr200 = this.RatingCompat;
                int i391 = this.AudioAttributesImplApi21Parcelizer;
                iArr200[i391] = 24;
                iArr200[i391 - 1] = iArr200[i391 - 1] >> iArr200[i391];
                int i392 = i391 - 1;
                this.AudioAttributesImplApi21Parcelizer = i392;
                iArr200[i391 - 2] = iArr200[i391 - 2] + iArr200[i392];
                return 0;
            case 294:
                int[] iArr201 = this.RatingCompat;
                int i393 = this.AudioAttributesImplApi21Parcelizer;
                iArr201[i393] = 12;
                this.AudioAttributesImplApi21Parcelizer = i393 + 2;
                iArr201[i393 + 1] = 0;
                return 0;
            case 295:
                int[] iArr202 = this.RatingCompat;
                int i394 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i394 + 1;
                iArr202[i394] = iArr202[i394 - 1];
                return 0;
            case 296:
                int[] iArr203 = this.RatingCompat;
                int i395 = this.AudioAttributesImplApi21Parcelizer;
                iArr203[i395] = iArr203[15];
                Object[] objArr136 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i395 + 2;
                objArr136[i395 + 1] = objArr136[11];
                return 0;
            case 297:
                int i396 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i396;
                int[] iArr204 = this.RatingCompat;
                iArr204[11] = iArr204[i396];
                return 0;
            case 298:
                int[] iArr205 = this.RatingCompat;
                int i397 = this.AudioAttributesImplApi21Parcelizer;
                iArr205[i397] = iArr205[11];
                Object[] objArr137 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i397 + 2;
                objArr137[i397 + 1] = objArr137[13];
                return 0;
            case 299:
                int i398 = this.AudioAttributesImplApi21Parcelizer;
                int i399 = i398 - 1;
                Object[] objArr138 = this.onAddQueueItem;
                Object obj130 = objArr138[i399];
                objArr138[i399] = null;
                objArr138[18] = obj130;
                this.AudioAttributesImplApi21Parcelizer = i398;
                objArr138[i399] = obj130;
                return 0;
            case 300:
                Object[] objArr139 = this.onAddQueueItem;
                int i400 = this.AudioAttributesImplApi21Parcelizer;
                objArr139[i400] = objArr139[17];
                this.AudioAttributesImplApi21Parcelizer = i400;
                Object obj131 = objArr139[i400];
                objArr139[i400] = null;
                objArr139[15] = obj131;
                return 0;
            case 301:
                this.RatingCompat[16] = r0[16] - 1;
                return 0;
            case 302:
                int i401 = this.AudioAttributesImplApi21Parcelizer;
                int i402 = i401 - 1;
                Object[] objArr140 = this.onAddQueueItem;
                Object obj132 = objArr140[i402];
                objArr140[i402] = null;
                objArr140[13] = obj132;
                int[] iArr206 = this.RatingCompat;
                iArr206[i402] = iArr206[12];
                this.AudioAttributesImplApi21Parcelizer = i401 + 1;
                iArr206[i401] = 8;
                return 0;
            case 303:
                Object[] objArr141 = this.onAddQueueItem;
                int i403 = this.AudioAttributesImplApi21Parcelizer;
                objArr141[i403] = objArr141[i403 - 1];
                this.RatingCompat[i403 + 1] = 56;
                this.AudioAttributesImplApi21Parcelizer = i403 + 3;
                objArr141[i403 + 2] = objArr141[13];
                return 0;
            case 304:
                int[] iArr207 = this.RatingCompat;
                int i404 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i404 + 1;
                iArr207[i404] = 1;
                this.onAddQueueItem[i404] = new int[iArr207[i404]];
                return 0;
            case 305:
                Object[] objArr142 = this.onAddQueueItem;
                int i405 = this.AudioAttributesImplApi21Parcelizer;
                objArr142[i405] = null;
                Object obj133 = objArr142[i405];
                objArr142[i405] = null;
                objArr142[20] = obj133;
                int i406 = i405 - 1;
                this.AudioAttributesImplApi21Parcelizer = i406;
                int[] iArr208 = this.RatingCompat;
                iArr208[19] = iArr208[i406];
                return 0;
            case 306:
                int i407 = this.AudioAttributesImplApi21Parcelizer;
                int i408 = i407 - 1;
                Object[] objArr143 = this.onAddQueueItem;
                Object obj134 = objArr143[i408];
                objArr143[i408] = null;
                objArr143[18] = obj134;
                objArr143[i408] = obj134;
                int i409 = i407 - 1;
                this.AudioAttributesImplApi21Parcelizer = i409;
                objArr143[i409] = null;
                return 0;
            case 307:
                int[] iArr209 = this.RatingCompat;
                int i410 = this.AudioAttributesImplApi21Parcelizer;
                iArr209[i410] = iArr209[19];
                Object[] objArr144 = this.onAddQueueItem;
                Object obj135 = objArr144[i410 - 1];
                objArr144[i410 - 1] = null;
                objArr144[i410] = obj135;
                iArr209[i410 - 1] = iArr209[i410];
                this.AudioAttributesImplApi21Parcelizer = i410 + 2;
                iArr209[i410 + 1] = 1;
                return 0;
            case 308:
                int i411 = this.AudioAttributesImplApi21Parcelizer;
                int i412 = i411 - 1;
                this.AudioAttributesImplApi21Parcelizer = i412;
                int[] iArr210 = this.RatingCompat;
                iArr210[i411 - 2] = iArr210[i411 - 2] % iArr210[i412];
                int i413 = i411 - 2;
                this.AudioAttributesImplApi21Parcelizer = i413;
                this.onAddQueueItem[i413] = null;
                return 0;
            case 309:
                int[] iArr211 = this.RatingCompat;
                int i414 = this.AudioAttributesImplApi21Parcelizer;
                iArr211[i414] = 2;
                this.AudioAttributesImplApi21Parcelizer = i414 + 2;
                iArr211[i414 + 1] = 2;
                return 0;
            case 310:
                int[] iArr212 = this.RatingCompat;
                int i415 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i415 + 1;
                iArr212[i415] = 117;
                return 0;
            case 311:
                int i416 = this.AudioAttributesImplApi21Parcelizer;
                int i417 = i416 - 1;
                int[] iArr213 = this.RatingCompat;
                iArr213[i416 - 2] = iArr213[i416 - 2] + iArr213[i417];
                iArr213[i417] = iArr213[i416 - 2];
                this.AudioAttributesImplApi21Parcelizer = i416 + 1;
                iArr213[i416] = 128;
                return 0;
            case 312:
                int i418 = this.AudioAttributesImplApi21Parcelizer;
                int i419 = i418 - 1;
                this.AudioAttributesImplApi21Parcelizer = i419;
                int[] iArr214 = this.RatingCompat;
                iArr214[i418 - 2] = iArr214[i418 - 2] % iArr214[i419];
                return 0;
            case 313:
                int[] iArr215 = this.RatingCompat;
                int i420 = this.AudioAttributesImplApi21Parcelizer;
                iArr215[i420] = 2;
                this.AudioAttributesImplApi21Parcelizer = i420;
                iArr215[i420 - 1] = iArr215[i420 - 1] % iArr215[i420];
                return 0;
            case 314:
                int[] iArr216 = this.RatingCompat;
                int i421 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i421 + 1;
                iArr216[i421] = 123;
                return 0;
            case 315:
                int[] iArr217 = this.RatingCompat;
                int i422 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i422 + 1;
                iArr217[i422] = 128;
                return 0;
            case 316:
                int[] iArr218 = this.RatingCompat;
                int i423 = this.AudioAttributesImplApi21Parcelizer;
                iArr218[i423] = 101;
                this.AudioAttributesImplApi21Parcelizer = i423;
                iArr218[i423 - 1] = iArr218[i423 - 1] + iArr218[i423];
                return 0;
            case 317:
                int[] iArr219 = this.RatingCompat;
                int i424 = this.AudioAttributesImplApi21Parcelizer;
                iArr219[i424] = iArr219[i424 - 1];
                iArr219[i424 + 1] = 128;
                int i425 = i424 + 1;
                this.AudioAttributesImplApi21Parcelizer = i425;
                iArr219[i424] = iArr219[i424] % iArr219[i425];
                return 0;
            case 318:
                int[] iArr220 = this.RatingCompat;
                int i426 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i426;
                this.write = iArr220[i426];
                return 0;
            case 319:
                int[] iArr221 = this.RatingCompat;
                int i427 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i427 + 1;
                iArr221[i427] = 45;
                return 0;
            case 320:
                int i428 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr222 = this.RatingCompat;
                float[] fArr8 = this.MediaMetadataCompat;
                iArr222[i428 - 2] = (fArr8[i428 - 2] > fArr8[i428 - 1] ? 1 : (fArr8[i428 - 2] == fArr8[i428 - 1] ? 0 : -1));
                int i429 = i428 - 2;
                this.AudioAttributesImplApi21Parcelizer = i429;
                iArr222[i428 - 3] = iArr222[i428 - 3] - iArr222[i429];
                return 0;
            case 321:
                Object[] objArr145 = this.onAddQueueItem;
                int i430 = this.AudioAttributesImplApi21Parcelizer;
                objArr145[i430] = objArr145[i430 - 1];
                this.AudioAttributesImplApi21Parcelizer = i430;
                Object obj136 = objArr145[i430];
                objArr145[i430] = null;
                objArr145[16] = obj136;
                return 0;
            case 322:
                Object[] objArr146 = this.onAddQueueItem;
                int i431 = this.AudioAttributesImplApi21Parcelizer;
                objArr146[i431] = objArr146[16];
                int[] iArr223 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i431 + 2;
                iArr223[i431 + 1] = 0;
                return 0;
            case 323:
                int[] iArr224 = this.RatingCompat;
                int i432 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i432 + 1;
                iArr224[i432] = 137;
                return 0;
            case 324:
                int[] iArr225 = this.RatingCompat;
                int i433 = this.AudioAttributesImplApi21Parcelizer;
                iArr225[i433 - 1] = (char) iArr225[i433 - 1];
                this.AudioAttributesImplApi21Parcelizer = i433 + 1;
                iArr225[i433] = 5;
                return 0;
            case 325:
                Object[] objArr147 = this.onAddQueueItem;
                int i434 = this.AudioAttributesImplApi21Parcelizer;
                objArr147[i434] = objArr147[11];
                this.AudioAttributesImplApi21Parcelizer = i434 + 2;
                objArr147[i434 + 1] = objArr147[14];
                return 0;
            case 326:
                Object[] objArr148 = this.onAddQueueItem;
                int i435 = this.AudioAttributesImplApi21Parcelizer;
                objArr148[i435] = objArr148[i435 - 1];
                this.AudioAttributesImplApi21Parcelizer = i435;
                Object obj137 = objArr148[i435];
                objArr148[i435] = null;
                objArr148[11] = obj137;
                return 0;
            case 327:
                int i436 = this.AudioAttributesImplApi21Parcelizer;
                int i437 = i436 - 1;
                Object[] objArr149 = this.onAddQueueItem;
                Object obj138 = objArr149[i437];
                objArr149[i437] = null;
                objArr149[15] = obj138;
                this.AudioAttributesImplApi21Parcelizer = i436;
                objArr149[i437] = objArr149[11];
                return 0;
            case 328:
                int i438 = this.AudioAttributesImplApi21Parcelizer;
                int i439 = i438 - 1;
                Object[] objArr150 = this.onAddQueueItem;
                Object obj139 = objArr150[i439];
                objArr150[i439] = null;
                objArr150[12] = obj139;
                int i440 = i438 - 2;
                int[] iArr226 = this.RatingCompat;
                iArr226[11] = iArr226[i440];
                this.AudioAttributesImplApi21Parcelizer = i438 - 1;
                iArr226[i440] = 2;
                return 0;
            case 329:
                int[] iArr227 = this.RatingCompat;
                int i441 = this.AudioAttributesImplApi21Parcelizer;
                iArr227[i441] = iArr227[11];
                Object[] objArr151 = this.onAddQueueItem;
                objArr151[i441 + 1] = objArr151[12];
                int i442 = i441 + 1;
                this.AudioAttributesImplApi21Parcelizer = i442;
                Object obj140 = objArr151[i442];
                objArr151[i442] = null;
                objArr151[21] = obj140;
                return 0;
            case 330:
                int i443 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr228 = this.RatingCompat;
                iArr228[20] = iArr228[i443 - 1];
                int i444 = i443 - 2;
                Object[] objArr152 = this.onAddQueueItem;
                Object obj141 = objArr152[i444];
                objArr152[i444] = null;
                objArr152[19] = obj141;
                this.AudioAttributesImplApi21Parcelizer = i443 - 1;
                objArr152[i444] = obj141;
                return 0;
            case 331:
                int i445 = this.AudioAttributesImplApi21Parcelizer;
                int i446 = i445 - 1;
                Object[] objArr153 = this.onAddQueueItem;
                objArr153[i446] = null;
                this.AudioAttributesImplApi21Parcelizer = i445;
                objArr153[i446] = objArr153[19];
                return 0;
            case 332:
                int[] iArr229 = this.RatingCompat;
                int i447 = this.AudioAttributesImplApi21Parcelizer;
                iArr229[i447] = iArr229[20];
                Object[] objArr154 = this.onAddQueueItem;
                Object obj142 = objArr154[i447 - 1];
                objArr154[i447 - 1] = null;
                objArr154[i447] = obj142;
                iArr229[i447 - 1] = iArr229[i447];
                this.AudioAttributesImplApi21Parcelizer = i447 + 2;
                iArr229[i447 + 1] = 1;
                return 0;
            case 333:
                Object[] objArr155 = this.onAddQueueItem;
                int i448 = this.AudioAttributesImplApi21Parcelizer;
                objArr155[i448] = objArr155[19];
                objArr155[i448 + 1] = objArr155[21];
                int[] iArr230 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i448 + 3;
                iArr230[i448 + 2] = 0;
                return 0;
            case 334:
                int i449 = this.AudioAttributesImplApi21Parcelizer;
                int i450 = i449 - 1;
                Object[] objArr156 = this.onAddQueueItem;
                Object obj143 = objArr156[i450];
                objArr156[i450] = null;
                objArr156[12] = obj143;
                int[] iArr231 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i449;
                iArr231[i450] = 2;
                return 0;
            case 335:
                int i451 = this.AudioAttributesImplApi21Parcelizer;
                int i452 = i451 - 1;
                Object[] objArr157 = this.onAddQueueItem;
                objArr157[i452] = null;
                objArr157[i452] = objArr157[i451 - 2];
                int[] iArr232 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i451 + 1;
                iArr232[i451] = 0;
                return 0;
            case 336:
                int i453 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr233 = this.RatingCompat;
                iArr233[20] = iArr233[i453 - 1];
                int i454 = i453 - 2;
                this.AudioAttributesImplApi21Parcelizer = i454;
                Object[] objArr158 = this.onAddQueueItem;
                Object obj144 = objArr158[i454];
                objArr158[i454] = null;
                objArr158[19] = obj144;
                return 0;
            case 337:
                Object[] objArr159 = this.onAddQueueItem;
                int i455 = this.AudioAttributesImplApi21Parcelizer;
                objArr159[i455] = objArr159[19];
                objArr159[i455] = null;
                this.AudioAttributesImplApi21Parcelizer = i455 + 1;
                objArr159[i455] = objArr159[19];
                return 0;
            case 338:
                int[] iArr234 = this.RatingCompat;
                int i456 = this.AudioAttributesImplApi21Parcelizer;
                int i457 = iArr234[i456 - 1];
                iArr234[i456 - 1] = iArr234[i456 - 2];
                iArr234[i456 - 2] = i457;
                int i458 = i456 - 3;
                this.AudioAttributesImplApi21Parcelizer = i458;
                Object[] objArr160 = this.onAddQueueItem;
                Object obj145 = objArr160[i458];
                objArr160[i458] = null;
                ((int[]) obj145)[iArr234[i456 - 2]] = iArr234[i456 - 1];
                this.AudioAttributesImplApi21Parcelizer = i456 - 2;
                objArr160[i458] = objArr160[19];
                return 0;
            case 339:
                Object[] objArr161 = this.onAddQueueItem;
                int i459 = this.AudioAttributesImplApi21Parcelizer;
                objArr161[i459] = objArr161[21];
                int[] iArr235 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i459 + 2;
                iArr235[i459 + 1] = 0;
                return 0;
            case 340:
                int[] iArr236 = this.RatingCompat;
                int i460 = this.AudioAttributesImplApi21Parcelizer;
                iArr236[i460] = 32;
                this.AudioAttributesImplApi21Parcelizer = i460;
                iArr236[i460 - 1] = iArr236[i460] & iArr236[i460 - 1];
                return 0;
            case 341:
                int i461 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i461;
                Object[] objArr162 = this.onAddQueueItem;
                Object obj146 = objArr162[i461];
                objArr162[i461] = null;
                objArr162[12] = obj146;
                return 0;
            case 342:
                Object[] objArr163 = this.onAddQueueItem;
                int i462 = this.AudioAttributesImplApi21Parcelizer;
                objArr163[i462] = objArr163[i462 - 1];
                int[] iArr237 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i462 + 2;
                iArr237[i462 + 1] = 58;
                return 0;
            case 343:
                int i463 = this.AudioAttributesImplApi21Parcelizer;
                int i464 = i463 - 1;
                Object[] objArr164 = this.onAddQueueItem;
                Object obj147 = objArr164[i464];
                objArr164[i464] = null;
                objArr164[19] = obj147;
                this.AudioAttributesImplApi21Parcelizer = i463;
                objArr164[i464] = obj147;
                return 0;
            case 344:
                int[] iArr238 = this.RatingCompat;
                int i465 = this.AudioAttributesImplApi21Parcelizer;
                iArr238[i465] = 0;
                int i466 = iArr238[i465];
                iArr238[i465] = iArr238[i465 - 1];
                iArr238[i465 - 1] = i466;
                int i467 = i465 - 2;
                this.AudioAttributesImplApi21Parcelizer = i467;
                Object[] objArr165 = this.onAddQueueItem;
                Object obj148 = objArr165[i467];
                objArr165[i467] = null;
                ((int[]) obj148)[iArr238[i465 - 1]] = iArr238[i465];
                return 0;
            case 345:
                Object[] objArr166 = this.onAddQueueItem;
                int i468 = this.AudioAttributesImplApi21Parcelizer;
                objArr166[i468] = objArr166[21];
                int[] iArr239 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i468 + 2;
                iArr239[i468 + 1] = 0;
                Object obj149 = objArr166[i468];
                objArr166[i468] = null;
                objArr166[i468 + 1] = obj149;
                iArr239[i468] = iArr239[i468 + 1];
                return 0;
            case 346:
                Object[] objArr167 = this.onAddQueueItem;
                int i469 = this.AudioAttributesImplApi21Parcelizer;
                objArr167[i469] = objArr167[12];
                this.AudioAttributesImplApi21Parcelizer = i469;
                Object obj150 = objArr167[i469];
                objArr167[i469] = null;
                objArr167[21] = obj150;
                return 0;
            case 347:
                int i470 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i470;
                Object[] objArr168 = this.onAddQueueItem;
                Object obj151 = objArr168[i470];
                objArr168[i470] = null;
                objArr168[19] = obj151;
                return 0;
            case 348:
                Object[] objArr169 = this.onAddQueueItem;
                int i471 = this.AudioAttributesImplApi21Parcelizer;
                objArr169[i471] = objArr169[19];
                this.AudioAttributesImplApi21Parcelizer = i471;
                objArr169[i471] = null;
                return 0;
            case 349:
                Object[] objArr170 = this.onAddQueueItem;
                int i472 = this.AudioAttributesImplApi21Parcelizer;
                objArr170[i472] = objArr170[19];
                int[] iArr240 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i472 + 2;
                iArr240[i472 + 1] = iArr240[20];
                Object obj152 = objArr170[i472];
                objArr170[i472] = null;
                objArr170[i472 + 1] = obj152;
                iArr240[i472] = iArr240[i472 + 1];
                return 0;
            case 350:
                int i473 = this.AudioAttributesImplApi21Parcelizer;
                int i474 = i473 - 3;
                this.AudioAttributesImplApi21Parcelizer = i474;
                Object[] objArr171 = this.onAddQueueItem;
                Object obj153 = objArr171[i474];
                objArr171[i474] = null;
                int[] iArr241 = this.RatingCompat;
                ((int[]) obj153)[iArr241[i473 - 2]] = iArr241[i473 - 1];
                this.AudioAttributesImplApi21Parcelizer = i473 - 2;
                objArr171[i474] = objArr171[19];
                return 0;
            case 351:
                Object[] objArr172 = this.onAddQueueItem;
                int i475 = this.AudioAttributesImplApi21Parcelizer;
                objArr172[i475] = objArr172[15];
                this.AudioAttributesImplApi21Parcelizer = i475 + 2;
                objArr172[i475 + 1] = objArr172[i475];
                return 0;
            case 352:
                int i476 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr242 = this.RatingCompat;
                iArr242[i476 - 2] = iArr242[i476 - 2] - iArr242[i476 - 1];
                int i477 = i476 - 2;
                this.AudioAttributesImplApi21Parcelizer = i477;
                iArr242[17] = iArr242[i477];
                return 0;
            case 353:
                int[] iArr243 = this.RatingCompat;
                int i478 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i478 + 1;
                iArr243[i478] = iArr243[17];
                return 0;
            case 354:
                int[] iArr244 = this.RatingCompat;
                int i479 = this.AudioAttributesImplApi21Parcelizer;
                iArr244[i479 - 1] = (byte) iArr244[i479 - 1];
                this.AudioAttributesImplApi21Parcelizer = i479 + 1;
                iArr244[i479] = 31;
                return 0;
            case 355:
                Object[] objArr173 = this.onAddQueueItem;
                int i480 = this.AudioAttributesImplApi21Parcelizer;
                objArr173[i480] = objArr173[15];
                int[] iArr245 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i480 + 2;
                iArr245[i480 + 1] = iArr245[17];
                return 0;
            case 356:
                Object[] objArr174 = this.onAddQueueItem;
                int i481 = this.AudioAttributesImplApi21Parcelizer;
                objArr174[i481] = objArr174[i481 - 1];
                Object obj154 = objArr174[i481];
                objArr174[i481] = null;
                objArr174[18] = obj154;
                this.AudioAttributesImplApi21Parcelizer = i481 + 1;
                objArr174[i481] = objArr174[16];
                return 0;
            case 357:
                Object[] objArr175 = this.onAddQueueItem;
                int i482 = this.AudioAttributesImplApi21Parcelizer;
                objArr175[i482] = objArr175[16];
                int[] iArr246 = this.RatingCompat;
                iArr246[i482 + 1] = 0;
                int i483 = i482 + 1;
                this.AudioAttributesImplApi21Parcelizer = i483;
                Object obj155 = objArr175[i482];
                objArr175[i482] = null;
                objArr175[i482] = ((Object[]) obj155)[iArr246[i483]];
                return 0;
            case 358:
                int[] iArr247 = this.RatingCompat;
                int i484 = this.AudioAttributesImplApi21Parcelizer;
                iArr247[i484] = 11;
                iArr247[i484 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i484 + 3;
                iArr247[i484 + 2] = 0;
                return 0;
            case 359:
                int[] iArr248 = this.RatingCompat;
                int i485 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i485 + 1;
                iArr248[i485] = 34;
                return 0;
            case 360:
                int[] iArr249 = this.RatingCompat;
                int i486 = this.AudioAttributesImplApi21Parcelizer;
                iArr249[i486] = 13;
                this.AudioAttributesImplApi21Parcelizer = i486 + 2;
                iArr249[i486 + 1] = 0;
                return 0;
            case 361:
                int i487 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr250 = this.RatingCompat;
                double[] dArr6 = this.MediaBrowserCompatSearchResultReceiver;
                iArr250[i487 - 2] = (dArr6[i487 - 2] > dArr6[i487 - 1] ? 1 : (dArr6[i487 - 2] == dArr6[i487 - 1] ? 0 : -1));
                int i488 = i487 - 2;
                iArr250[i487 - 3] = iArr250[i487 - 3] + iArr250[i488];
                this.AudioAttributesImplApi21Parcelizer = i487 - 1;
                iArr250[i488] = 1;
                return 0;
            case 362:
                int[] iArr251 = this.RatingCompat;
                int i489 = this.AudioAttributesImplApi21Parcelizer;
                iArr251[i489] = iArr251[13];
                this.AudioAttributesImplApi21Parcelizer = i489 + 2;
                iArr251[i489 + 1] = 64;
                return 0;
            case 363:
                int[] iArr252 = this.RatingCompat;
                int i490 = this.AudioAttributesImplApi21Parcelizer;
                iArr252[i490] = 0;
                float[] fArr9 = this.MediaMetadataCompat;
                fArr9[i490 + 1] = 0.0f;
                this.AudioAttributesImplApi21Parcelizer = i490 + 3;
                fArr9[i490 + 2] = 0.0f;
                return 0;
            case 364:
                int i491 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr253 = this.RatingCompat;
                float[] fArr10 = this.MediaMetadataCompat;
                iArr253[i491 - 2] = (fArr10[i491 - 2] > fArr10[i491 - 1] ? 1 : (fArr10[i491 - 2] == fArr10[i491 - 1] ? 0 : -1));
                int i492 = i491 - 2;
                iArr253[i491 - 3] = iArr253[i491 - 3] + iArr253[i492];
                this.AudioAttributesImplApi21Parcelizer = i491 - 1;
                iArr253[i492] = 1;
                return 0;
            case 365:
                Object[] objArr176 = this.onAddQueueItem;
                int i493 = this.AudioAttributesImplApi21Parcelizer;
                objArr176[i493] = objArr176[i493 - 1];
                this.RatingCompat[i493 + 1] = 12;
                this.AudioAttributesImplApi21Parcelizer = i493 + 3;
                objArr176[i493 + 2] = objArr176[12];
                return 0;
            case 366:
                Object[] objArr177 = this.onAddQueueItem;
                int i494 = this.AudioAttributesImplApi21Parcelizer;
                objArr177[i494] = objArr177[19];
                int[] iArr254 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i494 + 2;
                iArr254[i494 + 1] = iArr254[20];
                return 0;
            case 367:
                int[] iArr255 = this.RatingCompat;
                int i495 = this.AudioAttributesImplApi21Parcelizer;
                iArr255[i495 - 1] = iArr255[i495 - 2];
                Object[] objArr178 = this.onAddQueueItem;
                Object obj156 = objArr178[i495 - 1];
                objArr178[i495 - 1] = null;
                objArr178[i495 - 2] = obj156;
                this.AudioAttributesImplApi21Parcelizer = i495 + 1;
                iArr255[i495] = 0;
                return 0;
            case 368:
                int[] iArr256 = this.RatingCompat;
                int i496 = this.AudioAttributesImplApi21Parcelizer;
                int i497 = iArr256[i496 - 1];
                iArr256[i496 - 1] = iArr256[i496 - 2];
                iArr256[i496 - 2] = i497;
                return 0;
            case 369:
                int[] iArr257 = this.RatingCompat;
                int i498 = this.AudioAttributesImplApi21Parcelizer;
                iArr257[i498] = 11;
                Object[] objArr179 = this.onAddQueueItem;
                objArr179[i498 + 1] = objArr179[12];
                int i499 = i498 + 1;
                this.AudioAttributesImplApi21Parcelizer = i499;
                Object obj157 = objArr179[i499];
                objArr179[i499] = null;
                objArr179[21] = obj157;
                return 0;
            case 370:
                int i500 = this.AudioAttributesImplApi21Parcelizer;
                int i501 = i500 - 3;
                this.AudioAttributesImplApi21Parcelizer = i501;
                Object[] objArr180 = this.onAddQueueItem;
                Object obj158 = objArr180[i501];
                objArr180[i501] = null;
                int[] iArr258 = this.RatingCompat;
                ((int[]) obj158)[iArr258[i500 - 2]] = iArr258[i500 - 1];
                objArr180[i501] = objArr180[19];
                this.AudioAttributesImplApi21Parcelizer = i500 - 1;
                objArr180[i500 - 2] = objArr180[21];
                return 0;
            case 371:
                int[] iArr259 = this.RatingCompat;
                int i502 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i502 + 1;
                iArr259[i502] = iArr259[20];
                Object[] objArr181 = this.onAddQueueItem;
                Object obj159 = objArr181[i502 - 1];
                objArr181[i502 - 1] = null;
                objArr181[i502] = obj159;
                iArr259[i502 - 1] = iArr259[i502];
                return 0;
            case 372:
                int[] iArr260 = this.RatingCompat;
                int i503 = this.AudioAttributesImplApi21Parcelizer;
                iArr260[i503] = 10;
                Object[] objArr182 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i503 + 2;
                objArr182[i503 + 1] = objArr182[12];
                return 0;
            case 373:
                int i504 = this.AudioAttributesImplApi21Parcelizer;
                int i505 = i504 - 1;
                Object[] objArr183 = this.onAddQueueItem;
                Object obj160 = objArr183[i505];
                objArr183[i505] = null;
                objArr183[21] = obj160;
                int[] iArr261 = this.RatingCompat;
                iArr261[20] = iArr261[i504 - 2];
                int i506 = i504 - 3;
                this.AudioAttributesImplApi21Parcelizer = i506;
                Object obj161 = objArr183[i506];
                objArr183[i506] = null;
                objArr183[19] = obj161;
                return 0;
            case 374:
                int[] iArr262 = this.RatingCompat;
                int i507 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i507 + 1;
                iArr262[i507] = 141;
                return 0;
            case 375:
                Object[] objArr184 = this.onAddQueueItem;
                int i508 = this.AudioAttributesImplApi21Parcelizer;
                objArr184[i508] = objArr184[16];
                this.AudioAttributesImplApi21Parcelizer = i508 + 2;
                objArr184[i508 + 1] = objArr184[14];
                return 0;
            case 376:
                int[] iArr263 = this.RatingCompat;
                int i509 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i509 + 1;
                iArr263[i509] = 29;
                return 0;
            case 377:
                Object[] objArr185 = this.onAddQueueItem;
                int i510 = this.AudioAttributesImplApi21Parcelizer;
                objArr185[i510] = objArr185[12];
                int[] iArr264 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i510 + 2;
                iArr264[i510 + 1] = iArr264[13];
                return 0;
            case 378:
                int[] iArr265 = this.RatingCompat;
                int i511 = this.AudioAttributesImplApi21Parcelizer;
                iArr265[i511] = iArr265[i511 - 1];
                this.AudioAttributesImplApi21Parcelizer = i511;
                iArr265[16] = iArr265[i511];
                return 0;
            case 379:
                int[] iArr266 = this.RatingCompat;
                int i512 = this.AudioAttributesImplApi21Parcelizer;
                iArr266[i512] = iArr266[16];
                Object[] objArr186 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i512 + 2;
                objArr186[i512 + 1] = objArr186[11];
                return 0;
            case 380:
                int i513 = this.AudioAttributesImplApi21Parcelizer;
                int i514 = i513 - 1;
                Object[] objArr187 = this.onAddQueueItem;
                Object obj162 = objArr187[i514];
                objArr187[i514] = null;
                objArr187[12] = obj162;
                int i515 = i513 - 2;
                this.AudioAttributesImplApi21Parcelizer = i515;
                int[] iArr267 = this.RatingCompat;
                iArr267[11] = iArr267[i515];
                return 0;
            case 381:
                int[] iArr268 = this.RatingCompat;
                int i516 = this.AudioAttributesImplApi21Parcelizer;
                iArr268[i516] = iArr268[11];
                Object[] objArr188 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i516 + 2;
                objArr188[i516 + 1] = objArr188[12];
                return 0;
            case 382:
                Object[] objArr189 = this.onAddQueueItem;
                int i517 = this.AudioAttributesImplApi21Parcelizer;
                objArr189[i517] = objArr189[19];
                this.AudioAttributesImplApi21Parcelizer = i517 + 2;
                objArr189[i517 + 1] = objArr189[21];
                return 0;
            case 383:
                this.RatingCompat[17] = r0[17] - 1;
                return 0;
            case RendererCapabilities.MODE_SUPPORT_MASK /* 384 */:
                int[] iArr269 = this.RatingCompat;
                int i518 = this.AudioAttributesImplApi21Parcelizer;
                iArr269[i518] = iArr269[13];
                this.AudioAttributesImplApi21Parcelizer = i518 + 2;
                iArr269[i518 + 1] = 8;
                return 0;
            case 385:
                Object[] objArr190 = this.onAddQueueItem;
                int i519 = this.AudioAttributesImplApi21Parcelizer;
                objArr190[i519] = objArr190[i519 - 1];
                int[] iArr270 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i519 + 2;
                iArr270[i519 + 1] = 56;
                return 0;
            case 386:
                Object[] objArr191 = this.onAddQueueItem;
                int i520 = this.AudioAttributesImplApi21Parcelizer;
                objArr191[i520] = objArr191[12];
                Object obj163 = objArr191[i520];
                objArr191[i520] = null;
                objArr191[21] = obj163;
                int i521 = i520 - 1;
                this.AudioAttributesImplApi21Parcelizer = i521;
                int[] iArr271 = this.RatingCompat;
                iArr271[20] = iArr271[i521];
                return 0;
            case 387:
                Object[] objArr192 = this.onAddQueueItem;
                int i522 = this.AudioAttributesImplApi21Parcelizer;
                objArr192[i522] = objArr192[i522 - 1];
                this.RatingCompat[i522 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i522 + 3;
                objArr192[i522 + 2] = null;
                return 0;
            case 388:
                int i523 = this.AudioAttributesImplApi21Parcelizer;
                int i524 = i523 - 1;
                Object[] objArr193 = this.onAddQueueItem;
                objArr193[i524] = null;
                objArr193[i524] = objArr193[19];
                int[] iArr272 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i523 + 1;
                iArr272[i523] = iArr272[20];
                return 0;
            case 389:
                int[] iArr273 = this.RatingCompat;
                int i525 = this.AudioAttributesImplApi21Parcelizer;
                iArr273[i525] = 2;
                iArr273[i525 + 1] = 2;
                int i526 = i525 + 1;
                this.AudioAttributesImplApi21Parcelizer = i526;
                iArr273[i525] = iArr273[i525] % iArr273[i526];
                return 0;
            case 390:
                int[] iArr274 = this.RatingCompat;
                int i527 = this.AudioAttributesImplApi21Parcelizer;
                iArr274[i527] = 3;
                this.AudioAttributesImplApi21Parcelizer = i527;
                iArr274[i527 - 1] = iArr274[i527 - 1] + iArr274[i527];
                return 0;
            case 391:
                int[] iArr275 = this.RatingCompat;
                int i528 = this.AudioAttributesImplApi21Parcelizer;
                iArr275[i528] = 97;
                iArr275[i528 - 1] = iArr275[i528 - 1] + iArr275[i528];
                this.AudioAttributesImplApi21Parcelizer = i528 + 1;
                iArr275[i528] = iArr275[i528 - 1];
                return 0;
            case 392:
                int[] iArr276 = this.RatingCompat;
                int i529 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i529 + 1;
                iArr276[i529] = 103;
                return 0;
            case 393:
                int[] iArr277 = this.RatingCompat;
                int i530 = this.AudioAttributesImplApi21Parcelizer;
                iArr277[i530] = iArr277[i530 - 1];
                this.AudioAttributesImplApi21Parcelizer = i530 + 2;
                iArr277[i530 + 1] = 128;
                return 0;
            case 394:
                int[] iArr278 = this.RatingCompat;
                int i531 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i531 + 1;
                iArr278[i531] = 55;
                return 0;
            case 395:
                int[] iArr279 = this.RatingCompat;
                int i532 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i532 + 1;
                iArr279[i532] = 115;
                return 0;
            case 396:
                int[] iArr280 = this.RatingCompat;
                int i533 = this.AudioAttributesImplApi21Parcelizer;
                iArr280[i533] = 0;
                this.AudioAttributesImplApi21Parcelizer = i533 + 2;
                iArr280[i533 + 1] = 1;
                return 0;
            case 397:
                int[] iArr281 = this.RatingCompat;
                int i534 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i534 + 1;
                iArr281[i534] = 89;
                return 0;
            case 398:
                int i535 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr282 = this.RatingCompat;
                double[] dArr7 = this.MediaBrowserCompatSearchResultReceiver;
                iArr282[i535 - 2] = (dArr7[i535 - 2] > dArr7[i535 - 1] ? 1 : (dArr7[i535 - 2] == dArr7[i535 - 1] ? 0 : -1));
                int i536 = i535 - 2;
                this.AudioAttributesImplApi21Parcelizer = i536;
                iArr282[i535 - 3] = iArr282[i535 - 3] / iArr282[i536];
                this.AudioAttributesImplApi21Parcelizer = i535 - 1;
                iArr282[i536] = 1;
                return 0;
            case 399:
                int[] iArr283 = this.RatingCompat;
                int i537 = this.AudioAttributesImplApi21Parcelizer;
                iArr283[i537] = 25;
                iArr283[i537 - 1] = iArr283[i537 - 1] + iArr283[i537];
                this.AudioAttributesImplApi21Parcelizer = i537 + 1;
                iArr283[i537] = iArr283[i537 - 1];
                return 0;
            case ResponseError.NO_INTERNET_ERROR /* 400 */:
                int[] iArr284 = this.RatingCompat;
                int i538 = this.AudioAttributesImplApi21Parcelizer;
                iArr284[i538] = 71;
                this.AudioAttributesImplApi21Parcelizer = i538;
                iArr284[i538 - 1] = iArr284[i538 - 1] + iArr284[i538];
                return 0;
            case 401:
                int[] iArr285 = this.RatingCompat;
                int i539 = this.AudioAttributesImplApi21Parcelizer;
                iArr285[i539] = 128;
                this.AudioAttributesImplApi21Parcelizer = i539;
                iArr285[i539 - 1] = iArr285[i539 - 1] % iArr285[i539];
                return 0;
            case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                int[] iArr286 = this.RatingCompat;
                int i540 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i540 + 1;
                iArr286[i540] = 119;
                return 0;
            case 403:
                int i541 = this.AudioAttributesImplApi21Parcelizer;
                int i542 = i541 - 1;
                int[] iArr287 = this.RatingCompat;
                iArr287[i541 - 2] = iArr287[i541 - 2] + iArr287[i542];
                this.AudioAttributesImplApi21Parcelizer = i541;
                iArr287[i542] = iArr287[i541 - 2];
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                int[] iArr288 = this.RatingCompat;
                int i543 = this.AudioAttributesImplApi21Parcelizer;
                iArr288[i543] = 68;
                this.AudioAttributesImplApi21Parcelizer = i543;
                iArr288[i543 - 1] = iArr288[i543] & iArr288[i543 - 1];
                return 0;
            case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                int[] iArr289 = this.RatingCompat;
                int i544 = this.AudioAttributesImplApi21Parcelizer;
                iArr289[i544] = 3;
                iArr289[i544 - 1] = iArr289[i544 - 1] + iArr289[i544];
                this.AudioAttributesImplApi21Parcelizer = i544 + 1;
                iArr289[i544] = iArr289[i544 - 1];
                return 0;
            case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                int[] iArr290 = this.RatingCompat;
                int i545 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i545 + 1;
                iArr290[i545] = 84;
                return 0;
            case 407:
                int[] iArr291 = this.RatingCompat;
                int i546 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i546 + 1;
                iArr291[i546] = 93;
                return 0;
            case 408:
                int[] iArr292 = this.RatingCompat;
                int i547 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i547 + 1;
                iArr292[i547] = 165;
                return 0;
            case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                int i548 = this.AudioAttributesImplApi21Parcelizer;
                int i549 = i548 - 1;
                int[] iArr293 = this.RatingCompat;
                iArr293[i548 - 2] = iArr293[i548 - 2] - iArr293[i549];
                this.AudioAttributesImplApi21Parcelizer = i548;
                iArr293[i549] = -1;
                return 0;
            case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                int[] iArr294 = this.RatingCompat;
                int i550 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i550 + 1;
                iArr294[i550] = 124;
                return 0;
            case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                int[] iArr295 = this.RatingCompat;
                int i551 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i551 + 1;
                iArr295[i551] = 1;
                Object[] objArr194 = this.onAddQueueItem;
                Object obj164 = objArr194[i551 - 1];
                objArr194[i551 - 1] = null;
                objArr194[i551] = obj164;
                iArr295[i551 - 1] = iArr295[i551];
                return 0;
            case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                int i552 = this.AudioAttributesImplApi21Parcelizer;
                int i553 = i552 - 3;
                this.AudioAttributesImplApi21Parcelizer = i553;
                Object[] objArr195 = this.onAddQueueItem;
                Object obj165 = objArr195[i553];
                objArr195[i553] = null;
                int i554 = this.RatingCompat[i552 - 2];
                Object obj166 = objArr195[i552 - 1];
                objArr195[i552 - 1] = null;
                ((Object[]) obj165)[i554] = obj166;
                this.AudioAttributesImplApi21Parcelizer = i552 - 2;
                Object obj167 = objArr195[i552 - 4];
                objArr195[i552 - 4] = null;
                objArr195[i553] = obj167;
                Object obj168 = objArr195[i552 - 5];
                objArr195[i552 - 5] = null;
                objArr195[i552 - 4] = obj168;
                objArr195[i552 - 5] = obj167;
                return 0;
            case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                Object[] objArr196 = this.onAddQueueItem;
                int i555 = this.AudioAttributesImplApi21Parcelizer;
                Object obj169 = objArr196[i555 - 2];
                objArr196[i555 - 2] = null;
                objArr196[i555 - 1] = obj169;
                int[] iArr296 = this.RatingCompat;
                iArr296[i555 - 2] = iArr296[i555 - 1];
                int i556 = i555 - 3;
                this.AudioAttributesImplApi21Parcelizer = i556;
                Object obj170 = objArr196[i556];
                objArr196[i556] = null;
                int i557 = iArr296[i555 - 2];
                Object obj171 = objArr196[i555 - 1];
                objArr196[i555 - 1] = null;
                ((Object[]) obj170)[i557] = obj171;
                this.AudioAttributesImplApi21Parcelizer = i555 - 2;
                iArr296[i556] = 94;
                return 0;
            case 414:
                int[] iArr297 = this.RatingCompat;
                int i558 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i558 + 1;
                iArr297[i558] = 72;
                return 0;
            case 415:
                int i559 = this.AudioAttributesImplApi21Parcelizer;
                int i560 = i559 - 1;
                int[] iArr298 = this.RatingCompat;
                iArr298[i559 - 2] = iArr298[i559 - 2] + iArr298[i560];
                iArr298[i559 - 2] = (byte) iArr298[i559 - 2];
                this.AudioAttributesImplApi21Parcelizer = i559;
                iArr298[i560] = 6;
                return 0;
            case 416:
                int[] iArr299 = this.RatingCompat;
                int i561 = this.AudioAttributesImplApi21Parcelizer;
                iArr299[i561] = 20;
                this.AudioAttributesImplApi21Parcelizer = i561;
                iArr299[i561 - 1] = iArr299[i561 - 1] + iArr299[i561];
                return 0;
            case 417:
                int[] iArr300 = this.RatingCompat;
                int i562 = this.AudioAttributesImplApi21Parcelizer;
                iArr300[i562] = 6;
                iArr300[i562 - 1] = iArr300[i562 - 1] >> iArr300[i562];
                int i563 = i562 - 1;
                this.AudioAttributesImplApi21Parcelizer = i563;
                iArr300[i562 - 2] = iArr300[i562 - 2] + iArr300[i563];
                return 0;
            case 418:
                Object[] objArr197 = this.onAddQueueItem;
                int i564 = this.AudioAttributesImplApi21Parcelizer;
                Object obj172 = objArr197[i564 - 1];
                objArr197[i564 - 1] = null;
                Object obj173 = objArr197[i564 - 2];
                objArr197[i564 - 2] = null;
                objArr197[i564 - 1] = obj173;
                objArr197[i564 - 2] = obj172;
                this.AudioAttributesImplApi21Parcelizer = i564 + 1;
                objArr197[i564] = null;
                Object obj174 = objArr197[i564];
                objArr197[i564] = null;
                Object obj175 = objArr197[i564 - 1];
                objArr197[i564 - 1] = null;
                objArr197[i564] = obj175;
                objArr197[i564 - 1] = obj174;
                return 0;
            case 419:
                int[] iArr301 = this.RatingCompat;
                int i565 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i565 + 1;
                iArr301[i565] = 290;
                return 0;
            case UnixStat.DEFAULT_FILE_PERM /* 420 */:
                int[] iArr302 = this.RatingCompat;
                int i566 = this.AudioAttributesImplApi21Parcelizer;
                iArr302[i566 - 1] = (char) iArr302[i566 - 1];
                this.AudioAttributesImplApi21Parcelizer = i566 + 1;
                iArr302[i566] = 216;
                return 0;
            case 421:
                int[] iArr303 = this.RatingCompat;
                int i567 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i567 + 1;
                iArr303[i567] = 94;
                return 0;
            case 422:
                int i568 = this.AudioAttributesImplApi21Parcelizer;
                int i569 = i568 - 1;
                int[] iArr304 = this.RatingCompat;
                iArr304[i568 - 2] = iArr304[i568 - 2] - iArr304[i569];
                iArr304[i568 - 2] = (byte) iArr304[i568 - 2];
                this.AudioAttributesImplApi21Parcelizer = i568;
                iArr304[i569] = 67;
                return 0;
            case 423:
                int[] iArr305 = this.RatingCompat;
                int i570 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i570 + 1;
                iArr305[i570] = 73;
                return 0;
            case 424:
                int i571 = this.AudioAttributesImplApi21Parcelizer;
                int i572 = i571 - 1;
                int[] iArr306 = this.RatingCompat;
                iArr306[i571 - 2] = iArr306[i571 - 2] - iArr306[i572];
                iArr306[i571 - 2] = (byte) iArr306[i571 - 2];
                this.AudioAttributesImplApi21Parcelizer = i571;
                iArr306[i572] = 7;
                return 0;
            case 425:
                int[] iArr307 = this.RatingCompat;
                int i573 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i573 + 1;
                iArr307[i573] = 256;
                return 0;
            case 426:
                this.write = this.RatingCompat[this.AudioAttributesImplApi21Parcelizer - 1];
                return 0;
            case 427:
                int i574 = this.AudioAttributesImplApi21Parcelizer;
                int i575 = i574 - 1;
                this.AudioAttributesImplApi21Parcelizer = i575;
                Object[] objArr198 = this.onAddQueueItem;
                Object obj176 = objArr198[i575];
                objArr198[i575] = null;
                objArr198[12] = obj176;
                Object obj177 = objArr198[i574 - 2];
                objArr198[i574 - 2] = null;
                this.RatingCompat[i574 - 2] = ((Object[]) obj177).length;
                return 0;
            case 428:
                int i576 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i576;
                int[] iArr308 = this.RatingCompat;
                iArr308[13] = iArr308[i576];
                return 0;
            case 429:
                int[] iArr309 = this.RatingCompat;
                int i577 = this.AudioAttributesImplApi21Parcelizer;
                iArr309[i577] = 0;
                this.AudioAttributesImplApi21Parcelizer = i577;
                iArr309[14] = iArr309[i577];
                return 0;
            case 430:
                int[] iArr310 = this.RatingCompat;
                int i578 = this.AudioAttributesImplApi21Parcelizer;
                iArr310[i578] = iArr310[14];
                this.AudioAttributesImplApi21Parcelizer = i578 + 2;
                iArr310[i578 + 1] = iArr310[13];
                return 0;
            case 431:
                Object[] objArr199 = this.onAddQueueItem;
                int i579 = this.AudioAttributesImplApi21Parcelizer;
                objArr199[i579] = objArr199[12];
                int[] iArr311 = this.RatingCompat;
                iArr311[i579 + 1] = iArr311[14];
                int i580 = i579 + 1;
                this.AudioAttributesImplApi21Parcelizer = i580;
                Object obj178 = objArr199[i579];
                objArr199[i579] = null;
                objArr199[i579] = ((Object[]) obj178)[iArr311[i580]];
                return 0;
            case 432:
                int i581 = this.AudioAttributesImplApi21Parcelizer;
                int i582 = i581 - 1;
                this.AudioAttributesImplApi21Parcelizer = i582;
                float[] fArr11 = this.MediaMetadataCompat;
                this.RatingCompat[i581 - 2] = (fArr11[i581 - 2] > fArr11[i582] ? 1 : (fArr11[i581 - 2] == fArr11[i582] ? 0 : -1));
                return 0;
            case 433:
                int[] iArr312 = this.RatingCompat;
                int i583 = this.AudioAttributesImplApi21Parcelizer;
                iArr312[i583 - 1] = (byte) iArr312[i583 - 1];
                this.AudioAttributesImplApi21Parcelizer = i583 + 1;
                iArr312[i583] = 5;
                return 0;
            case 434:
                int i584 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr313 = this.RatingCompat;
                float[] fArr12 = this.MediaMetadataCompat;
                iArr313[i584 - 2] = (fArr12[i584 - 2] > fArr12[i584 - 1] ? 1 : (fArr12[i584 - 2] == fArr12[i584 - 1] ? 0 : -1));
                int i585 = i584 - 2;
                this.AudioAttributesImplApi21Parcelizer = i585;
                iArr313[i584 - 3] = iArr313[i584 - 3] + iArr313[i585];
                return 0;
            case 435:
                int[] iArr314 = this.RatingCompat;
                iArr314[14] = iArr314[14] + 1;
                return 0;
            case 436:
                int[] iArr315 = this.RatingCompat;
                int i586 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i586 + 1;
                iArr315[i586] = 113;
                return 0;
            case 437:
                int[] iArr316 = this.RatingCompat;
                int i587 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i587 + 1;
                iArr316[i587] = 47;
                return 0;
            case 438:
                int[] iArr317 = this.RatingCompat;
                int i588 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i588 + 1;
                iArr317[i588] = 87;
                return 0;
            case 439:
                int[] iArr318 = this.RatingCompat;
                int i589 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i589 + 1;
                iArr318[i589] = 56;
                return 0;
            case 440:
                int[] iArr319 = this.RatingCompat;
                int i590 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i590 + 1;
                iArr319[i590] = 0;
                return 0;
            case 441:
                int i591 = this.AudioAttributesImplApi21Parcelizer;
                int i592 = i591 - 1;
                Object[] objArr200 = this.onAddQueueItem;
                Object obj179 = objArr200[i592];
                objArr200[i592] = null;
                objArr200[15] = obj179;
                this.AudioAttributesImplApi21Parcelizer = i591;
                objArr200[i592] = obj179;
                return 0;
            case 442:
                int i593 = this.AudioAttributesImplApi21Parcelizer;
                int i594 = i593 - 1;
                Object[] objArr201 = this.onAddQueueItem;
                Object obj180 = objArr201[i594];
                objArr201[i594] = null;
                objArr201[16] = obj180;
                this.AudioAttributesImplApi21Parcelizer = i593;
                objArr201[i594] = objArr201[11];
                return 0;
            case 443:
                int i595 = this.AudioAttributesImplApi21Parcelizer;
                int i596 = i595 - 1;
                this.onAddQueueItem[i596] = null;
                int[] iArr320 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i595;
                iArr320[i596] = iArr320[14];
                return 0;
            case 444:
                int[] iArr321 = this.RatingCompat;
                int i597 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i597 + 1;
                iArr321[i597] = 52;
                return 0;
            case 445:
                int i598 = this.AudioAttributesImplApi21Parcelizer;
                int i599 = i598 - 1;
                this.onAddQueueItem[i599] = null;
                int[] iArr322 = this.RatingCompat;
                iArr322[i599] = iArr322[14];
                this.AudioAttributesImplApi21Parcelizer = i598 + 1;
                iArr322[i598] = 4;
                return 0;
            case 446:
                int[] iArr323 = this.RatingCompat;
                int i600 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i600 + 1;
                iArr323[i600] = 53;
                return 0;
            case 447:
                Object[] objArr202 = this.onAddQueueItem;
                int i601 = this.AudioAttributesImplApi21Parcelizer;
                objArr202[i601] = objArr202[15];
                this.AudioAttributesImplApi21Parcelizer = i601 + 2;
                objArr202[i601 + 1] = objArr202[16];
                return 0;
            case 448:
                int[] iArr324 = this.RatingCompat;
                int i602 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i602 + 1;
                iArr324[i602] = 54;
                return 0;
            case 449:
                int[] iArr325 = this.RatingCompat;
                int i603 = this.AudioAttributesImplApi21Parcelizer;
                iArr325[i603] = 4;
                this.AudioAttributesImplApi21Parcelizer = i603;
                iArr325[i603 - 1] = iArr325[i603] & iArr325[i603 - 1];
                return 0;
            case 450:
                Object[] objArr203 = this.onAddQueueItem;
                int i604 = this.AudioAttributesImplApi21Parcelizer;
                objArr203[i604] = objArr203[12];
                this.AudioAttributesImplApi21Parcelizer = i604 + 2;
                objArr203[i604 + 1] = objArr203[11];
                return 0;
            case 451:
                int[] iArr326 = this.RatingCompat;
                int i605 = this.AudioAttributesImplApi21Parcelizer;
                iArr326[i605] = iArr326[14];
                iArr326[i605 + 1] = 4;
                int i606 = i605 + 1;
                this.AudioAttributesImplApi21Parcelizer = i606;
                iArr326[i605] = iArr326[i605] & iArr326[i606];
                return 0;
            case 452:
                Object[] objArr204 = this.onAddQueueItem;
                int i607 = this.AudioAttributesImplApi21Parcelizer;
                objArr204[i607] = objArr204[16];
                int[] iArr327 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i607 + 2;
                iArr327[i607 + 1] = 1;
                return 0;
            case 453:
                int i608 = this.AudioAttributesImplApi21Parcelizer;
                int i609 = i608 - 2;
                this.AudioAttributesImplApi21Parcelizer = i609;
                int[] iArr328 = this.RatingCompat;
                this.write = iArr328[i609] == iArr328[i608 - 1] ? 0 : 1;
                return 0;
            case 454:
                int i610 = this.AudioAttributesImplApi21Parcelizer;
                int i611 = i610 - 2;
                this.AudioAttributesImplApi21Parcelizer = i611;
                int[] iArr329 = this.RatingCompat;
                this.write = iArr329[i611] != iArr329[i610 - 1] ? 0 : 1;
                return 0;
            case 455:
                int i612 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i612;
                int[] iArr330 = this.RatingCompat;
                iArr330[12] = iArr330[i612];
                return 0;
            case 456:
                int[] iArr331 = this.RatingCompat;
                int i613 = this.AudioAttributesImplApi21Parcelizer;
                iArr331[i613] = iArr331[14];
                this.AudioAttributesImplApi21Parcelizer = i613 + 2;
                iArr331[i613 + 1] = 128;
                return 0;
            case 457:
                int[] iArr332 = this.RatingCompat;
                int i614 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i614 + 1;
                iArr332[i614] = 60;
                return 0;
            case 458:
                int[] iArr333 = this.RatingCompat;
                int i615 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i615 + 1;
                iArr333[i615] = iArr333[14];
                return 0;
            case 459:
                int[] iArr334 = this.RatingCompat;
                int i616 = this.AudioAttributesImplApi21Parcelizer;
                iArr334[i616] = iArr334[i616 - 1];
                this.AudioAttributesImplApi21Parcelizer = i616;
                iArr334[13] = iArr334[i616];
                return 0;
            case 460:
                int[] iArr335 = this.RatingCompat;
                int i617 = this.AudioAttributesImplApi21Parcelizer;
                iArr335[i617] = 1;
                Object[] objArr205 = this.onAddQueueItem;
                objArr205[i617 + 1] = objArr205[16];
                this.AudioAttributesImplApi21Parcelizer = i617 + 3;
                iArr335[i617 + 2] = 6;
                return 0;
            case 461:
                int i618 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i618;
                int[] iArr336 = this.RatingCompat;
                iArr336[16] = iArr336[i618];
                return 0;
            case 462:
                int i619 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i619;
                int[] iArr337 = this.RatingCompat;
                iArr337[17] = iArr337[i619];
                return 0;
            case 463:
                Object[] objArr206 = this.onAddQueueItem;
                int i620 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i620 + 1;
                objArr206[i620] = objArr206[13];
                int[] iArr338 = this.RatingCompat;
                Object obj181 = objArr206[i620];
                objArr206[i620] = null;
                iArr338[i620] = ((Object[]) obj181).length;
                return 0;
            case 464:
                int[] iArr339 = this.RatingCompat;
                int i621 = this.AudioAttributesImplApi21Parcelizer;
                iArr339[i621] = iArr339[14];
                this.AudioAttributesImplApi21Parcelizer = i621 + 2;
                iArr339[i621 + 1] = 4;
                return 0;
            case 465:
                int[] iArr340 = this.RatingCompat;
                int i622 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i622 + 1;
                iArr340[i622] = 704;
                return 0;
            case 466:
                int i623 = this.AudioAttributesImplApi21Parcelizer;
                int i624 = i623 - 1;
                Object[] objArr207 = this.onAddQueueItem;
                Object obj182 = objArr207[i624];
                objArr207[i624] = null;
                objArr207[21] = obj182;
                this.AudioAttributesImplApi21Parcelizer = i623;
                objArr207[i624] = objArr207[20];
                return 0;
            case 467:
                int[] iArr341 = this.RatingCompat;
                int i625 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i625 + 1;
                iArr341[i625] = 36;
                return 0;
            case 468:
                int[] iArr342 = this.RatingCompat;
                int i626 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i626 + 1;
                iArr342[i626] = 21;
                return 0;
            case 469:
                int[] iArr343 = this.RatingCompat;
                int i627 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i627 + 1;
                iArr343[i627] = iArr343[11];
                return 0;
            case 470:
                int[] iArr344 = this.RatingCompat;
                int i628 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i628 + 1;
                iArr344[i628] = 709;
                return 0;
            case 471:
                Object[] objArr208 = this.onAddQueueItem;
                int i629 = this.AudioAttributesImplApi21Parcelizer;
                objArr208[i629] = objArr208[19];
                this.AudioAttributesImplApi21Parcelizer = i629 + 2;
                objArr208[i629 + 1] = objArr208[20];
                return 0;
            case 472:
                int[] iArr345 = this.RatingCompat;
                int i630 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i630 + 1;
                iArr345[i630] = iArr345[21];
                return 0;
            case 473:
                int[] iArr346 = this.RatingCompat;
                iArr346[17] = iArr346[17] + 1;
                return 0;
            case 474:
                int[] iArr347 = this.RatingCompat;
                int i631 = this.AudioAttributesImplApi21Parcelizer;
                iArr347[i631] = 119;
                iArr347[i631 - 1] = iArr347[i631 - 1] + iArr347[i631];
                this.AudioAttributesImplApi21Parcelizer = i631 + 1;
                iArr347[i631] = iArr347[i631 - 1];
                return 0;
            case 475:
                int[] iArr348 = this.RatingCompat;
                int i632 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i632 + 1;
                iArr348[i632] = 75;
                return 0;
            case 476:
                int[] iArr349 = this.RatingCompat;
                int i633 = this.AudioAttributesImplApi21Parcelizer;
                iArr349[i633] = 39;
                iArr349[i633 - 1] = iArr349[i633 - 1] + iArr349[i633];
                this.AudioAttributesImplApi21Parcelizer = i633 + 1;
                iArr349[i633] = iArr349[i633 - 1];
                return 0;
            case 477:
                int[] iArr350 = this.RatingCompat;
                int i634 = this.AudioAttributesImplApi21Parcelizer;
                iArr350[i634] = 93;
                iArr350[i634 - 1] = iArr350[i634 - 1] + iArr350[i634];
                this.AudioAttributesImplApi21Parcelizer = i634 + 1;
                iArr350[i634] = iArr350[i634 - 1];
                return 0;
            case 478:
                int[] iArr351 = this.RatingCompat;
                int i635 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i635 + 1;
                iArr351[i635] = 68;
                return 0;
            case 479:
                int[] iArr352 = this.RatingCompat;
                int i636 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i636 + 1;
                iArr352[i636] = 79;
                return 0;
            case 480:
                int[] iArr353 = this.RatingCompat;
                int i637 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i637 + 1;
                iArr353[i637] = 98;
                return 0;
            case 481:
                int i638 = this.AudioAttributesImplApi21Parcelizer;
                int i639 = i638 - 1;
                Object[] objArr209 = this.onAddQueueItem;
                Object obj183 = objArr209[i639];
                objArr209[i639] = null;
                objArr209[16] = obj183;
                objArr209[i639] = obj183;
                this.AudioAttributesImplApi21Parcelizer = i638 + 1;
                objArr209[i638] = objArr209[11];
                return 0;
            case 482:
                int[] iArr354 = this.RatingCompat;
                int i640 = this.AudioAttributesImplApi21Parcelizer;
                iArr354[i640] = iArr354[15];
                this.AudioAttributesImplApi21Parcelizer = i640 + 2;
                iArr354[i640 + 1] = 4;
                return 0;
            case 483:
                int i641 = this.AudioAttributesImplApi21Parcelizer;
                int i642 = i641 - 1;
                this.onAddQueueItem[i642] = null;
                int[] iArr355 = this.RatingCompat;
                iArr355[i642] = iArr355[15];
                this.AudioAttributesImplApi21Parcelizer = i641 + 1;
                iArr355[i641] = 4;
                return 0;
            case 484:
                int[] iArr356 = this.RatingCompat;
                int i643 = this.AudioAttributesImplApi21Parcelizer;
                iArr356[i643] = iArr356[15];
                iArr356[i643 + 1] = 4;
                int i644 = i643 + 1;
                this.AudioAttributesImplApi21Parcelizer = i644;
                iArr356[i643] = iArr356[i643] & iArr356[i644];
                return 0;
            case 485:
                Object[] objArr210 = this.onAddQueueItem;
                int i645 = this.AudioAttributesImplApi21Parcelizer;
                objArr210[i645] = objArr210[17];
                int[] iArr357 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i645 + 2;
                iArr357[i645 + 1] = 4;
                return 0;
            case 486:
                int i646 = this.AudioAttributesImplApi21Parcelizer;
                int i647 = i646 - 1;
                Object[] objArr211 = this.onAddQueueItem;
                Object obj184 = objArr211[i647];
                objArr211[i647] = null;
                objArr211[11] = obj184;
                this.AudioAttributesImplApi21Parcelizer = i646;
                objArr211[i647] = objArr211[12];
                return 0;
            case 487:
                int i648 = this.AudioAttributesImplApi21Parcelizer;
                int i649 = i648 - 1;
                this.onAddQueueItem[i649] = null;
                int[] iArr358 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i648;
                iArr358[i649] = iArr358[15];
                return 0;
            case 488:
                Object[] objArr212 = this.onAddQueueItem;
                int i650 = this.AudioAttributesImplApi21Parcelizer;
                objArr212[i650] = objArr212[17];
                int[] iArr359 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i650 + 2;
                iArr359[i650 + 1] = 1;
                return 0;
            case 489:
                int i651 = this.AudioAttributesImplApi21Parcelizer;
                int i652 = i651 - 1;
                int[] iArr360 = this.RatingCompat;
                iArr360[12] = iArr360[i652];
                Object[] objArr213 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i651;
                objArr213[i652] = objArr213[17];
                return 0;
            case 490:
                int[] iArr361 = this.RatingCompat;
                int i653 = this.AudioAttributesImplApi21Parcelizer;
                iArr361[i653] = iArr361[15];
                iArr361[i653 + 1] = 128;
                int i654 = i653 + 1;
                this.AudioAttributesImplApi21Parcelizer = i654;
                iArr361[i653] = iArr361[i653] & iArr361[i654];
                return 0;
            case 491:
                Object[] objArr214 = this.onAddQueueItem;
                int i655 = this.AudioAttributesImplApi21Parcelizer;
                objArr214[i655] = objArr214[17];
                int[] iArr362 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i655 + 2;
                iArr362[i655 + 1] = 7;
                return 0;
            case 492:
                int i656 = this.AudioAttributesImplApi21Parcelizer;
                int i657 = i656 - 3;
                this.AudioAttributesImplApi21Parcelizer = i657;
                Object[] objArr215 = this.onAddQueueItem;
                Object obj185 = objArr215[i657];
                objArr215[i657] = null;
                int i658 = this.RatingCompat[i656 - 2];
                Object obj186 = objArr215[i656 - 1];
                objArr215[i656 - 1] = null;
                ((Object[]) obj185)[i658] = obj186;
                int i659 = i656 - 4;
                this.AudioAttributesImplApi21Parcelizer = i659;
                Object obj187 = objArr215[i659];
                objArr215[i659] = null;
                objArr215[13] = obj187;
                return 0;
            case UnixStat.DEFAULT_DIR_PERM /* 493 */:
                int[] iArr363 = this.RatingCompat;
                int i660 = this.AudioAttributesImplApi21Parcelizer;
                iArr363[i660] = 0;
                iArr363[17] = iArr363[i660];
                this.AudioAttributesImplApi21Parcelizer = i660 + 1;
                iArr363[i660] = 0;
                return 0;
            case 494:
                int i661 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i661;
                int[] iArr364 = this.RatingCompat;
                iArr364[18] = iArr364[i661];
                return 0;
            case 495:
                int[] iArr365 = this.RatingCompat;
                int i662 = this.AudioAttributesImplApi21Parcelizer;
                iArr365[i662] = iArr365[18];
                Object[] objArr216 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i662 + 2;
                objArr216[i662 + 1] = objArr216[13];
                Object obj188 = objArr216[i662 + 1];
                objArr216[i662 + 1] = null;
                iArr365[i662 + 1] = ((Object[]) obj188).length;
                return 0;
            case 496:
                Object[] objArr217 = this.onAddQueueItem;
                int i663 = this.AudioAttributesImplApi21Parcelizer;
                objArr217[i663] = objArr217[13];
                int[] iArr366 = this.RatingCompat;
                iArr366[i663 + 1] = iArr366[18];
                int i664 = i663 + 1;
                this.AudioAttributesImplApi21Parcelizer = i664;
                Object obj189 = objArr217[i663];
                objArr217[i663] = null;
                objArr217[i663] = ((Object[]) obj189)[iArr366[i664]];
                return 0;
            case 497:
                Object[] objArr218 = this.onAddQueueItem;
                int i665 = this.AudioAttributesImplApi21Parcelizer;
                objArr218[i665] = objArr218[i665 - 1];
                this.AudioAttributesImplApi21Parcelizer = i665;
                Object obj190 = objArr218[i665];
                objArr218[i665] = null;
                objArr218[21] = obj190;
                return 0;
            case 498:
                int i666 = this.AudioAttributesImplApi21Parcelizer;
                int i667 = i666 - 1;
                Object[] objArr219 = this.onAddQueueItem;
                Object obj191 = objArr219[i667];
                objArr219[i667] = null;
                objArr219[22] = obj191;
                this.AudioAttributesImplApi21Parcelizer = i666;
                objArr219[i667] = objArr219[21];
                return 0;
            case 499:
                int[] iArr367 = this.RatingCompat;
                int i668 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i668 + 1;
                iArr367[i668] = iArr367[18];
                return 0;
            case 500:
                Object[] objArr220 = this.onAddQueueItem;
                int i669 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i669 + 1;
                objArr220[i669] = objArr220[22];
                return 0;
            case 501:
                int i670 = this.AudioAttributesImplApi21Parcelizer;
                int i671 = i670 - 1;
                Object[] objArr221 = this.onAddQueueItem;
                Object obj192 = objArr221[i671];
                objArr221[i671] = null;
                objArr221[21] = obj192;
                objArr221[i671] = objArr221[16];
                this.AudioAttributesImplApi21Parcelizer = i670 + 1;
                objArr221[i670] = objArr221[20];
                return 0;
            case 502:
                int[] iArr368 = this.RatingCompat;
                int i672 = this.AudioAttributesImplApi21Parcelizer;
                iArr368[i672] = iArr368[i672 - 1];
                this.AudioAttributesImplApi21Parcelizer = i672;
                iArr368[22] = iArr368[i672];
                return 0;
            case 503:
                int[] iArr369 = this.RatingCompat;
                iArr369[18] = iArr369[18] + 1;
                return 0;
            case TarConstants.SPARSELEN_GNU_SPARSE /* 504 */:
                int[] iArr370 = this.RatingCompat;
                int i673 = this.AudioAttributesImplApi21Parcelizer;
                iArr370[i673] = 73;
                this.AudioAttributesImplApi21Parcelizer = i673;
                iArr370[i673 - 1] = iArr370[i673 - 1] + iArr370[i673];
                return 0;
            case 505:
                int[] iArr371 = this.RatingCompat;
                int i674 = this.AudioAttributesImplApi21Parcelizer;
                iArr371[i674] = 31;
                iArr371[i674 - 1] = iArr371[i674 - 1] + iArr371[i674];
                this.AudioAttributesImplApi21Parcelizer = i674 + 1;
                iArr371[i674] = iArr371[i674 - 1];
                return 0;
            case 506:
                int[] iArr372 = this.RatingCompat;
                int i675 = this.AudioAttributesImplApi21Parcelizer;
                iArr372[i675] = 45;
                this.AudioAttributesImplApi21Parcelizer = i675;
                iArr372[i675 - 1] = iArr372[i675 - 1] + iArr372[i675];
                return 0;
            case 507:
                int[] iArr373 = this.RatingCompat;
                int i676 = this.AudioAttributesImplApi21Parcelizer;
                iArr373[i676] = 7072;
                this.AudioAttributesImplApi21Parcelizer = i676;
                iArr373[i676 - 1] = iArr373[i676] & iArr373[i676 - 1];
                return 0;
            case TarConstants.XSTAR_MAGIC_OFFSET /* 508 */:
                int[] iArr374 = this.RatingCompat;
                int i677 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i677 + 1;
                iArr374[i677] = 71;
                return 0;
            case 509:
                int[] iArr375 = this.RatingCompat;
                int i678 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i678 + 1;
                iArr375[i678] = 61;
                return 0;
            case 510:
                int[] iArr376 = this.RatingCompat;
                int i679 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i679 + 1;
                iArr376[i679] = 4;
                return 0;
            case UnixStat.DEFAULT_LINK_PERM /* 511 */:
                int[] iArr377 = this.RatingCompat;
                int i680 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i680 + 1;
                iArr377[i680] = 97;
                return 0;
            case 512:
                int i681 = this.AudioAttributesImplApi21Parcelizer;
                int i682 = i681 - 1;
                Object[] objArr222 = this.onAddQueueItem;
                Object obj193 = objArr222[i682];
                objArr222[i682] = null;
                objArr222[12] = obj193;
                this.AudioAttributesImplApi21Parcelizer = i681;
                objArr222[i682] = objArr222[11];
                return 0;
            case 513:
                Object[] objArr223 = this.onAddQueueItem;
                int i683 = this.AudioAttributesImplApi21Parcelizer;
                objArr223[i683] = objArr223[13];
                this.AudioAttributesImplApi21Parcelizer = i683 + 2;
                objArr223[i683 + 1] = objArr223[12];
                return 0;
            case 514:
                int[] iArr378 = this.RatingCompat;
                int i684 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i684 + 1;
                iArr378[i684] = 39;
                return 0;
            case 515:
                int[] iArr379 = this.RatingCompat;
                int i685 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i685 + 1;
                iArr379[i685] = 38;
                return 0;
            case 516:
                int[] iArr380 = this.RatingCompat;
                int i686 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i686 + 1;
                iArr380[i686] = 40;
                return 0;
            case 517:
                int[] iArr381 = this.RatingCompat;
                int i687 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i687 + 1;
                iArr381[i687] = 41;
                return 0;
            case 518:
                int[] iArr382 = this.RatingCompat;
                int i688 = this.AudioAttributesImplApi21Parcelizer;
                iArr382[i688] = 2;
                this.AudioAttributesImplApi21Parcelizer = i688;
                iArr382[i688 - 1] = iArr382[i688 - 1] % iArr382[i688];
                int i689 = i688 - 1;
                this.AudioAttributesImplApi21Parcelizer = i689;
                this.onAddQueueItem[i689] = null;
                return 0;
            case 519:
                int[] iArr383 = this.RatingCompat;
                int i690 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i690 + 1;
                iArr383[i690] = 27;
                return 0;
            case 520:
                int[] iArr384 = this.RatingCompat;
                int i691 = this.AudioAttributesImplApi21Parcelizer;
                iArr384[i691] = 0;
                this.AudioAttributesImplApi21Parcelizer = i691;
                iArr384[13] = iArr384[i691];
                return 0;
            case 521:
                int i692 = this.AudioAttributesImplApi21Parcelizer;
                int i693 = i692 - 1;
                Object[] objArr224 = this.onAddQueueItem;
                Object obj194 = objArr224[i693];
                objArr224[i693] = null;
                objArr224[15] = obj194;
                objArr224[i693] = obj194;
                int[] iArr385 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i692 + 1;
                iArr385[i692] = 0;
                return 0;
            case 522:
                int i694 = this.AudioAttributesImplApi21Parcelizer;
                int i695 = i694 - 1;
                Object[] objArr225 = this.onAddQueueItem;
                Object obj195 = objArr225[i695];
                objArr225[i695] = null;
                objArr225[15] = obj195;
                int[] iArr386 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i694;
                iArr386[i695] = iArr386[13];
                return 0;
            case 523:
                int i696 = this.AudioAttributesImplApi21Parcelizer;
                int i697 = i696 - 1;
                this.AudioAttributesImplApi21Parcelizer = i697;
                int[] iArr387 = this.RatingCompat;
                iArr387[i696 - 2] = iArr387[i696 - 2] | iArr387[i697];
                return 0;
            case 524:
                int i698 = this.AudioAttributesImplApi21Parcelizer;
                int i699 = i698 - 1;
                int[] iArr388 = this.RatingCompat;
                iArr388[13] = iArr388[i699];
                iArr388[i699] = iArr388[14];
                this.AudioAttributesImplApi21Parcelizer = i698 + 1;
                iArr388[i698] = 506;
                return 0;
            case 525:
                int i700 = this.AudioAttributesImplApi21Parcelizer;
                int i701 = i700 - 1;
                int[] iArr389 = this.RatingCompat;
                iArr389[i700 - 2] = iArr389[i700 - 2] - iArr389[i701];
                this.AudioAttributesImplApi21Parcelizer = i700;
                iArr389[i701] = 0;
                return 0;
            case 526:
                int[] iArr390 = this.RatingCompat;
                int i702 = this.AudioAttributesImplApi21Parcelizer;
                iArr390[i702 - 1] = (char) iArr390[i702 - 1];
                this.AudioAttributesImplApi21Parcelizer = i702 + 1;
                iArr390[i702] = 14;
                return 0;
            case 527:
                Object[] objArr226 = this.onAddQueueItem;
                int i703 = this.AudioAttributesImplApi21Parcelizer;
                objArr226[i703] = objArr226[i703 - 1];
                this.AudioAttributesImplApi21Parcelizer = i703;
                Object obj196 = objArr226[i703];
                objArr226[i703] = null;
                objArr226[14] = obj196;
                return 0;
            case 528:
                Object[] objArr227 = this.onAddQueueItem;
                int i704 = this.AudioAttributesImplApi21Parcelizer;
                objArr227[i704] = objArr227[14];
                int[] iArr391 = this.RatingCompat;
                iArr391[i704 + 1] = 0;
                int i705 = i704 + 1;
                this.AudioAttributesImplApi21Parcelizer = i705;
                Object obj197 = objArr227[i704];
                objArr227[i704] = null;
                objArr227[i704] = ((Object[]) obj197)[iArr391[i705]];
                return 0;
            case 529:
                int i706 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr392 = this.RatingCompat;
                iArr392[i706 - 2] = iArr392[i706 - 1] | iArr392[i706 - 2];
                int i707 = i706 - 2;
                this.AudioAttributesImplApi21Parcelizer = i707;
                iArr392[14] = iArr392[i707];
                return 0;
            case 530:
                int[] iArr393 = this.RatingCompat;
                int i708 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i708 + 1;
                iArr393[i708] = 42;
                return 0;
            case 531:
                int[] iArr394 = this.RatingCompat;
                int i709 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i709 + 1;
                iArr394[i709] = 43;
                return 0;
            case 532:
                int[] iArr395 = this.RatingCompat;
                int i710 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i710 + 1;
                iArr395[i710] = 44;
                return 0;
            case 533:
                int[] iArr396 = this.RatingCompat;
                int i711 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i711 + 1;
                iArr396[i711] = 85;
                return 0;
            case 534:
                int i712 = this.AudioAttributesImplApi21Parcelizer;
                int i713 = i712 - 1;
                Object[] objArr228 = this.onAddQueueItem;
                Object obj198 = objArr228[i713];
                objArr228[i713] = null;
                objArr228[12] = obj198;
                this.AudioAttributesImplApi21Parcelizer = i712;
                objArr228[i713] = objArr228[11];
                Object obj199 = objArr228[i712 - 1];
                objArr228[i712 - 1] = null;
                this.RatingCompat[i712 - 1] = ((Object[]) obj199).length;
                return 0;
            case 535:
                int i714 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i714;
                this.write = this.RatingCompat[i714] > 0 ? 0 : 1;
                return 0;
            case 536:
                Object[] objArr229 = this.onAddQueueItem;
                int i715 = this.AudioAttributesImplApi21Parcelizer;
                objArr229[i715] = objArr229[11];
                int[] iArr397 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i715 + 2;
                iArr397[i715 + 1] = iArr397[13];
                return 0;
            case 537:
                int[] iArr398 = this.RatingCompat;
                int i716 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i716 + 1;
                iArr398[i716] = 520;
                return 0;
            case 538:
                int i717 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr399 = this.RatingCompat;
                long[] jArr12 = this.MediaBrowserCompatMediaItem;
                iArr399[i717 - 2] = (jArr12[i717 - 2] > jArr12[i717 - 1] ? 1 : (jArr12[i717 - 2] == jArr12[i717 - 1] ? 0 : -1));
                int i718 = i717 - 2;
                this.AudioAttributesImplApi21Parcelizer = i718;
                iArr399[i717 - 3] = iArr399[i717 - 3] - iArr399[i718];
                iArr399[i717 - 3] = (char) iArr399[i717 - 3];
                return 0;
            case 539:
                int[] iArr400 = this.RatingCompat;
                int i719 = this.AudioAttributesImplApi21Parcelizer;
                iArr400[i719 - 1] = -iArr400[i719 - 1];
                return 0;
            case 540:
                int i720 = this.AudioAttributesImplApi21Parcelizer;
                int i721 = i720 - 1;
                this.AudioAttributesImplApi21Parcelizer = i721;
                Object[] objArr230 = this.onAddQueueItem;
                Object obj200 = objArr230[i721];
                objArr230[i721] = null;
                objArr230[14] = obj200;
                Object obj201 = objArr230[i720 - 2];
                objArr230[i720 - 2] = null;
                this.RatingCompat[i720 - 2] = ((Object[]) obj201).length;
                return 0;
            case 541:
                int[] iArr401 = this.RatingCompat;
                int i722 = this.AudioAttributesImplApi21Parcelizer;
                iArr401[i722] = iArr401[16];
                this.AudioAttributesImplApi21Parcelizer = i722;
                Object[] objArr231 = this.onAddQueueItem;
                Object obj202 = objArr231[i722 - 1];
                objArr231[i722 - 1] = null;
                objArr231[i722 - 1] = ((Object[]) obj202)[iArr401[i722]];
                return 0;
            case 542:
                int i723 = this.AudioAttributesImplApi21Parcelizer;
                int i724 = i723 - 1;
                Object[] objArr232 = this.onAddQueueItem;
                Object obj203 = objArr232[i724];
                objArr232[i724] = null;
                objArr232[17] = obj203;
                this.AudioAttributesImplApi21Parcelizer = i723;
                objArr232[i724] = objArr232[12];
                return 0;
            case 543:
                Object[] objArr233 = this.onAddQueueItem;
                int i725 = this.AudioAttributesImplApi21Parcelizer;
                objArr233[i725] = objArr233[17];
                int[] iArr402 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i725 + 2;
                iArr402[i725 + 1] = 16;
                return 0;
            case 544:
                int[] iArr403 = this.RatingCompat;
                iArr403[16] = iArr403[16] + 1;
                return 0;
            case 545:
                int[] iArr404 = this.RatingCompat;
                iArr404[13] = iArr404[13] + 1;
                return 0;
            case 546:
                int[] iArr405 = this.RatingCompat;
                int i726 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i726 + 1;
                iArr405[i726] = 109;
                return 0;
            case 547:
                int i727 = this.AudioAttributesImplApi21Parcelizer;
                int i728 = i727 - 1;
                this.AudioAttributesImplApi21Parcelizer = i728;
                int[] iArr406 = this.RatingCompat;
                iArr406[i727 - 2] = iArr406[i727 - 2] / iArr406[i728];
                int i729 = i727 - 2;
                this.AudioAttributesImplApi21Parcelizer = i729;
                this.onAddQueueItem[i729] = null;
                return 0;
            case 548:
                int[] iArr407 = this.RatingCompat;
                int i730 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i730 + 1;
                iArr407[i730] = 99;
                return 0;
            case 549:
                Object[] objArr234 = this.onAddQueueItem;
                int i731 = this.AudioAttributesImplApi21Parcelizer;
                objArr234[i731 - 1] = new char[this.RatingCompat[i731 - 1]];
                this.AudioAttributesImplApi21Parcelizer = i731 + 1;
                objArr234[i731] = objArr234[i731 - 1];
                return 0;
            case 550:
                int[] iArr408 = this.RatingCompat;
                int i732 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i732 + 1;
                iArr408[i732] = 16383;
                return 0;
            case 551:
                Object[] objArr235 = this.onAddQueueItem;
                int i733 = this.AudioAttributesImplApi21Parcelizer;
                Object obj204 = objArr235[i733 - 1];
                objArr235[i733 - 1] = null;
                Object obj205 = objArr235[i733 - 2];
                objArr235[i733 - 2] = null;
                objArr235[i733 - 1] = obj205;
                objArr235[i733 - 2] = obj204;
                int[] iArr409 = this.RatingCompat;
                iArr409[i733] = 16383;
                this.AudioAttributesImplApi21Parcelizer = i733 + 2;
                iArr409[i733 + 1] = 16383;
                return 0;
            case 552:
                int[] iArr410 = this.RatingCompat;
                int i734 = this.AudioAttributesImplApi21Parcelizer;
                iArr410[i734] = 32766;
                this.AudioAttributesImplApi21Parcelizer = i734 + 2;
                iArr410[i734 + 1] = 12532;
                return 0;
            case 553:
                int i735 = this.AudioAttributesImplApi21Parcelizer;
                int i736 = i735 - 1;
                Object[] objArr236 = this.onAddQueueItem;
                Object obj206 = objArr236[i736];
                objArr236[i736] = null;
                objArr236[13] = obj206;
                int[] iArr411 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i735;
                iArr411[i736] = iArr411[11];
                return 0;
            case RtspMessageChannel.DEFAULT_RTSP_PORT /* 554 */:
                int[] iArr412 = this.RatingCompat;
                int i737 = this.AudioAttributesImplApi21Parcelizer;
                iArr412[i737] = iArr412[12];
                this.AudioAttributesImplApi21Parcelizer = i737;
                iArr412[14] = iArr412[i737];
                return 0;
            case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                Object[] objArr237 = this.onAddQueueItem;
                int i738 = this.AudioAttributesImplApi21Parcelizer;
                objArr237[i738] = objArr237[13];
                this.AudioAttributesImplApi21Parcelizer = i738;
                Object obj207 = objArr237[i738];
                objArr237[i738] = null;
                objArr237[16] = obj207;
                return 0;
            case 556:
                Object[] objArr238 = this.onAddQueueItem;
                int i739 = this.AudioAttributesImplApi21Parcelizer;
                objArr238[i739] = objArr238[i739 - 1];
                this.AudioAttributesImplApi21Parcelizer = i739;
                Object obj208 = objArr238[i739];
                objArr238[i739] = null;
                objArr238[12] = obj208;
                return 0;
            case 557:
                int[] iArr413 = this.RatingCompat;
                int i740 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr239 = this.onAddQueueItem;
                Object obj209 = objArr239[i740 - 1];
                objArr239[i740 - 1] = null;
                iArr413[i740 - 1] = ((char[]) obj209).length;
                return 0;
            case 558:
                int[] iArr414 = this.RatingCompat;
                int i741 = this.AudioAttributesImplApi21Parcelizer;
                iArr414[i741] = iArr414[i741 - 1];
                this.AudioAttributesImplApi21Parcelizer = i741;
                iArr414[18] = iArr414[i741];
                return 0;
            case 559:
                Object[] objArr240 = this.onAddQueueItem;
                int i742 = this.AudioAttributesImplApi21Parcelizer;
                objArr240[i742 - 1] = new char[this.RatingCompat[i742 - 1]];
                return 0;
            case 560:
                int i743 = this.AudioAttributesImplApi21Parcelizer;
                int i744 = i743 - 1;
                Object[] objArr241 = this.onAddQueueItem;
                Object obj210 = objArr241[i744];
                objArr241[i744] = null;
                objArr241[13] = obj210;
                int[] iArr415 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i743;
                iArr415[i744] = 0;
                return 0;
            case 561:
                int[] iArr416 = this.RatingCompat;
                int i745 = this.AudioAttributesImplApi21Parcelizer;
                iArr416[i745] = iArr416[17];
                Object[] objArr242 = this.onAddQueueItem;
                objArr242[i745 + 1] = objArr242[12];
                this.AudioAttributesImplApi21Parcelizer = i745 + 3;
                iArr416[i745 + 2] = iArr416[17];
                return 0;
            case 562:
                int i746 = this.AudioAttributesImplApi21Parcelizer;
                int i747 = i746 - 1;
                this.AudioAttributesImplApi21Parcelizer = i747;
                int[] iArr417 = this.RatingCompat;
                Object[] objArr243 = this.onAddQueueItem;
                Object obj211 = objArr243[i746 - 2];
                objArr243[i746 - 2] = null;
                iArr417[i746 - 2] = ((char[]) obj211)[iArr417[i747]];
                return 0;
            case 563:
                this.MediaBrowserCompatMediaItem[this.AudioAttributesImplApi21Parcelizer - 1] = this.RatingCompat[r3 - 1];
                return 0;
            case 564:
                int i748 = this.AudioAttributesImplApi21Parcelizer;
                int i749 = i748 - 1;
                this.AudioAttributesImplApi21Parcelizer = i749;
                long[] jArr13 = this.MediaBrowserCompatMediaItem;
                jArr13[i748 - 2] = jArr13[i748 - 2] ^ jArr13[i749];
                this.RatingCompat[i748 - 2] = (int) jArr13[i748 - 2];
                return 0;
            case 565:
                int[] iArr418 = this.RatingCompat;
                int i750 = this.AudioAttributesImplApi21Parcelizer;
                iArr418[i750 - 1] = (char) iArr418[i750 - 1];
                int i751 = i750 - 3;
                this.AudioAttributesImplApi21Parcelizer = i751;
                Object[] objArr244 = this.onAddQueueItem;
                Object obj212 = objArr244[i751];
                objArr244[i751] = null;
                ((char[]) obj212)[iArr418[i750 - 2]] = (char) iArr418[i750 - 1];
                this.AudioAttributesImplApi21Parcelizer = i750 - 2;
                iArr418[i751] = iArr418[17];
                return 0;
            case 566:
                int i752 = this.AudioAttributesImplApi21Parcelizer;
                int i753 = i752 - 1;
                Object[] objArr245 = this.onAddQueueItem;
                Object obj213 = objArr245[i753];
                objArr245[i753] = null;
                objArr245[12] = obj213;
                int[] iArr419 = this.RatingCompat;
                iArr419[i753] = iArr419[14];
                int i754 = i752 - 1;
                this.AudioAttributesImplApi21Parcelizer = i754;
                iArr419[13] = iArr419[i754];
                return 0;
            case 567:
                int i755 = this.AudioAttributesImplApi21Parcelizer;
                int i756 = i755 - 1;
                this.AudioAttributesImplApi21Parcelizer = i756;
                long[] jArr14 = this.MediaBrowserCompatMediaItem;
                jArr14[i755 - 2] = jArr14[i756] ^ jArr14[i755 - 2];
                return 0;
            case 568:
                int[] iArr420 = this.RatingCompat;
                int i757 = this.AudioAttributesImplApi21Parcelizer;
                iArr420[i757 - 1] = (int) this.MediaBrowserCompatMediaItem[i757 - 1];
                return 0;
            case 569:
                int[] iArr421 = this.RatingCompat;
                int i758 = this.AudioAttributesImplApi21Parcelizer;
                iArr421[i758 - 1] = (char) iArr421[i758 - 1];
                int i759 = i758 - 1;
                this.AudioAttributesImplApi21Parcelizer = i759;
                iArr421[14] = iArr421[i759];
                return 0;
            case 570:
                this.RatingCompat[13] = r0[13] - 1;
                return 0;
            case 571:
                Object[] objArr246 = this.onAddQueueItem;
                int i760 = this.AudioAttributesImplApi21Parcelizer;
                objArr246[i760] = objArr246[16];
                int[] iArr422 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i760 + 2;
                iArr422[i760 + 1] = iArr422[13];
                return 0;
            case 572:
                int i761 = this.AudioAttributesImplApi21Parcelizer;
                int i762 = i761 - 1;
                this.AudioAttributesImplApi21Parcelizer = i762;
                int[] iArr423 = this.RatingCompat;
                Object[] objArr247 = this.onAddQueueItem;
                Object obj214 = objArr247[i761 - 2];
                objArr247[i761 - 2] = null;
                iArr423[i761 - 2] = ((char[]) obj214)[iArr423[i762]];
                this.AudioAttributesImplApi21Parcelizer = i761;
                iArr423[i762] = iArr423[15];
                return 0;
            case 573:
                int i763 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr424 = this.RatingCompat;
                iArr424[i763 - 2] = iArr424[i763 - 2] - iArr424[i763 - 1];
                iArr424[i763 - 2] = (char) iArr424[i763 - 2];
                int i764 = i763 - 4;
                this.AudioAttributesImplApi21Parcelizer = i764;
                Object[] objArr248 = this.onAddQueueItem;
                Object obj215 = objArr248[i764];
                objArr248[i764] = null;
                ((char[]) obj215)[iArr424[i763 - 3]] = (char) iArr424[i763 - 2];
                return 0;
            case 574:
                int i765 = this.AudioAttributesImplApi21Parcelizer;
                int i766 = i765 - 2;
                this.AudioAttributesImplApi21Parcelizer = i766;
                int[] iArr425 = this.RatingCompat;
                this.write = iArr425[i766] <= iArr425[i765 - 1] ? 0 : 1;
                return 0;
            case 575:
                int[] iArr426 = this.RatingCompat;
                int i767 = this.AudioAttributesImplApi21Parcelizer;
                iArr426[i767] = iArr426[13];
                this.AudioAttributesImplApi21Parcelizer = i767 + 2;
                iArr426[i767 + 1] = 1;
                return 0;
            case 576:
                Object[] objArr249 = this.onAddQueueItem;
                int i768 = this.AudioAttributesImplApi21Parcelizer;
                objArr249[i768] = objArr249[11];
                int[] iArr427 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i768 + 2;
                iArr427[i768 + 1] = 0;
                return 0;
            case 577:
                Object[] objArr250 = this.onAddQueueItem;
                int i769 = this.AudioAttributesImplApi21Parcelizer;
                objArr250[i769] = objArr250[11];
                this.AudioAttributesImplApi21Parcelizer = i769 + 2;
                objArr250[i769 + 1] = objArr250[16];
                return 0;
            case 578:
                int i770 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr428 = this.RatingCompat;
                iArr428[i770 - 2] = iArr428[i770 - 2] + iArr428[i770 - 1];
                int i771 = i770 - 2;
                this.AudioAttributesImplApi21Parcelizer = i771;
                Object[] objArr251 = this.onAddQueueItem;
                Object obj216 = objArr251[i770 - 3];
                objArr251[i770 - 3] = null;
                iArr428[i770 - 3] = ((char[]) obj216)[iArr428[i771]];
                return 0;
            case 579:
                Object[] objArr252 = this.onAddQueueItem;
                int i772 = this.AudioAttributesImplApi21Parcelizer;
                objArr252[i772] = objArr252[17];
                this.AudioAttributesImplApi21Parcelizer = i772 + 2;
                objArr252[i772 + 1] = objArr252[11];
                return 0;
            case 580:
                int i773 = this.AudioAttributesImplApi21Parcelizer;
                int i774 = i773 - 3;
                this.AudioAttributesImplApi21Parcelizer = i774;
                Object[] objArr253 = this.onAddQueueItem;
                Object obj217 = objArr253[i774];
                objArr253[i774] = null;
                int[] iArr429 = this.RatingCompat;
                ((char[]) obj217)[iArr429[i773 - 2]] = (char) iArr429[i773 - 1];
                objArr253[i774] = objArr253[17];
                this.AudioAttributesImplApi21Parcelizer = i773 - 1;
                objArr253[i773 - 2] = objArr253[11];
                return 0;
            case 581:
                int[] iArr430 = this.RatingCompat;
                int i775 = this.AudioAttributesImplApi21Parcelizer;
                iArr430[i775] = 1;
                iArr430[i775 - 1] = iArr430[i775 - 1] + iArr430[i775];
                Object[] objArr254 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i775 + 1;
                objArr254[i775] = objArr254[11];
                return 0;
            case 582:
                int i776 = this.AudioAttributesImplApi21Parcelizer;
                int i777 = i776 - 3;
                this.AudioAttributesImplApi21Parcelizer = i777;
                Object[] objArr255 = this.onAddQueueItem;
                Object obj218 = objArr255[i777];
                objArr255[i777] = null;
                int[] iArr431 = this.RatingCompat;
                ((char[]) obj218)[iArr431[i776 - 2]] = (char) iArr431[i776 - 1];
                return 0;
            case 583:
                Object[] objArr256 = this.onAddQueueItem;
                int i778 = this.AudioAttributesImplApi21Parcelizer;
                objArr256[i778] = objArr256[11];
                this.AudioAttributesImplApi21Parcelizer = i778 + 2;
                objArr256[i778 + 1] = objArr256[i778];
                return 0;
            case 584:
                int i779 = this.AudioAttributesImplApi21Parcelizer;
                int i780 = i779 - 1;
                this.AudioAttributesImplApi21Parcelizer = i780;
                int[] iArr432 = this.RatingCompat;
                iArr432[i779 - 2] = iArr432[i779 - 2] / iArr432[i780];
                return 0;
            case 585:
                int[] iArr433 = this.RatingCompat;
                int i781 = this.AudioAttributesImplApi21Parcelizer;
                iArr433[i781] = iArr433[14];
                this.AudioAttributesImplApi21Parcelizer = i781;
                iArr433[i781 - 1] = iArr433[i781 - 1] / iArr433[i781];
                return 0;
            case 586:
                int[] iArr434 = this.RatingCompat;
                int i782 = this.AudioAttributesImplApi21Parcelizer;
                iArr434[i782] = 1;
                iArr434[i782 - 1] = iArr434[i782 - 1] - iArr434[i782];
                this.AudioAttributesImplApi21Parcelizer = i782 + 1;
                iArr434[i782] = iArr434[14];
                return 0;
            case 587:
                int i783 = this.AudioAttributesImplApi21Parcelizer;
                int i784 = i783 - 1;
                int[] iArr435 = this.RatingCompat;
                iArr435[i783 - 2] = iArr435[i783 - 2] + iArr435[i784];
                iArr435[i784] = 1;
                int i785 = i783 - 1;
                this.AudioAttributesImplApi21Parcelizer = i785;
                iArr435[i783 - 2] = iArr435[i783 - 2] - iArr435[i785];
                return 0;
            case 588:
                int[] iArr436 = this.RatingCompat;
                int i786 = this.AudioAttributesImplApi21Parcelizer;
                iArr436[i786] = iArr436[14];
                this.AudioAttributesImplApi21Parcelizer = i786;
                iArr436[i786 - 1] = iArr436[i786 - 1] % iArr436[i786];
                return 0;
            case 589:
                int i787 = this.AudioAttributesImplApi21Parcelizer;
                int i788 = i787 - 1;
                int[] iArr437 = this.RatingCompat;
                iArr437[i787 - 2] = iArr437[i787 - 2] * iArr437[i788];
                Object[] objArr257 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i787;
                objArr257[i788] = objArr257[11];
                return 0;
            case 590:
                int i789 = this.AudioAttributesImplApi21Parcelizer;
                int i790 = i789 - 1;
                this.AudioAttributesImplApi21Parcelizer = i790;
                int[] iArr438 = this.RatingCompat;
                iArr438[i789 - 2] = iArr438[i789 - 2] * iArr438[i790];
                return 0;
            case 591:
                int[] iArr439 = this.RatingCompat;
                int i791 = this.AudioAttributesImplApi21Parcelizer;
                iArr439[i791] = iArr439[18];
                this.AudioAttributesImplApi21Parcelizer = i791;
                Object[] objArr258 = this.onAddQueueItem;
                Object obj219 = objArr258[i791 - 1];
                objArr258[i791 - 1] = null;
                iArr439[i791 - 1] = ((char[]) obj219)[iArr439[i791]];
                int i792 = i791 - 3;
                this.AudioAttributesImplApi21Parcelizer = i792;
                Object obj220 = objArr258[i792];
                objArr258[i792] = null;
                ((char[]) obj220)[iArr439[i791 - 2]] = (char) iArr439[i791 - 1];
                return 0;
            case 592:
                int[] iArr440 = this.RatingCompat;
                int i793 = this.AudioAttributesImplApi21Parcelizer;
                iArr440[i793] = 1;
                iArr440[i793 - 1] = iArr440[i793 - 1] + iArr440[i793];
                Object[] objArr259 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i793 + 1;
                objArr259[i793] = objArr259[12];
                return 0;
            case 593:
                int[] iArr441 = this.RatingCompat;
                int i794 = this.AudioAttributesImplApi21Parcelizer;
                iArr441[i794] = iArr441[19];
                this.AudioAttributesImplApi21Parcelizer = i794;
                Object[] objArr260 = this.onAddQueueItem;
                Object obj221 = objArr260[i794 - 1];
                objArr260[i794 - 1] = null;
                iArr441[i794 - 1] = ((char[]) obj221)[iArr441[i794]];
                int i795 = i794 - 3;
                this.AudioAttributesImplApi21Parcelizer = i795;
                Object obj222 = objArr260[i795];
                objArr260[i795] = null;
                ((char[]) obj222)[iArr441[i794 - 2]] = (char) iArr441[i794 - 1];
                return 0;
            case 594:
                int[] iArr442 = this.RatingCompat;
                int i796 = this.AudioAttributesImplApi21Parcelizer;
                iArr442[i796] = iArr442[14];
                iArr442[i796 - 1] = iArr442[i796 - 1] + iArr442[i796];
                this.AudioAttributesImplApi21Parcelizer = i796 + 1;
                iArr442[i796] = 1;
                return 0;
            case 595:
                int i797 = this.AudioAttributesImplApi21Parcelizer;
                int i798 = i797 - 1;
                int[] iArr443 = this.RatingCompat;
                iArr443[i797 - 2] = iArr443[i797 - 2] - iArr443[i798];
                iArr443[i798] = iArr443[14];
                int i799 = i797 - 1;
                this.AudioAttributesImplApi21Parcelizer = i799;
                iArr443[i797 - 2] = iArr443[i797 - 2] % iArr443[i799];
                return 0;
            case 596:
                int[] iArr444 = this.RatingCompat;
                int i800 = this.AudioAttributesImplApi21Parcelizer;
                iArr444[i800] = iArr444[14];
                this.AudioAttributesImplApi21Parcelizer = i800;
                iArr444[i800 - 1] = iArr444[i800 - 1] * iArr444[i800];
                return 0;
            case 597:
                int i801 = this.AudioAttributesImplApi21Parcelizer;
                int i802 = i801 - 1;
                int[] iArr445 = this.RatingCompat;
                iArr445[18] = iArr445[i802];
                Object[] objArr261 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i801;
                objArr261[i802] = objArr261[11];
                return 0;
            case 598:
                int i803 = this.AudioAttributesImplApi21Parcelizer;
                int i804 = i803 - 1;
                int[] iArr446 = this.RatingCompat;
                iArr446[19] = iArr446[i804];
                Object[] objArr262 = this.onAddQueueItem;
                objArr262[i804] = objArr262[17];
                this.AudioAttributesImplApi21Parcelizer = i803 + 1;
                objArr262[i803] = objArr262[11];
                return 0;
            case 599:
                int[] iArr447 = this.RatingCompat;
                int i805 = this.AudioAttributesImplApi21Parcelizer;
                iArr447[i805] = iArr447[18];
                this.AudioAttributesImplApi21Parcelizer = i805;
                Object[] objArr263 = this.onAddQueueItem;
                Object obj223 = objArr263[i805 - 1];
                objArr263[i805 - 1] = null;
                iArr447[i805 - 1] = ((char[]) obj223)[iArr447[i805]];
                return 0;
            case 600:
                int[] iArr448 = this.RatingCompat;
                int i806 = this.AudioAttributesImplApi21Parcelizer;
                iArr448[i806] = 1;
                this.AudioAttributesImplApi21Parcelizer = i806;
                iArr448[i806 - 1] = iArr448[i806 - 1] + iArr448[i806];
                return 0;
            case 601:
                int i807 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr449 = this.RatingCompat;
                iArr449[i807 - 2] = iArr449[i807 - 2] + iArr449[i807 - 1];
                int i808 = i807 - 2;
                iArr449[18] = iArr449[i808];
                Object[] objArr264 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i807 - 1;
                objArr264[i808] = objArr264[11];
                return 0;
            case 602:
                Object[] objArr265 = this.onAddQueueItem;
                int i809 = this.AudioAttributesImplApi21Parcelizer;
                objArr265[i809] = objArr265[12];
                int[] iArr450 = this.RatingCompat;
                iArr450[i809 + 1] = iArr450[18];
                int i810 = i809 + 1;
                this.AudioAttributesImplApi21Parcelizer = i810;
                Object obj224 = objArr265[i809];
                objArr265[i809] = null;
                iArr450[i809] = ((char[]) obj224)[iArr450[i810]];
                return 0;
            case 603:
                Object[] objArr266 = this.onAddQueueItem;
                int i811 = this.AudioAttributesImplApi21Parcelizer;
                objArr266[i811] = objArr266[12];
                int[] iArr451 = this.RatingCompat;
                iArr451[i811 + 1] = iArr451[19];
                int i812 = i811 + 1;
                this.AudioAttributesImplApi21Parcelizer = i812;
                Object obj225 = objArr266[i811];
                objArr266[i811] = null;
                iArr451[i811] = ((char[]) obj225)[iArr451[i812]];
                return 0;
            case 604:
                int[] iArr452 = this.RatingCompat;
                int i813 = this.AudioAttributesImplApi21Parcelizer;
                iArr452[i813] = 2;
                this.AudioAttributesImplApi21Parcelizer = i813;
                iArr452[i813 - 1] = iArr452[i813 - 1] + iArr452[i813];
                return 0;
            case 605:
                Object[] objArr267 = this.onAddQueueItem;
                int i814 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i814 + 1;
                objArr267[i814] = objArr267[17];
                int[] iArr453 = this.RatingCompat;
                Object obj226 = objArr267[i814];
                objArr267[i814] = null;
                iArr453[i814] = ((char[]) obj226).length;
                return 0;
            case 606:
                int[] iArr454 = this.RatingCompat;
                int i815 = this.AudioAttributesImplApi21Parcelizer;
                iArr454[i815] = iArr454[18];
                Object[] objArr268 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i815 + 2;
                objArr268[i815 + 1] = objArr268[17];
                return 0;
            case 607:
                int[] iArr455 = this.RatingCompat;
                int i816 = this.AudioAttributesImplApi21Parcelizer;
                iArr455[i816] = iArr455[18];
                this.AudioAttributesImplApi21Parcelizer = i816;
                Object[] objArr269 = this.onAddQueueItem;
                Object obj227 = objArr269[i816 - 1];
                objArr269[i816 - 1] = null;
                iArr455[i816 - 1] = ((char[]) obj227)[iArr455[i816]];
                this.AudioAttributesImplApi21Parcelizer = i816 + 1;
                iArr455[i816] = 13722;
                return 0;
            case 608:
                int i817 = this.AudioAttributesImplApi21Parcelizer;
                int i818 = i817 - 1;
                this.AudioAttributesImplApi21Parcelizer = i818;
                int[] iArr456 = this.RatingCompat;
                iArr456[i817 - 2] = iArr456[i817 - 2] ^ iArr456[i818];
                return 0;
            case 609:
                Object[] objArr270 = this.onAddQueueItem;
                int i819 = this.AudioAttributesImplApi21Parcelizer;
                objArr270[i819] = objArr270[11];
                this.AudioAttributesImplApi21Parcelizer = i819;
                Object obj228 = objArr270[i819];
                objArr270[i819] = null;
                objArr270[17] = obj228;
                return 0;
            case 610:
                int[] iArr457 = this.RatingCompat;
                int i820 = this.AudioAttributesImplApi21Parcelizer;
                iArr457[i820] = iArr457[12];
                this.AudioAttributesImplApi21Parcelizer = i820;
                iArr457[18] = iArr457[i820];
                return 0;
            case 611:
                int[] iArr458 = this.RatingCompat;
                int i821 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i821 + 1;
                iArr458[i821] = 4;
                Object[] objArr271 = this.onAddQueueItem;
                objArr271[i821] = new char[iArr458[i821]];
                this.AudioAttributesImplApi21Parcelizer = i821;
                Object obj229 = objArr271[i821];
                objArr271[i821] = null;
                objArr271[12] = obj229;
                return 0;
            case 612:
                Object[] objArr272 = this.onAddQueueItem;
                int i822 = this.AudioAttributesImplApi21Parcelizer;
                int i823 = i822 + 1;
                this.AudioAttributesImplApi21Parcelizer = i823;
                objArr272[i822] = objArr272[17];
                int[] iArr459 = this.RatingCompat;
                Object obj230 = objArr272[i822];
                objArr272[i822] = null;
                iArr459[i822] = ((int[]) obj230).length;
                this.AudioAttributesImplApi21Parcelizer = i822 + 2;
                iArr459[i823] = 1;
                return 0;
            case 613:
                int i824 = this.AudioAttributesImplApi21Parcelizer;
                int i825 = i824 - 1;
                this.AudioAttributesImplApi21Parcelizer = i825;
                int[] iArr460 = this.RatingCompat;
                iArr460[i824 - 2] = iArr460[i824 - 2] << iArr460[i825];
                Object[] objArr273 = this.onAddQueueItem;
                objArr273[i824 - 2] = new char[iArr460[i824 - 2]];
                int i826 = i824 - 2;
                this.AudioAttributesImplApi21Parcelizer = i826;
                Object obj231 = objArr273[i826];
                objArr273[i826] = null;
                objArr273[13] = obj231;
                return 0;
            case 614:
                int i827 = this.AudioAttributesImplApi21Parcelizer;
                int i828 = i827 - 1;
                this.AudioAttributesImplApi21Parcelizer = i828;
                Object[] objArr274 = this.onAddQueueItem;
                Object obj232 = objArr274[i828];
                objArr274[i828] = null;
                objArr274[14] = obj232;
                int[] iArr461 = this.RatingCompat;
                Object obj233 = objArr274[i827 - 2];
                objArr274[i827 - 2] = null;
                iArr461[i827 - 2] = ((int[]) obj233).length;
                this.AudioAttributesImplApi21Parcelizer = i827;
                iArr461[i828] = iArr461[i827 - 2];
                return 0;
            case 615:
                Object[] objArr275 = this.onAddQueueItem;
                int i829 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr462 = this.RatingCompat;
                objArr275[i829 - 1] = new int[iArr462[i829 - 1]];
                int i830 = i829 - 1;
                Object obj234 = objArr275[i830];
                objArr275[i830] = null;
                objArr275[15] = obj234;
                this.AudioAttributesImplApi21Parcelizer = i829;
                iArr462[i830] = 0;
                return 0;
            case 616:
                Object[] objArr276 = this.onAddQueueItem;
                int i831 = this.AudioAttributesImplApi21Parcelizer;
                objArr276[i831] = objArr276[15];
                int[] iArr463 = this.RatingCompat;
                iArr463[i831 + 1] = iArr463[16];
                this.AudioAttributesImplApi21Parcelizer = i831 + 3;
                objArr276[i831 + 2] = objArr276[14];
                return 0;
            case 617:
                int[] iArr464 = this.RatingCompat;
                int i832 = this.AudioAttributesImplApi21Parcelizer;
                iArr464[i832] = iArr464[16];
                this.AudioAttributesImplApi21Parcelizer = i832;
                Object[] objArr277 = this.onAddQueueItem;
                Object obj235 = objArr277[i832 - 1];
                objArr277[i832 - 1] = null;
                iArr464[i832 - 1] = ((int[]) obj235)[iArr464[i832]];
                this.MediaBrowserCompatMediaItem[i832 - 1] = iArr464[i832 - 1];
                return 0;
            case 618:
                int i833 = this.AudioAttributesImplApi21Parcelizer;
                int i834 = i833 - 3;
                this.AudioAttributesImplApi21Parcelizer = i834;
                Object[] objArr278 = this.onAddQueueItem;
                Object obj236 = objArr278[i834];
                objArr278[i834] = null;
                int[] iArr465 = this.RatingCompat;
                ((int[]) obj236)[iArr465[i833 - 2]] = iArr465[i833 - 1];
                this.AudioAttributesImplApi21Parcelizer = i833 - 2;
                iArr465[i834] = iArr465[16];
                return 0;
            case 619:
                int[] iArr466 = this.RatingCompat;
                int i835 = this.AudioAttributesImplApi21Parcelizer;
                Object[] objArr279 = this.onAddQueueItem;
                Object obj237 = objArr279[i835 - 1];
                objArr279[i835 - 1] = null;
                iArr466[i835 - 1] = ((int[]) obj237).length;
                return 0;
            case 620:
                int i836 = this.AudioAttributesImplApi21Parcelizer;
                int i837 = i836 - 1;
                this.AudioAttributesImplApi21Parcelizer = i837;
                Object[] objArr280 = this.onAddQueueItem;
                Object obj238 = objArr280[i837];
                objArr280[i837] = null;
                objArr280[15] = obj238;
                Object obj239 = objArr280[i836 - 2];
                objArr280[i836 - 2] = null;
                this.RatingCompat[i836 - 2] = ((int[]) obj239).length;
                return 0;
            case 621:
                int[] iArr467 = this.RatingCompat;
                int i838 = this.AudioAttributesImplApi21Parcelizer;
                iArr467[i838] = iArr467[i838 - 1];
                this.AudioAttributesImplApi21Parcelizer = i838;
                iArr467[20] = iArr467[i838];
                return 0;
            case 622:
                int i839 = this.AudioAttributesImplApi21Parcelizer;
                int i840 = i839 - 1;
                Object[] objArr281 = this.onAddQueueItem;
                Object obj240 = objArr281[i840];
                objArr281[i840] = null;
                objArr281[16] = obj240;
                int[] iArr468 = this.RatingCompat;
                iArr468[i840] = 0;
                int i841 = i839 - 1;
                this.AudioAttributesImplApi21Parcelizer = i841;
                iArr468[19] = iArr468[i841];
                return 0;
            case 623:
                int[] iArr469 = this.RatingCompat;
                int i842 = this.AudioAttributesImplApi21Parcelizer;
                iArr469[i842] = iArr469[19];
                this.AudioAttributesImplApi21Parcelizer = i842 + 2;
                iArr469[i842 + 1] = iArr469[20];
                return 0;
            case 624:
                int i843 = this.AudioAttributesImplApi21Parcelizer;
                int i844 = i843 - 1;
                this.AudioAttributesImplApi21Parcelizer = i844;
                int[] iArr470 = this.RatingCompat;
                Object[] objArr282 = this.onAddQueueItem;
                Object obj241 = objArr282[i843 - 2];
                objArr282[i843 - 2] = null;
                iArr470[i843 - 2] = ((int[]) obj241)[iArr470[i844]];
                this.MediaBrowserCompatMediaItem[i843 - 2] = iArr470[i843 - 2];
                return 0;
            case 625:
                int[] iArr471 = this.RatingCompat;
                int i845 = this.AudioAttributesImplApi21Parcelizer;
                iArr471[i845] = 0;
                Object[] objArr283 = this.onAddQueueItem;
                objArr283[i845 + 1] = objArr283[14];
                this.AudioAttributesImplApi21Parcelizer = i845 + 3;
                iArr471[i845 + 2] = 0;
                return 0;
            case 626:
                Object[] objArr284 = this.onAddQueueItem;
                int i846 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i846 + 1;
                objArr284[i846] = objArr284[14];
                int[] iArr472 = this.RatingCompat;
                Object obj242 = objArr284[i846];
                objArr284[i846] = null;
                iArr472[i846] = ((int[]) obj242).length;
                return 0;
            case 627:
                Object[] objArr285 = this.onAddQueueItem;
                int i847 = this.AudioAttributesImplApi21Parcelizer;
                objArr285[i847] = objArr285[12];
                this.RatingCompat[i847 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i847 + 3;
                objArr285[i847 + 2] = objArr285[17];
                return 0;
            case 628:
                int i848 = this.AudioAttributesImplApi21Parcelizer;
                int i849 = i848 - 1;
                this.AudioAttributesImplApi21Parcelizer = i849;
                int[] iArr473 = this.RatingCompat;
                Object[] objArr286 = this.onAddQueueItem;
                Object obj243 = objArr286[i848 - 2];
                objArr286[i848 - 2] = null;
                iArr473[i848 - 2] = ((int[]) obj243)[iArr473[i849]];
                return 0;
            case 629:
                int[] iArr474 = this.RatingCompat;
                int i850 = this.AudioAttributesImplApi21Parcelizer;
                iArr474[i850] = 16;
                this.AudioAttributesImplApi21Parcelizer = i850;
                iArr474[i850 - 1] = iArr474[i850 - 1] >> iArr474[i850];
                iArr474[i850 - 1] = (char) iArr474[i850 - 1];
                return 0;
            case 630:
                Object[] objArr287 = this.onAddQueueItem;
                int i851 = this.AudioAttributesImplApi21Parcelizer;
                objArr287[i851] = objArr287[12];
                int[] iArr475 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i851 + 2;
                iArr475[i851 + 1] = 1;
                return 0;
            case 631:
                int i852 = this.AudioAttributesImplApi21Parcelizer;
                int i853 = i852 - 1;
                this.AudioAttributesImplApi21Parcelizer = i853;
                int[] iArr476 = this.RatingCompat;
                Object[] objArr288 = this.onAddQueueItem;
                Object obj244 = objArr288[i852 - 2];
                objArr288[i852 - 2] = null;
                iArr476[i852 - 2] = ((int[]) obj244)[iArr476[i853]];
                iArr476[i852 - 2] = (char) iArr476[i852 - 2];
                int i854 = i852 - 4;
                this.AudioAttributesImplApi21Parcelizer = i854;
                Object obj245 = objArr288[i854];
                objArr288[i854] = null;
                ((char[]) obj245)[iArr476[i852 - 3]] = (char) iArr476[i852 - 2];
                return 0;
            case 632:
                Object[] objArr289 = this.onAddQueueItem;
                int i855 = this.AudioAttributesImplApi21Parcelizer;
                objArr289[i855] = objArr289[12];
                int[] iArr477 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i855 + 2;
                iArr477[i855 + 1] = 2;
                return 0;
            case 633:
                int i856 = this.AudioAttributesImplApi21Parcelizer;
                int i857 = i856 - 1;
                this.AudioAttributesImplApi21Parcelizer = i857;
                int[] iArr478 = this.RatingCompat;
                Object[] objArr290 = this.onAddQueueItem;
                Object obj246 = objArr290[i856 - 2];
                objArr290[i856 - 2] = null;
                iArr478[i856 - 2] = ((int[]) obj246)[iArr478[i857]];
                this.AudioAttributesImplApi21Parcelizer = i856;
                iArr478[i857] = 16;
                return 0;
            case 634:
                int[] iArr479 = this.RatingCompat;
                int i858 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i858 + 1;
                iArr479[i858] = 3;
                return 0;
            case 635:
                int[] iArr480 = this.RatingCompat;
                int i859 = this.AudioAttributesImplApi21Parcelizer;
                iArr480[i859 - 1] = (char) iArr480[i859 - 1];
                int i860 = i859 - 3;
                this.AudioAttributesImplApi21Parcelizer = i860;
                Object[] objArr291 = this.onAddQueueItem;
                Object obj247 = objArr291[i860];
                objArr291[i860] = null;
                ((char[]) obj247)[iArr480[i859 - 2]] = (char) iArr480[i859 - 1];
                return 0;
            case 636:
                Object[] objArr292 = this.onAddQueueItem;
                int i861 = this.AudioAttributesImplApi21Parcelizer;
                objArr292[i861] = objArr292[11];
                this.AudioAttributesImplApi21Parcelizer = i861 + 2;
                objArr292[i861 + 1] = objArr292[12];
                return 0;
            case 637:
                int i862 = this.AudioAttributesImplApi21Parcelizer;
                int i863 = i862 - 1;
                this.AudioAttributesImplApi21Parcelizer = i863;
                int[] iArr481 = this.RatingCompat;
                Object[] objArr293 = this.onAddQueueItem;
                Object obj248 = objArr293[i862 - 2];
                objArr293[i862 - 2] = null;
                iArr481[i862 - 2] = ((char[]) obj248)[iArr481[i863]];
                iArr481[i863] = 16;
                int i864 = i862 - 1;
                this.AudioAttributesImplApi21Parcelizer = i864;
                iArr481[i862 - 2] = iArr481[i862 - 2] << iArr481[i864];
                return 0;
            case 638:
                int[] iArr482 = this.RatingCompat;
                int i865 = this.AudioAttributesImplApi21Parcelizer;
                iArr482[i865] = 1;
                this.AudioAttributesImplApi21Parcelizer = i865;
                Object[] objArr294 = this.onAddQueueItem;
                Object obj249 = objArr294[i865 - 1];
                objArr294[i865 - 1] = null;
                iArr482[i865 - 1] = ((char[]) obj249)[iArr482[i865]];
                return 0;
            case 639:
                int i866 = this.AudioAttributesImplApi21Parcelizer;
                int i867 = i866 - 1;
                this.AudioAttributesImplApi21Parcelizer = i867;
                int[] iArr483 = this.RatingCompat;
                Object[] objArr295 = this.onAddQueueItem;
                Object obj250 = objArr295[i866 - 2];
                objArr295[i866 - 2] = null;
                iArr483[i866 - 2] = ((char[]) obj250)[iArr483[i867]];
                this.AudioAttributesImplApi21Parcelizer = i866;
                iArr483[i867] = 16;
                return 0;
            case 640:
                int i868 = this.AudioAttributesImplApi21Parcelizer;
                int i869 = i868 - 1;
                int[] iArr484 = this.RatingCompat;
                iArr484[i868 - 2] = iArr484[i868 - 2] << iArr484[i869];
                Object[] objArr296 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i868;
                objArr296[i869] = objArr296[12];
                return 0;
            case 641:
                int i870 = this.AudioAttributesImplApi21Parcelizer;
                int i871 = i870 - 1;
                this.AudioAttributesImplApi21Parcelizer = i871;
                int[] iArr485 = this.RatingCompat;
                Object[] objArr297 = this.onAddQueueItem;
                Object obj251 = objArr297[i870 - 2];
                objArr297[i870 - 2] = null;
                iArr485[i870 - 2] = ((char[]) obj251)[iArr485[i871]];
                int i872 = i870 - 2;
                this.AudioAttributesImplApi21Parcelizer = i872;
                iArr485[i870 - 3] = iArr485[i870 - 3] + iArr485[i872];
                return 0;
            case 642:
                Object[] objArr298 = this.onAddQueueItem;
                int i873 = this.AudioAttributesImplApi21Parcelizer;
                objArr298[i873] = objArr298[14];
                int[] iArr486 = this.RatingCompat;
                iArr486[i873 + 1] = iArr486[15];
                int i874 = i873 + 1;
                this.AudioAttributesImplApi21Parcelizer = i874;
                Object obj252 = objArr298[i873];
                objArr298[i873] = null;
                iArr486[i873] = ((int[]) obj252)[iArr486[i874]];
                return 0;
            case 643:
                int i875 = this.AudioAttributesImplApi21Parcelizer;
                int i876 = i875 - 1;
                int[] iArr487 = this.RatingCompat;
                iArr487[16] = iArr487[i876];
                Object[] objArr299 = this.onAddQueueItem;
                objArr299[i876] = objArr299[11];
                this.AudioAttributesImplApi21Parcelizer = i875 + 1;
                objArr299[i875] = objArr299[i875 - 1];
                return 0;
            case 644:
                int[] iArr488 = this.RatingCompat;
                iArr488[15] = iArr488[15] + 1;
                return 0;
            case 645:
                int i877 = this.AudioAttributesImplApi21Parcelizer;
                int i878 = i877 - 1;
                int[] iArr489 = this.RatingCompat;
                iArr489[15] = iArr489[i878];
                Object[] objArr300 = this.onAddQueueItem;
                objArr300[i878] = objArr300[11];
                this.AudioAttributesImplApi21Parcelizer = i877 + 1;
                objArr300[i877] = objArr300[i877 - 1];
                return 0;
            case 646:
                Object[] objArr301 = this.onAddQueueItem;
                int i879 = this.AudioAttributesImplApi21Parcelizer;
                objArr301[i879] = objArr301[11];
                int[] iArr490 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i879 + 2;
                iArr490[i879 + 1] = iArr490[15];
                return 0;
            case 647:
                Object[] objArr302 = this.onAddQueueItem;
                int i880 = this.AudioAttributesImplApi21Parcelizer;
                objArr302[i880] = objArr302[14];
                int[] iArr491 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i880 + 2;
                iArr491[i880 + 1] = 16;
                return 0;
            case 648:
                Object[] objArr303 = this.onAddQueueItem;
                int i881 = this.AudioAttributesImplApi21Parcelizer;
                objArr303[i881] = objArr303[14];
                int[] iArr492 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i881 + 2;
                iArr492[i881 + 1] = 17;
                return 0;
            case 649:
                int[] iArr493 = this.RatingCompat;
                int i882 = this.AudioAttributesImplApi21Parcelizer;
                iArr493[i882] = 1;
                Object[] objArr304 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i882 + 2;
                objArr304[i882 + 1] = objArr304[11];
                return 0;
            case 650:
                int[] iArr494 = this.RatingCompat;
                int i883 = this.AudioAttributesImplApi21Parcelizer;
                iArr494[i883] = 0;
                Object[] objArr305 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i883 + 2;
                objArr305[i883 + 1] = objArr305[11];
                return 0;
            case 651:
                int[] iArr495 = this.RatingCompat;
                int i884 = this.AudioAttributesImplApi21Parcelizer;
                iArr495[i884] = 16;
                this.AudioAttributesImplApi21Parcelizer = i884;
                iArr495[i884 - 1] = iArr495[i884 - 1] >>> iArr495[i884];
                iArr495[i884 - 1] = (char) iArr495[i884 - 1];
                return 0;
            case 652:
                int i885 = this.AudioAttributesImplApi21Parcelizer;
                int i886 = i885 - 3;
                this.AudioAttributesImplApi21Parcelizer = i886;
                Object[] objArr306 = this.onAddQueueItem;
                Object obj253 = objArr306[i886];
                objArr306[i886] = null;
                int[] iArr496 = this.RatingCompat;
                ((char[]) obj253)[iArr496[i885 - 2]] = (char) iArr496[i885 - 1];
                objArr306[i886] = objArr306[12];
                this.AudioAttributesImplApi21Parcelizer = i885 - 1;
                iArr496[i885 - 2] = 1;
                return 0;
            case 653:
                Object[] objArr307 = this.onAddQueueItem;
                int i887 = this.AudioAttributesImplApi21Parcelizer;
                objArr307[i887] = objArr307[12];
                this.RatingCompat[i887 + 1] = 2;
                this.AudioAttributesImplApi21Parcelizer = i887 + 3;
                objArr307[i887 + 2] = objArr307[11];
                return 0;
            case 654:
                int i888 = this.AudioAttributesImplApi21Parcelizer;
                int i889 = i888 - 1;
                this.AudioAttributesImplApi21Parcelizer = i889;
                int[] iArr497 = this.RatingCompat;
                iArr497[i888 - 2] = iArr497[i888 - 2] >>> iArr497[i889];
                return 0;
            case 655:
                int[] iArr498 = this.RatingCompat;
                int i890 = this.AudioAttributesImplApi21Parcelizer;
                iArr498[i890 - 1] = (char) iArr498[i890 - 1];
                int i891 = i890 - 3;
                this.AudioAttributesImplApi21Parcelizer = i891;
                Object[] objArr308 = this.onAddQueueItem;
                Object obj254 = objArr308[i891];
                objArr308[i891] = null;
                ((char[]) obj254)[iArr498[i890 - 2]] = (char) iArr498[i890 - 1];
                this.AudioAttributesImplApi21Parcelizer = i890 - 2;
                objArr308[i891] = objArr308[12];
                return 0;
            case 656:
                int[] iArr499 = this.RatingCompat;
                int i892 = this.AudioAttributesImplApi21Parcelizer;
                iArr499[i892] = 3;
                Object[] objArr309 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i892 + 2;
                objArr309[i892 + 1] = objArr309[11];
                return 0;
            case 657:
                int[] iArr500 = this.RatingCompat;
                int i893 = this.AudioAttributesImplApi21Parcelizer;
                iArr500[i893 - 1] = (char) iArr500[i893 - 1];
                int i894 = i893 - 3;
                this.AudioAttributesImplApi21Parcelizer = i894;
                Object[] objArr310 = this.onAddQueueItem;
                Object obj255 = objArr310[i894];
                objArr310[i894] = null;
                ((char[]) obj255)[iArr500[i893 - 2]] = (char) iArr500[i893 - 1];
                this.AudioAttributesImplApi21Parcelizer = i893 - 2;
                objArr310[i894] = objArr310[14];
                return 0;
            case 658:
                Object[] objArr311 = this.onAddQueueItem;
                int i895 = this.AudioAttributesImplApi21Parcelizer;
                objArr311[i895] = objArr311[13];
                this.AudioAttributesImplApi21Parcelizer = i895 + 2;
                objArr311[i895 + 1] = objArr311[11];
                return 0;
            case 659:
                int[] iArr501 = this.RatingCompat;
                int i896 = this.AudioAttributesImplApi21Parcelizer;
                iArr501[i896] = 0;
                this.AudioAttributesImplApi21Parcelizer = i896;
                Object[] objArr312 = this.onAddQueueItem;
                Object obj256 = objArr312[i896 - 1];
                objArr312[i896 - 1] = null;
                iArr501[i896 - 1] = ((char[]) obj256)[iArr501[i896]];
                return 0;
            case 660:
                int[] iArr502 = this.RatingCompat;
                int i897 = this.AudioAttributesImplApi21Parcelizer;
                iArr502[i897] = 1;
                this.AudioAttributesImplApi21Parcelizer = i897;
                iArr502[i897 - 1] = iArr502[i897 - 1] << iArr502[i897];
                return 0;
            case 661:
                int i898 = this.AudioAttributesImplApi21Parcelizer;
                int i899 = i898 - 3;
                this.AudioAttributesImplApi21Parcelizer = i899;
                Object[] objArr313 = this.onAddQueueItem;
                Object obj257 = objArr313[i899];
                objArr313[i899] = null;
                int[] iArr503 = this.RatingCompat;
                ((char[]) obj257)[iArr503[i898 - 2]] = (char) iArr503[i898 - 1];
                objArr313[i899] = objArr313[13];
                this.AudioAttributesImplApi21Parcelizer = i898 - 1;
                objArr313[i898 - 2] = objArr313[11];
                return 0;
            case 662:
                int i900 = this.AudioAttributesImplApi21Parcelizer;
                int i901 = i900 - 1;
                this.AudioAttributesImplApi21Parcelizer = i901;
                int[] iArr504 = this.RatingCompat;
                iArr504[i900 - 2] = iArr504[i900 - 2] << iArr504[i901];
                return 0;
            case 663:
                int i902 = this.AudioAttributesImplApi21Parcelizer;
                int i903 = i902 - 1;
                this.AudioAttributesImplApi21Parcelizer = i903;
                int[] iArr505 = this.RatingCompat;
                Object[] objArr314 = this.onAddQueueItem;
                Object obj258 = objArr314[i902 - 2];
                objArr314[i902 - 2] = null;
                iArr505[i902 - 2] = ((char[]) obj258)[iArr505[i903]];
                int i904 = i902 - 4;
                this.AudioAttributesImplApi21Parcelizer = i904;
                Object obj259 = objArr314[i904];
                objArr314[i904] = null;
                ((char[]) obj259)[iArr505[i902 - 3]] = (char) iArr505[i902 - 2];
                this.AudioAttributesImplApi21Parcelizer = i902 - 3;
                objArr314[i904] = objArr314[13];
                return 0;
            case 664:
                int[] iArr506 = this.RatingCompat;
                int i905 = this.AudioAttributesImplApi21Parcelizer;
                iArr506[i905] = 1;
                iArr506[i905 - 1] = iArr506[i905 - 1] << iArr506[i905];
                this.AudioAttributesImplApi21Parcelizer = i905 + 1;
                iArr506[i905] = 3;
                return 0;
            case 665:
                int i906 = this.AudioAttributesImplApi21Parcelizer;
                int i907 = i906 - 1;
                int[] iArr507 = this.RatingCompat;
                iArr507[i906 - 2] = iArr507[i906 - 2] + iArr507[i907];
                Object[] objArr315 = this.onAddQueueItem;
                this.AudioAttributesImplApi21Parcelizer = i906;
                objArr315[i907] = objArr315[12];
                return 0;
            case 666:
                int i908 = this.AudioAttributesImplApi21Parcelizer;
                int i909 = i908 - 1;
                this.AudioAttributesImplApi21Parcelizer = i909;
                int[] iArr508 = this.RatingCompat;
                Object[] objArr316 = this.onAddQueueItem;
                Object obj260 = objArr316[i908 - 2];
                objArr316[i908 - 2] = null;
                iArr508[i908 - 2] = ((char[]) obj260)[iArr508[i909]];
                int i910 = i908 - 4;
                this.AudioAttributesImplApi21Parcelizer = i910;
                Object obj261 = objArr316[i910];
                objArr316[i910] = null;
                ((char[]) obj261)[iArr508[i908 - 3]] = (char) iArr508[i908 - 2];
                return 0;
            case 667:
                Object[] objArr317 = this.onAddQueueItem;
                int i911 = this.AudioAttributesImplApi21Parcelizer;
                objArr317[i911] = objArr317[13];
                int[] iArr509 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i911 + 2;
                iArr509[i911 + 1] = 0;
                return 0;
            case 668:
                Object[] objArr318 = this.onAddQueueItem;
                int i912 = this.AudioAttributesImplApi21Parcelizer;
                objArr318[i912] = objArr318[14];
                this.AudioAttributesImplApi21Parcelizer = i912;
                Object obj262 = objArr318[i912];
                objArr318[i912] = null;
                objArr318[17] = obj262;
                return 0;
            case 669:
                int[] iArr510 = this.RatingCompat;
                int i913 = this.AudioAttributesImplApi21Parcelizer;
                iArr510[i913] = iArr510[11];
                this.AudioAttributesImplApi21Parcelizer = i913;
                iArr510[14] = iArr510[i913];
                return 0;
            case 670:
                int[] iArr511 = this.RatingCompat;
                int i914 = this.AudioAttributesImplApi21Parcelizer;
                iArr511[i914] = iArr511[13];
                this.AudioAttributesImplApi21Parcelizer = i914;
                iArr511[16] = iArr511[i914];
                return 0;
            case 671:
                int i915 = this.AudioAttributesImplApi21Parcelizer;
                int i916 = i915 - 1;
                Object[] objArr319 = this.onAddQueueItem;
                Object obj263 = objArr319[i916];
                objArr319[i916] = null;
                objArr319[11] = obj263;
                int[] iArr512 = this.RatingCompat;
                this.AudioAttributesImplApi21Parcelizer = i915;
                iArr512[i916] = iArr512[16];
                return 0;
            case 672:
                Object[] objArr320 = this.onAddQueueItem;
                int i917 = this.AudioAttributesImplApi21Parcelizer;
                objArr320[i917 - 1] = new long[this.RatingCompat[i917 - 1]];
                int i918 = i917 - 1;
                Object obj264 = objArr320[i918];
                objArr320[i918] = null;
                objArr320[12] = obj264;
                this.AudioAttributesImplApi21Parcelizer = i917;
                objArr320[i918] = objArr320[11];
                return 0;
            case 673:
                int i919 = this.AudioAttributesImplApi21Parcelizer;
                int i920 = i919 - 1;
                this.AudioAttributesImplApi21Parcelizer = i920;
                int[] iArr513 = this.RatingCompat;
                Object[] objArr321 = this.onAddQueueItem;
                Object obj265 = objArr321[i919 - 2];
                objArr321[i919 - 2] = null;
                iArr513[i919 - 2] = ((char[]) obj265)[iArr513[i920]];
                this.MediaBrowserCompatMediaItem[i919 - 2] = iArr513[i919 - 2];
                return 0;
            case 674:
                int i921 = this.AudioAttributesImplApi21Parcelizer;
                int i922 = i921 - 1;
                this.AudioAttributesImplApi21Parcelizer = i922;
                long[] jArr15 = this.MediaBrowserCompatMediaItem;
                jArr15[i921 - 2] = jArr15[i921 - 2] - jArr15[i922];
                this.RatingCompat[i921 - 2] = (int) jArr15[i921 - 2];
                return 0;
            case 675:
                long[] jArr16 = this.MediaBrowserCompatMediaItem;
                int i923 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr514 = this.RatingCompat;
                jArr16[i923 - 1] = iArr514[i923 - 1];
                this.AudioAttributesImplApi21Parcelizer = i923 + 1;
                iArr514[i923] = iArr514[13];
                jArr16[i923] = iArr514[i923];
                return 0;
            case 676:
                int i924 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr17 = this.MediaBrowserCompatMediaItem;
                jArr17[i924 - 2] = jArr17[i924 - 2] - jArr17[i924 - 1];
                jArr17[i924 - 3] = jArr17[i924 - 3] * jArr17[i924 - 2];
                int i925 = i924 - 3;
                this.AudioAttributesImplApi21Parcelizer = i925;
                jArr17[i924 - 4] = jArr17[i925] ^ jArr17[i924 - 4];
                return 0;
            case 677:
                int i926 = this.AudioAttributesImplApi21Parcelizer;
                int i927 = i926 - 3;
                this.AudioAttributesImplApi21Parcelizer = i927;
                Object[] objArr322 = this.onAddQueueItem;
                Object obj266 = objArr322[i927];
                objArr322[i927] = null;
                ((long[]) obj266)[this.RatingCompat[i926 - 2]] = this.MediaBrowserCompatMediaItem[i926 - 1];
                return 0;
            case 678:
                Object[] objArr323 = this.onAddQueueItem;
                int i928 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i928 + 1;
                objArr323[i928] = objArr323[12];
                int[] iArr515 = this.RatingCompat;
                Object obj267 = objArr323[i928];
                objArr323[i928] = null;
                iArr515[i928] = ((long[]) obj267).length;
                objArr323[i928] = new char[iArr515[i928]];
                return 0;
            case 679:
                int i929 = this.AudioAttributesImplApi21Parcelizer;
                int i930 = i929 - 1;
                Object[] objArr324 = this.onAddQueueItem;
                Object obj268 = objArr324[i930];
                objArr324[i930] = null;
                objArr324[13] = obj268;
                this.AudioAttributesImplApi21Parcelizer = i929;
                objArr324[i930] = objArr324[11];
                return 0;
            case 680:
                int i931 = this.AudioAttributesImplApi21Parcelizer;
                int i932 = i931 - 1;
                this.AudioAttributesImplApi21Parcelizer = i932;
                Object[] objArr325 = this.onAddQueueItem;
                Object obj269 = objArr325[i931 - 2];
                objArr325[i931 - 2] = null;
                this.MediaBrowserCompatMediaItem[i931 - 2] = ((long[]) obj269)[this.RatingCompat[i932]];
                return 0;
            case 681:
                int[] iArr516 = this.RatingCompat;
                int i933 = this.AudioAttributesImplApi21Parcelizer;
                iArr516[i933 - 1] = (int) this.MediaBrowserCompatMediaItem[i933 - 1];
                iArr516[i933 - 1] = (char) iArr516[i933 - 1];
                return 0;
            case 682:
                int[] iArr517 = this.RatingCompat;
                int i934 = this.AudioAttributesImplApi21Parcelizer;
                iArr517[i934] = 115;
                iArr517[i934 - 1] = iArr517[i934 - 1] + iArr517[i934];
                this.AudioAttributesImplApi21Parcelizer = i934 + 1;
                iArr517[i934] = iArr517[i934 - 1];
                return 0;
            case 683:
                int[] iArr518 = this.RatingCompat;
                int i935 = this.AudioAttributesImplApi21Parcelizer;
                iArr518[i935] = 83;
                iArr518[i935 - 1] = iArr518[i935 - 1] + iArr518[i935];
                this.AudioAttributesImplApi21Parcelizer = i935 + 1;
                iArr518[i935] = iArr518[i935 - 1];
                return 0;
            case 684:
                int[] iArr519 = this.RatingCompat;
                int i936 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i936 + 1;
                iArr519[i936] = 64;
                return 0;
            case 685:
                int[] iArr520 = this.RatingCompat;
                int i937 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i937 + 1;
                iArr520[i937] = 74;
                return 0;
            default:
                return i;
        }
    }

    public filterRequirements(Object obj, int i) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        iArr[14] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        objArr[13] = obj3;
        objArr[14] = obj4;
        iArr[15] = i;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(Object obj, Object obj2) {
        this.RatingCompat = new int[26];
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(Object obj) {
        this.RatingCompat = new int[26];
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements() {
        this.RatingCompat = new int[26];
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        this.onAddQueueItem = new Object[26];
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(int i, int i2, Object obj, Object obj2) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        iArr[11] = i;
        iArr[12] = i2;
        objArr[13] = obj;
        objArr[14] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(Object obj, int i, Object obj2) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        objArr[11] = obj;
        iArr[12] = i;
        objArr[13] = obj2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }

    public filterRequirements(int i, int i2, int i3, Object obj) {
        int[] iArr = new int[26];
        this.RatingCompat = iArr;
        this.MediaBrowserCompatMediaItem = new long[26];
        this.MediaMetadataCompat = new float[26];
        this.MediaBrowserCompatSearchResultReceiver = new double[26];
        Object[] objArr = new Object[26];
        this.onAddQueueItem = objArr;
        iArr[11] = i;
        iArr[12] = i2;
        iArr[13] = i3;
        objArr[14] = obj;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaDescriptionCompat = -1;
    }
}
