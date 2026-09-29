package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setDefaultCourseId implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {112, -82, -21, -22, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$b = 70;
    private /* synthetic */ getCurrentEventTimeUs read;

    private static void a(byte b, byte b2, byte b3, Object[] objArr) {
        int i = 4 - (b * 3);
        int i2 = b2 * 2;
        byte[] bArr = $$a;
        int i3 = 65 - (b3 * 2);
        byte[] bArr2 = new byte[i2 + 31];
        int i4 = i2 + 30;
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3) + 2;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + (-bArr[i]) + 2;
            i++;
            i5 = i6;
        }
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.read, (Boolean) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(381925887);
            if (objRemoteActionCompatParcelizer == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 63098);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 24580;
                int iBlue = 20 - Color.blue(0);
                byte b = $$a[28];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(defaultSize, absoluteGravity, iBlue, 1753906538, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - MotionEvent.axisFromString("")), MotionEvent.axisFromString("") + 24581, 20 - TextUtils.getCapsMode("", 0, 0)), Boolean.class});
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
