package kotlin;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class flip implements SensorEventListener {
    private /* synthetic */ LinkedList IconCompatParcelizer;
    private /* synthetic */ CountDownLatch write;

    public flip(CountDownLatch countDownLatch, LinkedList linkedList) {
        this.write = countDownLatch;
        this.IconCompatParcelizer = linkedList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.write.countDown();
        float[] fArr = sensorEvent != null ? sensorEvent.values : null;
        if (fArr == null) {
            return;
        }
        this.IconCompatParcelizer.add(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Float[]{Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2])}));
    }
}
