package kotlin;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class MemoryIntArray {
    public static void InterruptedIOException(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 4536), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr = {byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-654309662);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 24, -1488338313, false, "RemoteActionCompatParcelizer", new Class[]{ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String Menu() {
        return TrainingApplication.RemoteActionCompatParcelizer();
    }
}
