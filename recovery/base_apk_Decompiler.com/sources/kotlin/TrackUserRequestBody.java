package kotlin;

import android.graphics.Color;
import android.view.Gravity;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.video.ThemeState;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TrackUserRequestBody implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -51, -30, -2, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$b = 34;
    private /* synthetic */ ThemeState read;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = kotlin.TrackUserRequestBody.$$a
            int r8 = r8 * 4
            int r8 = r8 + 65
            int r6 = r6 * 4
            int r1 = r6 + 31
            byte[] r1 = new byte[r1]
            int r6 = r6 + 30
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + 2
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TrackUserRequestBody.a(short, int, byte, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.read, (LessonIndex) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-917857630);
            if (objRemoteActionCompatParcelizer == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 63098);
                int iGreen = 24580 - Color.green(0);
                int iRgb = (-16777196) - Color.rgb(0, 0, 0);
                byte b = $$a[28];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(absoluteGravity, iGreen, iRgb, -1224516041, false, (String) objArr2[0], new Class[]{ThemeState.class, LessonIndex.class});
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
