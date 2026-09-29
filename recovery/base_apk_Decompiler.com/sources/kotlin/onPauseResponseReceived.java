package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class onPauseResponseReceived {
    public float AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    public float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    public Object MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final long[] MediaMetadataCompat;
    private final Object[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public long write;
    private final int[] MediaDescriptionCompat = new int[12];
    private final float[] MediaBrowserCompatMediaItem = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public onPauseResponseReceived(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.MediaMetadataCompat = jArr;
        Object[] objArr = new Object[12];
        this.RatingCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaMetadataCompat;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplBaseParcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.MediaDescriptionCompat;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i3 + 1;
                iArr[i3] = 32;
                return 0;
            case 3:
                int i4 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr2 = this.MediaMetadataCompat;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.MediaDescriptionCompat[i4 - 1];
                jArr2[i4 - 3] = jArr2[i4 - 3] ^ jArr2[i4 - 2];
                int i5 = i4 - 3;
                this.AudioAttributesImplBaseParcelizer = i5;
                jArr2[8] = jArr2[i5];
                return 0;
            case 4:
                int[] iArr2 = this.MediaDescriptionCompat;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                iArr2[i6] = 10909;
                iArr2[i6 + 1] = 0;
                this.AudioAttributesImplBaseParcelizer = i6 + 3;
                iArr2[i6 + 2] = 0;
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplBaseParcelizer - this.read;
                this.AudioAttributesImplBaseParcelizer = i7;
                this.MediaBrowserCompatItemReceiver = i7;
                return 0;
            case 6:
                int[] iArr3 = this.MediaDescriptionCompat;
                int i8 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i8 + 1;
                this.IconCompatParcelizer = iArr3[i8];
                return 0;
            case 7:
                long[] jArr3 = this.MediaMetadataCompat;
                int i9 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i9 + 1;
                jArr3[i9] = this.RemoteActionCompatParcelizer;
                return 0;
            case 8:
                long[] jArr4 = this.MediaMetadataCompat;
                int i10 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10 + 1;
                jArr4[i10] = 0;
                return 0;
            case 9:
                int i11 = this.AudioAttributesImplBaseParcelizer;
                int[] iArr4 = this.MediaDescriptionCompat;
                long[] jArr5 = this.MediaMetadataCompat;
                iArr4[i11 - 2] = (jArr5[i11 - 2] > jArr5[i11 - 1] ? 1 : (jArr5[i11 - 2] == jArr5[i11 - 1] ? 0 : -1));
                int i12 = i11 - 2;
                this.AudioAttributesImplBaseParcelizer = i12;
                iArr4[i11 - 3] = iArr4[i11 - 3] + iArr4[i12];
                iArr4[i11 - 3] = (char) iArr4[i11 - 3];
                return 0;
            case 10:
                int[] iArr5 = this.MediaDescriptionCompat;
                int i13 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i13 + 1;
                iArr5[i13] = 1;
                return 0;
            case 11:
                int[] iArr6 = this.MediaDescriptionCompat;
                int i14 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i14 + 1;
                iArr6[i14] = 0;
                return 0;
            case 12:
                int[] iArr7 = this.MediaDescriptionCompat;
                int i15 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i15 + 1;
                iArr7[i15] = this.read;
                return 0;
            case 13:
                int i16 = this.AudioAttributesImplBaseParcelizer;
                int i17 = i16 - 1;
                this.AudioAttributesImplBaseParcelizer = i17;
                int[] iArr8 = this.MediaDescriptionCompat;
                iArr8[i16 - 2] = iArr8[i16 - 2] - iArr8[i17];
                return 0;
            case 14:
                float[] fArr = this.MediaBrowserCompatMediaItem;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i18 + 1;
                fArr[i18] = 0.0f;
                return 0;
            case 15:
                float[] fArr2 = this.MediaBrowserCompatMediaItem;
                int i19 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i19 + 1;
                this.AudioAttributesImplApi26Parcelizer = fArr2[i19];
                return 0;
            case 16:
                float[] fArr3 = this.MediaBrowserCompatMediaItem;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i20 + 1;
                fArr3[i20] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 17:
                Object[] objArr = this.RatingCompat;
                int i21 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i21 + 1;
                objArr[i21] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 18:
                int i22 = this.AudioAttributesImplBaseParcelizer;
                int i23 = i22 - 1;
                this.AudioAttributesImplBaseParcelizer = i23;
                float[] fArr4 = this.MediaBrowserCompatMediaItem;
                this.MediaDescriptionCompat[i22 - 2] = (fArr4[i22 - 2] > fArr4[i23] ? 1 : (fArr4[i22 - 2] == fArr4[i23] ? 0 : -1));
                return 0;
            case 19:
                long[] jArr6 = this.MediaMetadataCompat;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i24 + 1;
                jArr6[i24] = jArr6[8];
                return 0;
            case 20:
                Object[] objArr2 = this.RatingCompat;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                Object obj = objArr2[i25];
                objArr2[i25] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj;
                return 0;
            case 21:
                Object[] objArr3 = this.RatingCompat;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i26 + 1;
                objArr3[i26] = objArr3[i26 - 1];
                return 0;
            case 22:
                int i27 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i27;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i27];
                objArr4[i27] = null;
                this.IconCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 23:
                Object[] objArr5 = this.RatingCompat;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i28 - 1];
                objArr5[i28 - 1] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj3;
                return 0;
            case 24:
                Object[] objArr6 = this.RatingCompat;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                Object obj4 = objArr6[i29 - 1];
                objArr6[i29 - 1] = null;
                Object obj5 = objArr6[i29 - 2];
                objArr6[i29 - 2] = null;
                objArr6[i29 - 1] = obj5;
                objArr6[i29 - 2] = obj4;
                int i30 = i29 - 1;
                this.AudioAttributesImplBaseParcelizer = i30;
                objArr6[i30] = null;
                return 0;
            case 25:
                int i31 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i31;
                this.RatingCompat[i31] = null;
                return 0;
            case 26:
                int[] iArr9 = this.MediaDescriptionCompat;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i32 + 1;
                iArr9[i32] = 2;
                return 0;
            case 27:
                long[] jArr7 = this.MediaMetadataCompat;
                int i33 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i33 + 1;
                this.write = jArr7[i33];
                return 0;
            case 28:
                Object[] objArr7 = this.RatingCompat;
                int i34 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i34 - 1];
                objArr7[i34 - 1] = null;
                objArr7[i34] = obj6;
                long[] jArr8 = this.MediaMetadataCompat;
                jArr8[i34 - 1] = jArr8[i34 - 2];
                objArr7[i34 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i34;
                objArr7[i34] = null;
                return 0;
            case 29:
                Object[] objArr8 = this.RatingCompat;
                int i35 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i35 - 1];
                objArr8[i35 - 1] = null;
                Object obj8 = objArr8[i35 - 2];
                objArr8[i35 - 2] = null;
                objArr8[i35 - 1] = obj8;
                objArr8[i35 - 2] = obj7;
                return 0;
            case 30:
                Object[] objArr9 = this.RatingCompat;
                int i36 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i36 + 1;
                Object obj9 = objArr9[i36 - 1];
                objArr9[i36 - 1] = null;
                objArr9[i36] = obj9;
                Object obj10 = objArr9[i36 - 2];
                objArr9[i36 - 2] = null;
                objArr9[i36 - 1] = obj10;
                objArr9[i36 - 2] = obj9;
                Object obj11 = objArr9[i36];
                objArr9[i36] = null;
                Object obj12 = objArr9[i36 - 1];
                objArr9[i36 - 1] = null;
                objArr9[i36] = obj12;
                objArr9[i36 - 1] = obj11;
                return 0;
            case 31:
                Object[] objArr10 = this.RatingCompat;
                int i37 = this.AudioAttributesImplBaseParcelizer;
                Object obj13 = objArr10[i37 - 2];
                objArr10[i37 - 2] = null;
                objArr10[i37 - 1] = obj13;
                int[] iArr10 = this.MediaDescriptionCompat;
                iArr10[i37 - 2] = iArr10[i37 - 1];
                return 0;
            case 32:
                int i38 = this.AudioAttributesImplBaseParcelizer;
                int i39 = i38 - 3;
                this.AudioAttributesImplBaseParcelizer = i39;
                Object[] objArr11 = this.RatingCompat;
                Object obj14 = objArr11[i39];
                objArr11[i39] = null;
                int i40 = this.MediaDescriptionCompat[i38 - 2];
                Object obj15 = objArr11[i38 - 1];
                objArr11[i38 - 1] = null;
                ((Object[]) obj14)[i40] = obj15;
                this.AudioAttributesImplBaseParcelizer = i38 - 2;
                Object obj16 = objArr11[i38 - 4];
                objArr11[i38 - 4] = null;
                objArr11[i39] = obj16;
                Object obj17 = objArr11[i38 - 5];
                objArr11[i38 - 5] = null;
                objArr11[i38 - 4] = obj17;
                objArr11[i38 - 5] = obj16;
                return 0;
            case 33:
                Object[] objArr12 = this.RatingCompat;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                Object obj18 = objArr12[i41 - 1];
                objArr12[i41 - 1] = null;
                Object obj19 = objArr12[i41 - 2];
                objArr12[i41 - 2] = null;
                objArr12[i41 - 1] = obj19;
                objArr12[i41 - 2] = obj18;
                int[] iArr11 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i41 + 1;
                iArr11[i41] = 0;
                return 0;
            case 34:
                int i42 = this.AudioAttributesImplBaseParcelizer;
                int i43 = i42 - 3;
                this.AudioAttributesImplBaseParcelizer = i43;
                Object[] objArr13 = this.RatingCompat;
                Object obj20 = objArr13[i43];
                objArr13[i43] = null;
                int i44 = this.MediaDescriptionCompat[i42 - 2];
                Object obj21 = objArr13[i42 - 1];
                objArr13[i42 - 1] = null;
                ((Object[]) obj20)[i44] = obj21;
                return 0;
            case 35:
                Object[] objArr14 = this.RatingCompat;
                int i45 = this.AudioAttributesImplBaseParcelizer;
                objArr14[i45] = objArr14[i45 - 1];
                int[] iArr12 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i45 + 2;
                iArr12[i45 + 1] = 0;
                return 0;
            case 36:
                Object[] objArr15 = this.RatingCompat;
                int i46 = this.AudioAttributesImplBaseParcelizer;
                objArr15[i46] = objArr15[i46 - 1];
                int[] iArr13 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = i46 + 2;
                iArr13[i46 + 1] = 1;
                return 0;
            case 37:
                Object[] objArr16 = this.RatingCompat;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                Object obj22 = objArr16[i47 - 1];
                objArr16[i47 - 1] = null;
                Object obj23 = objArr16[i47 - 2];
                objArr16[i47 - 2] = null;
                objArr16[i47 - 1] = obj23;
                objArr16[i47 - 2] = obj22;
                this.AudioAttributesImplBaseParcelizer = i47 + 1;
                objArr16[i47] = null;
                Object obj24 = objArr16[i47];
                objArr16[i47] = null;
                Object obj25 = objArr16[i47 - 1];
                objArr16[i47 - 1] = null;
                objArr16[i47] = obj25;
                objArr16[i47 - 1] = obj24;
                return 0;
            case 38:
                int[] iArr14 = this.MediaDescriptionCompat;
                int i48 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i48] = 2;
                iArr14[i48 + 1] = 2;
                int i49 = i48 + 1;
                this.AudioAttributesImplBaseParcelizer = i49;
                iArr14[i48] = iArr14[i48] % iArr14[i49];
                return 0;
            case 40:
                int[] iArr15 = this.MediaDescriptionCompat;
                int i50 = this.AudioAttributesImplBaseParcelizer;
                iArr15[i50] = 87;
                this.AudioAttributesImplBaseParcelizer = i50;
                iArr15[i50 - 1] = iArr15[i50 - 1] + iArr15[i50];
            case 39:
                return 0;
            case 41:
                int[] iArr16 = this.MediaDescriptionCompat;
                int i51 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i51] = iArr16[i51 - 1];
                iArr16[i51 + 1] = 128;
                int i52 = i51 + 1;
                this.AudioAttributesImplBaseParcelizer = i52;
                iArr16[i51] = iArr16[i51] % iArr16[i52];
                return 0;
            case 42:
                int i53 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i53;
                this.IconCompatParcelizer = this.MediaDescriptionCompat[i53] != 0 ? 0 : 1;
                return 0;
            case 43:
                int i54 = this.AudioAttributesImplBaseParcelizer;
                int i55 = i54 - 1;
                this.AudioAttributesImplBaseParcelizer = i55;
                int[] iArr17 = this.MediaDescriptionCompat;
                iArr17[i54 - 2] = iArr17[i54 - 2] % iArr17[i55];
                return 0;
            case 44:
                int[] iArr18 = this.MediaDescriptionCompat;
                int i56 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i56 + 1;
                iArr18[i56] = 95;
                return 0;
            case 45:
                int i57 = this.AudioAttributesImplBaseParcelizer;
                int i58 = i57 - 1;
                int[] iArr19 = this.MediaDescriptionCompat;
                iArr19[i57 - 2] = iArr19[i57 - 2] + iArr19[i58];
                iArr19[i58] = iArr19[i57 - 2];
                this.AudioAttributesImplBaseParcelizer = i57 + 1;
                iArr19[i57] = 128;
                return 0;
            case 46:
                for (int i59 = this.AudioAttributesImplBaseParcelizer - 1; i59 >= 0; i59--) {
                    this.RatingCompat[i59] = null;
                }
                Object[] objArr17 = this.RatingCompat;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr17[0] = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            default:
                return i;
        }
    }
}
