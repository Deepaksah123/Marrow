package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class getConciseId {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final long[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[12];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public getConciseId(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.MediaBrowserCompatItemReceiver = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaBrowserCompatItemReceiver;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.MediaBrowserCompatItemReceiver;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr2[i3] = jArr2[10];
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 2;
                iArr[i3 + 1] = 32;
                return 0;
            case 3:
                int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr3 = this.MediaBrowserCompatItemReceiver;
                jArr3[i4 - 2] = jArr3[i4 - 2] << this.AudioAttributesImplBaseParcelizer[i4 - 1];
                int i5 = i4 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i5;
                jArr3[i4 - 3] = jArr3[i4 - 3] ^ jArr3[i5];
                return 0;
            case 4:
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                long[] jArr4 = this.MediaBrowserCompatItemReceiver;
                jArr4[8] = jArr4[i6];
                return 0;
            case 5:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i7 + 1;
                objArr[i7] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 6:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i8 + 1;
                iArr2[i8] = 0;
                return 0;
            case 7:
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver - this.IconCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i9;
                this.AudioAttributesImplApi21Parcelizer = i9;
                return 0;
            case 8:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                Object obj = objArr2[i10];
                objArr2[i10] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                this.write = iArr3[i11];
                return 0;
            case 10:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                objArr3[i12] = objArr3[i12 - 1];
                return 0;
            case 11:
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                Object obj2 = objArr4[i13];
                objArr4[i13] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 12:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj3 = objArr5[i14 - 1];
                objArr5[i14 - 1] = null;
                Object obj4 = objArr5[i14 - 2];
                objArr5[i14 - 2] = null;
                objArr5[i14 - 1] = obj4;
                objArr5[i14 - 2] = obj3;
                return 0;
            case 13:
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i15;
                this.MediaBrowserCompatMediaItem[i15] = null;
                return 0;
            case 14:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj5 = objArr6[i16 - 1];
                objArr6[i16 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 15:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i17 + 1;
                iArr4[i17] = 2;
                return 0;
            case 16:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i18 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj6 = objArr7[i18 - 1];
                objArr7[i18 - 1] = null;
                objArr7[i18] = obj6;
                long[] jArr5 = this.MediaBrowserCompatItemReceiver;
                jArr5[i18 - 1] = jArr5[i18 - 2];
                objArr7[i18 - 2] = obj6;
                this.MediaBrowserCompatCustomActionResultReceiver = i18;
                objArr7[i18] = null;
                return 0;
            case 17:
                long[] jArr6 = this.MediaBrowserCompatItemReceiver;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i19 + 1;
                this.read = jArr6[i19];
                return 0;
            case 18:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj7 = objArr8[i20 - 1];
                objArr8[i20 - 1] = null;
                Object obj8 = objArr8[i20 - 2];
                objArr8[i20 - 2] = null;
                objArr8[i20 - 1] = obj8;
                objArr8[i20 - 2] = obj7;
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 1;
                Object obj9 = objArr8[i20 - 1];
                objArr8[i20 - 1] = null;
                objArr8[i20] = obj9;
                Object obj10 = objArr8[i20 - 2];
                objArr8[i20 - 2] = null;
                objArr8[i20 - 1] = obj10;
                objArr8[i20 - 2] = obj9;
                return 0;
            case 19:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr5[i21] = 1;
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                Object obj11 = objArr9[i21 - 1];
                objArr9[i21 - 1] = null;
                objArr9[i21] = obj11;
                iArr5[i21 - 1] = iArr5[i21];
                int i22 = i21 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i22;
                Object obj12 = objArr9[i22];
                objArr9[i22] = null;
                int i23 = iArr5[i21 - 1];
                Object obj13 = objArr9[i21];
                objArr9[i21] = null;
                ((Object[]) obj12)[i23] = obj13;
                return 0;
            case 20:
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                Object obj14 = objArr10[i24 - 1];
                objArr10[i24 - 1] = null;
                objArr10[i24] = obj14;
                Object obj15 = objArr10[i24 - 2];
                objArr10[i24 - 2] = null;
                objArr10[i24 - 1] = obj15;
                objArr10[i24 - 2] = obj14;
                Object obj16 = objArr10[i24];
                objArr10[i24] = null;
                Object obj17 = objArr10[i24 - 1];
                objArr10[i24 - 1] = null;
                objArr10[i24] = obj17;
                objArr10[i24 - 1] = obj16;
                return 0;
            case 21:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                iArr6[i25] = 0;
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                Object obj18 = objArr11[i25 - 1];
                objArr11[i25 - 1] = null;
                objArr11[i25] = obj18;
                iArr6[i25 - 1] = iArr6[i25];
                return 0;
            case 22:
                int i26 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i27 = i26 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i27;
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                Object obj19 = objArr12[i27];
                objArr12[i27] = null;
                int i28 = this.AudioAttributesImplBaseParcelizer[i26 - 2];
                Object obj20 = objArr12[i26 - 1];
                objArr12[i26 - 1] = null;
                ((Object[]) obj19)[i28] = obj20;
                return 0;
            case 23:
                int i29 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i30 = i29 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i30;
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                Object obj21 = objArr13[i30];
                objArr13[i30] = null;
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i31 = iArr7[i29 - 2];
                Object obj22 = objArr13[i29 - 1];
                objArr13[i29 - 1] = null;
                ((Object[]) obj21)[i31] = obj22;
                objArr13[i30] = objArr13[i29 - 4];
                this.MediaBrowserCompatCustomActionResultReceiver = i29 - 1;
                iArr7[i29 - 2] = 1;
                return 0;
            case 24:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr14[i32] = objArr14[i32 - 1];
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i32 + 2;
                iArr8[i32 + 1] = 1;
                return 0;
            case 25:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj23 = objArr15[i33 - 1];
                objArr15[i33 - 1] = null;
                Object obj24 = objArr15[i33 - 2];
                objArr15[i33 - 2] = null;
                objArr15[i33 - 1] = obj24;
                objArr15[i33 - 2] = obj23;
                this.MediaBrowserCompatCustomActionResultReceiver = i33 + 1;
                objArr15[i33] = null;
                return 0;
            case 26:
                int i34 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i35 = i34 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i35;
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i34 - 2] = iArr9[i34 - 2] % iArr9[i35];
                return 0;
            case 27:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr10[i36] = 2;
                iArr10[i36 + 1] = 2;
                int i37 = i36 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i37;
                iArr10[i36] = iArr10[i36] % iArr10[i37];
                return 0;
            case 28:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 + 1;
                iArr11[i38] = this.IconCompatParcelizer;
                return 0;
            case 29:
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                int i39 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr12[i39] = 9;
                this.MediaBrowserCompatCustomActionResultReceiver = i39;
                iArr12[i39 - 1] = iArr12[i39 - 1] + iArr12[i39];
                return 0;
            case 30:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i40 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i40 + 1;
                iArr13[i40] = iArr13[i40 - 1];
                return 0;
            case 31:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 1;
                iArr14[i41] = 128;
                return 0;
            case 32:
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i42;
                this.write = this.AudioAttributesImplBaseParcelizer[i42] == 0 ? 0 : 1;
                return 0;
            case 33:
                long[] jArr7 = this.MediaBrowserCompatItemReceiver;
                int i43 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i43 + 1;
                jArr7[i43] = jArr7[10];
                return 0;
            case 34:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i44 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr15[i44] = 85;
                this.MediaBrowserCompatCustomActionResultReceiver = i44;
                long[] jArr8 = this.MediaBrowserCompatItemReceiver;
                jArr8[i44 - 1] = jArr8[i44 - 1] << iArr15[i44];
                return 0;
            case 35:
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = i45 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i46;
                long[] jArr9 = this.MediaBrowserCompatItemReceiver;
                jArr9[i45 - 2] = jArr9[i45 - 2] * jArr9[i46];
                return 0;
            case 36:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i47 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i47 + 1;
                iArr16[i47] = 1;
                return 0;
            case 37:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i48 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i48] = 1;
                iArr17[i48 - 1] = iArr17[i48 - 1] + iArr17[i48];
                this.MediaBrowserCompatCustomActionResultReceiver = i48 + 1;
                iArr17[i48] = iArr17[i48 - 1];
                return 0;
            case 38:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr18[i49] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i49;
                iArr18[i49 - 1] = iArr18[i49 - 1] % iArr18[i49];
                return 0;
            case 39:
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i50;
                this.write = iArr19[i50];
                return 0;
            case 40:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i51 + 1;
                iArr20[i51] = 52;
                return 0;
            case 41:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i52 + 1;
                iArr21[i52] = 6;
                return 0;
            case 42:
                for (int i53 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i53 >= 0; i53--) {
                    this.MediaBrowserCompatMediaItem[i53] = null;
                }
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr16[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
