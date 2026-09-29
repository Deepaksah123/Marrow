package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class getCommaDelimitedSimpleClassNames {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplApi26Parcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    public Object MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    public long RemoteActionCompatParcelizer;
    public int read;
    public long write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[13];
    private final float[] MediaDescriptionCompat = new float[13];
    private final double[] MediaMetadataCompat = new double[13];

    public getCommaDelimitedSimpleClassNames(Object obj, long j, long j2) {
        long[] jArr = new long[13];
        this.AudioAttributesImplApi26Parcelizer = jArr;
        Object[] objArr = new Object[13];
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        objArr[8] = obj;
        jArr[9] = j;
        jArr[11] = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr[i2] = jArr[9];
                this.MediaBrowserCompatCustomActionResultReceiver = i2 + 2;
                jArr[i2 + 1] = jArr[11];
                return 0;
            case 2:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                iArr[i3] = 32;
                return 0;
            case 3:
                int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
                long[] jArr2 = this.AudioAttributesImplApi26Parcelizer;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.AudioAttributesImplBaseParcelizer[i4 - 1];
                int i5 = i4 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i5;
                jArr2[i4 - 3] = jArr2[i4 - 3] ^ jArr2[i5];
                return 0;
            case 4:
                int i6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i7 = i6 - 1;
                long[] jArr3 = this.AudioAttributesImplApi26Parcelizer;
                jArr3[9] = jArr3[i7];
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i6;
                iArr2[i7] = 1;
                return 0;
            case 5:
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i8 + 1;
                iArr3[i8] = 0;
                return 0;
            case 6:
                int i9 = this.MediaBrowserCompatCustomActionResultReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i9;
                this.AudioAttributesImplApi21Parcelizer = i9;
                return 0;
            case 7:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i10 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i10 + 1;
                this.read = iArr4[i10];
                return 0;
            case 8:
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                int i11 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i11 + 1;
                iArr5[i11] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 9:
                Object[] objArr = this.MediaBrowserCompatSearchResultReceiver;
                int i12 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i12 + 1;
                objArr[i12] = this.IconCompatParcelizer;
                return 0;
            case 10:
                int i13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = i13 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i14;
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                iArr6[i13 - 2] = iArr6[i13 - 2] + iArr6[i14];
                return 0;
            case 11:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i15 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr7[i15] = 248;
                this.MediaBrowserCompatCustomActionResultReceiver = i15 + 2;
                iArr7[i15 + 1] = 0;
                return 0;
            case 12:
                long[] jArr4 = this.AudioAttributesImplApi26Parcelizer;
                int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i16 + 1;
                jArr4[i16] = this.write;
                return 0;
            case 13:
                long[] jArr5 = this.AudioAttributesImplApi26Parcelizer;
                int i17 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr5[i17] = 0;
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                iArr8[i17 - 1] = (jArr5[i17 - 1] > jArr5[i17] ? 1 : (jArr5[i17 - 1] == jArr5[i17] ? 0 : -1));
                int i18 = i17 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i18;
                iArr8[i17 - 2] = iArr8[i17 - 2] + iArr8[i18];
                return 0;
            case 14:
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                int i19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i19] = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i19 + 2;
                iArr9[i19 + 1] = 0;
                return 0;
            case 15:
                long[] jArr6 = this.AudioAttributesImplApi26Parcelizer;
                int i20 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i20 + 1;
                jArr6[i20] = 0;
                return 0;
            case 16:
                int i21 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i22 = i21 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i22;
                long[] jArr7 = this.AudioAttributesImplApi26Parcelizer;
                this.AudioAttributesImplBaseParcelizer[i21 - 2] = (jArr7[i21 - 2] > jArr7[i22] ? 1 : (jArr7[i21 - 2] == jArr7[i22] ? 0 : -1));
                return 0;
            case 17:
                Object[] objArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i23 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i23 + 1;
                Object obj = objArr2[i23];
                objArr2[i23] = null;
                this.MediaBrowserCompatItemReceiver = obj;
                return 0;
            case 18:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i24 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i24 + 1;
                iArr10[i24] = 1;
                return 0;
            case 19:
                long[] jArr8 = this.AudioAttributesImplApi26Parcelizer;
                int i25 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i25 + 1;
                jArr8[i25] = jArr8[9];
                return 0;
            case 20:
                Object[] objArr3 = this.MediaBrowserCompatSearchResultReceiver;
                int i26 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i26 + 1;
                objArr3[i26] = objArr3[i26 - 1];
                return 0;
            case 21:
                int i27 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i27;
                Object[] objArr4 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj2 = objArr4[i27];
                objArr4[i27] = null;
                this.read = obj2 == null ? 0 : 1;
                return 0;
            case 22:
                Object[] objArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i28 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj3 = objArr5[i28 - 1];
                objArr5[i28 - 1] = null;
                Object obj4 = objArr5[i28 - 2];
                objArr5[i28 - 2] = null;
                objArr5[i28 - 1] = obj4;
                objArr5[i28 - 2] = obj3;
                int i29 = i28 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i29;
                objArr5[i29] = null;
                return 0;
            case 23:
                Object[] objArr6 = this.MediaBrowserCompatSearchResultReceiver;
                int i30 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj5 = objArr6[i30 - 1];
                objArr6[i30 - 1] = null;
                this.MediaBrowserCompatItemReceiver = obj5;
                return 0;
            case 24:
                int i31 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i31;
                this.MediaBrowserCompatSearchResultReceiver[i31] = null;
                return 0;
            case 25:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i32 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i32 + 1;
                iArr11[i32] = 2;
                return 0;
            case 26:
                Object[] objArr7 = this.MediaBrowserCompatSearchResultReceiver;
                int i33 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i33 + 1;
                Object obj6 = objArr7[i33 - 1];
                objArr7[i33 - 1] = null;
                objArr7[i33] = obj6;
                long[] jArr9 = this.AudioAttributesImplApi26Parcelizer;
                jArr9[i33 - 1] = jArr9[i33 - 2];
                objArr7[i33 - 2] = obj6;
                return 0;
            case 27:
                long[] jArr10 = this.AudioAttributesImplApi26Parcelizer;
                int i34 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i34 + 1;
                this.RemoteActionCompatParcelizer = jArr10[i34];
                return 0;
            case 28:
                Object[] objArr8 = this.MediaBrowserCompatSearchResultReceiver;
                int i35 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj7 = objArr8[i35 - 1];
                objArr8[i35 - 1] = null;
                Object obj8 = objArr8[i35 - 2];
                objArr8[i35 - 2] = null;
                objArr8[i35 - 1] = obj8;
                objArr8[i35 - 2] = obj7;
                return 0;
            case 29:
                Object[] objArr9 = this.MediaBrowserCompatSearchResultReceiver;
                int i36 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i36 + 1;
                Object obj9 = objArr9[i36 - 1];
                objArr9[i36 - 1] = null;
                objArr9[i36] = obj9;
                Object obj10 = objArr9[i36 - 2];
                objArr9[i36 - 2] = null;
                objArr9[i36 - 1] = obj10;
                objArr9[i36 - 2] = obj9;
                return 0;
            case 30:
                Object[] objArr10 = this.MediaBrowserCompatSearchResultReceiver;
                int i37 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj11 = objArr10[i37 - 1];
                objArr10[i37 - 1] = null;
                Object obj12 = objArr10[i37 - 2];
                objArr10[i37 - 2] = null;
                objArr10[i37 - 1] = obj12;
                objArr10[i37 - 2] = obj11;
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i37 + 1;
                iArr12[i37] = 1;
                Object obj13 = objArr10[i37 - 1];
                objArr10[i37 - 1] = null;
                objArr10[i37] = obj13;
                iArr12[i37 - 1] = iArr12[i37];
                return 0;
            case 31:
                int i38 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i39 = i38 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i39;
                Object[] objArr11 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj14 = objArr11[i39];
                objArr11[i39] = null;
                int i40 = this.AudioAttributesImplBaseParcelizer[i38 - 2];
                Object obj15 = objArr11[i38 - 1];
                objArr11[i38 - 1] = null;
                ((Object[]) obj14)[i40] = obj15;
                this.MediaBrowserCompatCustomActionResultReceiver = i38 - 2;
                Object obj16 = objArr11[i38 - 4];
                objArr11[i38 - 4] = null;
                objArr11[i39] = obj16;
                Object obj17 = objArr11[i38 - 5];
                objArr11[i38 - 5] = null;
                objArr11[i38 - 4] = obj17;
                objArr11[i38 - 5] = obj16;
                return 0;
            case 32:
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i41 + 1;
                iArr13[i41] = 0;
                Object[] objArr12 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj18 = objArr12[i41 - 1];
                objArr12[i41 - 1] = null;
                objArr12[i41] = obj18;
                iArr13[i41 - 1] = iArr13[i41];
                return 0;
            case 33:
                int i42 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i43 = i42 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i43;
                Object[] objArr13 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj19 = objArr13[i43];
                objArr13[i43] = null;
                int i44 = this.AudioAttributesImplBaseParcelizer[i42 - 2];
                Object obj20 = objArr13[i42 - 1];
                objArr13[i42 - 1] = null;
                ((Object[]) obj19)[i44] = obj20;
                return 0;
            case 34:
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = i45 - 3;
                this.MediaBrowserCompatCustomActionResultReceiver = i46;
                Object[] objArr14 = this.MediaBrowserCompatSearchResultReceiver;
                Object obj21 = objArr14[i46];
                objArr14[i46] = null;
                int i47 = this.AudioAttributesImplBaseParcelizer[i45 - 2];
                Object obj22 = objArr14[i45 - 1];
                objArr14[i45 - 1] = null;
                ((Object[]) obj21)[i47] = obj22;
                this.MediaBrowserCompatCustomActionResultReceiver = i45 - 2;
                objArr14[i46] = objArr14[i45 - 4];
                return 0;
            case 35:
                Object[] objArr15 = this.MediaBrowserCompatSearchResultReceiver;
                int i48 = this.MediaBrowserCompatCustomActionResultReceiver;
                objArr15[i48] = objArr15[i48 - 1];
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = i48 + 2;
                iArr14[i48 + 1] = 1;
                return 0;
            case 36:
                Object[] objArr16 = this.MediaBrowserCompatSearchResultReceiver;
                int i49 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj23 = objArr16[i49 - 1];
                objArr16[i49 - 1] = null;
                Object obj24 = objArr16[i49 - 2];
                objArr16[i49 - 2] = null;
                objArr16[i49 - 1] = obj24;
                objArr16[i49 - 2] = obj23;
                this.MediaBrowserCompatCustomActionResultReceiver = i49 + 1;
                objArr16[i49] = null;
                Object obj25 = objArr16[i49];
                objArr16[i49] = null;
                Object obj26 = objArr16[i49 - 1];
                objArr16[i49 - 1] = null;
                objArr16[i49] = obj26;
                objArr16[i49 - 1] = obj25;
                return 0;
            case 37:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i50 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr15[i50] = 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i50 + 2;
                iArr15[i50 + 1] = 2;
                return 0;
            case 38:
                int i51 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i52 = i51 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i52;
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i51 - 2] = iArr16[i51 - 2] % iArr16[i52];
                int i53 = i51 - 2;
                this.MediaBrowserCompatCustomActionResultReceiver = i53;
                this.MediaBrowserCompatSearchResultReceiver[i53] = null;
                return 0;
            case 40:
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                int i54 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr17[i54] = 11;
                this.MediaBrowserCompatCustomActionResultReceiver = i54;
                iArr17[i54 - 1] = iArr17[i54 - 1] + iArr17[i54];
            case 39:
                return 0;
            case 41:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i55 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i55 + 1;
                iArr18[i55] = iArr18[i55 - 1];
                return 0;
            case 42:
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                int i56 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i56] = 128;
                this.MediaBrowserCompatCustomActionResultReceiver = i56;
                iArr19[i56 - 1] = iArr19[i56 - 1] % iArr19[i56];
                return 0;
            case 43:
                int i57 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i58 = i57 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i58;
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                iArr20[i57 - 2] = iArr20[i57 - 2] % iArr20[i58];
                return 0;
            case 44:
                int i59 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i59;
                this.read = this.AudioAttributesImplBaseParcelizer[i59] == 0 ? 0 : 1;
                return 0;
            case 45:
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                int i60 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i60] = 3;
                iArr21[i60 - 1] = iArr21[i60 - 1] + iArr21[i60];
                this.MediaBrowserCompatCustomActionResultReceiver = i60 + 1;
                iArr21[i60] = iArr21[i60 - 1];
                return 0;
            case 46:
                int i61 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i61;
                this.read = this.AudioAttributesImplBaseParcelizer[i61] != 0 ? 0 : 1;
                return 0;
            case 47:
                long[] jArr11 = this.AudioAttributesImplApi26Parcelizer;
                int i62 = this.MediaBrowserCompatCustomActionResultReceiver;
                jArr11[i62] = jArr11[11];
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                iArr22[i62 + 1] = 48;
                int i63 = i62 + 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i63;
                jArr11[i62] = jArr11[i62] >> iArr22[i63];
                return 0;
            case 48:
                int i64 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i65 = i64 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i65;
                long[] jArr12 = this.AudioAttributesImplApi26Parcelizer;
                jArr12[i64 - 2] = jArr12[i64 - 2] & jArr12[i65];
                return 0;
            case 49:
                int i66 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i66;
                long[] jArr13 = this.AudioAttributesImplApi26Parcelizer;
                jArr13[9] = jArr13[i66];
                return 0;
            case 50:
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                int i67 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr23[i67] = 0;
                this.MediaBrowserCompatCustomActionResultReceiver = i67 + 2;
                iArr23[i67 + 1] = 0;
                return 0;
            case 51:
                int i68 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i69 = i68 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i69;
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                iArr24[i68 - 2] = iArr24[i68 - 2] * iArr24[i69];
                return 0;
            case 52:
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                int i70 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i70 + 1;
                iArr25[i70] = 20939;
                return 0;
            case 53:
                long[] jArr14 = this.AudioAttributesImplApi26Parcelizer;
                int i71 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i71 + 1;
                jArr14[i71] = 1;
                return 0;
            case 54:
                int i72 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i73 = i72 - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i73;
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                iArr26[i72 - 2] = iArr26[i72 - 2] % iArr26[i73];
                this.MediaBrowserCompatCustomActionResultReceiver = i72;
                iArr26[i73] = 1;
                return 0;
            case 55:
                int i74 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i75 = i74 - 1;
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                iArr27[i74 - 2] = iArr27[i74 - 2] - iArr27[i75];
                this.MediaBrowserCompatCustomActionResultReceiver = i74;
                iArr27[i75] = 0;
                return 0;
            case 56:
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                int i76 = this.MediaBrowserCompatCustomActionResultReceiver - 1;
                this.MediaBrowserCompatCustomActionResultReceiver = i76;
                this.read = iArr28[i76];
                return 0;
            case 57:
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                int i77 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i77 + 1;
                iArr29[i77] = 65;
                return 0;
            case 58:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i78 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = i78 + 1;
                iArr30[i78] = 57;
                return 0;
            case 59:
                for (int i79 = this.MediaBrowserCompatCustomActionResultReceiver - 1; i79 >= 0; i79--) {
                    this.MediaBrowserCompatSearchResultReceiver[i79] = null;
                }
                Object[] objArr17 = this.MediaBrowserCompatSearchResultReceiver;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objArr17[0] = this.IconCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
