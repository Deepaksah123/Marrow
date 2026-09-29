package kotlin;

import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getPlaybackStatus implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -57, 8, -14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 12;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = kotlin.getPlaybackStatus.$$a
            int r8 = r8 * 4
            int r8 = 65 - r8
            int r6 = r6 * 4
            int r1 = 34 - r6
            byte[] r1 = new byte[r1]
            int r6 = 33 - r6
            r2 = -1
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2f
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L2d:
            r4 = r0[r8]
        L2f:
            int r7 = r7 + r4
            int r7 = r7 + r2
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPlaybackStatus.a(short, byte, int, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1063058053);
            if (objRemoteActionCompatParcelizer == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63098);
                int i = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24579;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20;
                byte b = $$a[15];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c, i, maximumDrawingCacheSize, -1091911186, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (((Process.getThreadPriority(0) + 20) >> 6) + 63098), View.resolveSize(0, 0) + 24580, 20 - (ViewConfiguration.getJumpTapTimeout() >> 16))});
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
