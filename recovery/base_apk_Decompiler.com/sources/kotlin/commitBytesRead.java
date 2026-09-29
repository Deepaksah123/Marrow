package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class commitBytesRead {
    public int AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public long read;
    public long write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] MediaBrowserCompatSearchResultReceiver = new float[12];
    private final double[] RatingCompat = new double[12];

    public commitBytesRead(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.AudioAttributesImplApi26Parcelizer;
                jArr[i2] = jArr[8];
                jArr[i2 + 1] = jArr[10];
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi26Parcelizer = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplApi26Parcelizer;
                int i4 = i3 - 1;
                this.AudioAttributesImplApi26Parcelizer = i4;
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.MediaBrowserCompatItemReceiver[i4];
                return 0;
            case 3:
                int i5 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i5 - 2] = jArr3[i5 - 2] ^ jArr3[i5 - 1];
                int i6 = i5 - 2;
                this.AudioAttributesImplApi26Parcelizer = i6;
                jArr3[8] = jArr3[i6];
                return 0;
            case 4:
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                int i7 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i7 + 1;
                jArr4[i7] = this.write;
                return 0;
            case 5:
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i8 + 1;
                iArr2[i8] = -1;
                return 0;
            case 6:
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                int i9 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i9 + 1;
                jArr5[i9] = 0;
                return 0;
            case 7:
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                iArr3[i10 - 2] = (jArr6[i10 - 2] > jArr6[i10 - 1] ? 1 : (jArr6[i10 - 2] == jArr6[i10 - 1] ? 0 : -1));
                int i11 = i10 - 2;
                this.AudioAttributesImplApi26Parcelizer = i11;
                iArr3[i10 - 3] = iArr3[i10 - 3] + iArr3[i11];
                return 0;
            case 8:
                Object[] objArr = this.MediaMetadataCompat;
                int i12 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i12 + 1;
                objArr[i12] = this.RemoteActionCompatParcelizer;
                return 0;
            case 9:
                int i13 = this.AudioAttributesImplApi26Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i13;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                return 0;
            case 10:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                this.AudioAttributesCompatParcelizer = iArr4[i14];
                return 0;
            case 11:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.AudioAttributesImplApi21Parcelizer = obj;
                return 0;
            case 12:
                long[] jArr7 = this.AudioAttributesImplBaseParcelizer;
                int i16 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i16 + 1;
                jArr7[i16] = jArr7[8];
                return 0;
            case 13:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i17 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 14:
                int i18 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i18;
                Object[] objArr4 = this.MediaMetadataCompat;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.AudioAttributesCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i19 = this.AudioAttributesImplApi26Parcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                Object obj4 = objArr5[i19 - 2];
                objArr5[i19 - 2] = null;
                objArr5[i19 - 1] = obj4;
                objArr5[i19 - 2] = obj3;
                return 0;
            case 16:
                int i20 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i20;
                this.MediaMetadataCompat[i20] = null;
                return 0;
            case 17:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i21 = this.AudioAttributesImplApi26Parcelizer;
                Object obj5 = objArr6[i21 - 1];
                objArr6[i21 - 1] = null;
                this.AudioAttributesImplApi21Parcelizer = obj5;
                return 0;
            case 18:
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                int i22 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i22 + 1;
                iArr5[i22] = 2;
                return 0;
            case 19:
                long[] jArr8 = this.AudioAttributesImplBaseParcelizer;
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i23 + 1;
                this.read = jArr8[i23];
                return 0;
            case 20:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i24 = this.AudioAttributesImplApi26Parcelizer;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr9 = this.AudioAttributesImplBaseParcelizer;
                jArr9[i24 - 1] = jArr9[i24 - 2];
                objArr7[i24 - 2] = obj6;
                this.AudioAttributesImplApi26Parcelizer = i24;
                objArr7[i24] = null;
                return 0;
            case 21:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i25 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i25 + 1;
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj7;
                Object obj8 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj8;
                objArr8[i25 - 2] = obj7;
                Object obj9 = objArr8[i25];
                objArr8[i25] = null;
                Object obj10 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj10;
                objArr8[i25 - 1] = obj9;
                return 0;
            case 22:
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                int i26 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i26 + 1;
                iArr6[i26] = 1;
                return 0;
            case 23:
                Object[] objArr9 = this.MediaMetadataCompat;
                int i27 = this.AudioAttributesImplApi26Parcelizer;
                Object obj11 = objArr9[i27 - 2];
                objArr9[i27 - 2] = null;
                objArr9[i27 - 1] = obj11;
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                iArr7[i27 - 2] = iArr7[i27 - 1];
                return 0;
            case 24:
                int i28 = this.AudioAttributesImplApi26Parcelizer;
                int i29 = i28 - 3;
                this.AudioAttributesImplApi26Parcelizer = i29;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj12 = objArr10[i29];
                objArr10[i29] = null;
                int i30 = this.MediaBrowserCompatItemReceiver[i28 - 2];
                Object obj13 = objArr10[i28 - 1];
                objArr10[i28 - 1] = null;
                ((Object[]) obj12)[i30] = obj13;
                this.AudioAttributesImplApi26Parcelizer = i28 - 2;
                Object obj14 = objArr10[i28 - 4];
                objArr10[i28 - 4] = null;
                objArr10[i29] = obj14;
                Object obj15 = objArr10[i28 - 5];
                objArr10[i28 - 5] = null;
                objArr10[i28 - 4] = obj15;
                objArr10[i28 - 5] = obj14;
                Object obj16 = objArr10[i28 - 3];
                objArr10[i28 - 3] = null;
                Object obj17 = objArr10[i28 - 4];
                objArr10[i28 - 4] = null;
                objArr10[i28 - 3] = obj17;
                objArr10[i28 - 4] = obj16;
                return 0;
            case 25:
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                int i31 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i31 + 1;
                iArr8[i31] = 0;
                Object[] objArr11 = this.MediaMetadataCompat;
                Object obj18 = objArr11[i31 - 1];
                objArr11[i31 - 1] = null;
                objArr11[i31] = obj18;
                iArr8[i31 - 1] = iArr8[i31];
                return 0;
            case 26:
                int i32 = this.AudioAttributesImplApi26Parcelizer;
                int i33 = i32 - 3;
                this.AudioAttributesImplApi26Parcelizer = i33;
                Object[] objArr12 = this.MediaMetadataCompat;
                Object obj19 = objArr12[i33];
                objArr12[i33] = null;
                int i34 = this.MediaBrowserCompatItemReceiver[i32 - 2];
                Object obj20 = objArr12[i32 - 1];
                objArr12[i32 - 1] = null;
                ((Object[]) obj19)[i34] = obj20;
                return 0;
            case 27:
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                int i35 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i35 + 1;
                iArr9[i35] = 0;
                return 0;
            case 28:
                Object[] objArr13 = this.MediaMetadataCompat;
                int i36 = this.AudioAttributesImplApi26Parcelizer;
                objArr13[i36] = objArr13[i36 - 1];
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi26Parcelizer = i36 + 2;
                iArr10[i36 + 1] = 1;
                return 0;
            case 29:
                Object[] objArr14 = this.MediaMetadataCompat;
                int i37 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i37 + 1;
                objArr14[i37] = null;
                return 0;
            case 30:
                int i38 = this.AudioAttributesImplApi26Parcelizer;
                int i39 = i38 - 1;
                this.AudioAttributesImplApi26Parcelizer = i39;
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                iArr11[i38 - 2] = iArr11[i38 - 2] % iArr11[i39];
                int i40 = i38 - 2;
                this.AudioAttributesImplApi26Parcelizer = i40;
                this.MediaMetadataCompat[i40] = null;
                return 0;
            case 31:
                int i41 = this.AudioAttributesImplApi26Parcelizer;
                int i42 = i41 - 1;
                this.AudioAttributesImplApi26Parcelizer = i42;
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                iArr12[i41 - 2] = iArr12[i41 - 2] % iArr12[i42];
                return 0;
            case 33:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i43 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i43 + 1;
                iArr13[i43] = this.IconCompatParcelizer;
            case 32:
                return 0;
            case 34:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i44 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i44 + 1;
                iArr14[i44] = 111;
                return 0;
            case 35:
                int i45 = this.AudioAttributesImplApi26Parcelizer;
                int i46 = i45 - 1;
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                iArr15[i45 - 2] = iArr15[i45 - 2] + iArr15[i46];
                iArr15[i46] = iArr15[i45 - 2];
                this.AudioAttributesImplApi26Parcelizer = i45 + 1;
                iArr15[i45] = 128;
                return 0;
            case 36:
                int i47 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i47;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver[i47] != 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i48 = this.AudioAttributesImplApi26Parcelizer;
                iArr16[i48] = 57;
                iArr16[i48 - 1] = iArr16[i48 - 1] + iArr16[i48];
                this.AudioAttributesImplApi26Parcelizer = i48 + 1;
                iArr16[i48] = iArr16[i48 - 1];
                return 0;
            case 38:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i49 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i49 + 1;
                iArr17[i49] = 128;
                return 0;
            case 39:
                int i50 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i50;
                this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver[i50] == 0 ? 0 : 1;
                return 0;
            case 40:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i51 = this.AudioAttributesImplApi26Parcelizer;
                iArr18[i51] = 3;
                iArr18[i51 + 1] = 5;
                int i52 = i51 + 1;
                this.AudioAttributesImplApi26Parcelizer = i52;
                iArr18[i51] = iArr18[i51] / iArr18[i52];
                return 0;
            case 41:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i53 = this.AudioAttributesImplApi26Parcelizer;
                iArr19[i53] = 11;
                this.AudioAttributesImplApi26Parcelizer = i53;
                iArr19[i53 - 1] = iArr19[i53 - 1] + iArr19[i53];
                return 0;
            case 42:
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                int i54 = this.AudioAttributesImplApi26Parcelizer;
                iArr20[i54] = iArr20[i54 - 1];
                iArr20[i54 + 1] = 128;
                int i55 = i54 + 1;
                this.AudioAttributesImplApi26Parcelizer = i55;
                iArr20[i54] = iArr20[i54] % iArr20[i55];
                return 0;
            case 43:
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                int i56 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i56;
                this.AudioAttributesCompatParcelizer = iArr21[i56];
                return 0;
            case 44:
                for (int i57 = this.AudioAttributesImplApi26Parcelizer - 1; i57 >= 0; i57--) {
                    this.MediaMetadataCompat[i57] = null;
                }
                Object[] objArr15 = this.MediaMetadataCompat;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objArr15[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
