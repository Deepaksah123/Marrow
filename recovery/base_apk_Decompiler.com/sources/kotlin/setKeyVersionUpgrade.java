package kotlin;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setKeyVersionUpgrade implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {14, -40, -35, 110, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$b = 233;
    private /* synthetic */ getCurrentEventTimeUs write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r0 = 31 - r7
            int r6 = r6 * 4
            int r6 = 65 - r6
            byte[] r1 = kotlin.setKeyVersionUpgrade.$$a
            byte[] r0 = new byte[r0]
            int r7 = 30 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + 2
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setKeyVersionUpgrade.a(int, short, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(247718023);
            if (objRemoteActionCompatParcelizer == null) {
                char c = (char) (63097 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24581;
                int mirror = AndroidCharacter.getMirror('0') - 28;
                byte b = $$a[28];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c, iIndexOf, mirror, 1888101394, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 24580 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 21), (Class) startForeground.IconCompatParcelizer((char) (50069 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24309, 11 - TextUtils.indexOf("", ""))});
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
