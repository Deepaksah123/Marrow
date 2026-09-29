package kotlin;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setLname implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {73, 111, 30, 98, 8, -1, -8};
    private static final int $$b = 185;
    private /* synthetic */ ResponseError AudioAttributesCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs read;

    public /* synthetic */ setLname(getCurrentEventTimeUs getcurrenteventtimeus, ResponseError responseError) {
        this.read = getcurrenteventtimeus;
        this.AudioAttributesCompatParcelizer = responseError;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setLname.$$a
            int r6 = r6 * 3
            int r1 = 4 - r6
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r6 = 3 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLname.a(byte, int, int, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.read, this.AudioAttributesCompatParcelizer, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1199973750);
            if (objRemoteActionCompatParcelizer == null) {
                char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 63097);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 24580;
                int iResolveOpacity = 20 - Drawable.resolveOpacity(0, 0);
                byte b = $$a[5];
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b2, b2, b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c, iNormalizeMetaState, iResolveOpacity, 969925091, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0) + 63099), 24580 - (ViewConfiguration.getEdgeSlop() >> 16), AndroidCharacter.getMirror('0') - 28), ResponseError.class, Throwable.class});
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
