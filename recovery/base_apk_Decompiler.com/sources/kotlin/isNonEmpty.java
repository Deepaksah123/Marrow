package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class isNonEmpty implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {98, -46, 102, 39, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 224;
    private /* synthetic */ Runnable AudioAttributesCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs IconCompatParcelizer;

    public /* synthetic */ isNonEmpty(getCurrentEventTimeUs getcurrenteventtimeus, Runnable runnable) {
        this.IconCompatParcelizer = getcurrenteventtimeus;
        this.AudioAttributesCompatParcelizer = runnable;
    }

    private static void a(byte b, byte b2, int i, Object[] objArr) {
        int i2 = b2 * 3;
        int i3 = 4 - (b * 3);
        int i4 = 73 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[20 - i2];
        int i5 = 19 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (-i3) + i5;
            i3++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i6 = i7;
            i4 = (-bArr[i3]) + i8;
            i3++;
        }
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(28726839);
            if (objRemoteActionCompatParcelizer == null) {
                char tapTimeout = (char) (63098 - (ViewConfiguration.getTapTimeout() >> 16));
                int iMakeMeasureSpec = 24580 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 20;
                byte b = (byte) ($$a[6] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(tapTimeout, iMakeMeasureSpec, scrollBarSize, 2147455650, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionType(0L) + 63098), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24579, ExpandableListView.getPackedPositionChild(0L) + 21), Runnable.class, (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 58877), TextUtils.getTrimmedLength("") + 13490, KeyEvent.getDeadChar(0, 0) + 25)});
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
