package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class animateCameraWithCallback extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {61, 46, 102, -127};
    private static final int $$f = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, -57, 8, -14, -68, 66, -17, 12, -46, 33, -15, 3, -5, -20, 18, 8, -11, -10, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28, -16, -7, 0};
    private static final int $$h = 51;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -57, 8, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 51;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] read = {48221, 48406, 48848, 49026, 47427, 47617, 48064, 46286, 46707, 46891, 45242, 45440, 45950, 44071, 44519, 44709, 43023, 43467, 56417, 56625, 57041, 57257, 55672, 50400, 50674, 50747, 50985, 49648, 49843, 50042, 52285, 52887, 53201, 51224, 51542, 52182, 54417, 54623, 54858, 53491, 53602, 53800, 56511, 56800, 56946, 57149, 55718, 56027, 56129, 58463, 59086, 59328, 57350, 57673, 58255, 60518, 60789, 61373, 59562, 59761, 59956, 62713, 62952, 63047, 63316, 61842, 62170, 62219, 64590, 65245, 65434, 56430, 56697, 57061, 57252, 55597, 55914, 56311, 54504, 54856, 55052, 53393, 53713, 54020, 52249, 52688, 52884, 51316, 51689, 51878, 50225, 50542, 50857, 51175, 49442, 49749, 50125, 64640, 65049, 65359, 63630, 63941, 64264, 62648, 62889, 63283, 61477, 61949, 62141, 60455, 60726, 61085, 61402, 59713, 59984, 60383, 58570, 58884, 59153, 57593, 57964, 58146, 40161, 40429, 40750, 39015, 39411, 39645, 37962, 38225, 38594, 38858, 37135, 37442, 37768, 34288, 33960, 34660, 34340, 33019, 33782, 33327, 36203, 36828, 36509, 35161, 34840, 35537, 38302, 37967, 38673, 37302, 36984, 37667, 40378, 40124, 40804, 40498, 39137, 39833, 39496, 42259, 42965, 42651, 41304, 41038, 41667, 44397, 44093, 44770, 43440, 43131, 43837, 46581, 46245, 46922, 46617, 45214, 45975, 45639, 48385, 49039, 48773, 47400, 48117, 47871, 50557, 50214, 50923, 49573, 49271, 49932, 52627, 52358, 52998, 52807, 51401, 52118, 51777, 54518, 55208, 54883, 31124, 30939, 31488, 31315, 31936, 32710, 32263, 29004, 29625, 29364, 29957, 29803, 30397, 27134, 26659, 27503, 56421, 56620, 57057, 57262, 55656, 55857, 56288, 54441, 54884, 55049, 53463, 53640, 54143, 52247, 52688, 52885, 59485, 59670, 60112, 60290, 60739, 60929, 61376, 57550, 57971, 58155, 58554, 58755, 59253, 63547, 63984, 64165, 64529, 65019, 65176, 61535, 61711, 62147, 61893, 61575, 62272, 61961, 62680, 63379, 63070, 63775, 64488, 64163, 64873};
    private static long AudioAttributesImplApi21Parcelizer = -9156109246909457080L;
    private static int AudioAttributesImplBaseParcelizer = 1000326236;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 4
            int r9 = 101 - r9
            byte[] r0 = kotlin.animateCameraWithCallback.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + 1
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 114 - r7
            int r5 = r5 + 4
            int r6 = r6 + 4
            byte[] r0 = kotlin.animateCameraWithCallback.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r5 = r5 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 81 - r6
            int r7 = 114 - r7
            int r0 = r5 + 4
            byte[] r1 = kotlin.animateCameraWithCallback.$$g
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r6 = r6 + 1
            r3 = r1[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + 3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.d(byte, short, int, java.lang.Object[]):void");
    }

    animateCameraWithCallback() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.animateCameraWithCallback.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                animateCameraWithCallback.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 119;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 13;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaBrowserCompatItemReceiver + 61;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(read[i * i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 36622), ExpandableListView.getPackedPositionChild(0L) + 2341, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 9701, 26 - Gravity.getAbsoluteGravity(0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0) + 23784, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                int i7 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(read[i + i7])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36620 - ExpandableListView.getPackedPositionChild(0L)), MotionEvent.axisFromString("") + 2341, 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 9701 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Process.myTid() >> 22), 23784 - Color.red(0), 32 - Process.getGidForName(""), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) Color.green(0), 23784 - (ViewConfiguration.getJumpTapTimeout() >> 16), Process.getGidForName("") + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            int i8 = $10 + 3;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 % 3;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, int i2, boolean z, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 23704, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 44862), 18944 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i8 = $10 + 125;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 >>> cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) / 0];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), View.combineMeasuredStates(0, 0) + 18944, (-16777188) - Color.rgb(0, 0, 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), TextUtils.getOffsetBefore("", 0) + 18944, KeyEvent.normalizeMetaState(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0201  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 2719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 73;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = MediaBrowserCompatItemReceiver + 15;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatItemReceiver + 59;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.write == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.write == null) {
                    this.write = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 105;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 9;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|285|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(26:276|33|(2:35|(3:37|(2:39|44)|43)(3:40|(2:42|44)|43))(1:44)|80|297|81|(1:83)|84|85|(2:87|(5:89|90|(1:92)|93|94)(3:95|(1:97)|98))(19:99|100|289|101|(1:103)|104|105|277|106|(1:108)|109|110|111|(1:113)|114|(1:116)|117|(1:119)|120)|121|(4:124|(3:304|126|(14:302|128|131|(3:133|(3:136|137|134)|309)|138|298|139|(1:141)|142|143|144|291|145|307)(1:308))(3:301|129|(13:303|131|(0)|138|298|139|(0)|142|143|144|291|145|307)(1:306))|305|122)|300|180|(1:182)|183|(3:185|(3:187|(1:189)|190)(3:191|(1:193)|194)|195)(13:196|274|197|198|(1:200)|201|295|202|203|(1:205)|206|(1:208)|209)|210|(6:212|213|(1:215)|216|217|218)|219|(1:221)|222|(3:224|(1:226)|227)(14:229|230|(1:232)|233|234|(1:236)|237|281|238|239|(1:241)|242|(1:244)|245)|228|246|(7:248|249|(1:251)|252|253|254|255)(1:310))|48|293|49|(1:51)|52|279|53|(1:55)|56|80|297|81|(0)|84|85|(0)(0)|121|(1:122)|300|180|(0)|183|(0)(0)|210|(0)|219|(0)|222|(0)(0)|228|246|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0c9b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0c9c, code lost:
    
        r10 = new java.lang.Object[1];
        a((char) (android.view.View.MeasureSpec.getSize(0) + 11773), ((android.content.Context) java.lang.Class.forName(r25).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 246, ((android.content.Context) java.lang.Class.forName(r25).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, r10);
        r2 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0cf7, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r3);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r3.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0d0e, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0d12, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0d21, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0d25, code lost:
    
        if (r1 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0d27, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), android.text.TextUtils.indexOf("", "", 0) + 6054, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0d51, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0d5d, code lost:
    
        r8 = new java.lang.Object[]{-896211036, 81604378625L, r3, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6031 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 25);
        r6 = (byte) 64;
        r12 = new java.lang.Object[1];
        d((byte) (-kotlin.animateCameraWithCallback.$$g[43]), r6, (byte) (r6 >>> 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0bbc A[Catch: all -> 0x0c7d, TryCatch #14 {all -> 0x0c7d, blocks: (B:139:0x0bb6, B:141:0x0bbc, B:142:0x0be4), top: B:298:0x0bb6, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0e31  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x126d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x134b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x13e0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x16e2  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x068a A[Catch: all -> 0x0c9b, TryCatch #13 {all -> 0x0c9b, blocks: (B:81:0x0684, B:83:0x068a, B:84:0x06cb, B:90:0x06e7, B:92:0x06ed, B:93:0x0732, B:94:0x073e, B:95:0x073f, B:97:0x0748, B:98:0x078e, B:121:0x0b33, B:122:0x0b37, B:126:0x0b49, B:131:0x0b76, B:134:0x0b8c, B:136:0x0b8f, B:143:0x0beb, B:149:0x0c75, B:151:0x0c7b, B:152:0x0c7c, B:154:0x0c7e, B:156:0x0c85, B:157:0x0c86, B:129:0x0b60, B:99:0x0799, B:111:0x0978, B:113:0x097e, B:114:0x09c0, B:116:0x0a92, B:117:0x0ad7, B:119:0x0aec, B:120:0x0b2d, B:159:0x0c88, B:161:0x0c8f, B:162:0x0c90, B:164:0x0c92, B:166:0x0c99, B:167:0x0c9a, B:106:0x08ee, B:108:0x0902, B:109:0x096c, B:101:0x08a6, B:103:0x08ba, B:104:0x08e7, B:145:0x0bfa, B:139:0x0bb6, B:141:0x0bbc, B:142:0x0be4), top: B:297:0x0684, outer: #5, inners: #2, #9, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0799 A[Catch: all -> 0x0c9b, TRY_LEAVE, TryCatch #13 {all -> 0x0c9b, blocks: (B:81:0x0684, B:83:0x068a, B:84:0x06cb, B:90:0x06e7, B:92:0x06ed, B:93:0x0732, B:94:0x073e, B:95:0x073f, B:97:0x0748, B:98:0x078e, B:121:0x0b33, B:122:0x0b37, B:126:0x0b49, B:131:0x0b76, B:134:0x0b8c, B:136:0x0b8f, B:143:0x0beb, B:149:0x0c75, B:151:0x0c7b, B:152:0x0c7c, B:154:0x0c7e, B:156:0x0c85, B:157:0x0c86, B:129:0x0b60, B:99:0x0799, B:111:0x0978, B:113:0x097e, B:114:0x09c0, B:116:0x0a92, B:117:0x0ad7, B:119:0x0aec, B:120:0x0b2d, B:159:0x0c88, B:161:0x0c8f, B:162:0x0c90, B:164:0x0c92, B:166:0x0c99, B:167:0x0c9a, B:106:0x08ee, B:108:0x0902, B:109:0x096c, B:101:0x08a6, B:103:0x08ba, B:104:0x08e7, B:145:0x0bfa, B:139:0x0bb6, B:141:0x0bbc, B:142:0x0be4), top: B:297:0x0684, outer: #5, inners: #2, #9, #10, #14 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.animateCameraWithCallback.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
    }
}
