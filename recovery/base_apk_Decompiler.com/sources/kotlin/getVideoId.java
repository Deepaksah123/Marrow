package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getVideoId implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {111, -119, 57, 106, -3, -7, 13, -13};
    private static final int $$b = 243;
    private /* synthetic */ getCurrentEventTimeUs write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = kotlin.getVideoId.$$a
            int r8 = r8 * 3
            int r8 = r8 + 5
            int r9 = r9 * 2
            int r9 = r9 + 119
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
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
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getVideoId.a(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-347285970);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollBarFadeDuration = (char) (63098 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iBlue = Color.blue(0) + 24580;
                int minimumFlingVelocity = 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollBarFadeDuration, iBlue, minimumFlingVelocity, -1794829637, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63099), TextUtils.indexOf("", "") + 24580, 20 - Drawable.resolveOpacity(0, 0)), Throwable.class});
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
