package kotlin;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getOsVariant implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$b = 204;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.getOsVariant.$$a
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r7 = r7 + 65
            int r8 = r8 * 4
            int r8 = 31 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r7 = r7 + r9
            int r7 = r7 + 2
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOsVariant.a(byte, short, short, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Boolean) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-533661792);
            if (objRemoteActionCompatParcelizer == null) {
                char longPressTimeout = (char) (63098 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24581;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 20;
                byte[] bArr = $$a;
                byte b = bArr[28];
                Object[] objArr2 = new Object[1];
                a(b, b, (byte) (-bArr[21]), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(longPressTimeout, modifierMetaStateMask, iMakeMeasureSpec, -1636224203, false, (String) objArr2[0], new Class[]{Boolean.class});
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
