package kotlin;

import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getReadableErrorMessage implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {3, 110, -29, 16, -8, 1, 8};
    private static final int $$b = 37;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 114
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 + 4
            byte[] r0 = kotlin.getReadableErrorMessage.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadableErrorMessage.a(int, int, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Boolean) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1201322334);
            if (objRemoteActionCompatParcelizer == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 63098);
                int iResolveSizeAndState = 24580 - View.resolveSizeAndState(0, 0, 0);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 20;
                byte b = (byte) (-$$a[5]);
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cResolveSize, iResolveSizeAndState, iIndexOf, 970161611, false, (String) objArr2[0], new Class[]{Boolean.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
