package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class noTypeInfoBuilder {
    public static final byte[] AudioAttributesCompatParcelizer = {0, 0, 0, 1};
    private static float[] RemoteActionCompatParcelizer = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object write = new Object();
    private static int[] read = new int[10];

    public static final class IconCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final boolean AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final boolean MediaBrowserCompatItemReceiver;
        public final int MediaBrowserCompatMediaItem;
        public final int MediaBrowserCompatSearchResultReceiver;
        public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public final int MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final int RatingCompat;
        public final int RemoteActionCompatParcelizer;
        public final float handleMediaPlayPauseIfPendingOnHandler;
        public final int onAddQueueItem;
        public final int onCommand;
        public final int onCustomAction;
        public final int read;
        public final int write;

        public IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.onCustomAction = i;
            this.AudioAttributesImplBaseParcelizer = i2;
            this.MediaDescriptionCompat = i3;
            this.onCommand = i4;
            this.RatingCompat = i5;
            this.onAddQueueItem = i6;
            this.MediaBrowserCompatCustomActionResultReceiver = i7;
            this.handleMediaPlayPauseIfPendingOnHandler = f;
            this.write = i8;
            this.IconCompatParcelizer = i9;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            this.AudioAttributesImplApi26Parcelizer = z2;
            this.AudioAttributesImplApi21Parcelizer = i10;
            this.MediaBrowserCompatSearchResultReceiver = i11;
            this.MediaBrowserCompatMediaItem = i12;
            this.MediaBrowserCompatItemReceiver = z3;
            this.RemoteActionCompatParcelizer = i13;
            this.AudioAttributesCompatParcelizer = i14;
            this.read = i15;
            this.MediaMetadataCompat = i16;
        }
    }

    public static final class write {
        public final int AudioAttributesCompatParcelizer;
        public final int[] AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final int MediaBrowserCompatMediaItem;
        public final int MediaBrowserCompatSearchResultReceiver;
        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public final int MediaDescriptionCompat;
        public final boolean MediaMetadataCompat;
        public final float RatingCompat;
        public final int RemoteActionCompatParcelizer;
        public final int handleMediaPlayPauseIfPendingOnHandler;
        public final int read;
        public final int write;

        public write(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13, int i14) {
            this.MediaBrowserCompatSearchResultReceiver = i;
            this.MediaMetadataCompat = z;
            this.AudioAttributesImplApi26Parcelizer = i2;
            this.AudioAttributesImplBaseParcelizer = i3;
            this.AudioAttributesCompatParcelizer = i4;
            this.write = i5;
            this.read = i6;
            this.AudioAttributesImplApi21Parcelizer = iArr;
            this.MediaBrowserCompatItemReceiver = i7;
            this.handleMediaPlayPauseIfPendingOnHandler = i8;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i9;
            this.MediaBrowserCompatMediaItem = i10;
            this.RatingCompat = f;
            this.MediaDescriptionCompat = i11;
            this.IconCompatParcelizer = i12;
            this.RemoteActionCompatParcelizer = i13;
            this.MediaBrowserCompatCustomActionResultReceiver = i14;
        }
    }

    public static final class read {
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final boolean write;

        public read(int i, int i2, boolean z) {
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
            this.write = z;
        }
    }

    public static int IconCompatParcelizer(byte[] bArr, int i) {
        int i2;
        synchronized (write) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = read(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = read;
                        if (iArr.length <= i4) {
                            read = Arrays.copyOf(iArr, iArr.length << 1);
                        }
                        read[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < i4) {
                int i8 = read[i5] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i8);
                int i9 = i7 + i8;
                bArr[i9] = 0;
                bArr[i9 + 1] = 0;
                i6 += i8 + 3;
                i5++;
                i7 = i9 + 2;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static void write(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < iPosition) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean IconCompatParcelizer(String str, byte b) {
        return (MimeTypes.VIDEO_H264.equals(str) && (b & 31) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b & 126) >> 1) == 39);
    }

    public static int read(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static IconCompatParcelizer AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        return AudioAttributesImplBaseParcelizer(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.noTypeInfoBuilder.IconCompatParcelizer AudioAttributesImplBaseParcelizer(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.noTypeInfoBuilder.AudioAttributesImplBaseParcelizer(byte[], int, int):o.noTypeInfoBuilder$IconCompatParcelizer");
    }

    public static write IconCompatParcelizer(byte[] bArr, int i, int i2) {
        return RemoteActionCompatParcelizer(bArr, i + 2, i2);
    }

    private static write RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        _collectAndResolve _collectandresolve = new _collectAndResolve(bArr, i, i2);
        _collectandresolve.AudioAttributesCompatParcelizer(4);
        int iWrite = _collectandresolve.write(3);
        _collectandresolve.AudioAttributesCompatParcelizer();
        int iWrite2 = _collectandresolve.write(2);
        boolean zIconCompatParcelizer = _collectandresolve.IconCompatParcelizer();
        int iWrite3 = _collectandresolve.write(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (_collectandresolve.IconCompatParcelizer()) {
                i8 |= 1 << i9;
            }
        }
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = _collectandresolve.write(8);
        }
        int iWrite4 = _collectandresolve.write(8);
        int i11 = 0;
        for (int i12 = 0; i12 < iWrite; i12++) {
            if (_collectandresolve.IconCompatParcelizer()) {
                i11 += 89;
            }
            if (_collectandresolve.IconCompatParcelizer()) {
                i11 += 8;
            }
        }
        _collectandresolve.AudioAttributesCompatParcelizer(i11);
        if (iWrite > 0) {
            _collectandresolve.AudioAttributesCompatParcelizer((8 - iWrite) << 1);
        }
        int i13 = _collectandresolve.read();
        int i14 = _collectandresolve.read();
        if (i14 == 3) {
            _collectandresolve.AudioAttributesCompatParcelizer();
        }
        int i15 = _collectandresolve.read();
        int i16 = _collectandresolve.read();
        if (_collectandresolve.IconCompatParcelizer()) {
            int i17 = _collectandresolve.read();
            int i18 = _collectandresolve.read();
            int i19 = _collectandresolve.read();
            int i20 = _collectandresolve.read();
            i15 -= ((i14 == 1 || i14 == 2) ? 2 : 1) * (i17 + i18);
            i16 -= (i14 == 1 ? 2 : 1) * (i19 + i20);
        }
        int i21 = i16;
        int i22 = i15;
        int i23 = i21;
        int i24 = _collectandresolve.read();
        int i25 = _collectandresolve.read();
        int i26 = _collectandresolve.read();
        int iAudioAttributesCompatParcelizer = -1;
        int iMax = -1;
        for (int i27 = _collectandresolve.IconCompatParcelizer() ? 0 : iWrite; i27 <= iWrite; i27++) {
            _collectandresolve.read();
            iMax = Math.max(_collectandresolve.read(), iMax);
            _collectandresolve.read();
        }
        _collectandresolve.read();
        _collectandresolve.read();
        _collectandresolve.read();
        _collectandresolve.read();
        _collectandresolve.read();
        _collectandresolve.read();
        if (_collectandresolve.IconCompatParcelizer() && _collectandresolve.IconCompatParcelizer()) {
            IconCompatParcelizer(_collectandresolve);
        }
        _collectandresolve.AudioAttributesCompatParcelizer(2);
        if (_collectandresolve.IconCompatParcelizer()) {
            _collectandresolve.AudioAttributesCompatParcelizer(8);
            _collectandresolve.read();
            _collectandresolve.read();
            _collectandresolve.AudioAttributesCompatParcelizer();
        }
        RemoteActionCompatParcelizer(_collectandresolve);
        if (_collectandresolve.IconCompatParcelizer()) {
            int i28 = _collectandresolve.read();
            for (int i29 = 0; i29 < i28; i29++) {
                _collectandresolve.AudioAttributesCompatParcelizer(i26 + 5);
            }
        }
        _collectandresolve.AudioAttributesCompatParcelizer(2);
        float f2 = 1.0f;
        if (_collectandresolve.IconCompatParcelizer()) {
            if (_collectandresolve.IconCompatParcelizer()) {
                int iWrite5 = _collectandresolve.write(8);
                if (iWrite5 == 255) {
                    int iWrite6 = _collectandresolve.write(16);
                    int iWrite7 = _collectandresolve.write(16);
                    if (iWrite6 != 0 && iWrite7 != 0) {
                        f2 = iWrite6 / iWrite7;
                    }
                } else {
                    float[] fArr = RemoteActionCompatParcelizer;
                    if (iWrite5 < fArr.length) {
                        f2 = fArr[iWrite5];
                    } else {
                        prune.RemoteActionCompatParcelizer("NalUnitUtil", "Unexpected aspect_ratio_idc value: ".concat(String.valueOf(iWrite5)));
                    }
                }
            }
            if (_collectandresolve.IconCompatParcelizer()) {
                _collectandresolve.AudioAttributesCompatParcelizer();
            }
            if (_collectandresolve.IconCompatParcelizer()) {
                _collectandresolve.AudioAttributesCompatParcelizer(3);
                i7 = _collectandresolve.IconCompatParcelizer() ? 1 : 2;
                if (_collectandresolve.IconCompatParcelizer()) {
                    int iWrite8 = _collectandresolve.write(8);
                    int iWrite9 = _collectandresolve.write(8);
                    _collectandresolve.AudioAttributesCompatParcelizer(8);
                    int iWrite10 = keyFormat.write(iWrite8);
                    iAudioAttributesCompatParcelizer = keyFormat.AudioAttributesCompatParcelizer(iWrite9);
                    i6 = iWrite10;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
                i7 = -1;
            }
            if (_collectandresolve.IconCompatParcelizer()) {
                _collectandresolve.read();
                _collectandresolve.read();
            }
            _collectandresolve.AudioAttributesCompatParcelizer();
            if (_collectandresolve.IconCompatParcelizer()) {
                i23 <<= 1;
            }
            i4 = i7;
            i3 = i23;
            i5 = iAudioAttributesCompatParcelizer;
            iAudioAttributesCompatParcelizer = i6;
            f = f2;
        } else {
            f = 1.0f;
            i3 = i23;
            i4 = -1;
            i5 = -1;
        }
        return new write(iWrite2, zIconCompatParcelizer, iWrite3, i8, i14, i24, i25, iArr, iWrite4, i13, i22, i3, f, iMax, iAudioAttributesCompatParcelizer, i4, i5);
    }

    public static read AudioAttributesCompatParcelizer(byte[] bArr, int i) {
        return write(bArr, 4, i);
    }

    private static read write(byte[] bArr, int i, int i2) {
        _collectAndResolve _collectandresolve = new _collectAndResolve(bArr, 4, i2);
        int i3 = _collectandresolve.read();
        int i4 = _collectandresolve.read();
        _collectandresolve.AudioAttributesCompatParcelizer();
        return new read(i3, i4, _collectandresolve.IconCompatParcelizer());
    }

    public static int read(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        buildTypeSerializer.write(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            read(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            read(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            read(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    read(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void read(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int read(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static void read(_collectAndResolve _collectandresolve, int i) {
        int iRemoteActionCompatParcelizer = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iRemoteActionCompatParcelizer != 0) {
                iRemoteActionCompatParcelizer = ((_collectandresolve.RemoteActionCompatParcelizer() + i2) + 256) % 256;
            }
            if (iRemoteActionCompatParcelizer != 0) {
                i2 = iRemoteActionCompatParcelizer;
            }
        }
    }

    private static void read(_collectAndResolve _collectandresolve) {
        int i = _collectandresolve.read();
        _collectandresolve.AudioAttributesCompatParcelizer(8);
        for (int i2 = 0; i2 < i + 1; i2++) {
            _collectandresolve.read();
            _collectandresolve.read();
            _collectandresolve.AudioAttributesCompatParcelizer();
        }
        _collectandresolve.AudioAttributesCompatParcelizer(20);
    }

    private static void IconCompatParcelizer(_collectAndResolve _collectandresolve) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!_collectandresolve.IconCompatParcelizer()) {
                    _collectandresolve.read();
                } else {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        _collectandresolve.RemoteActionCompatParcelizer();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        _collectandresolve.RemoteActionCompatParcelizer();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void RemoteActionCompatParcelizer(_collectAndResolve _collectandresolve) {
        int i = _collectandresolve.read();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 != 0 && _collectandresolve.IconCompatParcelizer()) {
                int i5 = i2 + i3;
                int i6 = (1 - ((_collectandresolve.IconCompatParcelizer() ? 1 : 0) << 1)) * (_collectandresolve.read() + 1);
                int i7 = i5 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i5; i8++) {
                    if (!_collectandresolve.IconCompatParcelizer()) {
                        zArr[i8] = _collectandresolve.IconCompatParcelizer();
                    } else {
                        zArr[i8] = true;
                    }
                }
                int[] iArr2 = new int[i7];
                int[] iArr3 = new int[i7];
                int i9 = 0;
                for (int i10 = i3 - 1; i10 >= 0; i10--) {
                    int i11 = iArrCopyOf[i10] + i6;
                    if (i11 < 0 && zArr[i2 + i10]) {
                        iArr2[i9] = i11;
                        i9++;
                    }
                }
                if (i6 < 0 && zArr[i5]) {
                    iArr2[i9] = i6;
                    i9++;
                }
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = iArr[i12] + i6;
                    if (i13 < 0 && zArr[i12]) {
                        iArr2[i9] = i13;
                        i9++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i9);
                int i14 = 0;
                for (int i15 = i2 - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + i6;
                    if (i16 > 0 && zArr[i15]) {
                        iArr3[i14] = i16;
                        i14++;
                    }
                }
                if (i6 > 0 && zArr[i5]) {
                    iArr3[i14] = i6;
                    i14++;
                }
                for (int i17 = 0; i17 < i3; i17++) {
                    int i18 = iArrCopyOf[i17] + i6;
                    if (i18 > 0 && zArr[i2 + i17]) {
                        iArr3[i14] = i18;
                        i14++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i14);
                iArr = iArrCopyOf2;
                i2 = i9;
                i3 = i14;
            } else {
                int i19 = _collectandresolve.read();
                int i20 = _collectandresolve.read();
                int[] iArr4 = new int[i19];
                int i21 = 0;
                while (i21 < i19) {
                    iArr4[i21] = (i21 > 0 ? iArr4[i21 - 1] : 0) - (_collectandresolve.read() + 1);
                    _collectandresolve.AudioAttributesCompatParcelizer();
                    i21++;
                }
                int[] iArr5 = new int[i20];
                int i22 = 0;
                while (i22 < i20) {
                    iArr5[i22] = (i22 > 0 ? iArr5[i22 - 1] : 0) + _collectandresolve.read() + 1;
                    _collectandresolve.AudioAttributesCompatParcelizer();
                    i22++;
                }
                i2 = i19;
                iArr = iArr4;
                i3 = i20;
                iArrCopyOf = iArr5;
            }
        }
    }
}
