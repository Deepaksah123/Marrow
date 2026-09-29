package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.marrow.TrainingApplication;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class AndroidRuntimeException {
    public static void Base64DataException(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Color.alpha(0) + 4535), (ViewConfiguration.getScrollBarSize() >> 8) + 6054, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr = {byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-654309662);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), 6030 - (ViewConfiguration.getLongPressTimeout() >> 16), 23 - TextUtils.lastIndexOf("", '0'), -1488338313, false, "RemoteActionCompatParcelizer", new Class[]{ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class});
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

    public static String Advanceable() {
        return TrainingApplication.RemoteActionCompatParcelizer();
    }
}
