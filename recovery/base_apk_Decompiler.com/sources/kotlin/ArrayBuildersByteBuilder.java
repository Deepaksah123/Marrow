package kotlin;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayBuildersByteBuilder implements SensorEventListener {
    private final Display AudioAttributesCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    private final IconCompatParcelizer[] read;
    private final float[] RemoteActionCompatParcelizer = new float[16];
    private final float[] AudioAttributesImplBaseParcelizer = new float[16];
    private final float[] IconCompatParcelizer = new float[16];
    private final float[] write = new float[3];

    public interface IconCompatParcelizer {
        void write(float[] fArr, float f);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public ArrayBuildersByteBuilder(Display display, IconCompatParcelizer... iconCompatParcelizerArr) {
        this.AudioAttributesCompatParcelizer = display;
        this.read = iconCompatParcelizerArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.RemoteActionCompatParcelizer, sensorEvent.values);
        read(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.getRotation());
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        write(this.RemoteActionCompatParcelizer);
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        IconCompatParcelizer(this.RemoteActionCompatParcelizer, fRemoteActionCompatParcelizer);
    }

    private void IconCompatParcelizer(float[] fArr, float f) {
        for (IconCompatParcelizer iconCompatParcelizer : this.read) {
            iconCompatParcelizer.write(fArr, f);
        }
    }

    private void AudioAttributesCompatParcelizer(float[] fArr) {
        if (!this.MediaBrowserCompatItemReceiver) {
            ArrayBuildersIntBuilder.write(this.IconCompatParcelizer, fArr);
            this.MediaBrowserCompatItemReceiver = true;
        }
        float[] fArr2 = this.AudioAttributesImplBaseParcelizer;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.AudioAttributesImplBaseParcelizer, 0, this.IconCompatParcelizer, 0);
    }

    private float RemoteActionCompatParcelizer(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, TarConstants.PREFIXLEN_XSTAR, this.AudioAttributesImplBaseParcelizer);
        SensorManager.getOrientation(this.AudioAttributesImplBaseParcelizer, this.write);
        return this.write[2];
    }

    private void read(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 2;
            int i3 = TsExtractor.TS_STREAM_TYPE_AC3;
            if (i != 1) {
                if (i == 2) {
                    i2 = 129;
                    i3 = 130;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    i3 = 1;
                    i2 = 130;
                }
            }
            float[] fArr2 = this.AudioAttributesImplBaseParcelizer;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.AudioAttributesImplBaseParcelizer, i2, i3, fArr);
        }
    }

    private static void write(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
