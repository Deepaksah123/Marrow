package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.ArrayBuildersByteBuilder;
import kotlin.ArrayBuildersDoubleBuilder;
import kotlin.ArrayBuildersShortBuilder;
import kotlin.TypeSerializer1;
import kotlin.buildTypeSerializer;
import kotlin.getDefaultValue;
import kotlin.getRemainingInput;

/* JADX INFO: loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private boolean AudioAttributesCompatParcelizer;
    private SurfaceTexture AudioAttributesImplApi21Parcelizer;
    private Surface AudioAttributesImplApi26Parcelizer;
    private final SensorManager AudioAttributesImplBaseParcelizer;
    private final ArrayBuildersByteBuilder IconCompatParcelizer;
    private final getDefaultValue MediaBrowserCompatCustomActionResultReceiver;
    private final ArrayBuildersShortBuilder MediaBrowserCompatItemReceiver;
    private final CopyOnWriteArrayList<read> MediaBrowserCompatMediaItem;
    private boolean MediaMetadataCompat;
    private final Sensor RemoteActionCompatParcelizer;
    private final Handler read;
    private boolean write;

    public interface read {
        void AudioAttributesCompatParcelizer(Surface surface);

        void read();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatMediaItem = new CopyOnWriteArrayList<>();
        this.read = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) buildTypeSerializer.IconCompatParcelizer(context.getSystemService("sensor"));
        this.AudioAttributesImplBaseParcelizer = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.RemoteActionCompatParcelizer = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ArrayBuildersShortBuilder arrayBuildersShortBuilder = new ArrayBuildersShortBuilder();
        this.MediaBrowserCompatItemReceiver = arrayBuildersShortBuilder;
        write writeVar = new write(arrayBuildersShortBuilder);
        getDefaultValue getdefaultvalue = new getDefaultValue(context, writeVar);
        this.MediaBrowserCompatCustomActionResultReceiver = getdefaultvalue;
        this.IconCompatParcelizer = new ArrayBuildersByteBuilder(((WindowManager) buildTypeSerializer.IconCompatParcelizer((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), getdefaultvalue, writeVar);
        this.MediaMetadataCompat = true;
        setEGLContextClientVersion(2);
        setRenderer(writeVar);
        setOnTouchListener(getdefaultvalue);
    }

    public final void read(read readVar) {
        this.MediaBrowserCompatMediaItem.add(readVar);
    }

    public final void RemoteActionCompatParcelizer(read readVar) {
        this.MediaBrowserCompatMediaItem.remove(readVar);
    }

    public final Surface write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final getRemainingInput read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final ArrayBuildersDoubleBuilder AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void setDefaultStereoMode(int i) {
        this.MediaBrowserCompatItemReceiver.read(i);
    }

    public final void setUseSensorRotation(boolean z) {
        this.MediaMetadataCompat = z;
        IconCompatParcelizer();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.AudioAttributesCompatParcelizer = true;
        IconCompatParcelizer();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.AudioAttributesCompatParcelizer = false;
        IconCompatParcelizer();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.read.post(new Runnable() { // from class: o.ByteBufferBackedInputStream
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        });
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer() {
        Surface surface = this.AudioAttributesImplApi26Parcelizer;
        if (surface != null) {
            Iterator<read> it = this.MediaBrowserCompatMediaItem.iterator();
            while (it.hasNext()) {
                it.next().read();
            }
        }
        read(this.AudioAttributesImplApi21Parcelizer, surface);
        this.AudioAttributesImplApi21Parcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = null;
    }

    private void IconCompatParcelizer() {
        boolean z = this.MediaMetadataCompat && this.AudioAttributesCompatParcelizer;
        Sensor sensor = this.RemoteActionCompatParcelizer;
        if (sensor == null || z == this.write) {
            return;
        }
        if (z) {
            this.AudioAttributesImplBaseParcelizer.registerListener(this.IconCompatParcelizer, sensor, 0);
        } else {
            this.AudioAttributesImplBaseParcelizer.unregisterListener(this.IconCompatParcelizer);
        }
        this.write = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(final SurfaceTexture surfaceTexture) {
        this.read.post(new Runnable() { // from class: o.isJodaTimeClass
            @Override // java.lang.Runnable
            public final void run() {
                this.write.IconCompatParcelizer(surfaceTexture);
            }
        });
    }

    public final /* synthetic */ void IconCompatParcelizer(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.AudioAttributesImplApi21Parcelizer;
        Surface surface = this.AudioAttributesImplApi26Parcelizer;
        Surface surface2 = new Surface(surfaceTexture);
        this.AudioAttributesImplApi21Parcelizer = surfaceTexture;
        this.AudioAttributesImplApi26Parcelizer = surface2;
        Iterator<read> it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(surface2);
        }
        read(surfaceTexture2, surface);
    }

    private static void read(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    final class write implements GLSurfaceView.Renderer, getDefaultValue.IconCompatParcelizer, ArrayBuildersByteBuilder.IconCompatParcelizer {
        private float AudioAttributesCompatParcelizer;
        private float AudioAttributesImplApi21Parcelizer;
        private final float[] AudioAttributesImplBaseParcelizer;
        private final ArrayBuildersShortBuilder IconCompatParcelizer;
        private final float[] MediaBrowserCompatItemReceiver;
        private final float[] write;
        private final float[] RemoteActionCompatParcelizer = new float[16];
        private final float[] MediaBrowserCompatSearchResultReceiver = new float[16];
        private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[16];
        private final float[] AudioAttributesImplApi26Parcelizer = new float[16];

        public write(ArrayBuildersShortBuilder arrayBuildersShortBuilder) {
            float[] fArr = new float[16];
            this.write = fArr;
            float[] fArr2 = new float[16];
            this.MediaBrowserCompatItemReceiver = fArr2;
            float[] fArr3 = new float[16];
            this.AudioAttributesImplBaseParcelizer = fArr3;
            this.IconCompatParcelizer = arrayBuildersShortBuilder;
            TypeSerializer1.IconCompatParcelizer(fArr);
            TypeSerializer1.IconCompatParcelizer(fArr2);
            TypeSerializer1.IconCompatParcelizer(fArr3);
            this.AudioAttributesCompatParcelizer = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            synchronized (this) {
                SphericalGLSurfaceView.this.RemoteActionCompatParcelizer(this.IconCompatParcelizer.read());
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.RemoteActionCompatParcelizer, 0, write(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.AudioAttributesImplApi26Parcelizer, 0, this.write, 0, this.AudioAttributesImplBaseParcelizer, 0);
                Matrix.multiplyMM(this.MediaBrowserCompatCustomActionResultReceiver, 0, this.MediaBrowserCompatItemReceiver, 0, this.AudioAttributesImplApi26Parcelizer, 0);
            }
            Matrix.multiplyMM(this.MediaBrowserCompatSearchResultReceiver, 0, this.RemoteActionCompatParcelizer, 0, this.MediaBrowserCompatCustomActionResultReceiver, 0);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        }

        @Override // o.ArrayBuildersByteBuilder.IconCompatParcelizer
        public final void write(float[] fArr, float f) {
            synchronized (this) {
                float[] fArr2 = this.write;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                this.AudioAttributesCompatParcelizer = -f;
                AudioAttributesCompatParcelizer();
            }
        }

        private void AudioAttributesCompatParcelizer() {
            Matrix.setRotateM(this.MediaBrowserCompatItemReceiver, 0, -this.AudioAttributesImplApi21Parcelizer, (float) Math.cos(this.AudioAttributesCompatParcelizer), (float) Math.sin(this.AudioAttributesCompatParcelizer), BitmapDescriptorFactory.HUE_RED);
        }

        @Override // o.getDefaultValue.IconCompatParcelizer
        public final void write(PointF pointF) {
            synchronized (this) {
                this.AudioAttributesImplApi21Parcelizer = pointF.y;
                AudioAttributesCompatParcelizer();
                Matrix.setRotateM(this.AudioAttributesImplBaseParcelizer, 0, -pointF.x, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
            }
        }

        @Override // o.getDefaultValue.IconCompatParcelizer
        public final boolean IconCompatParcelizer() {
            return SphericalGLSurfaceView.this.performClick();
        }

        private static float write(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }
    }
}
