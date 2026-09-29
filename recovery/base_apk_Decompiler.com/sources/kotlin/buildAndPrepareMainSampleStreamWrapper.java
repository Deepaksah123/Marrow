package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class buildAndPrepareMainSampleStreamWrapper implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final LottieAnimationView read;
    private Guideline write;

    private buildAndPrepareMainSampleStreamWrapper(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, LottieAnimationView lottieAnimationView, CustomTextView customTextView) {
        this.IconCompatParcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.write = guideline;
        this.read = lottieAnimationView;
        this.AudioAttributesCompatParcelizer = customTextView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static buildAndPrepareMainSampleStreamWrapper AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_thank_you_for_feedback, viewGroup, false));
    }

    private static buildAndPrepareMainSampleStreamWrapper read(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.guidelineMid;
        Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guidelineMid);
        if (guideline != null) {
            i = R.id.lavAnimView;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.lavAnimView);
            if (lottieAnimationView != null) {
                i = R.id.tvThankYou;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvThankYou);
                if (customTextView != null) {
                    return new buildAndPrepareMainSampleStreamWrapper(constraintLayout, constraintLayout, guideline, lottieAnimationView, customTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
