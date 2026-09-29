package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class ByteChannel {
    public static void DisplayInfo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) throws Throwable {
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - MotionEvent.axisFromString("")), (ViewConfiguration.getScrollBarSize() >> 8) + 6054, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
            Object[] objArr = {byteBuffer, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-654309662);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 6030 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 25, -1488338313, false, "RemoteActionCompatParcelizer", new Class[]{ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class, ByteBuffer.class});
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

    public static String DateSorter() {
        return TrainingApplication.RemoteActionCompatParcelizer();
    }
}
