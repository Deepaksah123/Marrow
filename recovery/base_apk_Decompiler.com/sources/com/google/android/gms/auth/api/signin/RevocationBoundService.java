package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.buildSetStopReasonIntent;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class RevocationBoundService extends Service {
    private static final byte[] $$c = {TarConstants.LF_BLK, -62, -101, -125};
    private static final int $$f = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, -59, 22, 74, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, TarConstants.LF_FIFO, -68, -9, -26, 21, -38, -16, 8, -22, 31, -62, 4, -11, -10, -24, 2, -10, 21, -60, -8, 6, -30, 0, -17, -10, 14, -41, 68, -40, -63, 6, -16, -17, 35, -62, -11, -9, -2, -4, -30, -10, 4, -25, 37, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 2, -7, -14};
    private static final int $$e = 105;
    private static final byte[] $$a = {10, -58, 112, 6, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 65;
    private static int IconCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char[] AudioAttributesCompatParcelizer = {44831, 44705, 44718, 44694, 44715, 44706, 44691, 44925, 44674, 44707, 44684, 44683, 44692, 44718, 44706, 44713, 44715, 44693, 44988, 45049, 45037, 45013, 45036, 44814, 44920, 44882, 44923, 44672, 44675, 44674, 44685, 44923, 44881, 44880, 44886, 44927, 44673, 44673, 44920, 44882, 44922, 44672, 44901, 44893, 44920, 44673, 44927, 44884, 44927, 44921, 44922, 44922, 44882, 44893, 44893, 44922, 44923, 44880, 44921, 44675, 44674, 44674, 44920, 44921, 44923, 44886, 44887, 44886, 44884, 44927, 44673, 45032, 44873, 44872, 44872, 44882, 44893, 44893, 44895, 44892, 44893, 44874, 44853, 44895, 44901, 44923, 44882, 44893, 44894, 44855, 44892, 44895, 44892, 44893, 44855, 44893, 44882, 44882, 44901, 44901, 44880, 44882, 44892, 44872, 44874, 44853, 44874, 44872, 44880, 44922, 44881, 44875, 44852, 44852, 44855, 44855, 44895, 44903, 44882, 44880, 44922, 44900, 44882, 44874, 44853, 44882, 44922, 44880, 44883, 44892, 44855, 44892, 44900, 44895, 44895, 44947, 44986, 44987, 44984, 44965, 44985, 44944, 44990, 44998, 44997, 44979, 44989, 44990, 44990, 44984, 44991, 45016, 45016, 45016, 44998, 44985, 44978, 44978, 44978, 44991, 44988, 45018, 44999, 44990, 44987, 44998, 45019, 44997, 44998, 44989, 45019, 45037, 45037, 44996, 44998, 44996, 44979, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027, 45053, 44888, 44866, 44900, 44916, 44913, 44926, 44923, 44921, 44903, 44921, 44921, 44869, 44895, 44900, 44901};
    private static long RemoteActionCompatParcelizer = -3498762522182953692L;
    private static int write = -136981212;
    private static char read = 52254;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, byte r8, byte r9) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.signin.RevocationBoundService.$$c
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r8 = r8 * 2
            int r8 = r8 + 103
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.RevocationBoundService.$$g(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            int r0 = 44 - r7
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.auth.api.signin.RevocationBoundService.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.RevocationBoundService.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 82
            byte[] r0 = com.google.android.gms.auth.api.signin.RevocationBoundService.$$d
            int r6 = r6 * 8
            int r1 = r6 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.RevocationBoundService.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(r5.getAction()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r5.getAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(r5.getAction()) == false) goto L11;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = "com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect"
            java.lang.String r2 = r5.getAction()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L3a
            int r1 = com.google.android.gms.auth.api.signin.RevocationBoundService.IconCompatParcelizer
            int r1 = r1 + 47
            int r3 = r1 % 128
            com.google.android.gms.auth.api.signin.RevocationBoundService.AudioAttributesImplBaseParcelizer = r3
            int r1 = r1 % r0
            java.lang.String r3 = "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState"
            if (r1 != 0) goto L2c
            java.lang.String r1 = r5.getAction()
            boolean r1 = r3.equals(r1)
            r3 = 60
            int r3 = r3 / 0
            if (r1 != 0) goto L3a
            goto L36
        L2c:
            java.lang.String r1 = r5.getAction()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3a
        L36:
            r5.getAction()
            return r2
        L3a:
            java.lang.String r1 = "RevocationService"
            boolean r1 = android.util.Log.isLoggable(r1, r0)
            if (r1 == 0) goto L55
            int r1 = com.google.android.gms.auth.api.signin.RevocationBoundService.AudioAttributesImplBaseParcelizer
            int r1 = r1 + 51
            int r3 = r1 % 128
            com.google.android.gms.auth.api.signin.RevocationBoundService.IconCompatParcelizer = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L51
            r5.getAction()
            goto L55
        L51:
            r5.getAction()
            throw r2
        L55:
            com.google.android.gms.auth.api.signin.internal.zbt r5 = new com.google.android.gms.auth.api.signin.internal.zbt
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.RevocationBoundService.onBind(android.content.Intent):android.os.IBinder");
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) + 22749, 36 - View.resolveSize(0, 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.getDefaultSize(0, 0) + 2721, Gravity.getAbsoluteGravity(0, 0) + 38, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 15713 - (ViewConfiguration.getJumpTapTimeout() >> 16), 64 - Color.blue(0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 40977), 6123 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 29 - Drawable.resolveOpacity(0, 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) read) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        char c = '0';
        if (cArr != null) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", c, 0, 0) + 11614, 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i9++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 93;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i12 = $10 + 17;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22959, TextUtils.lastIndexOf("", '0', 0, 0) + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 31589), 9863 - TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37822), 9754 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 'K' - AndroidCharacter.getMirror('0'), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i16 = $10 + 29;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 % i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i17 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i17, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i17);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i18 = $11 + 53;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] + iArr[4]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.RevocationBoundService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = AudioAttributesImplBaseParcelizer + 107;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }
}
