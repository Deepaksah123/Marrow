package kotlin;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;
import kotlin.PlayerControlView1;
import kotlin.onDraw;
import kotlin.showScrubber;

/* JADX INFO: loaded from: classes3.dex */
public final class onDraw {
    public static final int write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        return read(view, view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    private static final int read(View view, int i) {
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED, i);
        alphaAnimationIconCompatParcelizer.setStartOffset(i);
        alphaAnimationIconCompatParcelizer.setAnimationListener(new AudioAttributesImplApi21Parcelizer(view));
        view.startAnimation(alphaAnimationIconCompatParcelizer);
        return i;
    }

    public static final class AudioAttributesImplApi21Parcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ View write;

        AudioAttributesImplApi21Parcelizer(View view) {
            this.write = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.write.setVisibility(4);
        }
    }

    public static final int IconCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        return IconCompatParcelizer(view, view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    private static /* synthetic */ int IconCompatParcelizer(View view, int i) {
        return RemoteActionCompatParcelizer(view, i, 8);
    }

    private static int RemoteActionCompatParcelizer(View view, int i, int i2) {
        if (view == null) {
            return 0;
        }
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED, i);
        alphaAnimationIconCompatParcelizer.setStartOffset(i);
        alphaAnimationIconCompatParcelizer.setAnimationListener(new MediaBrowserCompatCustomActionResultReceiver(view, 8));
        view.startAnimation(alphaAnimationIconCompatParcelizer);
        return i;
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ View RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        MediaBrowserCompatCustomActionResultReceiver(View view, int i) {
            this.RemoteActionCompatParcelizer = view;
            this.write = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.RemoteActionCompatParcelizer.setVisibility(this.write);
        }
    }

    public static final int IconCompatParcelizer(View view, int i, int i2) {
        if (view == null) {
            return 0;
        }
        view.setVisibility(0);
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, integer);
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2, BitmapDescriptorFactory.HUE_RED);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(integer);
        animationSet.setStartOffset(i);
        animationSet.addAnimation(alphaAnimationIconCompatParcelizer);
        animationSet.addAnimation(translateAnimation);
        view.startAnimation(animationSet);
        return integer;
    }

    public static final int read(View view) {
        if (view == null) {
            return 0;
        }
        return MediaBrowserCompatCustomActionResultReceiver(view);
    }

    private static final int MediaBrowserCompatCustomActionResultReceiver(View view) {
        if (view == null) {
            return 0;
        }
        view.setVisibility(0);
        int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
        AlphaAnimation alphaAnimationIconCompatParcelizer = showScrubber.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, integer);
        alphaAnimationIconCompatParcelizer.setDuration(integer);
        alphaAnimationIconCompatParcelizer.setStartOffset(0L);
        alphaAnimationIconCompatParcelizer.setAnimationListener(new IconCompatParcelizer(view));
        view.startAnimation(alphaAnimationIconCompatParcelizer);
        return integer;
    }

    public static final class IconCompatParcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ View read;

        IconCompatParcelizer(View view) {
            this.read = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.read.setVisibility(0);
        }
    }

    public static final void AudioAttributesCompatParcelizer(View view, Integer num, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, num != null ? num.intValue() : view.getMeasuredHeight(), BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setDuration(view.getResources().getInteger(R.integer.config_mediumAnimTime));
        translateAnimation.setAnimationListener(new MediaBrowserCompatItemReceiver(view, 1000, getcreatedondatems));
        view.startAnimation(translateAnimation);
    }

    public static final class MediaBrowserCompatItemReceiver extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer = 1000;
        private /* synthetic */ View read;

        MediaBrowserCompatItemReceiver(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.read = view;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            final getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.IconCompatParcelizer;
            this.read.postDelayed(new Runnable() { // from class: o.DefaultTimeBarExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    onDraw.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(getcreatedondatems);
                }
            }, this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        int measuredHeight = (int) (view.getMeasuredHeight() / view.getContext().getResources().getDisplayMetrics().density);
        if (measuredHeight > 1000) {
            measuredHeight = 1000;
        }
        read(view, measuredHeight, getcreatedondatems);
        return measuredHeight;
    }

    public static final class AudioAttributesCompatParcelizer extends Animation {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ View RemoteActionCompatParcelizer;

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }

        AudioAttributesCompatParcelizer(View view, int i) {
            this.RemoteActionCompatParcelizer = view;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f, Transformation transformation) {
            toMagicModuleMetaRepoModel.write(transformation, "");
            if (f == 1.0f) {
                this.RemoteActionCompatParcelizer.setVisibility(8);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.RemoteActionCompatParcelizer.getLayoutParams();
            int i = this.AudioAttributesCompatParcelizer;
            layoutParams.height = i - ((int) (i * f));
            this.RemoteActionCompatParcelizer.requestLayout();
        }
    }

    private static void read(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        int measuredHeight = view.getMeasuredHeight();
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(view, measuredHeight);
        audioAttributesCompatParcelizer.setDuration(i);
        audioAttributesCompatParcelizer.setAnimationListener(new RemoteActionCompatParcelizer(view, measuredHeight, getcreatedondatems));
        view.startAnimation(audioAttributesCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
        private /* synthetic */ View RemoteActionCompatParcelizer;
        private /* synthetic */ int read;

        RemoteActionCompatParcelizer(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.RemoteActionCompatParcelizer = view;
            this.read = i;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.RemoteActionCompatParcelizer.getLayoutParams().height = this.read;
            this.RemoteActionCompatParcelizer.setVisibility(8);
            this.IconCompatParcelizer.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    public static final class read extends Animation {
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ View write;

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }

        read(View view, int i, int i2) {
            this.write = view;
            this.read = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f, Transformation transformation) {
            int i;
            toMagicModuleMetaRepoModel.write(transformation, "");
            ViewGroup.LayoutParams layoutParams = this.write.getLayoutParams();
            if (f == 1.0f) {
                i = this.read;
                if (i < this.IconCompatParcelizer) {
                    i = -2;
                }
            } else {
                i = (int) (this.read * f);
            }
            layoutParams.height = i;
            this.write.requestLayout();
        }
    }

    public static final class write extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

        write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.IconCompatParcelizer.invoke();
        }
    }

    public static final void AudioAttributesImplApi21Parcelizer(final View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.post(new Runnable() { // from class: o.onRtlPropertiesChanged
            @Override // java.lang.Runnable
            public final void run() {
                onDraw.AudioAttributesImplBaseParcelizer(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, view.getWidth() / 2, view.getHeight() / 2);
        rotateAnimation.setDuration(1200L);
        rotateAnimation.setStartOffset(400L);
        rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        rotateAnimation.setRepeatCount(-1);
        view.startAnimation(rotateAnimation);
    }

    public static final void AudioAttributesCompatParcelizer(TextView textView, ProgressBar progressBar, int i, int i2) {
        toMagicModuleMetaRepoModel.write(textView, "");
        toMagicModuleMetaRepoModel.write(progressBar, "");
        PlayerControlView1 playerControlView1 = new PlayerControlView1(progressBar, i);
        playerControlView1.setInterpolator(new LinearInterpolator());
        playerControlView1.setDuration(i2);
        playerControlView1.read(new AudioAttributesImplApi26Parcelizer(textView));
        progressBar.startAnimation(playerControlView1);
    }

    public static final class AudioAttributesImplApi26Parcelizer implements PlayerControlView1.read {
        private /* synthetic */ TextView read;

        AudioAttributesImplApi26Parcelizer(TextView textView) {
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

    public static final void write(final View view, long j, float f, final float f2, float f3) {
        toMagicModuleMetaRepoModel.write(view, "");
        ViewPropertyAnimator duration = view.animate().scaleX(f).scaleY(f).alpha(f3).setDuration(j);
        final float f4 = 1.0f;
        duration.withEndAction(new Runnable(view, f2, f4) { // from class: o.onTouchEvent
            private /* synthetic */ float AudioAttributesCompatParcelizer;
            private /* synthetic */ float IconCompatParcelizer = 1.0f;
            private /* synthetic */ View RemoteActionCompatParcelizer;

            @Override // java.lang.Runnable
            public final void run() {
                onDraw.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(View view, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(f2);
    }

    public static final void write(View view, int i) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.animate().translationY(-i).setDuration(view.getContext().getResources().getInteger(R.integer.config_shortAnimTime)).start();
    }

    public static final void IconCompatParcelizer(View view, float f, float f2, long j) {
        toMagicModuleMetaRepoModel.write(view, "");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", f, f2);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.start();
    }

    public static final void RemoteActionCompatParcelizer(View view, View view2, View view3, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(view2, "");
        toMagicModuleMetaRepoModel.write(view3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        buildNotification buildnotification = new buildNotification(view2, view3, view.getWidth() / 2, view.getWidth() / 2);
        buildnotification.AudioAttributesCompatParcelizer();
        buildnotification.RemoteActionCompatParcelizer();
        buildnotification.setAnimationListener(new AudioAttributesImplBaseParcelizer(getcreatedondatems));
        view.startAnimation(buildnotification);
    }

    public static final class AudioAttributesImplBaseParcelizer extends showScrubber.RemoteActionCompatParcelizer {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

        AudioAttributesImplBaseParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.AudioAttributesCompatParcelizer = getcreatedondatems;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            toMagicModuleMetaRepoModel.write(animation, "");
            this.AudioAttributesCompatParcelizer.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(View view, int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
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
