package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public final class r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static Animator RemoteActionCompatParcelizer(getMidiExtractorConstructor getmidiextractorconstructor, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(getmidiextractorconstructor, (Property<getMidiExtractorConstructor, V>) getMidiExtractorConstructor.IconCompatParcelizer.AudioAttributesCompatParcelizer, (TypeEvaluator) getMidiExtractorConstructor.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, (Object[]) new getMidiExtractorConstructor.read[]{new getMidiExtractorConstructor.read(f, f2, f3)});
        getMidiExtractorConstructor.read readVarWrite = getmidiextractorconstructor.write();
        if (readVarWrite == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) getmidiextractorconstructor, (int) f, (int) f2, readVarWrite.RemoteActionCompatParcelizer, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener write(final getMidiExtractorConstructor getmidiextractorconstructor) {
        return new AnimatorListenerAdapter() { // from class: o.r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                getmidiextractorconstructor.read();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                getmidiextractorconstructor.RemoteActionCompatParcelizer();
            }
        };
    }
}
