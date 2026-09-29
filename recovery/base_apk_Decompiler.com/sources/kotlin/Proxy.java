package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.marrow.TrainingApplication;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class Proxy {
    public static void PerfMeasurement(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-16772681) - Color.rgb(0, 0, 0)), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getOffsetAfter("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr = {byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-654309662);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 6030 - (ViewConfiguration.getTapTimeout() >> 16), 24 - TextUtils.indexOf("", ""), -1488338313, false, "RemoteActionCompatParcelizer", new Class[]{ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class});
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

    public static String OptionalValidators() {
        return TrainingApplication.RemoteActionCompatParcelizer();
    }
}
