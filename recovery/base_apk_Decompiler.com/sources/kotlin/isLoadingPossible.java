package kotlin;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class isLoadingPossible {
    private final PointF AudioAttributesCompatParcelizer;
    private final PointF IconCompatParcelizer;
    private final PointF write;

    public isLoadingPossible() {
        this.write = new PointF();
        this.AudioAttributesCompatParcelizer = new PointF();
        this.IconCompatParcelizer = new PointF();
    }

    public isLoadingPossible(PointF pointF, PointF pointF2, PointF pointF3) {
        this.write = pointF;
        this.AudioAttributesCompatParcelizer = pointF2;
        this.IconCompatParcelizer = pointF3;
    }

    public final void write(float f, float f2) {
        this.write.set(f, f2);
    }

    public final PointF IconCompatParcelizer() {
        return this.write;
    }

    public final void IconCompatParcelizer(float f, float f2) {
        this.AudioAttributesCompatParcelizer.set(f, f2);
    }

    public final PointF AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2) {
        this.IconCompatParcelizer.set(f, f2);
    }

    public final PointF read() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.IconCompatParcelizer.x), Float.valueOf(this.IconCompatParcelizer.y), Float.valueOf(this.write.x), Float.valueOf(this.write.y), Float.valueOf(this.AudioAttributesCompatParcelizer.x), Float.valueOf(this.AudioAttributesCompatParcelizer.y));
    }
}
