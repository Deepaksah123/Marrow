package kotlin;

import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.ArrayBuildersLongBuilder;
import kotlin.TypeSerializer1;

/* JADX INFO: loaded from: classes2.dex */
final class BeanUtil {
    private AsArrayTypeDeserializer AudioAttributesImplApi21Parcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaMetadataCompat;
    private int RatingCompat;
    private static final float[] AudioAttributesCompatParcelizer = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    private static final float[] IconCompatParcelizer = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    private static final float[] read = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    private static final float[] write = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    private static final float[] RemoteActionCompatParcelizer = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f, 1.0f};

    BeanUtil() {
    }

    public static boolean RemoteActionCompatParcelizer(ArrayBuildersLongBuilder arrayBuildersLongBuilder) {
        ArrayBuildersLongBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizer = arrayBuildersLongBuilder.write;
        ArrayBuildersLongBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = arrayBuildersLongBuilder.AudioAttributesCompatParcelizer;
        return remoteActionCompatParcelizer.write() == 1 && remoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer == 0 && remoteActionCompatParcelizer2.write() == 1 && remoteActionCompatParcelizer2.IconCompatParcelizer().AudioAttributesCompatParcelizer == 0;
    }

    public final void read(ArrayBuildersLongBuilder arrayBuildersLongBuilder) {
        if (RemoteActionCompatParcelizer(arrayBuildersLongBuilder)) {
            this.MediaMetadataCompat = arrayBuildersLongBuilder.RemoteActionCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer(arrayBuildersLongBuilder.write.IconCompatParcelizer());
            this.AudioAttributesImplApi26Parcelizer = arrayBuildersLongBuilder.IconCompatParcelizer ? this.AudioAttributesImplBaseParcelizer : new AudioAttributesCompatParcelizer(arrayBuildersLongBuilder.AudioAttributesCompatParcelizer.IconCompatParcelizer());
        }
    }

    public final void RemoteActionCompatParcelizer() {
        try {
            AsArrayTypeDeserializer asArrayTypeDeserializer = new AsArrayTypeDeserializer("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.AudioAttributesImplApi21Parcelizer = asArrayTypeDeserializer;
            this.MediaBrowserCompatItemReceiver = asArrayTypeDeserializer.IconCompatParcelizer("uMvpMatrix");
            this.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer("uTexMatrix");
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer.write("aPosition");
            this.RatingCompat = this.AudioAttributesImplApi21Parcelizer.write("aTexCoords");
            this.MediaBrowserCompatMediaItem = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer("uTexture");
        } catch (TypeSerializer1.IconCompatParcelizer unused) {
        }
    }

    public final void read(int i, float[] fArr, boolean z) {
        float[] fArr2;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            int i2 = this.MediaMetadataCompat;
            if (i2 == 1) {
                fArr2 = IconCompatParcelizer;
            } else if (i2 == 2) {
                fArr2 = write;
            } else {
                fArr2 = AudioAttributesCompatParcelizer;
            }
            GLES20.glUniformMatrix3fv(this.MediaBrowserCompatSearchResultReceiver, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.MediaBrowserCompatItemReceiver, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.MediaBrowserCompatMediaItem, 0);
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused) {
            }
            GLES20.glVertexAttribPointer(this.MediaBrowserCompatCustomActionResultReceiver, 3, 5126, false, 12, (Buffer) audioAttributesCompatParcelizer.write);
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused2) {
            }
            GLES20.glVertexAttribPointer(this.RatingCompat, 2, 5126, false, 8, (Buffer) audioAttributesCompatParcelizer.IconCompatParcelizer);
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused3) {
            }
            GLES20.glDrawArrays(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, 0, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer unused4) {
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final FloatBuffer IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final FloatBuffer write;

        public AudioAttributesCompatParcelizer(ArrayBuildersLongBuilder.read readVar) {
            this.RemoteActionCompatParcelizer = readVar.IconCompatParcelizer();
            this.write = TypeSerializer1.read(readVar.read);
            this.IconCompatParcelizer = TypeSerializer1.read(readVar.write);
            int i = readVar.IconCompatParcelizer;
            if (i == 1) {
                this.AudioAttributesCompatParcelizer = 5;
            } else if (i == 2) {
                this.AudioAttributesCompatParcelizer = 6;
            } else {
                this.AudioAttributesCompatParcelizer = 4;
            }
        }
    }
}
