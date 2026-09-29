package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class findTransient {
    private final WeakReference<View> RemoteActionCompatParcelizer;

    findTransient(View view) {
        this.RemoteActionCompatParcelizer = new WeakReference<>(view);
    }

    public final findTransient write(long j) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final findTransient read(float f) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final findTransient AudioAttributesCompatParcelizer(float f) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final long IconCompatParcelizer() {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public final findTransient RemoteActionCompatParcelizer(Interpolator interpolator) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final findTransient RemoteActionCompatParcelizer(long j) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final void write() {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final findTransient AudioAttributesCompatParcelizer(NioPathDeserializer nioPathDeserializer) {
        View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            AudioAttributesCompatParcelizer(view, nioPathDeserializer);
        }
        return this;
    }

    private void AudioAttributesCompatParcelizer(final View view, final NioPathDeserializer nioPathDeserializer) {
        if (nioPathDeserializer != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: o.findTransient.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    nioPathDeserializer.IconCompatParcelizer(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    nioPathDeserializer.RemoteActionCompatParcelizer(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    nioPathDeserializer.read(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final findTransient RemoteActionCompatParcelizer(final OptionalHandlerFactory optionalHandlerFactory) {
        final View view = this.RemoteActionCompatParcelizer.get();
        if (view != null) {
            view.animate().setUpdateListener(optionalHandlerFactory != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.Java7Support
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OptionalHandlerFactory optionalHandlerFactory2 = optionalHandlerFactory;
                    View view2 = view;
                    optionalHandlerFactory2.IconCompatParcelizer();
                }
            } : null);
        }
        return this;
    }
}
