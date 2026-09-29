package kotlin;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class peekFullyQuietly implements ValueAnimator.AnimatorUpdateListener {
    private final View IconCompatParcelizer;
    private final View RemoteActionCompatParcelizer;
    private final float[] write = new float[2];

    public peekFullyQuietly(View view, View view2) {
        this.RemoteActionCompatParcelizer = view;
        this.IconCompatParcelizer = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        peekToLength.RemoteActionCompatParcelizer(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.write);
        View view = this.RemoteActionCompatParcelizer;
        if (view != null) {
            view.setAlpha(this.write[0]);
        }
        View view2 = this.IconCompatParcelizer;
        if (view2 != null) {
            view2.setAlpha(this.write[1]);
        }
    }
}
