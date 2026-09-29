package kotlin;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/showScrubber;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "Landroid/view/animation/AlphaAnimation;", "IconCompatParcelizer", "(FFI)Landroid/view/animation/AlphaAnimation;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class showScrubber {
    public static final showScrubber INSTANCE = new showScrubber();

    private showScrubber() {
    }

    @getMagicModuleMeta
    public static final AlphaAnimation IconCompatParcelizer(float p0, float p1, int p2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(p0, p1);
        alphaAnimation.setDuration(p2);
        return alphaAnimation;
    }

    public static abstract class RemoteActionCompatParcelizer implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
        }
    }
}
