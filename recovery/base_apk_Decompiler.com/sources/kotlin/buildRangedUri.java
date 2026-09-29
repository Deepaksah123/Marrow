package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class buildRangedUri {
    private int AudioAttributesCompatParcelizer;
    private final int[] AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final double[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object write;

    public buildRangedUri() {
        this.AudioAttributesImplApi21Parcelizer = new int[4];
        this.AudioAttributesImplBaseParcelizer = new long[4];
        this.AudioAttributesImplApi26Parcelizer = new float[4];
        this.MediaBrowserCompatItemReceiver = new double[4];
        this.MediaMetadataCompat = new Object[4];
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaMetadataCompat;
                int i2 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i2 + 1;
                objArr[i2] = this.IconCompatParcelizer;
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i3 = this.AudioAttributesCompatParcelizer;
                iArr[i3] = 2;
                iArr[i3 + 1] = 2;
                int i4 = i3 + 1;
                this.AudioAttributesCompatParcelizer = i4;
                iArr[i3] = iArr[i3] % iArr[i4];
                return 0;
            case 3:
                int i5 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i5;
                this.MediaMetadataCompat[i5] = null;
                return 0;
            case 4:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i6 = this.AudioAttributesCompatParcelizer;
                Object obj = objArr2[i6 - 1];
                objArr2[i6 - 1] = null;
                this.write = obj;
                return 0;
            case 6:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i7 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i7 + 1;
                iArr2[i7] = this.read;
            case 5:
                return 0;
            case 7:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i8 + 1;
                iArr3[i8] = 59;
                return 0;
            case 8:
                int i9 = this.AudioAttributesCompatParcelizer;
                int i10 = i9 - 1;
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                iArr4[i9 - 2] = iArr4[i9 - 2] + iArr4[i10];
                iArr4[i10] = iArr4[i9 - 2];
                this.AudioAttributesCompatParcelizer = i9 + 1;
                iArr4[i9] = 128;
                return 0;
            case 9:
                int i11 = this.AudioAttributesCompatParcelizer;
                int i12 = i11 - 1;
                this.AudioAttributesCompatParcelizer = i12;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i11 - 2] = iArr5[i11 - 2] % iArr5[i12];
                return 0;
            case 10:
                int i13 = this.AudioAttributesCompatParcelizer - this.read;
                this.AudioAttributesCompatParcelizer = i13;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                return 0;
            case 11:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                this.RemoteActionCompatParcelizer = iArr6[i14];
                return 0;
            case 12:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.AudioAttributesCompatParcelizer;
                iArr7[i15] = 2;
                this.AudioAttributesCompatParcelizer = i15;
                iArr7[i15 - 1] = iArr7[i15 - 1] % iArr7[i15];
                return 0;
            case 13:
                int i16 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i16;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i16] == 0 ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i17 + 1;
                Object obj2 = objArr3[i17];
                objArr3[i17] = null;
                this.write = obj2;
                return 0;
            case 15:
                Object[] objArr4 = this.MediaMetadataCompat;
                int i18 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i18 + 1;
                objArr4[i18] = null;
                return 0;
            case 16:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i19;
                this.RemoteActionCompatParcelizer = iArr8[i19];
                return 0;
            case 17:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i20 + 1;
                iArr9[i20] = 81;
                return 0;
            case 18:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i21 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i21 + 1;
                iArr10[i21] = 1;
                return 0;
            case 19:
                for (int i22 = this.AudioAttributesCompatParcelizer - 1; i22 >= 0; i22--) {
                    this.MediaMetadataCompat[i22] = null;
                }
                Object[] objArr5 = this.MediaMetadataCompat;
                this.AudioAttributesCompatParcelizer = 1;
                objArr5[0] = this.IconCompatParcelizer;
                return 0;
            case 20:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i23 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i23 + 1;
                objArr6[i23] = objArr6[3];
                return 0;
            case 21:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i24 + 1;
                iArr11[i24] = 2;
                return 0;
            case 22:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.AudioAttributesCompatParcelizer;
                iArr12[i25] = 2;
                this.AudioAttributesCompatParcelizer = i25;
                iArr12[i25 - 1] = iArr12[i25 - 1] % iArr12[i25];
                int i26 = i25 - 1;
                this.AudioAttributesCompatParcelizer = i26;
                this.MediaMetadataCompat[i26] = null;
                return 0;
            case 23:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i27 = this.AudioAttributesCompatParcelizer;
                iArr13[i27] = 105;
                this.AudioAttributesCompatParcelizer = i27;
                iArr13[i27 - 1] = iArr13[i27 - 1] + iArr13[i27];
                return 0;
            case 24:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i28 = this.AudioAttributesCompatParcelizer;
                iArr14[i28] = iArr14[i28 - 1];
                this.AudioAttributesCompatParcelizer = i28 + 2;
                iArr14[i28 + 1] = 128;
                return 0;
            case 25:
                int i29 = this.AudioAttributesCompatParcelizer - 1;
                this.AudioAttributesCompatParcelizer = i29;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i29] != 0 ? 0 : 1;
                return 0;
            case 26:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i30 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i30 + 1;
                iArr15[i30] = 1;
                return 0;
            case 27:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i31 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i31 + 1;
                iArr16[i31] = 0;
                return 0;
            case 28:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i32 = this.AudioAttributesCompatParcelizer;
                iArr17[i32] = 2;
                this.AudioAttributesCompatParcelizer = i32 + 2;
                iArr17[i32 + 1] = 2;
                return 0;
            case 29:
                int i33 = this.AudioAttributesCompatParcelizer;
                int i34 = i33 - 1;
                this.AudioAttributesCompatParcelizer = i34;
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i33 - 2] = iArr18[i33 - 2] % iArr18[i34];
                int i35 = i33 - 2;
                this.AudioAttributesCompatParcelizer = i35;
                this.MediaMetadataCompat[i35] = null;
                return 0;
            case 30:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i36 + 1;
                iArr19[i36] = 87;
                return 0;
            case 31:
                int i37 = this.AudioAttributesCompatParcelizer;
                int i38 = i37 - 1;
                this.AudioAttributesCompatParcelizer = i38;
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i37 - 2] = iArr20[i37 - 2] + iArr20[i38];
                return 0;
            case 32:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i39 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i39 + 1;
                iArr21[i39] = iArr21[i39 - 1];
                return 0;
            case 33:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i40 = this.AudioAttributesCompatParcelizer;
                iArr22[i40] = 128;
                this.AudioAttributesCompatParcelizer = i40;
                iArr22[i40 - 1] = iArr22[i40 - 1] % iArr22[i40];
                return 0;
            case 34:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i41 + 1;
                iArr23[i41] = 10;
                return 0;
            case 35:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = i42 + 1;
                iArr24[i42] = 63;
                return 0;
            default:
                return i;
        }
    }

    public buildRangedUri(Object obj) {
        this.AudioAttributesImplApi21Parcelizer = new int[4];
        this.AudioAttributesImplBaseParcelizer = new long[4];
        this.AudioAttributesImplApi26Parcelizer = new float[4];
        this.MediaBrowserCompatItemReceiver = new double[4];
        Object[] objArr = new Object[4];
        this.MediaMetadataCompat = objArr;
        objArr[3] = obj;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }
}
