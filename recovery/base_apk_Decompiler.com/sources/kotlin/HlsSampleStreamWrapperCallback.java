package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperCallback implements getApplicationLabel {
    private TextView AudioAttributesCompatParcelizer;
    private LottieAnimationView IconCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private ImageView read;
    private TextView write;

    private HlsSampleStreamWrapperCallback(ConstraintLayout constraintLayout, ImageView imageView, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = imageView;
        this.IconCompatParcelizer = lottieAnimationView;
        this.AudioAttributesCompatParcelizer = textView;
        this.write = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static HlsSampleStreamWrapperCallback write(View view) {
        int i = R.id.iv_close_orientation_switch;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_close_orientation_switch);
        if (imageView != null) {
            i = R.id.lav_orientation_switch;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.lav_orientation_switch);
            if (lottieAnimationView != null) {
                i = R.id.tv_description;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_description);
                if (textView != null) {
                    i = R.id.tv_landscape_switch_cta;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_landscape_switch_cta);
                    if (textView2 != null) {
                        return new HlsSampleStreamWrapperCallback((ConstraintLayout) view, imageView, lottieAnimationView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
