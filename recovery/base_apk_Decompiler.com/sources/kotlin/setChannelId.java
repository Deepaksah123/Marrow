package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class setChannelId {
    public long AudioAttributesCompatParcelizer;
    private final long[] AudioAttributesImplApi21Parcelizer;
    public int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public int write;
    private final int[] AudioAttributesImplApi26Parcelizer = new int[12];
    private final float[] AudioAttributesImplBaseParcelizer = new float[12];
    private final double[] MediaDescriptionCompat = new double[12];

    public setChannelId(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplApi21Parcelizer = jArr;
        Object[] objArr = new Object[12];
        this.RatingCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 1;
                jArr[i2] = jArr[8];
                return 0;
            case 2:
                long[] jArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                jArr2[i3] = jArr2[10];
                return 0;
            case 3:
                int[] iArr = this.AudioAttributesImplApi26Parcelizer;
                int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr[i4] = 32;
                this.MediaBrowserCompatCustomActionResultReceiver = i4;
                long[] jArr3 = this.AudioAttributesImplApi21Parcelizer;
                jArr3[i4 - 1] = jArr3[i4 - 1] << iArr[i4];
                return 0;
            case 4:
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = i5 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                long[] jArr4 = this.AudioAttributesImplApi21Parcelizer;
                jArr4[i5 - 2] = jArr4[i5 - 2] ^ jArr4[i6];
                return 0;
            case 5:
                int i7 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i7;
                long[] jArr5 = this.AudioAttributesImplApi21Parcelizer;
                jArr5[8] = jArr5[i7];
                return 0;
            case 6:
                int[] iArr2 = this.AudioAttributesImplApi26Parcelizer;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i8 + 1;
                iArr2[i8] = 2;
                return 0;
            case 7:
                int[] iArr3 = this.AudioAttributesImplApi26Parcelizer;
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i9 + 1;
                iArr3[i9] = this.write;
                return 0;
            case 8:
                int[] iArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i10 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i10 + 1;
                iArr4[i10] = 16;
                return 0;
            case 9:
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = i11 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i12;
                int[] iArr5 = this.AudioAttributesImplApi26Parcelizer;
                iArr5[i11 - 2] = iArr5[i11 - 2] >> iArr5[i12];
                return 0;
            case 10:
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = i13 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i14;
                int[] iArr6 = this.AudioAttributesImplApi26Parcelizer;
                iArr6[i13 - 2] = iArr6[i13 - 2] - iArr6[i14];
                return 0;
            case 11:
                Object[] objArr = this.RatingCompat;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 1;
                objArr[i15] = this.RemoteActionCompatParcelizer;
                return 0;
            case 12:
                int[] iArr7 = this.AudioAttributesImplApi26Parcelizer;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                iArr7[i16] = 35;
                return 0;
            case 13:
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver - this.write;
                this.MediaBrowserCompatCustomActionResultReceiver = i17;
                this.MediaBrowserCompatItemReceiver = i17;
                return 0;
            case 14:
                Object[] objArr2 = this.RatingCompat;
                int i18 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i18 + 1;
                Object obj = objArr2[i18];
                objArr2[i18] = null;
                this.read = obj;
                return 0;
            case 15:
                int[] iArr8 = this.AudioAttributesImplApi26Parcelizer;
                int i19 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i19 + 1;
                this.IconCompatParcelizer = iArr8[i19];
                return 0;
            case 16:
                int[] iArr9 = this.AudioAttributesImplApi26Parcelizer;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 1;
                iArr9[i20] = 48;
                return 0;
            case 17:
                int[] iArr10 = this.AudioAttributesImplApi26Parcelizer;
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr10[i21 - 1] = (byte) iArr10[i21 - 1];
                return 0;
            case 18:
                Object[] objArr3 = this.RatingCompat;
                int i22 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i22 + 1;
                objArr3[i22] = objArr3[i22 - 1];
                return 0;
            case 19:
                int i23 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i23;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i23];
                objArr4[i23] = null;
                this.IconCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 20:
                Object[] objArr5 = this.RatingCompat;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj3 = objArr5[i24 - 1];
                objArr5[i24 - 1] = null;
                Object obj4 = objArr5[i24 - 2];
                objArr5[i24 - 2] = null;
                objArr5[i24 - 1] = obj4;
                objArr5[i24 - 2] = obj3;
                int i25 = i24 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i25;
                objArr5[i25] = null;
                return 0;
            case 21:
                Object[] objArr6 = this.RatingCompat;
                int i26 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj5 = objArr6[i26 - 1];
                objArr6[i26 - 1] = null;
                this.read = obj5;
                return 0;
            case 22:
                int i27 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i27;
                this.RatingCompat[i27] = null;
                return 0;
            case 23:
                Object[] objArr7 = this.RatingCompat;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj6 = objArr7[i28 - 1];
                objArr7[i28 - 1] = null;
                objArr7[i28] = obj6;
                long[] jArr6 = this.AudioAttributesImplApi21Parcelizer;
                jArr6[i28 - 1] = jArr6[i28 - 2];
                objArr7[i28 - 2] = obj6;
                this.MediaBrowserCompatCustomActionResultReceiver = i28;
                objArr7[i28] = null;
                return 0;
            case 24:
                long[] jArr7 = this.AudioAttributesImplApi21Parcelizer;
                int i29 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i29 + 1;
                this.AudioAttributesCompatParcelizer = jArr7[i29];
                return 0;
            case 25:
                Object[] objArr8 = this.RatingCompat;
                int i30 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj7 = objArr8[i30 - 1];
                objArr8[i30 - 1] = null;
                Object obj8 = objArr8[i30 - 2];
                objArr8[i30 - 2] = null;
                objArr8[i30 - 1] = obj8;
                objArr8[i30 - 2] = obj7;
                return 0;
            case 26:
                Object[] objArr9 = this.RatingCompat;
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj9 = objArr9[i31 - 1];
                objArr9[i31 - 1] = null;
                objArr9[i31] = obj9;
                Object obj10 = objArr9[i31 - 2];
                objArr9[i31 - 2] = null;
                objArr9[i31 - 1] = obj10;
                objArr9[i31 - 2] = obj9;
                Object obj11 = objArr9[i31];
                objArr9[i31] = null;
                Object obj12 = objArr9[i31 - 1];
                objArr9[i31 - 1] = null;
                objArr9[i31] = obj12;
                objArr9[i31 - 1] = obj11;
                int[] iArr11 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i31 + 2;
                iArr11[i31 + 1] = 1;
                return 0;
            case 27:
                Object[] objArr10 = this.RatingCompat;
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj13 = objArr10[i32 - 2];
                objArr10[i32 - 2] = null;
                objArr10[i32 - 1] = obj13;
                int[] iArr12 = this.AudioAttributesImplApi26Parcelizer;
                iArr12[i32 - 2] = iArr12[i32 - 1];
                return 0;
            case 28:
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i34 = i33 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i34;
                Object[] objArr11 = this.RatingCompat;
                Object obj14 = objArr11[i34];
                objArr11[i34] = null;
                int i35 = this.AudioAttributesImplApi26Parcelizer[i33 - 2];
                Object obj15 = objArr11[i33 - 1];
                objArr11[i33 - 1] = null;
                ((Object[]) obj14)[i35] = obj15;
                return 0;
            case 29:
                Object[] objArr12 = this.RatingCompat;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj16 = objArr12[i36 - 1];
                objArr12[i36 - 1] = null;
                objArr12[i36] = obj16;
                Object obj17 = objArr12[i36 - 2];
                objArr12[i36 - 2] = null;
                objArr12[i36 - 1] = obj17;
                objArr12[i36 - 2] = obj16;
                Object obj18 = objArr12[i36];
                objArr12[i36] = null;
                Object obj19 = objArr12[i36 - 1];
                objArr12[i36 - 1] = null;
                objArr12[i36] = obj19;
                objArr12[i36 - 1] = obj18;
                int[] iArr13 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i36 + 2;
                iArr13[i36 + 1] = 0;
                return 0;
            case 30:
                Object[] objArr13 = this.RatingCompat;
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr13[i37] = objArr13[i37 - 1];
                int[] iArr14 = this.AudioAttributesImplApi26Parcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i37 + 2;
                iArr14[i37 + 1] = 0;
                return 0;
            case 31:
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i39 = i38 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i39;
                Object[] objArr14 = this.RatingCompat;
                Object obj20 = objArr14[i39];
                objArr14[i39] = null;
                int i40 = this.AudioAttributesImplApi26Parcelizer[i38 - 2];
                Object obj21 = objArr14[i38 - 1];
                objArr14[i38 - 1] = null;
                ((Object[]) obj20)[i40] = obj21;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 - 2;
                objArr14[i39] = objArr14[i38 - 4];
                return 0;
            case 32:
                int[] iArr15 = this.AudioAttributesImplApi26Parcelizer;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 1;
                iArr15[i41] = 1;
                return 0;
            case 33:
                Object[] objArr15 = this.RatingCompat;
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj22 = objArr15[i42 - 1];
                objArr15[i42 - 1] = null;
                Object obj23 = objArr15[i42 - 2];
                objArr15[i42 - 2] = null;
                objArr15[i42 - 1] = obj23;
                objArr15[i42 - 2] = obj22;
                this.MediaBrowserCompatCustomActionResultReceiver = i42 + 1;
                objArr15[i42] = null;
                Object obj24 = objArr15[i42];
                objArr15[i42] = null;
                Object obj25 = objArr15[i42 - 1];
                objArr15[i42 - 1] = null;
                objArr15[i42] = obj25;
                objArr15[i42 - 1] = obj24;
                return 0;
            case 34:
                int[] iArr16 = this.AudioAttributesImplApi26Parcelizer;
                int i43 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr16[i43] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i43 + 2;
                iArr16[i43 + 1] = 2;
                return 0;
            case 35:
                int i44 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i45 = i44 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i45;
                int[] iArr17 = this.AudioAttributesImplApi26Parcelizer;
                iArr17[i44 - 2] = iArr17[i44 - 2] % iArr17[i45];
                return 0;
            case 36:
                int i46 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i47 = i46 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i47;
                int[] iArr18 = this.AudioAttributesImplApi26Parcelizer;
                iArr18[i46 - 2] = iArr18[i46 - 2] % iArr18[i47];
                int i48 = i46 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i48;
                this.RatingCompat[i48] = null;
                return 0;
            case 37:
                int[] iArr19 = this.AudioAttributesImplApi26Parcelizer;
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i49] = 57;
                this.MediaBrowserCompatCustomActionResultReceiver = i49;
                iArr19[i49 - 1] = iArr19[i49 - 1] + iArr19[i49];
                return 0;
            case 38:
                int[] iArr20 = this.AudioAttributesImplApi26Parcelizer;
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i50 + 1;
                iArr20[i50] = iArr20[i50 - 1];
                return 0;
            case 39:
                int[] iArr21 = this.AudioAttributesImplApi26Parcelizer;
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i51] = 128;
                this.MediaBrowserCompatCustomActionResultReceiver = i51;
                iArr21[i51 - 1] = iArr21[i51 - 1] % iArr21[i51];
                return 0;
            case 40:
                int i52 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i52;
                this.IconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer[i52] != 0 ? 0 : 1;
                return 0;
            case 41:
                int[] iArr22 = this.AudioAttributesImplApi26Parcelizer;
                int i53 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i53 + 1;
                iArr22[i53] = 3;
                return 0;
            case 42:
                int[] iArr23 = this.AudioAttributesImplApi26Parcelizer;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr23[i54] = 4;
                this.MediaBrowserCompatCustomActionResultReceiver = i54;
                iArr23[i54 - 1] = iArr23[i54 - 1] - iArr23[i54];
                return 0;
            case 43:
                int[] iArr24 = this.AudioAttributesImplApi26Parcelizer;
                int i55 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr24[i55] = 49;
                iArr24[i55 - 1] = iArr24[i55 - 1] + iArr24[i55];
                this.MediaBrowserCompatCustomActionResultReceiver = i55 + 1;
                iArr24[i55] = iArr24[i55 - 1];
                return 0;
            case 44:
                int[] iArr25 = this.AudioAttributesImplApi26Parcelizer;
                int i56 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr25[i56] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i56;
                iArr25[i56 - 1] = iArr25[i56 - 1] % iArr25[i56];
                return 0;
            case 45:
                int[] iArr26 = this.AudioAttributesImplApi26Parcelizer;
                int i57 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i57;
                this.IconCompatParcelizer = iArr26[i57];
                return 0;
            case 46:
                int[] iArr27 = this.AudioAttributesImplApi26Parcelizer;
                int i58 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i58 + 1;
                iArr27[i58] = 0;
                return 0;
            case 47:
                for (int i59 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i59 >= 0; i59--) {
                    this.RatingCompat[i59] = null;
                }
                Object[] objArr16 = this.RatingCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr16[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
