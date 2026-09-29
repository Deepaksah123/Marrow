package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getLoadMore implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {TarConstants.LF_NORMAL, -59, 73, 39, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 119;
    private /* synthetic */ setEductionDegrees$AudioAttributesCompatParcelizer IconCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs RemoteActionCompatParcelizer;

    public /* synthetic */ getLoadMore(getCurrentEventTimeUs getcurrenteventtimeus, setEductionDegrees$AudioAttributesCompatParcelizer seteductiondegrees_audioattributescompatparcelizer) {
        this.RemoteActionCompatParcelizer = getcurrenteventtimeus;
        this.IconCompatParcelizer = seteductiondegrees_audioattributescompatparcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r7 = 82 - r7
            int r5 = r5 * 4
            int r0 = r5 + 28
            int r6 = r6 + 4
            byte[] r1 = kotlin.getLoadMore.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 27
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLoadMore.a(short, byte, short, java.lang.Object[]):void");
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, (Throwable) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-984308845);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63099);
                int iArgb = Color.argb(0, 0, 0, 0) + 24580;
                int iLastIndexOf = 19 - TextUtils.lastIndexOf("", '0');
                byte b = $$a[14];
                byte b2 = (byte) (b + 1);
                byte b3 = b;
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iArgb, iLastIndexOf, -1155700986, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - Process.getGidForName("")), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24580, 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), setEductionDegrees$AudioAttributesCompatParcelizer.class, Throwable.class});
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
