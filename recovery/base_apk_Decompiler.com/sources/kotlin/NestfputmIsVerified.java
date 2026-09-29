package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public class NestfputmIsVerified {
    public int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public Object AudioAttributesImplApi26Parcelizer;
    public float IconCompatParcelizer;
    public Object MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaBrowserCompatMediaItem;
    private final long[] MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public long write;
    private final int[] AudioAttributesImplBaseParcelizer = new int[15];
    private final float[] MediaBrowserCompatSearchResultReceiver = new float[15];
    private final double[] RatingCompat = new double[15];

    public NestfputmIsVerified(Object obj, long j, long j2) {
        long[] jArr = new long[15];
        this.MediaDescriptionCompat = jArr;
        Object[] objArr = new Object[15];
        this.MediaBrowserCompatMediaItem = objArr;
        objArr[10] = obj;
        jArr[11] = j;
        jArr[13] = j2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int read(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.MediaDescriptionCompat;
                int i2 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i2 + 1;
                jArr[i2] = jArr[11];
                return 0;
            case 2:
                long[] jArr2 = this.MediaDescriptionCompat;
                int i3 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i3 + 1;
                jArr2[i3] = jArr2[13];
                return 0;
            case 3:
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                int i4 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i4 + 1;
                iArr[i4] = 32;
                return 0;
            case 4:
                int i5 = this.MediaBrowserCompatItemReceiver;
                int i6 = i5 - 1;
                this.MediaBrowserCompatItemReceiver = i6;
                long[] jArr3 = this.MediaDescriptionCompat;
                jArr3[i5 - 2] = jArr3[i5 - 2] << this.AudioAttributesImplBaseParcelizer[i6];
                return 0;
            case 5:
                int i7 = this.MediaBrowserCompatItemReceiver;
                int i8 = i7 - 1;
                this.MediaBrowserCompatItemReceiver = i8;
                long[] jArr4 = this.MediaDescriptionCompat;
                jArr4[i7 - 2] = jArr4[i8] ^ jArr4[i7 - 2];
                return 0;
            case 6:
                int i9 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i9;
                long[] jArr5 = this.MediaDescriptionCompat;
                jArr5[11] = jArr5[i9];
                return 0;
            case 7:
                Object[] objArr = this.MediaBrowserCompatMediaItem;
                int i10 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i10 + 1;
                objArr[i10] = objArr[i10 - 1];
                return 0;
            case 8:
                int i11 = this.MediaBrowserCompatItemReceiver - this.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = i11;
                this.AudioAttributesImplApi21Parcelizer = i11;
                return 0;
            case 9:
                Object[] objArr2 = this.MediaBrowserCompatMediaItem;
                int i12 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i12 + 1;
                Object obj = objArr2[i12];
                objArr2[i12] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj;
                return 0;
            case 10:
                Object[] objArr3 = this.MediaBrowserCompatMediaItem;
                int i13 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i13 + 1;
                objArr3[i13] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            case 11:
                int i14 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i14;
                Object[] objArr4 = this.MediaBrowserCompatMediaItem;
                Object obj2 = objArr4[i14];
                objArr4[i14] = null;
                this.RemoteActionCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 12:
                Object[] objArr5 = this.MediaBrowserCompatMediaItem;
                int i15 = this.MediaBrowserCompatItemReceiver;
                Object obj3 = objArr5[i15 - 1];
                objArr5[i15 - 1] = null;
                Object obj4 = objArr5[i15 - 2];
                objArr5[i15 - 2] = null;
                objArr5[i15 - 1] = obj4;
                objArr5[i15 - 2] = obj3;
                int i16 = i15 - 1;
                this.MediaBrowserCompatItemReceiver = i16;
                objArr5[i16] = null;
                return 0;
            case 13:
                Object[] objArr6 = this.MediaBrowserCompatMediaItem;
                int i17 = this.MediaBrowserCompatItemReceiver;
                Object obj5 = objArr6[i17 - 1];
                objArr6[i17 - 1] = null;
                this.MediaBrowserCompatCustomActionResultReceiver = obj5;
                return 0;
            case 14:
                int i18 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i18;
                this.MediaBrowserCompatMediaItem[i18] = null;
                return 0;
            case 15:
                Object[] objArr7 = this.MediaBrowserCompatMediaItem;
                int i19 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i19 + 1;
                objArr7[i19] = null;
                return 0;
            case 16:
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i20 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i20 + 1;
                this.RemoteActionCompatParcelizer = iArr2[i20];
                return 0;
            case 17:
                Object[] objArr8 = this.MediaBrowserCompatMediaItem;
                int i21 = this.MediaBrowserCompatItemReceiver;
                objArr8[i21] = objArr8[i21 - 1];
                int[] iArr3 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i21 + 2;
                iArr3[i21 + 1] = 1;
                return 0;
            case 18:
                Object[] objArr9 = this.MediaBrowserCompatMediaItem;
                int i22 = this.MediaBrowserCompatItemReceiver;
                objArr9[i22] = null;
                this.MediaBrowserCompatItemReceiver = i22 + 2;
                objArr9[i22 + 1] = null;
                return 0;
            case 19:
                int i23 = this.MediaBrowserCompatItemReceiver;
                int i24 = i23 - 1;
                Object[] objArr10 = this.MediaBrowserCompatMediaItem;
                Object obj6 = objArr10[i24];
                objArr10[i24] = null;
                objArr10[10] = obj6;
                this.MediaBrowserCompatItemReceiver = i23;
                objArr10[i24] = obj6;
                return 0;
            case 20:
                int[] iArr4 = this.AudioAttributesImplBaseParcelizer;
                int i25 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i25 + 1;
                iArr4[i25] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 21:
                int i26 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i26;
                int[] iArr5 = this.AudioAttributesImplBaseParcelizer;
                iArr5[13] = iArr5[i26];
                return 0;
            case 22:
                int i27 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i27;
                Object[] objArr11 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr11[i27];
                objArr11[i27] = null;
                objArr11[14] = obj7;
                return 0;
            case 23:
                int[] iArr6 = this.AudioAttributesImplBaseParcelizer;
                int i28 = this.MediaBrowserCompatItemReceiver;
                iArr6[i28] = 0;
                this.MediaBrowserCompatItemReceiver = i28 + 2;
                iArr6[i28 + 1] = 0;
                return 0;
            case 24:
                int[] iArr7 = this.AudioAttributesImplBaseParcelizer;
                int i29 = this.MediaBrowserCompatItemReceiver;
                iArr7[i29 - 1] = (char) iArr7[i29 - 1];
                this.MediaBrowserCompatItemReceiver = i29 + 1;
                iArr7[i29] = 4;
                return 0;
            case 25:
                int[] iArr8 = this.AudioAttributesImplBaseParcelizer;
                int i30 = this.MediaBrowserCompatItemReceiver;
                iArr8[i30] = 8;
                this.MediaBrowserCompatItemReceiver = i30;
                iArr8[i30 - 1] = iArr8[i30 - 1] >> iArr8[i30];
                return 0;
            case 26:
                int i31 = this.MediaBrowserCompatItemReceiver;
                int i32 = i31 - 1;
                this.MediaBrowserCompatItemReceiver = i32;
                int[] iArr9 = this.AudioAttributesImplBaseParcelizer;
                iArr9[i31 - 2] = iArr9[i31 - 2] + iArr9[i32];
                return 0;
            case 27:
                int[] iArr10 = this.AudioAttributesImplBaseParcelizer;
                int i33 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i33 + 1;
                iArr10[i33] = 0;
                return 0;
            case 28:
                int[] iArr11 = this.AudioAttributesImplBaseParcelizer;
                int i34 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i34 + 1;
                iArr11[i34] = iArr11[13];
                return 0;
            case 29:
                int[] iArr12 = this.AudioAttributesImplBaseParcelizer;
                int i35 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i35 + 1;
                iArr12[i35] = 2;
                return 0;
            case 30:
                Object[] objArr12 = this.MediaBrowserCompatMediaItem;
                int i36 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i36 + 1;
                Object obj8 = objArr12[i36 - 1];
                objArr12[i36 - 1] = null;
                objArr12[i36] = obj8;
                int[] iArr13 = this.AudioAttributesImplBaseParcelizer;
                iArr13[i36 - 1] = iArr13[i36 - 2];
                objArr12[i36 - 2] = obj8;
                return 0;
            case 31:
                int[] iArr14 = this.AudioAttributesImplBaseParcelizer;
                int i37 = this.MediaBrowserCompatItemReceiver;
                iArr14[i37 - 1] = iArr14[i37 - 2];
                Object[] objArr13 = this.MediaBrowserCompatMediaItem;
                Object obj9 = objArr13[i37 - 1];
                objArr13[i37 - 1] = null;
                objArr13[i37 - 2] = obj9;
                return 0;
            case 32:
                int[] iArr15 = this.AudioAttributesImplBaseParcelizer;
                int i38 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i38 + 1;
                iArr15[i38] = 1;
                return 0;
            case 33:
                Object[] objArr14 = this.MediaBrowserCompatMediaItem;
                int i39 = this.MediaBrowserCompatItemReceiver;
                Object obj10 = objArr14[i39 - 2];
                objArr14[i39 - 2] = null;
                objArr14[i39 - 1] = obj10;
                int[] iArr16 = this.AudioAttributesImplBaseParcelizer;
                iArr16[i39 - 2] = iArr16[i39 - 1];
                int i40 = i39 - 3;
                this.MediaBrowserCompatItemReceiver = i40;
                Object obj11 = objArr14[i40];
                objArr14[i40] = null;
                int i41 = iArr16[i39 - 2];
                Object obj12 = objArr14[i39 - 1];
                objArr14[i39 - 1] = null;
                ((Object[]) obj11)[i41] = obj12;
                return 0;
            case 34:
                Object[] objArr15 = this.MediaBrowserCompatMediaItem;
                int i42 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i42 + 1;
                Object obj13 = objArr15[i42 - 1];
                objArr15[i42 - 1] = null;
                objArr15[i42] = obj13;
                Object obj14 = objArr15[i42 - 2];
                objArr15[i42 - 2] = null;
                objArr15[i42 - 1] = obj14;
                objArr15[i42 - 2] = obj13;
                return 0;
            case 35:
                Object[] objArr16 = this.MediaBrowserCompatMediaItem;
                int i43 = this.MediaBrowserCompatItemReceiver;
                Object obj15 = objArr16[i43 - 1];
                objArr16[i43 - 1] = null;
                Object obj16 = objArr16[i43 - 2];
                objArr16[i43 - 2] = null;
                objArr16[i43 - 1] = obj16;
                objArr16[i43 - 2] = obj15;
                int[] iArr17 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i43 + 1;
                iArr17[i43] = 0;
                return 0;
            case 36:
                long[] jArr6 = this.MediaDescriptionCompat;
                int i44 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i44 + 1;
                jArr6[i44] = this.read;
                return 0;
            case 37:
                int[] iArr18 = this.AudioAttributesImplBaseParcelizer;
                int i45 = this.MediaBrowserCompatItemReceiver;
                iArr18[i45 - 1] = (char) iArr18[i45 - 1];
                this.MediaBrowserCompatItemReceiver = i45 + 1;
                iArr18[i45] = 7;
                return 0;
            case 38:
                long[] jArr7 = this.MediaDescriptionCompat;
                int i46 = this.MediaBrowserCompatItemReceiver;
                jArr7[i46] = 0;
                this.MediaBrowserCompatItemReceiver = i46;
                this.AudioAttributesImplBaseParcelizer[i46 - 1] = (jArr7[i46 - 1] > jArr7[i46] ? 1 : (jArr7[i46 - 1] == jArr7[i46] ? 0 : -1));
                return 0;
            case 39:
                int i47 = this.MediaBrowserCompatItemReceiver;
                int i48 = i47 - 1;
                this.MediaBrowserCompatItemReceiver = i48;
                int[] iArr19 = this.AudioAttributesImplBaseParcelizer;
                iArr19[i47 - 2] = iArr19[i47 - 2] - iArr19[i48];
                return 0;
            case 40:
                int[] iArr20 = this.AudioAttributesImplBaseParcelizer;
                int i49 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i49 + 1;
                iArr20[i49] = 3;
                return 0;
            case 41:
                long[] jArr8 = this.MediaDescriptionCompat;
                int i50 = this.MediaBrowserCompatItemReceiver;
                jArr8[i50] = 0;
                int[] iArr21 = this.AudioAttributesImplBaseParcelizer;
                iArr21[i50 - 1] = (jArr8[i50 - 1] > jArr8[i50] ? 1 : (jArr8[i50 - 1] == jArr8[i50] ? 0 : -1));
                int i51 = i50 - 1;
                this.MediaBrowserCompatItemReceiver = i51;
                iArr21[i50 - 2] = iArr21[i50 - 2] + iArr21[i51];
                return 0;
            case 42:
                int i52 = this.MediaBrowserCompatItemReceiver;
                int i53 = i52 - 3;
                this.MediaBrowserCompatItemReceiver = i53;
                Object[] objArr17 = this.MediaBrowserCompatMediaItem;
                Object obj17 = objArr17[i53];
                objArr17[i53] = null;
                int i54 = this.AudioAttributesImplBaseParcelizer[i52 - 2];
                Object obj18 = objArr17[i52 - 1];
                objArr17[i52 - 1] = null;
                ((Object[]) obj17)[i54] = obj18;
                return 0;
            case 43:
                Object[] objArr18 = this.MediaBrowserCompatMediaItem;
                int i55 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i55 + 1;
                Object obj19 = objArr18[i55 - 1];
                objArr18[i55 - 1] = null;
                objArr18[i55] = obj19;
                Object obj20 = objArr18[i55 - 2];
                objArr18[i55 - 2] = null;
                objArr18[i55 - 1] = obj20;
                Object obj21 = objArr18[i55 - 3];
                objArr18[i55 - 3] = null;
                objArr18[i55 - 2] = obj21;
                objArr18[i55 - 3] = obj19;
                return 0;
            case 44:
                int[] iArr22 = this.AudioAttributesImplBaseParcelizer;
                int i56 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i56 + 1;
                iArr22[i56] = 18692;
                return 0;
            case 45:
                int[] iArr23 = this.AudioAttributesImplBaseParcelizer;
                int i57 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i57 + 1;
                iArr23[i57] = 16;
                return 0;
            case 46:
                int i58 = this.MediaBrowserCompatItemReceiver;
                int i59 = i58 - 1;
                this.MediaBrowserCompatItemReceiver = i59;
                int[] iArr24 = this.AudioAttributesImplBaseParcelizer;
                iArr24[i58 - 2] = iArr24[i58 - 2] >> iArr24[i59];
                return 0;
            case 47:
                int i60 = this.MediaBrowserCompatItemReceiver;
                int i61 = i60 - 1;
                int[] iArr25 = this.AudioAttributesImplBaseParcelizer;
                iArr25[i60 - 2] = iArr25[i60 - 2] + iArr25[i61];
                iArr25[i60 - 2] = (char) iArr25[i60 - 2];
                this.MediaBrowserCompatItemReceiver = i60;
                iArr25[i61] = 1;
                return 0;
            case 48:
                int[] iArr26 = this.AudioAttributesImplBaseParcelizer;
                int i62 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i62 + 1;
                iArr26[i62] = 9;
                return 0;
            case 49:
                long[] jArr9 = this.MediaDescriptionCompat;
                int i63 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i63 + 1;
                jArr9[i63] = 0;
                return 0;
            case 50:
                int i64 = this.MediaBrowserCompatItemReceiver;
                int[] iArr27 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr10 = this.MediaDescriptionCompat;
                iArr27[i64 - 2] = (jArr10[i64 - 2] > jArr10[i64 - 1] ? 1 : (jArr10[i64 - 2] == jArr10[i64 - 1] ? 0 : -1));
                int i65 = i64 - 2;
                this.MediaBrowserCompatItemReceiver = i65;
                iArr27[i64 - 3] = iArr27[i64 - 3] + iArr27[i65];
                return 0;
            case 51:
                long[] jArr11 = this.MediaDescriptionCompat;
                int i66 = this.MediaBrowserCompatItemReceiver;
                jArr11[i66] = jArr11[11];
                Object[] objArr19 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatItemReceiver = i66 + 2;
                objArr19[i66 + 1] = objArr19[14];
                return 0;
            case 52:
                Object[] objArr20 = this.MediaBrowserCompatMediaItem;
                int i67 = this.MediaBrowserCompatItemReceiver;
                Object obj22 = objArr20[i67 - 1];
                objArr20[i67 - 1] = null;
                Object obj23 = objArr20[i67 - 2];
                objArr20[i67 - 2] = null;
                objArr20[i67 - 1] = obj23;
                objArr20[i67 - 2] = obj22;
                int[] iArr28 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i67 + 1;
                iArr28[i67] = 2;
                return 0;
            case 53:
                Object[] objArr21 = this.MediaBrowserCompatMediaItem;
                int i68 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i68 + 1;
                Object obj24 = objArr21[i68 - 1];
                objArr21[i68 - 1] = null;
                objArr21[i68] = obj24;
                long[] jArr12 = this.MediaDescriptionCompat;
                jArr12[i68 - 1] = jArr12[i68 - 2];
                objArr21[i68 - 2] = obj24;
                return 0;
            case 54:
                long[] jArr13 = this.MediaDescriptionCompat;
                int i69 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i69 + 1;
                this.write = jArr13[i69];
                return 0;
            case 55:
                Object[] objArr22 = this.MediaBrowserCompatMediaItem;
                int i70 = this.MediaBrowserCompatItemReceiver;
                Object obj25 = objArr22[i70 - 1];
                objArr22[i70 - 1] = null;
                Object obj26 = objArr22[i70 - 2];
                objArr22[i70 - 2] = null;
                objArr22[i70 - 1] = obj26;
                objArr22[i70 - 2] = obj25;
                return 0;
            case 56:
                Object[] objArr23 = this.MediaBrowserCompatMediaItem;
                int i71 = this.MediaBrowserCompatItemReceiver;
                Object obj27 = objArr23[i71 - 1];
                objArr23[i71 - 1] = null;
                Object obj28 = objArr23[i71 - 2];
                objArr23[i71 - 2] = null;
                objArr23[i71 - 1] = obj28;
                objArr23[i71 - 2] = obj27;
                int[] iArr29 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i71 + 1;
                iArr29[i71] = 1;
                Object obj29 = objArr23[i71 - 1];
                objArr23[i71 - 1] = null;
                objArr23[i71] = obj29;
                iArr29[i71 - 1] = iArr29[i71];
                return 0;
            case 57:
                int i72 = this.MediaBrowserCompatItemReceiver;
                int i73 = i72 - 3;
                this.MediaBrowserCompatItemReceiver = i73;
                Object[] objArr24 = this.MediaBrowserCompatMediaItem;
                Object obj30 = objArr24[i73];
                objArr24[i73] = null;
                int i74 = this.AudioAttributesImplBaseParcelizer[i72 - 2];
                Object obj31 = objArr24[i72 - 1];
                objArr24[i72 - 1] = null;
                ((Object[]) obj30)[i74] = obj31;
                this.MediaBrowserCompatItemReceiver = i72 - 2;
                Object obj32 = objArr24[i72 - 4];
                objArr24[i72 - 4] = null;
                objArr24[i73] = obj32;
                Object obj33 = objArr24[i72 - 5];
                objArr24[i72 - 5] = null;
                objArr24[i72 - 4] = obj33;
                objArr24[i72 - 5] = obj32;
                Object obj34 = objArr24[i72 - 3];
                objArr24[i72 - 3] = null;
                Object obj35 = objArr24[i72 - 4];
                objArr24[i72 - 4] = null;
                objArr24[i72 - 3] = obj35;
                objArr24[i72 - 4] = obj34;
                return 0;
            case 58:
                int[] iArr30 = this.AudioAttributesImplBaseParcelizer;
                int i75 = this.MediaBrowserCompatItemReceiver;
                iArr30[i75] = 0;
                Object[] objArr25 = this.MediaBrowserCompatMediaItem;
                Object obj36 = objArr25[i75 - 1];
                objArr25[i75 - 1] = null;
                objArr25[i75] = obj36;
                iArr30[i75 - 1] = iArr30[i75];
                int i76 = i75 - 2;
                this.MediaBrowserCompatItemReceiver = i76;
                Object obj37 = objArr25[i76];
                objArr25[i76] = null;
                int i77 = iArr30[i75 - 1];
                Object obj38 = objArr25[i75];
                objArr25[i75] = null;
                ((Object[]) obj37)[i77] = obj38;
                return 0;
            case 59:
                Object[] objArr26 = this.MediaBrowserCompatMediaItem;
                int i78 = this.MediaBrowserCompatItemReceiver;
                objArr26[i78] = objArr26[i78 - 1];
                int[] iArr31 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i78 + 2;
                iArr31[i78 + 1] = 0;
                return 0;
            case 60:
                float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
                int i79 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i79 + 1;
                fArr[i79] = this.IconCompatParcelizer;
                return 0;
            case 61:
                int[] iArr32 = this.AudioAttributesImplBaseParcelizer;
                int i80 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i80 + 1;
                iArr32[i80] = -1;
                return 0;
            case 62:
                float[] fArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i81 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i81 + 1;
                fArr2[i81] = 0.0f;
                return 0;
            case 63:
                int i82 = this.MediaBrowserCompatItemReceiver;
                int i83 = i82 - 1;
                this.MediaBrowserCompatItemReceiver = i83;
                float[] fArr3 = this.MediaBrowserCompatSearchResultReceiver;
                this.AudioAttributesImplBaseParcelizer[i82 - 2] = (fArr3[i82 - 2] > fArr3[i83] ? 1 : (fArr3[i82 - 2] == fArr3[i83] ? 0 : -1));
                return 0;
            case 64:
                int i84 = this.MediaBrowserCompatItemReceiver;
                int i85 = i84 - 1;
                int[] iArr33 = this.AudioAttributesImplBaseParcelizer;
                iArr33[i84 - 2] = iArr33[i84 - 2] + iArr33[i85];
                iArr33[i84 - 2] = (char) iArr33[i84 - 2];
                this.MediaBrowserCompatItemReceiver = i84;
                iArr33[i85] = 9;
                return 0;
            case 65:
                int i86 = this.MediaBrowserCompatItemReceiver;
                int i87 = i86 - 1;
                int[] iArr34 = this.AudioAttributesImplBaseParcelizer;
                iArr34[i86 - 2] = iArr34[i86 - 2] + iArr34[i87];
                this.MediaBrowserCompatItemReceiver = i86;
                iArr34[i87] = 11;
                return 0;
            case 66:
                long[] jArr14 = this.MediaDescriptionCompat;
                int i88 = this.MediaBrowserCompatItemReceiver;
                jArr14[i88] = 0;
                int[] iArr35 = this.AudioAttributesImplBaseParcelizer;
                iArr35[i88 - 1] = (jArr14[i88 - 1] > jArr14[i88] ? 1 : (jArr14[i88 - 1] == jArr14[i88] ? 0 : -1));
                int i89 = i88 - 1;
                this.MediaBrowserCompatItemReceiver = i89;
                iArr35[i88 - 2] = iArr35[i88 - 2] - iArr35[i89];
                return 0;
            case 67:
                int[] iArr36 = this.AudioAttributesImplBaseParcelizer;
                int i90 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i90 + 1;
                iArr36[i90] = 48;
                return 0;
            case 68:
                int i91 = this.MediaBrowserCompatItemReceiver;
                int i92 = i91 - 1;
                int[] iArr37 = this.AudioAttributesImplBaseParcelizer;
                iArr37[i91 - 2] = iArr37[i91 - 2] + iArr37[i92];
                iArr37[i91 - 2] = (char) iArr37[i91 - 2];
                this.MediaBrowserCompatItemReceiver = i91;
                iArr37[i92] = 14;
                return 0;
            case 69:
                int[] iArr38 = this.AudioAttributesImplBaseParcelizer;
                int i93 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i93 + 1;
                iArr38[i93] = 19;
                return 0;
            case 70:
                int i94 = this.MediaBrowserCompatItemReceiver;
                int[] iArr39 = this.AudioAttributesImplBaseParcelizer;
                iArr39[i94 - 2] = iArr39[i94 - 2] >> iArr39[i94 - 1];
                int i95 = i94 - 2;
                this.MediaBrowserCompatItemReceiver = i95;
                iArr39[i94 - 3] = iArr39[i94 - 3] + iArr39[i95];
                return 0;
            case 71:
                Object[] objArr27 = this.MediaBrowserCompatMediaItem;
                int i96 = this.MediaBrowserCompatItemReceiver;
                Object obj39 = objArr27[i96 - 2];
                objArr27[i96 - 2] = null;
                objArr27[i96 - 1] = obj39;
                int[] iArr40 = this.AudioAttributesImplBaseParcelizer;
                iArr40[i96 - 2] = iArr40[i96 - 1];
                return 0;
            case 72:
                Object[] objArr28 = this.MediaBrowserCompatMediaItem;
                int i97 = this.MediaBrowserCompatItemReceiver;
                Object obj40 = objArr28[i97 - 1];
                objArr28[i97 - 1] = null;
                objArr28[i97] = obj40;
                Object obj41 = objArr28[i97 - 2];
                objArr28[i97 - 2] = null;
                objArr28[i97 - 1] = obj41;
                objArr28[i97 - 2] = obj40;
                Object obj42 = objArr28[i97];
                objArr28[i97] = null;
                Object obj43 = objArr28[i97 - 1];
                objArr28[i97 - 1] = null;
                objArr28[i97] = obj43;
                objArr28[i97 - 1] = obj42;
                int[] iArr41 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i97 + 2;
                iArr41[i97 + 1] = 0;
                return 0;
            case 73:
                int i98 = this.MediaBrowserCompatItemReceiver;
                int i99 = i98 - 3;
                this.MediaBrowserCompatItemReceiver = i99;
                Object[] objArr29 = this.MediaBrowserCompatMediaItem;
                Object obj44 = objArr29[i99];
                objArr29[i99] = null;
                int i100 = this.AudioAttributesImplBaseParcelizer[i98 - 2];
                Object obj45 = objArr29[i98 - 1];
                objArr29[i98 - 1] = null;
                ((Object[]) obj44)[i100] = obj45;
                this.MediaBrowserCompatItemReceiver = i98 - 2;
                objArr29[i99] = objArr29[i98 - 4];
                return 0;
            case 74:
                Object[] objArr30 = this.MediaBrowserCompatMediaItem;
                int i101 = this.MediaBrowserCompatItemReceiver;
                objArr30[i101] = objArr30[10];
                int[] iArr42 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i101 + 2;
                iArr42[i101 + 1] = 3;
                return 0;
            case 75:
                int[] iArr43 = this.AudioAttributesImplBaseParcelizer;
                int i102 = this.MediaBrowserCompatItemReceiver;
                iArr43[i102 - 1] = (char) iArr43[i102 - 1];
                iArr43[i102] = 11;
                this.MediaBrowserCompatItemReceiver = i102 + 2;
                iArr43[i102 + 1] = 0;
                return 0;
            case 76:
                int i103 = this.MediaBrowserCompatItemReceiver;
                int[] iArr44 = this.AudioAttributesImplBaseParcelizer;
                long[] jArr15 = this.MediaDescriptionCompat;
                iArr44[i103 - 2] = (jArr15[i103 - 2] > jArr15[i103 - 1] ? 1 : (jArr15[i103 - 2] == jArr15[i103 - 1] ? 0 : -1));
                int i104 = i103 - 2;
                iArr44[i103 - 3] = iArr44[i103 - 3] - iArr44[i104];
                this.MediaBrowserCompatItemReceiver = i103 - 1;
                iArr44[i104] = 31;
                return 0;
            case 77:
                int[] iArr45 = this.AudioAttributesImplBaseParcelizer;
                int i105 = this.MediaBrowserCompatItemReceiver;
                iArr45[i105] = 48;
                this.MediaBrowserCompatItemReceiver = i105 + 2;
                iArr45[i105 + 1] = 0;
                return 0;
            case 78:
                Object[] objArr31 = this.MediaBrowserCompatMediaItem;
                int i106 = this.MediaBrowserCompatItemReceiver;
                Object obj46 = objArr31[i106 - 1];
                objArr31[i106 - 1] = null;
                Object obj47 = objArr31[i106 - 2];
                objArr31[i106 - 2] = null;
                objArr31[i106 - 1] = obj47;
                objArr31[i106 - 2] = obj46;
                int[] iArr46 = this.AudioAttributesImplBaseParcelizer;
                this.MediaBrowserCompatItemReceiver = i106 + 1;
                iArr46[i106] = 1;
                return 0;
            case 79:
                Object[] objArr32 = this.MediaBrowserCompatMediaItem;
                int i107 = this.MediaBrowserCompatItemReceiver;
                Object obj48 = objArr32[i107 - 2];
                objArr32[i107 - 2] = null;
                objArr32[i107 - 1] = obj48;
                int[] iArr47 = this.AudioAttributesImplBaseParcelizer;
                iArr47[i107 - 2] = iArr47[i107 - 1];
                int i108 = i107 - 3;
                this.MediaBrowserCompatItemReceiver = i108;
                Object obj49 = objArr32[i108];
                objArr32[i108] = null;
                int i109 = iArr47[i107 - 2];
                Object obj50 = objArr32[i107 - 1];
                objArr32[i107 - 1] = null;
                ((Object[]) obj49)[i109] = obj50;
                this.MediaBrowserCompatItemReceiver = i107 - 2;
                Object obj51 = objArr32[i107 - 4];
                objArr32[i107 - 4] = null;
                objArr32[i108] = obj51;
                iArr47[i107 - 4] = iArr47[i107 - 5];
                objArr32[i107 - 5] = obj51;
                return 0;
            case 80:
                int[] iArr48 = this.AudioAttributesImplBaseParcelizer;
                int i110 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i110 + 1;
                iArr48[i110] = 0;
                Object[] objArr33 = this.MediaBrowserCompatMediaItem;
                Object obj52 = objArr33[i110 - 1];
                objArr33[i110 - 1] = null;
                objArr33[i110] = obj52;
                iArr48[i110 - 1] = iArr48[i110];
                return 0;
            case 81:
                Object[] objArr34 = this.MediaBrowserCompatMediaItem;
                int i111 = this.MediaBrowserCompatItemReceiver;
                Object obj53 = objArr34[i111 - 1];
                objArr34[i111 - 1] = null;
                objArr34[i111] = obj53;
                Object obj54 = objArr34[i111 - 2];
                objArr34[i111 - 2] = null;
                objArr34[i111 - 1] = obj54;
                Object obj55 = objArr34[i111 - 3];
                objArr34[i111 - 3] = null;
                objArr34[i111 - 2] = obj55;
                objArr34[i111 - 3] = obj53;
                this.MediaBrowserCompatItemReceiver = i111;
                objArr34[i111] = null;
                return 0;
            case 82:
                int i112 = this.MediaBrowserCompatItemReceiver;
                int[] iArr49 = this.AudioAttributesImplBaseParcelizer;
                iArr49[i112 - 2] = iArr49[i112 - 2] >> iArr49[i112 - 1];
                int i113 = i112 - 2;
                this.MediaBrowserCompatItemReceiver = i113;
                iArr49[i112 - 3] = iArr49[i112 - 3] - iArr49[i113];
                iArr49[i112 - 3] = (char) iArr49[i112 - 3];
                return 0;
            case 83:
                int[] iArr50 = this.AudioAttributesImplBaseParcelizer;
                int i114 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i114 + 1;
                iArr50[i114] = 12;
                return 0;
            case 84:
                float[] fArr4 = this.MediaBrowserCompatSearchResultReceiver;
                int i115 = this.MediaBrowserCompatItemReceiver;
                fArr4[i115] = 0.0f;
                int[] iArr51 = this.AudioAttributesImplBaseParcelizer;
                iArr51[i115 - 1] = (fArr4[i115 - 1] > fArr4[i115] ? 1 : (fArr4[i115 - 1] == fArr4[i115] ? 0 : -1));
                int i116 = i115 - 1;
                this.MediaBrowserCompatItemReceiver = i116;
                iArr51[i115 - 2] = iArr51[i115 - 2] + iArr51[i116];
                return 0;
            case 85:
                int[] iArr52 = this.AudioAttributesImplBaseParcelizer;
                int i117 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i117 + 1;
                iArr52[i117] = 44;
                return 0;
            case 86:
                float[] fArr5 = this.MediaBrowserCompatSearchResultReceiver;
                int i118 = this.MediaBrowserCompatItemReceiver;
                fArr5[i118] = 0.0f;
                this.MediaBrowserCompatItemReceiver = i118;
                this.AudioAttributesImplBaseParcelizer[i118 - 1] = (fArr5[i118 - 1] > fArr5[i118] ? 1 : (fArr5[i118 - 1] == fArr5[i118] ? 0 : -1));
                return 0;
            case 87:
                int[] iArr53 = this.AudioAttributesImplBaseParcelizer;
                int i119 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i119 + 1;
                iArr53[i119] = 1;
                Object[] objArr35 = this.MediaBrowserCompatMediaItem;
                Object obj56 = objArr35[i119 - 1];
                objArr35[i119 - 1] = null;
                objArr35[i119] = obj56;
                iArr53[i119 - 1] = iArr53[i119];
                return 0;
            case 88:
                int i120 = this.MediaBrowserCompatItemReceiver;
                int i121 = i120 - 3;
                this.MediaBrowserCompatItemReceiver = i121;
                Object[] objArr36 = this.MediaBrowserCompatMediaItem;
                Object obj57 = objArr36[i121];
                objArr36[i121] = null;
                int i122 = this.AudioAttributesImplBaseParcelizer[i120 - 2];
                Object obj58 = objArr36[i120 - 1];
                objArr36[i120 - 1] = null;
                ((Object[]) obj57)[i122] = obj58;
                this.MediaBrowserCompatItemReceiver = i120 - 2;
                Object obj59 = objArr36[i120 - 4];
                objArr36[i120 - 4] = null;
                objArr36[i121] = obj59;
                Object obj60 = objArr36[i120 - 5];
                objArr36[i120 - 5] = null;
                objArr36[i120 - 4] = obj60;
                objArr36[i120 - 5] = obj59;
                return 0;
            case 89:
                int[] iArr54 = this.AudioAttributesImplBaseParcelizer;
                int i123 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i123 + 1;
                iArr54[i123] = 4724;
                return 0;
            case 90:
                int i124 = this.MediaBrowserCompatItemReceiver;
                int i125 = i124 - 1;
                this.MediaBrowserCompatItemReceiver = i125;
                int[] iArr55 = this.AudioAttributesImplBaseParcelizer;
                iArr55[i124 - 2] = iArr55[i124 - 2] + iArr55[i125];
                iArr55[i124 - 2] = (char) iArr55[i124 - 2];
                return 0;
            case 91:
                int[] iArr56 = this.AudioAttributesImplBaseParcelizer;
                int i126 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i126 + 1;
                iArr56[i126] = 57;
                return 0;
            case 92:
                int[] iArr57 = this.AudioAttributesImplBaseParcelizer;
                int i127 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i127 + 1;
                iArr57[i127] = 8;
                return 0;
            case 93:
                int[] iArr58 = this.AudioAttributesImplBaseParcelizer;
                int i128 = this.MediaBrowserCompatItemReceiver;
                iArr58[i128] = 2;
                this.MediaBrowserCompatItemReceiver = i128 + 2;
                iArr58[i128 + 1] = 2;
                return 0;
            case 94:
                int i129 = this.MediaBrowserCompatItemReceiver;
                int i130 = i129 - 1;
                this.MediaBrowserCompatItemReceiver = i130;
                int[] iArr59 = this.AudioAttributesImplBaseParcelizer;
                iArr59[i129 - 2] = iArr59[i129 - 2] % iArr59[i130];
                return 0;
            case 95:
                int[] iArr60 = this.AudioAttributesImplBaseParcelizer;
                int i131 = this.MediaBrowserCompatItemReceiver;
                iArr60[i131] = 2;
                this.MediaBrowserCompatItemReceiver = i131;
                iArr60[i131 - 1] = iArr60[i131 - 1] % iArr60[i131];
                int i132 = i131 - 1;
                this.MediaBrowserCompatItemReceiver = i132;
                this.MediaBrowserCompatMediaItem[i132] = null;
                return 0;
            case 96:
                int[] iArr61 = this.AudioAttributesImplBaseParcelizer;
                int i133 = this.MediaBrowserCompatItemReceiver;
                iArr61[i133] = 121;
                iArr61[i133 - 1] = iArr61[i133 - 1] + iArr61[i133];
                this.MediaBrowserCompatItemReceiver = i133 + 1;
                iArr61[i133] = iArr61[i133 - 1];
                return 0;
            case 97:
                int[] iArr62 = this.AudioAttributesImplBaseParcelizer;
                int i134 = this.MediaBrowserCompatItemReceiver;
                iArr62[i134] = 128;
                this.MediaBrowserCompatItemReceiver = i134;
                iArr62[i134 - 1] = iArr62[i134 - 1] % iArr62[i134];
                return 0;
            case 98:
                int i135 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i135;
                this.RemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer[i135] != 0 ? 0 : 1;
                return 0;
            case 99:
                int[] iArr63 = this.AudioAttributesImplBaseParcelizer;
                int i136 = this.MediaBrowserCompatItemReceiver;
                iArr63[i136] = 2;
                this.MediaBrowserCompatItemReceiver = i136;
                iArr63[i136 - 1] = iArr63[i136 - 1] % iArr63[i136];
                return 0;
            case 100:
                int[] iArr64 = this.AudioAttributesImplBaseParcelizer;
                int i137 = this.MediaBrowserCompatItemReceiver;
                iArr64[i137] = 75;
                this.MediaBrowserCompatItemReceiver = i137;
                iArr64[i137 - 1] = iArr64[i137 - 1] + iArr64[i137];
                return 0;
            case 101:
                int[] iArr65 = this.AudioAttributesImplBaseParcelizer;
                int i138 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i138 + 1;
                iArr65[i138] = iArr65[i138 - 1];
                return 0;
            case 102:
                int i139 = this.MediaBrowserCompatItemReceiver;
                long[] jArr16 = this.MediaDescriptionCompat;
                jArr16[i139 - 2] = jArr16[i139 - 2] ^ jArr16[i139 - 1];
                int i140 = i139 - 2;
                this.MediaBrowserCompatItemReceiver = i140;
                jArr16[11] = jArr16[i140];
                return 0;
            case 103:
                int[] iArr66 = this.AudioAttributesImplBaseParcelizer;
                int i141 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i141;
                this.RemoteActionCompatParcelizer = iArr66[i141];
                return 0;
            case 104:
                for (int i142 = this.MediaBrowserCompatItemReceiver - 1; i142 >= 0; i142--) {
                    this.MediaBrowserCompatMediaItem[i142] = null;
                }
                Object[] objArr37 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr37[0] = this.AudioAttributesImplApi26Parcelizer;
                return 0;
            default:
                return i;
        }
    }
}
