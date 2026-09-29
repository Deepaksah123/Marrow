package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getPreviousUrl implements parseCea708AccessibilityChannel.RemoteActionCompatParcelizer {
    private static final byte[] $$a = {123, -91, -44, 22, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = PsExtractor.VIDEO_STREAM_MASK;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 28 - r7
            int r8 = r8 * 3
            int r8 = 82 - r8
            int r6 = r6 + 4
            byte[] r1 = kotlin.getPreviousUrl.$$a
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPreviousUrl.a(short, byte, int, java.lang.Object[]):void");
    }

    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
    public final Object write() throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1319423533);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 63098);
                int iIndexOf = 24579 - TextUtils.indexOf((CharSequence) "", '0');
                int minimumFlingVelocity = 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b = $$a[14];
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iIndexOf, minimumFlingVelocity, 820841144, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 24581 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20)});
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
