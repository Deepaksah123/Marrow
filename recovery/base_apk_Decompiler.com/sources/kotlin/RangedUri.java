package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.marrow.R;
import com.marrow2.ui.LottieRatingBarBigV2;

/* JADX INFO: loaded from: classes3.dex */
public final class RangedUri implements getApplicationLabel {
    public final ImageButton AudioAttributesCompatParcelizer;
    private final CoordinatorLayout IconCompatParcelizer;
    public final LottieRatingBarBigV2 RemoteActionCompatParcelizer;
    public final CoordinatorLayout read;
    private TextView write;

    private RangedUri(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, ImageButton imageButton, LottieRatingBarBigV2 lottieRatingBarBigV2, TextView textView) {
        this.IconCompatParcelizer = coordinatorLayout;
        this.read = coordinatorLayout2;
        this.AudioAttributesCompatParcelizer = imageButton;
        this.RemoteActionCompatParcelizer = lottieRatingBarBigV2;
        this.write = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CoordinatorLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static RangedUri AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.bottomsheet_rating_feedback, viewGroup, false));
    }

    private static RangedUri IconCompatParcelizer(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = R.id.ibCancel;
        ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.ibCancel);
        if (imageButton != null) {
            i = R.id.moduleRatingBar;
            LottieRatingBarBigV2 lottieRatingBarBigV2 = (LottieRatingBarBigV2) getApplicationIcon.IconCompatParcelizer(view, R.id.moduleRatingBar);
            if (lottieRatingBarBigV2 != null) {
                i = R.id.tvFeedbackTitle;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFeedbackTitle);
                if (textView != null) {
                    return new RangedUri(coordinatorLayout, coordinatorLayout, imageButton, lottieRatingBarBigV2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
