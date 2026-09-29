package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getDeviceId implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {34, 127, 65, -22, 24, -1, 5, -8, -31, TarConstants.LF_NORMAL, -3, 8, -4, -14, 13, -47, 44, -2, 3, -15, 19, -43, 43, -15, 8, -27, 19, -2, 2, 4, 13, -17, 13};
    private static final int $$b = PsExtractor.VIDEO_STREAM_MASK;
    private /* synthetic */ getCurrentEventTimeUs read;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r0 = 30 - r8
            byte[] r1 = kotlin.getDeviceId.$$a
            int r7 = r7 * 2
            int r7 = 77 - r7
            byte[] r0 = new byte[r0]
            int r8 = 29 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2e:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDeviceId.a(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.read};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-662189840);
            if (objRemoteActionCompatParcelizer == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 63099);
                int offsetBefore = 24580 - TextUtils.getOffsetBefore("", 0);
                int iIndexOf = 19 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b = (byte) ($$a[5] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cAxisFromString, offsetBefore, iIndexOf, -1496445851, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - Color.green(0)), TextUtils.indexOf("", "", 0) + 24580, 20 - TextUtils.getOffsetBefore("", 0))});
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
