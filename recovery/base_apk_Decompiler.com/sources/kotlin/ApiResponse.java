package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ApiResponse implements Runnable {
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGLINK, -63, -64, 24, -3, -7, 13, -13};
    private static final int $$b = 68;
    private /* synthetic */ ExoPlaybackException IconCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs RemoteActionCompatParcelizer;
    private /* synthetic */ int write;

    public /* synthetic */ ApiResponse(getCurrentEventTimeUs getcurrenteventtimeus, int i, ExoPlaybackException exoPlaybackException) {
        this.RemoteActionCompatParcelizer = getcurrenteventtimeus;
        this.write = i;
        this.IconCompatParcelizer = exoPlaybackException;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 5
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r9 = r9 * 3
            int r9 = 119 - r9
            byte[] r0 = kotlin.ApiResponse.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L30
        L16:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L30:
            int r8 = r8 + r9
            int r8 = r8 + (-2)
            r9 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ApiResponse.a(byte, short, int, java.lang.Object[]):void");
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            Object[] objArr = {this.RemoteActionCompatParcelizer, Integer.valueOf(this.write), this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-205577657);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollDefaultDelay = (char) (63098 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21;
                byte b = (byte) 0;
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollDefaultDelay, i, iIndexOf, -1913198894, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.getTrimmedLength("") + 63098), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24580, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19), Integer.TYPE, ExoPlaybackException.class});
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
