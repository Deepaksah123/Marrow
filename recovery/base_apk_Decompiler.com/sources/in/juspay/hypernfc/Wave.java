package in.juspay.hypernfc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lin/juspay/hypernfc/Wave;", "Landroid/view/View;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Paint;", "Landroid/animation/ValueAnimator;", "createRingAnimator", "(Landroid/graphics/Paint;)Landroid/animation/ValueAnimator;", "Landroid/graphics/Canvas;", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", "startRippleAnimation", "(I)V", "offSet", "I", "", "paints", "Ljava/util/List;", "", "radii", "[F"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Wave extends View {
    private int offSet;
    private final List<Paint> paints;
    private final float[] radii;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createRingAnimator$lambda$1(float f) {
        if (f < 0.5f) {
            return 2.0f * f * f;
        }
        float f2 = 1.0f - f;
        return 1.0f - ((2.0f * f2) * f2);
    }

    public Wave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paints = new ArrayList();
        this.radii = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        int[] iArr = {200, 200, 200};
        for (int i = 0; i < 3; i++) {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#D9D9D9"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(25.0f);
            paint.setAlpha(iArr[i]);
            this.paints.add(paint);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onDraw(p0);
        int width = getWidth() / 2;
        int i = this.offSet;
        for (int i2 = 0; i2 < 3; i2++) {
            p0.drawCircle(width, i, this.radii[i2], this.paints.get(i2));
        }
    }

    private final ValueAnimator createRingAnimator(final Paint p0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: in.juspay.hypernfc.Wave$$ExternalSyntheticLambda0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return Wave.createRingAnimator$lambda$1(f);
            }
        });
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: in.juspay.hypernfc.Wave$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wave.createRingAnimator$lambda$2(this.f$0, p0, valueAnimator);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createRingAnimator$lambda$2(Wave wave, Paint paint, ValueAnimator valueAnimator) {
        toMagicModuleMetaRepoModel.write(wave, "");
        toMagicModuleMetaRepoModel.write(paint, "");
        toMagicModuleMetaRepoModel.write(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        toMagicModuleMetaRepoModel.read(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float width = ((1.5f * fFloatValue) * wave.getWidth()) / 2.0f;
        paint.setAlpha((int) ((1.0f - fFloatValue) * 150.0f));
        for (int i = 0; i < 3; i++) {
            if (paint == wave.paints.get(i)) {
                wave.radii[i] = width;
            }
        }
        wave.invalidate();
    }

    public final void startRippleAnimation(int p0) {
        this.offSet = p0;
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(createRingAnimator(this.paints.get(i)));
        }
        for (final int i2 = 0; i2 < 2; i2++) {
            ((ValueAnimator) arrayList.get(i2)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: in.juspay.hypernfc.Wave.startRippleAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator p02) {
                    toMagicModuleMetaRepoModel.write(p02, "");
                    if (p02.getCurrentPlayTime() >= 500) {
                        arrayList.get(i2 + 1).start();
                        arrayList.get(i2).removeUpdateListener(this);
                    }
                }
            });
        }
        ((ValueAnimator) arrayList.get(0)).start();
    }
}
