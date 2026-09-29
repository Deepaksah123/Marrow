package in.juspay.widget.qrscanner.com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.c;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d;

/* JADX INFO: loaded from: classes5.dex */
public final class AmbientLightManager implements SensorEventListener {
    private c a;
    private d b;
    private Sensor c;
    private Context d;
    private Handler e = new Handler();

    public AmbientLightManager(Context context, c cVar, d dVar) {
        this.d = context;
        this.a = cVar;
        this.b = dVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private void a(final boolean z) {
        this.e.post(new Runnable() { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.AmbientLightManager.1
            @Override // java.lang.Runnable
            public void run() {
                AmbientLightManager.this.a.b(z);
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.a != null) {
            if (f <= 45.0f) {
                a(true);
            } else if (f >= 450.0f) {
                a(false);
            }
        }
    }

    public final void start() {
        if (this.b.d()) {
            SensorManager sensorManager = (SensorManager) this.d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public final void stop() {
        if (this.c != null) {
            ((SensorManager) this.d.getSystemService("sensor")).unregisterListener(this);
            this.c = null;
        }
    }
}
