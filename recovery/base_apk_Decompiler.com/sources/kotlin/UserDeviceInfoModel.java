package kotlin;

import android.graphics.PointF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class UserDeviceInfoModel implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {18, -127, -77, -105, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$b = TarConstants.CHKSUM_OFFSET;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 65
            int r5 = r5 * 4
            int r5 = 3 - r5
            int r7 = r7 * 4
            int r0 = r7 + 31
            byte[] r1 = kotlin.UserDeviceInfoModel.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 30
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r1[r5]
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UserDeviceInfoModel.a(short, byte, short, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-310068836);
            if (objRemoteActionCompatParcelizer == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63098);
                int i = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580;
                int scrollBarFadeDuration = 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b = $$a[28];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(keyRepeatDelay, i, scrollBarFadeDuration, -1815249655, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (View.resolveSize(0, 0) + 63098), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580, 20 - View.getDefaultSize(0, 0))});
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
