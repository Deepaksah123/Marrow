package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import kotlin.Rstring;
import kotlin.ab;
import kotlin.reportActivity;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeClipBounds extends Transition {
    private static final String[] AudioAttributesImplApi21Parcelizer = {"android:clipBounds:clip"};
    static final Rect RemoteActionCompatParcelizer = new Rect();

    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    @Override // androidx.transition.Transition
    public final String[] write() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void AudioAttributesCompatParcelizer(Rstring rstring, boolean z) {
        View view = rstring.AudioAttributesCompatParcelizer;
        if (view.getVisibility() != 8) {
            Rect clipBounds = z ? (Rect) view.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_clip) : null;
            if (clipBounds == null) {
                clipBounds = view.getClipBounds();
            }
            Rect rect = clipBounds != RemoteActionCompatParcelizer ? clipBounds : null;
            rstring.read.put("android:clipBounds:clip", rect);
            if (rect == null) {
                rstring.read.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring, true);
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring, false);
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        if (rstring == null || rstring2 == null || !rstring.read.containsKey("android:clipBounds:clip") || !rstring2.read.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) rstring.read.get("android:clipBounds:clip");
        Rect rect2 = (Rect) rstring2.read.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) rstring.read.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) rstring2.read.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        rstring2.AudioAttributesCompatParcelizer.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(rstring2.AudioAttributesCompatParcelizer, (Property<View, V>) ab.AudioAttributesCompatParcelizer, (TypeEvaluator) new reportActivity(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(rstring2.AudioAttributesCompatParcelizer, rect, rect2);
        objectAnimatorOfObject.addListener(iconCompatParcelizer);
        RemoteActionCompatParcelizer(iconCompatParcelizer);
        return objectAnimatorOfObject;
    }

    static class IconCompatParcelizer extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private final Rect AudioAttributesCompatParcelizer;
        private final View RemoteActionCompatParcelizer;
        private final Rect write;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
        }

        IconCompatParcelizer(View view, Rect rect, Rect rect2) {
            this.RemoteActionCompatParcelizer = view;
            this.write = rect;
            this.AudioAttributesCompatParcelizer = rect2;
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            Rect clipBounds = this.RemoteActionCompatParcelizer.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.RemoteActionCompatParcelizer;
            }
            this.RemoteActionCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_clip, clipBounds);
            this.RemoteActionCompatParcelizer.setClipBounds(this.AudioAttributesCompatParcelizer);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.setClipBounds((Rect) this.RemoteActionCompatParcelizer.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_clip));
            this.RemoteActionCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_clip, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (!z) {
                this.RemoteActionCompatParcelizer.setClipBounds(this.AudioAttributesCompatParcelizer);
            } else {
                this.RemoteActionCompatParcelizer.setClipBounds(this.write);
            }
        }
    }
}
