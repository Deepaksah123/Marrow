package kotlin;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setPrimaryContact implements getTimelineId {
    private static final byte[] $$a = {5, 107, -8, 109, -8, 1, 8};
    private static final int $$b = 252;
    private /* synthetic */ getCurrentEventTimeUs read;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = r7 + 114
            byte[] r0 = kotlin.setPrimaryContact.$$a
            int r6 = r6 * 2
            int r1 = 4 - r6
            byte[] r1 = new byte[r1]
            int r6 = 3 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r8 = r8 + r4
            int r8 = r8 + (-5)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPrimaryContact.a(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.getTimelineId
    public final void RemoteActionCompatParcelizer(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.read, (Long) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1422833611);
            if (objRemoteActionCompatParcelizer == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 63099);
                int i = 24581 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20;
                byte b = (byte) ($$a[5] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c, i, keyRepeatDelay, 713519966, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - Color.red(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24580, ((byte) KeyEvent.getModifierMetaStateMask()) + 21), Long.class});
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
