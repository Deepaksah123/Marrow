package kotlin;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getProfession implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_CONTIG, -94, -3, -122, -8, 1, 8};
    private static final int $$b = 47;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r8 = 114 - r8
            byte[] r0 = kotlin.getProfession.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r5 = r2
            r8 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getProfession.a(short, byte, int, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(965588766);
            if (objRemoteActionCompatParcelizer == null) {
                char cNormalizeMetaState = (char) (63098 - KeyEvent.normalizeMetaState(0));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 24580;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 20;
                byte b = $$a[5];
                byte b2 = (byte) (b - 1);
                byte b3 = (byte) (-b);
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cNormalizeMetaState, pressedStateDuration, packedPositionType, 1204056971, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - View.resolveSizeAndState(0, 0, 0)), 24581 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 20)});
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
