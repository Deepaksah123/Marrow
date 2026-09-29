package kotlin;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class setWebLineWidth extends ImageView {
    private int RemoteActionCompatParcelizer;
    private Animation.AnimationListener read;

    public setWebLineWidth(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.RemoteActionCompatParcelizer = (int) (3.5f * f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        InvalidTypeIdException.write(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        InvalidTypeIdException.read(this, shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        this.read = animationListener;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.read;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.read;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void setBackgroundColorRes(int i) {
        setBackgroundColor(_isNaN.getColor(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
