package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class buildEventStream {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public int write;
    private final int[] AudioAttributesImplApi21Parcelizer = new int[5];
    private final long[] MediaBrowserCompatCustomActionResultReceiver = new long[5];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[5];
    private final double[] MediaBrowserCompatItemReceiver = new double[5];

    public buildEventStream(Object obj) {
        Object[] objArr = new Object[5];
        this.MediaDescriptionCompat = objArr;
        objArr[4] = obj;
        this.IconCompatParcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                int i2 = this.IconCompatParcelizer - this.read;
                this.IconCompatParcelizer = i2;
                this.AudioAttributesImplBaseParcelizer = i2;
                return 0;
            case 2:
                Object[] objArr = this.MediaDescriptionCompat;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.AudioAttributesCompatParcelizer = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i4 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i4 + 1;
                objArr2[i4] = this.RemoteActionCompatParcelizer;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i5 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i5 + 1;
                objArr3[i5] = objArr3[4];
                return 0;
            case 5:
                int[] iArr = this.AudioAttributesImplApi21Parcelizer;
                int i6 = this.IconCompatParcelizer;
                iArr[i6] = 2;
                this.IconCompatParcelizer = i6 + 2;
                iArr[i6 + 1] = 2;
                return 0;
            case 6:
                int i7 = this.IconCompatParcelizer;
                int i8 = i7 - 1;
                this.IconCompatParcelizer = i8;
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.IconCompatParcelizer = i9;
                this.MediaDescriptionCompat[i9] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.MediaDescriptionCompat;
                int i10 = this.IconCompatParcelizer;
                Object obj2 = objArr4[i10 - 1];
                objArr4[i10 - 1] = null;
                this.AudioAttributesCompatParcelizer = obj2;
            case 7:
                return 0;
            case 9:
                int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i11 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i11 + 1;
                iArr3[i11] = this.read;
                return 0;
            case 10:
                int[] iArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i12 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i12 + 1;
                iArr4[i12] = 21;
                return 0;
            case 11:
                int i13 = this.IconCompatParcelizer;
                int i14 = i13 - 1;
                this.IconCompatParcelizer = i14;
                int[] iArr5 = this.AudioAttributesImplApi21Parcelizer;
                iArr5[i13 - 2] = iArr5[i13 - 2] + iArr5[i14];
                return 0;
            case 12:
                int[] iArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i15 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i15 + 1;
                iArr6[i15] = iArr6[i15 - 1];
                return 0;
            case 13:
                int[] iArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i16 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i16 + 1;
                iArr7[i16] = 128;
                return 0;
            case 14:
                int i17 = this.IconCompatParcelizer;
                int i18 = i17 - 1;
                this.IconCompatParcelizer = i18;
                int[] iArr8 = this.AudioAttributesImplApi21Parcelizer;
                iArr8[i17 - 2] = iArr8[i17 - 2] % iArr8[i18];
                return 0;
            case 15:
                int[] iArr9 = this.AudioAttributesImplApi21Parcelizer;
                int i19 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i19 + 1;
                this.write = iArr9[i19];
                return 0;
            case 16:
                int[] iArr10 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i20 + 1;
                iArr10[i20] = 2;
                return 0;
            case 17:
                int i21 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i21;
                this.write = this.AudioAttributesImplApi21Parcelizer[i21] == 0 ? 0 : 1;
                return 0;
            case 18:
                int[] iArr11 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i22 + 1;
                iArr11[i22] = 91;
                return 0;
            case 19:
                int[] iArr12 = this.AudioAttributesImplApi21Parcelizer;
                int i23 = this.IconCompatParcelizer;
                iArr12[i23] = 0;
                this.IconCompatParcelizer = i23;
                iArr12[i23 - 1] = iArr12[i23 - 1] / iArr12[i23];
                int i24 = i23 - 1;
                this.IconCompatParcelizer = i24;
                this.MediaDescriptionCompat[i24] = null;
                return 0;
            case 20:
                int[] iArr13 = this.AudioAttributesImplApi21Parcelizer;
                int i25 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i25 + 1;
                iArr13[i25] = 117;
                return 0;
            case 21:
                int[] iArr14 = this.AudioAttributesImplApi21Parcelizer;
                int i26 = this.IconCompatParcelizer;
                iArr14[i26] = iArr14[i26 - 1];
                iArr14[i26 + 1] = 128;
                int i27 = i26 + 1;
                this.IconCompatParcelizer = i27;
                iArr14[i26] = iArr14[i26] % iArr14[i27];
                return 0;
            case 22:
                int i28 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i28;
                this.write = this.AudioAttributesImplApi21Parcelizer[i28] != 0 ? 0 : 1;
                return 0;
            case 23:
                int[] iArr15 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.IconCompatParcelizer;
                iArr15[i29] = 2;
                this.IconCompatParcelizer = i29;
                iArr15[i29 - 1] = iArr15[i29 - 1] % iArr15[i29];
                return 0;
            case 24:
                int[] iArr16 = this.AudioAttributesImplApi21Parcelizer;
                int i30 = this.IconCompatParcelizer;
                iArr16[i30] = 77;
                iArr16[i30 + 1] = 0;
                int i31 = i30 + 1;
                this.IconCompatParcelizer = i31;
                iArr16[i30] = iArr16[i30] / iArr16[i31];
                return 0;
            case 25:
                int i32 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i32;
                this.MediaDescriptionCompat[i32] = null;
                return 0;
            case 26:
                int[] iArr17 = this.AudioAttributesImplApi21Parcelizer;
                int i33 = this.IconCompatParcelizer - 1;
                this.IconCompatParcelizer = i33;
                this.write = iArr17[i33];
                return 0;
            case 27:
                int[] iArr18 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i34 + 1;
                iArr18[i34] = 1;
                return 0;
            case 28:
                int[] iArr19 = this.AudioAttributesImplApi21Parcelizer;
                int i35 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i35 + 1;
                iArr19[i35] = 0;
                return 0;
            case 29:
                int[] iArr20 = this.AudioAttributesImplApi21Parcelizer;
                int i36 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i36 + 1;
                iArr20[i36] = 70;
                return 0;
            case 30:
                int[] iArr21 = this.AudioAttributesImplApi21Parcelizer;
                int i37 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i37 + 1;
                iArr21[i37] = 57;
                return 0;
            case 31:
                for (int i38 = this.IconCompatParcelizer - 1; i38 >= 0; i38--) {
                    this.MediaDescriptionCompat[i38] = null;
                }
                Object[] objArr5 = this.MediaDescriptionCompat;
                this.IconCompatParcelizer = 1;
                objArr5[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 32:
                int[] iArr22 = this.AudioAttributesImplApi21Parcelizer;
                int i39 = this.IconCompatParcelizer;
                iArr22[i39] = 2;
                iArr22[i39 + 1] = 2;
                int i40 = i39 + 1;
                this.IconCompatParcelizer = i40;
                iArr22[i39] = iArr22[i39] % iArr22[i40];
                return 0;
            case 33:
                int[] iArr23 = this.AudioAttributesImplApi21Parcelizer;
                int i41 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i41 + 1;
                iArr23[i41] = 23;
                return 0;
            case 34:
                int[] iArr24 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = this.IconCompatParcelizer;
                iArr24[i42] = iArr24[i42 - 1];
                this.IconCompatParcelizer = i42 + 2;
                iArr24[i42 + 1] = 128;
                return 0;
            case 35:
                Object[] objArr6 = this.MediaDescriptionCompat;
                int i43 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i43 + 1;
                objArr6[i43] = null;
                int[] iArr25 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr6[i43];
                objArr6[i43] = null;
                iArr25[i43] = ((int[]) obj3).length;
                return 0;
            case 36:
                int[] iArr26 = this.AudioAttributesImplApi21Parcelizer;
                int i44 = this.IconCompatParcelizer;
                iArr26[i44] = 41;
                this.IconCompatParcelizer = i44;
                iArr26[i44 - 1] = iArr26[i44 - 1] + iArr26[i44];
                return 0;
            case 37:
                Object[] objArr7 = this.MediaDescriptionCompat;
                int i45 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i45 + 1;
                objArr7[i45] = null;
                return 0;
            case 38:
                int[] iArr27 = this.AudioAttributesImplApi21Parcelizer;
                int i46 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i46 + 1;
                iArr27[i46] = 51;
                return 0;
            case 39:
                int[] iArr28 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i47 + 1;
                iArr28[i47] = 53;
                return 0;
            case 40:
                int[] iArr29 = this.AudioAttributesImplApi21Parcelizer;
                int i48 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i48 + 1;
                iArr29[i48] = 22;
                return 0;
            case 41:
                int[] iArr30 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i49 + 1;
                iArr30[i49] = 64;
                return 0;
            default:
                return i;
        }
    }
}
