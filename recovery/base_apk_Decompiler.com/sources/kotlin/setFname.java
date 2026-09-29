package kotlin;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setFname implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {124, -87, 60, -63, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 238;
    private /* synthetic */ getCurrentEventTimeUs read;
    private /* synthetic */ ResponseError write;

    public /* synthetic */ setFname(getCurrentEventTimeUs getcurrenteventtimeus, ResponseError responseError) {
        this.read = getcurrenteventtimeus;
        this.write = responseError;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setFname.$$a
            int r8 = r8 * 4
            int r8 = r8 + 82
            int r7 = r7 * 4
            int r1 = r7 + 28
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 27
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setFname.a(int, int, short, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.read, this.write, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(177694855);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 63099);
                int iAxisFromString = 24579 - MotionEvent.axisFromString("");
                int iLastIndexOf = 19 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b = (byte) ($$a[14] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iAxisFromString, iLastIndexOf, 1960750098, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63099 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 24579 - ((byte) KeyEvent.getModifierMetaStateMask()), 19 - TextUtils.lastIndexOf("", '0', 0, 0)), ResponseError.class, Throwable.class});
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
