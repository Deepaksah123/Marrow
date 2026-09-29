package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getTrackTypeScore implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final LottieAnimationView IconCompatParcelizer;
    private final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    private ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    private ImageView write;

    private getTrackTypeScore(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.RemoteActionCompatParcelizer = imageView;
        this.write = imageView2;
        this.IconCompatParcelizer = lottieAnimationView;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.read = textView;
        this.AudioAttributesImplBaseParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static getTrackTypeScore IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.item_type_qbank_tracker, viewGroup, false));
    }

    private static getTrackTypeScore IconCompatParcelizer(View view) {
        int i = R.id.ivGo;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivGo);
        if (imageView != null) {
            i = R.id.ivGrowth;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivGrowth);
            if (imageView2 != null) {
                i = R.id.lavLiveIndicator;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.lavLiveIndicator);
                if (lottieAnimationView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.tvMarrowthonLive;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowthonLive);
                    if (textView != null) {
                        i = R.id.tvQbankTracker;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankTracker);
                        if (textView2 != null) {
                            return new getTrackTypeScore(linearLayout, imageView, imageView2, lottieAnimationView, linearLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
