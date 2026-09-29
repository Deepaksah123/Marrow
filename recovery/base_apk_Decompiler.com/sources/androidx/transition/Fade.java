package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.ab;
import kotlin.recordRemarketingPing;
import kotlin.reportWithConversionId;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class Fade extends Visibility {
    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    public Fade(int i) {
        read(i);
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.RemoteActionCompatParcelizer);
        read(_parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "fadingMode", 0, onPlayFromMediaId()));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void read(Rstring rstring) {
        super.read(rstring);
        Float fValueOf = (Float) rstring.AudioAttributesCompatParcelizer.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_pause_alpha);
        if (fValueOf == null) {
            if (rstring.AudioAttributesCompatParcelizer.getVisibility() == 0) {
                fValueOf = Float.valueOf(ab.write(rstring.AudioAttributesCompatParcelizer));
            } else {
                fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }
        }
        rstring.read.put("android:fade:transitionAlpha", fValueOf);
    }

    private Animator IconCompatParcelizer(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ab.write(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ab.IconCompatParcelizer, f2);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(view);
        objectAnimatorOfFloat.addListener(iconCompatParcelizer);
        MediaBrowserCompatSearchResultReceiver().RemoteActionCompatParcelizer(iconCompatParcelizer);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public final Animator read(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        ab.IconCompatParcelizer(view);
        return IconCompatParcelizer(view, IconCompatParcelizer(rstring, BitmapDescriptorFactory.HUE_RED), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        ab.IconCompatParcelizer(view);
        Animator animatorIconCompatParcelizer = IconCompatParcelizer(view, IconCompatParcelizer(rstring, 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (animatorIconCompatParcelizer == null) {
            ab.write(view, IconCompatParcelizer(rstring2, 1.0f));
        }
        return animatorIconCompatParcelizer;
    }

    private static float IconCompatParcelizer(Rstring rstring, float f) {
        Float f2;
        return (rstring == null || (f2 = (Float) rstring.read.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    static class IconCompatParcelizer extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer = false;
        private final View read;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void write(Transition transition) {
        }

        IconCompatParcelizer(View view) {
            this.read = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.read.hasOverlappingRendering() && this.read.getLayerType() == 0) {
                this.AudioAttributesCompatParcelizer = true;
                this.read.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (this.AudioAttributesCompatParcelizer) {
                this.read.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            ab.write(this.read, 1.0f);
            ab.AudioAttributesCompatParcelizer(this.read);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ab.write(this.read, 1.0f);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            this.read.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_pause_alpha, Float.valueOf(this.read.getVisibility() == 0 ? ab.write(this.read) : BitmapDescriptorFactory.HUE_RED));
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.read.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_pause_alpha, null);
        }
    }
}
