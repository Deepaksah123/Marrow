package kotlin;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class updateAll implements SensorEventListener {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private final SensorManager MediaBrowserCompatSearchResultReceiver;
    private final write MediaDescriptionCompat;
    private final int RemoteActionCompatParcelizer;
    private final double read;
    private final int write;

    public interface write {
        void write();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public updateAll(Context context, write writeVar) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.MediaDescriptionCompat = writeVar;
        this.read = 1.2d;
        this.IconCompatParcelizer = 1000L;
        this.write = 500;
        this.RemoteActionCompatParcelizer = 3;
        Object systemService = context.getSystemService("sensor");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.MediaBrowserCompatSearchResultReceiver = (SensorManager) systemService;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi21Parcelizer = 9.80665f;
        this.MediaBrowserCompatCustomActionResultReceiver = 9.80665f;
    }

    public final void write() {
        SensorManager sensorManager = this.MediaBrowserCompatSearchResultReceiver;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    public final void read() {
        this.MediaBrowserCompatSearchResultReceiver.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.AudioAttributesImplBaseParcelizer > this.write) {
                this.AudioAttributesImplApi26Parcelizer = 0;
            }
            if (jCurrentTimeMillis - this.MediaBrowserCompatItemReceiver > this.IconCompatParcelizer) {
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer;
                float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                this.AudioAttributesImplApi21Parcelizer = fSqrt;
                float f4 = (this.AudioAttributesCompatParcelizer * 0.9f) + ((fSqrt - this.MediaBrowserCompatCustomActionResultReceiver) * 0.1f);
                this.AudioAttributesCompatParcelizer = f4;
                if (f4 >= this.read) {
                    buildResolutionString.IconCompatParcelizer("shake shake -", String.valueOf(f4));
                    this.AudioAttributesImplApi26Parcelizer++;
                    this.AudioAttributesImplBaseParcelizer = jCurrentTimeMillis;
                }
                if (this.AudioAttributesImplApi26Parcelizer >= this.RemoteActionCompatParcelizer) {
                    this.MediaDescriptionCompat.write();
                    this.AudioAttributesImplBaseParcelizer = 0L;
                    this.AudioAttributesImplApi26Parcelizer = 0;
                    this.MediaBrowserCompatItemReceiver = jCurrentTimeMillis;
                }
            }
        }
    }
}
