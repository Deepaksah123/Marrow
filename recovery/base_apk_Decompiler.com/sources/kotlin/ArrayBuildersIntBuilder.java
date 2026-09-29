package kotlin;

import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
final class ArrayBuildersIntBuilder {
    private boolean IconCompatParcelizer;
    private final float[] read = new float[16];
    private final float[] write = new float[16];
    private final ClassNameIdResolver<float[]> AudioAttributesCompatParcelizer = new ClassNameIdResolver<>();

    public final void IconCompatParcelizer(long j, float[] fArr) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j, fArr);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = false;
    }

    public final boolean RemoteActionCompatParcelizer(float[] fArr, long j) {
        float[] fArr2 = this.AudioAttributesCompatParcelizer.read(j);
        if (fArr2 == null) {
            return false;
        }
        read(this.write, fArr2);
        if (!this.IconCompatParcelizer) {
            write(this.read, this.write);
            this.IconCompatParcelizer = true;
        }
        Matrix.multiplyMM(fArr, 0, this.read, 0, this.write, 0);
        return true;
    }

    public static void write(float[] fArr, float[] fArr2) {
        TypeSerializer1.IconCompatParcelizer(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    private static void read(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != BitmapDescriptorFactory.HUE_RED) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            TypeSerializer1.IconCompatParcelizer(fArr);
        }
    }
}
