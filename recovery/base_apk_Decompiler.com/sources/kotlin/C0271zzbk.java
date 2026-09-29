package kotlin;

/* JADX INFO: renamed from: o.zzbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C0271zzbk {
    public Object AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final long[] AudioAttributesImplBaseParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public long write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[12];
    private final float[] AudioAttributesImplApi26Parcelizer = new float[12];
    private final double[] MediaBrowserCompatMediaItem = new double[12];

    public C0271zzbk(Object obj, long j, long j2) {
        long[] jArr = new long[12];
        this.AudioAttributesImplBaseParcelizer = jArr;
        Object[] objArr = new Object[12];
        this.MediaMetadataCompat = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        jArr[10] = j2;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                long[] jArr = this.AudioAttributesImplBaseParcelizer;
                int i2 = this.MediaBrowserCompatItemReceiver;
                jArr[i2] = jArr[8];
                this.MediaBrowserCompatItemReceiver = i2 + 2;
                jArr[i2 + 1] = jArr[10];
                return 0;
            case 2:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i3 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i3 + 1;
                iArr[i3] = 32;
                return 0;
            case 3:
                int i4 = this.MediaBrowserCompatItemReceiver;
                int i5 = i4 - 1;
                this.MediaBrowserCompatItemReceiver = i5;
                long[] jArr2 = this.AudioAttributesImplBaseParcelizer;
                jArr2[i4 - 2] = jArr2[i4 - 2] << this.MediaBrowserCompatCustomActionResultReceiver[i5];
                return 0;
            case 4:
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i6 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i6 + 1;
                iArr2[i6] = this.read;
                return 0;
            case 5:
                int i7 = this.MediaBrowserCompatItemReceiver;
                long[] jArr3 = this.AudioAttributesImplBaseParcelizer;
                jArr3[i7 - 2] = jArr3[i7 - 2] ^ jArr3[i7 - 1];
                int i8 = i7 - 2;
                this.MediaBrowserCompatItemReceiver = i8;
                jArr3[8] = jArr3[i8];
                return 0;
            case 6:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.MediaBrowserCompatItemReceiver;
                iArr3[i9] = 8;
                this.MediaBrowserCompatItemReceiver = i9;
                iArr3[i9 - 1] = iArr3[i9 - 1] >> iArr3[i9];
                return 0;
            case 7:
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i10 = this.MediaBrowserCompatItemReceiver;
                iArr4[i10 - 1] = (char) iArr4[i10 - 1];
                return 0;
            case 8:
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i11 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i11 + 1;
                iArr5[i11] = 3;
                return 0;
            case 9:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i12 + 1;
                iArr6[i12] = 16;
                return 0;
            case 10:
                int i13 = this.MediaBrowserCompatItemReceiver;
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr7[i13 - 2] = iArr7[i13 - 2] >> iArr7[i13 - 1];
                int i14 = i13 - 2;
                this.MediaBrowserCompatItemReceiver = i14;
                iArr7[i13 - 3] = iArr7[i13 - 3] + iArr7[i14];
                return 0;
            case 11:
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i15 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i15 + 1;
                iArr8[i15] = 22;
                return 0;
            case 12:
                int i16 = this.MediaBrowserCompatItemReceiver;
                int i17 = i16 - 1;
                this.MediaBrowserCompatItemReceiver = i17;
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr9[i16 - 2] = iArr9[i16 - 2] >> iArr9[i17];
                return 0;
            case 13:
                int i18 = this.MediaBrowserCompatItemReceiver - this.read;
                this.MediaBrowserCompatItemReceiver = i18;
                this.AudioAttributesImplApi21Parcelizer = i18;
                return 0;
            case 14:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i19 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i19 + 1;
                this.RemoteActionCompatParcelizer = iArr10[i19];
                return 0;
            case 15:
                Object[] objArr = this.MediaMetadataCompat;
                int i20 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i20 + 1;
                objArr[i20] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 16:
                long[] jArr4 = this.AudioAttributesImplBaseParcelizer;
                int i21 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i21 + 1;
                jArr4[i21] = jArr4[8];
                return 0;
            case 17:
                Object[] objArr2 = this.MediaMetadataCompat;
                int i22 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i22 + 1;
                Object obj = objArr2[i22];
                objArr2[i22] = null;
                this.IconCompatParcelizer = obj;
                return 0;
            case 18:
                Object[] objArr3 = this.MediaMetadataCompat;
                int i23 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i23 + 1;
                objArr3[i23] = objArr3[i23 - 1];
                return 0;
            case 19:
                int i24 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i24;
                Object[] objArr4 = this.MediaMetadataCompat;
                Object obj2 = objArr4[i24];
                objArr4[i24] = null;
                this.RemoteActionCompatParcelizer = obj2 == null ? 0 : 1;
                return 0;
            case 20:
                Object[] objArr5 = this.MediaMetadataCompat;
                int i25 = this.MediaBrowserCompatItemReceiver;
                Object obj3 = objArr5[i25 - 1];
                objArr5[i25 - 1] = null;
                Object obj4 = objArr5[i25 - 2];
                objArr5[i25 - 2] = null;
                objArr5[i25 - 1] = obj4;
                objArr5[i25 - 2] = obj3;
                int i26 = i25 - 1;
                this.MediaBrowserCompatItemReceiver = i26;
                objArr5[i26] = null;
                return 0;
            case 21:
                Object[] objArr6 = this.MediaMetadataCompat;
                int i27 = this.MediaBrowserCompatItemReceiver;
                Object obj5 = objArr6[i27 - 1];
                objArr6[i27 - 1] = null;
                this.IconCompatParcelizer = obj5;
                return 0;
            case 22:
                int i28 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i28;
                this.MediaMetadataCompat[i28] = null;
                return 0;
            case 23:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i29 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i29 + 1;
                iArr11[i29] = 2;
                return 0;
            case 24:
                Object[] objArr7 = this.MediaMetadataCompat;
                int i30 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i30 + 1;
                Object obj6 = objArr7[i30 - 1];
                objArr7[i30 - 1] = null;
                objArr7[i30] = obj6;
                long[] jArr5 = this.AudioAttributesImplBaseParcelizer;
                jArr5[i30 - 1] = jArr5[i30 - 2];
                objArr7[i30 - 2] = obj6;
                return 0;
            case 25:
                long[] jArr6 = this.AudioAttributesImplBaseParcelizer;
                int i31 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i31 + 1;
                this.write = jArr6[i31];
                return 0;
            case 26:
                Object[] objArr8 = this.MediaMetadataCompat;
                int i32 = this.MediaBrowserCompatItemReceiver;
                Object obj7 = objArr8[i32 - 1];
                objArr8[i32 - 1] = null;
                Object obj8 = objArr8[i32 - 2];
                objArr8[i32 - 2] = null;
                objArr8[i32 - 1] = obj8;
                objArr8[i32 - 2] = obj7;
                this.MediaBrowserCompatItemReceiver = i32 + 1;
                Object obj9 = objArr8[i32 - 1];
                objArr8[i32 - 1] = null;
                objArr8[i32] = obj9;
                Object obj10 = objArr8[i32 - 2];
                objArr8[i32 - 2] = null;
                objArr8[i32 - 1] = obj10;
                objArr8[i32 - 2] = obj9;
                return 0;
            case 27:
                Object[] objArr9 = this.MediaMetadataCompat;
                int i33 = this.MediaBrowserCompatItemReceiver;
                Object obj11 = objArr9[i33 - 1];
                objArr9[i33 - 1] = null;
                Object obj12 = objArr9[i33 - 2];
                objArr9[i33 - 2] = null;
                objArr9[i33 - 1] = obj12;
                objArr9[i33 - 2] = obj11;
                return 0;
            case 28:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i34 = this.MediaBrowserCompatItemReceiver;
                iArr12[i34] = 1;
                Object[] objArr10 = this.MediaMetadataCompat;
                Object obj13 = objArr10[i34 - 1];
                objArr10[i34 - 1] = null;
                objArr10[i34] = obj13;
                iArr12[i34 - 1] = iArr12[i34];
                int i35 = i34 - 2;
                this.MediaBrowserCompatItemReceiver = i35;
                Object obj14 = objArr10[i35];
                objArr10[i35] = null;
                int i36 = iArr12[i34 - 1];
                Object obj15 = objArr10[i34];
                objArr10[i34] = null;
                ((Object[]) obj14)[i36] = obj15;
                return 0;
            case 29:
                Object[] objArr11 = this.MediaMetadataCompat;
                int i37 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i37 + 1;
                Object obj16 = objArr11[i37 - 1];
                objArr11[i37 - 1] = null;
                objArr11[i37] = obj16;
                Object obj17 = objArr11[i37 - 2];
                objArr11[i37 - 2] = null;
                objArr11[i37 - 1] = obj17;
                objArr11[i37 - 2] = obj16;
                return 0;
            case 30:
                Object[] objArr12 = this.MediaMetadataCompat;
                int i38 = this.MediaBrowserCompatItemReceiver;
                Object obj18 = objArr12[i38 - 1];
                objArr12[i38 - 1] = null;
                Object obj19 = objArr12[i38 - 2];
                objArr12[i38 - 2] = null;
                objArr12[i38 - 1] = obj19;
                objArr12[i38 - 2] = obj18;
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaBrowserCompatItemReceiver = i38 + 1;
                iArr13[i38] = 0;
                Object obj20 = objArr12[i38 - 1];
                objArr12[i38 - 1] = null;
                objArr12[i38] = obj20;
                iArr13[i38 - 1] = iArr13[i38];
                return 0;
            case 31:
                int i39 = this.MediaBrowserCompatItemReceiver;
                int i40 = i39 - 3;
                this.MediaBrowserCompatItemReceiver = i40;
                Object[] objArr13 = this.MediaMetadataCompat;
                Object obj21 = objArr13[i40];
                objArr13[i40] = null;
                int i41 = this.MediaBrowserCompatCustomActionResultReceiver[i39 - 2];
                Object obj22 = objArr13[i39 - 1];
                objArr13[i39 - 1] = null;
                ((Object[]) obj21)[i41] = obj22;
                return 0;
            case 32:
                int[] iArr14 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i42 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i42 + 1;
                iArr14[i42] = 0;
                return 0;
            case 33:
                int i43 = this.MediaBrowserCompatItemReceiver;
                int i44 = i43 - 3;
                this.MediaBrowserCompatItemReceiver = i44;
                Object[] objArr14 = this.MediaMetadataCompat;
                Object obj23 = objArr14[i44];
                objArr14[i44] = null;
                int i45 = this.MediaBrowserCompatCustomActionResultReceiver[i43 - 2];
                Object obj24 = objArr14[i43 - 1];
                objArr14[i43 - 1] = null;
                ((Object[]) obj23)[i45] = obj24;
                this.MediaBrowserCompatItemReceiver = i43 - 2;
                objArr14[i44] = objArr14[i43 - 4];
                return 0;
            case 34:
                int[] iArr15 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i46 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i46 + 1;
                iArr15[i46] = 1;
                return 0;
            case 35:
                Object[] objArr15 = this.MediaMetadataCompat;
                int i47 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i47 + 1;
                objArr15[i47] = null;
                Object obj25 = objArr15[i47];
                objArr15[i47] = null;
                Object obj26 = objArr15[i47 - 1];
                objArr15[i47 - 1] = null;
                objArr15[i47] = obj26;
                objArr15[i47 - 1] = obj25;
                return 0;
            case 36:
                int[] iArr16 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i48 = this.MediaBrowserCompatItemReceiver;
                iArr16[i48] = 2;
                this.MediaBrowserCompatItemReceiver = i48;
                iArr16[i48 - 1] = iArr16[i48 - 1] % iArr16[i48];
                int i49 = i48 - 1;
                this.MediaBrowserCompatItemReceiver = i49;
                this.MediaMetadataCompat[i49] = null;
                return 0;
            case 38:
                int[] iArr17 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i50 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i50 + 1;
                iArr17[i50] = 13;
            case 37:
                return 0;
            case 39:
                int i51 = this.MediaBrowserCompatItemReceiver;
                int i52 = i51 - 1;
                int[] iArr18 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr18[i51 - 2] = iArr18[i51 - 2] + iArr18[i52];
                iArr18[i52] = iArr18[i51 - 2];
                this.MediaBrowserCompatItemReceiver = i51 + 1;
                iArr18[i51] = 128;
                return 0;
            case 40:
                int i53 = this.MediaBrowserCompatItemReceiver;
                int i54 = i53 - 1;
                this.MediaBrowserCompatItemReceiver = i54;
                int[] iArr19 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr19[i53 - 2] = iArr19[i53 - 2] % iArr19[i54];
                return 0;
            case 41:
                int i55 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i55;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i55] != 0 ? 0 : 1;
                return 0;
            case 42:
                int[] iArr20 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i56 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i56 + 1;
                iArr20[i56] = 83;
                return 0;
            case 43:
                int i57 = this.MediaBrowserCompatItemReceiver;
                int i58 = i57 - 1;
                this.MediaBrowserCompatItemReceiver = i58;
                int[] iArr21 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr21[i57 - 2] = iArr21[i57 - 2] + iArr21[i58];
                return 0;
            case 44:
                int[] iArr22 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i59 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i59 + 1;
                iArr22[i59] = iArr22[i59 - 1];
                return 0;
            case 45:
                int[] iArr23 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i60 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i60 + 1;
                iArr23[i60] = 128;
                return 0;
            case 46:
                int i61 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i61;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver[i61] == 0 ? 0 : 1;
                return 0;
            case 47:
                Object[] objArr16 = this.MediaMetadataCompat;
                int i62 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i62 + 1;
                objArr16[i62] = null;
                int[] iArr24 = this.MediaBrowserCompatCustomActionResultReceiver;
                Object obj27 = objArr16[i62];
                objArr16[i62] = null;
                iArr24[i62] = ((int[]) obj27).length;
                this.MediaBrowserCompatItemReceiver = i62;
                objArr16[i62] = null;
                return 0;
            case 48:
                int[] iArr25 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i63 = this.MediaBrowserCompatItemReceiver - 1;
                this.MediaBrowserCompatItemReceiver = i63;
                this.RemoteActionCompatParcelizer = iArr25[i63];
                return 0;
            case 49:
                int[] iArr26 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i64 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i64 + 1;
                iArr26[i64] = 52;
                return 0;
            case 50:
                int[] iArr27 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i65 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i65 + 1;
                iArr27[i65] = 53;
                return 0;
            case 51:
                for (int i66 = this.MediaBrowserCompatItemReceiver - 1; i66 >= 0; i66--) {
                    this.MediaMetadataCompat[i66] = null;
                }
                Object[] objArr17 = this.MediaMetadataCompat;
                this.MediaBrowserCompatItemReceiver = 1;
                objArr17[0] = this.AudioAttributesCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }
}
