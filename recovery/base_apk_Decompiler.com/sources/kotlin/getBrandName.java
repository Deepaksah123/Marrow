package kotlin;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getBrandName implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {111, -63, 80, 27, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 152;
    private /* synthetic */ getCurrentEventTimeUs read;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getBrandName.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 73 - r7
            int r8 = r8 * 3
            int r1 = 20 - r8
            byte[] r1 = new byte[r1]
            int r8 = 19 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBrandName.a(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.read};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(499414154);
            if (objRemoteActionCompatParcelizer == null) {
                char offsetBefore = (char) (63098 - TextUtils.getOffsetBefore("", 0));
                int i = 24581 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int size = 20 - View.MeasureSpec.getSize(0);
                byte b = (byte) ($$a[6] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(offsetBefore, i, size, 1670230047, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63097), 24580 - (Process.myTid() >> 22), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20)});
            }
            return ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
