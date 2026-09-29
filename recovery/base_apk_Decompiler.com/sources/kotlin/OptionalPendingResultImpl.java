package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OptionalPendingResultImpl extends addObserverForBackInvoker implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {123, -86, 125, 25};
    private static final int $$f = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {27, -119, -113, 73, 64, -58, 1, -16, TarConstants.LF_LINK, -46, 10, -22, 84, -30, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 41, -32, -19, 13, 20, -18, -18, 14, -3, -8, 2, -18, 20, -14, 4, 8, -12, 14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 64, -24, -3, -6, -8, -35, 2, 11, 4, -3, -3, 16, -18, -20, 3, -2, 2, 12, 64, -84, 4, 8, -12, 14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 175;
    private static final byte[] $$a = {TarConstants.LF_CHR, -90, -19, 114, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 215;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static char[] read = {41568, 47176, 38443, 60422, 51954, 8363, 16015, 5438, 29526, 18733, 42921, 48636, 39847, 61845, 52288, 10797, 2, 7909, 56417, 50770, 59415, 37392, 46324, 56430, 50714, 59427, 37405, 46241, 24317, 16517, 27429, 3408, 14135, 55743, 50064, 58848, 36758, 45642, 21537, 32324, 24826, 2768, 11480, 55090, 63758, 58213, 34239, 44957, 20902, 31646, 7720, '{', 10833, 52399, 63117, 39128, 33642, 42261, 20284, 28945, 7114, 15861, 10139, 51749, 60417, 38415, 47281, 41691, 17637, 28478, 4420, 15209, 56607, 51188, 59816, 37841, 46633, 22533, 16910, 25781, 3777, 12527, 55955, 64798, 59248, 35144, 45997, 56420, 50783, 59446, 37385, 46307, 24309, 16585, 27442, 3408, 14130, 55779, 50125, 58785, 36741, 45633, 21552, 32274, 24831, 2753, 11463, 55156, 63831, 58148, 34280, 44997, 20919, 31641, 7792, ';', 10771, 52400, 63186, 39065, 33642, 42320, 20285, 28931, 7134, 15795, 10140, 51814, 60502, 38468, 47330, 41687, 17594, 28449, 4420, 15148, 56594, 51133, 59808, 37774, 46712, 22611, 16926, 25840, 3724, 12460, 56003, 64775, 59170, 35080, 46064, 21922, 32671, 25201, 56425, 50759, 59427, 37385, 46307, 24234, 16514, 27471, 3409, 14130, 55782, 50133, 58801, 36762, 45643, 56372, 50714, 59508, 37449, 46244, 24316, 16593, 27429, 3330, 14177, 55742, 56376, 50713, 59515, 37453, 46249, 24313, 16593, 27439, 3341, 14181, 55738};
    private static long AudioAttributesImplApi21Parcelizer = 3787636586150348331L;
    private static char[] AudioAttributesImplApi26Parcelizer = {28315, 28332, 28310, 28328, 28333, 28307, 28396, 28330, 28411, 28313, 28326, 28324, 28323, 28294, 28306, 28311, 28327, 28334, 28391, 28394, 28308, 28312, 28390, 28388, 28393, 28387, 28386, 28395, 28392, 28389, 28399, 28304, 28309, 28297, 28329, 28335, 28402, 28409, 28305};
    private static int MediaBrowserCompatItemReceiver = 411397946;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static boolean AudioAttributesImplBaseParcelizer = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r5, int r6, short r7) {
        /*
            byte[] r0 = kotlin.OptionalPendingResultImpl.$$c
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 101 - r6
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.OptionalPendingResultImpl.$$i(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.OptionalPendingResultImpl.$$a
            int r6 = 191 - r6
            int r1 = 44 - r7
            int r8 = r8 + 65
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.OptionalPendingResultImpl.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.OptionalPendingResultImpl.$$g
            int r1 = 43 - r7
            int r8 = 119 - r8
            int r6 = 101 - r6
            byte[] r1 = new byte[r1]
            int r7 = 42 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.OptionalPendingResultImpl.d(int, short, int, java.lang.Object[]):void");
    }

    OptionalPendingResultImpl() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.OptionalPendingResultImpl.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                OptionalPendingResultImpl.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 25;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 11;
        MediaBrowserCompatMediaItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaBrowserCompatSearchResultReceiver + 13;
            MediaBrowserCompatMediaItem = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(read[i >>> i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36620), 2340 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28, 480654850, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 9701 - (ViewConfiguration.getPressedStateDuration() >> 16), 26 - TextUtils.indexOf("", "", 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) View.combineMeasuredStates(0, 0), 23784 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(read[i + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 36621), 2340 - (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 480654850, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 9701 - KeyEvent.getDeadChar(0, 0), 25 - TextUtils.lastIndexOf("", '0', 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) View.MeasureSpec.getMode(0), 23784 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23784 - (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            int i7 = $10 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        long j;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesImplApi26Parcelizer;
        char c = '0';
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - TextUtils.lastIndexOf("", c, 0, 0)), TextUtils.getOffsetBefore("", 0) + 18944, 28 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                    f = BitmapDescriptorFactory.HUE_RED;
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
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19033, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (AudioAttributesImplBaseParcelizer) {
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 11439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
            return;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            int i8 = $10 + 33;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            String str2 = new String(cArr5);
            int i10 = $11 + 63;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str2;
                return;
            } else {
                int i11 = 18 / 0;
                objArr[0] = str2;
                return;
            }
        }
        int i12 = $11 + 41;
        $10 = i12 % 128;
        notifydownloads.AudioAttributesCompatParcelizer = i12 % 2 != 0 ? cArr.length : cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i13 = $11 + 53;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer >>> 1) >>> notifydownloads.IconCompatParcelizer] % i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - Process.getGidForName("")), 11439 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                j = 0;
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    j = 0;
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (Process.getGidForName("") + 1), (ViewConfiguration.getTapTimeout() >> 16) + 11439, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                } else {
                    j = 0;
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32268), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 96, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaBrowserCompatSearchResultReceiver + 113;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 4535), 6053 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 91, new byte[]{-112, -107, -102, -101, -109, -102, -103, -125, -98, -106, -118, -106, -112, -104, -99, -112, -108, -99, -100, -103, -127, -105, -107, -101, -102, -107, -112, -103, -108, -118, -112, -108, -109, -125, -107, -112, -102, -103, -104, -105, -106, -127, -125, -118, -107, -108, -109, -118}, null, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(View.MeasureSpec.getSize(0) + 127, new byte[]{-98, -103, -112, -109, -118, -112, -107, -101, -109, -105, -102, -100, -108, -109, -102, -108, -125, -100, -107, -125, -125, -106, -98, -101, -108, -103, -99, -107, -103, -106, -105, -108, -108, -99, -98, -102, -108, -100, -100, -106, -102, -105, -101, -104, -102, -127, -112, -127, -104, -125, -100, -108, -106, -125, -98, -109, -104, -98, -127, -98, -108, -118, -118, -108}, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 14, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((char) (MotionEvent.axisFromString("") + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 83, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-99, -121, -105, -100, -121, -102}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, new byte[]{-104, -104, -127, -100, -107, -118, -112, -98, -99, -127, -98, -107, -97, -108, -99, -106, -102, -97, -98, -105, -104, -105, -97, -107, -101, -107, -101, -97, -100, -100, -99, -104, -98, -106, -100, -99}, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6030, 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i4 = MediaBrowserCompatSearchResultReceiver + 67;
                    MediaBrowserCompatMediaItem = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
            int iAlpha = Color.alpha(0) + 1649;
            int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c((short) 187, bArr[5], bArr[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, iAlpha, offsetBefore, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                int mode = View.MeasureSpec.getMode(0) + 1649;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                short s = (short) ($$b & 952);
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c(s, bArr2[30], bArr2[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cMakeMeasureSpec, mode, iNormalizeMetaState, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            int i6 = MediaBrowserCompatMediaItem + 89;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr15 = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-92, -112, -117, -93, -115, -94, -121, -95, -126, -127, -110, -121, -127, -116, -127, -96}, null, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, new byte[]{-112, -125, -123, -90, -113, -93, -127, -91, -115, -117, -122, -117, -126, -112, -125, -122}, null, null, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1640632990};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) 97, bArr3[25], bArr3[22], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b = (byte) 55;
                Object[] objArr19 = new Object[1];
                d(b, (byte) (b & 238), bArr3[25], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c2 = (char) (13183 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
                    int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                    short s2 = (short) ($$b & 952);
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(s2, bArr4[30], bArr4[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c2, tapTimeout, edgeSlop, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b((ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-89, -118, -123, -110, -90, -92, -112, -117, -93, -115, -94, -121, -93, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a((char) View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 150, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
                        int iAlpha2 = 1649 - Color.alpha(0);
                        int iAxisFromString = MotionEvent.axisFromString("") + 27;
                        byte[] bArr5 = $$a;
                        Object[] objArr23 = new Object[1];
                        c((short) 111, bArr5[30], bArr5[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(keyRepeatTimeout, iAlpha2, iAxisFromString, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1650;
                        int i8 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                        byte[] bArr6 = $$a;
                        Object[] objArr24 = new Object[1];
                        c((short) 187, bArr6[5], bArr6[140], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(deadChar, iIndexOf, i8, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 4535), 6054 - (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i11 = MediaBrowserCompatMediaItem + 95;
            MediaBrowserCompatSearchResultReceiver = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr25 = {-1287315141, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), MotionEvent.axisFromString("") + 6031, 25 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte[] bArr7 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) 51, (byte) (-bArr7[27]), (byte) (-bArr7[29]), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 49;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 65;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            ishighlightedMediaBrowserCompatItemReceiver.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedMediaBrowserCompatItemReceiver.af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 103;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
        }
        int i3 = MediaBrowserCompatMediaItem + 87;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatMediaItem + 39;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 128, new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = MediaBrowserCompatSearchResultReceiver + 19;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 4535), KeyEvent.normalizeMetaState(0) + 6054, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 6030 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.combineMeasuredStates(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i8 = MediaBrowserCompatSearchResultReceiver + 7;
                MediaBrowserCompatMediaItem = i8 % 128;
                int i9 = i8 % 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 89;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatSearchResultReceiver + 3;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 73;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.getMode(0)), 6054 - View.MeasureSpec.getSize(0), 42 - TextUtils.getTrimmedLength(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), View.resolveSize(0, 0) + 6030, 24 - (KeyEvent.getMaxKeyCode() >> 16), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
        int i7 = MediaBrowserCompatSearchResultReceiver + 97;
        MediaBrowserCompatMediaItem = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0672 A[Catch: all -> 0x0a90, TRY_LEAVE, TryCatch #8 {all -> 0x0a90, blocks: (B:94:0x05ba, B:96:0x05c0, B:97:0x0603, B:101:0x061d, B:103:0x0623, B:104:0x0667, B:128:0x0950, B:129:0x0954, B:131:0x095a, B:133:0x0970, B:136:0x0986, B:138:0x0989, B:145:0x09ec, B:151:0x0a6a, B:153:0x0a70, B:154:0x0a71, B:156:0x0a73, B:158:0x0a7a, B:159:0x0a7b, B:105:0x0672, B:117:0x07b8, B:119:0x07be, B:120:0x0805, B:122:0x08a5, B:123:0x08e7, B:125:0x08fe, B:126:0x0940, B:161:0x0a7d, B:163:0x0a84, B:164:0x0a85, B:166:0x0a87, B:168:0x0a8e, B:169:0x0a8f, B:107:0x06e1, B:109:0x06f5, B:110:0x0727, B:147:0x09f1, B:141:0x09b6, B:143:0x09bc, B:144:0x09e5, B:112:0x072e, B:114:0x0742, B:115:0x07ac), top: B:284:0x05ba, outer: #6, inners: #2, #4, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x095a A[Catch: all -> 0x0a90, TryCatch #8 {all -> 0x0a90, blocks: (B:94:0x05ba, B:96:0x05c0, B:97:0x0603, B:101:0x061d, B:103:0x0623, B:104:0x0667, B:128:0x0950, B:129:0x0954, B:131:0x095a, B:133:0x0970, B:136:0x0986, B:138:0x0989, B:145:0x09ec, B:151:0x0a6a, B:153:0x0a70, B:154:0x0a71, B:156:0x0a73, B:158:0x0a7a, B:159:0x0a7b, B:105:0x0672, B:117:0x07b8, B:119:0x07be, B:120:0x0805, B:122:0x08a5, B:123:0x08e7, B:125:0x08fe, B:126:0x0940, B:161:0x0a7d, B:163:0x0a84, B:164:0x0a85, B:166:0x0a87, B:168:0x0a8e, B:169:0x0a8f, B:107:0x06e1, B:109:0x06f5, B:110:0x0727, B:147:0x09f1, B:141:0x09b6, B:143:0x09bc, B:144:0x09e5, B:112:0x072e, B:114:0x0742, B:115:0x07ac), top: B:284:0x05ba, outer: #6, inners: #2, #4, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0f24  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1000  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1047  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1094  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1314  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0373 A[Catch: all -> 0x0384, PHI: r6
      0x0373: PHI (r6v12 int) = (r6v11 int), (r6v14 int) binds: [B:38:0x035b, B:43:0x0371] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0384, blocks: (B:36:0x0358, B:42:0x036a, B:46:0x037a, B:47:0x0383, B:44:0x0373), top: B:272:0x0358 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0509 A[Catch: all -> 0x034d, TryCatch #6 {all -> 0x034d, blocks: (B:209:0x0f44, B:211:0x0f4a, B:212:0x0f6f, B:245:0x1334, B:247:0x133a, B:248:0x135e, B:226:0x1111, B:228:0x1133, B:229:0x1179, B:176:0x0b0b, B:178:0x0b11, B:179:0x0b35, B:87:0x0503, B:89:0x0509, B:90:0x052f, B:21:0x0111, B:23:0x0117, B:24:0x0144, B:26:0x02bf, B:28:0x02f0, B:29:0x0347, B:94:0x05ba, B:96:0x05c0, B:97:0x0603, B:101:0x061d, B:103:0x0623, B:104:0x0667, B:128:0x0950, B:129:0x0954, B:131:0x095a, B:133:0x0970, B:136:0x0986, B:138:0x0989, B:145:0x09ec, B:151:0x0a6a, B:153:0x0a70, B:154:0x0a71, B:156:0x0a73, B:158:0x0a7a, B:159:0x0a7b, B:105:0x0672, B:117:0x07b8, B:119:0x07be, B:120:0x0805, B:122:0x08a5, B:123:0x08e7, B:125:0x08fe, B:126:0x0940, B:161:0x0a7d, B:163:0x0a84, B:164:0x0a85, B:166:0x0a87, B:168:0x0a8e, B:169:0x0a8f), top: B:281:0x0111, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05c0 A[Catch: all -> 0x0a90, TryCatch #8 {all -> 0x0a90, blocks: (B:94:0x05ba, B:96:0x05c0, B:97:0x0603, B:101:0x061d, B:103:0x0623, B:104:0x0667, B:128:0x0950, B:129:0x0954, B:131:0x095a, B:133:0x0970, B:136:0x0986, B:138:0x0989, B:145:0x09ec, B:151:0x0a6a, B:153:0x0a70, B:154:0x0a71, B:156:0x0a73, B:158:0x0a7a, B:159:0x0a7b, B:105:0x0672, B:117:0x07b8, B:119:0x07be, B:120:0x0805, B:122:0x08a5, B:123:0x08e7, B:125:0x08fe, B:126:0x0940, B:161:0x0a7d, B:163:0x0a84, B:164:0x0a85, B:166:0x0a87, B:168:0x0a8e, B:169:0x0a8f, B:107:0x06e1, B:109:0x06f5, B:110:0x0727, B:147:0x09f1, B:141:0x09b6, B:143:0x09bc, B:144:0x09e5, B:112:0x072e, B:114:0x0742, B:115:0x07ac), top: B:284:0x05ba, outer: #6, inners: #2, #4, #9, #14 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.OptionalPendingResultImpl.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 115;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = MediaBrowserCompatSearchResultReceiver + 115;
        MediaBrowserCompatMediaItem = i5 % 128;
        int i6 = i5 % 2;
    }
}
