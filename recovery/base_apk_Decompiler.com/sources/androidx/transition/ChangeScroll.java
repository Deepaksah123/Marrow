package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Rinteger;
import kotlin.Rstring;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeScroll extends Transition {
    private static final String[] RemoteActionCompatParcelizer = {"android:changeScroll:x", "android:changeScroll:y"};

    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Transition
    public final String[] write() {
        return RemoteActionCompatParcelizer;
    }

    private static void AudioAttributesCompatParcelizer(Rstring rstring) {
        rstring.read.put("android:changeScroll:x", Integer.valueOf(rstring.AudioAttributesCompatParcelizer.getScrollX()));
        rstring.read.put("android:changeScroll:y", Integer.valueOf(rstring.AudioAttributesCompatParcelizer.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (rstring == null || rstring2 == null) {
            return null;
        }
        View view = rstring2.AudioAttributesCompatParcelizer;
        int iIntValue = ((Integer) rstring.read.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) rstring2.read.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) rstring.read.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) rstring2.read.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return Rinteger.write(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
