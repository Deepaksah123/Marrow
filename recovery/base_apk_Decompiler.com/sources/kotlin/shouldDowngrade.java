package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class shouldDowngrade extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;
    private getSubjectStat read;
    private static final byte[] $$c = {24, -109, -85, -94};
    private static final int $$f = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {79, -100, -79, 21, -54, 68, 9, 26, -37, 60, 8, -6, 30, 0, 17, 10, -22, 39, 14, 11, 8, 21, 37, 23, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8};
    private static final int $$h = 88;
    private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 251;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] write = {28596, 28489, 28595, 28485, 28486, 28492, 28553, 28482, 28583, 28594, 28592, 28487, 28564, 28483, 28481, 28508, 28579, 28495, 28480, 28491, 28551, 28574, 28545, 28544, 28597, 28548, 28572, 28575, 28547, 28549, 28546, 28593, 28573, 28550, 28494, 28484, 28488, 28493, 28578, 28591, 28562, 28581};
    private static int MediaBrowserCompatItemReceiver = 411398103;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static boolean AudioAttributesImplApi26Parcelizer = true;
    private static char[] AudioAttributesImplApi21Parcelizer = {56417, 12289, 1201, 6457, 28088, 26402, 35584, 49049, 41595, 55026, 63841, 60824, 4111, 1237, 14179, 23546, 20356, 29268, 26307, 35197, 48568, 41009, 54416, 50954, 60397, 7778, 672, 14047, 22804, 19865, 28787, 25789, 38684, 48066, 44628, 53995, 50557, 59812, 7559, 31, 13560, 10099, 19430, 32283, 25306, 38149, 47590, 44144, 53256, 50313, 63260, 7167, 3688, 56430, 12361, 1157, 6452, 28141, 17018, 22231, 43800, 49096, 35964, 57521, 62657, 51524, 56713, 12848, 1700, 7028, 28633, 31814, 20641, 42286, 47545, 36295, 57938, 63189, 52029, 57248, 11273, 143, 5406, 27045, 32312, 21176, 42649, 47955, 36789, 39997, 61613, 50439, 55750, 11805, 682, 5985, 27456, 32671, 19546, 41188, 46369, 35321, 40540, 62146, 51057, 56237, 10302, 15431, 4227, 25949, 31162, 20081, 41682, 46858, 35743, 38946, 60600, 57526, 3265, 14350, 9711, 20834, 32498, 27149, 38809, 33545, 45224, 56426, 51264, 62866, 57677, 3816, 14974, 10224, 21255, 16513, 27681, 39414, 34098, 45388, 57029, 51714, 63463, 58157, 4234, 15363, 10693, 21887, 17134, 28213, 39441, 34778, 45934, 37912, 30819, 19701, 20823, 9670, 2644, 7845, 58235, 63414, 50206, 43231, 48342, 33136, 38382, 31317, 20176, 21332, 10126, 13373, 6282, 60682, 61846, 22036, 47721, 36594, 37696, 59336, 51291, 56483, 8504, 13754, 1546, 27280, 56376, 12362, 1245, 6500, 28133, 17022, 22147, 43794, 49045, 35886, 57524};
    private static long AudioAttributesImplBaseParcelizer = 6391209690604318840L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, short r6, int r7) {
        /*
            byte[] r0 = kotlin.shouldDowngrade.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r5 = r5 * 3
            int r5 = 101 - r5
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r5 = r6
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.$$i(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r6
            byte[] r1 = kotlin.shouldDowngrade.$$a
            int r8 = 114 - r8
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.shouldDowngrade.$$g
            int r7 = 47 - r7
            int r8 = 111 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.d(short, short, byte, java.lang.Object[]):void");
    }

    shouldDowngrade() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.shouldDowngrade.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                shouldDowngrade.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        this.read = MediaBrowserCompatItemReceiver().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i2 = MediaMetadataCompat + 45;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i3 = MediaMetadataCompat + 77;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = MediaMetadataCompat + 29;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 >>> i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Gravity.getAbsoluteGravity(0, 0)), Color.red(0) + 2340, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 9700 - Process.getGidForName(""), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 23785 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = downloadService.write;
                try {
                    Object[] objArr5 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 + i6])};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (36622 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2341 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "") + 28, 480654850, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), TextUtils.indexOf("", "", 0) + 9701, 26 - (ViewConfiguration.getEdgeSlop() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer6 == null) {
                                objRemoteActionCompatParcelizer6 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 23784 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23784, 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr9 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), 23784 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getSize(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = write;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 44863), 18944 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), Drawable.resolveOpacity(0, 0) + 19033, 75 - (Process.myPid() >> 22), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i4 = -1593953308;
        if (AudioAttributesImplApi26Parcelizer) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 11439 - TextUtils.getOffsetAfter("", 0), 14 - TextUtils.indexOf("", "", 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i9 = $11 + 113;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            String str = new String(cArr5);
            int i11 = $10 + 99;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        int i12 = $10 + 83;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i14 = $11 + 95;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11439, ExpandableListView.getPackedPositionChild(0L) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b7  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 15;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            int i4 = MediaMetadataCompat + 19;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 27;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            ishighlightedMediaBrowserCompatItemReceiver.af_();
            throw null;
        }
        Object objAf_ = ishighlightedMediaBrowserCompatItemReceiver.af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 85;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 57;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 37;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            int i4 = i2 + 75;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.RemoteActionCompatParcelizer = true;
            return;
        }
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 119;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaMetadataCompat + 51;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 67;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-126, -123, -122, -114, -127, -118, -122, -108, -116, -116, -115, -114, -126, -117, -124, -124, -109, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i6 = MediaMetadataCompat + 37;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i8 = MediaBrowserCompatSearchResultReceiver + 53;
            MediaMetadataCompat = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4534), 6054 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 6029 - Process.getGidForName(""), TextUtils.getTrimmedLength("") + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(27:33|283|34|(3:36|37|(2:39|41)(1:40))(1:41)|77|257|78|(1:80)|81|(3:83|(1:85)|86)(19:87|88|271|89|(1:91)|92|93|260|94|(1:96)|97|98|99|(1:101)|102|(1:104)|105|(1:107)|108)|109|(4:112|(3:287|114|(14:285|116|119|(3:121|(3:124|125|122)|293)|126|273|127|(1:129)|130|131|132|262|133|291)(1:292))(3:284|117|(13:288|119|(0)|126|273|127|(0)|130|131|132|262|133|291)(1:290))|289|110)|286|146|170|(1:172)|173|(3:175|(1:177)|178)(13:180|269|181|182|(1:184)|185|258|186|187|(1:189)|190|(1:192)|193)|179|194|(6:196|197|(1:199)|200|201|202)|203|(1:205)|206|(3:208|(1:210)|211)(14:212|213|(1:215)|216|217|(1:219)|220|275|221|222|(1:224)|225|(1:227)|228)|229|(7:231|232|(1:234)|235|236|237|238)(1:294))|267|50|(1:52)|53|54|77|257|78|(0)|81|(0)(0)|109|(1:110)|286|146|170|(0)|173|(0)(0)|179|194|(0)|203|(0)|206|(0)(0)|229|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0a40, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0a41, code lost:
    
        r9 = new java.lang.Object[1];
        b((((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, (char) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), android.os.Process.getGidForName("") + 187, r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0a97, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0aae, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0ab2, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0ac1, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0ac5, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0ac7, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4535), 6054 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777258, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0af3, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0aff, code lost:
    
        r7 = new java.lang.Object[]{1413792638, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6030, 23 - android.text.TextUtils.lastIndexOf("", '0', 0, 0));
        r12 = new java.lang.Object[1];
        d(r4[81], r4[42], (byte) (kotlin.shouldDowngrade.$$g[12] - 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x095d A[Catch: all -> 0x0a16, TryCatch #9 {all -> 0x0a16, blocks: (B:127:0x0957, B:129:0x095d, B:130:0x0988), top: B:273:0x0957, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0f6e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0fb9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x100f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x12d8  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0552 A[Catch: all -> 0x0a40, TryCatch #0 {all -> 0x0a40, blocks: (B:78:0x054c, B:80:0x0552, B:81:0x0592, B:83:0x059f, B:85:0x05a8, B:86:0x05f1, B:109:0x08d8, B:110:0x08dc, B:114:0x08ee, B:119:0x091a, B:122:0x0927, B:124:0x092a, B:131:0x098f, B:137:0x0a0e, B:139:0x0a14, B:140:0x0a15, B:142:0x0a17, B:144:0x0a1e, B:145:0x0a1f, B:117:0x0904, B:87:0x05fc, B:99:0x074c, B:101:0x0752, B:102:0x0799, B:104:0x0831, B:105:0x0878, B:107:0x088e, B:108:0x08d2, B:149:0x0a2e, B:151:0x0a34, B:152:0x0a35, B:154:0x0a37, B:156:0x0a3e, B:157:0x0a3f, B:94:0x06c1, B:96:0x06d5, B:97:0x0740, B:133:0x0994, B:89:0x0672, B:91:0x0686, B:92:0x06ba, B:127:0x0957, B:129:0x095d, B:130:0x0988), top: B:257:0x054c, outer: #5, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x059f A[Catch: all -> 0x0a40, TryCatch #0 {all -> 0x0a40, blocks: (B:78:0x054c, B:80:0x0552, B:81:0x0592, B:83:0x059f, B:85:0x05a8, B:86:0x05f1, B:109:0x08d8, B:110:0x08dc, B:114:0x08ee, B:119:0x091a, B:122:0x0927, B:124:0x092a, B:131:0x098f, B:137:0x0a0e, B:139:0x0a14, B:140:0x0a15, B:142:0x0a17, B:144:0x0a1e, B:145:0x0a1f, B:117:0x0904, B:87:0x05fc, B:99:0x074c, B:101:0x0752, B:102:0x0799, B:104:0x0831, B:105:0x0878, B:107:0x088e, B:108:0x08d2, B:149:0x0a2e, B:151:0x0a34, B:152:0x0a35, B:154:0x0a37, B:156:0x0a3e, B:157:0x0a3f, B:94:0x06c1, B:96:0x06d5, B:97:0x0740, B:133:0x0994, B:89:0x0672, B:91:0x0686, B:92:0x06ba, B:127:0x0957, B:129:0x095d, B:130:0x0988), top: B:257:0x054c, outer: #5, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05fc A[Catch: all -> 0x0a40, TRY_LEAVE, TryCatch #0 {all -> 0x0a40, blocks: (B:78:0x054c, B:80:0x0552, B:81:0x0592, B:83:0x059f, B:85:0x05a8, B:86:0x05f1, B:109:0x08d8, B:110:0x08dc, B:114:0x08ee, B:119:0x091a, B:122:0x0927, B:124:0x092a, B:131:0x098f, B:137:0x0a0e, B:139:0x0a14, B:140:0x0a15, B:142:0x0a17, B:144:0x0a1e, B:145:0x0a1f, B:117:0x0904, B:87:0x05fc, B:99:0x074c, B:101:0x0752, B:102:0x0799, B:104:0x0831, B:105:0x0878, B:107:0x088e, B:108:0x08d2, B:149:0x0a2e, B:151:0x0a34, B:152:0x0a35, B:154:0x0a37, B:156:0x0a3e, B:157:0x0a3f, B:94:0x06c1, B:96:0x06d5, B:97:0x0740, B:133:0x0994, B:89:0x0672, B:91:0x0686, B:92:0x06ba, B:127:0x0957, B:129:0x095d, B:130:0x0988), top: B:257:0x054c, outer: #5, inners: #2, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldDowngrade.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
