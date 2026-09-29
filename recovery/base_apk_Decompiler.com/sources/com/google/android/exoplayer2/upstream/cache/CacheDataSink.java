package com.google.android.exoplayer2.upstream.cache;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import kotlin.buildSetRequirementsIntent;
import kotlin.isStopped;
import kotlin.startForeground;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class CacheDataSink implements DataSink {
    private static char AudioAttributesCompatParcelizer = 0;
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static char IconCompatParcelizer = 0;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static long MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static char RemoteActionCompatParcelizer = 0;
    private static final String TAG = "CacheDataSink";
    private static char read;
    private static int write;
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    private File file;
    private final long fragmentSize;
    private OutputStream outputStream;
    private long outputStreamBytesWritten;
    private static final byte[] $$c = {91, -118, -51, -87};
    private static final int $$d = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {67, -110, -113, 74, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 7;
    private static final byte[] AudioAttributesImplBaseParcelizer = {45, -29, -71, -73, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -52, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -2, 15, -33, 16, 15, -3, -3, 0, -40, 33, 1, -5, 20, -9, 8, -48, 33, 7, -11, 24, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 34, 34, -3, -12, 2, 14, 0, 12, -37, 21, -5, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -13, 14, -4, -3, 10, -17, -18, 22, 17, -21, -36, 45, -10, -17, 33, -19, 19, -15, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
    private static final int AudioAttributesImplApi21Parcelizer = 50;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r7, short r8, int r9) {
        /*
            int r9 = r9 * 18
            int r9 = 122 - r9
            byte[] r0 = com.google.android.exoplayer2.upstream.cache.CacheDataSink.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSink.$$e(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 20
            int r6 = r6 * 4
            int r6 = r6 + 73
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = com.google.android.exoplayer2.upstream.cache.CacheDataSink.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 19
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2e:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSink.d(short, short, byte, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i2 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 12424, Color.green(0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1868, 10 - TextUtils.getOffsetBefore("", 0), 1983509525, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    public static final class Factory implements DataSink.Factory {
        private Cache cache;
        private long fragmentSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        private int bufferSize = CacheDataSink.DEFAULT_BUFFER_SIZE;

        public final Factory setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Factory setFragmentSize(long j) {
            this.fragmentSize = j;
            return this;
        }

        public final Factory setBufferSize(int i) {
            this.bufferSize = i;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public final DataSink createDataSink() {
            return new CacheDataSink((Cache) Assertions.checkNotNull(this.cache), this.fragmentSize, this.bufferSize);
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 == 0) {
                cArr3[i4] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read - 1];
            } else {
                cArr3[i4] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i7 = i4;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) read) ^ 1193402106669854891L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(RemoteActionCompatParcelizer);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iLastIndexOf = 1503 - TextUtils.lastIndexOf("", '0');
                        int i10 = (TypedValue.complexToFloat(i4) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i4) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21;
                        byte b = (byte) i4;
                        byte b2 = b;
                        String str$$e = $$e(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(longPressTimeout, iLastIndexOf, i10, 1322448859, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 1505, 21 - TextUtils.indexOf("", ""), 1322448859, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 9016, 58 - Gravity.getAbsoluteGravity(0, 0), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 47;
        $10 = i11 % 128;
        if (i11 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j) {
        this(cache, j, DEFAULT_BUFFER_SIZE);
    }

    public CacheDataSink(Cache cache, long j, int i) {
        Assertions.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < MIN_RECOMMENDED_FRAGMENT_SIZE) {
            Log.w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
            int i2 = MediaBrowserCompatItemReceiver + 105;
            write = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.cache = (Cache) Assertions.checkNotNull(cache);
        this.fragmentSize = j == -1 ? Long.MAX_VALUE : j;
        this.bufferSize = i;
        int i5 = MediaBrowserCompatItemReceiver + 47;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void open(DataSpec dataSpec) throws CacheDataSinkException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 103;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            Assertions.checkNotNull(dataSpec.key);
            if (dataSpec.length == -1) {
                int i3 = MediaBrowserCompatItemReceiver + 13;
                write = i3 % 128;
                if (i3 % 2 == 0 ? dataSpec.isFlagSet(2) : dataSpec.isFlagSet(5)) {
                    this.dataSpec = null;
                    return;
                }
            }
            this.dataSpec = dataSpec;
            this.dataSpecFragmentSize = !(dataSpec.isFlagSet(4) ^ true) ? this.fragmentSize : Long.MAX_VALUE;
            this.dataSpecBytesWritten = 0L;
            try {
                openNextOutputStream(dataSpec);
                return;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
        Assertions.checkNotNull(dataSpec.key);
        long j = dataSpec.length;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
      0x001b: PHI (r2v3 com.google.android.exoplayer2.upstream.DataSpec) = (r2v2 com.google.android.exoplayer2.upstream.DataSpec), (r2v4 com.google.android.exoplayer2.upstream.DataSpec) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.upstream.DataSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r11, int r12, int r13) throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.exoplayer2.upstream.cache.CacheDataSink.MediaBrowserCompatItemReceiver
            int r2 = r1 + 89
            int r3 = r2 % 128
            com.google.android.exoplayer2.upstream.cache.CacheDataSink.write = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            com.google.android.exoplayer2.upstream.DataSpec r2 = r10.dataSpec
            r4 = 45
            int r4 = r4 / r3
            if (r2 == 0) goto L60
            goto L1b
        L17:
            com.google.android.exoplayer2.upstream.DataSpec r2 = r10.dataSpec
            if (r2 == 0) goto L60
        L1b:
            int r1 = r1 + 97
            int r4 = r1 % 128
            com.google.android.exoplayer2.upstream.cache.CacheDataSink.write = r4
            int r1 = r1 % r0
        L22:
            if (r3 >= r13) goto L60
            long r4 = r10.outputStreamBytesWritten     // Catch: java.io.IOException -> L59
            long r6 = r10.dataSpecFragmentSize     // Catch: java.io.IOException -> L59
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L32
            r10.closeCurrentOutputStream()     // Catch: java.io.IOException -> L59
            r10.openNextOutputStream(r2)     // Catch: java.io.IOException -> L59
        L32:
            int r1 = r13 - r3
            long r4 = (long) r1     // Catch: java.io.IOException -> L59
            long r6 = r10.dataSpecFragmentSize     // Catch: java.io.IOException -> L59
            long r8 = r10.outputStreamBytesWritten     // Catch: java.io.IOException -> L59
            long r6 = r6 - r8
            long r4 = java.lang.Math.min(r4, r6)     // Catch: java.io.IOException -> L59
            int r1 = (int) r4     // Catch: java.io.IOException -> L59
            java.io.OutputStream r4 = r10.outputStream     // Catch: java.io.IOException -> L59
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)     // Catch: java.io.IOException -> L59
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch: java.io.IOException -> L59
            int r5 = r12 + r3
            r4.write(r11, r5, r1)     // Catch: java.io.IOException -> L59
            int r3 = r3 + r1
            long r4 = r10.outputStreamBytesWritten     // Catch: java.io.IOException -> L59
            long r6 = (long) r1     // Catch: java.io.IOException -> L59
            long r4 = r4 + r6
            r10.outputStreamBytesWritten = r4     // Catch: java.io.IOException -> L59
            long r4 = r10.dataSpecBytesWritten     // Catch: java.io.IOException -> L59
            long r4 = r4 + r6
            r10.dataSpecBytesWritten = r4     // Catch: java.io.IOException -> L59
            goto L22
        L59:
            r10 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException r11 = new com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException
            r11.<init>(r10)
            throw r11
        L60:
            int r10 = com.google.android.exoplayer2.upstream.cache.CacheDataSink.MediaBrowserCompatItemReceiver
            int r10 = r10 + 39
            int r11 = r10 % 128
            com.google.android.exoplayer2.upstream.cache.CacheDataSink.write = r11
            int r10 = r10 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSink.write(byte[], int, int):void");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void close() throws CacheDataSinkException {
        int i = 2 % 2;
        int i2 = write + 115;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (this.dataSpec == null) {
                return;
            }
            try {
                closeCurrentOutputStream();
                int i3 = write + 107;
                MediaBrowserCompatItemReceiver = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
        obj.hashCode();
        throw null;
    }

    private void openNextOutputStream(DataSpec dataSpec) throws IOException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 115;
        write = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            long j = dataSpec.length;
            obj.hashCode();
            throw null;
        }
        this.file = this.cache.startFile((String) Util.castNonNull(dataSpec.key), dataSpec.position + this.dataSpecBytesWritten, dataSpec.length != -1 ? Math.min(dataSpec.length - this.dataSpecBytesWritten, this.dataSpecFragmentSize) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        if (this.bufferSize > 0) {
            int i3 = write + 87;
            MediaBrowserCompatItemReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
                if (reusableBufferedOutputStream == null) {
                    this.bufferedOutputStream = new ReusableBufferedOutputStream(fileOutputStream, this.bufferSize);
                } else {
                    reusableBufferedOutputStream.reset(fileOutputStream);
                }
                this.outputStream = this.bufferedOutputStream;
            } else {
                throw null;
            }
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
        int i4 = MediaBrowserCompatItemReceiver + 5;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void closeCurrentOutputStream() throws IOException {
        int i = 2 % 2;
        int i2 = write + 41;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file = (File) Util.castNonNull(this.file);
            this.file = null;
            this.cache.commitFile(file, this.outputStreamBytesWritten);
            int i4 = write + 33;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file2 = (File) Util.castNonNull(this.file);
            this.file = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0514 A[Catch: all -> 0x0516, TryCatch #17 {all -> 0x0516, blocks: (B:106:0x050e, B:108:0x0514, B:109:0x0515), top: B:210:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0515 A[Catch: all -> 0x0516, TRY_LEAVE, TryCatch #17 {all -> 0x0516, blocks: (B:106:0x050e, B:108:0x0514, B:109:0x0515), top: B:210:0x050e }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0261 A[Catch: all -> 0x048f, TryCatch #11 {all -> 0x048f, blocks: (B:28:0x024b, B:36:0x025b, B:38:0x0261, B:39:0x0262, B:42:0x026a, B:44:0x0296, B:43:0x0276, B:46:0x02a2, B:48:0x02ea, B:50:0x02ee, B:52:0x02f4, B:53:0x02f5, B:54:0x02f6, B:61:0x0318, B:62:0x0325, B:63:0x0326, B:64:0x0358, B:66:0x03af, B:68:0x03b4, B:70:0x03ba, B:71:0x03bb, B:72:0x03bc, B:74:0x03d0, B:75:0x03ea, B:76:0x03fe, B:81:0x045d, B:84:0x0468, B:47:0x02b0, B:65:0x0368), top: B:199:0x024b, inners: #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262 A[Catch: all -> 0x048f, TryCatch #11 {all -> 0x048f, blocks: (B:28:0x024b, B:36:0x025b, B:38:0x0261, B:39:0x0262, B:42:0x026a, B:44:0x0296, B:43:0x0276, B:46:0x02a2, B:48:0x02ea, B:50:0x02ee, B:52:0x02f4, B:53:0x02f5, B:54:0x02f6, B:61:0x0318, B:62:0x0325, B:63:0x0326, B:64:0x0358, B:66:0x03af, B:68:0x03b4, B:70:0x03ba, B:71:0x03bb, B:72:0x03bc, B:74:0x03d0, B:75:0x03ea, B:76:0x03fe, B:81:0x045d, B:84:0x0468, B:47:0x02b0, B:65:0x0368), top: B:199:0x024b, inners: #10, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void AudioAttributesCompatParcelizer(android.content.Context r23, long r24, long r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSink.AudioAttributesCompatParcelizer(android.content.Context, long, long):void");
    }

    static {
        AudioAttributesCompatParcelizer();
        write = 0;
        MediaBrowserCompatItemReceiver = 1;
        AudioAttributesCompatParcelizer = (char) 52771;
        IconCompatParcelizer = (char) 31266;
        read = (char) 51238;
        RemoteActionCompatParcelizer = (char) 41372;
    }

    static void AudioAttributesCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver = -213086352977821730L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 118 - r6
            byte[] r0 = com.google.android.exoplayer2.upstream.cache.CacheDataSink.AudioAttributesImplBaseParcelizer
            int r1 = 34 - r7
            int r8 = 284 - r8
            byte[] r1 = new byte[r1]
            int r7 = 33 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSink.a(int, int, short, java.lang.Object[]):void");
    }
}
