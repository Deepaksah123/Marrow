package kotlin;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class getSampleAndTrimBuffer implements getApplicationLabel {
    private final LinearLayout RemoteActionCompatParcelizer;

    private getSampleAndTrimBuffer(LinearLayout linearLayout) {
        this.RemoteActionCompatParcelizer = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static getSampleAndTrimBuffer IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new getSampleAndTrimBuffer((LinearLayout) view);
    }
}
