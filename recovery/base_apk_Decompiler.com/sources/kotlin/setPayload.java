package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class setPayload extends _isNegInf {
    private static final byte[] $$a = {18, -4, -80, 95};
    private static final int $$b = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static long read = -3498762522182953692L;
    private static int write = -136981212;
    private static char AudioAttributesCompatParcelizer = 39356;
    private static char[] IconCompatParcelizer = {6425, 6407, 6424, 6481, 6464, 6402, 6428, 6524, 6410, 6430, 6431, 6426, 6406, 6400, 6494, 6490, 6475, 6470, 6474, 6488, 6465, 6477, 6416, 6473, 6429, 6478, 6427, 6471, 6403, 6405, 6492, 6476, 6417, 6401, 6404, 6505};
    private static char RemoteActionCompatParcelizer = 11444;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.setPayload.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 * 4
            int r8 = 103 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2c:
            int r6 = r6 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPayload.$$c(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0097  */
    @Override // kotlin._isNegInf, android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPayload.onCreate():boolean");
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
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
        int i3 = $11 + 125;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22748, 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - ImageFormat.getBitsPerPixel(0)), (Process.myPid() >> 22) + 2721, ((Process.getThreadPriority(0) + 20) >> 6) + 38, 1895162189, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0) + 15713, TextUtils.indexOf("", "", 0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    c2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), AndroidCharacter.getMirror('0') + 6074, 29 - Color.blue(0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i7 = $11 + 117;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r32, int r33, char[] r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPayload.b(byte, int, char[], java.lang.Object[]):void");
    }
}
