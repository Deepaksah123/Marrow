package kotlin;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getFname implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 232;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;
    private /* synthetic */ ResponseError IconCompatParcelizer;

    public /* synthetic */ getFname(getCurrentEventTimeUs getcurrenteventtimeus, ResponseError responseError) {
        this.AudioAttributesCompatParcelizer = getcurrenteventtimeus;
        this.IconCompatParcelizer = responseError;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.getFname.$$a
            int r6 = r6 * 4
            int r1 = 28 - r6
            int r7 = r7 * 2
            int r7 = 82 - r7
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
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
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFname.a(int, short, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, (Pair) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-876086615);
            if (objRemoteActionCompatParcelizer == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 63098);
                int mirror = AndroidCharacter.getMirror('0') + 24532;
                int size = View.MeasureSpec.getSize(0) + 20;
                byte b = $$a[14];
                byte b2 = (byte) (b - 1);
                Object[] objArr2 = new Object[1];
                a(b2, b2, (byte) (-b), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(trimmedLength, mirror, size, -1248969156, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63098), 24580 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21), ResponseError.class, Pair.class});
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
