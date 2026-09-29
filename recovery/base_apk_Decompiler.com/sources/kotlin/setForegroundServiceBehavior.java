package kotlin;

import android.R;
import android.animation.Animator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.showScrubber;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setForegroundServiceBehavior;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lcom/airbnb/lottie/LottieAnimationView;", "p1", "", "p2", "", "p3", "Ljava/lang/Runnable;", "p4", "", "read", "(Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Runnable;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setForegroundServiceBehavior {
    public static final setForegroundServiceBehavior INSTANCE = new setForegroundServiceBehavior();

    private setForegroundServiceBehavior() {
    }

    public static void read(View view, LottieAnimationView lottieAnimationView, Runnable runnable) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(lottieAnimationView, "");
        toMagicModuleMetaRepoModel.write(runnable, "");
        PlayerControlViewExternalSyntheticLambda1.write(view);
        int integer = view.getResources().getInteger(R.integer.config_longAnimTime);
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, integer);
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 300.0f, BitmapDescriptorFactory.HUE_RED);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(integer);
        animationSet.setStartOffset(200L);
        animationSet.addAnimation(alphaAnimationIconCompatParcelizer);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new AudioAttributesCompatParcelizer(lottieAnimationView, runnable));
        view.startAnimation(animationSet);
    }

    public static final class AudioAttributesCompatParcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ LottieAnimationView IconCompatParcelizer;
        private /* synthetic */ Runnable read;

        AudioAttributesCompatParcelizer(LottieAnimationView lottieAnimationView, Runnable runnable) {
            this.IconCompatParcelizer = lottieAnimationView;
            this.read = runnable;
        }

        public static final class write implements Animator.AnimatorListener {
            private /* synthetic */ Runnable IconCompatParcelizer;
            private /* synthetic */ LottieAnimationView write;

            write(LottieAnimationView lottieAnimationView, Runnable runnable) {
                this.write = lottieAnimationView;
                this.IconCompatParcelizer = runnable;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                toMagicModuleMetaRepoModel.write(animator, "");
                this.write.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                toMagicModuleMetaRepoModel.write(animator, "");
                this.IconCompatParcelizer.run();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                toMagicModuleMetaRepoModel.write(animator, "");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                toMagicModuleMetaRepoModel.write(animator, "");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            LottieAnimationView lottieAnimationView = this.IconCompatParcelizer;
            lottieAnimationView.IconCompatParcelizer(new write(lottieAnimationView, this.read));
            this.IconCompatParcelizer.write();
        }
    }
}
