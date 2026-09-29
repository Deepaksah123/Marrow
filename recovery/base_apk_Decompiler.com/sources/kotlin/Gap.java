package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class Gap {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public int IconCompatParcelizer;
    private final long[] MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public long RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[13];
    private final float[] MediaBrowserCompatMediaItem = new float[13];
    private final double[] MediaMetadataCompat = new double[13];

    public Gap(Object obj, long j, long j2) {
        long[] jArr = new long[13];
        this.MediaBrowserCompatCustomActionResultReceiver = jArr;
        Object[] objArr = new Object[13];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[8] = obj;
        jArr[9] = j;
        jArr[11] = j2;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = -1;
    }

    public int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                jArr[i2] = jArr[9];
                jArr[i2 + 1] = jArr[11];
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                long[] jArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.AudioAttributesImplBaseParcelizer[i3 - 1];
                int i4 = i3 - 2;
                this.AudioAttributesImplApi21Parcelizer = i4;
                jArr2[i3 - 3] = jArr2[i3 - 3] ^ jArr2[i4];
                return 0;
            case 3:
                int i5 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i5;
                long[] jArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr3[9] = jArr3[i5];
                return 0;
            case 4:
                int i6 = this.AudioAttributesImplApi21Parcelizer - this.IconCompatParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i6;
                this.AudioAttributesImplApi26Parcelizer = i6;
                return 0;
            case 5:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i7 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i7 + 1;
                Object obj = objArr[i7];
                objArr[i7] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 6:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i8 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                objArr2[i8] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 7:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i9 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i9 + 1;
                objArr3[i9] = objArr3[i9 - 1];
                return 0;
            case 8:
                int i10 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i10;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i10];
                objArr4[i10] = null;
                this.write = obj2 == null ? 0 : 1;
                return 0;
            case 9:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                Object obj3 = objArr5[i11 - 1];
                objArr5[i11 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj3;
                return 0;
            case 10:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                Object obj4 = objArr6[i12 - 1];
                objArr6[i12 - 1] = null;
                Object obj5 = objArr6[i12 - 2];
                objArr6[i12 - 2] = null;
                objArr6[i12 - 1] = obj5;
                objArr6[i12 - 2] = obj4;
                int i13 = i12 - 1;
                this.AudioAttributesImplApi21Parcelizer = i13;
                objArr6[i13] = null;
                return 0;
            case 11:
                int i14 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i14;
                this.MediaBrowserCompatSearchResultReceiver[i14] = null;
                return 0;
            case 12:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i15 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i15 + 1;
                objArr7[i15] = null;
                return 0;
            case 13:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i16 = this.AudioAttributesImplApi21Parcelizer;
                objArr8[i16] = objArr8[i16 - 1];
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i16 + 2;
                iArr2[i16 + 1] = 1;
                return 0;
            case 14:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i17 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i17 + 1;
                this.write = iArr3[i17];
                return 0;
            case 15:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i18 = this.AudioAttributesImplApi21Parcelizer;
                objArr9[i18] = null;
                this.AudioAttributesImplApi21Parcelizer = i18 + 2;
                objArr9[i18 + 1] = null;
                return 0;
            case 16:
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                int i20 = i19 - 1;
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj6 = objArr10[i20];
                objArr10[i20] = null;
                objArr10[8] = obj6;
                this.AudioAttributesImplApi21Parcelizer = i19;
                objArr10[i20] = obj6;
                return 0;
            case 17:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i21 + 1;
                iArr4[i21] = this.IconCompatParcelizer;
                return 0;
            case 18:
                int i22 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i22;
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                iArr5[11] = iArr5[i22];
                return 0;
            case 19:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                iArr6[i23] = 1;
                return 0;
            case 20:
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                int i24 = this.AudioAttributesImplApi21Parcelizer;
                objArr11[i24] = objArr11[i24 - 1];
                Object obj7 = objArr11[i24];
                objArr11[i24] = null;
                objArr11[12] = obj7;
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i24 + 1;
                iArr7[i24] = 4;
                return 0;
            case 21:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i25 + 1;
                iArr8[i25] = 24;
                return 0;
            case 22:
                int i26 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i26 - 2] = iArr9[i26 - 2] >> iArr9[i26 - 1];
                int i27 = i26 - 2;
                this.AudioAttributesImplApi21Parcelizer = i27;
                iArr9[i26 - 3] = iArr9[i26 - 3] - iArr9[i27];
                return 0;
            case 23:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i28 + 1;
                iArr10[i28] = iArr10[11];
                return 0;
            case 24:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i29 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i29 + 1;
                iArr11[i29] = 2;
                return 0;
            case 25:
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i30 + 1;
                Object obj8 = objArr12[i30 - 1];
                objArr12[i30 - 1] = null;
                objArr12[i30] = obj8;
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                iArr12[i30 - 1] = iArr12[i30 - 2];
                objArr12[i30 - 2] = obj8;
                return 0;
            case 26:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                iArr13[i31 - 1] = iArr13[i31 - 2];
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj9 = objArr13[i31 - 1];
                objArr13[i31 - 1] = null;
                objArr13[i31 - 2] = obj9;
                return 0;
            case 27:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i32 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i32 + 1;
                iArr14[i32] = 1;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj10 = objArr14[i32 - 1];
                objArr14[i32 - 1] = null;
                objArr14[i32] = obj10;
                iArr14[i32 - 1] = iArr14[i32];
                return 0;
            case 28:
                int i33 = this.AudioAttributesImplApi21Parcelizer;
                int i34 = i33 - 3;
                this.AudioAttributesImplApi21Parcelizer = i34;
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj11 = objArr15[i34];
                objArr15[i34] = null;
                int i35 = this.AudioAttributesImplBaseParcelizer[i33 - 2];
                Object obj12 = objArr15[i33 - 1];
                objArr15[i33 - 1] = null;
                ((Object[]) obj11)[i35] = obj12;
                return 0;
            case 29:
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                int i36 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i36 + 1;
                Object obj13 = objArr16[i36 - 1];
                objArr16[i36 - 1] = null;
                objArr16[i36] = obj13;
                Object obj14 = objArr16[i36 - 2];
                objArr16[i36 - 2] = null;
                objArr16[i36 - 1] = obj14;
                objArr16[i36 - 2] = obj13;
                return 0;
            case 30:
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                int i37 = this.AudioAttributesImplApi21Parcelizer;
                Object obj15 = objArr17[i37 - 1];
                objArr17[i37 - 1] = null;
                Object obj16 = objArr17[i37 - 2];
                objArr17[i37 - 2] = null;
                objArr17[i37 - 1] = obj16;
                objArr17[i37 - 2] = obj15;
                return 0;
            case 31:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i38 + 1;
                iArr15[i38] = 0;
                return 0;
            case 32:
                Object[] objArr18 = this.MediaBrowserCompatSearchResultReceiver;
                int i39 = this.AudioAttributesImplApi21Parcelizer;
                Object obj17 = objArr18[i39 - 2];
                objArr18[i39 - 2] = null;
                objArr18[i39 - 1] = obj17;
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i39 - 2] = iArr16[i39 - 1];
                return 0;
            case 33:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i40 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i40 + 1;
                iArr17[i40] = 6;
                return 0;
            case 34:
                int i41 = this.AudioAttributesImplApi21Parcelizer;
                int i42 = i41 - 1;
                this.AudioAttributesImplApi21Parcelizer = i42;
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                iArr18[i41 - 2] = iArr18[i41 - 2] - iArr18[i42];
                return 0;
            case 35:
                Object[] objArr19 = this.MediaBrowserCompatSearchResultReceiver;
                int i43 = this.AudioAttributesImplApi21Parcelizer;
                objArr19[i43] = objArr19[i43 - 1];
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i43 + 2;
                iArr19[i43 + 1] = 0;
                return 0;
            case 36:
                Object[] objArr20 = this.MediaBrowserCompatSearchResultReceiver;
                int i44 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i44 + 1;
                Object obj18 = objArr20[i44 - 1];
                objArr20[i44 - 1] = null;
                objArr20[i44] = obj18;
                Object obj19 = objArr20[i44 - 2];
                objArr20[i44 - 2] = null;
                objArr20[i44 - 1] = obj19;
                Object obj20 = objArr20[i44 - 3];
                objArr20[i44 - 3] = null;
                objArr20[i44 - 2] = obj20;
                objArr20[i44 - 3] = obj18;
                return 0;
            case 37:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i45 = this.AudioAttributesImplApi21Parcelizer;
                iArr20[i45] = -47;
                this.AudioAttributesImplApi21Parcelizer = i45 + 2;
                iArr20[i45 + 1] = 48;
                return 0;
            case 38:
                int i46 = this.AudioAttributesImplApi21Parcelizer;
                int i47 = i46 - 1;
                this.AudioAttributesImplApi21Parcelizer = i47;
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i46 - 2] = iArr21[i46 - 2] + iArr21[i47];
                return 0;
            case 39:
                long[] jArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i48 = this.AudioAttributesImplApi21Parcelizer;
                jArr4[i48] = jArr4[9];
                Object[] objArr21 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = i48 + 2;
                objArr21[i48 + 1] = objArr21[12];
                return 0;
            case 40:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i49 + 1;
                iArr22[i49] = 3;
                return 0;
            case 41:
                Object[] objArr22 = this.MediaBrowserCompatSearchResultReceiver;
                int i50 = this.AudioAttributesImplApi21Parcelizer;
                Object obj21 = objArr22[i50 - 1];
                objArr22[i50 - 1] = null;
                objArr22[i50] = obj21;
                Object obj22 = objArr22[i50 - 2];
                objArr22[i50 - 2] = null;
                objArr22[i50 - 1] = obj22;
                objArr22[i50 - 2] = obj21;
                Object obj23 = objArr22[i50];
                objArr22[i50] = null;
                Object obj24 = objArr22[i50 - 1];
                objArr22[i50 - 1] = null;
                objArr22[i50] = obj24;
                objArr22[i50 - 1] = obj23;
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i50 + 2;
                iArr23[i50 + 1] = 2;
                return 0;
            case 42:
                Object[] objArr23 = this.MediaBrowserCompatSearchResultReceiver;
                int i51 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i51 + 1;
                Object obj25 = objArr23[i51 - 1];
                objArr23[i51 - 1] = null;
                objArr23[i51] = obj25;
                long[] jArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr5[i51 - 1] = jArr5[i51 - 2];
                objArr23[i51 - 2] = obj25;
                return 0;
            case 43:
                long[] jArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i52 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplApi26Parcelizer = i52 + 1;
                this.read = jArr6[i52];
                return 0;
            case 44:
                Object[] objArr24 = this.MediaBrowserCompatSearchResultReceiver;
                int i53 = this.AudioAttributesImplApi21Parcelizer;
                Object obj26 = objArr24[i53 - 1];
                objArr24[i53 - 1] = null;
                Object obj27 = objArr24[i53 - 2];
                objArr24[i53 - 2] = null;
                objArr24[i53 - 1] = obj27;
                objArr24[i53 - 2] = obj26;
                this.AudioAttributesImplApi21Parcelizer = i53 + 1;
                Object obj28 = objArr24[i53 - 1];
                objArr24[i53 - 1] = null;
                objArr24[i53] = obj28;
                Object obj29 = objArr24[i53 - 2];
                objArr24[i53 - 2] = null;
                objArr24[i53 - 1] = obj29;
                objArr24[i53 - 2] = obj28;
                Object obj30 = objArr24[i53];
                objArr24[i53] = null;
                Object obj31 = objArr24[i53 - 1];
                objArr24[i53 - 1] = null;
                objArr24[i53] = obj31;
                objArr24[i53 - 1] = obj30;
                return 0;
            case 45:
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                int i54 = this.AudioAttributesImplApi21Parcelizer;
                iArr24[i54] = 1;
                Object[] objArr25 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj32 = objArr25[i54 - 1];
                objArr25[i54 - 1] = null;
                objArr25[i54] = obj32;
                iArr24[i54 - 1] = iArr24[i54];
                int i55 = i54 - 2;
                this.AudioAttributesImplApi21Parcelizer = i55;
                Object obj33 = objArr25[i55];
                objArr25[i55] = null;
                int i56 = iArr24[i54 - 1];
                Object obj34 = objArr25[i54];
                objArr25[i54] = null;
                ((Object[]) obj33)[i56] = obj34;
                return 0;
            case 46:
                Object[] objArr26 = this.MediaBrowserCompatSearchResultReceiver;
                int i57 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i57 + 1;
                Object obj35 = objArr26[i57 - 1];
                objArr26[i57 - 1] = null;
                objArr26[i57] = obj35;
                Object obj36 = objArr26[i57 - 2];
                objArr26[i57 - 2] = null;
                objArr26[i57 - 1] = obj36;
                objArr26[i57 - 2] = obj35;
                Object obj37 = objArr26[i57];
                objArr26[i57] = null;
                Object obj38 = objArr26[i57 - 1];
                objArr26[i57 - 1] = null;
                objArr26[i57] = obj38;
                objArr26[i57 - 1] = obj37;
                return 0;
            case 47:
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                int i58 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i58 + 1;
                iArr25[i58] = 0;
                Object[] objArr27 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj39 = objArr27[i58 - 1];
                objArr27[i58 - 1] = null;
                objArr27[i58] = obj39;
                iArr25[i58 - 1] = iArr25[i58];
                return 0;
            case 48:
                int i59 = this.AudioAttributesImplApi21Parcelizer;
                int i60 = i59 - 3;
                this.AudioAttributesImplApi21Parcelizer = i60;
                Object[] objArr28 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj40 = objArr28[i60];
                objArr28[i60] = null;
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                int i61 = iArr26[i59 - 2];
                Object obj41 = objArr28[i59 - 1];
                objArr28[i59 - 1] = null;
                ((Object[]) obj40)[i61] = obj41;
                objArr28[i60] = objArr28[i59 - 4];
                this.AudioAttributesImplApi21Parcelizer = i59 - 1;
                iArr26[i59 - 2] = 2;
                return 0;
            case 49:
                Object[] objArr29 = this.MediaBrowserCompatSearchResultReceiver;
                int i62 = this.AudioAttributesImplApi21Parcelizer;
                Object obj42 = objArr29[i62 - 1];
                objArr29[i62 - 1] = null;
                Object obj43 = objArr29[i62 - 2];
                objArr29[i62 - 2] = null;
                objArr29[i62 - 1] = obj43;
                objArr29[i62 - 2] = obj42;
                this.AudioAttributesImplApi21Parcelizer = i62 + 1;
                objArr29[i62] = null;
                return 0;
            case 50:
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                int i63 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i63 + 1;
                iArr27[i63] = 8;
                return 0;
            case 51:
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                int i64 = this.AudioAttributesImplApi21Parcelizer;
                iArr28[i64] = 0;
                this.AudioAttributesImplApi21Parcelizer = i64 + 2;
                iArr28[i64 + 1] = 0;
                return 0;
            case 52:
                long[] jArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i65 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i65 + 1;
                jArr7[i65] = this.RemoteActionCompatParcelizer;
                return 0;
            case 53:
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                int i66 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i66 + 1;
                iArr29[i66] = 14;
                return 0;
            case 54:
                long[] jArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i67 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i67 + 1;
                jArr8[i67] = 0;
                return 0;
            case 55:
                int i68 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr30[i68 - 2] = (jArr9[i68 - 2] > jArr9[i68 - 1] ? 1 : (jArr9[i68 - 2] == jArr9[i68 - 1] ? 0 : -1));
                int i69 = i68 - 2;
                this.AudioAttributesImplApi21Parcelizer = i69;
                iArr30[i68 - 3] = iArr30[i68 - 3] - iArr30[i69];
                return 0;
            case 56:
                int i70 = this.AudioAttributesImplApi21Parcelizer;
                int i71 = i70 - 3;
                this.AudioAttributesImplApi21Parcelizer = i71;
                Object[] objArr30 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj44 = objArr30[i71];
                objArr30[i71] = null;
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                int i72 = iArr31[i70 - 2];
                Object obj45 = objArr30[i70 - 1];
                objArr30[i70 - 1] = null;
                ((Object[]) obj44)[i72] = obj45;
                objArr30[i71] = objArr30[i70 - 4];
                this.AudioAttributesImplApi21Parcelizer = i70 - 1;
                iArr31[i70 - 2] = 1;
                return 0;
            case 57:
                Object[] objArr31 = this.MediaBrowserCompatSearchResultReceiver;
                int i73 = this.AudioAttributesImplApi21Parcelizer;
                objArr31[i73] = objArr31[8];
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i73 + 2;
                iArr32[i73 + 1] = 3;
                return 0;
            case 58:
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                int i74 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i74 + 1;
                iArr33[i74] = 11;
                return 0;
            case 59:
                int i75 = this.AudioAttributesImplApi21Parcelizer;
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr34[i75 - 2] = (jArr10[i75 - 2] > jArr10[i75 - 1] ? 1 : (jArr10[i75 - 2] == jArr10[i75 - 1] ? 0 : -1));
                int i76 = i75 - 2;
                this.AudioAttributesImplApi21Parcelizer = i76;
                iArr34[i75 - 3] = iArr34[i75 - 3] + iArr34[i76];
                return 0;
            case 60:
                Object[] objArr32 = this.MediaBrowserCompatSearchResultReceiver;
                int i77 = this.AudioAttributesImplApi21Parcelizer;
                Object obj46 = objArr32[i77 - 2];
                objArr32[i77 - 2] = null;
                objArr32[i77 - 1] = obj46;
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                iArr35[i77 - 2] = iArr35[i77 - 1];
                int i78 = i77 - 3;
                this.AudioAttributesImplApi21Parcelizer = i78;
                Object obj47 = objArr32[i78];
                objArr32[i78] = null;
                int i79 = iArr35[i77 - 2];
                Object obj48 = objArr32[i77 - 1];
                objArr32[i77 - 1] = null;
                ((Object[]) obj47)[i79] = obj48;
                this.AudioAttributesImplApi21Parcelizer = i77 - 2;
                Object obj49 = objArr32[i77 - 4];
                objArr32[i77 - 4] = null;
                objArr32[i78] = obj49;
                iArr35[i77 - 4] = iArr35[i77 - 5];
                objArr32[i77 - 5] = obj49;
                return 0;
            case 61:
                Object[] objArr33 = this.MediaBrowserCompatSearchResultReceiver;
                int i80 = this.AudioAttributesImplApi21Parcelizer;
                Object obj50 = objArr33[i80 - 1];
                objArr33[i80 - 1] = null;
                objArr33[i80] = obj50;
                Object obj51 = objArr33[i80 - 2];
                objArr33[i80 - 2] = null;
                objArr33[i80 - 1] = obj51;
                Object obj52 = objArr33[i80 - 3];
                objArr33[i80 - 3] = null;
                objArr33[i80 - 2] = obj52;
                objArr33[i80 - 3] = obj50;
                this.AudioAttributesImplApi21Parcelizer = i80;
                objArr33[i80] = null;
                return 0;
            case 62:
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                int i81 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i81 + 1;
                iArr36[i81] = 13;
                return 0;
            case 63:
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                int i82 = this.AudioAttributesImplApi21Parcelizer;
                iArr37[i82] = 16;
                iArr37[i82 - 1] = iArr37[i82 - 1] >> iArr37[i82];
                int i83 = i82 - 1;
                this.AudioAttributesImplApi21Parcelizer = i83;
                iArr37[i82 - 2] = iArr37[i82 - 2] - iArr37[i83];
                return 0;
            case 64:
                Object[] objArr34 = this.MediaBrowserCompatSearchResultReceiver;
                int i84 = this.AudioAttributesImplApi21Parcelizer;
                Object obj53 = objArr34[i84 - 1];
                objArr34[i84 - 1] = null;
                objArr34[i84] = obj53;
                Object obj54 = objArr34[i84 - 2];
                objArr34[i84 - 2] = null;
                objArr34[i84 - 1] = obj54;
                objArr34[i84 - 2] = obj53;
                Object obj55 = objArr34[i84];
                objArr34[i84] = null;
                Object obj56 = objArr34[i84 - 1];
                objArr34[i84 - 1] = null;
                objArr34[i84] = obj56;
                objArr34[i84 - 1] = obj55;
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplApi21Parcelizer = i84 + 2;
                iArr38[i84 + 1] = 0;
                return 0;
            case 65:
                Object[] objArr35 = this.MediaBrowserCompatSearchResultReceiver;
                int i85 = this.AudioAttributesImplApi21Parcelizer;
                Object obj57 = objArr35[i85 - 1];
                objArr35[i85 - 1] = null;
                objArr35[i85] = obj57;
                long[] jArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr11[i85 - 1] = jArr11[i85 - 2];
                objArr35[i85 - 2] = obj57;
                this.AudioAttributesImplApi21Parcelizer = i85;
                objArr35[i85] = null;
                return 0;
            case 66:
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                int i86 = this.AudioAttributesImplApi21Parcelizer;
                iArr39[i86] = 11;
                iArr39[i86 + 1] = 0;
                this.AudioAttributesImplApi21Parcelizer = i86 + 3;
                iArr39[i86 + 2] = 0;
                return 0;
            case 67:
                int i87 = this.AudioAttributesImplApi21Parcelizer;
                int i88 = i87 - 3;
                this.AudioAttributesImplApi21Parcelizer = i88;
                Object[] objArr36 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj58 = objArr36[i88];
                objArr36[i88] = null;
                int i89 = this.AudioAttributesImplBaseParcelizer[i87 - 2];
                Object obj59 = objArr36[i87 - 1];
                objArr36[i87 - 1] = null;
                ((Object[]) obj58)[i89] = obj59;
                this.AudioAttributesImplApi21Parcelizer = i87 - 2;
                objArr36[i88] = objArr36[i87 - 4];
                return 0;
            case 68:
                int i90 = this.AudioAttributesImplApi21Parcelizer;
                int i91 = i90 - 1;
                this.AudioAttributesImplApi21Parcelizer = i91;
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                iArr40[i90 - 2] = iArr40[i90 - 2] % iArr40[i91];
                return 0;
            case 70:
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                int i92 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i92 + 1;
                iArr41[i92] = 111;
            case 69:
                return 0;
            case 71:
                int[] iArr42 = this.AudioAttributesImplBaseParcelizer;
                int i93 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i93 + 1;
                iArr42[i93] = iArr42[i93 - 1];
                return 0;
            case 72:
                int[] iArr43 = this.AudioAttributesImplBaseParcelizer;
                int i94 = this.AudioAttributesImplApi21Parcelizer;
                iArr43[i94] = 128;
                this.AudioAttributesImplApi21Parcelizer = i94;
                iArr43[i94 - 1] = iArr43[i94 - 1] % iArr43[i94];
                return 0;
            case 73:
                int i95 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i95;
                this.write = this.AudioAttributesImplBaseParcelizer[i95] == 0 ? 0 : 1;
                return 0;
            case 74:
                int[] iArr44 = this.AudioAttributesImplBaseParcelizer;
                int i96 = this.AudioAttributesImplApi21Parcelizer;
                iArr44[i96] = 21;
                this.AudioAttributesImplApi21Parcelizer = i96;
                iArr44[i96 - 1] = iArr44[i96 - 1] + iArr44[i96];
                return 0;
            case 75:
                int[] iArr45 = this.AudioAttributesImplBaseParcelizer;
                int i97 = this.AudioAttributesImplApi21Parcelizer;
                iArr45[i97] = iArr45[i97 - 1];
                this.AudioAttributesImplApi21Parcelizer = i97 + 2;
                iArr45[i97 + 1] = 128;
                return 0;
            case 76:
                int[] iArr46 = this.AudioAttributesImplBaseParcelizer;
                int i98 = this.AudioAttributesImplApi21Parcelizer;
                iArr46[i98] = 2;
                this.AudioAttributesImplApi21Parcelizer = i98;
                iArr46[i98 - 1] = iArr46[i98 - 1] % iArr46[i98];
                return 0;
            case 77:
                long[] jArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i99 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i99 + 1;
                jArr12[i99] = jArr12[9];
                return 0;
            case 78:
                long[] jArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i100 = this.AudioAttributesImplApi21Parcelizer;
                jArr13[i100] = jArr13[11];
                int[] iArr47 = this.AudioAttributesImplBaseParcelizer;
                iArr47[i100 + 1] = 48;
                int i101 = i100 + 1;
                this.AudioAttributesImplApi21Parcelizer = i101;
                jArr13[i100] = jArr13[i100] << iArr47[i101];
                return 0;
            case 79:
                int i102 = this.AudioAttributesImplApi21Parcelizer;
                int i103 = i102 - 1;
                this.AudioAttributesImplApi21Parcelizer = i103;
                long[] jArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr14[i102 - 2] = jArr14[i102 - 2] * jArr14[i103];
                return 0;
            case 80:
                int[] iArr48 = this.AudioAttributesImplBaseParcelizer;
                int i104 = this.AudioAttributesImplApi21Parcelizer - 1;
                this.AudioAttributesImplApi21Parcelizer = i104;
                this.write = iArr48[i104];
                return 0;
            case 81:
                for (int i105 = this.AudioAttributesImplApi21Parcelizer - 1; i105 >= 0; i105--) {
                    this.MediaBrowserCompatSearchResultReceiver[i105] = null;
                }
                Object[] objArr37 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplApi21Parcelizer = 1;
                objArr37[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
