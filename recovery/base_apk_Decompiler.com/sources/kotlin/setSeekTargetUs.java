package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class setSeekTargetUs {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public Object write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] AudioAttributesImplApi21Parcelizer = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public setSeekTargetUs(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                int i4 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i4 + 1;
                iArr[i4] = 32;
                return 0;
            case 4:
                int i5 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[i5 - 2] = jArr3[i5 - 2] << this.MediaBrowserCompatItemReceiver[i5 - 1];
                int i6 = i5 - 2;
                this.AudioAttributesImplBaseParcelizer = i6;
                jArr3[i5 - 3] = jArr3[i5 - 3] ^ jArr3[i6];
                return 0;
            case 5:
                int i7 = this.AudioAttributesImplBaseParcelizer;
                int i8 = i7 - 1;
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                jArr4[8] = jArr4[i8];
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                iArr2[i8] = 1;
                this.AudioAttributesImplBaseParcelizer = i7 + 1;
                iArr2[i7] = 0;
                return 0;
            case 6:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i9 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i9 + 1;
                iArr3[i9] = 0;
                return 0;
            case 7:
                int i10 = this.AudioAttributesImplBaseParcelizer - this.AudioAttributesCompatParcelizer;
                this.AudioAttributesImplBaseParcelizer = i10;
                this.MediaBrowserCompatCustomActionResultReceiver = i10;
                return 0;
            case 8:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 1;
                this.read = iArr4[i11];
                return 0;
            case 9:
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                int i12 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i12 + 1;
                iArr5[i12] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 10:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i13 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i13 + 1;
                objArr[i13] = this.write;
                return 0;
            case 11:
                int i14 = this.AudioAttributesImplBaseParcelizer;
                int i15 = i14 - 1;
                this.AudioAttributesImplBaseParcelizer = i15;
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                iArr6[i14 - 2] = iArr6[i14 - 2] + iArr6[i15];
                return 0;
            case 12:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                Object obj = objArr2[i16];
                objArr2[i16] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 13:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                objArr3[i17] = objArr3[i17 - 1];
                return 0;
            case 14:
                int i18 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i18;
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                Object obj2 = objArr4[i18];
                objArr4[i18] = null;
                this.read = obj2 == null ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i19 - 1];
                objArr5[i19 - 1] = null;
                Object obj4 = objArr5[i19 - 2];
                objArr5[i19 - 2] = null;
                objArr5[i19 - 1] = obj4;
                objArr5[i19 - 2] = obj3;
                return 0;
            case 16:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i20 - 1];
                objArr6[i20 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 17:
                int i21 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                this.MediaBrowserCompatMediaItem[i21] = null;
                return 0;
            case 18:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i22 + 1;
                iArr7[i22] = 2;
                return 0;
            case 19:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i23 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                jArr5[i23 - 1] = jArr5[i23 - 2];
                objArr7[i23 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i23;
                objArr7[i23] = null;
                return 0;
            case 20:
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                this.IconCompatParcelizer = jArr6[i24];
                return 0;
            case 21:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i25 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                Object obj8 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj8;
                objArr8[i25 - 2] = obj7;
                this.AudioAttributesImplBaseParcelizer = i25 + 1;
                Object obj9 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj9;
                Object obj10 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj10;
                objArr8[i25 - 2] = obj9;
                Object obj11 = objArr8[i25];
                objArr8[i25] = null;
                Object obj12 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                objArr8[i25] = obj12;
                objArr8[i25 - 1] = obj11;
                return 0;
            case 22:
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i26 + 1;
                iArr8[i26] = 1;
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                Object obj13 = objArr9[i26 - 1];
                objArr9[i26 - 1] = null;
                objArr9[i26] = obj13;
                iArr8[i26 - 1] = iArr8[i26];
                return 0;
            case 23:
                int i27 = this.AudioAttributesImplBaseParcelizer;
                int i28 = i27 - 3;
                this.AudioAttributesImplBaseParcelizer = i28;
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                Object obj14 = objArr10[i28];
                objArr10[i28] = null;
                int i29 = this.MediaBrowserCompatItemReceiver[i27 - 2];
                Object obj15 = objArr10[i27 - 1];
                objArr10[i27 - 1] = null;
                ((Object[]) obj14)[i29] = obj15;
                return 0;
            case 24:
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                int i30 = this.AudioAttributesImplBaseParcelizer;
                Object obj16 = objArr11[i30 - 1];
                objArr11[i30 - 1] = null;
                objArr11[i30] = obj16;
                Object obj17 = objArr11[i30 - 2];
                objArr11[i30 - 2] = null;
                objArr11[i30 - 1] = obj17;
                objArr11[i30 - 2] = obj16;
                Object obj18 = objArr11[i30];
                objArr11[i30] = null;
                Object obj19 = objArr11[i30 - 1];
                objArr11[i30 - 1] = null;
                objArr11[i30] = obj19;
                objArr11[i30 - 1] = obj18;
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i30 + 2;
                iArr9[i30 + 1] = 0;
                return 0;
            case 25:
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                int i31 = this.AudioAttributesImplBaseParcelizer;
                Object obj20 = objArr12[i31 - 2];
                objArr12[i31 - 2] = null;
                objArr12[i31 - 1] = obj20;
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                iArr10[i31 - 2] = iArr10[i31 - 1];
                return 0;
            case 26:
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                objArr13[i32] = objArr13[i32 - 1];
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i32 + 2;
                iArr11[i32 + 1] = 0;
                return 0;
            case 27:
                int i33 = this.AudioAttributesImplBaseParcelizer;
                int i34 = i33 - 3;
                this.AudioAttributesImplBaseParcelizer = i34;
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                Object obj21 = objArr14[i34];
                objArr14[i34] = null;
                int i35 = this.MediaBrowserCompatItemReceiver[i33 - 2];
                Object obj22 = objArr14[i33 - 1];
                objArr14[i33 - 1] = null;
                ((Object[]) obj21)[i35] = obj22;
                this.AudioAttributesImplBaseParcelizer = i33 - 2;
                objArr14[i34] = objArr14[i33 - 4];
                return 0;
            case 28:
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                int i36 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i36 + 1;
                iArr12[i36] = 1;
                return 0;
            case 29:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i37 = this.AudioAttributesImplBaseParcelizer;
                objArr15[i37] = objArr15[i37 - 1];
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplBaseParcelizer = i37 + 2;
                iArr13[i37 + 1] = 1;
                return 0;
            case 30:
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                Object obj23 = objArr16[i38 - 1];
                objArr16[i38 - 1] = null;
                Object obj24 = objArr16[i38 - 2];
                objArr16[i38 - 2] = null;
                objArr16[i38 - 1] = obj24;
                objArr16[i38 - 2] = obj23;
                this.AudioAttributesImplBaseParcelizer = i38 + 1;
                objArr16[i38] = null;
                Object obj25 = objArr16[i38];
                objArr16[i38] = null;
                Object obj26 = objArr16[i38 - 1];
                objArr16[i38 - 1] = null;
                objArr16[i38] = obj26;
                objArr16[i38 - 1] = obj25;
                return 0;
            case 31:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i39 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i39] = 2;
                iArr14[i39 + 1] = 2;
                int i40 = i39 + 1;
                this.AudioAttributesImplBaseParcelizer = i40;
                iArr14[i39] = iArr14[i39] % iArr14[i40];
                return 0;
            case 32:
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                iArr15[i41] = 2;
                this.AudioAttributesImplBaseParcelizer = i41 + 2;
                iArr15[i41 + 1] = 2;
                return 0;
            case 33:
                int i42 = this.AudioAttributesImplBaseParcelizer;
                int i43 = i42 - 1;
                this.AudioAttributesImplBaseParcelizer = i43;
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                iArr16[i42 - 2] = iArr16[i42 - 2] % iArr16[i43];
                return 0;
            case 34:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i44 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i44 + 1;
                iArr17[i44] = 21;
                return 0;
            case 35:
                int i45 = this.AudioAttributesImplBaseParcelizer;
                int i46 = i45 - 1;
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                iArr18[i45 - 2] = iArr18[i45 - 2] + iArr18[i46];
                iArr18[i46] = iArr18[i45 - 2];
                this.AudioAttributesImplBaseParcelizer = i45 + 1;
                iArr18[i45] = 128;
                return 0;
            case 36:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i47 = this.AudioAttributesImplBaseParcelizer;
                iArr19[i47] = 2;
                this.AudioAttributesImplBaseParcelizer = i47;
                iArr19[i47 - 1] = iArr19[i47 - 1] % iArr19[i47];
                return 0;
            case 37:
                int i48 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i48;
                this.read = this.MediaBrowserCompatItemReceiver[i48] != 0 ? 0 : 1;
                return 0;
            case 38:
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                int i49 = this.AudioAttributesImplBaseParcelizer;
                iArr20[i49] = 77;
                this.AudioAttributesImplBaseParcelizer = i49;
                iArr20[i49 - 1] = iArr20[i49 - 1] + iArr20[i49];
                return 0;
            case 39:
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                int i50 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i50] = iArr21[i50 - 1];
                this.AudioAttributesImplBaseParcelizer = i50 + 2;
                iArr21[i50 + 1] = 128;
                return 0;
            case 40:
                int i51 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i51;
                this.read = this.MediaBrowserCompatItemReceiver[i51] == 0 ? 0 : 1;
                return 0;
            case 41:
                for (int i52 = this.AudioAttributesImplBaseParcelizer - 1; i52 >= 0; i52--) {
                    this.MediaBrowserCompatMediaItem[i52] = null;
                }
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr17[0] = this.write;
                return 0;
            default:
                return i;
        }
    }
}
