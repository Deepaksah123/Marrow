package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setProfilePic implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_CHR, -23, 108, 101, -3, -7, 13, -13};
    private static final int $$b = 217;
    private /* synthetic */ getCurrentEventTimeUs IconCompatParcelizer;
    private /* synthetic */ Object read;

    public /* synthetic */ setProfilePic(getCurrentEventTimeUs getcurrenteventtimeus, Object obj) {
        this.IconCompatParcelizer = getcurrenteventtimeus;
        this.read = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = 5 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = kotlin.setProfilePic.$$a
            int r8 = r8 * 4
            int r8 = 119 - r8
            byte[] r0 = new byte[r0]
            int r6 = 4 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            int r8 = r8 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setProfilePic.a(short, short, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, this.read, obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1494695339);
            if (objRemoteActionCompatParcelizer == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 63098);
                int iResolveSize = View.resolveSize(0, 0) + 24580;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 21;
                byte b = (byte) 0;
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cMyTid, iResolveSize, iIndexOf, 660535614, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - ExpandableListView.getPackedPositionChild(0L)), 24580 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20), (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11905 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getScrollBarSize() >> 8)), (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", ""), 12117 - (Process.myPid() >> 22), 13 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))});
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
