package kotlin;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes4.dex */
public final class CandleEntry implements TypeEvaluator<float[]> {
    private float[] IconCompatParcelizer;

    public CandleEntry(float[] fArr) {
        this.IconCompatParcelizer = fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.IconCompatParcelizer;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
