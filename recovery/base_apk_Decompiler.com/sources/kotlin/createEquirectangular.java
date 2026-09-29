package kotlin;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;
import kotlin.PlayerControlView1;
import kotlin.showScrubber;

/* JADX INFO: loaded from: classes3.dex */
public final class createEquirectangular {
    public static final int IconCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        view.setVisibility(0);
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, integer);
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 500.0f, BitmapDescriptorFactory.HUE_RED);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(integer);
        animationSet.setStartOffset(300L);
        animationSet.addAnimation(alphaAnimationIconCompatParcelizer);
        animationSet.addAnimation(translateAnimation);
        view.startAnimation(animationSet);
        return integer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    public static final class IconCompatParcelizer extends Animation {
        private /* synthetic */ View IconCompatParcelizer;
        private /* synthetic */ int read;

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }

        IconCompatParcelizer(View view, int i) {
            this.IconCompatParcelizer = view;
            this.read = i;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f, Transformation transformation) {
            toMagicModuleMetaRepoModel.write(transformation, "");
            if (f == 1.0f) {
                this.IconCompatParcelizer.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            int i = this.read;
            layoutParams.height = i - ((int) (i * f));
            this.IconCompatParcelizer.requestLayout();
        }
    }

    public static final void read(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        int measuredHeight = view.getMeasuredHeight();
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(view, measuredHeight);
        iconCompatParcelizer.setDuration(250L);
        iconCompatParcelizer.setAnimationListener(new RemoteActionCompatParcelizer(view, measuredHeight, getcreatedondatems));
        view.startAnimation(iconCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ View read;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        RemoteActionCompatParcelizer(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.read = view;
            this.RemoteActionCompatParcelizer = i;
            this.write = getcreatedondatems;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.read.getLayoutParams().height = this.RemoteActionCompatParcelizer;
            this.read.setVisibility(8);
            this.write.invoke();
        }
    }

    public static final class read extends Animation {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ View IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }

        read(View view, int i, int i2) {
            this.IconCompatParcelizer = view;
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f, Transformation transformation) {
            int i;
            toMagicModuleMetaRepoModel.write(transformation, "");
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            if (f == 1.0f) {
                i = this.AudioAttributesCompatParcelizer;
                if (i < this.RemoteActionCompatParcelizer) {
                    i = -2;
                }
            } else {
                i = (int) (this.AudioAttributesCompatParcelizer * f);
            }
            layoutParams.height = i;
            this.IconCompatParcelizer.requestLayout();
        }
    }

    public static final class write extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;

        write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.RemoteActionCompatParcelizer.invoke();
        }
    }

    public static final void RemoteActionCompatParcelizer(TextView textView, ProgressBar progressBar, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        toMagicModuleMetaRepoModel.write(progressBar, "");
        PlayerControlView1 playerControlView1 = new PlayerControlView1(progressBar, i);
        playerControlView1.setInterpolator(new LinearInterpolator());
        playerControlView1.setDuration(1000L);
        playerControlView1.read(new AudioAttributesCompatParcelizer(textView));
        progressBar.startAnimation(playerControlView1);
    }

    public static final class AudioAttributesCompatParcelizer implements PlayerControlView1.read {
        private /* synthetic */ TextView read;

        AudioAttributesCompatParcelizer(TextView textView) {
            this.read = textView;
        }

        @Override // o.PlayerControlView1.read
        public final void read(int i) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            this.read.setText(str);
        }
    }

    public static final void write(View view, Runnable runnable) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(runnable, "");
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2000.0f);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setDuration(400L);
        translateAnimation.setAnimationListener(new MediaBrowserCompatItemReceiver(runnable));
        view.startAnimation(translateAnimation);
    }

    public static final class MediaBrowserCompatItemReceiver extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ Runnable IconCompatParcelizer;

        MediaBrowserCompatItemReceiver(Runnable runnable) {
            this.IconCompatParcelizer = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.IconCompatParcelizer.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(View view, float f, float f2, long j) {
        toMagicModuleMetaRepoModel.write(view, "");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", f, f2);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
    }

    public static final void write(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        if (view.getVisibility() == 0) {
            return;
        }
        Object parent = view.getParent();
        toMagicModuleMetaRepoModel.read(parent, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        Context context = view.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        int i2 = updateNavigation.read(context, i);
        if (i2 <= measuredHeight) {
            measuredHeight = i2;
        }
        view.getLayoutParams().height = 1;
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(view.getResources().getInteger(R.integer.config_shortAnimTime)).setListener(null);
        read readVar = new read(view, measuredHeight, i2);
        readVar.setAnimationListener(new write(getcreatedondatems));
        readVar.setDuration(view.getResources().getInteger(R.integer.config_shortAnimTime));
        view.startAnimation(readVar);
    }
}
