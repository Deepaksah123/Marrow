package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class GoogleSourceStampsChecker {
    public int AudioAttributesCompatParcelizer;
    public Object AudioAttributesImplApi21Parcelizer;
    public float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public float IconCompatParcelizer;
    public Object MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final long[] MediaBrowserCompatSearchResultReceiver;
    private final Object[] RatingCompat;
    public long RemoteActionCompatParcelizer;
    public long read;
    public int write;
    private final int[] MediaDescriptionCompat = new int[15];
    private final float[] MediaMetadataCompat = new float[15];
    private final double[] MediaBrowserCompatMediaItem = new double[15];

    public GoogleSourceStampsChecker(Object obj, long j, long j2) {
        long[] jArr = new long[15];
        this.MediaBrowserCompatSearchResultReceiver = jArr;
        Object[] objArr = new Object[15];
        this.RatingCompat = objArr;
        objArr[10] = obj;
        jArr[11] = j;
        jArr[13] = j2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplBaseParcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaBrowserCompatSearchResultReceiver;
                int i2 = this.MediaBrowserCompatItemReceiver;
                jArr[i2] = jArr[11];
                jArr[i2 + 1] = jArr[13];
                int[] iArr = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i2 + 3;
                iArr[i2 + 2] = 32;
                return 0;
            case 2:
                int i3 = this.MediaBrowserCompatItemReceiver;
                long[] jArr2 = this.MediaBrowserCompatSearchResultReceiver;
                jArr2[i3 - 2] = jArr2[i3 - 2] << this.MediaDescriptionCompat[i3 - 1];
                int i4 = i3 - 2;
                this.MediaBrowserCompatItemReceiver = i4;
                jArr2[i3 - 3] = jArr2[i4] ^ jArr2[i3 - 3];
                return 0;
            case 3:
                int i5 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i5;
                long[] jArr3 = this.MediaBrowserCompatSearchResultReceiver;
                jArr3[11] = jArr3[i5];
                return 0;
            case 4:
                Object[] objArr = this.RatingCompat;
                int i6 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i6 + 1;
                objArr[i6] = objArr[i6 - 1];
                return 0;
            case 5:
                int i7 = this.MediaBrowserCompatItemReceiver - this.write;
                this.MediaBrowserCompatItemReceiver = i7;
                this.AudioAttributesImplBaseParcelizer = i7;
                return 0;
            case 6:
                Object[] objArr2 = this.RatingCompat;
                int i8 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i8 + 1;
                Object obj = objArr2[i8];
                objArr2[i8] = null;
                this.AudioAttributesImplApi21Parcelizer = obj;
                return 0;
            case 7:
                Object[] objArr3 = this.RatingCompat;
                int i9 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i9 + 1;
                objArr3[i9] = this.MediaBrowserCompatCustomActionResultReceiver;
                return 0;
            case 8:
                int i10 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i10;
                Object[] objArr4 = this.RatingCompat;
                Object obj2 = objArr4[i10];
                objArr4[i10] = null;
                this.AudioAttributesCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 9:
                Object[] objArr5 = this.RatingCompat;
                int i11 = this.MediaBrowserCompatItemReceiver;
                Object obj3 = objArr5[i11 - 1];
                objArr5[i11 - 1] = null;
                Object obj4 = objArr5[i11 - 2];
                objArr5[i11 - 2] = null;
                objArr5[i11 - 1] = obj4;
                objArr5[i11 - 2] = obj3;
                int i12 = i11 - 1;
                this.MediaBrowserCompatItemReceiver = i12;
                objArr5[i12] = null;
                return 0;
            case 10:
                Object[] objArr6 = this.RatingCompat;
                int i13 = this.MediaBrowserCompatItemReceiver;
                Object obj5 = objArr6[i13 - 1];
                objArr6[i13 - 1] = null;
                this.AudioAttributesImplApi21Parcelizer = obj5;
                return 0;
            case 11:
                int i14 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i14;
                this.RatingCompat[i14] = null;
                return 0;
            case 12:
                Object[] objArr7 = this.RatingCompat;
                int i15 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i15 + 1;
                objArr7[i15] = null;
                return 0;
            case 13:
                int[] iArr2 = this.MediaDescriptionCompat;
                int i16 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i16 + 1;
                iArr2[i16] = 1;
                return 0;
            case 14:
                int[] iArr3 = this.MediaDescriptionCompat;
                int i17 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i17 + 1;
                this.AudioAttributesCompatParcelizer = iArr3[i17];
                return 0;
            case 15:
                Object[] objArr8 = this.RatingCompat;
                int i18 = this.MediaBrowserCompatItemReceiver;
                objArr8[i18] = null;
                this.MediaBrowserCompatItemReceiver = i18 + 2;
                objArr8[i18 + 1] = null;
                return 0;
            case 16:
                int i19 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i19;
                Object[] objArr9 = this.RatingCompat;
                Object obj6 = objArr9[i19];
                objArr9[i19] = null;
                objArr9[10] = obj6;
                return 0;
            case 17:
                Object[] objArr10 = this.RatingCompat;
                int i20 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i20 + 1;
                objArr10[i20] = objArr10[10];
                return 0;
            case 18:
                int[] iArr4 = this.MediaDescriptionCompat;
                int i21 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i21 + 1;
                iArr4[i21] = this.write;
                return 0;
            case 19:
                int i22 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i22;
                int[] iArr5 = this.MediaDescriptionCompat;
                iArr5[13] = iArr5[i22];
                return 0;
            case 20:
                Object[] objArr11 = this.RatingCompat;
                int i23 = this.MediaBrowserCompatItemReceiver;
                objArr11[i23] = objArr11[i23 - 1];
                int[] iArr6 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i23 + 2;
                iArr6[i23 + 1] = 1;
                return 0;
            case 21:
                int i24 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i24;
                Object[] objArr12 = this.RatingCompat;
                Object obj7 = objArr12[i24];
                objArr12[i24] = null;
                objArr12[14] = obj7;
                return 0;
            case 22:
                int[] iArr7 = this.MediaDescriptionCompat;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                iArr7[i25] = 0;
                return 0;
            case 23:
                int i26 = this.MediaBrowserCompatItemReceiver;
                int i27 = i26 - 1;
                this.MediaBrowserCompatItemReceiver = i27;
                int[] iArr8 = this.MediaDescriptionCompat;
                iArr8[i26 - 2] = iArr8[i26 - 2] + iArr8[i27];
                iArr8[i26 - 2] = (char) iArr8[i26 - 2];
                return 0;
            case 24:
                int[] iArr9 = this.MediaDescriptionCompat;
                int i28 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i28 + 1;
                iArr9[i28] = 3;
                return 0;
            case 25:
                int[] iArr10 = this.MediaDescriptionCompat;
                int i29 = this.MediaBrowserCompatItemReceiver;
                iArr10[i29] = 48;
                this.MediaBrowserCompatItemReceiver = i29 + 2;
                iArr10[i29 + 1] = 0;
                return 0;
            case 26:
                int i30 = this.MediaBrowserCompatItemReceiver;
                int i31 = i30 - 1;
                this.MediaBrowserCompatItemReceiver = i31;
                int[] iArr11 = this.MediaDescriptionCompat;
                iArr11[i30 - 2] = iArr11[i30 - 2] - iArr11[i31];
                return 0;
            case 27:
                int[] iArr12 = this.MediaDescriptionCompat;
                int i32 = this.MediaBrowserCompatItemReceiver;
                iArr12[i32] = 16;
                this.MediaBrowserCompatItemReceiver = i32;
                iArr12[i32 - 1] = iArr12[i32 - 1] >> iArr12[i32];
                return 0;
            case 28:
                int[] iArr13 = this.MediaDescriptionCompat;
                int i33 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i33 + 1;
                iArr13[i33] = iArr13[13];
                return 0;
            case 29:
                int[] iArr14 = this.MediaDescriptionCompat;
                int i34 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i34 + 1;
                iArr14[i34] = 2;
                return 0;
            case 30:
                Object[] objArr13 = this.RatingCompat;
                int i35 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i35 + 1;
                Object obj8 = objArr13[i35 - 1];
                objArr13[i35 - 1] = null;
                objArr13[i35] = obj8;
                int[] iArr15 = this.MediaDescriptionCompat;
                iArr15[i35 - 1] = iArr15[i35 - 2];
                objArr13[i35 - 2] = obj8;
                iArr15[i35] = iArr15[i35 - 1];
                Object obj9 = objArr13[i35];
                objArr13[i35] = null;
                objArr13[i35 - 1] = obj9;
                return 0;
            case 31:
                Object[] objArr14 = this.RatingCompat;
                int i36 = this.MediaBrowserCompatItemReceiver;
                Object obj10 = objArr14[i36 - 2];
                objArr14[i36 - 2] = null;
                objArr14[i36 - 1] = obj10;
                int[] iArr16 = this.MediaDescriptionCompat;
                iArr16[i36 - 2] = iArr16[i36 - 1];
                int i37 = i36 - 3;
                this.MediaBrowserCompatItemReceiver = i37;
                Object obj11 = objArr14[i37];
                objArr14[i37] = null;
                int i38 = iArr16[i36 - 2];
                Object obj12 = objArr14[i36 - 1];
                objArr14[i36 - 1] = null;
                ((Object[]) obj11)[i38] = obj12;
                return 0;
            case 32:
                Object[] objArr15 = this.RatingCompat;
                int i39 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i39 + 1;
                Object obj13 = objArr15[i39 - 1];
                objArr15[i39 - 1] = null;
                objArr15[i39] = obj13;
                Object obj14 = objArr15[i39 - 2];
                objArr15[i39 - 2] = null;
                objArr15[i39 - 1] = obj14;
                objArr15[i39 - 2] = obj13;
                Object obj15 = objArr15[i39];
                objArr15[i39] = null;
                Object obj16 = objArr15[i39 - 1];
                objArr15[i39 - 1] = null;
                objArr15[i39] = obj16;
                objArr15[i39 - 1] = obj15;
                return 0;
            case 33:
                Object[] objArr16 = this.RatingCompat;
                int i40 = this.MediaBrowserCompatItemReceiver;
                Object obj17 = objArr16[i40 - 2];
                objArr16[i40 - 2] = null;
                objArr16[i40 - 1] = obj17;
                int[] iArr17 = this.MediaDescriptionCompat;
                iArr17[i40 - 2] = iArr17[i40 - 1];
                return 0;
            case 34:
                int i41 = this.MediaBrowserCompatItemReceiver;
                int i42 = i41 - 3;
                this.MediaBrowserCompatItemReceiver = i42;
                Object[] objArr17 = this.RatingCompat;
                Object obj18 = objArr17[i42];
                objArr17[i42] = null;
                int i43 = this.MediaDescriptionCompat[i41 - 2];
                Object obj19 = objArr17[i41 - 1];
                objArr17[i41 - 1] = null;
                ((Object[]) obj18)[i43] = obj19;
                return 0;
            case 35:
                long[] jArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i44 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i44 + 1;
                jArr4[i44] = this.RemoteActionCompatParcelizer;
                return 0;
            case 36:
                long[] jArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i45 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i45 + 1;
                jArr5[i45] = 0;
                return 0;
            case 37:
                int i46 = this.MediaBrowserCompatItemReceiver;
                int i47 = i46 - 1;
                this.MediaBrowserCompatItemReceiver = i47;
                int[] iArr18 = this.MediaDescriptionCompat;
                long[] jArr6 = this.MediaBrowserCompatSearchResultReceiver;
                iArr18[i46 - 2] = (jArr6[i46 - 2] > jArr6[i47] ? 1 : (jArr6[i46 - 2] == jArr6[i47] ? 0 : -1));
                iArr18[i46 - 2] = (char) iArr18[i46 - 2];
                return 0;
            case 38:
                int[] iArr19 = this.MediaDescriptionCompat;
                int i48 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i48 + 1;
                iArr19[i48] = 6;
                return 0;
            case 39:
                int i49 = this.MediaBrowserCompatItemReceiver;
                int i50 = i49 - 1;
                int[] iArr20 = this.MediaDescriptionCompat;
                iArr20[i49 - 2] = iArr20[i49 - 2] - iArr20[i50];
                this.MediaBrowserCompatItemReceiver = i49;
                iArr20[i50] = 5;
                return 0;
            case 40:
                int i51 = this.MediaBrowserCompatItemReceiver;
                int i52 = i51 - 1;
                this.MediaBrowserCompatItemReceiver = i52;
                long[] jArr7 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaDescriptionCompat[i51 - 2] = (jArr7[i51 - 2] > jArr7[i52] ? 1 : (jArr7[i51 - 2] == jArr7[i52] ? 0 : -1));
                return 0;
            case 41:
                Object[] objArr18 = this.RatingCompat;
                int i53 = this.MediaBrowserCompatItemReceiver;
                Object obj20 = objArr18[i53 - 1];
                objArr18[i53 - 1] = null;
                objArr18[i53] = obj20;
                Object obj21 = objArr18[i53 - 2];
                objArr18[i53 - 2] = null;
                objArr18[i53 - 1] = obj21;
                Object obj22 = objArr18[i53 - 3];
                objArr18[i53 - 3] = null;
                objArr18[i53 - 2] = obj22;
                objArr18[i53 - 3] = obj20;
                this.MediaBrowserCompatItemReceiver = i53;
                objArr18[i53] = null;
                return 0;
            case 42:
                int[] iArr21 = this.MediaDescriptionCompat;
                int i54 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i54 + 1;
                iArr21[i54] = 16;
                return 0;
            case 43:
                int i55 = this.MediaBrowserCompatItemReceiver;
                int[] iArr22 = this.MediaDescriptionCompat;
                iArr22[i55 - 2] = iArr22[i55 - 2] >> iArr22[i55 - 1];
                int i56 = i55 - 2;
                this.MediaBrowserCompatItemReceiver = i56;
                iArr22[i55 - 3] = iArr22[i55 - 3] + iArr22[i56];
                return 0;
            case 44:
                int[] iArr23 = this.MediaDescriptionCompat;
                int i57 = this.MediaBrowserCompatItemReceiver;
                iArr23[i57 - 1] = (char) iArr23[i57 - 1];
                return 0;
            case 45:
                int[] iArr24 = this.MediaDescriptionCompat;
                int i58 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i58 + 1;
                iArr24[i58] = 8;
                return 0;
            case 46:
                int i59 = this.MediaBrowserCompatItemReceiver;
                int[] iArr25 = this.MediaDescriptionCompat;
                iArr25[i59 - 2] = iArr25[i59 - 2] >> iArr25[i59 - 1];
                int i60 = i59 - 2;
                iArr25[i59 - 3] = iArr25[i59 - 3] - iArr25[i60];
                this.MediaBrowserCompatItemReceiver = i59 - 1;
                iArr25[i60] = 9;
                return 0;
            case 47:
                int i61 = this.MediaBrowserCompatItemReceiver;
                int i62 = i61 - 1;
                this.MediaBrowserCompatItemReceiver = i62;
                int[] iArr26 = this.MediaDescriptionCompat;
                iArr26[i61 - 2] = iArr26[i61 - 2] + iArr26[i62];
                return 0;
            case 48:
                long[] jArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i63 = this.MediaBrowserCompatItemReceiver;
                jArr8[i63] = jArr8[11];
                Object[] objArr19 = this.RatingCompat;
                this.MediaBrowserCompatItemReceiver = i63 + 2;
                objArr19[i63 + 1] = objArr19[14];
                return 0;
            case 49:
                Object[] objArr20 = this.RatingCompat;
                int i64 = this.MediaBrowserCompatItemReceiver;
                Object obj23 = objArr20[i64 - 1];
                objArr20[i64 - 1] = null;
                objArr20[i64] = obj23;
                Object obj24 = objArr20[i64 - 2];
                objArr20[i64 - 2] = null;
                objArr20[i64 - 1] = obj24;
                objArr20[i64 - 2] = obj23;
                Object obj25 = objArr20[i64];
                objArr20[i64] = null;
                Object obj26 = objArr20[i64 - 1];
                objArr20[i64 - 1] = null;
                objArr20[i64] = obj26;
                objArr20[i64 - 1] = obj25;
                int[] iArr27 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i64 + 2;
                iArr27[i64 + 1] = 2;
                return 0;
            case 50:
                Object[] objArr21 = this.RatingCompat;
                int i65 = this.MediaBrowserCompatItemReceiver;
                Object obj27 = objArr21[i65 - 2];
                objArr21[i65 - 2] = null;
                objArr21[i65 - 1] = obj27;
                int[] iArr28 = this.MediaDescriptionCompat;
                iArr28[i65 - 2] = iArr28[i65 - 1];
                int i66 = i65 - 3;
                this.MediaBrowserCompatItemReceiver = i66;
                Object obj28 = objArr21[i66];
                objArr21[i66] = null;
                int i67 = iArr28[i65 - 2];
                Object obj29 = objArr21[i65 - 1];
                objArr21[i65 - 1] = null;
                ((Object[]) obj28)[i67] = obj29;
                this.MediaBrowserCompatItemReceiver = i65 - 2;
                Object obj30 = objArr21[i65 - 4];
                objArr21[i65 - 4] = null;
                objArr21[i66] = obj30;
                long[] jArr9 = this.MediaBrowserCompatSearchResultReceiver;
                jArr9[i65 - 4] = jArr9[i65 - 5];
                objArr21[i65 - 5] = obj30;
                return 0;
            case 51:
                long[] jArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i68 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i68 + 1;
                this.read = jArr10[i68];
                return 0;
            case 52:
                Object[] objArr22 = this.RatingCompat;
                int i69 = this.MediaBrowserCompatItemReceiver;
                Object obj31 = objArr22[i69 - 1];
                objArr22[i69 - 1] = null;
                Object obj32 = objArr22[i69 - 2];
                objArr22[i69 - 2] = null;
                objArr22[i69 - 1] = obj32;
                objArr22[i69 - 2] = obj31;
                this.MediaBrowserCompatItemReceiver = i69 + 1;
                Object obj33 = objArr22[i69 - 1];
                objArr22[i69 - 1] = null;
                objArr22[i69] = obj33;
                Object obj34 = objArr22[i69 - 2];
                objArr22[i69 - 2] = null;
                objArr22[i69 - 1] = obj34;
                objArr22[i69 - 2] = obj33;
                Object obj35 = objArr22[i69];
                objArr22[i69] = null;
                Object obj36 = objArr22[i69 - 1];
                objArr22[i69 - 1] = null;
                objArr22[i69] = obj36;
                objArr22[i69 - 1] = obj35;
                return 0;
            case 53:
                int[] iArr29 = this.MediaDescriptionCompat;
                int i70 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i70 + 1;
                iArr29[i70] = 0;
                Object[] objArr23 = this.RatingCompat;
                Object obj37 = objArr23[i70 - 1];
                objArr23[i70 - 1] = null;
                objArr23[i70] = obj37;
                iArr29[i70 - 1] = iArr29[i70];
                return 0;
            case 54:
                Object[] objArr24 = this.RatingCompat;
                int i71 = this.MediaBrowserCompatItemReceiver;
                objArr24[i71] = objArr24[i71 - 1];
                int[] iArr30 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i71 + 2;
                iArr30[i71 + 1] = 0;
                return 0;
            case 55:
                int i72 = this.MediaBrowserCompatItemReceiver;
                int i73 = i72 - 3;
                this.MediaBrowserCompatItemReceiver = i73;
                Object[] objArr25 = this.RatingCompat;
                Object obj38 = objArr25[i73];
                objArr25[i73] = null;
                int[] iArr31 = this.MediaDescriptionCompat;
                int i74 = iArr31[i72 - 2];
                Object obj39 = objArr25[i72 - 1];
                objArr25[i72 - 1] = null;
                ((Object[]) obj38)[i74] = obj39;
                objArr25[i73] = objArr25[i72 - 4];
                this.MediaBrowserCompatItemReceiver = i72 - 1;
                iArr31[i72 - 2] = 2;
                return 0;
            case 56:
                Object[] objArr26 = this.RatingCompat;
                int i75 = this.MediaBrowserCompatItemReceiver;
                Object obj40 = objArr26[i75 - 1];
                objArr26[i75 - 1] = null;
                Object obj41 = objArr26[i75 - 2];
                objArr26[i75 - 2] = null;
                objArr26[i75 - 1] = obj41;
                objArr26[i75 - 2] = obj40;
                this.MediaBrowserCompatItemReceiver = i75 + 1;
                objArr26[i75] = null;
                Object obj42 = objArr26[i75];
                objArr26[i75] = null;
                Object obj43 = objArr26[i75 - 1];
                objArr26[i75 - 1] = null;
                objArr26[i75] = obj43;
                objArr26[i75 - 1] = obj42;
                return 0;
            case 57:
                int i76 = this.MediaBrowserCompatItemReceiver;
                int i77 = i76 - 1;
                this.MediaBrowserCompatItemReceiver = i77;
                int[] iArr32 = this.MediaDescriptionCompat;
                iArr32[i76 - 2] = iArr32[i76 - 2] >> iArr32[i77];
                return 0;
            case 58:
                int i78 = this.MediaBrowserCompatItemReceiver;
                int i79 = i78 - 1;
                int[] iArr33 = this.MediaDescriptionCompat;
                iArr33[i78 - 2] = iArr33[i78 - 2] - iArr33[i79];
                iArr33[i79] = 11;
                this.MediaBrowserCompatItemReceiver = i78 + 1;
                iArr33[i78] = 0;
                return 0;
            case 59:
                int[] iArr34 = this.MediaDescriptionCompat;
                int i80 = this.MediaBrowserCompatItemReceiver;
                iArr34[i80] = 0;
                this.MediaBrowserCompatItemReceiver = i80 + 2;
                iArr34[i80 + 1] = 0;
                return 0;
            case 60:
                int[] iArr35 = this.MediaDescriptionCompat;
                int i81 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i81 + 1;
                iArr35[i81] = 13;
                return 0;
            case 61:
                int[] iArr36 = this.MediaDescriptionCompat;
                int i82 = this.MediaBrowserCompatItemReceiver;
                iArr36[i82] = 19;
                this.MediaBrowserCompatItemReceiver = i82 + 2;
                iArr36[i82 + 1] = 0;
                return 0;
            case 62:
                int[] iArr37 = this.MediaDescriptionCompat;
                int i83 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i83 + 1;
                iArr37[i83] = 1;
                Object[] objArr27 = this.RatingCompat;
                Object obj44 = objArr27[i83 - 1];
                objArr27[i83 - 1] = null;
                objArr27[i83] = obj44;
                iArr37[i83 - 1] = iArr37[i83];
                return 0;
            case 63:
                int i84 = this.MediaBrowserCompatItemReceiver;
                int i85 = i84 - 3;
                this.MediaBrowserCompatItemReceiver = i85;
                Object[] objArr28 = this.RatingCompat;
                Object obj45 = objArr28[i85];
                objArr28[i85] = null;
                int i86 = this.MediaDescriptionCompat[i84 - 2];
                Object obj46 = objArr28[i84 - 1];
                objArr28[i84 - 1] = null;
                ((Object[]) obj45)[i86] = obj46;
                this.MediaBrowserCompatItemReceiver = i84 - 2;
                Object obj47 = objArr28[i84 - 4];
                objArr28[i84 - 4] = null;
                objArr28[i85] = obj47;
                Object obj48 = objArr28[i84 - 5];
                objArr28[i84 - 5] = null;
                objArr28[i84 - 4] = obj48;
                objArr28[i84 - 5] = obj47;
                return 0;
            case 64:
                Object[] objArr29 = this.RatingCompat;
                int i87 = this.MediaBrowserCompatItemReceiver;
                Object obj49 = objArr29[i87 - 1];
                objArr29[i87 - 1] = null;
                Object obj50 = objArr29[i87 - 2];
                objArr29[i87 - 2] = null;
                objArr29[i87 - 1] = obj50;
                objArr29[i87 - 2] = obj49;
                int[] iArr38 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i87 + 1;
                iArr38[i87] = 0;
                Object obj51 = objArr29[i87 - 1];
                objArr29[i87 - 1] = null;
                objArr29[i87] = obj51;
                iArr38[i87 - 1] = iArr38[i87];
                return 0;
            case 65:
                int i88 = this.MediaBrowserCompatItemReceiver;
                int i89 = i88 - 3;
                this.MediaBrowserCompatItemReceiver = i89;
                Object[] objArr30 = this.RatingCompat;
                Object obj52 = objArr30[i89];
                objArr30[i89] = null;
                int i90 = this.MediaDescriptionCompat[i88 - 2];
                Object obj53 = objArr30[i88 - 1];
                objArr30[i88 - 1] = null;
                ((Object[]) obj52)[i90] = obj53;
                this.MediaBrowserCompatItemReceiver = i88 - 2;
                objArr30[i89] = objArr30[i88 - 4];
                return 0;
            case 66:
                Object[] objArr31 = this.RatingCompat;
                int i91 = this.MediaBrowserCompatItemReceiver;
                Object obj54 = objArr31[i91 - 1];
                objArr31[i91 - 1] = null;
                Object obj55 = objArr31[i91 - 2];
                objArr31[i91 - 2] = null;
                objArr31[i91 - 1] = obj55;
                objArr31[i91 - 2] = obj54;
                return 0;
            case 67:
                int[] iArr39 = this.MediaDescriptionCompat;
                int i92 = this.MediaBrowserCompatItemReceiver;
                iArr39[i92] = 3;
                this.MediaBrowserCompatItemReceiver = i92 + 2;
                iArr39[i92 + 1] = -1;
                return 0;
            case 68:
                int i93 = this.MediaBrowserCompatItemReceiver;
                int[] iArr40 = this.MediaDescriptionCompat;
                long[] jArr11 = this.MediaBrowserCompatSearchResultReceiver;
                iArr40[i93 - 2] = (jArr11[i93 - 2] > jArr11[i93 - 1] ? 1 : (jArr11[i93 - 2] == jArr11[i93 - 1] ? 0 : -1));
                int i94 = i93 - 2;
                this.MediaBrowserCompatItemReceiver = i94;
                iArr40[i93 - 3] = iArr40[i93 - 3] + iArr40[i94];
                iArr40[i93 - 3] = (char) iArr40[i93 - 3];
                return 0;
            case 69:
                int[] iArr41 = this.MediaDescriptionCompat;
                int i95 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i95 + 1;
                iArr41[i95] = 12;
                return 0;
            case 70:
                int i96 = this.MediaBrowserCompatItemReceiver;
                int[] iArr42 = this.MediaDescriptionCompat;
                iArr42[i96 - 2] = iArr42[i96 - 2] >> iArr42[i96 - 1];
                int i97 = i96 - 2;
                iArr42[i96 - 3] = iArr42[i96 - 3] - iArr42[i97];
                this.MediaBrowserCompatItemReceiver = i96 - 1;
                iArr42[i97] = 32;
                return 0;
            case 71:
                Object[] objArr32 = this.RatingCompat;
                int i98 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i98 + 1;
                Object obj56 = objArr32[i98 - 1];
                objArr32[i98 - 1] = null;
                objArr32[i98] = obj56;
                Object obj57 = objArr32[i98 - 2];
                objArr32[i98 - 2] = null;
                objArr32[i98 - 1] = obj57;
                objArr32[i98 - 2] = obj56;
                return 0;
            case 72:
                Object[] objArr33 = this.RatingCompat;
                int i99 = this.MediaBrowserCompatItemReceiver;
                Object obj58 = objArr33[i99 - 1];
                objArr33[i99 - 1] = null;
                Object obj59 = objArr33[i99 - 2];
                objArr33[i99 - 2] = null;
                objArr33[i99 - 1] = obj59;
                objArr33[i99 - 2] = obj58;
                int[] iArr43 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i99 + 1;
                iArr43[i99] = 1;
                Object obj60 = objArr33[i99 - 1];
                objArr33[i99 - 1] = null;
                objArr33[i99] = obj60;
                iArr43[i99 - 1] = iArr43[i99];
                return 0;
            case 73:
                int i100 = this.MediaBrowserCompatItemReceiver;
                int i101 = i100 - 3;
                this.MediaBrowserCompatItemReceiver = i101;
                Object[] objArr34 = this.RatingCompat;
                Object obj61 = objArr34[i101];
                objArr34[i101] = null;
                int[] iArr44 = this.MediaDescriptionCompat;
                int i102 = iArr44[i100 - 2];
                Object obj62 = objArr34[i100 - 1];
                objArr34[i100 - 1] = null;
                ((Object[]) obj61)[i102] = obj62;
                this.MediaBrowserCompatItemReceiver = i100 - 2;
                Object obj63 = objArr34[i100 - 4];
                objArr34[i100 - 4] = null;
                objArr34[i101] = obj63;
                iArr44[i100 - 4] = iArr44[i100 - 5];
                objArr34[i100 - 5] = obj63;
                iArr44[i100 - 3] = iArr44[i100 - 4];
                Object obj64 = objArr34[i100 - 3];
                objArr34[i100 - 3] = null;
                objArr34[i100 - 4] = obj64;
                return 0;
            case 74:
                int[] iArr45 = this.MediaDescriptionCompat;
                int i103 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i103 + 1;
                iArr45[i103] = 30398;
                return 0;
            case 75:
                int[] iArr46 = this.MediaDescriptionCompat;
                int i104 = this.MediaBrowserCompatItemReceiver;
                iArr46[i104] = 16;
                iArr46[i104 - 1] = iArr46[i104 - 1] >> iArr46[i104];
                int i105 = i104 - 1;
                this.MediaBrowserCompatItemReceiver = i105;
                iArr46[i104 - 2] = iArr46[i104 - 2] + iArr46[i105];
                return 0;
            case 76:
                int[] iArr47 = this.MediaDescriptionCompat;
                int i106 = this.MediaBrowserCompatItemReceiver;
                iArr47[i106 - 1] = (char) iArr47[i106 - 1];
                this.MediaBrowserCompatItemReceiver = i106 + 1;
                iArr47[i106] = 13;
                return 0;
            case 77:
                int[] iArr48 = this.MediaDescriptionCompat;
                int i107 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i107 + 1;
                iArr48[i107] = 44;
                return 0;
            case 78:
                long[] jArr12 = this.MediaBrowserCompatSearchResultReceiver;
                int i108 = this.MediaBrowserCompatItemReceiver;
                jArr12[i108] = 0;
                int[] iArr49 = this.MediaDescriptionCompat;
                iArr49[i108 - 1] = (jArr12[i108 - 1] > jArr12[i108] ? 1 : (jArr12[i108 - 1] == jArr12[i108] ? 0 : -1));
                int i109 = i108 - 1;
                this.MediaBrowserCompatItemReceiver = i109;
                iArr49[i108 - 2] = iArr49[i108 - 2] + iArr49[i109];
                return 0;
            case 79:
                Object[] objArr35 = this.RatingCompat;
                int i110 = this.MediaBrowserCompatItemReceiver;
                Object obj65 = objArr35[i110 - 1];
                objArr35[i110 - 1] = null;
                objArr35[i110] = obj65;
                Object obj66 = objArr35[i110 - 2];
                objArr35[i110 - 2] = null;
                objArr35[i110 - 1] = obj66;
                objArr35[i110 - 2] = obj65;
                Object obj67 = objArr35[i110];
                objArr35[i110] = null;
                Object obj68 = objArr35[i110 - 1];
                objArr35[i110 - 1] = null;
                objArr35[i110] = obj68;
                objArr35[i110 - 1] = obj67;
                int[] iArr50 = this.MediaDescriptionCompat;
                this.MediaBrowserCompatItemReceiver = i110 + 2;
                iArr50[i110 + 1] = 0;
                return 0;
            case 80:
                Object[] objArr36 = this.RatingCompat;
                int i111 = this.MediaBrowserCompatItemReceiver;
                Object obj69 = objArr36[i111 - 1];
                objArr36[i111 - 1] = null;
                objArr36[i111] = obj69;
                long[] jArr13 = this.MediaBrowserCompatSearchResultReceiver;
                jArr13[i111 - 1] = jArr13[i111 - 2];
                objArr36[i111 - 2] = obj69;
                this.MediaBrowserCompatItemReceiver = i111;
                objArr36[i111] = null;
                return 0;
            case 81:
                int[] iArr51 = this.MediaDescriptionCompat;
                int i112 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i112 + 1;
                iArr51[i112] = -1;
                return 0;
            case 82:
                int i113 = this.MediaBrowserCompatItemReceiver;
                int[] iArr52 = this.MediaDescriptionCompat;
                long[] jArr14 = this.MediaBrowserCompatSearchResultReceiver;
                iArr52[i113 - 2] = (jArr14[i113 - 2] > jArr14[i113 - 1] ? 1 : (jArr14[i113 - 2] == jArr14[i113 - 1] ? 0 : -1));
                int i114 = i113 - 2;
                this.MediaBrowserCompatItemReceiver = i114;
                iArr52[i113 - 3] = iArr52[i113 - 3] + iArr52[i114];
                return 0;
            case 83:
                int[] iArr53 = this.MediaDescriptionCompat;
                int i115 = this.MediaBrowserCompatItemReceiver;
                iArr53[i115 - 1] = (char) iArr53[i115 - 1];
                this.MediaBrowserCompatItemReceiver = i115 + 1;
                iArr53[i115] = 11;
                return 0;
            case 84:
                int[] iArr54 = this.MediaDescriptionCompat;
                int i116 = this.MediaBrowserCompatItemReceiver;
                iArr54[i116] = 0;
                float[] fArr = this.MediaMetadataCompat;
                fArr[i116 + 1] = 0.0f;
                this.MediaBrowserCompatItemReceiver = i116 + 3;
                fArr[i116 + 2] = 0.0f;
                return 0;
            case 85:
                float[] fArr2 = this.MediaMetadataCompat;
                int i117 = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer = i117 + 1;
                this.AudioAttributesImplApi26Parcelizer = fArr2[i117];
                return 0;
            case 86:
                float[] fArr3 = this.MediaMetadataCompat;
                int i118 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i118 + 1;
                fArr3[i118] = this.IconCompatParcelizer;
                return 0;
            case 87:
                float[] fArr4 = this.MediaMetadataCompat;
                int i119 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i119 + 1;
                fArr4[i119] = 0.0f;
                return 0;
            case 88:
                int i120 = this.MediaBrowserCompatItemReceiver;
                int i121 = i120 - 1;
                this.MediaBrowserCompatItemReceiver = i121;
                float[] fArr5 = this.MediaMetadataCompat;
                this.MediaDescriptionCompat[i120 - 2] = (fArr5[i120 - 2] > fArr5[i121] ? 1 : (fArr5[i120 - 2] == fArr5[i121] ? 0 : -1));
                return 0;
            case 89:
                int[] iArr55 = this.MediaDescriptionCompat;
                int i122 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i122 + 1;
                iArr55[i122] = 57;
                return 0;
            case 90:
                Object[] objArr37 = this.RatingCompat;
                int i123 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i123 + 1;
                Object obj70 = objArr37[i123 - 1];
                objArr37[i123 - 1] = null;
                objArr37[i123] = obj70;
                Object obj71 = objArr37[i123 - 2];
                objArr37[i123 - 2] = null;
                objArr37[i123 - 1] = obj71;
                Object obj72 = objArr37[i123 - 3];
                objArr37[i123 - 3] = null;
                objArr37[i123 - 2] = obj72;
                objArr37[i123 - 3] = obj70;
                return 0;
            case 91:
                int[] iArr56 = this.MediaDescriptionCompat;
                int i124 = this.MediaBrowserCompatItemReceiver;
                iArr56[i124] = 2;
                iArr56[i124 + 1] = 2;
                int i125 = i124 + 1;
                this.MediaBrowserCompatItemReceiver = i125;
                iArr56[i124] = iArr56[i124] % iArr56[i125];
                return 0;
            case 93:
                int[] iArr57 = this.MediaDescriptionCompat;
                int i126 = this.MediaBrowserCompatItemReceiver;
                iArr57[i126] = 65;
                this.MediaBrowserCompatItemReceiver = i126;
                iArr57[i126 - 1] = iArr57[i126 - 1] + iArr57[i126];
            case 92:
                return 0;
            case 94:
                int[] iArr58 = this.MediaDescriptionCompat;
                int i127 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i127 + 1;
                iArr58[i127] = iArr58[i127 - 1];
                return 0;
            case 95:
                int[] iArr59 = this.MediaDescriptionCompat;
                int i128 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i128 + 1;
                iArr59[i128] = 128;
                return 0;
            case 96:
                int i129 = this.MediaBrowserCompatItemReceiver;
                int i130 = i129 - 1;
                this.MediaBrowserCompatItemReceiver = i130;
                int[] iArr60 = this.MediaDescriptionCompat;
                iArr60[i129 - 2] = iArr60[i129 - 2] % iArr60[i130];
                return 0;
            case 97:
                int i131 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i131;
                this.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat[i131] != 0 ? 0 : 1;
                return 0;
            case 98:
                int[] iArr61 = this.MediaDescriptionCompat;
                int i132 = this.MediaBrowserCompatItemReceiver;
                iArr61[i132] = 107;
                iArr61[i132 - 1] = iArr61[i132 - 1] + iArr61[i132];
                this.MediaBrowserCompatItemReceiver = i132 + 1;
                iArr61[i132] = iArr61[i132 - 1];
                return 0;
            case 99:
                int[] iArr62 = this.MediaDescriptionCompat;
                int i133 = this.MediaBrowserCompatItemReceiver;
                iArr62[i133] = 2;
                this.MediaBrowserCompatItemReceiver = i133;
                iArr62[i133 - 1] = iArr62[i133 - 1] % iArr62[i133];
                return 0;
            case 100:
                int i134 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i134;
                this.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat[i134] == 0 ? 0 : 1;
                return 0;
            case 101:
                int[] iArr63 = this.MediaDescriptionCompat;
                int i135 = this.MediaBrowserCompatItemReceiver;
                iArr63[i135] = 1;
                this.MediaBrowserCompatItemReceiver = i135 + 2;
                iArr63[i135 + 1] = 0;
                return 0;
            case 102:
                int i136 = this.MediaBrowserCompatItemReceiver;
                int i137 = i136 - 1;
                this.MediaBrowserCompatItemReceiver = i137;
                int[] iArr64 = this.MediaDescriptionCompat;
                iArr64[i136 - 2] = iArr64[i136 - 2] / iArr64[i137];
                return 0;
            case 103:
                int[] iArr65 = this.MediaDescriptionCompat;
                int i138 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i138;
                this.AudioAttributesCompatParcelizer = iArr65[i138];
                return 0;
            case 104:
                int[] iArr66 = this.MediaDescriptionCompat;
                int i139 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i139 + 1;
                iArr66[i139] = 84;
                return 0;
            case 105:
                int[] iArr67 = this.MediaDescriptionCompat;
                int i140 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i140 + 1;
                iArr67[i140] = 37;
                return 0;
            case 106:
                for (int i141 = this.MediaBrowserCompatItemReceiver - 1; i141 >= 0; i141--) {
                    this.RatingCompat[i141] = null;
                }
                Object[] objArr38 = this.RatingCompat;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr38[0] = this.MediaBrowserCompatCustomActionResultReceiver;
                return 0;
            default:
                return i;
        }
    }
}
