package kotlin;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class FlacMetadataReader extends Transition {
    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        IconCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        IconCompatParcelizer(rstring);
    }

    private static void IconCompatParcelizer(Rstring rstring) {
        if (rstring.AudioAttributesCompatParcelizer instanceof TextView) {
            rstring.read.put("android:textscale:scale", Float.valueOf(((TextView) rstring.AudioAttributesCompatParcelizer).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        if (rstring == null || rstring2 == null || !(rstring.AudioAttributesCompatParcelizer instanceof TextView) || !(rstring2.AudioAttributesCompatParcelizer instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) rstring2.AudioAttributesCompatParcelizer;
        Map<String, Object> map = rstring.read;
        Map<String, Object> map2 = rstring2.read;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.FlacMetadataReader.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
