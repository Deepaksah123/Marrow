package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class continuePreparing implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    private ImageView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final ConstraintLayout MediaBrowserCompatCustomActionResultReceiver;
    private View MediaBrowserCompatItemReceiver;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final LottieAnimationView write;

    private continuePreparing(ConstraintLayout constraintLayout, ImageView imageView, LottieAnimationView lottieAnimationView, ImageView imageView2, LinearLayout linearLayout, ConstraintLayout constraintLayout2, View view, TextView textView, TextView textView2, ConstraintLayout constraintLayout3) {
        this.AudioAttributesImplApi21Parcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.write = lottieAnimationView;
        this.AudioAttributesImplBaseParcelizer = imageView2;
        this.IconCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = view;
        this.read = textView;
        this.AudioAttributesImplApi26Parcelizer = textView2;
        this.MediaBrowserCompatCustomActionResultReceiver = constraintLayout3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static continuePreparing RemoteActionCompatParcelizer(View view) {
        int i = R.id.ivZenAreaBackground;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivZenAreaBackground);
        if (imageView != null) {
            i = R.id.logoAnimation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.logoAnimation);
            if (lottieAnimationView != null) {
                i = R.id.logoAnimationBackground;
                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.logoAnimationBackground);
                if (imageView2 != null) {
                    i = R.id.lyt_zen_area_content;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lyt_zen_area_content);
                    if (linearLayout != null) {
                        i = R.id.lytZenAreaCta;
                        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lytZenAreaCta);
                        if (constraintLayout != null) {
                            i = R.id.toolbarPlaceholder;
                            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.toolbarPlaceholder);
                            if (viewIconCompatParcelizer != null) {
                                i = R.id.tvPcZenTitle;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPcZenTitle);
                                if (textView != null) {
                                    i = R.id.tvZenCompletedModules;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvZenCompletedModules);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                        return new continuePreparing(constraintLayout2, imageView, lottieAnimationView, imageView2, linearLayout, constraintLayout, viewIconCompatParcelizer, textView, textView2, constraintLayout2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
