package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class lambdaincreaseDeviceVolume24 {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public long write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[12];
    private final float[] MediaBrowserCompatItemReceiver = new float[12];
    private final double[] MediaMetadataCompat = new double[12];

    public lambdaincreaseDeviceVolume24(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaDescriptionCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                jArr[i2] = jArr[8];
                this.AudioAttributesImplBaseParcelizer = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                iArr[i3] = 32;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i3 - 1] = jArr2[i3 - 1] << iArr[i3];
                int i4 = i3 - 1;
                this.AudioAttributesImplBaseParcelizer = i4;
                jArr2[i3 - 2] = jArr2[i3 - 2] ^ jArr2[i4];
                return 0;
            case 3:
                int i5 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i5;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[8] = jArr3[i5];
                return 0;
            case 4:
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i6 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i6 + 1;
                iArr2[i6] = this.read;
                return 0;
            case 5:
                Object[] objArr = this.MediaDescriptionCompat;
                int i7 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i7 + 1;
                objArr[i7] = this.RemoteActionCompatParcelizer;
                return 0;
            case 6:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i8 + 1;
                iArr3[i8] = 0;
                return 0;
            case 7:
                int i9 = this.AudioAttributesImplBaseParcelizer - this.read;
                this.AudioAttributesImplBaseParcelizer = i9;
                this.MediaBrowserCompatCustomActionResultReceiver = i9;
                return 0;
            case 8:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                Object obj = objArr2[i10];
                objArr2[i10] = null;
                this.IconCompatParcelizer = obj;
                return 0;
            case 9:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 1;
                this.AudioAttributesCompatParcelizer = iArr4[i11];
                return 0;
            case 10:
                int i12 = this.AudioAttributesImplBaseParcelizer;
                int i13 = i12 - 1;
                this.AudioAttributesImplBaseParcelizer = i13;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i12 - 2] = iArr5[i12 - 2] + iArr5[i13];
                return 0;
            case 11:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i14 + 1;
                iArr6[i14] = 5671;
                return 0;
            case 12:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.AudioAttributesImplBaseParcelizer;
                iArr7[i15 - 1] = (byte) iArr7[i15 - 1];
                int i16 = i15 - 1;
                this.AudioAttributesImplBaseParcelizer = i16;
                iArr7[i15 - 2] = iArr7[i15 - 2] + iArr7[i16];
                iArr7[i15 - 2] = (char) iArr7[i15 - 2];
                return 0;
            case 13:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                jArr4[i17] = jArr4[8];
                return 0;
            case 14:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i18 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i18 + 1;
                objArr3[i18] = objArr3[i18 - 1];
                return 0;
            case 15:
                int i19 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i19;
                Object[] objArr4 = this.MediaDescriptionCompat;
                Object obj2 = objArr4[i19];
                objArr4[i19] = null;
                this.AudioAttributesCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr5 = this.MediaDescriptionCompat;
                int i20 = this.AudioAttributesImplBaseParcelizer;
                Object obj3 = objArr5[i20 - 1];
                objArr5[i20 - 1] = null;
                Object obj4 = objArr5[i20 - 2];
                objArr5[i20 - 2] = null;
                objArr5[i20 - 1] = obj4;
                objArr5[i20 - 2] = obj3;
                int i21 = i20 - 1;
                this.AudioAttributesImplBaseParcelizer = i21;
                objArr5[i21] = null;
                return 0;
            case 17:
                Object[] objArr6 = this.MediaDescriptionCompat;
                int i22 = this.AudioAttributesImplBaseParcelizer;
                Object obj5 = objArr6[i22 - 1];
                objArr6[i22 - 1] = null;
                this.IconCompatParcelizer = obj5;
                return 0;
            case 18:
                int i23 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i23;
                this.MediaDescriptionCompat[i23] = null;
                return 0;
            case 19:
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                int i24 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i24 + 1;
                iArr8[i24] = 2;
                return 0;
            case 20:
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                this.write = jArr5[i25];
                return 0;
            case 21:
                Object[] objArr7 = this.MediaDescriptionCompat;
                int i26 = this.AudioAttributesImplBaseParcelizer;
                Object obj6 = objArr7[i26 - 1];
                objArr7[i26 - 1] = null;
                objArr7[i26] = obj6;
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                jArr6[i26 - 1] = jArr6[i26 - 2];
                objArr7[i26 - 2] = obj6;
                this.AudioAttributesImplBaseParcelizer = i26;
                objArr7[i26] = null;
                return 0;
            case 22:
                Object[] objArr8 = this.MediaDescriptionCompat;
                int i27 = this.AudioAttributesImplBaseParcelizer;
                Object obj7 = objArr8[i27 - 1];
                objArr8[i27 - 1] = null;
                Object obj8 = objArr8[i27 - 2];
                objArr8[i27 - 2] = null;
                objArr8[i27 - 1] = obj8;
                objArr8[i27 - 2] = obj7;
                return 0;
            case 23:
                Object[] objArr9 = this.MediaDescriptionCompat;
                int i28 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i28 + 1;
                Object obj9 = objArr9[i28 - 1];
                objArr9[i28 - 1] = null;
                objArr9[i28] = obj9;
                Object obj10 = objArr9[i28 - 2];
                objArr9[i28 - 2] = null;
                objArr9[i28 - 1] = obj10;
                objArr9[i28 - 2] = obj9;
                return 0;
            case 24:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i29] = 1;
                Object[] objArr10 = this.MediaDescriptionCompat;
                Object obj11 = objArr10[i29 - 1];
                objArr10[i29 - 1] = null;
                objArr10[i29] = obj11;
                iArr9[i29 - 1] = iArr9[i29];
                int i30 = i29 - 2;
                this.AudioAttributesImplBaseParcelizer = i30;
                Object obj12 = objArr10[i30];
                objArr10[i30] = null;
                int i31 = iArr9[i29 - 1];
                Object obj13 = objArr10[i29];
                objArr10[i29] = null;
                ((Object[]) obj12)[i31] = obj13;
                return 0;
            case 25:
                Object[] objArr11 = this.MediaDescriptionCompat;
                int i32 = this.AudioAttributesImplBaseParcelizer;
                Object obj14 = objArr11[i32 - 1];
                objArr11[i32 - 1] = null;
                objArr11[i32] = obj14;
                Object obj15 = objArr11[i32 - 2];
                objArr11[i32 - 2] = null;
                objArr11[i32 - 1] = obj15;
                objArr11[i32 - 2] = obj14;
                Object obj16 = objArr11[i32];
                objArr11[i32] = null;
                Object obj17 = objArr11[i32 - 1];
                objArr11[i32 - 1] = null;
                objArr11[i32] = obj17;
                objArr11[i32 - 1] = obj16;
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i32 + 2;
                iArr10[i32 + 1] = 0;
                return 0;
            case 26:
                Object[] objArr12 = this.MediaDescriptionCompat;
                int i33 = this.AudioAttributesImplBaseParcelizer;
                Object obj18 = objArr12[i33 - 2];
                objArr12[i33 - 2] = null;
                objArr12[i33 - 1] = obj18;
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                iArr11[i33 - 2] = iArr11[i33 - 1];
                return 0;
            case 27:
                int i34 = this.AudioAttributesImplBaseParcelizer;
                int i35 = i34 - 3;
                this.AudioAttributesImplBaseParcelizer = i35;
                Object[] objArr13 = this.MediaDescriptionCompat;
                Object obj19 = objArr13[i35];
                objArr13[i35] = null;
                int i36 = this.AudioAttributesImplApi21Parcelizer[i34 - 2];
                Object obj20 = objArr13[i34 - 1];
                objArr13[i34 - 1] = null;
                ((Object[]) obj19)[i36] = obj20;
                return 0;
            case 28:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i37 + 1;
                iArr12[i37] = 1;
                return 0;
            case 29:
                Object[] objArr14 = this.MediaDescriptionCompat;
                int i38 = this.AudioAttributesImplBaseParcelizer;
                Object obj21 = objArr14[i38 - 1];
                objArr14[i38 - 1] = null;
                Object obj22 = objArr14[i38 - 2];
                objArr14[i38 - 2] = null;
                objArr14[i38 - 1] = obj22;
                objArr14[i38 - 2] = obj21;
                this.AudioAttributesImplBaseParcelizer = i38 + 1;
                objArr14[i38] = null;
                return 0;
            case 30:
                int i39 = this.AudioAttributesImplBaseParcelizer;
                int i40 = i39 - 1;
                this.AudioAttributesImplBaseParcelizer = i40;
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i39 - 2] = iArr13[i39 - 2] % iArr13[i40];
                return 0;
            case 32:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.AudioAttributesImplBaseParcelizer;
                iArr14[i41] = 35;
                iArr14[i41 - 1] = iArr14[i41 - 1] + iArr14[i41];
                this.AudioAttributesImplBaseParcelizer = i41 + 1;
                iArr14[i41] = iArr14[i41 - 1];
            case 31:
                return 0;
            case 33:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.AudioAttributesImplBaseParcelizer;
                iArr15[i42] = 128;
                this.AudioAttributesImplBaseParcelizer = i42;
                iArr15[i42 - 1] = iArr15[i42 - 1] % iArr15[i42];
                return 0;
            case 34:
                int i43 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i43;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i43] != 0 ? 0 : 1;
                return 0;
            case 35:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i44] = 2;
                this.AudioAttributesImplBaseParcelizer = i44;
                iArr16[i44 - 1] = iArr16[i44 - 1] % iArr16[i44];
                return 0;
            case 36:
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i45 = this.AudioAttributesImplBaseParcelizer;
                jArr7[i45] = jArr7[10];
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplBaseParcelizer = i45 + 2;
                iArr17[i45 + 1] = 111;
                return 0;
            case 37:
                int i46 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr8 = this.AudioAttributesImplApi26Parcelizer;
                jArr8[i46 - 2] = jArr8[i46 - 2] >> this.AudioAttributesImplApi21Parcelizer[i46 - 1];
                int i47 = i46 - 2;
                this.AudioAttributesImplBaseParcelizer = i47;
                jArr8[i46 - 3] = jArr8[i46 - 3] ^ jArr8[i47];
                return 0;
            case 38:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.AudioAttributesImplBaseParcelizer;
                iArr18[i48] = 1;
                this.AudioAttributesImplBaseParcelizer = i48 + 2;
                iArr18[i48 + 1] = 1;
                return 0;
            case 39:
                int i49 = this.AudioAttributesImplBaseParcelizer;
                int i50 = i49 - 1;
                this.AudioAttributesImplBaseParcelizer = i50;
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                iArr19[i49 - 2] = iArr19[i49 - 2] / iArr19[i50];
                return 0;
            case 40:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i51 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i51 + 1;
                iArr20[i51] = 8081;
                return 0;
            case 41:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i52 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i52 - 1] = (byte) iArr21[i52 - 1];
                return 0;
            case 42:
                int i53 = this.AudioAttributesImplBaseParcelizer;
                int i54 = i53 - 1;
                this.AudioAttributesImplBaseParcelizer = i54;
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                iArr22[i53 - 2] = iArr22[i53 - 2] >>> iArr22[i54];
                iArr22[i53 - 2] = (char) iArr22[i53 - 2];
                return 0;
            case 43:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i55 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i55 + 1;
                iArr23[i55] = 49;
                return 0;
            case 44:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i56 = this.AudioAttributesImplBaseParcelizer;
                iArr24[i56] = iArr24[i56 - 1];
                this.AudioAttributesImplBaseParcelizer = i56 + 2;
                iArr24[i56 + 1] = 128;
                return 0;
            case 45:
                int i57 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i57;
                this.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer[i57] == 0 ? 0 : 1;
                return 0;
            case 46:
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                int i58 = this.AudioAttributesImplBaseParcelizer - 1;
                this.AudioAttributesImplBaseParcelizer = i58;
                this.AudioAttributesCompatParcelizer = iArr25[i58];
                return 0;
            case 47:
                for (int i59 = this.AudioAttributesImplBaseParcelizer - 1; i59 >= 0; i59--) {
                    this.MediaDescriptionCompat[i59] = null;
                }
                Object[] objArr15 = this.MediaDescriptionCompat;
                this.AudioAttributesImplBaseParcelizer = 1;
                objArr15[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
