package kotlin;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class onKeyResponse {
    private float AudioAttributesCompatParcelizer = 1.0f;
    private float IconCompatParcelizer = 1.0f;
    private ValueAnimator.AnimatorUpdateListener write;

    public onKeyResponse() {
    }

    public onKeyResponse(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.write = animatorUpdateListener;
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
