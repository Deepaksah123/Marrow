package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.marrow.R;
import com.marrow.ui.views.LottieRatingBarBig;

/* JADX INFO: loaded from: classes5.dex */
public final class isPackedAudioExtractor implements getApplicationLabel {
    public final LottieRatingBarBig AudioAttributesCompatParcelizer;
    private LinearLayout IconCompatParcelizer;
    private final CoordinatorLayout MediaBrowserCompatCustomActionResultReceiver;
    public final CoordinatorLayout RemoteActionCompatParcelizer;
    public final ImageView read;
    private TextView write;

    private isPackedAudioExtractor(CoordinatorLayout coordinatorLayout, ImageView imageView, CoordinatorLayout coordinatorLayout2, LottieRatingBarBig lottieRatingBarBig, LinearLayout linearLayout, TextView textView) {
        this.MediaBrowserCompatCustomActionResultReceiver = coordinatorLayout;
        this.read = imageView;
        this.RemoteActionCompatParcelizer = coordinatorLayout2;
        this.AudioAttributesCompatParcelizer = lottieRatingBarBig;
        this.IconCompatParcelizer = linearLayout;
        this.write = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CoordinatorLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static isPackedAudioExtractor IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_bottom_sheet, viewGroup, false));
    }

    private static isPackedAudioExtractor AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnCross;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnCross);
        if (imageView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = R.id.ratingBar;
            LottieRatingBarBig lottieRatingBarBig = (LottieRatingBarBig) getApplicationIcon.IconCompatParcelizer(view, R.id.ratingBar);
            if (lottieRatingBarBig != null) {
                i = R.id.ratingContainer;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ratingContainer);
                if (linearLayout != null) {
                    i = R.id.rating_title;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.rating_title);
                    if (textView != null) {
                        return new isPackedAudioExtractor(coordinatorLayout, imageView, coordinatorLayout, lottieRatingBarBig, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
