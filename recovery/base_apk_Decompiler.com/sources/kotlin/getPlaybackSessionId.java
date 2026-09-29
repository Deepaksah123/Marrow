package kotlin;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getPlaybackSessionId implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {31, 80, -124, -66, TarConstants.LF_LINK, -20, 2, 3, -49, TarConstants.LF_NORMAL, -3, -5, -12, -10, 16, -4, -18, 11, -45, 33, 0, -7, -45, 28, 15, -17, -24, 14, 14, -18, -1, 4, -6, 14, -24, 10};
    private static final int $$b = 32;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 65 - r6
            int r8 = r8 * 4
            int r8 = r8 + 33
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = kotlin.getPlaybackSessionId.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
        L2b:
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPlaybackSessionId.a(int, byte, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {(Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1187249289);
            if (objRemoteActionCompatParcelizer == null) {
                char cLastIndexOf = (char) (63097 - TextUtils.lastIndexOf("", '0'));
                int i = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24579;
                int maximumDrawingCacheSize = 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b = $$a[20];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, i, maximumDrawingCacheSize, 948582428, false, (String) objArr2[0], new Class[]{Throwable.class});
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
