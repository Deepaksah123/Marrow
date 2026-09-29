package kotlin;

import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getSpecialty implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {121, 72, 116, 113, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 217;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = 34 - r6
            int r7 = r7 * 2
            int r7 = 65 - r7
            byte[] r1 = kotlin.getSpecialty.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = 33 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSpecialty.a(int, int, short, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-67398279);
            if (objRemoteActionCompatParcelizer == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 63099);
                int iCombineMeasuredStates = 24580 - View.combineMeasuredStates(0, 0);
                int size = 20 - View.MeasureSpec.getSize(0);
                byte b = $$a[15];
                Object[] objArr2 = new Object[1];
                a(b, b, r5[10], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(modifierMetaStateMask, iCombineMeasuredStates, size, -2051911188, false, (String) objArr2[0], new Class[]{Throwable.class});
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
