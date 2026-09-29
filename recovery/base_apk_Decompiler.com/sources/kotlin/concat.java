package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class concat extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {87, 74, -120, 12};
    private static final int $$f = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_GNUTYPE_LONGLINK, -63, -64, 24, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 58, 7, 7, -68, TarConstants.LF_FIFO, 13, -1, 1, 3, 0, -63, 72, 0, -10, 4, -61, 77, 1, -24, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 46;
    private static final byte[] $$a = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, 13, 21, 98, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_E_AC3;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int[] IconCompatParcelizer = {-1570744188, 1971196830, -1536043747, -1359140251, -1717515627, 1301186233, 1128322260, -677503510, -758544096, -1377263994, -1109751115, 1262560903, 1511722197, -1449706622, 1203855435, -1149718085, 1193210607, -1170830087};
    private static char[] AudioAttributesImplApi26Parcelizer = {56431, 8782, 8402, 9999, 9651, 9275, 10919, 10543, 12160, 11797, 11417, 13096, 12797, 12385, 14058, 13504, 15180, 14734, 14385, 16105, 15731, 938, 592, 132, 1820, 1525, 1070, 2784, 2363, 3910, 3532, 3157, 4745, 4457, 6132, 5676, 5330, 7004, 6596, 6170, 7920, 7472, 25523, 25028, 24640, 26334, 25864, 27568, 53190, 12770, 13179, 13475, 13853, 14276, 14603, 14977, 15483, 15854, 16180, 8329, 8786, 9164, 9488, 10041, 10471, 10868, 11209, 11546, 11916, 4109, 4600, 4990, 5308, 5720, 6097, 6475, 6859, 7354, 7734, 8111, 294, 661, 1114, 1408, 1836, 2295, 2671, 3047, 3414, 3790, 28690, 29295, 29670, 30075, 30373, 30795, 31126, 31496, 31997, 32371, 32747, 24940, 25304, 25682, 26054, 26607, 26981, 27384, 27687, 28104, 28439, 20616, 26629, 38433, 38120, 37734, 37258, 36870, 40654, 40222, 39867, 39468, 39156, 34635, 34251, 33805, 33409, 33018, 36655, 36321, 35931, 35459, 35097, 46997, 46702, 46308, 45942, 45469, 45077, 48851, 48464, 47914, 47524, 47158, 42675, 42321, 41886, 41543, 41146, 44849, 44542, 44064, 43726, 43354, 55172, 54698, 54384, 53950, 53557, 57311, 56834, 56516, 56127, 55731, 55418, 50930, 50510, 50069, 49758, 49274, 52900, 52584, 52149, 51723, 51331, 63254, 56420, 8719, 8342, 10009, 9635, 9317, 10985, 10594, 12240, 11842, 11459, 13181, 12769, 12405, 14049, 13440, 15122, 14735, 14369, 16119, 15668, 935, 580, 216, 1861, 1511, 1145, 2784, 2427, 3843, 3536, 3074, 4761, 4410, 6064, 5677, 5315, 6990, 6611, 6220, 7910, 7526, 25508, 24978, 24599, 26250, 25921, 27572, 27180, 26786, 28445, 28112, 27726, 29384, 29043, 30702, 30320, 29788, 31372, 31059, 32711, 32306, 31912, 17184, 16802, 16463, 18129, 56382, 8778, 8320, 10078, 9702, 9325, 10999, 10620, 12185, 11803, 11468, 13097, 12798, 12330, 14010, 13507, 15176, 14812, 14463, 16096, 15650, 1021, 518, 144, 1858, 1444, 1147, 2739, 2367, 3858, 3485, 3075, 4829, 4410, 6132, 5759, 15586, 49816, 49152, 51072, 50467, 50353, 51765, 51635, 53115, 52933, 52318, 54270, 53596, 53487, 54893, 54295, 56429, 8725, 8326, 10011, 9663, 9270, 10914, 10595, 12251, 11856, 11396, 13122, 12769, 12404, 14074, 13456, 15121, 14760, 14398, 16054, 15651, 932};
    private static long AudioAttributesImplBaseParcelizer = 5631646391246856827L;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean read = false;

    private static String $$i(short s, short s2, short s3) {
        int i = 101 - (s3 * 2);
        int i2 = s2 * 2;
        byte[] bArr = $$c;
        int i3 = 4 - (s * 4);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i = i2 + (-i3);
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i3];
            i3++;
            i += -b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 190 - r6
            byte[] r0 = kotlin.concat.$$a
            int r8 = r8 + 65
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concat.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.concat.$$g
            int r1 = r8 + 4
            int r6 = r6 + 4
            int r7 = r7 + 73
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concat.d(short, short, short, java.lang.Object[]):void");
    }

    concat() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.concat.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                concat.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 49;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.write = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 109;
                AudioAttributesImplApi21Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i5 = AudioAttributesImplApi21Parcelizer + 77;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 4;
                    return;
                }
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
        this.write = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $11 + 125;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer[i2 / i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getSize(0) + 36621), ((byte) KeyEvent.getModifierMetaStateMask()) + 2341, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 9701 - View.resolveSize(0, 0), 25 - TextUtils.lastIndexOf("", '0', 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.lastIndexOf("", '0', 0, 0) + 23785, TextUtils.lastIndexOf("", '0') + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36621 - View.resolveSize(0, 0)), 2340 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 27 - ExpandableListView.getPackedPositionChild(0L), 480654850, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplBaseParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), Color.rgb(0, 0, 0) + 16786917, Gravity.getAbsoluteGravity(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.green(0) + 23784, 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i7 = $11 + 57;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 23785 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                int i8 = 63 / 0;
            } else {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr9 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23784, View.MeasureSpec.getMode(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
            }
        }
        String str = new String(cArr);
        int i9 = $10 + 25;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IconCompatParcelizer;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 31;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43694), (ViewConfiguration.getPressedStateDuration() >> 16) + 23297, TextUtils.getOffsetBefore("", 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43695), 23297 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i3 = 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IconCompatParcelizer;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 59;
                $10 = i14 % 128;
                if (i14 % i11 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i13]);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - KeyEvent.normalizeMetaState(i5)), 23296 - ((byte) KeyEvent.getModifierMetaStateMask()), '?' - AndroidCharacter.getMirror('0'), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - Drawable.resolveOpacity(0, 0)), ImageFormat.getBitsPerPixel(0) + 23298, (KeyEvent.getMaxKeyCode() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    i13++;
                }
                i11 = 2;
                i5 = 0;
            }
            int i15 = $11 + 91;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        int i17 = $10 + 53;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                int i21 = $11 + 63;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i19];
                Object[] objArr6 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (43695 - TextUtils.indexOf("", "", 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23296, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i19++;
            }
            int i23 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i23;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i24 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i25 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr7 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer6 == null) {
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 48194), TextUtils.getTrimmedLength("") + 20126, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bc  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concat.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getsubjectstat = this.write;
            int i3 = 17 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.write;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = AudioAttributesImplApi21Parcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 63;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 3;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi21Parcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.read) {
            this.read = true;
        }
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new int[]{1262333594, -250565269, -1698327426, 2117429369, 813441166, 1750178072, 1058882394, -2095293560, -729392404, 866369956, 740225191, -760502390, -1516791177, -2011715274}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new int[]{-992266691, 1702982199, 1829314978, -69000013, -1079859031, 52499409, 1400177860, -2110007260, -329076808, 2107472373}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 27;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 39;
                AudioAttributesImplApi21Parcelizer = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 6054, TextUtils.getCapsMode("", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 22, new int[]{1262333594, -250565269, -1698327426, 2117429369, 813441166, 1750178072, 1058882394, -2095293560, -729392404, 866369956, 740225191, -760502390, -1516791177, -2011715274}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(18 - TextUtils.getTrimmedLength(""), new int[]{-992266691, 1702982199, 1829314978, -69000013, -1079859031, 52499409, 1400177860, -2110007260, -329076808, 2107472373}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = AudioAttributesImplApi21Parcelizer + 45;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 55;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getMode(0) + 6054, 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6030, 23 - MotionEvent.axisFromString(""), -861814097, false, "read", new Class[]{Context.class});
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
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:(2:7|(2:9|(1:13)(1:12))(0))(1:14)|(9:16|282|17|(1:19)|20|21|22|(1:24)|25))|29|(24:(9:269|30|(1:32)|33|(3:35|(1:37)|38)(19:39|40|276|41|(1:43)|44|45|267|46|(1:48)|49|50|51|(1:53)|54|(1:56)|57|(1:59)|60)|61|(4:64|(13:284|66|(3:68|(4:71|72|73|69)|289)|74|272|75|(1:77)|78|79|80|265|81|288)(1:287)|286|62)|285|94)|(16:121|(3:123|(3:125|128|(2:130|(1:132)(1:133))(2:134|135))|136)(2:126|(2:128|(0)(0))(1:136))|170|(1:172)|173|(3:175|(1:177)|178)(13:180|258|181|182|(1:184)|185|270|186|187|(1:189)|190|(1:192)|193)|179|194|(6:196|197|(1:199)|200|201|202)|203|(1:205)|206|(3:208|(1:210)|211)(14:213|214|(1:216)|217|218|(1:220)|221|262|222|223|(1:225)|226|(1:228)|229)|212|230|(7:232|233|(1:235)|236|237|238|239)(1:290))|280|138|(1:140)|141|274|142|(1:144)|145|170|(0)|173|(0)(0)|179|194|(0)|203|(0)|206|(0)(0)|212|230|(0)(0))|95|264|137|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0ac8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0ac9, code lost:
    
        r9 = new java.lang.Object[1];
        a(10 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), new int[]{2050227407, 1343395593, 754273482, -1371339723, 847271591, 1766049148}, r9);
        r4 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0ae3, code lost:
    
        r5 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r5);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r5.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0afa, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0afe, code lost:
    
        r5 = new java.util.ArrayList(2);
        r5.add(r1);
        r5.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b0d, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b11, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b13, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 4536), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 6054, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0b44, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b50, code lost:
    
        r8 = new java.lang.Object[]{-638395325, 81604378625L, r5, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r4 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.view.Gravity.getAbsoluteGravity(0, 0), 6030 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24);
        r5 = (byte) (kotlin.concat.$$h & 248);
        r6 = kotlin.concat.$$g;
        r12 = new java.lang.Object[1];
        d(r5, r6[8], r6[3], r12);
        r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09c5 A[Catch: all -> 0x0ac8, TRY_ENTER, TryCatch #3 {all -> 0x0ac8, blocks: (B:123:0x09ae, B:130:0x09c5, B:134:0x09d1, B:135:0x09da, B:136:0x09db, B:126:0x09b7, B:149:0x0ab6, B:151:0x0abc, B:152:0x0abd, B:154:0x0abf, B:156:0x0ac6, B:157:0x0ac7, B:142:0x0a2f, B:144:0x0a3c, B:145:0x0aac, B:138:0x09e0, B:140:0x09f5, B:141:0x0a29), top: B:264:0x09a0, outer: #6, inners: #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x09d1 A[Catch: all -> 0x0ac8, TryCatch #3 {all -> 0x0ac8, blocks: (B:123:0x09ae, B:130:0x09c5, B:134:0x09d1, B:135:0x09da, B:136:0x09db, B:126:0x09b7, B:149:0x0ab6, B:151:0x0abc, B:152:0x0abd, B:154:0x0abf, B:156:0x0ac6, B:157:0x0ac7, B:142:0x0a2f, B:144:0x0a3c, B:145:0x0aac, B:138:0x09e0, B:140:0x09f5, B:141:0x0a29), top: B:264:0x09a0, outer: #6, inners: #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x09f5 A[Catch: all -> 0x0abe, TryCatch #12 {all -> 0x0abe, blocks: (B:138:0x09e0, B:140:0x09f5, B:141:0x0a29), top: B:280:0x09e0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a3c A[Catch: all -> 0x0ab4, TryCatch #9 {all -> 0x0ab4, blocks: (B:142:0x0a2f, B:144:0x0a3c, B:145:0x0aac), top: B:274:0x0a2f, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0f39  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x101f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1071  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x10c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x13b7  */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concat.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
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
