package kotlin;

import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class PageInfo implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {91, -41, -108, -7, 8, -1, -8};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_AC4;
    private /* synthetic */ getCurrentEventTimeUs write;

    private static void a(int i, short s, byte b, Object[] objArr) {
        int i2 = s * 4;
        int i3 = (i * 3) + 114;
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[4 - i2];
        int i5 = 3 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i4)) - 5;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i8])) - 5;
                i4 = i8;
                i6 = i7;
            }
        }
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, (Pair) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1296205989);
            if (objRemoteActionCompatParcelizer == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 63099);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24580;
                int i = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19;
                byte b = $$a[5];
                byte b2 = (byte) (b + 1);
                Object[] objArr2 = new Object[1];
                a(b2, b2, b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(bitsPerPixel, keyRepeatDelay, i, -856378418, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 63097), 24580 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 20), Pair.class});
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
