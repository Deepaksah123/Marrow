package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class crc8 {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public long write;
    private final int[] MediaBrowserCompatItemReceiver = new int[12];
    private final float[] AudioAttributesImplApi21Parcelizer = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public crc8(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaDescriptionCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i3] = jArr2[10];
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                iArr[i3 + 1] = 32;
                int i4 = i3 + 1;
                this.AudioAttributesImplApi26Parcelizer = i4;
                jArr2[i3] = jArr2[i3] << iArr[i4];
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
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i7 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i7 + 1;
                iArr2[i7] = this.IconCompatParcelizer;
                return 0;
            case 5:
                int[] iArr3 = this.MediaBrowserCompatItemReceiver;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i8 + 1;
                iArr3[i8] = 1;
                return 0;
            case 6:
                int[] iArr4 = this.MediaBrowserCompatItemReceiver;
                int i9 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i9 + 1;
                iArr4[i9] = 16;
                return 0;
            case 7:
                Object[] objArr = this.MediaDescriptionCompat;
                int i10 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i10 + 1;
                objArr[i10] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 8:
                int i11 = this.AudioAttributesImplApi26Parcelizer;
                int[] iArr5 = this.MediaBrowserCompatItemReceiver;
                iArr5[i11 - 2] = iArr5[i11 - 2] >> iArr5[i11 - 1];
                int i12 = i11 - 2;
                this.AudioAttributesImplApi26Parcelizer = i12;
                iArr5[i11 - 3] = iArr5[i11 - 3] + iArr5[i12];
                return 0;
            case 9:
                int i13 = this.AudioAttributesImplApi26Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi26Parcelizer = i13;
                this.MediaBrowserCompatCustomActionResultReceiver = i13;
                return 0;
            case 10:
                int[] iArr6 = this.MediaBrowserCompatItemReceiver;
                int i14 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i14 + 1;
                this.read = iArr6[i14];
                return 0;
            case 11:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 12:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i16 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i16 + 1;
                objArr3[i16] = objArr3[i16 - 1];
                return 0;
            case 13:
                int i17 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i17;
                Object[] objArr4 = this.MediaDescriptionCompat;
                Object obj2 = objArr4[i17];
                objArr4[i17] = null;
                this.read = obj2 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr5 = this.MediaDescriptionCompat;
                int i18 = this.AudioAttributesImplApi26Parcelizer;
                Object obj3 = objArr5[i18 - 1];
                objArr5[i18 - 1] = null;
                Object obj4 = objArr5[i18 - 2];
                objArr5[i18 - 2] = null;
                objArr5[i18 - 1] = obj4;
                objArr5[i18 - 2] = obj3;
                int i19 = i18 - 1;
                this.AudioAttributesImplApi26Parcelizer = i19;
                objArr5[i19] = null;
                return 0;
            case 15:
                Object[] objArr6 = this.MediaDescriptionCompat;
                int i20 = this.AudioAttributesImplApi26Parcelizer;
                Object obj5 = objArr6[i20 - 1];
                objArr6[i20 - 1] = null;
                this.RemoteActionCompatParcelizer = obj5;
                return 0;
            case 16:
                int i21 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i21;
                this.MediaDescriptionCompat[i21] = null;
                return 0;
            case 17:
                int[] iArr7 = this.MediaBrowserCompatItemReceiver;
                int i22 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i22 + 1;
                iArr7[i22] = 2;
                return 0;
            case 18:
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i23 + 1;
                this.write = jArr4[i23];
                return 0;
            case 19:
                Object[] objArr7 = this.MediaDescriptionCompat;
                int i24 = this.AudioAttributesImplApi26Parcelizer;
                Object obj6 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                objArr7[i24] = obj6;
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                jArr5[i24 - 1] = jArr5[i24 - 2];
                objArr7[i24 - 2] = obj6;
                this.AudioAttributesImplApi26Parcelizer = i24;
                objArr7[i24] = null;
                return 0;
            case 20:
                Object[] objArr8 = this.MediaDescriptionCompat;
                int i25 = this.AudioAttributesImplApi26Parcelizer;
                Object obj7 = objArr8[i25 - 1];
                objArr8[i25 - 1] = null;
                Object obj8 = objArr8[i25 - 2];
                objArr8[i25 - 2] = null;
                objArr8[i25 - 1] = obj8;
                objArr8[i25 - 2] = obj7;
                return 0;
            case 21:
                Object[] objArr9 = this.MediaDescriptionCompat;
                int i26 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i26 + 1;
                Object obj9 = objArr9[i26 - 1];
                objArr9[i26 - 1] = null;
                objArr9[i26] = obj9;
                Object obj10 = objArr9[i26 - 2];
                objArr9[i26 - 2] = null;
                objArr9[i26 - 1] = obj10;
                objArr9[i26 - 2] = obj9;
                return 0;
            case 22:
                Object[] objArr10 = this.MediaDescriptionCompat;
                int i27 = this.AudioAttributesImplApi26Parcelizer;
                Object obj11 = objArr10[i27 - 1];
                objArr10[i27 - 1] = null;
                Object obj12 = objArr10[i27 - 2];
                objArr10[i27 - 2] = null;
                objArr10[i27 - 1] = obj12;
                objArr10[i27 - 2] = obj11;
                int[] iArr8 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi26Parcelizer = i27 + 1;
                iArr8[i27] = 1;
                Object obj13 = objArr10[i27 - 1];
                objArr10[i27 - 1] = null;
                objArr10[i27] = obj13;
                iArr8[i27 - 1] = iArr8[i27];
                return 0;
            case 23:
                int i28 = this.AudioAttributesImplApi26Parcelizer;
                int i29 = i28 - 3;
                this.AudioAttributesImplApi26Parcelizer = i29;
                Object[] objArr11 = this.MediaDescriptionCompat;
                Object obj14 = objArr11[i29];
                objArr11[i29] = null;
                int i30 = this.MediaBrowserCompatItemReceiver[i28 - 2];
                Object obj15 = objArr11[i28 - 1];
                objArr11[i28 - 1] = null;
                ((Object[]) obj14)[i30] = obj15;
                return 0;
            case 24:
                int[] iArr9 = this.MediaBrowserCompatItemReceiver;
                int i31 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i31 + 1;
                iArr9[i31] = 0;
                return 0;
            case 25:
                Object[] objArr12 = this.MediaDescriptionCompat;
                int i32 = this.AudioAttributesImplApi26Parcelizer;
                Object obj16 = objArr12[i32 - 2];
                objArr12[i32 - 2] = null;
                objArr12[i32 - 1] = obj16;
                int[] iArr10 = this.MediaBrowserCompatItemReceiver;
                iArr10[i32 - 2] = iArr10[i32 - 1];
                int i33 = i32 - 3;
                this.AudioAttributesImplApi26Parcelizer = i33;
                Object obj17 = objArr12[i33];
                objArr12[i33] = null;
                int i34 = iArr10[i32 - 2];
                Object obj18 = objArr12[i32 - 1];
                objArr12[i32 - 1] = null;
                ((Object[]) obj17)[i34] = obj18;
                return 0;
            case 26:
                Object[] objArr13 = this.MediaDescriptionCompat;
                int i35 = this.AudioAttributesImplApi26Parcelizer;
                objArr13[i35] = objArr13[i35 - 1];
                int[] iArr11 = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi26Parcelizer = i35 + 2;
                iArr11[i35 + 1] = 0;
                return 0;
            case 27:
                Object[] objArr14 = this.MediaDescriptionCompat;
                int i36 = this.AudioAttributesImplApi26Parcelizer;
                Object obj19 = objArr14[i36 - 1];
                objArr14[i36 - 1] = null;
                Object obj20 = objArr14[i36 - 2];
                objArr14[i36 - 2] = null;
                objArr14[i36 - 1] = obj20;
                objArr14[i36 - 2] = obj19;
                this.AudioAttributesImplApi26Parcelizer = i36 + 1;
                objArr14[i36] = null;
                Object obj21 = objArr14[i36];
                objArr14[i36] = null;
                Object obj22 = objArr14[i36 - 1];
                objArr14[i36 - 1] = null;
                objArr14[i36] = obj22;
                objArr14[i36 - 1] = obj21;
                return 0;
            case 28:
                int[] iArr12 = this.MediaBrowserCompatItemReceiver;
                int i37 = this.AudioAttributesImplApi26Parcelizer;
                iArr12[i37] = 2;
                this.AudioAttributesImplApi26Parcelizer = i37 + 2;
                iArr12[i37 + 1] = 2;
                return 0;
            case 29:
                int i38 = this.AudioAttributesImplApi26Parcelizer;
                int i39 = i38 - 1;
                this.AudioAttributesImplApi26Parcelizer = i39;
                int[] iArr13 = this.MediaBrowserCompatItemReceiver;
                iArr13[i38 - 2] = iArr13[i38 - 2] % iArr13[i39];
                return 0;
            case 30:
                int[] iArr14 = this.MediaBrowserCompatItemReceiver;
                int i40 = this.AudioAttributesImplApi26Parcelizer;
                iArr14[i40] = 2;
                iArr14[i40 + 1] = 2;
                int i41 = i40 + 1;
                this.AudioAttributesImplApi26Parcelizer = i41;
                iArr14[i40] = iArr14[i40] % iArr14[i41];
                return 0;
            case 31:
                int[] iArr15 = this.MediaBrowserCompatItemReceiver;
                int i42 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i42 + 1;
                iArr15[i42] = 53;
                return 0;
            case 32:
                int i43 = this.AudioAttributesImplApi26Parcelizer;
                int i44 = i43 - 1;
                this.AudioAttributesImplApi26Parcelizer = i44;
                int[] iArr16 = this.MediaBrowserCompatItemReceiver;
                iArr16[i43 - 2] = iArr16[i43 - 2] + iArr16[i44];
                return 0;
            case 33:
                int[] iArr17 = this.MediaBrowserCompatItemReceiver;
                int i45 = this.AudioAttributesImplApi26Parcelizer;
                iArr17[i45] = iArr17[i45 - 1];
                this.AudioAttributesImplApi26Parcelizer = i45 + 2;
                iArr17[i45 + 1] = 128;
                return 0;
            case 34:
                int i46 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i46;
                this.read = this.MediaBrowserCompatItemReceiver[i46] == 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr18 = this.MediaBrowserCompatItemReceiver;
                int i47 = this.AudioAttributesImplApi26Parcelizer;
                iArr18[i47] = 2;
                this.AudioAttributesImplApi26Parcelizer = i47;
                iArr18[i47 - 1] = iArr18[i47 - 1] % iArr18[i47];
                return 0;
            case 36:
                int[] iArr19 = this.MediaBrowserCompatItemReceiver;
                int i48 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i48 + 1;
                iArr19[i48] = 73;
                return 0;
            case 37:
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i49 + 1;
                jArr6[i49] = jArr6[10];
                return 0;
            case 38:
                int[] iArr20 = this.MediaBrowserCompatItemReceiver;
                int i50 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i50 + 1;
                iArr20[i50] = 76;
                return 0;
            case 39:
                int i51 = this.AudioAttributesImplApi26Parcelizer;
                long[] jArr7 = this.AudioAttributesImplBaseParcelizer;
                jArr7[i51 - 2] = jArr7[i51 - 2] >>> this.MediaBrowserCompatItemReceiver[i51 - 1];
                jArr7[i51 - 3] = jArr7[i51 - 3] ^ jArr7[i51 - 2];
                int i52 = i51 - 3;
                this.AudioAttributesImplApi26Parcelizer = i52;
                jArr7[8] = jArr7[i52];
                return 0;
            case 40:
                int i53 = this.AudioAttributesImplApi26Parcelizer;
                int i54 = i53 - 1;
                this.AudioAttributesImplApi26Parcelizer = i54;
                int[] iArr21 = this.MediaBrowserCompatItemReceiver;
                iArr21[i53 - 2] = iArr21[i53 - 2] * iArr21[i54];
                return 0;
            case 41:
                int[] iArr22 = this.MediaBrowserCompatItemReceiver;
                int i55 = this.AudioAttributesImplApi26Parcelizer - 1;
                this.AudioAttributesImplApi26Parcelizer = i55;
                this.read = iArr22[i55];
                return 0;
            case 42:
                for (int i56 = this.AudioAttributesImplApi26Parcelizer - 1; i56 >= 0; i56--) {
                    this.MediaDescriptionCompat[i56] = null;
                }
                Object[] objArr15 = this.MediaDescriptionCompat;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objArr15[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
