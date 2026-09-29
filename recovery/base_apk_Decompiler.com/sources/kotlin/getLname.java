package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getLname implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 70;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 73
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = kotlin.getLname.$$a
            int r8 = r8 * 4
            int r1 = r8 + 20
            byte[] r1 = new byte[r1]
            int r8 = r8 + 19
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2f:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLname.a(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1325390121);
            if (objRemoteActionCompatParcelizer == null) {
                char cBlue = (char) (Color.blue(0) + 63098);
                int scrollBarSize = 24580 - (ViewConfiguration.getScrollBarSize() >> 8);
                int size = View.MeasureSpec.getSize(0) + 20;
                byte b = (byte) ($$a[6] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cBlue, scrollBarSize, size, 817241532, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63098), 24580 - TextUtils.getCapsMode("", 0, 0), 19 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Throwable.class});
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
