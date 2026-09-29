package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.AsArrayTypeDeserializer;
import kotlin.SimpleKeyDeserializers;
import kotlin.TypeSerializer1;
import kotlin.buildTypeSerializer;
import kotlin.parseTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements parseTypes {
    private final AudioAttributesCompatParcelizer write;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this);
        this.write = audioAttributesCompatParcelizer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(audioAttributesCompatParcelizer);
        setRenderMode(0);
    }

    public final void setOutputBuffer(SimpleKeyDeserializers simpleKeyDeserializers) {
        this.write.AudioAttributesCompatParcelizer(simpleKeyDeserializers);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer implements GLSurfaceView.Renderer {
        private AsArrayTypeDeserializer AudioAttributesImplApi26Parcelizer;
        private final GLSurfaceView AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private SimpleKeyDeserializers MediaBrowserCompatCustomActionResultReceiver;
        private static final float[] read = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.213f, 2.112f, 1.793f, -0.533f, BitmapDescriptorFactory.HUE_RED};
        private static final String[] write = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer RemoteActionCompatParcelizer = TypeSerializer1.read(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final int[] MediaBrowserCompatMediaItem = new int[3];
        private final int[] MediaDescriptionCompat = new int[3];
        private final int[] MediaBrowserCompatItemReceiver = new int[3];
        private final int[] AudioAttributesImplApi21Parcelizer = new int[3];
        private final AtomicReference<SimpleKeyDeserializers> AudioAttributesCompatParcelizer = new AtomicReference<>();
        private final FloatBuffer[] MediaBrowserCompatSearchResultReceiver = new FloatBuffer[3];

        public AudioAttributesCompatParcelizer(GLSurfaceView gLSurfaceView) {
            this.AudioAttributesImplBaseParcelizer = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                this.AudioAttributesImplApi21Parcelizer[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                AsArrayTypeDeserializer asArrayTypeDeserializer = new AsArrayTypeDeserializer("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.AudioAttributesImplApi26Parcelizer = asArrayTypeDeserializer;
                GLES20.glVertexAttribPointer(asArrayTypeDeserializer.write("in_pos"), 2, 5126, false, 0, (Buffer) RemoteActionCompatParcelizer);
                this.MediaDescriptionCompat[0] = this.AudioAttributesImplApi26Parcelizer.write("in_tc_y");
                this.MediaDescriptionCompat[1] = this.AudioAttributesImplApi26Parcelizer.write("in_tc_u");
                this.MediaDescriptionCompat[2] = this.AudioAttributesImplApi26Parcelizer.write("in_tc_v");
                this.IconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer("mColorConversion");
                TypeSerializer1.RemoteActionCompatParcelizer();
                AudioAttributesCompatParcelizer();
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused) {
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            SimpleKeyDeserializers andSet = this.AudioAttributesCompatParcelizer.getAndSet(null);
            if (andSet == null && this.MediaBrowserCompatCustomActionResultReceiver == null) {
                return;
            }
            if (andSet != null) {
                SimpleKeyDeserializers simpleKeyDeserializers = this.MediaBrowserCompatCustomActionResultReceiver;
                if (simpleKeyDeserializers != null) {
                    simpleKeyDeserializers.MediaBrowserCompatCustomActionResultReceiver();
                }
                this.MediaBrowserCompatCustomActionResultReceiver = andSet;
            }
            SimpleKeyDeserializers simpleKeyDeserializers2 = (SimpleKeyDeserializers) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            float[] fArr = read;
            int i = simpleKeyDeserializers2.IconCompatParcelizer;
            GLES20.glUniformMatrix3fv(this.IconCompatParcelizer, 1, false, fArr, 0);
            int[] iArr = (int[]) buildTypeSerializer.IconCompatParcelizer(simpleKeyDeserializers2.AudioAttributesImplApi26Parcelizer);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) buildTypeSerializer.IconCompatParcelizer(simpleKeyDeserializers2.MediaBrowserCompatCustomActionResultReceiver);
            for (int i2 = 0; i2 < 3; i2++) {
                if (i2 == 0) {
                    int i3 = simpleKeyDeserializers2.RemoteActionCompatParcelizer;
                } else {
                    int i4 = simpleKeyDeserializers2.RemoteActionCompatParcelizer;
                    int i5 = 1 / 2;
                }
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.MediaBrowserCompatMediaItem[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], 0, 0, 6409, 5121, byteBufferArr[i2]);
            }
            int i6 = simpleKeyDeserializers2.MediaBrowserCompatItemReceiver;
            int i7 = 1 / 2;
            int[] iArr2 = {0, 0, 0};
            for (int i8 = 0; i8 < 3; i8++) {
                if (this.MediaBrowserCompatItemReceiver[i8] != iArr2[i8] || this.AudioAttributesImplApi21Parcelizer[i8] != iArr[i8]) {
                    buildTypeSerializer.write(iArr[i8] != 0);
                    float f = iArr2[i8] / iArr[i8];
                    this.MediaBrowserCompatSearchResultReceiver[i8] = TypeSerializer1.read(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, f, BitmapDescriptorFactory.HUE_RED, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.MediaDescriptionCompat[i8], 2, 5126, false, 0, (Buffer) this.MediaBrowserCompatSearchResultReceiver[i8]);
                    this.MediaBrowserCompatItemReceiver[i8] = iArr2[i8];
                    this.AudioAttributesImplApi21Parcelizer[i8] = iArr[i8];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused) {
            }
        }

        public final void AudioAttributesCompatParcelizer(SimpleKeyDeserializers simpleKeyDeserializers) {
            SimpleKeyDeserializers andSet = this.AudioAttributesCompatParcelizer.getAndSet(simpleKeyDeserializers);
            if (andSet != null) {
                andSet.MediaBrowserCompatCustomActionResultReceiver();
            }
            this.AudioAttributesImplBaseParcelizer.requestRender();
        }

        private void AudioAttributesCompatParcelizer() {
            try {
                GLES20.glGenTextures(3, this.MediaBrowserCompatMediaItem, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(write[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    TypeSerializer1.AudioAttributesCompatParcelizer(3553, this.MediaBrowserCompatMediaItem[i]);
                }
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused) {
            }
        }
    }
}
