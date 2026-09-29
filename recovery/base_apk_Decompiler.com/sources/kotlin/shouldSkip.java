package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class shouldSkip extends trimByVisibility implements SubjectStat {
    private volatile GtaResponseBody AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {3, -120, 17, 23};
    private static final int $$f = 205;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$h = TsExtractor.TS_STREAM_TYPE_DTS;
    private static final byte[] $$a = {118, 56, TarConstants.LF_SYMLINK, 93, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 151;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {56429, 19186, 61768, 8142, 34339, 11445, 23304, 49618, 26851, 38767, 15746, 42092, 53950, 31027, 59279, 3609, 46463, 9199, 56417, 19173, 61817, 8149, 34344, 56380, 19199, 61775, 8076, 34427, 11453, 23387, 49610, 26809, 38699, 15816, 42078, 54012, 31085, 59272, 3658, 46445, 9209, 19021, 61573, 8058, 34276, 11352, 23237, 49646, 26669, 38557, 15628, 44021, 53867, 30942, 59212, 3644, 46248, 9038, 18831, 61482, 7918, 34143, 13260, 23220, 49451, 28622, 38488, 15528, 43834, 53725, 30744, 59196, 3493, 46105, 8844, 18813, 63461, 7768, 33993, 13236, 23162, 49353, 28511, 38393, 15417, 43743, 53579, 56420, 19176, 61784, 8140, 34367, 11494, 23363, 49619, 26856, 38781, 15813, 42064, 53941, 31022, 59267, 3593, 46434, 9208, 19039, 61586, 7992, 34228, 11294, 23193, 49645, 26728, 38607, 15709, 43967, 53800, 30914, 59163, 3705, 46333, 9054, 18904, 61503, 7853, 34073, 13213, 23294, 49529, 28546, 38495, 15523, 43825, 53699, 30749, 59260, 3573, 46083, 8917, 18722, 63419, 7689, 33935, 13304, 23091, 49370, 28430, 38371, 15417, 43674, 53529, 30818, 59112, 3423, 63645, 28186, 54709, 15136, 41674, 2118, 43385, 16354, 33861, 27330, 62333, 22959, 11794, 46221, 7668, 57901, 18656, 53594, 42912, 3127, 37526, 31502, 56421, 19192, 61769, 8146, 34360, 11445, 23320, 49541, 26820, 38781, 15839, 42068, 53903, 31027, 59272, 3609, 46342, 9113, 38947, 30373, 61256, 17886, 12899, 43193, 392, 65028, 21737, 52484, 48094, 4164, 36595, 26482, 56330, 19124, 9003, 39352, 30276, 60636, 38452, 173, 47888, 21905, 52322, 26340, 4437, 35827, 8884, 56608, 30621, 60949, 39160, 13164, 44500, 56376, 19118, 61717, 8072, 34421, 11498, 23387, 49614, 26805, 38698, 15772};
    private static long write = -1651076471769380196L;
    private static int[] AudioAttributesImplApi26Parcelizer = {1027211223, 342349947, 2087958714, 462525270, -297228393, 67466, 337617208, -652204964, 1233276711, -702854068, 885134128, 874450386, -1243367332, -1608743478, 139644420, 1443744001, -1691936861, -1701302673};
    private final Object read = new Object();
    private boolean IconCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 101
            byte[] r1 = kotlin.shouldSkip.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldSkip.$$i(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 65
            byte[] r0 = kotlin.shouldSkip.$$a
            int r8 = r8 + 4
            int r7 = 44 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r5 = r2
            r9 = r8
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldSkip.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 17
            int r9 = r9 + 65
            int r8 = r8 * 3
            int r8 = r8 + 28
            byte[] r0 = kotlin.shouldSkip.$$g
            int r7 = r7 * 3
            int r7 = 88 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldSkip.d(int, short, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            read();
            super.onCreate();
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 103;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
                return;
            }
            return;
        }
        read();
        super.onCreate();
        throw null;
    }

    private GtaResponseBody write() {
        int i = 2 % 2;
        GtaResponseBody gtaResponseBody = new GtaResponseBody(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 31;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return gtaResponseBody;
    }

    private GtaResponseBody AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = write();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.shouldSkip.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 29
            int r2 = r1 % 128
            kotlin.shouldSkip.AudioAttributesImplApi21Parcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r3.IconCompatParcelizer
            r2 = 32
            int r2 = r2 / 0
            if (r1 != 0) goto L2d
            goto L1b
        L17:
            boolean r1 = r3.IconCompatParcelizer
            if (r1 != 0) goto L2d
        L1b:
            r1 = 1
            r3.IconCompatParcelizer = r1
            java.lang.Object r1 = r3.af_()
            o.setStreamContent r1 = (kotlin.setStreamContent) r1
            java.lang.Object r3 = kotlin.getSubmittedOnDate.AudioAttributesCompatParcelizer(r3)
            com.marrow2.core.services.video_download.VideoDownloadFGService r3 = (com.marrow2.core.services.video_download.VideoDownloadFGService) r3
            r1.read(r3)
        L2d:
            int r3 = kotlin.shouldSkip.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 123
            int r1 = r3 % 128
            kotlin.shouldSkip.MediaBrowserCompatCustomActionResultReceiver = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldSkip.read():void");
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        GtaResponseBody gtaResponseBodyAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (i3 != 0) {
            gtaResponseBodyAudioAttributesCompatParcelizer.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = gtaResponseBodyAudioAttributesCompatParcelizer.af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getSize(0) + 36621), 2340 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 28 - Gravity.getAbsoluteGravity(0, 0), 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(write), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 9701, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 23784 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 33 - ExpandableListView.getPackedPositionType(0L), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i5 = $10 + 35;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 37;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), KeyEvent.keyCodeFromString("") + 23784, 34 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr6 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getTouchSlop() >> 8) + 23784, 32 - ImageFormat.getBitsPerPixel(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AudioAttributesImplApi26Parcelizer;
        int i4 = 43695;
        int i5 = -470782045;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 39;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + i4), TextUtils.indexOf("", "") + 23297, 15 - TextUtils.getOffsetBefore("", 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = 43695;
                    i5 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 63;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AudioAttributesImplApi26Parcelizer;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1)) + 43695), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23296, Color.blue(i6) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i12++;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i13 = $11 + 101;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 5 % 5;
            }
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i15];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 43696), 23296 - Process.getGidForName(""), 14 - TextUtils.indexOf((CharSequence) "", '0', 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48195 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 20126, 21 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x06d0 A[Catch: all -> 0x0bb0, TRY_LEAVE, TryCatch #10 {all -> 0x0bb0, blocks: (B:89:0x05b4, B:91:0x05ba, B:92:0x0604, B:98:0x0620, B:100:0x0626, B:101:0x066e, B:102:0x0677, B:103:0x0678, B:105:0x0681, B:106:0x06c5, B:129:0x0a5c, B:130:0x0a60, B:133:0x0a70, B:135:0x0a86, B:138:0x0a93, B:141:0x0aa0, B:148:0x0b08, B:154:0x0b87, B:156:0x0b8d, B:157:0x0b8e, B:159:0x0b90, B:161:0x0b97, B:162:0x0b98, B:107:0x06d0, B:119:0x0859, B:121:0x085f, B:122:0x08a6, B:124:0x09b3, B:125:0x09f4, B:127:0x0a0a, B:128:0x0a56, B:165:0x0b9d, B:167:0x0ba4, B:168:0x0ba5, B:170:0x0ba7, B:172:0x0bae, B:173:0x0baf, B:150:0x0b0d, B:109:0x078a, B:111:0x079b, B:112:0x07cc, B:144:0x0acf, B:146:0x0ad5, B:147:0x0b01, B:114:0x07d3, B:116:0x07e7, B:117:0x084d), top: B:292:0x05b4, outer: #5, inners: #3, #4, #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1084  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x11bf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1218  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1599  */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x042b A[Catch: all -> 0x0498, TryCatch #13 {all -> 0x0498, blocks: (B:56:0x041e, B:58:0x042b, B:59:0x0490), top: B:297:0x041e, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04f9 A[Catch: all -> 0x03ac, TryCatch #5 {all -> 0x03ac, blocks: (B:213:0x10a9, B:215:0x10af, B:216:0x10da, B:249:0x15bc, B:251:0x15c2, B:252:0x15f1, B:230:0x12f6, B:232:0x1319, B:233:0x1370, B:180:0x0c32, B:182:0x0c38, B:183:0x0c64, B:82:0x04f3, B:84:0x04f9, B:85:0x051f, B:24:0x0151, B:26:0x0157, B:27:0x0181, B:29:0x031e, B:31:0x034f, B:32:0x03a6, B:89:0x05b4, B:91:0x05ba, B:92:0x0604, B:98:0x0620, B:100:0x0626, B:101:0x066e, B:102:0x0677, B:103:0x0678, B:105:0x0681, B:106:0x06c5, B:129:0x0a5c, B:130:0x0a60, B:133:0x0a70, B:135:0x0a86, B:138:0x0a93, B:141:0x0aa0, B:148:0x0b08, B:154:0x0b87, B:156:0x0b8d, B:157:0x0b8e, B:159:0x0b90, B:161:0x0b97, B:162:0x0b98, B:107:0x06d0, B:119:0x0859, B:121:0x085f, B:122:0x08a6, B:124:0x09b3, B:125:0x09f4, B:127:0x0a0a, B:128:0x0a56, B:165:0x0b9d, B:167:0x0ba4, B:168:0x0ba5, B:170:0x0ba7, B:172:0x0bae, B:173:0x0baf), top: B:284:0x0151, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05ba A[Catch: all -> 0x0bb0, TryCatch #10 {all -> 0x0bb0, blocks: (B:89:0x05b4, B:91:0x05ba, B:92:0x0604, B:98:0x0620, B:100:0x0626, B:101:0x066e, B:102:0x0677, B:103:0x0678, B:105:0x0681, B:106:0x06c5, B:129:0x0a5c, B:130:0x0a60, B:133:0x0a70, B:135:0x0a86, B:138:0x0a93, B:141:0x0aa0, B:148:0x0b08, B:154:0x0b87, B:156:0x0b8d, B:157:0x0b8e, B:159:0x0b90, B:161:0x0b97, B:162:0x0b98, B:107:0x06d0, B:119:0x0859, B:121:0x085f, B:122:0x08a6, B:124:0x09b3, B:125:0x09f4, B:127:0x0a0a, B:128:0x0a56, B:165:0x0b9d, B:167:0x0ba4, B:168:0x0ba5, B:170:0x0ba7, B:172:0x0bae, B:173:0x0baf, B:150:0x0b0d, B:109:0x078a, B:111:0x079b, B:112:0x07cc, B:144:0x0acf, B:146:0x0ad5, B:147:0x0b01, B:114:0x07d3, B:116:0x07e7, B:117:0x084d), top: B:292:0x05b4, outer: #5, inners: #3, #4, #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0611  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    @Override // kotlin.trimByVisibility, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldSkip.attachBaseContext(android.content.Context):void");
    }
}
