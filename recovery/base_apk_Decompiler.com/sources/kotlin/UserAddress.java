package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class UserAddress {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[12];
    private final double[] RatingCompat = new double[12];

    public UserAddress(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr2[i3] = jArr2[10];
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                iArr[i3 + 1] = 32;
                int i4 = i3 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i4;
                jArr2[i3] = jArr2[i3] << iArr[i4];
                return 0;
            case 3:
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = i5 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i5 - 2] = jArr3[i5 - 2] ^ jArr3[i6];
                return 0;
            case 4:
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i7;
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                jArr4[8] = jArr4[i7];
                return 0;
            case 5:
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver - this.IconCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i8;
                this.AudioAttributesImplApi21Parcelizer = i8;
                return 0;
            case 6:
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                this.write = iArr2[i9];
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                iArr3[i10] = this.IconCompatParcelizer;
                return 0;
            case 8:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i11] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 2;
                iArr4[i11 + 1] = 0;
                return 0;
            case 9:
                Object[] objArr = this.MediaMetadataCompat;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                objArr[i12] = this.RemoteActionCompatParcelizer;
                return 0;
            case 10:
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = i13 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i14;
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                iArr5[i13 - 2] = iArr5[i13 - 2] - iArr5[i14];
                return 0;
            case 11:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.AudioAttributesCompatParcelizer = obj;
                return 0;
            case 12:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                objArr3[i16] = objArr3[i16 - 1];
                return 0;
            case 13:
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i17;
                Object[] objArr4 = this.MediaMetadataCompat;
                Object obj2 = objArr4[i17];
                objArr4[i17] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i18 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj3 = objArr5[i18 - 1];
                objArr5[i18 - 1] = null;
                Object obj4 = objArr5[i18 - 2];
                objArr5[i18 - 2] = null;
                objArr5[i18 - 1] = obj4;
                objArr5[i18 - 2] = obj3;
                return 0;
            case 15:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj5 = objArr6[i19 - 1];
                objArr6[i19 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj5;
                return 0;
            case 16:
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i20;
                this.MediaMetadataCompat[i20] = null;
                return 0;
            case 17:
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i21 + 1;
                iArr6[i21] = 2;
                return 0;
            case 18:
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i22 + 1;
                this.read = jArr5[i22];
                return 0;
            case 19:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                jArr6[i23 - 1] = jArr6[i23 - 2];
                objArr7[i23 - 2] = obj6;
                this.MediaBrowserCompatCustomActionResultReceiver = i23;
                objArr7[i23] = null;
                return 0;
            case 20:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj7 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                Object obj8 = objArr8[i24 - 2];
                objArr8[i24 - 2] = null;
                objArr8[i24 - 1] = obj8;
                objArr8[i24 - 2] = obj7;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                Object obj9 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                objArr8[i24] = obj9;
                Object obj10 = objArr8[i24 - 2];
                objArr8[i24 - 2] = null;
                objArr8[i24 - 1] = obj10;
                objArr8[i24 - 2] = obj9;
                Object obj11 = objArr8[i24];
                objArr8[i24] = null;
                Object obj12 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                objArr8[i24] = obj12;
                objArr8[i24 - 1] = obj11;
                return 0;
            case 21:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr7[i25] = 1;
                Object[] objArr9 = this.MediaMetadataCompat;
                Object obj13 = objArr9[i25 - 1];
                objArr9[i25 - 1] = null;
                objArr9[i25] = obj13;
                iArr7[i25 - 1] = iArr7[i25];
                int i26 = i25 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i26;
                Object obj14 = objArr9[i26];
                objArr9[i26] = null;
                int i27 = iArr7[i25 - 1];
                Object obj15 = objArr9[i25];
                objArr9[i25] = null;
                ((Object[]) obj14)[i27] = obj15;
                return 0;
            case 22:
                Object[] objArr10 = this.MediaMetadataCompat;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i28 + 1;
                Object obj16 = objArr10[i28 - 1];
                objArr10[i28 - 1] = null;
                objArr10[i28] = obj16;
                Object obj17 = objArr10[i28 - 2];
                objArr10[i28 - 2] = null;
                objArr10[i28 - 1] = obj17;
                objArr10[i28 - 2] = obj16;
                return 0;
            case 23:
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr8[i29] = 0;
                Object[] objArr11 = this.MediaMetadataCompat;
                Object obj18 = objArr11[i29 - 1];
                objArr11[i29 - 1] = null;
                objArr11[i29] = obj18;
                iArr8[i29 - 1] = iArr8[i29];
                int i30 = i29 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i30;
                Object obj19 = objArr11[i30];
                objArr11[i30] = null;
                int i31 = iArr8[i29 - 1];
                Object obj20 = objArr11[i29];
                objArr11[i29] = null;
                ((Object[]) obj19)[i31] = obj20;
                return 0;
            case 24:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr12[i32] = objArr12[i32 - 1];
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i32 + 2;
                iArr9[i32 + 1] = 0;
                return 0;
            case 25:
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i34 = i33 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i34;
                Object[] objArr13 = this.MediaMetadataCompat;
                Object obj21 = objArr13[i34];
                objArr13[i34] = null;
                int i35 = this.MediaBrowserCompatItemReceiver[i33 - 2];
                Object obj22 = objArr13[i33 - 1];
                objArr13[i33 - 1] = null;
                ((Object[]) obj21)[i35] = obj22;
                this.MediaBrowserCompatCustomActionResultReceiver = i33 - 2;
                objArr13[i34] = objArr13[i33 - 4];
                return 0;
            case 26:
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i36 + 1;
                iArr10[i36] = 1;
                return 0;
            case 27:
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i38 = i37 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i38;
                Object[] objArr14 = this.MediaMetadataCompat;
                Object obj23 = objArr14[i38];
                objArr14[i38] = null;
                int i39 = this.MediaBrowserCompatItemReceiver[i37 - 2];
                Object obj24 = objArr14[i37 - 1];
                objArr14[i37 - 1] = null;
                ((Object[]) obj23)[i39] = obj24;
                return 0;
            case 28:
                Object[] objArr15 = this.MediaMetadataCompat;
                int i40 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr15[i40] = objArr15[i40 - 1];
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i40 + 2;
                iArr11[i40 + 1] = 1;
                return 0;
            case 29:
                Object[] objArr16 = this.MediaMetadataCompat;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj25 = objArr16[i41 - 1];
                objArr16[i41 - 1] = null;
                Object obj26 = objArr16[i41 - 2];
                objArr16[i41 - 2] = null;
                objArr16[i41 - 1] = obj26;
                objArr16[i41 - 2] = obj25;
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 1;
                objArr16[i41] = null;
                Object obj27 = objArr16[i41];
                objArr16[i41] = null;
                Object obj28 = objArr16[i41 - 1];
                objArr16[i41 - 1] = null;
                objArr16[i41] = obj28;
                objArr16[i41 - 1] = obj27;
                return 0;
            case 30:
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i43 = i42 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i43;
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                iArr12[i42 - 2] = iArr12[i42 - 2] % iArr12[i43];
                int i44 = i42 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i44;
                this.MediaMetadataCompat[i44] = null;
                return 0;
            case 32:
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr13[i45] = 109;
                iArr13[i45 - 1] = iArr13[i45 - 1] + iArr13[i45];
                this.MediaBrowserCompatCustomActionResultReceiver = i45 + 1;
                iArr13[i45] = iArr13[i45 - 1];
            case 31:
                return 0;
            case 33:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i46 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i46 + 1;
                iArr14[i46] = 128;
                return 0;
            case 34:
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i48 = i47 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i48;
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                iArr15[i47 - 2] = iArr15[i47 - 2] % iArr15[i48];
                return 0;
            case 35:
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i49;
                this.write = this.MediaBrowserCompatItemReceiver[i49] == 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr16[i50] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                iArr16[i50 - 1] = iArr16[i50 - 1] % iArr16[i50];
                return 0;
            case 37:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i51 + 1;
                iArr17[i51] = 97;
                return 0;
            case 38:
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i53 = i52 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i53;
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                iArr18[i52 - 2] = iArr18[i52 - 2] + iArr18[i53];
                return 0;
            case 39:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i54] = iArr19[i54 - 1];
                this.MediaBrowserCompatCustomActionResultReceiver = i54 + 2;
                iArr19[i54 + 1] = 128;
                return 0;
            case 40:
                for (int i55 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i55 >= 0; i55--) {
                    this.MediaMetadataCompat[i55] = null;
                }
                Object[] objArr17 = this.MediaMetadataCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr17[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
