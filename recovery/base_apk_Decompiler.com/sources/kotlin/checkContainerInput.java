package kotlin;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class checkContainerInput implements ValueAnimator.AnimatorUpdateListener {
    private final RemoteActionCompatParcelizer read;
    private final View[] write;

    interface RemoteActionCompatParcelizer {
        void read(ValueAnimator valueAnimator, View view);
    }

    private checkContainerInput(RemoteActionCompatParcelizer remoteActionCompatParcelizer, View... viewArr) {
        this.read = remoteActionCompatParcelizer;
        this.write = viewArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.write) {
            this.read.read(valueAnimator, view);
        }
    }

    public static checkContainerInput AudioAttributesCompatParcelizer(View... viewArr) {
        return new checkContainerInput(new RemoteActionCompatParcelizer() { // from class: o.ExtractorsFactory
            @Override // o.checkContainerInput.RemoteActionCompatParcelizer
            public final void read(ValueAnimator valueAnimator, View view) {
                checkContainerInput.read(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static checkContainerInput read(View... viewArr) {
        return new checkContainerInput(new RemoteActionCompatParcelizer() { // from class: o.checkAndReadCrc
            @Override // o.checkContainerInput.RemoteActionCompatParcelizer
            public final void read(ValueAnimator valueAnimator, View view) {
                checkContainerInput.MediaBrowserCompatCustomActionResultReceiver(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void MediaBrowserCompatCustomActionResultReceiver(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    public static checkContainerInput write(View... viewArr) {
        return new checkContainerInput(new RemoteActionCompatParcelizer() { // from class: o.ExtractorsFactoryExternalSyntheticLambda0
            @Override // o.checkContainerInput.RemoteActionCompatParcelizer
            public final void read(ValueAnimator valueAnimator, View view) {
                checkContainerInput.AudioAttributesImplBaseParcelizer(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesImplBaseParcelizer(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static checkContainerInput IconCompatParcelizer(View... viewArr) {
        return new checkContainerInput(new RemoteActionCompatParcelizer() { // from class: o.FlacFrameReader
            @Override // o.checkContainerInput.RemoteActionCompatParcelizer
            public final void read(ValueAnimator valueAnimator, View view) {
                checkContainerInput.AudioAttributesImplApi26Parcelizer(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesImplApi26Parcelizer(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
