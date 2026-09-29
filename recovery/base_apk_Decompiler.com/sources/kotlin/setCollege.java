package kotlin;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setCollege implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {32, -59, 22, 74, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$b = 43;
    private /* synthetic */ getCurrentEventTimeUs RemoteActionCompatParcelizer;
    private /* synthetic */ ResponseError read;

    public /* synthetic */ setCollege(getCurrentEventTimeUs getcurrenteventtimeus, ResponseError responseError) {
        this.RemoteActionCompatParcelizer = getcurrenteventtimeus;
        this.read = responseError;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = kotlin.setCollege.$$a
            int r6 = r6 * 4
            int r6 = r6 + 65
            int r7 = r7 * 3
            int r1 = 31 - r7
            byte[] r1 = new byte[r1]
            int r7 = 30 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L31
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L31:
            int r8 = r8 + r6
            int r8 = r8 + 2
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCollege.a(short, int, short, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.RemoteActionCompatParcelizer, this.read, (Boolean) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1825969760);
            if (objRemoteActionCompatParcelizer == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 63098);
                int iIndexOf = TextUtils.indexOf("", "") + 24580;
                int iAxisFromString = MotionEvent.axisFromString("") + 21;
                byte b = $$a[28];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(size, iIndexOf, iAxisFromString, -312464075, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 63097), KeyEvent.keyCodeFromString("") + 24580, 20 - (ViewConfiguration.getLongPressTimeout() >> 16)), ResponseError.class, Boolean.class});
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
