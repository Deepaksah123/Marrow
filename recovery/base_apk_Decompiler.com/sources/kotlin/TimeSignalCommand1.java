package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class TimeSignalCommand1 {
    public int AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public long read;
    public Object write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[12];
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[12];
    private final double[] RatingCompat = new double[12];

    public TimeSignalCommand1(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi21Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaDescriptionCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.MediaBrowserCompatItemReceiver;
                jArr[i2] = jArr[8];
                jArr[i2 + 1] = jArr[10];
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatItemReceiver;
                long[] jArr2 = this.AudioAttributesImplApi21Parcelizer;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.AudioAttributesImplBaseParcelizer[i3 - 1];
                jArr2[i3 - 3] = jArr2[i3 - 3] ^ jArr2[i3 - 2];
                int i4 = i3 - 3;
                this.MediaBrowserCompatItemReceiver = i4;
                jArr2[8] = jArr2[i4];
                return 0;
            case 3:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i5 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i5 + 1;
                iArr2[i5] = 1;
                return 0;
            case 4:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i6 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i6 + 1;
                iArr3[i6] = 0;
                return 0;
            case 5:
                int i7 = this.MediaBrowserCompatItemReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = i7;
                this.AudioAttributesImplApi26Parcelizer = i7;
                return 0;
            case 6:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i8 + 1;
                this.IconCompatParcelizer = iArr4[i8];
                return 0;
            case 7:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i9 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i9 + 1;
                iArr5[i9] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 8:
                Object[] objArr = this.MediaDescriptionCompat;
                int i10 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i10 + 1;
                objArr[i10] = this.RemoteActionCompatParcelizer;
                return 0;
            case 9:
                int i11 = this.MediaBrowserCompatItemReceiver;
                int i12 = i11 - 1;
                this.MediaBrowserCompatItemReceiver = i12;
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                iArr6[i11 - 2] = iArr6[i11 - 2] + iArr6[i12];
                return 0;
            case 10:
                Object[] objArr2 = this.MediaDescriptionCompat;
                int i13 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i13 + 1;
                Object obj = objArr2[i13];
                objArr2[i13] = null;
                this.write = obj;
                return 0;
            case 11:
                long[] jArr3 = this.AudioAttributesImplApi21Parcelizer;
                int i14 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i14 + 1;
                jArr3[i14] = jArr3[8];
                return 0;
            case 12:
                Object[] objArr3 = this.MediaDescriptionCompat;
                int i15 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i15 + 1;
                objArr3[i15] = objArr3[i15 - 1];
                return 0;
            case 13:
                int i16 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i16;
                Object[] objArr4 = this.MediaDescriptionCompat;
                Object obj2 = objArr4[i16];
                objArr4[i16] = null;
                this.IconCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr5 = this.MediaDescriptionCompat;
                int i17 = this.MediaBrowserCompatItemReceiver;
                Object obj3 = objArr5[i17 - 1];
                objArr5[i17 - 1] = null;
                Object obj4 = objArr5[i17 - 2];
                objArr5[i17 - 2] = null;
                objArr5[i17 - 1] = obj4;
                objArr5[i17 - 2] = obj3;
                int i18 = i17 - 1;
                this.MediaBrowserCompatItemReceiver = i18;
                objArr5[i18] = null;
                return 0;
            case 15:
                Object[] objArr6 = this.MediaDescriptionCompat;
                int i19 = this.MediaBrowserCompatItemReceiver;
                Object obj5 = objArr6[i19 - 1];
                objArr6[i19 - 1] = null;
                this.write = obj5;
                return 0;
            case 16:
                int i20 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i20;
                this.MediaDescriptionCompat[i20] = null;
                return 0;
            case 17:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i21 + 1;
                iArr7[i21] = 2;
                return 0;
            case 18:
                long[] jArr4 = this.AudioAttributesImplApi21Parcelizer;
                int i22 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i22 + 1;
                this.read = jArr4[i22];
                return 0;
            case 19:
                Object[] objArr7 = this.MediaDescriptionCompat;
                int i23 = this.MediaBrowserCompatItemReceiver;
                Object obj6 = objArr7[i23 - 1];
                objArr7[i23 - 1] = null;
                objArr7[i23] = obj6;
                long[] jArr5 = this.AudioAttributesImplApi21Parcelizer;
                jArr5[i23 - 1] = jArr5[i23 - 2];
                objArr7[i23 - 2] = obj6;
                this.MediaBrowserCompatItemReceiver = i23;
                objArr7[i23] = null;
                return 0;
            case 20:
                Object[] objArr8 = this.MediaDescriptionCompat;
                int i24 = this.MediaBrowserCompatItemReceiver;
                Object obj7 = objArr8[i24 - 1];
                objArr8[i24 - 1] = null;
                Object obj8 = objArr8[i24 - 2];
                objArr8[i24 - 2] = null;
                objArr8[i24 - 1] = obj8;
                objArr8[i24 - 2] = obj7;
                return 0;
            case 21:
                Object[] objArr9 = this.MediaDescriptionCompat;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                Object obj9 = objArr9[i25 - 1];
                objArr9[i25 - 1] = null;
                objArr9[i25] = obj9;
                Object obj10 = objArr9[i25 - 2];
                objArr9[i25 - 2] = null;
                objArr9[i25 - 1] = obj10;
                objArr9[i25 - 2] = obj9;
                return 0;
            case 22:
                Object[] objArr10 = this.MediaDescriptionCompat;
                int i26 = this.MediaBrowserCompatItemReceiver;
                Object obj11 = objArr10[i26 - 2];
                objArr10[i26 - 2] = null;
                objArr10[i26 - 1] = obj11;
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                iArr8[i26 - 2] = iArr8[i26 - 1];
                return 0;
            case 23:
                int i27 = this.MediaBrowserCompatItemReceiver;
                int i28 = i27 - 3;
                this.MediaBrowserCompatItemReceiver = i28;
                Object[] objArr11 = this.MediaDescriptionCompat;
                Object obj12 = objArr11[i28];
                objArr11[i28] = null;
                int i29 = this.AudioAttributesImplBaseParcelizer[i27 - 2];
                Object obj13 = objArr11[i27 - 1];
                objArr11[i27 - 1] = null;
                ((Object[]) obj12)[i29] = obj13;
                this.MediaBrowserCompatItemReceiver = i27 - 2;
                Object obj14 = objArr11[i27 - 4];
                objArr11[i27 - 4] = null;
                objArr11[i28] = obj14;
                Object obj15 = objArr11[i27 - 5];
                objArr11[i27 - 5] = null;
                objArr11[i27 - 4] = obj15;
                objArr11[i27 - 5] = obj14;
                return 0;
            case 24:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i30 = this.MediaBrowserCompatItemReceiver;
                iArr9[i30] = 0;
                Object[] objArr12 = this.MediaDescriptionCompat;
                Object obj16 = objArr12[i30 - 1];
                objArr12[i30 - 1] = null;
                objArr12[i30] = obj16;
                iArr9[i30 - 1] = iArr9[i30];
                int i31 = i30 - 2;
                this.MediaBrowserCompatItemReceiver = i31;
                Object obj17 = objArr12[i31];
                objArr12[i31] = null;
                int i32 = iArr9[i30 - 1];
                Object obj18 = objArr12[i30];
                objArr12[i30] = null;
                ((Object[]) obj17)[i32] = obj18;
                return 0;
            case 25:
                int i33 = this.MediaBrowserCompatItemReceiver;
                int i34 = i33 - 3;
                this.MediaBrowserCompatItemReceiver = i34;
                Object[] objArr13 = this.MediaDescriptionCompat;
                Object obj19 = objArr13[i34];
                objArr13[i34] = null;
                int i35 = this.AudioAttributesImplBaseParcelizer[i33 - 2];
                Object obj20 = objArr13[i33 - 1];
                objArr13[i33 - 1] = null;
                ((Object[]) obj19)[i35] = obj20;
                return 0;
            case 26:
                Object[] objArr14 = this.MediaDescriptionCompat;
                int i36 = this.MediaBrowserCompatItemReceiver;
                objArr14[i36] = objArr14[i36 - 1];
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i36 + 2;
                iArr10[i36 + 1] = 1;
                return 0;
            case 27:
                Object[] objArr15 = this.MediaDescriptionCompat;
                int i37 = this.MediaBrowserCompatItemReceiver;
                Object obj21 = objArr15[i37 - 1];
                objArr15[i37 - 1] = null;
                Object obj22 = objArr15[i37 - 2];
                objArr15[i37 - 2] = null;
                objArr15[i37 - 1] = obj22;
                objArr15[i37 - 2] = obj21;
                this.MediaBrowserCompatItemReceiver = i37 + 1;
                objArr15[i37] = null;
                Object obj23 = objArr15[i37];
                objArr15[i37] = null;
                Object obj24 = objArr15[i37 - 1];
                objArr15[i37 - 1] = null;
                objArr15[i37] = obj24;
                objArr15[i37 - 1] = obj23;
                return 0;
            case 28:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.MediaBrowserCompatItemReceiver;
                iArr11[i38] = 2;
                iArr11[i38 + 1] = 2;
                int i39 = i38 + 1;
                this.MediaBrowserCompatItemReceiver = i39;
                iArr11[i38] = iArr11[i38] % iArr11[i39];
                return 0;
            case 29:
                int i40 = this.MediaBrowserCompatItemReceiver;
                int i41 = i40 - 1;
                this.MediaBrowserCompatItemReceiver = i41;
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                iArr12[i40 - 2] = iArr12[i40 - 2] % iArr12[i41];
                return 0;
            case 30:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i42 = this.MediaBrowserCompatItemReceiver;
                iArr13[i42] = 5;
                this.MediaBrowserCompatItemReceiver = i42;
                iArr13[i42 - 1] = iArr13[i42 - 1] + iArr13[i42];
                return 0;
            case 31:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i43 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i43 + 1;
                iArr14[i43] = iArr14[i43 - 1];
                return 0;
            case 32:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i44 = this.MediaBrowserCompatItemReceiver;
                iArr15[i44] = 128;
                this.MediaBrowserCompatItemReceiver = i44;
                iArr15[i44 - 1] = iArr15[i44 - 1] % iArr15[i44];
                return 0;
            case 33:
                int i45 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i45;
                this.IconCompatParcelizer = this.AudioAttributesImplBaseParcelizer[i45] == 0 ? 0 : 1;
                return 0;
            case 34:
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                int i46 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i46 + 1;
                iArr16[i46] = 3;
                return 0;
            case 35:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i47 = this.MediaBrowserCompatItemReceiver;
                iArr17[i47] = 2;
                this.MediaBrowserCompatItemReceiver = i47;
                iArr17[i47 - 1] = iArr17[i47 - 1] % iArr17[i47];
                return 0;
            case 36:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i48 = this.MediaBrowserCompatItemReceiver;
                iArr18[i48] = 103;
                iArr18[i48 - 1] = iArr18[i48 - 1] + iArr18[i48];
                this.MediaBrowserCompatItemReceiver = i48 + 1;
                iArr18[i48] = iArr18[i48 - 1];
                return 0;
            case 37:
                long[] jArr6 = this.AudioAttributesImplApi21Parcelizer;
                int i49 = this.MediaBrowserCompatItemReceiver;
                jArr6[i49] = jArr6[8];
                jArr6[i49 + 1] = jArr6[10];
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i49 + 3;
                iArr19[i49 + 2] = 0;
                return 0;
            case 38:
                int i50 = this.MediaBrowserCompatItemReceiver;
                long[] jArr7 = this.AudioAttributesImplApi21Parcelizer;
                jArr7[i50 - 2] = jArr7[i50 - 2] << this.AudioAttributesImplBaseParcelizer[i50 - 1];
                jArr7[i50 - 3] = jArr7[i50 - 3] & jArr7[i50 - 2];
                int i51 = i50 - 3;
                this.MediaBrowserCompatItemReceiver = i51;
                jArr7[8] = jArr7[i51];
                return 0;
            case 39:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i52 = this.MediaBrowserCompatItemReceiver;
                iArr20[i52] = 1;
                this.MediaBrowserCompatItemReceiver = i52 + 2;
                iArr20[i52 + 1] = 0;
                return 0;
            case 40:
                int i53 = this.MediaBrowserCompatItemReceiver;
                int i54 = i53 - 1;
                this.MediaBrowserCompatItemReceiver = i54;
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i53 - 2] = iArr21[i53 - 2] * iArr21[i54];
                return 0;
            case 41:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i55 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i55;
                this.IconCompatParcelizer = iArr22[i55];
                return 0;
            case 42:
                for (int i56 = this.MediaBrowserCompatItemReceiver - 1; i56 >= 0; i56--) {
                    this.MediaDescriptionCompat[i56] = null;
                }
                Object[] objArr16 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr16[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
