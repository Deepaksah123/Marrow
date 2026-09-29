package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class DataSourceBitmapLoaderExternalSyntheticLambda2 {
    public int AudioAttributesCompatParcelizer;
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final Object[] RatingCompat;
    private int RemoteActionCompatParcelizer;
    public Object read;
    public int write;
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[5];
    private final long[] AudioAttributesImplApi26Parcelizer = new long[5];
    private final float[] AudioAttributesImplBaseParcelizer = new float[5];
    private final double[] AudioAttributesImplApi21Parcelizer = new double[5];

    public DataSourceBitmapLoaderExternalSyntheticLambda2(Object obj) {
        Object[] objArr = new Object[5];
        this.RatingCompat = objArr;
        objArr[4] = obj;
        this.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = -1;
    }

    public int write(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.RatingCompat;
                int i2 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i2 + 1;
                objArr[i2] = this.read;
                return 0;
            case 2:
                int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                int i3 = this.RemoteActionCompatParcelizer;
                iArr[i3] = 2;
                this.RemoteActionCompatParcelizer = i3 + 2;
                iArr[i3 + 1] = 2;
                return 0;
            case 3:
                int i4 = this.RemoteActionCompatParcelizer;
                int i5 = i4 - 1;
                this.RemoteActionCompatParcelizer = i5;
                int[] iArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr2[i4 - 2] = iArr2[i4 - 2] % iArr2[i5];
                return 0;
            case 4:
                int i6 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i6;
                this.RatingCompat[i6] = null;
                return 0;
            case 6:
                Object[] objArr2 = this.RatingCompat;
                int i7 = this.RemoteActionCompatParcelizer;
                Object obj = objArr2[i7 - 1];
                objArr2[i7 - 1] = null;
                this.IconCompatParcelizer = obj;
            case 5:
                return 0;
            case 7:
                int[] iArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i8 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i8 + 1;
                iArr3[i8] = this.AudioAttributesCompatParcelizer;
                return 0;
            case 8:
                int[] iArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i9 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i9 + 1;
                iArr4[i9] = 79;
                return 0;
            case 9:
                int i10 = this.RemoteActionCompatParcelizer;
                int i11 = i10 - 1;
                int[] iArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                iArr5[i10 - 2] = iArr5[i10 - 2] + iArr5[i11];
                this.RemoteActionCompatParcelizer = i10;
                iArr5[i11] = iArr5[i10 - 2];
                return 0;
            case 10:
                int[] iArr6 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i12 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i12 + 1;
                iArr6[i12] = 128;
                return 0;
            case 11:
                int i13 = this.RemoteActionCompatParcelizer - this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = i13;
                this.MediaBrowserCompatItemReceiver = i13;
                return 0;
            case 12:
                int[] iArr7 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i14 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i14 + 1;
                this.write = iArr7[i14];
                return 0;
            case 13:
                int i15 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i15;
                this.write = this.MediaBrowserCompatCustomActionResultReceiver[i15] != 0 ? 0 : 1;
                return 0;
            case 14:
                int[] iArr8 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i16 = this.RemoteActionCompatParcelizer;
                iArr8[i16] = 2;
                this.RemoteActionCompatParcelizer = i16;
                iArr8[i16 - 1] = iArr8[i16 - 1] % iArr8[i16];
                return 0;
            case 15:
                int[] iArr9 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i17 = this.RemoteActionCompatParcelizer;
                iArr9[i17] = 91;
                iArr9[i17 - 1] = iArr9[i17 - 1] + iArr9[i17];
                this.RemoteActionCompatParcelizer = i17 + 1;
                iArr9[i17] = iArr9[i17 - 1];
                return 0;
            case 16:
                int[] iArr10 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i18 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i18 + 1;
                iArr10[i18] = 2;
                return 0;
            case 17:
                Object[] objArr3 = this.RatingCompat;
                int i19 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = i19 + 1;
                Object obj2 = objArr3[i19];
                objArr3[i19] = null;
                this.IconCompatParcelizer = obj2;
                return 0;
            case 18:
                Object[] objArr4 = this.RatingCompat;
                int i20 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i20 + 1;
                objArr4[i20] = null;
                return 0;
            case 19:
                int[] iArr11 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i21 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i21;
                this.write = iArr11[i21];
                return 0;
            case 20:
                int[] iArr12 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i22 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i22 + 1;
                iArr12[i22] = 14;
                return 0;
            case 21:
                int[] iArr13 = this.MediaBrowserCompatCustomActionResultReceiver;
                int i23 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i23 + 1;
                iArr13[i23] = 33;
                return 0;
            case 22:
                for (int i24 = this.RemoteActionCompatParcelizer - 1; i24 >= 0; i24--) {
                    this.RatingCompat[i24] = null;
                }
                Object[] objArr5 = this.RatingCompat;
                this.RemoteActionCompatParcelizer = 1;
                objArr5[0] = this.read;
                return 0;
            default:
                return i;
        }
    }
}
