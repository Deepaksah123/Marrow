package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
public final class addPackageToPreferred {
    public static Animator RemoteActionCompatParcelizer(View view, Rstring rstring, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) rstring.AudioAttributesCompatParcelizer.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(view, rstring.AudioAttributesCompatParcelizer, translationX, translationY);
        transition.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        objectAnimatorOfPropertyValuesHolder.addListener(remoteActionCompatParcelizer);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    static class RemoteActionCompatParcelizer extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private float AudioAttributesCompatParcelizer;
        private int[] AudioAttributesImplApi26Parcelizer;
        private final float IconCompatParcelizer;
        private final float MediaBrowserCompatCustomActionResultReceiver;
        private final View MediaBrowserCompatItemReceiver;
        private float RemoteActionCompatParcelizer;
        private final View read;
        private boolean write;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        RemoteActionCompatParcelizer(View view, View view2, float f, float f2) {
            this.read = view;
            this.MediaBrowserCompatItemReceiver = view2;
            this.IconCompatParcelizer = f;
            this.MediaBrowserCompatCustomActionResultReceiver = f2;
            int[] iArr = (int[]) view2.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position);
            this.AudioAttributesImplApi26Parcelizer = iArr;
            if (iArr != null) {
                view2.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.write = true;
            this.read.setTranslationX(this.IconCompatParcelizer);
            this.read.setTranslationY(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.read.setTranslationX(this.IconCompatParcelizer);
            this.read.setTranslationY(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(Transition transition) {
            if (this.write) {
                return;
            }
            this.MediaBrowserCompatItemReceiver.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position, null);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
            RemoteActionCompatParcelizer(transition);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
            this.write = true;
            this.read.setTranslationX(this.IconCompatParcelizer);
            this.read.setTranslationY(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer = this.read.getTranslationX();
            this.AudioAttributesCompatParcelizer = this.read.getTranslationY();
            this.read.setTranslationX(this.IconCompatParcelizer);
            this.read.setTranslationY(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.read.setTranslationX(this.RemoteActionCompatParcelizer);
            this.read.setTranslationY(this.AudioAttributesCompatParcelizer);
        }

        private void RemoteActionCompatParcelizer() {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = new int[2];
            }
            this.read.getLocationOnScreen(this.AudioAttributesImplApi26Parcelizer);
            this.MediaBrowserCompatItemReceiver.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position, this.AudioAttributesImplApi26Parcelizer);
        }
    }
}
