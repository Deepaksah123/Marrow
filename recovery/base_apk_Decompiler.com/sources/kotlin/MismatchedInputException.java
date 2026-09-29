package kotlin;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class MismatchedInputException {
    private static Map<VelocityTracker, setTargetType> IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());

    public static float IconCompatParcelizer(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        setTargetType settargettypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(velocityTracker);
        return settargettypeRemoteActionCompatParcelizer != null ? settargettypeRemoteActionCompatParcelizer.write(i) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void AudioAttributesCompatParcelizer(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        setTargetType settargettypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(velocityTracker);
        if (settargettypeRemoteActionCompatParcelizer != null) {
            settargettypeRemoteActionCompatParcelizer.IconCompatParcelizer(i, f);
        }
    }

    public static void AudioAttributesCompatParcelizer(VelocityTracker velocityTracker, int i) {
        AudioAttributesCompatParcelizer(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void read(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT >= 34 || motionEvent.getSource() != 4194304) {
            return;
        }
        if (!IconCompatParcelizer.containsKey(velocityTracker)) {
            IconCompatParcelizer.put(velocityTracker, new setTargetType());
        }
        IconCompatParcelizer.get(velocityTracker).AudioAttributesCompatParcelizer(motionEvent);
    }

    private static setTargetType RemoteActionCompatParcelizer(VelocityTracker velocityTracker) {
        return IconCompatParcelizer.get(velocityTracker);
    }

    static class RemoteActionCompatParcelizer {
        static float RemoteActionCompatParcelizer(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }
}
