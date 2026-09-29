package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class getShowVrButton {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private final long[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public int write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[12];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[12];
    private final double[] MediaBrowserCompatSearchResultReceiver = new double[12];

    public getShowVrButton(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.MediaBrowserCompatItemReceiver = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaBrowserCompatItemReceiver;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.MediaBrowserCompatItemReceiver;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                iArr[i4] = 32;
                long[] jArr3 = this.MediaBrowserCompatItemReceiver;
                jArr3[i4 - 1] = jArr3[i4 - 1] << iArr[i4];
                int i5 = i4 - 1;
                this.AudioAttributesImplApi21Parcelizer = i5;
                jArr3[i4 - 2] = jArr3[i4 - 2] ^ jArr3[i5];
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i6;
                long[] jArr4 = this.MediaBrowserCompatItemReceiver;
                jArr4[8] = jArr4[i6];
                return 0;
            case 5:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i7 + 1;
                iArr2[i7] = this.write;
                return 0;
            case 6:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                iArr3[i8] = 16;
                return 0;
            case 7:
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                int i10 = i9 - 1;
                this.AudioAttributesImplApi21Parcelizer = i10;
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr4[i9 - 2] = iArr4[i9 - 2] >> iArr4[i10];
                iArr4[i9 - 2] = (char) iArr4[i9 - 2];
                return 0;
            case 8:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                iArr5[i11] = 3;
                return 0;
            case 9:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                iArr6[i12] = 0;
                return 0;
            case 10:
                int i13 = this.AudioAttributesImplApi21Parcelizer - this.write;
                this.AudioAttributesImplApi21Parcelizer = i13;
                this.AudioAttributesImplBaseParcelizer = i13;
                return 0;
            case 11:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i14 + 1;
                this.read = iArr7[i14];
                return 0;
            case 12:
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                int i16 = i15 - 1;
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr8[i15 - 2] = iArr8[i15 - 2] + iArr8[i16];
                this.AudioAttributesImplApi21Parcelizer = i15;
                iArr8[i16] = 0;
                return 0;
            case 13:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i17 + 1;
                objArr[i17] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 14:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i18 + 1;
                Object obj = objArr2[i18];
                objArr2[i18] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 15:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i19 + 1;
                objArr3[i19] = objArr3[i19 - 1];
                return 0;
            case 16:
                int i20 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i20;
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                Object obj2 = objArr4[i20];
                objArr4[i20] = null;
                this.read = obj2 == null ? 0 : 1;
                return 0;
            case 17:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr5[i21 - 1];
                objArr5[i21 - 1] = null;
                Object obj4 = objArr5[i21 - 2];
                objArr5[i21 - 2] = null;
                objArr5[i21 - 1] = obj4;
                objArr5[i21 - 2] = obj3;
                return 0;
            case 18:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr6[i22 - 1];
                objArr6[i22 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 19:
                int i23 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i23;
                this.MediaBrowserCompatMediaItem[i23] = null;
                return 0;
            case 20:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                iArr9[i24] = 2;
                return 0;
            case 21:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i25 + 1;
                Object obj6 = objArr7[i25 - 1];
                objArr7[i25 - 1] = null;
                objArr7[i25] = obj6;
                long[] jArr5 = this.MediaBrowserCompatItemReceiver;
                jArr5[i25 - 1] = jArr5[i25 - 2];
                objArr7[i25 - 2] = obj6;
                return 0;
            case 22:
                long[] jArr6 = this.MediaBrowserCompatItemReceiver;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i26 + 1;
                this.IconCompatParcelizer = jArr6[i26];
                return 0;
            case 23:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                Object obj7 = objArr8[i27 - 1];
                objArr8[i27 - 1] = null;
                Object obj8 = objArr8[i27 - 2];
                objArr8[i27 - 2] = null;
                objArr8[i27 - 1] = obj8;
                objArr8[i27 - 2] = obj7;
                this.AudioAttributesImplApi21Parcelizer = i27 + 1;
                Object obj9 = objArr8[i27 - 1];
                objArr8[i27 - 1] = null;
                objArr8[i27] = obj9;
                Object obj10 = objArr8[i27 - 2];
                objArr8[i27 - 2] = null;
                objArr8[i27 - 1] = obj10;
                objArr8[i27 - 2] = obj9;
                return 0;
            case 24:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i28 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i28 + 1;
                iArr10[i28] = 1;
                return 0;
            case 25:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                Object obj11 = objArr9[i29 - 2];
                objArr9[i29 - 2] = null;
                objArr9[i29 - 1] = obj11;
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr11[i29 - 2] = iArr11[i29 - 1];
                int i30 = i29 - 3;
                this.AudioAttributesImplApi21Parcelizer = i30;
                Object obj12 = objArr9[i30];
                objArr9[i30] = null;
                int i31 = iArr11[i29 - 2];
                Object obj13 = objArr9[i29 - 1];
                objArr9[i29 - 1] = null;
                ((Object[]) obj12)[i31] = obj13;
                return 0;
            case 26:
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i32 + 1;
                Object obj14 = objArr10[i32 - 1];
                objArr10[i32 - 1] = null;
                objArr10[i32] = obj14;
                Object obj15 = objArr10[i32 - 2];
                objArr10[i32 - 2] = null;
                objArr10[i32 - 1] = obj15;
                objArr10[i32 - 2] = obj14;
                return 0;
            case 27:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                objArr11[i33] = objArr11[i33 - 1];
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i33 + 2;
                iArr12[i33 + 1] = 0;
                return 0;
            case 28:
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = i34 - 3;
                this.AudioAttributesImplApi21Parcelizer = i35;
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                Object obj16 = objArr12[i35];
                objArr12[i35] = null;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver[i34 - 2];
                Object obj17 = objArr12[i34 - 1];
                objArr12[i34 - 1] = null;
                ((Object[]) obj16)[i36] = obj17;
                this.AudioAttributesImplApi21Parcelizer = i34 - 2;
                objArr12[i35] = objArr12[i34 - 4];
                return 0;
            case 29:
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                int i38 = i37 - 3;
                this.AudioAttributesImplApi21Parcelizer = i38;
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                Object obj18 = objArr13[i38];
                objArr13[i38] = null;
                int i39 = this.MediaBrowserCompatCustomActionResultReceiver[i37 - 2];
                Object obj19 = objArr13[i37 - 1];
                objArr13[i37 - 1] = null;
                ((Object[]) obj18)[i39] = obj19;
                return 0;
            case 30:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                objArr14[i40] = objArr14[i40 - 1];
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i40 + 2;
                iArr13[i40 + 1] = 1;
                return 0;
            case 31:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                Object obj20 = objArr15[i41 - 1];
                objArr15[i41 - 1] = null;
                Object obj21 = objArr15[i41 - 2];
                objArr15[i41 - 2] = null;
                objArr15[i41 - 1] = obj21;
                objArr15[i41 - 2] = obj20;
                this.AudioAttributesImplApi21Parcelizer = i41 + 1;
                objArr15[i41] = null;
                return 0;
            case 32:
                int i42 = this.AudioAttributesImplApi21Parcelizer;
                int i43 = i42 - 1;
                this.AudioAttributesImplApi21Parcelizer = i43;
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr14[i42 - 2] = iArr14[i42 - 2] % iArr14[i43];
                return 0;
            case 33:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                iArr15[i44] = 2;
                iArr15[i44 + 1] = 2;
                int i45 = i44 + 1;
                this.AudioAttributesImplApi21Parcelizer = i45;
                iArr15[i44] = iArr15[i44] % iArr15[i45];
                return 0;
            case 34:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                iArr16[i46] = 43;
                iArr16[i46 - 1] = iArr16[i46 - 1] + iArr16[i46];
                this.AudioAttributesImplApi21Parcelizer = i46 + 1;
                iArr16[i46] = iArr16[i46 - 1];
                return 0;
            case 35:
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i47 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i47 + 1;
                iArr17[i47] = 128;
                return 0;
            case 36:
                int i48 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i48;
                this.read = this.MediaBrowserCompatCustomActionResultReceiver[i48] == 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                iArr18[i49] = 101;
                iArr18[i49 - 1] = iArr18[i49 - 1] + iArr18[i49];
                this.AudioAttributesImplApi21Parcelizer = i49 + 1;
                iArr18[i49] = iArr18[i49 - 1];
                return 0;
            case 38:
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i50] = 128;
                this.AudioAttributesImplApi21Parcelizer = i50;
                iArr19[i50 - 1] = iArr19[i50 - 1] % iArr19[i50];
                return 0;
            case 39:
                int i51 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i51;
                this.read = this.MediaBrowserCompatCustomActionResultReceiver[i51] != 0 ? 0 : 1;
                return 0;
            case 40:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i52] = 2;
                this.AudioAttributesImplApi21Parcelizer = i52;
                iArr20[i52 - 1] = iArr20[i52 - 1] % iArr20[i52];
                return 0;
            case 41:
                for (int i53 = this.AudioAttributesImplApi21Parcelizer - 1; i53 >= 0; i53--) {
                    this.MediaBrowserCompatMediaItem[i53] = null;
                }
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr16[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
