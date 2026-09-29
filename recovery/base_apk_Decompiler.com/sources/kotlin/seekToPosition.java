package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class seekToPosition {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final long[] MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public int RemoteActionCompatParcelizer;
    public long read;
    public Object write;
    private final int[] AudioAttributesImplApi26Parcelizer = new int[12];
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[12];
    private final double[] MediaBrowserCompatMediaItem = new double[12];

    public seekToPosition(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.MediaBrowserCompatItemReceiver = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int write(int i) {
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
                int[] iArr = this.AudioAttributesImplApi26Parcelizer;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4 + 1;
                iArr[i4] = 32;
                return 0;
            case 4:
                int i5 = this.AudioAttributesImplApi21Parcelizer;
                int i6 = i5 - 1;
                this.AudioAttributesImplApi21Parcelizer = i6;
                long[] jArr3 = this.MediaBrowserCompatItemReceiver;
                jArr3[i5 - 2] = jArr3[i5 - 2] << this.AudioAttributesImplApi26Parcelizer[i6];
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = i7 - 1;
                this.AudioAttributesImplApi21Parcelizer = i8;
                long[] jArr4 = this.MediaBrowserCompatItemReceiver;
                jArr4[i7 - 2] = jArr4[i7 - 2] ^ jArr4[i8];
                return 0;
            case 6:
                int i9 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i9;
                long[] jArr5 = this.MediaBrowserCompatItemReceiver;
                jArr5[8] = jArr5[i9];
                return 0;
            case 7:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                objArr[i10] = this.write;
                return 0;
            case 8:
                int[] iArr2 = this.AudioAttributesImplApi26Parcelizer;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i11 + 1;
                iArr2[i11] = this.IconCompatParcelizer;
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplApi26Parcelizer;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                iArr3[i12] = 127;
                return 0;
            case 10:
                int[] iArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i13 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i13 + 1;
                iArr4[i13] = 8;
                return 0;
            case 11:
                int i14 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = i14 - 1;
                this.AudioAttributesImplApi21Parcelizer = i15;
                int[] iArr5 = this.AudioAttributesImplApi26Parcelizer;
                iArr5[i14 - 2] = iArr5[i14 - 2] >> iArr5[i15];
                return 0;
            case 12:
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                int i17 = i16 - 1;
                int[] iArr6 = this.AudioAttributesImplApi26Parcelizer;
                iArr6[i16 - 2] = iArr6[i16 - 2] - iArr6[i17];
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                objArr2[i17] = null;
                this.AudioAttributesImplApi21Parcelizer = i16 + 1;
                objArr2[i16] = null;
                return 0;
            case 13:
                int i18 = this.AudioAttributesImplApi21Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i18;
                this.AudioAttributesImplBaseParcelizer = i18;
                return 0;
            case 14:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i19 + 1;
                Object obj = objArr3[i19];
                objArr3[i19] = null;
                this.AudioAttributesCompatParcelizer = obj;
                return 0;
            case 15:
                int[] iArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i20 + 1;
                this.RemoteActionCompatParcelizer = iArr7[i20];
                return 0;
            case 16:
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i21 + 1;
                objArr4[i21] = objArr4[i21 - 1];
                return 0;
            case 17:
                int i22 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i22;
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr5[i22];
                objArr5[i22] = null;
                this.RemoteActionCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 18:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr6[i23 - 1];
                objArr6[i23 - 1] = null;
                Object obj4 = objArr6[i23 - 2];
                objArr6[i23 - 2] = null;
                objArr6[i23 - 1] = obj4;
                objArr6[i23 - 2] = obj3;
                int i24 = i23 - 1;
                this.AudioAttributesImplApi21Parcelizer = i24;
                objArr6[i24] = null;
                return 0;
            case 19:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                Object obj5 = objArr7[i25 - 1];
                objArr7[i25 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj5;
                return 0;
            case 20:
                int i26 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i26;
                this.MediaBrowserCompatSearchResultReceiver[i26] = null;
                return 0;
            case 21:
                int[] iArr8 = this.AudioAttributesImplApi26Parcelizer;
                int i27 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i27 + 1;
                iArr8[i27] = 2;
                return 0;
            case 22:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i28 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i28 + 1;
                Object obj6 = objArr8[i28 - 1];
                objArr8[i28 - 1] = null;
                objArr8[i28] = obj6;
                long[] jArr6 = this.MediaBrowserCompatItemReceiver;
                jArr6[i28 - 1] = jArr6[i28 - 2];
                objArr8[i28 - 2] = obj6;
                return 0;
            case 23:
                long[] jArr7 = this.MediaBrowserCompatItemReceiver;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i29 + 1;
                this.read = jArr7[i29];
                return 0;
            case 24:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                Object obj7 = objArr9[i30 - 1];
                objArr9[i30 - 1] = null;
                Object obj8 = objArr9[i30 - 2];
                objArr9[i30 - 2] = null;
                objArr9[i30 - 1] = obj8;
                objArr9[i30 - 2] = obj7;
                return 0;
            case 25:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i31 + 1;
                Object obj9 = objArr10[i31 - 1];
                objArr10[i31 - 1] = null;
                objArr10[i31] = obj9;
                Object obj10 = objArr10[i31 - 2];
                objArr10[i31 - 2] = null;
                objArr10[i31 - 1] = obj10;
                objArr10[i31 - 2] = obj9;
                Object obj11 = objArr10[i31];
                objArr10[i31] = null;
                Object obj12 = objArr10[i31 - 1];
                objArr10[i31 - 1] = null;
                objArr10[i31] = obj12;
                objArr10[i31 - 1] = obj11;
                return 0;
            case 26:
                int[] iArr9 = this.AudioAttributesImplApi26Parcelizer;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i32 + 1;
                iArr9[i32] = 1;
                return 0;
            case 27:
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                Object obj13 = objArr11[i33 - 2];
                objArr11[i33 - 2] = null;
                objArr11[i33 - 1] = obj13;
                int[] iArr10 = this.AudioAttributesImplApi26Parcelizer;
                iArr10[i33 - 2] = iArr10[i33 - 1];
                return 0;
            case 28:
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = i34 - 3;
                this.AudioAttributesImplApi21Parcelizer = i35;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj14 = objArr12[i35];
                objArr12[i35] = null;
                int i36 = this.AudioAttributesImplApi26Parcelizer[i34 - 2];
                Object obj15 = objArr12[i34 - 1];
                objArr12[i34 - 1] = null;
                ((Object[]) obj14)[i36] = obj15;
                return 0;
            case 29:
                int[] iArr11 = this.AudioAttributesImplApi26Parcelizer;
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                iArr11[i37] = 0;
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj16 = objArr13[i37 - 1];
                objArr13[i37 - 1] = null;
                objArr13[i37] = obj16;
                iArr11[i37 - 1] = iArr11[i37];
                int i38 = i37 - 2;
                this.AudioAttributesImplApi21Parcelizer = i38;
                Object obj17 = objArr13[i38];
                objArr13[i38] = null;
                int i39 = iArr11[i37 - 1];
                Object obj18 = objArr13[i37];
                objArr13[i37] = null;
                ((Object[]) obj17)[i39] = obj18;
                return 0;
            case 30:
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                objArr14[i40] = objArr14[i40 - 1];
                int[] iArr12 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i40 + 2;
                iArr12[i40 + 1] = 0;
                return 0;
            case 31:
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = i41 - 3;
                this.AudioAttributesImplApi21Parcelizer = i42;
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr15[i42];
                objArr15[i42] = null;
                int[] iArr13 = this.AudioAttributesImplApi26Parcelizer;
                int i43 = iArr13[i41 - 2];
                Object obj20 = objArr15[i41 - 1];
                objArr15[i41 - 1] = null;
                ((Object[]) obj19)[i43] = obj20;
                objArr15[i42] = objArr15[i41 - 4];
                this.AudioAttributesImplApi21Parcelizer = i41 - 1;
                iArr13[i41 - 2] = 1;
                return 0;
            case 32:
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                objArr16[i44] = objArr16[i44 - 1];
                int[] iArr14 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i44 + 2;
                iArr14[i44 + 1] = 1;
                return 0;
            case 33:
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i45 + 1;
                objArr17[i45] = null;
                Object obj21 = objArr17[i45];
                objArr17[i45] = null;
                Object obj22 = objArr17[i45 - 1];
                objArr17[i45 - 1] = null;
                objArr17[i45] = obj22;
                objArr17[i45 - 1] = obj21;
                return 0;
            case 34:
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = i46 - 1;
                this.AudioAttributesImplApi21Parcelizer = i47;
                int[] iArr15 = this.AudioAttributesImplApi26Parcelizer;
                iArr15[i46 - 2] = iArr15[i46 - 2] % iArr15[i47];
                return 0;
            case 35:
                int[] iArr16 = this.AudioAttributesImplApi26Parcelizer;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i48 + 1;
                iArr16[i48] = 75;
                return 0;
            case 36:
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                int i50 = i49 - 1;
                this.AudioAttributesImplApi21Parcelizer = i50;
                int[] iArr17 = this.AudioAttributesImplApi26Parcelizer;
                iArr17[i49 - 2] = iArr17[i49 - 2] + iArr17[i50];
                return 0;
            case 37:
                int[] iArr18 = this.AudioAttributesImplApi26Parcelizer;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                iArr18[i51] = iArr18[i51 - 1];
                return 0;
            case 38:
                int[] iArr19 = this.AudioAttributesImplApi26Parcelizer;
                int i52 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i52] = 128;
                this.AudioAttributesImplApi21Parcelizer = i52;
                iArr19[i52 - 1] = iArr19[i52 - 1] % iArr19[i52];
                return 0;
            case 39:
                int[] iArr20 = this.AudioAttributesImplApi26Parcelizer;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i53] = 2;
                this.AudioAttributesImplApi21Parcelizer = i53;
                iArr20[i53 - 1] = iArr20[i53 - 1] % iArr20[i53];
                return 0;
            case 40:
                int i54 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i54;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer[i54] != 0 ? 0 : 1;
                return 0;
            case 41:
                int[] iArr21 = this.AudioAttributesImplApi26Parcelizer;
                int i55 = this.AudioAttributesImplApi21Parcelizer;
                iArr21[i55] = 109;
                this.AudioAttributesImplApi21Parcelizer = i55;
                iArr21[i55 - 1] = iArr21[i55 - 1] + iArr21[i55];
                return 0;
            case 42:
                int[] iArr22 = this.AudioAttributesImplApi26Parcelizer;
                int i56 = this.AudioAttributesImplApi21Parcelizer;
                iArr22[i56] = iArr22[i56 - 1];
                iArr22[i56 + 1] = 128;
                int i57 = i56 + 1;
                this.AudioAttributesImplApi21Parcelizer = i57;
                iArr22[i56] = iArr22[i56] % iArr22[i57];
                return 0;
            case 43:
                int i58 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i58;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer[i58] == 0 ? 0 : 1;
                return 0;
            case 44:
                for (int i59 = this.AudioAttributesImplApi21Parcelizer - 1; i59 >= 0; i59--) {
                    this.MediaBrowserCompatSearchResultReceiver[i59] = null;
                }
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr18[0] = this.write;
                return 0;
            default:
                return i;
        }
    }
}
