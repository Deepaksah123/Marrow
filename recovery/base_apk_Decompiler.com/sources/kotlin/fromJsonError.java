package kotlin;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fromJsonError implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = TarConstants.CHKSUM_OFFSET;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.fromJsonError.$$a
            int r5 = r5 * 4
            int r5 = r5 + 20
            int r6 = r6 * 2
            int r6 = r6 + 73
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromJsonError.a(short, short, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer, (LearnMoreResponseCompanion) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(318353753);
            if (objRemoteActionCompatParcelizer == null) {
                char cNormalizeMetaState = (char) (63098 - KeyEvent.normalizeMetaState(0));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 24580;
                int defaultSize = 20 - View.getDefaultSize(0, 0);
                byte b = (byte) ($$a[6] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cNormalizeMetaState, touchSlop, defaultSize, 1823503820, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - MotionEvent.axisFromString("")), Color.red(0) + 24580, (ViewConfiguration.getTouchSlop() >> 8) + 20), LearnMoreResponseCompanion.class});
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
