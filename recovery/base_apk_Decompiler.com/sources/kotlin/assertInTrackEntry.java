package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public class assertInTrackEntry extends Activity {
    private ResultReceiver RemoteActionCompatParcelizer;
    private static final byte[] $$c = {42, -44, 23, -55};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_BLK, -62, -101, -125, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_DIR, -33, -4, -9, 4, 1, 17, 3, 17, -25, -1, 1, 4, 15, 6, -10, 41, -39, -1, 7, 14, -17};
    private static final int $$e = 59;
    private static final byte[] $$a = {27, -119, -113, 73, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 19;
    private static int IconCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int read = 1000326313;
    private static char[] write = {56431, 25653, 44262, 62618, 15705, 17694, 36272, 54873, 7708, 42704, 61080, 14113, 32767, 34737, 51280, 4113, 22691, 57710, 2048, 45082, 30923, 8417, 59696, 37243, 22986, 533, 51767, 29433, 15016, 58142, 43926, 21465, 7215, 50210, 35987, 13578, 64856, 42487, 28064, 5690, 56973, 34446, 20347, 63337, 49135, 30726, 8192, 59598, 37049, 22887, 390, 51613, 29261, 14946, 58033, 43772, 21321, 7104, 50151, 35964, 13346, 64658, 42315, 27910, 5549, 56818, 56380, 25635, 44279, 62680, 15627, 17681, 36339, 54830, 7769, 42647, 61072, 14122, 32684, 34785, 51264, 4174, 22701, 57701, 10549, 29073, 47562, 49672, 2736, 21217, 39758, 9041, 27525, 44088, 62565, 15527, 17622, 36104, 54716, 7668, 42614, 61019, 14042, 32450, 34679, 53160, 6100, 22551, 57366, 10412, 29048, 47414, 49557, 2460, 21116, 39609, 8929, 27416, 45901, 64393, 15408, 17517, 35988, 54406, 7505, 42475, 60905, 13941, 32343, 34447, 52055, 29447, 48083, 58283, 10876, 21113, 39640, 49412, 2363, 45554, 63918, 8215, 26838, 37009, 57208, 1854, 20369, 63063, 15892, 26293, 44731, 54635, 7621, 17806, 35966, 13351, 31972, 47962, 58140, 11223, 21497, 39532, 49866, 2706, 45397, 63807, 8700, 27058, 36866, 55498, 173, 20342, 63337, 16280, 26176, 44558, 54968, 7850, 17679, 36314, 13768, 31858, 42017, 60644, 11090, 21272, 39915, 50172, 2673, 45705, 64192, 8518, 26913, 37358, 55377, 7, 18644, 56373, 25710, 44197, 62684, 15634, 17730, 56421, 25636, 44273, 62598, 15688, 17689, 36272, 54881, 7716, 42689, 61063, 14112, 32735, 34751, 51264, 4125, 56425, 25644, 44277, 62616, 15695, 17685, 36256, 54858, 7689, 42689, 61080, 14140, 32757, 34749, 51265, 56372, 25713, 44194, 62680, 15624, 17731, 36339, 54816, 7770, 42642, 61120, 30326, 52796, 1763, 24210, 38731, 61192, 10173, 31844, 46107, 3288, 17546};
    private static long AudioAttributesCompatParcelizer = 1203906530626331712L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = kotlin.assertInTrackEntry.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r7 = r7 * 4
            int r7 = 101 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.$$g(byte, int, byte):java.lang.String");
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ResultReceiver resultReceiver = this.RemoteActionCompatParcelizer;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
        int i3 = AudioAttributesImplBaseParcelizer + 69;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.assertInTrackEntry.$$a
            int r1 = r6 + 4
            int r7 = r7 + 4
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            int r7 = r7 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.assertInTrackEntry.$$d
            int r8 = r8 * 3
            int r8 = 81 - r8
            int r6 = 111 - r6
            int r1 = r7 + 22
            byte[] r1 = new byte[r1]
            int r7 = r7 + 21
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + 2
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.d(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 125;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.RemoteActionCompatParcelizer) != null) {
            int i5 = IconCompatParcelizer + 93;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            if (i2 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        int i4 = 0;
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $10 + 113;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(write[i2 - i6]);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        char fadingEdgeLength = (char) (36621 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int edgeSlop = 2340 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int i7 = 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b = (byte) i4;
                        byte b2 = b;
                        String str$$g = $$g(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(fadingEdgeLength, edgeSlop, i7, 480654850, false, str$$g, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue();
                    long j = i6;
                    long j2 = AudioAttributesCompatParcelizer;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c);
                    objArr3[2] = Long.valueOf(j2);
                    objArr3[1] = Long.valueOf(j);
                    objArr3[i4] = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(i4, i4);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 9702;
                        int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        Class[] clsArr2 = new Class[4];
                        clsArr2[i4] = Long.TYPE;
                        clsArr2[1] = Long.TYPE;
                        clsArr2[2] = Long.TYPE;
                        clsArr2[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer2 = startForeground.read(cCombineMeasuredStates, packedPositionChild, i8, 1186869823, false, "d", clsArr2);
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iAlpha = Color.alpha(i4) + 23784;
                        int tapTimeout = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                        Class[] clsArr3 = new Class[2];
                        clsArr3[i4] = Object.class;
                        clsArr3[1] = Object.class;
                        objRemoteActionCompatParcelizer3 = startForeground.read(edgeSlop2, iAlpha, tapTimeout, -1690012015, false, "b", clsArr3);
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
                int i9 = downloadService.write;
                Object[] objArr5 = new Object[1];
                objArr5[i4] = Integer.valueOf(write[i2 + i9]);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c2 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36620);
                    int scrollBarSize = 2340 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 29;
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    String str$$g2 = $$g(b3, b4, b4);
                    Class[] clsArr4 = new Class[1];
                    clsArr4[i4] = Integer.TYPE;
                    objRemoteActionCompatParcelizer4 = startForeground.read(c2, scrollBarSize, iLastIndexOf, 480654850, false, str$$g2, clsArr4);
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 9701 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.alpha(0), KeyEvent.keyCodeFromString("") + 23784, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                i4 = 0;
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i10 = $10 + 13;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        while (downloadService.write < i) {
            int i12 = $11 + 21;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 23785 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 34 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr9 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), 23784 - TextUtils.indexOf("", "", 0), 34 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r25, boolean r26, char[] r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.a(int, boolean, char[], int, int, java.lang.Object[]):void");
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        bundle.putParcelable("result_receiver", this.RemoteActionCompatParcelizer);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IconCompatParcelizer + 67;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 105, false, new char[]{65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 22, (KeyEvent.getMaxKeyCode() >> 16) + 245, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 91, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i3 = AudioAttributesImplBaseParcelizer + 87;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = AudioAttributesImplBaseParcelizer + 23;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.assertInTrackEntry.onPause():void");
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, true, new char[]{16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, View.combineMeasuredStates(0, 0) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 241, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, false, new char[]{65532, 5, 17, 65517, 1}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, 249 - MotionEvent.axisFromString(""), objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context != null) {
                int i2 = IconCompatParcelizer + 25;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4535), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, (char) (54383 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 36, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 30, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 60, true, new char[]{65518, 26, 65513, 65515, 28, 65513, 30, 65515, 65514, 31, 65516, 30, 26, 30, 65520, 26, 65517, 65521, 65514, 65519, 65516, 65522, 29, 30, 65522, 65515, 65516, 65514, 65515, 65514, 27, 26, 65521, 29, 29, 26, 65521, 65514, 65518, 29, 29, 65521, 28, 65515, 65514, 29, 26, 65514, 27, 65521, 65519, 65520, 65519, 27, 65518, 27, 65514, 28, 65516, 65519, 65514, 26, 31, 29}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 216, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(AndroidCharacter.getMirror('0') + 19, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 5935), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 126, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 2, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97), View.MeasureSpec.makeMeasureSpec(0, 0) + 197, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 100, false, new char[]{65520, 65517, '&', 65527, '!', 65522, 65527, '%', '#', '&', 65521, '!', 65526, 65526, 65522, 65521, '\"', 65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528, '&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 78, (ViewConfiguration.getFadingEdgeLength() >> 16) + 210, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Context applicationContext2 = context;
        try {
            try {
                if (applicationContext2 != null) {
                    int i4 = IconCompatParcelizer + 117;
                    AudioAttributesImplBaseParcelizer = i4 % 128;
                    if (i4 % 2 == 0) {
                        boolean z = applicationContext2 instanceof ContextWrapper;
                        throw null;
                    }
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                }
            } catch (Throwable th2) {
                Object[] objArr12 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 103, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 120, objArr12);
                String str6 = (String) objArr12[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    th2.printStackTrace(printStream);
                    printStream.close();
                    strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                } catch (Throwable unused) {
                    strValueOf = String.valueOf(th2);
                }
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(strValueOf);
                arrayList.add(str6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 4535), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6054, 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr13 = {709326762, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls2 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 6030, TextUtils.lastIndexOf("", '0', 0, 0) + 25);
                byte b = (byte) ($$e >>> 1);
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                d(b, bArr[100], bArr[34], objArr14);
                cls2.getMethod((String) objArr14[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr13);
            }
            try {
                Object[] objArr15 = {709326762};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1128409246);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1990, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, -1024191497, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr16 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr15)};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(352975618);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char edgeSlop = (char) (19323 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2759;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 99;
                        Object[] objArr17 = new Object[1];
                        c((byte) ($$b + 5), (short) 109, (byte) (-$$a[70]), objArr17);
                        objRemoteActionCompatParcelizer5 = startForeground.read(edgeSlop, keyRepeatDelay, offsetAfter, 1799372695, false, (String) objArr17[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (View.resolveSize(0, 0) + 9580), 3446 - TextUtils.getOffsetAfter("", 0), 144 - View.getDefaultSize(0, 0))});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr16);
                    try {
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 61148);
                            int iMyPid = (Process.myPid() >> 22) + 2145;
                            int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12;
                            byte b2 = $$a[5];
                            byte b3 = b2;
                            Object[] objArr18 = new Object[1];
                            c(b3, (short) (b3 | 136), b2, objArr18);
                            objRemoteActionCompatParcelizer6 = startForeground.read(c, iMyPid, i5, -2136739198, false, (String) objArr18[0], null);
                        }
                        if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                            int i6 = IconCompatParcelizer + 45;
                            AudioAttributesImplBaseParcelizer = i6 % 128;
                            int i7 = i6 % 2;
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char cKeyCodeFromString = (char) (61148 - KeyEvent.keyCodeFromString(""));
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2145;
                                int iResolveSize = View.resolveSize(0, 0) + 12;
                                Object[] objArr19 = new Object[1];
                                c(r10[164], (short) 139, (byte) (-$$a[62]), objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(cKeyCodeFromString, scrollBarFadeDuration, iResolveSize, -1530294468, false, (String) objArr19[0], null);
                            }
                            list = (List) ((Field) objRemoteActionCompatParcelizer7).get(null);
                        } else {
                            Object[] objArr20 = new Object[1];
                            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 243, objArr20);
                            Class<?> cls3 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 168, objArr21);
                            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
                            try {
                                Object[] objArr22 = {709326762};
                                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-173351824);
                                if (objRemoteActionCompatParcelizer8 == null) {
                                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 45845), 913 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 10, -1948051227, false, null, new Class[]{Integer.TYPE});
                                }
                                try {
                                    Object[] objArr23 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer8).newInstance(objArr22)};
                                    Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                    if (objRemoteActionCompatParcelizer9 == null) {
                                        char cKeyCodeFromString2 = (char) (61148 - KeyEvent.keyCodeFromString(""));
                                        int packedPositionChild = 2144 - ExpandableListView.getPackedPositionChild(0L);
                                        int minimumFlingVelocity = 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        byte[] bArr2 = $$a;
                                        Object[] objArr24 = new Object[1];
                                        c(bArr2[45], (short) 168, bArr2[61], objArr24);
                                        objRemoteActionCompatParcelizer9 = startForeground.read(cKeyCodeFromString2, packedPositionChild, minimumFlingVelocity, 251047987, false, (String) objArr24[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 556, 18 - (ViewConfiguration.getPressedStateDuration() >> 16))});
                                    }
                                    list = (List) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr23);
                                    Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                    if (objRemoteActionCompatParcelizer10 == null) {
                                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 61149);
                                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2145;
                                        int i8 = 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        Object[] objArr25 = new Object[1];
                                        c(r10[164], (short) 139, (byte) (-$$a[62]), objArr25);
                                        objRemoteActionCompatParcelizer10 = startForeground.read(cIndexOf, touchSlop, i8, -1530294468, false, (String) objArr25[0], null);
                                    }
                                    ((Field) objRemoteActionCompatParcelizer10).set(null, list);
                                    Object[] objArr26 = new Object[1];
                                    a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12, false, new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, 245 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr26);
                                    Class<?> cls4 = Class.forName((String) objArr26[0]);
                                    Object[] objArr27 = new Object[1];
                                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 220, objArr27);
                                    long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue);
                                    Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(301834150);
                                    if (objRemoteActionCompatParcelizer11 == null) {
                                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 61147);
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2146;
                                        int gidForName = Process.getGidForName("") + 13;
                                        Object[] objArr28 = new Object[1];
                                        c((byte) ($$b + 5), (short) 109, (byte) (-$$a[70]), objArr28);
                                        objRemoteActionCompatParcelizer11 = startForeground.read(c2, iLastIndexOf, gidForName, 1874090803, false, (String) objArr28[0], null);
                                    }
                                    ((Field) objRemoteActionCompatParcelizer11).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                    Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                    if (objRemoteActionCompatParcelizer12 == null) {
                                        char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61148);
                                        int iLastIndexOf2 = 2144 - TextUtils.lastIndexOf("", '0');
                                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 12;
                                        byte b4 = $$a[5];
                                        byte b5 = b4;
                                        Object[] objArr29 = new Object[1];
                                        c(b5, (short) (b5 | 136), b4, objArr29);
                                        objRemoteActionCompatParcelizer12 = startForeground.read(c3, iLastIndexOf2, pressedStateDuration, -2136739198, false, (String) objArr29[0], null);
                                    }
                                    ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf2);
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 == null) {
                                        throw th3;
                                    }
                                    throw cause2;
                                }
                            } catch (Throwable th4) {
                                Throwable cause3 = th4.getCause();
                                if (cause3 == null) {
                                    throw th4;
                                }
                                throw cause3;
                            }
                        }
                        for (Object[] objArr30 : list) {
                            int i9 = ((int[]) objArr30[3])[0];
                            int i10 = ((int[]) objArr30[1])[0];
                            if (i10 != i9) {
                                ArrayList arrayList2 = new ArrayList();
                                String[] strArr = (String[]) objArr30[2];
                                if (strArr != null) {
                                    for (String str7 : strArr) {
                                        arrayList2.add(str7);
                                    }
                                }
                                long j = -1;
                                long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                                long j3 = 0;
                                long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                                try {
                                    Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                    if (objRemoteActionCompatParcelizer13 == null) {
                                        objRemoteActionCompatParcelizer13 = startForeground.read((char) (4535 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.makeMeasureSpec(0, 0) + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                    }
                                    Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                                    try {
                                        Object[] objArr31 = {709326762, Long.valueOf(j4), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                        Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6031 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - (KeyEvent.getMaxKeyCode() >> 16));
                                        byte b6 = (byte) ($$e >>> 1);
                                        byte[] bArr3 = $$d;
                                        Object[] objArr32 = new Object[1];
                                        d(b6, bArr3[100], bArr3[34], objArr32);
                                        cls5.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 == null) {
                                            throw th5;
                                        }
                                        throw cause4;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 == null) {
                                        throw th6;
                                    }
                                    throw cause5;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        Object[] objArr33 = new Object[1];
                        b(11 - Color.argb(0, 0, 0, 0), (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 43597), 244 - MotionEvent.axisFromString(""), objArr33);
                        String str8 = (String) objArr33[0];
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                            th7.printStackTrace(printStream2);
                            printStream2.close();
                            strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                        } catch (Throwable unused2) {
                            strValueOf2 = String.valueOf(th7);
                        }
                        ArrayList arrayList3 = new ArrayList(2);
                        arrayList3.add(strValueOf2);
                        arrayList3.add(str8);
                        Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer14 == null) {
                            objRemoteActionCompatParcelizer14 = startForeground.read((char) (4535 - (ViewConfiguration.getPressedStateDuration() >> 16)), 6054 - KeyEvent.getDeadChar(0, 0), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
                        Object[] objArr34 = {709326762, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                        Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 6030 - (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23);
                        byte b7 = (byte) ($$e >>> 1);
                        byte[] bArr4 = $$d;
                        Object[] objArr35 = new Object[1];
                        d(b7, bArr4[100], bArr4[34], objArr35);
                        cls6.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
                    }
                    Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        char size = (char) (13183 - View.MeasureSpec.getSize(0));
                        int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
                        int offsetAfter2 = 26 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr36 = new Object[1];
                        c((byte) (bArr5[61] - 1), bArr5[5], (byte) (-bArr5[62]), objArr36);
                        objRemoteActionCompatParcelizer15 = startForeground.read(size, iResolveOpacity, offsetAfter2, -133433128, false, (String) objArr36[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                        int i11 = AudioAttributesImplBaseParcelizer + 55;
                        IconCompatParcelizer = i11 % 128;
                        if (i11 % 2 != 0) {
                            Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer16 == null) {
                                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
                                Object[] objArr37 = new Object[1];
                                c(r1[8], r1[27], (byte) (-$$a[9]), objArr37);
                                objRemoteActionCompatParcelizer16 = startForeground.read(longPressTimeout, minimumFlingVelocity2, deadChar, -1033747278, false, (String) objArr37[0], null);
                            }
                            throw null;
                        }
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int iIndexOf = 1649 - TextUtils.indexOf("", "", 0, 0);
                            int iAlpha = Color.alpha(0) + 26;
                            Object[] objArr38 = new Object[1];
                            c(r4[8], r4[27], (byte) (-$$a[9]), objArr38);
                            objRemoteActionCompatParcelizer17 = startForeground.read(fadingEdgeLength, iIndexOf, iAlpha, -1033747278, false, (String) objArr38[0], null);
                        }
                        objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                    } else {
                        Object[] objArr39 = new Object[1];
                        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 33, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 209, objArr39);
                        Class<?> cls7 = Class.forName((String) objArr39[0]);
                        Object[] objArr40 = new Object[1];
                        b(16 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 203 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr40);
                        try {
                            Object[] objArr41 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue()), 0, 1701321085};
                            byte b8 = $$d[49];
                            Object[] objArr42 = new Object[1];
                            d(b8, r1[51], b8, objArr42);
                            Class<?> cls8 = Class.forName((String) objArr42[0]);
                            Object[] objArr43 = new Object[1];
                            d((byte) ($$e >>> 1), r1[100], r1[34], objArr43);
                            objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char c4 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                                int i12 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                                Object[] objArr44 = new Object[1];
                                c(r6[8], r6[27], (byte) (-$$a[9]), objArr44);
                                objRemoteActionCompatParcelizer18 = startForeground.read(c4, i12, touchSlop2, -1033747278, false, (String) objArr44[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                            try {
                                Object[] objArr45 = new Object[1];
                                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 84, false, new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 235, objArr45);
                                Class<?> cls9 = Class.forName((String) objArr45[0]);
                                Object[] objArr46 = new Object[1];
                                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 11, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 184, objArr46);
                                long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf3 = Long.valueOf(jLongValue2);
                                Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                                if (objRemoteActionCompatParcelizer19 == null) {
                                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                                    int iMyPid2 = (Process.myPid() >> 22) + 1649;
                                    int keyRepeatDelay2 = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    Object[] objArr47 = new Object[1];
                                    c(r6[8], (short) ($$b << 2), (byte) (-$$a[9]), objArr47);
                                    objRemoteActionCompatParcelizer19 = startForeground.read(pressedStateDuration2, iMyPid2, keyRepeatDelay2, 54351865, false, (String) objArr47[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                                Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                                if (objRemoteActionCompatParcelizer20 == null) {
                                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
                                    int iNormalizeMetaState = 1649 - KeyEvent.normalizeMetaState(0);
                                    int jumpTapTimeout = 26 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    byte[] bArr6 = $$a;
                                    Object[] objArr48 = new Object[1];
                                    c((byte) (bArr6[61] - 1), bArr6[5], (byte) (-bArr6[62]), objArr48);
                                    objRemoteActionCompatParcelizer20 = startForeground.read(keyRepeatTimeout, iNormalizeMetaState, jumpTapTimeout, -133433128, false, (String) objArr48[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                            } catch (Exception unused3) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th8) {
                            Throwable cause6 = th8.getCause();
                            if (cause6 == null) {
                                throw th8;
                            }
                            throw cause6;
                        }
                    }
                    int i13 = ((int[]) objArr[3])[0];
                    int i14 = ((int[]) objArr[2])[0];
                    if (i14 != i13) {
                        long j5 = -1;
                        long j6 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                        long j7 = 0;
                        long j8 = j6 | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer21 == null) {
                            objRemoteActionCompatParcelizer21 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4535), 6055 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                        Object[] objArr49 = {709326762, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls10 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, 24 - ((Process.getThreadPriority(0) + 20) >> 6));
                        byte b9 = (byte) ($$e >>> 1);
                        byte[] bArr7 = $$d;
                        Object[] objArr50 = new Object[1];
                        d(b9, bArr7[100], bArr7[34], objArr50);
                        cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
                    }
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                        int iNormalizeMetaState2 = 943 - KeyEvent.normalizeMetaState(0);
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
                        byte b10 = $$a[5];
                        byte b11 = b10;
                        Object[] objArr51 = new Object[1];
                        c(b11, (short) (b11 | 136), b10, objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(offsetAfter3, iNormalizeMetaState2, longPressTimeout2, -167186806, false, (String) objArr51[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                        Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer23 == null) {
                            char offsetAfter4 = (char) TextUtils.getOffsetAfter("", 0);
                            int maxKeyCode = 943 - (KeyEvent.getMaxKeyCode() >> 16);
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 36;
                            Object[] objArr52 = new Object[1];
                            c(r3[164], (short) 139, (byte) (-$$a[62]), objArr52);
                            objRemoteActionCompatParcelizer23 = startForeground.read(offsetAfter4, maxKeyCode, scrollDefaultDelay, -1398865628, false, (String) objArr52[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                    } else {
                        Object[] objArr53 = new Object[1];
                        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 4, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + TsExtractor.TS_STREAM_TYPE_AC3, objArr53);
                        Class<?> cls11 = Class.forName((String) objArr53[0]);
                        Object[] objArr54 = new Object[1];
                        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 88, objArr54);
                        Object[] objArr55 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr54[0], Object.class).invoke(null, this)).intValue()), 0, -2061828614};
                        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                        if (objRemoteActionCompatParcelizer24 == null) {
                            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                            int iLastIndexOf3 = 942 - TextUtils.lastIndexOf("", '0');
                            int i15 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36;
                            byte[] bArr8 = $$a;
                            byte b12 = bArr8[0];
                            Object[] objArr56 = new Object[1];
                            c(b12, (short) (b12 | 160), (byte) (-bArr8[9]), objArr56);
                            objRemoteActionCompatParcelizer24 = startForeground.read(mirror, iLastIndexOf3, i15, -2131402098, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr55);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            int mirror2 = 991 - AndroidCharacter.getMirror('0');
                            int mode = View.MeasureSpec.getMode(0) + 36;
                            Object[] objArr57 = new Object[1];
                            c(r6[164], (short) 139, (byte) (-$$a[62]), objArr57);
                            objRemoteActionCompatParcelizer25 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), mirror2, mode, -1398865628, false, (String) objArr57[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                        try {
                            Object[] objArr58 = new Object[1];
                            a(13 - (ViewConfiguration.getTapTimeout() >> 16), false, new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 14, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 244, objArr58);
                            Class<?> cls12 = Class.forName((String) objArr58[0]);
                            Object[] objArr59 = new Object[1];
                            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 215, objArr59);
                            long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr59[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                            if (objRemoteActionCompatParcelizer26 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int mode2 = 943 - View.MeasureSpec.getMode(0);
                                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 36;
                                Object[] objArr60 = new Object[1];
                                c((byte) ($$b + 5), (short) 109, (byte) (-$$a[70]), objArr60);
                                objRemoteActionCompatParcelizer26 = startForeground.read(defaultSize, mode2, deadChar2, -629981381, false, (String) objArr60[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                            if (objRemoteActionCompatParcelizer27 == null) {
                                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                int defaultSize2 = 943 - View.getDefaultSize(0, 0);
                                int i16 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37;
                                byte b13 = $$a[5];
                                byte b14 = b13;
                                Object[] objArr61 = new Object[1];
                                c(b14, (short) (b14 | 136), b13, objArr61);
                                objRemoteActionCompatParcelizer27 = startForeground.read(absoluteGravity, defaultSize2, i16, -167186806, false, (String) objArr61[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                        } catch (Exception unused4) {
                            throw new RuntimeException();
                        }
                    }
                    int i17 = ((int[]) objArr2[2])[0];
                    int i18 = ((int[]) objArr2[0])[0];
                    if (i18 != i17) {
                        long j9 = -1;
                        long j10 = 0;
                        long j11 = (((long) (i18 ^ i17)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer28 == null) {
                            objRemoteActionCompatParcelizer28 = startForeground.read((char) (4536 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6054, 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                        Object[] objArr62 = {709326762, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 6031, TextUtils.lastIndexOf("", '0') + 25);
                        byte b15 = (byte) ($$e >>> 1);
                        byte[] bArr9 = $$d;
                        Object[] objArr63 = new Object[1];
                        d(b15, bArr9[100], bArr9[34], objArr63);
                        cls13.getMethod((String) objArr63[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr62);
                    }
                } catch (Throwable th9) {
                    Throwable cause7 = th9.getCause();
                    if (cause7 == null) {
                        throw th9;
                    }
                    throw cause7;
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IconCompatParcelizer + 31;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
