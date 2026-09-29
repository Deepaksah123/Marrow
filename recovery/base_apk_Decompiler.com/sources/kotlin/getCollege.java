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
public final /* synthetic */ class getCollege implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {111, -119, 57, 106, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 97;
    private /* synthetic */ getCurrentEventTimeUs write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r0 = kotlin.getCollege.$$a
            int r7 = r7 * 3
            int r1 = 34 - r7
            int r6 = r6 * 3
            int r6 = r6 + 65
            byte[] r1 = new byte[r1]
            int r7 = 33 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r5
            r6 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollege.a(short, int, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1882638616);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 63098);
                int iBlue = 24580 - Color.blue(0);
                int longPressTimeout = 20 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b = $$a[15];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iBlue, longPressTimeout, 243207565, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - View.getDefaultSize(0, 0)), 24579 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Throwable.class});
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
