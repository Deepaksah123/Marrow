package kotlin;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public final class checkAndReadFrameHeader implements TypeEvaluator<Rect> {
    private final Rect read;

    public checkAndReadFrameHeader(Rect rect) {
        this.read = rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        this.read.set(rect.left + ((int) ((rect2.left - rect.left) * f)), rect.top + ((int) ((rect2.top - rect.top) * f)), rect.right + ((int) ((rect2.right - rect.right) * f)), rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f)));
        return this.read;
    }
}
