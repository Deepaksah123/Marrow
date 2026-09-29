package kotlin;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.video.ThemeState;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getPrimaryContact implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {87, 74, -120, 12, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 18;
    private /* synthetic */ getCurrentEventTimeUs RemoteActionCompatParcelizer;
    private /* synthetic */ ThemeState read;

    public /* synthetic */ getPrimaryContact(getCurrentEventTimeUs getcurrenteventtimeus, ThemeState themeState) {
        this.RemoteActionCompatParcelizer = getcurrenteventtimeus;
        this.read = themeState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.getPrimaryContact.$$a
            int r7 = r7 * 3
            int r7 = 82 - r7
            int r6 = r6 * 2
            int r1 = 28 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPrimaryContact.a(int, short, short, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.RemoteActionCompatParcelizer, this.read};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2141079269);
            if (objRemoteActionCompatParcelizer == null) {
                char touchSlop = (char) (63098 - (ViewConfiguration.getTouchSlop() >> 8));
                int trimmedLength = TextUtils.getTrimmedLength("") + 24580;
                int i = 20 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                byte b = (byte) ($$a[14] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(touchSlop, trimmedLength, i, -30900850, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63146 - AndroidCharacter.getMirror('0')), 24579 - ExpandableListView.getPackedPositionChild(0L), 19 - ((byte) KeyEvent.getModifierMetaStateMask())), ThemeState.class});
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
