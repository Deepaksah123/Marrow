package com.google.android.gms.common;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.notifyDownloadRemoved;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class GoogleSourceStampsResult {
    private static final byte[] $$c = {38, -16, -7, 121};
    private static final int $$f = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {26, 47, -113, 59, -19, -10, -3, -8, 9, 20, -6, 5};
    private static final int $$e = 132;
    private static final byte[] $$a = {16, -101, -28, -55, 11, -19, 23, TarConstants.LF_DIR, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1, 1, 21, -15, 0};
    private static final int $$b = 72;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static long RemoteActionCompatParcelizer = 7534215694370467041L;
    private static int write = -136981212;
    private static char AudioAttributesCompatParcelizer = 54564;
    private static char[] read = {28335, 28318, 28307, 28316, 28313, 28330, 28304, 28371, 28305, 28317, 28333, 28306, 28315, 28314, 28332, 28326, 28319, 28312, 28309, 28398, 28288, 28308, 28310, 28331, 28370, 28396, 28328, 28327, 28368, 28329};
    private static int IconCompatParcelizer = 411397921;
    private static boolean AudioAttributesImplApi21Parcelizer = true;
    private static boolean AudioAttributesImplApi26Parcelizer = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r0 = com.google.android.gms.common.GoogleSourceStampsResult.$$c
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSourceStampsResult.$$g(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 3
            int r8 = 8 - r8
            int r7 = 114 - r7
            byte[] r1 = com.google.android.gms.common.GoogleSourceStampsResult.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 2
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2e
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r7
            r7 = r5
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + 6
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSourceStampsResult.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.GoogleSourceStampsResult.$$a
            int r7 = r7 * 9
            int r7 = 115 - r7
            int r6 = r6 * 11
            int r6 = 16 - r6
            int r8 = r8 * 15
            int r8 = 19 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + 2
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSourceStampsResult.d(int, byte, int, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 77;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 22748 - ExpandableListView.getPackedPositionGroup(0L), 36 - Color.blue(0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 31370), TextUtils.lastIndexOf("", '0', 0, 0) + 2722, TextUtils.indexOf((CharSequence) "", '0', 0) + 39, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), 15712 - Process.getGidForName(""), 65 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40977), ExpandableListView.getPackedPositionChild(0L) + 6123, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) ((((long) ((int) (((long) write) ^ (-3498762522182953692L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L)))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i5 = $10 + 23;
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
        objArr[0] = new String(cArr6);
    }

    private static void c(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = read;
        if (cArr3 != null) {
            int i3 = $10 + 115;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 31;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18943, 28 - Drawable.resolveOpacity(0, 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19032, View.combineMeasuredStates(0, 0) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (AudioAttributesImplApi26Parcelizer) {
                int i7 = $11 + 61;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 11439 - Color.red(0), TextUtils.getOffsetBefore("", 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                String str = new String(cArr4);
                int i9 = $10 + 81;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str;
                return;
            }
            if (!AudioAttributesImplApi21Parcelizer) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i10 = $11 + 95;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 11439 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - KeyEvent.keyCodeFromString(""), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x2810, code lost:
    
        r7 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x2813, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x2ad9, code lost:
    
        r3 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x2adc, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0a1e A[PHI: r30
      0x0a1e: PHI (r30v37 java.lang.String) = (r30v36 java.lang.String), (r30v38 java.lang.String) binds: [B:101:0x0a1c, B:93:0x098b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x15c5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x170a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x2012 A[Catch: Exception -> 0x2172, TRY_LEAVE, TryCatch #8 {Exception -> 0x2172, blocks: (B:232:0x1f6b, B:239:0x1fe2, B:241:0x2001, B:243:0x200a, B:247:0x2012, B:253:0x2082, B:255:0x20bb, B:258:0x20c3, B:264:0x214b, B:266:0x2151, B:268:0x2155, B:270:0x215c, B:271:0x215d, B:273:0x215f, B:275:0x2166, B:276:0x2167, B:278:0x2169, B:280:0x2170, B:281:0x2171, B:233:0x1f8c, B:235:0x1f99, B:236:0x1fd6, B:259:0x20f2, B:261:0x20ff, B:262:0x2140, B:248:0x202f, B:250:0x203c, B:251:0x2079), top: B:565:0x1f6b, inners: #4, #20, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x2172  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2771  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x2845  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x290b  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x2add A[EXC_TOP_SPLITTER, PHI: r2
      0x2add: PHI (r2v210 java.io.BufferedInputStream) = (r2v209 java.io.BufferedInputStream), (r2v512 java.io.BufferedInputStream) binds: [B:428:0x2aef, B:402:0x2a94] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04f5 A[PHI: r26 r36
      0x04f5: PHI (r26v25 long) = (r26v23 long), (r26v23 long), (r26v26 long) binds: [B:73:0x071f, B:65:0x0612, B:54:0x04f2] A[DONT_GENERATE, DONT_INLINE]
      0x04f5: PHI (r36v53 int) = (r36v51 int), (r36v51 int), (r36v55 int) binds: [B:73:0x071f, B:65:0x0612, B:54:0x04f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x29f6 A[EXC_TOP_SPLITTER, PHI: r10
      0x29f6: PHI (r10v149 java.io.BufferedInputStream) = (r10v148 java.io.BufferedInputStream), (r10v150 java.io.BufferedInputStream) binds: [B:393:0x2a08, B:368:0x298c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x098f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] RemoteActionCompatParcelizer$26bbf440(java.lang.Object r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 16622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSourceStampsResult.RemoteActionCompatParcelizer$26bbf440(java.lang.Object):java.lang.Object[]");
    }
}
