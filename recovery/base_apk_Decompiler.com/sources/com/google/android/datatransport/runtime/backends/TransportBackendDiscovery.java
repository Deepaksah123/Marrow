package com.google.android.datatransport.runtime.backends;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.DownloadService;
import kotlin.buildSetStopReasonIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class TransportBackendDiscovery extends Service {
    private static final byte[] $$c = {18, -64, -35, -97};
    private static final int $$f = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {16, 77, -78, 14, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11};
    private static final int $$e = 107;
    private static final byte[] $$a = {10, -79, -66, -51, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 98;
    private static int RemoteActionCompatParcelizer = 0;
    private static int IconCompatParcelizer = 1;
    private static char[] AudioAttributesCompatParcelizer = {17658, 24450, 29201, 5772, 10536, 52641, 57397, 34036, 40780, 46023, 22035, 27350, 3453, 8703, 50298, 57095, 62360, 38415, 37200, 35379, 42886, 49969, 64645, 56420, 50959, 60054, 36377, 45475, 21861, 30953, 7266, 2000, 11074, 52931, 62077, 38369, 47477, 23777, 18304, 27410, 3727, 12833, 54775, 63796, 40103, 32836, 43992, 20293, 29415, 5753, 14816, 56699, 49155, 60368, 36610, 45721, 22074, 31152, 7469, 195, 9294, 53203, 62284, 38630, 47718, 23972, 16530, 25623, 3978, 13121, 54964, 64044, 40354, 33053, 42192, 18510, 29640, 6003, 15086, 56944, 49500, 58508, 34899, 46023, 22322, 31400, 7712, 418, 9551, 51409, 43397, 45817, 40823, 64491, 50205, 8400, 3396, 27072, 29232, 24302, 47898, 34699, 57352, 52368, 10504, 12923, 16111, 9617, 2053, 27807, 21285, 47036, 39460, 65177, 58711, 51652, 11328, 4323, 30583, 23532, 48749};
    private static long read = -1022373763966974085L;
    private static char[] write = {45049, 44910, 44915, 44913, 44912, 44698, 44698, 44699, 44913, 44904, 44915, 44914, 44885, 44885, 44906, 44914, 44914, 44913, 44919, 44908, 44919, 44697, 44912, 44885, 44925, 44696, 44914, 44906, 44912, 44697, 44697, 44919, 44910, 44904, 44905, 44915, 44677, 44698, 44699, 44696, 44915, 44906, 44912, 44696, 44697, 44919, 44908, 44910, 44947, 44998, 44998, 44992, 44993, 44984, 44986, 44987, 44990, 44978, 44990, 44986, 44987, 44995, 44999, 44988, 44988, 44989, 44989, 44999, 45033, 45033, 44993, 44999, 44992, 44986, 44995, 45033, 44999, 44988, 44991, 44988, 44998, 44998, 44985, 44995, 45033, 44995, 44985, 44991, 44998, 44999, 44998, 45038, 45039, 44997, 44988, 44990, 44988, 44991, 44986, 44984, 44989, 44990, 44992, 44992, 44993, 45039, 45038, 45033, 44998, 44989, 44990, 44987, 44944, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45032, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44985, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44990, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 44993, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44992, 44995, 44947, 44986, 44987, 44984, 44965, 44985, 45049, 44908, 44913, 44915, 44913, 44702, 44702, 44916, 44910, 44915, 44918, 44916, 44915, 44884, 44907, 44912, 44919, 44905, 44904, 44911, 44911, 44911, 44906, 44915, 44917, 44917, 44917, 44904, 44885, 44907, 44907, 44910, 44908, 44918, 44915, 44907, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 44988, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45036, 45037, 45027, 45031, 45021, 45040, 44914, 44918, 44912, 44915, 44913, 44918, 44913, 44913, 44912, 44914, 45038, 44864, 44864, 44867, 44864, 44870, 44868, 44868, 44865, 44864, 44871};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, int r8, int r9) {
        /*
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$c
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r7 = r7 * 4
            int r7 = r7 + 101
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$a
            int r7 = 114 - r7
            int r1 = 44 - r5
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = 43 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 119 - r7
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$d
            int r1 = r6 + 5
            int r5 = 69 - r5
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.d(short, int, short, java.lang.Object[]):void");
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $11 + 33;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36622 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 2340 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, 480654850, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(read), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9701, View.resolveSize(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 23784 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 23784, ExpandableListView.getPackedPositionGroup(0L) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i9 = $10 + 19;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = write;
        if (cArr != null) {
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - MotionEvent.axisFromString("")), 11613 - (Process.myPid() >> 22), 20 - TextUtils.indexOf("", "", 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 7;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.keyCodeFromString(""), (Process.myPid() >> 22) + 22959, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - View.resolveSize(0, 0)), 9863 - (ViewConfiguration.getFadingEdgeLength() >> 16), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37822), 9753 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i14 = $11 + 59;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i16 = $10 + 39;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08f0 A[Catch: all -> 0x09b5, TryCatch #9 {all -> 0x09b5, blocks: (B:137:0x08db, B:139:0x08f0, B:140:0x0925), top: B:271:0x08db, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0938 A[Catch: all -> 0x09ab, TryCatch #5 {all -> 0x09ab, blocks: (B:141:0x092b, B:143:0x0938, B:144:0x09a3), top: B:265:0x092b, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0e10  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0efb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x124f  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06b2 A[Catch: all -> 0x076d, TryCatch #7 {all -> 0x076d, blocks: (B:79:0x06ac, B:81:0x06b2, B:82:0x06dc), top: B:269:0x06ac, outer: #8 }] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
