package kotlin;

import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class isResetDone implements getSubjectTitle {
    private static final byte[] $$a = {116, TarConstants.LF_GNUTYPE_SPARSE, -5, 59, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$b = 71;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.isResetDone.$$a
            int r8 = r8 * 4
            int r8 = r8 + 31
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = r6 + 65
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isResetDone.a(short, byte, short, java.lang.Object[]):void");
    }

    @Override // kotlin.getSubjectTitle
    public final Object apply(Object obj) throws Throwable {
        try {
            Object[] objArr = {(getClosedCaptionTrackFormats) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-506098803);
            if (objRemoteActionCompatParcelizer == null) {
                char defaultSize = (char) (63098 - View.getDefaultSize(0, 0));
                int i = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580;
                int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19;
                byte[] bArr = $$a;
                byte b = bArr[28];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (-bArr[21]), b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(defaultSize, i, i2, -1617146088, false, (String) objArr2[0], new Class[]{getClosedCaptionTrackFormats.class});
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
