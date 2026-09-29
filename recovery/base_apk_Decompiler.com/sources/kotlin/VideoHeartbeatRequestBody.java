package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.response.ApiResponse;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class VideoHeartbeatRequestBody implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static final byte[] $$a = {94, -36, -26, 62, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$b = 140;
    private /* synthetic */ getCurrentEventTimeUs write;

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = s2 + 4;
        int i3 = 65 - (s * 3);
        byte[] bArr = $$a;
        int i4 = i * 3;
        byte[] bArr2 = new byte[i4 + 31];
        int i5 = i4 + 30;
        int i6 = -1;
        if (bArr == null) {
            i3 = i3 + i2 + 2;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i2 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i3 + bArr[i8] + 2;
                i2 = i8;
                i6 = i7;
            }
        }
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        try {
            Object[] objArr = {this.write, (ApiResponse) obj};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(863060584);
            if (objRemoteActionCompatParcelizer == null) {
                char cBlue = (char) (63098 - Color.blue(0));
                int i = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24579;
                int iKeyCodeFromString = 20 - KeyEvent.keyCodeFromString("");
                byte[] bArr = $$a;
                byte b = bArr[28];
                Object[] objArr2 = new Object[1];
                a(b, b, (byte) (-bArr[21]), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cBlue, i, iKeyCodeFromString, 1295550205, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 63098), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24580, (ViewConfiguration.getWindowTouchSlop() >> 8) + 20), ApiResponse.class});
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
