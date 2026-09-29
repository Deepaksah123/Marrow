package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        onFastForward();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onFastForward();
    }

    private void onFastForward() {
        RemoteActionCompatParcelizer(1);
        IconCompatParcelizer(new Fade(2)).IconCompatParcelizer(new ChangeBounds()).IconCompatParcelizer(new Fade(1));
    }
}
