package kotlin;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u0014\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0010\u0010\u0013"}, d2 = {"Lo/findDefaultEnumValue;", "", "<init>", "()V", "Landroid/graphics/Matrix;", "AudioAttributesCompatParcelizer", "()Landroid/graphics/Matrix;", "Lo/resetWithShared;", "p0", "", "read", "([F)V", "IconCompatParcelizer", "Landroid/graphics/Matrix;", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "Landroid/graphics/Shader;", "()Landroid/graphics/Shader;", "(Landroid/graphics/Shader;)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findDefaultEnumValue {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Matrix read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Shader write;

    private final Matrix AudioAttributesCompatParcelizer() {
        Matrix matrix = this.read;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.read = matrix2;
        return matrix2;
    }

    public final void read(float[] p0) {
        Matrix matrix;
        if (p0 == null) {
            matrix = null;
            this.read = null;
        } else {
            Matrix matrixAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            appendThreeBytes.read(matrixAudioAttributesCompatParcelizer, p0);
            matrix = matrixAudioAttributesCompatParcelizer;
        }
        Shader shader = this.write;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Shader getWrite() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(Shader shader) {
        Matrix matrix = this.read;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.write = shader;
    }
}
