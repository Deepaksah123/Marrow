package kotlin;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setProfession implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {91, -118, -51, -87, 8, -1, -8};
    private static final int $$b = 198;
    private /* synthetic */ ResponseError IconCompatParcelizer;
    private /* synthetic */ getCurrentEventTimeUs write;

    public /* synthetic */ setProfession(getCurrentEventTimeUs getcurrenteventtimeus, ResponseError responseError) {
        this.write = getcurrenteventtimeus;
        this.IconCompatParcelizer = responseError;
    }

    private static void a(short s, int i, byte b, Object[] objArr) {
        int i2 = i * 4;
        int i3 = 114 - (s * 4);
        int i4 = 3 - (b * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 4];
        int i5 = i2 + 3;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 5;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i3 = (i3 + (-bArr[i8])) - 5;
            i4 = i8;
            i6 = i7;
        }
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, this.IconCompatParcelizer, (MarrowResponse) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1286804023);
            if (objRemoteActionCompatParcelizer == null) {
                char cResolveSizeAndState = (char) (63098 - View.resolveSizeAndState(0, 0, 0));
                int iArgb = 24580 - Color.argb(0, 0, 0, 0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 20;
                byte b = (byte) ($$a[5] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cResolveSizeAndState, iArgb, iNormalizeMetaState, 855299746, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 24580 - View.resolveSize(0, 0), 20 - (ViewConfiguration.getScrollBarSize() >> 8)), ResponseError.class, MarrowResponse.class});
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
