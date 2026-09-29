package kotlin;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes5.dex */
public class getTargetTimePosition implements TypeEvaluator<Matrix> {
    private final float[] write = new float[9];
    private final float[] IconCompatParcelizer = new float[9];
    private final Matrix RemoteActionCompatParcelizer = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.write);
        matrix2.getValues(this.IconCompatParcelizer);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.IconCompatParcelizer;
            float f2 = fArr[i];
            float f3 = this.write[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.RemoteActionCompatParcelizer.setValues(this.IconCompatParcelizer);
        return this.RemoteActionCompatParcelizer;
    }
}
