package kotlin;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAnalyticsCollectorExternalSyntheticLambda10 implements SensorEventListener {
    private write read;

    public interface write {
        void RemoteActionCompatParcelizer();
    }

    DefaultAnalyticsCollectorExternalSyntheticLambda10() {
    }

    public final void RemoteActionCompatParcelizer(write writeVar) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            this.read = writeVar;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (this.read != null) {
                double d = sensorEvent.values[0] / 9.80665f;
                double d2 = sensorEvent.values[1] / 9.80665f;
                double d3 = sensorEvent.values[2] / 9.80665f;
                if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                    this.read.RemoteActionCompatParcelizer();
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        getMinWindowSequenceNumber.IconCompatParcelizer(this);
    }
}
