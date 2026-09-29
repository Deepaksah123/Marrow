package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getProfilePic implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_CHR, -90, -19, 114, 8, -1, -8};
    private static final int $$b = 61;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r0 = 4 - r5
            byte[] r1 = kotlin.getProfilePic.$$a
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 114
            byte[] r0 = new byte[r0]
            int r5 = 3 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getProfilePic.a(short, int, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Integer) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-364650252);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 63099);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 24580;
                int iAlpha = Color.alpha(0) + 20;
                byte b = $$a[5];
                byte b2 = (byte) (b + 1);
                byte b3 = b;
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, longPressTimeout, iAlpha, -1811274655, false, (String) objArr2[0], new Class[]{Integer.class});
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
