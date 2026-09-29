package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.discardToEnd;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class setUpstreamFormat extends releaseDrmSessionReferences<discardToEnd.read> {
    private static final byte[] $$z = {16, -111, 25, -45};
    private static final int $$A = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$v = {19, -74, 60, -114, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -71, 5, 27, -7, 10, 14, -6, 20};
    private static final int $$w = 204;
    private static final byte[] $$j = {91, -118, -51, -87, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 242;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] write = {56429, 15252, 4996, 27548, 17339, 23467, 45996, 35736, 58323, 64473, 54206, 11214, 1014, 6941, 29467, 19203, 41759, 47913, 56417, 15235, 5045, 27527, 17328, 7069, 64573, 54306, 44154, 33861, 40020, 29787, 19494, 9338, 15470, 5201, 60501, 50195, 56550, 46318, 36001, 25774, 31949, 21713, 11404, 1269, 7349, 62652, 52445, 42198, 48286, 38198, 28013, 17701, 23825, 13592, 3332, 58715, 64890, 54628, 44345, 34052, 40211, 29976, 19891, 9706, 15787, 5531, 60825, 50574, 56825, 46508, 36273, 17597, 41752, 35586, 62303, 56162, 49954, 11134, 4865, 31496, 25372, 19317, 45949, 39733, 33730, 60317, 54225, 15244, 9150, 2976, 29686, 23427, 17307, 43933, 37806, 64511, 58298, 51776, 12879, 6748, 612, 27243, 21111, 47741, 41487, 35395, 61980, 55923, 49713, 10810, 4807, 31429, 25308, 19123, 45755, 39585, 33493, 60040, 53955, 15005, 8866, 2740, 29375, 22852, 16730, 43357, 37218, 63845, 57645, 51540, 12636, 6416, 374, 26922, 20784, 59452, 4041, 10112, 24539, 30688, 28658, 34811, 49029, 55187, 53136, 59380, 8100, 14304, 12125, 18254, 32594, 38746, 36719, 42863, 57205, 63316, 61202, 1818, 16185, 22392, 20287, 26259, 40654, 46801, 44725, 50873, 65186, 5887, 3801, 9876, 24218, 56372, 15307, 5078, 27614, 17376, 23537, 46079, 35726, 58250, 64408, 54180, 63776, 7897, 14025, 20177, 26358, 32486, 38625, 44757, 50846, 56980, 63219, 3712, 9904, 15948, 22081, 28238, 34380, 40532, 46689, 52844, 58906, 65028, 34979, 28499, 18242, 16193, 6006, 3951, 59236, 57119, 46878, 44807, 34619};
    private static long RemoteActionCompatParcelizer = -1117575307906827270L;
    private static char[] read = {6481, 6468, 6478, 6496, 6407, 6466, 6495, 6522, 6429, 6416, 6834, 6489, 6488, 6493, 6476, 6465, 6426, 6470, 6491, 6477, 6431, 6487, 6494, 6484, 6474, 6523, 6486, 6417, 6464, 6471, 6469, 6507, 6425, 6427, 6472, 6428, 6835, 6490, 6418, 6485, 6473, 6479, 6832, 6430, 6475, 6406, 6467, 6492, 6424};
    private static char AudioAttributesCompatParcelizer = 11445;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$B(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = 101 - r9
            byte[] r0 = kotlin.setUpstreamFormat.$$z
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r8
            r8 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2d:
            int r3 = -r3
            int r8 = r8 + 1
            int r9 = r9 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUpstreamFormat.$$B(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 190 - r7
            int r6 = r6 + 65
            byte[] r0 = kotlin.setUpstreamFormat.$$j
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUpstreamFormat.o(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 + 82
            byte[] r0 = kotlin.setUpstreamFormat.$$v
            int r8 = 28 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + 5
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUpstreamFormat.p(int, short, byte, java.lang.Object[]):void");
    }

    private static void m(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(write[i2 + i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 36621), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2340, 28 - (ViewConfiguration.getTapTimeout() >> 16), 480654850, false, $$B(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), KeyEvent.getDeadChar(0, 0) + 9701, TextUtils.lastIndexOf("", '0', 0, 0) + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23783, 33 - ((Process.getThreadPriority(0) + 20) >> 6), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(write[i2 + i7])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36621), 2340 - ExpandableListView.getPackedPositionGroup(0L), 27 - TextUtils.lastIndexOf("", '0'), 480654850, false, $$B(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), ImageFormat.getBitsPerPixel(0) + 9702, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.red(0), Color.green(0) + 23784, (-16777183) - Color.rgb(0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                try {
                    Object[] objArr8 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 23784 - TextUtils.getOffsetAfter("", 0), 33 - TextUtils.indexOf("", "", 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr9 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 23784, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    private static void n(int i, byte b, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = read;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 7014 - TextUtils.indexOf("", c, 0), 30 - ExpandableListView.getPackedPositionGroup(0L), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
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
        try {
            Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 7015 - View.MeasureSpec.getSize(0), 30 - View.combineMeasuredStates(0, 0), -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i5 = $10 + 121;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    needsstartedservice.AudioAttributesCompatParcelizer = 1;
                } else {
                    needsstartedservice.AudioAttributesCompatParcelizer = 0;
                }
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - KeyEvent.getDeadChar(0, 0)), 20126 - Color.green(0), 20 - (ViewConfiguration.getLongPressTimeout() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            try {
                                Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 19368 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17 - TextUtils.lastIndexOf("", '0', 0, 0), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                int i6 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i6];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i7 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i8 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i7];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i8];
                            } else {
                                int i9 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i9];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                }
            }
            int i11 = 0;
            while (i11 < i) {
                int i12 = $11 + 17;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[i11] = (char) (cArr4[i11] ^ 9353);
                } else {
                    cArr4[i11] = (char) (cArr4[i11] ^ 13722);
                    i11++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0ab1 A[Catch: all -> 0x0b6a, TryCatch #4 {all -> 0x0b6a, blocks: (B:123:0x0aab, B:125:0x0ab1, B:126:0x0adc), top: B:260:0x0aab, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f5  */
    @Override // kotlin.releaseDrmSessionReferences, kotlin.getExtractedSamplesCount, com.marrow.bgservices.BaseIntentService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setUpstreamFormat.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.releaseDrmSessionReferences, kotlin.getExtractedSamplesCount, com.marrow.bgservices.BaseIntentService, android.app.IntentService, android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 119;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
    }
}
